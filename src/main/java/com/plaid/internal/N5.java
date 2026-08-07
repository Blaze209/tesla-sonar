package com.plaid.internal;

import android.app.Application;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes6.dex */
public final class N5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f46539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public U5 f46540b;

    public N5(Application application) {
        p013kotlin.jvm.internal.s.k(application, "application");
        this.f46539a = application;
    }

    public final void a() {
        X5.a.d(X5.f46812a, "Destroying webview " + this.f46540b);
        U5 u11 = this.f46540b;
        if (u11 != null && !u11.a().getAndSet(true)) {
            u11.destroy();
        }
        this.f46540b = null;
    }

    public final U5 b() {
        X5.a.d(X5.f46812a, "Creating webview");
        if ((this.f46539a.getApplicationInfo().flags & 2) != 0) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        U5 u11 = new U5(this.f46539a);
        this.f46540b = u11;
        p013kotlin.jvm.internal.s.h(u11);
        return u11;
    }

    public final U5 c() {
        X5.a.d(X5.f46812a, "Returning webview " + this.f46540b);
        U5 u5B = this.f46540b;
        if (u5B == null) {
            u5B = b();
        }
        this.f46540b = null;
        return u5B;
    }
}
