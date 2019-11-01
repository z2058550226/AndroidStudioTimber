# AndroidStudioTimber
A more useful DebugTree than Timber.DebugTree

This library has only one class named `AndroidStudioTree`. It add a useful feature that is add a class name prefix to your log. The prefix is clickable like this:

![sample](https://github.com/z2058550226/AndroidStudioTimber/blob/master/sample.png) 

In Application, you can simply replace the `DebugTree` with `AndroidStudioTree` like this:

```kotlin
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        ...
        if (Config.DEBUG) {
            Timber.plant(SuikaTree()) // orignal is Timber.plant(Timber.DebugTree())
        }
        ...
    }
}
```

Then you can use Timber with IDE navigation.
