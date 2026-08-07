package com.squareup.moshi;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
final class s<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator<Comparable> f49467i = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Comparator<? super K> f49468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    g<K, V>[] f49469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final g<K, V> f49470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f49471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f49472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f49473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private s<K, V>.d f49474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private s<K, V>.e f49475h;

    class a implements Comparator<Comparable> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    static final class b<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private g<K, V> f49476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f49477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f49478c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f49479d;

        b() {
        }

        void a(g<K, V> gVar) {
            gVar.f49491c = null;
            gVar.f49489a = null;
            gVar.f49490b = null;
            gVar.f49497i = 1;
            int i11 = this.f49477b;
            if (i11 > 0) {
                int i12 = this.f49479d;
                if ((i12 & 1) == 0) {
                    this.f49479d = i12 + 1;
                    this.f49477b = i11 - 1;
                    this.f49478c++;
                }
            }
            gVar.f49489a = this.f49476a;
            this.f49476a = gVar;
            int i13 = this.f49479d;
            int i14 = i13 + 1;
            this.f49479d = i14;
            int i15 = this.f49477b;
            if (i15 > 0 && (i14 & 1) == 0) {
                this.f49479d = i13 + 2;
                this.f49477b = i15 - 1;
                this.f49478c++;
            }
            int i16 = 4;
            while (true) {
                int i17 = i16 - 1;
                if ((this.f49479d & i17) != i17) {
                    return;
                }
                int i18 = this.f49478c;
                if (i18 == 0) {
                    g<K, V> gVar2 = this.f49476a;
                    g<K, V> gVar3 = gVar2.f49489a;
                    g<K, V> gVar4 = gVar3.f49489a;
                    gVar3.f49489a = gVar4.f49489a;
                    this.f49476a = gVar3;
                    gVar3.f49490b = gVar4;
                    gVar3.f49491c = gVar2;
                    gVar3.f49497i = gVar2.f49497i + 1;
                    gVar4.f49489a = gVar3;
                    gVar2.f49489a = gVar3;
                } else if (i18 == 1) {
                    g<K, V> gVar5 = this.f49476a;
                    g<K, V> gVar6 = gVar5.f49489a;
                    this.f49476a = gVar6;
                    gVar6.f49491c = gVar5;
                    gVar6.f49497i = gVar5.f49497i + 1;
                    gVar5.f49489a = gVar6;
                    this.f49478c = 0;
                } else if (i18 == 2) {
                    this.f49478c = 0;
                }
                i16 *= 2;
            }
        }

        void b(int i11) {
            this.f49477b = ((Integer.highestOneBit(i11) * 2) - 1) - i11;
            this.f49479d = 0;
            this.f49478c = 0;
            this.f49476a = null;
        }

        g<K, V> c() {
            g<K, V> gVar = this.f49476a;
            if (gVar.f49489a == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    static class c<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private g<K, V> f49480a;

        c() {
        }

        public g<K, V> a() {
            g<K, V> gVar = this.f49480a;
            if (gVar == null) {
                return null;
            }
            g<K, V> gVar2 = gVar.f49489a;
            gVar.f49489a = null;
            g<K, V> gVar3 = gVar.f49491c;
            while (true) {
                g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                if (gVar2 == null) {
                    this.f49480a = gVar4;
                    return gVar;
                }
                gVar2.f49489a = gVar4;
                gVar3 = gVar2.f49490b;
            }
        }

        void b(g<K, V> gVar) {
            g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.f49489a = gVar2;
                gVar2 = gVar;
                gVar = gVar.f49490b;
            }
            this.f49480a = gVar2;
        }
    }

    final class d extends AbstractSet<Map.Entry<K, V>> {

        class a extends s<K, V>.f<Map.Entry<K, V>> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            s.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && s.this.h((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            g<K, V> gVarH;
            if (!(obj instanceof Map.Entry) || (gVarH = s.this.h((Map.Entry) obj)) == null) {
                return false;
            }
            s.this.k(gVarH, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return s.this.f49471d;
        }
    }

    final class e extends AbstractSet<K> {

        class a extends s<K, V>.f<K> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f49494f;
            }
        }

        e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            s.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return s.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return s.this.l(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return s.this.f49471d;
        }
    }

    abstract class f<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g<K, V> f49485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g<K, V> f49486b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f49487c;

        f() {
            this.f49485a = s.this.f49470c.f49492d;
            this.f49487c = s.this.f49472e;
        }

        final g<K, V> a() {
            g<K, V> gVar = this.f49485a;
            s sVar = s.this;
            if (gVar == sVar.f49470c) {
                throw new NoSuchElementException();
            }
            if (sVar.f49472e != this.f49487c) {
                throw new ConcurrentModificationException();
            }
            this.f49485a = gVar.f49492d;
            this.f49486b = gVar;
            return gVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f49485a != s.this.f49470c;
        }

        @Override // java.util.Iterator
        public final void remove() {
            g<K, V> gVar = this.f49486b;
            if (gVar == null) {
                throw new IllegalStateException();
            }
            s.this.k(gVar, true);
            this.f49486b = null;
            this.f49487c = s.this.f49472e;
        }
    }

    s() {
        this(null);
    }

    private void b() {
        g<K, V>[] gVarArrC = c(this.f49469b);
        this.f49469b = gVarArrC;
        this.f49473f = (gVarArrC.length / 2) + (gVarArrC.length / 4);
    }

    static <K, V> g<K, V>[] c(g<K, V>[] gVarArr) {
        int length = gVarArr.length;
        g<K, V>[] gVarArr2 = new g[length * 2];
        c cVar = new c();
        b bVar = new b();
        b bVar2 = new b();
        for (int i11 = 0; i11 < length; i11++) {
            g<K, V> gVar = gVarArr[i11];
            if (gVar != null) {
                cVar.b(gVar);
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    g<K, V> gVarA = cVar.a();
                    if (gVarA == null) {
                        break;
                    }
                    if ((gVarA.f49495g & length) == 0) {
                        i12++;
                    } else {
                        i13++;
                    }
                }
                bVar.b(i12);
                bVar2.b(i13);
                cVar.b(gVar);
                while (true) {
                    g<K, V> gVarA2 = cVar.a();
                    if (gVarA2 == null) {
                        break;
                    }
                    if ((gVarA2.f49495g & length) == 0) {
                        bVar.a(gVarA2);
                    } else {
                        bVar2.a(gVarA2);
                    }
                }
                gVarArr2[i11] = i12 > 0 ? bVar.c() : null;
                gVarArr2[i11 + length] = i13 > 0 ? bVar2.c() : null;
            }
        }
        return gVarArr2;
    }

    private boolean d(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    private void j(g<K, V> gVar, boolean z11) {
        while (gVar != null) {
            g<K, V> gVar2 = gVar.f49490b;
            g<K, V> gVar3 = gVar.f49491c;
            int i11 = gVar2 != null ? gVar2.f49497i : 0;
            int i12 = gVar3 != null ? gVar3.f49497i : 0;
            int i13 = i11 - i12;
            if (i13 == -2) {
                g<K, V> gVar4 = gVar3.f49490b;
                g<K, V> gVar5 = gVar3.f49491c;
                int i14 = (gVar4 != null ? gVar4.f49497i : 0) - (gVar5 != null ? gVar5.f49497i : 0);
                if (i14 != -1 && (i14 != 0 || z11)) {
                    o(gVar3);
                }
                n(gVar);
                if (z11) {
                    return;
                }
            } else if (i13 == 2) {
                g<K, V> gVar6 = gVar2.f49490b;
                g<K, V> gVar7 = gVar2.f49491c;
                int i15 = (gVar6 != null ? gVar6.f49497i : 0) - (gVar7 != null ? gVar7.f49497i : 0);
                if (i15 != 1 && (i15 != 0 || z11)) {
                    n(gVar2);
                }
                o(gVar);
                if (z11) {
                    return;
                }
            } else if (i13 == 0) {
                gVar.f49497i = i11 + 1;
                if (z11) {
                    return;
                }
            } else {
                gVar.f49497i = Math.max(i11, i12) + 1;
                if (!z11) {
                    return;
                }
            }
            gVar = gVar.f49489a;
        }
    }

    private void m(g<K, V> gVar, g<K, V> gVar2) {
        g<K, V> gVar3 = gVar.f49489a;
        gVar.f49489a = null;
        if (gVar2 != null) {
            gVar2.f49489a = gVar3;
        }
        if (gVar3 == null) {
            int i11 = gVar.f49495g;
            g<K, V>[] gVarArr = this.f49469b;
            gVarArr[i11 & (gVarArr.length - 1)] = gVar2;
        } else if (gVar3.f49490b == gVar) {
            gVar3.f49490b = gVar2;
        } else {
            gVar3.f49491c = gVar2;
        }
    }

    private void n(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f49490b;
        g<K, V> gVar3 = gVar.f49491c;
        g<K, V> gVar4 = gVar3.f49490b;
        g<K, V> gVar5 = gVar3.f49491c;
        gVar.f49491c = gVar4;
        if (gVar4 != null) {
            gVar4.f49489a = gVar;
        }
        m(gVar, gVar3);
        gVar3.f49490b = gVar;
        gVar.f49489a = gVar3;
        int iMax = Math.max(gVar2 != null ? gVar2.f49497i : 0, gVar4 != null ? gVar4.f49497i : 0) + 1;
        gVar.f49497i = iMax;
        gVar3.f49497i = Math.max(iMax, gVar5 != null ? gVar5.f49497i : 0) + 1;
    }

    private void o(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f49490b;
        g<K, V> gVar3 = gVar.f49491c;
        g<K, V> gVar4 = gVar2.f49490b;
        g<K, V> gVar5 = gVar2.f49491c;
        gVar.f49490b = gVar5;
        if (gVar5 != null) {
            gVar5.f49489a = gVar;
        }
        m(gVar, gVar2);
        gVar2.f49491c = gVar;
        gVar.f49489a = gVar2;
        int iMax = Math.max(gVar3 != null ? gVar3.f49497i : 0, gVar5 != null ? gVar5.f49497i : 0) + 1;
        gVar.f49497i = iMax;
        gVar2.f49497i = Math.max(iMax, gVar4 != null ? gVar4.f49497i : 0) + 1;
    }

    private static int p(int i11) {
        int i12 = i11 ^ ((i11 >>> 20) ^ (i11 >>> 12));
        return (i12 >>> 4) ^ ((i12 >>> 7) ^ i12);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f49469b, (Object) null);
        this.f49471d = 0;
        this.f49472e++;
        g<K, V> gVar = this.f49470c;
        g<K, V> gVar2 = gVar.f49492d;
        while (gVar2 != gVar) {
            g<K, V> gVar3 = gVar2.f49492d;
            gVar2.f49493e = null;
            gVar2.f49492d = null;
            gVar2 = gVar3;
        }
        gVar.f49493e = gVar;
        gVar.f49492d = gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return i(obj) != null;
    }

    g<K, V> e(K k11, boolean z11) {
        int iCompareTo;
        g<K, V> gVar;
        Comparator<? super K> comparator = this.f49468a;
        g<K, V>[] gVarArr = this.f49469b;
        int iP = p(k11.hashCode());
        int length = (gVarArr.length - 1) & iP;
        g<K, V> gVar2 = gVarArr[length];
        if (gVar2 != null) {
            Comparable comparable = comparator == f49467i ? (Comparable) k11 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(gVar2.f49494f) : comparator.compare(k11, gVar2.f49494f);
                if (iCompareTo == 0) {
                    return gVar2;
                }
                g<K, V> gVar3 = iCompareTo < 0 ? gVar2.f49490b : gVar2.f49491c;
                if (gVar3 == null) {
                    break;
                }
                gVar2 = gVar3;
            }
        } else {
            iCompareTo = 0;
        }
        int i11 = iCompareTo;
        if (!z11) {
            return null;
        }
        g<K, V> gVar4 = this.f49470c;
        if (gVar2 != null) {
            g<K, V> gVar5 = gVar2;
            gVar = new g<>(gVar5, k11, iP, gVar4, gVar4.f49493e);
            if (i11 < 0) {
                gVar5.f49490b = gVar;
            } else {
                gVar5.f49491c = gVar;
            }
            j(gVar5, true);
        } else {
            if (comparator == f49467i && !(k11 instanceof Comparable)) {
                throw new ClassCastException(k11.getClass().getName() + " is not Comparable");
            }
            gVar = new g<>(gVar2, k11, iP, gVar4, gVar4.f49493e);
            gVarArr[length] = gVar;
        }
        int i12 = this.f49471d;
        this.f49471d = i12 + 1;
        if (i12 > this.f49473f) {
            b();
        }
        this.f49472e++;
        return gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        s<K, V>.d dVar = this.f49474g;
        if (dVar != null) {
            return dVar;
        }
        s<K, V>.d dVar2 = new d();
        this.f49474g = dVar2;
        return dVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        g<K, V> gVarI = i(obj);
        if (gVarI != null) {
            return gVarI.f49496h;
        }
        return null;
    }

    g<K, V> h(Map.Entry<?, ?> entry) {
        g<K, V> gVarI = i(entry.getKey());
        if (gVarI == null || !d(gVarI.f49496h, entry.getValue())) {
            return null;
        }
        return gVarI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    g<K, V> i(Object obj) {
        if (obj != 0) {
            try {
                return e(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    void k(g<K, V> gVar, boolean z11) {
        int i11;
        if (z11) {
            g<K, V> gVar2 = gVar.f49493e;
            gVar2.f49492d = gVar.f49492d;
            gVar.f49492d.f49493e = gVar2;
            gVar.f49493e = null;
            gVar.f49492d = null;
        }
        g<K, V> gVar3 = gVar.f49490b;
        g<K, V> gVar4 = gVar.f49491c;
        g<K, V> gVar5 = gVar.f49489a;
        int i12 = 0;
        if (gVar3 == null || gVar4 == null) {
            if (gVar3 != null) {
                m(gVar, gVar3);
                gVar.f49490b = null;
            } else if (gVar4 != null) {
                m(gVar, gVar4);
                gVar.f49491c = null;
            } else {
                m(gVar, null);
            }
            j(gVar5, false);
            this.f49471d--;
            this.f49472e++;
            return;
        }
        g<K, V> gVarB = gVar3.f49497i > gVar4.f49497i ? gVar3.b() : gVar4.a();
        k(gVarB, false);
        g<K, V> gVar6 = gVar.f49490b;
        if (gVar6 != null) {
            i11 = gVar6.f49497i;
            gVarB.f49490b = gVar6;
            gVar6.f49489a = gVarB;
            gVar.f49490b = null;
        } else {
            i11 = 0;
        }
        g<K, V> gVar7 = gVar.f49491c;
        if (gVar7 != null) {
            i12 = gVar7.f49497i;
            gVarB.f49491c = gVar7;
            gVar7.f49489a = gVarB;
            gVar.f49491c = null;
        }
        gVarB.f49497i = Math.max(i11, i12) + 1;
        m(gVar, gVarB);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        s<K, V>.e eVar = this.f49475h;
        if (eVar != null) {
            return eVar;
        }
        s<K, V>.e eVar2 = new e();
        this.f49475h = eVar2;
        return eVar2;
    }

    g<K, V> l(Object obj) {
        g<K, V> gVarI = i(obj);
        if (gVarI != null) {
            k(gVarI, true);
        }
        return gVarI;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k11, V v11) {
        if (k11 == null) {
            throw new NullPointerException("key == null");
        }
        g<K, V> gVarE = e(k11, true);
        V v12 = gVarE.f49496h;
        gVarE.f49496h = v11;
        return v12;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g<K, V> gVarL = l(obj);
        if (gVarL != null) {
            return gVarL.f49496h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f49471d;
    }

    s(Comparator<? super K> comparator) {
        this.f49471d = 0;
        this.f49472e = 0;
        this.f49468a = comparator == null ? f49467i : comparator;
        this.f49470c = new g<>();
        g<K, V>[] gVarArr = new g[16];
        this.f49469b = gVarArr;
        this.f49473f = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    static final class g<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g<K, V> f49489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g<K, V> f49490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        g<K, V> f49491c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        g<K, V> f49492d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        g<K, V> f49493e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final K f49494f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final int f49495g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        V f49496h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f49497i;

        g() {
            this.f49494f = null;
            this.f49495g = -1;
            this.f49493e = this;
            this.f49492d = this;
        }

        public g<K, V> a() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f49490b; gVar2 != null; gVar2 = gVar2.f49490b) {
                gVar = gVar2;
            }
            return gVar;
        }

        public g<K, V> b() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f49491c; gVar2 != null; gVar2 = gVar2.f49491c) {
                gVar = gVar2;
            }
            return gVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k11 = this.f49494f;
                if (k11 != null ? k11.equals(entry.getKey()) : entry.getKey() == null) {
                    V v11 = this.f49496h;
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
            return this.f49494f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f49496h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k11 = this.f49494f;
            int iHashCode = k11 == null ? 0 : k11.hashCode();
            V v11 = this.f49496h;
            return iHashCode ^ (v11 != null ? v11.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v11) {
            V v12 = this.f49496h;
            this.f49496h = v11;
            return v12;
        }

        public String toString() {
            return this.f49494f + "=" + this.f49496h;
        }

        g(g<K, V> gVar, K k11, int i11, g<K, V> gVar2, g<K, V> gVar3) {
            this.f49489a = gVar;
            this.f49494f = k11;
            this.f49495g = i11;
            this.f49497i = 1;
            this.f49492d = gVar2;
            this.f49493e = gVar3;
            gVar3.f49492d = this;
            gVar2.f49493e = this;
        }
    }
}
