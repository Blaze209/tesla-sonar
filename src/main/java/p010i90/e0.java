package p010i90;

import androidx.compose.ui.d;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f90.n;
import jn0.h0;
import k3.p1;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p009i2.j1;
import p009i2.v2;
import p009i2.x;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "text", "Landroidx/compose/ui/d;", "modifier", "", "enabled", "Ljn0/h0;", "a", "(Ljava/lang/String;Landroidx/compose/ui/d;ZLr2/l;II)V", "stripe-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class e0 {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f76476c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f76477d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f76478e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f76479f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f76480g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, d dVar, boolean z11, int i11, int i12) {
            super(2);
            this.f76476c = str;
            this.f76477d = dVar;
            this.f76478e = z11;
            this.f76479f = i11;
            this.f76480g = i12;
        }

        public final void a(l lVar, int i11) {
            e0.a(this.f76476c, this.f76477d, this.f76478e, lVar, k2.a(this.f76479f | 1), this.f76480g);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    public static final void a(String text, d dVar, boolean z11, l lVar, int i11, int i12) {
        int i13;
        d dVar2;
        int i14;
        boolean z12;
        int i15;
        d dVar3;
        boolean z13;
        long placeholderText;
        l lVar2;
        d dVar4;
        boolean z14;
        w2 w2VarX;
        s.k(text, "text");
        l lVarV = lVar.v(614662995);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (lVarV.n(text) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i16 = i12 & 2;
        if (i16 == 0) {
            if ((i11 & 112) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & 896) == 0) {
                    z12 = z11;
                    if (lVarV.p(z12)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                if ((i13 & 731) == 146 || !lVarV.b()) {
                    if (i16 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (o.J()) {
                        o.S(614662995, i13, -1, "com.stripe.android.uicore.elements.FormLabel (FormLabel.kt:14)");
                    }
                    j1 j1Var = j1.f74525a;
                    int i17 = j1.f74526b;
                    placeholderText = n.n(j1Var, lVarV, i17).getPlaceholderText();
                    lVarV.H(-1045711582);
                    if (!z13) {
                        placeholderText = p1.p(placeholderText, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    }
                    lVarV.T();
                    d dVar5 = dVar3;
                    lVar2 = lVarV;
                    v2.b(text, dVar5, placeholderText, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, j1Var.c(lVarV, i17).getSubtitle1(), lVar2, i13 & 126, 0, 65528);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar5;
                    z14 = z13;
                } else {
                    lVarV.j();
                    lVar2 = lVarV;
                    dVar4 = dVar2;
                    z14 = z12;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new a(text, dVar4, z14, i11, i12));
                }
            }
            i13 |= KyberEngine.KyberPolyBytes;
            z12 = z11;
            if ((i13 & 731) == 146) {
                if (i16 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (o.J()) {
                    o.S(614662995, i13, -1, "com.stripe.android.uicore.elements.FormLabel (FormLabel.kt:14)");
                }
                j1 j1Var2 = j1.f74525a;
                int i18 = j1.f74526b;
                placeholderText = n.n(j1Var2, lVarV, i18).getPlaceholderText();
                lVarV.H(-1045711582);
                if (!z13) {
                    placeholderText = p1.p(placeholderText, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                }
                lVarV.T();
                d dVar6 = dVar3;
                lVar2 = lVarV;
                v2.b(text, dVar6, placeholderText, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, j1Var2.c(lVarV, i18).getSubtitle1(), lVar2, i13 & 126, 0, 65528);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar6;
                z14 = z13;
            } else {
                if (i16 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (o.J()) {
                    o.S(614662995, i13, -1, "com.stripe.android.uicore.elements.FormLabel (FormLabel.kt:14)");
                }
                j1 j1Var3 = j1.f74525a;
                int i19 = j1.f74526b;
                placeholderText = n.n(j1Var3, lVarV, i19).getPlaceholderText();
                lVarV.H(-1045711582);
                if (!z13) {
                    placeholderText = p1.p(placeholderText, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                }
                lVarV.T();
                d dVar7 = dVar3;
                lVar2 = lVarV;
                v2.b(text, dVar7, placeholderText, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, j1Var3.c(lVarV, i19).getSubtitle1(), lVar2, i13 & 126, 0, 65528);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar7;
                z14 = z13;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new a(text, dVar4, z14, i11, i12));
            }
        }
        i13 |= 48;
        dVar2 = dVar;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & 896) == 0) {
                z12 = z11;
                if (lVarV.p(z12)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            if ((i13 & 731) == 146) {
                if (i16 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (o.J()) {
                    o.S(614662995, i13, -1, "com.stripe.android.uicore.elements.FormLabel (FormLabel.kt:14)");
                }
                j1 j1Var4 = j1.f74525a;
                int i110 = j1.f74526b;
                placeholderText = n.n(j1Var4, lVarV, i110).getPlaceholderText();
                lVarV.H(-1045711582);
                if (!z13) {
                    placeholderText = p1.p(placeholderText, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                }
                lVarV.T();
                d dVar8 = dVar3;
                lVar2 = lVarV;
                v2.b(text, dVar8, placeholderText, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, j1Var4.c(lVarV, i110).getSubtitle1(), lVar2, i13 & 126, 0, 65528);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar8;
                z14 = z13;
            } else {
                if (i16 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (o.J()) {
                    o.S(614662995, i13, -1, "com.stripe.android.uicore.elements.FormLabel (FormLabel.kt:14)");
                }
                j1 j1Var5 = j1.f74525a;
                int i111 = j1.f74526b;
                placeholderText = n.n(j1Var5, lVarV, i111).getPlaceholderText();
                lVarV.H(-1045711582);
                if (!z13) {
                    placeholderText = p1.p(placeholderText, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                }
                lVarV.T();
                d dVar9 = dVar3;
                lVar2 = lVarV;
                v2.b(text, dVar9, placeholderText, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, j1Var5.c(lVarV, i111).getSubtitle1(), lVar2, i13 & 126, 0, 65528);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar9;
                z14 = z13;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new a(text, dVar4, z14, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        z12 = z11;
        if ((i13 & 731) == 146) {
            if (i16 != 0) {
                dVar3 = d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i14 != 0) {
                z13 = true;
            } else {
                z13 = z12;
            }
            if (o.J()) {
                o.S(614662995, i13, -1, "com.stripe.android.uicore.elements.FormLabel (FormLabel.kt:14)");
            }
            j1 j1Var6 = j1.f74525a;
            int i112 = j1.f74526b;
            placeholderText = n.n(j1Var6, lVarV, i112).getPlaceholderText();
            lVarV.H(-1045711582);
            if (!z13) {
                placeholderText = p1.p(placeholderText, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            }
            lVarV.T();
            d dVar10 = dVar3;
            lVar2 = lVarV;
            v2.b(text, dVar10, placeholderText, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, j1Var6.c(lVarV, i112).getSubtitle1(), lVar2, i13 & 126, 0, 65528);
            if (o.J()) {
                o.R();
            }
            dVar4 = dVar10;
            z14 = z13;
        } else {
            if (i16 != 0) {
                dVar3 = d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i14 != 0) {
                z13 = true;
            } else {
                z13 = z12;
            }
            if (o.J()) {
                o.S(614662995, i13, -1, "com.stripe.android.uicore.elements.FormLabel (FormLabel.kt:14)");
            }
            j1 j1Var7 = j1.f74525a;
            int i113 = j1.f74526b;
            placeholderText = n.n(j1Var7, lVarV, i113).getPlaceholderText();
            lVarV.H(-1045711582);
            if (!z13) {
                placeholderText = p1.p(placeholderText, x.f75438a.b(lVarV, x.f75439b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            }
            lVarV.T();
            d dVar11 = dVar3;
            lVar2 = lVarV;
            v2.b(text, dVar11, placeholderText, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, j1Var7.c(lVarV, i113).getSubtitle1(), lVar2, i13 & 126, 0, 65528);
            if (o.J()) {
                o.R();
            }
            dVar4 = dVar11;
            z14 = z13;
        }
        w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new a(text, dVar4, z14, i11, i12));
        }
    }
}
