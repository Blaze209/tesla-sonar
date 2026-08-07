package com.fourthline.vision.selfie;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.core.location.Coordinate;
import com.fourthline.vision.MotionData;
import com.fourthline.vision.ScannerMetadata;
import java.util.Date;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u000f¨\u0006&"}, d2 = {"Lcom/fourthline/vision/selfie/SelfieScannerMetadata;", "Lcom/fourthline/vision/ScannerMetadata;", "Ljava/util/Date;", "timestamp", "Lcom/fourthline/core/location/Coordinate;", "location", "Lcom/fourthline/vision/MotionData;", "motionData", "<init>", "(Ljava/util/Date;Lcom/fourthline/core/location/Coordinate;Lcom/fourthline/vision/MotionData;)V", "component1", "()Ljava/util/Date;", "component2", "()Lcom/fourthline/core/location/Coordinate;", "component3", "()Lcom/fourthline/vision/MotionData;", "copy", "(Ljava/util/Date;Lcom/fourthline/core/location/Coordinate;Lcom/fourthline/vision/MotionData;)Lcom/fourthline/vision/selfie/SelfieScannerMetadata;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Date;", "getTimestamp", "e", "Lcom/fourthline/core/location/Coordinate;", "getLocation", "f", "Lcom/fourthline/vision/MotionData;", "getMotionData", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SelfieScannerMetadata extends ScannerMetadata {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date timestamp;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinate location;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final MotionData motionData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieScannerMetadata(Date timestamp, Coordinate coordinate, MotionData motionData) {
        super(timestamp, coordinate, motionData);
        s.k(timestamp, "timestamp");
        this.timestamp = timestamp;
        this.location = coordinate;
        this.motionData = motionData;
    }

    public static /* synthetic */ SelfieScannerMetadata copy$default(SelfieScannerMetadata selfieScannerMetadata, Date date, Coordinate coordinate, MotionData motionData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            date = selfieScannerMetadata.timestamp;
        }
        if ((i11 & 2) != 0) {
            coordinate = selfieScannerMetadata.location;
        }
        if ((i11 & 4) != 0) {
            motionData = selfieScannerMetadata.motionData;
        }
        return selfieScannerMetadata.copy(date, coordinate, motionData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Date getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Coordinate getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MotionData getMotionData() {
        return this.motionData;
    }

    public final SelfieScannerMetadata copy(Date timestamp, Coordinate location, MotionData motionData) {
        s.k(timestamp, "timestamp");
        return new SelfieScannerMetadata(timestamp, location, motionData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelfieScannerMetadata)) {
            return false;
        }
        SelfieScannerMetadata selfieScannerMetadata = (SelfieScannerMetadata) other;
        return s.f(this.timestamp, selfieScannerMetadata.timestamp) && s.f(this.location, selfieScannerMetadata.location) && s.f(this.motionData, selfieScannerMetadata.motionData);
    }

    @Override // com.fourthline.vision.ScannerMetadata
    public Coordinate getLocation() {
        return this.location;
    }

    @Override // com.fourthline.vision.ScannerMetadata
    public MotionData getMotionData() {
        return this.motionData;
    }

    @Override // com.fourthline.vision.ScannerMetadata
    public Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = this.timestamp.hashCode() * 31;
        Coordinate coordinate = this.location;
        int iHashCode2 = (iHashCode + (coordinate == null ? 0 : coordinate.hashCode())) * 31;
        MotionData motionData = this.motionData;
        return iHashCode2 + (motionData != null ? motionData.hashCode() : 0);
    }

    public String toString() {
        return "SelfieScannerMetadata(timestamp=" + this.timestamp + ", location=" + this.location + ", motionData=" + this.motionData + ")";
    }
}
