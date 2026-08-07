package net.time4j.base;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    public static int a(int i11, int i12) {
        return i11 >= 0 ? i11 / i12 : ((i11 + 1) / i12) - 1;
    }

    public static long b(long j11, int i11) {
        return j11 >= 0 ? j11 / ((long) i11) : ((j11 + 1) / ((long) i11)) - 1;
    }

    public static int c(int i11, int i12) {
        return i11 - (i12 * a(i11, i12));
    }

    public static int d(long j11, int i11) {
        return (int) (j11 - (((long) i11) * b(j11, i11)));
    }

    public static int e(int i11, int i12) {
        if (i12 == 0) {
            return i11;
        }
        long j11 = ((long) i11) + ((long) i12);
        if (j11 >= -2147483648L && j11 <= 2147483647L) {
            return (int) j11;
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Integer overflow: (");
        sb2.append(i11);
        sb2.append(CoreConstants.COMMA_CHAR);
        sb2.append(i12);
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        throw new ArithmeticException(sb2.toString());
    }

    public static long f(long j11, long j12) {
        if (j12 == 0) {
            return j11;
        }
        if (j12 <= 0 ? j11 >= Long.MIN_VALUE - j12 : j11 <= Long.MAX_VALUE - j12) {
            return j11 + j12;
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Long overflow: (");
        sb2.append(j11);
        sb2.append(CoreConstants.COMMA_CHAR);
        sb2.append(j12);
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        throw new ArithmeticException(sb2.toString());
    }

    public static int g(long j11) {
        if (j11 >= -2147483648L && j11 <= 2147483647L) {
            return (int) j11;
        }
        throw new ArithmeticException("Out of range: " + j11);
    }

    public static int h(int i11, int i12) {
        if (i12 == 1) {
            return i11;
        }
        long j11 = ((long) i11) * ((long) i12);
        if (j11 >= -2147483648L && j11 <= 2147483647L) {
            return (int) j11;
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Integer overflow: (");
        sb2.append(i11);
        sb2.append(CoreConstants.COMMA_CHAR);
        sb2.append(i12);
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        throw new ArithmeticException(sb2.toString());
    }

    public static long i(long j11, long j12) {
        if (j12 == 1) {
            return j11;
        }
        if (j12 <= 0 ? j12 >= -1 ? !(j12 == -1 && j11 == Long.MIN_VALUE) : j11 <= Long.MIN_VALUE / j12 && j11 >= Long.MAX_VALUE / j12 : j11 <= Long.MAX_VALUE / j12 && j11 >= Long.MIN_VALUE / j12) {
            return j11 * j12;
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Long overflow: (");
        sb2.append(j11);
        sb2.append(CoreConstants.COMMA_CHAR);
        sb2.append(j12);
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        throw new ArithmeticException(sb2.toString());
    }

    public static int j(int i11) {
        if (i11 != Integer.MIN_VALUE) {
            return -i11;
        }
        throw new ArithmeticException("Not negatable: " + i11);
    }

    public static long k(long j11) {
        if (j11 != Long.MIN_VALUE) {
            return -j11;
        }
        throw new ArithmeticException("Not negatable: " + j11);
    }

    public static int l(int i11, int i12) {
        if (i12 == 0) {
            return i11;
        }
        long j11 = ((long) i11) - ((long) i12);
        if (j11 >= -2147483648L && j11 <= 2147483647L) {
            return (int) j11;
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Integer overflow: (");
        sb2.append(i11);
        sb2.append(CoreConstants.COMMA_CHAR);
        sb2.append(i12);
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        throw new ArithmeticException(sb2.toString());
    }

    public static long m(long j11, long j12) {
        if (j12 == 0) {
            return j11;
        }
        if (j12 <= 0 ? j11 <= Long.MAX_VALUE + j12 : j11 >= Long.MIN_VALUE + j12) {
            return j11 - j12;
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Long overflow: (");
        sb2.append(j11);
        sb2.append(CoreConstants.COMMA_CHAR);
        sb2.append(j12);
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        throw new ArithmeticException(sb2.toString());
    }
}
