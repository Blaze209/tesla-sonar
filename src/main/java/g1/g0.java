package g1;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Range;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.g2;
import androidx.camera.core.impl.h3;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.PrematureEndOfStreamVideoQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class g0 implements k {
    private static final Range<Long> E = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);
    private Future<?> D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f66892a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f66894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MediaFormat f66895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final MediaCodec f66896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final k.b f66897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d1 f66898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Executor f66899h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.common.util.concurrent.s<Void> f66900i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final androidx.concurrent.futures.c.a<Void> f66901j;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final h3 f66907p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    d f66911t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f66893b = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Queue<Integer> f66902k = new ArrayDeque();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Queue<androidx.concurrent.futures.c.a<f1>> f66903l = new ArrayDeque();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set<f1> f66904m = new HashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Set<j> f66905n = new HashSet();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final Deque<Range<Long>> f66906o = new ArrayDeque();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final l1 f66908q = new k1();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    l f66909r = l.f66969a;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Executor f66910s = i0.c.b();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    Range<Long> f66912u = E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    long f66913v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f66914w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    Long f66915x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    Future<?> f66916y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private e f66917z = null;
    private boolean A = false;
    private boolean B = false;
    boolean C = false;

    private static class b {
        @NonNull
        static Surface a() {
            return MediaCodec.createPersistentInputSurface();
        }

        static void b(@NonNull MediaCodec mediaCodec, @NonNull Surface surface) {
            mediaCodec.setInputSurface(surface);
        }
    }

    class c implements k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<g2.a<? super b1.c.a>, Executor> f66920a = new LinkedHashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b1.c.a f66921b = b1.c.a.INACTIVE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<com.google.common.util.concurrent.s<f1>> f66922c = new ArrayList();

        c() {
        }

        public static /* synthetic */ Object h(final c cVar, final androidx.concurrent.futures.c.a aVar) {
            g0.this.f66899h.execute(new Runnable() { // from class: g1.l0
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.c(this.f66970a.f66921b);
                }
            });
            return "fetchData";
        }

        public static /* synthetic */ void i(c cVar, final g2.a aVar, Executor executor) {
            cVar.f66920a.put((g2.a) u5.h.g(aVar), (Executor) u5.h.g(executor));
            final b1.c.a aVar2 = cVar.f66921b;
            executor.execute(new Runnable() { // from class: g1.o0
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.a(aVar2);
                }
            });
        }

        public static /* synthetic */ Object m(final c cVar, final androidx.concurrent.futures.c.a aVar) {
            g0.this.f66899h.execute(new Runnable() { // from class: g1.n0
                @Override // java.lang.Runnable
                public final void run() {
                    g0.c.n(this.f66974a, aVar);
                }
            });
            return "acquireBuffer";
        }

        public static /* synthetic */ void n(final c cVar, androidx.concurrent.futures.c.a aVar) {
            b1.c.a aVar2 = cVar.f66921b;
            if (aVar2 == b1.c.a.ACTIVE) {
                final com.google.common.util.concurrent.s<f1> sVarB = g0.this.B();
                j0.n.t(sVarB, aVar);
                aVar.a(new Runnable() { // from class: g1.p0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f66985a.p(sVarB);
                    }
                }, i0.c.b());
                cVar.f66922c.add(sVarB);
                sVarB.b(new Runnable() { // from class: g1.q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f66988a.f66922c.remove(sVarB);
                    }
                }, g0.this.f66899h);
                return;
            }
            if (aVar2 == b1.c.a.INACTIVE) {
                aVar.f(new IllegalStateException("BufferProvider is not active."));
                return;
            }
            aVar.f(new IllegalStateException("Unknown state: " + cVar.f66921b));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(@NonNull com.google.common.util.concurrent.s<f1> sVar) {
            if (sVar.cancel(true)) {
                return;
            }
            u5.h.i(sVar.isDone());
            try {
                sVar.get().cancel();
            } catch (InterruptedException | CancellationException | ExecutionException e11) {
                c0.y0.l(g0.this.f66892a, "Unable to cancel the input buffer: " + e11);
            }
        }

        @Override // androidx.camera.core.impl.g2
        @NonNull
        public com.google.common.util.concurrent.s<b1.c.a> b() {
            return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: g1.h0
                @Override // androidx.concurrent.futures.c.InterfaceC0146c
                public final Object a(androidx.concurrent.futures.c.a aVar) {
                    return g0.c.h(this.f66945a, aVar);
                }
            });
        }

        @Override // androidx.camera.core.impl.g2
        public void c(@NonNull final Executor executor, @NonNull final g2.a<? super b1.c.a> aVar) {
            g0.this.f66899h.execute(new Runnable() { // from class: g1.j0
                @Override // java.lang.Runnable
                public final void run() {
                    g0.c.i(this.f66964a, aVar, executor);
                }
            });
        }

        @Override // androidx.camera.core.impl.g2
        public void d(@NonNull final g2.a<? super b1.c.a> aVar) {
            g0.this.f66899h.execute(new Runnable() { // from class: g1.m0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f66972a.f66920a.remove(u5.h.g(aVar));
                }
            });
        }

        @Override // b1.c
        @NonNull
        public com.google.common.util.concurrent.s<f1> e() {
            return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: g1.k0
                @Override // androidx.concurrent.futures.c.InterfaceC0146c
                public final Object a(androidx.concurrent.futures.c.a aVar) {
                    return g0.c.m(this.f66968a, aVar);
                }
            });
        }

        void q(boolean z11) {
            final b1.c.a aVar = z11 ? b1.c.a.ACTIVE : b1.c.a.INACTIVE;
            if (this.f66921b == aVar) {
                return;
            }
            this.f66921b = aVar;
            if (aVar == b1.c.a.INACTIVE) {
                Iterator<com.google.common.util.concurrent.s<f1>> it = this.f66922c.iterator();
                while (it.hasNext()) {
                    it.next().cancel(true);
                }
                this.f66922c.clear();
            }
            for (final Map.Entry<g2.a<? super b1.c.a>, Executor> entry : this.f66920a.entrySet()) {
                try {
                    entry.getValue().execute(new Runnable() { // from class: g1.i0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((g2.a) entry.getKey()).a(aVar);
                        }
                    });
                } catch (RejectedExecutionException e11) {
                    c0.y0.d(g0.this.f66892a, "Unable to post to the supplied executor.", e11);
                }
            }
        }
    }

    enum d {
        CONFIGURED,
        STARTED,
        PAUSED,
        STOPPING,
        PENDING_START,
        PENDING_START_PAUSED,
        PENDING_RELEASE,
        ERROR,
        RELEASED
    }

    class e extends MediaCodec.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i1.f f66924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f66925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f66926c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f66927d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f66928e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f66929f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f66930g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f66931h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f66932i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f66933j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f66934k;

        class a implements j0.c<Void> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f66936a;

            a(j jVar) {
                this.f66936a = jVar;
            }

            @Override // j0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Void r11) {
                g0.this.f66905n.remove(this.f66936a);
            }

            @Override // j0.c
            public void onFailure(@NonNull Throwable th2) {
                g0.this.f66905n.remove(this.f66936a);
                if (th2 instanceof MediaCodec.CodecException) {
                    g0.this.H((MediaCodec.CodecException) th2);
                } else {
                    g0.this.G(0, th2.getMessage(), th2);
                }
            }
        }

        e() {
            this.f66925b = true;
            boolean z11 = g0.this.f66894c;
            this.f66934k = z11;
            if (z11) {
                this.f66924a = new i1.f(g0.this.f66908q, g0.this.f66907p, (CameraUseInconsistentTimebaseQuirk) androidx.camera.video.internal.compat.quirk.a.b(CameraUseInconsistentTimebaseQuirk.class));
            } else {
                this.f66924a = null;
            }
            CodecStuckOnFlushQuirk codecStuckOnFlushQuirk = (CodecStuckOnFlushQuirk) androidx.camera.video.internal.compat.quirk.a.b(CodecStuckOnFlushQuirk.class);
            if (codecStuckOnFlushQuirk == null || !codecStuckOnFlushQuirk.h(g0.this.f66895d.getString("mime"))) {
                return;
            }
            this.f66925b = false;
        }

        public static /* synthetic */ MediaFormat a(MediaFormat mediaFormat) {
            return mediaFormat;
        }

        public static /* synthetic */ void b(e eVar, Executor executor, final l lVar) {
            if (g0.this.f66911t == d.ERROR) {
                return;
            }
            try {
                Objects.requireNonNull(lVar);
                executor.execute(new Runnable() { // from class: g1.s0
                    @Override // java.lang.Runnable
                    public final void run() {
                        lVar.e();
                    }
                });
            } catch (RejectedExecutionException e11) {
                c0.y0.d(g0.this.f66892a, "Unable to post to the supplied executor.", e11);
            }
        }

        public static /* synthetic */ void e(e eVar, MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i11) {
            final l lVar;
            Executor executor;
            if (eVar.f66933j) {
                c0.y0.l(g0.this.f66892a, "Receives frame after codec is reset.");
                return;
            }
            switch (g0.this.f66911t) {
                case CONFIGURED:
                case ERROR:
                case RELEASED:
                    return;
                case STARTED:
                case PAUSED:
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                case PENDING_RELEASE:
                    synchronized (g0.this.f66893b) {
                        g0 g0Var = g0.this;
                        lVar = g0Var.f66909r;
                        executor = g0Var.f66910s;
                        break;
                    }
                    if (!eVar.f66926c) {
                        eVar.f66926c = true;
                        try {
                            Objects.requireNonNull(lVar);
                            executor.execute(new Runnable() { // from class: g1.w0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    lVar.c();
                                }
                            });
                        } catch (RejectedExecutionException e11) {
                            c0.y0.d(g0.this.f66892a, "Unable to post to the supplied executor.", e11);
                        }
                        break;
                    }
                    if (!eVar.i(bufferInfo)) {
                        try {
                            g0.this.f66896e.releaseOutputBuffer(i11, false);
                        } catch (MediaCodec.CodecException e12) {
                            g0.this.H(e12);
                            return;
                        }
                        break;
                    } else {
                        if (!eVar.f66927d) {
                            eVar.f66927d = true;
                            c0.y0.a(g0.this.f66892a, "data timestampUs = " + bufferInfo.presentationTimeUs + ", data timebase = " + g0.this.f66907p + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
                        }
                        MediaCodec.BufferInfo bufferInfoM = eVar.m(bufferInfo);
                        eVar.f66930g = bufferInfoM.presentationTimeUs;
                        try {
                            eVar.n(new j(mediaCodec, i11, bufferInfoM), lVar, executor);
                        } catch (MediaCodec.CodecException e13) {
                            g0.this.H(e13);
                            return;
                        }
                        break;
                    }
                    if (!eVar.f66928e && eVar.j(bufferInfo)) {
                        eVar.l();
                    }
                    if (eVar.f66934k) {
                        eVar.f66934k = false;
                        return;
                    }
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + g0.this.f66911t);
            }
        }

        public static /* synthetic */ void f(e eVar, final MediaFormat mediaFormat) {
            final l lVar;
            Executor executor;
            if (eVar.f66933j) {
                c0.y0.l(g0.this.f66892a, "Receives onOutputFormatChanged after codec is reset.");
                return;
            }
            switch (g0.this.f66911t) {
                case CONFIGURED:
                case ERROR:
                case RELEASED:
                    return;
                case STARTED:
                case PAUSED:
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                case PENDING_RELEASE:
                    synchronized (g0.this.f66893b) {
                        g0 g0Var = g0.this;
                        lVar = g0Var.f66909r;
                        executor = g0Var.f66910s;
                        break;
                    }
                    try {
                        executor.execute(new Runnable() { // from class: g1.x0
                            @Override // java.lang.Runnable
                            public final void run() {
                                lVar.a(new i1() { // from class: g1.a1
                                    @Override // g1.i1
                                    public final MediaFormat a() {
                                        return g0.e.a(mediaFormat);
                                    }
                                });
                            }
                        });
                        return;
                    } catch (RejectedExecutionException e11) {
                        c0.y0.d(g0.this.f66892a, "Unable to post to the supplied executor.", e11);
                        return;
                    }
                default:
                    throw new IllegalStateException("Unknown state: " + g0.this.f66911t);
            }
        }

        public static /* synthetic */ void g(e eVar, int i11) {
            if (eVar.f66933j) {
                c0.y0.l(g0.this.f66892a, "Receives input frame after codec is reset.");
                return;
            }
            switch (g0.this.f66911t) {
                case CONFIGURED:
                case ERROR:
                case RELEASED:
                    return;
                case STARTED:
                case PAUSED:
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                case PENDING_RELEASE:
                    g0.this.f66902k.offer(Integer.valueOf(i11));
                    g0.this.N();
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + g0.this.f66911t);
            }
        }

        public static /* synthetic */ void h(e eVar, MediaCodec.CodecException codecException) {
            switch (g0.this.f66911t) {
                case CONFIGURED:
                case ERROR:
                case RELEASED:
                    return;
                case STARTED:
                case PAUSED:
                case STOPPING:
                case PENDING_START:
                case PENDING_START_PAUSED:
                case PENDING_RELEASE:
                    g0.this.H(codecException);
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + g0.this.f66911t);
            }
        }

        private boolean i(@NonNull MediaCodec.BufferInfo bufferInfo) {
            if (this.f66928e) {
                c0.y0.a(g0.this.f66892a, "Drop buffer by already reach end of stream.");
                return false;
            }
            if (bufferInfo.size <= 0) {
                c0.y0.a(g0.this.f66892a, "Drop buffer by invalid buffer size.");
                return false;
            }
            if ((bufferInfo.flags & 2) != 0) {
                c0.y0.a(g0.this.f66892a, "Drop buffer by codec config.");
                return false;
            }
            i1.f fVar = this.f66924a;
            if (fVar != null) {
                bufferInfo.presentationTimeUs = fVar.b(bufferInfo.presentationTimeUs);
            }
            long j11 = bufferInfo.presentationTimeUs;
            if (j11 <= this.f66929f) {
                c0.y0.a(g0.this.f66892a, "Drop buffer by out of order buffer from MediaCodec.");
                return false;
            }
            this.f66929f = j11;
            if (!g0.this.f66912u.contains(Long.valueOf(j11))) {
                c0.y0.a(g0.this.f66892a, "Drop buffer by not in start-stop range.");
                g0 g0Var = g0.this;
                if (g0Var.f66914w && bufferInfo.presentationTimeUs >= ((Long) g0Var.f66912u.getUpper()).longValue()) {
                    Future<?> future = g0.this.f66916y;
                    if (future != null) {
                        future.cancel(true);
                    }
                    g0.this.f66915x = Long.valueOf(bufferInfo.presentationTimeUs);
                    g0.this.U();
                    g0.this.f66914w = false;
                }
                return false;
            }
            if (q(bufferInfo)) {
                c0.y0.a(g0.this.f66892a, "Drop buffer by pause.");
                return false;
            }
            if (g0.this.F(bufferInfo) <= this.f66930g) {
                c0.y0.a(g0.this.f66892a, "Drop buffer by adjusted time is less than the last sent time.");
                if (g0.this.f66894c && g0.M(bufferInfo)) {
                    this.f66932i = true;
                }
                return false;
            }
            if (!this.f66927d && !this.f66932i && g0.this.f66894c) {
                this.f66932i = true;
            }
            if (this.f66932i) {
                if (!g0.M(bufferInfo)) {
                    c0.y0.a(g0.this.f66892a, "Drop buffer by not a key frame.");
                    g0.this.Q();
                    return false;
                }
                this.f66932i = false;
            }
            return true;
        }

        private boolean j(@NonNull MediaCodec.BufferInfo bufferInfo) {
            if (!g0.J(bufferInfo) || o()) {
                return this.f66925b && k(bufferInfo);
            }
            return true;
        }

        private boolean k(@NonNull MediaCodec.BufferInfo bufferInfo) {
            g0 g0Var = g0.this;
            return g0Var.C && bufferInfo.presentationTimeUs > ((Long) g0Var.f66912u.getUpper()).longValue();
        }

        @NonNull
        private MediaCodec.BufferInfo m(@NonNull MediaCodec.BufferInfo bufferInfo) {
            long jF = g0.this.F(bufferInfo);
            if (bufferInfo.presentationTimeUs == jF) {
                return bufferInfo;
            }
            u5.h.i(jF > this.f66930g);
            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
            bufferInfo2.set(bufferInfo.offset, bufferInfo.size, jF, bufferInfo.flags);
            return bufferInfo2;
        }

        private void n(@NonNull final j jVar, @NonNull final l lVar, @NonNull Executor executor) {
            g0.this.f66905n.add(jVar);
            j0.n.j(jVar.n(), new a(jVar), g0.this.f66899h);
            try {
                executor.execute(new Runnable() { // from class: g1.z0
                    @Override // java.lang.Runnable
                    public final void run() {
                        lVar.f(jVar);
                    }
                });
            } catch (RejectedExecutionException e11) {
                c0.y0.d(g0.this.f66892a, "Unable to post to the supplied executor.", e11);
                jVar.close();
            }
        }

        private boolean o() {
            return this.f66934k && androidx.camera.video.internal.compat.quirk.a.b(PrematureEndOfStreamVideoQuirk.class) != null;
        }

        private boolean q(@NonNull MediaCodec.BufferInfo bufferInfo) {
            Executor executor;
            final l lVar;
            g0.this.Y(bufferInfo.presentationTimeUs);
            boolean zL = g0.this.L(bufferInfo.presentationTimeUs);
            boolean z11 = this.f66931h;
            if (!z11 && zL) {
                c0.y0.a(g0.this.f66892a, "Switch to pause state");
                this.f66931h = true;
                synchronized (g0.this.f66893b) {
                    g0 g0Var = g0.this;
                    executor = g0Var.f66910s;
                    lVar = g0Var.f66909r;
                }
                Objects.requireNonNull(lVar);
                executor.execute(new Runnable() { // from class: g1.b1
                    @Override // java.lang.Runnable
                    public final void run() {
                        lVar.b();
                    }
                });
                g0 g0Var2 = g0.this;
                if (g0Var2.f66911t == d.PAUSED && ((g0Var2.f66894c || androidx.camera.video.internal.compat.quirk.a.b(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!g0.this.f66894c || androidx.camera.video.internal.compat.quirk.a.b(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null))) {
                    k.b bVar = g0.this.f66897f;
                    if (bVar instanceof c) {
                        ((c) bVar).q(false);
                    }
                    g0.this.S(true);
                }
                g0.this.f66915x = Long.valueOf(bufferInfo.presentationTimeUs);
                g0 g0Var3 = g0.this;
                if (g0Var3.f66914w) {
                    Future<?> future = g0Var3.f66916y;
                    if (future != null) {
                        future.cancel(true);
                    }
                    g0.this.U();
                    g0.this.f66914w = false;
                }
            } else if (z11 && !zL) {
                c0.y0.a(g0.this.f66892a, "Switch to resume state");
                this.f66931h = false;
                if (g0.this.f66894c && !g0.M(bufferInfo)) {
                    this.f66932i = true;
                }
            }
            return this.f66931h;
        }

        void l() {
            g0 g0Var;
            final l lVar;
            final Executor executor;
            if (this.f66928e) {
                return;
            }
            this.f66928e = true;
            if (g0.this.D != null) {
                g0.this.D.cancel(false);
                g0.this.D = null;
            }
            synchronized (g0.this.f66893b) {
                g0Var = g0.this;
                lVar = g0Var.f66909r;
                executor = g0Var.f66910s;
            }
            g0Var.X(new Runnable() { // from class: g1.y0
                @Override // java.lang.Runnable
                public final void run() {
                    g0.e.b(this.f67017a, executor, lVar);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(@NonNull MediaCodec mediaCodec, @NonNull final MediaCodec.CodecException codecException) {
            g0.this.f66899h.execute(new Runnable() { // from class: g1.u0
                @Override // java.lang.Runnable
                public final void run() {
                    g0.e.h(this.f67004a, codecException);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(@NonNull MediaCodec mediaCodec, final int i11) {
            g0.this.f66899h.execute(new Runnable() { // from class: g1.r0
                @Override // java.lang.Runnable
                public final void run() {
                    g0.e.g(this.f66993a, i11);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(@NonNull final MediaCodec mediaCodec, final int i11, @NonNull final MediaCodec.BufferInfo bufferInfo) {
            g0.this.f66899h.execute(new Runnable() { // from class: g1.t0
                @Override // java.lang.Runnable
                public final void run() {
                    g0.e.e(this.f66999a, bufferInfo, mediaCodec, i11);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(@NonNull MediaCodec mediaCodec, @NonNull final MediaFormat mediaFormat) {
            g0.this.f66899h.execute(new Runnable() { // from class: g1.v0
                @Override // java.lang.Runnable
                public final void run() {
                    g0.e.f(this.f67008a, mediaFormat);
                }
            });
        }

        void p() {
            this.f66933j = true;
        }
    }

    class f implements k.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Surface f66939b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private k.c.a f66941d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Executor f66942e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f66938a = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set<Surface> f66940c = new HashSet();

        f() {
        }

        private void c(@NonNull Executor executor, @NonNull final k.c.a aVar, @NonNull final Surface surface) {
            try {
                executor.execute(new Runnable() { // from class: g1.c1
                    @Override // java.lang.Runnable
                    public final void run() {
                        aVar.a(surface);
                    }
                });
            } catch (RejectedExecutionException e11) {
                c0.y0.d(g0.this.f66892a, "Unable to post to the supplied executor.", e11);
            }
        }

        @Override // g1.k.c
        public void a(@NonNull Executor executor, @NonNull k.c.a aVar) {
            Surface surface;
            synchronized (this.f66938a) {
                this.f66941d = (k.c.a) u5.h.g(aVar);
                this.f66942e = (Executor) u5.h.g(executor);
                surface = this.f66939b;
            }
            if (surface != null) {
                c(executor, aVar, surface);
            }
        }

        void d() {
            Surface surface;
            HashSet hashSet;
            synchronized (this.f66938a) {
                surface = this.f66939b;
                this.f66939b = null;
                hashSet = new HashSet(this.f66940c);
                this.f66940c.clear();
            }
            if (surface != null) {
                surface.release();
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Surface) it.next()).release();
            }
        }

        @SuppressLint({"NewApi"})
        void e() {
            Surface surfaceCreateInputSurface;
            k.c.a aVar;
            Executor executor;
            EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk = (EncoderNotUsePersistentInputSurfaceQuirk) androidx.camera.video.internal.compat.quirk.a.b(EncoderNotUsePersistentInputSurfaceQuirk.class);
            synchronized (this.f66938a) {
                try {
                    if (encoderNotUsePersistentInputSurfaceQuirk == null) {
                        if (this.f66939b == null) {
                            surfaceCreateInputSurface = b.a();
                            this.f66939b = surfaceCreateInputSurface;
                        } else {
                            surfaceCreateInputSurface = null;
                        }
                        b.b(g0.this.f66896e, this.f66939b);
                    } else {
                        Surface surface = this.f66939b;
                        if (surface != null) {
                            this.f66940c.add(surface);
                        }
                        surfaceCreateInputSurface = g0.this.f66896e.createInputSurface();
                        this.f66939b = surfaceCreateInputSurface;
                    }
                    aVar = this.f66941d;
                    executor = this.f66942e;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (surfaceCreateInputSurface == null || aVar == null || executor == null) {
                return;
            }
            c(executor, aVar, surfaceCreateInputSurface);
        }
    }

    public g0(@NonNull Executor executor, @NonNull m mVar) throws InvalidConfigException {
        u5.h.g(executor);
        u5.h.g(mVar);
        MediaCodec mediaCodecA = h1.a.a(mVar);
        this.f66896e = mediaCodecA;
        MediaCodecInfo codecInfo = mediaCodecA.getCodecInfo();
        this.f66899h = i0.c.g(executor);
        MediaFormat mediaFormatB = mVar.b();
        this.f66895d = mediaFormatB;
        h3 h3VarA = mVar.a();
        this.f66907p = h3VarA;
        if (mVar instanceof g1.a) {
            this.f66892a = "AudioEncoder";
            this.f66894c = false;
            this.f66897f = new c();
            this.f66898g = new g1.b(codecInfo, mVar.getMimeType());
        } else {
            if (!(mVar instanceof m1)) {
                throw new InvalidConfigException("Unknown encoder config type");
            }
            this.f66892a = "VideoEncoder";
            this.f66894c = true;
            this.f66897f = new f();
            q1 q1Var = new q1(codecInfo, mVar.getMimeType());
            D(q1Var, mediaFormatB);
            this.f66898g = q1Var;
        }
        c0.y0.a(this.f66892a, "mInputTimebase = " + h3VarA);
        c0.y0.a(this.f66892a, "mMediaFormat = " + mediaFormatB);
        try {
            R();
            final AtomicReference atomicReference = new AtomicReference();
            this.f66900i = j0.n.s(androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: g1.z
                @Override // androidx.concurrent.futures.c.InterfaceC0146c
                public final Object a(androidx.concurrent.futures.c.a aVar) {
                    return g0.u(atomicReference, aVar);
                }
            }));
            this.f66901j = (androidx.concurrent.futures.c.a) u5.h.g((androidx.concurrent.futures.c.a) atomicReference.get());
            T(d.CONFIGURED);
        } catch (MediaCodec.CodecException e11) {
            throw new InvalidConfigException(e11);
        }
    }

    private void C() {
        if (androidx.camera.video.internal.compat.quirk.a.b(SignalEosOutputBufferNotComeQuirk.class) != null) {
            final e eVar = this.f66917z;
            final Executor executor = this.f66899h;
            Future<?> future = this.D;
            if (future != null) {
                future.cancel(false);
            }
            this.D = i0.c.e().schedule(new Runnable() { // from class: g1.t
                @Override // java.lang.Runnable
                public final void run() {
                    g0.m(executor, eVar);
                }
            }, 1000L, TimeUnit.MILLISECONDS);
        }
    }

    private void D(@NonNull o1 o1Var, @NonNull MediaFormat mediaFormat) {
        u5.h.i(this.f66894c);
        if (mediaFormat.containsKey("bitrate")) {
            int integer = mediaFormat.getInteger("bitrate");
            int iIntValue = ((Integer) o1Var.c().clamp(Integer.valueOf(integer))).intValue();
            if (integer != iIntValue) {
                mediaFormat.setInteger("bitrate", iIntValue);
                c0.y0.a(this.f66892a, "updated bitrate from " + integer + " to " + iIntValue);
            }
        }
    }

    static boolean J(@NonNull MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 4) != 0;
    }

    private boolean K() {
        return androidx.camera.video.internal.compat.quirk.a.b(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class) != null;
    }

    static boolean M(@NonNull MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 1) != 0;
    }

    private void P() {
        if (this.A) {
            this.f66896e.stop();
            this.A = false;
        }
        this.f66896e.release();
        k.b bVar = this.f66897f;
        if (bVar instanceof f) {
            ((f) bVar).d();
        }
        T(d.RELEASED);
        this.f66901j.c(null);
    }

    private void R() {
        this.f66912u = E;
        this.f66913v = 0L;
        this.f66906o.clear();
        this.f66902k.clear();
        Iterator<androidx.concurrent.futures.c.a<f1>> it = this.f66903l.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        this.f66903l.clear();
        this.f66896e.reset();
        this.A = false;
        this.B = false;
        this.C = false;
        this.f66914w = false;
        Future<?> future = this.f66916y;
        if (future != null) {
            future.cancel(true);
            this.f66916y = null;
        }
        Future<?> future2 = this.D;
        if (future2 != null) {
            future2.cancel(false);
            this.D = null;
        }
        e eVar = this.f66917z;
        if (eVar != null) {
            eVar.p();
        }
        e eVar2 = new e();
        this.f66917z = eVar2;
        this.f66896e.setCallback(eVar2);
        this.f66896e.configure(this.f66895d, (Surface) null, (MediaCrypto) null, 1);
        k.b bVar = this.f66897f;
        if (bVar instanceof f) {
            ((f) bVar).e();
        }
    }

    private void T(d dVar) {
        if (this.f66911t == dVar) {
            return;
        }
        c0.y0.a(this.f66892a, "Transitioning encoder internal state: " + this.f66911t + " --> " + dVar);
        this.f66911t = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        j0.n.j(B(), new a(), this.f66899h);
    }

    public static /* synthetic */ void h(g0 g0Var) {
        if (g0Var.f66914w) {
            c0.y0.l(g0Var.f66892a, "The data didn't reach the expected timestamp before timeout, stop the codec.");
            g0Var.f66915x = null;
            g0Var.U();
            g0Var.f66914w = false;
        }
    }

    public static /* synthetic */ void j(g0 g0Var) {
        int iOrdinal = g0Var.f66911t.ordinal();
        if (iOrdinal == 1) {
            g0Var.Q();
        } else if (iOrdinal == 6 || iOrdinal == 8) {
            throw new IllegalStateException("Encoder is released");
        }
    }

    public static /* synthetic */ void l(g0 g0Var, long j11) {
        switch (g0Var.f66911t) {
            case CONFIGURED:
            case PAUSED:
            case STOPPING:
            case PENDING_START_PAUSED:
            case ERROR:
                return;
            case STARTED:
                c0.y0.a(g0Var.f66892a, "Pause on " + b1.d.c(j11));
                g0Var.f66906o.addLast(Range.create(Long.valueOf(j11), Long.MAX_VALUE));
                g0Var.T(d.PAUSED);
                return;
            case PENDING_START:
                g0Var.T(d.PENDING_START_PAUSED);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + g0Var.f66911t);
        }
    }

    public static /* synthetic */ void m(Executor executor, final e eVar) {
        Objects.requireNonNull(eVar);
        executor.execute(new Runnable() { // from class: g1.w
            @Override // java.lang.Runnable
            public final void run() {
                eVar.l();
            }
        });
    }

    public static /* synthetic */ void p(g0 g0Var) {
        g0Var.B = true;
        if (g0Var.A) {
            g0Var.f66896e.stop();
            g0Var.R();
        }
    }

    public static /* synthetic */ void r(final g0 g0Var, long j11, long j12) {
        switch (g0Var.f66911t) {
            case CONFIGURED:
            case STOPPING:
            case ERROR:
                return;
            case STARTED:
            case PAUSED:
                d dVar = g0Var.f66911t;
                g0Var.T(d.STOPPING);
                Long l11 = (Long) g0Var.f66912u.getLower();
                long jLongValue = l11.longValue();
                if (jLongValue == Long.MAX_VALUE) {
                    throw new AssertionError("There should be a \"start\" before \"stop\"");
                }
                if (j11 == -1) {
                    j11 = j12;
                } else if (j11 < jLongValue) {
                    c0.y0.l(g0Var.f66892a, "The expected stop time is less than the start time. Use current time as stop time.");
                    j11 = j12;
                }
                if (j11 < jLongValue) {
                    throw new AssertionError("The start time should be before the stop time.");
                }
                g0Var.f66912u = Range.create(l11, Long.valueOf(j11));
                c0.y0.a(g0Var.f66892a, "Stop on " + b1.d.c(j11));
                if (dVar == d.PAUSED && g0Var.f66915x != null) {
                    g0Var.U();
                    return;
                } else {
                    g0Var.f66914w = true;
                    g0Var.f66916y = i0.c.e().schedule(new Runnable() { // from class: g1.q
                        @Override // java.lang.Runnable
                        public final void run() {
                            g0 g0Var2 = this.f66987a;
                            g0Var2.f66899h.execute(new Runnable() { // from class: g1.r
                                @Override // java.lang.Runnable
                                public final void run() {
                                    g0.h(g0Var2);
                                }
                            });
                        }
                    }, 1000L, TimeUnit.MILLISECONDS);
                    return;
                }
            case PENDING_START:
            case PENDING_START_PAUSED:
                g0Var.T(d.CONFIGURED);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + g0Var.f66911t);
        }
    }

    public static /* synthetic */ void s(g0 g0Var, long j11) {
        switch (g0Var.f66911t) {
            case CONFIGURED:
                g0Var.f66915x = null;
                c0.y0.a(g0Var.f66892a, "Start on " + b1.d.c(j11));
                try {
                    if (g0Var.A) {
                        g0Var.R();
                    }
                    g0Var.f66912u = Range.create(Long.valueOf(j11), Long.MAX_VALUE);
                    g0Var.f66896e.start();
                    k.b bVar = g0Var.f66897f;
                    if (bVar instanceof c) {
                        ((c) bVar).q(true);
                    }
                    g0Var.T(d.STARTED);
                    return;
                } catch (MediaCodec.CodecException e11) {
                    g0Var.H(e11);
                    return;
                }
            case STARTED:
            case PENDING_START:
            case ERROR:
                return;
            case PAUSED:
                g0Var.f66915x = null;
                Range<Long> rangeRemoveLast = g0Var.f66906o.removeLast();
                u5.h.j(rangeRemoveLast != null && ((Long) rangeRemoveLast.getUpper()).longValue() == Long.MAX_VALUE, "There should be a \"pause\" before \"resume\"");
                Long l11 = (Long) rangeRemoveLast.getLower();
                long jLongValue = l11.longValue();
                g0Var.f66906o.addLast(Range.create(l11, Long.valueOf(j11)));
                c0.y0.a(g0Var.f66892a, "Resume on " + b1.d.c(j11) + "\nPaused duration = " + b1.d.c(j11 - jLongValue));
                if ((g0Var.f66894c || androidx.camera.video.internal.compat.quirk.a.b(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!g0Var.f66894c || androidx.camera.video.internal.compat.quirk.a.b(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                    g0Var.S(false);
                    k.b bVar2 = g0Var.f66897f;
                    if (bVar2 instanceof c) {
                        ((c) bVar2).q(true);
                    }
                }
                if (g0Var.f66894c) {
                    g0Var.Q();
                }
                g0Var.T(d.STARTED);
                return;
            case STOPPING:
            case PENDING_START_PAUSED:
                g0Var.T(d.PENDING_START);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + g0Var.f66911t);
        }
    }

    public static /* synthetic */ Object u(AtomicReference atomicReference, androidx.concurrent.futures.c.a aVar) {
        atomicReference.set(aVar);
        return "mReleasedFuture";
    }

    public static /* synthetic */ void v(g0 g0Var, List list, Runnable runnable) {
        if (g0Var.f66911t != d.ERROR) {
            if (!list.isEmpty()) {
                c0.y0.a(g0Var.f66892a, "encoded data and input buffers are returned");
            }
            if (!(g0Var.f66897f instanceof f) || g0Var.B || g0Var.K()) {
                g0Var.f66896e.stop();
            } else {
                g0Var.f66896e.flush();
                g0Var.A = true;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        g0Var.I();
    }

    public static /* synthetic */ void w(g0 g0Var) {
        switch (g0Var.f66911t) {
            case CONFIGURED:
            case STARTED:
            case PAUSED:
            case ERROR:
                g0Var.P();
                return;
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
                g0Var.T(d.PENDING_RELEASE);
                return;
            case PENDING_RELEASE:
            case RELEASED:
                return;
            default:
                throw new IllegalStateException("Unknown state: " + g0Var.f66911t);
        }
    }

    public static /* synthetic */ Object x(AtomicReference atomicReference, androidx.concurrent.futures.c.a aVar) {
        atomicReference.set(aVar);
        return "acquireInputBuffer";
    }

    @NonNull
    com.google.common.util.concurrent.s<f1> B() {
        switch (this.f66911t) {
            case CONFIGURED:
                return j0.n.n(new IllegalStateException("Encoder is not started yet."));
            case STARTED:
            case PAUSED:
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
            case PENDING_RELEASE:
                final AtomicReference atomicReference = new AtomicReference();
                com.google.common.util.concurrent.s<f1> sVarA = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: g1.u
                    @Override // androidx.concurrent.futures.c.InterfaceC0146c
                    public final Object a(androidx.concurrent.futures.c.a aVar) {
                        return g0.x(atomicReference, aVar);
                    }
                });
                final androidx.concurrent.futures.c.a<f1> aVar = (androidx.concurrent.futures.c.a) u5.h.g((androidx.concurrent.futures.c.a) atomicReference.get());
                this.f66903l.offer(aVar);
                aVar.a(new Runnable() { // from class: g1.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f67006a.f66903l.remove(aVar);
                    }
                }, this.f66899h);
                N();
                return sVarA;
            case ERROR:
                return j0.n.n(new IllegalStateException("Encoder is in error state."));
            case RELEASED:
                return j0.n.n(new IllegalStateException("Encoder is released."));
            default:
                throw new IllegalStateException("Unknown state: " + this.f66911t);
        }
    }

    long E() {
        return this.f66908q.b();
    }

    long F(@NonNull MediaCodec.BufferInfo bufferInfo) {
        long j11 = this.f66913v;
        return j11 > 0 ? bufferInfo.presentationTimeUs - j11 : bufferInfo.presentationTimeUs;
    }

    void G(final int i11, final String str, final Throwable th2) {
        switch (this.f66911t) {
            case CONFIGURED:
                O(i11, str, th2);
                R();
                break;
            case STARTED:
            case PAUSED:
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
            case PENDING_RELEASE:
                T(d.ERROR);
                X(new Runnable() { // from class: g1.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f66830a.O(i11, str, th2);
                    }
                });
                break;
            case ERROR:
                c0.y0.m(this.f66892a, "Get more than one error: " + str + "(" + i11 + ")", th2);
                break;
        }
    }

    void H(@NonNull MediaCodec.CodecException codecException) {
        G(1, codecException.getMessage(), codecException);
    }

    void I() {
        d dVar = this.f66911t;
        if (dVar == d.PENDING_RELEASE) {
            P();
            return;
        }
        if (!this.A) {
            R();
        }
        T(d.CONFIGURED);
        if (dVar == d.PENDING_START || dVar == d.PENDING_START_PAUSED) {
            start();
            if (dVar == d.PENDING_START_PAUSED) {
                d();
            }
        }
    }

    boolean L(long j11) {
        for (Range<Long> range : this.f66906o) {
            if (range.contains(Long.valueOf(j11))) {
                return true;
            }
            if (j11 < ((Long) range.getLower()).longValue()) {
                break;
            }
        }
        return false;
    }

    void N() {
        while (!this.f66903l.isEmpty() && !this.f66902k.isEmpty()) {
            androidx.concurrent.futures.c.a aVarPoll = this.f66903l.poll();
            Objects.requireNonNull(aVarPoll);
            Integer numPoll = this.f66902k.poll();
            Objects.requireNonNull(numPoll);
            try {
                final h1 h1Var = new h1(this.f66896e, numPoll.intValue());
                if (aVarPoll.c(h1Var)) {
                    this.f66904m.add(h1Var);
                    h1Var.c().b(new Runnable() { // from class: g1.f0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f66886a.f66904m.remove(h1Var);
                        }
                    }, this.f66899h);
                } else {
                    h1Var.cancel();
                }
            } catch (MediaCodec.CodecException e11) {
                H(e11);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O(final int i11, final String str, final Throwable th2) {
        final l lVar;
        Executor executor;
        synchronized (this.f66893b) {
            lVar = this.f66909r;
            executor = this.f66910s;
        }
        try {
            executor.execute(new Runnable() { // from class: g1.b0
                @Override // java.lang.Runnable
                public final void run() {
                    lVar.d(new EncodeException(i11, str, th2));
                }
            });
        } catch (RejectedExecutionException e11) {
            c0.y0.d(this.f66892a, "Unable to post to the supplied executor.", e11);
        }
    }

    void Q() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        this.f66896e.setParameters(bundle);
    }

    void S(boolean z11) {
        Bundle bundle = new Bundle();
        bundle.putInt("drop-input-frames", z11 ? 1 : 0);
        this.f66896e.setParameters(bundle);
    }

    void U() {
        c0.y0.a(this.f66892a, "signalCodecStop");
        k.b bVar = this.f66897f;
        if (bVar instanceof c) {
            ((c) bVar).q(false);
            ArrayList arrayList = new ArrayList();
            Iterator<f1> it = this.f66904m.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().c());
            }
            j0.n.w(arrayList).b(new Runnable() { // from class: g1.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f66984a.V();
                }
            }, this.f66899h);
            return;
        }
        if (bVar instanceof f) {
            try {
                C();
                this.f66896e.signalEndOfInputStream();
                this.C = true;
            } catch (MediaCodec.CodecException e11) {
                H(e11);
            }
        }
    }

    public void W() {
        this.f66899h.execute(new Runnable() { // from class: g1.c0
            @Override // java.lang.Runnable
            public final void run() {
                g0.p(this.f66853a);
            }
        });
    }

    void X(final Runnable runnable) {
        c0.y0.a(this.f66892a, "stopMediaCodec");
        final ArrayList arrayList = new ArrayList();
        Iterator<j> it = this.f66905n.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().n());
        }
        Iterator<f1> it2 = this.f66904m.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().c());
        }
        if (!arrayList.isEmpty()) {
            c0.y0.a(this.f66892a, "Waiting for resources to return. encoded data = " + this.f66905n.size() + ", input buffers = " + this.f66904m.size());
        }
        j0.n.w(arrayList).b(new Runnable() { // from class: g1.d0
            @Override // java.lang.Runnable
            public final void run() {
                g0.v(this.f66874a, arrayList, runnable);
            }
        }, this.f66899h);
    }

    void Y(long j11) {
        while (!this.f66906o.isEmpty()) {
            Range<Long> first = this.f66906o.getFirst();
            if (j11 <= ((Long) first.getUpper()).longValue()) {
                return;
            }
            this.f66906o.removeFirst();
            this.f66913v += ((Long) first.getUpper()).longValue() - ((Long) first.getLower()).longValue();
            c0.y0.a(this.f66892a, "Total paused duration = " + b1.d.c(this.f66913v));
        }
    }

    @Override // g1.k
    public void a(final long j11) {
        final long jE = E();
        this.f66899h.execute(new Runnable() { // from class: g1.e0
            @Override // java.lang.Runnable
            public final void run() {
                g0.r(this.f66880a, j11, jE);
            }
        });
    }

    @Override // g1.k
    @NonNull
    public k.b b() {
        return this.f66897f;
    }

    @Override // g1.k
    public void c(@NonNull l lVar, @NonNull Executor executor) {
        synchronized (this.f66893b) {
            this.f66909r = lVar;
            this.f66910s = executor;
        }
    }

    @Override // g1.k
    public void d() {
        final long jE = E();
        this.f66899h.execute(new Runnable() { // from class: g1.o
            @Override // java.lang.Runnable
            public final void run() {
                g0.l(this.f66980a, jE);
            }
        });
    }

    @Override // g1.k
    @NonNull
    public com.google.common.util.concurrent.s<Void> e() {
        return this.f66900i;
    }

    @Override // g1.k
    public void f() {
        this.f66899h.execute(new Runnable() { // from class: g1.s
            @Override // java.lang.Runnable
            public final void run() {
                g0.j(this.f66995a);
            }
        });
    }

    @Override // g1.k
    public int g() {
        if (this.f66895d.containsKey("bitrate")) {
            return this.f66895d.getInteger("bitrate");
        }
        return 0;
    }

    @Override // g1.k
    @NonNull
    public d1 getEncoderInfo() {
        return this.f66898g;
    }

    @Override // g1.k
    public void release() {
        this.f66899h.execute(new Runnable() { // from class: g1.x
            @Override // java.lang.Runnable
            public final void run() {
                g0.w(this.f67012a);
            }
        });
    }

    @Override // g1.k
    public void start() {
        final long jE = E();
        this.f66899h.execute(new Runnable() { // from class: g1.y
            @Override // java.lang.Runnable
            public final void run() {
                g0.s(this.f67015a, jE);
            }
        });
    }

    class a implements j0.c<f1> {
        a() {
        }

        @Override // j0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(f1 f1Var) {
            f1Var.d(g0.this.E());
            f1Var.a(true);
            f1Var.b();
            j0.n.j(f1Var.c(), new C1373a(), g0.this.f66899h);
        }

        @Override // j0.c
        public void onFailure(@NonNull Throwable th2) {
            g0.this.G(0, "Unable to acquire InputBuffer.", th2);
        }

        /* JADX INFO: renamed from: g1.g0$a$a, reason: collision with other inner class name */
        class C1373a implements j0.c<Void> {
            C1373a() {
            }

            @Override // j0.c
            public void onFailure(@NonNull Throwable th2) {
                if (th2 instanceof MediaCodec.CodecException) {
                    g0.this.H((MediaCodec.CodecException) th2);
                } else {
                    g0.this.G(0, th2.getMessage(), th2);
                }
            }

            @Override // j0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Void r11) {
            }
        }
    }
}
