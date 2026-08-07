package androidx.media3.exoplayer.source;

import android.util.Pair;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p7.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends l0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f11090m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final r0.d f11091n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final r0.b f11092o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private a f11093p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private o f11094q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f11095r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f11096s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f11097t;

    private static final class a extends m {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Object f11098h = new Object();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Object f11099f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Object f11100g;

        private a(r0 r0Var, Object obj, Object obj2) {
            super(r0Var);
            this.f11099f = obj;
            this.f11100g = obj2;
        }

        public static a A(r0 r0Var, Object obj, Object obj2) {
            return new a(r0Var, obj, obj2);
        }

        public static a z(p7.y yVar) {
            return new a(new b(yVar), r0.d.f101471q, f11098h);
        }

        @Override // androidx.media3.exoplayer.source.m, p7.r0
        public int f(Object obj) {
            Object obj2;
            r0 r0Var = this.f11075e;
            if (f11098h.equals(obj) && (obj2 = this.f11100g) != null) {
                obj = obj2;
            }
            return r0Var.f(obj);
        }

        @Override // androidx.media3.exoplayer.source.m, p7.r0
        public r0.b k(int i11, r0.b bVar, boolean z11) {
            this.f11075e.k(i11, bVar, z11);
            if (Objects.equals(bVar.f101461b, this.f11100g) && z11) {
                bVar.f101461b = f11098h;
            }
            return bVar;
        }

        @Override // androidx.media3.exoplayer.source.m, p7.r0
        public Object q(int i11) {
            Object objQ = this.f11075e.q(i11);
            return Objects.equals(objQ, this.f11100g) ? f11098h : objQ;
        }

        @Override // androidx.media3.exoplayer.source.m, p7.r0
        public r0.d s(int i11, r0.d dVar, long j11) {
            this.f11075e.s(i11, dVar, j11);
            if (Objects.equals(dVar.f101481a, this.f11099f)) {
                dVar.f101481a = r0.d.f101471q;
            }
            return dVar;
        }

        public a y(r0 r0Var) {
            return new a(r0Var, this.f11099f, this.f11100g);
        }
    }

    public static final class b extends r0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final p7.y f11101e;

        public b(p7.y yVar) {
            this.f11101e = yVar;
        }

        @Override // p7.r0
        public int f(Object obj) {
            return obj == a.f11098h ? 0 : -1;
        }

        @Override // p7.r0
        public r0.b k(int i11, r0.b bVar, boolean z11) {
            bVar.v(z11 ? 0 : null, z11 ? a.f11098h : null, 0, -9223372036854775807L, 0L, p7.b.f101195g, true);
            return bVar;
        }

        @Override // p7.r0
        public int m() {
            return 1;
        }

        @Override // p7.r0
        public Object q(int i11) {
            return a.f11098h;
        }

        @Override // p7.r0
        public r0.d s(int i11, r0.d dVar, long j11) {
            dVar.h(r0.d.f101471q, this.f11101e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            dVar.f101491k = true;
            return dVar;
        }

        @Override // p7.r0
        public int t() {
            return 1;
        }
    }

    public p(r rVar, boolean z11) {
        super(rVar);
        this.f11090m = z11 && rVar.d();
        this.f11091n = new r0.d();
        this.f11092o = new r0.b();
        r0 r0VarC = rVar.c();
        if (r0VarC == null) {
            this.f11093p = a.z(rVar.a());
        } else {
            this.f11093p = a.A(r0VarC, null, null);
            this.f11097t = true;
        }
    }

    private Object Y(Object obj) {
        return (this.f11093p.f11100g == null || !this.f11093p.f11100g.equals(obj)) ? obj : a.f11098h;
    }

    private Object Z(Object obj) {
        return (this.f11093p.f11100g == null || !obj.equals(a.f11098h)) ? obj : this.f11093p.f11100g;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private boolean b0(long j11) {
        o oVar = this.f11094q;
        int iF = this.f11093p.f(oVar.f11081a.f11103a);
        if (iF == -1) {
            return false;
        }
        long j12 = this.f11093p.j(iF, this.f11092o).f101463d;
        if (j12 != -9223372036854775807L && j11 >= j12) {
            j11 = Math.max(0L, j12 - 1);
        }
        oVar.w(j11);
        return true;
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    public void G() {
        this.f11096s = false;
        this.f11095r = false;
        super.G();
    }

    @Override // androidx.media3.exoplayer.source.l0
    protected r.b N(r.b bVar) {
        return bVar.a(Y(bVar.f11103a));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    /* JADX WARN: Code duplicated, block: B:32:0x00be  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // androidx.media3.exoplayer.source.l0
    protected void U(r0 r0Var) {
        long j11;
        r.b bVarA;
        if (this.f11096s) {
            this.f11093p = this.f11093p.y(r0Var);
            o oVar = this.f11094q;
            if (oVar != null) {
                b0(oVar.q());
            }
        } else {
            if (!r0Var.u()) {
                r0Var.r(0, this.f11091n);
                long jD = this.f11091n.d();
                Object obj = this.f11091n.f101481a;
                o oVar2 = this.f11094q;
                if (oVar2 != null) {
                    long jS = oVar2.s();
                    this.f11093p.l(this.f11094q.f11081a.f11103a, this.f11092o);
                    long jP = this.f11092o.p() + jS;
                    if (jP != this.f11093p.r(0, this.f11091n).d()) {
                        j11 = jP;
                    } else {
                        j11 = jD;
                    }
                } else {
                    j11 = jD;
                }
                Pair<Object, Long> pairN = r0Var.n(this.f11091n, this.f11092o, 0, j11);
                Object obj2 = pairN.first;
                long jLongValue = ((Long) pairN.second).longValue();
                this.f11093p = this.f11097t ? this.f11093p.y(r0Var) : a.A(r0Var, obj, obj2);
                o oVar3 = this.f11094q;
                if (oVar3 != null && b0(jLongValue)) {
                    r.b bVar = oVar3.f11081a;
                    bVarA = bVar.a(Z(bVar.f11103a));
                }
                this.f11097t = true;
                this.f11096s = true;
                F(this.f11093p);
                if (bVarA != null) {
                    ((o) s7.a.f(this.f11094q)).b(bVarA);
                }
            }
            this.f11093p = this.f11097t ? this.f11093p.y(r0Var) : a.A(r0Var, r0.d.f101471q, a.f11098h);
        }
        bVarA = null;
        this.f11097t = true;
        this.f11096s = true;
        F(this.f11093p);
        if (bVarA != null) {
            ((o) s7.a.f(this.f11094q)).b(bVarA);
        }
    }

    @Override // androidx.media3.exoplayer.source.l0
    public void W() {
        if (this.f11090m) {
            return;
        }
        this.f11095r = true;
        V();
    }

    @Override // androidx.media3.exoplayer.source.r
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public o r(r.b bVar, s8.b bVar2, long j11) {
        o oVar = new o(bVar, bVar2, j11);
        oVar.y(this.f11074k);
        if (this.f11096s) {
            oVar.b(bVar.a(Z(bVar.f11103a)));
            return oVar;
        }
        this.f11094q = oVar;
        if (!this.f11095r) {
            this.f11095r = true;
            V();
        }
        return oVar;
    }

    public r0 a0() {
        return this.f11093p;
    }

    @Override // androidx.media3.exoplayer.source.r
    public void h(q qVar) {
        ((o) qVar).x();
        if (qVar == this.f11094q) {
            this.f11094q = null;
        }
    }

    @Override // androidx.media3.exoplayer.source.l0, androidx.media3.exoplayer.source.r
    public void i(p7.y yVar) {
        if (this.f11097t) {
            this.f11093p = this.f11093p.y(new n8.v(this.f11093p.f11075e, yVar));
        } else {
            this.f11093p = a.z(yVar);
        }
        this.f11074k.i(yVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public boolean k(p7.y yVar) {
        return this.f11074k.k(yVar);
    }
}
