package rr;

import com.google.android.exoplayer2.u0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class t implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ts.d0 f109025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dr.t.a f109026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f109027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private hr.b0 f109028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f109029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f109030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f109031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f109032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f109033i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f109034j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f109035k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f109036l;

    public t() {
        this(null);
    }

    private void f(ts.d0 d0Var) {
        byte[] bArrE = d0Var.e();
        int iG = d0Var.g();
        for (int iF = d0Var.f(); iF < iG; iF++) {
            byte b11 = bArrE[iF];
            boolean z11 = (b11 & 255) == 255;
            boolean z12 = this.f109033i && (b11 & 224) == 224;
            this.f109033i = z11;
            if (z12) {
                d0Var.U(iF + 1);
                this.f109033i = false;
                this.f109025a.e()[1] = bArrE[iF];
                this.f109031g = 2;
                this.f109030f = 1;
                return;
            }
        }
        d0Var.U(iG);
    }

    @RequiresNonNull({"output"})
    private void g(ts.d0 d0Var) {
        int iMin = Math.min(d0Var.a(), this.f109035k - this.f109031g);
        this.f109028d.d(d0Var, iMin);
        int i11 = this.f109031g + iMin;
        this.f109031g = i11;
        int i12 = this.f109035k;
        if (i11 < i12) {
            return;
        }
        long j11 = this.f109036l;
        if (j11 != -9223372036854775807L) {
            this.f109028d.e(j11, 1, i12, 0, null);
            this.f109036l += this.f109034j;
        }
        this.f109031g = 0;
        this.f109030f = 0;
    }

    @RequiresNonNull({"output"})
    private void h(ts.d0 d0Var) {
        int iMin = Math.min(d0Var.a(), 4 - this.f109031g);
        d0Var.l(this.f109025a.e(), this.f109031g, iMin);
        int i11 = this.f109031g + iMin;
        this.f109031g = i11;
        if (i11 < 4) {
            return;
        }
        this.f109025a.U(0);
        if (!this.f109026b.a(this.f109025a.q())) {
            this.f109031g = 0;
            this.f109030f = 1;
            return;
        }
        dr.t.a aVar = this.f109026b;
        this.f109035k = aVar.f60909c;
        if (!this.f109032h) {
            this.f109034j = (((long) aVar.f60913g) * 1000000) / ((long) aVar.f60910d);
            this.f109028d.b(new u0.b().U(this.f109029e).g0(this.f109026b.f60908b).Y(4096).J(this.f109026b.f60911e).h0(this.f109026b.f60910d).X(this.f109027c).G());
            this.f109032h = true;
        }
        this.f109025a.U(0);
        this.f109028d.d(this.f109025a, 4);
        this.f109030f = 2;
    }

    @Override // rr.m
    public void a() {
        this.f109030f = 0;
        this.f109031g = 0;
        this.f109033i = false;
        this.f109036l = -9223372036854775807L;
    }

    @Override // rr.m
    public void b(ts.d0 d0Var) {
        ts.a.i(this.f109028d);
        while (d0Var.a() > 0) {
            int i11 = this.f109030f;
            if (i11 == 0) {
                f(d0Var);
            } else if (i11 == 1) {
                h(d0Var);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException();
                }
                g(d0Var);
            }
        }
    }

    @Override // rr.m
    public void c(long j11, int i11) {
        if (j11 != -9223372036854775807L) {
            this.f109036l = j11;
        }
    }

    @Override // rr.m
    public void d(hr.m mVar, i0.d dVar) {
        dVar.a();
        this.f109029e = dVar.b();
        this.f109028d = mVar.b(dVar.c(), 1);
    }

    public t(String str) {
        this.f109030f = 0;
        ts.d0 d0Var = new ts.d0(4);
        this.f109025a = d0Var;
        d0Var.e()[0] = -1;
        this.f109026b = new dr.t.a();
        this.f109036l = -9223372036854775807L;
        this.f109027c = str;
    }

    @Override // rr.m
    public void e() {
    }
}
