package com.fourthline.core.eid;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/fourthline/core/eid/EidAuthError;", "", "IncorrectPin", "CardBlockedPukNeeded", "CardBlockedCanNeeded", "IncorrectCan", "CardConnectionLost", "ResultError", "Generic", "Lcom/fourthline/core/eid/EidAuthError$CardBlockedCanNeeded;", "Lcom/fourthline/core/eid/EidAuthError$CardBlockedPukNeeded;", "Lcom/fourthline/core/eid/EidAuthError$CardConnectionLost;", "Lcom/fourthline/core/eid/EidAuthError$Generic;", "Lcom/fourthline/core/eid/EidAuthError$IncorrectCan;", "Lcom/fourthline/core/eid/EidAuthError$IncorrectPin;", "Lcom/fourthline/core/eid/EidAuthError$ResultError;", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface EidAuthError {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/core/eid/EidAuthError$CardBlockedCanNeeded;", "Lcom/fourthline/core/eid/EidAuthError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CardBlockedCanNeeded implements EidAuthError {
        public static final CardBlockedCanNeeded INSTANCE = new CardBlockedCanNeeded();

        private CardBlockedCanNeeded() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CardBlockedCanNeeded);
        }

        public int hashCode() {
            return 1739664781;
        }

        public String toString() {
            return "CardBlockedCanNeeded";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/core/eid/EidAuthError$CardBlockedPukNeeded;", "Lcom/fourthline/core/eid/EidAuthError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CardBlockedPukNeeded implements EidAuthError {
        public static final CardBlockedPukNeeded INSTANCE = new CardBlockedPukNeeded();

        private CardBlockedPukNeeded() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CardBlockedPukNeeded);
        }

        public int hashCode() {
            return 1846517827;
        }

        public String toString() {
            return "CardBlockedPukNeeded";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/core/eid/EidAuthError$CardConnectionLost;", "Lcom/fourthline/core/eid/EidAuthError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CardConnectionLost implements EidAuthError {
        public static final CardConnectionLost INSTANCE = new CardConnectionLost();

        private CardConnectionLost() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CardConnectionLost);
        }

        public int hashCode() {
            return 1865062038;
        }

        public String toString() {
            return "CardConnectionLost";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/fourthline/core/eid/EidAuthError$Generic;", "Lcom/fourthline/core/eid/EidAuthError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/fourthline/core/eid/EidAuthError$Generic;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getMessage", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Generic implements EidAuthError {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String message;

        public Generic(String message) {
            s.k(message, "message");
            this.message = message;
        }

        public static /* synthetic */ Generic copy$default(Generic generic, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = generic.message;
            }
            return generic.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final Generic copy(String message) {
            s.k(message, "message");
            return new Generic(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Generic) && s.f(this.message, ((Generic) other).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "Generic(message=" + this.message + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/fourthline/core/eid/EidAuthError$IncorrectCan;", "Lcom/fourthline/core/eid/EidAuthError;", "", "retryCount", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/fourthline/core/eid/EidAuthError$IncorrectCan;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getRetryCount", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IncorrectCan implements EidAuthError {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int retryCount;

        public IncorrectCan(int i11) {
            this.retryCount = i11;
        }

        public static /* synthetic */ IncorrectCan copy$default(IncorrectCan incorrectCan, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = incorrectCan.retryCount;
            }
            return incorrectCan.copy(i11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        public final IncorrectCan copy(int retryCount) {
            return new IncorrectCan(retryCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IncorrectCan) && this.retryCount == ((IncorrectCan) other).retryCount;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public int hashCode() {
            return Integer.hashCode(this.retryCount);
        }

        public String toString() {
            return "IncorrectCan(retryCount=" + this.retryCount + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/fourthline/core/eid/EidAuthError$IncorrectPin;", "Lcom/fourthline/core/eid/EidAuthError;", "", "retryCount", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/fourthline/core/eid/EidAuthError$IncorrectPin;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getRetryCount", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IncorrectPin implements EidAuthError {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int retryCount;

        public IncorrectPin(int i11) {
            this.retryCount = i11;
        }

        public static /* synthetic */ IncorrectPin copy$default(IncorrectPin incorrectPin, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = incorrectPin.retryCount;
            }
            return incorrectPin.copy(i11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        public final IncorrectPin copy(int retryCount) {
            return new IncorrectPin(retryCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IncorrectPin) && this.retryCount == ((IncorrectPin) other).retryCount;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public int hashCode() {
            return Integer.hashCode(this.retryCount);
        }

        public String toString() {
            return "IncorrectPin(retryCount=" + this.retryCount + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/core/eid/EidAuthError$ResultError;", "Lcom/fourthline/core/eid/EidAuthError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ResultError implements EidAuthError {
        public static final ResultError INSTANCE = new ResultError();

        private ResultError() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ResultError);
        }

        public int hashCode() {
            return -1775118297;
        }

        public String toString() {
            return "ResultError";
        }
    }
}
