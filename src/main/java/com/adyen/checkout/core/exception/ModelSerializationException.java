package com.adyen.checkout.core.exception;

import org.json.JSONException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/core/exception/ModelSerializationException;", "Lcom/adyen/checkout/core/exception/CheckoutException;", "modelClass", "Ljava/lang/Class;", "cause", "Lorg/json/JSONException;", "(Ljava/lang/Class;Lorg/json/JSONException;)V", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ModelSerializationException extends CheckoutException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModelSerializationException(Class<?> modelClass, JSONException jSONException) {
        super("Unexpected exception while serializing " + modelClass.getSimpleName() + ".", jSONException);
        s.k(modelClass, "modelClass");
    }
}
