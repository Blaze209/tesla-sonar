package da;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<l0.a> f60098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f60099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w8.o0[] f60100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f60101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f60102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f60103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f60104g = -9223372036854775807L;

    public l(List<l0.a> list, String str) {
        this.f60098a = list;
        this.f60099b = str;
        this.f60100c = new w8.o0[list.size()];
    }

    private boolean f(s7.c0 c0Var, int i11) {
        if (c0Var.a() == 0) {
            return false;
        }
        if (c0Var.M() != i11) {
            this.f60101d = false;
        }
        this.f60102e--;
        return this.f60101d;
    }

    @Override // da.m
    public void a() {
        this.f60101d = false;
        this.f60104g = -9223372036854775807L;
    }

    @Override // da.m
    public void b(s7.c0 c0Var) {
        if (this.f60101d) {
            if (this.f60102e != 2 || f(c0Var, 32)) {
                if (this.f60102e != 1 || f(c0Var, 0)) {
                    int iG = c0Var.g();
                    int iA = c0Var.a();
                    for (w8.o0 o0Var : this.f60100c) {
                        c0Var.b0(iG);
                        o0Var.f(c0Var, iA);
                    }
                    this.f60103f += iA;
                }
            }
        }
    }

    @Override // da.m
    public void c(long j11, int i11) {
        if ((i11 & 4) == 0) {
            return;
        }
        this.f60101d = true;
        this.f60104g = j11;
        this.f60103f = 0;
        this.f60102e = 2;
    }

    @Override // da.m
    public void d(w8.r rVar, l0.d dVar) {
        for (int i11 = 0; i11 < this.f60100c.length; i11++) {
            l0.a aVar = this.f60098a.get(i11);
            dVar.a();
            w8.o0 o0VarB = rVar.b(dVar.c(), 3);
            o0VarB.g(new p7.u.b().j0(dVar.b()).W(this.f60099b).y0("application/dvbsubs").k0(Collections.singletonList(aVar.f60107c)).n0(aVar.f60105a).P());
            this.f60100c[i11] = o0VarB;
        }
    }

    @Override // da.m
    public void e(boolean z11) {
        if (this.f60101d) {
            s7.a.h(this.f60104g != -9223372036854775807L);
            for (w8.o0 o0Var : this.f60100c) {
                o0Var.b(this.f60104g, 1, this.f60103f, 0, null);
            }
            this.f60101d = false;
        }
    }
}
