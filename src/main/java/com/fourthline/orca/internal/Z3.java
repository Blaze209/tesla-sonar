package com.fourthline.orca.internal;

import android.os.Build;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.fourthline.core.internal.devicedata.AndroidDataCollectorHelper;
import com.fourthline.core.internal.devicedata.DeviceDataCollector;
import java.util.Map;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Z3 implements DeviceDataCollector {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f29965d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f29966e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AndroidDataCollectorHelper f29967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f29968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f29969c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public Z3(AndroidDataCollectorHelper helper, Map destination, boolean z11) {
        p013kotlin.jvm.internal.s.k(helper, "helper");
        p013kotlin.jvm.internal.s.k(destination, "destination");
        this.f29967a = helper;
        this.f29968b = destination;
        this.f29969c = z11;
    }

    @Override // com.fourthline.core.internal.devicedata.DeviceDataCollector
    public void startDataCollection() {
        AndroidDataCollectorHelper androidDataCollectorHelper;
        TelephonyManager telephonyManager;
        SignalStrength signalStrength;
        String str;
        CharSequence simCarrierIdName;
        if (!this.f29969c || (telephonyManager = (androidDataCollectorHelper = this.f29967a).getTelephonyManager()) == null) {
            return;
        }
        String str2 = null;
        if (androidDataCollectorHelper.isFeatureAvailable("android.hardware.telephony.subscription")) {
            switch (telephonyManager.getSimState()) {
                case 0:
                    str = "sim_state_unknown";
                    break;
                case 1:
                    str = "sim_state_absent";
                    break;
                case 2:
                    str = "sim_state_pin_required";
                    break;
                case 3:
                    str = "sim_state_puk_required";
                    break;
                case 4:
                    str = "sim_state_network_locked";
                    break;
                case 5:
                    str = "sim_state_ready";
                    break;
                case 6:
                    str = "sim_state_not_ready";
                    break;
                case 7:
                    str = "sim_state_perm_disabled";
                    break;
                case 8:
                    str = "sim_state_card_io_error";
                    break;
                case 9:
                    str = "sim_state_card_restricted";
                    break;
                default:
                    str = null;
                    break;
            }
            if (str != null) {
                this.f29968b.put("cellularSimState", str);
            }
            if (Build.VERSION.SDK_INT >= 28 && (simCarrierIdName = telephonyManager.getSimCarrierIdName()) != null) {
                this.f29968b.put("cellularCarrierName", simCarrierIdName);
            }
            this.f29968b.put("cellularCarrierId", telephonyManager.getSimOperator());
            this.f29968b.put("cellularCarrierCountry", telephonyManager.getSimCountryIso());
        }
        if (androidDataCollectorHelper.isFeatureAvailable("android.hardware.telephony.radio.access")) {
            this.f29968b.put("cellularIsRoaming", Boolean.valueOf(telephonyManager.isNetworkRoaming()));
            if (Build.VERSION.SDK_INT >= 28 && (signalStrength = telephonyManager.getSignalStrength()) != null) {
                this.f29968b.put("cellularSignalStrength", signalStrength);
            }
        }
        if (androidDataCollectorHelper.isPermissionAvailable("android.permission.READ_PHONE_STATE")) {
            int networkType = telephonyManager.getNetworkType();
            if (networkType != 20) {
                switch (networkType) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        str2 = "2g";
                        break;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        str2 = "3g";
                        break;
                    case 13:
                        str2 = "4g";
                        break;
                }
            } else {
                str2 = "5g";
            }
            if (str2 != null) {
                this.f29968b.put("cellularTechnology", str2);
            }
        }
    }
}
