package io.sentry.android.core;

import io.sentry.k8;
import io.sentry.p8;
import io.sentry.r6;
import io.sentry.r8;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
final class g2 implements io.sentry.c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f79403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SentryAndroidOptions f79404c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f79402a = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.util.a f79405d = new io.sentry.util.a();

    g2(SentryAndroidOptions sentryAndroidOptions, i iVar) {
        this.f79404c = (SentryAndroidOptions) io.sentry.util.y.c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f79403b = (i) io.sentry.util.y.c(iVar, "ActivityFramesTracker is required");
    }

    private void a(io.sentry.android.core.performance.h hVar, io.sentry.protocol.e0 e0Var) {
        k8 k8VarJ;
        p8 p8VarE;
        if (hVar.n() == io.sentry.android.core.performance.h.a.COLD && (k8VarJ = e0Var.C().j()) != null) {
            io.sentry.protocol.x xVarP = k8VarJ.p();
            Iterator<io.sentry.protocol.a0> it = e0Var.o0().iterator();
            while (true) {
                if (!it.hasNext()) {
                    p8VarE = null;
                    break;
                }
                io.sentry.protocol.a0 next = it.next();
                if (next.d().contentEquals("app.start.cold")) {
                    p8VarE = next.e();
                    break;
                }
            }
            io.sentry.android.core.performance.i iVarG = hVar.g();
            if (iVarG.m() && Math.abs(iVarG.c()) <= 10000) {
                e0Var.o0().add(f(iVarG, p8VarE, xVarP, "process.load"));
            }
            List<io.sentry.android.core.performance.i> listP = hVar.p();
            if (!listP.isEmpty()) {
                Iterator<io.sentry.android.core.performance.i> it2 = listP.iterator();
                while (it2.hasNext()) {
                    e0Var.o0().add(f(it2.next(), p8VarE, xVarP, "contentprovider.load"));
                }
            }
            io.sentry.android.core.performance.i iVarO = hVar.o();
            if (iVarO.n()) {
                e0Var.o0().add(f(iVarO, p8VarE, xVarP, "application.load"));
            }
        }
    }

    private boolean b(io.sentry.protocol.e0 e0Var) {
        for (io.sentry.protocol.a0 a0Var : e0Var.o0()) {
            if (a0Var.d().contentEquals("app.start.cold") || a0Var.d().contentEquals("app.start.warm")) {
                return true;
            }
        }
        k8 k8VarJ = e0Var.C().j();
        if (k8VarJ != null) {
            return k8VarJ.f().equals("app.start.cold") || k8VarJ.f().equals("app.start.warm");
        }
        return false;
    }

    private static boolean d(double d11, io.sentry.protocol.a0 a0Var) {
        if (d11 >= a0Var.f().doubleValue()) {
            return a0Var.g() == null || d11 <= a0Var.g().doubleValue();
        }
        return false;
    }

    private void e(io.sentry.protocol.e0 e0Var) {
        Object obj;
        io.sentry.protocol.a0 a0Var = null;
        io.sentry.protocol.a0 a0Var2 = null;
        for (io.sentry.protocol.a0 a0Var3 : e0Var.o0()) {
            if ("ui.load.initial_display".equals(a0Var3.d())) {
                a0Var = a0Var3;
            } else if ("ui.load.full_display".equals(a0Var3.d())) {
                a0Var2 = a0Var3;
            }
            if (a0Var != null && a0Var2 != null) {
                break;
            }
        }
        if (a0Var == null && a0Var2 == null) {
            return;
        }
        for (io.sentry.protocol.a0 a0Var4 : e0Var.o0()) {
            if (a0Var4 != a0Var && a0Var4 != a0Var2) {
                Map<String, Object> mapB = a0Var4.b();
                boolean z11 = false;
                boolean z12 = a0Var != null && d(a0Var4.f().doubleValue(), a0Var) && (mapB == null || (obj = mapB.get("thread.name")) == null || "main".equals(obj));
                if (a0Var2 != null && d(a0Var4.f().doubleValue(), a0Var2)) {
                    z11 = true;
                }
                if (z12 || z11) {
                    Map<String, Object> mapB2 = a0Var4.b();
                    if (mapB2 == null) {
                        mapB2 = new ConcurrentHashMap<>();
                        a0Var4.h(mapB2);
                    }
                    if (z12) {
                        mapB2.put("ui.contributes_to_ttid", Boolean.TRUE);
                    }
                    if (z11) {
                        mapB2.put("ui.contributes_to_ttfd", Boolean.TRUE);
                    }
                }
            }
        }
    }

    private static io.sentry.protocol.a0 f(io.sentry.android.core.performance.i iVar, p8 p8Var, io.sentry.protocol.x xVar, String str) {
        HashMap map = new HashMap(2);
        map.put("thread.id", Long.valueOf(io.sentry.android.core.internal.util.j.f79526b));
        map.put("thread.name", "main");
        Boolean bool = Boolean.TRUE;
        map.put("ui.contributes_to_ttid", bool);
        map.put("ui.contributes_to_ttfd", bool);
        return new io.sentry.protocol.a0(Double.valueOf(iVar.i()), Double.valueOf(iVar.f()), xVar, new p8(), p8Var, str, iVar.b(), r8.OK, "auto.ui", new ConcurrentHashMap(), new ConcurrentHashMap(), map);
    }

    @Override // io.sentry.c0
    public r6 n(r6 r6Var, io.sentry.h0 h0Var) {
        return r6Var;
    }

    @Override // io.sentry.c0
    public io.sentry.protocol.e0 o(io.sentry.protocol.e0 e0Var, io.sentry.h0 h0Var) {
        Map<String, io.sentry.protocol.k> mapN;
        io.sentry.d1 d1VarA = this.f79405d.a();
        try {
            if (!this.f79404c.isTracingEnabled()) {
                if (d1VarA != null) {
                    d1VarA.close();
                }
                return e0Var;
            }
            io.sentry.android.core.performance.h hVarQ = io.sentry.android.core.performance.h.q();
            if (b(e0Var)) {
                if (hVarQ.z()) {
                    long jC = hVarQ.m(this.f79404c).c();
                    if (jC != 0) {
                        e0Var.m0().put(hVarQ.n() == io.sentry.android.core.performance.h.a.COLD ? "app_start_cold" : "app_start_warm", new io.sentry.protocol.k(Float.valueOf(jC), io.sentry.e2.a.MILLISECOND.apiName()));
                        a(hVarQ, e0Var);
                        hVarQ.t();
                    }
                }
                io.sentry.protocol.a aVarD = e0Var.C().d();
                if (aVarD == null) {
                    aVarD = new io.sentry.protocol.a();
                    e0Var.C().o(aVarD);
                }
                aVarD.v(hVarQ.n() == io.sentry.android.core.performance.h.a.COLD ? "cold" : "warm");
            }
            e(e0Var);
            io.sentry.protocol.x xVarG = e0Var.G();
            k8 k8VarJ = e0Var.C().j();
            if (xVarG != null && k8VarJ != null && k8VarJ.f().contentEquals("ui.load") && (mapN = this.f79403b.n(xVarG)) != null) {
                e0Var.m0().putAll(mapN);
            }
            if (d1VarA != null) {
                d1VarA.close();
            }
            return e0Var;
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
}
