package wf;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;
import tf.d0;

/* JADX INFO: loaded from: classes3.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Matrix f121769a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix f121770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix f121771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Matrix f121772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float[] f121773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a<PointF, PointF> f121774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a<?, PointF> f121775g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a<ig.d, ig.d> f121776h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a<Float, Float> f121777i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a<Integer, Integer> f121778j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private d f121779k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private d f121780l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private a<?, Float> f121781m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a<?, Float> f121782n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f121783o;

    public p(bg.n nVar) {
        this.f121774f = nVar.c() == null ? null : nVar.c().a();
        this.f121775g = nVar.f() == null ? null : nVar.f().a();
        this.f121776h = nVar.h() == null ? null : nVar.h().a();
        this.f121777i = nVar.g() == null ? null : nVar.g().a();
        this.f121779k = nVar.i() == null ? null : nVar.i().a();
        this.f121783o = nVar.l();
        if (this.f121779k != null) {
            this.f121770b = new Matrix();
            this.f121771c = new Matrix();
            this.f121772d = new Matrix();
            this.f121773e = new float[9];
        } else {
            this.f121770b = null;
            this.f121771c = null;
            this.f121772d = null;
            this.f121773e = null;
        }
        this.f121780l = nVar.j() == null ? null : nVar.j().a();
        if (nVar.e() != null) {
            this.f121778j = nVar.e().a();
        }
        if (nVar.k() != null) {
            this.f121781m = nVar.k().a();
        } else {
            this.f121781m = null;
        }
        if (nVar.d() != null) {
            this.f121782n = nVar.d().a();
        } else {
            this.f121782n = null;
        }
    }

    private void d() {
        for (int i11 = 0; i11 < 9; i11++) {
            this.f121773e[i11] = 0.0f;
        }
    }

    public void a(dg.b bVar) {
        bVar.j(this.f121778j);
        bVar.j(this.f121781m);
        bVar.j(this.f121782n);
        bVar.j(this.f121774f);
        bVar.j(this.f121775g);
        bVar.j(this.f121776h);
        bVar.j(this.f121777i);
        bVar.j(this.f121779k);
        bVar.j(this.f121780l);
    }

    public void b(a.b bVar) {
        a<Integer, Integer> aVar = this.f121778j;
        if (aVar != null) {
            aVar.a(bVar);
        }
        a<?, Float> aVar2 = this.f121781m;
        if (aVar2 != null) {
            aVar2.a(bVar);
        }
        a<?, Float> aVar3 = this.f121782n;
        if (aVar3 != null) {
            aVar3.a(bVar);
        }
        a<PointF, PointF> aVar4 = this.f121774f;
        if (aVar4 != null) {
            aVar4.a(bVar);
        }
        a<?, PointF> aVar5 = this.f121775g;
        if (aVar5 != null) {
            aVar5.a(bVar);
        }
        a<ig.d, ig.d> aVar6 = this.f121776h;
        if (aVar6 != null) {
            aVar6.a(bVar);
        }
        a<Float, Float> aVar7 = this.f121777i;
        if (aVar7 != null) {
            aVar7.a(bVar);
        }
        d dVar = this.f121779k;
        if (dVar != null) {
            dVar.a(bVar);
        }
        d dVar2 = this.f121780l;
        if (dVar2 != null) {
            dVar2.a(bVar);
        }
    }

    public <T> boolean c(T t11, ig.c<T> cVar) {
        Float fValueOf = Float.valueOf(100.0f);
        Float fValueOf2 = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        if (t11 == d0.f113277f) {
            a<PointF, PointF> aVar = this.f121774f;
            if (aVar == null) {
                this.f121774f = new q(cVar, new PointF());
                return true;
            }
            aVar.o(cVar);
            return true;
        }
        if (t11 == d0.f113278g) {
            a<?, PointF> aVar2 = this.f121775g;
            if (aVar2 == null) {
                this.f121775g = new q(cVar, new PointF());
                return true;
            }
            aVar2.o(cVar);
            return true;
        }
        if (t11 == d0.f113279h) {
            a<?, PointF> aVar3 = this.f121775g;
            if (aVar3 instanceof n) {
                ((n) aVar3).t(cVar);
                return true;
            }
        }
        if (t11 == d0.f113280i) {
            a<?, PointF> aVar4 = this.f121775g;
            if (aVar4 instanceof n) {
                ((n) aVar4).u(cVar);
                return true;
            }
        }
        if (t11 == d0.f113286o) {
            a<ig.d, ig.d> aVar5 = this.f121776h;
            if (aVar5 == null) {
                this.f121776h = new q(cVar, new ig.d());
                return true;
            }
            aVar5.o(cVar);
            return true;
        }
        if (t11 == d0.f113287p) {
            a<Float, Float> aVar6 = this.f121777i;
            if (aVar6 == null) {
                this.f121777i = new q(cVar, fValueOf2);
                return true;
            }
            aVar6.o(cVar);
            return true;
        }
        if (t11 == d0.f113274c) {
            a<Integer, Integer> aVar7 = this.f121778j;
            if (aVar7 == null) {
                this.f121778j = new q(cVar, 100);
                return true;
            }
            aVar7.o(cVar);
            return true;
        }
        if (t11 == d0.C) {
            a<?, Float> aVar8 = this.f121781m;
            if (aVar8 == null) {
                this.f121781m = new q(cVar, fValueOf);
                return true;
            }
            aVar8.o(cVar);
            return true;
        }
        if (t11 == d0.D) {
            a<?, Float> aVar9 = this.f121782n;
            if (aVar9 == null) {
                this.f121782n = new q(cVar, fValueOf);
                return true;
            }
            aVar9.o(cVar);
            return true;
        }
        if (t11 == d0.f113288q) {
            if (this.f121779k == null) {
                this.f121779k = new d(Collections.singletonList(new ig.a(fValueOf2)));
            }
            this.f121779k.o(cVar);
            return true;
        }
        if (t11 != d0.f113289r) {
            return false;
        }
        if (this.f121780l == null) {
            this.f121780l = new d(Collections.singletonList(new ig.a(fValueOf2)));
        }
        this.f121780l.o(cVar);
        return true;
    }

    public a<?, Float> e() {
        return this.f121782n;
    }

    public Matrix f() {
        PointF pointFH;
        ig.d dVarH;
        PointF pointFH2;
        this.f121769a.reset();
        a<?, PointF> aVar = this.f121775g;
        if (aVar != null && (pointFH2 = aVar.h()) != null) {
            float f11 = pointFH2.x;
            if (f11 != BitmapDescriptorFactory.HUE_RED || pointFH2.y != BitmapDescriptorFactory.HUE_RED) {
                this.f121769a.preTranslate(f11, pointFH2.y);
            }
        }
        if (!this.f121783o) {
            a<Float, Float> aVar2 = this.f121777i;
            if (aVar2 != null) {
                float fFloatValue = aVar2 instanceof q ? aVar2.h().floatValue() : ((d) aVar2).r();
                if (fFloatValue != BitmapDescriptorFactory.HUE_RED) {
                    this.f121769a.preRotate(fFloatValue);
                }
            }
        } else if (aVar != null) {
            float f12 = aVar.f();
            PointF pointFH3 = aVar.h();
            float f13 = pointFH3.x;
            float f14 = pointFH3.y;
            aVar.n(1.0E-4f + f12);
            PointF pointFH4 = aVar.h();
            aVar.n(f12);
            this.f121769a.preRotate((float) Math.toDegrees(Math.atan2(pointFH4.y - f14, pointFH4.x - f13)));
        }
        d dVar = this.f121779k;
        if (dVar != null) {
            d dVar2 = this.f121780l;
            float fCos = dVar2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-dVar2.r()) + 90.0f));
            d dVar3 = this.f121780l;
            float fSin = dVar3 == null ? 1.0f : (float) Math.sin(Math.toRadians((-dVar3.r()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(dVar.r()));
            d();
            float[] fArr = this.f121773e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f15 = -fSin;
            fArr[3] = f15;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.f121770b.setValues(fArr);
            d();
            float[] fArr2 = this.f121773e;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f121771c.setValues(fArr2);
            d();
            float[] fArr3 = this.f121773e;
            fArr3[0] = fCos;
            fArr3[1] = f15;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.f121772d.setValues(fArr3);
            this.f121771c.preConcat(this.f121770b);
            this.f121772d.preConcat(this.f121771c);
            this.f121769a.preConcat(this.f121772d);
        }
        a<ig.d, ig.d> aVar3 = this.f121776h;
        if (aVar3 != null && (dVarH = aVar3.h()) != null && (dVarH.b() != 1.0f || dVarH.c() != 1.0f)) {
            this.f121769a.preScale(dVarH.b(), dVarH.c());
        }
        a<PointF, PointF> aVar4 = this.f121774f;
        if (aVar4 != null && (pointFH = aVar4.h()) != null) {
            float f16 = pointFH.x;
            if (f16 != BitmapDescriptorFactory.HUE_RED || pointFH.y != BitmapDescriptorFactory.HUE_RED) {
                this.f121769a.preTranslate(-f16, -pointFH.y);
            }
        }
        return this.f121769a;
    }

    public Matrix g(float f11) {
        a<?, PointF> aVar = this.f121775g;
        PointF pointFH = aVar == null ? null : aVar.h();
        a<ig.d, ig.d> aVar2 = this.f121776h;
        ig.d dVarH = aVar2 == null ? null : aVar2.h();
        this.f121769a.reset();
        if (pointFH != null) {
            this.f121769a.preTranslate(pointFH.x * f11, pointFH.y * f11);
        }
        if (dVarH != null) {
            double d11 = f11;
            this.f121769a.preScale((float) Math.pow(dVarH.b(), d11), (float) Math.pow(dVarH.c(), d11));
        }
        a<Float, Float> aVar3 = this.f121777i;
        if (aVar3 != null) {
            float fFloatValue = aVar3.h().floatValue();
            a<PointF, PointF> aVar4 = this.f121774f;
            PointF pointFH2 = aVar4 != null ? aVar4.h() : null;
            Matrix matrix = this.f121769a;
            float f12 = fFloatValue * f11;
            float f13 = BitmapDescriptorFactory.HUE_RED;
            float f14 = pointFH2 == null ? 0.0f : pointFH2.x;
            if (pointFH2 != null) {
                f13 = pointFH2.y;
            }
            matrix.preRotate(f12, f14, f13);
        }
        return this.f121769a;
    }

    public a<?, Integer> h() {
        return this.f121778j;
    }

    public a<?, Float> i() {
        return this.f121781m;
    }

    public void j(float f11) {
        a<Integer, Integer> aVar = this.f121778j;
        if (aVar != null) {
            aVar.n(f11);
        }
        a<?, Float> aVar2 = this.f121781m;
        if (aVar2 != null) {
            aVar2.n(f11);
        }
        a<?, Float> aVar3 = this.f121782n;
        if (aVar3 != null) {
            aVar3.n(f11);
        }
        a<PointF, PointF> aVar4 = this.f121774f;
        if (aVar4 != null) {
            aVar4.n(f11);
        }
        a<?, PointF> aVar5 = this.f121775g;
        if (aVar5 != null) {
            aVar5.n(f11);
        }
        a<ig.d, ig.d> aVar6 = this.f121776h;
        if (aVar6 != null) {
            aVar6.n(f11);
        }
        a<Float, Float> aVar7 = this.f121777i;
        if (aVar7 != null) {
            aVar7.n(f11);
        }
        d dVar = this.f121779k;
        if (dVar != null) {
            dVar.n(f11);
        }
        d dVar2 = this.f121780l;
        if (dVar2 != null) {
            dVar2.n(f11);
        }
    }
}
