package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.sentry.ILogger;
import io.sentry.b7;
import io.sentry.f4;
import io.sentry.f8;
import io.sentry.h4;
import io.sentry.p4;
import io.sentry.p5;
import io.sentry.p6;
import io.sentry.q7;
import io.sentry.r6;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class y1 {
    public static /* synthetic */ void c(f8.b bVar, boolean z11, AtomicReference atomicReference, q7 q7Var, io.sentry.x0 x0Var) {
        f8 f8VarX = x0Var.x();
        if (f8VarX == null) {
            q7Var.getLogger().c(b7.INFO, "Session is null on updateSession", new Object[0]);
        } else if (f8VarX.q(bVar, null, z11, null)) {
            if (f8VarX.l() == f8.b.Crashed) {
                f8VarX.c();
                x0Var.M();
            }
            atomicReference.set(f8VarX);
        }
    }

    private static void e(io.sentry.android.core.performance.i iVar, List<Map<String, Object>> list) {
        if (iVar.k()) {
            p4.g().getOptions().getLogger().c(b7.WARNING, "Can not convert not-started TimeSpan to Map for Hybrid SDKs.", new Object[0]);
            return;
        }
        if (iVar.l()) {
            p4.g().getOptions().getLogger().c(b7.WARNING, "Can not convert not-stopped TimeSpan to Map for Hybrid SDKs.", new Object[0]);
            return;
        }
        HashMap map = new HashMap();
        map.put("description", iVar.b());
        map.put("start_timestamp_ms", Long.valueOf(iVar.h()));
        map.put("end_timestamp_ms", Long.valueOf(iVar.e()));
        list.add(map);
    }

    public static io.sentry.protocol.x f(byte[] bArr, boolean z11) {
        p4 p4VarG = p4.g();
        q7 options = p4VarG.getOptions();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                io.sentry.e1 serializer = options.getSerializer();
                p5 p5VarA = options.getEnvelopeReader().a(byteArrayInputStream);
                if (p5VarA == null) {
                    byteArrayInputStream.close();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                f8.b bVar = null;
                boolean z12 = false;
                for (p6 p6Var : p5VarA.c()) {
                    arrayList.add(p6Var);
                    r6 r6VarJ = p6Var.J(serializer);
                    if (r6VarJ != null) {
                        if (r6VarJ.y0()) {
                            bVar = f8.b.Crashed;
                        }
                        if (r6VarJ.y0() || r6VarJ.z0()) {
                            z12 = true;
                        }
                    }
                }
                f8 f8VarL = l(p4VarG, options, bVar, z12);
                if (f8VarL != null) {
                    arrayList.add(p6.G(serializer, f8VarL));
                    h(options, (z11 && p4VarG.getOptions().getThreadChecker().a()) ? false : true);
                    if (z11) {
                        p4VarG.h();
                    }
                }
                io.sentry.protocol.x xVarU = p4VarG.u(new p5(p5VarA.b(), arrayList));
                byteArrayInputStream.close();
                return xVarU;
            } catch (Throwable th2) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            options.getLogger().a(b7.ERROR, "Failed to capture envelope", th4);
            return null;
        }
        options.getLogger().a(b7.ERROR, "Failed to capture envelope", th4);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(q7 q7Var) {
        String cacheDirPath = q7Var.getCacheDirPath();
        if (cacheDirPath == null) {
            q7Var.getLogger().c(b7.INFO, "Cache dir is not set, not deleting the current session.", new Object[0]);
        } else if (!q7Var.isEnableAutoSessionTracking()) {
            q7Var.getLogger().c(b7.DEBUG, "Session tracking is disabled, bailing from deleting current session file.", new Object[0]);
        } else {
            if (io.sentry.cache.f.t(cacheDirPath).delete()) {
                return;
            }
            q7Var.getLogger().c(b7.WARNING, "Failed to delete the current session file.", new Object[0]);
        }
    }

    private static void h(final q7 q7Var, boolean z11) {
        if (z11) {
            g(q7Var);
            return;
        }
        try {
            q7Var.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.x1
                @Override // java.lang.Runnable
                public final void run() {
                    y1.g(q7Var);
                }
            });
        } catch (Throwable th2) {
            q7Var.getLogger().a(b7.WARNING, "Submission of deletion of the current session file rejected.", th2);
        }
    }

    public static Map<String, Object> i() {
        io.sentry.android.core.performance.h hVarQ = io.sentry.android.core.performance.h.q();
        ArrayList arrayList = new ArrayList();
        e(hVarQ.g(), arrayList);
        e(hVarQ.o(), arrayList);
        Iterator<io.sentry.android.core.performance.i> it = hVarQ.p().iterator();
        while (it.hasNext()) {
            e(it.next(), arrayList);
        }
        for (io.sentry.android.core.performance.c cVar : hVarQ.h()) {
            e(cVar.b(), arrayList);
            e(cVar.c(), arrayList);
        }
        HashMap map = new HashMap();
        map.put("spans", arrayList);
        map.put("type", hVarQ.n().toString().toLowerCase(Locale.ROOT));
        if (hVarQ.l().m()) {
            map.put("app_start_timestamp_ms", Long.valueOf(hVarQ.l().h()));
        }
        return map;
    }

    public static io.sentry.x0 j() {
        final AtomicReference atomicReference = new AtomicReference();
        p4.g().A(h4.COMBINED, new f4() { // from class: io.sentry.android.core.v1
            @Override // io.sentry.f4
            public final void a(io.sentry.x0 x0Var) {
                atomicReference.set(x0Var.m484clone());
            }
        });
        return (io.sentry.x0) atomicReference.get();
    }

    public static Map<String, Object> k(final Context context, SentryAndroidOptions sentryAndroidOptions, io.sentry.x0 x0Var) {
        HashMap map = new HashMap();
        if (x0Var != null) {
            try {
                ILogger logger = sentryAndroidOptions.getLogger();
                io.sentry.util.x xVar = new io.sentry.util.x(map);
                o1 o1VarK = o1.k(context, sentryAndroidOptions);
                x0Var.r().q(o1VarK.c(true, true));
                x0Var.r().u(o1VarK.l());
                io.sentry.protocol.i0 i0VarT = x0Var.t();
                if (i0VarT == null) {
                    i0VarT = new io.sentry.protocol.i0();
                    x0Var.j(i0VarT);
                }
                if (i0VarT.i() == null) {
                    try {
                        i0VarT.o((String) sentryAndroidOptions.getRuntimeManager().a(new io.sentry.util.runtime.a.InterfaceC1708a() { // from class: io.sentry.android.core.u1
                            @Override // io.sentry.util.runtime.a.InterfaceC1708a
                            public final Object run() {
                                return t1.a(context);
                            }
                        }));
                    } catch (RuntimeException e11) {
                        logger.a(b7.ERROR, "Could not retrieve installation ID", e11);
                    }
                }
                io.sentry.protocol.a aVarD = x0Var.r().d();
                if (aVarD == null) {
                    aVarD = new io.sentry.protocol.a();
                }
                aVarD.o(g1.i(context));
                io.sentry.android.core.performance.i iVarM = io.sentry.android.core.performance.h.q().m(sentryAndroidOptions);
                if (iVarM.m()) {
                    aVarD.p(io.sentry.l.o(iVarM.g()));
                }
                z0 z0Var = new z0(sentryAndroidOptions.getLogger());
                PackageInfo packageInfoO = g1.o(context, 4096, sentryAndroidOptions.getLogger(), z0Var);
                if (packageInfoO != null) {
                    g1.x(packageInfoO, z0Var, o1VarK, aVarD);
                }
                x0Var.r().o(aVarD);
                xVar.N("user").V(logger, x0Var.t());
                xVar.N("contexts").V(logger, x0Var.r());
                xVar.N("tags").V(logger, x0Var.p());
                xVar.N("extras").V(logger, x0Var.getExtras());
                xVar.N("fingerprint").V(logger, x0Var.H());
                xVar.N("level").V(logger, x0Var.getLevel());
                xVar.N("breadcrumbs").V(logger, x0Var.n());
            } catch (Throwable th2) {
                sentryAndroidOptions.getLogger().a(b7.ERROR, "Could not serialize scope.", th2);
                return new HashMap();
            }
        }
        return map;
    }

    private static f8 l(io.sentry.z0 z0Var, final q7 q7Var, final f8.b bVar, final boolean z11) {
        final AtomicReference atomicReference = new AtomicReference();
        z0Var.s(new f4() { // from class: io.sentry.android.core.w1
            @Override // io.sentry.f4
            public final void a(io.sentry.x0 x0Var) {
                y1.c(bVar, z11, atomicReference, q7Var, x0Var);
            }
        });
        return (f8) atomicReference.get();
    }
}
