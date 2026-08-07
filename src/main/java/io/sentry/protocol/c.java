package io.sentry.protocol;

import com.google.android.gms.common.Scopes;
import ezvcard.property.Kind;
import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.d1;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.k8;
import io.sentry.q1;
import io.sentry.r3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class c implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f80893a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final io.sentry.util.a f80894b = new io.sentry.util.a();

    public static final class a implements q1<c> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(i3 i3Var, ILogger iLogger) {
            c cVar = new c();
            i3Var.h();
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "device":
                        cVar.q(new e.a().a(i3Var, iLogger));
                        break;
                    case "spring":
                        cVar.y(new f0.a().a(i3Var, iLogger));
                        break;
                    case "response":
                        cVar.w(new p.a().a(i3Var, iLogger));
                        break;
                    case "profile":
                        cVar.v(new r3.a().a(i3Var, iLogger));
                        break;
                    case "feedback":
                        cVar.s(new h.a().a(i3Var, iLogger));
                        break;
                    case "os":
                        cVar.u(new n.a().a(i3Var, iLogger));
                        break;
                    case "app":
                        cVar.o(new io.sentry.protocol.a.C1702a().a(i3Var, iLogger));
                        break;
                    case "gpu":
                        cVar.t(new j.a().a(i3Var, iLogger));
                        break;
                    case "flags":
                        cVar.r(new g.a().a(i3Var, iLogger));
                        break;
                    case "trace":
                        cVar.z(new k8.a().a(i3Var, iLogger));
                        break;
                    case "browser":
                        cVar.p(new b.a().a(i3Var, iLogger));
                        break;
                    case "runtime":
                        cVar.x(new z.a().a(i3Var, iLogger));
                        break;
                    default:
                        Object objZ3 = i3Var.z3();
                        if (objZ3 == null) {
                            break;
                        } else {
                            cVar.l(strL, objZ3);
                            break;
                        }
                        break;
                }
            }
            i3Var.j();
            return cVar;
        }
    }

    public c() {
    }

    private <T> T A(String str, Class<T> cls) {
        Object objC = c(str);
        if (cls.isInstance(objC)) {
            return cls.cast(objC);
        }
        return null;
    }

    public boolean a(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f80893a.containsKey(obj);
    }

    public Set<Map.Entry<String, Object>> b() {
        return this.f80893a.entrySet();
    }

    public Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        return this.f80893a.get(obj);
    }

    public io.sentry.protocol.a d() {
        return (io.sentry.protocol.a) A("app", io.sentry.protocol.a.class);
    }

    public e e() {
        return (e) A(Kind.DEVICE, e.class);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        return this.f80893a.equals(((c) obj).f80893a);
    }

    public g f() {
        return (g) A("flags", g.class);
    }

    public h g() {
        return (h) A("feedback", h.class);
    }

    public n h() {
        return (n) A("os", n.class);
    }

    public int hashCode() {
        return this.f80893a.hashCode();
    }

    public z i() {
        return (z) A("runtime", z.class);
    }

    public k8 j() {
        return (k8) A("trace", k8.class);
    }

    public Enumeration<String> k() {
        return this.f80893a.keys();
    }

    public Object l(String str, Object obj) {
        if (str == null) {
            return null;
        }
        return obj == null ? this.f80893a.remove(str) : this.f80893a.put(str, obj);
    }

    public void m(c cVar) {
        if (cVar == null) {
            return;
        }
        this.f80893a.putAll(cVar.f80893a);
    }

    public Object n(Object obj) {
        if (obj == null) {
            return null;
        }
        return this.f80893a.remove(obj);
    }

    public void o(io.sentry.protocol.a aVar) {
        l("app", aVar);
    }

    public void p(b bVar) {
        l("browser", bVar);
    }

    public void q(e eVar) {
        l(Kind.DEVICE, eVar);
    }

    public void r(g gVar) {
        l("flags", gVar);
    }

    public void s(h hVar) {
        l("feedback", hVar);
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        ArrayList<String> list = Collections.list(k());
        Collections.sort(list);
        for (String str : list) {
            Object objC = c(str);
            if (objC != null) {
                j3Var.N(str).V(iLogger, objC);
            }
        }
        j3Var.j();
    }

    public void t(j jVar) {
        l("gpu", jVar);
    }

    public void u(n nVar) {
        l("os", nVar);
    }

    public void v(r3 r3Var) {
        io.sentry.util.y.c(r3Var, "profileContext is required");
        l(Scopes.PROFILE, r3Var);
    }

    public void w(p pVar) {
        d1 d1VarA = this.f80894b.a();
        try {
            l("response", pVar);
            if (d1VarA != null) {
                d1VarA.close();
            }
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public void x(z zVar) {
        l("runtime", zVar);
    }

    public void y(f0 f0Var) {
        l("spring", f0Var);
    }

    public void z(k8 k8Var) {
        io.sentry.util.y.c(k8Var, "traceContext is required");
        l("trace", k8Var);
    }

    public c(c cVar) {
        for (Map.Entry<String, Object> entry : cVar.b()) {
            if (entry != null) {
                Object value = entry.getValue();
                if ("app".equals(entry.getKey()) && (value instanceof io.sentry.protocol.a)) {
                    o(new io.sentry.protocol.a((io.sentry.protocol.a) value));
                } else if ("browser".equals(entry.getKey()) && (value instanceof b)) {
                    p(new b((b) value));
                } else if (Kind.DEVICE.equals(entry.getKey()) && (value instanceof e)) {
                    q(new e((e) value));
                } else if ("os".equals(entry.getKey()) && (value instanceof n)) {
                    u(new n((n) value));
                } else if ("runtime".equals(entry.getKey()) && (value instanceof z)) {
                    x(new z((z) value));
                } else if ("feedback".equals(entry.getKey()) && (value instanceof h)) {
                    s(new h((h) value));
                } else if ("gpu".equals(entry.getKey()) && (value instanceof j)) {
                    t(new j((j) value));
                } else if ("trace".equals(entry.getKey()) && (value instanceof k8)) {
                    z(new k8((k8) value));
                } else if (Scopes.PROFILE.equals(entry.getKey()) && (value instanceof r3)) {
                    v(new r3((r3) value));
                } else if ("response".equals(entry.getKey()) && (value instanceof p)) {
                    w(new p((p) value));
                } else if ("spring".equals(entry.getKey()) && (value instanceof f0)) {
                    y(new f0((f0) value));
                } else {
                    l(entry.getKey(), value);
                }
            }
        }
    }
}
