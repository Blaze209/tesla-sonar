package yc0;

import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ec0.h0;
import gc0.e0;
import j$.time.Instant;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lorg/json/JSONObject;", "Lgc0/e0;", "a", "(Lorg/json/JSONObject;)Lgc0/e0;", "locationState", "json2proto_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class f {
    public static final e0 a(JSONObject jSONObject) {
        e0.c cVar;
        e0.c cVar2;
        s.k(jSONObject, "<this>");
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("drive_state");
            if (jSONObjectOptJSONObject == null) {
                return null;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("vehicle_state");
            e0 e0Var = new e0(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0L, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 15, null);
            i iVar = i.f125368a;
            Float fD = iVar.d(jSONObjectOptJSONObject, "corrected_latitude");
            Float fD2 = iVar.d(jSONObjectOptJSONObject, "corrected_longitude");
            long jOptLong = jSONObjectOptJSONObject.optLong("gps_as_of");
            Integer numG = iVar.g(jSONObjectOptJSONObject, "heading");
            Float fD3 = iVar.d(jSONObjectOptJSONObject, OrcaKeys.LATITUDE);
            Float fD4 = iVar.d(jSONObjectOptJSONObject, OrcaKeys.LONGITUDE);
            Float fD5 = iVar.d(jSONObjectOptJSONObject, "native_latitude");
            Boolean boolB = iVar.b(jSONObjectOptJSONObject, "native_location_supported");
            Float fD6 = iVar.d(jSONObjectOptJSONObject, "native_longitude");
            Instant instantE = iVar.e(jSONObjectOptJSONObject, "timestamp");
            if (instantE == null) {
                instantE = e0Var.getTimestamp();
            }
            Instant instant = instantE;
            String strJ = iVar.j(jSONObjectOptJSONObject, "native_type");
            if (strJ != null) {
                if (s.f(strJ, "gcj")) {
                    cVar2 = new e0.c(new h0(null, 1, null), null, null, 6, null);
                } else {
                    cVar2 = s.f(strJ, "wgs") ? new e0.c(null, new h0(null, 1, null), null, 5, null) : e0Var.getNative_type();
                }
                if (cVar2 == null) {
                    cVar2 = e0Var.getNative_type();
                }
                cVar = cVar2;
            } else {
                cVar = null;
            }
            return new e0(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0L, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false, cVar, instant, fD3, fD4, numG, Long.valueOf(jOptLong), boolB, fD5, fD6, fD, fD2, jSONObjectOptJSONObject2 != null ? iVar.b(jSONObjectOptJSONObject2, "homelink_nearby") : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4193281, 15, null);
        } catch (Exception e11) {
            i.f125368a.h().f("Location state parse failure", e11);
            return null;
        }
    }
}
