package io.sentry;

/* JADX INFO: loaded from: classes9.dex */
public final class h5 implements o5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o5 f80620a;

    public h5() {
        if (a()) {
            this.f80620a = new y6();
        } else {
            this.f80620a = new j7();
        }
    }

    private static boolean a() {
        return io.sentry.util.a0.c() && io.sentry.util.a0.b();
    }

    @Override // io.sentry.o5
    public n5 now() {
        return this.f80620a.now();
    }
}
