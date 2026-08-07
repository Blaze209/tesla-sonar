package io.sentry;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public final class l0 implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z0 f80733a;

    public l0(z0 z0Var) {
        this.f80733a = z0Var;
    }

    @Override // io.sentry.z0
    public void A(h4 h4Var, f4 f4Var) {
        this.f80733a.A(h4Var, f4Var);
    }

    @Override // io.sentry.z0
    public x0 B() {
        return f5.t();
    }

    @Override // io.sentry.z0
    public io.sentry.protocol.x C(q3 q3Var) {
        return this.f80733a.C(q3Var);
    }

    @Override // io.sentry.z0
    public io.sentry.protocol.x D(r6 r6Var, h0 h0Var) {
        return this.f80733a.D(r6Var, h0Var);
    }

    @Override // io.sentry.z0
    public z0 E(String str) {
        return this.f80733a.E(str);
    }

    @Override // io.sentry.z0
    public void a(boolean z11) {
        this.f80733a.a(z11);
    }

    @Override // io.sentry.z0
    public void b(long j11) {
        this.f80733a.b(j11);
    }

    @Override // io.sentry.z0
    public void c(e eVar) {
        this.f80733a.c(eVar);
    }

    @Override // io.sentry.z0
    public void d(e eVar, h0 h0Var) {
        this.f80733a.d(eVar, h0Var);
    }

    @Override // io.sentry.z0
    public void e(Throwable th2, g1 g1Var, String str) {
        this.f80733a.e(th2, g1Var, str);
    }

    @Override // io.sentry.z0
    public i1 f() {
        return this.f80733a.f();
    }

    @Override // io.sentry.z0
    public q7 getOptions() {
        return this.f80733a.getOptions();
    }

    @Override // io.sentry.z0
    public void h() {
        this.f80733a.h();
    }

    @Override // io.sentry.z0
    public boolean isEnabled() {
        return this.f80733a.isEnabled();
    }

    @Override // io.sentry.z0
    public boolean k() {
        return this.f80733a.k();
    }

    @Override // io.sentry.z0
    public void l() {
        this.f80733a.l();
    }

    @Override // io.sentry.z0
    public io.sentry.transport.a0 q() {
        return this.f80733a.q();
    }

    @Override // io.sentry.z0
    public io.sentry.protocol.x r(p5 p5Var, h0 h0Var) {
        return this.f80733a.r(p5Var, h0Var);
    }

    @Override // io.sentry.z0
    public io.sentry.protocol.x t(r7 r7Var, h0 h0Var) {
        return this.f80733a.t(r7Var, h0Var);
    }

    @Override // io.sentry.z0
    public i1 v(z8 z8Var, b9 b9Var) {
        return this.f80733a.v(z8Var, b9Var);
    }

    @Override // io.sentry.z0
    public Boolean w() {
        return this.f80733a.w();
    }

    @Override // io.sentry.z0
    public io.sentry.protocol.x x(io.sentry.protocol.e0 e0Var, w8 w8Var, h0 h0Var, u3 u3Var) {
        return this.f80733a.x(e0Var, w8Var, h0Var, u3Var);
    }

    @Override // io.sentry.z0
    @Deprecated
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public r0 m480clone() {
        return this.f80733a.m483clone();
    }
}
