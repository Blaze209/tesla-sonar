package net.time4j.format.expert;

import java.util.AbstractSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import net.time4j.engine.ChronoException;
import net.time4j.h0;

/* JADX INFO: loaded from: classes9.dex */
class v extends t<v> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Set<net.time4j.engine.p<?>> f94416k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f94417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f94418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<net.time4j.engine.p<?>, Object> f94419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f94420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f94421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f94422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f94423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f94424h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f94425i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f94426j = -1;

    private class b implements Iterator<net.time4j.engine.p<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f94427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f94428b;

        private b() {
            this.f94427a = v.this.f94421e;
            this.f94428b = v.this.f94424h;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> next() {
            Object obj;
            if (this.f94428b > 0) {
                Object[] objArr = v.this.f94417a;
                do {
                    int i11 = this.f94427a - 1;
                    this.f94427a = i11;
                    if (i11 >= 0) {
                        obj = objArr[i11];
                    }
                } while (obj == null);
                this.f94428b--;
                return (net.time4j.engine.p) net.time4j.engine.p.class.cast(obj);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f94428b > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    private class c extends AbstractSet<net.time4j.engine.p<?>> {
        private c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<net.time4j.engine.p<?>> iterator() {
            return new b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return v.this.f94424h;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(net.time4j.g0.f94489p);
        hashSet.add(net.time4j.g0.f94493t);
        hashSet.add(net.time4j.g0.f94494u);
        hashSet.add(h0.f94530u);
        hashSet.add(h0.f94532w);
        hashSet.add(h0.f94534y);
        hashSet.add(h0.C);
        f94416k = Collections.unmodifiableSet(hashSet);
    }

    v(int i11, boolean z11) {
        if (z11) {
            this.f94421e = Integer.MIN_VALUE;
            this.f94422f = Integer.MIN_VALUE;
            this.f94423g = Integer.MIN_VALUE;
            this.f94424h = Integer.MIN_VALUE;
            this.f94417a = null;
            this.f94418b = null;
            this.f94420d = new int[3];
            for (int i12 = 0; i12 < 3; i12++) {
                this.f94420d[i12] = Integer.MIN_VALUE;
            }
        } else {
            int iM = M(i11);
            this.f94421e = iM;
            this.f94422f = iM - 1;
            this.f94423g = R(iM);
            int i13 = this.f94421e;
            this.f94417a = new Object[i13];
            this.f94418b = null;
            this.f94420d = new int[i13];
            this.f94424h = 0;
        }
        this.f94419c = null;
    }

    private static int M(int i11) {
        return Math.max(2, T((int) Math.ceil(i11 / 0.75f)));
    }

    private static net.time4j.engine.p<Integer> N(int i11) {
        switch (i11) {
            case 0:
                return net.time4j.g0.f94489p;
            case 1:
                return net.time4j.g0.f94493t;
            case 2:
                return net.time4j.g0.f94494u;
            case 3:
                return h0.f94530u;
            case 4:
                return h0.f94532w;
            case 5:
                return h0.f94534y;
            case 6:
                return h0.C;
            default:
                throw new IllegalStateException("No element index: " + i11);
        }
    }

    private int O(net.time4j.engine.p<?> pVar) {
        Object obj;
        Object[] objArr = this.f94417a;
        if (objArr != null) {
            int iS = S(pVar.hashCode()) & this.f94422f;
            Object obj2 = objArr[iS];
            if (obj2 == null) {
                return Integer.MIN_VALUE;
            }
            if (pVar.equals(obj2)) {
                return this.f94420d[iS];
            }
            do {
                iS = (iS + 1) & this.f94422f;
                obj = objArr[iS];
                if (obj == null) {
                    return Integer.MIN_VALUE;
                }
            } while (!pVar.equals(obj));
            return this.f94420d[iS];
        }
        if (pVar == net.time4j.g0.f94489p) {
            return this.f94420d[0];
        }
        if (pVar == net.time4j.g0.f94493t) {
            return this.f94420d[1];
        }
        if (pVar == net.time4j.g0.f94494u) {
            return this.f94420d[2];
        }
        if (pVar == h0.f94530u) {
            return this.f94421e;
        }
        if (pVar == h0.f94532w) {
            return this.f94422f;
        }
        if (pVar == h0.f94534y) {
            return this.f94423g;
        }
        if (pVar == h0.C) {
            return this.f94424h;
        }
        Map<net.time4j.engine.p<?>, Object> map = this.f94419c;
        if (map == null || !map.containsKey(pVar)) {
            return Integer.MIN_VALUE;
        }
        return ((Integer) Integer.class.cast(map.get(pVar))).intValue();
    }

    static boolean Q(net.time4j.engine.p<?> pVar) {
        return f94416k.contains(pVar);
    }

    private static int R(int i11) {
        return Math.min((int) Math.ceil(i11 * 0.75f), i11 - 1);
    }

    private static int S(int i11) {
        int i12 = i11 * (-1640531527);
        return i12 ^ (i12 >>> 16);
    }

    private static int T(int i11) {
        if (i11 == 0) {
            return 1;
        }
        int i12 = i11 - 1;
        int i13 = i12 | (i12 >> 1);
        int i14 = i13 | (i13 >> 2);
        int i15 = i14 | (i14 >> 4);
        int i16 = i15 | (i15 >> 8);
        return (i16 | (i16 >> 16)) + 1;
    }

    private void V(int i11) {
        Object obj;
        Object[] objArr = this.f94417a;
        Object[] objArr2 = this.f94418b;
        int[] iArr = this.f94420d;
        int i12 = i11 - 1;
        Object[] objArr3 = new Object[i11];
        Object[] objArr4 = objArr2 == null ? null : new Object[i11];
        int[] iArr2 = new int[i11];
        int i13 = this.f94421e;
        int i14 = this.f94424h;
        for (int i15 = 0; i15 < i14; i15++) {
            do {
                i13--;
                obj = objArr[i13];
            } while (obj == null);
            int iS = S(obj.hashCode()) & i12;
            if (objArr3[iS] != null) {
                do {
                    iS = (iS + 1) & i12;
                } while (objArr3[iS] != null);
            }
            objArr3[iS] = objArr[i13];
            if (objArr2 != null) {
                objArr4[iS] = objArr2[i13];
            }
            iArr2[iS] = iArr[i13];
        }
        this.f94421e = i11;
        this.f94422f = i12;
        this.f94423g = R(i11);
        this.f94417a = objArr3;
        this.f94418b = objArr4;
        this.f94420d = iArr2;
    }

    private void W(Object obj) {
        Object obj2;
        Object[] objArr = this.f94417a;
        if (objArr != null) {
            int iS = S(obj.hashCode()) & this.f94422f;
            Object obj3 = objArr[iS];
            if (obj3 == null) {
                return;
            }
            if (obj.equals(obj3)) {
                X(iS);
                return;
            }
            do {
                iS = (iS + 1) & this.f94422f;
                obj2 = objArr[iS];
                if (obj2 == null) {
                    return;
                }
            } while (!obj.equals(obj2));
            X(iS);
            return;
        }
        if (obj == net.time4j.g0.f94489p) {
            this.f94420d[0] = Integer.MIN_VALUE;
            return;
        }
        if (obj == net.time4j.g0.f94493t) {
            this.f94420d[1] = Integer.MIN_VALUE;
            return;
        }
        if (obj == net.time4j.g0.f94494u) {
            this.f94420d[2] = Integer.MIN_VALUE;
            return;
        }
        if (obj == h0.f94530u) {
            this.f94421e = Integer.MIN_VALUE;
            return;
        }
        if (obj == h0.f94532w) {
            this.f94422f = Integer.MIN_VALUE;
            return;
        }
        if (obj == h0.f94534y) {
            this.f94423g = Integer.MIN_VALUE;
            return;
        }
        if (obj == h0.C) {
            this.f94424h = Integer.MIN_VALUE;
            return;
        }
        Map<net.time4j.engine.p<?>, Object> map = this.f94419c;
        if (map != null) {
            map.remove(obj);
        }
    }

    private void X(int i11) {
        Object obj;
        this.f94424h--;
        Object[] objArr = this.f94417a;
        while (true) {
            int i12 = (i11 + 1) & this.f94422f;
            while (true) {
                obj = objArr[i12];
                if (obj != null) {
                    int iS = S(obj.hashCode());
                    int i13 = this.f94422f;
                    int i14 = iS & i13;
                    if (i11 > i12) {
                        if (i11 >= i14 && i14 > i12) {
                            break;
                        } else {
                            i12 = (i12 + 1) & i13;
                        }
                    } else if (i11 >= i14 || i14 > i12) {
                        break;
                    } else {
                        i12 = (i12 + 1) & i13;
                    }
                } else {
                    objArr[i11] = null;
                    return;
                }
            }
            objArr[i11] = obj;
            Object[] objArr2 = this.f94418b;
            if (objArr2 != null) {
                objArr2[i11] = objArr2[i12];
            }
            int[] iArr = this.f94420d;
            iArr[i11] = iArr[i12];
            i11 = i12;
        }
    }

    @Override // net.time4j.format.expert.t
    <E> E D() {
        return null;
    }

    @Override // net.time4j.format.expert.t
    void E(net.time4j.engine.p<?> pVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Object[] objArr = this.f94417a;
        if (objArr != null) {
            int iS = S(pVar.hashCode()) & this.f94422f;
            Object obj = objArr[iS];
            if (obj != null) {
                if (!obj.equals(pVar)) {
                    while (true) {
                        iS = (iS + 1) & this.f94422f;
                        Object obj2 = objArr[iS];
                        if (obj2 == null) {
                            break;
                        }
                        if (obj2.equals(pVar)) {
                            if (!this.f94425i && this.f94420d[iS] != i11) {
                                throw new net.time4j.format.expert.a(pVar);
                            }
                            this.f94420d[iS] = i11;
                            return;
                        }
                    }
                } else {
                    if (!this.f94425i && this.f94420d[iS] != i11) {
                        throw new net.time4j.format.expert.a(pVar);
                    }
                    this.f94420d[iS] = i11;
                    return;
                }
            }
            objArr[iS] = pVar;
            this.f94420d[iS] = i11;
            int i19 = this.f94424h;
            int i21 = i19 + 1;
            this.f94424h = i21;
            if (i19 >= this.f94423g) {
                V(M(i21));
                return;
            }
            return;
        }
        if (pVar == net.time4j.g0.f94489p) {
            if (!this.f94425i && (i18 = this.f94420d[0]) != Integer.MIN_VALUE && i18 != i11) {
                throw new net.time4j.format.expert.a(pVar);
            }
            this.f94420d[0] = i11;
            return;
        }
        if (pVar == net.time4j.g0.f94493t) {
            if (!this.f94425i && (i17 = this.f94420d[1]) != Integer.MIN_VALUE && i17 != i11) {
                throw new net.time4j.format.expert.a(pVar);
            }
            this.f94420d[1] = i11;
            return;
        }
        if (pVar == net.time4j.g0.f94494u) {
            if (!this.f94425i && (i16 = this.f94420d[2]) != Integer.MIN_VALUE && i16 != i11) {
                throw new net.time4j.format.expert.a(pVar);
            }
            this.f94420d[2] = i11;
            return;
        }
        if (pVar == h0.f94530u) {
            if (!this.f94425i && (i15 = this.f94421e) != Integer.MIN_VALUE && i15 != i11) {
                throw new net.time4j.format.expert.a(pVar);
            }
            this.f94421e = i11;
            return;
        }
        if (pVar == h0.f94532w) {
            if (!this.f94425i && (i14 = this.f94422f) != Integer.MIN_VALUE && i14 != i11) {
                throw new net.time4j.format.expert.a(pVar);
            }
            this.f94422f = i11;
            return;
        }
        if (pVar == h0.f94534y) {
            if (!this.f94425i && (i13 = this.f94423g) != Integer.MIN_VALUE && i13 != i11) {
                throw new net.time4j.format.expert.a(pVar);
            }
            this.f94423g = i11;
            return;
        }
        if (pVar == h0.C) {
            if (!this.f94425i && (i12 = this.f94424h) != Integer.MIN_VALUE && i12 != i11) {
                throw new net.time4j.format.expert.a(pVar);
            }
            this.f94424h = i11;
            return;
        }
        Map map = this.f94419c;
        if (map == null) {
            map = new HashMap();
            this.f94419c = map;
        }
        Integer numValueOf = Integer.valueOf(i11);
        if (!this.f94425i && map.containsKey(pVar) && !numValueOf.equals(map.get(pVar))) {
            throw new net.time4j.format.expert.a(pVar);
        }
        map.put(pVar, numValueOf);
    }

    @Override // net.time4j.format.expert.t
    void F(net.time4j.engine.p<?> pVar, Object obj) {
        if (obj == null) {
            W(pVar);
            return;
        }
        if (pVar.getType() == Integer.class) {
            E(pVar, ((Integer) Integer.class.cast(obj)).intValue());
            return;
        }
        Object[] objArr = this.f94417a;
        if (objArr == null) {
            Map map = this.f94419c;
            if (map == null) {
                map = new HashMap();
                this.f94419c = map;
            }
            if (!this.f94425i && map.containsKey(pVar) && !obj.equals(map.get(pVar))) {
                throw new net.time4j.format.expert.a(pVar);
            }
            map.put(pVar, obj);
            return;
        }
        if (this.f94418b == null) {
            this.f94418b = new Object[this.f94421e];
        }
        int iS = S(pVar.hashCode()) & this.f94422f;
        Object obj2 = objArr[iS];
        if (obj2 != null) {
            if (!obj2.equals(pVar)) {
                while (true) {
                    iS = (iS + 1) & this.f94422f;
                    Object obj3 = objArr[iS];
                    if (obj3 == null) {
                        break;
                    }
                    if (obj3.equals(pVar)) {
                        if (!this.f94425i && !obj.equals(this.f94418b[iS])) {
                            throw new net.time4j.format.expert.a(pVar);
                        }
                        this.f94418b[iS] = obj;
                        return;
                    }
                }
            } else {
                if (!this.f94425i && !obj.equals(this.f94418b[iS])) {
                    throw new net.time4j.format.expert.a(pVar);
                }
                this.f94418b[iS] = obj;
                return;
            }
        }
        objArr[iS] = pVar;
        this.f94418b[iS] = obj;
        int i11 = this.f94424h;
        int i12 = i11 + 1;
        this.f94424h = i12;
        if (i11 >= this.f94423g) {
            V(M(i12));
        }
    }

    @Override // net.time4j.format.expert.t
    void G(Object obj) {
    }

    int P() {
        return this.f94426j;
    }

    void U(v vVar) {
        int i11 = 0;
        if (this.f94417a != null) {
            Object[] objArr = vVar.f94417a;
            while (i11 < objArr.length) {
                Object obj = objArr[i11];
                if (obj != null) {
                    net.time4j.engine.p<?> pVar = (net.time4j.engine.p) net.time4j.engine.p.class.cast(obj);
                    if (pVar.getType() == Integer.class) {
                        E(pVar, vVar.f94420d[i11]);
                    } else {
                        F(pVar, vVar.f94418b[i11]);
                    }
                }
                i11++;
            }
            return;
        }
        int i12 = vVar.f94421e;
        if (i12 != Integer.MIN_VALUE) {
            int i13 = this.f94421e;
            if (i13 != Integer.MIN_VALUE && !this.f94425i && i13 != i12) {
                throw new net.time4j.format.expert.a(h0.f94530u);
            }
            this.f94421e = i12;
        }
        int i14 = vVar.f94422f;
        if (i14 != Integer.MIN_VALUE) {
            int i15 = this.f94422f;
            if (i15 != Integer.MIN_VALUE && !this.f94425i && i15 != i14) {
                throw new net.time4j.format.expert.a(h0.f94532w);
            }
            this.f94422f = i14;
        }
        int i16 = vVar.f94423g;
        if (i16 != Integer.MIN_VALUE) {
            int i17 = this.f94423g;
            if (i17 != Integer.MIN_VALUE && !this.f94425i && i17 != i16) {
                throw new net.time4j.format.expert.a(h0.f94534y);
            }
            this.f94423g = i16;
        }
        int i18 = vVar.f94424h;
        if (i18 != Integer.MIN_VALUE) {
            int i19 = this.f94424h;
            if (i19 != Integer.MIN_VALUE && !this.f94425i && i19 != i18) {
                throw new net.time4j.format.expert.a(h0.C);
            }
            this.f94424h = i18;
        }
        while (i11 < 3) {
            int i21 = vVar.f94420d[i11];
            if (i21 != Integer.MIN_VALUE) {
                int[] iArr = this.f94420d;
                int i22 = iArr[i11];
                if (i22 != Integer.MIN_VALUE && !this.f94425i && i22 != i21) {
                    throw new net.time4j.format.expert.a(N(i11));
                }
                iArr[i11] = i21;
            }
            i11++;
        }
        Map<net.time4j.engine.p<?>, Object> map = vVar.f94419c;
        if (map != null) {
            for (net.time4j.engine.p<?> pVar2 : map.keySet()) {
                F(pVar2, map.get(pVar2));
            }
        }
    }

    void Y() {
        Object[] objArr = this.f94417a;
        if (objArr == null) {
            this.f94421e = Integer.MIN_VALUE;
            this.f94422f = Integer.MIN_VALUE;
            this.f94423g = Integer.MIN_VALUE;
            this.f94424h = Integer.MIN_VALUE;
            for (int i11 = 0; i11 < 3; i11++) {
                this.f94420d[i11] = Integer.MIN_VALUE;
            }
            this.f94419c = null;
        } else {
            this.f94417a = new Object[objArr.length];
        }
        this.f94424h = 0;
    }

    void Z() {
        this.f94425i = true;
    }

    void a0(int i11) {
        this.f94426j = i11;
    }

    @Override // net.time4j.engine.q, net.time4j.engine.o
    public boolean n(net.time4j.engine.p<?> pVar) {
        Object obj;
        if (pVar == null) {
            return false;
        }
        Object[] objArr = this.f94417a;
        if (objArr != null) {
            int iS = S(pVar.hashCode()) & this.f94422f;
            Object obj2 = objArr[iS];
            if (obj2 == null) {
                return false;
            }
            if (pVar.equals(obj2)) {
                return true;
            }
            do {
                iS = (iS + 1) & this.f94422f;
                obj = objArr[iS];
                if (obj == null) {
                    return false;
                }
            } while (!pVar.equals(obj));
            return true;
        }
        if (pVar == net.time4j.g0.f94489p) {
            return this.f94420d[0] != Integer.MIN_VALUE;
        }
        if (pVar == net.time4j.g0.f94493t) {
            return this.f94420d[1] != Integer.MIN_VALUE;
        }
        if (pVar == net.time4j.g0.f94494u) {
            return this.f94420d[2] != Integer.MIN_VALUE;
        }
        if (pVar == h0.f94530u) {
            return this.f94421e != Integer.MIN_VALUE;
        }
        if (pVar == h0.f94532w) {
            return this.f94422f != Integer.MIN_VALUE;
        }
        if (pVar == h0.f94534y) {
            return this.f94423g != Integer.MIN_VALUE;
        }
        if (pVar == h0.C) {
            return this.f94424h != Integer.MIN_VALUE;
        }
        Map<net.time4j.engine.p<?>, Object> map = this.f94419c;
        return map != null && map.containsKey(pVar);
    }

    @Override // net.time4j.engine.q, net.time4j.engine.o
    public int p(net.time4j.engine.p<Integer> pVar) {
        return O(pVar);
    }

    @Override // net.time4j.engine.q, net.time4j.engine.o
    public <V> V s(net.time4j.engine.p<V> pVar) {
        int iS;
        Object obj;
        Object obj2;
        Class<V> type = pVar.getType();
        if (type == Integer.class) {
            int iO = O(pVar);
            if (iO != Integer.MIN_VALUE) {
                return type.cast(Integer.valueOf(iO));
            }
            throw new ChronoException("No value found for: " + pVar.name());
        }
        Object[] objArr = this.f94417a;
        if (objArr == null) {
            Map<net.time4j.engine.p<?>, Object> map = this.f94419c;
            if (map != null && map.containsKey(pVar)) {
                return pVar.getType().cast(map.get(pVar));
            }
            throw new ChronoException("No value found for: " + pVar.name());
        }
        if (this.f94418b == null || (obj = objArr[(iS = S(pVar.hashCode()) & this.f94422f)]) == null) {
            throw new ChronoException("No value found for: " + pVar.name());
        }
        if (pVar.equals(obj)) {
            return type.cast(this.f94418b[iS]);
        }
        do {
            iS = (iS + 1) & this.f94422f;
            obj2 = objArr[iS];
            if (obj2 == null) {
                throw new ChronoException("No value found for: " + pVar.name());
            }
        } while (!pVar.equals(obj2));
        return type.cast(this.f94418b[iS]);
    }

    @Override // net.time4j.engine.q
    public Set<net.time4j.engine.p<?>> v() {
        if (this.f94417a != null) {
            return new c();
        }
        HashSet hashSet = new HashSet();
        if (this.f94420d[0] != Integer.MIN_VALUE) {
            hashSet.add(net.time4j.g0.f94489p);
        }
        if (this.f94420d[1] != Integer.MIN_VALUE) {
            hashSet.add(net.time4j.g0.f94493t);
        }
        if (this.f94420d[2] != Integer.MIN_VALUE) {
            hashSet.add(net.time4j.g0.f94494u);
        }
        if (this.f94421e != Integer.MIN_VALUE) {
            hashSet.add(h0.f94530u);
        }
        if (this.f94422f != Integer.MIN_VALUE) {
            hashSet.add(h0.f94532w);
        }
        if (this.f94423g != Integer.MIN_VALUE) {
            hashSet.add(h0.f94534y);
        }
        if (this.f94424h != Integer.MIN_VALUE) {
            hashSet.add(h0.C);
        }
        Map<net.time4j.engine.p<?>, Object> map = this.f94419c;
        if (map != null) {
            hashSet.addAll(map.keySet());
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
