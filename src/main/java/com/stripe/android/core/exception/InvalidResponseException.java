package com.stripe.android.core.exception;

import o30.StripeError;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/core/exception/InvalidResponseException;", "Lcom/stripe/android/core/exception/StripeException;", "Lo30/f;", "stripeError", "", "requestId", "", "statusCode", "message", "", "cause", "<init>", "(Lo30/f;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V", "a", "()Ljava/lang/String;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InvalidResponseException extends StripeException {
    public InvalidResponseException() {
        this(null, null, 0, null, null, 31, null);
    }

    @Override // com.stripe.android.core.exception.StripeException
    public String a() {
        return "invalidResponseError";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InvalidResponseException(StripeError stripeError, String str, int i11, String str2, Throwable th2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        stripeError = (i12 & 1) != 0 ? null : stripeError;
        this(stripeError, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? stripeError != null ? stripeError.getMessage() : null : str2, (i12 & 16) != 0 ? null : th2);
    }

    public InvalidResponseException(StripeError stripeError, String str, int i11, String str2, Throwable th2) {
        super(stripeError, str, i11, th2, str2);
    }
}
