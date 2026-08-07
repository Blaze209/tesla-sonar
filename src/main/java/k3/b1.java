package k3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u000b"}, d2 = {"Lk3/b1;", "", "", "value", "D", "(I)I", "", "G", "(I)Ljava/lang/String;", Gender.FEMALE, "a", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@vn0.b
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f84722b = D(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f84723c = D(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f84724d = D(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f84725e = D(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f84726f = D(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f84727g = D(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f84728h = D(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f84729i = D(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f84730j = D(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f84731k = D(9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f84732l = D(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f84733m = D(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f84734n = D(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f84735o = D(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f84736p = D(14);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f84737q = D(15);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f84738r = D(16);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f84739s = D(17);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f84740t = D(18);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f84741u = D(19);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f84742v = D(20);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f84743w = D(21);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f84744x = D(22);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f84745y = D(23);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f84746z = D(24);
    private static final int A = D(25);
    private static final int B = D(26);
    private static final int C = D(27);
    private static final int D = D(28);

    /* JADX INFO: renamed from: k3.b1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b=\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001d\u0010\u0013\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001d\u0010\u0015\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001d\u0010\u0017\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001d\u0010\u0019\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001d\u0010\u001b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001d\u0010\u001d\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001d\u0010\u001f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u001d\u0010!\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u001d\u0010#\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u001d\u0010%\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u001d\u0010'\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u001d\u0010)\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\bR\u001d\u0010+\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u001d\u0010-\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\bR\u001d\u0010/\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b0\u0010\bR\u001d\u00101\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR\u001d\u00103\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\bR\u001d\u00105\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b6\u0010\bR\u001d\u00107\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR\u001d\u00109\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b:\u0010\bR\u001d\u0010;\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b<\u0010\bR\u001d\u0010=\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR\u001d\u0010?\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b@\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, d2 = {"Lk3/b1$a;", "", "<init>", "()V", "Lk3/b1;", "Clear", "I", "a", "()I", "Src", "x", "Dst", "g", "SrcOver", "B", "DstOver", "k", "SrcIn", "z", "DstIn", IntegerTokenConverter.CONVERTER_KEY, "SrcOut", "A", "DstOut", "j", "SrcAtop", "y", "DstAtop", "h", "Xor", "C", "Plus", "t", "Modulate", "q", com.swmansion.rnscreens.t.TAG, "v", "Overlay", "s", "Darken", "e", "Lighten", "o", "ColorDodge", DateTokenConverter.CONVERTER_KEY, "ColorBurn", "c", "Hardlight", "m", "Softlight", "w", "Difference", "f", "Exclusion", "l", "Multiply", "r", "Hue", "n", "Saturation", "u", "Color", "b", "Luminosity", "p", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int A() {
            return b1.f84729i;
        }

        public final int B() {
            return b1.f84725e;
        }

        public final int C() {
            return b1.f84733m;
        }

        public final int a() {
            return b1.f84722b;
        }

        public final int b() {
            return b1.C;
        }

        public final int c() {
            return b1.f84741u;
        }

        public final int d() {
            return b1.f84740t;
        }

        public final int e() {
            return b1.f84738r;
        }

        public final int f() {
            return b1.f84744x;
        }

        public final int g() {
            return b1.f84724d;
        }

        public final int h() {
            return b1.f84732l;
        }

        public final int i() {
            return b1.f84728h;
        }

        public final int j() {
            return b1.f84730j;
        }

        public final int k() {
            return b1.f84726f;
        }

        public final int l() {
            return b1.f84745y;
        }

        public final int m() {
            return b1.f84742v;
        }

        public final int n() {
            return b1.A;
        }

        public final int o() {
            return b1.f84739s;
        }

        public final int p() {
            return b1.D;
        }

        public final int q() {
            return b1.f84735o;
        }

        public final int r() {
            return b1.f84746z;
        }

        public final int s() {
            return b1.f84737q;
        }

        public final int t() {
            return b1.f84734n;
        }

        public final int u() {
            return b1.B;
        }

        public final int v() {
            return b1.f84736p;
        }

        public final int w() {
            return b1.f84743w;
        }

        public final int x() {
            return b1.f84723c;
        }

        public final int y() {
            return b1.f84731k;
        }

        public final int z() {
            return b1.f84727g;
        }

        private Companion() {
        }
    }

    public static final boolean E(int i11, int i12) {
        return i11 == i12;
    }

    public static int F(int i11) {
        return Integer.hashCode(i11);
    }

    public static String G(int i11) {
        if (E(i11, f84722b)) {
            return "Clear";
        }
        if (E(i11, f84723c)) {
            return "Src";
        }
        if (E(i11, f84724d)) {
            return "Dst";
        }
        if (E(i11, f84725e)) {
            return "SrcOver";
        }
        if (E(i11, f84726f)) {
            return "DstOver";
        }
        if (E(i11, f84727g)) {
            return "SrcIn";
        }
        if (E(i11, f84728h)) {
            return "DstIn";
        }
        if (E(i11, f84729i)) {
            return "SrcOut";
        }
        if (E(i11, f84730j)) {
            return "DstOut";
        }
        if (E(i11, f84731k)) {
            return "SrcAtop";
        }
        if (E(i11, f84732l)) {
            return "DstAtop";
        }
        if (E(i11, f84733m)) {
            return "Xor";
        }
        if (E(i11, f84734n)) {
            return "Plus";
        }
        if (E(i11, f84735o)) {
            return "Modulate";
        }
        if (E(i11, f84736p)) {
            return com.swmansion.rnscreens.t.TAG;
        }
        if (E(i11, f84737q)) {
            return "Overlay";
        }
        if (E(i11, f84738r)) {
            return "Darken";
        }
        if (E(i11, f84739s)) {
            return "Lighten";
        }
        if (E(i11, f84740t)) {
            return "ColorDodge";
        }
        if (E(i11, f84741u)) {
            return "ColorBurn";
        }
        if (E(i11, f84742v)) {
            return "HardLight";
        }
        if (E(i11, f84743w)) {
            return "Softlight";
        }
        if (E(i11, f84744x)) {
            return "Difference";
        }
        if (E(i11, f84745y)) {
            return "Exclusion";
        }
        if (E(i11, f84746z)) {
            return "Multiply";
        }
        if (E(i11, A)) {
            return "Hue";
        }
        if (E(i11, B)) {
            return "Saturation";
        }
        if (E(i11, C)) {
            return "Color";
        }
        return E(i11, D) ? "Luminosity" : "Unknown";
    }

    public static int D(int i11) {
        return i11;
    }
}
