package com.facebook.react.modules.network;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.File;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/facebook/react/modules/network/h;", "", "<init>", "()V", "Lokhttp3/OkHttpClient;", "f", "()Lokhttp3/OkHttpClient;", "a", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "b", "(Landroid/content/Context;)Lokhttp3/OkHttpClient;", "Lokhttp3/OkHttpClient$Builder;", "c", "()Lokhttp3/OkHttpClient$Builder;", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;)Lokhttp3/OkHttpClient$Builder;", "", "cacheSize", "e", "(Landroid/content/Context;I)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/OkHttpClient;", "getClient$ReactAndroid_release", "setClient$ReactAndroid_release", "(Lokhttp3/OkHttpClient;)V", "client", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f22833a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static OkHttpClient client;

    private h() {
    }

    public static final OkHttpClient a() {
        return c().build();
    }

    public static final OkHttpClient b(Context context) {
        s.k(context, "context");
        return d(context).build();
    }

    public static final OkHttpClient.Builder c() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return builder.connectTimeout(0L, timeUnit).readTimeout(0L, timeUnit).writeTimeout(0L, timeUnit).cookieJar(new n());
    }

    public static final OkHttpClient.Builder d(Context context) {
        s.k(context, "context");
        return e(context, 10485760);
    }

    public static final OkHttpClient.Builder e(Context context, int cacheSize) {
        s.k(context, "context");
        OkHttpClient.Builder builderC = c();
        return cacheSize == 0 ? builderC : builderC.cache(new Cache(new File(context.getCacheDir(), "http-cache"), cacheSize));
    }

    public static final OkHttpClient f() {
        OkHttpClient okHttpClient = client;
        if (okHttpClient != null) {
            return okHttpClient;
        }
        OkHttpClient okHttpClientA = a();
        client = okHttpClientA;
        return okHttpClientA;
    }
}
