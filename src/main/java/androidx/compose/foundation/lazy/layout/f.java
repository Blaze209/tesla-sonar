package androidx.compose.foundation.lazy.layout;

import p013kotlin.Metadata;
import p020r2.l;
import p020r2.o;
import p021s1.p;
import p024x1.f0;
import p024x1.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u001aA\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/d;", "Lkotlin/Function0;", "Lx1/t;", "itemProviderLambda", "Lx1/f0;", "state", "Ls1/p;", "orientation", "", "userScrollEnabled", "reverseScrolling", "c", "(Landroidx/compose/ui/d;Lwn0/a;Lx1/f0;Ls1/p;ZZLr2/l;I)Landroidx/compose/ui/d;", "", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "", "b", "(II)F", "canScrollForward", "a", "(IIZ)F", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {
    public static final float a(int i11, int i12, boolean z11) {
        return z11 ? b(i11, i12) + 100 : b(i11, i12);
    }

    public static final float b(int i11, int i12) {
        return i12 + (i11 * 500);
    }

    public static final androidx.compose.ui.d c(androidx.compose.ui.d dVar, wn0.a<? extends t> aVar, f0 f0Var, p pVar, boolean z11, boolean z12, l lVar, int i11) {
        if (o.J()) {
            o.S(1070136913, i11, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:46)");
        }
        androidx.compose.ui.d dVarG = dVar.g(new LazyLayoutSemanticsModifier(aVar, f0Var, pVar, z11, z12));
        if (o.J()) {
            o.R();
        }
        return dVarG;
    }
}
