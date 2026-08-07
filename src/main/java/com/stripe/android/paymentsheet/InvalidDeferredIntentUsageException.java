package com.stripe.android.paymentsheet;

import com.stripe.android.core.exception.StripeException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/InvalidDeferredIntentUsageException;", "Lcom/stripe/android/core/exception/StripeException;", "<init>", "()V", "", "a", "()Ljava/lang/String;", "f", "Ljava/lang/String;", "getMessage", "message", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InvalidDeferredIntentUsageException extends StripeException {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String message;

    public InvalidDeferredIntentUsageException() {
        super(null, null, 0, null, null, 31, null);
        this.message = "It appears you are reusing an intent on every `createIntentCallback` call. You should either create a brand\nnew intent in `createIntentCallback` or update the existing intent with the new payment method ID.";
    }

    @Override // com.stripe.android.core.exception.StripeException
    public String a() {
        return "invalidDeferredIntentUsage";
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
