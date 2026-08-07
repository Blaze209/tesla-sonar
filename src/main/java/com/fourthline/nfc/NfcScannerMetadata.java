package com.fourthline.nfc;

import com.fourthline.core.location.Coordinate;
import java.util.Date;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/fourthline/nfc/NfcScannerMetadata;", "", "Ljava/util/Date;", "timestamp", "Lcom/fourthline/core/location/Coordinate;", "location", "<init>", "(Ljava/util/Date;Lcom/fourthline/core/location/Coordinate;)V", "component1", "()Ljava/util/Date;", "component2", "()Lcom/fourthline/core/location/Coordinate;", "copy", "(Ljava/util/Date;Lcom/fourthline/core/location/Coordinate;)Lcom/fourthline/nfc/NfcScannerMetadata;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Date;", "getTimestamp", "b", "Lcom/fourthline/core/location/Coordinate;", "getLocation", "fourthline-nfc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NfcScannerMetadata {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date timestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinate location;

    public NfcScannerMetadata(Date timestamp, Coordinate coordinate) {
        s.k(timestamp, "timestamp");
        this.timestamp = timestamp;
        this.location = coordinate;
    }

    public static /* synthetic */ NfcScannerMetadata copy$default(NfcScannerMetadata nfcScannerMetadata, Date date, Coordinate coordinate, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            date = nfcScannerMetadata.timestamp;
        }
        if ((i11 & 2) != 0) {
            coordinate = nfcScannerMetadata.location;
        }
        return nfcScannerMetadata.copy(date, coordinate);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Date getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Coordinate getLocation() {
        return this.location;
    }

    public final NfcScannerMetadata copy(Date timestamp, Coordinate location) {
        s.k(timestamp, "timestamp");
        return new NfcScannerMetadata(timestamp, location);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcScannerMetadata)) {
            return false;
        }
        NfcScannerMetadata nfcScannerMetadata = (NfcScannerMetadata) other;
        return s.f(this.timestamp, nfcScannerMetadata.timestamp) && s.f(this.location, nfcScannerMetadata.location);
    }

    public final Coordinate getLocation() {
        return this.location;
    }

    public final Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = this.timestamp.hashCode() * 31;
        Coordinate coordinate = this.location;
        return iHashCode + (coordinate == null ? 0 : coordinate.hashCode());
    }

    public String toString() {
        return "NfcScannerMetadata(timestamp=" + this.timestamp + ", location=" + this.location + ")";
    }
}
