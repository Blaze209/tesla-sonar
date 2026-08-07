package ex;

import bx.i0;
import bx.z;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.ActionConst;
import com.adyen.checkout.components.core.Address;
import com.google.gson.internal.bind.g;
import com.google.gson.stream.MalformedJsonException;
import com.google.gson.u;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Reader f63238a;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f63247j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f63248k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f63249l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int[] f63250m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String[] f63252o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int[] f63253p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u f63239b = u.LEGACY_STRICT;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f63240c = 255;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final char[] f63241d = new char[1024];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f63242e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f63243f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f63244g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f63245h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f63246i = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f63251n = 1;

    /* JADX INFO: renamed from: ex.a$a, reason: collision with other inner class name */
    class C1299a extends z {
        C1299a() {
        }

        @Override // bx.z
        public void a(a aVar) throws IOException {
            if (aVar instanceof g) {
                ((g) aVar).O0();
                return;
            }
            int iP = aVar.f63246i;
            if (iP == 0) {
                iP = aVar.p();
            }
            if (iP == 13) {
                aVar.f63246i = 9;
            } else if (iP == 12) {
                aVar.f63246i = 8;
            } else {
                if (iP != 14) {
                    throw aVar.J0("a name");
                }
                aVar.f63246i = 10;
            }
        }
    }

    static {
        z.f18226a = new C1299a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f63250m = iArr;
        iArr[0] = 6;
        this.f63252o = new String[32];
        this.f63253p = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f63238a = reader;
    }

    private String B(boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(CoreConstants.DOLLAR);
        int i11 = 0;
        while (true) {
            int i12 = this.f63251n;
            if (i11 >= i12) {
                return sb2.toString();
            }
            int i13 = this.f63250m[i11];
            switch (i13) {
                case 1:
                case 2:
                    int i14 = this.f63253p[i11];
                    if (z11 && i14 > 0 && i11 == i12 - 1) {
                        i14--;
                    }
                    sb2.append('[');
                    sb2.append(i14);
                    sb2.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb2.append(CoreConstants.DOT);
                    String str = this.f63252o[i11];
                    if (str != null) {
                        sb2.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError("Unknown scope value: " + i13);
            }
            i11++;
        }
    }

    private void D0() {
        char c11;
        do {
            if (this.f63242e >= this.f63243f && !t(1)) {
                return;
            }
            char[] cArr = this.f63241d;
            int i11 = this.f63242e;
            int i12 = i11 + 1;
            this.f63242e = i12;
            c11 = cArr[i11];
            if (c11 == '\n') {
                this.f63244g++;
                this.f63245h = i12;
                return;
            }
        } while (c11 != '\r');
    }

    private void G0() throws MalformedJsonException {
        do {
            int i11 = 0;
            while (true) {
                int i12 = this.f63242e;
                if (i12 + i11 < this.f63243f) {
                    char c11 = this.f63241d[i12 + i11];
                    if (c11 != '\t' && c11 != '\n' && c11 != '\f' && c11 != '\r' && c11 != ' ') {
                        if (c11 != '#') {
                            if (c11 != ',') {
                                if (c11 != '/' && c11 != '=') {
                                    if (c11 != '{' && c11 != '}' && c11 != ':') {
                                        if (c11 != ';') {
                                            switch (c11) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i11++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        n();
                    }
                    this.f63242e += i11;
                    return;
                }
                this.f63242e = i12 + i11;
            }
        } while (t(1));
    }

    private MalformedJsonException H0(String str) throws MalformedJsonException {
        throw new MalformedJsonException(str + T() + "\nSee " + i0.a("malformed-json"));
    }

    private boolean J(char c11) throws MalformedJsonException {
        if (c11 == '\t' || c11 == '\n' || c11 == '\f' || c11 == '\r' || c11 == ' ') {
            return false;
        }
        if (c11 != '#') {
            if (c11 == ',') {
                return false;
            }
            if (c11 != '/' && c11 != '=') {
                if (c11 == '{' || c11 == '}' || c11 == ':') {
                    return false;
                }
                if (c11 != ';') {
                    switch (c11) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        n();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IllegalStateException J0(String str) {
        return new IllegalStateException("Expected " + str + " but was " + n0() + T() + "\nSee " + i0.a(n0() == b.NULL ? "adapter-not-null-safe" : "unexpected-json-structure"));
    }

    private int b0(boolean z11) throws IOException {
        char[] cArr = this.f63241d;
        int i11 = this.f63242e;
        int i12 = this.f63243f;
        while (true) {
            if (i11 == i12) {
                this.f63242e = i11;
                if (!t(1)) {
                    if (!z11) {
                        return -1;
                    }
                    throw new EOFException("End of input" + T());
                }
                i11 = this.f63242e;
                i12 = this.f63243f;
            }
            int i13 = i11 + 1;
            char c11 = cArr[i11];
            if (c11 == '\n') {
                this.f63244g++;
                this.f63245h = i13;
            } else if (c11 != ' ' && c11 != '\r' && c11 != '\t') {
                if (c11 == '/') {
                    this.f63242e = i13;
                    if (i13 == i12) {
                        this.f63242e = i11;
                        boolean zT = t(2);
                        this.f63242e++;
                        if (!zT) {
                        }
                        return c11;
                    }
                    n();
                    int i14 = this.f63242e;
                    char c12 = cArr[i14];
                    if (c12 == '*') {
                        this.f63242e = i14 + 1;
                        if (!z0("*/")) {
                            throw H0("Unterminated comment");
                        }
                        i11 = this.f63242e + 2;
                        i12 = this.f63243f;
                    } else {
                        if (c12 != '/') {
                            return c11;
                        }
                        this.f63242e = i14 + 1;
                        D0();
                        i11 = this.f63242e;
                        i12 = this.f63243f;
                    }
                } else {
                    if (c11 != '#') {
                        this.f63242e = i13;
                        return c11;
                    }
                    this.f63242e = i13;
                    n();
                    D0();
                    i11 = this.f63242e;
                    i12 = this.f63243f;
                }
            }
            i11 = i13;
        }
    }

    private String e0(char c11) throws MalformedJsonException {
        int i11;
        char[] cArr = this.f63241d;
        StringBuilder sb2 = null;
        do {
            int i12 = this.f63242e;
            int i13 = this.f63243f;
            while (true) {
                int i14 = i13;
                i11 = i12;
                while (true) {
                    if (i12 < i14) {
                        int i15 = i12 + 1;
                        char c12 = cArr[i12];
                        if (this.f63239b == u.STRICT && c12 < ' ') {
                            throw H0("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                        }
                        if (c12 == c11) {
                            this.f63242e = i15;
                            int i16 = (i15 - i11) - 1;
                            if (sb2 == null) {
                                return new String(cArr, i11, i16);
                            }
                            sb2.append(cArr, i11, i16);
                            return sb2.toString();
                        }
                        if (c12 == '\\') {
                            this.f63242e = i15;
                            int i17 = i15 - i11;
                            int i18 = i17 - 1;
                            if (sb2 == null) {
                                sb2 = new StringBuilder(Math.max(i17 * 2, 16));
                            }
                            sb2.append(cArr, i11, i18);
                            sb2.append(u0());
                            i12 = this.f63242e;
                            i13 = this.f63243f;
                        } else {
                            if (c12 == '\n') {
                                this.f63244g++;
                                this.f63245h = i15;
                            }
                            i12 = i15;
                        }
                    }
                }
            }
            if (sb2 == null) {
                sb2 = new StringBuilder(Math.max((i12 - i11) * 2, 16));
            }
            sb2.append(cArr, i11, i12 - i11);
            this.f63242e = i12;
        } while (t(1));
        throw H0("Unterminated string");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    private String k0() throws MalformedJsonException {
        String string;
        StringBuilder sb2 = null;
        int i11 = 0;
        while (true) {
            int i12 = 0;
            while (true) {
                int i13 = this.f63242e;
                if (i13 + i12 < this.f63243f) {
                    char c11 = this.f63241d[i13 + i12];
                    if (c11 != '\t' && c11 != '\n' && c11 != '\f' && c11 != '\r' && c11 != ' ') {
                        if (c11 != '#') {
                            if (c11 != ',') {
                                if (c11 != '/' && c11 != '=') {
                                    if (c11 != '{' && c11 != '}' && c11 != ':') {
                                        if (c11 != ';') {
                                            switch (c11) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i12++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        n();
                    }
                    i11 = i12;
                } else if (i12 >= this.f63241d.length) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i12, 16));
                    }
                    sb2.append(this.f63241d, this.f63242e, i12);
                    this.f63242e += i12;
                    if (!t(1)) {
                    }
                } else if (!t(i12 + 1)) {
                    i11 = i12;
                }
                if (sb2 == null) {
                    string = new String(this.f63241d, this.f63242e, i11);
                } else {
                    sb2.append(this.f63241d, this.f63242e, i11);
                    string = sb2.toString();
                }
                this.f63242e += i11;
                return string;
            }
        }
    }

    private void n() throws MalformedJsonException {
        if (this.f63239b != u.LENIENT) {
            throw H0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    private void o() throws IOException {
        b0(true);
        int i11 = this.f63242e;
        this.f63242e = i11 - 1;
        if (i11 + 4 <= this.f63243f || t(5)) {
            int i12 = this.f63242e;
            char[] cArr = this.f63241d;
            if (cArr[i12] == ')' && cArr[i12 + 1] == ']' && cArr[i12 + 2] == '}' && cArr[i12 + 3] == '\'' && cArr[i12 + 4] == '\n') {
                this.f63242e = i12 + 5;
            }
        }
    }

    private int r0() {
        String str;
        String str2;
        int i11;
        char c11 = this.f63241d[this.f63242e];
        if (c11 == 't' || c11 == 'T') {
            str = "true";
            str2 = "TRUE";
            i11 = 5;
        } else if (c11 == 'f' || c11 == 'F') {
            str = "false";
            str2 = "FALSE";
            i11 = 6;
        } else {
            if (c11 != 'n' && c11 != 'N') {
                return 0;
            }
            str = Address.ADDRESS_NULL_PLACEHOLDER;
            str2 = ActionConst.NULL;
            i11 = 7;
        }
        boolean z11 = this.f63239b != u.STRICT;
        int length = str.length();
        for (int i12 = 0; i12 < length; i12++) {
            if (this.f63242e + i12 >= this.f63243f && !t(i12 + 1)) {
                return 0;
            }
            char c12 = this.f63241d[this.f63242e + i12];
            if (c12 != str.charAt(i12) && (!z11 || c12 != str2.charAt(i12))) {
                return 0;
            }
        }
        if ((this.f63242e + length < this.f63243f || t(length + 1)) && J(this.f63241d[this.f63242e + length])) {
            return 0;
        }
        this.f63242e += length;
        this.f63246i = i11;
        return i11;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:85:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00da  */
    /* JADX WARN: Code duplicated, block: B:91:0x00e1  */
    private int s0() {
        char c11;
        int i11;
        char[] cArr = this.f63241d;
        int i12 = this.f63242e;
        int i13 = this.f63243f;
        int i14 = 0;
        int i15 = 0;
        char c12 = 0;
        boolean z11 = false;
        int i16 = 1;
        long j11 = 0;
        while (true) {
            char c13 = 2;
            if (i12 + i15 != i13) {
                c11 = cArr[i12 + i15];
                i11 = i14;
                if (c11 != '+') {
                    if (c11 != 'E' || c11 == 'e') {
                        if (c12 == 2 && c12 != 4) {
                            return i11;
                        }
                        c12 = 5;
                    } else if (c11 == '-') {
                        c13 = 6;
                        if (c12 == 0) {
                            c12 = 1;
                            z11 = true;
                        } else if (c12 != 5) {
                            return i11;
                        }
                    } else if (c11 != '.') {
                        if (c11 < '0' || c11 > '9') {
                            if (!J(c11)) {
                                break;
                            }
                            return i11;
                        }
                        if (c12 == 1 || c12 == 0) {
                            j11 = -(c11 - '0');
                        } else if (c12 == 2) {
                            if (j11 == 0) {
                                return i11;
                            }
                            long j12 = (10 * j11) - ((long) (c11 - '0'));
                            i16 &= (j11 > -922337203685477580L || (j11 == -922337203685477580L && j12 < j11)) ? 1 : i11;
                            j11 = j12;
                        } else if (c12 == 3) {
                            c12 = 4;
                        } else if (c12 == 5 || c12 == 6) {
                            c12 = 7;
                        }
                    } else {
                        if (c12 != 2) {
                            return i11;
                        }
                        c12 = 3;
                    }
                    i15++;
                    i14 = i11;
                } else {
                    c13 = 6;
                    if (c12 != 5) {
                        return i11;
                    }
                }
                c12 = c13;
                i15++;
                i14 = i11;
            } else {
                if (i15 == cArr.length) {
                    return i14;
                }
                if (!t(i15 + 1)) {
                    i11 = i14;
                    break;
                }
                i12 = this.f63242e;
                i13 = this.f63243f;
                c11 = cArr[i12 + i15];
                i11 = i14;
                if (c11 != '+') {
                    if (c11 != 'E') {
                        if (c12 == 2) {
                        }
                        c12 = 5;
                    } else {
                        if (c12 == 2) {
                        }
                        c12 = 5;
                    }
                    i15++;
                    i14 = i11;
                } else {
                    c13 = 6;
                    if (c12 != 5) {
                        return i11;
                    }
                }
                c12 = c13;
                i15++;
                i14 = i11;
            }
        }
        if (c12 == 2 && i16 != 0 && ((j11 != Long.MIN_VALUE || z11) && (j11 != 0 || !z11))) {
            if (!z11) {
                j11 = -j11;
            }
            this.f63247j = j11;
            this.f63242e += i15;
            this.f63246i = 15;
            return 15;
        }
        if (c12 != 2 && c12 != 4 && c12 != 7) {
            return i11;
        }
        this.f63248k = i15;
        this.f63246i = 16;
        return 16;
    }

    private boolean t(int i11) throws IOException {
        int i12;
        int i13;
        char[] cArr = this.f63241d;
        int i14 = this.f63245h;
        int i15 = this.f63242e;
        this.f63245h = i14 - i15;
        int i16 = this.f63243f;
        if (i16 != i15) {
            int i17 = i16 - i15;
            this.f63243f = i17;
            System.arraycopy(cArr, i15, cArr, 0, i17);
        } else {
            this.f63243f = 0;
        }
        this.f63242e = 0;
        do {
            Reader reader = this.f63238a;
            int i18 = this.f63243f;
            int i19 = reader.read(cArr, i18, cArr.length - i18);
            if (i19 == -1) {
                return false;
            }
            i12 = this.f63243f + i19;
            this.f63243f = i12;
            if (this.f63244g == 0 && (i13 = this.f63245h) == 0 && i12 > 0 && cArr[0] == 65279) {
                this.f63242e++;
                this.f63245h = i13 + 1;
                i11++;
            }
        } while (i12 < i11);
        return true;
    }

    private void t0(int i11) throws MalformedJsonException {
        int i12 = this.f63251n;
        if (i12 - 1 >= this.f63240c) {
            throw new MalformedJsonException("Nesting limit " + this.f63240c + " reached" + T());
        }
        int[] iArr = this.f63250m;
        if (i12 == iArr.length) {
            int i13 = i12 * 2;
            this.f63250m = Arrays.copyOf(iArr, i13);
            this.f63253p = Arrays.copyOf(this.f63253p, i13);
            this.f63252o = (String[]) Arrays.copyOf(this.f63252o, i13);
        }
        int[] iArr2 = this.f63250m;
        int i14 = this.f63251n;
        this.f63251n = i14 + 1;
        iArr2[i14] = i11;
    }

    private char u0() throws MalformedJsonException {
        int i11;
        if (this.f63242e == this.f63243f && !t(1)) {
            throw H0("Unterminated escape sequence");
        }
        char[] cArr = this.f63241d;
        int i12 = this.f63242e;
        int i13 = i12 + 1;
        this.f63242e = i13;
        char c11 = cArr[i12];
        if (c11 != '\n') {
            if (c11 != '\"') {
                if (c11 != '\'') {
                    if (c11 != '/' && c11 != '\\') {
                        if (c11 == 'b') {
                            return '\b';
                        }
                        if (c11 == 'f') {
                            return '\f';
                        }
                        if (c11 == 'n') {
                            return '\n';
                        }
                        if (c11 == 'r') {
                            return '\r';
                        }
                        if (c11 == 't') {
                            return '\t';
                        }
                        if (c11 != 'u') {
                            throw H0("Invalid escape sequence");
                        }
                        if (i12 + 5 > this.f63243f && !t(4)) {
                            throw H0("Unterminated escape sequence");
                        }
                        int i14 = this.f63242e;
                        int i15 = i14 + 4;
                        int i16 = 0;
                        while (i14 < i15) {
                            char c12 = this.f63241d[i14];
                            int i17 = i16 << 4;
                            if (c12 >= '0' && c12 <= '9') {
                                i11 = c12 - '0';
                            } else if (c12 >= 'a' && c12 <= 'f') {
                                i11 = c12 - 'W';
                            } else {
                                if (c12 < 'A' || c12 > 'F') {
                                    throw H0("Malformed Unicode escape \\u" + new String(this.f63241d, this.f63242e, 4));
                                }
                                i11 = c12 - '7';
                            }
                            i16 = i17 + i11;
                            i14++;
                        }
                        this.f63242e += 4;
                        return (char) i16;
                    }
                }
            }
            return c11;
        }
        if (this.f63239b == u.STRICT) {
            throw H0("Cannot escape a newline character in strict mode");
        }
        this.f63244g++;
        this.f63245h = i13;
        if (this.f63239b == u.STRICT) {
            throw H0("Invalid escaped character \"'\" in strict mode");
        }
        return c11;
    }

    private void y0(char c11) throws MalformedJsonException {
        char[] cArr = this.f63241d;
        do {
            int i11 = this.f63242e;
            int i12 = this.f63243f;
            while (i11 < i12) {
                int i13 = i11 + 1;
                char c12 = cArr[i11];
                if (c12 == c11) {
                    this.f63242e = i13;
                    return;
                }
                if (c12 == '\\') {
                    this.f63242e = i13;
                    u0();
                    i11 = this.f63242e;
                    i12 = this.f63243f;
                } else {
                    if (c12 == '\n') {
                        this.f63244g++;
                        this.f63245h = i13;
                    }
                    i11 = i13;
                }
            }
            this.f63242e = i11;
        } while (t(1));
        throw H0("Unterminated string");
    }

    private boolean z0(String str) {
        int length = str.length();
        while (true) {
            if (this.f63242e + length > this.f63243f && !t(length)) {
                return false;
            }
            char[] cArr = this.f63241d;
            int i11 = this.f63242e;
            if (cArr[i11] != '\n') {
                for (int i12 = 0; i12 < length; i12++) {
                    if (this.f63241d[this.f63242e + i12] == str.charAt(i12)) {
                    }
                }
                return true;
            }
            this.f63244g++;
            this.f63245h = i11 + 1;
            this.f63242e++;
        }
    }

    public String C() {
        return B(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void F() throws IOException {
        int i11 = 0;
        do {
            int iP = this.f63246i;
            if (iP == 0) {
                iP = p();
            }
            switch (iP) {
                case 1:
                    t0(3);
                    i11++;
                    this.f63246i = 0;
                    break;
                case 2:
                    if (i11 == 0) {
                        this.f63252o[this.f63251n - 1] = null;
                    }
                    this.f63251n--;
                    i11--;
                    this.f63246i = 0;
                    break;
                case 3:
                    t0(1);
                    i11++;
                    this.f63246i = 0;
                    break;
                case 4:
                    this.f63251n--;
                    i11--;
                    this.f63246i = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f63246i = 0;
                    break;
                case 8:
                    y0(CoreConstants.SINGLE_QUOTE_CHAR);
                    this.f63246i = 0;
                    break;
                case 9:
                    y0(CoreConstants.DOUBLE_QUOTE_CHAR);
                    this.f63246i = 0;
                    break;
                case 10:
                    G0();
                    this.f63246i = 0;
                    break;
                case 12:
                    y0(CoreConstants.SINGLE_QUOTE_CHAR);
                    if (i11 == 0) {
                        this.f63252o[this.f63251n - 1] = "<skipped>";
                    }
                    this.f63246i = 0;
                    break;
                case 13:
                    y0(CoreConstants.DOUBLE_QUOTE_CHAR);
                    if (i11 == 0) {
                        this.f63252o[this.f63251n - 1] = "<skipped>";
                    }
                    this.f63246i = 0;
                    break;
                case 14:
                    G0();
                    if (i11 == 0) {
                        this.f63252o[this.f63251n - 1] = "<skipped>";
                    }
                    this.f63246i = 0;
                    break;
                case 16:
                    this.f63242e += this.f63248k;
                    this.f63246i = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i11 > 0);
        int[] iArr = this.f63253p;
        int i12 = this.f63251n - 1;
        iArr[i12] = iArr[i12] + 1;
    }

    public final u H() {
        return this.f63239b;
    }

    public final boolean I() {
        return this.f63239b == u.LENIENT;
    }

    public String L() throws IOException {
        String strE0;
        int iP = this.f63246i;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 14) {
            strE0 = k0();
        } else if (iP == 12) {
            strE0 = e0(CoreConstants.SINGLE_QUOTE_CHAR);
        } else {
            if (iP != 13) {
                throw J0("a name");
            }
            strE0 = e0(CoreConstants.DOUBLE_QUOTE_CHAR);
        }
        this.f63246i = 0;
        this.f63252o[this.f63251n - 1] = strE0;
        return strE0;
    }

    public String O() throws IOException {
        String str;
        int iP = this.f63246i;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 10) {
            str = k0();
        } else if (iP == 8) {
            str = e0(CoreConstants.SINGLE_QUOTE_CHAR);
        } else if (iP == 9) {
            str = e0(CoreConstants.DOUBLE_QUOTE_CHAR);
        } else if (iP == 11) {
            str = this.f63249l;
            this.f63249l = null;
        } else if (iP == 15) {
            str = Long.toString(this.f63247j);
        } else {
            if (iP != 16) {
                throw J0("a string");
            }
            str = new String(this.f63241d, this.f63242e, this.f63248k);
            this.f63242e += this.f63248k;
        }
        this.f63246i = 0;
        int[] iArr = this.f63253p;
        int i11 = this.f63251n - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    String T() {
        return " at line " + (this.f63244g + 1) + " column " + ((this.f63242e - this.f63245h) + 1) + " path " + getPath();
    }

    public void c0() throws IOException {
        int iP = this.f63246i;
        if (iP == 0) {
            iP = p();
        }
        if (iP != 7) {
            throw J0(Address.ADDRESS_NULL_PLACEHOLDER);
        }
        this.f63246i = 0;
        int[] iArr = this.f63253p;
        int i11 = this.f63251n - 1;
        iArr[i11] = iArr[i11] + 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f63246i = 0;
        this.f63250m[0] = 8;
        this.f63251n = 1;
        this.f63238a.close();
    }

    public void e() throws IOException {
        int iP = this.f63246i;
        if (iP == 0) {
            iP = p();
        }
        if (iP != 4) {
            throw J0("END_ARRAY");
        }
        int i11 = this.f63251n;
        this.f63251n = i11 - 1;
        int[] iArr = this.f63253p;
        int i12 = i11 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f63246i = 0;
    }

    public void f() throws IOException {
        int iP = this.f63246i;
        if (iP == 0) {
            iP = p();
        }
        if (iP != 3) {
            throw J0("BEGIN_ARRAY");
        }
        t0(1);
        this.f63253p[this.f63251n - 1] = 0;
        this.f63246i = 0;
    }

    public String getPath() {
        return B(false);
    }

    public void h() throws IOException {
        int iP = this.f63246i;
        if (iP == 0) {
            iP = p();
        }
        if (iP != 1) {
            throw J0("BEGIN_OBJECT");
        }
        t0(3);
        this.f63246i = 0;
    }

    public boolean hasNext() throws IOException {
        int iP = this.f63246i;
        if (iP == 0) {
            iP = p();
        }
        return (iP == 2 || iP == 4 || iP == 17) ? false : true;
    }

    public void j() throws IOException {
        int iP = this.f63246i;
        if (iP == 0) {
            iP = p();
        }
        if (iP != 2) {
            throw J0("END_OBJECT");
        }
        int i11 = this.f63251n;
        int i12 = i11 - 1;
        this.f63251n = i12;
        this.f63252o[i12] = null;
        int[] iArr = this.f63253p;
        int i13 = i11 - 2;
        iArr[i13] = iArr[i13] + 1;
        this.f63246i = 0;
    }

    public b n0() throws IOException {
        int iP = this.f63246i;
        if (iP == 0) {
            iP = p();
        }
        switch (iP) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public boolean nextBoolean() throws IOException {
        int iP = this.f63246i;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 5) {
            this.f63246i = 0;
            int[] iArr = this.f63253p;
            int i11 = this.f63251n - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        }
        if (iP != 6) {
            throw J0("a boolean");
        }
        this.f63246i = 0;
        int[] iArr2 = this.f63253p;
        int i12 = this.f63251n - 1;
        iArr2[i12] = iArr2[i12] + 1;
        return false;
    }

    public double nextDouble() throws IOException {
        int iP = this.f63246i;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 15) {
            this.f63246i = 0;
            int[] iArr = this.f63253p;
            int i11 = this.f63251n - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f63247j;
        }
        if (iP == 16) {
            this.f63249l = new String(this.f63241d, this.f63242e, this.f63248k);
            this.f63242e += this.f63248k;
        } else if (iP == 8 || iP == 9) {
            this.f63249l = e0(iP == 8 ? CoreConstants.SINGLE_QUOTE_CHAR : CoreConstants.DOUBLE_QUOTE_CHAR);
        } else if (iP == 10) {
            this.f63249l = k0();
        } else if (iP != 11) {
            throw J0("a double");
        }
        this.f63246i = 11;
        double d11 = Double.parseDouble(this.f63249l);
        if (this.f63239b != u.LENIENT && (Double.isNaN(d11) || Double.isInfinite(d11))) {
            throw H0("JSON forbids NaN and infinities: " + d11);
        }
        this.f63249l = null;
        this.f63246i = 0;
        int[] iArr2 = this.f63253p;
        int i12 = this.f63251n - 1;
        iArr2[i12] = iArr2[i12] + 1;
        return d11;
    }

    public int nextInt() throws IOException {
        int iP = this.f63246i;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 15) {
            long j11 = this.f63247j;
            int i11 = (int) j11;
            if (j11 == i11) {
                this.f63246i = 0;
                int[] iArr = this.f63253p;
                int i12 = this.f63251n - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new NumberFormatException("Expected an int but was " + this.f63247j + T());
        }
        if (iP == 16) {
            this.f63249l = new String(this.f63241d, this.f63242e, this.f63248k);
            this.f63242e += this.f63248k;
        } else {
            if (iP != 8 && iP != 9 && iP != 10) {
                throw J0("an int");
            }
            if (iP == 10) {
                this.f63249l = k0();
            } else {
                this.f63249l = e0(iP == 8 ? CoreConstants.SINGLE_QUOTE_CHAR : CoreConstants.DOUBLE_QUOTE_CHAR);
            }
            try {
                int i13 = Integer.parseInt(this.f63249l);
                this.f63246i = 0;
                int[] iArr2 = this.f63253p;
                int i14 = this.f63251n - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return i13;
            } catch (NumberFormatException unused) {
            }
        }
        this.f63246i = 11;
        double d11 = Double.parseDouble(this.f63249l);
        int i15 = (int) d11;
        if (i15 != d11) {
            throw new NumberFormatException("Expected an int but was " + this.f63249l + T());
        }
        this.f63249l = null;
        this.f63246i = 0;
        int[] iArr3 = this.f63253p;
        int i16 = this.f63251n - 1;
        iArr3[i16] = iArr3[i16] + 1;
        return i15;
    }

    public long nextLong() throws IOException {
        int iP = this.f63246i;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 15) {
            this.f63246i = 0;
            int[] iArr = this.f63253p;
            int i11 = this.f63251n - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f63247j;
        }
        if (iP == 16) {
            this.f63249l = new String(this.f63241d, this.f63242e, this.f63248k);
            this.f63242e += this.f63248k;
        } else {
            if (iP != 8 && iP != 9 && iP != 10) {
                throw J0("a long");
            }
            if (iP == 10) {
                this.f63249l = k0();
            } else {
                this.f63249l = e0(iP == 8 ? CoreConstants.SINGLE_QUOTE_CHAR : CoreConstants.DOUBLE_QUOTE_CHAR);
            }
            try {
                long j11 = Long.parseLong(this.f63249l);
                this.f63246i = 0;
                int[] iArr2 = this.f63253p;
                int i12 = this.f63251n - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return j11;
            } catch (NumberFormatException unused) {
            }
        }
        this.f63246i = 11;
        double d11 = Double.parseDouble(this.f63249l);
        long j12 = (long) d11;
        if (j12 != d11) {
            throw new NumberFormatException("Expected a long but was " + this.f63249l + T());
        }
        this.f63249l = null;
        this.f63246i = 0;
        int[] iArr3 = this.f63253p;
        int i13 = this.f63251n - 1;
        iArr3[i13] = iArr3[i13] + 1;
        return j12;
    }

    int p() throws IOException {
        int iB0;
        int[] iArr = this.f63250m;
        int i11 = this.f63251n;
        int i12 = iArr[i11 - 1];
        if (i12 == 1) {
            iArr[i11 - 1] = 2;
        } else if (i12 == 2) {
            int iB1 = b0(true);
            if (iB1 != 44) {
                if (iB1 != 59) {
                    if (iB1 != 93) {
                        throw H0("Unterminated array");
                    }
                    this.f63246i = 4;
                    return 4;
                }
                n();
            }
        } else {
            if (i12 == 3 || i12 == 5) {
                iArr[i11 - 1] = 4;
                if (i12 == 5 && (iB0 = b0(true)) != 44) {
                    if (iB0 != 59) {
                        if (iB0 != 125) {
                            throw H0("Unterminated object");
                        }
                        this.f63246i = 2;
                        return 2;
                    }
                    n();
                }
                int iB2 = b0(true);
                if (iB2 == 34) {
                    this.f63246i = 13;
                    return 13;
                }
                if (iB2 == 39) {
                    n();
                    this.f63246i = 12;
                    return 12;
                }
                if (iB2 == 125) {
                    if (i12 == 5) {
                        throw H0("Expected name");
                    }
                    this.f63246i = 2;
                    return 2;
                }
                n();
                this.f63242e--;
                if (!J((char) iB2)) {
                    throw H0("Expected name");
                }
                this.f63246i = 14;
                return 14;
            }
            if (i12 == 4) {
                iArr[i11 - 1] = 5;
                int iB3 = b0(true);
                if (iB3 != 58) {
                    if (iB3 != 61) {
                        throw H0("Expected ':'");
                    }
                    n();
                    if (this.f63242e < this.f63243f || t(1)) {
                        char[] cArr = this.f63241d;
                        int i13 = this.f63242e;
                        if (cArr[i13] == '>') {
                            this.f63242e = i13 + 1;
                        }
                    }
                }
            } else if (i12 == 6) {
                if (this.f63239b == u.LENIENT) {
                    o();
                }
                this.f63250m[this.f63251n - 1] = 7;
            } else if (i12 == 7) {
                if (b0(false) == -1) {
                    this.f63246i = 17;
                    return 17;
                }
                n();
                this.f63242e--;
            } else if (i12 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iB4 = b0(true);
        if (iB4 == 34) {
            this.f63246i = 9;
            return 9;
        }
        if (iB4 == 39) {
            n();
            this.f63246i = 8;
            return 8;
        }
        if (iB4 != 44 && iB4 != 59) {
            if (iB4 == 91) {
                this.f63246i = 3;
                return 3;
            }
            if (iB4 != 93) {
                if (iB4 == 123) {
                    this.f63246i = 1;
                    return 1;
                }
                this.f63242e--;
                int iR0 = r0();
                if (iR0 != 0) {
                    return iR0;
                }
                int iS0 = s0();
                if (iS0 != 0) {
                    return iS0;
                }
                if (!J(this.f63241d[this.f63242e])) {
                    throw H0("Expected value");
                }
                n();
                this.f63246i = 10;
                return 10;
            }
            if (i12 == 1) {
                this.f63246i = 4;
                return 4;
            }
        }
        if (i12 != 1 && i12 != 2) {
            throw H0("Unexpected value");
        }
        n();
        this.f63242e--;
        this.f63246i = 7;
        return 7;
    }

    public String toString() {
        return getClass().getSimpleName() + T();
    }

    public final void w0(u uVar) {
        Objects.requireNonNull(uVar);
        this.f63239b = uVar;
    }
}
