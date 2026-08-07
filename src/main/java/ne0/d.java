package ne0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import fc0.u5;
import gc0.o;
import gc0.q;
import ic0.f;
import me0.l;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import wb0.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000e\u001a\u00020\r*\u00020\u00012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "Lne0/c;", "e", "(Ljava/lang/String;)Lne0/c;", "Lxc0/a;", "vehicle", "Lic0/e;", "b", "(Lne0/c;Lxc0/a;)Lic0/e;", "appVehicle", "command", "c", "(Lxc0/a;Lne0/c;)Lic0/e;", "", DateTokenConverter.CONVERTER_KEY, "(Lne0/c;Lxc0/a;)Z", "a", "(Lxc0/a;)Z", "widget_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f93901a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.SUMMON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.HOME_LINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.LIGHT_SHOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.SUSPENSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.FRUNK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c.LOCK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[c.CLIMATE_TOGGLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[c.CHARGE_PORT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[c.TRUNK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[c.BIOWEAPON.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[c.SENTRY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[c.LOW_POWER_MODE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[c.VENT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[c.MAX_DEFROST.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[c.SUNROOF_CONTROL.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[c.ACTUATE_ALL_DOORS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[c.REMOTE_START.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[c.FLASH_LIGHTS.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[c.HONK_HORN.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[c.UNLATCH_DRIVER_DOOR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[c.REMOTE_BOOMBOX.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[c.TONNEAU.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[c.POWER_OUTLETS.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            f93901a = iArr;
        }
    }

    private static final boolean a(xc0.a aVar) {
        q climate_state;
        u5 vehicle_data;
        u5 vehicle_data2 = aVar.getVehicle_data();
        if (vehicle_data2 != null && (climate_state = vehicle_data2.getClimate_state()) != null) {
            q.g defrost_mode = climate_state.getDefrost_mode();
            if (e.k0(defrost_mode != null ? defrost_mode.getMax() : null)) {
                return false;
            }
            q.c climate_keeper_mode = climate_state.getClimate_keeper_mode();
            if (e.k0(climate_keeper_mode != null ? climate_keeper_mode.getDog() : null)) {
                return true;
            }
            Float inside_temp_celsius = climate_state.getInside_temp_celsius();
            if (inside_temp_celsius != null && inside_temp_celsius.floatValue() > 10.0f && ((vehicle_data = aVar.getVehicle_data()) == null || !e.S(vehicle_data))) {
                return true;
            }
        }
        return false;
    }

    public static final ic0.e b(c cVar, xc0.a vehicle) {
        o charge_state;
        u5 vehicle_data;
        s.k(cVar, "<this>");
        s.k(vehicle, "vehicle");
        if (d(cVar, vehicle)) {
            return null;
        }
        f fVar = f.SOURCE_WIDGET;
        boolean zD = l.d(cVar, vehicle);
        String vin = vehicle.getVin();
        boolean zF = false;
        switch (a.f93901a[cVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return null;
            case 5:
                return zD ? ob0.e.f97095a.v(vin, fVar, "widget_close_frunk") : ob0.e.f97095a.V(vin, fVar, "widget_open_frunk");
            case 6:
                return zD ? ob0.e.f97095a.N(vin, fVar, "widget_lock") : ob0.e.f97095a.o0(vin, fVar, "widget_unlock");
            case 7:
                return zD ? ob0.e.f97095a.n(vin, fVar, "widget_climate_off") : ob0.e.f97095a.p(vin, false, fVar, "widget_climate_on");
            case 8:
                u5 vehicle_data2 = vehicle.getVehicle_data();
                if (vehicle_data2 != null && e.d(vehicle_data2)) {
                    return ob0.e.f97095a.t(vin, fVar, "widget_close_charge_port");
                }
                u5 vehicle_data3 = vehicle.getVehicle_data();
                if (vehicle_data3 != null && e.c(vehicle_data3)) {
                    zF = true;
                }
                if (zF) {
                    return e.H(vehicle) ? ob0.e.f97095a.t(vin, fVar, "widget_close_charge_port") : ob0.e.f97095a.U(vin, fVar, "widget_open_charge_port");
                }
                return null;
            case 9:
                return ob0.e.f97095a.a(vin, fVar, "widget_actuate_trunk");
            case 10:
                return ob0.e.e(ob0.e.f97095a, vin, zD, false, fVar, "widget_bioweapon_mode", 4, null);
            case 11:
                return zD ? ob0.e.f97095a.d0(vin, fVar, "widget_sentry_off") : ob0.e.f97095a.f0(vin, fVar, "widget_sentry_on");
            case 12:
                u5 vehicle_data4 = vehicle.getVehicle_data();
                if (vehicle_data4 != null && (charge_state = vehicle_data4.getCharge_state()) != null) {
                    zF = s.f(charge_state.getLow_power_mode_forced_on(), Boolean.TRUE);
                }
                if (zF) {
                    return null;
                }
                return zD ? ob0.e.f97095a.P(vin, fVar, "widget_low_power_mode_off") : ob0.e.f97095a.Q(vin, fVar, "widget_low_power_mode_on");
            case 13:
                u5 vehicle_data5 = vehicle.getVehicle_data();
                Pair<Double, Double> pairU = vehicle_data5 != null ? e.u(vehicle_data5) : null;
                return ob0.e.f97095a.p0(vin, pairU != null ? pairU.e().doubleValue() : 0.0d, pairU != null ? pairU.f().doubleValue() : 0.0d, zD, fVar, "widget_vent_window");
            case 14:
                return ob0.e.f97095a.R(vin, !zD, false, v.m(), fVar, "widget_max_defrost");
            case 15:
                u5 vehicle_data6 = vehicle.getVehicle_data();
                if ((vehicle_data6 == null || !e.Z(vehicle_data6)) && ((vehicle_data = vehicle.getVehicle_data()) == null || !e.Y(vehicle_data))) {
                    return null;
                }
                return ob0.e.f97095a.l0(vin, !zD, fVar, "widget_sunroof");
            case 16:
                return zD ? ob0.e.f97095a.u(vin, fVar, "widget_close_doors_and_lock") : ob0.e.f97095a.T(vin, fVar, "widget_open_all_doors");
            case 17:
                return ob0.e.f97095a.Y(vin, fVar, "widget_remote_start");
            case 18:
                return ob0.e.f97095a.H(vin, fVar, "widget_flash_lights");
            case 19:
                return ob0.e.f97095a.J(vin, fVar, "widget_honk_horn");
            case 20:
                return ob0.e.f97095a.n0(vin, fVar, "widget_unlatch_driver_door");
            case 21:
                return ob0.e.f97095a.f(vin, fVar, "widget_boombox");
            case 22:
                return c(vehicle, cVar);
            case 23:
                return zD ? ob0.e.f97095a.h0(vin, fVar, "widget_power_outlets_off") : ob0.e.f97095a.i0(vin, fVar, "widget_power_outlets_on");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final ic0.e c(xc0.a aVar, c cVar) {
        if (a.f93901a[cVar.ordinal()] == 22) {
            return e.a0(aVar) ? ob0.e.f97095a.A(aVar.getVin(), f.SOURCE_WIDGET, "widget_close_tonneau") : ob0.e.f97095a.W(aVar.getVin(), f.SOURCE_WIDGET, "widget_open_tonneau");
        }
        return null;
    }

    public static final boolean d(c cVar, xc0.a appVehicle) {
        s.k(cVar, "<this>");
        s.k(appVehicle, "appVehicle");
        u5 vehicle_data = appVehicle.getVehicle_data();
        if (vehicle_data == null) {
            return false;
        }
        switch (a.f93901a[cVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return true;
            case 5:
                return e.p(appVehicle) != qf0.a.CAR_TYPE_CYBERTRUCK;
            case 6:
            case 8:
            case 10:
            case 11:
            case 15:
            case 18:
            case 19:
            default:
                return false;
            case 7:
                return (e.J(vehicle_data) && e.I(vehicle_data)) || (!e.J(vehicle_data) && e.R(vehicle_data));
            case 9:
                return (e.b0(appVehicle) || e.z(vehicle_data)) ? false : true;
            case 12:
                return !e.R(vehicle_data);
            case 13:
                return e.f0(vehicle_data);
            case 14:
                return a(appVehicle);
            case 16:
                xc0.b ble_status = appVehicle.getBle_status();
                return ble_status == null || !ble_status.getPhone_key_connected();
            case 17:
                return e.W(vehicle_data);
            case 20:
                xc0.b ble_status2 = appVehicle.getBle_status();
                return ble_status2 == null || !ble_status2.getPhone_key_connected();
        }
    }

    public static final c e(String str) {
        Object obj;
        s.k(str, "<this>");
        Object[] enumConstants = c.class.getEnumConstants();
        s.j(enumConstants, "getEnumConstants(...)");
        int length = enumConstants.length;
        for (int i11 = 0; i11 < length; i11++) {
            obj = enumConstants[i11];
            if (s.f(((Enum) obj).name(), str)) {
                return (c) ((Enum) obj);
            }
        }
        obj = null;
        return (c) ((Enum) obj);
    }
}
