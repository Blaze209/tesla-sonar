package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.ILogger;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.b7;
import io.sentry.f4;
import io.sentry.f5;
import io.sentry.f8;
import io.sentry.k3;
import io.sentry.q7;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f79615a = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final io.sentry.util.a f79616b = new io.sentry.util.a();

    public static /* synthetic */ void a(SentryAndroidOptions sentryAndroidOptions) {
    }

    public static /* synthetic */ void b(AtomicBoolean atomicBoolean, io.sentry.x0 x0Var) {
        f8 f8VarX = x0Var.x();
        if (f8VarX == null || f8VarX.k() == null) {
            return;
        }
        atomicBoolean.set(true);
    }

    public static /* synthetic */ void c(ILogger iLogger, Context context, f5.a aVar, SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.util.u uVar = new io.sentry.util.u();
        boolean zD = uVar.d("timber.log.Timber", sentryAndroidOptions);
        boolean z11 = true;
        if (!uVar.d("androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks", sentryAndroidOptions) || !uVar.d("io.sentry.android.fragment.FragmentLifecycleIntegration", sentryAndroidOptions)) {
            z11 = false;
        }
        boolean z12 = zD && uVar.d("io.sentry.android.timber.SentryTimberIntegration", sentryAndroidOptions);
        boolean zD2 = uVar.d("io.sentry.android.replay.ReplayIntegration", sentryAndroidOptions);
        boolean zD3 = uVar.d("io.sentry.android.distribution.DistributionIntegration", sentryAndroidOptions);
        z0 z0Var = new z0(iLogger);
        io.sentry.util.u uVar2 = new io.sentry.util.u();
        i iVar = new i(uVar2, sentryAndroidOptions);
        i0.j(sentryAndroidOptions, context, iLogger, z0Var);
        i0.i(context, sentryAndroidOptions, z0Var, uVar2, iVar, z11, z12, zD2, zD3);
        boolean z13 = z12;
        boolean z14 = z11;
        try {
            aVar.a(sentryAndroidOptions);
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().a(b7.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th2);
        }
        io.sentry.android.core.performance.h hVarQ = io.sentry.android.core.performance.h.q();
        if (sentryAndroidOptions.isEnablePerformanceV2() && z0Var.d() >= 24) {
            io.sentry.android.core.performance.i iVarL = hVarQ.l();
            if (iVarL.k()) {
                iVarL.p(Process.getStartUptimeMillis());
            }
        }
        if (context.getApplicationContext() instanceof Application) {
            hVarQ.v((Application) context.getApplicationContext());
        }
        io.sentry.android.core.performance.i iVarR = hVarQ.r();
        if (iVarR.k()) {
            iVarR.p(f79615a);
        }
        i0.h(sentryAndroidOptions, context, z0Var, uVar2, iVar, zD2);
        d(sentryAndroidOptions, z14, z13);
    }

    private static void d(q7 q7Var, boolean z11, boolean z12) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (io.sentry.o1 o1Var : q7Var.getIntegrations()) {
            if (z11 && (o1Var instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(o1Var);
            }
            if (z12 && (o1Var instanceof SentryTimberIntegration)) {
                arrayList.add(o1Var);
            }
            if (o1Var instanceof SystemEventsBreadcrumbsIntegration) {
                arrayList3.add(o1Var);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i11 = 0; i11 < arrayList2.size() - 1; i11++) {
                q7Var.getIntegrations().remove((io.sentry.o1) arrayList2.get(i11));
            }
        }
        if (arrayList.size() > 1) {
            for (int i12 = 0; i12 < arrayList.size() - 1; i12++) {
                q7Var.getIntegrations().remove((io.sentry.o1) arrayList.get(i12));
            }
        }
        if (arrayList3.size() > 1) {
            for (int i13 = 0; i13 < arrayList3.size() - 1; i13++) {
                q7Var.getIntegrations().remove((io.sentry.o1) arrayList3.get(i13));
            }
        }
    }

    public static void e(Context context, ILogger iLogger) {
        f(context, iLogger, new f5.a() { // from class: io.sentry.android.core.j2
            @Override // io.sentry.f5.a
            public final void a(q7 q7Var) {
                m2.a((SentryAndroidOptions) q7Var);
            }
        });
    }

    @SuppressLint({"NewApi"})
    public static void f(final Context context, final ILogger iLogger, final f5.a<SentryAndroidOptions> aVar) {
        try {
            io.sentry.d1 d1VarA = f79616b.a();
            try {
                f5.w(k3.a(SentryAndroidOptions.class), new f5.a() { // from class: io.sentry.android.core.k2
                    @Override // io.sentry.f5.a
                    public final void a(q7 q7Var) {
                        m2.c(iLogger, context, aVar, (SentryAndroidOptions) q7Var);
                    }
                }, true);
                io.sentry.z0 z0VarR = f5.r();
                if (g1.s()) {
                    if (z0VarR.getOptions().isEnableAutoSessionTracking()) {
                        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        z0VarR.s(new f4() { // from class: io.sentry.android.core.l2
                            @Override // io.sentry.f4
                            public final void a(io.sentry.x0 x0Var) {
                                m2.b(atomicBoolean, x0Var);
                            }
                        });
                        if (!atomicBoolean.get()) {
                            z0VarR.h();
                        }
                    }
                    z0VarR.getOptions().getReplayController().start();
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
        } catch (IllegalAccessException e11) {
            iLogger.a(b7.FATAL, "Fatal error during SentryAndroid.init(...)", e11);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e11);
        } catch (InstantiationException e12) {
            iLogger.a(b7.FATAL, "Fatal error during SentryAndroid.init(...)", e12);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e12);
        } catch (NoSuchMethodException e13) {
            iLogger.a(b7.FATAL, "Fatal error during SentryAndroid.init(...)", e13);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e13);
        } catch (InvocationTargetException e14) {
            iLogger.a(b7.FATAL, "Fatal error during SentryAndroid.init(...)", e14);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e14);
        }
    }

    public static void g(Context context, f5.a<SentryAndroidOptions> aVar) {
        f(context, new z(), aVar);
    }
}
