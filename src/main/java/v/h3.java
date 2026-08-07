package v;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import androidx.camera.core.CameraControl;

/* JADX INFO: loaded from: classes.dex */
final class h3 implements s5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w.z f117016a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.concurrent.futures.c.a<Void> f117018c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Rect f117017b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Rect f117019d = null;

    h3(@NonNull w.z zVar) {
        this.f117016a = zVar;
    }

    @NonNull
    private static Rect h(@NonNull Rect rect, float f11) {
        float fWidth = rect.width() / f11;
        float fHeight = rect.height() / f11;
        float fWidth2 = (rect.width() - fWidth) / 2.0f;
        float fHeight2 = (rect.height() - fHeight) / 2.0f;
        return new Rect((int) fWidth2, (int) fHeight2, (int) (fWidth2 + fWidth), (int) (fHeight2 + fHeight));
    }

    private Rect i() {
        return (Rect) u5.h.g((Rect) this.f117016a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    @Override // v.s5.b
    public void a(@NonNull TotalCaptureResult totalCaptureResult) {
        if (this.f117018c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.f117019d;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.f117018c.c(null);
            this.f117018c = null;
            this.f117019d = null;
        }
    }

    @Override // v.s5.b
    public float b() {
        return 1.0f;
    }

    @Override // v.s5.b
    public float c() {
        Float f11 = (Float) this.f117016a.a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f11 == null) {
            return 1.0f;
        }
        return f11.floatValue() < b() ? b() : f11.floatValue();
    }

    @Override // v.s5.b
    public void d(float f11, @NonNull androidx.concurrent.futures.c.a<Void> aVar) {
        this.f117017b = h(i(), f11);
        androidx.concurrent.futures.c.a<Void> aVar2 = this.f117018c;
        if (aVar2 != null) {
            aVar2.f(new CameraControl.OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.f117019d = this.f117017b;
        this.f117018c = aVar;
    }

    @Override // v.s5.b
    public void e() {
        this.f117019d = null;
        this.f117017b = null;
        androidx.concurrent.futures.c.a<Void> aVar = this.f117018c;
        if (aVar != null) {
            aVar.f(new CameraControl.OperationCanceledException("Camera is not active."));
            this.f117018c = null;
        }
    }

    @Override // v.s5.b
    public void f(@NonNull u.a.C2464a c2464a) {
        Rect rect = this.f117017b;
        if (rect != null) {
            c2464a.g(CaptureRequest.SCALER_CROP_REGION, rect, androidx.camera.core.impl.x0.c.REQUIRED);
        }
    }

    @Override // v.s5.b
    @NonNull
    public Rect g() {
        Rect rect = this.f117017b;
        return rect != null ? rect : i();
    }
}
