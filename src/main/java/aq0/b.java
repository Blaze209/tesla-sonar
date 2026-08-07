package aq0;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements Serializable {
    public static final b A;
    public static final b B;
    public static final b C;
    public static final b D;
    public static final b E;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f14862t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f14863u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f14864v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f14865w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f14866x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final b f14867y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final b f14868z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f14869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f14870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f14871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Character f14872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f14873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Character f14874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String[] f14875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String[] f14876h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f14877i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f14878j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f14879k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f14880l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Character f14881m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f14882n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final i f14883o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f14884p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f14885q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f14886r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f14887s;

    /* JADX INFO: renamed from: aq0.b$b, reason: collision with other inner class name */
    public static class C0258b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f14888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f14889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Character f14890c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f14891d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private f f14892e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Character f14893f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String[] f14894g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String[] f14895h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f14896i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f14897j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f14898k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f14899l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Character f14900m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f14901n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private i f14902o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private String f14903p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f14904q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f14905r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f14906s;

        private C0258b(b bVar) {
            this.f14891d = bVar.f14873e;
            this.f14900m = bVar.f14881m;
            this.f14902o = bVar.f14883o;
            this.f14890c = bVar.f14872d;
            this.f14893f = bVar.f14874f;
            this.f14898k = bVar.f14879k;
            this.f14888a = bVar.f14870b;
            this.f14896i = bVar.f14877i;
            this.f14903p = bVar.f14884p;
            this.f14899l = bVar.f14880l;
            this.f14894g = bVar.f14876h;
            this.f14895h = bVar.f14875g;
            this.f14904q = bVar.f14885q;
            this.f14897j = bVar.f14878j;
            this.f14905r = bVar.f14886r;
            this.f14906s = bVar.f14887s;
            this.f14889b = bVar.f14871c;
            this.f14901n = bVar.f14882n;
            this.f14892e = bVar.f14869a;
        }

        public static C0258b u(b bVar) {
            return new C0258b(bVar);
        }

        public C0258b A(String... strArr) {
            this.f14895h = (String[]) b.x(strArr);
            return this;
        }

        public C0258b B(boolean z11) {
            this.f14896i = z11;
            return this;
        }

        public C0258b C(boolean z11) {
            this.f14898k = z11;
            return this;
        }

        public C0258b D(String str) {
            this.f14899l = str;
            this.f14901n = this.f14900m + str + this.f14900m;
            return this;
        }

        public C0258b E(Character ch2) {
            if (b.U(ch2)) {
                throw new IllegalArgumentException("The quoteChar cannot be a line break");
            }
            this.f14900m = ch2;
            return this;
        }

        public C0258b F(i iVar) {
            this.f14902o = iVar;
            return this;
        }

        public C0258b G(char c11) {
            this.f14903p = String.valueOf(c11);
            return this;
        }

        public C0258b H(String str) {
            this.f14903p = str;
            return this;
        }

        public C0258b I(boolean z11) {
            this.f14904q = z11;
            return this;
        }

        public C0258b J(boolean z11) {
            this.f14906s = z11;
            return this;
        }

        public b t() {
            return new b(this);
        }

        public C0258b v(boolean z11) {
            this.f14888a = z11;
            return this;
        }

        public C0258b w(char c11) {
            return x(String.valueOf(c11));
        }

        public C0258b x(String str) {
            if (b.z(str)) {
                throw new IllegalArgumentException("The delimiter cannot be a line break");
            }
            if (str.isEmpty()) {
                throw new IllegalArgumentException("The delimiter cannot be empty");
            }
            this.f14891d = str;
            return this;
        }

        public C0258b y(char c11) {
            z(Character.valueOf(c11));
            return this;
        }

        public C0258b z(Character ch2) {
            if (b.U(ch2)) {
                throw new IllegalArgumentException("The escape character cannot be a line break");
            }
            this.f14893f = ch2;
            return this;
        }
    }

    static {
        Character ch2 = e.f14927a;
        b bVar = new b(",", ch2, null, null, null, false, true, "\r\n", null, null, null, false, false, false, false, false, false, f.ALLOW_ALL);
        f14862t = bVar;
        f14863u = bVar.w().B(false).v(true).t();
        f14864v = bVar.w().w('|').y(CoreConstants.ESCAPE_CHAR).E(ch2).G('\n').t();
        f14865w = bVar.w().x(",").E(ch2).G('\n').t();
        C0258b c0258bE = bVar.w().x(",").z(ch2).E(ch2);
        i iVar = i.MINIMAL;
        f14866x = c0258bE.F(iVar).I(false).t();
        f14867y = bVar.w().w('\t').z(ch2).E(ch2).F(iVar).I(false).t();
        C0258b c0258bD = bVar.w().w('\t').y(CoreConstants.ESCAPE_CHAR).B(false).E(null).G('\n').D("\\N");
        i iVar2 = i.ALL_NON_NULL;
        f14868z = c0258bD.F(iVar2).t();
        A = bVar.w().x(",").y(CoreConstants.ESCAPE_CHAR).B(false).E(ch2).D("\\N").J(true).H(System.lineSeparator()).F(iVar).t();
        B = bVar.w().x(",").z(null).B(false).E(ch2).G('\n').D("").F(iVar2).t();
        C = bVar.w().w('\t').y(CoreConstants.ESCAPE_CHAR).B(false).E(null).G('\n').D("\\N").F(iVar2).t();
        D = bVar.w().B(false).t();
        E = bVar.w().w('\t').C(true).t();
    }

    static boolean Q(String str) {
        return str == null || str.trim().isEmpty();
    }

    private static boolean T(char c11) {
        return c11 == '\n' || c11 == '\r';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean U(Character ch2) {
        return ch2 != null && T(ch2.charValue());
    }

    static String[] X(final Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        String[] strArr = new String[objArr.length];
        Arrays.setAll(strArr, new IntFunction() { // from class: aq0.a
            @Override // java.util.function.IntFunction
            public final Object apply(int i11) {
                return Objects.toString(objArr[i11], null);
            }
        });
        return strArr;
    }

    private void Z() {
        if (z(this.f14873e)) {
            throw new IllegalArgumentException("The delimiter cannot be a line break");
        }
        Character ch2 = this.f14881m;
        if (ch2 != null && y(this.f14873e, ch2.charValue())) {
            throw new IllegalArgumentException("The quoteChar character and the delimiter cannot be the same ('" + this.f14881m + "')");
        }
        Character ch3 = this.f14874f;
        if (ch3 != null && y(this.f14873e, ch3.charValue())) {
            throw new IllegalArgumentException("The escape character and the delimiter cannot be the same ('" + this.f14874f + "')");
        }
        Character ch4 = this.f14872d;
        if (ch4 != null && y(this.f14873e, ch4.charValue())) {
            throw new IllegalArgumentException("The comment start character and the delimiter cannot be the same ('" + this.f14872d + "')");
        }
        Character ch5 = this.f14881m;
        if (ch5 != null && ch5.equals(this.f14872d)) {
            throw new IllegalArgumentException("The comment start character and the quoteChar cannot be the same ('" + this.f14872d + "')");
        }
        Character ch6 = this.f14874f;
        if (ch6 != null && ch6.equals(this.f14872d)) {
            throw new IllegalArgumentException("The comment start and the escape character cannot be the same ('" + this.f14872d + "')");
        }
        if (this.f14874f == null && this.f14883o == i.NONE) {
            throw new IllegalArgumentException("No quotes mode set but no escape character is set");
        }
        if (this.f14875g == null || this.f14869a == f.ALLOW_ALL) {
            return;
        }
        HashSet hashSet = new HashSet(this.f14875g.length);
        boolean z11 = this.f14869a == f.ALLOW_EMPTY;
        for (String str : this.f14875g) {
            boolean zQ = Q(str);
            if (!hashSet.add(zQ ? "" : str) && (!zQ || !z11)) {
                throw new IllegalArgumentException(String.format("The header contains a duplicate name: \"%s\" in %s. If this is valid then use CSVFormat.Builder.setDuplicateHeaderMode().", str, Arrays.toString(this.f14875g)));
            }
        }
    }

    @SafeVarargs
    static <T> T[] x(T... tArr) {
        if (tArr == null) {
            return null;
        }
        return (T[]) ((Object[]) tArr.clone());
    }

    private static boolean y(String str, char c11) {
        Objects.requireNonNull(str, "source");
        return str.indexOf(c11) >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean z(String str) {
        return y(str, '\r') || y(str, '\n');
    }

    b A() {
        return w().t();
    }

    public boolean B() {
        return this.f14870b;
    }

    public Character C() {
        return this.f14872d;
    }

    public String D() {
        return this.f14873e;
    }

    public f E() {
        return this.f14869a;
    }

    public Character F() {
        return this.f14874f;
    }

    public String[] G() {
        String[] strArr = this.f14875g;
        if (strArr != null) {
            return (String[]) strArr.clone();
        }
        return null;
    }

    public boolean H() {
        return this.f14877i;
    }

    public boolean I() {
        return this.f14878j;
    }

    public boolean J() {
        return this.f14879k;
    }

    public String K() {
        return this.f14880l;
    }

    public Character L() {
        return this.f14881m;
    }

    public i M() {
        return this.f14883o;
    }

    public boolean N() {
        return this.f14885q;
    }

    public boolean O() {
        return this.f14886r;
    }

    public boolean P() {
        return this.f14887s;
    }

    public boolean R() {
        return this.f14872d != null;
    }

    public boolean S() {
        return this.f14874f != null;
    }

    public boolean V() {
        return this.f14880l != null;
    }

    public boolean W() {
        return this.f14881m != null;
    }

    String Y(String str) {
        return P() ? str.trim() : str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f14869a == bVar.f14869a && this.f14870b == bVar.f14870b && this.f14871c == bVar.f14871c && Objects.equals(this.f14872d, bVar.f14872d) && Objects.equals(this.f14873e, bVar.f14873e) && Objects.equals(this.f14874f, bVar.f14874f) && Arrays.equals(this.f14875g, bVar.f14875g) && Arrays.equals(this.f14876h, bVar.f14876h) && this.f14877i == bVar.f14877i && this.f14878j == bVar.f14878j && this.f14879k == bVar.f14879k && Objects.equals(this.f14880l, bVar.f14880l) && Objects.equals(this.f14881m, bVar.f14881m) && this.f14883o == bVar.f14883o && Objects.equals(this.f14882n, bVar.f14882n) && Objects.equals(this.f14884p, bVar.f14884p) && this.f14885q == bVar.f14885q && this.f14886r == bVar.f14886r && this.f14887s == bVar.f14887s) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((Arrays.hashCode(this.f14875g) + 31) * 31) + Arrays.hashCode(this.f14876h)) * 31) + Objects.hash(this.f14869a, Boolean.valueOf(this.f14870b), Boolean.valueOf(this.f14871c), this.f14872d, this.f14873e, this.f14874f, Boolean.valueOf(this.f14877i), Boolean.valueOf(this.f14878j), Boolean.valueOf(this.f14879k), this.f14880l, this.f14881m, this.f14883o, this.f14882n, this.f14884p, Boolean.valueOf(this.f14885q), Boolean.valueOf(this.f14886r), Boolean.valueOf(this.f14887s));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Delimiter=<");
        sb2.append(this.f14873e);
        sb2.append('>');
        if (S()) {
            sb2.append(' ');
            sb2.append("Escape=<");
            sb2.append(this.f14874f);
            sb2.append('>');
        }
        if (W()) {
            sb2.append(' ');
            sb2.append("QuoteChar=<");
            sb2.append(this.f14881m);
            sb2.append('>');
        }
        if (this.f14883o != null) {
            sb2.append(' ');
            sb2.append("QuoteMode=<");
            sb2.append(this.f14883o);
            sb2.append('>');
        }
        if (R()) {
            sb2.append(' ');
            sb2.append("CommentStart=<");
            sb2.append(this.f14872d);
            sb2.append('>');
        }
        if (V()) {
            sb2.append(' ');
            sb2.append("NullString=<");
            sb2.append(this.f14880l);
            sb2.append('>');
        }
        if (this.f14884p != null) {
            sb2.append(' ');
            sb2.append("RecordSeparator=<");
            sb2.append(this.f14884p);
            sb2.append('>');
        }
        if (H()) {
            sb2.append(" EmptyLines:ignored");
        }
        if (J()) {
            sb2.append(" SurroundingSpaces:ignored");
        }
        if (I()) {
            sb2.append(" IgnoreHeaderCase:ignored");
        }
        sb2.append(" SkipHeaderRecord:");
        sb2.append(this.f14885q);
        if (this.f14876h != null) {
            sb2.append(' ');
            sb2.append("HeaderComments:");
            sb2.append(Arrays.toString(this.f14876h));
        }
        if (this.f14875g != null) {
            sb2.append(' ');
            sb2.append("Header:");
            sb2.append(Arrays.toString(this.f14875g));
        }
        return sb2.toString();
    }

    public C0258b w() {
        return C0258b.u(this);
    }

    private b(C0258b c0258b) {
        this.f14873e = c0258b.f14891d;
        this.f14881m = c0258b.f14900m;
        this.f14883o = c0258b.f14902o;
        this.f14872d = c0258b.f14890c;
        this.f14874f = c0258b.f14893f;
        this.f14879k = c0258b.f14898k;
        this.f14870b = c0258b.f14888a;
        this.f14877i = c0258b.f14896i;
        this.f14884p = c0258b.f14903p;
        this.f14880l = c0258b.f14899l;
        this.f14876h = c0258b.f14894g;
        this.f14875g = c0258b.f14895h;
        this.f14885q = c0258b.f14904q;
        this.f14878j = c0258b.f14897j;
        this.f14886r = c0258b.f14905r;
        this.f14887s = c0258b.f14906s;
        this.f14871c = c0258b.f14889b;
        this.f14882n = c0258b.f14901n;
        this.f14869a = c0258b.f14892e;
        Z();
    }

    private b(String str, Character ch2, i iVar, Character ch3, Character ch4, boolean z11, boolean z12, String str2, String str3, Object[] objArr, String[] strArr, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, f fVar) {
        this.f14873e = str;
        this.f14881m = ch2;
        this.f14883o = iVar;
        this.f14872d = ch3;
        this.f14874f = ch4;
        this.f14879k = z11;
        this.f14870b = z14;
        this.f14877i = z12;
        this.f14884p = str2;
        this.f14880l = str3;
        this.f14876h = X(objArr);
        this.f14875g = (String[]) x(strArr);
        this.f14885q = z13;
        this.f14878j = z15;
        this.f14886r = z17;
        this.f14887s = z16;
        this.f14871c = z18;
        this.f14882n = ch2 + str3 + ch2;
        this.f14869a = fVar;
        Z();
    }
}
