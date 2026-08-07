package w4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087@\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0010B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0012\u0010\u0013R \u0010\u0018\u001a\u00020\u00148FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001b\u001a\u00020\u00148FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0019\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Lw4/k;", "", "", "packedValue", DateTokenConverter.CONVERTER_KEY, "(J)J", "", "j", "(J)Ljava/lang/String;", "", IntegerTokenConverter.CONVERTER_KEY, "(J)I", "other", "", "e", "(JLjava/lang/Object;)Z", "a", "J", "getPackedValue$annotations", "()V", "Lw4/h;", "h", "(J)F", "getWidth-D9Ej5fM$annotations", Snapshot.WIDTH, "g", "getHeight-D9Ej5fM$annotations", Snapshot.HEIGHT, "b", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@vn0.b
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f120727c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f120728d = d(9205357640488583168L);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    /* JADX INFO: renamed from: w4.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Lw4/k$a;", "", "<init>", "()V", "Lw4/k;", "Zero", "J", "b", "()J", "Unspecified", "a", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return k.f120728d;
        }

        public final long b() {
            return k.f120727c;
        }

        private Companion() {
        }
    }

    private /* synthetic */ k(long j11) {
        this.packedValue = j11;
    }

    public static final /* synthetic */ k c(long j11) {
        return new k(j11);
    }

    public static boolean e(long j11, Object obj) {
        return (obj instanceof k) && j11 == ((k) obj).getPackedValue();
    }

    public static final boolean f(long j11, long j12) {
        return j11 == j12;
    }

    public static final float g(long j11) {
        return h.g(Float.intBitsToFloat((int) (j11 & 4294967295L)));
    }

    public static final float h(long j11) {
        return h.g(Float.intBitsToFloat((int) (j11 >> 32)));
    }

    public static int i(long j11) {
        return Long.hashCode(j11);
    }

    public static String j(long j11) {
        if (j11 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) h.k(h(j11))) + " x " + ((Object) h.k(g(j11)));
    }

    public boolean equals(Object obj) {
        return e(this.packedValue, obj);
    }

    public int hashCode() {
        return i(this.packedValue);
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public String toString() {
        return j(this.packedValue);
    }

    public static long d(long j11) {
        return j11;
    }
}
