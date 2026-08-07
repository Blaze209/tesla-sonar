package androidx.collection;

import androidx.annotation.NonNull;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class a<K, V> extends x0<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    a<K, V>.C0072a f3808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    a<K, V>.c f3809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    a<K, V>.e f3810f;

    /* JADX INFO: renamed from: androidx.collection.a$a, reason: collision with other inner class name */
    final class C0072a extends AbstractSet<Map.Entry<K, V>> {
        C0072a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @NonNull
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a.this.getSize();
        }
    }

    final class b extends k<K> {
        b() {
            super(a.this.getSize());
        }

        @Override // androidx.collection.k
        protected K b(int i11) {
            return a.this.i(i11);
        }

        @Override // androidx.collection.k
        protected void d(int i11) {
            a.this.k(i11);
        }
    }

    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f3814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f3815b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f3816c;

        d() {
            this.f3814a = a.this.getSize() - 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f3815b++;
            this.f3816c = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f3816c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return n1.a.c(entry.getKey(), a.this.i(this.f3815b)) && n1.a.c(entry.getValue(), a.this.m(this.f3815b));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f3816c) {
                return a.this.i(this.f3815b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f3816c) {
                return a.this.m(this.f3815b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3815b < this.f3814a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f3816c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            K kI = a.this.i(this.f3815b);
            V vM = a.this.m(this.f3815b);
            return (kI == null ? 0 : kI.hashCode()) ^ (vM != null ? vM.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f3816c) {
                throw new IllegalStateException();
            }
            a.this.k(this.f3815b);
            this.f3815b--;
            this.f3814a--;
            this.f3816c = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v11) {
            if (this.f3816c) {
                return a.this.l(this.f3815b, v11);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    final class f extends k<V> {
        f() {
            super(a.this.getSize());
        }

        @Override // androidx.collection.k
        protected V b(int i11) {
            return a.this.m(i11);
        }

        @Override // androidx.collection.k
        protected void d(int i11) {
            a.this.k(i11);
        }
    }

    public a() {
    }

    static <T> boolean o(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.x0, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.x0, java.util.Map
    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    @NonNull
    public Set<Map.Entry<K, V>> entrySet() {
        a<K, V>.C0072a c0072a = this.f3808d;
        if (c0072a != null) {
            return c0072a;
        }
        a<K, V>.C0072a c0072a2 = new C0072a();
        this.f3808d = c0072a2;
        return c0072a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.x0, java.util.Map
    public V get(Object obj) {
        return (V) super.get(obj);
    }

    @Override // java.util.Map
    @NonNull
    public Set<K> keySet() {
        a<K, V>.c cVar = this.f3809e;
        if (cVar != null) {
            return cVar;
        }
        a<K, V>.c cVar2 = new c();
        this.f3809e = cVar2;
        return cVar2;
    }

    public boolean n(@NonNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean p(@NonNull Collection<?> collection) {
        int size = getSize();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != getSize();
    }

    @Override // java.util.Map
    public void putAll(@NonNull Map<? extends K, ? extends V> map) {
        c(getSize() + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean q(@NonNull Collection<?> collection) {
        int size = getSize();
        for (int size2 = getSize() - 1; size2 >= 0; size2--) {
            if (!collection.contains(i(size2))) {
                k(size2);
            }
        }
        return size != getSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.x0, java.util.Map
    public V remove(Object obj) {
        return (V) super.remove(obj);
    }

    @Override // java.util.Map
    @NonNull
    public Collection<V> values() {
        a<K, V>.e eVar = this.f3810f;
        if (eVar != null) {
            return eVar;
        }
        a<K, V>.e eVar2 = new e();
        this.f3810f = eVar2;
        return eVar2;
    }

    public a(int i11) {
        super(i11);
    }

    final class c implements Set<K> {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k11) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(@NonNull Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(@NonNull Collection<?> collection) {
            return a.this.n(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return a.o(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int size = a.this.getSize() - 1; size >= 0; size--) {
                K kI = a.this.i(size);
                iHashCode += kI == null ? 0 : kI.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        @NonNull
        public Iterator<K> iterator() {
            return new b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iE = a.this.e(obj);
            if (iE < 0) {
                return false;
            }
            a.this.k(iE);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(@NonNull Collection<?> collection) {
            return a.this.p(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(@NonNull Collection<?> collection) {
            return a.this.q(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return a.this.getSize();
        }

        @Override // java.util.Set, java.util.Collection
        @NonNull
        public Object[] toArray() {
            int size = a.this.getSize();
            Object[] objArr = new Object[size];
            for (int i11 = 0; i11 < size; i11++) {
                objArr[i11] = a.this.i(i11);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        @NonNull
        public <T> T[] toArray(@NonNull T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i11 = 0; i11 < size; i11++) {
                tArr[i11] = a.this.i(i11);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }
    }

    final class e implements Collection<V> {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(V v11) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(@NonNull Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            a.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return a.this.b(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        @NonNull
        public Iterator<V> iterator() {
            return new f();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iB = a.this.b(obj);
            if (iB < 0) {
                return false;
            }
            a.this.k(iB);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(@NonNull Collection<?> collection) {
            int size = a.this.getSize();
            int i11 = 0;
            boolean z11 = false;
            while (i11 < size) {
                if (collection.contains(a.this.m(i11))) {
                    a.this.k(i11);
                    i11--;
                    size--;
                    z11 = true;
                }
                i11++;
            }
            return z11;
        }

        @Override // java.util.Collection
        public boolean retainAll(@NonNull Collection<?> collection) {
            int size = a.this.getSize();
            int i11 = 0;
            boolean z11 = false;
            while (i11 < size) {
                if (!collection.contains(a.this.m(i11))) {
                    a.this.k(i11);
                    i11--;
                    size--;
                    z11 = true;
                }
                i11++;
            }
            return z11;
        }

        @Override // java.util.Collection
        public int size() {
            return a.this.getSize();
        }

        @Override // java.util.Collection
        @NonNull
        public Object[] toArray() {
            int size = a.this.getSize();
            Object[] objArr = new Object[size];
            for (int i11 = 0; i11 < size; i11++) {
                objArr[i11] = a.this.m(i11);
            }
            return objArr;
        }

        @Override // java.util.Collection
        @NonNull
        public <T> T[] toArray(@NonNull T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i11 = 0; i11 < size; i11++) {
                tArr[i11] = a.this.m(i11);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }
    }

    public a(x0 x0Var) {
        super(x0Var);
    }
}
