package io.sentry;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes9.dex */
public final class l8 {
    public static h1 a(io.sentry.util.u uVar, ILogger iLogger) {
        Class<?> clsG;
        if (io.sentry.util.a0.c() && uVar.c("io.sentry.opentelemetry.OtelSpanFactory", iLogger) && (clsG = uVar.g("io.sentry.opentelemetry.OtelSpanFactory", iLogger)) != null) {
            try {
                Object objNewInstance = clsG.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance != null && (objNewInstance instanceof h1)) {
                    return (h1) objNewInstance;
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return new p();
    }
}
