package w4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\"\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a*\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\"\u001e\u0010\u001a\u001a\u00020\u0016*\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u0017\u0010\u0018\"\u001e\u0010\u001f\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\"\u001e\u0010\u001f\u001a\u00020\u0004*\u00020 8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010#\u001a\u0004\b!\u0010\"\"\u001e\u0010&\u001a\u00020\u0004*\u00020 8FX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\"\"\u001e\u0010\u001f\u001a\u00020\u0004*\u00020'8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010*\u001a\u0004\b(\u0010)\"\u001e\u0010&\u001a\u00020\u0004*\u00020'8FX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010*\u001a\u0004\b+\u0010)\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"", "value", "Lw4/x;", "type", "Lw4/v;", "a", "(FJ)J", "", "unitType", "v", "k", "(JF)J", "Ljn0/h0;", "b", "(J)V", "c", "(JJ)V", "start", "stop", "fraction", "j", "(JJF)J", "", IntegerTokenConverter.CONVERTER_KEY, "(J)Z", "isUnspecified--R2X_6o$annotations", "isUnspecified", "g", "(F)J", "getSp$annotations", "(F)V", "sp", "", "f", "(D)J", "(D)V", DateTokenConverter.CONVERTER_KEY, "getEm$annotations", "em", "", "h", "(I)J", "(I)V", "e", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class w {
    public static final long a(float f11, long j11) {
        return k(j11, f11);
    }

    public static final void b(long j11) {
        if (i(j11)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
    }

    public static final void c(long j11, long j12) {
        if (i(j11) || i(j12)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (x.g(v.g(j11), v.g(j12))) {
            return;
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) x.i(v.g(j11))) + " and " + ((Object) x.i(v.g(j12)))).toString());
    }

    public static final long d(double d11) {
        return k(8589934592L, (float) d11);
    }

    public static final long e(int i11) {
        return k(8589934592L, i11);
    }

    public static final long f(double d11) {
        return k(4294967296L, (float) d11);
    }

    public static final long g(float f11) {
        return k(4294967296L, f11);
    }

    public static final long h(int i11) {
        return k(4294967296L, i11);
    }

    public static final boolean i(long j11) {
        return v.f(j11) == 0;
    }

    public static final long j(long j11, long j12, float f11) {
        c(j11, j12);
        return k(v.f(j11), y4.b.b(v.h(j11), v.h(j12), f11));
    }

    public static final long k(long j11, float f11) {
        return v.c(j11 | (((long) Float.floatToIntBits(f11)) & 4294967295L));
    }
}
