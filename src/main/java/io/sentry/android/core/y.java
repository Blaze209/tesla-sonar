package io.sentry.android.core;

import android.util.Log;
import io.sentry.ILogger;
import io.sentry.b7;

/* JADX INFO: loaded from: classes9.dex */
public final class y implements ILogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f79814a;

    public y() {
        this("Sentry");
    }

    private int e(b7 b7Var) {
        return 7;
    }

    @Override // io.sentry.ILogger
    public void a(b7 b7Var, String str, Throwable th2) {
        Log.wtf(this.f79814a, str, th2);
    }

    @Override // io.sentry.ILogger
    public void b(b7 b7Var, Throwable th2, String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            a(b7Var, str, th2);
        } else {
            a(b7Var, String.format(str, objArr), th2);
        }
    }

    @Override // io.sentry.ILogger
    public void c(b7 b7Var, String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            Log.println(e(b7Var), this.f79814a, str);
        } else {
            Log.println(e(b7Var), this.f79814a, String.format(str, objArr));
        }
    }

    @Override // io.sentry.ILogger
    public boolean d(b7 b7Var) {
        return true;
    }

    public y(String str) {
        this.f79814a = str;
    }
}
