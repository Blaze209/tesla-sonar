package com.adyen.checkout.cse;

import com.adyen.checkout.core.exception.CheckoutException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/cse/EncryptionException;", "Lcom/adyen/checkout/core/exception/CheckoutException;", "message", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "cse_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EncryptionException extends CheckoutException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EncryptionException(String message, Throwable th2) {
        super(message, th2);
        s.k(message, "message");
    }
}
