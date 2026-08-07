package io.sentry.react.utils;

import android.app.Activity;
import com.facebook.react.bridge.ReactApplicationContext;
import io.sentry.ILogger;
import io.sentry.android.core.h1;
import io.sentry.b7;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static Activity a(ReactApplicationContext reactApplicationContext, ILogger iLogger) {
        Activity currentActivity = reactApplicationContext.getCurrentActivity();
        if (currentActivity != null) {
            return currentActivity;
        }
        iLogger.c(b7.DEBUG, "[RNSentryActivityUtils] Given ReactApplicationContext has no activity attached, using CurrentActivityHolder as a fallback.", new Object[0]);
        return h1.c().b();
    }
}
