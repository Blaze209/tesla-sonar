package w;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f120142a;

    interface a {
        void a(@NonNull x.p pVar);
    }

    static final class b extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final CameraDevice.StateCallback f120143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f120144b;

        b(@NonNull Executor executor, @NonNull CameraDevice.StateCallback stateCallback) {
            this.f120144b = executor;
            this.f120143a = stateCallback;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(@NonNull final CameraDevice cameraDevice) {
            this.f120144b.execute(new Runnable() { // from class: w.b0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f120145a.f120143a.onClosed(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(@NonNull final CameraDevice cameraDevice) {
            this.f120144b.execute(new Runnable() { // from class: w.d0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f120150a.f120143a.onDisconnected(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(@NonNull final CameraDevice cameraDevice, final int i11) {
            this.f120144b.execute(new Runnable() { // from class: w.c0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f120147a.f120143a.onError(cameraDevice, i11);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(@NonNull final CameraDevice cameraDevice) {
            this.f120144b.execute(new Runnable() { // from class: w.e0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f120152a.f120143a.onOpened(cameraDevice);
                }
            });
        }
    }

    private a0(@NonNull CameraDevice cameraDevice, @NonNull Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f120142a = new h0(cameraDevice);
        } else {
            this.f120142a = g0.e(cameraDevice, handler);
        }
    }

    @NonNull
    public static a0 b(@NonNull CameraDevice cameraDevice, @NonNull Handler handler) {
        return new a0(cameraDevice, handler);
    }

    public void a(@NonNull x.p pVar) {
        this.f120142a.a(pVar);
    }
}
