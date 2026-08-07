package vf0;

import android.app.Activity;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    WebView f119269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Activity f119270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    h f119271c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f119275g = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Map f119272d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Map f119273e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f119274f = 0;

    public c(Activity activity, WebView webView, h hVar) {
        byte b11 = 0;
        this.f119270b = activity;
        this.f119269a = webView;
        this.f119271c = hVar;
        WebSettings settings = this.f119269a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setAllowFileAccess(false);
        settings.setDomStorageEnabled(true);
        try {
            this.f119269a.removeJavascriptInterface("accessibility");
            this.f119269a.removeJavascriptInterface("accessibilityTraversal");
            this.f119269a.removeJavascriptInterface("searchBoxJavaBridge_");
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        this.f119269a.addJavascriptInterface(this, "_WebViewJavascriptBridge");
        this.f119269a.setWebViewClient(new g(this, b11));
        this.f119269a.setWebChromeClient(new f(this, (byte) 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        HashMap map = new HashMap();
        map.put("responseId", str);
        map.put("responseData", str2);
        b(map);
    }

    private void b(Map map) {
        String string = new JSONObject(map).toString();
        xf0.j.b("uppay", "sending:" + string);
        this.f119270b.runOnUiThread(new f0(this, String.format("javascript:WebViewJavascriptBridge._handleMessageFromJava('%s');", e(string))));
    }

    private String e(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"").replace("'", "\\'").replace("\n", "\\n").replace("\r", "\\r").replace("\f", "\\f");
    }

    @JavascriptInterface
    public void _handleMessageFromJs(String str, String str2, String str3, String str4, String str5) {
        h hVar;
        if (str2 != null) {
            ((i) this.f119273e.get(str2)).a(str3);
            this.f119273e.remove(str2);
            return;
        }
        e eVar = str4 != null ? new e(this, str4) : null;
        if (str5 != null) {
            hVar = (h) this.f119272d.get(str5);
            if (hVar == null) {
                xf0.j.d("uppay", "WVJB Warning: No handler for " + str5);
                return;
            }
        } else {
            hVar = this.f119271c;
        }
        try {
            this.f119270b.runOnUiThread(new e0(this, hVar, str, eVar));
        } catch (Exception e11) {
            xf0.j.d("uppay", "WebViewJavascriptBridge: WARNING: java handler threw. " + e11.getMessage());
        }
    }

    public void f(String str, h hVar) {
        this.f119272d.put(str, hVar);
    }

    public void g(boolean z11) {
        this.f119275g = z11;
    }
}
