package com.reactnativecommunity.webview;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.b1;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public class f extends WebViewClient {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f48598d = "RNCWebViewClient";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f48599a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected d.C0768d f48600b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected a f48601c = null;

    protected WritableMap a(WebView webView, String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("target", o.a(webView));
        writableMapCreateMap.putString(ImagesContract.URL, str);
        writableMapCreateMap.putBoolean("loading", (this.f48599a || webView.getProgress() == 100) ? false : true);
        writableMapCreateMap.putString("title", webView.getTitle());
        writableMapCreateMap.putBoolean("canGoBack", webView.canGoBack());
        writableMapCreateMap.putBoolean("canGoForward", webView.canGoForward());
        return writableMapCreateMap;
    }

    protected void b(WebView webView, String str) {
        int iA = o.a(webView);
        b1.c((ReactContext) webView.getContext(), iA).h(new p00.e(iA, a(webView, str)));
    }

    public void c(WebView webView, int i11, String str, String str2) {
        WritableMap writableMapA = a(webView, str2);
        writableMapA.putDouble("code", i11);
        writableMapA.putString("description", str);
        int iA = o.a(webView);
        b1.c((ReactContext) webView.getContext(), iA).h(new p00.a(iA, writableMapA));
    }

    public void d(a aVar) {
        this.f48601c = aVar;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z11) {
        super.doUpdateVisitedHistory(webView, str, z11);
        ((d) webView).g(webView, new p00.g(o.a(webView), a(webView, str)));
    }

    public void e(d.C0768d c0768d) {
        this.f48600b = c0768d;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (CookieManager.getInstance().getCookie(str) != null) {
            CookieManager.getInstance().flush();
        }
        if (this.f48599a) {
            return;
        }
        ((d) webView).a();
        b(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f48599a = false;
        ((d) webView).b();
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i11, String str, String str2) {
        super.onReceivedError(webView, i11, str, str2);
        this.f48599a = true;
        b(webView, str2);
        WritableMap writableMapA = a(webView, str2);
        writableMapA.putDouble("code", i11);
        writableMapA.putString("description", str);
        int iA = o.a(webView);
        b1.c((ReactContext) webView.getContext(), iA).h(new p00.d(iA, writableMapA));
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        a aVar = this.f48601c;
        if (aVar != null) {
            httpAuthHandler.proceed(aVar.f48544a, aVar.f48545b);
        } else {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest.isForMainFrame()) {
            WritableMap writableMapA = a(webView, webResourceRequest.getUrl().toString());
            writableMapA.putInt("statusCode", webResourceResponse.getStatusCode());
            writableMapA.putString("description", webResourceResponse.getReasonPhrase());
            int iA = o.a(webView);
            b1.c((ReactContext) webView.getContext(), iA).h(new p00.c(iA, writableMapA));
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String str;
        String url = webView.getUrl();
        String url2 = sslError.getUrl();
        sslErrorHandler.cancel();
        int primaryError = sslError.getPrimaryError();
        if (primaryError == 0) {
            str = "The certificate is not yet valid";
        } else if (primaryError == 1) {
            str = "The certificate has expired";
        } else if (primaryError == 2) {
            str = "Hostname mismatch";
        } else if (primaryError == 3) {
            str = "The certificate authority is not trusted";
        } else if (primaryError != 4) {
            str = primaryError != 5 ? "Unknown SSL Error" : "A generic error occurred";
        } else {
            str = "The date of the certificate is invalid";
        }
        String str2 = "SSL error: " + str;
        if (url.equalsIgnoreCase(url2)) {
            onReceivedError(webView, primaryError, str2, url2);
            return;
        }
        Log.w(f48598d, "Resource blocked from loading due to SSL error. Blocked URL: " + url2);
        c(webView, primaryError, str2, url2);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        super.onRenderProcessGone(webView, renderProcessGoneDetail);
        if (renderProcessGoneDetail.didCrash()) {
            Log.e(f48598d, "The WebView rendering process crashed.");
        } else {
            Log.w(f48598d, "The WebView rendering process was killed by the system.");
        }
        if (webView == null) {
            return true;
        }
        WritableMap writableMapA = a(webView, webView.getUrl());
        writableMapA.putBoolean("didCrash", renderProcessGoneDetail.didCrash());
        int iA = o.a(webView);
        b1.c((ReactContext) webView.getContext(), iA).h(new p00.j(iA, writableMapA));
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        d dVar = (d) webView;
        if (dVar.getReactApplicationContext().getJavaScriptContextHolder().get() == 0 || dVar.f48571i == null) {
            qk.a.I(f48598d, "Couldn't use blocking synchronous call for onShouldStartLoadWithRequest due to debugging or missing Catalyst instance, falling back to old event-and-load.");
            this.f48600b.b(true);
            int iA = o.a(webView);
            b1.c((ReactContext) webView.getContext(), iA).h(new p00.k(iA, a(webView, str)));
            return true;
        }
        u5.d<Double, AtomicReference<l.d.a>> dVarB = l.f48633g.b();
        Double d11 = dVarB.f115407a;
        double dDoubleValue = d11.doubleValue();
        AtomicReference<l.d.a> atomicReference = dVarB.f115408b;
        WritableMap writableMapA = a(webView, str);
        writableMapA.putDouble("lockIdentifier", dDoubleValue);
        dVar.f(writableMapA);
        try {
            synchronized (atomicReference) {
                try {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    while (atomicReference.get() == l.d.a.UNDECIDED) {
                        if (SystemClock.elapsedRealtime() - jElapsedRealtime > 250) {
                            qk.a.I(f48598d, "Did not receive response to shouldOverrideUrlLoading in time, defaulting to allow loading.");
                            l.f48633g.c(d11);
                            return false;
                        }
                        atomicReference.wait(250L);
                    }
                    boolean z11 = atomicReference.get() == l.d.a.SHOULD_OVERRIDE;
                    l.f48633g.c(d11);
                    return z11;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (InterruptedException e11) {
            qk.a.n(f48598d, "shouldOverrideUrlLoading was interrupted while waiting for result.", e11);
            l.f48633g.c(d11);
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }
}
