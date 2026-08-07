package androidx.media3.exoplayer.video;

import android.media.MediaFormat;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import p7.e1;
import p7.u;
import s7.e0;

/* JADX INFO: loaded from: classes3.dex */
final class d implements VideoSink {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f11184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f11185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue<VideoSink.b> f11186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Surface f11187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private u f11188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f11189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private VideoSink.a f11190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Executor f11191h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private u8.k f11192i;

    /* JADX INFO: Access modifiers changed from: private */
    final class b implements n.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private u f11193a;

        private b() {
        }

        @Override // androidx.media3.exoplayer.video.n.a
        public void a(long j11, long j12, boolean z11) {
            if (z11 && d.this.f11187d != null) {
                d.this.f11191h.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.this.f11190g.onFirstFrameRendered();
                    }
                });
            }
            u uVarP = this.f11193a;
            if (uVarP == null) {
                uVarP = new u.b().P();
            }
            d.this.f11192i.g(j12, j11, uVarP, null);
            ((VideoSink.b) d.this.f11186c.remove()).b(j11);
        }

        @Override // androidx.media3.exoplayer.video.n.a
        public void b(final e1 e1Var) {
            this.f11193a = new u.b().F0(e1Var.f101332a).h0(e1Var.f101333b).y0("video/raw").P();
            d.this.f11191h.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.g
                @Override // java.lang.Runnable
                public final void run() {
                    d.this.f11190g.b(e1Var);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.n.a
        public void c() {
            d.this.f11191h.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.f
                @Override // java.lang.Runnable
                public final void run() {
                    d.this.f11190g.c();
                }
            });
            ((VideoSink.b) d.this.f11186c.remove()).a();
        }
    }

    public d(l lVar, s7.j jVar) {
        this.f11184a = lVar;
        lVar.m(jVar);
        this.f11185b = new n(new b(), lVar);
        this.f11186c = new ArrayDeque();
        this.f11188e = new u.b().P();
        this.f11189f = -9223372036854775807L;
        this.f11190g = VideoSink.a.f11182a;
        this.f11191h = new Executor() { // from class: androidx.media3.exoplayer.video.a
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                d.b(runnable);
            }
        };
        this.f11192i = new u8.k() { // from class: androidx.media3.exoplayer.video.b
            @Override // u8.k
            public final void g(long j11, long j12, u uVar, MediaFormat mediaFormat) {
                d.e(j11, j12, uVar, mediaFormat);
            }
        };
    }

    public static /* synthetic */ void b(Runnable runnable) {
    }

    public static /* synthetic */ void e(long j11, long j12, u uVar, MediaFormat mediaFormat) {
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void A(int i11, u uVar, long j11, int i12, List<Object> list) {
        s7.a.h(list.isEmpty());
        int i13 = uVar.f101551v;
        u uVar2 = this.f11188e;
        if (i13 != uVar2.f101551v || uVar.f101552w != uVar2.f101552w) {
            this.f11185b.i(i13, uVar.f101552w);
        }
        float f11 = uVar.f101555z;
        if (f11 != this.f11188e.f101555z) {
            this.f11184a.n(f11);
        }
        this.f11188e = uVar;
        if (j11 != this.f11189f) {
            this.f11185b.h(i12, j11);
            this.f11189f = j11;
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void B() {
        this.f11187d = null;
        this.f11184a.o(null);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void C(boolean z11) {
        if (z11) {
            this.f11184a.k();
        }
        this.f11185b.b();
        this.f11186c.clear();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void D(boolean z11) {
        this.f11184a.e(z11);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean E(u uVar) {
        return true;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean a() {
        return this.f11185b.d();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void d(long j11, long j12) throws VideoSink.VideoSinkException {
        try {
            this.f11185b.j(j11, j12);
        } catch (ExoPlaybackException e11) {
            throw new VideoSink.VideoSinkException(e11, this.f11188e);
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean isInitialized() {
        return true;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void l(float f11) {
        this.f11184a.p(f11);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public Surface m() {
        return (Surface) s7.a.j(this.f11187d);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void n() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void o() {
        this.f11185b.l();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void p(u8.k kVar) {
        this.f11192i = kVar;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void q() {
        this.f11184a.a();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void r() {
        this.f11184a.i();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void release() {
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void s() {
        this.f11184a.h();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void t(int i11) {
        this.f11184a.l(i11);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void u(VideoSink.a aVar, Executor executor) {
        this.f11190g = aVar;
        this.f11191h = executor;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean v(long j11, VideoSink.b bVar) {
        this.f11186c.add(bVar);
        this.f11185b.g(j11);
        this.f11191h.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f11183a.f11190g.a();
            }
        });
        return true;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void w(Surface surface, e0 e0Var) {
        this.f11187d = surface;
        this.f11184a.o(surface);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void x(long j11) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void y(List<Object> list) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean z(boolean z11) {
        return this.f11184a.d(z11);
    }
}
