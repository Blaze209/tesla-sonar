package wh;

import org.json.JSONObject;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes3.dex */
public class g extends vh.e {
    @Override // vh.e
    public String b(ai.a aVar, String str, JSONObject jSONObject) {
        String strB = super.b(aVar, str, jSONObject);
        try {
            JSONObject jSONObject2 = new JSONObject(strB);
            jSONObject2.put("trdfrom", WebrtcBuildVersion.maint_version);
            jSONObject2.put("sourceBundleId", aVar.h().getPackageName());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("invokeFromAppName", aVar.h().getPackageName());
            jSONObject2.put("env", jSONObject3);
            return jSONObject2.toString();
        } catch (Throwable th2) {
            hh.a.c(aVar, "biz", "buildBody", th2);
            di.g.d(th2);
            return strB;
        }
    }

    @Override // vh.e
    public JSONObject f() {
        return vh.e.g("cashier", "sdkPreheat");
    }

    @Override // vh.e
    public boolean o() {
        return false;
    }
}
