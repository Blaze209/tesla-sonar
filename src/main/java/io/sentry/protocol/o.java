package io.sentry.protocol;

import com.google.android.gms.common.internal.ImagesContract;
import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f81026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f81027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f81028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f81029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f81030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, String> f81031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, String> f81032g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f81033h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, String> f81034i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f81035j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f81036k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<String, Object> f81037l;

    public static final class a implements q1<o> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public o a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            o oVar = new o();
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "fragment":
                        oVar.f81035j = i3Var.a1();
                        break;
                    case "method":
                        oVar.f81027b = i3Var.a1();
                        break;
                    case "env":
                        Map map = (Map) i3Var.z3();
                        if (map == null) {
                            break;
                        } else {
                            oVar.f81032g = io.sentry.util.c.b(map);
                            break;
                        }
                        break;
                    case "url":
                        oVar.f81026a = i3Var.a1();
                        break;
                    case "data":
                        oVar.f81029d = i3Var.z3();
                        break;
                    case "other":
                        Map map2 = (Map) i3Var.z3();
                        if (map2 == null) {
                            break;
                        } else {
                            oVar.f81034i = io.sentry.util.c.b(map2);
                            break;
                        }
                        break;
                    case "headers":
                        Map map3 = (Map) i3Var.z3();
                        if (map3 == null) {
                            break;
                        } else {
                            oVar.f81031f = io.sentry.util.c.b(map3);
                            break;
                        }
                        break;
                    case "cookies":
                        oVar.f81030e = i3Var.a1();
                        break;
                    case "body_size":
                        oVar.f81033h = i3Var.R2();
                        break;
                    case "query_string":
                        oVar.f81028c = i3Var.a1();
                        break;
                    case "api_target":
                        oVar.f81036k = i3Var.a1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        i3Var.a3(iLogger, concurrentHashMap, strL);
                        break;
                }
            }
            oVar.m(concurrentHashMap);
            i3Var.j();
            return oVar;
        }
    }

    public o() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (io.sentry.util.y.a(this.f81026a, oVar.f81026a) && io.sentry.util.y.a(this.f81027b, oVar.f81027b) && io.sentry.util.y.a(this.f81028c, oVar.f81028c) && io.sentry.util.y.a(this.f81030e, oVar.f81030e) && io.sentry.util.y.a(this.f81031f, oVar.f81031f) && io.sentry.util.y.a(this.f81032g, oVar.f81032g) && io.sentry.util.y.a(this.f81033h, oVar.f81033h) && io.sentry.util.y.a(this.f81035j, oVar.f81035j) && io.sentry.util.y.a(this.f81036k, oVar.f81036k)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.y.b(this.f81026a, this.f81027b, this.f81028c, this.f81030e, this.f81031f, this.f81032g, this.f81033h, this.f81035j, this.f81036k);
    }

    public Map<String, String> l() {
        return this.f81031f;
    }

    public void m(Map<String, Object> map) {
        this.f81037l = map;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        if (this.f81026a != null) {
            j3Var.N(ImagesContract.URL).w(this.f81026a);
        }
        if (this.f81027b != null) {
            j3Var.N("method").w(this.f81027b);
        }
        if (this.f81028c != null) {
            j3Var.N("query_string").w(this.f81028c);
        }
        if (this.f81029d != null) {
            j3Var.N("data").V(iLogger, this.f81029d);
        }
        if (this.f81030e != null) {
            j3Var.N("cookies").w(this.f81030e);
        }
        if (this.f81031f != null) {
            j3Var.N("headers").V(iLogger, this.f81031f);
        }
        if (this.f81032g != null) {
            j3Var.N("env").V(iLogger, this.f81032g);
        }
        if (this.f81034i != null) {
            j3Var.N("other").V(iLogger, this.f81034i);
        }
        if (this.f81035j != null) {
            j3Var.N("fragment").V(iLogger, this.f81035j);
        }
        if (this.f81033h != null) {
            j3Var.N("body_size").V(iLogger, this.f81033h);
        }
        if (this.f81036k != null) {
            j3Var.N("api_target").V(iLogger, this.f81036k);
        }
        Map<String, Object> map = this.f81037l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f81037l.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    public o(o oVar) {
        this.f81026a = oVar.f81026a;
        this.f81030e = oVar.f81030e;
        this.f81027b = oVar.f81027b;
        this.f81028c = oVar.f81028c;
        this.f81031f = io.sentry.util.c.b(oVar.f81031f);
        this.f81032g = io.sentry.util.c.b(oVar.f81032g);
        this.f81034i = io.sentry.util.c.b(oVar.f81034i);
        this.f81037l = io.sentry.util.c.b(oVar.f81037l);
        this.f81029d = oVar.f81029d;
        this.f81035j = oVar.f81035j;
        this.f81033h = oVar.f81033h;
        this.f81036k = oVar.f81036k;
    }
}
