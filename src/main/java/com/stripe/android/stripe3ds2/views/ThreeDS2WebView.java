package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0015\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;", "Landroid/webkit/WebView;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ljn0/h0;", "a", "()V", "Landroid/webkit/WebViewClient;", "client", "setWebViewClient", "(Landroid/webkit/WebViewClient;)V", "Lcom/stripe/android/stripe3ds2/views/x$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnHtmlSubmitListener$3ds2sdk_release", "(Lcom/stripe/android/stripe3ds2/views/x$b;)V", "setOnHtmlSubmitListener", "Lcom/stripe/android/stripe3ds2/views/x;", "Lcom/stripe/android/stripe3ds2/views/x;", "webViewClient", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ThreeDS2WebView extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final x webViewClient;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreeDS2WebView(Context context) {
        this(context, null, 0, 6, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    private final void a() {
        WebSettings settings = getSettings();
        settings.setCacheMode(2);
        settings.setJavaScriptEnabled(false);
        settings.setAllowContentAccess(false);
        settings.setBlockNetworkImage(true);
        settings.setBlockNetworkLoads(true);
    }

    public final void setOnHtmlSubmitListener$3ds2sdk_release(x.b listener) {
        this.webViewClient.b(listener);
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient client) {
        p013kotlin.jvm.internal.s.k(client, "client");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreeDS2WebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public /* synthetic */ ThreeDS2WebView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeDS2WebView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        p013kotlin.jvm.internal.s.k(context, "context");
        x xVar = new x();
        this.webViewClient = xVar;
        a();
        super.setWebViewClient(xVar);
    }
}
