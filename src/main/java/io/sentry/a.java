package io.sentry;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements k1 {
    @Override // io.sentry.k1
    public io.sentry.transport.q a(q7 q7Var, a4 a4Var) {
        io.sentry.util.y.c(q7Var, "options is required");
        io.sentry.util.y.c(a4Var, "requestDetails is required");
        return new io.sentry.transport.e(q7Var, new io.sentry.transport.a0(q7Var), q7Var.getTransportGate(), a4Var);
    }
}
