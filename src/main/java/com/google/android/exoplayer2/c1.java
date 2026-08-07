package com.google.android.exoplayer2;

import android.util.Pair;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f2.b f39682a = new f2.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f2.d f39683b = new f2.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final cr.a f39684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ts.q f39685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f39686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f39687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f39688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private z0 f39689h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private z0 f39690i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private z0 f39691j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f39692k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Object f39693l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f39694m;

    public c1(cr.a aVar, ts.q qVar) {
        this.f39684c = aVar;
        this.f39685d = qVar;
    }

    private void A() {
        final com.google.common.collect.x.a aVarK = com.google.common.collect.x.k();
        for (z0 z0VarJ = this.f39689h; z0VarJ != null; z0VarJ = z0VarJ.j()) {
            aVarK.a(z0VarJ.f41394f.f39406a);
        }
        z0 z0Var = this.f39690i;
        final com.google.android.exoplayer2.source.o.b bVar = z0Var == null ? null : z0Var.f41394f.f39406a;
        this.f39685d.g(new Runnable() { // from class: com.google.android.exoplayer2.b1
            @Override // java.lang.Runnable
            public final void run() {
                this.f39671a.f39684c.H(aVarK.k(), bVar);
            }
        });
    }

    private static com.google.android.exoplayer2.source.o.b D(f2 f2Var, Object obj, long j11, long j12, f2.d dVar, f2.b bVar) {
        f2Var.l(obj, bVar);
        f2Var.r(bVar.f39924c, dVar);
        for (int iF = f2Var.f(obj); z(bVar) && iF <= dVar.f39957p; iF++) {
            f2Var.k(iF, bVar, true);
            obj = ts.a.e(bVar.f39923b);
        }
        f2Var.l(obj, bVar);
        int iH = bVar.h(j11);
        return iH == -1 ? new com.google.android.exoplayer2.source.o.b(obj, j12, bVar.g(j11)) : new com.google.android.exoplayer2.source.o.b(obj, iH, bVar.n(iH), j12);
    }

    private long F(f2 f2Var, Object obj) {
        int iF;
        int i11 = f2Var.l(obj, this.f39682a).f39924c;
        Object obj2 = this.f39693l;
        if (obj2 != null && (iF = f2Var.f(obj2)) != -1 && f2Var.j(iF, this.f39682a).f39924c == i11) {
            return this.f39694m;
        }
        for (z0 z0VarJ = this.f39689h; z0VarJ != null; z0VarJ = z0VarJ.j()) {
            if (z0VarJ.f41390b.equals(obj)) {
                return z0VarJ.f41394f.f39406a.f63160d;
            }
        }
        for (z0 z0VarJ2 = this.f39689h; z0VarJ2 != null; z0VarJ2 = z0VarJ2.j()) {
            int iF2 = f2Var.f(z0VarJ2.f41390b);
            if (iF2 != -1 && f2Var.j(iF2, this.f39682a).f39924c == i11) {
                return z0VarJ2.f41394f.f39406a.f63160d;
            }
        }
        long j11 = this.f39686e;
        this.f39686e = 1 + j11;
        if (this.f39689h == null) {
            this.f39693l = obj;
            this.f39694m = j11;
        }
        return j11;
    }

    private boolean H(f2 f2Var) {
        f2 f2Var2;
        z0 z0VarJ = this.f39689h;
        if (z0VarJ == null) {
            return true;
        }
        int iF = f2Var.f(z0VarJ.f41390b);
        while (true) {
            f2Var2 = f2Var;
            iF = f2Var2.h(iF, this.f39682a, this.f39683b, this.f39687f, this.f39688g);
            while (z0VarJ.j() != null && !z0VarJ.f41394f.f39412g) {
                z0VarJ = z0VarJ.j();
            }
            z0 z0VarJ2 = z0VarJ.j();
            if (iF == -1 || z0VarJ2 == null || f2Var2.f(z0VarJ2.f41390b) != iF) {
                break;
            }
            z0VarJ = z0VarJ2;
            f2Var = f2Var2;
        }
        boolean zC = C(z0VarJ);
        z0VarJ.f41394f = t(f2Var2, z0VarJ.f41394f);
        return !zC;
    }

    private boolean d(long j11, long j12) {
        return j11 == -9223372036854775807L || j11 == j12;
    }

    private boolean e(a1 a1Var, a1 a1Var2) {
        return a1Var.f39407b == a1Var2.f39407b && a1Var.f39406a.equals(a1Var2.f39406a);
    }

    private a1 h(t1 t1Var) {
        return m(t1Var.f40665a, t1Var.f40666b, t1Var.f40667c, t1Var.f40682r);
    }

    private a1 i(f2 f2Var, z0 z0Var, long j11) {
        Object obj;
        long j12;
        a1 a1Var = z0Var.f41394f;
        int iH = f2Var.h(f2Var.f(a1Var.f39406a.f63157a), this.f39682a, this.f39683b, this.f39687f, this.f39688g);
        if (iH == -1) {
            return null;
        }
        int i11 = f2Var.k(iH, this.f39682a, true).f39924c;
        Object objE = ts.a.e(this.f39682a.f39923b);
        long j13 = a1Var.f39406a.f63160d;
        long j14 = 0;
        if (f2Var.r(i11, this.f39683b).f39956o == iH) {
            Pair<Object, Long> pairO = f2Var.o(this.f39683b, this.f39682a, i11, -9223372036854775807L, Math.max(0L, j11));
            if (pairO == null) {
                return null;
            }
            Object obj2 = pairO.first;
            long jLongValue = ((Long) pairO.second).longValue();
            z0 z0VarJ = z0Var.j();
            if (z0VarJ == null || !z0VarJ.f41390b.equals(obj2)) {
                j13 = this.f39686e;
                this.f39686e = 1 + j13;
            } else {
                j13 = z0VarJ.f41394f.f39406a.f63160d;
            }
            obj = obj2;
            j12 = jLongValue;
            j14 = -9223372036854775807L;
        } else {
            obj = objE;
            j12 = 0;
        }
        com.google.android.exoplayer2.source.o.b bVarD = D(f2Var, obj, j12, j13, this.f39683b, this.f39682a);
        if (j14 != -9223372036854775807L && a1Var.f39408c != -9223372036854775807L) {
            boolean zU = u(a1Var.f39406a.f63157a, f2Var);
            if (bVarD.b() && zU) {
                j14 = a1Var.f39408c;
            } else if (zU) {
                j12 = a1Var.f39408c;
            }
        }
        return m(f2Var, bVarD, j14, j12);
    }

    private a1 j(f2 f2Var, z0 z0Var, long j11) {
        a1 a1Var = z0Var.f41394f;
        long jL = (z0Var.l() + a1Var.f39410e) - j11;
        return a1Var.f39412g ? i(f2Var, z0Var, jL) : k(f2Var, z0Var, jL);
    }

    private a1 k(f2 f2Var, z0 z0Var, long j11) {
        a1 a1Var = z0Var.f41394f;
        com.google.android.exoplayer2.source.o.b bVar = a1Var.f39406a;
        f2Var.l(bVar.f63157a, this.f39682a);
        if (!bVar.b()) {
            int i11 = bVar.f63161e;
            if (i11 != -1 && this.f39682a.t(i11)) {
                return i(f2Var, z0Var, j11);
            }
            int iN = this.f39682a.n(bVar.f63161e);
            boolean z11 = this.f39682a.u(bVar.f63161e) && this.f39682a.k(bVar.f63161e, iN) == 3;
            if (iN == this.f39682a.d(bVar.f63161e) || z11) {
                return o(f2Var, bVar.f63157a, p(f2Var, bVar.f63157a, bVar.f63161e), a1Var.f39410e, bVar.f63160d);
            }
            return n(f2Var, bVar.f63157a, bVar.f63161e, iN, a1Var.f39410e, bVar.f63160d);
        }
        int i12 = bVar.f63158b;
        int iD = this.f39682a.d(i12);
        if (iD == -1) {
            return null;
        }
        int iO = this.f39682a.o(i12, bVar.f63159c);
        if (iO < iD) {
            return n(f2Var, bVar.f63157a, i12, iO, a1Var.f39408c, bVar.f63160d);
        }
        long jLongValue = a1Var.f39408c;
        if (jLongValue == -9223372036854775807L) {
            f2.d dVar = this.f39683b;
            f2.b bVar2 = this.f39682a;
            Pair<Object, Long> pairO = f2Var.o(dVar, bVar2, bVar2.f39924c, -9223372036854775807L, Math.max(0L, j11));
            if (pairO == null) {
                return null;
            }
            jLongValue = ((Long) pairO.second).longValue();
        }
        return o(f2Var, bVar.f63157a, Math.max(p(f2Var, bVar.f63157a, bVar.f63158b), jLongValue), a1Var.f39408c, bVar.f63160d);
    }

    private a1 m(f2 f2Var, com.google.android.exoplayer2.source.o.b bVar, long j11, long j12) {
        f2Var.l(bVar.f63157a, this.f39682a);
        return bVar.b() ? n(f2Var, bVar.f63157a, bVar.f63158b, bVar.f63159c, j11, bVar.f63160d) : o(f2Var, bVar.f63157a, j12, j11, bVar.f63160d);
    }

    private a1 n(f2 f2Var, Object obj, int i11, int i12, long j11, long j12) {
        com.google.android.exoplayer2.source.o.b bVar = new com.google.android.exoplayer2.source.o.b(obj, i11, i12, j12);
        long jE = f2Var.l(bVar.f63157a, this.f39682a).e(bVar.f63158b, bVar.f63159c);
        long j13 = i12 == this.f39682a.n(i11) ? this.f39682a.j() : 0L;
        boolean zU = this.f39682a.u(bVar.f63158b);
        if (jE != -9223372036854775807L && j13 >= jE) {
            j13 = Math.max(0L, jE - 1);
        }
        return new a1(bVar, j13, j11, -9223372036854775807L, jE, zU, false, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ba  */
    private a1 o(f2 f2Var, Object obj, long j11, long j12, long j13) {
        boolean z11;
        long j14;
        long jI;
        long j15;
        long jMax = j11;
        f2Var.l(obj, this.f39682a);
        int iG = this.f39682a.g(jMax);
        boolean z12 = iG != -1 && this.f39682a.t(iG);
        if (iG == -1) {
            if (this.f39682a.f() > 0) {
                f2.b bVar = this.f39682a;
                if (bVar.u(bVar.r())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
        } else if (this.f39682a.u(iG)) {
            long jI2 = this.f39682a.i(iG);
            f2.b bVar2 = this.f39682a;
            if (jI2 == bVar2.f39925d && bVar2.s(iG)) {
                z11 = true;
                iG = -1;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        com.google.android.exoplayer2.source.o.b bVar3 = new com.google.android.exoplayer2.source.o.b(obj, j13, iG);
        boolean zV = v(bVar3);
        boolean zX = x(f2Var, bVar3);
        boolean zW = w(f2Var, bVar3, zV);
        boolean z13 = (iG == -1 || !this.f39682a.u(iG) || z12) ? false : true;
        if (iG == -1 || z12) {
            if (z11) {
                jI = this.f39682a.f39925d;
            } else {
                j14 = -9223372036854775807L;
            }
            if (j14 != -9223372036854775807L || j14 == Long.MIN_VALUE) {
                j15 = this.f39682a.f39925d;
            } else {
                j15 = j14;
            }
            if (j15 != -9223372036854775807L && jMax >= j15) {
                jMax = Math.max(0L, j15 - ((long) ((zW && z11) ? 0 : 1)));
            }
            return new a1(bVar3, jMax, j12, j14, j15, z13, zV, zX, zW);
        }
        jI = this.f39682a.i(iG);
        j14 = jI;
        if (j14 != -9223372036854775807L) {
            j15 = this.f39682a.f39925d;
        } else {
            j15 = this.f39682a.f39925d;
        }
        if (j15 != -9223372036854775807L) {
            jMax = Math.max(0L, j15 - ((long) ((zW && z11) ? 0 : 1)));
        }
        return new a1(bVar3, jMax, j12, j14, j15, z13, zV, zX, zW);
    }

    private long p(f2 f2Var, Object obj, int i11) {
        f2Var.l(obj, this.f39682a);
        long jI = this.f39682a.i(i11);
        return jI == Long.MIN_VALUE ? this.f39682a.f39925d : jI + this.f39682a.l(i11);
    }

    private boolean u(Object obj, f2 f2Var) {
        int iF = f2Var.l(obj, this.f39682a).f();
        int iR = this.f39682a.r();
        if (iF <= 0 || !this.f39682a.u(iR)) {
            return false;
        }
        return iF > 1 || this.f39682a.i(iR) != Long.MIN_VALUE;
    }

    private boolean v(com.google.android.exoplayer2.source.o.b bVar) {
        return !bVar.b() && bVar.f63161e == -1;
    }

    private boolean w(f2 f2Var, com.google.android.exoplayer2.source.o.b bVar, boolean z11) {
        int iF = f2Var.f(bVar.f63157a);
        return !f2Var.r(f2Var.j(iF, this.f39682a).f39924c, this.f39683b).f39950i && f2Var.v(iF, this.f39682a, this.f39683b, this.f39687f, this.f39688g) && z11;
    }

    private boolean x(f2 f2Var, com.google.android.exoplayer2.source.o.b bVar) {
        if (v(bVar)) {
            return f2Var.r(f2Var.l(bVar.f63157a, this.f39682a).f39924c, this.f39683b).f39957p == f2Var.f(bVar.f63157a);
        }
        return false;
    }

    private static boolean z(f2.b bVar) {
        int iF = bVar.f();
        if (iF != 0 && ((iF != 1 || !bVar.t(0)) && bVar.u(bVar.r()))) {
            long jL = 0;
            if (bVar.h(0L) == -1) {
                if (bVar.f39925d == 0) {
                    return true;
                }
                int i11 = iF - (bVar.t(iF + (-1)) ? 2 : 1);
                for (int i12 = 0; i12 <= i11; i12++) {
                    jL += bVar.l(i12);
                }
                if (bVar.f39925d <= jL) {
                    return true;
                }
            }
        }
        return false;
    }

    public void B(long j11) {
        z0 z0Var = this.f39691j;
        if (z0Var != null) {
            z0Var.s(j11);
        }
    }

    public boolean C(z0 z0Var) {
        boolean z11 = false;
        ts.a.g(z0Var != null);
        if (z0Var.equals(this.f39691j)) {
            return false;
        }
        this.f39691j = z0Var;
        while (z0Var.j() != null) {
            z0Var = z0Var.j();
            if (z0Var == this.f39690i) {
                this.f39690i = this.f39689h;
                z11 = true;
            }
            z0Var.t();
            this.f39692k--;
        }
        this.f39691j.w(null);
        A();
        return z11;
    }

    public com.google.android.exoplayer2.source.o.b E(f2 f2Var, Object obj, long j11) {
        long jF = F(f2Var, obj);
        f2Var.l(obj, this.f39682a);
        f2Var.r(this.f39682a.f39924c, this.f39683b);
        boolean z11 = false;
        for (int iF = f2Var.f(obj); iF >= this.f39683b.f39956o; iF--) {
            f2Var.k(iF, this.f39682a, true);
            boolean z12 = this.f39682a.f() > 0;
            z11 |= z12;
            f2.b bVar = this.f39682a;
            if (bVar.h(bVar.f39925d) != -1) {
                obj = ts.a.e(this.f39682a.f39923b);
            }
            if (z11 && (!z12 || this.f39682a.f39925d != 0)) {
                break;
            }
        }
        return D(f2Var, obj, j11, jF, this.f39683b, this.f39682a);
    }

    public boolean G() {
        z0 z0Var = this.f39691j;
        if (z0Var != null) {
            return !z0Var.f41394f.f39414i && z0Var.q() && this.f39691j.f41394f.f39410e != -9223372036854775807L && this.f39692k < 100;
        }
        return true;
    }

    public boolean I(f2 f2Var, long j11, long j12) {
        boolean zC;
        a1 a1VarT;
        z0 z0VarJ = this.f39689h;
        z0 z0Var = null;
        while (z0VarJ != null) {
            a1 a1Var = z0VarJ.f41394f;
            if (z0Var != null) {
                a1 a1VarJ = j(f2Var, z0Var, j11);
                if (a1VarJ == null) {
                    zC = C(z0Var);
                } else if (e(a1Var, a1VarJ)) {
                    a1VarT = a1VarJ;
                } else {
                    zC = C(z0Var);
                }
                return !zC;
            }
            a1VarT = t(f2Var, a1Var);
            z0VarJ.f41394f = a1VarT.a(a1Var.f39408c);
            if (!d(a1Var.f39410e, a1VarT.f39410e)) {
                z0VarJ.A();
                long j13 = a1VarT.f39410e;
                return (C(z0VarJ) || (z0VarJ == this.f39690i && !z0VarJ.f41394f.f39411f && ((j12 > Long.MIN_VALUE ? 1 : (j12 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j12 > ((j13 > (-9223372036854775807L) ? 1 : (j13 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : z0VarJ.z(j13)) ? 1 : (j12 == ((j13 > (-9223372036854775807L) ? 1 : (j13 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : z0VarJ.z(j13)) ? 0 : -1)) >= 0))) ? false : true;
            }
            z0Var = z0VarJ;
            z0VarJ = z0VarJ.j();
        }
        return true;
    }

    public boolean J(f2 f2Var, int i11) {
        this.f39687f = i11;
        return H(f2Var);
    }

    public boolean K(f2 f2Var, boolean z11) {
        this.f39688g = z11;
        return H(f2Var);
    }

    public z0 b() {
        z0 z0Var = this.f39689h;
        if (z0Var == null) {
            return null;
        }
        if (z0Var == this.f39690i) {
            this.f39690i = z0Var.j();
        }
        this.f39689h.t();
        int i11 = this.f39692k - 1;
        this.f39692k = i11;
        if (i11 == 0) {
            this.f39691j = null;
            z0 z0Var2 = this.f39689h;
            this.f39693l = z0Var2.f41390b;
            this.f39694m = z0Var2.f41394f.f39406a.f63160d;
        }
        this.f39689h = this.f39689h.j();
        A();
        return this.f39689h;
    }

    public z0 c() {
        z0 z0Var = this.f39690i;
        ts.a.g((z0Var == null || z0Var.j() == null) ? false : true);
        this.f39690i = this.f39690i.j();
        A();
        return this.f39690i;
    }

    public void f() {
        if (this.f39692k == 0) {
            return;
        }
        z0 z0VarJ = (z0) ts.a.i(this.f39689h);
        this.f39693l = z0VarJ.f41390b;
        this.f39694m = z0VarJ.f41394f.f39406a.f63160d;
        while (z0VarJ != null) {
            z0VarJ.t();
            z0VarJ = z0VarJ.j();
        }
        this.f39689h = null;
        this.f39691j = null;
        this.f39690i = null;
        this.f39692k = 0;
        A();
    }

    public z0 g(a2[] a2VarArr, qs.a0 a0Var, ss.b bVar, q1 q1Var, a1 a1Var, qs.b0 b0Var) {
        a1 a1Var2;
        long jL;
        z0 z0Var = this.f39691j;
        if (z0Var == null) {
            jL = 1000000000000L;
            a1Var2 = a1Var;
        } else {
            a1Var2 = a1Var;
            jL = (z0Var.l() + this.f39691j.f41394f.f39410e) - a1Var2.f39407b;
        }
        z0 z0Var2 = new z0(a2VarArr, jL, a0Var, bVar, q1Var, a1Var2, b0Var);
        z0 z0Var3 = this.f39691j;
        if (z0Var3 != null) {
            z0Var3.w(z0Var2);
        } else {
            this.f39689h = z0Var2;
            this.f39690i = z0Var2;
        }
        this.f39693l = null;
        this.f39691j = z0Var2;
        this.f39692k++;
        A();
        return z0Var2;
    }

    public z0 l() {
        return this.f39691j;
    }

    public a1 q(long j11, t1 t1Var) {
        z0 z0Var = this.f39691j;
        return z0Var == null ? h(t1Var) : j(t1Var.f40665a, z0Var, j11);
    }

    public z0 r() {
        return this.f39689h;
    }

    public z0 s() {
        return this.f39690i;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    public a1 t(f2 f2Var, a1 a1Var) {
        long jM;
        long j11;
        int i11;
        boolean zU;
        int i12;
        com.google.android.exoplayer2.source.o.b bVar = a1Var.f39406a;
        boolean zV = v(bVar);
        boolean zX = x(f2Var, bVar);
        boolean zW = w(f2Var, bVar, zV);
        f2Var.l(a1Var.f39406a.f63157a, this.f39682a);
        long jI = (bVar.b() || (i12 = bVar.f63161e) == -1) ? -9223372036854775807L : this.f39682a.i(i12);
        if (!bVar.b()) {
            if (jI == -9223372036854775807L || jI == Long.MIN_VALUE) {
                jM = this.f39682a.m();
            } else {
                j11 = jI;
            }
            if (bVar.b()) {
                zU = this.f39682a.u(bVar.f63158b);
            } else {
                i11 = bVar.f63161e;
                if (i11 == -1 && this.f39682a.u(i11)) {
                    zU = true;
                } else {
                    zU = false;
                }
            }
            return new a1(bVar, a1Var.f39407b, a1Var.f39408c, jI, j11, zU, zV, zX, zW);
        }
        jM = this.f39682a.e(bVar.f63158b, bVar.f63159c);
        j11 = jM;
        if (bVar.b()) {
            zU = this.f39682a.u(bVar.f63158b);
        } else {
            i11 = bVar.f63161e;
            if (i11 == -1) {
                zU = false;
            } else {
                zU = false;
            }
        }
        return new a1(bVar, a1Var.f39407b, a1Var.f39408c, jI, j11, zU, zV, zX, zW);
    }

    public boolean y(com.google.android.exoplayer2.source.n nVar) {
        z0 z0Var = this.f39691j;
        return z0Var != null && z0Var.f41389a == nVar;
    }
}
