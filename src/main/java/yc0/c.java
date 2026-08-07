package yc0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ec0.h0;
import gc0.p0;
import gc0.r;
import j$.time.Instant;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lorg/json/JSONObject;", "Lgc0/r;", "a", "(Lorg/json/JSONObject;)Lgc0/r;", "closureState", "json2proto_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final r a(JSONObject jSONObject) {
        r.e sun_roof_state;
        r.c center_display_state;
        r.d dVar;
        r.d dVar2;
        r.c cVar;
        s.k(jSONObject, "<this>");
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("vehicle_state");
            if (jSONObjectOptJSONObject == null) {
                return null;
            }
            r rVar = new r(false, false, false, false, false, false, false, false, false, false, 0, false, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 32767, null);
            i iVar = i.f125368a;
            Boolean boolB = iVar.b(jSONObjectOptJSONObject, "locked");
            Boolean boolB2 = iVar.b(jSONObjectOptJSONObject, "df");
            Boolean boolB3 = iVar.b(jSONObjectOptJSONObject, "dr");
            Boolean boolB4 = iVar.b(jSONObjectOptJSONObject, "pf");
            Boolean boolB5 = iVar.b(jSONObjectOptJSONObject, "pr");
            Boolean boolB6 = iVar.b(jSONObjectOptJSONObject, "ft");
            Boolean boolB7 = iVar.b(jSONObjectOptJSONObject, "rt");
            Boolean boolB8 = iVar.b(jSONObjectOptJSONObject, "fd_window");
            Boolean boolB9 = iVar.b(jSONObjectOptJSONObject, "fp_window");
            Boolean boolB10 = iVar.b(jSONObjectOptJSONObject, "rd_window");
            Boolean boolB11 = iVar.b(jSONObjectOptJSONObject, "rp_window");
            Boolean boolB12 = iVar.b(jSONObjectOptJSONObject, "is_user_present");
            Boolean boolB13 = iVar.b(jSONObjectOptJSONObject, "remote_start");
            Instant instantE = iVar.e(jSONObjectOptJSONObject, "timestamp");
            if (instantE == null) {
                instantE = rVar.getTimestamp();
            }
            Instant instant = instantE;
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("speed_limit_mode");
            p0 p0Var = jSONObjectOptJSONObject2 != null ? new p0(false, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, iVar.b(jSONObjectOptJSONObject2, "active"), iVar.b(jSONObjectOptJSONObject2, "pin_code_set"), iVar.d(jSONObjectOptJSONObject2, "max_limit_mph"), iVar.d(jSONObjectOptJSONObject2, "min_limit_mph"), iVar.d(jSONObjectOptJSONObject2, "current_limit_mph"), null, 1055, null) : rVar.getSpeed_limit_mode();
            Integer numG = iVar.g(jSONObjectOptJSONObject, "sun_roof_percent_open");
            Boolean boolB14 = iVar.b(jSONObjectOptJSONObject, "valet_mode");
            Boolean boolB15 = iVar.b(jSONObjectOptJSONObject, "valet_pin_needed");
            String strJ = iVar.j(jSONObjectOptJSONObject, "sun_roof_state");
            if (strJ != null) {
                switch (strJ.hashCode()) {
                    case -1357520532:
                        sun_roof_state = !strJ.equals("closed") ? rVar.getSun_roof_state() : new r.e(null, null, new h0(null, 1, null), null, null, null, null, 123, null);
                        break;
                    case -1068259250:
                        if (strJ.equals("moving")) {
                            sun_roof_state = new r.e(null, null, null, null, new h0(null, 1, null), null, null, 111, null);
                        }
                        break;
                    case -284840886:
                        if (strJ.equals("unknown")) {
                            sun_roof_state = new r.e(new h0(null, 1, null), null, null, null, null, null, null, 126, null);
                        }
                        break;
                    case 3417674:
                        if (strJ.equals("open")) {
                            sun_roof_state = new r.e(null, null, null, new h0(null, 1, null), null, null, null, 119, null);
                        }
                        break;
                    case 3615925:
                        if (strJ.equals("vent")) {
                            sun_roof_state = new r.e(null, null, null, null, null, new h0(null, 1, null), null, 95, null);
                        }
                        break;
                    case 1421318596:
                        if (strJ.equals("calibrating")) {
                            sun_roof_state = new r.e(null, new h0(null, 1, null), null, null, null, null, null, 125, null);
                        }
                        break;
                    default:
                        break;
                }
                if (sun_roof_state == null) {
                    sun_roof_state = rVar.getSun_roof_state();
                }
            } else {
                sun_roof_state = rVar.getSun_roof_state();
            }
            r.e eVar = sun_roof_state;
            Integer numG2 = iVar.g(jSONObjectOptJSONObject, "center_display_state");
            if (numG2 != null) {
                switch (numG2.intValue()) {
                    case 0:
                        cVar = new r.c(new h0(null, 1, null), null, null, null, null, null, null, null, null, null, null, 2046, null);
                        center_display_state = cVar;
                        break;
                    case 1:
                        cVar = new r.c(null, new h0(null, 1, null), null, null, null, null, null, null, null, null, null, 2045, null);
                        center_display_state = cVar;
                        break;
                    case 2:
                        cVar = new r.c(null, null, new h0(null, 1, null), null, null, null, null, null, null, null, null, 2043, null);
                        center_display_state = cVar;
                        break;
                    case 3:
                        cVar = new r.c(null, null, null, new h0(null, 1, null), null, null, null, null, null, null, null, 2039, null);
                        center_display_state = cVar;
                        break;
                    case 4:
                        cVar = new r.c(null, null, null, null, new h0(null, 1, null), null, null, null, null, null, null, 2031, null);
                        center_display_state = cVar;
                        break;
                    case 5:
                        cVar = new r.c(null, null, null, null, null, new h0(null, 1, null), null, null, null, null, null, 2015, null);
                        center_display_state = cVar;
                        break;
                    case 6:
                        cVar = new r.c(null, null, null, null, null, null, new h0(null, 1, null), null, null, null, null, 1983, null);
                        center_display_state = cVar;
                        break;
                    case 7:
                        cVar = new r.c(null, null, null, null, null, null, null, new h0(null, 1, null), null, null, null, 1919, null);
                        center_display_state = cVar;
                        break;
                    case 8:
                        cVar = new r.c(null, null, null, null, null, null, null, null, new h0(null, 1, null), null, null, 1791, null);
                        center_display_state = cVar;
                        break;
                    case 9:
                        cVar = new r.c(null, null, null, null, null, null, null, null, null, new h0(null, 1, null), null, 1535, null);
                        center_display_state = cVar;
                        break;
                    default:
                        center_display_state = rVar.getCenter_display_state();
                        break;
                }
                if (center_display_state == null) {
                    center_display_state = rVar.getCenter_display_state();
                }
            } else {
                center_display_state = rVar.getCenter_display_state();
            }
            r.c cVar2 = center_display_state;
            g gVar = g.f125367a;
            Boolean boolB16 = gVar.c(jSONObjectOptJSONObject) ? iVar.b(jSONObjectOptJSONObject, "sentry_mode_available") : null;
            if (gVar.c(jSONObjectOptJSONObject)) {
                Object objOpt = jSONObjectOptJSONObject.opt("sentry_mode");
                if (objOpt != null) {
                    Boolean bool = objOpt instanceof Boolean ? (Boolean) objOpt : null;
                    if (bool == null || !bool.booleanValue()) {
                        r.d dVar3 = new r.d(new h0(null, 1, null), null, null, null, null, null, null, 126, null);
                        dVar2 = dVar3;
                    } else {
                        dVar2 = new r.d(null, new h0(null, 1, null), null, null, null, null, null, 125, null);
                    }
                    dVar = dVar2;
                } else {
                    dVar = new r.d(new h0(null, 1, null), null, null, null, null, null, null, 126, null);
                }
            } else {
                dVar = null;
            }
            return new r(false, false, false, false, false, false, false, false, false, false, 0, false, false, false, false, false, false, eVar, cVar2, dVar, p0Var, instant, boolB2, boolB3, boolB4, boolB5, boolB6, boolB7, boolB8, boolB9, boolB10, boolB11, numG, boolB, boolB12, boolB13, boolB14, boolB15, boolB16, null, null, null, null, null, null, null, null, 131071, 32640, null);
        } catch (Exception e11) {
            i.f125368a.h().f("Closure state parse failure", e11);
            return null;
        }
    }
}
