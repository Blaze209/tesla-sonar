package io.sentry;

import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends io.sentry.protocol.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.protocol.c f80583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.protocol.c f80584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.sentry.protocol.c f80585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h4 f80586f;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f80587a;

        static {
            int[] iArr = new int[h4.values().length];
            f80587a = iArr;
            try {
                iArr[h4.CURRENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f80587a[h4.ISOLATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f80587a[h4.GLOBAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public g(io.sentry.protocol.c cVar, io.sentry.protocol.c cVar2, io.sentry.protocol.c cVar3, h4 h4Var) {
        this.f80583c = cVar;
        this.f80584d = cVar2;
        this.f80585e = cVar3;
        this.f80586f = h4Var;
    }

    private io.sentry.protocol.c B() {
        int i11 = a.f80587a[this.f80586f.ordinal()];
        if (i11 == 1) {
            return this.f80585e;
        }
        if (i11 != 2) {
            return i11 != 3 ? this.f80585e : this.f80583c;
        }
        return this.f80584d;
    }

    private io.sentry.protocol.c C() {
        io.sentry.protocol.c cVar = new io.sentry.protocol.c();
        cVar.m(this.f80583c);
        cVar.m(this.f80584d);
        cVar.m(this.f80585e);
        return cVar;
    }

    @Override // io.sentry.protocol.c
    public boolean a(Object obj) {
        return this.f80583c.a(obj) || this.f80584d.a(obj) || this.f80585e.a(obj);
    }

    @Override // io.sentry.protocol.c
    public Set<Map.Entry<String, Object>> b() {
        return C().b();
    }

    @Override // io.sentry.protocol.c
    public Object c(Object obj) {
        Object objC = this.f80585e.c(obj);
        if (objC != null) {
            return objC;
        }
        Object objC2 = this.f80584d.c(obj);
        return objC2 != null ? objC2 : this.f80583c.c(obj);
    }

    @Override // io.sentry.protocol.c
    public io.sentry.protocol.a d() {
        io.sentry.protocol.a aVarD = this.f80585e.d();
        if (aVarD != null) {
            return aVarD;
        }
        io.sentry.protocol.a aVarD2 = this.f80584d.d();
        return aVarD2 != null ? aVarD2 : this.f80583c.d();
    }

    @Override // io.sentry.protocol.c
    public io.sentry.protocol.e e() {
        io.sentry.protocol.e eVarE = this.f80585e.e();
        if (eVarE != null) {
            return eVarE;
        }
        io.sentry.protocol.e eVarE2 = this.f80584d.e();
        return eVarE2 != null ? eVarE2 : this.f80583c.e();
    }

    @Override // io.sentry.protocol.c
    public io.sentry.protocol.g f() {
        io.sentry.protocol.g gVarF = this.f80585e.f();
        if (gVarF != null) {
            return gVarF;
        }
        io.sentry.protocol.g gVarF2 = this.f80584d.f();
        return gVarF2 != null ? gVarF2 : this.f80583c.f();
    }

    @Override // io.sentry.protocol.c
    public io.sentry.protocol.n h() {
        io.sentry.protocol.n nVarH = this.f80585e.h();
        if (nVarH != null) {
            return nVarH;
        }
        io.sentry.protocol.n nVarH2 = this.f80584d.h();
        return nVarH2 != null ? nVarH2 : this.f80583c.h();
    }

    @Override // io.sentry.protocol.c
    public io.sentry.protocol.z i() {
        io.sentry.protocol.z zVarI = this.f80585e.i();
        if (zVarI != null) {
            return zVarI;
        }
        io.sentry.protocol.z zVarI2 = this.f80584d.i();
        return zVarI2 != null ? zVarI2 : this.f80583c.i();
    }

    @Override // io.sentry.protocol.c
    public k8 j() {
        k8 k8VarJ = this.f80585e.j();
        if (k8VarJ != null) {
            return k8VarJ;
        }
        k8 k8VarJ2 = this.f80584d.j();
        return k8VarJ2 != null ? k8VarJ2 : this.f80583c.j();
    }

    @Override // io.sentry.protocol.c
    public Enumeration<String> k() {
        return C().k();
    }

    @Override // io.sentry.protocol.c
    public Object l(String str, Object obj) {
        return B().l(str, obj);
    }

    @Override // io.sentry.protocol.c
    public void m(io.sentry.protocol.c cVar) {
        B().m(cVar);
    }

    @Override // io.sentry.protocol.c
    public Object n(Object obj) {
        return B().n(obj);
    }

    @Override // io.sentry.protocol.c
    public void o(io.sentry.protocol.a aVar) {
        B().o(aVar);
    }

    @Override // io.sentry.protocol.c
    public void p(io.sentry.protocol.b bVar) {
        B().p(bVar);
    }

    @Override // io.sentry.protocol.c
    public void q(io.sentry.protocol.e eVar) {
        B().q(eVar);
    }

    @Override // io.sentry.protocol.c
    public void r(io.sentry.protocol.g gVar) {
        B().r(gVar);
    }

    @Override // io.sentry.protocol.c, io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        C().serialize(j3Var, iLogger);
    }

    @Override // io.sentry.protocol.c
    public void t(io.sentry.protocol.j jVar) {
        B().t(jVar);
    }

    @Override // io.sentry.protocol.c
    public void u(io.sentry.protocol.n nVar) {
        B().u(nVar);
    }

    @Override // io.sentry.protocol.c
    public void w(io.sentry.protocol.p pVar) {
        B().w(pVar);
    }

    @Override // io.sentry.protocol.c
    public void x(io.sentry.protocol.z zVar) {
        B().x(zVar);
    }

    @Override // io.sentry.protocol.c
    public void y(io.sentry.protocol.f0 f0Var) {
        B().y(f0Var);
    }

    @Override // io.sentry.protocol.c
    public void z(k8 k8Var) {
        B().z(k8Var);
    }
}
