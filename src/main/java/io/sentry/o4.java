package io.sentry;

import java.io.Closeable;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes9.dex */
public final class o4 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x0 f80803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x0 f80804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x0 f80805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o4 f80806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f80807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i f80808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h f80809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final io.sentry.logger.b f80810h;

    public o4(x0 x0Var, x0 x0Var2, x0 x0Var3, String str) {
        this(x0Var, x0Var2, x0Var3, null, str);
    }

    private x0 F(x0 x0Var, f4 f4Var) {
        if (f4Var != null) {
            try {
                x0 x0VarM479clone = x0Var.m479clone();
                f4Var.a(x0VarM479clone);
                return x0VarM479clone;
            } catch (Throwable th2) {
                getOptions().getLogger().a(b7.ERROR, "Error in the 'ScopeCallback' callback.", th2);
            }
        }
        return x0Var;
    }

    private io.sentry.protocol.x G(r6 r6Var, h0 h0Var, f4 f4Var) {
        io.sentry.protocol.x xVarH = io.sentry.protocol.x.f81078b;
        if (!isEnabled()) {
            getOptions().getLogger().c(b7.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return xVarH;
        }
        if (r6Var == null) {
            getOptions().getLogger().c(b7.WARNING, "captureEvent called with null parameter.", new Object[0]);
            return xVarH;
        }
        try {
            p(r6Var);
            xVarH = I().h(r6Var, F(J(), f4Var), h0Var);
            M(xVarH);
            return xVarH;
        } catch (Throwable th2) {
            getOptions().getLogger().a(b7.ERROR, "Error while capturing event with id: " + r6Var.G(), th2);
            return xVarH;
        }
    }

    private i1 H(z8 z8Var, b9 b9Var) {
        i1 i1VarA;
        io.sentry.util.y.c(z8Var, "transactionContext is required");
        z8Var.t(b9Var.a());
        if (!isEnabled()) {
            getOptions().getLogger().c(b7.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            i1VarA = e3.s();
        } else if (io.sentry.util.e0.b(getOptions().getIgnoredSpanOrigins(), z8Var.g())) {
            getOptions().getLogger().c(b7.DEBUG, "Returning no-op for span origin %s as the SDK has been configured to ignore it", z8Var.g());
            i1VarA = e3.s();
        } else if (!getOptions().getInstrumenter().equals(z8Var.e())) {
            getOptions().getLogger().c(b7.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", z8Var.e(), getOptions().getInstrumenter());
            i1VarA = e3.s();
        } else if (getOptions().isTracingEnabled()) {
            Double dK = K(z8Var);
            b9Var.j();
            y8 y8VarA = getOptions().getInternalTracesSampler().a(new c4(z8Var, null, dK, null));
            z8Var.u(y8VarA);
            h1 h1VarM = b9Var.m();
            if (h1VarM == null) {
                h1VarM = getOptions().getSpanFactory();
            }
            if (y8VarA.e().booleanValue() && getOptions().isContinuousProfilingEnabled()) {
                s3 profileLifecycle = getOptions().getProfileLifecycle();
                s3 s3Var = s3.TRACE;
                if (profileLifecycle == s3Var && z8Var.j().equals(io.sentry.protocol.x.f81078b)) {
                    getOptions().getContinuousProfiler().b(s3Var, getOptions().getInternalTracesSampler());
                }
            }
            i1VarA = h1VarM.a(z8Var, this, b9Var, this.f80808f);
            if (y8VarA.e().booleanValue() && y8VarA.b().booleanValue()) {
                j1 transactionProfiler = getOptions().getTransactionProfiler();
                if (!transactionProfiler.isRunning()) {
                    transactionProfiler.start();
                    transactionProfiler.a(i1VarA);
                } else if (b9Var.o()) {
                    transactionProfiler.a(i1VarA);
                }
            }
        } else {
            getOptions().getLogger().c(b7.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            i1VarA = e3.s();
        }
        if (b9Var.p()) {
            i1VarA.makeCurrent();
        }
        return i1VarA;
    }

    private Double K(z8 z8Var) {
        Double dI;
        d dVarB = z8Var.b();
        return (dVarB == null || (dI = dVarB.i()) == null) ? J().K().c() : dI;
    }

    private void M(io.sentry.protocol.x xVar) {
        J().P(xVar);
    }

    private static void N(q7 q7Var) {
        io.sentry.util.y.c(q7Var, "SentryOptions is required.");
        if (q7Var.getDsn() == null || q7Var.getDsn().isEmpty()) {
            throw new IllegalArgumentException("Scopes requires a DSN to be instantiated. Considering using the NoOpScopes if no DSN is available.");
        }
    }

    private void p(r6 r6Var) {
        J().B(r6Var);
    }

    @Override // io.sentry.z0
    public void A(h4 h4Var, f4 f4Var) {
        if (!isEnabled()) {
            getOptions().getLogger().c(b7.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            f4Var.a(this.f80809g.Q(h4Var));
        } catch (Throwable th2) {
            getOptions().getLogger().a(b7.ERROR, "Error in the 'configureScope' callback.", th2);
        }
    }

    @Override // io.sentry.z0
    public x0 B() {
        return this.f80805c;
    }

    @Override // io.sentry.z0
    public io.sentry.protocol.x C(q3 q3Var) {
        io.sentry.util.y.c(q3Var, "profilingContinuousData is required");
        io.sentry.protocol.x xVar = io.sentry.protocol.x.f81078b;
        if (isEnabled()) {
            try {
                return I().c(q3Var, L());
            } catch (Throwable th2) {
                getOptions().getLogger().a(b7.ERROR, "Error while capturing profile chunk with id: " + q3Var.n(), th2);
            }
        } else {
            getOptions().getLogger().c(b7.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
        }
        return xVar;
    }

    @Override // io.sentry.z0
    public io.sentry.protocol.x D(r6 r6Var, h0 h0Var) {
        return G(r6Var, h0Var, null);
    }

    @Override // io.sentry.z0
    public z0 E(String str) {
        return new o4(this.f80803a.m479clone(), this.f80804b.m479clone(), this.f80805c, this, str);
    }

    public b1 I() {
        return J().A();
    }

    public x0 J() {
        return this.f80809g;
    }

    public x0 L() {
        return this.f80803a;
    }

    @Override // io.sentry.z0
    public void a(final boolean z11) {
        if (!isEnabled()) {
            getOptions().getLogger().c(b7.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (o1 o1Var : getOptions().getIntegrations()) {
                if (o1Var instanceof Closeable) {
                    try {
                        ((Closeable) o1Var).close();
                    } catch (Throwable th2) {
                        getOptions().getLogger().c(b7.WARNING, "Failed to close the integration {}.", o1Var, th2);
                    }
                }
            }
            s(new f4() { // from class: io.sentry.i4
                @Override // io.sentry.f4
                public final void a(x0 x0Var) {
                    x0Var.clear();
                }
            });
            A(h4.ISOLATION, new f4() { // from class: io.sentry.j4
                @Override // io.sentry.f4
                public final void a(x0 x0Var) {
                    x0Var.clear();
                }
            });
            getOptions().getBackpressureMonitor().close();
            getOptions().getTransactionProfiler().close();
            getOptions().getContinuousProfiler().a(true);
            getOptions().getCompositePerformanceCollector().close();
            getOptions().getConnectionStatusProvider().close();
            final c1 executorService = getOptions().getExecutorService();
            if (z11) {
                try {
                    executorService.submit(new Runnable() { // from class: io.sentry.k4
                        @Override // java.lang.Runnable
                        public final void run() {
                            executorService.c(this.f80712a.getOptions().getShutdownTimeoutMillis());
                        }
                    });
                } catch (RejectedExecutionException e11) {
                    getOptions().getLogger().a(b7.WARNING, "Failed to submit executor service shutdown task during restart. Shutting down synchronously.", e11);
                    executorService.c(getOptions().getShutdownTimeoutMillis());
                }
            } else {
                executorService.c(getOptions().getShutdownTimeoutMillis());
            }
            A(h4.CURRENT, new f4() { // from class: io.sentry.l4
                @Override // io.sentry.f4
                public final void a(x0 x0Var) {
                    x0Var.A().a(z11);
                }
            });
            A(h4.ISOLATION, new f4() { // from class: io.sentry.m4
                @Override // io.sentry.f4
                public final void a(x0 x0Var) {
                    x0Var.A().a(z11);
                }
            });
            A(h4.GLOBAL, new f4() { // from class: io.sentry.n4
                @Override // io.sentry.f4
                public final void a(x0 x0Var) {
                    x0Var.A().a(z11);
                }
            });
        } catch (Throwable th3) {
            getOptions().getLogger().a(b7.ERROR, "Error while closing the Scopes.", th3);
        }
    }

    @Override // io.sentry.z0
    public void b(long j11) {
        if (!isEnabled()) {
            getOptions().getLogger().c(b7.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            I().b(j11);
        } catch (Throwable th2) {
            getOptions().getLogger().a(b7.ERROR, "Error in the 'client.flush'.", th2);
        }
    }

    @Override // io.sentry.z0
    public void c(e eVar) {
        d(eVar, new h0());
    }

    @Override // io.sentry.z0
    public void d(e eVar, h0 h0Var) {
        if (!isEnabled()) {
            getOptions().getLogger().c(b7.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        } else if (eVar == null) {
            getOptions().getLogger().c(b7.WARNING, "addBreadcrumb called with null parameter.", new Object[0]);
        } else {
            J().d(eVar, h0Var);
        }
    }

    @Override // io.sentry.z0
    public void e(Throwable th2, g1 g1Var, String str) {
        J().e(th2, g1Var, str);
    }

    @Override // io.sentry.z0
    public i1 f() {
        if (isEnabled()) {
            return J().f();
        }
        getOptions().getLogger().c(b7.WARNING, "Instance is disabled and this 'getTransaction' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.z0
    public q7 getOptions() {
        return this.f80809g.getOptions();
    }

    @Override // io.sentry.z0
    public void h() {
        if (!isEnabled()) {
            getOptions().getLogger().c(b7.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        d4.d dVarH = J().h();
        if (dVarH == null) {
            getOptions().getLogger().c(b7.WARNING, "Session could not be started.", new Object[0]);
            return;
        }
        if (dVarH.b() != null) {
            I().f(dVarH.b(), io.sentry.util.n.e(new io.sentry.hints.m()));
        }
        I().f(dVarH.a(), io.sentry.util.n.e(new io.sentry.hints.o()));
    }

    @Override // io.sentry.z0
    public boolean isEnabled() {
        return I().isEnabled();
    }

    @Override // io.sentry.z0
    public boolean k() {
        return I().k();
    }

    @Override // io.sentry.z0
    public void l() {
        if (!isEnabled()) {
            getOptions().getLogger().c(b7.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        f8 f8VarL = J().l();
        if (f8VarL != null) {
            I().f(f8VarL, io.sentry.util.n.e(new io.sentry.hints.m()));
        }
    }

    @Override // io.sentry.z0
    public io.sentry.transport.a0 q() {
        return I().q();
    }

    @Override // io.sentry.z0
    public io.sentry.protocol.x r(p5 p5Var, h0 h0Var) {
        io.sentry.util.y.c(p5Var, "SentryEnvelope is required.");
        io.sentry.protocol.x xVar = io.sentry.protocol.x.f81078b;
        if (isEnabled()) {
            try {
                io.sentry.protocol.x xVarR = I().r(p5Var, h0Var);
                if (xVarR != null) {
                    return xVarR;
                }
            } catch (Throwable th2) {
                getOptions().getLogger().a(b7.ERROR, "Error while capturing envelope.", th2);
            }
        } else {
            getOptions().getLogger().c(b7.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
        }
        return xVar;
    }

    @Override // io.sentry.z0
    public io.sentry.protocol.x t(r7 r7Var, h0 h0Var) {
        io.sentry.protocol.x xVar = io.sentry.protocol.x.f81078b;
        if (isEnabled()) {
            try {
                return I().d(r7Var, J(), h0Var);
            } catch (Throwable th2) {
                getOptions().getLogger().a(b7.ERROR, "Error while capturing replay", th2);
            }
        } else {
            getOptions().getLogger().c(b7.WARNING, "Instance is disabled and this 'captureReplay' call is a no-op.", new Object[0]);
        }
        return xVar;
    }

    @Override // io.sentry.z0
    public i1 v(z8 z8Var, b9 b9Var) {
        return H(z8Var, b9Var);
    }

    @Override // io.sentry.z0
    public Boolean w() {
        return m5.a().b(getOptions().getCacheDirPath(), !getOptions().isEnableAutoSessionTracking());
    }

    @Override // io.sentry.z0
    public io.sentry.protocol.x x(io.sentry.protocol.e0 e0Var, w8 w8Var, h0 h0Var, u3 u3Var) {
        io.sentry.protocol.e0 e0Var2;
        io.sentry.util.y.c(e0Var, "transaction is required");
        io.sentry.protocol.x xVar = io.sentry.protocol.x.f81078b;
        if (!isEnabled()) {
            getOptions().getLogger().c(b7.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
        } else if (!e0Var.q0()) {
            getOptions().getLogger().c(b7.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", e0Var.G());
        } else if (Boolean.TRUE.equals(Boolean.valueOf(e0Var.r0()))) {
            try {
                e0Var2 = e0Var;
                try {
                    return I().e(e0Var2, w8Var, J(), h0Var, u3Var);
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    getOptions().getLogger().a(b7.ERROR, "Error while capturing transaction with id: " + e0Var2.G(), th3);
                    return xVar;
                }
            } catch (Throwable th4) {
                th = th4;
                e0Var2 = e0Var;
            }
        } else {
            getOptions().getLogger().c(b7.DEBUG, "Transaction %s was dropped due to sampling decision.", e0Var.G());
            if (getOptions().getBackpressureMonitor().a() > 0) {
                io.sentry.clientreport.h clientReportRecorder = getOptions().getClientReportRecorder();
                io.sentry.clientreport.f fVar = io.sentry.clientreport.f.BACKPRESSURE;
                clientReportRecorder.a(fVar, k.Transaction);
                getOptions().getClientReportRecorder().b(fVar, k.Span, e0Var.o0().size() + 1);
            } else {
                io.sentry.clientreport.h clientReportRecorder2 = getOptions().getClientReportRecorder();
                io.sentry.clientreport.f fVar2 = io.sentry.clientreport.f.SAMPLE_RATE;
                clientReportRecorder2.a(fVar2, k.Transaction);
                getOptions().getClientReportRecorder().b(fVar2, k.Span, e0Var.o0().size() + 1);
            }
        }
        return xVar;
    }

    private o4(x0 x0Var, x0 x0Var2, x0 x0Var3, o4 o4Var, String str) {
        this.f80809g = new h(x0Var3, x0Var2, x0Var);
        this.f80803a = x0Var;
        this.f80804b = x0Var2;
        this.f80805c = x0Var3;
        this.f80806d = o4Var;
        this.f80807e = str;
        q7 options = getOptions();
        N(options);
        this.f80808f = options.getCompositePerformanceCollector();
        this.f80810h = new io.sentry.logger.e(this);
    }

    @Override // io.sentry.z0
    @Deprecated
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public r0 m482clone() {
        if (!isEnabled()) {
            getOptions().getLogger().c(b7.WARNING, "Disabled Scopes cloned.", new Object[0]);
        }
        return new l0(E("scopes clone"));
    }
}
