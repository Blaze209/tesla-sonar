package com.fourthline.vision;

import com.fourthline.adapters.serialization.OrcaKeys;
import com.fourthline.vision.selfie.internal.domain.steps.HeadMetadata;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/fourthline/vision/VisionScannerEffect;", "", "OnLivenessStepCountUpdate", "OnLivenessStepSuccess", "OnLivenessStepUpdate", "OnHeadMoved", "Lcom/fourthline/vision/VisionScannerEffect$OnHeadMoved;", "Lcom/fourthline/vision/VisionScannerEffect$OnLivenessStepCountUpdate;", "Lcom/fourthline/vision/VisionScannerEffect$OnLivenessStepSuccess;", "Lcom/fourthline/vision/VisionScannerEffect$OnLivenessStepUpdate;", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface VisionScannerEffect {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/fourthline/vision/VisionScannerEffect$OnHeadMoved;", "Lcom/fourthline/vision/VisionScannerEffect;", "Lcom/fourthline/vision/selfie/internal/domain/steps/HeadMetadata;", OrcaKeys.METADATA, "<init>", "(Lcom/fourthline/vision/selfie/internal/domain/steps/HeadMetadata;)V", "component1", "()Lcom/fourthline/vision/selfie/internal/domain/steps/HeadMetadata;", "copy", "(Lcom/fourthline/vision/selfie/internal/domain/steps/HeadMetadata;)Lcom/fourthline/vision/VisionScannerEffect$OnHeadMoved;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/vision/selfie/internal/domain/steps/HeadMetadata;", "getMetadata", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnHeadMoved implements VisionScannerEffect {
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

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/fourthline/vision/VisionScannerEffect$OnLivenessStepCountUpdate;", "Lcom/fourthline/vision/VisionScannerEffect;", "", "count", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/fourthline/vision/VisionScannerEffect$OnLivenessStepCountUpdate;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getCount", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnLivenessStepCountUpdate implements VisionScannerEffect {
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

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/fourthline/vision/VisionScannerEffect$OnLivenessStepSuccess;", "Lcom/fourthline/vision/VisionScannerEffect;", "", "index", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/fourthline/vision/VisionScannerEffect$OnLivenessStepSuccess;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getIndex", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnLivenessStepSuccess implements VisionScannerEffect {
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

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/fourthline/vision/VisionScannerEffect$OnLivenessStepUpdate;", "Lcom/fourthline/vision/VisionScannerEffect;", "", "direction", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/fourthline/vision/VisionScannerEffect$OnLivenessStepUpdate;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getDirection", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnLivenessStepUpdate implements VisionScannerEffect {
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
