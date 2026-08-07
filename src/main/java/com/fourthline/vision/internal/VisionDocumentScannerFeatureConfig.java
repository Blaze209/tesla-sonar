package com.fourthline.vision.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.core.FeatureConfig;
import com.fourthline.vision.document.DocumentScannerStep;
import com.fourthline.vision.document.internal.domain.step.VisionDynamicStepsEvaluator;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, d2 = {"Lcom/fourthline/vision/internal/VisionDocumentScannerFeatureConfig;", "Lcom/fourthline/core/FeatureConfig;", "isAutoDetectAvailable", "", "isAutoDetectFallbackEnabled", "autoDetectMode", "Lcom/fourthline/vision/internal/VisionDocumentScannerFeatureConfig$AutoDetectMode;", "dynamicStepsEvaluator", "Lcom/fourthline/vision/document/internal/domain/step/VisionDynamicStepsEvaluator;", "Lcom/fourthline/vision/document/DocumentScannerStep;", "<init>", "(ZZLcom/fourthline/vision/internal/VisionDocumentScannerFeatureConfig$AutoDetectMode;Lcom/fourthline/vision/document/internal/domain/step/VisionDynamicStepsEvaluator;)V", "()Z", "getAutoDetectMode", "()Lcom/fourthline/vision/internal/VisionDocumentScannerFeatureConfig$AutoDetectMode;", "getDynamicStepsEvaluator", "()Lcom/fourthline/vision/document/internal/domain/step/VisionDynamicStepsEvaluator;", "getSupportedAutoDetectMode", "documentType", "Lcom/fourthline/core/DocumentType;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "AutoDetectMode", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class VisionDocumentScannerFeatureConfig implements FeatureConfig {
    public static final int $stable = 8;
    private final AutoDetectMode autoDetectMode;
    private final VisionDynamicStepsEvaluator<DocumentScannerStep> dynamicStepsEvaluator;
    private final boolean isAutoDetectAvailable;
    private final boolean isAutoDetectFallbackEnabled;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/fourthline/vision/internal/VisionDocumentScannerFeatureConfig$AutoDetectMode;", "", "<init>", "(Ljava/lang/String;I)V", "DirectCapture", "UserAssist", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum AutoDetectMode {
        DirectCapture,
        UserAssist;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<AutoDetectMode> getEntries() {
            return $ENTRIES;
        }
    }

    public VisionDocumentScannerFeatureConfig() {
        this(false, false, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VisionDocumentScannerFeatureConfig copy$default(VisionDocumentScannerFeatureConfig visionDocumentScannerFeatureConfig, boolean z11, boolean z12, AutoDetectMode autoDetectMode, VisionDynamicStepsEvaluator visionDynamicStepsEvaluator, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = visionDocumentScannerFeatureConfig.isAutoDetectAvailable;
        }
        if ((i11 & 2) != 0) {
            z12 = visionDocumentScannerFeatureConfig.isAutoDetectFallbackEnabled;
        }
        if ((i11 & 4) != 0) {
            autoDetectMode = visionDocumentScannerFeatureConfig.autoDetectMode;
        }
        if ((i11 & 8) != 0) {
            visionDynamicStepsEvaluator = visionDocumentScannerFeatureConfig.dynamicStepsEvaluator;
        }
        return visionDocumentScannerFeatureConfig.copy(z11, z12, autoDetectMode, visionDynamicStepsEvaluator);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsAutoDetectAvailable() {
        return this.isAutoDetectAvailable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsAutoDetectFallbackEnabled() {
        return this.isAutoDetectFallbackEnabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AutoDetectMode getAutoDetectMode() {
        return this.autoDetectMode;
    }

    public final VisionDynamicStepsEvaluator<DocumentScannerStep> component4() {
        return this.dynamicStepsEvaluator;
    }

    public final VisionDocumentScannerFeatureConfig copy(boolean isAutoDetectAvailable, boolean isAutoDetectFallbackEnabled, AutoDetectMode autoDetectMode, VisionDynamicStepsEvaluator<DocumentScannerStep> dynamicStepsEvaluator) {
        p013kotlin.jvm.internal.s.k(autoDetectMode, "autoDetectMode");
        return new VisionDocumentScannerFeatureConfig(isAutoDetectAvailable, isAutoDetectFallbackEnabled, autoDetectMode, dynamicStepsEvaluator);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VisionDocumentScannerFeatureConfig)) {
            return false;
        }
        VisionDocumentScannerFeatureConfig visionDocumentScannerFeatureConfig = (VisionDocumentScannerFeatureConfig) other;
        return this.isAutoDetectAvailable == visionDocumentScannerFeatureConfig.isAutoDetectAvailable && this.isAutoDetectFallbackEnabled == visionDocumentScannerFeatureConfig.isAutoDetectFallbackEnabled && this.autoDetectMode == visionDocumentScannerFeatureConfig.autoDetectMode && p013kotlin.jvm.internal.s.f(this.dynamicStepsEvaluator, visionDocumentScannerFeatureConfig.dynamicStepsEvaluator);
    }

    public final AutoDetectMode getAutoDetectMode() {
        return this.autoDetectMode;
    }

    public final VisionDynamicStepsEvaluator<DocumentScannerStep> getDynamicStepsEvaluator() {
        return this.dynamicStepsEvaluator;
    }

    public final AutoDetectMode getSupportedAutoDetectMode(DocumentType documentType) {
        p013kotlin.jvm.internal.s.k(documentType, "documentType");
        return this.autoDetectMode;
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.isAutoDetectAvailable) * 31) + Boolean.hashCode(this.isAutoDetectFallbackEnabled)) * 31) + this.autoDetectMode.hashCode()) * 31;
        VisionDynamicStepsEvaluator<DocumentScannerStep> visionDynamicStepsEvaluator = this.dynamicStepsEvaluator;
        return iHashCode + (visionDynamicStepsEvaluator == null ? 0 : visionDynamicStepsEvaluator.hashCode());
    }

    public final boolean isAutoDetectAvailable() {
        return this.isAutoDetectAvailable;
    }

    public final boolean isAutoDetectFallbackEnabled() {
        return this.isAutoDetectFallbackEnabled;
    }

    public String toString() {
        return "VisionDocumentScannerFeatureConfig(isAutoDetectAvailable=" + this.isAutoDetectAvailable + ", isAutoDetectFallbackEnabled=" + this.isAutoDetectFallbackEnabled + ", autoDetectMode=" + this.autoDetectMode + ", dynamicStepsEvaluator=" + this.dynamicStepsEvaluator + ")";
    }

    public VisionDocumentScannerFeatureConfig(boolean z11, boolean z12, AutoDetectMode autoDetectMode, VisionDynamicStepsEvaluator<DocumentScannerStep> visionDynamicStepsEvaluator) {
        p013kotlin.jvm.internal.s.k(autoDetectMode, "autoDetectMode");
        this.isAutoDetectAvailable = z11;
        this.isAutoDetectFallbackEnabled = z12;
        this.autoDetectMode = autoDetectMode;
        this.dynamicStepsEvaluator = visionDynamicStepsEvaluator;
    }

    public /* synthetic */ VisionDocumentScannerFeatureConfig(boolean z11, boolean z12, AutoDetectMode autoDetectMode, VisionDynamicStepsEvaluator visionDynamicStepsEvaluator, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z11, (i11 & 2) != 0 ? true : z12, (i11 & 4) != 0 ? AutoDetectMode.UserAssist : autoDetectMode, (i11 & 8) != 0 ? null : visionDynamicStepsEvaluator);
    }
}
