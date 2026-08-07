package dr0;

import com.plaid.internal.EnumC4419g;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.DHPublicKey;
import net.sf.scuba.smartcards.CardServiceException;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.jmrtd.CardServiceProtocolException;

/* JADX INFO: loaded from: classes10.dex */
public class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f60945e = Logger.getLogger("org.jmrtd");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Provider f60946f = yq0.o.n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private yq0.c f60947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private y f60948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f60949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f60950d;

    public j(yq0.c cVar, y yVar, int i11, boolean z11) {
        this.f60947a = cVar;
        this.f60948b = yVar;
        this.f60949c = i11;
        this.f60950d = z11;
    }

    public static byte[] a(String str, PublicKey publicKey, PrivateKey privateKey) throws NoSuchAlgorithmException, InvalidKeyException {
        KeyAgreement keyAgreement = KeyAgreement.getInstance(str, f60946f);
        keyAgreement.init(privateKey);
        keyAgreement.doPhase(publicKey, true);
        return keyAgreement.generateSecret();
    }

    private static byte[] c(String str, PublicKey publicKey) {
        if ("DH".equals(str)) {
            return yq0.o.A(((DHPublicKey) publicKey).getY());
        }
        if ("ECDH".equals(str)) {
            return ((ECPublicKey) publicKey).getQ().getEncoded(false);
        }
        throw new IllegalArgumentException("Unsupported agreement algorithm " + str);
    }

    public static byte[] d(String str, PublicKey publicKey) {
        if ("DH".equals(str) || (publicKey instanceof DHPublicKey)) {
            return MessageDigest.getInstance("SHA-1").digest(c(str, publicKey));
        }
        if ("ECDH".equals(str) || (publicKey instanceof java.security.interfaces.ECPublicKey)) {
            ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
            return yq0.o.b(yq0.o.A(eCPublicKey.getQ().getAffineXCoord().toBigInteger()), (int) Math.ceil(((double) eCPublicKey.getParameters().getCurve().getFieldSize()) / 8.0d));
        }
        throw new IllegalArgumentException("Unsupported agreement algorithm " + str);
    }

    private static String e(String str) {
        if (br0.p.f17994d.equals(str)) {
            f60945e.warning("Could not determine ChipAuthentication algorithm, defaulting to id-CA-ECDH-3DES-CBC-CBC");
            return br0.p.f17996f;
        }
        if (br0.p.f17993c.equals(str)) {
            f60945e.warning("Could not determine ChipAuthentication algorithm, defaulting to id-CA-DH-3DES-CBC-CBC");
            return br0.p.f17995e;
        }
        f60945e.warning("No ChipAuthenticationInfo and unsupported ChipAuthenticationPublicKeyInfo public key OID " + str);
        return null;
    }

    public static y f(String str, byte[] bArr, int i11, boolean z11) {
        String strG = br0.i.g(str);
        int i12 = br0.i.i(str);
        SecretKey secretKeyF = yq0.o.f(bArr, strG, i12, 1);
        SecretKey secretKeyF2 = yq0.o.f(bArr, strG, i12, 2);
        if (strG.startsWith("DESede")) {
            return new h(secretKeyF, secretKeyF2, i11, z11, 0L);
        }
        if (strG.startsWith("AES")) {
            return new d(secretKeyF, secretKeyF2, i11, z11, 0L);
        }
        throw new IllegalStateException("Unsupported cipher algorithm " + strG);
    }

    private static void g(yq0.c cVar, y yVar, byte[] bArr) {
        try {
            cVar.c(yVar, bArr, true);
        } catch (CardServiceException e11) {
            f60945e.log(Level.WARNING, "Failed to send GENERAL AUTHENTICATE, falling back to command chaining", (Throwable) e11);
            List<byte[]> listL = yq0.o.L(EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, bArr);
            Iterator<byte[]> it = listL.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                i11++;
                cVar.c(yVar, it.next(), i11 >= listL.size());
            }
        }
    }

    public static void h(yq0.c cVar, y yVar, String str, BigInteger bigInteger, PublicKey publicKey) throws CardServiceProtocolException {
        String strH = br0.i.h(str);
        String strG = br0.i.g(str);
        byte[] bArrC = c(strH, publicKey);
        if (strG.startsWith("DESede")) {
            try {
                cVar.a(yVar, ap0.e.i(145, bArrC), bigInteger != null ? ap0.e.i(132, yq0.o.A(bigInteger)) : null);
            } catch (Exception e11) {
                throw new CardServiceProtocolException("Exception during MSE KAT", 1, e11);
            }
        } else {
            if (!strG.startsWith("AES")) {
                throw new IllegalStateException("Cannot set up secure channel with cipher " + strG);
            }
            try {
                cVar.b(yVar, str, bigInteger);
                try {
                    g(cVar, yVar, ap0.e.i(128, bArrC));
                } catch (Exception e12) {
                    throw new CardServiceProtocolException("Exception during General Authenticate", 2, e12);
                }
            } catch (Exception e13) {
                throw new CardServiceProtocolException("Exception during MSE Set AT Int Auth", 1, e13);
            }
        }
    }

    public k b(BigInteger bigInteger, String str, String str2, PublicKey publicKey) throws CardServiceException {
        String strH;
        if (publicKey == null) {
            throw new IllegalArgumentException("PICC public key is null");
        }
        if (str == null) {
            str = e(str2);
        }
        AlgorithmParameterSpec params = null;
        try {
            strH = br0.i.h(str);
        } catch (NumberFormatException e11) {
            f60945e.log(Level.WARNING, "Unknown object identifier " + str, (Throwable) e11);
            strH = null;
        }
        if (!"ECDH".equals(strH) && !"DH".equals(strH)) {
            throw new IllegalArgumentException("Unsupported agreement algorithm, expected ECDH or DH, found " + strH);
        }
        try {
            if ("DH".equals(strH)) {
                params = ((DHPublicKey) publicKey).getParams();
            } else if ("ECDH".equals(strH)) {
                params = ((java.security.interfaces.ECPublicKey) publicKey).getParams();
            }
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(strH, f60946f);
            keyPairGenerator.initialize(params);
            KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
            PublicKey publicKey2 = keyPairGenerateKeyPair.getPublic();
            PrivateKey privateKey = keyPairGenerateKeyPair.getPrivate();
            h(this.f60947a, this.f60948b, str, bigInteger, publicKey2);
            byte[] bArrD = d(strH, publicKey2);
            y yVarF = f(str, a(strH, publicKey, privateKey), this.f60949c, this.f60950d);
            this.f60948b = yVarF;
            return new k(bigInteger, publicKey, bArrD, publicKey2, privateKey, yVarF);
        } catch (GeneralSecurityException e12) {
            throw new CardServiceException("Security exception during Chip Authentication", e12);
        }
    }
}
