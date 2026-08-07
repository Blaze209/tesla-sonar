package com.plaid.internal;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.adyen.checkout.components.core.action.SdkAction;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import ezvcard.property.Kind;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46286a;

    public E0(Context context) {
        this.f46286a = context;
    }

    public final D0 a(D0 d11) throws JSONException {
        String[] strArr;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SdkAction.ACTION_TYPE, 20901);
        jSONObject.put("accept", "json");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put(Kind.DEVICE, jSONObject2);
        jSONObject2.put("os", "and");
        jSONObject2.put("ver", "" + Build.VERSION.SDK_INT);
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (!str2.startsWith(str)) {
            str2 = str + " " + str2;
        }
        jSONObject2.put("model", str2);
        try {
            String networkOperator = ((TelephonyManager) this.f46286a.getSystemService("phone")).getNetworkOperator();
            strArr = !TextUtils.isEmpty(networkOperator) ? new String[]{networkOperator.substring(0, 3), networkOperator.substring(3)} : new String[0];
        } catch (Exception unused) {
        }
        if (strArr.length == 2) {
            jSONObject2.put("mcc", strArr[0]);
            jSONObject2.put("mnc", strArr[1]);
        }
        jSONObject2.put("ip", d11.f46258a);
        if (d11.f46259b != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("msg", C4534s7.a(d11.f46259b.getMessage()));
            Exception exc = d11.f46259b;
            if (exc instanceof r) {
                r rVar = (r) exc;
                EnumC4427g7 enumC4427g7 = rVar.f48075a;
                if (enumC4427g7 != null) {
                    jSONObject3.put("st", enumC4427g7.getCode());
                }
                if (rVar.a() != null) {
                    jSONObject3.put("er", rVar.a().getCode());
                }
            }
            jSONObject.put(AnalyticsAttribute.Error, jSONObject3);
        }
        return new D0(d11.f46258a, d11.f46259b, Base64.encodeToString(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 10));
    }
}
