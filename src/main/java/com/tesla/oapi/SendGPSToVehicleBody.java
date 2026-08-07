package com.tesla.oapi;

import com.fourthline.adapters.serialization.OrcaKeys;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/tesla/oapi/SendGPSToVehicleBody;", "", OrcaKeys.LATITUDE, "", OrcaKeys.LONGITUDE, "<init>", "(DD)V", "getLatitude", "()D", "getLongitude", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SendGPSToVehicleBody {

    @g(name = "lat")
    private final double latitude;

    @g(name = "lon")
    private final double longitude;

    public SendGPSToVehicleBody(double d11, double d12) {
        this.latitude = d11;
        this.longitude = d12;
    }

    public static /* synthetic */ SendGPSToVehicleBody copy$default(SendGPSToVehicleBody sendGPSToVehicleBody, double d11, double d12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = sendGPSToVehicleBody.latitude;
        }
        if ((i11 & 2) != 0) {
            d12 = sendGPSToVehicleBody.longitude;
        }
        return sendGPSToVehicleBody.copy(d11, d12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    public final SendGPSToVehicleBody copy(double latitude, double longitude) {
        return new SendGPSToVehicleBody(latitude, longitude);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendGPSToVehicleBody)) {
            return false;
        }
        SendGPSToVehicleBody sendGPSToVehicleBody = (SendGPSToVehicleBody) other;
        return Double.compare(this.latitude, sendGPSToVehicleBody.latitude) == 0 && Double.compare(this.longitude, sendGPSToVehicleBody.longitude) == 0;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        return (Double.hashCode(this.latitude) * 31) + Double.hashCode(this.longitude);
    }

    public String toString() {
        return "SendGPSToVehicleBody(latitude=" + this.latitude + ", longitude=" + this.longitude + ")";
    }
}
