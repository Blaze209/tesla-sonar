package p023w50;

import androidx.compose.foundation.layout.t;
import androidx.compose.ui.d;
import b4.g;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d3.c;
import e4.e;
import e4.i;
import i4.TextStyle;
import i40.k;
import jn0.h0;
import k3.q1;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p009i2.v2;
import p009i2.x;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.d4;
import p020r2.j;
import p020r2.k2;
import p020r2.o;
import p020r2.w2;
import p020r2.y2;
import q1.b0;
import v1.b;
import v1.e0;
import v1.g0;
import w4.h;
import wn0.p;
import wn0.q;
import z3.a0;
import z3.i0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aA\u0010\n\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "enabled", "", "buttonLabel", "Lkotlin/Function0;", "Ljn0/h0;", "onButtonClick", "Landroidx/compose/ui/d;", "modifier", "description", "a", "(ZLjava/lang/String;Lwn0/a;Landroidx/compose/ui/d;Ljava/lang/String;Lr2/l;II)V", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class l {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f120942c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f120943d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f120944e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ d f120945f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f120946g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f120947h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f120948i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z11, String str, wn0.a<h0> aVar, d dVar, String str2, int i11, int i12) {
            super(2);
            this.f120942c = z11;
            this.f120943d = str;
            this.f120944e = aVar;
            this.f120945f = dVar;
            this.f120946g = str2;
            this.f120947h = i11;
            this.f120948i = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            l.a(this.f120942c, this.f120943d, this.f120944e, this.f120945f, this.f120946g, lVar, k2.a(this.f120947h | 1), this.f120948i);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9 A[PHI: r4 r9
      0x00c9: PHI (r4v22 int) = (r4v15 int), (r4v15 int), (r4v24 int) binds: [B:73:0x00d5, B:67:0x00c6, B:68:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x00c9: PHI (r9v13 androidx.compose.ui.d) = (r9v3 androidx.compose.ui.d), (r9v2 androidx.compose.ui.d), (r9v2 androidx.compose.ui.d) binds: [B:73:0x00d5, B:67:0x00c6, B:68:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:81:0x0106  */
    /* JADX WARN: Code duplicated, block: B:84:0x0187  */
    /* JADX WARN: Code duplicated, block: B:87:0x0193  */
    /* JADX WARN: Code duplicated, block: B:88:0x0197  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:96:0x02b5  */
    public static final void a(boolean z11, String buttonLabel, wn0.a<h0> onButtonClick, d dVar, String str, p020r2.l lVar, int i11, int i12) {
        int i13;
        d dVar2;
        String str2;
        String strC;
        int i14;
        d dVar3;
        float fB;
        int iA;
        wn0.a<g> aVarA;
        p020r2.l lVarA;
        p<g, Integer, h0> pVarB;
        p020r2.l lVar2;
        String str3;
        d dVar4;
        w2 w2VarX;
        int i15;
        s.k(buttonLabel, "buttonLabel");
        s.k(onButtonClick, "onButtonClick");
        p020r2.l lVarV = lVar.v(-1420994006);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (lVarV.p(z11) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= lVarV.n(buttonLabel) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & 896) == 0) {
            i13 |= lVarV.K(onButtonClick) ? 256 : 128;
        }
        int i16 = i12 & 8;
        if (i16 == 0) {
            if ((i11 & 7168) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 2048 : 1024;
            }
            if ((57344 & i11) == 0) {
                if ((i12 & 16) == 0) {
                    str2 = str;
                    if (lVarV.n(str2)) {
                        i15 = 16384;
                    }
                    i13 |= i15;
                } else {
                    str2 = str;
                }
                i15 = PKIFailureInfo.certRevoked;
                i13 |= i15;
            } else {
                str2 = str;
            }
            if ((46811 & i13) == 9362 || !lVarV.b()) {
                lVarV.L();
                if ((i11 & 1) != 0 || lVarV.k()) {
                    if (i16 != 0) {
                        dVar2 = d.INSTANCE;
                    }
                    if ((i12 & 16) != 0) {
                        strC = i.c(k.f75887s0, lVarV, 0);
                        d dVar5 = dVar2;
                        i14 = i13 & (-57345);
                        dVar3 = dVar5;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1420994006, i14, -1, "com.stripe.android.financialconnections.ui.components.TestModeBanner (TestModeBanner.kt:31)");
                    }
                    if (z11) {
                        lVarV.H(1167019282);
                        fB = x.f75438a.c(lVarV, x.f75439b);
                    } else {
                        lVarV.H(1167020022);
                        fB = x.f75438a.b(lVarV, x.f75439b);
                    }
                    lVarV.T();
                    c.InterfaceC1212c interfaceC1212cI = c.INSTANCE.i();
                    float f11 = 8;
                    b.f fVarN = b.f117444a.n(h.g(f11));
                    d dVarH = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
                    p026y50.d dVar6 = p026y50.d.f125064a;
                    d dVarJ = t.j(h3.a.a(androidx.compose.foundation.b.c(dVarH, dVar6.a(lVarV, 6).getBackgroundCaution(), a2.g.c(h.g(12))), fB), h.g(16), h.g(f11));
                    lVarV.H(693286680);
                    i0 i0VarB = e0.b(fVarN, interfaceC1212cI, lVarV, 54);
                    lVarV.H(-1323940314);
                    iA = j.a(lVarV, 0);
                    p020r2.x xVarC = lVarV.c();
                    g.Companion companion = g.INSTANCE;
                    aVarA = companion.a();
                    q<y2<g>, p020r2.l, Integer, h0> qVarA = a0.a(dVarJ);
                    if (lVarV.w() == null) {
                        j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d4.b(lVarA, i0VarB, companion.c());
                    d4.b(lVarA, xVarC, companion.e());
                    pVarB = companion.b();
                    if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                    lVarV.H(2058660585);
                    v1.h0 h0Var = v1.h0.f117504a;
                    int i17 = i14;
                    b0.a(e.c(i40.i.f75839e, lVarV, 0), null, null, null, null, BitmapDescriptorFactory.HUE_RED, q1.Companion.b(q1.INSTANCE, dVar6.a(lVarV, 6).getIconCaution(), 0, 2, null), lVarV, 56, 60);
                    TextStyle bodyMedium = dVar6.b(lVarV, 6).getBodyMedium();
                    d.Companion companion2 = d.INSTANCE;
                    String str4 = strC;
                    v2.b(str4, g0.c(h0Var, companion2, 1.0f, false, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyMedium, lVarV, (i17 >> 12) & 14, 0, 65532);
                    d dVar7 = dVar3;
                    v2.b(buttonLabel, androidx.compose.foundation.d.d(companion2, z11, null, null, onButtonClick, 6, null), dVar6.a(lVarV, 6).getTextBrand(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, dVar6.b(lVarV, 6).getBodyMediumEmphasized(), lVarV, (i17 >> 3) & 14, 0, 65528);
                    lVar2 = lVarV;
                    lVar2.T();
                    lVar2.g();
                    lVar2.T();
                    lVar2.T();
                    if (o.J()) {
                        o.R();
                    }
                    str3 = str4;
                    dVar4 = dVar7;
                } else {
                    lVarV.j();
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                    }
                }
                d dVar8 = dVar2;
                i14 = i13;
                dVar3 = dVar8;
                strC = str2;
                lVarV.C();
                if (o.J()) {
                    o.S(-1420994006, i14, -1, "com.stripe.android.financialconnections.ui.components.TestModeBanner (TestModeBanner.kt:31)");
                }
                if (z11) {
                    lVarV.H(1167019282);
                    fB = x.f75438a.c(lVarV, x.f75439b);
                } else {
                    lVarV.H(1167020022);
                    fB = x.f75438a.b(lVarV, x.f75439b);
                }
                lVarV.T();
                c.InterfaceC1212c interfaceC1212cI2 = c.INSTANCE.i();
                float f12 = 8;
                b.f fVarN2 = b.f117444a.n(h.g(f12));
                d dVarH2 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
                p026y50.d dVar9 = p026y50.d.f125064a;
                d dVarJ2 = t.j(h3.a.a(androidx.compose.foundation.b.c(dVarH2, dVar9.a(lVarV, 6).getBackgroundCaution(), a2.g.c(h.g(12))), fB), h.g(16), h.g(f12));
                lVarV.H(693286680);
                i0 i0VarB2 = e0.b(fVarN2, interfaceC1212cI2, lVarV, 54);
                lVarV.H(-1323940314);
                iA = j.a(lVarV, 0);
                p020r2.x xVarC2 = lVarV.c();
                g.Companion companion3 = g.INSTANCE;
                aVarA = companion3.a();
                q<y2<g>, p020r2.l, Integer, h0> qVarA2 = a0.a(dVarJ2);
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d4.b(lVarA, i0VarB2, companion3.c());
                d4.b(lVarA, xVarC2, companion3.e());
                pVarB = companion3.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA2.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                v1.h0 h0Var2 = v1.h0.f117504a;
                int i18 = i14;
                b0.a(e.c(i40.i.f75839e, lVarV, 0), null, null, null, null, BitmapDescriptorFactory.HUE_RED, q1.Companion.b(q1.INSTANCE, dVar9.a(lVarV, 6).getIconCaution(), 0, 2, null), lVarV, 56, 60);
                TextStyle bodyMedium2 = dVar9.b(lVarV, 6).getBodyMedium();
                d.Companion companion4 = d.INSTANCE;
                String str5 = strC;
                v2.b(str5, g0.c(h0Var2, companion4, 1.0f, false, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyMedium2, lVarV, (i18 >> 12) & 14, 0, 65532);
                d dVar10 = dVar3;
                v2.b(buttonLabel, androidx.compose.foundation.d.d(companion4, z11, null, null, onButtonClick, 6, null), dVar9.a(lVarV, 6).getTextBrand(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, dVar9.b(lVarV, 6).getBodyMediumEmphasized(), lVarV, (i18 >> 3) & 14, 0, 65528);
                lVar2 = lVarV;
                lVar2.T();
                lVar2.g();
                lVar2.T();
                lVar2.T();
                if (o.J()) {
                    o.R();
                }
                str3 = str5;
                dVar4 = dVar10;
            } else {
                lVarV.j();
                dVar4 = dVar2;
                str3 = str2;
                lVar2 = lVarV;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new a(z11, buttonLabel, onButtonClick, dVar4, str3, i11, i12));
            }
        }
        i13 |= 3072;
        dVar2 = dVar;
        if ((57344 & i11) == 0) {
            if ((i12 & 16) == 0) {
                str2 = str;
                if (lVarV.n(str2)) {
                    i15 = 16384;
                }
                i13 |= i15;
            } else {
                str2 = str;
            }
            i15 = PKIFailureInfo.certRevoked;
            i13 |= i15;
        } else {
            str2 = str;
        }
        if ((46811 & i13) == 9362) {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i16 != 0) {
                    dVar2 = d.INSTANCE;
                }
                if ((i12 & 16) != 0) {
                    strC = i.c(k.f75887s0, lVarV, 0);
                    d dVar11 = dVar2;
                    i14 = i13 & (-57345);
                    dVar3 = dVar11;
                } else {
                    d dVar12 = dVar2;
                    i14 = i13;
                    dVar3 = dVar12;
                    strC = str2;
                }
            } else {
                if (i16 != 0) {
                    dVar2 = d.INSTANCE;
                }
                if ((i12 & 16) != 0) {
                    strC = i.c(k.f75887s0, lVarV, 0);
                    d dVar13 = dVar2;
                    i14 = i13 & (-57345);
                    dVar3 = dVar13;
                } else {
                    d dVar14 = dVar2;
                    i14 = i13;
                    dVar3 = dVar14;
                    strC = str2;
                }
            }
            lVarV.C();
            if (o.J()) {
                o.S(-1420994006, i14, -1, "com.stripe.android.financialconnections.ui.components.TestModeBanner (TestModeBanner.kt:31)");
            }
            if (z11) {
                lVarV.H(1167019282);
                fB = x.f75438a.c(lVarV, x.f75439b);
            } else {
                lVarV.H(1167020022);
                fB = x.f75438a.b(lVarV, x.f75439b);
            }
            lVarV.T();
            c.InterfaceC1212c interfaceC1212cI3 = c.INSTANCE.i();
            float f13 = 8;
            b.f fVarN3 = b.f117444a.n(h.g(f13));
            d dVarH3 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
            p026y50.d dVar15 = p026y50.d.f125064a;
            d dVarJ3 = t.j(h3.a.a(androidx.compose.foundation.b.c(dVarH3, dVar15.a(lVarV, 6).getBackgroundCaution(), a2.g.c(h.g(12))), fB), h.g(16), h.g(f13));
            lVarV.H(693286680);
            i0 i0VarB3 = e0.b(fVarN3, interfaceC1212cI3, lVarV, 54);
            lVarV.H(-1323940314);
            iA = j.a(lVarV, 0);
            p020r2.x xVarC3 = lVarV.c();
            g.Companion companion5 = g.INSTANCE;
            aVarA = companion5.a();
            q<y2<g>, p020r2.l, Integer, h0> qVarA3 = a0.a(dVarJ3);
            if (lVarV.w() == null) {
                j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarB3, companion5.c());
            d4.b(lVarA, xVarC3, companion5.e());
            pVarB = companion5.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA3.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.h0 h0Var3 = v1.h0.f117504a;
            int i19 = i14;
            b0.a(e.c(i40.i.f75839e, lVarV, 0), null, null, null, null, BitmapDescriptorFactory.HUE_RED, q1.Companion.b(q1.INSTANCE, dVar15.a(lVarV, 6).getIconCaution(), 0, 2, null), lVarV, 56, 60);
            TextStyle bodyMedium3 = dVar15.b(lVarV, 6).getBodyMedium();
            d.Companion companion6 = d.INSTANCE;
            String str6 = strC;
            v2.b(str6, g0.c(h0Var3, companion6, 1.0f, false, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyMedium3, lVarV, (i19 >> 12) & 14, 0, 65532);
            d dVar16 = dVar3;
            v2.b(buttonLabel, androidx.compose.foundation.d.d(companion6, z11, null, null, onButtonClick, 6, null), dVar15.a(lVarV, 6).getTextBrand(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, dVar15.b(lVarV, 6).getBodyMediumEmphasized(), lVarV, (i19 >> 3) & 14, 0, 65528);
            lVar2 = lVarV;
            lVar2.T();
            lVar2.g();
            lVar2.T();
            lVar2.T();
            if (o.J()) {
                o.R();
            }
            str3 = str6;
            dVar4 = dVar16;
        } else {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i16 != 0) {
                    dVar2 = d.INSTANCE;
                }
                if ((i12 & 16) != 0) {
                    strC = i.c(k.f75887s0, lVarV, 0);
                    d dVar17 = dVar2;
                    i14 = i13 & (-57345);
                    dVar3 = dVar17;
                } else {
                    d dVar18 = dVar2;
                    i14 = i13;
                    dVar3 = dVar18;
                    strC = str2;
                }
            } else {
                if (i16 != 0) {
                    dVar2 = d.INSTANCE;
                }
                if ((i12 & 16) != 0) {
                    strC = i.c(k.f75887s0, lVarV, 0);
                    d dVar19 = dVar2;
                    i14 = i13 & (-57345);
                    dVar3 = dVar19;
                } else {
                    d dVar110 = dVar2;
                    i14 = i13;
                    dVar3 = dVar110;
                    strC = str2;
                }
            }
            lVarV.C();
            if (o.J()) {
                o.S(-1420994006, i14, -1, "com.stripe.android.financialconnections.ui.components.TestModeBanner (TestModeBanner.kt:31)");
            }
            if (z11) {
                lVarV.H(1167019282);
                fB = x.f75438a.c(lVarV, x.f75439b);
            } else {
                lVarV.H(1167020022);
                fB = x.f75438a.b(lVarV, x.f75439b);
            }
            lVarV.T();
            c.InterfaceC1212c interfaceC1212cI4 = c.INSTANCE.i();
            float f14 = 8;
            b.f fVarN4 = b.f117444a.n(h.g(f14));
            d dVarH4 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
            p026y50.d dVar111 = p026y50.d.f125064a;
            d dVarJ4 = t.j(h3.a.a(androidx.compose.foundation.b.c(dVarH4, dVar111.a(lVarV, 6).getBackgroundCaution(), a2.g.c(h.g(12))), fB), h.g(16), h.g(f14));
            lVarV.H(693286680);
            i0 i0VarB4 = e0.b(fVarN4, interfaceC1212cI4, lVarV, 54);
            lVarV.H(-1323940314);
            iA = j.a(lVarV, 0);
            p020r2.x xVarC4 = lVarV.c();
            g.Companion companion7 = g.INSTANCE;
            aVarA = companion7.a();
            q<y2<g>, p020r2.l, Integer, h0> qVarA4 = a0.a(dVarJ4);
            if (lVarV.w() == null) {
                j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarB4, companion7.c());
            d4.b(lVarA, xVarC4, companion7.e());
            pVarB = companion7.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA4.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.h0 h0Var4 = v1.h0.f117504a;
            int i110 = i14;
            b0.a(e.c(i40.i.f75839e, lVarV, 0), null, null, null, null, BitmapDescriptorFactory.HUE_RED, q1.Companion.b(q1.INSTANCE, dVar111.a(lVarV, 6).getIconCaution(), 0, 2, null), lVarV, 56, 60);
            TextStyle bodyMedium4 = dVar111.b(lVarV, 6).getBodyMedium();
            d.Companion companion8 = d.INSTANCE;
            String str7 = strC;
            v2.b(str7, g0.c(h0Var4, companion8, 1.0f, false, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyMedium4, lVarV, (i110 >> 12) & 14, 0, 65532);
            d dVar112 = dVar3;
            v2.b(buttonLabel, androidx.compose.foundation.d.d(companion8, z11, null, null, onButtonClick, 6, null), dVar111.a(lVarV, 6).getTextBrand(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, dVar111.b(lVarV, 6).getBodyMediumEmphasized(), lVarV, (i110 >> 3) & 14, 0, 65528);
            lVar2 = lVarV;
            lVar2.T();
            lVar2.g();
            lVar2.T();
            lVar2.T();
            if (o.J()) {
                o.R();
            }
            str3 = str7;
            dVar4 = dVar112;
        }
        w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new a(z11, buttonLabel, onButtonClick, dVar4, str3, i11, i12));
        }
    }
}
