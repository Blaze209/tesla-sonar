package ru;

import java.util.Arrays;
import ou.p;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final byte[] f109217a;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i11 = 0; i11 < 10; i11++) {
                bArr[i11 + 48] = (byte) i11;
            }
            for (int i12 = 0; i12 < 26; i12++) {
                byte b11 = (byte) (i12 + 10);
                bArr[i12 + 65] = b11;
                bArr[i12 + 97] = b11;
            }
            f109217a = bArr;
        }

        static int a(char c11) {
            if (c11 < 128) {
                return f109217a[c11];
            }
            return -1;
        }
    }

    private static int a(long j11) {
        int i11 = (int) j11;
        p.i(j11 == ((long) i11), "the total number of elements (%s) in the arrays must fit in an int", j11);
        return i11;
    }

    public static long[] b(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        long[] jArr3 = new long[a(length)];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }

    public static int c(long j11) {
        return Long.hashCode(j11);
    }

    public static long d(long... jArr) {
        p.d(jArr.length > 0);
        long j11 = jArr[0];
        for (int i11 = 1; i11 < jArr.length; i11++) {
            long j12 = jArr[i11];
            if (j12 > j11) {
                j11 = j12;
            }
        }
        return j11;
    }

    public static Long e(String str, int i11) {
        if (((String) p.m(str)).isEmpty()) {
            return null;
        }
        if (i11 < 2 || i11 > 36) {
            throw new IllegalArgumentException("radix must be between MIN_RADIX and MAX_RADIX but was " + i11);
        }
        int i12 = str.charAt(0) == '-' ? 1 : 0;
        if (i12 == str.length()) {
            return null;
        }
        int i13 = i12 + 1;
        int iA = a.a(str.charAt(i12));
        if (iA < 0 || iA >= i11) {
            return null;
        }
        long j11 = -iA;
        long j12 = i11;
        long j13 = Long.MIN_VALUE / j12;
        while (i13 < str.length()) {
            int i14 = i13 + 1;
            int iA2 = a.a(str.charAt(i13));
            if (iA2 < 0 || iA2 >= i11 || j11 < j13) {
                return null;
            }
            long j14 = j11 * j12;
            long j15 = iA2;
            if (j14 < j15 - Long.MIN_VALUE) {
                return null;
            }
            j11 = j14 - j15;
            i13 = i14;
        }
        if (i12 != 0) {
            return Long.valueOf(j11);
        }
        if (j11 == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(-j11);
    }
}
