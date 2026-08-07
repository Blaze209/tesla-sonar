package tp0;

import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltp0/c;", "", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface c {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static Double a(c cVar, Object obj, l<? super List<Double>, Double> operation) {
            List listL0;
            s.k(operation, "operation");
            List<Double> listB = obj != null ? yr0.a.b(obj) : null;
            List listL1 = listB != null ? v.l0(listB) : null;
            if (!s.f(listL1 != null ? Integer.valueOf(listL1.size()) : null, listB != null ? Integer.valueOf(listB.size()) : null) || listB == null || (listL0 = v.l0(listB)) == null) {
                return null;
            }
            return operation.invoke(listL0);
        }
    }
}
