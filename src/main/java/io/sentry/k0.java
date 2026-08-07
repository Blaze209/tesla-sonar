package io.sentry;

import java.net.InetAddress;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public final class k0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile k0 f80701i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f80703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile String f80704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile long f80705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f80706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Callable<InetAddress> f80707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ExecutorService f80708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f80699g = TimeUnit.HOURS.toMillis(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f80700h = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final io.sentry.util.a f80702j = new io.sentry.util.a();

    private static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f80709a;

        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryHostnameCache-");
            int i11 = this.f80709a;
            this.f80709a = i11 + 1;
            sb2.append(i11);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    private k0() {
        this(f80699g);
    }

    public static /* synthetic */ Void b(k0 k0Var) {
        k0Var.getClass();
        try {
            k0Var.f80704b = k0Var.f80707e.call().getCanonicalHostName();
            k0Var.f80705c = System.currentTimeMillis() + k0Var.f80703a;
            return null;
        } finally {
            k0Var.f80706d.set(false);
        }
    }

    public static k0 e() {
        if (f80701i == null) {
            d1 d1VarA = f80702j.a();
            try {
                if (f80701i == null) {
                    f80701i = new k0();
                }
                if (d1VarA != null) {
                    d1VarA.close();
                }
            } catch (Throwable th2) {
                if (d1VarA != null) {
                    try {
                        d1VarA.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        return f80701i;
    }

    private void f() {
        this.f80705c = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(1L);
    }

    private void g() {
        try {
            this.f80708f.submit(new Callable() { // from class: io.sentry.j0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return k0.b(this.f80683a);
                }
            }).get(f80700h, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            f();
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            f();
        }
    }

    void c() {
        this.f80708f.shutdown();
    }

    public String d() {
        if (this.f80705c < System.currentTimeMillis() && this.f80706d.compareAndSet(false, true)) {
            g();
        }
        return this.f80704b;
    }

    k0(long j11) {
        this(j11, new Callable() { // from class: io.sentry.i0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return InetAddress.getLocalHost();
            }
        });
    }

    k0(long j11, Callable<InetAddress> callable) {
        this.f80706d = new AtomicBoolean(false);
        this.f80708f = Executors.newSingleThreadExecutor(new b());
        this.f80703a = j11;
        this.f80707e = (Callable) io.sentry.util.y.c(callable, "getLocalhost is required");
        g();
    }
}
