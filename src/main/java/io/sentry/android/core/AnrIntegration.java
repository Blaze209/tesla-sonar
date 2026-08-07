package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import io.sentry.ILogger;
import io.sentry.b7;
import io.sentry.exception.ExceptionMechanismException;
import io.sentry.q7;
import io.sentry.r6;
import java.io.Closeable;

/* JADX INFO: loaded from: classes9.dex */
public final class AnrIntegration implements io.sentry.o1, Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static c f79253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final io.sentry.util.a f79254f = new io.sentry.util.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f79255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f79256b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.util.a f79257c = new io.sentry.util.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private q7 f79258d;

    static final class a implements io.sentry.hints.a, io.sentry.hints.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f79259a;

        a(boolean z11) {
            this.f79259a = z11;
        }

        @Override // io.sentry.hints.a
        public Long b() {
            return null;
        }

        @Override // io.sentry.hints.a
        public boolean c() {
            return true;
        }

        @Override // io.sentry.hints.a
        public String d() {
            return this.f79259a ? "anr_background" : "anr_foreground";
        }
    }

    public AnrIntegration(Context context) {
        this.f79255a = g1.g(context);
    }

    private void C(final io.sentry.z0 z0Var, final SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.d1 d1VarA = f79254f.a();
        try {
            if (f79253e == null) {
                ILogger logger = sentryAndroidOptions.getLogger();
                b7 b7Var = b7.DEBUG;
                logger.c(b7Var, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                c cVar = new c(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new c.a() { // from class: io.sentry.android.core.q0
                    @Override // io.sentry.android.core.c.a
                    public final void a(ApplicationNotResponding applicationNotResponding) {
                        this.f79701a.B(z0Var, sentryAndroidOptions, applicationNotResponding);
                    }
                }, sentryAndroidOptions.getLogger(), this.f79255a);
                f79253e = cVar;
                cVar.start();
                sentryAndroidOptions.getLogger().c(b7Var, "AnrIntegration installed.", new Object[0]);
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

    public static /* synthetic */ void c(AnrIntegration anrIntegration, io.sentry.z0 z0Var, SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.d1 d1VarA = anrIntegration.f79257c.a();
        try {
            if (!anrIntegration.f79256b) {
                anrIntegration.C(z0Var, sentryAndroidOptions);
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

    private Throwable p(boolean z11, SentryAndroidOptions sentryAndroidOptions, ApplicationNotResponding applicationNotResponding) {
        String str = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
        if (z11) {
            str = "Background " + str;
        }
        ApplicationNotResponding applicationNotResponding2 = new ApplicationNotResponding(str, applicationNotResponding.a());
        io.sentry.protocol.l lVar = new io.sentry.protocol.l();
        lVar.p("ANR");
        return new ExceptionMechanismException(lVar, applicationNotResponding2, applicationNotResponding2.a(), true);
    }

    private void t(final io.sentry.z0 z0Var, final SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.getLogger().c(b7.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            io.sentry.util.p.a("Anr");
            try {
                sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.p0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnrIntegration.c(this.f79660a, z0Var, sentryAndroidOptions);
                    }
                });
            } catch (Throwable th2) {
                sentryAndroidOptions.getLogger().a(b7.DEBUG, "Failed to start AnrIntegration on executor thread.", th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B(io.sentry.z0 z0Var, SentryAndroidOptions sentryAndroidOptions, ApplicationNotResponding applicationNotResponding) {
        sentryAndroidOptions.getLogger().c(b7.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
        boolean zEquals = Boolean.TRUE.equals(y0.C().H());
        r6 r6Var = new r6(p(zEquals, sentryAndroidOptions, applicationNotResponding));
        r6Var.C0(b7.ERROR);
        z0Var.D(r6Var, io.sentry.util.n.e(new a(zEquals)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        io.sentry.d1 d1VarA = this.f79257c.a();
        try {
            this.f79256b = true;
            if (d1VarA != null) {
                d1VarA.close();
            }
            d1VarA = f79254f.a();
            try {
                c cVar = f79253e;
                if (cVar != null) {
                    cVar.interrupt();
                    f79253e = null;
                    q7 q7Var = this.f79258d;
                    if (q7Var != null) {
                        q7Var.getLogger().c(b7.DEBUG, "AnrIntegration removed.", new Object[0]);
                    }
                }
                if (d1VarA != null) {
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
        } finally {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th4) {
                    th.addSuppressed(th4);
                }
            }
        }
    }

    @Override // io.sentry.o1
    public final void n(io.sentry.z0 z0Var, q7 q7Var) {
        this.f79258d = (q7) io.sentry.util.y.c(q7Var, "SentryOptions is required");
        t(z0Var, (SentryAndroidOptions) q7Var);
    }
}
