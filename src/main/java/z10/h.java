package z10;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0007\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0019\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00178F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0019¨\u0006\u001b"}, d2 = {"Lz10/h;", "", "Ljava/util/EnumSet;", "Lz10/j;", "tlsVersions", "<init>", "(Ljava/util/EnumSet;)V", "a", "Ljava/util/EnumSet;", "Ljavax/net/ssl/X509TrustManager;", "b", "Ljavax/net/ssl/X509TrustManager;", "()Ljavax/net/ssl/X509TrustManager;", "e", "(Ljavax/net/ssl/X509TrustManager;)V", "trustManager", "Ljavax/net/ssl/SSLSocketFactory;", "c", "Ljavax/net/ssl/SSLSocketFactory;", "()Ljavax/net/ssl/SSLSocketFactory;", DateTokenConverter.CONVERTER_KEY, "(Ljavax/net/ssl/SSLSocketFactory;)V", "sslSocketFactory", "", "", "()[Ljava/lang/String;", "versions", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final EnumSet<j> tlsVersions;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public X509TrustManager trustManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public SSLSocketFactory sslSocketFactory;

    public h(EnumSet<j> tlsVersions) {
        s.k(tlsVersions, "tlsVersions");
        this.tlsVersions = tlsVersions;
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    s.i(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                    e((X509TrustManager) trustManager);
                    d(new i(c()));
                    return;
                }
            }
            throw new IllegalStateException(("Unexpected default trust managers:" + Arrays.toString(trustManagers)).toString());
        } catch (KeyManagementException e11) {
            e11.printStackTrace();
        } catch (KeyStoreException e12) {
            e12.printStackTrace();
        } catch (NoSuchAlgorithmException e13) {
            e13.printStackTrace();
        }
    }

    public final SSLSocketFactory a() {
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactory;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        s.B("sslSocketFactory");
        return null;
    }

    public final X509TrustManager b() {
        X509TrustManager x509TrustManager = this.trustManager;
        if (x509TrustManager != null) {
            return x509TrustManager;
        }
        s.B("trustManager");
        return null;
    }

    public final String[] c() {
        String[] strArr = new String[this.tlsVersions.size()];
        Iterator<j> it = this.tlsVersions.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            strArr[i11] = it.next().toString();
            i11++;
        }
        return strArr;
    }

    public final void d(SSLSocketFactory sSLSocketFactory) {
        s.k(sSLSocketFactory, "<set-?>");
        this.sslSocketFactory = sSLSocketFactory;
    }

    public final void e(X509TrustManager x509TrustManager) {
        s.k(x509TrustManager, "<set-?>");
        this.trustManager = x509TrustManager;
    }
}
