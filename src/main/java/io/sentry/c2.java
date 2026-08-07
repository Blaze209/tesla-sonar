package io.sentry;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class c2 implements c0, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q7 f80306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v7 f80307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s6 f80308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile k0 f80309d = null;

    public c2(q7 q7Var) {
        q7 q7Var2 = (q7) io.sentry.util.y.c(q7Var, "The SentryOptions is required.");
        this.f80306a = q7Var2;
        u7 u7Var = new u7(q7Var2);
        this.f80308c = new s6(u7Var);
        this.f80307b = new v7(u7Var);
    }

    private void B(i5 i5Var) {
        io.sentry.protocol.i0 i0VarQ = i5Var.Q();
        if (i0VarQ == null) {
            i0VarQ = new io.sentry.protocol.i0();
            i5Var.f0(i0VarQ);
        }
        if (i0VarQ.j() == null && this.f80306a.isSendDefaultPii()) {
            i0VarQ.p("{{auto}}");
        }
    }

    private void C(i5 i5Var) {
        k0(i5Var);
        T(i5Var);
        r0(i5Var);
        J(i5Var);
        n0(i5Var);
        s0(i5Var);
        B(i5Var);
    }

    private void H(i5 i5Var) {
        e0(i5Var);
    }

    private void I(i5 i5Var) {
        io.sentry.protocol.d dVarC = io.sentry.protocol.d.c(i5Var.D(), this.f80306a);
        if (dVarC != null) {
            i5Var.T(dVarC);
        }
    }

    private void J(i5 i5Var) {
        if (i5Var.E() == null) {
            i5Var.U(this.f80306a.getDist());
        }
    }

    private void T(i5 i5Var) {
        if (i5Var.F() == null) {
            i5Var.V(this.f80306a.getEnvironment());
        }
    }

    private void b0(r6 r6Var) {
        Throwable thP = r6Var.P();
        if (thP != null) {
            r6Var.A0(this.f80308c.d(thP));
        }
    }

    private void c0(r6 r6Var) {
        Map<String, String> mapA = this.f80306a.getModulesLoader().a();
        if (mapA == null) {
            return;
        }
        Map<String, String> mapT0 = r6Var.t0();
        if (mapT0 == null) {
            r6Var.E0(mapA);
        } else {
            mapT0.putAll(mapA);
        }
    }

    private void e0(i5 i5Var) {
        if (i5Var.I() == null) {
            i5Var.Y("java");
        }
    }

    private void k0(i5 i5Var) {
        if (i5Var.J() == null) {
            i5Var.Z(this.f80306a.getRelease());
        }
    }

    private void n0(i5 i5Var) {
        if (i5Var.L() == null) {
            i5Var.b0(this.f80306a.getSdkVersion());
        }
    }

    private void p() {
        if (this.f80309d == null) {
            this.f80309d = k0.e();
        }
    }

    private void r0(i5 i5Var) {
        if (i5Var.M() == null) {
            i5Var.c0(this.f80306a.getServerName());
        }
        if (this.f80306a.isAttachServerName() && i5Var.M() == null) {
            p();
            if (this.f80309d != null) {
                i5Var.c0(this.f80309d.d());
            }
        }
    }

    private void s0(i5 i5Var) {
        if (i5Var.N() == null) {
            i5Var.e0(new HashMap(this.f80306a.getTags()));
            return;
        }
        for (Map.Entry<String, String> entry : this.f80306a.getTags().entrySet()) {
            if (!i5Var.N().containsKey(entry.getKey())) {
                i5Var.d0(entry.getKey(), entry.getValue());
            }
        }
    }

    private boolean t(h0 h0Var) {
        return io.sentry.util.n.h(h0Var, io.sentry.hints.e.class);
    }

    private void t0(r6 r6Var, h0 h0Var) {
        boolean zC;
        if (r6Var.u0() == null) {
            List<io.sentry.protocol.s> listP0 = r6Var.p0();
            ArrayList arrayList = null;
            if (listP0 != null && !listP0.isEmpty()) {
                for (io.sentry.protocol.s sVar : listP0) {
                    if (sVar.g() != null && sVar.j() != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(sVar.j());
                    }
                }
            }
            if (this.f80306a.isAttachThreads() || io.sentry.util.n.h(h0Var, io.sentry.hints.a.class)) {
                Object objG = io.sentry.util.n.g(h0Var);
                boolean zIsAttachStacktrace = this.f80306a.isAttachStacktrace();
                if (objG instanceof io.sentry.hints.a) {
                    zC = ((io.sentry.hints.a) objG).c();
                    zIsAttachStacktrace = true;
                } else {
                    zC = false;
                }
                r6Var.F0(this.f80307b.b(arrayList, zC, zIsAttachStacktrace));
                return;
            }
            if (this.f80306a.isAttachStacktrace()) {
                if ((listP0 == null || listP0.isEmpty()) && !t(h0Var)) {
                    r6Var.F0(this.f80307b.a(this.f80306a.isAttachStacktrace()));
                }
            }
        }
    }

    private boolean u0(i5 i5Var, h0 h0Var) {
        if (io.sentry.util.n.q(h0Var)) {
            return true;
        }
        this.f80306a.getLogger().c(b7.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", i5Var.G());
        return false;
    }

    @Override // io.sentry.c0
    public r7 c(r7 r7Var, h0 h0Var) {
        H(r7Var);
        if (u0(r7Var, h0Var)) {
            C(r7Var);
            io.sentry.protocol.r rVarO = this.f80306a.getSessionReplay().o();
            if (rVarO != null) {
                r7Var.b0(rVarO);
            }
        }
        return r7Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f80309d != null) {
            this.f80309d.c();
        }
    }

    @Override // io.sentry.c0
    public r6 n(r6 r6Var, h0 h0Var) {
        H(r6Var);
        b0(r6Var);
        I(r6Var);
        c0(r6Var);
        if (u0(r6Var, h0Var)) {
            C(r6Var);
            t0(r6Var, h0Var);
        }
        return r6Var;
    }

    @Override // io.sentry.c0
    public io.sentry.protocol.e0 o(io.sentry.protocol.e0 e0Var, h0 h0Var) {
        H(e0Var);
        I(e0Var);
        if (u0(e0Var, h0Var)) {
            C(e0Var);
        }
        return e0Var;
    }
}
