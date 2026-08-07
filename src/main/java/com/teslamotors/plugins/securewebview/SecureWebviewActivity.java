package com.teslamotors.plugins.securewebview;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.ImagesContract;
import com.plaid.internal.EnumC4419g;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public class SecureWebviewActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<String> f57039a = new HashSet(Arrays.asList("js.stripe.com", "tesla-cdn.thron.com"));

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SecureWebviewActivity.this.d();
        }
    }

    private class b extends WebViewClient {
        private boolean a(WebView webView, Uri uri) {
            if (SecureWebviewActivity.this.c(uri)) {
                String string = uri.toString();
                if (SecureWebviewActivity.this.getIntent().getBooleanExtra("allowPDFs", false) && (string.endsWith(".pdf") || string.contains("/public/document/tesla") || string.contains("tesla-contents/image/upload"))) {
                    webView.loadUrl("https://docs.google.com/viewer?url=" + Uri.encode(string));
                } else {
                    webView.loadUrl(string);
                }
            } else {
                webView.loadUrl("https://www.tesla.com");
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            webView.loadUrl("https://www.tesla.com");
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return a(webView, Uri.parse(str));
        }

        private b() {
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(24)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return a(webView, webResourceRequest.getUrl());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(Uri uri) {
        String host = uri.getHost();
        return "https".equals(uri.getScheme()) && (Pattern.matches(".*\\.tesla(motors)?\\.(com|cn)$", host) || f57039a.contains(host));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        setResult(EnumC4419g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE);
        androidx.core.app.b.c(this);
    }

    private void e(WebView webView) {
        WebSettings settings = webView.getSettings();
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        webView.setWebViewClient(new b());
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        d();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.teslamotors.plugins.securewebview.b.f57049a);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("header");
        String stringExtra2 = intent.getStringExtra(ImagesContract.URL);
        int intExtra = intent.getIntExtra("controlTintColor", -7829368);
        int intExtra2 = intent.getIntExtra("barTintColor", -16777216);
        TextView textView = (TextView) findViewById(com.teslamotors.plugins.securewebview.a.f57045a);
        LinearLayout linearLayout = (LinearLayout) findViewById(com.teslamotors.plugins.securewebview.a.f57046b);
        TextView textView2 = (TextView) findViewById(com.teslamotors.plugins.securewebview.a.f57048d);
        WebView webView = (WebView) findViewById(com.teslamotors.plugins.securewebview.a.f57047c);
        e(webView);
        webView.loadUrl(stringExtra2);
        linearLayout.setBackgroundColor(intExtra2);
        textView2.setText(stringExtra);
        textView2.setTextColor(intExtra);
        textView.setOnClickListener(new a());
    }
}
