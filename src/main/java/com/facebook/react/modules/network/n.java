package com.facebook.react.modules.network;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J%\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/modules/network/n;", "Lcom/facebook/react/modules/network/a;", "<init>", "()V", "Lokhttp3/CookieJar;", "cookieJar", "Ljn0/h0;", "b", "(Lokhttp3/CookieJar;)V", "a", "Lokhttp3/HttpUrl;", ImagesContract.URL, "", "Lokhttp3/Cookie;", "cookies", "saveFromResponse", "(Lokhttp3/HttpUrl;Ljava/util/List;)V", "loadForRequest", "(Lokhttp3/HttpUrl;)Ljava/util/List;", "Lokhttp3/CookieJar;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private CookieJar cookieJar;

    @Override // com.facebook.react.modules.network.a
    public void a() {
        this.cookieJar = null;
    }

    @Override // com.facebook.react.modules.network.a
    public void b(CookieJar cookieJar) {
        s.k(cookieJar, "cookieJar");
        this.cookieJar = cookieJar;
    }

    @Override // okhttp3.CookieJar
    public List<Cookie> loadForRequest(HttpUrl url) {
        s.k(url, "url");
        CookieJar cookieJar = this.cookieJar;
        if (cookieJar == null) {
            return v.m();
        }
        List<Cookie> listLoadForRequest = cookieJar.loadForRequest(url);
        ArrayList arrayList = new ArrayList();
        for (Cookie cookie : listLoadForRequest) {
            try {
                new Headers.Builder().add(cookie.getName(), cookie.getValue());
                arrayList.add(cookie);
            } catch (IllegalArgumentException unused) {
            }
        }
        return arrayList;
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
        s.k(url, "url");
        s.k(cookies, "cookies");
        CookieJar cookieJar = this.cookieJar;
        if (cookieJar != null) {
            cookieJar.saveFromResponse(url, cookies);
        }
    }
}
