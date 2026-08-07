package com.plaid.internal;

import android.annotation.TargetApi;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.reactnativecommunity.clipboard.ClipboardModule;

/* JADX INFO: loaded from: classes6.dex */
@TargetApi(24)
public final class K5 extends C4562w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K5(C4397d4 urlInterceptor) {
        super(urlInterceptor);
        p013kotlin.jvm.internal.s.k(urlInterceptor, "urlInterceptor");
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, WebResourceRequest request, WebResourceError errorResponse) {
        p013kotlin.jvm.internal.s.k(view, "view");
        p013kotlin.jvm.internal.s.k(request, "request");
        p013kotlin.jvm.internal.s.k(errorResponse, "errorResponse");
        int errorCode = errorResponse.getErrorCode();
        if (400 > errorCode || errorCode >= 500 || errorCode == 408 || errorCode == 404) {
            X5.a.b(X5.f46812a, new C4497o5(C4570w7.a(errorResponse)), "onReceivedError");
        } else {
            X5.a.a(X5.f46812a, new C4497o5(C4570w7.a(errorResponse)), "onReceivedError");
        }
        super.onReceivedError(view, request, errorResponse);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        String path;
        p013kotlin.jvm.internal.s.k(view, "view");
        p013kotlin.jvm.internal.s.k(request, "request");
        if (!request.isForMainFrame() && (path = request.getUrl().getPath()) != null && p013kotlin.text.t.L(path, "/favicon.ico", false, 2, null)) {
            try {
                return new WebResourceResponse(ClipboardModule.MIMETYPE_PNG, null, null);
            } catch (Exception e11) {
                X5.a.a(X5.f46812a, e11, "shouldInterceptRequest");
            }
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        p013kotlin.jvm.internal.s.k(view, "view");
        p013kotlin.jvm.internal.s.k(request, "request");
        try {
            C4397d4 c4397d4 = this.f48190a;
            String string = request.getUrl().toString();
            p013kotlin.jvm.internal.s.j(string, "toString(...)");
            return c4397d4.a(string);
        } catch (Exception e11) {
            X5.a.a(X5.f46812a, e11);
            return true;
        }
    }
}
