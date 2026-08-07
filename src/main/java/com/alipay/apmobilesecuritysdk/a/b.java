package com.alipay.apmobilesecuritysdk.a;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.d.e;
import com.alipay.apmobilesecuritysdk.e.c;
import com.alipay.apmobilesecuritysdk.e.h;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import eh.d;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class b {
    public static d a(Context context, Map<String, String> map) {
        d dVar = new d();
        a(context, dVar, map);
        dVar.f62954f = e.a(context, map);
        return dVar;
    }

    private static void a(Context context, d dVar, Map<String, String> map) {
        String str;
        String str2;
        String str3;
        com.alipay.apmobilesecuritysdk.e.b bVarE;
        com.alipay.apmobilesecuritysdk.e.b bVarD;
        String str4 = "";
        String strB = sg.a.b(map, "appName", "");
        String strB2 = sg.a.b(map, "sessionId", "");
        String strB3 = sg.a.b(map, "rpcVersion", "");
        String strA = a.a(context, strB);
        String securityToken = UmidSdkWrapper.getSecurityToken(context);
        String strD = h.d(context);
        if (sg.a.f(strB2)) {
            dVar.f62951c = strB2;
        } else {
            dVar.f62951c = strA;
        }
        dVar.f62952d = securityToken;
        dVar.f62953e = strD;
        dVar.f62949a = "android";
        c cVarD = com.alipay.apmobilesecuritysdk.e.d.d(context);
        if (cVarD != null) {
            str2 = cVarD.f20066a;
            str = cVarD.f20068c;
        } else {
            str = "";
            str2 = str;
        }
        if (sg.a.c(str2) && (bVarD = com.alipay.apmobilesecuritysdk.e.a.d(context)) != null) {
            str2 = bVarD.f20063a;
            str = bVarD.f20065c;
        }
        c cVarE = com.alipay.apmobilesecuritysdk.e.d.e(context);
        if (cVarE != null) {
            str4 = cVarE.f20066a;
            str3 = cVarE.f20068c;
        } else {
            str3 = "";
        }
        if (sg.a.c(str4) && (bVarE = com.alipay.apmobilesecuritysdk.e.a.e(context)) != null) {
            str4 = bVarE.f20063a;
            str3 = bVarE.f20065c;
        }
        dVar.f62956h = str2;
        dVar.f62955g = str4;
        dVar.f62958j = strB3;
        if (sg.a.c(str2)) {
            dVar.f62950b = str4;
            dVar.f62957i = str3;
        } else {
            dVar.f62950b = str2;
            dVar.f62957i = str;
        }
    }
}
