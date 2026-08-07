package p008h80;

import androidx.compose.foundation.m;
import androidx.compose.ui.d;
import b4.g;
import jn0.h0;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p009i2.m2;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.d4;
import p020r2.j;
import p020r2.k2;
import p020r2.l;
import p020r2.n3;
import p020r2.o;
import p020r2.w2;
import p020r2.x;
import p020r2.y2;
import p020r2.y3;
import v1.m0;
import v1.q0;
import v1.r0;
import v1.s0;
import w4.h;
import wn0.p;
import wn0.q;
import z3.a0;
import z3.i0;

/* JADX INFO: renamed from: h80.e0, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\r²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\n8\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Ljn0/h0;", "topBar", "content", "Landroidx/compose/ui/d;", "modifier", "Landroidx/compose/foundation/o;", "scrollState", "a", "(Lwn0/p;Lwn0/p;Landroidx/compose/ui/d;Landroidx/compose/foundation/o;Lr2/l;II)V", "Lw4/h;", "targetElevation", "elevation", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Function0 {

    /* JADX INFO: renamed from: h80.e0$a */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f71021c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super l, ? super Integer, h0> pVar) {
            super(2);
            this.f71021c = pVar;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(138113241, i11, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScaffold.<anonymous>.<anonymous> (PaymentSheetScaffold.kt:47)");
            }
            this.f71021c.invoke(lVar, 0);
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

    /* JADX INFO: renamed from: h80.e0$b */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f71022c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f71023d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f71024e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.o f71025f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f71026g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f71027h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p<? super l, ? super Integer, h0> pVar, p<? super l, ? super Integer, h0> pVar2, d dVar, androidx.compose.foundation.o oVar, int i11, int i12) {
            super(2);
            this.f71022c = pVar;
            this.f71023d = pVar2;
            this.f71024e = dVar;
            this.f71025f = oVar;
            this.f71026g = i11;
            this.f71027h = i12;
        }

        public final void a(l lVar, int i11) {
            Function0.a(this.f71022c, this.f71023d, this.f71024e, this.f71025f, lVar, k2.a(this.f71026g | 1), this.f71027h);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: h80.e0$c */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lw4/h;", "b", "()F"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements wn0.a<h> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.o f71028c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.foundation.o oVar) {
            super(0);
            this.f71028c = oVar;
        }

        public final float b() {
            return this.f71028c.m() > 0 ? h.g(8) : h.g(0);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h invoke() {
            return h.d(b());
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:104:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:76:0x0142  */
    /* JADX WARN: Code duplicated, block: B:79:0x014e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0152  */
    /* JADX WARN: Code duplicated, block: B:83:0x0171  */
    /* JADX WARN: Code duplicated, block: B:85:0x017f  */
    /* JADX WARN: Code duplicated, block: B:88:0x021b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0227  */
    /* JADX WARN: Code duplicated, block: B:92:0x022b  */
    /* JADX WARN: Code duplicated, block: B:95:0x024a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0258  */
    public static final void a(p<? super l, ? super Integer, h0> topBar, p<? super l, ? super Integer, h0> content, d dVar, androidx.compose.foundation.o oVar, l lVar, int i11, int i12) {
        int i13;
        d dVar2;
        androidx.compose.foundation.o oVar2;
        d dVar3;
        int i14;
        d dVar4;
        androidx.compose.foundation.o oVarA;
        Object objI;
        int iA;
        wn0.a<g> aVarA;
        l lVarA;
        p<g, Integer, h0> pVarB;
        int iA2;
        wn0.a<g> aVarA2;
        l lVarA2;
        p<g, Integer, h0> pVarB2;
        d dVar5;
        androidx.compose.foundation.o oVar3;
        w2 w2VarX;
        s.k(topBar, "topBar");
        s.k(content, "content");
        l lVarV = lVar.v(-140705205);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (lVarV.K(topBar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= lVarV.K(content) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 == 0) {
            if ((i11 & 896) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 256 : 128;
            }
            if ((i11 & 7168) == 0) {
                if ((i12 & 8) == 0) {
                    oVar2 = oVar;
                    int i16 = lVarV.n(oVar2) ? 2048 : 1024;
                    i13 |= i16;
                } else {
                    oVar2 = oVar;
                }
                i13 |= i16;
            } else {
                oVar2 = oVar;
            }
            if ((i13 & 5851) == 1170 || !lVarV.b()) {
                lVarV.L();
                if ((i11 & 1) != 0 || lVarV.k()) {
                    if (i15 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i12 & 8) != 0) {
                        i14 = i13 & (-7169);
                        dVar4 = dVar3;
                        oVarA = m.a(0, lVarV, 0, 1);
                    } else {
                        i14 = i13;
                        dVar4 = dVar3;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-140705205, i14, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScaffold (PaymentSheetScaffold.kt:27)");
                    }
                    lVarV.H(-168058096);
                    objI = lVarV.I();
                    if (objI == l.INSTANCE.a()) {
                        objI = n3.e(new c(oVarA));
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    y3<h> y3VarC = p019p1.c.c(b((y3) objI), null, "PaymentSheetTopBarElevation", null, lVarV, KyberEngine.KyberPolyBytes, 10);
                    lVarV.H(-483455358);
                    v1.b bVar = v1.b.f117444a;
                    v1.b.m mVarG = bVar.g();
                    d3.c.Companion companion = d3.c.INSTANCE;
                    i0 i0VarA = v1.g.a(mVarG, companion.k(), lVarV, 0);
                    lVarV.H(-1323940314);
                    iA = j.a(lVarV, 0);
                    x xVarC = lVarV.c();
                    g.Companion companion2 = g.INSTANCE;
                    aVarA = companion2.a();
                    q<y2<g>, l, Integer, h0> qVarA = a0.a(dVar4);
                    if (lVarV.w() == null) {
                        j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d4.b(lVarA, i0VarA, companion2.c());
                    d4.b(lVarA, xVarC, companion2.e());
                    pVarB = companion2.b();
                    if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                    lVarV.H(2058660585);
                    v1.j jVar = v1.j.f117505a;
                    float fC = c(y3VarC);
                    d.Companion companion3 = d.INSTANCE;
                    androidx.compose.foundation.o oVar4 = oVarA;
                    int i17 = i14;
                    m2.a(d3.l.a(companion3, 1.0f), null, 0L, 0L, null, fC, z2.c.b(lVarV, 138113241, true, new a(topBar)), lVarV, 1572870, 30);
                    lVarV = lVarV;
                    d dVarD = m.d(q0.a(companion3), oVar4, false, null, false, 14, null);
                    lVarV.H(-483455358);
                    i0 i0VarA2 = v1.g.a(bVar.g(), companion.k(), lVarV, 0);
                    lVarV.H(-1323940314);
                    iA2 = j.a(lVarV, 0);
                    x xVarC2 = lVarV.c();
                    aVarA2 = companion2.a();
                    q<y2<g>, l, Integer, h0> qVarA2 = a0.a(dVarD);
                    if (lVarV.w() == null) {
                        j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA2);
                    } else {
                        lVarV.d();
                    }
                    lVarA2 = d4.a(lVarV);
                    d4.b(lVarA2, i0VarA2, companion2.c());
                    d4.b(lVarA2, xVarC2, companion2.e());
                    pVarB2 = companion2.b();
                    if (lVarA2.getInserting() || !s.f(lVarA2.I(), Integer.valueOf(iA2))) {
                        lVarA2.B(Integer.valueOf(iA2));
                        lVarA2.f(Integer.valueOf(iA2), pVarB2);
                    }
                    qVarA2.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                    lVarV.H(2058660585);
                    content.invoke(lVarV, Integer.valueOf((i17 >> 3) & 14));
                    v1.i0.a(r0.a(companion3, s0.c(m0.INSTANCE, lVarV, 8)), lVarV, 0);
                    lVarV.T();
                    lVarV.g();
                    lVarV.T();
                    lVarV.T();
                    lVarV.T();
                    lVarV.g();
                    lVarV.T();
                    lVarV.T();
                    if (o.J()) {
                        o.R();
                    }
                    dVar5 = dVar4;
                    oVar3 = oVar4;
                } else {
                    lVarV.j();
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                    }
                    i14 = i13;
                    dVar4 = dVar2;
                }
                oVarA = oVar2;
                lVarV.C();
                if (o.J()) {
                    o.S(-140705205, i14, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScaffold (PaymentSheetScaffold.kt:27)");
                }
                lVarV.H(-168058096);
                objI = lVarV.I();
                if (objI == l.INSTANCE.a()) {
                    objI = n3.e(new c(oVarA));
                    lVarV.B(objI);
                }
                lVarV.T();
                y3<h> y3VarC2 = p019p1.c.c(b((y3) objI), null, "PaymentSheetTopBarElevation", null, lVarV, KyberEngine.KyberPolyBytes, 10);
                lVarV.H(-483455358);
                v1.b bVar2 = v1.b.f117444a;
                v1.b.m mVarG2 = bVar2.g();
                d3.c.Companion companion4 = d3.c.INSTANCE;
                i0 i0VarA3 = v1.g.a(mVarG2, companion4.k(), lVarV, 0);
                lVarV.H(-1323940314);
                iA = j.a(lVarV, 0);
                x xVarC3 = lVarV.c();
                g.Companion companion5 = g.INSTANCE;
                aVarA = companion5.a();
                q<y2<g>, l, Integer, h0> qVarA3 = a0.a(dVar4);
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d4.b(lVarA, i0VarA3, companion5.c());
                d4.b(lVarA, xVarC3, companion5.e());
                pVarB = companion5.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA3.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                v1.j jVar2 = v1.j.f117505a;
                float fC2 = c(y3VarC2);
                d.Companion companion6 = d.INSTANCE;
                androidx.compose.foundation.o oVar5 = oVarA;
                int i18 = i14;
                m2.a(d3.l.a(companion6, 1.0f), null, 0L, 0L, null, fC2, z2.c.b(lVarV, 138113241, true, new a(topBar)), lVarV, 1572870, 30);
                lVarV = lVarV;
                d dVarD2 = m.d(q0.a(companion6), oVar5, false, null, false, 14, null);
                lVarV.H(-483455358);
                i0 i0VarA4 = v1.g.a(bVar2.g(), companion4.k(), lVarV, 0);
                lVarV.H(-1323940314);
                iA2 = j.a(lVarV, 0);
                x xVarC4 = lVarV.c();
                aVarA2 = companion5.a();
                q<y2<g>, l, Integer, h0> qVarA4 = a0.a(dVarD2);
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA2);
                } else {
                    lVarV.d();
                }
                lVarA2 = d4.a(lVarV);
                d4.b(lVarA2, i0VarA4, companion5.c());
                d4.b(lVarA2, xVarC4, companion5.e());
                pVarB2 = companion5.b();
                if (lVarA2.getInserting()) {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                } else {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                }
                qVarA4.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                content.invoke(lVarV, Integer.valueOf((i18 >> 3) & 14));
                v1.i0.a(r0.a(companion6, s0.c(m0.INSTANCE, lVarV, 8)), lVarV, 0);
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                if (o.J()) {
                    o.R();
                }
                dVar5 = dVar4;
                oVar3 = oVar5;
            } else {
                lVarV.j();
                dVar5 = dVar2;
                oVar3 = oVar2;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(topBar, content, dVar5, oVar3, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        dVar2 = dVar;
        if ((i11 & 7168) == 0) {
            if ((i12 & 8) == 0) {
                oVar2 = oVar;
                if (lVarV.n(oVar2)) {
                }
                i13 |= i16;
            } else {
                oVar2 = oVar;
            }
            i13 |= i16;
        } else {
            oVar2 = oVar;
        }
        if ((i13 & 5851) == 1170) {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i15 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if ((i12 & 8) != 0) {
                    i14 = i13 & (-7169);
                    dVar4 = dVar3;
                    oVarA = m.a(0, lVarV, 0, 1);
                } else {
                    i14 = i13;
                    dVar4 = dVar3;
                    oVarA = oVar2;
                }
            } else {
                if (i15 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if ((i12 & 8) != 0) {
                    i14 = i13 & (-7169);
                    dVar4 = dVar3;
                    oVarA = m.a(0, lVarV, 0, 1);
                } else {
                    i14 = i13;
                    dVar4 = dVar3;
                    oVarA = oVar2;
                }
            }
            lVarV.C();
            if (o.J()) {
                o.S(-140705205, i14, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScaffold (PaymentSheetScaffold.kt:27)");
            }
            lVarV.H(-168058096);
            objI = lVarV.I();
            if (objI == l.INSTANCE.a()) {
                objI = n3.e(new c(oVarA));
                lVarV.B(objI);
            }
            lVarV.T();
            y3<h> y3VarC3 = p019p1.c.c(b((y3) objI), null, "PaymentSheetTopBarElevation", null, lVarV, KyberEngine.KyberPolyBytes, 10);
            lVarV.H(-483455358);
            v1.b bVar3 = v1.b.f117444a;
            v1.b.m mVarG3 = bVar3.g();
            d3.c.Companion companion7 = d3.c.INSTANCE;
            i0 i0VarA5 = v1.g.a(mVarG3, companion7.k(), lVarV, 0);
            lVarV.H(-1323940314);
            iA = j.a(lVarV, 0);
            x xVarC5 = lVarV.c();
            g.Companion companion8 = g.INSTANCE;
            aVarA = companion8.a();
            q<y2<g>, l, Integer, h0> qVarA5 = a0.a(dVar4);
            if (lVarV.w() == null) {
                j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarA5, companion8.c());
            d4.b(lVarA, xVarC5, companion8.e());
            pVarB = companion8.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA5.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.j jVar3 = v1.j.f117505a;
            float fC3 = c(y3VarC3);
            d.Companion companion9 = d.INSTANCE;
            androidx.compose.foundation.o oVar6 = oVarA;
            int i19 = i14;
            m2.a(d3.l.a(companion9, 1.0f), null, 0L, 0L, null, fC3, z2.c.b(lVarV, 138113241, true, new a(topBar)), lVarV, 1572870, 30);
            lVarV = lVarV;
            d dVarD3 = m.d(q0.a(companion9), oVar6, false, null, false, 14, null);
            lVarV.H(-483455358);
            i0 i0VarA6 = v1.g.a(bVar3.g(), companion7.k(), lVarV, 0);
            lVarV.H(-1323940314);
            iA2 = j.a(lVarV, 0);
            x xVarC6 = lVarV.c();
            aVarA2 = companion8.a();
            q<y2<g>, l, Integer, h0> qVarA6 = a0.a(dVarD3);
            if (lVarV.w() == null) {
                j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA2);
            } else {
                lVarV.d();
            }
            lVarA2 = d4.a(lVarV);
            d4.b(lVarA2, i0VarA6, companion8.c());
            d4.b(lVarA2, xVarC6, companion8.e());
            pVarB2 = companion8.b();
            if (lVarA2.getInserting()) {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            } else {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            }
            qVarA6.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            content.invoke(lVarV, Integer.valueOf((i19 >> 3) & 14));
            v1.i0.a(r0.a(companion9, s0.c(m0.INSTANCE, lVarV, 8)), lVarV, 0);
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            if (o.J()) {
                o.R();
            }
            dVar5 = dVar4;
            oVar3 = oVar6;
        } else {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i15 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if ((i12 & 8) != 0) {
                    i14 = i13 & (-7169);
                    dVar4 = dVar3;
                    oVarA = m.a(0, lVarV, 0, 1);
                } else {
                    i14 = i13;
                    dVar4 = dVar3;
                    oVarA = oVar2;
                }
            } else {
                if (i15 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if ((i12 & 8) != 0) {
                    i14 = i13 & (-7169);
                    dVar4 = dVar3;
                    oVarA = m.a(0, lVarV, 0, 1);
                } else {
                    i14 = i13;
                    dVar4 = dVar3;
                    oVarA = oVar2;
                }
            }
            lVarV.C();
            if (o.J()) {
                o.S(-140705205, i14, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScaffold (PaymentSheetScaffold.kt:27)");
            }
            lVarV.H(-168058096);
            objI = lVarV.I();
            if (objI == l.INSTANCE.a()) {
                objI = n3.e(new c(oVarA));
                lVarV.B(objI);
            }
            lVarV.T();
            y3<h> y3VarC4 = p019p1.c.c(b((y3) objI), null, "PaymentSheetTopBarElevation", null, lVarV, KyberEngine.KyberPolyBytes, 10);
            lVarV.H(-483455358);
            v1.b bVar4 = v1.b.f117444a;
            v1.b.m mVarG4 = bVar4.g();
            d3.c.Companion companion10 = d3.c.INSTANCE;
            i0 i0VarA7 = v1.g.a(mVarG4, companion10.k(), lVarV, 0);
            lVarV.H(-1323940314);
            iA = j.a(lVarV, 0);
            x xVarC7 = lVarV.c();
            g.Companion companion11 = g.INSTANCE;
            aVarA = companion11.a();
            q<y2<g>, l, Integer, h0> qVarA7 = a0.a(dVar4);
            if (lVarV.w() == null) {
                j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarA7, companion11.c());
            d4.b(lVarA, xVarC7, companion11.e());
            pVarB = companion11.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA7.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.j jVar4 = v1.j.f117505a;
            float fC4 = c(y3VarC4);
            d.Companion companion12 = d.INSTANCE;
            androidx.compose.foundation.o oVar7 = oVarA;
            int i110 = i14;
            m2.a(d3.l.a(companion12, 1.0f), null, 0L, 0L, null, fC4, z2.c.b(lVarV, 138113241, true, new a(topBar)), lVarV, 1572870, 30);
            lVarV = lVarV;
            d dVarD4 = m.d(q0.a(companion12), oVar7, false, null, false, 14, null);
            lVarV.H(-483455358);
            i0 i0VarA8 = v1.g.a(bVar4.g(), companion10.k(), lVarV, 0);
            lVarV.H(-1323940314);
            iA2 = j.a(lVarV, 0);
            x xVarC8 = lVarV.c();
            aVarA2 = companion11.a();
            q<y2<g>, l, Integer, h0> qVarA8 = a0.a(dVarD4);
            if (lVarV.w() == null) {
                j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA2);
            } else {
                lVarV.d();
            }
            lVarA2 = d4.a(lVarV);
            d4.b(lVarA2, i0VarA8, companion11.c());
            d4.b(lVarA2, xVarC8, companion11.e());
            pVarB2 = companion11.b();
            if (lVarA2.getInserting()) {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            } else {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            }
            qVarA8.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            content.invoke(lVarV, Integer.valueOf((i110 >> 3) & 14));
            v1.i0.a(r0.a(companion12, s0.c(m0.INSTANCE, lVarV, 8)), lVarV, 0);
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            if (o.J()) {
                o.R();
            }
            dVar5 = dVar4;
            oVar3 = oVar7;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(topBar, content, dVar5, oVar3, i11, i12));
        }
    }

    private static final float b(y3<h> y3Var) {
        return y3Var.getValue().getValue();
    }

    private static final float c(y3<h> y3Var) {
        return y3Var.getValue().getValue();
    }
}
