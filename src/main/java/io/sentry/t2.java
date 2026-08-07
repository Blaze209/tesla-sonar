package io.sentry;

/* JADX INFO: loaded from: classes9.dex */
public final class t2 implements z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final t2 f81347b = new t2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.util.r<q7> f81348a = new io.sentry.util.r<>(new io.sentry.util.r.a() { // from class: io.sentry.s2
        @Override // io.sentry.util.r.a
        public final Object a() {
            return q7.empty();
        }
    });

    private t2() {
    }

    public static t2 i() {
        return f81347b;
    }

    @Override // io.sentry.z0
    public void A(h4 h4Var, f4 f4Var) {
    }

    @Override // io.sentry.z0
    public x0 B() {
        return r2.Q();
    }

    @Override // io.sentry.z0
    public io.sentry.protocol.x C(q3 q3Var) {
        return io.sentry.protocol.x.f81078b;
    }

    @Override // io.sentry.z0
    public io.sentry.protocol.x D(r6 r6Var, h0 h0Var) {
        return io.sentry.protocol.x.f81078b;
    }

    @Override // io.sentry.z0
    public z0 E(String str) {
        return i();
    }

    @Override // io.sentry.z0
    public void a(boolean z11) {
    }

    @Override // io.sentry.z0
    public void b(long j11) {
    }

    @Override // io.sentry.z0
    public void c(e eVar) {
    }

    @Override // io.sentry.z0
    public void d(e eVar, h0 h0Var) {
    }

    @Override // io.sentry.z0
    public void e(Throwable th2, g1 g1Var, String str) {
    }

    @Override // io.sentry.z0
    public i1 f() {
        return null;
    }

    @Override // io.sentry.z0
    public q7 getOptions() {
        return this.f81348a.a();
    }

    @Override // io.sentry.z0
    public void h() {
    }

    @Override // io.sentry.z0
    public boolean isEnabled() {
        return false;
    }

    @Override // io.sentry.z0
    public boolean k() {
        return true;
    }

    @Override // io.sentry.z0
    public void l() {
    }

    @Override // io.sentry.z0
    public io.sentry.transport.a0 q() {
        return null;
    }

    @Override // io.sentry.z0
    public io.sentry.protocol.x r(p5 p5Var, h0 h0Var) {
        return io.sentry.protocol.x.f81078b;
    }

    @Override // io.sentry.z0
    public io.sentry.protocol.x t(r7 r7Var, h0 h0Var) {
        return io.sentry.protocol.x.f81078b;
    }

    @Override // io.sentry.z0
    public i1 v(z8 z8Var, b9 b9Var) {
        return e3.s();
    }

    @Override // io.sentry.z0
    public Boolean w() {
        return null;
    }

    @Override // io.sentry.z0
    public io.sentry.protocol.x x(io.sentry.protocol.e0 e0Var, w8 w8Var, h0 h0Var, u3 u3Var) {
        return io.sentry.protocol.x.f81078b;
    }

    @Override // io.sentry.z0
    public boolean z() {
        return true;
    }

    @Override // io.sentry.z0
    @Deprecated
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public r0 m485clone() {
        return l2.g();
    }
}
