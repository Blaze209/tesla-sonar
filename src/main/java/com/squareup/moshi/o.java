package com.squareup.moshi;

import com.adyen.checkout.components.core.Address;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class o extends k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f49436h = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object[] f49437g;

    static final class a implements Iterator<Object>, Cloneable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final k.c f49438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object[] f49439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f49440c;

        a(k.c cVar, Object[] objArr, int i11) {
            this.f49438a = cVar;
            this.f49439b = objArr;
            this.f49440c = i11;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a clone() {
            return new a(this.f49438a, this.f49439b, this.f49440c);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f49440c < this.f49439b.length;
        }

        @Override // java.util.Iterator
        public Object next() {
            Object[] objArr = this.f49439b;
            int i11 = this.f49440c;
            this.f49440c = i11 + 1;
            return objArr[i11];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    o(Object obj) {
        int[] iArr = this.f49411b;
        int i11 = this.f49410a;
        iArr[i11] = 7;
        Object[] objArr = new Object[32];
        this.f49437g = objArr;
        this.f49410a = i11 + 1;
        objArr[i11] = obj;
    }

    private void r0(Object obj) {
        int i11 = this.f49410a;
        if (i11 == this.f49437g.length) {
            if (i11 == 256) {
                throw new JsonDataException("Nesting too deep at " + getPath());
            }
            int[] iArr = this.f49411b;
            this.f49411b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f49412c;
            this.f49412c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f49413d;
            this.f49413d = Arrays.copyOf(iArr2, iArr2.length * 2);
            Object[] objArr = this.f49437g;
            this.f49437g = Arrays.copyOf(objArr, objArr.length * 2);
        }
        Object[] objArr2 = this.f49437g;
        int i12 = this.f49410a;
        this.f49410a = i12 + 1;
        objArr2[i12] = obj;
    }

    private void s0() {
        int i11 = this.f49410a;
        int i12 = i11 - 1;
        this.f49410a = i12;
        Object[] objArr = this.f49437g;
        objArr[i12] = null;
        this.f49411b[i12] = 0;
        if (i12 > 0) {
            int[] iArr = this.f49413d;
            int i13 = i11 - 2;
            iArr[i13] = iArr[i13] + 1;
            Object obj = objArr[i11 - 2];
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                if (it.hasNext()) {
                    r0(it.next());
                }
            }
        }
    }

    private <T> T t0(Class<T> cls, k.c cVar) {
        int i11 = this.f49410a;
        Object obj = i11 != 0 ? this.f49437g[i11 - 1] : null;
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        if (obj == null && cVar == k.c.NULL) {
            return null;
        }
        if (obj == f49436h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw n0(obj, cVar);
    }

    private String u0(Map.Entry<?, ?> entry) {
        Object key = entry.getKey();
        if (key instanceof String) {
            return (String) key;
        }
        throw n0(key, k.c.NAME);
    }

    @Override // com.squareup.moshi.k
    public k.c B() {
        int i11 = this.f49410a;
        if (i11 == 0) {
            return k.c.END_DOCUMENT;
        }
        Object obj = this.f49437g[i11 - 1];
        if (obj instanceof a) {
            return ((a) obj).f49438a;
        }
        if (obj instanceof List) {
            return k.c.BEGIN_ARRAY;
        }
        if (obj instanceof Map) {
            return k.c.BEGIN_OBJECT;
        }
        if (obj instanceof Map.Entry) {
            return k.c.NAME;
        }
        if (obj instanceof String) {
            return k.c.STRING;
        }
        if (obj instanceof Boolean) {
            return k.c.BOOLEAN;
        }
        if (obj instanceof Number) {
            return k.c.NUMBER;
        }
        if (obj == null) {
            return k.c.NULL;
        }
        if (obj == f49436h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw n0(obj, "a JSON value");
    }

    @Override // com.squareup.moshi.k
    public k C() {
        return new o(this);
    }

    @Override // com.squareup.moshi.k
    public void F() {
        if (this.f49415f) {
            throw new JsonDataException("Cannot skip unexpected " + B() + " at " + getPath());
        }
        int i11 = this.f49410a;
        if (i11 > 1) {
            this.f49412c[i11 - 2] = Address.ADDRESS_NULL_PLACEHOLDER;
        }
        Object obj = i11 != 0 ? this.f49437g[i11 - 1] : null;
        if (obj instanceof a) {
            throw new JsonDataException("Expected a value but was " + B() + " at path " + getPath());
        }
        if (obj instanceof Map.Entry) {
            Object[] objArr = this.f49437g;
            objArr[i11 - 1] = ((Map.Entry) objArr[i11 - 1]).getValue();
        } else {
            if (i11 > 0) {
                s0();
                return;
            }
            throw new JsonDataException("Expected a value but was " + B() + " at path " + getPath());
        }
    }

    @Override // com.squareup.moshi.k
    public void H() {
        if (hasNext()) {
            r0(L());
        }
    }

    @Override // com.squareup.moshi.k
    public String L() {
        Map.Entry<?, ?> entry = (Map.Entry) t0(Map.Entry.class, k.c.NAME);
        String strU0 = u0(entry);
        this.f49437g[this.f49410a - 1] = entry.getValue();
        this.f49412c[this.f49410a - 2] = strU0;
        return strU0;
    }

    @Override // com.squareup.moshi.k
    public String O() {
        int i11 = this.f49410a;
        Object obj = i11 != 0 ? this.f49437g[i11 - 1] : null;
        if (obj instanceof String) {
            s0();
            return (String) obj;
        }
        if (obj instanceof Number) {
            s0();
            return obj.toString();
        }
        if (obj == f49436h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw n0(obj, k.c.STRING);
    }

    @Override // com.squareup.moshi.k
    public int T(k.b bVar) {
        Map.Entry<?, ?> entry = (Map.Entry) t0(Map.Entry.class, k.c.NAME);
        String strU0 = u0(entry);
        int length = bVar.f49417a.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (bVar.f49417a[i11].equals(strU0)) {
                this.f49437g[this.f49410a - 1] = entry.getValue();
                this.f49412c[this.f49410a - 2] = strU0;
                return i11;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.k
    public int b0(k.b bVar) {
        int i11 = this.f49410a;
        Object obj = i11 != 0 ? this.f49437g[i11 - 1] : null;
        if (!(obj instanceof String)) {
            if (obj != f49436h) {
                return -1;
            }
            throw new IllegalStateException("JsonReader is closed");
        }
        String str = (String) obj;
        int length = bVar.f49417a.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (bVar.f49417a[i12].equals(str)) {
                s0();
                return i12;
            }
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Arrays.fill(this.f49437g, 0, this.f49410a, (Object) null);
        this.f49437g[0] = f49436h;
        this.f49411b[0] = 8;
        this.f49410a = 1;
    }

    @Override // com.squareup.moshi.k
    public void e() {
        k.c cVar = k.c.END_ARRAY;
        a aVar = (a) t0(a.class, cVar);
        if (aVar.f49438a != cVar || aVar.hasNext()) {
            throw n0(aVar, cVar);
        }
        s0();
    }

    @Override // com.squareup.moshi.k
    public void e0() {
        if (!this.f49415f) {
            this.f49437g[this.f49410a - 1] = ((Map.Entry) t0(Map.Entry.class, k.c.NAME)).getValue();
            this.f49412c[this.f49410a - 2] = Address.ADDRESS_NULL_PLACEHOLDER;
            return;
        }
        k.c cVarB = B();
        L();
        throw new JsonDataException("Cannot skip unexpected " + cVarB + " at " + getPath());
    }

    @Override // com.squareup.moshi.k
    public void f() {
        List list = (List) t0(List.class, k.c.BEGIN_ARRAY);
        a aVar = new a(k.c.END_ARRAY, list.toArray(new Object[list.size()]), 0);
        Object[] objArr = this.f49437g;
        int i11 = this.f49410a;
        objArr[i11 - 1] = aVar;
        this.f49411b[i11 - 1] = 1;
        this.f49413d[i11 - 1] = 0;
        if (aVar.hasNext()) {
            r0(aVar.next());
        }
    }

    @Override // com.squareup.moshi.k
    public void h() {
        Map map = (Map) t0(Map.class, k.c.BEGIN_OBJECT);
        a aVar = new a(k.c.END_OBJECT, map.entrySet().toArray(new Object[map.size()]), 0);
        Object[] objArr = this.f49437g;
        int i11 = this.f49410a;
        objArr[i11 - 1] = aVar;
        this.f49411b[i11 - 1] = 3;
        if (aVar.hasNext()) {
            r0(aVar.next());
        }
    }

    @Override // com.squareup.moshi.k
    public boolean hasNext() {
        int i11 = this.f49410a;
        if (i11 == 0) {
            return false;
        }
        Object obj = this.f49437g[i11 - 1];
        return !(obj instanceof Iterator) || ((Iterator) obj).hasNext();
    }

    @Override // com.squareup.moshi.k
    public void j() {
        k.c cVar = k.c.END_OBJECT;
        a aVar = (a) t0(a.class, cVar);
        if (aVar.f49438a != cVar || aVar.hasNext()) {
            throw n0(aVar, cVar);
        }
        this.f49412c[this.f49410a - 1] = null;
        s0();
    }

    @Override // com.squareup.moshi.k
    public boolean nextBoolean() {
        Boolean bool = (Boolean) t0(Boolean.class, k.c.BOOLEAN);
        s0();
        return bool.booleanValue();
    }

    @Override // com.squareup.moshi.k
    public double nextDouble() throws JsonEncodingException {
        double dDoubleValue;
        k.c cVar = k.c.NUMBER;
        Object objT0 = t0(Object.class, cVar);
        if (objT0 instanceof Number) {
            dDoubleValue = ((Number) objT0).doubleValue();
        } else {
            if (!(objT0 instanceof String)) {
                throw n0(objT0, cVar);
            }
            try {
                dDoubleValue = Double.parseDouble((String) objT0);
            } catch (NumberFormatException unused) {
                throw n0(objT0, k.c.NUMBER);
            }
        }
        if (this.f49414e || !(Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            s0();
            return dDoubleValue;
        }
        throw new JsonEncodingException("JSON forbids NaN and infinities: " + dDoubleValue + " at path " + getPath());
    }

    @Override // com.squareup.moshi.k
    public int nextInt() {
        int iIntValueExact;
        k.c cVar = k.c.NUMBER;
        Object objT0 = t0(Object.class, cVar);
        if (objT0 instanceof Number) {
            iIntValueExact = ((Number) objT0).intValue();
        } else {
            if (!(objT0 instanceof String)) {
                throw n0(objT0, cVar);
            }
            try {
                try {
                    iIntValueExact = Integer.parseInt((String) objT0);
                } catch (NumberFormatException unused) {
                    throw n0(objT0, k.c.NUMBER);
                }
            } catch (NumberFormatException unused2) {
                iIntValueExact = new BigDecimal((String) objT0).intValueExact();
            }
        }
        s0();
        return iIntValueExact;
    }

    @Override // com.squareup.moshi.k
    public long nextLong() {
        long jLongValueExact;
        k.c cVar = k.c.NUMBER;
        Object objT0 = t0(Object.class, cVar);
        if (objT0 instanceof Number) {
            jLongValueExact = ((Number) objT0).longValue();
        } else {
            if (!(objT0 instanceof String)) {
                throw n0(objT0, cVar);
            }
            try {
                try {
                    jLongValueExact = Long.parseLong((String) objT0);
                } catch (NumberFormatException unused) {
                    throw n0(objT0, k.c.NUMBER);
                }
            } catch (NumberFormatException unused2) {
                jLongValueExact = new BigDecimal((String) objT0).longValueExact();
            }
        }
        s0();
        return jLongValueExact;
    }

    @Override // com.squareup.moshi.k
    public <T> T o() {
        t0(Void.class, k.c.NULL);
        s0();
        return null;
    }

    @Override // com.squareup.moshi.k
    public okio.j p() throws IOException {
        Object objJ = J();
        okio.h hVar = new okio.h();
        r rVarE0 = r.e0(hVar);
        try {
            rVarE0.T(objJ);
            rVarE0.close();
            return hVar;
        } catch (Throwable th2) {
            if (rVarE0 != null) {
                try {
                    rVarE0.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    o(o oVar) {
        super(oVar);
        this.f49437g = (Object[]) oVar.f49437g.clone();
        for (int i11 = 0; i11 < this.f49410a; i11++) {
            Object[] objArr = this.f49437g;
            Object obj = objArr[i11];
            if (obj instanceof a) {
                objArr[i11] = ((a) obj).clone();
            }
        }
    }
}
