package com.fourthline.vision.internal;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/fourthline/vision/internal/DocumentConfigInternal;", "", "featureConfig", "Lcom/fourthline/vision/internal/VisionDocumentScannerFeatureConfig;", "useCameraX", "", "preferredVideoRecordingBitrate", "", "<init>", "(Lcom/fourthline/vision/internal/VisionDocumentScannerFeatureConfig;ZLjava/lang/Integer;)V", "getFeatureConfig", "()Lcom/fourthline/vision/internal/VisionDocumentScannerFeatureConfig;", "getUseCameraX", "()Z", "getPreferredVideoRecordingBitrate", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Lcom/fourthline/vision/internal/VisionDocumentScannerFeatureConfig;ZLjava/lang/Integer;)Lcom/fourthline/vision/internal/DocumentConfigInternal;", "equals", "other", "hashCode", "toString", "", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DocumentConfigInternal {
    public static final int $stable = 8;
    private final VisionDocumentScannerFeatureConfig featureConfig;
    private final Integer preferredVideoRecordingBitrate;
    private final boolean useCameraX;

    public DocumentConfigInternal(VisionDocumentScannerFeatureConfig featureConfig, boolean z11, Integer num) {
        p013kotlin.jvm.internal.s.k(featureConfig, "featureConfig");
        this.featureConfig = featureConfig;
        this.useCameraX = z11;
        this.preferredVideoRecordingBitrate = num;
    }

    public static /* synthetic */ DocumentConfigInternal copy$default(DocumentConfigInternal documentConfigInternal, VisionDocumentScannerFeatureConfig visionDocumentScannerFeatureConfig, boolean z11, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            visionDocumentScannerFeatureConfig = documentConfigInternal.featureConfig;
        }
        if ((i11 & 2) != 0) {
            z11 = documentConfigInternal.useCameraX;
        }
        if ((i11 & 4) != 0) {
            num = documentConfigInternal.preferredVideoRecordingBitrate;
        }
        return documentConfigInternal.copy(visionDocumentScannerFeatureConfig, z11, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final VisionDocumentScannerFeatureConfig getFeatureConfig() {
        return this.featureConfig;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getUseCameraX() {
        return this.useCameraX;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getPreferredVideoRecordingBitrate() {
        return this.preferredVideoRecordingBitrate;
    }

    public final DocumentConfigInternal copy(VisionDocumentScannerFeatureConfig featureConfig, boolean useCameraX, Integer preferredVideoRecordingBitrate) {
        p013kotlin.jvm.internal.s.k(featureConfig, "featureConfig");
        return new DocumentConfigInternal(featureConfig, useCameraX, preferredVideoRecordingBitrate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentConfigInternal)) {
            return false;
        }
        DocumentConfigInternal documentConfigInternal = (DocumentConfigInternal) other;
        return p013kotlin.jvm.internal.s.f(this.featureConfig, documentConfigInternal.featureConfig) && this.useCameraX == documentConfigInternal.useCameraX && p013kotlin.jvm.internal.s.f(this.preferredVideoRecordingBitrate, documentConfigInternal.preferredVideoRecordingBitrate);
    }

    public final VisionDocumentScannerFeatureConfig getFeatureConfig() {
        return this.featureConfig;
    }

    public final Integer getPreferredVideoRecordingBitrate() {
        return this.preferredVideoRecordingBitrate;
    }

    public final boolean getUseCameraX() {
        return this.useCameraX;
    }

    public int hashCode() {
        int iHashCode = ((this.featureConfig.hashCode() * 31) + Boolean.hashCode(this.useCameraX)) * 31;
        Integer num = this.preferredVideoRecordingBitrate;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "DocumentConfigInternal(featureConfig=" + this.featureConfig + ", useCameraX=" + this.useCameraX + ", preferredVideoRecordingBitrate=" + this.preferredVideoRecordingBitrate + ")";
    }
}
