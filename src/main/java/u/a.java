package u;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.c2;
import androidx.camera.core.impl.d2;
import androidx.camera.core.impl.i2;
import androidx.camera.core.impl.x0;
import b0.k;
import c0.d0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends k {
    public static final x0.a<Integer> L = x0.a.a("camera2.captureRequest.templateType", Integer.TYPE);
    public static final x0.a<Long> M = x0.a.a("camera2.cameraCaptureSession.streamUseCase", Long.TYPE);
    public static final x0.a<CameraDevice.StateCallback> N = x0.a.a("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class);
    public static final x0.a<CameraCaptureSession.StateCallback> O = x0.a.a("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class);
    public static final x0.a<CameraCaptureSession.CaptureCallback> P = x0.a.a("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class);
    public static final x0.a<Object> Q = x0.a.a("camera2.captureRequest.tag", Object.class);
    public static final x0.a<String> R = x0.a.a("camera2.cameraCaptureSession.physicalCameraId", String.class);

    /* JADX INFO: renamed from: u.a$a, reason: collision with other inner class name */
    public static final class C2464a implements d0<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d2 f115207a = d2.c0();

        @NonNull
        public a a() {
            return new a(i2.b0(this.f115207a));
        }

        @Override // c0.d0
        @NonNull
        public c2 b() {
            return this.f115207a;
        }

        @NonNull
        public C2464a c(@NonNull x0 x0Var) {
            e(x0Var, x0.c.OPTIONAL);
            return this;
        }

        @NonNull
        public C2464a e(@NonNull x0 x0Var, @NonNull x0.c cVar) {
            for (x0.a<?> aVar : x0Var.g()) {
                this.f115207a.m(aVar, cVar, x0Var.a(aVar));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NonNull
        public <ValueT> C2464a f(@NonNull CaptureRequest.Key<ValueT> key, @NonNull ValueT valuet) {
            this.f115207a.K(a.Z(key), valuet);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NonNull
        public <ValueT> C2464a g(@NonNull CaptureRequest.Key<ValueT> key, @NonNull ValueT valuet, @NonNull x0.c cVar) {
            this.f115207a.m(a.Z(key), cVar, valuet);
            return this;
        }
    }

    public a(@NonNull x0 x0Var) {
        super(x0Var);
    }

    @NonNull
    public static x0.a<Object> Z(@NonNull CaptureRequest.Key<?> key) {
        return x0.a.b("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    @NonNull
    public k a0() {
        return k.a.e(getConfig()).c();
    }

    public int b0(int i11) {
        return ((Integer) getConfig().d(L, Integer.valueOf(i11))).intValue();
    }

    public CameraDevice.StateCallback c0(CameraDevice.StateCallback stateCallback) {
        return (CameraDevice.StateCallback) getConfig().d(N, stateCallback);
    }

    public String d0(String str) {
        return (String) getConfig().d(R, str);
    }

    public CameraCaptureSession.CaptureCallback e0(CameraCaptureSession.CaptureCallback captureCallback) {
        return (CameraCaptureSession.CaptureCallback) getConfig().d(P, captureCallback);
    }

    public CameraCaptureSession.StateCallback f0(CameraCaptureSession.StateCallback stateCallback) {
        return (CameraCaptureSession.StateCallback) getConfig().d(O, stateCallback);
    }

    public long g0(long j11) {
        return ((Long) getConfig().d(M, Long.valueOf(j11))).longValue();
    }
}
