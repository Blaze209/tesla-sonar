package com.fourthline.vision.document;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.core.DocumentType;
import com.fourthline.core.VideoDuration;
import com.fourthline.vision.RecordingType;
import com.fourthline.vision.document.compose.DocumentScannerInternalConfig;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010\u0018Jt\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b8\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010\u001eR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010 R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010\"R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010$R\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bJ\u00105\u001a\u0004\bK\u0010\u0018R\"\u0010S\u001a\u00020L8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010R¨\u0006T"}, d2 = {"Lcom/fourthline/vision/document/DocumentScannerConfig;", "", "Lcom/fourthline/core/DocumentType;", "type", "", "shouldStartAutomatically", "includeAngledSteps", "debugModeEnabled", "Lcom/fourthline/vision/RecordingType;", "recordingType", "Lcom/fourthline/vision/document/MrzValidationPolicy;", "mrzValidationPolicy", "Lcom/fourthline/vision/document/DocumentValidationConfig;", "validationConfig", "Lcom/fourthline/core/VideoDuration;", "videoDuration", "", "autoDetectStepDuration", "includeMotionData", "<init>", "(Lcom/fourthline/core/DocumentType;ZZZLcom/fourthline/vision/RecordingType;Lcom/fourthline/vision/document/MrzValidationPolicy;Lcom/fourthline/vision/document/DocumentValidationConfig;Lcom/fourthline/core/VideoDuration;JZ)V", "component1", "()Lcom/fourthline/core/DocumentType;", "component2", "()Z", "component3", "component4", "component5", "()Lcom/fourthline/vision/RecordingType;", "component6", "()Lcom/fourthline/vision/document/MrzValidationPolicy;", "component7", "()Lcom/fourthline/vision/document/DocumentValidationConfig;", "component8", "()Lcom/fourthline/core/VideoDuration;", "component9", "()J", "component10", "copy", "(Lcom/fourthline/core/DocumentType;ZZZLcom/fourthline/vision/RecordingType;Lcom/fourthline/vision/document/MrzValidationPolicy;Lcom/fourthline/vision/document/DocumentValidationConfig;Lcom/fourthline/core/VideoDuration;JZ)Lcom/fourthline/vision/document/DocumentScannerConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/core/DocumentType;", "getType", "b", "Z", "getShouldStartAutomatically", "c", "getIncludeAngledSteps", DateTokenConverter.CONVERTER_KEY, "getDebugModeEnabled", "e", "Lcom/fourthline/vision/RecordingType;", "getRecordingType", "f", "Lcom/fourthline/vision/document/MrzValidationPolicy;", "getMrzValidationPolicy", "g", "Lcom/fourthline/vision/document/DocumentValidationConfig;", "getValidationConfig", "h", "Lcom/fourthline/core/VideoDuration;", "getVideoDuration", IntegerTokenConverter.CONVERTER_KEY, "J", "getAutoDetectStepDuration", "j", "getIncludeMotionData", "Lcom/fourthline/vision/document/compose/DocumentScannerInternalConfig;", "k", "Lcom/fourthline/vision/document/compose/DocumentScannerInternalConfig;", "getInternalConfig", "()Lcom/fourthline/vision/document/compose/DocumentScannerInternalConfig;", "setInternalConfig", "(Lcom/fourthline/vision/document/compose/DocumentScannerInternalConfig;)V", "internalConfig", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DocumentScannerConfig {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentType type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldStartAutomatically;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean includeAngledSteps;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean debugModeEnabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final RecordingType recordingType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final MrzValidationPolicy mrzValidationPolicy;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentValidationConfig validationConfig;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final VideoDuration videoDuration;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final long autoDetectStepDuration;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean includeMotionData;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private DocumentScannerInternalConfig internalConfig;

    public DocumentScannerConfig(DocumentType type, boolean z11, boolean z12, boolean z13, RecordingType recordingType, MrzValidationPolicy mrzValidationPolicy, DocumentValidationConfig validationConfig, VideoDuration videoDuration, long j11, boolean z14) {
        s.k(type, "type");
        s.k(recordingType, "recordingType");
        s.k(mrzValidationPolicy, "mrzValidationPolicy");
        s.k(validationConfig, "validationConfig");
        s.k(videoDuration, "videoDuration");
        this.type = type;
        this.shouldStartAutomatically = z11;
        this.includeAngledSteps = z12;
        this.debugModeEnabled = z13;
        this.recordingType = recordingType;
        this.mrzValidationPolicy = mrzValidationPolicy;
        this.validationConfig = validationConfig;
        this.videoDuration = videoDuration;
        this.autoDetectStepDuration = j11;
        this.includeMotionData = z14;
        this.internalConfig = new DocumentScannerInternalConfig(false, null, null, 7, null);
    }

    public static /* synthetic */ DocumentScannerConfig copy$default(DocumentScannerConfig documentScannerConfig, DocumentType documentType, boolean z11, boolean z12, boolean z13, RecordingType recordingType, MrzValidationPolicy mrzValidationPolicy, DocumentValidationConfig documentValidationConfig, VideoDuration videoDuration, long j11, boolean z14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            documentType = documentScannerConfig.type;
        }
        if ((i11 & 2) != 0) {
            z11 = documentScannerConfig.shouldStartAutomatically;
        }
        if ((i11 & 4) != 0) {
            z12 = documentScannerConfig.includeAngledSteps;
        }
        if ((i11 & 8) != 0) {
            z13 = documentScannerConfig.debugModeEnabled;
        }
        if ((i11 & 16) != 0) {
            recordingType = documentScannerConfig.recordingType;
        }
        if ((i11 & 32) != 0) {
            mrzValidationPolicy = documentScannerConfig.mrzValidationPolicy;
        }
        if ((i11 & 64) != 0) {
            documentValidationConfig = documentScannerConfig.validationConfig;
        }
        if ((i11 & 128) != 0) {
            videoDuration = documentScannerConfig.videoDuration;
        }
        if ((i11 & 256) != 0) {
            j11 = documentScannerConfig.autoDetectStepDuration;
        }
        if ((i11 & 512) != 0) {
            z14 = documentScannerConfig.includeMotionData;
        }
        boolean z15 = z14;
        long j12 = j11;
        DocumentValidationConfig documentValidationConfig2 = documentValidationConfig;
        VideoDuration videoDuration2 = videoDuration;
        RecordingType recordingType2 = recordingType;
        MrzValidationPolicy mrzValidationPolicy2 = mrzValidationPolicy;
        return documentScannerConfig.copy(documentType, z11, z12, z13, recordingType2, mrzValidationPolicy2, documentValidationConfig2, videoDuration2, j12, z15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DocumentType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIncludeMotionData() {
        return this.includeMotionData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShouldStartAutomatically() {
        return this.shouldStartAutomatically;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIncludeAngledSteps() {
        return this.includeAngledSteps;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getDebugModeEnabled() {
        return this.debugModeEnabled;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final RecordingType getRecordingType() {
        return this.recordingType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final MrzValidationPolicy getMrzValidationPolicy() {
        return this.mrzValidationPolicy;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final DocumentValidationConfig getValidationConfig() {
        return this.validationConfig;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final VideoDuration getVideoDuration() {
        return this.videoDuration;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getAutoDetectStepDuration() {
        return this.autoDetectStepDuration;
    }

    public final DocumentScannerConfig copy(DocumentType type, boolean shouldStartAutomatically, boolean includeAngledSteps, boolean debugModeEnabled, RecordingType recordingType, MrzValidationPolicy mrzValidationPolicy, DocumentValidationConfig validationConfig, VideoDuration videoDuration, long autoDetectStepDuration, boolean includeMotionData) {
        s.k(type, "type");
        s.k(recordingType, "recordingType");
        s.k(mrzValidationPolicy, "mrzValidationPolicy");
        s.k(validationConfig, "validationConfig");
        s.k(videoDuration, "videoDuration");
        return new DocumentScannerConfig(type, shouldStartAutomatically, includeAngledSteps, debugModeEnabled, recordingType, mrzValidationPolicy, validationConfig, videoDuration, autoDetectStepDuration, includeMotionData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentScannerConfig)) {
            return false;
        }
        DocumentScannerConfig documentScannerConfig = (DocumentScannerConfig) other;
        return this.type == documentScannerConfig.type && this.shouldStartAutomatically == documentScannerConfig.shouldStartAutomatically && this.includeAngledSteps == documentScannerConfig.includeAngledSteps && this.debugModeEnabled == documentScannerConfig.debugModeEnabled && this.recordingType == documentScannerConfig.recordingType && this.mrzValidationPolicy == documentScannerConfig.mrzValidationPolicy && s.f(this.validationConfig, documentScannerConfig.validationConfig) && s.f(this.videoDuration, documentScannerConfig.videoDuration) && this.autoDetectStepDuration == documentScannerConfig.autoDetectStepDuration && this.includeMotionData == documentScannerConfig.includeMotionData;
    }

    public final long getAutoDetectStepDuration() {
        return this.autoDetectStepDuration;
    }

    public final boolean getDebugModeEnabled() {
        return this.debugModeEnabled;
    }

    public final boolean getIncludeAngledSteps() {
        return this.includeAngledSteps;
    }

    public final boolean getIncludeMotionData() {
        return this.includeMotionData;
    }

    public final DocumentScannerInternalConfig getInternalConfig() {
        return this.internalConfig;
    }

    public final MrzValidationPolicy getMrzValidationPolicy() {
        return this.mrzValidationPolicy;
    }

    public final RecordingType getRecordingType() {
        return this.recordingType;
    }

    public final boolean getShouldStartAutomatically() {
        return this.shouldStartAutomatically;
    }

    public final DocumentType getType() {
        return this.type;
    }

    public final DocumentValidationConfig getValidationConfig() {
        return this.validationConfig;
    }

    public final VideoDuration getVideoDuration() {
        return this.videoDuration;
    }

    public int hashCode() {
        return (((((((((((((((((this.type.hashCode() * 31) + Boolean.hashCode(this.shouldStartAutomatically)) * 31) + Boolean.hashCode(this.includeAngledSteps)) * 31) + Boolean.hashCode(this.debugModeEnabled)) * 31) + this.recordingType.hashCode()) * 31) + this.mrzValidationPolicy.hashCode()) * 31) + this.validationConfig.hashCode()) * 31) + this.videoDuration.hashCode()) * 31) + Long.hashCode(this.autoDetectStepDuration)) * 31) + Boolean.hashCode(this.includeMotionData);
    }

    public final void setInternalConfig(DocumentScannerInternalConfig documentScannerInternalConfig) {
        s.k(documentScannerInternalConfig, "<set-?>");
        this.internalConfig = documentScannerInternalConfig;
    }

    public String toString() {
        return "DocumentScannerConfig(type=" + this.type + ", shouldStartAutomatically=" + this.shouldStartAutomatically + ", includeAngledSteps=" + this.includeAngledSteps + ", debugModeEnabled=" + this.debugModeEnabled + ", recordingType=" + this.recordingType + ", mrzValidationPolicy=" + this.mrzValidationPolicy + ", validationConfig=" + this.validationConfig + ", videoDuration=" + this.videoDuration + ", autoDetectStepDuration=" + this.autoDetectStepDuration + ", includeMotionData=" + this.includeMotionData + ")";
    }

    public /* synthetic */ DocumentScannerConfig(DocumentType documentType, boolean z11, boolean z12, boolean z13, RecordingType recordingType, MrzValidationPolicy mrzValidationPolicy, DocumentValidationConfig documentValidationConfig, VideoDuration videoDuration, long j11, boolean z14, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(documentType, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? true : z12, (i11 & 8) != 0 ? false : z13, (i11 & 16) != 0 ? RecordingType.VIDEO_ONLY : recordingType, (i11 & 32) != 0 ? MrzValidationPolicy.STRONG : mrzValidationPolicy, (i11 & 64) != 0 ? new DocumentValidationConfig(0, null, 3, null) : documentValidationConfig, (i11 & 128) != 0 ? VideoDuration.DEFAULT.INSTANCE : videoDuration, (i11 & 256) != 0 ? 40L : j11, (i11 & 512) != 0 ? false : z14);
    }
}
