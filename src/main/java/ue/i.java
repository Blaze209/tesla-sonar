package ue;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.adyen.checkout.cse.EncryptionException;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\rH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0016H\u0002¢\u0006\u0004\b#\u0010$J\u001d\u0010%\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010(¨\u0006*"}, d2 = {"Lue/i;", "", "<init>", "()V", "", "publicKey", "Ljava/security/PublicKey;", "f", "(Ljava/lang/String;)Ljava/security/PublicKey;", "Ljavax/crypto/SecretKey;", DateTokenConverter.CONVERTER_KEY, "()Ljavax/crypto/SecretKey;", "contentKey", "", "c", "(Ljava/security/PublicKey;Ljavax/crypto/SecretKey;)[B", "Ljavax/crypto/Cipher;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/security/PublicKey;)Ljavax/crypto/Cipher;", StatusResponse.PAYLOAD, "Lue/a;", "encryptedKey", "Lue/j;", "b", "(Ljava/lang/String;Ljavax/crypto/SecretKey;Lue/a;)Lue/j;", "encodedHeader", "h", "(Lue/a;)[B", "e", "()[B", "secretKey", "iv", "g", "(Ljavax/crypto/SecretKey;[B)Ljavax/crypto/Cipher;", "jweObject", "j", "(Lue/j;)Ljava/lang/String;", "a", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ljava/security/KeyFactory;", "Ljava/security/KeyFactory;", "keyFactory", "cse_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final JSONObject f116167c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final KeyFactory keyFactory;

    static {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", "RSA-OAEP-256");
        jSONObject.put("enc", "A256GCM");
        jSONObject.put("version", "1");
        f116167c = jSONObject;
    }

    public i() {
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            s.h(keyFactory);
            this.keyFactory = keyFactory;
        } catch (NoSuchAlgorithmException e11) {
            throw new EncryptionException("RSA KeyFactory not found", e11);
        }
    }

    private final JWEObject b(String payload, SecretKey contentKey, a encryptedKey) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, InvalidAlgorithmParameterException {
        String string = f116167c.toString();
        s.j(string, "toString(...)");
        a aVar = new a(t.J(string));
        byte[] bArrH = h(aVar);
        byte[] bArrE = e();
        Cipher cipherG = g(contentKey, bArrE);
        cipherG.updateAAD(bArrH);
        byte[] bytes = payload.getBytes(p013kotlin.text.d.UTF_8);
        s.j(bytes, "getBytes(...)");
        byte[] bArrDoFinal = cipherG.doFinal(bytes);
        int length = bArrDoFinal.length - 16;
        a aVar2 = new a(bArrE);
        s.h(bArrDoFinal);
        return new JWEObject(aVar, encryptedKey, aVar2, new a(n.u(bArrDoFinal, 0, length)), new a(n.u(bArrDoFinal, length, bArrDoFinal.length)));
    }

    private final byte[] c(PublicKey publicKey, SecretKey contentKey) throws BadPaddingException, NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            byte[] bArrDoFinal = i(publicKey).doFinal(contentKey.getEncoded());
            s.h(bArrDoFinal);
            return bArrDoFinal;
        } catch (IllegalBlockSizeException e11) {
            throw new EncryptionException("The RSA key is invalid", e11);
        }
    }

    private final SecretKey d() {
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        return new SecretKeySpec(bArr, "AES");
    }

    private final byte[] e() {
        byte[] bArr = new byte[12];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    private final PublicKey f(String publicKey) {
        List listF1 = t.f1(publicKey, new String[]{"|"}, false, 0, 6, null);
        try {
            PublicKey publicKeyGeneratePublic = this.keyFactory.generatePublic(new RSAPublicKeySpec(new BigInteger((String) listF1.get(1), 16), new BigInteger((String) listF1.get(0), 16)));
            s.h(publicKeyGeneratePublic);
            return publicKeyGeneratePublic;
        } catch (InvalidKeySpecException e11) {
            throw new EncryptionException("Problem reading public key", e11);
        }
    }

    private final Cipher g(SecretKey secretKey, byte[] iv2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getEncoded(), "AES");
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, iv2);
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKeySpec, gCMParameterSpec);
            s.h(cipher);
            return cipher;
        } catch (NoSuchAlgorithmException e11) {
            throw new EncryptionException("Problem instantiating AES/GCM/NoPadding Algorithm", e11);
        } catch (NoSuchPaddingException e12) {
            throw new EncryptionException("Problem instantiating AES/GCM/NoPadding Padding", e12);
        }
    }

    private final byte[] h(a encodedHeader) {
        byte[] bytes = encodedHeader.getValue().getBytes(p013kotlin.text.d.US_ASCII);
        s.j(bytes, "getBytes(...)");
        return bytes;
    }

    private final Cipher i(PublicKey publicKey) throws NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("OAEP");
        MGF1ParameterSpec mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        algorithmParameters.init(new OAEPParameterSpec(mGF1ParameterSpec.getDigestAlgorithm(), "MGF1", mGF1ParameterSpec, PSource.PSpecified.DEFAULT));
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
            cipher.init(1, publicKey, algorithmParameters);
            s.h(cipher);
            return cipher;
        } catch (NoSuchAlgorithmException e11) {
            throw new EncryptionException("Problem instantiating RSA/ECB/OAEPWithSHA-256AndMGF1Padding Algorithm", e11);
        } catch (NoSuchPaddingException e12) {
            throw new EncryptionException("Problem instantiating RSA/ECB/OAEPWithSHA-256AndMGF1Padding Padding", e12);
        }
    }

    private final String j(JWEObject jweObject) {
        String str = jweObject.getHeader() + "." + jweObject.getEncryptedKey() + "." + jweObject.getInitializationVector() + "." + jweObject.getCipherText() + "." + jweObject.getAuthTag();
        s.j(str, "toString(...)");
        return str;
    }

    public final String a(String publicKey, String payload) {
        s.k(publicKey, "publicKey");
        s.k(payload, "payload");
        if (!k.a(publicKey)) {
            throw new EncryptionException("Invalid public key", null);
        }
        PublicKey publicKeyF = f(publicKey);
        SecretKey secretKeyD = d();
        return j(b(payload, secretKeyD, new a(c(publicKeyF, secretKeyD))));
    }
}
