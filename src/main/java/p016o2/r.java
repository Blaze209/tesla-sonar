package p016o2;

import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.x;
import androidx.compose.ui.d;
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
import q2.f;
import wn0.p;
import z3.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a8\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000b\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0016\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/painter/b;", PlaceTypes.PAINTER, "", "contentDescription", "Landroidx/compose/ui/d;", "modifier", "Lk3/p1;", "tint", "Ljn0/h0;", "a", "(Landroidx/compose/ui/graphics/painter/b;Ljava/lang/String;Landroidx/compose/ui/d;JLr2/l;II)V", "b", "(Landroidx/compose/ui/d;Landroidx/compose/ui/graphics/painter/b;)Landroidx/compose/ui/d;", "Lj3/m;", "", "c", "(J)Z", "Landroidx/compose/ui/d;", "DefaultIconSizeModifier", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d f96087a = x.q(d.INSTANCE, f.f104448a.a());

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.painter.b f96088c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f96089d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f96090e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f96091f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f96092g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f96093h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.graphics.painter.b bVar, String str, d dVar, long j11, int i11, int i12) {
            super(2);
            this.f96088c = bVar;
            this.f96089d = str;
            this.f96090e = dVar;
            this.f96091f = j11;
            this.f96092g = i11;
            this.f96093h = i12;
        }

        public final void a(l lVar, int i11) {
            r.a(this.f96088c, this.f96089d, this.f96090e, this.f96091f, lVar, k2.a(this.f96092g | 1), this.f96093h);
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
        final /* synthetic */ String f96094c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f96094c = str;
        }

        public final void a(y yVar) {
            v.c0(yVar, this.f96094c);
            v.k0(yVar, i.INSTANCE.d());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(y yVar) {
            a(yVar);
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0172  */
    /* JADX WARN: Code duplicated, block: B:106:0x017d  */
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
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:84:0x0100  */
    /* JADX WARN: Code duplicated, block: B:88:0x011a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0120  */
    /* JADX WARN: Code duplicated, block: B:91:0x0122  */
    /* JADX WARN: Code duplicated, block: B:94:0x0129  */
    /* JADX WARN: Code duplicated, block: B:96:0x0131  */
    /* JADX WARN: Code duplicated, block: B:99:0x0142  */
    public static final void a(androidx.compose.ui.graphics.painter.b bVar, String str, d dVar, long j11, l lVar, int i11, int i12) {
        int i13;
        d dVar2;
        long j12;
        d dVar3;
        long value;
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
        l lVarV = lVar.v(-2142239481);
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
                        value = ((p1) lVarV.U(m.a())).getValue();
                    } else {
                        value = j12;
                        dVar4 = dVar3;
                    }
                } else {
                    lVarV.j();
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                    }
                    value = j12;
                    dVar4 = dVar2;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-2142239481, i13, -1, "androidx.compose.material3.Icon (Icon.kt:143)");
                }
                z11 = (((i13 & 7168) ^ 3072) <= 2048 && lVarV.s(value)) || (i13 & 3072) == 2048;
                objI = lVarV.I();
                if (z11 || objI == l.INSTANCE.a()) {
                    if (p1.r(value, p1.INSTANCE.j())) {
                        objI = null;
                    } else {
                        objI = q1.Companion.b(q1.INSTANCE, value, 0, 2, null);
                    }
                    lVarV.B(objI);
                }
                q1 q1Var = (q1) objI;
                lVarV.o(-2144891392);
                if (str != null) {
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
                } else {
                    dVarD = d.INSTANCE;
                }
                d dVar6 = dVarD;
                lVarV.l();
                g.a(androidx.compose.ui.draw.d.b(b(androidx.compose.ui.graphics.b.d(dVar4), bVar), bVar, false, null, k.INSTANCE.e(), BitmapDescriptorFactory.HUE_RED, q1Var, 22, null).g(dVar6), lVarV, 0);
                if (o.J()) {
                    o.R();
                }
                dVar5 = dVar4;
                j13 = value;
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
                    value = ((p1) lVarV.U(m.a())).getValue();
                } else {
                    value = j12;
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
                    value = ((p1) lVarV.U(m.a())).getValue();
                } else {
                    value = j12;
                    dVar4 = dVar3;
                }
            }
            lVarV.C();
            if (o.J()) {
                o.S(-2142239481, i13, -1, "androidx.compose.material3.Icon (Icon.kt:143)");
            }
            if (((i13 & 7168) ^ 3072) <= 2048) {
            }
            objI = lVarV.I();
            if (z11) {
                if (p1.r(value, p1.INSTANCE.j())) {
                    objI = null;
                } else {
                    objI = q1.Companion.b(q1.INSTANCE, value, 0, 2, null);
                }
                lVarV.B(objI);
            } else {
                if (p1.r(value, p1.INSTANCE.j())) {
                    objI = null;
                } else {
                    objI = q1.Companion.b(q1.INSTANCE, value, 0, 2, null);
                }
                lVarV.B(objI);
            }
            q1 q1Var2 = (q1) objI;
            lVarV.o(-2144891392);
            if (str != null) {
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
            } else {
                dVarD = d.INSTANCE;
            }
            d dVar7 = dVarD;
            lVarV.l();
            g.a(androidx.compose.ui.draw.d.b(b(androidx.compose.ui.graphics.b.d(dVar4), bVar), bVar, false, null, k.INSTANCE.e(), BitmapDescriptorFactory.HUE_RED, q1Var2, 22, null).g(dVar7), lVarV, 0);
            if (o.J()) {
                o.R();
            }
            dVar5 = dVar4;
            j13 = value;
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
                    value = ((p1) lVarV.U(m.a())).getValue();
                } else {
                    value = j12;
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
                    value = ((p1) lVarV.U(m.a())).getValue();
                } else {
                    value = j12;
                    dVar4 = dVar3;
                }
            }
            lVarV.C();
            if (o.J()) {
                o.S(-2142239481, i13, -1, "androidx.compose.material3.Icon (Icon.kt:143)");
            }
            if (((i13 & 7168) ^ 3072) <= 2048) {
            }
            objI = lVarV.I();
            if (z11) {
                if (p1.r(value, p1.INSTANCE.j())) {
                    objI = null;
                } else {
                    objI = q1.Companion.b(q1.INSTANCE, value, 0, 2, null);
                }
                lVarV.B(objI);
            } else {
                if (p1.r(value, p1.INSTANCE.j())) {
                    objI = null;
                } else {
                    objI = q1.Companion.b(q1.INSTANCE, value, 0, 2, null);
                }
                lVarV.B(objI);
            }
            q1 q1Var3 = (q1) objI;
            lVarV.o(-2144891392);
            if (str != null) {
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
            } else {
                dVarD = d.INSTANCE;
            }
            d dVar8 = dVarD;
            lVarV.l();
            g.a(androidx.compose.ui.draw.d.b(b(androidx.compose.ui.graphics.b.d(dVar4), bVar), bVar, false, null, k.INSTANCE.e(), BitmapDescriptorFactory.HUE_RED, q1Var3, 22, null).g(dVar8), lVarV, 0);
            if (o.J()) {
                o.R();
            }
            dVar5 = dVar4;
            j13 = value;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(bVar, str, dVar5, j13, i11, i12));
        }
    }

    private static final d b(d dVar, androidx.compose.ui.graphics.painter.b bVar) {
        return dVar.g((m.h(bVar.mo1getIntrinsicSizeNHjbRc(), m.INSTANCE.a()) || c(bVar.mo1getIntrinsicSizeNHjbRc())) ? f96087a : d.INSTANCE);
    }

    private static final boolean c(long j11) {
        return Float.isInfinite(m.k(j11)) && Float.isInfinite(m.i(j11));
    }
}
