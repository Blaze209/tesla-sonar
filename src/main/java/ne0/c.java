package ne0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ec0.h0;
import fc0.u5;
import gc0.o;
import gc0.u0;
import me0.e;
import me0.z;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.s;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'CLIMATE_TOGGLE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&¨\u0006'"}, d2 = {"Lne0/c;", "", "", "disableIcon", "enableIcon", "<init>", "(Ljava/lang/String;III)V", "", "enabled", "Lfc0/u5;", "vehicleData", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "getIcon", "(ZLfc0/u5;Landroid/content/Context;)I", "I", "LOCK", "CLIMATE_TOGGLE", "CHARGE_PORT", "FRUNK", "TRUNK", "BIOWEAPON", "SUMMON", "LIGHT_SHOW", "SUSPENSION", "LOW_POWER_MODE", "REMOTE_START", "FLASH_LIGHTS", "HONK_HORN", "HOME_LINK", "SENTRY", "VENT", "MAX_DEFROST", "SUNROOF_CONTROL", "ACTUATE_ALL_DOORS", "UNLATCH_DRIVER_DOOR", "REMOTE_BOOMBOX", "TONNEAU", "POWER_OUTLETS", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ACTUATE_ALL_DOORS;
    public static final c BIOWEAPON;
    public static final c CHARGE_PORT;
    public static final c CLIMATE_TOGGLE;
    public static final c FLASH_LIGHTS;
    public static final c FRUNK;
    public static final c HOME_LINK;
    public static final c HONK_HORN;
    public static final c LIGHT_SHOW;
    public static final c LOCK = new c("LOCK", 0, e.B, e.S);
    public static final c LOW_POWER_MODE;
    public static final c MAX_DEFROST;
    public static final c POWER_OUTLETS;
    public static final c REMOTE_BOOMBOX;
    public static final c REMOTE_START;
    public static final c SENTRY;
    public static final c SUMMON;
    public static final c SUNROOF_CONTROL;
    public static final c SUSPENSION;
    public static final c TONNEAU;
    public static final c TRUNK;
    public static final c UNLATCH_DRIVER_DOOR;
    public static final c VENT;
    private final int disableIcon;
    private final int enableIcon;

    private static final /* synthetic */ c[] $values() {
        return new c[]{LOCK, CLIMATE_TOGGLE, CHARGE_PORT, FRUNK, TRUNK, BIOWEAPON, SUMMON, LIGHT_SHOW, SUSPENSION, LOW_POWER_MODE, REMOTE_START, FLASH_LIGHTS, HONK_HORN, HOME_LINK, SENTRY, VENT, MAX_DEFROST, SUNROOF_CONTROL, ACTUATE_ALL_DOORS, UNLATCH_DRIVER_DOOR, REMOTE_BOOMBOX, TONNEAU, POWER_OUTLETS};
    }

    static {
        int i11 = e.f91873u;
        CLIMATE_TOGGLE = new c("CLIMATE_TOGGLE", 1, i11, i11);
        int i12 = e.f91872t;
        CHARGE_PORT = new c("CHARGE_PORT", 2, i12, i12);
        int i13 = e.f91876x;
        FRUNK = new c("FRUNK", 3, i13, i13);
        int i14 = e.P;
        TRUNK = new c("TRUNK", 4, i14, i14);
        int i15 = e.f91871s;
        BIOWEAPON = new c("BIOWEAPON", 5, i15, i15);
        int i16 = e.L;
        SUMMON = new c("SUMMON", 6, i16, i16);
        int i17 = e.A;
        LIGHT_SHOW = new c("LIGHT_SHOW", 7, i17, i17);
        int i18 = e.M;
        SUSPENSION = new c("SUSPENSION", 8, i18, i18);
        LOW_POWER_MODE = new c("LOW_POWER_MODE", 9, e.C, e.D);
        int i19 = e.I;
        REMOTE_START = new c("REMOTE_START", 10, i19, i19);
        int i21 = e.f91875w;
        FLASH_LIGHTS = new c("FLASH_LIGHTS", 11, i21, i21);
        int i22 = e.f91878z;
        HONK_HORN = new c("HONK_HORN", 12, i22, i22);
        int i23 = e.f91877y;
        HOME_LINK = new c("HOME_LINK", 13, i23, i23);
        SENTRY = new c("SENTRY", 14, e.J, e.K);
        int i24 = e.T;
        VENT = new c("VENT", 15, i24, i24);
        int i25 = e.E;
        MAX_DEFROST = new c("MAX_DEFROST", 16, i25, i25);
        SUNROOF_CONTROL = new c("SUNROOF_CONTROL", 17, e.U, e.f91874v);
        int i26 = e.f91870r;
        ACTUATE_ALL_DOORS = new c("ACTUATE_ALL_DOORS", 18, i26, i26);
        int i27 = e.Q;
        UNLATCH_DRIVER_DOOR = new c("UNLATCH_DRIVER_DOOR", 19, i27, i27);
        int i28 = e.H;
        REMOTE_BOOMBOX = new c("REMOTE_BOOMBOX", 20, i28, i28);
        TONNEAU = new c("TONNEAU", 21, e.N, e.O);
        int i29 = e.G;
        POWER_OUTLETS = new c("POWER_OUTLETS", 22, i29, i29);
        c[] cVarArr$values = $values();
        $VALUES = cVarArr$values;
        $ENTRIES = on0.a.a(cVarArr$values);
    }

    private c(String str, int i11, int i12, int i13) {
        super(str, i11);
        this.disableIcon = i12;
        this.enableIcon = i13;
    }

    public static EnumEntries<c> getEntries() {
        return $ENTRIES;
    }

    private static final int getIcon$getNormalIcon(boolean z11, Context context, u0.d dVar, c cVar) {
        return z11 ? z.h(z.f92041a, context, dVar, cVar.enableIcon, null, false, 24, null) : z.h(z.f92041a, context, dVar, cVar.disableIcon, null, false, 24, null);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final int getIcon(boolean enabled, u5 vehicleData, Context context) {
        u0.d dVar;
        o charge_state;
        o charge_state2;
        o charge_state3;
        u0.d car_type;
        u0.d car_type2;
        u0.d car_type3;
        u0.d car_type4;
        u0.d car_type5;
        u0.d car_type6;
        s.k(context, "context");
        h0 carTypeModelY = null;
        u0 vehicle_config = vehicleData != null ? vehicleData.getVehicle_config() : null;
        if (vehicle_config == null || (dVar = vehicle_config.getCar_type()) == null) {
            dVar = new u0.d(null, null, null, null, null, null, null, null, null, null, 1023, null);
        }
        if (this == SUMMON) {
            if (vehicle_config == null || (car_type6 = vehicle_config.getCar_type()) == null || !wb0.e.T(car_type6) || !wb0.e.B(vehicle_config)) {
                return ((vehicle_config == null || (car_type5 = vehicle_config.getCar_type()) == null || !wb0.e.T(car_type5)) && (vehicle_config == null || !wb0.e.V(vehicle_config)) && (vehicle_config == null || !wb0.e.F(vehicle_config))) ? getIcon$getNormalIcon(enabled, context, dVar, this) : ub0.a.f116085n;
            }
            return ub0.a.f116092u;
        }
        if (wb0.e.k0((vehicle_config == null || (car_type4 = vehicle_config.getCar_type()) == null) ? null : car_type4.getCarTypeSemiTruck()) && this == FRUNK) {
            return ub0.a.f116078g;
        }
        boolean zF = false;
        if (this == UNLATCH_DRIVER_DOOR) {
            if (vehicle_config != null && wb0.e.V(vehicle_config) && !s.f(vehicle_config.getRhd(), Boolean.TRUE)) {
                return ub0.a.f116088q;
            }
            if (vehicle_config != null && wb0.e.V(vehicle_config) && s.f(vehicle_config.getRhd(), Boolean.TRUE)) {
                return ub0.a.f116091t;
            }
            if (vehicle_config != null && wb0.e.F(vehicle_config) && !s.f(vehicle_config.getRhd(), Boolean.TRUE)) {
                return wb0.e.L(vehicle_config) ? ub0.a.f116087p : ub0.a.f116086o;
            }
            if (vehicle_config != null && wb0.e.F(vehicle_config) && s.f(vehicle_config.getRhd(), Boolean.TRUE)) {
                return wb0.e.L(vehicle_config) ? ub0.a.f116090s : ub0.a.f116089r;
            }
            return !(vehicle_config != null ? s.f(vehicle_config.getRhd(), Boolean.TRUE) : false) ? z.h(z.f92041a, context, dVar, e.Q, null, false, 24, null) : z.h(z.f92041a, context, dVar, e.R, null, false, 24, null);
        }
        if (this == MAX_DEFROST) {
            if (wb0.e.k0((vehicle_config == null || (car_type3 = vehicle_config.getCar_type()) == null) ? null : car_type3.getCarTypeSemiTruck())) {
                return ub0.a.f116077f;
            }
            if (wb0.e.k0((vehicle_config == null || (car_type2 = vehicle_config.getCar_type()) == null) ? null : car_type2.getCarTypeModel3())) {
                return vehicle_config != null && wb0.e.V(vehicle_config) ? ub0.a.f116076e : ub0.a.f116074c;
            }
            if (vehicle_config != null && (car_type = vehicle_config.getCar_type()) != null) {
                carTypeModelY = car_type.getCarTypeModelY();
            }
            if (!wb0.e.k0(carTypeModelY)) {
                return getIcon$getNormalIcon(enabled, context, dVar, this);
            }
            if (vehicle_config != null && wb0.e.F(vehicle_config)) {
                return wb0.e.L(vehicle_config) ? ub0.a.f116075d : ub0.a.f116073b;
            }
            return ub0.a.f116074c;
        }
        if (this != LOW_POWER_MODE) {
            return getIcon$getNormalIcon(enabled, context, dVar, this);
        }
        if ((vehicleData == null || (charge_state3 = vehicleData.getCharge_state()) == null) ? false : s.f(charge_state3.getLow_power_mode_forced_on(), Boolean.TRUE)) {
            return wb0.e.k0(dVar.getCarTypeCybertruck()) ? ub0.a.f116084m : ub0.a.f116083l;
        }
        if ((vehicleData == null || (charge_state2 = vehicleData.getCharge_state()) == null) ? false : s.f(charge_state2.getLow_power_mode(), Boolean.TRUE)) {
            return wb0.e.k0(dVar.getCarTypeCybertruck()) ? ub0.a.f116082k : ub0.a.f116081j;
        }
        if (vehicleData != null && (charge_state = vehicleData.getCharge_state()) != null) {
            zF = s.f(charge_state.getLow_power_mode(), Boolean.FALSE);
        }
        if (zF) {
            return wb0.e.k0(dVar.getCarTypeCybertruck()) ? ub0.a.f116080i : ub0.a.f116079h;
        }
        return getIcon$getNormalIcon(enabled, context, dVar, this);
    }
}
