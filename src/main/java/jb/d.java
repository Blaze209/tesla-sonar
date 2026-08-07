package jb;

import android.os.Build;
import android.util.Log;
import android.webkit.WebSettings;
import kb.m;
import kb.n;
import kb.o;
import kb.p;

/* JADX INFO: loaded from: classes3.dex */
public class d {
    private static m a(WebSettings webSettings) {
        try {
            return p.c().a(webSettings);
        } catch (ClassCastException e11) {
            if (Build.VERSION.SDK_INT != 30 || !"android.webkit.WebSettingsWrapper".equals(webSettings.getClass().getCanonicalName())) {
                throw e11;
            }
            Log.e("WebSettingsCompat", "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info.", e11);
            return new n();
        }
    }

    @Deprecated
    public static void b(WebSettings webSettings, int i11) {
        kb.a.h hVar = o.T;
        if (hVar.b()) {
            kb.d.a(webSettings, i11);
        } else {
            if (!hVar.c()) {
                throw o.a();
            }
            a(webSettings).a(i11);
        }
    }

    @Deprecated
    public static void c(WebSettings webSettings, int i11) {
        if (!o.U.c()) {
            throw o.a();
        }
        a(webSettings).b(i11);
    }

    public static void d(WebSettings webSettings, boolean z11) {
        if (!o.f85841t0.c()) {
            throw o.a();
        }
        a(webSettings).c(z11);
    }
}
