package kd;

import com.adyen.checkout.core.exception.ComponentException;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkd/a;", "", "<init>", "()V", "", "encodedFingerprint", "Lorg/json/JSONObject;", "b", "(Ljava/lang/String;)Lorg/json/JSONObject;", "transactionStatus", "errorDetails", "a", "(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;", "authorisationToken", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {
    public final JSONObject a(String transactionStatus, String errorDetails) {
        s.k(transactionStatus, "transactionStatus");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("threeds2.challengeResult", b.Companion.b(b.INSTANCE, transactionStatus, errorDetails, null, 4, null).getCom.adyen.checkout.components.core.internal.data.model.StatusResponse.PAYLOAD java.lang.String());
            return jSONObject;
        } catch (JSONException e11) {
            throw new ComponentException("Failed to create challenge details", e11);
        }
    }

    public final JSONObject b(String encodedFingerprint) {
        s.k(encodedFingerprint, "encodedFingerprint");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("threeds2.fingerprint", encodedFingerprint);
            return jSONObject;
        } catch (JSONException e11) {
            throw new ComponentException("Failed to create fingerprint details", e11);
        }
    }

    public final JSONObject c(String transactionStatus, String authorisationToken, String errorDetails) {
        s.k(transactionStatus, "transactionStatus");
        s.k(authorisationToken, "authorisationToken");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("threeDSResult", b.INSTANCE.a(transactionStatus, errorDetails, authorisationToken).getCom.adyen.checkout.components.core.internal.data.model.StatusResponse.PAYLOAD java.lang.String());
            return jSONObject;
        } catch (JSONException e11) {
            throw new ComponentException("Failed to create ThreeDS Result details", e11);
        }
    }
}
