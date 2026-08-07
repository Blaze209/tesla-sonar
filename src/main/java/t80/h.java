package t80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.nimbusds.jose.JOSEException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertStore;
import java.security.cert.CertificateException;
import java.security.cert.CollectionCertStoreParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import jn0.h0;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001aB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001e\u001a\u00020\u00022\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\"¨\u0006#"}, d2 = {"Lt80/h;", "Lt80/o;", "", "isLiveMode", "", "Ljava/security/cert/X509Certificate;", "rootCerts", "Lr80/c;", "errorReporter", "<init>", "(ZLjava/util/List;Lr80/c;)V", "Ljz/q;", "jwsObject", "e", "(Ljz/q;Ljava/util/List;)Z", "Ljz/p;", "jwsHeader", "Ljz/r;", "c", "(Ljz/p;)Ljz/r;", "Ljava/security/PublicKey;", "b", "(Ljz/p;)Ljava/security/PublicKey;", "", "jws", "Lorg/json/JSONObject;", "a", "(Ljava/lang/String;)Lorg/json/JSONObject;", "Lyz/a;", "encodedChainCerts", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;Ljava/util/List;)Z", "Z", "Ljava/util/List;", "Lr80/c;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h implements o {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isLiveMode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<X509Certificate> rootCerts;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final r80.c errorReporter;

    /* JADX INFO: renamed from: t80.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lt80/h$a;", "", "<init>", "()V", "", "Lyz/a;", "encodedChainCerts", "Ljava/security/cert/X509Certificate;", "rootCerts", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;Ljava/util/List;)V", "Ljava/security/KeyStore;", "b", "(Ljava/util/List;)Ljava/security/KeyStore;", "Ljz/p;", "jwsHeader", "c", "(Ljz/p;)Ljz/p;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(List<? extends yz.a> encodedChainCerts, List<? extends X509Certificate> rootCerts) throws CertPathBuilderException, NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, ParseException, InvalidAlgorithmParameterException {
            List<X509Certificate> listA = yz.m.a(encodedChainCerts);
            KeyStore keyStoreB = b(rootCerts);
            X509CertSelector x509CertSelector = new X509CertSelector();
            x509CertSelector.setCertificate(listA.get(0));
            PKIXBuilderParameters pKIXBuilderParameters = new PKIXBuilderParameters(keyStoreB, x509CertSelector);
            pKIXBuilderParameters.setRevocationEnabled(false);
            pKIXBuilderParameters.addCertStore(CertStore.getInstance("Collection", new CollectionCertStoreParameters(listA)));
            CertPathBuilder.getInstance("PKIX").build(pKIXBuilderParameters);
        }

        public final KeyStore b(List<? extends X509Certificate> rootCerts) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
            p013kotlin.jvm.internal.s.k(rootCerts, "rootCerts");
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            int i11 = 0;
            for (Object obj : rootCerts) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    p013kotlin.collections.v.x();
                }
                t0 t0Var = t0.f86535a;
                String str = String.format(Locale.ROOT, "ca_%d", Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1));
                p013kotlin.jvm.internal.s.j(str, "format(locale, format, *args)");
                keyStore.setCertificateEntry(str, rootCerts.get(i11));
                i11 = i12;
            }
            p013kotlin.jvm.internal.s.h(keyStore);
            return keyStore;
        }

        public final jz.p c(jz.p jwsHeader) {
            p013kotlin.jvm.internal.s.k(jwsHeader, "jwsHeader");
            jz.p pVarB = new jz.p.a(jwsHeader).f(null).b();
            p013kotlin.jvm.internal.s.j(pVarB, "build(...)");
            return pVarB;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(boolean z11, List<? extends X509Certificate> rootCerts, r80.c errorReporter) {
        p013kotlin.jvm.internal.s.k(rootCerts, "rootCerts");
        p013kotlin.jvm.internal.s.k(errorReporter, "errorReporter");
        this.isLiveMode = z11;
        this.rootCerts = rootCerts;
        this.errorReporter = errorReporter;
    }

    private final PublicKey b(jz.p jwsHeader) {
        List listM = jwsHeader.m();
        p013kotlin.jvm.internal.s.j(listM, "getX509CertChain(...)");
        PublicKey publicKey = yz.n.b(((yz.a) p013kotlin.collections.v.o0(listM)).a()).getPublicKey();
        p013kotlin.jvm.internal.s.j(publicKey, "getPublicKey(...)");
        return publicKey;
    }

    private final jz.r c(jz.p jwsHeader) throws JOSEException {
        mz.a aVar = new mz.a();
        aVar.e().c(lz.a.a());
        jz.r rVarG = aVar.g(jwsHeader, b(jwsHeader));
        p013kotlin.jvm.internal.s.j(rVarG, "createJWSVerifier(...)");
        return rVarG;
    }

    private final boolean e(jz.q jwsObject, List<? extends X509Certificate> rootCerts) {
        if (jwsObject.h().j() != null) {
            this.errorReporter.Y0(new IllegalArgumentException("Encountered a JWK in " + jwsObject.h()));
        }
        Companion companion = INSTANCE;
        jz.p pVarH = jwsObject.h();
        p013kotlin.jvm.internal.s.j(pVarH, "getHeader(...)");
        jz.p pVarC = companion.c(pVarH);
        if (d(pVarC.m(), rootCerts)) {
            return jwsObject.n(c(pVarC));
        }
        return false;
    }

    @Override // t80.o
    public JSONObject a(String jws) throws ParseException {
        p013kotlin.jvm.internal.s.k(jws, "jws");
        jz.q qVarK = jz.q.k(jws);
        if (this.isLiveMode) {
            p013kotlin.jvm.internal.s.h(qVarK);
            if (!e(qVarK, this.rootCerts)) {
                throw new IllegalStateException("Could not validate JWS");
            }
        }
        return new JSONObject(qVarK.b().toString());
    }

    public final boolean d(List<? extends yz.a> encodedChainCerts, List<? extends X509Certificate> rootCerts) {
        Object objB;
        p013kotlin.jvm.internal.s.k(rootCerts, "rootCerts");
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            List<? extends yz.a> list = encodedChainCerts;
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("JWSHeader's X.509 certificate chain is null or empty");
            }
            if (rootCerts.isEmpty()) {
                throw new IllegalArgumentException("Root certificates are empty");
            }
            INSTANCE.d(encodedChainCerts, rootCerts);
            objB = jn0.s.b(h0.f84049a);
            Throwable thE = jn0.s.e(objB);
            if (thE != null) {
                this.errorReporter.Y0(thE);
            }
            return jn0.s.h(objB);
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
    }
}
