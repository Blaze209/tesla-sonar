package io.sentry;

/* JADX INFO: loaded from: classes9.dex */
public final class p1 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runtime f80816a = Runtime.getRuntime();

    @Override // io.sentry.v0
    public void c() {
    }

    @Override // io.sentry.v0
    public void d(o3 o3Var) {
        o3Var.f(Long.valueOf(this.f80816a.totalMemory() - this.f80816a.freeMemory()));
    }
}
