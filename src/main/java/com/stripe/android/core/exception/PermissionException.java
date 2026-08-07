package com.stripe.android.core.exception;

import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import o30.StripeError;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/core/exception/PermissionException;", "Lcom/stripe/android/core/exception/StripeException;", "Lo30/f;", "stripeError", "", "requestId", "<init>", "(Lo30/f;Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PermissionException extends StripeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionException(StripeError stripeError, String str) {
        super(stripeError, str, DownloaderService.STATUS_FORBIDDEN, null, null, 24, null);
        s.k(stripeError, "stripeError");
    }

    @Override // com.stripe.android.core.exception.StripeException
    public String a() {
        return "permissionError";
    }
}
