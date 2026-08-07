package com.fourthline.vision;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/fourthline/vision/VisionScannerEvent;", "", "<init>", "()V", "RestartScanner", "StartScanner", "TakeSnapshot", "MoveToNextStep", "ResetCurrentStep", "Lcom/fourthline/vision/VisionScannerEvent$MoveToNextStep;", "Lcom/fourthline/vision/VisionScannerEvent$ResetCurrentStep;", "Lcom/fourthline/vision/VisionScannerEvent$RestartScanner;", "Lcom/fourthline/vision/VisionScannerEvent$StartScanner;", "Lcom/fourthline/vision/VisionScannerEvent$TakeSnapshot;", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class VisionScannerEvent {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/vision/VisionScannerEvent$MoveToNextStep;", "Lcom/fourthline/vision/VisionScannerEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MoveToNextStep extends VisionScannerEvent {
        public static final int $stable = 0;
        public static final MoveToNextStep INSTANCE = new MoveToNextStep();

        private MoveToNextStep() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof MoveToNextStep);
        }

        public int hashCode() {
            return -143279358;
        }

        public String toString() {
            return "MoveToNextStep";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/vision/VisionScannerEvent$ResetCurrentStep;", "Lcom/fourthline/vision/VisionScannerEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ResetCurrentStep extends VisionScannerEvent {
        public static final int $stable = 0;
        public static final ResetCurrentStep INSTANCE = new ResetCurrentStep();

        private ResetCurrentStep() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ResetCurrentStep);
        }

        public int hashCode() {
            return -210311763;
        }

        public String toString() {
            return "ResetCurrentStep";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/vision/VisionScannerEvent$RestartScanner;", "Lcom/fourthline/vision/VisionScannerEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RestartScanner extends VisionScannerEvent {
        public static final int $stable = 0;
        public static final RestartScanner INSTANCE = new RestartScanner();

        private RestartScanner() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof RestartScanner);
        }

        public int hashCode() {
            return 1693264198;
        }

        public String toString() {
            return "RestartScanner";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/vision/VisionScannerEvent$StartScanner;", "Lcom/fourthline/vision/VisionScannerEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StartScanner extends VisionScannerEvent {
        public static final int $stable = 0;
        public static final StartScanner INSTANCE = new StartScanner();

        private StartScanner() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof StartScanner);
        }

        public int hashCode() {
            return 1871706451;
        }

        public String toString() {
            return "StartScanner";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/vision/VisionScannerEvent$TakeSnapshot;", "Lcom/fourthline/vision/VisionScannerEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TakeSnapshot extends VisionScannerEvent {
        public static final int $stable = 0;
        public static final TakeSnapshot INSTANCE = new TakeSnapshot();

        private TakeSnapshot() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof TakeSnapshot);
        }

        public int hashCode() {
            return -1688569470;
        }

        public String toString() {
            return "TakeSnapshot";
        }
    }

    public /* synthetic */ VisionScannerEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private VisionScannerEvent() {
    }
}
