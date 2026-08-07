package androidx.camera.view.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.m2;

/* JADX INFO: loaded from: classes.dex */
public class SurfaceViewStretchedQuirk implements m2 {
    private static boolean g() {
        return "LENOVO".equalsIgnoreCase(Build.MANUFACTURER) && "Q706F".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean h() {
        return "OPPO".equalsIgnoreCase(Build.MANUFACTURER) && "OP4E75L1".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean i() {
        if (!"SAMSUNG".equalsIgnoreCase(Build.MANUFACTURER)) {
            return false;
        }
        String str = Build.DEVICE;
        return "F2Q".equalsIgnoreCase(str) || "Q2Q".equalsIgnoreCase(str);
    }

    static boolean j() {
        if (Build.VERSION.SDK_INT < 33) {
            return i() || h() || g();
        }
        return false;
    }
}
