package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import io.sentry.ILogger;
import io.sentry.b7;
import io.sentry.d8;
import io.sentry.i7;
import io.sentry.o3;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f79572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f79573c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f79576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.c0 f79577g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final io.sentry.c1 f79582l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ILogger f79583m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f79571a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Future<?> f79574d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private File f79575e = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArrayDeque<io.sentry.profilemeasurements.b> f79578h = new ArrayDeque<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ArrayDeque<io.sentry.profilemeasurements.b> f79579i = new ArrayDeque<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ArrayDeque<io.sentry.profilemeasurements.b> f79580j = new ArrayDeque<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map<String, io.sentry.profilemeasurements.a> f79581k = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f79584n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected final io.sentry.util.a f79585o = new io.sentry.util.a();

    class a implements io.sentry.android.core.internal.util.c0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f79586a = BitmapDescriptorFactory.HUE_RED;

        a() {
        }

        @Override // io.sentry.android.core.internal.util.c0.b
        public void e(long j11, long j12, long j13, long j14, boolean z11, boolean z12, float f11) {
            long jF = new i7().f();
            long jNanoTime = ((j12 - System.nanoTime()) + SystemClock.elapsedRealtimeNanos()) - k0.this.f79571a;
            if (jNanoTime < 0) {
                return;
            }
            if (z12) {
                k0.this.f79580j.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jNanoTime), Long.valueOf(j13), jF));
            } else if (z11) {
                k0.this.f79579i.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jNanoTime), Long.valueOf(j13), jF));
            }
            if (f11 != this.f79586a) {
                this.f79586a = f11;
                k0.this.f79578h.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jNanoTime), Float.valueOf(f11), jF));
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f79588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f79589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final File f79590c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Map<String, io.sentry.profilemeasurements.a> f79591d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f79592e;

        public b(long j11, long j12, boolean z11, File file, Map<String, io.sentry.profilemeasurements.a> map) {
            this.f79588a = j11;
            this.f79590c = file;
            this.f79589b = j12;
            this.f79591d = map;
            this.f79592e = z11;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f79593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f79594b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Date f79595c;

        public c(long j11, long j12, Date date) {
            this.f79593a = j11;
            this.f79594b = j12;
            this.f79595c = date;
        }
    }

    public k0(String str, int i11, io.sentry.android.core.internal.util.c0 c0Var, io.sentry.c1 c1Var, ILogger iLogger) {
        this.f79572b = new File((String) io.sentry.util.y.c(str, "TracesFilesDirPath is required"));
        this.f79573c = i11;
        this.f79583m = (ILogger) io.sentry.util.y.c(iLogger, "Logger is required");
        this.f79582l = c1Var;
        this.f79577g = (io.sentry.android.core.internal.util.c0) io.sentry.util.y.c(c0Var, "SentryFrameMetricsCollector is required");
    }

    @SuppressLint({"NewApi"})
    private void i(List<o3> list) {
        long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.f79571a) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            synchronized (list) {
                try {
                    for (o3 o3Var : list) {
                        long jB = o3Var.b();
                        long j11 = jB + jElapsedRealtimeNanos;
                        Double dA = o3Var.a();
                        Long lC = o3Var.c();
                        Long lD = o3Var.d();
                        if (dA != null) {
                            arrayDeque3.add(new io.sentry.profilemeasurements.b(Long.valueOf(j11), dA, jB));
                        }
                        if (lC != null) {
                            arrayDeque.add(new io.sentry.profilemeasurements.b(Long.valueOf(j11), lC, jB));
                        }
                        if (lD != null) {
                            arrayDeque2.add(new io.sentry.profilemeasurements.b(Long.valueOf(j11), lD, jB));
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.f79581k.put("cpu_usage", new io.sentry.profilemeasurements.a("percent", arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.f79581k.put("memory_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.f79581k.put("memory_native_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque2));
        }
    }

    public void f() {
        io.sentry.d1 d1VarA = this.f79585o.a();
        try {
            Future<?> future = this.f79574d;
            if (future != null) {
                future.cancel(true);
                this.f79574d = null;
            }
            if (this.f79584n) {
                g(true, null);
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

    @SuppressLint({"NewApi"})
    public b g(boolean z11, List<o3> list) {
        io.sentry.d1 d1VarA = this.f79585o.a();
        try {
            if (!this.f79584n) {
                this.f79583m.c(b7.WARNING, "Profiler not running", new Object[0]);
                if (d1VarA != null) {
                    d1VarA.close();
                }
                return null;
            }
            try {
                Debug.stopMethodTracing();
            } catch (Throwable th2) {
                try {
                    this.f79583m.a(b7.ERROR, "Error while stopping profiling: ", th2);
                } catch (Throwable th3) {
                    this.f79584n = false;
                    throw th3;
                }
            }
            this.f79584n = false;
            this.f79577g.m(this.f79576f);
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            if (this.f79575e == null) {
                this.f79583m.c(b7.ERROR, "Trace file does not exists", new Object[0]);
                if (d1VarA != null) {
                    d1VarA.close();
                }
                return null;
            }
            if (!this.f79579i.isEmpty()) {
                this.f79581k.put("slow_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.f79579i));
            }
            if (!this.f79580j.isEmpty()) {
                this.f79581k.put("frozen_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.f79580j));
            }
            if (!this.f79578h.isEmpty()) {
                this.f79581k.put("screen_frame_rates", new io.sentry.profilemeasurements.a("hz", this.f79578h));
            }
            i(list);
            Future<?> future = this.f79574d;
            if (future != null) {
                future.cancel(true);
                this.f79574d = null;
            }
            b bVar = new b(jElapsedRealtimeNanos, elapsedCpuTime, z11, this.f79575e, this.f79581k);
            if (d1VarA != null) {
                d1VarA.close();
            }
            return bVar;
        } catch (Throwable th4) {
            if (d1VarA == null) {
                throw th4;
            }
            try {
                d1VarA.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    boolean h() {
        return this.f79584n;
    }

    @SuppressLint({"NewApi"})
    public c j() {
        io.sentry.d1 d1VarA = this.f79585o.a();
        try {
            int i11 = this.f79573c;
            if (i11 == 0) {
                this.f79583m.c(b7.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(i11));
                if (d1VarA != null) {
                    d1VarA.close();
                }
                return null;
            }
            if (this.f79584n) {
                this.f79583m.c(b7.WARNING, "Profiling has already started...", new Object[0]);
                if (d1VarA != null) {
                    d1VarA.close();
                }
                return null;
            }
            this.f79575e = new File(this.f79572b, d8.a() + ".trace");
            this.f79581k.clear();
            this.f79578h.clear();
            this.f79579i.clear();
            this.f79580j.clear();
            this.f79576f = this.f79577g.l(new a());
            try {
                io.sentry.c1 c1Var = this.f79582l;
                if (c1Var != null) {
                    this.f79574d = c1Var.b(new Runnable() { // from class: io.sentry.android.core.j0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f79565a.g(true, null);
                        }
                    }, 30000L);
                }
            } catch (RejectedExecutionException e11) {
                this.f79583m.a(b7.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e11);
            }
            this.f79571a = SystemClock.elapsedRealtimeNanos();
            Date dateD = io.sentry.l.d();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            try {
                Debug.startMethodTracingSampling(this.f79575e.getPath(), 3000000, this.f79573c);
                this.f79584n = true;
                c cVar = new c(this.f79571a, elapsedCpuTime, dateD);
                if (d1VarA != null) {
                    d1VarA.close();
                }
                return cVar;
            } catch (Throwable th2) {
                g(false, null);
                this.f79583m.a(b7.ERROR, "Unable to start a profile: ", th2);
                this.f79584n = false;
                if (d1VarA != null) {
                    d1VarA.close();
                }
                return null;
            }
        } catch (Throwable th3) {
            if (d1VarA == null) {
                throw th3;
            }
            try {
                d1VarA.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }
}
