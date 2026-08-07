package io.sentry.android.core;

import io.sentry.b7;
import io.sentry.q7;
import io.sentry.s4;
import io.sentry.v4;
import java.io.Closeable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
final class SendCachedEnvelopeIntegration implements io.sentry.o1, io.sentry.m0.b, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v4 f79309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.util.r<Boolean> f79310b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private io.sentry.m0 f79312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private io.sentry.z0 f79313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SentryAndroidOptions f79314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private s4 f79315g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f79311c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f79316h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f79317i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final io.sentry.util.a f79318j = new io.sentry.util.a();

    public SendCachedEnvelopeIntegration(v4 v4Var, io.sentry.util.r<Boolean> rVar) {
        this.f79309a = (v4) io.sentry.util.y.c(v4Var, "SendFireAndForgetFactory is required");
        this.f79310b = rVar;
    }

    public static /* synthetic */ void c(SendCachedEnvelopeIntegration sendCachedEnvelopeIntegration, SentryAndroidOptions sentryAndroidOptions, io.sentry.z0 z0Var) {
        sendCachedEnvelopeIntegration.getClass();
        try {
            if (sendCachedEnvelopeIntegration.f79317i.get()) {
                sentryAndroidOptions.getLogger().c(b7.INFO, "SendCachedEnvelopeIntegration, not trying to send after closing.", new Object[0]);
                return;
            }
            if (!sendCachedEnvelopeIntegration.f79316h.getAndSet(true)) {
                io.sentry.m0 connectionStatusProvider = sentryAndroidOptions.getConnectionStatusProvider();
                sendCachedEnvelopeIntegration.f79312d = connectionStatusProvider;
                connectionStatusProvider.s3(sendCachedEnvelopeIntegration);
                sendCachedEnvelopeIntegration.f79315g = sendCachedEnvelopeIntegration.f79309a.d(z0Var, sentryAndroidOptions);
            }
            io.sentry.m0 m0Var = sendCachedEnvelopeIntegration.f79312d;
            if (m0Var != null && m0Var.q0() == io.sentry.m0.a.DISCONNECTED) {
                sentryAndroidOptions.getLogger().c(b7.INFO, "SendCachedEnvelopeIntegration, no connection.", new Object[0]);
                return;
            }
            io.sentry.transport.a0 a0VarQ = z0Var.q();
            if (a0VarQ != null && a0VarQ.I(io.sentry.k.All)) {
                sentryAndroidOptions.getLogger().c(b7.INFO, "SendCachedEnvelopeIntegration, rate limiting active.", new Object[0]);
                return;
            }
            s4 s4Var = sendCachedEnvelopeIntegration.f79315g;
            if (s4Var == null) {
                sentryAndroidOptions.getLogger().c(b7.ERROR, "SendCachedEnvelopeIntegration factory is null.", new Object[0]);
            } else {
                s4Var.a();
            }
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().a(b7.ERROR, "Failed trying to send cached events.", th2);
        }
    }

    private void o(final io.sentry.z0 z0Var, final SentryAndroidOptions sentryAndroidOptions) {
        try {
            io.sentry.d1 d1VarA = this.f79318j.a();
            try {
                Future<?> futureSubmit = sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.i2
                    @Override // java.lang.Runnable
                    public final void run() {
                        SendCachedEnvelopeIntegration.c(this.f79423a, sentryAndroidOptions, z0Var);
                    }
                });
                if (this.f79310b.a().booleanValue() && this.f79311c.compareAndSet(false, true)) {
                    sentryAndroidOptions.getLogger().c(b7.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                    try {
                        futureSubmit.get(sentryAndroidOptions.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                    } catch (TimeoutException unused) {
                        sentryAndroidOptions.getLogger().c(b7.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                    }
                }
                sentryAndroidOptions.getLogger().c(b7.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
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
        } catch (RejectedExecutionException e11) {
            sentryAndroidOptions.getLogger().a(b7.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e11);
        } catch (Throwable th4) {
            sentryAndroidOptions.getLogger().a(b7.ERROR, "Failed to call the executor. Cached events will not be sent", th4);
        }
    }

    @Override // io.sentry.m0.b
    public void B(io.sentry.m0.a aVar) {
        SentryAndroidOptions sentryAndroidOptions;
        io.sentry.z0 z0Var = this.f79313e;
        if (z0Var == null || (sentryAndroidOptions = this.f79314f) == null || aVar == io.sentry.m0.a.DISCONNECTED) {
            return;
        }
        o(z0Var, sentryAndroidOptions);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f79317i.set(true);
        io.sentry.m0 m0Var = this.f79312d;
        if (m0Var != null) {
            m0Var.z1(this);
        }
    }

    @Override // io.sentry.o1
    public void n(io.sentry.z0 z0Var, q7 q7Var) {
        this.f79313e = (io.sentry.z0) io.sentry.util.y.c(z0Var, "Scopes are required");
        this.f79314f = (SentryAndroidOptions) io.sentry.util.y.c(q7Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) q7Var : null, "SentryAndroidOptions is required");
        if (!this.f79309a.b(q7Var.getCacheDirPath(), q7Var.getLogger())) {
            q7Var.getLogger().c(b7.ERROR, "No cache dir path is defined in options.", new Object[0]);
        } else {
            io.sentry.util.p.a("SendCachedEnvelope");
            o(z0Var, this.f79314f);
        }
    }
}
