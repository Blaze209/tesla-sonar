package io.sentry;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.common.Scopes;
import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class q3 implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private io.sentry.protocol.d f81088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private io.sentry.protocol.x f81089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private io.sentry.protocol.x f81090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private io.sentry.protocol.r f81091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, io.sentry.profilemeasurements.a> f81092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f81093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f81094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f81095h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f81096i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private double f81097j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final File f81098k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f81099l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private io.sentry.protocol.profiling.a f81100m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map<String, Object> f81101n;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.sentry.protocol.x f81102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.sentry.protocol.x f81103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<String, io.sentry.profilemeasurements.a> f81104c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final File f81105d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final double f81106e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f81107f;

        public a(io.sentry.protocol.x xVar, io.sentry.protocol.x xVar2, Map<String, io.sentry.profilemeasurements.a> map, File file, n5 n5Var, String str) {
            this.f81102a = xVar;
            this.f81103b = xVar2;
            this.f81104c = new ConcurrentHashMap(map);
            this.f81105d = file;
            this.f81106e = l.m(n5Var.f());
            this.f81107f = str;
        }

        public q3 a(q7 q7Var) {
            return new q3(this.f81102a, this.f81103b, this.f81105d, this.f81104c, Double.valueOf(this.f81106e), this.f81107f, q7Var);
        }
    }

    public static final class b implements q1<q3> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public q3 a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            q3 q3Var = new q3();
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "debug_meta":
                        io.sentry.protocol.d dVar = (io.sentry.protocol.d) i3Var.v0(iLogger, new io.sentry.protocol.d.a());
                        if (dVar == null) {
                            break;
                        } else {
                            q3Var.f81088a = dVar;
                            break;
                        }
                        break;
                    case "measurements":
                        Map mapY2 = i3Var.Y2(iLogger, new io.sentry.profilemeasurements.a.C1701a());
                        if (mapY2 == null) {
                            break;
                        } else {
                            q3Var.f81092e.putAll(mapY2);
                            break;
                        }
                        break;
                    case "profile":
                        io.sentry.protocol.profiling.a aVar = (io.sentry.protocol.profiling.a) i3Var.v0(iLogger, new io.sentry.protocol.profiling.a.b());
                        if (aVar == null) {
                            break;
                        } else {
                            q3Var.f81100m = aVar;
                            break;
                        }
                        break;
                    case "environment":
                        String strA1 = i3Var.a1();
                        if (strA1 == null) {
                            break;
                        } else {
                            q3Var.f81095h = strA1;
                            break;
                        }
                        break;
                    case "timestamp":
                        Double dJ2 = i3Var.j2();
                        if (dJ2 == null) {
                            break;
                        } else {
                            q3Var.f81097j = dJ2.doubleValue();
                            break;
                        }
                        break;
                    case "profiler_id":
                        io.sentry.protocol.x xVar = (io.sentry.protocol.x) i3Var.v0(iLogger, new io.sentry.protocol.x.a());
                        if (xVar == null) {
                            break;
                        } else {
                            q3Var.f81089b = xVar;
                            break;
                        }
                        break;
                    case "version":
                        String strA2 = i3Var.a1();
                        if (strA2 == null) {
                            break;
                        } else {
                            q3Var.f81096i = strA2;
                            break;
                        }
                        break;
                    case "release":
                        String strA3 = i3Var.a1();
                        if (strA3 == null) {
                            break;
                        } else {
                            q3Var.f81094g = strA3;
                            break;
                        }
                        break;
                    case "client_sdk":
                        io.sentry.protocol.r rVar = (io.sentry.protocol.r) i3Var.v0(iLogger, new io.sentry.protocol.r.a());
                        if (rVar == null) {
                            break;
                        } else {
                            q3Var.f81091d = rVar;
                            break;
                        }
                        break;
                    case "platform":
                        String strA4 = i3Var.a1();
                        if (strA4 == null) {
                            break;
                        } else {
                            q3Var.f81093f = strA4;
                            break;
                        }
                        break;
                    case "sampled_profile":
                        String strA5 = i3Var.a1();
                        if (strA5 == null) {
                            break;
                        } else {
                            q3Var.f81099l = strA5;
                            break;
                        }
                        break;
                    case "chunk_id":
                        io.sentry.protocol.x xVar2 = (io.sentry.protocol.x) i3Var.v0(iLogger, new io.sentry.protocol.x.a());
                        if (xVar2 == null) {
                            break;
                        } else {
                            q3Var.f81090c = xVar2;
                            break;
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        i3Var.a3(iLogger, concurrentHashMap, strL);
                        break;
                }
            }
            q3Var.u(concurrentHashMap);
            i3Var.j();
            return q3Var;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q3() {
        io.sentry.protocol.x xVar = io.sentry.protocol.x.f81078b;
        this(xVar, xVar, new File("dummy"), new HashMap(), Double.valueOf(0.0d), "android", q7.empty());
    }

    private BigDecimal m(Double d11) {
        return BigDecimal.valueOf(d11.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3)) {
            return false;
        }
        q3 q3Var = (q3) obj;
        return Objects.equals(this.f81088a, q3Var.f81088a) && Objects.equals(this.f81089b, q3Var.f81089b) && Objects.equals(this.f81090c, q3Var.f81090c) && Objects.equals(this.f81091d, q3Var.f81091d) && Objects.equals(this.f81092e, q3Var.f81092e) && Objects.equals(this.f81093f, q3Var.f81093f) && Objects.equals(this.f81094g, q3Var.f81094g) && Objects.equals(this.f81095h, q3Var.f81095h) && Objects.equals(this.f81096i, q3Var.f81096i) && Objects.equals(this.f81099l, q3Var.f81099l) && Objects.equals(this.f81101n, q3Var.f81101n) && Objects.equals(this.f81100m, q3Var.f81100m);
    }

    public int hashCode() {
        return Objects.hash(this.f81088a, this.f81089b, this.f81090c, this.f81091d, this.f81092e, this.f81093f, this.f81094g, this.f81095h, this.f81096i, this.f81099l, this.f81100m, this.f81101n);
    }

    public io.sentry.protocol.x n() {
        return this.f81090c;
    }

    public io.sentry.protocol.d o() {
        return this.f81088a;
    }

    public String p() {
        return this.f81093f;
    }

    public File q() {
        return this.f81098k;
    }

    public void r(io.sentry.protocol.d dVar) {
        this.f81088a = dVar;
    }

    public void s(String str) {
        this.f81099l = str;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        if (this.f81088a != null) {
            j3Var.N("debug_meta").V(iLogger, this.f81088a);
        }
        j3Var.N("profiler_id").V(iLogger, this.f81089b);
        j3Var.N("chunk_id").V(iLogger, this.f81090c);
        if (this.f81091d != null) {
            j3Var.N("client_sdk").V(iLogger, this.f81091d);
        }
        if (!this.f81092e.isEmpty()) {
            String strO = j3Var.O();
            j3Var.T("");
            j3Var.N("measurements").V(iLogger, this.f81092e);
            j3Var.T(strO);
        }
        j3Var.N("platform").V(iLogger, this.f81093f);
        j3Var.N("release").V(iLogger, this.f81094g);
        if (this.f81095h != null) {
            j3Var.N(AnalyticsAttribute.Environment).V(iLogger, this.f81095h);
        }
        j3Var.N("version").V(iLogger, this.f81096i);
        if (this.f81099l != null) {
            j3Var.N("sampled_profile").V(iLogger, this.f81099l);
        }
        j3Var.N("timestamp").V(iLogger, m(Double.valueOf(this.f81097j)));
        if (this.f81100m != null) {
            j3Var.N(Scopes.PROFILE).V(iLogger, this.f81100m);
        }
        Map<String, Object> map = this.f81101n;
        if (map != null) {
            for (String str : map.keySet()) {
                j3Var.N(str).V(iLogger, this.f81101n.get(str));
            }
        }
        j3Var.j();
    }

    public void t(io.sentry.protocol.profiling.a aVar) {
        this.f81100m = aVar;
    }

    public void u(Map<String, Object> map) {
        this.f81101n = map;
    }

    public q3(io.sentry.protocol.x xVar, io.sentry.protocol.x xVar2, File file, Map<String, io.sentry.profilemeasurements.a> map, Double d11, String str, q7 q7Var) {
        this.f81099l = null;
        this.f81089b = xVar;
        this.f81090c = xVar2;
        this.f81098k = file;
        this.f81092e = map;
        this.f81088a = null;
        this.f81091d = q7Var.getSdkVersion();
        this.f81094g = q7Var.getRelease() != null ? q7Var.getRelease() : "";
        this.f81095h = q7Var.getEnvironment();
        this.f81093f = str;
        this.f81096i = "2";
        this.f81097j = d11.doubleValue();
    }
}
