package com.adyen.checkout.core.exception;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/adyen/checkout/core/exception/CheckoutException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "errorMessage", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class CheckoutException extends RuntimeException {
    public /* synthetic */ CheckoutException(String str, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutException(String errorMessage, Throwable th2) {
        super(errorMessage, th2);
        s.k(errorMessage, "errorMessage");
    }
}
