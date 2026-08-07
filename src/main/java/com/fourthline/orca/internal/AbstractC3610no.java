package com.fourthline.orca.internal;

import a2.RoundedCornerShape;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import i4.TextStyle;
import m3.Stroke;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p009i2.C4672l;
import p013kotlin.NoWhenBranchMatchedException;
import p014n4.FontWeight;
import q1.BorderStroke;

/* JADX INFO: renamed from: com.fourthline.orca.internal.no, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3610no {
    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(int i11, p020r2.l lVar, int i12) {
        a(lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(androidx.compose.ui.d dVar, String str, StatefulButtonElement statefulButtonElement, InterfaceC3807sD interfaceC3807sD, boolean z11, boolean z12, boolean z13, wn0.l lVar, int i11, int i12, p020r2.l lVar2, int i13) {
        a(dVar, str, statefulButtonElement, interfaceC3807sD, z11, z12, z13, lVar, lVar2, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(androidx.compose.ui.d dVar, E3 e11, boolean z11, wn0.l lVar, int i11, int i12, p020r2.l lVar2, int i13) {
        a(dVar, e11, z11, lVar, lVar2, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(androidx.compose.ui.d dVar, String str, boolean z11, boolean z12, boolean z13, wn0.l lVar, int i11, int i12, p020r2.l lVar2, int i13) {
        a(dVar, str, z11, z12, z13, lVar, lVar2, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(androidx.compose.ui.d dVar, InterfaceC3807sD interfaceC3807sD, boolean z11, boolean z12, boolean z13, wn0.l lVar, int i11, int i12, p020r2.l lVar2, int i13) {
        a(dVar, interfaceC3807sD, z11, z12, z13, lVar, lVar2, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    public static final void a(androidx.compose.ui.d dVar, final E3 state, boolean z11, final wn0.l onClick, p020r2.l lVar, final int i11, final int i12) {
        int i13;
        final androidx.compose.ui.d dVar2;
        final boolean z12;
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(onClick, "onClick");
        p020r2.l lVarV = lVar.v(-1319353535);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.n(dVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= (i11 & 64) == 0 ? lVarV.n(state) : lVarV.K(state) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i13 |= lVarV.p(z11) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= lVarV.K(onClick) ? 2048 : 1024;
        }
        if ((i13 & 1171) == 1170 && lVarV.b()) {
            lVarV.j();
            dVar2 = dVar;
            z12 = z11;
        } else {
            androidx.compose.ui.d dVar3 = i14 != 0 ? androidx.compose.ui.d.INSTANCE : dVar;
            boolean z13 = i15 != 0 ? false : z11;
            if (p020r2.o.J()) {
                p020r2.o.S(-1319353535, i13, -1, "com.fourthline.orca.core.internal.composable.PrimaryButton (OrcaButton.kt:56)");
            }
            int i16 = i13;
            int i17 = i16 << 6;
            a(dVar3, RA.c(state.b(), lVarV, 0), state.c(), state.a(), z13, onClick, lVarV, (i16 & 14) | (57344 & i17) | (i17 & 458752), 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar2 = dVar3;
            z12 = z13;
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.k81
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3610no.a(dVar2, state, z12, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.no$a */
    static final class a implements wn0.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f33974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f33975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ StatefulButtonElement f33976c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f33977d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f33978e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC3807sD f33979f;

        a(boolean z11, float f11, StatefulButtonElement statefulButtonElement, String str, boolean z12, InterfaceC3807sD interfaceC3807sD) {
            this.f33974a = z11;
            this.f33975b = f11;
            this.f33976c = statefulButtonElement;
            this.f33977d = str;
            this.f33978e = z12;
            this.f33979f = interfaceC3807sD;
        }

        public final void a(v1.g0 Button, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(Button, "$this$Button");
            if ((i11 & 17) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1808000628, i11, -1, "com.fourthline.orca.core.internal.composable.OrcaProgressButton.<anonymous>.<anonymous> (OrcaButton.kt:175)");
            }
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.x.D(androidx.compose.foundation.layout.q.c(companion, this.f33974a ? w4.h.g(-this.f33975b) : w4.h.g(0), BitmapDescriptorFactory.HUE_RED, 2, null), null, false, 3, null);
            boolean z11 = this.f33974a;
            float f11 = this.f33975b;
            StatefulButtonElement statefulButtonElement = this.f33976c;
            String str = this.f33977d;
            boolean z12 = this.f33978e;
            InterfaceC3807sD interfaceC3807sD = this.f33979f;
            z3.i0 i0VarB = v1.e0.b(v1.b.f117444a.f(), d3.c.INSTANCE.l(), lVar, 0);
            int iA = p020r2.j.a(lVar, 0);
            p020r2.x xVarC = lVar.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVar, dVarD);
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
            p020r2.d4.b(lVarA, i0VarB, companion2.c());
            p020r2.d4.b(lVarA, xVarC, companion2.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB = companion2.b();
            if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE, companion2.d());
            v1.h0 h0Var = v1.h0.f117504a;
            lVar.o(-1834473971);
            if (z11) {
                AbstractC3610no.a(lVar, 0);
                v1.i0.a(androidx.compose.foundation.layout.x.v(companion, f11), lVar, 6);
            }
            lVar.l();
            Ls.a(false, z2.c.e(223435158, true, new C0589a(statefulButtonElement, str, z12, interfaceC3807sD), lVar, 54), lVar, 48, 1);
            lVar.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((v1.g0) obj, (p020r2.l) obj2, ((Number) obj3).intValue());
            return jn0.h0.f84049a;
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.no$a$a, reason: collision with other inner class name */
        static final class C0589a implements wn0.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ StatefulButtonElement f33980a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f33981b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f33982c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC3807sD f33983d;

            C0589a(StatefulButtonElement statefulButtonElement, String str, boolean z11, InterfaceC3807sD interfaceC3807sD) {
                this.f33980a = statefulButtonElement;
                this.f33981b = str;
                this.f33982c = z11;
                this.f33983d = interfaceC3807sD;
            }

            public final void a(p020r2.l lVar, int i11) {
                if ((i11 & 3) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(223435158, i11, -1, "com.fourthline.orca.core.internal.composable.OrcaProgressButton.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrcaButton.kt:186)");
                }
                TextStyle textStyleA = this.f33980a.getDefault().getText().a(w4.v.b(C3825sp.a.f35378a.a()), lVar, 6, 0);
                androidx.compose.ui.d dVarA = AbstractC3307gk.a(androidx.compose.ui.d.INSTANCE, this.f33981b, (String) null, 2, (Object) null);
                lVar.o(1700138504);
                boolean zP = lVar.p(this.f33982c);
                final boolean z11 = this.f33982c;
                Object objI = lVar.I();
                if (zP || objI == p020r2.l.INSTANCE.a()) {
                    objI = new wn0.l() { // from class: com.fourthline.orca.internal.o81
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return AbstractC3610no.a.C0589a.a(z11, (g4.y) obj);
                        }
                    };
                    lVar.B(objI);
                }
                lVar.l();
                androidx.compose.ui.d dVarD = g4.o.d(dVarA, false, (wn0.l) objI, 1, null);
                String strB = this.f33983d.b(lVar, 0);
                int iA = t4.j.INSTANCE.a();
                E0.a(strB, dVarD, 0L, (p014n4.b0) null, (FontWeight) null, (p014n4.q) null, 0L, (t4.k) null, t4.j.h(iA), 0L, t4.t.INSTANCE.b(), false, 0, 1, (wn0.l) null, textStyleA, lVar, 0, 3078, 23292);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((p020r2.l) obj, ((Number) obj2).intValue());
                return jn0.h0.f84049a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final jn0.h0 a(boolean z11, g4.y semantics) {
                p013kotlin.jvm.internal.s.k(semantics, "$this$semantics");
                if (!z11) {
                    g4.v.l(semantics);
                }
                return jn0.h0.f84049a;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00de  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:89:0x0118  */
    /* JADX WARN: Code duplicated, block: B:93:0x0125  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    public static final void a(androidx.compose.ui.d dVar, final String text, boolean z11, boolean z12, boolean z13, final wn0.l onClick, p020r2.l lVar, final int i11, final int i12) {
        androidx.compose.ui.d dVar2;
        int i13;
        boolean z14;
        int i14;
        boolean z15;
        int i15;
        int i16;
        boolean z16;
        int i17;
        int i18;
        androidx.compose.ui.d dVar3;
        boolean z17;
        boolean z18;
        final androidx.compose.ui.d dVar4;
        final boolean z19;
        final boolean z21;
        final boolean z22;
        p020r2.w2 w2VarX;
        p013kotlin.jvm.internal.s.k(text, "text");
        p013kotlin.jvm.internal.s.k(onClick, "onClick");
        p020r2.l lVarV = lVar.v(1159921265);
        int i19 = i12 & 1;
        if (i19 != 0) {
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
            i13 |= lVarV.n(text) ? 32 : 16;
        }
        int i21 = i12 & 4;
        if (i21 == 0) {
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                z14 = z11;
                i13 |= lVarV.p(z14) ? 256 : 128;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & 3072) == 0) {
                    z15 = z12;
                    if (lVarV.p(z15)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 16;
                if (i16 != 0) {
                    if ((i11 & 24576) == 0) {
                        z16 = z13;
                        if (lVarV.p(z16)) {
                            i17 = 16384;
                        } else {
                            i17 = PKIFailureInfo.certRevoked;
                        }
                        i13 |= i17;
                    }
                    if ((i12 & 32) != 0) {
                        i13 |= 196608;
                    } else if ((i11 & 196608) == 0) {
                        if (lVarV.K(onClick)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i13 |= i18;
                    }
                    if ((74899 & i13) != 74898 && lVarV.b()) {
                        lVarV.j();
                        dVar4 = dVar2;
                        z21 = z14;
                        z19 = z15;
                        z22 = z16;
                    } else {
                        if (i19 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i21 != 0) {
                            z14 = false;
                        }
                        if (i14 != 0) {
                            z17 = true;
                        } else {
                            z17 = z15;
                        }
                        if (i16 != 0) {
                            z18 = false;
                        } else {
                            z18 = z16;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(1159921265, i13, -1, "com.fourthline.orca.core.internal.composable.PrimaryButton (OrcaButton.kt:75)");
                        }
                        int i22 = (i13 & 14) | ((i13 >> 3) & 896) | ((i13 << 3) & 7168) | (57344 & i13) | (i13 & 458752);
                        boolean z23 = z14;
                        a(dVar3, new InterfaceC3807sD.i(text, null, 2, null), z17, z23, z18, onClick, lVarV, i22, 0);
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        dVar4 = dVar3;
                        z19 = z17;
                        z21 = z23;
                        z22 = z18;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.g81
                            @Override // wn0.p
                            public final Object invoke(Object obj, Object obj2) {
                                return AbstractC3610no.a(dVar4, text, z21, z19, z22, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 24576;
                z16 = z13;
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    if (lVarV.K(onClick)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
                if ((74899 & i13) != 74898) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i21 != 0) {
                        z14 = false;
                    }
                    if (i14 != 0) {
                        z17 = true;
                    } else {
                        z17 = z15;
                    }
                    if (i16 != 0) {
                        z18 = false;
                    } else {
                        z18 = z16;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1159921265, i13, -1, "com.fourthline.orca.core.internal.composable.PrimaryButton (OrcaButton.kt:75)");
                    }
                    int i23 = (i13 & 14) | ((i13 >> 3) & 896) | ((i13 << 3) & 7168) | (57344 & i13) | (i13 & 458752);
                    boolean z24 = z14;
                    a(dVar3, new InterfaceC3807sD.i(text, null, 2, null), z17, z24, z18, onClick, lVarV, i23, 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    dVar4 = dVar3;
                    z19 = z17;
                    z21 = z24;
                    z22 = z18;
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i21 != 0) {
                        z14 = false;
                    }
                    if (i14 != 0) {
                        z17 = true;
                    } else {
                        z17 = z15;
                    }
                    if (i16 != 0) {
                        z18 = false;
                    } else {
                        z18 = z16;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1159921265, i13, -1, "com.fourthline.orca.core.internal.composable.PrimaryButton (OrcaButton.kt:75)");
                    }
                    int i24 = (i13 & 14) | ((i13 >> 3) & 896) | ((i13 << 3) & 7168) | (57344 & i13) | (i13 & 458752);
                    boolean z25 = z14;
                    a(dVar3, new InterfaceC3807sD.i(text, null, 2, null), z17, z25, z18, onClick, lVarV, i24, 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    dVar4 = dVar3;
                    z19 = z17;
                    z21 = z25;
                    z22 = z18;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.g81
                        @Override // wn0.p
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC3610no.a(dVar4, text, z21, z19, z22, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            z15 = z12;
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((i11 & 24576) == 0) {
                    z16 = z13;
                    if (lVarV.p(z16)) {
                        i17 = 16384;
                    } else {
                        i17 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i17;
                }
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    if (lVarV.K(onClick)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
                if ((74899 & i13) != 74898) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i21 != 0) {
                        z14 = false;
                    }
                    if (i14 != 0) {
                        z17 = true;
                    } else {
                        z17 = z15;
                    }
                    if (i16 != 0) {
                        z18 = false;
                    } else {
                        z18 = z16;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1159921265, i13, -1, "com.fourthline.orca.core.internal.composable.PrimaryButton (OrcaButton.kt:75)");
                    }
                    int i25 = (i13 & 14) | ((i13 >> 3) & 896) | ((i13 << 3) & 7168) | (57344 & i13) | (i13 & 458752);
                    boolean z26 = z14;
                    a(dVar3, new InterfaceC3807sD.i(text, null, 2, null), z17, z26, z18, onClick, lVarV, i25, 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    dVar4 = dVar3;
                    z19 = z17;
                    z21 = z26;
                    z22 = z18;
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i21 != 0) {
                        z14 = false;
                    }
                    if (i14 != 0) {
                        z17 = true;
                    } else {
                        z17 = z15;
                    }
                    if (i16 != 0) {
                        z18 = false;
                    } else {
                        z18 = z16;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1159921265, i13, -1, "com.fourthline.orca.core.internal.composable.PrimaryButton (OrcaButton.kt:75)");
                    }
                    int i26 = (i13 & 14) | ((i13 >> 3) & 896) | ((i13 << 3) & 7168) | (57344 & i13) | (i13 & 458752);
                    boolean z27 = z14;
                    a(dVar3, new InterfaceC3807sD.i(text, null, 2, null), z17, z27, z18, onClick, lVarV, i26, 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    dVar4 = dVar3;
                    z19 = z17;
                    z21 = z27;
                    z22 = z18;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.g81
                        @Override // wn0.p
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC3610no.a(dVar4, text, z21, z19, z22, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            z16 = z13;
            if ((i12 & 32) != 0) {
                i13 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (lVarV.K(onClick)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i13 |= i18;
            }
            if ((74899 & i13) != 74898) {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i21 != 0) {
                    z14 = false;
                }
                if (i14 != 0) {
                    z17 = true;
                } else {
                    z17 = z15;
                }
                if (i16 != 0) {
                    z18 = false;
                } else {
                    z18 = z16;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1159921265, i13, -1, "com.fourthline.orca.core.internal.composable.PrimaryButton (OrcaButton.kt:75)");
                }
                int i27 = (i13 & 14) | ((i13 >> 3) & 896) | ((i13 << 3) & 7168) | (57344 & i13) | (i13 & 458752);
                boolean z28 = z14;
                a(dVar3, new InterfaceC3807sD.i(text, null, 2, null), z17, z28, z18, onClick, lVarV, i27, 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar3;
                z19 = z17;
                z21 = z28;
                z22 = z18;
            } else {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i21 != 0) {
                    z14 = false;
                }
                if (i14 != 0) {
                    z17 = true;
                } else {
                    z17 = z15;
                }
                if (i16 != 0) {
                    z18 = false;
                } else {
                    z18 = z16;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1159921265, i13, -1, "com.fourthline.orca.core.internal.composable.PrimaryButton (OrcaButton.kt:75)");
                }
                int i28 = (i13 & 14) | ((i13 >> 3) & 896) | ((i13 << 3) & 7168) | (57344 & i13) | (i13 & 458752);
                boolean z29 = z14;
                a(dVar3, new InterfaceC3807sD.i(text, null, 2, null), z17, z29, z18, onClick, lVarV, i28, 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar3;
                z19 = z17;
                z21 = z29;
                z22 = z18;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.g81
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC3610no.a(dVar4, text, z21, z19, z22, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        z14 = z11;
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & 3072) == 0) {
                z15 = z12;
                if (lVarV.p(z15)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((i11 & 24576) == 0) {
                    z16 = z13;
                    if (lVarV.p(z16)) {
                        i17 = 16384;
                    } else {
                        i17 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i17;
                }
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    if (lVarV.K(onClick)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
                if ((74899 & i13) != 74898) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i21 != 0) {
                        z14 = false;
                    }
                    if (i14 != 0) {
                        z17 = true;
                    } else {
                        z17 = z15;
                    }
                    if (i16 != 0) {
                        z18 = false;
                    } else {
                        z18 = z16;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1159921265, i13, -1, "com.fourthline.orca.core.internal.composable.PrimaryButton (OrcaButton.kt:75)");
                    }
                    int i29 = (i13 & 14) | ((i13 >> 3) & 896) | ((i13 << 3) & 7168) | (57344 & i13) | (i13 & 458752);
                    boolean z210 = z14;
                    a(dVar3, new InterfaceC3807sD.i(text, null, 2, null), z17, z210, z18, onClick, lVarV, i29, 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    dVar4 = dVar3;
                    z19 = z17;
                    z21 = z210;
                    z22 = z18;
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i21 != 0) {
                        z14 = false;
                    }
                    if (i14 != 0) {
                        z17 = true;
                    } else {
                        z17 = z15;
                    }
                    if (i16 != 0) {
                        z18 = false;
                    } else {
                        z18 = z16;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1159921265, i13, -1, "com.fourthline.orca.core.internal.composable.PrimaryButton (OrcaButton.kt:75)");
                    }
                    int i210 = (i13 & 14) | ((i13 >> 3) & 896) | ((i13 << 3) & 7168) | (57344 & i13) | (i13 & 458752);
                    boolean z211 = z14;
                    a(dVar3, new InterfaceC3807sD.i(text, null, 2, null), z17, z211, z18, onClick, lVarV, i210, 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    dVar4 = dVar3;
                    z19 = z17;
                    z21 = z211;
                    z22 = z18;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.g81
                        @Override // wn0.p
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC3610no.a(dVar4, text, z21, z19, z22, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            z16 = z13;
            if ((i12 & 32) != 0) {
                i13 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (lVarV.K(onClick)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i13 |= i18;
            }
            if ((74899 & i13) != 74898) {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i21 != 0) {
                    z14 = false;
                }
                if (i14 != 0) {
                    z17 = true;
                } else {
                    z17 = z15;
                }
                if (i16 != 0) {
                    z18 = false;
                } else {
                    z18 = z16;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1159921265, i13, -1, "com.fourthline.orca.core.internal.composable.PrimaryButton (OrcaButton.kt:75)");
                }
                int i211 = (i13 & 14) | ((i13 >> 3) & 896) | ((i13 << 3) & 7168) | (57344 & i13) | (i13 & 458752);
                boolean z212 = z14;
                a(dVar3, new InterfaceC3807sD.i(text, null, 2, null), z17, z212, z18, onClick, lVarV, i211, 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar3;
                z19 = z17;
                z21 = z212;
                z22 = z18;
            } else {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i21 != 0) {
                    z14 = false;
                }
                if (i14 != 0) {
                    z17 = true;
                } else {
                    z17 = z15;
                }
                if (i16 != 0) {
                    z18 = false;
                } else {
                    z18 = z16;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1159921265, i13, -1, "com.fourthline.orca.core.internal.composable.PrimaryButton (OrcaButton.kt:75)");
                }
                int i212 = (i13 & 14) | ((i13 >> 3) & 896) | ((i13 << 3) & 7168) | (57344 & i13) | (i13 & 458752);
                boolean z213 = z14;
                a(dVar3, new InterfaceC3807sD.i(text, null, 2, null), z17, z213, z18, onClick, lVarV, i212, 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar3;
                z19 = z17;
                z21 = z213;
                z22 = z18;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.g81
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC3610no.a(dVar4, text, z21, z19, z22, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        z15 = z12;
        i16 = i12 & 16;
        if (i16 != 0) {
            if ((i11 & 24576) == 0) {
                z16 = z13;
                if (lVarV.p(z16)) {
                    i17 = 16384;
                } else {
                    i17 = PKIFailureInfo.certRevoked;
                }
                i13 |= i17;
            }
            if ((i12 & 32) != 0) {
                i13 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (lVarV.K(onClick)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i13 |= i18;
            }
            if ((74899 & i13) != 74898) {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i21 != 0) {
                    z14 = false;
                }
                if (i14 != 0) {
                    z17 = true;
                } else {
                    z17 = z15;
                }
                if (i16 != 0) {
                    z18 = false;
                } else {
                    z18 = z16;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1159921265, i13, -1, "com.fourthline.orca.core.internal.composable.PrimaryButton (OrcaButton.kt:75)");
                }
                int i213 = (i13 & 14) | ((i13 >> 3) & 896) | ((i13 << 3) & 7168) | (57344 & i13) | (i13 & 458752);
                boolean z214 = z14;
                a(dVar3, new InterfaceC3807sD.i(text, null, 2, null), z17, z214, z18, onClick, lVarV, i213, 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar3;
                z19 = z17;
                z21 = z214;
                z22 = z18;
            } else {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i21 != 0) {
                    z14 = false;
                }
                if (i14 != 0) {
                    z17 = true;
                } else {
                    z17 = z15;
                }
                if (i16 != 0) {
                    z18 = false;
                } else {
                    z18 = z16;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1159921265, i13, -1, "com.fourthline.orca.core.internal.composable.PrimaryButton (OrcaButton.kt:75)");
                }
                int i214 = (i13 & 14) | ((i13 >> 3) & 896) | ((i13 << 3) & 7168) | (57344 & i13) | (i13 & 458752);
                boolean z215 = z14;
                a(dVar3, new InterfaceC3807sD.i(text, null, 2, null), z17, z215, z18, onClick, lVarV, i214, 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar3;
                z19 = z17;
                z21 = z215;
                z22 = z18;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.g81
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC3610no.a(dVar4, text, z21, z19, z22, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 24576;
        z16 = z13;
        if ((i12 & 32) != 0) {
            i13 |= 196608;
        } else if ((i11 & 196608) == 0) {
            if (lVarV.K(onClick)) {
                i18 = 131072;
            } else {
                i18 = 65536;
            }
            i13 |= i18;
        }
        if ((74899 & i13) != 74898) {
            if (i19 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i21 != 0) {
                z14 = false;
            }
            if (i14 != 0) {
                z17 = true;
            } else {
                z17 = z15;
            }
            if (i16 != 0) {
                z18 = false;
            } else {
                z18 = z16;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1159921265, i13, -1, "com.fourthline.orca.core.internal.composable.PrimaryButton (OrcaButton.kt:75)");
            }
            int i215 = (i13 & 14) | ((i13 >> 3) & 896) | ((i13 << 3) & 7168) | (57344 & i13) | (i13 & 458752);
            boolean z216 = z14;
            a(dVar3, new InterfaceC3807sD.i(text, null, 2, null), z17, z216, z18, onClick, lVarV, i215, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar4 = dVar3;
            z19 = z17;
            z21 = z216;
            z22 = z18;
        } else {
            if (i19 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i21 != 0) {
                z14 = false;
            }
            if (i14 != 0) {
                z17 = true;
            } else {
                z17 = z15;
            }
            if (i16 != 0) {
                z18 = false;
            } else {
                z18 = z16;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1159921265, i13, -1, "com.fourthline.orca.core.internal.composable.PrimaryButton (OrcaButton.kt:75)");
            }
            int i216 = (i13 & 14) | ((i13 >> 3) & 896) | ((i13 << 3) & 7168) | (57344 & i13) | (i13 & 458752);
            boolean z217 = z14;
            a(dVar3, new InterfaceC3807sD.i(text, null, 2, null), z17, z217, z18, onClick, lVarV, i216, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar4 = dVar3;
            z19 = z17;
            z21 = z217;
            z22 = z18;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.g81
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3610no.a(dVar4, text, z21, z19, z22, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00db  */
    /* JADX WARN: Code duplicated, block: B:77:0x00de  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:92:0x0134  */
    /* JADX WARN: Code duplicated, block: B:96:0x0141  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    public static final void a(androidx.compose.ui.d dVar, final InterfaceC3807sD intent, boolean z11, boolean z12, boolean z13, final wn0.l onClick, p020r2.l lVar, final int i11, final int i12) {
        androidx.compose.ui.d dVar2;
        int i13;
        boolean z14;
        int i14;
        boolean z15;
        int i15;
        int i16;
        boolean z16;
        int i17;
        int i18;
        androidx.compose.ui.d dVar3;
        boolean z17;
        boolean z18;
        final androidx.compose.ui.d dVar4;
        final boolean z19;
        final boolean z21;
        final boolean z22;
        p020r2.w2 w2VarX;
        p013kotlin.jvm.internal.s.k(intent, "intent");
        p013kotlin.jvm.internal.s.k(onClick, "onClick");
        p020r2.l lVarV = lVar.v(-1221836957);
        int i19 = i12 & 1;
        if (i19 != 0) {
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
            i13 |= (i11 & 64) == 0 ? lVarV.n(intent) : lVarV.K(intent) ? 32 : 16;
        }
        int i21 = i12 & 4;
        if (i21 == 0) {
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                z14 = z11;
                i13 |= lVarV.p(z14) ? 256 : 128;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & 3072) == 0) {
                    z15 = z12;
                    if (lVarV.p(z15)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 16;
                if (i16 != 0) {
                    if ((i11 & 24576) == 0) {
                        z16 = z13;
                        if (lVarV.p(z16)) {
                            i17 = 16384;
                        } else {
                            i17 = PKIFailureInfo.certRevoked;
                        }
                        i13 |= i17;
                    }
                    if ((i12 & 32) != 0) {
                        i13 |= 196608;
                    } else if ((i11 & 196608) == 0) {
                        if (lVarV.K(onClick)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i13 |= i18;
                    }
                    if ((74899 & i13) != 74898 && lVarV.b()) {
                        lVarV.j();
                        dVar4 = dVar2;
                        z19 = z14;
                        z21 = z15;
                        z22 = z16;
                    } else {
                        if (i19 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i21 != 0) {
                            z17 = true;
                        } else {
                            z17 = z14;
                        }
                        if (i14 != 0) {
                            z15 = false;
                        }
                        if (i16 != 0) {
                            z18 = false;
                        } else {
                            z18 = z16;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-1221836957, i13, -1, "com.fourthline.orca.core.internal.composable.PrimaryButton (OrcaButton.kt:94)");
                        }
                        int i22 = (i13 & 14) | 48;
                        int i23 = i13 << 6;
                        int i24 = (i23 & 7168) | i22 | (57344 & i23) | (458752 & i23) | (3670016 & i23) | (i23 & 29360128);
                        androidx.compose.ui.d dVar5 = dVar3;
                        boolean z23 = z15;
                        boolean z24 = z17;
                        a(dVar5, "primaryButton", C3825sp.f35377a.b(lVarV, 6).getButton().getPrimary(), intent, z24, z23, z18, onClick, lVarV, i24, 0);
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        dVar4 = dVar5;
                        z19 = z24;
                        z21 = z23;
                        z22 = z18;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.h81
                            @Override // wn0.p
                            public final Object invoke(Object obj, Object obj2) {
                                return AbstractC3610no.a(dVar4, intent, z19, z21, z22, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 24576;
                z16 = z13;
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    if (lVarV.K(onClick)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
                if ((74899 & i13) != 74898) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i21 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    if (i14 != 0) {
                        z15 = false;
                    }
                    if (i16 != 0) {
                        z18 = false;
                    } else {
                        z18 = z16;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1221836957, i13, -1, "com.fourthline.orca.core.internal.composable.PrimaryButton (OrcaButton.kt:94)");
                    }
                    int i25 = (i13 & 14) | 48;
                    int i26 = i13 << 6;
                    int i27 = (i26 & 7168) | i25 | (57344 & i26) | (458752 & i26) | (3670016 & i26) | (i26 & 29360128);
                    androidx.compose.ui.d dVar6 = dVar3;
                    boolean z25 = z15;
                    boolean z26 = z17;
                    a(dVar6, "primaryButton", C3825sp.f35377a.b(lVarV, 6).getButton().getPrimary(), intent, z26, z25, z18, onClick, lVarV, i27, 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    dVar4 = dVar6;
                    z19 = z26;
                    z21 = z25;
                    z22 = z18;
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i21 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    if (i14 != 0) {
                        z15 = false;
                    }
                    if (i16 != 0) {
                        z18 = false;
                    } else {
                        z18 = z16;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1221836957, i13, -1, "com.fourthline.orca.core.internal.composable.PrimaryButton (OrcaButton.kt:94)");
                    }
                    int i28 = (i13 & 14) | 48;
                    int i29 = i13 << 6;
                    int i210 = (i29 & 7168) | i28 | (57344 & i29) | (458752 & i29) | (3670016 & i29) | (i29 & 29360128);
                    androidx.compose.ui.d dVar7 = dVar3;
                    boolean z27 = z15;
                    boolean z28 = z17;
                    a(dVar7, "primaryButton", C3825sp.f35377a.b(lVarV, 6).getButton().getPrimary(), intent, z28, z27, z18, onClick, lVarV, i210, 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    dVar4 = dVar7;
                    z19 = z28;
                    z21 = z27;
                    z22 = z18;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.h81
                        @Override // wn0.p
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC3610no.a(dVar4, intent, z19, z21, z22, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            z15 = z12;
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((i11 & 24576) == 0) {
                    z16 = z13;
                    if (lVarV.p(z16)) {
                        i17 = 16384;
                    } else {
                        i17 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i17;
                }
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    if (lVarV.K(onClick)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
                if ((74899 & i13) != 74898) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i21 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    if (i14 != 0) {
                        z15 = false;
                    }
                    if (i16 != 0) {
                        z18 = false;
                    } else {
                        z18 = z16;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1221836957, i13, -1, "com.fourthline.orca.core.internal.composable.PrimaryButton (OrcaButton.kt:94)");
                    }
                    int i211 = (i13 & 14) | 48;
                    int i212 = i13 << 6;
                    int i213 = (i212 & 7168) | i211 | (57344 & i212) | (458752 & i212) | (3670016 & i212) | (i212 & 29360128);
                    androidx.compose.ui.d dVar8 = dVar3;
                    boolean z29 = z15;
                    boolean z210 = z17;
                    a(dVar8, "primaryButton", C3825sp.f35377a.b(lVarV, 6).getButton().getPrimary(), intent, z210, z29, z18, onClick, lVarV, i213, 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    dVar4 = dVar8;
                    z19 = z210;
                    z21 = z29;
                    z22 = z18;
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i21 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    if (i14 != 0) {
                        z15 = false;
                    }
                    if (i16 != 0) {
                        z18 = false;
                    } else {
                        z18 = z16;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1221836957, i13, -1, "com.fourthline.orca.core.internal.composable.PrimaryButton (OrcaButton.kt:94)");
                    }
                    int i214 = (i13 & 14) | 48;
                    int i215 = i13 << 6;
                    int i216 = (i215 & 7168) | i214 | (57344 & i215) | (458752 & i215) | (3670016 & i215) | (i215 & 29360128);
                    androidx.compose.ui.d dVar9 = dVar3;
                    boolean z211 = z15;
                    boolean z212 = z17;
                    a(dVar9, "primaryButton", C3825sp.f35377a.b(lVarV, 6).getButton().getPrimary(), intent, z212, z211, z18, onClick, lVarV, i216, 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    dVar4 = dVar9;
                    z19 = z212;
                    z21 = z211;
                    z22 = z18;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.h81
                        @Override // wn0.p
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC3610no.a(dVar4, intent, z19, z21, z22, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            z16 = z13;
            if ((i12 & 32) != 0) {
                i13 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (lVarV.K(onClick)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i13 |= i18;
            }
            if ((74899 & i13) != 74898) {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i21 != 0) {
                    z17 = true;
                } else {
                    z17 = z14;
                }
                if (i14 != 0) {
                    z15 = false;
                }
                if (i16 != 0) {
                    z18 = false;
                } else {
                    z18 = z16;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1221836957, i13, -1, "com.fourthline.orca.core.internal.composable.PrimaryButton (OrcaButton.kt:94)");
                }
                int i217 = (i13 & 14) | 48;
                int i218 = i13 << 6;
                int i219 = (i218 & 7168) | i217 | (57344 & i218) | (458752 & i218) | (3670016 & i218) | (i218 & 29360128);
                androidx.compose.ui.d dVar10 = dVar3;
                boolean z213 = z15;
                boolean z214 = z17;
                a(dVar10, "primaryButton", C3825sp.f35377a.b(lVarV, 6).getButton().getPrimary(), intent, z214, z213, z18, onClick, lVarV, i219, 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar10;
                z19 = z214;
                z21 = z213;
                z22 = z18;
            } else {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i21 != 0) {
                    z17 = true;
                } else {
                    z17 = z14;
                }
                if (i14 != 0) {
                    z15 = false;
                }
                if (i16 != 0) {
                    z18 = false;
                } else {
                    z18 = z16;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1221836957, i13, -1, "com.fourthline.orca.core.internal.composable.PrimaryButton (OrcaButton.kt:94)");
                }
                int i2110 = (i13 & 14) | 48;
                int i2111 = i13 << 6;
                int i2112 = (i2111 & 7168) | i2110 | (57344 & i2111) | (458752 & i2111) | (3670016 & i2111) | (i2111 & 29360128);
                androidx.compose.ui.d dVar11 = dVar3;
                boolean z215 = z15;
                boolean z216 = z17;
                a(dVar11, "primaryButton", C3825sp.f35377a.b(lVarV, 6).getButton().getPrimary(), intent, z216, z215, z18, onClick, lVarV, i2112, 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar11;
                z19 = z216;
                z21 = z215;
                z22 = z18;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.h81
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC3610no.a(dVar4, intent, z19, z21, z22, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        z14 = z11;
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & 3072) == 0) {
                z15 = z12;
                if (lVarV.p(z15)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((i11 & 24576) == 0) {
                    z16 = z13;
                    if (lVarV.p(z16)) {
                        i17 = 16384;
                    } else {
                        i17 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i17;
                }
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    if (lVarV.K(onClick)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
                if ((74899 & i13) != 74898) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i21 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    if (i14 != 0) {
                        z15 = false;
                    }
                    if (i16 != 0) {
                        z18 = false;
                    } else {
                        z18 = z16;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1221836957, i13, -1, "com.fourthline.orca.core.internal.composable.PrimaryButton (OrcaButton.kt:94)");
                    }
                    int i2113 = (i13 & 14) | 48;
                    int i2114 = i13 << 6;
                    int i2115 = (i2114 & 7168) | i2113 | (57344 & i2114) | (458752 & i2114) | (3670016 & i2114) | (i2114 & 29360128);
                    androidx.compose.ui.d dVar12 = dVar3;
                    boolean z217 = z15;
                    boolean z218 = z17;
                    a(dVar12, "primaryButton", C3825sp.f35377a.b(lVarV, 6).getButton().getPrimary(), intent, z218, z217, z18, onClick, lVarV, i2115, 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    dVar4 = dVar12;
                    z19 = z218;
                    z21 = z217;
                    z22 = z18;
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i21 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    if (i14 != 0) {
                        z15 = false;
                    }
                    if (i16 != 0) {
                        z18 = false;
                    } else {
                        z18 = z16;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1221836957, i13, -1, "com.fourthline.orca.core.internal.composable.PrimaryButton (OrcaButton.kt:94)");
                    }
                    int i2116 = (i13 & 14) | 48;
                    int i2117 = i13 << 6;
                    int i2118 = (i2117 & 7168) | i2116 | (57344 & i2117) | (458752 & i2117) | (3670016 & i2117) | (i2117 & 29360128);
                    androidx.compose.ui.d dVar13 = dVar3;
                    boolean z219 = z15;
                    boolean z2110 = z17;
                    a(dVar13, "primaryButton", C3825sp.f35377a.b(lVarV, 6).getButton().getPrimary(), intent, z2110, z219, z18, onClick, lVarV, i2118, 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    dVar4 = dVar13;
                    z19 = z2110;
                    z21 = z219;
                    z22 = z18;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.h81
                        @Override // wn0.p
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC3610no.a(dVar4, intent, z19, z21, z22, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            z16 = z13;
            if ((i12 & 32) != 0) {
                i13 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (lVarV.K(onClick)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i13 |= i18;
            }
            if ((74899 & i13) != 74898) {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i21 != 0) {
                    z17 = true;
                } else {
                    z17 = z14;
                }
                if (i14 != 0) {
                    z15 = false;
                }
                if (i16 != 0) {
                    z18 = false;
                } else {
                    z18 = z16;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1221836957, i13, -1, "com.fourthline.orca.core.internal.composable.PrimaryButton (OrcaButton.kt:94)");
                }
                int i2119 = (i13 & 14) | 48;
                int i21110 = i13 << 6;
                int i21111 = (i21110 & 7168) | i2119 | (57344 & i21110) | (458752 & i21110) | (3670016 & i21110) | (i21110 & 29360128);
                androidx.compose.ui.d dVar14 = dVar3;
                boolean z2111 = z15;
                boolean z2112 = z17;
                a(dVar14, "primaryButton", C3825sp.f35377a.b(lVarV, 6).getButton().getPrimary(), intent, z2112, z2111, z18, onClick, lVarV, i21111, 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar14;
                z19 = z2112;
                z21 = z2111;
                z22 = z18;
            } else {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i21 != 0) {
                    z17 = true;
                } else {
                    z17 = z14;
                }
                if (i14 != 0) {
                    z15 = false;
                }
                if (i16 != 0) {
                    z18 = false;
                } else {
                    z18 = z16;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1221836957, i13, -1, "com.fourthline.orca.core.internal.composable.PrimaryButton (OrcaButton.kt:94)");
                }
                int i21112 = (i13 & 14) | 48;
                int i21113 = i13 << 6;
                int i21114 = (i21113 & 7168) | i21112 | (57344 & i21113) | (458752 & i21113) | (3670016 & i21113) | (i21113 & 29360128);
                androidx.compose.ui.d dVar15 = dVar3;
                boolean z2113 = z15;
                boolean z2114 = z17;
                a(dVar15, "primaryButton", C3825sp.f35377a.b(lVarV, 6).getButton().getPrimary(), intent, z2114, z2113, z18, onClick, lVarV, i21114, 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar15;
                z19 = z2114;
                z21 = z2113;
                z22 = z18;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.h81
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC3610no.a(dVar4, intent, z19, z21, z22, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        z15 = z12;
        i16 = i12 & 16;
        if (i16 != 0) {
            if ((i11 & 24576) == 0) {
                z16 = z13;
                if (lVarV.p(z16)) {
                    i17 = 16384;
                } else {
                    i17 = PKIFailureInfo.certRevoked;
                }
                i13 |= i17;
            }
            if ((i12 & 32) != 0) {
                i13 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (lVarV.K(onClick)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i13 |= i18;
            }
            if ((74899 & i13) != 74898) {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i21 != 0) {
                    z17 = true;
                } else {
                    z17 = z14;
                }
                if (i14 != 0) {
                    z15 = false;
                }
                if (i16 != 0) {
                    z18 = false;
                } else {
                    z18 = z16;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1221836957, i13, -1, "com.fourthline.orca.core.internal.composable.PrimaryButton (OrcaButton.kt:94)");
                }
                int i21115 = (i13 & 14) | 48;
                int i21116 = i13 << 6;
                int i21117 = (i21116 & 7168) | i21115 | (57344 & i21116) | (458752 & i21116) | (3670016 & i21116) | (i21116 & 29360128);
                androidx.compose.ui.d dVar16 = dVar3;
                boolean z2115 = z15;
                boolean z2116 = z17;
                a(dVar16, "primaryButton", C3825sp.f35377a.b(lVarV, 6).getButton().getPrimary(), intent, z2116, z2115, z18, onClick, lVarV, i21117, 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar16;
                z19 = z2116;
                z21 = z2115;
                z22 = z18;
            } else {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i21 != 0) {
                    z17 = true;
                } else {
                    z17 = z14;
                }
                if (i14 != 0) {
                    z15 = false;
                }
                if (i16 != 0) {
                    z18 = false;
                } else {
                    z18 = z16;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1221836957, i13, -1, "com.fourthline.orca.core.internal.composable.PrimaryButton (OrcaButton.kt:94)");
                }
                int i21118 = (i13 & 14) | 48;
                int i21119 = i13 << 6;
                int i211110 = (i21119 & 7168) | i21118 | (57344 & i21119) | (458752 & i21119) | (3670016 & i21119) | (i21119 & 29360128);
                androidx.compose.ui.d dVar17 = dVar3;
                boolean z2117 = z15;
                boolean z2118 = z17;
                a(dVar17, "primaryButton", C3825sp.f35377a.b(lVarV, 6).getButton().getPrimary(), intent, z2118, z2117, z18, onClick, lVarV, i211110, 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar17;
                z19 = z2118;
                z21 = z2117;
                z22 = z18;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.h81
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC3610no.a(dVar4, intent, z19, z21, z22, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 24576;
        z16 = z13;
        if ((i12 & 32) != 0) {
            i13 |= 196608;
        } else if ((i11 & 196608) == 0) {
            if (lVarV.K(onClick)) {
                i18 = 131072;
            } else {
                i18 = 65536;
            }
            i13 |= i18;
        }
        if ((74899 & i13) != 74898) {
            if (i19 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i21 != 0) {
                z17 = true;
            } else {
                z17 = z14;
            }
            if (i14 != 0) {
                z15 = false;
            }
            if (i16 != 0) {
                z18 = false;
            } else {
                z18 = z16;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1221836957, i13, -1, "com.fourthline.orca.core.internal.composable.PrimaryButton (OrcaButton.kt:94)");
            }
            int i211111 = (i13 & 14) | 48;
            int i211112 = i13 << 6;
            int i211113 = (i211112 & 7168) | i211111 | (57344 & i211112) | (458752 & i211112) | (3670016 & i211112) | (i211112 & 29360128);
            androidx.compose.ui.d dVar18 = dVar3;
            boolean z2119 = z15;
            boolean z21110 = z17;
            a(dVar18, "primaryButton", C3825sp.f35377a.b(lVarV, 6).getButton().getPrimary(), intent, z21110, z2119, z18, onClick, lVarV, i211113, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar4 = dVar18;
            z19 = z21110;
            z21 = z2119;
            z22 = z18;
        } else {
            if (i19 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i21 != 0) {
                z17 = true;
            } else {
                z17 = z14;
            }
            if (i14 != 0) {
                z15 = false;
            }
            if (i16 != 0) {
                z18 = false;
            } else {
                z18 = z16;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1221836957, i13, -1, "com.fourthline.orca.core.internal.composable.PrimaryButton (OrcaButton.kt:94)");
            }
            int i211114 = (i13 & 14) | 48;
            int i211115 = i13 << 6;
            int i211116 = (i211115 & 7168) | i211114 | (57344 & i211115) | (458752 & i211115) | (3670016 & i211115) | (i211115 & 29360128);
            androidx.compose.ui.d dVar19 = dVar3;
            boolean z21111 = z15;
            boolean z21112 = z17;
            a(dVar19, "primaryButton", C3825sp.f35377a.b(lVarV, 6).getButton().getPrimary(), intent, z21112, z21111, z18, onClick, lVarV, i211116, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar4 = dVar19;
            z19 = z21112;
            z21 = z21111;
            z22 = z18;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.h81
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3610no.a(dVar4, intent, z19, z21, z22, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0134  */
    /* JADX WARN: Code duplicated, block: B:102:0x0136  */
    /* JADX WARN: Code duplicated, block: B:104:0x0139  */
    /* JADX WARN: Code duplicated, block: B:107:0x0140  */
    /* JADX WARN: Code duplicated, block: B:110:0x017e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x0183  */
    /* JADX WARN: Code duplicated, block: B:114:0x0187  */
    /* JADX WARN: Code duplicated, block: B:115:0x0190  */
    /* JADX WARN: Code duplicated, block: B:117:0x0193  */
    /* JADX WARN: Code duplicated, block: B:120:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:124:0x01be  */
    /* JADX WARN: Code duplicated, block: B:125:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:128:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:130:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:133:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:134:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:137:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:141:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:144:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:146:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:149:0x0318  */
    /* JADX WARN: Code duplicated, block: B:153:0x0326  */
    /* JADX WARN: Code duplicated, block: B:155:0x0335  */
    /* JADX WARN: Code duplicated, block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00df  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:84:0x0101  */
    /* JADX WARN: Code duplicated, block: B:85:0x0104  */
    /* JADX WARN: Code duplicated, block: B:93:0x0124 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0126  */
    /* JADX WARN: Code duplicated, block: B:95:0x0129  */
    /* JADX WARN: Code duplicated, block: B:97:0x012c  */
    /* JADX WARN: Code duplicated, block: B:98:0x012f  */
    public static final void a(androidx.compose.ui.d dVar, final String testTag, final StatefulButtonElement buttonStyle, final InterfaceC3807sD intent, boolean z11, boolean z12, boolean z13, final wn0.l onClick, p020r2.l lVar, final int i11, final int i12) {
        androidx.compose.ui.d dVar2;
        int i13;
        boolean z14;
        int i14;
        boolean z15;
        int i15;
        int i16;
        final boolean z16;
        int i17;
        int i18;
        androidx.compose.ui.d dVar3;
        boolean z17;
        final boolean z18;
        boolean z19;
        float opacity;
        boolean z21;
        boolean z22;
        boolean z23;
        Object objI;
        boolean z24;
        boolean z25;
        boolean z26;
        Object objI2;
        final boolean z27;
        final boolean z28;
        final boolean z29;
        final androidx.compose.ui.d dVar4;
        p020r2.w2 w2VarX;
        p013kotlin.jvm.internal.s.k(testTag, "testTag");
        p013kotlin.jvm.internal.s.k(buttonStyle, "buttonStyle");
        p013kotlin.jvm.internal.s.k(intent, "intent");
        p013kotlin.jvm.internal.s.k(onClick, "onClick");
        p020r2.l lVarV = lVar.v(-347486008);
        int i19 = i12 & 1;
        if (i19 != 0) {
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
            i13 |= lVarV.n(testTag) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i13 |= lVarV.n(buttonStyle) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= (i11 & 4096) == 0 ? lVarV.n(intent) : lVarV.K(intent) ? 2048 : 1024;
        }
        int i21 = i12 & 16;
        if (i21 == 0) {
            if ((i11 & 24576) == 0) {
                z14 = z11;
                i13 |= lVarV.p(z14) ? 16384 : PKIFailureInfo.certRevoked;
            }
            i14 = i12 & 32;
            if (i14 != 0) {
                i13 |= 196608;
                z15 = z12;
            } else {
                z15 = z12;
                if ((i11 & 196608) == 0) {
                    if (lVarV.p(z15)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i13 |= i15;
                }
            }
            i16 = i12 & 64;
            if (i16 != 0) {
                i13 |= 1572864;
                z16 = z13;
            } else {
                z16 = z13;
                if ((i11 & 1572864) == 0) {
                    if (lVarV.p(z16)) {
                        i17 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i17 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i17;
                }
            }
            if ((i12 & 128) != 0) {
                i13 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                if (lVarV.K(onClick)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i13 |= i18;
            }
            if ((i13 & 4793491) != 4793490 && lVarV.b()) {
                lVarV.j();
                z27 = z16;
                dVar4 = dVar2;
                z28 = z15;
                z29 = z14;
            } else {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i21 != 0) {
                    z17 = true;
                } else {
                    z17 = z14;
                }
                if (i14 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                if (i16 != 0) {
                    z16 = false;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-347486008, i13, -1, "com.fourthline.orca.core.internal.composable.OrcaProgressButton (OrcaButton.kt:136)");
                }
                float fA = Ko.f26627a.a();
                float f11 = 0;
                float fG = w4.h.g(Math.max(w4.h.g(f11), w4.h.g(Math.min(w4.h.g(buttonStyle.getRadius()), w4.h.g(fA / 2)))));
                float fG2 = w4.h.g(12);
                if (z17 || z18) {
                    z19 = false;
                } else {
                    z19 = true;
                }
                if (!z19) {
                    opacity = buttonStyle.getDisabled().getOpacity();
                } else if (z19) {
                    opacity = buttonStyle.getDefault().getOpacity();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                androidx.compose.ui.d dVarA = h3.a.a(androidx.compose.foundation.layout.x.i(dVar3, fA), opacity);
                lVarV.o(-1138711301);
                androidx.compose.ui.d dVar5 = dVar3;
                if ((458752 & i13) == 131072) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                boolean z31 = z21;
                if ((3670016 & i13) == 1048576) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                z23 = z31 | z22;
                objI = lVarV.I();
                if (!z23 || objI == p020r2.l.INSTANCE.a()) {
                    objI = new wn0.l() { // from class: com.fourthline.orca.internal.l81
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return AbstractC3610no.a(z18, z16, (g4.y) obj);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.x.h(g4.o.d(dVarA, false, (wn0.l) objI, 1, null), BitmapDescriptorFactory.HUE_RED, 1, null);
                boolean z32 = z18;
                p009i2.j jVar = p009i2.j.f74513a;
                long jA = buttonStyle.getDefault().getBackground().a(lVarV, 0);
                long jA2 = buttonStyle.getDefault().getText().getColor().a(lVarV, 0);
                long jA3 = buttonStyle.getDisabled().getBackground().a(lVarV, 0);
                long jA4 = buttonStyle.getDisabled().getText().getColor().a(lVarV, 0);
                int i22 = p009i2.j.f74524l;
                p009i2.i iVarA = jVar.a(jA, jA2, jA3, jA4, lVarV, i22 << 12, 0);
                RoundedCornerShape roundedCornerShapeC = a2.g.c(fG);
                BorderStroke borderStrokeA = q1.h.a(w4.h.g(buttonStyle.getDefault().getBorder().getWidth()), buttonStyle.getDefault().getBorder().getColor().a(lVarV, 0));
                z24 = false;
                p009i2.k kVarB = jVar.b(w4.h.g(f11), w4.h.g(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, (i22 << 15) | 54, 28);
                lVarV.o(-1138682089);
                if ((29360128 & i13) == 8388608) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if ((i13 & 7168) != 2048 || ((i13 & 4096) != 0 && lVarV.K(intent))) {
                    z24 = true;
                }
                z26 = z25 | z24;
                objI2 = lVarV.I();
                if (!z26 || objI2 == p020r2.l.INSTANCE.a()) {
                    objI2 = new wn0.a() { // from class: com.fourthline.orca.internal.m81
                        @Override // wn0.a
                        public final Object invoke() {
                            return AbstractC3610no.a(onClick, intent);
                        }
                    };
                    lVarV.B(objI2);
                }
                lVarV.l();
                z27 = z16;
                C4672l.a(VA.a(0L, (wn0.a) objI2, lVarV, 0, 1), dVarH, z19, null, kVarB, roundedCornerShapeC, borderStrokeA, iVarA, null, z2.c.e(1808000628, true, new a(z32, fG2, buttonStyle, testTag, z19, intent), lVarV, 54), lVarV, 805306368, EnumC4419g.SDK_ASSET_ICON_PLAID_LOGO_VALUE);
                lVarV = lVarV;
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                z28 = z32;
                z29 = z17;
                dVar4 = dVar5;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.n81
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC3610no.a(dVar4, testTag, buttonStyle, intent, z29, z28, z27, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 24576;
        z14 = z11;
        i14 = i12 & 32;
        if (i14 != 0) {
            i13 |= 196608;
            z15 = z12;
        } else {
            z15 = z12;
            if ((i11 & 196608) == 0) {
                if (lVarV.p(z15)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i13 |= i15;
            }
        }
        i16 = i12 & 64;
        if (i16 != 0) {
            i13 |= 1572864;
            z16 = z13;
        } else {
            z16 = z13;
            if ((i11 & 1572864) == 0) {
                if (lVarV.p(z16)) {
                    i17 = PKIFailureInfo.badCertTemplate;
                } else {
                    i17 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i17;
            }
        }
        if ((i12 & 128) != 0) {
            i13 |= 12582912;
        } else if ((i11 & 12582912) == 0) {
            if (lVarV.K(onClick)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i13 |= i18;
        }
        if ((i13 & 4793491) != 4793490) {
            if (i19 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i21 != 0) {
                z17 = true;
            } else {
                z17 = z14;
            }
            if (i14 != 0) {
                z18 = false;
            } else {
                z18 = z15;
            }
            if (i16 != 0) {
                z16 = false;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-347486008, i13, -1, "com.fourthline.orca.core.internal.composable.OrcaProgressButton (OrcaButton.kt:136)");
            }
            float fA2 = Ko.f26627a.a();
            float f12 = 0;
            float fG3 = w4.h.g(Math.max(w4.h.g(f12), w4.h.g(Math.min(w4.h.g(buttonStyle.getRadius()), w4.h.g(fA2 / 2)))));
            float fG4 = w4.h.g(12);
            if (z17) {
                z19 = false;
            } else {
                z19 = false;
            }
            if (!z19) {
                opacity = buttonStyle.getDisabled().getOpacity();
            } else if (z19) {
                opacity = buttonStyle.getDefault().getOpacity();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            androidx.compose.ui.d dVarA2 = h3.a.a(androidx.compose.foundation.layout.x.i(dVar3, fA2), opacity);
            lVarV.o(-1138711301);
            androidx.compose.ui.d dVar6 = dVar3;
            if ((458752 & i13) == 131072) {
                z21 = true;
            } else {
                z21 = false;
            }
            boolean z33 = z21;
            if ((3670016 & i13) == 1048576) {
                z22 = true;
            } else {
                z22 = false;
            }
            z23 = z33 | z22;
            objI = lVarV.I();
            if (!z23) {
                objI = new wn0.l() { // from class: com.fourthline.orca.internal.l81
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3610no.a(z18, z16, (g4.y) obj);
                    }
                };
                lVarV.B(objI);
            } else {
                objI = new wn0.l() { // from class: com.fourthline.orca.internal.l81
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3610no.a(z18, z16, (g4.y) obj);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            androidx.compose.ui.d dVarH2 = androidx.compose.foundation.layout.x.h(g4.o.d(dVarA2, false, (wn0.l) objI, 1, null), BitmapDescriptorFactory.HUE_RED, 1, null);
            boolean z34 = z18;
            p009i2.j jVar2 = p009i2.j.f74513a;
            long jA5 = buttonStyle.getDefault().getBackground().a(lVarV, 0);
            long jA6 = buttonStyle.getDefault().getText().getColor().a(lVarV, 0);
            long jA7 = buttonStyle.getDisabled().getBackground().a(lVarV, 0);
            long jA8 = buttonStyle.getDisabled().getText().getColor().a(lVarV, 0);
            int i23 = p009i2.j.f74524l;
            p009i2.i iVarA2 = jVar2.a(jA5, jA6, jA7, jA8, lVarV, i23 << 12, 0);
            RoundedCornerShape roundedCornerShapeC2 = a2.g.c(fG3);
            BorderStroke borderStrokeA2 = q1.h.a(w4.h.g(buttonStyle.getDefault().getBorder().getWidth()), buttonStyle.getDefault().getBorder().getColor().a(lVarV, 0));
            z24 = false;
            p009i2.k kVarB2 = jVar2.b(w4.h.g(f12), w4.h.g(f12), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, (i23 << 15) | 54, 28);
            lVarV.o(-1138682089);
            if ((29360128 & i13) == 8388608) {
                z25 = true;
            } else {
                z25 = false;
            }
            if ((i13 & 7168) != 2048) {
                z24 = true;
            } else {
                z24 = true;
            }
            z26 = z25 | z24;
            objI2 = lVarV.I();
            if (!z26) {
                objI2 = new wn0.a() { // from class: com.fourthline.orca.internal.m81
                    @Override // wn0.a
                    public final Object invoke() {
                        return AbstractC3610no.a(onClick, intent);
                    }
                };
                lVarV.B(objI2);
            } else {
                objI2 = new wn0.a() { // from class: com.fourthline.orca.internal.m81
                    @Override // wn0.a
                    public final Object invoke() {
                        return AbstractC3610no.a(onClick, intent);
                    }
                };
                lVarV.B(objI2);
            }
            lVarV.l();
            z27 = z16;
            C4672l.a(VA.a(0L, (wn0.a) objI2, lVarV, 0, 1), dVarH2, z19, null, kVarB2, roundedCornerShapeC2, borderStrokeA2, iVarA2, null, z2.c.e(1808000628, true, new a(z34, fG4, buttonStyle, testTag, z19, intent), lVarV, 54), lVarV, 805306368, EnumC4419g.SDK_ASSET_ICON_PLAID_LOGO_VALUE);
            lVarV = lVarV;
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            z28 = z34;
            z29 = z17;
            dVar4 = dVar6;
        } else {
            if (i19 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i21 != 0) {
                z17 = true;
            } else {
                z17 = z14;
            }
            if (i14 != 0) {
                z18 = false;
            } else {
                z18 = z15;
            }
            if (i16 != 0) {
                z16 = false;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-347486008, i13, -1, "com.fourthline.orca.core.internal.composable.OrcaProgressButton (OrcaButton.kt:136)");
            }
            float fA3 = Ko.f26627a.a();
            float f13 = 0;
            float fG5 = w4.h.g(Math.max(w4.h.g(f13), w4.h.g(Math.min(w4.h.g(buttonStyle.getRadius()), w4.h.g(fA3 / 2)))));
            float fG6 = w4.h.g(12);
            if (z17) {
                z19 = false;
            } else {
                z19 = false;
            }
            if (!z19) {
                opacity = buttonStyle.getDisabled().getOpacity();
            } else if (z19) {
                opacity = buttonStyle.getDefault().getOpacity();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            androidx.compose.ui.d dVarA3 = h3.a.a(androidx.compose.foundation.layout.x.i(dVar3, fA3), opacity);
            lVarV.o(-1138711301);
            androidx.compose.ui.d dVar7 = dVar3;
            if ((458752 & i13) == 131072) {
                z21 = true;
            } else {
                z21 = false;
            }
            boolean z35 = z21;
            if ((3670016 & i13) == 1048576) {
                z22 = true;
            } else {
                z22 = false;
            }
            z23 = z35 | z22;
            objI = lVarV.I();
            if (!z23) {
                objI = new wn0.l() { // from class: com.fourthline.orca.internal.l81
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3610no.a(z18, z16, (g4.y) obj);
                    }
                };
                lVarV.B(objI);
            } else {
                objI = new wn0.l() { // from class: com.fourthline.orca.internal.l81
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3610no.a(z18, z16, (g4.y) obj);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            androidx.compose.ui.d dVarH3 = androidx.compose.foundation.layout.x.h(g4.o.d(dVarA3, false, (wn0.l) objI, 1, null), BitmapDescriptorFactory.HUE_RED, 1, null);
            boolean z36 = z18;
            p009i2.j jVar3 = p009i2.j.f74513a;
            long jA9 = buttonStyle.getDefault().getBackground().a(lVarV, 0);
            long jA10 = buttonStyle.getDefault().getText().getColor().a(lVarV, 0);
            long jA11 = buttonStyle.getDisabled().getBackground().a(lVarV, 0);
            long jA12 = buttonStyle.getDisabled().getText().getColor().a(lVarV, 0);
            int i24 = p009i2.j.f74524l;
            p009i2.i iVarA3 = jVar3.a(jA9, jA10, jA11, jA12, lVarV, i24 << 12, 0);
            RoundedCornerShape roundedCornerShapeC3 = a2.g.c(fG5);
            BorderStroke borderStrokeA3 = q1.h.a(w4.h.g(buttonStyle.getDefault().getBorder().getWidth()), buttonStyle.getDefault().getBorder().getColor().a(lVarV, 0));
            z24 = false;
            p009i2.k kVarB3 = jVar3.b(w4.h.g(f13), w4.h.g(f13), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, (i24 << 15) | 54, 28);
            lVarV.o(-1138682089);
            if ((29360128 & i13) == 8388608) {
                z25 = true;
            } else {
                z25 = false;
            }
            if ((i13 & 7168) != 2048) {
                z24 = true;
            } else {
                z24 = true;
            }
            z26 = z25 | z24;
            objI2 = lVarV.I();
            if (!z26) {
                objI2 = new wn0.a() { // from class: com.fourthline.orca.internal.m81
                    @Override // wn0.a
                    public final Object invoke() {
                        return AbstractC3610no.a(onClick, intent);
                    }
                };
                lVarV.B(objI2);
            } else {
                objI2 = new wn0.a() { // from class: com.fourthline.orca.internal.m81
                    @Override // wn0.a
                    public final Object invoke() {
                        return AbstractC3610no.a(onClick, intent);
                    }
                };
                lVarV.B(objI2);
            }
            lVarV.l();
            z27 = z16;
            C4672l.a(VA.a(0L, (wn0.a) objI2, lVarV, 0, 1), dVarH3, z19, null, kVarB3, roundedCornerShapeC3, borderStrokeA3, iVarA3, null, z2.c.e(1808000628, true, new a(z36, fG6, buttonStyle, testTag, z19, intent), lVarV, 54), lVarV, 805306368, EnumC4419g.SDK_ASSET_ICON_PLAID_LOGO_VALUE);
            lVarV = lVarV;
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            z28 = z36;
            z29 = z17;
            dVar4 = dVar7;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.n81
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3610no.a(dVar4, testTag, buttonStyle, intent, z29, z28, z27, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(boolean z11, boolean z12, g4.y semantics) {
        p013kotlin.jvm.internal.s.k(semantics, "$this$semantics");
        if (z11 && z12) {
            g4.v.h0(semantics, g4.g.INSTANCE.a());
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.l lVar, InterfaceC3807sD interfaceC3807sD) {
        lVar.invoke(interfaceC3807sD);
        return jn0.h0.f84049a;
    }

    public static final void a(p020r2.l lVar, final int i11) {
        p020r2.l lVarV = lVar.v(-1979714619);
        if (i11 == 0 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-1979714619, i11, -1, "com.fourthline.orca.core.internal.composable.OrcaProgressBar (OrcaButton.kt:207)");
            }
            float fG = w4.h.g(24);
            final float fG2 = w4.h.g(2);
            final w4.d dVar = (w4.d) lVarV.U(androidx.compose.ui.platform.z0.g());
            ProgressElement spinner = C3825sp.f35377a.b(lVarV, 6).getButton().getPrimary().getDefault().getSpinner();
            final long jP = k3.p1.p(spinner.getBackground().a(lVarV, 0), spinner.getBackgroundOpacity(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            z3.i0 i0VarH = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), false);
            int iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, companion);
            b4.g.Companion companion2 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion2.a();
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
            p020r2.d4.b(lVarA, i0VarH, companion2.c());
            p020r2.d4.b(lVarA, xVarC, companion2.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB = companion2.b();
            if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE, companion2.d());
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.t.i(androidx.compose.foundation.layout.x.q(companion, fG), w4.h.g(fG2 / 2.0f));
            lVarV.o(-1812212946);
            boolean zN = lVarV.n(dVar) | lVarV.s(jP);
            Object objI = lVarV.I();
            if (zN || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.l() { // from class: com.fourthline.orca.internal.i81
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3610no.a(dVar, jP, fG2, (m3.f) obj);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            q1.i.a(dVarI, (wn0.l) objI, lVarV, 6);
            p009i2.w1.b(androidx.compose.foundation.layout.x.q(companion, fG), spinner.getHighlight().a(lVarV, 0), fG2, 0L, 0, lVarV, 390, 24);
            lVarV.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.j81
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3610no.a(i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(w4.d dVar, long j11, float f11, m3.f Canvas) {
        p013kotlin.jvm.internal.s.k(Canvas, "$this$Canvas");
        float f12 = 2;
        m3.f.Z(Canvas, j11, j3.m.j(Canvas.b()) / f12, j3.h.a(j3.m.k(Canvas.b()) / f12, j3.m.i(Canvas.b()) / f12), BitmapDescriptorFactory.HUE_RED, new Stroke(dVar.O1(f11), BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30, null), null, 0, 104, null);
        return jn0.h0.f84049a;
    }
}
