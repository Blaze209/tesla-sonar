package vf0;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes8.dex */
final class g extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f119287a;

    private g(c cVar) {
        this.f119287a = cVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        xf0.j.b("uppay", "onPageFinished");
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        xf0.j.b("uppay", "shouldOverrideUrlLoading：" + str);
        if (this.f119287a.f119275g && !TextUtils.isEmpty(str) && !str.startsWith("http") && !str.startsWith("HTTP")) {
            try {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                this.f119287a.f119270b.startActivity(intent);
                return true;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    /* synthetic */ g(c cVar, byte b11) {
        this(cVar);
    }
}
