package rr;

import com.google.android.exoplayer2.u0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<i0.a> f108868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hr.b0[] f108869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f108870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f108871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f108872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f108873f = -9223372036854775807L;

    public l(List<i0.a> list) {
        this.f108868a = list;
        this.f108869b = new hr.b0[list.size()];
    }

    private boolean f(ts.d0 d0Var, int i11) {
        if (d0Var.a() == 0) {
            return false;
        }
        if (d0Var.H() != i11) {
            this.f108870c = false;
        }
        this.f108871d--;
        return this.f108870c;
    }

    @Override // rr.m
    public void a() {
        this.f108870c = false;
        this.f108873f = -9223372036854775807L;
    }

    @Override // rr.m
    public void b(ts.d0 d0Var) {
        if (this.f108870c) {
            if (this.f108871d != 2 || f(d0Var, 32)) {
                if (this.f108871d != 1 || f(d0Var, 0)) {
                    int iF = d0Var.f();
                    int iA = d0Var.a();
                    for (hr.b0 b0Var : this.f108869b) {
                        d0Var.U(iF);
                        b0Var.d(d0Var, iA);
                    }
                    this.f108872e += iA;
                }
            }
        }
    }

    @Override // rr.m
    public void c(long j11, int i11) {
        if ((i11 & 4) == 0) {
            return;
        }
        this.f108870c = true;
        if (j11 != -9223372036854775807L) {
            this.f108873f = j11;
        }
        this.f108872e = 0;
        this.f108871d = 2;
    }

    @Override // rr.m
    public void d(hr.m mVar, i0.d dVar) {
        for (int i11 = 0; i11 < this.f108869b.length; i11++) {
            i0.a aVar = this.f108868a.get(i11);
            dVar.a();
            hr.b0 b0VarB = mVar.b(dVar.c(), 3);
            b0VarB.b(new u0.b().U(dVar.b()).g0("application/dvbsubs").V(Collections.singletonList(aVar.f108843c)).X(aVar.f108841a).G());
            this.f108869b[i11] = b0VarB;
        }
    }

    @Override // rr.m
    public void e() {
        if (this.f108870c) {
            if (this.f108873f != -9223372036854775807L) {
                for (hr.b0 b0Var : this.f108869b) {
                    b0Var.e(this.f108873f, 1, this.f108872e, 0, null);
                }
            }
            this.f108870c = false;
        }
    }
}
