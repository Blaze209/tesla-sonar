package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a0<K, V> extends i<K, V> implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient z<K, ? extends w<V>> f43506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final transient int f43507f;

    class a extends d1<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Iterator<? extends Map.Entry<K, ? extends w<V>>> f43508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        K f43509b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Iterator<V> f43510c = d0.f();

        a() {
            this.f43508a = a0.this.f43506e.entrySet().iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!this.f43510c.hasNext()) {
                Map.Entry<K, ? extends w<V>> next = this.f43508a.next();
                this.f43509b = next.getKey();
                this.f43510c = next.getValue().iterator();
            }
            K k11 = this.f43509b;
            Objects.requireNonNull(k11);
            return j0.d(k11, this.f43510c.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f43510c.hasNext() || this.f43508a.hasNext();
        }
    }

    class b extends d1<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Iterator<? extends w<V>> f43512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Iterator<V> f43513b = d0.f();

        b() {
            this.f43512a = a0.this.f43506e.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f43513b.hasNext() || this.f43512a.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            if (!this.f43513b.hasNext()) {
                this.f43513b = this.f43512a.next().iterator();
            }
            return this.f43513b.next();
        }
    }

    public static class c<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Map<K, w.b<V>> f43515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Comparator<? super K> f43516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Comparator<? super V> f43517c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f43518d = 4;

        public a0<K, V> a() {
            Map<K, w.b<V>> map = this.f43515a;
            if (map == null) {
                return y.x();
            }
            Collection collectionEntrySet = map.entrySet();
            Comparator<? super K> comparator = this.f43516b;
            if (comparator != null) {
                collectionEntrySet = r0.b(comparator).h().c(collectionEntrySet);
            }
            return y.v(collectionEntrySet, this.f43517c);
        }

        Map<K, w.b<V>> b() {
            Map<K, w.b<V>> map = this.f43515a;
            if (map != null) {
                return map;
            }
            Map<K, w.b<V>> mapD = s0.d();
            this.f43515a = mapD;
            return mapD;
        }

        w.b<V> c(int i11) {
            return x.l(i11);
        }

        public c<K, V> d(K k11, V v11) {
            k.a(k11, v11);
            w.b<V> bVarC = b().get(k11);
            if (bVarC == null) {
                bVarC = c(this.f43518d);
                b().put(k11, bVarC);
            }
            bVarC.a(v11);
            return this;
        }
    }

    private static final class d<K, V> extends w<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final a0<K, V> f43519b;

        d(a0<K, V> a0Var) {
            this.f43519b = a0Var;
        }

        @Override // com.google.common.collect.w, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f43519b.b(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.w, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* JADX INFO: renamed from: h */
        public d1<Map.Entry<K, V>> iterator() {
            return this.f43519b.h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f43519b.size();
        }
    }

    private static final class e<K, V> extends w<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final transient a0<K, V> f43520b;

        e(a0<K, V> a0Var) {
            this.f43520b = a0Var;
        }

        @Override // com.google.common.collect.w
        int b(Object[] objArr, int i11) {
            d1<? extends w<V>> it = this.f43520b.f43506e.values().iterator();
            while (it.hasNext()) {
                i11 = it.next().b(objArr, i11);
            }
            return i11;
        }

        @Override // com.google.common.collect.w, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f43520b.c(obj);
        }

        @Override // com.google.common.collect.w, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* JADX INFO: renamed from: h */
        public d1<V> iterator() {
            return this.f43520b.k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f43520b.size();
        }
    }

    a0(z<K, ? extends w<V>> zVar, int i11) {
        this.f43506e = zVar;
        this.f43507f = i11;
    }

    @Override // com.google.common.collect.f, com.google.common.collect.k0
    public /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        return super.b(obj, obj2);
    }

    @Override // com.google.common.collect.f
    public boolean c(Object obj) {
        return obj != null && super.c(obj);
    }

    @Override // com.google.common.collect.k0
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.f
    Map<K, Collection<V>> d() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.f
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.f
    Set<K> f() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.common.collect.f
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.f, com.google.common.collect.k0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public z<K, Collection<V>> asMap() {
        return this.f43506e;
    }

    public boolean m(Object obj) {
        return this.f43506e.containsKey(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.f
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public w<Map.Entry<K, V>> e() {
        return new d(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.f
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public w<V> g() {
        return new e(this);
    }

    @Override // com.google.common.collect.f, com.google.common.collect.k0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public w<Map.Entry<K, V>> a() {
        return (w) super.a();
    }

    @Override // com.google.common.collect.k0
    @Deprecated
    public final boolean put(K k11, V v11) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.f
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public d1<Map.Entry<K, V>> h() {
        return new a();
    }

    public b0<K> r() {
        return this.f43506e.keySet();
    }

    @Override // com.google.common.collect.f, com.google.common.collect.k0
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.f
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public d1<V> k() {
        return new b();
    }

    @Override // com.google.common.collect.k0
    public int size() {
        return this.f43507f;
    }

    @Override // com.google.common.collect.f, com.google.common.collect.k0
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public w<V> values() {
        return (w) super.values();
    }

    @Override // com.google.common.collect.f
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
