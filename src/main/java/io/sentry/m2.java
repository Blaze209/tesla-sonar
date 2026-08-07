package io.sentry;

/* JADX INFO: loaded from: classes9.dex */
public final class m2 implements ILogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m2 f80763a = new m2();

    private m2() {
    }

    public static m2 e() {
        return f80763a;
    }

    @Override // io.sentry.ILogger
    public void a(b7 b7Var, String str, Throwable th2) {
    }

    @Override // io.sentry.ILogger
    public void b(b7 b7Var, Throwable th2, String str, Object... objArr) {
    }

    @Override // io.sentry.ILogger
    public void c(b7 b7Var, String str, Object... objArr) {
    }

    @Override // io.sentry.ILogger
    public boolean d(b7 b7Var) {
        return false;
    }
}
