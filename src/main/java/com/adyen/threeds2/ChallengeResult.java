package com.adyen.threeds2;

import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/ChallengeResult;", "", "Completed", "Cancelled", "Error", "Timeout", "Lcom/adyen/threeds2/ChallengeResult$Cancelled;", "Lcom/adyen/threeds2/ChallengeResult$Completed;", "Lcom/adyen/threeds2/ChallengeResult$Error;", "Lcom/adyen/threeds2/ChallengeResult$Timeout;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ChallengeResult {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/ChallengeResult$Completed;", "Lcom/adyen/threeds2/ChallengeResult;", "transactionStatus", "", "<init>", "(Ljava/lang/String;)V", "getTransactionStatus", "()Ljava/lang/String;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Completed implements ChallengeResult {
        private final String transactionStatus;

        public Completed(String transactionStatus) {
            s.k(transactionStatus, "transactionStatus");
            this.transactionStatus = transactionStatus;
        }

        public final String getTransactionStatus() {
            return this.transactionStatus;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/ChallengeResult$Cancelled;", "Lcom/adyen/threeds2/ChallengeResult;", "transactionStatus", "", "additionalDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTransactionStatus", "()Ljava/lang/String;", "getAdditionalDetails", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Cancelled implements ChallengeResult {
        private final String additionalDetails;
        private final String transactionStatus;

        public Cancelled(String transactionStatus, String additionalDetails) {
            s.k(transactionStatus, "transactionStatus");
            s.k(additionalDetails, "additionalDetails");
            this.transactionStatus = transactionStatus;
            this.additionalDetails = additionalDetails;
        }

        public final String getAdditionalDetails() {
            return this.additionalDetails;
        }

        public final String getTransactionStatus() {
            return this.transactionStatus;
        }

        public /* synthetic */ Cancelled(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Gender.UNKNOWN : str, str2);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/ChallengeResult$Error;", "Lcom/adyen/threeds2/ChallengeResult;", "transactionStatus", "", "additionalDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTransactionStatus", "()Ljava/lang/String;", "getAdditionalDetails", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error implements ChallengeResult {
        private final String additionalDetails;
        private final String transactionStatus;

        public Error(String transactionStatus, String additionalDetails) {
            s.k(transactionStatus, "transactionStatus");
            s.k(additionalDetails, "additionalDetails");
            this.transactionStatus = transactionStatus;
            this.additionalDetails = additionalDetails;
        }

        public final String getAdditionalDetails() {
            return this.additionalDetails;
        }

        public final String getTransactionStatus() {
            return this.transactionStatus;
        }

        public /* synthetic */ Error(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Gender.UNKNOWN : str, str2);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/ChallengeResult$Timeout;", "Lcom/adyen/threeds2/ChallengeResult;", "transactionStatus", "", "additionalDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTransactionStatus", "()Ljava/lang/String;", "getAdditionalDetails", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Timeout implements ChallengeResult {
        private final String additionalDetails;
        private final String transactionStatus;

        public Timeout(String transactionStatus, String additionalDetails) {
            s.k(transactionStatus, "transactionStatus");
            s.k(additionalDetails, "additionalDetails");
            this.transactionStatus = transactionStatus;
            this.additionalDetails = additionalDetails;
        }

        public final String getAdditionalDetails() {
            return this.additionalDetails;
        }

        public final String getTransactionStatus() {
            return this.transactionStatus;
        }

        public /* synthetic */ Timeout(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Gender.UNKNOWN : str, str2);
        }
    }
}
