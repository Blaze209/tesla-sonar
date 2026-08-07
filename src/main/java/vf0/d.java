package vf0;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.unionpay.utils.UPUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes8.dex */
final class d implements Handler.Callback {
    d() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i11;
        int i12 = message.what;
        String str = WebrtcBuildVersion.maint_version;
        switch (i12) {
            case 1001:
                a.C();
                a.j(a.J(), a.V, a.M);
                return true;
            case 1002:
                try {
                    if (message.obj != null) {
                        JSONObject jSONObject = new JSONObject((String) message.obj);
                        String strB = xf0.i.b(jSONObject, "sign");
                        try {
                            i11 = Integer.parseInt(a.L);
                        } catch (Exception unused) {
                            i11 = 0;
                        }
                        String str2 = new String(Base64.decode(jSONObject.getString("configs"), 2));
                        String str3 = "";
                        String str4 = jSONObject.has("sePayConf") ? new String(Base64.decode(jSONObject.getString("sePayConf"), 2)) : "";
                        if (!TextUtils.isEmpty(str4)) {
                            str3 = str4;
                        }
                        String strM = xf0.b.m(UPUtils.d(str2 + str3 + a.I));
                        String strB2 = UPUtils.b(i11, strB);
                        if (!TextUtils.isEmpty(strB2) && strB2.equals(strM)) {
                            UPUtils.g(a.J(), (String) message.obj, "configs" + a.D);
                            UPUtils.g(a.J(), a.L, "mode" + a.D);
                            UPUtils.g(a.J(), a.I, "or" + a.D);
                            if (!TextUtils.isEmpty(a.B)) {
                                UPUtils.g(a.J(), str3, "se_configs" + a.B);
                            }
                            if (!a.N) {
                                JSONArray unused2 = a.V = a.p(new JSONArray(str2), "sort");
                                a.w(str3);
                            }
                        }
                    }
                    break;
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (!a.N) {
                    a.j(a.J(), a.V, a.M);
                }
                return true;
            case 1003:
                a.Q.removeMessages(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
                try {
                    Object obj = message.obj;
                    if ((obj instanceof Integer) && ((Integer) obj).intValue() == 1) {
                        str = "1";
                    }
                } catch (Exception unused3) {
                }
                if (!a.O) {
                    a.t(str);
                }
                return true;
            case GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION /* 1004 */:
                xf0.j.d("uppay", "QUERY_CAPACITY_TIME_OUT");
                a.F();
                a.t(str);
                return true;
            default:
                return true;
        }
    }
}
