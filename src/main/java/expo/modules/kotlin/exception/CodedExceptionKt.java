package expo.modules.kotlin.exception;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0086\b\u001a\u0015\u0010\u0003\u001a\u00020\u0004\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0001H\u0086\b¨\u0006\u0006"}, d2 = {"toCodedException", "Lexpo/modules/kotlin/exception/CodedException;", "", "errorCodeOf", "", "T", "expo-modules-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CodedExceptionKt {
    public static final /* synthetic */ <T extends CodedException> String errorCodeOf() {
        CodedException.Companion companion = CodedException.INSTANCE;
        s.q(4, "T");
        return companion.inferCode(CodedException.class);
    }

    public static final CodedException toCodedException(Throwable th2) {
        if (th2 == null) {
            return new UnexpectedException("Unknown error");
        }
        if (th2 instanceof CodedException) {
            return (CodedException) th2;
        }
        if (!(th2 instanceof expo.modules.core.errors.CodedException)) {
            return new UnexpectedException(th2);
        }
        expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) th2;
        String code = codedException.getCode();
        s.j(code, "getCode(...)");
        return new CodedException(code, codedException.getMessage(), codedException.getCause());
    }
}
