package io.sentry.android.core;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes9.dex */
final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f79376a;

    c2() {
        this(Looper.getMainLooper());
    }

    public Thread a() {
        return this.f79376a.getLooper().getThread();
    }

    public void b(Runnable runnable) {
        this.f79376a.post(runnable);
    }

    c2(Looper looper) {
        this.f79376a = new Handler(looper);
    }
}
