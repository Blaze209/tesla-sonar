package ru;

import ou.p;

/* JADX INFO: loaded from: classes5.dex */
public final class b {
    public static char a(long j11) {
        char c11 = (char) j11;
        p.i(((long) c11) == j11, "Out of range: %s", j11);
        return c11;
    }

    public static boolean b(char[] cArr, char c11) {
        for (char c12 : cArr) {
            if (c12 == c11) {
                return true;
            }
        }
        return false;
    }

    public static char c(byte b11, byte b12) {
        return (char) ((b11 << 8) | (b12 & 255));
    }
}
