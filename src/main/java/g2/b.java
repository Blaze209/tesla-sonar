package g2;

import bo0.n;
import kotlin.m0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import t4.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u001a2\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a2\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a*\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "", "softWrap", "Lt4/t;", "overflow", "", "maxIntrinsicWidth", "a", "(JZIF)J", "", "c", "(JZIF)I", "maxLinesIn", "b", "(ZII)I", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {
    public static final long a(long j11, boolean z11, int i11, float f11) {
        return w4.b.INSTANCE.b(0, c(j11, z11, i11, f11), 0, w4.b.k(j11));
    }

    public static final int b(boolean z11, int i11, int i12) {
        if (z11 || !t.e(i11, t.INSTANCE.b())) {
            return n.f(i12, 1);
        }
        return 1;
    }

    public static final int c(long j11, boolean z11, int i11, float f11) {
        int iL = ((z11 || t.e(i11, t.INSTANCE.b())) && w4.b.h(j11)) ? w4.b.l(j11) : Integer.MAX_VALUE;
        return w4.b.n(j11) == iL ? iL : n.n(m0.a(f11), w4.b.n(j11), iL);
    }
}
