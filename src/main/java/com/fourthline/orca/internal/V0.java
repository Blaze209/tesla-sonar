package com.fourthline.orca.internal;

import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import com.fourthline.core.internal.devicedata.AndroidDataCollectorHelper;
import com.fourthline.core.internal.devicedata.DeviceDataCollector;
import java.util.Map;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class V0 implements DeviceDataCollector {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f28947d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f28948e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AndroidDataCollectorHelper f28949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f28950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f28951c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public V0(AndroidDataCollectorHelper helper, Map destination, boolean z11) {
        p013kotlin.jvm.internal.s.k(helper, "helper");
        p013kotlin.jvm.internal.s.k(destination, "destination");
        this.f28949a = helper;
        this.f28950b = destination;
        this.f28951c = z11;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    @Override // com.fourthline.core.internal.devicedata.DeviceDataCollector
    public void startDataCollection() {
        if (this.f28951c) {
            AndroidDataCollectorHelper androidDataCollectorHelper = this.f28949a;
            BatteryManager batteryManager = androidDataCollectorHelper.getBatteryManager();
            if (batteryManager != null) {
                this.f28950b.put("batteryChargeLevel", Double.valueOf(((double) batteryManager.getIntProperty(4)) / 100.0d));
                Map map = this.f28950b;
                String str = "charging";
                if (Build.VERSION.SDK_INT >= 26) {
                    int intProperty = batteryManager.getIntProperty(6);
                    if (intProperty == 1) {
                        str = "unknown";
                    } else if (intProperty != 2) {
                        if (intProperty == 3) {
                            str = "discharging";
                        } else if (intProperty == 4) {
                            str = "unplugged";
                        } else if (intProperty != 5) {
                            str = "unknown";
                        } else {
                            str = "full";
                        }
                    }
                } else if (!batteryManager.isCharging()) {
                    str = "unknown";
                }
                map.put("batteryChargingState", str);
            }
            PowerManager powerManager = androidDataCollectorHelper.getPowerManager();
            if (powerManager != null) {
                this.f28950b.put("batteryIsInLowPowerMode", Boolean.valueOf(powerManager.isPowerSaveMode()));
            }
        }
    }
}
