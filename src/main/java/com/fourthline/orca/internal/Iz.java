package com.fourthline.orca.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Iz {
    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(v1.g0 g0Var, Hz hz2, int i11, p020r2.l lVar, int i12) {
        a(g0Var, hz2, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(Pair pair, int i11, p020r2.l lVar, int i12) {
        a(pair, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    public static final int b(Pair pair) {
        p013kotlin.jvm.internal.s.k(pair, "<this>");
        return ((Number) pair.f()).intValue();
    }

    public static final int a(Pair pair) {
        p013kotlin.jvm.internal.s.k(pair, "<this>");
        return ((Number) pair.e()).intValue();
    }

    public static final void a(final Pair progress, p020r2.l lVar, final int i11) {
        int i12;
        Hz hz2;
        p013kotlin.jvm.internal.s.k(progress, "progress");
        p020r2.l lVarV = lVar.v(397532579);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.n(progress) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(397532579, i12, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.StepsProgressWidget (StepsProgressWidget.kt:29)");
            }
            androidx.compose.ui.d dVarG = androidx.compose.foundation.layout.x.g(androidx.compose.foundation.layout.x.i(androidx.compose.ui.d.INSTANCE, Ko.f26627a.a()), 0.7f);
            z3.i0 i0VarB = v1.e0.b(v1.b.f117444a.b(), d3.c.INSTANCE.l(), lVarV, 6);
            int i13 = 0;
            int iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, dVarG);
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA, i0VarB, companion.c());
            p020r2.d4.b(lVarA, xVarC, companion.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB = companion.b();
            if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE, companion.d());
            v1.h0 h0Var = v1.h0.f117504a;
            lVarV.o(1688954123);
            int iB = b(progress);
            while (i13 < iB) {
                if (p013kotlin.jvm.internal.s.m(i13, a(progress)) < 0) {
                    hz2 = Hz.PROCESSED;
                } else {
                    hz2 = i13 == a(progress) ? Hz.ACTIVE : Hz.UPCOMING;
                }
                a(h0Var, hz2, lVarV, 6);
                i13++;
            }
            lVarV.l();
            lVarV.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.vf0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Iz.a(progress, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void a(final v1.g0 g0Var, final Hz hz2, p020r2.l lVar, final int i11) {
        int i12;
        long jP;
        p020r2.l lVar2;
        p020r2.l lVarV = lVar.v(735552604);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.n(g0Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.n(hz2) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && lVarV.b()) {
            lVarV.j();
            lVar2 = lVarV;
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(735552604, i12, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.StepsProgressItem (StepsProgressWidget.kt:49)");
            }
            lVarV.o(1373945221);
            Hz hz3 = Hz.ACTIVE;
            if (hz2 == hz3) {
                jP = C3825sp.f35377a.b(lVarV, 6).getSpinner().getHighlight().a(lVarV, 0);
            } else if (hz2 == Hz.PROCESSED) {
                jP = k3.p1.INSTANCE.k();
            } else {
                if (hz2 != Hz.UPCOMING) {
                    throw new NoWhenBranchMatchedException();
                }
                jP = k3.p1.p(k3.p1.INSTANCE.k(), 0.5f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            }
            lVarV.l();
            float f11 = 2;
            lVar2 = lVarV;
            p009i2.m2.a(v1.g0.c(g0Var, g0Var.b(androidx.compose.foundation.layout.x.i(androidx.compose.foundation.layout.t.k(androidx.compose.ui.d.INSTANCE, w4.h.g(f11), BitmapDescriptorFactory.HUE_RED, 2, null), hz2 == hz3 ? w4.h.g(4) : w4.h.g(f11)), d3.c.INSTANCE.i()), 1.0f, false, 2, null), null, jP, p009i2.s.b(jP, lVarV, 0), null, w4.h.g(0), C4057y4.f36890a.a(), lVar2, 1794048, 2);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.wf0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Iz.a(g0Var, hz2, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
