package yr0;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\f\u001a\u00020\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"", "", "b", "(Ljava/lang/String;)I", "intOrZero", "", "c", "(Ljava/lang/String;)J", "longOrZero", "", "a", "(Ljava/lang/String;)D", "doubleOrZero", "utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {
    public static final double a(String str) {
        s.k(str, "<this>");
        Double dU = t.u(str);
        if (dU != null) {
            return dU.doubleValue();
        }
        return 0.0d;
    }

    public static final int b(String str) {
        s.k(str, "<this>");
        return (int) a(str);
    }

    public static final long c(String str) {
        s.k(str, "<this>");
        return (long) a(str);
    }
}
