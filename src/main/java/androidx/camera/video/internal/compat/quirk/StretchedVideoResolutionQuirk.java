package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.impl.m2;

/* JADX INFO: loaded from: classes.dex */
public class StretchedVideoResolutionQuirk implements m2 {
    private static boolean h() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL);
    }

    static boolean i() {
        return h();
    }

    public Size g(int i11) {
        if (i11 == 4) {
            return new Size(640, 480);
        }
        if (i11 == 5) {
            return new Size(960, 720);
        }
        if (i11 != 6) {
            return null;
        }
        return new Size(1440, 1080);
    }
}
