package io.sentry.rrweb;

import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends b implements a2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f81282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f81283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f81284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f81285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f81286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, Object> f81287h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, Object> f81288i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<String, Object> f81289j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map<String, Object> f81290k;

    public static final class a implements q1<i> {
        private void c(i iVar, i3 i3Var, ILogger iLogger) {
            i3Var.h();
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                if (strL.equals(StatusResponse.PAYLOAD)) {
                    d(iVar, i3Var, iLogger);
                } else if (strL.equals("tag")) {
                    String strA1 = i3Var.a1();
                    if (strA1 == null) {
                        strA1 = "";
                    }
                    iVar.f81282c = strA1;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    i3Var.a3(iLogger, concurrentHashMap, strL);
                }
            }
            iVar.p(concurrentHashMap);
            i3Var.j();
        }

        private void d(i iVar, i3 i3Var, ILogger iLogger) {
            i3Var.h();
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "description":
                        iVar.f81284e = i3Var.a1();
                        break;
                    case "endTimestamp":
                        iVar.f81286g = i3Var.nextDouble();
                        break;
                    case "startTimestamp":
                        iVar.f81285f = i3Var.nextDouble();
                        break;
                    case "op":
                        iVar.f81283d = i3Var.a1();
                        break;
                    case "data":
                        Map mapB = io.sentry.util.c.b((Map) i3Var.z3());
                        if (mapB == null) {
                            break;
                        } else {
                            iVar.f81287h = mapB;
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
            iVar.t(concurrentHashMap);
            i3Var.j();
        }

        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            i iVar = new i();
            b.a aVar = new b.a();
            HashMap map = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                if (strL.equals("data")) {
                    c(iVar, i3Var, iLogger);
                } else if (!aVar.a(iVar, strL, i3Var, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    i3Var.a3(iLogger, map, strL);
                }
            }
            iVar.v(map);
            i3Var.j();
            return iVar;
        }
    }

    public i() {
        super(c.Custom);
        this.f81282c = "performanceSpan";
    }

    private void m(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        j3Var.N("tag").w(this.f81282c);
        j3Var.N(StatusResponse.PAYLOAD);
        n(j3Var, iLogger);
        Map<String, Object> map = this.f81290k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f81290k.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    private void n(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        if (this.f81283d != null) {
            j3Var.N("op").w(this.f81283d);
        }
        if (this.f81284e != null) {
            j3Var.N("description").w(this.f81284e);
        }
        j3Var.N("startTimestamp").V(iLogger, BigDecimal.valueOf(this.f81285f));
        j3Var.N("endTimestamp").V(iLogger, BigDecimal.valueOf(this.f81286g));
        if (this.f81287h != null) {
            j3Var.N("data").V(iLogger, this.f81287h);
        }
        Map<String, Object> map = this.f81289j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f81289j.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    public void o(Map<String, Object> map) {
        this.f81287h = map == null ? null : new ConcurrentHashMap(map);
    }

    public void p(Map<String, Object> map) {
        this.f81290k = map;
    }

    public void q(String str) {
        this.f81284e = str;
    }

    public void r(double d11) {
        this.f81286g = d11;
    }

    public void s(String str) {
        this.f81283d = str;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        new b.C1706b().a(this, j3Var, iLogger);
        j3Var.N("data");
        m(j3Var, iLogger);
        Map<String, Object> map = this.f81288i;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f81288i.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    public void t(Map<String, Object> map) {
        this.f81289j = map;
    }

    public void u(double d11) {
        this.f81285f = d11;
    }

    public void v(Map<String, Object> map) {
        this.f81288i = map;
    }
}
