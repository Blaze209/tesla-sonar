package kotlin;

import j3.g;
import j3.h;
import j3.i;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0005"}, d2 = {"Lj3/g;", "Lj3/i;", "rect", "b", "(JLj3/i;)J", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long b(long j11, i iVar) {
        float right;
        float bottom;
        if (g.m(j11) < iVar.getLeft()) {
            right = iVar.getLeft();
        } else {
            right = g.m(j11) > iVar.getRight() ? iVar.getRight() : g.m(j11);
        }
        if (g.n(j11) < iVar.getTop()) {
            bottom = iVar.getTop();
        } else {
            bottom = g.n(j11) > iVar.getBottom() ? iVar.getBottom() : g.n(j11);
        }
        return h.a(right, bottom);
    }
}
