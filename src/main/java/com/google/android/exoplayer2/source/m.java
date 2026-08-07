package com.google.android.exoplayer2.source;

import android.util.Pair;
import com.google.android.exoplayer2.f2;
import com.google.android.exoplayer2.x0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class m extends g0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f40491m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final f2.d f40492n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final f2.b f40493o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private a f40494p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private l f40495q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f40496r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f40497s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f40498t;

    private static final class a extends j {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final Object f40499i = new Object();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Object f40500g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Object f40501h;

        private a(f2 f2Var, Object obj, Object obj2) {
            super(f2Var);
            this.f40500g = obj;
            this.f40501h = obj2;
        }

        public static a y(x0 x0Var) {
            return new a(new b(x0Var), f2.d.f39933r, f40499i);
        }

        public static a z(f2 f2Var, Object obj, Object obj2) {
            return new a(f2Var, obj, obj2);
        }

        @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.f2
        public int f(Object obj) {
            Object obj2;
            f2 f2Var = this.f40476f;
            if (f40499i.equals(obj) && (obj2 = this.f40501h) != null) {
                obj = obj2;
            }
            return f2Var.f(obj);
        }

        @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.f2
        public f2.b k(int i11, f2.b bVar, boolean z11) {
            this.f40476f.k(i11, bVar, z11);
            if (p0.c(bVar.f39923b, this.f40501h) && z11) {
                bVar.f39923b = f40499i;
            }
            return bVar;
        }

        @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.f2
        public Object q(int i11) {
            Object objQ = this.f40476f.q(i11);
            return p0.c(objQ, this.f40501h) ? f40499i : objQ;
        }

        @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.f2
        public f2.d s(int i11, f2.d dVar, long j11) {
            this.f40476f.s(i11, dVar, j11);
            if (p0.c(dVar.f39942a, this.f40500g)) {
                dVar.f39942a = f2.d.f39933r;
            }
            return dVar;
        }

        public a x(f2 f2Var) {
            return new a(f2Var, this.f40500g, this.f40501h);
        }
    }

    public static final class b extends f2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final x0 f40502f;

        public b(x0 x0Var) {
            this.f40502f = x0Var;
        }

        @Override // com.google.android.exoplayer2.f2
        public int f(Object obj) {
            return obj == a.f40499i ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.f2
        public f2.b k(int i11, f2.b bVar, boolean z11) {
            bVar.w(z11 ? 0 : null, z11 ? a.f40499i : null, 0, -9223372036854775807L, 0L, fs.c.f66525g, true);
            return bVar;
        }

        @Override // com.google.android.exoplayer2.f2
        public int m() {
            return 1;
        }

        @Override // com.google.android.exoplayer2.f2
        public Object q(int i11) {
            return a.f40499i;
        }

        @Override // com.google.android.exoplayer2.f2
        public f2.d s(int i11, f2.d dVar, long j11) {
            dVar.i(f2.d.f39933r, this.f40502f, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            dVar.f39953l = true;
            return dVar;
        }

        @Override // com.google.android.exoplayer2.f2
        public int t() {
            return 1;
        }
    }

    public m(o oVar, boolean z11) {
        super(oVar);
        this.f40491m = z11 && oVar.d();
        this.f40492n = new f2.d();
        this.f40493o = new f2.b();
        f2 f2VarC = oVar.c();
        if (f2VarC == null) {
            this.f40494p = a.y(oVar.a());
        } else {
            this.f40494p = a.z(f2VarC, null, null);
            this.f40498t = true;
        }
    }

    private Object R(Object obj) {
        return (this.f40494p.f40501h == null || !this.f40494p.f40501h.equals(obj)) ? obj : a.f40499i;
    }

    private Object S(Object obj) {
        return (this.f40494p.f40501h == null || !obj.equals(a.f40499i)) ? obj : this.f40494p.f40501h;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private void U(long j11) {
        l lVar = this.f40495q;
        int iF = this.f40494p.f(lVar.f40482a.f63157a);
        if (iF == -1) {
            return;
        }
        long j12 = this.f40494p.j(iF, this.f40493o).f39925d;
        if (j12 != -9223372036854775807L && j11 >= j12) {
            j11 = Math.max(0L, j12 - 1);
        }
        lVar.t(j11);
    }

    @Override // com.google.android.exoplayer2.source.g0
    protected o.b G(o.b bVar) {
        return bVar.c(R(bVar.f63157a));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.exoplayer2.source.g0
    protected void M(f2 f2Var) {
        long j11;
        o.b bVarC;
        if (this.f40497s) {
            this.f40494p = this.f40494p.x(f2Var);
            l lVar = this.f40495q;
            if (lVar != null) {
                U(lVar.m());
            }
        } else {
            if (!f2Var.u()) {
                f2Var.r(0, this.f40492n);
                long jE = this.f40492n.e();
                Object obj = this.f40492n.f39942a;
                l lVar2 = this.f40495q;
                if (lVar2 != null) {
                    long jP = lVar2.p();
                    this.f40494p.l(this.f40495q.f40482a.f63157a, this.f40493o);
                    long jQ = this.f40493o.q() + jP;
                    if (jQ != this.f40494p.r(0, this.f40492n).e()) {
                        j11 = jQ;
                    } else {
                        j11 = jE;
                    }
                } else {
                    j11 = jE;
                }
                Pair<Object, Long> pairN = f2Var.n(this.f40492n, this.f40493o, 0, j11);
                Object obj2 = pairN.first;
                long jLongValue = ((Long) pairN.second).longValue();
                this.f40494p = this.f40498t ? this.f40494p.x(f2Var) : a.z(f2Var, obj, obj2);
                l lVar3 = this.f40495q;
                if (lVar3 != null) {
                    U(jLongValue);
                    o.b bVar = lVar3.f40482a;
                    bVarC = bVar.c(S(bVar.f63157a));
                }
                this.f40498t = true;
                this.f40497s = true;
                y(this.f40494p);
                if (bVarC != null) {
                    ((l) ts.a.e(this.f40495q)).b(bVarC);
                }
            }
            this.f40494p = this.f40498t ? this.f40494p.x(f2Var) : a.z(f2Var, f2.d.f39933r, a.f40499i);
        }
        bVarC = null;
        this.f40498t = true;
        this.f40497s = true;
        y(this.f40494p);
        if (bVarC != null) {
            ((l) ts.a.e(this.f40495q)).b(bVarC);
        }
    }

    @Override // com.google.android.exoplayer2.source.g0
    public void P() {
        if (this.f40491m) {
            return;
        }
        this.f40496r = true;
        O();
    }

    @Override // com.google.android.exoplayer2.source.o
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public l g(o.b bVar, ss.b bVar2, long j11) {
        l lVar = new l(bVar, bVar2, j11);
        lVar.w(this.f40454k);
        if (this.f40497s) {
            lVar.b(bVar.c(S(bVar.f63157a)));
            return lVar;
        }
        this.f40495q = lVar;
        if (!this.f40496r) {
            this.f40496r = true;
            O();
        }
        return lVar;
    }

    public f2 T() {
        return this.f40494p;
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.o
    public void b() {
    }

    @Override // com.google.android.exoplayer2.source.o
    public void i(n nVar) {
        ((l) nVar).v();
        if (nVar == this.f40495q) {
            this.f40495q = null;
        }
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    public void z() {
        this.f40497s = false;
        this.f40496r = false;
        super.z();
    }
}
