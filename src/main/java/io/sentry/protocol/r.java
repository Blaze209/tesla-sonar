package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.b7;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import io.sentry.z6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes9.dex */
public final class r implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f81061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f81062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<y> f81063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set<String> f81064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Object> f81065e;

    public static final class a implements q1<r> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public r a(i3 i3Var, ILogger iLogger) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            i3Var.h();
            String strO = null;
            String strO2 = null;
            HashMap map = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "name":
                        strO = i3Var.O();
                        break;
                    case "version":
                        strO2 = i3Var.O();
                        break;
                    case "packages":
                        List listG1 = i3Var.G1(iLogger, new y.a());
                        if (listG1 == null) {
                            break;
                        } else {
                            arrayList.addAll(listG1);
                            break;
                        }
                        break;
                    case "integrations":
                        List list = (List) i3Var.z3();
                        if (list == null) {
                            break;
                        } else {
                            arrayList2.addAll(list);
                            break;
                        }
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
            if (strO == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                iLogger.a(b7.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            }
            if (strO2 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
                iLogger.a(b7.ERROR, "Missing required field \"version\"", illegalStateException2);
                throw illegalStateException2;
            }
            r rVar = new r(strO, strO2);
            rVar.f81063c = new CopyOnWriteArraySet(arrayList);
            rVar.f81064d = new CopyOnWriteArraySet(arrayList2);
            rVar.j(map);
            return rVar;
        }
    }

    public r(String str, String str2) {
        this.f81061a = (String) io.sentry.util.y.c(str, "name is required.");
        this.f81062b = (String) io.sentry.util.y.c(str2, "version is required.");
    }

    public static r l(r rVar, String str, String str2) {
        io.sentry.util.y.c(str, "name is required.");
        io.sentry.util.y.c(str2, "version is required.");
        if (rVar == null) {
            return new r(str, str2);
        }
        rVar.i(str);
        rVar.k(str2);
        return rVar;
    }

    public void c(String str) {
        z6.d().a(str);
    }

    public void d(String str, String str2) {
        z6.d().b(str, str2);
    }

    public Set<String> e() {
        Set<String> set = this.f81064d;
        return set != null ? set : z6.d().e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f81061a.equals(rVar.f81061a) && this.f81062b.equals(rVar.f81062b)) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.f81061a;
    }

    public Set<y> g() {
        Set<y> set = this.f81063c;
        return set != null ? set : z6.d().f();
    }

    public String h() {
        return this.f81062b;
    }

    public int hashCode() {
        return io.sentry.util.y.b(this.f81061a, this.f81062b);
    }

    public void i(String str) {
        this.f81061a = (String) io.sentry.util.y.c(str, "name is required.");
    }

    public void j(Map<String, Object> map) {
        this.f81065e = map;
    }

    public void k(String str) {
        this.f81062b = (String) io.sentry.util.y.c(str, "version is required.");
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        j3Var.N("name").w(this.f81061a);
        j3Var.N("version").w(this.f81062b);
        Set<y> setG = g();
        Set<String> setE = e();
        if (!setG.isEmpty()) {
            j3Var.N("packages").V(iLogger, setG);
        }
        if (!setE.isEmpty()) {
            j3Var.N("integrations").V(iLogger, setE);
        }
        Map<String, Object> map = this.f81065e;
        if (map != null) {
            for (String str : map.keySet()) {
                j3Var.N(str).V(iLogger, this.f81065e.get(str));
            }
        }
        j3Var.j();
    }
}
