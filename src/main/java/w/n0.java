package w;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class n0 extends q0 {
    n0(@NonNull Context context) {
        super(context, null);
    }

    static n0 i(@NonNull Context context) {
        return new n0(context);
    }

    private boolean j(@NonNull Throwable th2) {
        return Build.VERSION.SDK_INT == 28 && k(th2);
    }

    private static boolean k(@NonNull Throwable th2) {
        StackTraceElement[] stackTrace;
        if (!th2.getClass().equals(RuntimeException.class) || (stackTrace = th2.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    private void l(@NonNull Throwable th2) throws CameraAccessExceptionCompat {
        throw new CameraAccessExceptionCompat(10001, th2);
    }

    @Override // w.q0, w.m0.b
    public void a(@NonNull Executor executor, @NonNull CameraManager.AvailabilityCallback availabilityCallback) {
        this.f120211a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // w.q0, w.m0.b
    public void b(@NonNull String str, @NonNull Executor executor, @NonNull CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        try {
            this.f120211a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e11) {
            throw CameraAccessExceptionCompat.e(e11);
        } catch (IllegalArgumentException e12) {
        } catch (SecurityException e13) {
            throw e13;
        } catch (RuntimeException e14) {
            if (j(e14)) {
                l(e14);
            }
            throw e14;
        }
    }

    @Override // w.q0, w.m0.b
    @NonNull
    public CameraCharacteristics d(@NonNull String str) throws CameraAccessExceptionCompat {
        try {
            return super.d(str);
        } catch (RuntimeException e11) {
            if (j(e11)) {
                l(e11);
            }
            throw e11;
        }
    }

    @Override // w.q0, w.m0.b
    public void g(@NonNull CameraManager.AvailabilityCallback availabilityCallback) {
        this.f120211a.unregisterAvailabilityCallback(availabilityCallback);
    }
}
