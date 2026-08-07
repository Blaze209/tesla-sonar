package androidx.media3.extractor.flv;

import androidx.media3.extractor.flv.b;
import com.plaid.internal.EnumC4419g;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import s7.c0;
import w8.e0;
import w8.i0;
import w8.j0;
import w8.p;
import w8.q;
import w8.r;
import w8.u;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements p {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final u f11420q = new u() { // from class: c9.a
        @Override // w8.u
        public final p[] d() {
            return b.b();
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r f11426f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f11428h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f11429i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f11430j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f11431k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f11432l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f11433m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f11434n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f11435o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private d f11436p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f11421a = new c0(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0 f11422b = new c0(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0 f11423c = new c0(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c0 f11424d = new c0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f11425e = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f11427g = 1;

    public static /* synthetic */ p[] b() {
        return new p[]{new b()};
    }

    @RequiresNonNull({"extractorOutput"})
    private void c() {
        if (this.f11434n) {
            return;
        }
        this.f11426f.t(new j0.b(-9223372036854775807L));
        this.f11434n = true;
    }

    private long d() {
        if (this.f11428h) {
            return this.f11429i + this.f11433m;
        }
        if (this.f11425e.d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f11433m;
    }

    private c0 f(q qVar) {
        if (this.f11432l > this.f11424d.b()) {
            c0 c0Var = this.f11424d;
            c0Var.Z(new byte[Math.max(c0Var.b() * 2, this.f11432l)], 0);
        } else {
            this.f11424d.b0(0);
        }
        this.f11424d.a0(this.f11432l);
        qVar.readFully(this.f11424d.f(), 0, this.f11432l);
        return this.f11424d;
    }

    @RequiresNonNull({"extractorOutput"})
    private boolean g(q qVar) {
        if (!qVar.c(this.f11422b.f(), 0, 9, true)) {
            return false;
        }
        this.f11422b.b0(0);
        this.f11422b.c0(4);
        int iM = this.f11422b.M();
        boolean z11 = (iM & 4) != 0;
        boolean z12 = (iM & 1) != 0;
        if (z11 && this.f11435o == null) {
            this.f11435o = new a(this.f11426f.b(8, 1));
        }
        if (z12 && this.f11436p == null) {
            this.f11436p = new d(this.f11426f.b(9, 2));
        }
        this.f11426f.j();
        this.f11430j = this.f11422b.v() - 5;
        this.f11427g = 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    @RequiresNonNull({"extractorOutput"})
    private boolean k(q qVar) {
        boolean zA;
        boolean z11;
        long j11;
        long jD = d();
        int i11 = this.f11431k;
        if (i11 == 8 && this.f11435o != null) {
            c();
            zA = this.f11435o.a(f(qVar), jD);
        } else {
            if (i11 != 9 || this.f11436p == null) {
                if (i11 != 18 || this.f11434n) {
                    qVar.k(this.f11432l);
                    zA = false;
                    z11 = false;
                } else {
                    zA = this.f11425e.a(f(qVar), jD);
                    long jD2 = this.f11425e.d();
                    if (jD2 != -9223372036854775807L) {
                        this.f11426f.t(new e0(this.f11425e.e(), this.f11425e.f(), jD2));
                        this.f11434n = true;
                    }
                }
                if (!this.f11428h && zA) {
                    this.f11428h = true;
                    if (this.f11425e.d() == -9223372036854775807L) {
                        j11 = -this.f11433m;
                    } else {
                        j11 = 0;
                    }
                    this.f11429i = j11;
                }
                this.f11430j = 4;
                this.f11427g = 2;
                return z11;
            }
            c();
            zA = this.f11436p.a(f(qVar), jD);
        }
        z11 = true;
        if (!this.f11428h) {
            this.f11428h = true;
            if (this.f11425e.d() == -9223372036854775807L) {
                j11 = -this.f11433m;
            } else {
                j11 = 0;
            }
            this.f11429i = j11;
        }
        this.f11430j = 4;
        this.f11427g = 2;
        return z11;
    }

    private boolean m(q qVar) {
        if (!qVar.c(this.f11423c.f(), 0, 11, true)) {
            return false;
        }
        this.f11423c.b0(0);
        this.f11431k = this.f11423c.M();
        this.f11432l = this.f11423c.P();
        this.f11433m = this.f11423c.P();
        this.f11433m = (((long) (this.f11423c.M() << 24)) | this.f11433m) * 1000;
        this.f11423c.c0(3);
        this.f11427g = 4;
        return true;
    }

    private void n(q qVar) {
        qVar.k(this.f11430j);
        this.f11430j = 0;
        this.f11427g = 3;
    }

    @Override // w8.p
    public void a(long j11, long j12) {
        if (j11 == 0) {
            this.f11427g = 1;
            this.f11428h = false;
        } else {
            this.f11427g = 3;
        }
        this.f11430j = 0;
    }

    @Override // w8.p
    public void e(r rVar) {
        this.f11426f = rVar;
    }

    @Override // w8.p
    public int h(q qVar, i0 i0Var) {
        s7.a.j(this.f11426f);
        while (true) {
            int i11 = this.f11427g;
            if (i11 != 1) {
                if (i11 == 2) {
                    n(qVar);
                } else if (i11 != 3) {
                    if (i11 != 4) {
                        throw new IllegalStateException();
                    }
                    if (k(qVar)) {
                        return 0;
                    }
                } else if (!m(qVar)) {
                    return -1;
                }
            } else if (!g(qVar)) {
                return -1;
            }
        }
    }

    @Override // w8.p
    public boolean l(q qVar) {
        qVar.e(this.f11421a.f(), 0, 3);
        this.f11421a.b0(0);
        if (this.f11421a.P() != 4607062) {
            return false;
        }
        qVar.e(this.f11421a.f(), 0, 2);
        this.f11421a.b0(0);
        if ((this.f11421a.U() & EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE) != 0) {
            return false;
        }
        qVar.e(this.f11421a.f(), 0, 4);
        this.f11421a.b0(0);
        int iV = this.f11421a.v();
        qVar.g();
        qVar.i(iV);
        qVar.e(this.f11421a.f(), 0, 4);
        this.f11421a.b0(0);
        return this.f11421a.v() == 0;
    }

    @Override // w8.p
    public void release() {
    }
}
