# [Advanced Android in Kotlin](https://developer.android.com/codelabs/advanced-android-kotlin-training-welcome)

Welcome to the Advanced Android in Kotlin course, created by the Google Developers Training team. This course provides a series of codelabs that lead you through the advanced topics of building Android apps using Kotlin. In this course, you learn advanced Android Kotlin programming concepts and build various apps.

## **Login**

This codelab is part of a series that guides you through supporting login for users . We recommend that you do all the codelabs in order, because they progress through tasks step-by-step.

### [Android Login with FirebaseUI](https://developer.android.com/codelabs/advanced-android-kotlin-training-login)

In this codelab, you will learn the basics of how to support login for your app using the [FirebaseUI library](https://github.com/firebase/FirebaseUI-Android). This library makes it easier to build a login flow, and it handles the work of managing user accounts for you.

In this codelab, you learned:

- How to add Firebase to your project by adding the necessary dependencies in your Gradle file and setting up the project in the Firebase console.
- How to implement login for your app using the `FirebaseUI` library and specifying how you want to allow your users to login. Note that any account a user creates in your app is specific to your app only, and isn't shared with all apps that utilize Firebase for the login functionality.
- How to observe the current authentication status of your app using `LiveData`.
- How to log out users.

### [Android Conditional Navigation with Login](https://developer.android.com/codelabs/advanced-android-kotlin-training-login-navigation)

In this codelab, you will build on top of an existing app to add a settings screen that will only be accessible to users if they are logged in. You'll be using [Android's navigation components](https://developer.android.com/guide/navigation) for this task.

In this codelab you learned best practices for how to create a good user experience in an app that supports login. By observing the authentication status of the app you were able to determine which screens the user can access and redirect them to the login screen when needed.