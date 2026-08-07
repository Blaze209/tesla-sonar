package com.fourthline.orca.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Sj {

    static final class a implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f27785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f27786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Yj f27787c;

        a(boolean z11, int i11, Yj yj2) {
            this.f27785a = z11;
            this.f27786b = i11;
            this.f27787c = yj2;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(595359593, i11, -1, "com.fourthline.orca.core.internal.composable.LottieBox.<anonymous> (LottieBox.kt:32)");
            }
            TA.a(androidx.compose.foundation.layout.d.a(androidx.compose.ui.d.INSTANCE, 1.0f, true), this.f27785a, false, 0L, 0L, 0L, 0L, this.f27786b, BitmapDescriptorFactory.HUE_RED, null, this.f27787c, null, null, null, lVar, 6, 0, 15228);
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
    public static final jn0.h0 a(androidx.compose.ui.d dVar, long j11, Yj yj2, int i11, boolean z11, int i12, int i13, p020r2.l lVar, int i14) {
        a(dVar, j11, yj2, i11, z11, lVar, p020r2.k2.a(i12 | 1), i13);
        return jn0.h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4 A[PHI: r2 r3 r6 r8
      0x00d4: PHI (r2v6 androidx.compose.ui.d) = (r2v2 androidx.compose.ui.d), (r2v8 androidx.compose.ui.d) binds: [B:84:0x00fe, B:72:0x00d1] A[DONT_GENERATE, DONT_INLINE]
      0x00d4: PHI (r3v12 int) = (r3v5 int), (r3v13 int) binds: [B:84:0x00fe, B:72:0x00d1] A[DONT_GENERATE, DONT_INLINE]
      0x00d4: PHI (r6v15 int) = (r6v11 int), (r6v16 int) binds: [B:84:0x00fe, B:72:0x00d1] A[DONT_GENERATE, DONT_INLINE]
      0x00d4: PHI (r8v9 long) = (r8v2 long), (r8v1 long) binds: [B:84:0x00fe, B:72:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:85:0x0100  */
    /* JADX WARN: Code duplicated, block: B:88:0x010b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0160  */
    /* JADX WARN: Code duplicated, block: B:95:0x016d  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    public static final void a(androidx.compose.ui.d dVar, long j11, final Yj lottieSource, int i11, boolean z11, p020r2.l lVar, final int i12, final int i13) {
        androidx.compose.ui.d dVar2;
        int i14;
        long jA;
        int i15;
        int i16;
        boolean z12;
        int i17;
        androidx.compose.ui.d dVar3;
        int i18;
        int i19;
        boolean z13;
        p020r2.l lVar2;
        final androidx.compose.ui.d dVar4;
        final boolean z14;
        final int i21;
        final long j12;
        p020r2.w2 w2VarX;
        p013kotlin.jvm.internal.s.k(lottieSource, "lottieSource");
        p020r2.l lVarV = lVar.v(640738694);
        int i22 = i13 & 1;
        if (i22 != 0) {
            i14 = i12 | 6;
            dVar2 = dVar;
        } else if ((i12 & 6) == 0) {
            dVar2 = dVar;
            i14 = (lVarV.n(dVar2) ? 4 : 2) | i12;
        } else {
            dVar2 = dVar;
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            jA = j11;
            i14 |= ((i13 & 2) == 0 && lVarV.s(jA)) ? 32 : 16;
        } else {
            jA = j11;
        }
        if ((i13 & 4) != 0) {
            i14 |= KyberEngine.KyberPolyBytes;
        } else if ((i12 & KyberEngine.KyberPolyBytes) == 0) {
            i14 |= (i12 & 512) == 0 ? lVarV.n(lottieSource) : lVarV.K(lottieSource) ? 256 : 128;
        }
        int i23 = i13 & 8;
        if (i23 == 0) {
            if ((i12 & 3072) == 0) {
                i15 = i11;
                i14 |= lVarV.r(i15) ? 2048 : 1024;
            }
            i16 = i13 & 16;
            if (i16 != 0) {
                if ((i12 & 24576) == 0) {
                    z12 = z11;
                    if (lVarV.p(z12)) {
                        i17 = 16384;
                    } else {
                        i17 = PKIFailureInfo.certRevoked;
                    }
                    i14 |= i17;
                }
                if ((i14 & 9363) == 9362 || !lVarV.b()) {
                    lVarV.L();
                    if ((i12 & 1) != 0 || lVarV.k()) {
                        if (i22 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if ((i13 & 2) != 0) {
                            jA = C3825sp.f35377a.b(lVarV, 6).getScreen().getGraphicContainer().getBackground().a(lVarV, 0);
                            i14 &= -113;
                        }
                        if (i23 != 0) {
                            i15 = 1;
                        }
                        i18 = i14;
                        i19 = i15;
                        if (i16 != 0) {
                            z13 = false;
                        }
                        long j13 = jA;
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(640738694, i18, -1, "com.fourthline.orca.core.internal.composable.LottieBox (LottieBox.kt:25)");
                        }
                        lVar2 = lVarV;
                        p009i2.m.a(androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null), a2.g.c(w4.h.g(C3825sp.f35377a.b(lVarV, 6).getScreen().getGraphicContainer().getRadius())), j13, 0L, null, w4.h.g(0), z2.c.e(595359593, true, new a(z13, i19, lottieSource), lVarV, 54), lVar2, ((i18 << 3) & 896) | 1769472, 24);
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        dVar4 = dVar3;
                        z14 = z13;
                        i21 = i19;
                        j12 = j13;
                    } else {
                        lVarV.j();
                        if ((i13 & 2) != 0) {
                            i14 &= -113;
                        }
                        dVar3 = dVar2;
                        i18 = i14;
                        i19 = i15;
                    }
                    z13 = z12;
                    long j14 = jA;
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(640738694, i18, -1, "com.fourthline.orca.core.internal.composable.LottieBox (LottieBox.kt:25)");
                    }
                    lVar2 = lVarV;
                    p009i2.m.a(androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null), a2.g.c(w4.h.g(C3825sp.f35377a.b(lVarV, 6).getScreen().getGraphicContainer().getRadius())), j14, 0L, null, w4.h.g(0), z2.c.e(595359593, true, new a(z13, i19, lottieSource), lVarV, 54), lVar2, ((i18 << 3) & 896) | 1769472, 24);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    dVar4 = dVar3;
                    z14 = z13;
                    i21 = i19;
                    j12 = j14;
                } else {
                    lVarV.j();
                    lVar2 = lVarV;
                    dVar4 = dVar2;
                    j12 = jA;
                    i21 = i15;
                    z14 = z12;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.fp0
                        @Override // wn0.p
                        public final Object invoke(Object obj, Object obj2) {
                            return Sj.a(dVar4, j12, lottieSource, i21, z14, i12, i13, (p020r2.l) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= 24576;
            z12 = z11;
            if ((i14 & 9363) == 9362) {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i13 & 2) != 0) {
                        jA = C3825sp.f35377a.b(lVarV, 6).getScreen().getGraphicContainer().getBackground().a(lVarV, 0);
                        i14 &= -113;
                    }
                    if (i23 != 0) {
                        i15 = 1;
                    }
                    i18 = i14;
                    i19 = i15;
                    if (i16 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i13 & 2) != 0) {
                        jA = C3825sp.f35377a.b(lVarV, 6).getScreen().getGraphicContainer().getBackground().a(lVarV, 0);
                        i14 &= -113;
                    }
                    if (i23 != 0) {
                        i15 = 1;
                    }
                    i18 = i14;
                    i19 = i15;
                    if (i16 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                }
                long j15 = jA;
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(640738694, i18, -1, "com.fourthline.orca.core.internal.composable.LottieBox (LottieBox.kt:25)");
                }
                lVar2 = lVarV;
                p009i2.m.a(androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null), a2.g.c(w4.h.g(C3825sp.f35377a.b(lVarV, 6).getScreen().getGraphicContainer().getRadius())), j15, 0L, null, w4.h.g(0), z2.c.e(595359593, true, new a(z13, i19, lottieSource), lVarV, 54), lVar2, ((i18 << 3) & 896) | 1769472, 24);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar3;
                z14 = z13;
                i21 = i19;
                j12 = j15;
            } else {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i13 & 2) != 0) {
                        jA = C3825sp.f35377a.b(lVarV, 6).getScreen().getGraphicContainer().getBackground().a(lVarV, 0);
                        i14 &= -113;
                    }
                    if (i23 != 0) {
                        i15 = 1;
                    }
                    i18 = i14;
                    i19 = i15;
                    if (i16 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i13 & 2) != 0) {
                        jA = C3825sp.f35377a.b(lVarV, 6).getScreen().getGraphicContainer().getBackground().a(lVarV, 0);
                        i14 &= -113;
                    }
                    if (i23 != 0) {
                        i15 = 1;
                    }
                    i18 = i14;
                    i19 = i15;
                    if (i16 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                }
                long j16 = jA;
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(640738694, i18, -1, "com.fourthline.orca.core.internal.composable.LottieBox (LottieBox.kt:25)");
                }
                lVar2 = lVarV;
                p009i2.m.a(androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null), a2.g.c(w4.h.g(C3825sp.f35377a.b(lVarV, 6).getScreen().getGraphicContainer().getRadius())), j16, 0L, null, w4.h.g(0), z2.c.e(595359593, true, new a(z13, i19, lottieSource), lVarV, 54), lVar2, ((i18 << 3) & 896) | 1769472, 24);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar3;
                z14 = z13;
                i21 = i19;
                j12 = j16;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.fp0
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return Sj.a(dVar4, j12, lottieSource, i21, z14, i12, i13, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i14 |= 3072;
        i15 = i11;
        i16 = i13 & 16;
        if (i16 != 0) {
            if ((i12 & 24576) == 0) {
                z12 = z11;
                if (lVarV.p(z12)) {
                    i17 = 16384;
                } else {
                    i17 = PKIFailureInfo.certRevoked;
                }
                i14 |= i17;
            }
            if ((i14 & 9363) == 9362) {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i13 & 2) != 0) {
                        jA = C3825sp.f35377a.b(lVarV, 6).getScreen().getGraphicContainer().getBackground().a(lVarV, 0);
                        i14 &= -113;
                    }
                    if (i23 != 0) {
                        i15 = 1;
                    }
                    i18 = i14;
                    i19 = i15;
                    if (i16 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i13 & 2) != 0) {
                        jA = C3825sp.f35377a.b(lVarV, 6).getScreen().getGraphicContainer().getBackground().a(lVarV, 0);
                        i14 &= -113;
                    }
                    if (i23 != 0) {
                        i15 = 1;
                    }
                    i18 = i14;
                    i19 = i15;
                    if (i16 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                }
                long j17 = jA;
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(640738694, i18, -1, "com.fourthline.orca.core.internal.composable.LottieBox (LottieBox.kt:25)");
                }
                lVar2 = lVarV;
                p009i2.m.a(androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null), a2.g.c(w4.h.g(C3825sp.f35377a.b(lVarV, 6).getScreen().getGraphicContainer().getRadius())), j17, 0L, null, w4.h.g(0), z2.c.e(595359593, true, new a(z13, i19, lottieSource), lVarV, 54), lVar2, ((i18 << 3) & 896) | 1769472, 24);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar3;
                z14 = z13;
                i21 = i19;
                j12 = j17;
            } else {
                lVarV.L();
                if ((i12 & 1) != 0) {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i13 & 2) != 0) {
                        jA = C3825sp.f35377a.b(lVarV, 6).getScreen().getGraphicContainer().getBackground().a(lVarV, 0);
                        i14 &= -113;
                    }
                    if (i23 != 0) {
                        i15 = 1;
                    }
                    i18 = i14;
                    i19 = i15;
                    if (i16 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                } else {
                    if (i22 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i13 & 2) != 0) {
                        jA = C3825sp.f35377a.b(lVarV, 6).getScreen().getGraphicContainer().getBackground().a(lVarV, 0);
                        i14 &= -113;
                    }
                    if (i23 != 0) {
                        i15 = 1;
                    }
                    i18 = i14;
                    i19 = i15;
                    if (i16 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                }
                long j18 = jA;
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(640738694, i18, -1, "com.fourthline.orca.core.internal.composable.LottieBox (LottieBox.kt:25)");
                }
                lVar2 = lVarV;
                p009i2.m.a(androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null), a2.g.c(w4.h.g(C3825sp.f35377a.b(lVarV, 6).getScreen().getGraphicContainer().getRadius())), j18, 0L, null, w4.h.g(0), z2.c.e(595359593, true, new a(z13, i19, lottieSource), lVarV, 54), lVar2, ((i18 << 3) & 896) | 1769472, 24);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar3;
                z14 = z13;
                i21 = i19;
                j12 = j18;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.fp0
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return Sj.a(dVar4, j12, lottieSource, i21, z14, i12, i13, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i14 |= 24576;
        z12 = z11;
        if ((i14 & 9363) == 9362) {
            lVarV.L();
            if ((i12 & 1) != 0) {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if ((i13 & 2) != 0) {
                    jA = C3825sp.f35377a.b(lVarV, 6).getScreen().getGraphicContainer().getBackground().a(lVarV, 0);
                    i14 &= -113;
                }
                if (i23 != 0) {
                    i15 = 1;
                }
                i18 = i14;
                i19 = i15;
                if (i16 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
            } else {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if ((i13 & 2) != 0) {
                    jA = C3825sp.f35377a.b(lVarV, 6).getScreen().getGraphicContainer().getBackground().a(lVarV, 0);
                    i14 &= -113;
                }
                if (i23 != 0) {
                    i15 = 1;
                }
                i18 = i14;
                i19 = i15;
                if (i16 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
            }
            long j19 = jA;
            lVarV.C();
            if (p020r2.o.J()) {
                p020r2.o.S(640738694, i18, -1, "com.fourthline.orca.core.internal.composable.LottieBox (LottieBox.kt:25)");
            }
            lVar2 = lVarV;
            p009i2.m.a(androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null), a2.g.c(w4.h.g(C3825sp.f35377a.b(lVarV, 6).getScreen().getGraphicContainer().getRadius())), j19, 0L, null, w4.h.g(0), z2.c.e(595359593, true, new a(z13, i19, lottieSource), lVarV, 54), lVar2, ((i18 << 3) & 896) | 1769472, 24);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar4 = dVar3;
            z14 = z13;
            i21 = i19;
            j12 = j19;
        } else {
            lVarV.L();
            if ((i12 & 1) != 0) {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if ((i13 & 2) != 0) {
                    jA = C3825sp.f35377a.b(lVarV, 6).getScreen().getGraphicContainer().getBackground().a(lVarV, 0);
                    i14 &= -113;
                }
                if (i23 != 0) {
                    i15 = 1;
                }
                i18 = i14;
                i19 = i15;
                if (i16 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
            } else {
                if (i22 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if ((i13 & 2) != 0) {
                    jA = C3825sp.f35377a.b(lVarV, 6).getScreen().getGraphicContainer().getBackground().a(lVarV, 0);
                    i14 &= -113;
                }
                if (i23 != 0) {
                    i15 = 1;
                }
                i18 = i14;
                i19 = i15;
                if (i16 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
            }
            long j110 = jA;
            lVarV.C();
            if (p020r2.o.J()) {
                p020r2.o.S(640738694, i18, -1, "com.fourthline.orca.core.internal.composable.LottieBox (LottieBox.kt:25)");
            }
            lVar2 = lVarV;
            p009i2.m.a(androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null), a2.g.c(w4.h.g(C3825sp.f35377a.b(lVarV, 6).getScreen().getGraphicContainer().getRadius())), j110, 0L, null, w4.h.g(0), z2.c.e(595359593, true, new a(z13, i19, lottieSource), lVarV, 54), lVar2, ((i18 << 3) & 896) | 1769472, 24);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar4 = dVar3;
            z14 = z13;
            i21 = i19;
            j12 = j110;
        }
        w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.fp0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Sj.a(dVar4, j12, lottieSource, i21, z14, i12, i13, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
