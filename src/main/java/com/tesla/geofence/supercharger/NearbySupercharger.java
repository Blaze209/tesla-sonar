package com.tesla.geofence.supercharger;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: com.tesla.geofence.supercharger.c, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010JF\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u001b\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b \u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\"\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/tesla/geofence/supercharger/c;", "", "", "trtId", "Lcom/tesla/geofence/supercharger/a;", "location", "", "name", "", "distanceKm", "", "teslaOnly", "<init>", "(ILcom/tesla/geofence/supercharger/a;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;)V", "from", "h", "(Lcom/tesla/geofence/supercharger/a;)Lcom/tesla/geofence/supercharger/c;", "a", "(ILcom/tesla/geofence/supercharger/a;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;)Lcom/tesla/geofence/supercharger/c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "g", "b", "Lcom/tesla/geofence/supercharger/a;", DateTokenConverter.CONVERTER_KEY, "()Lcom/tesla/geofence/supercharger/a;", "c", "Ljava/lang/String;", "e", "Ljava/lang/Double;", "()Ljava/lang/Double;", "Ljava/lang/Boolean;", "f", "()Ljava/lang/Boolean;", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NearbySupercharger {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int trtId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinates location;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double distanceKm;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean teslaOnly;

    public NearbySupercharger(int i11, Coordinates location, String name, Double d11, Boolean bool) {
        s.k(location, "location");
        s.k(name, "name");
        this.trtId = i11;
        this.location = location;
        this.name = name;
        this.distanceKm = d11;
        this.teslaOnly = bool;
    }

    public static /* synthetic */ NearbySupercharger b(NearbySupercharger nearbySupercharger, int i11, Coordinates coordinates, String str, Double d11, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = nearbySupercharger.trtId;
        }
        if ((i12 & 2) != 0) {
            coordinates = nearbySupercharger.location;
        }
        if ((i12 & 4) != 0) {
            str = nearbySupercharger.name;
        }
        if ((i12 & 8) != 0) {
            d11 = nearbySupercharger.distanceKm;
        }
        if ((i12 & 16) != 0) {
            bool = nearbySupercharger.teslaOnly;
        }
        Boolean bool2 = bool;
        String str2 = str;
        return nearbySupercharger.a(i11, coordinates, str2, d11, bool2);
    }

    public final NearbySupercharger a(int trtId, Coordinates location, String name, Double distanceKm, Boolean teslaOnly) {
        s.k(location, "location");
        s.k(name, "name");
        return new NearbySupercharger(trtId, location, name, distanceKm, teslaOnly);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Double getDistanceKm() {
        return this.distanceKm;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Coordinates getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NearbySupercharger)) {
            return false;
        }
        NearbySupercharger nearbySupercharger = (NearbySupercharger) other;
        return this.trtId == nearbySupercharger.trtId && s.f(this.location, nearbySupercharger.location) && s.f(this.name, nearbySupercharger.name) && s.f(this.distanceKm, nearbySupercharger.distanceKm) && s.f(this.teslaOnly, nearbySupercharger.teslaOnly);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getTeslaOnly() {
        return this.teslaOnly;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getTrtId() {
        return this.trtId;
    }

    public final NearbySupercharger h(Coordinates from) {
        s.k(from, "from");
        return b(this, 0, null, null, Double.valueOf(this.location.a(from)), null, 23, null);
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.trtId) * 31) + this.location.hashCode()) * 31) + this.name.hashCode()) * 31;
        Double d11 = this.distanceKm;
        int iHashCode2 = (iHashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        Boolean bool = this.teslaOnly;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "NearbySupercharger(trtId=" + this.trtId + ", location=" + this.location + ", name=" + this.name + ", distanceKm=" + this.distanceKm + ", teslaOnly=" + this.teslaOnly + ")";
    }

    public /* synthetic */ NearbySupercharger(int i11, Coordinates coordinates, String str, Double d11, Boolean bool, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, coordinates, str, (i12 & 8) != 0 ? null : d11, (i12 & 16) != 0 ? null : bool);
    }
}
