package yc0;

import ec0.h0;
import ezvcard.property.Gender;
import gc0.x;
import j$.time.Instant;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lorg/json/JSONObject;", "Lgc0/x;", "a", "(Lorg/json/JSONObject;)Lgc0/x;", "guiSettings", "json2proto_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class e {
    /* JADX WARN: Code duplicated, block: B:37:0x008d A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:3:0x0008, B:6:0x0011, B:8:0x003c, B:12:0x0045, B:15:0x0052, B:49:0x010b, B:54:0x011a, B:56:0x0122, B:58:0x0128, B:67:0x0167, B:69:0x016f, B:71:0x0177, B:80:0x01b8, B:82:0x01c0, B:84:0x01c8, B:93:0x0209, B:95:0x0217, B:101:0x022c, B:97:0x021c, B:99:0x0224, B:100:0x0227, B:85:0x01dd, B:87:0x01e5, B:88:0x01fa, B:92:0x0204, B:72:0x018c, B:74:0x0194, B:75:0x01a9, B:79:0x01b3, B:59:0x013d, B:61:0x0143, B:62:0x0158, B:66:0x0162, B:28:0x0073, B:37:0x008d, B:31:0x007b, B:41:0x00af, B:34:0x0083, B:38:0x00a6, B:42:0x00c8, B:45:0x00d1, B:46:0x00ea, B:48:0x00f2, B:53:0x0115), top: B:105:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00af A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:3:0x0008, B:6:0x0011, B:8:0x003c, B:12:0x0045, B:15:0x0052, B:49:0x010b, B:54:0x011a, B:56:0x0122, B:58:0x0128, B:67:0x0167, B:69:0x016f, B:71:0x0177, B:80:0x01b8, B:82:0x01c0, B:84:0x01c8, B:93:0x0209, B:95:0x0217, B:101:0x022c, B:97:0x021c, B:99:0x0224, B:100:0x0227, B:85:0x01dd, B:87:0x01e5, B:88:0x01fa, B:92:0x0204, B:72:0x018c, B:74:0x0194, B:75:0x01a9, B:79:0x01b3, B:59:0x013d, B:61:0x0143, B:62:0x0158, B:66:0x0162, B:28:0x0073, B:37:0x008d, B:31:0x007b, B:41:0x00af, B:34:0x0083, B:38:0x00a6, B:42:0x00c8, B:45:0x00d1, B:46:0x00ea, B:48:0x00f2, B:53:0x0115), top: B:105:0x0008 }] */
    public static final x a(JSONObject jSONObject) {
        x.a gui_charge_rate_units;
        x.e gui_distance_units;
        x.d gui_range_display;
        x.f gui_temperature_units;
        x.g gui_tirepressure_units;
        s.k(jSONObject, "<this>");
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("gui_settings");
            if (jSONObjectOptJSONObject == null) {
                return null;
            }
            x xVar = new x(false, false, null, null, null, null, null, null, null, null, null, null, 4095, null);
            i iVar = i.f125368a;
            Boolean boolB = iVar.b(jSONObjectOptJSONObject, "gui_24_hour_time");
            Boolean boolB2 = iVar.b(jSONObjectOptJSONObject, "show_range_units");
            Instant instantE = iVar.e(jSONObjectOptJSONObject, "timestamp");
            if (instantE == null) {
                instantE = xVar.getTimestamp();
            }
            Instant instant = instantE;
            String strJ = iVar.j(jSONObjectOptJSONObject, "gui_charge_rate_units");
            if (strJ == null) {
                gui_charge_rate_units = xVar.getGui_charge_rate_units();
            } else {
                int iHashCode = strJ.hashCode();
                if (iHashCode != -670529065) {
                    if (iHashCode != 3404) {
                        if (iHashCode != 3426) {
                            if (iHashCode != 3484) {
                                if (iHashCode != 102112471) {
                                    if (iHashCode == 103840349 && strJ.equals("mi/hr")) {
                                        gui_charge_rate_units = new x.a(null, null, new h0(null, 1, null), null, null, 27, null);
                                    }
                                } else if (strJ.equals("km/hr")) {
                                    gui_charge_rate_units = new x.a(null, new h0(null, 1, null), null, null, null, 29, null);
                                }
                                gui_charge_rate_units = xVar.getGui_charge_rate_units();
                            } else if (strJ.equals("mi")) {
                                gui_charge_rate_units = new x.a(null, null, new h0(null, 1, null), null, null, 27, null);
                            } else {
                                gui_charge_rate_units = xVar.getGui_charge_rate_units();
                            }
                        } else if (strJ.equals("km")) {
                            gui_charge_rate_units = new x.a(null, new h0(null, 1, null), null, null, null, 29, null);
                        } else {
                            gui_charge_rate_units = xVar.getGui_charge_rate_units();
                        }
                    } else if (strJ.equals("kW")) {
                        gui_charge_rate_units = new x.a(null, null, null, new h0(null, 1, null), null, 23, null);
                    } else {
                        gui_charge_rate_units = xVar.getGui_charge_rate_units();
                    }
                } else if (strJ.equals("Invalid")) {
                    gui_charge_rate_units = new x.a(new h0(null, 1, null), null, null, null, null, 30, null);
                } else {
                    gui_charge_rate_units = xVar.getGui_charge_rate_units();
                }
                if (gui_charge_rate_units == null) {
                    gui_charge_rate_units = xVar.getGui_charge_rate_units();
                }
            }
            x.a aVar = gui_charge_rate_units;
            String strJ2 = iVar.j(jSONObjectOptJSONObject, "gui_distance_units");
            if (strJ2 == null) {
                gui_distance_units = xVar.getGui_distance_units();
            } else {
                if (s.f(strJ2, "km/hr")) {
                    gui_distance_units = new x.e(new h0(null, 1, null), null, null, 6, null);
                } else if (s.f(strJ2, "mi/hr")) {
                    gui_distance_units = new x.e(null, new h0(null, 1, null), null, 5, null);
                } else {
                    gui_distance_units = xVar.getGui_distance_units();
                }
                if (gui_distance_units == null) {
                    gui_distance_units = xVar.getGui_distance_units();
                }
            }
            x.e eVar = gui_distance_units;
            String strJ3 = iVar.j(jSONObjectOptJSONObject, "gui_range_display");
            if (strJ3 == null) {
                gui_range_display = xVar.getGui_range_display();
            } else {
                if (s.f(strJ3, "Ideal")) {
                    gui_range_display = new x.d(new h0(null, 1, null), null, null, 6, null);
                } else if (s.f(strJ3, "Rated")) {
                    gui_range_display = new x.d(null, new h0(null, 1, null), null, 5, null);
                } else {
                    gui_range_display = xVar.getGui_range_display();
                }
                if (gui_range_display == null) {
                    gui_range_display = xVar.getGui_range_display();
                }
            }
            x.d dVar = gui_range_display;
            String strJ4 = iVar.j(jSONObjectOptJSONObject, "gui_temperature_units");
            if (strJ4 == null) {
                gui_temperature_units = xVar.getGui_temperature_units();
            } else {
                if (s.f(strJ4, "C")) {
                    gui_temperature_units = new x.f(null, new h0(null, 1, null), null, 5, null);
                } else if (s.f(strJ4, Gender.FEMALE)) {
                    gui_temperature_units = new x.f(new h0(null, 1, null), null, null, 6, null);
                } else {
                    gui_temperature_units = xVar.getGui_temperature_units();
                }
                if (gui_temperature_units == null) {
                    gui_temperature_units = xVar.getGui_temperature_units();
                }
            }
            x.f fVar = gui_temperature_units;
            String strJ5 = iVar.j(jSONObjectOptJSONObject, "gui_tirepressure_units");
            if (s.f(strJ5, "Bar")) {
                gui_tirepressure_units = x.g.TirePressureUnitBar;
            } else {
                gui_tirepressure_units = s.f(strJ5, "Psi") ? x.g.TirePressureUnitPsi : xVar.getGui_tirepressure_units();
            }
            return new x(false, false, null, eVar, fVar, aVar, dVar, instant, boolB, boolB2, gui_tirepressure_units, null, 2055, null);
        } catch (Exception e11) {
            i.f125368a.h().f("Gui settings parse failure", e11);
            return null;
        }
    }
}
