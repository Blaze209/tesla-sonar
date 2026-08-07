package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import com.google.firebase.perf.util.o;
import com.google.firebase.perf.v1.AndroidMemoryReading;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final kw.a f44537f = kw.a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f44538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue<AndroidMemoryReading> f44539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runtime f44540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ScheduledFuture f44541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f44542e;

    @SuppressLint({"ThreadPoolCreation"})
    l() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    public static /* synthetic */ void a(l lVar, com.google.firebase.perf.util.l lVar2) {
        AndroidMemoryReading androidMemoryReadingJ = lVar.j(lVar2);
        if (androidMemoryReadingJ != null) {
            lVar.f44539b.add(androidMemoryReadingJ);
        }
    }

    public static /* synthetic */ void b(l lVar, com.google.firebase.perf.util.l lVar2) {
        AndroidMemoryReading androidMemoryReadingJ = lVar.j(lVar2);
        if (androidMemoryReadingJ != null) {
            lVar.f44539b.add(androidMemoryReadingJ);
        }
    }

    private int d() {
        return o.c(com.google.firebase.perf.util.k.BYTES.toKilobytes(this.f44540c.totalMemory() - this.f44540c.freeMemory()));
    }

    public static boolean e(long j11) {
        return j11 <= 0;
    }

    private synchronized void f(final com.google.firebase.perf.util.l lVar) {
        try {
            this.f44538a.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.k
                @Override // java.lang.Runnable
                public final void run() {
                    l.b(this.f44535a, lVar);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e11) {
            f44537f.j("Unable to collect Memory Metric: " + e11.getMessage());
        }
    }

    private synchronized void g(long j11, final com.google.firebase.perf.util.l lVar) {
        this.f44542e = j11;
        try {
            this.f44541d = this.f44538a.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.j
                @Override // java.lang.Runnable
                public final void run() {
                    l.a(this.f44533a, lVar);
                }
            }, 0L, j11, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e11) {
            f44537f.j("Unable to start collecting Memory Metrics: " + e11.getMessage());
        }
    }

    private AndroidMemoryReading j(com.google.firebase.perf.util.l lVar) {
        if (lVar == null) {
            return null;
        }
        return AndroidMemoryReading.newBuilder().a(lVar.b()).c(d()).build();
    }

    public void c(com.google.firebase.perf.util.l lVar) {
        f(lVar);
    }

    public void h(long j11, com.google.firebase.perf.util.l lVar) {
        if (e(j11)) {
            return;
        }
        if (this.f44541d == null) {
            g(j11, lVar);
        } else if (this.f44542e != j11) {
            i();
            g(j11, lVar);
        }
    }

    public void i() {
        ScheduledFuture scheduledFuture = this.f44541d;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f44541d = null;
        this.f44542e = -1L;
    }

    l(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.f44541d = null;
        this.f44542e = -1L;
        this.f44538a = scheduledExecutorService;
        this.f44539b = new ConcurrentLinkedQueue<>();
        this.f44540c = runtime;
    }
}
