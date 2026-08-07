package v;

import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class z5 {
    public static boolean a(@NonNull w.z zVar, int i11) {
        int[] iArr = (int[]) zVar.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i12 : iArr) {
                if (i12 == i11) {
                    return true;
                }
            }
        }
        return false;
    }
}
