package com.google.common.collect;

import ch.qos.logback.core.util.FileSize;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class l {

    static class a<E> extends AbstractCollection<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Collection<E> f43646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ou.q<? super E> f43647b;

        a(Collection<E> collection, ou.q<? super E> qVar) {
            this.f43646a = collection;
            this.f43647b = qVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(E e11) {
            ou.p.d(this.f43647b.apply(e11));
            return this.f43646a.add(e11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                ou.p.d(this.f43647b.apply(it.next()));
            }
            return this.f43646a.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            c0.h(this.f43646a, this.f43647b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (l.c(this.f43646a, obj)) {
                return this.f43647b.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return l.a(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !c0.a(this.f43646a, this.f43647b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return d0.i(this.f43646a.iterator(), this.f43647b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            return contains(obj) && this.f43646a.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.f43646a.iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f43647b.apply(next) && collection.contains(next)) {
                    it.remove();
                    z11 = true;
                }
            }
            return z11;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.f43646a.iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f43647b.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z11 = true;
                }
            }
            return z11;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator<E> it = this.f43646a.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                if (this.f43647b.apply(it.next())) {
                    i11++;
                }
            }
            return i11;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return f0.g(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) f0.g(iterator()).toArray(tArr);
        }
    }

    static boolean a(Collection<?> collection, Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    static StringBuilder b(int i11) {
        k.b(i11, "size");
        return new StringBuilder((int) Math.min(((long) i11) * 8, FileSize.GB_COEFFICIENT));
    }

    static boolean c(Collection<?> collection, Object obj) {
        ou.p.m(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
