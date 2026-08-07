package lw;

import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.o;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.firebase.perf.v1.PerfSession;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import pw.k;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends com.google.firebase.perf.application.b implements ow.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final kw.a f90843i = kw.a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ow.a> f90844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GaugeManager f90845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f90846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final NetworkRequestMetric.b f90847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final WeakReference<ow.b> f90848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f90849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f90850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f90851h;

    private h(k kVar) {
        this(kVar, com.google.firebase.perf.application.a.b(), GaugeManager.getInstance());
    }

    public static h c(k kVar) {
        return new h(kVar);
    }

    private boolean g() {
        return this.f90847d.f();
    }

    private boolean h() {
        return this.f90847d.h();
    }

    private static boolean i(String str) {
        if (str.length() > 128) {
            return false;
        }
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt <= 31 || cCharAt > 127) {
                return false;
            }
        }
        return true;
    }

    public h A(String str) {
        this.f90849f = str;
        return this;
    }

    @Override // ow.b
    public void a(ow.a aVar) {
        if (aVar == null) {
            f90843i.j("Unable to add new SessionId to the Network Trace. Continuing without it.");
        } else {
            if (!g() || h()) {
                return;
            }
            this.f90844a.add(aVar);
        }
    }

    public NetworkRequestMetric b() {
        SessionManager.getInstance().unregisterForSessionUpdates(this.f90848e);
        unregisterForAppState();
        PerfSession[] perfSessionArrB = ow.a.b(d());
        if (perfSessionArrB != null) {
            this.f90847d.b(Arrays.asList(perfSessionArrB));
        }
        NetworkRequestMetric networkRequestMetricBuild = this.f90847d.build();
        if (!nw.d.c(this.f90849f)) {
            f90843i.a("Dropping network request from a 'User-Agent' that is not allowed");
            return networkRequestMetricBuild;
        }
        if (this.f90850g) {
            if (this.f90851h) {
                f90843i.a("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
            }
            return networkRequestMetricBuild;
        }
        this.f90846c.w(networkRequestMetricBuild, getAppState());
        this.f90850g = true;
        return networkRequestMetricBuild;
    }

    List<ow.a> d() {
        List<ow.a> listUnmodifiableList;
        synchronized (this.f90844a) {
            try {
                ArrayList arrayList = new ArrayList();
                for (ow.a aVar : this.f90844a) {
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return listUnmodifiableList;
    }

    public long e() {
        return this.f90847d.e();
    }

    public boolean f() {
        return this.f90847d.g();
    }

    public h j(Map<String, String> map) {
        this.f90847d.c().i(map);
        return this;
    }

    public h k(String str) {
        NetworkRequestMetric.d dVar;
        if (str != null) {
            NetworkRequestMetric.d dVar2 = NetworkRequestMetric.d.HTTP_METHOD_UNKNOWN;
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            switch (upperCase) {
                case "OPTIONS":
                    dVar = NetworkRequestMetric.d.OPTIONS;
                    break;
                case "GET":
                    dVar = NetworkRequestMetric.d.GET;
                    break;
                case "PUT":
                    dVar = NetworkRequestMetric.d.PUT;
                    break;
                case "HEAD":
                    dVar = NetworkRequestMetric.d.HEAD;
                    break;
                case "POST":
                    dVar = NetworkRequestMetric.d.POST;
                    break;
                case "PATCH":
                    dVar = NetworkRequestMetric.d.PATCH;
                    break;
                case "TRACE":
                    dVar = NetworkRequestMetric.d.TRACE;
                    break;
                case "CONNECT":
                    dVar = NetworkRequestMetric.d.CONNECT;
                    break;
                case "DELETE":
                    dVar = NetworkRequestMetric.d.DELETE;
                    break;
                default:
                    dVar = NetworkRequestMetric.d.HTTP_METHOD_UNKNOWN;
                    break;
            }
            this.f90847d.k(dVar);
        }
        return this;
    }

    public h l(int i11) {
        this.f90847d.l(i11);
        return this;
    }

    public void m() {
        this.f90851h = true;
    }

    public h q() {
        this.f90847d.m(NetworkRequestMetric.e.GENERIC_CLIENT_ERROR);
        return this;
    }

    public h r(long j11) {
        this.f90847d.n(j11);
        return this;
    }

    public h s(long j11) {
        ow.a aVarPerfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f90848e);
        this.f90847d.j(j11);
        a(aVarPerfSession);
        if (aVarPerfSession.e()) {
            this.f90845b.collectGaugeMetricOnce(aVarPerfSession.d());
        }
        return this;
    }

    public h u(String str) {
        if (str == null) {
            this.f90847d.d();
            return this;
        }
        if (i(str)) {
            this.f90847d.o(str);
            return this;
        }
        f90843i.j("The content type of the response is not a valid content-type:" + str);
        return this;
    }

    public h v(long j11) {
        this.f90847d.p(j11);
        return this;
    }

    public h w(long j11) {
        this.f90847d.q(j11);
        return this;
    }

    public h x(long j11) {
        this.f90847d.r(j11);
        if (SessionManager.getInstance().perfSession().e()) {
            this.f90845b.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
        }
        return this;
    }

    public h y(long j11) {
        this.f90847d.s(j11);
        return this;
    }

    public h z(String str) {
        if (str != null) {
            this.f90847d.t(o.e(o.d(str), 2000));
        }
        return this;
    }

    public h(k kVar, com.google.firebase.perf.application.a aVar, GaugeManager gaugeManager) {
        super(aVar);
        this.f90847d = NetworkRequestMetric.newBuilder();
        this.f90848e = new WeakReference<>(this);
        this.f90846c = kVar;
        this.f90845b = gaugeManager;
        this.f90844a = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }
}
