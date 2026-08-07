package o4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Lo4/y;", "", "", "value", "l", "(I)I", "", "p", "(I)Ljava/lang/String;", "o", "other", "", "m", "(ILjava/lang/Object;)Z", "a", "I", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@vn0.b
public final class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f96519c = l(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f96520d = l(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f96521e = l(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f96522f = l(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f96523g = l(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f96524h = l(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f96525i = l(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f96526j = l(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f96527k = l(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f96528l = l(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: o4.y$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR&\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR&\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR&\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR&\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR&\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR&\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\bR&\u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\bR&\u0010\"\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\"\u0010\u0006\u0012\u0004\b$\u0010\u0003\u001a\u0004\b#\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Lo4/y$a;", "", "<init>", "()V", "Lo4/y;", "Unspecified", "I", IntegerTokenConverter.CONVERTER_KEY, "()I", "getUnspecified-PjHm6EE$annotations", "Text", "h", "getText-PjHm6EE$annotations", "Ascii", "a", "getAscii-PjHm6EE$annotations", "Number", DateTokenConverter.CONVERTER_KEY, "getNumber-PjHm6EE$annotations", "Phone", "g", "getPhone-PjHm6EE$annotations", "Uri", "j", "getUri-PjHm6EE$annotations", "Email", "c", "getEmail-PjHm6EE$annotations", "Password", "f", "getPassword-PjHm6EE$annotations", "NumberPassword", "e", "getNumberPassword-PjHm6EE$annotations", "Decimal", "b", "getDecimal-PjHm6EE$annotations", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return y.f96521e;
        }

        public final int b() {
            return y.f96528l;
        }

        public final int c() {
            return y.f96525i;
        }

        public final int d() {
            return y.f96522f;
        }

        public final int e() {
            return y.f96527k;
        }

        public final int f() {
            return y.f96526j;
        }

        public final int g() {
            return y.f96523g;
        }

        public final int h() {
            return y.f96520d;
        }

        public final int i() {
            return y.f96519c;
        }

        public final int j() {
            return y.f96524h;
        }

        private Companion() {
        }
    }

    private /* synthetic */ y(int i11) {
        this.value = i11;
    }

    public static final /* synthetic */ y k(int i11) {
        return new y(i11);
    }

    public static boolean m(int i11, Object obj) {
        return (obj instanceof y) && i11 == ((y) obj).getValue();
    }

    public static final boolean n(int i11, int i12) {
        return i11 == i12;
    }

    public static int o(int i11) {
        return Integer.hashCode(i11);
    }

    public static String p(int i11) {
        if (n(i11, f96519c)) {
            return "Unspecified";
        }
        if (n(i11, f96520d)) {
            return "Text";
        }
        if (n(i11, f96521e)) {
            return "Ascii";
        }
        if (n(i11, f96522f)) {
            return "Number";
        }
        if (n(i11, f96523g)) {
            return "Phone";
        }
        if (n(i11, f96524h)) {
            return "Uri";
        }
        if (n(i11, f96525i)) {
            return "Email";
        }
        if (n(i11, f96526j)) {
            return "Password";
        }
        if (n(i11, f96527k)) {
            return "NumberPassword";
        }
        return n(i11, f96528l) ? "Decimal" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m(this.value, obj);
    }

    public int hashCode() {
        return o(this.value);
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public String toString() {
        return p(this.value);
    }

    private static int l(int i11) {
        return i11;
    }
}
