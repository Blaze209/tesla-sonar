package com.adyen.checkout.adyen3ds2;

import com.adyen.checkout.core.exception.ComponentException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/adyen3ds2/Cancelled3DS2Exception;", "Lcom/adyen/checkout/core/exception/ComponentException;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "a", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Cancelled3DS2Exception extends ComponentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cancelled3DS2Exception(String errorMessage) {
        super(errorMessage, null, 2, null);
        s.k(errorMessage, "errorMessage");
    }
}
