package com.stripe.android.core.exception;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/core/exception/MaxRetryReachedException;", "Lcom/stripe/android/core/exception/StripeException;", "", "message", "<init>", "(Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MaxRetryReachedException extends StripeException {
    /* JADX WARN: Multi-variable type inference failed */
    public MaxRetryReachedException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.stripe.android.core.exception.StripeException
    public String a() {
        return "maxRetryReachedError";
    }

    public MaxRetryReachedException(String str) {
        super(null, null, 0, null, str, 15, null);
    }

    public /* synthetic */ MaxRetryReachedException(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str);
    }
}
