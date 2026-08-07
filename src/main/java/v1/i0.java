package v1;

import p013kotlin.Metadata;
import p020r2.d4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Ljn0/h0;", "a", "(Landroidx/compose/ui/d;Lr2/l;I)V", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class i0 {
    public static final void a(androidx.compose.ui.d dVar, p020r2.l lVar, int i11) {
        if (p020r2.o.J()) {
            p020r2.o.S(-72882467, i11, -1, "androidx.compose.foundation.layout.Spacer (Spacer.kt:38)");
        }
        j0 j0Var = j0.f117506a;
        int iA = p020r2.j.a(lVar, 0);
        androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVar, dVar);
        p020r2.x xVarC = lVar.c();
        b4.g.Companion companion = b4.g.INSTANCE;
        wn0.a<b4.g> aVarA = companion.a();
        if (lVar.w() == null) {
            p020r2.j.c();
        }
        lVar.h();
        if (lVar.u()) {
            lVar.z(aVarA);
        } else {
            lVar.d();
        }
        p020r2.l lVarA = d4.a(lVar);
        d4.b(lVarA, j0Var, companion.c());
        d4.b(lVarA, xVarC, companion.e());
        d4.b(lVarA, dVarE, companion.d());
        wn0.p<b4.g, Integer, jn0.h0> pVarB = companion.b();
        if (lVarA.u() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
            lVarA.B(Integer.valueOf(iA));
            lVarA.f(Integer.valueOf(iA), pVarB);
        }
        lVar.g();
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
    }
}
