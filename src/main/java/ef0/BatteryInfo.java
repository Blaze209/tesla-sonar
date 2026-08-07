package ef0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import vc0.j2;
import vc0.v;

/* JADX INFO: renamed from: ef0.b, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Lef0/b;", "", "", "level", "Lvc0/v;", "state", "Lvc0/j2;", "thermalState", "", "lowPowerModeEnabled", "<init>", "(ILvc0/v;Lvc0/j2;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lvc0/v;", "c", "()Lvc0/v;", "Lvc0/j2;", DateTokenConverter.CONVERTER_KEY, "()Lvc0/j2;", "Z", "()Z", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class BatteryInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int level;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final v state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final j2 thermalState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean lowPowerModeEnabled;

    public BatteryInfo(int i11, v state, j2 thermalState, boolean z11) {
        s.k(state, "state");
        s.k(thermalState, "thermalState");
        this.level = i11;
        this.state = state;
        this.thermalState = thermalState;
        this.lowPowerModeEnabled = z11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getLowPowerModeEnabled() {
        return this.lowPowerModeEnabled;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final v getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final j2 getThermalState() {
        return this.thermalState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BatteryInfo)) {
            return false;
        }
        BatteryInfo batteryInfo = (BatteryInfo) other;
        return this.level == batteryInfo.level && this.state == batteryInfo.state && this.thermalState == batteryInfo.thermalState && this.lowPowerModeEnabled == batteryInfo.lowPowerModeEnabled;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.level) * 31) + this.state.hashCode()) * 31) + this.thermalState.hashCode()) * 31) + Boolean.hashCode(this.lowPowerModeEnabled);
    }

    public String toString() {
        return "BatteryInfo(level=" + this.level + ", state=" + this.state + ", thermalState=" + this.thermalState + ", lowPowerModeEnabled=" + this.lowPowerModeEnabled + ")";
    }
}
