package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class e implements v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final f2.d f39851a = new f2.d();

    protected e() {
    }

    private int X() {
        int iH = h();
        if (iH == 1) {
            return 0;
        }
        return iH;
    }

    private void Y(int i11) {
        Z(R(), -9223372036854775807L, i11, true);
    }

    private void a0(long j11, int i11) {
        Z(R(), j11, i11, false);
    }

    private void b0(int i11, int i12) {
        Z(i11, -9223372036854775807L, i12, false);
    }

    private void d0(int i11) {
        int iK = k();
        if (iK == -1) {
            return;
        }
        if (iK == R()) {
            Y(i11);
        } else {
            b0(iK, i11);
        }
    }

    private void e0(long j11, int i11) {
        long jD = D() + j11;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            jD = Math.min(jD, duration);
        }
        a0(Math.max(jD, 0L), i11);
    }

    private void f0(int i11) {
        int iL = l();
        if (iL == -1) {
            return;
        }
        if (iL == R()) {
            Y(i11);
        } else {
            b0(iL, i11);
        }
    }

    @Override // com.google.android.exoplayer2.v1
    public final void C() {
        e0(A(), 12);
    }

    @Override // com.google.android.exoplayer2.v1
    public final void E() {
        b0(R(), 4);
    }

    @Override // com.google.android.exoplayer2.v1
    public final boolean E0() {
        f2 f2VarJ = J();
        return !f2VarJ.u() && f2VarJ.r(R(), this.f39851a).f39950i;
    }

    @Override // com.google.android.exoplayer2.v1
    public final void F() {
        if (J().u() || m()) {
            return;
        }
        boolean zP = P();
        if (t0() && !n0()) {
            if (zP) {
                f0(7);
            }
        } else if (!zP || D() > v()) {
            a0(0L, 7);
        } else {
            f0(7);
        }
    }

    @Override // com.google.android.exoplayer2.v1
    public final void K() {
        if (J().u() || m()) {
            return;
        }
        if (q()) {
            d0(9);
        } else if (t0() && E0()) {
            b0(R(), 9);
        }
    }

    @Override // com.google.android.exoplayer2.v1
    public final void M(int i11, long j11) {
        Z(i11, j11, 10, false);
    }

    @Override // com.google.android.exoplayer2.v1
    public final boolean P() {
        return l() != -1;
    }

    @Override // com.google.android.exoplayer2.v1
    public final void U() {
        e0(-W(), 11);
    }

    public abstract void Z(int i11, long j11, int i12, boolean z11);

    @Override // com.google.android.exoplayer2.v1
    public final boolean c0(int i11) {
        return N().c(i11);
    }

    @Override // com.google.android.exoplayer2.v1
    public final void d() {
        G(false);
    }

    @Override // com.google.android.exoplayer2.v1
    public final void f() {
        G(true);
    }

    @Override // com.google.android.exoplayer2.v1
    public final boolean isPlaying() {
        return g() == 3 && t() && I() == 0;
    }

    public final int k() {
        f2 f2VarJ = J();
        if (f2VarJ.u()) {
            return -1;
        }
        return f2VarJ.i(R(), X(), T());
    }

    public final int l() {
        f2 f2VarJ = J();
        if (f2VarJ.u()) {
            return -1;
        }
        return f2VarJ.p(R(), X(), T());
    }

    @Override // com.google.android.exoplayer2.v1
    public final boolean n0() {
        f2 f2VarJ = J();
        return !f2VarJ.u() && f2VarJ.r(R(), this.f39851a).f39949h;
    }

    @Override // com.google.android.exoplayer2.v1
    public final boolean q() {
        return k() != -1;
    }

    @Override // com.google.android.exoplayer2.v1
    public final void seekTo(long j11) {
        a0(j11, 5);
    }

    @Override // com.google.android.exoplayer2.v1
    public final boolean t0() {
        f2 f2VarJ = J();
        return !f2VarJ.u() && f2VarJ.r(R(), this.f39851a).h();
    }

    @Override // com.google.android.exoplayer2.v1
    public final long w() {
        f2 f2VarJ = J();
        if (f2VarJ.u()) {
            return -9223372036854775807L;
        }
        return f2VarJ.r(R(), this.f39851a).f();
    }
}
