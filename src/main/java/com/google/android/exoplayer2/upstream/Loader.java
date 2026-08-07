package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import ts.n0;
import ts.p0;
import ts.u;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class Loader {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f41040d = g(false, -9223372036854775807L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f41041e = g(true, -9223372036854775807L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f41042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f41043g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f41044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d<? extends e> f41045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IOException f41046c;

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th2) {
            super("Unexpected " + th2.getClass().getSimpleName() + ": " + th2.getMessage(), th2);
        }
    }

    public interface b<T extends e> {
        void q(T t11, long j11, long j12, boolean z11);

        void r(T t11, long j11, long j12);

        c t(T t11, long j11, long j12, IOException iOException, int i11);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f41047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f41048b;

        public boolean c() {
            int i11 = this.f41047a;
            return i11 == 0 || i11 == 1;
        }

        private c(int i11, long j11) {
            this.f41047a = i11;
            this.f41048b = j11;
        }
    }

    @SuppressLint({"HandlerLeak"})
    private final class d<T extends e> extends Handler implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f41049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T f41050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f41051c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private b<T> f41052d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private IOException f41053e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f41054f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Thread f41055g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f41056h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private volatile boolean f41057i;

        public d(Looper looper, T t11, b<T> bVar, int i11, long j11) {
            super(looper);
            this.f41050b = t11;
            this.f41052d = bVar;
            this.f41049a = i11;
            this.f41051c = j11;
        }

        private void b() {
            this.f41053e = null;
            Loader.this.f41044a.execute((Runnable) ts.a.e(Loader.this.f41045b));
        }

        private void c() {
            Loader.this.f41045b = null;
        }

        private long d() {
            return Math.min((this.f41054f - 1) * 1000, 5000);
        }

        public void a(boolean z11) {
            this.f41057i = z11;
            this.f41053e = null;
            if (hasMessages(0)) {
                this.f41056h = true;
                removeMessages(0);
                if (!z11) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f41056h = true;
                        this.f41050b.b();
                        Thread thread = this.f41055g;
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
                ((b) ts.a.e(this.f41052d)).q(this.f41050b, jElapsedRealtime, jElapsedRealtime - this.f41051c, true);
                this.f41052d = null;
            }
        }

        public void e(int i11) throws IOException {
            IOException iOException = this.f41053e;
            if (iOException != null && this.f41054f > i11) {
                throw iOException;
            }
        }

        public void f(long j11) {
            ts.a.g(Loader.this.f41045b == null);
            Loader.this.f41045b = this;
            if (j11 > 0) {
                sendEmptyMessageDelayed(0, j11);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f41057i) {
                return;
            }
            int i11 = message.what;
            if (i11 == 0) {
                b();
                return;
            }
            if (i11 == 3) {
                throw ((Error) message.obj);
            }
            c();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j11 = jElapsedRealtime - this.f41051c;
            b bVar = (b) ts.a.e(this.f41052d);
            if (this.f41056h) {
                bVar.q(this.f41050b, jElapsedRealtime, j11, false);
                return;
            }
            int i12 = message.what;
            if (i12 == 1) {
                try {
                    bVar.r(this.f41050b, jElapsedRealtime, j11);
                    return;
                } catch (RuntimeException e11) {
                    u.d("LoadTask", "Unexpected exception handling load completed", e11);
                    Loader.this.f41046c = new UnexpectedLoaderException(e11);
                    return;
                }
            }
            if (i12 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f41053e = iOException;
            int i13 = this.f41054f + 1;
            this.f41054f = i13;
            c cVarT = bVar.t(this.f41050b, jElapsedRealtime, j11, iOException, i13);
            if (cVarT.f41047a == 3) {
                Loader.this.f41046c = this.f41053e;
            } else if (cVarT.f41047a != 2) {
                if (cVarT.f41047a == 1) {
                    this.f41054f = 1;
                }
                f(cVarT.f41048b != -9223372036854775807L ? cVarT.f41048b : d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z11;
            try {
                synchronized (this) {
                    z11 = this.f41056h;
                    this.f41055g = Thread.currentThread();
                }
                if (!z11) {
                    n0.a("load:" + this.f41050b.getClass().getSimpleName());
                    try {
                        this.f41050b.a();
                        n0.c();
                    } catch (Throwable th2) {
                        n0.c();
                        throw th2;
                    }
                }
                synchronized (this) {
                    this.f41055g = null;
                    Thread.interrupted();
                }
                if (this.f41057i) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e11) {
                if (this.f41057i) {
                    return;
                }
                obtainMessage(2, e11).sendToTarget();
            } catch (Error e12) {
                if (!this.f41057i) {
                    u.d("LoadTask", "Unexpected error loading stream", e12);
                    obtainMessage(3, e12).sendToTarget();
                }
                throw e12;
            } catch (Exception e13) {
                if (this.f41057i) {
                    return;
                }
                u.d("LoadTask", "Unexpected exception loading stream", e13);
                obtainMessage(2, new UnexpectedLoaderException(e13)).sendToTarget();
            } catch (OutOfMemoryError e14) {
                if (this.f41057i) {
                    return;
                }
                u.d("LoadTask", "OutOfMemory error loading stream", e14);
                obtainMessage(2, new UnexpectedLoaderException(e14)).sendToTarget();
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
        private final f f41059a;

        public g(f fVar) {
            this.f41059a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f41059a.i();
        }
    }

    static {
        long j11 = -9223372036854775807L;
        f41042f = new c(2, j11);
        f41043g = new c(3, j11);
    }

    public Loader(String str) {
        this.f41044a = p0.E0("ExoPlayer:Loader:" + str);
    }

    public static c g(boolean z11, long j11) {
        return new c(z11 ? 1 : 0, j11);
    }

    public void e() {
        ((d) ts.a.i(this.f41045b)).a(false);
    }

    public void f() {
        this.f41046c = null;
    }

    public boolean h() {
        return this.f41046c != null;
    }

    public boolean i() {
        return this.f41045b != null;
    }

    public void j() throws IOException {
        k(Integer.MIN_VALUE);
    }

    public void k(int i11) throws IOException {
        IOException iOException = this.f41046c;
        if (iOException != null) {
            throw iOException;
        }
        d<? extends e> dVar = this.f41045b;
        if (dVar != null) {
            if (i11 == Integer.MIN_VALUE) {
                i11 = dVar.f41049a;
            }
            dVar.e(i11);
        }
    }

    public void l() {
        m(null);
    }

    public void m(f fVar) {
        d<? extends e> dVar = this.f41045b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f41044a.execute(new g(fVar));
        }
        this.f41044a.shutdown();
    }

    public <T extends e> long n(T t11, b<T> bVar, int i11) {
        Looper looper = (Looper) ts.a.i(Looper.myLooper());
        this.f41046c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, t11, bVar, i11, jElapsedRealtime).f(0L);
        return jElapsedRealtime;
    }
}
