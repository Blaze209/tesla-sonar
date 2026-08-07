package com.squareup.moshi;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okio.c0;
import okio.p0;

/* JADX INFO: loaded from: classes6.dex */
final class q extends r {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Object[] f49454j = new Object[32];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f49455k;

    class a extends okio.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ okio.h f49456a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p0 p0Var, okio.h hVar) {
            super(p0Var);
            this.f49456a = hVar;
        }

        @Override // okio.q, okio.p0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (q.this.k0() == 9) {
                q qVar = q.this;
                Object[] objArr = qVar.f49454j;
                int i11 = qVar.f49458a;
                if (objArr[i11] == null) {
                    qVar.f49458a = i11 - 1;
                    Object objJ = k.t(this.f49456a).J();
                    q qVar2 = q.this;
                    boolean z11 = qVar2.f49464g;
                    qVar2.f49464g = true;
                    try {
                        qVar2.P0(objJ);
                        q qVar3 = q.this;
                        qVar3.f49464g = z11;
                        int[] iArr = qVar3.f49461d;
                        int i12 = qVar3.f49458a - 1;
                        iArr[i12] = iArr[i12] + 1;
                        return;
                    } catch (Throwable th2) {
                        q.this.f49464g = z11;
                        throw th2;
                    }
                }
            }
            throw new AssertionError();
        }
    }

    q() {
        r0(6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public q P0(Object obj) {
        String str;
        Object objPut;
        int iK0 = k0();
        int i11 = this.f49458a;
        if (i11 == 1) {
            if (iK0 != 6) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            this.f49459b[i11 - 1] = 7;
            this.f49454j[i11 - 1] = obj;
            return this;
        }
        if (iK0 != 3 || (str = this.f49455k) == null) {
            if (iK0 == 1) {
                ((List) this.f49454j[i11 - 1]).add(obj);
                return this;
            }
            if (iK0 == 9) {
                throw new IllegalStateException("Sink from valueSink() was not closed");
            }
            throw new IllegalStateException("Nesting problem.");
        }
        if ((obj == null && !this.f49464g) || (objPut = ((Map) this.f49454j[i11 - 1]).put(str, obj)) == null) {
            this.f49455k = null;
            return this;
        }
        throw new IllegalArgumentException("Map key '" + this.f49455k + "' has multiple values at path " + getPath() + ": " + objPut + " and " + obj);
    }

    @Override // com.squareup.moshi.r
    public r C() {
        if (k0() != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f49455k != null) {
            throw new IllegalStateException("Dangling name: " + this.f49455k);
        }
        int i11 = this.f49458a;
        int i12 = this.f49466i;
        if (i11 == (~i12)) {
            this.f49466i = ~i12;
            return this;
        }
        this.f49465h = false;
        int i13 = i11 - 1;
        this.f49458a = i13;
        this.f49454j[i13] = null;
        this.f49460c[i13] = null;
        int[] iArr = this.f49461d;
        int i14 = i11 - 2;
        iArr[i14] = iArr[i14] + 1;
        return this;
    }

    @Override // com.squareup.moshi.r
    public r D0(Number number) {
        if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
            return y0(number.longValue());
        }
        if ((number instanceof Float) || (number instanceof Double)) {
            return w0(number.doubleValue());
        }
        if (number == null) {
            return c0();
        }
        BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : new BigDecimal(number.toString());
        if (this.f49465h) {
            this.f49465h = false;
            return b0(bigDecimal.toString());
        }
        P0(bigDecimal);
        int[] iArr = this.f49461d;
        int i11 = this.f49458a - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    @Override // com.squareup.moshi.r
    public r G0(String str) {
        if (this.f49465h) {
            this.f49465h = false;
            return b0(str);
        }
        P0(str);
        int[] iArr = this.f49461d;
        int i11 = this.f49458a - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    @Override // com.squareup.moshi.r
    public r J0(boolean z11) {
        if (this.f49465h) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
        }
        P0(Boolean.valueOf(z11));
        int[] iArr = this.f49461d;
        int i11 = this.f49458a - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    @Override // com.squareup.moshi.r
    public okio.i K0() {
        if (this.f49465h) {
            throw new IllegalStateException("BufferedSink cannot be used as a map key in JSON at path " + getPath());
        }
        if (k0() == 9) {
            throw new IllegalStateException("Sink from valueSink() was not closed");
        }
        r0(9);
        okio.h hVar = new okio.h();
        return c0.c(new a(hVar, hVar));
    }

    public Object T0() {
        int i11 = this.f49458a;
        if (i11 > 1 || (i11 == 1 && this.f49459b[i11 - 1] != 7)) {
            throw new IllegalStateException("Incomplete document");
        }
        return this.f49454j[0];
    }

    @Override // com.squareup.moshi.r
    public r b0(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f49458a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        if (k0() != 3 || this.f49455k != null || this.f49465h) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f49455k = str;
        this.f49460c[this.f49458a - 1] = str;
        return this;
    }

    @Override // com.squareup.moshi.r
    public r c() {
        if (this.f49465h) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
        }
        int i11 = this.f49458a;
        int i12 = this.f49466i;
        if (i11 == i12 && this.f49459b[i11 - 1] == 1) {
            this.f49466i = ~i12;
            return this;
        }
        p();
        ArrayList arrayList = new ArrayList();
        P0(arrayList);
        Object[] objArr = this.f49454j;
        int i13 = this.f49458a;
        objArr[i13] = arrayList;
        this.f49461d[i13] = 0;
        r0(1);
        return this;
    }

    @Override // com.squareup.moshi.r
    public r c0() {
        if (this.f49465h) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + getPath());
        }
        P0(null);
        int[] iArr = this.f49461d;
        int i11 = this.f49458a - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i11 = this.f49458a;
        if (i11 > 1 || (i11 == 1 && this.f49459b[i11 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f49458a = 0;
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f49458a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    @Override // com.squareup.moshi.r
    public r o() {
        if (this.f49465h) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
        }
        int i11 = this.f49458a;
        int i12 = this.f49466i;
        if (i11 == i12 && this.f49459b[i11 - 1] == 3) {
            this.f49466i = ~i12;
            return this;
        }
        p();
        s sVar = new s();
        P0(sVar);
        this.f49454j[this.f49458a] = sVar;
        r0(3);
        return this;
    }

    @Override // com.squareup.moshi.r
    public r t() {
        if (k0() != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i11 = this.f49458a;
        int i12 = this.f49466i;
        if (i11 == (~i12)) {
            this.f49466i = ~i12;
            return this;
        }
        int i13 = i11 - 1;
        this.f49458a = i13;
        this.f49454j[i13] = null;
        int[] iArr = this.f49461d;
        int i14 = i11 - 2;
        iArr[i14] = iArr[i14] + 1;
        return this;
    }

    @Override // com.squareup.moshi.r
    public r w0(double d11) {
        if (!this.f49463f && (Double.isNaN(d11) || d11 == Double.NEGATIVE_INFINITY || d11 == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d11);
        }
        if (this.f49465h) {
            this.f49465h = false;
            return b0(Double.toString(d11));
        }
        P0(Double.valueOf(d11));
        int[] iArr = this.f49461d;
        int i11 = this.f49458a - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    @Override // com.squareup.moshi.r
    public r y0(long j11) {
        if (this.f49465h) {
            this.f49465h = false;
            return b0(Long.toString(j11));
        }
        P0(Long.valueOf(j11));
        int[] iArr = this.f49461d;
        int i11 = this.f49458a - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    @Override // com.squareup.moshi.r
    public r z0(Boolean bool) {
        if (this.f49465h) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
        }
        P0(bool);
        int[] iArr = this.f49461d;
        int i11 = this.f49458a - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }
}
