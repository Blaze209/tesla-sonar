package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: loaded from: classes5.dex */
public abstract class w<E> extends AbstractCollection<E> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object[] f43708a = new Object[0];

    static abstract class a<E> extends b<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object[] f43709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f43710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f43711c;

        a(int i11) {
            k.b(i11, "initialCapacity");
            this.f43709a = new Object[i11];
            this.f43710b = 0;
        }

        private void g(int i11) {
            Object[] objArr = this.f43709a;
            int iC = b.c(objArr.length, this.f43710b + i11);
            if (iC > objArr.length || this.f43711c) {
                this.f43709a = Arrays.copyOf(this.f43709a, iC);
                this.f43711c = false;
            }
        }

        @Override // com.google.common.collect.w.b
        public b<E> b(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                g(collection.size());
                if (collection instanceof w) {
                    this.f43710b = ((w) collection).b(this.f43709a, this.f43710b);
                    return this;
                }
            }
            super.b(iterable);
            return this;
        }

        public a<E> d(E e11) {
            ou.p.m(e11);
            g(1);
            Object[] objArr = this.f43709a;
            int i11 = this.f43710b;
            this.f43710b = i11 + 1;
            objArr[i11] = e11;
            return this;
        }

        public b<E> e(E... eArr) {
            f(eArr, eArr.length);
            return this;
        }

        final void f(Object[] objArr, int i11) {
            q0.c(objArr, i11);
            g(i11);
            System.arraycopy(objArr, 0, this.f43709a, this.f43710b, i11);
            this.f43710b += i11;
        }
    }

    public static abstract class b<E> {
        b() {
        }

        static int c(int i11, int i12) {
            if (i12 < 0) {
                throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
            }
            if (i12 <= i11) {
                return i11;
            }
            int iHighestOneBit = i11 + (i11 >> 1) + 1;
            if (iHighestOneBit < i12) {
                iHighestOneBit = Integer.highestOneBit(i12 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        public abstract b<E> a(E e11);

        public b<E> b(Iterable<? extends E> iterable) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }
    }

    w() {
    }

    public x<E> a() {
        return isEmpty() ? x.r() : x.i(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    int b(Object[] objArr, int i11) {
        d1<E> it = iterator();
        while (it.hasNext()) {
            objArr[i11] = it.next();
            i11++;
        }
        return i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    Object[] d() {
        return null;
    }

    int e() {
        throw new UnsupportedOperationException();
    }

    int f() {
        throw new UnsupportedOperationException();
    }

    abstract boolean g();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public abstract d1<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f43708a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        ou.p.m(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] objArrD = d();
            if (objArrD != null) {
                return (T[]) s0.a(objArrD, f(), e(), tArr);
            }
            tArr = (T[]) q0.d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        b(tArr, 0);
        return tArr;
    }
}
