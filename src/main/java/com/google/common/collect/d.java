package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
abstract class d<K, V> extends com.google.common.collect.f<K, V> implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient Map<K, Collection<V>> f43528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient int f43529f;

    class a extends d<K, V>.AbstractC0682d<V> {
        a() {
            super();
        }

        @Override // com.google.common.collect.d.AbstractC0682d
        V a(K k11, V v11) {
            return v11;
        }
    }

    class b extends d<K, V>.AbstractC0682d<Map.Entry<K, V>> {
        b() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.d.AbstractC0682d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> a(K k11, V v11) {
            return j0.d(k11, v11);
        }
    }

    private class c extends j0.f<K, Collection<V>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final transient Map<K, Collection<V>> f43532c;

        final class a extends j0.c<K, Collection<V>> {
            a() {
            }

            @Override // com.google.common.collect.j0.c
            Map<K, Collection<V>> a() {
                return c.this;
            }

            @Override // com.google.common.collect.j0.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return com.google.common.collect.l.c(c.this.f43532c.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return c.this.new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                d.this.x(entry.getKey());
                return true;
            }
        }

        final class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final Iterator<Map.Entry<K, Collection<V>>> f43535a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Collection<V> f43536b;

            b() {
                this.f43535a = c.this.f43532c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f43535a.next();
                this.f43536b = next.getValue();
                return c.this.h(next);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f43535a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                ou.p.s(this.f43536b != null, "no calls to next() since the last call to remove()");
                this.f43535a.remove();
                d.q(d.this, this.f43536b.size());
                this.f43536b.clear();
                this.f43536b = null;
            }
        }

        c(Map<K, Collection<V>> map) {
            this.f43532c = map;
        }

        @Override // com.google.common.collect.j0.f
        protected Set<Map.Entry<K, Collection<V>>> b() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f43532c == d.this.f43528e) {
                d.this.clear();
            } else {
                d0.c(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return j0.h(this.f43532c, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) j0.i(this.f43532c, obj);
            if (collection == null) {
                return null;
            }
            return d.this.z(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(Object obj) {
            Collection<V> collectionRemove = this.f43532c.remove(obj);
            if (collectionRemove == null) {
                return null;
            }
            Collection<V> collectionS = d.this.s();
            collectionS.addAll(collectionRemove);
            d.q(d.this, collectionRemove.size());
            collectionRemove.clear();
            return collectionS;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f43532c.equals(obj);
        }

        Map.Entry<K, Collection<V>> h(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return j0.d(key, d.this.z(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f43532c.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet */
        public Set<K> j() {
            return d.this.i();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f43532c.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f43532c.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.d$d, reason: collision with other inner class name */
    private abstract class AbstractC0682d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Iterator<Map.Entry<K, Collection<V>>> f43538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        K f43539b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Collection<V> f43540c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Iterator<V> f43541d = d0.h();

        AbstractC0682d() {
            this.f43538a = d.this.f43528e.entrySet().iterator();
        }

        abstract T a(K k11, V v11);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f43538a.hasNext() || this.f43541d.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f43541d.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f43538a.next();
                this.f43539b = next.getKey();
                Collection<V> value = next.getValue();
                this.f43540c = value;
                this.f43541d = value.iterator();
            }
            return a(p0.a(this.f43539b), this.f43541d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f43541d.remove();
            Collection<V> collection = this.f43540c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f43538a.remove();
            }
            d.o(d.this);
        }
    }

    private class e extends j0.d<K, Collection<V>> {

        class a implements Iterator<K> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Map.Entry<K, Collection<V>> f43544a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Iterator f43545b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e f43546c;

            a(e eVar, Iterator it) {
                this.f43545b = it;
                this.f43546c = eVar;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f43545b.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f43545b.next();
                this.f43544a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                ou.p.s(this.f43544a != null, "no calls to next() since the last call to remove()");
                Collection<V> value = this.f43544a.getValue();
                this.f43545b.remove();
                d.q(d.this, value.size());
                value.clear();
                this.f43544a = null;
            }
        }

        e(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            d0.c(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return a().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || a().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return a().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(this, a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int size;
            Collection<V> collectionRemove = a().remove(obj);
            if (collectionRemove != null) {
                size = collectionRemove.size();
                collectionRemove.clear();
                d.q(d.this, size);
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    private final class f extends d<K, V>.i implements NavigableMap<K, Collection<V>> {
        f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k11) {
            Map.Entry<K, Collection<V>> entryCeilingEntry = k().ceilingEntry(k11);
            if (entryCeilingEntry == null) {
                return null;
            }
            return h(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k11) {
            return k().ceilingKey(k11);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new f(k().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> entryFirstEntry = k().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return h(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k11) {
            Map.Entry<K, Collection<V>> entryFloorEntry = k().floorEntry(k11);
            if (entryFloorEntry == null) {
                return null;
            }
            return h(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k11) {
            return k().floorKey(k11);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k11) {
            Map.Entry<K, Collection<V>> entryHigherEntry = k().higherEntry(k11);
            if (entryHigherEntry == null) {
                return null;
            }
            return h(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k11) {
            return k().higherKey(k11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.d.i
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> i() {
            return new g(k());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> entryLastEntry = k().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return h(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k11) {
            Map.Entry<K, Collection<V>> entryLowerEntry = k().lowerEntry(k11);
            if (entryLowerEntry == null) {
                return null;
            }
            return h(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k11) {
            return k().lowerKey(k11);
        }

        @Override // com.google.common.collect.d.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> headMap(K k11) {
            return headMap(k11, false);
        }

        Map.Entry<K, Collection<V>> n(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> collectionS = d.this.s();
            collectionS.addAll(next.getValue());
            it.remove();
            return j0.d(next.getKey(), d.this.y(collectionS));
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return j();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.d.i
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> k() {
            return (NavigableMap) super.k();
        }

        @Override // com.google.common.collect.d.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> subMap(K k11, K k12) {
            return subMap(k11, true, k12, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return n(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return n(descendingMap().entrySet().iterator());
        }

        @Override // com.google.common.collect.d.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> tailMap(K k11) {
            return tailMap(k11, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k11, boolean z11) {
            return new f(k().headMap(k11, z11));
        }

        @Override // com.google.common.collect.d.i, com.google.common.collect.d.c, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> j() {
            return (NavigableSet) super.j();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k11, boolean z11, K k12, boolean z12) {
            return new f(k().subMap(k11, z11, k12, z12));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k11, boolean z11) {
            return new f(k().tailMap(k11, z11));
        }
    }

    private final class g extends d<K, V>.j implements NavigableSet<K> {
        g(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k11) {
            return b().ceilingKey(k11);
        }

        @Override // com.google.common.collect.d.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> headSet(K k11) {
            return headSet(k11, false);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new g(b().descendingMap());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.d.j
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> b() {
            return (NavigableMap) super.b();
        }

        @Override // com.google.common.collect.d.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> subSet(K k11, K k12) {
            return subSet(k11, true, k12, false);
        }

        @Override // java.util.NavigableSet
        public K floor(K k11) {
            return b().floorKey(k11);
        }

        @Override // com.google.common.collect.d.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> tailSet(K k11) {
            return tailSet(k11, true);
        }

        @Override // java.util.NavigableSet
        public K higher(K k11) {
            return b().higherKey(k11);
        }

        @Override // java.util.NavigableSet
        public K lower(K k11) {
            return b().lowerKey(k11);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) d0.p(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) d0.p(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k11, boolean z11) {
            return new g(b().headMap(k11, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k11, boolean z11, K k12, boolean z12) {
            return new g(b().subMap(k11, z11, k12, z12));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k11, boolean z11) {
            return new g(b().tailMap(k11, z11));
        }
    }

    private final class h extends d<K, V>.l implements RandomAccess {
        h(K k11, List<V> list, d<K, V>.k kVar) {
            super(k11, list, kVar);
        }
    }

    private class i extends d<K, V>.c implements SortedMap<K, Collection<V>> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        SortedSet<K> f43550e;

        i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return k().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return k().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k11) {
            return new i(k().headMap(k11));
        }

        SortedSet<K> i() {
            return new j(k());
        }

        @Override // com.google.common.collect.d.c, java.util.AbstractMap, java.util.Map
        public SortedSet<K> j() {
            SortedSet<K> sortedSet = this.f43550e;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetI = i();
            this.f43550e = sortedSetI;
            return sortedSetI;
        }

        SortedMap<K, Collection<V>> k() {
            return (SortedMap) this.f43532c;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return k().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k11, K k12) {
            return new i(k().subMap(k11, k12));
        }

        public SortedMap<K, Collection<V>> tailMap(K k11) {
            return new i(k().tailMap(k11));
        }
    }

    private class j extends d<K, V>.e implements SortedSet<K> {
        j(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        SortedMap<K, Collection<V>> b() {
            return (SortedMap) super.a();
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return b().comparator();
        }

        @Override // java.util.SortedSet
        public K first() {
            return b().firstKey();
        }

        public SortedSet<K> headSet(K k11) {
            return new j(b().headMap(k11));
        }

        @Override // java.util.SortedSet
        public K last() {
            return b().lastKey();
        }

        public SortedSet<K> subSet(K k11, K k12) {
            return new j(b().subMap(k11, k12));
        }

        public SortedSet<K> tailSet(K k11) {
            return new j(b().tailMap(k11));
        }
    }

    protected d(Map<K, Collection<V>> map) {
        ou.p.d(map.isEmpty());
        this.f43528e = map;
    }

    static /* synthetic */ int n(d dVar) {
        int i11 = dVar.f43529f;
        dVar.f43529f = i11 + 1;
        return i11;
    }

    static /* synthetic */ int o(d dVar) {
        int i11 = dVar.f43529f;
        dVar.f43529f = i11 - 1;
        return i11;
    }

    static /* synthetic */ int p(d dVar, int i11) {
        int i12 = dVar.f43529f + i11;
        dVar.f43529f = i12;
        return i12;
    }

    static /* synthetic */ int q(d dVar, int i11) {
        int i12 = dVar.f43529f - i11;
        dVar.f43529f = i12;
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Iterator<E> w(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(Object obj) {
        Collection collection = (Collection) j0.j(this.f43528e, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f43529f -= size;
        }
    }

    final List<V> A(K k11, List<V> list, d<K, V>.k kVar) {
        return list instanceof RandomAccess ? new h(k11, list, kVar) : new l(k11, list, kVar);
    }

    @Override // com.google.common.collect.f, com.google.common.collect.k0
    public Collection<Map.Entry<K, V>> a() {
        return super.a();
    }

    @Override // com.google.common.collect.k0
    public void clear() {
        Iterator<Collection<V>> it = this.f43528e.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f43528e.clear();
        this.f43529f = 0;
    }

    @Override // com.google.common.collect.f
    Map<K, Collection<V>> d() {
        return new c(this.f43528e);
    }

    @Override // com.google.common.collect.f
    Collection<Map.Entry<K, V>> e() {
        return new com.google.common.collect.f.a();
    }

    @Override // com.google.common.collect.f
    Set<K> f() {
        return new e(this.f43528e);
    }

    @Override // com.google.common.collect.f
    Collection<V> g() {
        return new com.google.common.collect.f.b();
    }

    @Override // com.google.common.collect.k0
    public Collection<V> get(K k11) {
        Collection<V> collectionT = this.f43528e.get(k11);
        if (collectionT == null) {
            collectionT = t(k11);
        }
        return z(k11, collectionT);
    }

    @Override // com.google.common.collect.f
    Iterator<Map.Entry<K, V>> h() {
        return new b();
    }

    @Override // com.google.common.collect.f
    Iterator<V> k() {
        return new a();
    }

    @Override // com.google.common.collect.k0
    public boolean put(K k11, V v11) {
        Collection<V> collection = this.f43528e.get(k11);
        if (collection != null) {
            if (!collection.add(v11)) {
                return false;
            }
            this.f43529f++;
            return true;
        }
        Collection<V> collectionT = t(k11);
        if (!collectionT.add(v11)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f43529f++;
        this.f43528e.put(k11, collectionT);
        return true;
    }

    abstract Collection<V> s();

    @Override // com.google.common.collect.k0
    public int size() {
        return this.f43529f;
    }

    Collection<V> t(K k11) {
        return s();
    }

    final Map<K, Collection<V>> u() {
        Map<K, Collection<V>> map = this.f43528e;
        if (map instanceof NavigableMap) {
            return new f((NavigableMap) this.f43528e);
        }
        return map instanceof SortedMap ? new i((SortedMap) this.f43528e) : new c(this.f43528e);
    }

    final Set<K> v() {
        Map<K, Collection<V>> map = this.f43528e;
        if (map instanceof NavigableMap) {
            return new g((NavigableMap) this.f43528e);
        }
        return map instanceof SortedMap ? new j((SortedMap) this.f43528e) : new e(this.f43528e);
    }

    @Override // com.google.common.collect.f, com.google.common.collect.k0
    public Collection<V> values() {
        return super.values();
    }

    abstract <E> Collection<E> y(Collection<E> collection);

    abstract Collection<V> z(K k11, Collection<V> collection);

    class k extends AbstractCollection<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final K f43553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Collection<V> f43554b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final d<K, V>.k f43555c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Collection<V> f43556d;

        k(K k11, Collection<V> collection, d<K, V>.k kVar) {
            this.f43553a = k11;
            this.f43554b = collection;
            this.f43555c = kVar;
            this.f43556d = kVar == null ? null : kVar.d();
        }

        void a() {
            d<K, V>.k kVar = this.f43555c;
            if (kVar != null) {
                kVar.a();
            } else {
                d.this.f43528e.put(this.f43553a, this.f43554b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v11) {
            f();
            boolean zIsEmpty = this.f43554b.isEmpty();
            boolean zAdd = this.f43554b.add(v11);
            if (zAdd) {
                d.n(d.this);
                if (zIsEmpty) {
                    a();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f43554b.addAll(collection);
            if (zAddAll) {
                d.p(d.this, this.f43554b.size() - size);
                if (size == 0) {
                    a();
                }
            }
            return zAddAll;
        }

        d<K, V>.k b() {
            return this.f43555c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f43554b.clear();
            d.q(d.this, size);
            g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            f();
            return this.f43554b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            f();
            return this.f43554b.containsAll(collection);
        }

        Collection<V> d() {
            return this.f43554b;
        }

        K e() {
            return this.f43553a;
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            f();
            return this.f43554b.equals(obj);
        }

        void f() {
            Collection<V> collection;
            d<K, V>.k kVar = this.f43555c;
            if (kVar != null) {
                kVar.f();
                if (this.f43555c.d() != this.f43556d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f43554b.isEmpty() || (collection = (Collection) d.this.f43528e.get(this.f43553a)) == null) {
                    return;
                }
                this.f43554b = collection;
            }
        }

        void g() {
            d<K, V>.k kVar = this.f43555c;
            if (kVar != null) {
                kVar.g();
            } else if (this.f43554b.isEmpty()) {
                d.this.f43528e.remove(this.f43553a);
            }
        }

        @Override // java.util.Collection
        public int hashCode() {
            f();
            return this.f43554b.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            f();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            f();
            boolean zRemove = this.f43554b.remove(obj);
            if (zRemove) {
                d.o(d.this);
                g();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f43554b.removeAll(collection);
            if (zRemoveAll) {
                d.p(d.this, this.f43554b.size() - size);
                g();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            ou.p.m(collection);
            int size = size();
            boolean zRetainAll = this.f43554b.retainAll(collection);
            if (zRetainAll) {
                d.p(d.this, this.f43554b.size() - size);
                g();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            f();
            return this.f43554b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            f();
            return this.f43554b.toString();
        }

        class a implements Iterator<V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final Iterator<V> f43558a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final Collection<V> f43559b;

            a() {
                Collection<V> collection = k.this.f43554b;
                this.f43559b = collection;
                this.f43558a = d.w(collection);
            }

            Iterator<V> a() {
                b();
                return this.f43558a;
            }

            void b() {
                k.this.f();
                if (k.this.f43554b != this.f43559b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                return this.f43558a.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                b();
                return this.f43558a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f43558a.remove();
                d.o(d.this);
                k.this.g();
            }

            a(Iterator<V> it) {
                this.f43559b = k.this.f43554b;
                this.f43558a = it;
            }
        }
    }

    private class l extends d<K, V>.k implements List<V> {

        private final class a extends d<K, V>.k.a implements ListIterator<V> {
            a() {
                super();
            }

            private ListIterator<V> c() {
                return (ListIterator) a();
            }

            @Override // java.util.ListIterator
            public void add(V v11) {
                boolean zIsEmpty = l.this.isEmpty();
                c().add(v11);
                d.n(d.this);
                if (zIsEmpty) {
                    l.this.a();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return c().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return c().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return c().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v11) {
                c().set(v11);
            }

            a(int i11) {
                super(l.this.h().listIterator(i11));
            }
        }

        l(K k11, List<V> list, d<K, V>.k kVar) {
            super(k11, list, kVar);
        }

        @Override // java.util.List
        public void add(int i11, V v11) {
            f();
            boolean zIsEmpty = d().isEmpty();
            h().add(i11, v11);
            d.n(d.this);
            if (zIsEmpty) {
                a();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i11, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = h().addAll(i11, collection);
            if (zAddAll) {
                d.p(d.this, d().size() - size);
                if (size == 0) {
                    a();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public V get(int i11) {
            f();
            return h().get(i11);
        }

        List<V> h() {
            return (List) d();
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            f();
            return h().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            f();
            return h().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            f();
            return new a();
        }

        @Override // java.util.List
        public V remove(int i11) {
            f();
            V vRemove = h().remove(i11);
            d.o(d.this);
            g();
            return vRemove;
        }

        @Override // java.util.List
        public V set(int i11, V v11) {
            f();
            return h().set(i11, v11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i11, int i12) {
            f();
            return d.this.A(e(), h().subList(i11, i12), b() == null ? this : b());
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i11) {
            f();
            return new a(i11);
        }
    }
}
