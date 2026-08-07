package p016o2;

import androidx.compose.ui.d;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d3.c;
import jn0.h0;
import k3.g4;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.d4;
import p020r2.j;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import p020r2.x;
import q1.BorderStroke;
import v1.g;
import v1.i;
import wn0.p;
import wn0.q;
import z3.i0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aW\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Lk3/g4;", "shape", "Lo2/e;", "colors", "Lo2/g;", "elevation", "Lq1/g;", "border", "Lkotlin/Function1;", "Lv1/i;", "Ljn0/h0;", "content", "a", "(Landroidx/compose/ui/d;Lk3/g4;Lo2/e;Lo2/g;Lq1/g;Lwn0/q;Lr2/l;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class h {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q<i, l, Integer, h0> f95871c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(q<? super i, ? super l, ? super Integer, h0> qVar) {
            super(2);
            this.f95871c = qVar;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(664103990, i11, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:96)");
            }
            q<i, l, Integer, h0> qVar = this.f95871c;
            d.Companion companion = d.INSTANCE;
            i0 i0VarA = g.a(v1.b.f117444a.g(), c.INSTANCE.k(), lVar, 0);
            int iA = j.a(lVar, 0);
            x xVarC = lVar.c();
            d dVarE = androidx.compose.ui.c.e(lVar, companion);
            b4.g.Companion companion2 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion2.a();
            if (lVar.w() == null) {
                j.c();
            }
            lVar.h();
            if (lVar.getInserting()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            l lVarA = d4.a(lVar);
            d4.b(lVarA, i0VarA, companion2.c());
            d4.b(lVarA, xVarC, companion2.e());
            p<b4.g, Integer, h0> pVarB = companion2.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE, companion2.d());
            qVar.invoke(v1.j.f117505a, lVar, 6);
            lVar.g();
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f95872c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g4 f95873d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f95874e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g f95875f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ BorderStroke f95876g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ q<i, l, Integer, h0> f95877h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f95878i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f95879j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(d dVar, g4 g4Var, e eVar, g gVar, BorderStroke borderStroke, q<? super i, ? super l, ? super Integer, h0> qVar, int i11, int i12) {
            super(2);
            this.f95872c = dVar;
            this.f95873d = g4Var;
            this.f95874e = eVar;
            this.f95875f = gVar;
            this.f95876g = borderStroke;
            this.f95877h = qVar;
            this.f95878i = i11;
            this.f95879j = i12;
        }

        public final void a(l lVar, int i11) {
            h.a(this.f95872c, this.f95873d, this.f95874e, this.f95875f, this.f95876g, this.f95877h, lVar, k2.a(this.f95878i | 1), this.f95879j);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0136  */
    /* JADX WARN: Code duplicated, block: B:105:0x013e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0142  */
    /* JADX WARN: Code duplicated, block: B:109:0x014e  */
    /* JADX WARN: Code duplicated, block: B:112:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:116:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:93:0x0102  */
    /* JADX WARN: Code duplicated, block: B:94:0x010b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0110  */
    /* JADX WARN: Code duplicated, block: B:98:0x0119  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(d dVar, g4 g4Var, e eVar, g gVar, BorderStroke borderStroke, q<? super i, ? super l, ? super Integer, h0> qVar, l lVar, int i11, int i12) {
        d dVar2;
        int i13;
        g4 g4Var2;
        e eVar2;
        g gVarC;
        BorderStroke borderStroke2;
        int i14;
        u1.j jVar;
        d dVar3;
        g4 g4VarE;
        e eVarA;
        d dVar4;
        g gVar2;
        BorderStroke borderStroke3;
        g4 g4Var3;
        e eVar3;
        d dVar5;
        g4 g4Var4;
        BorderStroke borderStroke4;
        g gVar3;
        w2 w2VarX;
        l lVarV = lVar.v(1179621553);
        int i15 = i12 & 1;
        if (i15 != 0) {
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
            if ((i12 & 2) == 0) {
                g4Var2 = g4Var;
                int i16 = lVarV.n(g4Var2) ? 32 : 16;
                i13 |= i16;
            } else {
                g4Var2 = g4Var;
            }
            i13 |= i16;
        } else {
            g4Var2 = g4Var;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            if ((i12 & 4) == 0) {
                eVar2 = eVar;
                int i17 = lVarV.n(eVar2) ? 256 : 128;
                i13 |= i17;
            } else {
                eVar2 = eVar;
            }
            i13 |= i17;
        } else {
            eVar2 = eVar;
        }
        if ((i11 & 3072) == 0) {
            if ((i12 & 8) == 0) {
                gVarC = gVar;
                int i18 = lVarV.n(gVarC) ? 2048 : 1024;
                i13 |= i18;
            } else {
                gVarC = gVar;
            }
            i13 |= i18;
        } else {
            gVarC = gVar;
        }
        int i19 = i12 & 16;
        if (i19 == 0) {
            if ((i11 & 24576) == 0) {
                borderStroke2 = borderStroke;
                i13 |= lVarV.n(borderStroke2) ? 16384 : PKIFailureInfo.certRevoked;
            }
            if ((i12 & 32) != 0) {
                i13 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (lVarV.K(qVar)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i13 |= i14;
            }
            if ((74899 & i13) == 74898 || !lVarV.b()) {
                lVarV.L();
                jVar = null;
                if ((i11 & 1) != 0 || lVarV.k()) {
                    if (i15 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i12 & 2) != 0) {
                        g4VarE = f.f95850a.e(lVarV, 6);
                        i13 &= -113;
                    } else {
                        g4VarE = g4Var2;
                    }
                    if ((i12 & 4) != 0) {
                        eVarA = f.f95850a.a(lVarV, 6);
                        i13 &= -897;
                    } else {
                        eVarA = eVar2;
                    }
                    if ((i12 & 8) != 0) {
                        gVarC = f.f95850a.c(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 1572864, 63);
                        i13 &= -7169;
                    }
                    g gVar4 = gVarC;
                    dVar4 = dVar3;
                    gVar2 = gVar4;
                    if (i19 != 0) {
                        g4Var3 = g4VarE;
                        borderStroke3 = jVar;
                    } else {
                        borderStroke3 = borderStroke;
                        g4Var3 = g4VarE;
                    }
                } else {
                    lVarV.j();
                    if ((i12 & 2) != 0) {
                        i13 &= -113;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                    }
                    gVar2 = gVarC;
                    borderStroke3 = borderStroke2;
                    dVar4 = dVar2;
                    g4Var3 = g4Var2;
                    eVarA = eVar2;
                    jVar = null;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(1179621553, i13, -1, "androidx.compose.material3.Card (Card.kt:87)");
                }
                g gVar5 = gVar2;
                m0.a(dVar4, g4Var3, eVarA.a(true), eVarA.b(true), BitmapDescriptorFactory.HUE_RED, gVar2.f(true, jVar, lVarV, ((i13 >> 3) & 896) | 54).getValue().getValue(), borderStroke3, z2.c.e(664103990, true, new a(qVar), lVarV, 54), lVarV, (i13 & 14) | 12582912 | (i13 & 112) | (3670016 & (i13 << 6)), 16);
                lVarV = lVarV;
                if (o.J()) {
                    o.R();
                }
                eVar3 = eVarA;
                dVar5 = dVar4;
                g4Var4 = g4Var3;
                borderStroke4 = borderStroke3;
                gVar3 = gVar5;
            } else {
                lVarV.j();
                dVar5 = dVar2;
                g4Var4 = g4Var2;
                eVar3 = eVar2;
                gVar3 = gVarC;
                borderStroke4 = borderStroke2;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(dVar5, g4Var4, eVar3, gVar3, borderStroke4, qVar, i11, i12));
            }
        }
        i13 |= 24576;
        borderStroke2 = borderStroke;
        if ((i12 & 32) != 0) {
            i13 |= 196608;
        } else if ((i11 & 196608) == 0) {
            if (lVarV.K(qVar)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i13 |= i14;
        }
        if ((74899 & i13) == 74898) {
            lVarV.L();
            jVar = null;
            if ((i11 & 1) != 0) {
                if (i15 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if ((i12 & 2) != 0) {
                    g4VarE = f.f95850a.e(lVarV, 6);
                    i13 &= -113;
                } else {
                    g4VarE = g4Var2;
                }
                if ((i12 & 4) != 0) {
                    eVarA = f.f95850a.a(lVarV, 6);
                    i13 &= -897;
                } else {
                    eVarA = eVar2;
                }
                if ((i12 & 8) != 0) {
                    gVarC = f.f95850a.c(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 1572864, 63);
                    i13 &= -7169;
                }
                g gVar6 = gVarC;
                dVar4 = dVar3;
                gVar2 = gVar6;
                if (i19 != 0) {
                    g4Var3 = g4VarE;
                    borderStroke3 = jVar;
                } else {
                    borderStroke3 = borderStroke;
                    g4Var3 = g4VarE;
                }
            } else {
                if (i15 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if ((i12 & 2) != 0) {
                    g4VarE = f.f95850a.e(lVarV, 6);
                    i13 &= -113;
                } else {
                    g4VarE = g4Var2;
                }
                if ((i12 & 4) != 0) {
                    eVarA = f.f95850a.a(lVarV, 6);
                    i13 &= -897;
                } else {
                    eVarA = eVar2;
                }
                if ((i12 & 8) != 0) {
                    gVarC = f.f95850a.c(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 1572864, 63);
                    i13 &= -7169;
                }
                g gVar7 = gVarC;
                dVar4 = dVar3;
                gVar2 = gVar7;
                if (i19 != 0) {
                    g4Var3 = g4VarE;
                    borderStroke3 = jVar;
                } else {
                    borderStroke3 = borderStroke;
                    g4Var3 = g4VarE;
                }
            }
            lVarV.C();
            if (o.J()) {
                o.S(1179621553, i13, -1, "androidx.compose.material3.Card (Card.kt:87)");
            }
            g gVar8 = gVar2;
            m0.a(dVar4, g4Var3, eVarA.a(true), eVarA.b(true), BitmapDescriptorFactory.HUE_RED, gVar2.f(true, jVar, lVarV, ((i13 >> 3) & 896) | 54).getValue().getValue(), borderStroke3, z2.c.e(664103990, true, new a(qVar), lVarV, 54), lVarV, (i13 & 14) | 12582912 | (i13 & 112) | (3670016 & (i13 << 6)), 16);
            lVarV = lVarV;
            if (o.J()) {
                o.R();
            }
            eVar3 = eVarA;
            dVar5 = dVar4;
            g4Var4 = g4Var3;
            borderStroke4 = borderStroke3;
            gVar3 = gVar8;
        } else {
            lVarV.L();
            jVar = null;
            if ((i11 & 1) != 0) {
                if (i15 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if ((i12 & 2) != 0) {
                    g4VarE = f.f95850a.e(lVarV, 6);
                    i13 &= -113;
                } else {
                    g4VarE = g4Var2;
                }
                if ((i12 & 4) != 0) {
                    eVarA = f.f95850a.a(lVarV, 6);
                    i13 &= -897;
                } else {
                    eVarA = eVar2;
                }
                if ((i12 & 8) != 0) {
                    gVarC = f.f95850a.c(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 1572864, 63);
                    i13 &= -7169;
                }
                g gVar9 = gVarC;
                dVar4 = dVar3;
                gVar2 = gVar9;
                if (i19 != 0) {
                    g4Var3 = g4VarE;
                    borderStroke3 = jVar;
                } else {
                    borderStroke3 = borderStroke;
                    g4Var3 = g4VarE;
                }
            } else {
                if (i15 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if ((i12 & 2) != 0) {
                    g4VarE = f.f95850a.e(lVarV, 6);
                    i13 &= -113;
                } else {
                    g4VarE = g4Var2;
                }
                if ((i12 & 4) != 0) {
                    eVarA = f.f95850a.a(lVarV, 6);
                    i13 &= -897;
                } else {
                    eVarA = eVar2;
                }
                if ((i12 & 8) != 0) {
                    gVarC = f.f95850a.c(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVarV, 1572864, 63);
                    i13 &= -7169;
                }
                g gVar10 = gVarC;
                dVar4 = dVar3;
                gVar2 = gVar10;
                if (i19 != 0) {
                    g4Var3 = g4VarE;
                    borderStroke3 = jVar;
                } else {
                    borderStroke3 = borderStroke;
                    g4Var3 = g4VarE;
                }
            }
            lVarV.C();
            if (o.J()) {
                o.S(1179621553, i13, -1, "androidx.compose.material3.Card (Card.kt:87)");
            }
            g gVar11 = gVar2;
            m0.a(dVar4, g4Var3, eVarA.a(true), eVarA.b(true), BitmapDescriptorFactory.HUE_RED, gVar2.f(true, jVar, lVarV, ((i13 >> 3) & 896) | 54).getValue().getValue(), borderStroke3, z2.c.e(664103990, true, new a(qVar), lVarV, 54), lVarV, (i13 & 14) | 12582912 | (i13 & 112) | (3670016 & (i13 << 6)), 16);
            lVarV = lVarV;
            if (o.J()) {
                o.R();
            }
            eVar3 = eVarA;
            dVar5 = dVar4;
            g4Var4 = g4Var3;
            borderStroke4 = borderStroke3;
            gVar3 = gVar11;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(dVar5, g4Var4, eVar3, gVar3, borderStroke4, qVar, i11, i12));
        }
    }
}
