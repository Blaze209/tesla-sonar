package w1;

import p013kotlin.Metadata;
import p024x1.f0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lw1/a0;", "state", "", "isVertical", "Lx1/f0;", "a", "(Lw1/a0;ZLr2/l;I)Lx1/f0;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class z {
    public static final f0 a(a0 a0Var, boolean z11, p020r2.l lVar, int i11) {
        if (p020r2.o.J()) {
            p020r2.o.S(596174919, i11, -1, "androidx.compose.foundation.lazy.rememberLazyListSemanticState (LazyListSemantics.kt:26)");
        }
        boolean z12 = ((((i11 & 14) ^ 6) > 4 && lVar.n(a0Var)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && lVar.p(z11)) || (i11 & 48) == 32);
        Object objI = lVar.I();
        if (z12 || objI == p020r2.l.INSTANCE.a()) {
            objI = d.a(a0Var, z11);
            lVar.B(objI);
        }
        f0 f0Var = (f0) objI;
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        return f0Var;
    }
}
