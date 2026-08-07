package com.tesla.oapi;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/tesla/oapi/SeatCoolingBody;", "", "seatPosition", "Lcom/tesla/oapi/SeatPosition;", "seatCoolerLevel", "Lcom/tesla/oapi/CoolingLevel;", "<init>", "(Lcom/tesla/oapi/SeatPosition;Lcom/tesla/oapi/CoolingLevel;)V", "getSeatPosition", "()Lcom/tesla/oapi/SeatPosition;", "getSeatCoolerLevel", "()Lcom/tesla/oapi/CoolingLevel;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SeatCoolingBody {

    @g(name = "seat_cooler_level")
    private final CoolingLevel seatCoolerLevel;

    @g(name = "seat_position")
    private final SeatPosition seatPosition;

    public SeatCoolingBody(SeatPosition seatPosition, CoolingLevel seatCoolerLevel) {
        s.k(seatPosition, "seatPosition");
        s.k(seatCoolerLevel, "seatCoolerLevel");
        this.seatPosition = seatPosition;
        this.seatCoolerLevel = seatCoolerLevel;
    }

    public static /* synthetic */ SeatCoolingBody copy$default(SeatCoolingBody seatCoolingBody, SeatPosition seatPosition, CoolingLevel coolingLevel, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            seatPosition = seatCoolingBody.seatPosition;
        }
        if ((i11 & 2) != 0) {
            coolingLevel = seatCoolingBody.seatCoolerLevel;
        }
        return seatCoolingBody.copy(seatPosition, coolingLevel);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SeatPosition getSeatPosition() {
        return this.seatPosition;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CoolingLevel getSeatCoolerLevel() {
        return this.seatCoolerLevel;
    }

    public final SeatCoolingBody copy(SeatPosition seatPosition, CoolingLevel seatCoolerLevel) {
        s.k(seatPosition, "seatPosition");
        s.k(seatCoolerLevel, "seatCoolerLevel");
        return new SeatCoolingBody(seatPosition, seatCoolerLevel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeatCoolingBody)) {
            return false;
        }
        SeatCoolingBody seatCoolingBody = (SeatCoolingBody) other;
        return this.seatPosition == seatCoolingBody.seatPosition && this.seatCoolerLevel == seatCoolingBody.seatCoolerLevel;
    }

    public final CoolingLevel getSeatCoolerLevel() {
        return this.seatCoolerLevel;
    }

    public final SeatPosition getSeatPosition() {
        return this.seatPosition;
    }

    public int hashCode() {
        return (this.seatPosition.hashCode() * 31) + this.seatCoolerLevel.hashCode();
    }

    public String toString() {
        return "SeatCoolingBody(seatPosition=" + this.seatPosition + ", seatCoolerLevel=" + this.seatCoolerLevel + ")";
    }
}
