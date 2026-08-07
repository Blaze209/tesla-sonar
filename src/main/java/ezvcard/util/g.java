package ezvcard.util;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class g<K, V> implements Iterable<Map.Entry<K, List<V>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<K, List<V>> f63672a;

    class a implements Iterator<Map.Entry<K, List<V>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f63673a;

        /* JADX INFO: renamed from: ezvcard.util.g$a$a, reason: collision with other inner class name */
        class C1301a implements Map.Entry<K, List<V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Map.Entry f63675a;

            C1301a(Map.Entry entry) {
                this.f63675a = entry;
            }

            @Override // java.util.Map.Entry
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public List<V> getValue() {
                return Collections.unmodifiableList((List) this.f63675a.getValue());
            }

            @Override // java.util.Map.Entry
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public List<V> setValue(List<V> list) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Map.Entry
            public K getKey() {
                return (K) this.f63675a.getKey();
            }
        }

        a(Iterator it) {
            this.f63673a = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, List<V>> next() {
            return new C1301a((Map.Entry) this.f63673a.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f63673a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public g() {
        this(new LinkedHashMap());
    }

    private static <K, V> Map<K, List<V>> b(Map<K, List<V>> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map.size());
        for (Map.Entry<K, List<V>> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), new ArrayList(entry.getValue()));
        }
        return linkedHashMap;
    }

    public V d(K k11) {
        List<V> list = this.f63672a.get(j(k11));
        if (list == null) {
            return null;
        }
        return list.get(0);
    }

    public List<V> e(K k11) {
        K kJ = j(k11);
        List<V> arrayList = this.f63672a.get(kJ);
        if (arrayList == null) {
            arrayList = new ArrayList<>(0);
        }
        return new b(kJ, arrayList, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f63672a.equals(((g) obj).f63672a);
        }
        return false;
    }

    public void f(K k11, V v11) {
        K kJ = j(k11);
        List<V> arrayList = this.f63672a.get(kJ);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f63672a.put(kJ, arrayList);
        }
        arrayList.add(v11);
    }

    public void g(K k11, Collection<V> collection) {
        if (collection.isEmpty()) {
            return;
        }
        K kJ = j(k11);
        List<V> arrayList = this.f63672a.get(kJ);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f63672a.put(kJ, arrayList);
        }
        arrayList.addAll(collection);
    }

    public List<V> h(K k11) {
        List<V> listRemove = this.f63672a.remove(j(k11));
        if (listRemove == null) {
            return Collections.EMPTY_LIST;
        }
        List<V> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(listRemove));
        listRemove.clear();
        return listUnmodifiableList;
    }

    public int hashCode() {
        return this.f63672a.hashCode();
    }

    public List<V> i(K k11, V v11) {
        List<V> listH = h(k11);
        if (v11 != null) {
            f(k11, v11);
        }
        return listH;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, List<V>>> iterator() {
        return new a(this.f63672a.entrySet().iterator());
    }

    protected K j(K k11) {
        return k11;
    }

    public List<V> k() {
        ArrayList arrayList = new ArrayList();
        Iterator<List<V>> it = this.f63672a.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int size() {
        Iterator<List<V>> it = this.f63672a.values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    public String toString() {
        return this.f63672a.toString();
    }

    private class b extends AbstractCollection<V> implements List<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final K f63677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        List<V> f63678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final g<K, V>.b f63679c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final List<V> f63680d;

        b(K k11, List<V> list, g<K, V>.b bVar) {
            this.f63677a = k11;
            this.f63678b = list;
            this.f63679c = bVar;
            this.f63680d = bVar == null ? null : bVar.d();
        }

        void a() {
            g<K, V>.b bVar = this.f63679c;
            if (bVar != null) {
                bVar.a();
            } else {
                g.this.f63672a.put(this.f63677a, this.f63678b);
            }
        }

        @Override // java.util.List
        public void add(int i11, V v11) {
            f();
            boolean zIsEmpty = d().isEmpty();
            d().add(i11, v11);
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
            boolean zAddAll = d().addAll(i11, collection);
            if (zAddAll && size == 0) {
                a();
            }
            return zAddAll;
        }

        g<K, V>.b b() {
            return this.f63679c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            if (size() == 0) {
                return;
            }
            this.f63678b.clear();
            g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            f();
            return this.f63678b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean containsAll(Collection<?> collection) {
            f();
            return this.f63678b.containsAll(collection);
        }

        List<V> d() {
            return this.f63678b;
        }

        K e() {
            return this.f63677a;
        }

        @Override // java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            f();
            return this.f63678b.equals(obj);
        }

        void f() {
            List<V> list;
            g<K, V>.b bVar = this.f63679c;
            if (bVar != null) {
                bVar.f();
                if (this.f63679c.d() != this.f63680d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f63678b.isEmpty() || (list = (List) g.this.f63672a.get(this.f63677a)) == null) {
                    return;
                }
                this.f63678b = list;
            }
        }

        void g() {
            g<K, V>.b bVar = this.f63679c;
            if (bVar != null) {
                bVar.g();
            } else if (this.f63678b.isEmpty()) {
                g.this.f63672a.remove(this.f63677a);
            }
        }

        @Override // java.util.List
        public V get(int i11) {
            f();
            return d().get(i11);
        }

        @Override // java.util.Collection, java.util.List
        public int hashCode() {
            f();
            return this.f63678b.hashCode();
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            f();
            return d().indexOf(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<V> iterator() {
            f();
            return new a();
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            f();
            return d().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            f();
            return new a();
        }

        @Override // java.util.List
        public V remove(int i11) {
            f();
            V vRemove = d().remove(i11);
            g();
            return vRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            f();
            boolean zRemoveAll = this.f63678b.removeAll(collection);
            if (zRemoveAll) {
                g();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection<?> collection) {
            f();
            boolean zRetainAll = this.f63678b.retainAll(collection);
            if (zRetainAll) {
                g();
            }
            return zRetainAll;
        }

        @Override // java.util.List
        public V set(int i11, V v11) {
            f();
            return d().set(i11, v11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            f();
            return this.f63678b.size();
        }

        @Override // java.util.List
        public List<V> subList(int i11, int i12) {
            f();
            return new b(e(), d().subList(i11, i12), b() == null ? this : b());
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            f();
            return this.f63678b.toString();
        }

        private class a implements ListIterator<V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final ListIterator<V> f63682a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final List<V> f63683b;

            a() {
                List<V> list = b.this.f63678b;
                this.f63683b = list;
                this.f63682a = list.listIterator();
            }

            ListIterator<V> a() {
                b();
                return this.f63682a;
            }

            @Override // java.util.ListIterator
            public void add(V v11) {
                boolean zIsEmpty = b.this.isEmpty();
                a().add(v11);
                if (zIsEmpty) {
                    b.this.a();
                }
            }

            void b() {
                b.this.f();
                if (b.this.f63678b != this.f63683b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                b();
                return this.f63682a.hasNext();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return a().hasPrevious();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public V next() {
                b();
                return this.f63682a.next();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return a().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return a().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return a().previousIndex();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                this.f63682a.remove();
                b.this.g();
            }

            @Override // java.util.ListIterator
            public void set(V v11) {
                a().set(v11);
            }

            public a(int i11) {
                List<V> list = b.this.f63678b;
                this.f63683b = list;
                this.f63682a = list.listIterator(i11);
            }
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i11) {
            f();
            return new a(i11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            f();
            boolean zRemove = this.f63678b.remove(obj);
            if (zRemove) {
                g();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(V v11) {
            f();
            boolean zIsEmpty = this.f63678b.isEmpty();
            boolean zAdd = this.f63678b.add(v11);
            if (zAdd && zIsEmpty) {
                a();
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f63678b.addAll(collection);
            if (zAddAll && size == 0) {
                a();
            }
            return zAddAll;
        }
    }

    public g(g<K, V> gVar) {
        this(b(gVar.f63672a));
    }

    public g(Map<K, List<V>> map) {
        this.f63672a = map;
    }
}
