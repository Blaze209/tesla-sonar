package io.sentry;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class d7 implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private io.sentry.protocol.x f80475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Double f80476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f80477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g7 f80478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f80479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, e7> f80480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, Object> f80481g;

    public static final class a implements q1<d7> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d7 a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            io.sentry.protocol.x xVar = null;
            Double dJ2 = null;
            String strA1 = null;
            HashMap map = null;
            g7 g7Var = null;
            Map<String, e7> mapY2 = null;
            Integer numN2 = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "severity_number":
                        numN2 = i3Var.N2();
                        break;
                    case "body":
                        strA1 = i3Var.a1();
                        break;
                    case "timestamp":
                        dJ2 = i3Var.j2();
                        break;
                    case "level":
                        g7Var = (g7) i3Var.v0(iLogger, new g7.a());
                        break;
                    case "attributes":
                        mapY2 = i3Var.Y2(iLogger, new e7.a());
                        break;
                    case "trace_id":
                        xVar = (io.sentry.protocol.x) i3Var.v0(iLogger, new io.sentry.protocol.x.a());
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        i3Var.a3(iLogger, map, strL);
                        break;
                }
            }
            i3Var.j();
            if (xVar == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
                iLogger.a(b7.ERROR, "Missing required field \"trace_id\"", illegalStateException);
                throw illegalStateException;
            }
            if (dJ2 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"timestamp\"");
                iLogger.a(b7.ERROR, "Missing required field \"timestamp\"", illegalStateException2);
                throw illegalStateException2;
            }
            if (strA1 == null) {
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"body\"");
                iLogger.a(b7.ERROR, "Missing required field \"body\"", illegalStateException3);
                throw illegalStateException3;
            }
            if (g7Var == null) {
                IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"level\"");
                iLogger.a(b7.ERROR, "Missing required field \"level\"", illegalStateException4);
                throw illegalStateException4;
            }
            d7 d7Var = new d7(xVar, dJ2, strA1, g7Var);
            d7Var.a(mapY2);
            d7Var.b(numN2);
            d7Var.c(map);
            return d7Var;
        }
    }

    public d7(io.sentry.protocol.x xVar, Double d11, String str, g7 g7Var) {
        this.f80475a = xVar;
        this.f80476b = d11;
        this.f80477c = str;
        this.f80478d = g7Var;
    }

    public void a(Map<String, e7> map) {
        this.f80480f = map;
    }

    public void b(Integer num) {
        this.f80479e = num;
    }

    public void c(Map<String, Object> map) {
        this.f80481g = map;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        j3Var.N("timestamp").V(iLogger, l.c(this.f80476b));
        j3Var.N("trace_id").V(iLogger, this.f80475a);
        j3Var.N("body").w(this.f80477c);
        j3Var.N("level").V(iLogger, this.f80478d);
        if (this.f80479e != null) {
            j3Var.N("severity_number").V(iLogger, this.f80479e);
        }
        if (this.f80480f != null) {
            j3Var.N("attributes").V(iLogger, this.f80480f);
        }
        Map<String, Object> map = this.f80481g;
        if (map != null) {
            for (String str : map.keySet()) {
                j3Var.N(str).V(iLogger, this.f80481g.get(str));
            }
        }
        j3Var.j();
    }
}
