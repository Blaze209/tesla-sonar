package com.plaid.internal;

import android.annotation.TargetApi;
import android.net.http.SslError;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelicateCoroutinesApi;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.plaid.internal.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C4562w extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4397d4 f48190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f48191b;

    /* JADX INFO: renamed from: com.plaid.internal.w$a */
    @DebugMetadata(c = "com.plaid.core.webview.BasePlaidWebViewClient$onPageFinished$1", f = "WebViewClients.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {
        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new a(continuation);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return new a(continuation).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            jn0.t.b(obj);
            CookieManager.getInstance().flush();
            return jn0.h0.f84049a;
        }
    }

    public C4562w(C4397d4 urlInterceptor) {
        p013kotlin.jvm.internal.s.k(urlInterceptor, "urlInterceptor");
        this.f48190a = urlInterceptor;
        this.f48191b = "";
    }

    @Override // android.webkit.WebViewClient
    @DelicateCoroutinesApi
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        String cookie = CookieManager.getInstance().getCookie(str);
        if (cookie == null) {
            cookie = "";
        }
        if (p013kotlin.jvm.internal.s.f(cookie, this.f48191b)) {
            return;
        }
        this.f48191b = cookie;
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new a(null), 2, null);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public final void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        p013kotlin.jvm.internal.s.k(view, "view");
        p013kotlin.jvm.internal.s.k(request, "request");
        p013kotlin.jvm.internal.s.k(errorResponse, "errorResponse");
        super.onReceivedHttpError(view, request, errorResponse);
        int statusCode = errorResponse.getStatusCode();
        if (400 > statusCode || statusCode >= 500 || statusCode == 408 || statusCode == 404) {
            X5.a.b(X5.f46812a, new C4497o5(C4579x7.a(errorResponse)), "onReceivedHttpError");
        } else {
            X5.a.b(X5.f46812a, new C4497o5(C4579x7.a(errorResponse)), "onReceivedHttpError");
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        p013kotlin.jvm.internal.s.k(view, "view");
        p013kotlin.jvm.internal.s.k(handler, "handler");
        p013kotlin.jvm.internal.s.k(error, "error");
        X5.a.e(X5.f46812a, "onReceivedSslError " + error);
    }
}
