package c0;

import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f18470a = 3;

    public static void a(@NonNull String str, @NonNull String str2) {
        String strK = k(str);
        if (g(strK, 3)) {
            Log.d(strK, str2);
        }
    }

    public static void b(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        String strK = k(str);
        if (g(strK, 3)) {
            Log.d(strK, str2, th2);
        }
    }

    public static void c(@NonNull String str, @NonNull String str2) {
        String strK = k(str);
        if (g(strK, 6)) {
            Log.e(strK, str2);
        }
    }

    public static void d(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        String strK = k(str);
        if (g(strK, 6)) {
            Log.e(strK, str2, th2);
        }
    }

    public static void e(@NonNull String str, @NonNull String str2) {
        String strK = k(str);
        if (g(strK, 4)) {
            Log.i(strK, str2);
        }
    }

    public static boolean f(@NonNull String str) {
        return g(k(str), 3);
    }

    private static boolean g(@NonNull String str, int i11) {
        return f18470a <= i11 || Log.isLoggable(str, i11);
    }

    public static boolean h(@NonNull String str) {
        return g(k(str), 2);
    }

    static void i() {
        f18470a = 3;
    }

    static void j(int i11) {
        f18470a = i11;
    }

    @NonNull
    private static String k(@NonNull String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    public static void l(@NonNull String str, @NonNull String str2) {
        String strK = k(str);
        if (g(strK, 5)) {
            Log.w(strK, str2);
        }
    }

    public static void m(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        String strK = k(str);
        if (g(strK, 5)) {
            Log.w(strK, str2, th2);
        }
    }
}
