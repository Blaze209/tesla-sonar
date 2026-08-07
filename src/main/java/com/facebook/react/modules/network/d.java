package com.facebook.react.modules.network;

import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContext;
import com.google.android.gms.common.internal.ImagesContract;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJD\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u0003J#\u0010\u001c\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u001c\u0010\u001dR\u001e\u0010#\u001a\u0004\u0018\u00010\u001e8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/facebook/react/modules/network/d;", "Ljava/net/CookieHandler;", "<init>", "()V", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "(Lcom/facebook/react/bridge/ReactContext;)V", "", ImagesContract.URL, "cookie", "Ljn0/h0;", "b", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/net/URI;", "uri", "", "", "headers", "get", "(Ljava/net/URI;Ljava/util/Map;)Ljava/util/Map;", "put", "(Ljava/net/URI;Ljava/util/Map;)V", "Lcom/facebook/react/bridge/Callback;", "callback", DateTokenConverter.CONVERTER_KEY, "(Lcom/facebook/react/bridge/Callback;)V", "f", "cookies", "c", "(Ljava/lang/String;Ljava/util/List;)V", "Landroid/webkit/CookieManager;", "a", "Landroid/webkit/CookieManager;", "g", "()Landroid/webkit/CookieManager;", "cookieManager", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d extends CookieHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f22826b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private CookieManager cookieManager;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/facebook/react/modules/network/d$a;", "", "<init>", "()V", "", "name", "", "b", "(Ljava/lang/String;)Z", "VERSION_ZERO_HEADER", "Ljava/lang/String;", "VERSION_ONE_HEADER", "COOKIE_HEADER", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(String name) {
            return t.M(name, "Set-cookie", true) || t.M(name, "Set-cookie2", true);
        }

        private a() {
        }
    }

    public d() {
    }

    private final void b(String url, String cookie) {
        CookieManager cookieManagerG = g();
        if (cookieManagerG != null) {
            cookieManagerG.setCookie(url, cookie, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Callback callback, Boolean bool) {
        callback.invoke(bool);
    }

    private final CookieManager g() {
        if (this.cookieManager == null) {
            try {
                this.cookieManager = CookieManager.getInstance();
            } catch (IllegalArgumentException | Exception unused) {
                return null;
            }
        }
        return this.cookieManager;
    }

    public final void c(String url, List<String> cookies) {
        s.k(url, "url");
        s.k(cookies, "cookies");
        Iterator<String> it = cookies.iterator();
        while (it.hasNext()) {
            b(url, it.next());
        }
        CookieManager cookieManagerG = g();
        if (cookieManagerG != null) {
            cookieManagerG.flush();
        }
    }

    public final void d(final Callback callback) {
        s.k(callback, "callback");
        CookieManager cookieManagerG = g();
        if (cookieManagerG != null) {
            cookieManagerG.removeAllCookies(new ValueCallback() { // from class: com.facebook.react.modules.network.c
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    d.e(callback, (Boolean) obj);
                }
            });
        }
    }

    public final void f() {
    }

    @Override // java.net.CookieHandler
    public Map<String, List<String>> get(URI uri, Map<String, ? extends List<String>> headers) {
        s.k(uri, "uri");
        s.k(headers, "headers");
        CookieManager cookieManagerG = g();
        String cookie = cookieManagerG != null ? cookieManagerG.getCookie(uri.toString()) : null;
        return (cookie == null || cookie.length() == 0) ? v0.i() : v0.f(x.a("Cookie", v.e(cookie)));
    }

    @Override // java.net.CookieHandler
    public void put(URI uri, Map<String, ? extends List<String>> headers) {
        s.k(uri, "uri");
        s.k(headers, "headers");
        String string = uri.toString();
        s.j(string, "toString(...)");
        for (Map.Entry<String, ? extends List<String>> entry : headers.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            if (f22826b.b(key)) {
                c(string, value);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @jn0.e
    public d(ReactContext reactContext) {
        this();
        s.k(reactContext, "reactContext");
    }
}
