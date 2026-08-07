package p013kotlin.collections;

import bo0.j;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0002\u001a\u001f\u0010\u0003\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001f\u0010\u0006\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0004\u001a#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\nH\u0007¢\u0006\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"", "", "index", "X", "(Ljava/util/List;I)I", "Z", "Y", "T", "V", "(Ljava/util/List;)Ljava/util/List;", "", "W", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
public class d0 extends c0 {
    public static <T> List<T> V(List<? extends T> list) {
        s.k(list, "<this>");
        return new c1(list);
    }

    public static <T> List<T> W(List<T> list) {
        s.k(list, "<this>");
        return new b1(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int X(List<?> list, int i11) {
        if (i11 >= 0 && i11 <= x.o(list)) {
            return x.o(list) - i11;
        }
        throw new IndexOutOfBoundsException("Element index " + i11 + " must be in range [" + new j(0, x.o(list)) + "].");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Y(List<?> list, int i11) {
        return x.o(list) - i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Z(List<?> list, int i11) {
        if (i11 >= 0 && i11 <= list.size()) {
            return list.size() - i11;
        }
        throw new IndexOutOfBoundsException("Position index " + i11 + " must be in range [" + new j(0, list.size()) + "].");
    }
}
