package com.fourthline.orca.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import i4.TextStyle;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p009i2.C4672l;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class S3 {

    static final class a implements wn0.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f27708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ StatefulButtonElement f27709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3807sD f27710c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f27711d;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.S3$a$a, reason: collision with other inner class name */
        static final class C0515a implements wn0.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3807sD f27712a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f27713b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TextStyle f27714c;

            C0515a(InterfaceC3807sD interfaceC3807sD, String str, TextStyle textStyle) {
                this.f27712a = interfaceC3807sD;
                this.f27713b = str;
                this.f27714c = textStyle;
            }

            public final void a(p020r2.l lVar, int i11) {
                if ((i11 & 3) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-840112916, i11, -1, "com.fourthline.orca.core.internal.composable.CancelButton.<anonymous>.<anonymous>.<anonymous> (CancelButton.kt:94)");
                }
                androidx.compose.ui.d dVarA = AbstractC3307gk.a(AbstractC3307gk.a((androidx.compose.ui.d) androidx.compose.ui.d.INSTANCE, this.f27712a.a(lVar, 0), false, 2, (Object) null), this.f27713b, (String) null, 2, (Object) null);
                String strB = this.f27712a.b(lVar, 0);
                int iA = t4.j.INSTANCE.a();
                p009i2.v2.b(strB, dVarA, 0L, 0L, null, null, null, 0L, null, t4.j.h(iA), 0L, t4.t.INSTANCE.b(), false, 1, 0, null, this.f27714c, lVar, 0, 3120, 54780);
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

        a(boolean z11, StatefulButtonElement statefulButtonElement, InterfaceC3807sD interfaceC3807sD, String str) {
            this.f27708a = z11;
            this.f27709b = statefulButtonElement;
            this.f27710c = interfaceC3807sD;
            this.f27711d = str;
        }

        public final void a(v1.g0 TextButton, p020r2.l lVar, int i11) {
            TextStyle textStyleA;
            p013kotlin.jvm.internal.s.k(TextButton, "$this$TextButton");
            if ((i11 & 17) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1737322578, i11, -1, "com.fourthline.orca.core.internal.composable.CancelButton.<anonymous>.<anonymous> (CancelButton.kt:88)");
            }
            boolean z11 = this.f27708a;
            if (!z11) {
                lVar.o(-178726488);
                textStyleA = this.f27709b.getDisabled().getText().a(w4.v.b(C3825sp.a.f35378a.a()), lVar, 6, 0);
                lVar.l();
            } else {
                if (!z11) {
                    lVar.o(-178728115);
                    lVar.l();
                    throw new NoWhenBranchMatchedException();
                }
                lVar.o(-178723448);
                textStyleA = this.f27709b.getDefault().getText().a(w4.v.b(C3825sp.a.f35378a.a()), lVar, 6, 0);
                lVar.l();
            }
            Ls.a(false, z2.c.e(-840112916, true, new C0515a(this.f27710c, this.f27711d, textStyleA), lVar, 54), lVar, 48, 1);
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
    public static final jn0.h0 a(androidx.compose.ui.d dVar, E3 e11, StatefulButtonElement statefulButtonElement, wn0.l lVar, int i11, int i12, p020r2.l lVar2, int i13) {
        a(dVar, e11, statefulButtonElement, lVar, lVar2, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(androidx.compose.ui.d dVar, String str, String str2, String str3, boolean z11, StatefulButtonElement statefulButtonElement, wn0.l lVar, int i11, int i12, p020r2.l lVar2, int i13) {
        a(dVar, str, str2, str3, z11, statefulButtonElement, lVar, lVar2, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(androidx.compose.ui.d dVar, String str, InterfaceC3807sD interfaceC3807sD, boolean z11, StatefulButtonElement statefulButtonElement, wn0.l lVar, int i11, int i12, p020r2.l lVar2, int i13) {
        a(dVar, str, interfaceC3807sD, z11, statefulButtonElement, lVar, lVar2, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    public static final void a(androidx.compose.ui.d dVar, final E3 state, StatefulButtonElement statefulButtonElement, final wn0.l onClick, p020r2.l lVar, final int i11, final int i12) {
        int i13;
        final androidx.compose.ui.d dVar2;
        final StatefulButtonElement statefulButtonElement2;
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(onClick, "onClick");
        p020r2.l lVarV = lVar.v(-151767642);
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
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i13 |= ((i12 & 4) == 0 && lVarV.n(statefulButtonElement)) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= lVarV.K(onClick) ? 2048 : 1024;
        }
        if ((i13 & 1171) == 1170 && lVarV.b()) {
            lVarV.j();
            dVar2 = dVar;
            statefulButtonElement2 = statefulButtonElement;
        } else {
            lVarV.L();
            if ((i11 & 1) == 0 || lVarV.k()) {
                if (i14 != 0) {
                    dVar = androidx.compose.ui.d.INSTANCE;
                }
                if ((i12 & 4) != 0) {
                    statefulButtonElement = C3825sp.f35377a.b(lVarV, 6).getButton().getTertiary();
                    i13 &= -897;
                }
            } else {
                lVarV.j();
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                }
            }
            StatefulButtonElement statefulButtonElement3 = statefulButtonElement;
            lVarV.C();
            if (p020r2.o.J()) {
                p020r2.o.S(-151767642, i13, -1, "com.fourthline.orca.core.internal.composable.CancelButton (CancelButton.kt:34)");
            }
            int i15 = i13 << 9;
            androidx.compose.ui.d dVar3 = dVar;
            a(dVar3, (String) null, RA.c(state.b(), lVarV, 0), RA.a(state.b(), lVarV, 0), state.a(), statefulButtonElement3, onClick, lVarV, (i13 & 14) | (458752 & i15) | (i15 & 3670016), 2);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar2 = dVar3;
            statefulButtonElement2 = statefulButtonElement3;
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.go0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return S3.a(dVar2, state, statefulButtonElement2, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0121  */
    /* JADX WARN: Code duplicated, block: B:104:0x0126  */
    /* JADX WARN: Code duplicated, block: B:107:0x012c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0143  */
    /* JADX WARN: Code duplicated, block: B:111:0x014e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0177  */
    /* JADX WARN: Code duplicated, block: B:118:0x0185  */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:95:0x0112 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    /* JADX WARN: Code duplicated, block: B:97:0x0117  */
    /* JADX WARN: Code duplicated, block: B:99:0x011a  */
    public static final void a(androidx.compose.ui.d dVar, String str, final String text, String str2, boolean z11, StatefulButtonElement statefulButtonElement, final wn0.l onClick, p020r2.l lVar, final int i11, final int i12) {
        androidx.compose.ui.d dVar2;
        int i13;
        String str3;
        int i14;
        String str4;
        int i15;
        boolean z12;
        int i16;
        StatefulButtonElement statefulButtonElement2;
        int i17;
        androidx.compose.ui.d dVar3;
        int i18;
        String str5;
        boolean z13;
        StatefulButtonElement tertiary;
        String str6;
        final androidx.compose.ui.d dVar4;
        final StatefulButtonElement statefulButtonElement3;
        final String str7;
        final String str8;
        final boolean z14;
        p020r2.w2 w2VarX;
        p013kotlin.jvm.internal.s.k(text, "text");
        p013kotlin.jvm.internal.s.k(onClick, "onClick");
        p020r2.l lVarV = lVar.v(767978666);
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
        int i21 = i12 & 2;
        if (i21 == 0) {
            if ((i11 & 48) == 0) {
                str3 = str;
                i13 |= lVarV.n(str3) ? 32 : 16;
            }
            if ((i12 & 4) != 0) {
                i13 |= KyberEngine.KyberPolyBytes;
            } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                if (lVarV.n(text)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i13 |= i14;
            }
            if ((i11 & 3072) == 0) {
                if ((i12 & 8) == 0) {
                    str4 = str2;
                    int i22 = lVarV.n(str4) ? 2048 : 1024;
                    i13 |= i22;
                } else {
                    str4 = str2;
                }
                i13 |= i22;
            } else {
                str4 = str2;
            }
            i15 = i12 & 16;
            if (i15 != 0) {
                if ((i11 & 24576) == 0) {
                    z12 = z11;
                    if (lVarV.p(z12)) {
                        i16 = 16384;
                    } else {
                        i16 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i16;
                }
                if ((196608 & i11) == 0) {
                    if ((i12 & 32) == 0) {
                        statefulButtonElement2 = statefulButtonElement;
                        int i23 = lVarV.n(statefulButtonElement2) ? 131072 : 65536;
                        i13 |= i23;
                    } else {
                        statefulButtonElement2 = statefulButtonElement;
                    }
                    i13 |= i23;
                } else {
                    statefulButtonElement2 = statefulButtonElement;
                }
                if ((i12 & 64) != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (lVarV.K(onClick)) {
                        i17 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i17 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i17;
                }
                if ((599187 & i13) != 599186 && lVarV.b()) {
                    lVarV.j();
                    dVar4 = dVar2;
                    str8 = str3;
                    str7 = str4;
                    z14 = z12;
                    statefulButtonElement3 = statefulButtonElement2;
                } else {
                    lVarV.L();
                    if ((i11 & 1) == 0 && !lVarV.k()) {
                        lVarV.j();
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                        }
                    } else {
                        if (i19 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i21 != 0) {
                            str3 = "cancelButton";
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                            str4 = text;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 32) != 0) {
                            i18 = i13 & (-458753);
                            str5 = str3;
                            z13 = z12;
                            tertiary = C3825sp.f35377a.b(lVarV, 6).getButton().getTertiary();
                            dVar2 = dVar3;
                            str6 = str4;
                        } else {
                            dVar2 = dVar3;
                        }
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(767978666, i18, -1, "com.fourthline.orca.core.internal.composable.CancelButton (CancelButton.kt:54)");
                        }
                        int i24 = i18;
                        int i25 = i24 & 126;
                        int i26 = i24 >> 3;
                        a(dVar2, str5, new InterfaceC3807sD.i(text, str6), z13, tertiary, onClick, lVarV, i25 | (i26 & 7168) | (57344 & i26) | (i26 & 458752), 0);
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        dVar4 = dVar2;
                        statefulButtonElement3 = tertiary;
                        str7 = str6;
                        str8 = str5;
                        z14 = z13;
                    }
                    i18 = i13;
                    str5 = str3;
                    str6 = str4;
                    z13 = z12;
                    tertiary = statefulButtonElement2;
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(767978666, i18, -1, "com.fourthline.orca.core.internal.composable.CancelButton (CancelButton.kt:54)");
                    }
                    int i27 = i18;
                    int i28 = i27 & 126;
                    int i29 = i27 >> 3;
                    a(dVar2, str5, new InterfaceC3807sD.i(text, str6), z13, tertiary, onClick, lVarV, i28 | (i29 & 7168) | (57344 & i29) | (i29 & 458752), 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    dVar4 = dVar2;
                    statefulButtonElement3 = tertiary;
                    str7 = str6;
                    str8 = str5;
                    z14 = z13;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.fo0
                        @Override // wn0.p
                        public final Object invoke(Object obj, Object obj2) {
                            return S3.a(dVar4, str8, text, str7, z14, statefulButtonElement3, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            z12 = z11;
            if ((196608 & i11) == 0) {
                if ((i12 & 32) == 0) {
                    statefulButtonElement2 = statefulButtonElement;
                    if (lVarV.n(statefulButtonElement2)) {
                    }
                    i13 |= i23;
                } else {
                    statefulButtonElement2 = statefulButtonElement;
                }
                i13 |= i23;
            } else {
                statefulButtonElement2 = statefulButtonElement;
            }
            if ((i12 & 64) != 0) {
                i13 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (lVarV.K(onClick)) {
                    i17 = PKIFailureInfo.badCertTemplate;
                } else {
                    i17 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i17;
            }
            if ((599187 & i13) != 599186) {
                lVarV.L();
                if ((i11 & 1) == 0) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i21 != 0) {
                        str3 = "cancelButton";
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        str4 = text;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        i18 = i13 & (-458753);
                        str5 = str3;
                        z13 = z12;
                        tertiary = C3825sp.f35377a.b(lVarV, 6).getButton().getTertiary();
                        dVar2 = dVar3;
                        str6 = str4;
                    } else {
                        dVar2 = dVar3;
                        i18 = i13;
                        str5 = str3;
                        str6 = str4;
                        z13 = z12;
                        tertiary = statefulButtonElement2;
                    }
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i21 != 0) {
                        str3 = "cancelButton";
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        str4 = text;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        i18 = i13 & (-458753);
                        str5 = str3;
                        z13 = z12;
                        tertiary = C3825sp.f35377a.b(lVarV, 6).getButton().getTertiary();
                        dVar2 = dVar3;
                        str6 = str4;
                    } else {
                        dVar2 = dVar3;
                        i18 = i13;
                        str5 = str3;
                        str6 = str4;
                        z13 = z12;
                        tertiary = statefulButtonElement2;
                    }
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(767978666, i18, -1, "com.fourthline.orca.core.internal.composable.CancelButton (CancelButton.kt:54)");
                }
                int i210 = i18;
                int i211 = i210 & 126;
                int i212 = i210 >> 3;
                a(dVar2, str5, new InterfaceC3807sD.i(text, str6), z13, tertiary, onClick, lVarV, i211 | (i212 & 7168) | (57344 & i212) | (i212 & 458752), 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar2;
                statefulButtonElement3 = tertiary;
                str7 = str6;
                str8 = str5;
                z14 = z13;
            } else {
                lVarV.L();
                if ((i11 & 1) == 0) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i21 != 0) {
                        str3 = "cancelButton";
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        str4 = text;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        i18 = i13 & (-458753);
                        str5 = str3;
                        z13 = z12;
                        tertiary = C3825sp.f35377a.b(lVarV, 6).getButton().getTertiary();
                        dVar2 = dVar3;
                        str6 = str4;
                    } else {
                        dVar2 = dVar3;
                        i18 = i13;
                        str5 = str3;
                        str6 = str4;
                        z13 = z12;
                        tertiary = statefulButtonElement2;
                    }
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i21 != 0) {
                        str3 = "cancelButton";
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        str4 = text;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        i18 = i13 & (-458753);
                        str5 = str3;
                        z13 = z12;
                        tertiary = C3825sp.f35377a.b(lVarV, 6).getButton().getTertiary();
                        dVar2 = dVar3;
                        str6 = str4;
                    } else {
                        dVar2 = dVar3;
                        i18 = i13;
                        str5 = str3;
                        str6 = str4;
                        z13 = z12;
                        tertiary = statefulButtonElement2;
                    }
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(767978666, i18, -1, "com.fourthline.orca.core.internal.composable.CancelButton (CancelButton.kt:54)");
                }
                int i213 = i18;
                int i214 = i213 & 126;
                int i215 = i213 >> 3;
                a(dVar2, str5, new InterfaceC3807sD.i(text, str6), z13, tertiary, onClick, lVarV, i214 | (i215 & 7168) | (57344 & i215) | (i215 & 458752), 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar2;
                statefulButtonElement3 = tertiary;
                str7 = str6;
                str8 = str5;
                z14 = z13;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.fo0
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return S3.a(dVar4, str8, text, str7, z14, statefulButtonElement3, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        str3 = str;
        if ((i12 & 4) != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            if (lVarV.n(text)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i13 |= i14;
        }
        if ((i11 & 3072) == 0) {
            if ((i12 & 8) == 0) {
                str4 = str2;
                if (lVarV.n(str4)) {
                }
                i13 |= i22;
            } else {
                str4 = str2;
            }
            i13 |= i22;
        } else {
            str4 = str2;
        }
        i15 = i12 & 16;
        if (i15 != 0) {
            if ((i11 & 24576) == 0) {
                z12 = z11;
                if (lVarV.p(z12)) {
                    i16 = 16384;
                } else {
                    i16 = PKIFailureInfo.certRevoked;
                }
                i13 |= i16;
            }
            if ((196608 & i11) == 0) {
                if ((i12 & 32) == 0) {
                    statefulButtonElement2 = statefulButtonElement;
                    if (lVarV.n(statefulButtonElement2)) {
                    }
                    i13 |= i23;
                } else {
                    statefulButtonElement2 = statefulButtonElement;
                }
                i13 |= i23;
            } else {
                statefulButtonElement2 = statefulButtonElement;
            }
            if ((i12 & 64) != 0) {
                i13 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (lVarV.K(onClick)) {
                    i17 = PKIFailureInfo.badCertTemplate;
                } else {
                    i17 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i17;
            }
            if ((599187 & i13) != 599186) {
                lVarV.L();
                if ((i11 & 1) == 0) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i21 != 0) {
                        str3 = "cancelButton";
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        str4 = text;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        i18 = i13 & (-458753);
                        str5 = str3;
                        z13 = z12;
                        tertiary = C3825sp.f35377a.b(lVarV, 6).getButton().getTertiary();
                        dVar2 = dVar3;
                        str6 = str4;
                    } else {
                        dVar2 = dVar3;
                        i18 = i13;
                        str5 = str3;
                        str6 = str4;
                        z13 = z12;
                        tertiary = statefulButtonElement2;
                    }
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i21 != 0) {
                        str3 = "cancelButton";
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        str4 = text;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        i18 = i13 & (-458753);
                        str5 = str3;
                        z13 = z12;
                        tertiary = C3825sp.f35377a.b(lVarV, 6).getButton().getTertiary();
                        dVar2 = dVar3;
                        str6 = str4;
                    } else {
                        dVar2 = dVar3;
                        i18 = i13;
                        str5 = str3;
                        str6 = str4;
                        z13 = z12;
                        tertiary = statefulButtonElement2;
                    }
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(767978666, i18, -1, "com.fourthline.orca.core.internal.composable.CancelButton (CancelButton.kt:54)");
                }
                int i216 = i18;
                int i217 = i216 & 126;
                int i218 = i216 >> 3;
                a(dVar2, str5, new InterfaceC3807sD.i(text, str6), z13, tertiary, onClick, lVarV, i217 | (i218 & 7168) | (57344 & i218) | (i218 & 458752), 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar2;
                statefulButtonElement3 = tertiary;
                str7 = str6;
                str8 = str5;
                z14 = z13;
            } else {
                lVarV.L();
                if ((i11 & 1) == 0) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i21 != 0) {
                        str3 = "cancelButton";
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        str4 = text;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        i18 = i13 & (-458753);
                        str5 = str3;
                        z13 = z12;
                        tertiary = C3825sp.f35377a.b(lVarV, 6).getButton().getTertiary();
                        dVar2 = dVar3;
                        str6 = str4;
                    } else {
                        dVar2 = dVar3;
                        i18 = i13;
                        str5 = str3;
                        str6 = str4;
                        z13 = z12;
                        tertiary = statefulButtonElement2;
                    }
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i21 != 0) {
                        str3 = "cancelButton";
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        str4 = text;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 32) != 0) {
                        i18 = i13 & (-458753);
                        str5 = str3;
                        z13 = z12;
                        tertiary = C3825sp.f35377a.b(lVarV, 6).getButton().getTertiary();
                        dVar2 = dVar3;
                        str6 = str4;
                    } else {
                        dVar2 = dVar3;
                        i18 = i13;
                        str5 = str3;
                        str6 = str4;
                        z13 = z12;
                        tertiary = statefulButtonElement2;
                    }
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(767978666, i18, -1, "com.fourthline.orca.core.internal.composable.CancelButton (CancelButton.kt:54)");
                }
                int i219 = i18;
                int i2110 = i219 & 126;
                int i2111 = i219 >> 3;
                a(dVar2, str5, new InterfaceC3807sD.i(text, str6), z13, tertiary, onClick, lVarV, i2110 | (i2111 & 7168) | (57344 & i2111) | (i2111 & 458752), 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar2;
                statefulButtonElement3 = tertiary;
                str7 = str6;
                str8 = str5;
                z14 = z13;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.fo0
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return S3.a(dVar4, str8, text, str7, z14, statefulButtonElement3, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 24576;
        z12 = z11;
        if ((196608 & i11) == 0) {
            if ((i12 & 32) == 0) {
                statefulButtonElement2 = statefulButtonElement;
                if (lVarV.n(statefulButtonElement2)) {
                }
                i13 |= i23;
            } else {
                statefulButtonElement2 = statefulButtonElement;
            }
            i13 |= i23;
        } else {
            statefulButtonElement2 = statefulButtonElement;
        }
        if ((i12 & 64) != 0) {
            i13 |= 1572864;
        } else if ((i11 & 1572864) == 0) {
            if (lVarV.K(onClick)) {
                i17 = PKIFailureInfo.badCertTemplate;
            } else {
                i17 = PKIFailureInfo.signerNotTrusted;
            }
            i13 |= i17;
        }
        if ((599187 & i13) != 599186) {
            lVarV.L();
            if ((i11 & 1) == 0) {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i21 != 0) {
                    str3 = "cancelButton";
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    str4 = text;
                }
                if (i15 != 0) {
                    z12 = true;
                }
                if ((i12 & 32) != 0) {
                    i18 = i13 & (-458753);
                    str5 = str3;
                    z13 = z12;
                    tertiary = C3825sp.f35377a.b(lVarV, 6).getButton().getTertiary();
                    dVar2 = dVar3;
                    str6 = str4;
                } else {
                    dVar2 = dVar3;
                    i18 = i13;
                    str5 = str3;
                    str6 = str4;
                    z13 = z12;
                    tertiary = statefulButtonElement2;
                }
            } else {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i21 != 0) {
                    str3 = "cancelButton";
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    str4 = text;
                }
                if (i15 != 0) {
                    z12 = true;
                }
                if ((i12 & 32) != 0) {
                    i18 = i13 & (-458753);
                    str5 = str3;
                    z13 = z12;
                    tertiary = C3825sp.f35377a.b(lVarV, 6).getButton().getTertiary();
                    dVar2 = dVar3;
                    str6 = str4;
                } else {
                    dVar2 = dVar3;
                    i18 = i13;
                    str5 = str3;
                    str6 = str4;
                    z13 = z12;
                    tertiary = statefulButtonElement2;
                }
            }
            lVarV.C();
            if (p020r2.o.J()) {
                p020r2.o.S(767978666, i18, -1, "com.fourthline.orca.core.internal.composable.CancelButton (CancelButton.kt:54)");
            }
            int i2112 = i18;
            int i2113 = i2112 & 126;
            int i2114 = i2112 >> 3;
            a(dVar2, str5, new InterfaceC3807sD.i(text, str6), z13, tertiary, onClick, lVarV, i2113 | (i2114 & 7168) | (57344 & i2114) | (i2114 & 458752), 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar4 = dVar2;
            statefulButtonElement3 = tertiary;
            str7 = str6;
            str8 = str5;
            z14 = z13;
        } else {
            lVarV.L();
            if ((i11 & 1) == 0) {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i21 != 0) {
                    str3 = "cancelButton";
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    str4 = text;
                }
                if (i15 != 0) {
                    z12 = true;
                }
                if ((i12 & 32) != 0) {
                    i18 = i13 & (-458753);
                    str5 = str3;
                    z13 = z12;
                    tertiary = C3825sp.f35377a.b(lVarV, 6).getButton().getTertiary();
                    dVar2 = dVar3;
                    str6 = str4;
                } else {
                    dVar2 = dVar3;
                    i18 = i13;
                    str5 = str3;
                    str6 = str4;
                    z13 = z12;
                    tertiary = statefulButtonElement2;
                }
            } else {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i21 != 0) {
                    str3 = "cancelButton";
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    str4 = text;
                }
                if (i15 != 0) {
                    z12 = true;
                }
                if ((i12 & 32) != 0) {
                    i18 = i13 & (-458753);
                    str5 = str3;
                    z13 = z12;
                    tertiary = C3825sp.f35377a.b(lVarV, 6).getButton().getTertiary();
                    dVar2 = dVar3;
                    str6 = str4;
                } else {
                    dVar2 = dVar3;
                    i18 = i13;
                    str5 = str3;
                    str6 = str4;
                    z13 = z12;
                    tertiary = statefulButtonElement2;
                }
            }
            lVarV.C();
            if (p020r2.o.J()) {
                p020r2.o.S(767978666, i18, -1, "com.fourthline.orca.core.internal.composable.CancelButton (CancelButton.kt:54)");
            }
            int i2115 = i18;
            int i2116 = i2115 & 126;
            int i2117 = i2115 >> 3;
            a(dVar2, str5, new InterfaceC3807sD.i(text, str6), z13, tertiary, onClick, lVarV, i2116 | (i2117 & 7168) | (57344 & i2117) | (i2117 & 458752), 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar4 = dVar2;
            statefulButtonElement3 = tertiary;
            str7 = str6;
            str8 = str5;
            z14 = z13;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.fo0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return S3.a(dVar4, str8, text, str7, z14, statefulButtonElement3, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0133  */
    /* JADX WARN: Code duplicated, block: B:101:0x013c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x013e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0166  */
    /* JADX WARN: Code duplicated, block: B:106:0x0168  */
    /* JADX WARN: Code duplicated, block: B:109:0x016f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0179  */
    /* JADX WARN: Code duplicated, block: B:116:0x0181  */
    /* JADX WARN: Code duplicated, block: B:118:0x0189  */
    /* JADX WARN: Code duplicated, block: B:121:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:125:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:127:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00db  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f7 A[PHI: r1 r4 r8 r12
      0x00f7: PHI (r1v6 androidx.compose.ui.d) = (r1v3 androidx.compose.ui.d), (r1v8 androidx.compose.ui.d) binds: [B:94:0x010c, B:83:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r4v20 int) = (r4v15 int), (r4v21 int) binds: [B:94:0x010c, B:83:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r8v8 java.lang.String) = (r8v3 java.lang.String), (r8v2 java.lang.String) binds: [B:94:0x010c, B:83:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r12v12 boolean) = (r12v3 boolean), (r12v2 boolean) binds: [B:94:0x010c, B:83:0x00f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x00fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:88:0x0101  */
    /* JADX WARN: Code duplicated, block: B:90:0x0104  */
    /* JADX WARN: Code duplicated, block: B:92:0x0109  */
    /* JADX WARN: Code duplicated, block: B:95:0x010e  */
    /* JADX WARN: Code duplicated, block: B:98:0x012b  */
    public static final void a(androidx.compose.ui.d dVar, String str, final InterfaceC3807sD intent, boolean z11, StatefulButtonElement statefulButtonElement, final wn0.l onClick, p020r2.l lVar, final int i11, final int i12) {
        androidx.compose.ui.d dVar2;
        int i13;
        String str2;
        boolean zK;
        int i14;
        int i15;
        boolean z12;
        int i16;
        StatefulButtonElement statefulButtonElement2;
        int i17;
        final androidx.compose.ui.d dVar3;
        final StatefulButtonElement tertiary;
        final String str3;
        int i18;
        boolean z13;
        float opacity;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objI;
        final boolean z17;
        p020r2.w2 w2VarX;
        int i19;
        p013kotlin.jvm.internal.s.k(intent, "intent");
        p013kotlin.jvm.internal.s.k(onClick, "onClick");
        p020r2.l lVarV = lVar.v(1633943663);
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
        int i22 = i12 & 2;
        if (i22 == 0) {
            if ((i11 & 48) == 0) {
                str2 = str;
                i13 |= lVarV.n(str2) ? 32 : 16;
            }
            if ((i12 & 4) != 0) {
                i13 |= KyberEngine.KyberPolyBytes;
            } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                if ((i11 & 512) == 0) {
                    zK = lVarV.n(intent);
                } else {
                    zK = lVarV.K(intent);
                }
                if (zK) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i13 |= i14;
            }
            i15 = i12 & 8;
            if (i15 != 0) {
                if ((i11 & 3072) == 0) {
                    z12 = z11;
                    if (lVarV.p(z12)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i13 |= i16;
                }
                if ((i11 & 24576) == 0) {
                    if ((i12 & 16) == 0) {
                        statefulButtonElement2 = statefulButtonElement;
                        if (lVarV.n(statefulButtonElement2)) {
                            i19 = 16384;
                        }
                        i13 |= i19;
                    } else {
                        statefulButtonElement2 = statefulButtonElement;
                    }
                    i19 = PKIFailureInfo.certRevoked;
                    i13 |= i19;
                } else {
                    statefulButtonElement2 = statefulButtonElement;
                }
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    if (lVarV.K(onClick)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
                if ((74899 & i13) != 74898 && lVarV.b()) {
                    lVarV.j();
                    dVar3 = dVar2;
                    str3 = str2;
                    z17 = z12;
                    tertiary = statefulButtonElement2;
                } else {
                    lVarV.L();
                    if ((i11 & 1) == 0 && !lVarV.k()) {
                        lVarV.j();
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                        }
                        dVar3 = dVar2;
                    } else {
                        if (i21 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i22 != 0) {
                            str2 = "cancelButton";
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            tertiary = C3825sp.f35377a.b(lVarV, 6).getButton().getTertiary();
                            str3 = str2;
                        }
                        i18 = i13;
                        z13 = z12;
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(1633943663, i18, -1, "com.fourthline.orca.core.internal.composable.CancelButton (CancelButton.kt:73)");
                        }
                        if (!z13) {
                            opacity = tertiary.getDisabled().getOpacity();
                        } else if (z13) {
                            opacity = tertiary.getDefault().getOpacity();
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.x.h(h3.a.a(androidx.compose.foundation.layout.x.i(dVar3, Ko.f26627a.a()), opacity), BitmapDescriptorFactory.HUE_RED, 1, null);
                        lVarV.o(-15495933);
                        z14 = false;
                        if ((458752 & i18) == 131072) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if ((i18 & 896) != 256 || ((i18 & 512) != 0 && lVarV.K(intent))) {
                            z14 = true;
                        }
                        z16 = z15 | z14;
                        objI = lVarV.I();
                        if (!z16 || objI == p020r2.l.INSTANCE.a()) {
                            objI = new wn0.a() { // from class: com.fourthline.orca.internal.do0
                                @Override // wn0.a
                                public final Object invoke() {
                                    return S3.a(onClick, intent);
                                }
                            };
                            lVarV.B(objI);
                        }
                        lVarV.l();
                        C4672l.c(VA.a(0L, (wn0.a) objI, lVarV, 0, 1), dVarH, z13, null, null, null, null, null, null, z2.c.e(-1737322578, true, new a(z13, tertiary, intent, str3), lVarV, 54), lVarV, ((i18 >> 3) & 896) | 805306368, 504);
                        lVarV = lVarV;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        z17 = z13;
                    }
                    str3 = str2;
                    tertiary = statefulButtonElement2;
                    i18 = i13;
                    z13 = z12;
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(1633943663, i18, -1, "com.fourthline.orca.core.internal.composable.CancelButton (CancelButton.kt:73)");
                    }
                    if (!z13) {
                        opacity = tertiary.getDisabled().getOpacity();
                    } else if (z13) {
                        opacity = tertiary.getDefault().getOpacity();
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    androidx.compose.ui.d dVarH2 = androidx.compose.foundation.layout.x.h(h3.a.a(androidx.compose.foundation.layout.x.i(dVar3, Ko.f26627a.a()), opacity), BitmapDescriptorFactory.HUE_RED, 1, null);
                    lVarV.o(-15495933);
                    z14 = false;
                    if ((458752 & i18) == 131072) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if ((i18 & 896) != 256) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    z16 = z15 | z14;
                    objI = lVarV.I();
                    if (!z16) {
                        objI = new wn0.a() { // from class: com.fourthline.orca.internal.do0
                            @Override // wn0.a
                            public final Object invoke() {
                                return S3.a(onClick, intent);
                            }
                        };
                        lVarV.B(objI);
                    } else {
                        objI = new wn0.a() { // from class: com.fourthline.orca.internal.do0
                            @Override // wn0.a
                            public final Object invoke() {
                                return S3.a(onClick, intent);
                            }
                        };
                        lVarV.B(objI);
                    }
                    lVarV.l();
                    C4672l.c(VA.a(0L, (wn0.a) objI, lVarV, 0, 1), dVarH2, z13, null, null, null, null, null, null, z2.c.e(-1737322578, true, new a(z13, tertiary, intent, str3), lVarV, 54), lVarV, ((i18 >> 3) & 896) | 805306368, 504);
                    lVarV = lVarV;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    z17 = z13;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.eo0
                        @Override // wn0.p
                        public final Object invoke(Object obj, Object obj2) {
                            return S3.a(dVar3, str3, intent, z17, tertiary, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            z12 = z11;
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    statefulButtonElement2 = statefulButtonElement;
                    if (lVarV.n(statefulButtonElement2)) {
                        i19 = 16384;
                    }
                    i13 |= i19;
                } else {
                    statefulButtonElement2 = statefulButtonElement;
                }
                i19 = PKIFailureInfo.certRevoked;
                i13 |= i19;
            } else {
                statefulButtonElement2 = statefulButtonElement;
            }
            if ((i12 & 32) != 0) {
                i13 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (lVarV.K(onClick)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i13 |= i17;
            }
            if ((74899 & i13) != 74898) {
                lVarV.L();
                if ((i11 & 1) == 0) {
                    if (i21 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i22 != 0) {
                        str2 = "cancelButton";
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        tertiary = C3825sp.f35377a.b(lVarV, 6).getButton().getTertiary();
                        str3 = str2;
                    } else {
                        str3 = str2;
                        tertiary = statefulButtonElement2;
                    }
                } else {
                    if (i21 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i22 != 0) {
                        str2 = "cancelButton";
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        tertiary = C3825sp.f35377a.b(lVarV, 6).getButton().getTertiary();
                        str3 = str2;
                    } else {
                        str3 = str2;
                        tertiary = statefulButtonElement2;
                    }
                }
                i18 = i13;
                z13 = z12;
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(1633943663, i18, -1, "com.fourthline.orca.core.internal.composable.CancelButton (CancelButton.kt:73)");
                }
                if (!z13) {
                    opacity = tertiary.getDisabled().getOpacity();
                } else if (z13) {
                    opacity = tertiary.getDefault().getOpacity();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                androidx.compose.ui.d dVarH3 = androidx.compose.foundation.layout.x.h(h3.a.a(androidx.compose.foundation.layout.x.i(dVar3, Ko.f26627a.a()), opacity), BitmapDescriptorFactory.HUE_RED, 1, null);
                lVarV.o(-15495933);
                z14 = false;
                if ((458752 & i18) == 131072) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((i18 & 896) != 256) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                z16 = z15 | z14;
                objI = lVarV.I();
                if (!z16) {
                    objI = new wn0.a() { // from class: com.fourthline.orca.internal.do0
                        @Override // wn0.a
                        public final Object invoke() {
                            return S3.a(onClick, intent);
                        }
                    };
                    lVarV.B(objI);
                } else {
                    objI = new wn0.a() { // from class: com.fourthline.orca.internal.do0
                        @Override // wn0.a
                        public final Object invoke() {
                            return S3.a(onClick, intent);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                C4672l.c(VA.a(0L, (wn0.a) objI, lVarV, 0, 1), dVarH3, z13, null, null, null, null, null, null, z2.c.e(-1737322578, true, new a(z13, tertiary, intent, str3), lVarV, 54), lVarV, ((i18 >> 3) & 896) | 805306368, 504);
                lVarV = lVarV;
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                z17 = z13;
            } else {
                lVarV.L();
                if ((i11 & 1) == 0) {
                    if (i21 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i22 != 0) {
                        str2 = "cancelButton";
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        tertiary = C3825sp.f35377a.b(lVarV, 6).getButton().getTertiary();
                        str3 = str2;
                    } else {
                        str3 = str2;
                        tertiary = statefulButtonElement2;
                    }
                } else {
                    if (i21 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i22 != 0) {
                        str2 = "cancelButton";
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        tertiary = C3825sp.f35377a.b(lVarV, 6).getButton().getTertiary();
                        str3 = str2;
                    } else {
                        str3 = str2;
                        tertiary = statefulButtonElement2;
                    }
                }
                i18 = i13;
                z13 = z12;
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(1633943663, i18, -1, "com.fourthline.orca.core.internal.composable.CancelButton (CancelButton.kt:73)");
                }
                if (!z13) {
                    opacity = tertiary.getDisabled().getOpacity();
                } else if (z13) {
                    opacity = tertiary.getDefault().getOpacity();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                androidx.compose.ui.d dVarH4 = androidx.compose.foundation.layout.x.h(h3.a.a(androidx.compose.foundation.layout.x.i(dVar3, Ko.f26627a.a()), opacity), BitmapDescriptorFactory.HUE_RED, 1, null);
                lVarV.o(-15495933);
                z14 = false;
                if ((458752 & i18) == 131072) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((i18 & 896) != 256) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                z16 = z15 | z14;
                objI = lVarV.I();
                if (!z16) {
                    objI = new wn0.a() { // from class: com.fourthline.orca.internal.do0
                        @Override // wn0.a
                        public final Object invoke() {
                            return S3.a(onClick, intent);
                        }
                    };
                    lVarV.B(objI);
                } else {
                    objI = new wn0.a() { // from class: com.fourthline.orca.internal.do0
                        @Override // wn0.a
                        public final Object invoke() {
                            return S3.a(onClick, intent);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                C4672l.c(VA.a(0L, (wn0.a) objI, lVarV, 0, 1), dVarH4, z13, null, null, null, null, null, null, z2.c.e(-1737322578, true, new a(z13, tertiary, intent, str3), lVarV, 54), lVarV, ((i18 >> 3) & 896) | 805306368, 504);
                lVarV = lVarV;
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                z17 = z13;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.eo0
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return S3.a(dVar3, str3, intent, z17, tertiary, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        str2 = str;
        if ((i12 & 4) != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            if ((i11 & 512) == 0) {
                zK = lVarV.n(intent);
            } else {
                zK = lVarV.K(intent);
            }
            if (zK) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i13 |= i14;
        }
        i15 = i12 & 8;
        if (i15 != 0) {
            if ((i11 & 3072) == 0) {
                z12 = z11;
                if (lVarV.p(z12)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i13 |= i16;
            }
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    statefulButtonElement2 = statefulButtonElement;
                    if (lVarV.n(statefulButtonElement2)) {
                        i19 = 16384;
                    }
                    i13 |= i19;
                } else {
                    statefulButtonElement2 = statefulButtonElement;
                }
                i19 = PKIFailureInfo.certRevoked;
                i13 |= i19;
            } else {
                statefulButtonElement2 = statefulButtonElement;
            }
            if ((i12 & 32) != 0) {
                i13 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (lVarV.K(onClick)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i13 |= i17;
            }
            if ((74899 & i13) != 74898) {
                lVarV.L();
                if ((i11 & 1) == 0) {
                    if (i21 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i22 != 0) {
                        str2 = "cancelButton";
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        tertiary = C3825sp.f35377a.b(lVarV, 6).getButton().getTertiary();
                        str3 = str2;
                    } else {
                        str3 = str2;
                        tertiary = statefulButtonElement2;
                    }
                } else {
                    if (i21 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i22 != 0) {
                        str2 = "cancelButton";
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        tertiary = C3825sp.f35377a.b(lVarV, 6).getButton().getTertiary();
                        str3 = str2;
                    } else {
                        str3 = str2;
                        tertiary = statefulButtonElement2;
                    }
                }
                i18 = i13;
                z13 = z12;
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(1633943663, i18, -1, "com.fourthline.orca.core.internal.composable.CancelButton (CancelButton.kt:73)");
                }
                if (!z13) {
                    opacity = tertiary.getDisabled().getOpacity();
                } else if (z13) {
                    opacity = tertiary.getDefault().getOpacity();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                androidx.compose.ui.d dVarH5 = androidx.compose.foundation.layout.x.h(h3.a.a(androidx.compose.foundation.layout.x.i(dVar3, Ko.f26627a.a()), opacity), BitmapDescriptorFactory.HUE_RED, 1, null);
                lVarV.o(-15495933);
                z14 = false;
                if ((458752 & i18) == 131072) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((i18 & 896) != 256) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                z16 = z15 | z14;
                objI = lVarV.I();
                if (!z16) {
                    objI = new wn0.a() { // from class: com.fourthline.orca.internal.do0
                        @Override // wn0.a
                        public final Object invoke() {
                            return S3.a(onClick, intent);
                        }
                    };
                    lVarV.B(objI);
                } else {
                    objI = new wn0.a() { // from class: com.fourthline.orca.internal.do0
                        @Override // wn0.a
                        public final Object invoke() {
                            return S3.a(onClick, intent);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                C4672l.c(VA.a(0L, (wn0.a) objI, lVarV, 0, 1), dVarH5, z13, null, null, null, null, null, null, z2.c.e(-1737322578, true, new a(z13, tertiary, intent, str3), lVarV, 54), lVarV, ((i18 >> 3) & 896) | 805306368, 504);
                lVarV = lVarV;
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                z17 = z13;
            } else {
                lVarV.L();
                if ((i11 & 1) == 0) {
                    if (i21 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i22 != 0) {
                        str2 = "cancelButton";
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        tertiary = C3825sp.f35377a.b(lVarV, 6).getButton().getTertiary();
                        str3 = str2;
                    } else {
                        str3 = str2;
                        tertiary = statefulButtonElement2;
                    }
                } else {
                    if (i21 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i22 != 0) {
                        str2 = "cancelButton";
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        tertiary = C3825sp.f35377a.b(lVarV, 6).getButton().getTertiary();
                        str3 = str2;
                    } else {
                        str3 = str2;
                        tertiary = statefulButtonElement2;
                    }
                }
                i18 = i13;
                z13 = z12;
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(1633943663, i18, -1, "com.fourthline.orca.core.internal.composable.CancelButton (CancelButton.kt:73)");
                }
                if (!z13) {
                    opacity = tertiary.getDisabled().getOpacity();
                } else if (z13) {
                    opacity = tertiary.getDefault().getOpacity();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                androidx.compose.ui.d dVarH6 = androidx.compose.foundation.layout.x.h(h3.a.a(androidx.compose.foundation.layout.x.i(dVar3, Ko.f26627a.a()), opacity), BitmapDescriptorFactory.HUE_RED, 1, null);
                lVarV.o(-15495933);
                z14 = false;
                if ((458752 & i18) == 131072) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((i18 & 896) != 256) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                z16 = z15 | z14;
                objI = lVarV.I();
                if (!z16) {
                    objI = new wn0.a() { // from class: com.fourthline.orca.internal.do0
                        @Override // wn0.a
                        public final Object invoke() {
                            return S3.a(onClick, intent);
                        }
                    };
                    lVarV.B(objI);
                } else {
                    objI = new wn0.a() { // from class: com.fourthline.orca.internal.do0
                        @Override // wn0.a
                        public final Object invoke() {
                            return S3.a(onClick, intent);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                C4672l.c(VA.a(0L, (wn0.a) objI, lVarV, 0, 1), dVarH6, z13, null, null, null, null, null, null, z2.c.e(-1737322578, true, new a(z13, tertiary, intent, str3), lVarV, 54), lVarV, ((i18 >> 3) & 896) | 805306368, 504);
                lVarV = lVarV;
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                z17 = z13;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.eo0
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return S3.a(dVar3, str3, intent, z17, tertiary, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        z12 = z11;
        if ((i11 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                statefulButtonElement2 = statefulButtonElement;
                if (lVarV.n(statefulButtonElement2)) {
                    i19 = 16384;
                }
                i13 |= i19;
            } else {
                statefulButtonElement2 = statefulButtonElement;
            }
            i19 = PKIFailureInfo.certRevoked;
            i13 |= i19;
        } else {
            statefulButtonElement2 = statefulButtonElement;
        }
        if ((i12 & 32) != 0) {
            i13 |= 196608;
        } else if ((i11 & 196608) == 0) {
            if (lVarV.K(onClick)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i13 |= i17;
        }
        if ((74899 & i13) != 74898) {
            lVarV.L();
            if ((i11 & 1) == 0) {
                if (i21 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i22 != 0) {
                    str2 = "cancelButton";
                }
                if (i15 != 0) {
                    z12 = true;
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    tertiary = C3825sp.f35377a.b(lVarV, 6).getButton().getTertiary();
                    str3 = str2;
                } else {
                    str3 = str2;
                    tertiary = statefulButtonElement2;
                }
            } else {
                if (i21 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i22 != 0) {
                    str2 = "cancelButton";
                }
                if (i15 != 0) {
                    z12 = true;
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    tertiary = C3825sp.f35377a.b(lVarV, 6).getButton().getTertiary();
                    str3 = str2;
                } else {
                    str3 = str2;
                    tertiary = statefulButtonElement2;
                }
            }
            i18 = i13;
            z13 = z12;
            lVarV.C();
            if (p020r2.o.J()) {
                p020r2.o.S(1633943663, i18, -1, "com.fourthline.orca.core.internal.composable.CancelButton (CancelButton.kt:73)");
            }
            if (!z13) {
                opacity = tertiary.getDisabled().getOpacity();
            } else if (z13) {
                opacity = tertiary.getDefault().getOpacity();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            androidx.compose.ui.d dVarH7 = androidx.compose.foundation.layout.x.h(h3.a.a(androidx.compose.foundation.layout.x.i(dVar3, Ko.f26627a.a()), opacity), BitmapDescriptorFactory.HUE_RED, 1, null);
            lVarV.o(-15495933);
            z14 = false;
            if ((458752 & i18) == 131072) {
                z15 = true;
            } else {
                z15 = false;
            }
            if ((i18 & 896) != 256) {
                z14 = true;
            } else {
                z14 = true;
            }
            z16 = z15 | z14;
            objI = lVarV.I();
            if (!z16) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.do0
                    @Override // wn0.a
                    public final Object invoke() {
                        return S3.a(onClick, intent);
                    }
                };
                lVarV.B(objI);
            } else {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.do0
                    @Override // wn0.a
                    public final Object invoke() {
                        return S3.a(onClick, intent);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            C4672l.c(VA.a(0L, (wn0.a) objI, lVarV, 0, 1), dVarH7, z13, null, null, null, null, null, null, z2.c.e(-1737322578, true, new a(z13, tertiary, intent, str3), lVarV, 54), lVarV, ((i18 >> 3) & 896) | 805306368, 504);
            lVarV = lVarV;
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            z17 = z13;
        } else {
            lVarV.L();
            if ((i11 & 1) == 0) {
                if (i21 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i22 != 0) {
                    str2 = "cancelButton";
                }
                if (i15 != 0) {
                    z12 = true;
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    tertiary = C3825sp.f35377a.b(lVarV, 6).getButton().getTertiary();
                    str3 = str2;
                } else {
                    str3 = str2;
                    tertiary = statefulButtonElement2;
                }
            } else {
                if (i21 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i22 != 0) {
                    str2 = "cancelButton";
                }
                if (i15 != 0) {
                    z12 = true;
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    tertiary = C3825sp.f35377a.b(lVarV, 6).getButton().getTertiary();
                    str3 = str2;
                } else {
                    str3 = str2;
                    tertiary = statefulButtonElement2;
                }
            }
            i18 = i13;
            z13 = z12;
            lVarV.C();
            if (p020r2.o.J()) {
                p020r2.o.S(1633943663, i18, -1, "com.fourthline.orca.core.internal.composable.CancelButton (CancelButton.kt:73)");
            }
            if (!z13) {
                opacity = tertiary.getDisabled().getOpacity();
            } else if (z13) {
                opacity = tertiary.getDefault().getOpacity();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            androidx.compose.ui.d dVarH8 = androidx.compose.foundation.layout.x.h(h3.a.a(androidx.compose.foundation.layout.x.i(dVar3, Ko.f26627a.a()), opacity), BitmapDescriptorFactory.HUE_RED, 1, null);
            lVarV.o(-15495933);
            z14 = false;
            if ((458752 & i18) == 131072) {
                z15 = true;
            } else {
                z15 = false;
            }
            if ((i18 & 896) != 256) {
                z14 = true;
            } else {
                z14 = true;
            }
            z16 = z15 | z14;
            objI = lVarV.I();
            if (!z16) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.do0
                    @Override // wn0.a
                    public final Object invoke() {
                        return S3.a(onClick, intent);
                    }
                };
                lVarV.B(objI);
            } else {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.do0
                    @Override // wn0.a
                    public final Object invoke() {
                        return S3.a(onClick, intent);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            C4672l.c(VA.a(0L, (wn0.a) objI, lVarV, 0, 1), dVarH8, z13, null, null, null, null, null, null, z2.c.e(-1737322578, true, new a(z13, tertiary, intent, str3), lVarV, 54), lVarV, ((i18 >> 3) & 896) | 805306368, 504);
            lVarV = lVarV;
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            z17 = z13;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.eo0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return S3.a(dVar3, str3, intent, z17, tertiary, onClick, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.l lVar, InterfaceC3807sD interfaceC3807sD) {
        lVar.invoke(interfaceC3807sD);
        return jn0.h0.f84049a;
    }
}
