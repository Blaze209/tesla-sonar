package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f21798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f21799b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f21802e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f21800c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f21801d = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    um.k f21803f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f21804g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    f f21805h = f.IDLE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    long f21806i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    long f21807j = 0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g0.this.d();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g0.this.j();
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21810a;

        static {
            int[] iArr = new int[f.values().length];
            f21810a = iArr;
            try {
                iArr[f.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21810a[f.QUEUED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21810a[f.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21810a[f.RUNNING_AND_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface d {
        void a(um.k kVar, int i11);
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static ScheduledExecutorService f21811a;

        static ScheduledExecutorService a() {
            if (f21811a == null) {
                f21811a = Executors.newSingleThreadScheduledExecutor();
            }
            return f21811a;
        }
    }

    enum f {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING
    }

    public g0(Executor executor, d dVar, int i11) {
        this.f21798a = executor;
        this.f21799b = dVar;
        this.f21802e = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        um.k kVar;
        int i11;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            kVar = this.f21803f;
            i11 = this.f21804g;
            this.f21803f = null;
            this.f21804g = 0;
            this.f21805h = f.RUNNING;
            this.f21807j = jUptimeMillis;
        }
        try {
            if (i(kVar, i11)) {
                this.f21799b.a(kVar, i11);
            }
        } finally {
            um.k.o(kVar);
            g();
        }
    }

    private void e(long j11) {
        Runnable runnableA = vm.a.a(this.f21801d, "JobScheduler_enqueueJob");
        if (j11 > 0) {
            e.a().schedule(runnableA, j11, TimeUnit.MILLISECONDS);
        } else {
            runnableA.run();
        }
    }

    private void g() {
        long jMax;
        boolean z11;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                if (this.f21805h == f.RUNNING_AND_PENDING) {
                    jMax = Math.max(this.f21807j + ((long) this.f21802e), jUptimeMillis);
                    this.f21806i = jUptimeMillis;
                    this.f21805h = f.QUEUED;
                    z11 = true;
                } else {
                    this.f21805h = f.IDLE;
                    jMax = 0;
                    z11 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            e(jMax - jUptimeMillis);
        }
    }

    private static boolean i(um.k kVar, int i11) {
        return com.facebook.imagepipeline.producers.c.d(i11) || com.facebook.imagepipeline.producers.c.m(i11, 4) || um.k.u0(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f21798a.execute(vm.a.a(this.f21800c, "JobScheduler_submitJob"));
    }

    public void c() {
        um.k kVar;
        synchronized (this) {
            kVar = this.f21803f;
            this.f21803f = null;
            this.f21804g = 0;
        }
        um.k.o(kVar);
    }

    public synchronized long f() {
        return this.f21807j - this.f21806i;
    }

    public boolean h() {
        long jMax;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                boolean z11 = false;
                if (!i(this.f21803f, this.f21804g)) {
                    return false;
                }
                int i11 = c.f21810a[this.f21805h.ordinal()];
                if (i11 != 1) {
                    if (i11 == 3) {
                        this.f21805h = f.RUNNING_AND_PENDING;
                    }
                    jMax = 0;
                } else {
                    jMax = Math.max(this.f21807j + ((long) this.f21802e), jUptimeMillis);
                    this.f21806i = jUptimeMillis;
                    this.f21805h = f.QUEUED;
                    z11 = true;
                }
                if (z11) {
                    e(jMax - jUptimeMillis);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean k(um.k kVar, int i11) {
        um.k kVar2;
        if (!i(kVar, i11)) {
            return false;
        }
        synchronized (this) {
            kVar2 = this.f21803f;
            this.f21803f = um.k.n(kVar);
            this.f21804g = i11;
        }
        um.k.o(kVar2);
        return true;
    }
}
