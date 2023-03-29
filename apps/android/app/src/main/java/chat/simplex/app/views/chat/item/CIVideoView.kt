package chat.simplex.app.views.chat.item

import android.graphics.Bitmap
import android.graphics.Rect
import android.net.Uri
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.*
import androidx.compose.ui.platform.*
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.*
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.FileProvider
import androidx.core.graphics.drawable.toDrawable
import chat.simplex.app.*
import chat.simplex.app.R
import chat.simplex.app.model.*
import chat.simplex.app.ui.theme.*
import chat.simplex.app.views.helpers.*
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout.RESIZE_MODE_FIXED_WIDTH
import com.google.android.exoplayer2.ui.StyledPlayerView
import java.io.File

@Composable
fun CIVideoView(
  image: String,
  duration: Int,
  file: CIFile?,
  imageProvider: () -> ImageGalleryProvider,
  showMenu: MutableState<Boolean>,
  receiveFile: (Long) -> Unit
) {
  Box(
    Modifier.layoutId(CHAT_IMAGE_LAYOUT_ID),
    contentAlignment = Alignment.TopEnd
  ) {
    val context = LocalContext.current
    val filePath = remember(file) { getLoadedFilePath(SimplexApp.context, file) }
    val preview = remember(image) { base64ToBitmap(image) }
    if (filePath != null) {
      val uri = remember(filePath) { FileProvider.getUriForFile(context, "${BuildConfig.APPLICATION_ID}.provider", File(filePath))  }
      val view = LocalView.current
      VideoView(uri, preview, duration * 1000L, showMenu, onClick = {
        hideKeyboard(view)
        ModalManager.shared.showCustomModal(animated = false) { close ->
          ImageFullScreenView(imageProvider, close)
        }
      })
    } else {
      Box {
        ImageView(preview, showMenu, onClick = {
          if (file != null) {
            when (file.fileStatus) {
              CIFileStatus.RcvInvitation ->
                receiveFileIfValidSize(file, receiveFile)
              CIFileStatus.RcvAccepted ->
                when (file.fileProtocol) {
                  FileProtocol.XFTP ->
                    AlertManager.shared.showAlertMsg(
                      generalGetString(R.string.waiting_for_video),
                      generalGetString(R.string.video_will_be_received_when_contact_completes_uploading)
                    )

                  FileProtocol.SMP ->
                    AlertManager.shared.showAlertMsg(
                      generalGetString(R.string.waiting_for_video),
                      generalGetString(R.string.video_will_be_received_when_contact_is_online)
                    )
                }
              CIFileStatus.RcvTransfer(rcvProgress = 7, rcvTotal = 10) -> {} // ?
              CIFileStatus.RcvComplete -> {} // ?
              CIFileStatus.RcvCancelled -> {} // TODO
              else -> {}
            }
          }
        })
        if (file?.fileStatus is CIFileStatus.RcvInvitation) {
          PlayButton(error = false, { showMenu.value = true }) { receiveFileIfValidSize(file, receiveFile) }
        }
      }
    }
    loadingIndicator(file)
  }
}

@Composable
private fun VideoView(uri: Uri, defaultPreview: Bitmap, defaultDuration: Long, showMenu: MutableState<Boolean>, onClick: () -> Unit) {
  val context = LocalContext.current
  val player = remember(uri) { VideoPlayer.getOrCreate(uri, false, defaultPreview, defaultDuration, true, context) }
  val videoPlaying = remember(uri.path) { player.videoPlaying }
  val progress = remember(uri.path) { player.progress }
  val duration = remember(uri.path) { player.duration }
  val preview by remember { player.preview }
//  val soundEnabled by rememberSaveable(uri.path) { player.soundEnabled }
  val brokenVideo by rememberSaveable(uri.path) { player.brokenVideo }
  val play = {
    player.enableSound(true)
    player.play(true)
  }
  val stop = {
    player.enableSound(false)
    player.stop()
  }
  val showPreview = remember { derivedStateOf { !videoPlaying.value || progress.value == 0L } }
  DisposableEffect(Unit) {
    onDispose {
      stop()
    }
  }
  Box {
    val windowWidth = LocalWindowWidth()
    val width = remember(preview) { if (preview.width * 0.97 <= preview.height) videoViewFullWidth(windowWidth) * 0.75f else 1000.dp }
    val height = remember(preview) { width / (preview.width.toFloat() / preview.height) }
    AndroidView(
      factory = { ctx ->
        StyledPlayerView(ctx).apply {
          useController = false
          resizeMode = RESIZE_MODE_FIXED_WIDTH
          background = preview.toDrawable(ctx.resources)
          this.player = player.player
        }
      },
      Modifier
        .width(width)
        .height(height)
        .combinedClickable(
          onLongClick = { showMenu.value = true },
          onClick = { if (player.player.playWhenReady) stop() else onClick() }
        )
    )
    if (showPreview.value) {
      ImageView(preview, showMenu, onClick)
      PlayButton(brokenVideo, onLongClick =  { showMenu.value = true }, play)
    }
    DurationProgress(duration, progress/*, soundEnabled*/)
  }
}

