package rb0;

import android.content.Context;
import com.brentvatne.exoplayer.b0;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.tesla.crypto.InvalidVehiclePublicKeyException;
import ie0.q0;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.tesla.logging.g f107502a = com.tesla.logging.g.h("Signing");

    public enum a {
        VCSEC,
        CAR,
        AUTHD
    }

    public static Map<String, Object> a(Context context, String str, String str2, String str3, a aVar) throws InvalidVehiclePublicKeyException {
        HashMap map = new HashMap();
        map.put("success", Boolean.FALSE);
        if (aVar != a.CAR && aVar != a.VCSEC) {
            f107502a.e("Sign message called with invalid domain");
            map.put(AnalyticsAttribute.Error, "Invalid domain");
            return map;
        }
        try {
            e.a aVarG = e.f107486a.g(context, str, str2, str3);
            byte[] bArrB = aVarG.getSignedMessage();
            byte[] bArrA = aVarG.getNonce();
            f107502a.j(String.format("Signed message - message: %s, nonce: %s, additionalData: %s", q0.b(bArrB), q0.b(bArrA), str3));
            byte[] bArr = new byte[16];
            int length = bArrB.length - 16;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArrB, 0, bArr2, 0, length);
            System.arraycopy(bArrB, length, bArr, 0, 16);
            map.put(AnalyticsAttribute.Error, null);
            map.put("success", Boolean.TRUE);
            map.put("signedMessage", bArr2);
            map.put("tag", bArr);
            map.put("nonce", bArrA);
            return map;
        } catch (InvalidVehiclePublicKeyException e11) {
            throw e11;
        } catch (NoSuchAlgorithmException e12) {
            f107502a.f("Failed to get hash of additional data", e12);
            map.put(AnalyticsAttribute.Error, "Failed to get hash of additional data");
            map.put("success", Boolean.FALSE);
            return map;
        } catch (Exception e13) {
            f107502a.j((String) b0.a(e13.getMessage(), "Empty error message"));
            map.put(AnalyticsAttribute.Error, e13.getMessage());
            return map;
        }
    }
}
