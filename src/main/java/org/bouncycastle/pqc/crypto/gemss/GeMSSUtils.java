package org.bouncycastle.pqc.crypto.gemss;

/* JADX INFO: loaded from: classes10.dex */
public class GeMSSUtils {
    static long CMP_LT_UINT(long j11, long j12) {
        long j13 = j11 >>> 63;
        long j14 = j12 >>> 63;
        long j15 = j13 ^ j14;
        return ((((j11 & Long.MAX_VALUE) - (j12 & Long.MAX_VALUE)) >>> 63) & (1 ^ j15)) ^ (((j13 - j14) >>> 63) & j15);
    }

    static int Highest_One(int i11) {
        int i12 = i11 | (i11 >>> 1);
        int i13 = i12 | (i12 >>> 2);
        int i14 = i13 | (i13 >>> 4);
        int i15 = i14 | (i14 >>> 8);
        int i16 = i15 | (i15 >>> 16);
        return i16 ^ (i16 >>> 1);
    }

    static long NORBITS_UINT(long j11) {
        return (((j11 | (j11 << 32)) >>> 32) - 1) >>> 63;
    }

    static long ORBITS_UINT(long j11) {
        return (((j11 | (j11 << 32)) >>> 32) + 4294967295L) >>> 32;
    }

    static long XORBITS_UINT(long j11) {
        long j12 = j11 ^ (j11 << 1);
        return (((j12 ^ (j12 << 2)) & (-8608480567731124088L)) * 1229782938247303441L) >>> 63;
    }

    static long maskUINT(int i11) {
        if (i11 != 0) {
            return (1 << i11) - 1;
        }
        return -1L;
    }
}
