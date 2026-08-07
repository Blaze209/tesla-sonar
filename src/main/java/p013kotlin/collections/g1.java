package p013kotlin.collections;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0006\u001a.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a4\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a.\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\t\u0010\u0004\u001a4\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\u0002¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"T", "", "element", "m", "(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;", "", "elements", "l", "(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;", "o", "n", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/SetsKt")
public class g1 extends f1 {
    public static <T> Set<T> l(Set<? extends T> set, Iterable<? extends T> elements) {
        s.k(set, "<this>");
        s.k(elements, "elements");
        Collection<?> collectionG = c0.G(elements);
        if (collectionG.isEmpty()) {
            return g0.r1(set);
        }
        if (!(collectionG instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionG);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (T t11 : set) {
            if (!((Set) collectionG).contains(t11)) {
                linkedHashSet2.add(t11);
            }
        }
        return linkedHashSet2;
    }

    public static <T> Set<T> m(Set<? extends T> set, T t11) {
        s.k(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(x0.e(set.size()));
        boolean z11 = false;
        for (T t12 : set) {
            boolean z12 = true;
            if (!z11 && s.f(t12, t11)) {
                z11 = true;
                z12 = false;
            }
            if (z12) {
                linkedHashSet.add(t12);
            }
        }
        return linkedHashSet;
    }

    public static <T> Set<T> n(Set<? extends T> set, Iterable<? extends T> elements) {
        int size;
        s.k(set, "<this>");
        s.k(elements, "elements");
        Integer numZ = y.z(elements);
        if (numZ != null) {
            size = set.size() + numZ.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(x0.e(size));
        linkedHashSet.addAll(set);
        c0.E(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static <T> Set<T> o(Set<? extends T> set, T t11) {
        s.k(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(x0.e(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t11);
        return linkedHashSet;
    }
}
