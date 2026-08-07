package expo.modules.core.logging;

import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"localizedMessageWithCauseLocalizedMessage", "", "", "expo-modules-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LoggerUtilsKt {
    public static final String localizedMessageWithCauseLocalizedMessage(Throwable th2) {
        s.k(th2, "<this>");
        String localizedMessage = th2.getLocalizedMessage();
        Throwable cause = th2.getCause();
        return v.y0(v.r(localizedMessage, cause != null ? localizedMessageWithCauseLocalizedMessage(cause) : null), ": ", null, null, 0, null, null, 62, null);
    }
}
