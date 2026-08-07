package com.stripe.android.core.exception;

import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import o30.StripeError;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/core/exception/RateLimitException;", "Lcom/stripe/android/core/exception/StripeException;", "Lo30/f;", "stripeError", "", "requestId", "message", "", "cause", "<init>", "(Lo30/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "a", "()Ljava/lang/String;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RateLimitException extends StripeException {
    public RateLimitException() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.stripe.android.core.exception.StripeException
    public String a() {
        return "rateLimitError";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RateLimitException(StripeError stripeError, String str, String str2, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        stripeError = (i11 & 1) != 0 ? null : stripeError;
        str = (i11 & 2) != 0 ? null : str;
        if ((i11 & 4) != 0) {
            str2 = stripeError != null ? stripeError.getMessage() : null;
        }
        this(stripeError, str, str2, (i11 & 8) != 0 ? null : th2);
    }

    public RateLimitException(StripeError stripeError, String str, String str2, Throwable th2) {
        super(stripeError, str, HttpStatusCode.TOO_MANY_REQUESTS_429, th2, str2);
    }
}
