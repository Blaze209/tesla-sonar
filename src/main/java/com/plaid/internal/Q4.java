package com.plaid.internal;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class Q4 extends C4562w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q4(C4397d4 urlInterceptor) {
        super(urlInterceptor);
        p013kotlin.jvm.internal.s.k(urlInterceptor, "urlInterceptor");
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, int i11, String description, String failingUrl) {
        p013kotlin.jvm.internal.s.k(view, "view");
        p013kotlin.jvm.internal.s.k(description, "description");
        p013kotlin.jvm.internal.s.k(failingUrl, "failingUrl");
        super.onReceivedError(view, i11, description, failingUrl);
        if (400 > i11 || i11 >= 500 || i11 == 408 || i11 == 404) {
            X5.a.b(X5.f46812a, new C4497o5(description), "onReceivedError");
        } else {
            X5.a.a(X5.f46812a, new C4497o5(description), "onReceivedError");
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        p013kotlin.jvm.internal.s.k(view, "view");
        p013kotlin.jvm.internal.s.k(url, "url");
        Locale ENGLISH = Locale.ENGLISH;
        p013kotlin.jvm.internal.s.j(ENGLISH, "ENGLISH");
        String lowerCase = url.toLowerCase(ENGLISH);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        if (p013kotlin.text.t.h0(lowerCase, "/favicon.ico", false, 2, null)) {
            try {
                return new WebResourceResponse(ClipboardModule.MIMETYPE_PNG, null, null);
            } catch (Exception e11) {
                X5.a.a(X5.f46812a, e11, "shouldInterceptRequest");
            }
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, String str) {
        p013kotlin.jvm.internal.s.k(view, "view");
        if (str == null) {
            return false;
        }
        try {
            return this.f48190a.a(str);
        } catch (Exception e11) {
            X5.a.a(X5.f46812a, e11);
            return true;
        }
    }
}
