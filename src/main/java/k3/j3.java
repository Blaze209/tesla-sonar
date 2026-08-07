package k3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Lk3/j3;", "", "", "value", "g", "(I)I", "", "k", "(I)Ljava/lang/String;", "j", "other", "", "h", "(ILjava/lang/Object;)Z", "a", "I", "getValue", "()I", "b", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@vn0.b
public final class j3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f84805c = g(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f84806d = g(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f84807e = g(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f84808f = g(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f84809g = g(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: k3.j3$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Lk3/j3$a;", "", "<init>", "()V", "Lk3/j3;", "Argb8888", "I", "b", "()I", "Alpha8", "a", "Rgb565", "e", "F16", "c", "Gpu", DateTokenConverter.CONVERTER_KEY, "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return j3.f84806d;
        }

        public final int b() {
            return j3.f84805c;
        }

        public final int c() {
            return j3.f84808f;
        }

        public final int d() {
            return j3.f84809g;
        }

        public final int e() {
            return j3.f84807e;
        }

        private Companion() {
        }
    }

    private /* synthetic */ j3(int i11) {
        this.value = i11;
    }

    public static final /* synthetic */ j3 f(int i11) {
        return new j3(i11);
    }

    public static boolean h(int i11, Object obj) {
        return (obj instanceof j3) && i11 == ((j3) obj).getValue();
    }

    public static final boolean i(int i11, int i12) {
        return i11 == i12;
    }

    public static int j(int i11) {
        return Integer.hashCode(i11);
    }

    public static String k(int i11) {
        if (i(i11, f84805c)) {
            return "Argb8888";
        }
        if (i(i11, f84806d)) {
            return "Alpha8";
        }
        if (i(i11, f84807e)) {
            return "Rgb565";
        }
        if (i(i11, f84808f)) {
            return "F16";
        }
        return i(i11, f84809g) ? "Gpu" : "Unknown";
    }

    public boolean equals(Object obj) {
        return h(this.value, obj);
    }

    public int hashCode() {
        return j(this.value);
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public String toString() {
        return k(this.value);
    }

    public static int g(int i11) {
        return i11;
    }
}
