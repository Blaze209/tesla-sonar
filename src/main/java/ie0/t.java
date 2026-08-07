package ie0;

import ch.qos.logback.core.joran.action.Action;
import com.tesla.logging.TeslaLog;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lie0/t;", "", "<init>", "()V", "", "algorithm", "", Action.KEY_ATTRIBUTE, "message", "a", "(Ljava/lang/String;[B[B)[B", "b", "([B[B)[B", "utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f77619a = new t();

    private t() {
    }

    private final byte[] a(String algorithm, byte[] key, byte[] message) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance(algorithm);
        p013kotlin.jvm.internal.s.j(mac, "getInstance(...)");
        mac.init(new SecretKeySpec(key, algorithm));
        byte[] bArrDoFinal = mac.doFinal(message);
        p013kotlin.jvm.internal.s.j(bArrDoFinal, "doFinal(...)");
        return bArrDoFinal;
    }

    public final byte[] b(byte[] key, byte[] message) throws Exception {
        p013kotlin.jvm.internal.s.k(key, "key");
        p013kotlin.jvm.internal.s.k(message, "message");
        try {
            return a("HmacSHA256", key, message);
        } catch (Exception e11) {
            TeslaLog.INSTANCE.e("HMAC", "Failed to hmac", e11);
            throw e11;
        }
    }
}
