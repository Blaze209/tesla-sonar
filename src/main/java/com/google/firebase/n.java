package com.google.firebase;

import android.os.SystemClock;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class n {
    @NonNull
    public static n a(long j11, long j12, long j13) {
        return new a(j11, j12, j13);
    }

    @NonNull
    public static n e() {
        return a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();
}
