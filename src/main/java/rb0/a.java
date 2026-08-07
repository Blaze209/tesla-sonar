package rb0;

import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import com.plaid.internal.EnumC4419g;
import ie0.r;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECPublicKeySpec;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyAgreement;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;
import org.spongycastle.crypto.engines.AESEngine;
import org.spongycastle.crypto.modes.GCMBlockCipher;
import org.spongycastle.crypto.params.AEADParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.jce.ECNamedCurveTable;
import org.spongycastle.jce.ECPointUtil;
import org.spongycastle.jce.X509Principal;
import org.spongycastle.jce.interfaces.ECPublicKey;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.jce.spec.ECNamedCurveParameterSpec;
import org.spongycastle.jce.spec.ECNamedCurveSpec;
import org.spongycastle.x509.X509V3CertificateGenerator;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.tesla.logging.g f107476c = com.tesla.logging.g.h("Crypto");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f107477d = r.c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ConcurrentHashMap<PublicKey, byte[]> f107478e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private KeyStore f107479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, KeyPair> f107480b;

    /* JADX INFO: renamed from: rb0.a$a, reason: collision with other inner class name */
    private static final class C2288a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f107481a = new a();
    }

    static {
        Security.addProvider(new BouncyCastleProvider());
        f107478e = new ConcurrentHashMap<>();
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    private void b(Context context) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        if (this.f107479a.containsAlias("KeyStorePassKey")) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(1, 30);
        KeyPairGeneratorSpec keyPairGeneratorSpecBuild = new KeyPairGeneratorSpec.Builder(context).setAlias("KeyStorePassKey").setSubject(new X500Principal("CN=localhost")).setSerialNumber(BigInteger.ONE).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).setKeySize(2048).build();
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
        keyPairGenerator.initialize(keyPairGeneratorSpecBuild);
        keyPairGenerator.generateKeyPair();
    }

    private String c(String str) {
        try {
            PrivateKey privateKey = Build.VERSION.SDK_INT >= 28 ? (PrivateKey) this.f107479a.getKey("KeyStorePassKey", null) : ((KeyStore.PrivateKeyEntry) this.f107479a.getEntry("KeyStorePassKey", null)).getPrivateKey();
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            synchronized (this) {
                cipher.init(2, privateKey);
                CipherInputStream cipherInputStream = new CipherInputStream(new ByteArrayInputStream(c.a(str)), cipher);
                while (true) {
                    int i11 = cipherInputStream.read(bArr);
                    if (i11 != -1) {
                        byteArrayOutputStream.write(bArr, 0, i11);
                    }
                }
            }
            return byteArrayOutputStream.toString("UTF-8");
        } catch (Exception e11) {
            f107476c.d("Failed to decrypt text", e11);
            return null;
        }
    }

    public static void d(Context context) {
        try {
            context.deleteFile("keys.store");
        } catch (Exception unused) {
        }
    }

    public static byte[] f(PublicKey publicKey, PrivateKey privateKey, String str) {
        try {
            KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
            keyAgreement.init(privateKey);
            keyAgreement.doPhase(publicKey, true);
            byte[] encoded = keyAgreement.generateSecret("AES").getEncoded();
            if (encoded == null) {
                return null;
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(encoded);
            return Arrays.copyOfRange(messageDigest.digest(), 0, 16);
        } catch (Exception e11) {
            f107476c.d("Failed to do key exchange / generate shared secret", e11);
            return null;
        }
    }

    private String g(String str) {
        try {
            RSAPublicKey rSAPublicKey = Build.VERSION.SDK_INT >= 28 ? (RSAPublicKey) this.f107479a.getCertificate("KeyStorePassKey").getPublicKey() : (RSAPublicKey) ((KeyStore.PrivateKeyEntry) this.f107479a.getEntry("KeyStorePassKey", null)).getCertificate().getPublicKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            synchronized (this) {
                cipher.init(1, rSAPublicKey);
                CipherOutputStream cipherOutputStream = new CipherOutputStream(byteArrayOutputStream, cipher);
                cipherOutputStream.write(str.getBytes("UTF-8"));
                cipherOutputStream.close();
            }
            return c.c(byteArrayOutputStream.toByteArray(), false);
        } catch (Exception e11) {
            f107476c.d("Failed to encrypt text", e11);
            return null;
        }
    }

    public static byte[] h(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        try {
            AEADParameters aEADParameters = new AEADParameters(new KeyParameter(bArr2), 128, bArr3, bArr4);
            GCMBlockCipher gCMBlockCipher = new GCMBlockCipher(new AESEngine());
            gCMBlockCipher.init(true, aEADParameters);
            byte[] bArr5 = new byte[gCMBlockCipher.getOutputSize(bArr.length)];
            gCMBlockCipher.doFinal(bArr5, gCMBlockCipher.processBytes(bArr, 0, bArr.length, bArr5, 0));
            return bArr5;
        } catch (Exception e11) {
            f107476c.d("Failed to encrypt message", e11);
            return null;
        }
    }

    public static byte[] i(byte[] bArr, byte[] bArr2) {
        byte[] bArrDoFinal;
        try {
            byte[] bArr3 = new byte[4];
            new SecureRandom().nextBytes(bArr3);
            bArr2[0] = bArr3[0];
            bArr2[1] = bArr3[1];
            bArr2[2] = bArr3[2];
            bArr2[3] = bArr3[3];
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance("AES");
            synchronized (a.class) {
                cipher.init(1, secretKeySpec);
                bArrDoFinal = cipher.doFinal(bArr2);
            }
            return bArrDoFinal;
        } catch (Exception e11) {
            f107476c.d("encryptWithSharedSecret : Failed to encrypt message", e11);
            return null;
        }
    }

    private static X509Certificate j(KeyPair keyPair, String str) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(1, 30);
        X509V3CertificateGenerator x509V3CertificateGenerator = new X509V3CertificateGenerator();
        x509V3CertificateGenerator.setSerialNumber(BigInteger.valueOf(1L));
        x509V3CertificateGenerator.setSubjectDN(new X509Principal("CN=localhost"));
        x509V3CertificateGenerator.setIssuerDN(new X509Principal("CN=localhost"));
        x509V3CertificateGenerator.setPublicKey(keyPair.getPublic());
        x509V3CertificateGenerator.setNotBefore(new Date());
        x509V3CertificateGenerator.setNotAfter(calendar.getTime());
        x509V3CertificateGenerator.setSignatureAlgorithm(str);
        try {
            return x509V3CertificateGenerator.generate(keyPair.getPrivate(), BouncyCastleProvider.PROVIDER_NAME);
        } catch (Exception e11) {
            f107476c.d("Failed to generate certificate for key", e11);
            return null;
        }
    }

    public static KeyPair k() throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        ECGenParameterSpec eCGenParameterSpec = new ECGenParameterSpec("prime256v1");
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
        keyPairGenerator.initialize(eCGenParameterSpec, new SecureRandom());
        return keyPairGenerator.generateKeyPair();
    }

    public static a l() {
        return C2288a.f107481a;
    }

    private String m(Context context) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        b(context);
        String strN = he0.b.m(context).n();
        if (strN != null) {
            return c(strN);
        }
        String string = new BigInteger(EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, new SecureRandom()).toString();
        he0.b.m(context).G(g(string));
        return string;
    }

    public static PublicKey p(byte[] bArr) {
        try {
            ECNamedCurveParameterSpec parameterSpec = ECNamedCurveTable.getParameterSpec("prime256v1");
            KeyFactory keyFactory = KeyFactory.getInstance("ECDSA", new BouncyCastleProvider());
            ECNamedCurveSpec eCNamedCurveSpec = new ECNamedCurveSpec("prime256v1", parameterSpec.getCurve(), parameterSpec.getG(), parameterSpec.getN());
            return (ECPublicKey) keyFactory.generatePublic(new ECPublicKeySpec(ECPointUtil.decodePoint(eCNamedCurveSpec.getCurve(), bArr), eCNamedCurveSpec));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] q(PublicKey publicKey, int i11) {
        try {
            return Arrays.copyOf(MessageDigest.getInstance("SHA1").digest(t(publicKey)), i11);
        } catch (NoSuchAlgorithmException e11) {
            f107476c.d("Failed to compute SHA1 hash of public key", e11);
            return null;
        }
    }

    public static FileInputStream r(Context context) {
        try {
            File fileStreamPath = context.getFileStreamPath("keys.store");
            if (fileStreamPath != null && fileStreamPath.exists()) {
                return context.openFileInput("keys.store");
            }
        } catch (FileNotFoundException unused) {
        }
        return null;
    }

    public static FileOutputStream s(Context context) {
        try {
            return context.openFileOutput("keys.store", 0);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public static byte[] t(PublicKey publicKey) {
        ConcurrentHashMap<PublicKey, byte[]> concurrentHashMap = f107478e;
        if (concurrentHashMap.containsKey(publicKey)) {
            return concurrentHashMap.get(publicKey);
        }
        byte[] encoded = publicKey.getEncoded();
        byte[] bArrCopyOfRange = Arrays.copyOfRange(encoded, 26, encoded.length);
        concurrentHashMap.put(publicKey, bArrCopyOfRange);
        return bArrCopyOfRange;
    }

    private String u(String str) {
        return String.format("PHONE_AUTH_%s_KEY_PAIR", str).toLowerCase(Locale.US);
    }

    public boolean e(String str, Context context) throws Throwable {
        OutputStream outputStream;
        OutputStream outputStreamS = null;
        try {
            char[] charArray = m(context).toCharArray();
            KeyStore keyStore = KeyStore.getInstance("BKS", BouncyCastleProvider.PROVIDER_NAME);
            InputStream inputStreamR = r(context);
            try {
                keyStore.load(inputStreamR, charArray);
                keyStore.deleteEntry(str);
                outputStreamS = s(context);
                keyStore.store(outputStreamS, charArray);
                a(inputStreamR);
                a(outputStreamS);
                return true;
            } catch (Exception e11) {
                e = e11;
                outputStream = outputStreamS;
                outputStreamS = inputStreamR;
                try {
                    f107476c.d("Failed to delete RSA keystore", e);
                    a(outputStreamS);
                    a(outputStream);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    a(outputStreamS);
                    a(outputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                outputStream = outputStreamS;
                outputStreamS = inputStreamR;
                a(outputStreamS);
                a(outputStream);
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            outputStream = null;
        } catch (Throwable th4) {
            th = th4;
            outputStream = null;
        }
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0056: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:87), block:B:14:0x0056 */
    public KeyPair n(String str, Context context) throws Throwable {
        FileInputStream fileInputStreamR;
        Closeable closeable;
        if (this.f107480b.containsKey(str)) {
            return this.f107480b.get(str);
        }
        String strU = u(str);
        System.currentTimeMillis();
        KeyStore keyStore = KeyStore.getInstance("BKS", BouncyCastleProvider.PROVIDER_NAME);
        f107476c.a("Keystore loaded.");
        char[] charArray = m(context).toCharArray();
        Closeable closeable2 = null;
        try {
            try {
                fileInputStreamR = r(context);
                try {
                    keyStore.load(fileInputStreamR, charArray);
                    Key key = keyStore.getKey(strU, charArray);
                    if (key == null) {
                        a(fileInputStreamR);
                        return null;
                    }
                    KeyPair keyPair = new KeyPair(keyStore.getCertificate(strU).getPublicKey(), (PrivateKey) key);
                    this.f107480b.put(str, keyPair);
                    a(fileInputStreamR);
                    return keyPair;
                } catch (Exception e11) {
                    e = e11;
                    f107476c.d("Failed to get local keypair -deleting", e);
                    d(context);
                    a(fileInputStreamR);
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                closeable2 = closeable;
                a(closeable2);
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            fileInputStreamR = null;
        } catch (Throwable th3) {
            th = th3;
            a(closeable2);
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0035: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:54), block:B:10:0x0035 */
    public KeyPair o(String str, Context context) throws Throwable {
        FileInputStream fileInputStreamR;
        Closeable closeable;
        System.currentTimeMillis();
        KeyStore keyStore = KeyStore.getInstance("BKS", BouncyCastleProvider.PROVIDER_NAME);
        char[] charArray = m(context).toCharArray();
        Closeable closeable2 = null;
        try {
            try {
                fileInputStreamR = r(context);
                try {
                    keyStore.load(fileInputStreamR, charArray);
                    Key key = keyStore.getKey(str, charArray);
                    if (key == null) {
                        a(fileInputStreamR);
                        return null;
                    }
                    KeyPair keyPair = new KeyPair(keyStore.getCertificate(str).getPublicKey(), (PrivateKey) key);
                    a(fileInputStreamR);
                    return keyPair;
                } catch (Exception e11) {
                    e = e11;
                    f107476c.d("Failed to get local RSA keypair -deleting", e);
                    d(context);
                    a(fileInputStreamR);
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                closeable2 = closeable;
                a(closeable2);
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            fileInputStreamR = null;
        } catch (Throwable th3) {
            th = th3;
            a(closeable2);
            throw th;
        }
    }

    public boolean v(KeyPair keyPair, String str, Context context) throws Throwable {
        OutputStream outputStream;
        String strU = u(str);
        OutputStream outputStreamS = null;
        try {
            X509Certificate x509CertificateJ = j(keyPair, "ECDSAWITHSHA1");
            if (x509CertificateJ == null) {
                a(null);
                a(null);
                return false;
            }
            char[] charArray = m(context).toCharArray();
            KeyStore keyStore = KeyStore.getInstance("BKS", BouncyCastleProvider.PROVIDER_NAME);
            InputStream inputStreamR = r(context);
            try {
                keyStore.load(inputStreamR, charArray);
                keyStore.setKeyEntry(strU, keyPair.getPrivate(), charArray, new Certificate[]{x509CertificateJ});
                outputStreamS = s(context);
                keyStore.store(outputStreamS, charArray);
                a(inputStreamR);
                a(outputStreamS);
                return true;
            } catch (Exception e11) {
                e = e11;
                outputStream = outputStreamS;
                outputStreamS = inputStreamR;
            } catch (Throwable th2) {
                th = th2;
                outputStream = outputStreamS;
                outputStreamS = inputStreamR;
                a(outputStreamS);
                a(outputStream);
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            outputStream = null;
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
        }
        try {
            f107476c.d("Failed to store keystore", e);
            a(outputStreamS);
            a(outputStream);
            return false;
        } catch (Throwable th4) {
            th = th4;
            a(outputStreamS);
            a(outputStream);
            throw th;
        }
    }

    public boolean w(KeyPair keyPair, String str, Context context) throws Throwable {
        OutputStream outputStream;
        OutputStream outputStreamS = null;
        try {
            X509Certificate x509CertificateJ = j(keyPair, "SHA512WithRSAEncryption");
            if (x509CertificateJ == null) {
                a(null);
                a(null);
                return false;
            }
            char[] charArray = m(context).toCharArray();
            KeyStore keyStore = KeyStore.getInstance("BKS", BouncyCastleProvider.PROVIDER_NAME);
            InputStream inputStreamR = r(context);
            try {
                keyStore.load(inputStreamR, charArray);
                keyStore.setKeyEntry(str, keyPair.getPrivate(), charArray, new Certificate[]{x509CertificateJ});
                outputStreamS = s(context);
                keyStore.store(outputStreamS, charArray);
                a(inputStreamR);
                a(outputStreamS);
                return true;
            } catch (Exception e11) {
                e = e11;
                outputStream = outputStreamS;
                outputStreamS = inputStreamR;
            } catch (Throwable th2) {
                th = th2;
                outputStream = outputStreamS;
                outputStreamS = inputStreamR;
                a(outputStreamS);
                a(outputStream);
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            outputStream = null;
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
        }
        try {
            f107476c.d("Failed to store RSA keystore", e);
            a(outputStreamS);
            a(outputStream);
            return false;
        } catch (Throwable th4) {
            th = th4;
            a(outputStreamS);
            a(outputStream);
            throw th;
        }
    }

    private a() {
        this.f107480b = new ConcurrentHashMap<>();
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.f107479a = keyStore;
            keyStore.load(null);
        } catch (Exception e11) {
            f107476c.d("Could not create key store", e11);
        }
    }
}
