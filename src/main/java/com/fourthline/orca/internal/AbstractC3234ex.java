package com.fourthline.orca.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ex, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3234ex {
    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(androidx.compose.foundation.o oVar, C4127zp c4127zp, int i11, p020r2.l lVar, int i12) {
        a(oVar, c4127zp, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(androidx.compose.ui.d dVar, C4127zp c4127zp, int i11, int i12, p020r2.l lVar, int i13) {
        a(dVar, c4127zp, lVar, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(androidx.compose.ui.d dVar, C4127zp c4127zp, int i11, int i12, p020r2.l lVar, int i13) {
        b(dVar, c4127zp, lVar, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    public static final void a(final androidx.compose.foundation.o scrollState, final C4127zp overlaySettings, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(scrollState, "scrollState");
        p013kotlin.jvm.internal.s.k(overlaySettings, "overlaySettings");
        p020r2.l lVarV = lVar.v(-888864067);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.n(scrollState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.n(overlaySettings) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-888864067, i12, -1, "com.fourthline.orca.core.internal.composable.scroll.ScrollGradientOverlay (ScrollOverlay.kt:24)");
            }
            lVarV.o(2104027518);
            if (scrollState.m() > 0 && overlaySettings.f()) {
                b(h3.a.a(androidx.compose.ui.d.INSTANCE, b(scrollState)), overlaySettings, lVarV, i12 & 112, 0);
            }
            lVarV.l();
            if (scrollState.l() > 0 && overlaySettings.e()) {
                a(h3.a.a(androidx.compose.ui.d.INSTANCE, a(scrollState)), overlaySettings, lVarV, i12 & 112, 0);
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.m11
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3234ex.a(scrollState, overlaySettings, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void b(androidx.compose.ui.d dVar, final C4127zp c4127zp, p020r2.l lVar, final int i11, final int i12) {
        final androidx.compose.ui.d dVar2;
        int i13;
        p020r2.l lVarV = lVar.v(4001578);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            dVar2 = dVar;
        } else if ((i11 & 6) == 0) {
            dVar2 = dVar;
            i13 = (lVarV.n(dVar2) ? 4 : 2) | i11;
        } else {
            dVar2 = dVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= lVarV.n(c4127zp) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            androidx.compose.ui.d dVar3 = i14 != 0 ? androidx.compose.ui.d.INSTANCE : dVar2;
            if (p020r2.o.J()) {
                p020r2.o.S(4001578, i13, -1, "com.fourthline.orca.core.internal.composable.scroll.ScrollViewTopGradientOverlay (ScrollOverlay.kt:70)");
            }
            k3.p1 p1VarA = c4127zp.a();
            lVarV.o(1913007169);
            long jA = p1VarA == null ? C3825sp.f35377a.b(lVarV, 6).getScreen().getBackground().a(lVarV, 0) : p1VarA.getValue();
            lVarV.l();
            k3.p1 p1VarB = c4127zp.b();
            lVarV.o(1913010649);
            long jP = p1VarB == null ? k3.p1.p(C3825sp.f35377a.b(lVarV, 6).getScreen().getBackground().a(lVarV, 0), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : p1VarB.getValue();
            lVarV.l();
            androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.x.f(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
            lVarV.o(1913017247);
            boolean zS = lVarV.s(jA) | ((i13 & 112) == 32) | lVarV.s(jP);
            Object objI = lVarV.I();
            if (zS || objI == p020r2.l.INSTANCE.a()) {
                final long j11 = jP;
                final long j12 = jA;
                wn0.l lVar2 = new wn0.l() { // from class: com.fourthline.orca.internal.k11
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3234ex.a(c4127zp, j12, j11, (m3.f) obj);
                    }
                };
                lVarV.B(lVar2);
                objI = lVar2;
            }
            lVarV.l();
            androidx.compose.foundation.layout.g.a(androidx.compose.ui.draw.b.b(dVarF, (wn0.l) objI), lVarV, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar2 = dVar3;
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.l11
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3234ex.b(dVar2, c4127zp, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void a(androidx.compose.ui.d dVar, final C4127zp c4127zp, p020r2.l lVar, final int i11, final int i12) {
        final androidx.compose.ui.d dVar2;
        int i13;
        p020r2.l lVarV = lVar.v(149699540);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            dVar2 = dVar;
        } else if ((i11 & 6) == 0) {
            dVar2 = dVar;
            i13 = (lVarV.n(dVar2) ? 4 : 2) | i11;
        } else {
            dVar2 = dVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= lVarV.n(c4127zp) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            androidx.compose.ui.d dVar3 = i14 != 0 ? androidx.compose.ui.d.INSTANCE : dVar2;
            if (p020r2.o.J()) {
                p020r2.o.S(149699540, i13, -1, "com.fourthline.orca.core.internal.composable.scroll.ScrollViewBottomGradientOverlay (ScrollOverlay.kt:41)");
            }
            C3825sp c3825sp = C3825sp.f35377a;
            final float fD = c3825sp.c(lVarV, 6).d();
            k3.p1 p1VarA = c4127zp.a();
            lVarV.o(761232207);
            long jA = p1VarA == null ? c3825sp.b(lVarV, 6).getScreen().getBackground().a(lVarV, 0) : p1VarA.getValue();
            lVarV.l();
            k3.p1 p1VarB = c4127zp.b();
            lVarV.o(761235687);
            long jP = p1VarB == null ? k3.p1.p(c3825sp.b(lVarV, 6).getScreen().getBackground().a(lVarV, 0), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : p1VarB.getValue();
            lVarV.l();
            androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.x.f(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
            lVarV.o(761242499);
            boolean zQ = lVarV.q(fD) | ((i13 & 112) == 32) | lVarV.s(jP) | lVarV.s(jA);
            Object objI = lVarV.I();
            if (zQ || objI == p020r2.l.INSTANCE.a()) {
                final long j11 = jP;
                final long j12 = jA;
                wn0.l lVar2 = new wn0.l() { // from class: com.fourthline.orca.internal.n11
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3234ex.a(fD, c4127zp, j11, j12, (m3.c) obj);
                    }
                };
                lVarV.B(lVar2);
                objI = lVar2;
            }
            lVarV.l();
            androidx.compose.foundation.layout.g.a(androidx.compose.ui.draw.b.d(dVarF, (wn0.l) objI), lVarV, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar2 = dVar3;
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.o11
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3234ex.a(dVar2, c4127zp, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final float b(androidx.compose.foundation.o oVar) {
        if (oVar.m() > 0) {
            return Math.min(oVar.m() / Ko.f26627a.a(), 1.0f);
        }
        return 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(float f11, C4127zp c4127zp, long j11, long j12, m3.c drawWithContent) {
        p013kotlin.jvm.internal.s.k(drawWithContent, "$this$drawWithContent");
        float fO1 = drawWithContent.O1(f11);
        m3.f.F0(drawWithContent, k3.h1.Companion.h(k3.h1.INSTANCE, p013kotlin.collections.v.p(k3.p1.l(j11), k3.p1.l(j12)), j3.m.i(drawWithContent.b()) - fO1, j3.m.i(drawWithContent.b()), 0, 8, null), j3.h.a(c4127zp.d().b(), j3.m.i(drawWithContent.b()) - fO1), j3.m.e(drawWithContent.b(), (j3.m.k(drawWithContent.b()) - c4127zp.d().a()) - c4127zp.d().b(), fO1), BitmapDescriptorFactory.HUE_RED, null, null, 0, 120, null);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(C4127zp c4127zp, long j11, long j12, m3.f drawBehind) {
        p013kotlin.jvm.internal.s.k(drawBehind, "$this$drawBehind");
        m3.f.F0(drawBehind, k3.h1.Companion.h(k3.h1.INSTANCE, p013kotlin.collections.v.p(k3.p1.l(j11), k3.p1.l(j12)), BitmapDescriptorFactory.HUE_RED, j3.m.i(drawBehind.b()) * c4127zp.c(), 0, 8, null), j3.h.a(c4127zp.d().b(), BitmapDescriptorFactory.HUE_RED), j3.m.e(drawBehind.b(), (j3.m.k(drawBehind.b()) - c4127zp.d().a()) - c4127zp.d().b(), j3.m.i(drawBehind.b()) * c4127zp.c()), BitmapDescriptorFactory.HUE_RED, null, null, 0, 120, null);
        return jn0.h0.f84049a;
    }

    public static final void a(m3.c cVar, androidx.compose.foundation.o scrollState, Dh indicatorSettings) {
        p013kotlin.jvm.internal.s.k(cVar, "<this>");
        p013kotlin.jvm.internal.s.k(scrollState, "scrollState");
        p013kotlin.jvm.internal.s.k(indicatorSettings, "indicatorSettings");
        if (indicatorSettings.b()) {
            float fI = j3.m.i(cVar.b()) * (j3.m.i(cVar.b()) / (j3.m.i(cVar.b()) + scrollState.l()));
            boolean z11 = scrollState.l() > 0;
            float fO1 = cVar.O1(w4.h.g(14)) + j3.m.k(cVar.b());
            float fM = scrollState.m() / scrollState.l();
            if (z11) {
                m3.f.C0(cVar, k3.p1.INSTANCE.f(), j3.h.a(fO1, BitmapDescriptorFactory.HUE_RED), j3.n.a(cVar.O1(indicatorSettings.c()), j3.m.i(cVar.b())), BitmapDescriptorFactory.HUE_RED, null, null, 0, 120, null);
                m3.f.C0(cVar, indicatorSettings.a(), j3.h.a(fO1, Float.min((j3.m.i(cVar.b()) - fI) * fM, j3.m.i(cVar.b()) - fI)), j3.n.a(cVar.O1(indicatorSettings.c()), fI), BitmapDescriptorFactory.HUE_RED, null, null, 0, 120, null);
            }
        }
    }

    private static final float a(androidx.compose.foundation.o oVar) {
        if (oVar.l() > 0) {
            return Math.min((oVar.l() - oVar.m()) / Ko.f26627a.a(), 1.0f);
        }
        return 1.0f;
    }
}
