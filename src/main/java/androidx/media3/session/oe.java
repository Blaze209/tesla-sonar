package androidx.media3.session;

import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.PlaybackException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class oe extends p7.v {

    private static final class a extends p7.r0 {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final Object f12101k = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final p7.y f12102e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f12103f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f12104g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f12105h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final p7.y.g f12106i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final long f12107j;

        public a(oe oeVar) {
            this.f12102e = oeVar.U0();
            this.f12103f = oeVar.n0();
            this.f12104g = oeVar.E0();
            this.f12105h = !oeVar.J().u() && oeVar.J().r(oeVar.R(), new p7.r0.d()).f101491k;
            this.f12106i = oeVar.t0() ? p7.y.g.f101759f : null;
            this.f12107j = s7.q0.b1(oeVar.w());
        }

        @Override // p7.r0
        public int f(Object obj) {
            return f12101k.equals(obj) ? 0 : -1;
        }

        @Override // p7.r0
        public p7.r0.b k(int i11, p7.r0.b bVar, boolean z11) {
            Object obj = f12101k;
            bVar.u(obj, obj, 0, this.f12107j, 0L);
            bVar.f101465f = this.f12105h;
            return bVar;
        }

        @Override // p7.r0
        public int m() {
            return 1;
        }

        @Override // p7.r0
        public Object q(int i11) {
            return f12101k;
        }

        @Override // p7.r0
        public p7.r0.d s(int i11, p7.r0.d dVar, long j11) {
            dVar.h(f12101k, this.f12102e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f12103f, this.f12104g, this.f12106i, 0L, this.f12107j, 0, 0, 0L);
            dVar.f101491k = this.f12105h;
            return dVar;
        }

        @Override // p7.r0
        public int t() {
            return 1;
        }
    }

    public oe(p7.j0 j0Var) {
        super(j0Var);
    }

    private void s1() {
        s7.a.h(Looper.myLooper() == F0());
    }

    @Override // p7.v, p7.j0
    public long A() {
        s1();
        return super.A();
    }

    @Override // p7.v, p7.j0
    public void A0(int i11) {
        s1();
        super.A0(i11);
    }

    @Override // p7.v, p7.j0
    public long B() {
        s1();
        return super.B();
    }

    @Override // p7.v, p7.j0
    public void B0(int i11) {
        s1();
        super.B0(i11);
    }

    @Override // p7.v, p7.j0
    public void C() {
        s1();
        super.C();
    }

    @Override // p7.v, p7.j0
    public void C0(p7.w0 w0Var) {
        s1();
        super.C0(w0Var);
    }

    @Override // p7.v, p7.j0
    public long D() {
        s1();
        return super.D();
    }

    @Override // p7.v, p7.j0
    public void D0(p7.j0.d dVar) {
        s1();
        super.D0(dVar);
    }

    @Override // p7.v, p7.j0
    public void E() {
        s1();
        super.E();
    }

    @Override // p7.v, p7.j0
    public boolean E0() {
        s1();
        return super.E0();
    }

    @Override // p7.v, p7.j0
    public void F() {
        s1();
        super.F();
    }

    @Override // p7.v, p7.j0
    public void G(boolean z11) {
        s1();
        super.G(z11);
    }

    @Override // p7.v, p7.j0
    public float G0() {
        s1();
        return super.G0();
    }

    @Override // p7.v, p7.j0
    public r7.e H() {
        s1();
        return super.H();
    }

    @Override // p7.v, p7.j0
    public p7.d H0() {
        s1();
        return super.H0();
    }

    @Override // p7.v, p7.j0
    public int I() {
        s1();
        return super.I();
    }

    @Override // p7.v, p7.j0
    public void I0(int i11, int i12) {
        s1();
        super.I0(i11, i12);
    }

    @Override // p7.v, p7.j0
    public p7.r0 J() {
        s1();
        return super.J();
    }

    @Override // p7.v, p7.j0
    public void J0(int i11, p7.y yVar) {
        s1();
        super.J0(i11, yVar);
    }

    @Override // p7.v, p7.j0
    public void K() {
        s1();
        super.K();
    }

    @Override // p7.v, p7.j0
    public void K0(int i11, List<p7.y> list) {
        s1();
        super.K0(i11, list);
    }

    @Override // p7.v, p7.j0
    public void L(TextureView textureView) {
        s1();
        super.L(textureView);
    }

    @Override // p7.v, p7.j0
    public long L0() {
        s1();
        return super.L0();
    }

    @Override // p7.v, p7.j0
    public void M(int i11, long j11) {
        s1();
        super.M(i11, j11);
    }

    @Override // p7.v, p7.j0
    public void M0(int i11, int i12, int i13) {
        s1();
        super.M0(i11, i12, i13);
    }

    @Override // p7.v, p7.j0
    public p7.j0.b N() {
        s1();
        return super.N();
    }

    @Override // p7.v, p7.j0
    public void N0(List<p7.y> list) {
        s1();
        super.N0(list);
    }

    @Override // p7.v, p7.j0
    public p7.e1 O() {
        s1();
        return super.O();
    }

    @Override // p7.v, p7.j0
    @Deprecated
    public void O0(int i11) {
        s1();
        super.O0(i11);
    }

    @Override // p7.v, p7.j0
    public boolean P() {
        s1();
        return super.P();
    }

    @Override // p7.v, p7.j0
    public long Q() {
        s1();
        return super.Q();
    }

    @Override // p7.v, p7.j0
    public int R() {
        s1();
        return super.R();
    }

    @Override // p7.v, p7.j0
    public void S(SurfaceView surfaceView) {
        s1();
        super.S(surfaceView);
    }

    @Override // p7.v, p7.j0
    public boolean T() {
        s1();
        return super.T();
    }

    @Override // p7.v, p7.j0
    public void U() {
        s1();
        super.U();
    }

    @Override // p7.v, p7.j0
    public p7.y U0() {
        s1();
        return super.U0();
    }

    @Override // p7.v, p7.j0
    public p7.e0 V() {
        s1();
        return super.V();
    }

    @Override // p7.v, p7.j0
    public long W() {
        s1();
        return super.W();
    }

    @Override // p7.v, p7.j0
    public void X(Surface surface) {
        s1();
        super.X(surface);
    }

    @Override // p7.v, p7.j0
    public void Y(List<p7.y> list, boolean z11) {
        s1();
        super.Y(list, z11);
    }

    @Override // p7.v, p7.j0
    public void Z(int i11) {
        s1();
        super.Z(i11);
    }

    @Override // p7.v, p7.j0
    public PlaybackException a() {
        s1();
        return super.a();
    }

    @Override // p7.v, p7.j0
    public void a0(int i11, int i12) {
        s1();
        super.a0(i11, i12);
    }

    public ne a1() {
        return new ne(a(), 0, c1(), b1(), b1(), 0, e(), h(), T(), O(), g1(), 0, l1(), m1(), d1(), e1(), i0(), i1(), o1(), t(), 1, I(), g(), isPlaying(), c(), k1(), W(), A(), v(), h1(), s());
    }

    @Override // p7.v, p7.j0
    public void b() {
        s1();
        super.b();
    }

    @Override // p7.v, p7.j0
    public void b0() {
        s1();
        super.b0();
    }

    public p7.j0.e b1() {
        boolean zC0 = c0(16);
        boolean zC1 = c0(17);
        return new p7.j0.e(null, zC1 ? R() : 0, zC0 ? U0() : null, null, zC1 ? x() : 0, zC0 ? D() : 0L, zC0 ? Q() : 0L, zC0 ? r() : -1, zC0 ? z() : -1);
    }

    @Override // p7.v, p7.j0
    public boolean c() {
        s1();
        return super.c();
    }

    @Override // p7.v, p7.j0
    public boolean c0(int i11) {
        s1();
        return super.c0(i11);
    }

    public ue c1() {
        boolean zC0 = c0(16);
        return new ue(b1(), zC0 && m(), SystemClock.elapsedRealtime(), zC0 ? getDuration() : -9223372036854775807L, zC0 ? L0() : 0L, zC0 ? w0() : 0, zC0 ? n() : 0L, zC0 ? h0() : -9223372036854775807L, zC0 ? w() : -9223372036854775807L, zC0 ? B() : 0L);
    }

    @Override // p7.v, p7.j0
    public void d() {
        s1();
        super.d();
    }

    @Override // p7.v, p7.j0
    @Deprecated
    public void d0(boolean z11) {
        s1();
        super.d0(z11);
    }

    public p7.d d1() {
        return c0(21) ? H0() : p7.d.f101231h;
    }

    @Override // p7.v, p7.j0
    public p7.i0 e() {
        s1();
        return super.e();
    }

    @Override // p7.v, p7.j0
    public void e0(p7.j0.d dVar) {
        s1();
        super.e0(dVar);
    }

    public r7.e e1() {
        return c0(28) ? H() : r7.e.f107103d;
    }

    @Override // p7.v, p7.j0
    public void f() {
        s1();
        super.f();
    }

    @Override // p7.v, p7.j0
    @Deprecated
    public void f0() {
        s1();
        super.f0();
    }

    public p7.y f1() {
        if (c0(16)) {
            return U0();
        }
        return null;
    }

    @Override // p7.v, p7.j0
    public int g() {
        s1();
        return super.g();
    }

    @Override // p7.v, p7.j0
    public int g0() {
        s1();
        return super.g0();
    }

    public p7.r0 g1() {
        if (c0(17)) {
            return J();
        }
        if (c0(16)) {
            return J().u() ? p7.r0.f101451a : new a(this);
        }
        return p7.r0.f101451a;
    }

    @Override // p7.v, p7.j0
    public long getDuration() {
        s1();
        return super.getDuration();
    }

    @Override // p7.v, p7.j0
    public int h() {
        s1();
        return super.h();
    }

    @Override // p7.v, p7.j0
    public long h0() {
        s1();
        return super.h0();
    }

    public p7.a1 h1() {
        return c0(30) ? p() : p7.a1.f101183b;
    }

    @Override // p7.v, p7.j0
    public void i(int i11) {
        s1();
        super.i(i11);
    }

    @Override // p7.v, p7.j0
    public p7.m i0() {
        s1();
        return super.i0();
    }

    public int i1() {
        if (c0(23)) {
            return g0();
        }
        return 0;
    }

    @Override // p7.v, p7.j0
    public boolean isPlaying() {
        s1();
        return super.isPlaying();
    }

    @Override // p7.v, p7.j0
    public void j(p7.i0 i0Var) {
        s1();
        super.j(i0Var);
    }

    @Override // p7.v, p7.j0
    public void j0(p7.e0 e0Var) {
        s1();
        super.j0(e0Var);
    }

    public long j1() {
        if (c0(16)) {
            return getDuration();
        }
        return -9223372036854775807L;
    }

    @Override // p7.v, p7.j0
    public void k(float f11) {
        s1();
        super.k(f11);
    }

    @Override // p7.v, p7.j0
    public void k0(List<p7.y> list, int i11, long j11) {
        s1();
        super.k0(list, i11, j11);
    }

    public p7.e0 k1() {
        return c0(18) ? V() : p7.e0.K;
    }

    @Override // p7.v, p7.j0
    public void l(float f11) {
        s1();
        super.l(f11);
    }

    @Override // p7.v, p7.j0
    public void l0(int i11) {
        s1();
        super.l0(i11);
    }

    public p7.e0 l1() {
        return c0(18) ? p0() : p7.e0.K;
    }

    @Override // p7.v, p7.j0
    public boolean m() {
        s1();
        return super.m();
    }

    @Override // p7.v, p7.j0
    public void m0(p7.y yVar, boolean z11) {
        s1();
        super.m0(yVar, z11);
    }

    public float m1() {
        if (c0(22)) {
            return G0();
        }
        return 1.0f;
    }

    @Override // p7.v, p7.j0
    public long n() {
        s1();
        return super.n();
    }

    @Override // p7.v, p7.j0
    public boolean n0() {
        s1();
        return super.n0();
    }

    public boolean n1() {
        return c0(16) && t0();
    }

    @Override // p7.v, p7.j0
    public void o(SurfaceView surfaceView) {
        s1();
        super.o(surfaceView);
    }

    public boolean o1() {
        return c0(23) && s0();
    }

    @Override // p7.v, p7.j0
    public p7.a1 p() {
        s1();
        return super.p();
    }

    @Override // p7.v, p7.j0
    public p7.e0 p0() {
        s1();
        return super.p0();
    }

    public void p1() {
        if (c0(1)) {
            f();
        }
    }

    @Override // p7.v, p7.j0
    public boolean q() {
        s1();
        return super.q();
    }

    @Override // p7.v, p7.j0
    public void q0(p7.y yVar, long j11) {
        s1();
        super.q0(yVar, j11);
    }

    public void q1() {
        if (c0(2)) {
            b();
        }
    }

    @Override // p7.v, p7.j0
    public int r() {
        s1();
        return super.r();
    }

    @Override // p7.v, p7.j0
    public void r0(int i11, int i12) {
        s1();
        super.r0(i11, i12);
    }

    public void r1() {
        if (c0(4)) {
            E();
        }
    }

    @Override // p7.v, p7.j0
    public p7.w0 s() {
        s1();
        return super.s();
    }

    @Override // p7.v, p7.j0
    public boolean s0() {
        s1();
        return super.s0();
    }

    @Override // p7.v, p7.j0
    public void seekTo(long j11) {
        s1();
        super.seekTo(j11);
    }

    @Override // p7.v, p7.j0
    public void stop() {
        s1();
        super.stop();
    }

    @Override // p7.v, p7.j0
    public boolean t() {
        s1();
        return super.t();
    }

    @Override // p7.v, p7.j0
    public boolean t0() {
        s1();
        return super.t0();
    }

    @Override // p7.v, p7.j0
    public void u(boolean z11) {
        s1();
        super.u(z11);
    }

    @Override // p7.v, p7.j0
    public void u0(boolean z11, int i11) {
        s1();
        super.u0(z11, i11);
    }

    @Override // p7.v, p7.j0
    public long v() {
        s1();
        return super.v();
    }

    @Override // p7.v, p7.j0
    public void v0() {
        s1();
        super.v0();
    }

    @Override // p7.v, p7.j0
    public long w() {
        s1();
        return super.w();
    }

    @Override // p7.v, p7.j0
    public int w0() {
        s1();
        return super.w0();
    }

    @Override // p7.v, p7.j0
    public int x() {
        s1();
        return super.x();
    }

    @Override // p7.v, p7.j0
    public void x0() {
        s1();
        super.x0();
    }

    @Override // p7.v, p7.j0
    public void y(TextureView textureView) {
        s1();
        super.y(textureView);
    }

    @Override // p7.v, p7.j0
    @Deprecated
    public void y0() {
        s1();
        super.y0();
    }

    @Override // p7.v, p7.j0
    public int z() {
        s1();
        return super.z();
    }

    @Override // p7.v, p7.j0
    public void z0(int i11, int i12, List<p7.y> list) {
        s1();
        super.z0(i11, i12, list);
    }
}
