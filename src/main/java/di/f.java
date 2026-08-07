package di;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class f {
    public static String a(String str) {
        try {
            return JSONObject.quote(str).replace("'", "\\'");
        } catch (Throwable th2) {
            g.f("mspl", "escapeJsonStringError");
            g.d(th2);
            return "";
        }
    }

    public static JSONObject b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        try {
            JSONObject[] jSONObjectArr = {jSONObject, jSONObject2};
            for (int i11 = 0; i11 < 2; i11++) {
                JSONObject jSONObject4 = jSONObjectArr[i11];
                if (jSONObject4 != null) {
                    Iterator<String> itKeys = jSONObject4.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject3.put(next, jSONObject4.get(next));
                    }
                }
            }
            return jSONObject3;
        } catch (JSONException e11) {
            g.d(e11);
            return jSONObject3;
        }
    }

    public static void c(JSONObject jSONObject, String str, Boolean bool) throws JSONException {
        if (jSONObject == null || str == null) {
            return;
        }
        if (bool == null) {
            jSONObject.remove(str);
        } else {
            jSONObject.put(str, bool);
        }
    }

    public static void d(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (jSONObject == null || str == null) {
            return;
        }
        if (str2 == null) {
            jSONObject.remove(str);
        } else {
            jSONObject.put(str, str2);
        }
    }
}
