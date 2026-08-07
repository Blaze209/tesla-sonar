package io.sentry;

import com.adyen.checkout.components.core.action.SdkAction;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import io.sentry.exception.ExceptionMechanismException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class i5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private io.sentry.protocol.x f80629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.protocol.c f80630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private io.sentry.protocol.r f80631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private io.sentry.protocol.o f80632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, String> f80633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f80634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f80635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f80636h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private io.sentry.protocol.i0 f80637i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected transient Throwable f80638j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f80639k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f80640l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<e> f80641m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private io.sentry.protocol.d f80642n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Map<String, Object> f80643o;

    public static final class a {
        public boolean a(i5 i5Var, String str, i3 i3Var, ILogger iLogger) {
            str.getClass();
            switch (str) {
                case "debug_meta":
                    i5Var.f80642n = (io.sentry.protocol.d) i3Var.v0(iLogger, new io.sentry.protocol.d.a());
                    return true;
                case "server_name":
                    i5Var.f80639k = i3Var.a1();
                    return true;
                case "contexts":
                    i5Var.f80630b.m(new io.sentry.protocol.c.a().a(i3Var, iLogger));
                    return true;
                case "environment":
                    i5Var.f80635g = i3Var.a1();
                    return true;
                case "breadcrumbs":
                    i5Var.f80641m = i3Var.G1(iLogger, new e.a());
                    return true;
                case "sdk":
                    i5Var.f80631c = (io.sentry.protocol.r) i3Var.v0(iLogger, new io.sentry.protocol.r.a());
                    return true;
                case "dist":
                    i5Var.f80640l = i3Var.a1();
                    return true;
                case "tags":
                    i5Var.f80633e = io.sentry.util.c.b((Map) i3Var.z3());
                    return true;
                case "user":
                    i5Var.f80637i = (io.sentry.protocol.i0) i3Var.v0(iLogger, new io.sentry.protocol.i0.a());
                    return true;
                case "extra":
                    i5Var.f80643o = io.sentry.util.c.b((Map) i3Var.z3());
                    return true;
                case "event_id":
                    i5Var.f80629a = (io.sentry.protocol.x) i3Var.v0(iLogger, new io.sentry.protocol.x.a());
                    return true;
                case "release":
                    i5Var.f80634f = i3Var.a1();
                    return true;
                case "request":
                    i5Var.f80632d = (io.sentry.protocol.o) i3Var.v0(iLogger, new io.sentry.protocol.o.a());
                    return true;
                case "platform":
                    i5Var.f80636h = i3Var.a1();
                    return true;
                default:
                    return false;
            }
        }
    }

    public static final class b {
        public void a(i5 i5Var, j3 j3Var, ILogger iLogger) {
            if (i5Var.f80629a != null) {
                j3Var.N("event_id").V(iLogger, i5Var.f80629a);
            }
            j3Var.N("contexts").V(iLogger, i5Var.f80630b);
            if (i5Var.f80631c != null) {
                j3Var.N(SdkAction.ACTION_TYPE).V(iLogger, i5Var.f80631c);
            }
            if (i5Var.f80632d != null) {
                j3Var.N("request").V(iLogger, i5Var.f80632d);
            }
            if (i5Var.f80633e != null && !i5Var.f80633e.isEmpty()) {
                j3Var.N("tags").V(iLogger, i5Var.f80633e);
            }
            if (i5Var.f80634f != null) {
                j3Var.N("release").w(i5Var.f80634f);
            }
            if (i5Var.f80635g != null) {
                j3Var.N(AnalyticsAttribute.Environment).w(i5Var.f80635g);
            }
            if (i5Var.f80636h != null) {
                j3Var.N("platform").w(i5Var.f80636h);
            }
            if (i5Var.f80637i != null) {
                j3Var.N("user").V(iLogger, i5Var.f80637i);
            }
            if (i5Var.f80639k != null) {
                j3Var.N("server_name").w(i5Var.f80639k);
            }
            if (i5Var.f80640l != null) {
                j3Var.N("dist").w(i5Var.f80640l);
            }
            if (i5Var.f80641m != null && !i5Var.f80641m.isEmpty()) {
                j3Var.N("breadcrumbs").V(iLogger, i5Var.f80641m);
            }
            if (i5Var.f80642n != null) {
                j3Var.N("debug_meta").V(iLogger, i5Var.f80642n);
            }
            if (i5Var.f80643o == null || i5Var.f80643o.isEmpty()) {
                return;
            }
            j3Var.N("extra").V(iLogger, i5Var.f80643o);
        }
    }

    protected i5(io.sentry.protocol.x xVar) {
        this.f80630b = new io.sentry.protocol.c();
        this.f80629a = xVar;
    }

    public List<e> B() {
        return this.f80641m;
    }

    public io.sentry.protocol.c C() {
        return this.f80630b;
    }

    public io.sentry.protocol.d D() {
        return this.f80642n;
    }

    public String E() {
        return this.f80640l;
    }

    public String F() {
        return this.f80635g;
    }

    public io.sentry.protocol.x G() {
        return this.f80629a;
    }

    public Map<String, Object> H() {
        return this.f80643o;
    }

    public String I() {
        return this.f80636h;
    }

    public String J() {
        return this.f80634f;
    }

    public io.sentry.protocol.o K() {
        return this.f80632d;
    }

    public io.sentry.protocol.r L() {
        return this.f80631c;
    }

    public String M() {
        return this.f80639k;
    }

    public Map<String, String> N() {
        return this.f80633e;
    }

    public Throwable O() {
        Throwable th2 = this.f80638j;
        return th2 instanceof ExceptionMechanismException ? ((ExceptionMechanismException) th2).c() : th2;
    }

    public Throwable P() {
        return this.f80638j;
    }

    public io.sentry.protocol.i0 Q() {
        return this.f80637i;
    }

    public void R(String str) {
        Map<String, String> map = this.f80633e;
        if (map == null || str == null) {
            return;
        }
        map.remove(str);
    }

    public void S(List<e> list) {
        this.f80641m = io.sentry.util.c.a(list);
    }

    public void T(io.sentry.protocol.d dVar) {
        this.f80642n = dVar;
    }

    public void U(String str) {
        this.f80640l = str;
    }

    public void V(String str) {
        this.f80635g = str;
    }

    public void W(io.sentry.protocol.x xVar) {
        this.f80629a = xVar;
    }

    public void X(Map<String, Object> map) {
        this.f80643o = io.sentry.util.c.c(map);
    }

    public void Y(String str) {
        this.f80636h = str;
    }

    public void Z(String str) {
        this.f80634f = str;
    }

    public void a0(io.sentry.protocol.o oVar) {
        this.f80632d = oVar;
    }

    public void b0(io.sentry.protocol.r rVar) {
        this.f80631c = rVar;
    }

    public void c0(String str) {
        this.f80639k = str;
    }

    public void d0(String str, String str2) {
        if (this.f80633e == null) {
            this.f80633e = new HashMap();
        }
        if (str == null) {
            return;
        }
        if (str2 == null) {
            R(str);
        } else {
            this.f80633e.put(str, str2);
        }
    }

    public void e0(Map<String, String> map) {
        this.f80633e = io.sentry.util.c.c(map);
    }

    public void f0(io.sentry.protocol.i0 i0Var) {
        this.f80637i = i0Var;
    }

    protected i5() {
        this(new io.sentry.protocol.x());
    }
}
