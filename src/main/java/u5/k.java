package u5;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.nearby.messages.Strategy;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f115420a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f115421b = new char[24];

    private static int a(int i11, int i12, boolean z11, int i13) {
        if (i11 > 99 || (z11 && i13 >= 3)) {
            return i12 + 3;
        }
        if (i11 > 9 || (z11 && i13 >= 2)) {
            return i12 + 2;
        }
        if (z11 || i11 > 0) {
            return i12 + 1;
        }
        return 0;
    }

    public static void b(long j11, long j12, PrintWriter printWriter) {
        if (j11 == 0) {
            printWriter.print("--");
        } else {
            d(j11 - j12, printWriter, 0);
        }
    }

    public static void c(long j11, PrintWriter printWriter) {
        d(j11, printWriter, 0);
    }

    public static void d(long j11, PrintWriter printWriter, int i11) {
        synchronized (f115420a) {
            printWriter.print(new String(f115421b, 0, e(j11, i11)));
        }
    }

    private static int e(long j11, int i11) {
        char c11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j12 = j11;
        if (f115421b.length < i11) {
            f115421b = new char[i11];
        }
        char[] cArr = f115421b;
        if (j12 == 0) {
            int i16 = i11 - 1;
            while (i16 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j12 > 0) {
            c11 = '+';
        } else {
            j12 = -j12;
            c11 = CoreConstants.DASH_CHAR;
        }
        int i17 = (int) (j12 % 1000);
        int iFloor = (int) Math.floor(j12 / 1000);
        if (iFloor > 86400) {
            i12 = iFloor / Strategy.TTL_SECONDS_MAX;
            iFloor -= Strategy.TTL_SECONDS_MAX * i12;
        } else {
            i12 = 0;
        }
        if (iFloor > 3600) {
            i13 = iFloor / 3600;
            iFloor -= i13 * 3600;
        } else {
            i13 = 0;
        }
        if (iFloor > 60) {
            int i18 = iFloor / 60;
            iFloor -= i18 * 60;
            i14 = i18;
        } else {
            i14 = 0;
        }
        if (i11 != 0) {
            int iA = a(i12, 1, false, 0);
            int iA2 = iA + a(i13, 1, iA > 0, 2);
            int iA3 = iA2 + a(i14, 1, iA2 > 0, 2);
            int iA4 = iA3 + a(iFloor, 1, iA3 > 0, 2);
            i15 = 0;
            for (int iA5 = iA4 + a(i17, 2, true, iA4 > 0 ? 3 : 0) + 1; iA5 < i11; iA5++) {
                cArr[i15] = ' ';
                i15++;
            }
        } else {
            i15 = 0;
        }
        cArr[i15] = c11;
        int i19 = i15 + 1;
        boolean z11 = i11 != 0;
        int iF = f(cArr, i12, 'd', i19, false, 0);
        int iF2 = f(cArr, i13, 'h', iF, iF != i19, z11 ? 2 : 0);
        int iF3 = f(cArr, i14, 'm', iF2, iF2 != i19, z11 ? 2 : 0);
        int iF4 = f(cArr, iFloor, 's', iF3, iF3 != i19, z11 ? 2 : 0);
        int iF5 = f(cArr, i17, 'm', iF4, true, (!z11 || iF4 == i19) ? 0 : 3);
        cArr[iF5] = 's';
        return iF5 + 1;
    }

    private static int f(char[] cArr, int i11, char c11, int i12, boolean z11, int i13) {
        int i14;
        if (!z11 && i11 <= 0) {
            return i12;
        }
        if ((!z11 || i13 < 3) && i11 <= 99) {
            i14 = i12;
        } else {
            int i15 = i11 / 100;
            cArr[i12] = (char) (i15 + 48);
            i14 = i12 + 1;
            i11 -= i15 * 100;
        }
        if ((z11 && i13 >= 2) || i11 > 9 || i12 != i14) {
            int i16 = i11 / 10;
            cArr[i14] = (char) (i16 + 48);
            i14++;
            i11 -= i16 * 10;
        }
        cArr[i14] = (char) (i11 + 48);
        cArr[i14 + 1] = c11;
        return i14 + 2;
    }
}
