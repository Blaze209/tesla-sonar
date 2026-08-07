package com.stripe.android.view;

import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlinx.coroutines.flow.MutableStateFlow;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001+BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u001b\u0010 \u001a\u00020\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b \u0010!J!\u0010%\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\"2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010/R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00100R\"\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00100R\u0016\u00102\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00101R(\u00107\u001a\u0004\u0018\u00010\u00072\b\u00103\u001a\u0004\u0018\u00010\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00106R\"\u0010=\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lcom/stripe/android/view/x1;", "Landroid/webkit/WebViewClient;", "Lo30/d;", "logger", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isPageLoaded", "", "clientSecret", "returnUrl", "Lkotlin/Function1;", "Landroid/content/Intent;", "Ljn0/h0;", "activityStarter", "", "activityFinisher", "<init>", "(Lo30/d;Lkotlinx/coroutines/flow/MutableStateFlow;Ljava/lang/String;Ljava/lang/String;Lwn0/l;Lwn0/l;)V", "c", "()V", "Landroid/net/Uri;", "uri", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/net/Uri;)V", AnalyticsAttribute.Intent, "h", "(Landroid/content/Intent;)V", "k", "e", "(Landroid/net/Uri;)Z", DateTokenConverter.CONVERTER_KEY, AnalyticsAttribute.Error, "f", "(Ljava/lang/Throwable;)V", "Landroid/webkit/WebView;", "view", ImagesContract.URL, "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Landroid/webkit/WebResourceRequest;", "request", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "a", "Lo30/d;", "b", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Ljava/lang/String;", "Lwn0/l;", "Landroid/net/Uri;", "userReturnUri", "<set-?>", "g", "getCompletionUrlParam", "()Ljava/lang/String;", "completionUrlParam", "Z", "getHasLoadedBlank$payments_core_release", "()Z", "j", "(Z)V", "hasLoadedBlank", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class x1 extends WebViewClient {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f55204j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Set<String> f55205k = p013kotlin.collections.d1.c("https://hooks.stripe.com/three_d_secure/authenticate");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Set<String> f55206l = p013kotlin.collections.d1.i("https://hooks.stripe.com/redirect/complete/", "https://hooks.stripe.com/3d_secure/complete/", "https://hooks.stripe.com/3d_secure_2/hosted/complete");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<Boolean> isPageLoaded;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String clientSecret;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<Intent, jn0.h0> activityStarter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<Throwable, jn0.h0> activityFinisher;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Uri userReturnUri;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String completionUrlParam;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean hasLoadedBlank;

    /* JADX INFO: renamed from: com.stripe.android.view.x1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\t\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/view/x1$a;", "", "<init>", "()V", "", ImagesContract.URL, "", "b", "(Ljava/lang/String;)Z", "c", "", "AUTHENTICATE_URLS", "Ljava/util/Set;", "BLANK_PAGE", "Ljava/lang/String;", "COMPLETION_URLS", "PARAM_PAYMENT_CLIENT_SECRET", "PARAM_RETURN_URL", "PARAM_SETUP_CLIENT_SECRET", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(String url) {
            Set set = x1.f55205k;
            if ((set instanceof Collection) && set.isEmpty()) {
                return false;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (p013kotlin.text.t.b0(url, (String) it.next(), false, 2, null)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean c(String url) {
            p013kotlin.jvm.internal.s.k(url, "url");
            Set set = x1.f55206l;
            if ((set instanceof Collection) && set.isEmpty()) {
                return false;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (p013kotlin.text.t.b0(url, (String) it.next(), false, 2, null)) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x1(o30.d logger, MutableStateFlow<Boolean> isPageLoaded, String clientSecret, String str, wn0.l<? super Intent, jn0.h0> activityStarter, wn0.l<? super Throwable, jn0.h0> activityFinisher) {
        p013kotlin.jvm.internal.s.k(logger, "logger");
        p013kotlin.jvm.internal.s.k(isPageLoaded, "isPageLoaded");
        p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
        p013kotlin.jvm.internal.s.k(activityStarter, "activityStarter");
        p013kotlin.jvm.internal.s.k(activityFinisher, "activityFinisher");
        this.logger = logger;
        this.isPageLoaded = isPageLoaded;
        this.clientSecret = clientSecret;
        this.activityStarter = activityStarter;
        this.activityFinisher = activityFinisher;
        this.userReturnUri = str != null ? Uri.parse(str) : null;
    }

    private final void c() {
        this.logger.debug("PaymentAuthWebViewClient#hideProgressBar()");
        this.isPageLoaded.setValue(Boolean.TRUE);
    }

    private final boolean d(Uri uri) {
        if (p013kotlin.jvm.internal.s.f("stripejs://use_stripe_sdk/return_url", uri.toString())) {
            return true;
        }
        String string = uri.toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        return p013kotlin.text.t.b0(string, "stripesdk://payment_return_url/", false, 2, null);
    }

    private final boolean e(Uri uri) {
        String queryParameter;
        this.logger.debug("PaymentAuthWebViewClient#isReturnUrl()");
        if (d(uri)) {
            return true;
        }
        Uri uri2 = this.userReturnUri;
        if (uri2 != null) {
            return uri2.getScheme() != null && p013kotlin.jvm.internal.s.f(this.userReturnUri.getScheme(), uri.getScheme()) && this.userReturnUri.getHost() != null && p013kotlin.jvm.internal.s.f(this.userReturnUri.getHost(), uri.getHost());
        }
        if (uri.isOpaque()) {
            return false;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames.contains("payment_intent_client_secret")) {
            queryParameter = uri.getQueryParameter("payment_intent_client_secret");
        } else {
            queryParameter = queryParameterNames.contains("setup_intent_client_secret") ? uri.getQueryParameter("setup_intent_client_secret") : null;
        }
        return p013kotlin.jvm.internal.s.f(this.clientSecret, queryParameter);
    }

    private final void f(Throwable error) {
        this.logger.debug("PaymentAuthWebViewClient#onAuthCompleted()");
        this.activityFinisher.invoke(error);
    }

    static /* synthetic */ void g(x1 x1Var, Throwable th2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            th2 = null;
        }
        x1Var.f(th2);
    }

    private final void h(Intent intent) {
        Object objB;
        this.logger.debug("PaymentAuthWebViewClient#openIntent()");
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            this.activityStarter.invoke(intent);
            objB = jn0.s.b(jn0.h0.f84049a);
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        Throwable thE = jn0.s.e(objB);
        if (thE != null) {
            this.logger.error("Failed to start Intent.", thE);
            if (p013kotlin.jvm.internal.s.f(intent.getScheme(), "alipays")) {
                return;
            }
            f(thE);
        }
    }

    private final void i(Uri uri) {
        Object objB;
        this.logger.debug("PaymentAuthWebViewClient#openIntentScheme()");
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            Intent uri2 = Intent.parseUri(uri.toString(), 1);
            p013kotlin.jvm.internal.s.j(uri2, "parseUri(...)");
            h(uri2);
            objB = jn0.s.b(jn0.h0.f84049a);
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        Throwable thE = jn0.s.e(objB);
        if (thE != null) {
            this.logger.error("Failed to start Intent.", thE);
            f(thE);
        }
    }

    private final void k(Uri uri) {
        this.logger.debug("PaymentAuthWebViewClient#updateCompletionUrl()");
        Companion companion = INSTANCE;
        String string = uri.toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        String queryParameter = companion.b(string) ? uri.getQueryParameter("return_url") : null;
        if (queryParameter == null || p013kotlin.text.t.y0(queryParameter)) {
            return;
        }
        this.completionUrlParam = queryParameter;
    }

    public final void j(boolean z11) {
        this.hasLoadedBlank = z11;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        p013kotlin.jvm.internal.s.k(view, "view");
        this.logger.debug("PaymentAuthWebViewClient#onPageFinished() - " + url);
        super.onPageFinished(view, url);
        if (!this.hasLoadedBlank) {
            c();
        }
        if (url == null || !INSTANCE.c(url)) {
            return;
        }
        this.logger.debug(url + " is a completion URL");
        g(this, null, 1, null);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        p013kotlin.jvm.internal.s.k(view, "view");
        p013kotlin.jvm.internal.s.k(request, "request");
        Uri url = request.getUrl();
        this.logger.debug("PaymentAuthWebViewClient#shouldOverrideUrlLoading(): " + url);
        p013kotlin.jvm.internal.s.h(url);
        k(url);
        if (e(url)) {
            this.logger.debug("PaymentAuthWebViewClient#shouldOverrideUrlLoading() - handle return URL");
            g(this, null, 1, null);
            return true;
        }
        if (p013kotlin.text.t.M(AnalyticsAttribute.Intent, url.getScheme(), true)) {
            i(url);
            return true;
        }
        if (URLUtil.isNetworkUrl(url.toString())) {
            return super.shouldOverrideUrlLoading(view, request);
        }
        h(new Intent("android.intent.action.VIEW", url));
        return true;
    }
}
