package com.fourthline.vision.selfie.compose;

import com.fourthline.adapters.serialization.OrcaKeys;
import com.fourthline.vision.selfie.internal.domain.steps.HeadMetadata;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000f¨\u0006$"}, d2 = {"Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig;", "", "", "cameraX", "", "preferredVideoRecordingBitrate", "Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness;", "randomnessLiveness", "<init>", "(ZLjava/lang/Integer;Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness;)V", "component1", "()Z", "component2", "()Ljava/lang/Integer;", "component3", "()Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness;", "copy", "(ZLjava/lang/Integer;Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness;)Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getCameraX", "b", "Ljava/lang/Integer;", "getPreferredVideoRecordingBitrate", "c", "Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness;", "getRandomnessLiveness", "RandomnessLiveness", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SelfieScannerInternalConfig {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean cameraX;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer preferredVideoRecordingBitrate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final RandomnessLiveness randomnessLiveness;

    public SelfieScannerInternalConfig() {
        this(false, null, null, 7, null);
    }

    public static /* synthetic */ SelfieScannerInternalConfig copy$default(SelfieScannerInternalConfig selfieScannerInternalConfig, boolean z11, Integer num, RandomnessLiveness randomnessLiveness, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = selfieScannerInternalConfig.cameraX;
        }
        if ((i11 & 2) != 0) {
            num = selfieScannerInternalConfig.preferredVideoRecordingBitrate;
        }
        if ((i11 & 4) != 0) {
            randomnessLiveness = selfieScannerInternalConfig.randomnessLiveness;
        }
        return selfieScannerInternalConfig.copy(z11, num, randomnessLiveness);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getCameraX() {
        return this.cameraX;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getPreferredVideoRecordingBitrate() {
        return this.preferredVideoRecordingBitrate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RandomnessLiveness getRandomnessLiveness() {
        return this.randomnessLiveness;
    }

    public final SelfieScannerInternalConfig copy(boolean cameraX, Integer preferredVideoRecordingBitrate, RandomnessLiveness randomnessLiveness) {
        return new SelfieScannerInternalConfig(cameraX, preferredVideoRecordingBitrate, randomnessLiveness);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelfieScannerInternalConfig)) {
            return false;
        }
        SelfieScannerInternalConfig selfieScannerInternalConfig = (SelfieScannerInternalConfig) other;
        return this.cameraX == selfieScannerInternalConfig.cameraX && s.f(this.preferredVideoRecordingBitrate, selfieScannerInternalConfig.preferredVideoRecordingBitrate) && s.f(this.randomnessLiveness, selfieScannerInternalConfig.randomnessLiveness);
    }

    public final boolean getCameraX() {
        return this.cameraX;
    }

    public final Integer getPreferredVideoRecordingBitrate() {
        return this.preferredVideoRecordingBitrate;
    }

    public final RandomnessLiveness getRandomnessLiveness() {
        return this.randomnessLiveness;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.cameraX) * 31;
        Integer num = this.preferredVideoRecordingBitrate;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        RandomnessLiveness randomnessLiveness = this.randomnessLiveness;
        return iHashCode2 + (randomnessLiveness != null ? randomnessLiveness.hashCode() : 0);
    }

    public String toString() {
        return "SelfieScannerInternalConfig(cameraX=" + this.cameraX + ", preferredVideoRecordingBitrate=" + this.preferredVideoRecordingBitrate + ", randomnessLiveness=" + this.randomnessLiveness + ")";
    }

    public SelfieScannerInternalConfig(boolean z11, Integer num, RandomnessLiveness randomnessLiveness) {
        this.cameraX = z11;
        this.preferredVideoRecordingBitrate = num;
        this.randomnessLiveness = randomnessLiveness;
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 B-\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ8\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\fR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000e¨\u0006!"}, d2 = {"Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness;", "", "", "", "sessionRandomnessLivenessSteps", "Lkotlin/Function1;", "Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent;", "Ljn0/h0;", "callback", "<init>", "(Ljava/util/List;Lwn0/l;)V", "component1", "()Ljava/util/List;", "component2", "()Lwn0/l;", "copy", "(Ljava/util/List;Lwn0/l;)Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getSessionRandomnessLivenessSteps", "b", "Lwn0/l;", "getCallback", "RandomnessLivenessEvent", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RandomnessLiveness {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List sessionRandomnessLivenessSteps;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l callback;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent;", "", "OnLivenessStepCountUpdate", "OnLivenessStepSuccess", "OnLivenessStepUpdate", "OnHeadMoved", "Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent$OnHeadMoved;", "Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent$OnLivenessStepCountUpdate;", "Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent$OnLivenessStepSuccess;", "Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent$OnLivenessStepUpdate;", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface RandomnessLivenessEvent {

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent$OnHeadMoved;", "Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent;", "Lcom/fourthline/vision/selfie/internal/domain/steps/HeadMetadata;", OrcaKeys.METADATA, "<init>", "(Lcom/fourthline/vision/selfie/internal/domain/steps/HeadMetadata;)V", "component1", "()Lcom/fourthline/vision/selfie/internal/domain/steps/HeadMetadata;", "copy", "(Lcom/fourthline/vision/selfie/internal/domain/steps/HeadMetadata;)Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent$OnHeadMoved;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/vision/selfie/internal/domain/steps/HeadMetadata;", "getMetadata", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class OnHeadMoved implements RandomnessLivenessEvent {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final HeadMetadata metadata;

                public OnHeadMoved(HeadMetadata metadata) {
                    s.k(metadata, "metadata");
                    this.metadata = metadata;
                }

                public static /* synthetic */ OnHeadMoved copy$default(OnHeadMoved onHeadMoved, HeadMetadata headMetadata, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        headMetadata = onHeadMoved.metadata;
                    }
                    return onHeadMoved.copy(headMetadata);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final HeadMetadata getMetadata() {
                    return this.metadata;
                }

                public final OnHeadMoved copy(HeadMetadata metadata) {
                    s.k(metadata, "metadata");
                    return new OnHeadMoved(metadata);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof OnHeadMoved) && s.f(this.metadata, ((OnHeadMoved) other).metadata);
                }

                public final HeadMetadata getMetadata() {
                    return this.metadata;
                }

                public int hashCode() {
                    return this.metadata.hashCode();
                }

                public String toString() {
                    return "OnHeadMoved(metadata=" + this.metadata + ")";
                }
            }

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent$OnLivenessStepCountUpdate;", "Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent;", "", "count", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent$OnLivenessStepCountUpdate;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getCount", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class OnLivenessStepCountUpdate implements RandomnessLivenessEvent {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final int count;

                public OnLivenessStepCountUpdate(int i11) {
                    this.count = i11;
                }

                public static /* synthetic */ OnLivenessStepCountUpdate copy$default(OnLivenessStepCountUpdate onLivenessStepCountUpdate, int i11, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        i11 = onLivenessStepCountUpdate.count;
                    }
                    return onLivenessStepCountUpdate.copy(i11);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final int getCount() {
                    return this.count;
                }

                public final OnLivenessStepCountUpdate copy(int count) {
                    return new OnLivenessStepCountUpdate(count);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof OnLivenessStepCountUpdate) && this.count == ((OnLivenessStepCountUpdate) other).count;
                }

                public final int getCount() {
                    return this.count;
                }

                public int hashCode() {
                    return Integer.hashCode(this.count);
                }

                public String toString() {
                    return "OnLivenessStepCountUpdate(count=" + this.count + ")";
                }
            }

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent$OnLivenessStepSuccess;", "Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent;", "", "index", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent$OnLivenessStepSuccess;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getIndex", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class OnLivenessStepSuccess implements RandomnessLivenessEvent {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final int index;

                public OnLivenessStepSuccess(int i11) {
                    this.index = i11;
                }

                public static /* synthetic */ OnLivenessStepSuccess copy$default(OnLivenessStepSuccess onLivenessStepSuccess, int i11, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        i11 = onLivenessStepSuccess.index;
                    }
                    return onLivenessStepSuccess.copy(i11);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final int getIndex() {
                    return this.index;
                }

                public final OnLivenessStepSuccess copy(int index) {
                    return new OnLivenessStepSuccess(index);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof OnLivenessStepSuccess) && this.index == ((OnLivenessStepSuccess) other).index;
                }

                public final int getIndex() {
                    return this.index;
                }

                public int hashCode() {
                    return Integer.hashCode(this.index);
                }

                public String toString() {
                    return "OnLivenessStepSuccess(index=" + this.index + ")";
                }
            }

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent$OnLivenessStepUpdate;", "Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent;", "", "direction", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent$OnLivenessStepUpdate;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getDirection", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class OnLivenessStepUpdate implements RandomnessLivenessEvent {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final int direction;

                public OnLivenessStepUpdate(int i11) {
                    this.direction = i11;
                }

                public static /* synthetic */ OnLivenessStepUpdate copy$default(OnLivenessStepUpdate onLivenessStepUpdate, int i11, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        i11 = onLivenessStepUpdate.direction;
                    }
                    return onLivenessStepUpdate.copy(i11);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final int getDirection() {
                    return this.direction;
                }

                public final OnLivenessStepUpdate copy(int direction) {
                    return new OnLivenessStepUpdate(direction);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof OnLivenessStepUpdate) && this.direction == ((OnLivenessStepUpdate) other).direction;
                }

                public final int getDirection() {
                    return this.direction;
                }

                public int hashCode() {
                    return Integer.hashCode(this.direction);
                }

                public String toString() {
                    return "OnLivenessStepUpdate(direction=" + this.direction + ")";
                }
            }
        }

        public RandomnessLiveness(List<Integer> list, l<? super RandomnessLivenessEvent, h0> callback) {
            s.k(callback, "callback");
            this.sessionRandomnessLivenessSteps = list;
            this.callback = callback;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RandomnessLiveness copy$default(RandomnessLiveness randomnessLiveness, List list, l lVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = randomnessLiveness.sessionRandomnessLivenessSteps;
            }
            if ((i11 & 2) != 0) {
                lVar = randomnessLiveness.callback;
            }
            return randomnessLiveness.copy(list, lVar);
        }

        public final List<Integer> component1() {
            return this.sessionRandomnessLivenessSteps;
        }

        public final l<RandomnessLivenessEvent, h0> component2() {
            return this.callback;
        }

        public final RandomnessLiveness copy(List<Integer> sessionRandomnessLivenessSteps, l<? super RandomnessLivenessEvent, h0> callback) {
            s.k(callback, "callback");
            return new RandomnessLiveness(sessionRandomnessLivenessSteps, callback);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RandomnessLiveness)) {
                return false;
            }
            RandomnessLiveness randomnessLiveness = (RandomnessLiveness) other;
            return s.f(this.sessionRandomnessLivenessSteps, randomnessLiveness.sessionRandomnessLivenessSteps) && s.f(this.callback, randomnessLiveness.callback);
        }

        public final l<RandomnessLivenessEvent, h0> getCallback() {
            return this.callback;
        }

        public final List<Integer> getSessionRandomnessLivenessSteps() {
            return this.sessionRandomnessLivenessSteps;
        }

        public int hashCode() {
            List list = this.sessionRandomnessLivenessSteps;
            return ((list == null ? 0 : list.hashCode()) * 31) + this.callback.hashCode();
        }

        public String toString() {
            return "RandomnessLiveness(sessionRandomnessLivenessSteps=" + this.sessionRandomnessLivenessSteps + ", callback=" + this.callback + ")";
        }

        public /* synthetic */ RandomnessLiveness(List list, l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : list, lVar);
        }
    }

    public /* synthetic */ SelfieScannerInternalConfig(boolean z11, Integer num, RandomnessLiveness randomnessLiveness, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : randomnessLiveness);
    }
}
