package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p009i2.C4670d1;

/* JADX INFO: renamed from: com.fourthline.orca.internal.cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3127cb {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.cb$a */
    static final class a implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3903uh f30850a;

        a(InterfaceC3903uh interfaceC3903uh) {
            this.f30850a = interfaceC3903uh;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-485836106, i11, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.ScannerCloseButton.<anonymous>.<anonymous> (DocumentScannerOverlayScaffold.kt:166)");
            }
            p009i2.e1.a(AbstractC3946vh.a(this.f30850a, lVar, 0), null, null, k3.p1.p(k3.p1.INSTANCE.k(), 0.7f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), lVar, 3120, 4);
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
    public static final jn0.h0 a(InterfaceC3004Wa.c cVar, androidx.compose.ui.d dVar, long j11, InterfaceC3903uh interfaceC3903uh, wn0.p pVar, wn0.p pVar2, wn0.p pVar3, wn0.a aVar, int i11, int i12, p020r2.l lVar, int i13) {
        a(cVar, dVar, j11, interfaceC3903uh, pVar, pVar2, pVar3, aVar, lVar, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(InterfaceC3903uh interfaceC3903uh, wn0.a aVar, int i11, p020r2.l lVar, int i12) {
        a(interfaceC3903uh, aVar, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    private static final boolean b(InterfaceC3004Wa interfaceC3004Wa) {
        InterfaceC3004Wa.c.a aVar = interfaceC3004Wa instanceof InterfaceC3004Wa.c.a ? (InterfaceC3004Wa.c.a) interfaceC3004Wa : null;
        return ((aVar != null ? aVar.p() : null) == null && interfaceC3004Wa.h()) ? false : true;
    }

    private static final boolean c(InterfaceC3004Wa interfaceC3004Wa) {
        boolean z11 = interfaceC3004Wa instanceof InterfaceC3004Wa.c.b;
        InterfaceC3004Wa.c.a aVar = interfaceC3004Wa instanceof InterfaceC3004Wa.c.a ? (InterfaceC3004Wa.c.a) interfaceC3004Wa : null;
        return z11 || ((aVar != null ? aVar.p() : null) != null) || !interfaceC3004Wa.h();
    }

    private static final boolean d(InterfaceC3004Wa interfaceC3004Wa) {
        boolean z11 = interfaceC3004Wa instanceof InterfaceC3004Wa.c.b;
        InterfaceC3004Wa.c.a aVar = interfaceC3004Wa instanceof InterfaceC3004Wa.c.a ? (InterfaceC3004Wa.c.a) interfaceC3004Wa : null;
        return z11 || ((aVar != null ? aVar.p() : null) != null) || !interfaceC3004Wa.h();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012d  */
    /* JADX WARN: Code duplicated, block: B:101:0x0136  */
    /* JADX WARN: Code duplicated, block: B:104:0x013b  */
    /* JADX WARN: Code duplicated, block: B:105:0x013d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0145  */
    /* JADX WARN: Code duplicated, block: B:111:0x0160  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:117:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:118:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:123:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:126:0x0221  */
    /* JADX WARN: Code duplicated, block: B:129:0x022d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0231  */
    /* JADX WARN: Code duplicated, block: B:133:0x0252  */
    /* JADX WARN: Code duplicated, block: B:135:0x0260  */
    /* JADX WARN: Code duplicated, block: B:138:0x0283  */
    /* JADX WARN: Code duplicated, block: B:140:0x0289  */
    /* JADX WARN: Code duplicated, block: B:141:0x028c  */
    /* JADX WARN: Code duplicated, block: B:144:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:147:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:148:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:151:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:153:0x0300  */
    /* JADX WARN: Code duplicated, block: B:157:0x032c  */
    /* JADX WARN: Code duplicated, block: B:158:0x032f  */
    /* JADX WARN: Code duplicated, block: B:161:0x035a  */
    /* JADX WARN: Code duplicated, block: B:164:0x0366  */
    /* JADX WARN: Code duplicated, block: B:165:0x036a  */
    /* JADX WARN: Code duplicated, block: B:168:0x0389  */
    /* JADX WARN: Code duplicated, block: B:170:0x0397  */
    /* JADX WARN: Code duplicated, block: B:173:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:175:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:176:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:179:0x0406  */
    /* JADX WARN: Code duplicated, block: B:182:0x0412  */
    /* JADX WARN: Code duplicated, block: B:183:0x0416  */
    /* JADX WARN: Code duplicated, block: B:186:0x0435  */
    /* JADX WARN: Code duplicated, block: B:188:0x0443  */
    /* JADX WARN: Code duplicated, block: B:192:0x0478 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:197:0x0490  */
    /* JADX WARN: Code duplicated, block: B:201:0x049d  */
    /* JADX WARN: Code duplicated, block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    /* JADX WARN: Code duplicated, block: B:35:0x0080  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    /* JADX WARN: Code duplicated, block: B:40:0x008a  */
    /* JADX WARN: Code duplicated, block: B:41:0x008d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0091  */
    /* JADX WARN: Code duplicated, block: B:45:0x0095  */
    /* JADX WARN: Code duplicated, block: B:46:0x009a  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00df  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:86:0x0100  */
    /* JADX WARN: Code duplicated, block: B:88:0x0106  */
    /* JADX WARN: Code duplicated, block: B:89:0x0109  */
    /* JADX WARN: Code duplicated, block: B:93:0x0117  */
    /* JADX WARN: Code duplicated, block: B:97:0x0126 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0128  */
    public static final void a(final InterfaceC3004Wa.c state, androidx.compose.ui.d dVar, long j11, final InterfaceC3903uh closeImageSource, final wn0.p header, final wn0.p body, final wn0.p footer, wn0.a aVar, p020r2.l lVar, final int i11, final int i12) {
        int i13;
        androidx.compose.ui.d dVar2;
        int i14;
        long j12;
        int i15;
        boolean zK;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        long jI;
        wn0.a aVar2;
        Object objI;
        d3.c.Companion companion;
        int iA;
        b4.g.Companion companion2;
        wn0.a<b4.g> aVarA;
        p020r2.l lVarA;
        wn0.p<b4.g, Integer, jn0.h0> pVarB;
        androidx.compose.ui.d.Companion companion3;
        int iA2;
        int i23;
        wn0.a<b4.g> aVarA2;
        p020r2.l lVarA2;
        wn0.p<b4.g, Integer, jn0.h0> pVarB2;
        v1.j jVar;
        float f11;
        int iA3;
        wn0.a<b4.g> aVarA3;
        p020r2.l lVarA3;
        wn0.p<b4.g, Integer, jn0.h0> pVarB3;
        final long j13;
        float f12;
        int iA4;
        wn0.a<b4.g> aVarA4;
        p020r2.l lVarA4;
        wn0.p<b4.g, Integer, jn0.h0> pVarB4;
        float f13;
        int iA5;
        wn0.a<b4.g> aVarA5;
        p020r2.l lVarA5;
        wn0.p<b4.g, Integer, jn0.h0> pVarB5;
        p020r2.w2 w2VarX;
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(closeImageSource, "closeImageSource");
        p013kotlin.jvm.internal.s.k(header, "header");
        p013kotlin.jvm.internal.s.k(body, "body");
        p013kotlin.jvm.internal.s.k(footer, "footer");
        p020r2.l lVarV = lVar.v(-1328177147);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = ((i11 & 8) == 0 ? lVarV.n(state) : lVarV.K(state) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i24 = i12 & 2;
        if (i24 == 0) {
            if ((i11 & 48) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                    j12 = j11;
                    if (lVarV.s(j12)) {
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
                if ((i12 & 16) != 0) {
                    i13 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    if (lVarV.K(header)) {
                        i17 = 16384;
                    } else {
                        i17 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i17;
                }
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    if (lVarV.K(body)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
                if ((i12 & 64) != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (lVarV.K(footer)) {
                        i19 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i19 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i19;
                }
                i21 = i12 & 128;
                if (i21 != 0) {
                    i13 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    if (lVarV.K(aVar)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i13 |= i22;
                }
                if ((i13 & 4793491) != 4793490 && lVarV.b()) {
                    lVarV.j();
                    aVar2 = aVar;
                    j13 = j12;
                } else {
                    if (i24 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        jI = k3.p1.INSTANCE.i();
                    } else {
                        jI = j12;
                    }
                    if (i21 != 0) {
                        aVar2 = null;
                    } else {
                        aVar2 = aVar;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1328177147, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.DocumentScannerOverlayScaffold (DocumentScannerOverlayScaffold.kt:59)");
                    }
                    lVarV.o(-157668539);
                    objI = lVarV.I();
                    if (objI == p020r2.l.INSTANCE.a()) {
                        objI = new wn0.l() { // from class: com.fourthline.orca.internal.wy0
                            @Override // wn0.l
                            public final Object invoke(Object obj) {
                                return AbstractC3127cb.a((g4.y) obj);
                            }
                        };
                        lVarV.B(objI);
                    }
                    lVarV.l();
                    androidx.compose.ui.d dVarD = androidx.compose.foundation.b.d(androidx.compose.foundation.layout.x.f(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), BitmapDescriptorFactory.HUE_RED, 1, null), jI, null, 2, null);
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
                    p020r2.d4.b(lVarA, i0VarH, companion2.c());
                    p020r2.d4.b(lVarA, xVarC, companion2.e());
                    pVarB = companion2.b();
                    if (!lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    p020r2.d4.b(lVarA, dVarE, companion2.d());
                    androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
                    companion3 = androidx.compose.ui.d.INSTANCE;
                    z3.i0 i0VarA = v1.g.a(v1.b.f117444a.g(), companion.k(), lVarV, 0);
                    iA2 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC2 = lVarV.c();
                    androidx.compose.ui.d dVarE2 = androidx.compose.ui.c.e(lVarV, companion3);
                    i23 = i13;
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
                    androidx.compose.ui.d dVar3 = dVar2;
                    p020r2.d4.b(lVarA2, i0VarA, companion2.c());
                    p020r2.d4.b(lVarA2, xVarC2, companion2.e());
                    pVarB2 = companion2.b();
                    if (!lVarA2.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA2.I(), Integer.valueOf(iA2))) {
                        lVarA2.B(Integer.valueOf(iA2));
                        lVarA2.f(Integer.valueOf(iA2), pVarB2);
                    }
                    p020r2.d4.b(lVarA2, dVarE2, companion2.d());
                    jVar = v1.j.f117505a;
                    lVarV.o(-1277778849);
                    if (d(state)) {
                        if (d(state)) {
                            f13 = 1.0f;
                        } else {
                            f13 = BitmapDescriptorFactory.HUE_RED;
                        }
                        androidx.compose.ui.d dVarB = v1.i.b(jVar, androidx.compose.foundation.layout.x.h(h3.a.a(companion3, f13), BitmapDescriptorFactory.HUE_RED, 1, null), 1.0f, false, 2, null);
                        z3.i0 i0VarH2 = androidx.compose.foundation.layout.g.h(companion.m(), false);
                        iA5 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC3 = lVarV.c();
                        androidx.compose.ui.d dVarE3 = androidx.compose.ui.c.e(lVarV, dVarB);
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
                        p020r2.d4.b(lVarA5, i0VarH2, companion2.c());
                        p020r2.d4.b(lVarA5, xVarC3, companion2.e());
                        pVarB5 = companion2.b();
                        if (!lVarA5.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA5.I(), Integer.valueOf(iA5))) {
                            lVarA5.B(Integer.valueOf(iA5));
                            lVarA5.f(Integer.valueOf(iA5), pVarB5);
                        }
                        p020r2.d4.b(lVarA5, dVarE3, companion2.d());
                        header.invoke(lVarV, Integer.valueOf((i23 >> 12) & 14));
                        lVarV.g();
                    }
                    lVarV.l();
                    if (a(state)) {
                        f11 = 1.0f;
                    } else {
                        f11 = BitmapDescriptorFactory.HUE_RED;
                    }
                    androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.x.h(h3.a.a(companion3, f11), BitmapDescriptorFactory.HUE_RED, 1, null);
                    z3.i0 i0VarH3 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                    iA3 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC4 = lVarV.c();
                    androidx.compose.ui.d dVarE4 = androidx.compose.ui.c.e(lVarV, dVarH);
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
                    p020r2.d4.b(lVarA3, i0VarH3, companion2.c());
                    p020r2.d4.b(lVarA3, xVarC4, companion2.e());
                    pVarB3 = companion2.b();
                    if (!lVarA3.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA3.I(), Integer.valueOf(iA3))) {
                        lVarA3.B(Integer.valueOf(iA3));
                        lVarA3.f(Integer.valueOf(iA3), pVarB3);
                    }
                    p020r2.d4.b(lVarA3, dVarE4, companion2.d());
                    body.invoke(lVarV, Integer.valueOf((i23 >> 15) & 14));
                    lVarV.g();
                    lVarV.o(-1277755198);
                    if (c(state)) {
                        if (c(state)) {
                            f12 = 1.0f;
                        } else {
                            f12 = BitmapDescriptorFactory.HUE_RED;
                        }
                        androidx.compose.ui.d dVarB2 = v1.i.b(jVar, androidx.compose.foundation.layout.x.h(h3.a.a(companion3, f12), BitmapDescriptorFactory.HUE_RED, 1, null), 1.0f, false, 2, null);
                        z3.i0 i0VarH4 = androidx.compose.foundation.layout.g.h(companion.b(), false);
                        iA4 = p020r2.j.a(lVarV, 0);
                        p020r2.x xVarC5 = lVarV.c();
                        androidx.compose.ui.d dVarE5 = androidx.compose.ui.c.e(lVarV, dVarB2);
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
                        p020r2.d4.b(lVarA4, i0VarH4, companion2.c());
                        p020r2.d4.b(lVarA4, xVarC5, companion2.e());
                        pVarB4 = companion2.b();
                        if (!lVarA4.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA4.I(), Integer.valueOf(iA4))) {
                            lVarA4.B(Integer.valueOf(iA4));
                            lVarA4.f(Integer.valueOf(iA4), pVarB4);
                        }
                        p020r2.d4.b(lVarA4, dVarE5, companion2.d());
                        footer.invoke(lVarV, Integer.valueOf((i23 >> 18) & 14));
                        lVarV.g();
                    }
                    lVarV.l();
                    lVarV.g();
                    lVarV.o(1067765047);
                    if (b(state) && aVar2 != null) {
                        a(closeImageSource, aVar2, lVarV, (i23 >> 9) & 14);
                        jn0.h0 h0Var = jn0.h0.f84049a;
                    }
                    lVarV.l();
                    lVarV.g();
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    dVar2 = dVar3;
                    j13 = jI;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    final androidx.compose.ui.d dVar4 = dVar2;
                    final wn0.a aVar3 = aVar2;
                    w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.xy0
                        @Override // wn0.p
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC3127cb.a(state, dVar4, j13, closeImageSource, header, body, footer, aVar3, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= KyberEngine.KyberPolyBytes;
            j12 = j11;
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
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                if (lVarV.K(header)) {
                    i17 = 16384;
                } else {
                    i17 = PKIFailureInfo.certRevoked;
                }
                i13 |= i17;
            }
            if ((i12 & 32) != 0) {
                i13 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (lVarV.K(body)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i13 |= i18;
            }
            if ((i12 & 64) != 0) {
                i13 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (lVarV.K(footer)) {
                    i19 = PKIFailureInfo.badCertTemplate;
                } else {
                    i19 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i19;
            }
            i21 = i12 & 128;
            if (i21 != 0) {
                i13 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                if (lVarV.K(aVar)) {
                    i22 = 8388608;
                } else {
                    i22 = 4194304;
                }
                i13 |= i22;
            }
            if ((i13 & 4793491) != 4793490) {
                if (i24 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    jI = k3.p1.INSTANCE.i();
                } else {
                    jI = j12;
                }
                if (i21 != 0) {
                    aVar2 = null;
                } else {
                    aVar2 = aVar;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1328177147, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.DocumentScannerOverlayScaffold (DocumentScannerOverlayScaffold.kt:59)");
                }
                lVarV.o(-157668539);
                objI = lVarV.I();
                if (objI == p020r2.l.INSTANCE.a()) {
                    objI = new wn0.l() { // from class: com.fourthline.orca.internal.wy0
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return AbstractC3127cb.a((g4.y) obj);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                androidx.compose.ui.d dVarD2 = androidx.compose.foundation.b.d(androidx.compose.foundation.layout.x.f(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), BitmapDescriptorFactory.HUE_RED, 1, null), jI, null, 2, null);
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
                p020r2.d4.b(lVarA, i0VarH5, companion2.c());
                p020r2.d4.b(lVarA, xVarC6, companion2.e());
                pVarB = companion2.b();
                if (!lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                p020r2.d4.b(lVarA, dVarE6, companion2.d());
                androidx.compose.foundation.layout.i iVar2 = androidx.compose.foundation.layout.i.f4585a;
                companion3 = androidx.compose.ui.d.INSTANCE;
                z3.i0 i0VarA2 = v1.g.a(v1.b.f117444a.g(), companion.k(), lVarV, 0);
                iA2 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC7 = lVarV.c();
                androidx.compose.ui.d dVarE7 = androidx.compose.ui.c.e(lVarV, companion3);
                i23 = i13;
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
                androidx.compose.ui.d dVar5 = dVar2;
                p020r2.d4.b(lVarA2, i0VarA2, companion2.c());
                p020r2.d4.b(lVarA2, xVarC7, companion2.e());
                pVarB2 = companion2.b();
                if (!lVarA2.getInserting()) {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                } else {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                }
                p020r2.d4.b(lVarA2, dVarE7, companion2.d());
                jVar = v1.j.f117505a;
                lVarV.o(-1277778849);
                if (d(state)) {
                    if (d(state)) {
                        f13 = 1.0f;
                    } else {
                        f13 = BitmapDescriptorFactory.HUE_RED;
                    }
                    androidx.compose.ui.d dVarB3 = v1.i.b(jVar, androidx.compose.foundation.layout.x.h(h3.a.a(companion3, f13), BitmapDescriptorFactory.HUE_RED, 1, null), 1.0f, false, 2, null);
                    z3.i0 i0VarH6 = androidx.compose.foundation.layout.g.h(companion.m(), false);
                    iA5 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC8 = lVarV.c();
                    androidx.compose.ui.d dVarE8 = androidx.compose.ui.c.e(lVarV, dVarB3);
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
                    p020r2.d4.b(lVarA5, i0VarH6, companion2.c());
                    p020r2.d4.b(lVarA5, xVarC8, companion2.e());
                    pVarB5 = companion2.b();
                    if (!lVarA5.getInserting()) {
                        lVarA5.B(Integer.valueOf(iA5));
                        lVarA5.f(Integer.valueOf(iA5), pVarB5);
                    } else {
                        lVarA5.B(Integer.valueOf(iA5));
                        lVarA5.f(Integer.valueOf(iA5), pVarB5);
                    }
                    p020r2.d4.b(lVarA5, dVarE8, companion2.d());
                    header.invoke(lVarV, Integer.valueOf((i23 >> 12) & 14));
                    lVarV.g();
                }
                lVarV.l();
                if (a(state)) {
                    f11 = 1.0f;
                } else {
                    f11 = BitmapDescriptorFactory.HUE_RED;
                }
                androidx.compose.ui.d dVarH2 = androidx.compose.foundation.layout.x.h(h3.a.a(companion3, f11), BitmapDescriptorFactory.HUE_RED, 1, null);
                z3.i0 i0VarH7 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                iA3 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC9 = lVarV.c();
                androidx.compose.ui.d dVarE9 = androidx.compose.ui.c.e(lVarV, dVarH2);
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
                p020r2.d4.b(lVarA3, i0VarH7, companion2.c());
                p020r2.d4.b(lVarA3, xVarC9, companion2.e());
                pVarB3 = companion2.b();
                if (!lVarA3.getInserting()) {
                    lVarA3.B(Integer.valueOf(iA3));
                    lVarA3.f(Integer.valueOf(iA3), pVarB3);
                } else {
                    lVarA3.B(Integer.valueOf(iA3));
                    lVarA3.f(Integer.valueOf(iA3), pVarB3);
                }
                p020r2.d4.b(lVarA3, dVarE9, companion2.d());
                body.invoke(lVarV, Integer.valueOf((i23 >> 15) & 14));
                lVarV.g();
                lVarV.o(-1277755198);
                if (c(state)) {
                    if (c(state)) {
                        f12 = 1.0f;
                    } else {
                        f12 = BitmapDescriptorFactory.HUE_RED;
                    }
                    androidx.compose.ui.d dVarB4 = v1.i.b(jVar, androidx.compose.foundation.layout.x.h(h3.a.a(companion3, f12), BitmapDescriptorFactory.HUE_RED, 1, null), 1.0f, false, 2, null);
                    z3.i0 i0VarH8 = androidx.compose.foundation.layout.g.h(companion.b(), false);
                    iA4 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC10 = lVarV.c();
                    androidx.compose.ui.d dVarE10 = androidx.compose.ui.c.e(lVarV, dVarB4);
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
                    p020r2.d4.b(lVarA4, i0VarH8, companion2.c());
                    p020r2.d4.b(lVarA4, xVarC10, companion2.e());
                    pVarB4 = companion2.b();
                    if (!lVarA4.getInserting()) {
                        lVarA4.B(Integer.valueOf(iA4));
                        lVarA4.f(Integer.valueOf(iA4), pVarB4);
                    } else {
                        lVarA4.B(Integer.valueOf(iA4));
                        lVarA4.f(Integer.valueOf(iA4), pVarB4);
                    }
                    p020r2.d4.b(lVarA4, dVarE10, companion2.d());
                    footer.invoke(lVarV, Integer.valueOf((i23 >> 18) & 14));
                    lVarV.g();
                }
                lVarV.l();
                lVarV.g();
                lVarV.o(1067765047);
                if (b(state)) {
                    a(closeImageSource, aVar2, lVarV, (i23 >> 9) & 14);
                    jn0.h0 h0Var2 = jn0.h0.f84049a;
                }
                lVarV.l();
                lVarV.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar2 = dVar5;
                j13 = jI;
            } else {
                if (i24 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    jI = k3.p1.INSTANCE.i();
                } else {
                    jI = j12;
                }
                if (i21 != 0) {
                    aVar2 = null;
                } else {
                    aVar2 = aVar;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1328177147, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.DocumentScannerOverlayScaffold (DocumentScannerOverlayScaffold.kt:59)");
                }
                lVarV.o(-157668539);
                objI = lVarV.I();
                if (objI == p020r2.l.INSTANCE.a()) {
                    objI = new wn0.l() { // from class: com.fourthline.orca.internal.wy0
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return AbstractC3127cb.a((g4.y) obj);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                androidx.compose.ui.d dVarD3 = androidx.compose.foundation.b.d(androidx.compose.foundation.layout.x.f(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), BitmapDescriptorFactory.HUE_RED, 1, null), jI, null, 2, null);
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
                p020r2.d4.b(lVarA, i0VarH9, companion2.c());
                p020r2.d4.b(lVarA, xVarC11, companion2.e());
                pVarB = companion2.b();
                if (!lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                p020r2.d4.b(lVarA, dVarE11, companion2.d());
                androidx.compose.foundation.layout.i iVar3 = androidx.compose.foundation.layout.i.f4585a;
                companion3 = androidx.compose.ui.d.INSTANCE;
                z3.i0 i0VarA3 = v1.g.a(v1.b.f117444a.g(), companion.k(), lVarV, 0);
                iA2 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC12 = lVarV.c();
                androidx.compose.ui.d dVarE12 = androidx.compose.ui.c.e(lVarV, companion3);
                i23 = i13;
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
                androidx.compose.ui.d dVar6 = dVar2;
                p020r2.d4.b(lVarA2, i0VarA3, companion2.c());
                p020r2.d4.b(lVarA2, xVarC12, companion2.e());
                pVarB2 = companion2.b();
                if (!lVarA2.getInserting()) {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                } else {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                }
                p020r2.d4.b(lVarA2, dVarE12, companion2.d());
                jVar = v1.j.f117505a;
                lVarV.o(-1277778849);
                if (d(state)) {
                    if (d(state)) {
                        f13 = 1.0f;
                    } else {
                        f13 = BitmapDescriptorFactory.HUE_RED;
                    }
                    androidx.compose.ui.d dVarB5 = v1.i.b(jVar, androidx.compose.foundation.layout.x.h(h3.a.a(companion3, f13), BitmapDescriptorFactory.HUE_RED, 1, null), 1.0f, false, 2, null);
                    z3.i0 i0VarH10 = androidx.compose.foundation.layout.g.h(companion.m(), false);
                    iA5 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC13 = lVarV.c();
                    androidx.compose.ui.d dVarE13 = androidx.compose.ui.c.e(lVarV, dVarB5);
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
                    p020r2.d4.b(lVarA5, i0VarH10, companion2.c());
                    p020r2.d4.b(lVarA5, xVarC13, companion2.e());
                    pVarB5 = companion2.b();
                    if (!lVarA5.getInserting()) {
                        lVarA5.B(Integer.valueOf(iA5));
                        lVarA5.f(Integer.valueOf(iA5), pVarB5);
                    } else {
                        lVarA5.B(Integer.valueOf(iA5));
                        lVarA5.f(Integer.valueOf(iA5), pVarB5);
                    }
                    p020r2.d4.b(lVarA5, dVarE13, companion2.d());
                    header.invoke(lVarV, Integer.valueOf((i23 >> 12) & 14));
                    lVarV.g();
                }
                lVarV.l();
                if (a(state)) {
                    f11 = 1.0f;
                } else {
                    f11 = BitmapDescriptorFactory.HUE_RED;
                }
                androidx.compose.ui.d dVarH3 = androidx.compose.foundation.layout.x.h(h3.a.a(companion3, f11), BitmapDescriptorFactory.HUE_RED, 1, null);
                z3.i0 i0VarH11 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                iA3 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC14 = lVarV.c();
                androidx.compose.ui.d dVarE14 = androidx.compose.ui.c.e(lVarV, dVarH3);
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
                p020r2.d4.b(lVarA3, i0VarH11, companion2.c());
                p020r2.d4.b(lVarA3, xVarC14, companion2.e());
                pVarB3 = companion2.b();
                if (!lVarA3.getInserting()) {
                    lVarA3.B(Integer.valueOf(iA3));
                    lVarA3.f(Integer.valueOf(iA3), pVarB3);
                } else {
                    lVarA3.B(Integer.valueOf(iA3));
                    lVarA3.f(Integer.valueOf(iA3), pVarB3);
                }
                p020r2.d4.b(lVarA3, dVarE14, companion2.d());
                body.invoke(lVarV, Integer.valueOf((i23 >> 15) & 14));
                lVarV.g();
                lVarV.o(-1277755198);
                if (c(state)) {
                    if (c(state)) {
                        f12 = 1.0f;
                    } else {
                        f12 = BitmapDescriptorFactory.HUE_RED;
                    }
                    androidx.compose.ui.d dVarB6 = v1.i.b(jVar, androidx.compose.foundation.layout.x.h(h3.a.a(companion3, f12), BitmapDescriptorFactory.HUE_RED, 1, null), 1.0f, false, 2, null);
                    z3.i0 i0VarH12 = androidx.compose.foundation.layout.g.h(companion.b(), false);
                    iA4 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC15 = lVarV.c();
                    androidx.compose.ui.d dVarE15 = androidx.compose.ui.c.e(lVarV, dVarB6);
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
                    p020r2.d4.b(lVarA4, i0VarH12, companion2.c());
                    p020r2.d4.b(lVarA4, xVarC15, companion2.e());
                    pVarB4 = companion2.b();
                    if (!lVarA4.getInserting()) {
                        lVarA4.B(Integer.valueOf(iA4));
                        lVarA4.f(Integer.valueOf(iA4), pVarB4);
                    } else {
                        lVarA4.B(Integer.valueOf(iA4));
                        lVarA4.f(Integer.valueOf(iA4), pVarB4);
                    }
                    p020r2.d4.b(lVarA4, dVarE15, companion2.d());
                    footer.invoke(lVarV, Integer.valueOf((i23 >> 18) & 14));
                    lVarV.g();
                }
                lVarV.l();
                lVarV.g();
                lVarV.o(1067765047);
                if (b(state)) {
                    a(closeImageSource, aVar2, lVarV, (i23 >> 9) & 14);
                    jn0.h0 h0Var3 = jn0.h0.f84049a;
                }
                lVarV.l();
                lVarV.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar2 = dVar6;
                j13 = jI;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                final androidx.compose.ui.d dVar7 = dVar2;
                final wn0.a aVar4 = aVar2;
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.xy0
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC3127cb.a(state, dVar7, j13, closeImageSource, header, body, footer, aVar4, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        dVar2 = dVar;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                j12 = j11;
                if (lVarV.s(j12)) {
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
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                if (lVarV.K(header)) {
                    i17 = 16384;
                } else {
                    i17 = PKIFailureInfo.certRevoked;
                }
                i13 |= i17;
            }
            if ((i12 & 32) != 0) {
                i13 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (lVarV.K(body)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i13 |= i18;
            }
            if ((i12 & 64) != 0) {
                i13 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (lVarV.K(footer)) {
                    i19 = PKIFailureInfo.badCertTemplate;
                } else {
                    i19 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i19;
            }
            i21 = i12 & 128;
            if (i21 != 0) {
                i13 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                if (lVarV.K(aVar)) {
                    i22 = 8388608;
                } else {
                    i22 = 4194304;
                }
                i13 |= i22;
            }
            if ((i13 & 4793491) != 4793490) {
                if (i24 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    jI = k3.p1.INSTANCE.i();
                } else {
                    jI = j12;
                }
                if (i21 != 0) {
                    aVar2 = null;
                } else {
                    aVar2 = aVar;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1328177147, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.DocumentScannerOverlayScaffold (DocumentScannerOverlayScaffold.kt:59)");
                }
                lVarV.o(-157668539);
                objI = lVarV.I();
                if (objI == p020r2.l.INSTANCE.a()) {
                    objI = new wn0.l() { // from class: com.fourthline.orca.internal.wy0
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return AbstractC3127cb.a((g4.y) obj);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                androidx.compose.ui.d dVarD4 = androidx.compose.foundation.b.d(androidx.compose.foundation.layout.x.f(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), BitmapDescriptorFactory.HUE_RED, 1, null), jI, null, 2, null);
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
                p020r2.d4.b(lVarA, i0VarH13, companion2.c());
                p020r2.d4.b(lVarA, xVarC16, companion2.e());
                pVarB = companion2.b();
                if (!lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                p020r2.d4.b(lVarA, dVarE16, companion2.d());
                androidx.compose.foundation.layout.i iVar4 = androidx.compose.foundation.layout.i.f4585a;
                companion3 = androidx.compose.ui.d.INSTANCE;
                z3.i0 i0VarA4 = v1.g.a(v1.b.f117444a.g(), companion.k(), lVarV, 0);
                iA2 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC17 = lVarV.c();
                androidx.compose.ui.d dVarE17 = androidx.compose.ui.c.e(lVarV, companion3);
                i23 = i13;
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
                androidx.compose.ui.d dVar8 = dVar2;
                p020r2.d4.b(lVarA2, i0VarA4, companion2.c());
                p020r2.d4.b(lVarA2, xVarC17, companion2.e());
                pVarB2 = companion2.b();
                if (!lVarA2.getInserting()) {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                } else {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                }
                p020r2.d4.b(lVarA2, dVarE17, companion2.d());
                jVar = v1.j.f117505a;
                lVarV.o(-1277778849);
                if (d(state)) {
                    if (d(state)) {
                        f13 = 1.0f;
                    } else {
                        f13 = BitmapDescriptorFactory.HUE_RED;
                    }
                    androidx.compose.ui.d dVarB7 = v1.i.b(jVar, androidx.compose.foundation.layout.x.h(h3.a.a(companion3, f13), BitmapDescriptorFactory.HUE_RED, 1, null), 1.0f, false, 2, null);
                    z3.i0 i0VarH14 = androidx.compose.foundation.layout.g.h(companion.m(), false);
                    iA5 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC18 = lVarV.c();
                    androidx.compose.ui.d dVarE18 = androidx.compose.ui.c.e(lVarV, dVarB7);
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
                    p020r2.d4.b(lVarA5, i0VarH14, companion2.c());
                    p020r2.d4.b(lVarA5, xVarC18, companion2.e());
                    pVarB5 = companion2.b();
                    if (!lVarA5.getInserting()) {
                        lVarA5.B(Integer.valueOf(iA5));
                        lVarA5.f(Integer.valueOf(iA5), pVarB5);
                    } else {
                        lVarA5.B(Integer.valueOf(iA5));
                        lVarA5.f(Integer.valueOf(iA5), pVarB5);
                    }
                    p020r2.d4.b(lVarA5, dVarE18, companion2.d());
                    header.invoke(lVarV, Integer.valueOf((i23 >> 12) & 14));
                    lVarV.g();
                }
                lVarV.l();
                if (a(state)) {
                    f11 = 1.0f;
                } else {
                    f11 = BitmapDescriptorFactory.HUE_RED;
                }
                androidx.compose.ui.d dVarH4 = androidx.compose.foundation.layout.x.h(h3.a.a(companion3, f11), BitmapDescriptorFactory.HUE_RED, 1, null);
                z3.i0 i0VarH15 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                iA3 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC19 = lVarV.c();
                androidx.compose.ui.d dVarE19 = androidx.compose.ui.c.e(lVarV, dVarH4);
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
                p020r2.d4.b(lVarA3, i0VarH15, companion2.c());
                p020r2.d4.b(lVarA3, xVarC19, companion2.e());
                pVarB3 = companion2.b();
                if (!lVarA3.getInserting()) {
                    lVarA3.B(Integer.valueOf(iA3));
                    lVarA3.f(Integer.valueOf(iA3), pVarB3);
                } else {
                    lVarA3.B(Integer.valueOf(iA3));
                    lVarA3.f(Integer.valueOf(iA3), pVarB3);
                }
                p020r2.d4.b(lVarA3, dVarE19, companion2.d());
                body.invoke(lVarV, Integer.valueOf((i23 >> 15) & 14));
                lVarV.g();
                lVarV.o(-1277755198);
                if (c(state)) {
                    if (c(state)) {
                        f12 = 1.0f;
                    } else {
                        f12 = BitmapDescriptorFactory.HUE_RED;
                    }
                    androidx.compose.ui.d dVarB8 = v1.i.b(jVar, androidx.compose.foundation.layout.x.h(h3.a.a(companion3, f12), BitmapDescriptorFactory.HUE_RED, 1, null), 1.0f, false, 2, null);
                    z3.i0 i0VarH16 = androidx.compose.foundation.layout.g.h(companion.b(), false);
                    iA4 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC110 = lVarV.c();
                    androidx.compose.ui.d dVarE110 = androidx.compose.ui.c.e(lVarV, dVarB8);
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
                    p020r2.d4.b(lVarA4, i0VarH16, companion2.c());
                    p020r2.d4.b(lVarA4, xVarC110, companion2.e());
                    pVarB4 = companion2.b();
                    if (!lVarA4.getInserting()) {
                        lVarA4.B(Integer.valueOf(iA4));
                        lVarA4.f(Integer.valueOf(iA4), pVarB4);
                    } else {
                        lVarA4.B(Integer.valueOf(iA4));
                        lVarA4.f(Integer.valueOf(iA4), pVarB4);
                    }
                    p020r2.d4.b(lVarA4, dVarE110, companion2.d());
                    footer.invoke(lVarV, Integer.valueOf((i23 >> 18) & 14));
                    lVarV.g();
                }
                lVarV.l();
                lVarV.g();
                lVarV.o(1067765047);
                if (b(state)) {
                    a(closeImageSource, aVar2, lVarV, (i23 >> 9) & 14);
                    jn0.h0 h0Var4 = jn0.h0.f84049a;
                }
                lVarV.l();
                lVarV.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar2 = dVar8;
                j13 = jI;
            } else {
                if (i24 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    jI = k3.p1.INSTANCE.i();
                } else {
                    jI = j12;
                }
                if (i21 != 0) {
                    aVar2 = null;
                } else {
                    aVar2 = aVar;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1328177147, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.DocumentScannerOverlayScaffold (DocumentScannerOverlayScaffold.kt:59)");
                }
                lVarV.o(-157668539);
                objI = lVarV.I();
                if (objI == p020r2.l.INSTANCE.a()) {
                    objI = new wn0.l() { // from class: com.fourthline.orca.internal.wy0
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return AbstractC3127cb.a((g4.y) obj);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                androidx.compose.ui.d dVarD5 = androidx.compose.foundation.b.d(androidx.compose.foundation.layout.x.f(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), BitmapDescriptorFactory.HUE_RED, 1, null), jI, null, 2, null);
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
                p020r2.d4.b(lVarA, i0VarH17, companion2.c());
                p020r2.d4.b(lVarA, xVarC111, companion2.e());
                pVarB = companion2.b();
                if (!lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                p020r2.d4.b(lVarA, dVarE111, companion2.d());
                androidx.compose.foundation.layout.i iVar5 = androidx.compose.foundation.layout.i.f4585a;
                companion3 = androidx.compose.ui.d.INSTANCE;
                z3.i0 i0VarA5 = v1.g.a(v1.b.f117444a.g(), companion.k(), lVarV, 0);
                iA2 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC112 = lVarV.c();
                androidx.compose.ui.d dVarE112 = androidx.compose.ui.c.e(lVarV, companion3);
                i23 = i13;
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
                androidx.compose.ui.d dVar9 = dVar2;
                p020r2.d4.b(lVarA2, i0VarA5, companion2.c());
                p020r2.d4.b(lVarA2, xVarC112, companion2.e());
                pVarB2 = companion2.b();
                if (!lVarA2.getInserting()) {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                } else {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                }
                p020r2.d4.b(lVarA2, dVarE112, companion2.d());
                jVar = v1.j.f117505a;
                lVarV.o(-1277778849);
                if (d(state)) {
                    if (d(state)) {
                        f13 = 1.0f;
                    } else {
                        f13 = BitmapDescriptorFactory.HUE_RED;
                    }
                    androidx.compose.ui.d dVarB9 = v1.i.b(jVar, androidx.compose.foundation.layout.x.h(h3.a.a(companion3, f13), BitmapDescriptorFactory.HUE_RED, 1, null), 1.0f, false, 2, null);
                    z3.i0 i0VarH18 = androidx.compose.foundation.layout.g.h(companion.m(), false);
                    iA5 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC113 = lVarV.c();
                    androidx.compose.ui.d dVarE113 = androidx.compose.ui.c.e(lVarV, dVarB9);
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
                    p020r2.d4.b(lVarA5, i0VarH18, companion2.c());
                    p020r2.d4.b(lVarA5, xVarC113, companion2.e());
                    pVarB5 = companion2.b();
                    if (!lVarA5.getInserting()) {
                        lVarA5.B(Integer.valueOf(iA5));
                        lVarA5.f(Integer.valueOf(iA5), pVarB5);
                    } else {
                        lVarA5.B(Integer.valueOf(iA5));
                        lVarA5.f(Integer.valueOf(iA5), pVarB5);
                    }
                    p020r2.d4.b(lVarA5, dVarE113, companion2.d());
                    header.invoke(lVarV, Integer.valueOf((i23 >> 12) & 14));
                    lVarV.g();
                }
                lVarV.l();
                if (a(state)) {
                    f11 = 1.0f;
                } else {
                    f11 = BitmapDescriptorFactory.HUE_RED;
                }
                androidx.compose.ui.d dVarH5 = androidx.compose.foundation.layout.x.h(h3.a.a(companion3, f11), BitmapDescriptorFactory.HUE_RED, 1, null);
                z3.i0 i0VarH19 = androidx.compose.foundation.layout.g.h(companion.e(), false);
                iA3 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC114 = lVarV.c();
                androidx.compose.ui.d dVarE114 = androidx.compose.ui.c.e(lVarV, dVarH5);
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
                p020r2.d4.b(lVarA3, i0VarH19, companion2.c());
                p020r2.d4.b(lVarA3, xVarC114, companion2.e());
                pVarB3 = companion2.b();
                if (!lVarA3.getInserting()) {
                    lVarA3.B(Integer.valueOf(iA3));
                    lVarA3.f(Integer.valueOf(iA3), pVarB3);
                } else {
                    lVarA3.B(Integer.valueOf(iA3));
                    lVarA3.f(Integer.valueOf(iA3), pVarB3);
                }
                p020r2.d4.b(lVarA3, dVarE114, companion2.d());
                body.invoke(lVarV, Integer.valueOf((i23 >> 15) & 14));
                lVarV.g();
                lVarV.o(-1277755198);
                if (c(state)) {
                    if (c(state)) {
                        f12 = 1.0f;
                    } else {
                        f12 = BitmapDescriptorFactory.HUE_RED;
                    }
                    androidx.compose.ui.d dVarB10 = v1.i.b(jVar, androidx.compose.foundation.layout.x.h(h3.a.a(companion3, f12), BitmapDescriptorFactory.HUE_RED, 1, null), 1.0f, false, 2, null);
                    z3.i0 i0VarH110 = androidx.compose.foundation.layout.g.h(companion.b(), false);
                    iA4 = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC115 = lVarV.c();
                    androidx.compose.ui.d dVarE115 = androidx.compose.ui.c.e(lVarV, dVarB10);
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
                    p020r2.d4.b(lVarA4, i0VarH110, companion2.c());
                    p020r2.d4.b(lVarA4, xVarC115, companion2.e());
                    pVarB4 = companion2.b();
                    if (!lVarA4.getInserting()) {
                        lVarA4.B(Integer.valueOf(iA4));
                        lVarA4.f(Integer.valueOf(iA4), pVarB4);
                    } else {
                        lVarA4.B(Integer.valueOf(iA4));
                        lVarA4.f(Integer.valueOf(iA4), pVarB4);
                    }
                    p020r2.d4.b(lVarA4, dVarE115, companion2.d());
                    footer.invoke(lVarV, Integer.valueOf((i23 >> 18) & 14));
                    lVarV.g();
                }
                lVarV.l();
                lVarV.g();
                lVarV.o(1067765047);
                if (b(state)) {
                    a(closeImageSource, aVar2, lVarV, (i23 >> 9) & 14);
                    jn0.h0 h0Var5 = jn0.h0.f84049a;
                }
                lVarV.l();
                lVarV.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar2 = dVar9;
                j13 = jI;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                final androidx.compose.ui.d dVar10 = dVar2;
                final wn0.a aVar5 = aVar2;
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.xy0
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC3127cb.a(state, dVar10, j13, closeImageSource, header, body, footer, aVar5, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        j12 = j11;
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
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            if (lVarV.K(header)) {
                i17 = 16384;
            } else {
                i17 = PKIFailureInfo.certRevoked;
            }
            i13 |= i17;
        }
        if ((i12 & 32) != 0) {
            i13 |= 196608;
        } else if ((i11 & 196608) == 0) {
            if (lVarV.K(body)) {
                i18 = 131072;
            } else {
                i18 = 65536;
            }
            i13 |= i18;
        }
        if ((i12 & 64) != 0) {
            i13 |= 1572864;
        } else if ((i11 & 1572864) == 0) {
            if (lVarV.K(footer)) {
                i19 = PKIFailureInfo.badCertTemplate;
            } else {
                i19 = PKIFailureInfo.signerNotTrusted;
            }
            i13 |= i19;
        }
        i21 = i12 & 128;
        if (i21 != 0) {
            i13 |= 12582912;
        } else if ((i11 & 12582912) == 0) {
            if (lVarV.K(aVar)) {
                i22 = 8388608;
            } else {
                i22 = 4194304;
            }
            i13 |= i22;
        }
        if ((i13 & 4793491) != 4793490) {
            if (i24 != 0) {
                dVar2 = androidx.compose.ui.d.INSTANCE;
            }
            if (i14 != 0) {
                jI = k3.p1.INSTANCE.i();
            } else {
                jI = j12;
            }
            if (i21 != 0) {
                aVar2 = null;
            } else {
                aVar2 = aVar;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1328177147, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.DocumentScannerOverlayScaffold (DocumentScannerOverlayScaffold.kt:59)");
            }
            lVarV.o(-157668539);
            objI = lVarV.I();
            if (objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.l() { // from class: com.fourthline.orca.internal.wy0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3127cb.a((g4.y) obj);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            androidx.compose.ui.d dVarD6 = androidx.compose.foundation.b.d(androidx.compose.foundation.layout.x.f(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), BitmapDescriptorFactory.HUE_RED, 1, null), jI, null, 2, null);
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
            p020r2.d4.b(lVarA, i0VarH111, companion2.c());
            p020r2.d4.b(lVarA, xVarC116, companion2.e());
            pVarB = companion2.b();
            if (!lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE116, companion2.d());
            androidx.compose.foundation.layout.i iVar6 = androidx.compose.foundation.layout.i.f4585a;
            companion3 = androidx.compose.ui.d.INSTANCE;
            z3.i0 i0VarA6 = v1.g.a(v1.b.f117444a.g(), companion.k(), lVarV, 0);
            iA2 = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC117 = lVarV.c();
            androidx.compose.ui.d dVarE117 = androidx.compose.ui.c.e(lVarV, companion3);
            i23 = i13;
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
            androidx.compose.ui.d dVar11 = dVar2;
            p020r2.d4.b(lVarA2, i0VarA6, companion2.c());
            p020r2.d4.b(lVarA2, xVarC117, companion2.e());
            pVarB2 = companion2.b();
            if (!lVarA2.getInserting()) {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            } else {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            }
            p020r2.d4.b(lVarA2, dVarE117, companion2.d());
            jVar = v1.j.f117505a;
            lVarV.o(-1277778849);
            if (d(state)) {
                if (d(state)) {
                    f13 = 1.0f;
                } else {
                    f13 = BitmapDescriptorFactory.HUE_RED;
                }
                androidx.compose.ui.d dVarB11 = v1.i.b(jVar, androidx.compose.foundation.layout.x.h(h3.a.a(companion3, f13), BitmapDescriptorFactory.HUE_RED, 1, null), 1.0f, false, 2, null);
                z3.i0 i0VarH112 = androidx.compose.foundation.layout.g.h(companion.m(), false);
                iA5 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC118 = lVarV.c();
                androidx.compose.ui.d dVarE118 = androidx.compose.ui.c.e(lVarV, dVarB11);
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
                p020r2.d4.b(lVarA5, i0VarH112, companion2.c());
                p020r2.d4.b(lVarA5, xVarC118, companion2.e());
                pVarB5 = companion2.b();
                if (!lVarA5.getInserting()) {
                    lVarA5.B(Integer.valueOf(iA5));
                    lVarA5.f(Integer.valueOf(iA5), pVarB5);
                } else {
                    lVarA5.B(Integer.valueOf(iA5));
                    lVarA5.f(Integer.valueOf(iA5), pVarB5);
                }
                p020r2.d4.b(lVarA5, dVarE118, companion2.d());
                header.invoke(lVarV, Integer.valueOf((i23 >> 12) & 14));
                lVarV.g();
            }
            lVarV.l();
            if (a(state)) {
                f11 = 1.0f;
            } else {
                f11 = BitmapDescriptorFactory.HUE_RED;
            }
            androidx.compose.ui.d dVarH6 = androidx.compose.foundation.layout.x.h(h3.a.a(companion3, f11), BitmapDescriptorFactory.HUE_RED, 1, null);
            z3.i0 i0VarH113 = androidx.compose.foundation.layout.g.h(companion.e(), false);
            iA3 = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC119 = lVarV.c();
            androidx.compose.ui.d dVarE119 = androidx.compose.ui.c.e(lVarV, dVarH6);
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
            p020r2.d4.b(lVarA3, i0VarH113, companion2.c());
            p020r2.d4.b(lVarA3, xVarC119, companion2.e());
            pVarB3 = companion2.b();
            if (!lVarA3.getInserting()) {
                lVarA3.B(Integer.valueOf(iA3));
                lVarA3.f(Integer.valueOf(iA3), pVarB3);
            } else {
                lVarA3.B(Integer.valueOf(iA3));
                lVarA3.f(Integer.valueOf(iA3), pVarB3);
            }
            p020r2.d4.b(lVarA3, dVarE119, companion2.d());
            body.invoke(lVarV, Integer.valueOf((i23 >> 15) & 14));
            lVarV.g();
            lVarV.o(-1277755198);
            if (c(state)) {
                if (c(state)) {
                    f12 = 1.0f;
                } else {
                    f12 = BitmapDescriptorFactory.HUE_RED;
                }
                androidx.compose.ui.d dVarB12 = v1.i.b(jVar, androidx.compose.foundation.layout.x.h(h3.a.a(companion3, f12), BitmapDescriptorFactory.HUE_RED, 1, null), 1.0f, false, 2, null);
                z3.i0 i0VarH114 = androidx.compose.foundation.layout.g.h(companion.b(), false);
                iA4 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC1110 = lVarV.c();
                androidx.compose.ui.d dVarE1110 = androidx.compose.ui.c.e(lVarV, dVarB12);
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
                p020r2.d4.b(lVarA4, i0VarH114, companion2.c());
                p020r2.d4.b(lVarA4, xVarC1110, companion2.e());
                pVarB4 = companion2.b();
                if (!lVarA4.getInserting()) {
                    lVarA4.B(Integer.valueOf(iA4));
                    lVarA4.f(Integer.valueOf(iA4), pVarB4);
                } else {
                    lVarA4.B(Integer.valueOf(iA4));
                    lVarA4.f(Integer.valueOf(iA4), pVarB4);
                }
                p020r2.d4.b(lVarA4, dVarE1110, companion2.d());
                footer.invoke(lVarV, Integer.valueOf((i23 >> 18) & 14));
                lVarV.g();
            }
            lVarV.l();
            lVarV.g();
            lVarV.o(1067765047);
            if (b(state)) {
                a(closeImageSource, aVar2, lVarV, (i23 >> 9) & 14);
                jn0.h0 h0Var6 = jn0.h0.f84049a;
            }
            lVarV.l();
            lVarV.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar2 = dVar11;
            j13 = jI;
        } else {
            if (i24 != 0) {
                dVar2 = androidx.compose.ui.d.INSTANCE;
            }
            if (i14 != 0) {
                jI = k3.p1.INSTANCE.i();
            } else {
                jI = j12;
            }
            if (i21 != 0) {
                aVar2 = null;
            } else {
                aVar2 = aVar;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1328177147, i13, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.DocumentScannerOverlayScaffold (DocumentScannerOverlayScaffold.kt:59)");
            }
            lVarV.o(-157668539);
            objI = lVarV.I();
            if (objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.l() { // from class: com.fourthline.orca.internal.wy0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3127cb.a((g4.y) obj);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            androidx.compose.ui.d dVarD7 = androidx.compose.foundation.b.d(androidx.compose.foundation.layout.x.f(g4.o.d(dVar2, false, (wn0.l) objI, 1, null), BitmapDescriptorFactory.HUE_RED, 1, null), jI, null, 2, null);
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
            p020r2.d4.b(lVarA, i0VarH115, companion2.c());
            p020r2.d4.b(lVarA, xVarC1111, companion2.e());
            pVarB = companion2.b();
            if (!lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE1111, companion2.d());
            androidx.compose.foundation.layout.i iVar7 = androidx.compose.foundation.layout.i.f4585a;
            companion3 = androidx.compose.ui.d.INSTANCE;
            z3.i0 i0VarA7 = v1.g.a(v1.b.f117444a.g(), companion.k(), lVarV, 0);
            iA2 = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC1112 = lVarV.c();
            androidx.compose.ui.d dVarE1112 = androidx.compose.ui.c.e(lVarV, companion3);
            i23 = i13;
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
            androidx.compose.ui.d dVar12 = dVar2;
            p020r2.d4.b(lVarA2, i0VarA7, companion2.c());
            p020r2.d4.b(lVarA2, xVarC1112, companion2.e());
            pVarB2 = companion2.b();
            if (!lVarA2.getInserting()) {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            } else {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            }
            p020r2.d4.b(lVarA2, dVarE1112, companion2.d());
            jVar = v1.j.f117505a;
            lVarV.o(-1277778849);
            if (d(state)) {
                if (d(state)) {
                    f13 = 1.0f;
                } else {
                    f13 = BitmapDescriptorFactory.HUE_RED;
                }
                androidx.compose.ui.d dVarB13 = v1.i.b(jVar, androidx.compose.foundation.layout.x.h(h3.a.a(companion3, f13), BitmapDescriptorFactory.HUE_RED, 1, null), 1.0f, false, 2, null);
                z3.i0 i0VarH116 = androidx.compose.foundation.layout.g.h(companion.m(), false);
                iA5 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC1113 = lVarV.c();
                androidx.compose.ui.d dVarE1113 = androidx.compose.ui.c.e(lVarV, dVarB13);
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
                p020r2.d4.b(lVarA5, i0VarH116, companion2.c());
                p020r2.d4.b(lVarA5, xVarC1113, companion2.e());
                pVarB5 = companion2.b();
                if (!lVarA5.getInserting()) {
                    lVarA5.B(Integer.valueOf(iA5));
                    lVarA5.f(Integer.valueOf(iA5), pVarB5);
                } else {
                    lVarA5.B(Integer.valueOf(iA5));
                    lVarA5.f(Integer.valueOf(iA5), pVarB5);
                }
                p020r2.d4.b(lVarA5, dVarE1113, companion2.d());
                header.invoke(lVarV, Integer.valueOf((i23 >> 12) & 14));
                lVarV.g();
            }
            lVarV.l();
            if (a(state)) {
                f11 = 1.0f;
            } else {
                f11 = BitmapDescriptorFactory.HUE_RED;
            }
            androidx.compose.ui.d dVarH7 = androidx.compose.foundation.layout.x.h(h3.a.a(companion3, f11), BitmapDescriptorFactory.HUE_RED, 1, null);
            z3.i0 i0VarH117 = androidx.compose.foundation.layout.g.h(companion.e(), false);
            iA3 = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC1114 = lVarV.c();
            androidx.compose.ui.d dVarE1114 = androidx.compose.ui.c.e(lVarV, dVarH7);
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
            p020r2.d4.b(lVarA3, i0VarH117, companion2.c());
            p020r2.d4.b(lVarA3, xVarC1114, companion2.e());
            pVarB3 = companion2.b();
            if (!lVarA3.getInserting()) {
                lVarA3.B(Integer.valueOf(iA3));
                lVarA3.f(Integer.valueOf(iA3), pVarB3);
            } else {
                lVarA3.B(Integer.valueOf(iA3));
                lVarA3.f(Integer.valueOf(iA3), pVarB3);
            }
            p020r2.d4.b(lVarA3, dVarE1114, companion2.d());
            body.invoke(lVarV, Integer.valueOf((i23 >> 15) & 14));
            lVarV.g();
            lVarV.o(-1277755198);
            if (c(state)) {
                if (c(state)) {
                    f12 = 1.0f;
                } else {
                    f12 = BitmapDescriptorFactory.HUE_RED;
                }
                androidx.compose.ui.d dVarB14 = v1.i.b(jVar, androidx.compose.foundation.layout.x.h(h3.a.a(companion3, f12), BitmapDescriptorFactory.HUE_RED, 1, null), 1.0f, false, 2, null);
                z3.i0 i0VarH118 = androidx.compose.foundation.layout.g.h(companion.b(), false);
                iA4 = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC1115 = lVarV.c();
                androidx.compose.ui.d dVarE1115 = androidx.compose.ui.c.e(lVarV, dVarB14);
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
                p020r2.d4.b(lVarA4, i0VarH118, companion2.c());
                p020r2.d4.b(lVarA4, xVarC1115, companion2.e());
                pVarB4 = companion2.b();
                if (!lVarA4.getInserting()) {
                    lVarA4.B(Integer.valueOf(iA4));
                    lVarA4.f(Integer.valueOf(iA4), pVarB4);
                } else {
                    lVarA4.B(Integer.valueOf(iA4));
                    lVarA4.f(Integer.valueOf(iA4), pVarB4);
                }
                p020r2.d4.b(lVarA4, dVarE1115, companion2.d());
                footer.invoke(lVarV, Integer.valueOf((i23 >> 18) & 14));
                lVarV.g();
            }
            lVarV.l();
            lVarV.g();
            lVarV.o(1067765047);
            if (b(state)) {
                a(closeImageSource, aVar2, lVarV, (i23 >> 9) & 14);
                jn0.h0 h0Var7 = jn0.h0.f84049a;
            }
            lVarV.l();
            lVarV.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar2 = dVar12;
            j13 = jI;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            final androidx.compose.ui.d dVar13 = dVar2;
            final wn0.a aVar6 = aVar2;
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.xy0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3127cb.a(state, dVar13, j13, closeImageSource, header, body, footer, aVar6, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
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

    private static final boolean a(InterfaceC3004Wa interfaceC3004Wa) {
        if (interfaceC3004Wa instanceof InterfaceC3004Wa.c.b) {
            return ((InterfaceC3004Wa.c.b) interfaceC3004Wa).p();
        }
        if (!(interfaceC3004Wa instanceof InterfaceC3004Wa.c.a)) {
            return !interfaceC3004Wa.h();
        }
        InterfaceC3004Wa.c.a aVar = (InterfaceC3004Wa.c.a) interfaceC3004Wa;
        return aVar.p() == null && !aVar.h();
    }

    private static final void a(final InterfaceC3903uh interfaceC3903uh, final wn0.a aVar, p020r2.l lVar, final int i11) {
        int i12;
        p020r2.l lVarV = lVar.v(-1219257324);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? lVarV.n(interfaceC3903uh) : lVarV.K(interfaceC3903uh) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(aVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-1219257324, i12, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.ScannerCloseButton (DocumentScannerOverlayScaffold.kt:150)");
            }
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            androidx.compose.ui.d dVarM = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.h(companion, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, w4.h.g(16), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
            z3.i0 i0VarH = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.n(), false);
            int iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, dVarM);
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
            androidx.compose.ui.d dVarA = AbstractC3307gk.a(AbstractC3307gk.a(AbstractC3307gk.a(companion, "closeButton", (String) null, 2, (Object) null), 199.0f), RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close_acessibility, 0, 2, null), lVarV, 0), false, 2, (Object) null);
            lVarV.o(209384840);
            boolean z11 = (i12 & 112) == 32;
            Object objI = lVarV.I();
            if (z11 || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.yy0
                    @Override // wn0.a
                    public final Object invoke() {
                        return AbstractC3127cb.a(aVar);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            C4670d1.a(VA.a(0L, (wn0.a) objI, lVarV, 0, 1), dVarA, false, null, z2.c.e(-485836106, true, new a(interfaceC3903uh), lVarV, 54), lVarV, 24576, 12);
            lVarV = lVarV;
            lVarV.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.zy0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3127cb.a(interfaceC3903uh, aVar, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.a aVar) {
        aVar.invoke();
        return jn0.h0.f84049a;
    }
}
