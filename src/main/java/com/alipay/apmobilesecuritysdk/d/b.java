package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.e.h;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class b {
    public static synchronized Map<String, String> a(Context context, Map<String, String> map) {
        HashMap map2;
        map2 = new HashMap();
        String strB = sg.a.b(map, "tid", "");
        String strB2 = sg.a.b(map, "utdid", "");
        String strB3 = sg.a.b(map, "userId", "");
        String strB4 = sg.a.b(map, "appName", "");
        String strB5 = sg.a.b(map, "appKeyClient", "");
        String strB6 = sg.a.b(map, "tmxSessionId", "");
        String strF = h.f(context);
        String strB7 = sg.a.b(map, "sessionId", "");
        map2.put("AC1", strB);
        map2.put("AC2", strB2);
        map2.put("AC3", "");
        map2.put("AC4", strF);
        map2.put("AC5", strB3);
        map2.put("AC6", strB6);
        map2.put("AC7", com.alipay.apmobilesecuritysdk.c.b.a(context));
        map2.put("AC8", strB4);
        map2.put("AC9", strB5);
        if (sg.a.f(strB7)) {
            map2.put("AC10", strB7);
        }
        return map2;
    }
}
