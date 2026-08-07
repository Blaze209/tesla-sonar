package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
public final class f0 {

    private static final class a<F, T> extends AbstractList<T> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<F> f43575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ou.h<? super F, ? extends T> f43576b;

        /* JADX INFO: renamed from: com.google.common.collect.f0$a$a, reason: collision with other inner class name */
        class C0683a extends c1<F, T> {
            C0683a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // com.google.common.collect.b1
            T a(F f11) {
                return a.this.f43576b.apply(f11);
            }
        }

        a(List<F> list, ou.h<? super F, ? extends T> hVar) {
            this.f43575a = (List) ou.p.m(list);
            this.f43576b = (ou.h) ou.p.m(hVar);
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i11) {
            return this.f43576b.apply(this.f43575a.get(i11));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f43575a.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i11) {
            return new C0683a(this.f43575a.listIterator(i11));
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i11) {
            return this.f43576b.apply(this.f43575a.remove(i11));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i11, int i12) {
            this.f43575a.subList(i11, i12).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f43575a.size();
        }
    }

    private static final class b<F, T> extends AbstractSequentialList<T> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<F> f43578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ou.h<? super F, ? extends T> f43579b;

        class a extends c1<F, T> {
            a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // com.google.common.collect.b1
            T a(F f11) {
                return b.this.f43579b.apply(f11);
            }
        }

        b(List<F> list, ou.h<? super F, ? extends T> hVar) {
            this.f43578a = (List) ou.p.m(list);
            this.f43579b = (ou.h) ou.p.m(hVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f43578a.isEmpty();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i11) {
            return new a(this.f43578a.listIterator(i11));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i11, int i12) {
            this.f43578a.subList(i11, i12).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f43578a.size();
        }
    }

    static int a(int i11) {
        k.b(i11, "arraySize");
        return ru.f.m(((long) i11) + 5 + ((long) (i11 / 10)));
    }

    static boolean b(List<?> list, Object obj) {
        if (obj == ou.p.m(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return d0.e(list.iterator(), list2.iterator());
        }
        for (int i11 = 0; i11 < size; i11++) {
            if (!Objects.equals(list.get(i11), list2.get(i11))) {
                return false;
            }
        }
        return true;
    }

    static int c(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return d(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (Objects.equals(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    private static int d(List<?> list, Object obj) {
        int size = list.size();
        int i11 = 0;
        if (obj == null) {
            while (i11 < size) {
                if (list.get(i11) == null) {
                    return i11;
                }
                i11++;
            }
            return -1;
        }
        while (i11 < size) {
            if (obj.equals(list.get(i11))) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    static int e(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return f(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (Objects.equals(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    private static int f(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static <E> ArrayList<E> g(Iterator<? extends E> it) {
        ArrayList<E> arrayList = new ArrayList<>();
        d0.a(arrayList, it);
        return arrayList;
    }

    @SafeVarargs
    public static <E> ArrayList<E> h(E... eArr) {
        ou.p.m(eArr);
        ArrayList<E> arrayList = new ArrayList<>(a(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    public static <E> ArrayList<E> i(int i11) {
        k.b(i11, "initialArraySize");
        return new ArrayList<>(i11);
    }

    public static <F, T> List<T> j(List<F> list, ou.h<? super F, ? extends T> hVar) {
        return list instanceof RandomAccess ? new a(list, hVar) : new b(list, hVar);
    }
}
