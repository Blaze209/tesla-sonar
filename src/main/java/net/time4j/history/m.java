package net.time4j.history;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes9.dex */
class m {
    public static void a(int i11, int i12, int i13) {
        if (i11 < -999999999 || i11 > 999999999) {
            throw new IllegalArgumentException("YEAR out of range: " + i11);
        }
        if (i12 < 1 || i12 > 12) {
            throw new IllegalArgumentException("MONTH out of range: " + i12);
        }
        if (i13 < 1 || i13 > 31) {
            throw new IllegalArgumentException("DAY_OF_MONTH out of range: " + i13);
        }
        if (i13 <= b(i11, i12)) {
            return;
        }
        throw new IllegalArgumentException("DAY_OF_MONTH exceeds month length in given year: " + j(i11, i12, i13));
    }

    public static int b(int i11, int i12) {
        switch (i12) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return c(i11) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                throw new IllegalArgumentException("Invalid month: " + i12);
        }
    }

    public static boolean c(int i11) {
        return net.time4j.base.c.c(i11, 4) == 0;
    }

    public static boolean d(int i11, int i12, int i13) {
        return i11 >= -999999999 && i11 <= 999999999 && i12 >= 1 && i12 <= 12 && i13 >= 1 && i13 <= b(i11, i12);
    }

    public static int e(long j11) {
        return (int) (j11 & 255);
    }

    public static int f(long j11) {
        return (int) ((j11 >> 16) & 255);
    }

    public static int g(long j11) {
        return (int) (j11 >> 32);
    }

    public static long h(int i11, int i12, int i13) {
        a(i11, i12, i13);
        long j11 = i11;
        if (i12 < 3) {
            j11--;
            i12 += 12;
        }
        return (((((365 * j11) + net.time4j.base.c.b(j11, 4)) + ((long) (((i12 + 1) * 153) / 5))) - 123) + ((long) i13)) - 678883;
    }

    public static long i(long j11) {
        long j12;
        int i11;
        int i12;
        long jF = net.time4j.base.c.f(j11, 678883L);
        long jB = net.time4j.base.c.b(jF, 1461);
        int iD = net.time4j.base.c.d(jF, 1461);
        if (iD == 1460) {
            j12 = (jB + 1) * 4;
            i12 = 2;
            i11 = 29;
        } else {
            int i13 = iD / 365;
            int i14 = iD % 365;
            j12 = (jB * 4) + ((long) i13);
            int i15 = ((i14 + 31) * 5) / 153;
            int i16 = i15 + 2;
            int i17 = (i14 - (((i15 + 3) * 153) / 5)) + 123;
            if (i16 > 12) {
                j12++;
                int i18 = i15 - 10;
                i11 = i17;
                i12 = i18;
            } else {
                i11 = i17;
                i12 = i16;
            }
        }
        if (j12 >= -999999999 && j12 <= 999999999) {
            return ((long) i11) | (j12 << 32) | ((long) (i12 << 16));
        }
        throw new IllegalArgumentException("Year out of range: " + j12);
    }

    private static String j(int i11, int i12, int i13) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i11);
        sb2.append(CoreConstants.DASH_CHAR);
        if (i12 < 10) {
            sb2.append('0');
        }
        sb2.append(i12);
        sb2.append(CoreConstants.DASH_CHAR);
        if (i13 < 10) {
            sb2.append('0');
        }
        sb2.append(i13);
        return sb2.toString();
    }
}
