package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.extractor.flv.b;
import com.plaid.internal.EnumC4419g;
import hr.k;
import hr.l;
import hr.m;
import hr.p;
import hr.x;
import hr.y;
import hr.z;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import ts.d0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b implements k {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final p f39865q = new p() { // from class: lr.a
        @Override // hr.p
        public final k[] d() {
            return b.b();
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private m f39871f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f39873h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f39874i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f39875j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f39876k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f39877l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f39878m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f39879n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f39880o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private d f39881p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f39866a = new d0(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f39867b = new d0(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f39868c = new d0(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d0 f39869d = new d0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f39870e = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f39872g = 1;

    public static /* synthetic */ k[] b() {
        return new k[]{new b()};
    }

    @RequiresNonNull({"extractorOutput"})
    private void c() {
        if (this.f39879n) {
            return;
        }
        this.f39871f.p(new z.b(-9223372036854775807L));
        this.f39879n = true;
    }

    private long d() {
        if (this.f39873h) {
            return this.f39874i + this.f39878m;
        }
        if (this.f39870e.d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f39878m;
    }

    private d0 f(l lVar) {
        if (this.f39877l > this.f39869d.b()) {
            d0 d0Var = this.f39869d;
            d0Var.S(new byte[Math.max(d0Var.b() * 2, this.f39877l)], 0);
        } else {
            this.f39869d.U(0);
        }
        this.f39869d.T(this.f39877l);
        lVar.readFully(this.f39869d.e(), 0, this.f39877l);
        return this.f39869d;
    }

    @RequiresNonNull({"extractorOutput"})
    private boolean g(l lVar) {
        if (!lVar.c(this.f39867b.e(), 0, 9, true)) {
            return false;
        }
        this.f39867b.U(0);
        this.f39867b.V(4);
        int iH = this.f39867b.H();
        boolean z11 = (iH & 4) != 0;
        boolean z12 = (iH & 1) != 0;
        if (z11 && this.f39880o == null) {
            this.f39880o = new a(this.f39871f.b(8, 1));
        }
        if (z12 && this.f39881p == null) {
            this.f39881p = new d(this.f39871f.b(9, 2));
        }
        this.f39871f.j();
        this.f39875j = this.f39867b.q() - 5;
        this.f39872g = 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    @RequiresNonNull({"extractorOutput"})
    private boolean j(l lVar) {
        boolean zA;
        boolean z11;
        long j11;
        long jD = d();
        int i11 = this.f39876k;
        if (i11 == 8 && this.f39880o != null) {
            c();
            zA = this.f39880o.a(f(lVar), jD);
        } else {
            if (i11 != 9 || this.f39881p == null) {
                if (i11 != 18 || this.f39879n) {
                    lVar.k(this.f39877l);
                    zA = false;
                    z11 = false;
                } else {
                    zA = this.f39870e.a(f(lVar), jD);
                    long jD2 = this.f39870e.d();
                    if (jD2 != -9223372036854775807L) {
                        this.f39871f.p(new x(this.f39870e.e(), this.f39870e.f(), jD2));
                        this.f39879n = true;
                    }
                }
                if (!this.f39873h && zA) {
                    this.f39873h = true;
                    if (this.f39870e.d() == -9223372036854775807L) {
                        j11 = -this.f39878m;
                    } else {
                        j11 = 0;
                    }
                    this.f39874i = j11;
                }
                this.f39875j = 4;
                this.f39872g = 2;
                return z11;
            }
            c();
            zA = this.f39881p.a(f(lVar), jD);
        }
        z11 = true;
        if (!this.f39873h) {
            this.f39873h = true;
            if (this.f39870e.d() == -9223372036854775807L) {
                j11 = -this.f39878m;
            } else {
                j11 = 0;
            }
            this.f39874i = j11;
        }
        this.f39875j = 4;
        this.f39872g = 2;
        return z11;
    }

    private boolean k(l lVar) {
        if (!lVar.c(this.f39868c.e(), 0, 11, true)) {
            return false;
        }
        this.f39868c.U(0);
        this.f39876k = this.f39868c.H();
        this.f39877l = this.f39868c.K();
        this.f39878m = this.f39868c.K();
        this.f39878m = (((long) (this.f39868c.H() << 24)) | this.f39878m) * 1000;
        this.f39868c.V(3);
        this.f39872g = 4;
        return true;
    }

    private void l(l lVar) {
        lVar.k(this.f39875j);
        this.f39875j = 0;
        this.f39872g = 3;
    }

    @Override // hr.k
    public void a(long j11, long j12) {
        if (j11 == 0) {
            this.f39872g = 1;
            this.f39873h = false;
        } else {
            this.f39872g = 3;
        }
        this.f39875j = 0;
    }

    @Override // hr.k
    public void e(m mVar) {
        this.f39871f = mVar;
    }

    @Override // hr.k
    public boolean h(l lVar) {
        lVar.e(this.f39866a.e(), 0, 3);
        this.f39866a.U(0);
        if (this.f39866a.K() != 4607062) {
            return false;
        }
        lVar.e(this.f39866a.e(), 0, 2);
        this.f39866a.U(0);
        if ((this.f39866a.N() & EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE) != 0) {
            return false;
        }
        lVar.e(this.f39866a.e(), 0, 4);
        this.f39866a.U(0);
        int iQ = this.f39866a.q();
        lVar.g();
        lVar.i(iQ);
        lVar.e(this.f39866a.e(), 0, 4);
        this.f39866a.U(0);
        return this.f39866a.q() == 0;
    }

    @Override // hr.k
    public int i(l lVar, y yVar) {
        ts.a.i(this.f39871f);
        while (true) {
            int i11 = this.f39872g;
            if (i11 != 1) {
                if (i11 == 2) {
                    l(lVar);
                } else if (i11 != 3) {
                    if (i11 != 4) {
                        throw new IllegalStateException();
                    }
                    if (j(lVar)) {
                        return 0;
                    }
                } else if (!k(lVar)) {
                    return -1;
                }
            } else if (!g(lVar)) {
                return -1;
            }
        }
    }

    @Override // hr.k
    public void release() {
    }
}
