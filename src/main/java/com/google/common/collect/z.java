package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes5.dex */
public abstract class z<K, V> implements Map<K, V>, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Map.Entry<?, ?>[] f43726d = new Map.Entry[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient b0<Map.Entry<K, V>> f43727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient b0<K> f43728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient w<V> f43729c;

    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Comparator<? super V> f43730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object[] f43731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f43732c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f43733d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        C0686a f43734e;

        /* JADX INFO: renamed from: com.google.common.collect.z$a$a, reason: collision with other inner class name */
        static final class C0686a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f43735a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Object f43736b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Object f43737c;

            C0686a(Object obj, Object obj2, Object obj3) {
                this.f43735a = obj;
                this.f43736b = obj2;
                this.f43737c = obj3;
            }

            IllegalArgumentException a() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f43735a + "=" + this.f43736b + " and " + this.f43735a + "=" + this.f43737c);
            }
        }

        public a() {
            this(4);
        }

        private z<K, V> b(boolean z11) {
            Object[] objArrE;
            C0686a c0686a;
            C0686a c0686a2;
            if (z11 && (c0686a2 = this.f43734e) != null) {
                throw c0686a2.a();
            }
            int length = this.f43732c;
            if (this.f43730a == null) {
                objArrE = this.f43731b;
            } else {
                if (this.f43733d) {
                    this.f43731b = Arrays.copyOf(this.f43731b, length * 2);
                }
                objArrE = this.f43731b;
                if (!z11) {
                    objArrE = e(objArrE, this.f43732c);
                    if (objArrE.length < this.f43731b.length) {
                        length = objArrE.length >>> 1;
                    }
                }
                j(objArrE, length, this.f43730a);
            }
            this.f43733d = true;
            v0 v0VarS = v0.s(length, objArrE, this);
            if (!z11 || (c0686a = this.f43734e) == null) {
                return v0VarS;
            }
            throw c0686a.a();
        }

        private void d(int i11) {
            int i12 = i11 * 2;
            Object[] objArr = this.f43731b;
            if (i12 > objArr.length) {
                this.f43731b = Arrays.copyOf(objArr, w.b.c(objArr.length, i12));
                this.f43733d = false;
            }
        }

        private Object[] e(Object[] objArr, int i11) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i12 = i11 - 1; i12 >= 0; i12--) {
                Object obj = objArr[i12 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i12);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i11 - bitSet.cardinality()) * 2];
            int i13 = 0;
            int i14 = 0;
            while (i13 < i11 * 2) {
                if (bitSet.get(i13 >>> 1)) {
                    i13 += 2;
                } else {
                    int i15 = i14 + 1;
                    int i16 = i13 + 1;
                    Object obj2 = objArr[i13];
                    Objects.requireNonNull(obj2);
                    objArr2[i14] = obj2;
                    i14 += 2;
                    i13 += 2;
                    Object obj3 = objArr[i16];
                    Objects.requireNonNull(obj3);
                    objArr2[i15] = obj3;
                }
            }
            return objArr2;
        }

        static <V> void j(Object[] objArr, int i11, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = i12 * 2;
                Object obj = objArr[i13];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i13 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i12] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i11, r0.b(comparator).j(j0.l()));
            for (int i14 = 0; i14 < i11; i14++) {
                int i15 = i14 * 2;
                objArr[i15] = entryArr[i14].getKey();
                objArr[i15 + 1] = entryArr[i14].getValue();
            }
        }

        public z<K, V> a() {
            return c();
        }

        public z<K, V> c() {
            return b(true);
        }

        public a<K, V> f(K k11, V v11) {
            d(this.f43732c + 1);
            k.a(k11, v11);
            Object[] objArr = this.f43731b;
            int i11 = this.f43732c;
            objArr[i11 * 2] = k11;
            objArr[(i11 * 2) + 1] = v11;
            this.f43732c = i11 + 1;
            return this;
        }

        public a<K, V> g(Map.Entry<? extends K, ? extends V> entry) {
            return f(entry.getKey(), entry.getValue());
        }

        public a<K, V> h(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                d(this.f43732c + ((Collection) iterable).size());
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                g(it.next());
            }
            return this;
        }

        public a<K, V> i(Map<? extends K, ? extends V> map) {
            return h(map.entrySet());
        }

        a(int i11) {
            this.f43731b = new Object[i11 * 2];
            this.f43732c = 0;
            this.f43733d = false;
        }
    }

    z() {
    }

    public static <K, V> a<K, V> b() {
        return new a<>();
    }

    public static <K, V> z<K, V> c(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.h(iterable);
        return aVar.a();
    }

    public static <K, V> z<K, V> d(Map<? extends K, ? extends V> map) {
        if ((map instanceof z) && !(map instanceof SortedMap)) {
            z<K, V> zVar = (z) map;
            if (!zVar.k()) {
                return zVar;
            }
        }
        return c(map.entrySet());
    }

    public static <K, V> z<K, V> m() {
        return (z<K, V>) v0.f43694h;
    }

    public static <K, V> z<K, V> n(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        k.a(k11, v11);
        k.a(k12, v12);
        k.a(k13, v13);
        k.a(k14, v14);
        return v0.r(4, new Object[]{k11, v11, k12, v12, k13, v13, k14, v14});
    }

    public static <K, V> z<K, V> o(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15) {
        k.a(k11, v11);
        k.a(k12, v12);
        k.a(k13, v13);
        k.a(k14, v14);
        k.a(k15, v15);
        return v0.r(5, new Object[]{k11, v11, k12, v12, k13, v13, k14, v14, k15, v15});
    }

    @SafeVarargs
    public static <K, V> z<K, V> p(Map.Entry<? extends K, ? extends V>... entryArr) {
        return c(Arrays.asList(entryArr));
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract b0<Map.Entry<K, V>> e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return j0.c(this, obj);
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v11) {
        V v12 = get(obj);
        return v12 != null ? v12 : v11;
    }

    abstract b0<K> h();

    @Override // java.util.Map
    public int hashCode() {
        return z0.d(entrySet());
    }

    abstract w<V> i();

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public b0<Map.Entry<K, V>> entrySet() {
        b0<Map.Entry<K, V>> b0Var = this.f43727a;
        if (b0Var != null) {
            return b0Var;
        }
        b0<Map.Entry<K, V>> b0VarE = e();
        this.f43727a = b0VarE;
        return b0VarE;
    }

    abstract boolean k();

    @Override // java.util.Map
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public b0<K> keySet() {
        b0<K> b0Var = this.f43728b;
        if (b0Var != null) {
            return b0Var;
        }
        b0<K> b0VarH = h();
        this.f43728b = b0VarH;
        return b0VarH;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k11, V v11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public w<V> values() {
        w<V> wVar = this.f43729c;
        if (wVar != null) {
            return wVar;
        }
        w<V> wVarI = i();
        this.f43729c = wVarI;
        return wVarI;
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return j0.k(this);
    }
}
