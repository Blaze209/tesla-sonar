package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import java.util.HashMap;
import java.util.Map;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes3.dex */
public class d {
    public static synchronized Map<String, String> a(Context context) {
        HashMap map;
        try {
            wg.e eVarB = wg.e.b();
            wg.b bVarC = wg.b.c(APSecuritySdk.getInstance(context));
            map = new HashMap();
            map.put("AE1", eVarB.d());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(eVarB.e() ? "1" : WebrtcBuildVersion.maint_version);
            map.put("AE2", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("");
            sb3.append(eVarB.c(context) ? "1" : WebrtcBuildVersion.maint_version);
            map.put("AE3", sb3.toString());
            map.put("AE4", eVarB.f());
            map.put("AE5", eVarB.g());
            map.put("AE6", eVarB.h());
            map.put("AE7", eVarB.i());
            map.put("AE8", eVarB.j());
            map.put("AE9", eVarB.k());
            map.put("AE10", eVarB.l());
            map.put("AE11", eVarB.m());
            map.put("AE12", eVarB.n());
            map.put("AE13", eVarB.o());
            map.put("AE14", eVarB.p());
            map.put("AE15", eVarB.q());
            map.put("AE21", bVarC.n());
        } catch (Throwable th2) {
            throw th2;
        }
        return map;
    }

    public static synchronized Map<String, String> b(Context context) {
        HashMap map;
        map = new HashMap();
        try {
            map.put("AE16", com.alipay.apmobilesecuritysdk.c.c.a(context).a());
        } catch (Throwable unused) {
        }
        return map;
    }
}
