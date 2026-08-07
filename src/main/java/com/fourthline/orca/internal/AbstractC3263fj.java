package com.fourthline.orca.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import i4.ParagraphStyle;
import i4.SpanStyle;
import i4.TextLayoutResult;
import i4.TextStyle;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p009i2.C4672l;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.fj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3263fj {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.fj$a */
    static final class a implements wn0.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f31766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i4.d f31767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextStyle f31768c;

        a(androidx.compose.ui.d dVar, i4.d dVar2, TextStyle textStyle) {
            this.f31766a = dVar;
            this.f31767b = dVar2;
            this.f31768c = textStyle;
        }

        public final void a(v1.g0 TextButton, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(TextButton, "$this$TextButton");
            if ((i11 & 17) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1808851666, i11, -1, "com.fourthline.orca.core.internal.composable.LinkButton.<anonymous>.<anonymous>.<anonymous> (LinkButton.kt:95)");
            }
            p009i2.v2.c(this.f31767b, AbstractC3307gk.a(this.f31766a, "linkButton", (String) null, 2, (Object) null), 0L, 0L, null, null, null, 0L, null, t4.j.h(t4.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, null, this.f31768c, lVar, 0, 0, 130556);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((v1.g0) obj, (p020r2.l) obj2, ((Number) obj3).intValue());
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(androidx.compose.ui.d dVar, String str, String str2, String str3, boolean z11, boolean z12, wn0.a aVar, int i11, int i12, p020r2.l lVar, int i13) {
        a(dVar, str, str2, str3, z11, z12, aVar, lVar, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0131 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0133  */
    /* JADX WARN: Code duplicated, block: B:105:0x0170  */
    /* JADX WARN: Code duplicated, block: B:108:0x017c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0180  */
    /* JADX WARN: Code duplicated, block: B:112:0x019f  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:117:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:121:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:124:0x0202  */
    /* JADX WARN: Code duplicated, block: B:126:0x0208  */
    /* JADX WARN: Code duplicated, block: B:132:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:135:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:142:0x032d A[Catch: all -> 0x0369, TRY_LEAVE, TryCatch #2 {all -> 0x0369, blocks: (B:128:0x029d, B:137:0x02ec, B:140:0x0326, B:142:0x032d, B:144:0x0365, B:148:0x036d, B:149:0x0370, B:170:0x0412, B:171:0x0415, B:172:0x0416, B:173:0x0419, B:129:0x02cf, B:136:0x02e4, B:139:0x0323, B:143:0x0362), top: B:182:0x029d, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0389  */
    /* JADX WARN: Code duplicated, block: B:153:0x038b  */
    /* JADX WARN: Code duplicated, block: B:156:0x0392  */
    /* JADX WARN: Code duplicated, block: B:160:0x039c  */
    /* JADX WARN: Code duplicated, block: B:163:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:167:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:176:0x041e  */
    /* JADX WARN: Code duplicated, block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x009c  */
    /* JADX WARN: Code duplicated, block: B:53:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:88:0x0100  */
    /* JADX WARN: Code duplicated, block: B:89:0x0102  */
    /* JADX WARN: Code duplicated, block: B:92:0x0106  */
    /* JADX WARN: Code duplicated, block: B:93:0x0108  */
    /* JADX WARN: Code duplicated, block: B:96:0x010f  */
    /* JADX WARN: Code duplicated, block: B:99:0x012a  */
    public static final void a(androidx.compose.ui.d dVar, final String text, final String link, String str, boolean z11, boolean z12, final wn0.a onClick, p020r2.l lVar, final int i11, final int i12) {
        androidx.compose.ui.d dVar2;
        int i13;
        String str2;
        int i14;
        boolean z13;
        int i15;
        int i16;
        boolean z14;
        int i17;
        int i18;
        boolean z15;
        final boolean z16;
        StatefulLinkButtonElement linkButton;
        TextStyle textStyleA;
        StatefulLinkButtonElement.LinkElement disabled;
        int iA;
        wn0.a<b4.g> aVarA;
        p020r2.l lVarA;
        wn0.p<b4.g, Integer, jn0.h0> pVarB;
        Object objI;
        p020r2.l.Companion companion;
        final p020r2.p1 p1Var;
        boolean z17;
        Object objI2;
        int i19;
        String str3;
        i4.d.a aVar;
        int iM;
        int iN;
        String str4;
        int iN2;
        boolean z18;
        Object objI3;
        final String str5;
        final boolean z19;
        final boolean z21;
        final androidx.compose.ui.d dVar3;
        int iN3;
        p020r2.w2 w2VarX;
        p013kotlin.jvm.internal.s.k(text, "text");
        p013kotlin.jvm.internal.s.k(link, "link");
        p013kotlin.jvm.internal.s.k(onClick, "onClick");
        p020r2.l lVarV = lVar.v(-1877006879);
        int i21 = i12 & 1;
        if (i21 != 0) {
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
        if ((i12 & 4) != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i13 |= lVarV.n(link) ? 256 : 128;
        }
        int i22 = i12 & 8;
        if (i22 == 0) {
            if ((i11 & 3072) == 0) {
                str2 = str;
                i13 |= lVarV.n(str2) ? 2048 : 1024;
            }
            i14 = i12 & 16;
            if (i14 != 0) {
                if ((i11 & 24576) == 0) {
                    z13 = z11;
                    if (lVarV.p(z13)) {
                        i15 = 16384;
                    } else {
                        i15 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 32;
                if (i16 != 0) {
                    i13 |= 196608;
                    z14 = z12;
                } else {
                    z14 = z12;
                    if ((i11 & 196608) == 0) {
                        if (lVarV.p(z14)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i13 |= i17;
                    }
                }
                if ((i12 & 64) != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (lVarV.K(onClick)) {
                        i18 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i18 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i18;
                }
                if ((i13 & 599187) == 599186 || !lVarV.b()) {
                    if (i21 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i22 != 0) {
                        str2 = null;
                    }
                    if (i14 != 0) {
                        z15 = true;
                    } else {
                        z15 = z13;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    } else {
                        z16 = z14;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1877006879, i13, -1, "com.fourthline.orca.core.internal.composable.LinkButton (LinkButton.kt:38)");
                    }
                    linkButton = C3825sp.f35377a.b(lVarV, 6).getLinkButton();
                    textStyleA = linkButton.getMessage().a(null, lVarV, 0, 1);
                    if (!z15) {
                        disabled = linkButton.getDisabled();
                    } else {
                        if (!z15) {
                            throw new NoWhenBranchMatchedException();
                        }
                        disabled = linkButton.getDefault();
                    }
                    StatefulLinkButtonElement.LinkElement linkElement = disabled;
                    androidx.compose.ui.d dVarA = AbstractC3307gk.a(androidx.compose.foundation.layout.x.b(AbstractC3307gk.a(dVar2), BitmapDescriptorFactory.HUE_RED, Ko.f26627a.a(), 1, null), "linkView", (String) null, 2, (Object) null);
                    z3.i0 i0VarH = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.e(), false);
                    iA = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC = lVarV.c();
                    androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, dVarA);
                    b4.g.Companion companion2 = b4.g.INSTANCE;
                    aVarA = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA, i0VarH, companion2.c());
                    p020r2.d4.b(lVarA, xVarC, companion2.e());
                    pVarB = companion2.b();
                    if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    p020r2.d4.b(lVarA, dVarE, companion2.d());
                    androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
                    lVarV.o(-2065450255);
                    objI = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = p020r2.s3.d(Boolean.FALSE, null, 2, null);
                        lVarV.B(objI);
                    }
                    p1Var = (p020r2.p1) objI;
                    lVarV.l();
                    androidx.compose.ui.d dVarA2 = h3.a.a(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED);
                    lVarV.o(-2065441201);
                    if ((458752 & i13) == 131072) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objI2 = lVarV.I();
                    if (z17 || objI2 == companion.a()) {
                        objI2 = new wn0.l() { // from class: com.fourthline.orca.internal.v11
                            @Override // wn0.l
                            public final Object invoke(Object obj) {
                                return AbstractC3263fj.a(p1Var, z16, (TextLayoutResult) obj);
                            }
                        };
                        lVarV.B(objI2);
                    }
                    lVarV.l();
                    boolean z22 = z15;
                    androidx.compose.ui.d dVar4 = dVar2;
                    i19 = i13;
                    str3 = str2;
                    boolean z23 = z16;
                    p009i2.v2.b(text, dVarA2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, (wn0.l) objI2, textStyleA, lVarV, ((i13 >> 3) & 14) | 48, 0, 32764);
                    lVarV.o(-2065435832);
                    aVar = new i4.d.a(0, 1, null);
                    long jP = k3.p1.p(linkElement.getLink().getColor().a(lVarV, 0), linkElement.getOpacity(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    iM = aVar.m(new ParagraphStyle(0, 0, textStyleA.u(), null, null, null, 0, 0, null, 507, null));
                    try {
                        iN = aVar.n(new SpanStyle(textStyleA.j(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                        try {
                            if (((Boolean) p1Var.getValue()).booleanValue()) {
                                str4 = "\n";
                            } else {
                                str4 = " ";
                            }
                            aVar.i(text);
                            aVar.i(str4);
                            jn0.h0 h0Var = jn0.h0.f84049a;
                            aVar.k(iN);
                            iN2 = aVar.n(new SpanStyle(jP, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61438, null));
                            try {
                                aVar.i(link);
                                aVar.k(iN2);
                                if (str3 != null) {
                                    aVar.i(" ");
                                    iN3 = aVar.n(new SpanStyle(textStyleA.j(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                                    try {
                                        aVar.i(str3);
                                        aVar.k(iN3);
                                    } catch (Throwable th2) {
                                        aVar.k(iN3);
                                        throw th2;
                                    }
                                }
                                aVar.k(iM);
                                i4.d dVarO = aVar.o();
                                lVarV.l();
                                lVarV.o(-2065400900);
                                if ((i19 & 3670016) == 1048576) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                objI3 = lVarV.I();
                                if (z18 || objI3 == companion.a()) {
                                    objI3 = new wn0.a() { // from class: com.fourthline.orca.internal.w11
                                        @Override // wn0.a
                                        public final Object invoke() {
                                            return AbstractC3263fj.a(onClick);
                                        }
                                    };
                                    lVarV.B(objI3);
                                }
                                lVarV.l();
                                C4672l.c(VA.a(0L, (wn0.a) objI3, lVarV, 0, 1), null, z22, null, null, null, null, null, null, z2.c.e(-1808851666, true, new a(dVar4, dVarO, textStyleA), lVarV, 54), lVarV, ((i19 >> 6) & 896) | 805306368, 506);
                                lVarV = lVarV;
                                lVarV.g();
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                                str5 = str3;
                                z19 = z23;
                                z21 = z22;
                                dVar3 = dVar4;
                            } catch (Throwable th3) {
                                aVar.k(iN2);
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            aVar.k(iN);
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        aVar.k(iM);
                        throw th5;
                    }
                } else {
                    lVarV.j();
                    dVar3 = dVar2;
                    str5 = str2;
                    z21 = z13;
                    z19 = z14;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.x11
                        @Override // wn0.p
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC3263fj.a(dVar3, text, link, str5, z21, z19, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            z13 = z11;
            i16 = i12 & 32;
            if (i16 != 0) {
                i13 |= 196608;
                z14 = z12;
            } else {
                z14 = z12;
                if ((i11 & 196608) == 0) {
                    if (lVarV.p(z14)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
            }
            if ((i12 & 64) != 0) {
                i13 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (lVarV.K(onClick)) {
                    i18 = PKIFailureInfo.badCertTemplate;
                } else {
                    i18 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i18;
            }
            if ((i13 & 599187) == 599186) {
                if (i21 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i22 != 0) {
                    str2 = null;
                }
                if (i14 != 0) {
                    z15 = true;
                } else {
                    z15 = z13;
                }
                if (i16 != 0) {
                    z16 = false;
                } else {
                    z16 = z14;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1877006879, i13, -1, "com.fourthline.orca.core.internal.composable.LinkButton (LinkButton.kt:38)");
                }
                linkButton = C3825sp.f35377a.b(lVarV, 6).getLinkButton();
                textStyleA = linkButton.getMessage().a(null, lVarV, 0, 1);
                if (!z15) {
                    disabled = linkButton.getDisabled();
                } else {
                    if (!z15) {
                        throw new NoWhenBranchMatchedException();
                    }
                    disabled = linkButton.getDefault();
                }
                StatefulLinkButtonElement.LinkElement linkElement2 = disabled;
                androidx.compose.ui.d dVarA3 = AbstractC3307gk.a(androidx.compose.foundation.layout.x.b(AbstractC3307gk.a(dVar2), BitmapDescriptorFactory.HUE_RED, Ko.f26627a.a(), 1, null), "linkView", (String) null, 2, (Object) null);
                z3.i0 i0VarH2 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.e(), false);
                iA = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC2 = lVarV.c();
                androidx.compose.ui.d dVarE2 = androidx.compose.ui.c.e(lVarV, dVarA3);
                b4.g.Companion companion3 = b4.g.INSTANCE;
                aVarA = companion3.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA, i0VarH2, companion3.c());
                p020r2.d4.b(lVarA, xVarC2, companion3.e());
                pVarB = companion3.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                p020r2.d4.b(lVarA, dVarE2, companion3.d());
                androidx.compose.foundation.layout.i iVar2 = androidx.compose.foundation.layout.i.f4585a;
                lVarV.o(-2065450255);
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    objI = p020r2.s3.d(Boolean.FALSE, null, 2, null);
                    lVarV.B(objI);
                }
                p1Var = (p020r2.p1) objI;
                lVarV.l();
                androidx.compose.ui.d dVarA4 = h3.a.a(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED);
                lVarV.o(-2065441201);
                if ((458752 & i13) == 131072) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objI2 = lVarV.I();
                if (z17) {
                    objI2 = new wn0.l() { // from class: com.fourthline.orca.internal.v11
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return AbstractC3263fj.a(p1Var, z16, (TextLayoutResult) obj);
                        }
                    };
                    lVarV.B(objI2);
                } else {
                    objI2 = new wn0.l() { // from class: com.fourthline.orca.internal.v11
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return AbstractC3263fj.a(p1Var, z16, (TextLayoutResult) obj);
                        }
                    };
                    lVarV.B(objI2);
                }
                lVarV.l();
                boolean z24 = z15;
                androidx.compose.ui.d dVar5 = dVar2;
                i19 = i13;
                str3 = str2;
                boolean z25 = z16;
                p009i2.v2.b(text, dVarA4, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, (wn0.l) objI2, textStyleA, lVarV, ((i13 >> 3) & 14) | 48, 0, 32764);
                lVarV.o(-2065435832);
                aVar = new i4.d.a(0, 1, null);
                long jP2 = k3.p1.p(linkElement2.getLink().getColor().a(lVarV, 0), linkElement2.getOpacity(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                iM = aVar.m(new ParagraphStyle(0, 0, textStyleA.u(), null, null, null, 0, 0, null, 507, null));
                iN = aVar.n(new SpanStyle(textStyleA.j(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                if (((Boolean) p1Var.getValue()).booleanValue()) {
                    str4 = "\n";
                } else {
                    str4 = " ";
                }
                aVar.i(text);
                aVar.i(str4);
                jn0.h0 h0Var2 = jn0.h0.f84049a;
                aVar.k(iN);
                iN2 = aVar.n(new SpanStyle(jP2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61438, null));
                aVar.i(link);
                aVar.k(iN2);
                if (str3 != null) {
                    aVar.i(" ");
                    iN3 = aVar.n(new SpanStyle(textStyleA.j(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                    aVar.i(str3);
                    aVar.k(iN3);
                }
                aVar.k(iM);
                i4.d dVarO2 = aVar.o();
                lVarV.l();
                lVarV.o(-2065400900);
                if ((i19 & 3670016) == 1048576) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objI3 = lVarV.I();
                if (z18) {
                    objI3 = new wn0.a() { // from class: com.fourthline.orca.internal.w11
                        @Override // wn0.a
                        public final Object invoke() {
                            return AbstractC3263fj.a(onClick);
                        }
                    };
                    lVarV.B(objI3);
                } else {
                    objI3 = new wn0.a() { // from class: com.fourthline.orca.internal.w11
                        @Override // wn0.a
                        public final Object invoke() {
                            return AbstractC3263fj.a(onClick);
                        }
                    };
                    lVarV.B(objI3);
                }
                lVarV.l();
                C4672l.c(VA.a(0L, (wn0.a) objI3, lVarV, 0, 1), null, z24, null, null, null, null, null, null, z2.c.e(-1808851666, true, new a(dVar5, dVarO2, textStyleA), lVarV, 54), lVarV, ((i19 >> 6) & 896) | 805306368, 506);
                lVarV = lVarV;
                lVarV.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                str5 = str3;
                z19 = z25;
                z21 = z24;
                dVar3 = dVar5;
            } else {
                if (i21 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i22 != 0) {
                    str2 = null;
                }
                if (i14 != 0) {
                    z15 = true;
                } else {
                    z15 = z13;
                }
                if (i16 != 0) {
                    z16 = false;
                } else {
                    z16 = z14;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1877006879, i13, -1, "com.fourthline.orca.core.internal.composable.LinkButton (LinkButton.kt:38)");
                }
                linkButton = C3825sp.f35377a.b(lVarV, 6).getLinkButton();
                textStyleA = linkButton.getMessage().a(null, lVarV, 0, 1);
                if (!z15) {
                    disabled = linkButton.getDisabled();
                } else {
                    if (!z15) {
                        throw new NoWhenBranchMatchedException();
                    }
                    disabled = linkButton.getDefault();
                }
                StatefulLinkButtonElement.LinkElement linkElement3 = disabled;
                androidx.compose.ui.d dVarA5 = AbstractC3307gk.a(androidx.compose.foundation.layout.x.b(AbstractC3307gk.a(dVar2), BitmapDescriptorFactory.HUE_RED, Ko.f26627a.a(), 1, null), "linkView", (String) null, 2, (Object) null);
                z3.i0 i0VarH3 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.e(), false);
                iA = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC3 = lVarV.c();
                androidx.compose.ui.d dVarE3 = androidx.compose.ui.c.e(lVarV, dVarA5);
                b4.g.Companion companion4 = b4.g.INSTANCE;
                aVarA = companion4.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA, i0VarH3, companion4.c());
                p020r2.d4.b(lVarA, xVarC3, companion4.e());
                pVarB = companion4.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                p020r2.d4.b(lVarA, dVarE3, companion4.d());
                androidx.compose.foundation.layout.i iVar3 = androidx.compose.foundation.layout.i.f4585a;
                lVarV.o(-2065450255);
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    objI = p020r2.s3.d(Boolean.FALSE, null, 2, null);
                    lVarV.B(objI);
                }
                p1Var = (p020r2.p1) objI;
                lVarV.l();
                androidx.compose.ui.d dVarA6 = h3.a.a(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED);
                lVarV.o(-2065441201);
                if ((458752 & i13) == 131072) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objI2 = lVarV.I();
                if (z17) {
                    objI2 = new wn0.l() { // from class: com.fourthline.orca.internal.v11
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return AbstractC3263fj.a(p1Var, z16, (TextLayoutResult) obj);
                        }
                    };
                    lVarV.B(objI2);
                } else {
                    objI2 = new wn0.l() { // from class: com.fourthline.orca.internal.v11
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return AbstractC3263fj.a(p1Var, z16, (TextLayoutResult) obj);
                        }
                    };
                    lVarV.B(objI2);
                }
                lVarV.l();
                boolean z26 = z15;
                androidx.compose.ui.d dVar6 = dVar2;
                i19 = i13;
                str3 = str2;
                boolean z27 = z16;
                p009i2.v2.b(text, dVarA6, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, (wn0.l) objI2, textStyleA, lVarV, ((i13 >> 3) & 14) | 48, 0, 32764);
                lVarV.o(-2065435832);
                aVar = new i4.d.a(0, 1, null);
                long jP3 = k3.p1.p(linkElement3.getLink().getColor().a(lVarV, 0), linkElement3.getOpacity(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                iM = aVar.m(new ParagraphStyle(0, 0, textStyleA.u(), null, null, null, 0, 0, null, 507, null));
                iN = aVar.n(new SpanStyle(textStyleA.j(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                if (((Boolean) p1Var.getValue()).booleanValue()) {
                    str4 = "\n";
                } else {
                    str4 = " ";
                }
                aVar.i(text);
                aVar.i(str4);
                jn0.h0 h0Var3 = jn0.h0.f84049a;
                aVar.k(iN);
                iN2 = aVar.n(new SpanStyle(jP3, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61438, null));
                aVar.i(link);
                aVar.k(iN2);
                if (str3 != null) {
                    aVar.i(" ");
                    iN3 = aVar.n(new SpanStyle(textStyleA.j(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                    aVar.i(str3);
                    aVar.k(iN3);
                }
                aVar.k(iM);
                i4.d dVarO3 = aVar.o();
                lVarV.l();
                lVarV.o(-2065400900);
                if ((i19 & 3670016) == 1048576) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objI3 = lVarV.I();
                if (z18) {
                    objI3 = new wn0.a() { // from class: com.fourthline.orca.internal.w11
                        @Override // wn0.a
                        public final Object invoke() {
                            return AbstractC3263fj.a(onClick);
                        }
                    };
                    lVarV.B(objI3);
                } else {
                    objI3 = new wn0.a() { // from class: com.fourthline.orca.internal.w11
                        @Override // wn0.a
                        public final Object invoke() {
                            return AbstractC3263fj.a(onClick);
                        }
                    };
                    lVarV.B(objI3);
                }
                lVarV.l();
                C4672l.c(VA.a(0L, (wn0.a) objI3, lVarV, 0, 1), null, z26, null, null, null, null, null, null, z2.c.e(-1808851666, true, new a(dVar6, dVarO3, textStyleA), lVarV, 54), lVarV, ((i19 >> 6) & 896) | 805306368, 506);
                lVarV = lVarV;
                lVarV.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                str5 = str3;
                z19 = z27;
                z21 = z26;
                dVar3 = dVar6;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.x11
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC3263fj.a(dVar3, text, link, str5, z21, z19, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        str2 = str;
        i14 = i12 & 16;
        if (i14 != 0) {
            if ((i11 & 24576) == 0) {
                z13 = z11;
                if (lVarV.p(z13)) {
                    i15 = 16384;
                } else {
                    i15 = PKIFailureInfo.certRevoked;
                }
                i13 |= i15;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                i13 |= 196608;
                z14 = z12;
            } else {
                z14 = z12;
                if ((i11 & 196608) == 0) {
                    if (lVarV.p(z14)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
            }
            if ((i12 & 64) != 0) {
                i13 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (lVarV.K(onClick)) {
                    i18 = PKIFailureInfo.badCertTemplate;
                } else {
                    i18 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i18;
            }
            if ((i13 & 599187) == 599186) {
                if (i21 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i22 != 0) {
                    str2 = null;
                }
                if (i14 != 0) {
                    z15 = true;
                } else {
                    z15 = z13;
                }
                if (i16 != 0) {
                    z16 = false;
                } else {
                    z16 = z14;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1877006879, i13, -1, "com.fourthline.orca.core.internal.composable.LinkButton (LinkButton.kt:38)");
                }
                linkButton = C3825sp.f35377a.b(lVarV, 6).getLinkButton();
                textStyleA = linkButton.getMessage().a(null, lVarV, 0, 1);
                if (!z15) {
                    disabled = linkButton.getDisabled();
                } else {
                    if (!z15) {
                        throw new NoWhenBranchMatchedException();
                    }
                    disabled = linkButton.getDefault();
                }
                StatefulLinkButtonElement.LinkElement linkElement4 = disabled;
                androidx.compose.ui.d dVarA7 = AbstractC3307gk.a(androidx.compose.foundation.layout.x.b(AbstractC3307gk.a(dVar2), BitmapDescriptorFactory.HUE_RED, Ko.f26627a.a(), 1, null), "linkView", (String) null, 2, (Object) null);
                z3.i0 i0VarH4 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.e(), false);
                iA = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC4 = lVarV.c();
                androidx.compose.ui.d dVarE4 = androidx.compose.ui.c.e(lVarV, dVarA7);
                b4.g.Companion companion5 = b4.g.INSTANCE;
                aVarA = companion5.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA, i0VarH4, companion5.c());
                p020r2.d4.b(lVarA, xVarC4, companion5.e());
                pVarB = companion5.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                p020r2.d4.b(lVarA, dVarE4, companion5.d());
                androidx.compose.foundation.layout.i iVar4 = androidx.compose.foundation.layout.i.f4585a;
                lVarV.o(-2065450255);
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    objI = p020r2.s3.d(Boolean.FALSE, null, 2, null);
                    lVarV.B(objI);
                }
                p1Var = (p020r2.p1) objI;
                lVarV.l();
                androidx.compose.ui.d dVarA8 = h3.a.a(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED);
                lVarV.o(-2065441201);
                if ((458752 & i13) == 131072) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objI2 = lVarV.I();
                if (z17) {
                    objI2 = new wn0.l() { // from class: com.fourthline.orca.internal.v11
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return AbstractC3263fj.a(p1Var, z16, (TextLayoutResult) obj);
                        }
                    };
                    lVarV.B(objI2);
                } else {
                    objI2 = new wn0.l() { // from class: com.fourthline.orca.internal.v11
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return AbstractC3263fj.a(p1Var, z16, (TextLayoutResult) obj);
                        }
                    };
                    lVarV.B(objI2);
                }
                lVarV.l();
                boolean z28 = z15;
                androidx.compose.ui.d dVar7 = dVar2;
                i19 = i13;
                str3 = str2;
                boolean z29 = z16;
                p009i2.v2.b(text, dVarA8, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, (wn0.l) objI2, textStyleA, lVarV, ((i13 >> 3) & 14) | 48, 0, 32764);
                lVarV.o(-2065435832);
                aVar = new i4.d.a(0, 1, null);
                long jP4 = k3.p1.p(linkElement4.getLink().getColor().a(lVarV, 0), linkElement4.getOpacity(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                iM = aVar.m(new ParagraphStyle(0, 0, textStyleA.u(), null, null, null, 0, 0, null, 507, null));
                iN = aVar.n(new SpanStyle(textStyleA.j(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                if (((Boolean) p1Var.getValue()).booleanValue()) {
                    str4 = "\n";
                } else {
                    str4 = " ";
                }
                aVar.i(text);
                aVar.i(str4);
                jn0.h0 h0Var4 = jn0.h0.f84049a;
                aVar.k(iN);
                iN2 = aVar.n(new SpanStyle(jP4, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61438, null));
                aVar.i(link);
                aVar.k(iN2);
                if (str3 != null) {
                    aVar.i(" ");
                    iN3 = aVar.n(new SpanStyle(textStyleA.j(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                    aVar.i(str3);
                    aVar.k(iN3);
                }
                aVar.k(iM);
                i4.d dVarO4 = aVar.o();
                lVarV.l();
                lVarV.o(-2065400900);
                if ((i19 & 3670016) == 1048576) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objI3 = lVarV.I();
                if (z18) {
                    objI3 = new wn0.a() { // from class: com.fourthline.orca.internal.w11
                        @Override // wn0.a
                        public final Object invoke() {
                            return AbstractC3263fj.a(onClick);
                        }
                    };
                    lVarV.B(objI3);
                } else {
                    objI3 = new wn0.a() { // from class: com.fourthline.orca.internal.w11
                        @Override // wn0.a
                        public final Object invoke() {
                            return AbstractC3263fj.a(onClick);
                        }
                    };
                    lVarV.B(objI3);
                }
                lVarV.l();
                C4672l.c(VA.a(0L, (wn0.a) objI3, lVarV, 0, 1), null, z28, null, null, null, null, null, null, z2.c.e(-1808851666, true, new a(dVar7, dVarO4, textStyleA), lVarV, 54), lVarV, ((i19 >> 6) & 896) | 805306368, 506);
                lVarV = lVarV;
                lVarV.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                str5 = str3;
                z19 = z29;
                z21 = z28;
                dVar3 = dVar7;
            } else {
                if (i21 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i22 != 0) {
                    str2 = null;
                }
                if (i14 != 0) {
                    z15 = true;
                } else {
                    z15 = z13;
                }
                if (i16 != 0) {
                    z16 = false;
                } else {
                    z16 = z14;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1877006879, i13, -1, "com.fourthline.orca.core.internal.composable.LinkButton (LinkButton.kt:38)");
                }
                linkButton = C3825sp.f35377a.b(lVarV, 6).getLinkButton();
                textStyleA = linkButton.getMessage().a(null, lVarV, 0, 1);
                if (!z15) {
                    disabled = linkButton.getDisabled();
                } else {
                    if (!z15) {
                        throw new NoWhenBranchMatchedException();
                    }
                    disabled = linkButton.getDefault();
                }
                StatefulLinkButtonElement.LinkElement linkElement5 = disabled;
                androidx.compose.ui.d dVarA9 = AbstractC3307gk.a(androidx.compose.foundation.layout.x.b(AbstractC3307gk.a(dVar2), BitmapDescriptorFactory.HUE_RED, Ko.f26627a.a(), 1, null), "linkView", (String) null, 2, (Object) null);
                z3.i0 i0VarH5 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.e(), false);
                iA = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC5 = lVarV.c();
                androidx.compose.ui.d dVarE5 = androidx.compose.ui.c.e(lVarV, dVarA9);
                b4.g.Companion companion6 = b4.g.INSTANCE;
                aVarA = companion6.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA, i0VarH5, companion6.c());
                p020r2.d4.b(lVarA, xVarC5, companion6.e());
                pVarB = companion6.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                p020r2.d4.b(lVarA, dVarE5, companion6.d());
                androidx.compose.foundation.layout.i iVar5 = androidx.compose.foundation.layout.i.f4585a;
                lVarV.o(-2065450255);
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    objI = p020r2.s3.d(Boolean.FALSE, null, 2, null);
                    lVarV.B(objI);
                }
                p1Var = (p020r2.p1) objI;
                lVarV.l();
                androidx.compose.ui.d dVarA10 = h3.a.a(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED);
                lVarV.o(-2065441201);
                if ((458752 & i13) == 131072) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objI2 = lVarV.I();
                if (z17) {
                    objI2 = new wn0.l() { // from class: com.fourthline.orca.internal.v11
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return AbstractC3263fj.a(p1Var, z16, (TextLayoutResult) obj);
                        }
                    };
                    lVarV.B(objI2);
                } else {
                    objI2 = new wn0.l() { // from class: com.fourthline.orca.internal.v11
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return AbstractC3263fj.a(p1Var, z16, (TextLayoutResult) obj);
                        }
                    };
                    lVarV.B(objI2);
                }
                lVarV.l();
                boolean z210 = z15;
                androidx.compose.ui.d dVar8 = dVar2;
                i19 = i13;
                str3 = str2;
                boolean z211 = z16;
                p009i2.v2.b(text, dVarA10, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, (wn0.l) objI2, textStyleA, lVarV, ((i13 >> 3) & 14) | 48, 0, 32764);
                lVarV.o(-2065435832);
                aVar = new i4.d.a(0, 1, null);
                long jP5 = k3.p1.p(linkElement5.getLink().getColor().a(lVarV, 0), linkElement5.getOpacity(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                iM = aVar.m(new ParagraphStyle(0, 0, textStyleA.u(), null, null, null, 0, 0, null, 507, null));
                iN = aVar.n(new SpanStyle(textStyleA.j(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                if (((Boolean) p1Var.getValue()).booleanValue()) {
                    str4 = "\n";
                } else {
                    str4 = " ";
                }
                aVar.i(text);
                aVar.i(str4);
                jn0.h0 h0Var5 = jn0.h0.f84049a;
                aVar.k(iN);
                iN2 = aVar.n(new SpanStyle(jP5, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61438, null));
                aVar.i(link);
                aVar.k(iN2);
                if (str3 != null) {
                    aVar.i(" ");
                    iN3 = aVar.n(new SpanStyle(textStyleA.j(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                    aVar.i(str3);
                    aVar.k(iN3);
                }
                aVar.k(iM);
                i4.d dVarO5 = aVar.o();
                lVarV.l();
                lVarV.o(-2065400900);
                if ((i19 & 3670016) == 1048576) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objI3 = lVarV.I();
                if (z18) {
                    objI3 = new wn0.a() { // from class: com.fourthline.orca.internal.w11
                        @Override // wn0.a
                        public final Object invoke() {
                            return AbstractC3263fj.a(onClick);
                        }
                    };
                    lVarV.B(objI3);
                } else {
                    objI3 = new wn0.a() { // from class: com.fourthline.orca.internal.w11
                        @Override // wn0.a
                        public final Object invoke() {
                            return AbstractC3263fj.a(onClick);
                        }
                    };
                    lVarV.B(objI3);
                }
                lVarV.l();
                C4672l.c(VA.a(0L, (wn0.a) objI3, lVarV, 0, 1), null, z210, null, null, null, null, null, null, z2.c.e(-1808851666, true, new a(dVar8, dVarO5, textStyleA), lVarV, 54), lVarV, ((i19 >> 6) & 896) | 805306368, 506);
                lVarV = lVarV;
                lVarV.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                str5 = str3;
                z19 = z211;
                z21 = z210;
                dVar3 = dVar8;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.x11
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC3263fj.a(dVar3, text, link, str5, z21, z19, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 24576;
        z13 = z11;
        i16 = i12 & 32;
        if (i16 != 0) {
            i13 |= 196608;
            z14 = z12;
        } else {
            z14 = z12;
            if ((i11 & 196608) == 0) {
                if (lVarV.p(z14)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i13 |= i17;
            }
        }
        if ((i12 & 64) != 0) {
            i13 |= 1572864;
        } else if ((i11 & 1572864) == 0) {
            if (lVarV.K(onClick)) {
                i18 = PKIFailureInfo.badCertTemplate;
            } else {
                i18 = PKIFailureInfo.signerNotTrusted;
            }
            i13 |= i18;
        }
        if ((i13 & 599187) == 599186) {
            if (i21 != 0) {
                dVar2 = androidx.compose.ui.d.INSTANCE;
            }
            if (i22 != 0) {
                str2 = null;
            }
            if (i14 != 0) {
                z15 = true;
            } else {
                z15 = z13;
            }
            if (i16 != 0) {
                z16 = false;
            } else {
                z16 = z14;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1877006879, i13, -1, "com.fourthline.orca.core.internal.composable.LinkButton (LinkButton.kt:38)");
            }
            linkButton = C3825sp.f35377a.b(lVarV, 6).getLinkButton();
            textStyleA = linkButton.getMessage().a(null, lVarV, 0, 1);
            if (!z15) {
                disabled = linkButton.getDisabled();
            } else {
                if (!z15) {
                    throw new NoWhenBranchMatchedException();
                }
                disabled = linkButton.getDefault();
            }
            StatefulLinkButtonElement.LinkElement linkElement6 = disabled;
            androidx.compose.ui.d dVarA11 = AbstractC3307gk.a(androidx.compose.foundation.layout.x.b(AbstractC3307gk.a(dVar2), BitmapDescriptorFactory.HUE_RED, Ko.f26627a.a(), 1, null), "linkView", (String) null, 2, (Object) null);
            z3.i0 i0VarH6 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.e(), false);
            iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC6 = lVarV.c();
            androidx.compose.ui.d dVarE6 = androidx.compose.ui.c.e(lVarV, dVarA11);
            b4.g.Companion companion7 = b4.g.INSTANCE;
            aVarA = companion7.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            lVarA = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA, i0VarH6, companion7.c());
            p020r2.d4.b(lVarA, xVarC6, companion7.e());
            pVarB = companion7.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE6, companion7.d());
            androidx.compose.foundation.layout.i iVar6 = androidx.compose.foundation.layout.i.f4585a;
            lVarV.o(-2065450255);
            objI = lVarV.I();
            companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                objI = p020r2.s3.d(Boolean.FALSE, null, 2, null);
                lVarV.B(objI);
            }
            p1Var = (p020r2.p1) objI;
            lVarV.l();
            androidx.compose.ui.d dVarA12 = h3.a.a(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED);
            lVarV.o(-2065441201);
            if ((458752 & i13) == 131072) {
                z17 = true;
            } else {
                z17 = false;
            }
            objI2 = lVarV.I();
            if (z17) {
                objI2 = new wn0.l() { // from class: com.fourthline.orca.internal.v11
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3263fj.a(p1Var, z16, (TextLayoutResult) obj);
                    }
                };
                lVarV.B(objI2);
            } else {
                objI2 = new wn0.l() { // from class: com.fourthline.orca.internal.v11
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3263fj.a(p1Var, z16, (TextLayoutResult) obj);
                    }
                };
                lVarV.B(objI2);
            }
            lVarV.l();
            boolean z212 = z15;
            androidx.compose.ui.d dVar9 = dVar2;
            i19 = i13;
            str3 = str2;
            boolean z213 = z16;
            p009i2.v2.b(text, dVarA12, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, (wn0.l) objI2, textStyleA, lVarV, ((i13 >> 3) & 14) | 48, 0, 32764);
            lVarV.o(-2065435832);
            aVar = new i4.d.a(0, 1, null);
            long jP6 = k3.p1.p(linkElement6.getLink().getColor().a(lVarV, 0), linkElement6.getOpacity(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            iM = aVar.m(new ParagraphStyle(0, 0, textStyleA.u(), null, null, null, 0, 0, null, 507, null));
            iN = aVar.n(new SpanStyle(textStyleA.j(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
            if (((Boolean) p1Var.getValue()).booleanValue()) {
                str4 = "\n";
            } else {
                str4 = " ";
            }
            aVar.i(text);
            aVar.i(str4);
            jn0.h0 h0Var6 = jn0.h0.f84049a;
            aVar.k(iN);
            iN2 = aVar.n(new SpanStyle(jP6, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61438, null));
            aVar.i(link);
            aVar.k(iN2);
            if (str3 != null) {
                aVar.i(" ");
                iN3 = aVar.n(new SpanStyle(textStyleA.j(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                aVar.i(str3);
                aVar.k(iN3);
            }
            aVar.k(iM);
            i4.d dVarO6 = aVar.o();
            lVarV.l();
            lVarV.o(-2065400900);
            if ((i19 & 3670016) == 1048576) {
                z18 = true;
            } else {
                z18 = false;
            }
            objI3 = lVarV.I();
            if (z18) {
                objI3 = new wn0.a() { // from class: com.fourthline.orca.internal.w11
                    @Override // wn0.a
                    public final Object invoke() {
                        return AbstractC3263fj.a(onClick);
                    }
                };
                lVarV.B(objI3);
            } else {
                objI3 = new wn0.a() { // from class: com.fourthline.orca.internal.w11
                    @Override // wn0.a
                    public final Object invoke() {
                        return AbstractC3263fj.a(onClick);
                    }
                };
                lVarV.B(objI3);
            }
            lVarV.l();
            C4672l.c(VA.a(0L, (wn0.a) objI3, lVarV, 0, 1), null, z212, null, null, null, null, null, null, z2.c.e(-1808851666, true, new a(dVar9, dVarO6, textStyleA), lVarV, 54), lVarV, ((i19 >> 6) & 896) | 805306368, 506);
            lVarV = lVarV;
            lVarV.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            str5 = str3;
            z19 = z213;
            z21 = z212;
            dVar3 = dVar9;
        } else {
            if (i21 != 0) {
                dVar2 = androidx.compose.ui.d.INSTANCE;
            }
            if (i22 != 0) {
                str2 = null;
            }
            if (i14 != 0) {
                z15 = true;
            } else {
                z15 = z13;
            }
            if (i16 != 0) {
                z16 = false;
            } else {
                z16 = z14;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1877006879, i13, -1, "com.fourthline.orca.core.internal.composable.LinkButton (LinkButton.kt:38)");
            }
            linkButton = C3825sp.f35377a.b(lVarV, 6).getLinkButton();
            textStyleA = linkButton.getMessage().a(null, lVarV, 0, 1);
            if (!z15) {
                disabled = linkButton.getDisabled();
            } else {
                if (!z15) {
                    throw new NoWhenBranchMatchedException();
                }
                disabled = linkButton.getDefault();
            }
            StatefulLinkButtonElement.LinkElement linkElement7 = disabled;
            androidx.compose.ui.d dVarA13 = AbstractC3307gk.a(androidx.compose.foundation.layout.x.b(AbstractC3307gk.a(dVar2), BitmapDescriptorFactory.HUE_RED, Ko.f26627a.a(), 1, null), "linkView", (String) null, 2, (Object) null);
            z3.i0 i0VarH7 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.e(), false);
            iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC7 = lVarV.c();
            androidx.compose.ui.d dVarE7 = androidx.compose.ui.c.e(lVarV, dVarA13);
            b4.g.Companion companion8 = b4.g.INSTANCE;
            aVarA = companion8.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            lVarA = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA, i0VarH7, companion8.c());
            p020r2.d4.b(lVarA, xVarC7, companion8.e());
            pVarB = companion8.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE7, companion8.d());
            androidx.compose.foundation.layout.i iVar7 = androidx.compose.foundation.layout.i.f4585a;
            lVarV.o(-2065450255);
            objI = lVarV.I();
            companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                objI = p020r2.s3.d(Boolean.FALSE, null, 2, null);
                lVarV.B(objI);
            }
            p1Var = (p020r2.p1) objI;
            lVarV.l();
            androidx.compose.ui.d dVarA14 = h3.a.a(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED);
            lVarV.o(-2065441201);
            if ((458752 & i13) == 131072) {
                z17 = true;
            } else {
                z17 = false;
            }
            objI2 = lVarV.I();
            if (z17) {
                objI2 = new wn0.l() { // from class: com.fourthline.orca.internal.v11
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3263fj.a(p1Var, z16, (TextLayoutResult) obj);
                    }
                };
                lVarV.B(objI2);
            } else {
                objI2 = new wn0.l() { // from class: com.fourthline.orca.internal.v11
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3263fj.a(p1Var, z16, (TextLayoutResult) obj);
                    }
                };
                lVarV.B(objI2);
            }
            lVarV.l();
            boolean z214 = z15;
            androidx.compose.ui.d dVar10 = dVar2;
            i19 = i13;
            str3 = str2;
            boolean z215 = z16;
            p009i2.v2.b(text, dVarA14, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, (wn0.l) objI2, textStyleA, lVarV, ((i13 >> 3) & 14) | 48, 0, 32764);
            lVarV.o(-2065435832);
            aVar = new i4.d.a(0, 1, null);
            long jP7 = k3.p1.p(linkElement7.getLink().getColor().a(lVarV, 0), linkElement7.getOpacity(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            iM = aVar.m(new ParagraphStyle(0, 0, textStyleA.u(), null, null, null, 0, 0, null, 507, null));
            iN = aVar.n(new SpanStyle(textStyleA.j(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
            if (((Boolean) p1Var.getValue()).booleanValue()) {
                str4 = "\n";
            } else {
                str4 = " ";
            }
            aVar.i(text);
            aVar.i(str4);
            jn0.h0 h0Var7 = jn0.h0.f84049a;
            aVar.k(iN);
            iN2 = aVar.n(new SpanStyle(jP7, 0L, null, null, null, null, null, 0L, null, null, null, 0L, t4.k.INSTANCE.d(), null, null, null, 61438, null));
            aVar.i(link);
            aVar.k(iN2);
            if (str3 != null) {
                aVar.i(" ");
                iN3 = aVar.n(new SpanStyle(textStyleA.j(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                aVar.i(str3);
                aVar.k(iN3);
            }
            aVar.k(iM);
            i4.d dVarO7 = aVar.o();
            lVarV.l();
            lVarV.o(-2065400900);
            if ((i19 & 3670016) == 1048576) {
                z18 = true;
            } else {
                z18 = false;
            }
            objI3 = lVarV.I();
            if (z18) {
                objI3 = new wn0.a() { // from class: com.fourthline.orca.internal.w11
                    @Override // wn0.a
                    public final Object invoke() {
                        return AbstractC3263fj.a(onClick);
                    }
                };
                lVarV.B(objI3);
            } else {
                objI3 = new wn0.a() { // from class: com.fourthline.orca.internal.w11
                    @Override // wn0.a
                    public final Object invoke() {
                        return AbstractC3263fj.a(onClick);
                    }
                };
                lVarV.B(objI3);
            }
            lVarV.l();
            C4672l.c(VA.a(0L, (wn0.a) objI3, lVarV, 0, 1), null, z214, null, null, null, null, null, null, z2.c.e(-1808851666, true, new a(dVar10, dVarO7, textStyleA), lVarV, 54), lVarV, ((i19 >> 6) & 896) | 805306368, 506);
            lVarV = lVarV;
            lVarV.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            str5 = str3;
            z19 = z215;
            z21 = z214;
            dVar3 = dVar10;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.x11
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3263fj.a(dVar3, text, link, str5, z21, z19, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    public static final jn0.h0 a(p020r2.p1 p1Var, boolean z11, TextLayoutResult it) {
        boolean z12;
        p013kotlin.jvm.internal.s.k(it, "it");
        if (z11) {
            z12 = it.n() == 1;
        }
        p1Var.setValue(Boolean.valueOf(z12));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.a aVar) {
        aVar.invoke();
        return jn0.h0.f84049a;
    }
}
