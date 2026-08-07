package da;

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p7.u f60330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s7.i0 f60331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private w8.o0 f60332c;

    public x(String str, String str2) {
        this.f60330a = new p7.u.b().W(str2).y0(str).P();
    }

    @EnsuresNonNull({"timestampAdjuster", "output"})
    private void a() {
        s7.a.j(this.f60331b);
        q0.l(this.f60332c);
    }

    @Override // da.d0
    public void b(s7.c0 c0Var) {
        a();
        long jE = this.f60331b.e();
        long jF = this.f60331b.f();
        if (jE == -9223372036854775807L || jF == -9223372036854775807L) {
            return;
        }
        p7.u uVar = this.f60330a;
        if (jF != uVar.f101549t) {
            p7.u uVarP = uVar.b().C0(jF).P();
            this.f60330a = uVarP;
            this.f60332c.g(uVarP);
        }
        int iA = c0Var.a();
        this.f60332c.f(c0Var, iA);
        this.f60332c.b(jE, 1, iA, 0, null);
    }

    @Override // da.d0
    public void c(s7.i0 i0Var, w8.r rVar, l0.d dVar) {
        this.f60331b = i0Var;
        dVar.a();
        w8.o0 o0VarB = rVar.b(dVar.c(), 5);
        this.f60332c = o0VarB;
        o0VarB.g(this.f60330a);
    }
}
