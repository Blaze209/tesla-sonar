package androidx.camera.video.internal.audio;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.g2;
import c0.y0;
import com.google.common.util.concurrent.s;
import g1.f1;
import j0.n;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import u5.h;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Executor f3591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<Boolean> f3592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicBoolean f3593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AudioStream f3594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final g f3595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f3596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    e f3597g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    b1.c.a f3598h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f3599i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Executor f3600j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    c f3601k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    b1.c<? extends f1> f3602l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private j0.c<f1> f3603m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private g2.a<b1.c.a> f3604n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f3605o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f3606p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    boolean f3607q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f3608r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private byte[] f3609s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    double f3610t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    long f3611u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f3612v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f3613w;

    class a implements g2.a<b1.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b1.c f3614a;

        a(b1.c cVar) {
            this.f3614a = cVar;
        }

        @Override // androidx.camera.core.impl.g2.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(b1.c.a aVar) {
            Objects.requireNonNull(aVar);
            if (b.this.f3602l == this.f3614a) {
                y0.a("AudioSource", "Receive BufferProvider state change: " + b.this.f3598h + " to " + aVar);
                b bVar = b.this;
                if (bVar.f3598h != aVar) {
                    bVar.f3598h = aVar;
                    bVar.H();
                }
            }
        }

        @Override // androidx.camera.core.impl.g2.a
        public void onError(@NonNull Throwable th2) {
            b bVar = b.this;
            if (bVar.f3602l == this.f3614a) {
                bVar.r(th2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.camera.video.internal.audio.b$b, reason: collision with other inner class name */
    class C0070b implements j0.c<f1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b1.c f3616a;

        C0070b(b1.c cVar) {
            this.f3616a = cVar;
        }

        @Override // j0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(f1 f1Var) {
            b bVar = b.this;
            if (!bVar.f3599i || bVar.f3602l != this.f3616a) {
                f1Var.cancel();
                return;
            }
            if (bVar.f3605o && bVar.p()) {
                b.this.y();
            }
            AudioStream audioStreamM = b.this.m();
            ByteBuffer byteBufferG = f1Var.g();
            AudioStream.b bVar2 = audioStreamM.read(byteBufferG);
            if (bVar2.a() > 0) {
                b bVar3 = b.this;
                if (bVar3.f3608r) {
                    bVar3.u(byteBufferG, bVar2.a());
                }
                if (b.this.f3600j != null) {
                    long jB = bVar2.b();
                    b bVar4 = b.this;
                    if (jB - bVar4.f3611u >= 200) {
                        bVar4.f3611u = bVar2.b();
                        b.this.v(byteBufferG);
                    }
                }
                byteBufferG.limit(byteBufferG.position() + bVar2.a());
                f1Var.d(TimeUnit.NANOSECONDS.toMicros(bVar2.b()));
                f1Var.b();
            } else {
                y0.l("AudioSource", "Unable to read data from AudioStream.");
                f1Var.cancel();
            }
            b.this.z();
        }

        @Override // j0.c
        public void onFailure(@NonNull Throwable th2) {
            if (b.this.f3602l != this.f3616a) {
                return;
            }
            y0.a("AudioSource", "Unable to get input buffer, the BufferProvider could be transitioning to INACTIVE state.");
            if (th2 instanceof IllegalStateException) {
                return;
            }
            b.this.r(th2);
        }
    }

    public interface c {
        void a(boolean z11);

        void b(double d11);

        default void c(boolean z11) {
        }

        void onError(@NonNull Throwable th2);
    }

    class d implements AudioStream.a {
        d() {
        }

        @Override // androidx.camera.video.internal.audio.AudioStream.a
        public void a(boolean z11) {
            b bVar = b.this;
            bVar.f3607q = z11;
            if (bVar.f3597g == e.STARTED) {
                bVar.s();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public enum e {
        CONFIGURED,
        STARTED,
        RELEASED
    }

    public b(@NonNull c1.a aVar, @NonNull Executor executor, Context context) {
        this(aVar, executor, context, new androidx.camera.video.internal.audio.c() { // from class: androidx.camera.video.internal.audio.a
            @Override // androidx.camera.video.internal.audio.c
            public final AudioStream a(c1.a aVar2, Context context2) {
                return new d(aVar2, context2);
            }
        }, 3000L);
    }

    private void E() {
        if (this.f3599i) {
            return;
        }
        try {
            y0.a("AudioSource", "startSendingAudio");
            this.f3594d.start();
            this.f3605o = false;
        } catch (AudioStream.AudioStreamException e11) {
            y0.m("AudioSource", "Failed to start AudioStream", e11);
            this.f3605o = true;
            this.f3595e.start();
            this.f3606p = n();
            s();
        }
        this.f3599i = true;
        z();
    }

    private void G() {
        if (this.f3599i) {
            this.f3599i = false;
            y0.a("AudioSource", "stopSendingAudio");
            this.f3594d.stop();
        }
    }

    public static /* synthetic */ Object a(final b bVar, final androidx.concurrent.futures.c.a aVar) {
        bVar.f3591a.execute(new Runnable() { // from class: c1.j
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.video.internal.audio.b.f(this.f18531a, aVar);
            }
        });
        return "AudioSource-release";
    }

    public static /* synthetic */ void b(b bVar, Executor executor, c cVar) {
        int iOrdinal = bVar.f3597g.ordinal();
        if (iOrdinal == 0) {
            bVar.f3600j = executor;
            bVar.f3601k = cVar;
        } else if (iOrdinal == 1 || iOrdinal == 2) {
            throw new AssertionError("The audio recording callback must be registered before the audio source is started.");
        }
    }

    public static /* synthetic */ void d(b bVar, b1.c cVar) {
        int iOrdinal = bVar.f3597g.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                throw new AssertionError("AudioSource is released");
            }
        } else if (bVar.f3602l != cVar) {
            bVar.x(cVar);
        }
    }

    public static /* synthetic */ void e(b bVar, boolean z11) {
        int iOrdinal = bVar.f3597g.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                throw new AssertionError("AudioSource is released");
            }
        } else {
            if (bVar.f3608r == z11) {
                return;
            }
            bVar.f3608r = z11;
            if (bVar.f3597g == e.STARTED) {
                bVar.s();
            }
        }
    }

    public static /* synthetic */ void f(b bVar, androidx.concurrent.futures.c.a aVar) {
        bVar.getClass();
        try {
            int iOrdinal = bVar.f3597g.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                bVar.x(null);
                bVar.f3595e.release();
                bVar.f3594d.release();
                bVar.G();
                bVar.C(e.RELEASED);
            }
            aVar.c(null);
        } catch (Throwable th2) {
            aVar.f(th2);
        }
    }

    public static /* synthetic */ void g(b bVar) {
        int iOrdinal = bVar.f3597g.ordinal();
        if (iOrdinal == 1) {
            bVar.C(e.CONFIGURED);
            bVar.H();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            y0.l("AudioSource", "AudioSource is released. Calling stop() is a no-op.");
        }
    }

    public static /* synthetic */ void k(b bVar, boolean z11) {
        int iOrdinal = bVar.f3597g.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 2) {
                throw new AssertionError("AudioSource is released");
            }
            return;
        }
        bVar.f3592b.set(null);
        bVar.f3593c.set(false);
        bVar.C(e.STARTED);
        bVar.q(z11);
        bVar.H();
    }

    private static b1.c.a l(@NonNull b1.c<? extends f1> cVar) {
        try {
            s<? extends f1> sVarB = cVar.b();
            if (sVarB.isDone()) {
                return (b1.c.a) sVarB.get();
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        return null;
    }

    private static long n() {
        return System.nanoTime();
    }

    public static boolean o(int i11, int i12, int i13) {
        return androidx.camera.video.internal.audio.d.k(i11, i12, i13);
    }

    private void x(b1.c<? extends f1> cVar) {
        b1.c<? extends f1> cVar2 = this.f3602l;
        if (cVar2 != null) {
            g2.a<b1.c.a> aVar = this.f3604n;
            Objects.requireNonNull(aVar);
            cVar2.d(aVar);
            this.f3602l = null;
            this.f3604n = null;
            this.f3603m = null;
            this.f3598h = b1.c.a.INACTIVE;
            H();
        }
        if (cVar != null) {
            this.f3602l = cVar;
            this.f3604n = new a(cVar);
            this.f3603m = new C0070b(cVar);
            b1.c.a aVarL = l(cVar);
            if (aVarL != null) {
                this.f3598h = aVarL;
                H();
            }
            this.f3602l.c(this.f3591a, this.f3604n);
        }
    }

    public void A(@NonNull final Executor executor, @NonNull final c cVar) {
        this.f3591a.execute(new Runnable() { // from class: c1.k
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.video.internal.audio.b.b(this.f18533a, executor, cVar);
            }
        });
    }

    public void B(@NonNull final b1.c<? extends f1> cVar) {
        this.f3591a.execute(new Runnable() { // from class: c1.g
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.video.internal.audio.b.d(this.f18525a, cVar);
            }
        });
    }

    void C(e eVar) {
        y0.a("AudioSource", "Transitioning internal state: " + this.f3597g + " --> " + eVar);
        this.f3597g = eVar;
    }

    public void D(final boolean z11) {
        this.f3591a.execute(new Runnable() { // from class: c1.f
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.video.internal.audio.b.k(this.f18523a, z11);
            }
        });
    }

    public void F() {
        this.f3591a.execute(new Runnable() { // from class: c1.b
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.video.internal.audio.b.g(this.f18517a);
            }
        });
    }

    void H() {
        if (this.f3597g != e.STARTED) {
            G();
            return;
        }
        boolean z11 = this.f3598h == b1.c.a.ACTIVE;
        t(!z11);
        if (z11) {
            E();
        } else {
            G();
        }
    }

    @NonNull
    AudioStream m() {
        return this.f3605o ? this.f3595e : this.f3594d;
    }

    boolean p() {
        h.i(this.f3606p > 0);
        return n() - this.f3606p >= this.f3596f;
    }

    public void q(final boolean z11) {
        this.f3591a.execute(new Runnable() { // from class: c1.h
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.video.internal.audio.b.e(this.f18527a, z11);
            }
        });
    }

    void r(@NonNull final Throwable th2) {
        Executor executor = this.f3600j;
        final c cVar = this.f3601k;
        if (executor == null || cVar == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: c1.d
            @Override // java.lang.Runnable
            public final void run() {
                cVar.onError(th2);
            }
        });
    }

    void s() {
        Executor executor = this.f3600j;
        final c cVar = this.f3601k;
        if (executor == null || cVar == null) {
            return;
        }
        final boolean z11 = this.f3608r || this.f3605o || this.f3607q;
        if (Objects.equals(this.f3592b.getAndSet(Boolean.valueOf(z11)), Boolean.valueOf(z11))) {
            return;
        }
        executor.execute(new Runnable() { // from class: c1.i
            @Override // java.lang.Runnable
            public final void run() {
                cVar.a(z11);
            }
        });
    }

    void t(final boolean z11) {
        Executor executor = this.f3600j;
        final c cVar = this.f3601k;
        if (executor == null || cVar == null || this.f3593c.getAndSet(z11) == z11) {
            return;
        }
        executor.execute(new Runnable() { // from class: c1.c
            @Override // java.lang.Runnable
            public final void run() {
                cVar.c(z11);
            }
        });
    }

    void u(@NonNull ByteBuffer byteBuffer, int i11) {
        byte[] bArr = this.f3609s;
        if (bArr == null || bArr.length < i11) {
            this.f3609s = new byte[i11];
        }
        int iPosition = byteBuffer.position();
        byteBuffer.put(this.f3609s, 0, i11);
        byteBuffer.limit(byteBuffer.position()).position(iPosition);
    }

    void v(ByteBuffer byteBuffer) {
        Executor executor = this.f3600j;
        final c cVar = this.f3601k;
        if (this.f3612v == 2) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            double dMax = 0.0d;
            while (shortBufferAsShortBuffer.hasRemaining()) {
                dMax = Math.max(dMax, Math.abs((int) shortBufferAsShortBuffer.get()));
            }
            this.f3610t = dMax / 32767.0d;
            if (executor == null || cVar == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: c1.l
                @Override // java.lang.Runnable
                public final void run() {
                    cVar.b(this.f18536a.f3610t);
                }
            });
        }
    }

    @NonNull
    public s<Void> w() {
        return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: c1.e
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return androidx.camera.video.internal.audio.b.a(this.f18522a, aVar);
            }
        });
    }

    void y() {
        h.i(this.f3605o);
        try {
            this.f3594d.start();
            y0.a("AudioSource", "Retry start AudioStream succeed");
            this.f3595e.stop();
            this.f3605o = false;
        } catch (AudioStream.AudioStreamException e11) {
            y0.m("AudioSource", "Retry start AudioStream failed", e11);
            this.f3606p = n();
        }
    }

    void z() {
        b1.c<? extends f1> cVar = this.f3602l;
        Objects.requireNonNull(cVar);
        s<? extends f1> sVarE = cVar.e();
        j0.c<f1> cVar2 = this.f3603m;
        Objects.requireNonNull(cVar2);
        n.j(sVarE, cVar2, this.f3591a);
    }

    b(@NonNull c1.a aVar, @NonNull Executor executor, Context context, @NonNull androidx.camera.video.internal.audio.c cVar, long j11) throws AudioSourceAccessException {
        this.f3592b = new AtomicReference<>(null);
        this.f3593c = new AtomicBoolean(false);
        this.f3597g = e.CONFIGURED;
        this.f3598h = b1.c.a.INACTIVE;
        this.f3611u = 0L;
        Executor executorG = i0.c.g(executor);
        this.f3591a = executorG;
        this.f3596f = TimeUnit.MILLISECONDS.toNanos(j11);
        try {
            f fVar = new f(cVar.a(aVar, context), aVar);
            this.f3594d = fVar;
            fVar.a(new d(), executorG);
            this.f3595e = new g(aVar);
            this.f3612v = aVar.b();
            this.f3613w = aVar.c();
        } catch (AudioStream.AudioStreamException | IllegalArgumentException e11) {
            throw new AudioSourceAccessException("Unable to create AudioStream", e11);
        }
    }
}
