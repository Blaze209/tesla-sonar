package androidx.media3.exoplayer.drm;

import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s7.q0;
import s7.t;

/* JADX INFO: loaded from: classes.dex */
final class a {
    public static byte[] a(byte[] bArr) {
        return Build.VERSION.SDK_INT >= 27 ? bArr : q0.E0(c(q0.K(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (Build.VERSION.SDK_INT >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(q0.K(bArr));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                if (i11 != 0) {
                    sb2.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                sb2.append("{\"k\":\"");
                sb2.append(d(jSONObject2.getString("k")));
                sb2.append("\",\"kid\":\"");
                sb2.append(d(jSONObject2.getString("kid")));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return q0.E0(sb2.toString());
        } catch (JSONException e11) {
            t.e("ClearKeyUtil", "Failed to adjust response data: " + q0.K(bArr), e11);
            return bArr;
        }
    }

    private static String c(String str) {
        return str.replace('+', CoreConstants.DASH_CHAR).replace('/', '_');
    }

    private static String d(String str) {
        return str.replace(CoreConstants.DASH_CHAR, '+').replace('_', '/');
    }
}
