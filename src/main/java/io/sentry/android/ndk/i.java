package io.sentry.android.ndk;

import io.sentry.b7;
import io.sentry.g4;
import io.sentry.k8;
import io.sentry.l;
import io.sentry.ndk.NativeScope;
import io.sentry.protocol.i0;
import io.sentry.q7;
import io.sentry.util.y;
import io.sentry.x0;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q7 f79845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.ndk.a f79846b;

    public i(q7 q7Var) {
        this(q7Var, new NativeScope());
    }

    public static /* synthetic */ void n(i iVar, i0 i0Var) {
        if (i0Var == null) {
            iVar.f79846b.c();
        } else {
            iVar.f79846b.h(i0Var.i(), i0Var.h(), i0Var.j(), i0Var.k());
        }
    }

    public static /* synthetic */ void q(i iVar, io.sentry.e eVar) {
        iVar.getClass();
        String strF = null;
        String lowerCase = eVar.m() != null ? eVar.m().name().toLowerCase(Locale.ROOT) : null;
        String strH = l.h(eVar.p());
        try {
            Map<String, Object> mapL = eVar.l();
            if (!mapL.isEmpty()) {
                strF = iVar.f79845a.getSerializer().f(mapL);
            }
        } catch (Throwable th2) {
            iVar.f79845a.getLogger().b(b7.ERROR, th2, "Breadcrumb data is not serializable.", new Object[0]);
        }
        iVar.f79846b.g(lowerCase, eVar.n(), eVar.j(), eVar.q(), strH, strF);
    }

    @Override // io.sentry.g4, io.sentry.y0
    public void a(final String str, final String str2) {
        try {
            this.f79845a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79838a.f79846b.a(str, str2);
                }
            });
        } catch (Throwable th2) {
            this.f79845a.getLogger().b(b7.ERROR, th2, "Scope sync setTag(%s) has an error.", str);
        }
    }

    @Override // io.sentry.g4, io.sentry.y0
    public void b(final String str, final String str2) {
        try {
            this.f79845a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79833a.f79846b.b(str, str2);
                }
            });
        } catch (Throwable th2) {
            this.f79845a.getLogger().b(b7.ERROR, th2, "Scope sync setExtra(%s) has an error.", str);
        }
    }

    @Override // io.sentry.y0
    public void c(final io.sentry.e eVar) {
        try {
            this.f79845a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.c
                @Override // java.lang.Runnable
                public final void run() {
                    i.q(this.f79831a, eVar);
                }
            });
        } catch (Throwable th2) {
            this.f79845a.getLogger().b(b7.ERROR, th2, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.g4, io.sentry.y0
    public void d(final String str) {
        try {
            this.f79845a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79841a.f79846b.d(str);
                }
            });
        } catch (Throwable th2) {
            this.f79845a.getLogger().b(b7.ERROR, th2, "Scope sync removeExtra(%s) has an error.", str);
        }
    }

    @Override // io.sentry.g4, io.sentry.y0
    public void f(final String str) {
        try {
            this.f79845a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79836a.f79846b.f(str);
                }
            });
        } catch (Throwable th2) {
            this.f79845a.getLogger().b(b7.ERROR, th2, "Scope sync removeTag(%s) has an error.", str);
        }
    }

    @Override // io.sentry.y0
    public void j(final i0 i0Var) {
        try {
            this.f79845a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.b
                @Override // java.lang.Runnable
                public final void run() {
                    i.n(this.f79829a, i0Var);
                }
            });
        } catch (Throwable th2) {
            this.f79845a.getLogger().b(b7.ERROR, th2, "Scope sync setUser has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.y0
    public void k(final k8 k8Var, x0 x0Var) {
        if (k8Var == null) {
            return;
        }
        try {
            this.f79845a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.h
                @Override // java.lang.Runnable
                public final void run() {
                    i iVar = this.f79843a;
                    k8 k8Var2 = k8Var;
                    iVar.f79846b.e(k8Var2.p().toString(), k8Var2.m().toString());
                }
            });
        } catch (Throwable th2) {
            this.f79845a.getLogger().b(b7.ERROR, th2, "Scope sync setTrace failed.", new Object[0]);
        }
    }

    i(q7 q7Var, io.sentry.ndk.a aVar) {
        this.f79845a = (q7) y.c(q7Var, "The SentryOptions object is required.");
        this.f79846b = (io.sentry.ndk.a) y.c(aVar, "The NativeScope object is required.");
    }
}
