package io.sentry;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes9.dex */
public final class q4 {
    public static a1 a(io.sentry.util.u uVar, ILogger iLogger) {
        a1 a1VarB = b(uVar, iLogger);
        a1VarB.init();
        return a1VarB;
    }

    private static a1 b(io.sentry.util.u uVar, ILogger iLogger) {
        Class<?> clsG;
        if (io.sentry.util.a0.c() && uVar.c("io.sentry.opentelemetry.OtelContextScopesStorage", iLogger) && (clsG = uVar.g("io.sentry.opentelemetry.OtelContextScopesStorage", iLogger)) != null) {
            try {
                Object objNewInstance = clsG.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance != null && (objNewInstance instanceof a1)) {
                    return (a1) objNewInstance;
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return new o();
    }
}
