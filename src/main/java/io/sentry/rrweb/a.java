package io.sentry.rrweb;

import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.b7;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends b implements a2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f81243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f81244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f81245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f81246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f81247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b7 f81248h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, Object> f81249i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<String, Object> f81250j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map<String, Object> f81251k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<String, Object> f81252l;

    /* JADX INFO: renamed from: io.sentry.rrweb.a$a, reason: collision with other inner class name */
    public static final class C1705a implements q1<a> {
        private void c(a aVar, i3 i3Var, ILogger iLogger) {
            i3Var.h();
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                if (strL.equals(StatusResponse.PAYLOAD)) {
                    d(aVar, i3Var, iLogger);
                } else if (strL.equals("tag")) {
                    String strA1 = i3Var.a1();
                    if (strA1 == null) {
                        strA1 = "";
                    }
                    aVar.f81243c = strA1;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    i3Var.a3(iLogger, concurrentHashMap, strL);
                }
            }
            aVar.v(concurrentHashMap);
            i3Var.j();
        }

        private void d(a aVar, i3 i3Var, ILogger iLogger) {
            i3Var.h();
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "data":
                        Map mapB = io.sentry.util.c.b((Map) i3Var.z3());
                        if (mapB == null) {
                            break;
                        } else {
                            aVar.f81249i = mapB;
                            break;
                        }
                        break;
                    case "type":
                        aVar.f81245e = i3Var.a1();
                        break;
                    case "category":
                        aVar.f81246f = i3Var.a1();
                        break;
                    case "timestamp":
                        aVar.f81244d = i3Var.nextDouble();
                        break;
                    case "level":
                        try {
                            aVar.f81248h = new b7.a().a(i3Var, iLogger);
                            break;
                        } catch (Exception e11) {
                            iLogger.b(b7.DEBUG, e11, "Error when deserializing SentryLevel", new Object[0]);
                            break;
                        }
                        break;
                    case "message":
                        aVar.f81247g = i3Var.a1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        i3Var.a3(iLogger, concurrentHashMap, strL);
                        break;
                }
            }
            aVar.y(concurrentHashMap);
            i3Var.j();
        }

        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            a aVar = new a();
            b.a aVar2 = new b.a();
            HashMap map = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                if (strL.equals("data")) {
                    c(aVar, i3Var, iLogger);
                } else if (!aVar2.a(aVar, strL, i3Var, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    i3Var.a3(iLogger, map, strL);
                }
            }
            aVar.z(map);
            i3Var.j();
            return aVar;
        }
    }

    public a() {
        super(c.Custom);
        this.f81243c = "breadcrumb";
    }

    private void p(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        j3Var.N("tag").w(this.f81243c);
        j3Var.N(StatusResponse.PAYLOAD);
        q(j3Var, iLogger);
        Map<String, Object> map = this.f81252l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f81252l.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    private void q(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        if (this.f81245e != null) {
            j3Var.N("type").w(this.f81245e);
        }
        j3Var.N("timestamp").V(iLogger, BigDecimal.valueOf(this.f81244d));
        if (this.f81246f != null) {
            j3Var.N("category").w(this.f81246f);
        }
        if (this.f81247g != null) {
            j3Var.N("message").w(this.f81247g);
        }
        if (this.f81248h != null) {
            j3Var.N("level").V(iLogger, this.f81248h);
        }
        if (this.f81249i != null) {
            j3Var.N("data").V(iLogger, this.f81249i);
        }
        Map<String, Object> map = this.f81251k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f81251k.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    public String n() {
        return this.f81246f;
    }

    public Map<String, Object> o() {
        return this.f81249i;
    }

    public void r(double d11) {
        this.f81244d = d11;
    }

    public void s(String str) {
        this.f81245e = str;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        new b.C1706b().a(this, j3Var, iLogger);
        j3Var.N("data");
        p(j3Var, iLogger);
        Map<String, Object> map = this.f81250j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f81250j.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    public void t(String str) {
        this.f81246f = str;
    }

    public void u(Map<String, Object> map) {
        this.f81249i = map == null ? null : new ConcurrentHashMap(map);
    }

    public void v(Map<String, Object> map) {
        this.f81252l = map;
    }

    public void w(b7 b7Var) {
        this.f81248h = b7Var;
    }

    public void x(String str) {
        this.f81247g = str;
    }

    public void y(Map<String, Object> map) {
        this.f81251k = map;
    }

    public void z(Map<String, Object> map) {
        this.f81250j = map;
    }
}
