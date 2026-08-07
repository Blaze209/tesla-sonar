package wh;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class d extends vh.e {
    @Override // vh.e
    public String a(ai.a aVar) {
        HashMap<String, String> map = new HashMap<>();
        map.put("api_name", "/sdk/log");
        map.put("api_version", "1.0.0");
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("log_v", "1.0");
        return c(aVar, map, map2);
    }

    @Override // vh.e
    public Map<String, String> e(boolean z11, String str) {
        HashMap map = new HashMap();
        map.put("msp-gzip", String.valueOf(z11));
        map.put("content-type", "application/octet-stream");
        map.put("des-mode", "CBC");
        return map;
    }

    @Override // vh.e
    public JSONObject f() {
        return null;
    }

    @Override // vh.e
    public vh.b i(ai.a aVar, Context context, String str) {
        return k(aVar, context, str, "https://mcgw.alipay.com/sdklog.do", true);
    }

    @Override // vh.e
    public boolean o() {
        return false;
    }

    @Override // vh.e
    public String b(ai.a aVar, String str, JSONObject jSONObject) {
        return str;
    }
}
