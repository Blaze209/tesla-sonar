package p009i2;

import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.t;
import androidx.compose.foundation.layout.x;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.z0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import k3.p1;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import w4.h;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a:\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Lk3/p1;", "color", "Lw4/h;", "thickness", "startIndent", "Ljn0/h0;", "a", "(Landroidx/compose/ui/d;JFFLr2/l;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class i0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f74505c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f74506d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f74507e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f74508f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f74509g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f74510h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d dVar, long j11, float f11, float f12, int i11, int i12) {
            super(2);
            this.f74505c = dVar;
            this.f74506d = j11;
            this.f74507e = f11;
            this.f74508f = f12;
            this.f74509g = i11;
            this.f74510h = i12;
        }

        public final void a(l lVar, int i11) {
            i0.a(this.f74505c, this.f74506d, this.f74507e, this.f74508f, lVar, k2.a(this.f74509g | 1), this.f74510h);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7 A[PHI: r2 r4 r7 r9
      0x00a7: PHI (r2v5 androidx.compose.ui.d) = (r2v2 androidx.compose.ui.d), (r2v7 androidx.compose.ui.d) binds: [B:70:0x00da, B:60:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x00a7: PHI (r4v28 int) = (r4v12 int), (r4v29 int) binds: [B:70:0x00da, B:60:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x00a7: PHI (r7v6 long) = (r7v2 long), (r7v1 long) binds: [B:70:0x00da, B:60:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x00a7: PHI (r9v6 float) = (r9v3 float), (r9v2 float) binds: [B:70:0x00da, B:60:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:81:0x0116  */
    /* JADX WARN: Code duplicated, block: B:82:0x0135  */
    /* JADX WARN: Code duplicated, block: B:85:0x0165  */
    /* JADX WARN: Code duplicated, block: B:89:0x0172  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public static final void a(d dVar, long j11, float f11, float f12, l lVar, int i11, int i12) {
        d dVar2;
        int i13;
        long jP;
        float fG;
        int i14;
        float f13;
        int i15;
        d dVar3;
        float fG2;
        d dVarM;
        float fG3;
        float f14;
        float f15;
        w2 w2VarX;
        l lVarV = lVar.v(-1249392198);
        int i16 = i12 & 1;
        if (i16 != 0) {
            i13 = i11 | 6;
            dVar2 = dVar;
        } else if ((i11 & 6) == 0) {
            dVar2 = dVar;
            i13 = (lVarV.n(dVar2) ? 4 : 2) | i11;
        } else {
            dVar2 = dVar;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            jP = j11;
            i13 |= ((i12 & 2) == 0 && lVarV.s(jP)) ? 32 : 16;
        } else {
            jP = j11;
        }
        int i17 = i12 & 4;
        if (i17 == 0) {
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                fG = f11;
                i13 |= lVarV.q(fG) ? 256 : 128;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & 3072) == 0) {
                    f13 = f12;
                    if (lVarV.q(f13)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                if ((i13 & 1171) == 1170 || !lVarV.b()) {
                    lVarV.L();
                    if ((i11 & 1) != 0 || lVarV.k()) {
                        if (i16 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if ((i12 & 2) != 0) {
                            jP = p1.p(j1.f74525a.a(lVarV, 6).i(), 0.12f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                            i13 &= -113;
                        }
                        if (i17 != 0) {
                            fG = h.g(1);
                        }
                        if (i14 != 0) {
                            fG2 = h.g(0);
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-1249392198, i13, -1, "androidx.compose.material.Divider (Divider.kt:48)");
                        }
                        if (fG2 == BitmapDescriptorFactory.HUE_RED) {
                            dVarM = d.INSTANCE;
                        } else {
                            dVarM = t.m(d.INSTANCE, fG2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        }
                        if (h.i(fG, h.INSTANCE.a())) {
                            lVarV.o(-129374855);
                            fG3 = h.g(1.0f / ((w4.d) lVarV.U(z0.g())).getDensity());
                            lVarV.l();
                        } else {
                            lVarV.o(-129316234);
                            lVarV.l();
                            fG3 = fG;
                        }
                        g.a(b.d(x.i(x.h(dVar3.g(dVarM), BitmapDescriptorFactory.HUE_RED, 1, null), fG3), jP, null, 2, null), lVarV, 0);
                        if (o.J()) {
                            o.R();
                        }
                        f14 = fG2;
                    } else {
                        lVarV.j();
                        if ((i12 & 2) != 0) {
                            i13 &= -113;
                        }
                        dVar3 = dVar2;
                    }
                    fG2 = f13;
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1249392198, i13, -1, "androidx.compose.material.Divider (Divider.kt:48)");
                    }
                    if (fG2 == BitmapDescriptorFactory.HUE_RED) {
                        dVarM = d.INSTANCE;
                    } else {
                        dVarM = t.m(d.INSTANCE, fG2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    }
                    if (h.i(fG, h.INSTANCE.a())) {
                        lVarV.o(-129374855);
                        fG3 = h.g(1.0f / ((w4.d) lVarV.U(z0.g())).getDensity());
                        lVarV.l();
                    } else {
                        lVarV.o(-129316234);
                        lVarV.l();
                        fG3 = fG;
                    }
                    g.a(b.d(x.i(x.h(dVar3.g(dVarM), BitmapDescriptorFactory.HUE_RED, 1, null), fG3), jP, null, 2, null), lVarV, 0);
                    if (o.J()) {
                        o.R();
                    }
                    f14 = fG2;
                } else {
                    lVarV.j();
                    dVar3 = dVar2;
                    f14 = f13;
                }
                f15 = fG;
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new a(dVar3, jP, f15, f14, i11, i12));
                }
            }
            i13 |= 3072;
            f13 = f12;
            if ((i13 & 1171) == 1170) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i16 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i12 & 2) != 0) {
                        jP = p1.p(j1.f74525a.a(lVarV, 6).i(), 0.12f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i13 &= -113;
                    }
                    if (i17 != 0) {
                        fG = h.g(1);
                    }
                    if (i14 != 0) {
                        fG2 = h.g(0);
                    } else {
                        fG2 = f13;
                    }
                } else {
                    if (i16 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i12 & 2) != 0) {
                        jP = p1.p(j1.f74525a.a(lVarV, 6).i(), 0.12f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i13 &= -113;
                    }
                    if (i17 != 0) {
                        fG = h.g(1);
                    }
                    if (i14 != 0) {
                        fG2 = h.g(0);
                    } else {
                        fG2 = f13;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-1249392198, i13, -1, "androidx.compose.material.Divider (Divider.kt:48)");
                }
                if (fG2 == BitmapDescriptorFactory.HUE_RED) {
                    dVarM = d.INSTANCE;
                } else {
                    dVarM = t.m(d.INSTANCE, fG2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                }
                if (h.i(fG, h.INSTANCE.a())) {
                    lVarV.o(-129374855);
                    fG3 = h.g(1.0f / ((w4.d) lVarV.U(z0.g())).getDensity());
                    lVarV.l();
                } else {
                    lVarV.o(-129316234);
                    lVarV.l();
                    fG3 = fG;
                }
                g.a(b.d(x.i(x.h(dVar3.g(dVarM), BitmapDescriptorFactory.HUE_RED, 1, null), fG3), jP, null, 2, null), lVarV, 0);
                if (o.J()) {
                    o.R();
                }
                f14 = fG2;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i16 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i12 & 2) != 0) {
                        jP = p1.p(j1.f74525a.a(lVarV, 6).i(), 0.12f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i13 &= -113;
                    }
                    if (i17 != 0) {
                        fG = h.g(1);
                    }
                    if (i14 != 0) {
                        fG2 = h.g(0);
                    } else {
                        fG2 = f13;
                    }
                } else {
                    if (i16 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i12 & 2) != 0) {
                        jP = p1.p(j1.f74525a.a(lVarV, 6).i(), 0.12f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i13 &= -113;
                    }
                    if (i17 != 0) {
                        fG = h.g(1);
                    }
                    if (i14 != 0) {
                        fG2 = h.g(0);
                    } else {
                        fG2 = f13;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-1249392198, i13, -1, "androidx.compose.material.Divider (Divider.kt:48)");
                }
                if (fG2 == BitmapDescriptorFactory.HUE_RED) {
                    dVarM = d.INSTANCE;
                } else {
                    dVarM = t.m(d.INSTANCE, fG2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                }
                if (h.i(fG, h.INSTANCE.a())) {
                    lVarV.o(-129374855);
                    fG3 = h.g(1.0f / ((w4.d) lVarV.U(z0.g())).getDensity());
                    lVarV.l();
                } else {
                    lVarV.o(-129316234);
                    lVarV.l();
                    fG3 = fG;
                }
                g.a(b.d(x.i(x.h(dVar3.g(dVarM), BitmapDescriptorFactory.HUE_RED, 1, null), fG3), jP, null, 2, null), lVarV, 0);
                if (o.J()) {
                    o.R();
                }
                f14 = fG2;
            }
            f15 = fG;
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new a(dVar3, jP, f15, f14, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        fG = f11;
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & 3072) == 0) {
                f13 = f12;
                if (lVarV.q(f13)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            if ((i13 & 1171) == 1170) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i16 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i12 & 2) != 0) {
                        jP = p1.p(j1.f74525a.a(lVarV, 6).i(), 0.12f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i13 &= -113;
                    }
                    if (i17 != 0) {
                        fG = h.g(1);
                    }
                    if (i14 != 0) {
                        fG2 = h.g(0);
                    } else {
                        fG2 = f13;
                    }
                } else {
                    if (i16 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i12 & 2) != 0) {
                        jP = p1.p(j1.f74525a.a(lVarV, 6).i(), 0.12f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i13 &= -113;
                    }
                    if (i17 != 0) {
                        fG = h.g(1);
                    }
                    if (i14 != 0) {
                        fG2 = h.g(0);
                    } else {
                        fG2 = f13;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-1249392198, i13, -1, "androidx.compose.material.Divider (Divider.kt:48)");
                }
                if (fG2 == BitmapDescriptorFactory.HUE_RED) {
                    dVarM = d.INSTANCE;
                } else {
                    dVarM = t.m(d.INSTANCE, fG2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                }
                if (h.i(fG, h.INSTANCE.a())) {
                    lVarV.o(-129374855);
                    fG3 = h.g(1.0f / ((w4.d) lVarV.U(z0.g())).getDensity());
                    lVarV.l();
                } else {
                    lVarV.o(-129316234);
                    lVarV.l();
                    fG3 = fG;
                }
                g.a(b.d(x.i(x.h(dVar3.g(dVarM), BitmapDescriptorFactory.HUE_RED, 1, null), fG3), jP, null, 2, null), lVarV, 0);
                if (o.J()) {
                    o.R();
                }
                f14 = fG2;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i16 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i12 & 2) != 0) {
                        jP = p1.p(j1.f74525a.a(lVarV, 6).i(), 0.12f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i13 &= -113;
                    }
                    if (i17 != 0) {
                        fG = h.g(1);
                    }
                    if (i14 != 0) {
                        fG2 = h.g(0);
                    } else {
                        fG2 = f13;
                    }
                } else {
                    if (i16 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i12 & 2) != 0) {
                        jP = p1.p(j1.f74525a.a(lVarV, 6).i(), 0.12f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                        i13 &= -113;
                    }
                    if (i17 != 0) {
                        fG = h.g(1);
                    }
                    if (i14 != 0) {
                        fG2 = h.g(0);
                    } else {
                        fG2 = f13;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-1249392198, i13, -1, "androidx.compose.material.Divider (Divider.kt:48)");
                }
                if (fG2 == BitmapDescriptorFactory.HUE_RED) {
                    dVarM = d.INSTANCE;
                } else {
                    dVarM = t.m(d.INSTANCE, fG2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                }
                if (h.i(fG, h.INSTANCE.a())) {
                    lVarV.o(-129374855);
                    fG3 = h.g(1.0f / ((w4.d) lVarV.U(z0.g())).getDensity());
                    lVarV.l();
                } else {
                    lVarV.o(-129316234);
                    lVarV.l();
                    fG3 = fG;
                }
                g.a(b.d(x.i(x.h(dVar3.g(dVarM), BitmapDescriptorFactory.HUE_RED, 1, null), fG3), jP, null, 2, null), lVarV, 0);
                if (o.J()) {
                    o.R();
                }
                f14 = fG2;
            }
            f15 = fG;
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new a(dVar3, jP, f15, f14, i11, i12));
            }
        }
        i13 |= 3072;
        f13 = f12;
        if ((i13 & 1171) == 1170) {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i16 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if ((i12 & 2) != 0) {
                    jP = p1.p(j1.f74525a.a(lVarV, 6).i(), 0.12f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    i13 &= -113;
                }
                if (i17 != 0) {
                    fG = h.g(1);
                }
                if (i14 != 0) {
                    fG2 = h.g(0);
                } else {
                    fG2 = f13;
                }
            } else {
                if (i16 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if ((i12 & 2) != 0) {
                    jP = p1.p(j1.f74525a.a(lVarV, 6).i(), 0.12f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    i13 &= -113;
                }
                if (i17 != 0) {
                    fG = h.g(1);
                }
                if (i14 != 0) {
                    fG2 = h.g(0);
                } else {
                    fG2 = f13;
                }
            }
            lVarV.C();
            if (o.J()) {
                o.S(-1249392198, i13, -1, "androidx.compose.material.Divider (Divider.kt:48)");
            }
            if (fG2 == BitmapDescriptorFactory.HUE_RED) {
                dVarM = d.INSTANCE;
            } else {
                dVarM = t.m(d.INSTANCE, fG2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            }
            if (h.i(fG, h.INSTANCE.a())) {
                lVarV.o(-129374855);
                fG3 = h.g(1.0f / ((w4.d) lVarV.U(z0.g())).getDensity());
                lVarV.l();
            } else {
                lVarV.o(-129316234);
                lVarV.l();
                fG3 = fG;
            }
            g.a(b.d(x.i(x.h(dVar3.g(dVarM), BitmapDescriptorFactory.HUE_RED, 1, null), fG3), jP, null, 2, null), lVarV, 0);
            if (o.J()) {
                o.R();
            }
            f14 = fG2;
        } else {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i16 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if ((i12 & 2) != 0) {
                    jP = p1.p(j1.f74525a.a(lVarV, 6).i(), 0.12f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    i13 &= -113;
                }
                if (i17 != 0) {
                    fG = h.g(1);
                }
                if (i14 != 0) {
                    fG2 = h.g(0);
                } else {
                    fG2 = f13;
                }
            } else {
                if (i16 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if ((i12 & 2) != 0) {
                    jP = p1.p(j1.f74525a.a(lVarV, 6).i(), 0.12f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    i13 &= -113;
                }
                if (i17 != 0) {
                    fG = h.g(1);
                }
                if (i14 != 0) {
                    fG2 = h.g(0);
                } else {
                    fG2 = f13;
                }
            }
            lVarV.C();
            if (o.J()) {
                o.S(-1249392198, i13, -1, "androidx.compose.material.Divider (Divider.kt:48)");
            }
            if (fG2 == BitmapDescriptorFactory.HUE_RED) {
                dVarM = d.INSTANCE;
            } else {
                dVarM = t.m(d.INSTANCE, fG2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            }
            if (h.i(fG, h.INSTANCE.a())) {
                lVarV.o(-129374855);
                fG3 = h.g(1.0f / ((w4.d) lVarV.U(z0.g())).getDensity());
                lVarV.l();
            } else {
                lVarV.o(-129316234);
                lVarV.l();
                fG3 = fG;
            }
            g.a(b.d(x.i(x.h(dVar3.g(dVarM), BitmapDescriptorFactory.HUE_RED, 1, null), fG3), jP, null, 2, null), lVarV, 0);
            if (o.J()) {
                o.R();
            }
            f14 = fG2;
        }
        f15 = fG;
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(dVar3, jP, f15, f14, i11, i12));
        }
    }
}
