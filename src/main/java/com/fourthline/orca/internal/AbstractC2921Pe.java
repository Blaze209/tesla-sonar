package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2921Pe {
    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(C2916Oe c2916Oe, boolean z11, wn0.a aVar, int i11, int i12, p020r2.l lVar, int i13) {
        a(c2916Oe, z11, aVar, lVar, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    public static final void a(final C2916Oe enlarged, boolean z11, final wn0.a onCloseEnlargeButtonClicked, p020r2.l lVar, final int i11, final int i12) {
        int i13;
        boolean z12;
        int i14;
        boolean z13;
        p020r2.l lVar2;
        final boolean z14;
        p020r2.w2 w2VarX;
        p013kotlin.jvm.internal.s.k(enlarged, "enlarged");
        p013kotlin.jvm.internal.s.k(onCloseEnlargeButtonClicked, "onCloseEnlargeButtonClicked");
        p020r2.l lVarV = lVar.v(-1711928748);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.K(enlarged) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 == 0) {
            if ((i11 & 48) == 0) {
                z12 = z11;
                i13 |= lVarV.p(z12) ? 32 : 16;
            }
            if ((i12 & 4) != 0) {
                i13 |= KyberEngine.KyberPolyBytes;
            } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                if (lVarV.K(onCloseEnlargeButtonClicked)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i13 |= i14;
            }
            if ((i13 & 147) == 146 || !lVarV.b()) {
                if (i15 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1711928748, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.EnlargedState (EnlargedState.kt:30)");
                }
                OrcaStylingElements.ScannerConfirmationElement confirmation = C3825sp.f35377a.b(lVarV, 6).getScanner().getConfirmation();
                long jA = confirmation.getBackground().a(lVarV, 0);
                lVar2 = lVarV;
                p016o2.b0.a(androidx.compose.foundation.layout.x.f(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), null, null, null, null, 0, jA, 0L, null, z2.c.e(195518307, true, new a(enlarged, jA, z13, confirmation, onCloseEnlargeButtonClicked), lVarV, 54), lVar2, 805306374, 446);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                z14 = z13;
            } else {
                lVarV.j();
                z14 = z12;
                lVar2 = lVarV;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.al0
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC2921Pe.a(enlarged, z14, onCloseEnlargeButtonClicked, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        z12 = z11;
        if ((i12 & 4) != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            if (lVarV.K(onCloseEnlargeButtonClicked)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i13 |= i14;
        }
        if ((i13 & 147) == 146) {
            if (i15 != 0) {
                z13 = false;
            } else {
                z13 = z12;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1711928748, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.EnlargedState (EnlargedState.kt:30)");
            }
            OrcaStylingElements.ScannerConfirmationElement confirmation2 = C3825sp.f35377a.b(lVarV, 6).getScanner().getConfirmation();
            long jA2 = confirmation2.getBackground().a(lVarV, 0);
            lVar2 = lVarV;
            p016o2.b0.a(androidx.compose.foundation.layout.x.f(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), null, null, null, null, 0, jA2, 0L, null, z2.c.e(195518307, true, new a(enlarged, jA2, z13, confirmation2, onCloseEnlargeButtonClicked), lVarV, 54), lVar2, 805306374, 446);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            z14 = z13;
        } else {
            if (i15 != 0) {
                z13 = false;
            } else {
                z13 = z12;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1711928748, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.EnlargedState (EnlargedState.kt:30)");
            }
            OrcaStylingElements.ScannerConfirmationElement confirmation3 = C3825sp.f35377a.b(lVarV, 6).getScanner().getConfirmation();
            long jA3 = confirmation3.getBackground().a(lVarV, 0);
            lVar2 = lVarV;
            p016o2.b0.a(androidx.compose.foundation.layout.x.f(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), null, null, null, null, 0, jA3, 0L, null, z2.c.e(195518307, true, new a(enlarged, jA3, z13, confirmation3, onCloseEnlargeButtonClicked), lVarV, 54), lVar2, 805306374, 446);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            z14 = z13;
        }
        w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.al0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC2921Pe.a(enlarged, z14, onCloseEnlargeButtonClicked, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Pe$a */
    static final class a implements wn0.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2916Oe f27332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f27333b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f27334c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ OrcaStylingElements.ScannerConfirmationElement f27335d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.a f27336e;

        a(C2916Oe c2916Oe, long j11, boolean z11, OrcaStylingElements.ScannerConfirmationElement scannerConfirmationElement, wn0.a aVar) {
            this.f27332a = c2916Oe;
            this.f27333b = j11;
            this.f27334c = z11;
            this.f27335d = scannerConfirmationElement;
            this.f27336e = aVar;
        }

        public final void a(v1.y scaffoldPadding, p020r2.l lVar, int i11) {
            int i12;
            p013kotlin.jvm.internal.s.k(scaffoldPadding, "scaffoldPadding");
            if ((i11 & 6) == 0) {
                i12 = i11 | (lVar.n(scaffoldPadding) ? 4 : 2);
            } else {
                i12 = i11;
            }
            if ((i12 & 19) == 18 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(195518307, i12, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.EnlargedState.<anonymous> (EnlargedState.kt:37)");
            }
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.t.h(v1.p0.c(androidx.compose.foundation.layout.x.h(companion, BitmapDescriptorFactory.HUE_RED, 1, null), v1.s0.d(v1.m0.INSTANCE, lVar, 6)), scaffoldPadding);
            C2916Oe c2916Oe = this.f27332a;
            long j11 = this.f27333b;
            boolean z11 = this.f27334c;
            OrcaStylingElements.ScannerConfirmationElement scannerConfirmationElement = this.f27335d;
            final wn0.a aVar = this.f27336e;
            z3.i0 i0VarA = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVar, 0);
            int iA = p020r2.j.a(lVar, 0);
            p020r2.x xVarC = lVar.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVar, dVarH);
            b4.g.Companion companion2 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion2.a();
            if (lVar.w() == null) {
                p020r2.j.c();
            }
            lVar.h();
            if (lVar.getInserting()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            p020r2.l lVarA = p020r2.d4.a(lVar);
            p020r2.d4.b(lVarA, i0VarA, companion2.c());
            p020r2.d4.b(lVarA, xVarC, companion2.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB = companion2.b();
            if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE, companion2.d());
            Ao.a(v1.i.b(v1.j.f117505a, AbstractC3307gk.a(companion, "enlargeImageView", (String) null, 2, (Object) null), 1.0f, false, 2, null), p013kotlin.collections.v.e(c2916Oe.a()), j11, null, z11, lVar, 0, 8);
            StatefulButtonElement tertiary = C3825sp.f35377a.b(lVar, 6).getButton().getTertiary();
            String strC = RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close, 0, 2, null), lVar, 0);
            StatefulButtonElement statefulButtonElementA = StatefulButtonElement.a(tertiary, 0, ButtonElement.a(tertiary.getDefault(), null, TextElement.a(tertiary.getDefault().getText(), null, scannerConfirmationElement.getHeader().getColor(), 1, null), null, null, BitmapDescriptorFactory.HUE_RED, 29, null), null, 5, null);
            lVar.o(1244548055);
            boolean zN = lVar.n(aVar);
            Object objI = lVar.I();
            if (zN || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.l() { // from class: com.fourthline.orca.internal.bl0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC2921Pe.a.a(aVar, (InterfaceC3807sD) obj);
                    }
                };
                lVar.B(objI);
            }
            lVar.l();
            S3.a((androidx.compose.ui.d) null, "closeButton", strC, (String) null, false, statefulButtonElementA, (wn0.l) objI, lVar, 48, 25);
            lVar.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((v1.y) obj, (p020r2.l) obj2, ((Number) obj3).intValue());
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 a(wn0.a aVar, InterfaceC3807sD it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            aVar.invoke();
            return jn0.h0.f84049a;
        }
    }
}
