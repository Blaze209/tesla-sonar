package com.plaid.internal;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class H {
    public static String a(r rVar, C4500p c4500p) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (InterfaceC4526s interfaceC4526s : c4500p.f48002c) {
                jSONArray.put(new JSONObject().put("u", C4534s7.a(interfaceC4526s.b())).put("s", interfaceC4526s.a()));
            }
            String str = c4500p.f48004e;
            if (str != null) {
                jSONObject.put("cid", C4534s7.a(str));
            }
            EnumC4427g7 enumC4427g7 = rVar.f48075a;
            if (enumC4427g7 != null) {
                jSONObject.put("st", enumC4427g7.getCode());
            }
            if (rVar.a() != null) {
                jSONObject.put("er", rVar.a().getCode());
            }
            jSONObject.put("os", "and").put("v", 20901).put("fl", c4500p.f48003d).put("rq", jSONArray);
        } catch (JSONException unused) {
        }
        return Base64.encodeToString(("client-error:" + jSONObject).getBytes(StandardCharsets.UTF_8), 10);
    }
}
