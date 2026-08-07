package k60;

import c60.h;
import jn0.h0;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p009i2.e1;
import p009i2.j1;
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
import p020r2.y2;
import v1.e0;
import wn0.p;
import wn0.q;
import z3.a0;
import z3.i0;
import z80.h1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "text", "Landroidx/compose/ui/d;", "modifier", "Lk60/e;", "style", "Ljn0/h0;", "a", "(Ljava/lang/String;Landroidx/compose/ui/d;Lk60/e;Lr2/l;II)V", "link_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f85133c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f85134d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f85135e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f85136f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f85137g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, androidx.compose.ui.d dVar, e eVar, int i11, int i12) {
            super(2);
            this.f85133c = str;
            this.f85134d = dVar;
            this.f85135e = eVar;
            this.f85136f = i11;
            this.f85137g = i12;
        }

        public final void a(l lVar, int i11) {
            d.a(this.f85133c, this.f85134d, this.f85135e, lVar, k2.a(this.f85136f | 1), this.f85137g);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:59:0x0108  */
    /* JADX WARN: Code duplicated, block: B:61:0x0116  */
    /* JADX WARN: Code duplicated, block: B:64:0x0186  */
    /* JADX WARN: Code duplicated, block: B:68:0x0192  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public static final void a(String text, androidx.compose.ui.d dVar, e eVar, l lVar, int i11, int i12) {
        int i13;
        androidx.compose.ui.d dVar2;
        int i14;
        e eVar2;
        int i15;
        androidx.compose.ui.d dVar3;
        e eVar3;
        int iA;
        wn0.a<b4.g> aVarA;
        l lVarA;
        p<b4.g, Integer, h0> pVarB;
        androidx.compose.ui.d dVar4;
        e eVar4;
        w2 w2VarX;
        s.k(text, "text");
        l lVarV = lVar.v(-779530573);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (lVarV.n(text) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i16 = i12 & 2;
        if (i16 == 0) {
            if ((i11 & 112) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & 896) == 0) {
                    eVar2 = eVar;
                    if (lVarV.n(eVar2)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                if ((i13 & 731) == 146 || !lVarV.b()) {
                    if (i16 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        eVar3 = e.a.f85138a;
                    } else {
                        eVar3 = eVar2;
                    }
                    if (o.J()) {
                        o.S(-779530573, i13, -1, "com.stripe.android.link.ui.ErrorText (ErrorText.kt:72)");
                    }
                    j1 j1Var = j1.f74525a;
                    int i17 = j1.f74526b;
                    androidx.compose.ui.d dVarC = androidx.compose.foundation.b.c(dVar3, j60.d.b(j1Var, lVarV, i17).getErrorComponentBackground(), eVar3.b());
                    d3.c.InterfaceC1212c interfaceC1212cI = d3.c.INSTANCE.i();
                    lVarV.H(693286680);
                    i0 i0VarB = e0.b(v1.b.f117444a.f(), interfaceC1212cI, lVarV, 48);
                    lVarV.H(-1323940314);
                    iA = j.a(lVarV, 0);
                    x xVarC = lVarV.c();
                    b4.g.Companion companion = b4.g.INSTANCE;
                    aVarA = companion.a();
                    q<y2<b4.g>, l, Integer, h0> qVarA = a0.a(dVarC);
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
                    d4.b(lVarA, i0VarB, companion.c());
                    d4.b(lVarA, xVarC, companion.e());
                    pVarB = companion.b();
                    if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                    lVarV.H(2058660585);
                    v1.h0 h0Var = v1.h0.f117504a;
                    e1.a(e4.e.c(h.f18819a, lVarV, 0), null, eVar3.a(), j60.d.b(j1Var, lVarV, i17).getErrorText(), lVarV, 56, 0);
                    androidx.compose.ui.d dVar5 = dVar3;
                    h1.a(text, eVar3.c(), j60.d.b(j1Var, lVarV, i17).getErrorText(), eVar3.d(), lVarV, i13 & 14, 0);
                    lVarV.T();
                    lVarV.g();
                    lVarV.T();
                    lVarV.T();
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar5;
                    eVar4 = eVar3;
                } else {
                    lVarV.j();
                    dVar4 = dVar2;
                    eVar4 = eVar2;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new a(text, dVar4, eVar4, i11, i12));
                }
            }
            i13 |= KyberEngine.KyberPolyBytes;
            eVar2 = eVar;
            if ((i13 & 731) == 146) {
                if (i16 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    eVar3 = e.a.f85138a;
                } else {
                    eVar3 = eVar2;
                }
                if (o.J()) {
                    o.S(-779530573, i13, -1, "com.stripe.android.link.ui.ErrorText (ErrorText.kt:72)");
                }
                j1 j1Var2 = j1.f74525a;
                int i18 = j1.f74526b;
                androidx.compose.ui.d dVarC2 = androidx.compose.foundation.b.c(dVar3, j60.d.b(j1Var2, lVarV, i18).getErrorComponentBackground(), eVar3.b());
                d3.c.InterfaceC1212c interfaceC1212cI2 = d3.c.INSTANCE.i();
                lVarV.H(693286680);
                i0 i0VarB2 = e0.b(v1.b.f117444a.f(), interfaceC1212cI2, lVarV, 48);
                lVarV.H(-1323940314);
                iA = j.a(lVarV, 0);
                x xVarC2 = lVarV.c();
                b4.g.Companion companion2 = b4.g.INSTANCE;
                aVarA = companion2.a();
                q<y2<b4.g>, l, Integer, h0> qVarA2 = a0.a(dVarC2);
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
                d4.b(lVarA, i0VarB2, companion2.c());
                d4.b(lVarA, xVarC2, companion2.e());
                pVarB = companion2.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA2.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                v1.h0 h0Var2 = v1.h0.f117504a;
                e1.a(e4.e.c(h.f18819a, lVarV, 0), null, eVar3.a(), j60.d.b(j1Var2, lVarV, i18).getErrorText(), lVarV, 56, 0);
                androidx.compose.ui.d dVar6 = dVar3;
                h1.a(text, eVar3.c(), j60.d.b(j1Var2, lVarV, i18).getErrorText(), eVar3.d(), lVarV, i13 & 14, 0);
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar6;
                eVar4 = eVar3;
            } else {
                if (i16 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    eVar3 = e.a.f85138a;
                } else {
                    eVar3 = eVar2;
                }
                if (o.J()) {
                    o.S(-779530573, i13, -1, "com.stripe.android.link.ui.ErrorText (ErrorText.kt:72)");
                }
                j1 j1Var3 = j1.f74525a;
                int i19 = j1.f74526b;
                androidx.compose.ui.d dVarC3 = androidx.compose.foundation.b.c(dVar3, j60.d.b(j1Var3, lVarV, i19).getErrorComponentBackground(), eVar3.b());
                d3.c.InterfaceC1212c interfaceC1212cI3 = d3.c.INSTANCE.i();
                lVarV.H(693286680);
                i0 i0VarB3 = e0.b(v1.b.f117444a.f(), interfaceC1212cI3, lVarV, 48);
                lVarV.H(-1323940314);
                iA = j.a(lVarV, 0);
                x xVarC3 = lVarV.c();
                b4.g.Companion companion3 = b4.g.INSTANCE;
                aVarA = companion3.a();
                q<y2<b4.g>, l, Integer, h0> qVarA3 = a0.a(dVarC3);
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
                d4.b(lVarA, i0VarB3, companion3.c());
                d4.b(lVarA, xVarC3, companion3.e());
                pVarB = companion3.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA3.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                v1.h0 h0Var3 = v1.h0.f117504a;
                e1.a(e4.e.c(h.f18819a, lVarV, 0), null, eVar3.a(), j60.d.b(j1Var3, lVarV, i19).getErrorText(), lVarV, 56, 0);
                androidx.compose.ui.d dVar7 = dVar3;
                h1.a(text, eVar3.c(), j60.d.b(j1Var3, lVarV, i19).getErrorText(), eVar3.d(), lVarV, i13 & 14, 0);
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar7;
                eVar4 = eVar3;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new a(text, dVar4, eVar4, i11, i12));
            }
        }
        i13 |= 48;
        dVar2 = dVar;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & 896) == 0) {
                eVar2 = eVar;
                if (lVarV.n(eVar2)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            if ((i13 & 731) == 146) {
                if (i16 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    eVar3 = e.a.f85138a;
                } else {
                    eVar3 = eVar2;
                }
                if (o.J()) {
                    o.S(-779530573, i13, -1, "com.stripe.android.link.ui.ErrorText (ErrorText.kt:72)");
                }
                j1 j1Var4 = j1.f74525a;
                int i110 = j1.f74526b;
                androidx.compose.ui.d dVarC4 = androidx.compose.foundation.b.c(dVar3, j60.d.b(j1Var4, lVarV, i110).getErrorComponentBackground(), eVar3.b());
                d3.c.InterfaceC1212c interfaceC1212cI4 = d3.c.INSTANCE.i();
                lVarV.H(693286680);
                i0 i0VarB4 = e0.b(v1.b.f117444a.f(), interfaceC1212cI4, lVarV, 48);
                lVarV.H(-1323940314);
                iA = j.a(lVarV, 0);
                x xVarC4 = lVarV.c();
                b4.g.Companion companion4 = b4.g.INSTANCE;
                aVarA = companion4.a();
                q<y2<b4.g>, l, Integer, h0> qVarA4 = a0.a(dVarC4);
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
                d4.b(lVarA, i0VarB4, companion4.c());
                d4.b(lVarA, xVarC4, companion4.e());
                pVarB = companion4.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA4.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                v1.h0 h0Var4 = v1.h0.f117504a;
                e1.a(e4.e.c(h.f18819a, lVarV, 0), null, eVar3.a(), j60.d.b(j1Var4, lVarV, i110).getErrorText(), lVarV, 56, 0);
                androidx.compose.ui.d dVar8 = dVar3;
                h1.a(text, eVar3.c(), j60.d.b(j1Var4, lVarV, i110).getErrorText(), eVar3.d(), lVarV, i13 & 14, 0);
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar8;
                eVar4 = eVar3;
            } else {
                if (i16 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    eVar3 = e.a.f85138a;
                } else {
                    eVar3 = eVar2;
                }
                if (o.J()) {
                    o.S(-779530573, i13, -1, "com.stripe.android.link.ui.ErrorText (ErrorText.kt:72)");
                }
                j1 j1Var5 = j1.f74525a;
                int i111 = j1.f74526b;
                androidx.compose.ui.d dVarC5 = androidx.compose.foundation.b.c(dVar3, j60.d.b(j1Var5, lVarV, i111).getErrorComponentBackground(), eVar3.b());
                d3.c.InterfaceC1212c interfaceC1212cI5 = d3.c.INSTANCE.i();
                lVarV.H(693286680);
                i0 i0VarB5 = e0.b(v1.b.f117444a.f(), interfaceC1212cI5, lVarV, 48);
                lVarV.H(-1323940314);
                iA = j.a(lVarV, 0);
                x xVarC5 = lVarV.c();
                b4.g.Companion companion5 = b4.g.INSTANCE;
                aVarA = companion5.a();
                q<y2<b4.g>, l, Integer, h0> qVarA5 = a0.a(dVarC5);
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
                d4.b(lVarA, i0VarB5, companion5.c());
                d4.b(lVarA, xVarC5, companion5.e());
                pVarB = companion5.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA5.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                v1.h0 h0Var5 = v1.h0.f117504a;
                e1.a(e4.e.c(h.f18819a, lVarV, 0), null, eVar3.a(), j60.d.b(j1Var5, lVarV, i111).getErrorText(), lVarV, 56, 0);
                androidx.compose.ui.d dVar9 = dVar3;
                h1.a(text, eVar3.c(), j60.d.b(j1Var5, lVarV, i111).getErrorText(), eVar3.d(), lVarV, i13 & 14, 0);
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar9;
                eVar4 = eVar3;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new a(text, dVar4, eVar4, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        eVar2 = eVar;
        if ((i13 & 731) == 146) {
            if (i16 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i14 != 0) {
                eVar3 = e.a.f85138a;
            } else {
                eVar3 = eVar2;
            }
            if (o.J()) {
                o.S(-779530573, i13, -1, "com.stripe.android.link.ui.ErrorText (ErrorText.kt:72)");
            }
            j1 j1Var6 = j1.f74525a;
            int i112 = j1.f74526b;
            androidx.compose.ui.d dVarC6 = androidx.compose.foundation.b.c(dVar3, j60.d.b(j1Var6, lVarV, i112).getErrorComponentBackground(), eVar3.b());
            d3.c.InterfaceC1212c interfaceC1212cI6 = d3.c.INSTANCE.i();
            lVarV.H(693286680);
            i0 i0VarB6 = e0.b(v1.b.f117444a.f(), interfaceC1212cI6, lVarV, 48);
            lVarV.H(-1323940314);
            iA = j.a(lVarV, 0);
            x xVarC6 = lVarV.c();
            b4.g.Companion companion6 = b4.g.INSTANCE;
            aVarA = companion6.a();
            q<y2<b4.g>, l, Integer, h0> qVarA6 = a0.a(dVarC6);
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
            d4.b(lVarA, i0VarB6, companion6.c());
            d4.b(lVarA, xVarC6, companion6.e());
            pVarB = companion6.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA6.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.h0 h0Var6 = v1.h0.f117504a;
            e1.a(e4.e.c(h.f18819a, lVarV, 0), null, eVar3.a(), j60.d.b(j1Var6, lVarV, i112).getErrorText(), lVarV, 56, 0);
            androidx.compose.ui.d dVar10 = dVar3;
            h1.a(text, eVar3.c(), j60.d.b(j1Var6, lVarV, i112).getErrorText(), eVar3.d(), lVarV, i13 & 14, 0);
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            if (o.J()) {
                o.R();
            }
            dVar4 = dVar10;
            eVar4 = eVar3;
        } else {
            if (i16 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i14 != 0) {
                eVar3 = e.a.f85138a;
            } else {
                eVar3 = eVar2;
            }
            if (o.J()) {
                o.S(-779530573, i13, -1, "com.stripe.android.link.ui.ErrorText (ErrorText.kt:72)");
            }
            j1 j1Var7 = j1.f74525a;
            int i113 = j1.f74526b;
            androidx.compose.ui.d dVarC7 = androidx.compose.foundation.b.c(dVar3, j60.d.b(j1Var7, lVarV, i113).getErrorComponentBackground(), eVar3.b());
            d3.c.InterfaceC1212c interfaceC1212cI7 = d3.c.INSTANCE.i();
            lVarV.H(693286680);
            i0 i0VarB7 = e0.b(v1.b.f117444a.f(), interfaceC1212cI7, lVarV, 48);
            lVarV.H(-1323940314);
            iA = j.a(lVarV, 0);
            x xVarC7 = lVarV.c();
            b4.g.Companion companion7 = b4.g.INSTANCE;
            aVarA = companion7.a();
            q<y2<b4.g>, l, Integer, h0> qVarA7 = a0.a(dVarC7);
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
            d4.b(lVarA, i0VarB7, companion7.c());
            d4.b(lVarA, xVarC7, companion7.e());
            pVarB = companion7.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA7.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.h0 h0Var7 = v1.h0.f117504a;
            e1.a(e4.e.c(h.f18819a, lVarV, 0), null, eVar3.a(), j60.d.b(j1Var7, lVarV, i113).getErrorText(), lVarV, 56, 0);
            androidx.compose.ui.d dVar11 = dVar3;
            h1.a(text, eVar3.c(), j60.d.b(j1Var7, lVarV, i113).getErrorText(), eVar3.d(), lVarV, i13 & 14, 0);
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            if (o.J()) {
                o.R();
            }
            dVar4 = dVar11;
            eVar4 = eVar3;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(text, dVar4, eVar4, i11, i12));
        }
    }
}
