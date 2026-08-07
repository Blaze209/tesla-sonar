package v;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.annotation.NonNull;
import androidx.camera.core.CameraControl;

/* JADX INFO: loaded from: classes.dex */
final class c implements s5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w.z f116849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Range<Float> f116850b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.concurrent.futures.c.a<Void> f116852d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f116854f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f116851c = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f116853e = 1.0f;

    c(@NonNull w.z zVar) {
        this.f116854f = false;
        this.f116849a = zVar;
        this.f116850b = (Range) zVar.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        this.f116854f = zVar.f();
    }

    @Override // v.s5.b
    public void a(@NonNull TotalCaptureResult totalCaptureResult) {
        if (this.f116852d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f11 = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f11 == null) {
                return;
            }
            if (this.f116853e == f11.floatValue()) {
                this.f116852d.c(null);
                this.f116852d = null;
            }
        }
    }

    @Override // v.s5.b
    public float b() {
        return ((Float) this.f116850b.getLower()).floatValue();
    }

    @Override // v.s5.b
    public float c() {
        return ((Float) this.f116850b.getUpper()).floatValue();
    }

    @Override // v.s5.b
    public void d(float f11, @NonNull androidx.concurrent.futures.c.a<Void> aVar) {
        this.f116851c = f11;
        androidx.concurrent.futures.c.a<Void> aVar2 = this.f116852d;
        if (aVar2 != null) {
            aVar2.f(new CameraControl.OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.f116853e = this.f116851c;
        this.f116852d = aVar;
    }

    @Override // v.s5.b
    public void e() {
        this.f116851c = 1.0f;
        androidx.concurrent.futures.c.a<Void> aVar = this.f116852d;
        if (aVar != null) {
            aVar.f(new CameraControl.OperationCanceledException("Camera is not active."));
            this.f116852d = null;
        }
    }

    @Override // v.s5.b
    public void f(@NonNull u.a.C2464a c2464a) {
        CaptureRequest.Key key = CaptureRequest.CONTROL_ZOOM_RATIO;
        Float fValueOf = Float.valueOf(this.f116851c);
        androidx.camera.core.impl.x0.c cVar = androidx.camera.core.impl.x0.c.REQUIRED;
        c2464a.g(key, fValueOf, cVar);
        if (this.f116854f) {
            x.b.a(c2464a, cVar);
        }
    }

    @Override // v.s5.b
    @NonNull
    public Rect g() {
        return (Rect) u5.h.g((Rect) this.f116849a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }
}
