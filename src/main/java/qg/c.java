package qg;

import android.app.Activity;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f105382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f105383b;

    public c(Activity activity, String str) {
        super(activity);
        this.f105382a = activity;
        this.f105383b = str;
    }

    public static void k(WebView webView) {
        if (webView != null) {
            try {
                webView.resumeTimers();
            } catch (Throwable unused) {
            }
        }
    }

    public void l(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        CookieSyncManager.createInstance(this.f105382a.getApplicationContext()).sync();
        CookieManager.getInstance().setCookie(str, str2);
        CookieSyncManager.getInstance().sync();
    }

    public boolean m() {
        return "v1".equals(this.f105383b);
    }

    public abstract boolean n();

    public abstract void o();
}
