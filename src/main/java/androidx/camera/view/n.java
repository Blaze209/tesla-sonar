package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import c0.c1;

/* JADX INFO: loaded from: classes.dex */
class n extends c1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final PointF f3748e = new PointF(2.0f, 2.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final f f3749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Rect f3750c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Matrix f3751d;

    n(@NonNull f fVar) {
        this.f3749b = fVar;
    }

    @Override // c0.c1
    @NonNull
    protected PointF a(float f11, float f12) {
        float[] fArr = {f11, f12};
        synchronized (this) {
            try {
                Matrix matrix = this.f3751d;
                if (matrix == null) {
                    return f3748e;
                }
                matrix.mapPoints(fArr);
                return new PointF(fArr[0], fArr[1]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void f(@NonNull Size size, int i11) {
        Rect rect;
        h0.r.b();
        synchronized (this) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0 && (rect = this.f3750c) != null) {
                    this.f3751d = this.f3749b.c(size, i11, rect);
                    return;
                }
                this.f3751d = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void g(Rect rect) {
        e(new Rational(rect.width(), rect.height()));
        synchronized (this) {
            this.f3750c = rect;
        }
    }
}
