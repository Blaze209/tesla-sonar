package com.google.common.util.concurrent;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
final class z {
    static <V> V a(a<V> aVar) {
        return aVar.g();
    }

    static <V> V b(a<V> aVar, long j11, TimeUnit timeUnit) {
        return aVar.h(j11, timeUnit);
    }

    static void c() {
        Thread.currentThread().interrupt();
    }

    static void d(Throwable th2) {
        ou.p.m(th2);
        if (th2 instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }

    static void e(Throwable th2) {
        ou.p.m(th2);
        if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
            throw ((Error) th2);
        }
    }
}
