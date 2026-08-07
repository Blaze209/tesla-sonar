package p024x1;

import androidx.compose.ui.d;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;
import p020r2.o;
import p021s1.p;
import w4.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0003\u001aC\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/d;", "Lx1/m;", "state", "Lx1/j;", "beyondBoundsInfo", "", "reverseLayout", "Lw4/t;", "layoutDirection", "Ls1/p;", "orientation", "enabled", "b", "(Landroidx/compose/ui/d;Lx1/m;Lx1/j;ZLw4/t;Ls1/p;ZLr2/l;I)Landroidx/compose/ui/d;", "", "c", "()Ljava/lang/Void;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class l {
    public static final d b(d dVar, m mVar, j jVar, boolean z11, t tVar, p pVar, boolean z12, p020r2.l lVar, int i11) {
        if (o.J()) {
            o.S(1331498025, i11, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutBeyondBoundsModifier (LazyLayoutBeyondBoundsModifierLocal.kt:51)");
        }
        if (z12) {
            lVar.o(-1890632411);
            boolean z13 = ((((i11 & 112) ^ 48) > 32 && lVar.n(mVar)) || (i11 & 48) == 32) | ((((i11 & 896) ^ KyberEngine.KyberPolyBytes) > 256 && lVar.n(jVar)) || (i11 & KyberEngine.KyberPolyBytes) == 256) | ((((i11 & 7168) ^ 3072) > 2048 && lVar.p(z11)) || (i11 & 3072) == 2048) | ((((57344 & i11) ^ 24576) > 16384 && lVar.n(tVar)) || (i11 & 24576) == 16384) | ((((458752 & i11) ^ 196608) > 131072 && lVar.n(pVar)) || (i11 & 196608) == 131072);
            Object objI = lVar.I();
            if (z13 || objI == p020r2.l.INSTANCE.a()) {
                k kVar = new k(mVar, jVar, z11, tVar, pVar);
                lVar.B(kVar);
                objI = kVar;
            }
            dVar = dVar.g((k) objI);
            lVar.l();
        } else {
            lVar.o(-1890658823);
            lVar.l();
        }
        if (o.J()) {
            o.R();
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void c() {
        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
    }
}