@Composable
private fun BoxScope.PlayButton(error: Boolean = false, onLongClick: () -> Unit, onClick: () -> Unit) {
  Surface(
    Modifier.align(Alignment.Center),
    color = Color.White,
    shape = RoundedCornerShape(percent = 50)
  ) {
    Box(
      Modifier
        .defaultMinSize(minWidth = 56.dp, minHeight = 56.dp)
        .combinedClickable(onClick = onClick, onLongClick = onLongClick),
      contentAlignment = Alignment.Center
    ) {
      Icon(
        imageVector = Icons.Filled.PlayArrow,
        contentDescription = null,
        Modifier.size(36.dp),
        tint = if (error) WarningOrange else MaterialTheme.colors.primary
      )
    }
  }
}

@Composable
private fun DurationProgress(duration: MutableState<Long>, progress: MutableState<Long>/*, soundEnabled: MutableState<Boolean>*/) {
  if (duration.value > 0L || progress.value > 0) {
    Row(Modifier
      .padding(DEFAULT_PADDING_HALF)
      .background(Color.Black.copy(alpha = 0.4f), MaterialTheme.shapes.small)
      .padding(vertical = 2.dp, horizontal = 4.dp),
      verticalAlignment = Alignment.CenterVertically
    ) {
      val time = (if (progress.value > 0) durationText((progress.value / 1000).toInt()) else durationText((duration.value / 1000).toInt()))
      val sp30 = with(LocalDensity.current){ 30.sp.toDp()}
      val sp45 = with(LocalDensity.current){ 45.sp.toDp()}
      Text(
        time,
        Modifier.widthIn(min = if (time.length <= 5) sp30 else sp45),
        fontSize = 10.sp,
        color = Color.White
      )
      /*if (!soundEnabled.value) {
        Icon(Icons.Outlined.VolumeOff, null,
          Modifier.padding(start = 5.dp).size(10.dp),
          tint = Color.White
        )
      }*/
    }
  }
}

@Composable
private fun ImageView(preview: Bitmap, showMenu: MutableState<Boolean>, onClick: () -> Unit) {
  val windowWidth = LocalWindowWidth()
  val width = remember(preview) { if (preview.width * 0.97 <= preview.height) videoViewFullWidth(windowWidth) * 0.75f else 1000.dp }
  val height = remember(preview) { width / (preview.width.toFloat() / preview.height) }
  Image(
    preview.asImageBitmap(),
    contentDescription = stringResource(R.string.video_descr),
    modifier = Modifier
      .width(width)
      .height(height)
      .combinedClickable(
        onLongClick = { showMenu.value = true },
        onClick = onClick
      ),
    contentScale = ContentScale.FillWidth,
  )
}

@Composable
private fun LocalWindowWidth(): Dp {
  val view = LocalView.current
  val density = LocalDensity.current.density
  return remember {
    val rect = Rect()
    view.getWindowVisibleDisplayFrame(rect)
    (rect.width() / density).dp
  }
}

@Composable
private fun progressIndicator() {
  CircularProgressIndicator(
    Modifier.size(16.dp),
    color = Color.White,
    strokeWidth = 2.dp
  )
}

@Composable
private fun loadingIndicator(file: CIFile?) {
  if (file != null) {
    Box(
      Modifier
        .padding(8.dp)
        .size(20.dp),
      contentAlignment = Alignment.Center
    ) {
      when (file.fileStatus) {
        is CIFileStatus.SndStored ->
          when (file.fileProtocol) {
            FileProtocol.XFTP -> progressIndicator()
            FileProtocol.SMP -> {}
          }
        is CIFileStatus.SndTransfer ->
          progressIndicator()
        is CIFileStatus.SndComplete ->
          Icon(
            Icons.Filled.Check,
            stringResource(R.string.icon_descr_video_snd_complete),
            Modifier.fillMaxSize(),
            tint = Color.White
          )
        is CIFileStatus.RcvAccepted ->
          Icon(
            Icons.Outlined.MoreHoriz,
            stringResource(R.string.icon_descr_waiting_for_video),
            Modifier.fillMaxSize(),
            tint = Color.White
          )
        is CIFileStatus.RcvTransfer ->
          progressIndicator()
        is CIFileStatus.RcvInvitation ->
          Icon(
            Icons.Outlined.ArrowDownward,
            stringResource(R.string.icon_descr_video_asked_to_receive),
            Modifier.fillMaxSize(),
            tint = Color.White
          )
        else -> {}
      }
    }
  }
}

private fun fileSizeValid(file: CIFile?): Boolean {
  if (file != null) {
    return file.fileSize <= getMaxFileSize(file.fileProtocol)
  }
  return false
}

private fun receiveFileIfValidSize(file: CIFile, receiveFile: (Long) -> Unit) {
  if (fileSizeValid(file)) {
    receiveFile(file.fileId)
  } else {
    AlertManager.shared.showAlertMsg(
      generalGetString(R.string.large_file),
      String.format(generalGetString(R.string.contact_sent_large_file), formatBytes(getMaxFileSize(file.fileProtocol)))
    )
  }
}

private fun videoViewFullWidth(windowWidth: Dp): Dp {
  val approximatePadding = 100.dp
  return minOf(1000.dp, windowWidth - approximatePadding)
}
