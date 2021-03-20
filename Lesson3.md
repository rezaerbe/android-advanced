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

In this codelab, you will learn how to test repositories, view models, and fragments using test doubles and dependency injection. Before you dive into what those are, it's important to understand the reasoning that will guide what and how you will write these tests.

This section covers some best practices of testing in general, as they apply to Android.

#### The Testing Pyramid

When thinking about a testing strategy, there are three related testing aspects:

- **Scope**—How much of the code does the test touch? Tests can run on a single method, across the entire application, or somewhere in between.
- **Speed**—How fast does the test run? Test speeds can vary from milli-seconds to several minutes.
- **Fidelity**—How "real-world" is the test? For example, if part of the code you're testing needs to make a network request, does the test code actually make this network request, or does it fake the result? If the test actually talks with the network, this means it has higher fidelity. The trade-off is that the test could take longer to run, could result in errors if the network is down, or could be costly to use.

There are inherent trade-offs between these aspects. For example, speed and fidelity are a trade-off—the faster the test, generally, the less fidelity, and vice versa. One common way to divide automated tests is into these three categories:

- **Unit tests**—These are highly focused tests that run on a single class, usually a single method in that class. If a unit test fails, you can know exactly where in your code the issue is. They have low fidelity since in the real world, your app involves much more than the execution of one method or class. They are fast enough to run every time you change your code. They will most often be locally run tests (in the `test` source set). **Example:** Testing single methods in view models and repositories.
- **Integration tests**—These test the interaction of several classes to make sure they behave as expected when used together. One way to structure integration tests is to have them test a single feature, such as the ability to save a task. They test a larger scope of code than unit tests, but are still optimized to run fast, versus having full fidelity. They can be run either locally or as instrumentation tests, depending on the situation. **Example:** Testing all the functionality of a single fragment and view model pair.
- **End to end tests (E2e)**—Test a combination of features working together. They test large portions of the app, simulate real usage closely, and therefore are usually slow. They have the highest fidelity and tell you that your application actually works as a whole. By and large, these tests will be instrumented tests (in the `androidTest` source set) **Example:** Starting up the entire app and testing a few features together.

The suggested proportion of these tests is often represented by a pyramid, with the vast majority of tests being unit tests.

![ed5e6485d179c1b9.png](https://developer.android.com/codelabs/advanced-android-kotlin-training-testing-test-doubles/img/ed5e6485d179c1b9.png)

Check out the [Fundamentals of Testing](https://developer.android.com/training/testing/fundamentals) in the Android Developer documentation for a deeper dive into these concepts and how they map to Android.

#### Architecture and Testing

Your ability to test your app at all the different levels of the testing pyramid is inherently tied to your **app's architecture**. For example, an *extremely* poorly-architected application might put all of its logic inside one method. You might be able to write an end to end test for this, since these tests tend to test large portions of the app, but what about writing unit or integration tests? With all of the code in one place, it's hard to test just the code related to a single unit or feature.

A better approach would be to break down the application logic into multiple methods and classes, allowing each piece to be tested in isolation. Architecture is a way to divide up and organize your code, which allows easier unit and integration testing. The TO-DO app that you'll be testing follows a particular architecture:

![284779b388dddec0.png](https://developer.android.com/codelabs/advanced-android-kotlin-training-testing-test-doubles/img/284779b388dddec0.png)

In this lesson, you'll see how to test parts of the above architecture, in proper isolation:

1. First you'll **unit test** the **repository**.
2. Then you'll use a test double in the view model, which is necessary for **unit testing** and **integration testing** the view model.
3. Next, you'll learn to write **integration tests** for **fragments and their view models**.
4. Finally, you'll learn to write **integration tests** that include the **Navigation component**.

End to end testing will be covered in the next lesson.

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