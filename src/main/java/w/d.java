package w;

import android.hardware.camera2.CameraCaptureSession;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class d {
    public static void a(@NonNull CameraCaptureSession.StateCallback stateCallback, @NonNull CameraCaptureSession cameraCaptureSession) {
        stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
    }
}
