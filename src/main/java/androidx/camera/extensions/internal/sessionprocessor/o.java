package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.g3;
import androidx.camera.core.impl.y;
import androidx.camera.core.impl.z;
import c0.y0;
import java.nio.BufferUnderflowException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class o implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<CaptureResult.Key, Object> f3555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g3 f3556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f3557c;

    o(long j11, @NonNull g3 g3Var, @NonNull Map<CaptureResult.Key, Object> map) {
        this.f3555a = map;
        this.f3556b = g3Var;
        this.f3557c = j11;
    }

    @Override // androidx.camera.core.impl.z
    public long a() {
        return this.f3557c;
    }

    @Override // androidx.camera.core.impl.z
    public void b(@NonNull h0.i.b bVar) {
        super.b(bVar);
        try {
            Integer num = (Integer) this.f3555a.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                bVar.m(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            y0.l("KeyValueMapCameraCaptureResult", "Failed to get JPEG orientation.");
        }
        Long l11 = (Long) this.f3555a.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l11 != null) {
            bVar.f(l11.longValue());
        }
        Float f11 = (Float) this.f3555a.get(CaptureResult.LENS_APERTURE);
        if (f11 != null) {
            bVar.l(f11.floatValue());
        }
        Integer numValueOf = (Integer) this.f3555a.get(CaptureResult.SENSOR_SENSITIVITY);
        if (numValueOf != null) {
            Integer num2 = (Integer) this.f3555a.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
            if (num2 != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (num2.intValue() / 100.0f)));
            }
            bVar.k(numValueOf.intValue());
        }
        Float f12 = (Float) this.f3555a.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f12 != null) {
            bVar.h(f12.floatValue());
        }
        Integer num3 = (Integer) this.f3555a.get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            h0.i.c cVar = h0.i.c.AUTO;
            if (num3.intValue() == 0) {
                cVar = h0.i.c.MANUAL;
            }
            bVar.n(cVar);
        }
    }

    @Override // androidx.camera.core.impl.z
    @NonNull
    public g3 c() {
        return this.f3556b;
    }

    @Override // androidx.camera.core.impl.z
    @NonNull
    public androidx.camera.core.impl.v d() {
        Integer num = (Integer) this.f3555a.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return androidx.camera.core.impl.v.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return androidx.camera.core.impl.v.INACTIVE;
            case 1:
            case 3:
                return androidx.camera.core.impl.v.SCANNING;
            case 2:
                return androidx.camera.core.impl.v.PASSIVE_FOCUSED;
            case 4:
                return androidx.camera.core.impl.v.LOCKED_FOCUSED;
            case 5:
                return androidx.camera.core.impl.v.LOCKED_NOT_FOCUSED;
            case 6:
                return androidx.camera.core.impl.v.PASSIVE_NOT_FOCUSED;
            default:
                y0.c("KeyValueMapCameraCaptureResult", "Undefined af state: " + num);
                return androidx.camera.core.impl.v.UNKNOWN;
        }
    }

    @Override // androidx.camera.core.impl.z
    @NonNull
    public androidx.camera.core.impl.x e() {
        Integer num = (Integer) this.f3555a.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return androidx.camera.core.impl.x.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return androidx.camera.core.impl.x.INACTIVE;
        }
        if (iIntValue == 1) {
            return androidx.camera.core.impl.x.METERING;
        }
        if (iIntValue == 2) {
            return androidx.camera.core.impl.x.CONVERGED;
        }
        if (iIntValue == 3) {
            return androidx.camera.core.impl.x.LOCKED;
        }
        y0.c("KeyValueMapCameraCaptureResult", "Undefined awb state: " + num);
        return androidx.camera.core.impl.x.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.z
    @NonNull
    public androidx.camera.core.impl.u f() {
        Integer num = (Integer) this.f3555a.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return androidx.camera.core.impl.u.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue == 1 || iIntValue == 2) {
                return androidx.camera.core.impl.u.ON_MANUAL_AUTO;
            }
            if (iIntValue == 3 || iIntValue == 4) {
                return androidx.camera.core.impl.u.ON_CONTINUOUS_AUTO;
            }
            if (iIntValue != 5) {
                y0.c("KeyValueMapCameraCaptureResult", "Undefined af mode: " + num);
                return androidx.camera.core.impl.u.UNKNOWN;
            }
        }
        return androidx.camera.core.impl.u.OFF;
    }

    @Override // androidx.camera.core.impl.z
    @NonNull
    public androidx.camera.core.impl.t g() {
        Integer num = (Integer) this.f3555a.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return androidx.camera.core.impl.t.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return androidx.camera.core.impl.t.INACTIVE;
        }
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return androidx.camera.core.impl.t.CONVERGED;
            }
            if (iIntValue == 3) {
                return androidx.camera.core.impl.t.LOCKED;
            }
            if (iIntValue == 4) {
                return androidx.camera.core.impl.t.FLASH_REQUIRED;
            }
            if (iIntValue != 5) {
                y0.c("KeyValueMapCameraCaptureResult", "Undefined ae state: " + num);
                return androidx.camera.core.impl.t.UNKNOWN;
            }
        }
        return androidx.camera.core.impl.t.SEARCHING;
    }

    @Override // androidx.camera.core.impl.z
    @NonNull
    public y h() {
        Integer num = (Integer) this.f3555a.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return y.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            return y.NONE;
        }
        if (iIntValue == 2) {
            return y.READY;
        }
        if (iIntValue == 3 || iIntValue == 4) {
            return y.FIRED;
        }
        y0.c("KeyValueMapCameraCaptureResult", "Undefined flash state: " + num);
        return y.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.z
    @NonNull
    public androidx.camera.core.impl.w i() {
        Integer num = (Integer) this.f3555a.get(CaptureResult.CONTROL_AWB_MODE);
        if (num == null) {
            return androidx.camera.core.impl.w.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return androidx.camera.core.impl.w.OFF;
            case 1:
                return androidx.camera.core.impl.w.AUTO;
            case 2:
                return androidx.camera.core.impl.w.INCANDESCENT;
            case 3:
                return androidx.camera.core.impl.w.FLUORESCENT;
            case 4:
                return androidx.camera.core.impl.w.WARM_FLUORESCENT;
            case 5:
                return androidx.camera.core.impl.w.DAYLIGHT;
            case 6:
                return androidx.camera.core.impl.w.CLOUDY_DAYLIGHT;
            case 7:
                return androidx.camera.core.impl.w.TWILIGHT;
            case 8:
                return androidx.camera.core.impl.w.SHADE;
            default:
                return androidx.camera.core.impl.w.UNKNOWN;
        }
    }

    @Override // androidx.camera.core.impl.z
    public CaptureResult j() {
        return null;
    }

    @Override // androidx.camera.core.impl.z
    @NonNull
    public androidx.camera.core.impl.s k() {
        Integer num = (Integer) this.f3555a.get(CaptureResult.CONTROL_AE_MODE);
        if (num == null) {
            return androidx.camera.core.impl.s.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return androidx.camera.core.impl.s.OFF;
        }
        if (iIntValue == 1) {
            return androidx.camera.core.impl.s.ON;
        }
        if (iIntValue == 2) {
            return androidx.camera.core.impl.s.ON_AUTO_FLASH;
        }
        if (iIntValue == 3) {
            return androidx.camera.core.impl.s.ON_ALWAYS_FLASH;
        }
        if (iIntValue != 4) {
            return iIntValue != 5 ? androidx.camera.core.impl.s.UNKNOWN : androidx.camera.core.impl.s.ON_EXTERNAL_FLASH;
        }
        return androidx.camera.core.impl.s.ON_AUTO_FLASH_REDEYE;
    }
}
