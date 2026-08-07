package com.fourthline.core.eid;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/fourthline/core/eid/EidAuthEvent;", "", "CardRequested", "CanGotReset", "Progress", "CompletedWithoutResult", "Completed", "Error", "Lcom/fourthline/core/eid/EidAuthEvent$CanGotReset;", "Lcom/fourthline/core/eid/EidAuthEvent$CardRequested;", "Lcom/fourthline/core/eid/EidAuthEvent$Completed;", "Lcom/fourthline/core/eid/EidAuthEvent$CompletedWithoutResult;", "Lcom/fourthline/core/eid/EidAuthEvent$Error;", "Lcom/fourthline/core/eid/EidAuthEvent$Progress;", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface EidAuthEvent {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/core/eid/EidAuthEvent$CanGotReset;", "Lcom/fourthline/core/eid/EidAuthEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CanGotReset implements EidAuthEvent {
        public static final CanGotReset INSTANCE = new CanGotReset();

        private CanGotReset() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CanGotReset);
        }

        public int hashCode() {
            return 210285025;
        }

        public String toString() {
            return "CanGotReset";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/core/eid/EidAuthEvent$CardRequested;", "Lcom/fourthline/core/eid/EidAuthEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CardRequested implements EidAuthEvent {
        public static final CardRequested INSTANCE = new CardRequested();

        private CardRequested() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CardRequested);
        }

        public int hashCode() {
            return -1383727988;
        }

        public String toString() {
            return "CardRequested";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/fourthline/core/eid/EidAuthEvent$Completed;", "Lcom/fourthline/core/eid/EidAuthEvent;", "Lcom/fourthline/core/eid/EidAuthResult;", "result", "<init>", "(Lcom/fourthline/core/eid/EidAuthResult;)V", "component1", "()Lcom/fourthline/core/eid/EidAuthResult;", "copy", "(Lcom/fourthline/core/eid/EidAuthResult;)Lcom/fourthline/core/eid/EidAuthEvent$Completed;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/core/eid/EidAuthResult;", "getResult", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Completed implements EidAuthEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final EidAuthResult result;

        public Completed(EidAuthResult result) {
            s.k(result, "result");
            this.result = result;
        }

        public static /* synthetic */ Completed copy$default(Completed completed, EidAuthResult eidAuthResult, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                eidAuthResult = completed.result;
            }
            return completed.copy(eidAuthResult);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final EidAuthResult getResult() {
            return this.result;
        }

        public final Completed copy(EidAuthResult result) {
            s.k(result, "result");
            return new Completed(result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Completed) && s.f(this.result, ((Completed) other).result);
        }

        public final EidAuthResult getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return "Completed(result=" + this.result + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/core/eid/EidAuthEvent$CompletedWithoutResult;", "Lcom/fourthline/core/eid/EidAuthEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CompletedWithoutResult implements EidAuthEvent {
        public static final CompletedWithoutResult INSTANCE = new CompletedWithoutResult();

        private CompletedWithoutResult() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CompletedWithoutResult);
        }

        public int hashCode() {
            return -218958868;
        }

        public String toString() {
            return "CompletedWithoutResult";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/fourthline/core/eid/EidAuthEvent$Error;", "Lcom/fourthline/core/eid/EidAuthEvent;", "Lcom/fourthline/core/eid/EidAuthError;", AnalyticsAttribute.Error, "<init>", "(Lcom/fourthline/core/eid/EidAuthError;)V", "component1", "()Lcom/fourthline/core/eid/EidAuthError;", "copy", "(Lcom/fourthline/core/eid/EidAuthError;)Lcom/fourthline/core/eid/EidAuthEvent$Error;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/core/eid/EidAuthError;", "getError", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error implements EidAuthEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final EidAuthError error;

        public Error(EidAuthError error) {
            s.k(error, "error");
            this.error = error;
        }

        public static /* synthetic */ Error copy$default(Error error, EidAuthError eidAuthError, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                eidAuthError = error.error;
            }
            return error.copy(eidAuthError);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final EidAuthError getError() {
            return this.error;
        }

        public final Error copy(EidAuthError error) {
            s.k(error, "error");
            return new Error(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && s.f(this.error, ((Error) other).error);
        }

        public final EidAuthError getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/fourthline/core/eid/EidAuthEvent$Progress;", "Lcom/fourthline/core/eid/EidAuthEvent;", "", "progressPercent", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/fourthline/core/eid/EidAuthEvent$Progress;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getProgressPercent", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Progress implements EidAuthEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int progressPercent;

        public Progress(int i11) {
            this.progressPercent = i11;
        }

        public static /* synthetic */ Progress copy$default(Progress progress, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = progress.progressPercent;
            }
            return progress.copy(i11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getProgressPercent() {
            return this.progressPercent;
        }

        public final Progress copy(int progressPercent) {
            return new Progress(progressPercent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Progress) && this.progressPercent == ((Progress) other).progressPercent;
        }

        public final int getProgressPercent() {
            return this.progressPercent;
        }

        public int hashCode() {
            return Integer.hashCode(this.progressPercent);
        }

        public String toString() {
            return "Progress(progressPercent=" + this.progressPercent + ")";
        }
    }
}
