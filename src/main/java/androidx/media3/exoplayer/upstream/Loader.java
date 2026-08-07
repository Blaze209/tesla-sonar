package androidx.media3.exoplayer.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import s7.j0;
import s7.n;
import s7.q0;
import s7.t;
import s8.k;

/* JADX INFO: loaded from: classes3.dex */
public final class Loader implements k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f11135d = h(false, -9223372036854775807L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f11136e = h(true, -9223372036854775807L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f11137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f11138g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t8.b f11139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d<? extends e> f11140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IOException f11141c;

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th2) {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unexpected ");
            sb2.append(th2.getClass().getSimpleName());
            if (th2.getMessage() != null) {
                str = ": " + th2.getMessage();
            } else {
                str = "";
            }
            sb2.append(str);
            super(sb2.toString(), th2);
        }
    }

    public interface b<T extends e> {
        c p(T t11, long j11, long j12, IOException iOException, int i11);

        default void q(T t11, long j11, long j12, int i11) {
        }

        void s(T t11, long j11, long j12, boolean z11);

        void v(T t11, long j11, long j12);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f11142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f11143b;

        public boolean c() {
            int i11 = this.f11142a;
            return i11 == 0 || i11 == 1;
        }

        private c(int i11, long j11) {
            this.f11142a = i11;
            this.f11143b = j11;
        }
    }

    @SuppressLint({"HandlerLeak"})
    private final class d<T extends e> extends Handler implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f11144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T f11145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f11146c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private b<T> f11147d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private IOException f11148e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f11149f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Thread f11150g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f11151h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private volatile boolean f11152i;

        public d(Looper looper, T t11, b<T> bVar, int i11, long j11) {
            super(looper);
            this.f11145b = t11;
            this.f11147d = bVar;
            this.f11144a = i11;
            this.f11146c = j11;
        }

        private void b() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ((b) s7.a.f(this.f11147d)).q(this.f11145b, jElapsedRealtime, jElapsedRealtime - this.f11146c, this.f11149f);
            this.f11148e = null;
            Loader.this.f11139a.execute((Runnable) s7.a.f(Loader.this.f11140b));
        }

        private void c() {
            Loader.this.f11140b = null;
        }

        private long d() {
            return Math.min((this.f11149f - 1) * 1000, 5000);
        }

        public void a(boolean z11) {
            this.f11152i = z11;
            this.f11148e = null;
            if (hasMessages(1)) {
                this.f11151h = true;
                removeMessages(1);
                if (!z11) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f11151h = true;
                        this.f11145b.b();
                        Thread thread = this.f11150g;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (z11) {
                c();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((b) s7.a.f(this.f11147d)).s(this.f11145b, jElapsedRealtime, jElapsedRealtime - this.f11146c, true);
                this.f11147d = null;
            }
        }

        public void e(int i11) throws IOException {
            IOException iOException = this.f11148e;
            if (iOException != null && this.f11149f > i11) {
                throw iOException;
            }
        }

        public void f(long j11) {
            s7.a.h(Loader.this.f11140b == null);
            Loader.this.f11140b = this;
            if (j11 > 0) {
                sendEmptyMessageDelayed(1, j11);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f11152i) {
                return;
            }
            int i11 = message.what;
            if (i11 == 1) {
                b();
                return;
            }
            if (i11 == 4) {
                throw ((Error) message.obj);
            }
            c();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j11 = jElapsedRealtime - this.f11146c;
            b bVar = (b) s7.a.f(this.f11147d);
            if (this.f11151h) {
                bVar.s(this.f11145b, jElapsedRealtime, j11, false);
                return;
            }
            int i12 = message.what;
            if (i12 == 2) {
                try {
                    bVar.v(this.f11145b, jElapsedRealtime, j11);
                    return;
                } catch (RuntimeException e11) {
                    t.e("LoadTask", "Unexpected exception handling load completed", e11);
                    Loader.this.f11141c = new UnexpectedLoaderException(e11);
                    return;
                }
            }
            if (i12 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f11148e = iOException;
            int i13 = this.f11149f + 1;
            this.f11149f = i13;
            c cVarP = bVar.p(this.f11145b, jElapsedRealtime, j11, iOException, i13);
            if (cVarP.f11142a == 3) {
                Loader.this.f11141c = this.f11148e;
            } else if (cVarP.f11142a != 2) {
                if (cVarP.f11142a == 1) {
                    this.f11149f = 1;
                }
                f(cVarP.f11143b != -9223372036854775807L ? cVarP.f11143b : d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z11;
            try {
                synchronized (this) {
                    z11 = this.f11151h;
                    this.f11150g = Thread.currentThread();
                }
                if (!z11) {
                    j0.a("load:" + this.f11145b.getClass().getSimpleName());
                    try {
                        this.f11145b.a();
                        j0.b();
                    } catch (Throwable th2) {
                        j0.b();
                        throw th2;
                    }
                }
                synchronized (this) {
                    this.f11150g = null;
                    Thread.interrupted();
                }
                if (this.f11152i) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e11) {
                if (this.f11152i) {
                    return;
                }
                obtainMessage(3, e11).sendToTarget();
            } catch (Error e12) {
                if (!this.f11152i) {
                    t.e("LoadTask", "Unexpected error loading stream", e12);
                    obtainMessage(4, e12).sendToTarget();
                }
                throw e12;
            } catch (Exception e13) {
                if (this.f11152i) {
                    return;
                }
                t.e("LoadTask", "Unexpected exception loading stream", e13);
                obtainMessage(3, new UnexpectedLoaderException(e13)).sendToTarget();
            } catch (OutOfMemoryError e14) {
                if (this.f11152i) {
                    return;
                }
                t.e("LoadTask", "OutOfMemory error loading stream", e14);
                obtainMessage(3, new UnexpectedLoaderException(e14)).sendToTarget();
            }
        }
    }

    public interface e {
        void a();

        void b();
    }

    public interface f {
        void i();
    }

    private static final class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f11154a;

        public g(f fVar) {
            this.f11154a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11154a.i();
        }
    }

    static {
        long j11 = -9223372036854775807L;
        f11137f = new c(2, j11);
        f11138g = new c(3, j11);
    }

    public Loader(String str) {
        this(t8.b.c(q0.c1("ExoPlayer:Loader:" + str), new n() { // from class: s8.j
            @Override // s7.n
            public final void accept(Object obj) {
                ((ExecutorService) obj).shutdown();
            }
        }));
    }

    public static c h(boolean z11, long j11) {
        return new c(z11 ? 1 : 0, j11);
    }

    @Override // s8.k
    public void a() throws IOException {
        k(Integer.MIN_VALUE);
    }

    public void f() {
        ((d) s7.a.j(this.f11140b)).a(false);
    }

    public void g() {
        this.f11141c = null;
    }

    public boolean i() {
        return this.f11141c != null;
    }

    public boolean j() {
        return this.f11140b != null;
    }

    public void k(int i11) throws IOException {
        IOException iOException = this.f11141c;
        if (iOException != null) {
            throw iOException;
        }
        d<? extends e> dVar = this.f11140b;
        if (dVar != null) {
            if (i11 == Integer.MIN_VALUE) {
                i11 = dVar.f11144a;
            }
            dVar.e(i11);
        }
    }

    public void l() {
        m(null);
    }

    public void m(f fVar) {
        d<? extends e> dVar = this.f11140b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f11139a.execute(new g(fVar));
        }
        this.f11139a.release();
    }

    public <T extends e> long n(T t11, b<T> bVar, int i11) {
        Looper looper = (Looper) s7.a.j(Looper.myLooper());
        this.f11141c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, t11, bVar, i11, jElapsedRealtime).f(0L);
        return jElapsedRealtime;
    }

    public Loader(t8.b bVar) {
        this.f11139a = bVar;
    }
}
