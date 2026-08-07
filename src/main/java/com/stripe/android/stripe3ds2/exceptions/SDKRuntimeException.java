package com.stripe.android.stripe3ds2.exceptions;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/stripe3ds2/exceptions/SDKRuntimeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "t", "", "(Ljava/lang/Throwable;)V", "message", "", "cause", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SDKRuntimeException extends RuntimeException {
    public /* synthetic */ SDKRuntimeException(String str, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SDKRuntimeException(String message, Throwable th2) {
        super(message, th2);
        s.k(message, "message");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SDKRuntimeException(Throwable t11) {
        s.k(t11, "t");
        String message = t11.getMessage();
        this(message == null ? "" : message, t11.getCause());
    }
}
