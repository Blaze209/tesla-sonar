package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Ls {

    static final class a implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ wn0.p f26851a;

        a(wn0.p pVar) {
            this.f26851a = pVar;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(741257864, i11, -1, "com.fourthline.orca.core.internal.composable.text.DisableFontScaling.<anonymous> (PreventFontScaling.kt:22)");
            }
            this.f26851a.invoke(lVar, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((p020r2.l) obj, ((Number) obj2).intValue());
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(boolean z11, wn0.p pVar, int i11, int i12, p020r2.l lVar, int i13) {
        a(z11, pVar, lVar, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    public static final void a(final boolean z11, final wn0.p content, p020r2.l lVar, final int i11, final int i12) {
        int i13;
        p013kotlin.jvm.internal.s.k(content, "content");
        p020r2.l lVarV = lVar.v(-450872445);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.p(z11) ? 4 : 2) | i11;
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
            if (i14 != 0) {
                z11 = true;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-450872445, i13, -1, "com.fourthline.orca.core.internal.composable.text.DisableFontScaling (PreventFontScaling.kt:14)");
            }
            if (z11) {
                lVarV.o(1844616301);
                p020r2.w.a(androidx.compose.ui.platform.z0.g().d(w4.f.a(((w4.d) lVarV.U(androidx.compose.ui.platform.z0.g())).getDensity(), 1.0f)), z2.c.e(741257864, true, new a(content), lVarV, 54), lVarV, p020r2.h2.f106566i | 48);
                lVarV.l();
            } else {
                lVarV.o(1844846941);
                content.invoke(lVarV, Integer.valueOf((i13 >> 3) & 14));
                lVarV.l();
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.hi0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Ls.a(z11, content, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
