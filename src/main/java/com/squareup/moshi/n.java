package com.squareup.moshi;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.Address;
import java.io.IOException;
import okio.c0;
import okio.p0;
import okio.s0;

/* JADX INFO: loaded from: classes6.dex */
final class n extends r {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String[] f49431m = new String[128];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final okio.i f49432j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f49433k = ":";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f49434l;

    class a implements p0 {
        a() {
        }

        @Override // okio.p0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (n.this.k0() != 9) {
                throw new AssertionError();
            }
            n nVar = n.this;
            int i11 = nVar.f49458a;
            nVar.f49458a = i11 - 1;
            int[] iArr = nVar.f49461d;
            int i12 = i11 - 2;
            iArr[i12] = iArr[i12] + 1;
        }

        @Override // okio.p0, java.io.Flushable
        public void flush() {
            n.this.f49432j.flush();
        }

        @Override // okio.p0
        /* JADX INFO: renamed from: timeout */
        public s0 getF97913a() {
            return s0.NONE;
        }

        @Override // okio.p0
        public void write(okio.h hVar, long j11) {
            n.this.f49432j.write(hVar, j11);
        }
    }

    static {
        for (int i11 = 0; i11 <= 31; i11++) {
            f49431m[i11] = String.format("\\u%04x", Integer.valueOf(i11));
        }
        String[] strArr = f49431m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    n(okio.i iVar) {
        if (iVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.f49432j = iVar;
        r0(6);
    }

    private void P0() {
        int iK0 = k0();
        if (iK0 == 5) {
            this.f49432j.writeByte(44);
        } else if (iK0 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        Y0();
        s0(4);
    }

    private void T0() {
        int iK0 = k0();
        int i11 = 2;
        if (iK0 == 1) {
            Y0();
        } else if (iK0 == 2) {
            this.f49432j.writeByte(44);
            Y0();
        } else if (iK0 == 4) {
            this.f49432j.l2(this.f49433k);
            i11 = 5;
        } else {
            if (iK0 == 9) {
                throw new IllegalStateException("Sink from valueSink() was not closed");
            }
            i11 = 7;
            if (iK0 != 6) {
                if (iK0 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f49463f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
        }
        s0(i11);
    }

    private r U0(int i11, int i12, char c11) {
        int iK0 = k0();
        if (iK0 != i12 && iK0 != i11) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f49434l != null) {
            throw new IllegalStateException("Dangling name: " + this.f49434l);
        }
        int i13 = this.f49458a;
        int i14 = this.f49466i;
        if (i13 == (~i14)) {
            this.f49466i = ~i14;
            return this;
        }
        int i15 = i13 - 1;
        this.f49458a = i15;
        this.f49460c[i15] = null;
        int[] iArr = this.f49461d;
        int i16 = i13 - 2;
        iArr[i16] = iArr[i16] + 1;
        if (iK0 == i12) {
            Y0();
        }
        this.f49432j.writeByte(c11);
        return this;
    }

    private void Y0() {
        if (this.f49462e == null) {
            return;
        }
        this.f49432j.writeByte(10);
        int i11 = this.f49458a;
        for (int i12 = 1; i12 < i11; i12++) {
            this.f49432j.l2(this.f49462e);
        }
    }

    private r c1(int i11, int i12, char c11) {
        int i13 = this.f49458a;
        int i14 = this.f49466i;
        if (i13 == i14) {
            int[] iArr = this.f49459b;
            if (iArr[i13 - 1] == i11 || iArr[i13 - 1] == i12) {
                this.f49466i = ~i14;
                return this;
            }
        }
        T0();
        p();
        r0(i11);
        this.f49461d[this.f49458a - 1] = 0;
        this.f49432j.writeByte(c11);
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    static void d1(okio.i iVar, String str) {
        String str2;
        String[] strArr = f49431m;
        iVar.writeByte(34);
        int length = str.length();
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i11 < i12) {
                        iVar.p0(str, i11, i12);
                    }
                    iVar.l2(str2);
                    i11 = i12 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i11 < i12) {
                    iVar.p0(str, i11, i12);
                }
                iVar.l2(str2);
                i11 = i12 + 1;
            }
        }
        if (i11 < length) {
            iVar.p0(str, i11, length);
        }
        iVar.writeByte(34);
    }

    private void e1() {
        if (this.f49434l != null) {
            P0();
            d1(this.f49432j, this.f49434l);
            this.f49434l = null;
        }
    }

    @Override // com.squareup.moshi.r
    public r C() {
        this.f49465h = false;
        return U0(3, 5, CoreConstants.CURLY_RIGHT);
    }

    @Override // com.squareup.moshi.r
    public r D0(Number number) {
        if (number == null) {
            return c0();
        }
        String string = number.toString();
        if (!this.f49463f && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        if (this.f49465h) {
            this.f49465h = false;
            return b0(string);
        }
        e1();
        T0();
        this.f49432j.l2(string);
        int[] iArr = this.f49461d;
        int i11 = this.f49458a - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    @Override // com.squareup.moshi.r
    public r G0(String str) {
        if (str == null) {
            return c0();
        }
        if (this.f49465h) {
            this.f49465h = false;
            return b0(str);
        }
        e1();
        T0();
        d1(this.f49432j, str);
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
        e1();
        T0();
        this.f49432j.l2(z11 ? "true" : "false");
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
        e1();
        T0();
        r0(9);
        return c0.c(new a());
    }

    @Override // com.squareup.moshi.r
    public r b0(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f49458a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int iK0 = k0();
        if ((iK0 != 3 && iK0 != 5) || this.f49434l != null || this.f49465h) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f49434l = str;
        this.f49460c[this.f49458a - 1] = str;
        return this;
    }

    @Override // com.squareup.moshi.r
    public r c() {
        if (!this.f49465h) {
            e1();
            return c1(1, 2, '[');
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // com.squareup.moshi.r
    public r c0() {
        if (this.f49465h) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + getPath());
        }
        if (this.f49434l != null) {
            if (!this.f49464g) {
                this.f49434l = null;
                return this;
            }
            e1();
        }
        T0();
        this.f49432j.l2(Address.ADDRESS_NULL_PLACEHOLDER);
        int[] iArr = this.f49461d;
        int i11 = this.f49458a - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f49432j.close();
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
        this.f49432j.flush();
    }

    @Override // com.squareup.moshi.r
    public r o() {
        if (!this.f49465h) {
            e1();
            return c1(3, 5, CoreConstants.CURLY_LEFT);
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // com.squareup.moshi.r
    public r t() {
        return U0(1, 2, ']');
    }

    @Override // com.squareup.moshi.r
    public void t0(String str) {
        super.t0(str);
        this.f49433k = !str.isEmpty() ? ": " : ":";
    }

    @Override // com.squareup.moshi.r
    public r w0(double d11) {
        if (!this.f49463f && (Double.isNaN(d11) || Double.isInfinite(d11))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d11);
        }
        if (this.f49465h) {
            this.f49465h = false;
            return b0(Double.toString(d11));
        }
        e1();
        T0();
        this.f49432j.l2(Double.toString(d11));
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
        e1();
        T0();
        this.f49432j.l2(Long.toString(j11));
        int[] iArr = this.f49461d;
        int i11 = this.f49458a - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    @Override // com.squareup.moshi.r
    public r z0(Boolean bool) {
        return bool == null ? c0() : J0(bool.booleanValue());
    }
}
