package vh;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import di.f;
import di.g;
import di.o;
import di.p;
import ezvcard.property.Kind;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f119335a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f119336b = true;

    public static String d(th.b.C2420b c2420b, String str) {
        Map<String, List<String>> map;
        List<String> list;
        if (c2420b == null || str == null || (map = c2420b.f113534a) == null || (list = map.get(str)) == null) {
            return null;
        }
        return TextUtils.join(",", list);
    }

    public static JSONObject g(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", str);
        jSONObject2.put("method", str2);
        jSONObject.put("action", jSONObject2);
        return jSONObject;
    }

    public static boolean l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("data");
            if (!jSONObject.has("params")) {
                return false;
            }
            String strOptString = jSONObject.getJSONObject("params").optString("public_key", null);
            if (!TextUtils.isEmpty(strOptString)) {
                lh.c.d(strOptString);
                return true;
            }
        } catch (JSONException e11) {
            g.d(e11);
        }
        return false;
    }

    public static boolean m(th.b.C2420b c2420b) {
        return Boolean.valueOf(d(c2420b, "msp-gzip")).booleanValue();
    }

    public String a(ai.a aVar) {
        HashMap<String, String> map = new HashMap<>();
        map.put(Kind.DEVICE, Build.MODEL);
        map.put("namespace", "com.alipay.mobilecashier");
        map.put("api_name", "com.alipay.mcpay");
        map.put("api_version", n());
        return c(aVar, map, new HashMap<>());
    }

    public String b(ai.a aVar, String str, JSONObject jSONObject) {
        ai.b bVarD = ai.b.d();
        ci.a aVarB = ci.a.b(bVarD.c());
        JSONObject jSONObjectB = f.b(new JSONObject(), jSONObject);
        try {
            jSONObjectB.put("external_info", str);
            jSONObjectB.put("tid", aVarB.i());
            jSONObjectB.put("user_agent", bVarD.a().a(aVar, aVarB, o()));
            jSONObjectB.put("has_alipay", p.w(aVar, bVarD.c(), fh.a.f65949d, false));
            jSONObjectB.put("has_msp_app", p.a0(bVarD.c()));
            jSONObjectB.put("app_key", "2014052600006128");
            jSONObjectB.put("utdid", bVarD.e());
            jSONObjectB.put("new_client_key", aVarB.h());
            jSONObjectB.put("pa", lh.c.f(bVarD.c()));
        } catch (Throwable th2) {
            hh.a.c(aVar, "biz", "BodyErr", th2);
            g.d(th2);
        }
        return jSONObjectB.toString();
    }

    public String c(ai.a aVar, HashMap<String, String> map, HashMap<String, String> map2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
        }
        if (map2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                jSONObject3.put(entry2.getKey(), entry2.getValue());
            }
            jSONObject2.put("params", jSONObject3);
        }
        jSONObject.put("data", jSONObject2);
        return jSONObject.toString();
    }

    public Map<String, String> e(boolean z11, String str) {
        HashMap map = new HashMap();
        map.put("msp-gzip", String.valueOf(z11));
        map.put("Operation-Type", "alipay.msp.cashier.dispatch.bytes");
        map.put("content-type", "application/octet-stream");
        map.put("Version", "2.0");
        map.put("AppId", "TAOBAO");
        map.put("Msp-Param", a.a(str));
        map.put("des-mode", "CBC");
        return map;
    }

    public abstract JSONObject f();

    public b h(ai.a aVar, Context context) {
        return i(aVar, context, "");
    }

    public b i(ai.a aVar, Context context, String str) {
        return j(aVar, context, str, o.b(context));
    }

    public b j(ai.a aVar, Context context, String str, String str2) {
        return k(aVar, context, str, str2, true);
    }

    public b k(ai.a aVar, Context context, String str, String str2, boolean z11) {
        g.f("mspl", "Packet: " + str2);
        c cVar = new c(this.f119336b);
        b bVar = new b(a(aVar), b(aVar, str, f()));
        Map<String, String> mapE = e(false, str);
        d dVarD = cVar.d(bVar, this.f119335a, mapE.get("iSr"));
        th.b.C2420b c2420bB = th.b.b(context, new th.b.a(str2, e(dVarD.b(), str), dVarD.a()));
        if (c2420bB == null) {
            throw new RuntimeException("Response is null.");
        }
        b bVarC = cVar.c(new d(m(c2420bB), c2420bB.f113536c), mapE.get("iSr"));
        return (bVarC != null && l(bVarC.b()) && z11) ? k(aVar, context, str, str2, false) : bVarC;
    }

    public String n() {
        return "4.9.0";
    }

    public abstract boolean o();
}
