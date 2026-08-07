package p013kotlin.collections;

import bo0.j;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import mn0.a;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;
import zn0.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\f\u0010\n\u001a7\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\rj\b\u0012\u0004\u0012\u00028\u0000`\u000e\"\u0004\b\u0000\u0010\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0000*\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a5\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0000*\u00020\u00112\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0001\"\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0015\u0010\n\u001a-\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001aG\u0010!\u001a\u00020\u001e\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001d*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00052\b\u0010\u0012\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"\u001aE\u0010%\u001a\u00020\u001e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001e0#¢\u0006\u0004\b%\u0010&\u001a'\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0002¢\u0006\u0004\b)\u0010*\u001a\u000f\u0010+\u001a\u00020(H\u0001¢\u0006\u0004\b+\u0010,\u001a\u000f\u0010-\u001a\u00020(H\u0001¢\u0006\u0004\b-\u0010,\"\u0019\u00101\u001a\u00020.*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b/\u00100\"!\u00104\u001a\u00020\u001e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00058F¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"T", "", "", IntegerTokenConverter.CONVERTER_KEY, "([Ljava/lang/Object;)Ljava/util/Collection;", "", "m", "()Ljava/util/List;", "elements", "p", "([Ljava/lang/Object;)Ljava/util/List;", "", "s", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "h", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "", "element", "q", "(Ljava/lang/Object;)Ljava/util/List;", "r", "", "Lzn0/c;", "random", "v", "(Ljava/lang/Iterable;Lzn0/c;)Ljava/util/List;", "t", "(Ljava/util/List;)Ljava/util/List;", "", "", "fromIndex", "toIndex", "k", "(Ljava/util/List;Ljava/lang/Comparable;II)I", "Lkotlin/Function1;", "comparison", "j", "(Ljava/util/List;IILwn0/l;)I", "size", "Ljn0/h0;", "u", "(III)V", "x", "()V", "w", "Lbo0/j;", "n", "(Ljava/util/Collection;)Lbo0/j;", "indices", "o", "(Ljava/util/List;)I", "lastIndex", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
public class x extends w {
    public static <T> ArrayList<T> h(T... elements) {
        s.k(elements, "elements");
        return elements.length == 0 ? new ArrayList<>() : new ArrayList<>(new l(elements, true));
    }

    public static final <T> Collection<T> i(T[] tArr) {
        s.k(tArr, "<this>");
        return new l(tArr, false);
    }

    public static <T> int j(List<? extends T> list, int i11, int i12, l<? super T, Integer> comparison) {
        s.k(list, "<this>");
        s.k(comparison, "comparison");
        u(list.size(), i11, i12);
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int iIntValue = comparison.invoke(list.get(i14)).intValue();
            if (iIntValue < 0) {
                i11 = i14 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final <T extends Comparable<? super T>> int k(List<? extends T> list, T t11, int i11, int i12) {
        s.k(list, "<this>");
        u(list.size(), i11, i12);
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int iD = a.d(list.get(i14), t11);
            if (iD < 0) {
                i11 = i14 + 1;
            } else {
                if (iD <= 0) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static /* synthetic */ int l(List list, Comparable comparable, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = list.size();
        }
        return k(list, comparable, i11, i12);
    }

    public static <T> List<T> m() {
        return i0.f86480a;
    }

    public static j n(Collection<?> collection) {
        s.k(collection, "<this>");
        return new j(0, collection.size() - 1);
    }

    public static <T> int o(List<? extends T> list) {
        s.k(list, "<this>");
        return list.size() - 1;
    }

    public static <T> List<T> p(T... elements) {
        s.k(elements, "elements");
        return elements.length > 0 ? q.h(elements) : m();
    }

    public static <T> List<T> q(T t11) {
        return t11 != null ? w.e(t11) : m();
    }

    public static <T> List<T> r(T... elements) {
        s.k(elements, "elements");
        return s.h0(elements);
    }

    public static <T> List<T> s(T... elements) {
        s.k(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new l(elements, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> t(List<? extends T> list) {
        s.k(list, "<this>");
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : w.e(list.get(0));
        }
        return m();
    }

    private static final void u(int i11, int i12, int i13) {
        if (i12 > i13) {
            throw new IllegalArgumentException("fromIndex (" + i12 + ") is greater than toIndex (" + i13 + ").");
        }
        if (i12 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i12 + ") is less than zero.");
        }
        if (i13 <= i11) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i13 + ") is greater than size (" + i11 + ").");
    }

    public static <T> List<T> v(Iterable<? extends T> iterable, c random) {
        s.k(iterable, "<this>");
        s.k(random, "random");
        List<T> listO1 = g0.o1(iterable);
        g0.S0(listO1, random);
        return listO1;
    }

    public static void w() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void x() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
