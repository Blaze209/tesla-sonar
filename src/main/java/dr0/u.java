package dr0;

import com.plaid.internal.EnumC4419g;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.sf.scuba.smartcards.CardServiceException;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.jmrtd.CardServiceProtocolException;

/* JADX INFO: loaded from: classes10.dex */
public class u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Logger f60972g = Logger.getLogger("org.jmrtd");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Provider f60973h = yq0.o.n();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f60974i = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final byte[] f60975j = {-90, 104, -119, 42, 124, 65, -29, -54, 115, -97, 64, -80, 87, -40, 89, 4};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final byte[] f60976k = {-92, -31, 54, -84, 114, 95, 115, -117, 1, -63, -10, 2, 23, -63, -120, -83};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final byte[] f60977l = {-44, 99, -42, 82, 52, 18, 78, -9, -119, 112, 84, -104, 109, -54, 10, 23, 78, 40, -33, 117, -116, -70, -96, 63, 36, 6, 22, 65, 77, 90, 22, 118};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final byte[] f60978m = {84, -67, 114, 85, -16, -86, -8, 49, -66, -61, 66, 63, -49, 57, -42, -101, 108, -65, 6, 102, 119, -48, -6, -82, 90, -83, -39, -99, -8, -27, 53, 23};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private yq0.d f60979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private y f60980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f60981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f60982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f60983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Random f60984f = new SecureRandom();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f60985a;

        static {
            int[] iArr = new int[br0.n.b.values().length];
            f60985a = iArr;
            try {
                iArr[br0.n.b.CAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60985a[br0.n.b.GM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60985a[br0.n.b.IM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public u(yq0.d dVar, y yVar, int i11, int i12, boolean z11) {
        this.f60979a = dVar;
        this.f60980b = yVar;
        this.f60982d = i11;
        this.f60981c = i12;
        this.f60983e = z11;
    }

    public static AlgorithmParameterSpec A(byte[] bArr, byte[] bArr2, String str, DHParameterSpec dHParameterSpec) {
        BigInteger g11 = dHParameterSpec.getG();
        if (g11 != null) {
            BigInteger bigInteger = BigInteger.ONE;
            if (!g11.equals(bigInteger)) {
                BigInteger p11 = dHParameterSpec.getP();
                return new DHParameterSpec(p11, yq0.o.H(C(bArr, bArr2, p11, str)).modPow(p11.subtract(bigInteger).divide(dHParameterSpec instanceof br0.n.a ? ((br0.n.a) dHParameterSpec).a() : bigInteger), p11), dHParameterSpec.getL());
            }
        }
        throw new IllegalArgumentException("Invalid generator: " + g11);
    }

    public static AlgorithmParameterSpec B(byte[] bArr, byte[] bArr2, String str, ECParameterSpec eCParameterSpec) {
        BigInteger bigIntegerX = yq0.o.x(eCParameterSpec);
        BigInteger order = eCParameterSpec.getOrder();
        int cofactor = eCParameterSpec.getCofactor();
        BigInteger a11 = eCParameterSpec.getCurve().getA();
        BigInteger b11 = eCParameterSpec.getCurve().getB();
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigIntegerX), a11, b11), v(yq0.o.H(C(bArr, bArr2, bigIntegerX, str)), eCParameterSpec), order, cofactor);
    }

    public static byte[] C(byte[] bArr, byte[] bArr2, BigInteger bigInteger, String str) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArr3;
        byte[] bArr4;
        if (bArr == null || bArr2 == null) {
            throw new IllegalArgumentException("Null nonce");
        }
        int length = bArr.length * 8;
        int length2 = bArr2.length * 8;
        if (length == 128) {
            bArr3 = f60975j;
            bArr4 = f60976k;
        } else {
            if (length != 192 && length != 256) {
                throw new IllegalArgumentException("Unknown length " + length + ", was expecting 128, 192, or 256");
            }
            bArr3 = f60977l;
            bArr4 = f60978m;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str.endsWith("/CBC/NoPadding") ? "" : "/CBC/NoPadding");
        Cipher cipher = Cipher.getInstance(sb2.toString());
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[cipher.getBlockSize()]);
        cipher.init(1, new SecretKeySpec(bArr2, str), ivParameterSpec);
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i11 = 0; i11 * length < bigInteger.bitLength() + 64; i11++) {
            try {
                try {
                    cipher.init(1, new SecretKeySpec(bArrDoFinal, 0, length2 / 8, str), ivParameterSpec);
                    bArrDoFinal = cipher.doFinal(bArr3);
                    byteArrayOutputStream.write(cipher.doFinal(bArr4));
                } catch (Exception e11) {
                    f60972g.log(Level.WARNING, "Could not write to stream", (Throwable) e11);
                    byte[] bArrA = yq0.o.A(yq0.o.H(byteArrayOutputStream.toByteArray()).mod(bigInteger));
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e12) {
                        f60972g.log(Level.FINE, "Could not close stream", (Throwable) e12);
                    }
                    return bArrA;
                }
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e13) {
                    f60972g.log(Level.FINE, "Could not close stream", (Throwable) e13);
                }
                throw th2;
            }
        }
        byte[] bArrA2 = yq0.o.A(yq0.o.H(byteArrayOutputStream.toByteArray()).mod(bigInteger));
        try {
            byteArrayOutputStream.close();
            return bArrA2;
        } catch (IOException e14) {
            f60972g.log(Level.FINE, "Could not close stream", (Throwable) e14);
            return bArrA2;
        }
    }

    public static PublicKey D(PublicKey publicKey, PrivateKey privateKey) throws NoSuchAlgorithmException {
        String algorithm = publicKey.getAlgorithm();
        String algorithm2 = privateKey.getAlgorithm();
        if ("EC".equals(algorithm) || "ECDH".equals(algorithm)) {
            if ("EC".equals(algorithm2) || "ECDH".equals(algorithm2)) {
                return KeyFactory.getInstance("EC", f60973h).generatePublic(new ECPublicKeySpec(((ECPublicKey) publicKey).getW(), ((ECPrivateKey) privateKey).getParams()));
            }
            throw new NoSuchAlgorithmException("Unsupported key type public: " + algorithm + ", private: " + algorithm2);
        }
        if (!"DH".equals(algorithm)) {
            throw new NoSuchAlgorithmException("Unsupported key type public: " + algorithm + ", private: " + algorithm2);
        }
        if ("DH".equals(algorithm2)) {
            KeyFactory keyFactory = KeyFactory.getInstance("DH");
            DHParameterSpec params = ((DHPrivateKey) privateKey).getParams();
            return keyFactory.generatePublic(new DHPublicKeySpec(((DHPublicKey) publicKey).getY(), params.getP(), params.getG()));
        }
        throw new NoSuchAlgorithmException("Unsupported key type public: " + algorithm + ", private: " + algorithm2);
    }

    private void a(String str, String str2, String str3, int i11, AlgorithmParameterSpec algorithmParameterSpec) {
        if (str == null) {
            throw new IllegalArgumentException("Unknown agreement algorithm");
        }
        if (!"ECDH".equalsIgnoreCase(str) && !"DH".equalsIgnoreCase(str)) {
            throw new IllegalArgumentException("Unsupported agreement algorithm, expected \"ECDH\" or \"DH\", found \"" + str + "\"");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Unknown cipher algorithm");
        }
        if (!"DESede".equalsIgnoreCase(str2) && !"AES".equalsIgnoreCase(str2)) {
            throw new IllegalArgumentException("Unsupported cipher algorithm, expected \"DESede\" or \"AES\", found \"" + str2 + "\"");
        }
        if (!"SHA-1".equalsIgnoreCase(str3) && !"SHA1".equalsIgnoreCase(str3) && !"SHA-256".equalsIgnoreCase(str3) && !"SHA256".equalsIgnoreCase(str3)) {
            throw new IllegalArgumentException("Unsupported cipher algorithm, expected \"SHA-1\" or \"SHA-256\", found \"" + str3 + "\"");
        }
        if (i11 != 128 && i11 != 192 && i11 != 256) {
            throw new IllegalArgumentException("Unsupported key length, expected 128, 192, or 256, found " + i11);
        }
        if ("ECDH".equalsIgnoreCase(str) && !(algorithmParameterSpec instanceof ECParameterSpec)) {
            throw new IllegalArgumentException("Expected ECParameterSpec for agreement algorithm \"" + str + "\", found " + algorithmParameterSpec.getClass().getCanonicalName());
        }
        if (!"DH".equalsIgnoreCase(str) || (algorithmParameterSpec instanceof DHParameterSpec)) {
            return;
        }
        throw new IllegalArgumentException("Expected DHParameterSpec for agreement algorithm \"" + str + "\", found " + algorithmParameterSpec.getClass().getCanonicalName());
    }

    private static byte[] b(String str, String str2, String str3) {
        return yq0.o.c(str, str2, str3, "SHA-1", false);
    }

    public static byte[] c(yq0.g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("Access key cannot be null");
        }
        if (!(gVar instanceof yq0.i)) {
            if (gVar instanceof yq0.l) {
                return ((yq0.l) gVar).getKey();
            }
            f60972g.warning("JMRTD doesn't recognize this type of access key, best effort key derivation!");
            return gVar.getKey();
        }
        yq0.i iVar = (yq0.i) gVar;
        String strG2 = iVar.G2();
        String strC0 = iVar.c0();
        String strM2 = iVar.M2();
        if (strC0 == null || strC0.length() != 6) {
            throw new IllegalArgumentException("Wrong date format used for date of birth. Expected yyMMdd, found " + strC0);
        }
        if (strM2 == null || strM2.length() != 6) {
            throw new IllegalArgumentException("Wrong date format used for date of expiry. Expected yyMMdd, found " + strM2);
        }
        if (strG2 != null) {
            return b(s(strG2), strC0, strM2);
        }
        throw new IllegalArgumentException("Wrong document number. Found " + strG2);
    }

    public static PublicKey d(byte[] bArr, AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec == null) {
            throw new IllegalArgumentException("Params cannot be null");
        }
        try {
            if (algorithmParameterSpec instanceof ECParameterSpec) {
                return yq0.o.y("EC", new ECPublicKeySpec(yq0.o.G(bArr), (ECParameterSpec) algorithmParameterSpec));
            }
            if (algorithmParameterSpec instanceof DHParameterSpec) {
                DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
                return yq0.o.y("DH", new DHPublicKeySpec(yq0.o.H(bArr), dHParameterSpec.getP(), dHParameterSpec.getG()));
            }
            throw new IllegalArgumentException("Expected ECParameterSpec or DHParameterSpec, found " + algorithmParameterSpec.getClass().getCanonicalName());
        } catch (GeneralSecurityException e11) {
            f60972g.log(Level.WARNING, "Exception", (Throwable) e11);
            throw new IllegalArgumentException(e11);
        }
    }

    public static SecretKey e(yq0.g gVar, String str) {
        return yq0.o.h(c(gVar), br0.n.h(str), br0.n.k(str), null, 3, gVar instanceof yq0.l ? ((yq0.l) gVar).b() : (byte) 0);
    }

    private v g(yq0.g gVar, SecretKey secretKey, String str, AlgorithmParameterSpec algorithmParameterSpec, BigInteger bigInteger) throws CardServiceProtocolException {
        br0.n.b bVarL = br0.n.l(str);
        String strJ = br0.n.j(str);
        String strH = br0.n.h(str);
        String strI = br0.n.i(str);
        int iK = br0.n.k(str);
        a(strJ, strH, strI, iK, algorithmParameterSpec);
        try {
            Cipher cipher = Cipher.getInstance(strH + "/CBC/NoPadding");
            try {
                byte[] bArrA0 = null;
                this.f60979a.a(this.f60980b, str, secretKey instanceof yq0.m ? ((yq0.m) secretKey).a() : (byte) 1, bigInteger == null ? null : yq0.o.A(bigInteger));
                t tVarI = i(bVarL, strJ, algorithmParameterSpec, h(secretKey, cipher), cipher);
                AlgorithmParameterSpec algorithmParameterSpecA = tVarI.a();
                KeyPair keyPairM = m(strJ, algorithmParameterSpecA);
                PublicKey publicKeyL = l(keyPairM.getPublic(), algorithmParameterSpecA);
                byte[] bArrN = n(strJ, keyPairM.getPrivate(), publicKeyL);
                try {
                    SecretKey secretKeyF = yq0.o.f(bArrN, strH, iK, 1);
                    SecretKey secretKeyF2 = yq0.o.f(bArrN, strH, iK, 2);
                    byte[] bArrO = o(str, bVarL, keyPairM, publicKeyL, secretKeyF2);
                    try {
                        y yVar = this.f60980b;
                        long jL = yVar == null ? 0L : yVar.l();
                        if (strH.startsWith("DESede")) {
                            this.f60980b = new h(secretKeyF, secretKeyF2, this.f60981c, this.f60983e, 0L);
                        } else if (strH.startsWith("AES")) {
                            this.f60980b = new d(secretKeyF, secretKeyF2, this.f60981c, this.f60983e, jL);
                        } else {
                            f60972g.warning("Unsupported cipher algorithm " + strH);
                        }
                        if (!br0.n.b.CAM.equals(bVarL)) {
                            return new v(gVar, bVarL, strJ, strH, strI, iK, tVarI, keyPairM, publicKeyL, this.f60980b);
                        }
                        if (bArrO == null) {
                            f60972g.warning("Encrypted Chip Authentication data is null");
                        }
                        try {
                            Cipher cipher2 = Cipher.getInstance("AES/CBC/NoPadding");
                            cipher2.init(2, secretKeyF, new IvParameterSpec(f60974i));
                            bArrA0 = yq0.o.a0(cipher2.doFinal(bArrO));
                        } catch (GeneralSecurityException e11) {
                            f60972g.log(Level.WARNING, "Could not decrypt Chip Authentication data", (Throwable) e11);
                        }
                        return new n(gVar, strJ, strH, strI, iK, tVarI, keyPairM, publicKeyL, bArrO, bArrA0, this.f60980b);
                    } catch (GeneralSecurityException e12) {
                        throw new CardServiceProtocolException("Security exception in secure messaging establishment", 4, e12);
                    }
                } catch (GeneralSecurityException e13) {
                    throw new CardServiceProtocolException("Security exception during secure messaging key derivation", 3, e13);
                }
            } catch (CardServiceException e14) {
                throw new CardServiceProtocolException("PICC side error in static PACE key derivation step", 0, e14);
            } catch (Exception e15) {
                throw new CardServiceProtocolException("PCD side error in static PACE key derivation step", 0, e15);
            }
        } catch (GeneralSecurityException e16) {
            throw new CardServiceProtocolException("PCD side error in static cipher construction during key derivation step", 0, e16);
        }
    }

    public static byte[] p(String str, PublicKey publicKey) {
        return q(str, publicKey, true);
    }

    public static byte[] q(String str, PublicKey publicKey, boolean z11) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ap0.d dVar = new ap0.d(byteArrayOutputStream);
        try {
            try {
                dVar.n(32585);
                if (publicKey instanceof DHPublicKey) {
                    DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
                    DHParameterSpec params = dHPublicKey.getParams();
                    BigInteger p11 = params.getP();
                    int l11 = params.getL();
                    BigInteger g11 = params.getG();
                    BigInteger y11 = dHPublicKey.getY();
                    dVar.write(new ASN1ObjectIdentifier(str).getEncoded());
                    if (!z11) {
                        dVar.n(EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE);
                        dVar.o(yq0.o.A(p11));
                        dVar.n(EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
                        dVar.o(yq0.o.A(BigInteger.valueOf(l11)));
                        dVar.n(131);
                        dVar.o(yq0.o.A(g11));
                    }
                    dVar.n(132);
                    dVar.o(yq0.o.A(y11));
                } else {
                    if (!(publicKey instanceof ECPublicKey)) {
                        throw new InvalidKeyException("Unsupported public key: " + publicKey.getClass().getCanonicalName());
                    }
                    ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
                    ECParameterSpec params2 = eCPublicKey.getParams();
                    BigInteger bigIntegerX = yq0.o.x(params2);
                    EllipticCurve curve = params2.getCurve();
                    BigInteger a11 = curve.getA();
                    BigInteger b11 = curve.getB();
                    ECPoint generator = params2.getGenerator();
                    BigInteger order = params2.getOrder();
                    int cofactor = params2.getCofactor();
                    ECPoint w11 = eCPublicKey.getW();
                    dVar.write(new ASN1ObjectIdentifier(str).getEncoded());
                    if (!z11) {
                        dVar.n(EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE);
                        dVar.o(yq0.o.A(bigIntegerX));
                        dVar.n(EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
                        dVar.o(yq0.o.A(a11));
                        dVar.n(131);
                        dVar.o(yq0.o.A(b11));
                        BigInteger affineX = generator.getAffineX();
                        BigInteger affineY = generator.getAffineY();
                        dVar.n(132);
                        dVar.write(yq0.o.A(affineX));
                        dVar.write(yq0.o.A(affineY));
                        dVar.p();
                        dVar.n(133);
                        dVar.o(yq0.o.A(order));
                    }
                    dVar.n(134);
                    dVar.o(yq0.o.i(w11, params2.getCurve().getField().getFieldSize()));
                    if (!z11) {
                        dVar.n(135);
                        dVar.o(yq0.o.A(BigInteger.valueOf(cofactor)));
                    }
                }
                dVar.p();
                dVar.flush();
                try {
                    dVar.close();
                } catch (IOException e11) {
                    f60972g.log(Level.FINE, "Error closing stream", (Throwable) e11);
                }
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e12) {
                f60972g.log(Level.WARNING, "Exception", (Throwable) e12);
                throw new IllegalStateException("Error in encoding public key");
            }
        } catch (Throwable th2) {
            try {
                dVar.close();
                throw th2;
            } catch (IOException e13) {
                f60972g.log(Level.FINE, "Error closing stream", (Throwable) e13);
                throw th2;
            }
        }
    }

    public static byte[] r(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey == null) {
            throw new IllegalArgumentException("Cannot encode null public key");
        }
        if (!(publicKey instanceof ECPublicKey)) {
            if (publicKey instanceof DHPublicKey) {
                return yq0.o.A(((DHPublicKey) publicKey).getY());
            }
            throw new InvalidKeyException("Unsupported public key: " + publicKey.getClass().getCanonicalName());
        }
        ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(yq0.o.i(eCPublicKey.getW(), eCPublicKey.getParams().getCurve().getField().getFieldSize()));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (IOException e11) {
            throw new IllegalStateException("Internal error writing to memory", e11);
        }
    }

    private static String s(String str) {
        StringBuilder sb2 = new StringBuilder(str.replace('<', ' ').trim().replace(' ', '<'));
        while (sb2.length() < 9) {
            sb2.append('<');
        }
        return sb2.toString();
    }

    private static byte[] t(String str, Mac mac, PublicKey publicKey) {
        byte[] bArrDoFinal = mac.doFinal(p(str, publicKey));
        byte[] bArr = new byte[8];
        System.arraycopy(bArrDoFinal, 0, bArr, 0, 8);
        return bArr;
    }

    public static byte[] u(String str, SecretKey secretKey, PublicKey publicKey) {
        return t(str, yq0.o.v(w(br0.n.h(str)), secretKey), publicKey);
    }

    public static ECPoint v(BigInteger bigInteger, ECParameterSpec eCParameterSpec) {
        BigInteger bigIntegerX = yq0.o.x(eCParameterSpec);
        if (!BigInteger.valueOf(3L).equals(bigIntegerX.mod(BigInteger.valueOf(4L)))) {
            throw new InvalidParameterException("Cannot encode point because p != 3 (mod 4)");
        }
        int cofactor = eCParameterSpec.getCofactor();
        BigInteger a11 = eCParameterSpec.getCurve().getA();
        BigInteger b11 = eCParameterSpec.getCurve().getB();
        BigInteger bigIntegerMod = bigInteger.modPow(BigInteger.valueOf(2L), bigIntegerX).negate().mod(bigIntegerX);
        BigInteger bigIntegerMod2 = bigIntegerMod.add(bigIntegerMod.modPow(BigInteger.valueOf(2L), bigIntegerX)).mod(bigIntegerX);
        BigInteger bigInteger2 = BigInteger.ONE;
        BigInteger bigIntegerMod3 = b11.negate().multiply(bigInteger2.add(bigIntegerMod2)).multiply(a11.multiply(bigIntegerMod2).modPow(bigIntegerX.subtract(bigInteger2).subtract(bigInteger2), bigIntegerX)).mod(bigIntegerX);
        BigInteger bigIntegerMod4 = bigIntegerMod.multiply(bigIntegerMod3).mod(bigIntegerX);
        BigInteger bigIntegerMod5 = bigIntegerMod3.modPow(BigInteger.valueOf(3L), bigIntegerX).add(a11.multiply(bigIntegerMod3)).add(b11).mod(bigIntegerX);
        BigInteger bigIntegerMod6 = bigInteger.modPow(BigInteger.valueOf(3L), bigIntegerX).multiply(bigIntegerMod5).mod(bigIntegerX);
        BigInteger bigIntegerModPow = bigIntegerMod5.modPow(bigIntegerX.subtract(bigInteger2).subtract(bigIntegerX.add(bigInteger2).multiply(BigInteger.valueOf(4L).modInverse(bigIntegerX)).mod(bigIntegerX)), bigIntegerX);
        ECPoint eCPoint = bigIntegerModPow.modPow(BigInteger.valueOf(2L), bigIntegerX).multiply(bigIntegerMod5).mod(bigIntegerX).equals(bigInteger2) ? new ECPoint(bigIntegerMod3, bigIntegerModPow.multiply(bigIntegerMod5).mod(bigIntegerX)) : new ECPoint(bigIntegerMod4, bigIntegerModPow.multiply(bigIntegerMod6).mod(bigIntegerX));
        if (cofactor == 1) {
            return yq0.o.F(eCPoint, eCParameterSpec);
        }
        org.bouncycastle.math.ec.ECPoint eCPointO = yq0.o.O(eCPoint, eCParameterSpec);
        eCPointO.multiply(BigInteger.valueOf(cofactor));
        return yq0.o.j(eCPointO);
    }

    private static String w(String str) throws InvalidAlgorithmParameterException {
        if (str == null) {
            throw new IllegalArgumentException("Cannot infer MAC algorithm from cipher algorithm null");
        }
        if (str.startsWith("DESede")) {
            return "ISO9797ALG3WITHISO7816-4PADDING";
        }
        if (str.startsWith("AES")) {
            return "AESCMAC";
        }
        throw new InvalidAlgorithmParameterException("Cannot infer MAC algorithm from cipher algorithm \"" + str + "\"");
    }

    private static boolean x(PublicKey publicKey, PublicKey publicKey2) {
        try {
            return publicKey.equals(publicKey2);
        } catch (RuntimeException e11) {
            f60972g.log(Level.WARNING, "Exception during public key equals", (Throwable) e11);
            return false;
        }
    }

    public static DHParameterSpec y(byte[] bArr, BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
        BigInteger p11 = dHParameterSpec.getP();
        return new DHParameterSpec(p11, dHParameterSpec.getG().modPow(yq0.o.H(bArr), p11).multiply(bigInteger).mod(p11), dHParameterSpec.getL());
    }

    public static ECParameterSpec z(byte[] bArr, ECPoint eCPoint, ECParameterSpec eCParameterSpec) {
        ECPoint generator = eCParameterSpec.getGenerator();
        EllipticCurve curve = eCParameterSpec.getCurve();
        BigInteger a11 = curve.getA();
        BigInteger b11 = curve.getB();
        BigInteger p11 = ((ECFieldFp) curve.getField()).getP();
        BigInteger order = eCParameterSpec.getOrder();
        int cofactor = eCParameterSpec.getCofactor();
        ECPoint eCPointA = yq0.o.a(yq0.o.E(yq0.o.H(bArr), generator, eCParameterSpec), eCPoint, eCParameterSpec);
        if (!yq0.o.O(eCPointA, eCParameterSpec).isValid()) {
            f60972g.info("ephemeralGenerator is not a valid point");
        }
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(p11), a11, b11), eCPointA, order, cofactor);
    }

    public v f(yq0.g gVar, String str, AlgorithmParameterSpec algorithmParameterSpec, BigInteger bigInteger) throws CardServiceProtocolException {
        try {
            return g(gVar, e(gVar, str), str, algorithmParameterSpec, bigInteger);
        } catch (GeneralSecurityException e11) {
            throw new CardServiceProtocolException("PCD side error in key derivation step", 0, e11);
        }
    }

    public byte[] h(SecretKey secretKey, Cipher cipher) throws CardServiceProtocolException {
        try {
            byte[] bArrH = ap0.e.h(128, this.f60979a.b(this.f60980b, new byte[0], 256, false));
            cipher.init(2, secretKey, new IvParameterSpec(new byte[cipher.getBlockSize()]));
            return cipher.doFinal(bArrH);
        } catch (GeneralSecurityException e11) {
            throw new CardServiceProtocolException("PCD side exception in tranceiving nonce step", 1, e11);
        } catch (CardServiceException e12) {
            throw new CardServiceProtocolException("PICC side exception in tranceiving nonce step", 1, e12);
        }
    }

    public t i(br0.n.b bVar, String str, AlgorithmParameterSpec algorithmParameterSpec, byte[] bArr, Cipher cipher) throws CardServiceProtocolException {
        int i11 = a.f60985a[bVar.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return j(str, algorithmParameterSpec, bArr);
        }
        if (i11 == 3) {
            return k(str, algorithmParameterSpec, bArr, cipher);
        }
        throw new CardServiceProtocolException("Unsupported mapping type " + bVar, 2);
    }

    public o j(String str, AlgorithmParameterSpec algorithmParameterSpec, byte[] bArr) throws CardServiceProtocolException {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(str, f60973h);
            keyPairGenerator.initialize(algorithmParameterSpec);
            KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
            PublicKey publicKey = keyPairGenerateKeyPair.getPublic();
            PrivateKey privateKey = keyPairGenerateKeyPair.getPrivate();
            PublicKey publicKeyD = d(ap0.e.h(EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, this.f60979a.b(this.f60980b, ap0.e.i(EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, r(publicKey)), this.f60982d, false)), algorithmParameterSpec);
            if ("ECDH".equals(str)) {
                q qVar = new q();
                qVar.b(privateKey);
                ECPoint eCPointA = qVar.a(publicKeyD);
                return new r(algorithmParameterSpec, bArr, publicKeyD, keyPairGenerateKeyPair, eCPointA, z(bArr, eCPointA, (ECParameterSpec) algorithmParameterSpec));
            }
            if ("DH".equals(str)) {
                KeyAgreement keyAgreement = KeyAgreement.getInstance(str);
                keyAgreement.init(privateKey);
                keyAgreement.doPhase(publicKeyD, true);
                byte[] bArrGenerateSecret = keyAgreement.generateSecret();
                return new p(algorithmParameterSpec, bArr, publicKeyD, keyPairGenerateKeyPair, bArrGenerateSecret, y(bArr, yq0.o.H(bArrGenerateSecret), (DHParameterSpec) algorithmParameterSpec));
            }
            throw new IllegalArgumentException("Unsupported parameters for mapping nonce, expected \"ECDH\" / ECParameterSpec or \"DH\" / DHParameterSpec, found \"" + str + "\" /" + algorithmParameterSpec.getClass().getCanonicalName());
        } catch (CardServiceException e11) {
            throw new CardServiceProtocolException("PICC side exception in mapping nonce step", 2, e11);
        } catch (Exception e12) {
            throw new CardServiceProtocolException("PCD side error in mapping nonce step", 2, e12);
        }
    }

    public s k(String str, AlgorithmParameterSpec algorithmParameterSpec, byte[] bArr, Cipher cipher) throws CardServiceProtocolException {
        try {
            byte[] bArr2 = new byte[bArr.length];
            this.f60984f.nextBytes(bArr2);
            this.f60979a.b(this.f60980b, ap0.e.i(EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, bArr2), this.f60982d, false);
            if ("ECDH".equals(str)) {
                return new s(algorithmParameterSpec, bArr, bArr2, B(bArr, bArr2, cipher.getAlgorithm(), (ECParameterSpec) algorithmParameterSpec));
            }
            if ("DH".equals(str)) {
                return new s(algorithmParameterSpec, bArr, bArr2, A(bArr, bArr2, cipher.getAlgorithm(), (DHParameterSpec) algorithmParameterSpec));
            }
            throw new IllegalArgumentException("Unsupported parameters for mapping nonce, expected \"ECDH\" / ECParameterSpec or \"DH\" / DHParameterSpec, found \"" + str + "\" /" + algorithmParameterSpec.getClass().getCanonicalName());
        } catch (GeneralSecurityException e11) {
            throw new CardServiceProtocolException("PCD side error in mapping nonce step", 2, e11);
        } catch (CardServiceException e12) {
            throw new CardServiceProtocolException("PICC side exception in mapping nonce step", 2, e12);
        }
    }

    public PublicKey l(PublicKey publicKey, AlgorithmParameterSpec algorithmParameterSpec) throws CardServiceProtocolException {
        try {
            PublicKey publicKeyD = d(ap0.e.h(132, this.f60979a.b(this.f60980b, ap0.e.i(131, r(publicKey)), this.f60982d, false)), algorithmParameterSpec);
            if (x(publicKey, publicKeyD)) {
                throw new CardServiceProtocolException("PCD's public key and PICC's public key are the same in key agreement step!", 3);
            }
            return publicKeyD;
        } catch (CardServiceException e11) {
            throw new CardServiceProtocolException("PICC side exception in key agreement step", 3, e11);
        } catch (Exception e12) {
            throw new CardServiceProtocolException("PCD side exception in key agreement step", 3, e12);
        }
    }

    public KeyPair m(String str, AlgorithmParameterSpec algorithmParameterSpec) throws CardServiceProtocolException {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(str, f60973h);
            keyPairGenerator.initialize(algorithmParameterSpec);
            return keyPairGenerator.generateKeyPair();
        } catch (GeneralSecurityException e11) {
            throw new CardServiceProtocolException("PCD side error during generation of PCD key pair", 3, e11);
        }
    }

    public byte[] n(String str, PrivateKey privateKey, PublicKey publicKey) throws CardServiceProtocolException {
        try {
            KeyAgreement keyAgreement = KeyAgreement.getInstance(str, f60973h);
            keyAgreement.init(privateKey);
            keyAgreement.doPhase(D(publicKey, privateKey), true);
            return keyAgreement.generateSecret();
        } catch (Exception e11) {
            throw new CardServiceProtocolException("PCD side error during key agreement", 3, e11);
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00e2: INVOKE (r1 I:ap0.b) VIRTUAL call: ap0.b.close():void A[Catch: Exception -> 0x0090, IOException -> 0x00e6, MD:():void throws java.io.IOException (m), TRY_ENTER, TRY_LEAVE] (LINE:227), block:B:42:0x00e2 */
    public byte[] o(String str, br0.n.b bVar, KeyPair keyPair, PublicKey publicKey, SecretKey secretKey) throws CardServiceProtocolException {
        ap0.b bVarClose;
        Logger logger;
        try {
            try {
                ap0.b bVar2 = new ap0.b(new ByteArrayInputStream(this.f60979a.b(this.f60980b, ap0.e.i(133, u(str, secretKey, publicKey)), 256, true)));
                try {
                    int iN = bVar2.n();
                    if (iN != 134) {
                        f60972g.warning("Was expecting tag 0x86, found: " + Integer.toHexString(iN));
                    }
                    bVar2.c();
                    byte[] bArrO = bVar2.o();
                    byte[] bArrU = u(str, secretKey, keyPair.getPublic());
                    if (!Arrays.equals(bArrU, bArrO)) {
                        throw new GeneralSecurityException("PICC authentication token mismatch, expectedPICCToken = " + bp0.a.b(bArrU) + ", piccToken = " + bp0.a.b(bArrO));
                    }
                    if (bVar != br0.n.b.CAM) {
                        try {
                            bVar2.close();
                            return null;
                        } catch (IOException e11) {
                            e = e11;
                            logger = f60972g;
                            logger.log(Level.FINE, "Exception closing stream", (Throwable) e);
                            return null;
                        }
                    }
                    int iN2 = bVar2.n();
                    if (iN2 != 138) {
                        f60972g.warning("Was expecting tag 0x8A, found: " + Integer.toHexString(iN2));
                    }
                    bVar2.c();
                    byte[] bArrO2 = bVar2.o();
                    try {
                        bVar2.close();
                        return bArrO2;
                    } catch (IOException e12) {
                        f60972g.log(Level.FINE, "Exception closing stream", (Throwable) e12);
                        return bArrO2;
                    }
                    throw new CardServiceProtocolException("PCD side exception in authentication token generation step", 4, e);
                } catch (IOException e13) {
                    f60972g.log(Level.WARNING, "Could not parse step 4 response", (Throwable) e13);
                    try {
                        bVar2.close();
                        return null;
                    } catch (IOException e14) {
                        e = e14;
                        logger = f60972g;
                        logger.log(Level.FINE, "Exception closing stream", (Throwable) e);
                        return null;
                    }
                }
            } catch (Throwable th2) {
                try {
                    bVarClose.close();
                } catch (IOException e15) {
                    f60972g.log(Level.FINE, "Exception closing stream", (Throwable) e15);
                }
                throw th2;
            }
        } catch (Exception e16) {
            throw new CardServiceProtocolException("PCD side exception in authentication token generation step", 4, e16);
        }
    }
}
