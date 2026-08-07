package p007h2;

import androidx.compose.ui.window.r;
import d3.c;
import j3.h;
import p013kotlin.Metadata;
import w4.n;
import w4.o;
import w4.p;
import w4.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Lh2/g;", "Landroidx/compose/ui/window/r;", "Ld3/c;", "handleReferencePoint", "Lh2/j;", "positionProvider", "<init>", "(Ld3/c;Lh2/j;)V", "Lw4/p;", "anchorBounds", "Lw4/r;", "windowSize", "Lw4/t;", "layoutDirection", "popupContentSize", "Lw4/n;", "a", "(Lw4/p;JLw4/t;J)J", "Ld3/c;", "b", "Lh2/j;", "Lj3/g;", "c", "J", "prevPosition", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c handleReferencePoint;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j positionProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long prevPosition = j3.g.INSTANCE.c();

    public g(c cVar, j jVar) {
        this.handleReferencePoint = cVar;
        this.positionProvider = jVar;
    }

    @Override // androidx.compose.ui.window.r
    public long a(p anchorBounds, long windowSize, t layoutDirection, long popupContentSize) {
        long jA = this.positionProvider.a();
        if (!h.c(jA)) {
            jA = this.prevPosition;
        }
        this.prevPosition = jA;
        return n.l(n.l(anchorBounds.j(), o.d(jA)), this.handleReferencePoint.a(popupContentSize, w4.r.INSTANCE.a(), layoutDirection));
    }
}
