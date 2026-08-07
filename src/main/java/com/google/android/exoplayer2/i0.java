package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.v1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class i0 extends com.google.android.exoplayer2.e implements k {
    private final com.google.android.exoplayer2.d A;
    private final c2 B;
    private final h2 C;
    private final i2 D;
    private final long E;
    private int F;
    private boolean G;
    private int H;
    private int I;
    private boolean J;
    private int K;
    private br.l0 L;
    private es.r M;
    private boolean N;
    private v1.b O;
    private y0 P;
    private y0 Q;
    private u0 R;
    private u0 S;
    private AudioTrack T;
    private Object U;
    private Surface V;
    private SurfaceHolder W;
    private vs.l X;
    private boolean Y;
    private TextureView Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f40016a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final qs.b0 f40017b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f40018b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final v1.b f40019c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private ts.g0 f40020c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ts.g f40021d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private fr.e f40022d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f40023e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private fr.e f40024e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final v1 f40025f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f40026f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final z1[] f40027g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private com.google.android.exoplayer2.audio.a f40028g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final qs.a0 f40029h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private float f40030h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ts.q f40031i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f40032i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final t0.f f40033j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private gs.f f40034j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final t0 f40035k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private boolean f40036k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ts.t<v1.d> f40037l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f40038l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final CopyOnWriteArraySet<k.a> f40039m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private PriorityTaskManager f40040m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final f2.b f40041n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private boolean f40042n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List<e> f40043o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private boolean f40044o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f40045p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private j f40046p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.o.a f40047q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private us.z f40048q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final cr.a f40049r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private y0 f40050r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Looper f40051s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private t1 f40052s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ss.d f40053t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f40054t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final long f40055u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private int f40056u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final long f40057v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private long f40058v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ts.d f40059w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final c f40060x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final d f40061y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final com.google.android.exoplayer2.b f40062z;

    private static final class b {
        public static cr.q1 a(Context context, i0 i0Var, boolean z11) {
            cr.o1 o1VarU0 = cr.o1.u0(context);
            if (o1VarU0 == null) {
                ts.u.i("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new cr.q1(LogSessionId.LOG_SESSION_ID_NONE);
            }
            if (z11) {
                i0Var.m1(o1VarU0);
            }
            return new cr.q1(o1VarU0.B0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c implements us.x, com.google.android.exoplayer2.audio.e, gs.o, ur.e, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, vs.l.b, com.google.android.exoplayer2.d.b, com.google.android.exoplayer2.b.InterfaceC0649b, c2.b, k.a {
        private c() {
        }

        @Override // com.google.android.exoplayer2.audio.e
        public void a(Exception exc) {
            i0.this.f40049r.a(exc);
        }

        @Override // com.google.android.exoplayer2.audio.e
        public void b(fr.e eVar) {
            i0.this.f40024e0 = eVar;
            i0.this.f40049r.b(eVar);
        }

        @Override // us.x
        public void c(String str) {
            i0.this.f40049r.c(str);
        }

        @Override // com.google.android.exoplayer2.audio.e
        public void d(String str) {
            i0.this.f40049r.d(str);
        }

        @Override // com.google.android.exoplayer2.audio.e
        public void e(String str, long j11, long j12) {
            i0.this.f40049r.e(str, j11, j12);
        }

        @Override // us.x
        public void f(int i11, long j11) {
            i0.this.f40049r.f(i11, j11);
        }

        @Override // com.google.android.exoplayer2.audio.e
        public void g(Exception exc) {
            i0.this.f40049r.g(exc);
        }

        @Override // us.x
        public void h(long j11, int i11) {
            i0.this.f40049r.h(j11, i11);
        }

        @Override // us.x
        public void i(String str, long j11, long j12) {
            i0.this.f40049r.i(str, j11, j12);
        }

        @Override // com.google.android.exoplayer2.audio.e
        public void j(long j11) {
            i0.this.f40049r.j(j11);
        }

        @Override // us.x
        public void k(Exception exc) {
            i0.this.f40049r.k(exc);
        }

        @Override // us.x
        public void l(Object obj, long j11) {
            i0.this.f40049r.l(obj, j11);
            if (i0.this.U == obj) {
                i0.this.f40037l.k(26, new ts.t.a() { // from class: br.o
                    @Override // ts.t.a
                    public final void invoke(Object obj2) {
                        ((v1.d) obj2).onRenderedFirstFrame();
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.audio.e
        public void m(int i11, long j11, long j12) {
            i0.this.f40049r.m(i11, j11, j12);
        }

        @Override // com.google.android.exoplayer2.b.InterfaceC0649b
        public void n() {
            i0.this.X1(false, -1, 3);
        }

        @Override // us.x
        public void o(fr.e eVar) {
            i0.this.f40022d0 = eVar;
            i0.this.f40049r.o(eVar);
        }

        @Override // gs.o
        public void onCues(final List<gs.b> list) {
            i0.this.f40037l.k(27, new ts.t.a() { // from class: com.google.android.exoplayer2.j0
                @Override // ts.t.a
                public final void invoke(Object obj) {
                    ((v1.d) obj).onCues((List<gs.b>) list);
                }
            });
        }

        @Override // ur.e
        public void onMetadata(final ur.a aVar) {
            i0 i0Var = i0.this;
            i0Var.f40050r0 = i0Var.f40050r0.b().L(aVar).H();
            y0 y0VarP1 = i0.this.p1();
            if (!y0VarP1.equals(i0.this.P)) {
                i0.this.P = y0VarP1;
                i0.this.f40037l.h(14, new ts.t.a() { // from class: com.google.android.exoplayer2.l0
                    @Override // ts.t.a
                    public final void invoke(Object obj) {
                        ((v1.d) obj).onMediaMetadataChanged(i0.this.P);
                    }
                });
            }
            i0.this.f40037l.h(28, new ts.t.a() { // from class: com.google.android.exoplayer2.m0
                @Override // ts.t.a
                public final void invoke(Object obj) {
                    ((v1.d) obj).onMetadata(aVar);
                }
            });
            i0.this.f40037l.f();
        }

        @Override // com.google.android.exoplayer2.audio.e
        public void onSkipSilenceEnabledChanged(final boolean z11) {
            if (i0.this.f40032i0 == z11) {
                return;
            }
            i0.this.f40032i0 = z11;
            i0.this.f40037l.k(23, new ts.t.a() { // from class: com.google.android.exoplayer2.p0
                @Override // ts.t.a
                public final void invoke(Object obj) {
                    ((v1.d) obj).onSkipSilenceEnabledChanged(z11);
                }
            });
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i11, int i12) {
            i0.this.S1(surfaceTexture);
            i0.this.I1(i11, i12);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            i0.this.T1(null);
            i0.this.I1(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i11, int i12) {
            i0.this.I1(i11, i12);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // us.x
        public void onVideoSizeChanged(final us.z zVar) {
            i0.this.f40048q0 = zVar;
            i0.this.f40037l.k(25, new ts.t.a() { // from class: com.google.android.exoplayer2.q0
                @Override // ts.t.a
                public final void invoke(Object obj) {
                    ((v1.d) obj).onVideoSizeChanged(zVar);
                }
            });
        }

        @Override // us.x
        public void p(fr.e eVar) {
            i0.this.f40049r.p(eVar);
            i0.this.R = null;
            i0.this.f40022d0 = null;
        }

        @Override // com.google.android.exoplayer2.c2.b
        public void q(int i11) {
            final j jVarS1 = i0.s1(i0.this.B);
            if (jVarS1.equals(i0.this.f40046p0)) {
                return;
            }
            i0.this.f40046p0 = jVarS1;
            i0.this.f40037l.k(29, new ts.t.a() { // from class: com.google.android.exoplayer2.o0
                @Override // ts.t.a
                public final void invoke(Object obj) {
                    ((v1.d) obj).onDeviceInfoChanged(jVarS1);
                }
            });
        }

        @Override // com.google.android.exoplayer2.audio.e
        public void r(fr.e eVar) {
            i0.this.f40049r.r(eVar);
            i0.this.S = null;
            i0.this.f40024e0 = null;
        }

        @Override // us.x
        public void s(u0 u0Var, fr.g gVar) {
            i0.this.R = u0Var;
            i0.this.f40049r.s(u0Var, gVar);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i11, int i12, int i13) {
            i0.this.I1(i12, i13);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (i0.this.Y) {
                i0.this.T1(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (i0.this.Y) {
                i0.this.T1(null);
            }
            i0.this.I1(0, 0);
        }

        @Override // com.google.android.exoplayer2.d.b
        public void t(float f11) {
            i0.this.N1();
        }

        @Override // com.google.android.exoplayer2.d.b
        public void u(int i11) {
            boolean zT = i0.this.t();
            i0.this.X1(zT, i11, i0.A1(zT, i11));
        }

        @Override // vs.l.b
        public void v(Surface surface) {
            i0.this.T1(null);
        }

        @Override // com.google.android.exoplayer2.audio.e
        public void w(u0 u0Var, fr.g gVar) {
            i0.this.S = u0Var;
            i0.this.f40049r.w(u0Var, gVar);
        }

        @Override // vs.l.b
        public void x(Surface surface) {
            i0.this.T1(surface);
        }

        @Override // com.google.android.exoplayer2.k.a
        public void y(boolean z11) {
            i0.this.a2();
        }

        @Override // com.google.android.exoplayer2.c2.b
        public void z(final int i11, final boolean z11) {
            i0.this.f40037l.k(30, new ts.t.a() { // from class: com.google.android.exoplayer2.n0
                @Override // ts.t.a
                public final void invoke(Object obj) {
                    ((v1.d) obj).onDeviceVolumeChanged(i11, z11);
                }
            });
        }

        @Override // gs.o
        public void onCues(final gs.f fVar) {
            i0.this.f40034j0 = fVar;
            i0.this.f40037l.k(27, new ts.t.a() { // from class: com.google.android.exoplayer2.k0
                @Override // ts.t.a
                public final void invoke(Object obj) {
                    ((v1.d) obj).onCues(fVar);
                }
            });
        }
    }

    private static final class d implements us.k, vs.a, w1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private us.k f40064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private vs.a f40065b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private us.k f40066c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private vs.a f40067d;

        private d() {
        }

        @Override // vs.a
        public void b(long j11, float[] fArr) {
            vs.a aVar = this.f40067d;
            if (aVar != null) {
                aVar.b(j11, fArr);
            }
            vs.a aVar2 = this.f40065b;
            if (aVar2 != null) {
                aVar2.b(j11, fArr);
            }
        }

        @Override // vs.a
        public void e() {
            vs.a aVar = this.f40067d;
            if (aVar != null) {
                aVar.e();
            }
            vs.a aVar2 = this.f40065b;
            if (aVar2 != null) {
                aVar2.e();
            }
        }

        @Override // us.k
        public void g(long j11, long j12, u0 u0Var, MediaFormat mediaFormat) {
            long j13;
            long j14;
            u0 u0Var2;
            MediaFormat mediaFormat2;
            us.k kVar = this.f40066c;
            if (kVar != null) {
                kVar.g(j11, j12, u0Var, mediaFormat);
                mediaFormat2 = mediaFormat;
                u0Var2 = u0Var;
                j14 = j12;
                j13 = j11;
            } else {
                j13 = j11;
                j14 = j12;
                u0Var2 = u0Var;
                mediaFormat2 = mediaFormat;
            }
            us.k kVar2 = this.f40064a;
            if (kVar2 != null) {
                kVar2.g(j13, j14, u0Var2, mediaFormat2);
            }
        }

        @Override // com.google.android.exoplayer2.w1.b
        public void k(int i11, Object obj) {
            if (i11 == 7) {
                this.f40064a = (us.k) obj;
                return;
            }
            if (i11 == 8) {
                this.f40065b = (vs.a) obj;
                return;
            }
            if (i11 != 10000) {
                return;
            }
            vs.l lVar = (vs.l) obj;
            if (lVar == null) {
                this.f40066c = null;
                this.f40067d = null;
            } else {
                this.f40066c = lVar.getVideoFrameMetadataListener();
                this.f40067d = lVar.getCameraMotionListener();
            }
        }
    }

    private static final class e implements d1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f40068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private f2 f40069b;

        public e(Object obj, f2 f2Var) {
            this.f40068a = obj;
            this.f40069b = f2Var;
        }

        @Override // com.google.android.exoplayer2.d1
        public Object a() {
            return this.f40068a;
        }

        @Override // com.google.android.exoplayer2.d1
        public f2 b() {
            return this.f40069b;
        }
    }

    static {
        br.p.a("goog.exo.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public i0(k.b bVar, v1 v1Var) {
        ts.g gVar = new ts.g();
        this.f40021d = gVar;
        try {
            ts.u.f("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.19.1] [" + ts.p0.f115044e + "]");
            Context applicationContext = bVar.f40094a.getApplicationContext();
            this.f40023e = applicationContext;
            cr.a aVarApply = bVar.f40102i.apply(bVar.f40095b);
            this.f40049r = aVarApply;
            this.f40040m0 = bVar.f40104k;
            this.f40028g0 = bVar.f40105l;
            this.f40016a0 = bVar.f40111r;
            this.f40018b0 = bVar.f40112s;
            this.f40032i0 = bVar.f40109p;
            this.E = bVar.f40119z;
            c cVar = new c();
            this.f40060x = cVar;
            d dVar = new d();
            this.f40061y = dVar;
            Handler handler = new Handler(bVar.f40103j);
            z1[] z1VarArrA = bVar.f40097d.get().a(handler, cVar, cVar, cVar, cVar);
            this.f40027g = z1VarArrA;
            ts.a.g(z1VarArrA.length > 0);
            qs.a0 a0Var = bVar.f40099f.get();
            this.f40029h = a0Var;
            this.f40047q = bVar.f40098e.get();
            ss.d dVar2 = bVar.f40101h.get();
            this.f40053t = dVar2;
            this.f40045p = bVar.f40113t;
            this.L = bVar.f40114u;
            this.f40055u = bVar.f40115v;
            this.f40057v = bVar.f40116w;
            this.N = bVar.A;
            Looper looper = bVar.f40103j;
            this.f40051s = looper;
            ts.d dVar3 = bVar.f40095b;
            this.f40059w = dVar3;
            v1 v1Var2 = v1Var == null ? this : v1Var;
            this.f40025f = v1Var2;
            this.f40037l = new ts.t<>(looper, dVar3, new ts.t.b() { // from class: com.google.android.exoplayer2.s
                @Override // ts.t.b
                public final void a(Object obj, ts.o oVar) {
                    ((v1.d) obj).onEvents(this.f40315a.f40025f, new v1.c(oVar));
                }
            });
            this.f40039m = new CopyOnWriteArraySet<>();
            this.f40043o = new ArrayList();
            this.M = new es.r.a(0);
            qs.b0 b0Var = new qs.b0(new br.j0[z1VarArrA.length], new qs.r[z1VarArrA.length], g2.f39962b, null);
            this.f40017b = b0Var;
            this.f40041n = new f2.b();
            v1.b bVarE = new v1.b.a().c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 24, 27, 28, 32).d(29, a0Var.h()).d(23, bVar.f40110q).d(25, bVar.f40110q).d(33, bVar.f40110q).d(26, bVar.f40110q).d(34, bVar.f40110q).e();
            this.f40019c = bVarE;
            this.O = new v1.b.a().b(bVarE).a(4).a(10).e();
            this.f40031i = dVar3.c(looper, null);
            t0.f fVar = new t0.f() { // from class: com.google.android.exoplayer2.t
                @Override // com.google.android.exoplayer2.t0.f
                public final void a(t0.e eVar) {
                    i0 i0Var = this.f40608a;
                    i0Var.f40031i.g(new Runnable() { // from class: com.google.android.exoplayer2.y
                        @Override // java.lang.Runnable
                        public final void run() {
                            i0Var.E1(eVar);
                        }
                    });
                }
            };
            this.f40033j = fVar;
            this.f40052s0 = t1.k(b0Var);
            aVarApply.t(v1Var2, looper);
            int i11 = ts.p0.f115040a;
            t0 t0Var = new t0(z1VarArrA, a0Var, b0Var, bVar.f40100g.get(), dVar2, this.F, this.G, aVarApply, this.L, bVar.f40117x, bVar.f40118y, this.N, looper, dVar3, fVar, i11 < 31 ? new cr.q1() : b.a(applicationContext, this, bVar.B), bVar.C);
            this.f40035k = t0Var;
            this.f40030h0 = 1.0f;
            this.F = 0;
            y0 y0Var = y0.I;
            this.P = y0Var;
            this.Q = y0Var;
            this.f40050r0 = y0Var;
            this.f40054t0 = -1;
            if (i11 < 21) {
                this.f40026f0 = F1(0);
            } else {
                this.f40026f0 = ts.p0.E(applicationContext);
            }
            this.f40034j0 = gs.f.f69507c;
            this.f40036k0 = true;
            I0(aVarApply);
            dVar2.g(new Handler(looper), aVarApply);
            n1(cVar);
            long j11 = bVar.f40096c;
            if (j11 > 0) {
                t0Var.t(j11);
            }
            com.google.android.exoplayer2.b bVar2 = new com.google.android.exoplayer2.b(bVar.f40094a, handler, cVar);
            this.f40062z = bVar2;
            bVar2.b(bVar.f40108o);
            com.google.android.exoplayer2.d dVar4 = new com.google.android.exoplayer2.d(bVar.f40094a, handler, cVar);
            this.A = dVar4;
            dVar4.m(bVar.f40106m ? this.f40028g0 : null);
            if (bVar.f40110q) {
                c2 c2Var = new c2(bVar.f40094a, handler, cVar);
                this.B = c2Var;
                c2Var.h(ts.p0.e0(this.f40028g0.f39511c));
            } else {
                this.B = null;
            }
            h2 h2Var = new h2(bVar.f40094a);
            this.C = h2Var;
            h2Var.a(bVar.f40107n != 0);
            i2 i2Var = new i2(bVar.f40094a);
            this.D = i2Var;
            i2Var.a(bVar.f40107n == 2);
            this.f40046p0 = s1(this.B);
            this.f40048q0 = us.z.f116707e;
            this.f40020c0 = ts.g0.f114998c;
            a0Var.l(this.f40028g0);
            M1(1, 10, Integer.valueOf(this.f40026f0));
            M1(2, 10, Integer.valueOf(this.f40026f0));
            M1(1, 3, this.f40028g0);
            M1(2, 4, Integer.valueOf(this.f40016a0));
            M1(2, 5, Integer.valueOf(this.f40018b0));
            M1(1, 9, Boolean.valueOf(this.f40032i0));
            M1(2, 7, dVar);
            M1(6, 8, dVar);
            gVar.e();
        } catch (Throwable th2) {
            this.f40021d.e();
            throw th2;
        }
    }

    public static /* synthetic */ void A0(t1 t1Var, v1.d dVar) {
        dVar.onLoadingChanged(t1Var.f40671g);
        dVar.onIsLoadingChanged(t1Var.f40671g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int A1(boolean z11, int i11) {
        return (!z11 || i11 == 1) ? 1 : 2;
    }

    private v1.e B1(long j11) {
        Object obj;
        int iF;
        x0 x0Var;
        Object obj2;
        int iR = R();
        if (this.f40052s0.f40665a.u()) {
            obj = null;
            iF = -1;
            x0Var = null;
            obj2 = null;
        } else {
            t1 t1Var = this.f40052s0;
            Object obj3 = t1Var.f40666b.f63157a;
            t1Var.f40665a.l(obj3, this.f40041n);
            iF = this.f40052s0.f40665a.f(obj3);
            obj2 = obj3;
            obj = this.f40052s0.f40665a.r(iR, this.f39851a).f39942a;
            x0Var = this.f39851a.f39944c;
        }
        int i11 = iF;
        long jZ0 = ts.p0.Z0(j11);
        long jZ1 = this.f40052s0.f40666b.b() ? ts.p0.Z0(D1(this.f40052s0)) : jZ0;
        com.google.android.exoplayer2.source.o.b bVar = this.f40052s0.f40666b;
        return new v1.e(obj, iR, x0Var, obj2, i11, jZ0, jZ1, bVar.f63158b, bVar.f63159c);
    }

    private v1.e C1(int i11, t1 t1Var, int i12) {
        int i13;
        Object obj;
        x0 x0Var;
        Object obj2;
        int i14;
        long jD1;
        long jD2;
        f2.b bVar = new f2.b();
        if (t1Var.f40665a.u()) {
            i13 = i12;
            obj = null;
            x0Var = null;
            obj2 = null;
            i14 = -1;
        } else {
            Object obj3 = t1Var.f40666b.f63157a;
            t1Var.f40665a.l(obj3, bVar);
            int i15 = bVar.f39924c;
            int iF = t1Var.f40665a.f(obj3);
            Object obj4 = t1Var.f40665a.r(i15, this.f39851a).f39942a;
            x0Var = this.f39851a.f39944c;
            obj2 = obj3;
            i14 = iF;
            obj = obj4;
            i13 = i15;
        }
        if (i11 == 0) {
            if (t1Var.f40666b.b()) {
                com.google.android.exoplayer2.source.o.b bVar2 = t1Var.f40666b;
                jD1 = bVar.e(bVar2.f63158b, bVar2.f63159c);
                jD2 = D1(t1Var);
            } else {
                jD1 = t1Var.f40666b.f63161e != -1 ? D1(this.f40052s0) : bVar.f39926e + bVar.f39925d;
                jD2 = jD1;
            }
        } else if (t1Var.f40666b.b()) {
            jD1 = t1Var.f40682r;
            jD2 = D1(t1Var);
        } else {
            jD1 = bVar.f39926e + t1Var.f40682r;
            jD2 = jD1;
        }
        long jZ0 = ts.p0.Z0(jD1);
        long jZ1 = ts.p0.Z0(jD2);
        com.google.android.exoplayer2.source.o.b bVar3 = t1Var.f40666b;
        return new v1.e(obj, i13, x0Var, obj2, i14, jZ0, jZ1, bVar3.f63158b, bVar3.f63159c);
    }

    private static long D1(t1 t1Var) {
        f2.d dVar = new f2.d();
        f2.b bVar = new f2.b();
        t1Var.f40665a.l(t1Var.f40666b.f63157a, bVar);
        return t1Var.f40667c == -9223372036854775807L ? t1Var.f40665a.r(bVar.f39924c, dVar).e() : bVar.q() + t1Var.f40667c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E1(t0.e eVar) {
        long jJ1;
        int i11 = this.H - eVar.f40650c;
        this.H = i11;
        boolean z11 = true;
        if (eVar.f40651d) {
            this.I = eVar.f40652e;
            this.J = true;
        }
        if (eVar.f40653f) {
            this.K = eVar.f40654g;
        }
        if (i11 == 0) {
            f2 f2Var = eVar.f40649b.f40665a;
            if (!this.f40052s0.f40665a.u() && f2Var.u()) {
                this.f40054t0 = -1;
                this.f40058v0 = 0L;
                this.f40056u0 = 0;
            }
            if (!f2Var.u()) {
                List<f2> listJ = ((x1) f2Var).J();
                ts.a.g(listJ.size() == this.f40043o.size());
                for (int i12 = 0; i12 < listJ.size(); i12++) {
                    this.f40043o.get(i12).f40069b = listJ.get(i12);
                }
            }
            long j11 = -9223372036854775807L;
            if (this.J) {
                if (eVar.f40649b.f40666b.equals(this.f40052s0.f40666b) && eVar.f40649b.f40668d == this.f40052s0.f40682r) {
                    z11 = false;
                }
                if (z11) {
                    if (f2Var.u() || eVar.f40649b.f40666b.b()) {
                        jJ1 = eVar.f40649b.f40668d;
                    } else {
                        t1 t1Var = eVar.f40649b;
                        jJ1 = J1(f2Var, t1Var.f40666b, t1Var.f40668d);
                    }
                    j11 = jJ1;
                }
            } else {
                z11 = false;
            }
            this.J = false;
            Y1(eVar.f40649b, 1, this.K, z11, this.I, j11, -1, false);
        }
    }

    private int F1(int i11) {
        AudioTrack audioTrack = this.T;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i11) {
            this.T.release();
            this.T = null;
        }
        if (this.T == null) {
            this.T = new AudioTrack(3, 4000, 4, 2, 2, 0, i11);
        }
        return this.T.getAudioSessionId();
    }

    private t1 G1(t1 t1Var, f2 f2Var, Pair<Object, Long> pair) {
        ts.a.a(f2Var.u() || pair != null);
        f2 f2Var2 = t1Var.f40665a;
        long jX1 = x1(t1Var);
        t1 t1VarJ = t1Var.j(f2Var);
        if (f2Var.u()) {
            com.google.android.exoplayer2.source.o.b bVarL = t1.l();
            long jD0 = ts.p0.D0(this.f40058v0);
            t1 t1VarC = t1VarJ.d(bVarL, jD0, jD0, jD0, 0L, es.w.f63210d, this.f40017b, com.google.common.collect.x.r()).c(bVarL);
            t1VarC.f40680p = t1VarC.f40682r;
            return t1VarC;
        }
        Object obj = t1VarJ.f40666b.f63157a;
        boolean zEquals = obj.equals(((Pair) ts.p0.j(pair)).first);
        com.google.android.exoplayer2.source.o.b bVar = !zEquals ? new com.google.android.exoplayer2.source.o.b(pair.first) : t1VarJ.f40666b;
        long jLongValue = ((Long) pair.second).longValue();
        long jD1 = ts.p0.D0(jX1);
        if (!f2Var2.u()) {
            jD1 -= f2Var2.l(obj, this.f40041n).q();
        }
        if (!zEquals || jLongValue < jD1) {
            com.google.android.exoplayer2.source.o.b bVar2 = bVar;
            ts.a.g(!bVar2.b());
            t1 t1VarC2 = t1VarJ.d(bVar2, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? es.w.f63210d : t1VarJ.f40672h, !zEquals ? this.f40017b : t1VarJ.f40673i, !zEquals ? com.google.common.collect.x.r() : t1VarJ.f40674j).c(bVar2);
            t1VarC2.f40680p = jLongValue;
            return t1VarC2;
        }
        if (jLongValue != jD1) {
            com.google.android.exoplayer2.source.o.b bVar3 = bVar;
            ts.a.g(!bVar3.b());
            long jMax = Math.max(0L, t1VarJ.f40681q - (jLongValue - jD1));
            long j11 = t1VarJ.f40680p;
            if (t1VarJ.f40675k.equals(t1VarJ.f40666b)) {
                j11 = jLongValue + jMax;
            }
            t1 t1VarD = t1VarJ.d(bVar3, jLongValue, jLongValue, jLongValue, jMax, t1VarJ.f40672h, t1VarJ.f40673i, t1VarJ.f40674j);
            t1VarD.f40680p = j11;
            return t1VarD;
        }
        int iF = f2Var.f(t1VarJ.f40675k.f63157a);
        if (iF != -1 && f2Var.j(iF, this.f40041n).f39924c == f2Var.l(bVar.f63157a, this.f40041n).f39924c) {
            return t1VarJ;
        }
        f2Var.l(bVar.f63157a, this.f40041n);
        long jE = bVar.b() ? this.f40041n.e(bVar.f63158b, bVar.f63159c) : this.f40041n.f39925d;
        com.google.android.exoplayer2.source.o.b bVar4 = bVar;
        t1 t1VarC3 = t1VarJ.d(bVar4, t1VarJ.f40682r, t1VarJ.f40682r, t1VarJ.f40668d, jE - t1VarJ.f40682r, t1VarJ.f40672h, t1VarJ.f40673i, t1VarJ.f40674j).c(bVar4);
        t1VarC3.f40680p = jE;
        return t1VarC3;
    }

    private Pair<Object, Long> H1(f2 f2Var, int i11, long j11) {
        if (f2Var.u()) {
            this.f40054t0 = i11;
            if (j11 == -9223372036854775807L) {
                j11 = 0;
            }
            this.f40058v0 = j11;
            this.f40056u0 = 0;
            return null;
        }
        if (i11 == -1 || i11 >= f2Var.t()) {
            i11 = f2Var.e(this.G);
            j11 = f2Var.r(i11, this.f39851a).d();
        }
        return f2Var.n(this.f39851a, this.f40041n, i11, ts.p0.D0(j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I1(final int i11, final int i12) {
        if (i11 == this.f40020c0.b() && i12 == this.f40020c0.a()) {
            return;
        }
        this.f40020c0 = new ts.g0(i11, i12);
        this.f40037l.k(24, new ts.t.a() { // from class: com.google.android.exoplayer2.v
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((v1.d) obj).onSurfaceSizeChanged(i11, i12);
            }
        });
        M1(2, 14, new ts.g0(i11, i12));
    }

    private long J1(f2 f2Var, com.google.android.exoplayer2.source.o.b bVar, long j11) {
        f2Var.l(bVar.f63157a, this.f40041n);
        return j11 + this.f40041n.q();
    }

    private void K1(int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            this.f40043o.remove(i13);
        }
        this.M = this.M.f(i11, i12);
    }

    private void L1() {
        if (this.X != null) {
            u1(this.f40061y).n(10000).m(null).l();
            this.X.g(this.f40060x);
            this.X = null;
        }
        TextureView textureView = this.Z;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f40060x) {
                ts.u.i("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.Z.setSurfaceTextureListener(null);
            }
            this.Z = null;
        }
        SurfaceHolder surfaceHolder = this.W;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f40060x);
            this.W = null;
        }
    }

    private void M1(int i11, int i12, Object obj) {
        for (z1 z1Var : this.f40027g) {
            if (z1Var.c() == i11) {
                u1(z1Var).n(i12).m(obj).l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N1() {
        M1(1, 2, Float.valueOf(this.f40030h0 * this.A.g()));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    private void Q1(List<com.google.android.exoplayer2.source.o> list, int i11, long j11, boolean z11) {
        long j12;
        int i12;
        int i13;
        t1 t1VarH;
        boolean z12;
        int iE = i11;
        int iZ1 = z1(this.f40052s0);
        long jD = D();
        this.H++;
        if (!this.f40043o.isEmpty()) {
            K1(0, this.f40043o.size());
        }
        List<q1.c> listO1 = o1(0, list);
        f2 f2VarT1 = t1();
        if (!f2VarT1.u() && iE >= f2VarT1.t()) {
            throw new IllegalSeekPositionException(f2VarT1, iE, j11);
        }
        if (!z11) {
            if (iE == -1) {
                i12 = iZ1;
                j12 = jD;
            } else {
                j12 = j11;
            }
            t1 t1VarG1 = G1(this.f40052s0, f2VarT1, H1(f2VarT1, i12, j12));
            i13 = t1VarG1.f40669e;
            if (i12 != -1 && i13 != 1) {
                if (!f2VarT1.u() || i12 >= f2VarT1.t()) {
                    i13 = 4;
                } else {
                    i13 = 2;
                }
            }
            t1VarH = t1VarG1.h(i13);
            this.f40035k.L0(listO1, i12, ts.p0.D0(j12), this.M);
            if (!this.f40052s0.f40666b.f63157a.equals(t1VarH.f40666b.f63157a) || this.f40052s0.f40665a.u()) {
                z12 = false;
            } else {
                z12 = true;
            }
            Y1(t1VarH, 0, 1, z12, 4, y1(t1VarH), -1, false);
        }
        iE = f2VarT1.e(this.G);
        j12 = -9223372036854775807L;
        i12 = iE;
        t1 t1VarG2 = G1(this.f40052s0, f2VarT1, H1(f2VarT1, i12, j12));
        i13 = t1VarG2.f40669e;
        if (i12 != -1) {
            if (f2VarT1.u()) {
                i13 = 4;
            } else {
                i13 = 4;
            }
        }
        t1VarH = t1VarG2.h(i13);
        this.f40035k.L0(listO1, i12, ts.p0.D0(j12), this.M);
        if (this.f40052s0.f40666b.f63157a.equals(t1VarH.f40666b.f63157a)) {
            z12 = false;
        } else {
            z12 = false;
        }
        Y1(t1VarH, 0, 1, z12, 4, y1(t1VarH), -1, false);
    }

    private void R1(SurfaceHolder surfaceHolder) {
        this.Y = false;
        this.W = surfaceHolder;
        surfaceHolder.addCallback(this.f40060x);
        Surface surface = this.W.getSurface();
        if (surface == null || !surface.isValid()) {
            I1(0, 0);
        } else {
            Rect surfaceFrame = this.W.getSurfaceFrame();
            I1(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S1(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        T1(surface);
        this.V = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T1(Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        for (z1 z1Var : this.f40027g) {
            if (z1Var.c() == 2) {
                arrayList.add(u1(z1Var).n(1).m(obj).l());
            }
        }
        Object obj2 = this.U;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((w1) it.next()).a(this.E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z11 = true;
            }
            Object obj3 = this.U;
            Surface surface = this.V;
            if (obj3 == surface) {
                surface.release();
                this.V = null;
            }
        }
        this.U = obj;
        if (z11) {
            V1(ExoPlaybackException.i(new ExoTimeoutException(3), 1003));
        }
    }

    private void V1(ExoPlaybackException exoPlaybackException) {
        t1 t1Var = this.f40052s0;
        t1 t1VarC = t1Var.c(t1Var.f40666b);
        t1VarC.f40680p = t1VarC.f40682r;
        t1VarC.f40681q = 0L;
        t1 t1VarH = t1VarC.h(1);
        if (exoPlaybackException != null) {
            t1VarH = t1VarH.f(exoPlaybackException);
        }
        this.H++;
        this.f40035k.f1();
        Y1(t1VarH, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    private void W1() {
        v1.b bVar = this.O;
        v1.b bVarG = ts.p0.G(this.f40025f, this.f40019c);
        this.O = bVarG;
        if (bVarG.equals(bVar)) {
            return;
        }
        this.f40037l.h(13, new ts.t.a() { // from class: com.google.android.exoplayer2.z
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((v1.d) obj).onAvailableCommandsChanged(this.f41388a.O);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X1(boolean z11, int i11, int i12) {
        int i13 = 0;
        boolean z12 = z11 && i11 != -1;
        if (z12 && i11 != 1) {
            i13 = 1;
        }
        t1 t1VarA = this.f40052s0;
        if (t1VarA.f40676l == z12 && t1VarA.f40677m == i13) {
            return;
        }
        this.H++;
        if (t1VarA.f40679o) {
            t1VarA = t1VarA.a();
        }
        t1 t1VarE = t1VarA.e(z12, i13);
        this.f40035k.O0(z12, i13);
        Y1(t1VarE, 0, i12, false, 5, -9223372036854775807L, -1, false);
    }

    private void Y1(final t1 t1Var, final int i11, final int i12, boolean z11, final int i13, long j11, int i14, boolean z12) {
        t1 t1Var2 = this.f40052s0;
        this.f40052s0 = t1Var;
        boolean zEquals = t1Var2.f40665a.equals(t1Var.f40665a);
        Pair<Boolean, Integer> pairV1 = v1(t1Var, t1Var2, z11, i13, !zEquals, z12);
        boolean zBooleanValue = ((Boolean) pairV1.first).booleanValue();
        final int iIntValue = ((Integer) pairV1.second).intValue();
        y0 y0VarP1 = this.P;
        final x0 x0Var = null;
        if (zBooleanValue) {
            if (!t1Var.f40665a.u()) {
                x0Var = t1Var.f40665a.r(t1Var.f40665a.l(t1Var.f40666b.f63157a, this.f40041n).f39924c, this.f39851a).f39944c;
            }
            this.f40050r0 = y0.I;
        }
        if (zBooleanValue || !t1Var2.f40674j.equals(t1Var.f40674j)) {
            this.f40050r0 = this.f40050r0.b().K(t1Var.f40674j).H();
            y0VarP1 = p1();
        }
        boolean zEquals2 = y0VarP1.equals(this.P);
        this.P = y0VarP1;
        boolean z13 = t1Var2.f40676l != t1Var.f40676l;
        boolean z14 = t1Var2.f40669e != t1Var.f40669e;
        if (z14 || z13) {
            a2();
        }
        boolean z15 = t1Var2.f40671g;
        boolean z16 = t1Var.f40671g;
        boolean z17 = z15 != z16;
        if (z17) {
            Z1(z16);
        }
        if (!zEquals) {
            this.f40037l.h(0, new ts.t.a() { // from class: com.google.android.exoplayer2.l
                @Override // ts.t.a
                public final void invoke(Object obj) {
                    v1.d dVar = (v1.d) obj;
                    dVar.onTimelineChanged(t1Var.f40665a, i11);
                }
            });
        }
        if (z11) {
            final v1.e eVarC1 = C1(i13, t1Var2, i14);
            final v1.e eVarB1 = B1(j11);
            this.f40037l.h(11, new ts.t.a() { // from class: com.google.android.exoplayer2.d0
                @Override // ts.t.a
                public final void invoke(Object obj) {
                    i0.s0(i13, eVarC1, eVarB1, (v1.d) obj);
                }
            });
        }
        if (zBooleanValue) {
            this.f40037l.h(1, new ts.t.a() { // from class: com.google.android.exoplayer2.e0
                @Override // ts.t.a
                public final void invoke(Object obj) {
                    ((v1.d) obj).onMediaItemTransition(x0Var, iIntValue);
                }
            });
        }
        if (t1Var2.f40670f != t1Var.f40670f) {
            this.f40037l.h(10, new ts.t.a() { // from class: com.google.android.exoplayer2.f0
                @Override // ts.t.a
                public final void invoke(Object obj) {
                    ((v1.d) obj).onPlayerErrorChanged(t1Var.f40670f);
                }
            });
            if (t1Var.f40670f != null) {
                this.f40037l.h(10, new ts.t.a() { // from class: com.google.android.exoplayer2.g0
                    @Override // ts.t.a
                    public final void invoke(Object obj) {
                        ((v1.d) obj).onPlayerError(t1Var.f40670f);
                    }
                });
            }
        }
        qs.b0 b0Var = t1Var2.f40673i;
        qs.b0 b0Var2 = t1Var.f40673i;
        if (b0Var != b0Var2) {
            this.f40029h.i(b0Var2.f105962e);
            this.f40037l.h(2, new ts.t.a() { // from class: com.google.android.exoplayer2.h0
                @Override // ts.t.a
                public final void invoke(Object obj) {
                    ((v1.d) obj).onTracksChanged(t1Var.f40673i.f105961d);
                }
            });
        }
        if (!zEquals2) {
            final y0 y0Var = this.P;
            this.f40037l.h(14, new ts.t.a() { // from class: com.google.android.exoplayer2.m
                @Override // ts.t.a
                public final void invoke(Object obj) {
                    ((v1.d) obj).onMediaMetadataChanged(y0Var);
                }
            });
        }
        if (z17) {
            this.f40037l.h(3, new ts.t.a() { // from class: com.google.android.exoplayer2.n
                @Override // ts.t.a
                public final void invoke(Object obj) {
                    i0.A0(t1Var, (v1.d) obj);
                }
            });
        }
        if (z14 || z13) {
            this.f40037l.h(-1, new ts.t.a() { // from class: com.google.android.exoplayer2.o
                @Override // ts.t.a
                public final void invoke(Object obj) {
                    t1 t1Var3 = t1Var;
                    ((v1.d) obj).onPlayerStateChanged(t1Var3.f40676l, t1Var3.f40669e);
                }
            });
        }
        if (z14) {
            this.f40037l.h(4, new ts.t.a() { // from class: com.google.android.exoplayer2.p
                @Override // ts.t.a
                public final void invoke(Object obj) {
                    ((v1.d) obj).onPlaybackStateChanged(t1Var.f40669e);
                }
            });
        }
        if (z13) {
            this.f40037l.h(5, new ts.t.a() { // from class: com.google.android.exoplayer2.w
                @Override // ts.t.a
                public final void invoke(Object obj) {
                    v1.d dVar = (v1.d) obj;
                    dVar.onPlayWhenReadyChanged(t1Var.f40676l, i12);
                }
            });
        }
        if (t1Var2.f40677m != t1Var.f40677m) {
            this.f40037l.h(6, new ts.t.a() { // from class: com.google.android.exoplayer2.a0
                @Override // ts.t.a
                public final void invoke(Object obj) {
                    ((v1.d) obj).onPlaybackSuppressionReasonChanged(t1Var.f40677m);
                }
            });
        }
        if (t1Var2.n() != t1Var.n()) {
            this.f40037l.h(7, new ts.t.a() { // from class: com.google.android.exoplayer2.b0
                @Override // ts.t.a
                public final void invoke(Object obj) {
                    ((v1.d) obj).onIsPlayingChanged(t1Var.n());
                }
            });
        }
        if (!t1Var2.f40678n.equals(t1Var.f40678n)) {
            this.f40037l.h(12, new ts.t.a() { // from class: com.google.android.exoplayer2.c0
                @Override // ts.t.a
                public final void invoke(Object obj) {
                    ((v1.d) obj).onPlaybackParametersChanged(t1Var.f40678n);
                }
            });
        }
        W1();
        this.f40037l.f();
        if (t1Var2.f40679o != t1Var.f40679o) {
            Iterator<k.a> it = this.f40039m.iterator();
            while (it.hasNext()) {
                it.next().y(t1Var.f40679o);
            }
        }
    }

    private void Z1(boolean z11) {
        PriorityTaskManager priorityTaskManager = this.f40040m0;
        if (priorityTaskManager != null) {
            if (z11 && !this.f40042n0) {
                priorityTaskManager.a(0);
                this.f40042n0 = true;
            } else {
                if (z11 || !this.f40042n0) {
                    return;
                }
                priorityTaskManager.b(0);
                this.f40042n0 = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a2() {
        int iG = g();
        boolean z11 = false;
        if (iG != 1) {
            if (iG == 2 || iG == 3) {
                boolean zW1 = w1();
                h2 h2Var = this.C;
                if (t() && !zW1) {
                    z11 = true;
                }
                h2Var.b(z11);
                this.D.b(t());
                return;
            }
            if (iG != 4) {
                throw new IllegalStateException();
            }
        }
        this.C.b(false);
        this.D.b(false);
    }

    private void b2() {
        this.f40021d.b();
        if (Thread.currentThread() != F0().getThread()) {
            String strB = ts.p0.B("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), F0().getThread().getName());
            if (this.f40036k0) {
                throw new IllegalStateException(strB);
            }
            ts.u.j("ExoPlayerImpl", strB, this.f40038l0 ? null : new IllegalStateException());
            this.f40038l0 = true;
        }
    }

    private List<q1.c> o1(int i11, List<com.google.android.exoplayer2.source.o> list) {
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            q1.c cVar = new q1.c(list.get(i12), this.f40045p);
            arrayList.add(cVar);
            this.f40043o.add(i12 + i11, new e(cVar.f40307b, cVar.f40306a.T()));
        }
        this.M = this.M.g(i11, arrayList.size());
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public y0 p1() {
        f2 f2VarJ = J();
        if (f2VarJ.u()) {
            return this.f40050r0;
        }
        return this.f40050r0.b().J(f2VarJ.r(R(), this.f39851a).f39944c.f41170e).H();
    }

    public static /* synthetic */ void s0(int i11, v1.e eVar, v1.e eVar2, v1.d dVar) {
        dVar.onPositionDiscontinuity(i11);
        dVar.onPositionDiscontinuity(eVar, eVar2, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j s1(c2 c2Var) {
        return new j.b(0).g(c2Var != null ? c2Var.d() : 0).f(c2Var != null ? c2Var.c() : 0).e();
    }

    private f2 t1() {
        return new x1(this.f40043o, this.M);
    }

    private w1 u1(w1.b bVar) {
        int iZ1 = z1(this.f40052s0);
        t0 t0Var = this.f40035k;
        f2 f2Var = this.f40052s0.f40665a;
        if (iZ1 == -1) {
            iZ1 = 0;
        }
        return new w1(t0Var, bVar, f2Var, iZ1, this.f40059w, t0Var.A());
    }

    private Pair<Boolean, Integer> v1(t1 t1Var, t1 t1Var2, boolean z11, int i11, boolean z12, boolean z13) {
        f2 f2Var = t1Var2.f40665a;
        f2 f2Var2 = t1Var.f40665a;
        if (f2Var2.u() && f2Var.u()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i12 = 3;
        if (f2Var2.u() != f2Var.u()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (f2Var.r(f2Var.l(t1Var2.f40666b.f63157a, this.f40041n).f39924c, this.f39851a).f39942a.equals(f2Var2.r(f2Var2.l(t1Var.f40666b.f63157a, this.f40041n).f39924c, this.f39851a).f39942a)) {
            if (z11 && i11 == 0 && t1Var2.f40666b.f63160d < t1Var.f40666b.f63160d) {
                return new Pair<>(Boolean.TRUE, 0);
            }
            return (z11 && i11 == 1 && z13) ? new Pair<>(Boolean.TRUE, 2) : new Pair<>(Boolean.FALSE, -1);
        }
        if (z11 && i11 == 0) {
            i12 = 1;
        } else if (z11 && i11 == 1) {
            i12 = 2;
        } else if (!z12) {
            throw new IllegalStateException();
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i12));
    }

    private long x1(t1 t1Var) {
        if (!t1Var.f40666b.b()) {
            return ts.p0.Z0(y1(t1Var));
        }
        t1Var.f40665a.l(t1Var.f40666b.f63157a, this.f40041n);
        return t1Var.f40667c == -9223372036854775807L ? t1Var.f40665a.r(z1(t1Var), this.f39851a).d() : this.f40041n.p() + ts.p0.Z0(t1Var.f40667c);
    }

    private long y1(t1 t1Var) {
        if (t1Var.f40665a.u()) {
            return ts.p0.D0(this.f40058v0);
        }
        long jM = t1Var.f40679o ? t1Var.m() : t1Var.f40682r;
        return t1Var.f40666b.b() ? jM : J1(t1Var.f40665a, t1Var.f40666b, jM);
    }

    private int z1(t1 t1Var) {
        return t1Var.f40665a.u() ? this.f40054t0 : t1Var.f40665a.l(t1Var.f40666b.f63157a, this.f40041n).f39924c;
    }

    @Override // com.google.android.exoplayer2.v1
    public long A() {
        b2();
        return this.f40057v;
    }

    @Override // com.google.android.exoplayer2.v1
    public long B() {
        b2();
        if (this.f40052s0.f40665a.u()) {
            return this.f40058v0;
        }
        t1 t1Var = this.f40052s0;
        if (t1Var.f40675k.f63160d != t1Var.f40666b.f63160d) {
            return t1Var.f40665a.r(R(), this.f39851a).f();
        }
        long j11 = t1Var.f40680p;
        if (this.f40052s0.f40675k.b()) {
            t1 t1Var2 = this.f40052s0;
            f2.b bVarL = t1Var2.f40665a.l(t1Var2.f40675k.f63157a, this.f40041n);
            long jI = bVarL.i(this.f40052s0.f40675k.f63158b);
            j11 = jI == Long.MIN_VALUE ? bVarL.f39925d : jI;
        }
        t1 t1Var3 = this.f40052s0;
        return ts.p0.Z0(J1(t1Var3.f40665a, t1Var3.f40675k, j11));
    }

    @Override // com.google.android.exoplayer2.v1
    public long D() {
        b2();
        return ts.p0.Z0(y1(this.f40052s0));
    }

    @Override // com.google.android.exoplayer2.v1
    public Looper F0() {
        return this.f40051s;
    }

    @Override // com.google.android.exoplayer2.v1
    public void G(boolean z11) {
        b2();
        int iP = this.A.p(z11, g());
        X1(z11, iP, A1(z11, iP));
    }

    @Override // com.google.android.exoplayer2.v1
    public void G0(v1.d dVar) {
        b2();
        this.f40037l.j((v1.d) ts.a.e(dVar));
    }

    @Override // com.google.android.exoplayer2.v1
    public gs.f H() {
        b2();
        return this.f40034j0;
    }

    @Override // com.google.android.exoplayer2.v1
    public void H0(final qs.y yVar) {
        b2();
        if (!this.f40029h.h() || yVar.equals(this.f40029h.c())) {
            return;
        }
        this.f40029h.m(yVar);
        this.f40037l.k(19, new ts.t.a() { // from class: com.google.android.exoplayer2.x
            @Override // ts.t.a
            public final void invoke(Object obj) {
                ((v1.d) obj).onTrackSelectionParametersChanged(yVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.v1
    public int I() {
        b2();
        return this.f40052s0.f40677m;
    }

    @Override // com.google.android.exoplayer2.v1
    public void I0(v1.d dVar) {
        this.f40037l.c((v1.d) ts.a.e(dVar));
    }

    @Override // com.google.android.exoplayer2.v1
    public f2 J() {
        b2();
        return this.f40052s0.f40665a;
    }

    @Override // com.google.android.exoplayer2.v1
    public void L(TextureView textureView) {
        b2();
        if (textureView == null) {
            q1();
            return;
        }
        L1();
        this.Z = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            ts.u.i("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f40060x);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            T1(null);
            I1(0, 0);
        } else {
            S1(surfaceTexture);
            I1(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // com.google.android.exoplayer2.v1
    public v1.b N() {
        b2();
        return this.O;
    }

    @Override // com.google.android.exoplayer2.v1
    public us.z O() {
        b2();
        return this.f40048q0;
    }

    public void O1(List<com.google.android.exoplayer2.source.o> list) {
        b2();
        P1(list, true);
    }

    public void P1(List<com.google.android.exoplayer2.source.o> list, boolean z11) {
        b2();
        Q1(list, -1, -9223372036854775807L, z11);
    }

    @Override // com.google.android.exoplayer2.v1
    public long Q() {
        b2();
        return x1(this.f40052s0);
    }

    @Override // com.google.android.exoplayer2.v1
    public int R() {
        b2();
        int iZ1 = z1(this.f40052s0);
        if (iZ1 == -1) {
            return 0;
        }
        return iZ1;
    }

    @Override // com.google.android.exoplayer2.v1
    public void S(SurfaceView surfaceView) {
        b2();
        r1(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // com.google.android.exoplayer2.v1
    public boolean T() {
        b2();
        return this.G;
    }

    public void U1(SurfaceHolder surfaceHolder) {
        b2();
        if (surfaceHolder == null) {
            q1();
            return;
        }
        L1();
        this.Y = true;
        this.W = surfaceHolder;
        surfaceHolder.addCallback(this.f40060x);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            T1(null);
            I1(0, 0);
        } else {
            T1(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            I1(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // com.google.android.exoplayer2.v1
    public y0 V() {
        b2();
        return this.P;
    }

    @Override // com.google.android.exoplayer2.v1
    public long W() {
        b2();
        return this.f40055u;
    }

    @Override // com.google.android.exoplayer2.e
    public void Z(int i11, long j11, int i12, boolean z11) {
        b2();
        ts.a.a(i11 >= 0);
        this.f40049r.x();
        f2 f2Var = this.f40052s0.f40665a;
        if (f2Var.u() || i11 < f2Var.t()) {
            this.H++;
            if (m()) {
                ts.u.i("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                t0.e eVar = new t0.e(this.f40052s0);
                eVar.b(1);
                this.f40033j.a(eVar);
                return;
            }
            t1 t1VarH = this.f40052s0;
            int i13 = t1VarH.f40669e;
            if (i13 == 3 || (i13 == 4 && !f2Var.u())) {
                t1VarH = this.f40052s0.h(2);
            }
            int iR = R();
            t1 t1VarG1 = G1(t1VarH, f2Var, H1(f2Var, i11, j11));
            this.f40035k.y0(f2Var, i11, ts.p0.D0(j11));
            Y1(t1VarG1, 0, 1, true, 1, y1(t1VarG1), iR, z11);
        }
    }

    @Override // com.google.android.exoplayer2.v1
    public void b() {
        b2();
        boolean zT = t();
        int iP = this.A.p(zT, 2);
        X1(zT, iP, A1(zT, iP));
        t1 t1Var = this.f40052s0;
        if (t1Var.f40669e != 1) {
            return;
        }
        t1 t1VarF = t1Var.f(null);
        t1 t1VarH = t1VarF.h(t1VarF.f40665a.u() ? 4 : 2);
        this.H++;
        this.f40035k.f0();
        Y1(t1VarH, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.exoplayer2.k
    public void c(com.google.android.exoplayer2.source.o oVar) {
        b2();
        O1(Collections.singletonList(oVar));
    }

    @Override // com.google.android.exoplayer2.v1
    public u1 e() {
        b2();
        return this.f40052s0.f40678n;
    }

    @Override // com.google.android.exoplayer2.v1
    public int g() {
        b2();
        return this.f40052s0.f40669e;
    }

    @Override // com.google.android.exoplayer2.v1
    public long getDuration() {
        b2();
        if (!m()) {
            return w();
        }
        t1 t1Var = this.f40052s0;
        com.google.android.exoplayer2.source.o.b bVar = t1Var.f40666b;
        t1Var.f40665a.l(bVar.f63157a, this.f40041n);
        return ts.p0.Z0(this.f40041n.e(bVar.f63158b, bVar.f63159c));
    }

    @Override // com.google.android.exoplayer2.v1
    public int h() {
        b2();
        return this.F;
    }

    @Override // com.google.android.exoplayer2.v1
    public void i(final int i11) {
        b2();
        if (this.F != i11) {
            this.F = i11;
            this.f40035k.S0(i11);
            this.f40037l.h(8, new ts.t.a() { // from class: com.google.android.exoplayer2.u
                @Override // ts.t.a
                public final void invoke(Object obj) {
                    ((v1.d) obj).onRepeatModeChanged(i11);
                }
            });
            W1();
            this.f40037l.f();
        }
    }

    @Override // com.google.android.exoplayer2.v1
    public void j(u1 u1Var) {
        b2();
        if (u1Var == null) {
            u1Var = u1.f40753d;
        }
        if (this.f40052s0.f40678n.equals(u1Var)) {
            return;
        }
        t1 t1VarG = this.f40052s0.g(u1Var);
        this.H++;
        this.f40035k.Q0(u1Var);
        Y1(t1VarG, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.exoplayer2.v1
    public boolean m() {
        b2();
        return this.f40052s0.f40666b.b();
    }

    public void m1(cr.b bVar) {
        this.f40049r.z((cr.b) ts.a.e(bVar));
    }

    @Override // com.google.android.exoplayer2.v1
    public long n() {
        b2();
        return ts.p0.Z0(this.f40052s0.f40681q);
    }

    public void n1(k.a aVar) {
        this.f40039m.add(aVar);
    }

    @Override // com.google.android.exoplayer2.v1
    public void o(SurfaceView surfaceView) {
        b2();
        if (surfaceView instanceof us.j) {
            L1();
            T1(surfaceView);
            R1(surfaceView.getHolder());
        } else {
            if (!(surfaceView instanceof vs.l)) {
                U1(surfaceView == null ? null : surfaceView.getHolder());
                return;
            }
            L1();
            this.X = (vs.l) surfaceView;
            u1(this.f40061y).n(10000).m(this.X).l();
            this.X.d(this.f40060x);
            T1(this.X.getVideoSurface());
            R1(surfaceView.getHolder());
        }
    }

    @Override // com.google.android.exoplayer2.v1
    public g2 p() {
        b2();
        return this.f40052s0.f40673i.f105961d;
    }

    public void q1() {
        b2();
        L1();
        T1(null);
        I1(0, 0);
    }

    @Override // com.google.android.exoplayer2.v1
    public int r() {
        b2();
        if (m()) {
            return this.f40052s0.f40666b.f63158b;
        }
        return -1;
    }

    public void r1(SurfaceHolder surfaceHolder) {
        b2();
        if (surfaceHolder == null || surfaceHolder != this.W) {
            return;
        }
        q1();
    }

    @Override // com.google.android.exoplayer2.v1
    public void release() {
        AudioTrack audioTrack;
        ts.u.f("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.19.1] [" + ts.p0.f115044e + "] [" + br.p.b() + "]");
        b2();
        if (ts.p0.f115040a < 21 && (audioTrack = this.T) != null) {
            audioTrack.release();
            this.T = null;
        }
        this.f40062z.b(false);
        c2 c2Var = this.B;
        if (c2Var != null) {
            c2Var.g();
        }
        this.C.b(false);
        this.D.b(false);
        this.A.i();
        if (!this.f40035k.h0()) {
            this.f40037l.k(10, new ts.t.a() { // from class: com.google.android.exoplayer2.r
                @Override // ts.t.a
                public final void invoke(Object obj) {
                    ((v1.d) obj).onPlayerError(ExoPlaybackException.i(new ExoTimeoutException(1), 1003));
                }
            });
        }
        this.f40037l.i();
        this.f40031i.d(null);
        this.f40053t.d(this.f40049r);
        t1 t1Var = this.f40052s0;
        if (t1Var.f40679o) {
            this.f40052s0 = t1Var.a();
        }
        t1 t1VarH = this.f40052s0.h(1);
        this.f40052s0 = t1VarH;
        t1 t1VarC = t1VarH.c(t1VarH.f40666b);
        this.f40052s0 = t1VarC;
        t1VarC.f40680p = t1VarC.f40682r;
        this.f40052s0.f40681q = 0L;
        this.f40049r.release();
        this.f40029h.j();
        L1();
        Surface surface = this.V;
        if (surface != null) {
            surface.release();
            this.V = null;
        }
        if (this.f40042n0) {
            ((PriorityTaskManager) ts.a.e(this.f40040m0)).b(0);
            this.f40042n0 = false;
        }
        this.f40034j0 = gs.f.f69507c;
        this.f40044o0 = true;
    }

    @Override // com.google.android.exoplayer2.v1
    public qs.y s() {
        b2();
        return this.f40029h.c();
    }

    @Override // com.google.android.exoplayer2.v1
    public boolean t() {
        b2();
        return this.f40052s0.f40676l;
    }

    @Override // com.google.android.exoplayer2.v1
    public void u(final boolean z11) {
        b2();
        if (this.G != z11) {
            this.G = z11;
            this.f40035k.V0(z11);
            this.f40037l.h(9, new ts.t.a() { // from class: com.google.android.exoplayer2.q
                @Override // ts.t.a
                public final void invoke(Object obj) {
                    ((v1.d) obj).onShuffleModeEnabledChanged(z11);
                }
            });
            W1();
            this.f40037l.f();
        }
    }

    @Override // com.google.android.exoplayer2.v1
    public long v() {
        b2();
        return 3000L;
    }

    public boolean w1() {
        b2();
        return this.f40052s0.f40679o;
    }

    @Override // com.google.android.exoplayer2.v1
    public int x() {
        b2();
        if (this.f40052s0.f40665a.u()) {
            return this.f40056u0;
        }
        t1 t1Var = this.f40052s0;
        return t1Var.f40665a.f(t1Var.f40666b.f63157a);
    }

    @Override // com.google.android.exoplayer2.v1
    public void y(TextureView textureView) {
        b2();
        if (textureView == null || textureView != this.Z) {
            return;
        }
        q1();
    }

    @Override // com.google.android.exoplayer2.v1
    public int z() {
        b2();
        if (m()) {
            return this.f40052s0.f40666b.f63159c;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.v1, com.google.android.exoplayer2.k
    public ExoPlaybackException a() {
        b2();
        return this.f40052s0.f40670f;
    }
}
