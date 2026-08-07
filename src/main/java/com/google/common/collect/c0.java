package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
public final class c0 {
    public static <T> boolean a(Iterable<T> iterable, ou.q<? super T> qVar) {
        return d0.b(iterable.iterator(), qVar);
    }

    private static <E> Collection<E> b(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : f0.g(iterable.iterator());
    }

    public static <T> T c(Iterable<? extends T> iterable, T t11) {
        return (T) d0.m(iterable.iterator(), t11);
    }

    public static <T> T d(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return iterable instanceof SortedSet ? (T) ((SortedSet) iterable).last() : (T) d0.k(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) f(list);
    }

    public static <T> T e(Iterable<? extends T> iterable, T t11) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return t11;
            }
            if (iterable instanceof List) {
                return (T) f((List) iterable);
            }
            if (iterable instanceof SortedSet) {
                return (T) ((SortedSet) iterable).last();
            }
        }
        return (T) d0.l(iterable.iterator(), t11);
    }

    private static <T> T f(List<T> list) {
        return list.get(list.size() - 1);
    }

    public static <T> T g(Iterable<T> iterable) {
        return (T) d0.n(iterable.iterator());
    }

    public static <T> boolean h(Iterable<T> iterable, ou.q<? super T> qVar) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? i((List) iterable, (ou.q) ou.p.m(qVar)) : d0.r(iterable.iterator(), qVar);
    }

    private static <T> boolean i(List<T> list, ou.q<? super T> qVar) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < list.size()) {
            T t11 = list.get(i11);
            if (!qVar.apply(t11)) {
                if (i11 > i12) {
                    try {
                        list.set(i12, t11);
                    } catch (IllegalArgumentException unused) {
                        j(list, qVar, i12, i11);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        j(list, qVar, i12, i11);
                        return true;
                    }
                }
                i12++;
            }
            i11++;
        }
        list.subList(i12, list.size()).clear();
        return i11 != i12;
    }

    private static <T> void j(List<T> list, ou.q<? super T> qVar, int i11, int i12) {
        for (int size = list.size() - 1; size > i12; size--) {
            if (qVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            list.remove(i13);
        }
    }

    static Object[] k(Iterable<?> iterable) {
        return b(iterable).toArray();
    }
}
