package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.m2;

/* JADX INFO: loaded from: classes.dex */
public class StopCodecAfterSurfaceRemovalCrashMediaServerQuirk implements m2 {
    private static boolean g() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL);
    }

    static boolean h() {
        return g();
    }
}
