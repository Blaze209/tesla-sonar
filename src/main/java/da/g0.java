package da;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<p7.u> f59996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f59997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w8.o0[] f59998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t7.k f59999d = new t7.k(new t7.k.b() { // from class: da.f0
        @Override // t7.k.b
        public final void a(long j11, s7.c0 c0Var) {
            w8.f.a(j11, c0Var, this.f59995a.f59998c);
        }
    });

    public g0(List<p7.u> list, String str) {
        this.f59996a = list;
        this.f59997b = str;
        this.f59998c = new w8.o0[list.size()];
    }

    public void b() {
        this.f59999d.d();
    }

    public void c(long j11, s7.c0 c0Var) {
        this.f59999d.a(j11, c0Var);
    }

    public void d(w8.r rVar, l0.d dVar) {
        for (int i11 = 0; i11 < this.f59998c.length; i11++) {
            dVar.a();
            w8.o0 o0VarB = rVar.b(dVar.c(), 3);
            p7.u uVar = this.f59996a.get(i11);
            String str = uVar.f101544o;
            s7.a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            String strB = uVar.f101530a;
            if (strB == null) {
                strB = dVar.b();
            }
            o0VarB.g(new p7.u.b().j0(strB).W(this.f59997b).y0(str).A0(uVar.f101534e).n0(uVar.f101533d).Q(uVar.L).k0(uVar.f101547r).P());
            this.f59998c[i11] = o0VarB;
        }
    }

    public void e() {
        this.f59999d.d();
    }

    public void f(int i11) {
        this.f59999d.g(i11);
    }
}
