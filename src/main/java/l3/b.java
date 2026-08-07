package l3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\t8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\f\u0010\u000b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Ll3/b;", "", "", "packedValue", DateTokenConverter.CONVERTER_KEY, "(J)J", "", "h", "(J)Ljava/lang/String;", "", "g", "(J)I", "f", "getComponentCount$annotations", "()V", "componentCount", "a", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@vn0.b
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f89502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f89503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f89504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f89505e;

    /* JADX INFO: renamed from: l3.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Ll3/b$a;", "", "<init>", "()V", "Ll3/b;", "Rgb", "J", "b", "()J", "Xyz", "c", "Lab", "a", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return b.f89504d;
        }

        public final long b() {
            return b.f89502b;
        }

        public final long c() {
            return b.f89503c;
        }

        private Companion() {
        }
    }

    static {
        long j11 = 3;
        long j12 = j11 << 32;
        f89502b = d((((long) 0) & 4294967295L) | j12);
        f89503c = d((((long) 1) & 4294967295L) | j12);
        f89504d = d(j12 | (((long) 2) & 4294967295L));
        f89505e = d((j11 & 4294967295L) | (((long) 4) << 32));
    }

    public static final boolean e(long j11, long j12) {
        return j11 == j12;
    }

    public static final int f(long j11) {
        return (int) (j11 >> 32);
    }

    public static int g(long j11) {
        return Long.hashCode(j11);
    }

    public static String h(long j11) {
        if (e(j11, f89502b)) {
            return "Rgb";
        }
        if (e(j11, f89503c)) {
            return "Xyz";
        }
        if (e(j11, f89504d)) {
            return "Lab";
        }
        return e(j11, f89505e) ? "Cmyk" : "Unknown";
    }

    public static long d(long j11) {
        return j11;
    }
}
