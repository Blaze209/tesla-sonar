package com.plaid.internal;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.plaid.link.R;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.plaid.internal.y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4583y2 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f48228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U5 f48229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f48230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lazy f48231d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4583y2(Context context) {
        super(context, null, 0);
        p013kotlin.jvm.internal.s.k(context, "context");
        this.f48228a = jn0.m.b(new C4556v2(this));
        U5 u11 = new U5(context);
        this.f48229b = u11;
        this.f48230c = jn0.m.b(new C4574x2(this));
        this.f48231d = jn0.m.b(new C4565w2(this));
        if ((getContext().getApplicationInfo().flags & 2) != 0) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        View.inflate(context, R.layout.plaid_link_embedded_view, this);
        ((FrameLayout) findViewById(R.id.embedded_webview_container)).addView(u11);
    }

    public final ProgressBar getProgressBar$link_sdk_release() {
        Object value = this.f48228a.getValue();
        p013kotlin.jvm.internal.s.j(value, "getValue(...)");
        return (ProgressBar) value;
    }

    public final View getRetryButton$link_sdk_release() {
        Object value = this.f48231d.getValue();
        p013kotlin.jvm.internal.s.j(value, "getValue(...)");
        return (View) value;
    }

    public final View getRetryContainer$link_sdk_release() {
        Object value = this.f48230c.getValue();
        p013kotlin.jvm.internal.s.j(value, "getValue(...)");
        return (View) value;
    }

    public final U5 getWebView$link_sdk_release() {
        return this.f48229b;
    }
}
