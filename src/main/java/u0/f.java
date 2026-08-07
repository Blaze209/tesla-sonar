package u0;

import android.hardware.camera2.CaptureResult;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.g3;
import androidx.camera.core.impl.s;
import androidx.camera.core.impl.t;
import androidx.camera.core.impl.u;
import androidx.camera.core.impl.v;
import androidx.camera.core.impl.w;
import androidx.camera.core.impl.x;
import androidx.camera.core.impl.y;
import androidx.camera.core.impl.z;
import c0.y0;
import java.nio.BufferUnderflowException;

/* JADX INFO: loaded from: classes.dex */
public class f implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g3 f115224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CaptureResult f115225b;

    public f(@NonNull g3 g3Var, @NonNull CaptureResult captureResult) {
        this.f115224a = g3Var;
        this.f115225b = captureResult;
    }

    @Override // androidx.camera.core.impl.z
    public long a() {
        Long l11 = (Long) this.f115225b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l11 == null) {
            return -1L;
        }
        return l11.longValue();
    }

    @Override // androidx.camera.core.impl.z
    public void b(@NonNull h0.i.b bVar) {
        super.b(bVar);
        try {
            Integer num = (Integer) this.f115225b.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                bVar.m(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            y0.l("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        Long l11 = (Long) this.f115225b.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l11 != null) {
            bVar.f(l11.longValue());
        }
        Float f11 = (Float) this.f115225b.get(CaptureResult.LENS_APERTURE);
        if (f11 != null) {
            bVar.l(f11.floatValue());
        }
        Integer numValueOf = (Integer) this.f115225b.get(CaptureResult.SENSOR_SENSITIVITY);
        if (numValueOf != null) {
            Integer num2 = (Integer) this.f115225b.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
            if (num2 != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (num2.intValue() / 100.0f)));
            }
            bVar.k(numValueOf.intValue());
        }
        Float f12 = (Float) this.f115225b.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f12 != null) {
            bVar.h(f12.floatValue());
        }
        Integer num3 = (Integer) this.f115225b.get(CaptureResult.CONTROL_AWB_MODE);
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
        return this.f115224a;
    }

    @Override // androidx.camera.core.impl.z
    @NonNull
    public v d() {
        Integer num = (Integer) this.f115225b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return v.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return v.INACTIVE;
            case 1:
            case 3:
                return v.SCANNING;
            case 2:
                return v.PASSIVE_FOCUSED;
            case 4:
                return v.LOCKED_FOCUSED;
            case 5:
                return v.LOCKED_NOT_FOCUSED;
            case 6:
                return v.PASSIVE_NOT_FOCUSED;
            default:
                y0.c("C2CameraCaptureResult", "Undefined af state: " + num);
                return v.UNKNOWN;
        }
    }

    @Override // androidx.camera.core.impl.z
    @NonNull
    public x e() {
        Integer num = (Integer) this.f115225b.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return x.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return x.INACTIVE;
        }
        if (iIntValue == 1) {
            return x.METERING;
        }
        if (iIntValue == 2) {
            return x.CONVERGED;
        }
        if (iIntValue == 3) {
            return x.LOCKED;
        }
        y0.c("C2CameraCaptureResult", "Undefined awb state: " + num);
        return x.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.z
    @NonNull
    public u f() {
        Integer num = (Integer) this.f115225b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return u.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue == 1 || iIntValue == 2) {
                return u.ON_MANUAL_AUTO;
            }
            if (iIntValue == 3 || iIntValue == 4) {
                return u.ON_CONTINUOUS_AUTO;
            }
            if (iIntValue != 5) {
                y0.c("C2CameraCaptureResult", "Undefined af mode: " + num);
                return u.UNKNOWN;
            }
        }
        return u.OFF;
    }

    @Override // androidx.camera.core.impl.z
    @NonNull
    public t g() {
        Integer num = (Integer) this.f115225b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return t.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return t.INACTIVE;
        }
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return t.CONVERGED;
            }
            if (iIntValue == 3) {
                return t.LOCKED;
            }
            if (iIntValue == 4) {
                return t.FLASH_REQUIRED;
            }
            if (iIntValue != 5) {
                y0.c("C2CameraCaptureResult", "Undefined ae state: " + num);
                return t.UNKNOWN;
            }
        }
        return t.SEARCHING;
    }

    @Override // androidx.camera.core.impl.z
    @NonNull
    public y h() {
        Integer num = (Integer) this.f115225b.get(CaptureResult.FLASH_STATE);
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
        y0.c("C2CameraCaptureResult", "Undefined flash state: " + num);
        return y.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.z
    @NonNull
    public w i() {
        Integer num = (Integer) this.f115225b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num == null) {
            return w.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return w.OFF;
            case 1:
                return w.AUTO;
            case 2:
                return w.INCANDESCENT;
            case 3:
                return w.FLUORESCENT;
            case 4:
                return w.WARM_FLUORESCENT;
            case 5:
                return w.DAYLIGHT;
            case 6:
                return w.CLOUDY_DAYLIGHT;
            case 7:
                return w.TWILIGHT;
            case 8:
                return w.SHADE;
            default:
                return w.UNKNOWN;
        }
    }

    @Override // androidx.camera.core.impl.z
    @NonNull
    public CaptureResult j() {
        return this.f115225b;
    }

    @Override // androidx.camera.core.impl.z
    @NonNull
    public s k() {
        Integer num = (Integer) this.f115225b.get(CaptureResult.CONTROL_AE_MODE);
        if (num == null) {
            return s.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return s.OFF;
        }
        if (iIntValue == 1) {
            return s.ON;
        }
        if (iIntValue == 2) {
            return s.ON_AUTO_FLASH;
        }
        if (iIntValue == 3) {
            return s.ON_ALWAYS_FLASH;
        }
        if (iIntValue != 4) {
            return iIntValue != 5 ? s.UNKNOWN : s.ON_EXTERNAL_FLASH;
        }
        return s.ON_AUTO_FLASH_REDEYE;
    }

    public f(@NonNull CaptureResult captureResult) {
        this(g3.b(), captureResult);
    }
}
