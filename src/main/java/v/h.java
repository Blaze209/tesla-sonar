package v;

import android.hardware.camera2.CaptureResult;
import android.os.Build;
import androidx.annotation.NonNull;
import java.nio.BufferUnderflowException;

/* JADX INFO: loaded from: classes.dex */
public class h implements androidx.camera.core.impl.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.camera.core.impl.g3 f117012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CaptureResult f117013b;

    public h(@NonNull androidx.camera.core.impl.g3 g3Var, @NonNull CaptureResult captureResult) {
        this.f117012a = g3Var;
        this.f117013b = captureResult;
    }

    @Override // androidx.camera.core.impl.z
    public long a() {
        Long l11 = (Long) this.f117013b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l11 == null) {
            return -1L;
        }
        return l11.longValue();
    }

    @Override // androidx.camera.core.impl.z
    public void b(@NonNull h0.i.b bVar) {
        super.b(bVar);
        try {
            Integer num = (Integer) this.f117013b.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                bVar.m(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            c0.y0.l("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        Long l11 = (Long) this.f117013b.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l11 != null) {
            bVar.f(l11.longValue());
        }
        Float f11 = (Float) this.f117013b.get(CaptureResult.LENS_APERTURE);
        if (f11 != null) {
            bVar.l(f11.floatValue());
        }
        Integer numValueOf = (Integer) this.f117013b.get(CaptureResult.SENSOR_SENSITIVITY);
        if (numValueOf != null) {
            Integer num2 = (Integer) this.f117013b.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
            if (num2 != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (num2.intValue() / 100.0f)));
            }
            bVar.k(numValueOf.intValue());
        }
        Float f12 = (Float) this.f117013b.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f12 != null) {
            bVar.h(f12.floatValue());
        }
        Integer num3 = (Integer) this.f117013b.get(CaptureResult.CONTROL_AWB_MODE);
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
    public androidx.camera.core.impl.g3 c() {
        return this.f117012a;
    }

    @Override // androidx.camera.core.impl.z
    @NonNull
    public androidx.camera.core.impl.v d() {
        Integer num = (Integer) this.f117013b.get(CaptureResult.CONTROL_AF_STATE);
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
                c0.y0.c("C2CameraCaptureResult", "Undefined af state: " + num);
                return androidx.camera.core.impl.v.UNKNOWN;
        }
    }

    @Override // androidx.camera.core.impl.z
    @NonNull
    public androidx.camera.core.impl.x e() {
        Integer num = (Integer) this.f117013b.get(CaptureResult.CONTROL_AWB_STATE);
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
        c0.y0.c("C2CameraCaptureResult", "Undefined awb state: " + num);
        return androidx.camera.core.impl.x.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.z
    @NonNull
    public androidx.camera.core.impl.u f() {
        Integer num = (Integer) this.f117013b.get(CaptureResult.CONTROL_AF_MODE);
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
                c0.y0.c("C2CameraCaptureResult", "Undefined af mode: " + num);
                return androidx.camera.core.impl.u.UNKNOWN;
            }
        }
        return androidx.camera.core.impl.u.OFF;
    }

    @Override // androidx.camera.core.impl.z
    @NonNull
    public androidx.camera.core.impl.t g() {
        Integer num = (Integer) this.f117013b.get(CaptureResult.CONTROL_AE_STATE);
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
                c0.y0.c("C2CameraCaptureResult", "Undefined ae state: " + num);
                return androidx.camera.core.impl.t.UNKNOWN;
            }
        }
        return androidx.camera.core.impl.t.SEARCHING;
    }

    @Override // androidx.camera.core.impl.z
    @NonNull
    public androidx.camera.core.impl.y h() {
        Integer num = (Integer) this.f117013b.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return androidx.camera.core.impl.y.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            return androidx.camera.core.impl.y.NONE;
        }
        if (iIntValue == 2) {
            return androidx.camera.core.impl.y.READY;
        }
        if (iIntValue == 3 || iIntValue == 4) {
            return androidx.camera.core.impl.y.FIRED;
        }
        c0.y0.c("C2CameraCaptureResult", "Undefined flash state: " + num);
        return androidx.camera.core.impl.y.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.z
    @NonNull
    public androidx.camera.core.impl.w i() {
        Integer num = (Integer) this.f117013b.get(CaptureResult.CONTROL_AWB_MODE);
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
    @NonNull
    public CaptureResult j() {
        return this.f117013b;
    }

    @Override // androidx.camera.core.impl.z
    @NonNull
    public androidx.camera.core.impl.s k() {
        Integer num = (Integer) this.f117013b.get(CaptureResult.CONTROL_AE_MODE);
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
        if (iIntValue == 4) {
            return androidx.camera.core.impl.s.ON_AUTO_FLASH_REDEYE;
        }
        if (iIntValue != 5) {
            return androidx.camera.core.impl.s.UNKNOWN;
        }
        return Build.VERSION.SDK_INT >= 28 ? androidx.camera.core.impl.s.ON_EXTERNAL_FLASH : androidx.camera.core.impl.s.UNKNOWN;
    }

    public h(@NonNull CaptureResult captureResult) {
        this(androidx.camera.core.impl.g3.b(), captureResult);
    }
}
