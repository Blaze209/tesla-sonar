package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes5.dex */
class m<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Object f43653j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Object f43654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    transient int[] f43655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    transient Object[] f43656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    transient Object[] f43657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient int f43658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient int f43659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient Set<K> f43660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient Set<Map.Entry<K, V>> f43661h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private transient Collection<V> f43662i;

    class a extends m<K, V>.e<K> {
        a() {
            super(m.this, null);
        }

        @Override // com.google.common.collect.m.e
        K b(int i11) {
            return (K) m.this.K(i11);
        }
    }

    class b extends m<K, V>.e<Map.Entry<K, V>> {
        b() {
            super(m.this, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.m.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> b(int i11) {
            return new g(i11);
        }
    }

    class c extends m<K, V>.e<V> {
        c() {
            super(m.this, null);
        }

        @Override // com.google.common.collect.m.e
        V b(int i11) {
            return (V) m.this.a0(i11);
        }
    }

    private final class d extends AbstractSet<Map.Entry<K, V>> {
        private d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            m.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map<K, V> mapA = m.this.A();
            if (mapA != null) {
                return mapA.entrySet().contains(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int iH = m.this.H(entry.getKey());
                if (iH != -1 && Objects.equals(m.this.a0(iH), entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return m.this.C();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iF;
            int iF2;
            Map<K, V> mapA = m.this.A();
            if (mapA != null) {
                return mapA.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (m.this.N() || (iF2 = n.f(entry.getKey(), entry.getValue(), (iF = m.this.F()), m.this.R(), m.this.P(), m.this.Q(), m.this.S())) == -1) {
                return false;
            }
            m.this.M(iF2, iF);
            m.j(m.this);
            m.this.G();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return m.this.size();
        }

        /* synthetic */ d(m mVar, a aVar) {
            this();
        }
    }

    private final class f extends AbstractSet<K> {
        private f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            m.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return m.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return m.this.L();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> mapA = m.this.A();
            if (mapA != null) {
                return mapA.keySet().remove(obj);
            }
            return m.this.O(obj) != m.f43653j;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return m.this.size();
        }

        /* synthetic */ f(m mVar, a aVar) {
            this();
        }
    }

    final class g extends com.google.common.collect.e<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K f43672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f43673b;

        g(int i11) {
            this.f43672a = (K) m.this.K(i11);
            this.f43673b = i11;
        }

        private void a() {
            int i11 = this.f43673b;
            if (i11 == -1 || i11 >= m.this.size() || !Objects.equals(this.f43672a, m.this.K(this.f43673b))) {
                this.f43673b = m.this.H(this.f43672a);
            }
        }

        @Override // com.google.common.collect.e, java.util.Map.Entry
        public K getKey() {
            return this.f43672a;
        }

        @Override // com.google.common.collect.e, java.util.Map.Entry
        public V getValue() {
            Map<K, V> mapA = m.this.A();
            if (mapA != null) {
                return (V) p0.a(mapA.get(this.f43672a));
            }
            a();
            int i11 = this.f43673b;
            return i11 == -1 ? (V) p0.b() : (V) m.this.a0(i11);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v11) {
            Map<K, V> mapA = m.this.A();
            if (mapA != null) {
                return (V) p0.a(mapA.put(this.f43672a, v11));
            }
            a();
            int i11 = this.f43673b;
            if (i11 == -1) {
                m.this.put(this.f43672a, v11);
                return (V) p0.b();
            }
            V v12 = (V) m.this.a0(i11);
            m.this.Z(this.f43673b, v11);
            return v12;
        }
    }

    private final class h extends AbstractCollection<V> {
        private h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            m.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return m.this.b0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return m.this.size();
        }

        /* synthetic */ h(m mVar, a aVar) {
            this();
        }
    }

    m() {
        I(3);
    }

    private int B(int i11) {
        return P()[i11];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int F() {
        return (1 << (this.f43658e & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int H(Object obj) {
        if (N()) {
            return -1;
        }
        int iC = u.c(obj);
        int iF = F();
        int iH = n.h(R(), iC & iF);
        if (iH == 0) {
            return -1;
        }
        int iB = n.b(iC, iF);
        do {
            int i11 = iH - 1;
            int iB2 = B(i11);
            if (n.b(iB2, iF) == iB && Objects.equals(obj, K(i11))) {
                return i11;
            }
            iH = n.c(iB2, iF);
        } while (iH != 0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public K K(int i11) {
        return (K) Q()[i11];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object O(Object obj) {
        if (N()) {
            return f43653j;
        }
        int iF = F();
        int iF2 = n.f(obj, null, iF, R(), P(), Q(), null);
        if (iF2 == -1) {
            return f43653j;
        }
        V vA0 = a0(iF2);
        M(iF2, iF);
        this.f43659f--;
        G();
        return vA0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] P() {
        int[] iArr = this.f43655b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] Q() {
        Object[] objArr = this.f43656c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object R() {
        Object obj = this.f43654a;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] S() {
        Object[] objArr = this.f43657d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private void U(int i11) {
        int iMin;
        int length = P().length;
        if (i11 <= length || (iMin = Math.min(LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        T(iMin);
    }

    private int V(int i11, int i12, int i13, int i14) {
        Object objA = n.a(i12);
        int i15 = i12 - 1;
        if (i14 != 0) {
            n.i(objA, i13 & i15, i14 + 1);
        }
        Object objR = R();
        int[] iArrP = P();
        for (int i16 = 0; i16 <= i11; i16++) {
            int iH = n.h(objR, i16);
            while (iH != 0) {
                int i17 = iH - 1;
                int i18 = iArrP[i17];
                int iB = n.b(i18, i11) | i16;
                int i19 = iB & i15;
                int iH2 = n.h(objA, i19);
                n.i(objA, i19, iH);
                iArrP[i17] = n.d(iB, iH2, i15);
                iH = n.c(i18, i11);
            }
        }
        this.f43654a = objA;
        X(i15);
        return i15;
    }

    private void W(int i11, int i12) {
        P()[i11] = i12;
    }

    private void X(int i11) {
        this.f43658e = n.d(this.f43658e, 32 - Integer.numberOfLeadingZeros(i11), 31);
    }

    private void Y(int i11, K k11) {
        Q()[i11] = k11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(int i11, V v11) {
        S()[i11] = v11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V a0(int i11) {
        return (V) S()[i11];
    }

    static /* synthetic */ int j(m mVar) {
        int i11 = mVar.f43659f;
        mVar.f43659f = i11 - 1;
        return i11;
    }

    public static <K, V> m<K, V> u() {
        return new m<>();
    }

    public static <K, V> m<K, V> z(int i11) {
        return new m<>(i11);
    }

    Map<K, V> A() {
        Object obj = this.f43654a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    Iterator<Map.Entry<K, V>> C() {
        Map<K, V> mapA = A();
        return mapA != null ? mapA.entrySet().iterator() : new b();
    }

    int D() {
        return isEmpty() ? -1 : 0;
    }

    int E(int i11) {
        int i12 = i11 + 1;
        if (i12 < this.f43659f) {
            return i12;
        }
        return -1;
    }

    void G() {
        this.f43658e += 32;
    }

    void I(int i11) {
        ou.p.e(i11 >= 0, "Expected size must be >= 0");
        this.f43658e = ru.f.g(i11, 1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }

    void J(int i11, K k11, V v11, int i12, int i13) {
        W(i11, n.d(i12, 0, i13));
        Y(i11, k11);
        Z(i11, v11);
    }

    Iterator<K> L() {
        Map<K, V> mapA = A();
        return mapA != null ? mapA.keySet().iterator() : new a();
    }

    void M(int i11, int i12) {
        Object objR = R();
        int[] iArrP = P();
        Object[] objArrQ = Q();
        Object[] objArrS = S();
        int size = size();
        int i13 = size - 1;
        if (i11 >= i13) {
            objArrQ[i11] = null;
            objArrS[i11] = null;
            iArrP[i11] = 0;
            return;
        }
        Object obj = objArrQ[i13];
        objArrQ[i11] = obj;
        objArrS[i11] = objArrS[i13];
        objArrQ[i13] = null;
        objArrS[i13] = null;
        iArrP[i11] = iArrP[i13];
        iArrP[i13] = 0;
        int iC = u.c(obj) & i12;
        int iH = n.h(objR, iC);
        if (iH == size) {
            n.i(objR, iC, i11 + 1);
            return;
        }
        while (true) {
            int i14 = iH - 1;
            int i15 = iArrP[i14];
            int iC2 = n.c(i15, i12);
            if (iC2 == size) {
                iArrP[i14] = n.d(i15, i11 + 1, i12);
                return;
            }
            iH = iC2;
        }
    }

    boolean N() {
        return this.f43654a == null;
    }

    void T(int i11) {
        this.f43655b = Arrays.copyOf(P(), i11);
        this.f43656c = Arrays.copyOf(Q(), i11);
        this.f43657d = Arrays.copyOf(S(), i11);
    }

    Iterator<V> b0() {
        Map<K, V> mapA = A();
        return mapA != null ? mapA.values().iterator() : new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (N()) {
            return;
        }
        G();
        Map<K, V> mapA = A();
        if (mapA != null) {
            this.f43658e = ru.f.g(size(), 3, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
            mapA.clear();
            this.f43654a = null;
            this.f43659f = 0;
            return;
        }
        Arrays.fill(Q(), 0, this.f43659f, (Object) null);
        Arrays.fill(S(), 0, this.f43659f, (Object) null);
        n.g(R());
        Arrays.fill(P(), 0, this.f43659f, 0);
        this.f43659f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map<K, V> mapA = A();
        if (mapA != null) {
            return mapA.containsKey(obj);
        }
        return H(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map<K, V> mapA = A();
        if (mapA != null) {
            return mapA.containsValue(obj);
        }
        for (int i11 = 0; i11 < this.f43659f; i11++) {
            if (Objects.equals(obj, a0(i11))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f43661h;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setV = v();
        this.f43661h = setV;
        return setV;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Map<K, V> mapA = A();
        if (mapA != null) {
            return mapA.get(obj);
        }
        int iH = H(obj);
        if (iH == -1) {
            return null;
        }
        q(iH);
        return a0(iH);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f43660g;
        if (set != null) {
            return set;
        }
        Set<K> setX = x();
        this.f43660g = setX;
        return setX;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k11, V v11) {
        if (N()) {
            s();
        }
        Map<K, V> mapA = A();
        if (mapA != null) {
            return mapA.put(k11, v11);
        }
        int[] iArrP = P();
        Object[] objArrQ = Q();
        Object[] objArrS = S();
        int i11 = this.f43659f;
        int i12 = i11 + 1;
        int iC = u.c(k11);
        int iF = F();
        int i13 = iC & iF;
        int iH = n.h(R(), i13);
        if (iH != 0) {
            int iB = n.b(iC, iF);
            int i14 = 0;
            while (true) {
                int i15 = iH - 1;
                int i16 = iArrP[i15];
                if (n.b(i16, iF) == iB && Objects.equals(k11, objArrQ[i15])) {
                    V v12 = (V) objArrS[i15];
                    objArrS[i15] = v11;
                    q(i15);
                    return v12;
                }
                int iC2 = n.c(i16, iF);
                i14++;
                if (iC2 == 0) {
                    if (i14 < 9) {
                        if (i12 <= iF) {
                            iArrP[i15] = n.d(i16, i12, iF);
                            break;
                        }
                        iF = V(iF, n.e(iF), iC, i11);
                        break;
                    }
                    return t().put(k11, v11);
                }
                k11 = k11;
                v11 = v11;
                iH = iC2;
            }
        } else if (i12 > iF) {
            iF = V(iF, n.e(iF), iC, i11);
        } else {
            n.i(R(), i13, i12);
        }
        int i17 = iF;
        U(i12);
        J(i11, k11, v11, iC, i17);
        this.f43659f = i12;
        G();
        return null;
    }

    void q(int i11) {
    }

    int r(int i11, int i12) {
        return i11 - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Map<K, V> mapA = A();
        if (mapA != null) {
            return mapA.remove(obj);
        }
        V v11 = (V) O(obj);
        if (v11 == f43653j) {
            return null;
        }
        return v11;
    }

    int s() {
        ou.p.s(N(), "Arrays already allocated");
        int i11 = this.f43658e;
        int iJ = n.j(i11);
        this.f43654a = n.a(iJ);
        X(iJ - 1);
        this.f43655b = new int[i11];
        this.f43656c = new Object[i11];
        this.f43657d = new Object[i11];
        return i11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> mapA = A();
        return mapA != null ? mapA.size() : this.f43659f;
    }

    Map<K, V> t() {
        Map<K, V> mapW = w(F() + 1);
        int iD = D();
        while (iD >= 0) {
            mapW.put(K(iD), a0(iD));
            iD = E(iD);
        }
        this.f43654a = mapW;
        this.f43655b = null;
        this.f43656c = null;
        this.f43657d = null;
        G();
        return mapW;
    }

    Set<Map.Entry<K, V>> v() {
        return new d(this, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f43662i;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionY = y();
        this.f43662i = collectionY;
        return collectionY;
    }

    Map<K, V> w(int i11) {
        return new LinkedHashMap(i11, 1.0f);
    }

    Set<K> x() {
        return new f(this, null);
    }

    Collection<V> y() {
        return new h(this, null);
    }

    m(int i11) {
        I(i11);
    }

    private abstract class e<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f43667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f43668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f43669c;

        private e() {
            this.f43667a = m.this.f43658e;
            this.f43668b = m.this.D();
            this.f43669c = -1;
        }

        private void a() {
            if (m.this.f43658e != this.f43667a) {
                throw new ConcurrentModificationException();
            }
        }

        abstract T b(int i11);

        void c() {
            this.f43667a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f43668b >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i11 = this.f43668b;
            this.f43669c = i11;
            T tB = b(i11);
            this.f43668b = m.this.E(this.f43668b);
            return tB;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            k.c(this.f43669c >= 0);
            c();
            m mVar = m.this;
            mVar.remove(mVar.K(this.f43669c));
            this.f43668b = m.this.r(this.f43668b, this.f43669c);
            this.f43669c = -1;
        }

        /* synthetic */ e(m mVar, a aVar) {
            this();
        }
    }
}
