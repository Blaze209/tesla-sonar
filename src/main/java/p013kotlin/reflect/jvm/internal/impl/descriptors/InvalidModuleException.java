package p013kotlin.reflect.jvm.internal.impl.descriptors;

import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final class InvalidModuleException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidModuleException(String message) {
        super(message);
        s.k(message, "message");
    }
}
