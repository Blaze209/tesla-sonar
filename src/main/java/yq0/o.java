package yq0;

import com.adyen.checkout.components.core.Address;
import com.google.android.gms.nearby.uwb.RangingPosition;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.pkcs.DHParameter;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X962NamedCurves;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.jce.ECNamedCurveTable;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes10.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f125773a = Logger.getLogger("org.jmrtd");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Provider f125774b = new BouncyCastleProvider();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final DHParameters f125775c = l("B10B8F96A080E01DDE92DE5EAE5D54EC52C99FBCFB06A3C69A6A9DCA52D23B616073E28675A23D189838EF1E2EE652C013ECB4AEA906112324975C3CD49B83BFACCBDD7D90C4BD7098488E9C219A73724EFFD6FAE5644738FAA31A4FF55BCCC0A151AF5F0DC8B4BD45BF37DF365C1A65E68CFDA76D4DA708DF1FB2BC2E4A4371", "A4D1CBD5C3FD34126765A442EFB99905F8104DD258AC507FD6406CFF14266D31266FEA1E5C41564B777E690F5504F213160217B4B01B886A5E91547F9E2749F4D7FBD7D3B9A92EE1909D0D2263F80A76A6A24C087A091F531DBF0A0169B6A28AD662A4D18E73AFA32D779D5918D08BC8858F4DCEF97C2A24855E6EEB22B3B2E5", "F518AA8781A8DF278ABA4E7D64B7CB9D49462353");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final DHParameters f125776d = l("AD107E1E9123A9D0D660FAA79559C51FA20D64E5683B9FD1B54B1597B61D0A75E6FA141DF95A56DBAF9A3C407BA1DF15EB3D688A309C180E1DE6B85A1274A0A66D3F8152AD6AC2129037C9EDEFDA4DF8D91E8FEF55B7394B7AD5B7D0B6C12207C9F98D11ED34DBF6C6BA0B2C8BBC27BE6A00E0A0B9C49708B3BF8A317091883681286130BC8985DB1602E714415D9330278273C7DE31EFDC7310F7121FD5A07415987D9ADC0A486DCDF93ACC44328387315D75E198C641A480CD86A1B9E587E8BE60E69CC928B2B9C52172E413042E9B23F10B0E16E79763C9B53DCF4BA80A29E3FB73C16B8E75B97EF363E2FFA31F71CF9DE5384E71B81C0AC4DFFE0C10E64F", "AC4032EF4F2D9AE39DF30B5C8FFDAC506CDEBE7B89998CAF74866A08CFE4FFE3A6824A4E10B9A6F0DD921F01A70C4AFAAB739D7700C29F52C57DB17C620A8652BE5E9001A8D66AD7C17669101999024AF4D027275AC1348BB8A762D0521BC98AE247150422EA1ED409939D54DA7460CDB5F6C6B250717CBEF180EB34118E98D119529A45D6F834566E3025E316A330EFBB77A86F0C1AB15B051AE3D428C8F8ACB70A8137150B8EEB10E183EDD19963DDD9E263E4770589EF6AA21E7F5F2FF381B539CCE3409D13CD566AFBB48D6C019181E1BCFE94B30269EDFE72FE9B6AA4BD7B5A0F1C71CFFF4C19C418E1F6EC017981BC087F2A7065B384B890D3191F2BFA", "801C0D34C58D93FE997177101F80535A4738CEBCBF389A99B36371EB");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final DHParameters f125777e = l("87A8E61DB4B6663CFFBBD19C651959998CEEF608660DD0F25D2CEED4435E3B00E00DF8F1D61957D4FAF7DF4561B2AA3016C3D91134096FAA3BF4296D830E9A7C209E0C6497517ABD5A8A9D306BCF67ED91F9E6725B4758C022E0B1EF4275BF7B6C5BFC11D45F9088B941F54EB1E59BB8BC39A0BF12307F5C4FDB70C581B23F76B63ACAE1CAA6B7902D52526735488A0EF13C6D9A51BFA4AB3AD8347796524D8EF6A167B5A41825D967E144E5140564251CCACB83E6B486F6B3CA3F7971506026C0B857F689962856DED4010ABD0BE621C3A3960A54E710C375F26375D7014103A4B54330C198AF126116D2276E11715F693877FAD7EF09CADB094AE91E1A1597", "3FB32C9B73134D0B2E77506660EDBD484CA7B18F21EF205407F4793A1A0BA12510DBC15077BE463FFF4FED4AAC0BB555BE3A6C1B0C6B47B1BC3773BF7E8C6F62901228F8C28CBB18A55AE31341000A650196F931C77A57F2DDF463E5E9EC144B777DE62AAAB8A8628AC376D282D6ED3864E67982428EBC831D14348F6F2F9193B5045AF2767164E1DFC967C1FB3F2E55A4BD1BFFE83B9C80D052B985D182EA0ADB2A3B7313D3FE14C8484B1E052588B9B7D2BBD2DF016199ECD06E1557CD0915B3353BBB64E0EC377FD028370DF92B52C7891428CDC67EB6184B523D1DB246C32F63078490F00EF8D647D148D47954515E2327CFEF98C582664B4C0F6CC41659", "8CF83642A709A097B447997640129DA299B1A47D1EB3750BA308B0FE64F5FBD3");

    public static byte[] A(BigInteger bigInteger) {
        int length = bigInteger.toString(16).length();
        if (length % 2 != 0) {
            length++;
        }
        return B(bigInteger, length / 2);
    }

    public static byte[] B(BigInteger bigInteger, int i11) {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(256L);
        byte[] bArr = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            BigInteger bigIntegerMod = bigInteger.mod(bigIntegerValueOf);
            bigInteger = bigInteger.divide(bigIntegerValueOf);
            bArr[(i11 - 1) - i12] = (byte) bigIntegerMod.intValue();
        }
        return bArr;
    }

    public static String C(String str, int i11) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if ("DESede".equals(str) || "AES-128".equals(str)) {
            return "SHA-1";
        }
        if ("AES".equals(str) && i11 == 128) {
            return "SHA-1";
        }
        if ("AES-256".equals(str) || "AES-192".equals(str)) {
            return "SHA-256";
        }
        if ("AES".equals(str) && (i11 == 192 || i11 == 256)) {
            return "SHA-256";
        }
        throw new IllegalArgumentException("Unsupported cipher algorithm or key length \"" + str + "\", " + i11);
    }

    public static String D(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        String upperCase = str.toUpperCase();
        String str2 = upperCase.contains("WITH") ? upperCase.split("WITH")[0] : null;
        if ("SHA1".equalsIgnoreCase(str2)) {
            return "SHA-1";
        }
        if ("SHA224".equalsIgnoreCase(str2)) {
            return "SHA-224";
        }
        if ("SHA256".equalsIgnoreCase(str2)) {
            return "SHA-256";
        }
        if ("SHA384".equalsIgnoreCase(str2)) {
            return "SHA-384";
        }
        return "SHA512".equalsIgnoreCase(str2) ? "SHA-512" : str2;
    }

    public static ECPoint E(BigInteger bigInteger, ECPoint eCPoint, ECParameterSpec eCParameterSpec) {
        return j(O(eCPoint, eCParameterSpec).multiply(bigInteger));
    }

    public static ECPoint F(ECPoint eCPoint, ECParameterSpec eCParameterSpec) {
        return j(O(eCPoint, eCParameterSpec).normalize());
    }

    public static ECPoint G(byte[] bArr) {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        try {
            try {
                if (dataInputStream.read() != 4) {
                    throw new IllegalArgumentException("Expected encoded ECPoint to start with 0x04");
                }
                int length = (bArr.length - 1) / 2;
                byte[] bArr2 = new byte[length];
                byte[] bArr3 = new byte[length];
                dataInputStream.readFully(bArr2);
                dataInputStream.readFully(bArr3);
                dataInputStream.close();
                ECPoint eCPoint = new ECPoint(H(bArr2), H(bArr3));
                try {
                    dataInputStream.close();
                    return eCPoint;
                } catch (IOException e11) {
                    f125773a.log(Level.FINE, "Error closing stream", (Throwable) e11);
                    return eCPoint;
                }
            } catch (IOException e12) {
                throw new IllegalArgumentException("Exception", e12);
            }
        } catch (Throwable th2) {
            try {
                dataInputStream.close();
            } catch (IOException e13) {
                f125773a.log(Level.FINE, "Error closing stream", (Throwable) e13);
            }
            throw th2;
        }
    }

    public static BigInteger H(byte[] bArr) {
        if (bArr != null) {
            return I(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException();
    }

    public static BigInteger I(byte[] bArr, int i11, int i12) {
        if (bArr == null) {
            throw new IllegalArgumentException();
        }
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(256L);
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            bigIntegerAdd = bigIntegerAdd.multiply(bigIntegerValueOf).add(BigInteger.valueOf(bArr[i13] & 255));
        }
        return bigIntegerAdd;
    }

    public static byte[] J(byte[] bArr, int i11) {
        return K(bArr, 0, bArr.length, i11);
    }

    public static byte[] K(byte[] bArr, int i11, int i12, int i13) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(bArr, i11, i12);
        byteArrayOutputStream.write(RangingPosition.RSSI_UNKNOWN);
        while (byteArrayOutputStream.size() % i13 != 0) {
            byteArrayOutputStream.write(0);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static List<byte[]> L(int i11, byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        if (bArr == null || i11 <= 0) {
            throw new IllegalArgumentException("Cannot partition");
        }
        int iMin = Math.min(bArr.length, i11);
        int length = bArr.length / iMin;
        int length2 = bArr.length % iMin;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            byte[] bArr2 = new byte[iMin];
            System.arraycopy(bArr, i12, bArr2, 0, iMin);
            arrayList.add(bArr2);
            i12 += iMin;
        }
        if (length2 != 0) {
            byte[] bArr3 = new byte[length2];
            System.arraycopy(bArr, i12, bArr3, 0, length2);
            arrayList.add(bArr3);
        }
        return arrayList;
    }

    public static PublicKey M(PublicKey publicKey) {
        if (!(publicKey instanceof ECPublicKey)) {
            return publicKey;
        }
        try {
            ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
            return KeyFactory.getInstance("EC", f125774b).generatePublic(new ECPublicKeySpec(eCPublicKey.getW(), U(eCPublicKey.getParams())));
        } catch (Exception e11) {
            f125773a.log(Level.WARNING, "Could not make public key param spec explicit", (Throwable) e11);
            return publicKey;
        }
    }

    private static ECCurve N(ECParameterSpec eCParameterSpec) {
        EllipticCurve curve = eCParameterSpec.getCurve();
        ECField field = curve.getField();
        if (!(field instanceof ECFieldFp)) {
            throw new IllegalArgumentException("Only prime field supported (for now), found " + field.getClass().getCanonicalName());
        }
        int cofactor = eCParameterSpec.getCofactor();
        return new ECCurve.Fp(x(eCParameterSpec), curve.getA(), curve.getB(), eCParameterSpec.getOrder(), BigInteger.valueOf(cofactor));
    }

    public static org.bouncycastle.math.ec.ECPoint O(ECPoint eCPoint, ECParameterSpec eCParameterSpec) {
        return N(eCParameterSpec).createPoint(eCPoint.getAffineX(), eCPoint.getAffineY());
    }

    public static ECDomainParameters P(ECParameterSpec eCParameterSpec) {
        return new ECDomainParameters(N(eCParameterSpec), O(eCParameterSpec.getGenerator(), eCParameterSpec), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed());
    }

    public static ECPrivateKeyParameters Q(ECPrivateKey eCPrivateKey) {
        return new ECPrivateKeyParameters(eCPrivateKey.getS(), P(eCPrivateKey.getParams()));
    }

    public static ECPublicKeyParameters R(ECPublicKey eCPublicKey) {
        ECParameterSpec params = eCPublicKey.getParams();
        return new ECPublicKeyParameters(O(eCPublicKey.getW(), params), P(params));
    }

    public static ECNamedCurveSpec S(ECNamedCurveParameterSpec eCNamedCurveParameterSpec) {
        return new ECNamedCurveSpec(eCNamedCurveParameterSpec.getName(), eCNamedCurveParameterSpec.getCurve(), eCNamedCurveParameterSpec.getG(), eCNamedCurveParameterSpec.getN(), eCNamedCurveParameterSpec.getH(), eCNamedCurveParameterSpec.getSeed());
    }

    public static DHParameterSpec T(DHParameters dHParameters) {
        BigInteger p11 = dHParameters.getP();
        BigInteger g11 = dHParameters.getG();
        BigInteger q11 = dHParameters.getQ();
        return q11 == null ? new DHParameterSpec(p11, g11, dHParameters.getL()) : new br0.n.a(p11, g11, q11);
    }

    public static ECParameterSpec U(ECParameterSpec eCParameterSpec) {
        if (eCParameterSpec == null) {
            return null;
        }
        try {
            ECPoint generator = eCParameterSpec.getGenerator();
            BigInteger order = eCParameterSpec.getOrder();
            int cofactor = eCParameterSpec.getCofactor();
            EllipticCurve curve = eCParameterSpec.getCurve();
            BigInteger a11 = curve.getA();
            BigInteger b11 = curve.getB();
            ECField field = curve.getField();
            if (field instanceof ECFieldFp) {
                return new ECParameterSpec(new EllipticCurve(new ECFieldFp(((ECFieldFp) field).getP()), a11, b11), generator, order, cofactor);
            }
            if (field instanceof ECFieldF2m) {
                return new ECParameterSpec(new EllipticCurve(new ECFieldF2m(((ECFieldF2m) field).getM()), a11, b11), generator, order, cofactor);
            }
            f125773a.warning("Could not make named EC param spec explicit");
            return eCParameterSpec;
        } catch (Exception e11) {
            f125773a.log(Level.WARNING, "Could not make named EC param spec explicit", (Throwable) e11);
            return eCParameterSpec;
        }
    }

    public static ECParameterSpec V(ECNamedCurveParameterSpec eCNamedCurveParameterSpec) {
        return U(S(eCNamedCurveParameterSpec));
    }

    private static ECNamedCurveSpec W(ECParameterSpec eCParameterSpec) {
        if (eCParameterSpec == null) {
            return null;
        }
        if (eCParameterSpec instanceof ECNamedCurveSpec) {
            return (ECNamedCurveSpec) eCParameterSpec;
        }
        ArrayList list = Collections.list(ECNamedCurveTable.getNames());
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ECNamedCurveSpec eCNamedCurveSpecS = S(ECNamedCurveTable.getParameterSpec((String) it.next()));
            if (eCNamedCurveSpecS.getCurve().equals(eCParameterSpec.getCurve()) && eCNamedCurveSpecS.getGenerator().equals(eCParameterSpec.getGenerator()) && eCNamedCurveSpecS.getOrder().equals(eCParameterSpec.getOrder()) && eCNamedCurveSpecS.getCofactor() == eCParameterSpec.getCofactor()) {
                arrayList.add(eCNamedCurveSpecS);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.size() == 1 ? (ECNamedCurveSpec) arrayList.get(0) : (ECNamedCurveSpec) arrayList.get(0);
    }

    public static byte[] X(String str) {
        try {
            ap0.b bVar = new ap0.b(new ByteArrayInputStream(new ASN1ObjectIdentifier(str).getEncoded()));
            try {
                bVar.n();
                bVar.c();
                return ap0.e.i(128, bVar.o());
            } finally {
                bVar.close();
            }
        } catch (IOException e11) {
            throw new IllegalArgumentException("Illegal OID: \"" + str, e11);
        }
    }

    public static PublicKey Y(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        try {
            try {
                X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(subjectPublicKeyInfo.getEncoded("DER"));
                try {
                    return KeyFactory.getInstance("DH").generatePublic(x509EncodedKeySpec);
                } catch (GeneralSecurityException e11) {
                    f125773a.log(Level.FINE, "Not DH public key? Fine, try EC public key", (Throwable) e11);
                    return KeyFactory.getInstance("EC", f125774b).generatePublic(x509EncodedKeySpec);
                }
            } catch (GeneralSecurityException e12) {
                f125773a.log(Level.WARNING, "Exception", (Throwable) e12);
                return null;
            }
        } catch (Exception e13) {
            f125773a.log(Level.WARNING, "Exception", (Throwable) e13);
            return null;
        }
    }

    public static SubjectPublicKeyInfo Z(PublicKey publicKey) {
        try {
            String algorithm = publicKey.getAlgorithm();
            if (!"EC".equals(algorithm) && !"ECDH".equals(algorithm) && !(publicKey instanceof ECPublicKey)) {
                if (!"DH".equals(algorithm) && !(publicKey instanceof DHPublicKey)) {
                    throw new IllegalArgumentException("Unrecognized key type, found " + publicKey.getAlgorithm() + ", should be DH or ECDH");
                }
                ASN1InputStream aSN1InputStream = new ASN1InputStream(publicKey.getEncoded());
                try {
                    AlgorithmIdentifier algorithm2 = SubjectPublicKeyInfo.getInstance(aSN1InputStream.readObject()).getAlgorithm();
                    DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
                    DHParameterSpec params = dHPublicKey.getParams();
                    return new SubjectPublicKeyInfo(new AlgorithmIdentifier(algorithm2.getAlgorithm(), new DHParameter(params.getP(), params.getG(), params.getL()).toASN1Primitive()), new ASN1Integer(dHPublicKey.getY()));
                } finally {
                    aSN1InputStream.close();
                }
            }
            ASN1InputStream aSN1InputStream2 = new ASN1InputStream(publicKey.getEncoded());
            try {
                SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(aSN1InputStream2.readObject());
                AlgorithmIdentifier algorithm3 = subjectPublicKeyInfo.getAlgorithm();
                String id2 = algorithm3.getAlgorithm().getId();
                if (!br0.p.f18008r.equals(id2)) {
                    throw new IllegalStateException("Was expecting id-ecPublicKey (" + br0.p.f18007q + "), found " + id2);
                }
                ASN1Primitive aSN1Primitive = algorithm3.getParameters().toASN1Primitive();
                if (aSN1Primitive instanceof ASN1ObjectIdentifier) {
                    ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) aSN1Primitive;
                    X9ECParameters byOID = X962NamedCurves.getByOID(aSN1ObjectIdentifier);
                    if (byOID == null) {
                        throw new IllegalStateException("Could not find X9.62 named curve for OID " + aSN1ObjectIdentifier.getId());
                    }
                    org.bouncycastle.math.ec.ECPoint g11 = byOID.getG();
                    X9ECParameters x9ECParameters = new X9ECParameters(byOID.getCurve(), new X9ECPoint(g11.getCurve().createPoint(g11.getAffineXCoord().toBigInteger(), g11.getAffineYCoord().toBigInteger()), false), byOID.getN(), byOID.getH(), byOID.getSeed());
                    if (publicKey instanceof org.bouncycastle.jce.interfaces.ECPublicKey) {
                        subjectPublicKeyInfo = new SubjectPublicKeyInfo(new AlgorithmIdentifier(subjectPublicKeyInfo.getAlgorithm().getAlgorithm(), x9ECParameters.toASN1Primitive()), ((org.bouncycastle.jce.interfaces.ECPublicKey) publicKey).getQ().getEncoded(false));
                    }
                }
                aSN1InputStream2.close();
                return subjectPublicKeyInfo;
            } catch (Throwable th2) {
                aSN1InputStream2.close();
                throw th2;
            }
        } catch (Exception e11) {
            f125773a.log(Level.WARNING, "Exception", (Throwable) e11);
            return null;
        }
        f125773a.log(Level.WARNING, "Exception", (Throwable) e11);
        return null;
    }

    public static ECPoint a(ECPoint eCPoint, ECPoint eCPoint2, ECParameterSpec eCParameterSpec) {
        return j(O(eCPoint, eCParameterSpec).add(O(eCPoint2, eCParameterSpec)));
    }

    public static byte[] a0(byte[] bArr) throws BadPaddingException {
        int length = bArr.length - 1;
        while (length >= 0 && bArr[length] == 0) {
            length--;
        }
        if ((bArr[length] & 255) == 128) {
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }
        throw new BadPaddingException("Expected constant 0x80, found 0x" + Integer.toHexString(bArr[length] & 255));
    }

    public static byte[] b(byte[] bArr, int i11) {
        byte[] bArr2 = new byte[i11];
        int length = bArr.length < i11 ? bArr.length : i11;
        System.arraycopy(bArr, bArr.length - length, bArr2, i11 - length, length);
        return bArr2;
    }

    public static byte[] c(String str, String str2, String str3, String str4, boolean z11) {
        return d(str + cr0.g.b(str) + str2 + cr0.g.b(str2) + str3 + cr0.g.b(str3), str4, z11);
    }

    public static byte[] d(String str, String str2, boolean z11) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        messageDigest.update(o(str));
        byte[] bArrDigest = messageDigest.digest();
        if (!z11) {
            return bArrDigest;
        }
        byte[] bArr = new byte[16];
        System.arraycopy(bArrDigest, 0, bArr, 0, 16);
        return bArr;
    }

    public static SecretKey e(byte[] bArr, int i11) {
        return f(bArr, "DESede", 128, i11);
    }

    public static SecretKey f(byte[] bArr, String str, int i11, int i12) {
        return g(bArr, str, i11, null, i12);
    }

    public static SecretKey g(byte[] bArr, String str, int i11, byte[] bArr2, int i12) {
        return h(bArr, str, i11, bArr2, i12, (byte) 0);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b3  */
    public static SecretKey h(byte[] bArr, String str, int i11, byte[] bArr2, int i12, byte b11) {
        byte[] bArr3;
        byte[] bArr4;
        MessageDigest messageDigestW = w(C(str, i11));
        messageDigestW.reset();
        messageDigestW.update(bArr);
        if (bArr2 != null) {
            messageDigestW.update(bArr2);
        }
        messageDigestW.update(new byte[]{0, 0, 0, (byte) i12});
        byte[] bArrDigest = messageDigestW.digest();
        if (!"DESede".equalsIgnoreCase(str) && !"3DES".equalsIgnoreCase(str)) {
            if (!"AES".equalsIgnoreCase(str) && !str.startsWith("AES")) {
                bArr4 = null;
            } else if (i11 == 128) {
                bArr3 = new byte[16];
                System.arraycopy(bArrDigest, 0, bArr3, 0, 16);
            } else if (i11 == 192) {
                bArr3 = new byte[24];
                System.arraycopy(bArrDigest, 0, bArr3, 0, 24);
            } else {
                if (i11 != 256) {
                    throw new IllegalArgumentException("KDF can only use AES with 128-bit, 192-bit key or 256-bit length, found: " + i11 + "-bit key length");
                }
                byte[] bArr5 = new byte[32];
                System.arraycopy(bArrDigest, 0, bArr5, 0, 32);
                bArr4 = bArr5;
            }
            return b11 == 0 ? new SecretKeySpec(bArr4, str) : new m(bArr4, str, b11);
        }
        if (i11 != 112 && i11 != 128) {
            throw new IllegalArgumentException("KDF can only use DESede with 128-bit key length");
        }
        bArr3 = new byte[24];
        System.arraycopy(bArrDigest, 0, bArr3, 0, 8);
        System.arraycopy(bArrDigest, 8, bArr3, 8, 8);
        System.arraycopy(bArrDigest, 0, bArr3, 16, 8);
        bArr4 = bArr3;
        if (b11 == 0) {
        }
    }

    public static byte[] i(ECPoint eCPoint, int i11) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        try {
            byteArrayOutputStream.write(4);
            double d11 = ((double) i11) / 8.0d;
            byteArrayOutputStream.write(B(affineX, (int) Math.ceil(d11)));
            byteArrayOutputStream.write(B(affineY, (int) Math.ceil(d11)));
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e11) {
            throw new IllegalStateException("Exception", e11);
        }
    }

    public static ECPoint j(org.bouncycastle.math.ec.ECPoint eCPoint) {
        org.bouncycastle.math.ec.ECPoint eCPointNormalize = eCPoint.normalize();
        if (!eCPointNormalize.isValid()) {
            f125773a.warning("point not valid");
        }
        return new ECPoint(eCPointNormalize.getAffineXCoord().toBigInteger(), eCPointNormalize.getAffineYCoord().toBigInteger());
    }

    private static BigInteger k(String str) {
        return new BigInteger(1, Hex.decodeStrict(str));
    }

    private static DHParameters l(String str, String str2, String str3) {
        return new DHParameters(k(str), k(str2), k(str3));
    }

    public static int m(Key key) {
        if (key instanceof RSAPublicKey) {
            return ((RSAPublicKey) key).getModulus().bitLength();
        }
        if (key instanceof RSAPrivateKey) {
            return ((RSAPrivateKey) key).getModulus().bitLength();
        }
        if (key instanceof ECPublicKey) {
            return ((int) Math.ceil(((ECPublicKey) key).getParams().getCurve().getField().getFieldSize())) * 2;
        }
        if (key instanceof ECPrivateKey) {
            return ((int) Math.ceil(((ECPrivateKey) key).getParams().getCurve().getField().getFieldSize())) * 2;
        }
        f125773a.warning("Unknown key type, returning 0");
        return 0;
    }

    public static Provider n() {
        return f125774b;
    }

    public static byte[] o(String str) {
        byte[] bytes = str.getBytes();
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e11) {
            f125773a.log(Level.WARNING, "Exception", (Throwable) e11);
            return bytes;
        }
    }

    public static Cipher p(String str) {
        try {
            return Cipher.getInstance(str);
        } catch (Exception e11) {
            f125773a.log(Level.FINE, "Default provider could not provide this cipher, falling back to explicit BC", (Throwable) e11);
            return Cipher.getInstance(str, f125774b);
        }
    }

    public static Cipher q(String str, int i11, Key key) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        try {
            Cipher cipher = Cipher.getInstance(str);
            cipher.init(i11, key);
            return cipher;
        } catch (Exception e11) {
            f125773a.log(Level.FINE, "Default provider could not provide this Cipher, falling back to explicit BC", (Throwable) e11);
            Cipher cipher2 = Cipher.getInstance(str, f125774b);
            cipher2.init(i11, key);
            return cipher2;
        }
    }

    public static String r(ECParameterSpec eCParameterSpec) {
        ECNamedCurveSpec eCNamedCurveSpecW = W(eCParameterSpec);
        if (eCNamedCurveSpecW == null) {
            return null;
        }
        return eCNamedCurveSpecW.getName();
    }

    public static String s(PrivateKey privateKey) {
        String strR;
        if (privateKey == null) {
            return Address.ADDRESS_NULL_PLACEHOLDER;
        }
        String algorithm = privateKey.getAlgorithm();
        if (privateKey instanceof RSAPrivateKey) {
            return algorithm + " [" + ((RSAPrivateKey) privateKey).getModulus().bitLength() + " bit]";
        }
        if (!(privateKey instanceof ECPrivateKey) || (strR = r(((ECPrivateKey) privateKey).getParams())) == null) {
            return algorithm;
        }
        return algorithm + " [" + strR + "]";
    }

    public static String t(PublicKey publicKey) {
        if (publicKey == null) {
            return Address.ADDRESS_NULL_PLACEHOLDER;
        }
        String algorithm = publicKey.getAlgorithm();
        if (publicKey instanceof RSAPublicKey) {
            return algorithm + " [" + ((RSAPublicKey) publicKey).getModulus().bitLength() + " bit]";
        }
        if (publicKey instanceof ECPublicKey) {
            String strR = r(((ECPublicKey) publicKey).getParams());
            if (strR != null) {
                return algorithm + " [" + strR + "]";
            }
        } else if (publicKey instanceof DHPublicKey) {
            DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
            dHPublicKey.getY();
            DHParameterSpec params = dHPublicKey.getParams();
            BigInteger g11 = params.getG();
            return algorithm + " [p.length = " + params.getP().bitLength() + ", g.length = " + g11.bitLength() + ", l = " + params.getL() + "]";
        }
        return algorithm;
    }

    public static Mac u(String str) {
        try {
            return Mac.getInstance(str);
        } catch (Exception e11) {
            f125773a.log(Level.FINE, "Default provider could not provide this Mac, falling back to explicit BC", (Throwable) e11);
            return Mac.getInstance(str, f125774b);
        }
    }

    public static Mac v(String str, Key key) throws NoSuchAlgorithmException, InvalidKeyException {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(key);
            return mac;
        } catch (Exception e11) {
            f125773a.log(Level.FINE, "Default provider could not provide this Mac, falling back to explicit BC", (Throwable) e11);
            Mac mac2 = Mac.getInstance(str, f125774b);
            mac2.init(key);
            return mac2;
        }
    }

    public static MessageDigest w(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (Exception e11) {
            f125773a.log(Level.FINE, "Default provider could not provide this Message Digest, falling back to explicit BC", (Throwable) e11);
            return MessageDigest.getInstance(str, f125774b);
        }
    }

    public static BigInteger x(AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec == null) {
            throw new IllegalArgumentException("Parameters null");
        }
        if (algorithmParameterSpec instanceof DHParameterSpec) {
            return ((DHParameterSpec) algorithmParameterSpec).getP();
        }
        if (!(algorithmParameterSpec instanceof ECParameterSpec)) {
            throw new IllegalArgumentException("Unsupported agreement algorithm, was expecting DHParameterSpec or ECParameterSpec, found " + algorithmParameterSpec.getClass().getCanonicalName());
        }
        ECField field = ((ECParameterSpec) algorithmParameterSpec).getCurve().getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new IllegalStateException("Was expecting prime field of type ECFieldFp, found " + field.getClass().getCanonicalName());
    }

    public static PublicKey y(String str, KeySpec keySpec) {
        try {
            return KeyFactory.getInstance(str).generatePublic(keySpec);
        } catch (Exception e11) {
            f125773a.log(Level.FINE, "Default provider could not provide this Key Factory or Public Key, falling back to explicit BC", (Throwable) e11);
            return KeyFactory.getInstance(str, f125774b).generatePublic(keySpec);
        }
    }

    public static Signature z(String str) {
        try {
            return Signature.getInstance(str);
        } catch (Exception e11) {
            f125773a.log(Level.FINE, "Default provider could not provide this Signature, falling back to explicit BC", (Throwable) e11);
            return Signature.getInstance(str, f125774b);
        }
    }
}
