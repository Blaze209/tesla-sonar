package w;

import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.NonNull;
import c0.y0;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class w extends x {
    w(@NonNull CameraCharacteristics cameraCharacteristics) {
        super(cameraCharacteristics);
    }

    @Override // w.x, w.z.a
    @NonNull
    public Set<String> c() {
        try {
            return this.f120230a.getPhysicalCameraIds();
        } catch (Exception e11) {
            y0.d("CameraCharacteristicsImpl", "CameraCharacteristics.getPhysicalCameraIds throws an exception.", e11);
            return Collections.EMPTY_SET;
        }
    }
}
