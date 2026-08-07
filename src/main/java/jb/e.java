package jb;

import android.annotation.SuppressLint;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.WeakHashMap;
import kb.o;
import kb.p;
import kb.q;
import kb.r;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Uri f83478a = Uri.parse(Marker.ANY_MARKER);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Uri f83479b = Uri.parse("");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f83480c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final WeakHashMap<WebView, q> f83481d = new WeakHashMap<>();

    public interface a {
        void a(WebView webView, b bVar, Uri uri, boolean z11, jb.a aVar);
    }

    public static void a(WebView webView, String str, Set<String> set, a aVar) {
        if (!o.V.c()) {
            throw o.a();
        }
        f(webView).a(str, (String[]) set.toArray(new String[0]), aVar);
    }

    private static WebViewProviderBoundaryInterface b(WebView webView) {
        return d().createWebView(webView);
    }

    public static PackageInfo c() {
        if (Build.VERSION.SDK_INT >= 26) {
            return kb.b.a();
        }
        try {
            return e();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    private static r d() {
        return p.d();
    }

    @SuppressLint({"PrivateApi"})
    private static PackageInfo e() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    private static q f(WebView webView) {
        if (!o.f85839s0.c() || !f83480c) {
            return new q(b(webView));
        }
        WeakHashMap<WebView, q> weakHashMap = f83481d;
        q qVar = weakHashMap.get(webView);
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(b(webView));
        weakHashMap.put(webView, qVar2);
        return qVar2;
    }

    public static boolean g() {
        if (o.S.c()) {
            return d().getStatics().isMultiProcessEnabled();
        }
        throw o.a();
    }
}
