package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f80840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f80841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f80842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f80843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f80844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f80845f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f80846g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, String> f80847h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<String> f80848i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f80849j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Boolean f80850k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Boolean f80851l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<String> f80852m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map<String, Object> f80853n;

    /* JADX INFO: renamed from: io.sentry.protocol.a$a, reason: collision with other inner class name */
    public static final class C1702a implements q1<a> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            a aVar = new a();
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "split_names":
                        List<String> list = (List) i3Var.z3();
                        if (list == null) {
                            break;
                        } else {
                            aVar.u(list);
                            break;
                        }
                        break;
                    case "device_app_hash":
                        aVar.f80842c = i3Var.a1();
                        break;
                    case "start_type":
                        aVar.f80849j = i3Var.a1();
                        break;
                    case "view_names":
                        List<String> list2 = (List) i3Var.z3();
                        if (list2 == null) {
                            break;
                        } else {
                            aVar.x(list2);
                            break;
                        }
                        break;
                    case "app_version":
                        aVar.f80845f = i3Var.a1();
                        break;
                    case "in_foreground":
                        aVar.f80850k = i3Var.o0();
                        break;
                    case "build_type":
                        aVar.f80843d = i3Var.a1();
                        break;
                    case "app_identifier":
                        aVar.f80840a = i3Var.a1();
                        break;
                    case "app_start_time":
                        aVar.f80841b = i3Var.m0(iLogger);
                        break;
                    case "permissions":
                        aVar.f80847h = io.sentry.util.c.b((Map) i3Var.z3());
                        break;
                    case "app_name":
                        aVar.f80844e = i3Var.a1();
                        break;
                    case "app_build":
                        aVar.f80846g = i3Var.a1();
                        break;
                    case "is_split_apks":
                        aVar.f80851l = i3Var.o0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        i3Var.a3(iLogger, concurrentHashMap, strL);
                        break;
                }
            }
            aVar.w(concurrentHashMap);
            i3Var.j();
            return aVar;
        }
    }

    public a() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (io.sentry.util.y.a(this.f80840a, aVar.f80840a) && io.sentry.util.y.a(this.f80841b, aVar.f80841b) && io.sentry.util.y.a(this.f80842c, aVar.f80842c) && io.sentry.util.y.a(this.f80843d, aVar.f80843d) && io.sentry.util.y.a(this.f80844e, aVar.f80844e) && io.sentry.util.y.a(this.f80845f, aVar.f80845f) && io.sentry.util.y.a(this.f80846g, aVar.f80846g) && io.sentry.util.y.a(this.f80847h, aVar.f80847h) && io.sentry.util.y.a(this.f80850k, aVar.f80850k) && io.sentry.util.y.a(this.f80848i, aVar.f80848i) && io.sentry.util.y.a(this.f80849j, aVar.f80849j) && io.sentry.util.y.a(this.f80851l, aVar.f80851l) && io.sentry.util.y.a(this.f80852m, aVar.f80852m)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.y.b(this.f80840a, this.f80841b, this.f80842c, this.f80843d, this.f80844e, this.f80845f, this.f80846g, this.f80847h, this.f80850k, this.f80848i, this.f80849j, this.f80851l, this.f80852m);
    }

    public Boolean l() {
        return this.f80850k;
    }

    public void m(String str) {
        this.f80846g = str;
    }

    public void n(String str) {
        this.f80840a = str;
    }

    public void o(String str) {
        this.f80844e = str;
    }

    public void p(Date date) {
        this.f80841b = date;
    }

    public void q(String str) {
        this.f80845f = str;
    }

    public void r(Boolean bool) {
        this.f80850k = bool;
    }

    public void s(Map<String, String> map) {
        this.f80847h = map;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        if (this.f80840a != null) {
            j3Var.N("app_identifier").w(this.f80840a);
        }
        if (this.f80841b != null) {
            j3Var.N("app_start_time").V(iLogger, this.f80841b);
        }
        if (this.f80842c != null) {
            j3Var.N("device_app_hash").w(this.f80842c);
        }
        if (this.f80843d != null) {
            j3Var.N("build_type").w(this.f80843d);
        }
        if (this.f80844e != null) {
            j3Var.N("app_name").w(this.f80844e);
        }
        if (this.f80845f != null) {
            j3Var.N("app_version").w(this.f80845f);
        }
        if (this.f80846g != null) {
            j3Var.N("app_build").w(this.f80846g);
        }
        Map<String, String> map = this.f80847h;
        if (map != null && !map.isEmpty()) {
            j3Var.N("permissions").V(iLogger, this.f80847h);
        }
        if (this.f80850k != null) {
            j3Var.N("in_foreground").W(this.f80850k);
        }
        if (this.f80848i != null) {
            j3Var.N("view_names").V(iLogger, this.f80848i);
        }
        if (this.f80849j != null) {
            j3Var.N("start_type").w(this.f80849j);
        }
        if (this.f80851l != null) {
            j3Var.N("is_split_apks").W(this.f80851l);
        }
        List<String> list = this.f80852m;
        if (list != null && !list.isEmpty()) {
            j3Var.N("split_names").V(iLogger, this.f80852m);
        }
        Map<String, Object> map2 = this.f80853n;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                j3Var.N(str).V(iLogger, this.f80853n.get(str));
            }
        }
        j3Var.j();
    }

    public void t(Boolean bool) {
        this.f80851l = bool;
    }

    public void u(List<String> list) {
        this.f80852m = list;
    }

    public void v(String str) {
        this.f80849j = str;
    }

    public void w(Map<String, Object> map) {
        this.f80853n = map;
    }

    public void x(List<String> list) {
        this.f80848i = list;
    }

    a(a aVar) {
        this.f80846g = aVar.f80846g;
        this.f80840a = aVar.f80840a;
        this.f80844e = aVar.f80844e;
        this.f80841b = aVar.f80841b;
        this.f80845f = aVar.f80845f;
        this.f80843d = aVar.f80843d;
        this.f80842c = aVar.f80842c;
        this.f80847h = io.sentry.util.c.b(aVar.f80847h);
        this.f80850k = aVar.f80850k;
        this.f80848i = io.sentry.util.c.a(aVar.f80848i);
        this.f80849j = aVar.f80849j;
        this.f80851l = aVar.f80851l;
        this.f80852m = aVar.f80852m;
        this.f80853n = io.sentry.util.c.b(aVar.f80853n);
    }
}
