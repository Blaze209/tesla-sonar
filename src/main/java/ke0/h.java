package ke0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import fc0.u5;
import gc0.a0;
import gc0.a1;
import gc0.e0;
import gc0.g0;
import gc0.i0;
import gc0.k0;
import gc0.o;
import gc0.t;
import gc0.t0;
import gc0.v0;
import gc0.y;
import gc0.z;
import ie0.n;
import ie0.p0;
import ie0.r;
import j$.time.Instant;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\u001a!\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\n\u001a\u00020\u0000*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\f\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\r\"\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u0017\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\b¨\u0006\u0018"}, d2 = {"Lfc0/u5;", "", "vin", "Lke0/i;", "origin", "g", "(Lfc0/u5;Ljava/lang/String;Lke0/i;)Lfc0/u5;", "j", "(Lfc0/u5;)Ljava/lang/String;", "", "b", "([BLjava/lang/String;Lke0/i;)Lfc0/u5;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/u5;)Lfc0/u5;", "c", IntegerTokenConverter.CONVERTER_KEY, "", "a", "Z", "f", "()Z", "VEHICLE_DATA_VERBOSE_LOGGING", "e", "base64", "vehicledata_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f85995a = r.c();

    public static final u5 b(byte[] bArr, String vin, i origin) {
        s.k(bArr, "<this>");
        s.k(vin, "vin");
        s.k(origin, "origin");
        if (f85995a && origin == i.VEHICLE_DATA_FETCH) {
            f.f85990a.b().j("DECODE VEHICLE DATA: " + origin + " " + vin + " => base64:" + n.c(bArr, 0, 1, null));
        }
        return g(u5.F.decode(bArr), vin, origin);
    }

    public static final u5 c(u5 u5Var) {
        Long gps_as_of;
        s.k(u5Var, "<this>");
        e0 location_state = u5Var.getLocation_state();
        if (location_state != null && (gps_as_of = location_state.getGps_as_of()) != null) {
            long jLongValue = gps_as_of.longValue();
            Instant timestamp = location_state.getTimestamp();
            if (timestamp == null) {
                return u5.b(u5Var, null, null, null, null, null, null, e0.b(location_state, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0L, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32769, 15, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, false, null, 2147483583, null);
            }
            long epochSecond = timestamp.getEpochSecond();
            if (jLongValue > epochSecond) {
                return u5.b(u5Var, null, null, null, null, null, null, e0.b(location_state, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0L, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false, null, null, null, null, null, Long.valueOf(epochSecond), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32769, 15, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, false, null, 2147483583, null);
            }
        }
        return u5Var;
    }

    public static final u5 d(u5 u5Var) {
        s.k(u5Var, "<this>");
        if (!r.d()) {
            return u5Var;
        }
        o charge_state = u5Var.getCharge_state();
        return u5.b(u5Var, null, charge_state != null ? o.b(charge_state, 0, 0, 0, 0, 0, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, 0, 0, 0, false, 0, false, 0L, false, false, false, 0, false, 0, 0, false, false, 0L, 0, null, 0, 0, 0, false, 0, false, null, BitmapDescriptorFactory.HUE_RED, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1572865, 127, null) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, false, null, 2147482109, null);
    }

    public static final String e(u5 u5Var) {
        s.k(u5Var, "<this>");
        return u5Var.encodeByteString().a();
    }

    public static final boolean f() {
        return f85995a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, fc0.u5] */
    /* JADX WARN: Type inference failed for: r8v7, types: [T, fc0.u5] */
    public static final u5 g(u5 u5Var, final String vin, final i origin) {
        s.k(u5Var, "<this>");
        s.k(vin, "vin");
        s.k(origin, "origin");
        final n0 n0Var = new n0();
        n0Var.f86529a = u5Var;
        boolean z11 = f85995a;
        if (z11 && origin == i.VEHICLE_DATA_FETCH) {
            f.f85990a.b().j("INITIAL VEHICLE DATA: " + origin + " " + vin + " => " + j((u5) n0Var.f86529a));
        }
        n0Var.f86529a = a.f85977a.n(u5Var);
        p0.a(new wn0.a() { // from class: ke0.g
            @Override // wn0.a
            public final Object invoke() {
                return h.h(n0Var, vin, origin);
            }
        });
        n0Var.f86529a = c(d(i((u5) n0Var.f86529a)));
        if (z11 && origin == i.VEHICLE_DATA_FETCH) {
            f.f85990a.b().j("FULLY MIGRATED VEHICLE DATA: " + origin + " " + vin + " => " + j((u5) n0Var.f86529a));
        }
        return (u5) n0Var.f86529a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, fc0.u5] */
    public static final h0 h(n0 n0Var, String str, i iVar) {
        n0Var.f86529a = e.f85983a.c((u5) n0Var.f86529a, str, iVar).getVehicleData();
        return h0.f84049a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final u5 i(u5 u5Var) {
        i0 i0Var;
        g0 g0Var;
        i0 i0VarB;
        s.k(u5Var, "<this>");
        a0 legacy_vehicle_state = u5Var.getLegacy_vehicle_state();
        if (legacy_vehicle_state != null) {
            a1 vehicle_state = u5Var.getVehicle_state();
            gc0.n0 n0VarB = null;
            if ((vehicle_state != null ? vehicle_state.getTimestamp() : null) == null) {
                Instant timestamp = legacy_vehicle_state.getTimestamp();
                z legacy_media_state = legacy_vehicle_state.getLegacy_media_state();
                y legacy_media_info = legacy_vehicle_state.getLegacy_media_info();
                if (legacy_media_state != null) {
                    i0Var = new i0(timestamp, legacy_media_state.getRemote_control_enabled(), null, null, null, null, null, null, null, null, 1020, null);
                } else {
                    i0Var = null;
                }
                if (legacy_media_info != null) {
                    if (i0Var == null) {
                        i0Var = new i0(timestamp, null, null, null, null, null, null, null, null, null, 1022, null);
                    }
                    i0VarB = i0.b(i0Var, null, null, legacy_media_info.getNow_playing_artist(), legacy_media_info.getNow_playing_title(), legacy_media_info.getAudio_volume(), legacy_media_info.getAudio_volume_increment(), legacy_media_info.getAudio_volume_max(), legacy_media_info.getNow_playing_source(), legacy_media_info.getMedia_playback_status(), null, 515, null);
                    g0Var = new g0(timestamp, legacy_media_info.getNow_playing_duration(), legacy_media_info.getNow_playing_elapsed(), legacy_media_info.getNow_playing_source_string(), legacy_media_info.getNow_playing_album(), legacy_media_info.getNow_playing_station(), legacy_media_info.getA2dp_source_name(), null, null, null, null, 1920, null);
                } else {
                    g0Var = null;
                    i0VarB = i0Var;
                }
                t tVar = null;
                Boolean bool = null;
                Boolean bool2 = null;
                Boolean bool3 = null;
                a1 a1Var = new a1(timestamp, legacy_vehicle_state.getAutopark_style(), legacy_vehicle_state.getActive_spoiler_state(), legacy_vehicle_state.getAutopark_version(), legacy_vehicle_state.getAutopark_state(), legacy_vehicle_state.y(), legacy_vehicle_state.getGuestMode(), tVar, legacy_vehicle_state.getApi_version(), legacy_vehicle_state.getNotifications_supported(), legacy_vehicle_state.getRemote_start_supported(), legacy_vehicle_state.getRemote_start_enabled(), legacy_vehicle_state.getLast_autopark_error(), legacy_vehicle_state.getHomelink_device_count(), legacy_vehicle_state.getSmart_summon_available(), legacy_vehicle_state.getSummon_standby_mode_enabled(), legacy_vehicle_state.getPatsy_mode(), legacy_vehicle_state.getWebcam_available(), legacy_vehicle_state.getVehicle_self_test_requested(), legacy_vehicle_state.getVehicle_self_test_progress(), legacy_vehicle_state.getCalendar_supported(), legacy_vehicle_state.getDashcam_clip_save_available(), legacy_vehicle_state.getDashcam_state(), legacy_vehicle_state.getService_mode(), legacy_vehicle_state.getService_mode_plus(), legacy_vehicle_state.getService_mode_auth(), legacy_vehicle_state.getService_gtw_diag_session_active(), legacy_vehicle_state.getAllow_authorized_mobile_devices_only(), legacy_vehicle_state.getDrive_rail_on(), legacy_vehicle_state.getPin_to_drive_enabled(), legacy_vehicle_state.getPin_to_drive_pin_set(), legacy_vehicle_state.getFrontfoglights_on(), legacy_vehicle_state.getRearfoglights_on(), legacy_vehicle_state.getHeadlights_on(), legacy_vehicle_state.getHighbeamlights_on(), bool, legacy_vehicle_state.getTrailer_mode_on(), legacy_vehicle_state.getSigned_cmd_service_mode(), legacy_vehicle_state.getTransport_mode(), legacy_vehicle_state.getFactory_mode(), legacy_vehicle_state.getTraining_wheels_mode(), legacy_vehicle_state.getGtw_diag_level(), legacy_vehicle_state.getTrailer_light_test_available(), legacy_vehicle_state.getTrailer_light_test_requested(), legacy_vehicle_state.getTruck_bed_lights_brightness(), legacy_vehicle_state.getTruck_bed_lights_auto_brightness(), legacy_vehicle_state.getTruck_bed_lights_auto_state(), legacy_vehicle_state.getTruck_bed_lights_controls_disabled(), legacy_vehicle_state.getAccessory_lightbar_middle_on(), bool2, bool3, null, null, null, null, null, null, null, null, null, null, null, null, 128, 2147352584, null);
                t0 t0Var = new t0(timestamp, legacy_vehicle_state.getTpms_last_seen_pressure_time_fl(), legacy_vehicle_state.getTpms_last_seen_pressure_time_fr(), legacy_vehicle_state.getTpms_last_seen_pressure_time_rl(), legacy_vehicle_state.getTpms_last_seen_pressure_time_rr(), null, null, 0 == true ? 1 : 0, null, null, null, null, null, legacy_vehicle_state.getTpms_pressure_fl(), legacy_vehicle_state.getTpms_pressure_fr(), legacy_vehicle_state.getTpms_pressure_rl(), legacy_vehicle_state.getTpms_pressure_rr(), legacy_vehicle_state.getTpms_hard_warning_fl(), legacy_vehicle_state.getTpms_hard_warning_fr(), legacy_vehicle_state.getTpms_hard_warning_rl(), legacy_vehicle_state.getTpms_hard_warning_rr(), legacy_vehicle_state.getTpms_soft_warning_fl(), legacy_vehicle_state.getTpms_soft_warning_fr(), legacy_vehicle_state.getTpms_soft_warning_rl(), legacy_vehicle_state.getTpms_soft_warning_rr(), legacy_vehicle_state.getTpms_rcp_front_value(), legacy_vehicle_state.getTpms_rcp_rear_value(), null, null, null, null, null, null, null, null, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, bool2, bool3, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, null, 0 == true ? 1 : 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -134209568, -1, 16777215, null);
                v0 v0Var = new v0(timestamp, legacy_vehicle_state.getVehicle_name(), legacy_vehicle_state.getCar_version(), legacy_vehicle_state.getDetailed_version(), legacy_vehicle_state.getAutopilot_hash(), legacy_vehicle_state.getFsd_software_version(), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 448, 0 == true ? 1 : 0);
                gc0.n0 software_update_state = legacy_vehicle_state.getSoftware_update_state();
                if (software_update_state != null) {
                    n0VarB = gc0.n0.b(software_update_state, 0L, 0L, 0, 0, 0, null, null, timestamp, null, null, null, null, null, null, null, null, 65407, null);
                    timestamp = timestamp;
                }
                return u5.b(u5Var, null, null, null, null, null, null, null, null, null, null, null, null, a1Var, t0Var, i0VarB, g0Var, v0Var, n0VarB, new k0(timestamp, legacy_vehicle_state.getParental_controls_settings(), legacy_vehicle_state.getParental_controls_active(), legacy_vehicle_state.getParental_controls_pin_set(), null, 16, null), null, null, null, null, null, 0, null, null, null, null, false, null, 2146963439, null);
            }
        }
        f.f85990a.b().m(wb0.e.v(u5Var) + " -- legacy vehicle state not present or has new vehicle state, nothing to migrate...");
        return u5.b(u5Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, false, null, 2147483631, null);
    }

    private static final String j(u5 u5Var) {
        return "vehicle_detail_state:" + u5Var.getVehicle_detail_state() + " tire_pressure_state:" + u5Var.getTire_pressure_state() + " media_state:" + u5Var.getMedia_state() + " media_detail_state:" + u5Var.getMedia_detail_state() + " parental_controls_state:" + u5Var.getParental_controls_state() + " software_update_state:" + u5Var.getSoftware_update_state() + " vehicle_state:" + u5Var.getVehicle_state() + " legacy_vehicle_state:" + u5Var.getLegacy_vehicle_state();
    }
}
