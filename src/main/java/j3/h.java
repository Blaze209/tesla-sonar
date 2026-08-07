package j3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a*\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\"\u001e\u0010\u0010\u001a\u00020\u000b*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\"\u001e\u0010\u0013\u001a\u00020\u000b*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\r\"\u001e\u0010\u0016\u001a\u00020\u000b*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0014\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"", "x", "y", "Lj3/g;", "a", "(FF)J", "start", "stop", "fraction", "e", "(JJF)J", "", "b", "(J)Z", "isFinite-k-4lQ0M$annotations", "(J)V", "isFinite", "c", "isSpecified-k-4lQ0M$annotations", "isSpecified", DateTokenConverter.CONVERTER_KEY, "isUnspecified-k-4lQ0M$annotations", "isUnspecified", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class h {
    public static final long a(float f11, float f12) {
        return g.e((((long) Float.floatToRawIntBits(f12)) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
    }

    public static final boolean b(long j11) {
        long j12 = (j11 & 9187343241974906880L) ^ 9187343241974906880L;
        return (((~j12) & (j12 - 4294967297L)) & (-9223372034707292160L)) == 0;
    }

    public static final boolean c(long j11) {
        return (j11 & 9223372034707292159L) != 9205357640488583168L;
    }

    public static final boolean d(long j11) {
        return (j11 & 9223372034707292159L) == 9205357640488583168L;
    }

    public static final long e(long j11, long j12, float f11) {
        float fB = y4.b.b(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j12 >> 32)), f11);
        float fB2 = y4.b.b(Float.intBitsToFloat((int) (j11 & 4294967295L)), Float.intBitsToFloat((int) (j12 & 4294967295L)), f11);
        return g.e((((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(fB2)) & 4294967295L));
    }
}
