package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.m2;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class CameraUseInconsistentTimebaseQuirk implements m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<String> f3660a = new HashSet(Arrays.asList("samsungexynos7570", "samsungexynos7870", "qcom"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<String> f3661b = new HashSet(Arrays.asList("sm4350", "sm6375", "sm7325"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<String> f3662c = new HashSet(Arrays.asList("m2007j20cg", "m2007j20ct"));

    private static boolean g() {
        return f3662c.contains(Build.MODEL.toLowerCase());
    }

    private static boolean h() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && f3660a.contains(Build.HARDWARE.toLowerCase());
    }

    static boolean i() {
        return j() || h() || g();
    }

    private static boolean j() {
        return Build.VERSION.SDK_INT >= 31 && f3661b.contains(Build.SOC_MODEL.toLowerCase());
    }
}
