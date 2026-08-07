package com.fourthline.vision.document.compose;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/fourthline/vision/document/compose/DocumentScannerControl;", "", "RestartScanner", "StartScanner", "TakeSnapshot", "ResetCurrentStep", "MoveToNextStep", "Lcom/fourthline/vision/document/compose/DocumentScannerControl$MoveToNextStep;", "Lcom/fourthline/vision/document/compose/DocumentScannerControl$ResetCurrentStep;", "Lcom/fourthline/vision/document/compose/DocumentScannerControl$RestartScanner;", "Lcom/fourthline/vision/document/compose/DocumentScannerControl$StartScanner;", "Lcom/fourthline/vision/document/compose/DocumentScannerControl$TakeSnapshot;", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DocumentScannerControl {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/vision/document/compose/DocumentScannerControl$MoveToNextStep;", "Lcom/fourthline/vision/document/compose/DocumentScannerControl;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MoveToNextStep implements DocumentScannerControl {
        public static final int $stable = 0;
        public static final MoveToNextStep INSTANCE = new MoveToNextStep();

        private MoveToNextStep() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof MoveToNextStep);
        }

        public int hashCode() {
            return -961381789;
        }

        public String toString() {
            return "MoveToNextStep";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/vision/document/compose/DocumentScannerControl$ResetCurrentStep;", "Lcom/fourthline/vision/document/compose/DocumentScannerControl;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ResetCurrentStep implements DocumentScannerControl {
        public static final int $stable = 0;
        public static final ResetCurrentStep INSTANCE = new ResetCurrentStep();

        private ResetCurrentStep() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ResetCurrentStep);
        }

        public int hashCode() {
            return -427732786;
        }

        public String toString() {
            return "ResetCurrentStep";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/vision/document/compose/DocumentScannerControl$RestartScanner;", "Lcom/fourthline/vision/document/compose/DocumentScannerControl;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RestartScanner implements DocumentScannerControl {
        public static final int $stable = 0;
        public static final RestartScanner INSTANCE = new RestartScanner();

        private RestartScanner() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof RestartScanner);
        }

        public int hashCode() {
            return 875161767;
        }

        public String toString() {
            return "RestartScanner";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/vision/document/compose/DocumentScannerControl$StartScanner;", "Lcom/fourthline/vision/document/compose/DocumentScannerControl;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StartScanner implements DocumentScannerControl {
        public static final int $stable = 0;
        public static final StartScanner INSTANCE = new StartScanner();

        private StartScanner() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof StartScanner);
        }

        public int hashCode() {
            return -2147017484;
        }

        public String toString() {
            return "StartScanner";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/vision/document/compose/DocumentScannerControl$TakeSnapshot;", "Lcom/fourthline/vision/document/compose/DocumentScannerControl;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TakeSnapshot implements DocumentScannerControl {
        public static final int $stable = 0;
        public static final TakeSnapshot INSTANCE = new TakeSnapshot();

        private TakeSnapshot() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof TakeSnapshot);
        }

        public int hashCode() {
            return -1412326109;
        }

        public String toString() {
            return "TakeSnapshot";
        }
    }
}
