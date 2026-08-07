package w1;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lw1/a0;", "state", "", "beyondBoundsItemCount", "Lx1/m;", "a", "(Lw1/a0;ILr2/l;I)Lx1/m;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {
    public static final p024x1.m a(a0 a0Var, int i11, p020r2.l lVar, int i12) {
        if (p020r2.o.J()) {
            p020r2.o.S(-1877443446, i12, -1, "androidx.compose.foundation.lazy.rememberLazyListBeyondBoundsState (LazyListBeyondBoundsModifier.kt:26)");
        }
        boolean z11 = ((((i12 & 14) ^ 6) > 4 && lVar.n(a0Var)) || (i12 & 6) == 4) | ((((i12 & 112) ^ 48) > 32 && lVar.r(i11)) || (i12 & 48) == 32);
        Object objI = lVar.I();
        if (z11 || objI == p020r2.l.INSTANCE.a()) {
            objI = new g(a0Var, i11);
            lVar.B(objI);
        }
        g gVar = (g) objI;
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        return gVar;
    }
}
