package io.sentry.android.ndk;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.s1;
import io.sentry.ndk.NativeModuleListLoader;
import io.sentry.q7;
import io.sentry.util.y;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements s1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final io.sentry.util.a f79826c = new io.sentry.util.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q7 f79827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NativeModuleListLoader f79828b;

    public a(SentryAndroidOptions sentryAndroidOptions, NativeModuleListLoader nativeModuleListLoader) {
        this.f79827a = (q7) y.c(sentryAndroidOptions, "The SentryAndroidOptions is required.");
        this.f79828b = (NativeModuleListLoader) y.c(nativeModuleListLoader, "The NativeModuleListLoader is required.");
    }
}
