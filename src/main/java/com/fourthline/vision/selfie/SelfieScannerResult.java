package com.fourthline.vision.selfie;

import com.fourthline.adapters.serialization.OrcaKeys;
import com.fourthline.core.VideoRecording;
import com.fourthline.vision.ScannerImage;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000f¨\u0006%"}, d2 = {"Lcom/fourthline/vision/selfie/SelfieScannerResult;", "", "Lcom/fourthline/vision/ScannerImage;", "image", "Lcom/fourthline/vision/selfie/SelfieScannerMetadata;", OrcaKeys.METADATA, "Lcom/fourthline/core/VideoRecording;", "videoRecording", "<init>", "(Lcom/fourthline/vision/ScannerImage;Lcom/fourthline/vision/selfie/SelfieScannerMetadata;Lcom/fourthline/core/VideoRecording;)V", "component1", "()Lcom/fourthline/vision/ScannerImage;", "component2", "()Lcom/fourthline/vision/selfie/SelfieScannerMetadata;", "component3", "()Lcom/fourthline/core/VideoRecording;", "copy", "(Lcom/fourthline/vision/ScannerImage;Lcom/fourthline/vision/selfie/SelfieScannerMetadata;Lcom/fourthline/core/VideoRecording;)Lcom/fourthline/vision/selfie/SelfieScannerResult;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/vision/ScannerImage;", "getImage", "b", "Lcom/fourthline/vision/selfie/SelfieScannerMetadata;", "getMetadata", "c", "Lcom/fourthline/core/VideoRecording;", "getVideoRecording", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SelfieScannerResult {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ScannerImage image;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final SelfieScannerMetadata metadata;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final VideoRecording videoRecording;

    public SelfieScannerResult(ScannerImage image, SelfieScannerMetadata metadata, VideoRecording videoRecording) {
        s.k(image, "image");
        s.k(metadata, "metadata");
        this.image = image;
        this.metadata = metadata;
        this.videoRecording = videoRecording;
    }

    public static /* synthetic */ SelfieScannerResult copy$default(SelfieScannerResult selfieScannerResult, ScannerImage scannerImage, SelfieScannerMetadata selfieScannerMetadata, VideoRecording videoRecording, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            scannerImage = selfieScannerResult.image;
        }
        if ((i11 & 2) != 0) {
            selfieScannerMetadata = selfieScannerResult.metadata;
        }
        if ((i11 & 4) != 0) {
            videoRecording = selfieScannerResult.videoRecording;
        }
        return selfieScannerResult.copy(scannerImage, selfieScannerMetadata, videoRecording);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ScannerImage getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SelfieScannerMetadata getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final VideoRecording getVideoRecording() {
        return this.videoRecording;
    }

    public final SelfieScannerResult copy(ScannerImage image, SelfieScannerMetadata metadata, VideoRecording videoRecording) {
        s.k(image, "image");
        s.k(metadata, "metadata");
        return new SelfieScannerResult(image, metadata, videoRecording);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelfieScannerResult)) {
            return false;
        }
        SelfieScannerResult selfieScannerResult = (SelfieScannerResult) other;
        return s.f(this.image, selfieScannerResult.image) && s.f(this.metadata, selfieScannerResult.metadata) && s.f(this.videoRecording, selfieScannerResult.videoRecording);
    }

    public final ScannerImage getImage() {
        return this.image;
    }

    public final SelfieScannerMetadata getMetadata() {
        return this.metadata;
    }

    public final VideoRecording getVideoRecording() {
        return this.videoRecording;
    }

    public int hashCode() {
        int iHashCode = ((this.image.hashCode() * 31) + this.metadata.hashCode()) * 31;
        VideoRecording videoRecording = this.videoRecording;
        return iHashCode + (videoRecording == null ? 0 : videoRecording.hashCode());
    }

    public String toString() {
        return "SelfieScannerResult(image=" + this.image + ", metadata=" + this.metadata + ", videoRecording=" + this.videoRecording + ")";
    }

    public /* synthetic */ SelfieScannerResult(ScannerImage scannerImage, SelfieScannerMetadata selfieScannerMetadata, VideoRecording videoRecording, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(scannerImage, selfieScannerMetadata, (i11 & 4) != 0 ? null : videoRecording);
    }
}
