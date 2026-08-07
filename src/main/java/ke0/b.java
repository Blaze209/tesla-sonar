package ke0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import fc0.u5;
import gc0.u0;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u0004*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u0004\u0018\u00010\u0004*\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u0004\u0018\u00010\u0004*\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019¨\u0006\u001a"}, d2 = {"Lke0/b;", "", "<init>", "()V", "Lfc0/u5;", "", "vin", "a", "(Lfc0/u5;Ljava/lang/String;)Lfc0/u5;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "b", "(Landroid/content/Context;)V", "Lorg/json/JSONObject;", "Lke0/i;", "origin", "e", "(Lorg/json/JSONObject;Lke0/i;)Lfc0/u5;", DateTokenConverter.CONVERTER_KEY, "(Lorg/json/JSONObject;Ljava/lang/String;Lke0/i;)Lfc0/u5;", "c", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "log", "Landroid/content/Context;", "vehicledata_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"StaticFieldLeak"})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f85979a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g log = com.tesla.logging.g.INSTANCE.a("VehicleDataConverter");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static Context context;

    private b() {
    }

    private final u5 a(u5 u5Var, String str) {
        u0 u0VarB;
        String vin;
        u0 vehicle_config = u5Var.getVehicle_config();
        String str2 = null;
        if (vehicle_config != null && (vin = vehicle_config.getVin()) != null && vin.length() > 0) {
            str2 = vin;
        }
        if (str2 != null && s.f(str2, str)) {
            return u5Var;
        }
        u0 vehicle_config2 = u5Var.getVehicle_config();
        return u5.b(u5Var, null, null, null, null, null, (vehicle_config2 == null || (u0VarB = u0.b(vehicle_config2, false, false, false, false, false, false, false, false, false, false, false, 0, false, false, false, false, false, false, false, false, false, 0, false, false, 0, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -134217729, -1, 1, null)) == null) ? new u0(false, false, false, false, false, false, false, false, false, false, false, 0, false, false, false, false, false, false, false, false, false, 0, false, false, 0, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -134217729, -1, 1, null) : u0VarB, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, false, null, 2147483615, null);
    }

    public final void b(Context context2) {
        s.k(context2, "context");
        context = context2.getApplicationContext();
    }

    public final u5 c(JSONObject jSONObject, String vin, i origin) {
        u5 u5VarB;
        s.k(jSONObject, "<this>");
        s.k(vin, "vin");
        s.k(origin, "origin");
        try {
            byte[] bArrDecode = Base64.decode(jSONObject.optString("cached_data"), 0);
            if (bArrDecode != null) {
                if (bArrDecode.length == 0) {
                    bArrDecode = null;
                }
                if (bArrDecode != null && (u5VarB = h.b(bArrDecode, vin, origin)) != null) {
                    String strOptString = jSONObject.optString("vin");
                    s.j(strOptString, "optString(...)");
                    return a(u5VarB, strOptString);
                }
            }
            return null;
        } catch (Exception e11) {
            log.f("error when parsing cached vehicle data from owner api response", e11);
            return null;
        }
    }

    public final u5 d(JSONObject jSONObject, String vin, i origin) {
        s.k(jSONObject, "<this>");
        s.k(vin, "vin");
        s.k(origin, "origin");
        try {
            byte[] bArrDecode = Base64.decode(jSONObject.optString("vehicle_data"), 0);
            s.h(bArrDecode);
            return h.b(bArrDecode, vin, origin);
        } catch (Exception e11) {
            com.tesla.logging.g gVar = log;
            gVar.f("error when parsing vehicle data from owner api response", e11);
            gVar.a("Used converted protos");
            return yc0.i.f125368a.a(jSONObject);
        }
    }

    public final u5 e(JSONObject jSONObject, i origin) {
        String strOptString;
        String strOptString2;
        s.k(jSONObject, "<this>");
        s.k(origin, "origin");
        try {
            strOptString = jSONObject.optString("vin");
            try {
                strOptString2 = jSONObject.optString("proto_vehicle_data_raw");
                try {
                    if (h.f()) {
                        f.f85990a.b().j("DECODE VEHICLE DATA: " + origin + " " + strOptString + " => proto_vehicle_data_raw:" + strOptString2 + " json:" + jSONObject.toString(2));
                    }
                    if (strOptString2 != null && !t.y0(strOptString2)) {
                        byte[] bArrDecode = Base64.decode(strOptString2, 0);
                        s.h(bArrDecode);
                        s.h(strOptString);
                        u5 u5VarB = h.b(bArrDecode, strOptString, origin);
                        s.h(strOptString);
                        return a(u5VarB, strOptString);
                    }
                    return null;
                } catch (Exception e11) {
                    e = e11;
                    log.f("error when parsing vehicle data for " + strOptString + " " + origin + " from proto_vehicle_data_raw: '" + strOptString2 + "'", e);
                    return null;
                }
            } catch (Exception e12) {
                e = e12;
                strOptString2 = null;
            }
        } catch (Exception e13) {
            e = e13;
            strOptString = null;
            strOptString2 = null;
        }
    }
}
