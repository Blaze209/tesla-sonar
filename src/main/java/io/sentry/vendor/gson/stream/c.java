package io.sentry.vendor.gson.stream;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.Address;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String[] f81549j = new String[128];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String[] f81550k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Writer f81551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f81552b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f81553c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f81554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f81555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f81556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f81557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f81558h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f81559i;

    static {
        for (int i11 = 0; i11 <= 31; i11++) {
            f81549j[i11] = String.format("\\u%04x", Integer.valueOf(i11));
        }
        String[] strArr = f81549j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f81550k = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        k0(6);
        this.f81555e = ":";
        this.f81559i = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f81551a = writer;
    }

    private void G0() throws IOException {
        if (this.f81558h != null) {
            c();
            s0(this.f81558h);
            this.f81558h = null;
        }
    }

    private void T() throws IOException {
        if (this.f81554d == null) {
            return;
        }
        this.f81551a.write(10);
        int i11 = this.f81553c;
        for (int i12 = 1; i12 < i11; i12++) {
            this.f81551a.write(this.f81554d);
        }
    }

    private void c() throws IOException {
        int iE0 = e0();
        if (iE0 == 5) {
            this.f81551a.write(44);
        } else if (iE0 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        T();
        n0(4);
    }

    private c c0(int i11, char c11) throws IOException {
        n();
        k0(i11);
        this.f81551a.write(c11);
        return this;
    }

    private int e0() {
        int i11 = this.f81553c;
        if (i11 != 0) {
            return this.f81552b[i11 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void k0(int i11) {
        int i12 = this.f81553c;
        int[] iArr = this.f81552b;
        if (i12 == iArr.length) {
            this.f81552b = Arrays.copyOf(iArr, i12 * 2);
        }
        int[] iArr2 = this.f81552b;
        int i13 = this.f81553c;
        this.f81553c = i13 + 1;
        iArr2[i13] = i11;
    }

    private void n() throws IOException {
        int iE0 = e0();
        if (iE0 == 1) {
            n0(2);
            T();
            return;
        }
        if (iE0 == 2) {
            this.f81551a.append(CoreConstants.COMMA_CHAR);
            T();
        } else {
            if (iE0 == 4) {
                this.f81551a.append((CharSequence) this.f81555e);
                n0(5);
                return;
            }
            if (iE0 != 6) {
                if (iE0 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f81556f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            n0(7);
        }
    }

    private void n0(int i11) {
        this.f81552b[this.f81553c - 1] = i11;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    private void s0(String str) throws IOException {
        String str2;
        String[] strArr = this.f81557g ? f81550k : f81549j;
        this.f81551a.write(34);
        int length = str.length();
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i11 < i12) {
                        this.f81551a.write(str, i11, i12 - i11);
                    }
                    this.f81551a.write(str2);
                    i11 = i12 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i11 < i12) {
                    this.f81551a.write(str, i11, i12 - i11);
                }
                this.f81551a.write(str2);
                i11 = i12 + 1;
            }
        }
        if (i11 < length) {
            this.f81551a.write(str, i11, length - i11);
        }
        this.f81551a.write(34);
    }

    private c t(int i11, int i12, char c11) throws IOException {
        int iE0 = e0();
        if (iE0 != i12 && iE0 != i11) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f81558h != null) {
            throw new IllegalStateException("Dangling name: " + this.f81558h);
        }
        this.f81553c--;
        if (iE0 == i12) {
            T();
        }
        this.f81551a.write(c11);
        return this;
    }

    public c B() {
        return t(1, 2, ']');
    }

    public c C() {
        return t(3, 5, CoreConstants.CURLY_RIGHT);
    }

    public c D0(boolean z11) throws IOException {
        G0();
        n();
        this.f81551a.write(z11 ? "true" : "false");
        return this;
    }

    public String H() {
        return this.f81554d;
    }

    public c I(String str) throws IOException {
        if (str == null) {
            return b0();
        }
        G0();
        n();
        this.f81551a.append((CharSequence) str);
        return this;
    }

    public c J(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f81558h != null) {
            throw new IllegalStateException();
        }
        if (this.f81553c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f81558h = str;
        return this;
    }

    public final void P(boolean z11) {
        this.f81556f = z11;
    }

    public c b0() throws IOException {
        if (this.f81558h != null) {
            if (!this.f81559i) {
                this.f81558h = null;
                return this;
            }
            G0();
        }
        n();
        this.f81551a.write(Address.ADDRESS_NULL_PLACEHOLDER);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f81551a.close();
        int i11 = this.f81553c;
        if (i11 > 1 || (i11 == 1 && this.f81552b[i11 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f81553c = 0;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f81553c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f81551a.flush();
    }

    public c o() throws IOException {
        G0();
        return c0(1, '[');
    }

    public c p() throws IOException {
        G0();
        return c0(3, CoreConstants.CURLY_LEFT);
    }

    public final void r0(String str) {
        if (str == null || str.length() == 0) {
            this.f81554d = null;
            this.f81555e = ":";
        } else {
            this.f81554d = str;
            this.f81555e = ": ";
        }
    }

    public c t0(double d11) throws IOException {
        G0();
        if (this.f81556f || !(Double.isNaN(d11) || Double.isInfinite(d11))) {
            n();
            this.f81551a.append((CharSequence) Double.toString(d11));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d11);
    }

    public c u0(long j11) throws IOException {
        G0();
        n();
        this.f81551a.write(Long.toString(j11));
        return this;
    }

    public c w0(Boolean bool) throws IOException {
        if (bool == null) {
            return b0();
        }
        G0();
        n();
        this.f81551a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c y0(Number number) throws IOException {
        if (number == null) {
            return b0();
        }
        G0();
        String string = number.toString();
        if (this.f81556f || !(string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            n();
            this.f81551a.append((CharSequence) string);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public c z0(String str) throws IOException {
        if (str == null) {
            return b0();
        }
        G0();
        n();
        s0(str);
        return this;
    }
}
