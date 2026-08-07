package vf;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import tf.d0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements wf.a.b, k, e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.p f119085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final dg.b f119086f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f119088h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Paint f119089i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final wf.a<?, Float> f119090j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final wf.a<?, Integer> f119091k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<wf.a<?, Float>> f119092l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final wf.a<?, Float> f119093m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private wf.a<ColorFilter, ColorFilter> f119094n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private wf.a<Float, Float> f119095o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    float f119096p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PathMeasure f119081a = new PathMeasure();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f119082b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Path f119083c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RectF f119084d = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<b> f119087g = new ArrayList();

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<m> f119097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final u f119098b;

        private b(u uVar) {
            this.f119097a = new ArrayList();
            this.f119098b = uVar;
        }
    }

    a(com.airbnb.lottie.p pVar, dg.b bVar, Paint.Cap cap, Paint.Join join, float f11, bg.d dVar, bg.b bVar2, List<bg.b> list, bg.b bVar3) {
        uf.a aVar = new uf.a(1);
        this.f119089i = aVar;
        this.f119096p = BitmapDescriptorFactory.HUE_RED;
        this.f119085e = pVar;
        this.f119086f = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f11);
        this.f119091k = dVar.a();
        this.f119090j = bVar2.a();
        if (bVar3 == null) {
            this.f119093m = null;
        } else {
            this.f119093m = bVar3.a();
        }
        this.f119092l = new ArrayList(list.size());
        this.f119088h = new float[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f119092l.add(list.get(i11).a());
        }
        bVar.j(this.f119091k);
        bVar.j(this.f119090j);
        for (int i12 = 0; i12 < this.f119092l.size(); i12++) {
            bVar.j(this.f119092l.get(i12));
        }
        wf.a<?, Float> aVar2 = this.f119093m;
        if (aVar2 != null) {
            bVar.j(aVar2);
        }
        this.f119091k.a(this);
        this.f119090j.a(this);
        for (int i13 = 0; i13 < list.size(); i13++) {
            this.f119092l.get(i13).a(this);
        }
        wf.a<?, Float> aVar3 = this.f119093m;
        if (aVar3 != null) {
            aVar3.a(this);
        }
        if (bVar.x() != null) {
            wf.d dVarA = bVar.x().a().a();
            this.f119095o = dVarA;
            dVarA.a(this);
            bVar.j(this.f119095o);
        }
    }

    private void c() {
        if (tf.e.h()) {
            tf.e.b("StrokeContent#applyDashPattern");
        }
        if (this.f119092l.isEmpty()) {
            if (tf.e.h()) {
                tf.e.c("StrokeContent#applyDashPattern");
                return;
            }
            return;
        }
        for (int i11 = 0; i11 < this.f119092l.size(); i11++) {
            this.f119088h[i11] = this.f119092l.get(i11).h().floatValue();
            if (i11 % 2 == 0) {
                float[] fArr = this.f119088h;
                if (fArr[i11] < 1.0f) {
                    fArr[i11] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f119088h;
                if (fArr2[i11] < 0.1f) {
                    fArr2[i11] = 0.1f;
                }
            }
        }
        wf.a<?, Float> aVar = this.f119093m;
        this.f119089i.setPathEffect(new DashPathEffect(this.f119088h, aVar == null ? BitmapDescriptorFactory.HUE_RED : aVar.h().floatValue()));
        if (tf.e.h()) {
            tf.e.c("StrokeContent#applyDashPattern");
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0123  */
    private void j(Canvas canvas, b bVar) {
        float f11;
        if (tf.e.h()) {
            tf.e.b("StrokeContent#applyTrimPath");
        }
        if (bVar.f119098b == null) {
            if (tf.e.h()) {
                tf.e.c("StrokeContent#applyTrimPath");
                return;
            }
            return;
        }
        this.f119082b.reset();
        for (int size = bVar.f119097a.size() - 1; size >= 0; size--) {
            this.f119082b.addPath(((m) bVar.f119097a.get(size)).getPath());
        }
        float fFloatValue = bVar.f119098b.j().h().floatValue() / 100.0f;
        float fFloatValue2 = bVar.f119098b.d().h().floatValue() / 100.0f;
        float fFloatValue3 = bVar.f119098b.g().h().floatValue() / 360.0f;
        if (fFloatValue < 0.01f && fFloatValue2 > 0.99f) {
            canvas.drawPath(this.f119082b, this.f119089i);
            if (tf.e.h()) {
                tf.e.c("StrokeContent#applyTrimPath");
                return;
            }
            return;
        }
        this.f119081a.setPath(this.f119082b, false);
        float length = this.f119081a.getLength();
        while (this.f119081a.nextContour()) {
            length += this.f119081a.getLength();
        }
        float f12 = fFloatValue3 * length;
        float f13 = (fFloatValue * length) + f12;
        float fMin = Math.min((fFloatValue2 * length) + f12, (f13 + length) - 1.0f);
        float f14 = 0.0f;
        for (int size2 = bVar.f119097a.size() - 1; size2 >= 0; size2--) {
            this.f119083c.set(((m) bVar.f119097a.get(size2)).getPath());
            this.f119081a.setPath(this.f119083c, false);
            float length2 = this.f119081a.getLength();
            if (fMin > length) {
                float f15 = fMin - length;
                if (f15 >= f14 + length2 || f14 >= f15) {
                    f11 = f14 + length2;
                    if (f11 < f13 && f14 <= fMin) {
                        if (f11 > fMin || f13 >= f14) {
                            hg.l.a(this.f119083c, f13 < f14 ? 0.0f : (f13 - f14) / length2, fMin > f11 ? 1.0f : (fMin - f14) / length2, BitmapDescriptorFactory.HUE_RED);
                            canvas.drawPath(this.f119083c, this.f119089i);
                        } else {
                            canvas.drawPath(this.f119083c, this.f119089i);
                        }
                    }
                } else {
                    hg.l.a(this.f119083c, f13 > length ? (f13 - length) / length2 : 0.0f, Math.min(f15 / length2, 1.0f), BitmapDescriptorFactory.HUE_RED);
                    canvas.drawPath(this.f119083c, this.f119089i);
                }
            } else {
                f11 = f14 + length2;
                if (f11 < f13) {
                }
            }
            f14 += length2;
        }
        if (tf.e.h()) {
            tf.e.c("StrokeContent#applyTrimPath");
        }
    }

    @Override // vf.e
    public void b(RectF rectF, Matrix matrix, boolean z11) {
        if (tf.e.h()) {
            tf.e.b("StrokeContent#getBounds");
        }
        this.f119082b.reset();
        for (int i11 = 0; i11 < this.f119087g.size(); i11++) {
            b bVar = this.f119087g.get(i11);
            for (int i12 = 0; i12 < bVar.f119097a.size(); i12++) {
                this.f119082b.addPath(((m) bVar.f119097a.get(i12)).getPath(), matrix);
            }
        }
        this.f119082b.computeBounds(this.f119084d, false);
        float fR = ((wf.d) this.f119090j).r();
        RectF rectF2 = this.f119084d;
        float f11 = fR / 2.0f;
        rectF2.set(rectF2.left - f11, rectF2.top - f11, rectF2.right + f11, rectF2.bottom + f11);
        rectF.set(this.f119084d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        if (tf.e.h()) {
            tf.e.c("StrokeContent#getBounds");
        }
    }

    @Override // ag.f
    public void d(ag.e eVar, int i11, List<ag.e> list, ag.e eVar2) {
        hg.j.k(eVar, i11, list, eVar2, this);
    }

    @Override // wf.a.b
    public void e() {
        this.f119085e.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069 A[SYNTHETIC] */
    @Override // vf.c
    public void f(List<c> list, List<c> list2) {
        u uVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof u) {
                u uVar2 = (u) cVar;
                if (uVar2.k() == cg.t.a.INDIVIDUALLY) {
                    uVar = uVar2;
                }
            }
        }
        if (uVar != null) {
            uVar.c(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            c cVar2 = list2.get(size2);
            if (cVar2 instanceof u) {
                u uVar3 = (u) cVar2;
                if (uVar3.k() == cg.t.a.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f119087g.add(bVar);
                    }
                    bVar = new b(uVar3);
                    uVar3.c(this);
                } else if (!(cVar2 instanceof m)) {
                    if (bVar == null) {
                        bVar = new b(uVar);
                    }
                    bVar.f119097a.add((m) cVar2);
                }
            } else if (!(cVar2 instanceof m)) {
                if (bVar == null) {
                    bVar = new b(uVar);
                }
                bVar.f119097a.add((m) cVar2);
            }
        }
        if (bVar != null) {
            this.f119087g.add(bVar);
        }
    }

    @Override // ag.f
    public <T> void g(T t11, ig.c<T> cVar) {
        if (t11 == d0.f113275d) {
            this.f119091k.o(cVar);
            return;
        }
        if (t11 == d0.f113290s) {
            this.f119090j.o(cVar);
            return;
        }
        if (t11 == d0.K) {
            wf.a<ColorFilter, ColorFilter> aVar = this.f119094n;
            if (aVar != null) {
                this.f119086f.H(aVar);
            }
            if (cVar == null) {
                this.f119094n = null;
                return;
            }
            wf.q qVar = new wf.q(cVar);
            this.f119094n = qVar;
            qVar.a(this);
            this.f119086f.j(this.f119094n);
            return;
        }
        if (t11 == d0.f113281j) {
            wf.a<Float, Float> aVar2 = this.f119095o;
            if (aVar2 != null) {
                aVar2.o(cVar);
                return;
            }
            wf.q qVar2 = new wf.q(cVar);
            this.f119095o = qVar2;
            qVar2.a(this);
            this.f119086f.j(this.f119095o);
        }
    }

    @Override // vf.e
    public void i(Canvas canvas, Matrix matrix, int i11, hg.b bVar) {
        if (tf.e.h()) {
            tf.e.b("StrokeContent#draw");
        }
        if (hg.l.h(matrix)) {
            if (tf.e.h()) {
                tf.e.c("StrokeContent#draw");
                return;
            }
            return;
        }
        float fIntValue = this.f119091k.h().intValue() / 100.0f;
        this.f119089i.setAlpha(hg.j.c((int) (i11 * fIntValue), 0, 255));
        this.f119089i.setStrokeWidth(((wf.d) this.f119090j).r());
        if (this.f119089i.getStrokeWidth() <= BitmapDescriptorFactory.HUE_RED) {
            if (tf.e.h()) {
                tf.e.c("StrokeContent#draw");
                return;
            }
            return;
        }
        c();
        wf.a<ColorFilter, ColorFilter> aVar = this.f119094n;
        if (aVar != null) {
            this.f119089i.setColorFilter(aVar.h());
        }
        wf.a<Float, Float> aVar2 = this.f119095o;
        if (aVar2 != null) {
            float fFloatValue = aVar2.h().floatValue();
            if (fFloatValue == BitmapDescriptorFactory.HUE_RED) {
                this.f119089i.setMaskFilter(null);
            } else if (fFloatValue != this.f119096p) {
                this.f119089i.setMaskFilter(this.f119086f.y(fFloatValue));
            }
            this.f119096p = fFloatValue;
        }
        if (bVar != null) {
            bVar.c((int) (fIntValue * 255.0f), this.f119089i);
        }
        canvas.save();
        canvas.concat(matrix);
        for (int i12 = 0; i12 < this.f119087g.size(); i12++) {
            b bVar2 = this.f119087g.get(i12);
            if (bVar2.f119098b != null) {
                j(canvas, bVar2);
            } else {
                if (tf.e.h()) {
                    tf.e.b("StrokeContent#buildPath");
                }
                this.f119082b.reset();
                for (int size = bVar2.f119097a.size() - 1; size >= 0; size--) {
                    this.f119082b.addPath(((m) bVar2.f119097a.get(size)).getPath());
                }
                if (tf.e.h()) {
                    tf.e.c("StrokeContent#buildPath");
                    tf.e.b("StrokeContent#drawPath");
                }
                canvas.drawPath(this.f119082b, this.f119089i);
                if (tf.e.h()) {
                    tf.e.c("StrokeContent#drawPath");
                }
            }
        }
        canvas.restore();
        if (tf.e.h()) {
            tf.e.c("StrokeContent#draw");
        }
    }
}
