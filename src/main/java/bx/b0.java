package bx;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class b0<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator<Comparable> f18153i = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparator<? super K> f18154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f18155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    e<K, V> f18156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f18157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f18158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final e<K, V> f18159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b0<K, V>.b f18160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b0<K, V>.c f18161h;

    class a implements Comparator<Comparable> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    class b extends AbstractSet<Map.Entry<K, V>> {

        class a extends b0<K, V>.d<Map.Entry<K, V>> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            b0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && b0.this.d((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> eVarD;
            if (!(obj instanceof Map.Entry) || (eVarD = b0.this.d((Map.Entry) obj)) == null) {
                return false;
            }
            b0.this.i(eVarD, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return b0.this.f18157d;
        }
    }

    final class c extends AbstractSet<K> {

        class a extends b0<K, V>.d<K> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f18175f;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            b0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return b0.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return b0.this.j(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return b0.this.f18157d;
        }
    }

    private abstract class d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        e<K, V> f18166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        e<K, V> f18167b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f18168c;

        d() {
            this.f18166a = b0.this.f18159f.f18173d;
            this.f18168c = b0.this.f18158e;
        }

        final e<K, V> a() {
            e<K, V> eVar = this.f18166a;
            b0 b0Var = b0.this;
            if (eVar == b0Var.f18159f) {
                throw new NoSuchElementException();
            }
            if (b0Var.f18158e != this.f18168c) {
                throw new ConcurrentModificationException();
            }
            this.f18166a = eVar.f18173d;
            this.f18167b = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f18166a != b0.this.f18159f;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f18167b;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            b0.this.i(eVar, true);
            this.f18167b = null;
            this.f18168c = b0.this.f18158e;
        }
    }

    public b0() {
        this(f18153i, true);
    }

    private static boolean b(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    private void h(e<K, V> eVar, boolean z11) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f18171b;
            e<K, V> eVar3 = eVar.f18172c;
            int i11 = eVar2 != null ? eVar2.f18178i : 0;
            int i12 = eVar3 != null ? eVar3.f18178i : 0;
            int i13 = i11 - i12;
            if (i13 == -2) {
                e<K, V> eVar4 = eVar3.f18171b;
                e<K, V> eVar5 = eVar3.f18172c;
                int i14 = (eVar4 != null ? eVar4.f18178i : 0) - (eVar5 != null ? eVar5.f18178i : 0);
                if (i14 == -1 || (i14 == 0 && !z11)) {
                    l(eVar);
                } else {
                    m(eVar3);
                    l(eVar);
                }
                if (z11) {
                    return;
                }
            } else if (i13 == 2) {
                e<K, V> eVar6 = eVar2.f18171b;
                e<K, V> eVar7 = eVar2.f18172c;
                int i15 = (eVar6 != null ? eVar6.f18178i : 0) - (eVar7 != null ? eVar7.f18178i : 0);
                if (i15 == 1 || (i15 == 0 && !z11)) {
                    m(eVar);
                } else {
                    l(eVar2);
                    m(eVar);
                }
                if (z11) {
                    return;
                }
            } else if (i13 == 0) {
                eVar.f18178i = i11 + 1;
                if (z11) {
                    return;
                }
            } else {
                eVar.f18178i = Math.max(i11, i12) + 1;
                if (!z11) {
                    return;
                }
            }
            eVar = eVar.f18170a;
        }
    }

    private void k(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f18170a;
        eVar.f18170a = null;
        if (eVar2 != null) {
            eVar2.f18170a = eVar3;
        }
        if (eVar3 == null) {
            this.f18156c = eVar2;
        } else if (eVar3.f18171b == eVar) {
            eVar3.f18171b = eVar2;
        } else {
            eVar3.f18172c = eVar2;
        }
    }

    private void l(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f18171b;
        e<K, V> eVar3 = eVar.f18172c;
        e<K, V> eVar4 = eVar3.f18171b;
        e<K, V> eVar5 = eVar3.f18172c;
        eVar.f18172c = eVar4;
        if (eVar4 != null) {
            eVar4.f18170a = eVar;
        }
        k(eVar, eVar3);
        eVar3.f18171b = eVar;
        eVar.f18170a = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.f18178i : 0, eVar4 != null ? eVar4.f18178i : 0) + 1;
        eVar.f18178i = iMax;
        eVar3.f18178i = Math.max(iMax, eVar5 != null ? eVar5.f18178i : 0) + 1;
    }

    private void m(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f18171b;
        e<K, V> eVar3 = eVar.f18172c;
        e<K, V> eVar4 = eVar2.f18171b;
        e<K, V> eVar5 = eVar2.f18172c;
        eVar.f18171b = eVar5;
        if (eVar5 != null) {
            eVar5.f18170a = eVar;
        }
        k(eVar, eVar2);
        eVar2.f18172c = eVar;
        eVar.f18170a = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.f18178i : 0, eVar5 != null ? eVar5.f18178i : 0) + 1;
        eVar.f18178i = iMax;
        eVar2.f18178i = Math.max(iMax, eVar4 != null ? eVar4.f18178i : 0) + 1;
    }

    e<K, V> c(K k11, boolean z11) {
        int iCompareTo;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f18154a;
        e<K, V> eVar2 = this.f18156c;
        if (eVar2 != null) {
            Comparable comparable = comparator == f18153i ? (Comparable) k11 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(eVar2.f18175f) : comparator.compare(k11, eVar2.f18175f);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = iCompareTo < 0 ? eVar2.f18171b : eVar2.f18172c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        e<K, V> eVar4 = eVar2;
        if (!z11) {
            return null;
        }
        e<K, V> eVar5 = this.f18159f;
        if (eVar4 != null) {
            eVar = new e<>(this.f18155b, eVar4, k11, eVar5, eVar5.f18174e);
            if (iCompareTo < 0) {
                eVar4.f18171b = eVar;
            } else {
                eVar4.f18172c = eVar;
            }
            h(eVar4, true);
        } else {
            if (comparator == f18153i && !(k11 instanceof Comparable)) {
                throw new ClassCastException(k11.getClass().getName() + " is not Comparable");
            }
            eVar = new e<>(this.f18155b, eVar4, k11, eVar5, eVar5.f18174e);
            this.f18156c = eVar;
        }
        this.f18157d++;
        this.f18158e++;
        return eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f18156c = null;
        this.f18157d = 0;
        this.f18158e++;
        e<K, V> eVar = this.f18159f;
        eVar.f18174e = eVar;
        eVar.f18173d = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return e(obj) != null;
    }

    e<K, V> d(Map.Entry<?, ?> entry) {
        e<K, V> eVarE = e(entry.getKey());
        if (eVarE == null || !b(eVarE.f18177h, entry.getValue())) {
            return null;
        }
        return eVarE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    e<K, V> e(Object obj) {
        if (obj != 0) {
            try {
                return c(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        b0<K, V>.b bVar = this.f18160g;
        if (bVar != null) {
            return bVar;
        }
        b0<K, V>.b bVar2 = new b();
        this.f18160g = bVar2;
        return bVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> eVarE = e(obj);
        if (eVarE != null) {
            return eVarE.f18177h;
        }
        return null;
    }

    void i(e<K, V> eVar, boolean z11) {
        int i11;
        if (z11) {
            e<K, V> eVar2 = eVar.f18174e;
            eVar2.f18173d = eVar.f18173d;
            eVar.f18173d.f18174e = eVar2;
        }
        e<K, V> eVar3 = eVar.f18171b;
        e<K, V> eVar4 = eVar.f18172c;
        e<K, V> eVar5 = eVar.f18170a;
        int i12 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                k(eVar, eVar3);
                eVar.f18171b = null;
            } else if (eVar4 != null) {
                k(eVar, eVar4);
                eVar.f18172c = null;
            } else {
                k(eVar, null);
            }
            h(eVar5, false);
            this.f18157d--;
            this.f18158e++;
            return;
        }
        e<K, V> eVarB = eVar3.f18178i > eVar4.f18178i ? eVar3.b() : eVar4.a();
        i(eVarB, false);
        e<K, V> eVar6 = eVar.f18171b;
        if (eVar6 != null) {
            i11 = eVar6.f18178i;
            eVarB.f18171b = eVar6;
            eVar6.f18170a = eVarB;
            eVar.f18171b = null;
        } else {
            i11 = 0;
        }
        e<K, V> eVar7 = eVar.f18172c;
        if (eVar7 != null) {
            i12 = eVar7.f18178i;
            eVarB.f18172c = eVar7;
            eVar7.f18170a = eVarB;
            eVar.f18172c = null;
        }
        eVarB.f18178i = Math.max(i11, i12) + 1;
        k(eVar, eVarB);
    }

    e<K, V> j(Object obj) {
        e<K, V> eVarE = e(obj);
        if (eVarE != null) {
            i(eVarE, true);
        }
        return eVarE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        b0<K, V>.c cVar = this.f18161h;
        if (cVar != null) {
            return cVar;
        }
        b0<K, V>.c cVar2 = new c();
        this.f18161h = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k11, V v11) {
        if (k11 == null) {
            throw new NullPointerException("key == null");
        }
        if (v11 == null && !this.f18155b) {
            throw new NullPointerException("value == null");
        }
        e<K, V> eVarC = c(k11, true);
        V v12 = eVarC.f18177h;
        eVarC.f18177h = v11;
        return v12;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> eVarJ = j(obj);
        if (eVarJ != null) {
            return eVarJ.f18177h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f18157d;
    }

    public b0(boolean z11) {
        this(f18153i, z11);
    }

    public b0(Comparator<? super K> comparator, boolean z11) {
        this.f18157d = 0;
        this.f18158e = 0;
        this.f18154a = comparator == null ? f18153i : comparator;
        this.f18155b = z11;
        this.f18159f = new e<>(z11);
    }

    static final class e<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        e<K, V> f18170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        e<K, V> f18171b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e<K, V> f18172c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        e<K, V> f18173d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        e<K, V> f18174e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final K f18175f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final boolean f18176g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        V f18177h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f18178i;

        e(boolean z11) {
            this.f18175f = null;
            this.f18176g = z11;
            this.f18174e = this;
            this.f18173d = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f18171b; eVar2 != null; eVar2 = eVar2.f18171b) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f18172c; eVar2 != null; eVar2 = eVar2.f18172c) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k11 = this.f18175f;
                if (k11 != null ? k11.equals(entry.getKey()) : entry.getKey() == null) {
                    V v11 = this.f18177h;
                    if (v11 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v11.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f18175f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f18177h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k11 = this.f18175f;
            int iHashCode = k11 == null ? 0 : k11.hashCode();
            V v11 = this.f18177h;
            return iHashCode ^ (v11 != null ? v11.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v11) {
            if (v11 == null && !this.f18176g) {
                throw new NullPointerException("value == null");
            }
            V v12 = this.f18177h;
            this.f18177h = v11;
            return v12;
        }

        public String toString() {
            return this.f18175f + "=" + this.f18177h;
        }

        e(boolean z11, e<K, V> eVar, K k11, e<K, V> eVar2, e<K, V> eVar3) {
            this.f18170a = eVar;
            this.f18175f = k11;
            this.f18176g = z11;
            this.f18178i = 1;
            this.f18173d = eVar2;
            this.f18174e = eVar3;
            eVar3.f18173d = this;
            eVar2.f18174e = this;
        }
    }
}
