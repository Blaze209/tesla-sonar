package p009i2;

import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.x;
import androidx.compose.ui.d;
import androidx.compose.ui.graphics.vector.VectorPainter;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.places.api.model.PlaceTypes;
import g4.i;
import g4.v;
import g4.y;
import j3.m;
import jn0.h0;
import k3.p1;
import k3.q1;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import p3.q;
import w4.h;
import wn0.p;
import z3.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a8\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a8\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u000f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0016\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Lp3/d;", "imageVector", "", "contentDescription", "Landroidx/compose/ui/d;", "modifier", "Lk3/p1;", "tint", "Ljn0/h0;", "b", "(Lp3/d;Ljava/lang/String;Landroidx/compose/ui/d;JLr2/l;II)V", "Landroidx/compose/ui/graphics/painter/b;", PlaceTypes.PAINTER, "a", "(Landroidx/compose/ui/graphics/painter/b;Ljava/lang/String;Landroidx/compose/ui/d;JLr2/l;II)V", "c", "(Landroidx/compose/ui/d;Landroidx/compose/ui/graphics/painter/b;)Landroidx/compose/ui/d;", "Lj3/m;", "", DateTokenConverter.CONVERTER_KEY, "(J)Z", "Landroidx/compose/ui/d;", "DefaultIconSizeModifier", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d f74327a = x.q(d.INSTANCE, h.g(24));

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.painter.b f74328c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f74329d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f74330e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f74331f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f74332g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f74333h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.graphics.painter.b bVar, String str, d dVar, long j11, int i11, int i12) {
            super(2);
            this.f74328c = bVar;
            this.f74329d = str;
            this.f74330e = dVar;
            this.f74331f = j11;
            this.f74332g = i11;
            this.f74333h = i12;
        }

        public final void a(l lVar, int i11) {
            e1.a(this.f74328c, this.f74329d, this.f74330e, this.f74331f, lVar, k2.a(this.f74332g | 1), this.f74333h);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.l<y, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f74334c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f74334c = str;
        }

        public final void a(y yVar) {
            v.c0(yVar, this.f74334c);
            v.k0(yVar, i.INSTANCE.d());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(y yVar) {
            a(yVar);
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0196  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:79:0x0105  */
    /* JADX WARN: Code duplicated, block: B:81:0x010d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0119  */
    /* JADX WARN: Code duplicated, block: B:84:0x011b  */
    /* JADX WARN: Code duplicated, block: B:88:0x012f  */
    /* JADX WARN: Code duplicated, block: B:90:0x013b  */
    /* JADX WARN: Code duplicated, block: B:91:0x013d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0144  */
    /* JADX WARN: Code duplicated, block: B:96:0x014c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0160  */
    public static final void a(androidx.compose.ui.graphics.painter.b bVar, String str, d dVar, long j11, l lVar, int i11, int i12) {
        int i13;
        d dVar2;
        long j12;
        d dVar3;
        long jP;
        d dVar4;
        boolean z11;
        Object objI;
        d dVarD;
        d dVar5;
        long j13;
        boolean z12;
        Object objI2;
        w2 w2VarX;
        int i14;
        l lVarV = lVar.v(-1142959010);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.K(bVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= lVarV.n(str) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 == 0) {
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 256 : 128;
            }
            if ((i11 & 3072) == 0) {
                j12 = j11;
                if ((i12 & 8) == 0 || !lVarV.s(j12)) {
                    i14 = 1024;
                } else {
                    i14 = 2048;
                }
                i13 |= i14;
            } else {
                j12 = j11;
            }
            if ((i13 & 1171) == 1170 || !lVarV.b()) {
                lVarV.L();
                if ((i11 & 1) != 0 || lVarV.k()) {
                    if (i15 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        dVar4 = dVar3;
                        jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                    } else {
                        jP = j12;
                        dVar4 = dVar3;
                    }
                } else {
                    lVarV.j();
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                    }
                    jP = j12;
                    dVar4 = dVar2;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-1142959010, i13, -1, "androidx.compose.material.Icon (Icon.kt:134)");
                }
                z11 = (((i13 & 7168) ^ 3072) <= 2048 && lVarV.s(jP)) || (i13 & 3072) == 2048;
                objI = lVarV.I();
                if (z11 || objI == l.INSTANCE.a()) {
                    if (p1.r(jP, p1.INSTANCE.j())) {
                        objI = null;
                    } else {
                        objI = q1.Companion.b(q1.INSTANCE, jP, 0, 2, null);
                    }
                    lVarV.B(objI);
                }
                q1 q1Var = (q1) objI;
                if (str != null) {
                    lVarV.o(980462681);
                    d.Companion companion = d.INSTANCE;
                    if ((i13 & 112) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objI2 = lVarV.I();
                    if (z12 || objI2 == l.INSTANCE.a()) {
                        objI2 = new b(str);
                        lVarV.B(objI2);
                    }
                    dVarD = g4.o.d(companion, false, (wn0.l) objI2, 1, null);
                    lVarV.l();
                } else {
                    lVarV.o(980601995);
                    lVarV.l();
                    dVarD = d.INSTANCE;
                }
                g.a(androidx.compose.ui.draw.d.b(c(androidx.compose.ui.graphics.b.d(dVar4), bVar), bVar, false, null, k.INSTANCE.e(), BitmapDescriptorFactory.HUE_RED, q1Var, 22, null).g(dVarD), lVarV, 0);
                if (o.J()) {
                    o.R();
                }
                dVar5 = dVar4;
                j13 = jP;
            } else {
                lVarV.j();
                dVar5 = dVar2;
                j13 = j12;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new a(bVar, str, dVar5, j13, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        dVar2 = dVar;
        if ((i11 & 3072) == 0) {
            j12 = j11;
            if ((i12 & 8) == 0) {
                i14 = 1024;
            } else {
                i14 = 1024;
            }
            i13 |= i14;
        } else {
            j12 = j11;
        }
        if ((i13 & 1171) == 1170) {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i15 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    dVar4 = dVar3;
                    jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                } else {
                    jP = j12;
                    dVar4 = dVar3;
                }
            } else {
                if (i15 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    dVar4 = dVar3;
                    jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                } else {
                    jP = j12;
                    dVar4 = dVar3;
                }
            }
            lVarV.C();
            if (o.J()) {
                o.S(-1142959010, i13, -1, "androidx.compose.material.Icon (Icon.kt:134)");
            }
            if (((i13 & 7168) ^ 3072) <= 2048) {
            }
            objI = lVarV.I();
            if (z11) {
                if (p1.r(jP, p1.INSTANCE.j())) {
                    objI = null;
                } else {
                    objI = q1.Companion.b(q1.INSTANCE, jP, 0, 2, null);
                }
                lVarV.B(objI);
            } else {
                if (p1.r(jP, p1.INSTANCE.j())) {
                    objI = null;
                } else {
                    objI = q1.Companion.b(q1.INSTANCE, jP, 0, 2, null);
                }
                lVarV.B(objI);
            }
            q1 q1Var2 = (q1) objI;
            if (str != null) {
                lVarV.o(980462681);
                d.Companion companion2 = d.INSTANCE;
                if ((i13 & 112) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objI2 = lVarV.I();
                if (z12) {
                    objI2 = new b(str);
                    lVarV.B(objI2);
                } else {
                    objI2 = new b(str);
                    lVarV.B(objI2);
                }
                dVarD = g4.o.d(companion2, false, (wn0.l) objI2, 1, null);
                lVarV.l();
            } else {
                lVarV.o(980601995);
                lVarV.l();
                dVarD = d.INSTANCE;
            }
            g.a(androidx.compose.ui.draw.d.b(c(androidx.compose.ui.graphics.b.d(dVar4), bVar), bVar, false, null, k.INSTANCE.e(), BitmapDescriptorFactory.HUE_RED, q1Var2, 22, null).g(dVarD), lVarV, 0);
            if (o.J()) {
                o.R();
            }
            dVar5 = dVar4;
            j13 = jP;
        } else {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i15 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    dVar4 = dVar3;
                    jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                } else {
                    jP = j12;
                    dVar4 = dVar3;
                }
            } else {
                if (i15 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    dVar4 = dVar3;
                    jP = p1.p(((p1) lVarV.U(z.a())).getValue(), ((Number) lVarV.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
                } else {
                    jP = j12;
                    dVar4 = dVar3;
                }
            }
            lVarV.C();
            if (o.J()) {
                o.S(-1142959010, i13, -1, "androidx.compose.material.Icon (Icon.kt:134)");
            }
            if (((i13 & 7168) ^ 3072) <= 2048) {
            }
            objI = lVarV.I();
            if (z11) {
                if (p1.r(jP, p1.INSTANCE.j())) {
                    objI = null;
                } else {
                    objI = q1.Companion.b(q1.INSTANCE, jP, 0, 2, null);
                }
                lVarV.B(objI);
            } else {
                if (p1.r(jP, p1.INSTANCE.j())) {
                    objI = null;
                } else {
                    objI = q1.Companion.b(q1.INSTANCE, jP, 0, 2, null);
                }
                lVarV.B(objI);
            }
            q1 q1Var3 = (q1) objI;
            if (str != null) {
                lVarV.o(980462681);
                d.Companion companion3 = d.INSTANCE;
                if ((i13 & 112) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objI2 = lVarV.I();
                if (z12) {
                    objI2 = new b(str);
                    lVarV.B(objI2);
                } else {
                    objI2 = new b(str);
                    lVarV.B(objI2);
                }
                dVarD = g4.o.d(companion3, false, (wn0.l) objI2, 1, null);
                lVarV.l();
            } else {
                lVarV.o(980601995);
                lVarV.l();
                dVarD = d.INSTANCE;
            }
            g.a(androidx.compose.ui.draw.d.b(c(androidx.compose.ui.graphics.b.d(dVar4), bVar), bVar, false, null, k.INSTANCE.e(), BitmapDescriptorFactory.HUE_RED, q1Var3, 22, null).g(dVarD), lVarV, 0);
            if (o.J()) {
                o.R();
            }
            dVar5 = dVar4;
            j13 = jP;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(bVar, str, dVar5, j13, i11, i12));
        }
    }

    public static final void b(p3.d dVar, String str, d dVar2, long j11, l lVar, int i11, int i12) {
        d dVar3 = (i12 & 4) != 0 ? d.INSTANCE : dVar2;
        long jP = (i12 & 8) != 0 ? p1.p(((p1) lVar.U(z.a())).getValue(), ((Number) lVar.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j11;
        if (o.J()) {
            o.S(-800853103, i11, -1, "androidx.compose.material.Icon (Icon.kt:66)");
        }
        a(q.g(dVar, lVar, i11 & 14), str, dVar3, jP, lVar, VectorPainter.f5475m | (i11 & 112) | (i11 & 896) | (i11 & 7168), 0);
        if (o.J()) {
            o.R();
        }
    }

    private static final d c(d dVar, androidx.compose.ui.graphics.painter.b bVar) {
        return dVar.g((m.h(bVar.mo1getIntrinsicSizeNHjbRc(), m.INSTANCE.a()) || d(bVar.mo1getIntrinsicSizeNHjbRc())) ? f74327a : d.INSTANCE);
    }

    private static final boolean d(long j11) {
        return Float.isInfinite(m.k(j11)) && Float.isInfinite(m.i(j11));
    }
}
