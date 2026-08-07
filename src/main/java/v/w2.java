package v;

import android.hardware.camera2.CameraCaptureSession;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class w2 extends androidx.camera.core.impl.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CameraCaptureSession.CaptureCallback f117361a;

    private w2(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.f117361a = captureCallback;
    }

    static w2 f(CameraCaptureSession.CaptureCallback captureCallback) {
        return new w2(captureCallback);
    }

    @NonNull
    CameraCaptureSession.CaptureCallback g() {
        return this.f117361a;
    }
}
