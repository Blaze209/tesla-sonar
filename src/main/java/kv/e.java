package kv;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import bv.g;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.c0;
import com.google.firebase.crashlytics.internal.common.p0;
import com.google.firebase.crashlytics.internal.common.w0;
import gv.f0;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import nq.f;
import nq.i;
import nq.k;
import pq.l;

/* JADX INFO: loaded from: classes5.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f89419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f89420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f89421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f89422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f89423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final BlockingQueue<Runnable> f89424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ThreadPoolExecutor f89425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i<f0> f89426h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p0 f89427i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f89428j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f89429k;

    private final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c0 f89430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TaskCompletionSource<c0> f89431b;

        @Override // java.lang.Runnable
        public void run() {
            e.this.n(this.f89430a, this.f89431b);
            e.this.f89427i.c();
            double dG = e.this.g();
            g.f().b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dG / 1000.0d)) + " s for report: " + this.f89430a.d());
            e.o(dG);
        }

        private b(c0 c0Var, TaskCompletionSource<c0> taskCompletionSource) {
            this.f89430a = c0Var;
            this.f89431b = taskCompletionSource;
        }
    }

    e(i<f0> iVar, lv.d dVar, p0 p0Var) {
        this(dVar.f90798f, dVar.f90799g, ((long) dVar.f90800h) * 1000, iVar, p0Var);
    }

    public static /* synthetic */ void a(e eVar, TaskCompletionSource taskCompletionSource, boolean z11, c0 c0Var, Exception exc) {
        eVar.getClass();
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (z11) {
            eVar.j();
        }
        taskCompletionSource.trySetResult(c0Var);
    }

    public static /* synthetic */ void b(e eVar, CountDownLatch countDownLatch) {
        eVar.getClass();
        try {
            l.a(eVar.f89426h, f.HIGHEST);
        } catch (Exception unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double g() {
        return Math.min(3600000.0d, (60000.0d / this.f89419a) * Math.pow(this.f89420b, h()));
    }

    private int h() {
        if (this.f89429k == 0) {
            this.f89429k = m();
        }
        int iM = (int) ((m() - this.f89429k) / this.f89421c);
        int iMin = l() ? Math.min(100, this.f89428j + iM) : Math.max(0, this.f89428j - iM);
        if (this.f89428j != iMin) {
            this.f89428j = iMin;
            this.f89429k = m();
        }
        return iMin;
    }

    private boolean k() {
        return this.f89424f.size() < this.f89423e;
    }

    private boolean l() {
        return this.f89424f.size() == this.f89423e;
    }

    private long m() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(final c0 c0Var, final TaskCompletionSource<c0> taskCompletionSource) {
        g.f().b("Sending report through Google DataTransport: " + c0Var.d());
        final boolean z11 = SystemClock.elapsedRealtime() - this.f89422d < 2000;
        this.f89426h.b(nq.d.i(c0Var.b()), new k() { // from class: kv.c
            @Override // nq.k
            public final void a(Exception exc) {
                e.a(this.f89413a, taskCompletionSource, z11, c0Var, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(double d11) {
        try {
            Thread.sleep((long) d11);
        } catch (InterruptedException unused) {
        }
    }

    TaskCompletionSource<c0> i(c0 c0Var, boolean z11) {
        synchronized (this.f89424f) {
            try {
                TaskCompletionSource<c0> taskCompletionSource = new TaskCompletionSource<>();
                if (!z11) {
                    n(c0Var, taskCompletionSource);
                    return taskCompletionSource;
                }
                this.f89427i.b();
                if (!k()) {
                    h();
                    g.f().b("Dropping report due to queue being full: " + c0Var.d());
                    this.f89427i.a();
                    taskCompletionSource.trySetResult(c0Var);
                    return taskCompletionSource;
                }
                g.f().b("Enqueueing report: " + c0Var.d());
                g.f().b("Queue size: " + this.f89424f.size());
                this.f89425g.execute(new b(c0Var, taskCompletionSource));
                g.f().b("Closing task for report: " + c0Var.d());
                taskCompletionSource.trySetResult(c0Var);
                return taskCompletionSource;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @SuppressLint({"DiscouragedApi", "ThreadPoolCreation"})
    public void j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: kv.d
            @Override // java.lang.Runnable
            public final void run() {
                e.b(this.f89417a, countDownLatch);
            }
        }).start();
        w0.c(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    @SuppressLint({"ThreadPoolCreation"})
    e(double d11, double d12, long j11, i<f0> iVar, p0 p0Var) {
        this.f89419a = d11;
        this.f89420b = d12;
        this.f89421c = j11;
        this.f89426h = iVar;
        this.f89427i = p0Var;
        this.f89422d = SystemClock.elapsedRealtime();
        int i11 = (int) d11;
        this.f89423e = i11;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i11);
        this.f89424f = arrayBlockingQueue;
        this.f89425g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f89428j = 0;
        this.f89429k = 0L;
    }
}
