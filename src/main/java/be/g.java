package be;

import com.adyen.checkout.core.exception.CheckoutException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0011\u0010\f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000b¨\u0006\r"}, d2 = {"Lbe/g;", "", "Lcom/adyen/checkout/core/exception/CheckoutException;", "exception", "<init>", "(Lcom/adyen/checkout/core/exception/CheckoutException;)V", "a", "Lcom/adyen/checkout/core/exception/CheckoutException;", "getException", "()Lcom/adyen/checkout/core/exception/CheckoutException;", "", "()Ljava/lang/String;", "errorMessage", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CheckoutException exception;

    public g(CheckoutException exception) {
        s.k(exception, "exception");
        this.exception = exception;
    }

    public final String a() {
        String message = this.exception.getMessage();
        return message == null ? "" : message;
    }
}
