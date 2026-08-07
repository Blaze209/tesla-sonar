package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: loaded from: classes5.dex */
final class v0<K, V> extends z<K, V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final z<Object, Object> f43694h = new v0(null, new Object[0], 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient Object f43695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final transient Object[] f43696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int f43697g;

    static final class a<K, V> extends b0<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient z<K, V> f43698c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient Object[] f43699d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final transient int f43700e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final transient int f43701f;

        /* JADX INFO: renamed from: com.google.common.collect.v0$a$a, reason: collision with other inner class name */
        class C0685a extends x<Map.Entry<K, V>> {
            C0685a() {
            }

            @Override // java.util.List
            /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> get(int i11) {
                ou.p.k(i11, a.this.f43701f);
                int i12 = i11 * 2;
                Object obj = a.this.f43699d[a.this.f43700e + i12];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f43699d[i12 + (a.this.f43700e ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // com.google.common.collect.w
            public boolean g() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f43701f;
            }
        }

        a(z<K, V> zVar, Object[] objArr, int i11, int i12) {
            this.f43698c = zVar;
            this.f43699d = objArr;
            this.f43700e = i11;
            this.f43701f = i12;
        }

        @Override // com.google.common.collect.w
        int b(Object[] objArr, int i11) {
            return a().b(objArr, i11);
        }

        @Override // com.google.common.collect.w, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.f43698c.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.w
        boolean g() {
            return true;
        }

        @Override // com.google.common.collect.w, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* JADX INFO: renamed from: h */
        public d1<Map.Entry<K, V>> iterator() {
            return a().iterator();
        }

        @Override // com.google.common.collect.b0
        x<Map.Entry<K, V>> o() {
            return new C0685a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f43701f;
        }
    }

    static final class b<K> extends b0<K> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient z<K, ?> f43703c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient x<K> f43704d;

        b(z<K, ?> zVar, x<K> xVar) {
            this.f43703c = zVar;
            this.f43704d = xVar;
        }

        @Override // com.google.common.collect.b0, com.google.common.collect.w
        public x<K> a() {
            return this.f43704d;
        }

        @Override // com.google.common.collect.w
        int b(Object[] objArr, int i11) {
            return a().b(objArr, i11);
        }

        @Override // com.google.common.collect.w, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f43703c.get(obj) != null;
        }

        @Override // com.google.common.collect.w
        boolean g() {
            return true;
        }

        @Override // com.google.common.collect.w, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* JADX INFO: renamed from: h */
        public d1<K> iterator() {
            return a().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f43703c.size();
        }
    }

    static final class c extends x<Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient Object[] f43705c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient int f43706d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final transient int f43707e;

        c(Object[] objArr, int i11, int i12) {
            this.f43705c = objArr;
            this.f43706d = i11;
            this.f43707e = i12;
        }

        @Override // com.google.common.collect.w
        boolean g() {
            return true;
        }

        @Override // java.util.List
        public Object get(int i11) {
            ou.p.k(i11, this.f43707e);
            Object obj = this.f43705c[(i11 * 2) + this.f43706d];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f43707e;
        }
    }

    private v0(Object obj, Object[] objArr, int i11) {
        this.f43695e = obj;
        this.f43696f = objArr;
        this.f43697g = i11;
    }

    static <K, V> v0<K, V> r(int i11, Object[] objArr) {
        return s(i11, objArr, null);
    }

    static <K, V> v0<K, V> s(int i11, Object[] objArr, z.a<K, V> aVar) {
        if (i11 == 0) {
            return (v0) f43694h;
        }
        if (i11 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            k.a(obj, obj2);
            return new v0<>(null, objArr, 1);
        }
        ou.p.o(i11, objArr.length >> 1);
        Object objT = t(objArr, i11, b0.k(i11), 0);
        if (objT instanceof Object[]) {
            Object[] objArr2 = (Object[]) objT;
            z.a.C0686a c0686a = (z.a.C0686a) objArr2[2];
            if (aVar == null) {
                throw c0686a.a();
            }
            aVar.f43734e = c0686a;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objT = obj3;
            i11 = iIntValue;
        }
        return new v0<>(objT, objArr, i11);
    }

    private static Object t(Object[] objArr, int i11, int i12, int i13) {
        int i14;
        z.a.C0686a c0686a = null;
        int i15 = 1;
        if (i11 == 1) {
            Object obj = objArr[i13];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i13 ^ 1];
            Objects.requireNonNull(obj2);
            k.a(obj, obj2);
            return null;
        }
        int i16 = i12 - 1;
        if (i12 <= 128) {
            byte[] bArr = new byte[i12];
            Arrays.fill(bArr, (byte) -1);
            int i17 = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                int i19 = (i18 * 2) + i13;
                int i21 = (i17 * 2) + i13;
                Object obj3 = objArr[i19];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i19 ^ 1];
                Objects.requireNonNull(obj4);
                k.a(obj3, obj4);
                int iB = u.b(obj3.hashCode());
                while (true) {
                    int i22 = iB & i16;
                    int i23 = bArr[i22] & 255;
                    if (i23 == 255) {
                        bArr[i22] = (byte) i21;
                        if (i17 < i18) {
                            objArr[i21] = obj3;
                            objArr[i21 ^ 1] = obj4;
                        }
                        i17++;
                        break;
                    }
                    if (obj3.equals(objArr[i23])) {
                        int i24 = i23 ^ 1;
                        Object obj5 = objArr[i24];
                        Objects.requireNonNull(obj5);
                        c0686a = new z.a.C0686a(obj3, obj4, obj5);
                        objArr[i24] = obj4;
                        break;
                    }
                    iB = i22 + 1;
                }
            }
            return i17 == i11 ? bArr : new Object[]{bArr, Integer.valueOf(i17), c0686a};
        }
        if (i12 <= 32768) {
            short[] sArr = new short[i12];
            Arrays.fill(sArr, (short) -1);
            int i25 = 0;
            for (int i26 = 0; i26 < i11; i26++) {
                int i27 = (i26 * 2) + i13;
                int i28 = (i25 * 2) + i13;
                Object obj6 = objArr[i27];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i27 ^ 1];
                Objects.requireNonNull(obj7);
                k.a(obj6, obj7);
                int iB2 = u.b(obj6.hashCode());
                while (true) {
                    int i29 = iB2 & i16;
                    int i31 = sArr[i29] & HPKE.aead_EXPORT_ONLY;
                    if (i31 == 65535) {
                        sArr[i29] = (short) i28;
                        if (i25 < i26) {
                            objArr[i28] = obj6;
                            objArr[i28 ^ 1] = obj7;
                        }
                        i25++;
                        break;
                    }
                    if (obj6.equals(objArr[i31])) {
                        int i32 = i31 ^ 1;
                        Object obj8 = objArr[i32];
                        Objects.requireNonNull(obj8);
                        c0686a = new z.a.C0686a(obj6, obj7, obj8);
                        objArr[i32] = obj7;
                        break;
                    }
                    iB2 = i29 + 1;
                }
            }
            return i25 == i11 ? sArr : new Object[]{sArr, Integer.valueOf(i25), c0686a};
        }
        int[] iArr = new int[i12];
        Arrays.fill(iArr, -1);
        int i33 = 0;
        int i34 = 0;
        while (i33 < i11) {
            int i35 = (i33 * 2) + i13;
            int i36 = (i34 * 2) + i13;
            Object obj9 = objArr[i35];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i35 ^ i15];
            Objects.requireNonNull(obj10);
            k.a(obj9, obj10);
            int iB3 = u.b(obj9.hashCode());
            while (true) {
                int i37 = iB3 & i16;
                int i38 = iArr[i37];
                if (i38 == -1) {
                    iArr[i37] = i36;
                    if (i34 < i33) {
                        objArr[i36] = obj9;
                        objArr[i36 ^ 1] = obj10;
                    }
                    i34++;
                    i14 = i15;
                    break;
                }
                i14 = i15;
                if (obj9.equals(objArr[i38])) {
                    int i39 = i38 ^ 1;
                    Object obj11 = objArr[i39];
                    Objects.requireNonNull(obj11);
                    c0686a = new z.a.C0686a(obj9, obj10, obj11);
                    objArr[i39] = obj10;
                    break;
                }
                iB3 = i37 + 1;
                i15 = i14;
            }
            i33++;
            i15 = i14;
        }
        int i41 = i15;
        if (i34 == i11) {
            return iArr;
        }
        Object[] objArr2 = new Object[3];
        objArr2[0] = iArr;
        objArr2[i41] = Integer.valueOf(i34);
        objArr2[2] = c0686a;
        return objArr2;
    }

    static Object u(Object[] objArr, int i11, int i12, int i13) {
        Object objT = t(objArr, i11, i12, i13);
        if (objT instanceof Object[]) {
            throw ((z.a.C0686a) ((Object[]) objT)[2]).a();
        }
        return objT;
    }

    static Object v(Object obj, Object[] objArr, int i11, int i12, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i11 == 1) {
            Object obj3 = objArr[i12];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i12 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iB = u.b(obj2.hashCode());
            while (true) {
                int i13 = iB & length;
                int i14 = bArr[i13] & 255;
                if (i14 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i14])) {
                    return objArr[i14 ^ 1];
                }
                iB = i13 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iB2 = u.b(obj2.hashCode());
            while (true) {
                int i15 = iB2 & length2;
                int i16 = sArr[i15] & HPKE.aead_EXPORT_ONLY;
                if (i16 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i16])) {
                    return objArr[i16 ^ 1];
                }
                iB2 = i15 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iB3 = u.b(obj2.hashCode());
            while (true) {
                int i17 = iB3 & length3;
                int i18 = iArr[i17];
                if (i18 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i18])) {
                    return objArr[i18 ^ 1];
                }
                iB3 = i17 + 1;
            }
        }
    }

    @Override // com.google.common.collect.z
    b0<Map.Entry<K, V>> e() {
        return new a(this, this.f43696f, 0, this.f43697g);
    }

    @Override // com.google.common.collect.z, java.util.Map
    public V get(Object obj) {
        V v11 = (V) v(this.f43695e, this.f43696f, this.f43697g, 0, obj);
        if (v11 == null) {
            return null;
        }
        return v11;
    }

    @Override // com.google.common.collect.z
    b0<K> h() {
        return new b(this, new c(this.f43696f, 0, this.f43697g));
    }

    @Override // com.google.common.collect.z
    w<V> i() {
        return new c(this.f43696f, 1, this.f43697g);
    }

    @Override // com.google.common.collect.z
    boolean k() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f43697g;
    }
}
