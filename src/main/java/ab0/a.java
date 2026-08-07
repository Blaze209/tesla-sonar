package ab0;

import android.util.Base64;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p013kotlin.text.m;
import p013kotlin.text.q;
import p013kotlin.text.t;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0006\u001a\u00020\u0000*\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\r\u001a\u00020\t*\u00020\f¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u0010\u001a\u00020\t*\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0012\u001a\u00020\u0000*\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"", "", "Ljava/security/cert/X509Certificate;", "a", "(Ljava/lang/String;)Ljava/util/List;", "", "f", "([B)Ljava/lang/String;", "Ljava/security/interfaces/RSAPublicKey;", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/security/interfaces/RSAPublicKey;)I", "Ljava/security/interfaces/ECPublicKey;", "c", "(Ljava/security/interfaces/ECPublicKey;)I", "Ljava/security/PublicKey;", "b", "(Ljava/security/PublicKey;)I", "e", "(Ljava/security/PublicKey;)Ljava/lang/String;", "ChargingMetrology_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: ab0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/text/m;", "it", "Ljava/security/cert/X509Certificate;", "<anonymous>", "(Lkotlin/text/m;)Ljava/security/cert/X509Certificate;"}, k = 3, mv = {1, 5, 1})
    static final class C0031a extends u implements l<m, X509Certificate> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CertificateFactory f911c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0031a(CertificateFactory certificateFactory) {
            super(1);
            this.f911c = certificateFactory;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X509Certificate invoke(m it) throws CertificateException {
            s.k(it, "it");
            byte[] bytes = Base64.decode(t.V(it.a().getMatch().c().get(1), "\n", "", false, 4, null), 0);
            CertificateFactory certificateFactory = this.f911c;
            s.j(bytes, "bytes");
            Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(bytes));
            if (certificateGenerateCertificate instanceof X509Certificate) {
                return (X509Certificate) certificateGenerateCertificate;
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0005\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "eachByte", ""}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class b extends u implements l<Byte, CharSequence> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f912c = new b();

        b() {
            super(1);
        }

        public final CharSequence a(byte b11) {
            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b11)}, 1));
            s.j(str, "java.lang.String.format(this, *args)");
            return str;
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ CharSequence invoke(Byte b11) {
            return a(b11.byteValue());
        }
    }

    public static final List<X509Certificate> a(String str) {
        s.k(str, "<this>");
        try {
            return ho0.l.c0(ho0.l.V(q.f(new q("-+BEGIN CERTIFICATE-+(.*?)-+END CERTIFICATE-+", p013kotlin.text.s.DOT_MATCHES_ALL), str, 0, 2, null), new C0031a(CertificateFactory.getInstance("X.509"))));
        } catch (Exception unused) {
            return null;
        }
    }

    public static final int b(PublicKey publicKey) {
        s.k(publicKey, "<this>");
        if (publicKey instanceof RSAPublicKey) {
            return d((RSAPublicKey) publicKey);
        }
        if (publicKey instanceof ECPublicKey) {
            return c((ECPublicKey) publicKey);
        }
        return -1;
    }

    public static final int c(ECPublicKey eCPublicKey) {
        BigInteger order;
        s.k(eCPublicKey, "<this>");
        ECParameterSpec params = eCPublicKey.getParams();
        int iBitLength = 0;
        if (params != null && (order = params.getOrder()) != null) {
            iBitLength = order.bitLength();
        }
        if (iBitLength == 256) {
            return 26;
        }
        if (iBitLength != 384) {
            return iBitLength != 521 ? -1 : 25;
        }
        return 23;
    }

    public static final int d(RSAPublicKey rSAPublicKey) {
        s.k(rSAPublicKey, "<this>");
        int iBitLength = rSAPublicKey.getModulus().bitLength();
        return (iBitLength == 2048 || iBitLength == 4096) ? 24 : -1;
    }

    public static final String e(PublicKey publicKey) {
        s.k(publicKey, "<this>");
        int iB = b(publicKey);
        if (iB == -1) {
            byte[] encoded = publicKey.getEncoded();
            s.j(encoded, "this.encoded");
            return f(encoded);
        }
        byte[] encoded2 = publicKey.getEncoded();
        s.j(encoded2, "this.encoded");
        return f(v.g1(n.g1(encoded2, bo0.n.w(iB, publicKey.getEncoded().length))));
    }

    public static final String f(byte[] bArr) {
        s.k(bArr, "<this>");
        return n.P0(bArr, "", null, null, 0, null, b.f912c, 30, null);
    }
}
