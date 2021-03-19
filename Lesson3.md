# [Advanced Android in Kotlin](https://developer.android.com/codelabs/advanced-android-kotlin-training-welcome)

Welcome to the Advanced Android in Kotlin course, created by the Google Developers Training team. This course provides a series of codelabs that lead you through the advanced topics of building Android apps using Kotlin. In this course, you learn advanced Android Kotlin programming concepts and build various apps.

## **Testing and Dependency Injection**

**Testing Basics**

This codelabs covers the basics of running and writing tests for Android. It includes Test Driven Development, source sets, Robolectric, AndroidX, and testing ViewModels and LiveData.

**Dependency Injection and Test Doubles**

This codelab covers how to implement manual dependency injection and use test doubles on Android. It includes setting up manual dependency injection, creating fakes, creating mocks, creating ServiceLocators, instrumentation tests for Fragments, testing Navigation, and basic Espresso testing.

**Survey of Testing Topics**

This final codelabs covers testing specific types of code, including:

- Testing code with coroutines
- Testing Room
- Espresso Idling Resource
- End to End testing with Data Binding

### [Testing Basics](https://developer.android.com/codelabs/advanced-android-kotlin-training-testing-basics)

What you'll learn in this series of codelabs is how to create a collection of tests (known as a **testing suite)** for a real-world app.

This first codelab covers the basics of testing on Android, you'll write your first tests and learn how to test `LiveData` and `ViewModel`s.

This codelab covered:

- How to run tests from Android Studio.
- The difference between local (`test`) and instrumentation tests (`androidTest`).
- How to write local unit tests using [JUnit](https://junit.org/junit4/) and [Hamcrest](http://hamcrest.org/).
- Setting up ViewModel tests with the [AndroidX Test Library](https://developer.android.com/training/testing/set-up-project).

### [Introduction to Test Doubles and Dependency Injection](https://developer.android.com/codelabs/advanced-android-kotlin-training-testing-test-doubles)

This second testing codelab is all about test doubles: when to use them in Android, and how to implement them using dependency injection, the Service Locator pattern, and libraries. In doing this, you'll learn how to write:

- Repository unit tests
- Fragments and viewmodel integration tests
- Fragment navigation tests

This codelab covered how to set up manual dependency injection, a service locator, and how to use fakes and mocks in your Android Kotlin apps. In particular:

- What you want to test and your testing strategy determine the kinds of test you are going to implement for your app. **Unit tests** are focused and fast. **Integration tests** verify interaction between parts of your program. **End-to-end tests** verify features, have the highest fidelity, are often instrumented, and may take longer to run.
- The architecture of your app influences how hard it is to test.
- To isolate parts of your app for testing, you can use test doubles. A **test double** is a version of a class crafted specifically for testing. For example, you fake getting data from a database or the internet.
- Use **dependency injection** to replace a real class with a testing class, for example, a repository or a networking layer.
- Use i**nstrumented testing** (`androidTest`) to launch UI components.
- When you can't use constructor dependency injection, for example to launch a fragment, you can often use a service locator. The **Service Locator pattern** is an alternative to Dependency Injection. It involves creating a singleton class called the "Service Locator", whose purpose is to provide dependencies, both for the regular and test code.

### [Survey of Testing Topics](https://developer.android.com/codelabs/advanced-android-kotlin-training-testing-survey)

This third testing codelab is a survey of additional testing topics, including:

- Coroutines, including view model scoped coroutines
- Room
- Databinding
- End-to-End tests

This codelab covered:

- A review of testing coroutines from previous lessons, including covering the usage of [`runBlocking`](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/run-blocking.html) versus [`runBlockingTest`](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-test/kotlinx.coroutines.test/run-blocking-test.html).
- How to test coroutines that use `viewModelScope` by using [`TestCoroutineDispatcher`](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-test/kotlinx.coroutines.test/-test-coroutine-dispatcher/)
- `TestCoroutineDispatcher`'s ability to [`pauseDispatcher`](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-test/kotlinx.coroutines.test/-delay-controller/pause-dispatcher.html) and [`resumeDispatcher`](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-test/kotlinx.coroutines.test/-delay-controller/resume-dispatcher.html) to control coroutine execution
- Testing error handling by updating a fake
- Testing your data layer, including your DAO and local data source
- Using [`IdlingResource`](https://developer.android.com/reference/androidx/test/espresso/IdlingResource.html) (and the [`CountingIldingResource`](https://developer.android.com/reference/androidx/test/espresso/idling/CountingIdlingResource.html) subclass) to write end to end tests that both include long running code and work with the [data binding library](https://developer.android.com/topic/libraries/data-binding).
- Testing global app navigation in an end to end test.