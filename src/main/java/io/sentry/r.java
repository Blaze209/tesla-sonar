package io.sentry;

/* JADX INFO: loaded from: classes9.dex */
public final class r implements ILogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q7 f81145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ILogger f81146b;

    public r(q7 q7Var, ILogger iLogger) {
        this.f81145a = (q7) io.sentry.util.y.c(q7Var, "SentryOptions is required.");
        this.f81146b = iLogger;
    }

    @Override // io.sentry.ILogger
    public void a(b7 b7Var, String str, Throwable th2) {
        if (this.f81146b == null || !d(b7Var)) {
            return;
        }
        this.f81146b.a(b7Var, str, th2);
    }

    @Override // io.sentry.ILogger
    public void b(b7 b7Var, Throwable th2, String str, Object... objArr) {
        if (this.f81146b == null || !d(b7Var)) {
            return;
        }
        this.f81146b.b(b7Var, th2, str, objArr);
    }

    @Override // io.sentry.ILogger
    public void c(b7 b7Var, String str, Object... objArr) {
        if (this.f81146b == null || !d(b7Var)) {
            return;
        }
        this.f81146b.c(b7Var, str, objArr);
    }

    @Override // io.sentry.ILogger
    public boolean d(b7 b7Var) {
        return b7Var != null && this.f81145a.isDebug() && b7Var.ordinal() >= this.f81145a.getDiagnosticLevel().ordinal();
    }
}
