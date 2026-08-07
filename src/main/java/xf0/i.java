package xf0;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class i {
    public static Object a(JSONArray jSONArray, int i11) {
        if (jSONArray == null || i11 >= jSONArray.length() || i11 < 0) {
            return null;
        }
        try {
            return jSONArray.get(i11);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public static String b(JSONObject jSONObject, String str) {
        if (!d(jSONObject, str)) {
            return "";
        }
        try {
            return jSONObject.getString(str);
        } catch (Exception unused) {
            j.d("uppay", i.class.toString() + " get " + str + " failed!!");
            return "";
        }
    }

    public static JSONArray c(JSONObject jSONObject, String str) {
        if (!d(jSONObject, str)) {
            return null;
        }
        try {
            return jSONObject.getJSONArray(str);
        } catch (Exception unused) {
            j.d("uppay", i.class.toString() + " get " + str + " failed!!");
            return null;
        }
    }

    private static boolean d(JSONObject jSONObject, String str) {
        return jSONObject != null && jSONObject.has(str);
    }
}
