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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJL\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\f*\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/selection/b;", "Landroidx/compose/foundation/e;", "", "selected", "Lu1/l;", "interactionSource", "Lq1/e0;", "indicationNodeFactory", "enabled", "Lg4/i;", "role", "Lkotlin/Function0;", "Ljn0/h0;", "onClick", "<init>", "(ZLu1/l;Lq1/e0;ZLg4/i;Lwn0/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Y2", "(ZLu1/l;Lq1/e0;ZLg4/i;Lwn0/a;)V", "Lg4/y;", "J2", "(Lg4/y;)V", "J", "Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class b extends androidx.compose.foundation.e {

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private boolean selected;

    public /* synthetic */ b(boolean z11, l lVar, e0 e0Var, boolean z12, i iVar, wn0.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, lVar, e0Var, z12, iVar, aVar);
    }

    @Override // androidx.compose.foundation.a
    public void J2(y yVar) {
        v.l0(yVar, this.selected);
    }

    public final void Y2(boolean selected, l interactionSource, e0 indicationNodeFactory, boolean enabled, i role, wn0.a<h0> onClick) {
        if (this.selected != selected) {
            this.selected = selected;
            t1.b(this);
        }
        super.X2(interactionSource, indicationNodeFactory, enabled, null, role, onClick);
    }

    private b(boolean z11, l lVar, e0 e0Var, boolean z12, i iVar, wn0.a<h0> aVar) {
        super(lVar, e0Var, z12, null, iVar, aVar, null);
        this.selected = z11;
    }
}
