package ru;

import ou.p;

/* JADX INFO: loaded from: classes5.dex */
public final class i {
    public static byte a(long j11) {
        p.i((j11 >> 8) == 0, "out of range: %s", j11);
        return (byte) j11;
    }

    public static int b(byte b11) {
        return t7.b.a(b11);
    }
}
