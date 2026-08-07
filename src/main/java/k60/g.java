package k60;

import e4.i;
import f90.n;
import i4.SpanStyle;
import i4.TextStyle;
import jn0.h0;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p009i2.j1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p013kotlin.text.t;
import p014n4.FontWeight;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import t4.j;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a6\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"", "isOptional", "isShowingPhoneFirst", "Landroidx/compose/ui/d;", "modifier", "Lt4/j;", "textAlign", "Ljn0/h0;", "a", "(ZZLandroidx/compose/ui/d;ILr2/l;II)V", "", "b", "(Ljava/lang/String;)Ljava/lang/String;", "link_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class g {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f85170c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f85171d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f85172e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f85173f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f85174g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f85175h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z11, boolean z12, androidx.compose.ui.d dVar, int i11, int i12, int i13) {
            super(2);
            this.f85170c = z11;
            this.f85171d = z12;
            this.f85172e = dVar;
            this.f85173f = i11;
            this.f85174g = i12;
            this.f85175h = i13;
        }

        public final void a(l lVar, int i11) {
            g.a(this.f85170c, this.f85171d, this.f85172e, this.f85173f, lVar, k2.a(this.f85174g | 1), this.f85175h);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0071  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:79:0x0186  */
    /* JADX WARN: Code duplicated, block: B:82:0x0191  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    public static final void a(boolean z11, boolean z12, androidx.compose.ui.d dVar, int i11, l lVar, int i12, int i13) {
        int i14;
        androidx.compose.ui.d dVar2;
        int i15;
        androidx.compose.ui.d dVar3;
        int i16;
        int iA;
        String strC;
        l lVar2;
        androidx.compose.ui.d dVar4;
        w2 w2VarX;
        l lVarV = lVar.v(749586168);
        if ((i13 & 1) != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            i14 = (lVarV.p(z11) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i12 & 112) == 0) {
            i14 |= lVarV.p(z12) ? 32 : 16;
        }
        int i17 = i13 & 4;
        if (i17 == 0) {
            if ((i12 & 896) == 0) {
                dVar2 = dVar;
                i14 |= lVarV.n(dVar2) ? 256 : 128;
            }
            if ((i12 & 7168) == 0) {
                if ((i13 & 8) == 0) {
                    i15 = i11;
                    int i18 = lVarV.r(i15) ? 2048 : 1024;
                    i14 |= i18;
                } else {
                    i15 = i11;
                }
                i14 |= i18;
            } else {
                i15 = i11;
            }
            if ((i14 & 5851) == 1170 || !lVarV.b()) {
                lVarV.L();
                if ((i12 & 1) != 0 || lVarV.k()) {
                    if (i17 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i13 & 8) != 0) {
                        androidx.compose.ui.d dVar5 = dVar3;
                        i16 = i14 & (-7169);
                        iA = j.INSTANCE.a();
                        dVar2 = dVar5;
                    } else {
                        dVar2 = dVar3;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(749586168, i16, -1, "com.stripe.android.link.ui.LinkTerms (LinkTerms.kt:22)");
                    }
                    if (z12) {
                        lVarV.H(757999763);
                        strC = i.c(c60.i.f18828g, lVarV, 0);
                        lVarV.T();
                    } else if (z11) {
                        lVarV.H(758111301);
                        strC = i.c(c60.i.f18827f, lVarV, 0);
                        lVarV.T();
                    } else {
                        lVarV.H(758189297);
                        strC = i.c(c60.i.f18826e, lVarV, 0);
                        lVarV.T();
                    }
                    String strB = b(strC);
                    j1 j1Var = j1.f74525a;
                    int i19 = j1.f74526b;
                    lVar2 = lVarV;
                    q90.c.b(strB, dVar2, null, n.n(j1Var, lVarV, i19).getPlaceholderText(), TextStyle.e(j1Var.c(lVarV, i19).getCaption(), 0L, 0L, FontWeight.INSTANCE.d(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, j.h(iA), null, 0L, null, null, null, null, null, null, 16744443, null), false, new SpanStyle(j1Var.a(lVarV, i19).j(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null), 0, null, lVar2, (i16 >> 3) & 112, 420);
                    if (o.J()) {
                        o.R();
                    }
                } else {
                    lVarV.j();
                    if ((i13 & 8) != 0) {
                        i14 &= -7169;
                    }
                }
                i16 = i14;
                iA = i15;
                lVarV.C();
                if (o.J()) {
                    o.S(749586168, i16, -1, "com.stripe.android.link.ui.LinkTerms (LinkTerms.kt:22)");
                }
                if (z12) {
                    lVarV.H(757999763);
                    strC = i.c(c60.i.f18828g, lVarV, 0);
                    lVarV.T();
                } else if (z11) {
                    lVarV.H(758111301);
                    strC = i.c(c60.i.f18827f, lVarV, 0);
                    lVarV.T();
                } else {
                    lVarV.H(758189297);
                    strC = i.c(c60.i.f18826e, lVarV, 0);
                    lVarV.T();
                }
                String strB2 = b(strC);
                j1 j1Var2 = j1.f74525a;
                int i110 = j1.f74526b;
                lVar2 = lVarV;
                q90.c.b(strB2, dVar2, null, n.n(j1Var2, lVarV, i110).getPlaceholderText(), TextStyle.e(j1Var2.c(lVarV, i110).getCaption(), 0L, 0L, FontWeight.INSTANCE.d(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, j.h(iA), null, 0L, null, null, null, null, null, null, 16744443, null), false, new SpanStyle(j1Var2.a(lVarV, i110).j(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null), 0, null, lVar2, (i16 >> 3) & 112, 420);
                if (o.J()) {
                    o.R();
                }
            } else {
                lVarV.j();
                lVar2 = lVarV;
                iA = i15;
            }
            dVar4 = dVar2;
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new a(z11, z12, dVar4, iA, i12, i13));
            }
        }
        i14 |= KyberEngine.KyberPolyBytes;
        dVar2 = dVar;
        if ((i12 & 7168) == 0) {
            if ((i13 & 8) == 0) {
                i15 = i11;
                if (lVarV.r(i15)) {
                }
                i14 |= i18;
            } else {
                i15 = i11;
            }
            i14 |= i18;
        } else {
            i15 = i11;
        }
        if ((i14 & 5851) == 1170) {
            lVarV.L();
            if ((i12 & 1) != 0) {
                if (i17 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if ((i13 & 8) != 0) {
                    androidx.compose.ui.d dVar6 = dVar3;
                    i16 = i14 & (-7169);
                    iA = j.INSTANCE.a();
                    dVar2 = dVar6;
                } else {
                    dVar2 = dVar3;
                    i16 = i14;
                    iA = i15;
                }
            } else {
                if (i17 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if ((i13 & 8) != 0) {
                    androidx.compose.ui.d dVar7 = dVar3;
                    i16 = i14 & (-7169);
                    iA = j.INSTANCE.a();
                    dVar2 = dVar7;
                } else {
                    dVar2 = dVar3;
                    i16 = i14;
                    iA = i15;
                }
            }
            lVarV.C();
            if (o.J()) {
                o.S(749586168, i16, -1, "com.stripe.android.link.ui.LinkTerms (LinkTerms.kt:22)");
            }
            if (z12) {
                lVarV.H(757999763);
                strC = i.c(c60.i.f18828g, lVarV, 0);
                lVarV.T();
            } else if (z11) {
                lVarV.H(758111301);
                strC = i.c(c60.i.f18827f, lVarV, 0);
                lVarV.T();
            } else {
                lVarV.H(758189297);
                strC = i.c(c60.i.f18826e, lVarV, 0);
                lVarV.T();
            }
            String strB3 = b(strC);
            j1 j1Var3 = j1.f74525a;
            int i111 = j1.f74526b;
            lVar2 = lVarV;
            q90.c.b(strB3, dVar2, null, n.n(j1Var3, lVarV, i111).getPlaceholderText(), TextStyle.e(j1Var3.c(lVarV, i111).getCaption(), 0L, 0L, FontWeight.INSTANCE.d(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, j.h(iA), null, 0L, null, null, null, null, null, null, 16744443, null), false, new SpanStyle(j1Var3.a(lVarV, i111).j(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null), 0, null, lVar2, (i16 >> 3) & 112, 420);
            if (o.J()) {
                o.R();
            }
        } else {
            lVarV.L();
            if ((i12 & 1) != 0) {
                if (i17 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if ((i13 & 8) != 0) {
                    androidx.compose.ui.d dVar8 = dVar3;
                    i16 = i14 & (-7169);
                    iA = j.INSTANCE.a();
                    dVar2 = dVar8;
                } else {
                    dVar2 = dVar3;
                    i16 = i14;
                    iA = i15;
                }
            } else {
                if (i17 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if ((i13 & 8) != 0) {
                    androidx.compose.ui.d dVar9 = dVar3;
                    i16 = i14 & (-7169);
                    iA = j.INSTANCE.a();
                    dVar2 = dVar9;
                } else {
                    dVar2 = dVar3;
                    i16 = i14;
                    iA = i15;
                }
            }
            lVarV.C();
            if (o.J()) {
                o.S(749586168, i16, -1, "com.stripe.android.link.ui.LinkTerms (LinkTerms.kt:22)");
            }
            if (z12) {
                lVarV.H(757999763);
                strC = i.c(c60.i.f18828g, lVarV, 0);
                lVarV.T();
            } else if (z11) {
                lVarV.H(758111301);
                strC = i.c(c60.i.f18827f, lVarV, 0);
                lVarV.T();
            } else {
                lVarV.H(758189297);
                strC = i.c(c60.i.f18826e, lVarV, 0);
                lVarV.T();
            }
            String strB4 = b(strC);
            j1 j1Var4 = j1.f74525a;
            int i112 = j1.f74526b;
            lVar2 = lVarV;
            q90.c.b(strB4, dVar2, null, n.n(j1Var4, lVarV, i112).getPlaceholderText(), TextStyle.e(j1Var4.c(lVarV, i112).getCaption(), 0L, 0L, FontWeight.INSTANCE.d(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, j.h(iA), null, 0L, null, null, null, null, null, null, 16744443, null), false, new SpanStyle(j1Var4.a(lVarV, i112).j(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null), 0, null, lVar2, (i16 >> 3) & 112, 420);
            if (o.J()) {
                o.R();
            }
        }
        dVar4 = dVar2;
        w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new a(z11, z12, dVar4, iA, i12, i13));
        }
    }

    private static final String b(String str) {
        return t.V(t.V(t.V(t.V(str, "<terms>", "<a href=\"https://link.co/terms\">", false, 4, null), "</terms>", "</a>", false, 4, null), "<privacy>", "<a href=\"https://link.co/privacy\">", false, 4, null), "</privacy>", "</a>", false, 4, null);
    }
}
