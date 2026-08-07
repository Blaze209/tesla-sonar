package pw;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.firebase.perf.util.l;
import com.google.firebase.perf.util.o;
import com.google.firebase.perf.v1.PerfMetric;
import com.google.firebase.perf.v1.PerfSession;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.perf.config.a f104019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f104020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f104021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f104022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f104023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f104024f;

    static class a {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final kw.a f104025k = kw.a.e();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final long f104026l = TimeUnit.SECONDS.toMicros(1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.google.firebase.perf.util.a f104027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f104028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private l f104029c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.google.firebase.perf.util.i f104030d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f104031e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private double f104032f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private com.google.firebase.perf.util.i f104033g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private com.google.firebase.perf.util.i f104034h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f104035i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f104036j;

        a(com.google.firebase.perf.util.i iVar, long j11, com.google.firebase.perf.util.a aVar, com.google.firebase.perf.config.a aVar2, String str, boolean z11) {
            this.f104027a = aVar;
            this.f104031e = j11;
            this.f104030d = iVar;
            this.f104032f = j11;
            this.f104029c = aVar.a();
            g(aVar2, str, z11);
            this.f104028b = z11;
        }

        private static long c(com.google.firebase.perf.config.a aVar, String str) {
            return str == "Trace" ? aVar.E() : aVar.q();
        }

        private static long d(com.google.firebase.perf.config.a aVar, String str) {
            return str == "Trace" ? aVar.t() : aVar.t();
        }

        private static long e(com.google.firebase.perf.config.a aVar, String str) {
            return str == "Trace" ? aVar.F() : aVar.r();
        }

        private static long f(com.google.firebase.perf.config.a aVar, String str) {
            return str == "Trace" ? aVar.t() : aVar.t();
        }

        private void g(com.google.firebase.perf.config.a aVar, String str, boolean z11) {
            long jF = f(aVar, str);
            long jE = e(aVar, str);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            com.google.firebase.perf.util.i iVar = new com.google.firebase.perf.util.i(jE, jF, timeUnit);
            this.f104033g = iVar;
            this.f104035i = jE;
            if (z11) {
                f104025k.b("Foreground %s logging rate:%f, burst capacity:%d", str, iVar, Long.valueOf(jE));
            }
            long jD = d(aVar, str);
            long jC = c(aVar, str);
            com.google.firebase.perf.util.i iVar2 = new com.google.firebase.perf.util.i(jC, jD, timeUnit);
            this.f104034h = iVar2;
            this.f104036j = jC;
            if (z11) {
                f104025k.b("Background %s logging rate:%f, capacity:%d", str, iVar2, Long.valueOf(jC));
            }
        }

        synchronized void a(boolean z11) {
            try {
                this.f104030d = z11 ? this.f104033g : this.f104034h;
                this.f104031e = z11 ? this.f104035i : this.f104036j;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        synchronized boolean b(@NonNull PerfMetric perfMetric) {
            try {
                l lVarA = this.f104027a.a();
                double d11 = (this.f104029c.d(lVarA) * this.f104030d.a()) / f104026l;
                if (d11 > 0.0d) {
                    this.f104032f = Math.min(this.f104032f + d11, this.f104031e);
                    this.f104029c = lVarA;
                }
                double d12 = this.f104032f;
                if (d12 >= 1.0d) {
                    this.f104032f = d12 - 1.0d;
                    return true;
                }
                if (this.f104028b) {
                    f104025k.j("Exceeded log rate limit, dropping the log.");
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public d(@NonNull Context context, com.google.firebase.perf.util.i iVar, long j11) {
        this(iVar, j11, new com.google.firebase.perf.util.a(), b(), b(), com.google.firebase.perf.config.a.g());
        this.f104024f = o.b(context);
    }

    static double b() {
        return new Random().nextDouble();
    }

    private boolean c(List<PerfSession> list) {
        return list.size() > 0 && list.get(0).getSessionVerbosityCount() > 0 && list.get(0).getSessionVerbosity(0) == com.google.firebase.perf.v1.f.GAUGES_AND_SYSTEM_EVENTS;
    }

    private boolean d() {
        return this.f104021c < this.f104019a.f();
    }

    private boolean e() {
        return this.f104020b < this.f104019a.s();
    }

    private boolean f() {
        return this.f104020b < this.f104019a.G();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z11) {
        this.f104022d.a(z11);
        this.f104023e.a(z11);
    }

    boolean g(PerfMetric perfMetric) {
        boolean zB;
        if (!j(perfMetric)) {
            return false;
        }
        if (perfMetric.hasNetworkRequestMetric()) {
            zB = this.f104023e.b(perfMetric);
        } else {
            if (!perfMetric.hasTraceMetric()) {
                return true;
            }
            zB = this.f104022d.b(perfMetric);
        }
        return !zB;
    }

    boolean h(PerfMetric perfMetric) {
        if (perfMetric.hasTraceMetric() && !f() && !c(perfMetric.getTraceMetric().getPerfSessionsList())) {
            return false;
        }
        if (!i(perfMetric) || d() || c(perfMetric.getTraceMetric().getPerfSessionsList())) {
            return !perfMetric.hasNetworkRequestMetric() || e() || c(perfMetric.getNetworkRequestMetric().getPerfSessionsList());
        }
        return false;
    }

    protected boolean i(PerfMetric perfMetric) {
        return perfMetric.hasTraceMetric() && perfMetric.getTraceMetric().getName().startsWith("_st_") && perfMetric.getTraceMetric().containsCustomAttributes("Hosting_activity");
    }

    boolean j(@NonNull PerfMetric perfMetric) {
        return (!perfMetric.hasTraceMetric() || (!(perfMetric.getTraceMetric().getName().equals(com.google.firebase.perf.util.c.FOREGROUND_TRACE_NAME.toString()) || perfMetric.getTraceMetric().getName().equals(com.google.firebase.perf.util.c.BACKGROUND_TRACE_NAME.toString())) || perfMetric.getTraceMetric().getCountersCount() <= 0)) && !perfMetric.hasGaugeMetric();
    }

    d(com.google.firebase.perf.util.i iVar, long j11, com.google.firebase.perf.util.a aVar, double d11, double d12, com.google.firebase.perf.config.a aVar2) {
        this.f104022d = null;
        this.f104023e = null;
        boolean z11 = false;
        this.f104024f = false;
        o.a(0.0d <= d11 && d11 < 1.0d, "Sampling bucket ID should be in range [0.0, 1.0).");
        if (0.0d <= d12 && d12 < 1.0d) {
            z11 = true;
        }
        o.a(z11, "Fragment sampling bucket ID should be in range [0.0, 1.0).");
        this.f104020b = d11;
        this.f104021c = d12;
        this.f104019a = aVar2;
        this.f104022d = new a(iVar, j11, aVar, aVar2, "Trace", this.f104024f);
        this.f104023e = new a(iVar, j11, aVar, aVar2, "Network", this.f104024f);
    }
}
