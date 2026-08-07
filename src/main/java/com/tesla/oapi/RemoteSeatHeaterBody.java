package com.tesla.oapi;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/tesla/oapi/RemoteSeatHeaterBody;", "", "heater", "Lcom/tesla/oapi/SeatHeater;", "level", "Lcom/tesla/oapi/SeatHeaterLevel;", "<init>", "(Lcom/tesla/oapi/SeatHeater;Lcom/tesla/oapi/SeatHeaterLevel;)V", "getHeater", "()Lcom/tesla/oapi/SeatHeater;", "getLevel", "()Lcom/tesla/oapi/SeatHeaterLevel;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RemoteSeatHeaterBody {

    @g(name = "heater")
    private final SeatHeater heater;

    @g(name = "level")
    private final SeatHeaterLevel level;

    public RemoteSeatHeaterBody(SeatHeater heater, SeatHeaterLevel level) {
        s.k(heater, "heater");
        s.k(level, "level");
        this.heater = heater;
        this.level = level;
    }

    public static /* synthetic */ RemoteSeatHeaterBody copy$default(RemoteSeatHeaterBody remoteSeatHeaterBody, SeatHeater seatHeater, SeatHeaterLevel seatHeaterLevel, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            seatHeater = remoteSeatHeaterBody.heater;
        }
        if ((i11 & 2) != 0) {
            seatHeaterLevel = remoteSeatHeaterBody.level;
        }
        return remoteSeatHeaterBody.copy(seatHeater, seatHeaterLevel);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SeatHeater getHeater() {
        return this.heater;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SeatHeaterLevel getLevel() {
        return this.level;
    }

    public final RemoteSeatHeaterBody copy(SeatHeater heater, SeatHeaterLevel level) {
        s.k(heater, "heater");
        s.k(level, "level");
        return new RemoteSeatHeaterBody(heater, level);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteSeatHeaterBody)) {
            return false;
        }
        RemoteSeatHeaterBody remoteSeatHeaterBody = (RemoteSeatHeaterBody) other;
        return this.heater == remoteSeatHeaterBody.heater && this.level == remoteSeatHeaterBody.level;
    }

    public final SeatHeater getHeater() {
        return this.heater;
    }

    public final SeatHeaterLevel getLevel() {
        return this.level;
    }

    public int hashCode() {
        return (this.heater.hashCode() * 31) + this.level.hashCode();
    }

    public String toString() {
        return "RemoteSeatHeaterBody(heater=" + this.heater + ", level=" + this.level + ")";
    }
}
