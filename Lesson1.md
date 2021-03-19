# [Advanced Android in Kotlin](https://developer.android.com/codelabs/advanced-android-kotlin-training-welcome)

Welcome to the Advanced Android in Kotlin course, created by the Google Developers Training team. This course provides a series of codelabs that lead you through the advanced topics of building Android apps using Kotlin. In this course, you learn advanced Android Kotlin programming concepts and build various apps.

## **Notifications**

This codelab is part of a series that guides you through using in-app and push notifications. We recommend that you do all the codelabs in order, because they progress through tasks step-by-step.

### [Using Android Notifications](https://developer.android.com/codelabs/advanced-android-kotlin-training-notifications)

In this codelab, you will learn how to create and use notifications in an Android app.

- Use the [NotificationManager](https://developer.android.com/reference/android/app/NotificationManager) class to create, send, update, and cancel a notification using.
- Use a [NotificationChannel](https://developer.android.com/reference/android/app/NotificationChannel.html) object with the [createNotificationChannel](https://developer.android.com/reference/android/app/NotificationManager#createNotificationChannel(android.app.NotificationChannel)) method to set a channel for the notification.
- Use [addAction()](https://developer.android.com/reference/androidx/core/app/NotificationCompat.Builder.html#addAction(android.support.v4.app.NotificationCompat.Action)) to add quick actions to a notification.
- Use [setShowBadge()](https://developer.android.com/reference/android/app/NotificationChannel.html#setShowBadge(boolean)) to enable or disable badges,.
- Style your notifications using styles which extends from [Notification.Style](https://developer.android.com/reference/android/app/Notification.Style.html)
- Set the importance level with [NotificationChannel.setImportance()](https://developer.android.com/reference/android/app/NotificationChannel#setImportance(int))

### [Android Firebase Cloud Messaging](https://developer.android.com/codelabs/advanced-android-kotlin-training-notifications-fcm)

In this codelab, you will learn how to use Firebase Cloud Messaging to send push notifications for your Android app, as well as send data.

- Implement a FCM BroadcastReceiver by extending [`FirebaseMessagingService`](https://firebase.google.com/docs/reference/android/com/google/firebase/messaging/FirebaseMessagingService).
- Set up a [Firebase Cloud Messaging](https://firebase.google.com/docs/cloud-messaging) (FCM) project and add FCM to your Android app.
- Test your app by sending push notifications from the Notifications composer.
- Subscribe to FCM [topic](https://firebase.google.com/docs/cloud-messaging/android/topic-messaging#subscribe_the_client_app_to_a_topic)s by calling the [`subscribeToTopic()`](https://firebase.google.com/docs/reference/android/com/google/firebase/messaging/FirebaseMessaging.html#subscribeToTopic(java.lang.String)) function of the [`FirebaseMessaging`](https://firebase.google.com/docs/reference/android/com/google/firebase/messaging/FirebaseMessaging) class.
- Send a data payload using a [`RemoteMessage`](https://firebase.google.com/docs/reference/android/com/google/firebase/messaging/RemoteMessage) object.
- Handle data in the [`onMessageReceived()`](https://firebase.google.com/docs/cloud-messaging/android/receive#override-onmessagereceived)function.
- Add logic to handle FCM when the app is in the foreground and when it's in the background.