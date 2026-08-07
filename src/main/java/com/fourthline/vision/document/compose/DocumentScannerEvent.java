package com.fourthline.vision.document.compose;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.vision.document.DocumentScannerError;
import com.fourthline.vision.document.DocumentScannerResult;
import com.fourthline.vision.document.DocumentScannerStep;
import com.fourthline.vision.document.DocumentScannerStepError;
import com.fourthline.vision.document.DocumentScannerStepResult;
import com.fourthline.vision.document.DocumentScannerStepWarning;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/fourthline/vision/document/compose/DocumentScannerEvent;", "", "OnFail", "OnSuccess", "OnWarnings", "OnStepUpdate", "OnStepSuccess", "OnStepFail", "OnStepsCountUpdate", "Lcom/fourthline/vision/document/compose/DocumentScannerEvent$OnFail;", "Lcom/fourthline/vision/document/compose/DocumentScannerEvent$OnStepFail;", "Lcom/fourthline/vision/document/compose/DocumentScannerEvent$OnStepSuccess;", "Lcom/fourthline/vision/document/compose/DocumentScannerEvent$OnStepUpdate;", "Lcom/fourthline/vision/document/compose/DocumentScannerEvent$OnStepsCountUpdate;", "Lcom/fourthline/vision/document/compose/DocumentScannerEvent$OnSuccess;", "Lcom/fourthline/vision/document/compose/DocumentScannerEvent$OnWarnings;", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DocumentScannerEvent {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/fourthline/vision/document/compose/DocumentScannerEvent$OnFail;", "Lcom/fourthline/vision/document/compose/DocumentScannerEvent;", "Lcom/fourthline/vision/document/DocumentScannerError;", AnalyticsAttribute.Error, "<init>", "(Lcom/fourthline/vision/document/DocumentScannerError;)V", "component1", "()Lcom/fourthline/vision/document/DocumentScannerError;", "copy", "(Lcom/fourthline/vision/document/DocumentScannerError;)Lcom/fourthline/vision/document/compose/DocumentScannerEvent$OnFail;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/vision/document/DocumentScannerError;", "getError", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnFail implements DocumentScannerEvent {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final DocumentScannerError error;

        public OnFail(DocumentScannerError error) {
            s.k(error, "error");
            this.error = error;
        }

        public static /* synthetic */ OnFail copy$default(OnFail onFail, DocumentScannerError documentScannerError, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                documentScannerError = onFail.error;
            }
            return onFail.copy(documentScannerError);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final DocumentScannerError getError() {
            return this.error;
        }

        public final OnFail copy(DocumentScannerError error) {
            s.k(error, "error");
            return new OnFail(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnFail) && this.error == ((OnFail) other).error;
        }

        public final DocumentScannerError getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "OnFail(error=" + this.error + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/fourthline/vision/document/compose/DocumentScannerEvent$OnStepFail;", "Lcom/fourthline/vision/document/compose/DocumentScannerEvent;", "Lcom/fourthline/vision/document/DocumentScannerStepError;", AnalyticsAttribute.Error, "<init>", "(Lcom/fourthline/vision/document/DocumentScannerStepError;)V", "component1", "()Lcom/fourthline/vision/document/DocumentScannerStepError;", "copy", "(Lcom/fourthline/vision/document/DocumentScannerStepError;)Lcom/fourthline/vision/document/compose/DocumentScannerEvent$OnStepFail;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/vision/document/DocumentScannerStepError;", "getError", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnStepFail implements DocumentScannerEvent {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final DocumentScannerStepError error;

        public OnStepFail(DocumentScannerStepError error) {
            s.k(error, "error");
            this.error = error;
        }

        public static /* synthetic */ OnStepFail copy$default(OnStepFail onStepFail, DocumentScannerStepError documentScannerStepError, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                documentScannerStepError = onStepFail.error;
            }
            return onStepFail.copy(documentScannerStepError);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final DocumentScannerStepError getError() {
            return this.error;
        }

        public final OnStepFail copy(DocumentScannerStepError error) {
            s.k(error, "error");
            return new OnStepFail(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnStepFail) && this.error == ((OnStepFail) other).error;
        }

        public final DocumentScannerStepError getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "OnStepFail(error=" + this.error + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/fourthline/vision/document/compose/DocumentScannerEvent$OnStepSuccess;", "Lcom/fourthline/vision/document/compose/DocumentScannerEvent;", "Lcom/fourthline/vision/document/DocumentScannerStepResult;", "result", "<init>", "(Lcom/fourthline/vision/document/DocumentScannerStepResult;)V", "component1", "()Lcom/fourthline/vision/document/DocumentScannerStepResult;", "copy", "(Lcom/fourthline/vision/document/DocumentScannerStepResult;)Lcom/fourthline/vision/document/compose/DocumentScannerEvent$OnStepSuccess;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/vision/document/DocumentScannerStepResult;", "getResult", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnStepSuccess implements DocumentScannerEvent {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final DocumentScannerStepResult result;

        public OnStepSuccess(DocumentScannerStepResult result) {
            s.k(result, "result");
            this.result = result;
        }

        public static /* synthetic */ OnStepSuccess copy$default(OnStepSuccess onStepSuccess, DocumentScannerStepResult documentScannerStepResult, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                documentScannerStepResult = onStepSuccess.result;
            }
            return onStepSuccess.copy(documentScannerStepResult);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final DocumentScannerStepResult getResult() {
            return this.result;
        }

        public final OnStepSuccess copy(DocumentScannerStepResult result) {
            s.k(result, "result");
            return new OnStepSuccess(result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnStepSuccess) && s.f(this.result, ((OnStepSuccess) other).result);
        }

        public final DocumentScannerStepResult getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return "OnStepSuccess(result=" + this.result + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/fourthline/vision/document/compose/DocumentScannerEvent$OnStepUpdate;", "Lcom/fourthline/vision/document/compose/DocumentScannerEvent;", "Lcom/fourthline/vision/document/DocumentScannerStep;", "step", "<init>", "(Lcom/fourthline/vision/document/DocumentScannerStep;)V", "component1", "()Lcom/fourthline/vision/document/DocumentScannerStep;", "copy", "(Lcom/fourthline/vision/document/DocumentScannerStep;)Lcom/fourthline/vision/document/compose/DocumentScannerEvent$OnStepUpdate;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/vision/document/DocumentScannerStep;", "getStep", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnStepUpdate implements DocumentScannerEvent {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final DocumentScannerStep step;

        public OnStepUpdate(DocumentScannerStep step) {
            s.k(step, "step");
            this.step = step;
        }

        public static /* synthetic */ OnStepUpdate copy$default(OnStepUpdate onStepUpdate, DocumentScannerStep documentScannerStep, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                documentScannerStep = onStepUpdate.step;
            }
            return onStepUpdate.copy(documentScannerStep);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final DocumentScannerStep getStep() {
            return this.step;
        }

        public final OnStepUpdate copy(DocumentScannerStep step) {
            s.k(step, "step");
            return new OnStepUpdate(step);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnStepUpdate) && s.f(this.step, ((OnStepUpdate) other).step);
        }

        public final DocumentScannerStep getStep() {
            return this.step;
        }

        public int hashCode() {
            return this.step.hashCode();
        }

        public String toString() {
            return "OnStepUpdate(step=" + this.step + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/fourthline/vision/document/compose/DocumentScannerEvent$OnStepsCountUpdate;", "Lcom/fourthline/vision/document/compose/DocumentScannerEvent;", "", "count", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/fourthline/vision/document/compose/DocumentScannerEvent$OnStepsCountUpdate;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getCount", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnStepsCountUpdate implements DocumentScannerEvent {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int count;

        public OnStepsCountUpdate(int i11) {
            this.count = i11;
        }

        public static /* synthetic */ OnStepsCountUpdate copy$default(OnStepsCountUpdate onStepsCountUpdate, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = onStepsCountUpdate.count;
            }
            return onStepsCountUpdate.copy(i11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        public final OnStepsCountUpdate copy(int count) {
            return new OnStepsCountUpdate(count);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnStepsCountUpdate) && this.count == ((OnStepsCountUpdate) other).count;
        }

        public final int getCount() {
            return this.count;
        }

        public int hashCode() {
            return Integer.hashCode(this.count);
        }

        public String toString() {
            return "OnStepsCountUpdate(count=" + this.count + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/fourthline/vision/document/compose/DocumentScannerEvent$OnSuccess;", "Lcom/fourthline/vision/document/compose/DocumentScannerEvent;", "Lcom/fourthline/vision/document/DocumentScannerResult;", "result", "<init>", "(Lcom/fourthline/vision/document/DocumentScannerResult;)V", "component1", "()Lcom/fourthline/vision/document/DocumentScannerResult;", "copy", "(Lcom/fourthline/vision/document/DocumentScannerResult;)Lcom/fourthline/vision/document/compose/DocumentScannerEvent$OnSuccess;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/vision/document/DocumentScannerResult;", "getResult", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnSuccess implements DocumentScannerEvent {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final DocumentScannerResult result;

        public OnSuccess(DocumentScannerResult result) {
            s.k(result, "result");
            this.result = result;
        }

        public static /* synthetic */ OnSuccess copy$default(OnSuccess onSuccess, DocumentScannerResult documentScannerResult, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                documentScannerResult = onSuccess.result;
            }
            return onSuccess.copy(documentScannerResult);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final DocumentScannerResult getResult() {
            return this.result;
        }

        public final OnSuccess copy(DocumentScannerResult result) {
            s.k(result, "result");
            return new OnSuccess(result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnSuccess) && s.f(this.result, ((OnSuccess) other).result);
        }

        public final DocumentScannerResult getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return "OnSuccess(result=" + this.result + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/fourthline/vision/document/compose/DocumentScannerEvent$OnWarnings;", "Lcom/fourthline/vision/document/compose/DocumentScannerEvent;", "", "Lcom/fourthline/vision/document/DocumentScannerStepWarning;", "warnings", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/fourthline/vision/document/compose/DocumentScannerEvent$OnWarnings;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getWarnings", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnWarnings implements DocumentScannerEvent {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List warnings;

        public OnWarnings(List<? extends DocumentScannerStepWarning> warnings) {
            s.k(warnings, "warnings");
            this.warnings = warnings;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OnWarnings copy$default(OnWarnings onWarnings, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = onWarnings.warnings;
            }
            return onWarnings.copy(list);
        }

        public final List<DocumentScannerStepWarning> component1() {
            return this.warnings;
        }

        public final OnWarnings copy(List<? extends DocumentScannerStepWarning> warnings) {
            s.k(warnings, "warnings");
            return new OnWarnings(warnings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnWarnings) && s.f(this.warnings, ((OnWarnings) other).warnings);
        }

        public final List<DocumentScannerStepWarning> getWarnings() {
            return this.warnings;
        }

        public int hashCode() {
            return this.warnings.hashCode();
        }

        public String toString() {
            return "OnWarnings(warnings=" + this.warnings + ")";
        }
    }
}
