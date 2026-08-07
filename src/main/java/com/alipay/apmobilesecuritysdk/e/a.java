package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    private static b a(String str) {
        try {
            if (sg.a.c(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new b(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString("timestamp"));
        } catch (Exception e11) {
            com.alipay.apmobilesecuritysdk.c.a.a(e11);
            return null;
        }
    }

    public static synchronized void b(Context context) {
        com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", "deviceid", "");
        com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx", "");
    }

    public static synchronized b c(Context context) {
        String strA;
        try {
            strA = com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", "deviceid");
            if (sg.a.c(strA)) {
                strA = com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return a(strA);
    }

    public static synchronized b d(Context context) {
        String strA = com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", "deviceid");
        if (sg.a.c(strA)) {
            return null;
        }
        return a(strA);
    }

    public static synchronized b e(Context context) {
        String strA = com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx");
        if (sg.a.c(strA)) {
            return null;
        }
        return a(strA);
    }

    public static synchronized void a(Context context) {
    }

    public static synchronized void a(Context context, b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apdid", bVar.f20063a);
            jSONObject.put("deviceInfoHash", bVar.f20064b);
            jSONObject.put("timestamp", bVar.f20065c);
            String string = jSONObject.toString();
            com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", "deviceid", string);
            com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx", string);
        } catch (Exception e11) {
            com.alipay.apmobilesecuritysdk.c.a.a(e11);
        }
    }
}
