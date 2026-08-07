package com.facebook.common.time;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import pk.d;
import wk.b;

/* JADX INFO: loaded from: classes3.dex */
@d
public class RealtimeSinceBootClock implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final RealtimeSinceBootClock f21533a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    @d
    public static RealtimeSinceBootClock get() {
        return f21533a;
    }

    @Override // wk.b
    public long now() {
        return SystemClock.elapsedRealtime();
    }

    @Override // wk.b
    public long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(now());
    }
}
