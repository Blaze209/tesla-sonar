package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.e.f;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class c {
    public static Map<String, String> a(Context context) {
        wg.b bVarC = wg.b.c(APSecuritySdk.getInstance(context));
        HashMap map = new HashMap();
        f fVarA = com.alipay.apmobilesecuritysdk.e.e.a(context);
        String strB = bVarC.b(context);
        String strY = bVarC.y(context);
        if (fVarA != null) {
            if (sg.a.c(strB)) {
                strB = fVarA.b();
            }
            if (sg.a.c(strY)) {
                strY = fVarA.e();
            }
        }
        String str = strB;
        String str2 = strY;
        com.alipay.apmobilesecuritysdk.e.e.a(context, new f("", str, "", "", str2));
        map.put("AD1", "");
        map.put("AD2", str);
        map.put("AD3", bVarC.m(context));
        map.put("AD5", bVarC.q(context));
        map.put("AD6", bVarC.s(context));
        map.put("AD7", bVarC.u(context));
        map.put("AD9", bVarC.w(context));
        map.put("AD10", str2);
        map.put("AD11", bVarC.h());
        map.put("AD12", bVarC.j());
        map.put("AD13", bVarC.l());
        map.put("AD14", bVarC.p());
        map.put("AD15", bVarC.r());
        map.put("AD16", bVarC.t());
        map.put("AD17", "");
        map.put("AD19", bVarC.A(context));
        map.put("AD20", bVarC.v());
        map.put("AD22", "");
        map.put("AD24", sg.a.k(bVarC.o(context)));
        map.put("AD26", bVarC.k(context));
        map.put("AD27", bVarC.F());
        map.put("AD28", bVarC.J());
        map.put("AD29", bVarC.M());
        map.put("AD30", bVarC.H());
        map.put("AD31", bVarC.L());
        map.put("AD32", bVarC.B());
        map.put("AD33", bVarC.D());
        map.put("AD34", bVarC.I(context));
        map.put("AD35", bVarC.K(context));
        map.put("AD36", bVarC.C(context));
        map.put("AD37", bVarC.z());
        map.put("AD38", bVarC.x());
        map.put("AD39", bVarC.f(context));
        map.put("AD40", bVarC.i(context));
        map.put("AD41", bVarC.a());
        map.put("AD42", bVarC.e());
        return map;
    }
}
