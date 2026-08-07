package w4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\t\u001a\u0016\u0010\u000b\u001a\u00020\u0003*\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"", "x", "y", "Lw4/n;", "a", "(II)J", "Lj3/g;", "offset", "c", "(JJ)J", "b", DateTokenConverter.CONVERTER_KEY, "(J)J", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class o {
    public static final long a(int i11, int i12) {
        return n.c((((long) i12) & 4294967295L) | (((long) i11) << 32));
    }

    public static final long b(long j11, long j12) {
        return j3.h.a(j3.g.m(j11) - n.h(j12), j3.g.n(j11) - n.i(j12));
    }

    public static final long c(long j11, long j12) {
        return j3.h.a(j3.g.m(j11) + n.h(j12), j3.g.n(j11) + n.i(j12));
    }

    public static final long d(long j11) {
        int iRound = Math.round(j3.g.m(j11));
        return n.c((((long) Math.round(j3.g.n(j11))) & 4294967295L) | (((long) iRound) << 32));
    }
}
