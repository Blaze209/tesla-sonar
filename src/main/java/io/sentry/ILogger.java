package io.sentry;

/* JADX INFO: loaded from: classes9.dex */
public interface ILogger {
    void a(b7 b7Var, String str, Throwable th2);

    void b(b7 b7Var, Throwable th2, String str, Object... objArr);

    void c(b7 b7Var, String str, Object... objArr);

    boolean d(b7 b7Var);
}
