package uz;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.Address;
import com.nimbusds.jose.shaded.json.parser.ParseException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import wz.e;
import wz.f;

/* JADX INFO: loaded from: classes6.dex */
abstract class b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected static boolean[] f116786t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected static boolean[] f116787u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected static boolean[] f116788v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected static boolean[] f116789w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected static boolean[] f116790x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected char f116791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    e f116792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f116793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final a f116794d = new a(15);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Object f116795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f116796f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f116797g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final boolean f116798h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final boolean f116799i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final boolean f116800j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final boolean f116801k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected final boolean f116802l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final boolean f116803m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final boolean f116804n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected final boolean f116805o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected final boolean f116806p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected final boolean f116807q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected final boolean f116808r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected final boolean f116809s;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        char[] f116810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f116811b = -1;

        public a(int i11) {
            this.f116810a = new char[i11];
        }

        public void a(char c11) {
            int i11 = this.f116811b + 1;
            this.f116811b = i11;
            char[] cArr = this.f116810a;
            if (cArr.length <= i11) {
                char[] cArr2 = new char[(cArr.length * 2) + 1];
                System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                this.f116810a = cArr2;
            }
            this.f116810a[this.f116811b] = c11;
        }

        public void b() {
            this.f116811b = -1;
        }

        public String toString() {
            return new String(this.f116810a, 0, this.f116811b + 1);
        }
    }

    static {
        boolean[] zArr = new boolean[126];
        f116786t = zArr;
        boolean[] zArr2 = new boolean[126];
        f116787u = zArr2;
        boolean[] zArr3 = new boolean[126];
        f116788v = zArr3;
        boolean[] zArr4 = new boolean[126];
        f116789w = zArr4;
        boolean[] zArr5 = new boolean[126];
        f116790x = zArr5;
        zArr3[26] = true;
        zArr3[58] = true;
        zArr4[26] = true;
        zArr4[125] = true;
        zArr4[44] = true;
        zArr2[26] = true;
        zArr2[93] = true;
        zArr2[44] = true;
        zArr5[26] = true;
        zArr[58] = true;
        zArr[44] = true;
        zArr[26] = true;
        zArr[125] = true;
        zArr[93] = true;
    }

    public b(int i11) {
        this.f116799i = (i11 & 4) > 0;
        this.f116800j = (i11 & 2) > 0;
        this.f116801k = (i11 & 1) > 0;
        this.f116805o = (i11 & 8) > 0;
        this.f116807q = (i11 & 16) > 0;
        this.f116798h = (i11 & 32) > 0;
        this.f116802l = (i11 & 64) > 0;
        this.f116806p = (i11 & 128) > 0;
        this.f116803m = (i11 & 768) != 768;
        this.f116804n = (i11 & 512) == 0;
        this.f116808r = (i11 & 1024) > 0;
        this.f116809s = (i11 & 2048) > 0;
    }

    public void a() throws ParseException {
        if (this.f116805o) {
            return;
        }
        int length = this.f116796f.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = this.f116796f.charAt(i11);
            if (cCharAt >= 0) {
                if (cCharAt <= 31) {
                    throw new ParseException(this.f116797g + i11, 0, Character.valueOf(cCharAt));
                }
                if (cCharAt == 127 && this.f116808r) {
                    throw new ParseException(this.f116797g + i11, 0, Character.valueOf(cCharAt));
                }
            }
        }
    }

    public void b() throws ParseException {
        int length = this.f116796f.length();
        if (length == 1) {
            return;
        }
        if (length == 2) {
            if (this.f116796f.equals("00")) {
                throw new ParseException(this.f116797g, 6, this.f116796f);
            }
            return;
        }
        char cCharAt = this.f116796f.charAt(0);
        char cCharAt2 = this.f116796f.charAt(1);
        if (cCharAt != '-') {
            if (cCharAt == '0' && cCharAt2 >= '0' && cCharAt2 <= '9') {
                throw new ParseException(this.f116797g, 6, this.f116796f);
            }
            return;
        }
        char cCharAt3 = this.f116796f.charAt(2);
        if (cCharAt2 == '0' && cCharAt3 >= '0' && cCharAt3 <= '9') {
            throw new ParseException(this.f116797g, 6, this.f116796f);
        }
    }

    protected Number c() throws ParseException {
        if (!this.f116798h) {
            b();
        }
        try {
            if (!this.f116806p) {
                return Float.valueOf(Float.parseFloat(this.f116796f));
            }
            if (this.f116796f.length() <= 18) {
                return Double.valueOf(Double.parseDouble(this.f116796f));
            }
            BigDecimal bigDecimal = new BigDecimal(this.f116796f);
            if (this.f116809s) {
                return bigDecimal;
            }
            double d11 = Double.parseDouble(this.f116796f);
            return String.valueOf(d11).equals(this.f116796f) ? Double.valueOf(d11) : bigDecimal;
        } catch (NumberFormatException unused) {
            throw new ParseException(this.f116797g, 1, this.f116796f);
        }
    }

    protected <T> T d(f<T> fVar) throws ParseException {
        this.f116797g = -1;
        try {
            f();
            T t11 = (T) h(fVar);
            if (this.f116803m) {
                if (!this.f116804n) {
                    t();
                }
                if (this.f116791a != 26) {
                    throw new ParseException(this.f116797g - 1, 1, Character.valueOf(this.f116791a));
                }
            }
            this.f116796f = null;
            this.f116795e = null;
            return t11;
        } catch (IOException e11) {
            throw new ParseException(this.f116797g, e11);
        }
    }

    protected Number e(String str) throws ParseException {
        int i11;
        int i12;
        int length = str.length();
        boolean z11 = false;
        if (str.charAt(0) == '-') {
            if (!this.f116798h && length >= 3 && str.charAt(1) == '0') {
                throw new ParseException(this.f116797g, 6, str);
            }
            i11 = 20;
            i12 = 1;
        } else {
            if (!this.f116798h && length >= 2 && str.charAt(0) == '0') {
                throw new ParseException(this.f116797g, 6, str);
            }
            i11 = 19;
            i12 = 0;
        }
        int i13 = i12;
        if (length >= i11) {
            if (length > i11) {
                return new BigInteger(str, 10);
            }
            length--;
            z11 = true;
        }
        long jCharAt = 0;
        while (i12 < length) {
            jCharAt = (jCharAt * 10) + ((long) ('0' - str.charAt(i12)));
            i12++;
        }
        if (z11) {
            if (jCharAt <= -922337203685477580L) {
                if (jCharAt >= -922337203685477580L) {
                    if (i13 != 0) {
                    }
                }
                return new BigInteger(str, 10);
            }
            jCharAt = (jCharAt * 10) + ((long) ('0' - str.charAt(i12)));
        }
        if (i13 != 0) {
            return (!this.f116807q || jCharAt < -2147483648L) ? Long.valueOf(jCharAt) : Integer.valueOf((int) jCharAt);
        }
        long j11 = -jCharAt;
        return (!this.f116807q || j11 > 2147483647L) ? Long.valueOf(j11) : Integer.valueOf((int) j11);
    }

    protected abstract void f();

    protected <T> T g(f<T> fVar) throws ParseException {
        char c11;
        Object objC = fVar.c();
        if (this.f116791a != '[') {
            throw new RuntimeException("Internal Error");
        }
        f();
        if (this.f116791a == ',' && !this.f116802l) {
            throw new ParseException(this.f116797g, 0, Character.valueOf(this.f116791a));
        }
        while (true) {
            boolean z11 = false;
            while (true) {
                c11 = this.f116791a;
                if (c11 != '\t' && c11 != '\n' && c11 != '\r') {
                    if (c11 == 26) {
                        throw new ParseException(this.f116797g - 1, 3, "EOF");
                    }
                    if (c11 != ' ') {
                        if (c11 != ',') {
                            break;
                        }
                        if (z11 && !this.f116802l) {
                            throw new ParseException(this.f116797g, 0, Character.valueOf(this.f116791a));
                        }
                        f();
                        z11 = true;
                    }
                }
                f();
            }
            if (c11 != ':') {
                if (c11 == ']') {
                    if (z11 && !this.f116802l) {
                        throw new ParseException(this.f116797g, 0, Character.valueOf(this.f116791a));
                    }
                    f();
                    return fVar.b(objC);
                }
                if (c11 != '}') {
                    fVar.a(objC, i(fVar, f116787u));
                }
            }
            throw new ParseException(this.f116797g, 0, Character.valueOf(this.f116791a));
        }
    }

    protected <T> T h(f<T> fVar) throws ParseException {
        while (true) {
            char c11 = this.f116791a;
            if (c11 != '\t' && c11 != '\n') {
                switch (c11) {
                    case '\r':
                    case ' ':
                        break;
                    case '\"':
                    case '\'':
                        o();
                        return fVar.b(this.f116796f);
                    case '-':
                        Object objL = l(f116790x);
                        this.f116795e = objL;
                        return fVar.b(objL);
                    case 'N':
                        j(f116790x);
                        if (!this.f116799i) {
                            throw new ParseException(this.f116797g, 1, this.f116796f);
                        }
                        if ("NaN".equals(this.f116796f)) {
                            return fVar.b(Float.valueOf(Float.NaN));
                        }
                        if (this.f116800j) {
                            return fVar.b(this.f116796f);
                        }
                        throw new ParseException(this.f116797g, 1, this.f116796f);
                    case '[':
                        return (T) g(fVar);
                    case ']':
                    case '}':
                        break;
                    case 'f':
                        j(f116790x);
                        if ("false".equals(this.f116796f)) {
                            return fVar.b(Boolean.FALSE);
                        }
                        if (this.f116800j) {
                            return fVar.b(this.f116796f);
                        }
                        throw new ParseException(this.f116797g, 1, this.f116796f);
                    case 'n':
                        j(f116790x);
                        if (Address.ADDRESS_NULL_PLACEHOLDER.equals(this.f116796f)) {
                            return null;
                        }
                        if (this.f116800j) {
                            return fVar.b(this.f116796f);
                        }
                        throw new ParseException(this.f116797g, 1, this.f116796f);
                    case 't':
                        j(f116790x);
                        if ("true".equals(this.f116796f)) {
                            return fVar.b(Boolean.TRUE);
                        }
                        if (this.f116800j) {
                            return fVar.b(this.f116796f);
                        }
                        throw new ParseException(this.f116797g, 1, this.f116796f);
                    case '{':
                        return (T) m(fVar);
                    default:
                        switch (c11) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                Object objL2 = l(f116790x);
                                this.f116795e = objL2;
                                return fVar.b(objL2);
                            case ':':
                                break;
                            default:
                                j(f116790x);
                                if (this.f116800j) {
                                    return fVar.b(this.f116796f);
                                }
                                throw new ParseException(this.f116797g, 1, this.f116796f);
                        }
                        break;
                }
            }
            f();
        }
        throw new ParseException(this.f116797g, 0, Character.valueOf(this.f116791a));
    }

    protected Object i(f<?> fVar, boolean[] zArr) throws ParseException {
        while (true) {
            char c11 = this.f116791a;
            if (c11 != '\t' && c11 != '\n') {
                switch (c11) {
                    case '\r':
                    case ' ':
                        break;
                    case '\"':
                    case '\'':
                        o();
                        return this.f116796f;
                    case '-':
                        return l(zArr);
                    case 'N':
                        j(zArr);
                        if (!this.f116799i) {
                            throw new ParseException(this.f116797g, 1, this.f116796f);
                        }
                        if ("NaN".equals(this.f116796f)) {
                            return Float.valueOf(Float.NaN);
                        }
                        if (this.f116800j) {
                            return this.f116796f;
                        }
                        throw new ParseException(this.f116797g, 1, this.f116796f);
                    case '[':
                        return g(fVar.f(this.f116793c));
                    case ']':
                    case '}':
                        break;
                    case 'f':
                        j(zArr);
                        if ("false".equals(this.f116796f)) {
                            return Boolean.FALSE;
                        }
                        if (this.f116800j) {
                            return this.f116796f;
                        }
                        throw new ParseException(this.f116797g, 1, this.f116796f);
                    case 'n':
                        j(zArr);
                        if (Address.ADDRESS_NULL_PLACEHOLDER.equals(this.f116796f)) {
                            return null;
                        }
                        if (this.f116800j) {
                            return this.f116796f;
                        }
                        throw new ParseException(this.f116797g, 1, this.f116796f);
                    case 't':
                        j(zArr);
                        if ("true".equals(this.f116796f)) {
                            return Boolean.TRUE;
                        }
                        if (this.f116800j) {
                            return this.f116796f;
                        }
                        throw new ParseException(this.f116797g, 1, this.f116796f);
                    case '{':
                        return m(fVar.g(this.f116793c));
                    default:
                        switch (c11) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                return l(zArr);
                            case ':':
                                break;
                            default:
                                j(zArr);
                                if (this.f116800j) {
                                    return this.f116796f;
                                }
                                throw new ParseException(this.f116797g, 1, this.f116796f);
                        }
                        break;
                }
            }
            f();
        }
        throw new ParseException(this.f116797g, 0, Character.valueOf(this.f116791a));
    }

    protected abstract void j(boolean[] zArr);

    protected abstract void k();

    protected abstract Object l(boolean[] zArr);

    protected <T> T m(f<T> fVar) throws ParseException {
        if (this.f116791a != '{') {
            throw new RuntimeException("Internal Error");
        }
        Object objD = fVar.d();
        boolean z11 = false;
        while (true) {
            f();
            char c11 = this.f116791a;
            if (c11 != '\t' && c11 != '\n' && c11 != '\r' && c11 != ' ') {
                if (c11 != ',') {
                    if (c11 == ':' || c11 == '[' || c11 == ']' || c11 == '{') {
                        throw new ParseException(this.f116797g, 0, Character.valueOf(this.f116791a));
                    }
                    if (c11 == '}') {
                        if (z11 && !this.f116802l) {
                            throw new ParseException(this.f116797g, 0, Character.valueOf(this.f116791a));
                        }
                        f();
                        return fVar.b(objD);
                    }
                    if (c11 == '\"' || c11 == '\'') {
                        o();
                    } else {
                        j(f116788v);
                        if (!this.f116800j) {
                            throw new ParseException(this.f116797g, 1, this.f116796f);
                        }
                    }
                    String str = this.f116796f;
                    t();
                    char c12 = this.f116791a;
                    if (c12 != ':') {
                        if (c12 == 26) {
                            throw new ParseException(this.f116797g - 1, 3, null);
                        }
                        throw new ParseException(this.f116797g - 1, 0, Character.valueOf(this.f116791a));
                    }
                    k();
                    this.f116793c = str;
                    fVar.e(objD, str, i(fVar, f116789w));
                    this.f116793c = null;
                    t();
                    char c13 = this.f116791a;
                    if (c13 == '}') {
                        f();
                        return fVar.b(objD);
                    }
                    if (c13 == 26) {
                        throw new ParseException(this.f116797g - 1, 3, null);
                    }
                    if (c13 != ',') {
                        throw new ParseException(this.f116797g - 1, 1, Character.valueOf(this.f116791a));
                    }
                } else if (z11 && !this.f116802l) {
                    throw new ParseException(this.f116797g, 0, Character.valueOf(this.f116791a));
                }
                z11 = true;
            }
        }
    }

    abstract void n();

    protected abstract void o();

    protected void p() throws ParseException {
        char c11 = this.f116791a;
        while (true) {
            f();
            char c12 = this.f116791a;
            if (c12 == '\"' || c12 == '\'') {
                if (c11 == c12) {
                    f();
                    this.f116796f = this.f116794d.toString();
                    return;
                }
                this.f116794d.a(c12);
            } else if (c12 == '\\') {
                f();
                char c13 = this.f116791a;
                if (c13 == '\"') {
                    this.f116794d.a(CoreConstants.DOUBLE_QUOTE_CHAR);
                } else if (c13 == '\'') {
                    this.f116794d.a(CoreConstants.SINGLE_QUOTE_CHAR);
                } else if (c13 == '/') {
                    this.f116794d.a('/');
                } else if (c13 == '\\') {
                    this.f116794d.a(CoreConstants.ESCAPE_CHAR);
                } else if (c13 == 'b') {
                    this.f116794d.a('\b');
                } else if (c13 == 'f') {
                    this.f116794d.a('\f');
                } else if (c13 == 'n') {
                    this.f116794d.a('\n');
                } else if (c13 == 'r') {
                    this.f116794d.a('\r');
                } else if (c13 == 'x') {
                    this.f116794d.a(q(2));
                } else if (c13 == 't') {
                    this.f116794d.a('\t');
                } else if (c13 == 'u') {
                    this.f116794d.a(q(4));
                }
            } else if (c12 != 127) {
                switch (c12) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case '\b':
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                        if (!this.f116805o) {
                            throw new ParseException(this.f116797g, 0, Character.valueOf(this.f116791a));
                        }
                        continue;
                        break;
                    case 26:
                        throw new ParseException(this.f116797g - 1, 3, null);
                }
                this.f116794d.a(c12);
            } else if (this.f116805o) {
                continue;
            } else {
                if (this.f116808r) {
                    throw new ParseException(this.f116797g, 0, Character.valueOf(this.f116791a));
                }
                this.f116794d.a(c12);
            }
        }
    }

    protected char q(int i11) throws ParseException {
        int i12;
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = i13 * 16;
            f();
            char c11 = this.f116791a;
            if (c11 <= '9' && c11 >= '0') {
                i12 = c11 - '0';
            } else if (c11 <= 'F' && c11 >= 'A') {
                i12 = c11 - '7';
            } else {
                if (c11 < 'a' || c11 > 'f') {
                    if (c11 == 26) {
                        throw new ParseException(this.f116797g, 3, "EOF");
                    }
                    throw new ParseException(this.f116797g, 4, Character.valueOf(this.f116791a));
                }
                i12 = c11 - 'W';
            }
            i13 = i15 + i12;
        }
        return (char) i13;
    }

    protected void r() {
        while (true) {
            char c11 = this.f116791a;
            if (c11 < '0' || c11 > '9') {
                return;
            } else {
                n();
            }
        }
    }

    protected void s(boolean[] zArr) {
        while (true) {
            char c11 = this.f116791a;
            if (c11 == 26) {
                return;
            }
            if (c11 >= 0 && c11 < '~' && zArr[c11]) {
                return;
            } else {
                n();
            }
        }
    }

    protected void t() {
        while (true) {
            char c11 = this.f116791a;
            if (c11 > ' ' || c11 == 26) {
                return;
            } else {
                n();
            }
        }
    }
}
