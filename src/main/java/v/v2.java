package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class v2 extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.camera.core.impl.p f117348a;

    v2(androidx.camera.core.impl.p pVar) {
        if (pVar == null) {
            throw new NullPointerException("cameraCaptureCallback is null");
        }
        this.f117348a = pVar;
    }

    private int a(CaptureRequest captureRequest) {
        Integer num;
        if ((captureRequest.getTag() instanceof androidx.camera.core.impl.g3) && (num = (Integer) ((androidx.camera.core.impl.g3) captureRequest.getTag()).d("CAPTURE_CONFIG_ID_KEY")) != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
        androidx.camera.core.impl.g3 g3VarB;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            u5.h.b(tag instanceof androidx.camera.core.impl.g3, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            g3VarB = (androidx.camera.core.impl.g3) tag;
        } else {
            g3VarB = androidx.camera.core.impl.g3.b();
        }
        this.f117348a.b(a(captureRequest), new h(g3VarB, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f117348a.c(a(captureRequest), new androidx.camera.core.impl.r(androidx.camera.core.impl.r.a.ERROR));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, long j11, long j12) {
        super.onCaptureStarted(cameraCaptureSession, captureRequest, j11, j12);
        this.f117348a.e(a(captureRequest));
    }
}
