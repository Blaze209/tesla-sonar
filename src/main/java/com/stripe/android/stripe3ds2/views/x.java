package com.stripe.android.stripe3ds2.views;

import android.net.Uri;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Locale;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0002\u0013\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u001b\u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/x;", "Landroid/webkit/WebViewClient;", "<init>", "()V", "Landroid/webkit/WebView;", "view", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceResponse;", "shouldInterceptRequest", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "Landroid/net/Uri;", "uri", "", "c", "(Landroid/net/Uri;)Z", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "Ljn0/h0;", "a", "(Landroid/net/Uri;)V", "Lcom/stripe/android/stripe3ds2/views/x$b;", "Lcom/stripe/android/stripe3ds2/views/x$b;", "getListener$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/x$b;", "b", "(Lcom/stripe/android/stripe3ds2/views/x$b;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class x extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private b listener;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/x$b;", "", "", "data", "Ljn0/h0;", "a", "(Ljava/lang/String;)V", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        void a(String data);
    }

    public final void a(Uri uri) {
        b bVar;
        p013kotlin.jvm.internal.s.k(uri, "uri");
        String string = uri.toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        Locale ENGLISH = Locale.ENGLISH;
        p013kotlin.jvm.internal.s.j(ENGLISH, "ENGLISH");
        String lowerCase = string.toLowerCase(ENGLISH);
        p013kotlin.jvm.internal.s.j(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (!p013kotlin.text.t.b0(lowerCase, "https://emv3ds/challenge", false, 2, null) || (bVar = this.listener) == null) {
            return;
        }
        bVar.a(uri.getQuery());
    }

    public final void b(b bVar) {
        this.listener = bVar;
    }

    public final boolean c(Uri uri) {
        p013kotlin.jvm.internal.s.k(uri, "uri");
        return URLUtil.isDataUrl(uri.toString());
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        p013kotlin.jvm.internal.s.k(view, "view");
        p013kotlin.jvm.internal.s.k(request, "request");
        Uri url = request.getUrl();
        p013kotlin.jvm.internal.s.j(url, "getUrl(...)");
        a(url);
        Uri url2 = request.getUrl();
        p013kotlin.jvm.internal.s.j(url2, "getUrl(...)");
        return c(url2) ? super.shouldInterceptRequest(view, request) : new WebResourceResponse(null, null, null);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        p013kotlin.jvm.internal.s.k(view, "view");
        p013kotlin.jvm.internal.s.k(request, "request");
        Uri url = request.getUrl();
        p013kotlin.jvm.internal.s.j(url, "getUrl(...)");
        a(url);
        return true;
    }
}
