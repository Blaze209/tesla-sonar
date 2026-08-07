package io.sentry.android.core.internal.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import io.sentry.protocol.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements io.sentry.util.thread.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j f79525a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile long f79526b = Process.myTid();

    private j() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.i
            @Override // java.lang.Runnable
            public final void run() {
                j.f79526b = Process.myTid();
            }
        });
    }

    public static j e() {
        return f79525a;
    }

    @Override // io.sentry.util.thread.a
    public boolean a() {
        return h(Thread.currentThread());
    }

    @Override // io.sentry.util.thread.a
    public String b() {
        return a() ? "main" : Thread.currentThread().getName();
    }

    @Override // io.sentry.util.thread.a
    public long c() {
        return Process.myTid();
    }

    public boolean f(long j11) {
        return Looper.getMainLooper().getThread().getId() == j11;
    }

    public boolean g(d0 d0Var) {
        Long l11 = d0Var.l();
        return l11 != null && f(l11.longValue());
    }

    public boolean h(Thread thread) {
        return f(thread.getId());
    }
}
