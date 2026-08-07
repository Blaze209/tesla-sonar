package f8;

import da.k0;
import p7.u;
import t9.q;
import w8.i0;
import w8.p;
import w8.r;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final i0 f64534f = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final p f64535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f64536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s7.i0 f64537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q.a f64538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f64539e;

    a(p pVar, u uVar, s7.i0 i0Var, q.a aVar, boolean z11) {
        this.f64535a = pVar;
        this.f64536b = uVar;
        this.f64537c = i0Var;
        this.f64538d = aVar;
        this.f64539e = z11;
    }

    @Override // f8.f
    public boolean a(w8.q qVar) {
        return this.f64535a.h(qVar, f64534f) == 0;
    }

    @Override // f8.f
    public void e(r rVar) {
        this.f64535a.e(rVar);
    }

    @Override // f8.f
    public void f() {
        this.f64535a.a(0L, 0L);
    }

    @Override // f8.f
    public boolean g() {
        p pVarI = this.f64535a.i();
        return (pVarI instanceof k0) || (pVarI instanceof q9.h);
    }

    @Override // f8.f
    public boolean h() {
        p pVarI = this.f64535a.i();
        return (pVarI instanceof da.h) || (pVarI instanceof da.b) || (pVarI instanceof da.e) || (pVarI instanceof p9.f);
    }

    @Override // f8.f
    public f i() {
        p fVar;
        s7.a.h(!g());
        s7.a.i(this.f64535a.i() == this.f64535a, "Can't recreate wrapped extractors. Outer type: " + this.f64535a.getClass());
        p pVar = this.f64535a;
        if (pVar instanceof j) {
            fVar = new j(this.f64536b.f101533d, this.f64537c, this.f64538d, this.f64539e);
        } else if (pVar instanceof da.h) {
            fVar = new da.h();
        } else if (pVar instanceof da.b) {
            fVar = new da.b();
        } else if (pVar instanceof da.e) {
            fVar = new da.e();
        } else {
            if (!(pVar instanceof p9.f)) {
                throw new IllegalStateException("Unexpected extractor type for recreation: " + this.f64535a.getClass().getSimpleName());
            }
            fVar = new p9.f();
        }
        return new a(fVar, this.f64536b, this.f64537c, this.f64538d, this.f64539e);
    }
}
