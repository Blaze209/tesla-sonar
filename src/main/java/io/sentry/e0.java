package io.sentry;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes9.dex */
public final class e0 {
    private Boolean A;
    private Boolean B;
    private String C;
    private List<String> D;
    private List<String> E;
    private Boolean F;
    private Boolean G;
    private Boolean H;
    private Boolean I;
    private Boolean J;
    private Boolean K;
    private Double L;
    private String M;
    private s3 N;
    private q7.f O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f80497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f80498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f80499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f80500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f80501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f80502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f80503g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Boolean f80504h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Double f80505i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Double f80506j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private q7.m f80507k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private q7.l f80509m;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f80514r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Long f80515s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private List<String> f80517u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Boolean f80518v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Boolean f80519w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Boolean f80521y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Boolean f80522z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map<String, String> f80508l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<String> f80510n = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List<String> f80511o = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<String> f80512p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List<String> f80513q = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Set<Class<? extends Throwable>> f80516t = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Set<String> f80520x = new CopyOnWriteArraySet();

    /* JADX WARN: Multi-variable type inference failed */
    public static e0 g(io.sentry.config.f fVar, ILogger iLogger) {
        e0 e0Var = new e0();
        e0Var.a0(fVar.getProperty("dsn"));
        e0Var.i0(fVar.getProperty(AnalyticsAttribute.Environment));
        e0Var.x0(fVar.getProperty("release"));
        e0Var.Z(fVar.getProperty("dist"));
        e0Var.B0(fVar.getProperty("servername"));
        e0Var.g0(fVar.b("uncaught.handler.enabled"));
        e0Var.q0(fVar.b("uncaught.handler.print-stacktrace"));
        e0Var.E0(fVar.a("traces-sample-rate"));
        e0Var.t0(fVar.a("profiles-sample-rate"));
        e0Var.Y(fVar.b("debug"));
        e0Var.c0(fVar.b("enable-deduplication"));
        e0Var.y0(fVar.b("send-client-reports"));
        e0Var.j0(fVar.b("force-init"));
        String property = fVar.getProperty("max-request-body-size");
        if (property != null) {
            e0Var.p0(q7.m.valueOf(property.toUpperCase(Locale.ROOT)));
        }
        for (Map.Entry<String, String> entry : fVar.getMap("tags").entrySet()) {
            e0Var.D0(entry.getKey(), entry.getValue());
        }
        String property2 = fVar.getProperty("proxy.host");
        String property3 = fVar.getProperty("proxy.user");
        String property4 = fVar.getProperty("proxy.pass");
        String strE = fVar.e("proxy.port", "80");
        if (property2 != null) {
            e0Var.w0(new q7.l(property2, strE, property3, property4));
        }
        Iterator<String> it = fVar.getList("in-app-includes").iterator();
        while (it.hasNext()) {
            e0Var.e(it.next());
        }
        Iterator<String> it2 = fVar.getList("in-app-excludes").iterator();
        while (it2.hasNext()) {
            e0Var.d(it2.next());
        }
        List<String> list = fVar.getProperty("trace-propagation-targets") != null ? fVar.getList("trace-propagation-targets") : null;
        if (list == null && fVar.getProperty("tracing-origins") != null) {
            list = fVar.getList("tracing-origins");
        }
        if (list != null) {
            Iterator<String> it3 = list.iterator();
            while (it3.hasNext()) {
                e0Var.f(it3.next());
            }
        }
        Iterator<String> it4 = fVar.getList("context-tags").iterator();
        while (it4.hasNext()) {
            e0Var.b(it4.next());
        }
        e0Var.v0(fVar.getProperty("proguard-uuid"));
        Iterator<String> it5 = fVar.getList("bundle-ids").iterator();
        while (it5.hasNext()) {
            e0Var.a(it5.next());
        }
        e0Var.l0(fVar.d("idle-timeout"));
        e0Var.n0(fVar.c("ignored-errors"));
        e0Var.h0(fVar.b("enabled"));
        e0Var.e0(fVar.b("enable-pretty-serialization-output"));
        e0Var.A0(fVar.b("send-modules"));
        e0Var.z0(fVar.b("send-default-pii"));
        e0Var.m0(fVar.c("ignored-checkins"));
        e0Var.o0(fVar.c("ignored-transactions"));
        e0Var.b0(fVar.b("enable-backpressure-handling"));
        e0Var.k0(fVar.b("global-hub-mode"));
        e0Var.W(fVar.b("capture-open-telemetry-events"));
        e0Var.d0(fVar.b("logs.enabled"));
        for (String str : fVar.getList("ignored-exceptions-for-type")) {
            try {
                Class<?> cls = Class.forName(str);
                if (Throwable.class.isAssignableFrom(cls)) {
                    e0Var.c(cls);
                } else {
                    iLogger.c(b7.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable", str, str);
                }
            } catch (ClassNotFoundException unused) {
                iLogger.c(b7.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found", str, str);
            }
        }
        Long lD = fVar.d("cron.default-checkin-margin");
        Long lD2 = fVar.d("cron.default-max-runtime");
        String property5 = fVar.getProperty("cron.default-timezone");
        Long lD3 = fVar.d("cron.default-failure-issue-threshold");
        Long lD4 = fVar.d("cron.default-recovery-threshold");
        if (lD != null || lD2 != null || property5 != null || lD3 != null || lD4 != null) {
            q7.f fVar2 = new q7.f();
            fVar2.f(lD);
            fVar2.h(lD2);
            fVar2.j(property5);
            fVar2.g(lD3);
            fVar2.i(lD4);
            e0Var.X(fVar2);
        }
        e0Var.f0(fVar.b("enable-spotlight"));
        e0Var.C0(fVar.getProperty("spotlight-connection-url"));
        e0Var.s0(fVar.a("profile-session-sample-rate"));
        e0Var.u0(fVar.getProperty("profiling-traces-dir-path"));
        String property6 = fVar.getProperty("profile-lifecycle");
        if (property6 != null && !property6.isEmpty()) {
            e0Var.r0(s3.valueOf(property6.toUpperCase()));
        }
        return e0Var;
    }

    public Double A() {
        return this.L;
    }

    public void A0(Boolean bool) {
        this.F = bool;
    }

    public Double B() {
        return this.f80506j;
    }

    public void B0(String str) {
        this.f80501e = str;
    }

    public String C() {
        return this.M;
    }

    public void C0(String str) {
        this.C = str;
    }

    public String D() {
        return this.f80514r;
    }

    public void D0(String str, String str2) {
        this.f80508l.put(str, str2);
    }

    public q7.l E() {
        return this.f80509m;
    }

    public void E0(Double d11) {
        this.f80505i = d11;
    }

    public String F() {
        return this.f80499c;
    }

    public Boolean G() {
        return this.f80519w;
    }

    public String H() {
        return this.f80501e;
    }

    public String I() {
        return this.C;
    }

    public Map<String, String> J() {
        return this.f80508l;
    }

    public List<String> K() {
        return this.f80512p;
    }

    public Double L() {
        return this.f80505i;
    }

    public Boolean M() {
        return this.K;
    }

    public Boolean N() {
        return this.H;
    }

    public Boolean O() {
        return this.B;
    }

    public Boolean P() {
        return this.f80522z;
    }

    public Boolean Q() {
        return this.A;
    }

    public Boolean R() {
        return this.f80521y;
    }

    public Boolean S() {
        return this.J;
    }

    public Boolean T() {
        return this.I;
    }

    public Boolean U() {
        return this.G;
    }

    public Boolean V() {
        return this.F;
    }

    public void W(Boolean bool) {
        this.K = bool;
    }

    public void X(q7.f fVar) {
        this.O = fVar;
    }

    public void Y(Boolean bool) {
        this.f80503g = bool;
    }

    public void Z(String str) {
        this.f80500d = str;
    }

    public void a(String str) {
        this.f80520x.add(str);
    }

    public void a0(String str) {
        this.f80497a = str;
    }

    public void b(String str) {
        this.f80513q.add(str);
    }

    public void b0(Boolean bool) {
        this.H = bool;
    }

    public void c(Class<? extends Throwable> cls) {
        this.f80516t.add(cls);
    }

    public void c0(Boolean bool) {
        this.f80504h = bool;
    }

    public void d(String str) {
        this.f80510n.add(str);
    }

    public void d0(Boolean bool) {
        this.B = bool;
    }

    public void e(String str) {
        this.f80511o.add(str);
    }

    public void e0(Boolean bool) {
        this.f80522z = bool;
    }

    public void f(String str) {
        if (this.f80512p == null) {
            this.f80512p = new CopyOnWriteArrayList();
        }
        if (str.isEmpty()) {
            return;
        }
        this.f80512p.add(str);
    }

    public void f0(Boolean bool) {
        this.A = bool;
    }

    public void g0(Boolean bool) {
        this.f80502f = bool;
    }

    public Set<String> h() {
        return this.f80520x;
    }

    public void h0(Boolean bool) {
        this.f80521y = bool;
    }

    public List<String> i() {
        return this.f80513q;
    }

    public void i0(String str) {
        this.f80498b = str;
    }

    public q7.f j() {
        return this.O;
    }

    public void j0(Boolean bool) {
        this.J = bool;
    }

    public Boolean k() {
        return this.f80503g;
    }

    public void k0(Boolean bool) {
        this.I = bool;
    }

    public String l() {
        return this.f80500d;
    }

    public void l0(Long l11) {
        this.f80515s = l11;
    }

    public String m() {
        return this.f80497a;
    }

    public void m0(List<String> list) {
        this.D = list;
    }

    public Boolean n() {
        return this.f80504h;
    }

    public void n0(List<String> list) {
        this.f80517u = list;
    }

    public Boolean o() {
        return this.f80502f;
    }

    public void o0(List<String> list) {
        this.E = list;
    }

    public String p() {
        return this.f80498b;
    }

    public void p0(q7.m mVar) {
        this.f80507k = mVar;
    }

    public Long q() {
        return this.f80515s;
    }

    public void q0(Boolean bool) {
        this.f80518v = bool;
    }

    public List<String> r() {
        return this.D;
    }

    public void r0(s3 s3Var) {
        this.N = s3Var;
    }

    public List<String> s() {
        return this.f80517u;
    }

    public void s0(Double d11) {
        this.L = d11;
    }

    public Set<Class<? extends Throwable>> t() {
        return this.f80516t;
    }

    public void t0(Double d11) {
        this.f80506j = d11;
    }

    public List<String> u() {
        return this.E;
    }

    public void u0(String str) {
        this.M = str;
    }

    public List<String> v() {
        return this.f80510n;
    }

    public void v0(String str) {
        this.f80514r = str;
    }

    public List<String> w() {
        return this.f80511o;
    }

    public void w0(q7.l lVar) {
        this.f80509m = lVar;
    }

    public q7.m x() {
        return this.f80507k;
    }

    public void x0(String str) {
        this.f80499c = str;
    }

    public Boolean y() {
        return this.f80518v;
    }

    public void y0(Boolean bool) {
        this.f80519w = bool;
    }

    public s3 z() {
        return this.N;
    }

    public void z0(Boolean bool) {
        this.G = bool;
    }
}
