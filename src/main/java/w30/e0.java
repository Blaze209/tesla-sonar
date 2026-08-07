package w30;

import com.stripe.android.core.exception.APIException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lw30/l0;", "", "Lorg/json/JSONObject;", "a", "(Lw30/l0;)Lorg/json/JSONObject;", "stripe-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class e0 {
    public static final JSONObject a(l0<String> l0Var) throws APIException {
        p013kotlin.jvm.internal.s.k(l0Var, "<this>");
        String strA = l0Var.a();
        if (strA == null) {
            return new JSONObject();
        }
        try {
            return new JSONObject(strA);
        } catch (JSONException e11) {
            int code = l0Var.getCode();
            d0 requestId = l0Var.getRequestId();
            List<String> listC = l0Var.c("Content-Type");
            throw new APIException(null, null, 0, p013kotlin.text.t.n("\n                    Exception while parsing response body.\n                      Status code: " + code + "\n                      Request-Id: " + requestId + "\n                      Content-Type: " + (listC != null ? (String) p013kotlin.collections.v.q0(listC) : null) + "\n                      Body: \"" + strA + "\"\n                "), e11, 7, null);
        }
    }
}
