package io.sentry;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class r6 extends i5 implements a2 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Date f81154p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private io.sentry.protocol.m f81155q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f81156r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private e8<io.sentry.protocol.d0> f81157s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private e8<io.sentry.protocol.s> f81158t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private b7 f81159u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f81160v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List<String> f81161w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Map<String, Object> f81162x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Map<String, String> f81163y;

    public static final class a implements q1<r6> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public r6 a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            r6 r6Var = new r6();
            i5.a aVar = new i5.a();
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "fingerprint":
                        List list = (List) i3Var.z3();
                        if (list == null) {
                            break;
                        } else {
                            r6Var.f81161w = list;
                            break;
                        }
                        break;
                    case "threads":
                        i3Var.h();
                        i3Var.L();
                        r6Var.f81157s = new e8(i3Var.G1(iLogger, new io.sentry.protocol.d0.a()));
                        i3Var.j();
                        break;
                    case "logger":
                        r6Var.f81156r = i3Var.a1();
                        break;
                    case "timestamp":
                        Date dateM0 = i3Var.m0(iLogger);
                        if (dateM0 == null) {
                            break;
                        } else {
                            r6Var.f81154p = dateM0;
                            break;
                        }
                        break;
                    case "level":
                        r6Var.f81159u = (b7) i3Var.v0(iLogger, new b7.a());
                        break;
                    case "message":
                        r6Var.f81155q = (io.sentry.protocol.m) i3Var.v0(iLogger, new io.sentry.protocol.m.a());
                        break;
                    case "modules":
                        r6Var.f81163y = io.sentry.util.c.b((Map) i3Var.z3());
                        break;
                    case "exception":
                        i3Var.h();
                        i3Var.L();
                        r6Var.f81158t = new e8(i3Var.G1(iLogger, new io.sentry.protocol.s.a()));
                        i3Var.j();
                        break;
                    case "transaction":
                        r6Var.f81160v = i3Var.a1();
                        break;
                    default:
                        if (!aVar.a(r6Var, strL, i3Var, iLogger)) {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            i3Var.a3(iLogger, concurrentHashMap, strL);
                            break;
                        } else {
                            break;
                        }
                        break;
                }
            }
            r6Var.I0(concurrentHashMap);
            i3Var.j();
            return r6Var;
        }
    }

    r6(io.sentry.protocol.x xVar, Date date) {
        super(xVar);
        this.f81154p = date;
    }

    public void A0(List<io.sentry.protocol.s> list) {
        this.f81158t = new e8<>(list);
    }

    public void B0(List<String> list) {
        this.f81161w = list != null ? new ArrayList(list) : null;
    }

    public void C0(b7 b7Var) {
        this.f81159u = b7Var;
    }

    public void D0(io.sentry.protocol.m mVar) {
        this.f81155q = mVar;
    }

    public void E0(Map<String, String> map) {
        this.f81163y = io.sentry.util.c.c(map);
    }

    public void F0(List<io.sentry.protocol.d0> list) {
        this.f81157s = new e8<>(list);
    }

    public void G0(Date date) {
        this.f81154p = date;
    }

    public void H0(String str) {
        this.f81160v = str;
    }

    public void I0(Map<String, Object> map) {
        this.f81162x = map;
    }

    public List<io.sentry.protocol.s> p0() {
        e8<io.sentry.protocol.s> e8Var = this.f81158t;
        if (e8Var == null) {
            return null;
        }
        return e8Var.a();
    }

    public List<String> q0() {
        return this.f81161w;
    }

    public b7 r0() {
        return this.f81159u;
    }

    public io.sentry.protocol.m s0() {
        return this.f81155q;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        j3Var.N("timestamp").V(iLogger, this.f81154p);
        if (this.f81155q != null) {
            j3Var.N("message").V(iLogger, this.f81155q);
        }
        if (this.f81156r != null) {
            j3Var.N("logger").w(this.f81156r);
        }
        e8<io.sentry.protocol.d0> e8Var = this.f81157s;
        if (e8Var != null && !e8Var.a().isEmpty()) {
            j3Var.N("threads");
            j3Var.h();
            j3Var.N("values").V(iLogger, this.f81157s.a());
            j3Var.j();
        }
        e8<io.sentry.protocol.s> e8Var2 = this.f81158t;
        if (e8Var2 != null && !e8Var2.a().isEmpty()) {
            j3Var.N("exception");
            j3Var.h();
            j3Var.N("values").V(iLogger, this.f81158t.a());
            j3Var.j();
        }
        if (this.f81159u != null) {
            j3Var.N("level").V(iLogger, this.f81159u);
        }
        if (this.f81160v != null) {
            j3Var.N("transaction").w(this.f81160v);
        }
        if (this.f81161w != null) {
            j3Var.N("fingerprint").V(iLogger, this.f81161w);
        }
        if (this.f81163y != null) {
            j3Var.N("modules").V(iLogger, this.f81163y);
        }
        new i5.b().a(this, j3Var, iLogger);
        Map<String, Object> map = this.f81162x;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f81162x.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    Map<String, String> t0() {
        return this.f81163y;
    }

    public List<io.sentry.protocol.d0> u0() {
        e8<io.sentry.protocol.d0> e8Var = this.f81157s;
        if (e8Var != null) {
            return e8Var.a();
        }
        return null;
    }

    public Date v0() {
        return (Date) this.f81154p.clone();
    }

    public String w0() {
        return this.f81160v;
    }

    public io.sentry.protocol.s x0() {
        e8<io.sentry.protocol.s> e8Var = this.f81158t;
        if (e8Var == null) {
            return null;
        }
        for (io.sentry.protocol.s sVar : e8Var.a()) {
            if (sVar.g() != null && sVar.g().l() != null && !sVar.g().l().booleanValue()) {
                return sVar;
            }
        }
        return null;
    }

    public boolean y0() {
        return x0() != null;
    }

    public boolean z0() {
        e8<io.sentry.protocol.s> e8Var = this.f81158t;
        return (e8Var == null || e8Var.a().isEmpty()) ? false : true;
    }

    public r6(Throwable th2) {
        this();
        this.f80638j = th2;
    }

    public r6() {
        this(new io.sentry.protocol.x(), l.d());
    }
}
