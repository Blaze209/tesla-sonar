package androidx.media3.exoplayer;

import a8.w1;
import android.content.Context;
import android.os.Looper;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import com.google.android.gms.location.DeviceOrientationRequest;

/* JADX INFO: loaded from: classes.dex */
public interface ExoPlayer extends p7.j0 {

    public interface a {
        default void C(boolean z11) {
        }

        default void D(boolean z11) {
        }
    }

    public static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f9327b = new c(-9223372036854775807L);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f9328a;

        public c(long j11) {
            this.f9328a = j11;
        }
    }

    void P0(androidx.media3.exoplayer.source.r rVar, boolean z11);

    void Q0(androidx.media3.exoplayer.source.r rVar, long j11);

    void S0(a8.b bVar);

    int T0();

    p7.u V0();

    void W0(a8.b bVar);

    @Deprecated
    r8.y X0();

    int Y0(int i11);

    @Override // p7.j0
    ExoPlaybackException a();

    boolean isScrubbingModeEnabled();

    void release();

    void setImageOutput(ImageOutput imageOutput);

    void setScrubbingModeEnabled(boolean z11);

    public static final class b {
        z7.v A;
        long B;
        long C;
        boolean D;
        boolean E;
        z7.x F;
        boolean G;
        boolean H;
        String I;
        boolean J;
        e3 K;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f9301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        s7.j f9302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f9303c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ou.x<z7.z> f9304d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ou.x<androidx.media3.exoplayer.source.r.a> f9305e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ou.x<r8.a0> f9306f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ou.x<n1> f9307g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        ou.x<s8.d> f9308h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        ou.h<s7.j, a8.a> f9309i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Looper f9310j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f9311k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        PriorityTaskManager f9312l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        p7.d f9313m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f9314n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f9315o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f9316p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f9317q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f9318r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f9319s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f9320t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        boolean f9321u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        z7.b0 f9322v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        z7.a0 f9323w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        long f9324x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        long f9325y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        long f9326z;

        public b(final Context context, final z7.z zVar) {
            this(context, new ou.x() { // from class: z7.n
                @Override // ou.x
                public final Object get() {
                    return ExoPlayer.b.f(zVar);
                }
            }, new ou.x() { // from class: z7.o
                @Override // ou.x
                public final Object get() {
                    return ExoPlayer.b.a(context);
                }
            });
            s7.a.f(zVar);
        }

        public static /* synthetic */ androidx.media3.exoplayer.source.r.a a(Context context) {
            return new androidx.media3.exoplayer.source.i(context, new w8.m());
        }

        public static /* synthetic */ n1 b(n1 n1Var) {
            return n1Var;
        }

        public static /* synthetic */ androidx.media3.exoplayer.source.r.a c(androidx.media3.exoplayer.source.r.a aVar) {
            return aVar;
        }

        public static /* synthetic */ r8.a0 e(r8.a0 a0Var) {
            return a0Var;
        }

        public static /* synthetic */ z7.z f(z7.z zVar) {
            return zVar;
        }

        public static /* synthetic */ s8.d g(s8.d dVar) {
            return dVar;
        }

        public static /* synthetic */ r8.a0 h(Context context) {
            return new r8.n(context);
        }

        public ExoPlayer i() {
            s7.a.h(!this.G);
            this.G = true;
            return new w0(this, null);
        }

        public b j(final s8.d dVar) {
            s7.a.h(!this.G);
            s7.a.f(dVar);
            this.f9308h = new ou.x() { // from class: z7.k
                @Override // ou.x
                public final Object get() {
                    return ExoPlayer.b.g(dVar);
                }
            };
            return this;
        }

        public b k(final n1 n1Var) {
            s7.a.h(!this.G);
            s7.a.f(n1Var);
            this.f9307g = new ou.x() { // from class: z7.j
                @Override // ou.x
                public final Object get() {
                    return ExoPlayer.b.b(n1Var);
                }
            };
            return this;
        }

        public b l(final androidx.media3.exoplayer.source.r.a aVar) {
            s7.a.h(!this.G);
            s7.a.f(aVar);
            this.f9305e = new ou.x() { // from class: z7.m
                @Override // ou.x
                public final Object get() {
                    return ExoPlayer.b.c(aVar);
                }
            };
            return this;
        }

        public b m(final r8.a0 a0Var) {
            s7.a.h(!this.G);
            s7.a.f(a0Var);
            this.f9306f = new ou.x() { // from class: z7.l
                @Override // ou.x
                public final Object get() {
                    return ExoPlayer.b.e(a0Var);
                }
            };
            return this;
        }

        private b(final Context context, ou.x<z7.z> xVar, ou.x<androidx.media3.exoplayer.source.r.a> xVar2) {
            this(context, xVar, xVar2, new ou.x() { // from class: z7.p
                @Override // ou.x
                public final Object get() {
                    return ExoPlayer.b.h(context);
                }
            }, new ou.x() { // from class: z7.q
                @Override // ou.x
                public final Object get() {
                    return new androidx.media3.exoplayer.j();
                }
            }, new ou.x() { // from class: z7.r
                @Override // ou.x
                public final Object get() {
                    return s8.i.n(context);
                }
            }, new ou.h() { // from class: z7.s
                @Override // ou.h
                public final Object apply(Object obj) {
                    return new w1((s7.j) obj);
                }
            });
        }

        private b(Context context, ou.x<z7.z> xVar, ou.x<androidx.media3.exoplayer.source.r.a> xVar2, ou.x<r8.a0> xVar3, ou.x<n1> xVar4, ou.x<s8.d> xVar5, ou.h<s7.j, a8.a> hVar) {
            this.f9301a = (Context) s7.a.f(context);
            this.f9304d = xVar;
            this.f9305e = xVar2;
            this.f9306f = xVar3;
            this.f9307g = xVar4;
            this.f9308h = xVar5;
            this.f9309i = hVar;
            this.f9310j = s7.q0.d0();
            this.f9313m = p7.d.f101231h;
            this.f9315o = 0;
            this.f9319s = 1;
            this.f9320t = 0;
            this.f9321u = true;
            this.f9322v = z7.b0.f127077g;
            this.f9324x = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;
            this.f9325y = 15000L;
            this.f9326z = 3000L;
            this.f9323w = z7.a0.f127045i;
            this.A = new i.b().a();
            this.f9302b = s7.j.f110429a;
            this.B = 500L;
            this.C = 2000L;
            this.E = true;
            this.I = "";
            this.f9311k = -1000;
            this.K = new l();
        }
    }
}
