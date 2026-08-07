package com.brentvatne.exoplayer;

import android.net.Uri;
import androidx.media3.datasource.AssetDataSource;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.ReactContext;
import java.util.Map;
import okhttp3.CookieJar;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ7\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J#\u0010\u0017\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001e¨\u0006 "}, d2 = {"Lcom/brentvatne/exoplayer/i;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReactContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "h", "(Lcom/facebook/react/bridge/ReactContext;)Ljava/lang/String;", "Ls8/i;", "bandwidthMeter", "", "requestHeaders", "Landroidx/media3/datasource/a$a;", "f", "(Lcom/facebook/react/bridge/ReactContext;Ls8/i;Ljava/util/Map;)Landroidx/media3/datasource/a$a;", "Landroidx/media3/datasource/g;", "g", "(Lcom/facebook/react/bridge/ReactContext;Ls8/i;Ljava/util/Map;)Landroidx/media3/datasource/g;", DateTokenConverter.CONVERTER_KEY, "e", "Landroid/net/Uri;", "srcUri", "b", "(Lcom/facebook/react/bridge/ReactContext;Landroid/net/Uri;)Landroidx/media3/datasource/a$a;", "Landroidx/media3/datasource/a$a;", "defaultDataSourceFactory", "c", "Landroidx/media3/datasource/g;", "defaultHttpDataSourceFactory", "Ljava/lang/String;", "userAgent", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f20306a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static androidx.media3.datasource.a.InterfaceC0192a defaultDataSourceFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static androidx.media3.datasource.g defaultHttpDataSourceFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static String userAgent;

    private i() {
    }

    public static final androidx.media3.datasource.a.InterfaceC0192a b(ReactContext context, Uri srcUri) throws AssetDataSource.AssetDataSourceException {
        p013kotlin.jvm.internal.s.h(srcUri);
        v7.j jVar = new v7.j(srcUri);
        p013kotlin.jvm.internal.s.h(context);
        final AssetDataSource assetDataSource = new AssetDataSource(context);
        assetDataSource.j(jVar);
        return new androidx.media3.datasource.a.InterfaceC0192a() { // from class: com.brentvatne.exoplayer.h
            @Override // androidx.media3.datasource.a.InterfaceC0192a
            public final androidx.media3.datasource.a a() {
                return i.c(assetDataSource);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.media3.datasource.a c(AssetDataSource assetDataSource) {
        return assetDataSource;
    }

    private final androidx.media3.datasource.a.InterfaceC0192a d(ReactContext context, s8.i bandwidthMeter, Map<String, String> requestHeaders) {
        return new androidx.media3.datasource.c.a(context, e(context, bandwidthMeter, requestHeaders));
    }

    private final androidx.media3.datasource.g e(ReactContext context, s8.i bandwidthMeter, Map<String, String> requestHeaders) {
        OkHttpClient okHttpClientF = com.facebook.react.modules.network.h.f();
        CookieJar cookieJar = okHttpClientF.cookieJar();
        p013kotlin.jvm.internal.s.i(cookieJar, "null cannot be cast to non-null type com.facebook.react.modules.network.CookieJarContainer");
        ((com.facebook.react.modules.network.a) cookieJar).b(new JavaNetCookieJar(new com.facebook.react.modules.network.d(context)));
        p013kotlin.jvm.internal.s.i(okHttpClientF, "null cannot be cast to non-null type okhttp3.Call.Factory");
        x7.a.b bVarD = new x7.a.b(okHttpClientF).d(bandwidthMeter);
        p013kotlin.jvm.internal.s.j(bVarD, "setTransferListener(...)");
        if (requestHeaders == null) {
            p013kotlin.jvm.internal.s.h(bVarD.e(h(context)));
            return bVarD;
        }
        bVarD.c(requestHeaders);
        if (!requestHeaders.containsKey("User-Agent")) {
            bVarD.e(h(context));
        }
        return bVarD;
    }

    public static final androidx.media3.datasource.a.InterfaceC0192a f(ReactContext context, s8.i bandwidthMeter, Map<String, String> requestHeaders) {
        p013kotlin.jvm.internal.s.k(context, "context");
        if (defaultDataSourceFactory == null || (requestHeaders != null && !requestHeaders.isEmpty())) {
            defaultDataSourceFactory = f20306a.d(context, bandwidthMeter, requestHeaders);
        }
        androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a = defaultDataSourceFactory;
        p013kotlin.jvm.internal.s.i(interfaceC0192a, "null cannot be cast to non-null type androidx.media3.datasource.DataSource.Factory");
        return interfaceC0192a;
    }

    public static final androidx.media3.datasource.g g(ReactContext context, s8.i bandwidthMeter, Map<String, String> requestHeaders) {
        p013kotlin.jvm.internal.s.k(context, "context");
        if (defaultHttpDataSourceFactory == null || (requestHeaders != null && !requestHeaders.isEmpty())) {
            defaultHttpDataSourceFactory = f20306a.e(context, bandwidthMeter, requestHeaders);
        }
        androidx.media3.datasource.g gVar = defaultHttpDataSourceFactory;
        p013kotlin.jvm.internal.s.i(gVar, "null cannot be cast to non-null type androidx.media3.datasource.HttpDataSource.Factory");
        return gVar;
    }

    private final String h(ReactContext context) {
        if (userAgent == null) {
            userAgent = s7.q0.D0(context, context.getPackageName());
        }
        String str = userAgent;
        p013kotlin.jvm.internal.s.i(str, "null cannot be cast to non-null type kotlin.String");
        return str;
    }
}
