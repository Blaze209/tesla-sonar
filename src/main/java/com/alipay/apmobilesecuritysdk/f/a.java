package com.alipay.apmobilesecuritysdk.f;

import android.content.Context;
import java.util.HashMap;
import org.json.JSONObject;
import yg.e;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static String a(Context context, String str, String str2) {
        if (context != null && !sg.a.c(str) && !sg.a.c(str2)) {
            try {
                String strC = e.c(context, str, str2, "");
                if (sg.a.c(strC)) {
                    return null;
                }
                return ug.c.g(ug.c.a(), strC);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static String a(String str, String str2) {
        synchronized (a.class) {
            if (!sg.a.c(str) && !sg.a.c(str2)) {
                try {
                    String strA = yg.b.a(str);
                    if (!sg.a.c(strA)) {
                        String string = new JSONObject(strA).getString(str2);
                        if (!sg.a.c(string)) {
                            return ug.c.g(ug.c.a(), string);
                        }
                    }
                } catch (Throwable unused) {
                    return null;
                }
            }
            return null;
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        if (sg.a.c(str) || sg.a.c(str2) || context == null) {
            return;
        }
        try {
            String strB = ug.c.b(ug.c.a(), str3);
            HashMap map = new HashMap();
            map.put(str2, strB);
            e.b(context, str, map);
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, String str2, String str3) {
        synchronized (a.class) {
            try {
                if (sg.a.c(str) || sg.a.c(str2)) {
                    return;
                }
                try {
                    String strA = yg.b.a(str);
                    JSONObject jSONObject = new JSONObject();
                    if (sg.a.f(strA)) {
                        try {
                            jSONObject = new JSONObject(strA);
                        } catch (Exception unused) {
                            jSONObject = new JSONObject();
                        }
                    }
                    jSONObject.put(str2, ug.c.b(ug.c.a(), str3));
                    yg.b.b(str, jSONObject.toString());
                } catch (Throwable unused2) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
