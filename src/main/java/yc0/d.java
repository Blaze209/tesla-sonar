package yc0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ec0.h0;
import ec0.n;
import ec0.y;
import ezvcard.property.Gender;
import gc0.u;
import j$.time.Instant;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lorg/json/JSONObject;", "Lgc0/u;", "a", "(Lorg/json/JSONObject;)Lgc0/u;", "driveState", "json2proto_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class d {
    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    public static final u a(JSONObject jSONObject) {
        y shift_state;
        Double dC;
        s.k(jSONObject, "<this>");
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("vehicle_state");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("drive_state");
            if (jSONObjectOptJSONObject2 == null) {
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject2 = null;
                } else {
                    if ((jSONObjectOptJSONObject.has("odometer") ? jSONObjectOptJSONObject : null) != null) {
                        jSONObjectOptJSONObject2 = new JSONObject();
                    } else {
                        jSONObjectOptJSONObject2 = null;
                    }
                }
                if (jSONObjectOptJSONObject2 == null) {
                    return null;
                }
            }
            u uVar = new u(0, 0, 0, BitmapDescriptorFactory.HUE_RED, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388607, null);
            i iVar = i.f125368a;
            Integer numG = iVar.g(jSONObjectOptJSONObject2, "power");
            Float fD = iVar.d(jSONObjectOptJSONObject2, "speed");
            Integer odometer_in_hundredths_of_a_mile = (jSONObjectOptJSONObject == null || (dC = iVar.c(jSONObjectOptJSONObject, "odometer")) == null) ? uVar.getOdometer_in_hundredths_of_a_mile() : Integer.valueOf((int) (dC.doubleValue() * ((double) 100)));
            Instant instantE = iVar.e(jSONObjectOptJSONObject2, "timestamp");
            if (instantE == null) {
                instantE = uVar.getTimestamp();
            }
            Instant instant = instantE;
            String strJ = iVar.j(jSONObjectOptJSONObject2, "active_route_destination");
            if (strJ == null) {
                strJ = uVar.getActive_route_destination();
            }
            String str = strJ;
            Float fD2 = iVar.d(jSONObjectOptJSONObject2, "active_route_minutes_to_arrival");
            Float fD3 = iVar.d(jSONObjectOptJSONObject2, "active_route_miles_to_arrival");
            Float fD4 = iVar.d(jSONObjectOptJSONObject2, "active_route_traffic_minutes_delay");
            Float fD5 = iVar.d(jSONObjectOptJSONObject2, "active_route_energy_at_arrival");
            n nVar = new n(iVar.k(jSONObjectOptJSONObject2, "active_route_latitude", BitmapDescriptorFactory.HUE_RED), iVar.k(jSONObjectOptJSONObject2, "active_route_longitude", BitmapDescriptorFactory.HUE_RED), null, 4, null);
            String strJ2 = iVar.j(jSONObjectOptJSONObject2, "shift_state");
            if (strJ2 == null) {
                shift_state = uVar.getShift_state();
            } else {
                int iHashCode = strJ2.hashCode();
                if (iHashCode != -670529065) {
                    if (iHashCode != 68) {
                        if (iHashCode != 78) {
                            if (iHashCode != 80) {
                                if (iHashCode != 82) {
                                    shift_state = (iHashCode == 82246 && strJ2.equals("SNA")) ? new y(null, null, null, null, null, new h0(null, 1, null), null, 95, null) : uVar.getShift_state();
                                } else if (strJ2.equals("R")) {
                                    shift_state = new y(null, null, new h0(null, 1, null), null, null, null, null, 123, null);
                                }
                            } else if (strJ2.equals("P")) {
                                shift_state = new y(null, new h0(null, 1, null), null, null, null, null, null, 125, null);
                            }
                        } else if (strJ2.equals(Gender.NONE)) {
                            shift_state = new y(null, null, null, new h0(null, 1, null), null, null, null, 119, null);
                        }
                    } else if (strJ2.equals("D")) {
                        shift_state = new y(null, null, null, null, new h0(null, 1, null), null, null, 111, null);
                    }
                } else if (strJ2.equals("Invalid")) {
                    shift_state = new y(new h0(null, 1, null), null, null, null, null, null, null, 126, null);
                }
                if (shift_state == null) {
                    shift_state = uVar.getShift_state();
                }
            }
            return new u(0, 0, 0, BitmapDescriptorFactory.HUE_RED, shift_state, instant, null, nVar, null, numG, odometer_in_hundredths_of_a_mile, fD, str, fD2, fD3, fD4, fD5, null, null, null, null, null, null, 8257871, null);
        } catch (Exception e11) {
            i.f125368a.h().f("Drive state parse failure", e11);
            return null;
        }
    }
}
