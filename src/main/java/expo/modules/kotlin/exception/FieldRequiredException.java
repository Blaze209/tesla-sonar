package expo.modules.kotlin.exception;

import co0.o;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/kotlin/exception/FieldRequiredException;", "Lexpo/modules/kotlin/exception/CodedException;", "Lco0/o;", "property", "<init>", "(Lco0/o;)V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FieldRequiredException extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FieldRequiredException(o<?, ?> property) {
        super("Value for field '" + property + "' is required, got nil", null, 2, null);
        s.k(property, "property");
    }
}
