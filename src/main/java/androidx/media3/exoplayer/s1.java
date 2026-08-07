package androidx.media3.exoplayer;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class s1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a8.a f10654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s7.p f10655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p1.a f10656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f10657f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f10658g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f10659h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ExoPlayer.c f10660i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private p1 f10661j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private p1 f10662k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private p1 f10663l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private p1 f10664m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private p1 f10665n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f10666o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Object f10667p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f10668q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p7.r0.b f10652a = new p7.r0.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p7.r0.d f10653b = new p7.r0.d();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List<p1> f10669r = new ArrayList();

    public s1(a8.a aVar, s7.p pVar, p1.a aVar2, ExoPlayer.c cVar) {
        this.f10654c = aVar;
        this.f10655d = pVar;
        this.f10656e = aVar2;
        this.f10660i = cVar;
    }

    private boolean A(Object obj, p7.r0 r0Var) {
        int iD = r0Var.l(obj, this.f10652a).d();
        int iQ = this.f10652a.q();
        if (iD <= 0 || !this.f10652a.t(iQ)) {
            return false;
        }
        return iD > 1 || this.f10652a.g(iQ) != Long.MIN_VALUE;
    }

    private boolean C(androidx.media3.exoplayer.source.r.b bVar) {
        return !bVar.b() && bVar.f11107e == -1;
    }

    private boolean D(p7.r0 r0Var, androidx.media3.exoplayer.source.r.b bVar, boolean z11) {
        int iF = r0Var.f(bVar.f11103a);
        return !r0Var.r(r0Var.j(iF, this.f10652a).f101462c, this.f10653b).f101489i && r0Var.v(iF, this.f10652a, this.f10653b, this.f10658g, this.f10659h) && z11;
    }

    private boolean E(p7.r0 r0Var, androidx.media3.exoplayer.source.r.b bVar) {
        if (C(bVar)) {
            return r0Var.r(r0Var.l(bVar.f11103a, this.f10652a).f101462c, this.f10653b).f101495o == r0Var.f(bVar.f11103a);
        }
        return false;
    }

    private static boolean H(p7.r0.b bVar) {
        int iD = bVar.d();
        if (iD != 0 && ((iD != 1 || !bVar.s(0)) && bVar.t(bVar.q()))) {
            long j11 = 0;
            if (bVar.f(0L) == -1) {
                if (bVar.f101463d == 0) {
                    return true;
                }
                int i11 = iD - (bVar.s(iD + (-1)) ? 2 : 1);
                for (int i12 = 0; i12 <= i11; i12++) {
                    j11 += bVar.j(i12);
                }
                if (bVar.f101463d <= j11) {
                    return true;
                }
            }
        }
        return false;
    }

    private void J() {
        final com.google.common.collect.x.a aVarK = com.google.common.collect.x.k();
        for (p1 p1VarK = this.f10661j; p1VarK != null; p1VarK = p1VarK.k()) {
            aVarK.a(p1VarK.f10616h.f10628a);
        }
        p1 p1Var = this.f10662k;
        final androidx.media3.exoplayer.source.r.b bVar = p1Var == null ? null : p1Var.f10616h.f10628a;
        this.f10655d.g(new Runnable() { // from class: androidx.media3.exoplayer.r1
            @Override // java.lang.Runnable
            public final void run() {
                this.f10644a.f10654c.C(aVarK.k(), bVar);
            }
        });
    }

    private void L(List<p1> list) {
        for (int i11 = 0; i11 < this.f10669r.size(); i11++) {
            this.f10669r.get(i11).x();
        }
        this.f10669r = list;
        this.f10665n = null;
        I();
    }

    private p1 O(q1 q1Var) {
        for (int i11 = 0; i11 < this.f10669r.size(); i11++) {
            if (this.f10669r.get(i11).d(q1Var)) {
                return this.f10669r.remove(i11);
            }
        }
        return null;
    }

    private static androidx.media3.exoplayer.source.r.b P(p7.r0 r0Var, Object obj, long j11, long j12, p7.r0.d dVar, p7.r0.b bVar) {
        r0Var.l(obj, bVar);
        r0Var.r(bVar.f101462c, dVar);
        for (int iF = r0Var.f(obj); H(bVar) && iF <= dVar.f101495o; iF++) {
            r0Var.k(iF, bVar, true);
            obj = s7.a.f(bVar.f101461b);
        }
        r0Var.l(obj, bVar);
        int iF2 = bVar.f(j11);
        return iF2 == -1 ? new androidx.media3.exoplayer.source.r.b(obj, j12, bVar.e(j11)) : new androidx.media3.exoplayer.source.r.b(obj, iF2, bVar.m(iF2), j12);
    }

    private long R(p7.r0 r0Var, Object obj) {
        int iF;
        int i11 = r0Var.l(obj, this.f10652a).f101462c;
        Object obj2 = this.f10667p;
        if (obj2 != null && (iF = r0Var.f(obj2)) != -1 && r0Var.j(iF, this.f10652a).f101462c == i11) {
            return this.f10668q;
        }
        for (p1 p1VarK = this.f10661j; p1VarK != null; p1VarK = p1VarK.k()) {
            if (p1VarK.f10610b.equals(obj)) {
                return p1VarK.f10616h.f10628a.f11106d;
            }
        }
        for (p1 p1VarK2 = this.f10661j; p1VarK2 != null; p1VarK2 = p1VarK2.k()) {
            int iF2 = r0Var.f(p1VarK2.f10610b);
            if (iF2 != -1 && r0Var.j(iF2, this.f10652a).f101462c == i11) {
                return p1VarK2.f10616h.f10628a.f11106d;
            }
        }
        long jS = S(obj);
        if (jS != -1) {
            return jS;
        }
        long j11 = this.f10657f;
        this.f10657f = 1 + j11;
        if (this.f10661j == null) {
            this.f10667p = obj;
            this.f10668q = j11;
        }
        return j11;
    }

    private long S(Object obj) {
        for (int i11 = 0; i11 < this.f10669r.size(); i11++) {
            p1 p1Var = this.f10669r.get(i11);
            if (p1Var.f10610b.equals(obj)) {
                return p1Var.f10616h.f10628a.f11106d;
            }
        }
        return -1L;
    }

    private int U(p7.r0 r0Var) {
        p7.r0 r0Var2;
        p1 p1VarK = this.f10661j;
        if (p1VarK == null) {
            return 0;
        }
        int iF = r0Var.f(p1VarK.f10610b);
        while (true) {
            r0Var2 = r0Var;
            iF = r0Var2.h(iF, this.f10652a, this.f10653b, this.f10658g, this.f10659h);
            while (((p1) s7.a.f(p1VarK)).k() != null && !p1VarK.f10616h.f10635h) {
                p1VarK = p1VarK.k();
            }
            p1 p1VarK2 = p1VarK.k();
            if (iF == -1 || p1VarK2 == null || r0Var2.f(p1VarK2.f10610b) != iF) {
                break;
            }
            p1VarK = p1VarK2;
            r0Var = r0Var2;
        }
        int iN = N(p1VarK);
        p1VarK.f10616h = z(r0Var2, p1VarK.f10616h);
        return iN;
    }

    static boolean e(long j11, long j12) {
        return j11 == -9223372036854775807L || j11 == j12;
    }

    private boolean f(q1 q1Var, q1 q1Var2) {
        return q1Var.f10629b == q1Var2.f10629b && q1Var.f10628a.equals(q1Var2.f10628a);
    }

    private Pair<Object, Long> i(p7.r0 r0Var, Object obj, long j11) {
        int i11 = r0Var.i(r0Var.l(obj, this.f10652a).f101462c, this.f10658g, this.f10659h);
        if (i11 != -1) {
            return r0Var.o(this.f10653b, this.f10652a, i11, -9223372036854775807L, j11);
        }
        return null;
    }

    private q1 j(i2 i2Var) {
        return o(i2Var.f10283a, i2Var.f10284b, i2Var.f10285c, i2Var.f10301s);
    }

    private q1 k(p7.r0 r0Var, p1 p1Var, long j11) {
        Object obj;
        long j12;
        q1 q1Var = p1Var.f10616h;
        int iH = r0Var.h(r0Var.f(q1Var.f10628a.f11103a), this.f10652a, this.f10653b, this.f10658g, this.f10659h);
        if (iH == -1) {
            return null;
        }
        int i11 = r0Var.k(iH, this.f10652a, true).f101462c;
        Object objF = s7.a.f(this.f10652a.f101461b);
        long j13 = q1Var.f10628a.f11106d;
        long j14 = 0;
        if (r0Var.r(i11, this.f10653b).f101494n == iH) {
            Pair<Object, Long> pairO = r0Var.o(this.f10653b, this.f10652a, i11, -9223372036854775807L, Math.max(0L, j11));
            if (pairO == null) {
                return null;
            }
            Object obj2 = pairO.first;
            long jLongValue = ((Long) pairO.second).longValue();
            p1 p1VarK = p1Var.k();
            if (p1VarK == null || !p1VarK.f10610b.equals(obj2)) {
                long jS = S(obj2);
                if (jS == -1) {
                    jS = this.f10657f;
                    this.f10657f = 1 + jS;
                }
                j13 = jS;
            } else {
                j13 = p1VarK.f10616h.f10628a.f11106d;
            }
            obj = obj2;
            j12 = jLongValue;
            j14 = -9223372036854775807L;
        } else {
            obj = objF;
            j12 = 0;
        }
        androidx.media3.exoplayer.source.r.b bVarP = P(r0Var, obj, j12, j13, this.f10653b, this.f10652a);
        if (j14 != -9223372036854775807L && q1Var.f10630c != -9223372036854775807L) {
            boolean zA = A(q1Var.f10628a.f11103a, r0Var);
            if (bVarP.b() && zA) {
                j14 = q1Var.f10630c;
            } else if (zA) {
                j12 = q1Var.f10630c;
            }
        }
        return o(r0Var, bVarP, j14, j12);
    }

    private q1 l(p7.r0 r0Var, p1 p1Var, long j11) {
        q1 q1Var = p1Var.f10616h;
        long jM = (p1Var.m() + q1Var.f10632e) - j11;
        return q1Var.f10635h ? k(r0Var, p1Var, jM) : m(r0Var, p1Var, jM);
    }

    private q1 m(p7.r0 r0Var, p1 p1Var, long j11) {
        q1 q1Var = p1Var.f10616h;
        androidx.media3.exoplayer.source.r.b bVar = q1Var.f10628a;
        r0Var.l(bVar.f11103a, this.f10652a);
        boolean z11 = q1Var.f10634g;
        if (!bVar.b()) {
            int i11 = bVar.f11107e;
            if (i11 != -1 && this.f10652a.s(i11)) {
                return k(r0Var, p1Var, j11);
            }
            int iM = this.f10652a.m(bVar.f11107e);
            boolean z12 = this.f10652a.t(bVar.f11107e) && this.f10652a.i(bVar.f11107e, iM) == 3;
            if (iM == this.f10652a.b(bVar.f11107e) || z12) {
                return q(r0Var, bVar.f11103a, s(r0Var, bVar.f11103a, bVar.f11107e), q1Var.f10632e, bVar.f11106d, false);
            }
            return p(r0Var, bVar.f11103a, bVar.f11107e, iM, q1Var.f10632e, bVar.f11106d, z11);
        }
        int i12 = bVar.f11104b;
        int iB = this.f10652a.b(i12);
        if (iB == -1) {
            return null;
        }
        int iN = this.f10652a.n(i12, bVar.f11105c);
        if (iN < iB) {
            return p(r0Var, bVar.f11103a, i12, iN, q1Var.f10630c, bVar.f11106d, z11);
        }
        long jLongValue = q1Var.f10630c;
        if (jLongValue == -9223372036854775807L) {
            p7.r0.d dVar = this.f10653b;
            p7.r0.b bVar2 = this.f10652a;
            Pair<Object, Long> pairO = r0Var.o(dVar, bVar2, bVar2.f101462c, -9223372036854775807L, Math.max(0L, j11));
            if (pairO == null) {
                return null;
            }
            jLongValue = ((Long) pairO.second).longValue();
        }
        return q(r0Var, bVar.f11103a, Math.max(s(r0Var, bVar.f11103a, bVar.f11104b), jLongValue), q1Var.f10630c, bVar.f11106d, z11);
    }

    private q1 o(p7.r0 r0Var, androidx.media3.exoplayer.source.r.b bVar, long j11, long j12) {
        r0Var.l(bVar.f11103a, this.f10652a);
        return bVar.b() ? p(r0Var, bVar.f11103a, bVar.f11104b, bVar.f11105c, j11, bVar.f11106d, false) : q(r0Var, bVar.f11103a, j12, j11, bVar.f11106d, false);
    }

    private q1 p(p7.r0 r0Var, Object obj, int i11, int i12, long j11, long j12, boolean z11) {
        androidx.media3.exoplayer.source.r.b bVar = new androidx.media3.exoplayer.source.r.b(obj, i11, i12, j12);
        long jC = r0Var.l(bVar.f11103a, this.f10652a).c(bVar.f11104b, bVar.f11105c);
        long jH = i12 == this.f10652a.m(i11) ? this.f10652a.h() : 0L;
        boolean zT = this.f10652a.t(bVar.f11104b);
        if (jC != -9223372036854775807L && jH >= jC) {
            jH = Math.max(0L, jC - 1);
        }
        return new q1(bVar, jH, j11, -9223372036854775807L, jC, z11, zT, false, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b6  */
    private q1 q(p7.r0 r0Var, Object obj, long j11, long j12, long j13, boolean z11) {
        boolean z12;
        long j14;
        long jG;
        long j15;
        long jMax = j11;
        r0Var.l(obj, this.f10652a);
        int iE = this.f10652a.e(jMax);
        int i11 = 1;
        if (iE == -1) {
            if (this.f10652a.d() > 0) {
                p7.r0.b bVar = this.f10652a;
                if (bVar.t(bVar.q())) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            } else {
                z12 = false;
            }
        } else if (this.f10652a.t(iE)) {
            long jG2 = this.f10652a.g(iE);
            p7.r0.b bVar2 = this.f10652a;
            if (jG2 == bVar2.f101463d && bVar2.r(iE)) {
                z12 = true;
                iE = -1;
            } else {
                z12 = false;
            }
        } else {
            z12 = false;
        }
        androidx.media3.exoplayer.source.r.b bVar3 = new androidx.media3.exoplayer.source.r.b(obj, j13, iE);
        boolean zC = C(bVar3);
        boolean zE = E(r0Var, bVar3);
        boolean zD = D(r0Var, bVar3, zC);
        boolean z13 = (iE == -1 || !this.f10652a.t(iE) || this.f10652a.s(iE)) ? false : true;
        boolean z14 = iE != -1 && this.f10652a.s(iE) && this.f10652a.t(iE);
        if (iE == -1 || z14) {
            if (z12) {
                jG = this.f10652a.f101463d;
            } else {
                j14 = -9223372036854775807L;
            }
            if (j14 != -9223372036854775807L || j14 == Long.MIN_VALUE) {
                j15 = this.f10652a.f101463d;
            } else {
                j15 = j14;
            }
            if (j15 != -9223372036854775807L && jMax >= j15) {
                if (!zD && z12) {
                    i11 = 0;
                }
                jMax = Math.max(0L, j15 - ((long) i11));
            }
            return new q1(bVar3, jMax, j12, j14, j15, z11, z13, zC, zE, zD);
        }
        jG = this.f10652a.g(iE);
        j14 = jG;
        if (j14 != -9223372036854775807L) {
            j15 = this.f10652a.f101463d;
        } else {
            j15 = this.f10652a.f101463d;
        }
        if (j15 != -9223372036854775807L) {
            if (!zD) {
                i11 = 0;
            }
            jMax = Math.max(0L, j15 - ((long) i11));
        }
        return new q1(bVar3, jMax, j12, j14, j15, z11, z13, zC, zE, zD);
    }

    private q1 r(p7.r0 r0Var, Object obj, long j11, long j12) {
        androidx.media3.exoplayer.source.r.b bVarP = P(r0Var, obj, j11, j12, this.f10653b, this.f10652a);
        return bVarP.b() ? p(r0Var, bVarP.f11103a, bVarP.f11104b, bVarP.f11105c, j11, bVarP.f11106d, false) : q(r0Var, bVarP.f11103a, j11, -9223372036854775807L, bVarP.f11106d, false);
    }

    private long s(p7.r0 r0Var, Object obj, int i11) {
        r0Var.l(obj, this.f10652a);
        long jG = this.f10652a.g(i11);
        return jG == Long.MIN_VALUE ? this.f10652a.f101463d : jG + this.f10652a.j(i11);
    }

    public void B(p7.r0 r0Var) {
        p1 p1Var;
        if (this.f10660i.f9328a == -9223372036854775807L || (p1Var = this.f10664m) == null) {
            M();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Pair<Object, Long> pairI = i(r0Var, p1Var.f10616h.f10628a.f11103a, 0L);
        if (pairI != null && !r0Var.r(r0Var.l(pairI.first, this.f10652a).f101462c, this.f10653b).g()) {
            long jS = S(pairI.first);
            if (jS == -1) {
                jS = this.f10657f;
                this.f10657f = 1 + jS;
            }
            q1 q1VarR = r(r0Var, pairI.first, ((Long) pairI.second).longValue(), jS);
            p1 p1VarO = O(q1VarR);
            if (p1VarO == null) {
                p1VarO = this.f10656e.a(q1VarR, (p1Var.m() + p1Var.f10616h.f10632e) - q1VarR.f10629b);
            }
            arrayList.add(p1VarO);
        }
        L(arrayList);
    }

    public boolean F(androidx.media3.exoplayer.source.q qVar) {
        p1 p1Var = this.f10664m;
        return p1Var != null && p1Var.f10609a == qVar;
    }

    public boolean G(androidx.media3.exoplayer.source.q qVar) {
        p1 p1Var = this.f10665n;
        return p1Var != null && p1Var.f10609a == qVar;
    }

    public void I() {
        p1 p1Var = this.f10665n;
        if (p1Var == null || p1Var.t()) {
            this.f10665n = null;
            for (int i11 = 0; i11 < this.f10669r.size(); i11++) {
                p1 p1Var2 = this.f10669r.get(i11);
                if (!p1Var2.t()) {
                    this.f10665n = p1Var2;
                    return;
                }
            }
        }
    }

    public void K(long j11) {
        p1 p1Var = this.f10664m;
        if (p1Var != null) {
            p1Var.w(j11);
        }
    }

    public void M() {
        if (this.f10669r.isEmpty()) {
            return;
        }
        L(new ArrayList());
    }

    public int N(p1 p1Var) {
        s7.a.j(p1Var);
        int i11 = 0;
        if (p1Var.equals(this.f10664m)) {
            return 0;
        }
        this.f10664m = p1Var;
        while (p1Var.k() != null) {
            p1Var = (p1) s7.a.f(p1Var.k());
            if (p1Var == this.f10662k) {
                p1 p1Var2 = this.f10661j;
                this.f10662k = p1Var2;
                this.f10663l = p1Var2;
                i11 = 3;
            }
            if (p1Var == this.f10663l) {
                this.f10663l = this.f10662k;
                i11 |= 2;
            }
            p1Var.x();
            this.f10666o--;
        }
        ((p1) s7.a.f(this.f10664m)).A(null);
        J();
        return i11;
    }

    public androidx.media3.exoplayer.source.r.b Q(p7.r0 r0Var, Object obj, long j11) {
        long jR = R(r0Var, obj);
        r0Var.l(obj, this.f10652a);
        r0Var.r(this.f10652a.f101462c, this.f10653b);
        boolean z11 = false;
        for (int iF = r0Var.f(obj); iF >= this.f10653b.f101494n; iF--) {
            r0Var.k(iF, this.f10652a, true);
            boolean z12 = this.f10652a.d() > 0;
            z11 |= z12;
            p7.r0.b bVar = this.f10652a;
            if (bVar.f(bVar.f101463d) != -1) {
                obj = s7.a.f(this.f10652a.f101461b);
            }
            if (z11 && (!z12 || this.f10652a.f101463d != 0)) {
                break;
            }
        }
        return P(r0Var, obj, j11, jR, this.f10653b, this.f10652a);
    }

    public boolean T() {
        p1 p1Var = this.f10664m;
        if (p1Var != null) {
            return !p1Var.f10616h.f10637j && p1Var.s() && this.f10664m.f10616h.f10632e != -9223372036854775807L && this.f10666o < 100;
        }
        return true;
    }

    public void V(p7.r0 r0Var, ExoPlayer.c cVar) {
        this.f10660i = cVar;
        B(r0Var);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0094  */
    public int W(p7.r0 r0Var, long j11, long j12, long j13) {
        q1 q1VarZ;
        boolean z11;
        p1 p1VarK = this.f10661j;
        p1 p1Var = null;
        while (p1VarK != null) {
            q1 q1Var = p1VarK.f10616h;
            if (p1Var == null) {
                q1VarZ = z(r0Var, q1Var);
            } else {
                q1 q1VarL = l(r0Var, p1Var, j11);
                if (q1VarL == null || !f(q1Var, q1VarL)) {
                    return N(p1Var);
                }
                q1VarZ = q1VarL;
            }
            p1VarK.f10616h = q1VarZ.a(q1Var.f10630c);
            if (q1Var.f10632e != q1VarZ.f10632e) {
                p1VarK.E();
                long j14 = q1VarZ.f10632e;
                long jD = j14 == -9223372036854775807L ? Long.MAX_VALUE : p1VarK.D(j14);
                boolean z12 = p1VarK == this.f10662k && !p1VarK.f10616h.f10634g && (j12 == Long.MIN_VALUE || j12 >= jD);
                boolean z13 = p1VarK == this.f10663l && (j13 == Long.MIN_VALUE || j13 >= jD);
                int iN = N(p1VarK);
                if (iN != 0) {
                    return iN;
                }
                long j15 = q1Var.f10632e;
                if (j15 == -9223372036854775807L && q1Var.f10631d == Long.MIN_VALUE) {
                    long j16 = q1VarZ.f10631d;
                    if (j16 == -9223372036854775807L || j16 == Long.MIN_VALUE) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                } else {
                    z11 = false;
                }
                int i11 = (!z12 || (j15 == -9223372036854775807L && !z11)) ? 0 : 1;
                return z13 ? i11 | 2 : i11;
            }
            p1Var = p1VarK;
            p1VarK = p1VarK.k();
        }
        return 0;
    }

    public int X(p7.r0 r0Var, int i11) {
        this.f10658g = i11;
        return U(r0Var);
    }

    public int Y(p7.r0 r0Var, boolean z11) {
        this.f10659h = z11;
        return U(r0Var);
    }

    public p1 b() {
        p1 p1Var = this.f10661j;
        if (p1Var == null) {
            return null;
        }
        if (p1Var == this.f10662k) {
            this.f10662k = p1Var.k();
        }
        p1 p1Var2 = this.f10661j;
        if (p1Var2 == this.f10663l) {
            this.f10663l = p1Var2.k();
        }
        this.f10661j.x();
        int i11 = this.f10666o - 1;
        this.f10666o = i11;
        if (i11 == 0) {
            this.f10664m = null;
            p1 p1Var3 = this.f10661j;
            this.f10667p = p1Var3.f10610b;
            this.f10668q = p1Var3.f10616h.f10628a.f11106d;
        }
        this.f10661j = this.f10661j.k();
        J();
        return this.f10661j;
    }

    public p1 c() {
        this.f10663l = ((p1) s7.a.j(this.f10663l)).k();
        J();
        return (p1) s7.a.j(this.f10663l);
    }

    public p1 d() {
        p1 p1Var = this.f10663l;
        p1 p1Var2 = this.f10662k;
        if (p1Var == p1Var2) {
            this.f10663l = ((p1) s7.a.j(p1Var2)).k();
        }
        this.f10662k = ((p1) s7.a.j(this.f10662k)).k();
        J();
        return (p1) s7.a.j(this.f10662k);
    }

    public void g() {
        if (this.f10666o == 0) {
            return;
        }
        p1 p1VarK = (p1) s7.a.j(this.f10661j);
        this.f10667p = p1VarK.f10610b;
        this.f10668q = p1VarK.f10616h.f10628a.f11106d;
        while (p1VarK != null) {
            p1VarK.x();
            p1VarK = p1VarK.k();
        }
        this.f10661j = null;
        this.f10664m = null;
        this.f10662k = null;
        this.f10663l = null;
        this.f10666o = 0;
        J();
    }

    public p1 h(q1 q1Var) {
        p1 p1Var = this.f10664m;
        long jM = p1Var == null ? 1000000000000L : (p1Var.m() + this.f10664m.f10616h.f10632e) - q1Var.f10629b;
        p1 p1VarO = O(q1Var);
        if (p1VarO == null) {
            p1VarO = this.f10656e.a(q1Var, jM);
        } else {
            p1VarO.f10616h = q1Var;
            p1VarO.B(jM);
        }
        p1 p1Var2 = this.f10664m;
        if (p1Var2 != null) {
            p1Var2.A(p1VarO);
        } else {
            this.f10661j = p1VarO;
            this.f10662k = p1VarO;
            this.f10663l = p1VarO;
        }
        this.f10667p = null;
        this.f10664m = p1VarO;
        this.f10666o++;
        J();
        return p1VarO;
    }

    public p1 n() {
        return this.f10664m;
    }

    public q1 t(long j11, i2 i2Var) {
        p1 p1Var = this.f10664m;
        return p1Var == null ? j(i2Var) : l(i2Var.f10283a, p1Var, j11);
    }

    public p1 u() {
        return this.f10661j;
    }

    public p1 v(androidx.media3.exoplayer.source.q qVar) {
        for (int i11 = 0; i11 < this.f10669r.size(); i11++) {
            p1 p1Var = this.f10669r.get(i11);
            if (p1Var.f10609a == qVar) {
                return p1Var;
            }
        }
        return null;
    }

    public p1 w() {
        return this.f10665n;
    }

    public p1 x() {
        return this.f10663l;
    }

    public p1 y() {
        return this.f10662k;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:29:0x007a  */
    public q1 z(p7.r0 r0Var, q1 q1Var) {
        long jL;
        long j11;
        int i11;
        boolean zT;
        int i12;
        androidx.media3.exoplayer.source.r.b bVar = q1Var.f10628a;
        boolean zC = C(bVar);
        boolean zE = E(r0Var, bVar);
        boolean zD = D(r0Var, bVar, zC);
        r0Var.l(q1Var.f10628a.f11103a, this.f10652a);
        long jG = (bVar.b() || (i12 = bVar.f11107e) == -1) ? -9223372036854775807L : this.f10652a.g(i12);
        if (!bVar.b()) {
            if (jG == -9223372036854775807L || jG == Long.MIN_VALUE) {
                jL = this.f10652a.l();
            } else {
                j11 = jG;
            }
            if (bVar.b()) {
                zT = this.f10652a.t(bVar.f11104b);
            } else {
                i11 = bVar.f11107e;
                if (i11 == -1 && this.f10652a.t(i11)) {
                    zT = true;
                } else {
                    zT = false;
                }
            }
            return new q1(bVar, q1Var.f10629b, q1Var.f10630c, jG, j11, q1Var.f10633f, zT, zC, zE, zD);
        }
        jL = this.f10652a.c(bVar.f11104b, bVar.f11105c);
        j11 = jL;
        if (bVar.b()) {
            zT = this.f10652a.t(bVar.f11104b);
        } else {
            i11 = bVar.f11107e;
            if (i11 == -1) {
                zT = false;
            } else {
                zT = false;
            }
        }
        return new q1(bVar, q1Var.f10629b, q1Var.f10630c, jG, j11, q1Var.f10633f, zT, zC, zE, zD);
    }
}
