package di;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static bh.a a() {
        try {
            try {
                return dh.a.b("NP", System.currentTimeMillis(), new dh.c(ai.b.d().e()), (short) hh.a.d.a(ai.b.d().c()), new dh.f());
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return dh.a.c();
        }
    }

    public static HashMap<String, String> b(ai.a aVar) {
        HashMap<String, String> map = new HashMap<>();
        try {
            bh.a aVarA = a();
            JSONObject jSONObject = new JSONObject();
            Context contextH = aVar != null ? aVar.h() : null;
            if (contextH == null) {
                contextH = ai.b.d().c().getApplicationContext();
            }
            String strL = p.l(aVar, contextH);
            String strC = mg.b.c(aVar, contextH);
            jSONObject.put("ap_q", aVarA != null ? aVarA.a() : "");
            jSONObject.put("ap_link_token", aVar != null ? aVar.f1114d : "");
            jSONObject.put("u_pd", String.valueOf(p.V()));
            jSONObject.put("u_lk", String.valueOf(p.O(p.B())));
            jSONObject.put("u_pi", String.valueOf(aVar != null ? aVar.f1117g : "_"));
            jSONObject.put("u_fu", strL);
            jSONObject.put("u_oi", strC);
            map.put("ap_req", jSONObject.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(aVarA != null ? aVarA.a() : "");
            sb2.append("|");
            sb2.append(strL);
            hh.a.b(aVar, "biz", "ap_q", sb2.toString());
            return map;
        } catch (Exception e11) {
            hh.a.c(aVar, "biz", "APMEx1", e11);
            return map;
        }
    }

    public static JSONObject c(ai.a aVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("ap_resp");
        try {
            if (TextUtils.isEmpty(strOptString)) {
                return null;
            }
            return new JSONObject(strOptString);
        } catch (JSONException e11) {
            hh.a.c(aVar, "biz", "APMEx2", e11);
            return null;
        }
    }

    public static void d(ai.a aVar, HashMap<String, String> map) {
        JSONObject jSONObjectG = lh.b.E().g();
        if (map == null || jSONObjectG == null) {
            return;
        }
        hh.a.b(aVar, "biz", "ap_r", jSONObjectG.optString("ap_r"));
        map.putAll(p.s(jSONObjectG));
    }

    public static void e(ai.a aVar, JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        try {
            jSONObject.putOpt("ap_args", jSONObject2);
        } catch (JSONException e11) {
            hh.a.c(aVar, "biz", "APMEx2", e11);
        }
    }
}
