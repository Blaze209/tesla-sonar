package expo.modules.battery;

import expo.modules.interfaces.permissions.PermissionsResponse;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"batteryStatusNativeToJS", "Lexpo/modules/battery/BatteryModule$BatteryState;", PermissionsResponse.STATUS_KEY, "", "expo-battery_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BatteryStatusNativeToJSKt {
    public static final BatteryModule.BatteryState batteryStatusNativeToJS(int i11) {
        if (i11 == 2) {
            return BatteryModule.BatteryState.CHARGING;
        }
        if (i11 == 3) {
            return BatteryModule.BatteryState.UNPLUGGED;
        }
        if (i11 != 4) {
            return i11 != 5 ? BatteryModule.BatteryState.UNKNOWN : BatteryModule.BatteryState.FULL;
        }
        return BatteryModule.BatteryState.UNPLUGGED;
    }
}
