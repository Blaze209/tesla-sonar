package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.m2;

/* JADX INFO: loaded from: classes.dex */
public class Preview3AThreadCrashQuirk implements m2 {
    static boolean g() {
        return "samsungexynos7870".equalsIgnoreCase(Build.HARDWARE);
    }
}
