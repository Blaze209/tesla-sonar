package jf0;

import android.content.Context;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import fc0.u5;
import gc0.a1;
import gc0.u0;
import ie0.q0;
import ie0.y;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import td0.m;
import td0.r;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\rJ\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\"\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\"¨\u0006$"}, d2 = {"Ljf0/d;", "", "<init>", "()V", "", "vin", "", "forceEnable", "j", "(Ljava/lang/String;Z)Z", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "e", "(Landroid/content/Context;)Z", DateTokenConverter.CONVERTER_KEY, "f", "()Z", "h", "g", "a", "c", "()Ljava/lang/Boolean;", "b", "(Ljava/lang/String;)Ljava/lang/Boolean;", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "vehicleSupportsUwbMap", "Ljava/lang/Boolean;", "deviceSupportsUwb", "uwbDeviceSupportsBackgroundRanging", "", "Ljava/util/List;", "backgroundRangingBlackList", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static Boolean deviceSupportsUwb;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static Boolean uwbDeviceSupportsBackgroundRanging;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f83669a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("UwbAvailabilityHelper");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final ConcurrentHashMap<String, Boolean> vehicleSupportsUwbMap = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static List<String> backgroundRangingBlackList = v.p("SM-N986", "SM-F916", "Pixel 6", "Pixel 7");

    private d() {
    }

    private final boolean a(Context context) {
        List<String> list = backgroundRangingBlackList;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (String str : list) {
                String MODEL = Build.MODEL;
                s.j(MODEL, "MODEL");
                if (t.h0(MODEL, str, false, 2, null)) {
                    return false;
                }
            }
        }
        y yVar = y.f77624a;
        if (yVar.b()) {
            return true;
        }
        if (yVar.h()) {
            if (f.a(context)) {
                return Build.VERSION.SDK_INT > 33;
            }
            if (Build.VERSION.SDK_INT > 34) {
                return true;
            }
        }
        return false;
    }

    private final Boolean b(String vin) {
        Integer api_version;
        u0.d car_type;
        u5 u5VarD = be0.e.INSTANCE.a().d(vin);
        if (u5VarD == null) {
            return null;
        }
        if (!r.e() && !vb0.c.c(u5VarD, gc0.v.MOBILE_APP_FEATURE_ANDROID_UWB_ENABLED, null, 2, null)) {
            return Boolean.FALSE;
        }
        a1 vehicle_state = u5VarD.getVehicle_state();
        if (vehicle_state == null || (api_version = vehicle_state.getApi_version()) == null) {
            return null;
        }
        int iIntValue = api_version.intValue();
        com.tesla.logging.g gVar = logger;
        gVar.j(q0.f(vin) + " api version: " + iIntValue);
        if (iIntValue >= 77) {
            u0 vehicle_config = u5VarD.getVehicle_config();
            if (vehicle_config == null || (car_type = vehicle_config.getCar_type()) == null) {
                return null;
            }
            u0 vehicle_config2 = u5VarD.getVehicle_config();
            boolean zV = vehicle_config2 != null ? wb0.e.V(vehicle_config2) : false;
            u0 vehicle_config3 = u5VarD.getVehicle_config();
            boolean zF = vehicle_config3 != null ? wb0.e.F(vehicle_config3) : false;
            gVar.j(q0.f(vin) + " carType: " + car_type + ", isPoppyseed: " + zV + ", isBayberry: " + zF);
            if ((wb0.e.k0(car_type.getCarTypeModel3()) && zV) || ((wb0.e.k0(car_type.getCarTypeModelY()) && zF) || wb0.e.k0(car_type.getCarTypeLychee()) || wb0.e.k0(car_type.getCarTypeTamarind()) || wb0.e.k0(car_type.getCarTypeCybertruck()))) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public static final Boolean c() {
        try {
            String strH = m.j().h("UWB_CLIENT_AVAILABLE");
            if (strH != null) {
                return t.E1(strH);
            }
            return null;
        } catch (Exception e11) {
            logger.j("error at checkUWBClientAvailability " + e11.getMessage());
            return Boolean.FALSE;
        }
    }

    private final boolean d(Context context) {
        if (deviceSupportsUwb == null) {
            Boolean boolValueOf = Boolean.valueOf(f() && h(context));
            deviceSupportsUwb = boolValueOf;
            logger.j("isDeviceSupportUwb: " + boolValueOf);
        }
        return s.f(deviceSupportsUwb, Boolean.TRUE);
    }

    public static final boolean e(Context context) {
        s.k(context, "context");
        d dVar = f83669a;
        return dVar.d(context) && dVar.g(context);
    }

    private final boolean f() {
        return Build.VERSION.SDK_INT >= 31;
    }

    private final boolean g(Context context) {
        if (!d(context)) {
            return false;
        }
        if (uwbDeviceSupportsBackgroundRanging == null) {
            Boolean boolValueOf = Boolean.valueOf(a(context));
            uwbDeviceSupportsBackgroundRanging = boolValueOf;
            logger.j("isUwbBackgroundAvailable: " + boolValueOf);
        }
        return s.f(uwbDeviceSupportsBackgroundRanging, Boolean.TRUE);
    }

    private final boolean h(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.uwb");
    }

    public static final boolean i(String vin) {
        s.k(vin, "vin");
        return k(vin, false, 2, null);
    }

    public static final boolean j(String vin, boolean forceEnable) {
        s.k(vin, "vin");
        if (forceEnable) {
            vehicleSupportsUwbMap.put(vin, Boolean.TRUE);
            logger.j(q0.f(vin) + " is vehicle uwb available force enable: true");
            return true;
        }
        ConcurrentHashMap<String, Boolean> concurrentHashMap = vehicleSupportsUwbMap;
        Boolean boolB = concurrentHashMap.get(vin);
        if (boolB == null) {
            boolB = f83669a.b(vin);
            if (boolB != null) {
                concurrentHashMap.put(vin, boolB);
            } else {
                concurrentHashMap.remove(vin);
            }
            logger.j(q0.f(vin) + " is vehicle uwb available: " + boolB);
        }
        if (boolB != null) {
            return boolB.booleanValue();
        }
        return false;
    }

    public static /* synthetic */ boolean k(String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return j(str, z11);
    }
}
