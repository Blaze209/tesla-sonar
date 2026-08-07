package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
abstract class f<K, V> implements k0<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Collection<Map.Entry<K, V>> f43569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Set<K> f43570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Collection<V> f43571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient Map<K, Collection<V>> f43572d;

    class a extends m0.b<K, V> {
        a() {
        }

        @Override // com.google.common.collect.m0.b
        k0<K, V> a() {
            return f.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return f.this.h();
        }
    }

    final class b extends AbstractCollection<V> {
        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return f.this.c(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return f.this.k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return f.this.size();
        }
    }

    f() {
    }

    @Override // com.google.common.collect.k0
    public Collection<Map.Entry<K, V>> a() {
        Collection<Map.Entry<K, V>> collection = this.f43569a;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> collectionE = e();
        this.f43569a = collectionE;
        return collectionE;
    }

    @Override // com.google.common.collect.k0
    public Map<K, Collection<V>> asMap() {
        Map<K, Collection<V>> map = this.f43572d;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapD = d();
        this.f43572d = mapD;
        return mapD;
    }

    @Override // com.google.common.collect.k0
    public boolean b(Object obj, Object obj2) {
        Collection<V> collection = asMap().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean c(Object obj) {
        Iterator<Collection<V>> it = asMap().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    abstract Map<K, Collection<V>> d();

    abstract Collection<Map.Entry<K, V>> e();

    public boolean equals(Object obj) {
        return m0.a(this, obj);
    }

    abstract Set<K> f();

    abstract Collection<V> g();

    abstract Iterator<Map.Entry<K, V>> h();

    public int hashCode() {
        return asMap().hashCode();
    }

    public Set<K> i() {
        Set<K> set = this.f43570b;
        if (set != null) {
            return set;
        }
        Set<K> setF = f();
        this.f43570b = setF;
        return setF;
    }

    public boolean j(K k11, Iterable<? extends V> iterable) {
        ou.p.m(iterable);
        if (iterable instanceof Collection) {
            Collection<? extends V> collection = (Collection) iterable;
            return !collection.isEmpty() && get(k11).addAll(collection);
        }
        Iterator<? extends V> it = iterable.iterator();
        return it.hasNext() && d0.a(get(k11), it);
    }

    abstract Iterator<V> k();

    @Override // com.google.common.collect.k0
    public boolean remove(Object obj, Object obj2) {
        Collection<V> collection = asMap().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return asMap().toString();
    }

    @Override // com.google.common.collect.k0
    public Collection<V> values() {
        Collection<V> collection = this.f43571c;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionG = g();
        this.f43571c = collectionG;
        return collectionG;
    }
}
