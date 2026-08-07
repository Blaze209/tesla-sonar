package com.fourthline.vision;

import com.fourthline.core.location.Coordinate;
import java.util.Date;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0017\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/fourthline/vision/ScannerMetadata;", "", "Ljava/util/Date;", "timestamp", "Lcom/fourthline/core/location/Coordinate;", "location", "Lcom/fourthline/vision/MotionData;", "motionData", "<init>", "(Ljava/util/Date;Lcom/fourthline/core/location/Coordinate;Lcom/fourthline/vision/MotionData;)V", "a", "Ljava/util/Date;", "getTimestamp", "()Ljava/util/Date;", "b", "Lcom/fourthline/core/location/Coordinate;", "getLocation", "()Lcom/fourthline/core/location/Coordinate;", "c", "Lcom/fourthline/vision/MotionData;", "getMotionData", "()Lcom/fourthline/vision/MotionData;", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ScannerMetadata {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Date timestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Coordinate location;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final MotionData motionData;

    public ScannerMetadata(Date timestamp, Coordinate coordinate, MotionData motionData) {
        s.k(timestamp, "timestamp");
        this.timestamp = timestamp;
        this.location = coordinate;
        this.motionData = motionData;
    }

    public Coordinate getLocation() {
        return this.location;
    }

    public MotionData getMotionData() {
        return this.motionData;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }
}
