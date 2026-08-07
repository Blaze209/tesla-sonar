package com.stripe.android.financialconnections.exception;

import com.stripe.android.core.exception.StripeException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/exception/AppInitializationError;", "Lcom/stripe/android/core/exception/StripeException;", "", "message", "<init>", "(Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AppInitializationError extends StripeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppInitializationError(String message) {
        super(null, null, 0, null, message);
        s.k(message, "message");
    }

    @Override // com.stripe.android.core.exception.StripeException
    public String a() {
        return "fcInitializationError";
    }
}
