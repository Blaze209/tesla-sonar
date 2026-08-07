package com.tesla.oapi;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/tesla/oapi/SendWaypointsToVehicleBody;", "", "waypoints", "", "startSoe", "", "arrivalSoe", "<init>", "(Ljava/lang/String;II)V", "getWaypoints", "()Ljava/lang/String;", "getStartSoe", "()I", "getArrivalSoe", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SendWaypointsToVehicleBody {

    @g(name = "destination_arrival_soe")
    private final int arrivalSoe;

    @g(name = "destination_start_soe")
    private final int startSoe;

    @g(name = "waypoints")
    private final String waypoints;

    public SendWaypointsToVehicleBody(String waypoints, int i11, int i12) {
        s.k(waypoints, "waypoints");
        this.waypoints = waypoints;
        this.startSoe = i11;
        this.arrivalSoe = i12;
    }

    public static /* synthetic */ SendWaypointsToVehicleBody copy$default(SendWaypointsToVehicleBody sendWaypointsToVehicleBody, String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sendWaypointsToVehicleBody.waypoints;
        }
        if ((i13 & 2) != 0) {
            i11 = sendWaypointsToVehicleBody.startSoe;
        }
        if ((i13 & 4) != 0) {
            i12 = sendWaypointsToVehicleBody.arrivalSoe;
        }
        return sendWaypointsToVehicleBody.copy(str, i11, i12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWaypoints() {
        return this.waypoints;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStartSoe() {
        return this.startSoe;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getArrivalSoe() {
        return this.arrivalSoe;
    }

    public final SendWaypointsToVehicleBody copy(String waypoints, int startSoe, int arrivalSoe) {
        s.k(waypoints, "waypoints");
        return new SendWaypointsToVehicleBody(waypoints, startSoe, arrivalSoe);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendWaypointsToVehicleBody)) {
            return false;
        }
        SendWaypointsToVehicleBody sendWaypointsToVehicleBody = (SendWaypointsToVehicleBody) other;
        return s.f(this.waypoints, sendWaypointsToVehicleBody.waypoints) && this.startSoe == sendWaypointsToVehicleBody.startSoe && this.arrivalSoe == sendWaypointsToVehicleBody.arrivalSoe;
    }

    public final int getArrivalSoe() {
        return this.arrivalSoe;
    }

    public final int getStartSoe() {
        return this.startSoe;
    }

    public final String getWaypoints() {
        return this.waypoints;
    }

    public int hashCode() {
        return (((this.waypoints.hashCode() * 31) + Integer.hashCode(this.startSoe)) * 31) + Integer.hashCode(this.arrivalSoe);
    }

    public String toString() {
        return "SendWaypointsToVehicleBody(waypoints=" + this.waypoints + ", startSoe=" + this.startSoe + ", arrivalSoe=" + this.arrivalSoe + ")";
    }
}
