package com.fourthline.core.location;

import com.fourthline.adapters.serialization.OrcaKeys;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\t\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u000b\u001a\u00060\u0002j\u0002`\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ,\u0010\f\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\f\b\u0002\u0010\u0006\u001a\u00060\u0002j\u0002`\u0005HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001b\u0010\u0006\u001a\u00060\u0002j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/fourthline/core/location/Coordinate;", "", "", "Lcom/fourthline/core/location/Latitude;", OrcaKeys.LATITUDE, "Lcom/fourthline/core/location/Longitude;", OrcaKeys.LONGITUDE, "<init>", "(DD)V", "component1", "()D", "component2", "copy", "(DD)Lcom/fourthline/core/location/Coordinate;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "getLatitude", "b", "getLongitude", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Coordinate {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final double latitude;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double longitude;

    public Coordinate(double d11, double d12) {
        this.latitude = d11;
        this.longitude = d12;
    }

    public static /* synthetic */ Coordinate copy$default(Coordinate coordinate, double d11, double d12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = coordinate.latitude;
        }
        if ((i11 & 2) != 0) {
            d12 = coordinate.longitude;
        }
        return coordinate.copy(d11, d12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    public final Coordinate copy(double latitude, double longitude) {
        return new Coordinate(latitude, longitude);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Coordinate)) {
            return false;
        }
        Coordinate coordinate = (Coordinate) other;
        return Double.compare(this.latitude, coordinate.latitude) == 0 && Double.compare(this.longitude, coordinate.longitude) == 0;
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
        return "Coordinate(latitude=" + this.latitude + ", longitude=" + this.longitude + ")";
    }
}
