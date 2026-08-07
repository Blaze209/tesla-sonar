package w4;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"Lw4/n;", "offset", "Lw4/r;", "size", "Lw4/p;", "a", "(JJ)Lw4/p;", "Lj3/i;", "b", "(Lj3/i;)Lw4/p;", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class q {
    public static final p a(long j11, long j12) {
        return new p(n.h(j11), n.i(j11), n.h(j11) + r.g(j12), n.i(j11) + r.f(j12));
    }

    public static final p b(j3.i iVar) {
        return new p(Math.round(iVar.getLeft()), Math.round(iVar.getTop()), Math.round(iVar.getRight()), Math.round(iVar.getBottom()));
    }
}
