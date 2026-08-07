package w4;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Lw4/x;", "", "", "type", "e", "(J)J", "", IntegerTokenConverter.CONVERTER_KEY, "(J)Ljava/lang/String;", "", "h", "(J)I", "other", "", "f", "(JLjava/lang/Object;)Z", "a", "J", "b", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@vn0.b
public final class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f120748c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f120749d = e(4294967296L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f120750e = e(8589934592L);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long type;

    /* JADX INFO: renamed from: w4.x$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lw4/x$a;", "", "<init>", "()V", "Lw4/x;", "Unspecified", "J", "c", "()J", "Sp", "b", "Em", "a", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return x.f120750e;
        }

        public final long b() {
            return x.f120749d;
        }

        public final long c() {
            return x.f120748c;
        }

        private Companion() {
        }
    }

    private /* synthetic */ x(long j11) {
        this.type = j11;
    }

    public static final /* synthetic */ x d(long j11) {
        return new x(j11);
    }

    public static boolean f(long j11, Object obj) {
        return (obj instanceof x) && j11 == ((x) obj).getType();
    }

    public static final boolean g(long j11, long j12) {
        return j11 == j12;
    }

    public static int h(long j11) {
        return Long.hashCode(j11);
    }

    public static String i(long j11) {
        if (g(j11, f120748c)) {
            return "Unspecified";
        }
        if (g(j11, f120749d)) {
            return "Sp";
        }
        return g(j11, f120750e) ? "Em" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.type, obj);
    }

    public int hashCode() {
        return h(this.type);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final /* synthetic */ long getType() {
        return this.type;
    }

    public String toString() {
        return i(this.type);
    }

    public static long e(long j11) {
        return j11;
    }
}
