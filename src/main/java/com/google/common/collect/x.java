package com.google.common.collect;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
public abstract class x<E> extends w<E> implements List<E>, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e1<Object> f43719b = new b(u0.f43691e, 0);

    public static final class a<E> extends w.a<E> {
        public a() {
            this(4);
        }

        @Override // com.google.common.collect.w.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a<E> a(E e11) {
            super.d(e11);
            return this;
        }

        public a<E> i(E... eArr) {
            super.e(eArr);
            return this;
        }

        public a<E> j(Iterable<? extends E> iterable) {
            super.b(iterable);
            return this;
        }

        public x<E> k() {
            this.f43711c = true;
            return x.j(this.f43709a, this.f43710b);
        }

        x<E> l(Comparator<? super E> comparator) {
            this.f43711c = true;
            Arrays.sort(this.f43709a, 0, this.f43710b, comparator);
            return x.j(this.f43709a, this.f43710b);
        }

        a(int i11) {
            super(i11);
        }
    }

    private static final class b<E> extends com.google.common.collect.a<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final x<E> f43720c;

        b(x<E> xVar, int i11) {
            super(xVar.size(), i11);
            this.f43720c = xVar;
        }

        @Override // com.google.common.collect.a
        protected E a(int i11) {
            return this.f43720c.get(i11);
        }
    }

    private final class c extends x<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final transient int f43721c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final transient int f43722d;

        c(int i11, int i12) {
            this.f43721c = i11;
            this.f43722d = i12;
        }

        @Override // com.google.common.collect.w
        Object[] d() {
            return x.this.d();
        }

        @Override // com.google.common.collect.w
        int e() {
            return x.this.f() + this.f43721c + this.f43722d;
        }

        @Override // com.google.common.collect.w
        int f() {
            return x.this.f() + this.f43721c;
        }

        @Override // com.google.common.collect.w
        boolean g() {
            return true;
        }

        @Override // java.util.List
        public E get(int i11) {
            ou.p.k(i11, this.f43722d);
            return x.this.get(i11 + this.f43721c);
        }

        @Override // com.google.common.collect.x, com.google.common.collect.w, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.x, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f43722d;
        }

        @Override // com.google.common.collect.x, java.util.List
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public x<E> subList(int i11, int i12) {
            ou.p.q(i11, i12, this.f43722d);
            x xVar = x.this;
            int i13 = this.f43721c;
            return xVar.subList(i11 + i13, i12 + i13);
        }

        @Override // com.google.common.collect.x, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i11) {
            return super.listIterator(i11);
        }
    }

    x() {
    }

    static <E> x<E> i(Object[] objArr) {
        return j(objArr, objArr.length);
    }

    static <E> x<E> j(Object[] objArr, int i11) {
        return i11 == 0 ? r() : new u0(objArr, i11);
    }

    public static <E> a<E> k() {
        return new a<>();
    }

    public static <E> a<E> l(int i11) {
        k.b(i11, "expectedSize");
        return new a<>(i11);
    }

    private static <E> x<E> m(Object... objArr) {
        return i(q0.b(objArr));
    }

    public static <E> x<E> n(Collection<? extends E> collection) {
        if (!(collection instanceof w)) {
            return m(collection.toArray());
        }
        x<E> xVarA = ((w) collection).a();
        return xVarA.g() ? i(xVarA.toArray()) : xVarA;
    }

    public static <E> x<E> o(E[] eArr) {
        return eArr.length == 0 ? r() : m((Object[]) eArr.clone());
    }

    public static <E> x<E> r() {
        return (x<E>) u0.f43691e;
    }

    public static <E> x<E> s(E e11) {
        return m(e11);
    }

    public static <E> x<E> t(E e11, E e12) {
        return m(e11, e12);
    }

    public static <E> x<E> u(E e11, E e12, E e13) {
        return m(e11, e12, e13);
    }

    public static <E> x<E> v(E e11, E e12, E e13, E e14, E e15) {
        return m(e11, e12, e13, e14, e15);
    }

    public static <E> x<E> w(E e11, E e12, E e13, E e14, E e15, E e16, E e17) {
        return m(e11, e12, e13, e14, e15, e16, e17);
    }

    @SafeVarargs
    public static <E> x<E> x(E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19, E e21, E e22, E e23, E... eArr) {
        ou.p.e(eArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr = new Object[eArr.length + 12];
        objArr[0] = e11;
        objArr[1] = e12;
        objArr[2] = e13;
        objArr[3] = e14;
        objArr[4] = e15;
        objArr[5] = e16;
        objArr[6] = e17;
        objArr[7] = e18;
        objArr[8] = e19;
        objArr[9] = e21;
        objArr[10] = e22;
        objArr[11] = e23;
        System.arraycopy(eArr, 0, objArr, 12, eArr.length);
        return m(objArr);
    }

    public static <E> x<E> y(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        ou.p.m(comparator);
        Object[] objArrK = c0.k(iterable);
        q0.b(objArrK);
        Arrays.sort(objArrK, comparator);
        return i(objArrK);
    }

    x<E> A(int i11, int i12) {
        return new c(i11, i12 - i11);
    }

    @Override // com.google.common.collect.w
    @Deprecated
    public final x<E> a() {
        return this;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i11, E e11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i11, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.w
    int b(Object[] objArr, int i11) {
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            objArr[i11 + i12] = get(i12);
        }
        return i11 + size;
    }

    @Override // com.google.common.collect.w, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return f0.b(this, obj);
    }

    @Override // com.google.common.collect.w, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: h */
    public d1<E> iterator() {
        return listIterator();
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i11 = 1;
        for (int i12 = 0; i12 < size; i12++) {
            i11 = ~(~((i11 * 31) + get(i12).hashCode()));
        }
        return i11;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return f0.c(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return f0.e(this, obj);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public e1<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public e1<E> listIterator(int i11) {
        ou.p.o(i11, size());
        return isEmpty() ? (e1<E>) f43719b : new b(this, i11);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i11, E e11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: z */
    public x<E> subList(int i11, int i12) {
        ou.p.q(i11, i12, size());
        int i13 = i12 - i11;
        if (i13 == size()) {
            return this;
        }
        return i13 == 0 ? r() : A(i11, i12);
    }
}
