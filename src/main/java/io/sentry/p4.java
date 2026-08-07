package io.sentry;

/* JADX INFO: loaded from: classes9.dex */
public final class p4 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p4 f80821a = new p4();

    private p4() {
    }

    public static p4 g() {
        return f80821a;
    }

    @Override // io.sentry.z0
    public void A(h4 h4Var, f4 f4Var) {
        f5.m(h4Var, f4Var);
    }

    @Override // io.sentry.z0
    public x0 B() {
        return f5.t();
    }

    @Override // io.sentry.z0
    public io.sentry.protocol.x C(q3 q3Var) {
        return f5.r().C(q3Var);
    }

    @Override // io.sentry.z0
    public io.sentry.protocol.x D(r6 r6Var, h0 h0Var) {
        return f5.j(r6Var, h0Var);
    }

    @Override // io.sentry.z0
    public z0 E(String str) {
        return f5.q(str);
    }

    @Override // io.sentry.z0
    public void a(boolean z11) {
        f5.k();
    }

    @Override // io.sentry.z0
    public void b(long j11) {
        f5.p(j11);
    }

    @Override // io.sentry.z0
    public void c(e eVar) {
        d(eVar, new h0());
    }

    @Override // io.sentry.z0
    public void d(e eVar, h0 h0Var) {
        f5.h(eVar, h0Var);
    }

    @Override // io.sentry.z0
    public void e(Throwable th2, g1 g1Var, String str) {
        f5.r().e(th2, g1Var, str);
    }

    @Override // io.sentry.z0
    public i1 f() {
        return f5.r().f();
    }

    @Override // io.sentry.z0
    public q7 getOptions() {
        return f5.r().getOptions();
    }

    @Override // io.sentry.z0
    public void h() {
        f5.L();
    }

    @Override // io.sentry.z0
    public boolean isEnabled() {
        return f5.F();
    }

    @Override // io.sentry.z0
    public boolean k() {
        return f5.G();
    }

    @Override // io.sentry.z0
    public void l() {
        f5.n();
    }

    @Override // io.sentry.z0
    public io.sentry.transport.a0 q() {
        return f5.r().q();
    }

    @Override // io.sentry.z0
    public io.sentry.protocol.x r(p5 p5Var, h0 h0Var) {
        return f5.r().r(p5Var, h0Var);
    }

    @Override // io.sentry.z0
    public io.sentry.protocol.x t(r7 r7Var, h0 h0Var) {
        return f5.r().t(r7Var, h0Var);
    }

    @Override // io.sentry.z0
    public i1 v(z8 z8Var, b9 b9Var) {
        return f5.M(z8Var, b9Var);
    }

    @Override // io.sentry.z0
    public Boolean w() {
        return f5.E();
    }

    @Override // io.sentry.z0
    public io.sentry.protocol.x x(io.sentry.protocol.e0 e0Var, w8 w8Var, h0 h0Var, u3 u3Var) {
        return f5.r().x(e0Var, w8Var, h0Var, u3Var);
    }

    @Override // io.sentry.z0
    @Deprecated
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public r0 m483clone() {
        return f5.r().m482clone();
    }
}
