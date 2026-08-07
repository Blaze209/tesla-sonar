package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public interface v4 {

    public interface a {
        @NonNull
        Executor c();

        @NonNull
        x.p i(int i11, @NonNull List<x.j> list, @NonNull c cVar);

        @NonNull
        com.google.common.util.concurrent.s<Void> l(@NonNull CameraDevice cameraDevice, @NonNull x.p pVar, @NonNull List<DeferrableSurface> list);

        @NonNull
        com.google.common.util.concurrent.s<List<Surface>> n(@NonNull List<DeferrableSurface> list, long j11);

        boolean stop();
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Executor f117352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ScheduledExecutorService f117353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f117354c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final g3 f117355d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final androidx.camera.core.impl.r2 f117356e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final androidx.camera.core.impl.r2 f117357f;

        b(@NonNull Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull Handler handler, @NonNull g3 g3Var, @NonNull androidx.camera.core.impl.r2 r2Var, @NonNull androidx.camera.core.impl.r2 r2Var2) {
            this.f117352a = executor;
            this.f117353b = scheduledExecutorService;
            this.f117354c = handler;
            this.f117355d = g3Var;
            this.f117356e = r2Var;
            this.f117357f = r2Var2;
        }

        @NonNull
        a a() {
            return new f5(this.f117356e, this.f117357f, this.f117355d, this.f117352a, this.f117353b, this.f117354c);
        }
    }

    void a();

    void b();

    void close();

    @NonNull
    c d();

    void e(int i11);

    @NonNull
    CameraDevice f();

    int g(@NonNull List<CaptureRequest> list, @NonNull CameraCaptureSession.CaptureCallback captureCallback);

    @NonNull
    w.f h();

    @NonNull
    com.google.common.util.concurrent.s<Void> j();

    void k();

    int m(@NonNull CaptureRequest captureRequest, @NonNull CameraCaptureSession.CaptureCallback captureCallback);

    public static abstract class c {
        void o(@NonNull v4 v4Var) {
        }

        void p(@NonNull v4 v4Var) {
        }

        public void q(@NonNull v4 v4Var) {
        }

        public void r(@NonNull v4 v4Var) {
        }

        void s(@NonNull v4 v4Var) {
        }

        void t(@NonNull v4 v4Var) {
        }

        void u(@NonNull v4 v4Var) {
        }

        void v(@NonNull v4 v4Var, @NonNull Surface surface) {
        }
    }
}
