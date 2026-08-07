package androidx.media3.exoplayer;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l2 f10591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f10592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l2 f10593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f10594d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f10595e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f10596f = false;

    public n2(l2 l2Var, l2 l2Var2, int i11) {
        this.f10591a = l2Var;
        this.f10592b = i11;
        this.f10593c = l2Var2;
    }

    private boolean A() {
        return this.f10594d == 3;
    }

    private void C(l2 l2Var, n8.s sVar, k kVar, long j11, boolean z11) {
        if (z(l2Var)) {
            if (sVar != l2Var.f()) {
                d(l2Var, kVar);
            } else if (z11) {
                l2Var.o(j11);
            }
        }
    }

    private void E(boolean z11) {
        if (z11) {
            if (this.f10595e) {
                this.f10591a.reset();
                this.f10595e = false;
                return;
            }
            return;
        }
        if (this.f10596f) {
            ((l2) s7.a.f(this.f10593c)).reset();
            this.f10596f = false;
        }
    }

    private int K(l2 l2Var, p1 p1Var, r8.b0 b0Var, k kVar) {
        if (l2Var == null || !z(l2Var) || ((l2Var == this.f10591a && w()) || (l2Var == this.f10593c && A()))) {
            return 1;
        }
        n8.s sVarF = l2Var.f();
        n8.s[] sVarArr = p1Var.f10611c;
        int i11 = this.f10592b;
        boolean z11 = sVarF != sVarArr[i11];
        boolean zC = b0Var.c(i11);
        if (zC && !z11) {
            return 1;
        }
        if (!l2Var.l()) {
            l2Var.N(i(b0Var.f107156c[this.f10592b]), (n8.s) s7.a.f(p1Var.f10611c[this.f10592b]), p1Var.n(), p1Var.m(), p1Var.f10616h.f10628a);
            return 3;
        }
        if (!l2Var.a()) {
            return 0;
        }
        d(l2Var, kVar);
        if (!zC || u()) {
            E(l2Var == this.f10591a);
        }
        return 1;
    }

    private void P(l2 l2Var, long j11) {
        l2Var.t();
        if (l2Var instanceof q8.i) {
            ((q8.i) l2Var).G0(j11);
        }
    }

    private void Z(boolean z11) {
        if (z11) {
            ((l2) s7.a.f(this.f10593c)).k(17, this.f10591a);
        } else {
            this.f10591a.k(17, s7.a.f(this.f10593c));
        }
    }

    private void d(l2 l2Var, k kVar) {
        s7.a.h(this.f10591a == l2Var || this.f10593c == l2Var);
        if (z(l2Var)) {
            kVar.a(l2Var);
            g(l2Var);
            l2Var.disable();
        }
    }

    private void g(l2 l2Var) {
        if (l2Var.getState() == 2) {
            l2Var.stop();
        }
    }

    private static p7.u[] i(r8.t tVar) {
        int length = tVar != null ? tVar.length() : 0;
        p7.u[] uVarArr = new p7.u[length];
        for (int i11 = 0; i11 < length; i11++) {
            uVarArr[i11] = ((r8.t) s7.a.f(tVar)).h(i11);
        }
        return uVarArr;
    }

    private l2 l(p1 p1Var) {
        if (p1Var != null && p1Var.f10611c[this.f10592b] != null) {
            if (this.f10591a.f() == p1Var.f10611c[this.f10592b]) {
                return this.f10591a;
            }
            l2 l2Var = this.f10593c;
            if (l2Var != null && l2Var.f() == p1Var.f10611c[this.f10592b]) {
                return this.f10593c;
            }
        }
        return null;
    }

    private boolean p(p1 p1Var, l2 l2Var) {
        if (l2Var == null) {
            return true;
        }
        n8.s sVar = p1Var.f10611c[this.f10592b];
        if (l2Var.f() == null || (l2Var.f() == sVar && (sVar == null || l2Var.h() || q(l2Var, p1Var)))) {
            return true;
        }
        p1 p1VarK = p1Var.k();
        return p1VarK != null && p1VarK.f10611c[this.f10592b] == l2Var.f();
    }

    private boolean q(l2 l2Var, p1 p1Var) {
        p1 p1VarK = p1Var.k();
        if (p1Var.f10616h.f10634g && p1VarK != null && p1VarK.f10614f) {
            return (l2Var instanceof q8.i) || (l2Var instanceof k8.c) || l2Var.n() >= p1VarK.n();
        }
        return false;
    }

    private boolean w() {
        int i11 = this.f10594d;
        return i11 == 2 || i11 == 4;
    }

    private static boolean z(l2 l2Var) {
        return l2Var.getState() != 0;
    }

    public void B(n8.s sVar, k kVar, long j11, boolean z11) {
        C(this.f10591a, sVar, kVar, j11, z11);
        l2 l2Var = this.f10593c;
        if (l2Var != null) {
            C(l2Var, sVar, kVar, j11, z11);
        }
    }

    public void D() {
        int i11 = this.f10594d;
        if (i11 == 3 || i11 == 4) {
            Z(i11 == 4);
            this.f10594d = this.f10594d != 4 ? 1 : 0;
        } else if (i11 == 2) {
            this.f10594d = 0;
        }
    }

    public void F(r8.b0 b0Var, r8.b0 b0Var2, long j11) {
        int i11;
        boolean zC = b0Var.c(this.f10592b);
        boolean zC2 = b0Var2.c(this.f10592b);
        l2 l2Var = (this.f10593c == null || (i11 = this.f10594d) == 3 || (i11 == 0 && z(this.f10591a))) ? this.f10591a : (l2) s7.a.f(this.f10593c);
        if (!zC || l2Var.l()) {
            return;
        }
        boolean z11 = m() == -2;
        z7.y[] yVarArr = b0Var.f107155b;
        int i12 = this.f10592b;
        z7.y yVar = yVarArr[i12];
        z7.y yVar2 = b0Var2.f107155b[i12];
        if (!zC2 || !Objects.equals(yVar2, yVar) || z11 || u()) {
            P(l2Var, j11);
        }
    }

    public void G(p1 p1Var) {
        ((l2) s7.a.f(l(p1Var))).w();
    }

    public void H() {
        this.f10591a.release();
        this.f10595e = false;
        l2 l2Var = this.f10593c;
        if (l2Var != null) {
            l2Var.release();
            this.f10596f = false;
        }
    }

    public void I(long j11, long j12) {
        if (z(this.f10591a)) {
            this.f10591a.d(j11, j12);
        }
        l2 l2Var = this.f10593c;
        if (l2Var == null || !z(l2Var)) {
            return;
        }
        this.f10593c.d(j11, j12);
    }

    public int J(p1 p1Var, r8.b0 b0Var, k kVar) {
        int iK = K(this.f10591a, p1Var, b0Var, kVar);
        return iK == 1 ? K(this.f10593c, p1Var, b0Var, kVar) : iK;
    }

    public void L() {
        if (!z(this.f10591a)) {
            E(true);
        }
        l2 l2Var = this.f10593c;
        if (l2Var == null || z(l2Var)) {
            return;
        }
        E(false);
    }

    public void M(p1 p1Var, long j11) {
        l2 l2VarL = l(p1Var);
        if (l2VarL != null) {
            l2VarL.o(j11);
        }
    }

    public void N(long j11) {
        int i11;
        if (z(this.f10591a) && (i11 = this.f10594d) != 4 && i11 != 2) {
            P(this.f10591a, j11);
        }
        l2 l2Var = this.f10593c;
        if (l2Var == null || !z(l2Var) || this.f10594d == 3) {
            return;
        }
        P(this.f10593c, j11);
    }

    public void O(p1 p1Var, long j11) {
        P((l2) s7.a.f(l(p1Var)), j11);
    }

    public void Q(float f11, float f12) {
        this.f10591a.z(f11, f12);
        l2 l2Var = this.f10593c;
        if (l2Var != null) {
            l2Var.z(f11, f12);
        }
    }

    public void R(z7.a0 a0Var) {
        this.f10591a.k(18, a0Var);
        l2 l2Var = this.f10593c;
        if (l2Var != null) {
            l2Var.k(18, a0Var);
        }
    }

    public void S(p7.r0 r0Var) {
        this.f10591a.G(r0Var);
        l2 l2Var = this.f10593c;
        if (l2Var != null) {
            l2Var.G(r0Var);
        }
    }

    public void T(u8.k kVar) {
        if (m() != 2) {
            return;
        }
        this.f10591a.k(7, kVar);
        l2 l2Var = this.f10593c;
        if (l2Var != null) {
            l2Var.k(7, kVar);
        }
    }

    public void U(Object obj) {
        if (m() != 2) {
            return;
        }
        int i11 = this.f10594d;
        if (i11 == 4 || i11 == 1) {
            ((l2) s7.a.f(this.f10593c)).k(1, obj);
        } else {
            this.f10591a.k(1, obj);
        }
    }

    public void V(float f11) {
        if (m() != 1) {
            return;
        }
        this.f10591a.k(2, Float.valueOf(f11));
        l2 l2Var = this.f10593c;
        if (l2Var != null) {
            l2Var.k(2, Float.valueOf(f11));
        }
    }

    public void W() {
        if (this.f10591a.getState() == 1 && this.f10594d != 4) {
            this.f10591a.start();
            return;
        }
        l2 l2Var = this.f10593c;
        if (l2Var == null || l2Var.getState() != 1 || this.f10594d == 3) {
            return;
        }
        this.f10593c.start();
    }

    public void X() {
        int i11;
        s7.a.h(!u());
        if (z(this.f10591a)) {
            i11 = 3;
        } else {
            l2 l2Var = this.f10593c;
            i11 = (l2Var == null || !z(l2Var)) ? 2 : 4;
        }
        this.f10594d = i11;
    }

    public void Y() {
        if (z(this.f10591a)) {
            g(this.f10591a);
        }
        l2 l2Var = this.f10593c;
        if (l2Var == null || !z(l2Var)) {
            return;
        }
        g(this.f10593c);
    }

    public boolean a(p1 p1Var) {
        l2 l2VarL = l(p1Var);
        return l2VarL == null || l2VarL.h() || l2VarL.isReady() || l2VarL.a();
    }

    public void b(k kVar) {
        d(this.f10591a, kVar);
        l2 l2Var = this.f10593c;
        if (l2Var != null) {
            boolean z11 = z(l2Var) && this.f10594d != 3;
            d(this.f10593c, kVar);
            E(false);
            if (z11) {
                Z(true);
            }
        }
        this.f10594d = 0;
    }

    public void c(k kVar) {
        if (u()) {
            int i11 = this.f10594d;
            boolean z11 = i11 == 4 || i11 == 2;
            int i12 = i11 != 4 ? 0 : 1;
            d(z11 ? this.f10591a : (l2) s7.a.f(this.f10593c), kVar);
            E(z11);
            this.f10594d = i12;
        }
    }

    public void e(z7.y yVar, r8.t tVar, n8.s sVar, long j11, boolean z11, boolean z12, long j12, long j13, androidx.media3.exoplayer.source.r.b bVar, k kVar) throws ExoPlaybackException {
        p7.u[] uVarArrI = i(tVar);
        int i11 = this.f10594d;
        if (i11 == 0 || i11 == 2 || i11 == 4) {
            this.f10595e = true;
            this.f10591a.P(yVar, uVarArrI, sVar, j11, z11, z12, j12, j13, bVar);
            kVar.b(this.f10591a);
        } else {
            this.f10596f = true;
            ((l2) s7.a.f(this.f10593c)).P(yVar, uVarArrI, sVar, j11, z11, z12, j12, j13, bVar);
            kVar.b(this.f10593c);
        }
    }

    public void f() {
        if (z(this.f10591a)) {
            this.f10591a.K();
            return;
        }
        l2 l2Var = this.f10593c;
        if (l2Var == null || !z(l2Var)) {
            return;
        }
        this.f10593c.K();
    }

    public int h() {
        boolean z11 = z(this.f10591a);
        l2 l2Var = this.f10593c;
        return (z11 ? 1 : 0) + ((l2Var == null || !z(l2Var)) ? 0 : 1);
    }

    public long j(long j11, long j12) {
        long jM = z(this.f10591a) ? this.f10591a.M(j11, j12) : Long.MAX_VALUE;
        l2 l2Var = this.f10593c;
        return (l2Var == null || !z(l2Var)) ? jM : Math.min(jM, this.f10593c.M(j11, j12));
    }

    public long k(p1 p1Var) {
        l2 l2VarL = l(p1Var);
        Objects.requireNonNull(l2VarL);
        return l2VarL.n();
    }

    public int m() {
        return this.f10591a.c();
    }

    public void n(int i11, Object obj, p1 p1Var) {
        ((l2) s7.a.f(l(p1Var))).k(i11, obj);
    }

    public boolean o(p1 p1Var) {
        return p(p1Var, this.f10591a) && p(p1Var, this.f10593c);
    }

    public boolean r(p1 p1Var) {
        return ((l2) s7.a.f(l(p1Var))).h();
    }

    public boolean s() {
        return this.f10593c != null;
    }

    public boolean t() {
        boolean zA = z(this.f10591a) ? this.f10591a.a() : true;
        l2 l2Var = this.f10593c;
        return (l2Var == null || !z(l2Var)) ? zA : zA & this.f10593c.a();
    }

    public boolean u() {
        return w() || A();
    }

    public boolean v(p1 p1Var) {
        return (w() && l(p1Var) == this.f10591a) || (A() && l(p1Var) == this.f10593c);
    }

    public boolean x(p1 p1Var) {
        return l(p1Var) != null;
    }

    public boolean y() {
        int i11 = this.f10594d;
        return (i11 == 0 || i11 == 2 || i11 == 4) ? z(this.f10591a) : z((l2) s7.a.f(this.f10593c));
    }
}
