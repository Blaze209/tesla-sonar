package androidx.compose.foundation.layout;

import b4.m1;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u0000*\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/layout/f;", "Lb4/m1;", "Landroidx/compose/ui/d$c;", "Ld3/c;", "alignment", "", "matchParentSize", "<init>", "(Ld3/c;Z)V", "Lw4/d;", "", "parentData", "z2", "(Lw4/d;Ljava/lang/Object;)Landroidx/compose/foundation/layout/f;", "n", "Ld3/c;", "x2", "()Ld3/c;", "A2", "(Ld3/c;)V", "o", "Z", "y2", "()Z", "B2", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class f extends androidx.compose.ui.d.c implements m1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private d3.c alignment;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean matchParentSize;

    public f(d3.c cVar, boolean z11) {
        this.alignment = cVar;
        this.matchParentSize = z11;
    }

    public final void A2(d3.c cVar) {
        this.alignment = cVar;
    }

    public final void B2(boolean z11) {
        this.matchParentSize = z11;
    }

    /* JADX INFO: renamed from: x2, reason: from getter */
    public final d3.c getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: y2, reason: from getter */
    public final boolean getMatchParentSize() {
        return this.matchParentSize;
    }

    @Override // b4.m1
    /* JADX INFO: renamed from: z2, reason: merged with bridge method [inline-methods] */
    public f G(w4.d dVar, Object obj) {
        return this;
    }
}
