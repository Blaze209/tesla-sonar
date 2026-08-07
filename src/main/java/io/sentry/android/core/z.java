package io.sentry.android.core;

import android.util.Log;
import io.sentry.ILogger;
import io.sentry.b7;

/* JADX INFO: loaded from: classes9.dex */
public final class z implements ILogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f79823a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f79824a;

        static {
            int[] iArr = new int[b7.values().length];
            f79824a = iArr;
            try {
                iArr[b7.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f79824a[b7.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f79824a[b7.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f79824a[b7.FATAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f79824a[b7.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public z() {
        this("Sentry");
    }

    private int e(b7 b7Var) {
        int i11 = a.f79824a[b7Var.ordinal()];
        if (i11 == 1) {
            return 4;
        }
        if (i11 != 2) {
            return i11 != 4 ? 3 : 7;
        }
        return 5;
    }

    @Override // io.sentry.ILogger
    public void a(b7 b7Var, String str, Throwable th2) {
        int i11 = a.f79824a[b7Var.ordinal()];
        if (i11 == 1) {
            Log.i(this.f79823a, str, th2);
            return;
        }
        if (i11 == 2) {
            Log.w(this.f79823a, str, th2);
            return;
        }
        if (i11 == 3) {
            Log.e(this.f79823a, str, th2);
        } else if (i11 != 4) {
            Log.d(this.f79823a, str, th2);
        } else {
            Log.wtf(this.f79823a, str, th2);
        }
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
            Log.println(e(b7Var), this.f79823a, str);
        } else {
            Log.println(e(b7Var), this.f79823a, String.format(str, objArr));
        }
    }

    @Override // io.sentry.ILogger
    public boolean d(b7 b7Var) {
        return true;
    }

    public z(String str) {
        this.f79823a = str;
    }
}
