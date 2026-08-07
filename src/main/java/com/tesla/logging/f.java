package com.tesla.logging;

import java.util.HashSet;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0010j\b\u0012\u0004\u0012\u00020\u0006`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/tesla/logging/f;", "Lvr0/a$a;", "<init>", "()V", "", "priority", "", "tag", "message", "", "t", "Ljn0/h0;", "j", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "o", "(Ljava/lang/String;)V", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "f", "Ljava/util/HashSet;", "whitelist", "logging_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f extends vr0.a.C2564a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f56375e = new f();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final HashSet<String> whitelist = d1.e("[MainApplication]", "[MainActivity]", "[AppStateLifecycleObserver]", "[BLEService]", "[BLEVehicleController]", "[BLEBootReceiver]", "[BLEModuleHelper]", "[BLEModuleHelper] [TMBLE Module]", "[BLEService][SignificantMotionListener]", "[SignificantMotionListener]", "[BluetoothStateHelper]", "[PeripheralWriteListener]", "[DeviceMotionEventManager]", "[MotionEventManager]", "[VehicleController]", "[BLE][PhoneKeyUtils]", "[PhoneKeyUtils]", "[PhoneKeySettingRepository]", "[PhoneKeyAuthEngine]", "[AuthState]", "[AuthEngine]", "[OemWallet]", "[OemWallet][HonorWallet]", "[OemWallet][OppoWallet]", "[OemWallet][VivoWallet]", "[OemWallet][MiWallet]", "[OemWallet][SamsungWallet]", "[Uwb]", "[UwbAvailabilityHelper]", "[UwbCapabilityHelper]", "[UwbUpgradeHelper]", "[Uwb][BLEOutOfBandConnector]", "[Uwb][SessionScopeManager]", "[Uwb][RangingController]");

    private f() {
    }

    @Override // vr0.a.C2564a, vr0.a.c
    protected void j(int priority, String tag, String message, Throwable t11) {
        s.k(message, "message");
        if ((tag != null && t.h0(tag, "[JS", false, 2, null)) || priority == 2 || priority == 3) {
            return;
        }
        if (tag == null || whitelist.contains(t.F1(tag).toString())) {
            super.j(priority, e.f56373a.c(tag != null ? t.F1(tag).toString() : null), t.F1(message).toString(), t11);
        }
    }

    public final void o(String tag) {
        s.k(tag, "tag");
        whitelist.add(tag);
    }
}
