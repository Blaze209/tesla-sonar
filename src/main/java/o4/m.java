package o4;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0005"}, d2 = {"Li4/p0;", "target", "deleted", "a", "(JJ)J", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class m {
    public static final long a(long j11, long j12) {
        int iJ;
        int iL = i4.p0.l(j11);
        int iK = i4.p0.k(j11);
        if (i4.p0.p(j12, j11)) {
            if (i4.p0.d(j12, j11)) {
                iL = i4.p0.l(j12);
                iK = iL;
            } else {
                if (i4.p0.d(j11, j12)) {
                    iJ = i4.p0.j(j12);
                } else if (i4.p0.e(j12, iL)) {
                    iL = i4.p0.l(j12);
                    iJ = i4.p0.j(j12);
                } else {
                    iK = i4.p0.l(j12);
                }
                iK -= iJ;
            }
        } else if (iK > i4.p0.l(j12)) {
            iL -= i4.p0.j(j12);
            iJ = i4.p0.j(j12);
            iK -= iJ;
        }
        return i4.q0.b(iL, iK);
    }
}
