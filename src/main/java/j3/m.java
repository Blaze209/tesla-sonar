package j3;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087@\u0018\u0000 &2\u00020\u0001:\u0001\u001aB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0006H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\b\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001a\u0010%\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b$\u0010\u001d\u001a\u0004\b#\u0010\u001f\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Lj3/m;", "", "", "packedValue", DateTokenConverter.CONVERTER_KEY, "(J)J", "", Snapshot.WIDTH, Snapshot.HEIGHT, "e", "(JFF)J", "", "m", "(J)Z", "operand", "n", "(JF)J", "", "o", "(J)Ljava/lang/String;", "", "l", "(J)I", "other", "g", "(JLjava/lang/Object;)Z", "a", "J", "getPackedValue$annotations", "()V", "k", "(J)F", "getWidth$annotations", IntegerTokenConverter.CONVERTER_KEY, "getHeight$annotations", "j", "getMinDimension$annotations", "minDimension", "b", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@vn0.b
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f82459c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f82460d = d(9205357640488583168L);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    /* JADX INFO: renamed from: j3.m$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lj3/m$a;", "", "<init>", "()V", "Lj3/m;", "Zero", "J", "b", "()J", "getZero-NH-jbRc$annotations", "Unspecified", "a", "getUnspecified-NH-jbRc$annotations", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return m.f82460d;
        }

        public final long b() {
            return m.f82459c;
        }

        private Companion() {
        }
    }

    private /* synthetic */ m(long j11) {
        this.packedValue = j11;
    }

    public static final /* synthetic */ m c(long j11) {
        return new m(j11);
    }

    public static final long e(long j11, float f11, float f12) {
        return d((((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L));
    }

    public static /* synthetic */ long f(long j11, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = Float.intBitsToFloat((int) (j11 >> 32));
        }
        if ((i11 & 2) != 0) {
            f12 = Float.intBitsToFloat((int) (4294967295L & j11));
        }
        return e(j11, f11, f12);
    }

    public static boolean g(long j11, Object obj) {
        return (obj instanceof m) && j11 == ((m) obj).getPackedValue();
    }

    public static final boolean h(long j11, long j12) {
        return j11 == j12;
    }

    public static final float i(long j11) {
        if (j11 == 9205357640488583168L) {
            d.a("Size is unspecified");
        }
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    public static final float j(long j11) {
        if (j11 == 9205357640488583168L) {
            d.a("Size is unspecified");
        }
        return Math.min(Float.intBitsToFloat((int) ((j11 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j11 & 2147483647L)));
    }

    public static final float k(long j11) {
        if (j11 == 9205357640488583168L) {
            d.a("Size is unspecified");
        }
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    public static int l(long j11) {
        return Long.hashCode(j11);
    }

    public static final boolean m(long j11) {
        if (j11 == 9205357640488583168L) {
            d.a("Size is unspecified");
        }
        long j12 = j11 & (~((((-9223372034707292160L) & j11) >>> 31) * ((long) (-1))));
        return ((j12 & 4294967295L) & (j12 >>> 32)) == 0;
    }

    public static final long n(long j11, float f11) {
        if (j11 == 9205357640488583168L) {
            d.a("Size is unspecified");
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) * f11;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) * f11;
        return d((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public static String o(long j11) {
        if (j11 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + c.a(k(j11), 1) + ", " + c.a(i(j11), 1) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return g(this.packedValue, obj);
    }

    public int hashCode() {
        return l(this.packedValue);
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public String toString() {
        return o(this.packedValue);
    }

    public static long d(long j11) {
        return j11;
    }
}
