package com.fourthline.orca.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: renamed from: com.fourthline.orca.internal.si, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3818si {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.si$a */
    static final class a implements wn0.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Yj f35319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f35320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35321c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.q f35322d;

        a(Yj yj2, int i11, String str, wn0.q qVar) {
            this.f35319a = yj2;
            this.f35320b = i11;
            this.f35321c = str;
            this.f35322d = qVar;
        }

        public final void a(v1.i OrcaScreen, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(OrcaScreen, "$this$OrcaScreen");
            if ((i11 & 17) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-632727961, i11, -1, "com.fourthline.orca.core.internal.composable.IntroScreenWithAnimation.<anonymous> (IntroScreens.kt:42)");
            }
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            Sj.a(androidx.compose.foundation.layout.x.h(AbstractC3307gk.a(companion, "illustrationView", (String) null, 2, (Object) null), BitmapDescriptorFactory.HUE_RED, 1, null), 0L, this.f35319a, this.f35320b, false, lVar, 0, 18);
            float f11 = 16;
            v1.i0.a(androidx.compose.foundation.layout.x.i(companion, w4.h.g(f11)), lVar, 6);
            androidx.compose.ui.d dVarA = AbstractC3307gk.a(AbstractC3307gk.a(companion, 4.0f), "messageView", (String) null, 2, (Object) null);
            int iD = t4.j.INSTANCE.d();
            p009i2.v2.b(this.f35321c, dVarA, 0L, 0L, null, null, null, 0L, null, t4.j.h(iD), 0L, t4.t.INSTANCE.b(), false, 0, 0, null, C3825sp.f35377a.b(lVar, 6).getScreen().getMessage().a(null, lVar, 0, 1), lVar, 0, 48, 62972);
            v1.i0.a(androidx.compose.foundation.layout.x.i(companion, w4.h.g(f11)), lVar, 6);
            wn0.q qVar = this.f35322d;
            if (qVar != null) {
                androidx.compose.ui.d dVarA2 = AbstractC3307gk.a(AbstractC3307gk.a(companion), 5.0f);
                z3.i0 i0VarA = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVar, 0);
                int iA = p020r2.j.a(lVar, 0);
                p020r2.x xVarC = lVar.c();
                androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVar, dVarA2);
                b4.g.Companion companion2 = b4.g.INSTANCE;
                wn0.a<b4.g> aVarA = companion2.a();
                if (lVar.w() == null) {
                    p020r2.j.c();
                }
                lVar.h();
                if (lVar.u()) {
                    lVar.z(aVarA);
                } else {
                    lVar.d();
                }
                p020r2.l lVarA = p020r2.d4.a(lVar);
                p020r2.d4.b(lVarA, i0VarA, companion2.c());
                p020r2.d4.b(lVarA, xVarC, companion2.e());
                wn0.p<b4.g, Integer, jn0.h0> pVarB = companion2.b();
                if (lVarA.u() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                p020r2.d4.b(lVarA, dVarE, companion2.d());
                qVar.invoke(v1.j.f117505a, lVar, 6);
                lVar.g();
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((v1.i) obj, (p020r2.l) obj2, ((Number) obj3).intValue());
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(String str, String str2, String str3, wn0.q qVar, wn0.q qVar2, C3820sk c3820sk, Yj yj2, int i11, boolean z11, int i12, int i13, p020r2.l lVar, int i14) {
        a(str, str2, str3, qVar, qVar2, c3820sk, yj2, i11, z11, lVar, p020r2.k2.a(i12 | 1), i13);
        return jn0.h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0134  */
    /* JADX WARN: Code duplicated, block: B:107:0x0147  */
    /* JADX WARN: Code duplicated, block: B:109:0x014a  */
    /* JADX WARN: Code duplicated, block: B:110:0x014c  */
    /* JADX WARN: Code duplicated, block: B:112:0x014f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0152  */
    /* JADX WARN: Code duplicated, block: B:115:0x0154  */
    /* JADX WARN: Code duplicated, block: B:117:0x0157  */
    /* JADX WARN: Code duplicated, block: B:118:0x015b  */
    /* JADX WARN: Code duplicated, block: B:121:0x015f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0161  */
    /* JADX WARN: Code duplicated, block: B:125:0x0169  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:132:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac A[PHI: r11
      0x00ac: PHI (r11v22 int) = (r11v0 int), (r11v6 int), (r11v7 int) binds: [B:56:0x00aa, B:66:0x00c4, B:65:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:87:0x0101  */
    /* JADX WARN: Code duplicated, block: B:88:0x0104  */
    /* JADX WARN: Code duplicated, block: B:92:0x010e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0115  */
    /* JADX WARN: Code duplicated, block: B:96:0x0119  */
    /* JADX WARN: Code duplicated, block: B:98:0x0123  */
    /* JADX WARN: Code duplicated, block: B:99:0x0126  */
    public static final void a(final String screenName, final String title, final String description, wn0.q qVar, wn0.q qVar2, C3820sk c3820sk, final Yj lottieSource, int i11, boolean z11, p020r2.l lVar, final int i12, final int i13) {
        int i14;
        wn0.q qVar3;
        int i15;
        wn0.q qVar4;
        int i16;
        int i17;
        int i18;
        boolean zK;
        boolean zK2;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        wn0.q qVar5;
        C3820sk c3820sk2;
        int i26;
        boolean z12;
        final C3820sk c3820sk3;
        final int i27;
        final wn0.q qVar6;
        final boolean z13;
        final wn0.q qVar7;
        p020r2.w2 w2VarX;
        p013kotlin.jvm.internal.s.k(screenName, "screenName");
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(description, "description");
        p013kotlin.jvm.internal.s.k(lottieSource, "lottieSource");
        p020r2.l lVarV = lVar.v(276503476);
        if ((i13 & 1) != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 6) == 0) {
            i14 = (lVarV.n(screenName) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i12 & 48) == 0) {
            i14 |= lVarV.n(title) ? 32 : 16;
        }
        if ((i13 & 4) != 0) {
            i14 |= KyberEngine.KyberPolyBytes;
        } else if ((i12 & KyberEngine.KyberPolyBytes) == 0) {
            i14 |= lVarV.n(description) ? 256 : 128;
        }
        int i28 = i13 & 8;
        if (i28 == 0) {
            if ((i12 & 3072) == 0) {
                qVar3 = qVar;
                i14 |= lVarV.K(qVar3) ? 2048 : 1024;
            }
            i15 = i13 & 16;
            if (i15 != 0) {
                if ((i12 & 24576) == 0) {
                    qVar4 = qVar2;
                    if (lVarV.K(qVar4)) {
                        i16 = 16384;
                    } else {
                        i16 = PKIFailureInfo.certRevoked;
                    }
                    i14 |= i16;
                }
                i17 = i13 & 32;
                i18 = 196608;
                if (i17 == 0) {
                    i14 |= i18;
                } else if ((196608 & i12) == 0) {
                    if ((262144 & i12) == 0) {
                        zK = lVarV.n(c3820sk);
                    } else {
                        zK = lVarV.K(c3820sk);
                    }
                    if (zK) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i14 |= i18;
                }
                if ((i13 & 64) != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if ((2097152 & i12) == 0) {
                        zK2 = lVarV.n(lottieSource);
                    } else {
                        zK2 = lVarV.K(lottieSource);
                    }
                    if (zK2) {
                        i19 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i19 = PKIFailureInfo.signerNotTrusted;
                    }
                    i14 |= i19;
                }
                i21 = i13 & 128;
                if (i21 != 0) {
                    i14 |= 12582912;
                    i22 = i11;
                } else {
                    i22 = i11;
                    if ((i12 & 12582912) == 0) {
                        if (lVarV.r(i22)) {
                            i23 = 8388608;
                        } else {
                            i23 = 4194304;
                        }
                        i14 |= i23;
                    }
                }
                i24 = i13 & 256;
                if (i24 != 0) {
                    if ((i12 & 100663296) == 0) {
                        if (lVarV.p(z11)) {
                            i25 = 67108864;
                        } else {
                            i25 = 33554432;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 38347923) == 38347922 || !lVarV.b()) {
                        if (i28 != 0) {
                            qVar5 = null;
                        } else {
                            qVar5 = qVar3;
                        }
                        if (i15 != 0) {
                            qVar4 = null;
                        }
                        if (i17 != 0) {
                            c3820sk2 = null;
                        } else {
                            c3820sk2 = c3820sk;
                        }
                        if (i21 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i22;
                        }
                        if (i24 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(276503476, i14, -1, "com.fourthline.orca.core.internal.composable.IntroScreenWithAnimation (IntroScreens.kt:36)");
                        }
                        int i29 = (i14 & 14) | 3072 | (i14 & 112) | (57344 & i14) | (458752 & i14) | ((i14 >> 3) & 29360128);
                        wn0.q qVar8 = qVar4;
                        int i31 = i26;
                        wn0.q qVar9 = qVar5;
                        AbstractC3269fp.a(screenName, title, null, z2.c.e(-632727961, true, new a(lottieSource, i26, description, qVar5), lVarV, 54), qVar8, c3820sk2, null, z12, null, lVarV, i29, EnumC4419g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE);
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        c3820sk3 = c3820sk2;
                        i27 = i31;
                        qVar6 = qVar8;
                        z13 = z12;
                        qVar7 = qVar9;
                    } else {
                        lVarV.j();
                        qVar7 = qVar3;
                        qVar6 = qVar4;
                        z13 = z11;
                        c3820sk3 = c3820sk;
                        i27 = i22;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.jc1
                            @Override // wn0.p
                            public final Object invoke(Object obj, Object obj2) {
                                return AbstractC3818si.a(screenName, title, description, qVar7, qVar6, c3820sk3, lottieSource, i27, z13, i12, i13, (p020r2.l) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i14 |= 100663296;
                if ((i14 & 38347923) == 38347922) {
                    if (i28 != 0) {
                        qVar5 = null;
                    } else {
                        qVar5 = qVar3;
                    }
                    if (i15 != 0) {
                        qVar4 = null;
                    }
                    if (i17 != 0) {
                        c3820sk2 = null;
                    } else {
                        c3820sk2 = c3820sk;
                    }
                    if (i21 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i22;
                    }
                    if (i24 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(276503476, i14, -1, "com.fourthline.orca.core.internal.composable.IntroScreenWithAnimation (IntroScreens.kt:36)");
                    }
                    int i210 = (i14 & 14) | 3072 | (i14 & 112) | (57344 & i14) | (458752 & i14) | ((i14 >> 3) & 29360128);
                    wn0.q qVar10 = qVar4;
                    int i32 = i26;
                    wn0.q qVar11 = qVar5;
                    AbstractC3269fp.a(screenName, title, null, z2.c.e(-632727961, true, new a(lottieSource, i26, description, qVar5), lVarV, 54), qVar10, c3820sk2, null, z12, null, lVarV, i210, EnumC4419g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    c3820sk3 = c3820sk2;
                    i27 = i32;
                    qVar6 = qVar10;
                    z13 = z12;
                    qVar7 = qVar11;
                } else {
                    if (i28 != 0) {
                        qVar5 = null;
                    } else {
                        qVar5 = qVar3;
                    }
                    if (i15 != 0) {
                        qVar4 = null;
                    }
                    if (i17 != 0) {
                        c3820sk2 = null;
                    } else {
                        c3820sk2 = c3820sk;
                    }
                    if (i21 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i22;
                    }
                    if (i24 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(276503476, i14, -1, "com.fourthline.orca.core.internal.composable.IntroScreenWithAnimation (IntroScreens.kt:36)");
                    }
                    int i211 = (i14 & 14) | 3072 | (i14 & 112) | (57344 & i14) | (458752 & i14) | ((i14 >> 3) & 29360128);
                    wn0.q qVar12 = qVar4;
                    int i33 = i26;
                    wn0.q qVar13 = qVar5;
                    AbstractC3269fp.a(screenName, title, null, z2.c.e(-632727961, true, new a(lottieSource, i26, description, qVar5), lVarV, 54), qVar12, c3820sk2, null, z12, null, lVarV, i211, EnumC4419g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    c3820sk3 = c3820sk2;
                    i27 = i33;
                    qVar6 = qVar12;
                    z13 = z12;
                    qVar7 = qVar13;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.jc1
                        @Override // wn0.p
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC3818si.a(screenName, title, description, qVar7, qVar6, c3820sk3, lottieSource, i27, z13, i12, i13, (p020r2.l) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= 24576;
            qVar4 = qVar2;
            i17 = i13 & 32;
            i18 = 196608;
            if (i17 == 0) {
                i14 |= i18;
            } else if ((196608 & i12) == 0) {
                if ((262144 & i12) == 0) {
                    zK = lVarV.n(c3820sk);
                } else {
                    zK = lVarV.K(c3820sk);
                }
                if (zK) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i14 |= i18;
            }
            if ((i13 & 64) != 0) {
                i14 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if ((2097152 & i12) == 0) {
                    zK2 = lVarV.n(lottieSource);
                } else {
                    zK2 = lVarV.K(lottieSource);
                }
                if (zK2) {
                    i19 = PKIFailureInfo.badCertTemplate;
                } else {
                    i19 = PKIFailureInfo.signerNotTrusted;
                }
                i14 |= i19;
            }
            i21 = i13 & 128;
            if (i21 != 0) {
                i14 |= 12582912;
                i22 = i11;
            } else {
                i22 = i11;
                if ((i12 & 12582912) == 0) {
                    if (lVarV.r(i22)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i14 |= i23;
                }
            }
            i24 = i13 & 256;
            if (i24 != 0) {
                if ((i12 & 100663296) == 0) {
                    if (lVarV.p(z11)) {
                        i25 = 67108864;
                    } else {
                        i25 = 33554432;
                    }
                    i14 |= i25;
                }
                if ((i14 & 38347923) == 38347922) {
                    if (i28 != 0) {
                        qVar5 = null;
                    } else {
                        qVar5 = qVar3;
                    }
                    if (i15 != 0) {
                        qVar4 = null;
                    }
                    if (i17 != 0) {
                        c3820sk2 = null;
                    } else {
                        c3820sk2 = c3820sk;
                    }
                    if (i21 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i22;
                    }
                    if (i24 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(276503476, i14, -1, "com.fourthline.orca.core.internal.composable.IntroScreenWithAnimation (IntroScreens.kt:36)");
                    }
                    int i212 = (i14 & 14) | 3072 | (i14 & 112) | (57344 & i14) | (458752 & i14) | ((i14 >> 3) & 29360128);
                    wn0.q qVar14 = qVar4;
                    int i34 = i26;
                    wn0.q qVar15 = qVar5;
                    AbstractC3269fp.a(screenName, title, null, z2.c.e(-632727961, true, new a(lottieSource, i26, description, qVar5), lVarV, 54), qVar14, c3820sk2, null, z12, null, lVarV, i212, EnumC4419g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    c3820sk3 = c3820sk2;
                    i27 = i34;
                    qVar6 = qVar14;
                    z13 = z12;
                    qVar7 = qVar15;
                } else {
                    if (i28 != 0) {
                        qVar5 = null;
                    } else {
                        qVar5 = qVar3;
                    }
                    if (i15 != 0) {
                        qVar4 = null;
                    }
                    if (i17 != 0) {
                        c3820sk2 = null;
                    } else {
                        c3820sk2 = c3820sk;
                    }
                    if (i21 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i22;
                    }
                    if (i24 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(276503476, i14, -1, "com.fourthline.orca.core.internal.composable.IntroScreenWithAnimation (IntroScreens.kt:36)");
                    }
                    int i213 = (i14 & 14) | 3072 | (i14 & 112) | (57344 & i14) | (458752 & i14) | ((i14 >> 3) & 29360128);
                    wn0.q qVar16 = qVar4;
                    int i35 = i26;
                    wn0.q qVar17 = qVar5;
                    AbstractC3269fp.a(screenName, title, null, z2.c.e(-632727961, true, new a(lottieSource, i26, description, qVar5), lVarV, 54), qVar16, c3820sk2, null, z12, null, lVarV, i213, EnumC4419g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    c3820sk3 = c3820sk2;
                    i27 = i35;
                    qVar6 = qVar16;
                    z13 = z12;
                    qVar7 = qVar17;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.jc1
                        @Override // wn0.p
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC3818si.a(screenName, title, description, qVar7, qVar6, c3820sk3, lottieSource, i27, z13, i12, i13, (p020r2.l) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= 100663296;
            if ((i14 & 38347923) == 38347922) {
                if (i28 != 0) {
                    qVar5 = null;
                } else {
                    qVar5 = qVar3;
                }
                if (i15 != 0) {
                    qVar4 = null;
                }
                if (i17 != 0) {
                    c3820sk2 = null;
                } else {
                    c3820sk2 = c3820sk;
                }
                if (i21 != 0) {
                    i26 = Integer.MAX_VALUE;
                } else {
                    i26 = i22;
                }
                if (i24 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(276503476, i14, -1, "com.fourthline.orca.core.internal.composable.IntroScreenWithAnimation (IntroScreens.kt:36)");
                }
                int i214 = (i14 & 14) | 3072 | (i14 & 112) | (57344 & i14) | (458752 & i14) | ((i14 >> 3) & 29360128);
                wn0.q qVar18 = qVar4;
                int i36 = i26;
                wn0.q qVar19 = qVar5;
                AbstractC3269fp.a(screenName, title, null, z2.c.e(-632727961, true, new a(lottieSource, i26, description, qVar5), lVarV, 54), qVar18, c3820sk2, null, z12, null, lVarV, i214, EnumC4419g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                c3820sk3 = c3820sk2;
                i27 = i36;
                qVar6 = qVar18;
                z13 = z12;
                qVar7 = qVar19;
            } else {
                if (i28 != 0) {
                    qVar5 = null;
                } else {
                    qVar5 = qVar3;
                }
                if (i15 != 0) {
                    qVar4 = null;
                }
                if (i17 != 0) {
                    c3820sk2 = null;
                } else {
                    c3820sk2 = c3820sk;
                }
                if (i21 != 0) {
                    i26 = Integer.MAX_VALUE;
                } else {
                    i26 = i22;
                }
                if (i24 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(276503476, i14, -1, "com.fourthline.orca.core.internal.composable.IntroScreenWithAnimation (IntroScreens.kt:36)");
                }
                int i215 = (i14 & 14) | 3072 | (i14 & 112) | (57344 & i14) | (458752 & i14) | ((i14 >> 3) & 29360128);
                wn0.q qVar110 = qVar4;
                int i37 = i26;
                wn0.q qVar111 = qVar5;
                AbstractC3269fp.a(screenName, title, null, z2.c.e(-632727961, true, new a(lottieSource, i26, description, qVar5), lVarV, 54), qVar110, c3820sk2, null, z12, null, lVarV, i215, EnumC4419g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                c3820sk3 = c3820sk2;
                i27 = i37;
                qVar6 = qVar110;
                z13 = z12;
                qVar7 = qVar111;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.jc1
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC3818si.a(screenName, title, description, qVar7, qVar6, c3820sk3, lottieSource, i27, z13, i12, i13, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i14 |= 3072;
        qVar3 = qVar;
        i15 = i13 & 16;
        if (i15 != 0) {
            if ((i12 & 24576) == 0) {
                qVar4 = qVar2;
                if (lVarV.K(qVar4)) {
                    i16 = 16384;
                } else {
                    i16 = PKIFailureInfo.certRevoked;
                }
                i14 |= i16;
            }
            i17 = i13 & 32;
            i18 = 196608;
            if (i17 == 0) {
                i14 |= i18;
            } else if ((196608 & i12) == 0) {
                if ((262144 & i12) == 0) {
                    zK = lVarV.n(c3820sk);
                } else {
                    zK = lVarV.K(c3820sk);
                }
                if (zK) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i14 |= i18;
            }
            if ((i13 & 64) != 0) {
                i14 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if ((2097152 & i12) == 0) {
                    zK2 = lVarV.n(lottieSource);
                } else {
                    zK2 = lVarV.K(lottieSource);
                }
                if (zK2) {
                    i19 = PKIFailureInfo.badCertTemplate;
                } else {
                    i19 = PKIFailureInfo.signerNotTrusted;
                }
                i14 |= i19;
            }
            i21 = i13 & 128;
            if (i21 != 0) {
                i14 |= 12582912;
                i22 = i11;
            } else {
                i22 = i11;
                if ((i12 & 12582912) == 0) {
                    if (lVarV.r(i22)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i14 |= i23;
                }
            }
            i24 = i13 & 256;
            if (i24 != 0) {
                if ((i12 & 100663296) == 0) {
                    if (lVarV.p(z11)) {
                        i25 = 67108864;
                    } else {
                        i25 = 33554432;
                    }
                    i14 |= i25;
                }
                if ((i14 & 38347923) == 38347922) {
                    if (i28 != 0) {
                        qVar5 = null;
                    } else {
                        qVar5 = qVar3;
                    }
                    if (i15 != 0) {
                        qVar4 = null;
                    }
                    if (i17 != 0) {
                        c3820sk2 = null;
                    } else {
                        c3820sk2 = c3820sk;
                    }
                    if (i21 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i22;
                    }
                    if (i24 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(276503476, i14, -1, "com.fourthline.orca.core.internal.composable.IntroScreenWithAnimation (IntroScreens.kt:36)");
                    }
                    int i216 = (i14 & 14) | 3072 | (i14 & 112) | (57344 & i14) | (458752 & i14) | ((i14 >> 3) & 29360128);
                    wn0.q qVar112 = qVar4;
                    int i38 = i26;
                    wn0.q qVar113 = qVar5;
                    AbstractC3269fp.a(screenName, title, null, z2.c.e(-632727961, true, new a(lottieSource, i26, description, qVar5), lVarV, 54), qVar112, c3820sk2, null, z12, null, lVarV, i216, EnumC4419g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    c3820sk3 = c3820sk2;
                    i27 = i38;
                    qVar6 = qVar112;
                    z13 = z12;
                    qVar7 = qVar113;
                } else {
                    if (i28 != 0) {
                        qVar5 = null;
                    } else {
                        qVar5 = qVar3;
                    }
                    if (i15 != 0) {
                        qVar4 = null;
                    }
                    if (i17 != 0) {
                        c3820sk2 = null;
                    } else {
                        c3820sk2 = c3820sk;
                    }
                    if (i21 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i22;
                    }
                    if (i24 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(276503476, i14, -1, "com.fourthline.orca.core.internal.composable.IntroScreenWithAnimation (IntroScreens.kt:36)");
                    }
                    int i217 = (i14 & 14) | 3072 | (i14 & 112) | (57344 & i14) | (458752 & i14) | ((i14 >> 3) & 29360128);
                    wn0.q qVar114 = qVar4;
                    int i39 = i26;
                    wn0.q qVar115 = qVar5;
                    AbstractC3269fp.a(screenName, title, null, z2.c.e(-632727961, true, new a(lottieSource, i26, description, qVar5), lVarV, 54), qVar114, c3820sk2, null, z12, null, lVarV, i217, EnumC4419g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    c3820sk3 = c3820sk2;
                    i27 = i39;
                    qVar6 = qVar114;
                    z13 = z12;
                    qVar7 = qVar115;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.jc1
                        @Override // wn0.p
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC3818si.a(screenName, title, description, qVar7, qVar6, c3820sk3, lottieSource, i27, z13, i12, i13, (p020r2.l) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= 100663296;
            if ((i14 & 38347923) == 38347922) {
                if (i28 != 0) {
                    qVar5 = null;
                } else {
                    qVar5 = qVar3;
                }
                if (i15 != 0) {
                    qVar4 = null;
                }
                if (i17 != 0) {
                    c3820sk2 = null;
                } else {
                    c3820sk2 = c3820sk;
                }
                if (i21 != 0) {
                    i26 = Integer.MAX_VALUE;
                } else {
                    i26 = i22;
                }
                if (i24 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(276503476, i14, -1, "com.fourthline.orca.core.internal.composable.IntroScreenWithAnimation (IntroScreens.kt:36)");
                }
                int i218 = (i14 & 14) | 3072 | (i14 & 112) | (57344 & i14) | (458752 & i14) | ((i14 >> 3) & 29360128);
                wn0.q qVar116 = qVar4;
                int i310 = i26;
                wn0.q qVar117 = qVar5;
                AbstractC3269fp.a(screenName, title, null, z2.c.e(-632727961, true, new a(lottieSource, i26, description, qVar5), lVarV, 54), qVar116, c3820sk2, null, z12, null, lVarV, i218, EnumC4419g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                c3820sk3 = c3820sk2;
                i27 = i310;
                qVar6 = qVar116;
                z13 = z12;
                qVar7 = qVar117;
            } else {
                if (i28 != 0) {
                    qVar5 = null;
                } else {
                    qVar5 = qVar3;
                }
                if (i15 != 0) {
                    qVar4 = null;
                }
                if (i17 != 0) {
                    c3820sk2 = null;
                } else {
                    c3820sk2 = c3820sk;
                }
                if (i21 != 0) {
                    i26 = Integer.MAX_VALUE;
                } else {
                    i26 = i22;
                }
                if (i24 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(276503476, i14, -1, "com.fourthline.orca.core.internal.composable.IntroScreenWithAnimation (IntroScreens.kt:36)");
                }
                int i219 = (i14 & 14) | 3072 | (i14 & 112) | (57344 & i14) | (458752 & i14) | ((i14 >> 3) & 29360128);
                wn0.q qVar118 = qVar4;
                int i311 = i26;
                wn0.q qVar119 = qVar5;
                AbstractC3269fp.a(screenName, title, null, z2.c.e(-632727961, true, new a(lottieSource, i26, description, qVar5), lVarV, 54), qVar118, c3820sk2, null, z12, null, lVarV, i219, EnumC4419g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                c3820sk3 = c3820sk2;
                i27 = i311;
                qVar6 = qVar118;
                z13 = z12;
                qVar7 = qVar119;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.jc1
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC3818si.a(screenName, title, description, qVar7, qVar6, c3820sk3, lottieSource, i27, z13, i12, i13, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i14 |= 24576;
        qVar4 = qVar2;
        i17 = i13 & 32;
        i18 = 196608;
        if (i17 == 0) {
            i14 |= i18;
        } else if ((196608 & i12) == 0) {
            if ((262144 & i12) == 0) {
                zK = lVarV.n(c3820sk);
            } else {
                zK = lVarV.K(c3820sk);
            }
            if (zK) {
                i18 = 131072;
            } else {
                i18 = 65536;
            }
            i14 |= i18;
        }
        if ((i13 & 64) != 0) {
            i14 |= 1572864;
        } else if ((i12 & 1572864) == 0) {
            if ((2097152 & i12) == 0) {
                zK2 = lVarV.n(lottieSource);
            } else {
                zK2 = lVarV.K(lottieSource);
            }
            if (zK2) {
                i19 = PKIFailureInfo.badCertTemplate;
            } else {
                i19 = PKIFailureInfo.signerNotTrusted;
            }
            i14 |= i19;
        }
        i21 = i13 & 128;
        if (i21 != 0) {
            i14 |= 12582912;
            i22 = i11;
        } else {
            i22 = i11;
            if ((i12 & 12582912) == 0) {
                if (lVarV.r(i22)) {
                    i23 = 8388608;
                } else {
                    i23 = 4194304;
                }
                i14 |= i23;
            }
        }
        i24 = i13 & 256;
        if (i24 != 0) {
            if ((i12 & 100663296) == 0) {
                if (lVarV.p(z11)) {
                    i25 = 67108864;
                } else {
                    i25 = 33554432;
                }
                i14 |= i25;
            }
            if ((i14 & 38347923) == 38347922) {
                if (i28 != 0) {
                    qVar5 = null;
                } else {
                    qVar5 = qVar3;
                }
                if (i15 != 0) {
                    qVar4 = null;
                }
                if (i17 != 0) {
                    c3820sk2 = null;
                } else {
                    c3820sk2 = c3820sk;
                }
                if (i21 != 0) {
                    i26 = Integer.MAX_VALUE;
                } else {
                    i26 = i22;
                }
                if (i24 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(276503476, i14, -1, "com.fourthline.orca.core.internal.composable.IntroScreenWithAnimation (IntroScreens.kt:36)");
                }
                int i2110 = (i14 & 14) | 3072 | (i14 & 112) | (57344 & i14) | (458752 & i14) | ((i14 >> 3) & 29360128);
                wn0.q qVar1110 = qVar4;
                int i312 = i26;
                wn0.q qVar1111 = qVar5;
                AbstractC3269fp.a(screenName, title, null, z2.c.e(-632727961, true, new a(lottieSource, i26, description, qVar5), lVarV, 54), qVar1110, c3820sk2, null, z12, null, lVarV, i2110, EnumC4419g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                c3820sk3 = c3820sk2;
                i27 = i312;
                qVar6 = qVar1110;
                z13 = z12;
                qVar7 = qVar1111;
            } else {
                if (i28 != 0) {
                    qVar5 = null;
                } else {
                    qVar5 = qVar3;
                }
                if (i15 != 0) {
                    qVar4 = null;
                }
                if (i17 != 0) {
                    c3820sk2 = null;
                } else {
                    c3820sk2 = c3820sk;
                }
                if (i21 != 0) {
                    i26 = Integer.MAX_VALUE;
                } else {
                    i26 = i22;
                }
                if (i24 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(276503476, i14, -1, "com.fourthline.orca.core.internal.composable.IntroScreenWithAnimation (IntroScreens.kt:36)");
                }
                int i2111 = (i14 & 14) | 3072 | (i14 & 112) | (57344 & i14) | (458752 & i14) | ((i14 >> 3) & 29360128);
                wn0.q qVar1112 = qVar4;
                int i313 = i26;
                wn0.q qVar1113 = qVar5;
                AbstractC3269fp.a(screenName, title, null, z2.c.e(-632727961, true, new a(lottieSource, i26, description, qVar5), lVarV, 54), qVar1112, c3820sk2, null, z12, null, lVarV, i2111, EnumC4419g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                c3820sk3 = c3820sk2;
                i27 = i313;
                qVar6 = qVar1112;
                z13 = z12;
                qVar7 = qVar1113;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.jc1
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC3818si.a(screenName, title, description, qVar7, qVar6, c3820sk3, lottieSource, i27, z13, i12, i13, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i14 |= 100663296;
        if ((i14 & 38347923) == 38347922) {
            if (i28 != 0) {
                qVar5 = null;
            } else {
                qVar5 = qVar3;
            }
            if (i15 != 0) {
                qVar4 = null;
            }
            if (i17 != 0) {
                c3820sk2 = null;
            } else {
                c3820sk2 = c3820sk;
            }
            if (i21 != 0) {
                i26 = Integer.MAX_VALUE;
            } else {
                i26 = i22;
            }
            if (i24 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(276503476, i14, -1, "com.fourthline.orca.core.internal.composable.IntroScreenWithAnimation (IntroScreens.kt:36)");
            }
            int i2112 = (i14 & 14) | 3072 | (i14 & 112) | (57344 & i14) | (458752 & i14) | ((i14 >> 3) & 29360128);
            wn0.q qVar1114 = qVar4;
            int i314 = i26;
            wn0.q qVar1115 = qVar5;
            AbstractC3269fp.a(screenName, title, null, z2.c.e(-632727961, true, new a(lottieSource, i26, description, qVar5), lVarV, 54), qVar1114, c3820sk2, null, z12, null, lVarV, i2112, EnumC4419g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            c3820sk3 = c3820sk2;
            i27 = i314;
            qVar6 = qVar1114;
            z13 = z12;
            qVar7 = qVar1115;
        } else {
            if (i28 != 0) {
                qVar5 = null;
            } else {
                qVar5 = qVar3;
            }
            if (i15 != 0) {
                qVar4 = null;
            }
            if (i17 != 0) {
                c3820sk2 = null;
            } else {
                c3820sk2 = c3820sk;
            }
            if (i21 != 0) {
                i26 = Integer.MAX_VALUE;
            } else {
                i26 = i22;
            }
            if (i24 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(276503476, i14, -1, "com.fourthline.orca.core.internal.composable.IntroScreenWithAnimation (IntroScreens.kt:36)");
            }
            int i2113 = (i14 & 14) | 3072 | (i14 & 112) | (57344 & i14) | (458752 & i14) | ((i14 >> 3) & 29360128);
            wn0.q qVar1116 = qVar4;
            int i315 = i26;
            wn0.q qVar1117 = qVar5;
            AbstractC3269fp.a(screenName, title, null, z2.c.e(-632727961, true, new a(lottieSource, i26, description, qVar5), lVarV, 54), qVar1116, c3820sk2, null, z12, null, lVarV, i2113, EnumC4419g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            c3820sk3 = c3820sk2;
            i27 = i315;
            qVar6 = qVar1116;
            z13 = z12;
            qVar7 = qVar1117;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.jc1
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3818si.a(screenName, title, description, qVar7, qVar6, c3820sk3, lottieSource, i27, z13, i12, i13, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
