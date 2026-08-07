package com.stripe.android.core.exception;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/core/exception/GenericStripeException;", "Lcom/stripe/android/core/exception/StripeException;", "", "cause", "", "analyticsValue", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "f", "Ljava/lang/String;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GenericStripeException extends StripeException {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String analyticsValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenericStripeException(Throwable cause, String str) {
        super(null, null, 0, cause, cause.getMessage(), 7, null);
        s.k(cause, "cause");
        this.analyticsValue = str;
    }

    @Override // com.stripe.android.core.exception.StripeException
    public String a() {
        String str = this.analyticsValue;
        return str == null ? "unknown" : str;
    }
}
