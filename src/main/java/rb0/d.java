package rb0;

import ch.qos.logback.core.joran.action.Action;
import ie0.t;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015¨\u0006\u0017"}, d2 = {"Lrb0/d;", "", "<init>", "()V", "", Action.KEY_ATTRIBUTE, "cipherText", "authenticationData", "a", "([B[B[B)[B", "wrappedKey", "", "appName", "sharedSecret", "c", "([BLjava/lang/String;[B)[B", "", "wrappedKeys", "b", "([BLjava/util/List;Ljava/lang/String;[B)[B", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "crypto_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f107484a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("ECIES");

    private d() {
    }

    private final byte[] a(byte[] key, byte[] cipherText, byte[] authenticationData) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        byte[] bArrU = n.u(cipherText, 0, 12);
        byte[] bArrU2 = n.u(cipherText, 12, cipherText.length - 16);
        byte[] bArrU3 = n.u(cipherText, cipherText.length - 16, cipherText.length);
        cipher.init(2, new SecretKeySpec(key, "AES"), new GCMParameterSpec(128, bArrU));
        if (authenticationData != null) {
            cipher.updateAAD(authenticationData);
        }
        byte[] bArrDoFinal = cipher.doFinal(n.G(bArrU2, bArrU3));
        s.j(bArrDoFinal, "doFinal(...)");
        return bArrDoFinal;
    }

    public final byte[] b(byte[] cipherText, List<byte[]> wrappedKeys, String appName, byte[] sharedSecret) {
        s.k(cipherText, "cipherText");
        s.k(wrappedKeys, "wrappedKeys");
        s.k(appName, "appName");
        s.k(sharedSecret, "sharedSecret");
        Iterator<byte[]> it = wrappedKeys.iterator();
        while (it.hasNext()) {
            try {
                return a(c(it.next(), appName, sharedSecret), cipherText, null);
            } catch (Exception e11) {
                logger.j("Failed to decrypt: " + e11);
            }
        }
        return null;
    }

    public final byte[] c(byte[] wrappedKey, String appName, byte[] sharedSecret) {
        s.k(wrappedKey, "wrappedKey");
        s.k(appName, "appName");
        s.k(sharedSecret, "sharedSecret");
        t tVar = t.f77619a;
        Charset charset = p013kotlin.text.d.UTF_8;
        byte[] bytes = "encrypted vehicle message".getBytes(charset);
        s.j(bytes, "getBytes(...)");
        byte[] bArrU = n.u(tVar.b(sharedSecret, bytes), 0, 16);
        byte[] bytes2 = appName.getBytes(charset);
        s.j(bytes2, "getBytes(...)");
        return a(bArrU, wrappedKey, bytes2);
    }
}
