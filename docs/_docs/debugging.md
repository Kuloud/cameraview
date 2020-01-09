---
layout: page
title: "Debugging"
order: 15
disqus: 1
---

`CameraView` will log a lot of interesting events related to the camera lifecycle. These are important
to identify bugs. The default logger will simply use Android `Log` methods posting to logcat.

You can attach and detach external loggers using `LoggerFactory.setLoggerBinder()`:

```java
LoggerFactory.setLoggerBinder(new LoggerBinder() {
    @Override
    public Logger getLogger(String tag) {
        return new AoeLoggerImpl(tag);
    }
});

```

Implements interface `Logger` for handling of different levels of logs.

```java
public class AoeLoggerImpl implements Logger {
    private String mTag = "Logger";

    public AoeLoggerImpl(String tag) {
        mTag = tag;
    }

    @Override
    public void debug(String msg, Object... args) {
        Log.d(mTag, String.format(msg, args));
    }

    @Override
    public void info(String msg, Object... args) {
        Log.d(mTag, String.format(msg, args));
    }

    @Override
    public void warn(String msg, Throwable t) {
        Log.w(mTag, msg, t);
    }

    @Override
    public void warn(String msg, Object... args) {
        Log.d(mTag, String.format(msg, args));
    }

    @Override
    public void error(String msg, Throwable t) {
        Log.e(mTag, msg, t);
    }

    @Override
    public void error(String msg, Object... args) {
        Log.e(mTag, String.format(msg, args));
    }
}
```