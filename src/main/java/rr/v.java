package rr;

import com.google.android.exoplayer2.u0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import ts.m0;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class v implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private u0 f109042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m0 f109043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private hr.b0 f109044c;

    public v(String str) {
        this.f109042a = new u0.b().g0(str).G();
    }

    @EnsuresNonNull({"timestampAdjuster", "output"})
    private void a() {
        ts.a.i(this.f109043b);
        p0.j(this.f109044c);
    }

    @Override // rr.b0
    public void b(ts.d0 d0Var) {
        a();
        long jD = this.f109043b.d();
        long jE = this.f109043b.e();
        if (jD == -9223372036854775807L || jE == -9223372036854775807L) {
            return;
        }
        u0 u0Var = this.f109042a;
        if (jE != u0Var.f40716p) {
            u0 u0VarG = u0Var.b().k0(jE).G();
            this.f109042a = u0VarG;
            this.f109044c.b(u0VarG);
        }
        int iA = d0Var.a();
        this.f109044c.d(d0Var, iA);
        this.f109044c.e(jD, 1, iA, 0, null);
    }

    @Override // rr.b0
    public void c(m0 m0Var, hr.m mVar, i0.d dVar) {
        this.f109043b = m0Var;
        dVar.a();
        hr.b0 b0VarB = mVar.b(dVar.c(), 5);
        this.f109044c = b0VarB;
        b0VarB.b(this.f109042a);
    }
}
