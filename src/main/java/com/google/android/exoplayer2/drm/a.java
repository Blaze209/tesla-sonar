package com.google.android.exoplayer2.drm;

import ch.qos.logback.core.CoreConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ts.p0;
import ts.u;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class a {
    public static byte[] a(byte[] bArr) {
        return p0.f115040a >= 27 ? bArr : p0.l0(c(p0.C(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (p0.f115040a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(p0.C(bArr));
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
            return p0.l0(sb2.toString());
        } catch (JSONException e11) {
            u.d("ClearKeyUtil", "Failed to adjust response data: " + p0.C(bArr), e11);
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
