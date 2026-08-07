package w4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087@\u0018\u0000  2\u00020\u0001:\u0001\u0010B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u00028@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0012\u0010\u0005R\u0017\u0010\u0018\u001a\u00020\u00168Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0005R\u0011\u0010\u001b\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001f\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Lw4/v;", "", "", "packedValue", "c", "(J)J", "", "k", "(J)Ljava/lang/String;", "", IntegerTokenConverter.CONVERTER_KEY, "(J)I", "other", "", DateTokenConverter.CONVERTER_KEY, "(JLjava/lang/Object;)Z", "a", "J", "f", "getRawType$annotations", "()V", "rawType", "Lw4/x;", "g", "type", "j", "(J)Z", "isSp", "", "h", "(J)F", "value", "b", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@vn0.b
public final class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final x[] f120744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f120745d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    /* JADX INFO: renamed from: w4.v$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Lw4/v$a;", "", "<init>", "()V", "Lw4/v;", "Unspecified", "J", "a", "()J", "getUnspecified-XSAIIZE$annotations", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return v.f120745d;
        }

        private Companion() {
        }
    }

    static {
        x.Companion companion = x.INSTANCE;
        f120744c = new x[]{x.d(companion.c()), x.d(companion.b()), x.d(companion.a())};
        f120745d = w.k(0L, Float.NaN);
    }

    private /* synthetic */ v(long j11) {
        this.packedValue = j11;
    }

    public static final /* synthetic */ v b(long j11) {
        return new v(j11);
    }

    public static boolean d(long j11, Object obj) {
        return (obj instanceof v) && j11 == ((v) obj).getPackedValue();
    }

    public static final boolean e(long j11, long j12) {
        return j11 == j12;
    }

    public static final long f(long j11) {
        return j11 & 1095216660480L;
    }

    public static final long g(long j11) {
        return f120744c[(int) (f(j11) >>> 32)].getType();
    }

    public static final float h(long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    public static int i(long j11) {
        return Long.hashCode(j11);
    }

    public static final boolean j(long j11) {
        return f(j11) == 4294967296L;
    }

    public static String k(long j11) {
        long jG = g(j11);
        x.Companion companion = x.INSTANCE;
        if (x.g(jG, companion.c())) {
            return "Unspecified";
        }
        if (x.g(jG, companion.b())) {
            return h(j11) + ".sp";
        }
        if (!x.g(jG, companion.a())) {
            return "Invalid";
        }
        return h(j11) + ".em";
    }

    public boolean equals(Object obj) {
        return d(this.packedValue, obj);
    }

    public int hashCode() {
        return i(this.packedValue);
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public String toString() {
        return k(this.packedValue);
    }

    public static long c(long j11) {
        return j11;
    }
}
