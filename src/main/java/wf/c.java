package wf;

import android.graphics.Color;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes3.dex */
public class c implements wf.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dg.b f121731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wf.a.b f121732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wf.a<Integer, Integer> f121733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f121734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f121735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d f121736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d f121737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Matrix f121738h;

    class a extends ig.c<Float> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ig.c f121739d;

        a(ig.c cVar) {
            this.f121739d = cVar;
        }

        @Override // ig.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Float a(ig.b<Float> bVar) {
            Float f11 = (Float) this.f121739d.a(bVar);
            if (f11 == null) {
                return null;
            }
            return Float.valueOf(f11.floatValue() * 2.55f);
        }
    }

    public c(wf.a.b bVar, dg.b bVar2, fg.j jVar) {
        this.f121732b = bVar;
        this.f121731a = bVar2;
        wf.a<Integer, Integer> aVarA = jVar.a().a();
        this.f121733c = aVarA;
        aVarA.a(this);
        bVar2.j(aVarA);
        d dVarA = jVar.d().a();
        this.f121734d = dVarA;
        dVarA.a(this);
        bVar2.j(dVarA);
        d dVarA2 = jVar.b().a();
        this.f121735e = dVarA2;
        dVarA2.a(this);
        bVar2.j(dVarA2);
        d dVarA3 = jVar.c().a();
        this.f121736f = dVarA3;
        dVarA3.a(this);
        bVar2.j(dVarA3);
        d dVarA4 = jVar.e().a();
        this.f121737g = dVarA4;
        dVarA4.a(this);
        bVar2.j(dVarA4);
    }

    public hg.b a(Matrix matrix, int i11) {
        float fR = this.f121735e.r() * 0.017453292f;
        float fFloatValue = this.f121736f.h().floatValue();
        double d11 = fR;
        float fSin = ((float) Math.sin(d11)) * fFloatValue;
        float fCos = ((float) Math.cos(d11 + 3.141592653589793d)) * fFloatValue;
        float fFloatValue2 = this.f121737g.h().floatValue();
        int iIntValue = this.f121733c.h().intValue();
        hg.b bVar = new hg.b(fFloatValue2 * 0.33f, fSin, fCos, Color.argb(Math.round((this.f121734d.h().floatValue() * i11) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        bVar.k(matrix);
        if (this.f121738h == null) {
            this.f121738h = new Matrix();
        }
        this.f121731a.f60560x.f().invert(this.f121738h);
        bVar.k(this.f121738h);
        return bVar;
    }

    public void b(ig.c<Integer> cVar) {
        this.f121733c.o(cVar);
    }

    public void c(ig.c<Float> cVar) {
        this.f121735e.o(cVar);
    }

    public void d(ig.c<Float> cVar) {
        this.f121736f.o(cVar);
    }

    @Override // wf.a.b
    public void e() {
        this.f121732b.e();
    }

    public void f(ig.c<Float> cVar) {
        if (cVar == null) {
            this.f121734d.o(null);
        } else {
            this.f121734d.o(new a(cVar));
        }
    }

    public void g(ig.c<Float> cVar) {
        this.f121737g.o(cVar);
    }
}
