package zc;

import android.annotation.TargetApi;
import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.asn1.pkcs.RSAPrivateKey;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.openssl.PEMParser;
import org.spongycastle.operator.OperatorCreationException;
import org.spongycastle.pkcs.PKCS10CertificationRequest;
import org.spongycastle.util.io.pem.PemObject;
import org.spongycastle.util.io.pem.PemReader;
import org.spongycastle.util.io.pem.PemWriter;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Charset f128049e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f128050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PublicKey f128051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PrivateKey f128052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private PKCS10CertificationRequest f128053d;

    public c() {
        x();
    }

    private boolean C(byte[] bArr, byte[] bArr2, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        Signature signature = Signature.getInstance(str);
        signature.initVerify(this.f128051b);
        signature.update(bArr2);
        return signature.verify(bArr);
    }

    private String a(String str, byte[] bArr) throws IOException {
        PemObject pemObject = new PemObject(str, bArr);
        StringWriter stringWriter = new StringWriter();
        PemWriter pemWriter = new PemWriter(stringWriter);
        pemWriter.writeObject(pemObject);
        pemWriter.close();
        return stringWriter.toString();
    }

    private byte[] c(byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("RSA/NONE/PKCS1Padding");
        cipher.init(2, this.f128052c);
        return cipher.doFinal(bArr);
    }

    private byte[] g(byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("RSA/NONE/PKCS1Padding");
        cipher.init(1, this.f128051b);
        return cipher.doFinal(bArr);
    }

    private byte[] q(String str) {
        return new PemReader(new StringReader(str)).readPemObject().getContent();
    }

    private PrivateKey r(byte[] bArr) {
        RSAPrivateKey rSAPrivateKey = RSAPrivateKey.getInstance(new ASN1InputStream(bArr).readObject());
        return KeyFactory.getInstance("RSA").generatePrivate(new RSAPrivateKeySpec(rSAPrivateKey.getModulus(), rSAPrivateKey.getPrivateExponent()));
    }

    private PublicKey s(String str) throws Throwable {
        StringReader stringReader = null;
        try {
            StringReader stringReader2 = new StringReader(str);
            try {
                PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(((SubjectPublicKeyInfo) new PEMParser(stringReader2).readObject()).getEncoded()));
                stringReader2.close();
                return publicKeyGeneratePublic;
            } catch (Throwable th2) {
                th = th2;
                stringReader = stringReader2;
                if (stringReader != null) {
                    stringReader.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private byte[] t(PrivateKey privateKey) {
        return PrivateKeyInfo.getInstance(privateKey.getEncoded()).parsePrivateKey().toASN1Primitive().getEncoded();
    }

    private byte[] u(PublicKey publicKey) {
        return SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()).parsePublicKey().getEncoded();
    }

    private void x() {
        f128049e = StandardCharsets.UTF_8;
    }

    private String z(byte[] bArr, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        Signature signature = Signature.getInstance(str);
        signature.initSign(this.f128052c);
        signature.update(bArr);
        return Base64.encodeToString(signature.sign(), 0);
    }

    public String A(String str, String str2) {
        return z(Base64.decode(str, 0), str2);
    }

    public boolean B(String str, String str2, String str3) throws InvalidKeyException {
        Signature.getInstance(str3).initVerify(this.f128051b);
        return C(Base64.decode(str, 0), str2.getBytes(f128049e), str3);
    }

    public boolean D(String str, String str2, String str3) throws InvalidKeyException {
        Signature.getInstance(str3).initVerify(this.f128051b);
        return C(Base64.decode(str, 0), Base64.decode(str2, 0), str3);
    }

    public String b(String str) {
        return new String(c(Base64.decode(str, 0)), f128049e);
    }

    public String d(String str) {
        return Base64.encodeToString(c(Base64.decode(str, 0)), 0);
    }

    public void e() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        keyStore.deleteEntry(this.f128050a);
        this.f128052c = null;
        this.f128051b = null;
    }

    public String f(String str) {
        return Base64.encodeToString(g(str.getBytes(f128049e)), 0);
    }

    public String h(String str) {
        return Base64.encodeToString(g(Base64.decode(str, 0)), 0);
    }

    public void i(int i11) throws NoSuchAlgorithmException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(i11);
        KeyPair keyPairGenKeyPair = keyPairGenerator.genKeyPair();
        this.f128051b = keyPairGenKeyPair.getPublic();
        this.f128052c = keyPairGenKeyPair.getPrivate();
    }

    @TargetApi(18)
    public void j(String str, int i11, Context context) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
        keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(str, 15).setKeySize(i11).setDigests("SHA-256", "SHA-512", "SHA-1").setEncryptionPaddings("PKCS1Padding").setSignaturePaddings("PKCS1").build());
        this.f128051b = keyPairGenerator.genKeyPair().getPublic();
    }

    @TargetApi(18)
    public void k(String str, String str2, Context context) {
        this.f128053d = a.a(this.f128051b, str, this.f128050a, str2);
    }

    @TargetApi(18)
    public void l(String str, String str2, int i11, Context context) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        e();
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
        keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(str2, 12).setDigests("SHA-256", "SHA-512", "SHA-384", "NONE").setKeySize(i11).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setEncryptionPaddings("PKCS7Padding").build());
        PublicKey publicKey = keyPairGenerator.genKeyPair().getPublic();
        this.f128051b = publicKey;
        try {
            this.f128053d = a.b(publicKey, str, str2);
        } catch (OperatorCreationException e11) {
            e11.printStackTrace();
        }
    }

    public String m() {
        return a("CERTIFICATE REQUEST", this.f128053d.getEncoded());
    }

    public String n() {
        return a("RSA PRIVATE KEY", t(this.f128052c));
    }

    public String o() {
        return a("RSA PUBLIC KEY", u(this.f128051b));
    }

    public void p() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) keyStore.getEntry(this.f128050a, null);
        if (privateKeyEntry != null) {
            this.f128052c = privateKeyEntry.getPrivateKey();
            this.f128051b = privateKeyEntry.getCertificate().getPublicKey();
        }
    }

    public void v(String str) {
        this.f128052c = r(q(str));
    }

    public void w(String str) {
        this.f128051b = s(str);
    }

    public String y(String str, String str2) {
        return z(str.getBytes(f128049e), str2);
    }

    public c(String str) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        x();
        this.f128050a = str;
        p();
    }
}
