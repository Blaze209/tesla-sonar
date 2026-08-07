package w;

import android.hardware.camera2.CameraManager;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class e {
    public static void a(@NonNull CameraManager.AvailabilityCallback availabilityCallback) {
        availabilityCallback.onCameraAccessPrioritiesChanged();
    }
}
