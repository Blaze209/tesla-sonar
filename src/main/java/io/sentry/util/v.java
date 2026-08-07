package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.b7;

/* JADX INFO: loaded from: classes9.dex */
public final class v {
    public static void a(Class<?> cls, Object obj, ILogger iLogger) {
        iLogger.c(b7.DEBUG, "%s is not %s", obj != null ? obj.getClass().getCanonicalName() : "Hint", cls.getCanonicalName());
    }
}
