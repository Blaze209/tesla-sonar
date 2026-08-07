package w4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0016\u0010\u0007\u001a\u00020\u0006*\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0016\u0010\t\u001a\u00020\u0003*\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\"\u001e\u0010\u000e\u001a\u00020\n*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"", Snapshot.WIDTH, Snapshot.HEIGHT, "Lw4/r;", "a", "(II)J", "Lj3/m;", DateTokenConverter.CONVERTER_KEY, "(J)J", "c", "Lw4/n;", "b", "getCenter-ozmzZPI$annotations", "(J)V", "center", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class s {
    public static final long a(int i11, int i12) {
        return r.c((((long) i12) & 4294967295L) | (((long) i11) << 32));
    }

    public static final long b(long j11) {
        return n.c((((j11 << 32) >> 33) & 4294967295L) | ((j11 >> 33) << 32));
    }

    public static final long c(long j11) {
        int iRound = Math.round(j3.m.k(j11));
        return r.c((((long) Math.round(j3.m.i(j11))) & 4294967295L) | (((long) iRound) << 32));
    }

    public static final long d(long j11) {
        return j3.n.a(r.g(j11), r.f(j11));
    }
}
