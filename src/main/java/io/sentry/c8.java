package io.sentry;

import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class c8 implements i1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j8 f80323b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z0 f80325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f80326e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile TimerTask f80328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile TimerTask f80329h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile Timer f80330i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private io.sentry.protocol.h0 f80335n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final n1 f80336o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final io.sentry.protocol.c f80337p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final i f80338q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final b9 f80339r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.protocol.x f80322a = new io.sentry.protocol.x();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<j8> f80324c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f80327f = c.f80342c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final io.sentry.util.a f80331j = new io.sentry.util.a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final io.sentry.util.a f80332k = new io.sentry.util.a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f80333l = new AtomicBoolean(false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f80334m = new AtomicBoolean(false);

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            c8.this.Q();
        }
    }

    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            c8.this.P();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f80342c = d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f80343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final r8 f80344b;

        private c(boolean z11, r8 r8Var) {
            this.f80343a = z11;
            this.f80344b = r8Var;
        }

        static c c(r8 r8Var) {
            return new c(true, r8Var);
        }

        private static c d() {
            return new c(false, null);
        }
    }

    c8(z8 z8Var, z0 z0Var, b9 b9Var, i iVar) {
        this.f80330i = null;
        io.sentry.protocol.c cVar = new io.sentry.protocol.c();
        this.f80337p = cVar;
        io.sentry.util.y.c(z8Var, "context is required");
        io.sentry.util.y.c(z0Var, "scopes are required");
        j8 j8Var = new j8(z8Var, this, z0Var, b9Var);
        this.f80323b = j8Var;
        this.f80326e = z8Var.y();
        this.f80336o = z8Var.e();
        this.f80325d = z0Var;
        Boolean bool = Boolean.TRUE;
        iVar = bool.equals(b()) ? iVar : null;
        this.f80338q = iVar;
        this.f80335n = z8Var.A();
        this.f80339r = b9Var;
        S(j8Var);
        io.sentry.protocol.x xVarI = I();
        if (!xVarI.equals(io.sentry.protocol.x.f81078b) && bool.equals(b())) {
            cVar.v(new r3(xVarI));
        }
        if (iVar != null) {
            iVar.d(this);
        }
        if (b9Var.l() == null && b9Var.k() == null) {
            return;
        }
        this.f80330i = new Timer(true);
        R();
        d();
    }

    private void A() {
        d1 d1VarA = this.f80331j.a();
        try {
            if (this.f80329h != null) {
                this.f80329h.cancel();
                this.f80334m.set(false);
                this.f80329h = null;
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

    private void B() {
        d1 d1VarA = this.f80331j.a();
        try {
            if (this.f80328g != null) {
                this.f80328g.cancel();
                this.f80333l.set(false);
                this.f80328g = null;
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

    private g1 C(k8 k8Var, q8 q8Var) {
        if (this.f80323b.isFinished()) {
            return c3.s();
        }
        if (!this.f80336o.equals(k8Var.e())) {
            return c3.s();
        }
        if (io.sentry.util.e0.b(this.f80325d.getOptions().getIgnoredSpanOrigins(), q8Var.a())) {
            return c3.s();
        }
        p8 p8VarH = k8Var.h();
        String strF = k8Var.f();
        String strC = k8Var.c();
        if (this.f80324c.size() >= this.f80325d.getOptions().getMaxSpans()) {
            this.f80325d.getOptions().getLogger().c(b7.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", strF, strC);
            return c3.s();
        }
        io.sentry.util.y.c(p8VarH, "parentSpanId is required");
        io.sentry.util.y.c(strF, "operation is required");
        B();
        j8 j8Var = new j8(this, this.f80325d, k8Var, q8Var, new m8() { // from class: io.sentry.y7
            @Override // io.sentry.m8
            public final void a(j8 j8Var2) {
                c8.w(this.f81617a, j8Var2);
            }
        });
        S(j8Var);
        this.f80324c.add(j8Var);
        i iVar = this.f80338q;
        if (iVar != null) {
            iVar.b(j8Var);
        }
        return j8Var;
    }

    private g1 D(String str, String str2, n5 n5Var, n1 n1Var, q8 q8Var) {
        if (this.f80323b.isFinished()) {
            return c3.s();
        }
        if (!this.f80336o.equals(n1Var)) {
            return c3.s();
        }
        if (this.f80324c.size() < this.f80325d.getOptions().getMaxSpans()) {
            return this.f80323b.p(str, str2, n5Var, n1Var, q8Var);
        }
        this.f80325d.getOptions().getLogger().c(b7.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
        return c3.s();
    }

    private io.sentry.protocol.x I() {
        return !this.f80323b.e().j().equals(io.sentry.protocol.x.f81078b) ? this.f80323b.e().j() : this.f80325d.getOptions().getContinuousProfiler().e();
    }

    private boolean N() {
        ListIterator<j8> listIterator = this.f80324c.listIterator();
        while (listIterator.hasNext()) {
            j8 next = listIterator.next();
            if (!next.isFinished() && next.q() == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        r8 status = getStatus();
        if (status == null) {
            status = r8.DEADLINE_EXCEEDED;
        }
        a(status, this.f80339r.l() != null, null);
        this.f80334m.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        r8 status = getStatus();
        if (status == null) {
            status = r8.OK;
        }
        m(status);
        this.f80333l.set(false);
    }

    private void R() {
        Long lK = this.f80339r.k();
        if (lK != null) {
            d1 d1VarA = this.f80331j.a();
            try {
                if (this.f80330i != null) {
                    A();
                    this.f80334m.set(true);
                    this.f80329h = new b();
                    try {
                        this.f80330i.schedule(this.f80329h, lK.longValue());
                    } catch (Throwable th2) {
                        this.f80325d.getOptions().getLogger().a(b7.WARNING, "Failed to schedule finish timer", th2);
                        P();
                    }
                }
                if (d1VarA != null) {
                    d1VarA.close();
                }
            } catch (Throwable th3) {
                if (d1VarA != null) {
                    try {
                        d1VarA.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
    }

    private void S(g1 g1Var) {
        io.sentry.util.thread.a threadChecker = this.f80325d.getOptions().getThreadChecker();
        io.sentry.protocol.x xVarI = I();
        if (!xVarI.equals(io.sentry.protocol.x.f81078b) && Boolean.TRUE.equals(g1Var.b())) {
            g1Var.l("profiler_id", xVarI.toString());
        }
        g1Var.l("thread.id", String.valueOf(threadChecker.c()));
        g1Var.l("thread.name", threadChecker.b());
    }

    private void W(d dVar) {
        d1 d1VarA = this.f80332k.a();
        try {
            if (dVar.q()) {
                final AtomicReference atomicReference = new AtomicReference();
                this.f80325d.s(new f4() { // from class: io.sentry.z7
                    @Override // io.sentry.f4
                    public final void a(x0 x0Var) {
                        atomicReference.set(x0Var.y());
                    }
                });
                dVar.I(e().p(), (io.sentry.protocol.x) atomicReference.get(), this.f80325d.getOptions(), K(), getName(), M());
                dVar.b();
            }
            if (d1VarA != null) {
                d1VarA.close();
            }
        } catch (Throwable th2) {
            if (d1VarA == null) {
                throw th2;
            }
            try {
                d1VarA.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public static /* synthetic */ void t(c8 c8Var, x0 x0Var, i1 i1Var) {
        c8Var.getClass();
        if (i1Var == c8Var) {
            x0Var.u();
        }
    }

    public static /* synthetic */ void u(final c8 c8Var, final x0 x0Var) {
        c8Var.getClass();
        x0Var.O(new d4.c() { // from class: io.sentry.b8
            @Override // io.sentry.d4.c
            public final void a(i1 i1Var) {
                c8.t(this.f80292a, x0Var, i1Var);
            }
        });
    }

    public static /* synthetic */ void v(c8 c8Var, x0 x0Var) {
        c8Var.getClass();
        x0Var.s(c8Var);
    }

    public static /* synthetic */ void w(c8 c8Var, j8 j8Var) {
        i iVar = c8Var.f80338q;
        if (iVar != null) {
            iVar.a(j8Var);
        }
        c cVar = c8Var.f80327f;
        if (c8Var.f80339r.l() == null) {
            if (cVar.f80343a) {
                c8Var.m(cVar.f80344b);
            }
        } else if (!c8Var.f80339r.q() || c8Var.N()) {
            c8Var.d();
        }
    }

    public static /* synthetic */ void x(c8 c8Var, m8 m8Var, AtomicReference atomicReference, j8 j8Var) {
        if (m8Var != null) {
            c8Var.getClass();
            m8Var.a(j8Var);
        }
        a9 a9VarN = c8Var.f80339r.n();
        if (a9VarN != null) {
            a9VarN.a(c8Var);
        }
        i iVar = c8Var.f80338q;
        if (iVar != null) {
            atomicReference.set(iVar.c(c8Var));
        }
    }

    public void E(r8 r8Var, n5 n5Var, boolean z11, h0 h0Var) {
        n5 n5VarQ = this.f80323b.q();
        if (n5Var == null) {
            n5Var = n5VarQ;
        }
        if (n5Var == null) {
            n5Var = this.f80325d.getOptions().getDateProvider().now();
        }
        for (j8 j8Var : this.f80324c) {
            if (j8Var.w().d()) {
                j8Var.f(r8Var != null ? r8Var : e().f80724g, n5Var);
            }
        }
        this.f80327f = c.c(r8Var);
        if (this.f80323b.isFinished()) {
            return;
        }
        if (!this.f80339r.q() || N()) {
            final AtomicReference atomicReference = new AtomicReference();
            final m8 m8VarZ = this.f80323b.z();
            this.f80323b.E(new m8() { // from class: io.sentry.w7
                @Override // io.sentry.m8
                public final void a(j8 j8Var2) {
                    c8.x(this.f81589a, m8VarZ, atomicReference, j8Var2);
                }
            });
            this.f80323b.f(this.f80327f.f80344b, n5Var);
            Boolean bool = Boolean.TRUE;
            u3 u3VarB = (bool.equals(b()) && bool.equals(O())) ? this.f80325d.getOptions().getTransactionProfiler().b(this, (List) atomicReference.get(), this.f80325d.getOptions()) : null;
            if (this.f80325d.getOptions().isContinuousProfilingEnabled()) {
                s3 profileLifecycle = this.f80325d.getOptions().getProfileLifecycle();
                s3 s3Var = s3.TRACE;
                if (profileLifecycle == s3Var && this.f80323b.e().j().equals(io.sentry.protocol.x.f81078b)) {
                    this.f80325d.getOptions().getContinuousProfiler().f(s3Var);
                }
            }
            if (atomicReference.get() != null) {
                ((List) atomicReference.get()).clear();
            }
            this.f80325d.s(new f4() { // from class: io.sentry.x7
                @Override // io.sentry.f4
                public final void a(x0 x0Var) {
                    c8.u(this.f81610a, x0Var);
                }
            });
            io.sentry.protocol.e0 e0Var = new io.sentry.protocol.e0(this);
            if (this.f80330i != null) {
                d1 d1VarA = this.f80331j.a();
                try {
                    if (this.f80330i != null) {
                        B();
                        A();
                        this.f80330i.cancel();
                        this.f80330i = null;
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
            if (z11 && this.f80324c.isEmpty() && this.f80339r.l() != null) {
                this.f80325d.getOptions().getLogger().c(b7.DEBUG, "Dropping idle transaction %s because it has no child spans", this.f80326e);
            } else {
                e0Var.m0().putAll(this.f80323b.u());
                this.f80325d.x(e0Var, k(), h0Var, u3VarB);
            }
        }
    }

    public List<j8> F() {
        return this.f80324c;
    }

    public io.sentry.protocol.c G() {
        return this.f80337p;
    }

    public Map<String, Object> H() {
        return this.f80323b.s();
    }

    j8 J() {
        return this.f80323b;
    }

    public y8 K() {
        return this.f80323b.y();
    }

    public List<j8> L() {
        return this.f80324c;
    }

    public io.sentry.protocol.h0 M() {
        return this.f80335n;
    }

    public Boolean O() {
        return this.f80323b.D();
    }

    public void T(String str, Number number) {
        if (this.f80323b.u().containsKey(str)) {
            return;
        }
        j(str, number);
    }

    public void U(String str, Number number, e2 e2Var) {
        if (this.f80323b.u().containsKey(str)) {
            return;
        }
        n(str, number, e2Var);
    }

    g1 V(p8 p8Var, String str, String str2, n5 n5Var, n1 n1Var, q8 q8Var) {
        k8 k8VarA = e().a(str, p8Var, null);
        k8VarA.r(str2);
        k8VarA.s(n1Var);
        q8Var.h(n5Var);
        return C(k8VarA, q8Var);
    }

    @Override // io.sentry.i1
    public void a(r8 r8Var, boolean z11, h0 h0Var) {
        if (isFinished()) {
            return;
        }
        n5 n5VarNow = this.f80325d.getOptions().getDateProvider().now();
        ListIterator listIteratorD = io.sentry.util.c.d((CopyOnWriteArrayList) this.f80324c);
        while (listIteratorD.hasPrevious()) {
            j8 j8Var = (j8) listIteratorD.previous();
            j8Var.E(null);
            j8Var.f(r8Var, n5VarNow);
        }
        E(r8Var, n5VarNow, z11, h0Var);
    }

    @Override // io.sentry.g1
    public Boolean b() {
        return this.f80323b.b();
    }

    @Override // io.sentry.g1
    public g1 c(String str, String str2, n5 n5Var, n1 n1Var) {
        return p(str, str2, n5Var, n1Var, new q8());
    }

    @Override // io.sentry.i1
    public void d() {
        Long l11;
        d1 d1VarA = this.f80331j.a();
        try {
            if (this.f80330i != null && (l11 = this.f80339r.l()) != null) {
                B();
                this.f80333l.set(true);
                this.f80328g = new a();
                try {
                    this.f80330i.schedule(this.f80328g, l11.longValue());
                } catch (Throwable th2) {
                    this.f80325d.getOptions().getLogger().a(b7.WARNING, "Failed to schedule finish timer", th2);
                    Q();
                }
            }
            if (d1VarA != null) {
                d1VarA.close();
            }
        } catch (Throwable th3) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override // io.sentry.g1
    public k8 e() {
        return this.f80323b.e();
    }

    @Override // io.sentry.g1
    public void f(r8 r8Var, n5 n5Var) {
        E(r8Var, n5Var, true, null);
    }

    @Override // io.sentry.g1
    public void g() {
        m(getStatus());
    }

    @Override // io.sentry.g1
    public String getDescription() {
        return this.f80323b.getDescription();
    }

    @Override // io.sentry.i1
    public String getName() {
        return this.f80326e;
    }

    @Override // io.sentry.g1
    public r8 getStatus() {
        return this.f80323b.getStatus();
    }

    @Override // io.sentry.g1
    public void h(String str) {
        if (this.f80323b.isFinished()) {
            this.f80325d.getOptions().getLogger().c(b7.DEBUG, "The transaction is already finished. Description %s cannot be set", str);
        } else {
            this.f80323b.h(str);
        }
    }

    @Override // io.sentry.i1
    public io.sentry.protocol.x i() {
        return this.f80322a;
    }

    @Override // io.sentry.g1
    public boolean isFinished() {
        return this.f80323b.isFinished();
    }

    @Override // io.sentry.g1
    public void j(String str, Number number) {
        this.f80323b.j(str, number);
    }

    @Override // io.sentry.g1
    public w8 k() {
        d dVarB;
        if (!this.f80325d.getOptions().isTraceSampling() || (dVarB = e().b()) == null) {
            return null;
        }
        W(dVarB);
        return dVarB.J();
    }

    @Override // io.sentry.g1
    public void l(String str, Object obj) {
        if (this.f80323b.isFinished()) {
            this.f80325d.getOptions().getLogger().c(b7.DEBUG, "The transaction is already finished. Data %s cannot be set", str);
        } else {
            this.f80323b.l(str, obj);
        }
    }

    @Override // io.sentry.g1
    public void m(r8 r8Var) {
        f(r8Var, null);
    }

    @Override // io.sentry.g1
    public d1 makeCurrent() {
        this.f80325d.s(new f4() { // from class: io.sentry.a8
            @Override // io.sentry.f4
            public final void a(x0 x0Var) {
                c8.v(this.f79228a, x0Var);
            }
        });
        return u2.c();
    }

    @Override // io.sentry.g1
    public void n(String str, Number number, e2 e2Var) {
        this.f80323b.n(str, number, e2Var);
    }

    @Override // io.sentry.i1
    public g1 o() {
        ListIterator listIteratorD = io.sentry.util.c.d((CopyOnWriteArrayList) this.f80324c);
        while (listIteratorD.hasPrevious()) {
            j8 j8Var = (j8) listIteratorD.previous();
            if (!j8Var.isFinished()) {
                return j8Var;
            }
        }
        return null;
    }

    @Override // io.sentry.g1
    public g1 p(String str, String str2, n5 n5Var, n1 n1Var, q8 q8Var) {
        return D(str, str2, n5Var, n1Var, q8Var);
    }

    @Override // io.sentry.g1
    public n5 q() {
        return this.f80323b.q();
    }

    @Override // io.sentry.g1
    public n5 r() {
        return this.f80323b.r();
    }
}
