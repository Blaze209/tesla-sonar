package wh;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class e extends vh.e {
    @Override // vh.e
    public Map<String, String> e(boolean z11, String str) {
        return new HashMap();
    }

    @Override // vh.e
    public JSONObject f() {
        return null;
    }

    @Override // vh.e
    public vh.b i(ai.a aVar, Context context, String str) throws Throwable {
        di.g.h("mspl", "mdap post");
        byte[] bArrA = nh.b.a(str.getBytes(Charset.forName("UTF-8")));
        HashMap map = new HashMap();
        map.put("utdId", ai.b.d().e());
        map.put("logHeader", "RAW");
        map.put("bizCode", "alipaysdk");
        map.put("productId", "alipaysdk_android");
        map.put("Content-Encoding", "Gzip");
        map.put("productVersion", "15.8.42");
        th.b.C2420b c2420bB = th.b.b(context, new th.b.a("https://loggw-exsdk.alipay.com/loggw/logUpload.do", map, bArrA));
        di.g.h("mspl", "mdap got " + c2420bB);
        if (c2420bB == null) {
            throw new RuntimeException("Response is null");
        }
        boolean zM = vh.e.m(c2420bB);
        try {
            byte[] bArrB = c2420bB.f113536c;
            if (zM) {
                bArrB = nh.b.b(bArrB);
            }
            return new vh.b("", new String(bArrB, Charset.forName("UTF-8")));
        } catch (Exception e11) {
            di.g.d(e11);
            return null;
        }
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
