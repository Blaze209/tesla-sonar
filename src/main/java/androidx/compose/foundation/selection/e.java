package androidx.compose.foundation.selection;

import b4.t1;
import g4.i;
import g4.v;
import g4.y;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import q1.e0;
import u1.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010JL\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\r*\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/selection/e;", "Landroidx/compose/foundation/e;", "Lh4/a;", "state", "Lu1/l;", "interactionSource", "Lq1/e0;", "indicationNodeFactory", "", "enabled", "Lg4/i;", "role", "Lkotlin/Function0;", "Ljn0/h0;", "onClick", "<init>", "(Lh4/a;Lu1/l;Lq1/e0;ZLg4/i;Lwn0/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Y2", "(Lh4/a;Lu1/l;Lq1/e0;ZLg4/i;Lwn0/a;)V", "Lg4/y;", "J2", "(Lg4/y;)V", "J", "Lh4/a;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class e extends androidx.compose.foundation.e {

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private h4.a state;

    public /* synthetic */ e(h4.a aVar, l lVar, e0 e0Var, boolean z11, i iVar, wn0.a aVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, lVar, e0Var, z11, iVar, aVar2);
    }

    @Override // androidx.compose.foundation.a
    public void J2(y yVar) {
        v.y0(yVar, this.state);
    }

    public final void Y2(h4.a state, l interactionSource, e0 indicationNodeFactory, boolean enabled, i role, wn0.a<h0> onClick) {
        if (this.state != state) {
            this.state = state;
            t1.b(this);
        }
        super.X2(interactionSource, indicationNodeFactory, enabled, null, role, onClick);
    }

    private e(h4.a aVar, l lVar, e0 e0Var, boolean z11, i iVar, wn0.a<h0> aVar2) {
        super(lVar, e0Var, z11, null, iVar, aVar2, null);
        this.state = aVar;
    }
}
