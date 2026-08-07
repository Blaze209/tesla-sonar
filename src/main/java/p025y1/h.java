package p025y1;

import p013kotlin.Metadata;
import p020r2.l;
import p020r2.o;
import p024x1.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ly1/c0;", "state", "", "beyondViewportPageCount", "Lx1/m;", "a", "(Ly1/c0;ILr2/l;I)Lx1/m;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class h {
    public static final m a(c0 c0Var, int i11, l lVar, int i12) {
        if (o.J()) {
            o.S(373558254, i12, -1, "androidx.compose.foundation.pager.rememberPagerBeyondBoundsState (PagerBeyondBoundsModifier.kt:25)");
        }
        boolean z11 = ((((i12 & 14) ^ 6) > 4 && lVar.n(c0Var)) || (i12 & 6) == 4) | ((((i12 & 112) ^ 48) > 32 && lVar.r(i11)) || (i12 & 48) == 32);
        Object objI = lVar.I();
        if (z11 || objI == l.INSTANCE.a()) {
            objI = new i(c0Var, i11);
            lVar.B(objI);
        }
        i iVar = (i) objI;
        if (o.J()) {
            o.R();
        }
        return iVar;
    }
}
