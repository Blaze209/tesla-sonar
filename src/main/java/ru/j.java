package ru;

import ou.p;

/* JADX INFO: loaded from: classes5.dex */
public final class j {
    public static int a(long j11) {
        p.i((j11 >> 32) == 0, "out of range: %s", j11);
        return (int) j11;
    }
}
