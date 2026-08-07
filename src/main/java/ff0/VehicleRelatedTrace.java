package ff0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import vc0.d2;

/* JADX INFO: renamed from: ff0.n, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u001bR\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001f\u0010\u001b¨\u0006 "}, d2 = {"Lff0/n;", "", "Lvc0/d2;", "peripheralState", "", "GATTDiscoveryBitmask", "timeSinceLastMessageCurrentSession", "timeSinceLastMessageAckCurrentSession", "<init>", "(Lvc0/d2;III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvc0/d2;", "b", "()Lvc0/d2;", "f", "(Lvc0/d2;)V", "I", "e", "(I)V", "c", DateTokenConverter.CONVERTER_KEY, "h", "g", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class VehicleRelatedTrace {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private d2 peripheralState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private int GATTDiscoveryBitmask;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private int timeSinceLastMessageCurrentSession;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private int timeSinceLastMessageAckCurrentSession;

    public VehicleRelatedTrace(d2 peripheralState, int i11, int i12, int i13) {
        s.k(peripheralState, "peripheralState");
        this.peripheralState = peripheralState;
        this.GATTDiscoveryBitmask = i11;
        this.timeSinceLastMessageCurrentSession = i12;
        this.timeSinceLastMessageAckCurrentSession = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getGATTDiscoveryBitmask() {
        return this.GATTDiscoveryBitmask;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d2 getPeripheralState() {
        return this.peripheralState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getTimeSinceLastMessageAckCurrentSession() {
        return this.timeSinceLastMessageAckCurrentSession;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getTimeSinceLastMessageCurrentSession() {
        return this.timeSinceLastMessageCurrentSession;
    }

    public final void e(int i11) {
        this.GATTDiscoveryBitmask = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleRelatedTrace)) {
            return false;
        }
        VehicleRelatedTrace vehicleRelatedTrace = (VehicleRelatedTrace) other;
        return this.peripheralState == vehicleRelatedTrace.peripheralState && this.GATTDiscoveryBitmask == vehicleRelatedTrace.GATTDiscoveryBitmask && this.timeSinceLastMessageCurrentSession == vehicleRelatedTrace.timeSinceLastMessageCurrentSession && this.timeSinceLastMessageAckCurrentSession == vehicleRelatedTrace.timeSinceLastMessageAckCurrentSession;
    }

    public final void f(d2 d2Var) {
        s.k(d2Var, "<set-?>");
        this.peripheralState = d2Var;
    }

    public final void g(int i11) {
        this.timeSinceLastMessageAckCurrentSession = i11;
    }

    public final void h(int i11) {
        this.timeSinceLastMessageCurrentSession = i11;
    }

    public int hashCode() {
        return (((((this.peripheralState.hashCode() * 31) + Integer.hashCode(this.GATTDiscoveryBitmask)) * 31) + Integer.hashCode(this.timeSinceLastMessageCurrentSession)) * 31) + Integer.hashCode(this.timeSinceLastMessageAckCurrentSession);
    }

    public String toString() {
        return "VehicleRelatedTrace(peripheralState=" + this.peripheralState + ", GATTDiscoveryBitmask=" + this.GATTDiscoveryBitmask + ", timeSinceLastMessageCurrentSession=" + this.timeSinceLastMessageCurrentSession + ", timeSinceLastMessageAckCurrentSession=" + this.timeSinceLastMessageAckCurrentSession + ")";
    }

    public /* synthetic */ VehicleRelatedTrace(d2 d2Var, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? d2.PERIPHERALSTATE_SNA : d2Var, (i14 & 2) != 0 ? 0 : i11, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
    }
}
