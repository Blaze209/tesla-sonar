package vf;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import tf.d0;

/* JADX INFO: loaded from: classes3.dex */
public class t extends a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final dg.b f119220q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f119221r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f119222s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final wf.a<Integer, Integer> f119223t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private wf.a<ColorFilter, ColorFilter> f119224u;

    public t(com.airbnb.lottie.p pVar, dg.b bVar, cg.s sVar) {
        super(pVar, bVar, sVar.b().toPaintCap(), sVar.e().toPaintJoin(), sVar.g(), sVar.i(), sVar.j(), sVar.f(), sVar.d());
        this.f119220q = bVar;
        this.f119221r = sVar.h();
        this.f119222s = sVar.k();
        wf.a<Integer, Integer> aVarA = sVar.c().a();
        this.f119223t = aVarA;
        aVarA.a(this);
        bVar.j(aVarA);
    }

    @Override // vf.a, ag.f
    public <T> void g(T t11, ig.c<T> cVar) {
        super.g(t11, cVar);
        if (t11 == d0.f113273b) {
            this.f119223t.o(cVar);
            return;
        }
        if (t11 == d0.K) {
            wf.a<ColorFilter, ColorFilter> aVar = this.f119224u;
            if (aVar != null) {
                this.f119220q.H(aVar);
            }
            if (cVar == null) {
                this.f119224u = null;
                return;
            }
            wf.q qVar = new wf.q(cVar);
            this.f119224u = qVar;
            qVar.a(this);
            this.f119220q.j(this.f119223t);
        }
    }

    @Override // vf.c
    public String getName() {
        return this.f119221r;
    }

    @Override // vf.a, vf.e
    public void i(Canvas canvas, Matrix matrix, int i11, hg.b bVar) {
        if (this.f119222s) {
            return;
        }
        this.f119089i.setColor(((wf.b) this.f119223t).r());
        wf.a<ColorFilter, ColorFilter> aVar = this.f119224u;
        if (aVar != null) {
            this.f119089i.setColorFilter(aVar.h());
        }
        super.i(canvas, matrix, i11, bVar);
    }
}
