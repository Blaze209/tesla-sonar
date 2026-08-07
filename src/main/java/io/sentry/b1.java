package io.sentry;

/* JADX INFO: loaded from: classes9.dex */
public interface b1 {
    void a(boolean z11);

    void b(long j11);

    io.sentry.protocol.x c(q3 q3Var, x0 x0Var);

    io.sentry.protocol.x d(r7 r7Var, x0 x0Var, h0 h0Var);

    io.sentry.protocol.x e(io.sentry.protocol.e0 e0Var, w8 w8Var, x0 x0Var, h0 h0Var, u3 u3Var);

    void f(f8 f8Var, h0 h0Var);

    void g(f7 f7Var);

    io.sentry.protocol.x h(r6 r6Var, x0 x0Var, h0 h0Var);

    boolean isEnabled();

    default boolean k() {
        return true;
    }

    io.sentry.transport.a0 q();

    io.sentry.protocol.x r(p5 p5Var, h0 h0Var);
}
