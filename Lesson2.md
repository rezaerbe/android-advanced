# [Advanced Android in Kotlin](https://developer.android.com/codelabs/advanced-android-kotlin-training-welcome)

Welcome to the Advanced Android in Kotlin course, created by the Google Developers Training team. This course provides a series of codelabs that lead you through the advanced topics of building Android apps using Kotlin. In this course, you learn advanced Android Kotlin programming concepts and build various apps.

## **Animation**

This codelab is part of a series about Animation with Android. We recommend that you do all the codelabs in order, because they progress through tasks step-by-step.

### [Property Animation](https://developer.android.com/codelabs/advanced-android-kotlin-training-property-animation)

In this codelab, you're going to build an application that animates stars on the screen by changing various `View` properties that control position, size, rotation, and translucency. You will start out with the basic UI of the application, a set of buttons that when pressed will animate the star.

Animating stars may not be the kind of UI experience you want in your applications, but the tools you used in this lab are exactly the tools you should use to animate UI elements in real-world situations. [`ObjectAnimator`](https://developer.android.com/reference/android/animation/ObjectAnimator), [`AnimatorSet`](https://developer.android.com/reference/android/animation/AnimatorSet), [`LinearInterpolator`](https://developer.android.com/reference/android/view/animation/LinearInterpolator.html), [`PropertyValuesHolder`](https://developer.android.com/reference/android/animation/PropertyValuesHolder) are all good APIs to understand in order to write animations in your code.

### [Animation with MotionLayout](https://developer.android.com/codelabs/motion-layout)

`MotionLayout` is a library that lets you add rich motion into your Android app. It's based upon `ConstraintLayout,` and lets you animate anything that you can build using `ConstraintLayout`.

You can use `MotionLayout` to animate the location, size, visibility, alpha, color, elevation, rotation, and other attributes of multiple views at the same time. Using declarative XML you can create coordinated animations, involving multiple views, that are difficult to achieve in code.

Animations are a great way to enhance an app experience. You can use animations to:

- **Show changes**—animating between states lets the user naturally track changes in your UI.
- **Draw attention**—use animations to draw attention to important UI elements.
- **Build beautiful designs**—effective motion in design makes apps look polished.

`MotionLayout` supports even more features not covered in this codelab, like `KeyCycle,` which lets you control paths or attributes with repeating cycles, and `KeyTimeCycle,` which lets you animate based on clock time. Check out the samples for examples of each.