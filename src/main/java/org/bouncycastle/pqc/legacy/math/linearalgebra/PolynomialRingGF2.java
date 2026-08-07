package org.bouncycastle.pqc.legacy.math.linearalgebra;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes10.dex */
public final class PolynomialRingGF2 {
    private PolynomialRingGF2() {
    }

    public static int add(int i11, int i12) {
        return i11 ^ i12;
    }

    public static int degree(int i11) {
        int i12 = -1;
        while (i11 != 0) {
            i12++;
            i11 >>>= 1;
        }
        return i12;
    }

    public static int gcd(int i11, int i12) {
        while (true) {
            int i13 = i12;
            int i14 = i11;
            i11 = i13;
            if (i11 == 0) {
                return i14;
            }
            i12 = remainder(i14, i11);
        }
    }

    public static int getIrreduciblePolynomial(int i11) {
        PrintStream printStream;
        String str;
        if (i11 < 0) {
            printStream = System.err;
            str = "The Degree is negative";
        } else {
            if (i11 <= 31) {
                if (i11 == 0) {
                    return 1;
                }
                int i12 = 1 << (i11 + 1);
                for (int i13 = (1 << i11) + 1; i13 < i12; i13 += 2) {
                    if (isIrreducible(i13)) {
                        return i13;
                    }
                }
                return 0;
            }
            printStream = System.err;
            str = "The Degree is more then 31";
        }
        printStream.println(str);
        return 0;
    }

    public static boolean isIrreducible(int i11) {
        if (i11 == 0) {
            return false;
        }
        int iDegree = degree(i11) >>> 1;
        int iModMultiply = 2;
        for (int i12 = 0; i12 < iDegree; i12++) {
            iModMultiply = modMultiply(iModMultiply, iModMultiply, i11);
            if (gcd(iModMultiply ^ 2, i11) != 1) {
                return false;
            }
        }
        return true;
    }

    public static int modMultiply(int i11, int i12, int i13) {
        int iRemainder = remainder(i11, i13);
        int iRemainder2 = remainder(i12, i13);
        int i14 = 0;
        if (iRemainder2 != 0) {
            int iDegree = 1 << degree(i13);
            while (iRemainder != 0) {
                if (((byte) (iRemainder & 1)) == 1) {
                    i14 ^= iRemainder2;
                }
                iRemainder >>>= 1;
                iRemainder2 <<= 1;
                if (iRemainder2 >= iDegree) {
                    iRemainder2 ^= i13;
                }
            }
        }
        return i14;
    }

    public static long multiply(int i11, int i12) {
        long j11 = 0;
        if (i12 != 0) {
            long j12 = ((long) i12) & 4294967295L;
            while (i11 != 0) {
                if (((byte) (i11 & 1)) == 1) {
                    j11 ^= j12;
                }
                i11 >>>= 1;
                j12 <<= 1;
            }
        }
        return j11;
    }

    public static int remainder(int i11, int i12) {
        if (i12 == 0) {
            System.err.println("Error: to be divided by 0");
            return 0;
        }
        while (degree(i11) >= degree(i12)) {
            i11 ^= i12 << (degree(i11) - degree(i12));
        }
        return i11;
    }

    public static int rest(long j11, int i11) {
        if (i11 == 0) {
            System.err.println("Error: to be divided by 0");
            return 0;
        }
        long j12 = ((long) i11) & 4294967295L;
        while ((j11 >>> 32) != 0) {
            j11 ^= j12 << (degree(j11) - degree(j12));
        }
        int iDegree = (int) j11;
        while (degree(iDegree) >= degree(i11)) {
            iDegree ^= i11 << (degree(iDegree) - degree(i11));
        }
        return iDegree;
    }

    public static int degree(long j11) {
        int i11 = 0;
        while (j11 != 0) {
            i11++;
            j11 >>>= 1;
        }
        return i11 - 1;
    }
}
