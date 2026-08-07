package wh;

import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b extends vh.e {
    @Override // vh.e
    public String c(ai.a aVar, HashMap<String, String> map, HashMap<String, String> map2) {
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        map2.putAll(di.a.b(aVar));
        di.g.h("mspl", "cf " + map2);
        return super.c(aVar, map, map2);
    }

    @Override // vh.e
    public JSONObject f() {
        return vh.e.g("sdkConfig", "obtain");
    }

    @Override // vh.e
    public String n() {
        return "5.0.0";
    }

    @Override // vh.e
    public boolean o() {
        return true;
    }
}
