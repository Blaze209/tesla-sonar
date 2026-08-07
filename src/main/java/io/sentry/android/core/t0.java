package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import io.sentry.b7;
import io.sentry.i5;
import io.sentry.k8;
import io.sentry.protocol.DebugImage;
import io.sentry.q7;
import io.sentry.r6;
import io.sentry.s6;
import io.sentry.u7;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class t0 implements io.sentry.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f79741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SentryAndroidOptions f79742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z0 f79743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s6 f79744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.sentry.cache.t f79745e;

    public t0(Context context, SentryAndroidOptions sentryAndroidOptions, z0 z0Var) {
        this.f79741a = g1.g(context);
        this.f79742b = sentryAndroidOptions;
        this.f79743c = z0Var;
        this.f79745e = sentryAndroidOptions.findPersistingScopeObserver();
        this.f79744d = new s6(new u7(sentryAndroidOptions));
    }

    private void A(i5 i5Var) {
        Map map = (Map) io.sentry.cache.h.b(this.f79742b, "tags.json", Map.class);
        if (map == null) {
            return;
        }
        if (i5Var.N() == null) {
            i5Var.e0(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!i5Var.N().containsKey(entry.getKey())) {
                i5Var.d0((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    private void B(i5 i5Var) {
        if (i5Var.I() == null) {
            i5Var.Y("java");
        }
    }

    private void C(i5 i5Var) {
        if (i5Var.J() == null) {
            i5Var.Z((String) io.sentry.cache.h.b(this.f79742b, "release.json", String.class));
        }
    }

    private void D(r6 r6Var) {
        String str = (String) l(this.f79742b, "replay.json", String.class);
        if (!new File(this.f79742b.getCacheDirPath(), "replay_" + str).exists()) {
            if (!m(r6Var)) {
                return;
            }
            File[] fileArrListFiles = new File(this.f79742b.getCacheDirPath()).listFiles();
            String strSubstring = null;
            if (fileArrListFiles != null) {
                long jLastModified = Long.MIN_VALUE;
                for (File file : fileArrListFiles) {
                    if (file.isDirectory() && file.getName().startsWith("replay_") && file.lastModified() > jLastModified && file.lastModified() <= r6Var.v0().getTime()) {
                        jLastModified = file.lastModified();
                        strSubstring = file.getName().substring(7);
                    }
                }
            }
            str = strSubstring;
        }
        if (str == null) {
            return;
        }
        io.sentry.cache.t.E(this.f79742b, str, "replay.json");
        r6Var.C().l("replay_id", str);
    }

    private void E(i5 i5Var) {
        if (i5Var.K() == null) {
            i5Var.a0((io.sentry.protocol.o) l(this.f79742b, "request.json", io.sentry.protocol.o.class));
        }
    }

    private void F(i5 i5Var) {
        Map map = (Map) l(this.f79742b, "tags.json", Map.class);
        if (map == null) {
            return;
        }
        if (i5Var.N() == null) {
            i5Var.e0(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!i5Var.N().containsKey(entry.getKey())) {
                i5Var.d0((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    private void G(i5 i5Var) {
        if (i5Var.L() == null) {
            i5Var.b0((io.sentry.protocol.r) io.sentry.cache.h.b(this.f79742b, "sdk-version.json", io.sentry.protocol.r.class));
        }
    }

    private void H(i5 i5Var) {
        try {
            g1.a aVarN = o1.k(this.f79741a, this.f79742b).n();
            if (aVarN != null) {
                for (Map.Entry<String, String> entry : aVarN.a().entrySet()) {
                    i5Var.d0(entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable th2) {
            this.f79742b.getLogger().a(b7.ERROR, "Error getting side loaded info.", th2);
        }
    }

    private void I(r6 r6Var) {
        k(r6Var);
        H(r6Var);
    }

    private void J(r6 r6Var) {
        k8 k8Var = (k8) l(this.f79742b, "trace.json", k8.class);
        if (r6Var.C().j() != null || k8Var == null || k8Var.m() == null || k8Var.p() == null) {
            return;
        }
        r6Var.C().z(k8Var);
    }

    private void K(r6 r6Var) {
        String str = (String) l(this.f79742b, "transaction.json", String.class);
        if (r6Var.w0() == null) {
            r6Var.H0(str);
        }
    }

    private void L(i5 i5Var) {
        if (i5Var.Q() == null) {
            i5Var.f0((io.sentry.protocol.i0) l(this.f79742b, "user.json", io.sentry.protocol.i0.class));
        }
    }

    private void b(r6 r6Var, Object obj) {
        C(r6Var);
        v(r6Var);
        u(r6Var);
        s(r6Var);
        G(r6Var);
        p(r6Var, obj);
        A(r6Var);
    }

    private void d(r6 r6Var, Object obj) {
        E(r6Var);
        L(r6Var);
        F(r6Var);
        q(r6Var);
        x(r6Var);
        r(r6Var);
        K(r6Var);
        y(r6Var, obj);
        z(r6Var);
        J(r6Var);
        D(r6Var);
    }

    private io.sentry.protocol.d0 e(List<io.sentry.protocol.d0> list) {
        if (list == null) {
            return null;
        }
        for (io.sentry.protocol.d0 d0Var : list) {
            String strM = d0Var.m();
            if (strM != null && strM.equals("main")) {
                return d0Var;
            }
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    private io.sentry.protocol.e f() {
        io.sentry.protocol.e eVar = new io.sentry.protocol.e();
        eVar.b0(Build.MANUFACTURER);
        eVar.P(Build.BRAND);
        eVar.V(g1.l(this.f79742b.getLogger()));
        eVar.d0(Build.MODEL);
        eVar.e0(Build.ID);
        eVar.L(g1.j());
        ActivityManager.MemoryInfo memoryInfoN = g1.n(this.f79741a, this.f79742b.getLogger());
        if (memoryInfoN != null) {
            eVar.c0(h(memoryInfoN));
        }
        eVar.n0(this.f79743c.f());
        DisplayMetrics displayMetricsK = g1.k(this.f79741a, this.f79742b.getLogger());
        if (displayMetricsK != null) {
            eVar.m0(Integer.valueOf(displayMetricsK.widthPixels));
            eVar.l0(Integer.valueOf(displayMetricsK.heightPixels));
            eVar.j0(Float.valueOf(displayMetricsK.density));
            eVar.k0(Integer.valueOf(displayMetricsK.densityDpi));
        }
        if (eVar.J() == null) {
            eVar.Y(g());
        }
        List<Integer> listC = io.sentry.android.core.internal.util.m.a().c();
        if (!listC.isEmpty()) {
            eVar.i0(Double.valueOf(((Integer) Collections.max(listC)).doubleValue()));
            eVar.h0(Integer.valueOf(listC.size()));
        }
        return eVar;
    }

    private String g() {
        try {
            return (String) this.f79742b.getRuntimeManager().a(new io.sentry.util.runtime.a.InterfaceC1708a() { // from class: io.sentry.android.core.s0
                @Override // io.sentry.util.runtime.a.InterfaceC1708a
                public final Object run() {
                    return t1.a(this.f79738a.f79741a);
                }
            });
        } catch (Throwable th2) {
            this.f79742b.getLogger().a(b7.ERROR, "Error getting installationId.", th2);
            return null;
        }
    }

    private Long h(ActivityManager.MemoryInfo memoryInfo) {
        return Long.valueOf(memoryInfo.totalMem);
    }

    private boolean i(Object obj) {
        if (obj instanceof io.sentry.hints.a) {
            return "anr_background".equals(((io.sentry.hints.a) obj).d());
        }
        return false;
    }

    private void j(i5 i5Var) {
        String str;
        io.sentry.protocol.n nVarH = i5Var.C().h();
        i5Var.C().u(o1.k(this.f79741a, this.f79742b).l());
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

    private void k(i5 i5Var) {
        io.sentry.protocol.i0 i0VarQ = i5Var.Q();
        if (i0VarQ == null) {
            i0VarQ = new io.sentry.protocol.i0();
            i5Var.f0(i0VarQ);
        }
        if (i0VarQ.i() == null) {
            i0VarQ.o(g());
        }
        if (i0VarQ.j() == null && this.f79742b.isSendDefaultPii()) {
            i0VarQ.p("{{auto}}");
        }
    }

    private <T> T l(q7 q7Var, String str, Class<T> cls) {
        io.sentry.cache.t tVar = this.f79745e;
        if (tVar == null) {
            return null;
        }
        return (T) tVar.B(q7Var, str, cls);
    }

    private boolean m(r6 r6Var) {
        String str = (String) io.sentry.cache.h.b(this.f79742b, "replay-error-sample-rate.json", String.class);
        if (str == null) {
            return false;
        }
        try {
            if (Double.parseDouble(str) >= io.sentry.util.d0.a().c()) {
                return true;
            }
            this.f79742b.getLogger().c(b7.DEBUG, "Not capturing replay for ANR %s due to not being sampled.", r6Var.G());
            return false;
        } catch (Throwable th2) {
            this.f79742b.getLogger().a(b7.ERROR, "Error parsing replay sample rate.", th2);
            return false;
        }
    }

    private void p(i5 i5Var, Object obj) {
        io.sentry.protocol.a aVarD = i5Var.C().d();
        if (aVarD == null) {
            aVarD = new io.sentry.protocol.a();
        }
        aVarD.o(g1.i(this.f79741a));
        aVarD.r(Boolean.valueOf(!i(obj)));
        PackageInfo packageInfoP = g1.p(this.f79741a, this.f79743c);
        if (packageInfoP != null) {
            aVarD.n(packageInfoP.packageName);
        }
        String strJ = i5Var.J() != null ? i5Var.J() : (String) io.sentry.cache.h.b(this.f79742b, "release.json", String.class);
        if (strJ != null) {
            try {
                String strSubstring = strJ.substring(strJ.indexOf(64) + 1, strJ.indexOf(43));
                String strSubstring2 = strJ.substring(strJ.indexOf(43) + 1);
                aVarD.q(strSubstring);
                aVarD.m(strSubstring2);
            } catch (Throwable unused) {
                this.f79742b.getLogger().c(b7.WARNING, "Failed to parse release from scope cache: %s", strJ);
            }
        }
        try {
            g1.b bVarO = o1.k(this.f79741a, this.f79742b).o();
            if (bVarO != null) {
                aVarD.t(Boolean.valueOf(bVarO.b()));
                if (bVarO.a() != null) {
                    aVarD.u(Arrays.asList(bVarO.a()));
                }
            }
        } catch (Throwable th2) {
            this.f79742b.getLogger().a(b7.ERROR, "Error getting split apks info.", th2);
        }
        i5Var.C().o(aVarD);
    }

    private void q(i5 i5Var) {
        List<io.sentry.e> list = (List) l(this.f79742b, "breadcrumbs.json", List.class);
        if (list == null) {
            return;
        }
        if (i5Var.B() == null) {
            i5Var.S(list);
        } else {
            i5Var.B().addAll(list);
        }
    }

    private void r(i5 i5Var) {
        io.sentry.protocol.c cVar = (io.sentry.protocol.c) l(this.f79742b, "contexts.json", io.sentry.protocol.c.class);
        if (cVar == null) {
            return;
        }
        io.sentry.protocol.c cVarC = i5Var.C();
        for (Map.Entry<String, Object> entry : new io.sentry.protocol.c(cVar).b()) {
            Object value = entry.getValue();
            if (!"trace".equals(entry.getKey()) || !(value instanceof k8)) {
                if (!cVarC.a(entry.getKey())) {
                    cVarC.l(entry.getKey(), value);
                }
            }
        }
    }

    private void s(i5 i5Var) {
        io.sentry.protocol.d dVarD = i5Var.D();
        if (dVarD == null) {
            dVarD = new io.sentry.protocol.d();
        }
        if (dVarD.d() == null) {
            dVarD.e(new ArrayList());
        }
        List<DebugImage> listD = dVarD.d();
        if (listD != null) {
            String str = (String) io.sentry.cache.h.b(this.f79742b, "proguard-uuid.json", String.class);
            if (str != null) {
                DebugImage debugImage = new DebugImage();
                debugImage.setType(DebugImage.PROGUARD);
                debugImage.setUuid(str);
                listD.add(debugImage);
            }
            i5Var.T(dVarD);
        }
    }

    private void t(i5 i5Var) {
        if (i5Var.C().e() == null) {
            i5Var.C().q(f());
        }
    }

    private void u(i5 i5Var) {
        String str;
        if (i5Var.E() == null) {
            i5Var.U((String) io.sentry.cache.h.b(this.f79742b, "dist.json", String.class));
        }
        if (i5Var.E() != null || (str = (String) io.sentry.cache.h.b(this.f79742b, "release.json", String.class)) == null) {
            return;
        }
        try {
            i5Var.U(str.substring(str.indexOf(43) + 1));
        } catch (Throwable unused) {
            this.f79742b.getLogger().c(b7.WARNING, "Failed to parse release from scope cache: %s", str);
        }
    }

    private void v(i5 i5Var) {
        if (i5Var.F() == null) {
            String environment = (String) io.sentry.cache.h.b(this.f79742b, "environment.json", String.class);
            if (environment == null) {
                environment = this.f79742b.getEnvironment();
            }
            i5Var.V(environment);
        }
    }

    private void w(r6 r6Var, Object obj) {
        io.sentry.protocol.l lVar = new io.sentry.protocol.l();
        if (((io.sentry.hints.c) obj).e()) {
            lVar.p("AppExitInfo");
        } else {
            lVar.p("HistoricalAppExitInfo");
        }
        String str = "ANR";
        if (i(obj)) {
            str = "Background ANR";
        }
        ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(str, Thread.currentThread());
        io.sentry.protocol.d0 d0VarE = e(r6Var.u0());
        if (d0VarE == null) {
            d0VarE = new io.sentry.protocol.d0();
            d0VarE.y(new io.sentry.protocol.c0());
        }
        r6Var.A0(this.f79744d.f(d0VarE, lVar, applicationNotResponding));
    }

    private void x(i5 i5Var) {
        Map map = (Map) l(this.f79742b, "extras.json", Map.class);
        if (map == null) {
            return;
        }
        if (i5Var.H() == null) {
            i5Var.X(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!i5Var.H().containsKey(entry.getKey())) {
                i5Var.H().put((String) entry.getKey(), entry.getValue());
            }
        }
    }

    private void y(r6 r6Var, Object obj) {
        List<String> list = (List) l(this.f79742b, "fingerprint.json", List.class);
        if (r6Var.q0() == null) {
            r6Var.B0(list);
        }
        boolean zI = i(obj);
        if (r6Var.q0() == null) {
            r6Var.B0(Arrays.asList("{{ default }}", zI ? "background-anr" : "foreground-anr"));
        }
    }

    private void z(r6 r6Var) {
        b7 b7Var = (b7) l(this.f79742b, "level.json", b7.class);
        if (r6Var.r0() == null) {
            r6Var.C0(b7Var);
        }
    }

    @Override // io.sentry.c0
    public r6 n(r6 r6Var, io.sentry.h0 h0Var) {
        Object objG = io.sentry.util.n.g(h0Var);
        if (!(objG instanceof io.sentry.hints.c)) {
            this.f79742b.getLogger().c(b7.WARNING, "The event is not Backfillable, but has been passed to BackfillingEventProcessor, skipping.", new Object[0]);
            return r6Var;
        }
        w(r6Var, objG);
        B(r6Var);
        j(r6Var);
        t(r6Var);
        if (!((io.sentry.hints.c) objG).e()) {
            this.f79742b.getLogger().c(b7.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
            return r6Var;
        }
        d(r6Var, objG);
        b(r6Var, objG);
        I(r6Var);
        return r6Var;
    }

    @Override // io.sentry.c0
    public io.sentry.protocol.e0 o(io.sentry.protocol.e0 e0Var, io.sentry.h0 h0Var) {
        return e0Var;
    }
}
