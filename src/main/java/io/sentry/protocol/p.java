package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f81038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f81039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f81040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f81041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f81042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, Object> f81043f;

    public static final class a implements q1<p> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            p pVar = new p();
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "status_code":
                        pVar.f81040c = i3Var.N2();
                        break;
                    case "data":
                        pVar.f81042e = i3Var.z3();
                        break;
                    case "headers":
                        Map map = (Map) i3Var.z3();
                        if (map == null) {
                            break;
                        } else {
                            pVar.f81039b = io.sentry.util.c.b(map);
                            break;
                        }
                        break;
                    case "cookies":
                        pVar.f81038a = i3Var.a1();
                        break;
                    case "body_size":
                        pVar.f81041d = i3Var.R2();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        i3Var.a3(iLogger, concurrentHashMap, strL);
                        break;
                }
            }
            pVar.f(concurrentHashMap);
            i3Var.j();
            return pVar;
        }
    }

    public p() {
    }

    public void f(Map<String, Object> map) {
        this.f81043f = map;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        if (this.f81038a != null) {
            j3Var.N("cookies").w(this.f81038a);
        }
        if (this.f81039b != null) {
            j3Var.N("headers").V(iLogger, this.f81039b);
        }
        if (this.f81040c != null) {
            j3Var.N("status_code").V(iLogger, this.f81040c);
        }
        if (this.f81041d != null) {
            j3Var.N("body_size").V(iLogger, this.f81041d);
        }
        if (this.f81042e != null) {
            j3Var.N("data").V(iLogger, this.f81042e);
        }
        Map<String, Object> map = this.f81043f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f81043f.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    public p(p pVar) {
        this.f81038a = pVar.f81038a;
        this.f81039b = io.sentry.util.c.b(pVar.f81039b);
        this.f81043f = io.sentry.util.c.b(pVar.f81043f);
        this.f81040c = pVar.f81040c;
        this.f81041d = pVar.f81041d;
        this.f81042e = pVar.f81042e;
    }
}
