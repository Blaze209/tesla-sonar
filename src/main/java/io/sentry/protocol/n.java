package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f81019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f81020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f81021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f81022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f81023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f81024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, Object> f81025g;

    public static final class a implements q1<n> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public n a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            n nVar = new n();
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "rooted":
                        nVar.f81024f = i3Var.o0();
                        break;
                    case "raw_description":
                        nVar.f81021c = i3Var.a1();
                        break;
                    case "name":
                        nVar.f81019a = i3Var.a1();
                        break;
                    case "build":
                        nVar.f81022d = i3Var.a1();
                        break;
                    case "version":
                        nVar.f81020b = i3Var.a1();
                        break;
                    case "kernel_version":
                        nVar.f81023e = i3Var.a1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        i3Var.a3(iLogger, concurrentHashMap, strL);
                        break;
                }
            }
            nVar.l(concurrentHashMap);
            i3Var.j();
            return nVar;
        }
    }

    public n() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (io.sentry.util.y.a(this.f81019a, nVar.f81019a) && io.sentry.util.y.a(this.f81020b, nVar.f81020b) && io.sentry.util.y.a(this.f81021c, nVar.f81021c) && io.sentry.util.y.a(this.f81022d, nVar.f81022d) && io.sentry.util.y.a(this.f81023e, nVar.f81023e) && io.sentry.util.y.a(this.f81024f, nVar.f81024f)) {
                return true;
            }
        }
        return false;
    }

    public String g() {
        return this.f81019a;
    }

    public void h(String str) {
        this.f81022d = str;
    }

    public int hashCode() {
        return io.sentry.util.y.b(this.f81019a, this.f81020b, this.f81021c, this.f81022d, this.f81023e, this.f81024f);
    }

    public void i(String str) {
        this.f81023e = str;
    }

    public void j(String str) {
        this.f81019a = str;
    }

    public void k(Boolean bool) {
        this.f81024f = bool;
    }

    public void l(Map<String, Object> map) {
        this.f81025g = map;
    }

    public void m(String str) {
        this.f81020b = str;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        if (this.f81019a != null) {
            j3Var.N("name").w(this.f81019a);
        }
        if (this.f81020b != null) {
            j3Var.N("version").w(this.f81020b);
        }
        if (this.f81021c != null) {
            j3Var.N("raw_description").w(this.f81021c);
        }
        if (this.f81022d != null) {
            j3Var.N("build").w(this.f81022d);
        }
        if (this.f81023e != null) {
            j3Var.N("kernel_version").w(this.f81023e);
        }
        if (this.f81024f != null) {
            j3Var.N("rooted").W(this.f81024f);
        }
        Map<String, Object> map = this.f81025g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f81025g.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    n(n nVar) {
        this.f81019a = nVar.f81019a;
        this.f81020b = nVar.f81020b;
        this.f81021c = nVar.f81021c;
        this.f81022d = nVar.f81022d;
        this.f81023e = nVar.f81023e;
        this.f81024f = nVar.f81024f;
        this.f81025g = io.sentry.util.c.b(nVar.f81025g);
    }
}
