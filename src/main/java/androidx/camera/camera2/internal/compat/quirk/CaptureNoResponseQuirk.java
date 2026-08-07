package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.m2;
import w.z;

/* JADX INFO: loaded from: classes.dex */
public class CaptureNoResponseQuirk implements m2 {
    static boolean g(@NonNull z zVar) {
        String str = Build.HARDWARE;
        return ("samsungexynos7420".equalsIgnoreCase(str) || "universal7420".equalsIgnoreCase(str)) && ((Integer) zVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
