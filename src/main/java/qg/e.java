package qg;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.JsPromptResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import di.m;
import di.p;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class e extends LinearLayout {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static Handler f105409m = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f105410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f105411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f105412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ProgressBar f105413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WebView f105414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2235e f105415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f105416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g f105417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h f105418i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ai.a f105419j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View.OnClickListener f105420k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f105421l;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: qg.e$a$a, reason: collision with other inner class name */
        public class RunnableC2234a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ View f105423a;

            public RunnableC2234a(View view) {
                this.f105423a = view;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f105423a.setEnabled(true);
            }
        }

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h hVar = e.this.f105418i;
            if (hVar != null) {
                view.setEnabled(false);
                e.f105409m.postDelayed(new RunnableC2234a(view), 256L);
                if (view == e.this.f105410a) {
                    hVar.i(e.this);
                } else if (view == e.this.f105412c) {
                    hVar.j(e.this);
                }
            }
        }
    }

    public class b implements DownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f105425a;

        public b(Context context) {
            this.f105425a = context;
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j11) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                this.f105425a.startActivity(intent);
            } catch (Throwable unused) {
            }
        }
    }

    public class c extends WebChromeClient {
        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            return e.this.f105416g.b(e.this, str, str2, str3, jsPromptResult);
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i11) {
            if (!e.this.f105415f.f105430b) {
                e.this.f105413d.setVisibility(8);
            } else {
                if (i11 > 90) {
                    e.this.f105413d.setVisibility(4);
                    return;
                }
                if (e.this.f105413d.getVisibility() == 4) {
                    e.this.f105413d.setVisibility(0);
                }
                e.this.f105413d.setProgress(i11);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            e.this.f105416g.a(e.this, str);
        }
    }

    public class d extends WebViewClient {
        public d() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (e.this.f105417h.f(e.this, str)) {
                return;
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (e.this.f105417h.e(e.this, str)) {
                return;
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i11, String str, String str2) {
            if (e.this.f105417h.h(e.this, i11, str, str2)) {
                return;
            }
            super.onReceivedError(webView, i11, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (e.this.f105417h.d(e.this, sslErrorHandler, sslError)) {
                return;
            }
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            return e.this.f105417h.c(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (e.this.f105417h.g(e.this, str)) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    /* JADX INFO: renamed from: qg.e$e, reason: collision with other inner class name */
    public static final class C2235e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f105429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f105430b;

        public C2235e(boolean z11, boolean z12) {
            this.f105429a = z11;
            this.f105430b = z12;
        }
    }

    public interface f {
        void a(e eVar, String str);

        boolean b(e eVar, String str, String str2, String str3, JsPromptResult jsPromptResult);
    }

    public interface g {
        WebResourceResponse c(WebView webView, String str);

        boolean d(e eVar, SslErrorHandler sslErrorHandler, SslError sslError);

        boolean e(e eVar, String str);

        boolean f(e eVar, String str);

        boolean g(e eVar, String str);

        boolean h(e eVar, int i11, String str, String str2);
    }

    public interface h {
        void i(e eVar);

        void j(e eVar);
    }

    public e(Context context, ai.a aVar, C2235e c2235e) {
        this(context, null, aVar, c2235e);
    }

    public final int a(int i11) {
        return (int) (i11 * this.f105421l);
    }

    public final void d(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackgroundColor(-218103809);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setVisibility(this.f105415f.f105429a ? 0 : 8);
        ImageView imageView = new ImageView(context);
        this.f105410a = imageView;
        imageView.setOnClickListener(this.f105420k);
        ImageView imageView2 = this.f105410a;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        this.f105410a.setImageDrawable(m.a("iVBORw0KGgoAAAANSUhEUgAAAEgAAABIBAMAAACnw650AAAAFVBMVEUAAAARjusRkOkQjuoRkeoRj+oQjunya570AAAABnRSTlMAinWeSkk7CjRNAAAAZElEQVRIx+3MOw6AIBQF0YsrMDGx1obaLeGH/S9BQgkJ82rypp4ceTN1ilvyKizmZIAyU7FML0JVYig55BBAfQ2EU4V4CpZJ+2AiSj11C6rUoTannBpRn4W6xNQjLBSI2+TN0w/+3HT2wPClrQAAAABJRU5ErkJggg==", context));
        this.f105410a.setPadding(a(12), 0, a(12), 0);
        linearLayout.addView(this.f105410a, new LinearLayout.LayoutParams(-2, -2));
        View view = new View(context);
        view.setBackgroundColor(-2500135);
        linearLayout.addView(view, new LinearLayout.LayoutParams(a(1), a(25)));
        TextView textView = new TextView(context);
        this.f105411b = textView;
        textView.setTextColor(-15658735);
        this.f105411b.setTextSize(17.0f);
        this.f105411b.setMaxLines(1);
        this.f105411b.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(a(17), 0, 0, 0);
        layoutParams.weight = 1.0f;
        linearLayout.addView(this.f105411b, layoutParams);
        ImageView imageView3 = new ImageView(context);
        this.f105412c = imageView3;
        imageView3.setOnClickListener(this.f105420k);
        this.f105412c.setScaleType(scaleType);
        this.f105412c.setImageDrawable(m.a("iVBORw0KGgoAAAANSUhEUgAAAEgAAABICAMAAABiM0N1AAAAmVBMVEUAAAARj+oQjuoRkOsVk/AQj+oRjuoQj+oSkO3///8Rj+kRj+oQkOsTk+whm/8Qj+oRj+oQj+oSkus2p/8QjuoQj+oQj+oQj+oQj+oRj+oTkuwRj+oQj+oRj+oRj+oSkOsSkO0ZlfMbk+8XnPgQj+oRj+oQj+oQj+sSj+sRkOoSkescqv8Rj+oQj+oSj+sXku4Rj+kQjuoQjumXGBCVAAAAMnRSTlMAxPtPF8ry7CoB9npbGwe6lm0wBODazb1+aSejm5GEYjcTDwvls6uJc0g/CdWfRCF20AXrk5QAAAJqSURBVFjD7ZfXmpswEIUFphmDCxi3talurGvm/R8uYSDe5FNBwlzsxf6XmvFBmiaZ/PCdWDk9CWn61OhHCMAaXfoRAth7wx6EkMXnWyrho4yg4bDpquI8Jy78Q7eoj9cmUFijsaLM0JsD9CD0uQAa9aNdPuCFvbA7B9t/Becap8Pu6Q/2jcyH81VHc/WCHDQZXwbvtUhQ61iDlqadncU6Rp31yGkZIzOAu7AjtPpYGREzq/pY5DRFHS1siyO6HfkOKTrMjdb2qevV4zosK7MbkFY2LmYk55hL6juCIFWMOI2KGzblmho3b18EIbxL1hs6r5m2Q2WaEElwS3NW4xh6ZZJuzTtUsBKT4G0h35s4y1mNgkNoS6TZ8SKBXTZQGBNYdPTozXGYKoyLAmOasttjThT4xT6Ch+2qIjRhV9Ja3NC87Kyo5We1vCNEMW1T+j1VLZ9UhE54Q1DL52r5piJ0YxdegvWlHOwTu76uKkJX+MOTHno4YFSEbHYdhViojsLrCTg/MKnhKWaEYzvkZFM8aOkPH7iTSvoFZKD7jGEJbarkRaxQyOeWvGVIbsji152jK7TbDgRzcIuz7SGj89BFU8d30TqWeDtrILxyTkD1IXfvmHseuU3lVHDz607bw0f3xDqejm5ncd0j8VDwfoibRy8RcgTkWHBvocbDbMlJsQAkGnAOHwGy90kLmQY1Wkob07/GaCNRIzdoWK7/+6y/XkLDJCcynOGFuUrKIMuCMonNr9VpSOQoIxBgJ0SacGbzZNy4ICrkscvU2fpElYz+U3sd+aQThjfVmjNa5i15kLcojM3Gz8kP34jf4VaV3X55gNEAAAAASUVORK5CYII=", context));
        this.f105412c.setPadding(a(12), 0, a(12), 0);
        linearLayout.addView(this.f105412c, new LinearLayout.LayoutParams(-2, -2));
        addView(linearLayout, new LinearLayout.LayoutParams(-1, a(48)));
    }

    public void e(WebView webView, Context context) {
        String userAgentString = webView.getSettings().getUserAgentString();
        webView.getSettings().setUserAgentString(userAgentString + p.W(context));
    }

    public void f(String str) {
        this.f105414e.loadUrl(str);
        qg.c.k(this.f105414e);
    }

    public void g(String str, byte[] bArr) {
        this.f105414e.postUrl(str, bArr);
    }

    public ImageView getBackButton() {
        return this.f105410a;
    }

    public ProgressBar getProgressbar() {
        return this.f105413d;
    }

    public ImageView getRefreshButton() {
        return this.f105412c;
    }

    public TextView getTitle() {
        return this.f105411b;
    }

    public String getUrl() {
        return this.f105414e.getUrl();
    }

    public WebView getWebView() {
        return this.f105414e;
    }

    public void i() {
        removeAllViews();
        this.f105414e.removeAllViews();
        this.f105414e.setWebViewClient(null);
        this.f105414e.setWebChromeClient(null);
        this.f105414e.destroy();
    }

    public final void j(Context context) {
        ProgressBar progressBar = new ProgressBar(context, null, R.style.Widget.ProgressBar.Horizontal);
        this.f105413d = progressBar;
        progressBar.setProgressDrawable(context.getResources().getDrawable(R.drawable.progress_horizontal));
        this.f105413d.setMax(100);
        this.f105413d.setBackgroundColor(-218103809);
        addView(this.f105413d, new LinearLayout.LayoutParams(-1, a(2)));
    }

    public final void l(Context context) {
        WebView webView = new WebView(context);
        this.f105414e = webView;
        webView.setVerticalScrollbarOverlay(true);
        e(this.f105414e, context);
        WebSettings settings = this.f105414e.getSettings();
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setSupportMultipleWindows(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(false);
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setCacheMode(1);
        settings.setDomStorageEnabled(true);
        settings.setAllowContentAccess(false);
        this.f105414e.setVerticalScrollbarOverlay(true);
        if (lh.b.E().B(this.f105419j)) {
            WebView webView2 = this.f105414e;
            webView2.addJavascriptInterface(new og.a(context, webView2, this.f105419j), "AlipayChinaMobileBridge");
        }
        this.f105414e.setDownloadListener(new b(context));
        try {
            try {
                this.f105414e.removeJavascriptInterface("searchBoxJavaBridge_");
                this.f105414e.removeJavascriptInterface("accessibility");
                this.f105414e.removeJavascriptInterface("accessibilityTraversal");
            } catch (Throwable unused) {
            }
        } catch (Exception unused2) {
            Method method = this.f105414e.getClass().getMethod("removeJavascriptInterface", null);
            if (method != null) {
                method.invoke(this.f105414e, "searchBoxJavaBridge_");
                method.invoke(this.f105414e, "accessibility");
                method.invoke(this.f105414e, "accessibilityTraversal");
            }
        }
        qg.c.k(this.f105414e);
        addView(this.f105414e, new LinearLayout.LayoutParams(-1, -1));
    }

    public void setChromeProxy(f fVar) {
        this.f105416g = fVar;
        if (fVar == null) {
            this.f105414e.setWebChromeClient(null);
        } else {
            this.f105414e.setWebChromeClient(new c());
        }
    }

    public void setWebClientProxy(g gVar) {
        this.f105417h = gVar;
        if (gVar == null) {
            this.f105414e.setWebViewClient(null);
        } else {
            this.f105414e.setWebViewClient(new d());
        }
    }

    public void setWebEventProxy(h hVar) {
        this.f105418i = hVar;
    }

    public e(Context context, AttributeSet attributeSet, ai.a aVar, C2235e c2235e) {
        super(context, attributeSet);
        this.f105420k = new a();
        this.f105415f = c2235e == null ? new C2235e(false, false) : c2235e;
        this.f105419j = aVar;
        this.f105421l = context.getResources().getDisplayMetrics().density;
        setOrientation(1);
        d(context);
        j(context);
        l(context);
    }
}
