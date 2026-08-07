package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.NonNull;
import w.z;

/* JADX INFO: loaded from: classes.dex */
public class TemporalNoiseQuirk implements CaptureIntentPreviewQuirk {
    private static boolean g() {
        return "Pixel 8".equalsIgnoreCase(Build.MODEL);
    }

    static boolean h(@NonNull z zVar) {
        return g() && ((Integer) zVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
