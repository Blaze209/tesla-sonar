package androidx.compose.foundation;

import b4.s1;
import g4.ScrollAxisRange;
import g4.v;
import g4.y;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0018\u001a\u0004\b\t\u0010\u001a\"\u0004\b$\u0010\u001cR\"\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0018\u001a\u0004\b\n\u0010\u001a\"\u0004\b&\u0010\u001c¨\u0006'"}, d2 = {"Landroidx/compose/foundation/n;", "Landroidx/compose/ui/d$c;", "Lb4/s1;", "Landroidx/compose/foundation/o;", "state", "", "reverseScrolling", "Ls1/m;", "flingBehavior", "isScrollable", "isVertical", "<init>", "(Landroidx/compose/foundation/o;ZLs1/m;ZZ)V", "Lg4/y;", "Ljn0/h0;", "G0", "(Lg4/y;)V", "n", "Landroidx/compose/foundation/o;", "x2", "()Landroidx/compose/foundation/o;", "B2", "(Landroidx/compose/foundation/o;)V", "o", "Z", "getReverseScrolling", "()Z", "z2", "(Z)V", "p", "Ls1/m;", "getFlingBehavior", "()Ls1/m;", "y2", "(Ls1/m;)V", "q", "A2", "r", "C2", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class n extends androidx.compose.ui.d.c implements s1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private o state;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean reverseScrolling;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private p021s1.m flingBehavior;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean isScrollable;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean isVertical;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<Float> {
        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(n.this.getState().m());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.a<Float> {
        b() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(n.this.getState().l());
        }
    }

    public n(o oVar, boolean z11, p021s1.m mVar, boolean z12, boolean z13) {
        this.state = oVar;
        this.reverseScrolling = z11;
        this.flingBehavior = mVar;
        this.isScrollable = z12;
        this.isVertical = z13;
    }

    public final void A2(boolean z11) {
        this.isScrollable = z11;
    }

    public final void B2(o oVar) {
        this.state = oVar;
    }

    public final void C2(boolean z11) {
        this.isVertical = z11;
    }

    @Override // b4.s1
    public void G0(y yVar) {
        v.z0(yVar, true);
        ScrollAxisRange scrollAxisRange = new ScrollAxisRange(new a(), new b(), this.reverseScrolling);
        if (this.isVertical) {
            v.B0(yVar, scrollAxisRange);
        } else {
            v.g0(yVar, scrollAxisRange);
        }
    }

    /* JADX INFO: renamed from: x2, reason: from getter */
    public final o getState() {
        return this.state;
    }

    public final void y2(p021s1.m mVar) {
        this.flingBehavior = mVar;
    }

    public final void z2(boolean z11) {
        this.reverseScrolling = z11;
    }
}
