package pw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.v1.AndroidApplicationInfo;
import com.google.firebase.perf.v1.ApplicationInfo;
import com.google.firebase.perf.v1.GaugeMetric;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.firebase.perf.v1.PerfMetric;
import com.google.firebase.perf.v1.TraceMetric;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public class k implements com.google.firebase.perf.application.a.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final kw.a f104050r = kw.a.e();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final k f104051s = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Integer> f104052a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.firebase.f f104055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private hw.e f104056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private zv.f f104057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private yv.b<nq.j> f104058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f104059h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Context f104061j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.google.firebase.perf.config.a f104062k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private d f104063l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.google.firebase.perf.application.a f104064m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ApplicationInfo.b f104065n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f104066o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f104067p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentLinkedQueue<c> f104053b = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f104054c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f104068q = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ExecutorService f104060i = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    @SuppressLint({"ThreadPoolCreation"})
    private k() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f104052a = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    private void A(PerfMetric.b bVar, com.google.firebase.perf.v1.b bVar2) {
        if (!u()) {
            if (s(bVar)) {
                f104050r.b("Transport is not initialized yet, %s will be queued for to be dispatched later", n(bVar));
                this.f104053b.add(new c(bVar, bVar2));
                return;
            }
            return;
        }
        PerfMetric perfMetricY = y(bVar, bVar2);
        if (t(perfMetricY)) {
            g(perfMetricY);
            SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
        }
    }

    private void B() {
        String str;
        if (this.f104062k.K()) {
            if (!this.f104065n.b() || this.f104068q) {
                try {
                    str = (String) Tasks.await(this.f104057f.getId(), 60000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e11) {
                    f104050r.d("Task to retrieve Installation Id is interrupted: %s", e11.getMessage());
                    str = null;
                } catch (ExecutionException e12) {
                    f104050r.d("Unable to retrieve Installation Id: %s", e12.getMessage());
                    str = null;
                } catch (TimeoutException e13) {
                    f104050r.d("Task to retrieve Installation Id is timed out: %s", e13.getMessage());
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    f104050r.j("Firebase Installation Id is empty, contact Firebase Support for debugging.");
                } else {
                    this.f104065n.h(str);
                }
            }
        }
    }

    private void C() {
        if (this.f104056e == null && u()) {
            this.f104056e = hw.e.c();
        }
    }

    public static /* synthetic */ void b(k kVar, c cVar) {
        kVar.getClass();
        kVar.A(cVar.f104017a, cVar.f104018b);
    }

    public static /* synthetic */ void c(k kVar, TraceMetric traceMetric, com.google.firebase.perf.v1.b bVar) {
        kVar.getClass();
        kVar.A(PerfMetric.newBuilder().d(traceMetric), bVar);
    }

    public static /* synthetic */ void d(k kVar, NetworkRequestMetric networkRequestMetric, com.google.firebase.perf.v1.b bVar) {
        kVar.getClass();
        kVar.A(PerfMetric.newBuilder().c(networkRequestMetric), bVar);
    }

    public static /* synthetic */ void f(k kVar, GaugeMetric gaugeMetric, com.google.firebase.perf.v1.b bVar) {
        kVar.getClass();
        kVar.A(PerfMetric.newBuilder().b(gaugeMetric), bVar);
    }

    private void g(PerfMetric perfMetric) {
        if (perfMetric.hasTraceMetric()) {
            f104050r.g("Logging %s. In a minute, visit the Firebase console to view your data: %s", n(perfMetric), i(perfMetric.getTraceMetric()));
        } else {
            f104050r.g("Logging %s", n(perfMetric));
        }
        this.f104059h.b(perfMetric);
    }

    private void h() {
        this.f104064m.k(new WeakReference<>(f104051s));
        ApplicationInfo.b bVarNewBuilder = ApplicationInfo.newBuilder();
        this.f104065n = bVarNewBuilder;
        bVarNewBuilder.j(this.f104055d.n().c()).d(AndroidApplicationInfo.newBuilder().h(this.f104066o).i(hw.a.f73660b).j(p(this.f104061j)));
        this.f104054c.set(true);
        while (!this.f104053b.isEmpty()) {
            final c cVarPoll = this.f104053b.poll();
            if (cVarPoll != null) {
                this.f104060i.execute(new Runnable() { // from class: pw.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.b(this.f104048a, cVarPoll);
                    }
                });
            }
        }
    }

    private String i(TraceMetric traceMetric) {
        String name = traceMetric.getName();
        return name.startsWith("_st_") ? kw.b.c(this.f104067p, this.f104066o, name) : kw.b.a(this.f104067p, this.f104066o, name);
    }

    private Map<String, String> j() {
        C();
        hw.e eVar = this.f104056e;
        return eVar != null ? eVar.b() : Collections.EMPTY_MAP;
    }

    public static k k() {
        return f104051s;
    }

    private static String l(GaugeMetric gaugeMetric) {
        return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", Boolean.valueOf(gaugeMetric.hasGaugeMetadata()), Integer.valueOf(gaugeMetric.getCpuMetricReadingsCount()), Integer.valueOf(gaugeMetric.getAndroidMemoryReadingsCount()));
    }

    private static String m(NetworkRequestMetric networkRequestMetric) {
        return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", networkRequestMetric.getUrl(), networkRequestMetric.hasHttpResponseCode() ? String.valueOf(networkRequestMetric.getHttpResponseCode()) : "UNKNOWN", new DecimalFormat("#.####").format((networkRequestMetric.hasTimeToResponseCompletedUs() ? networkRequestMetric.getTimeToResponseCompletedUs() : 0L) / 1000.0d));
    }

    private static String n(com.google.firebase.perf.v1.d dVar) {
        if (dVar.hasTraceMetric()) {
            return o(dVar.getTraceMetric());
        }
        if (dVar.hasNetworkRequestMetric()) {
            return m(dVar.getNetworkRequestMetric());
        }
        return dVar.hasGaugeMetric() ? l(dVar.getGaugeMetric()) : "log";
    }

    private static String o(TraceMetric traceMetric) {
        return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", traceMetric.getName(), new DecimalFormat("#.####").format(traceMetric.getDurationUs() / 1000.0d));
    }

    private static String p(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str == null ? "" : str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    private void q(PerfMetric perfMetric) {
        if (perfMetric.hasTraceMetric()) {
            this.f104064m.d(com.google.firebase.perf.util.b.TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        } else if (perfMetric.hasNetworkRequestMetric()) {
            this.f104064m.d(com.google.firebase.perf.util.b.NETWORK_TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        }
    }

    private boolean s(com.google.firebase.perf.v1.d dVar) {
        Integer num = this.f104052a.get("KEY_AVAILABLE_TRACES_FOR_CACHING");
        int iIntValue = num.intValue();
        Integer num2 = this.f104052a.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING");
        int iIntValue2 = num2.intValue();
        Integer num3 = this.f104052a.get("KEY_AVAILABLE_GAUGES_FOR_CACHING");
        int iIntValue3 = num3.intValue();
        if (dVar.hasTraceMetric() && iIntValue > 0) {
            this.f104052a.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(iIntValue - 1));
            return true;
        }
        if (dVar.hasNetworkRequestMetric() && iIntValue2 > 0) {
            this.f104052a.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(iIntValue2 - 1));
            return true;
        }
        if (!dVar.hasGaugeMetric() || iIntValue3 <= 0) {
            f104050r.b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", n(dVar), num, num2, num3);
            return false;
        }
        this.f104052a.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(iIntValue3 - 1));
        return true;
    }

    private boolean t(PerfMetric perfMetric) {
        if (!this.f104062k.K()) {
            f104050r.g("Performance collection is not enabled, dropping %s", n(perfMetric));
            return false;
        }
        if (!perfMetric.getApplicationInfo().hasAppInstanceId()) {
            f104050r.k("App Instance ID is null or empty, dropping %s", n(perfMetric));
            return false;
        }
        if (!mw.e.b(perfMetric, this.f104061j)) {
            f104050r.k("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", n(perfMetric));
            return false;
        }
        if (!this.f104063l.h(perfMetric)) {
            q(perfMetric);
            f104050r.g("Event dropped due to device sampling - %s", n(perfMetric));
            return false;
        }
        if (!this.f104063l.g(perfMetric)) {
            return true;
        }
        q(perfMetric);
        f104050r.g("Rate limited (per device) - %s", n(perfMetric));
        return false;
    }

    private PerfMetric y(PerfMetric.b bVar, com.google.firebase.perf.v1.b bVar2) {
        B();
        ApplicationInfo.b bVarI = this.f104065n.i(bVar2);
        if (bVar.hasTraceMetric() || bVar.hasNetworkRequestMetric()) {
            bVarI = bVarI.mo95clone().c(j());
        }
        return bVar.a(bVarI).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        Context contextK = this.f104055d.k();
        this.f104061j = contextK;
        this.f104066o = contextK.getPackageName();
        this.f104062k = com.google.firebase.perf.config.a.g();
        this.f104063l = new d(this.f104061j, new com.google.firebase.perf.util.i(100L, 1L, TimeUnit.MINUTES), 500L);
        this.f104064m = com.google.firebase.perf.application.a.b();
        this.f104059h = new b(this.f104058g, this.f104062k.a());
        h();
    }

    @Override // com.google.firebase.perf.application.a.b
    public void onUpdateAppState(com.google.firebase.perf.v1.b bVar) {
        this.f104068q = bVar == com.google.firebase.perf.v1.b.FOREGROUND;
        if (u()) {
            this.f104060i.execute(new Runnable() { // from class: pw.e
                @Override // java.lang.Runnable
                public final void run() {
                    k kVar = this.f104037a;
                    kVar.f104063l.a(kVar.f104068q);
                }
            });
        }
    }

    public void r(@NonNull com.google.firebase.f fVar, @NonNull zv.f fVar2, @NonNull yv.b<nq.j> bVar) {
        this.f104055d = fVar;
        this.f104067p = fVar.n().e();
        this.f104057f = fVar2;
        this.f104058g = bVar;
        this.f104060i.execute(new Runnable() { // from class: pw.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f104047a.z();
            }
        });
    }

    public boolean u() {
        return this.f104054c.get();
    }

    public void v(final GaugeMetric gaugeMetric, final com.google.firebase.perf.v1.b bVar) {
        this.f104060i.execute(new Runnable() { // from class: pw.f
            @Override // java.lang.Runnable
            public final void run() {
                k.f(this.f104038a, gaugeMetric, bVar);
            }
        });
    }

    public void w(final NetworkRequestMetric networkRequestMetric, final com.google.firebase.perf.v1.b bVar) {
        this.f104060i.execute(new Runnable() { // from class: pw.h
            @Override // java.lang.Runnable
            public final void run() {
                k.d(this.f104044a, networkRequestMetric, bVar);
            }
        });
    }

    public void x(final TraceMetric traceMetric, final com.google.firebase.perf.v1.b bVar) {
        this.f104060i.execute(new Runnable() { // from class: pw.g
            @Override // java.lang.Runnable
            public final void run() {
                k.c(this.f104041a, traceMetric, bVar);
            }
        });
    }
}
