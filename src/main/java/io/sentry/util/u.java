package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.b7;
import io.sentry.q7;

/* JADX INFO: loaded from: classes9.dex */
public class u {
    public boolean c(String str, ILogger iLogger) {
        return g(str, iLogger) != null;
    }

    public boolean d(String str, q7 q7Var) {
        return c(str, q7Var != null ? q7Var.getLogger() : null);
    }

    public r<Boolean> e(final String str, final ILogger iLogger) {
        return new r<>(new r.a() { // from class: io.sentry.util.t
            @Override // io.sentry.util.r.a
            public final Object a() {
                return Boolean.valueOf(this.f81479a.c(str, iLogger));
            }
        });
    }

    public r<Boolean> f(final String str, final q7 q7Var) {
        return new r<>(new r.a() { // from class: io.sentry.util.s
            @Override // io.sentry.util.r.a
            public final Object a() {
                return Boolean.valueOf(this.f81476a.d(str, q7Var));
            }
        });
    }

    public Class<?> g(String str, ILogger iLogger) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            if (iLogger == null) {
                return null;
            }
            iLogger.c(b7.INFO, "Class not available: " + str, new Object[0]);
            return null;
        } catch (UnsatisfiedLinkError e11) {
            if (iLogger == null) {
                return null;
            }
            iLogger.a(b7.ERROR, "Failed to load (UnsatisfiedLinkError) " + str, e11);
            return null;
        } catch (Throwable th2) {
            if (iLogger == null) {
                return null;
            }
            iLogger.a(b7.ERROR, "Failed to initialize " + str, th2);
            return null;
        }
    }
}
