package w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f120154a;

    interface a {
        @NonNull
        CameraCaptureSession a();

        int b(@NonNull List<CaptureRequest> list, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback);

        int c(@NonNull CaptureRequest captureRequest, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback);
    }

    static final class b extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final CameraCaptureSession.CaptureCallback f120155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f120156b;

        b(@NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) {
            this.f120156b = executor;
            this.f120155a = captureCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(@NonNull final CameraCaptureSession cameraCaptureSession, @NonNull final CaptureRequest captureRequest, @NonNull final Surface surface, final long j11) {
            this.f120156b.execute(new Runnable() { // from class: w.l
                @Override // java.lang.Runnable
                public final void run() {
                    c.a(this.f120186a.f120155a, cameraCaptureSession, captureRequest, surface, j11);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull final CameraCaptureSession cameraCaptureSession, @NonNull final CaptureRequest captureRequest, @NonNull final TotalCaptureResult totalCaptureResult) {
            this.f120156b.execute(new Runnable() { // from class: w.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f120164a.f120155a.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull final CameraCaptureSession cameraCaptureSession, @NonNull final CaptureRequest captureRequest, @NonNull final CaptureFailure captureFailure) {
            this.f120156b.execute(new Runnable() { // from class: w.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f120181a.f120155a.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(@NonNull final CameraCaptureSession cameraCaptureSession, @NonNull final CaptureRequest captureRequest, @NonNull final CaptureResult captureResult) {
            this.f120156b.execute(new Runnable() { // from class: w.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f120168a.f120155a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(@NonNull final CameraCaptureSession cameraCaptureSession, final int i11) {
            this.f120156b.execute(new Runnable() { // from class: w.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f120193a.f120155a.onCaptureSequenceAborted(cameraCaptureSession, i11);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(@NonNull final CameraCaptureSession cameraCaptureSession, final int i11, final long j11) {
            this.f120156b.execute(new Runnable() { // from class: w.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f120175a.f120155a.onCaptureSequenceCompleted(cameraCaptureSession, i11, j11);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(@NonNull final CameraCaptureSession cameraCaptureSession, @NonNull final CaptureRequest captureRequest, final long j11, final long j12) {
            this.f120156b.execute(new Runnable() { // from class: w.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f120159a.f120155a.onCaptureStarted(cameraCaptureSession, captureRequest, j11, j12);
                }
            });
        }
    }

    static final class c extends CameraCaptureSession.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final CameraCaptureSession.StateCallback f120157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f120158b;

        c(@NonNull Executor executor, @NonNull CameraCaptureSession.StateCallback stateCallback) {
            this.f120158b = executor;
            this.f120157a = stateCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(@NonNull final CameraCaptureSession cameraCaptureSession) {
            this.f120158b.execute(new Runnable() { // from class: w.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f120202a.f120157a.onActive(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(@NonNull final CameraCaptureSession cameraCaptureSession) {
            this.f120158b.execute(new Runnable() { // from class: w.q
                @Override // java.lang.Runnable
                public final void run() {
                    d.a(this.f120209a.f120157a, cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(@NonNull final CameraCaptureSession cameraCaptureSession) {
            this.f120158b.execute(new Runnable() { // from class: w.o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f120204a.f120157a.onClosed(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(@NonNull final CameraCaptureSession cameraCaptureSession) {
            this.f120158b.execute(new Runnable() { // from class: w.t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f120224a.f120157a.onConfigureFailed(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(@NonNull final CameraCaptureSession cameraCaptureSession) {
            this.f120158b.execute(new Runnable() { // from class: w.r
                @Override // java.lang.Runnable
                public final void run() {
                    this.f120215a.f120157a.onConfigured(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(@NonNull final CameraCaptureSession cameraCaptureSession) {
            this.f120158b.execute(new Runnable() { // from class: w.s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f120222a.f120157a.onReady(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(@NonNull final CameraCaptureSession cameraCaptureSession, @NonNull final Surface surface) {
            this.f120158b.execute(new Runnable() { // from class: w.p
                @Override // java.lang.Runnable
                public final void run() {
                    b.a(this.f120206a.f120157a, cameraCaptureSession, surface);
                }
            });
        }
    }

    private f(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f120154a = new u(cameraCaptureSession);
        } else {
            this.f120154a = v.d(cameraCaptureSession, handler);
        }
    }

    @NonNull
    public static f d(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull Handler handler) {
        return new f(cameraCaptureSession, handler);
    }

    public int a(@NonNull List<CaptureRequest> list, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f120154a.b(list, executor, captureCallback);
    }

    public int b(@NonNull CaptureRequest captureRequest, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f120154a.c(captureRequest, executor, captureCallback);
    }

    @NonNull
    public CameraCaptureSession c() {
        return this.f120154a.a();
    }
}
