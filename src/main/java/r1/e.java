package r1;

import androidx.compose.ui.window.r;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import w4.n;
import w4.o;
import w4.p;
import w4.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\r\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Lr1/e;", "Landroidx/compose/ui/window/r;", "Lw4/n;", "localPosition", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lw4/p;", "anchorBounds", "Lw4/r;", "windowSize", "Lw4/t;", "layoutDirection", "popupContentSize", "a", "(Lw4/p;JLw4/t;J)J", "J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long localPosition;

    public /* synthetic */ e(long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11);
    }

    @Override // androidx.compose.ui.window.r
    public long a(p anchorBounds, long windowSize, t layoutDirection, long popupContentSize) {
        return o.a(f.b(anchorBounds.getLeft() + n.h(this.localPosition), w4.r.g(popupContentSize), w4.r.g(windowSize), layoutDirection == t.Ltr), f.c(anchorBounds.getTop() + n.i(this.localPosition), w4.r.f(popupContentSize), w4.r.f(windowSize), false, 8, null));
    }

    private e(long j11) {
        this.localPosition = j11;
    }
}
