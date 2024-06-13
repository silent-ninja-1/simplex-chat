---
title: Privacy & security
---

# Privacy and Security

SimpleX Chat's default configuration aims to balance privacy, security and convenience. You may want to change the default options to suit your needs. This page lists all the features and options that affect privacy and security. Click or tap on the following sections to learn more:

- [Privacy and security settings](#privacy-and-security-settings)
- [Security code verification](#security-code-verification)
- [Database passphrase](#database-passphrase)
- [Incognito mode](#incognito-mode)
- [Hidden profiles](#hidden-profiles)
- [Network settings](#network-settings)

## Privacy and security settings

These settings are available in the app settings menu. 

### SimpleX Lock

This setting affects the ability to use SimpleX Lock - it's disabled by default. Depending on what type of lock mode you choose when you choose to enable it, this feature will provide either device-level authentication or app-level authentication for the app. SimpleX Lock prompts you to confirm your device credentials (PIN, face, fingerprint, or pattern) or a passcode when you open the app, resume the app after a set amount of inactivity expires, or to use some security- or privacy-sensitive features. 

#### To enable it:

1. [Open the app settings menu](./app-settings.md#opening-the-app-settings-menu).

2. Click or tap on **Privacy & security**.

3. Click or tap **SimpleX Lock**

4. From the **Lock mode** dropdown, choose one of the following options:
   
   - System
   
   - Passcode

5. Toggle **Enable lock** on. If you've set **Lock mode** to `System`, then you'll be prompted to confirm your device credentials. If you've set **Lock mode** to `Passcode`, then you'll be prompted to create a SimpleX Lock passcode.

6. From the **Lock after** dropdown, choose one of the following options:
   
   - `10 seconds`
   
   - `30 seconds`
   
   - `1 minute`
   
   - `3 minutes`
   
   - `10 minutes`
   
   - `Immediately`

#### To disable it:

1. [Open the app settings menu](#opening-the-app-settings-menu).
2. Click or tap on **Privacy & security**.
3. Click or tap **SimpleX Lock**
4. Toggle **Enable lock** off.
5. Confirm your device credentials or SimpleX Lock passcode.

### Self-destruct passcode

This feature comes in handy when you're in distress and don't want to leave any trace of using SimpleX Chat on your device. 

#### To set a self-destruct passcode:

1. [Open the app settings menu](#opening-the-app-settings-menu).
2. Click or tap on **Privacy & security**.
3. If using a mobile device, change lock mode from **System** to **Passcode**.
4. Toggle **SimpleX Lock** on, if disabled.
5. Create your SimpleX Lock passcode.
6. Toggle **Enable self-destruct** on.
7. (Optional) Enter a display name.
8. Confirm your SimpleX Lock passcode.
9. Create a self-destruct passcode.
10. Confirm your self-destruct passcode.

Now that you've set a self-destruct passcode. You can enter it at any time when the app prompts you to enter a passcode. When you do, all of your SimpleX Chat data will be wiped from your device and be replaced by a new empty chat profile with your chosen display name or a randomized name if you left it blank.

### Protect app screen (Mobile apps only)

<img src="../../blog/images/20221206-protect.png" width="288">

This setting affects the ability to hide the app's screen in the recent apps list - it's enabled by default. It also prevents screenshots on Android.

### Send Link Previews

This setting affects the ability to send link previews to your contacts and groups - it's disabled by default. 

**Please note**: enabling link previews may reduce privacy, as the app will load the link preview from the website.

### Show Last Messages

This setting affects the visibility of your last messages on the **Chats** screen - it's enabled by default. If you want to protect this information from someone looking over your shoulder, for example, you can simply disable it.

### Message Draft

This setting affects the ability to draft a message - it's enabled by default. However, you can only have one message draft at a time. This will last until you either:

- Compose another message draft to send to another contact or group.

- Close the app.

- Toggle the setting off.

### SimpleX Links

This setting affects how SimpleX links used to connect with other SimpleX users or to join groups are displayed in the UI. You can choose between:

- `description (default)` - Only the link description and server host name are shown. The link won't be opened in the browser, however.
- `full link` - The full link is shown. The link will still not be opened in the browser, however.

### Encrypt Local Files

This setting affects encryption at rest for locally stored files and media on your device - it's toggled on by default. You can toggle it off, if you need to access the files from outside of the app, for example. 

### Auto-Accept Images

This setting affects how images are received from your contacts and groups - it's toggled on by default. However, auto-accepting images may reduce privacy because your contacts will know that you are online.

### Protect IP Address

This setting affects the privacy of your IP address when downloading files and media from unknown file servers - it's toggled on by default. If you have this option toggled off, and you don't use Tor or a VPN, then your IP address will be exposed to unknown file servers.

### Send Delivery Receipts To Contacts and Small Groups (max 20 members)

These settings affect the ability to send delivery receipts to contacts and small groups with a maximum number of 20 members. Both are toggled on by default.

**Please note**: These settings are applied on a per-chat-profile basis. They can be overridden in contact and group preferences. 

## Security Code Verification

<img src="../../blog/images/20230103-verification.png" width="288">

Although SimpleX Chat always establishes connections via a link passed via an independent channel, so it is already more protected than other apps, there are scenarios when one-time invitation links can be substituted in transit as part of a man-in-the-middle (MITM) attack. To protect against such attacks, you should verify the security of your connections with your contacts. 

#### To verify security code:

1. Click or tap on your contact. 
2. Click or tap on your contact's name at the top of the screen.
3. Click or tap **Verify security code**. 
4. Ask your contact to perform the first three steps. 

You and your contact should now see the security code on your screens. This can be verified by one of the following methods:

- `Scan code` - Scan each other's security code in person. If the codes match, then your contact will be marked verified on your device.
- `Mark verified` - Click or tap this button if you trust the confirmation from your contact that the code is verified.

For more details on security code verification, please read [this blog post](../../blog/20230103-simplex-chat-v4.4-disappearing-messages.md#connection-security-verification).

## Database passphrase

On mobile, SimpleX Chat generates a random passphrase by default and stores it securely in KeyChain (iOS) or using KeyStore (Android, TPM module is used when available) after creating your first chat profile. You can set your own passphrase and also remove it from the device via the [Database passphrase & export](./managing-data.md#database-passphrase) settings. On desktop, SimpleX Chat gives you the option to either generate a random passphrase or set a new passphrase before creating your first chat profile. 

**Please note**: removing your passphrase will prompt you to enter it every time you start the app and this may impact receiving notifications.

## Incognito mode

This feature generates an incognito profile with a random namd and empty profile for each new contact. For more details, please visit [Incognito mode](./chat-profiles.md#incognito-mode).

## Hidden profiles

This feature allows you to hide some of your chat profiles with a password. For more details, please visit [Hiding chat profiles](./chat-profiles.md#hiding-chat-profiles).

## Network settings

### Transport isolation (BETA)

[Transport isolation](./app-settings.md#transport-isolation-beta) allows you to isolate your network traffic by using a different TCP connection and Tor circuit for each contact and group member, or for each chat profile in the app. 



### Using Tor

<img src="../../blog/images/20220808-tor1.png" width="330">&nbsp;<img src="../../blog/images/20220808-tor2.png" width="330">

To connect to SMP relays (messaging servers) and XFTP relays (file servers) via Tor you need to install Orbot app.

**Android**: use Orbot app as SOCKS proxy on port 9050 (default) and enable [Use SOCKS proxy](./app-settings.md#use-socks-proxy-android-only).

**iOS**: use Orbot app as VPN provider and enable VPN.

You can also change which server addresses are used with [Use .onion hosts option](./app-settings.md#use-onion-hosts).

### Private Message Routing

SimpleX Chat offers IP address protection for users who need it. It's enabled when your IP address is unprotected while connecting to unknown servers by default. For more technical details on how private message routing works, please read [this blog post](https://simplex.chat/blog/20240604-simplex-chat-v5.8-private-message-routing-chat-themes.html#private-message-routing).

#### To configure private routing:

1. [Open the app settings menu](./app-settings.md#opening-the-app-settings-menu).

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
