package com.stripe.android.financialconnections.exception;

import com.stripe.android.core.exception.StripeException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/exception/CustomManualEntryRequiredError;", "Lcom/stripe/android/core/exception/StripeException;", "<init>", "()V", "", "a", "()Ljava/lang/String;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CustomManualEntryRequiredError extends StripeException {
    public CustomManualEntryRequiredError() {
        super(null, null, 0, null, null, 31, null);
    }

    @Override // com.stripe.android.core.exception.StripeException
    public String a() {
        return "fcCustomManualEntryRequiredError";
    }
}
