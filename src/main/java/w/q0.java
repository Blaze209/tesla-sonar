package w;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class q0 implements m0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final CameraManager f120211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f120212b;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<CameraManager.AvailabilityCallback, m0.a> f120213a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Handler f120214b;

        a(@NonNull Handler handler) {
            this.f120214b = handler;
        }
    }

    q0(@NonNull Context context, Object obj) {
        this.f120211a = (CameraManager) context.getSystemService("camera");
        this.f120212b = obj;
    }

    static q0 h(@NonNull Context context, @NonNull Handler handler) {
        return new q0(context, new a(handler));
    }

    @Override // w.m0.b
    public void a(@NonNull Executor executor, @NonNull CameraManager.AvailabilityCallback availabilityCallback) {
        m0.a aVar;
        if (executor == null) {
            throw new IllegalArgumentException("executor was null");
        }
        a aVar2 = (a) this.f120212b;
        if (availabilityCallback != null) {
            synchronized (aVar2.f120213a) {
                try {
                    aVar = aVar2.f120213a.get(availabilityCallback);
                    if (aVar == null) {
                        aVar = new m0.a(executor, availabilityCallback);
                        aVar2.f120213a.put(availabilityCallback, aVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            aVar = null;
        }
        this.f120211a.registerAvailabilityCallback(aVar, aVar2.f120214b);
    }

    @Override // w.m0.b
    public void b(@NonNull String str, @NonNull Executor executor, @NonNull CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        u5.h.g(executor);
        u5.h.g(stateCallback);
        try {
            this.f120211a.openCamera(str, new a0.b(executor, stateCallback), ((a) this.f120212b).f120214b);
        } catch (CameraAccessException e11) {
            throw CameraAccessExceptionCompat.e(e11);
        }
    }

    @Override // w.m0.b
    @NonNull
    public CameraCharacteristics d(@NonNull String str) throws CameraAccessExceptionCompat {
        try {
            return this.f120211a.getCameraCharacteristics(str);
        } catch (CameraAccessException e11) {
            throw CameraAccessExceptionCompat.e(e11);
        }
    }

    @Override // w.m0.b
    @NonNull
    public Set<Set<String>> e() {
        return Collections.EMPTY_SET;
    }

    @Override // w.m0.b
    @NonNull
    public String[] f() throws CameraAccessExceptionCompat {
        try {
            return this.f120211a.getCameraIdList();
        } catch (CameraAccessException e11) {
            throw CameraAccessExceptionCompat.e(e11);
        }
    }

    @Override // w.m0.b
    public void g(@NonNull CameraManager.AvailabilityCallback availabilityCallback) {
        m0.a aVarRemove;
        if (availabilityCallback != null) {
            a aVar = (a) this.f120212b;
            synchronized (aVar.f120213a) {
                aVarRemove = aVar.f120213a.remove(availabilityCallback);
            }
        } else {
            aVarRemove = null;
        }
        if (aVarRemove != null) {
            aVarRemove.d();
        }
        this.f120211a.unregisterAvailabilityCallback(aVarRemove);
    }
}
