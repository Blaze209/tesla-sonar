package androidx.camera.extensions.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.m2;
import org.webrtc.WebrtcBuildVersion;
import u0.h;
import u0.q;

/* JADX INFO: loaded from: classes.dex */
public class ExtensionDisabledQuirk implements m2 {
    private static boolean g() {
        return h.g(q.f115243c) && h.d();
    }

    private static boolean h() {
        return "motorola".equalsIgnoreCase(Build.BRAND);
    }

    private static boolean i() {
        return "google".equalsIgnoreCase(Build.BRAND) && "redfin".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean j() {
        return "realme".equalsIgnoreCase(Build.BRAND);
    }

    private static boolean k() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && "a52sxq".equalsIgnoreCase(Build.DEVICE);
    }

    static boolean l() {
        return i() || h() || j() || k();
    }

    private static boolean n(@NonNull String str) {
        return str.equals(WebrtcBuildVersion.maint_version);
    }

    public boolean m(@NonNull String str) {
        if (i() && !g()) {
            return true;
        }
        if (h() && h.f(q.f115242b)) {
            return true;
        }
        if (j() && h.f(q.f115242b)) {
            return true;
        }
        if (k()) {
            return n(str);
        }
        return false;
    }
}
