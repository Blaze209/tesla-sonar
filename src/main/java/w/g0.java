package w;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class g0 extends f0 {
    g0(@NonNull CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    static g0 e(@NonNull CameraDevice cameraDevice, @NonNull Handler handler) {
        return new g0(cameraDevice, new i0.a(handler));
    }

    @Override // w.a0.a
    public void a(@NonNull x.p pVar) throws CameraAccessExceptionCompat {
        i0.c(this.f120172a, pVar);
        f.c cVar = new f.c(pVar.a(), pVar.e());
        List<x.j> listC = pVar.c();
        Handler handler = ((i0.a) u5.h.g((i0.a) this.f120173b)).f120174a;
        x.i iVarB = pVar.b();
        try {
            if (iVarB != null) {
                InputConfiguration inputConfiguration = (InputConfiguration) iVarB.a();
                u5.h.g(inputConfiguration);
                this.f120172a.createReprocessableCaptureSessionByConfigurations(inputConfiguration, x.p.h(listC), cVar, handler);
            } else if (pVar.d() == 1) {
                this.f120172a.createConstrainedHighSpeedCaptureSession(i0.d(listC), cVar, handler);
            } else {
                this.f120172a.createCaptureSessionByOutputConfigurations(x.p.h(listC), cVar, handler);
            }
        } catch (CameraAccessException e11) {
            throw CameraAccessExceptionCompat.e(e11);
        }
    }
}
