package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p009i2.C4670d1;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public abstract class UD {

    static final class a implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3903uh f28745a;

        a(InterfaceC3903uh interfaceC3903uh) {
            this.f28745a = interfaceC3903uh;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1519979611, i11, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerOverlayScaffold.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VisionScannerOverlayScaffold.kt:78)");
            }
            p009i2.e1.a(AbstractC3946vh.a(this.f28745a, lVar, 0), null, null, k3.p1.p(k3.p1.INSTANCE.k(), 0.7f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), lVar, 3120, 4);
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
    public static final jn0.h0 a(androidx.compose.ui.d dVar, long j11, String str, InterfaceC3903uh interfaceC3903uh, wn0.p pVar, wn0.q qVar, wn0.p pVar2, wn0.p pVar3, wn0.a aVar, Pair pair, int i11, int i12, p020r2.l lVar, int i13) {
        a(dVar, j11, str, interfaceC3903uh, pVar, qVar, pVar2, pVar3, aVar, pair, lVar, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x012d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0131  */
    /* JADX WARN: Code duplicated, block: B:107:0x013c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:110:0x0143  */
    /* JADX WARN: Code duplicated, block: B:113:0x0151  */
    /* JADX WARN: Code duplicated, block: B:117:0x0165  */
    /* JADX WARN: Code duplicated, block: B:119:0x016f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0188 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x018a  */
    /* JADX WARN: Code duplicated, block: B:129:0x018f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0197  */
    /* JADX WARN: Code duplicated, block: B:133:0x019a  */
    /* JADX WARN: Code duplicated, block: B:135:0x019d  */
    /* JADX WARN: Code duplicated, block: B:136:0x019f  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:147:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:150:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:153:0x0231  */
    /* JADX WARN: Code duplicated, block: B:156:0x023d  */
    /* JADX WARN: Code duplicated, block: B:157:0x0241  */
    /* JADX WARN: Code duplicated, block: B:160:0x0262  */
    /* JADX WARN: Code duplicated, block: B:162:0x0270  */
    /* JADX WARN: Code duplicated, block: B:166:0x0290  */
    /* JADX WARN: Code duplicated, block: B:169:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:170:0x02af  */
    /* JADX WARN: Code duplicated, block: B:172:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:175:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:176:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:179:0x031c  */
    /* JADX WARN: Code duplicated, block: B:181:0x032a  */
    /* JADX WARN: Code duplicated, block: B:185:0x038f  */
    /* JADX WARN: Code duplicated, block: B:186:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:189:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:191:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:194:0x0425  */
    /* JADX WARN: Code duplicated, block: B:197:0x0431  */
    /* JADX WARN: Code duplicated, block: B:198:0x0435  */
    /* JADX WARN: Code duplicated, block: B:201:0x0456  */
    /* JADX WARN: Code duplicated, block: B:203:0x0464  */
    /* JADX WARN: Code duplicated, block: B:207:0x0484  */
    /* JADX WARN: Code duplicated, block: B:210:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:213:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:214:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:217:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:219:0x050a  */
    /* JADX WARN: Code duplicated, block: B:222:0x0560  */
    /* JADX WARN: Code duplicated, block: B:225:0x056c  */
    /* JADX WARN: Code duplicated, block: B:226:0x0570  */
    /* JADX WARN: Code duplicated, block: B:229:0x058f  */
    /* JADX WARN: Code duplicated, block: B:231:0x059d  */
    /* JADX WARN: Code duplicated, block: B:234:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:238:0x05de  */
    /* JADX WARN: Code duplicated, block: B:240:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x0074  */
    /* JADX WARN: Code duplicated, block: B:37:0x007c  */
    /* JADX WARN: Code duplicated, block: B:38:0x007f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:43:0x008c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0092  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095  */
    /* JADX WARN: Code duplicated, block: B:50:0x009c  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00db  */
    /* JADX WARN: Code duplicated, block: B:74:0x00df  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:87:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x010b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0112  */
    /* JADX WARN: Code duplicated, block: B:95:0x0116  */
    /* JADX WARN: Code duplicated, block: B:97:0x0120  */
    /* JADX WARN: Code duplicated, block: B:98:0x0123  */
    public static final void a(androidx.compose.ui.d dVar, long j11, String str, final InterfaceC3903uh closeImageSource, wn0.p pVar, wn0.q qVar, final wn0.p body, final wn0.p footer, wn0.a aVar, Pair pair, p020r2.l lVar, final int i11, final int i12) {
        androidx.compose.ui.d dVar2;
        int i13;
        long jI;
        int i14;
        String str2;
        int i15;
        boolean zK;
        int i16;
        int i17;
        wn0.p pVar2;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        wn0.q qVar2;
        wn0.a aVar2;
        Pair pair2;
        long j12;
        wn0.a aVar3;
        Object objI;
        int i26;
        d3.c.Companion companion;
        int iA;
        b4.g.Companion companion2;
        wn0.a<b4.g> aVarA;
        p020r2.l lVarA;
        wn0.p<b4.g, Integer, jn0.h0> pVarB;
        int iA2;
        wn0.a<b4.g> aVarA2;
        p020r2.l lVarA2;
        wn0.p<b4.g, Integer, jn0.h0> pVarB2;
        int i27;
        String str3;
        int i28;
        int iA3;
        wn0.a<b4.g> aVarA3;
        p020r2.l lVarA3;
        wn0.p<b4.g, Integer, jn0.h0> pVarB3;
        v1.j jVar;
        int iA4;
        wn0.a<b4.g> aVarA4;
        p020r2.l lVarA4;
        wn0.p<b4.g, Integer, jn0.h0> pVarB4;
        int iA5;
        wn0.a<b4.g> aVarA5;
        p020r2.l lVarA5;
        wn0.p<b4.g, Integer, jn0.h0> pVarB5;
        final wn0.p pVar3;
        final wn0.q qVar3;
        final wn0.a aVar4;
        final long j13;
        Pair pair3;
        p020r2.w2 w2VarX;
        p013kotlin.jvm.internal.s.k(closeImageSource, "closeImageSource");
        p013kotlin.jvm.internal.s.k(body, "body");
        p013kotlin.jvm.internal.s.k(footer, "footer");
        p020r2.l lVarV = lVar.v(72921645);
        int i29 = i12 & 1;
        if (i29 != 0) {
            i13 = i11 | 6;
            dVar2 = dVar;
        } else if ((i11 & 6) == 0) {
            dVar2 = dVar;
            i13 = (lVarV.n(dVar2) ? 4 : 2) | i11;
        } else {
            dVar2 = dVar;
            i13 = i11;
        }
        int i31 = i12 & 2;
        if (i31 == 0) {
            if ((i11 & 48) == 0) {
                jI = j11;
                i13 |= lVarV.s(jI) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                    str2 = str;
                    if (lVarV.n(str2)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                if ((i12 & 8) != 0) {
                    i13 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    if ((i11 & 4096) == 0) {
                        zK = lVarV.n(closeImageSource);
                    } else {
                        zK = lVarV.K(closeImageSource);
                    }
                    if (zK) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i13 |= i16;
                }
                i17 = i12 & 16;
                if (i17 != 0) {
                    if ((i11 & 24576) == 0) {
                        pVar2 = pVar;
                        if (lVarV.K(pVar2)) {
                            i18 = 16384;
                        } else {
                            i18 = PKIFailureInfo.certRevoked;
                        }
                        i13 |= i18;
                    }
                    i19 = i12 & 32;
                    if (i19 != 0) {
                        i13 |= 196608;
                    } else if ((i11 & 196608) == 0) {
                        if (lVarV.K(qVar)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                    if ((i12 & 64) != 0) {
                        i13 |= 1572864;
                    } else if ((i11 & 1572864) == 0) {
                        if (lVarV.K(body)) {
                            i22 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i22 = PKIFailureInfo.signerNotTrusted;
                        }
                        i13 |= i22;
                    }
                    if ((i12 & 128) != 0) {
                        i13 |= 12582912;
                    } else if ((i11 & 12582912) == 0) {
                        if (lVarV.K(footer)) {
                            i23 = 8388608;
                        } else {
                            i23 = 4194304;
                        }
                        i13 |= i23;
                    }
                    i24 = i12 & 256;
                    if (i24 != 0) {
                        if ((i11 & 100663296) == 0) {
                            if (lVarV.K(aVar)) {
                                i25 = 67108864;
                            } else {
                                i25 = 33554432;
                            }
                            i13 |= i25;
                        }
                        if ((i11 & 805306368) != 0) {
                            i13 |= ((i12 & 512) == 0 || !lVarV.n(pair)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                        }
                        if ((i13 & 306783379) == 306783378 || !lVarV.b()) {
                            lVarV.L();
                            if ((i11 & 1) != 0 || lVarV.k()) {
                                if (i29 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i31 != 0) {
                                    jI = k3.p1.INSTANCE.i();
                                }
                                if (i14 != 0) {
                                    str2 = null;
                                }
                                if (i17 != 0) {
                                    pVar2 = null;
                                }
                                if (i19 != 0) {
                                    qVar2 = null;
                                } else {
                                    qVar2 = qVar;
                                }
                                if (i24 != 0) {
                                    aVar2 = null;
                                } else {
                                    aVar2 = aVar;
                                }
                                if ((i12 & 512) != 0) {
                                    pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                                    i13 &= -1879048193;
                                    qVar2 = qVar2;
                                } else {
                                    pair2 = pair;
                                }
                                j12 = jI;
                                aVar3 = aVar2;
                            } else {
                                lVarV.j();
                                if ((i12 & 512) != 0) {
                                    i13 &= -1879048193;
                                }
                                qVar2 = qVar;
                                pair2 = pair;
                                j12 = jI;
                                aVar3 = aVar;
                            }
                            lVarV.C();
                            if (p020r2.o.J()) {
                                p020r2.o.S(72921645, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerOverlayScaffold (VisionScannerOverlayScaffold.kt:54)");
                            }
                            lVarV.o(-1858078478);
                            objI = lVarV.I();
                            if (objI == p020r2.l.INSTANCE.a()) {
                                objI = new wn0.l() { // from class: com.fourthline.orca.internal.vq0
                                    @Override // wn0.l
                                    public final Object invoke(Object obj) {
                                        return UD.a((g4.y) obj);
                                    }
                                };
                                lVarV.B(objI);
                            }
                            lVarV.l();
                            i26 = i13;
                            androidx.compose.ui.d dVarD = androidx.compose.foundation.b.d(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), j12, null, 2, null);
                            companion = d3.c.INSTANCE;
                            z3.i0 i0VarH = androidx.compose.foundation.layout.g.h(companion.o(), false);
                            iA = p020r2.j.a(lVarV, 0);
                            p020r2.x xVarC = lVarV.c();
                            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, dVarD);
                            companion2 = b4.g.INSTANCE;
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
                            Pair pair4 = pair2;
                            p020r2.d4.b(lVarA, i0VarH, companion2.c());
                            p020r2.d4.b(lVarA, xVarC, companion2.e());
                            pVarB = companion2.b();
                            if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                                lVarA.B(Integer.valueOf(iA));
                                lVarA.f(Integer.valueOf(iA), pVarB);
                            }
                            p020r2.d4.b(lVarA, dVarE, companion2.d());
                            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
                            lVarV.o(-1038937986);
                            if (pVar2 != null) {
                                pVar2.invoke(lVarV, Integer.valueOf((i26 >> 12) & 14));
                                jn0.h0 h0Var = jn0.h0.f84049a;
                            }
                            lVarV.l();
                            lVarV.o(-1038935796);
                            if (aVar3 == null) {
                                i27 = 1;
                            } else {
                                androidx.compose.ui.d.Companion companion3 = androidx.compose.ui.d.INSTANCE;
                                androidx.compose.ui.d dVarM = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.h(companion3, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                                z3.i0 i0VarH2 = androidx.compose.foundation.layout.g.h(companion.n(), false);
                                iA2 = p020r2.j.a(lVarV, 0);
                                p020r2.x xVarC2 = lVarV.c();
                                androidx.compose.ui.d dVarE2 = androidx.compose.ui.c.e(lVarV, dVarM);
                                aVarA2 = companion2.a();
                                if (lVarV.w() == null) {
                                    p020r2.j.c();
                                }
                                lVarV.h();
                                if (lVarV.getInserting()) {
                                    lVarV.z(aVarA2);
                                } else {
                                    lVarV.d();
                                }
                                lVarA2 = p020r2.d4.a(lVarV);
                                p020r2.d4.b(lVarA2, i0VarH2, companion2.c());
                                p020r2.d4.b(lVarA2, xVarC2, companion2.e());
                                pVarB2 = companion2.b();
                                if (lVarA2.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA2.I(), Integer.valueOf(iA2))) {
                                    lVarA2.B(Integer.valueOf(iA2));
                                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                                }
                                p020r2.d4.b(lVarA2, dVarE2, companion2.d());
                                i27 = 1;
                                C4670d1.a(aVar3, AbstractC3307gk.a(AbstractC3307gk.a(AbstractC3307gk.a(companion3, "closeButton", (String) null, 2, (Object) null), 199.0f), RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close_acessibility, 0, 2, null), lVarV, 0), false, 2, (Object) null), false, null, z2.c.e(1519979611, true, new a(closeImageSource), lVarV, 54), lVarV, 24576, 12);
                                lVarV.g();
                                jn0.h0 h0Var2 = jn0.h0.f84049a;
                            }
                            lVarV.l();
                            lVarV.o(-1038906739);
                            if (str2 != null) {
                                float f11 = 32;
                                str3 = str2;
                                Zg.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, w4.h.g(f11), w4.h.g(f11), w4.h.g(48), BitmapDescriptorFactory.HUE_RED, 8, null), BitmapDescriptorFactory.HUE_RED, i27, null), str3, null, k3.p1.INSTANCE.k(), null, null, lVarV, ((i26 >> 3) & 112) | 3072, 52);
                            } else {
                                str3 = str2;
                            }
                            lVarV.l();
                            if (qVar2 != null) {
                                i28 = 80;
                            } else {
                                i28 = 156;
                            }
                            androidx.compose.ui.d dVarM2 = androidx.compose.foundation.layout.t.m(v1.p0.c(dVar2, v1.s0.d(v1.m0.INSTANCE, lVarV, 6)), BitmapDescriptorFactory.HUE_RED, w4.h.g(i28), BitmapDescriptorFactory.HUE_RED, C3825sp.f35377a.c(lVarV, 6).f(), 5, null);
                            z3.i0 i0VarA = v1.g.a(v1.b.f117444a.g(), companion.g(), lVarV, 48);
                            iA3 = p020r2.j.a(lVarV, 0);
                            p020r2.x xVarC3 = lVarV.c();
                            androidx.compose.ui.d dVarE3 = androidx.compose.ui.c.e(lVarV, dVarM2);
                            aVarA3 = companion2.a();
                            if (lVarV.w() == null) {
                                p020r2.j.c();
                            }
                            lVarV.h();
                            if (lVarV.getInserting()) {
                                lVarV.z(aVarA3);
                            } else {
                                lVarV.d();
                            }
                            lVarA3 = p020r2.d4.a(lVarV);
                            p020r2.d4.b(lVarA3, i0VarA, companion2.c());
                            p020r2.d4.b(lVarA3, xVarC3, companion2.e());
                            pVarB3 = companion2.b();
                            if (lVarA3.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA3.I(), Integer.valueOf(iA3))) {
                                lVarA3.B(Integer.valueOf(iA3));
                                lVarA3.f(Integer.valueOf(iA3), pVarB3);
                            }
                            p020r2.d4.b(lVarA3, dVarE3, companion2.d());
                            jVar = v1.j.f117505a;
                            lVarV.o(915714536);
                            if (qVar2 != null) {
                                qVar2.invoke(jVar, lVarV, Integer.valueOf(((i26 >> 12) & 112) | 6));
                                jn0.h0 h0Var3 = jn0.h0.f84049a;
                            }
                            lVarV.l();
                            androidx.compose.ui.d.Companion companion4 = androidx.compose.ui.d.INSTANCE;
                            androidx.compose.ui.d dVarB = v1.i.b(jVar, companion4, ((Number) pair4.e()).floatValue(), false, 2, null);
                            z3.i0 i0VarH3 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                            iA4 = p020r2.j.a(lVarV, 0);
                            p020r2.x xVarC4 = lVarV.c();
                            androidx.compose.ui.d dVarE4 = androidx.compose.ui.c.e(lVarV, dVarB);
                            aVarA4 = companion2.a();
                            if (lVarV.w() == null) {
                                p020r2.j.c();
                            }
                            lVarV.h();
                            if (lVarV.getInserting()) {
                                lVarV.z(aVarA4);
                            } else {
                                lVarV.d();
                            }
                            lVarA4 = p020r2.d4.a(lVarV);
                            p020r2.d4.b(lVarA4, i0VarH3, companion2.c());
                            p020r2.d4.b(lVarA4, xVarC4, companion2.e());
                            pVarB4 = companion2.b();
                            if (lVarA4.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA4.I(), Integer.valueOf(iA4))) {
                                lVarA4.B(Integer.valueOf(iA4));
                                lVarA4.f(Integer.valueOf(iA4), pVarB4);
                            }
                            p020r2.d4.b(lVarA4, dVarE4, companion2.d());
                            body.invoke(lVarV, Integer.valueOf((i26 >> 18) & 14));
                            lVarV.g();
                            androidx.compose.ui.d dVarB2 = v1.i.b(jVar, companion4, ((Number) pair4.f()).floatValue(), false, 2, null);
                            z3.i0 i0VarH4 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                            iA5 = p020r2.j.a(lVarV, 0);
                            p020r2.x xVarC5 = lVarV.c();
                            androidx.compose.ui.d dVarE5 = androidx.compose.ui.c.e(lVarV, dVarB2);
                            aVarA5 = companion2.a();
                            if (lVarV.w() == null) {
                                p020r2.j.c();
                            }
                            lVarV.h();
                            if (lVarV.getInserting()) {
                                lVarV.z(aVarA5);
                            } else {
                                lVarV.d();
                            }
                            lVarA5 = p020r2.d4.a(lVarV);
                            p020r2.d4.b(lVarA5, i0VarH4, companion2.c());
                            p020r2.d4.b(lVarA5, xVarC5, companion2.e());
                            pVarB5 = companion2.b();
                            if (lVarA5.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA5.I(), Integer.valueOf(iA5))) {
                                lVarA5.B(Integer.valueOf(iA5));
                                lVarA5.f(Integer.valueOf(iA5), pVarB5);
                            }
                            p020r2.d4.b(lVarA5, dVarE5, companion2.d());
                            footer.invoke(lVarV, Integer.valueOf((i26 >> 21) & 14));
                            lVarV.g();
                            lVarV.g();
                            lVarV.g();
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                            pVar3 = pVar2;
                            qVar3 = qVar2;
                            aVar4 = aVar3;
                            str2 = str3;
                            j13 = j12;
                            pair3 = pair4;
                        } else {
                            lVarV.j();
                            qVar3 = qVar;
                            pair3 = pair;
                            pVar3 = pVar2;
                            j13 = jI;
                            aVar4 = aVar;
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            final androidx.compose.ui.d dVar3 = dVar2;
                            final String str4 = str2;
                            final Pair pair5 = pair3;
                            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.wq0
                                @Override // wn0.p
                                public final Object invoke(Object obj, Object obj2) {
                                    return UD.a(dVar3, j13, str4, closeImageSource, pVar3, qVar3, body, footer, aVar4, pair5, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 100663296;
                    if ((i11 & 805306368) != 0) {
                        i13 |= ((i12 & 512) == 0 || !lVarV.n(pair)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i31 != 0) {
                                jI = k3.p1.INSTANCE.i();
                            }
                            if (i14 != 0) {
                                str2 = null;
                            }
                            if (i17 != 0) {
                                pVar2 = null;
                            }
                            if (i19 != 0) {
                                qVar2 = null;
                            } else {
                                qVar2 = qVar;
                            }
                            if (i24 != 0) {
                                aVar2 = null;
                            } else {
                                aVar2 = aVar;
                            }
                            if ((i12 & 512) != 0) {
                                pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                                i13 &= -1879048193;
                                qVar2 = qVar2;
                            } else {
                                pair2 = pair;
                            }
                            j12 = jI;
                            aVar3 = aVar2;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i31 != 0) {
                                jI = k3.p1.INSTANCE.i();
                            }
                            if (i14 != 0) {
                                str2 = null;
                            }
                            if (i17 != 0) {
                                pVar2 = null;
                            }
                            if (i19 != 0) {
                                qVar2 = null;
                            } else {
                                qVar2 = qVar;
                            }
                            if (i24 != 0) {
                                aVar2 = null;
                            } else {
                                aVar2 = aVar;
                            }
                            if ((i12 & 512) != 0) {
                                pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                                i13 &= -1879048193;
                                qVar2 = qVar2;
                            } else {
                                pair2 = pair;
                            }
                            j12 = jI;
                            aVar3 = aVar2;
                        }
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(72921645, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerOverlayScaffold (VisionScannerOverlayScaffold.kt:54)");
                        }
                        lVarV.o(-1858078478);
                        objI = lVarV.I();
                        if (objI == p020r2.l.INSTANCE.a()) {
                            objI = new wn0.l() { // from class: com.fourthline.orca.internal.vq0
                                @Override // wn0.l
                                public final Object invoke(Object obj) {
                                    return UD.a((g4.y) obj);
                                }
                            };
                            lVarV.B(objI);
                        }
                        lVarV.l();
                        i26 = i13;
                        androidx.compose.ui.d dVarD2 = androidx.compose.foundation.b.d(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), j12, null, 2, null);
                        companion = d3.c.INSTANCE;
                        z3.i0 i0VarH5 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                        iA = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC6 = lVarV.c();
                        androidx.compose.ui.d dVarE6 = androidx.compose.ui.c.e(lVarV, dVarD2);
                        companion2 = b4.g.INSTANCE;
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
                        Pair pair6 = pair2;
                        p020r2.d4.b(lVarA, i0VarH5, companion2.c());
                        p020r2.d4.b(lVarA, xVarC6, companion2.e());
                        pVarB = companion2.b();
                        if (lVarA.getInserting()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        p020r2.d4.b(lVarA, dVarE6, companion2.d());
                        androidx.compose.foundation.layout.i iVar2 = androidx.compose.foundation.layout.i.f4585a;
                        lVarV.o(-1038937986);
                        if (pVar2 != null) {
                            pVar2.invoke(lVarV, Integer.valueOf((i26 >> 12) & 14));
                            jn0.h0 h0Var4 = jn0.h0.f84049a;
                        }
                        lVarV.l();
                        lVarV.o(-1038935796);
                        if (aVar3 == null) {
                            i27 = 1;
                        } else {
                            androidx.compose.ui.d.Companion companion5 = androidx.compose.ui.d.INSTANCE;
                            androidx.compose.ui.d dVarM3 = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.h(companion5, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                            z3.i0 i0VarH6 = androidx.compose.foundation.layout.g.h(companion.n(), false);
                            iA2 = p020r2.j.a(lVarV, 0);
                            p020r2.x xVarC7 = lVarV.c();
                            androidx.compose.ui.d dVarE7 = androidx.compose.ui.c.e(lVarV, dVarM3);
                            aVarA2 = companion2.a();
                            if (lVarV.w() == null) {
                                p020r2.j.c();
                            }
                            lVarV.h();
                            if (lVarV.getInserting()) {
                                lVarV.z(aVarA2);
                            } else {
                                lVarV.d();
                            }
                            lVarA2 = p020r2.d4.a(lVarV);
                            p020r2.d4.b(lVarA2, i0VarH6, companion2.c());
                            p020r2.d4.b(lVarA2, xVarC7, companion2.e());
                            pVarB2 = companion2.b();
                            if (lVarA2.getInserting()) {
                                lVarA2.B(Integer.valueOf(iA2));
                                lVarA2.f(Integer.valueOf(iA2), pVarB2);
                            } else {
                                lVarA2.B(Integer.valueOf(iA2));
                                lVarA2.f(Integer.valueOf(iA2), pVarB2);
                            }
                            p020r2.d4.b(lVarA2, dVarE7, companion2.d());
                            i27 = 1;
                            C4670d1.a(aVar3, AbstractC3307gk.a(AbstractC3307gk.a(AbstractC3307gk.a(companion5, "closeButton", (String) null, 2, (Object) null), 199.0f), RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close_acessibility, 0, 2, null), lVarV, 0), false, 2, (Object) null), false, null, z2.c.e(1519979611, true, new a(closeImageSource), lVarV, 54), lVarV, 24576, 12);
                            lVarV.g();
                            jn0.h0 h0Var5 = jn0.h0.f84049a;
                        }
                        lVarV.l();
                        lVarV.o(-1038906739);
                        if (str2 != null) {
                            float f12 = 32;
                            str3 = str2;
                            Zg.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, w4.h.g(f12), w4.h.g(f12), w4.h.g(48), BitmapDescriptorFactory.HUE_RED, 8, null), BitmapDescriptorFactory.HUE_RED, i27, null), str3, null, k3.p1.INSTANCE.k(), null, null, lVarV, ((i26 >> 3) & 112) | 3072, 52);
                        } else {
                            str3 = str2;
                        }
                        lVarV.l();
                        if (qVar2 != null) {
                            i28 = 80;
                        } else {
                            i28 = 156;
                        }
                        androidx.compose.ui.d dVarM4 = androidx.compose.foundation.layout.t.m(v1.p0.c(dVar2, v1.s0.d(v1.m0.INSTANCE, lVarV, 6)), BitmapDescriptorFactory.HUE_RED, w4.h.g(i28), BitmapDescriptorFactory.HUE_RED, C3825sp.f35377a.c(lVarV, 6).f(), 5, null);
                        z3.i0 i0VarA2 = v1.g.a(v1.b.f117444a.g(), companion.g(), lVarV, 48);
                        iA3 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC8 = lVarV.c();
                        androidx.compose.ui.d dVarE8 = androidx.compose.ui.c.e(lVarV, dVarM4);
                        aVarA3 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA3);
                        } else {
                            lVarV.d();
                        }
                        lVarA3 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA3, i0VarA2, companion2.c());
                        p020r2.d4.b(lVarA3, xVarC8, companion2.e());
                        pVarB3 = companion2.b();
                        if (lVarA3.getInserting()) {
                            lVarA3.B(Integer.valueOf(iA3));
                            lVarA3.f(Integer.valueOf(iA3), pVarB3);
                        } else {
                            lVarA3.B(Integer.valueOf(iA3));
                            lVarA3.f(Integer.valueOf(iA3), pVarB3);
                        }
                        p020r2.d4.b(lVarA3, dVarE8, companion2.d());
                        jVar = v1.j.f117505a;
                        lVarV.o(915714536);
                        if (qVar2 != null) {
                            qVar2.invoke(jVar, lVarV, Integer.valueOf(((i26 >> 12) & 112) | 6));
                            jn0.h0 h0Var6 = jn0.h0.f84049a;
                        }
                        lVarV.l();
                        androidx.compose.ui.d.Companion companion6 = androidx.compose.ui.d.INSTANCE;
                        androidx.compose.ui.d dVarB3 = v1.i.b(jVar, companion6, ((Number) pair6.e()).floatValue(), false, 2, null);
                        z3.i0 i0VarH7 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                        iA4 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC9 = lVarV.c();
                        androidx.compose.ui.d dVarE9 = androidx.compose.ui.c.e(lVarV, dVarB3);
                        aVarA4 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA4);
                        } else {
                            lVarV.d();
                        }
                        lVarA4 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA4, i0VarH7, companion2.c());
                        p020r2.d4.b(lVarA4, xVarC9, companion2.e());
                        pVarB4 = companion2.b();
                        if (lVarA4.getInserting()) {
                            lVarA4.B(Integer.valueOf(iA4));
                            lVarA4.f(Integer.valueOf(iA4), pVarB4);
                        } else {
                            lVarA4.B(Integer.valueOf(iA4));
                            lVarA4.f(Integer.valueOf(iA4), pVarB4);
                        }
                        p020r2.d4.b(lVarA4, dVarE9, companion2.d());
                        body.invoke(lVarV, Integer.valueOf((i26 >> 18) & 14));
                        lVarV.g();
                        androidx.compose.ui.d dVarB4 = v1.i.b(jVar, companion6, ((Number) pair6.f()).floatValue(), false, 2, null);
                        z3.i0 i0VarH8 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                        iA5 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC10 = lVarV.c();
                        androidx.compose.ui.d dVarE10 = androidx.compose.ui.c.e(lVarV, dVarB4);
                        aVarA5 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA5);
                        } else {
                            lVarV.d();
                        }
                        lVarA5 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA5, i0VarH8, companion2.c());
                        p020r2.d4.b(lVarA5, xVarC10, companion2.e());
                        pVarB5 = companion2.b();
                        if (lVarA5.getInserting()) {
                            lVarA5.B(Integer.valueOf(iA5));
                            lVarA5.f(Integer.valueOf(iA5), pVarB5);
                        } else {
                            lVarA5.B(Integer.valueOf(iA5));
                            lVarA5.f(Integer.valueOf(iA5), pVarB5);
                        }
                        p020r2.d4.b(lVarA5, dVarE10, companion2.d());
                        footer.invoke(lVarV, Integer.valueOf((i26 >> 21) & 14));
                        lVarV.g();
                        lVarV.g();
                        lVarV.g();
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        pVar3 = pVar2;
                        qVar3 = qVar2;
                        aVar4 = aVar3;
                        str2 = str3;
                        j13 = j12;
                        pair3 = pair6;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i31 != 0) {
                                jI = k3.p1.INSTANCE.i();
                            }
                            if (i14 != 0) {
                                str2 = null;
                            }
                            if (i17 != 0) {
                                pVar2 = null;
                            }
                            if (i19 != 0) {
                                qVar2 = null;
                            } else {
                                qVar2 = qVar;
                            }
                            if (i24 != 0) {
                                aVar2 = null;
                            } else {
                                aVar2 = aVar;
                            }
                            if ((i12 & 512) != 0) {
                                pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                                i13 &= -1879048193;
                                qVar2 = qVar2;
                            } else {
                                pair2 = pair;
                            }
                            j12 = jI;
                            aVar3 = aVar2;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i31 != 0) {
                                jI = k3.p1.INSTANCE.i();
                            }
                            if (i14 != 0) {
                                str2 = null;
                            }
                            if (i17 != 0) {
                                pVar2 = null;
                            }
                            if (i19 != 0) {
                                qVar2 = null;
                            } else {
                                qVar2 = qVar;
                            }
                            if (i24 != 0) {
                                aVar2 = null;
                            } else {
                                aVar2 = aVar;
                            }
                            if ((i12 & 512) != 0) {
                                pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                                i13 &= -1879048193;
                                qVar2 = qVar2;
                            } else {
                                pair2 = pair;
                            }
                            j12 = jI;
                            aVar3 = aVar2;
                        }
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(72921645, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerOverlayScaffold (VisionScannerOverlayScaffold.kt:54)");
                        }
                        lVarV.o(-1858078478);
                        objI = lVarV.I();
                        if (objI == p020r2.l.INSTANCE.a()) {
                            objI = new wn0.l() { // from class: com.fourthline.orca.internal.vq0
                                @Override // wn0.l
                                public final Object invoke(Object obj) {
                                    return UD.a((g4.y) obj);
                                }
                            };
                            lVarV.B(objI);
                        }
                        lVarV.l();
                        i26 = i13;
                        androidx.compose.ui.d dVarD3 = androidx.compose.foundation.b.d(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), j12, null, 2, null);
                        companion = d3.c.INSTANCE;
                        z3.i0 i0VarH9 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                        iA = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC11 = lVarV.c();
                        androidx.compose.ui.d dVarE11 = androidx.compose.ui.c.e(lVarV, dVarD3);
                        companion2 = b4.g.INSTANCE;
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
                        Pair pair7 = pair2;
                        p020r2.d4.b(lVarA, i0VarH9, companion2.c());
                        p020r2.d4.b(lVarA, xVarC11, companion2.e());
                        pVarB = companion2.b();
                        if (lVarA.getInserting()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        p020r2.d4.b(lVarA, dVarE11, companion2.d());
                        androidx.compose.foundation.layout.i iVar3 = androidx.compose.foundation.layout.i.f4585a;
                        lVarV.o(-1038937986);
                        if (pVar2 != null) {
                            pVar2.invoke(lVarV, Integer.valueOf((i26 >> 12) & 14));
                            jn0.h0 h0Var7 = jn0.h0.f84049a;
                        }
                        lVarV.l();
                        lVarV.o(-1038935796);
                        if (aVar3 == null) {
                            i27 = 1;
                        } else {
                            androidx.compose.ui.d.Companion companion7 = androidx.compose.ui.d.INSTANCE;
                            androidx.compose.ui.d dVarM5 = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.h(companion7, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                            z3.i0 i0VarH10 = androidx.compose.foundation.layout.g.h(companion.n(), false);
                            iA2 = p020r2.j.a(lVarV, 0);
                            p020r2.x xVarC12 = lVarV.c();
                            androidx.compose.ui.d dVarE12 = androidx.compose.ui.c.e(lVarV, dVarM5);
                            aVarA2 = companion2.a();
                            if (lVarV.w() == null) {
                                p020r2.j.c();
                            }
                            lVarV.h();
                            if (lVarV.getInserting()) {
                                lVarV.z(aVarA2);
                            } else {
                                lVarV.d();
                            }
                            lVarA2 = p020r2.d4.a(lVarV);
                            p020r2.d4.b(lVarA2, i0VarH10, companion2.c());
                            p020r2.d4.b(lVarA2, xVarC12, companion2.e());
                            pVarB2 = companion2.b();
                            if (lVarA2.getInserting()) {
                                lVarA2.B(Integer.valueOf(iA2));
                                lVarA2.f(Integer.valueOf(iA2), pVarB2);
                            } else {
                                lVarA2.B(Integer.valueOf(iA2));
                                lVarA2.f(Integer.valueOf(iA2), pVarB2);
                            }
                            p020r2.d4.b(lVarA2, dVarE12, companion2.d());
                            i27 = 1;
                            C4670d1.a(aVar3, AbstractC3307gk.a(AbstractC3307gk.a(AbstractC3307gk.a(companion7, "closeButton", (String) null, 2, (Object) null), 199.0f), RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close_acessibility, 0, 2, null), lVarV, 0), false, 2, (Object) null), false, null, z2.c.e(1519979611, true, new a(closeImageSource), lVarV, 54), lVarV, 24576, 12);
                            lVarV.g();
                            jn0.h0 h0Var8 = jn0.h0.f84049a;
                        }
                        lVarV.l();
                        lVarV.o(-1038906739);
                        if (str2 != null) {
                            float f13 = 32;
                            str3 = str2;
                            Zg.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, w4.h.g(f13), w4.h.g(f13), w4.h.g(48), BitmapDescriptorFactory.HUE_RED, 8, null), BitmapDescriptorFactory.HUE_RED, i27, null), str3, null, k3.p1.INSTANCE.k(), null, null, lVarV, ((i26 >> 3) & 112) | 3072, 52);
                        } else {
                            str3 = str2;
                        }
                        lVarV.l();
                        if (qVar2 != null) {
                            i28 = 80;
                        } else {
                            i28 = 156;
                        }
                        androidx.compose.ui.d dVarM6 = androidx.compose.foundation.layout.t.m(v1.p0.c(dVar2, v1.s0.d(v1.m0.INSTANCE, lVarV, 6)), BitmapDescriptorFactory.HUE_RED, w4.h.g(i28), BitmapDescriptorFactory.HUE_RED, C3825sp.f35377a.c(lVarV, 6).f(), 5, null);
                        z3.i0 i0VarA3 = v1.g.a(v1.b.f117444a.g(), companion.g(), lVarV, 48);
                        iA3 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC13 = lVarV.c();
                        androidx.compose.ui.d dVarE13 = androidx.compose.ui.c.e(lVarV, dVarM6);
                        aVarA3 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA3);
                        } else {
                            lVarV.d();
                        }
                        lVarA3 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA3, i0VarA3, companion2.c());
                        p020r2.d4.b(lVarA3, xVarC13, companion2.e());
                        pVarB3 = companion2.b();
                        if (lVarA3.getInserting()) {
                            lVarA3.B(Integer.valueOf(iA3));
                            lVarA3.f(Integer.valueOf(iA3), pVarB3);
                        } else {
                            lVarA3.B(Integer.valueOf(iA3));
                            lVarA3.f(Integer.valueOf(iA3), pVarB3);
                        }
                        p020r2.d4.b(lVarA3, dVarE13, companion2.d());
                        jVar = v1.j.f117505a;
                        lVarV.o(915714536);
                        if (qVar2 != null) {
                            qVar2.invoke(jVar, lVarV, Integer.valueOf(((i26 >> 12) & 112) | 6));
                            jn0.h0 h0Var9 = jn0.h0.f84049a;
                        }
                        lVarV.l();
                        androidx.compose.ui.d.Companion companion8 = androidx.compose.ui.d.INSTANCE;
                        androidx.compose.ui.d dVarB5 = v1.i.b(jVar, companion8, ((Number) pair7.e()).floatValue(), false, 2, null);
                        z3.i0 i0VarH11 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                        iA4 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC14 = lVarV.c();
                        androidx.compose.ui.d dVarE14 = androidx.compose.ui.c.e(lVarV, dVarB5);
                        aVarA4 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA4);
                        } else {
                            lVarV.d();
                        }
                        lVarA4 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA4, i0VarH11, companion2.c());
                        p020r2.d4.b(lVarA4, xVarC14, companion2.e());
                        pVarB4 = companion2.b();
                        if (lVarA4.getInserting()) {
                            lVarA4.B(Integer.valueOf(iA4));
                            lVarA4.f(Integer.valueOf(iA4), pVarB4);
                        } else {
                            lVarA4.B(Integer.valueOf(iA4));
                            lVarA4.f(Integer.valueOf(iA4), pVarB4);
                        }
                        p020r2.d4.b(lVarA4, dVarE14, companion2.d());
                        body.invoke(lVarV, Integer.valueOf((i26 >> 18) & 14));
                        lVarV.g();
                        androidx.compose.ui.d dVarB6 = v1.i.b(jVar, companion8, ((Number) pair7.f()).floatValue(), false, 2, null);
                        z3.i0 i0VarH12 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                        iA5 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC15 = lVarV.c();
                        androidx.compose.ui.d dVarE15 = androidx.compose.ui.c.e(lVarV, dVarB6);
                        aVarA5 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA5);
                        } else {
                            lVarV.d();
                        }
                        lVarA5 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA5, i0VarH12, companion2.c());
                        p020r2.d4.b(lVarA5, xVarC15, companion2.e());
                        pVarB5 = companion2.b();
                        if (lVarA5.getInserting()) {
                            lVarA5.B(Integer.valueOf(iA5));
                            lVarA5.f(Integer.valueOf(iA5), pVarB5);
                        } else {
                            lVarA5.B(Integer.valueOf(iA5));
                            lVarA5.f(Integer.valueOf(iA5), pVarB5);
                        }
                        p020r2.d4.b(lVarA5, dVarE15, companion2.d());
                        footer.invoke(lVarV, Integer.valueOf((i26 >> 21) & 14));
                        lVarV.g();
                        lVarV.g();
                        lVarV.g();
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        pVar3 = pVar2;
                        qVar3 = qVar2;
                        aVar4 = aVar3;
                        str2 = str3;
                        j13 = j12;
                        pair3 = pair7;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        final androidx.compose.ui.d dVar4 = dVar2;
                        final String str5 = str2;
                        final Pair pair8 = pair3;
                        w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.wq0
                            @Override // wn0.p
                            public final Object invoke(Object obj, Object obj2) {
                                return UD.a(dVar4, j13, str5, closeImageSource, pVar3, qVar3, body, footer, aVar4, pair8, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 24576;
                pVar2 = pVar;
                i19 = i12 & 32;
                if (i19 != 0) {
                    i13 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    if (lVarV.K(qVar)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                if ((i12 & 64) != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (lVarV.K(body)) {
                        i22 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i22 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i22;
                }
                if ((i12 & 128) != 0) {
                    i13 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    if (lVarV.K(footer)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i13 |= i23;
                }
                i24 = i12 & 256;
                if (i24 != 0) {
                    if ((i11 & 100663296) == 0) {
                        if (lVarV.K(aVar)) {
                            i25 = 67108864;
                        } else {
                            i25 = 33554432;
                        }
                        i13 |= i25;
                    }
                    if ((i11 & 805306368) != 0) {
                        i13 |= ((i12 & 512) == 0 || !lVarV.n(pair)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i31 != 0) {
                                jI = k3.p1.INSTANCE.i();
                            }
                            if (i14 != 0) {
                                str2 = null;
                            }
                            if (i17 != 0) {
                                pVar2 = null;
                            }
                            if (i19 != 0) {
                                qVar2 = null;
                            } else {
                                qVar2 = qVar;
                            }
                            if (i24 != 0) {
                                aVar2 = null;
                            } else {
                                aVar2 = aVar;
                            }
                            if ((i12 & 512) != 0) {
                                pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                                i13 &= -1879048193;
                                qVar2 = qVar2;
                            } else {
                                pair2 = pair;
                            }
                            j12 = jI;
                            aVar3 = aVar2;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i31 != 0) {
                                jI = k3.p1.INSTANCE.i();
                            }
                            if (i14 != 0) {
                                str2 = null;
                            }
                            if (i17 != 0) {
                                pVar2 = null;
                            }
                            if (i19 != 0) {
                                qVar2 = null;
                            } else {
                                qVar2 = qVar;
                            }
                            if (i24 != 0) {
                                aVar2 = null;
                            } else {
                                aVar2 = aVar;
                            }
                            if ((i12 & 512) != 0) {
                                pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                                i13 &= -1879048193;
                                qVar2 = qVar2;
                            } else {
                                pair2 = pair;
                            }
                            j12 = jI;
                            aVar3 = aVar2;
                        }
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(72921645, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerOverlayScaffold (VisionScannerOverlayScaffold.kt:54)");
                        }
                        lVarV.o(-1858078478);
                        objI = lVarV.I();
                        if (objI == p020r2.l.INSTANCE.a()) {
                            objI = new wn0.l() { // from class: com.fourthline.orca.internal.vq0
                                @Override // wn0.l
                                public final Object invoke(Object obj) {
                                    return UD.a((g4.y) obj);
                                }
                            };
                            lVarV.B(objI);
                        }
                        lVarV.l();
                        i26 = i13;
                        androidx.compose.ui.d dVarD4 = androidx.compose.foundation.b.d(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), j12, null, 2, null);
                        companion = d3.c.INSTANCE;
                        z3.i0 i0VarH13 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                        iA = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC16 = lVarV.c();
                        androidx.compose.ui.d dVarE16 = androidx.compose.ui.c.e(lVarV, dVarD4);
                        companion2 = b4.g.INSTANCE;
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
                        Pair pair9 = pair2;
                        p020r2.d4.b(lVarA, i0VarH13, companion2.c());
                        p020r2.d4.b(lVarA, xVarC16, companion2.e());
                        pVarB = companion2.b();
                        if (lVarA.getInserting()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        p020r2.d4.b(lVarA, dVarE16, companion2.d());
                        androidx.compose.foundation.layout.i iVar4 = androidx.compose.foundation.layout.i.f4585a;
                        lVarV.o(-1038937986);
                        if (pVar2 != null) {
                            pVar2.invoke(lVarV, Integer.valueOf((i26 >> 12) & 14));
                            jn0.h0 h0Var10 = jn0.h0.f84049a;
                        }
                        lVarV.l();
                        lVarV.o(-1038935796);
                        if (aVar3 == null) {
                            i27 = 1;
                        } else {
                            androidx.compose.ui.d.Companion companion9 = androidx.compose.ui.d.INSTANCE;
                            androidx.compose.ui.d dVarM7 = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.h(companion9, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                            z3.i0 i0VarH14 = androidx.compose.foundation.layout.g.h(companion.n(), false);
                            iA2 = p020r2.j.a(lVarV, 0);
                            p020r2.x xVarC17 = lVarV.c();
                            androidx.compose.ui.d dVarE17 = androidx.compose.ui.c.e(lVarV, dVarM7);
                            aVarA2 = companion2.a();
                            if (lVarV.w() == null) {
                                p020r2.j.c();
                            }
                            lVarV.h();
                            if (lVarV.getInserting()) {
                                lVarV.z(aVarA2);
                            } else {
                                lVarV.d();
                            }
                            lVarA2 = p020r2.d4.a(lVarV);
                            p020r2.d4.b(lVarA2, i0VarH14, companion2.c());
                            p020r2.d4.b(lVarA2, xVarC17, companion2.e());
                            pVarB2 = companion2.b();
                            if (lVarA2.getInserting()) {
                                lVarA2.B(Integer.valueOf(iA2));
                                lVarA2.f(Integer.valueOf(iA2), pVarB2);
                            } else {
                                lVarA2.B(Integer.valueOf(iA2));
                                lVarA2.f(Integer.valueOf(iA2), pVarB2);
                            }
                            p020r2.d4.b(lVarA2, dVarE17, companion2.d());
                            i27 = 1;
                            C4670d1.a(aVar3, AbstractC3307gk.a(AbstractC3307gk.a(AbstractC3307gk.a(companion9, "closeButton", (String) null, 2, (Object) null), 199.0f), RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close_acessibility, 0, 2, null), lVarV, 0), false, 2, (Object) null), false, null, z2.c.e(1519979611, true, new a(closeImageSource), lVarV, 54), lVarV, 24576, 12);
                            lVarV.g();
                            jn0.h0 h0Var11 = jn0.h0.f84049a;
                        }
                        lVarV.l();
                        lVarV.o(-1038906739);
                        if (str2 != null) {
                            float f14 = 32;
                            str3 = str2;
                            Zg.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, w4.h.g(f14), w4.h.g(f14), w4.h.g(48), BitmapDescriptorFactory.HUE_RED, 8, null), BitmapDescriptorFactory.HUE_RED, i27, null), str3, null, k3.p1.INSTANCE.k(), null, null, lVarV, ((i26 >> 3) & 112) | 3072, 52);
                        } else {
                            str3 = str2;
                        }
                        lVarV.l();
                        if (qVar2 != null) {
                            i28 = 80;
                        } else {
                            i28 = 156;
                        }
                        androidx.compose.ui.d dVarM8 = androidx.compose.foundation.layout.t.m(v1.p0.c(dVar2, v1.s0.d(v1.m0.INSTANCE, lVarV, 6)), BitmapDescriptorFactory.HUE_RED, w4.h.g(i28), BitmapDescriptorFactory.HUE_RED, C3825sp.f35377a.c(lVarV, 6).f(), 5, null);
                        z3.i0 i0VarA4 = v1.g.a(v1.b.f117444a.g(), companion.g(), lVarV, 48);
                        iA3 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC18 = lVarV.c();
                        androidx.compose.ui.d dVarE18 = androidx.compose.ui.c.e(lVarV, dVarM8);
                        aVarA3 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA3);
                        } else {
                            lVarV.d();
                        }
                        lVarA3 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA3, i0VarA4, companion2.c());
                        p020r2.d4.b(lVarA3, xVarC18, companion2.e());
                        pVarB3 = companion2.b();
                        if (lVarA3.getInserting()) {
                            lVarA3.B(Integer.valueOf(iA3));
                            lVarA3.f(Integer.valueOf(iA3), pVarB3);
                        } else {
                            lVarA3.B(Integer.valueOf(iA3));
                            lVarA3.f(Integer.valueOf(iA3), pVarB3);
                        }
                        p020r2.d4.b(lVarA3, dVarE18, companion2.d());
                        jVar = v1.j.f117505a;
                        lVarV.o(915714536);
                        if (qVar2 != null) {
                            qVar2.invoke(jVar, lVarV, Integer.valueOf(((i26 >> 12) & 112) | 6));
                            jn0.h0 h0Var12 = jn0.h0.f84049a;
                        }
                        lVarV.l();
                        androidx.compose.ui.d.Companion companion10 = androidx.compose.ui.d.INSTANCE;
                        androidx.compose.ui.d dVarB7 = v1.i.b(jVar, companion10, ((Number) pair9.e()).floatValue(), false, 2, null);
                        z3.i0 i0VarH15 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                        iA4 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC19 = lVarV.c();
                        androidx.compose.ui.d dVarE19 = androidx.compose.ui.c.e(lVarV, dVarB7);
                        aVarA4 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA4);
                        } else {
                            lVarV.d();
                        }
                        lVarA4 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA4, i0VarH15, companion2.c());
                        p020r2.d4.b(lVarA4, xVarC19, companion2.e());
                        pVarB4 = companion2.b();
                        if (lVarA4.getInserting()) {
                            lVarA4.B(Integer.valueOf(iA4));
                            lVarA4.f(Integer.valueOf(iA4), pVarB4);
                        } else {
                            lVarA4.B(Integer.valueOf(iA4));
                            lVarA4.f(Integer.valueOf(iA4), pVarB4);
                        }
                        p020r2.d4.b(lVarA4, dVarE19, companion2.d());
                        body.invoke(lVarV, Integer.valueOf((i26 >> 18) & 14));
                        lVarV.g();
                        androidx.compose.ui.d dVarB8 = v1.i.b(jVar, companion10, ((Number) pair9.f()).floatValue(), false, 2, null);
                        z3.i0 i0VarH16 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                        iA5 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC110 = lVarV.c();
                        androidx.compose.ui.d dVarE110 = androidx.compose.ui.c.e(lVarV, dVarB8);
                        aVarA5 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA5);
                        } else {
                            lVarV.d();
                        }
                        lVarA5 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA5, i0VarH16, companion2.c());
                        p020r2.d4.b(lVarA5, xVarC110, companion2.e());
                        pVarB5 = companion2.b();
                        if (lVarA5.getInserting()) {
                            lVarA5.B(Integer.valueOf(iA5));
                            lVarA5.f(Integer.valueOf(iA5), pVarB5);
                        } else {
                            lVarA5.B(Integer.valueOf(iA5));
                            lVarA5.f(Integer.valueOf(iA5), pVarB5);
                        }
                        p020r2.d4.b(lVarA5, dVarE110, companion2.d());
                        footer.invoke(lVarV, Integer.valueOf((i26 >> 21) & 14));
                        lVarV.g();
                        lVarV.g();
                        lVarV.g();
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        pVar3 = pVar2;
                        qVar3 = qVar2;
                        aVar4 = aVar3;
                        str2 = str3;
                        j13 = j12;
                        pair3 = pair9;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i31 != 0) {
                                jI = k3.p1.INSTANCE.i();
                            }
                            if (i14 != 0) {
                                str2 = null;
                            }
                            if (i17 != 0) {
                                pVar2 = null;
                            }
                            if (i19 != 0) {
                                qVar2 = null;
                            } else {
                                qVar2 = qVar;
                            }
                            if (i24 != 0) {
                                aVar2 = null;
                            } else {
                                aVar2 = aVar;
                            }
                            if ((i12 & 512) != 0) {
                                pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                                i13 &= -1879048193;
                                qVar2 = qVar2;
                            } else {
                                pair2 = pair;
                            }
                            j12 = jI;
                            aVar3 = aVar2;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i31 != 0) {
                                jI = k3.p1.INSTANCE.i();
                            }
                            if (i14 != 0) {
                                str2 = null;
                            }
                            if (i17 != 0) {
                                pVar2 = null;
                            }
                            if (i19 != 0) {
                                qVar2 = null;
                            } else {
                                qVar2 = qVar;
                            }
                            if (i24 != 0) {
                                aVar2 = null;
                            } else {
                                aVar2 = aVar;
                            }
                            if ((i12 & 512) != 0) {
                                pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                                i13 &= -1879048193;
                                qVar2 = qVar2;
                            } else {
                                pair2 = pair;
                            }
                            j12 = jI;
                            aVar3 = aVar2;
                        }
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(72921645, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerOverlayScaffold (VisionScannerOverlayScaffold.kt:54)");
                        }
                        lVarV.o(-1858078478);
                        objI = lVarV.I();
                        if (objI == p020r2.l.INSTANCE.a()) {
                            objI = new wn0.l() { // from class: com.fourthline.orca.internal.vq0
                                @Override // wn0.l
                                public final Object invoke(Object obj) {
                                    return UD.a((g4.y) obj);
                                }
                            };
                            lVarV.B(objI);
                        }
                        lVarV.l();
                        i26 = i13;
                        androidx.compose.ui.d dVarD5 = androidx.compose.foundation.b.d(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), j12, null, 2, null);
                        companion = d3.c.INSTANCE;
                        z3.i0 i0VarH17 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                        iA = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC111 = lVarV.c();
                        androidx.compose.ui.d dVarE111 = androidx.compose.ui.c.e(lVarV, dVarD5);
                        companion2 = b4.g.INSTANCE;
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
                        Pair pair10 = pair2;
                        p020r2.d4.b(lVarA, i0VarH17, companion2.c());
                        p020r2.d4.b(lVarA, xVarC111, companion2.e());
                        pVarB = companion2.b();
                        if (lVarA.getInserting()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        p020r2.d4.b(lVarA, dVarE111, companion2.d());
                        androidx.compose.foundation.layout.i iVar5 = androidx.compose.foundation.layout.i.f4585a;
                        lVarV.o(-1038937986);
                        if (pVar2 != null) {
                            pVar2.invoke(lVarV, Integer.valueOf((i26 >> 12) & 14));
                            jn0.h0 h0Var13 = jn0.h0.f84049a;
                        }
                        lVarV.l();
                        lVarV.o(-1038935796);
                        if (aVar3 == null) {
                            i27 = 1;
                        } else {
                            androidx.compose.ui.d.Companion companion11 = androidx.compose.ui.d.INSTANCE;
                            androidx.compose.ui.d dVarM9 = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.h(companion11, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                            z3.i0 i0VarH18 = androidx.compose.foundation.layout.g.h(companion.n(), false);
                            iA2 = p020r2.j.a(lVarV, 0);
                            p020r2.x xVarC112 = lVarV.c();
                            androidx.compose.ui.d dVarE112 = androidx.compose.ui.c.e(lVarV, dVarM9);
                            aVarA2 = companion2.a();
                            if (lVarV.w() == null) {
                                p020r2.j.c();
                            }
                            lVarV.h();
                            if (lVarV.getInserting()) {
                                lVarV.z(aVarA2);
                            } else {
                                lVarV.d();
                            }
                            lVarA2 = p020r2.d4.a(lVarV);
                            p020r2.d4.b(lVarA2, i0VarH18, companion2.c());
                            p020r2.d4.b(lVarA2, xVarC112, companion2.e());
                            pVarB2 = companion2.b();
                            if (lVarA2.getInserting()) {
                                lVarA2.B(Integer.valueOf(iA2));
                                lVarA2.f(Integer.valueOf(iA2), pVarB2);
                            } else {
                                lVarA2.B(Integer.valueOf(iA2));
                                lVarA2.f(Integer.valueOf(iA2), pVarB2);
                            }
                            p020r2.d4.b(lVarA2, dVarE112, companion2.d());
                            i27 = 1;
                            C4670d1.a(aVar3, AbstractC3307gk.a(AbstractC3307gk.a(AbstractC3307gk.a(companion11, "closeButton", (String) null, 2, (Object) null), 199.0f), RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close_acessibility, 0, 2, null), lVarV, 0), false, 2, (Object) null), false, null, z2.c.e(1519979611, true, new a(closeImageSource), lVarV, 54), lVarV, 24576, 12);
                            lVarV.g();
                            jn0.h0 h0Var14 = jn0.h0.f84049a;
                        }
                        lVarV.l();
                        lVarV.o(-1038906739);
                        if (str2 != null) {
                            float f15 = 32;
                            str3 = str2;
                            Zg.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, w4.h.g(f15), w4.h.g(f15), w4.h.g(48), BitmapDescriptorFactory.HUE_RED, 8, null), BitmapDescriptorFactory.HUE_RED, i27, null), str3, null, k3.p1.INSTANCE.k(), null, null, lVarV, ((i26 >> 3) & 112) | 3072, 52);
                        } else {
                            str3 = str2;
                        }
                        lVarV.l();
                        if (qVar2 != null) {
                            i28 = 80;
                        } else {
                            i28 = 156;
                        }
                        androidx.compose.ui.d dVarM10 = androidx.compose.foundation.layout.t.m(v1.p0.c(dVar2, v1.s0.d(v1.m0.INSTANCE, lVarV, 6)), BitmapDescriptorFactory.HUE_RED, w4.h.g(i28), BitmapDescriptorFactory.HUE_RED, C3825sp.f35377a.c(lVarV, 6).f(), 5, null);
                        z3.i0 i0VarA5 = v1.g.a(v1.b.f117444a.g(), companion.g(), lVarV, 48);
                        iA3 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC113 = lVarV.c();
                        androidx.compose.ui.d dVarE113 = androidx.compose.ui.c.e(lVarV, dVarM10);
                        aVarA3 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA3);
                        } else {
                            lVarV.d();
                        }
                        lVarA3 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA3, i0VarA5, companion2.c());
                        p020r2.d4.b(lVarA3, xVarC113, companion2.e());
                        pVarB3 = companion2.b();
                        if (lVarA3.getInserting()) {
                            lVarA3.B(Integer.valueOf(iA3));
                            lVarA3.f(Integer.valueOf(iA3), pVarB3);
                        } else {
                            lVarA3.B(Integer.valueOf(iA3));
                            lVarA3.f(Integer.valueOf(iA3), pVarB3);
                        }
                        p020r2.d4.b(lVarA3, dVarE113, companion2.d());
                        jVar = v1.j.f117505a;
                        lVarV.o(915714536);
                        if (qVar2 != null) {
                            qVar2.invoke(jVar, lVarV, Integer.valueOf(((i26 >> 12) & 112) | 6));
                            jn0.h0 h0Var15 = jn0.h0.f84049a;
                        }
                        lVarV.l();
                        androidx.compose.ui.d.Companion companion12 = androidx.compose.ui.d.INSTANCE;
                        androidx.compose.ui.d dVarB9 = v1.i.b(jVar, companion12, ((Number) pair10.e()).floatValue(), false, 2, null);
                        z3.i0 i0VarH19 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                        iA4 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC114 = lVarV.c();
                        androidx.compose.ui.d dVarE114 = androidx.compose.ui.c.e(lVarV, dVarB9);
                        aVarA4 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA4);
                        } else {
                            lVarV.d();
                        }
                        lVarA4 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA4, i0VarH19, companion2.c());
                        p020r2.d4.b(lVarA4, xVarC114, companion2.e());
                        pVarB4 = companion2.b();
                        if (lVarA4.getInserting()) {
                            lVarA4.B(Integer.valueOf(iA4));
                            lVarA4.f(Integer.valueOf(iA4), pVarB4);
                        } else {
                            lVarA4.B(Integer.valueOf(iA4));
                            lVarA4.f(Integer.valueOf(iA4), pVarB4);
                        }
                        p020r2.d4.b(lVarA4, dVarE114, companion2.d());
                        body.invoke(lVarV, Integer.valueOf((i26 >> 18) & 14));
                        lVarV.g();
                        androidx.compose.ui.d dVarB10 = v1.i.b(jVar, companion12, ((Number) pair10.f()).floatValue(), false, 2, null);
                        z3.i0 i0VarH110 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                        iA5 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC115 = lVarV.c();
                        androidx.compose.ui.d dVarE115 = androidx.compose.ui.c.e(lVarV, dVarB10);
                        aVarA5 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA5);
                        } else {
                            lVarV.d();
                        }
                        lVarA5 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA5, i0VarH110, companion2.c());
                        p020r2.d4.b(lVarA5, xVarC115, companion2.e());
                        pVarB5 = companion2.b();
                        if (lVarA5.getInserting()) {
                            lVarA5.B(Integer.valueOf(iA5));
                            lVarA5.f(Integer.valueOf(iA5), pVarB5);
                        } else {
                            lVarA5.B(Integer.valueOf(iA5));
                            lVarA5.f(Integer.valueOf(iA5), pVarB5);
                        }
                        p020r2.d4.b(lVarA5, dVarE115, companion2.d());
                        footer.invoke(lVarV, Integer.valueOf((i26 >> 21) & 14));
                        lVarV.g();
                        lVarV.g();
                        lVarV.g();
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        pVar3 = pVar2;
                        qVar3 = qVar2;
                        aVar4 = aVar3;
                        str2 = str3;
                        j13 = j12;
                        pair3 = pair10;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        final androidx.compose.ui.d dVar5 = dVar2;
                        final String str6 = str2;
                        final Pair pair11 = pair3;
                        w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.wq0
                            @Override // wn0.p
                            public final Object invoke(Object obj, Object obj2) {
                                return UD.a(dVar5, j13, str6, closeImageSource, pVar3, qVar3, body, footer, aVar4, pair11, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 100663296;
                if ((i11 & 805306368) != 0) {
                    i13 |= ((i12 & 512) == 0 || !lVarV.n(pair)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                if ((i13 & 306783379) == 306783378) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i31 != 0) {
                            jI = k3.p1.INSTANCE.i();
                        }
                        if (i14 != 0) {
                            str2 = null;
                        }
                        if (i17 != 0) {
                            pVar2 = null;
                        }
                        if (i19 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        if (i24 != 0) {
                            aVar2 = null;
                        } else {
                            aVar2 = aVar;
                        }
                        if ((i12 & 512) != 0) {
                            pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                            i13 &= -1879048193;
                            qVar2 = qVar2;
                        } else {
                            pair2 = pair;
                        }
                        j12 = jI;
                        aVar3 = aVar2;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i31 != 0) {
                            jI = k3.p1.INSTANCE.i();
                        }
                        if (i14 != 0) {
                            str2 = null;
                        }
                        if (i17 != 0) {
                            pVar2 = null;
                        }
                        if (i19 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        if (i24 != 0) {
                            aVar2 = null;
                        } else {
                            aVar2 = aVar;
                        }
                        if ((i12 & 512) != 0) {
                            pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                            i13 &= -1879048193;
                            qVar2 = qVar2;
                        } else {
                            pair2 = pair;
                        }
                        j12 = jI;
                        aVar3 = aVar2;
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(72921645, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerOverlayScaffold (VisionScannerOverlayScaffold.kt:54)");
                    }
                    lVarV.o(-1858078478);
                    objI = lVarV.I();
                    if (objI == p020r2.l.INSTANCE.a()) {
                        objI = new wn0.l() { // from class: com.fourthline.orca.internal.vq0
                            @Override // wn0.l
                            public final Object invoke(Object obj) {
                                return UD.a((g4.y) obj);
                            }
                        };
                        lVarV.B(objI);
                    }
                    lVarV.l();
                    i26 = i13;
                    androidx.compose.ui.d dVarD6 = androidx.compose.foundation.b.d(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), j12, null, 2, null);
                    companion = d3.c.INSTANCE;
                    z3.i0 i0VarH111 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                    iA = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC116 = lVarV.c();
                    androidx.compose.ui.d dVarE116 = androidx.compose.ui.c.e(lVarV, dVarD6);
                    companion2 = b4.g.INSTANCE;
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
                    Pair pair12 = pair2;
                    p020r2.d4.b(lVarA, i0VarH111, companion2.c());
                    p020r2.d4.b(lVarA, xVarC116, companion2.e());
                    pVarB = companion2.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    p020r2.d4.b(lVarA, dVarE116, companion2.d());
                    androidx.compose.foundation.layout.i iVar6 = androidx.compose.foundation.layout.i.f4585a;
                    lVarV.o(-1038937986);
                    if (pVar2 != null) {
                        pVar2.invoke(lVarV, Integer.valueOf((i26 >> 12) & 14));
                        jn0.h0 h0Var16 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    lVarV.o(-1038935796);
                    if (aVar3 == null) {
                        i27 = 1;
                    } else {
                        androidx.compose.ui.d.Companion companion13 = androidx.compose.ui.d.INSTANCE;
                        androidx.compose.ui.d dVarM11 = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.h(companion13, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                        z3.i0 i0VarH112 = androidx.compose.foundation.layout.g.h(companion.n(), false);
                        iA2 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC117 = lVarV.c();
                        androidx.compose.ui.d dVarE117 = androidx.compose.ui.c.e(lVarV, dVarM11);
                        aVarA2 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA2);
                        } else {
                            lVarV.d();
                        }
                        lVarA2 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA2, i0VarH112, companion2.c());
                        p020r2.d4.b(lVarA2, xVarC117, companion2.e());
                        pVarB2 = companion2.b();
                        if (lVarA2.getInserting()) {
                            lVarA2.B(Integer.valueOf(iA2));
                            lVarA2.f(Integer.valueOf(iA2), pVarB2);
                        } else {
                            lVarA2.B(Integer.valueOf(iA2));
                            lVarA2.f(Integer.valueOf(iA2), pVarB2);
                        }
                        p020r2.d4.b(lVarA2, dVarE117, companion2.d());
                        i27 = 1;
                        C4670d1.a(aVar3, AbstractC3307gk.a(AbstractC3307gk.a(AbstractC3307gk.a(companion13, "closeButton", (String) null, 2, (Object) null), 199.0f), RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close_acessibility, 0, 2, null), lVarV, 0), false, 2, (Object) null), false, null, z2.c.e(1519979611, true, new a(closeImageSource), lVarV, 54), lVarV, 24576, 12);
                        lVarV.g();
                        jn0.h0 h0Var17 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    lVarV.o(-1038906739);
                    if (str2 != null) {
                        float f16 = 32;
                        str3 = str2;
                        Zg.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, w4.h.g(f16), w4.h.g(f16), w4.h.g(48), BitmapDescriptorFactory.HUE_RED, 8, null), BitmapDescriptorFactory.HUE_RED, i27, null), str3, null, k3.p1.INSTANCE.k(), null, null, lVarV, ((i26 >> 3) & 112) | 3072, 52);
                    } else {
                        str3 = str2;
                    }
                    lVarV.l();
                    if (qVar2 != null) {
                        i28 = 80;
                    } else {
                        i28 = 156;
                    }
                    androidx.compose.ui.d dVarM12 = androidx.compose.foundation.layout.t.m(v1.p0.c(dVar2, v1.s0.d(v1.m0.INSTANCE, lVarV, 6)), BitmapDescriptorFactory.HUE_RED, w4.h.g(i28), BitmapDescriptorFactory.HUE_RED, C3825sp.f35377a.c(lVarV, 6).f(), 5, null);
                    z3.i0 i0VarA6 = v1.g.a(v1.b.f117444a.g(), companion.g(), lVarV, 48);
                    iA3 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC118 = lVarV.c();
                    androidx.compose.ui.d dVarE118 = androidx.compose.ui.c.e(lVarV, dVarM12);
                    aVarA3 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA3);
                    } else {
                        lVarV.d();
                    }
                    lVarA3 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA3, i0VarA6, companion2.c());
                    p020r2.d4.b(lVarA3, xVarC118, companion2.e());
                    pVarB3 = companion2.b();
                    if (lVarA3.getInserting()) {
                        lVarA3.B(Integer.valueOf(iA3));
                        lVarA3.f(Integer.valueOf(iA3), pVarB3);
                    } else {
                        lVarA3.B(Integer.valueOf(iA3));
                        lVarA3.f(Integer.valueOf(iA3), pVarB3);
                    }
                    p020r2.d4.b(lVarA3, dVarE118, companion2.d());
                    jVar = v1.j.f117505a;
                    lVarV.o(915714536);
                    if (qVar2 != null) {
                        qVar2.invoke(jVar, lVarV, Integer.valueOf(((i26 >> 12) & 112) | 6));
                        jn0.h0 h0Var18 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    androidx.compose.ui.d.Companion companion14 = androidx.compose.ui.d.INSTANCE;
                    androidx.compose.ui.d dVarB11 = v1.i.b(jVar, companion14, ((Number) pair12.e()).floatValue(), false, 2, null);
                    z3.i0 i0VarH113 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                    iA4 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC119 = lVarV.c();
                    androidx.compose.ui.d dVarE119 = androidx.compose.ui.c.e(lVarV, dVarB11);
                    aVarA4 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA4);
                    } else {
                        lVarV.d();
                    }
                    lVarA4 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA4, i0VarH113, companion2.c());
                    p020r2.d4.b(lVarA4, xVarC119, companion2.e());
                    pVarB4 = companion2.b();
                    if (lVarA4.getInserting()) {
                        lVarA4.B(Integer.valueOf(iA4));
                        lVarA4.f(Integer.valueOf(iA4), pVarB4);
                    } else {
                        lVarA4.B(Integer.valueOf(iA4));
                        lVarA4.f(Integer.valueOf(iA4), pVarB4);
                    }
                    p020r2.d4.b(lVarA4, dVarE119, companion2.d());
                    body.invoke(lVarV, Integer.valueOf((i26 >> 18) & 14));
                    lVarV.g();
                    androidx.compose.ui.d dVarB12 = v1.i.b(jVar, companion14, ((Number) pair12.f()).floatValue(), false, 2, null);
                    z3.i0 i0VarH114 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                    iA5 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC1110 = lVarV.c();
                    androidx.compose.ui.d dVarE1110 = androidx.compose.ui.c.e(lVarV, dVarB12);
                    aVarA5 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA5);
                    } else {
                        lVarV.d();
                    }
                    lVarA5 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA5, i0VarH114, companion2.c());
                    p020r2.d4.b(lVarA5, xVarC1110, companion2.e());
                    pVarB5 = companion2.b();
                    if (lVarA5.getInserting()) {
                        lVarA5.B(Integer.valueOf(iA5));
                        lVarA5.f(Integer.valueOf(iA5), pVarB5);
                    } else {
                        lVarA5.B(Integer.valueOf(iA5));
                        lVarA5.f(Integer.valueOf(iA5), pVarB5);
                    }
                    p020r2.d4.b(lVarA5, dVarE1110, companion2.d());
                    footer.invoke(lVarV, Integer.valueOf((i26 >> 21) & 14));
                    lVarV.g();
                    lVarV.g();
                    lVarV.g();
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    pVar3 = pVar2;
                    qVar3 = qVar2;
                    aVar4 = aVar3;
                    str2 = str3;
                    j13 = j12;
                    pair3 = pair12;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i31 != 0) {
                            jI = k3.p1.INSTANCE.i();
                        }
                        if (i14 != 0) {
                            str2 = null;
                        }
                        if (i17 != 0) {
                            pVar2 = null;
                        }
                        if (i19 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        if (i24 != 0) {
                            aVar2 = null;
                        } else {
                            aVar2 = aVar;
                        }
                        if ((i12 & 512) != 0) {
                            pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                            i13 &= -1879048193;
                            qVar2 = qVar2;
                        } else {
                            pair2 = pair;
                        }
                        j12 = jI;
                        aVar3 = aVar2;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i31 != 0) {
                            jI = k3.p1.INSTANCE.i();
                        }
                        if (i14 != 0) {
                            str2 = null;
                        }
                        if (i17 != 0) {
                            pVar2 = null;
                        }
                        if (i19 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        if (i24 != 0) {
                            aVar2 = null;
                        } else {
                            aVar2 = aVar;
                        }
                        if ((i12 & 512) != 0) {
                            pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                            i13 &= -1879048193;
                            qVar2 = qVar2;
                        } else {
                            pair2 = pair;
                        }
                        j12 = jI;
                        aVar3 = aVar2;
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(72921645, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerOverlayScaffold (VisionScannerOverlayScaffold.kt:54)");
                    }
                    lVarV.o(-1858078478);
                    objI = lVarV.I();
                    if (objI == p020r2.l.INSTANCE.a()) {
                        objI = new wn0.l() { // from class: com.fourthline.orca.internal.vq0
                            @Override // wn0.l
                            public final Object invoke(Object obj) {
                                return UD.a((g4.y) obj);
                            }
                        };
                        lVarV.B(objI);
                    }
                    lVarV.l();
                    i26 = i13;
                    androidx.compose.ui.d dVarD7 = androidx.compose.foundation.b.d(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), j12, null, 2, null);
                    companion = d3.c.INSTANCE;
                    z3.i0 i0VarH115 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                    iA = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC1111 = lVarV.c();
                    androidx.compose.ui.d dVarE1111 = androidx.compose.ui.c.e(lVarV, dVarD7);
                    companion2 = b4.g.INSTANCE;
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
                    Pair pair13 = pair2;
                    p020r2.d4.b(lVarA, i0VarH115, companion2.c());
                    p020r2.d4.b(lVarA, xVarC1111, companion2.e());
                    pVarB = companion2.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    p020r2.d4.b(lVarA, dVarE1111, companion2.d());
                    androidx.compose.foundation.layout.i iVar7 = androidx.compose.foundation.layout.i.f4585a;
                    lVarV.o(-1038937986);
                    if (pVar2 != null) {
                        pVar2.invoke(lVarV, Integer.valueOf((i26 >> 12) & 14));
                        jn0.h0 h0Var19 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    lVarV.o(-1038935796);
                    if (aVar3 == null) {
                        i27 = 1;
                    } else {
                        androidx.compose.ui.d.Companion companion15 = androidx.compose.ui.d.INSTANCE;
                        androidx.compose.ui.d dVarM13 = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.h(companion15, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                        z3.i0 i0VarH116 = androidx.compose.foundation.layout.g.h(companion.n(), false);
                        iA2 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC1112 = lVarV.c();
                        androidx.compose.ui.d dVarE1112 = androidx.compose.ui.c.e(lVarV, dVarM13);
                        aVarA2 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA2);
                        } else {
                            lVarV.d();
                        }
                        lVarA2 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA2, i0VarH116, companion2.c());
                        p020r2.d4.b(lVarA2, xVarC1112, companion2.e());
                        pVarB2 = companion2.b();
                        if (lVarA2.getInserting()) {
                            lVarA2.B(Integer.valueOf(iA2));
                            lVarA2.f(Integer.valueOf(iA2), pVarB2);
                        } else {
                            lVarA2.B(Integer.valueOf(iA2));
                            lVarA2.f(Integer.valueOf(iA2), pVarB2);
                        }
                        p020r2.d4.b(lVarA2, dVarE1112, companion2.d());
                        i27 = 1;
                        C4670d1.a(aVar3, AbstractC3307gk.a(AbstractC3307gk.a(AbstractC3307gk.a(companion15, "closeButton", (String) null, 2, (Object) null), 199.0f), RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close_acessibility, 0, 2, null), lVarV, 0), false, 2, (Object) null), false, null, z2.c.e(1519979611, true, new a(closeImageSource), lVarV, 54), lVarV, 24576, 12);
                        lVarV.g();
                        jn0.h0 h0Var110 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    lVarV.o(-1038906739);
                    if (str2 != null) {
                        float f17 = 32;
                        str3 = str2;
                        Zg.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, w4.h.g(f17), w4.h.g(f17), w4.h.g(48), BitmapDescriptorFactory.HUE_RED, 8, null), BitmapDescriptorFactory.HUE_RED, i27, null), str3, null, k3.p1.INSTANCE.k(), null, null, lVarV, ((i26 >> 3) & 112) | 3072, 52);
                    } else {
                        str3 = str2;
                    }
                    lVarV.l();
                    if (qVar2 != null) {
                        i28 = 80;
                    } else {
                        i28 = 156;
                    }
                    androidx.compose.ui.d dVarM14 = androidx.compose.foundation.layout.t.m(v1.p0.c(dVar2, v1.s0.d(v1.m0.INSTANCE, lVarV, 6)), BitmapDescriptorFactory.HUE_RED, w4.h.g(i28), BitmapDescriptorFactory.HUE_RED, C3825sp.f35377a.c(lVarV, 6).f(), 5, null);
                    z3.i0 i0VarA7 = v1.g.a(v1.b.f117444a.g(), companion.g(), lVarV, 48);
                    iA3 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC1113 = lVarV.c();
                    androidx.compose.ui.d dVarE1113 = androidx.compose.ui.c.e(lVarV, dVarM14);
                    aVarA3 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA3);
                    } else {
                        lVarV.d();
                    }
                    lVarA3 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA3, i0VarA7, companion2.c());
                    p020r2.d4.b(lVarA3, xVarC1113, companion2.e());
                    pVarB3 = companion2.b();
                    if (lVarA3.getInserting()) {
                        lVarA3.B(Integer.valueOf(iA3));
                        lVarA3.f(Integer.valueOf(iA3), pVarB3);
                    } else {
                        lVarA3.B(Integer.valueOf(iA3));
                        lVarA3.f(Integer.valueOf(iA3), pVarB3);
                    }
                    p020r2.d4.b(lVarA3, dVarE1113, companion2.d());
                    jVar = v1.j.f117505a;
                    lVarV.o(915714536);
                    if (qVar2 != null) {
                        qVar2.invoke(jVar, lVarV, Integer.valueOf(((i26 >> 12) & 112) | 6));
                        jn0.h0 h0Var111 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    androidx.compose.ui.d.Companion companion16 = androidx.compose.ui.d.INSTANCE;
                    androidx.compose.ui.d dVarB13 = v1.i.b(jVar, companion16, ((Number) pair13.e()).floatValue(), false, 2, null);
                    z3.i0 i0VarH117 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                    iA4 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC1114 = lVarV.c();
                    androidx.compose.ui.d dVarE1114 = androidx.compose.ui.c.e(lVarV, dVarB13);
                    aVarA4 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA4);
                    } else {
                        lVarV.d();
                    }
                    lVarA4 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA4, i0VarH117, companion2.c());
                    p020r2.d4.b(lVarA4, xVarC1114, companion2.e());
                    pVarB4 = companion2.b();
                    if (lVarA4.getInserting()) {
                        lVarA4.B(Integer.valueOf(iA4));
                        lVarA4.f(Integer.valueOf(iA4), pVarB4);
                    } else {
                        lVarA4.B(Integer.valueOf(iA4));
                        lVarA4.f(Integer.valueOf(iA4), pVarB4);
                    }
                    p020r2.d4.b(lVarA4, dVarE1114, companion2.d());
                    body.invoke(lVarV, Integer.valueOf((i26 >> 18) & 14));
                    lVarV.g();
                    androidx.compose.ui.d dVarB14 = v1.i.b(jVar, companion16, ((Number) pair13.f()).floatValue(), false, 2, null);
                    z3.i0 i0VarH118 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                    iA5 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC1115 = lVarV.c();
                    androidx.compose.ui.d dVarE1115 = androidx.compose.ui.c.e(lVarV, dVarB14);
                    aVarA5 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA5);
                    } else {
                        lVarV.d();
                    }
                    lVarA5 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA5, i0VarH118, companion2.c());
                    p020r2.d4.b(lVarA5, xVarC1115, companion2.e());
                    pVarB5 = companion2.b();
                    if (lVarA5.getInserting()) {
                        lVarA5.B(Integer.valueOf(iA5));
                        lVarA5.f(Integer.valueOf(iA5), pVarB5);
                    } else {
                        lVarA5.B(Integer.valueOf(iA5));
                        lVarA5.f(Integer.valueOf(iA5), pVarB5);
                    }
                    p020r2.d4.b(lVarA5, dVarE1115, companion2.d());
                    footer.invoke(lVarV, Integer.valueOf((i26 >> 21) & 14));
                    lVarV.g();
                    lVarV.g();
                    lVarV.g();
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    pVar3 = pVar2;
                    qVar3 = qVar2;
                    aVar4 = aVar3;
                    str2 = str3;
                    j13 = j12;
                    pair3 = pair13;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    final androidx.compose.ui.d dVar6 = dVar2;
                    final String str7 = str2;
                    final Pair pair14 = pair3;
                    w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.wq0
                        @Override // wn0.p
                        public final Object invoke(Object obj, Object obj2) {
                            return UD.a(dVar6, j13, str7, closeImageSource, pVar3, qVar3, body, footer, aVar4, pair14, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= KyberEngine.KyberPolyBytes;
            str2 = str;
            if ((i12 & 8) != 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                if ((i11 & 4096) == 0) {
                    zK = lVarV.n(closeImageSource);
                } else {
                    zK = lVarV.K(closeImageSource);
                }
                if (zK) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i13 |= i16;
            }
            i17 = i12 & 16;
            if (i17 != 0) {
                if ((i11 & 24576) == 0) {
                    pVar2 = pVar;
                    if (lVarV.K(pVar2)) {
                        i18 = 16384;
                    } else {
                        i18 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i18;
                }
                i19 = i12 & 32;
                if (i19 != 0) {
                    i13 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    if (lVarV.K(qVar)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                if ((i12 & 64) != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (lVarV.K(body)) {
                        i22 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i22 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i22;
                }
                if ((i12 & 128) != 0) {
                    i13 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    if (lVarV.K(footer)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i13 |= i23;
                }
                i24 = i12 & 256;
                if (i24 != 0) {
                    if ((i11 & 100663296) == 0) {
                        if (lVarV.K(aVar)) {
                            i25 = 67108864;
                        } else {
                            i25 = 33554432;
                        }
                        i13 |= i25;
                    }
                    if ((i11 & 805306368) != 0) {
                        i13 |= ((i12 & 512) == 0 || !lVarV.n(pair)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i31 != 0) {
                                jI = k3.p1.INSTANCE.i();
                            }
                            if (i14 != 0) {
                                str2 = null;
                            }
                            if (i17 != 0) {
                                pVar2 = null;
                            }
                            if (i19 != 0) {
                                qVar2 = null;
                            } else {
                                qVar2 = qVar;
                            }
                            if (i24 != 0) {
                                aVar2 = null;
                            } else {
                                aVar2 = aVar;
                            }
                            if ((i12 & 512) != 0) {
                                pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                                i13 &= -1879048193;
                                qVar2 = qVar2;
                            } else {
                                pair2 = pair;
                            }
                            j12 = jI;
                            aVar3 = aVar2;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i31 != 0) {
                                jI = k3.p1.INSTANCE.i();
                            }
                            if (i14 != 0) {
                                str2 = null;
                            }
                            if (i17 != 0) {
                                pVar2 = null;
                            }
                            if (i19 != 0) {
                                qVar2 = null;
                            } else {
                                qVar2 = qVar;
                            }
                            if (i24 != 0) {
                                aVar2 = null;
                            } else {
                                aVar2 = aVar;
                            }
                            if ((i12 & 512) != 0) {
                                pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                                i13 &= -1879048193;
                                qVar2 = qVar2;
                            } else {
                                pair2 = pair;
                            }
                            j12 = jI;
                            aVar3 = aVar2;
                        }
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(72921645, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerOverlayScaffold (VisionScannerOverlayScaffold.kt:54)");
                        }
                        lVarV.o(-1858078478);
                        objI = lVarV.I();
                        if (objI == p020r2.l.INSTANCE.a()) {
                            objI = new wn0.l() { // from class: com.fourthline.orca.internal.vq0
                                @Override // wn0.l
                                public final Object invoke(Object obj) {
                                    return UD.a((g4.y) obj);
                                }
                            };
                            lVarV.B(objI);
                        }
                        lVarV.l();
                        i26 = i13;
                        androidx.compose.ui.d dVarD8 = androidx.compose.foundation.b.d(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), j12, null, 2, null);
                        companion = d3.c.INSTANCE;
                        z3.i0 i0VarH119 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                        iA = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC1116 = lVarV.c();
                        androidx.compose.ui.d dVarE1116 = androidx.compose.ui.c.e(lVarV, dVarD8);
                        companion2 = b4.g.INSTANCE;
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
                        Pair pair15 = pair2;
                        p020r2.d4.b(lVarA, i0VarH119, companion2.c());
                        p020r2.d4.b(lVarA, xVarC1116, companion2.e());
                        pVarB = companion2.b();
                        if (lVarA.getInserting()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        p020r2.d4.b(lVarA, dVarE1116, companion2.d());
                        androidx.compose.foundation.layout.i iVar8 = androidx.compose.foundation.layout.i.f4585a;
                        lVarV.o(-1038937986);
                        if (pVar2 != null) {
                            pVar2.invoke(lVarV, Integer.valueOf((i26 >> 12) & 14));
                            jn0.h0 h0Var112 = jn0.h0.f84049a;
                        }
                        lVarV.l();
                        lVarV.o(-1038935796);
                        if (aVar3 == null) {
                            i27 = 1;
                        } else {
                            androidx.compose.ui.d.Companion companion17 = androidx.compose.ui.d.INSTANCE;
                            androidx.compose.ui.d dVarM15 = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.h(companion17, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                            z3.i0 i0VarH1110 = androidx.compose.foundation.layout.g.h(companion.n(), false);
                            iA2 = p020r2.j.a(lVarV, 0);
                            p020r2.x xVarC1117 = lVarV.c();
                            androidx.compose.ui.d dVarE1117 = androidx.compose.ui.c.e(lVarV, dVarM15);
                            aVarA2 = companion2.a();
                            if (lVarV.w() == null) {
                                p020r2.j.c();
                            }
                            lVarV.h();
                            if (lVarV.getInserting()) {
                                lVarV.z(aVarA2);
                            } else {
                                lVarV.d();
                            }
                            lVarA2 = p020r2.d4.a(lVarV);
                            p020r2.d4.b(lVarA2, i0VarH1110, companion2.c());
                            p020r2.d4.b(lVarA2, xVarC1117, companion2.e());
                            pVarB2 = companion2.b();
                            if (lVarA2.getInserting()) {
                                lVarA2.B(Integer.valueOf(iA2));
                                lVarA2.f(Integer.valueOf(iA2), pVarB2);
                            } else {
                                lVarA2.B(Integer.valueOf(iA2));
                                lVarA2.f(Integer.valueOf(iA2), pVarB2);
                            }
                            p020r2.d4.b(lVarA2, dVarE1117, companion2.d());
                            i27 = 1;
                            C4670d1.a(aVar3, AbstractC3307gk.a(AbstractC3307gk.a(AbstractC3307gk.a(companion17, "closeButton", (String) null, 2, (Object) null), 199.0f), RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close_acessibility, 0, 2, null), lVarV, 0), false, 2, (Object) null), false, null, z2.c.e(1519979611, true, new a(closeImageSource), lVarV, 54), lVarV, 24576, 12);
                            lVarV.g();
                            jn0.h0 h0Var113 = jn0.h0.f84049a;
                        }
                        lVarV.l();
                        lVarV.o(-1038906739);
                        if (str2 != null) {
                            float f18 = 32;
                            str3 = str2;
                            Zg.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, w4.h.g(f18), w4.h.g(f18), w4.h.g(48), BitmapDescriptorFactory.HUE_RED, 8, null), BitmapDescriptorFactory.HUE_RED, i27, null), str3, null, k3.p1.INSTANCE.k(), null, null, lVarV, ((i26 >> 3) & 112) | 3072, 52);
                        } else {
                            str3 = str2;
                        }
                        lVarV.l();
                        if (qVar2 != null) {
                            i28 = 80;
                        } else {
                            i28 = 156;
                        }
                        androidx.compose.ui.d dVarM16 = androidx.compose.foundation.layout.t.m(v1.p0.c(dVar2, v1.s0.d(v1.m0.INSTANCE, lVarV, 6)), BitmapDescriptorFactory.HUE_RED, w4.h.g(i28), BitmapDescriptorFactory.HUE_RED, C3825sp.f35377a.c(lVarV, 6).f(), 5, null);
                        z3.i0 i0VarA8 = v1.g.a(v1.b.f117444a.g(), companion.g(), lVarV, 48);
                        iA3 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC1118 = lVarV.c();
                        androidx.compose.ui.d dVarE1118 = androidx.compose.ui.c.e(lVarV, dVarM16);
                        aVarA3 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA3);
                        } else {
                            lVarV.d();
                        }
                        lVarA3 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA3, i0VarA8, companion2.c());
                        p020r2.d4.b(lVarA3, xVarC1118, companion2.e());
                        pVarB3 = companion2.b();
                        if (lVarA3.getInserting()) {
                            lVarA3.B(Integer.valueOf(iA3));
                            lVarA3.f(Integer.valueOf(iA3), pVarB3);
                        } else {
                            lVarA3.B(Integer.valueOf(iA3));
                            lVarA3.f(Integer.valueOf(iA3), pVarB3);
                        }
                        p020r2.d4.b(lVarA3, dVarE1118, companion2.d());
                        jVar = v1.j.f117505a;
                        lVarV.o(915714536);
                        if (qVar2 != null) {
                            qVar2.invoke(jVar, lVarV, Integer.valueOf(((i26 >> 12) & 112) | 6));
                            jn0.h0 h0Var114 = jn0.h0.f84049a;
                        }
                        lVarV.l();
                        androidx.compose.ui.d.Companion companion18 = androidx.compose.ui.d.INSTANCE;
                        androidx.compose.ui.d dVarB15 = v1.i.b(jVar, companion18, ((Number) pair15.e()).floatValue(), false, 2, null);
                        z3.i0 i0VarH1111 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                        iA4 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC1119 = lVarV.c();
                        androidx.compose.ui.d dVarE1119 = androidx.compose.ui.c.e(lVarV, dVarB15);
                        aVarA4 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA4);
                        } else {
                            lVarV.d();
                        }
                        lVarA4 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA4, i0VarH1111, companion2.c());
                        p020r2.d4.b(lVarA4, xVarC1119, companion2.e());
                        pVarB4 = companion2.b();
                        if (lVarA4.getInserting()) {
                            lVarA4.B(Integer.valueOf(iA4));
                            lVarA4.f(Integer.valueOf(iA4), pVarB4);
                        } else {
                            lVarA4.B(Integer.valueOf(iA4));
                            lVarA4.f(Integer.valueOf(iA4), pVarB4);
                        }
                        p020r2.d4.b(lVarA4, dVarE1119, companion2.d());
                        body.invoke(lVarV, Integer.valueOf((i26 >> 18) & 14));
                        lVarV.g();
                        androidx.compose.ui.d dVarB16 = v1.i.b(jVar, companion18, ((Number) pair15.f()).floatValue(), false, 2, null);
                        z3.i0 i0VarH1112 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                        iA5 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC11110 = lVarV.c();
                        androidx.compose.ui.d dVarE11110 = androidx.compose.ui.c.e(lVarV, dVarB16);
                        aVarA5 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA5);
                        } else {
                            lVarV.d();
                        }
                        lVarA5 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA5, i0VarH1112, companion2.c());
                        p020r2.d4.b(lVarA5, xVarC11110, companion2.e());
                        pVarB5 = companion2.b();
                        if (lVarA5.getInserting()) {
                            lVarA5.B(Integer.valueOf(iA5));
                            lVarA5.f(Integer.valueOf(iA5), pVarB5);
                        } else {
                            lVarA5.B(Integer.valueOf(iA5));
                            lVarA5.f(Integer.valueOf(iA5), pVarB5);
                        }
                        p020r2.d4.b(lVarA5, dVarE11110, companion2.d());
                        footer.invoke(lVarV, Integer.valueOf((i26 >> 21) & 14));
                        lVarV.g();
                        lVarV.g();
                        lVarV.g();
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        pVar3 = pVar2;
                        qVar3 = qVar2;
                        aVar4 = aVar3;
                        str2 = str3;
                        j13 = j12;
                        pair3 = pair15;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i31 != 0) {
                                jI = k3.p1.INSTANCE.i();
                            }
                            if (i14 != 0) {
                                str2 = null;
                            }
                            if (i17 != 0) {
                                pVar2 = null;
                            }
                            if (i19 != 0) {
                                qVar2 = null;
                            } else {
                                qVar2 = qVar;
                            }
                            if (i24 != 0) {
                                aVar2 = null;
                            } else {
                                aVar2 = aVar;
                            }
                            if ((i12 & 512) != 0) {
                                pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                                i13 &= -1879048193;
                                qVar2 = qVar2;
                            } else {
                                pair2 = pair;
                            }
                            j12 = jI;
                            aVar3 = aVar2;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i31 != 0) {
                                jI = k3.p1.INSTANCE.i();
                            }
                            if (i14 != 0) {
                                str2 = null;
                            }
                            if (i17 != 0) {
                                pVar2 = null;
                            }
                            if (i19 != 0) {
                                qVar2 = null;
                            } else {
                                qVar2 = qVar;
                            }
                            if (i24 != 0) {
                                aVar2 = null;
                            } else {
                                aVar2 = aVar;
                            }
                            if ((i12 & 512) != 0) {
                                pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                                i13 &= -1879048193;
                                qVar2 = qVar2;
                            } else {
                                pair2 = pair;
                            }
                            j12 = jI;
                            aVar3 = aVar2;
                        }
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(72921645, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerOverlayScaffold (VisionScannerOverlayScaffold.kt:54)");
                        }
                        lVarV.o(-1858078478);
                        objI = lVarV.I();
                        if (objI == p020r2.l.INSTANCE.a()) {
                            objI = new wn0.l() { // from class: com.fourthline.orca.internal.vq0
                                @Override // wn0.l
                                public final Object invoke(Object obj) {
                                    return UD.a((g4.y) obj);
                                }
                            };
                            lVarV.B(objI);
                        }
                        lVarV.l();
                        i26 = i13;
                        androidx.compose.ui.d dVarD9 = androidx.compose.foundation.b.d(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), j12, null, 2, null);
                        companion = d3.c.INSTANCE;
                        z3.i0 i0VarH1113 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                        iA = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC11111 = lVarV.c();
                        androidx.compose.ui.d dVarE11111 = androidx.compose.ui.c.e(lVarV, dVarD9);
                        companion2 = b4.g.INSTANCE;
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
                        Pair pair16 = pair2;
                        p020r2.d4.b(lVarA, i0VarH1113, companion2.c());
                        p020r2.d4.b(lVarA, xVarC11111, companion2.e());
                        pVarB = companion2.b();
                        if (lVarA.getInserting()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        p020r2.d4.b(lVarA, dVarE11111, companion2.d());
                        androidx.compose.foundation.layout.i iVar9 = androidx.compose.foundation.layout.i.f4585a;
                        lVarV.o(-1038937986);
                        if (pVar2 != null) {
                            pVar2.invoke(lVarV, Integer.valueOf((i26 >> 12) & 14));
                            jn0.h0 h0Var115 = jn0.h0.f84049a;
                        }
                        lVarV.l();
                        lVarV.o(-1038935796);
                        if (aVar3 == null) {
                            i27 = 1;
                        } else {
                            androidx.compose.ui.d.Companion companion19 = androidx.compose.ui.d.INSTANCE;
                            androidx.compose.ui.d dVarM17 = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.h(companion19, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                            z3.i0 i0VarH1114 = androidx.compose.foundation.layout.g.h(companion.n(), false);
                            iA2 = p020r2.j.a(lVarV, 0);
                            p020r2.x xVarC11112 = lVarV.c();
                            androidx.compose.ui.d dVarE11112 = androidx.compose.ui.c.e(lVarV, dVarM17);
                            aVarA2 = companion2.a();
                            if (lVarV.w() == null) {
                                p020r2.j.c();
                            }
                            lVarV.h();
                            if (lVarV.getInserting()) {
                                lVarV.z(aVarA2);
                            } else {
                                lVarV.d();
                            }
                            lVarA2 = p020r2.d4.a(lVarV);
                            p020r2.d4.b(lVarA2, i0VarH1114, companion2.c());
                            p020r2.d4.b(lVarA2, xVarC11112, companion2.e());
                            pVarB2 = companion2.b();
                            if (lVarA2.getInserting()) {
                                lVarA2.B(Integer.valueOf(iA2));
                                lVarA2.f(Integer.valueOf(iA2), pVarB2);
                            } else {
                                lVarA2.B(Integer.valueOf(iA2));
                                lVarA2.f(Integer.valueOf(iA2), pVarB2);
                            }
                            p020r2.d4.b(lVarA2, dVarE11112, companion2.d());
                            i27 = 1;
                            C4670d1.a(aVar3, AbstractC3307gk.a(AbstractC3307gk.a(AbstractC3307gk.a(companion19, "closeButton", (String) null, 2, (Object) null), 199.0f), RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close_acessibility, 0, 2, null), lVarV, 0), false, 2, (Object) null), false, null, z2.c.e(1519979611, true, new a(closeImageSource), lVarV, 54), lVarV, 24576, 12);
                            lVarV.g();
                            jn0.h0 h0Var116 = jn0.h0.f84049a;
                        }
                        lVarV.l();
                        lVarV.o(-1038906739);
                        if (str2 != null) {
                            float f19 = 32;
                            str3 = str2;
                            Zg.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, w4.h.g(f19), w4.h.g(f19), w4.h.g(48), BitmapDescriptorFactory.HUE_RED, 8, null), BitmapDescriptorFactory.HUE_RED, i27, null), str3, null, k3.p1.INSTANCE.k(), null, null, lVarV, ((i26 >> 3) & 112) | 3072, 52);
                        } else {
                            str3 = str2;
                        }
                        lVarV.l();
                        if (qVar2 != null) {
                            i28 = 80;
                        } else {
                            i28 = 156;
                        }
                        androidx.compose.ui.d dVarM18 = androidx.compose.foundation.layout.t.m(v1.p0.c(dVar2, v1.s0.d(v1.m0.INSTANCE, lVarV, 6)), BitmapDescriptorFactory.HUE_RED, w4.h.g(i28), BitmapDescriptorFactory.HUE_RED, C3825sp.f35377a.c(lVarV, 6).f(), 5, null);
                        z3.i0 i0VarA9 = v1.g.a(v1.b.f117444a.g(), companion.g(), lVarV, 48);
                        iA3 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC11113 = lVarV.c();
                        androidx.compose.ui.d dVarE11113 = androidx.compose.ui.c.e(lVarV, dVarM18);
                        aVarA3 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA3);
                        } else {
                            lVarV.d();
                        }
                        lVarA3 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA3, i0VarA9, companion2.c());
                        p020r2.d4.b(lVarA3, xVarC11113, companion2.e());
                        pVarB3 = companion2.b();
                        if (lVarA3.getInserting()) {
                            lVarA3.B(Integer.valueOf(iA3));
                            lVarA3.f(Integer.valueOf(iA3), pVarB3);
                        } else {
                            lVarA3.B(Integer.valueOf(iA3));
                            lVarA3.f(Integer.valueOf(iA3), pVarB3);
                        }
                        p020r2.d4.b(lVarA3, dVarE11113, companion2.d());
                        jVar = v1.j.f117505a;
                        lVarV.o(915714536);
                        if (qVar2 != null) {
                            qVar2.invoke(jVar, lVarV, Integer.valueOf(((i26 >> 12) & 112) | 6));
                            jn0.h0 h0Var117 = jn0.h0.f84049a;
                        }
                        lVarV.l();
                        androidx.compose.ui.d.Companion companion110 = androidx.compose.ui.d.INSTANCE;
                        androidx.compose.ui.d dVarB17 = v1.i.b(jVar, companion110, ((Number) pair16.e()).floatValue(), false, 2, null);
                        z3.i0 i0VarH1115 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                        iA4 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC11114 = lVarV.c();
                        androidx.compose.ui.d dVarE11114 = androidx.compose.ui.c.e(lVarV, dVarB17);
                        aVarA4 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA4);
                        } else {
                            lVarV.d();
                        }
                        lVarA4 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA4, i0VarH1115, companion2.c());
                        p020r2.d4.b(lVarA4, xVarC11114, companion2.e());
                        pVarB4 = companion2.b();
                        if (lVarA4.getInserting()) {
                            lVarA4.B(Integer.valueOf(iA4));
                            lVarA4.f(Integer.valueOf(iA4), pVarB4);
                        } else {
                            lVarA4.B(Integer.valueOf(iA4));
                            lVarA4.f(Integer.valueOf(iA4), pVarB4);
                        }
                        p020r2.d4.b(lVarA4, dVarE11114, companion2.d());
                        body.invoke(lVarV, Integer.valueOf((i26 >> 18) & 14));
                        lVarV.g();
                        androidx.compose.ui.d dVarB18 = v1.i.b(jVar, companion110, ((Number) pair16.f()).floatValue(), false, 2, null);
                        z3.i0 i0VarH1116 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                        iA5 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC11115 = lVarV.c();
                        androidx.compose.ui.d dVarE11115 = androidx.compose.ui.c.e(lVarV, dVarB18);
                        aVarA5 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA5);
                        } else {
                            lVarV.d();
                        }
                        lVarA5 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA5, i0VarH1116, companion2.c());
                        p020r2.d4.b(lVarA5, xVarC11115, companion2.e());
                        pVarB5 = companion2.b();
                        if (lVarA5.getInserting()) {
                            lVarA5.B(Integer.valueOf(iA5));
                            lVarA5.f(Integer.valueOf(iA5), pVarB5);
                        } else {
                            lVarA5.B(Integer.valueOf(iA5));
                            lVarA5.f(Integer.valueOf(iA5), pVarB5);
                        }
                        p020r2.d4.b(lVarA5, dVarE11115, companion2.d());
                        footer.invoke(lVarV, Integer.valueOf((i26 >> 21) & 14));
                        lVarV.g();
                        lVarV.g();
                        lVarV.g();
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        pVar3 = pVar2;
                        qVar3 = qVar2;
                        aVar4 = aVar3;
                        str2 = str3;
                        j13 = j12;
                        pair3 = pair16;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        final androidx.compose.ui.d dVar7 = dVar2;
                        final String str8 = str2;
                        final Pair pair17 = pair3;
                        w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.wq0
                            @Override // wn0.p
                            public final Object invoke(Object obj, Object obj2) {
                                return UD.a(dVar7, j13, str8, closeImageSource, pVar3, qVar3, body, footer, aVar4, pair17, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 100663296;
                if ((i11 & 805306368) != 0) {
                    i13 |= ((i12 & 512) == 0 || !lVarV.n(pair)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                if ((i13 & 306783379) == 306783378) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i31 != 0) {
                            jI = k3.p1.INSTANCE.i();
                        }
                        if (i14 != 0) {
                            str2 = null;
                        }
                        if (i17 != 0) {
                            pVar2 = null;
                        }
                        if (i19 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        if (i24 != 0) {
                            aVar2 = null;
                        } else {
                            aVar2 = aVar;
                        }
                        if ((i12 & 512) != 0) {
                            pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                            i13 &= -1879048193;
                            qVar2 = qVar2;
                        } else {
                            pair2 = pair;
                        }
                        j12 = jI;
                        aVar3 = aVar2;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i31 != 0) {
                            jI = k3.p1.INSTANCE.i();
                        }
                        if (i14 != 0) {
                            str2 = null;
                        }
                        if (i17 != 0) {
                            pVar2 = null;
                        }
                        if (i19 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        if (i24 != 0) {
                            aVar2 = null;
                        } else {
                            aVar2 = aVar;
                        }
                        if ((i12 & 512) != 0) {
                            pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                            i13 &= -1879048193;
                            qVar2 = qVar2;
                        } else {
                            pair2 = pair;
                        }
                        j12 = jI;
                        aVar3 = aVar2;
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(72921645, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerOverlayScaffold (VisionScannerOverlayScaffold.kt:54)");
                    }
                    lVarV.o(-1858078478);
                    objI = lVarV.I();
                    if (objI == p020r2.l.INSTANCE.a()) {
                        objI = new wn0.l() { // from class: com.fourthline.orca.internal.vq0
                            @Override // wn0.l
                            public final Object invoke(Object obj) {
                                return UD.a((g4.y) obj);
                            }
                        };
                        lVarV.B(objI);
                    }
                    lVarV.l();
                    i26 = i13;
                    androidx.compose.ui.d dVarD10 = androidx.compose.foundation.b.d(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), j12, null, 2, null);
                    companion = d3.c.INSTANCE;
                    z3.i0 i0VarH1117 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                    iA = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC11116 = lVarV.c();
                    androidx.compose.ui.d dVarE11116 = androidx.compose.ui.c.e(lVarV, dVarD10);
                    companion2 = b4.g.INSTANCE;
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
                    Pair pair18 = pair2;
                    p020r2.d4.b(lVarA, i0VarH1117, companion2.c());
                    p020r2.d4.b(lVarA, xVarC11116, companion2.e());
                    pVarB = companion2.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    p020r2.d4.b(lVarA, dVarE11116, companion2.d());
                    androidx.compose.foundation.layout.i iVar10 = androidx.compose.foundation.layout.i.f4585a;
                    lVarV.o(-1038937986);
                    if (pVar2 != null) {
                        pVar2.invoke(lVarV, Integer.valueOf((i26 >> 12) & 14));
                        jn0.h0 h0Var118 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    lVarV.o(-1038935796);
                    if (aVar3 == null) {
                        i27 = 1;
                    } else {
                        androidx.compose.ui.d.Companion companion111 = androidx.compose.ui.d.INSTANCE;
                        androidx.compose.ui.d dVarM19 = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.h(companion111, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                        z3.i0 i0VarH1118 = androidx.compose.foundation.layout.g.h(companion.n(), false);
                        iA2 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC11117 = lVarV.c();
                        androidx.compose.ui.d dVarE11117 = androidx.compose.ui.c.e(lVarV, dVarM19);
                        aVarA2 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA2);
                        } else {
                            lVarV.d();
                        }
                        lVarA2 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA2, i0VarH1118, companion2.c());
                        p020r2.d4.b(lVarA2, xVarC11117, companion2.e());
                        pVarB2 = companion2.b();
                        if (lVarA2.getInserting()) {
                            lVarA2.B(Integer.valueOf(iA2));
                            lVarA2.f(Integer.valueOf(iA2), pVarB2);
                        } else {
                            lVarA2.B(Integer.valueOf(iA2));
                            lVarA2.f(Integer.valueOf(iA2), pVarB2);
                        }
                        p020r2.d4.b(lVarA2, dVarE11117, companion2.d());
                        i27 = 1;
                        C4670d1.a(aVar3, AbstractC3307gk.a(AbstractC3307gk.a(AbstractC3307gk.a(companion111, "closeButton", (String) null, 2, (Object) null), 199.0f), RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close_acessibility, 0, 2, null), lVarV, 0), false, 2, (Object) null), false, null, z2.c.e(1519979611, true, new a(closeImageSource), lVarV, 54), lVarV, 24576, 12);
                        lVarV.g();
                        jn0.h0 h0Var119 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    lVarV.o(-1038906739);
                    if (str2 != null) {
                        float f110 = 32;
                        str3 = str2;
                        Zg.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, w4.h.g(f110), w4.h.g(f110), w4.h.g(48), BitmapDescriptorFactory.HUE_RED, 8, null), BitmapDescriptorFactory.HUE_RED, i27, null), str3, null, k3.p1.INSTANCE.k(), null, null, lVarV, ((i26 >> 3) & 112) | 3072, 52);
                    } else {
                        str3 = str2;
                    }
                    lVarV.l();
                    if (qVar2 != null) {
                        i28 = 80;
                    } else {
                        i28 = 156;
                    }
                    androidx.compose.ui.d dVarM110 = androidx.compose.foundation.layout.t.m(v1.p0.c(dVar2, v1.s0.d(v1.m0.INSTANCE, lVarV, 6)), BitmapDescriptorFactory.HUE_RED, w4.h.g(i28), BitmapDescriptorFactory.HUE_RED, C3825sp.f35377a.c(lVarV, 6).f(), 5, null);
                    z3.i0 i0VarA10 = v1.g.a(v1.b.f117444a.g(), companion.g(), lVarV, 48);
                    iA3 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC11118 = lVarV.c();
                    androidx.compose.ui.d dVarE11118 = androidx.compose.ui.c.e(lVarV, dVarM110);
                    aVarA3 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA3);
                    } else {
                        lVarV.d();
                    }
                    lVarA3 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA3, i0VarA10, companion2.c());
                    p020r2.d4.b(lVarA3, xVarC11118, companion2.e());
                    pVarB3 = companion2.b();
                    if (lVarA3.getInserting()) {
                        lVarA3.B(Integer.valueOf(iA3));
                        lVarA3.f(Integer.valueOf(iA3), pVarB3);
                    } else {
                        lVarA3.B(Integer.valueOf(iA3));
                        lVarA3.f(Integer.valueOf(iA3), pVarB3);
                    }
                    p020r2.d4.b(lVarA3, dVarE11118, companion2.d());
                    jVar = v1.j.f117505a;
                    lVarV.o(915714536);
                    if (qVar2 != null) {
                        qVar2.invoke(jVar, lVarV, Integer.valueOf(((i26 >> 12) & 112) | 6));
                        jn0.h0 h0Var1110 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    androidx.compose.ui.d.Companion companion112 = androidx.compose.ui.d.INSTANCE;
                    androidx.compose.ui.d dVarB19 = v1.i.b(jVar, companion112, ((Number) pair18.e()).floatValue(), false, 2, null);
                    z3.i0 i0VarH1119 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                    iA4 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC11119 = lVarV.c();
                    androidx.compose.ui.d dVarE11119 = androidx.compose.ui.c.e(lVarV, dVarB19);
                    aVarA4 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA4);
                    } else {
                        lVarV.d();
                    }
                    lVarA4 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA4, i0VarH1119, companion2.c());
                    p020r2.d4.b(lVarA4, xVarC11119, companion2.e());
                    pVarB4 = companion2.b();
                    if (lVarA4.getInserting()) {
                        lVarA4.B(Integer.valueOf(iA4));
                        lVarA4.f(Integer.valueOf(iA4), pVarB4);
                    } else {
                        lVarA4.B(Integer.valueOf(iA4));
                        lVarA4.f(Integer.valueOf(iA4), pVarB4);
                    }
                    p020r2.d4.b(lVarA4, dVarE11119, companion2.d());
                    body.invoke(lVarV, Integer.valueOf((i26 >> 18) & 14));
                    lVarV.g();
                    androidx.compose.ui.d dVarB110 = v1.i.b(jVar, companion112, ((Number) pair18.f()).floatValue(), false, 2, null);
                    z3.i0 i0VarH11110 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                    iA5 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC111110 = lVarV.c();
                    androidx.compose.ui.d dVarE111110 = androidx.compose.ui.c.e(lVarV, dVarB110);
                    aVarA5 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA5);
                    } else {
                        lVarV.d();
                    }
                    lVarA5 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA5, i0VarH11110, companion2.c());
                    p020r2.d4.b(lVarA5, xVarC111110, companion2.e());
                    pVarB5 = companion2.b();
                    if (lVarA5.getInserting()) {
                        lVarA5.B(Integer.valueOf(iA5));
                        lVarA5.f(Integer.valueOf(iA5), pVarB5);
                    } else {
                        lVarA5.B(Integer.valueOf(iA5));
                        lVarA5.f(Integer.valueOf(iA5), pVarB5);
                    }
                    p020r2.d4.b(lVarA5, dVarE111110, companion2.d());
                    footer.invoke(lVarV, Integer.valueOf((i26 >> 21) & 14));
                    lVarV.g();
                    lVarV.g();
                    lVarV.g();
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    pVar3 = pVar2;
                    qVar3 = qVar2;
                    aVar4 = aVar3;
                    str2 = str3;
                    j13 = j12;
                    pair3 = pair18;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i31 != 0) {
                            jI = k3.p1.INSTANCE.i();
                        }
                        if (i14 != 0) {
                            str2 = null;
                        }
                        if (i17 != 0) {
                            pVar2 = null;
                        }
                        if (i19 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        if (i24 != 0) {
                            aVar2 = null;
                        } else {
                            aVar2 = aVar;
                        }
                        if ((i12 & 512) != 0) {
                            pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                            i13 &= -1879048193;
                            qVar2 = qVar2;
                        } else {
                            pair2 = pair;
                        }
                        j12 = jI;
                        aVar3 = aVar2;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i31 != 0) {
                            jI = k3.p1.INSTANCE.i();
                        }
                        if (i14 != 0) {
                            str2 = null;
                        }
                        if (i17 != 0) {
                            pVar2 = null;
                        }
                        if (i19 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        if (i24 != 0) {
                            aVar2 = null;
                        } else {
                            aVar2 = aVar;
                        }
                        if ((i12 & 512) != 0) {
                            pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                            i13 &= -1879048193;
                            qVar2 = qVar2;
                        } else {
                            pair2 = pair;
                        }
                        j12 = jI;
                        aVar3 = aVar2;
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(72921645, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerOverlayScaffold (VisionScannerOverlayScaffold.kt:54)");
                    }
                    lVarV.o(-1858078478);
                    objI = lVarV.I();
                    if (objI == p020r2.l.INSTANCE.a()) {
                        objI = new wn0.l() { // from class: com.fourthline.orca.internal.vq0
                            @Override // wn0.l
                            public final Object invoke(Object obj) {
                                return UD.a((g4.y) obj);
                            }
                        };
                        lVarV.B(objI);
                    }
                    lVarV.l();
                    i26 = i13;
                    androidx.compose.ui.d dVarD11 = androidx.compose.foundation.b.d(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), j12, null, 2, null);
                    companion = d3.c.INSTANCE;
                    z3.i0 i0VarH11111 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                    iA = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC111111 = lVarV.c();
                    androidx.compose.ui.d dVarE111111 = androidx.compose.ui.c.e(lVarV, dVarD11);
                    companion2 = b4.g.INSTANCE;
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
                    Pair pair19 = pair2;
                    p020r2.d4.b(lVarA, i0VarH11111, companion2.c());
                    p020r2.d4.b(lVarA, xVarC111111, companion2.e());
                    pVarB = companion2.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    p020r2.d4.b(lVarA, dVarE111111, companion2.d());
                    androidx.compose.foundation.layout.i iVar11 = androidx.compose.foundation.layout.i.f4585a;
                    lVarV.o(-1038937986);
                    if (pVar2 != null) {
                        pVar2.invoke(lVarV, Integer.valueOf((i26 >> 12) & 14));
                        jn0.h0 h0Var1111 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    lVarV.o(-1038935796);
                    if (aVar3 == null) {
                        i27 = 1;
                    } else {
                        androidx.compose.ui.d.Companion companion113 = androidx.compose.ui.d.INSTANCE;
                        androidx.compose.ui.d dVarM111 = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.h(companion113, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                        z3.i0 i0VarH11112 = androidx.compose.foundation.layout.g.h(companion.n(), false);
                        iA2 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC111112 = lVarV.c();
                        androidx.compose.ui.d dVarE111112 = androidx.compose.ui.c.e(lVarV, dVarM111);
                        aVarA2 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA2);
                        } else {
                            lVarV.d();
                        }
                        lVarA2 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA2, i0VarH11112, companion2.c());
                        p020r2.d4.b(lVarA2, xVarC111112, companion2.e());
                        pVarB2 = companion2.b();
                        if (lVarA2.getInserting()) {
                            lVarA2.B(Integer.valueOf(iA2));
                            lVarA2.f(Integer.valueOf(iA2), pVarB2);
                        } else {
                            lVarA2.B(Integer.valueOf(iA2));
                            lVarA2.f(Integer.valueOf(iA2), pVarB2);
                        }
                        p020r2.d4.b(lVarA2, dVarE111112, companion2.d());
                        i27 = 1;
                        C4670d1.a(aVar3, AbstractC3307gk.a(AbstractC3307gk.a(AbstractC3307gk.a(companion113, "closeButton", (String) null, 2, (Object) null), 199.0f), RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close_acessibility, 0, 2, null), lVarV, 0), false, 2, (Object) null), false, null, z2.c.e(1519979611, true, new a(closeImageSource), lVarV, 54), lVarV, 24576, 12);
                        lVarV.g();
                        jn0.h0 h0Var1112 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    lVarV.o(-1038906739);
                    if (str2 != null) {
                        float f111 = 32;
                        str3 = str2;
                        Zg.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, w4.h.g(f111), w4.h.g(f111), w4.h.g(48), BitmapDescriptorFactory.HUE_RED, 8, null), BitmapDescriptorFactory.HUE_RED, i27, null), str3, null, k3.p1.INSTANCE.k(), null, null, lVarV, ((i26 >> 3) & 112) | 3072, 52);
                    } else {
                        str3 = str2;
                    }
                    lVarV.l();
                    if (qVar2 != null) {
                        i28 = 80;
                    } else {
                        i28 = 156;
                    }
                    androidx.compose.ui.d dVarM112 = androidx.compose.foundation.layout.t.m(v1.p0.c(dVar2, v1.s0.d(v1.m0.INSTANCE, lVarV, 6)), BitmapDescriptorFactory.HUE_RED, w4.h.g(i28), BitmapDescriptorFactory.HUE_RED, C3825sp.f35377a.c(lVarV, 6).f(), 5, null);
                    z3.i0 i0VarA11 = v1.g.a(v1.b.f117444a.g(), companion.g(), lVarV, 48);
                    iA3 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC111113 = lVarV.c();
                    androidx.compose.ui.d dVarE111113 = androidx.compose.ui.c.e(lVarV, dVarM112);
                    aVarA3 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA3);
                    } else {
                        lVarV.d();
                    }
                    lVarA3 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA3, i0VarA11, companion2.c());
                    p020r2.d4.b(lVarA3, xVarC111113, companion2.e());
                    pVarB3 = companion2.b();
                    if (lVarA3.getInserting()) {
                        lVarA3.B(Integer.valueOf(iA3));
                        lVarA3.f(Integer.valueOf(iA3), pVarB3);
                    } else {
                        lVarA3.B(Integer.valueOf(iA3));
                        lVarA3.f(Integer.valueOf(iA3), pVarB3);
                    }
                    p020r2.d4.b(lVarA3, dVarE111113, companion2.d());
                    jVar = v1.j.f117505a;
                    lVarV.o(915714536);
                    if (qVar2 != null) {
                        qVar2.invoke(jVar, lVarV, Integer.valueOf(((i26 >> 12) & 112) | 6));
                        jn0.h0 h0Var1113 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    androidx.compose.ui.d.Companion companion114 = androidx.compose.ui.d.INSTANCE;
                    androidx.compose.ui.d dVarB111 = v1.i.b(jVar, companion114, ((Number) pair19.e()).floatValue(), false, 2, null);
                    z3.i0 i0VarH11113 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                    iA4 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC111114 = lVarV.c();
                    androidx.compose.ui.d dVarE111114 = androidx.compose.ui.c.e(lVarV, dVarB111);
                    aVarA4 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA4);
                    } else {
                        lVarV.d();
                    }
                    lVarA4 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA4, i0VarH11113, companion2.c());
                    p020r2.d4.b(lVarA4, xVarC111114, companion2.e());
                    pVarB4 = companion2.b();
                    if (lVarA4.getInserting()) {
                        lVarA4.B(Integer.valueOf(iA4));
                        lVarA4.f(Integer.valueOf(iA4), pVarB4);
                    } else {
                        lVarA4.B(Integer.valueOf(iA4));
                        lVarA4.f(Integer.valueOf(iA4), pVarB4);
                    }
                    p020r2.d4.b(lVarA4, dVarE111114, companion2.d());
                    body.invoke(lVarV, Integer.valueOf((i26 >> 18) & 14));
                    lVarV.g();
                    androidx.compose.ui.d dVarB112 = v1.i.b(jVar, companion114, ((Number) pair19.f()).floatValue(), false, 2, null);
                    z3.i0 i0VarH11114 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                    iA5 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC111115 = lVarV.c();
                    androidx.compose.ui.d dVarE111115 = androidx.compose.ui.c.e(lVarV, dVarB112);
                    aVarA5 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA5);
                    } else {
                        lVarV.d();
                    }
                    lVarA5 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA5, i0VarH11114, companion2.c());
                    p020r2.d4.b(lVarA5, xVarC111115, companion2.e());
                    pVarB5 = companion2.b();
                    if (lVarA5.getInserting()) {
                        lVarA5.B(Integer.valueOf(iA5));
                        lVarA5.f(Integer.valueOf(iA5), pVarB5);
                    } else {
                        lVarA5.B(Integer.valueOf(iA5));
                        lVarA5.f(Integer.valueOf(iA5), pVarB5);
                    }
                    p020r2.d4.b(lVarA5, dVarE111115, companion2.d());
                    footer.invoke(lVarV, Integer.valueOf((i26 >> 21) & 14));
                    lVarV.g();
                    lVarV.g();
                    lVarV.g();
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    pVar3 = pVar2;
                    qVar3 = qVar2;
                    aVar4 = aVar3;
                    str2 = str3;
                    j13 = j12;
                    pair3 = pair19;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    final androidx.compose.ui.d dVar8 = dVar2;
                    final String str9 = str2;
                    final Pair pair110 = pair3;
                    w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.wq0
                        @Override // wn0.p
                        public final Object invoke(Object obj, Object obj2) {
                            return UD.a(dVar8, j13, str9, closeImageSource, pVar3, qVar3, body, footer, aVar4, pair110, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            pVar2 = pVar;
            i19 = i12 & 32;
            if (i19 != 0) {
                i13 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (lVarV.K(qVar)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            }
            if ((i12 & 64) != 0) {
                i13 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (lVarV.K(body)) {
                    i22 = PKIFailureInfo.badCertTemplate;
                } else {
                    i22 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i22;
            }
            if ((i12 & 128) != 0) {
                i13 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                if (lVarV.K(footer)) {
                    i23 = 8388608;
                } else {
                    i23 = 4194304;
                }
                i13 |= i23;
            }
            i24 = i12 & 256;
            if (i24 != 0) {
                if ((i11 & 100663296) == 0) {
                    if (lVarV.K(aVar)) {
                        i25 = 67108864;
                    } else {
                        i25 = 33554432;
                    }
                    i13 |= i25;
                }
                if ((i11 & 805306368) != 0) {
                    i13 |= ((i12 & 512) == 0 || !lVarV.n(pair)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                if ((i13 & 306783379) == 306783378) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i31 != 0) {
                            jI = k3.p1.INSTANCE.i();
                        }
                        if (i14 != 0) {
                            str2 = null;
                        }
                        if (i17 != 0) {
                            pVar2 = null;
                        }
                        if (i19 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        if (i24 != 0) {
                            aVar2 = null;
                        } else {
                            aVar2 = aVar;
                        }
                        if ((i12 & 512) != 0) {
                            pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                            i13 &= -1879048193;
                            qVar2 = qVar2;
                        } else {
                            pair2 = pair;
                        }
                        j12 = jI;
                        aVar3 = aVar2;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i31 != 0) {
                            jI = k3.p1.INSTANCE.i();
                        }
                        if (i14 != 0) {
                            str2 = null;
                        }
                        if (i17 != 0) {
                            pVar2 = null;
                        }
                        if (i19 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        if (i24 != 0) {
                            aVar2 = null;
                        } else {
                            aVar2 = aVar;
                        }
                        if ((i12 & 512) != 0) {
                            pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                            i13 &= -1879048193;
                            qVar2 = qVar2;
                        } else {
                            pair2 = pair;
                        }
                        j12 = jI;
                        aVar3 = aVar2;
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(72921645, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerOverlayScaffold (VisionScannerOverlayScaffold.kt:54)");
                    }
                    lVarV.o(-1858078478);
                    objI = lVarV.I();
                    if (objI == p020r2.l.INSTANCE.a()) {
                        objI = new wn0.l() { // from class: com.fourthline.orca.internal.vq0
                            @Override // wn0.l
                            public final Object invoke(Object obj) {
                                return UD.a((g4.y) obj);
                            }
                        };
                        lVarV.B(objI);
                    }
                    lVarV.l();
                    i26 = i13;
                    androidx.compose.ui.d dVarD12 = androidx.compose.foundation.b.d(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), j12, null, 2, null);
                    companion = d3.c.INSTANCE;
                    z3.i0 i0VarH11115 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                    iA = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC111116 = lVarV.c();
                    androidx.compose.ui.d dVarE111116 = androidx.compose.ui.c.e(lVarV, dVarD12);
                    companion2 = b4.g.INSTANCE;
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
                    Pair pair111 = pair2;
                    p020r2.d4.b(lVarA, i0VarH11115, companion2.c());
                    p020r2.d4.b(lVarA, xVarC111116, companion2.e());
                    pVarB = companion2.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    p020r2.d4.b(lVarA, dVarE111116, companion2.d());
                    androidx.compose.foundation.layout.i iVar12 = androidx.compose.foundation.layout.i.f4585a;
                    lVarV.o(-1038937986);
                    if (pVar2 != null) {
                        pVar2.invoke(lVarV, Integer.valueOf((i26 >> 12) & 14));
                        jn0.h0 h0Var1114 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    lVarV.o(-1038935796);
                    if (aVar3 == null) {
                        i27 = 1;
                    } else {
                        androidx.compose.ui.d.Companion companion115 = androidx.compose.ui.d.INSTANCE;
                        androidx.compose.ui.d dVarM113 = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.h(companion115, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                        z3.i0 i0VarH11116 = androidx.compose.foundation.layout.g.h(companion.n(), false);
                        iA2 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC111117 = lVarV.c();
                        androidx.compose.ui.d dVarE111117 = androidx.compose.ui.c.e(lVarV, dVarM113);
                        aVarA2 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA2);
                        } else {
                            lVarV.d();
                        }
                        lVarA2 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA2, i0VarH11116, companion2.c());
                        p020r2.d4.b(lVarA2, xVarC111117, companion2.e());
                        pVarB2 = companion2.b();
                        if (lVarA2.getInserting()) {
                            lVarA2.B(Integer.valueOf(iA2));
                            lVarA2.f(Integer.valueOf(iA2), pVarB2);
                        } else {
                            lVarA2.B(Integer.valueOf(iA2));
                            lVarA2.f(Integer.valueOf(iA2), pVarB2);
                        }
                        p020r2.d4.b(lVarA2, dVarE111117, companion2.d());
                        i27 = 1;
                        C4670d1.a(aVar3, AbstractC3307gk.a(AbstractC3307gk.a(AbstractC3307gk.a(companion115, "closeButton", (String) null, 2, (Object) null), 199.0f), RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close_acessibility, 0, 2, null), lVarV, 0), false, 2, (Object) null), false, null, z2.c.e(1519979611, true, new a(closeImageSource), lVarV, 54), lVarV, 24576, 12);
                        lVarV.g();
                        jn0.h0 h0Var1115 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    lVarV.o(-1038906739);
                    if (str2 != null) {
                        float f112 = 32;
                        str3 = str2;
                        Zg.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, w4.h.g(f112), w4.h.g(f112), w4.h.g(48), BitmapDescriptorFactory.HUE_RED, 8, null), BitmapDescriptorFactory.HUE_RED, i27, null), str3, null, k3.p1.INSTANCE.k(), null, null, lVarV, ((i26 >> 3) & 112) | 3072, 52);
                    } else {
                        str3 = str2;
                    }
                    lVarV.l();
                    if (qVar2 != null) {
                        i28 = 80;
                    } else {
                        i28 = 156;
                    }
                    androidx.compose.ui.d dVarM114 = androidx.compose.foundation.layout.t.m(v1.p0.c(dVar2, v1.s0.d(v1.m0.INSTANCE, lVarV, 6)), BitmapDescriptorFactory.HUE_RED, w4.h.g(i28), BitmapDescriptorFactory.HUE_RED, C3825sp.f35377a.c(lVarV, 6).f(), 5, null);
                    z3.i0 i0VarA12 = v1.g.a(v1.b.f117444a.g(), companion.g(), lVarV, 48);
                    iA3 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC111118 = lVarV.c();
                    androidx.compose.ui.d dVarE111118 = androidx.compose.ui.c.e(lVarV, dVarM114);
                    aVarA3 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA3);
                    } else {
                        lVarV.d();
                    }
                    lVarA3 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA3, i0VarA12, companion2.c());
                    p020r2.d4.b(lVarA3, xVarC111118, companion2.e());
                    pVarB3 = companion2.b();
                    if (lVarA3.getInserting()) {
                        lVarA3.B(Integer.valueOf(iA3));
                        lVarA3.f(Integer.valueOf(iA3), pVarB3);
                    } else {
                        lVarA3.B(Integer.valueOf(iA3));
                        lVarA3.f(Integer.valueOf(iA3), pVarB3);
                    }
                    p020r2.d4.b(lVarA3, dVarE111118, companion2.d());
                    jVar = v1.j.f117505a;
                    lVarV.o(915714536);
                    if (qVar2 != null) {
                        qVar2.invoke(jVar, lVarV, Integer.valueOf(((i26 >> 12) & 112) | 6));
                        jn0.h0 h0Var1116 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    androidx.compose.ui.d.Companion companion116 = androidx.compose.ui.d.INSTANCE;
                    androidx.compose.ui.d dVarB113 = v1.i.b(jVar, companion116, ((Number) pair111.e()).floatValue(), false, 2, null);
                    z3.i0 i0VarH11117 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                    iA4 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC111119 = lVarV.c();
                    androidx.compose.ui.d dVarE111119 = androidx.compose.ui.c.e(lVarV, dVarB113);
                    aVarA4 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA4);
                    } else {
                        lVarV.d();
                    }
                    lVarA4 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA4, i0VarH11117, companion2.c());
                    p020r2.d4.b(lVarA4, xVarC111119, companion2.e());
                    pVarB4 = companion2.b();
                    if (lVarA4.getInserting()) {
                        lVarA4.B(Integer.valueOf(iA4));
                        lVarA4.f(Integer.valueOf(iA4), pVarB4);
                    } else {
                        lVarA4.B(Integer.valueOf(iA4));
                        lVarA4.f(Integer.valueOf(iA4), pVarB4);
                    }
                    p020r2.d4.b(lVarA4, dVarE111119, companion2.d());
                    body.invoke(lVarV, Integer.valueOf((i26 >> 18) & 14));
                    lVarV.g();
                    androidx.compose.ui.d dVarB114 = v1.i.b(jVar, companion116, ((Number) pair111.f()).floatValue(), false, 2, null);
                    z3.i0 i0VarH11118 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                    iA5 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC1111110 = lVarV.c();
                    androidx.compose.ui.d dVarE1111110 = androidx.compose.ui.c.e(lVarV, dVarB114);
                    aVarA5 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA5);
                    } else {
                        lVarV.d();
                    }
                    lVarA5 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA5, i0VarH11118, companion2.c());
                    p020r2.d4.b(lVarA5, xVarC1111110, companion2.e());
                    pVarB5 = companion2.b();
                    if (lVarA5.getInserting()) {
                        lVarA5.B(Integer.valueOf(iA5));
                        lVarA5.f(Integer.valueOf(iA5), pVarB5);
                    } else {
                        lVarA5.B(Integer.valueOf(iA5));
                        lVarA5.f(Integer.valueOf(iA5), pVarB5);
                    }
                    p020r2.d4.b(lVarA5, dVarE1111110, companion2.d());
                    footer.invoke(lVarV, Integer.valueOf((i26 >> 21) & 14));
                    lVarV.g();
                    lVarV.g();
                    lVarV.g();
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    pVar3 = pVar2;
                    qVar3 = qVar2;
                    aVar4 = aVar3;
                    str2 = str3;
                    j13 = j12;
                    pair3 = pair111;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i31 != 0) {
                            jI = k3.p1.INSTANCE.i();
                        }
                        if (i14 != 0) {
                            str2 = null;
                        }
                        if (i17 != 0) {
                            pVar2 = null;
                        }
                        if (i19 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        if (i24 != 0) {
                            aVar2 = null;
                        } else {
                            aVar2 = aVar;
                        }
                        if ((i12 & 512) != 0) {
                            pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                            i13 &= -1879048193;
                            qVar2 = qVar2;
                        } else {
                            pair2 = pair;
                        }
                        j12 = jI;
                        aVar3 = aVar2;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i31 != 0) {
                            jI = k3.p1.INSTANCE.i();
                        }
                        if (i14 != 0) {
                            str2 = null;
                        }
                        if (i17 != 0) {
                            pVar2 = null;
                        }
                        if (i19 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        if (i24 != 0) {
                            aVar2 = null;
                        } else {
                            aVar2 = aVar;
                        }
                        if ((i12 & 512) != 0) {
                            pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                            i13 &= -1879048193;
                            qVar2 = qVar2;
                        } else {
                            pair2 = pair;
                        }
                        j12 = jI;
                        aVar3 = aVar2;
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(72921645, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerOverlayScaffold (VisionScannerOverlayScaffold.kt:54)");
                    }
                    lVarV.o(-1858078478);
                    objI = lVarV.I();
                    if (objI == p020r2.l.INSTANCE.a()) {
                        objI = new wn0.l() { // from class: com.fourthline.orca.internal.vq0
                            @Override // wn0.l
                            public final Object invoke(Object obj) {
                                return UD.a((g4.y) obj);
                            }
                        };
                        lVarV.B(objI);
                    }
                    lVarV.l();
                    i26 = i13;
                    androidx.compose.ui.d dVarD13 = androidx.compose.foundation.b.d(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), j12, null, 2, null);
                    companion = d3.c.INSTANCE;
                    z3.i0 i0VarH11119 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                    iA = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC1111111 = lVarV.c();
                    androidx.compose.ui.d dVarE1111111 = androidx.compose.ui.c.e(lVarV, dVarD13);
                    companion2 = b4.g.INSTANCE;
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
                    Pair pair112 = pair2;
                    p020r2.d4.b(lVarA, i0VarH11119, companion2.c());
                    p020r2.d4.b(lVarA, xVarC1111111, companion2.e());
                    pVarB = companion2.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    p020r2.d4.b(lVarA, dVarE1111111, companion2.d());
                    androidx.compose.foundation.layout.i iVar13 = androidx.compose.foundation.layout.i.f4585a;
                    lVarV.o(-1038937986);
                    if (pVar2 != null) {
                        pVar2.invoke(lVarV, Integer.valueOf((i26 >> 12) & 14));
                        jn0.h0 h0Var1117 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    lVarV.o(-1038935796);
                    if (aVar3 == null) {
                        i27 = 1;
                    } else {
                        androidx.compose.ui.d.Companion companion117 = androidx.compose.ui.d.INSTANCE;
                        androidx.compose.ui.d dVarM115 = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.h(companion117, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                        z3.i0 i0VarH111110 = androidx.compose.foundation.layout.g.h(companion.n(), false);
                        iA2 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC1111112 = lVarV.c();
                        androidx.compose.ui.d dVarE1111112 = androidx.compose.ui.c.e(lVarV, dVarM115);
                        aVarA2 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA2);
                        } else {
                            lVarV.d();
                        }
                        lVarA2 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA2, i0VarH111110, companion2.c());
                        p020r2.d4.b(lVarA2, xVarC1111112, companion2.e());
                        pVarB2 = companion2.b();
                        if (lVarA2.getInserting()) {
                            lVarA2.B(Integer.valueOf(iA2));
                            lVarA2.f(Integer.valueOf(iA2), pVarB2);
                        } else {
                            lVarA2.B(Integer.valueOf(iA2));
                            lVarA2.f(Integer.valueOf(iA2), pVarB2);
                        }
                        p020r2.d4.b(lVarA2, dVarE1111112, companion2.d());
                        i27 = 1;
                        C4670d1.a(aVar3, AbstractC3307gk.a(AbstractC3307gk.a(AbstractC3307gk.a(companion117, "closeButton", (String) null, 2, (Object) null), 199.0f), RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close_acessibility, 0, 2, null), lVarV, 0), false, 2, (Object) null), false, null, z2.c.e(1519979611, true, new a(closeImageSource), lVarV, 54), lVarV, 24576, 12);
                        lVarV.g();
                        jn0.h0 h0Var1118 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    lVarV.o(-1038906739);
                    if (str2 != null) {
                        float f113 = 32;
                        str3 = str2;
                        Zg.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, w4.h.g(f113), w4.h.g(f113), w4.h.g(48), BitmapDescriptorFactory.HUE_RED, 8, null), BitmapDescriptorFactory.HUE_RED, i27, null), str3, null, k3.p1.INSTANCE.k(), null, null, lVarV, ((i26 >> 3) & 112) | 3072, 52);
                    } else {
                        str3 = str2;
                    }
                    lVarV.l();
                    if (qVar2 != null) {
                        i28 = 80;
                    } else {
                        i28 = 156;
                    }
                    androidx.compose.ui.d dVarM116 = androidx.compose.foundation.layout.t.m(v1.p0.c(dVar2, v1.s0.d(v1.m0.INSTANCE, lVarV, 6)), BitmapDescriptorFactory.HUE_RED, w4.h.g(i28), BitmapDescriptorFactory.HUE_RED, C3825sp.f35377a.c(lVarV, 6).f(), 5, null);
                    z3.i0 i0VarA13 = v1.g.a(v1.b.f117444a.g(), companion.g(), lVarV, 48);
                    iA3 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC1111113 = lVarV.c();
                    androidx.compose.ui.d dVarE1111113 = androidx.compose.ui.c.e(lVarV, dVarM116);
                    aVarA3 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA3);
                    } else {
                        lVarV.d();
                    }
                    lVarA3 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA3, i0VarA13, companion2.c());
                    p020r2.d4.b(lVarA3, xVarC1111113, companion2.e());
                    pVarB3 = companion2.b();
                    if (lVarA3.getInserting()) {
                        lVarA3.B(Integer.valueOf(iA3));
                        lVarA3.f(Integer.valueOf(iA3), pVarB3);
                    } else {
                        lVarA3.B(Integer.valueOf(iA3));
                        lVarA3.f(Integer.valueOf(iA3), pVarB3);
                    }
                    p020r2.d4.b(lVarA3, dVarE1111113, companion2.d());
                    jVar = v1.j.f117505a;
                    lVarV.o(915714536);
                    if (qVar2 != null) {
                        qVar2.invoke(jVar, lVarV, Integer.valueOf(((i26 >> 12) & 112) | 6));
                        jn0.h0 h0Var1119 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    androidx.compose.ui.d.Companion companion118 = androidx.compose.ui.d.INSTANCE;
                    androidx.compose.ui.d dVarB115 = v1.i.b(jVar, companion118, ((Number) pair112.e()).floatValue(), false, 2, null);
                    z3.i0 i0VarH111111 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                    iA4 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC1111114 = lVarV.c();
                    androidx.compose.ui.d dVarE1111114 = androidx.compose.ui.c.e(lVarV, dVarB115);
                    aVarA4 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA4);
                    } else {
                        lVarV.d();
                    }
                    lVarA4 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA4, i0VarH111111, companion2.c());
                    p020r2.d4.b(lVarA4, xVarC1111114, companion2.e());
                    pVarB4 = companion2.b();
                    if (lVarA4.getInserting()) {
                        lVarA4.B(Integer.valueOf(iA4));
                        lVarA4.f(Integer.valueOf(iA4), pVarB4);
                    } else {
                        lVarA4.B(Integer.valueOf(iA4));
                        lVarA4.f(Integer.valueOf(iA4), pVarB4);
                    }
                    p020r2.d4.b(lVarA4, dVarE1111114, companion2.d());
                    body.invoke(lVarV, Integer.valueOf((i26 >> 18) & 14));
                    lVarV.g();
                    androidx.compose.ui.d dVarB116 = v1.i.b(jVar, companion118, ((Number) pair112.f()).floatValue(), false, 2, null);
                    z3.i0 i0VarH111112 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                    iA5 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC1111115 = lVarV.c();
                    androidx.compose.ui.d dVarE1111115 = androidx.compose.ui.c.e(lVarV, dVarB116);
                    aVarA5 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA5);
                    } else {
                        lVarV.d();
                    }
                    lVarA5 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA5, i0VarH111112, companion2.c());
                    p020r2.d4.b(lVarA5, xVarC1111115, companion2.e());
                    pVarB5 = companion2.b();
                    if (lVarA5.getInserting()) {
                        lVarA5.B(Integer.valueOf(iA5));
                        lVarA5.f(Integer.valueOf(iA5), pVarB5);
                    } else {
                        lVarA5.B(Integer.valueOf(iA5));
                        lVarA5.f(Integer.valueOf(iA5), pVarB5);
                    }
                    p020r2.d4.b(lVarA5, dVarE1111115, companion2.d());
                    footer.invoke(lVarV, Integer.valueOf((i26 >> 21) & 14));
                    lVarV.g();
                    lVarV.g();
                    lVarV.g();
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    pVar3 = pVar2;
                    qVar3 = qVar2;
                    aVar4 = aVar3;
                    str2 = str3;
                    j13 = j12;
                    pair3 = pair112;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    final androidx.compose.ui.d dVar9 = dVar2;
                    final String str10 = str2;
                    final Pair pair113 = pair3;
                    w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.wq0
                        @Override // wn0.p
                        public final Object invoke(Object obj, Object obj2) {
                            return UD.a(dVar9, j13, str10, closeImageSource, pVar3, qVar3, body, footer, aVar4, pair113, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 100663296;
            if ((i11 & 805306368) != 0) {
                i13 |= ((i12 & 512) == 0 || !lVarV.n(pair)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            if ((i13 & 306783379) == 306783378) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i31 != 0) {
                        jI = k3.p1.INSTANCE.i();
                    }
                    if (i14 != 0) {
                        str2 = null;
                    }
                    if (i17 != 0) {
                        pVar2 = null;
                    }
                    if (i19 != 0) {
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                    }
                    if (i24 != 0) {
                        aVar2 = null;
                    } else {
                        aVar2 = aVar;
                    }
                    if ((i12 & 512) != 0) {
                        pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                        i13 &= -1879048193;
                        qVar2 = qVar2;
                    } else {
                        pair2 = pair;
                    }
                    j12 = jI;
                    aVar3 = aVar2;
                } else {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i31 != 0) {
                        jI = k3.p1.INSTANCE.i();
                    }
                    if (i14 != 0) {
                        str2 = null;
                    }
                    if (i17 != 0) {
                        pVar2 = null;
                    }
                    if (i19 != 0) {
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                    }
                    if (i24 != 0) {
                        aVar2 = null;
                    } else {
                        aVar2 = aVar;
                    }
                    if ((i12 & 512) != 0) {
                        pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                        i13 &= -1879048193;
                        qVar2 = qVar2;
                    } else {
                        pair2 = pair;
                    }
                    j12 = jI;
                    aVar3 = aVar2;
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(72921645, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerOverlayScaffold (VisionScannerOverlayScaffold.kt:54)");
                }
                lVarV.o(-1858078478);
                objI = lVarV.I();
                if (objI == p020r2.l.INSTANCE.a()) {
                    objI = new wn0.l() { // from class: com.fourthline.orca.internal.vq0
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return UD.a((g4.y) obj);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                i26 = i13;
                androidx.compose.ui.d dVarD14 = androidx.compose.foundation.b.d(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), j12, null, 2, null);
                companion = d3.c.INSTANCE;
                z3.i0 i0VarH111113 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                iA = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC1111116 = lVarV.c();
                androidx.compose.ui.d dVarE1111116 = androidx.compose.ui.c.e(lVarV, dVarD14);
                companion2 = b4.g.INSTANCE;
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
                Pair pair114 = pair2;
                p020r2.d4.b(lVarA, i0VarH111113, companion2.c());
                p020r2.d4.b(lVarA, xVarC1111116, companion2.e());
                pVarB = companion2.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                p020r2.d4.b(lVarA, dVarE1111116, companion2.d());
                androidx.compose.foundation.layout.i iVar14 = androidx.compose.foundation.layout.i.f4585a;
                lVarV.o(-1038937986);
                if (pVar2 != null) {
                    pVar2.invoke(lVarV, Integer.valueOf((i26 >> 12) & 14));
                    jn0.h0 h0Var11110 = jn0.h0.f84049a;
                }
                lVarV.l();
                lVarV.o(-1038935796);
                if (aVar3 == null) {
                    i27 = 1;
                } else {
                    androidx.compose.ui.d.Companion companion119 = androidx.compose.ui.d.INSTANCE;
                    androidx.compose.ui.d dVarM117 = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.h(companion119, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                    z3.i0 i0VarH111114 = androidx.compose.foundation.layout.g.h(companion.n(), false);
                    iA2 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC1111117 = lVarV.c();
                    androidx.compose.ui.d dVarE1111117 = androidx.compose.ui.c.e(lVarV, dVarM117);
                    aVarA2 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA2);
                    } else {
                        lVarV.d();
                    }
                    lVarA2 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA2, i0VarH111114, companion2.c());
                    p020r2.d4.b(lVarA2, xVarC1111117, companion2.e());
                    pVarB2 = companion2.b();
                    if (lVarA2.getInserting()) {
                        lVarA2.B(Integer.valueOf(iA2));
                        lVarA2.f(Integer.valueOf(iA2), pVarB2);
                    } else {
                        lVarA2.B(Integer.valueOf(iA2));
                        lVarA2.f(Integer.valueOf(iA2), pVarB2);
                    }
                    p020r2.d4.b(lVarA2, dVarE1111117, companion2.d());
                    i27 = 1;
                    C4670d1.a(aVar3, AbstractC3307gk.a(AbstractC3307gk.a(AbstractC3307gk.a(companion119, "closeButton", (String) null, 2, (Object) null), 199.0f), RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close_acessibility, 0, 2, null), lVarV, 0), false, 2, (Object) null), false, null, z2.c.e(1519979611, true, new a(closeImageSource), lVarV, 54), lVarV, 24576, 12);
                    lVarV.g();
                    jn0.h0 h0Var11111 = jn0.h0.f84049a;
                }
                lVarV.l();
                lVarV.o(-1038906739);
                if (str2 != null) {
                    float f114 = 32;
                    str3 = str2;
                    Zg.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, w4.h.g(f114), w4.h.g(f114), w4.h.g(48), BitmapDescriptorFactory.HUE_RED, 8, null), BitmapDescriptorFactory.HUE_RED, i27, null), str3, null, k3.p1.INSTANCE.k(), null, null, lVarV, ((i26 >> 3) & 112) | 3072, 52);
                } else {
                    str3 = str2;
                }
                lVarV.l();
                if (qVar2 != null) {
                    i28 = 80;
                } else {
                    i28 = 156;
                }
                androidx.compose.ui.d dVarM118 = androidx.compose.foundation.layout.t.m(v1.p0.c(dVar2, v1.s0.d(v1.m0.INSTANCE, lVarV, 6)), BitmapDescriptorFactory.HUE_RED, w4.h.g(i28), BitmapDescriptorFactory.HUE_RED, C3825sp.f35377a.c(lVarV, 6).f(), 5, null);
                z3.i0 i0VarA14 = v1.g.a(v1.b.f117444a.g(), companion.g(), lVarV, 48);
                iA3 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC1111118 = lVarV.c();
                androidx.compose.ui.d dVarE1111118 = androidx.compose.ui.c.e(lVarV, dVarM118);
                aVarA3 = companion2.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA3);
                } else {
                    lVarV.d();
                }
                lVarA3 = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA3, i0VarA14, companion2.c());
                p020r2.d4.b(lVarA3, xVarC1111118, companion2.e());
                pVarB3 = companion2.b();
                if (lVarA3.getInserting()) {
                    lVarA3.B(Integer.valueOf(iA3));
                    lVarA3.f(Integer.valueOf(iA3), pVarB3);
                } else {
                    lVarA3.B(Integer.valueOf(iA3));
                    lVarA3.f(Integer.valueOf(iA3), pVarB3);
                }
                p020r2.d4.b(lVarA3, dVarE1111118, companion2.d());
                jVar = v1.j.f117505a;
                lVarV.o(915714536);
                if (qVar2 != null) {
                    qVar2.invoke(jVar, lVarV, Integer.valueOf(((i26 >> 12) & 112) | 6));
                    jn0.h0 h0Var11112 = jn0.h0.f84049a;
                }
                lVarV.l();
                androidx.compose.ui.d.Companion companion1110 = androidx.compose.ui.d.INSTANCE;
                androidx.compose.ui.d dVarB117 = v1.i.b(jVar, companion1110, ((Number) pair114.e()).floatValue(), false, 2, null);
                z3.i0 i0VarH111115 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                iA4 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC1111119 = lVarV.c();
                androidx.compose.ui.d dVarE1111119 = androidx.compose.ui.c.e(lVarV, dVarB117);
                aVarA4 = companion2.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA4);
                } else {
                    lVarV.d();
                }
                lVarA4 = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA4, i0VarH111115, companion2.c());
                p020r2.d4.b(lVarA4, xVarC1111119, companion2.e());
                pVarB4 = companion2.b();
                if (lVarA4.getInserting()) {
                    lVarA4.B(Integer.valueOf(iA4));
                    lVarA4.f(Integer.valueOf(iA4), pVarB4);
                } else {
                    lVarA4.B(Integer.valueOf(iA4));
                    lVarA4.f(Integer.valueOf(iA4), pVarB4);
                }
                p020r2.d4.b(lVarA4, dVarE1111119, companion2.d());
                body.invoke(lVarV, Integer.valueOf((i26 >> 18) & 14));
                lVarV.g();
                androidx.compose.ui.d dVarB118 = v1.i.b(jVar, companion1110, ((Number) pair114.f()).floatValue(), false, 2, null);
                z3.i0 i0VarH111116 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                iA5 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC11111110 = lVarV.c();
                androidx.compose.ui.d dVarE11111110 = androidx.compose.ui.c.e(lVarV, dVarB118);
                aVarA5 = companion2.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA5);
                } else {
                    lVarV.d();
                }
                lVarA5 = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA5, i0VarH111116, companion2.c());
                p020r2.d4.b(lVarA5, xVarC11111110, companion2.e());
                pVarB5 = companion2.b();
                if (lVarA5.getInserting()) {
                    lVarA5.B(Integer.valueOf(iA5));
                    lVarA5.f(Integer.valueOf(iA5), pVarB5);
                } else {
                    lVarA5.B(Integer.valueOf(iA5));
                    lVarA5.f(Integer.valueOf(iA5), pVarB5);
                }
                p020r2.d4.b(lVarA5, dVarE11111110, companion2.d());
                footer.invoke(lVarV, Integer.valueOf((i26 >> 21) & 14));
                lVarV.g();
                lVarV.g();
                lVarV.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                pVar3 = pVar2;
                qVar3 = qVar2;
                aVar4 = aVar3;
                str2 = str3;
                j13 = j12;
                pair3 = pair114;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i31 != 0) {
                        jI = k3.p1.INSTANCE.i();
                    }
                    if (i14 != 0) {
                        str2 = null;
                    }
                    if (i17 != 0) {
                        pVar2 = null;
                    }
                    if (i19 != 0) {
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                    }
                    if (i24 != 0) {
                        aVar2 = null;
                    } else {
                        aVar2 = aVar;
                    }
                    if ((i12 & 512) != 0) {
                        pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                        i13 &= -1879048193;
                        qVar2 = qVar2;
                    } else {
                        pair2 = pair;
                    }
                    j12 = jI;
                    aVar3 = aVar2;
                } else {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i31 != 0) {
                        jI = k3.p1.INSTANCE.i();
                    }
                    if (i14 != 0) {
                        str2 = null;
                    }
                    if (i17 != 0) {
                        pVar2 = null;
                    }
                    if (i19 != 0) {
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                    }
                    if (i24 != 0) {
                        aVar2 = null;
                    } else {
                        aVar2 = aVar;
                    }
                    if ((i12 & 512) != 0) {
                        pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                        i13 &= -1879048193;
                        qVar2 = qVar2;
                    } else {
                        pair2 = pair;
                    }
                    j12 = jI;
                    aVar3 = aVar2;
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(72921645, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerOverlayScaffold (VisionScannerOverlayScaffold.kt:54)");
                }
                lVarV.o(-1858078478);
                objI = lVarV.I();
                if (objI == p020r2.l.INSTANCE.a()) {
                    objI = new wn0.l() { // from class: com.fourthline.orca.internal.vq0
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return UD.a((g4.y) obj);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                i26 = i13;
                androidx.compose.ui.d dVarD15 = androidx.compose.foundation.b.d(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), j12, null, 2, null);
                companion = d3.c.INSTANCE;
                z3.i0 i0VarH111117 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                iA = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC11111111 = lVarV.c();
                androidx.compose.ui.d dVarE11111111 = androidx.compose.ui.c.e(lVarV, dVarD15);
                companion2 = b4.g.INSTANCE;
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
                Pair pair115 = pair2;
                p020r2.d4.b(lVarA, i0VarH111117, companion2.c());
                p020r2.d4.b(lVarA, xVarC11111111, companion2.e());
                pVarB = companion2.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                p020r2.d4.b(lVarA, dVarE11111111, companion2.d());
                androidx.compose.foundation.layout.i iVar15 = androidx.compose.foundation.layout.i.f4585a;
                lVarV.o(-1038937986);
                if (pVar2 != null) {
                    pVar2.invoke(lVarV, Integer.valueOf((i26 >> 12) & 14));
                    jn0.h0 h0Var11113 = jn0.h0.f84049a;
                }
                lVarV.l();
                lVarV.o(-1038935796);
                if (aVar3 == null) {
                    i27 = 1;
                } else {
                    androidx.compose.ui.d.Companion companion1111 = androidx.compose.ui.d.INSTANCE;
                    androidx.compose.ui.d dVarM119 = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.h(companion1111, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                    z3.i0 i0VarH111118 = androidx.compose.foundation.layout.g.h(companion.n(), false);
                    iA2 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC11111112 = lVarV.c();
                    androidx.compose.ui.d dVarE11111112 = androidx.compose.ui.c.e(lVarV, dVarM119);
                    aVarA2 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA2);
                    } else {
                        lVarV.d();
                    }
                    lVarA2 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA2, i0VarH111118, companion2.c());
                    p020r2.d4.b(lVarA2, xVarC11111112, companion2.e());
                    pVarB2 = companion2.b();
                    if (lVarA2.getInserting()) {
                        lVarA2.B(Integer.valueOf(iA2));
                        lVarA2.f(Integer.valueOf(iA2), pVarB2);
                    } else {
                        lVarA2.B(Integer.valueOf(iA2));
                        lVarA2.f(Integer.valueOf(iA2), pVarB2);
                    }
                    p020r2.d4.b(lVarA2, dVarE11111112, companion2.d());
                    i27 = 1;
                    C4670d1.a(aVar3, AbstractC3307gk.a(AbstractC3307gk.a(AbstractC3307gk.a(companion1111, "closeButton", (String) null, 2, (Object) null), 199.0f), RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close_acessibility, 0, 2, null), lVarV, 0), false, 2, (Object) null), false, null, z2.c.e(1519979611, true, new a(closeImageSource), lVarV, 54), lVarV, 24576, 12);
                    lVarV.g();
                    jn0.h0 h0Var11114 = jn0.h0.f84049a;
                }
                lVarV.l();
                lVarV.o(-1038906739);
                if (str2 != null) {
                    float f115 = 32;
                    str3 = str2;
                    Zg.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, w4.h.g(f115), w4.h.g(f115), w4.h.g(48), BitmapDescriptorFactory.HUE_RED, 8, null), BitmapDescriptorFactory.HUE_RED, i27, null), str3, null, k3.p1.INSTANCE.k(), null, null, lVarV, ((i26 >> 3) & 112) | 3072, 52);
                } else {
                    str3 = str2;
                }
                lVarV.l();
                if (qVar2 != null) {
                    i28 = 80;
                } else {
                    i28 = 156;
                }
                androidx.compose.ui.d dVarM1110 = androidx.compose.foundation.layout.t.m(v1.p0.c(dVar2, v1.s0.d(v1.m0.INSTANCE, lVarV, 6)), BitmapDescriptorFactory.HUE_RED, w4.h.g(i28), BitmapDescriptorFactory.HUE_RED, C3825sp.f35377a.c(lVarV, 6).f(), 5, null);
                z3.i0 i0VarA15 = v1.g.a(v1.b.f117444a.g(), companion.g(), lVarV, 48);
                iA3 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC11111113 = lVarV.c();
                androidx.compose.ui.d dVarE11111113 = androidx.compose.ui.c.e(lVarV, dVarM1110);
                aVarA3 = companion2.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA3);
                } else {
                    lVarV.d();
                }
                lVarA3 = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA3, i0VarA15, companion2.c());
                p020r2.d4.b(lVarA3, xVarC11111113, companion2.e());
                pVarB3 = companion2.b();
                if (lVarA3.getInserting()) {
                    lVarA3.B(Integer.valueOf(iA3));
                    lVarA3.f(Integer.valueOf(iA3), pVarB3);
                } else {
                    lVarA3.B(Integer.valueOf(iA3));
                    lVarA3.f(Integer.valueOf(iA3), pVarB3);
                }
                p020r2.d4.b(lVarA3, dVarE11111113, companion2.d());
                jVar = v1.j.f117505a;
                lVarV.o(915714536);
                if (qVar2 != null) {
                    qVar2.invoke(jVar, lVarV, Integer.valueOf(((i26 >> 12) & 112) | 6));
                    jn0.h0 h0Var11115 = jn0.h0.f84049a;
                }
                lVarV.l();
                androidx.compose.ui.d.Companion companion1112 = androidx.compose.ui.d.INSTANCE;
                androidx.compose.ui.d dVarB119 = v1.i.b(jVar, companion1112, ((Number) pair115.e()).floatValue(), false, 2, null);
                z3.i0 i0VarH111119 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                iA4 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC11111114 = lVarV.c();
                androidx.compose.ui.d dVarE11111114 = androidx.compose.ui.c.e(lVarV, dVarB119);
                aVarA4 = companion2.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA4);
                } else {
                    lVarV.d();
                }
                lVarA4 = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA4, i0VarH111119, companion2.c());
                p020r2.d4.b(lVarA4, xVarC11111114, companion2.e());
                pVarB4 = companion2.b();
                if (lVarA4.getInserting()) {
                    lVarA4.B(Integer.valueOf(iA4));
                    lVarA4.f(Integer.valueOf(iA4), pVarB4);
                } else {
                    lVarA4.B(Integer.valueOf(iA4));
                    lVarA4.f(Integer.valueOf(iA4), pVarB4);
                }
                p020r2.d4.b(lVarA4, dVarE11111114, companion2.d());
                body.invoke(lVarV, Integer.valueOf((i26 >> 18) & 14));
                lVarV.g();
                androidx.compose.ui.d dVarB1110 = v1.i.b(jVar, companion1112, ((Number) pair115.f()).floatValue(), false, 2, null);
                z3.i0 i0VarH1111110 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                iA5 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC11111115 = lVarV.c();
                androidx.compose.ui.d dVarE11111115 = androidx.compose.ui.c.e(lVarV, dVarB1110);
                aVarA5 = companion2.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA5);
                } else {
                    lVarV.d();
                }
                lVarA5 = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA5, i0VarH1111110, companion2.c());
                p020r2.d4.b(lVarA5, xVarC11111115, companion2.e());
                pVarB5 = companion2.b();
                if (lVarA5.getInserting()) {
                    lVarA5.B(Integer.valueOf(iA5));
                    lVarA5.f(Integer.valueOf(iA5), pVarB5);
                } else {
                    lVarA5.B(Integer.valueOf(iA5));
                    lVarA5.f(Integer.valueOf(iA5), pVarB5);
                }
                p020r2.d4.b(lVarA5, dVarE11111115, companion2.d());
                footer.invoke(lVarV, Integer.valueOf((i26 >> 21) & 14));
                lVarV.g();
                lVarV.g();
                lVarV.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                pVar3 = pVar2;
                qVar3 = qVar2;
                aVar4 = aVar3;
                str2 = str3;
                j13 = j12;
                pair3 = pair115;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                final androidx.compose.ui.d dVar10 = dVar2;
                final String str11 = str2;
                final Pair pair116 = pair3;
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.wq0
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return UD.a(dVar10, j13, str11, closeImageSource, pVar3, qVar3, body, footer, aVar4, pair116, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        jI = j11;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                str2 = str;
                if (lVarV.n(str2)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            if ((i12 & 8) != 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                if ((i11 & 4096) == 0) {
                    zK = lVarV.n(closeImageSource);
                } else {
                    zK = lVarV.K(closeImageSource);
                }
                if (zK) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i13 |= i16;
            }
            i17 = i12 & 16;
            if (i17 != 0) {
                if ((i11 & 24576) == 0) {
                    pVar2 = pVar;
                    if (lVarV.K(pVar2)) {
                        i18 = 16384;
                    } else {
                        i18 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i18;
                }
                i19 = i12 & 32;
                if (i19 != 0) {
                    i13 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    if (lVarV.K(qVar)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                if ((i12 & 64) != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (lVarV.K(body)) {
                        i22 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i22 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i22;
                }
                if ((i12 & 128) != 0) {
                    i13 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    if (lVarV.K(footer)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i13 |= i23;
                }
                i24 = i12 & 256;
                if (i24 != 0) {
                    if ((i11 & 100663296) == 0) {
                        if (lVarV.K(aVar)) {
                            i25 = 67108864;
                        } else {
                            i25 = 33554432;
                        }
                        i13 |= i25;
                    }
                    if ((i11 & 805306368) != 0) {
                        i13 |= ((i12 & 512) == 0 || !lVarV.n(pair)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i31 != 0) {
                                jI = k3.p1.INSTANCE.i();
                            }
                            if (i14 != 0) {
                                str2 = null;
                            }
                            if (i17 != 0) {
                                pVar2 = null;
                            }
                            if (i19 != 0) {
                                qVar2 = null;
                            } else {
                                qVar2 = qVar;
                            }
                            if (i24 != 0) {
                                aVar2 = null;
                            } else {
                                aVar2 = aVar;
                            }
                            if ((i12 & 512) != 0) {
                                pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                                i13 &= -1879048193;
                                qVar2 = qVar2;
                            } else {
                                pair2 = pair;
                            }
                            j12 = jI;
                            aVar3 = aVar2;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i31 != 0) {
                                jI = k3.p1.INSTANCE.i();
                            }
                            if (i14 != 0) {
                                str2 = null;
                            }
                            if (i17 != 0) {
                                pVar2 = null;
                            }
                            if (i19 != 0) {
                                qVar2 = null;
                            } else {
                                qVar2 = qVar;
                            }
                            if (i24 != 0) {
                                aVar2 = null;
                            } else {
                                aVar2 = aVar;
                            }
                            if ((i12 & 512) != 0) {
                                pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                                i13 &= -1879048193;
                                qVar2 = qVar2;
                            } else {
                                pair2 = pair;
                            }
                            j12 = jI;
                            aVar3 = aVar2;
                        }
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(72921645, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerOverlayScaffold (VisionScannerOverlayScaffold.kt:54)");
                        }
                        lVarV.o(-1858078478);
                        objI = lVarV.I();
                        if (objI == p020r2.l.INSTANCE.a()) {
                            objI = new wn0.l() { // from class: com.fourthline.orca.internal.vq0
                                @Override // wn0.l
                                public final Object invoke(Object obj) {
                                    return UD.a((g4.y) obj);
                                }
                            };
                            lVarV.B(objI);
                        }
                        lVarV.l();
                        i26 = i13;
                        androidx.compose.ui.d dVarD16 = androidx.compose.foundation.b.d(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), j12, null, 2, null);
                        companion = d3.c.INSTANCE;
                        z3.i0 i0VarH1111111 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                        iA = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC11111116 = lVarV.c();
                        androidx.compose.ui.d dVarE11111116 = androidx.compose.ui.c.e(lVarV, dVarD16);
                        companion2 = b4.g.INSTANCE;
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
                        Pair pair117 = pair2;
                        p020r2.d4.b(lVarA, i0VarH1111111, companion2.c());
                        p020r2.d4.b(lVarA, xVarC11111116, companion2.e());
                        pVarB = companion2.b();
                        if (lVarA.getInserting()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        p020r2.d4.b(lVarA, dVarE11111116, companion2.d());
                        androidx.compose.foundation.layout.i iVar16 = androidx.compose.foundation.layout.i.f4585a;
                        lVarV.o(-1038937986);
                        if (pVar2 != null) {
                            pVar2.invoke(lVarV, Integer.valueOf((i26 >> 12) & 14));
                            jn0.h0 h0Var11116 = jn0.h0.f84049a;
                        }
                        lVarV.l();
                        lVarV.o(-1038935796);
                        if (aVar3 == null) {
                            i27 = 1;
                        } else {
                            androidx.compose.ui.d.Companion companion1113 = androidx.compose.ui.d.INSTANCE;
                            androidx.compose.ui.d dVarM1111 = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.h(companion1113, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                            z3.i0 i0VarH1111112 = androidx.compose.foundation.layout.g.h(companion.n(), false);
                            iA2 = p020r2.j.a(lVarV, 0);
                            p020r2.x xVarC11111117 = lVarV.c();
                            androidx.compose.ui.d dVarE11111117 = androidx.compose.ui.c.e(lVarV, dVarM1111);
                            aVarA2 = companion2.a();
                            if (lVarV.w() == null) {
                                p020r2.j.c();
                            }
                            lVarV.h();
                            if (lVarV.getInserting()) {
                                lVarV.z(aVarA2);
                            } else {
                                lVarV.d();
                            }
                            lVarA2 = p020r2.d4.a(lVarV);
                            p020r2.d4.b(lVarA2, i0VarH1111112, companion2.c());
                            p020r2.d4.b(lVarA2, xVarC11111117, companion2.e());
                            pVarB2 = companion2.b();
                            if (lVarA2.getInserting()) {
                                lVarA2.B(Integer.valueOf(iA2));
                                lVarA2.f(Integer.valueOf(iA2), pVarB2);
                            } else {
                                lVarA2.B(Integer.valueOf(iA2));
                                lVarA2.f(Integer.valueOf(iA2), pVarB2);
                            }
                            p020r2.d4.b(lVarA2, dVarE11111117, companion2.d());
                            i27 = 1;
                            C4670d1.a(aVar3, AbstractC3307gk.a(AbstractC3307gk.a(AbstractC3307gk.a(companion1113, "closeButton", (String) null, 2, (Object) null), 199.0f), RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close_acessibility, 0, 2, null), lVarV, 0), false, 2, (Object) null), false, null, z2.c.e(1519979611, true, new a(closeImageSource), lVarV, 54), lVarV, 24576, 12);
                            lVarV.g();
                            jn0.h0 h0Var11117 = jn0.h0.f84049a;
                        }
                        lVarV.l();
                        lVarV.o(-1038906739);
                        if (str2 != null) {
                            float f116 = 32;
                            str3 = str2;
                            Zg.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, w4.h.g(f116), w4.h.g(f116), w4.h.g(48), BitmapDescriptorFactory.HUE_RED, 8, null), BitmapDescriptorFactory.HUE_RED, i27, null), str3, null, k3.p1.INSTANCE.k(), null, null, lVarV, ((i26 >> 3) & 112) | 3072, 52);
                        } else {
                            str3 = str2;
                        }
                        lVarV.l();
                        if (qVar2 != null) {
                            i28 = 80;
                        } else {
                            i28 = 156;
                        }
                        androidx.compose.ui.d dVarM1112 = androidx.compose.foundation.layout.t.m(v1.p0.c(dVar2, v1.s0.d(v1.m0.INSTANCE, lVarV, 6)), BitmapDescriptorFactory.HUE_RED, w4.h.g(i28), BitmapDescriptorFactory.HUE_RED, C3825sp.f35377a.c(lVarV, 6).f(), 5, null);
                        z3.i0 i0VarA16 = v1.g.a(v1.b.f117444a.g(), companion.g(), lVarV, 48);
                        iA3 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC11111118 = lVarV.c();
                        androidx.compose.ui.d dVarE11111118 = androidx.compose.ui.c.e(lVarV, dVarM1112);
                        aVarA3 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA3);
                        } else {
                            lVarV.d();
                        }
                        lVarA3 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA3, i0VarA16, companion2.c());
                        p020r2.d4.b(lVarA3, xVarC11111118, companion2.e());
                        pVarB3 = companion2.b();
                        if (lVarA3.getInserting()) {
                            lVarA3.B(Integer.valueOf(iA3));
                            lVarA3.f(Integer.valueOf(iA3), pVarB3);
                        } else {
                            lVarA3.B(Integer.valueOf(iA3));
                            lVarA3.f(Integer.valueOf(iA3), pVarB3);
                        }
                        p020r2.d4.b(lVarA3, dVarE11111118, companion2.d());
                        jVar = v1.j.f117505a;
                        lVarV.o(915714536);
                        if (qVar2 != null) {
                            qVar2.invoke(jVar, lVarV, Integer.valueOf(((i26 >> 12) & 112) | 6));
                            jn0.h0 h0Var11118 = jn0.h0.f84049a;
                        }
                        lVarV.l();
                        androidx.compose.ui.d.Companion companion1114 = androidx.compose.ui.d.INSTANCE;
                        androidx.compose.ui.d dVarB1111 = v1.i.b(jVar, companion1114, ((Number) pair117.e()).floatValue(), false, 2, null);
                        z3.i0 i0VarH1111113 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                        iA4 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC11111119 = lVarV.c();
                        androidx.compose.ui.d dVarE11111119 = androidx.compose.ui.c.e(lVarV, dVarB1111);
                        aVarA4 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA4);
                        } else {
                            lVarV.d();
                        }
                        lVarA4 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA4, i0VarH1111113, companion2.c());
                        p020r2.d4.b(lVarA4, xVarC11111119, companion2.e());
                        pVarB4 = companion2.b();
                        if (lVarA4.getInserting()) {
                            lVarA4.B(Integer.valueOf(iA4));
                            lVarA4.f(Integer.valueOf(iA4), pVarB4);
                        } else {
                            lVarA4.B(Integer.valueOf(iA4));
                            lVarA4.f(Integer.valueOf(iA4), pVarB4);
                        }
                        p020r2.d4.b(lVarA4, dVarE11111119, companion2.d());
                        body.invoke(lVarV, Integer.valueOf((i26 >> 18) & 14));
                        lVarV.g();
                        androidx.compose.ui.d dVarB1112 = v1.i.b(jVar, companion1114, ((Number) pair117.f()).floatValue(), false, 2, null);
                        z3.i0 i0VarH1111114 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                        iA5 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC111111110 = lVarV.c();
                        androidx.compose.ui.d dVarE111111110 = androidx.compose.ui.c.e(lVarV, dVarB1112);
                        aVarA5 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA5);
                        } else {
                            lVarV.d();
                        }
                        lVarA5 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA5, i0VarH1111114, companion2.c());
                        p020r2.d4.b(lVarA5, xVarC111111110, companion2.e());
                        pVarB5 = companion2.b();
                        if (lVarA5.getInserting()) {
                            lVarA5.B(Integer.valueOf(iA5));
                            lVarA5.f(Integer.valueOf(iA5), pVarB5);
                        } else {
                            lVarA5.B(Integer.valueOf(iA5));
                            lVarA5.f(Integer.valueOf(iA5), pVarB5);
                        }
                        p020r2.d4.b(lVarA5, dVarE111111110, companion2.d());
                        footer.invoke(lVarV, Integer.valueOf((i26 >> 21) & 14));
                        lVarV.g();
                        lVarV.g();
                        lVarV.g();
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        pVar3 = pVar2;
                        qVar3 = qVar2;
                        aVar4 = aVar3;
                        str2 = str3;
                        j13 = j12;
                        pair3 = pair117;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i31 != 0) {
                                jI = k3.p1.INSTANCE.i();
                            }
                            if (i14 != 0) {
                                str2 = null;
                            }
                            if (i17 != 0) {
                                pVar2 = null;
                            }
                            if (i19 != 0) {
                                qVar2 = null;
                            } else {
                                qVar2 = qVar;
                            }
                            if (i24 != 0) {
                                aVar2 = null;
                            } else {
                                aVar2 = aVar;
                            }
                            if ((i12 & 512) != 0) {
                                pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                                i13 &= -1879048193;
                                qVar2 = qVar2;
                            } else {
                                pair2 = pair;
                            }
                            j12 = jI;
                            aVar3 = aVar2;
                        } else {
                            if (i29 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i31 != 0) {
                                jI = k3.p1.INSTANCE.i();
                            }
                            if (i14 != 0) {
                                str2 = null;
                            }
                            if (i17 != 0) {
                                pVar2 = null;
                            }
                            if (i19 != 0) {
                                qVar2 = null;
                            } else {
                                qVar2 = qVar;
                            }
                            if (i24 != 0) {
                                aVar2 = null;
                            } else {
                                aVar2 = aVar;
                            }
                            if ((i12 & 512) != 0) {
                                pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                                i13 &= -1879048193;
                                qVar2 = qVar2;
                            } else {
                                pair2 = pair;
                            }
                            j12 = jI;
                            aVar3 = aVar2;
                        }
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(72921645, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerOverlayScaffold (VisionScannerOverlayScaffold.kt:54)");
                        }
                        lVarV.o(-1858078478);
                        objI = lVarV.I();
                        if (objI == p020r2.l.INSTANCE.a()) {
                            objI = new wn0.l() { // from class: com.fourthline.orca.internal.vq0
                                @Override // wn0.l
                                public final Object invoke(Object obj) {
                                    return UD.a((g4.y) obj);
                                }
                            };
                            lVarV.B(objI);
                        }
                        lVarV.l();
                        i26 = i13;
                        androidx.compose.ui.d dVarD17 = androidx.compose.foundation.b.d(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), j12, null, 2, null);
                        companion = d3.c.INSTANCE;
                        z3.i0 i0VarH1111115 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                        iA = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC111111111 = lVarV.c();
                        androidx.compose.ui.d dVarE111111111 = androidx.compose.ui.c.e(lVarV, dVarD17);
                        companion2 = b4.g.INSTANCE;
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
                        Pair pair118 = pair2;
                        p020r2.d4.b(lVarA, i0VarH1111115, companion2.c());
                        p020r2.d4.b(lVarA, xVarC111111111, companion2.e());
                        pVarB = companion2.b();
                        if (lVarA.getInserting()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        p020r2.d4.b(lVarA, dVarE111111111, companion2.d());
                        androidx.compose.foundation.layout.i iVar17 = androidx.compose.foundation.layout.i.f4585a;
                        lVarV.o(-1038937986);
                        if (pVar2 != null) {
                            pVar2.invoke(lVarV, Integer.valueOf((i26 >> 12) & 14));
                            jn0.h0 h0Var11119 = jn0.h0.f84049a;
                        }
                        lVarV.l();
                        lVarV.o(-1038935796);
                        if (aVar3 == null) {
                            i27 = 1;
                        } else {
                            androidx.compose.ui.d.Companion companion1115 = androidx.compose.ui.d.INSTANCE;
                            androidx.compose.ui.d dVarM1113 = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.h(companion1115, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                            z3.i0 i0VarH1111116 = androidx.compose.foundation.layout.g.h(companion.n(), false);
                            iA2 = p020r2.j.a(lVarV, 0);
                            p020r2.x xVarC111111112 = lVarV.c();
                            androidx.compose.ui.d dVarE111111112 = androidx.compose.ui.c.e(lVarV, dVarM1113);
                            aVarA2 = companion2.a();
                            if (lVarV.w() == null) {
                                p020r2.j.c();
                            }
                            lVarV.h();
                            if (lVarV.getInserting()) {
                                lVarV.z(aVarA2);
                            } else {
                                lVarV.d();
                            }
                            lVarA2 = p020r2.d4.a(lVarV);
                            p020r2.d4.b(lVarA2, i0VarH1111116, companion2.c());
                            p020r2.d4.b(lVarA2, xVarC111111112, companion2.e());
                            pVarB2 = companion2.b();
                            if (lVarA2.getInserting()) {
                                lVarA2.B(Integer.valueOf(iA2));
                                lVarA2.f(Integer.valueOf(iA2), pVarB2);
                            } else {
                                lVarA2.B(Integer.valueOf(iA2));
                                lVarA2.f(Integer.valueOf(iA2), pVarB2);
                            }
                            p020r2.d4.b(lVarA2, dVarE111111112, companion2.d());
                            i27 = 1;
                            C4670d1.a(aVar3, AbstractC3307gk.a(AbstractC3307gk.a(AbstractC3307gk.a(companion1115, "closeButton", (String) null, 2, (Object) null), 199.0f), RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close_acessibility, 0, 2, null), lVarV, 0), false, 2, (Object) null), false, null, z2.c.e(1519979611, true, new a(closeImageSource), lVarV, 54), lVarV, 24576, 12);
                            lVarV.g();
                            jn0.h0 h0Var111110 = jn0.h0.f84049a;
                        }
                        lVarV.l();
                        lVarV.o(-1038906739);
                        if (str2 != null) {
                            float f117 = 32;
                            str3 = str2;
                            Zg.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, w4.h.g(f117), w4.h.g(f117), w4.h.g(48), BitmapDescriptorFactory.HUE_RED, 8, null), BitmapDescriptorFactory.HUE_RED, i27, null), str3, null, k3.p1.INSTANCE.k(), null, null, lVarV, ((i26 >> 3) & 112) | 3072, 52);
                        } else {
                            str3 = str2;
                        }
                        lVarV.l();
                        if (qVar2 != null) {
                            i28 = 80;
                        } else {
                            i28 = 156;
                        }
                        androidx.compose.ui.d dVarM1114 = androidx.compose.foundation.layout.t.m(v1.p0.c(dVar2, v1.s0.d(v1.m0.INSTANCE, lVarV, 6)), BitmapDescriptorFactory.HUE_RED, w4.h.g(i28), BitmapDescriptorFactory.HUE_RED, C3825sp.f35377a.c(lVarV, 6).f(), 5, null);
                        z3.i0 i0VarA17 = v1.g.a(v1.b.f117444a.g(), companion.g(), lVarV, 48);
                        iA3 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC111111113 = lVarV.c();
                        androidx.compose.ui.d dVarE111111113 = androidx.compose.ui.c.e(lVarV, dVarM1114);
                        aVarA3 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA3);
                        } else {
                            lVarV.d();
                        }
                        lVarA3 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA3, i0VarA17, companion2.c());
                        p020r2.d4.b(lVarA3, xVarC111111113, companion2.e());
                        pVarB3 = companion2.b();
                        if (lVarA3.getInserting()) {
                            lVarA3.B(Integer.valueOf(iA3));
                            lVarA3.f(Integer.valueOf(iA3), pVarB3);
                        } else {
                            lVarA3.B(Integer.valueOf(iA3));
                            lVarA3.f(Integer.valueOf(iA3), pVarB3);
                        }
                        p020r2.d4.b(lVarA3, dVarE111111113, companion2.d());
                        jVar = v1.j.f117505a;
                        lVarV.o(915714536);
                        if (qVar2 != null) {
                            qVar2.invoke(jVar, lVarV, Integer.valueOf(((i26 >> 12) & 112) | 6));
                            jn0.h0 h0Var111111 = jn0.h0.f84049a;
                        }
                        lVarV.l();
                        androidx.compose.ui.d.Companion companion1116 = androidx.compose.ui.d.INSTANCE;
                        androidx.compose.ui.d dVarB1113 = v1.i.b(jVar, companion1116, ((Number) pair118.e()).floatValue(), false, 2, null);
                        z3.i0 i0VarH1111117 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                        iA4 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC111111114 = lVarV.c();
                        androidx.compose.ui.d dVarE111111114 = androidx.compose.ui.c.e(lVarV, dVarB1113);
                        aVarA4 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA4);
                        } else {
                            lVarV.d();
                        }
                        lVarA4 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA4, i0VarH1111117, companion2.c());
                        p020r2.d4.b(lVarA4, xVarC111111114, companion2.e());
                        pVarB4 = companion2.b();
                        if (lVarA4.getInserting()) {
                            lVarA4.B(Integer.valueOf(iA4));
                            lVarA4.f(Integer.valueOf(iA4), pVarB4);
                        } else {
                            lVarA4.B(Integer.valueOf(iA4));
                            lVarA4.f(Integer.valueOf(iA4), pVarB4);
                        }
                        p020r2.d4.b(lVarA4, dVarE111111114, companion2.d());
                        body.invoke(lVarV, Integer.valueOf((i26 >> 18) & 14));
                        lVarV.g();
                        androidx.compose.ui.d dVarB1114 = v1.i.b(jVar, companion1116, ((Number) pair118.f()).floatValue(), false, 2, null);
                        z3.i0 i0VarH1111118 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                        iA5 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC111111115 = lVarV.c();
                        androidx.compose.ui.d dVarE111111115 = androidx.compose.ui.c.e(lVarV, dVarB1114);
                        aVarA5 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA5);
                        } else {
                            lVarV.d();
                        }
                        lVarA5 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA5, i0VarH1111118, companion2.c());
                        p020r2.d4.b(lVarA5, xVarC111111115, companion2.e());
                        pVarB5 = companion2.b();
                        if (lVarA5.getInserting()) {
                            lVarA5.B(Integer.valueOf(iA5));
                            lVarA5.f(Integer.valueOf(iA5), pVarB5);
                        } else {
                            lVarA5.B(Integer.valueOf(iA5));
                            lVarA5.f(Integer.valueOf(iA5), pVarB5);
                        }
                        p020r2.d4.b(lVarA5, dVarE111111115, companion2.d());
                        footer.invoke(lVarV, Integer.valueOf((i26 >> 21) & 14));
                        lVarV.g();
                        lVarV.g();
                        lVarV.g();
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        pVar3 = pVar2;
                        qVar3 = qVar2;
                        aVar4 = aVar3;
                        str2 = str3;
                        j13 = j12;
                        pair3 = pair118;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        final androidx.compose.ui.d dVar11 = dVar2;
                        final String str12 = str2;
                        final Pair pair119 = pair3;
                        w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.wq0
                            @Override // wn0.p
                            public final Object invoke(Object obj, Object obj2) {
                                return UD.a(dVar11, j13, str12, closeImageSource, pVar3, qVar3, body, footer, aVar4, pair119, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 100663296;
                if ((i11 & 805306368) != 0) {
                    i13 |= ((i12 & 512) == 0 || !lVarV.n(pair)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                if ((i13 & 306783379) == 306783378) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i31 != 0) {
                            jI = k3.p1.INSTANCE.i();
                        }
                        if (i14 != 0) {
                            str2 = null;
                        }
                        if (i17 != 0) {
                            pVar2 = null;
                        }
                        if (i19 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        if (i24 != 0) {
                            aVar2 = null;
                        } else {
                            aVar2 = aVar;
                        }
                        if ((i12 & 512) != 0) {
                            pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                            i13 &= -1879048193;
                            qVar2 = qVar2;
                        } else {
                            pair2 = pair;
                        }
                        j12 = jI;
                        aVar3 = aVar2;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i31 != 0) {
                            jI = k3.p1.INSTANCE.i();
                        }
                        if (i14 != 0) {
                            str2 = null;
                        }
                        if (i17 != 0) {
                            pVar2 = null;
                        }
                        if (i19 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        if (i24 != 0) {
                            aVar2 = null;
                        } else {
                            aVar2 = aVar;
                        }
                        if ((i12 & 512) != 0) {
                            pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                            i13 &= -1879048193;
                            qVar2 = qVar2;
                        } else {
                            pair2 = pair;
                        }
                        j12 = jI;
                        aVar3 = aVar2;
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(72921645, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerOverlayScaffold (VisionScannerOverlayScaffold.kt:54)");
                    }
                    lVarV.o(-1858078478);
                    objI = lVarV.I();
                    if (objI == p020r2.l.INSTANCE.a()) {
                        objI = new wn0.l() { // from class: com.fourthline.orca.internal.vq0
                            @Override // wn0.l
                            public final Object invoke(Object obj) {
                                return UD.a((g4.y) obj);
                            }
                        };
                        lVarV.B(objI);
                    }
                    lVarV.l();
                    i26 = i13;
                    androidx.compose.ui.d dVarD18 = androidx.compose.foundation.b.d(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), j12, null, 2, null);
                    companion = d3.c.INSTANCE;
                    z3.i0 i0VarH1111119 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                    iA = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC111111116 = lVarV.c();
                    androidx.compose.ui.d dVarE111111116 = androidx.compose.ui.c.e(lVarV, dVarD18);
                    companion2 = b4.g.INSTANCE;
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
                    Pair pair1110 = pair2;
                    p020r2.d4.b(lVarA, i0VarH1111119, companion2.c());
                    p020r2.d4.b(lVarA, xVarC111111116, companion2.e());
                    pVarB = companion2.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    p020r2.d4.b(lVarA, dVarE111111116, companion2.d());
                    androidx.compose.foundation.layout.i iVar18 = androidx.compose.foundation.layout.i.f4585a;
                    lVarV.o(-1038937986);
                    if (pVar2 != null) {
                        pVar2.invoke(lVarV, Integer.valueOf((i26 >> 12) & 14));
                        jn0.h0 h0Var111112 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    lVarV.o(-1038935796);
                    if (aVar3 == null) {
                        i27 = 1;
                    } else {
                        androidx.compose.ui.d.Companion companion1117 = androidx.compose.ui.d.INSTANCE;
                        androidx.compose.ui.d dVarM1115 = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.h(companion1117, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                        z3.i0 i0VarH11111110 = androidx.compose.foundation.layout.g.h(companion.n(), false);
                        iA2 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC111111117 = lVarV.c();
                        androidx.compose.ui.d dVarE111111117 = androidx.compose.ui.c.e(lVarV, dVarM1115);
                        aVarA2 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA2);
                        } else {
                            lVarV.d();
                        }
                        lVarA2 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA2, i0VarH11111110, companion2.c());
                        p020r2.d4.b(lVarA2, xVarC111111117, companion2.e());
                        pVarB2 = companion2.b();
                        if (lVarA2.getInserting()) {
                            lVarA2.B(Integer.valueOf(iA2));
                            lVarA2.f(Integer.valueOf(iA2), pVarB2);
                        } else {
                            lVarA2.B(Integer.valueOf(iA2));
                            lVarA2.f(Integer.valueOf(iA2), pVarB2);
                        }
                        p020r2.d4.b(lVarA2, dVarE111111117, companion2.d());
                        i27 = 1;
                        C4670d1.a(aVar3, AbstractC3307gk.a(AbstractC3307gk.a(AbstractC3307gk.a(companion1117, "closeButton", (String) null, 2, (Object) null), 199.0f), RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close_acessibility, 0, 2, null), lVarV, 0), false, 2, (Object) null), false, null, z2.c.e(1519979611, true, new a(closeImageSource), lVarV, 54), lVarV, 24576, 12);
                        lVarV.g();
                        jn0.h0 h0Var111113 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    lVarV.o(-1038906739);
                    if (str2 != null) {
                        float f118 = 32;
                        str3 = str2;
                        Zg.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, w4.h.g(f118), w4.h.g(f118), w4.h.g(48), BitmapDescriptorFactory.HUE_RED, 8, null), BitmapDescriptorFactory.HUE_RED, i27, null), str3, null, k3.p1.INSTANCE.k(), null, null, lVarV, ((i26 >> 3) & 112) | 3072, 52);
                    } else {
                        str3 = str2;
                    }
                    lVarV.l();
                    if (qVar2 != null) {
                        i28 = 80;
                    } else {
                        i28 = 156;
                    }
                    androidx.compose.ui.d dVarM1116 = androidx.compose.foundation.layout.t.m(v1.p0.c(dVar2, v1.s0.d(v1.m0.INSTANCE, lVarV, 6)), BitmapDescriptorFactory.HUE_RED, w4.h.g(i28), BitmapDescriptorFactory.HUE_RED, C3825sp.f35377a.c(lVarV, 6).f(), 5, null);
                    z3.i0 i0VarA18 = v1.g.a(v1.b.f117444a.g(), companion.g(), lVarV, 48);
                    iA3 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC111111118 = lVarV.c();
                    androidx.compose.ui.d dVarE111111118 = androidx.compose.ui.c.e(lVarV, dVarM1116);
                    aVarA3 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA3);
                    } else {
                        lVarV.d();
                    }
                    lVarA3 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA3, i0VarA18, companion2.c());
                    p020r2.d4.b(lVarA3, xVarC111111118, companion2.e());
                    pVarB3 = companion2.b();
                    if (lVarA3.getInserting()) {
                        lVarA3.B(Integer.valueOf(iA3));
                        lVarA3.f(Integer.valueOf(iA3), pVarB3);
                    } else {
                        lVarA3.B(Integer.valueOf(iA3));
                        lVarA3.f(Integer.valueOf(iA3), pVarB3);
                    }
                    p020r2.d4.b(lVarA3, dVarE111111118, companion2.d());
                    jVar = v1.j.f117505a;
                    lVarV.o(915714536);
                    if (qVar2 != null) {
                        qVar2.invoke(jVar, lVarV, Integer.valueOf(((i26 >> 12) & 112) | 6));
                        jn0.h0 h0Var111114 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    androidx.compose.ui.d.Companion companion1118 = androidx.compose.ui.d.INSTANCE;
                    androidx.compose.ui.d dVarB1115 = v1.i.b(jVar, companion1118, ((Number) pair1110.e()).floatValue(), false, 2, null);
                    z3.i0 i0VarH11111111 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                    iA4 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC111111119 = lVarV.c();
                    androidx.compose.ui.d dVarE111111119 = androidx.compose.ui.c.e(lVarV, dVarB1115);
                    aVarA4 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA4);
                    } else {
                        lVarV.d();
                    }
                    lVarA4 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA4, i0VarH11111111, companion2.c());
                    p020r2.d4.b(lVarA4, xVarC111111119, companion2.e());
                    pVarB4 = companion2.b();
                    if (lVarA4.getInserting()) {
                        lVarA4.B(Integer.valueOf(iA4));
                        lVarA4.f(Integer.valueOf(iA4), pVarB4);
                    } else {
                        lVarA4.B(Integer.valueOf(iA4));
                        lVarA4.f(Integer.valueOf(iA4), pVarB4);
                    }
                    p020r2.d4.b(lVarA4, dVarE111111119, companion2.d());
                    body.invoke(lVarV, Integer.valueOf((i26 >> 18) & 14));
                    lVarV.g();
                    androidx.compose.ui.d dVarB1116 = v1.i.b(jVar, companion1118, ((Number) pair1110.f()).floatValue(), false, 2, null);
                    z3.i0 i0VarH11111112 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                    iA5 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC1111111110 = lVarV.c();
                    androidx.compose.ui.d dVarE1111111110 = androidx.compose.ui.c.e(lVarV, dVarB1116);
                    aVarA5 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA5);
                    } else {
                        lVarV.d();
                    }
                    lVarA5 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA5, i0VarH11111112, companion2.c());
                    p020r2.d4.b(lVarA5, xVarC1111111110, companion2.e());
                    pVarB5 = companion2.b();
                    if (lVarA5.getInserting()) {
                        lVarA5.B(Integer.valueOf(iA5));
                        lVarA5.f(Integer.valueOf(iA5), pVarB5);
                    } else {
                        lVarA5.B(Integer.valueOf(iA5));
                        lVarA5.f(Integer.valueOf(iA5), pVarB5);
                    }
                    p020r2.d4.b(lVarA5, dVarE1111111110, companion2.d());
                    footer.invoke(lVarV, Integer.valueOf((i26 >> 21) & 14));
                    lVarV.g();
                    lVarV.g();
                    lVarV.g();
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    pVar3 = pVar2;
                    qVar3 = qVar2;
                    aVar4 = aVar3;
                    str2 = str3;
                    j13 = j12;
                    pair3 = pair1110;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i31 != 0) {
                            jI = k3.p1.INSTANCE.i();
                        }
                        if (i14 != 0) {
                            str2 = null;
                        }
                        if (i17 != 0) {
                            pVar2 = null;
                        }
                        if (i19 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        if (i24 != 0) {
                            aVar2 = null;
                        } else {
                            aVar2 = aVar;
                        }
                        if ((i12 & 512) != 0) {
                            pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                            i13 &= -1879048193;
                            qVar2 = qVar2;
                        } else {
                            pair2 = pair;
                        }
                        j12 = jI;
                        aVar3 = aVar2;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i31 != 0) {
                            jI = k3.p1.INSTANCE.i();
                        }
                        if (i14 != 0) {
                            str2 = null;
                        }
                        if (i17 != 0) {
                            pVar2 = null;
                        }
                        if (i19 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        if (i24 != 0) {
                            aVar2 = null;
                        } else {
                            aVar2 = aVar;
                        }
                        if ((i12 & 512) != 0) {
                            pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                            i13 &= -1879048193;
                            qVar2 = qVar2;
                        } else {
                            pair2 = pair;
                        }
                        j12 = jI;
                        aVar3 = aVar2;
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(72921645, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerOverlayScaffold (VisionScannerOverlayScaffold.kt:54)");
                    }
                    lVarV.o(-1858078478);
                    objI = lVarV.I();
                    if (objI == p020r2.l.INSTANCE.a()) {
                        objI = new wn0.l() { // from class: com.fourthline.orca.internal.vq0
                            @Override // wn0.l
                            public final Object invoke(Object obj) {
                                return UD.a((g4.y) obj);
                            }
                        };
                        lVarV.B(objI);
                    }
                    lVarV.l();
                    i26 = i13;
                    androidx.compose.ui.d dVarD19 = androidx.compose.foundation.b.d(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), j12, null, 2, null);
                    companion = d3.c.INSTANCE;
                    z3.i0 i0VarH11111113 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                    iA = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC1111111111 = lVarV.c();
                    androidx.compose.ui.d dVarE1111111111 = androidx.compose.ui.c.e(lVarV, dVarD19);
                    companion2 = b4.g.INSTANCE;
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
                    Pair pair1111 = pair2;
                    p020r2.d4.b(lVarA, i0VarH11111113, companion2.c());
                    p020r2.d4.b(lVarA, xVarC1111111111, companion2.e());
                    pVarB = companion2.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    p020r2.d4.b(lVarA, dVarE1111111111, companion2.d());
                    androidx.compose.foundation.layout.i iVar19 = androidx.compose.foundation.layout.i.f4585a;
                    lVarV.o(-1038937986);
                    if (pVar2 != null) {
                        pVar2.invoke(lVarV, Integer.valueOf((i26 >> 12) & 14));
                        jn0.h0 h0Var111115 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    lVarV.o(-1038935796);
                    if (aVar3 == null) {
                        i27 = 1;
                    } else {
                        androidx.compose.ui.d.Companion companion1119 = androidx.compose.ui.d.INSTANCE;
                        androidx.compose.ui.d dVarM1117 = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.h(companion1119, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                        z3.i0 i0VarH11111114 = androidx.compose.foundation.layout.g.h(companion.n(), false);
                        iA2 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC1111111112 = lVarV.c();
                        androidx.compose.ui.d dVarE1111111112 = androidx.compose.ui.c.e(lVarV, dVarM1117);
                        aVarA2 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA2);
                        } else {
                            lVarV.d();
                        }
                        lVarA2 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA2, i0VarH11111114, companion2.c());
                        p020r2.d4.b(lVarA2, xVarC1111111112, companion2.e());
                        pVarB2 = companion2.b();
                        if (lVarA2.getInserting()) {
                            lVarA2.B(Integer.valueOf(iA2));
                            lVarA2.f(Integer.valueOf(iA2), pVarB2);
                        } else {
                            lVarA2.B(Integer.valueOf(iA2));
                            lVarA2.f(Integer.valueOf(iA2), pVarB2);
                        }
                        p020r2.d4.b(lVarA2, dVarE1111111112, companion2.d());
                        i27 = 1;
                        C4670d1.a(aVar3, AbstractC3307gk.a(AbstractC3307gk.a(AbstractC3307gk.a(companion1119, "closeButton", (String) null, 2, (Object) null), 199.0f), RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close_acessibility, 0, 2, null), lVarV, 0), false, 2, (Object) null), false, null, z2.c.e(1519979611, true, new a(closeImageSource), lVarV, 54), lVarV, 24576, 12);
                        lVarV.g();
                        jn0.h0 h0Var111116 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    lVarV.o(-1038906739);
                    if (str2 != null) {
                        float f119 = 32;
                        str3 = str2;
                        Zg.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, w4.h.g(f119), w4.h.g(f119), w4.h.g(48), BitmapDescriptorFactory.HUE_RED, 8, null), BitmapDescriptorFactory.HUE_RED, i27, null), str3, null, k3.p1.INSTANCE.k(), null, null, lVarV, ((i26 >> 3) & 112) | 3072, 52);
                    } else {
                        str3 = str2;
                    }
                    lVarV.l();
                    if (qVar2 != null) {
                        i28 = 80;
                    } else {
                        i28 = 156;
                    }
                    androidx.compose.ui.d dVarM1118 = androidx.compose.foundation.layout.t.m(v1.p0.c(dVar2, v1.s0.d(v1.m0.INSTANCE, lVarV, 6)), BitmapDescriptorFactory.HUE_RED, w4.h.g(i28), BitmapDescriptorFactory.HUE_RED, C3825sp.f35377a.c(lVarV, 6).f(), 5, null);
                    z3.i0 i0VarA19 = v1.g.a(v1.b.f117444a.g(), companion.g(), lVarV, 48);
                    iA3 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC1111111113 = lVarV.c();
                    androidx.compose.ui.d dVarE1111111113 = androidx.compose.ui.c.e(lVarV, dVarM1118);
                    aVarA3 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA3);
                    } else {
                        lVarV.d();
                    }
                    lVarA3 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA3, i0VarA19, companion2.c());
                    p020r2.d4.b(lVarA3, xVarC1111111113, companion2.e());
                    pVarB3 = companion2.b();
                    if (lVarA3.getInserting()) {
                        lVarA3.B(Integer.valueOf(iA3));
                        lVarA3.f(Integer.valueOf(iA3), pVarB3);
                    } else {
                        lVarA3.B(Integer.valueOf(iA3));
                        lVarA3.f(Integer.valueOf(iA3), pVarB3);
                    }
                    p020r2.d4.b(lVarA3, dVarE1111111113, companion2.d());
                    jVar = v1.j.f117505a;
                    lVarV.o(915714536);
                    if (qVar2 != null) {
                        qVar2.invoke(jVar, lVarV, Integer.valueOf(((i26 >> 12) & 112) | 6));
                        jn0.h0 h0Var111117 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    androidx.compose.ui.d.Companion companion11110 = androidx.compose.ui.d.INSTANCE;
                    androidx.compose.ui.d dVarB1117 = v1.i.b(jVar, companion11110, ((Number) pair1111.e()).floatValue(), false, 2, null);
                    z3.i0 i0VarH11111115 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                    iA4 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC1111111114 = lVarV.c();
                    androidx.compose.ui.d dVarE1111111114 = androidx.compose.ui.c.e(lVarV, dVarB1117);
                    aVarA4 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA4);
                    } else {
                        lVarV.d();
                    }
                    lVarA4 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA4, i0VarH11111115, companion2.c());
                    p020r2.d4.b(lVarA4, xVarC1111111114, companion2.e());
                    pVarB4 = companion2.b();
                    if (lVarA4.getInserting()) {
                        lVarA4.B(Integer.valueOf(iA4));
                        lVarA4.f(Integer.valueOf(iA4), pVarB4);
                    } else {
                        lVarA4.B(Integer.valueOf(iA4));
                        lVarA4.f(Integer.valueOf(iA4), pVarB4);
                    }
                    p020r2.d4.b(lVarA4, dVarE1111111114, companion2.d());
                    body.invoke(lVarV, Integer.valueOf((i26 >> 18) & 14));
                    lVarV.g();
                    androidx.compose.ui.d dVarB1118 = v1.i.b(jVar, companion11110, ((Number) pair1111.f()).floatValue(), false, 2, null);
                    z3.i0 i0VarH11111116 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                    iA5 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC1111111115 = lVarV.c();
                    androidx.compose.ui.d dVarE1111111115 = androidx.compose.ui.c.e(lVarV, dVarB1118);
                    aVarA5 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA5);
                    } else {
                        lVarV.d();
                    }
                    lVarA5 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA5, i0VarH11111116, companion2.c());
                    p020r2.d4.b(lVarA5, xVarC1111111115, companion2.e());
                    pVarB5 = companion2.b();
                    if (lVarA5.getInserting()) {
                        lVarA5.B(Integer.valueOf(iA5));
                        lVarA5.f(Integer.valueOf(iA5), pVarB5);
                    } else {
                        lVarA5.B(Integer.valueOf(iA5));
                        lVarA5.f(Integer.valueOf(iA5), pVarB5);
                    }
                    p020r2.d4.b(lVarA5, dVarE1111111115, companion2.d());
                    footer.invoke(lVarV, Integer.valueOf((i26 >> 21) & 14));
                    lVarV.g();
                    lVarV.g();
                    lVarV.g();
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    pVar3 = pVar2;
                    qVar3 = qVar2;
                    aVar4 = aVar3;
                    str2 = str3;
                    j13 = j12;
                    pair3 = pair1111;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    final androidx.compose.ui.d dVar12 = dVar2;
                    final String str13 = str2;
                    final Pair pair1112 = pair3;
                    w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.wq0
                        @Override // wn0.p
                        public final Object invoke(Object obj, Object obj2) {
                            return UD.a(dVar12, j13, str13, closeImageSource, pVar3, qVar3, body, footer, aVar4, pair1112, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            pVar2 = pVar;
            i19 = i12 & 32;
            if (i19 != 0) {
                i13 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (lVarV.K(qVar)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            }
            if ((i12 & 64) != 0) {
                i13 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (lVarV.K(body)) {
                    i22 = PKIFailureInfo.badCertTemplate;
                } else {
                    i22 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i22;
            }
            if ((i12 & 128) != 0) {
                i13 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                if (lVarV.K(footer)) {
                    i23 = 8388608;
                } else {
                    i23 = 4194304;
                }
                i13 |= i23;
            }
            i24 = i12 & 256;
            if (i24 != 0) {
                if ((i11 & 100663296) == 0) {
                    if (lVarV.K(aVar)) {
                        i25 = 67108864;
                    } else {
                        i25 = 33554432;
                    }
                    i13 |= i25;
                }
                if ((i11 & 805306368) != 0) {
                    i13 |= ((i12 & 512) == 0 || !lVarV.n(pair)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                if ((i13 & 306783379) == 306783378) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i31 != 0) {
                            jI = k3.p1.INSTANCE.i();
                        }
                        if (i14 != 0) {
                            str2 = null;
                        }
                        if (i17 != 0) {
                            pVar2 = null;
                        }
                        if (i19 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        if (i24 != 0) {
                            aVar2 = null;
                        } else {
                            aVar2 = aVar;
                        }
                        if ((i12 & 512) != 0) {
                            pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                            i13 &= -1879048193;
                            qVar2 = qVar2;
                        } else {
                            pair2 = pair;
                        }
                        j12 = jI;
                        aVar3 = aVar2;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i31 != 0) {
                            jI = k3.p1.INSTANCE.i();
                        }
                        if (i14 != 0) {
                            str2 = null;
                        }
                        if (i17 != 0) {
                            pVar2 = null;
                        }
                        if (i19 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        if (i24 != 0) {
                            aVar2 = null;
                        } else {
                            aVar2 = aVar;
                        }
                        if ((i12 & 512) != 0) {
                            pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                            i13 &= -1879048193;
                            qVar2 = qVar2;
                        } else {
                            pair2 = pair;
                        }
                        j12 = jI;
                        aVar3 = aVar2;
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(72921645, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerOverlayScaffold (VisionScannerOverlayScaffold.kt:54)");
                    }
                    lVarV.o(-1858078478);
                    objI = lVarV.I();
                    if (objI == p020r2.l.INSTANCE.a()) {
                        objI = new wn0.l() { // from class: com.fourthline.orca.internal.vq0
                            @Override // wn0.l
                            public final Object invoke(Object obj) {
                                return UD.a((g4.y) obj);
                            }
                        };
                        lVarV.B(objI);
                    }
                    lVarV.l();
                    i26 = i13;
                    androidx.compose.ui.d dVarD110 = androidx.compose.foundation.b.d(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), j12, null, 2, null);
                    companion = d3.c.INSTANCE;
                    z3.i0 i0VarH11111117 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                    iA = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC1111111116 = lVarV.c();
                    androidx.compose.ui.d dVarE1111111116 = androidx.compose.ui.c.e(lVarV, dVarD110);
                    companion2 = b4.g.INSTANCE;
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
                    Pair pair1113 = pair2;
                    p020r2.d4.b(lVarA, i0VarH11111117, companion2.c());
                    p020r2.d4.b(lVarA, xVarC1111111116, companion2.e());
                    pVarB = companion2.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    p020r2.d4.b(lVarA, dVarE1111111116, companion2.d());
                    androidx.compose.foundation.layout.i iVar110 = androidx.compose.foundation.layout.i.f4585a;
                    lVarV.o(-1038937986);
                    if (pVar2 != null) {
                        pVar2.invoke(lVarV, Integer.valueOf((i26 >> 12) & 14));
                        jn0.h0 h0Var111118 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    lVarV.o(-1038935796);
                    if (aVar3 == null) {
                        i27 = 1;
                    } else {
                        androidx.compose.ui.d.Companion companion11111 = androidx.compose.ui.d.INSTANCE;
                        androidx.compose.ui.d dVarM1119 = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.h(companion11111, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                        z3.i0 i0VarH11111118 = androidx.compose.foundation.layout.g.h(companion.n(), false);
                        iA2 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC1111111117 = lVarV.c();
                        androidx.compose.ui.d dVarE1111111117 = androidx.compose.ui.c.e(lVarV, dVarM1119);
                        aVarA2 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA2);
                        } else {
                            lVarV.d();
                        }
                        lVarA2 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA2, i0VarH11111118, companion2.c());
                        p020r2.d4.b(lVarA2, xVarC1111111117, companion2.e());
                        pVarB2 = companion2.b();
                        if (lVarA2.getInserting()) {
                            lVarA2.B(Integer.valueOf(iA2));
                            lVarA2.f(Integer.valueOf(iA2), pVarB2);
                        } else {
                            lVarA2.B(Integer.valueOf(iA2));
                            lVarA2.f(Integer.valueOf(iA2), pVarB2);
                        }
                        p020r2.d4.b(lVarA2, dVarE1111111117, companion2.d());
                        i27 = 1;
                        C4670d1.a(aVar3, AbstractC3307gk.a(AbstractC3307gk.a(AbstractC3307gk.a(companion11111, "closeButton", (String) null, 2, (Object) null), 199.0f), RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close_acessibility, 0, 2, null), lVarV, 0), false, 2, (Object) null), false, null, z2.c.e(1519979611, true, new a(closeImageSource), lVarV, 54), lVarV, 24576, 12);
                        lVarV.g();
                        jn0.h0 h0Var111119 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    lVarV.o(-1038906739);
                    if (str2 != null) {
                        float f1110 = 32;
                        str3 = str2;
                        Zg.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, w4.h.g(f1110), w4.h.g(f1110), w4.h.g(48), BitmapDescriptorFactory.HUE_RED, 8, null), BitmapDescriptorFactory.HUE_RED, i27, null), str3, null, k3.p1.INSTANCE.k(), null, null, lVarV, ((i26 >> 3) & 112) | 3072, 52);
                    } else {
                        str3 = str2;
                    }
                    lVarV.l();
                    if (qVar2 != null) {
                        i28 = 80;
                    } else {
                        i28 = 156;
                    }
                    androidx.compose.ui.d dVarM11110 = androidx.compose.foundation.layout.t.m(v1.p0.c(dVar2, v1.s0.d(v1.m0.INSTANCE, lVarV, 6)), BitmapDescriptorFactory.HUE_RED, w4.h.g(i28), BitmapDescriptorFactory.HUE_RED, C3825sp.f35377a.c(lVarV, 6).f(), 5, null);
                    z3.i0 i0VarA110 = v1.g.a(v1.b.f117444a.g(), companion.g(), lVarV, 48);
                    iA3 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC1111111118 = lVarV.c();
                    androidx.compose.ui.d dVarE1111111118 = androidx.compose.ui.c.e(lVarV, dVarM11110);
                    aVarA3 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA3);
                    } else {
                        lVarV.d();
                    }
                    lVarA3 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA3, i0VarA110, companion2.c());
                    p020r2.d4.b(lVarA3, xVarC1111111118, companion2.e());
                    pVarB3 = companion2.b();
                    if (lVarA3.getInserting()) {
                        lVarA3.B(Integer.valueOf(iA3));
                        lVarA3.f(Integer.valueOf(iA3), pVarB3);
                    } else {
                        lVarA3.B(Integer.valueOf(iA3));
                        lVarA3.f(Integer.valueOf(iA3), pVarB3);
                    }
                    p020r2.d4.b(lVarA3, dVarE1111111118, companion2.d());
                    jVar = v1.j.f117505a;
                    lVarV.o(915714536);
                    if (qVar2 != null) {
                        qVar2.invoke(jVar, lVarV, Integer.valueOf(((i26 >> 12) & 112) | 6));
                        jn0.h0 h0Var1111110 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    androidx.compose.ui.d.Companion companion11112 = androidx.compose.ui.d.INSTANCE;
                    androidx.compose.ui.d dVarB1119 = v1.i.b(jVar, companion11112, ((Number) pair1113.e()).floatValue(), false, 2, null);
                    z3.i0 i0VarH11111119 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                    iA4 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC1111111119 = lVarV.c();
                    androidx.compose.ui.d dVarE1111111119 = androidx.compose.ui.c.e(lVarV, dVarB1119);
                    aVarA4 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA4);
                    } else {
                        lVarV.d();
                    }
                    lVarA4 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA4, i0VarH11111119, companion2.c());
                    p020r2.d4.b(lVarA4, xVarC1111111119, companion2.e());
                    pVarB4 = companion2.b();
                    if (lVarA4.getInserting()) {
                        lVarA4.B(Integer.valueOf(iA4));
                        lVarA4.f(Integer.valueOf(iA4), pVarB4);
                    } else {
                        lVarA4.B(Integer.valueOf(iA4));
                        lVarA4.f(Integer.valueOf(iA4), pVarB4);
                    }
                    p020r2.d4.b(lVarA4, dVarE1111111119, companion2.d());
                    body.invoke(lVarV, Integer.valueOf((i26 >> 18) & 14));
                    lVarV.g();
                    androidx.compose.ui.d dVarB11110 = v1.i.b(jVar, companion11112, ((Number) pair1113.f()).floatValue(), false, 2, null);
                    z3.i0 i0VarH111111110 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                    iA5 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC11111111110 = lVarV.c();
                    androidx.compose.ui.d dVarE11111111110 = androidx.compose.ui.c.e(lVarV, dVarB11110);
                    aVarA5 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA5);
                    } else {
                        lVarV.d();
                    }
                    lVarA5 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA5, i0VarH111111110, companion2.c());
                    p020r2.d4.b(lVarA5, xVarC11111111110, companion2.e());
                    pVarB5 = companion2.b();
                    if (lVarA5.getInserting()) {
                        lVarA5.B(Integer.valueOf(iA5));
                        lVarA5.f(Integer.valueOf(iA5), pVarB5);
                    } else {
                        lVarA5.B(Integer.valueOf(iA5));
                        lVarA5.f(Integer.valueOf(iA5), pVarB5);
                    }
                    p020r2.d4.b(lVarA5, dVarE11111111110, companion2.d());
                    footer.invoke(lVarV, Integer.valueOf((i26 >> 21) & 14));
                    lVarV.g();
                    lVarV.g();
                    lVarV.g();
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    pVar3 = pVar2;
                    qVar3 = qVar2;
                    aVar4 = aVar3;
                    str2 = str3;
                    j13 = j12;
                    pair3 = pair1113;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i31 != 0) {
                            jI = k3.p1.INSTANCE.i();
                        }
                        if (i14 != 0) {
                            str2 = null;
                        }
                        if (i17 != 0) {
                            pVar2 = null;
                        }
                        if (i19 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        if (i24 != 0) {
                            aVar2 = null;
                        } else {
                            aVar2 = aVar;
                        }
                        if ((i12 & 512) != 0) {
                            pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                            i13 &= -1879048193;
                            qVar2 = qVar2;
                        } else {
                            pair2 = pair;
                        }
                        j12 = jI;
                        aVar3 = aVar2;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i31 != 0) {
                            jI = k3.p1.INSTANCE.i();
                        }
                        if (i14 != 0) {
                            str2 = null;
                        }
                        if (i17 != 0) {
                            pVar2 = null;
                        }
                        if (i19 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        if (i24 != 0) {
                            aVar2 = null;
                        } else {
                            aVar2 = aVar;
                        }
                        if ((i12 & 512) != 0) {
                            pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                            i13 &= -1879048193;
                            qVar2 = qVar2;
                        } else {
                            pair2 = pair;
                        }
                        j12 = jI;
                        aVar3 = aVar2;
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(72921645, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerOverlayScaffold (VisionScannerOverlayScaffold.kt:54)");
                    }
                    lVarV.o(-1858078478);
                    objI = lVarV.I();
                    if (objI == p020r2.l.INSTANCE.a()) {
                        objI = new wn0.l() { // from class: com.fourthline.orca.internal.vq0
                            @Override // wn0.l
                            public final Object invoke(Object obj) {
                                return UD.a((g4.y) obj);
                            }
                        };
                        lVarV.B(objI);
                    }
                    lVarV.l();
                    i26 = i13;
                    androidx.compose.ui.d dVarD111 = androidx.compose.foundation.b.d(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), j12, null, 2, null);
                    companion = d3.c.INSTANCE;
                    z3.i0 i0VarH111111111 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                    iA = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC11111111111 = lVarV.c();
                    androidx.compose.ui.d dVarE11111111111 = androidx.compose.ui.c.e(lVarV, dVarD111);
                    companion2 = b4.g.INSTANCE;
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
                    Pair pair1114 = pair2;
                    p020r2.d4.b(lVarA, i0VarH111111111, companion2.c());
                    p020r2.d4.b(lVarA, xVarC11111111111, companion2.e());
                    pVarB = companion2.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    p020r2.d4.b(lVarA, dVarE11111111111, companion2.d());
                    androidx.compose.foundation.layout.i iVar111 = androidx.compose.foundation.layout.i.f4585a;
                    lVarV.o(-1038937986);
                    if (pVar2 != null) {
                        pVar2.invoke(lVarV, Integer.valueOf((i26 >> 12) & 14));
                        jn0.h0 h0Var1111111 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    lVarV.o(-1038935796);
                    if (aVar3 == null) {
                        i27 = 1;
                    } else {
                        androidx.compose.ui.d.Companion companion11113 = androidx.compose.ui.d.INSTANCE;
                        androidx.compose.ui.d dVarM11111 = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.h(companion11113, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                        z3.i0 i0VarH111111112 = androidx.compose.foundation.layout.g.h(companion.n(), false);
                        iA2 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC11111111112 = lVarV.c();
                        androidx.compose.ui.d dVarE11111111112 = androidx.compose.ui.c.e(lVarV, dVarM11111);
                        aVarA2 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA2);
                        } else {
                            lVarV.d();
                        }
                        lVarA2 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA2, i0VarH111111112, companion2.c());
                        p020r2.d4.b(lVarA2, xVarC11111111112, companion2.e());
                        pVarB2 = companion2.b();
                        if (lVarA2.getInserting()) {
                            lVarA2.B(Integer.valueOf(iA2));
                            lVarA2.f(Integer.valueOf(iA2), pVarB2);
                        } else {
                            lVarA2.B(Integer.valueOf(iA2));
                            lVarA2.f(Integer.valueOf(iA2), pVarB2);
                        }
                        p020r2.d4.b(lVarA2, dVarE11111111112, companion2.d());
                        i27 = 1;
                        C4670d1.a(aVar3, AbstractC3307gk.a(AbstractC3307gk.a(AbstractC3307gk.a(companion11113, "closeButton", (String) null, 2, (Object) null), 199.0f), RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close_acessibility, 0, 2, null), lVarV, 0), false, 2, (Object) null), false, null, z2.c.e(1519979611, true, new a(closeImageSource), lVarV, 54), lVarV, 24576, 12);
                        lVarV.g();
                        jn0.h0 h0Var1111112 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    lVarV.o(-1038906739);
                    if (str2 != null) {
                        float f1111 = 32;
                        str3 = str2;
                        Zg.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, w4.h.g(f1111), w4.h.g(f1111), w4.h.g(48), BitmapDescriptorFactory.HUE_RED, 8, null), BitmapDescriptorFactory.HUE_RED, i27, null), str3, null, k3.p1.INSTANCE.k(), null, null, lVarV, ((i26 >> 3) & 112) | 3072, 52);
                    } else {
                        str3 = str2;
                    }
                    lVarV.l();
                    if (qVar2 != null) {
                        i28 = 80;
                    } else {
                        i28 = 156;
                    }
                    androidx.compose.ui.d dVarM11112 = androidx.compose.foundation.layout.t.m(v1.p0.c(dVar2, v1.s0.d(v1.m0.INSTANCE, lVarV, 6)), BitmapDescriptorFactory.HUE_RED, w4.h.g(i28), BitmapDescriptorFactory.HUE_RED, C3825sp.f35377a.c(lVarV, 6).f(), 5, null);
                    z3.i0 i0VarA111 = v1.g.a(v1.b.f117444a.g(), companion.g(), lVarV, 48);
                    iA3 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC11111111113 = lVarV.c();
                    androidx.compose.ui.d dVarE11111111113 = androidx.compose.ui.c.e(lVarV, dVarM11112);
                    aVarA3 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA3);
                    } else {
                        lVarV.d();
                    }
                    lVarA3 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA3, i0VarA111, companion2.c());
                    p020r2.d4.b(lVarA3, xVarC11111111113, companion2.e());
                    pVarB3 = companion2.b();
                    if (lVarA3.getInserting()) {
                        lVarA3.B(Integer.valueOf(iA3));
                        lVarA3.f(Integer.valueOf(iA3), pVarB3);
                    } else {
                        lVarA3.B(Integer.valueOf(iA3));
                        lVarA3.f(Integer.valueOf(iA3), pVarB3);
                    }
                    p020r2.d4.b(lVarA3, dVarE11111111113, companion2.d());
                    jVar = v1.j.f117505a;
                    lVarV.o(915714536);
                    if (qVar2 != null) {
                        qVar2.invoke(jVar, lVarV, Integer.valueOf(((i26 >> 12) & 112) | 6));
                        jn0.h0 h0Var1111113 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    androidx.compose.ui.d.Companion companion11114 = androidx.compose.ui.d.INSTANCE;
                    androidx.compose.ui.d dVarB11111 = v1.i.b(jVar, companion11114, ((Number) pair1114.e()).floatValue(), false, 2, null);
                    z3.i0 i0VarH111111113 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                    iA4 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC11111111114 = lVarV.c();
                    androidx.compose.ui.d dVarE11111111114 = androidx.compose.ui.c.e(lVarV, dVarB11111);
                    aVarA4 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA4);
                    } else {
                        lVarV.d();
                    }
                    lVarA4 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA4, i0VarH111111113, companion2.c());
                    p020r2.d4.b(lVarA4, xVarC11111111114, companion2.e());
                    pVarB4 = companion2.b();
                    if (lVarA4.getInserting()) {
                        lVarA4.B(Integer.valueOf(iA4));
                        lVarA4.f(Integer.valueOf(iA4), pVarB4);
                    } else {
                        lVarA4.B(Integer.valueOf(iA4));
                        lVarA4.f(Integer.valueOf(iA4), pVarB4);
                    }
                    p020r2.d4.b(lVarA4, dVarE11111111114, companion2.d());
                    body.invoke(lVarV, Integer.valueOf((i26 >> 18) & 14));
                    lVarV.g();
                    androidx.compose.ui.d dVarB11112 = v1.i.b(jVar, companion11114, ((Number) pair1114.f()).floatValue(), false, 2, null);
                    z3.i0 i0VarH111111114 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                    iA5 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC11111111115 = lVarV.c();
                    androidx.compose.ui.d dVarE11111111115 = androidx.compose.ui.c.e(lVarV, dVarB11112);
                    aVarA5 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA5);
                    } else {
                        lVarV.d();
                    }
                    lVarA5 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA5, i0VarH111111114, companion2.c());
                    p020r2.d4.b(lVarA5, xVarC11111111115, companion2.e());
                    pVarB5 = companion2.b();
                    if (lVarA5.getInserting()) {
                        lVarA5.B(Integer.valueOf(iA5));
                        lVarA5.f(Integer.valueOf(iA5), pVarB5);
                    } else {
                        lVarA5.B(Integer.valueOf(iA5));
                        lVarA5.f(Integer.valueOf(iA5), pVarB5);
                    }
                    p020r2.d4.b(lVarA5, dVarE11111111115, companion2.d());
                    footer.invoke(lVarV, Integer.valueOf((i26 >> 21) & 14));
                    lVarV.g();
                    lVarV.g();
                    lVarV.g();
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    pVar3 = pVar2;
                    qVar3 = qVar2;
                    aVar4 = aVar3;
                    str2 = str3;
                    j13 = j12;
                    pair3 = pair1114;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    final androidx.compose.ui.d dVar13 = dVar2;
                    final String str14 = str2;
                    final Pair pair1115 = pair3;
                    w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.wq0
                        @Override // wn0.p
                        public final Object invoke(Object obj, Object obj2) {
                            return UD.a(dVar13, j13, str14, closeImageSource, pVar3, qVar3, body, footer, aVar4, pair1115, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 100663296;
            if ((i11 & 805306368) != 0) {
                i13 |= ((i12 & 512) == 0 || !lVarV.n(pair)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            if ((i13 & 306783379) == 306783378) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i31 != 0) {
                        jI = k3.p1.INSTANCE.i();
                    }
                    if (i14 != 0) {
                        str2 = null;
                    }
                    if (i17 != 0) {
                        pVar2 = null;
                    }
                    if (i19 != 0) {
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                    }
                    if (i24 != 0) {
                        aVar2 = null;
                    } else {
                        aVar2 = aVar;
                    }
                    if ((i12 & 512) != 0) {
                        pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                        i13 &= -1879048193;
                        qVar2 = qVar2;
                    } else {
                        pair2 = pair;
                    }
                    j12 = jI;
                    aVar3 = aVar2;
                } else {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i31 != 0) {
                        jI = k3.p1.INSTANCE.i();
                    }
                    if (i14 != 0) {
                        str2 = null;
                    }
                    if (i17 != 0) {
                        pVar2 = null;
                    }
                    if (i19 != 0) {
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                    }
                    if (i24 != 0) {
                        aVar2 = null;
                    } else {
                        aVar2 = aVar;
                    }
                    if ((i12 & 512) != 0) {
                        pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                        i13 &= -1879048193;
                        qVar2 = qVar2;
                    } else {
                        pair2 = pair;
                    }
                    j12 = jI;
                    aVar3 = aVar2;
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(72921645, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerOverlayScaffold (VisionScannerOverlayScaffold.kt:54)");
                }
                lVarV.o(-1858078478);
                objI = lVarV.I();
                if (objI == p020r2.l.INSTANCE.a()) {
                    objI = new wn0.l() { // from class: com.fourthline.orca.internal.vq0
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return UD.a((g4.y) obj);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                i26 = i13;
                androidx.compose.ui.d dVarD112 = androidx.compose.foundation.b.d(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), j12, null, 2, null);
                companion = d3.c.INSTANCE;
                z3.i0 i0VarH111111115 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                iA = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC11111111116 = lVarV.c();
                androidx.compose.ui.d dVarE11111111116 = androidx.compose.ui.c.e(lVarV, dVarD112);
                companion2 = b4.g.INSTANCE;
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
                Pair pair1116 = pair2;
                p020r2.d4.b(lVarA, i0VarH111111115, companion2.c());
                p020r2.d4.b(lVarA, xVarC11111111116, companion2.e());
                pVarB = companion2.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                p020r2.d4.b(lVarA, dVarE11111111116, companion2.d());
                androidx.compose.foundation.layout.i iVar112 = androidx.compose.foundation.layout.i.f4585a;
                lVarV.o(-1038937986);
                if (pVar2 != null) {
                    pVar2.invoke(lVarV, Integer.valueOf((i26 >> 12) & 14));
                    jn0.h0 h0Var1111114 = jn0.h0.f84049a;
                }
                lVarV.l();
                lVarV.o(-1038935796);
                if (aVar3 == null) {
                    i27 = 1;
                } else {
                    androidx.compose.ui.d.Companion companion11115 = androidx.compose.ui.d.INSTANCE;
                    androidx.compose.ui.d dVarM11113 = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.h(companion11115, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                    z3.i0 i0VarH111111116 = androidx.compose.foundation.layout.g.h(companion.n(), false);
                    iA2 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC11111111117 = lVarV.c();
                    androidx.compose.ui.d dVarE11111111117 = androidx.compose.ui.c.e(lVarV, dVarM11113);
                    aVarA2 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA2);
                    } else {
                        lVarV.d();
                    }
                    lVarA2 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA2, i0VarH111111116, companion2.c());
                    p020r2.d4.b(lVarA2, xVarC11111111117, companion2.e());
                    pVarB2 = companion2.b();
                    if (lVarA2.getInserting()) {
                        lVarA2.B(Integer.valueOf(iA2));
                        lVarA2.f(Integer.valueOf(iA2), pVarB2);
                    } else {
                        lVarA2.B(Integer.valueOf(iA2));
                        lVarA2.f(Integer.valueOf(iA2), pVarB2);
                    }
                    p020r2.d4.b(lVarA2, dVarE11111111117, companion2.d());
                    i27 = 1;
                    C4670d1.a(aVar3, AbstractC3307gk.a(AbstractC3307gk.a(AbstractC3307gk.a(companion11115, "closeButton", (String) null, 2, (Object) null), 199.0f), RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close_acessibility, 0, 2, null), lVarV, 0), false, 2, (Object) null), false, null, z2.c.e(1519979611, true, new a(closeImageSource), lVarV, 54), lVarV, 24576, 12);
                    lVarV.g();
                    jn0.h0 h0Var1111115 = jn0.h0.f84049a;
                }
                lVarV.l();
                lVarV.o(-1038906739);
                if (str2 != null) {
                    float f1112 = 32;
                    str3 = str2;
                    Zg.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, w4.h.g(f1112), w4.h.g(f1112), w4.h.g(48), BitmapDescriptorFactory.HUE_RED, 8, null), BitmapDescriptorFactory.HUE_RED, i27, null), str3, null, k3.p1.INSTANCE.k(), null, null, lVarV, ((i26 >> 3) & 112) | 3072, 52);
                } else {
                    str3 = str2;
                }
                lVarV.l();
                if (qVar2 != null) {
                    i28 = 80;
                } else {
                    i28 = 156;
                }
                androidx.compose.ui.d dVarM11114 = androidx.compose.foundation.layout.t.m(v1.p0.c(dVar2, v1.s0.d(v1.m0.INSTANCE, lVarV, 6)), BitmapDescriptorFactory.HUE_RED, w4.h.g(i28), BitmapDescriptorFactory.HUE_RED, C3825sp.f35377a.c(lVarV, 6).f(), 5, null);
                z3.i0 i0VarA112 = v1.g.a(v1.b.f117444a.g(), companion.g(), lVarV, 48);
                iA3 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC11111111118 = lVarV.c();
                androidx.compose.ui.d dVarE11111111118 = androidx.compose.ui.c.e(lVarV, dVarM11114);
                aVarA3 = companion2.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA3);
                } else {
                    lVarV.d();
                }
                lVarA3 = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA3, i0VarA112, companion2.c());
                p020r2.d4.b(lVarA3, xVarC11111111118, companion2.e());
                pVarB3 = companion2.b();
                if (lVarA3.getInserting()) {
                    lVarA3.B(Integer.valueOf(iA3));
                    lVarA3.f(Integer.valueOf(iA3), pVarB3);
                } else {
                    lVarA3.B(Integer.valueOf(iA3));
                    lVarA3.f(Integer.valueOf(iA3), pVarB3);
                }
                p020r2.d4.b(lVarA3, dVarE11111111118, companion2.d());
                jVar = v1.j.f117505a;
                lVarV.o(915714536);
                if (qVar2 != null) {
                    qVar2.invoke(jVar, lVarV, Integer.valueOf(((i26 >> 12) & 112) | 6));
                    jn0.h0 h0Var1111116 = jn0.h0.f84049a;
                }
                lVarV.l();
                androidx.compose.ui.d.Companion companion11116 = androidx.compose.ui.d.INSTANCE;
                androidx.compose.ui.d dVarB11113 = v1.i.b(jVar, companion11116, ((Number) pair1116.e()).floatValue(), false, 2, null);
                z3.i0 i0VarH111111117 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                iA4 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC11111111119 = lVarV.c();
                androidx.compose.ui.d dVarE11111111119 = androidx.compose.ui.c.e(lVarV, dVarB11113);
                aVarA4 = companion2.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA4);
                } else {
                    lVarV.d();
                }
                lVarA4 = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA4, i0VarH111111117, companion2.c());
                p020r2.d4.b(lVarA4, xVarC11111111119, companion2.e());
                pVarB4 = companion2.b();
                if (lVarA4.getInserting()) {
                    lVarA4.B(Integer.valueOf(iA4));
                    lVarA4.f(Integer.valueOf(iA4), pVarB4);
                } else {
                    lVarA4.B(Integer.valueOf(iA4));
                    lVarA4.f(Integer.valueOf(iA4), pVarB4);
                }
                p020r2.d4.b(lVarA4, dVarE11111111119, companion2.d());
                body.invoke(lVarV, Integer.valueOf((i26 >> 18) & 14));
                lVarV.g();
                androidx.compose.ui.d dVarB11114 = v1.i.b(jVar, companion11116, ((Number) pair1116.f()).floatValue(), false, 2, null);
                z3.i0 i0VarH111111118 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                iA5 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC111111111110 = lVarV.c();
                androidx.compose.ui.d dVarE111111111110 = androidx.compose.ui.c.e(lVarV, dVarB11114);
                aVarA5 = companion2.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA5);
                } else {
                    lVarV.d();
                }
                lVarA5 = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA5, i0VarH111111118, companion2.c());
                p020r2.d4.b(lVarA5, xVarC111111111110, companion2.e());
                pVarB5 = companion2.b();
                if (lVarA5.getInserting()) {
                    lVarA5.B(Integer.valueOf(iA5));
                    lVarA5.f(Integer.valueOf(iA5), pVarB5);
                } else {
                    lVarA5.B(Integer.valueOf(iA5));
                    lVarA5.f(Integer.valueOf(iA5), pVarB5);
                }
                p020r2.d4.b(lVarA5, dVarE111111111110, companion2.d());
                footer.invoke(lVarV, Integer.valueOf((i26 >> 21) & 14));
                lVarV.g();
                lVarV.g();
                lVarV.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                pVar3 = pVar2;
                qVar3 = qVar2;
                aVar4 = aVar3;
                str2 = str3;
                j13 = j12;
                pair3 = pair1116;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i31 != 0) {
                        jI = k3.p1.INSTANCE.i();
                    }
                    if (i14 != 0) {
                        str2 = null;
                    }
                    if (i17 != 0) {
                        pVar2 = null;
                    }
                    if (i19 != 0) {
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                    }
                    if (i24 != 0) {
                        aVar2 = null;
                    } else {
                        aVar2 = aVar;
                    }
                    if ((i12 & 512) != 0) {
                        pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                        i13 &= -1879048193;
                        qVar2 = qVar2;
                    } else {
                        pair2 = pair;
                    }
                    j12 = jI;
                    aVar3 = aVar2;
                } else {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i31 != 0) {
                        jI = k3.p1.INSTANCE.i();
                    }
                    if (i14 != 0) {
                        str2 = null;
                    }
                    if (i17 != 0) {
                        pVar2 = null;
                    }
                    if (i19 != 0) {
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                    }
                    if (i24 != 0) {
                        aVar2 = null;
                    } else {
                        aVar2 = aVar;
                    }
                    if ((i12 & 512) != 0) {
                        pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                        i13 &= -1879048193;
                        qVar2 = qVar2;
                    } else {
                        pair2 = pair;
                    }
                    j12 = jI;
                    aVar3 = aVar2;
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(72921645, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerOverlayScaffold (VisionScannerOverlayScaffold.kt:54)");
                }
                lVarV.o(-1858078478);
                objI = lVarV.I();
                if (objI == p020r2.l.INSTANCE.a()) {
                    objI = new wn0.l() { // from class: com.fourthline.orca.internal.vq0
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return UD.a((g4.y) obj);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                i26 = i13;
                androidx.compose.ui.d dVarD113 = androidx.compose.foundation.b.d(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), j12, null, 2, null);
                companion = d3.c.INSTANCE;
                z3.i0 i0VarH111111119 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                iA = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC111111111111 = lVarV.c();
                androidx.compose.ui.d dVarE111111111111 = androidx.compose.ui.c.e(lVarV, dVarD113);
                companion2 = b4.g.INSTANCE;
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
                Pair pair1117 = pair2;
                p020r2.d4.b(lVarA, i0VarH111111119, companion2.c());
                p020r2.d4.b(lVarA, xVarC111111111111, companion2.e());
                pVarB = companion2.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                p020r2.d4.b(lVarA, dVarE111111111111, companion2.d());
                androidx.compose.foundation.layout.i iVar113 = androidx.compose.foundation.layout.i.f4585a;
                lVarV.o(-1038937986);
                if (pVar2 != null) {
                    pVar2.invoke(lVarV, Integer.valueOf((i26 >> 12) & 14));
                    jn0.h0 h0Var1111117 = jn0.h0.f84049a;
                }
                lVarV.l();
                lVarV.o(-1038935796);
                if (aVar3 == null) {
                    i27 = 1;
                } else {
                    androidx.compose.ui.d.Companion companion11117 = androidx.compose.ui.d.INSTANCE;
                    androidx.compose.ui.d dVarM11115 = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.h(companion11117, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                    z3.i0 i0VarH1111111110 = androidx.compose.foundation.layout.g.h(companion.n(), false);
                    iA2 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC111111111112 = lVarV.c();
                    androidx.compose.ui.d dVarE111111111112 = androidx.compose.ui.c.e(lVarV, dVarM11115);
                    aVarA2 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA2);
                    } else {
                        lVarV.d();
                    }
                    lVarA2 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA2, i0VarH1111111110, companion2.c());
                    p020r2.d4.b(lVarA2, xVarC111111111112, companion2.e());
                    pVarB2 = companion2.b();
                    if (lVarA2.getInserting()) {
                        lVarA2.B(Integer.valueOf(iA2));
                        lVarA2.f(Integer.valueOf(iA2), pVarB2);
                    } else {
                        lVarA2.B(Integer.valueOf(iA2));
                        lVarA2.f(Integer.valueOf(iA2), pVarB2);
                    }
                    p020r2.d4.b(lVarA2, dVarE111111111112, companion2.d());
                    i27 = 1;
                    C4670d1.a(aVar3, AbstractC3307gk.a(AbstractC3307gk.a(AbstractC3307gk.a(companion11117, "closeButton", (String) null, 2, (Object) null), 199.0f), RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close_acessibility, 0, 2, null), lVarV, 0), false, 2, (Object) null), false, null, z2.c.e(1519979611, true, new a(closeImageSource), lVarV, 54), lVarV, 24576, 12);
                    lVarV.g();
                    jn0.h0 h0Var1111118 = jn0.h0.f84049a;
                }
                lVarV.l();
                lVarV.o(-1038906739);
                if (str2 != null) {
                    float f1113 = 32;
                    str3 = str2;
                    Zg.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, w4.h.g(f1113), w4.h.g(f1113), w4.h.g(48), BitmapDescriptorFactory.HUE_RED, 8, null), BitmapDescriptorFactory.HUE_RED, i27, null), str3, null, k3.p1.INSTANCE.k(), null, null, lVarV, ((i26 >> 3) & 112) | 3072, 52);
                } else {
                    str3 = str2;
                }
                lVarV.l();
                if (qVar2 != null) {
                    i28 = 80;
                } else {
                    i28 = 156;
                }
                androidx.compose.ui.d dVarM11116 = androidx.compose.foundation.layout.t.m(v1.p0.c(dVar2, v1.s0.d(v1.m0.INSTANCE, lVarV, 6)), BitmapDescriptorFactory.HUE_RED, w4.h.g(i28), BitmapDescriptorFactory.HUE_RED, C3825sp.f35377a.c(lVarV, 6).f(), 5, null);
                z3.i0 i0VarA113 = v1.g.a(v1.b.f117444a.g(), companion.g(), lVarV, 48);
                iA3 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC111111111113 = lVarV.c();
                androidx.compose.ui.d dVarE111111111113 = androidx.compose.ui.c.e(lVarV, dVarM11116);
                aVarA3 = companion2.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA3);
                } else {
                    lVarV.d();
                }
                lVarA3 = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA3, i0VarA113, companion2.c());
                p020r2.d4.b(lVarA3, xVarC111111111113, companion2.e());
                pVarB3 = companion2.b();
                if (lVarA3.getInserting()) {
                    lVarA3.B(Integer.valueOf(iA3));
                    lVarA3.f(Integer.valueOf(iA3), pVarB3);
                } else {
                    lVarA3.B(Integer.valueOf(iA3));
                    lVarA3.f(Integer.valueOf(iA3), pVarB3);
                }
                p020r2.d4.b(lVarA3, dVarE111111111113, companion2.d());
                jVar = v1.j.f117505a;
                lVarV.o(915714536);
                if (qVar2 != null) {
                    qVar2.invoke(jVar, lVarV, Integer.valueOf(((i26 >> 12) & 112) | 6));
                    jn0.h0 h0Var1111119 = jn0.h0.f84049a;
                }
                lVarV.l();
                androidx.compose.ui.d.Companion companion11118 = androidx.compose.ui.d.INSTANCE;
                androidx.compose.ui.d dVarB11115 = v1.i.b(jVar, companion11118, ((Number) pair1117.e()).floatValue(), false, 2, null);
                z3.i0 i0VarH1111111111 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                iA4 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC111111111114 = lVarV.c();
                androidx.compose.ui.d dVarE111111111114 = androidx.compose.ui.c.e(lVarV, dVarB11115);
                aVarA4 = companion2.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA4);
                } else {
                    lVarV.d();
                }
                lVarA4 = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA4, i0VarH1111111111, companion2.c());
                p020r2.d4.b(lVarA4, xVarC111111111114, companion2.e());
                pVarB4 = companion2.b();
                if (lVarA4.getInserting()) {
                    lVarA4.B(Integer.valueOf(iA4));
                    lVarA4.f(Integer.valueOf(iA4), pVarB4);
                } else {
                    lVarA4.B(Integer.valueOf(iA4));
                    lVarA4.f(Integer.valueOf(iA4), pVarB4);
                }
                p020r2.d4.b(lVarA4, dVarE111111111114, companion2.d());
                body.invoke(lVarV, Integer.valueOf((i26 >> 18) & 14));
                lVarV.g();
                androidx.compose.ui.d dVarB11116 = v1.i.b(jVar, companion11118, ((Number) pair1117.f()).floatValue(), false, 2, null);
                z3.i0 i0VarH1111111112 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                iA5 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC111111111115 = lVarV.c();
                androidx.compose.ui.d dVarE111111111115 = androidx.compose.ui.c.e(lVarV, dVarB11116);
                aVarA5 = companion2.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA5);
                } else {
                    lVarV.d();
                }
                lVarA5 = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA5, i0VarH1111111112, companion2.c());
                p020r2.d4.b(lVarA5, xVarC111111111115, companion2.e());
                pVarB5 = companion2.b();
                if (lVarA5.getInserting()) {
                    lVarA5.B(Integer.valueOf(iA5));
                    lVarA5.f(Integer.valueOf(iA5), pVarB5);
                } else {
                    lVarA5.B(Integer.valueOf(iA5));
                    lVarA5.f(Integer.valueOf(iA5), pVarB5);
                }
                p020r2.d4.b(lVarA5, dVarE111111111115, companion2.d());
                footer.invoke(lVarV, Integer.valueOf((i26 >> 21) & 14));
                lVarV.g();
                lVarV.g();
                lVarV.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                pVar3 = pVar2;
                qVar3 = qVar2;
                aVar4 = aVar3;
                str2 = str3;
                j13 = j12;
                pair3 = pair1117;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                final androidx.compose.ui.d dVar14 = dVar2;
                final String str15 = str2;
                final Pair pair1118 = pair3;
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.wq0
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return UD.a(dVar14, j13, str15, closeImageSource, pVar3, qVar3, body, footer, aVar4, pair1118, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        str2 = str;
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            if ((i11 & 4096) == 0) {
                zK = lVarV.n(closeImageSource);
            } else {
                zK = lVarV.K(closeImageSource);
            }
            if (zK) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i13 |= i16;
        }
        i17 = i12 & 16;
        if (i17 != 0) {
            if ((i11 & 24576) == 0) {
                pVar2 = pVar;
                if (lVarV.K(pVar2)) {
                    i18 = 16384;
                } else {
                    i18 = PKIFailureInfo.certRevoked;
                }
                i13 |= i18;
            }
            i19 = i12 & 32;
            if (i19 != 0) {
                i13 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (lVarV.K(qVar)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            }
            if ((i12 & 64) != 0) {
                i13 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (lVarV.K(body)) {
                    i22 = PKIFailureInfo.badCertTemplate;
                } else {
                    i22 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i22;
            }
            if ((i12 & 128) != 0) {
                i13 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                if (lVarV.K(footer)) {
                    i23 = 8388608;
                } else {
                    i23 = 4194304;
                }
                i13 |= i23;
            }
            i24 = i12 & 256;
            if (i24 != 0) {
                if ((i11 & 100663296) == 0) {
                    if (lVarV.K(aVar)) {
                        i25 = 67108864;
                    } else {
                        i25 = 33554432;
                    }
                    i13 |= i25;
                }
                if ((i11 & 805306368) != 0) {
                    i13 |= ((i12 & 512) == 0 || !lVarV.n(pair)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                if ((i13 & 306783379) == 306783378) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i31 != 0) {
                            jI = k3.p1.INSTANCE.i();
                        }
                        if (i14 != 0) {
                            str2 = null;
                        }
                        if (i17 != 0) {
                            pVar2 = null;
                        }
                        if (i19 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        if (i24 != 0) {
                            aVar2 = null;
                        } else {
                            aVar2 = aVar;
                        }
                        if ((i12 & 512) != 0) {
                            pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                            i13 &= -1879048193;
                            qVar2 = qVar2;
                        } else {
                            pair2 = pair;
                        }
                        j12 = jI;
                        aVar3 = aVar2;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i31 != 0) {
                            jI = k3.p1.INSTANCE.i();
                        }
                        if (i14 != 0) {
                            str2 = null;
                        }
                        if (i17 != 0) {
                            pVar2 = null;
                        }
                        if (i19 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        if (i24 != 0) {
                            aVar2 = null;
                        } else {
                            aVar2 = aVar;
                        }
                        if ((i12 & 512) != 0) {
                            pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                            i13 &= -1879048193;
                            qVar2 = qVar2;
                        } else {
                            pair2 = pair;
                        }
                        j12 = jI;
                        aVar3 = aVar2;
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(72921645, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerOverlayScaffold (VisionScannerOverlayScaffold.kt:54)");
                    }
                    lVarV.o(-1858078478);
                    objI = lVarV.I();
                    if (objI == p020r2.l.INSTANCE.a()) {
                        objI = new wn0.l() { // from class: com.fourthline.orca.internal.vq0
                            @Override // wn0.l
                            public final Object invoke(Object obj) {
                                return UD.a((g4.y) obj);
                            }
                        };
                        lVarV.B(objI);
                    }
                    lVarV.l();
                    i26 = i13;
                    androidx.compose.ui.d dVarD114 = androidx.compose.foundation.b.d(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), j12, null, 2, null);
                    companion = d3.c.INSTANCE;
                    z3.i0 i0VarH1111111113 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                    iA = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC111111111116 = lVarV.c();
                    androidx.compose.ui.d dVarE111111111116 = androidx.compose.ui.c.e(lVarV, dVarD114);
                    companion2 = b4.g.INSTANCE;
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
                    Pair pair1119 = pair2;
                    p020r2.d4.b(lVarA, i0VarH1111111113, companion2.c());
                    p020r2.d4.b(lVarA, xVarC111111111116, companion2.e());
                    pVarB = companion2.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    p020r2.d4.b(lVarA, dVarE111111111116, companion2.d());
                    androidx.compose.foundation.layout.i iVar114 = androidx.compose.foundation.layout.i.f4585a;
                    lVarV.o(-1038937986);
                    if (pVar2 != null) {
                        pVar2.invoke(lVarV, Integer.valueOf((i26 >> 12) & 14));
                        jn0.h0 h0Var11111110 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    lVarV.o(-1038935796);
                    if (aVar3 == null) {
                        i27 = 1;
                    } else {
                        androidx.compose.ui.d.Companion companion11119 = androidx.compose.ui.d.INSTANCE;
                        androidx.compose.ui.d dVarM11117 = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.h(companion11119, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                        z3.i0 i0VarH1111111114 = androidx.compose.foundation.layout.g.h(companion.n(), false);
                        iA2 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC111111111117 = lVarV.c();
                        androidx.compose.ui.d dVarE111111111117 = androidx.compose.ui.c.e(lVarV, dVarM11117);
                        aVarA2 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA2);
                        } else {
                            lVarV.d();
                        }
                        lVarA2 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA2, i0VarH1111111114, companion2.c());
                        p020r2.d4.b(lVarA2, xVarC111111111117, companion2.e());
                        pVarB2 = companion2.b();
                        if (lVarA2.getInserting()) {
                            lVarA2.B(Integer.valueOf(iA2));
                            lVarA2.f(Integer.valueOf(iA2), pVarB2);
                        } else {
                            lVarA2.B(Integer.valueOf(iA2));
                            lVarA2.f(Integer.valueOf(iA2), pVarB2);
                        }
                        p020r2.d4.b(lVarA2, dVarE111111111117, companion2.d());
                        i27 = 1;
                        C4670d1.a(aVar3, AbstractC3307gk.a(AbstractC3307gk.a(AbstractC3307gk.a(companion11119, "closeButton", (String) null, 2, (Object) null), 199.0f), RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close_acessibility, 0, 2, null), lVarV, 0), false, 2, (Object) null), false, null, z2.c.e(1519979611, true, new a(closeImageSource), lVarV, 54), lVarV, 24576, 12);
                        lVarV.g();
                        jn0.h0 h0Var11111111 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    lVarV.o(-1038906739);
                    if (str2 != null) {
                        float f1114 = 32;
                        str3 = str2;
                        Zg.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, w4.h.g(f1114), w4.h.g(f1114), w4.h.g(48), BitmapDescriptorFactory.HUE_RED, 8, null), BitmapDescriptorFactory.HUE_RED, i27, null), str3, null, k3.p1.INSTANCE.k(), null, null, lVarV, ((i26 >> 3) & 112) | 3072, 52);
                    } else {
                        str3 = str2;
                    }
                    lVarV.l();
                    if (qVar2 != null) {
                        i28 = 80;
                    } else {
                        i28 = 156;
                    }
                    androidx.compose.ui.d dVarM11118 = androidx.compose.foundation.layout.t.m(v1.p0.c(dVar2, v1.s0.d(v1.m0.INSTANCE, lVarV, 6)), BitmapDescriptorFactory.HUE_RED, w4.h.g(i28), BitmapDescriptorFactory.HUE_RED, C3825sp.f35377a.c(lVarV, 6).f(), 5, null);
                    z3.i0 i0VarA114 = v1.g.a(v1.b.f117444a.g(), companion.g(), lVarV, 48);
                    iA3 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC111111111118 = lVarV.c();
                    androidx.compose.ui.d dVarE111111111118 = androidx.compose.ui.c.e(lVarV, dVarM11118);
                    aVarA3 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA3);
                    } else {
                        lVarV.d();
                    }
                    lVarA3 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA3, i0VarA114, companion2.c());
                    p020r2.d4.b(lVarA3, xVarC111111111118, companion2.e());
                    pVarB3 = companion2.b();
                    if (lVarA3.getInserting()) {
                        lVarA3.B(Integer.valueOf(iA3));
                        lVarA3.f(Integer.valueOf(iA3), pVarB3);
                    } else {
                        lVarA3.B(Integer.valueOf(iA3));
                        lVarA3.f(Integer.valueOf(iA3), pVarB3);
                    }
                    p020r2.d4.b(lVarA3, dVarE111111111118, companion2.d());
                    jVar = v1.j.f117505a;
                    lVarV.o(915714536);
                    if (qVar2 != null) {
                        qVar2.invoke(jVar, lVarV, Integer.valueOf(((i26 >> 12) & 112) | 6));
                        jn0.h0 h0Var11111112 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    androidx.compose.ui.d.Companion companion111110 = androidx.compose.ui.d.INSTANCE;
                    androidx.compose.ui.d dVarB11117 = v1.i.b(jVar, companion111110, ((Number) pair1119.e()).floatValue(), false, 2, null);
                    z3.i0 i0VarH1111111115 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                    iA4 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC111111111119 = lVarV.c();
                    androidx.compose.ui.d dVarE111111111119 = androidx.compose.ui.c.e(lVarV, dVarB11117);
                    aVarA4 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA4);
                    } else {
                        lVarV.d();
                    }
                    lVarA4 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA4, i0VarH1111111115, companion2.c());
                    p020r2.d4.b(lVarA4, xVarC111111111119, companion2.e());
                    pVarB4 = companion2.b();
                    if (lVarA4.getInserting()) {
                        lVarA4.B(Integer.valueOf(iA4));
                        lVarA4.f(Integer.valueOf(iA4), pVarB4);
                    } else {
                        lVarA4.B(Integer.valueOf(iA4));
                        lVarA4.f(Integer.valueOf(iA4), pVarB4);
                    }
                    p020r2.d4.b(lVarA4, dVarE111111111119, companion2.d());
                    body.invoke(lVarV, Integer.valueOf((i26 >> 18) & 14));
                    lVarV.g();
                    androidx.compose.ui.d dVarB11118 = v1.i.b(jVar, companion111110, ((Number) pair1119.f()).floatValue(), false, 2, null);
                    z3.i0 i0VarH1111111116 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                    iA5 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC1111111111110 = lVarV.c();
                    androidx.compose.ui.d dVarE1111111111110 = androidx.compose.ui.c.e(lVarV, dVarB11118);
                    aVarA5 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA5);
                    } else {
                        lVarV.d();
                    }
                    lVarA5 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA5, i0VarH1111111116, companion2.c());
                    p020r2.d4.b(lVarA5, xVarC1111111111110, companion2.e());
                    pVarB5 = companion2.b();
                    if (lVarA5.getInserting()) {
                        lVarA5.B(Integer.valueOf(iA5));
                        lVarA5.f(Integer.valueOf(iA5), pVarB5);
                    } else {
                        lVarA5.B(Integer.valueOf(iA5));
                        lVarA5.f(Integer.valueOf(iA5), pVarB5);
                    }
                    p020r2.d4.b(lVarA5, dVarE1111111111110, companion2.d());
                    footer.invoke(lVarV, Integer.valueOf((i26 >> 21) & 14));
                    lVarV.g();
                    lVarV.g();
                    lVarV.g();
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    pVar3 = pVar2;
                    qVar3 = qVar2;
                    aVar4 = aVar3;
                    str2 = str3;
                    j13 = j12;
                    pair3 = pair1119;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i31 != 0) {
                            jI = k3.p1.INSTANCE.i();
                        }
                        if (i14 != 0) {
                            str2 = null;
                        }
                        if (i17 != 0) {
                            pVar2 = null;
                        }
                        if (i19 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        if (i24 != 0) {
                            aVar2 = null;
                        } else {
                            aVar2 = aVar;
                        }
                        if ((i12 & 512) != 0) {
                            pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                            i13 &= -1879048193;
                            qVar2 = qVar2;
                        } else {
                            pair2 = pair;
                        }
                        j12 = jI;
                        aVar3 = aVar2;
                    } else {
                        if (i29 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i31 != 0) {
                            jI = k3.p1.INSTANCE.i();
                        }
                        if (i14 != 0) {
                            str2 = null;
                        }
                        if (i17 != 0) {
                            pVar2 = null;
                        }
                        if (i19 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        if (i24 != 0) {
                            aVar2 = null;
                        } else {
                            aVar2 = aVar;
                        }
                        if ((i12 & 512) != 0) {
                            pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                            i13 &= -1879048193;
                            qVar2 = qVar2;
                        } else {
                            pair2 = pair;
                        }
                        j12 = jI;
                        aVar3 = aVar2;
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(72921645, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerOverlayScaffold (VisionScannerOverlayScaffold.kt:54)");
                    }
                    lVarV.o(-1858078478);
                    objI = lVarV.I();
                    if (objI == p020r2.l.INSTANCE.a()) {
                        objI = new wn0.l() { // from class: com.fourthline.orca.internal.vq0
                            @Override // wn0.l
                            public final Object invoke(Object obj) {
                                return UD.a((g4.y) obj);
                            }
                        };
                        lVarV.B(objI);
                    }
                    lVarV.l();
                    i26 = i13;
                    androidx.compose.ui.d dVarD115 = androidx.compose.foundation.b.d(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), j12, null, 2, null);
                    companion = d3.c.INSTANCE;
                    z3.i0 i0VarH1111111117 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                    iA = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC1111111111111 = lVarV.c();
                    androidx.compose.ui.d dVarE1111111111111 = androidx.compose.ui.c.e(lVarV, dVarD115);
                    companion2 = b4.g.INSTANCE;
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
                    Pair pair11110 = pair2;
                    p020r2.d4.b(lVarA, i0VarH1111111117, companion2.c());
                    p020r2.d4.b(lVarA, xVarC1111111111111, companion2.e());
                    pVarB = companion2.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    p020r2.d4.b(lVarA, dVarE1111111111111, companion2.d());
                    androidx.compose.foundation.layout.i iVar115 = androidx.compose.foundation.layout.i.f4585a;
                    lVarV.o(-1038937986);
                    if (pVar2 != null) {
                        pVar2.invoke(lVarV, Integer.valueOf((i26 >> 12) & 14));
                        jn0.h0 h0Var11111113 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    lVarV.o(-1038935796);
                    if (aVar3 == null) {
                        i27 = 1;
                    } else {
                        androidx.compose.ui.d.Companion companion111111 = androidx.compose.ui.d.INSTANCE;
                        androidx.compose.ui.d dVarM11119 = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.h(companion111111, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                        z3.i0 i0VarH1111111118 = androidx.compose.foundation.layout.g.h(companion.n(), false);
                        iA2 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC1111111111112 = lVarV.c();
                        androidx.compose.ui.d dVarE1111111111112 = androidx.compose.ui.c.e(lVarV, dVarM11119);
                        aVarA2 = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA2);
                        } else {
                            lVarV.d();
                        }
                        lVarA2 = p020r2.d4.a(lVarV);
                        p020r2.d4.b(lVarA2, i0VarH1111111118, companion2.c());
                        p020r2.d4.b(lVarA2, xVarC1111111111112, companion2.e());
                        pVarB2 = companion2.b();
                        if (lVarA2.getInserting()) {
                            lVarA2.B(Integer.valueOf(iA2));
                            lVarA2.f(Integer.valueOf(iA2), pVarB2);
                        } else {
                            lVarA2.B(Integer.valueOf(iA2));
                            lVarA2.f(Integer.valueOf(iA2), pVarB2);
                        }
                        p020r2.d4.b(lVarA2, dVarE1111111111112, companion2.d());
                        i27 = 1;
                        C4670d1.a(aVar3, AbstractC3307gk.a(AbstractC3307gk.a(AbstractC3307gk.a(companion111111, "closeButton", (String) null, 2, (Object) null), 199.0f), RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close_acessibility, 0, 2, null), lVarV, 0), false, 2, (Object) null), false, null, z2.c.e(1519979611, true, new a(closeImageSource), lVarV, 54), lVarV, 24576, 12);
                        lVarV.g();
                        jn0.h0 h0Var11111114 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    lVarV.o(-1038906739);
                    if (str2 != null) {
                        float f1115 = 32;
                        str3 = str2;
                        Zg.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, w4.h.g(f1115), w4.h.g(f1115), w4.h.g(48), BitmapDescriptorFactory.HUE_RED, 8, null), BitmapDescriptorFactory.HUE_RED, i27, null), str3, null, k3.p1.INSTANCE.k(), null, null, lVarV, ((i26 >> 3) & 112) | 3072, 52);
                    } else {
                        str3 = str2;
                    }
                    lVarV.l();
                    if (qVar2 != null) {
                        i28 = 80;
                    } else {
                        i28 = 156;
                    }
                    androidx.compose.ui.d dVarM111110 = androidx.compose.foundation.layout.t.m(v1.p0.c(dVar2, v1.s0.d(v1.m0.INSTANCE, lVarV, 6)), BitmapDescriptorFactory.HUE_RED, w4.h.g(i28), BitmapDescriptorFactory.HUE_RED, C3825sp.f35377a.c(lVarV, 6).f(), 5, null);
                    z3.i0 i0VarA115 = v1.g.a(v1.b.f117444a.g(), companion.g(), lVarV, 48);
                    iA3 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC1111111111113 = lVarV.c();
                    androidx.compose.ui.d dVarE1111111111113 = androidx.compose.ui.c.e(lVarV, dVarM111110);
                    aVarA3 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA3);
                    } else {
                        lVarV.d();
                    }
                    lVarA3 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA3, i0VarA115, companion2.c());
                    p020r2.d4.b(lVarA3, xVarC1111111111113, companion2.e());
                    pVarB3 = companion2.b();
                    if (lVarA3.getInserting()) {
                        lVarA3.B(Integer.valueOf(iA3));
                        lVarA3.f(Integer.valueOf(iA3), pVarB3);
                    } else {
                        lVarA3.B(Integer.valueOf(iA3));
                        lVarA3.f(Integer.valueOf(iA3), pVarB3);
                    }
                    p020r2.d4.b(lVarA3, dVarE1111111111113, companion2.d());
                    jVar = v1.j.f117505a;
                    lVarV.o(915714536);
                    if (qVar2 != null) {
                        qVar2.invoke(jVar, lVarV, Integer.valueOf(((i26 >> 12) & 112) | 6));
                        jn0.h0 h0Var11111115 = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    androidx.compose.ui.d.Companion companion111112 = androidx.compose.ui.d.INSTANCE;
                    androidx.compose.ui.d dVarB11119 = v1.i.b(jVar, companion111112, ((Number) pair11110.e()).floatValue(), false, 2, null);
                    z3.i0 i0VarH1111111119 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                    iA4 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC1111111111114 = lVarV.c();
                    androidx.compose.ui.d dVarE1111111111114 = androidx.compose.ui.c.e(lVarV, dVarB11119);
                    aVarA4 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA4);
                    } else {
                        lVarV.d();
                    }
                    lVarA4 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA4, i0VarH1111111119, companion2.c());
                    p020r2.d4.b(lVarA4, xVarC1111111111114, companion2.e());
                    pVarB4 = companion2.b();
                    if (lVarA4.getInserting()) {
                        lVarA4.B(Integer.valueOf(iA4));
                        lVarA4.f(Integer.valueOf(iA4), pVarB4);
                    } else {
                        lVarA4.B(Integer.valueOf(iA4));
                        lVarA4.f(Integer.valueOf(iA4), pVarB4);
                    }
                    p020r2.d4.b(lVarA4, dVarE1111111111114, companion2.d());
                    body.invoke(lVarV, Integer.valueOf((i26 >> 18) & 14));
                    lVarV.g();
                    androidx.compose.ui.d dVarB111110 = v1.i.b(jVar, companion111112, ((Number) pair11110.f()).floatValue(), false, 2, null);
                    z3.i0 i0VarH11111111110 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                    iA5 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC1111111111115 = lVarV.c();
                    androidx.compose.ui.d dVarE1111111111115 = androidx.compose.ui.c.e(lVarV, dVarB111110);
                    aVarA5 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA5);
                    } else {
                        lVarV.d();
                    }
                    lVarA5 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA5, i0VarH11111111110, companion2.c());
                    p020r2.d4.b(lVarA5, xVarC1111111111115, companion2.e());
                    pVarB5 = companion2.b();
                    if (lVarA5.getInserting()) {
                        lVarA5.B(Integer.valueOf(iA5));
                        lVarA5.f(Integer.valueOf(iA5), pVarB5);
                    } else {
                        lVarA5.B(Integer.valueOf(iA5));
                        lVarA5.f(Integer.valueOf(iA5), pVarB5);
                    }
                    p020r2.d4.b(lVarA5, dVarE1111111111115, companion2.d());
                    footer.invoke(lVarV, Integer.valueOf((i26 >> 21) & 14));
                    lVarV.g();
                    lVarV.g();
                    lVarV.g();
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    pVar3 = pVar2;
                    qVar3 = qVar2;
                    aVar4 = aVar3;
                    str2 = str3;
                    j13 = j12;
                    pair3 = pair11110;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    final androidx.compose.ui.d dVar15 = dVar2;
                    final String str16 = str2;
                    final Pair pair11111 = pair3;
                    w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.wq0
                        @Override // wn0.p
                        public final Object invoke(Object obj, Object obj2) {
                            return UD.a(dVar15, j13, str16, closeImageSource, pVar3, qVar3, body, footer, aVar4, pair11111, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 100663296;
            if ((i11 & 805306368) != 0) {
                i13 |= ((i12 & 512) == 0 || !lVarV.n(pair)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            if ((i13 & 306783379) == 306783378) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i31 != 0) {
                        jI = k3.p1.INSTANCE.i();
                    }
                    if (i14 != 0) {
                        str2 = null;
                    }
                    if (i17 != 0) {
                        pVar2 = null;
                    }
                    if (i19 != 0) {
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                    }
                    if (i24 != 0) {
                        aVar2 = null;
                    } else {
                        aVar2 = aVar;
                    }
                    if ((i12 & 512) != 0) {
                        pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                        i13 &= -1879048193;
                        qVar2 = qVar2;
                    } else {
                        pair2 = pair;
                    }
                    j12 = jI;
                    aVar3 = aVar2;
                } else {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i31 != 0) {
                        jI = k3.p1.INSTANCE.i();
                    }
                    if (i14 != 0) {
                        str2 = null;
                    }
                    if (i17 != 0) {
                        pVar2 = null;
                    }
                    if (i19 != 0) {
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                    }
                    if (i24 != 0) {
                        aVar2 = null;
                    } else {
                        aVar2 = aVar;
                    }
                    if ((i12 & 512) != 0) {
                        pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                        i13 &= -1879048193;
                        qVar2 = qVar2;
                    } else {
                        pair2 = pair;
                    }
                    j12 = jI;
                    aVar3 = aVar2;
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(72921645, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerOverlayScaffold (VisionScannerOverlayScaffold.kt:54)");
                }
                lVarV.o(-1858078478);
                objI = lVarV.I();
                if (objI == p020r2.l.INSTANCE.a()) {
                    objI = new wn0.l() { // from class: com.fourthline.orca.internal.vq0
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return UD.a((g4.y) obj);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                i26 = i13;
                androidx.compose.ui.d dVarD116 = androidx.compose.foundation.b.d(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), j12, null, 2, null);
                companion = d3.c.INSTANCE;
                z3.i0 i0VarH11111111111 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                iA = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC1111111111116 = lVarV.c();
                androidx.compose.ui.d dVarE1111111111116 = androidx.compose.ui.c.e(lVarV, dVarD116);
                companion2 = b4.g.INSTANCE;
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
                Pair pair11112 = pair2;
                p020r2.d4.b(lVarA, i0VarH11111111111, companion2.c());
                p020r2.d4.b(lVarA, xVarC1111111111116, companion2.e());
                pVarB = companion2.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                p020r2.d4.b(lVarA, dVarE1111111111116, companion2.d());
                androidx.compose.foundation.layout.i iVar116 = androidx.compose.foundation.layout.i.f4585a;
                lVarV.o(-1038937986);
                if (pVar2 != null) {
                    pVar2.invoke(lVarV, Integer.valueOf((i26 >> 12) & 14));
                    jn0.h0 h0Var11111116 = jn0.h0.f84049a;
                }
                lVarV.l();
                lVarV.o(-1038935796);
                if (aVar3 == null) {
                    i27 = 1;
                } else {
                    androidx.compose.ui.d.Companion companion111113 = androidx.compose.ui.d.INSTANCE;
                    androidx.compose.ui.d dVarM111111 = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.h(companion111113, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                    z3.i0 i0VarH11111111112 = androidx.compose.foundation.layout.g.h(companion.n(), false);
                    iA2 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC1111111111117 = lVarV.c();
                    androidx.compose.ui.d dVarE1111111111117 = androidx.compose.ui.c.e(lVarV, dVarM111111);
                    aVarA2 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA2);
                    } else {
                        lVarV.d();
                    }
                    lVarA2 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA2, i0VarH11111111112, companion2.c());
                    p020r2.d4.b(lVarA2, xVarC1111111111117, companion2.e());
                    pVarB2 = companion2.b();
                    if (lVarA2.getInserting()) {
                        lVarA2.B(Integer.valueOf(iA2));
                        lVarA2.f(Integer.valueOf(iA2), pVarB2);
                    } else {
                        lVarA2.B(Integer.valueOf(iA2));
                        lVarA2.f(Integer.valueOf(iA2), pVarB2);
                    }
                    p020r2.d4.b(lVarA2, dVarE1111111111117, companion2.d());
                    i27 = 1;
                    C4670d1.a(aVar3, AbstractC3307gk.a(AbstractC3307gk.a(AbstractC3307gk.a(companion111113, "closeButton", (String) null, 2, (Object) null), 199.0f), RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close_acessibility, 0, 2, null), lVarV, 0), false, 2, (Object) null), false, null, z2.c.e(1519979611, true, new a(closeImageSource), lVarV, 54), lVarV, 24576, 12);
                    lVarV.g();
                    jn0.h0 h0Var11111117 = jn0.h0.f84049a;
                }
                lVarV.l();
                lVarV.o(-1038906739);
                if (str2 != null) {
                    float f1116 = 32;
                    str3 = str2;
                    Zg.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, w4.h.g(f1116), w4.h.g(f1116), w4.h.g(48), BitmapDescriptorFactory.HUE_RED, 8, null), BitmapDescriptorFactory.HUE_RED, i27, null), str3, null, k3.p1.INSTANCE.k(), null, null, lVarV, ((i26 >> 3) & 112) | 3072, 52);
                } else {
                    str3 = str2;
                }
                lVarV.l();
                if (qVar2 != null) {
                    i28 = 80;
                } else {
                    i28 = 156;
                }
                androidx.compose.ui.d dVarM111112 = androidx.compose.foundation.layout.t.m(v1.p0.c(dVar2, v1.s0.d(v1.m0.INSTANCE, lVarV, 6)), BitmapDescriptorFactory.HUE_RED, w4.h.g(i28), BitmapDescriptorFactory.HUE_RED, C3825sp.f35377a.c(lVarV, 6).f(), 5, null);
                z3.i0 i0VarA116 = v1.g.a(v1.b.f117444a.g(), companion.g(), lVarV, 48);
                iA3 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC1111111111118 = lVarV.c();
                androidx.compose.ui.d dVarE1111111111118 = androidx.compose.ui.c.e(lVarV, dVarM111112);
                aVarA3 = companion2.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA3);
                } else {
                    lVarV.d();
                }
                lVarA3 = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA3, i0VarA116, companion2.c());
                p020r2.d4.b(lVarA3, xVarC1111111111118, companion2.e());
                pVarB3 = companion2.b();
                if (lVarA3.getInserting()) {
                    lVarA3.B(Integer.valueOf(iA3));
                    lVarA3.f(Integer.valueOf(iA3), pVarB3);
                } else {
                    lVarA3.B(Integer.valueOf(iA3));
                    lVarA3.f(Integer.valueOf(iA3), pVarB3);
                }
                p020r2.d4.b(lVarA3, dVarE1111111111118, companion2.d());
                jVar = v1.j.f117505a;
                lVarV.o(915714536);
                if (qVar2 != null) {
                    qVar2.invoke(jVar, lVarV, Integer.valueOf(((i26 >> 12) & 112) | 6));
                    jn0.h0 h0Var11111118 = jn0.h0.f84049a;
                }
                lVarV.l();
                androidx.compose.ui.d.Companion companion111114 = androidx.compose.ui.d.INSTANCE;
                androidx.compose.ui.d dVarB111111 = v1.i.b(jVar, companion111114, ((Number) pair11112.e()).floatValue(), false, 2, null);
                z3.i0 i0VarH11111111113 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                iA4 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC1111111111119 = lVarV.c();
                androidx.compose.ui.d dVarE1111111111119 = androidx.compose.ui.c.e(lVarV, dVarB111111);
                aVarA4 = companion2.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA4);
                } else {
                    lVarV.d();
                }
                lVarA4 = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA4, i0VarH11111111113, companion2.c());
                p020r2.d4.b(lVarA4, xVarC1111111111119, companion2.e());
                pVarB4 = companion2.b();
                if (lVarA4.getInserting()) {
                    lVarA4.B(Integer.valueOf(iA4));
                    lVarA4.f(Integer.valueOf(iA4), pVarB4);
                } else {
                    lVarA4.B(Integer.valueOf(iA4));
                    lVarA4.f(Integer.valueOf(iA4), pVarB4);
                }
                p020r2.d4.b(lVarA4, dVarE1111111111119, companion2.d());
                body.invoke(lVarV, Integer.valueOf((i26 >> 18) & 14));
                lVarV.g();
                androidx.compose.ui.d dVarB111112 = v1.i.b(jVar, companion111114, ((Number) pair11112.f()).floatValue(), false, 2, null);
                z3.i0 i0VarH11111111114 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                iA5 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC11111111111110 = lVarV.c();
                androidx.compose.ui.d dVarE11111111111110 = androidx.compose.ui.c.e(lVarV, dVarB111112);
                aVarA5 = companion2.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA5);
                } else {
                    lVarV.d();
                }
                lVarA5 = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA5, i0VarH11111111114, companion2.c());
                p020r2.d4.b(lVarA5, xVarC11111111111110, companion2.e());
                pVarB5 = companion2.b();
                if (lVarA5.getInserting()) {
                    lVarA5.B(Integer.valueOf(iA5));
                    lVarA5.f(Integer.valueOf(iA5), pVarB5);
                } else {
                    lVarA5.B(Integer.valueOf(iA5));
                    lVarA5.f(Integer.valueOf(iA5), pVarB5);
                }
                p020r2.d4.b(lVarA5, dVarE11111111111110, companion2.d());
                footer.invoke(lVarV, Integer.valueOf((i26 >> 21) & 14));
                lVarV.g();
                lVarV.g();
                lVarV.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                pVar3 = pVar2;
                qVar3 = qVar2;
                aVar4 = aVar3;
                str2 = str3;
                j13 = j12;
                pair3 = pair11112;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i31 != 0) {
                        jI = k3.p1.INSTANCE.i();
                    }
                    if (i14 != 0) {
                        str2 = null;
                    }
                    if (i17 != 0) {
                        pVar2 = null;
                    }
                    if (i19 != 0) {
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                    }
                    if (i24 != 0) {
                        aVar2 = null;
                    } else {
                        aVar2 = aVar;
                    }
                    if ((i12 & 512) != 0) {
                        pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                        i13 &= -1879048193;
                        qVar2 = qVar2;
                    } else {
                        pair2 = pair;
                    }
                    j12 = jI;
                    aVar3 = aVar2;
                } else {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i31 != 0) {
                        jI = k3.p1.INSTANCE.i();
                    }
                    if (i14 != 0) {
                        str2 = null;
                    }
                    if (i17 != 0) {
                        pVar2 = null;
                    }
                    if (i19 != 0) {
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                    }
                    if (i24 != 0) {
                        aVar2 = null;
                    } else {
                        aVar2 = aVar;
                    }
                    if ((i12 & 512) != 0) {
                        pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                        i13 &= -1879048193;
                        qVar2 = qVar2;
                    } else {
                        pair2 = pair;
                    }
                    j12 = jI;
                    aVar3 = aVar2;
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(72921645, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerOverlayScaffold (VisionScannerOverlayScaffold.kt:54)");
                }
                lVarV.o(-1858078478);
                objI = lVarV.I();
                if (objI == p020r2.l.INSTANCE.a()) {
                    objI = new wn0.l() { // from class: com.fourthline.orca.internal.vq0
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return UD.a((g4.y) obj);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                i26 = i13;
                androidx.compose.ui.d dVarD117 = androidx.compose.foundation.b.d(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), j12, null, 2, null);
                companion = d3.c.INSTANCE;
                z3.i0 i0VarH11111111115 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                iA = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC11111111111111 = lVarV.c();
                androidx.compose.ui.d dVarE11111111111111 = androidx.compose.ui.c.e(lVarV, dVarD117);
                companion2 = b4.g.INSTANCE;
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
                Pair pair11113 = pair2;
                p020r2.d4.b(lVarA, i0VarH11111111115, companion2.c());
                p020r2.d4.b(lVarA, xVarC11111111111111, companion2.e());
                pVarB = companion2.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                p020r2.d4.b(lVarA, dVarE11111111111111, companion2.d());
                androidx.compose.foundation.layout.i iVar117 = androidx.compose.foundation.layout.i.f4585a;
                lVarV.o(-1038937986);
                if (pVar2 != null) {
                    pVar2.invoke(lVarV, Integer.valueOf((i26 >> 12) & 14));
                    jn0.h0 h0Var11111119 = jn0.h0.f84049a;
                }
                lVarV.l();
                lVarV.o(-1038935796);
                if (aVar3 == null) {
                    i27 = 1;
                } else {
                    androidx.compose.ui.d.Companion companion111115 = androidx.compose.ui.d.INSTANCE;
                    androidx.compose.ui.d dVarM111113 = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.h(companion111115, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                    z3.i0 i0VarH11111111116 = androidx.compose.foundation.layout.g.h(companion.n(), false);
                    iA2 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC11111111111112 = lVarV.c();
                    androidx.compose.ui.d dVarE11111111111112 = androidx.compose.ui.c.e(lVarV, dVarM111113);
                    aVarA2 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA2);
                    } else {
                        lVarV.d();
                    }
                    lVarA2 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA2, i0VarH11111111116, companion2.c());
                    p020r2.d4.b(lVarA2, xVarC11111111111112, companion2.e());
                    pVarB2 = companion2.b();
                    if (lVarA2.getInserting()) {
                        lVarA2.B(Integer.valueOf(iA2));
                        lVarA2.f(Integer.valueOf(iA2), pVarB2);
                    } else {
                        lVarA2.B(Integer.valueOf(iA2));
                        lVarA2.f(Integer.valueOf(iA2), pVarB2);
                    }
                    p020r2.d4.b(lVarA2, dVarE11111111111112, companion2.d());
                    i27 = 1;
                    C4670d1.a(aVar3, AbstractC3307gk.a(AbstractC3307gk.a(AbstractC3307gk.a(companion111115, "closeButton", (String) null, 2, (Object) null), 199.0f), RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close_acessibility, 0, 2, null), lVarV, 0), false, 2, (Object) null), false, null, z2.c.e(1519979611, true, new a(closeImageSource), lVarV, 54), lVarV, 24576, 12);
                    lVarV.g();
                    jn0.h0 h0Var111111110 = jn0.h0.f84049a;
                }
                lVarV.l();
                lVarV.o(-1038906739);
                if (str2 != null) {
                    float f1117 = 32;
                    str3 = str2;
                    Zg.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, w4.h.g(f1117), w4.h.g(f1117), w4.h.g(48), BitmapDescriptorFactory.HUE_RED, 8, null), BitmapDescriptorFactory.HUE_RED, i27, null), str3, null, k3.p1.INSTANCE.k(), null, null, lVarV, ((i26 >> 3) & 112) | 3072, 52);
                } else {
                    str3 = str2;
                }
                lVarV.l();
                if (qVar2 != null) {
                    i28 = 80;
                } else {
                    i28 = 156;
                }
                androidx.compose.ui.d dVarM111114 = androidx.compose.foundation.layout.t.m(v1.p0.c(dVar2, v1.s0.d(v1.m0.INSTANCE, lVarV, 6)), BitmapDescriptorFactory.HUE_RED, w4.h.g(i28), BitmapDescriptorFactory.HUE_RED, C3825sp.f35377a.c(lVarV, 6).f(), 5, null);
                z3.i0 i0VarA117 = v1.g.a(v1.b.f117444a.g(), companion.g(), lVarV, 48);
                iA3 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC11111111111113 = lVarV.c();
                androidx.compose.ui.d dVarE11111111111113 = androidx.compose.ui.c.e(lVarV, dVarM111114);
                aVarA3 = companion2.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA3);
                } else {
                    lVarV.d();
                }
                lVarA3 = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA3, i0VarA117, companion2.c());
                p020r2.d4.b(lVarA3, xVarC11111111111113, companion2.e());
                pVarB3 = companion2.b();
                if (lVarA3.getInserting()) {
                    lVarA3.B(Integer.valueOf(iA3));
                    lVarA3.f(Integer.valueOf(iA3), pVarB3);
                } else {
                    lVarA3.B(Integer.valueOf(iA3));
                    lVarA3.f(Integer.valueOf(iA3), pVarB3);
                }
                p020r2.d4.b(lVarA3, dVarE11111111111113, companion2.d());
                jVar = v1.j.f117505a;
                lVarV.o(915714536);
                if (qVar2 != null) {
                    qVar2.invoke(jVar, lVarV, Integer.valueOf(((i26 >> 12) & 112) | 6));
                    jn0.h0 h0Var111111111 = jn0.h0.f84049a;
                }
                lVarV.l();
                androidx.compose.ui.d.Companion companion111116 = androidx.compose.ui.d.INSTANCE;
                androidx.compose.ui.d dVarB111113 = v1.i.b(jVar, companion111116, ((Number) pair11113.e()).floatValue(), false, 2, null);
                z3.i0 i0VarH11111111117 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                iA4 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC11111111111114 = lVarV.c();
                androidx.compose.ui.d dVarE11111111111114 = androidx.compose.ui.c.e(lVarV, dVarB111113);
                aVarA4 = companion2.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA4);
                } else {
                    lVarV.d();
                }
                lVarA4 = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA4, i0VarH11111111117, companion2.c());
                p020r2.d4.b(lVarA4, xVarC11111111111114, companion2.e());
                pVarB4 = companion2.b();
                if (lVarA4.getInserting()) {
                    lVarA4.B(Integer.valueOf(iA4));
                    lVarA4.f(Integer.valueOf(iA4), pVarB4);
                } else {
                    lVarA4.B(Integer.valueOf(iA4));
                    lVarA4.f(Integer.valueOf(iA4), pVarB4);
                }
                p020r2.d4.b(lVarA4, dVarE11111111111114, companion2.d());
                body.invoke(lVarV, Integer.valueOf((i26 >> 18) & 14));
                lVarV.g();
                androidx.compose.ui.d dVarB111114 = v1.i.b(jVar, companion111116, ((Number) pair11113.f()).floatValue(), false, 2, null);
                z3.i0 i0VarH11111111118 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                iA5 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC11111111111115 = lVarV.c();
                androidx.compose.ui.d dVarE11111111111115 = androidx.compose.ui.c.e(lVarV, dVarB111114);
                aVarA5 = companion2.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA5);
                } else {
                    lVarV.d();
                }
                lVarA5 = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA5, i0VarH11111111118, companion2.c());
                p020r2.d4.b(lVarA5, xVarC11111111111115, companion2.e());
                pVarB5 = companion2.b();
                if (lVarA5.getInserting()) {
                    lVarA5.B(Integer.valueOf(iA5));
                    lVarA5.f(Integer.valueOf(iA5), pVarB5);
                } else {
                    lVarA5.B(Integer.valueOf(iA5));
                    lVarA5.f(Integer.valueOf(iA5), pVarB5);
                }
                p020r2.d4.b(lVarA5, dVarE11111111111115, companion2.d());
                footer.invoke(lVarV, Integer.valueOf((i26 >> 21) & 14));
                lVarV.g();
                lVarV.g();
                lVarV.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                pVar3 = pVar2;
                qVar3 = qVar2;
                aVar4 = aVar3;
                str2 = str3;
                j13 = j12;
                pair3 = pair11113;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                final androidx.compose.ui.d dVar16 = dVar2;
                final String str17 = str2;
                final Pair pair11114 = pair3;
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.wq0
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return UD.a(dVar16, j13, str17, closeImageSource, pVar3, qVar3, body, footer, aVar4, pair11114, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 24576;
        pVar2 = pVar;
        i19 = i12 & 32;
        if (i19 != 0) {
            i13 |= 196608;
        } else if ((i11 & 196608) == 0) {
            if (lVarV.K(qVar)) {
                i21 = 131072;
            } else {
                i21 = 65536;
            }
            i13 |= i21;
        }
        if ((i12 & 64) != 0) {
            i13 |= 1572864;
        } else if ((i11 & 1572864) == 0) {
            if (lVarV.K(body)) {
                i22 = PKIFailureInfo.badCertTemplate;
            } else {
                i22 = PKIFailureInfo.signerNotTrusted;
            }
            i13 |= i22;
        }
        if ((i12 & 128) != 0) {
            i13 |= 12582912;
        } else if ((i11 & 12582912) == 0) {
            if (lVarV.K(footer)) {
                i23 = 8388608;
            } else {
                i23 = 4194304;
            }
            i13 |= i23;
        }
        i24 = i12 & 256;
        if (i24 != 0) {
            if ((i11 & 100663296) == 0) {
                if (lVarV.K(aVar)) {
                    i25 = 67108864;
                } else {
                    i25 = 33554432;
                }
                i13 |= i25;
            }
            if ((i11 & 805306368) != 0) {
                i13 |= ((i12 & 512) == 0 || !lVarV.n(pair)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            if ((i13 & 306783379) == 306783378) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i31 != 0) {
                        jI = k3.p1.INSTANCE.i();
                    }
                    if (i14 != 0) {
                        str2 = null;
                    }
                    if (i17 != 0) {
                        pVar2 = null;
                    }
                    if (i19 != 0) {
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                    }
                    if (i24 != 0) {
                        aVar2 = null;
                    } else {
                        aVar2 = aVar;
                    }
                    if ((i12 & 512) != 0) {
                        pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                        i13 &= -1879048193;
                        qVar2 = qVar2;
                    } else {
                        pair2 = pair;
                    }
                    j12 = jI;
                    aVar3 = aVar2;
                } else {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i31 != 0) {
                        jI = k3.p1.INSTANCE.i();
                    }
                    if (i14 != 0) {
                        str2 = null;
                    }
                    if (i17 != 0) {
                        pVar2 = null;
                    }
                    if (i19 != 0) {
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                    }
                    if (i24 != 0) {
                        aVar2 = null;
                    } else {
                        aVar2 = aVar;
                    }
                    if ((i12 & 512) != 0) {
                        pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                        i13 &= -1879048193;
                        qVar2 = qVar2;
                    } else {
                        pair2 = pair;
                    }
                    j12 = jI;
                    aVar3 = aVar2;
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(72921645, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerOverlayScaffold (VisionScannerOverlayScaffold.kt:54)");
                }
                lVarV.o(-1858078478);
                objI = lVarV.I();
                if (objI == p020r2.l.INSTANCE.a()) {
                    objI = new wn0.l() { // from class: com.fourthline.orca.internal.vq0
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return UD.a((g4.y) obj);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                i26 = i13;
                androidx.compose.ui.d dVarD118 = androidx.compose.foundation.b.d(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), j12, null, 2, null);
                companion = d3.c.INSTANCE;
                z3.i0 i0VarH11111111119 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                iA = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC11111111111116 = lVarV.c();
                androidx.compose.ui.d dVarE11111111111116 = androidx.compose.ui.c.e(lVarV, dVarD118);
                companion2 = b4.g.INSTANCE;
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
                Pair pair11115 = pair2;
                p020r2.d4.b(lVarA, i0VarH11111111119, companion2.c());
                p020r2.d4.b(lVarA, xVarC11111111111116, companion2.e());
                pVarB = companion2.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                p020r2.d4.b(lVarA, dVarE11111111111116, companion2.d());
                androidx.compose.foundation.layout.i iVar118 = androidx.compose.foundation.layout.i.f4585a;
                lVarV.o(-1038937986);
                if (pVar2 != null) {
                    pVar2.invoke(lVarV, Integer.valueOf((i26 >> 12) & 14));
                    jn0.h0 h0Var111111112 = jn0.h0.f84049a;
                }
                lVarV.l();
                lVarV.o(-1038935796);
                if (aVar3 == null) {
                    i27 = 1;
                } else {
                    androidx.compose.ui.d.Companion companion111117 = androidx.compose.ui.d.INSTANCE;
                    androidx.compose.ui.d dVarM111115 = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.h(companion111117, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                    z3.i0 i0VarH111111111110 = androidx.compose.foundation.layout.g.h(companion.n(), false);
                    iA2 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC11111111111117 = lVarV.c();
                    androidx.compose.ui.d dVarE11111111111117 = androidx.compose.ui.c.e(lVarV, dVarM111115);
                    aVarA2 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA2);
                    } else {
                        lVarV.d();
                    }
                    lVarA2 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA2, i0VarH111111111110, companion2.c());
                    p020r2.d4.b(lVarA2, xVarC11111111111117, companion2.e());
                    pVarB2 = companion2.b();
                    if (lVarA2.getInserting()) {
                        lVarA2.B(Integer.valueOf(iA2));
                        lVarA2.f(Integer.valueOf(iA2), pVarB2);
                    } else {
                        lVarA2.B(Integer.valueOf(iA2));
                        lVarA2.f(Integer.valueOf(iA2), pVarB2);
                    }
                    p020r2.d4.b(lVarA2, dVarE11111111111117, companion2.d());
                    i27 = 1;
                    C4670d1.a(aVar3, AbstractC3307gk.a(AbstractC3307gk.a(AbstractC3307gk.a(companion111117, "closeButton", (String) null, 2, (Object) null), 199.0f), RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close_acessibility, 0, 2, null), lVarV, 0), false, 2, (Object) null), false, null, z2.c.e(1519979611, true, new a(closeImageSource), lVarV, 54), lVarV, 24576, 12);
                    lVarV.g();
                    jn0.h0 h0Var111111113 = jn0.h0.f84049a;
                }
                lVarV.l();
                lVarV.o(-1038906739);
                if (str2 != null) {
                    float f1118 = 32;
                    str3 = str2;
                    Zg.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, w4.h.g(f1118), w4.h.g(f1118), w4.h.g(48), BitmapDescriptorFactory.HUE_RED, 8, null), BitmapDescriptorFactory.HUE_RED, i27, null), str3, null, k3.p1.INSTANCE.k(), null, null, lVarV, ((i26 >> 3) & 112) | 3072, 52);
                } else {
                    str3 = str2;
                }
                lVarV.l();
                if (qVar2 != null) {
                    i28 = 80;
                } else {
                    i28 = 156;
                }
                androidx.compose.ui.d dVarM111116 = androidx.compose.foundation.layout.t.m(v1.p0.c(dVar2, v1.s0.d(v1.m0.INSTANCE, lVarV, 6)), BitmapDescriptorFactory.HUE_RED, w4.h.g(i28), BitmapDescriptorFactory.HUE_RED, C3825sp.f35377a.c(lVarV, 6).f(), 5, null);
                z3.i0 i0VarA118 = v1.g.a(v1.b.f117444a.g(), companion.g(), lVarV, 48);
                iA3 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC11111111111118 = lVarV.c();
                androidx.compose.ui.d dVarE11111111111118 = androidx.compose.ui.c.e(lVarV, dVarM111116);
                aVarA3 = companion2.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA3);
                } else {
                    lVarV.d();
                }
                lVarA3 = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA3, i0VarA118, companion2.c());
                p020r2.d4.b(lVarA3, xVarC11111111111118, companion2.e());
                pVarB3 = companion2.b();
                if (lVarA3.getInserting()) {
                    lVarA3.B(Integer.valueOf(iA3));
                    lVarA3.f(Integer.valueOf(iA3), pVarB3);
                } else {
                    lVarA3.B(Integer.valueOf(iA3));
                    lVarA3.f(Integer.valueOf(iA3), pVarB3);
                }
                p020r2.d4.b(lVarA3, dVarE11111111111118, companion2.d());
                jVar = v1.j.f117505a;
                lVarV.o(915714536);
                if (qVar2 != null) {
                    qVar2.invoke(jVar, lVarV, Integer.valueOf(((i26 >> 12) & 112) | 6));
                    jn0.h0 h0Var111111114 = jn0.h0.f84049a;
                }
                lVarV.l();
                androidx.compose.ui.d.Companion companion111118 = androidx.compose.ui.d.INSTANCE;
                androidx.compose.ui.d dVarB111115 = v1.i.b(jVar, companion111118, ((Number) pair11115.e()).floatValue(), false, 2, null);
                z3.i0 i0VarH111111111111 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                iA4 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC11111111111119 = lVarV.c();
                androidx.compose.ui.d dVarE11111111111119 = androidx.compose.ui.c.e(lVarV, dVarB111115);
                aVarA4 = companion2.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA4);
                } else {
                    lVarV.d();
                }
                lVarA4 = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA4, i0VarH111111111111, companion2.c());
                p020r2.d4.b(lVarA4, xVarC11111111111119, companion2.e());
                pVarB4 = companion2.b();
                if (lVarA4.getInserting()) {
                    lVarA4.B(Integer.valueOf(iA4));
                    lVarA4.f(Integer.valueOf(iA4), pVarB4);
                } else {
                    lVarA4.B(Integer.valueOf(iA4));
                    lVarA4.f(Integer.valueOf(iA4), pVarB4);
                }
                p020r2.d4.b(lVarA4, dVarE11111111111119, companion2.d());
                body.invoke(lVarV, Integer.valueOf((i26 >> 18) & 14));
                lVarV.g();
                androidx.compose.ui.d dVarB111116 = v1.i.b(jVar, companion111118, ((Number) pair11115.f()).floatValue(), false, 2, null);
                z3.i0 i0VarH111111111112 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                iA5 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC111111111111110 = lVarV.c();
                androidx.compose.ui.d dVarE111111111111110 = androidx.compose.ui.c.e(lVarV, dVarB111116);
                aVarA5 = companion2.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA5);
                } else {
                    lVarV.d();
                }
                lVarA5 = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA5, i0VarH111111111112, companion2.c());
                p020r2.d4.b(lVarA5, xVarC111111111111110, companion2.e());
                pVarB5 = companion2.b();
                if (lVarA5.getInserting()) {
                    lVarA5.B(Integer.valueOf(iA5));
                    lVarA5.f(Integer.valueOf(iA5), pVarB5);
                } else {
                    lVarA5.B(Integer.valueOf(iA5));
                    lVarA5.f(Integer.valueOf(iA5), pVarB5);
                }
                p020r2.d4.b(lVarA5, dVarE111111111111110, companion2.d());
                footer.invoke(lVarV, Integer.valueOf((i26 >> 21) & 14));
                lVarV.g();
                lVarV.g();
                lVarV.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                pVar3 = pVar2;
                qVar3 = qVar2;
                aVar4 = aVar3;
                str2 = str3;
                j13 = j12;
                pair3 = pair11115;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i31 != 0) {
                        jI = k3.p1.INSTANCE.i();
                    }
                    if (i14 != 0) {
                        str2 = null;
                    }
                    if (i17 != 0) {
                        pVar2 = null;
                    }
                    if (i19 != 0) {
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                    }
                    if (i24 != 0) {
                        aVar2 = null;
                    } else {
                        aVar2 = aVar;
                    }
                    if ((i12 & 512) != 0) {
                        pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                        i13 &= -1879048193;
                        qVar2 = qVar2;
                    } else {
                        pair2 = pair;
                    }
                    j12 = jI;
                    aVar3 = aVar2;
                } else {
                    if (i29 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i31 != 0) {
                        jI = k3.p1.INSTANCE.i();
                    }
                    if (i14 != 0) {
                        str2 = null;
                    }
                    if (i17 != 0) {
                        pVar2 = null;
                    }
                    if (i19 != 0) {
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                    }
                    if (i24 != 0) {
                        aVar2 = null;
                    } else {
                        aVar2 = aVar;
                    }
                    if ((i12 & 512) != 0) {
                        pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                        i13 &= -1879048193;
                        qVar2 = qVar2;
                    } else {
                        pair2 = pair;
                    }
                    j12 = jI;
                    aVar3 = aVar2;
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(72921645, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerOverlayScaffold (VisionScannerOverlayScaffold.kt:54)");
                }
                lVarV.o(-1858078478);
                objI = lVarV.I();
                if (objI == p020r2.l.INSTANCE.a()) {
                    objI = new wn0.l() { // from class: com.fourthline.orca.internal.vq0
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return UD.a((g4.y) obj);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                i26 = i13;
                androidx.compose.ui.d dVarD119 = androidx.compose.foundation.b.d(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), j12, null, 2, null);
                companion = d3.c.INSTANCE;
                z3.i0 i0VarH111111111113 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                iA = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC111111111111111 = lVarV.c();
                androidx.compose.ui.d dVarE111111111111111 = androidx.compose.ui.c.e(lVarV, dVarD119);
                companion2 = b4.g.INSTANCE;
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
                Pair pair11116 = pair2;
                p020r2.d4.b(lVarA, i0VarH111111111113, companion2.c());
                p020r2.d4.b(lVarA, xVarC111111111111111, companion2.e());
                pVarB = companion2.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                p020r2.d4.b(lVarA, dVarE111111111111111, companion2.d());
                androidx.compose.foundation.layout.i iVar119 = androidx.compose.foundation.layout.i.f4585a;
                lVarV.o(-1038937986);
                if (pVar2 != null) {
                    pVar2.invoke(lVarV, Integer.valueOf((i26 >> 12) & 14));
                    jn0.h0 h0Var111111115 = jn0.h0.f84049a;
                }
                lVarV.l();
                lVarV.o(-1038935796);
                if (aVar3 == null) {
                    i27 = 1;
                } else {
                    androidx.compose.ui.d.Companion companion111119 = androidx.compose.ui.d.INSTANCE;
                    androidx.compose.ui.d dVarM111117 = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.h(companion111119, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                    z3.i0 i0VarH111111111114 = androidx.compose.foundation.layout.g.h(companion.n(), false);
                    iA2 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC111111111111112 = lVarV.c();
                    androidx.compose.ui.d dVarE111111111111112 = androidx.compose.ui.c.e(lVarV, dVarM111117);
                    aVarA2 = companion2.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA2);
                    } else {
                        lVarV.d();
                    }
                    lVarA2 = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA2, i0VarH111111111114, companion2.c());
                    p020r2.d4.b(lVarA2, xVarC111111111111112, companion2.e());
                    pVarB2 = companion2.b();
                    if (lVarA2.getInserting()) {
                        lVarA2.B(Integer.valueOf(iA2));
                        lVarA2.f(Integer.valueOf(iA2), pVarB2);
                    } else {
                        lVarA2.B(Integer.valueOf(iA2));
                        lVarA2.f(Integer.valueOf(iA2), pVarB2);
                    }
                    p020r2.d4.b(lVarA2, dVarE111111111111112, companion2.d());
                    i27 = 1;
                    C4670d1.a(aVar3, AbstractC3307gk.a(AbstractC3307gk.a(AbstractC3307gk.a(companion111119, "closeButton", (String) null, 2, (Object) null), 199.0f), RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close_acessibility, 0, 2, null), lVarV, 0), false, 2, (Object) null), false, null, z2.c.e(1519979611, true, new a(closeImageSource), lVarV, 54), lVarV, 24576, 12);
                    lVarV.g();
                    jn0.h0 h0Var111111116 = jn0.h0.f84049a;
                }
                lVarV.l();
                lVarV.o(-1038906739);
                if (str2 != null) {
                    float f1119 = 32;
                    str3 = str2;
                    Zg.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, w4.h.g(f1119), w4.h.g(f1119), w4.h.g(48), BitmapDescriptorFactory.HUE_RED, 8, null), BitmapDescriptorFactory.HUE_RED, i27, null), str3, null, k3.p1.INSTANCE.k(), null, null, lVarV, ((i26 >> 3) & 112) | 3072, 52);
                } else {
                    str3 = str2;
                }
                lVarV.l();
                if (qVar2 != null) {
                    i28 = 80;
                } else {
                    i28 = 156;
                }
                androidx.compose.ui.d dVarM111118 = androidx.compose.foundation.layout.t.m(v1.p0.c(dVar2, v1.s0.d(v1.m0.INSTANCE, lVarV, 6)), BitmapDescriptorFactory.HUE_RED, w4.h.g(i28), BitmapDescriptorFactory.HUE_RED, C3825sp.f35377a.c(lVarV, 6).f(), 5, null);
                z3.i0 i0VarA119 = v1.g.a(v1.b.f117444a.g(), companion.g(), lVarV, 48);
                iA3 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC111111111111113 = lVarV.c();
                androidx.compose.ui.d dVarE111111111111113 = androidx.compose.ui.c.e(lVarV, dVarM111118);
                aVarA3 = companion2.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA3);
                } else {
                    lVarV.d();
                }
                lVarA3 = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA3, i0VarA119, companion2.c());
                p020r2.d4.b(lVarA3, xVarC111111111111113, companion2.e());
                pVarB3 = companion2.b();
                if (lVarA3.getInserting()) {
                    lVarA3.B(Integer.valueOf(iA3));
                    lVarA3.f(Integer.valueOf(iA3), pVarB3);
                } else {
                    lVarA3.B(Integer.valueOf(iA3));
                    lVarA3.f(Integer.valueOf(iA3), pVarB3);
                }
                p020r2.d4.b(lVarA3, dVarE111111111111113, companion2.d());
                jVar = v1.j.f117505a;
                lVarV.o(915714536);
                if (qVar2 != null) {
                    qVar2.invoke(jVar, lVarV, Integer.valueOf(((i26 >> 12) & 112) | 6));
                    jn0.h0 h0Var111111117 = jn0.h0.f84049a;
                }
                lVarV.l();
                androidx.compose.ui.d.Companion companion1111110 = androidx.compose.ui.d.INSTANCE;
                androidx.compose.ui.d dVarB111117 = v1.i.b(jVar, companion1111110, ((Number) pair11116.e()).floatValue(), false, 2, null);
                z3.i0 i0VarH111111111115 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                iA4 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC111111111111114 = lVarV.c();
                androidx.compose.ui.d dVarE111111111111114 = androidx.compose.ui.c.e(lVarV, dVarB111117);
                aVarA4 = companion2.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA4);
                } else {
                    lVarV.d();
                }
                lVarA4 = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA4, i0VarH111111111115, companion2.c());
                p020r2.d4.b(lVarA4, xVarC111111111111114, companion2.e());
                pVarB4 = companion2.b();
                if (lVarA4.getInserting()) {
                    lVarA4.B(Integer.valueOf(iA4));
                    lVarA4.f(Integer.valueOf(iA4), pVarB4);
                } else {
                    lVarA4.B(Integer.valueOf(iA4));
                    lVarA4.f(Integer.valueOf(iA4), pVarB4);
                }
                p020r2.d4.b(lVarA4, dVarE111111111111114, companion2.d());
                body.invoke(lVarV, Integer.valueOf((i26 >> 18) & 14));
                lVarV.g();
                androidx.compose.ui.d dVarB111118 = v1.i.b(jVar, companion1111110, ((Number) pair11116.f()).floatValue(), false, 2, null);
                z3.i0 i0VarH111111111116 = androidx.compose.foundation.layout.g.h(companion.o(), false);
                iA5 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC111111111111115 = lVarV.c();
                androidx.compose.ui.d dVarE111111111111115 = androidx.compose.ui.c.e(lVarV, dVarB111118);
                aVarA5 = companion2.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA5);
                } else {
                    lVarV.d();
                }
                lVarA5 = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA5, i0VarH111111111116, companion2.c());
                p020r2.d4.b(lVarA5, xVarC111111111111115, companion2.e());
                pVarB5 = companion2.b();
                if (lVarA5.getInserting()) {
                    lVarA5.B(Integer.valueOf(iA5));
                    lVarA5.f(Integer.valueOf(iA5), pVarB5);
                } else {
                    lVarA5.B(Integer.valueOf(iA5));
                    lVarA5.f(Integer.valueOf(iA5), pVarB5);
                }
                p020r2.d4.b(lVarA5, dVarE111111111111115, companion2.d());
                footer.invoke(lVarV, Integer.valueOf((i26 >> 21) & 14));
                lVarV.g();
                lVarV.g();
                lVarV.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                pVar3 = pVar2;
                qVar3 = qVar2;
                aVar4 = aVar3;
                str2 = str3;
                j13 = j12;
                pair3 = pair11116;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                final androidx.compose.ui.d dVar17 = dVar2;
                final String str18 = str2;
                final Pair pair11117 = pair3;
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.wq0
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return UD.a(dVar17, j13, str18, closeImageSource, pVar3, qVar3, body, footer, aVar4, pair11117, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 100663296;
        if ((i11 & 805306368) != 0) {
            i13 |= ((i12 & 512) == 0 || !lVarV.n(pair)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
        }
        if ((i13 & 306783379) == 306783378) {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i29 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i31 != 0) {
                    jI = k3.p1.INSTANCE.i();
                }
                if (i14 != 0) {
                    str2 = null;
                }
                if (i17 != 0) {
                    pVar2 = null;
                }
                if (i19 != 0) {
                    qVar2 = null;
                } else {
                    qVar2 = qVar;
                }
                if (i24 != 0) {
                    aVar2 = null;
                } else {
                    aVar2 = aVar;
                }
                if ((i12 & 512) != 0) {
                    pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                    i13 &= -1879048193;
                    qVar2 = qVar2;
                } else {
                    pair2 = pair;
                }
                j12 = jI;
                aVar3 = aVar2;
            } else {
                if (i29 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i31 != 0) {
                    jI = k3.p1.INSTANCE.i();
                }
                if (i14 != 0) {
                    str2 = null;
                }
                if (i17 != 0) {
                    pVar2 = null;
                }
                if (i19 != 0) {
                    qVar2 = null;
                } else {
                    qVar2 = qVar;
                }
                if (i24 != 0) {
                    aVar2 = null;
                } else {
                    aVar2 = aVar;
                }
                if ((i12 & 512) != 0) {
                    pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                    i13 &= -1879048193;
                    qVar2 = qVar2;
                } else {
                    pair2 = pair;
                }
                j12 = jI;
                aVar3 = aVar2;
            }
            lVarV.C();
            if (p020r2.o.J()) {
                p020r2.o.S(72921645, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerOverlayScaffold (VisionScannerOverlayScaffold.kt:54)");
            }
            lVarV.o(-1858078478);
            objI = lVarV.I();
            if (objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.l() { // from class: com.fourthline.orca.internal.vq0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return UD.a((g4.y) obj);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            i26 = i13;
            androidx.compose.ui.d dVarD1110 = androidx.compose.foundation.b.d(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), j12, null, 2, null);
            companion = d3.c.INSTANCE;
            z3.i0 i0VarH111111111117 = androidx.compose.foundation.layout.g.h(companion.o(), false);
            iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC111111111111116 = lVarV.c();
            androidx.compose.ui.d dVarE111111111111116 = androidx.compose.ui.c.e(lVarV, dVarD1110);
            companion2 = b4.g.INSTANCE;
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
            Pair pair11118 = pair2;
            p020r2.d4.b(lVarA, i0VarH111111111117, companion2.c());
            p020r2.d4.b(lVarA, xVarC111111111111116, companion2.e());
            pVarB = companion2.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE111111111111116, companion2.d());
            androidx.compose.foundation.layout.i iVar1110 = androidx.compose.foundation.layout.i.f4585a;
            lVarV.o(-1038937986);
            if (pVar2 != null) {
                pVar2.invoke(lVarV, Integer.valueOf((i26 >> 12) & 14));
                jn0.h0 h0Var111111118 = jn0.h0.f84049a;
            }
            lVarV.l();
            lVarV.o(-1038935796);
            if (aVar3 == null) {
                i27 = 1;
            } else {
                androidx.compose.ui.d.Companion companion1111111 = androidx.compose.ui.d.INSTANCE;
                androidx.compose.ui.d dVarM111119 = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.h(companion1111111, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                z3.i0 i0VarH111111111118 = androidx.compose.foundation.layout.g.h(companion.n(), false);
                iA2 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC111111111111117 = lVarV.c();
                androidx.compose.ui.d dVarE111111111111117 = androidx.compose.ui.c.e(lVarV, dVarM111119);
                aVarA2 = companion2.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA2);
                } else {
                    lVarV.d();
                }
                lVarA2 = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA2, i0VarH111111111118, companion2.c());
                p020r2.d4.b(lVarA2, xVarC111111111111117, companion2.e());
                pVarB2 = companion2.b();
                if (lVarA2.getInserting()) {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                } else {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                }
                p020r2.d4.b(lVarA2, dVarE111111111111117, companion2.d());
                i27 = 1;
                C4670d1.a(aVar3, AbstractC3307gk.a(AbstractC3307gk.a(AbstractC3307gk.a(companion1111111, "closeButton", (String) null, 2, (Object) null), 199.0f), RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close_acessibility, 0, 2, null), lVarV, 0), false, 2, (Object) null), false, null, z2.c.e(1519979611, true, new a(closeImageSource), lVarV, 54), lVarV, 24576, 12);
                lVarV.g();
                jn0.h0 h0Var111111119 = jn0.h0.f84049a;
            }
            lVarV.l();
            lVarV.o(-1038906739);
            if (str2 != null) {
                float f11110 = 32;
                str3 = str2;
                Zg.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, w4.h.g(f11110), w4.h.g(f11110), w4.h.g(48), BitmapDescriptorFactory.HUE_RED, 8, null), BitmapDescriptorFactory.HUE_RED, i27, null), str3, null, k3.p1.INSTANCE.k(), null, null, lVarV, ((i26 >> 3) & 112) | 3072, 52);
            } else {
                str3 = str2;
            }
            lVarV.l();
            if (qVar2 != null) {
                i28 = 80;
            } else {
                i28 = 156;
            }
            androidx.compose.ui.d dVarM1111110 = androidx.compose.foundation.layout.t.m(v1.p0.c(dVar2, v1.s0.d(v1.m0.INSTANCE, lVarV, 6)), BitmapDescriptorFactory.HUE_RED, w4.h.g(i28), BitmapDescriptorFactory.HUE_RED, C3825sp.f35377a.c(lVarV, 6).f(), 5, null);
            z3.i0 i0VarA1110 = v1.g.a(v1.b.f117444a.g(), companion.g(), lVarV, 48);
            iA3 = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC111111111111118 = lVarV.c();
            androidx.compose.ui.d dVarE111111111111118 = androidx.compose.ui.c.e(lVarV, dVarM1111110);
            aVarA3 = companion2.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA3);
            } else {
                lVarV.d();
            }
            lVarA3 = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA3, i0VarA1110, companion2.c());
            p020r2.d4.b(lVarA3, xVarC111111111111118, companion2.e());
            pVarB3 = companion2.b();
            if (lVarA3.getInserting()) {
                lVarA3.B(Integer.valueOf(iA3));
                lVarA3.f(Integer.valueOf(iA3), pVarB3);
            } else {
                lVarA3.B(Integer.valueOf(iA3));
                lVarA3.f(Integer.valueOf(iA3), pVarB3);
            }
            p020r2.d4.b(lVarA3, dVarE111111111111118, companion2.d());
            jVar = v1.j.f117505a;
            lVarV.o(915714536);
            if (qVar2 != null) {
                qVar2.invoke(jVar, lVarV, Integer.valueOf(((i26 >> 12) & 112) | 6));
                jn0.h0 h0Var1111111110 = jn0.h0.f84049a;
            }
            lVarV.l();
            androidx.compose.ui.d.Companion companion1111112 = androidx.compose.ui.d.INSTANCE;
            androidx.compose.ui.d dVarB111119 = v1.i.b(jVar, companion1111112, ((Number) pair11118.e()).floatValue(), false, 2, null);
            z3.i0 i0VarH111111111119 = androidx.compose.foundation.layout.g.h(companion.e(), false);
            iA4 = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC111111111111119 = lVarV.c();
            androidx.compose.ui.d dVarE111111111111119 = androidx.compose.ui.c.e(lVarV, dVarB111119);
            aVarA4 = companion2.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA4);
            } else {
                lVarV.d();
            }
            lVarA4 = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA4, i0VarH111111111119, companion2.c());
            p020r2.d4.b(lVarA4, xVarC111111111111119, companion2.e());
            pVarB4 = companion2.b();
            if (lVarA4.getInserting()) {
                lVarA4.B(Integer.valueOf(iA4));
                lVarA4.f(Integer.valueOf(iA4), pVarB4);
            } else {
                lVarA4.B(Integer.valueOf(iA4));
                lVarA4.f(Integer.valueOf(iA4), pVarB4);
            }
            p020r2.d4.b(lVarA4, dVarE111111111111119, companion2.d());
            body.invoke(lVarV, Integer.valueOf((i26 >> 18) & 14));
            lVarV.g();
            androidx.compose.ui.d dVarB1111110 = v1.i.b(jVar, companion1111112, ((Number) pair11118.f()).floatValue(), false, 2, null);
            z3.i0 i0VarH1111111111110 = androidx.compose.foundation.layout.g.h(companion.o(), false);
            iA5 = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC1111111111111110 = lVarV.c();
            androidx.compose.ui.d dVarE1111111111111110 = androidx.compose.ui.c.e(lVarV, dVarB1111110);
            aVarA5 = companion2.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA5);
            } else {
                lVarV.d();
            }
            lVarA5 = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA5, i0VarH1111111111110, companion2.c());
            p020r2.d4.b(lVarA5, xVarC1111111111111110, companion2.e());
            pVarB5 = companion2.b();
            if (lVarA5.getInserting()) {
                lVarA5.B(Integer.valueOf(iA5));
                lVarA5.f(Integer.valueOf(iA5), pVarB5);
            } else {
                lVarA5.B(Integer.valueOf(iA5));
                lVarA5.f(Integer.valueOf(iA5), pVarB5);
            }
            p020r2.d4.b(lVarA5, dVarE1111111111111110, companion2.d());
            footer.invoke(lVarV, Integer.valueOf((i26 >> 21) & 14));
            lVarV.g();
            lVarV.g();
            lVarV.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            pVar3 = pVar2;
            qVar3 = qVar2;
            aVar4 = aVar3;
            str2 = str3;
            j13 = j12;
            pair3 = pair11118;
        } else {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i29 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i31 != 0) {
                    jI = k3.p1.INSTANCE.i();
                }
                if (i14 != 0) {
                    str2 = null;
                }
                if (i17 != 0) {
                    pVar2 = null;
                }
                if (i19 != 0) {
                    qVar2 = null;
                } else {
                    qVar2 = qVar;
                }
                if (i24 != 0) {
                    aVar2 = null;
                } else {
                    aVar2 = aVar;
                }
                if ((i12 & 512) != 0) {
                    pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                    i13 &= -1879048193;
                    qVar2 = qVar2;
                } else {
                    pair2 = pair;
                }
                j12 = jI;
                aVar3 = aVar2;
            } else {
                if (i29 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i31 != 0) {
                    jI = k3.p1.INSTANCE.i();
                }
                if (i14 != 0) {
                    str2 = null;
                }
                if (i17 != 0) {
                    pVar2 = null;
                }
                if (i19 != 0) {
                    qVar2 = null;
                } else {
                    qVar2 = qVar;
                }
                if (i24 != 0) {
                    aVar2 = null;
                } else {
                    aVar2 = aVar;
                }
                if ((i12 & 512) != 0) {
                    pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
                    i13 &= -1879048193;
                    qVar2 = qVar2;
                } else {
                    pair2 = pair;
                }
                j12 = jI;
                aVar3 = aVar2;
            }
            lVarV.C();
            if (p020r2.o.J()) {
                p020r2.o.S(72921645, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.VisionScannerOverlayScaffold (VisionScannerOverlayScaffold.kt:54)");
            }
            lVarV.o(-1858078478);
            objI = lVarV.I();
            if (objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.l() { // from class: com.fourthline.orca.internal.vq0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return UD.a((g4.y) obj);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            i26 = i13;
            androidx.compose.ui.d dVarD1111 = androidx.compose.foundation.b.d(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), j12, null, 2, null);
            companion = d3.c.INSTANCE;
            z3.i0 i0VarH1111111111111 = androidx.compose.foundation.layout.g.h(companion.o(), false);
            iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC1111111111111111 = lVarV.c();
            androidx.compose.ui.d dVarE1111111111111111 = androidx.compose.ui.c.e(lVarV, dVarD1111);
            companion2 = b4.g.INSTANCE;
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
            Pair pair11119 = pair2;
            p020r2.d4.b(lVarA, i0VarH1111111111111, companion2.c());
            p020r2.d4.b(lVarA, xVarC1111111111111111, companion2.e());
            pVarB = companion2.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE1111111111111111, companion2.d());
            androidx.compose.foundation.layout.i iVar1111 = androidx.compose.foundation.layout.i.f4585a;
            lVarV.o(-1038937986);
            if (pVar2 != null) {
                pVar2.invoke(lVarV, Integer.valueOf((i26 >> 12) & 14));
                jn0.h0 h0Var1111111111 = jn0.h0.f84049a;
            }
            lVarV.l();
            lVarV.o(-1038935796);
            if (aVar3 == null) {
                i27 = 1;
            } else {
                androidx.compose.ui.d.Companion companion1111113 = androidx.compose.ui.d.INSTANCE;
                androidx.compose.ui.d dVarM1111111 = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.h(companion1111113, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                z3.i0 i0VarH1111111111112 = androidx.compose.foundation.layout.g.h(companion.n(), false);
                iA2 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC1111111111111112 = lVarV.c();
                androidx.compose.ui.d dVarE1111111111111112 = androidx.compose.ui.c.e(lVarV, dVarM1111111);
                aVarA2 = companion2.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA2);
                } else {
                    lVarV.d();
                }
                lVarA2 = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA2, i0VarH1111111111112, companion2.c());
                p020r2.d4.b(lVarA2, xVarC1111111111111112, companion2.e());
                pVarB2 = companion2.b();
                if (lVarA2.getInserting()) {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                } else {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                }
                p020r2.d4.b(lVarA2, dVarE1111111111111112, companion2.d());
                i27 = 1;
                C4670d1.a(aVar3, AbstractC3307gk.a(AbstractC3307gk.a(AbstractC3307gk.a(companion1111113, "closeButton", (String) null, 2, (Object) null), 199.0f), RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close_acessibility, 0, 2, null), lVarV, 0), false, 2, (Object) null), false, null, z2.c.e(1519979611, true, new a(closeImageSource), lVarV, 54), lVarV, 24576, 12);
                lVarV.g();
                jn0.h0 h0Var1111111112 = jn0.h0.f84049a;
            }
            lVarV.l();
            lVarV.o(-1038906739);
            if (str2 != null) {
                float f11111 = 32;
                str3 = str2;
                Zg.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(androidx.compose.ui.d.INSTANCE, w4.h.g(f11111), w4.h.g(f11111), w4.h.g(48), BitmapDescriptorFactory.HUE_RED, 8, null), BitmapDescriptorFactory.HUE_RED, i27, null), str3, null, k3.p1.INSTANCE.k(), null, null, lVarV, ((i26 >> 3) & 112) | 3072, 52);
            } else {
                str3 = str2;
            }
            lVarV.l();
            if (qVar2 != null) {
                i28 = 80;
            } else {
                i28 = 156;
            }
            androidx.compose.ui.d dVarM1111112 = androidx.compose.foundation.layout.t.m(v1.p0.c(dVar2, v1.s0.d(v1.m0.INSTANCE, lVarV, 6)), BitmapDescriptorFactory.HUE_RED, w4.h.g(i28), BitmapDescriptorFactory.HUE_RED, C3825sp.f35377a.c(lVarV, 6).f(), 5, null);
            z3.i0 i0VarA1111 = v1.g.a(v1.b.f117444a.g(), companion.g(), lVarV, 48);
            iA3 = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC1111111111111113 = lVarV.c();
            androidx.compose.ui.d dVarE1111111111111113 = androidx.compose.ui.c.e(lVarV, dVarM1111112);
            aVarA3 = companion2.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA3);
            } else {
                lVarV.d();
            }
            lVarA3 = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA3, i0VarA1111, companion2.c());
            p020r2.d4.b(lVarA3, xVarC1111111111111113, companion2.e());
            pVarB3 = companion2.b();
            if (lVarA3.getInserting()) {
                lVarA3.B(Integer.valueOf(iA3));
                lVarA3.f(Integer.valueOf(iA3), pVarB3);
            } else {
                lVarA3.B(Integer.valueOf(iA3));
                lVarA3.f(Integer.valueOf(iA3), pVarB3);
            }
            p020r2.d4.b(lVarA3, dVarE1111111111111113, companion2.d());
            jVar = v1.j.f117505a;
            lVarV.o(915714536);
            if (qVar2 != null) {
                qVar2.invoke(jVar, lVarV, Integer.valueOf(((i26 >> 12) & 112) | 6));
                jn0.h0 h0Var1111111113 = jn0.h0.f84049a;
            }
            lVarV.l();
            androidx.compose.ui.d.Companion companion1111114 = androidx.compose.ui.d.INSTANCE;
            androidx.compose.ui.d dVarB1111111 = v1.i.b(jVar, companion1111114, ((Number) pair11119.e()).floatValue(), false, 2, null);
            z3.i0 i0VarH1111111111113 = androidx.compose.foundation.layout.g.h(companion.e(), false);
            iA4 = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC1111111111111114 = lVarV.c();
            androidx.compose.ui.d dVarE1111111111111114 = androidx.compose.ui.c.e(lVarV, dVarB1111111);
            aVarA4 = companion2.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA4);
            } else {
                lVarV.d();
            }
            lVarA4 = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA4, i0VarH1111111111113, companion2.c());
            p020r2.d4.b(lVarA4, xVarC1111111111111114, companion2.e());
            pVarB4 = companion2.b();
            if (lVarA4.getInserting()) {
                lVarA4.B(Integer.valueOf(iA4));
                lVarA4.f(Integer.valueOf(iA4), pVarB4);
            } else {
                lVarA4.B(Integer.valueOf(iA4));
                lVarA4.f(Integer.valueOf(iA4), pVarB4);
            }
            p020r2.d4.b(lVarA4, dVarE1111111111111114, companion2.d());
            body.invoke(lVarV, Integer.valueOf((i26 >> 18) & 14));
            lVarV.g();
            androidx.compose.ui.d dVarB1111112 = v1.i.b(jVar, companion1111114, ((Number) pair11119.f()).floatValue(), false, 2, null);
            z3.i0 i0VarH1111111111114 = androidx.compose.foundation.layout.g.h(companion.o(), false);
            iA5 = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC1111111111111115 = lVarV.c();
            androidx.compose.ui.d dVarE1111111111111115 = androidx.compose.ui.c.e(lVarV, dVarB1111112);
            aVarA5 = companion2.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA5);
            } else {
                lVarV.d();
            }
            lVarA5 = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA5, i0VarH1111111111114, companion2.c());
            p020r2.d4.b(lVarA5, xVarC1111111111111115, companion2.e());
            pVarB5 = companion2.b();
            if (lVarA5.getInserting()) {
                lVarA5.B(Integer.valueOf(iA5));
                lVarA5.f(Integer.valueOf(iA5), pVarB5);
            } else {
                lVarA5.B(Integer.valueOf(iA5));
                lVarA5.f(Integer.valueOf(iA5), pVarB5);
            }
            p020r2.d4.b(lVarA5, dVarE1111111111111115, companion2.d());
            footer.invoke(lVarV, Integer.valueOf((i26 >> 21) & 14));
            lVarV.g();
            lVarV.g();
            lVarV.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            pVar3 = pVar2;
            qVar3 = qVar2;
            aVar4 = aVar3;
            str2 = str3;
            j13 = j12;
            pair3 = pair11119;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            final androidx.compose.ui.d dVar18 = dVar2;
            final String str19 = str2;
            final Pair pair111110 = pair3;
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.wq0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return UD.a(dVar18, j13, str19, closeImageSource, pVar3, qVar3, body, footer, aVar4, pair111110, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(g4.y semantics) {
        p013kotlin.jvm.internal.s.k(semantics, "$this$semantics");
        g4.w.a(semantics, true);
        return jn0.h0.f84049a;
    }
}
