package io.sentry.vendor.gson.stream;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.ActionConst;
import com.adyen.checkout.components.core.Address;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Reader f81534a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f81542i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f81543j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f81544k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f81545l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String[] f81547n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int[] f81548o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f81535b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char[] f81536c = new char[1024];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f81537d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f81538e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f81539f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f81540g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f81541h = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f81546m = 1;

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f81545l = iArr;
        iArr[0] = 6;
        this.f81547n = new String[32];
        this.f81548o = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f81534a = reader;
    }

    private int C(boolean z11) throws IOException {
        char[] cArr = this.f81536c;
        int i11 = this.f81537d;
        int i12 = this.f81538e;
        while (true) {
            if (i11 == i12) {
                this.f81537d = i11;
                if (!p(1)) {
                    if (!z11) {
                        return -1;
                    }
                    throw new EOFException("End of input" + B());
                }
                i11 = this.f81537d;
                i12 = this.f81538e;
            }
            int i13 = i11 + 1;
            char c11 = cArr[i11];
            if (c11 == '\n') {
                this.f81539f++;
                this.f81540g = i13;
            } else if (c11 != ' ' && c11 != '\r' && c11 != '\t') {
                if (c11 == '/') {
                    this.f81537d = i13;
                    if (i13 == i12) {
                        this.f81537d = i11;
                        boolean zP = p(2);
                        this.f81537d++;
                        if (!zP) {
                        }
                        return c11;
                    }
                    c();
                    int i14 = this.f81537d;
                    char c12 = cArr[i14];
                    if (c12 == '*') {
                        this.f81537d = i14 + 1;
                        if (!n0("*/")) {
                            throw t0("Unterminated comment");
                        }
                        i11 = this.f81537d + 2;
                        i12 = this.f81538e;
                    } else {
                        if (c12 != '/') {
                            return c11;
                        }
                        this.f81537d = i14 + 1;
                        r0();
                        i11 = this.f81537d;
                        i12 = this.f81538e;
                    }
                } else {
                    if (c11 != '#') {
                        this.f81537d = i13;
                        return c11;
                    }
                    this.f81537d = i13;
                    c();
                    r0();
                    i11 = this.f81537d;
                    i12 = this.f81538e;
                }
            }
            i11 = i13;
        }
    }

    private String I(char c11) throws IOException {
        int i11;
        char[] cArr = this.f81536c;
        StringBuilder sb2 = null;
        do {
            int i12 = this.f81537d;
            int i13 = this.f81538e;
            while (true) {
                int i14 = i13;
                i11 = i12;
                while (true) {
                    if (i12 < i14) {
                        int i15 = i12 + 1;
                        char c12 = cArr[i12];
                        if (c12 == c11) {
                            this.f81537d = i15;
                            int i16 = (i15 - i11) - 1;
                            if (sb2 == null) {
                                return new String(cArr, i11, i16);
                            }
                            sb2.append(cArr, i11, i16);
                            return sb2.toString();
                        }
                        if (c12 == '\\') {
                            this.f81537d = i15;
                            int i17 = i15 - i11;
                            int i18 = i17 - 1;
                            if (sb2 == null) {
                                sb2 = new StringBuilder(Math.max(i17 * 2, 16));
                            }
                            sb2.append(cArr, i11, i18);
                            sb2.append(e0());
                            i12 = this.f81537d;
                            i13 = this.f81538e;
                        } else {
                            if (c12 == '\n') {
                                this.f81539f++;
                                this.f81540g = i15;
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
            this.f81537d = i12;
        } while (p(1));
        throw t0("Unterminated string");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    private String J() throws IOException {
        String string;
        StringBuilder sb2 = null;
        int i11 = 0;
        while (true) {
            int i12 = 0;
            while (true) {
                int i13 = this.f81537d;
                if (i13 + i12 < this.f81538e) {
                    char c11 = this.f81536c[i13 + i12];
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
                        c();
                    }
                    i11 = i12;
                } else if (i12 >= this.f81536c.length) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i12, 16));
                    }
                    sb2.append(this.f81536c, this.f81537d, i12);
                    this.f81537d += i12;
                    if (!p(1)) {
                    }
                } else if (!p(i12 + 1)) {
                    i11 = i12;
                }
                if (sb2 == null) {
                    string = new String(this.f81536c, this.f81537d, i11);
                } else {
                    sb2.append(this.f81536c, this.f81537d, i11);
                    string = sb2.toString();
                }
                this.f81537d += i11;
                return string;
            }
        }
    }

    private int T() {
        String str;
        String str2;
        int i11;
        char c11 = this.f81536c[this.f81537d];
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
        int length = str.length();
        for (int i12 = 1; i12 < length; i12++) {
            if (this.f81537d + i12 >= this.f81538e && !p(i12 + 1)) {
                return 0;
            }
            char c12 = this.f81536c[this.f81537d + i12];
            if (c12 != str.charAt(i12) && c12 != str2.charAt(i12)) {
                return 0;
            }
        }
        if ((this.f81537d + length < this.f81538e || p(length + 1)) && t(this.f81536c[this.f81537d + length])) {
            return 0;
        }
        this.f81537d += length;
        this.f81541h = i11;
        return i11;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:85:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00da  */
    /* JADX WARN: Code duplicated, block: B:91:0x00e1  */
    private int b0() {
        char c11;
        int i11;
        char[] cArr = this.f81536c;
        int i12 = this.f81537d;
        int i13 = this.f81538e;
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
                            if (!t(c11)) {
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
                if (!p(i15 + 1)) {
                    i11 = i14;
                    break;
                }
                i12 = this.f81537d;
                i13 = this.f81538e;
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
            this.f81542i = j11;
            this.f81537d += i15;
            this.f81541h = 15;
            return 15;
        }
        if (c12 != 2 && c12 != 4 && c12 != 7) {
            return i11;
        }
        this.f81543j = i15;
        this.f81541h = 16;
        return 16;
    }

    private void c() throws IOException {
        if (!this.f81535b) {
            throw t0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void c0(int i11) {
        int i12 = this.f81546m;
        int[] iArr = this.f81545l;
        if (i12 == iArr.length) {
            int i13 = i12 * 2;
            this.f81545l = Arrays.copyOf(iArr, i13);
            this.f81548o = Arrays.copyOf(this.f81548o, i13);
            this.f81547n = (String[]) Arrays.copyOf(this.f81547n, i13);
        }
        int[] iArr2 = this.f81545l;
        int i14 = this.f81546m;
        this.f81546m = i14 + 1;
        iArr2[i14] = i11;
    }

    private char e0() throws IOException {
        int i11;
        if (this.f81537d == this.f81538e && !p(1)) {
            throw t0("Unterminated escape sequence");
        }
        char[] cArr = this.f81536c;
        int i12 = this.f81537d;
        int i13 = i12 + 1;
        this.f81537d = i13;
        char c11 = cArr[i12];
        if (c11 == '\n') {
            this.f81539f++;
            this.f81540g = i13;
            return c11;
        }
        if (c11 == '\"' || c11 == '\'' || c11 == '/' || c11 == '\\') {
            return c11;
        }
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
            throw t0("Invalid escape sequence");
        }
        if (i12 + 5 > this.f81538e && !p(4)) {
            throw t0("Unterminated escape sequence");
        }
        int i14 = this.f81537d;
        int i15 = i14 + 4;
        char c12 = 0;
        while (i14 < i15) {
            char c13 = this.f81536c[i14];
            char c14 = (char) (c12 << 4);
            if (c13 >= '0' && c13 <= '9') {
                i11 = c13 - '0';
            } else if (c13 >= 'a' && c13 <= 'f') {
                i11 = c13 - 'W';
            } else {
                if (c13 < 'A' || c13 > 'F') {
                    throw new NumberFormatException("\\u" + new String(this.f81536c, this.f81537d, 4));
                }
                i11 = c13 - '7';
            }
            c12 = (char) (c14 + i11);
            i14++;
        }
        this.f81537d += 4;
        return c12;
    }

    private void k0(char c11) throws IOException {
        char[] cArr = this.f81536c;
        do {
            int i11 = this.f81537d;
            int i12 = this.f81538e;
            while (i11 < i12) {
                int i13 = i11 + 1;
                char c12 = cArr[i11];
                if (c12 == c11) {
                    this.f81537d = i13;
                    return;
                }
                if (c12 == '\\') {
                    this.f81537d = i13;
                    e0();
                    i11 = this.f81537d;
                    i12 = this.f81538e;
                } else {
                    if (c12 == '\n') {
                        this.f81539f++;
                        this.f81540g = i13;
                    }
                    i11 = i13;
                }
            }
            this.f81537d = i11;
        } while (p(1));
        throw t0("Unterminated string");
    }

    private void n() throws IOException {
        C(true);
        int i11 = this.f81537d;
        int i12 = i11 - 1;
        this.f81537d = i12;
        if (i11 + 4 <= this.f81538e || p(5)) {
            char[] cArr = this.f81536c;
            if (cArr[i12] == ')' && cArr[i11] == ']' && cArr[i11 + 1] == '}' && cArr[i11 + 2] == '\'' && cArr[i11 + 3] == '\n') {
                this.f81537d += 5;
            }
        }
    }

    private boolean n0(String str) {
        int length = str.length();
        while (true) {
            if (this.f81537d + length > this.f81538e && !p(length)) {
                return false;
            }
            char[] cArr = this.f81536c;
            int i11 = this.f81537d;
            if (cArr[i11] != '\n') {
                for (int i12 = 0; i12 < length; i12++) {
                    if (this.f81536c[this.f81537d + i12] == str.charAt(i12)) {
                    }
                }
                return true;
            }
            this.f81539f++;
            this.f81540g = i11 + 1;
            this.f81537d++;
        }
    }

    private boolean p(int i11) throws IOException {
        int i12;
        int i13;
        char[] cArr = this.f81536c;
        int i14 = this.f81540g;
        int i15 = this.f81537d;
        this.f81540g = i14 - i15;
        int i16 = this.f81538e;
        if (i16 != i15) {
            int i17 = i16 - i15;
            this.f81538e = i17;
            System.arraycopy(cArr, i15, cArr, 0, i17);
        } else {
            this.f81538e = 0;
        }
        this.f81537d = 0;
        do {
            Reader reader = this.f81534a;
            int i18 = this.f81538e;
            int i19 = reader.read(cArr, i18, cArr.length - i18);
            if (i19 == -1) {
                return false;
            }
            i12 = this.f81538e + i19;
            this.f81538e = i12;
            if (this.f81539f == 0 && (i13 = this.f81540g) == 0 && i12 > 0 && cArr[0] == 65279) {
                this.f81537d++;
                this.f81540g = i13 + 1;
                i11++;
            }
        } while (i12 < i11);
        return true;
    }

    private void r0() {
        char c11;
        do {
            if (this.f81537d >= this.f81538e && !p(1)) {
                return;
            }
            char[] cArr = this.f81536c;
            int i11 = this.f81537d;
            int i12 = i11 + 1;
            this.f81537d = i12;
            c11 = cArr[i11];
            if (c11 == '\n') {
                this.f81539f++;
                this.f81540g = i12;
                return;
            }
        } while (c11 != '\r');
    }

    private void s0() throws IOException {
        do {
            int i11 = 0;
            while (true) {
                int i12 = this.f81537d;
                if (i12 + i11 < this.f81538e) {
                    char c11 = this.f81536c[i12 + i11];
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
                        c();
                    }
                    this.f81537d += i11;
                    return;
                }
                this.f81537d = i12 + i11;
            }
        } while (p(1));
    }

    private boolean t(char c11) throws IOException {
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
        c();
        return false;
    }

    private IOException t0(String str) throws MalformedJsonException {
        throw new MalformedJsonException(str + B());
    }

    String B() {
        return " at line " + (this.f81539f + 1) + " column " + ((this.f81537d - this.f81540g) + 1) + " path " + getPath();
    }

    public void F() throws IOException {
        int i11 = 0;
        do {
            int iO = this.f81541h;
            if (iO == 0) {
                iO = o();
            }
            if (iO == 3) {
                c0(1);
            } else {
                if (iO == 1) {
                    c0(3);
                } else if (iO == 4 || iO == 2) {
                    this.f81546m--;
                    i11--;
                } else if (iO == 14 || iO == 10) {
                    s0();
                } else if (iO == 8 || iO == 12) {
                    k0(CoreConstants.SINGLE_QUOTE_CHAR);
                } else if (iO == 9 || iO == 13) {
                    k0(CoreConstants.DOUBLE_QUOTE_CHAR);
                } else if (iO == 16) {
                    this.f81537d += this.f81543j;
                }
                this.f81541h = 0;
            }
            i11++;
            this.f81541h = 0;
        } while (i11 != 0);
        int[] iArr = this.f81548o;
        int i12 = this.f81546m;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.f81547n[i12 - 1] = Address.ADDRESS_NULL_PLACEHOLDER;
    }

    public void H() throws IOException {
        int iO = this.f81541h;
        if (iO == 0) {
            iO = o();
        }
        if (iO == 7) {
            this.f81541h = 0;
            int[] iArr = this.f81548o;
            int i11 = this.f81546m - 1;
            iArr[i11] = iArr[i11] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + peek() + B());
    }

    public String L() throws IOException {
        String strI;
        int iO = this.f81541h;
        if (iO == 0) {
            iO = o();
        }
        if (iO == 14) {
            strI = J();
        } else if (iO == 12) {
            strI = I(CoreConstants.SINGLE_QUOTE_CHAR);
        } else {
            if (iO != 13) {
                throw new IllegalStateException("Expected a name but was " + peek() + B());
            }
            strI = I(CoreConstants.DOUBLE_QUOTE_CHAR);
        }
        this.f81541h = 0;
        this.f81547n[this.f81546m - 1] = strI;
        return strI;
    }

    public String O() throws IOException {
        String str;
        int iO = this.f81541h;
        if (iO == 0) {
            iO = o();
        }
        if (iO == 10) {
            str = J();
        } else if (iO == 8) {
            str = I(CoreConstants.SINGLE_QUOTE_CHAR);
        } else if (iO == 9) {
            str = I(CoreConstants.DOUBLE_QUOTE_CHAR);
        } else if (iO == 11) {
            str = this.f81544k;
            this.f81544k = null;
        } else if (iO == 15) {
            str = Long.toString(this.f81542i);
        } else {
            if (iO != 16) {
                throw new IllegalStateException("Expected a string but was " + peek() + B());
            }
            str = new String(this.f81536c, this.f81537d, this.f81543j);
            this.f81537d += this.f81543j;
        }
        this.f81541h = 0;
        int[] iArr = this.f81548o;
        int i11 = this.f81546m - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    public final void P(boolean z11) {
        this.f81535b = z11;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f81541h = 0;
        this.f81545l[0] = 8;
        this.f81546m = 1;
        this.f81534a.close();
    }

    public void e() throws IOException {
        int iO = this.f81541h;
        if (iO == 0) {
            iO = o();
        }
        if (iO != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + peek() + B());
        }
        int i11 = this.f81546m;
        this.f81546m = i11 - 1;
        int[] iArr = this.f81548o;
        int i12 = i11 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f81541h = 0;
    }

    public void f() throws IOException {
        int iO = this.f81541h;
        if (iO == 0) {
            iO = o();
        }
        if (iO == 3) {
            c0(1);
            this.f81548o[this.f81546m - 1] = 0;
            this.f81541h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + peek() + B());
        }
    }

    public String getPath() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(CoreConstants.DOLLAR);
        int i11 = this.f81546m;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = this.f81545l[i12];
            if (i13 == 1 || i13 == 2) {
                sb2.append('[');
                sb2.append(this.f81548o[i12]);
                sb2.append(']');
            } else if (i13 == 3 || i13 == 4 || i13 == 5) {
                sb2.append(CoreConstants.DOT);
                String str = this.f81547n[i12];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    public void h() throws IOException {
        int iO = this.f81541h;
        if (iO == 0) {
            iO = o();
        }
        if (iO == 1) {
            c0(3);
            this.f81541h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + peek() + B());
        }
    }

    public boolean hasNext() throws IOException {
        int iO = this.f81541h;
        if (iO == 0) {
            iO = o();
        }
        return (iO == 2 || iO == 4) ? false : true;
    }

    public void j() throws IOException {
        int iO = this.f81541h;
        if (iO == 0) {
            iO = o();
        }
        if (iO != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + peek() + B());
        }
        int i11 = this.f81546m;
        int i12 = i11 - 1;
        this.f81546m = i12;
        this.f81547n[i12] = null;
        int[] iArr = this.f81548o;
        int i13 = i11 - 2;
        iArr[i13] = iArr[i13] + 1;
        this.f81541h = 0;
    }

    public boolean nextBoolean() throws IOException {
        int iO = this.f81541h;
        if (iO == 0) {
            iO = o();
        }
        if (iO == 5) {
            this.f81541h = 0;
            int[] iArr = this.f81548o;
            int i11 = this.f81546m - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        }
        if (iO == 6) {
            this.f81541h = 0;
            int[] iArr2 = this.f81548o;
            int i12 = this.f81546m - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + peek() + B());
    }

    public double nextDouble() throws IOException {
        int iO = this.f81541h;
        if (iO == 0) {
            iO = o();
        }
        if (iO == 15) {
            this.f81541h = 0;
            int[] iArr = this.f81548o;
            int i11 = this.f81546m - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f81542i;
        }
        if (iO == 16) {
            this.f81544k = new String(this.f81536c, this.f81537d, this.f81543j);
            this.f81537d += this.f81543j;
        } else if (iO == 8 || iO == 9) {
            this.f81544k = I(iO == 8 ? CoreConstants.SINGLE_QUOTE_CHAR : CoreConstants.DOUBLE_QUOTE_CHAR);
        } else if (iO == 10) {
            this.f81544k = J();
        } else if (iO != 11) {
            throw new IllegalStateException("Expected a double but was " + peek() + B());
        }
        this.f81541h = 11;
        double d11 = Double.parseDouble(this.f81544k);
        if (!this.f81535b && (Double.isNaN(d11) || Double.isInfinite(d11))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + d11 + B());
        }
        this.f81544k = null;
        this.f81541h = 0;
        int[] iArr2 = this.f81548o;
        int i12 = this.f81546m - 1;
        iArr2[i12] = iArr2[i12] + 1;
        return d11;
    }

    public int nextInt() throws IOException {
        int iO = this.f81541h;
        if (iO == 0) {
            iO = o();
        }
        if (iO == 15) {
            long j11 = this.f81542i;
            int i11 = (int) j11;
            if (j11 == i11) {
                this.f81541h = 0;
                int[] iArr = this.f81548o;
                int i12 = this.f81546m - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new NumberFormatException("Expected an int but was " + this.f81542i + B());
        }
        if (iO == 16) {
            this.f81544k = new String(this.f81536c, this.f81537d, this.f81543j);
            this.f81537d += this.f81543j;
        } else {
            if (iO != 8 && iO != 9 && iO != 10) {
                throw new IllegalStateException("Expected an int but was " + peek() + B());
            }
            if (iO == 10) {
                this.f81544k = J();
            } else {
                this.f81544k = I(iO == 8 ? CoreConstants.SINGLE_QUOTE_CHAR : CoreConstants.DOUBLE_QUOTE_CHAR);
            }
            try {
                int i13 = Integer.parseInt(this.f81544k);
                this.f81541h = 0;
                int[] iArr2 = this.f81548o;
                int i14 = this.f81546m - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return i13;
            } catch (NumberFormatException unused) {
            }
        }
        this.f81541h = 11;
        double d11 = Double.parseDouble(this.f81544k);
        int i15 = (int) d11;
        if (i15 != d11) {
            throw new NumberFormatException("Expected an int but was " + this.f81544k + B());
        }
        this.f81544k = null;
        this.f81541h = 0;
        int[] iArr3 = this.f81548o;
        int i16 = this.f81546m - 1;
        iArr3[i16] = iArr3[i16] + 1;
        return i15;
    }

    public long nextLong() throws IOException {
        int iO = this.f81541h;
        if (iO == 0) {
            iO = o();
        }
        if (iO == 15) {
            this.f81541h = 0;
            int[] iArr = this.f81548o;
            int i11 = this.f81546m - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f81542i;
        }
        if (iO == 16) {
            this.f81544k = new String(this.f81536c, this.f81537d, this.f81543j);
            this.f81537d += this.f81543j;
        } else {
            if (iO != 8 && iO != 9 && iO != 10) {
                throw new IllegalStateException("Expected a long but was " + peek() + B());
            }
            if (iO == 10) {
                this.f81544k = J();
            } else {
                this.f81544k = I(iO == 8 ? CoreConstants.SINGLE_QUOTE_CHAR : CoreConstants.DOUBLE_QUOTE_CHAR);
            }
            try {
                long j11 = Long.parseLong(this.f81544k);
                this.f81541h = 0;
                int[] iArr2 = this.f81548o;
                int i12 = this.f81546m - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return j11;
            } catch (NumberFormatException unused) {
            }
        }
        this.f81541h = 11;
        double d11 = Double.parseDouble(this.f81544k);
        long j12 = (long) d11;
        if (j12 != d11) {
            throw new NumberFormatException("Expected a long but was " + this.f81544k + B());
        }
        this.f81544k = null;
        this.f81541h = 0;
        int[] iArr3 = this.f81548o;
        int i13 = this.f81546m - 1;
        iArr3[i13] = iArr3[i13] + 1;
        return j12;
    }

    int o() throws IOException {
        int iC;
        int[] iArr = this.f81545l;
        int i11 = this.f81546m;
        int i12 = iArr[i11 - 1];
        if (i12 == 1) {
            iArr[i11 - 1] = 2;
        } else if (i12 == 2) {
            int iC2 = C(true);
            if (iC2 != 44) {
                if (iC2 != 59) {
                    if (iC2 != 93) {
                        throw t0("Unterminated array");
                    }
                    this.f81541h = 4;
                    return 4;
                }
                c();
            }
        } else {
            if (i12 == 3 || i12 == 5) {
                iArr[i11 - 1] = 4;
                if (i12 == 5 && (iC = C(true)) != 44) {
                    if (iC != 59) {
                        if (iC != 125) {
                            throw t0("Unterminated object");
                        }
                        this.f81541h = 2;
                        return 2;
                    }
                    c();
                }
                int iC3 = C(true);
                if (iC3 == 34) {
                    this.f81541h = 13;
                    return 13;
                }
                if (iC3 == 39) {
                    c();
                    this.f81541h = 12;
                    return 12;
                }
                if (iC3 == 125) {
                    if (i12 == 5) {
                        throw t0("Expected name");
                    }
                    this.f81541h = 2;
                    return 2;
                }
                c();
                this.f81537d--;
                if (!t((char) iC3)) {
                    throw t0("Expected name");
                }
                this.f81541h = 14;
                return 14;
            }
            if (i12 == 4) {
                iArr[i11 - 1] = 5;
                int iC4 = C(true);
                if (iC4 != 58) {
                    if (iC4 != 61) {
                        throw t0("Expected ':'");
                    }
                    c();
                    if (this.f81537d < this.f81538e || p(1)) {
                        char[] cArr = this.f81536c;
                        int i13 = this.f81537d;
                        if (cArr[i13] == '>') {
                            this.f81537d = i13 + 1;
                        }
                    }
                }
            } else if (i12 == 6) {
                if (this.f81535b) {
                    n();
                }
                this.f81545l[this.f81546m - 1] = 7;
            } else if (i12 == 7) {
                if (C(false) == -1) {
                    this.f81541h = 17;
                    return 17;
                }
                c();
                this.f81537d--;
            } else if (i12 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iC5 = C(true);
        if (iC5 == 34) {
            this.f81541h = 9;
            return 9;
        }
        if (iC5 == 39) {
            c();
            this.f81541h = 8;
            return 8;
        }
        if (iC5 != 44 && iC5 != 59) {
            if (iC5 == 91) {
                this.f81541h = 3;
                return 3;
            }
            if (iC5 != 93) {
                if (iC5 == 123) {
                    this.f81541h = 1;
                    return 1;
                }
                this.f81537d--;
                int iT = T();
                if (iT != 0) {
                    return iT;
                }
                int iB0 = b0();
                if (iB0 != 0) {
                    return iB0;
                }
                if (!t(this.f81536c[this.f81537d])) {
                    throw t0("Expected value");
                }
                c();
                this.f81541h = 10;
                return 10;
            }
            if (i12 == 1) {
                this.f81541h = 4;
                return 4;
            }
        }
        if (i12 != 1 && i12 != 2) {
            throw t0("Unexpected value");
        }
        c();
        this.f81537d--;
        this.f81541h = 7;
        return 7;
    }

    public b peek() throws IOException {
        int iO = this.f81541h;
        if (iO == 0) {
            iO = o();
        }
        switch (iO) {
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

    public String toString() {
        return getClass().getSimpleName() + B();
    }
}
