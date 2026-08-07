package ll;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes3.dex */
public class r implements s, e0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final s f90203l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final s f90204m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Rect f90205n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Rect f90206o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final PointF f90207p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final PointF f90208q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final float[] f90209r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final float[] f90210s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final float[] f90211t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f90212u;

    public r(s sVar, s sVar2, Rect rect, Rect rect2, PointF pointF, PointF pointF2) {
        this.f90209r = new float[9];
        this.f90210s = new float[9];
        this.f90211t = new float[9];
        this.f90203l = sVar;
        this.f90204m = sVar2;
        this.f90205n = rect;
        this.f90206o = rect2;
        this.f90207p = pointF;
        this.f90208q = pointF2;
    }

    @Override // ll.s
    public Matrix a(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12) {
        Rect rect2 = this.f90205n;
        Rect rect3 = rect2 != null ? rect2 : rect;
        Rect rect4 = this.f90206o;
        Rect rect5 = rect4 != null ? rect4 : rect;
        s sVar = this.f90203l;
        PointF pointF = this.f90207p;
        sVar.a(matrix, rect3, i11, i12, pointF == null ? f11 : pointF.x, pointF == null ? f12 : pointF.y);
        matrix.getValues(this.f90209r);
        s sVar2 = this.f90204m;
        PointF pointF2 = this.f90208q;
        sVar2.a(matrix, rect5, i11, i12, pointF2 == null ? f11 : pointF2.x, pointF2 == null ? f12 : pointF2.y);
        matrix.getValues(this.f90210s);
        for (int i13 = 0; i13 < 9; i13++) {
            float[] fArr = this.f90211t;
            float f13 = this.f90209r[i13];
            float f14 = this.f90212u;
            fArr[i13] = (f13 * (1.0f - f14)) + (this.f90210s[i13] * f14);
        }
        matrix.setValues(this.f90211t);
        return matrix;
    }

    public void b(float f11) {
        this.f90212u = f11;
    }

    @Override // ll.e0
    public Object getState() {
        return Float.valueOf(this.f90212u);
    }

    public String toString() {
        return String.format("InterpolatingScaleType(%s (%s) -> %s (%s))", String.valueOf(this.f90203l), String.valueOf(this.f90207p), String.valueOf(this.f90204m), String.valueOf(this.f90208q));
    }

    public r(s sVar, s sVar2, Rect rect, Rect rect2) {
        this(sVar, sVar2, rect, rect2, null, null);
    }
}
