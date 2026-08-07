package com.adyen.threeds2;

import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/TransactionResult;", "", "Success", "Failure", "Lcom/adyen/threeds2/TransactionResult$Failure;", "Lcom/adyen/threeds2/TransactionResult$Success;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface TransactionResult {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/TransactionResult$Success;", "Lcom/adyen/threeds2/TransactionResult;", "transaction", "Lcom/adyen/threeds2/Transaction;", "<init>", "(Lcom/adyen/threeds2/Transaction;)V", "getTransaction", "()Lcom/adyen/threeds2/Transaction;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Success implements TransactionResult {
        private final Transaction transaction;

        public Success(Transaction transaction) {
            s.k(transaction, "transaction");
            this.transaction = transaction;
        }

        public final Transaction getTransaction() {
            return this.transaction;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/TransactionResult$Failure;", "Lcom/adyen/threeds2/TransactionResult;", "transactionStatus", "", "additionalDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTransactionStatus", "()Ljava/lang/String;", "getAdditionalDetails", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Failure implements TransactionResult {
        private final String additionalDetails;
        private final String transactionStatus;

        public Failure(String transactionStatus, String additionalDetails) {
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

        public /* synthetic */ Failure(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Gender.UNKNOWN : str, str2);
        }
    }
}
