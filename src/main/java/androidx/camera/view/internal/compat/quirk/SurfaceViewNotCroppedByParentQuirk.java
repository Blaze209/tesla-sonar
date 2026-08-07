package androidx.camera.view.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.m2;

/* JADX INFO: loaded from: classes.dex */
public class SurfaceViewNotCroppedByParentQuirk implements m2 {
    static boolean g() {
        return "XIAOMI".equalsIgnoreCase(Build.MANUFACTURER) && "M2101K7AG".equalsIgnoreCase(Build.MODEL);
    }
}
