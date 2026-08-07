package t4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Lt4/j;", "", "", "value", IntegerTokenConverter.CONVERTER_KEY, "(I)I", "", "m", "(I)Ljava/lang/String;", "l", "other", "", "j", "(ILjava/lang/Object;)Z", "a", "I", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@vn0.b
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f112331c = i(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f112332d = i(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f112333e = i(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f112334f = i(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f112335g = i(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f112336h = i(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f112337i = i(Integer.MIN_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: t4.j$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001d\u0010\u0013\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Lt4/j$a;", "", "<init>", "()V", "Lt4/j;", "Left", "I", DateTokenConverter.CONVERTER_KEY, "()I", "Right", "e", "Center", "a", "Justify", "c", "Start", "f", "End", "b", "Unspecified", "g", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return j.f112333e;
        }

        public final int b() {
            return j.f112336h;
        }

        public final int c() {
            return j.f112334f;
        }

        public final int d() {
            return j.f112331c;
        }

        public final int e() {
            return j.f112332d;
        }

        public final int f() {
            return j.f112335g;
        }

        public final int g() {
            return j.f112337i;
        }

        private Companion() {
        }
    }

    private /* synthetic */ j(int i11) {
        this.value = i11;
    }

    public static final /* synthetic */ j h(int i11) {
        return new j(i11);
    }

    public static boolean j(int i11, Object obj) {
        return (obj instanceof j) && i11 == ((j) obj).getValue();
    }

    public static final boolean k(int i11, int i12) {
        return i11 == i12;
    }

    public static int l(int i11) {
        return Integer.hashCode(i11);
    }

    public static String m(int i11) {
        if (k(i11, f112331c)) {
            return "Left";
        }
        if (k(i11, f112332d)) {
            return "Right";
        }
        if (k(i11, f112333e)) {
            return "Center";
        }
        if (k(i11, f112334f)) {
            return "Justify";
        }
        if (k(i11, f112335g)) {
            return "Start";
        }
        if (k(i11, f112336h)) {
            return "End";
        }
        return k(i11, f112337i) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return j(this.value, obj);
    }

    public int hashCode() {
        return l(this.value);
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public String toString() {
        return m(this.value);
    }

    public static int i(int i11) {
        return i11;
    }
}
