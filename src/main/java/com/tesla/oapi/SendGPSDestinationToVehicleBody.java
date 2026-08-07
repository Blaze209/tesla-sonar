package com.tesla.oapi;

import com.fourthline.adapters.serialization.OrcaKeys;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/tesla/oapi/SendGPSDestinationToVehicleBody;", "", OrcaKeys.LATITUDE, "", OrcaKeys.LONGITUDE, "destination", "", "<init>", "(DDLjava/lang/String;)V", "getLatitude", "()D", "getLongitude", "getDestination", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SendGPSDestinationToVehicleBody {

    @g(name = "destination")
    private final String destination;

    @g(name = "lat")
    private final double latitude;

    @g(name = "lon")
    private final double longitude;

    public SendGPSDestinationToVehicleBody(double d11, double d12, String destination) {
        s.k(destination, "destination");
        this.latitude = d11;
        this.longitude = d12;
        this.destination = destination;
    }

    public static /* synthetic */ SendGPSDestinationToVehicleBody copy$default(SendGPSDestinationToVehicleBody sendGPSDestinationToVehicleBody, double d11, double d12, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = sendGPSDestinationToVehicleBody.latitude;
        }
        double d13 = d11;
        if ((i11 & 2) != 0) {
            d12 = sendGPSDestinationToVehicleBody.longitude;
        }
        double d14 = d12;
        if ((i11 & 4) != 0) {
            str = sendGPSDestinationToVehicleBody.destination;
        }
        return sendGPSDestinationToVehicleBody.copy(d13, d14, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDestination() {
        return this.destination;
    }

    public final SendGPSDestinationToVehicleBody copy(double latitude, double longitude, String destination) {
        s.k(destination, "destination");
        return new SendGPSDestinationToVehicleBody(latitude, longitude, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendGPSDestinationToVehicleBody)) {
            return false;
        }
        SendGPSDestinationToVehicleBody sendGPSDestinationToVehicleBody = (SendGPSDestinationToVehicleBody) other;
        return Double.compare(this.latitude, sendGPSDestinationToVehicleBody.latitude) == 0 && Double.compare(this.longitude, sendGPSDestinationToVehicleBody.longitude) == 0 && s.f(this.destination, sendGPSDestinationToVehicleBody.destination);
    }

    public final String getDestination() {
        return this.destination;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        return (((Double.hashCode(this.latitude) * 31) + Double.hashCode(this.longitude)) * 31) + this.destination.hashCode();
    }

    public String toString() {
        return "SendGPSDestinationToVehicleBody(latitude=" + this.latitude + ", longitude=" + this.longitude + ", destination=" + this.destination + ")";
    }
}
