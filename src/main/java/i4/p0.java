package i4;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0087@\u0018\u0000 '2\u00020\u0001:\u0001\u0016B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\tJ\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u001b\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u001d\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\u001f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\"\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010$\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0011\u0010&\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Li4/p0;", "", "", "packedValue", "c", "(J)J", "other", "", "p", "(JJ)Z", DateTokenConverter.CONVERTER_KEY, "", "offset", "e", "(JI)Z", "", "q", "(J)Ljava/lang/String;", "o", "(J)I", "f", "(JLjava/lang/Object;)Z", "a", "J", "n", "start", IntegerTokenConverter.CONVERTER_KEY, "end", "l", "min", "k", "max", "h", "(J)Z", "collapsed", "m", "reversed", "j", "length", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@vn0.b
public final class p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f75782c = q0.a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    /* JADX INFO: renamed from: i4.p0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Li4/p0$a;", "", "<init>", "()V", "Li4/p0;", "Zero", "J", "a", "()J", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return p0.f75782c;
        }

        private Companion() {
        }
    }

    private /* synthetic */ p0(long j11) {
        this.packedValue = j11;
    }

    public static final /* synthetic */ p0 b(long j11) {
        return new p0(j11);
    }

    public static final boolean d(long j11, long j12) {
        return l(j11) <= l(j12) && k(j12) <= k(j11);
    }

    public static final boolean e(long j11, int i11) {
        return i11 < k(j11) && l(j11) <= i11;
    }

    public static boolean f(long j11, Object obj) {
        return (obj instanceof p0) && j11 == ((p0) obj).getPackedValue();
    }

    public static final boolean g(long j11, long j12) {
        return j11 == j12;
    }

    public static final boolean h(long j11) {
        return n(j11) == i(j11);
    }

    public static final int i(long j11) {
        return (int) (j11 & 4294967295L);
    }

    public static final int j(long j11) {
        return k(j11) - l(j11);
    }

    public static final int k(long j11) {
        return n(j11) > i(j11) ? n(j11) : i(j11);
    }

    public static final int l(long j11) {
        return n(j11) > i(j11) ? i(j11) : n(j11);
    }

    public static final boolean m(long j11) {
        return n(j11) > i(j11);
    }

    public static final int n(long j11) {
        return (int) (j11 >> 32);
    }

    public static int o(long j11) {
        return Long.hashCode(j11);
    }

    public static final boolean p(long j11, long j12) {
        return l(j11) < k(j12) && l(j12) < k(j11);
    }

    public static String q(long j11) {
        return "TextRange(" + n(j11) + ", " + i(j11) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return f(this.packedValue, obj);
    }

    public int hashCode() {
        return o(this.packedValue);
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public String toString() {
        return q(this.packedValue);
    }

    public static long c(long j11) {
        return j11;
    }
}
