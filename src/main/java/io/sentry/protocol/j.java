package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f80975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f80976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f80977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f80978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f80979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f80980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f80981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f80982h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f80983i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<String, Object> f80984j;

    public static final class a implements q1<j> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            j jVar = new j();
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "npot_support":
                        jVar.f80983i = i3Var.a1();
                        break;
                    case "vendor_id":
                        jVar.f80977c = i3Var.a1();
                        break;
                    case "multi_threaded_rendering":
                        jVar.f80981g = i3Var.o0();
                        break;
                    case "id":
                        jVar.f80976b = i3Var.N2();
                        break;
                    case "name":
                        jVar.f80975a = i3Var.a1();
                        break;
                    case "vendor_name":
                        jVar.f80978d = i3Var.a1();
                        break;
                    case "version":
                        jVar.f80982h = i3Var.a1();
                        break;
                    case "api_type":
                        jVar.f80980f = i3Var.a1();
                        break;
                    case "memory_size":
                        jVar.f80979e = i3Var.N2();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        i3Var.a3(iLogger, concurrentHashMap, strL);
                        break;
                }
            }
            jVar.j(concurrentHashMap);
            i3Var.j();
            return jVar;
        }
    }

    public j() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (io.sentry.util.y.a(this.f80975a, jVar.f80975a) && io.sentry.util.y.a(this.f80976b, jVar.f80976b) && io.sentry.util.y.a(this.f80977c, jVar.f80977c) && io.sentry.util.y.a(this.f80978d, jVar.f80978d) && io.sentry.util.y.a(this.f80979e, jVar.f80979e) && io.sentry.util.y.a(this.f80980f, jVar.f80980f) && io.sentry.util.y.a(this.f80981g, jVar.f80981g) && io.sentry.util.y.a(this.f80982h, jVar.f80982h) && io.sentry.util.y.a(this.f80983i, jVar.f80983i)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.y.b(this.f80975a, this.f80976b, this.f80977c, this.f80978d, this.f80979e, this.f80980f, this.f80981g, this.f80982h, this.f80983i);
    }

    public void j(Map<String, Object> map) {
        this.f80984j = map;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        if (this.f80975a != null) {
            j3Var.N("name").w(this.f80975a);
        }
        if (this.f80976b != null) {
            j3Var.N("id").U(this.f80976b);
        }
        if (this.f80977c != null) {
            j3Var.N("vendor_id").w(this.f80977c);
        }
        if (this.f80978d != null) {
            j3Var.N("vendor_name").w(this.f80978d);
        }
        if (this.f80979e != null) {
            j3Var.N("memory_size").U(this.f80979e);
        }
        if (this.f80980f != null) {
            j3Var.N("api_type").w(this.f80980f);
        }
        if (this.f80981g != null) {
            j3Var.N("multi_threaded_rendering").W(this.f80981g);
        }
        if (this.f80982h != null) {
            j3Var.N("version").w(this.f80982h);
        }
        if (this.f80983i != null) {
            j3Var.N("npot_support").w(this.f80983i);
        }
        Map<String, Object> map = this.f80984j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f80984j.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    j(j jVar) {
        this.f80975a = jVar.f80975a;
        this.f80976b = jVar.f80976b;
        this.f80977c = jVar.f80977c;
        this.f80978d = jVar.f80978d;
        this.f80979e = jVar.f80979e;
        this.f80980f = jVar.f80980f;
        this.f80981g = jVar.f80981g;
        this.f80982h = jVar.f80982h;
        this.f80983i = jVar.f80983i;
        this.f80984j = io.sentry.util.c.b(jVar.f80984j);
    }
}
