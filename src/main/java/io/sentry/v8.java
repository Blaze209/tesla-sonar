package io.sentry;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes9.dex */
public final class v8 implements ILogger {
    private String e(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // io.sentry.ILogger
    public void a(b7 b7Var, String str, Throwable th2) {
        if (th2 == null) {
            c(b7Var, str, new Object[0]);
        } else {
            System.out.println(String.format("%s: %s\n%s", b7Var, String.format(str, th2.toString()), e(th2)));
        }
    }

    @Override // io.sentry.ILogger
    public void b(b7 b7Var, Throwable th2, String str, Object... objArr) {
        if (th2 == null) {
            c(b7Var, str, objArr);
        } else {
            System.out.println(String.format("%s: %s \n %s\n%s", b7Var, String.format(str, objArr), th2.toString(), e(th2)));
        }
    }

    @Override // io.sentry.ILogger
    public void c(b7 b7Var, String str, Object... objArr) {
        System.out.println(String.format("%s: %s", b7Var, String.format(str, objArr)));
    }

    @Override // io.sentry.ILogger
    public boolean d(b7 b7Var) {
        return true;
    }
}
