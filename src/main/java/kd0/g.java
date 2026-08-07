package kd0;

import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.perf.metrics.Trace;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import jn0.h0;
import nc0.l;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import pw.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\b\u0000\u0018\u0000 >2\u00020\u0001:\u0002.)B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010)\u001a\u00020\u00172\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010*J-\u0010,\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b,\u0010-J-\u0010.\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b.\u0010-J\u0017\u00100\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u000fH\u0016¢\u0006\u0004\b0\u0010%R$\u00105\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u000602j\u0002`3018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u00104R \u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u000206018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00104R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00109R,\u0010=\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00140;0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010<¨\u0006?"}, d2 = {"Lkd0/g;", "Lkd0/e;", "<init>", "()V", "", ImagesContract.URL, "p", "(Ljava/lang/String;)Ljava/lang/String;", "Lnc0/e;", "method", "", "requestPayloadSize", "Lkd0/f;", "c", "(Ljava/lang/String;Lnc0/e;J)Lkd0/f;", "Lnc0/l;", "trace", "", "Lkd0/a;", "attributes", "Lkd0/i;", "h", "(Lnc0/l;Ljava/util/List;)Lkd0/i;", "Ljn0/h0;", "l", "(Lnc0/l;Ljava/util/List;)V", "Lnc0/i;", "metrics", "k", "(Lnc0/l;Ljava/util/List;Ljava/util/List;)V", "Lnc0/g;", DateTokenConverter.CONVERTER_KEY, "(Lnc0/g;)V", "Lnc0/f;", IntegerTokenConverter.CONVERTER_KEY, "(Lnc0/f;)V", "e", "(Lnc0/l;)V", "Lnc0/h;", "metric", "value", "a", "(Lnc0/h;J)V", "forVIN", "j", "(Lnc0/l;Ljava/lang/String;Ljava/util/List;)V", "b", "matching", "g", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/google/firebase/perf/metrics/Trace;", "Lcom/tesla/monitoring/FirebaseTrace;", "Ljava/util/concurrent/ConcurrentHashMap;", "activeTraces", "Llw/g;", "activeHttpTraces", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "activeTracesLock", "", "Ljava/util/Map;", "activeTracesPerVIN", "f", "monitoring_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g implements e {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final com.tesla.logging.g f85943g = com.tesla.logging.g.INSTANCE.a("MonitoringService");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static e f85944h;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentHashMap<l, Trace> activeTraces;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentHashMap<String, lw.g> activeHttpTraces;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ReentrantLock activeTracesLock;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Map<l, i>> activeTracesPerVIN;

    /* JADX INFO: renamed from: kd0.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkd0/g$a;", "", "<init>", "()V", "Lkd0/e;", "a", "()Lkd0/e;", "", "TAG", "Ljava/lang/String;", "", "MAX_ATTRS", "I", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "INSTANCE", "Lkd0/e;", "monitoring_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            if (g.f85944h == null) {
                synchronized (this) {
                    try {
                        if (g.f85944h == null) {
                            g.f85944h = new g(null);
                        }
                        h0 h0Var = h0.f84049a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            e eVar = g.f85944h;
            s.h(eVar);
            return eVar;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015¨\u0006\u0016"}, d2 = {"Lkd0/g$b;", "Lkd0/i;", "Lcom/google/firebase/perf/metrics/Trace;", "Lcom/tesla/monitoring/FirebaseTrace;", "firebaseTrace", "", "trace", "<init>", "(Lcom/google/firebase/perf/metrics/Trace;Ljava/lang/String;)V", "metricName", "", "value", "Ljn0/h0;", "b", "(Ljava/lang/String;J)V", "", "Lkd0/a;", "attributes", "a", "(Ljava/util/List;)V", "Lcom/google/firebase/perf/metrics/Trace;", "Ljava/lang/String;", "monitoring_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Trace firebaseTrace;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String trace;

        public b(Trace firebaseTrace, String trace) {
            s.k(firebaseTrace, "firebaseTrace");
            s.k(trace, "trace");
            this.firebaseTrace = firebaseTrace;
            this.trace = trace;
        }

        @Override // kd0.i
        public void a(List<a> attributes) {
            s.k(attributes, "attributes");
            Iterator it = v.d1(attributes, 5).iterator();
            while (it.hasNext()) {
                kd0.b.a(this.firebaseTrace, (a) it.next());
            }
            this.firebaseTrace.stop();
            g.f85943g.a("Token trace `" + this.trace + "` ended");
        }

        @Override // kd0.i
        public void b(String metricName, long value) {
            s.k(metricName, "metricName");
            this.firebaseTrace.incrementMetric(metricName, value);
            g.f85943g.a("Trace `" + this.trace + "` metric `" + metricName + "` incremented value by `" + value + "`");
        }
    }

    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final String p(String url) {
        return t.z1(url, CallerData.NA, null, 2, null);
    }

    @Override // kd0.e
    public void a(nc0.h metric, long value) {
        s.k(metric, "metric");
        String strA = ld0.b.a(metric);
        Iterator<Map.Entry<l, Trace>> it = this.activeTraces.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().incrementMetric(strA, value);
        }
        f85943g.a("Incremented all traces with " + strA);
    }

    @Override // kd0.e
    public void b(l trace, String forVIN, List<a> attributes) {
        LinkedHashMap linkedHashMap;
        Map<l, i> linkedHashMap2;
        s.k(trace, "trace");
        s.k(forVIN, "forVIN");
        s.k(attributes, "attributes");
        ReentrantLock reentrantLock = this.activeTracesLock;
        reentrantLock.lock();
        try {
            Map<l, i> map = this.activeTracesPerVIN.get(forVIN);
            if (map != null) {
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry<l, i> entry : map.entrySet()) {
                    if (entry.getKey() == trace) {
                        entry.getValue().a(attributes);
                        f85943g.a("Stopped, `" + trace);
                    } else {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            } else {
                linkedHashMap = null;
            }
            Map<String, Map<l, i>> map2 = this.activeTracesPerVIN;
            if (linkedHashMap == null || (linkedHashMap2 = v0.D(linkedHashMap)) == null) {
                linkedHashMap2 = new LinkedHashMap<>();
            }
            map2.put(forVIN, linkedHashMap2);
            h0 h0Var = h0.f84049a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kd0.e
    public f c(String url, nc0.e method, long requestPayloadSize) {
        s.k(url, "url");
        s.k(method, "method");
        String strA = c.a(method);
        String strP = p(url);
        lw.g gVar = new lw.g(strP, strA, k.k(), new com.google.firebase.perf.util.l());
        gVar.b(requestPayloadSize);
        gVar.e();
        f85943g.a("Network trace started for " + strP + " " + strA);
        return new h(gVar, strP, strA);
    }

    @Override // kd0.e
    public void d(nc0.g trace) {
        s.k(trace, "trace");
        String strP = p(trace.getUrl());
        lw.g gVar = new lw.g(strP, c.a(trace.getMethod()), k.k(), new com.google.firebase.perf.util.l());
        gVar.b(trace.getRequestPayloadSize());
        gVar.e();
        this.activeHttpTraces.put(strP, gVar);
        f85943g.a("HTTP trace `" + strP + "` started");
    }

    @Override // kd0.e
    public void e(l trace) {
        s.k(trace, "trace");
        if (this.activeTraces.remove(trace) != null) {
            f85943g.a("Trace `" + trace + "` cancelled");
        }
    }

    @Override // kd0.e
    public void g(l matching) {
        LinkedHashMap linkedHashMap;
        Map<l, i> linkedHashMap2;
        s.k(matching, "matching");
        ReentrantLock reentrantLock = this.activeTracesLock;
        reentrantLock.lock();
        try {
            for (String str : this.activeTracesPerVIN.keySet()) {
                Map<l, i> map = this.activeTracesPerVIN.get(str);
                if (map != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<l, i> entry : map.entrySet()) {
                        if (entry.getKey() == matching) {
                            f85943g.a("Cancelled, `" + matching + "`");
                        } else {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                } else {
                    linkedHashMap = null;
                }
                Map<String, Map<l, i>> map2 = this.activeTracesPerVIN;
                if (linkedHashMap == null || (linkedHashMap2 = v0.D(linkedHashMap)) == null) {
                    linkedHashMap2 = new LinkedHashMap<>();
                }
                map2.put(str, linkedHashMap2);
            }
            h0 h0Var = h0.f84049a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kd0.e
    public i h(l trace, List<a> attributes) {
        s.k(trace, "trace");
        s.k(attributes, "attributes");
        Trace traceC = Trace.c(kd0.b.b(trace.name()));
        s.j(traceC, "create(...)");
        for (a aVar : v.d1(attributes, 5)) {
            traceC.putAttribute(aVar.getName(), aVar.getValue());
        }
        traceC.start();
        f85943g.a("Token trace `" + trace + "` started");
        return new b(traceC, trace.toString());
    }

    @Override // kd0.e
    public void i(nc0.f trace) {
        s.k(trace, "trace");
        String strP = p(trace.getUrl());
        lw.g gVarRemove = this.activeHttpTraces.remove(strP);
        if (gVarRemove == null) {
            f85943g.a("No HTTP metric found for trace `" + strP + "`");
            return;
        }
        gVarRemove.a(trace.getCode());
        gVarRemove.d(trace.getResponsePayloadSize());
        gVarRemove.c(trace.getResponseContentType());
        gVarRemove.f();
        f85943g.a("HTTP trace `" + trace + "` ended");
    }

    @Override // kd0.e
    public void j(l trace, String forVIN, List<a> attributes) {
        s.k(trace, "trace");
        s.k(forVIN, "forVIN");
        s.k(attributes, "attributes");
        Map<l, i> map = this.activeTracesPerVIN.get(forVIN);
        if (map == null || !map.containsKey(trace)) {
            ReentrantLock reentrantLock = this.activeTracesLock;
            reentrantLock.lock();
            try {
                i iVarH = h(trace, attributes);
                Map<l, i> linkedHashMap = this.activeTracesPerVIN.get(forVIN);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap<>();
                }
                linkedHashMap.put(trace, iVarH);
                this.activeTracesPerVIN.put(forVIN, linkedHashMap);
                f85943g.a("Started, `" + trace);
                h0 h0Var = h0.f84049a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Override // kd0.e
    public void k(l trace, List<a> attributes, List<nc0.i> metrics) {
        s.k(trace, "trace");
        s.k(attributes, "attributes");
        s.k(metrics, "metrics");
        Trace traceRemove = this.activeTraces.remove(trace);
        if (traceRemove == null) {
            f85943g.a("No firebase trace `" + trace + "` found for trace");
            return;
        }
        Iterator it = v.d1(attributes, 5).iterator();
        while (it.hasNext()) {
            kd0.b.a(traceRemove, (a) it.next());
        }
        for (nc0.i iVar : metrics) {
            traceRemove.incrementMetric(iVar.getName().name(), iVar.getValue());
        }
        traceRemove.stop();
        f85943g.a("Trace `" + trace + "` ended");
    }

    @Override // kd0.e
    public void l(l trace, List<a> attributes) {
        s.k(trace, "trace");
        s.k(attributes, "attributes");
        e(trace);
        Trace traceC = Trace.c(kd0.b.b(trace.name()));
        s.j(traceC, "create(...)");
        for (a aVar : v.d1(attributes, 5)) {
            traceC.putAttribute(aVar.getName(), aVar.getValue());
        }
        traceC.start();
        this.activeTraces.put(trace, traceC);
        f85943g.a("Trace `" + trace + "` started");
    }

    private g() {
        this.activeTraces = new ConcurrentHashMap<>();
        this.activeHttpTraces = new ConcurrentHashMap<>();
        this.activeTracesLock = new ReentrantLock();
        this.activeTracesPerVIN = new LinkedHashMap();
    }
}
