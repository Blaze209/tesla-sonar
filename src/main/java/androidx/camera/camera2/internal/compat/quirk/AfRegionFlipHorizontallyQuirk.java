package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.m2;
import w.z;

/* JADX INFO: loaded from: classes.dex */
public class AfRegionFlipHorizontallyQuirk implements m2 {
    static boolean g(@NonNull z zVar) {
        return Build.BRAND.equalsIgnoreCase("SAMSUNG") && Build.VERSION.SDK_INT < 33 && ((Integer) zVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
