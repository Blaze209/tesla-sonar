package io.sentry;

import java.io.File;

/* JADX INFO: loaded from: classes9.dex */
public interface v4 {
    static /* synthetic */ void c(ILogger iLogger, String str, t tVar, File file) {
        b7 b7Var = b7.DEBUG;
        iLogger.c(b7Var, "Started processing cached files from %s", str);
        tVar.d(file);
        iLogger.c(b7Var, "Finished processing cached files from %s", str);
    }

    default s4 a(final t tVar, final String str, final ILogger iLogger) {
        final File file = new File(str);
        return new s4() { // from class: io.sentry.u4
            @Override // io.sentry.s4
            public final void a() {
                v4.c(iLogger, str, tVar, file);
            }
        };
    }

    default boolean b(String str, ILogger iLogger) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        iLogger.c(b7.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    }

    s4 d(z0 z0Var, q7 q7Var);
}
