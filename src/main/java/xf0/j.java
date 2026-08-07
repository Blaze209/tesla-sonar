package xf0;

import android.util.Log;

/* JADX INFO: loaded from: classes8.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f123487a = Integer.MAX_VALUE;

    private static int a(int i11, String str, String str2) {
        if (str == null || str2 == null) {
            return 0;
        }
        if (i11 == 2) {
            return Log.v(str, str2);
        }
        if (i11 == 3) {
            return Log.d(str, str2);
        }
        if (i11 == 4) {
            return Log.i(str, str2);
        }
        if (i11 == 5) {
            return Log.w(str, str2);
        }
        if (i11 != 6) {
            return 0;
        }
        return Log.e(str, str2);
    }

    public static int b(String str, String str2) {
        if (f123487a > 3) {
            return 0;
        }
        a(3, str, str2);
        return 0;
    }

    public static int c(String str, String str2) {
        if (f123487a > 4) {
            return 0;
        }
        a(4, str, str2);
        return 0;
    }

    public static int d(String str, String str2) {
        if (f123487a <= 6) {
            return a(6, str, str2);
        }
        return 0;
    }
}
