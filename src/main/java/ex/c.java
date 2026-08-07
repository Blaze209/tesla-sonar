package ex;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.Address;
import com.google.gson.e;
import com.google.gson.u;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f63254l = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String[] f63255m = new String[128];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String[] f63256n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Writer f63257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f63258b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f63259c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e f63260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f63261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f63262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f63263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private u f63264h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f63265i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f63266j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f63267k;

    static {
        for (int i11 = 0; i11 <= 31; i11++) {
            f63255m[i11] = String.format("\\u%04x", Integer.valueOf(i11));
        }
        String[] strArr = f63255m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f63256n = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        s0(6);
        this.f63264h = u.LEGACY_STRICT;
        this.f63267k = true;
        Objects.requireNonNull(writer, "out == null");
        this.f63257a = writer;
        u0(e.f44817d);
    }

    private c B(int i11, int i12, char c11) throws IOException {
        int iR0 = r0();
        if (iR0 != i12 && iR0 != i11) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f63266j != null) {
            throw new IllegalStateException("Dangling name: " + this.f63266j);
        }
        this.f63259c--;
        if (iR0 == i12) {
            e0();
        }
        this.f63257a.write(c11);
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    private void D0(String str) throws IOException {
        String str2;
        String[] strArr = this.f63265i ? f63256n : f63255m;
        this.f63257a.write(34);
        int length = str.length();
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i11 < i12) {
                        this.f63257a.write(str, i11, i12 - i11);
                    }
                    this.f63257a.write(str2);
                    i11 = i12 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i11 < i12) {
                    this.f63257a.write(str, i11, i12 - i11);
                }
                this.f63257a.write(str2);
                i11 = i12 + 1;
            }
        }
        if (i11 < length) {
            this.f63257a.write(str, i11, length - i11);
        }
        this.f63257a.write(34);
    }

    private void T0() throws IOException {
        if (this.f63266j != null) {
            n();
            D0(this.f63266j);
            this.f63266j = null;
        }
    }

    private static boolean c(Class<? extends Number> cls) {
        return cls == Integer.class || cls == Long.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    private void e0() throws IOException {
        if (this.f63263g) {
            return;
        }
        this.f63257a.write(this.f63260d.b());
        int i11 = this.f63259c;
        for (int i12 = 1; i12 < i11; i12++) {
            this.f63257a.write(this.f63260d.a());
        }
    }

    private void n() throws IOException {
        int iR0 = r0();
        if (iR0 == 5) {
            this.f63257a.write(this.f63262f);
        } else if (iR0 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        e0();
        t0(4);
    }

    private c n0(int i11, char c11) throws IOException {
        o();
        s0(i11);
        this.f63257a.write(c11);
        return this;
    }

    private void o() throws IOException {
        int iR0 = r0();
        if (iR0 == 1) {
            t0(2);
            e0();
            return;
        }
        if (iR0 == 2) {
            this.f63257a.append((CharSequence) this.f63262f);
            e0();
        } else {
            if (iR0 == 4) {
                this.f63257a.append((CharSequence) this.f63261e);
                t0(5);
                return;
            }
            if (iR0 != 6) {
                if (iR0 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f63264h != u.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            t0(7);
        }
    }

    private int r0() {
        int i11 = this.f63259c;
        if (i11 != 0) {
            return this.f63258b[i11 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void s0(int i11) {
        int i12 = this.f63259c;
        int[] iArr = this.f63258b;
        if (i12 == iArr.length) {
            this.f63258b = Arrays.copyOf(iArr, i12 * 2);
        }
        int[] iArr2 = this.f63258b;
        int i13 = this.f63259c;
        this.f63259c = i13 + 1;
        iArr2[i13] = i11;
    }

    private void t0(int i11) {
        this.f63258b[this.f63259c - 1] = i11;
    }

    public c C() {
        return B(1, 2, ']');
    }

    public c G0(double d11) throws IOException {
        T0();
        if (this.f63264h == u.LENIENT || !(Double.isNaN(d11) || Double.isInfinite(d11))) {
            o();
            this.f63257a.append((CharSequence) Double.toString(d11));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d11);
    }

    public c H() {
        return B(3, 5, CoreConstants.CURLY_RIGHT);
    }

    public c H0(long j11) throws IOException {
        T0();
        o();
        this.f63257a.write(Long.toString(j11));
        return this;
    }

    public final boolean I() {
        return this.f63267k;
    }

    public final u J() {
        return this.f63264h;
    }

    public c J0(Boolean bool) throws IOException {
        if (bool == null) {
            return k0();
        }
        T0();
        o();
        this.f63257a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c K0(Number number) throws IOException {
        if (number == null) {
            return k0();
        }
        T0();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (!c(cls)) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f63264h != u.LENIENT) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was " + string);
                }
            } else if (cls != Float.class && cls != Double.class && !f63254l.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        }
        o();
        this.f63257a.append((CharSequence) string);
        return this;
    }

    public c O0(String str) throws IOException {
        if (str == null) {
            return k0();
        }
        T0();
        o();
        D0(str);
        return this;
    }

    public c P0(boolean z11) throws IOException {
        T0();
        o();
        this.f63257a.write(z11 ? "true" : "false");
        return this;
    }

    public final boolean T() {
        return this.f63265i;
    }

    public boolean b0() {
        return this.f63264h == u.LENIENT;
    }

    public c c0(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f63266j != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iR0 = r0();
        if (iR0 != 3 && iR0 != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f63266j = str;
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f63257a.close();
        int i11 = this.f63259c;
        if (i11 > 1 || (i11 == 1 && this.f63258b[i11 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f63259c = 0;
    }

    public void flush() throws IOException {
        if (this.f63259c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f63257a.flush();
    }

    public c k0() throws IOException {
        if (this.f63266j != null) {
            if (!this.f63267k) {
                this.f63266j = null;
                return this;
            }
            T0();
        }
        o();
        this.f63257a.write(Address.ADDRESS_NULL_PLACEHOLDER);
        return this;
    }

    public c p() throws IOException {
        T0();
        return n0(1, '[');
    }

    public c t() throws IOException {
        T0();
        return n0(3, CoreConstants.CURLY_LEFT);
    }

    public final void u0(e eVar) {
        Objects.requireNonNull(eVar);
        this.f63260d = eVar;
        this.f63262f = ",";
        if (eVar.c()) {
            this.f63261e = ": ";
            if (this.f63260d.b().isEmpty()) {
                this.f63262f = ", ";
            }
        } else {
            this.f63261e = ":";
        }
        this.f63263g = this.f63260d.b().isEmpty() && this.f63260d.a().isEmpty();
    }

    public final void w0(boolean z11) {
        this.f63265i = z11;
    }

    public final void y0(boolean z11) {
        this.f63267k = z11;
    }

    public final void z0(u uVar) {
        Objects.requireNonNull(uVar);
        this.f63264h = uVar;
    }
}
