package io.realm;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class u0<E> implements Set<E>, RealmCollection<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final b<E> f79172a = new c();

    private static abstract class b<E> implements Set<E>, RealmCollection<E> {
        private b() {
        }
    }

    private static class c<E> extends b<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<E> f79173a;

        c() {
            super();
            this.f79173a = new HashSet();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(E e11) {
            return this.f79173a.add(e11);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            return this.f79173a.addAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            this.f79173a.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return this.f79173a.contains(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return this.f79173a.containsAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return this.f79173a.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return this.f79173a.iterator();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            return this.f79173a.remove(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return this.f79173a.removeAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return this.f79173a.retainAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return this.f79173a.size();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return this.f79173a.toArray();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) this.f79173a.toArray(tArr);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(E e11) {
        return this.f79172a.add(e11);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return this.f79172a.addAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f79172a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f79172a.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f79172a.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f79172a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.f79172a.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.f79172a.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.f79172a.removeAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.f79172a.retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.f79172a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return this.f79172a.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f79172a.toArray(tArr);
    }
}
