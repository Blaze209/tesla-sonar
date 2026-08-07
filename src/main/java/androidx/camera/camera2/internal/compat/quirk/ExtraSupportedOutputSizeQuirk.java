package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.m2;

/* JADX INFO: loaded from: classes.dex */
public class ExtraSupportedOutputSizeQuirk implements m2 {
    @NonNull
    private Size[] h() {
        return new Size[]{new Size(1440, 1080), new Size(960, 720)};
    }

    private static boolean i() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL);
    }

    static boolean j() {
        return i();
    }

    @NonNull
    public Size[] g(int i11) {
        return (i11 == 34 && i()) ? h() : new Size[0];
    }
}
