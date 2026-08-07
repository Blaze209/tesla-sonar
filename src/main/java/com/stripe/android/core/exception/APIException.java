package com.stripe.android.core.exception;

import o30.StripeError;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0017\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/core/exception/APIException;", "Lcom/stripe/android/core/exception/StripeException;", "Lo30/f;", "stripeError", "", "requestId", "", "statusCode", "message", "", "cause", "<init>", "(Lo30/f;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V", "throwable", "(Ljava/lang/Throwable;)V", "a", "()Ljava/lang/String;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class APIException extends StripeException {
    public APIException() {
        this(null, null, 0, null, null, 31, null);
    }

    @Override // com.stripe.android.core.exception.StripeException
    public String a() {
        return "apiError";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ APIException(StripeError stripeError, String str, int i11, String str2, Throwable th2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        stripeError = (i12 & 1) != 0 ? null : stripeError;
        this(stripeError, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? stripeError != null ? stripeError.getMessage() : null : str2, (i12 & 16) != 0 ? null : th2);
    }

    public APIException(StripeError stripeError, String str, int i11, String str2, Throwable th2) {
        super(stripeError, str, i11, th2, str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public APIException(Throwable throwable) {
        this(null, null, 0, throwable.getMessage(), throwable, 7, null);
        s.k(throwable, "throwable");
    }
}
