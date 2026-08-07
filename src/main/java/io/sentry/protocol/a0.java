package io.sentry.protocol;

import expo.modules.interfaces.permissions.PermissionsResponse;
import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.b7;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.j8;
import io.sentry.p8;
import io.sentry.q1;
import io.sentry.r8;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Double f80854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Double f80855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f80856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p8 f80857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p8 f80858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f80859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f80860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final r8 f80861h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f80862i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map<String, String> f80863j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map<String, Object> f80864k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map<String, k> f80865l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Map<String, Object> f80866m;

    public static final class a implements q1<a0> {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.a(b7.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a0 a(i3 i3Var, ILogger iLogger) throws Exception {
            i3Var.h();
            ConcurrentHashMap concurrentHashMap = null;
            Double dValueOf = null;
            Map map = null;
            x xVarA = null;
            p8 p8VarA = null;
            Map map2 = null;
            String strA1 = null;
            Double dValueOf2 = null;
            p8 p8Var = null;
            String strA2 = null;
            r8 r8Var = null;
            String strA3 = null;
            Map map3 = null;
            while (true) {
                ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                Double d11 = dValueOf;
                Map map4 = map;
                x xVar = xVarA;
                p8 p8Var2 = p8VarA;
                if (i3Var.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                    if (d11 == null) {
                        throw c("start_timestamp", iLogger);
                    }
                    if (xVar == null) {
                        throw c("trace_id", iLogger);
                    }
                    if (p8Var2 == null) {
                        throw c("span_id", iLogger);
                    }
                    if (strA1 == null) {
                        throw c("op", iLogger);
                    }
                    Map map5 = map4 == null ? new HashMap() : map4;
                    if (map2 == null) {
                        map2 = new HashMap();
                    }
                    a0 a0Var = new a0(d11, dValueOf2, xVar, p8Var2, p8Var, strA1, strA2, r8Var, strA3, map5, map2, map3);
                    a0Var.i(concurrentHashMap2);
                    i3Var.j();
                    return a0Var;
                }
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "span_id":
                        p8VarA = new p8.a().a(i3Var, iLogger);
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d11;
                        map = map4;
                        xVarA = xVar;
                        break;
                    case "parent_span_id":
                        p8Var = (p8) i3Var.v0(iLogger, new p8.a());
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d11;
                        map = map4;
                        xVarA = xVar;
                        p8VarA = p8Var2;
                        break;
                    case "description":
                        strA2 = i3Var.a1();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d11;
                        map = map4;
                        xVarA = xVar;
                        p8VarA = p8Var2;
                        break;
                    case "start_timestamp":
                        try {
                            dValueOf = i3Var.j2();
                            break;
                        } catch (NumberFormatException unused) {
                            Date dateM0 = i3Var.m0(iLogger);
                            dValueOf = dateM0 != null ? Double.valueOf(io.sentry.l.b(dateM0)) : null;
                        }
                        concurrentHashMap = concurrentHashMap2;
                        map = map4;
                        xVarA = xVar;
                        p8VarA = p8Var2;
                        break;
                    case "origin":
                        strA3 = i3Var.a1();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d11;
                        map = map4;
                        xVarA = xVar;
                        p8VarA = p8Var2;
                        break;
                    case "status":
                        r8Var = (r8) i3Var.v0(iLogger, new r8.a());
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d11;
                        map = map4;
                        xVarA = xVar;
                        p8VarA = p8Var2;
                        break;
                    case "measurements":
                        map2 = i3Var.Y2(iLogger, new k.a());
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d11;
                        map = map4;
                        xVarA = xVar;
                        p8VarA = p8Var2;
                        break;
                    case "op":
                        strA1 = i3Var.a1();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d11;
                        map = map4;
                        xVarA = xVar;
                        p8VarA = p8Var2;
                        break;
                    case "data":
                        map3 = (Map) i3Var.z3();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d11;
                        map = map4;
                        xVarA = xVar;
                        p8VarA = p8Var2;
                        break;
                    case "tags":
                        map = (Map) i3Var.z3();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d11;
                        xVarA = xVar;
                        p8VarA = p8Var2;
                        break;
                    case "timestamp":
                        try {
                            dValueOf2 = i3Var.j2();
                            break;
                        } catch (NumberFormatException unused2) {
                            Date dateM1 = i3Var.m0(iLogger);
                            dValueOf2 = dateM1 != null ? Double.valueOf(io.sentry.l.b(dateM1)) : null;
                        }
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d11;
                        map = map4;
                        xVarA = xVar;
                        p8VarA = p8Var2;
                        break;
                    case "trace_id":
                        xVarA = new x.a().a(i3Var, iLogger);
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d11;
                        map = map4;
                        p8VarA = p8Var2;
                        break;
                    default:
                        concurrentHashMap = concurrentHashMap2 == null ? new ConcurrentHashMap() : concurrentHashMap2;
                        i3Var.a3(iLogger, concurrentHashMap, strL);
                        dValueOf = d11;
                        map = map4;
                        xVarA = xVar;
                        p8VarA = p8Var2;
                        break;
                }
            }
        }
    }

    public a0(j8 j8Var) {
        this(j8Var, j8Var.s());
    }

    private BigDecimal a(Double d11) {
        return BigDecimal.valueOf(d11.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public Map<String, Object> b() {
        return this.f80864k;
    }

    public Map<String, k> c() {
        return this.f80865l;
    }

    public String d() {
        return this.f80859f;
    }

    public p8 e() {
        return this.f80857d;
    }

    public Double f() {
        return this.f80854a;
    }

    public Double g() {
        return this.f80855b;
    }

    public void h(Map<String, Object> map) {
        this.f80864k = map;
    }

    public void i(Map<String, Object> map) {
        this.f80866m = map;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        j3Var.N("start_timestamp").V(iLogger, a(this.f80854a));
        if (this.f80855b != null) {
            j3Var.N("timestamp").V(iLogger, a(this.f80855b));
        }
        j3Var.N("trace_id").V(iLogger, this.f80856c);
        j3Var.N("span_id").V(iLogger, this.f80857d);
        if (this.f80858e != null) {
            j3Var.N("parent_span_id").V(iLogger, this.f80858e);
        }
        j3Var.N("op").w(this.f80859f);
        if (this.f80860g != null) {
            j3Var.N("description").w(this.f80860g);
        }
        if (this.f80861h != null) {
            j3Var.N(PermissionsResponse.STATUS_KEY).V(iLogger, this.f80861h);
        }
        if (this.f80862i != null) {
            j3Var.N("origin").V(iLogger, this.f80862i);
        }
        if (!this.f80863j.isEmpty()) {
            j3Var.N("tags").V(iLogger, this.f80863j);
        }
        if (this.f80864k != null) {
            j3Var.N("data").V(iLogger, this.f80864k);
        }
        if (!this.f80865l.isEmpty()) {
            j3Var.N("measurements").V(iLogger, this.f80865l);
        }
        Map<String, Object> map = this.f80866m;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f80866m.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    public a0(j8 j8Var, Map<String, Object> map) {
        io.sentry.util.y.c(j8Var, "span is required");
        this.f80860g = j8Var.getDescription();
        this.f80859f = j8Var.v();
        this.f80857d = j8Var.A();
        this.f80858e = j8Var.x();
        this.f80856c = j8Var.C();
        this.f80861h = j8Var.getStatus();
        this.f80862i = j8Var.e().g();
        Map<String, String> mapB = io.sentry.util.c.b(j8Var.B());
        this.f80863j = mapB == null ? new ConcurrentHashMap<>() : mapB;
        Map<String, k> mapB2 = io.sentry.util.c.b(j8Var.u());
        this.f80865l = mapB2 == null ? new ConcurrentHashMap<>() : mapB2;
        this.f80855b = j8Var.q() == null ? null : Double.valueOf(io.sentry.l.m(j8Var.r().e(j8Var.q())));
        this.f80854a = Double.valueOf(io.sentry.l.m(j8Var.r().f()));
        this.f80864k = map;
        g gVarG = j8Var.e().d().g();
        if (gVarG != null) {
            if (this.f80864k == null) {
                this.f80864k = new HashMap();
            }
            for (f fVar : gVarG.a()) {
                this.f80864k.put("flag.evaluation." + fVar.a(), fVar.b());
            }
        }
    }

    public a0(Double d11, Double d12, x xVar, p8 p8Var, p8 p8Var2, String str, String str2, r8 r8Var, String str3, Map<String, String> map, Map<String, k> map2, Map<String, Object> map3) {
        this.f80854a = d11;
        this.f80855b = d12;
        this.f80856c = xVar;
        this.f80857d = p8Var;
        this.f80858e = p8Var2;
        this.f80859f = str;
        this.f80860g = str2;
        this.f80861h = r8Var;
        this.f80862i = str3;
        this.f80863j = map;
        this.f80865l = map2;
        this.f80864k = map3;
    }
}
