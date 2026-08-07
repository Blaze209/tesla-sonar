package io.sentry;

/* JADX INFO: loaded from: classes9.dex */
public final class w4 implements v4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t4 f81569a;

    public w4(t4 t4Var) {
        this.f81569a = (t4) io.sentry.util.y.c(t4Var, "SendFireAndForgetDirPath is required");
    }

    @Override // io.sentry.v4
    public s4 d(z0 z0Var, q7 q7Var) {
        io.sentry.util.y.c(z0Var, "Scopes are required");
        io.sentry.util.y.c(q7Var, "SentryOptions is required");
        String strA = this.f81569a.a();
        if (strA != null && b(strA, q7Var.getLogger())) {
            return a(new b0(z0Var, q7Var.getSerializer(), q7Var.getLogger(), q7Var.getFlushTimeoutMillis(), q7Var.getMaxQueueSize()), strA, q7Var.getLogger());
        }
        q7Var.getLogger().c(b7.ERROR, "No cache dir path is defined in options.", new Object[0]);
        return null;
    }
}
