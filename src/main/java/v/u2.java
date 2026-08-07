package v;

import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;

/* JADX INFO: loaded from: classes.dex */
public final class u2 {
    @NonNull
    public static CameraUnavailableException a(@NonNull CameraAccessExceptionCompat cameraAccessExceptionCompat) {
        int iD = cameraAccessExceptionCompat.d();
        int i11 = 1;
        if (iD != 1) {
            i11 = 2;
            if (iD != 2) {
                i11 = 3;
                if (iD != 3) {
                    i11 = 4;
                    if (iD != 4) {
                        i11 = 5;
                        if (iD != 5) {
                            i11 = iD != 10001 ? 0 : 6;
                        }
                    }
                }
            }
        }
        return new CameraUnavailableException(i11, cameraAccessExceptionCompat);
    }
}
