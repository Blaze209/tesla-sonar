package w;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

/* JADX INFO: loaded from: classes.dex */
class h0 extends g0 {
    h0(@NonNull CameraDevice cameraDevice) {
        super((CameraDevice) u5.h.g(cameraDevice), null);
    }

    @Override // w.g0, w.a0.a
    public void a(@NonNull x.p pVar) throws CameraAccessExceptionCompat {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) pVar.j();
        u5.h.g(sessionConfiguration);
        try {
            this.f120172a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e11) {
            throw CameraAccessExceptionCompat.e(e11);
        }
    }
}
