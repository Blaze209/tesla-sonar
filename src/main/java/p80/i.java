package p80;

import android.os.Build;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0010\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\tJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R&\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\rR&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0015\u0010\rR&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0010\u0010\r¨\u0006\u001a"}, d2 = {"Lp80/i;", "Lp80/h;", "", "apiVersion", "Lv80/d;", "Lp80/j;", "hardwareIdSupplier", "<init>", "(ILv80/d;)V", "(Lv80/d;)V", "", "", "create", "()Ljava/util/Map;", "a", "I", "b", "Lv80/d;", "getMarketOrRegionRestrictionParams$3ds2sdk_release$annotations", "()V", "marketOrRegionRestrictionParams", "c", "getPlatformVersionParams$3ds2sdk_release$annotations", "platformVersionParams", "getPermissionParams$3ds2sdk_release$annotations", "permissionParams", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int apiVersion;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v80.d<HardwareId> hardwareIdSupplier;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lp80/i$a;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "MARKET_OR_REGION_RESTRICTION", "PLATFORM_VERSION", "PERMISSION", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum a {
        MARKET_OR_REGION_RESTRICTION("RE01"),
        PLATFORM_VERSION("RE02"),
        PERMISSION("RE03");

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
        private final String code;

        a(String str) {
            this.code = str;
        }

        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }
    }

    public i(int i11, v80.d<HardwareId> hardwareIdSupplier) {
        s.k(hardwareIdSupplier, "hardwareIdSupplier");
        this.apiVersion = i11;
        this.hardwareIdSupplier = hardwareIdSupplier;
    }

    public final Map<String, String> a() {
        HashMap map = new HashMap();
        List listP = v.p(g.PARAM_PLATFORM, g.PARAM_DEVICE_MODEL, g.PARAM_OS_NAME, g.PARAM_OS_VERSION, g.PARAM_LOCALE, g.PARAM_TIME_ZONE, g.PARAM_HARDWARE_ID, g.PARAM_SCREEN_RESOLUTION);
        for (g gVar : g.getEntries()) {
            if (!listP.contains(gVar)) {
                map.put(gVar.getCode(), a.MARKET_OR_REGION_RESTRICTION.toString());
            }
        }
        return map;
    }

    public final Map<String, String> b() {
        HashMap map = new HashMap();
        String code = g.PARAM_WIFI_MAC.getCode();
        a aVar = a.PERMISSION;
        map.put(code, aVar.toString());
        map.put(g.PARAM_WIFI_BSSID.getCode(), aVar.toString());
        map.put(g.PARAM_WIFI_SSID.getCode(), aVar.toString());
        map.put(g.PARAM_WIFI_NETWORK_ID.getCode(), aVar.toString());
        map.put(g.PARAM_WIFI_IS_5GHZ_BAND_SUPPORTED.getCode(), aVar.toString());
        map.put(g.PARAM_WIFI_IS_DEVICE_TO_AP_RTT_SUPPORTED.getCode(), aVar.toString());
        map.put(g.PARAM_WIFI_IS_ENHANCED_POWER_REPORTING_SUPPORTED.getCode(), aVar.toString());
        map.put(g.PARAM_WIFI_IS_P2P_SUPPORTED.getCode(), aVar.toString());
        map.put(g.PARAM_WIFI_IS_PREFERRED_NETWORK_OFFLOAD_SUPPORTED.getCode(), aVar.toString());
        map.put(g.PARAM_WIFI_IS_SCAN_ALWAYS_AVAILABLE.getCode(), aVar.toString());
        map.put(g.PARAM_WIFI_IS_TDLS_SUPPORTED.getCode(), aVar.toString());
        map.put(g.PARAM_LATITUDE.getCode(), aVar.toString());
        map.put(g.PARAM_LONGITUDE.getCode(), aVar.toString());
        if (!this.hardwareIdSupplier.get().b()) {
            map.put(g.PARAM_HARDWARE_ID.getCode(), a.PLATFORM_VERSION.toString());
        }
        map.put(g.PARAM_DEVICE_NAME.getCode(), aVar.toString());
        map.put(g.PARAM_BLUETOOTH_ADDRESS.getCode(), aVar.toString());
        map.put(g.PARAM_BLUETOOTH_BONDED_DEVICE.getCode(), aVar.toString());
        map.put(g.PARAM_BLUETOOTH_IS_ENABLED.getCode(), aVar.toString());
        map.put(g.PARAM_TELE_DEVICE_ID.getCode(), aVar.toString());
        map.put(g.PARAM_TELE_SUBSCRIBER_ID.getCode(), aVar.toString());
        map.put(g.PARAM_TELE_IMEI_SV.getCode(), aVar.toString());
        map.put(g.PARAM_TELE_GROUP_IDENTIFIER_L1.getCode(), aVar.toString());
        map.put(g.PARAM_TELE_SIM_SERIAL_NUMBER.getCode(), aVar.toString());
        map.put(g.PARAM_TELE_VOICE_MAIL_ALPHA_TAG.getCode(), aVar.toString());
        map.put(g.PARAM_TELE_VOICE_MAIL_NUMBER.getCode(), aVar.toString());
        map.put(g.PARAM_TELE_IS_TTY_MODE_SUPPORTED.getCode(), aVar.toString());
        map.put(g.PARAM_TELE_IS_WORLD_PHONE.getCode(), aVar.toString());
        map.put(g.PARAM_BUILD_SERIAL.getCode(), aVar.toString());
        map.put(g.PARAM_SECURE_INSTALL_NON_MARKET_APPS.getCode(), aVar.toString());
        return map;
    }

    public final Map<String, String> c() {
        HashMap map = new HashMap();
        if (this.apiVersion < 26) {
            String code = g.PARAM_TELE_IMEI_SV.getCode();
            a aVar = a.PLATFORM_VERSION;
            map.put(code, aVar.toString());
            map.put(g.PARAM_BUILD_SERIAL.getCode(), aVar.toString());
            map.put(g.PARAM_SECURE_INSTALL_NON_MARKET_APPS.getCode(), aVar.toString());
        }
        if (this.apiVersion < 23) {
            String code2 = g.PARAM_TELE_PHONE_COUNT.getCode();
            a aVar2 = a.PLATFORM_VERSION;
            map.put(code2, aVar2.toString());
            map.put(g.PARAM_TELE_IS_HEARING_AID_COMPATIBILITY_SUPPORTED.getCode(), aVar2.toString());
            map.put(g.PARAM_TELE_IS_TTY_MODE_SUPPORTED.getCode(), aVar2.toString());
            map.put(g.PARAM_TELE_IS_WORLD_PHONE.getCode(), aVar2.toString());
            map.put(g.PARAM_BUILD_VERSION_PREVIEW_SDK_INT.getCode(), aVar2.toString());
            map.put(g.PARAM_BUILD_VERSION_SDK_INT.getCode(), aVar2.toString());
            map.put(g.PARAM_BUILD_VERSION_SECURITY_PATCH.getCode(), aVar2.toString());
            map.put(g.PARAM_SYSTEM_DTMF_TONE_TYPE_WHEN_DIALING.getCode(), aVar2.toString());
            map.put(g.PARAM_SYSTEM_VIBRATE_WHEN_RINGING.getCode(), aVar2.toString());
        }
        if (this.apiVersion > 23) {
            map.put(g.PARAM_SECURE_SYS_PROP_SETTING_VERSION.getCode(), a.PLATFORM_VERSION.toString());
        }
        if (this.apiVersion < 22) {
            map.put(g.PARAM_TELE_IS_VOICE_CAPABLE.getCode(), a.PLATFORM_VERSION.toString());
        }
        return map;
    }

    @Override // p80.h
    public Map<String, String> create() {
        return v0.r(v0.r(a(), c()), b());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(v80.d<HardwareId> hardwareIdSupplier) {
        this(Build.VERSION.SDK_INT, hardwareIdSupplier);
        s.k(hardwareIdSupplier, "hardwareIdSupplier");
    }
}
