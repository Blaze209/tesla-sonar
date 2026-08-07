package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.m2;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class AudioTimestampFramePositionIncorrectQuirk implements m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<String> f3659a = Arrays.asList("cph1920", "cph1923", "cph2015", "cph2083");

    private static boolean g() {
        return "oppo".equalsIgnoreCase(Build.BRAND) && f3659a.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    private static boolean h() {
        return "lge".equalsIgnoreCase(Build.BRAND) && "lg-m250".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean i() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean j() {
        return "realme".equalsIgnoreCase(Build.BRAND) && "rmx1941".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean k() {
        return "Xiaomi".equalsIgnoreCase(Build.BRAND) && "Redmi 6A".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean l() {
        return "vivo".equalsIgnoreCase(Build.BRAND) && "vivo 1820".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean m() {
        return "vivo".equalsIgnoreCase(Build.BRAND) && "VIVO Y17".equalsIgnoreCase(Build.MODEL);
    }

    static boolean n() {
        return g() || h() || i() || j() || k() || l() || m();
    }
}
