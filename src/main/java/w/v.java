package w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class v implements f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final CameraCaptureSession f120227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f120228b;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Handler f120229a;

        a(@NonNull Handler handler) {
            this.f120229a = handler;
        }
    }

    v(@NonNull CameraCaptureSession cameraCaptureSession, Object obj) {
        this.f120227a = (CameraCaptureSession) u5.h.g(cameraCaptureSession);
        this.f120228b = obj;
    }

    static f.a d(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull Handler handler) {
        return new v(cameraCaptureSession, new a(handler));
    }

    @Override // w.f.a
    @NonNull
    public CameraCaptureSession a() {
        return this.f120227a;
    }

    @Override // w.f.a
    public int b(@NonNull List<CaptureRequest> list, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f120227a.captureBurst(list, new f.b(executor, captureCallback), ((a) this.f120228b).f120229a);
    }

    @Override // w.f.a
    public int c(@NonNull CaptureRequest captureRequest, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f120227a.setRepeatingRequest(captureRequest, new f.b(executor, captureCallback), ((a) this.f120228b).f120229a);
    }
}
