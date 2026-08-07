package io.sentry;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public final class j8 implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n5 f80686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n5 f80687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k8 f80688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c8 f80689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Throwable f80690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final z0 f80691f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final q8 f80694i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private m8 f80695j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f80692g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f80693h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map<String, Object> f80696k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map<String, io.sentry.protocol.k> f80697l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final io.sentry.protocol.c f80698m = new io.sentry.protocol.c();

    j8(c8 c8Var, z0 z0Var, k8 k8Var, q8 q8Var, m8 m8Var) {
        this.f80688c = k8Var;
        k8Var.t(q8Var.a());
        this.f80689d = (c8) io.sentry.util.y.c(c8Var, "transaction is required");
        this.f80691f = (z0) io.sentry.util.y.c(z0Var, "Scopes are required");
        this.f80694i = q8Var;
        this.f80695j = m8Var;
        n5 n5VarC = q8Var.c();
        if (n5VarC != null) {
            this.f80686a = n5VarC;
        } else {
            this.f80686a = z0Var.getOptions().getDateProvider().now();
        }
    }

    private void G(n5 n5Var) {
        this.f80686a = n5Var;
    }

    private List<j8> t() {
        ArrayList arrayList = new ArrayList();
        for (j8 j8Var : this.f80689d.L()) {
            if (j8Var.x() != null && j8Var.x().equals(A())) {
                arrayList.add(j8Var);
            }
        }
        return arrayList;
    }

    public p8 A() {
        return this.f80688c.m();
    }

    public Map<String, String> B() {
        return this.f80688c.o();
    }

    public io.sentry.protocol.x C() {
        return this.f80688c.p();
    }

    public Boolean D() {
        return this.f80688c.i();
    }

    void E(m8 m8Var) {
        this.f80695j = m8Var;
    }

    public boolean F(n5 n5Var) {
        if (this.f80687b == null) {
            return false;
        }
        this.f80687b = n5Var;
        return true;
    }

    @Override // io.sentry.g1
    public Boolean b() {
        return this.f80688c.k();
    }

    @Override // io.sentry.g1
    public g1 c(String str, String str2, n5 n5Var, n1 n1Var) {
        return p(str, str2, n5Var, n1Var, new q8());
    }

    @Override // io.sentry.g1
    public k8 e() {
        return this.f80688c;
    }

    @Override // io.sentry.g1
    public void f(r8 r8Var, n5 n5Var) {
        n5 n5Var2;
        if (this.f80692g || !this.f80693h.compareAndSet(false, true)) {
            return;
        }
        this.f80688c.v(r8Var);
        if (n5Var == null) {
            n5Var = this.f80691f.getOptions().getDateProvider().now();
        }
        this.f80687b = n5Var;
        if (this.f80694i.f() || this.f80694i.e()) {
            n5 n5VarR = null;
            n5 n5VarQ = null;
            for (j8 j8Var : this.f80689d.J().A().equals(A()) ? this.f80689d.F() : t()) {
                if (n5VarR == null || j8Var.r().d(n5VarR)) {
                    n5VarR = j8Var.r();
                }
                if (n5VarQ == null || (j8Var.q() != null && j8Var.q().c(n5VarQ))) {
                    n5VarQ = j8Var.q();
                }
            }
            if (this.f80694i.f() && n5VarR != null && this.f80686a.d(n5VarR)) {
                G(n5VarR);
            }
            if (this.f80694i.e() && n5VarQ != null && ((n5Var2 = this.f80687b) == null || n5Var2.c(n5VarQ))) {
                F(n5VarQ);
            }
        }
        Throwable th2 = this.f80690e;
        if (th2 != null) {
            this.f80691f.e(th2, this, this.f80689d.getName());
        }
        m8 m8Var = this.f80695j;
        if (m8Var != null) {
            m8Var.a(this);
        }
        this.f80692g = true;
    }

    @Override // io.sentry.g1
    public void g() {
        m(this.f80688c.n());
    }

    @Override // io.sentry.g1
    public String getDescription() {
        return this.f80688c.c();
    }

    @Override // io.sentry.g1
    public r8 getStatus() {
        return this.f80688c.n();
    }

    @Override // io.sentry.g1
    public void h(String str) {
        this.f80688c.r(str);
    }

    @Override // io.sentry.g1
    public boolean isFinished() {
        return this.f80692g;
    }

    @Override // io.sentry.g1
    public void j(String str, Number number) {
        if (isFinished()) {
            this.f80691f.getOptions().getLogger().c(b7.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.f80697l.put(str, new io.sentry.protocol.k(number, null));
        if (this.f80689d.J() != this) {
            this.f80689d.T(str, number);
        }
    }

    @Override // io.sentry.g1
    public void l(String str, Object obj) {
        if (str == null) {
            return;
        }
        if (obj == null) {
            this.f80696k.remove(str);
        } else {
            this.f80696k.put(str, obj);
        }
    }

    @Override // io.sentry.g1
    public void m(r8 r8Var) {
        f(r8Var, this.f80691f.getOptions().getDateProvider().now());
    }

    @Override // io.sentry.g1
    public void n(String str, Number number, e2 e2Var) {
        if (isFinished()) {
            this.f80691f.getOptions().getLogger().c(b7.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.f80697l.put(str, new io.sentry.protocol.k(number, e2Var.apiName()));
        if (this.f80689d.J() != this) {
            this.f80689d.U(str, number, e2Var);
        }
    }

    @Override // io.sentry.g1
    public g1 p(String str, String str2, n5 n5Var, n1 n1Var, q8 q8Var) {
        return this.f80692g ? c3.s() : this.f80689d.V(this.f80688c.m(), str, str2, n5Var, n1Var, q8Var);
    }

    @Override // io.sentry.g1
    public n5 q() {
        return this.f80687b;
    }

    @Override // io.sentry.g1
    public n5 r() {
        return this.f80686a;
    }

    public Map<String, Object> s() {
        return this.f80696k;
    }

    public Map<String, io.sentry.protocol.k> u() {
        return this.f80697l;
    }

    public String v() {
        return this.f80688c.f();
    }

    q8 w() {
        return this.f80694i;
    }

    public p8 x() {
        return this.f80688c.h();
    }

    public y8 y() {
        return this.f80688c.l();
    }

    m8 z() {
        return this.f80695j;
    }

    public j8(z8 z8Var, c8 c8Var, z0 z0Var, q8 q8Var) {
        k8 k8Var = (k8) io.sentry.util.y.c(z8Var, "context is required");
        this.f80688c = k8Var;
        k8Var.t(q8Var.a());
        this.f80689d = (c8) io.sentry.util.y.c(c8Var, "sentryTracer is required");
        this.f80691f = (z0) io.sentry.util.y.c(z0Var, "scopes are required");
        this.f80695j = null;
        n5 n5VarC = q8Var.c();
        if (n5VarC != null) {
            this.f80686a = n5VarC;
        } else {
            this.f80686a = z0Var.getOptions().getDateProvider().now();
        }
        this.f80694i = q8Var;
    }
}
