package p013kotlin.collections;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a-\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\t\u0010\u0007\u001a7\u0010\f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\nj\b\u0012\u0004\u0012\u00028\u0000`\u000b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\f\u0010\r\u001a7\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000ej\b\u0012\u0004\u0012\u00028\u0000`\u000f\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a)\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a7\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u00122\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0004\"\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\u0016\u0010\u0007\u001a%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"T", "", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/Set;", "", "elements", IntegerTokenConverter.CONVERTER_KEY, "([Ljava/lang/Object;)Ljava/util/Set;", "", "g", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "e", "([Ljava/lang/Object;)Ljava/util/HashSet;", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "f", "([Ljava/lang/Object;)Ljava/util/LinkedHashSet;", "", "element", "j", "(Ljava/lang/Object;)Ljava/util/Set;", "k", "h", "(Ljava/util/Set;)Ljava/util/Set;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/SetsKt")
public class f1 extends e1 {
    public static <T> Set<T> d() {
        return k0.f86483a;
    }

    public static <T> HashSet<T> e(T... elements) {
        s.k(elements, "elements");
        return (HashSet) s.p1(elements, new HashSet(x0.e(elements.length)));
    }

    public static <T> LinkedHashSet<T> f(T... elements) {
        s.k(elements, "elements");
        return (LinkedHashSet) s.p1(elements, new LinkedHashSet(x0.e(elements.length)));
    }

    public static <T> Set<T> g(T... elements) {
        s.k(elements, "elements");
        return (Set) s.p1(elements, new LinkedHashSet(x0.e(elements.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> h(Set<? extends T> set) {
        s.k(set, "<this>");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : e1.c(set.iterator().next());
        }
        return d();
    }

    public static <T> Set<T> i(T... elements) {
        s.k(elements, "elements");
        return s.J1(elements);
    }

    public static <T> Set<T> j(T t11) {
        return t11 != null ? e1.c(t11) : d();
    }

    public static <T> Set<T> k(T... elements) {
        s.k(elements, "elements");
        return (Set) s.i0(elements, new LinkedHashSet());
    }
}
