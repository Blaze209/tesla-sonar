package com.fourthline.orca.internal;

import ch.qos.logback.core.net.ssl.SSL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.sg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3816sg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f35307c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f35308d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X509TrustManager f35309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SSLContext f35310b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sg$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3816sg(String baseUrl) throws NoSuchAlgorithmException, KeyManagementException {
        p013kotlin.jvm.internal.s.k(baseUrl, "baseUrl");
        C3859tg c3859tg = new C3859tg(baseUrl);
        this.f35309a = c3859tg;
        SSLContext sSLContext = SSLContext.getInstance(SSL.DEFAULT_PROTOCOL);
        sSLContext.init(null, new X509TrustManager[]{c3859tg}, null);
        p013kotlin.jvm.internal.s.j(sSLContext, "apply(...)");
        this.f35310b = sSLContext;
    }

    public final SSLContext a() {
        return this.f35310b;
    }

    public final X509TrustManager b() {
        return this.f35309a;
    }
}
