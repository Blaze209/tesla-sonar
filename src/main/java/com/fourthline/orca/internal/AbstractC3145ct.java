package com.fourthline.orca.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import k3.SolidColor;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ct, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3145ct {
    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(long j11, j3.i iVar, boolean z11, wn0.p pVar, int i11, int i12, p020r2.l lVar, int i13) {
        a(j11, iVar, z11, pVar, lVar, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:65:0x010b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0145  */
    /* JADX WARN: Code duplicated, block: B:72:0x0150  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    public static final void a(long j11, final j3.i whereToPunch, boolean z11, final wn0.p content, p020r2.l lVar, final int i11, final int i12) {
        long j12;
        int i13;
        boolean z12;
        int i14;
        long j13;
        boolean z13;
        SolidColor solidColor;
        k3.p1.Companion companion;
        long j14;
        final boolean z14;
        final long j15;
        Object objI;
        p020r2.w2 w2VarX;
        p013kotlin.jvm.internal.s.k(whereToPunch, "whereToPunch");
        p013kotlin.jvm.internal.s.k(content, "content");
        p020r2.l lVarV = lVar.v(113333863);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
            j12 = j11;
        } else if ((i11 & 6) == 0) {
            j12 = j11;
            i13 = (lVarV.s(j12) ? 4 : 2) | i11;
        } else {
            j12 = j11;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= lVarV.n(whereToPunch) ? 32 : 16;
        }
        int i16 = i12 & 4;
        if (i16 == 0) {
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                z12 = z11;
                i13 |= lVarV.p(z12) ? 256 : 128;
            }
            if ((i12 & 8) != 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                if (lVarV.K(content)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i13 |= i14;
            }
            if ((i13 & 1171) == 1170 || !lVarV.b()) {
                if (i15 != 0) {
                    j12 = k3.p1.INSTANCE.j();
                }
                j13 = j12;
                if (i16 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(113333863, i13, -1, "com.fourthline.orca.core.internal.composable.Punchhole (Punchhole.kt:30)");
                }
                companion = k3.p1.INSTANCE;
                solidColor = new SolidColor(companion.i(), null);
                if (z13) {
                    lVarV.o(1678473497);
                    long jI = companion.i();
                    androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.x.f(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
                    lVarV.o(-1331324444);
                    objI = lVarV.I();
                    if (objI == p020r2.l.INSTANCE.a()) {
                        objI = new wn0.l() { // from class: com.fourthline.orca.internal.rz0
                            @Override // wn0.l
                            public final Object invoke(Object obj) {
                                return AbstractC3145ct.a((m3.f) obj);
                            }
                        };
                        lVarV.B(objI);
                    }
                    lVarV.l();
                    p009i2.m2.a(androidx.compose.ui.draw.b.b(dVarF, (wn0.l) objI), null, jI, 0L, null, BitmapDescriptorFactory.HUE_RED, content, lVarV, ((i13 << 9) & 3670016) | KyberEngine.KyberPolyBytes, 58);
                    lVarV.l();
                    j14 = j13;
                } else {
                    lVarV.o(1679693037);
                    int i17 = ((i13 << 6) & 896) | 1572870;
                    j14 = j13;
                    p009i2.m2.a(androidx.compose.foundation.layout.x.f(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), null, j14, 0L, null, BitmapDescriptorFactory.HUE_RED, z2.c.e(1286734727, true, new a(whereToPunch, content, solidColor), lVarV, 54), lVarV, i17, 58);
                    lVarV.l();
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                z14 = z13;
                j15 = j14;
            } else {
                lVarV.j();
                j15 = j12;
                z14 = z12;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.sz0
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC3145ct.a(j15, whereToPunch, z14, content, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        z12 = z11;
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            if (lVarV.K(content)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i13 |= i14;
        }
        if ((i13 & 1171) == 1170) {
            if (i15 != 0) {
                j12 = k3.p1.INSTANCE.j();
            }
            j13 = j12;
            if (i16 != 0) {
                z13 = false;
            } else {
                z13 = z12;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(113333863, i13, -1, "com.fourthline.orca.core.internal.composable.Punchhole (Punchhole.kt:30)");
            }
            companion = k3.p1.INSTANCE;
            solidColor = new SolidColor(companion.i(), null);
            if (z13) {
                lVarV.o(1678473497);
                long jI2 = companion.i();
                androidx.compose.ui.d dVarF2 = androidx.compose.foundation.layout.x.f(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
                lVarV.o(-1331324444);
                objI = lVarV.I();
                if (objI == p020r2.l.INSTANCE.a()) {
                    objI = new wn0.l() { // from class: com.fourthline.orca.internal.rz0
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return AbstractC3145ct.a((m3.f) obj);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                p009i2.m2.a(androidx.compose.ui.draw.b.b(dVarF2, (wn0.l) objI), null, jI2, 0L, null, BitmapDescriptorFactory.HUE_RED, content, lVarV, ((i13 << 9) & 3670016) | KyberEngine.KyberPolyBytes, 58);
                lVarV.l();
                j14 = j13;
            } else {
                lVarV.o(1679693037);
                int i18 = ((i13 << 6) & 896) | 1572870;
                j14 = j13;
                p009i2.m2.a(androidx.compose.foundation.layout.x.f(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), null, j14, 0L, null, BitmapDescriptorFactory.HUE_RED, z2.c.e(1286734727, true, new a(whereToPunch, content, solidColor), lVarV, 54), lVarV, i18, 58);
                lVarV.l();
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            z14 = z13;
            j15 = j14;
        } else {
            if (i15 != 0) {
                j12 = k3.p1.INSTANCE.j();
            }
            j13 = j12;
            if (i16 != 0) {
                z13 = false;
            } else {
                z13 = z12;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(113333863, i13, -1, "com.fourthline.orca.core.internal.composable.Punchhole (Punchhole.kt:30)");
            }
            companion = k3.p1.INSTANCE;
            solidColor = new SolidColor(companion.i(), null);
            if (z13) {
                lVarV.o(1678473497);
                long jI3 = companion.i();
                androidx.compose.ui.d dVarF3 = androidx.compose.foundation.layout.x.f(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
                lVarV.o(-1331324444);
                objI = lVarV.I();
                if (objI == p020r2.l.INSTANCE.a()) {
                    objI = new wn0.l() { // from class: com.fourthline.orca.internal.rz0
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return AbstractC3145ct.a((m3.f) obj);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                p009i2.m2.a(androidx.compose.ui.draw.b.b(dVarF3, (wn0.l) objI), null, jI3, 0L, null, BitmapDescriptorFactory.HUE_RED, content, lVarV, ((i13 << 9) & 3670016) | KyberEngine.KyberPolyBytes, 58);
                lVarV.l();
                j14 = j13;
            } else {
                lVarV.o(1679693037);
                int i19 = ((i13 << 6) & 896) | 1572870;
                j14 = j13;
                p009i2.m2.a(androidx.compose.foundation.layout.x.f(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), null, j14, 0L, null, BitmapDescriptorFactory.HUE_RED, z2.c.e(1286734727, true, new a(whereToPunch, content, solidColor), lVarV, 54), lVarV, i19, 58);
                lVarV.l();
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            z14 = z13;
            j15 = j14;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.sz0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3145ct.a(j15, whereToPunch, z14, content, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ct$a */
    static final class a implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j3.i f31005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.p f31006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SolidColor f31007c;

        a(j3.i iVar, wn0.p pVar, SolidColor solidColor) {
            this.f31005a = iVar;
            this.f31006b = pVar;
            this.f31007c = solidColor;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1286734727, i11, -1, "com.fourthline.orca.core.internal.composable.Punchhole.<anonymous> (Punchhole.kt:68)");
            }
            androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.x.f(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            lVar.o(34816644);
            boolean zN = lVar.n(this.f31005a);
            final SolidColor solidColor = this.f31007c;
            final j3.i iVar = this.f31005a;
            Object objI = lVar.I();
            if (zN || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.l() { // from class: com.fourthline.orca.internal.tz0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3145ct.a.a(solidColor, iVar, (m3.f) obj);
                    }
                };
                lVar.B(objI);
            }
            lVar.l();
            q1.i.a(dVarF, (wn0.l) objI, lVar, 6);
            this.f31006b.invoke(lVar, 0);
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
        public static final jn0.h0 a(SolidColor solidColor, j3.i iVar, m3.f Canvas) {
            p013kotlin.jvm.internal.s.k(Canvas, "$this$Canvas");
            m3.f.F0(Canvas, solidColor, iVar.m(), iVar.k(), BitmapDescriptorFactory.HUE_RED, null, null, k3.b1.INSTANCE.a(), 56, null);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(m3.f drawBehind) {
        p013kotlin.jvm.internal.s.k(drawBehind, "$this$drawBehind");
        k3.p1.Companion companion = k3.p1.INSTANCE;
        long jP = k3.p1.p(companion.a(), 0.6f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        long jI = companion.i();
        k3.h1.Companion companion2 = k3.h1.INSTANCE;
        m3.f.F0(drawBehind, k3.h1.Companion.h(companion2, p013kotlin.collections.v.p(k3.p1.l(jP), k3.p1.l(jI)), BitmapDescriptorFactory.HUE_RED, j3.m.i(drawBehind.b()) * 0.4f, 0, 10, null), 0L, j3.m.f(drawBehind.b(), BitmapDescriptorFactory.HUE_RED, j3.m.i(drawBehind.b()) * 0.4f, 1, null), BitmapDescriptorFactory.HUE_RED, null, null, 0, 122, null);
        m3.f.F0(drawBehind, k3.h1.Companion.h(companion2, p013kotlin.collections.v.p(k3.p1.l(jI), k3.p1.l(jP)), 0.7f * j3.m.i(drawBehind.b()), j3.m.i(drawBehind.b()), 0, 8, null), j3.h.a(BitmapDescriptorFactory.HUE_RED, j3.m.i(drawBehind.b()) * 0.6f), j3.m.f(drawBehind.b(), BitmapDescriptorFactory.HUE_RED, j3.m.i(drawBehind.b()) * 0.4f, 1, null), BitmapDescriptorFactory.HUE_RED, null, null, 0, 120, null);
        return jn0.h0.f84049a;
    }
}
