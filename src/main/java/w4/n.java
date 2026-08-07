package w4;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087@\u0018\u0000  2\u00020\u0001:\u0001\u0018B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\rJ\u0016\u0010\u000f\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0005J\u000f\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001e\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Lw4/n;", "", "", "packedValue", "c", "(J)J", "", "x", "y", DateTokenConverter.CONVERTER_KEY, "(JII)J", "other", "k", "(JJ)J", "l", "n", "", "m", "(J)Ljava/lang/String;", "j", "(J)I", "", "f", "(JLjava/lang/Object;)Z", "a", "J", "getPackedValue$annotations", "()V", "h", "getX$annotations", IntegerTokenConverter.CONVERTER_KEY, "getY$annotations", "b", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@vn0.b
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f120731c = c(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    /* JADX INFO: renamed from: w4.n$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Lw4/n$a;", "", "<init>", "()V", "Lw4/n;", "Zero", "J", "a", "()J", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return n.f120731c;
        }

        private Companion() {
        }
    }

    private /* synthetic */ n(long j11) {
        this.packedValue = j11;
    }

    public static final /* synthetic */ n b(long j11) {
        return new n(j11);
    }

    public static final long d(long j11, int i11, int i12) {
        return c((((long) i11) << 32) | (((long) i12) & 4294967295L));
    }

    public static /* synthetic */ long e(long j11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = (int) (j11 >> 32);
        }
        if ((i13 & 2) != 0) {
            i12 = (int) (4294967295L & j11);
        }
        return d(j11, i11, i12);
    }

    public static boolean f(long j11, Object obj) {
        return (obj instanceof n) && j11 == ((n) obj).getPackedValue();
    }

    public static final boolean g(long j11, long j12) {
        return j11 == j12;
    }

    public static final int h(long j11) {
        return (int) (j11 >> 32);
    }

    public static final int i(long j11) {
        return (int) (j11 & 4294967295L);
    }

    public static int j(long j11) {
        return Long.hashCode(j11);
    }

    public static final long k(long j11, long j12) {
        return c((((long) (((int) (j11 >> 32)) - ((int) (j12 >> 32)))) << 32) | (((long) (((int) (j11 & 4294967295L)) - ((int) (j12 & 4294967295L)))) & 4294967295L));
    }

    public static final long l(long j11, long j12) {
        return c((((long) (((int) (j11 >> 32)) + ((int) (j12 >> 32)))) << 32) | (((long) (((int) (j11 & 4294967295L)) + ((int) (j12 & 4294967295L)))) & 4294967295L));
    }

    public static String m(long j11) {
        return CoreConstants.LEFT_PARENTHESIS_CHAR + h(j11) + ", " + i(j11) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public static final long n(long j11) {
        int i11 = -((int) (j11 >> 32));
        return c((((long) (-((int) (j11 & 4294967295L)))) & 4294967295L) | (((long) i11) << 32));
    }

    public boolean equals(Object obj) {
        return f(this.packedValue, obj);
    }

    public int hashCode() {
        return j(this.packedValue);
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public String toString() {
        return m(this.packedValue);
    }

    public static long c(long j11) {
        return j11;
    }
}
