package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.m2;

/* JADX INFO: loaded from: classes.dex */
public class CodecStuckOnFlushQuirk implements m2 {
    private static boolean g() {
        return "Nokia".equalsIgnoreCase(Build.BRAND) && "Nokia 1".equalsIgnoreCase(Build.MODEL);
    }

    static boolean i() {
        return g();
    }

    public boolean h(String str) {
        return "video/mp4v-es".equals(str);
    }
}
