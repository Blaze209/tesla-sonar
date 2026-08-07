package kb;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: loaded from: classes3.dex */
public class s implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WebViewProviderFactoryBoundaryInterface f85853a;

    public s(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f85853a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // kb.r
    public String[] a() {
        return this.f85853a.getSupportedFeatures();
    }

    @Override // kb.r
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) oq0.a.a(WebViewProviderBoundaryInterface.class, this.f85853a.createWebView(webView));
    }

    @Override // kb.r
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) oq0.a.a(StaticsBoundaryInterface.class, this.f85853a.getStatics());
    }

    @Override // kb.r
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) oq0.a.a(WebkitToCompatConverterBoundaryInterface.class, this.f85853a.getWebkitToCompatConverter());
    }
}
