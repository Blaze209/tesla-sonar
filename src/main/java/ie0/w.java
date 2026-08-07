package ie0;

import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a1\u0010\u0005\u001a\u0004\u0018\u00010\u0004\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "", "value", "", "a", "(Ljava/util/List;Ljava/lang/Comparable;)Ljava/lang/Integer;", "utils_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class w {
    public static final <T extends Comparable<? super T>> Integer a(List<? extends T> list, T value) {
        p013kotlin.jvm.internal.s.k(list, "<this>");
        p013kotlin.jvm.internal.s.k(value, "value");
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = ((size - i11) / 2) + i11;
            if (p013kotlin.jvm.internal.s.f(list.get(i12), value)) {
                return Integer.valueOf(i12);
            }
            if (list.get(i12).compareTo(value) > 0) {
                i11 = i12 + 1;
            } else {
                size = i12;
            }
        }
        return null;
    }
}
