package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.m2;
import w.z;

/* JADX INFO: loaded from: classes.dex */
public class ConfigureSurfaceToSecondarySessionFailQuirk implements m2 {
    static boolean g(@NonNull z zVar) {
        Integer num = (Integer) zVar.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }
}
