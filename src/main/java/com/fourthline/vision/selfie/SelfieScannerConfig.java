package com.fourthline.vision.selfie;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.vision.RecordingType;
import com.fourthline.vision.selfie.compose.SelfieScannerInternalConfig;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010\fR\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/fourthline/vision/selfie/SelfieScannerConfig;", "", "", "debugModeEnabled", "Lcom/fourthline/vision/RecordingType;", "recordingType", "Lcom/fourthline/vision/selfie/LivenessCheckType;", "livenessCheckType", "includeMotionData", "<init>", "(ZLcom/fourthline/vision/RecordingType;Lcom/fourthline/vision/selfie/LivenessCheckType;Z)V", "component1", "()Z", "component2", "()Lcom/fourthline/vision/RecordingType;", "component3", "()Lcom/fourthline/vision/selfie/LivenessCheckType;", "component4", "copy", "(ZLcom/fourthline/vision/RecordingType;Lcom/fourthline/vision/selfie/LivenessCheckType;Z)Lcom/fourthline/vision/selfie/SelfieScannerConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getDebugModeEnabled", "b", "Lcom/fourthline/vision/RecordingType;", "getRecordingType", "c", "Lcom/fourthline/vision/selfie/LivenessCheckType;", "getLivenessCheckType", DateTokenConverter.CONVERTER_KEY, "getIncludeMotionData", "Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig;", "e", "Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig;", "getInternalConfig", "()Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig;", "setInternalConfig", "(Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig;)V", "internalConfig", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SelfieScannerConfig {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean debugModeEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final RecordingType recordingType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final LivenessCheckType livenessCheckType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean includeMotionData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private SelfieScannerInternalConfig internalConfig;

    public SelfieScannerConfig() {
        this(false, null, null, false, 15, null);
    }

    public static /* synthetic */ SelfieScannerConfig copy$default(SelfieScannerConfig selfieScannerConfig, boolean z11, RecordingType recordingType, LivenessCheckType livenessCheckType, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = selfieScannerConfig.debugModeEnabled;
        }
        if ((i11 & 2) != 0) {
            recordingType = selfieScannerConfig.recordingType;
        }
        if ((i11 & 4) != 0) {
            livenessCheckType = selfieScannerConfig.livenessCheckType;
        }
        if ((i11 & 8) != 0) {
            z12 = selfieScannerConfig.includeMotionData;
        }
        return selfieScannerConfig.copy(z11, recordingType, livenessCheckType, z12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getDebugModeEnabled() {
        return this.debugModeEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RecordingType getRecordingType() {
        return this.recordingType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LivenessCheckType getLivenessCheckType() {
        return this.livenessCheckType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIncludeMotionData() {
        return this.includeMotionData;
    }

    public final SelfieScannerConfig copy(boolean debugModeEnabled, RecordingType recordingType, LivenessCheckType livenessCheckType, boolean includeMotionData) {
        s.k(recordingType, "recordingType");
        s.k(livenessCheckType, "livenessCheckType");
        return new SelfieScannerConfig(debugModeEnabled, recordingType, livenessCheckType, includeMotionData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelfieScannerConfig)) {
            return false;
        }
        SelfieScannerConfig selfieScannerConfig = (SelfieScannerConfig) other;
        return this.debugModeEnabled == selfieScannerConfig.debugModeEnabled && this.recordingType == selfieScannerConfig.recordingType && this.livenessCheckType == selfieScannerConfig.livenessCheckType && this.includeMotionData == selfieScannerConfig.includeMotionData;
    }

    public final boolean getDebugModeEnabled() {
        return this.debugModeEnabled;
    }

    public final boolean getIncludeMotionData() {
        return this.includeMotionData;
    }

    public final SelfieScannerInternalConfig getInternalConfig() {
        return this.internalConfig;
    }

    public final LivenessCheckType getLivenessCheckType() {
        return this.livenessCheckType;
    }

    public final RecordingType getRecordingType() {
        return this.recordingType;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.debugModeEnabled) * 31) + this.recordingType.hashCode()) * 31) + this.livenessCheckType.hashCode()) * 31) + Boolean.hashCode(this.includeMotionData);
    }

    public final void setInternalConfig(SelfieScannerInternalConfig selfieScannerInternalConfig) {
        s.k(selfieScannerInternalConfig, "<set-?>");
        this.internalConfig = selfieScannerInternalConfig;
    }

    public String toString() {
        return "SelfieScannerConfig(debugModeEnabled=" + this.debugModeEnabled + ", recordingType=" + this.recordingType + ", livenessCheckType=" + this.livenessCheckType + ", includeMotionData=" + this.includeMotionData + ")";
    }

    public SelfieScannerConfig(boolean z11, RecordingType recordingType, LivenessCheckType livenessCheckType, boolean z12) {
        s.k(recordingType, "recordingType");
        s.k(livenessCheckType, "livenessCheckType");
        this.debugModeEnabled = z11;
        this.recordingType = recordingType;
        this.livenessCheckType = livenessCheckType;
        this.includeMotionData = z12;
        this.internalConfig = new SelfieScannerInternalConfig(false, null, null, 7, null);
    }

    public /* synthetic */ SelfieScannerConfig(boolean z11, RecordingType recordingType, LivenessCheckType livenessCheckType, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? RecordingType.VIDEO_ONLY : recordingType, (i11 & 4) != 0 ? LivenessCheckType.HEAD_TURN : livenessCheckType, (i11 & 8) != 0 ? false : z12);
    }
}
