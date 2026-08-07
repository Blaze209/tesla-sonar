package com.stripe.android.financialconnections.exception;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0006\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\r\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;", "Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;", "Lcom/stripe/android/financialconnections/model/q;", "institution", "", "showManualEntry", "isToday", "", "backUpAt", "Lcom/stripe/android/core/exception/StripeException;", "stripeException", "<init>", "(Lcom/stripe/android/financialconnections/model/q;ZZJLcom/stripe/android/core/exception/StripeException;)V", "h", "Lcom/stripe/android/financialconnections/model/q;", IntegerTokenConverter.CONVERTER_KEY, "()Lcom/stripe/android/financialconnections/model/q;", "Z", "j", "()Z", "k", "J", "()J", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InstitutionPlannedDowntimeError extends FinancialConnectionsError {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final FinancialConnectionsInstitution institution;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean showManualEntry;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean isToday;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long backUpAt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstitutionPlannedDowntimeError(FinancialConnectionsInstitution institution, boolean z11, boolean z12, long j11, StripeException stripeException) {
        super("InstitutionPlannedDowntimeError", stripeException);
        s.k(institution, "institution");
        s.k(stripeException, "stripeException");
        this.institution = institution;
        this.showManualEntry = z11;
        this.isToday = z12;
        this.backUpAt = j11;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getBackUpAt() {
        return this.backUpAt;
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
