---
title: App settings
---

# App settings

All of the app settings can be found here. Click or tap on the following sections to learn more:

- [Opening the app settings menu](#opening-the-app-settings-menu)
- [You](#you)
- [Settings](#settings)
- [Help](#help)
- [Support SimpleX Chat](#support-simplex-chat)
- [App](#app)

## Opening the app settings menu

#### To open the app settings menu:

1. Open the app.
2. Tap on your profile picture in the top-left corner of the **Chats** screen. If you have more than one chat profile, tap **Settings**.

## You

Here you can make edits to your active chat profile, manage your chat profiles, manage your SimpleX address, set your default chat preferences for all your contacts, link your mobile device to your PC and migrate your SimpleX Chat data to a new device. 

### Your active chat profile

#### To edit your active chat profile:

1. [Open the app settings menu](#opening-the-app-settings-menu).

2. Tap on your avatar/name. 

3. Options:
   
   - Choose a new name.
   
   - Choose a new profile picture. 

4. Tap **Save and notify contacts**. 

**Please note**: Profile names cannot have any spaces. It is recommended to use Latin characters and numbers to make it easier for users who use [SimpleX Chat for the terminal](../CLI.md) (CLI) to type them. Also, when you save edits to your chat profile, they will be sent to all your contacts (excluding those you've shared your incognito profiles with). If you have a large number of contacts, this process can take several seconds to complete.

### Your chat profiles

<img src="../../blog/images/20230204-profiles2.png" width="288">

For more details on how to manage your chat profiles, please visit [this page](./chat-profiles.md).

### Your SimpleX address

<img src="../../blog/images/20221108-address1.png" width="288"> &nbsp;&nbsp; <img src="../../blog/images/20221108-address2.png" width="288">

This screen allows you to create a SimpleX address that can be used by other people to connect with you. For more details on what a SimpleX address is, how you can set it up and what it can be used for, please visit [this page](./making-connections.md#simplex-address).

**Please note**: you can only create one SimpleX address per chat profile. 

### Chat preferences

This screen allows you to configure your default set of chat preferences for all your contacts. 

#### To configure your default set of chat preferences:

1. [Open the app settings menu](./app-settings.md#opening-the-app-settings-menu).

2. Tap **Chat preferences**.

3. Options:
   
   - Toggle **Disappearing messages** on to allow sending dissapearing messages, as long as your contacts allow them.  
   
   - Toggle **Delete for everyone** on to allow irreversible message deletion (messages are marked as deleted by default).
   
   - Toggle **Message reactions** on to allow reacting to messages with emojis.
   
   - Toggle **Voice messages** on to allow sending voice messages.
   
   - Toggle **Audio/video calls** on to allow making audio and video calls.

4. Tap **Save and notify contacts**.

### Use from desktop (or Link a mobile on desktop app)

This screen allows you to link your mobile device to your desktop, so that you can continue conversing with your contacts and groups on there. 

#### Prerequisite(s):

- Both your mobile device and desktop must be on the same network. For example, if your mobile device is connected to Wi-Fi and your desktop is connected to Ethernet, then they won't link up. 

#### To link your mobile device to your desktop:

1. Download and install the [SimpleX Chat desktop app](https://simplex.chat/downloads/#desktop-app), if you haven't already. 

2. Open SimpleX Chat on your desktop. 

3. If you don't have any chat profiles setup on the desktop app, click **Link a mobile**. 

4. Options:
   
   - Set a new database passphrase.
   
   - Use a randomly generated passphrase.  

5. Set **This Device Name** to whatever you want.

6. On your mobile device, [open the app settings menu](./app-settings.md#opening-the-app-settings-menu).

7. Tap **Use from desktop**. 

8. Scan the QR code on your desktop.  

### Migrate to another device

This screen allows you to migrate your SimpleX Chat data from your old device to your new device. 

#### To migrate your SimpleX Chat data from your old device to your new device:

1. [Open the app settings menu](./app-settings.md#opening-the-app-settings-menu) on your old device.

2. Tap **Migrate to another device**. 

3. Enter your database passphrase. Otherwise, you'll be prompted to set one if you haven't already.

4. Tap **Archive and upload**. An archive link and QR code will be generated. 

5. Download and install SimpleX Chat on your new device. Open it and then tap **Migrate from another device**. You have two options to start the migration process:
   
   - Scan the QR code on the old device.
   
   - Share the archive link from the old device and then paste it into the new device. 

6. Once the migration is complete, tap **Finalize migration** on the old device and your data will be wiped from there. 

## Settings

Here you can configure notifications, your network settings and servers (including SMP servers, XFTP servers and WebRTC ICE servers), audio and video calls, privacy & security settings, the app's appearance and manage your SimpleX Chat data.

### Notifications

This screen allows you to configure notifications and notification previews. For more details on how notifications work in Android versus iOS, please read [this blog post](../../blog/20220404-simplex-chat-instant-notifications.md).

#### To configure notifications on Android:

1. [Open the app settings menu](#opening-the-app-settings-menu).
2. Tap **Notifications**.
3. Tap **Notification service**. 
4. Choose from the following options:
   - `Runs when app is open` - The app will receive notifications only when it's running.
   - `starts periodically` - The app will periodically check for new notifications every 10 minutes for up to 1 minute.
   - `always on` - The app will always check for new notifications, even when it's closed. 

**Please note**: For instant and periodic notifications to work on Android, you need to disable power optimization when prompted by the app, or later via the app settings. Also, some variants of Android require additional settings to be configured. For example, MIUI on Xiaomi phones require you to enable "Auto start" for the notification service to work. Please read the [Don't kill my app](https://dontkillmyapp.com/) guide for any additional settings that may be required on your device. Also, instant notifications have the highest battery consumption - we are working to reduce it to be less or the same as for periodic notifications.

#### To configure notifications on iOS:

1. [Open the app settings menu](#opening-the-app-settings-menu).
2. Tap **Notifications**.
3. Tap **Send notifications**.
4. Choose from the following options:
   - `Instantly (Recommended)` - device token and notifications are sent to SimpleX Chat's notification server, but not the message content, size or who it is from. 
   - `Periodically (More private)` - check new messages every 20 minutes. Device token is shared with SimpleX Chat server, but not how many contacts or messages you have. 
   - `Local (Most private)` - do not use SimpleX chat notifications server, check messages periodically in the background (depends on how often you use the app). 

#### To configure notification preview:

1. [Open the app settings menu](#opening-the-app-settings-menu). 
2. Tap **Notifications**. 
3. Tap **Show preview**.
4. Choose from the following options:
   - `message text` - show contact name and message.
   - `contact name` - show only contact name.
   - `hidden` - hide both contact name and message.

### Network & servers

<img src="../../blog/images/20230204-transport.png" width="288">

Here you can configure your own self-hosted SMP relays and change other network settings.

#### SMP servers

<img src="../../blog/images/20221206-server1.png" width="288"> &nbsp;&nbsp; <img src="../../blog/images/20221206-server2.png" width="288"> &nbsp;&nbsp; <img src="../../blog/images/20221206-server3.png" width="288">

By default, the app has preset relays configured – you can change them to your own. You can also test your connection to your configured servers. For more details, please read [this blog post](../../blog/20221206-simplex-chat-v4.3-voice-messages.md#smp-servers-configuration-and-password).

#### XFTP Servers

By default, the app has preset relays configured – you can change them to your own. You can also test your connection to your configured servers.

#### Use SOCKS proxy (Android and Desktop only)

This option allows the app to connect via a SOCKS proxy that should be provided by some other app running on your device. The most typical use case for this is to run Orbot app that provides a SOCKS proxy to connect via Tor network, but it can be some other app that can proxy connections via some other overlay network.

#### Use .onion hosts

##### Android

**Use .onion hosts** option is only available when **Use SOCKS proxy** is enabled. You can choose:

- `no` - choose this option if your SOCKS proxy does not connect via Tor network.
- `when available (default)` - when SOCKS proxy is enabled, the app assumes that it provides connections via Tor network and use .onion host addresses when SMP relays include them in their configuration.
- `required` - Choose this option if your SOCKS proxy connects via Tor network and you want to avoid connections without Tor. In this case, if the SMP relay address does not include .onion host, the connection will fail.

##### iOS

<img src="../../blog/images/20220901-onion1.png" width="330"> &nbsp; <img src="../../blog/images/20220901-onion2.png" width="330">

While iOS does not support SOCKS proxies, you can install Orbot app that works as VPN provider. You can choose:

- `no (default)` -  choose this option if you do not use Orbot or if you use VPN that proxies connections via some other overlay network.
- `when available` - use .onion host addresses when SMP relays include them in their configuration. Orbot VPN must be enabled for this option to work.
- `required` - Choose this option if you use Orbot VPN and you want to avoid connections without Tor. In this case, if the SMP relay address does not include .onion host, the connection will fail. If you use this option, you can enable "Disable Orbot for non-onion traffic" option in Orbot settings making the rest of your device traffic to not use Tor.

**Please note**: VPN on iOS can send some traffic to the usual network, if, for example, VPN app crashes. You can configure enable always-on VPN mode on managed iOS devices, but this is not applicable to most individual devices.

#### Transport isolation (BETA)

**Please note**: This option is only available if you have toggled **Developer tools** on. For more details, please read [this blog post](../../blog/20230204-simplex-chat-v4-5-user-chat-profiles.md#transport-isolation).

#### Advanced network settings

<img src="../../blog/images/20220808-network.png" width="330">

If your network is slow, and your connections to the servers keep failing (you would see a spinner on your contacts), please increase TCP and protocol timeouts on this screen.

#### Private Routing

SimpleX Chat offers IP address protection for users who need it. It's enabled when your IP address is unprotected while connecting to unknown servers by default. For more technical details on how private routing works, please read [this blog post](https://simplex.chat/blog/20240604-simplex-chat-v5.8-private-message-routing-chat-themes.html#private-message-routing).

##### To configure private routing:

1. [Open the app settings menu](#opening-the-app-settings-menu).

2. Tap **Network and servers**. 

3. From the **Private routing** dropdown, choose one of the following options:
   
   - `always` - Always use private routing. 
   
   - `unknown relays` - Use private routing with unknown servers. 
   
   - `unprotected (default)` - Use private routing with unknown servers when IP address is not protected.
   
   - `never` - Do not use private routing. 

4. From the **Allow downgrade** dropdown, choose one of the following options:
   
   - `Yes (default)` - Send messages directly when your or destination server does not support private routing. 
   
   - `When IP hidden` - Send messages directly when IP address is protected and your or destination server does not support private routing. 
   
   - `No` - Do NOT send messages directly, even if your or destination server does not support private routing. 

5. (Optional) Toggle **Show message status** on to show that your messages have been privately routed. 

### Audio & video calls

Here you can configure WebRTC servers for your audio/video calls, lock screen notifications for calls and the option to use a relay to protect your IP address. 

### Privacy and security

Here you can configure all the privacy and security settings available in SimpleX Chat to suit your particular needs. 

#### SimpleX Lock

Depending on what type of lock mode you choose, this feature will provide either device-level authentication or a passcode for the app. When toggled on, SimpleX Lock prompts you to confirm your device credentials (passcode, face, fingerprint, or pattern) or a passcode, when you open the app, resume the app after a set amount of time expires, or to use some security- or privacy-sensitive features. You will be offered to enable it after you open the app a few times.

##### To configure and enable SimpleX Lock:

1. [Open the app settings menu](#opening-the-app-settings-menu).

2. Tap on **Privacy & security**.

3. Tap **SimpleX Lock**

4. From the **Lock mode** dropdown, choose one of the following options:
   
   - System
   
   - Passcode

5. Toggle **Enable lock** on. If you've set **Lock mode** to `System`, then you'll be prompted to confirm your device credentials. If you've set **Lock mode** to `Passcode`, then you'll be prompted to create a SimpleX Lock passcode. 

6. From the **Lock after** dropdown, choose from the following options:
   
   - `10 seconds`
   
   - `30 seconds`
   
   - `1 minute`
   
   - `3 minutes`
   
   - `10 minutes`
   
   - `Immediately`

##### To disable SimpleX Lock:

1. [Open the app settings menu](#opening-the-app-settings-menu).
2. Tap on **Privacy & security**.
3. Tap **SimpleX Lock**
4. Toggle **Enable lock** off.
5. Confirm your device credentials or passcode. 

#### Self-destruct passcode

This option comes in handy when you don't want to leave any trace of using SimpleX Chat on your device. To configure a self-destruct passcode:

1. [Open the app settings menu](#opening-the-app-settings-menu).
2. Tap on **Privacy & security**.
3. If using mobile app, change lock mode from **System** to **Passcode**.
4. Toggle **SimpleX Lock** on, if disabled. 
5. Create your SimpleX Lock passcode.
6. Toggle **Enable self-destruct** on. 
7. (Optional) Enter a display name. 
8. Confirm your SimpleX Lock passcode. 
9. Create a self-destruct passcode. 

Now that you've configured a self-destruct passcode. You can enter it at any time when the app prompts you to enter a passcode. When you do, all of your SimpleX Chat data will be wiped from your device and be replaced by a new empty chat profile with your chosen display name or a randomized name if you left it blank. 

#### Protect app screen (Mobile apps only)

<img src="../../blog/images/20221206-protect.png" width="330">

This option hides the app's screen in the recent apps list - it's enabled by default. It also prevents screenshots on Android.

#### Send Link Previews

This option allows you to send link previews - it's toggled off by default. To draft it:

1. [Open the app settings menu](#opening-the-app-settings-menu).
2. Tap **Privacy & security**.
3. Toggle **Send link previews** on.

**Please note**: enabling link previews may reduce privacy, as the app will load the link preview from the website. 

#### Show last messages

This option affects the visibility of your latest received messages on the **Chats** screen - it's toggled on by default. If you want to protect this information from someone looking over your shoulder, for example, you can simply toggle it off. 

#### Message draft

This option affects the ability to draft a message - it's toggled on by default. However, you can only have one message draft at a time. This will last until you either:

- Compose another message draft to send to another contact or group. 

- Close the app. 

- Toggle the option off. 

#### SimpleX Links

This option affects how SimpleX links used to connect with other SimpleX users or to join groups are displayed in the UI. You can choose between:

- `description (default)` - Only the link description and server host name are shown. The link won't be opened in the browser, however.
- `full link` - The full link is shown. The link will still not be opened in the browser, however.

#### Encrypt local files

This option affects encryption at rest for locally stored files and media on your device - it's toggled on by default. You can toggle it off, if you need to access the files from outside of the app. 

#### Auto Accept Images

This option affects how images are received from your contacts and groups - it's toggled on by default. However, auto-accepting images may reduce privacy because your contacts will know that you are online.

#### Protect IP address

This option affects the privacy of your IP address when downloading files and media from unknown file servers - it's toggled on by default. If you have this option toggled off, and you don't use Tor or a VPN, then your IP address will be exposed to unknown file servers. 

#### Delivery Receipts

These options affect the ability to send delivery receipts to contacts and small groups with a maximum number of 20 members. Both are toggled on by default. 

### Appearance

Here you can change the app language, customize the app theme, profile image shapes, and app icon. 

### Database passphrase & export

Here you can change the app's database passphrase, export and import the database, and configure the message retention period. Please visit the [Managing Data](./managing-data.md) page for more details.

## Help

This section provides information on how to use the app, the latest release notes and the links to connect with the SimpleX Chat team. Please tap [Send questions and ideas](https://simplex.chat/contact#/?v=1&smp=smp%3A%2F%2FPQUV2eL0t7OStZOoAsPEV2QYWt4-xilbakvGUGOItUo%3D%40smp6.simplex.im%2FK1rslx-m5bpXVIdMZg9NLUZ_8JBm8xTt%23%2F%3Fv%3D1%26dh%3DMCowBQYDK2VuAyEALDeVe-sG8mRY22LsXlPgiwTNs9dbiLrNuA7f3ZMAJ2w%253D%26srv%3Dbylepyau3ty4czmn77q4fglvperknl4bi2eb2fdy2bh4jxtf32kf73yd.onion) to connect with us via the chat to ask any questions, make any suggestions and report any issues.

## Support SimpleX Chat

This section has information on how to support the project. You can:

- `contribute` - the link to the information about how to contribute and to donate to the project.
- `rate the app` - rate and review it on the App Store or Play Store - your feedback helps a lot.
- `star on GitHub` - this also helps us grow.

Thank you for your support!

## App

This section is labelled **"App"** in the app settings menu. On Android, you have the Restart and Shutdown buttons. 

## Developer tools

This screen has options that are only needed for app developers and can be used to debug the app in case something is not working.

### Chat console

Here you can see and use console commands with the chat core. None of this information is sent over the network; this is an internal communication between different parts of the app.

**WARNING:** some of the console commands can stop the app from functioning; only use them if you know what you are doing or were instructed by the team.

**Please note**: The chat console can contain what looks like errors. Unless you experience any issues in the app's UI, these "errors" should not be considered a sign of app malfunction - they are likely to be normal and expected behavior.

### Show developer options

This option affects the visiblity of developer options in the UI.  currently enables [Transport isolation mode](#transport-isolation-beta) option and also enables showing database IDs in contacts, groups and group members to simplify debugging via console commands.

#### Confirm database upgrades

This option affects the ability to confirm database upgrades - it is toggled off by default. The app's database is migrated to the new version without any confirmations. Starting from v4.6.2, these migrations are reversible - you can rollback to the previous version(s) of the app (not earlier than v4.6.1). If you want to be asked a confirmation every time the app's database is upgraded, you may enable this option - this is not recommended, as it happens almost on every app update, and should not cause any concerns.

#### Show internal errors

This option affects the visibility of internal errors - it is toggled off by default. 

#### Show slow API calls

This option affects the visibility of slow API calls - it is toggled off by default. 
