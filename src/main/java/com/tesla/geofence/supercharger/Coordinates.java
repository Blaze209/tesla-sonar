package com.tesla.geofence.supercharger;

import com.fourthline.adapters.serialization.OrcaKeys;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: com.tesla.geofence.supercharger.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/tesla/geofence/supercharger/a;", "", "", OrcaKeys.LATITUDE, OrcaKeys.LONGITUDE, "<init>", "(DD)V", "other", "a", "(Lcom/tesla/geofence/supercharger/a;)D", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "D", "b", "()D", "c", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Coordinates {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final double latitude;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double longitude;

    public Coordinates(double d11, double d12) {
        this.latitude = d11;
        this.longitude = d12;
    }

    public final double a(Coordinates other) {
        s.k(other, "other");
        double d11 = 2;
        return d11 * Math.asin(Math.sqrt(Math.pow(Math.sin(Math.toRadians(other.latitude - this.latitude) / d11), d11) + (Math.pow(Math.sin(Math.toRadians(other.longitude - this.longitude) / d11), d11) * Math.cos(Math.toRadians(this.latitude)) * Math.cos(Math.toRadians(other.latitude))))) * 6371.0d;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Coordinates)) {
            return false;
        }
        Coordinates coordinates = (Coordinates) other;
        return Double.compare(this.latitude, coordinates.latitude) == 0 && Double.compare(this.longitude, coordinates.longitude) == 0;
    }

    public int hashCode() {
        return (Double.hashCode(this.latitude) * 31) + Double.hashCode(this.longitude);
    }

    public String toString() {
        return "Coordinates(latitude=" + this.latitude + ", longitude=" + this.longitude + ")";
    }
}
