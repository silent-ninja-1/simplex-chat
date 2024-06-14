---
title: Managing data

---

# Managing Your Data

SimpleX Chat stores all your data on your device; it is not stored on SimpleX servers or anywhere else. Click or tap on the following sections to learn more:

- [Automatic message deletion](#automatic-message-deletion)

- [Chat database](#chat-database)

## Automatic message deletion

Here you can choose to delete messages from your local chat database after a set period of time.

**Please note**: This option does not delete messages for other users, only for you. This option is set independently for each chat profile.

## Chat Database

To open your chat database settings:

1. [Open the app settings menu](./app-settings.md#opening-the-app-settings-menu).

2. Tap or click **Database passphrase & export**.

### Database passphrase

<img src="../../blog/images/20220928-passphrase.png" width="330">

By default, database passphrase is random, you have to set it manually to be able to export it.

### Export database

You can export the chat database to a zipped archive.

#### To export your chat database:

1. [Open the app settings menu](./app-settings.md#opening-the-app-settings-menu).
2. Tap **Database passphrase & export**.
3. Toggle **Chat is running** off to stop SimpleX Chat from running.
4. Tap or click **Stop** in the confirmation dialog.
5. Confirm it with a fingerprint or PIN, in case you have [SimpleX Lock](./app-settings.md#simplex-lock) toggled on.
6. If you didn't set it before, [set a passphrase](./managing-data.md#database-passphrase) in "Database passphrase". Initially, the database is encrypted with a random passphrase that is stored in KeyChain (iOS) or with KeyStore (Android).
7. Tap or click **Export database** - it won't allow exporting unless you have set a passphrase.
8. Save the file on your device or share it via any available option.

### Import database

Here you can import the chat database from a zipped archive.

#### To import your chat database:

1. [Open app settings](./app-settings.md#opening-app-settings).
2. Click or tap **Database passphrase & export**.
3. Toggle **Chat is running** off to stop chat.
4. Click or tap **Stop** in the confirmation dialog.
5. Click or tap **Import database**.
6. Select the .zip file containing your exported SimpleX Chat data.
7. Click or tap **Import** in the confirmation dialog.
8. Toggle **Chat is running** on to start the chat or close and restart the app – you will be prompted to enter the passphrase for your chat database.

### Delete database

Here you can delete your chat database. WARNING: Results in a loss of all your SimpleX Chat data! Unless you have just exported the chat database.

#### To delete your database:

## Delete files and media

<img src="../../blog/images/20220928-files-media.png" width="330">

You can delete all sent and received files and media stored in the app via this option, without deleting the messages.

Migrating your chat profiles to another device

SimpleX Chat stores all your data locally on your device, using a portable encrypted database format that can be exported and migrated to any supported device.

#### To export your SimpleX Chat data from your old device:

1. [Open the app settings menu](./app-settings.md#opening-the-app-settings-menu).
2. Under the **"Settings"** section, tap **Database passphrase & export**.
3. Toggle **Chat is running** off to stop SimpleX Chat from running.
4. Tap **Stop** in the confirmation dialog.
5. Confirm it with a fingerprint or PIN, in case you have [SimpleX Lock](./app-settings.md#simplex-lock) toggled on.
6. If you didn't set it before, [set a passphrase](./managing-data.md#database-passphrase) in "Database passphrase". Initially, the database is encrypted with a random passphrase that is stored in KeyChain (iOS) or with KeyStore (Android).
7. Tap **Export database** - it won't allow exporting unless you have set a passphrase.
8. Save the file on your device or share it via any available option.

#### To import your SimpleX Chat data on another device:

1. [Install SimpleX Chat](./README.md#install-simplex-chat) on the new device.
2. Migrate the exported .zip file over to the new device.
3. Create a chat profile with any name by following the steps in [Create your first chat profile](#create-your-first-chat-profile) – you will replace it soon.
4. [Open app settings](./app-settings.md#opening-app-settings).
5. Under the **"Settings"** section, tap **Database passphrase & export**.
6. Toggle **Chat is running** off to stop chat.
7. Tap **Stop** in the confirmation dialog.
8. Tap **Import database**.
9. Select the .zip file containing your exported SimpleX Chat data.
10. Tap **Import** in the confirmation dialog.
11. Toggle **Chat is running** on to start the chat or close and restart the app – you will be prompted to enter the passphrase for your chat database.

**Please note:**

1. Currently you can't migrate your chat profiles individually, only the whole database containing all your chat profiles can be migrated.

2. You must NOT use your exported database on more than one device at a time, as it may disrupt some of the connections. You also must always use the latest version of the chat database - using the old one is also likely to disrupt your connections.

3. There is no way to recover lost database passphrase. Please make sure to store it safely and securely.
