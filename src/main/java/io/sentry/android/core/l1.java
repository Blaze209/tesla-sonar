package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.sentry.b7;
import io.sentry.i5;
import io.sentry.r6;
import io.sentry.r7;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes9.dex */
final class l1 implements io.sentry.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f79604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z0 f79605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SentryAndroidOptions f79606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Future<o1> f79607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.sentry.util.r<String> f79608e = new io.sentry.util.r<>(new io.sentry.util.r.a() { // from class: io.sentry.android.core.i1
        @Override // io.sentry.util.r.a
        public final Object a() {
            return g1.l(io.sentry.m2.e());
        }
    });

    public l1(Context context, z0 z0Var, final SentryAndroidOptions sentryAndroidOptions) {
        Future<o1> futureSubmit;
        this.f79604a = (Context) io.sentry.util.y.c(g1.g(context), "The application context is required.");
        this.f79605b = (z0) io.sentry.util.y.c(z0Var, "The BuildInfoProvider is required.");
        this.f79606c = (SentryAndroidOptions) io.sentry.util.y.c(sentryAndroidOptions, "The options object is required.");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            futureSubmit = executorServiceNewSingleThreadExecutor.submit(new Callable() { // from class: io.sentry.android.core.j1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return o1.k(this.f79566a.f79604a, sentryAndroidOptions);
                }
            });
        } catch (RejectedExecutionException e11) {
            sentryAndroidOptions.getLogger().a(b7.WARNING, "Device info caching task rejected.", e11);
            futureSubmit = null;
        }
        this.f79607d = futureSubmit;
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    private static void e(r6 r6Var) {
        io.sentry.protocol.c0 c0VarI;
        List<io.sentry.protocol.b0> listD;
        List<io.sentry.protocol.s> listP0 = r6Var.p0();
        if (listP0 == null || listP0.size() <= 1) {
            return;
        }
        io.sentry.protocol.s sVar = listP0.get(listP0.size() - 1);
        if (!"java.lang".equals(sVar.h()) || (c0VarI = sVar.i()) == null || (listD = c0VarI.d()) == null) {
            return;
        }
        Iterator<io.sentry.protocol.b0> it = listD.iterator();
        while (it.hasNext()) {
            if ("com.android.internal.os.RuntimeInit$MethodAndArgsCaller".equals(it.next().v())) {
                Collections.reverse(listP0);
                return;
            }
        }
    }

    private void f(i5 i5Var) {
        String str;
        io.sentry.protocol.n nVarH = i5Var.C().h();
        Future<o1> future = this.f79607d;
        if (future != null) {
            try {
                i5Var.C().u(future.get().l());
            } catch (Throwable th2) {
                this.f79606c.getLogger().a(b7.ERROR, "Failed to retrieve os system", th2);
            }
        } else {
            this.f79606c.getLogger().c(b7.ERROR, "Failed to retrieve device info", new Object[0]);
        }
        if (nVarH != null) {
            String strG = nVarH.g();
            if (strG == null || strG.isEmpty()) {
                str = "os_1";
            } else {
                str = "os_" + strG.trim().toLowerCase(Locale.ROOT);
            }
            i5Var.C().l(str, nVarH);
        }
    }

    private void g(i5 i5Var) {
        io.sentry.protocol.i0 i0VarQ = i5Var.Q();
        if (i0VarQ == null) {
            i0VarQ = new io.sentry.protocol.i0();
            i5Var.f0(i0VarQ);
        }
        if (i0VarQ.i() == null) {
            i0VarQ.o((String) this.f79606c.getRuntimeManager().a(new io.sentry.util.runtime.a.InterfaceC1708a() { // from class: io.sentry.android.core.k1
                @Override // io.sentry.util.runtime.a.InterfaceC1708a
                public final Object run() {
                    return t1.a(this.f79596a.f79604a);
                }
            }));
        }
        if (i0VarQ.j() == null && this.f79606c.isSendDefaultPii()) {
            i0VarQ.p("{{auto}}");
        }
    }

    private void h(i5 i5Var, io.sentry.h0 h0Var) {
        io.sentry.protocol.a aVarD = i5Var.C().d();
        if (aVarD == null) {
            aVarD = new io.sentry.protocol.a();
        }
        i(aVarD, h0Var);
        m(i5Var, aVarD);
        i5Var.C().o(aVarD);
    }

    private void i(io.sentry.protocol.a aVar, io.sentry.h0 h0Var) {
        Boolean boolH;
        aVar.o(g1.i(this.f79604a));
        io.sentry.android.core.performance.i iVarM = io.sentry.android.core.performance.h.q().m(this.f79606c);
        if (iVarM.m()) {
            aVar.p(io.sentry.l.o(iVarM.g()));
        }
        if (io.sentry.util.n.i(h0Var) || aVar.l() != null || (boolH = y0.C().H()) == null) {
            return;
        }
        aVar.r(Boolean.valueOf(!boolH.booleanValue()));
    }

    private void j(i5 i5Var, boolean z11, boolean z12) {
        g(i5Var);
        k(i5Var, z11, z12);
        p(i5Var);
    }

    private void k(i5 i5Var, boolean z11, boolean z12) {
        if (i5Var.C().e() == null) {
            if (this.f79607d != null) {
                try {
                    i5Var.C().q(this.f79607d.get().c(z11, z12));
                } catch (Throwable th2) {
                    this.f79606c.getLogger().a(b7.ERROR, "Failed to retrieve device info", th2);
                }
            } else {
                this.f79606c.getLogger().c(b7.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            f(i5Var);
        }
    }

    private void l(i5 i5Var, String str) {
        if (i5Var.E() == null) {
            i5Var.U(str);
        }
    }

    private void m(i5 i5Var, io.sentry.protocol.a aVar) {
        o1 o1Var;
        PackageInfo packageInfoO = g1.o(this.f79604a, 4096, this.f79606c.getLogger(), this.f79605b);
        if (packageInfoO != null) {
            l(i5Var, g1.q(packageInfoO, this.f79605b));
            Future<o1> future = this.f79607d;
            if (future != null) {
                try {
                    o1Var = future.get();
                } catch (Throwable th2) {
                    this.f79606c.getLogger().a(b7.ERROR, "Failed to retrieve device info", th2);
                    o1Var = null;
                }
                g1.x(packageInfoO, this.f79605b, o1Var, aVar);
            }
            this.f79606c.getLogger().c(b7.ERROR, "Failed to retrieve device info", new Object[0]);
            o1Var = null;
            g1.x(packageInfoO, this.f79605b, o1Var, aVar);
        }
    }

    private void p(i5 i5Var) {
        Future<o1> future = this.f79607d;
        if (future == null) {
            this.f79606c.getLogger().c(b7.ERROR, "Failed to retrieve device info", new Object[0]);
            return;
        }
        try {
            g1.a aVarN = future.get().n();
            if (aVarN != null) {
                for (Map.Entry<String, String> entry : aVarN.a().entrySet()) {
                    i5Var.d0(entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable th2) {
            this.f79606c.getLogger().a(b7.ERROR, "Error getting side loaded info.", th2);
        }
    }

    private void q(r6 r6Var, io.sentry.h0 h0Var) {
        if (r6Var.u0() != null) {
            boolean zI = io.sentry.util.n.i(h0Var);
            for (io.sentry.protocol.d0 d0Var : r6Var.u0()) {
                boolean zG = io.sentry.android.core.internal.util.j.e().g(d0Var);
                if (d0Var.o() == null) {
                    d0Var.r(Boolean.valueOf(zG));
                }
                if (!zI && d0Var.p() == null) {
                    d0Var.v(Boolean.valueOf(zG));
                }
            }
        }
    }

    private boolean r(i5 i5Var, io.sentry.h0 h0Var) {
        if (io.sentry.util.n.q(h0Var)) {
            return true;
        }
        this.f79606c.getLogger().c(b7.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", i5Var.G());
        return false;
    }

    @Override // io.sentry.c0
    public r7 c(r7 r7Var, io.sentry.h0 h0Var) {
        boolean zR = r(r7Var, h0Var);
        if (zR) {
            h(r7Var, h0Var);
        }
        j(r7Var, false, zR);
        return r7Var;
    }

    @Override // io.sentry.c0
    public r6 n(r6 r6Var, io.sentry.h0 h0Var) {
        boolean zR = r(r6Var, h0Var);
        if (zR) {
            h(r6Var, h0Var);
            q(r6Var, h0Var);
        }
        j(r6Var, true, zR);
        e(r6Var);
        return r6Var;
    }

    @Override // io.sentry.c0
    public io.sentry.protocol.e0 o(io.sentry.protocol.e0 e0Var, io.sentry.h0 h0Var) {
        boolean zR = r(e0Var, h0Var);
        if (zR) {
            h(e0Var, h0Var);
        }
        j(e0Var, false, zR);
        return e0Var;
    }
}
