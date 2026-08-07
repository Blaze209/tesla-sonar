package net.time4j.base;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
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
        if (i13 <= d(i11, i12)) {
            return;
        }
        throw new IllegalArgumentException("DAY_OF_MONTH exceeds month length in given year: " + m(i11, i12, i13));
    }

    private static int b(int i11) {
        switch (i11) {
            case 1:
                return 28;
            case 2:
                return 31;
            case 3:
                return 2;
            case 4:
                return 5;
            case 5:
                return 7;
            case 6:
                return 10;
            case 7:
                return 12;
            case 8:
                return 15;
            case 9:
                return 18;
            case 10:
                return 20;
            case 11:
                return 23;
            case 12:
                return 25;
            default:
                throw new IllegalArgumentException("Month out of range: " + i11);
        }
    }

    public static int c(int i11, int i12, int i13) {
        if (i13 < 1 || i13 > 31) {
            throw new IllegalArgumentException("Day out of range: " + i13);
        }
        if (i13 > d(i11, i12)) {
            throw new IllegalArgumentException("Day exceeds month length: " + m(i11, i12, i13));
        }
        int iB = b(i12);
        int i14 = i11 % 100;
        int iA = c.a(i11, 100);
        if (i14 < 0) {
            i14 += 100;
        }
        if (i12 <= 2 && (i14 = i14 - 1) < 0) {
            iA--;
            i14 = 99;
        }
        int iA2 = (((((i13 + iB) + i14) + (i14 / 4)) + c.a(iA, 4)) - (iA * 2)) % 7;
        return iA2 <= 0 ? iA2 + 7 : iA2;
    }

    public static int d(int i11, int i12) {
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
                return e(i11) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                throw new IllegalArgumentException("Invalid month: " + i12);
        }
    }

    public static boolean e(int i11) {
        if (i11 <= 1900 || i11 >= 2100) {
            return ((i11 & 3) == 0 && i11 % 100 != 0) || i11 % 400 == 0;
        }
        return (i11 & 3) == 0;
    }

    public static boolean f(int i11, int i12, int i13) {
        return i11 >= -999999999 && i11 <= 999999999 && i12 >= 1 && i12 <= 12 && i13 >= 1 && i13 <= d(i11, i12);
    }

    public static int g(long j11) {
        return (int) (j11 & 255);
    }

    public static int h(long j11) {
        return (int) ((j11 >> 16) & 255);
    }

    public static int i(long j11) {
        return (int) (j11 >> 32);
    }

    public static long j(int i11, int i12, int i13) {
        a(i11, i12, i13);
        long j11 = i11;
        if (i12 < 3) {
            j11--;
            i12 += 12;
        }
        return (((((((365 * j11) + c.b(j11, 4)) - c.b(j11, 100)) + c.b(j11, 400)) + ((long) (((i12 + 1) * 153) / 5))) - 123) + ((long) i13)) - 678881;
    }

    public static long k(a aVar) {
        return j(aVar.b(), aVar.r(), aVar.f());
    }

    public static long l(long j11) {
        long j12;
        long jF = c.f(j11, 678881L);
        long jB = c.b(jF, 146097);
        int iD = c.d(jF, 146097);
        int i11 = 29;
        int i12 = 2;
        if (iD == 146096) {
            j12 = (jB + 1) * 400;
        } else {
            int i13 = iD / 36524;
            int i14 = iD % 36524;
            int i15 = i14 / 1461;
            int i16 = i14 % 1461;
            if (i16 == 1460) {
                j12 = (jB * 400) + ((long) (i13 * 100)) + ((long) ((i15 + 1) * 4));
            } else {
                int i17 = i16 / 365;
                int i18 = i16 % 365;
                j12 = (jB * 400) + ((long) (i13 * 100)) + ((long) (i15 * 4)) + ((long) i17);
                int i19 = ((i18 + 31) * 5) / 153;
                i12 = i19 + 2;
                i11 = (i18 - (((i19 + 3) * 153) / 5)) + 123;
                if (i12 > 12) {
                    j12++;
                    i12 = i19 - 10;
                }
            }
        }
        if (j12 >= -999999999 && j12 <= 999999999) {
            return (j12 << 32) | ((long) (i12 << 16)) | ((long) i11);
        }
        throw new IllegalArgumentException("Year out of range: " + j12);
    }

    static String m(int i11, int i12, int i13) {
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
