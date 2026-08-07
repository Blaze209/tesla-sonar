package wh;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class c extends vh.e {
    @Override // vh.e
    public String a(ai.a aVar) {
        return c(aVar, new HashMap<>(), new HashMap<>());
    }

    @Override // vh.e
    public String b(ai.a aVar, String str, JSONObject jSONObject) {
        String strB = super.b(aVar, str, jSONObject);
        try {
            String strN = rh.b.m().n();
            hh.a.b(aVar, "biz", "localConfigVersion", strN);
            JSONObject jSONObject2 = new JSONObject(strB);
            jSONObject2.put("h5_local", "true");
            jSONObject2.put("h5_local_version", strN);
            jSONObject2.put("route_pay_from", "h5");
            jSONObject2.put("init_from", "SDKLite");
            jSONObject2.put("cc", "y");
            return jSONObject2.toString();
        } catch (Throwable th2) {
            hh.a.c(aVar, "biz", "buildBody", th2);
            di.g.d(th2);
            return strB;
        }
    }

    @Override // vh.e
    public Map<String, String> e(boolean z11, String str) {
        HashMap map = new HashMap();
        map.put("des-mode", "CBC");
        return map;
    }

    @Override // vh.e
    public JSONObject f() {
        return vh.e.g("cashier", "main");
    }

    @Override // vh.e
    public boolean o() {
        return false;
    }
}
