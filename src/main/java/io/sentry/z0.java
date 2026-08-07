package io.sentry;

/* JADX INFO: loaded from: classes9.dex */
public interface z0 {
    void A(h4 h4Var, f4 f4Var);

    x0 B();

    io.sentry.protocol.x C(q3 q3Var);

    io.sentry.protocol.x D(r6 r6Var, h0 h0Var);

    z0 E(String str);

    void a(boolean z11);

    void b(long j11);

    void c(e eVar);

    @Deprecated
    r0 clone();

    void d(e eVar, h0 h0Var);

    void e(Throwable th2, g1 g1Var, String str);

    i1 f();

    q7 getOptions();

    void h();

    boolean isEnabled();

    boolean k();

    void l();

    io.sentry.transport.a0 q();

    io.sentry.protocol.x r(p5 p5Var, h0 h0Var);

    default void s(f4 f4Var) {
        A(null, f4Var);
    }

    io.sentry.protocol.x t(r7 r7Var, h0 h0Var);

    default io.sentry.protocol.x u(p5 p5Var) {
        return r(p5Var, new h0());
    }

    i1 v(z8 z8Var, b9 b9Var);

    Boolean w();

    io.sentry.protocol.x x(io.sentry.protocol.e0 e0Var, w8 w8Var, h0 h0Var, u3 u3Var);

    default io.sentry.protocol.x y(io.sentry.protocol.e0 e0Var, w8 w8Var, h0 h0Var) {
        return x(e0Var, w8Var, h0Var, null);
    }

    default boolean z() {
        return false;
    }
}
