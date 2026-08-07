package be0;

import fc0.u5;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: be0.g, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lbe0/g;", "", "", "vehicleId", "Lfc0/u5;", "vehicleData", "<init>", "(Ljava/lang/String;Lfc0/u5;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lfc0/u5;", "()Lfc0/u5;", "repository_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class VehicleDataInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String vehicleId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final u5 vehicleData;

    public VehicleDataInfo(String vehicleId, u5 vehicleData) {
        s.k(vehicleId, "vehicleId");
        s.k(vehicleData, "vehicleData");
        this.vehicleId = vehicleId;
        this.vehicleData = vehicleData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final u5 getVehicleData() {
        return this.vehicleData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getVehicleId() {
        return this.vehicleId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleDataInfo)) {
            return false;
        }
        VehicleDataInfo vehicleDataInfo = (VehicleDataInfo) other;
        return s.f(this.vehicleId, vehicleDataInfo.vehicleId) && s.f(this.vehicleData, vehicleDataInfo.vehicleData);
    }

    public int hashCode() {
        return (this.vehicleId.hashCode() * 31) + this.vehicleData.hashCode();
    }

    public String toString() {
        return "VehicleDataInfo(vehicleId=" + this.vehicleId + ", vehicleData=" + this.vehicleData + ")";
    }
}
