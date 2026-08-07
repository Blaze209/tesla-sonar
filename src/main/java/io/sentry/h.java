package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x0 f80607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x0 f80608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x0 f80609c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f80610a;

        static {
            int[] iArr = new int[h4.values().length];
            f80610a = iArr;
            try {
                iArr[h4.CURRENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f80610a[h4.ISOLATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f80610a[h4.GLOBAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f80610a[h4.COMBINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public h(x0 x0Var, x0 x0Var2, x0 x0Var3) {
        this.f80607a = x0Var;
        this.f80608b = x0Var2;
        this.f80609c = x0Var3;
    }

    private x0 k() {
        return Q(null);
    }

    @Override // io.sentry.x0
    public b1 A() {
        b1 b1VarA = this.f80609c.A();
        if (!(b1VarA instanceof w2)) {
            return b1VarA;
        }
        b1 b1VarA2 = this.f80608b.A();
        return !(b1VarA2 instanceof w2) ? b1VarA2 : this.f80607a.A();
    }

    @Override // io.sentry.x0
    public void B(r6 r6Var) {
        this.f80607a.B(r6Var);
    }

    @Override // io.sentry.x0
    public List<c0> C() {
        return io.sentry.util.f.a(F());
    }

    @Override // io.sentry.x0
    public void D(w3 w3Var) {
        k().D(w3Var);
    }

    @Override // io.sentry.x0
    public void E(q7 q7Var) {
        this.f80607a.E(q7Var);
    }

    @Override // io.sentry.x0
    public List<io.sentry.internal.eventprocessor.a> F() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(this.f80607a.F());
        copyOnWriteArrayList.addAll(this.f80608b.F());
        copyOnWriteArrayList.addAll(this.f80609c.F());
        Collections.sort(copyOnWriteArrayList);
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.x0
    public void G(String str, Object obj) {
        k().G(str, obj);
    }

    @Override // io.sentry.x0
    public List<String> H() {
        List<String> listH = this.f80609c.H();
        if (!listH.isEmpty()) {
            return listH;
        }
        List<String> listH2 = this.f80608b.H();
        return !listH2.isEmpty() ? listH2 : this.f80607a.H();
    }

    @Override // io.sentry.x0
    public String I() {
        String strI = this.f80609c.I();
        if (strI != null) {
            return strI;
        }
        String strI2 = this.f80608b.I();
        return strI2 != null ? strI2 : this.f80607a.I();
    }

    @Override // io.sentry.x0
    public void J(String str) {
        k().J(str);
    }

    @Override // io.sentry.x0
    public w3 K() {
        return k().K();
    }

    @Override // io.sentry.x0
    public List<b> L() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(this.f80607a.L());
        copyOnWriteArrayList.addAll(this.f80608b.L());
        copyOnWriteArrayList.addAll(this.f80609c.L());
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.x0
    public void M() {
        k().M();
    }

    @Override // io.sentry.x0
    public w3 N(d4.a aVar) {
        return k().N(aVar);
    }

    @Override // io.sentry.x0
    public void O(d4.c cVar) {
        k().O(cVar);
    }

    @Override // io.sentry.x0
    public void P(io.sentry.protocol.x xVar) {
        this.f80607a.P(xVar);
        this.f80608b.P(xVar);
        this.f80609c.P(xVar);
    }

    x0 Q(h4 h4Var) {
        if (h4Var != null) {
            int i11 = a.f80610a[h4Var.ordinal()];
            if (i11 == 1) {
                return this.f80609c;
            }
            if (i11 == 2) {
                return this.f80608b;
            }
            if (i11 == 3) {
                return this.f80607a;
            }
            if (i11 == 4) {
                return this;
            }
        }
        int i12 = a.f80610a[getOptions().getDefaultScopeType().ordinal()];
        if (i12 == 1) {
            return this.f80609c;
        }
        if (i12 != 2) {
            return i12 != 3 ? this.f80609c : this.f80607a;
        }
        return this.f80608b;
    }

    @Override // io.sentry.x0
    public void a(String str, String str2) {
        k().a(str, str2);
    }

    @Override // io.sentry.x0
    public void b(String str, String str2) {
        k().b(str, str2);
    }

    @Override // io.sentry.x0
    public void c(e eVar) {
        k().c(eVar);
    }

    @Override // io.sentry.x0
    public void clear() {
        k().clear();
    }

    @Override // io.sentry.x0
    public void d(e eVar, h0 h0Var) {
        k().d(eVar, h0Var);
    }

    @Override // io.sentry.x0
    public void e(Throwable th2, g1 g1Var, String str) {
        this.f80607a.e(th2, g1Var, str);
    }

    @Override // io.sentry.x0
    public i1 f() {
        i1 i1VarF = this.f80609c.f();
        if (i1VarF != null) {
            return i1VarF;
        }
        i1 i1VarF2 = this.f80608b.f();
        return i1VarF2 != null ? i1VarF2 : this.f80607a.f();
    }

    @Override // io.sentry.x0
    public io.sentry.protocol.g g() {
        return v().g();
    }

    @Override // io.sentry.x0
    public Map<String, Object> getExtras() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(this.f80607a.getExtras());
        concurrentHashMap.putAll(this.f80608b.getExtras());
        concurrentHashMap.putAll(this.f80609c.getExtras());
        return concurrentHashMap;
    }

    @Override // io.sentry.x0
    public b7 getLevel() {
        b7 level = this.f80609c.getLevel();
        if (level != null) {
            return level;
        }
        b7 level2 = this.f80608b.getLevel();
        return level2 != null ? level2 : this.f80607a.getLevel();
    }

    @Override // io.sentry.x0
    public q7 getOptions() {
        return this.f80607a.getOptions();
    }

    @Override // io.sentry.x0
    public io.sentry.protocol.o getRequest() {
        io.sentry.protocol.o request = this.f80609c.getRequest();
        if (request != null) {
            return request;
        }
        io.sentry.protocol.o request2 = this.f80608b.getRequest();
        return request2 != null ? request2 : this.f80607a.getRequest();
    }

    @Override // io.sentry.x0
    public String getScreen() {
        String screen = this.f80609c.getScreen();
        if (screen != null) {
            return screen;
        }
        String screen2 = this.f80608b.getScreen();
        return screen2 != null ? screen2 : this.f80607a.getScreen();
    }

    @Override // io.sentry.x0
    public d4.d h() {
        return k().h();
    }

    @Override // io.sentry.x0
    public g1 i() {
        g1 g1VarI = this.f80609c.i();
        if (g1VarI != null) {
            return g1VarI;
        }
        g1 g1VarI2 = this.f80608b.i();
        return g1VarI2 != null ? g1VarI2 : this.f80607a.i();
    }

    @Override // io.sentry.x0
    public void j(io.sentry.protocol.i0 i0Var) {
        k().j(i0Var);
    }

    @Override // io.sentry.x0
    public f8 l() {
        return k().l();
    }

    @Override // io.sentry.x0
    public void m(io.sentry.protocol.x xVar) {
        k().m(xVar);
    }

    @Override // io.sentry.x0
    public Queue<e> n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f80607a.n());
        arrayList.addAll(this.f80608b.n());
        arrayList.addAll(this.f80609c.n());
        Collections.sort(arrayList);
        Queue<e> queueQ = d4.Q(this.f80609c.getOptions().getMaxBreadcrumbs());
        queueQ.addAll(arrayList);
        return queueQ;
    }

    @Override // io.sentry.x0
    public f8 o(d4.b bVar) {
        return k().o(bVar);
    }

    @Override // io.sentry.x0
    public Map<String, String> p() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(this.f80607a.p());
        concurrentHashMap.putAll(this.f80608b.p());
        concurrentHashMap.putAll(this.f80609c.p());
        return concurrentHashMap;
    }

    @Override // io.sentry.x0
    public void q() {
        k().q();
    }

    @Override // io.sentry.x0
    public io.sentry.protocol.c r() {
        return new g(this.f80607a.r(), this.f80608b.r(), this.f80609c.r(), getOptions().getDefaultScopeType());
    }

    @Override // io.sentry.x0
    public void s(i1 i1Var) {
        k().s(i1Var);
    }

    @Override // io.sentry.x0
    public io.sentry.protocol.i0 t() {
        io.sentry.protocol.i0 i0VarT = this.f80609c.t();
        if (i0VarT != null) {
            return i0VarT;
        }
        io.sentry.protocol.i0 i0VarT2 = this.f80608b.t();
        return i0VarT2 != null ? i0VarT2 : this.f80607a.t();
    }

    @Override // io.sentry.x0
    public void u() {
        k().u();
    }

    @Override // io.sentry.x0
    public io.sentry.featureflags.b v() {
        return io.sentry.featureflags.a.c(getOptions(), this.f80607a.v(), this.f80608b.v(), this.f80609c.v());
    }

    @Override // io.sentry.x0
    public void w(b1 b1Var) {
        k().w(b1Var);
    }

    @Override // io.sentry.x0
    public f8 x() {
        f8 f8VarX = this.f80609c.x();
        if (f8VarX != null) {
            return f8VarX;
        }
        f8 f8VarX2 = this.f80608b.x();
        return f8VarX2 != null ? f8VarX2 : this.f80607a.x();
    }

    @Override // io.sentry.x0
    public io.sentry.protocol.x y() {
        io.sentry.protocol.x xVarY = this.f80609c.y();
        io.sentry.protocol.x xVar = io.sentry.protocol.x.f81078b;
        if (!xVar.equals(xVarY)) {
            return xVarY;
        }
        io.sentry.protocol.x xVarY2 = this.f80608b.y();
        return !xVar.equals(xVarY2) ? xVarY2 : this.f80607a.y();
    }

    @Override // io.sentry.x0
    public void z(String str) {
        k().z(str);
    }

    @Override // io.sentry.x0
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public x0 m479clone() {
        return new h(this.f80607a, this.f80608b.m475clone(), this.f80609c.m475clone());
    }
}
