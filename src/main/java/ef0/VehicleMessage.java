package ef0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import vc0.w0;
import vc0.z2;

/* JADX INFO: renamed from: ef0.n, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ>\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$¨\u0006%"}, d2 = {"Lef0/n;", "", "Lvc0/z2;", "toVCSECMessage", "Lvc0/w0;", "fromVCSECMessage", "Lsc0/h;", "routableMessage", "", "receivedBytesTimestamp", "<init>", "(Lvc0/z2;Lvc0/w0;Lsc0/h;J)V", "a", "(Lvc0/z2;Lvc0/w0;Lsc0/h;J)Lef0/n;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lvc0/z2;", "f", "()Lvc0/z2;", "b", "Lvc0/w0;", "c", "()Lvc0/w0;", "Lsc0/h;", "e", "()Lsc0/h;", DateTokenConverter.CONVERTER_KEY, "J", "()J", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class VehicleMessage {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final z2 toVCSECMessage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final w0 fromVCSECMessage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final sc0.h routableMessage;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long receivedBytesTimestamp;

    public VehicleMessage() {
        this(null, null, null, 0L, 15, null);
    }

    public static /* synthetic */ VehicleMessage b(VehicleMessage vehicleMessage, z2 z2Var, w0 w0Var, sc0.h hVar, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z2Var = vehicleMessage.toVCSECMessage;
        }
        if ((i11 & 2) != 0) {
            w0Var = vehicleMessage.fromVCSECMessage;
        }
        if ((i11 & 4) != 0) {
            hVar = vehicleMessage.routableMessage;
        }
        if ((i11 & 8) != 0) {
            j11 = vehicleMessage.receivedBytesTimestamp;
        }
        sc0.h hVar2 = hVar;
        return vehicleMessage.a(z2Var, w0Var, hVar2, j11);
    }

    public final VehicleMessage a(z2 toVCSECMessage, w0 fromVCSECMessage, sc0.h routableMessage, long receivedBytesTimestamp) {
        return new VehicleMessage(toVCSECMessage, fromVCSECMessage, routableMessage, receivedBytesTimestamp);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final w0 getFromVCSECMessage() {
        return this.fromVCSECMessage;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getReceivedBytesTimestamp() {
        return this.receivedBytesTimestamp;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final sc0.h getRoutableMessage() {
        return this.routableMessage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleMessage)) {
            return false;
        }
        VehicleMessage vehicleMessage = (VehicleMessage) other;
        return s.f(this.toVCSECMessage, vehicleMessage.toVCSECMessage) && s.f(this.fromVCSECMessage, vehicleMessage.fromVCSECMessage) && s.f(this.routableMessage, vehicleMessage.routableMessage) && this.receivedBytesTimestamp == vehicleMessage.receivedBytesTimestamp;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final z2 getToVCSECMessage() {
        return this.toVCSECMessage;
    }

    public int hashCode() {
        z2 z2Var = this.toVCSECMessage;
        int iHashCode = (z2Var == null ? 0 : z2Var.hashCode()) * 31;
        w0 w0Var = this.fromVCSECMessage;
        int iHashCode2 = (iHashCode + (w0Var == null ? 0 : w0Var.hashCode())) * 31;
        sc0.h hVar = this.routableMessage;
        return ((iHashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31) + Long.hashCode(this.receivedBytesTimestamp);
    }

    public String toString() {
        return "VehicleMessage(toVCSECMessage=" + this.toVCSECMessage + ", fromVCSECMessage=" + this.fromVCSECMessage + ", routableMessage=" + this.routableMessage + ", receivedBytesTimestamp=" + this.receivedBytesTimestamp + ")";
    }

    public VehicleMessage(z2 z2Var, w0 w0Var, sc0.h hVar, long j11) {
        this.toVCSECMessage = z2Var;
        this.fromVCSECMessage = w0Var;
        this.routableMessage = hVar;
        this.receivedBytesTimestamp = j11;
    }

    public /* synthetic */ VehicleMessage(z2 z2Var, w0 w0Var, sc0.h hVar, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : z2Var, (i11 & 2) != 0 ? null : w0Var, (i11 & 4) != 0 ? null : hVar, (i11 & 8) != 0 ? -1L : j11);
    }
}
