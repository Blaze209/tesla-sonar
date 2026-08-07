package com.stripe.android.financialconnections.exception;

import com.stripe.android.core.exception.StripeException;
import o30.StripeError;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\b \u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006BK\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;", "Lcom/stripe/android/core/exception/StripeException;", "", "name", "stripeException", "<init>", "(Ljava/lang/String;Lcom/stripe/android/core/exception/StripeException;)V", "Lo30/f;", "stripeError", "requestId", "", "statusCode", "", "cause", "message", "(Ljava/lang/String;Lo30/f;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "f", "Ljava/lang/String;", "getName", "g", "Lcom/stripe/android/core/exception/StripeException;", "()Lcom/stripe/android/core/exception/StripeException;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class FinancialConnectionsError extends StripeException {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final StripeException stripeException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsError(String name, StripeException stripeException) {
        super(stripeException.getStripeError(), stripeException.getRequestId(), stripeException.getStatusCode(), stripeException.getCause(), stripeException.getMessage());
        s.k(name, "name");
        s.k(stripeException, "stripeException");
        this.name = name;
        this.stripeException = stripeException;
    }

    @Override // com.stripe.android.core.exception.StripeException
    public String a() {
        return "fcError";
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final StripeException getStripeException() {
        return this.stripeException;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FinancialConnectionsError(String str, StripeError stripeError, String str2, int i11, Throwable th2, String str3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        stripeError = (i12 & 2) != 0 ? null : stripeError;
        this(str, stripeError, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? 0 : i11, (i12 & 16) != 0 ? null : th2, (i12 & 32) != 0 ? stripeError != null ? stripeError.getMessage() : null : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsError(String name, StripeError stripeError, String str, int i11, Throwable th2, String str2) {
        this(name, new StripeException(stripeError, str, i11, th2, str2) { // from class: com.stripe.android.financialconnections.exception.FinancialConnectionsError.1
        });
        s.k(name, "name");
    }
}
