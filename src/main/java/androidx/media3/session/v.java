package androidx.media3.session;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.PlaybackException;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: loaded from: classes3.dex */
public class v implements p7.j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p7.r0.d f12466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f12467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotOnlyInitialized
    private final d f12468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final c f12469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Handler f12470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f12471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f12472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f12473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final b f12474i;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f12475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ve f12476b;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private s7.h f12480f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f12481g;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bundle f12477c = Bundle.EMPTY;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f12478d = new C0211a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Looper f12479e = s7.q0.d0();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f12482h = 100;

        /* JADX INFO: renamed from: androidx.media3.session.v$a$a, reason: collision with other inner class name */
        class C0211a implements c {
            C0211a() {
            }
        }

        public a(Context context, ve veVar) {
            this.f12475a = (Context) s7.a.f(context);
            this.f12476b = (ve) s7.a.f(veVar);
        }

        public com.google.common.util.concurrent.s<v> b() {
            final y yVar = new y(this.f12479e);
            if (this.f12476b.j() && this.f12480f == null) {
                this.f12480f = new ga.a(new androidx.media3.datasource.b(this.f12475a));
            }
            final v vVar = new v(this.f12475a, this.f12476b, this.f12477c, this.f12478d, this.f12479e, yVar, this.f12480f, this.f12481g, this.f12482h);
            s7.q0.m1(new Handler(this.f12479e), new Runnable() { // from class: androidx.media3.session.u
                @Override // java.lang.Runnable
                public final void run() {
                    yVar.U(vVar);
                }
            });
            return yVar;
        }

        public a c(Looper looper) {
            this.f12479e = (Looper) s7.a.f(looper);
            return this;
        }

        public a d(Bundle bundle) {
            this.f12477c = new Bundle((Bundle) s7.a.f(bundle));
            return this;
        }

        public a e(c cVar) {
            this.f12478d = (c) s7.a.f(cVar);
            return this;
        }
    }

    interface b {
        void a();

        void c();
    }

    interface d {
        long A();

        void A0(int i11);

        long B();

        void B0(int i11);

        void C();

        void C0(p7.w0 w0Var);

        long D();

        void D0(p7.j0.d dVar);

        void E();

        void F();

        void G(boolean z11);

        float G0();

        r7.e H();

        p7.d H0();

        int I();

        void I0(int i11, int i12);

        p7.r0 J();

        void J0(int i11, p7.y yVar);

        void K();

        void K0(int i11, List<p7.y> list);

        void L(TextureView textureView);

        long L0();

        void M(int i11, long j11);

        void M0(int i11, int i12, int i13);

        p7.j0.b N();

        void N0(List<p7.y> list);

        p7.e1 O();

        void O0(int i11);

        boolean P();

        com.google.common.util.concurrent.s<ga.v> P0(se seVar, Bundle bundle);

        long Q();

        te Q0();

        int R();

        com.google.common.collect.x<androidx.media3.session.a> R0();

        void S(SurfaceView surfaceView);

        Bundle S0();

        boolean T();

        void U();

        p7.e0 V();

        long W();

        void X(Surface surface);

        void Y(List<p7.y> list, boolean z11);

        void Z(int i11);

        PlaybackException a();

        void a0(int i11, int i12);

        void b();

        void b0();

        boolean c();

        void connect();

        void d();

        void d0(boolean z11);

        p7.i0 e();

        void e0(p7.j0.d dVar);

        void f();

        void f0();

        int g();

        int g0();

        long getDuration();

        int h();

        long h0();

        void i(int i11);

        p7.m i0();

        boolean isConnected();

        boolean isPlaying();

        void j(p7.i0 i0Var);

        void j0(p7.e0 e0Var);

        void k(float f11);

        void k0(List<p7.y> list, int i11, long j11);

        void l(float f11);

        void l0(int i11);

        boolean m();

        void m0(p7.y yVar, boolean z11);

        long n();

        void o(SurfaceView surfaceView);

        void o0(p7.d dVar, boolean z11);

        p7.a1 p();

        p7.e0 p0();

        boolean q();

        void q0(p7.y yVar, long j11);

        int r();

        void r0(int i11, int i12);

        void release();

        p7.w0 s();

        boolean s0();

        void seekTo(long j11);

        void stop();

        boolean t();

        void u(boolean z11);

        void u0(boolean z11, int i11);

        long v();

        void v0();

        long w();

        int w0();

        int x();

        void x0();

        void y(TextureView textureView);

        void y0();

        int z();

        void z0(int i11, int i12, List<p7.y> list);
    }

    v(Context context, ve veVar, Bundle bundle, c cVar, Looper looper, b bVar, s7.h hVar, int i11, long j11) {
        s7.a.g(context, "context must not be null");
        s7.a.g(veVar, "token must not be null");
        s7.t.g("MediaController", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + s7.q0.f110458e + "]");
        this.f12466a = new p7.r0.d();
        this.f12471f = -9223372036854775807L;
        this.f12469d = cVar;
        this.f12470e = new Handler(looper);
        this.f12474i = bVar;
        this.f12473h = i11;
        d dVarB1 = b1(context, veVar, bundle, looper, hVar, j11);
        this.f12468c = dVarB1;
        dVarB1.connect();
    }

    public static /* synthetic */ void Z0(v vVar, c cVar) {
        vVar.getClass();
        cVar.N(vVar);
    }

    private static com.google.common.util.concurrent.s<ga.v> a1() {
        return com.google.common.util.concurrent.m.d(new ga.v(-100));
    }

    public static void k1(Future<? extends v> future) {
        if (future.cancel(false)) {
            return;
        }
        try {
            ((v) com.google.common.util.concurrent.m.b(future)).release();
        } catch (CancellationException | ExecutionException e11) {
            s7.t.j("MediaController", "MediaController future failed (so we couldn't release it)", e11);
        }
    }

    private void n1() {
        s7.a.i(Looper.myLooper() == F0(), "MediaController method is called from a wrong thread. See javadoc of MediaController for details.");
    }

    @Override // p7.j0
    public final long A() {
        n1();
        if (h1()) {
            return this.f12468c.A();
        }
        return 0L;
    }

    @Override // p7.j0
    public final void A0(int i11) {
        n1();
        if (h1()) {
            this.f12468c.A0(i11);
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring removeMediaItem().");
        }
    }

    @Override // p7.j0
    public final long B() {
        n1();
        if (h1()) {
            return this.f12468c.B();
        }
        return 0L;
    }

    @Override // p7.j0
    public final void B0(int i11) {
        n1();
        if (h1()) {
            this.f12468c.B0(i11);
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring decreaseDeviceVolume().");
        }
    }

    @Override // p7.j0
    public final void C() {
        n1();
        if (h1()) {
            this.f12468c.C();
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring seekForward().");
        }
    }

    @Override // p7.j0
    public final void C0(p7.w0 w0Var) {
        n1();
        if (!h1()) {
            s7.t.i("MediaController", "The controller is not connected. Ignoring setTrackSelectionParameters().");
        }
        this.f12468c.C0(w0Var);
    }

    @Override // p7.j0
    public final long D() {
        n1();
        if (h1()) {
            return this.f12468c.D();
        }
        return 0L;
    }

    @Override // p7.j0
    public final void D0(p7.j0.d dVar) {
        s7.a.g(dVar, "listener must not be null");
        this.f12468c.D0(dVar);
    }

    @Override // p7.j0
    public final void E() {
        n1();
        if (h1()) {
            this.f12468c.E();
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // p7.j0
    public final boolean E0() {
        n1();
        p7.r0 r0VarJ = J();
        return !r0VarJ.u() && r0VarJ.r(R(), this.f12466a).f101489i;
    }

    @Override // p7.j0
    public final void F() {
        n1();
        if (h1()) {
            this.f12468c.F();
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring seekToPrevious().");
        }
    }

    @Override // p7.j0
    public final Looper F0() {
        return this.f12470e.getLooper();
    }

    @Override // p7.j0
    public final void G(boolean z11) {
        n1();
        if (h1()) {
            this.f12468c.G(z11);
        }
    }

    @Override // p7.j0
    public final float G0() {
        n1();
        if (h1()) {
            return this.f12468c.G0();
        }
        return 1.0f;
    }

    @Override // p7.j0
    public final r7.e H() {
        n1();
        return h1() ? this.f12468c.H() : r7.e.f107103d;
    }

    @Override // p7.j0
    public final p7.d H0() {
        n1();
        return !h1() ? p7.d.f101231h : this.f12468c.H0();
    }

    @Override // p7.j0
    public final int I() {
        n1();
        if (h1()) {
            return this.f12468c.I();
        }
        return 0;
    }

    @Override // p7.j0
    public final void I0(int i11, int i12) {
        n1();
        if (h1()) {
            this.f12468c.I0(i11, i12);
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring setDeviceVolume().");
        }
    }

    @Override // p7.j0
    public final p7.r0 J() {
        n1();
        return h1() ? this.f12468c.J() : p7.r0.f101451a;
    }

    @Override // p7.j0
    public final void J0(int i11, p7.y yVar) {
        n1();
        if (h1()) {
            this.f12468c.J0(i11, yVar);
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring replaceMediaItem().");
        }
    }

    @Override // p7.j0
    public final void K() {
        n1();
        if (h1()) {
            this.f12468c.K();
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring seekToNext().");
        }
    }

    @Override // p7.j0
    public final void K0(int i11, List<p7.y> list) {
        n1();
        if (h1()) {
            this.f12468c.K0(i11, list);
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring addMediaItems().");
        }
    }

    @Override // p7.j0
    public final void L(TextureView textureView) {
        n1();
        if (h1()) {
            this.f12468c.L(textureView);
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring setVideoTextureView().");
        }
    }

    @Override // p7.j0
    public final long L0() {
        n1();
        if (h1()) {
            return this.f12468c.L0();
        }
        return 0L;
    }

    @Override // p7.j0
    public final void M(int i11, long j11) {
        n1();
        if (h1()) {
            this.f12468c.M(i11, j11);
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // p7.j0
    public final void M0(int i11, int i12, int i13) {
        n1();
        if (h1()) {
            this.f12468c.M0(i11, i12, i13);
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring moveMediaItems().");
        }
    }

    @Override // p7.j0
    public final p7.j0.b N() {
        n1();
        return !h1() ? p7.j0.b.f101382b : this.f12468c.N();
    }

    @Override // p7.j0
    public final void N0(List<p7.y> list) {
        n1();
        if (h1()) {
            this.f12468c.N0(list);
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring addMediaItems().");
        }
    }

    @Override // p7.j0
    public final p7.e1 O() {
        n1();
        return h1() ? this.f12468c.O() : p7.e1.f101328e;
    }

    @Override // p7.j0
    @Deprecated
    public final void O0(int i11) {
        n1();
        if (h1()) {
            this.f12468c.O0(i11);
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring setDeviceVolume().");
        }
    }

    @Override // p7.j0
    public final boolean P() {
        n1();
        return h1() && this.f12468c.P();
    }

    @Override // p7.j0
    public final long Q() {
        n1();
        if (h1()) {
            return this.f12468c.Q();
        }
        return 0L;
    }

    @Override // p7.j0
    public final int R() {
        n1();
        if (h1()) {
            return this.f12468c.R();
        }
        return -1;
    }

    @Override // p7.j0
    public final boolean R0() {
        return false;
    }

    @Override // p7.j0
    public final void S(SurfaceView surfaceView) {
        n1();
        if (h1()) {
            this.f12468c.S(surfaceView);
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring clearVideoSurfaceView().");
        }
    }

    @Override // p7.j0
    public final boolean T() {
        n1();
        return h1() && this.f12468c.T();
    }

    @Override // p7.j0
    public final void U() {
        n1();
        if (h1()) {
            this.f12468c.U();
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring seekBack().");
        }
    }

    @Override // p7.j0
    public final p7.y U0() {
        p7.r0 r0VarJ = J();
        if (r0VarJ.u()) {
            return null;
        }
        return r0VarJ.r(R(), this.f12466a).f101483c;
    }

    @Override // p7.j0
    public final p7.e0 V() {
        n1();
        return h1() ? this.f12468c.V() : p7.e0.K;
    }

    @Override // p7.j0
    public final long W() {
        n1();
        if (h1()) {
            return this.f12468c.W();
        }
        return 0L;
    }

    @Override // p7.j0
    public final void X(Surface surface) {
        n1();
        if (h1()) {
            this.f12468c.X(surface);
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring setVideoSurface().");
        }
    }

    @Override // p7.j0
    public final void Y(List<p7.y> list, boolean z11) {
        n1();
        s7.a.g(list, "mediaItems must not be null");
        for (int i11 = 0; i11 < list.size(); i11++) {
            s7.a.b(list.get(i11) != null, "items must not contain null, index=" + i11);
        }
        if (h1()) {
            this.f12468c.Y(list, z11);
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override // p7.j0
    public final void Z(int i11) {
        n1();
        if (h1()) {
            this.f12468c.Z(i11);
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring increaseDeviceVolume().");
        }
    }

    @Override // p7.j0
    public final PlaybackException a() {
        n1();
        if (h1()) {
            return this.f12468c.a();
        }
        return null;
    }

    @Override // p7.j0
    public final void a0(int i11, int i12) {
        n1();
        if (h1()) {
            this.f12468c.a0(i11, i12);
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring removeMediaItems().");
        }
    }

    @Override // p7.j0
    public final void b() {
        n1();
        if (h1()) {
            this.f12468c.b();
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring prepare().");
        }
    }

    @Override // p7.j0
    public final void b0() {
        n1();
        if (h1()) {
            this.f12468c.b0();
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring seekToNextMediaItem().");
        }
    }

    d b1(Context context, ve veVar, Bundle bundle, Looper looper, s7.h hVar, long j11) {
        return veVar.j() ? new s5(context, this, veVar, bundle, looper, (s7.h) s7.a.f(hVar), j11) : new k4(context, this, veVar, bundle, looper);
    }

    @Override // p7.j0
    public final boolean c() {
        n1();
        return h1() && this.f12468c.c();
    }

    @Override // p7.j0
    public final boolean c0(int i11) {
        return N().c(i11);
    }

    public final te c1() {
        n1();
        return !h1() ? te.f12414b : this.f12468c.Q0();
    }

    @Override // p7.j0
    public final void d() {
        n1();
        if (h1()) {
            this.f12468c.d();
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring pause().");
        }
    }

    @Override // p7.j0
    @Deprecated
    public final void d0(boolean z11) {
        n1();
        if (h1()) {
            this.f12468c.d0(z11);
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring setDeviceMuted().");
        }
    }

    Bundle d1() {
        return this.f12468c.S0();
    }

    @Override // p7.j0
    public final p7.i0 e() {
        n1();
        return h1() ? this.f12468c.e() : p7.i0.f101376d;
    }

    @Override // p7.j0
    public final void e0(p7.j0.d dVar) {
        n1();
        s7.a.g(dVar, "listener must not be null");
        this.f12468c.e0(dVar);
    }

    int e1() {
        return this.f12473h;
    }

    @Override // p7.j0
    public final void f() {
        n1();
        if (h1()) {
            this.f12468c.f();
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring play().");
        }
    }

    @Override // p7.j0
    @Deprecated
    public final void f0() {
        n1();
        if (h1()) {
            this.f12468c.f0();
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring increaseDeviceVolume().");
        }
    }

    public final com.google.common.collect.x<androidx.media3.session.a> f1() {
        n1();
        return h1() ? this.f12468c.R0() : com.google.common.collect.x.r();
    }

    @Override // p7.j0
    public final int g() {
        n1();
        if (h1()) {
            return this.f12468c.g();
        }
        return 1;
    }

    @Override // p7.j0
    public final int g0() {
        n1();
        if (h1()) {
            return this.f12468c.g0();
        }
        return 0;
    }

    final long g1() {
        return this.f12471f;
    }

    @Override // p7.j0
    public final long getDuration() {
        n1();
        if (h1()) {
            return this.f12468c.getDuration();
        }
        return -9223372036854775807L;
    }

    @Override // p7.j0
    public final int h() {
        n1();
        if (h1()) {
            return this.f12468c.h();
        }
        return 0;
    }

    @Override // p7.j0
    public final long h0() {
        n1();
        if (h1()) {
            return this.f12468c.h0();
        }
        return -9223372036854775807L;
    }

    public final boolean h1() {
        return this.f12468c.isConnected();
    }

    @Override // p7.j0
    public final void i(int i11) {
        n1();
        if (h1()) {
            this.f12468c.i(i11);
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring setRepeatMode().");
        }
    }

    @Override // p7.j0
    public final p7.m i0() {
        n1();
        return !h1() ? p7.m.f101411e : this.f12468c.i0();
    }

    final void i1() {
        s7.a.h(Looper.myLooper() == F0());
        s7.a.h(!this.f12472g);
        this.f12472g = true;
        this.f12474i.a();
    }

    @Override // p7.j0
    public final boolean isPlaying() {
        n1();
        return h1() && this.f12468c.isPlaying();
    }

    @Override // p7.j0
    public final void j(p7.i0 i0Var) {
        n1();
        s7.a.g(i0Var, "playbackParameters must not be null");
        if (h1()) {
            this.f12468c.j(i0Var);
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring setPlaybackParameters().");
        }
    }

    @Override // p7.j0
    public final void j0(p7.e0 e0Var) {
        n1();
        s7.a.g(e0Var, "playlistMetadata must not be null");
        if (h1()) {
            this.f12468c.j0(e0Var);
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring setPlaylistMetadata().");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j1(s7.n<c> nVar) {
        s7.a.h(Looper.myLooper() == F0());
        nVar.accept(this.f12469d);
    }

    @Override // p7.j0
    public final void k(float f11) {
        n1();
        s7.a.b(f11 >= BitmapDescriptorFactory.HUE_RED && f11 <= 1.0f, "volume must be between 0 and 1");
        if (h1()) {
            this.f12468c.k(f11);
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring setVolume().");
        }
    }

    @Override // p7.j0
    public final void k0(List<p7.y> list, int i11, long j11) {
        n1();
        s7.a.g(list, "mediaItems must not be null");
        for (int i12 = 0; i12 < list.size(); i12++) {
            s7.a.b(list.get(i12) != null, "items must not contain null, index=" + i12);
        }
        if (h1()) {
            this.f12468c.k0(list, i11, j11);
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override // p7.j0
    public final void l(float f11) {
        n1();
        if (h1()) {
            this.f12468c.l(f11);
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring setPlaybackSpeed().");
        }
    }

    @Override // p7.j0
    public final void l0(int i11) {
        n1();
        if (h1()) {
            this.f12468c.l0(i11);
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    final void l1(Runnable runnable) {
        s7.q0.m1(this.f12470e, runnable);
    }

    @Override // p7.j0
    public final boolean m() {
        n1();
        return h1() && this.f12468c.m();
    }

    @Override // p7.j0
    public final void m0(p7.y yVar, boolean z11) {
        n1();
        s7.a.g(yVar, "mediaItems must not be null");
        if (h1()) {
            this.f12468c.m0(yVar, z11);
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    public final com.google.common.util.concurrent.s<ga.v> m1(se seVar, Bundle bundle) {
        n1();
        s7.a.g(seVar, "command must not be null");
        s7.a.b(seVar.f12347a == 0, "command must be a custom command");
        return h1() ? this.f12468c.P0(seVar, bundle) : a1();
    }

    @Override // p7.j0
    public final long n() {
        n1();
        if (h1()) {
            return this.f12468c.n();
        }
        return 0L;
    }

    @Override // p7.j0
    public final boolean n0() {
        n1();
        p7.r0 r0VarJ = J();
        return !r0VarJ.u() && r0VarJ.r(R(), this.f12466a).f101488h;
    }

    @Override // p7.j0
    public final void o(SurfaceView surfaceView) {
        n1();
        if (h1()) {
            this.f12468c.o(surfaceView);
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring setVideoSurfaceView().");
        }
    }

    @Override // p7.j0
    public final void o0(p7.d dVar, boolean z11) {
        n1();
        if (h1()) {
            this.f12468c.o0(dVar, z11);
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring setAudioAttributes().");
        }
    }

    @Override // p7.j0
    public final p7.a1 p() {
        n1();
        return h1() ? this.f12468c.p() : p7.a1.f101183b;
    }

    @Override // p7.j0
    public final p7.e0 p0() {
        n1();
        return h1() ? this.f12468c.p0() : p7.e0.K;
    }

    @Override // p7.j0
    public final boolean q() {
        n1();
        return h1() && this.f12468c.q();
    }

    @Override // p7.j0
    public final void q0(p7.y yVar, long j11) {
        n1();
        s7.a.g(yVar, "mediaItems must not be null");
        if (h1()) {
            this.f12468c.q0(yVar, j11);
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring setMediaItem().");
        }
    }

    @Override // p7.j0
    public final int r() {
        n1();
        if (h1()) {
            return this.f12468c.r();
        }
        return -1;
    }

    @Override // p7.j0
    public final void r0(int i11, int i12) {
        n1();
        if (h1()) {
            this.f12468c.r0(i11, i12);
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring moveMediaItem().");
        }
    }

    public final void release() {
        n1();
        if (this.f12467b) {
            return;
        }
        s7.t.g("MediaController", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + s7.q0.f110458e + "] [" + p7.d0.b() + "]");
        this.f12467b = true;
        this.f12470e.removeCallbacksAndMessages(null);
        try {
            this.f12468c.release();
        } catch (Exception e11) {
            s7.t.c("MediaController", "Exception while releasing impl", e11);
        }
        if (this.f12472g) {
            j1(new s7.n() { // from class: ga.h
                @Override // s7.n
                public final void accept(Object obj) {
                    androidx.media3.session.v.Z0(this.f67689a, (androidx.media3.session.v.c) obj);
                }
            });
        } else {
            this.f12472g = true;
            this.f12474i.c();
        }
    }

    @Override // p7.j0
    public final p7.w0 s() {
        n1();
        return !h1() ? p7.w0.F : this.f12468c.s();
    }

    @Override // p7.j0
    public final boolean s0() {
        n1();
        if (h1()) {
            return this.f12468c.s0();
        }
        return false;
    }

    @Override // p7.j0
    public final void seekTo(long j11) {
        n1();
        if (h1()) {
            this.f12468c.seekTo(j11);
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // p7.j0
    public final void stop() {
        n1();
        if (h1()) {
            this.f12468c.stop();
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring stop().");
        }
    }

    @Override // p7.j0
    public final boolean t() {
        n1();
        return h1() && this.f12468c.t();
    }

    @Override // p7.j0
    public final boolean t0() {
        n1();
        p7.r0 r0VarJ = J();
        return !r0VarJ.u() && r0VarJ.r(R(), this.f12466a).g();
    }

    @Override // p7.j0
    public final void u(boolean z11) {
        n1();
        if (h1()) {
            this.f12468c.u(z11);
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring setShuffleMode().");
        }
    }

    @Override // p7.j0
    public final void u0(boolean z11, int i11) {
        n1();
        if (h1()) {
            this.f12468c.u0(z11, i11);
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring setDeviceMuted().");
        }
    }

    @Override // p7.j0
    public final long v() {
        n1();
        if (h1()) {
            return this.f12468c.v();
        }
        return 0L;
    }

    @Override // p7.j0
    public final void v0() {
        n1();
        if (h1()) {
            this.f12468c.v0();
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring clearMediaItems().");
        }
    }

    @Override // p7.j0
    public final long w() {
        n1();
        if (h1()) {
            return this.f12468c.w();
        }
        return -9223372036854775807L;
    }

    @Override // p7.j0
    public final int w0() {
        n1();
        if (h1()) {
            return this.f12468c.w0();
        }
        return 0;
    }

    @Override // p7.j0
    public final int x() {
        n1();
        if (h1()) {
            return this.f12468c.x();
        }
        return -1;
    }

    @Override // p7.j0
    public final void x0() {
        n1();
        if (h1()) {
            this.f12468c.x0();
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring seekToPreviousMediaItem().");
        }
    }

    @Override // p7.j0
    public final void y(TextureView textureView) {
        n1();
        if (h1()) {
            this.f12468c.y(textureView);
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring clearVideoTextureView().");
        }
    }

    @Override // p7.j0
    @Deprecated
    public final void y0() {
        n1();
        if (h1()) {
            this.f12468c.y0();
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring decreaseDeviceVolume().");
        }
    }

    @Override // p7.j0
    public final int z() {
        n1();
        if (h1()) {
            return this.f12468c.z();
        }
        return -1;
    }

    @Override // p7.j0
    public final void z0(int i11, int i12, List<p7.y> list) {
        n1();
        if (h1()) {
            this.f12468c.z0(i11, i12, list);
        } else {
            s7.t.i("MediaController", "The controller is not connected. Ignoring replaceMediaItems().");
        }
    }

    public interface c {
        default void M(v vVar, PendingIntent pendingIntent) {
        }

        default void N(v vVar) {
        }

        default void O(v vVar, List<androidx.media3.session.a> list) {
        }

        default com.google.common.util.concurrent.s<ga.v> T(v vVar, List<androidx.media3.session.a> list) {
            return com.google.common.util.concurrent.m.d(new ga.v(-6));
        }

        default void W(v vVar, Bundle bundle) {
        }

        default void n(v vVar, te teVar) {
        }

        default com.google.common.util.concurrent.s<ga.v> q(v vVar, se seVar, Bundle bundle) {
            return com.google.common.util.concurrent.m.d(new ga.v(-6));
        }

        default void z(v vVar, List<androidx.media3.session.a> list) {
        }

        default void I(v vVar, ga.u uVar) {
        }
    }
}
