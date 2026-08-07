package com.plaid.internal;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.plaid.internal.z6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4596z6 {
    public static HashMap a(String str) {
        String str2;
        if (str != null && (str2 = (String) AbstractC4555v1.b(str).get("pfcfg")) != null) {
            HashMap map = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(str2, 8)));
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.get(next));
                }
                return map;
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
