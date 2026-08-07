package p7;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.PlaybackException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class v implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j0 f101586a;

    private static final class a implements j0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final v f101587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final j0.d f101588b;

        public a(v vVar, j0.d dVar) {
            this.f101587a = vVar;
            this.f101588b = dVar;
        }

        @Override // p7.j0.d
        public void B(r7.e eVar) {
            this.f101588b.B(eVar);
        }

        @Override // p7.j0.d
        public void D(m mVar) {
            this.f101588b.D(mVar);
        }

        @Override // p7.j0.d
        public void E(d dVar) {
            this.f101588b.E(dVar);
        }

        @Override // p7.j0.d
        public void F(PlaybackException playbackException) {
            this.f101588b.F(playbackException);
        }

        @Override // p7.j0.d
        public void H(j0.e eVar, j0.e eVar2, int i11) {
            this.f101588b.H(eVar, eVar2, i11);
        }

        @Override // p7.j0.d
        public void K(w0 w0Var) {
            this.f101588b.K(w0Var);
        }

        @Override // p7.j0.d
        public void Q(e0 e0Var) {
            this.f101588b.Q(e0Var);
        }

        @Override // p7.j0.d
        public void R(j0.b bVar) {
            this.f101588b.R(bVar);
        }

        @Override // p7.j0.d
        public void S(a1 a1Var) {
            this.f101588b.S(a1Var);
        }

        @Override // p7.j0.d
        public void U(y yVar, int i11) {
            this.f101588b.U(yVar, i11);
        }

        @Override // p7.j0.d
        public void V(j0 j0Var, j0.c cVar) {
            this.f101588b.V(this.f101587a, cVar);
        }

        @Override // p7.j0.d
        public void Z(e0 e0Var) {
            this.f101588b.Z(e0Var);
        }

        @Override // p7.j0.d
        public void a0(r0 r0Var, int i11) {
            this.f101588b.a0(r0Var, i11);
        }

        @Override // p7.j0.d
        public void b(e1 e1Var) {
            this.f101588b.b(e1Var);
        }

        @Override // p7.j0.d
        public void d0(PlaybackException playbackException) {
            this.f101588b.d0(playbackException);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f101587a.equals(aVar.f101587a)) {
                return this.f101588b.equals(aVar.f101588b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f101587a.hashCode() * 31) + this.f101588b.hashCode();
        }

        @Override // p7.j0.d
        public void onAudioSessionIdChanged(int i11) {
            this.f101588b.onAudioSessionIdChanged(i11);
        }

        @Override // p7.j0.d
        public void onCues(List<r7.a> list) {
            this.f101588b.onCues(list);
        }

        @Override // p7.j0.d
        public void onDeviceVolumeChanged(int i11, boolean z11) {
            this.f101588b.onDeviceVolumeChanged(i11, z11);
        }

        @Override // p7.j0.d
        public void onIsLoadingChanged(boolean z11) {
            this.f101588b.onIsLoadingChanged(z11);
        }

        @Override // p7.j0.d
        public void onIsPlayingChanged(boolean z11) {
            this.f101588b.onIsPlayingChanged(z11);
        }

        @Override // p7.j0.d
        public void onLoadingChanged(boolean z11) {
            this.f101588b.onIsLoadingChanged(z11);
        }

        @Override // p7.j0.d
        public void onMaxSeekToPreviousPositionChanged(long j11) {
            this.f101588b.onMaxSeekToPreviousPositionChanged(j11);
        }

        @Override // p7.j0.d
        public void onPlayWhenReadyChanged(boolean z11, int i11) {
            this.f101588b.onPlayWhenReadyChanged(z11, i11);
        }

        @Override // p7.j0.d
        public void onPlaybackStateChanged(int i11) {
            this.f101588b.onPlaybackStateChanged(i11);
        }

        @Override // p7.j0.d
        public void onPlaybackSuppressionReasonChanged(int i11) {
            this.f101588b.onPlaybackSuppressionReasonChanged(i11);
        }

        @Override // p7.j0.d
        public void onPlayerStateChanged(boolean z11, int i11) {
            this.f101588b.onPlayerStateChanged(z11, i11);
        }

        @Override // p7.j0.d
        public void onPositionDiscontinuity(int i11) {
            this.f101588b.onPositionDiscontinuity(i11);
        }

        @Override // p7.j0.d
        public void onRenderedFirstFrame() {
            this.f101588b.onRenderedFirstFrame();
        }

        @Override // p7.j0.d
        public void onRepeatModeChanged(int i11) {
            this.f101588b.onRepeatModeChanged(i11);
        }

        @Override // p7.j0.d
        public void onSeekBackIncrementChanged(long j11) {
            this.f101588b.onSeekBackIncrementChanged(j11);
        }

        @Override // p7.j0.d
        public void onSeekForwardIncrementChanged(long j11) {
            this.f101588b.onSeekForwardIncrementChanged(j11);
        }

        @Override // p7.j0.d
        public void onShuffleModeEnabledChanged(boolean z11) {
            this.f101588b.onShuffleModeEnabledChanged(z11);
        }

        @Override // p7.j0.d
        public void onSkipSilenceEnabledChanged(boolean z11) {
            this.f101588b.onSkipSilenceEnabledChanged(z11);
        }

        @Override // p7.j0.d
        public void onSurfaceSizeChanged(int i11, int i12) {
            this.f101588b.onSurfaceSizeChanged(i11, i12);
        }

        @Override // p7.j0.d
        public void onVolumeChanged(float f11) {
            this.f101588b.onVolumeChanged(f11);
        }

        @Override // p7.j0.d
        public void t(f0 f0Var) {
            this.f101588b.t(f0Var);
        }

        @Override // p7.j0.d
        public void v(i0 i0Var) {
            this.f101588b.v(i0Var);
        }
    }

    public v(j0 j0Var) {
        this.f101586a = j0Var;
    }

    @Override // p7.j0
    public long A() {
        return this.f101586a.A();
    }

    @Override // p7.j0
    public void A0(int i11) {
        this.f101586a.A0(i11);
    }

    @Override // p7.j0
    public long B() {
        return this.f101586a.B();
    }

    @Override // p7.j0
    public void B0(int i11) {
        this.f101586a.B0(i11);
    }

    @Override // p7.j0
    public void C() {
        this.f101586a.C();
    }

    @Override // p7.j0
    public void C0(w0 w0Var) {
        this.f101586a.C0(w0Var);
    }

    @Override // p7.j0
    public long D() {
        return this.f101586a.D();
    }

    @Override // p7.j0
    public void D0(j0.d dVar) {
        this.f101586a.D0(new a(this, dVar));
    }

    @Override // p7.j0
    public void E() {
        this.f101586a.E();
    }

    @Override // p7.j0
    public boolean E0() {
        return this.f101586a.E0();
    }

    @Override // p7.j0
    public void F() {
        this.f101586a.F();
    }

    @Override // p7.j0
    public Looper F0() {
        return this.f101586a.F0();
    }

    @Override // p7.j0
    public void G(boolean z11) {
        this.f101586a.G(z11);
    }

    @Override // p7.j0
    public float G0() {
        return this.f101586a.G0();
    }

    @Override // p7.j0
    public r7.e H() {
        return this.f101586a.H();
    }

    @Override // p7.j0
    public d H0() {
        return this.f101586a.H0();
    }

    @Override // p7.j0
    public int I() {
        return this.f101586a.I();
    }

    @Override // p7.j0
    public void I0(int i11, int i12) {
        this.f101586a.I0(i11, i12);
    }

    @Override // p7.j0
    public r0 J() {
        return this.f101586a.J();
    }

    @Override // p7.j0
    public void J0(int i11, y yVar) {
        this.f101586a.J0(i11, yVar);
    }

    @Override // p7.j0
    public void K() {
        this.f101586a.K();
    }

    @Override // p7.j0
    public void K0(int i11, List<y> list) {
        this.f101586a.K0(i11, list);
    }

    @Override // p7.j0
    public void L(TextureView textureView) {
        this.f101586a.L(textureView);
    }

    @Override // p7.j0
    public long L0() {
        return this.f101586a.L0();
    }

    @Override // p7.j0
    public void M(int i11, long j11) {
        this.f101586a.M(i11, j11);
    }

    @Override // p7.j0
    public void M0(int i11, int i12, int i13) {
        this.f101586a.M0(i11, i12, i13);
    }

    @Override // p7.j0
    public j0.b N() {
        return this.f101586a.N();
    }

    @Override // p7.j0
    public void N0(List<y> list) {
        this.f101586a.N0(list);
    }

    @Override // p7.j0
    public e1 O() {
        return this.f101586a.O();
    }

    @Override // p7.j0
    @Deprecated
    public void O0(int i11) {
        this.f101586a.O0(i11);
    }

    @Override // p7.j0
    public boolean P() {
        return this.f101586a.P();
    }

    @Override // p7.j0
    public long Q() {
        return this.f101586a.Q();
    }

    @Override // p7.j0
    public int R() {
        return this.f101586a.R();
    }

    @Override // p7.j0
    public boolean R0() {
        return this.f101586a.R0();
    }

    @Override // p7.j0
    public void S(SurfaceView surfaceView) {
        this.f101586a.S(surfaceView);
    }

    @Override // p7.j0
    public boolean T() {
        return this.f101586a.T();
    }

    @Override // p7.j0
    public void U() {
        this.f101586a.U();
    }

    @Override // p7.j0
    public y U0() {
        return this.f101586a.U0();
    }

    @Override // p7.j0
    public e0 V() {
        return this.f101586a.V();
    }

    @Override // p7.j0
    public long W() {
        return this.f101586a.W();
    }

    @Override // p7.j0
    public void X(Surface surface) {
        this.f101586a.X(surface);
    }

    @Override // p7.j0
    public void Y(List<y> list, boolean z11) {
        this.f101586a.Y(list, z11);
    }

    @Override // p7.j0
    public void Z(int i11) {
        this.f101586a.Z(i11);
    }

    public j0 Z0() {
        return this.f101586a;
    }

    @Override // p7.j0
    public PlaybackException a() {
        return this.f101586a.a();
    }

    @Override // p7.j0
    public void a0(int i11, int i12) {
        this.f101586a.a0(i11, i12);
    }

    @Override // p7.j0
    public void b() {
        this.f101586a.b();
    }

    @Override // p7.j0
    public void b0() {
        this.f101586a.b0();
    }

    @Override // p7.j0
    public boolean c() {
        return this.f101586a.c();
    }

    @Override // p7.j0
    public boolean c0(int i11) {
        return this.f101586a.c0(i11);
    }

    @Override // p7.j0
    public void d() {
        this.f101586a.d();
    }

    @Override // p7.j0
    @Deprecated
    public void d0(boolean z11) {
        this.f101586a.d0(z11);
    }

    @Override // p7.j0
    public i0 e() {
        return this.f101586a.e();
    }

    @Override // p7.j0
    public void e0(j0.d dVar) {
        this.f101586a.e0(new a(this, dVar));
    }

    @Override // p7.j0
    public void f() {
        this.f101586a.f();
    }

    @Override // p7.j0
    @Deprecated
    public void f0() {
        this.f101586a.f0();
    }

    @Override // p7.j0
    public int g() {
        return this.f101586a.g();
    }

    @Override // p7.j0
    public int g0() {
        return this.f101586a.g0();
    }

    @Override // p7.j0
    public long getDuration() {
        return this.f101586a.getDuration();
    }

    @Override // p7.j0
    public int h() {
        return this.f101586a.h();
    }

    @Override // p7.j0
    public long h0() {
        return this.f101586a.h0();
    }

    @Override // p7.j0
    public void i(int i11) {
        this.f101586a.i(i11);
    }

    @Override // p7.j0
    public m i0() {
        return this.f101586a.i0();
    }

    @Override // p7.j0
    public boolean isPlaying() {
        return this.f101586a.isPlaying();
    }

    @Override // p7.j0
    public void j(i0 i0Var) {
        this.f101586a.j(i0Var);
    }

    @Override // p7.j0
    public void j0(e0 e0Var) {
        this.f101586a.j0(e0Var);
    }

    @Override // p7.j0
    public void k(float f11) {
        this.f101586a.k(f11);
    }

    @Override // p7.j0
    public void k0(List<y> list, int i11, long j11) {
        this.f101586a.k0(list, i11, j11);
    }

    @Override // p7.j0
    public void l(float f11) {
        this.f101586a.l(f11);
    }

    @Override // p7.j0
    public void l0(int i11) {
        this.f101586a.l0(i11);
    }

    @Override // p7.j0
    public boolean m() {
        return this.f101586a.m();
    }

    @Override // p7.j0
    public void m0(y yVar, boolean z11) {
        this.f101586a.m0(yVar, z11);
    }

    @Override // p7.j0
    public long n() {
        return this.f101586a.n();
    }

    @Override // p7.j0
    public boolean n0() {
        return this.f101586a.n0();
    }

    @Override // p7.j0
    public void o(SurfaceView surfaceView) {
        this.f101586a.o(surfaceView);
    }

    @Override // p7.j0
    public void o0(d dVar, boolean z11) {
        this.f101586a.o0(dVar, z11);
    }

    @Override // p7.j0
    public a1 p() {
        return this.f101586a.p();
    }

    @Override // p7.j0
    public e0 p0() {
        return this.f101586a.p0();
    }

    @Override // p7.j0
    public boolean q() {
        return this.f101586a.q();
    }

    @Override // p7.j0
    public void q0(y yVar, long j11) {
        this.f101586a.q0(yVar, j11);
    }

    @Override // p7.j0
    public int r() {
        return this.f101586a.r();
    }

    @Override // p7.j0
    public void r0(int i11, int i12) {
        this.f101586a.r0(i11, i12);
    }

    @Override // p7.j0
    public w0 s() {
        return this.f101586a.s();
    }

    @Override // p7.j0
    public boolean s0() {
        return this.f101586a.s0();
    }

    @Override // p7.j0
    public void seekTo(long j11) {
        this.f101586a.seekTo(j11);
    }

    @Override // p7.j0
    public void stop() {
        this.f101586a.stop();
    }

    @Override // p7.j0
    public boolean t() {
        return this.f101586a.t();
    }

    @Override // p7.j0
    public boolean t0() {
        return this.f101586a.t0();
    }

    @Override // p7.j0
    public void u(boolean z11) {
        this.f101586a.u(z11);
    }

    @Override // p7.j0
    public void u0(boolean z11, int i11) {
        this.f101586a.u0(z11, i11);
    }

    @Override // p7.j0
    public long v() {
        return this.f101586a.v();
    }

    @Override // p7.j0
    public void v0() {
        this.f101586a.v0();
    }

    @Override // p7.j0
    public long w() {
        return this.f101586a.w();
    }

    @Override // p7.j0
    public int w0() {
        return this.f101586a.w0();
    }

    @Override // p7.j0
    public int x() {
        return this.f101586a.x();
    }

    @Override // p7.j0
    public void x0() {
        this.f101586a.x0();
    }

    @Override // p7.j0
    public void y(TextureView textureView) {
        this.f101586a.y(textureView);
    }

    @Override // p7.j0
    @Deprecated
    public void y0() {
        this.f101586a.y0();
    }

    @Override // p7.j0
    public int z() {
        return this.f101586a.z();
    }

    @Override // p7.j0
    public void z0(int i11, int i12, List<y> list) {
        this.f101586a.z0(i11, i12, list);
    }
}
