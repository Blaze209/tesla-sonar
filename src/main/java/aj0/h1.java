package aj0;

import org.json.JSONObject;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\" \u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Ld6/j;", "", "a", "(Ld6/j;)Ljava/lang/String;", "getResponseData$annotations", "(Ld6/j;)V", "responseData", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class h1 {
    public static final String a(d6.j jVar) {
        p013kotlin.jvm.internal.s.k(jVar, "<this>");
        if (!(jVar instanceof d6.a0)) {
            return null;
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(((d6.a0) jVar).getCredentialJson()).optJSONObject("data");
            if (jSONObjectOptJSONObject != null) {
                return jSONObjectOptJSONObject.optString("response");
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
