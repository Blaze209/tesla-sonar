package io.sentry.util;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class h {
    public static Throwable a(Throwable th2) {
        y.c(th2, "throwable cannot be null");
        while (th2.getCause() != null && th2.getCause() != th2) {
            th2 = th2.getCause();
        }
        return th2;
    }

    public static boolean b(Set<Class<? extends Throwable>> set, Throwable th2) {
        return set.contains(th2.getClass());
    }
}
