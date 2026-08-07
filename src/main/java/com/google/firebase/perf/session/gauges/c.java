package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.perf.v1.CpuMetricReading;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final kw.a f44514g = kw.a.e();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f44515h = TimeUnit.SECONDS.toMicros(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ScheduledFuture f44520e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f44521f = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue<CpuMetricReading> f44516a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f44517b = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f44518c = "/proc/" + Integer.toString(Process.myPid()) + "/stat";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f44519d = e();

    @SuppressLint({"ThreadPoolCreation"})
    c() {
    }

    public static /* synthetic */ void a(c cVar, com.google.firebase.perf.util.l lVar) {
        CpuMetricReading cpuMetricReadingK = cVar.k(lVar);
        if (cpuMetricReadingK != null) {
            cVar.f44516a.add(cpuMetricReadingK);
        }
    }

    public static /* synthetic */ void b(c cVar, com.google.firebase.perf.util.l lVar) {
        CpuMetricReading cpuMetricReadingK = cVar.k(lVar);
        if (cpuMetricReadingK != null) {
            cVar.f44516a.add(cpuMetricReadingK);
        }
    }

    private long d(long j11) {
        return Math.round((j11 / this.f44519d) * f44515h);
    }

    private long e() {
        return Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    public static boolean f(long j11) {
        return j11 <= 0;
    }

    private synchronized void g(final com.google.firebase.perf.util.l lVar) {
        try {
            this.f44517b.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.b(this.f44512a, lVar);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e11) {
            f44514g.j("Unable to collect Cpu Metric: " + e11.getMessage());
        }
    }

    private synchronized void h(long j11, final com.google.firebase.perf.util.l lVar) {
        this.f44521f = j11;
        try {
            this.f44520e = this.f44517b.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.a
                @Override // java.lang.Runnable
                public final void run() {
                    c.a(this.f44510a, lVar);
                }
            }, 0L, j11, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e11) {
            f44514g.j("Unable to start collecting Cpu Metrics: " + e11.getMessage());
        }
    }

    private CpuMetricReading k(com.google.firebase.perf.util.l lVar) {
        if (lVar == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.f44518c));
            try {
                long jB = lVar.b();
                String[] strArrSplit = bufferedReader.readLine().split(" ");
                CpuMetricReading cpuMetricReadingBuild = CpuMetricReading.newBuilder().a(jB).b(d(Long.parseLong(strArrSplit[14]) + Long.parseLong(strArrSplit[16]))).c(d(Long.parseLong(strArrSplit[13]) + Long.parseLong(strArrSplit[15]))).build();
                bufferedReader.close();
                return cpuMetricReadingBuild;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e11) {
            f44514g.j("Unable to read 'proc/[pid]/stat' file: " + e11.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e12) {
            e = e12;
            f44514g.j("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NullPointerException e13) {
            e = e13;
            f44514g.j("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NumberFormatException e14) {
            e = e14;
            f44514g.j("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        }
    }

    public void c(com.google.firebase.perf.util.l lVar) {
        g(lVar);
    }

    public void i(long j11, com.google.firebase.perf.util.l lVar) {
        long j12 = this.f44519d;
        if (j12 == -1 || j12 == 0 || f(j11)) {
            return;
        }
        if (this.f44520e == null) {
            h(j11, lVar);
        } else if (this.f44521f != j11) {
            j();
            h(j11, lVar);
        }
    }

    public void j() {
        ScheduledFuture scheduledFuture = this.f44520e;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f44520e = null;
        this.f44521f = -1L;
    }
}
