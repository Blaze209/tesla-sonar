package androidx.core.uwb.exceptions;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/core/uwb/exceptions/UwbSystemCallbackException;", "Landroidx/core/uwb/exceptions/UwbApiException;", "message", "", "(Ljava/lang/String;)V", "uwb_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UwbSystemCallbackException extends UwbApiException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UwbSystemCallbackException(String message) {
        super(message);
        s.k(message, "message");
    }
}
