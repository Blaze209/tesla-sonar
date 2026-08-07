package rr;

import com.google.android.exoplayer2.u0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<u0> f108747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hr.b0[] f108748b;

    public d0(List<u0> list) {
        this.f108747a = list;
        this.f108748b = new hr.b0[list.size()];
    }

    public void a(long j11, ts.d0 d0Var) {
        hr.b.a(j11, d0Var, this.f108748b);
    }

    public void b(hr.m mVar, i0.d dVar) {
        for (int i11 = 0; i11 < this.f108748b.length; i11++) {
            dVar.a();
            hr.b0 b0VarB = mVar.b(dVar.c(), 3);
            u0 u0Var = this.f108747a.get(i11);
            String str = u0Var.f40712l;
            ts.a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            String strB = u0Var.f40701a;
            if (strB == null) {
                strB = dVar.b();
            }
            b0VarB.b(new u0.b().U(strB).g0(str).i0(u0Var.f40704d).X(u0Var.f40703c).H(u0Var.D).V(u0Var.f40714n).G());
            this.f108748b[i11] = b0VarB;
        }
    }
}
