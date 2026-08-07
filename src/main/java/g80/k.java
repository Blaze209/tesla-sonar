package g80;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"", "Lg80/j;", "a", "(Ljava/lang/Throwable;)Lg80/j;", "asPaymentSheetLoadingException", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class k {
    public static final j a(Throwable th2) {
        s.k(th2, "<this>");
        j jVar = th2 instanceof j ? (j) th2 : null;
        return jVar == null ? new j.Unknown(th2) : jVar;
    }
}
