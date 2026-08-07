package io.sentry;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class d4 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile io.sentry.protocol.x f80446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b7 f80447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i1 f80448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WeakReference<g1> f80449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f80450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private io.sentry.protocol.i0 f80451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f80452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private io.sentry.protocol.o f80453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<String> f80454i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile Queue<e> f80455j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map<String, String> f80456k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<String, Object> f80457l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<io.sentry.internal.eventprocessor.a> f80458m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile q7 f80459n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile f8 f80460o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final io.sentry.util.a f80461p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final io.sentry.util.a f80462q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final io.sentry.util.a f80463r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private io.sentry.protocol.c f80464s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List<io.sentry.b> f80465t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private w3 f80466u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private io.sentry.protocol.x f80467v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private b1 f80468w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Map<Throwable, io.sentry.util.z<WeakReference<g1>, String>> f80469x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final io.sentry.featureflags.b f80470y;

    public interface a {
        void a(w3 w3Var);
    }

    interface b {
        void a(f8 f8Var);
    }

    public interface c {
        void a(i1 i1Var);
    }

    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f8 f80471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f8 f80472b;

        public d(f8 f8Var, f8 f8Var2) {
            this.f80472b = f8Var;
            this.f80471a = f8Var2;
        }

        public f8 a() {
            return this.f80472b;
        }

        public f8 b() {
            return this.f80471a;
        }
    }

    public d4(q7 q7Var) {
        this.f80449d = new WeakReference<>(null);
        this.f80454i = new ArrayList();
        this.f80456k = new ConcurrentHashMap();
        this.f80457l = new ConcurrentHashMap();
        this.f80458m = new CopyOnWriteArrayList();
        this.f80461p = new io.sentry.util.a();
        this.f80462q = new io.sentry.util.a();
        this.f80463r = new io.sentry.util.a();
        this.f80464s = new io.sentry.protocol.c();
        this.f80465t = new CopyOnWriteArrayList();
        io.sentry.protocol.x xVar = io.sentry.protocol.x.f81078b;
        this.f80467v = xVar;
        this.f80468w = w2.i();
        this.f80469x = Collections.synchronizedMap(new WeakHashMap());
        this.f80459n = (q7) io.sentry.util.y.c(q7Var, "SentryOptions is required.");
        this.f80455j = Q(this.f80459n.getMaxBreadcrumbs());
        this.f80470y = io.sentry.featureflags.a.a(q7Var);
        this.f80466u = new w3();
        this.f80446a = xVar;
    }

    static Queue<e> Q(int i11) {
        return i11 > 0 ? u8.d(new f(i11)) : new u();
    }

    private e R(q7.a aVar, e eVar, h0 h0Var) {
        try {
            return aVar.a(eVar, h0Var);
        } catch (Throwable th2) {
            this.f80459n.getLogger().a(b7.ERROR, "The BeforeBreadcrumbCallback callback threw an exception. Exception details will be added to the breadcrumb.", th2);
            if (th2.getMessage() != null) {
                eVar.v("sentry:message", th2.getMessage());
            }
            return eVar;
        }
    }

    @Override // io.sentry.x0
    public b1 A() {
        return this.f80468w;
    }

    @Override // io.sentry.x0
    public void B(r6 r6Var) {
        io.sentry.util.z<WeakReference<g1>, String> zVar;
        g1 g1Var;
        if (!this.f80459n.isTracingEnabled() || r6Var.O() == null || (zVar = this.f80469x.get(io.sentry.util.h.a(r6Var.O()))) == null) {
            return;
        }
        WeakReference<g1> weakReferenceA = zVar.a();
        if (r6Var.C().j() == null && weakReferenceA != null && (g1Var = weakReferenceA.get()) != null) {
            r6Var.C().z(g1Var.e());
        }
        String strB = zVar.b();
        if (r6Var.w0() != null || strB == null) {
            return;
        }
        r6Var.H0(strB);
    }

    @Override // io.sentry.x0
    public List<c0> C() {
        return io.sentry.util.f.a(this.f80458m);
    }

    @Override // io.sentry.x0
    public void D(w3 w3Var) {
        this.f80466u = w3Var;
        k8 k8VarG = w3Var.g();
        Iterator<y0> it = this.f80459n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().k(k8VarG, this);
        }
    }

    @Override // io.sentry.x0
    public void E(q7 q7Var) {
        this.f80459n = q7Var;
        Queue<e> queue = this.f80455j;
        this.f80455j = Q(q7Var.getMaxBreadcrumbs());
        Iterator<e> it = queue.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    @Override // io.sentry.x0
    public List<io.sentry.internal.eventprocessor.a> F() {
        return this.f80458m;
    }

    @Override // io.sentry.x0
    public void G(String str, Object obj) {
        if (str == null) {
            return;
        }
        this.f80464s.l(str, obj);
        Iterator<y0> it = this.f80459n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().h(this.f80464s);
        }
    }

    @Override // io.sentry.x0
    public List<String> H() {
        return this.f80454i;
    }

    @Override // io.sentry.x0
    public String I() {
        i1 i1Var = this.f80448c;
        return i1Var != null ? i1Var.getName() : this.f80450e;
    }

    @Override // io.sentry.x0
    public void J(String str) {
        if (str == null) {
            return;
        }
        this.f80464s.n(str);
    }

    @Override // io.sentry.x0
    public w3 K() {
        return this.f80466u;
    }

    @Override // io.sentry.x0
    public List<io.sentry.b> L() {
        return new CopyOnWriteArrayList(this.f80465t);
    }

    @Override // io.sentry.x0
    public void M() {
        this.f80460o = null;
    }

    @Override // io.sentry.x0
    public w3 N(a aVar) {
        d1 d1VarA = this.f80463r.a();
        try {
            aVar.a(this.f80466u);
            w3 w3Var = new w3(this.f80466u);
            if (d1VarA != null) {
                d1VarA.close();
            }
            return w3Var;
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

    @Override // io.sentry.x0
    public void O(c cVar) {
        d1 d1VarA = this.f80462q.a();
        try {
            cVar.a(this.f80448c);
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

    @Override // io.sentry.x0
    public void P(io.sentry.protocol.x xVar) {
        this.f80446a = xVar;
    }

    public io.sentry.protocol.x S() {
        return this.f80446a;
    }

    public void T(String str) {
        if (str == null) {
            return;
        }
        this.f80457l.remove(str);
        for (y0 y0Var : this.f80459n.getScopeObservers()) {
            y0Var.d(str);
            y0Var.i(this.f80457l);
        }
    }

    public void U(String str) {
        if (str == null) {
            return;
        }
        this.f80456k.remove(str);
        for (y0 y0Var : this.f80459n.getScopeObservers()) {
            y0Var.f(str);
            y0Var.e(this.f80456k);
        }
    }

    @Override // io.sentry.x0
    public void a(String str, String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            U(str);
            return;
        }
        this.f80456k.put(str, str2);
        for (y0 y0Var : this.f80459n.getScopeObservers()) {
            y0Var.a(str, str2);
            y0Var.e(this.f80456k);
        }
    }

    @Override // io.sentry.x0
    public void b(String str, String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            T(str);
            return;
        }
        this.f80457l.put(str, str2);
        for (y0 y0Var : this.f80459n.getScopeObservers()) {
            y0Var.b(str, str2);
            y0Var.i(this.f80457l);
        }
    }

    @Override // io.sentry.x0
    public void c(e eVar) {
        d(eVar, null);
    }

    @Override // io.sentry.x0
    public void clear() {
        this.f80447b = null;
        this.f80451f = null;
        this.f80453h = null;
        this.f80452g = null;
        this.f80454i.clear();
        q();
        this.f80456k.clear();
        this.f80457l.clear();
        this.f80458m.clear();
        u();
        k();
    }

    @Override // io.sentry.x0
    public void d(e eVar, h0 h0Var) {
        if (eVar == null || (this.f80455j instanceof u)) {
            return;
        }
        if (h0Var == null) {
            h0Var = new h0();
        }
        q7.a beforeBreadcrumb = this.f80459n.getBeforeBreadcrumb();
        if (beforeBreadcrumb != null) {
            eVar = R(beforeBreadcrumb, eVar, h0Var);
        }
        if (eVar == null) {
            this.f80459n.getLogger().c(b7.INFO, "Breadcrumb was dropped by beforeBreadcrumb", new Object[0]);
            return;
        }
        this.f80455j.add(eVar);
        for (y0 y0Var : this.f80459n.getScopeObservers()) {
            y0Var.c(eVar);
            y0Var.g(this.f80455j);
        }
    }

    @Override // io.sentry.x0
    public void e(Throwable th2, g1 g1Var, String str) {
        io.sentry.util.y.c(th2, "throwable is required");
        io.sentry.util.y.c(g1Var, "span is required");
        io.sentry.util.y.c(str, "transactionName is required");
        Throwable thA = io.sentry.util.h.a(th2);
        if (this.f80469x.containsKey(thA)) {
            return;
        }
        this.f80469x.put(thA, new io.sentry.util.z<>(new WeakReference(g1Var), str));
    }

    @Override // io.sentry.x0
    public i1 f() {
        return this.f80448c;
    }

    @Override // io.sentry.x0
    public io.sentry.protocol.g g() {
        return this.f80470y.g();
    }

    @Override // io.sentry.x0
    public Map<String, Object> getExtras() {
        return this.f80457l;
    }

    @Override // io.sentry.x0
    public b7 getLevel() {
        return this.f80447b;
    }

    @Override // io.sentry.x0
    public q7 getOptions() {
        return this.f80459n;
    }

    @Override // io.sentry.x0
    public io.sentry.protocol.o getRequest() {
        return this.f80453h;
    }

    @Override // io.sentry.x0
    public String getScreen() {
        return this.f80452g;
    }

    @Override // io.sentry.x0
    public d h() {
        d1 d1VarA = this.f80461p.a();
        try {
            if (this.f80460o != null) {
                this.f80460o.c();
                this.f80459n.getContinuousProfiler().c();
            }
            f8 f8Var = this.f80460o;
            d dVar = null;
            if (this.f80459n.getRelease() != null) {
                this.f80460o = new f8(this.f80459n.getDistinctId(), this.f80451f, this.f80459n.getEnvironment(), this.f80459n.getRelease());
                dVar = new d(this.f80460o.clone(), f8Var != null ? f8Var.clone() : null);
            } else {
                this.f80459n.getLogger().c(b7.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
            }
            if (d1VarA != null) {
                d1VarA.close();
            }
            return dVar;
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

    @Override // io.sentry.x0
    public g1 i() {
        g1 g1VarO;
        g1 g1Var = this.f80449d.get();
        if (g1Var != null) {
            return g1Var;
        }
        i1 i1Var = this.f80448c;
        return (i1Var == null || (g1VarO = i1Var.o()) == null) ? i1Var : g1VarO;
    }

    @Override // io.sentry.x0
    public void j(io.sentry.protocol.i0 i0Var) {
        this.f80451f = i0Var;
        Iterator<y0> it = this.f80459n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().j(i0Var);
        }
    }

    public void k() {
        this.f80465t.clear();
    }

    @Override // io.sentry.x0
    public f8 l() {
        d1 d1VarA = this.f80461p.a();
        try {
            f8 f8Var = null;
            if (this.f80460o != null) {
                this.f80460o.c();
                this.f80459n.getContinuousProfiler().c();
                f8 f8VarClone = this.f80460o.clone();
                this.f80460o = null;
                f8Var = f8VarClone;
            }
            if (d1VarA != null) {
                d1VarA.close();
            }
            return f8Var;
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

    @Override // io.sentry.x0
    public void m(io.sentry.protocol.x xVar) {
        this.f80467v = xVar;
        Iterator<y0> it = this.f80459n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().m(xVar);
        }
    }

    @Override // io.sentry.x0
    public Queue<e> n() {
        return this.f80455j;
    }

    @Override // io.sentry.x0
    public f8 o(b bVar) {
        d1 d1VarA = this.f80461p.a();
        try {
            bVar.a(this.f80460o);
            f8 f8VarClone = this.f80460o != null ? this.f80460o.clone() : null;
            if (d1VarA != null) {
                d1VarA.close();
            }
            return f8VarClone;
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

    @Override // io.sentry.x0
    public Map<String, String> p() {
        return io.sentry.util.c.b(this.f80456k);
    }

    @Override // io.sentry.x0
    public void q() {
        this.f80455j.clear();
        Iterator<y0> it = this.f80459n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().g(this.f80455j);
        }
    }

    @Override // io.sentry.x0
    public io.sentry.protocol.c r() {
        return this.f80464s;
    }

    @Override // io.sentry.x0
    public void s(i1 i1Var) {
        d1 d1VarA = this.f80462q.a();
        try {
            this.f80448c = i1Var;
            for (y0 y0Var : this.f80459n.getScopeObservers()) {
                if (i1Var != null) {
                    y0Var.l(i1Var.getName());
                    y0Var.k(i1Var.e(), this);
                } else {
                    y0Var.l(null);
                    y0Var.k(null, this);
                }
            }
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

    @Override // io.sentry.x0
    public io.sentry.protocol.i0 t() {
        return this.f80451f;
    }

    @Override // io.sentry.x0
    public void u() {
        d1 d1VarA = this.f80462q.a();
        try {
            this.f80448c = null;
            if (d1VarA != null) {
                d1VarA.close();
            }
            this.f80450e = null;
            for (y0 y0Var : this.f80459n.getScopeObservers()) {
                y0Var.l(null);
                y0Var.k(null, this);
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

    @Override // io.sentry.x0
    public io.sentry.featureflags.b v() {
        return this.f80470y;
    }

    @Override // io.sentry.x0
    public void w(b1 b1Var) {
        this.f80468w = b1Var;
    }

    @Override // io.sentry.x0
    public f8 x() {
        return this.f80460o;
    }

    @Override // io.sentry.x0
    public io.sentry.protocol.x y() {
        return this.f80467v;
    }

    @Override // io.sentry.x0
    public void z(String str) {
        this.f80452g = str;
        io.sentry.protocol.c cVarR = r();
        io.sentry.protocol.a aVarD = cVarR.d();
        if (aVarD == null) {
            aVarD = new io.sentry.protocol.a();
            cVarR.o(aVarD);
        }
        if (str == null) {
            aVarD.x(null);
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            aVarD.x(arrayList);
        }
        Iterator<y0> it = this.f80459n.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().h(cVarR);
        }
    }

    @Override // io.sentry.x0
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public x0 m475clone() {
        return new d4(this);
    }

    private d4(d4 d4Var) {
        this.f80449d = new WeakReference<>(null);
        this.f80454i = new ArrayList();
        this.f80456k = new ConcurrentHashMap();
        this.f80457l = new ConcurrentHashMap();
        this.f80458m = new CopyOnWriteArrayList();
        this.f80461p = new io.sentry.util.a();
        this.f80462q = new io.sentry.util.a();
        this.f80463r = new io.sentry.util.a();
        this.f80464s = new io.sentry.protocol.c();
        this.f80465t = new CopyOnWriteArrayList();
        this.f80467v = io.sentry.protocol.x.f81078b;
        this.f80468w = w2.i();
        this.f80469x = Collections.synchronizedMap(new WeakHashMap());
        this.f80448c = d4Var.f80448c;
        this.f80450e = d4Var.f80450e;
        this.f80449d = d4Var.f80449d;
        this.f80460o = d4Var.f80460o;
        this.f80459n = d4Var.f80459n;
        this.f80447b = d4Var.f80447b;
        this.f80468w = d4Var.f80468w;
        this.f80446a = d4Var.S();
        io.sentry.protocol.i0 i0Var = d4Var.f80451f;
        this.f80451f = i0Var != null ? new io.sentry.protocol.i0(i0Var) : null;
        this.f80452g = d4Var.f80452g;
        this.f80467v = d4Var.f80467v;
        io.sentry.protocol.o oVar = d4Var.f80453h;
        this.f80453h = oVar != null ? new io.sentry.protocol.o(oVar) : null;
        this.f80454i = new ArrayList(d4Var.f80454i);
        this.f80458m = new CopyOnWriteArrayList(d4Var.f80458m);
        e[] eVarArr = (e[]) d4Var.f80455j.toArray(new e[0]);
        Queue<e> queueQ = Q(d4Var.f80459n.getMaxBreadcrumbs());
        for (e eVar : eVarArr) {
            queueQ.add(new e(eVar));
        }
        this.f80455j = queueQ;
        Map<String, String> map = d4Var.f80456k;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.f80456k = concurrentHashMap;
        Map<String, Object> map2 = d4Var.f80457l;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
            if (entry2 != null) {
                concurrentHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        this.f80457l = concurrentHashMap2;
        this.f80464s = new io.sentry.protocol.c(d4Var.f80464s);
        this.f80465t = new CopyOnWriteArrayList(d4Var.f80465t);
        this.f80470y = d4Var.f80470y.m476clone();
        this.f80466u = new w3(d4Var.f80466u);
    }
}
