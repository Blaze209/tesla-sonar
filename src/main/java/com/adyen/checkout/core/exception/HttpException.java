package com.adyen.checkout.core.exception;

import com.adyen.checkout.core.internal.data.model.ErrorResponseBody;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/adyen/checkout/core/exception/HttpException;", "Lcom/adyen/checkout/core/exception/CheckoutException;", "", "code", "", "message", "Lcom/adyen/checkout/core/internal/data/model/ErrorResponseBody;", "errorBody", "<init>", "(ILjava/lang/String;Lcom/adyen/checkout/core/internal/data/model/ErrorResponseBody;)V", "a", "I", "()I", "b", "Lcom/adyen/checkout/core/internal/data/model/ErrorResponseBody;", "()Lcom/adyen/checkout/core/internal/data/model/ErrorResponseBody;", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HttpException extends CheckoutException {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ErrorResponseBody errorBody;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpException(int i11, String message, ErrorResponseBody errorResponseBody) {
        super(message, null, 2, null);
        s.k(message, "message");
        this.code = i11;
        this.errorBody = errorResponseBody;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ErrorResponseBody getErrorBody() {
        return this.errorBody;
    }
}
