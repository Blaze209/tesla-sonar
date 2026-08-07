package io.sentry;

import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class k8 implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.protocol.x f80718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p8 f80719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p8 f80720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient y8 f80721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected String f80722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f80723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected r8 f80724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected Map<String, String> f80725h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected String f80726i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected Map<String, Object> f80727j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map<String, Object> f80728k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private n1 f80729l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected d f80730m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected io.sentry.featureflags.b f80731n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private io.sentry.protocol.x f80732o;

    public static final class a implements q1<k8> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k8 a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            String strO = null;
            io.sentry.protocol.x xVarA = null;
            p8 p8VarB = null;
            p8 p8Var = null;
            ConcurrentHashMap concurrentHashMap = null;
            String strO2 = null;
            r8 r8Var = null;
            String strO3 = null;
            Map<String, String> mapB = null;
            Map<String, Object> map = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "span_id":
                        p8VarB = new p8.a().a(i3Var, iLogger);
                        break;
                    case "parent_span_id":
                        p8Var = (p8) i3Var.v0(iLogger, new p8.a());
                        break;
                    case "description":
                        strO2 = i3Var.O();
                        break;
                    case "origin":
                        strO3 = i3Var.O();
                        break;
                    case "status":
                        r8Var = (r8) i3Var.v0(iLogger, new r8.a());
                        break;
                    case "op":
                        strO = i3Var.O();
                        break;
                    case "data":
                        map = (Map) i3Var.z3();
                        break;
                    case "tags":
                        mapB = io.sentry.util.c.b((Map) i3Var.z3());
                        break;
                    case "trace_id":
                        xVarA = new io.sentry.protocol.x.a().a(i3Var, iLogger);
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        i3Var.a3(iLogger, concurrentHashMap, strL);
                        break;
                }
            }
            if (xVarA == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
                iLogger.a(b7.ERROR, "Missing required field \"trace_id\"", illegalStateException);
                throw illegalStateException;
            }
            if (p8VarB == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"span_id\"");
                iLogger.a(b7.ERROR, "Missing required field \"span_id\"", illegalStateException2);
                throw illegalStateException2;
            }
            if (strO == null) {
                strO = "";
            }
            k8 k8Var = new k8(xVarA, p8VarB, strO, p8Var, null);
            k8Var.r(strO2);
            k8Var.v(r8Var);
            k8Var.t(strO3);
            if (mapB != null) {
                k8Var.f80725h = mapB;
            }
            if (map != null) {
                k8Var.f80727j = map;
            }
            k8Var.w(concurrentHashMap);
            i3Var.j();
            return k8Var;
        }
    }

    public k8(String str) {
        this(new io.sentry.protocol.x(), new p8(), str, null, null);
    }

    public k8 a(String str, p8 p8Var, p8 p8Var2) {
        io.sentry.protocol.x xVar = this.f80718a;
        if (p8Var2 == null) {
            p8Var2 = new p8();
        }
        return new k8(xVar, p8Var2, p8Var, str, null, this.f80721d, null, "manual");
    }

    public d b() {
        return this.f80730m;
    }

    public String c() {
        return this.f80723f;
    }

    public io.sentry.featureflags.b d() {
        return this.f80731n;
    }

    public n1 e() {
        return this.f80729l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8)) {
            return false;
        }
        k8 k8Var = (k8) obj;
        return this.f80718a.equals(k8Var.f80718a) && this.f80719b.equals(k8Var.f80719b) && io.sentry.util.y.a(this.f80720c, k8Var.f80720c) && this.f80722e.equals(k8Var.f80722e) && io.sentry.util.y.a(this.f80723f, k8Var.f80723f) && n() == k8Var.n();
    }

    public String f() {
        return this.f80722e;
    }

    public String g() {
        return this.f80726i;
    }

    public p8 h() {
        return this.f80720c;
    }

    public int hashCode() {
        return io.sentry.util.y.b(this.f80718a, this.f80719b, this.f80720c, this.f80722e, this.f80723f, n());
    }

    public Boolean i() {
        y8 y8Var = this.f80721d;
        if (y8Var == null) {
            return null;
        }
        return y8Var.b();
    }

    public io.sentry.protocol.x j() {
        return this.f80732o;
    }

    public Boolean k() {
        y8 y8Var = this.f80721d;
        if (y8Var == null) {
            return null;
        }
        return y8Var.e();
    }

    public y8 l() {
        return this.f80721d;
    }

    public p8 m() {
        return this.f80719b;
    }

    public r8 n() {
        return this.f80724g;
    }

    public Map<String, String> o() {
        return this.f80725h;
    }

    public io.sentry.protocol.x p() {
        return this.f80718a;
    }

    public void q(String str, Object obj) {
        if (str == null) {
            return;
        }
        if (obj == null) {
            this.f80727j.remove(str);
        } else {
            this.f80727j.put(str, obj);
        }
    }

    public void r(String str) {
        this.f80723f = str;
    }

    public void s(n1 n1Var) {
        this.f80729l = n1Var;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        j3Var.N("trace_id");
        this.f80718a.serialize(j3Var, iLogger);
        j3Var.N("span_id");
        this.f80719b.serialize(j3Var, iLogger);
        if (this.f80720c != null) {
            j3Var.N("parent_span_id");
            this.f80720c.serialize(j3Var, iLogger);
        }
        j3Var.N("op").w(this.f80722e);
        if (this.f80723f != null) {
            j3Var.N("description").w(this.f80723f);
        }
        if (n() != null) {
            j3Var.N(PermissionsResponse.STATUS_KEY).V(iLogger, n());
        }
        if (this.f80726i != null) {
            j3Var.N("origin").V(iLogger, this.f80726i);
        }
        if (!this.f80725h.isEmpty()) {
            j3Var.N("tags").V(iLogger, this.f80725h);
        }
        if (!this.f80727j.isEmpty()) {
            j3Var.N("data").V(iLogger, this.f80727j);
        }
        Map<String, Object> map = this.f80728k;
        if (map != null) {
            for (String str : map.keySet()) {
                j3Var.N(str).V(iLogger, this.f80728k.get(str));
            }
        }
        j3Var.j();
    }

    public void t(String str) {
        this.f80726i = str;
    }

    public void u(y8 y8Var) {
        this.f80721d = y8Var;
        d dVar = this.f80730m;
        if (dVar != null) {
            dVar.G(y8Var);
        }
    }

    public void v(r8 r8Var) {
        this.f80724g = r8Var;
    }

    public void w(Map<String, Object> map) {
        this.f80728k = map;
    }

    public k8(io.sentry.protocol.x xVar, p8 p8Var, String str, p8 p8Var2, y8 y8Var) {
        this(xVar, p8Var, p8Var2, str, null, y8Var, null, "manual");
    }

    public k8(io.sentry.protocol.x xVar, p8 p8Var, p8 p8Var2, String str, String str2, y8 y8Var, r8 r8Var, String str3) {
        this.f80725h = new ConcurrentHashMap();
        this.f80726i = "manual";
        this.f80727j = new ConcurrentHashMap();
        this.f80729l = n1.SENTRY;
        this.f80731n = io.sentry.featureflags.d.a();
        this.f80732o = io.sentry.protocol.x.f81078b;
        this.f80718a = (io.sentry.protocol.x) io.sentry.util.y.c(xVar, "traceId is required");
        this.f80719b = (p8) io.sentry.util.y.c(p8Var, "spanId is required");
        this.f80722e = (String) io.sentry.util.y.c(str, "operation is required");
        this.f80720c = p8Var2;
        this.f80723f = str2;
        this.f80724g = r8Var;
        this.f80726i = str3;
        u(y8Var);
        io.sentry.util.thread.a threadChecker = p4.g().getOptions().getThreadChecker();
        this.f80727j.put("thread.id", String.valueOf(threadChecker.c()));
        this.f80727j.put("thread.name", threadChecker.b());
    }

    public k8(k8 k8Var) {
        this.f80725h = new ConcurrentHashMap();
        this.f80726i = "manual";
        this.f80727j = new ConcurrentHashMap();
        this.f80729l = n1.SENTRY;
        this.f80731n = io.sentry.featureflags.d.a();
        this.f80732o = io.sentry.protocol.x.f81078b;
        this.f80718a = k8Var.f80718a;
        this.f80719b = k8Var.f80719b;
        this.f80720c = k8Var.f80720c;
        u(k8Var.f80721d);
        this.f80722e = k8Var.f80722e;
        this.f80723f = k8Var.f80723f;
        this.f80724g = k8Var.f80724g;
        Map<String, String> mapB = io.sentry.util.c.b(k8Var.f80725h);
        if (mapB != null) {
            this.f80725h = mapB;
        }
        Map<String, Object> mapB2 = io.sentry.util.c.b(k8Var.f80728k);
        if (mapB2 != null) {
            this.f80728k = mapB2;
        }
        this.f80730m = k8Var.f80730m;
        Map<String, Object> mapB3 = io.sentry.util.c.b(k8Var.f80727j);
        if (mapB3 != null) {
            this.f80727j = mapB3;
        }
    }
}
