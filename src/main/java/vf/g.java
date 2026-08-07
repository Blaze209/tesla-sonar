package vf;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import tf.d0;

/* JADX INFO: loaded from: classes3.dex */
public class g implements e, wf.a.b, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f119120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f119121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dg.b f119122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f119123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f119124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<m> f119125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final wf.a<Integer, Integer> f119126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final wf.a<Integer, Integer> f119127h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private wf.a<ColorFilter, ColorFilter> f119128i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.airbnb.lottie.p f119129j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private wf.a<Float, Float> f119130k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    float f119131l;

    public g(com.airbnb.lottie.p pVar, dg.b bVar, cg.p pVar2) {
        Path path = new Path();
        this.f119120a = path;
        this.f119121b = new uf.a(1);
        this.f119125f = new ArrayList();
        this.f119122c = bVar;
        this.f119123d = pVar2.d();
        this.f119124e = pVar2.f();
        this.f119129j = pVar;
        if (bVar.x() != null) {
            wf.d dVarA = bVar.x().a().a();
            this.f119130k = dVarA;
            dVarA.a(this);
            bVar.j(this.f119130k);
        }
        if (pVar2.b() == null || pVar2.e() == null) {
            this.f119126g = null;
            this.f119127h = null;
            return;
        }
        path.setFillType(pVar2.c());
        wf.a<Integer, Integer> aVarA = pVar2.b().a();
        this.f119126g = aVarA;
        aVarA.a(this);
        bVar.j(aVarA);
        wf.a<Integer, Integer> aVarA2 = pVar2.e().a();
        this.f119127h = aVarA2;
        aVarA2.a(this);
        bVar.j(aVarA2);
    }

    @Override // vf.e
    public void b(RectF rectF, Matrix matrix, boolean z11) {
        this.f119120a.reset();
        for (int i11 = 0; i11 < this.f119125f.size(); i11++) {
            this.f119120a.addPath(this.f119125f.get(i11).getPath(), matrix);
        }
        this.f119120a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // ag.f
    public void d(ag.e eVar, int i11, List<ag.e> list, ag.e eVar2) {
        hg.j.k(eVar, i11, list, eVar2, this);
    }

    @Override // wf.a.b
    public void e() {
        this.f119129j.invalidateSelf();
    }

    @Override // vf.c
    public void f(List<c> list, List<c> list2) {
        for (int i11 = 0; i11 < list2.size(); i11++) {
            c cVar = list2.get(i11);
            if (cVar instanceof m) {
                this.f119125f.add((m) cVar);
            }
        }
    }

    @Override // ag.f
    public <T> void g(T t11, ig.c<T> cVar) {
        if (t11 == d0.f113272a) {
            this.f119126g.o(cVar);
            return;
        }
        if (t11 == d0.f113275d) {
            this.f119127h.o(cVar);
            return;
        }
        if (t11 == d0.K) {
            wf.a<ColorFilter, ColorFilter> aVar = this.f119128i;
            if (aVar != null) {
                this.f119122c.H(aVar);
            }
            if (cVar == null) {
                this.f119128i = null;
                return;
            }
            wf.q qVar = new wf.q(cVar);
            this.f119128i = qVar;
            qVar.a(this);
            this.f119122c.j(this.f119128i);
            return;
        }
        if (t11 == d0.f113281j) {
            wf.a<Float, Float> aVar2 = this.f119130k;
            if (aVar2 != null) {
                aVar2.o(cVar);
                return;
            }
            wf.q qVar2 = new wf.q(cVar);
            this.f119130k = qVar2;
            qVar2.a(this);
            this.f119122c.j(this.f119130k);
        }
    }

    @Override // vf.c
    public String getName() {
        return this.f119123d;
    }

    @Override // vf.e
    public void i(Canvas canvas, Matrix matrix, int i11, hg.b bVar) {
        if (this.f119124e) {
            return;
        }
        if (tf.e.h()) {
            tf.e.b("FillContent#draw");
        }
        int iR = ((wf.b) this.f119126g).r();
        float fIntValue = this.f119127h.h().intValue() / 100.0f;
        this.f119121b.setColor((hg.j.c((int) (i11 * fIntValue), 0, 255) << 24) | (iR & 16777215));
        wf.a<ColorFilter, ColorFilter> aVar = this.f119128i;
        if (aVar != null) {
            this.f119121b.setColorFilter(aVar.h());
        }
        wf.a<Float, Float> aVar2 = this.f119130k;
        if (aVar2 != null) {
            float fFloatValue = aVar2.h().floatValue();
            if (fFloatValue == BitmapDescriptorFactory.HUE_RED) {
                this.f119121b.setMaskFilter(null);
            } else if (fFloatValue != this.f119131l) {
                this.f119121b.setMaskFilter(this.f119122c.y(fFloatValue));
            }
            this.f119131l = fFloatValue;
        }
        if (bVar != null) {
            bVar.c((int) (fIntValue * 255.0f), this.f119121b);
        } else {
            this.f119121b.clearShadowLayer();
        }
        this.f119120a.reset();
        for (int i12 = 0; i12 < this.f119125f.size(); i12++) {
            this.f119120a.addPath(this.f119125f.get(i12).getPath(), matrix);
        }
        canvas.drawPath(this.f119120a, this.f119121b);
        if (tf.e.h()) {
            tf.e.c("FillContent#draw");
        }
    }
}
