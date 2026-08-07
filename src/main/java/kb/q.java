package kb;

import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: loaded from: classes3.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WebViewProviderBoundaryInterface f85852a;

    public q(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.f85852a = webViewProviderBoundaryInterface;
    }

    public void a(String str, String[] strArr, jb.e.a aVar) {
        this.f85852a.addWebMessageListener(str, strArr, oq0.a.c(new k(aVar)));
    }
}
