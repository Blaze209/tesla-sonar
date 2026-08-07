package kb;

import android.net.Uri;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;

/* JADX INFO: loaded from: classes3.dex */
public class k implements WebMessageListenerBoundaryInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jb.e.a f85799a;

    public k(jb.e.a aVar) {
        this.f85799a = aVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z11, InvocationHandler invocationHandler2) {
        jb.b bVarB = j.b((WebMessageBoundaryInterface) oq0.a.a(WebMessageBoundaryInterface.class, invocationHandler));
        if (bVarB != null) {
            this.f85799a.a(webView, bVarB, uri, z11, h.b(invocationHandler2));
        }
    }
}
