package com.stripe.android.financialconnections.exception;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/financialconnections/exception/AccountLoadError;", "Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;", "", "showManualEntry", "canRetry", "Lcom/stripe/android/financialconnections/model/q;", "institution", "Lcom/stripe/android/core/exception/StripeException;", "stripeException", "<init>", "(ZZLcom/stripe/android/financialconnections/model/q;Lcom/stripe/android/core/exception/StripeException;)V", "h", "Z", "j", "()Z", IntegerTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/financialconnections/model/q;", "()Lcom/stripe/android/financialconnections/model/q;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AccountLoadError extends FinancialConnectionsError {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean showManualEntry;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean canRetry;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final FinancialConnectionsInstitution institution;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountLoadError(boolean z11, boolean z12, FinancialConnectionsInstitution institution, StripeException stripeException) {
        super("AccountLoadError", stripeException);
        s.k(institution, "institution");
        s.k(stripeException, "stripeException");
        this.showManualEntry = z11;
        this.canRetry = z12;
        this.institution = institution;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getCanRetry() {
        return this.canRetry;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final FinancialConnectionsInstitution getInstitution() {
        return this.institution;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getShowManualEntry() {
        return this.showManualEntry;
    }
}
