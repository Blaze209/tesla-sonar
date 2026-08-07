package yc0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ec0.h0;
import ec0.o;
import expo.modules.interfaces.permissions.PermissionsResponse;
import gc0.a0;
import gc0.n0;
import gc0.q0;
import gc0.s;
import gc0.y;
import gc0.z;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import org.webrtc.WebrtcBuildVersion;
import p013kotlin.Metadata;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lorg/json/JSONObject;", "Lgc0/a0;", "b", "(Lorg/json/JSONObject;)Lgc0/a0;", "legacyVehicleState", "json2proto_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class j {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static final gc0.b a(String str) {
        switch (str) {
            case "standby":
                return new gc0.b(new h0(null, 1, null), null, null, null, null, null, null, null, null, null, null, null, null, 8190, null);
            case "opening_gate":
                return new gc0.b(null, null, null, null, null, null, null, null, null, null, null, new h0(null, 1, null), null, 6143, null);
            case "preparing":
                return new gc0.b(null, null, null, null, null, null, null, new h0(null, 1, null), null, null, null, null, null, 8063, null);
            case "paused":
                return new gc0.b(null, null, null, null, null, null, null, null, null, new h0(null, 1, null), null, null, null, 7679, null);
            case "unavailable":
                return new gc0.b(null, new h0(null, 1, null), null, null, null, null, null, null, null, null, null, null, null, 8189, null);
            case "active_forward":
                return new gc0.b(null, null, null, new h0(null, 1, null), null, null, null, null, null, null, null, null, null, 8183, null);
            case "resuming":
                return new gc0.b(null, null, null, null, null, null, null, null, null, null, new h0(null, 1, null), null, null, 7167, null);
            case "panic":
                return new gc0.b(null, null, null, null, null, null, new h0(null, 1, null), null, null, null, null, null, null, 8127, null);
            case "ready":
                return new gc0.b(null, null, new h0(null, 1, null), null, null, null, null, null, null, null, null, null, null, 8187, null);
            case "disabled":
                return new gc0.b(null, null, null, null, null, new h0(null, 1, null), null, null, null, null, null, null, null, 8159, null);
            case "active_reverse":
                return new gc0.b(null, null, null, null, new h0(null, 1, null), null, null, null, null, null, null, null, null, 8175, null);
            case "aborting":
                return new gc0.b(null, null, null, null, null, null, null, null, new h0(null, 1, null), null, null, null, null, 7935, null);
            default:
                if (str.equals("standby")) {
                    return new gc0.b(new h0(null, 1, null), null, null, null, null, null, null, null, null, null, null, null, null, 8190, null);
                }
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:164:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x0297 A[Catch: Exception -> 0x028d, TryCatch #0 {Exception -> 0x028d, blocks: (B:36:0x0216, B:38:0x0229, B:39:0x0234, B:41:0x023a, B:52:0x0289, B:50:0x0268, B:58:0x029c, B:60:0x02ac, B:67:0x02bf, B:69:0x02cd, B:76:0x0302, B:79:0x031a, B:81:0x0346, B:83:0x0372, B:84:0x0376, B:86:0x037c, B:89:0x0385, B:91:0x03a3, B:94:0x03ac, B:95:0x03c6, B:98:0x03cf, B:99:0x03e9, B:102:0x03f2, B:103:0x040c, B:106:0x0416, B:107:0x0432, B:110:0x043c, B:78:0x0315, B:71:0x02e1, B:73:0x02e9, B:74:0x02fb, B:65:0x02b8, B:57:0x0297, B:42:0x0248, B:44:0x0250, B:48:0x0263, B:47:0x0259), top: B:339:0x0216, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0379  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v2 int, still in use, count: 3, list:
      (r3v2 int) from 0x05fc: SWITCH (r3v2 int)
     case 48: goto B:251:0x06bd
     case 49: goto B:247:0x06af
     case 50: goto B:243:0x06a1
     case 51: goto B:239:0x0693
     default: goto B:196:0x05ff A[Catch: Exception -> 0x0459, RegionRef:SW:195]
      (r3v2 int) from 0x05ff: SWITCH (r3v2 int)
     case 53: goto B:235:0x0685
     case 54: goto B:231:0x0677
     case 55: goto B:227:0x0669
     case 56: goto B:223:0x065b
     case 57: goto B:219:0x064d
     default: goto B:197:0x0602 A[Catch: Exception -> 0x0459, RegionRef:SW:196]
      (r3v2 int) from 0x0602: SWITCH (r3v2 int)
     case 1567: goto B:215:0x063f
     case 1568: goto B:211:0x0631
     case 1569: goto B:207:0x0623
     case 1570: goto B:203:0x0615
     case 1571: goto B:199:0x0607
     default: goto B:198:0x0605 A[Catch: Exception -> 0x0459, RegionRef:SW:197]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:84:0x0376. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static final a0 b(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        q0 active_spoiler_state;
        List<Integer> arrayList;
        Integer numValueOf;
        gc0.b bVar;
        n0 software_update_state;
        s sVar;
        y yVar;
        Object obj;
        gc0.h0 h0Var;
        Object obj2;
        Object obj3;
        n0.c status;
        n0.c cVar;
        n0.c cVar2;
        p013kotlin.jvm.internal.s.k(jSONObject, "<this>");
        try {
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("vehicle_state");
            if (jSONObjectOptJSONObject2 == null) {
                return null;
            }
            jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("media_state");
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("software_update");
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject2.optJSONObject("media_info");
            String strOptString = jSONObjectOptJSONObject2.optString("autopark_state_v2");
            String strOptString2 = jSONObjectOptJSONObject2.optString("autopark_state_v3");
            n0 n0Var = new n0(0L, 0L, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
            a0 a0Var = new a0(0, null, null, null, null, false, false, false, null, 0, false, false, false, false, false, 0, false, false, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false, false, false, false, false, false, false, false, false, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, 65535, null);
            i iVar = i.f125368a;
            String strJ = iVar.j(jSONObjectOptJSONObject2, "active_spoiler_state");
            if (strJ != null) {
                switch (strJ.hashCode()) {
                    case -1820889799:
                        active_spoiler_state = !strJ.equals("extended") ? a0Var.getActive_spoiler_state() : new q0(null, null, new h0(null, 1, null), null, null, 27, null);
                        break;
                    case -1028580512:
                        if (strJ.equals("retracted")) {
                            active_spoiler_state = new q0(null, new h0(null, 1, null), null, null, null, 29, null);
                        }
                        break;
                    case -284840886:
                        if (strJ.equals("unknown")) {
                            active_spoiler_state = new q0(new h0(null, 1, null), null, null, null, null, 30, null);
                        }
                        break;
                    case 97204770:
                        if (strJ.equals("fault")) {
                            active_spoiler_state = new q0(null, null, null, new h0(null, 1, null), null, 23, null);
                        }
                        break;
                    default:
                        break;
                }
            }
            q0 q0Var = active_spoiler_state;
            Integer numG = iVar.g(jSONObjectOptJSONObject2, "api_version");
            String strJ2 = iVar.j(jSONObjectOptJSONObject2, "autopilot_hash");
            Boolean boolB = iVar.b(jSONObjectOptJSONObject2, "calendar_supported");
            if (boolB == null) {
                boolB = iVar.b(jSONObjectOptJSONObject2, "parsed_calendar_supported");
            }
            Boolean bool = boolB;
            String strJ3 = iVar.j(jSONObjectOptJSONObject2, "car_version");
            Boolean boolB2 = iVar.b(jSONObjectOptJSONObject2, "dashcam_clip_save_available");
            String strJ4 = iVar.j(jSONObjectOptJSONObject2, "detailed_version");
            String strJ5 = iVar.j(jSONObjectOptJSONObject2, "feature_bitmask");
            if (strJ5 != null) {
                try {
                    List listF1 = t.f1(strJ5, new String[]{","}, false, 0, 6, null);
                    if (listF1 != null) {
                        arrayList = new ArrayList<>();
                        Iterator it = listF1.iterator();
                        while (it.hasNext()) {
                            String string = t.F1((String) it.next()).toString();
                            try {
                                numValueOf = Integer.valueOf(string.length() == 8 ? k.f125370a.a(string) : Integer.parseInt(string, p013kotlin.text.a.a(16)));
                            } catch (Exception e11) {
                                i iVar2 = i.f125368a;
                                iVar2.h().d("Failed to parse int feature bitmask => " + iVar2.j(jSONObjectOptJSONObject2, "feature_bitmask"), e11);
                                numValueOf = null;
                            }
                            if (numValueOf != null) {
                                arrayList.add(numValueOf);
                            }
                        }
                    } else {
                        arrayList = a0Var.y();
                    }
                } catch (Exception e12) {
                    e = e12;
                    jSONObjectOptJSONObject = null;
                }
            } else {
                arrayList = a0Var.y();
            }
            List<Integer> list = arrayList;
            i iVar3 = i.f125368a;
            Integer numG2 = iVar3.g(jSONObjectOptJSONObject2, "homelink_device_count");
            String strJ6 = iVar3.j(jSONObjectOptJSONObject2, "last_autopark_error");
            if (strOptString != null && (bVarA = a(strOptString)) != null) {
                bVar = bVarA;
            } else if (strOptString2 != null) {
                gc0.b bVarA = a(strOptString2);
                bVar = bVarA;
            } else {
                bVar = null;
            }
            String strJ7 = iVar3.j(jSONObjectOptJSONObject2, "autopark_style");
            gc0.c cVar3 = p013kotlin.jvm.internal.s.f(strJ7, "dead_man") ? new gc0.c(new h0(null, 1, null), null, null, 6, null) : p013kotlin.jvm.internal.s.f(strJ7, "standard") ? new gc0.c(null, new h0(null, 1, null), null, 5, null) : a0Var.getAutopark_style();
            z zVar = jSONObjectOptJSONObject != null ? new z(false, iVar3.b(jSONObjectOptJSONObject, "remote_control_enabled"), null, 5, null) : a0Var.getLegacy_media_state();
            Boolean boolB3 = iVar3.b(jSONObjectOptJSONObject2, "notifications_supported");
            Boolean boolB4 = iVar3.b(jSONObjectOptJSONObject2, "patsy_mode");
            Boolean boolB5 = iVar3.b(jSONObjectOptJSONObject2, "service_mode");
            Boolean boolB6 = iVar3.b(jSONObjectOptJSONObject2, "service_mode_plus");
            Boolean boolB7 = iVar3.b(jSONObjectOptJSONObject2, "remote_start_enabled");
            Boolean boolB8 = iVar3.b(jSONObjectOptJSONObject2, "remote_start_supported");
            Boolean boolB9 = iVar3.b(jSONObjectOptJSONObject2, "smart_summon_available");
            try {
                if (jSONObjectOptJSONObject3 != null) {
                    Integer numG3 = iVar3.g(jSONObjectOptJSONObject3, "download_perc");
                    int iOptInt = jSONObjectOptJSONObject3.optInt("expected_duration_sec");
                    Integer numG4 = iVar3.g(jSONObjectOptJSONObject3, "install_perc");
                    long jOptLong = jSONObjectOptJSONObject3.optLong("scheduled_time_ms");
                    String strJ8 = iVar3.j(jSONObjectOptJSONObject3, "version");
                    Long lI = iVar3.i(jSONObjectOptJSONObject3, "warning_time_remaining_ms");
                    String strJ9 = iVar3.j(jSONObjectOptJSONObject3, PermissionsResponse.STATUS_KEY);
                    if (strJ9 != null) {
                        switch (strJ9.hashCode()) {
                            case -1923435334:
                                if (strJ9.equals("downloading_wifi_wait")) {
                                    jSONObjectOptJSONObject = null;
                                    status = new n0.c(null, null, null, null, new h0(null, 1, null), null, null, 111, null);
                                } else {
                                    jSONObjectOptJSONObject = null;
                                    status = n0Var.getExpo.modules.interfaces.permissions.PermissionsResponse.STATUS_KEY java.lang.String();
                                }
                                cVar = status;
                                break;
                            case -1211129254:
                                if (!strJ9.equals("downloading")) {
                                    jSONObjectOptJSONObject = null;
                                    status = n0Var.getExpo.modules.interfaces.permissions.PermissionsResponse.STATUS_KEY java.lang.String();
                                    cVar = status;
                                } else {
                                    cVar2 = new n0.c(null, null, null, null, null, new h0(null, 1, null), null, 95, null);
                                    cVar = cVar2;
                                    jSONObjectOptJSONObject = null;
                                }
                                break;
                            case -733902135:
                                if (!strJ9.equals("available")) {
                                    jSONObjectOptJSONObject = null;
                                    status = n0Var.getExpo.modules.interfaces.permissions.PermissionsResponse.STATUS_KEY java.lang.String();
                                    cVar = status;
                                } else {
                                    cVar2 = new n0.c(null, null, null, new h0(null, 1, null), null, null, null, 119, null);
                                    cVar = cVar2;
                                    jSONObjectOptJSONObject = null;
                                }
                                break;
                            case -160710483:
                                if (!strJ9.equals("scheduled")) {
                                    jSONObjectOptJSONObject = null;
                                    status = n0Var.getExpo.modules.interfaces.permissions.PermissionsResponse.STATUS_KEY java.lang.String();
                                    cVar = status;
                                } else {
                                    cVar2 = new n0.c(null, null, new h0(null, 1, null), null, null, null, null, 123, null);
                                    cVar = cVar2;
                                    jSONObjectOptJSONObject = null;
                                }
                                break;
                            case 900450407:
                                if (!strJ9.equals("installing")) {
                                    jSONObjectOptJSONObject = null;
                                    status = n0Var.getExpo.modules.interfaces.permissions.PermissionsResponse.STATUS_KEY java.lang.String();
                                    cVar = status;
                                } else {
                                    cVar2 = new n0.c(null, new h0(null, 1, null), null, null, null, null, null, 125, null);
                                    cVar = cVar2;
                                    jSONObjectOptJSONObject = null;
                                }
                                break;
                            case 1316806720:
                                if (!strJ9.equals("starting")) {
                                    jSONObjectOptJSONObject = null;
                                    status = n0Var.getExpo.modules.interfaces.permissions.PermissionsResponse.STATUS_KEY java.lang.String();
                                    cVar = status;
                                } else {
                                    cVar2 = new n0.c(null, new h0(null, 1, null), null, null, null, null, null, 125, null);
                                    cVar = cVar2;
                                    jSONObjectOptJSONObject = null;
                                }
                                break;
                            default:
                                jSONObjectOptJSONObject = null;
                                status = n0Var.getExpo.modules.interfaces.permissions.PermissionsResponse.STATUS_KEY java.lang.String();
                                cVar = status;
                                break;
                        }
                    } else {
                        jSONObjectOptJSONObject = null;
                        status = n0Var.getExpo.modules.interfaces.permissions.PermissionsResponse.STATUS_KEY java.lang.String();
                        cVar = status;
                    }
                    software_update_state = new n0(0L, 0L, 0, 0, 0, null, cVar, null, Long.valueOf(jOptLong), lI, Integer.valueOf(iOptInt), numG3, numG4, strJ8, null, null, 49343, null);
                } else {
                    jSONObjectOptJSONObject = null;
                    software_update_state = a0Var.getSoftware_update_state();
                }
                n0 n0Var2 = software_update_state;
                Boolean boolB10 = iVar3.b(jSONObjectOptJSONObject2, "summon_standby_mode_enabled");
                Instant instantE = iVar3.e(jSONObjectOptJSONObject2, "timestamp");
                if (instantE == null) {
                    instantE = a0Var.getTimestamp();
                }
                Instant instant = instantE;
                Float fD = iVar3.d(jSONObjectOptJSONObject2, "tpms_pressure_fl");
                Float fD2 = iVar3.d(jSONObjectOptJSONObject2, "tpms_pressure_fr");
                Float fD3 = iVar3.d(jSONObjectOptJSONObject2, "tpms_pressure_rl");
                Float fD4 = iVar3.d(jSONObjectOptJSONObject2, "tpms_pressure_rr");
                Instant instantF = iVar3.f(jSONObjectOptJSONObject2, "tpms_last_seen_pressure_time_fl");
                if (instantF == null) {
                    instantF = a0Var.getTpms_last_seen_pressure_time_fl();
                }
                Instant instant2 = instantF;
                Instant instantF2 = iVar3.f(jSONObjectOptJSONObject2, "tpms_last_seen_pressure_time_fr");
                if (instantF2 == null) {
                    instantF2 = a0Var.getTpms_last_seen_pressure_time_fr();
                }
                Instant instant3 = instantF2;
                Instant instantF3 = iVar3.f(jSONObjectOptJSONObject2, "tpms_last_seen_pressure_time_rl");
                if (instantF3 == null) {
                    instantF3 = a0Var.getTpms_last_seen_pressure_time_rl();
                }
                Instant instant4 = instantF3;
                Instant instantF4 = iVar3.f(jSONObjectOptJSONObject2, "tpms_last_seen_pressure_time_rr");
                if (instantF4 == null) {
                    instantF4 = a0Var.getTpms_last_seen_pressure_time_rr();
                }
                Instant instant5 = instantF4;
                Boolean boolB11 = iVar3.b(jSONObjectOptJSONObject2, "tpms_hard_warning_fl");
                Boolean boolB12 = iVar3.b(jSONObjectOptJSONObject2, "tpms_hard_warning_fr");
                Boolean boolB13 = iVar3.b(jSONObjectOptJSONObject2, "tpms_hard_warning_rl");
                Boolean boolB14 = iVar3.b(jSONObjectOptJSONObject2, "tpms_hard_warning_rr");
                Boolean boolB15 = iVar3.b(jSONObjectOptJSONObject2, "tpms_soft_warning_fl");
                Boolean boolB16 = iVar3.b(jSONObjectOptJSONObject2, "tpms_soft_warning_fr");
                Boolean boolB17 = iVar3.b(jSONObjectOptJSONObject2, "tpms_soft_warning_rl");
                Boolean boolB18 = iVar3.b(jSONObjectOptJSONObject2, "tpms_soft_warning_rr");
                Float fD5 = iVar3.d(jSONObjectOptJSONObject2, "tpms_rcp_front_value");
                Float fD6 = iVar3.d(jSONObjectOptJSONObject2, "tpms_rcp_rear_value");
                String strJ10 = iVar3.j(jSONObjectOptJSONObject2, "vehicle_name");
                if (strJ10 == null) {
                    strJ10 = a0Var.getVehicle_name();
                }
                String str = strJ10;
                Integer numG5 = iVar3.g(jSONObjectOptJSONObject2, "vehicle_self_test_progress");
                Boolean boolB19 = iVar3.b(jSONObjectOptJSONObject2, "vehicle_self_test_requested");
                Boolean boolB20 = iVar3.b(jSONObjectOptJSONObject2, "webcam_available");
                String strJ11 = iVar3.j(jSONObjectOptJSONObject2, "dashcam_state");
                if (strJ11 != null) {
                    switch (strJ11.hashCode()) {
                        case -1297441327:
                            if (!strJ11.equals("Recording")) {
                                obj3 = jSONObjectOptJSONObject;
                            } else {
                                obj3 = s.DashCamState_RECORDING;
                            }
                            break;
                        case -531235931:
                            if (!strJ11.equals("NoSpace")) {
                                obj3 = jSONObjectOptJSONObject;
                            } else {
                                obj3 = s.DashCamState_NO_SPACE;
                            }
                            break;
                        case 79658599:
                            if (!strJ11.equals("Saved")) {
                                obj3 = jSONObjectOptJSONObject;
                            } else {
                                obj3 = s.DashCamState_SAVED;
                            }
                            break;
                        case 1002405936:
                            if (!strJ11.equals("Unavailable")) {
                                obj3 = jSONObjectOptJSONObject;
                            } else {
                                obj3 = s.DashCamState_UNAVAILABLE;
                            }
                            break;
                        case 1270065833:
                            if (!strJ11.equals("Available")) {
                                obj3 = jSONObjectOptJSONObject;
                            } else {
                                obj3 = s.DashCamState_AVAILABLE;
                            }
                            break;
                        case 1688352834:
                            if (!strJ11.equals("Streaming")) {
                                obj3 = jSONObjectOptJSONObject;
                            } else {
                                obj3 = s.DashCamState_STREAMING;
                            }
                            break;
                        default:
                            obj3 = jSONObjectOptJSONObject;
                            break;
                    }
                    sVar = obj3;
                } else {
                    sVar = jSONObjectOptJSONObject;
                }
                if (jSONObjectOptJSONObject4 != null) {
                    String strJ12 = iVar3.j(jSONObjectOptJSONObject4, "media_playback_status");
                    if (strJ12 != null) {
                        int iHashCode = strJ12.hashCode();
                        if (iHashCode != -1911454386) {
                            if (iHashCode != -219666003) {
                                obj = (iHashCode == 1171089422 && strJ12.equals("Playing")) ? o.Playing : jSONObjectOptJSONObject;
                            } else if (strJ12.equals("Stopped")) {
                                obj = o.Stopped;
                            }
                        } else if (strJ12.equals("Paused")) {
                            obj = o.Paused;
                        }
                    }
                    String strJ13 = iVar3.j(jSONObjectOptJSONObject4, "now_playing_source");
                    if (strJ13 != null) {
                        switch (strJ13) {
                            case "msHomeApps":
                                obj2 = gc0.h0.MediaSourceType_HomeApps;
                                break;
                            case "msSearch":
                                obj2 = gc0.h0.MediaSourceType_Search;
                                break;
                            case "msToybox":
                                obj2 = gc0.h0.MediaSourceType_Toybox;
                                break;
                            case "TuneIn":
                                obj2 = gc0.h0.MediaSourceType_TuneIn;
                                break;
                            case "msRecentsFavorites":
                                obj2 = gc0.h0.MediaSourceType_RecentsFavorites;
                                break;
                            case "msTutorial":
                                obj2 = gc0.h0.MediaSourceType_Tutorial;
                                break;
                            case "msGame":
                                obj2 = gc0.h0.MediaSourceType_Game;
                                break;
                            case "QQ Music":
                                obj2 = gc0.h0.MediaSourceType_QQMusic;
                                break;
                            case "msTheater":
                                obj2 = gc0.h0.MediaSourceType_Theater;
                                break;
                            case "QQ Music 2":
                                obj2 = gc0.h0.MediaSourceType_QQMusic2;
                                break;
                            case "Online Radio":
                                obj2 = gc0.h0.MediaSourceType_OnlineRadio;
                                break;
                            case "NetEase Music":
                                obj2 = gc0.h0.MediaSourceType_NetEaseMusic;
                                break;
                            case "16":
                                obj2 = gc0.h0.MediaSourceType_MediaFile;
                                break;
                            case "Tidal":
                                obj2 = gc0.h0.MediaSourceType_Tidal;
                                break;
                            case "Ximalaya":
                                obj2 = gc0.h0.MediaSourceType_Ximalaya;
                                break;
                            case "SiriusXM":
                                obj2 = gc0.h0.MediaSourceType_SiriusXM;
                                break;
                            case "msBrowser":
                                obj2 = gc0.h0.MediaSourceType_Browser;
                                break;
                            case "OnlineRadio2":
                                obj2 = gc0.h0.MediaSourceType_OnlineRadio2;
                                break;
                            case "Stingray":
                                obj2 = gc0.h0.MediaSourceType_Stingray;
                                break;
                            default:
                                switch (strJ13) {
                                    case 48:
                                        obj2 = !strJ13.equals(WebrtcBuildVersion.maint_version) ? jSONObjectOptJSONObject : gc0.h0.MediaSourceType_None;
                                        break;
                                    case 49:
                                        if (strJ13.equals("1")) {
                                            obj2 = gc0.h0.MediaSourceType_AM;
                                        }
                                        break;
                                    case 50:
                                        if (strJ13.equals("2")) {
                                            obj2 = gc0.h0.MediaSourceType_FM;
                                        }
                                        break;
                                    case 51:
                                        if (strJ13.equals("3")) {
                                            obj2 = gc0.h0.MediaSourceType_XM;
                                        }
                                        break;
                                    default:
                                        switch (strJ13) {
                                            case 53:
                                                if (strJ13.equals("5")) {
                                                    obj2 = gc0.h0.MediaSourceType_Slacker;
                                                }
                                                break;
                                            case 54:
                                                if (strJ13.equals("6")) {
                                                    obj2 = gc0.h0.MediaSourceType_LocalFiles;
                                                }
                                                break;
                                            case 55:
                                                if (strJ13.equals("7")) {
                                                    obj2 = gc0.h0.MediaSourceType_iPod;
                                                }
                                                break;
                                            case 56:
                                                if (strJ13.equals("8")) {
                                                    obj2 = gc0.h0.MediaSourceType_Bluetooth;
                                                }
                                                break;
                                            case 57:
                                                if (strJ13.equals("9")) {
                                                    obj2 = gc0.h0.MediaSourceType_AuxIn;
                                                }
                                                break;
                                            default:
                                                switch (iHashCode) {
                                                    case 1567:
                                                        if (strJ13.equals("10")) {
                                                            obj2 = gc0.h0.MediaSourceType_DAB;
                                                        }
                                                        break;
                                                    case 1568:
                                                        if (strJ13.equals("11")) {
                                                            obj2 = gc0.h0.MediaSourceType_Rdio;
                                                        }
                                                        break;
                                                    case 1569:
                                                        if (strJ13.equals("12")) {
                                                            obj2 = gc0.h0.MediaSourceType_Spotify;
                                                        }
                                                        break;
                                                    case 1570:
                                                        if (strJ13.equals("13")) {
                                                            obj2 = gc0.h0.MediaSourceType_USRadio;
                                                        }
                                                        break;
                                                    case 1571:
                                                        if (strJ13.equals("14")) {
                                                            obj2 = gc0.h0.MediaSourceType_EURadio;
                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                        }
                        h0Var = obj2;
                    } else {
                        h0Var = jSONObjectOptJSONObject;
                    }
                    yVar = new y(obj, iVar3.d(jSONObjectOptJSONObject4, "audio_volume"), iVar3.g(jSONObjectOptJSONObject4, "now_playing_duration"), iVar3.g(jSONObjectOptJSONObject4, "now_playing_elapsed"), h0Var, null, iVar3.j(jSONObjectOptJSONObject4, "now_playing_artist"), iVar3.j(jSONObjectOptJSONObject4, "now_playing_title"), iVar3.j(jSONObjectOptJSONObject4, "now_playing_album"), iVar3.j(jSONObjectOptJSONObject4, "now_playing_station"), iVar3.d(jSONObjectOptJSONObject4, "audio_volume_increment"), iVar3.d(jSONObjectOptJSONObject4, "audio_volume_max"), iVar3.j(jSONObjectOptJSONObject4, "a2dp_source_name"), null, 8224, null);
                } else {
                    yVar = jSONObjectOptJSONObject;
                }
                return new a0(0, null, null, null, null, false, false, false, null, 0, false, false, false, false, false, 0, false, false, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false, false, false, false, false, false, false, false, false, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, cVar3, q0Var, n0Var2, zVar, instant, null, bVar, list, instant2, instant3, instant4, instant5, yVar, null, null, numG, strJ3, strJ4, strJ2, str, boolB3, boolB8, boolB7, strJ6, numG2, boolB9, boolB10, boolB4, boolB20, boolB19, numG5, bool, boolB2, sVar, fD, fD2, fD3, fD4, boolB5, boolB6, boolB11, boolB12, boolB13, boolB14, boolB15, boolB16, boolB17, boolB18, fD5, fD6, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 196871, -2097152, 65535, null);
            } catch (Exception e13) {
                e = e13;
            }
        } catch (Exception e14) {
            e = e14;
            jSONObjectOptJSONObject = null;
        }
        i.f125368a.h().f("Vehicle state parse failure", e);
        return jSONObjectOptJSONObject;
    }
}
