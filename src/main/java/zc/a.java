package zc;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.CertificateException;
import java.util.HashMap;
import java.util.Map;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.ExtensionsGenerator;
import org.spongycastle.operator.ContentSigner;
import org.spongycastle.pkcs.PKCS10CertificationRequest;
import org.spongycastle.pkcs.jcajce.JcaPKCS10CertificationRequestBuilder;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: zc.a$a, reason: collision with other inner class name */
    private static class C2778a implements ContentSigner {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static Map<String, AlgorithmIdentifier> f128045d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f128046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Signature f128047b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ByteArrayOutputStream f128048c;

        static {
            HashMap map = new HashMap();
            f128045d = map;
            map.put("SHA256withECDSA".toLowerCase(), new AlgorithmIdentifier(new ASN1ObjectIdentifier("1.2.840.10045.4.3.2")));
            f128045d.put("SHA256withRSA".toLowerCase(), new AlgorithmIdentifier(new ASN1ObjectIdentifier("1.2.840.113549.1.1.11")));
            f128045d.put("SHA1withRSA".toLowerCase(), new AlgorithmIdentifier(new ASN1ObjectIdentifier("1.2.840.113549.1.1.5")));
        }

        public C2778a(String str, String str2) {
            this.f128046a = str.toLowerCase();
            try {
                KeyStore.Entry entryA = a(str2);
                this.f128048c = new ByteArrayOutputStream();
                this.f128047b = Signature.getInstance(str);
                this.f128047b.initSign(((KeyStore.PrivateKeyEntry) entryA).getPrivateKey());
            } catch (IOException e11) {
                Log.e("generateCSR", "IOException: " + e11.getMessage());
                throw new IllegalArgumentException(e11.getMessage());
            } catch (GeneralSecurityException e12) {
                Log.e("generateCSR", "generateCSR: " + e12.getMessage());
                throw new IllegalArgumentException(e12.getMessage());
            }
        }

        public KeyStore.Entry a(String str) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.getEntry(str, null);
        }

        @Override // org.spongycastle.operator.ContentSigner
        public AlgorithmIdentifier getAlgorithmIdentifier() {
            AlgorithmIdentifier algorithmIdentifier = f128045d.get(this.f128046a);
            if (algorithmIdentifier != null) {
                return algorithmIdentifier;
            }
            throw new IllegalArgumentException("Does not support algo: " + this.f128046a);
        }

        @Override // org.spongycastle.operator.ContentSigner
        public OutputStream getOutputStream() {
            return this.f128048c;
        }

        @Override // org.spongycastle.operator.ContentSigner
        public byte[] getSignature() {
            try {
                this.f128047b.update(this.f128048c.toByteArray());
                return this.f128047b.sign();
            } catch (GeneralSecurityException e11) {
                e11.printStackTrace();
                return null;
            }
        }
    }

    public static PKCS10CertificationRequest a(PublicKey publicKey, String str, String str2, String str3) {
        String str4 = String.format("CN=%s", str);
        C2778a c2778a = new C2778a(str3, str2);
        JcaPKCS10CertificationRequestBuilder jcaPKCS10CertificationRequestBuilder = new JcaPKCS10CertificationRequestBuilder(new X500Name(str4), publicKey);
        jcaPKCS10CertificationRequestBuilder.addAttribute(PKCSObjectIdentifiers.pkcs_9_at_extensionRequest, new ExtensionsGenerator().generate());
        return jcaPKCS10CertificationRequestBuilder.build(c2778a);
    }

    public static PKCS10CertificationRequest b(PublicKey publicKey, String str, String str2) {
        return a(publicKey, str, str2, "SHA256withECDSA");
    }
}
