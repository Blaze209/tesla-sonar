package com.facebook.common.time;

import pk.d;
import wk.c;

/* JADX INFO: loaded from: classes3.dex */
@d
public class AwakeTimeSinceBootClock implements c {

    @d
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    @d
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // wk.c, wk.b
    @d
    public /* bridge */ /* synthetic */ long now() {
        return super.now();
    }

    @Override // wk.c, wk.b
    @d
    public long nowNanos() {
        return System.nanoTime();
    }
}
