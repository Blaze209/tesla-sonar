package p7;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class f implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final r0.d f101336a = new r0.d();

    protected f() {
    }

    private int b1() {
        int iH = h();
        if (iH == 1) {
            return 0;
        }
        return iH;
    }

    private void c1(int i11) {
        e1(-1, -9223372036854775807L, i11, false);
    }

    private void d1(int i11) {
        e1(R(), -9223372036854775807L, i11, true);
    }

    private void f1(long j11, int i11) {
        e1(R(), j11, i11, false);
    }

    private void g1(int i11, int i12) {
        e1(i11, -9223372036854775807L, i12, false);
    }

    private void h1(int i11) {
        int iZ0 = Z0();
        if (iZ0 == -1) {
            c1(i11);
        } else if (iZ0 == R()) {
            d1(i11);
        } else {
            g1(iZ0, i11);
        }
    }

    private void i1(long j11, int i11) {
        long jD = D() + j11;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            jD = Math.min(jD, duration);
        }
        f1(Math.max(jD, 0L), i11);
    }

    private void j1(int i11) {
        int iA1 = a1();
        if (iA1 == -1) {
            c1(i11);
        } else if (iA1 == R()) {
            d1(i11);
        } else {
            g1(iA1, i11);
        }
    }

    @Override // p7.j0
    public final void A0(int i11) {
        a0(i11, i11 + 1);
    }

    @Override // p7.j0
    public final void C() {
        i1(A(), 12);
    }

    @Override // p7.j0
    public final void E() {
        g1(R(), 4);
    }

    @Override // p7.j0
    public final boolean E0() {
        r0 r0VarJ = J();
        return !r0VarJ.u() && r0VarJ.r(R(), this.f101336a).f101489i;
    }

    @Override // p7.j0
    public final void F() {
        if (J().u() || m()) {
            c1(7);
            return;
        }
        boolean zP = P();
        if (t0() && !n0()) {
            if (zP) {
                j1(7);
                return;
            } else {
                c1(7);
                return;
            }
        }
        if (!zP || D() > v()) {
            f1(0L, 7);
        } else {
            j1(7);
        }
    }

    @Override // p7.j0
    public final void J0(int i11, y yVar) {
        z0(i11, i11 + 1, com.google.common.collect.x.s(yVar));
    }

    @Override // p7.j0
    public final void K() {
        if (J().u() || m()) {
            c1(9);
            return;
        }
        if (q()) {
            h1(9);
        } else if (t0() && E0()) {
            g1(R(), 9);
        } else {
            c1(9);
        }
    }

    @Override // p7.j0
    public final void M(int i11, long j11) {
        e1(i11, j11, 10, false);
    }

    @Override // p7.j0
    public final void N0(List<y> list) {
        K0(Integer.MAX_VALUE, list);
    }

    @Override // p7.j0
    public final boolean P() {
        return a1() != -1;
    }

    @Override // p7.j0
    public final boolean R0() {
        return true;
    }

    @Override // p7.j0
    public final void U() {
        i1(-W(), 11);
    }

    @Override // p7.j0
    public final y U0() {
        r0 r0VarJ = J();
        if (r0VarJ.u()) {
            return null;
        }
        return r0VarJ.r(R(), this.f101336a).f101483c;
    }

    public final int Z0() {
        r0 r0VarJ = J();
        if (r0VarJ.u()) {
            return -1;
        }
        return r0VarJ.i(R(), b1(), T());
    }

    public final int a1() {
        r0 r0VarJ = J();
        if (r0VarJ.u()) {
            return -1;
        }
        return r0VarJ.p(R(), b1(), T());
    }

    @Override // p7.j0
    public final void b0() {
        h1(8);
    }

    @Override // p7.j0
    public final boolean c0(int i11) {
        return N().c(i11);
    }

    @Override // p7.j0
    public final void d() {
        G(false);
    }

    protected abstract void e1(int i11, long j11, int i12, boolean z11);

    @Override // p7.j0
    public final void f() {
        G(true);
    }

    @Override // p7.j0
    public final long h0() {
        r0 r0VarJ = J();
        if (r0VarJ.u() || r0VarJ.r(R(), this.f101336a).f101486f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (this.f101336a.b() - this.f101336a.f101486f) - Q();
    }

    @Override // p7.j0
    public final boolean isPlaying() {
        return g() == 3 && t() && I() == 0;
    }

    @Override // p7.j0
    public final void l(float f11) {
        j(e().d(f11));
    }

    @Override // p7.j0
    public final void l0(int i11) {
        g1(i11, 10);
    }

    @Override // p7.j0
    public final void m0(y yVar, boolean z11) {
        Y(com.google.common.collect.x.s(yVar), z11);
    }

    @Override // p7.j0
    public final boolean n0() {
        r0 r0VarJ = J();
        return !r0VarJ.u() && r0VarJ.r(R(), this.f101336a).f101488h;
    }

    @Override // p7.j0
    public final boolean q() {
        return Z0() != -1;
    }

    @Override // p7.j0
    public final void q0(y yVar, long j11) {
        k0(com.google.common.collect.x.s(yVar), 0, j11);
    }

    @Override // p7.j0
    public final void r0(int i11, int i12) {
        if (i11 != i12) {
            M0(i11, i11 + 1, i12);
        }
    }

    @Override // p7.j0
    public final void seekTo(long j11) {
        f1(j11, 5);
    }

    @Override // p7.j0
    public final boolean t0() {
        r0 r0VarJ = J();
        return !r0VarJ.u() && r0VarJ.r(R(), this.f101336a).g();
    }

    @Override // p7.j0
    public final void v0() {
        a0(0, Integer.MAX_VALUE);
    }

    @Override // p7.j0
    public final long w() {
        r0 r0VarJ = J();
        if (r0VarJ.u()) {
            return -9223372036854775807L;
        }
        return r0VarJ.r(R(), this.f101336a).e();
    }

    @Override // p7.j0
    public final int w0() {
        long jL0 = L0();
        long duration = getDuration();
        if (jL0 == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return s7.q0.r(s7.q0.l1(jL0, duration), 0, 100);
    }

    @Override // p7.j0
    public final void x0() {
        j1(6);
    }
}
