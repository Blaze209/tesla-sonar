package rr;

import com.google.android.exoplayer2.u0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<u0> f108866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hr.b0[] f108867b;

    public k0(List<u0> list) {
        this.f108866a = list;
        this.f108867b = new hr.b0[list.size()];
    }

    public void a(long j11, ts.d0 d0Var) {
        if (d0Var.a() < 9) {
            return;
        }
        int iQ = d0Var.q();
        int iQ2 = d0Var.q();
        int iH = d0Var.H();
        if (iQ == 434 && iQ2 == 1195456820 && iH == 3) {
            hr.b.b(j11, d0Var, this.f108867b);
        }
    }

    public void b(hr.m mVar, i0.d dVar) {
        for (int i11 = 0; i11 < this.f108867b.length; i11++) {
            dVar.a();
            hr.b0 b0VarB = mVar.b(dVar.c(), 3);
            u0 u0Var = this.f108866a.get(i11);
            String str = u0Var.f40712l;
            ts.a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            b0VarB.b(new u0.b().U(dVar.b()).g0(str).i0(u0Var.f40704d).X(u0Var.f40703c).H(u0Var.D).V(u0Var.f40714n).G());
            this.f108867b[i11] = b0VarB;
        }
    }
}
