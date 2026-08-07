package vf;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class u implements c, wf.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f119225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f119226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<wf.a.b> f119227c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final cg.t.a f119228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wf.a<?, Float> f119229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final wf.a<?, Float> f119230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final wf.a<?, Float> f119231g;

    public u(dg.b bVar, cg.t tVar) {
        this.f119225a = tVar.c();
        this.f119226b = tVar.g();
        this.f119228d = tVar.f();
        wf.d dVarA = tVar.e().a();
        this.f119229e = dVarA;
        wf.d dVarA2 = tVar.b().a();
        this.f119230f = dVarA2;
        wf.d dVarA3 = tVar.d().a();
        this.f119231g = dVarA3;
        bVar.j(dVarA);
        bVar.j(dVarA2);
        bVar.j(dVarA3);
        dVarA.a(this);
        dVarA2.a(this);
        dVarA3.a(this);
    }

    void c(wf.a.b bVar) {
        this.f119227c.add(bVar);
    }

    public wf.a<?, Float> d() {
        return this.f119230f;
    }

    @Override // wf.a.b
    public void e() {
        for (int i11 = 0; i11 < this.f119227c.size(); i11++) {
            this.f119227c.get(i11).e();
        }
    }

    public wf.a<?, Float> g() {
        return this.f119231g;
    }

    public wf.a<?, Float> j() {
        return this.f119229e;
    }

    cg.t.a k() {
        return this.f119228d;
    }

    public boolean l() {
        return this.f119226b;
    }

    @Override // vf.c
    public void f(List<c> list, List<c> list2) {
    }
}
