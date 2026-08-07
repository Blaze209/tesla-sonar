package androidx.compose.ui.window;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/window/a;", "Landroidx/compose/ui/window/r;", "Ld3/c;", "alignment", "Lw4/n;", "offset", "<init>", "(Ld3/c;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lw4/p;", "anchorBounds", "Lw4/r;", "windowSize", "Lw4/t;", "layoutDirection", "popupContentSize", "a", "(Lw4/p;JLw4/t;J)J", "Ld3/c;", "getAlignment", "()Ld3/c;", "b", "J", "getOffset-nOcc-ac", "()J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d3.c alignment;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long offset;

    public /* synthetic */ a(d3.c cVar, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, j11);
    }

    @Override // androidx.compose.ui.window.r
    public long a(w4.p anchorBounds, long windowSize, w4.t layoutDirection, long popupContentSize) {
        d3.c cVar = this.alignment;
        w4.r.Companion companion = w4.r.INSTANCE;
        long jA = cVar.a(companion.a(), anchorBounds.h(), layoutDirection);
        return w4.n.l(w4.n.l(w4.n.l(anchorBounds.j(), jA), w4.n.n(this.alignment.a(companion.a(), popupContentSize, layoutDirection))), w4.o.a(w4.n.h(this.offset) * (layoutDirection == w4.t.Ltr ? 1 : -1), w4.n.i(this.offset)));
    }

    private a(d3.c cVar, long j11) {
        this.alignment = cVar;
        this.offset = j11;
    }
}
