package com.tesla.oapi;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/tesla/oapi/FetchNearbyChargingBody;", "", "radius", "", "count", "includeMetadata", "", "detail", "<init>", "(IIZZ)V", "getRadius", "()I", "getCount", "getIncludeMetadata", "()Z", "getDetail", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FetchNearbyChargingBody {

    @g(name = "count")
    private final int count;

    @g(name = "detail")
    private final boolean detail;

    @g(name = "include_metadata")
    private final boolean includeMetadata;

    @g(name = "radius")
    private final int radius;

    public FetchNearbyChargingBody(int i11, int i12, boolean z11, boolean z12) {
        this.radius = i11;
        this.count = i12;
        this.includeMetadata = z11;
        this.detail = z12;
    }

    public static /* synthetic */ FetchNearbyChargingBody copy$default(FetchNearbyChargingBody fetchNearbyChargingBody, int i11, int i12, boolean z11, boolean z12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = fetchNearbyChargingBody.radius;
        }
        if ((i13 & 2) != 0) {
            i12 = fetchNearbyChargingBody.count;
        }
        if ((i13 & 4) != 0) {
            z11 = fetchNearbyChargingBody.includeMetadata;
        }
        if ((i13 & 8) != 0) {
            z12 = fetchNearbyChargingBody.detail;
        }
        return fetchNearbyChargingBody.copy(i11, i12, z11, z12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRadius() {
        return this.radius;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIncludeMetadata() {
        return this.includeMetadata;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getDetail() {
        return this.detail;
    }

    public final FetchNearbyChargingBody copy(int radius, int count, boolean includeMetadata, boolean detail) {
        return new FetchNearbyChargingBody(radius, count, includeMetadata, detail);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FetchNearbyChargingBody)) {
            return false;
        }
        FetchNearbyChargingBody fetchNearbyChargingBody = (FetchNearbyChargingBody) other;
        return this.radius == fetchNearbyChargingBody.radius && this.count == fetchNearbyChargingBody.count && this.includeMetadata == fetchNearbyChargingBody.includeMetadata && this.detail == fetchNearbyChargingBody.detail;
    }

    public final int getCount() {
        return this.count;
    }

    public final boolean getDetail() {
        return this.detail;
    }

    public final boolean getIncludeMetadata() {
        return this.includeMetadata;
    }

    public final int getRadius() {
        return this.radius;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.radius) * 31) + Integer.hashCode(this.count)) * 31) + Boolean.hashCode(this.includeMetadata)) * 31) + Boolean.hashCode(this.detail);
    }

    public String toString() {
        return "FetchNearbyChargingBody(radius=" + this.radius + ", count=" + this.count + ", includeMetadata=" + this.includeMetadata + ", detail=" + this.detail + ")";
    }
}
