package p013kotlin.collections;

import ezvcard.property.Gender;
import ho0.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u0;
import wn0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\n\u001a-\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\u000b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0010\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0010\u0010\u0006\u001a-\u0010\u0011\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0011\u0010\u0006\u001a1\u0010\u0015\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0013¢\u0006\u0004\b\u0015\u0010\u0016\u001a1\u0010\u0017\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0013¢\u0006\u0004\b\u0017\u0010\u0016\u001a;\u0010\u0019\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a!\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0007¢\u0006\u0004\b\u001e\u0010\u001d\u001a\u001f\u0010\u001f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0007¢\u0006\u0004\b\u001f\u0010\u001d\u001a!\u0010 \u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0007¢\u0006\u0004\b \u0010\u001d\u001a1\u0010!\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0013¢\u0006\u0004\b!\u0010\"\u001a;\u0010#\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"T", "", "", "elements", "", "E", "(Ljava/util/Collection;Ljava/lang/Iterable;)Z", "Lho0/i;", "D", "(Ljava/util/Collection;Lho0/i;)Z", "", Gender.FEMALE, "(Ljava/util/Collection;[Ljava/lang/Object;)Z", "", "G", "(Ljava/lang/Iterable;)Ljava/util/Collection;", "K", "R", "", "Lkotlin/Function1;", "predicate", "J", "(Ljava/lang/Iterable;Lwn0/l;)Z", "Q", "predicateResultToRemove", "H", "(Ljava/lang/Iterable;Lwn0/l;Z)Z", "", Gender.MALE, "(Ljava/util/List;)Ljava/lang/Object;", Gender.NONE, Gender.OTHER, "P", "L", "(Ljava/util/List;Lwn0/l;)Z", "I", "(Ljava/util/List;Lwn0/l;Z)Z", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
public class c0 extends b0 {
    public static <T> boolean D(Collection<? super T> collection, i<? extends T> elements) {
        s.k(collection, "<this>");
        s.k(elements, "elements");
        Iterator<? extends T> it = elements.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z11 = true;
            }
        }
        return z11;
    }

    public static <T> boolean E(Collection<? super T> collection, Iterable<? extends T> elements) {
        s.k(collection, "<this>");
        s.k(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        Iterator<? extends T> it = elements.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z11 = true;
            }
        }
        return z11;
    }

    public static <T> boolean F(Collection<? super T> collection, T[] elements) {
        s.k(collection, "<this>");
        s.k(elements, "elements");
        return collection.addAll(q.h(elements));
    }

    public static final <T> Collection<T> G(Iterable<? extends T> iterable) {
        s.k(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : g0.m1(iterable);
    }

    private static final <T> boolean H(Iterable<? extends T> iterable, l<? super T, Boolean> lVar, boolean z11) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            if (lVar.invoke(it.next()).booleanValue() == z11) {
                it.remove();
                z12 = true;
            }
        }
        return z12;
    }

    private static final <T> boolean I(List<T> list, l<? super T, Boolean> lVar, boolean z11) {
        int i11;
        if (!(list instanceof RandomAccess)) {
            s.i(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return H(u0.b(list), lVar, z11);
        }
        int iO = x.o(list);
        if (iO >= 0) {
            int i12 = 0;
            i11 = 0;
            while (true) {
                T t11 = list.get(i12);
                if (lVar.invoke(t11).booleanValue() != z11) {
                    if (i11 != i12) {
                        list.set(i11, t11);
                    }
                    i11++;
                }
                if (i12 == iO) {
                    break;
                }
                i12++;
            }
        } else {
            i11 = 0;
        }
        if (i11 >= list.size()) {
            return false;
        }
        int iO2 = x.o(list);
        if (i11 > iO2) {
            return true;
        }
        while (true) {
            list.remove(iO2);
            if (iO2 == i11) {
                return true;
            }
            iO2--;
        }
    }

    public static <T> boolean J(Iterable<? extends T> iterable, l<? super T, Boolean> predicate) {
        s.k(iterable, "<this>");
        s.k(predicate, "predicate");
        return H(iterable, predicate, true);
    }

    public static <T> boolean K(Collection<? super T> collection, Iterable<? extends T> elements) {
        s.k(collection, "<this>");
        s.k(elements, "elements");
        return collection.removeAll(G(elements));
    }

    public static <T> boolean L(List<T> list, l<? super T, Boolean> predicate) {
        s.k(list, "<this>");
        s.k(predicate, "predicate");
        return I(list, predicate, true);
    }

    public static <T> T M(List<T> list) {
        s.k(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static <T> T N(List<T> list) {
        s.k(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static <T> T O(List<T> list) {
        s.k(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(x.o(list));
    }

    public static <T> T P(List<T> list) {
        s.k(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(x.o(list));
    }

    public static <T> boolean Q(Iterable<? extends T> iterable, l<? super T, Boolean> predicate) {
        s.k(iterable, "<this>");
        s.k(predicate, "predicate");
        return H(iterable, predicate, false);
    }

    public static final <T> boolean R(Collection<? super T> collection, Iterable<? extends T> elements) {
        s.k(collection, "<this>");
        s.k(elements, "elements");
        return collection.retainAll(G(elements));
    }
}
