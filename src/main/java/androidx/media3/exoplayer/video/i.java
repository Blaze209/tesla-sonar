package androidx.media3.exoplayer.video;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil;
import com.google.common.collect.x;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import ou.y;
import p7.b1;
import p7.c1;
import p7.d1;
import p7.e1;
import p7.n0;
import p7.u;
import s7.e0;
import s7.h0;
import s7.p;
import s7.q0;
import s7.t;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements d1.b {
    private static final Executor B = new Executor() { // from class: u8.e
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            androidx.media3.exoplayer.video.i.a(runnable);
        }
    };
    private int A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f11239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d1.a f11240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray<d> f11241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f11242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final VideoSink f11243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final VideoSink.b f11244f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final s7.j f11245g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final CopyOnWriteArraySet<e> f11246h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private h0<h> f11247i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private u f11248j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private b1 f11249k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private x<Object> f11250l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private p f11251m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private d1 f11252n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private u8.k f11253o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f11254p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f11255q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f11256r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f11257s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Pair<Surface, e0> f11258t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f11259u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f11260v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f11261w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f11262x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f11263y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f11264z;

    class a implements VideoSink.b {
        a() {
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.b
        public void a() {
            ((d1) s7.a.j(i.this.f11252n)).a(-2L);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.b
        public void b(long j11) {
            ((d1) s7.a.j(i.this.f11252n)).a(j11);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f11266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l f11267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private d1.a f11268c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f11269d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private s7.j f11270e = s7.j.f110429a;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f11271f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f11272g;

        public b(Context context, l lVar) {
            this.f11266a = context.getApplicationContext();
            this.f11267b = lVar;
        }

        public i f() {
            s7.a.h(!this.f11271f);
            if (this.f11268c == null) {
                this.f11268c = new g(this.f11272g);
            }
            i iVar = new i(this, null);
            this.f11271f = true;
            return iVar;
        }

        public b g(s7.j jVar) {
            this.f11270e = jVar;
            return this;
        }

        public b h(boolean z11) {
            this.f11269d = z11;
            return this;
        }
    }

    private final class c implements VideoSink.a {
        private c() {
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.a
        public void b(e1 e1Var) {
            Iterator it = i.this.f11246h.iterator();
            while (it.hasNext()) {
                ((e) it.next()).b(e1Var);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.a
        public void c() {
            Iterator it = i.this.f11246h.iterator();
            while (it.hasNext()) {
                ((e) it.next()).c();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.a
        public void onFirstFrameRendered() {
            Iterator it = i.this.f11246h.iterator();
            while (it.hasNext()) {
                ((e) it.next()).onFirstFrameRendered();
            }
        }

        /* synthetic */ c(i iVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class d implements VideoSink, e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f11274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f11275b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private u f11277d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f11278e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f11279f;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f11283j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f11284k;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private x<Object> f11276c = x.r();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f11280g = -9223372036854775807L;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private VideoSink.a f11281h = VideoSink.a.f11182a;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Executor f11282i = i.B;

        public d(Context context, int i11) {
            this.f11275b = i11;
            this.f11274a = q0.n0(context);
        }

        private void f(u uVar) {
            ((d1) s7.a.f(i.this.f11252n)).c(this.f11275b, this.f11278e != 1 ? 2 : 1, uVar.b().V(i.this.E(uVar.E)).P(), this.f11276c, 0L);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void A(int i11, u uVar, long j11, int i12, List<Object> list) {
            s7.a.h(isInitialized());
            this.f11276c = x.n(list);
            this.f11278e = i11;
            this.f11277d = uVar;
            i.this.f11262x = -9223372036854775807L;
            i.this.f11263y = false;
            f(uVar);
            boolean z11 = this.f11280g == -9223372036854775807L;
            if (i.this.f11242d || (this.f11275b == 0 && z11)) {
                long j12 = z11 ? -4611686018427387904L : this.f11280g + 1;
                i.this.f11247i.a(j12, new h(this.f11279f + j11, i12, j12));
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void B() {
            i.this.C();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void C(boolean z11) {
            if (isInitialized()) {
                ((d1) s7.a.f(i.this.f11252n)).flush();
            }
            this.f11280g = -9223372036854775807L;
            i.this.D(z11);
            this.f11283j = false;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void D(boolean z11) {
            if (i.this.f11242d) {
                i.this.J(z11);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean E(u uVar) throws VideoSink.VideoSinkException {
            s7.a.h(!isInitialized());
            boolean zM = i.this.M(uVar, this.f11275b);
            this.f11284k = zM;
            return zM;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean a() {
            return isInitialized() && i.this.G();
        }

        @Override // androidx.media3.exoplayer.video.i.e
        public void b(final e1 e1Var) {
            final VideoSink.a aVar = this.f11281h;
            this.f11282i.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.j
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.b(e1Var);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.i.e
        public void c() {
            final VideoSink.a aVar = this.f11281h;
            Executor executor = this.f11282i;
            Objects.requireNonNull(aVar);
            executor.execute(new Runnable() { // from class: u8.g
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.c();
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void d(long j11, long j12) {
            i.this.O(j11 + this.f11279f, j12);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isInitialized() {
            return this.f11284k;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void l(float f11) {
            if (this.f11275b == 0) {
                i.this.R(f11);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public Surface m() {
            s7.a.h(isInitialized());
            return ((d1) s7.a.f(i.this.f11252n)).e(this.f11275b);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void n() {
            if (isInitialized()) {
                boolean z11 = this.f11283j;
                long j11 = i.this.f11261w;
                i.this.D(false);
                ((d1) s7.a.f(i.this.f11252n)).n();
                i.this.f11261w = j11;
                if (z11) {
                    o();
                }
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void o() {
            i.this.f11262x = this.f11280g;
            if (i.this.f11261w >= i.this.f11262x) {
                i.this.V();
            }
        }

        @Override // androidx.media3.exoplayer.video.i.e
        public void onFirstFrameRendered() {
            final VideoSink.a aVar = this.f11281h;
            Executor executor = this.f11282i;
            Objects.requireNonNull(aVar);
            executor.execute(new Runnable() { // from class: u8.h
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.onFirstFrameRendered();
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void p(u8.k kVar) {
            if (this.f11275b == 0) {
                i.this.T(kVar);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void q() {
            if (i.this.f11247i.l() == 0) {
                i.this.B();
                return;
            }
            h0 h0Var = new h0();
            boolean z11 = true;
            while (i.this.f11247i.l() > 0) {
                h hVar = (h) s7.a.f((h) i.this.f11247i.i());
                if (z11) {
                    int i11 = hVar.f11290b;
                    if (i11 == 0 || i11 == 1) {
                        hVar = new h(hVar.f11289a, 0, hVar.f11291c);
                    } else {
                        i.this.B();
                    }
                    z11 = false;
                }
                h0Var.a(hVar.f11291c, hVar);
            }
            i.this.f11247i = h0Var;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void r() {
            if (i.this.f11242d) {
                i.this.X();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void release() {
            i.this.N();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void s() {
            if (i.this.f11242d) {
                i.this.W();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void t(int i11) {
            if (this.f11275b == 0) {
                i.this.P(i11);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void u(VideoSink.a aVar, Executor executor) {
            this.f11281h = aVar;
            this.f11282i = executor;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean v(long j11, VideoSink.b bVar) {
            s7.a.h(isInitialized());
            if (!i.this.U() || ((d1) s7.a.f(i.this.f11252n)).g(this.f11275b) >= this.f11274a || !((d1) s7.a.f(i.this.f11252n)).b(this.f11275b)) {
                return false;
            }
            long j12 = j11 + this.f11279f;
            this.f11280g = j12;
            bVar.b(j12 * 1000);
            return true;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void w(Surface surface, e0 e0Var) {
            i.this.Q(surface, e0Var);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void x(long j11) {
            this.f11279f = j11;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void y(List<Object> list) {
            if (this.f11276c.equals(list)) {
                return;
            }
            this.f11276c = x.n(list);
            u uVar = this.f11277d;
            if (uVar != null) {
                f(uVar);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean z(boolean z11) {
            return i.this.I(z11 && isInitialized());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class f implements c1.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final ou.x<Class<?>> f11286b = y.a(new ou.x() { // from class: androidx.media3.exoplayer.video.k
            @Override // ou.x
            public final Object get() {
                return i.f.a();
            }
        });

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f11287a;

        public f(boolean z11) {
            this.f11287a = z11;
        }

        public static /* synthetic */ Class a() {
            try {
                return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
            } catch (Exception e11) {
                throw new IllegalStateException(e11);
            }
        }
    }

    private static final class g implements d1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c1.b f11288a;

        public g(boolean z11) {
            this.f11288a = new f(z11);
        }

        @Override // p7.d1.a
        public d1 a(Context context, p7.i iVar, p7.l lVar, d1.b bVar, Executor executor, long j11, boolean z11) {
            try {
                return ((d1.a) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(c1.b.class).newInstance(this.f11288a)).a(context, iVar, lVar, bVar, executor, j11, z11);
            } catch (Exception e11) {
                throw new IllegalStateException(e11);
            }
        }
    }

    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f11289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f11290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f11291c;

        public h(long j11, int i11, long j12) {
            this.f11289a = j11;
            this.f11290b = i11;
            this.f11291c = j12;
        }
    }

    /* synthetic */ i(b bVar, a aVar) {
        this(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        this.f11243e.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(boolean z11) {
        if (H()) {
            this.f11259u++;
            this.f11243e.C(z11);
            while (this.f11247i.l() > 1) {
                this.f11247i.i();
            }
            if (this.f11247i.l() == 1) {
                h hVar = (h) s7.a.f(this.f11247i.i());
                this.f11256r = hVar.f11289a;
                this.f11257s = hVar.f11290b;
                L();
            }
            this.f11261w = -9223372036854775807L;
            this.f11262x = -9223372036854775807L;
            this.f11263y = false;
            ((p) s7.a.j(this.f11251m)).g(new Runnable() { // from class: u8.d
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.exoplayer.video.i.b(this.f115875a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public p7.i E(p7.i iVar) {
        return (iVar == null || !iVar.h() || this.f11255q) ? p7.i.f101355h : iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean G() {
        return this.f11259u == 0 && this.f11263y && this.f11243e.a();
    }

    private boolean H() {
        return this.f11260v == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean I(boolean z11) {
        return this.f11243e.z(z11 && this.f11259u == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(boolean z11) {
        this.f11243e.D(z11);
    }

    private void K(Surface surface, int i11, int i12) {
        d1 d1Var = this.f11252n;
        if (d1Var == null) {
            return;
        }
        if (surface != null) {
            d1Var.h(new n0(surface, i11, i12));
            this.f11243e.w(surface, new e0(i11, i12));
        } else {
            d1Var.h(null);
            this.f11243e.B();
        }
    }

    private void L() {
        this.f11243e.A(1, this.f11248j, this.f11256r, this.f11257s, x.r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean M(u uVar, int i11) throws VideoSink.VideoSinkException {
        i iVar;
        GlUtil.GlException glException;
        if (i11 == 0) {
            s7.a.h(this.f11260v == 0);
            p7.i iVarE = E(uVar.E);
            try {
                try {
                    if (this.f11254p) {
                        iVarE = p7.i.f101355h;
                    } else if (iVarE.f101365c == 7 && Build.VERSION.SDK_INT < 34 && GlUtil.j()) {
                        iVarE = iVarE.a().e(6).a();
                    } else if (!GlUtil.k(iVarE.f101365c) && Build.VERSION.SDK_INT >= 29) {
                        t.i("PlaybackVidGraphWrapper", q0.J("Color transfer %d is not supported. Falling back to OpenGl tone mapping.", Integer.valueOf(iVarE.f101365c)));
                        iVarE = p7.i.f101355h;
                    }
                    p7.i iVar2 = iVarE;
                    a aVar = null;
                    final p pVarC = this.f11245g.c((Looper) s7.a.j(Looper.myLooper()), null);
                    this.f11251m = pVarC;
                    try {
                        d1.a aVar2 = this.f11240b;
                        Context context = this.f11239a;
                        p7.l lVar = p7.l.f101406a;
                        Objects.requireNonNull(pVarC);
                        iVar = this;
                        try {
                            d1 d1VarA = aVar2.a(context, iVar2, lVar, iVar, new Executor() { // from class: u8.f
                                @Override // java.util.concurrent.Executor
                                public final void execute(Runnable runnable) {
                                    pVarC.g(runnable);
                                }
                            }, 0L, false);
                            iVar.f11252n = d1VarA;
                            d1VarA.f(iVar.f11250l);
                            iVar.f11252n.d(iVar.f11249k);
                            iVar.f11252n.initialize();
                            Pair<Surface, e0> pair = iVar.f11258t;
                            if (pair != null) {
                                Surface surface = (Surface) pair.first;
                                e0 e0Var = (e0) pair.second;
                                K(surface, e0Var.b(), e0Var.a());
                            }
                            iVar.f11243e.E(uVar);
                            VideoSink videoSink = iVar.f11243e;
                            c cVar = new c(this, aVar);
                            final p pVar = iVar.f11251m;
                            Objects.requireNonNull(pVar);
                            videoSink.u(cVar, new Executor() { // from class: u8.f
                                @Override // java.util.concurrent.Executor
                                public final void execute(Runnable runnable) {
                                    pVar.g(runnable);
                                }
                            });
                            iVar.f11260v = 1;
                        } catch (VideoFrameProcessingException e11) {
                            e = e11;
                            throw new VideoSink.VideoSinkException(e, uVar);
                        }
                    } catch (VideoFrameProcessingException e12) {
                        e = e12;
                    }
                } catch (GlUtil.GlException e13) {
                    glException = e13;
                    throw new VideoSink.VideoSinkException(glException, uVar);
                }
            } catch (GlUtil.GlException e14) {
                glException = e14;
            }
        } else {
            iVar = this;
            if (!H()) {
                return false;
            }
        }
        try {
            ((d1) s7.a.f(iVar.f11252n)).i(i11);
            iVar.A++;
            return true;
        } catch (VideoFrameProcessingException e15) {
            throw new VideoSink.VideoSinkException(e15, uVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(long j11, long j12) {
        this.f11243e.d(j11, j12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(int i11) {
        this.f11243e.t(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(float f11) {
        this.f11243e.l(f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(u8.k kVar) {
        this.f11253o = kVar;
        this.f11243e.p(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean U() {
        int i11 = this.f11264z;
        return i11 != -1 && i11 == this.A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        this.f11243e.o();
        this.f11263y = true;
    }

    public static /* synthetic */ void a(Runnable runnable) {
    }

    public static /* synthetic */ void b(i iVar) {
        iVar.f11259u--;
    }

    public void A(e eVar) {
        this.f11246h.add(eVar);
    }

    public void C() {
        e0 e0Var = e0.f110405c;
        K(null, e0Var.b(), e0Var.a());
        this.f11258t = null;
    }

    public VideoSink F(int i11) {
        if (q0.t(this.f11241c, i11)) {
            return this.f11241c.get(i11);
        }
        d dVar = new d(this.f11239a, i11);
        if (i11 == 0) {
            A(dVar);
        }
        this.f11241c.put(i11, dVar);
        return dVar;
    }

    public void N() {
        if (this.f11260v == 2) {
            return;
        }
        p pVar = this.f11251m;
        if (pVar != null) {
            pVar.d(null);
        }
        d1 d1Var = this.f11252n;
        if (d1Var != null) {
            d1Var.release();
        }
        this.f11258t = null;
        this.f11260v = 2;
    }

    public void Q(Surface surface, e0 e0Var) {
        Pair<Surface, e0> pair = this.f11258t;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((e0) this.f11258t.second).equals(e0Var)) {
            return;
        }
        this.f11258t = Pair.create(surface, e0Var);
        K(surface, e0Var.b(), e0Var.a());
    }

    public void S(int i11) {
        this.f11264z = i11;
    }

    public void W() {
        this.f11243e.s();
    }

    public void X() {
        this.f11243e.r();
    }

    private i(b bVar) {
        this.f11239a = bVar.f11266a;
        this.f11247i = new h0<>();
        this.f11240b = (d1.a) s7.a.j(bVar.f11268c);
        this.f11241c = new SparseArray<>();
        this.f11250l = x.r();
        this.f11249k = b1.f101229a;
        this.f11242d = bVar.f11269d;
        s7.j jVar = bVar.f11270e;
        this.f11245g = jVar;
        this.f11243e = new androidx.media3.exoplayer.video.d(bVar.f11267b, jVar);
        this.f11244f = new a();
        this.f11246h = new CopyOnWriteArraySet<>();
        this.f11248j = new u.b().P();
        this.f11256r = -9223372036854775807L;
        this.f11261w = -9223372036854775807L;
        this.f11262x = -9223372036854775807L;
        this.f11264z = -1;
        this.f11260v = 0;
    }

    public interface e {
        default void c() {
        }

        default void onFirstFrameRendered() {
        }

        default void b(e1 e1Var) {
        }
    }
}
