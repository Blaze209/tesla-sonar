package expo.modules.kotlin.exception;

import co0.q;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lexpo/modules/kotlin/exception/IncompatibleArgTypeException;", "Lexpo/modules/kotlin/exception/CodedException;", "Lco0/q;", "argumentType", "desiredType", "", "cause", "<init>", "(Lco0/q;Lco0/q;Ljava/lang/Throwable;)V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IncompatibleArgTypeException extends CodedException {
    public /* synthetic */ IncompatibleArgTypeException(q qVar, q qVar2, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(qVar, qVar2, (i11 & 4) != 0 ? null : th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncompatibleArgTypeException(q argumentType, q desiredType, Throwable th2) {
        super("Argument type '" + argumentType + "' is not compatible with expected type '" + desiredType + "'.", th2);
        s.k(argumentType, "argumentType");
        s.k(desiredType, "desiredType");
    }
}
