package com.fourthline.orca.internal;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.fourthline.orca.core.flavor.OrcaFlavor;
import com.fourthline.orca.core.flavor.OrcaFlavorExtensionsKt;
import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.UninitializedPropertyAccessException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.up, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3911up {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p020r2.g2 f35933a = p020r2.w.f(new wn0.a() { // from class: com.fourthline.orca.internal.kf1
        @Override // wn0.a
        public final Object invoke() {
            return AbstractC3911up.b();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p020r2.g2 f35934b = p020r2.w.f(new wn0.a() { // from class: com.fourthline.orca.internal.lf1
        @Override // wn0.a
        public final Object invoke() {
            return AbstractC3911up.d();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p020r2.g2 f35935c = p020r2.w.f(new wn0.a() { // from class: com.fourthline.orca.internal.mf1
        @Override // wn0.a
        public final Object invoke() {
            return AbstractC3911up.a();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p020r2.g2 f35936d = p020r2.w.f(new wn0.a() { // from class: com.fourthline.orca.internal.nf1
        @Override // wn0.a
        public final Object invoke() {
            return AbstractC3911up.e();
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p020r2.g2 f35937e = p020r2.w.f(new wn0.a() { // from class: com.fourthline.orca.internal.of1
        @Override // wn0.a
        public final Object invoke() {
            return AbstractC3911up.c();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(InterfaceC3868tp interfaceC3868tp, wn0.p pVar, int i11, int i12, p020r2.l lVar, int i13) {
        a(interfaceC3868tp, pVar, lVar, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    private static final Lo b(OrcaFlavor orcaFlavor, p020r2.l lVar, int i11) {
        lVar.o(-321634504);
        if (p020r2.o.J()) {
            p020r2.o.S(-321634504, i11, -1, "com.fourthline.orca.core.internal.styling.<get-orcaLayouts> (OrcaTheme.kt:71)");
        }
        Lo loA = Mo.a(orcaFlavor.getLayouts(), lVar, 0);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.l();
        return loA;
    }

    private static final Resources c(OrcaFlavor orcaFlavor, p020r2.l lVar, int i11) {
        lVar.o(803006989);
        if (p020r2.o.J()) {
            p020r2.o.S(803006989, i11, -1, "com.fourthline.orca.core.internal.styling.<get-orcaResources> (OrcaTheme.kt:75)");
        }
        Context context = (Context) lVar.U(AndroidCompositionLocals_androidKt.g());
        Resources resourcesA = AbstractC3972w5.a(context, AbstractC3972w5.a(context, orcaFlavor.getLocalization()));
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.l();
        return resourcesA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3824so d() {
        throw new UninitializedPropertyAccessException("OrcaColors is not initialised.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Resources e() {
        throw new UninitializedPropertyAccessException();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    public static final void a(InterfaceC3868tp interfaceC3868tp, final wn0.p content, p020r2.l lVar, final int i11, final int i12) {
        int i13;
        OrcaStyling c3482kpC;
        OrcaFlavor orcaFlavorB;
        int i14;
        final InterfaceC3868tp aVar = interfaceC3868tp;
        p013kotlin.jvm.internal.s.k(content, "content");
        p020r2.l lVarV = lVar.v(-1837636059);
        if ((i11 & 6) == 0) {
            if ((i12 & 1) != 0) {
                i14 = 2;
            } else {
                if ((i11 & 8) == 0 ? lVarV.n(aVar) : lVarV.K(aVar)) {
                    i14 = 4;
                } else {
                    i14 = 2;
                }
            }
            i13 = i14 | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= lVarV.K(content) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            lVarV.L();
            if ((i11 & 1) != 0 && !lVarV.k()) {
                lVarV.j();
                if ((i12 & 1) != 0) {
                    i13 &= -15;
                }
            } else if ((i12 & 1) != 0) {
                aVar = new InterfaceC3868tp.a(new OrcaFlavor(null, null, null, null, null, 31, null), false);
                i13 &= -15;
            }
            lVarV.C();
            if (p020r2.o.J()) {
                p020r2.o.S(-1837636059, i13, -1, "com.fourthline.orca.core.internal.styling.OrcaTheme (OrcaTheme.kt:32)");
            }
            lVarV.o(987278184);
            boolean z11 = aVar instanceof InterfaceC3868tp.a;
            if (z11) {
                c3482kpC = OrcaFlavorExtensionsKt.toOrcaStyling(((InterfaceC3868tp.a) aVar).b(), lVarV, 0);
            } else {
                if (!(aVar instanceof InterfaceC3868tp.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                c3482kpC = ((InterfaceC3868tp.b) aVar).c();
            }
            lVarV.l();
            if (z11) {
                orcaFlavorB = ((InterfaceC3868tp.a) aVar).b();
            } else {
                if (!(aVar instanceof InterfaceC3868tp.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                orcaFlavorB = ((InterfaceC3868tp.b) aVar).b();
            }
            p020r2.w.b(new p020r2.h2[]{f35935c.d(c3482kpC.getPalettes().getColors()), f35933a.d(c3482kpC.getElements()), f35934b.d(a(orcaFlavorB, lVarV, 0)), f35937e.d(b(orcaFlavorB, lVarV, 0)), f35936d.d(c(orcaFlavorB, lVarV, 0)), AbstractC3391ij.b().d(new A4(aVar.a()))}, content, lVarV, (i13 & 112) | p020r2.h2.f106566i);
            lq.b.f(lq.c.e(null, lVarV, 0, 1), c3482kpC.getElements().getScreen().getBackground().a(lVarV, 0), false, false, null, 14, null);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.pf1
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3911up.a(aVar, content, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrcaStylingElements b() {
        throw new UninitializedPropertyAccessException("OrcaStylingElements is not initialised.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Lo c() {
        w4.h.Companion companion = w4.h.INSTANCE;
        return new Lo(companion.c(), companion.c(), companion.c(), companion.c(), companion.c(), null);
    }

    private static final C3824so a(OrcaFlavor orcaFlavor, p020r2.l lVar, int i11) {
        C3824so c3824soA;
        lVar.o(-834905235);
        if (p020r2.o.J()) {
            p020r2.o.S(-834905235, i11, -1, "com.fourthline.orca.core.internal.styling.<get-orcaColors> (OrcaTheme.kt:63)");
        }
        if (q1.m.a(lVar, 0)) {
            lVar.o(400644713);
            c3824soA = AbstractC3867to.a(orcaFlavor.getColorsDark(), false, lVar, 48, 0);
            lVar.l();
        } else {
            lVar.o(400716695);
            c3824soA = AbstractC3867to.a(orcaFlavor.getColorsLight(), false, lVar, 0, 1);
            lVar.l();
        }
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.l();
        return c3824soA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map a() {
        throw new UninitializedPropertyAccessException("OrcaColorDefaults is not initialised.");
    }
}
