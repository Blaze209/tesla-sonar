package com.stripe.android.financialconnections.exception;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;", "Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;", "", "accountsCount", "Lcom/stripe/android/financialconnections/model/q;", "institution", "", "merchantName", "Lcom/stripe/android/core/exception/StripeException;", "stripeException", "<init>", "(ILcom/stripe/android/financialconnections/model/q;Ljava/lang/String;Lcom/stripe/android/core/exception/StripeException;)V", "h", "I", "()I", IntegerTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/financialconnections/model/q;", "()Lcom/stripe/android/financialconnections/model/q;", "j", "Ljava/lang/String;", "()Ljava/lang/String;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AccountNoneEligibleForPaymentMethodError extends FinancialConnectionsError {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int accountsCount;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final FinancialConnectionsInstitution institution;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final String merchantName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountNoneEligibleForPaymentMethodError(int i11, FinancialConnectionsInstitution institution, String merchantName, StripeException stripeException) {
        super("AccountNoneEligibleForPaymentMethodError", stripeException);
        s.k(institution, "institution");
        s.k(merchantName, "merchantName");
        s.k(stripeException, "stripeException");
        this.accountsCount = i11;
        this.institution = institution;
        this.merchantName = merchantName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getAccountsCount() {
        return this.accountsCount;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final FinancialConnectionsInstitution getInstitution() {
        return this.institution;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getMerchantName() {
        return this.merchantName;
    }
}
