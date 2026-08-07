package yc0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ec0.h0;
import gc0.q;
import j$.time.Instant;
import kotlinx.coroutines.DebugKt;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lorg/json/JSONObject;", "Lgc0/q;", "b", "(Lorg/json/JSONObject;)Lgc0/q;", "climateState", "json2proto_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {
    private static final q.b a(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 2559) {
            if (iHashCode != 79183) {
                if (iHashCode == 581825855 && str.equals("FanOnly")) {
                    return q.b.CabinOverheatProtectionFanOnly;
                }
            } else if (str.equals("Off")) {
                return q.b.CabinOverheatProtectionOff;
            }
        } else if (str.equals("On")) {
            return q.b.CabinOverheatProtectionOn;
        }
        return q.b.CabinOverheatProtectionOff;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x026e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final q b(JSONObject jSONObject) {
        q.f fVar;
        q.b bVarA;
        q.g defrost_mode;
        q.c climate_keeper_mode;
        q.i hvac_auto_request;
        q.g gVar;
        q.f fVar2;
        s.k(jSONObject, "<this>");
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("climate_state");
            if (jSONObjectOptJSONObject == null) {
                return null;
            }
            q qVar = new q(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, false, false, 0, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, false, false, false, false, false, false, false, 0, 0, false, false, null, false, BitmapDescriptorFactory.HUE_RED, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 67108863, null);
            i iVar = i.f125368a;
            Boolean boolB = iVar.b(jSONObjectOptJSONObject, "allow_cabin_overheat_protection");
            Boolean boolB2 = iVar.b(jSONObjectOptJSONObject, "auto_seat_climate_left");
            Boolean boolB3 = iVar.b(jSONObjectOptJSONObject, "auto_seat_climate_right");
            Boolean boolB4 = iVar.b(jSONObjectOptJSONObject, "battery_heater");
            Boolean boolB5 = iVar.b(jSONObjectOptJSONObject, "battery_heater_no_power");
            Boolean boolB6 = iVar.b(jSONObjectOptJSONObject, "bioweapon_mode");
            Boolean boolB7 = iVar.b(jSONObjectOptJSONObject, "cabin_overheat_protection_actively_cooling");
            String strJ = iVar.j(jSONObjectOptJSONObject, "cop_activation_temperature");
            if (strJ == null) {
                fVar = null;
            } else {
                int iHashCode = strJ.hashCode();
                if (iHashCode != -1994163307) {
                    if (iHashCode != 76596) {
                        if (iHashCode == 2249154 && strJ.equals("High")) {
                            fVar2 = q.f.CopActivationTempHigh;
                            fVar = fVar2;
                        } else {
                            fVar = null;
                        }
                    } else if (strJ.equals("Low")) {
                        fVar2 = q.f.CopActivationTempLow;
                        fVar = fVar2;
                    } else {
                        fVar = null;
                    }
                } else if (strJ.equals("Medium")) {
                    fVar2 = q.f.CopActivationTempMedium;
                    fVar = fVar2;
                } else {
                    fVar = null;
                }
            }
            Float fD = iVar.d(jSONObjectOptJSONObject, "driver_temp_setting");
            Integer numG = iVar.g(jSONObjectOptJSONObject, "fan_status");
            Float fD2 = iVar.d(jSONObjectOptJSONObject, "inside_temp");
            Boolean boolB8 = iVar.b(jSONObjectOptJSONObject, "is_auto_conditioning_on");
            Boolean boolB9 = iVar.b(jSONObjectOptJSONObject, "is_climate_on");
            Boolean boolB10 = iVar.b(jSONObjectOptJSONObject, "is_front_defroster_on");
            Boolean boolB11 = iVar.b(jSONObjectOptJSONObject, "is_preconditioning");
            Boolean boolB12 = iVar.b(jSONObjectOptJSONObject, "is_rear_defroster_on");
            Integer numG2 = iVar.g(jSONObjectOptJSONObject, "left_temp_direction");
            Float fD3 = iVar.d(jSONObjectOptJSONObject, "max_avail_temp");
            Float fD4 = iVar.d(jSONObjectOptJSONObject, "min_avail_temp");
            Float fD5 = iVar.d(jSONObjectOptJSONObject, "outside_temp");
            Float fD6 = iVar.d(jSONObjectOptJSONObject, "passenger_temp_setting");
            Boolean boolB13 = iVar.b(jSONObjectOptJSONObject, "remote_heater_control_enabled");
            Integer numG3 = iVar.g(jSONObjectOptJSONObject, "right_temp_direction");
            Integer numG4 = iVar.g(jSONObjectOptJSONObject, "seat_fan_front_left");
            Integer numG5 = iVar.g(jSONObjectOptJSONObject, "seat_fan_front_right");
            Integer numG6 = iVar.g(jSONObjectOptJSONObject, "seat_heater_left");
            Integer numG7 = iVar.g(jSONObjectOptJSONObject, "seat_heater_rear_center");
            Integer numG8 = iVar.g(jSONObjectOptJSONObject, "seat_heater_rear_left");
            Integer numG9 = iVar.g(jSONObjectOptJSONObject, "seat_heater_rear_left_back");
            Integer numG10 = iVar.g(jSONObjectOptJSONObject, "seat_heater_rear_right");
            Integer numG11 = iVar.g(jSONObjectOptJSONObject, "seat_heater_rear_right_back");
            Integer numG12 = iVar.g(jSONObjectOptJSONObject, "seat_heater_right");
            Integer numG13 = iVar.g(jSONObjectOptJSONObject, "seat_heater_third_row_left");
            Integer numG14 = iVar.g(jSONObjectOptJSONObject, "seat_heater_third_row_right");
            Boolean boolB14 = iVar.b(jSONObjectOptJSONObject, "side_mirror_heaters");
            Boolean boolB15 = iVar.b(jSONObjectOptJSONObject, "steering_wheel_heater");
            Boolean boolB16 = iVar.b(jSONObjectOptJSONObject, "supports_fan_only_cabin_overheat_protection");
            Instant instantE = iVar.e(jSONObjectOptJSONObject, "timestamp");
            if (instantE == null) {
                instantE = qVar.getTimestamp();
            }
            Instant instant = instantE;
            Boolean boolB17 = iVar.b(jSONObjectOptJSONObject, "wiper_blade_heater");
            String strJ2 = iVar.j(jSONObjectOptJSONObject, "cabin_overheat_protection");
            if (strJ2 == null || (bVarA = a(strJ2)) == null) {
                String strJ3 = iVar.j(jSONObjectOptJSONObject, "cabin_overheat_protection_active");
                bVarA = strJ3 != null ? a(strJ3) : qVar.getCabin_overheat_protection();
            }
            q.b bVar = bVarA;
            Integer numG15 = iVar.g(jSONObjectOptJSONObject, "defrost_mode");
            if (numG15 == null) {
                defrost_mode = qVar.getDefrost_mode();
            } else {
                int iIntValue = numG15.intValue();
                if (iIntValue == 0) {
                    gVar = new q.g(new h0(null, 1, null), null, null, null, 14, null);
                } else if (iIntValue != 1) {
                    if (iIntValue != 2) {
                        defrost_mode = qVar.getDefrost_mode();
                    } else {
                        gVar = new q.g(null, null, new h0(null, 1, null), null, 11, null);
                    }
                    if (defrost_mode == null) {
                        defrost_mode = qVar.getDefrost_mode();
                    }
                } else {
                    gVar = new q.g(null, new h0(null, 1, null), null, null, 13, null);
                }
                defrost_mode = gVar;
                if (defrost_mode == null) {
                    defrost_mode = qVar.getDefrost_mode();
                }
            }
            q.g gVar2 = defrost_mode;
            String strJ4 = iVar.j(jSONObjectOptJSONObject, "climate_keeper_mode");
            if (strJ4 != null) {
                switch (strJ4.hashCode()) {
                    case -284840886:
                        climate_keeper_mode = !strJ4.equals("unknown") ? qVar.getClimate_keeper_mode() : new q.c(new h0(null, 1, null), null, null, null, null, null, 62, null);
                        break;
                    case 3551:
                        if (strJ4.equals(DebugKt.DEBUG_PROPERTY_VALUE_ON)) {
                            climate_keeper_mode = new q.c(null, null, new h0(null, 1, null), null, null, null, 59, null);
                        }
                        break;
                    case 99644:
                        if (strJ4.equals("dog")) {
                            climate_keeper_mode = new q.c(null, null, null, new h0(null, 1, null), null, null, 55, null);
                        }
                        break;
                    case 109935:
                        if (strJ4.equals(DebugKt.DEBUG_PROPERTY_VALUE_OFF)) {
                            climate_keeper_mode = new q.c(null, new h0(null, 1, null), null, null, null, null, 61, null);
                        }
                        break;
                    case 3046017:
                        if (strJ4.equals("camp")) {
                            climate_keeper_mode = new q.c(null, null, null, null, new h0(null, 1, null), null, 47, null);
                        }
                        break;
                    default:
                        break;
                }
                if (climate_keeper_mode == null) {
                    climate_keeper_mode = qVar.getClimate_keeper_mode();
                }
            } else {
                climate_keeper_mode = qVar.getClimate_keeper_mode();
            }
            q.c cVar = climate_keeper_mode;
            String strJ5 = iVar.j(jSONObjectOptJSONObject, "hvac_auto_request");
            if (strJ5 == null) {
                hvac_auto_request = qVar.getHvac_auto_request();
            } else {
                hvac_auto_request = s.f(strJ5, "On") ? q.i.HvacAutoRequestOn : s.f(strJ5, "Override") ? q.i.HvacAutoRequestOverride : qVar.getHvac_auto_request();
                if (hvac_auto_request == null) {
                    hvac_auto_request = qVar.getHvac_auto_request();
                }
            }
            return new q(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, false, false, 0, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, false, false, false, false, false, false, false, 0, 0, false, false, null, false, BitmapDescriptorFactory.HUE_RED, null, cVar, instant, gVar2, fD2, fD5, fD, fD6, numG2, numG3, boolB10, boolB12, numG, boolB9, fD4, fD3, numG6, numG12, numG8, numG10, numG7, numG11, numG9, numG14, numG13, boolB4, boolB5, boolB15, boolB17, boolB14, boolB11, boolB13, boolB6, boolB8, boolB2, boolB3, numG4, numG5, null, null, boolB, boolB16, bVar, boolB7, fVar, null, null, hvac_auto_request, null, null, null, -1, 255, 61890560, null);
        } catch (Exception e11) {
            i.f125368a.h().f("Climate state parse failure", e11);
            return null;
        }
    }
}
