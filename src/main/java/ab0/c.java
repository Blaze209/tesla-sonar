package ab0;

import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.gson.g;
import com.tesla.proto.charging.v1.StemUiProto;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidator;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014¨\u0006\u0016"}, d2 = {"Lab0/c;", "", "<init>", "()V", "", "Ljava/security/cert/X509Certificate;", "chain", "", "knownPins", "", "b", "(Ljava/util/List;Ljava/util/List;)Z", "", "data", "signature", "certChain", "Lab0/d;", "a", "([BLjava/util/List;[BLjava/lang/String;)Lab0/d;", "Lab0/b;", "Lab0/b;", "_cache", "ChargingMetrology_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b _cache = new b();

    /* JADX INFO: renamed from: ab0.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lab0/c$a;", "", "<init>", "()V", "", "data", "", "b", "([B)Ljava/lang/String;", "signature", "Ljava/security/PublicKey;", "publicKey", "", DateTokenConverter.CONVERTER_KEY, "([B[BLjava/security/PublicKey;)Z", "", "Ljava/security/cert/X509Certificate;", "certChain", "c", "(Ljava/util/List;)Z", "ChargingMetrology_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(byte[] data) {
            try {
                String strS = new g().g(new e()).b().s(StemUiProto.StemUi.parseFrom(data));
                s.j(strS, "{\n                GsonBu…From(data))\n            }");
                return strS;
            } catch (Exception unused) {
                return "";
            }
        }

        public final boolean c(List<? extends X509Certificate> certChain) throws NoSuchAlgorithmException, CertificateException {
            s.k(certChain, "certChain");
            X509Certificate x509Certificate = certChain.get(0);
            List listX0 = v.X0(certChain, n.w(1, certChain.size()));
            CertPath certPathGenerateCertPath = CertificateFactory.getInstance("X.509").generateCertPath(v.e(x509Certificate));
            s.j(certPathGenerateCertPath, "cf.generateCertPath(\n   …rtToVerify)\n            )");
            List list = listX0;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new TrustAnchor((X509Certificate) it.next(), null));
            }
            CertPathValidator certPathValidator = CertPathValidator.getInstance("PKIX");
            PKIXParameters pKIXParameters = new PKIXParameters((Set<TrustAnchor>) v.r1(arrayList));
            pKIXParameters.setDate(x509Certificate.getNotBefore());
            pKIXParameters.setRevocationEnabled(false);
            try {
                certPathValidator.validate(certPathGenerateCertPath, pKIXParameters);
                return true;
            } catch (Exception e11) {
                System.out.println((Object) e11.getMessage());
                return false;
            }
        }

        public final boolean d(byte[] data, byte[] signature, PublicKey publicKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
            s.k(data, "data");
            s.k(signature, "signature");
            s.k(publicKey, "publicKey");
            Signature signature2 = Signature.getInstance("SHA256withECDSA");
            signature2.initVerify(publicKey);
            signature2.update(data);
            return signature2.verify(signature);
        }

        private Companion() {
        }
    }

    public final MetrologyValidationResult a(byte[] data, List<String> knownPins, byte[] signature, String certChain) {
        s.k(data, "data");
        s.k(knownPins, "knownPins");
        s.k(signature, "signature");
        s.k(certChain, "certChain");
        Companion companion = INSTANCE;
        String strB = companion.b(data);
        List<X509Certificate> listA = a.a(certChain);
        if (listA == null) {
            return new MetrologyValidationResult(strB, false, "");
        }
        if (listA.isEmpty()) {
            return new MetrologyValidationResult(strB, false, "");
        }
        PublicKey publicKey = listA.get(0).getPublicKey();
        s.j(publicKey, "publicKey");
        String strE = a.e(publicKey);
        if (!companion.c(listA)) {
            return new MetrologyValidationResult(strB, false, strE);
        }
        if (b(listA, knownPins)) {
            return !companion.d(data, signature, publicKey) ? new MetrologyValidationResult(strB, false, strE) : new MetrologyValidationResult(strB, true, strE);
        }
        return new MetrologyValidationResult(strB, false, strE);
    }

    public final boolean b(List<? extends X509Certificate> chain, List<String> knownPins) {
        s.k(chain, "chain");
        s.k(knownPins, "knownPins");
        Iterator<T> it = chain.iterator();
        while (it.hasNext()) {
            if (knownPins.contains(this._cache.a((X509Certificate) it.next()))) {
                return true;
            }
        }
        return false;
    }
}
