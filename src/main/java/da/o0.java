package da;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<p7.u> f60169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f60170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w8.o0[] f60171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t7.k f60172d;

    public o0(List<p7.u> list, String str) {
        this.f60169a = list;
        this.f60170b = str;
        this.f60171c = new w8.o0[list.size()];
        t7.k kVar = new t7.k(new t7.k.b() { // from class: da.n0
            @Override // t7.k.b
            public final void a(long j11, s7.c0 c0Var) {
                w8.f.b(j11, c0Var, this.f60141a.f60171c);
            }
        });
        this.f60172d = kVar;
        kVar.g(3);
    }

    public void b(long j11, s7.c0 c0Var) {
        if (c0Var.a() < 9) {
            return;
        }
        int iV = c0Var.v();
        int iV2 = c0Var.v();
        int iM = c0Var.M();
        if (iV == 434 && iV2 == 1195456820 && iM == 3) {
            this.f60172d.a(j11, c0Var);
        }
    }

    public void c(w8.r rVar, l0.d dVar) {
        for (int i11 = 0; i11 < this.f60171c.length; i11++) {
            dVar.a();
            w8.o0 o0VarB = rVar.b(dVar.c(), 3);
            p7.u uVar = this.f60169a.get(i11);
            String str = uVar.f101544o;
            s7.a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            o0VarB.g(new p7.u.b().j0(dVar.b()).W(this.f60170b).y0(str).A0(uVar.f101534e).n0(uVar.f101533d).Q(uVar.L).k0(uVar.f101547r).P());
            this.f60171c[i11] = o0VarB;
        }
    }
}
