package p010i90;

import androidx.compose.foundation.layout.t;
import androidx.compose.foundation.layout.x;
import androidx.compose.ui.d;
import b4.g;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d3.c;
import d3.i;
import g4.v;
import g4.y;
import jn0.h0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.d4;
import p020r2.j;
import p020r2.k2;
import p020r2.o;
import p020r2.w2;
import p020r2.y2;
import v1.e0;
import w4.h;
import wn0.p;
import wn0.q;
import z3.a0;
import z3.i0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aW\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "", "automationTestTag", "", "isChecked", AnnotatedPrivateKey.LABEL, "isEnabled", "Lkotlin/Function1;", "Ljn0/h0;", "onValueChange", "a", "(Landroidx/compose/ui/d;Ljava/lang/String;ZLjava/lang/String;ZLwn0/l;Lr2/l;II)V", "stripe-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class l {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.l<y, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f76669c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f76670d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2) {
            super(1);
            this.f76669c = str;
            this.f76670d = str2;
        }

        public final void a(y semantics) {
            s.k(semantics, "$this$semantics");
            v.q0(semantics, this.f76669c);
            v.p0(semantics, this.f76670d);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(y yVar) {
            a(yVar);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f76671c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f76672d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f76673e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f76674f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f76675g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ wn0.l<Boolean, h0> f76676h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f76677i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f76678j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(d dVar, String str, boolean z11, String str2, boolean z12, wn0.l<? super Boolean, h0> lVar, int i11, int i12) {
            super(2);
            this.f76671c = dVar;
            this.f76672d = str;
            this.f76673e = z11;
            this.f76674f = str2;
            this.f76675g = z12;
            this.f76676h = lVar;
            this.f76677i = i11;
            this.f76678j = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            l.a(this.f76671c, this.f76672d, this.f76673e, this.f76674f, this.f76675g, this.f76676h, lVar, k2.a(this.f76677i | 1), this.f76678j);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0137  */
    /* JADX WARN: Code duplicated, block: B:104:0x0195  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:108:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:111:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:117:0x021a  */
    /* JADX WARN: Code duplicated, block: B:120:0x0253  */
    /* JADX WARN: Code duplicated, block: B:124:0x0262  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00db  */
    /* JADX WARN: Code duplicated, block: B:76:0x00de  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:91:0x0100  */
    /* JADX WARN: Code duplicated, block: B:92:0x0103  */
    /* JADX WARN: Code duplicated, block: B:95:0x0121  */
    /* JADX WARN: Code duplicated, block: B:96:0x0123  */
    /* JADX WARN: Code duplicated, block: B:99:0x012f  */
    public static final void a(d dVar, String str, boolean z11, String str2, boolean z12, wn0.l<? super Boolean, h0> onValueChange, p020r2.l lVar, int i11, int i12) {
        d dVar2;
        int i13;
        String str3;
        int i14;
        boolean z13;
        int i15;
        int i16;
        String str4;
        int i17;
        int i18;
        boolean z14;
        int i19;
        int i21;
        d dVar3;
        String str5;
        String str6;
        int i22;
        String strC;
        float f11;
        boolean z15;
        boolean zN;
        Object objI;
        c.Companion companion;
        int iA;
        wn0.a<g> aVarA;
        p020r2.l lVarA;
        p<g, Integer, h0> pVarB;
        v1.h0 h0Var;
        String str7;
        String str8;
        boolean z16;
        boolean z17;
        d dVar4;
        w2 w2VarX;
        s.k(onValueChange, "onValueChange");
        p020r2.l lVarV = lVar.v(1416537179);
        int i23 = i12 & 1;
        if (i23 != 0) {
            i13 = i11 | 6;
            dVar2 = dVar;
        } else if ((i11 & 14) == 0) {
            dVar2 = dVar;
            i13 = (lVarV.n(dVar2) ? 4 : 2) | i11;
        } else {
            dVar2 = dVar;
            i13 = i11;
        }
        int i24 = i12 & 2;
        if (i24 == 0) {
            if ((i11 & 112) == 0) {
                str3 = str;
                i13 |= lVarV.n(str3) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & 896) == 0) {
                    z13 = z11;
                    if (lVarV.p(z13)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 8;
                if (i16 != 0) {
                    if ((i11 & 7168) == 0) {
                        str4 = str2;
                        if (lVarV.n(str4)) {
                            i17 = 2048;
                        } else {
                            i17 = 1024;
                        }
                        i13 |= i17;
                    }
                    i18 = i12 & 16;
                    if (i18 != 0) {
                        i13 |= 24576;
                        z14 = z12;
                    } else {
                        z14 = z12;
                        if ((i11 & 57344) == 0) {
                            if (lVarV.p(z14)) {
                                i19 = 16384;
                            } else {
                                i19 = PKIFailureInfo.certRevoked;
                            }
                            i13 |= i19;
                        }
                    }
                    if ((i12 & 32) != 0) {
                        if ((i11 & 458752) == 0) {
                            if (lVarV.K(onValueChange)) {
                                i21 = 131072;
                            } else {
                                i21 = 65536;
                            }
                        }
                        if ((i13 & 374491) == 74898 || !lVarV.b()) {
                            if (i23 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i24 != 0) {
                                str5 = "";
                            } else {
                                str5 = str3;
                            }
                            if (i14 != 0) {
                                z13 = false;
                            }
                            if (i16 != 0) {
                                str6 = null;
                            } else {
                                str6 = str4;
                            }
                            if (i18 != 0) {
                                z14 = false;
                            }
                            if (o.J()) {
                                o.S(1416537179, i13, -1, "com.stripe.android.uicore.elements.CheckboxElementUI (CheckboxElementUI.kt:28)");
                            }
                            if (z13) {
                                i22 = i.f59326l;
                            } else {
                                i22 = i.f59323i;
                            }
                            strC = e4.i.c(i22, lVarV, 0);
                            f11 = 4;
                            d dVarK = t.k(dVar3, BitmapDescriptorFactory.HUE_RED, h.g(f11), 1, null);
                            lVarV.H(-1271039659);
                            if ((i13 & 112) == 32) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            zN = z15 | lVarV.n(strC);
                            objI = lVarV.I();
                            if (zN || objI == p020r2.l.INSTANCE.a()) {
                                objI = new a(str5, strC);
                                lVarV.B(objI);
                            }
                            lVarV.T();
                            d dVarH = x.h(androidx.compose.foundation.selection.c.b(g4.o.d(dVarK, false, (wn0.l) objI, 1, null), z13, z14, g4.i.h(g4.i.INSTANCE.b()), onValueChange), BitmapDescriptorFactory.HUE_RED, 1, null);
                            companion = c.INSTANCE;
                            c.InterfaceC1212c interfaceC1212cI = companion.i();
                            lVarV.H(693286680);
                            i0 i0VarB = e0.b(v1.b.f117444a.f(), interfaceC1212cI, lVarV, 48);
                            lVarV.H(-1323940314);
                            iA = j.a(lVarV, 0);
                            p020r2.x xVarC = lVarV.c();
                            g.Companion companion2 = g.INSTANCE;
                            aVarA = companion2.a();
                            q<y2<g>, p020r2.l, Integer, h0> qVarA = a0.a(dVarH);
                            if (lVarV.w() == null) {
                                j.c();
                            }
                            lVarV.h();
                            if (lVarV.u()) {
                                lVarV.z(aVarA);
                            } else {
                                lVarV.d();
                            }
                            lVarA = d4.a(lVarV);
                            d dVar5 = dVar3;
                            d4.b(lVarA, i0VarB, companion2.c());
                            d4.b(lVarA, xVarC, companion2.e());
                            pVarB = companion2.b();
                            if (lVarA.u() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                                lVarA.B(Integer.valueOf(iA));
                                lVarA.f(Integer.valueOf(iA), pVarB);
                            }
                            qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                            lVarV.H(2058660585);
                            h0Var = v1.h0.f117504a;
                            boolean z18 = z13;
                            boolean z19 = z14;
                            l90.a.a(z18, null, null, z19, lVarV, ((i13 >> 6) & 14) | 48 | ((i13 >> 3) & 7168), 4);
                            lVarV.H(2045524722);
                            if (str6 != null) {
                                f0.a(str6, h0Var.b(t.m(d.INSTANCE, h.g(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), companion.i()), lVarV, (i13 >> 9) & 14, 0);
                            }
                            lVarV.T();
                            lVarV.T();
                            lVarV.g();
                            lVarV.T();
                            lVarV.T();
                            if (o.J()) {
                                o.R();
                            }
                            str7 = str5;
                            str8 = str6;
                            z16 = z18;
                            z17 = z19;
                            dVar4 = dVar5;
                        } else {
                            lVarV.j();
                            dVar4 = dVar2;
                            z17 = z14;
                            str7 = str3;
                            z16 = z13;
                            str8 = str4;
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new b(dVar4, str7, z16, str8, z17, onValueChange, i11, i12));
                        }
                    }
                    i21 = 196608;
                    i13 |= i21;
                    if ((i13 & 374491) == 74898) {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i24 != 0) {
                            str5 = "";
                        } else {
                            str5 = str3;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        }
                        if (i16 != 0) {
                            str6 = null;
                        } else {
                            str6 = str4;
                        }
                        if (i18 != 0) {
                            z14 = false;
                        }
                        if (o.J()) {
                            o.S(1416537179, i13, -1, "com.stripe.android.uicore.elements.CheckboxElementUI (CheckboxElementUI.kt:28)");
                        }
                        if (z13) {
                            i22 = i.f59326l;
                        } else {
                            i22 = i.f59323i;
                        }
                        strC = e4.i.c(i22, lVarV, 0);
                        f11 = 4;
                        d dVarK2 = t.k(dVar3, BitmapDescriptorFactory.HUE_RED, h.g(f11), 1, null);
                        lVarV.H(-1271039659);
                        if ((i13 & 112) == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zN = z15 | lVarV.n(strC);
                        objI = lVarV.I();
                        if (zN) {
                            objI = new a(str5, strC);
                            lVarV.B(objI);
                        } else {
                            objI = new a(str5, strC);
                            lVarV.B(objI);
                        }
                        lVarV.T();
                        d dVarH2 = x.h(androidx.compose.foundation.selection.c.b(g4.o.d(dVarK2, false, (wn0.l) objI, 1, null), z13, z14, g4.i.h(g4.i.INSTANCE.b()), onValueChange), BitmapDescriptorFactory.HUE_RED, 1, null);
                        companion = c.INSTANCE;
                        c.InterfaceC1212c interfaceC1212cI2 = companion.i();
                        lVarV.H(693286680);
                        i0 i0VarB2 = e0.b(v1.b.f117444a.f(), interfaceC1212cI2, lVarV, 48);
                        lVarV.H(-1323940314);
                        iA = j.a(lVarV, 0);
                        p020r2.x xVarC2 = lVarV.c();
                        g.Companion companion3 = g.INSTANCE;
                        aVarA = companion3.a();
                        q<y2<g>, p020r2.l, Integer, h0> qVarA2 = a0.a(dVarH2);
                        if (lVarV.w() == null) {
                            j.c();
                        }
                        lVarV.h();
                        if (lVarV.u()) {
                            lVarV.z(aVarA);
                        } else {
                            lVarV.d();
                        }
                        lVarA = d4.a(lVarV);
                        d dVar6 = dVar3;
                        d4.b(lVarA, i0VarB2, companion3.c());
                        d4.b(lVarA, xVarC2, companion3.e());
                        pVarB = companion3.b();
                        if (lVarA.u()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        qVarA2.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                        lVarV.H(2058660585);
                        h0Var = v1.h0.f117504a;
                        boolean z110 = z13;
                        boolean z111 = z14;
                        l90.a.a(z110, null, null, z111, lVarV, ((i13 >> 6) & 14) | 48 | ((i13 >> 3) & 7168), 4);
                        lVarV.H(2045524722);
                        if (str6 != null) {
                            f0.a(str6, h0Var.b(t.m(d.INSTANCE, h.g(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), companion.i()), lVarV, (i13 >> 9) & 14, 0);
                        }
                        lVarV.T();
                        lVarV.T();
                        lVarV.g();
                        lVarV.T();
                        lVarV.T();
                        if (o.J()) {
                            o.R();
                        }
                        str7 = str5;
                        str8 = str6;
                        z16 = z110;
                        z17 = z111;
                        dVar4 = dVar6;
                    } else {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i24 != 0) {
                            str5 = "";
                        } else {
                            str5 = str3;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        }
                        if (i16 != 0) {
                            str6 = null;
                        } else {
                            str6 = str4;
                        }
                        if (i18 != 0) {
                            z14 = false;
                        }
                        if (o.J()) {
                            o.S(1416537179, i13, -1, "com.stripe.android.uicore.elements.CheckboxElementUI (CheckboxElementUI.kt:28)");
                        }
                        if (z13) {
                            i22 = i.f59326l;
                        } else {
                            i22 = i.f59323i;
                        }
                        strC = e4.i.c(i22, lVarV, 0);
                        f11 = 4;
                        d dVarK3 = t.k(dVar3, BitmapDescriptorFactory.HUE_RED, h.g(f11), 1, null);
                        lVarV.H(-1271039659);
                        if ((i13 & 112) == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zN = z15 | lVarV.n(strC);
                        objI = lVarV.I();
                        if (zN) {
                            objI = new a(str5, strC);
                            lVarV.B(objI);
                        } else {
                            objI = new a(str5, strC);
                            lVarV.B(objI);
                        }
                        lVarV.T();
                        d dVarH3 = x.h(androidx.compose.foundation.selection.c.b(g4.o.d(dVarK3, false, (wn0.l) objI, 1, null), z13, z14, g4.i.h(g4.i.INSTANCE.b()), onValueChange), BitmapDescriptorFactory.HUE_RED, 1, null);
                        companion = c.INSTANCE;
                        c.InterfaceC1212c interfaceC1212cI3 = companion.i();
                        lVarV.H(693286680);
                        i0 i0VarB3 = e0.b(v1.b.f117444a.f(), interfaceC1212cI3, lVarV, 48);
                        lVarV.H(-1323940314);
                        iA = j.a(lVarV, 0);
                        p020r2.x xVarC3 = lVarV.c();
                        g.Companion companion4 = g.INSTANCE;
                        aVarA = companion4.a();
                        q<y2<g>, p020r2.l, Integer, h0> qVarA3 = a0.a(dVarH3);
                        if (lVarV.w() == null) {
                            j.c();
                        }
                        lVarV.h();
                        if (lVarV.u()) {
                            lVarV.z(aVarA);
                        } else {
                            lVarV.d();
                        }
                        lVarA = d4.a(lVarV);
                        d dVar7 = dVar3;
                        d4.b(lVarA, i0VarB3, companion4.c());
                        d4.b(lVarA, xVarC3, companion4.e());
                        pVarB = companion4.b();
                        if (lVarA.u()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        qVarA3.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                        lVarV.H(2058660585);
                        h0Var = v1.h0.f117504a;
                        boolean z112 = z13;
                        boolean z113 = z14;
                        l90.a.a(z112, null, null, z113, lVarV, ((i13 >> 6) & 14) | 48 | ((i13 >> 3) & 7168), 4);
                        lVarV.H(2045524722);
                        if (str6 != null) {
                            f0.a(str6, h0Var.b(t.m(d.INSTANCE, h.g(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), companion.i()), lVarV, (i13 >> 9) & 14, 0);
                        }
                        lVarV.T();
                        lVarV.T();
                        lVarV.g();
                        lVarV.T();
                        lVarV.T();
                        if (o.J()) {
                            o.R();
                        }
                        str7 = str5;
                        str8 = str6;
                        z16 = z112;
                        z17 = z113;
                        dVar4 = dVar7;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(dVar4, str7, z16, str8, z17, onValueChange, i11, i12));
                    }
                }
                i13 |= 3072;
                str4 = str2;
                i18 = i12 & 16;
                if (i18 != 0) {
                    i13 |= 24576;
                    z14 = z12;
                } else {
                    z14 = z12;
                    if ((i11 & 57344) == 0) {
                        if (lVarV.p(z14)) {
                            i19 = 16384;
                        } else {
                            i19 = PKIFailureInfo.certRevoked;
                        }
                        i13 |= i19;
                    }
                }
                if ((i12 & 32) != 0) {
                    if ((i11 & 458752) == 0) {
                        if (lVarV.K(onValueChange)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                    }
                    if ((i13 & 374491) == 74898) {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i24 != 0) {
                            str5 = "";
                        } else {
                            str5 = str3;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        }
                        if (i16 != 0) {
                            str6 = null;
                        } else {
                            str6 = str4;
                        }
                        if (i18 != 0) {
                            z14 = false;
                        }
                        if (o.J()) {
                            o.S(1416537179, i13, -1, "com.stripe.android.uicore.elements.CheckboxElementUI (CheckboxElementUI.kt:28)");
                        }
                        if (z13) {
                            i22 = i.f59326l;
                        } else {
                            i22 = i.f59323i;
                        }
                        strC = e4.i.c(i22, lVarV, 0);
                        f11 = 4;
                        d dVarK4 = t.k(dVar3, BitmapDescriptorFactory.HUE_RED, h.g(f11), 1, null);
                        lVarV.H(-1271039659);
                        if ((i13 & 112) == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zN = z15 | lVarV.n(strC);
                        objI = lVarV.I();
                        if (zN) {
                            objI = new a(str5, strC);
                            lVarV.B(objI);
                        } else {
                            objI = new a(str5, strC);
                            lVarV.B(objI);
                        }
                        lVarV.T();
                        d dVarH4 = x.h(androidx.compose.foundation.selection.c.b(g4.o.d(dVarK4, false, (wn0.l) objI, 1, null), z13, z14, g4.i.h(g4.i.INSTANCE.b()), onValueChange), BitmapDescriptorFactory.HUE_RED, 1, null);
                        companion = c.INSTANCE;
                        c.InterfaceC1212c interfaceC1212cI4 = companion.i();
                        lVarV.H(693286680);
                        i0 i0VarB4 = e0.b(v1.b.f117444a.f(), interfaceC1212cI4, lVarV, 48);
                        lVarV.H(-1323940314);
                        iA = j.a(lVarV, 0);
                        p020r2.x xVarC4 = lVarV.c();
                        g.Companion companion5 = g.INSTANCE;
                        aVarA = companion5.a();
                        q<y2<g>, p020r2.l, Integer, h0> qVarA4 = a0.a(dVarH4);
                        if (lVarV.w() == null) {
                            j.c();
                        }
                        lVarV.h();
                        if (lVarV.u()) {
                            lVarV.z(aVarA);
                        } else {
                            lVarV.d();
                        }
                        lVarA = d4.a(lVarV);
                        d dVar8 = dVar3;
                        d4.b(lVarA, i0VarB4, companion5.c());
                        d4.b(lVarA, xVarC4, companion5.e());
                        pVarB = companion5.b();
                        if (lVarA.u()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        qVarA4.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                        lVarV.H(2058660585);
                        h0Var = v1.h0.f117504a;
                        boolean z114 = z13;
                        boolean z115 = z14;
                        l90.a.a(z114, null, null, z115, lVarV, ((i13 >> 6) & 14) | 48 | ((i13 >> 3) & 7168), 4);
                        lVarV.H(2045524722);
                        if (str6 != null) {
                            f0.a(str6, h0Var.b(t.m(d.INSTANCE, h.g(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), companion.i()), lVarV, (i13 >> 9) & 14, 0);
                        }
                        lVarV.T();
                        lVarV.T();
                        lVarV.g();
                        lVarV.T();
                        lVarV.T();
                        if (o.J()) {
                            o.R();
                        }
                        str7 = str5;
                        str8 = str6;
                        z16 = z114;
                        z17 = z115;
                        dVar4 = dVar8;
                    } else {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i24 != 0) {
                            str5 = "";
                        } else {
                            str5 = str3;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        }
                        if (i16 != 0) {
                            str6 = null;
                        } else {
                            str6 = str4;
                        }
                        if (i18 != 0) {
                            z14 = false;
                        }
                        if (o.J()) {
                            o.S(1416537179, i13, -1, "com.stripe.android.uicore.elements.CheckboxElementUI (CheckboxElementUI.kt:28)");
                        }
                        if (z13) {
                            i22 = i.f59326l;
                        } else {
                            i22 = i.f59323i;
                        }
                        strC = e4.i.c(i22, lVarV, 0);
                        f11 = 4;
                        d dVarK5 = t.k(dVar3, BitmapDescriptorFactory.HUE_RED, h.g(f11), 1, null);
                        lVarV.H(-1271039659);
                        if ((i13 & 112) == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zN = z15 | lVarV.n(strC);
                        objI = lVarV.I();
                        if (zN) {
                            objI = new a(str5, strC);
                            lVarV.B(objI);
                        } else {
                            objI = new a(str5, strC);
                            lVarV.B(objI);
                        }
                        lVarV.T();
                        d dVarH5 = x.h(androidx.compose.foundation.selection.c.b(g4.o.d(dVarK5, false, (wn0.l) objI, 1, null), z13, z14, g4.i.h(g4.i.INSTANCE.b()), onValueChange), BitmapDescriptorFactory.HUE_RED, 1, null);
                        companion = c.INSTANCE;
                        c.InterfaceC1212c interfaceC1212cI5 = companion.i();
                        lVarV.H(693286680);
                        i0 i0VarB5 = e0.b(v1.b.f117444a.f(), interfaceC1212cI5, lVarV, 48);
                        lVarV.H(-1323940314);
                        iA = j.a(lVarV, 0);
                        p020r2.x xVarC5 = lVarV.c();
                        g.Companion companion6 = g.INSTANCE;
                        aVarA = companion6.a();
                        q<y2<g>, p020r2.l, Integer, h0> qVarA5 = a0.a(dVarH5);
                        if (lVarV.w() == null) {
                            j.c();
                        }
                        lVarV.h();
                        if (lVarV.u()) {
                            lVarV.z(aVarA);
                        } else {
                            lVarV.d();
                        }
                        lVarA = d4.a(lVarV);
                        d dVar9 = dVar3;
                        d4.b(lVarA, i0VarB5, companion6.c());
                        d4.b(lVarA, xVarC5, companion6.e());
                        pVarB = companion6.b();
                        if (lVarA.u()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        qVarA5.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                        lVarV.H(2058660585);
                        h0Var = v1.h0.f117504a;
                        boolean z116 = z13;
                        boolean z117 = z14;
                        l90.a.a(z116, null, null, z117, lVarV, ((i13 >> 6) & 14) | 48 | ((i13 >> 3) & 7168), 4);
                        lVarV.H(2045524722);
                        if (str6 != null) {
                            f0.a(str6, h0Var.b(t.m(d.INSTANCE, h.g(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), companion.i()), lVarV, (i13 >> 9) & 14, 0);
                        }
                        lVarV.T();
                        lVarV.T();
                        lVarV.g();
                        lVarV.T();
                        lVarV.T();
                        if (o.J()) {
                            o.R();
                        }
                        str7 = str5;
                        str8 = str6;
                        z16 = z116;
                        z17 = z117;
                        dVar4 = dVar9;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(dVar4, str7, z16, str8, z17, onValueChange, i11, i12));
                    }
                }
                i21 = 196608;
                i13 |= i21;
                if ((i13 & 374491) == 74898) {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i24 != 0) {
                        str5 = "";
                    } else {
                        str5 = str3;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    }
                    if (i16 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (i18 != 0) {
                        z14 = false;
                    }
                    if (o.J()) {
                        o.S(1416537179, i13, -1, "com.stripe.android.uicore.elements.CheckboxElementUI (CheckboxElementUI.kt:28)");
                    }
                    if (z13) {
                        i22 = i.f59326l;
                    } else {
                        i22 = i.f59323i;
                    }
                    strC = e4.i.c(i22, lVarV, 0);
                    f11 = 4;
                    d dVarK6 = t.k(dVar3, BitmapDescriptorFactory.HUE_RED, h.g(f11), 1, null);
                    lVarV.H(-1271039659);
                    if ((i13 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zN = z15 | lVarV.n(strC);
                    objI = lVarV.I();
                    if (zN) {
                        objI = new a(str5, strC);
                        lVarV.B(objI);
                    } else {
                        objI = new a(str5, strC);
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    d dVarH6 = x.h(androidx.compose.foundation.selection.c.b(g4.o.d(dVarK6, false, (wn0.l) objI, 1, null), z13, z14, g4.i.h(g4.i.INSTANCE.b()), onValueChange), BitmapDescriptorFactory.HUE_RED, 1, null);
                    companion = c.INSTANCE;
                    c.InterfaceC1212c interfaceC1212cI6 = companion.i();
                    lVarV.H(693286680);
                    i0 i0VarB6 = e0.b(v1.b.f117444a.f(), interfaceC1212cI6, lVarV, 48);
                    lVarV.H(-1323940314);
                    iA = j.a(lVarV, 0);
                    p020r2.x xVarC6 = lVarV.c();
                    g.Companion companion7 = g.INSTANCE;
                    aVarA = companion7.a();
                    q<y2<g>, p020r2.l, Integer, h0> qVarA6 = a0.a(dVarH6);
                    if (lVarV.w() == null) {
                        j.c();
                    }
                    lVarV.h();
                    if (lVarV.u()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d dVar10 = dVar3;
                    d4.b(lVarA, i0VarB6, companion7.c());
                    d4.b(lVarA, xVarC6, companion7.e());
                    pVarB = companion7.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    qVarA6.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                    lVarV.H(2058660585);
                    h0Var = v1.h0.f117504a;
                    boolean z118 = z13;
                    boolean z119 = z14;
                    l90.a.a(z118, null, null, z119, lVarV, ((i13 >> 6) & 14) | 48 | ((i13 >> 3) & 7168), 4);
                    lVarV.H(2045524722);
                    if (str6 != null) {
                        f0.a(str6, h0Var.b(t.m(d.INSTANCE, h.g(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), companion.i()), lVarV, (i13 >> 9) & 14, 0);
                    }
                    lVarV.T();
                    lVarV.T();
                    lVarV.g();
                    lVarV.T();
                    lVarV.T();
                    if (o.J()) {
                        o.R();
                    }
                    str7 = str5;
                    str8 = str6;
                    z16 = z118;
                    z17 = z119;
                    dVar4 = dVar10;
                } else {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i24 != 0) {
                        str5 = "";
                    } else {
                        str5 = str3;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    }
                    if (i16 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (i18 != 0) {
                        z14 = false;
                    }
                    if (o.J()) {
                        o.S(1416537179, i13, -1, "com.stripe.android.uicore.elements.CheckboxElementUI (CheckboxElementUI.kt:28)");
                    }
                    if (z13) {
                        i22 = i.f59326l;
                    } else {
                        i22 = i.f59323i;
                    }
                    strC = e4.i.c(i22, lVarV, 0);
                    f11 = 4;
                    d dVarK7 = t.k(dVar3, BitmapDescriptorFactory.HUE_RED, h.g(f11), 1, null);
                    lVarV.H(-1271039659);
                    if ((i13 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zN = z15 | lVarV.n(strC);
                    objI = lVarV.I();
                    if (zN) {
                        objI = new a(str5, strC);
                        lVarV.B(objI);
                    } else {
                        objI = new a(str5, strC);
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    d dVarH7 = x.h(androidx.compose.foundation.selection.c.b(g4.o.d(dVarK7, false, (wn0.l) objI, 1, null), z13, z14, g4.i.h(g4.i.INSTANCE.b()), onValueChange), BitmapDescriptorFactory.HUE_RED, 1, null);
                    companion = c.INSTANCE;
                    c.InterfaceC1212c interfaceC1212cI7 = companion.i();
                    lVarV.H(693286680);
                    i0 i0VarB7 = e0.b(v1.b.f117444a.f(), interfaceC1212cI7, lVarV, 48);
                    lVarV.H(-1323940314);
                    iA = j.a(lVarV, 0);
                    p020r2.x xVarC7 = lVarV.c();
                    g.Companion companion8 = g.INSTANCE;
                    aVarA = companion8.a();
                    q<y2<g>, p020r2.l, Integer, h0> qVarA7 = a0.a(dVarH7);
                    if (lVarV.w() == null) {
                        j.c();
                    }
                    lVarV.h();
                    if (lVarV.u()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d dVar11 = dVar3;
                    d4.b(lVarA, i0VarB7, companion8.c());
                    d4.b(lVarA, xVarC7, companion8.e());
                    pVarB = companion8.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    qVarA7.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                    lVarV.H(2058660585);
                    h0Var = v1.h0.f117504a;
                    boolean z1110 = z13;
                    boolean z1111 = z14;
                    l90.a.a(z1110, null, null, z1111, lVarV, ((i13 >> 6) & 14) | 48 | ((i13 >> 3) & 7168), 4);
                    lVarV.H(2045524722);
                    if (str6 != null) {
                        f0.a(str6, h0Var.b(t.m(d.INSTANCE, h.g(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), companion.i()), lVarV, (i13 >> 9) & 14, 0);
                    }
                    lVarV.T();
                    lVarV.T();
                    lVarV.g();
                    lVarV.T();
                    lVarV.T();
                    if (o.J()) {
                        o.R();
                    }
                    str7 = str5;
                    str8 = str6;
                    z16 = z1110;
                    z17 = z1111;
                    dVar4 = dVar11;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(dVar4, str7, z16, str8, z17, onValueChange, i11, i12));
                }
            }
            i13 |= KyberEngine.KyberPolyBytes;
            z13 = z11;
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 7168) == 0) {
                    str4 = str2;
                    if (lVarV.n(str4)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 16;
                if (i18 != 0) {
                    i13 |= 24576;
                    z14 = z12;
                } else {
                    z14 = z12;
                    if ((i11 & 57344) == 0) {
                        if (lVarV.p(z14)) {
                            i19 = 16384;
                        } else {
                            i19 = PKIFailureInfo.certRevoked;
                        }
                        i13 |= i19;
                    }
                }
                if ((i12 & 32) != 0) {
                    if ((i11 & 458752) == 0) {
                        if (lVarV.K(onValueChange)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                    }
                    if ((i13 & 374491) == 74898) {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i24 != 0) {
                            str5 = "";
                        } else {
                            str5 = str3;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        }
                        if (i16 != 0) {
                            str6 = null;
                        } else {
                            str6 = str4;
                        }
                        if (i18 != 0) {
                            z14 = false;
                        }
                        if (o.J()) {
                            o.S(1416537179, i13, -1, "com.stripe.android.uicore.elements.CheckboxElementUI (CheckboxElementUI.kt:28)");
                        }
                        if (z13) {
                            i22 = i.f59326l;
                        } else {
                            i22 = i.f59323i;
                        }
                        strC = e4.i.c(i22, lVarV, 0);
                        f11 = 4;
                        d dVarK8 = t.k(dVar3, BitmapDescriptorFactory.HUE_RED, h.g(f11), 1, null);
                        lVarV.H(-1271039659);
                        if ((i13 & 112) == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zN = z15 | lVarV.n(strC);
                        objI = lVarV.I();
                        if (zN) {
                            objI = new a(str5, strC);
                            lVarV.B(objI);
                        } else {
                            objI = new a(str5, strC);
                            lVarV.B(objI);
                        }
                        lVarV.T();
                        d dVarH8 = x.h(androidx.compose.foundation.selection.c.b(g4.o.d(dVarK8, false, (wn0.l) objI, 1, null), z13, z14, g4.i.h(g4.i.INSTANCE.b()), onValueChange), BitmapDescriptorFactory.HUE_RED, 1, null);
                        companion = c.INSTANCE;
                        c.InterfaceC1212c interfaceC1212cI8 = companion.i();
                        lVarV.H(693286680);
                        i0 i0VarB8 = e0.b(v1.b.f117444a.f(), interfaceC1212cI8, lVarV, 48);
                        lVarV.H(-1323940314);
                        iA = j.a(lVarV, 0);
                        p020r2.x xVarC8 = lVarV.c();
                        g.Companion companion9 = g.INSTANCE;
                        aVarA = companion9.a();
                        q<y2<g>, p020r2.l, Integer, h0> qVarA8 = a0.a(dVarH8);
                        if (lVarV.w() == null) {
                            j.c();
                        }
                        lVarV.h();
                        if (lVarV.u()) {
                            lVarV.z(aVarA);
                        } else {
                            lVarV.d();
                        }
                        lVarA = d4.a(lVarV);
                        d dVar12 = dVar3;
                        d4.b(lVarA, i0VarB8, companion9.c());
                        d4.b(lVarA, xVarC8, companion9.e());
                        pVarB = companion9.b();
                        if (lVarA.u()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        qVarA8.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                        lVarV.H(2058660585);
                        h0Var = v1.h0.f117504a;
                        boolean z1112 = z13;
                        boolean z1113 = z14;
                        l90.a.a(z1112, null, null, z1113, lVarV, ((i13 >> 6) & 14) | 48 | ((i13 >> 3) & 7168), 4);
                        lVarV.H(2045524722);
                        if (str6 != null) {
                            f0.a(str6, h0Var.b(t.m(d.INSTANCE, h.g(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), companion.i()), lVarV, (i13 >> 9) & 14, 0);
                        }
                        lVarV.T();
                        lVarV.T();
                        lVarV.g();
                        lVarV.T();
                        lVarV.T();
                        if (o.J()) {
                            o.R();
                        }
                        str7 = str5;
                        str8 = str6;
                        z16 = z1112;
                        z17 = z1113;
                        dVar4 = dVar12;
                    } else {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i24 != 0) {
                            str5 = "";
                        } else {
                            str5 = str3;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        }
                        if (i16 != 0) {
                            str6 = null;
                        } else {
                            str6 = str4;
                        }
                        if (i18 != 0) {
                            z14 = false;
                        }
                        if (o.J()) {
                            o.S(1416537179, i13, -1, "com.stripe.android.uicore.elements.CheckboxElementUI (CheckboxElementUI.kt:28)");
                        }
                        if (z13) {
                            i22 = i.f59326l;
                        } else {
                            i22 = i.f59323i;
                        }
                        strC = e4.i.c(i22, lVarV, 0);
                        f11 = 4;
                        d dVarK9 = t.k(dVar3, BitmapDescriptorFactory.HUE_RED, h.g(f11), 1, null);
                        lVarV.H(-1271039659);
                        if ((i13 & 112) == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zN = z15 | lVarV.n(strC);
                        objI = lVarV.I();
                        if (zN) {
                            objI = new a(str5, strC);
                            lVarV.B(objI);
                        } else {
                            objI = new a(str5, strC);
                            lVarV.B(objI);
                        }
                        lVarV.T();
                        d dVarH9 = x.h(androidx.compose.foundation.selection.c.b(g4.o.d(dVarK9, false, (wn0.l) objI, 1, null), z13, z14, g4.i.h(g4.i.INSTANCE.b()), onValueChange), BitmapDescriptorFactory.HUE_RED, 1, null);
                        companion = c.INSTANCE;
                        c.InterfaceC1212c interfaceC1212cI9 = companion.i();
                        lVarV.H(693286680);
                        i0 i0VarB9 = e0.b(v1.b.f117444a.f(), interfaceC1212cI9, lVarV, 48);
                        lVarV.H(-1323940314);
                        iA = j.a(lVarV, 0);
                        p020r2.x xVarC9 = lVarV.c();
                        g.Companion companion10 = g.INSTANCE;
                        aVarA = companion10.a();
                        q<y2<g>, p020r2.l, Integer, h0> qVarA9 = a0.a(dVarH9);
                        if (lVarV.w() == null) {
                            j.c();
                        }
                        lVarV.h();
                        if (lVarV.u()) {
                            lVarV.z(aVarA);
                        } else {
                            lVarV.d();
                        }
                        lVarA = d4.a(lVarV);
                        d dVar13 = dVar3;
                        d4.b(lVarA, i0VarB9, companion10.c());
                        d4.b(lVarA, xVarC9, companion10.e());
                        pVarB = companion10.b();
                        if (lVarA.u()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        qVarA9.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                        lVarV.H(2058660585);
                        h0Var = v1.h0.f117504a;
                        boolean z1114 = z13;
                        boolean z1115 = z14;
                        l90.a.a(z1114, null, null, z1115, lVarV, ((i13 >> 6) & 14) | 48 | ((i13 >> 3) & 7168), 4);
                        lVarV.H(2045524722);
                        if (str6 != null) {
                            f0.a(str6, h0Var.b(t.m(d.INSTANCE, h.g(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), companion.i()), lVarV, (i13 >> 9) & 14, 0);
                        }
                        lVarV.T();
                        lVarV.T();
                        lVarV.g();
                        lVarV.T();
                        lVarV.T();
                        if (o.J()) {
                            o.R();
                        }
                        str7 = str5;
                        str8 = str6;
                        z16 = z1114;
                        z17 = z1115;
                        dVar4 = dVar13;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(dVar4, str7, z16, str8, z17, onValueChange, i11, i12));
                    }
                }
                i21 = 196608;
                i13 |= i21;
                if ((i13 & 374491) == 74898) {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i24 != 0) {
                        str5 = "";
                    } else {
                        str5 = str3;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    }
                    if (i16 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (i18 != 0) {
                        z14 = false;
                    }
                    if (o.J()) {
                        o.S(1416537179, i13, -1, "com.stripe.android.uicore.elements.CheckboxElementUI (CheckboxElementUI.kt:28)");
                    }
                    if (z13) {
                        i22 = i.f59326l;
                    } else {
                        i22 = i.f59323i;
                    }
                    strC = e4.i.c(i22, lVarV, 0);
                    f11 = 4;
                    d dVarK10 = t.k(dVar3, BitmapDescriptorFactory.HUE_RED, h.g(f11), 1, null);
                    lVarV.H(-1271039659);
                    if ((i13 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zN = z15 | lVarV.n(strC);
                    objI = lVarV.I();
                    if (zN) {
                        objI = new a(str5, strC);
                        lVarV.B(objI);
                    } else {
                        objI = new a(str5, strC);
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    d dVarH10 = x.h(androidx.compose.foundation.selection.c.b(g4.o.d(dVarK10, false, (wn0.l) objI, 1, null), z13, z14, g4.i.h(g4.i.INSTANCE.b()), onValueChange), BitmapDescriptorFactory.HUE_RED, 1, null);
                    companion = c.INSTANCE;
                    c.InterfaceC1212c interfaceC1212cI10 = companion.i();
                    lVarV.H(693286680);
                    i0 i0VarB10 = e0.b(v1.b.f117444a.f(), interfaceC1212cI10, lVarV, 48);
                    lVarV.H(-1323940314);
                    iA = j.a(lVarV, 0);
                    p020r2.x xVarC10 = lVarV.c();
                    g.Companion companion11 = g.INSTANCE;
                    aVarA = companion11.a();
                    q<y2<g>, p020r2.l, Integer, h0> qVarA10 = a0.a(dVarH10);
                    if (lVarV.w() == null) {
                        j.c();
                    }
                    lVarV.h();
                    if (lVarV.u()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d dVar14 = dVar3;
                    d4.b(lVarA, i0VarB10, companion11.c());
                    d4.b(lVarA, xVarC10, companion11.e());
                    pVarB = companion11.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    qVarA10.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                    lVarV.H(2058660585);
                    h0Var = v1.h0.f117504a;
                    boolean z1116 = z13;
                    boolean z1117 = z14;
                    l90.a.a(z1116, null, null, z1117, lVarV, ((i13 >> 6) & 14) | 48 | ((i13 >> 3) & 7168), 4);
                    lVarV.H(2045524722);
                    if (str6 != null) {
                        f0.a(str6, h0Var.b(t.m(d.INSTANCE, h.g(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), companion.i()), lVarV, (i13 >> 9) & 14, 0);
                    }
                    lVarV.T();
                    lVarV.T();
                    lVarV.g();
                    lVarV.T();
                    lVarV.T();
                    if (o.J()) {
                        o.R();
                    }
                    str7 = str5;
                    str8 = str6;
                    z16 = z1116;
                    z17 = z1117;
                    dVar4 = dVar14;
                } else {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i24 != 0) {
                        str5 = "";
                    } else {
                        str5 = str3;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    }
                    if (i16 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (i18 != 0) {
                        z14 = false;
                    }
                    if (o.J()) {
                        o.S(1416537179, i13, -1, "com.stripe.android.uicore.elements.CheckboxElementUI (CheckboxElementUI.kt:28)");
                    }
                    if (z13) {
                        i22 = i.f59326l;
                    } else {
                        i22 = i.f59323i;
                    }
                    strC = e4.i.c(i22, lVarV, 0);
                    f11 = 4;
                    d dVarK11 = t.k(dVar3, BitmapDescriptorFactory.HUE_RED, h.g(f11), 1, null);
                    lVarV.H(-1271039659);
                    if ((i13 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zN = z15 | lVarV.n(strC);
                    objI = lVarV.I();
                    if (zN) {
                        objI = new a(str5, strC);
                        lVarV.B(objI);
                    } else {
                        objI = new a(str5, strC);
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    d dVarH11 = x.h(androidx.compose.foundation.selection.c.b(g4.o.d(dVarK11, false, (wn0.l) objI, 1, null), z13, z14, g4.i.h(g4.i.INSTANCE.b()), onValueChange), BitmapDescriptorFactory.HUE_RED, 1, null);
                    companion = c.INSTANCE;
                    c.InterfaceC1212c interfaceC1212cI11 = companion.i();
                    lVarV.H(693286680);
                    i0 i0VarB11 = e0.b(v1.b.f117444a.f(), interfaceC1212cI11, lVarV, 48);
                    lVarV.H(-1323940314);
                    iA = j.a(lVarV, 0);
                    p020r2.x xVarC11 = lVarV.c();
                    g.Companion companion12 = g.INSTANCE;
                    aVarA = companion12.a();
                    q<y2<g>, p020r2.l, Integer, h0> qVarA11 = a0.a(dVarH11);
                    if (lVarV.w() == null) {
                        j.c();
                    }
                    lVarV.h();
                    if (lVarV.u()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d dVar15 = dVar3;
                    d4.b(lVarA, i0VarB11, companion12.c());
                    d4.b(lVarA, xVarC11, companion12.e());
                    pVarB = companion12.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    qVarA11.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                    lVarV.H(2058660585);
                    h0Var = v1.h0.f117504a;
                    boolean z1118 = z13;
                    boolean z1119 = z14;
                    l90.a.a(z1118, null, null, z1119, lVarV, ((i13 >> 6) & 14) | 48 | ((i13 >> 3) & 7168), 4);
                    lVarV.H(2045524722);
                    if (str6 != null) {
                        f0.a(str6, h0Var.b(t.m(d.INSTANCE, h.g(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), companion.i()), lVarV, (i13 >> 9) & 14, 0);
                    }
                    lVarV.T();
                    lVarV.T();
                    lVarV.g();
                    lVarV.T();
                    lVarV.T();
                    if (o.J()) {
                        o.R();
                    }
                    str7 = str5;
                    str8 = str6;
                    z16 = z1118;
                    z17 = z1119;
                    dVar4 = dVar15;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(dVar4, str7, z16, str8, z17, onValueChange, i11, i12));
                }
            }
            i13 |= 3072;
            str4 = str2;
            i18 = i12 & 16;
            if (i18 != 0) {
                i13 |= 24576;
                z14 = z12;
            } else {
                z14 = z12;
                if ((i11 & 57344) == 0) {
                    if (lVarV.p(z14)) {
                        i19 = 16384;
                    } else {
                        i19 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i19;
                }
            }
            if ((i12 & 32) != 0) {
                if ((i11 & 458752) == 0) {
                    if (lVarV.K(onValueChange)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                }
                if ((i13 & 374491) == 74898) {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i24 != 0) {
                        str5 = "";
                    } else {
                        str5 = str3;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    }
                    if (i16 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (i18 != 0) {
                        z14 = false;
                    }
                    if (o.J()) {
                        o.S(1416537179, i13, -1, "com.stripe.android.uicore.elements.CheckboxElementUI (CheckboxElementUI.kt:28)");
                    }
                    if (z13) {
                        i22 = i.f59326l;
                    } else {
                        i22 = i.f59323i;
                    }
                    strC = e4.i.c(i22, lVarV, 0);
                    f11 = 4;
                    d dVarK12 = t.k(dVar3, BitmapDescriptorFactory.HUE_RED, h.g(f11), 1, null);
                    lVarV.H(-1271039659);
                    if ((i13 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zN = z15 | lVarV.n(strC);
                    objI = lVarV.I();
                    if (zN) {
                        objI = new a(str5, strC);
                        lVarV.B(objI);
                    } else {
                        objI = new a(str5, strC);
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    d dVarH12 = x.h(androidx.compose.foundation.selection.c.b(g4.o.d(dVarK12, false, (wn0.l) objI, 1, null), z13, z14, g4.i.h(g4.i.INSTANCE.b()), onValueChange), BitmapDescriptorFactory.HUE_RED, 1, null);
                    companion = c.INSTANCE;
                    c.InterfaceC1212c interfaceC1212cI12 = companion.i();
                    lVarV.H(693286680);
                    i0 i0VarB12 = e0.b(v1.b.f117444a.f(), interfaceC1212cI12, lVarV, 48);
                    lVarV.H(-1323940314);
                    iA = j.a(lVarV, 0);
                    p020r2.x xVarC12 = lVarV.c();
                    g.Companion companion13 = g.INSTANCE;
                    aVarA = companion13.a();
                    q<y2<g>, p020r2.l, Integer, h0> qVarA12 = a0.a(dVarH12);
                    if (lVarV.w() == null) {
                        j.c();
                    }
                    lVarV.h();
                    if (lVarV.u()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d dVar16 = dVar3;
                    d4.b(lVarA, i0VarB12, companion13.c());
                    d4.b(lVarA, xVarC12, companion13.e());
                    pVarB = companion13.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    qVarA12.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                    lVarV.H(2058660585);
                    h0Var = v1.h0.f117504a;
                    boolean z11110 = z13;
                    boolean z11111 = z14;
                    l90.a.a(z11110, null, null, z11111, lVarV, ((i13 >> 6) & 14) | 48 | ((i13 >> 3) & 7168), 4);
                    lVarV.H(2045524722);
                    if (str6 != null) {
                        f0.a(str6, h0Var.b(t.m(d.INSTANCE, h.g(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), companion.i()), lVarV, (i13 >> 9) & 14, 0);
                    }
                    lVarV.T();
                    lVarV.T();
                    lVarV.g();
                    lVarV.T();
                    lVarV.T();
                    if (o.J()) {
                        o.R();
                    }
                    str7 = str5;
                    str8 = str6;
                    z16 = z11110;
                    z17 = z11111;
                    dVar4 = dVar16;
                } else {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i24 != 0) {
                        str5 = "";
                    } else {
                        str5 = str3;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    }
                    if (i16 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (i18 != 0) {
                        z14 = false;
                    }
                    if (o.J()) {
                        o.S(1416537179, i13, -1, "com.stripe.android.uicore.elements.CheckboxElementUI (CheckboxElementUI.kt:28)");
                    }
                    if (z13) {
                        i22 = i.f59326l;
                    } else {
                        i22 = i.f59323i;
                    }
                    strC = e4.i.c(i22, lVarV, 0);
                    f11 = 4;
                    d dVarK13 = t.k(dVar3, BitmapDescriptorFactory.HUE_RED, h.g(f11), 1, null);
                    lVarV.H(-1271039659);
                    if ((i13 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zN = z15 | lVarV.n(strC);
                    objI = lVarV.I();
                    if (zN) {
                        objI = new a(str5, strC);
                        lVarV.B(objI);
                    } else {
                        objI = new a(str5, strC);
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    d dVarH13 = x.h(androidx.compose.foundation.selection.c.b(g4.o.d(dVarK13, false, (wn0.l) objI, 1, null), z13, z14, g4.i.h(g4.i.INSTANCE.b()), onValueChange), BitmapDescriptorFactory.HUE_RED, 1, null);
                    companion = c.INSTANCE;
                    c.InterfaceC1212c interfaceC1212cI13 = companion.i();
                    lVarV.H(693286680);
                    i0 i0VarB13 = e0.b(v1.b.f117444a.f(), interfaceC1212cI13, lVarV, 48);
                    lVarV.H(-1323940314);
                    iA = j.a(lVarV, 0);
                    p020r2.x xVarC13 = lVarV.c();
                    g.Companion companion14 = g.INSTANCE;
                    aVarA = companion14.a();
                    q<y2<g>, p020r2.l, Integer, h0> qVarA13 = a0.a(dVarH13);
                    if (lVarV.w() == null) {
                        j.c();
                    }
                    lVarV.h();
                    if (lVarV.u()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d dVar17 = dVar3;
                    d4.b(lVarA, i0VarB13, companion14.c());
                    d4.b(lVarA, xVarC13, companion14.e());
                    pVarB = companion14.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    qVarA13.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                    lVarV.H(2058660585);
                    h0Var = v1.h0.f117504a;
                    boolean z11112 = z13;
                    boolean z11113 = z14;
                    l90.a.a(z11112, null, null, z11113, lVarV, ((i13 >> 6) & 14) | 48 | ((i13 >> 3) & 7168), 4);
                    lVarV.H(2045524722);
                    if (str6 != null) {
                        f0.a(str6, h0Var.b(t.m(d.INSTANCE, h.g(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), companion.i()), lVarV, (i13 >> 9) & 14, 0);
                    }
                    lVarV.T();
                    lVarV.T();
                    lVarV.g();
                    lVarV.T();
                    lVarV.T();
                    if (o.J()) {
                        o.R();
                    }
                    str7 = str5;
                    str8 = str6;
                    z16 = z11112;
                    z17 = z11113;
                    dVar4 = dVar17;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(dVar4, str7, z16, str8, z17, onValueChange, i11, i12));
                }
            }
            i21 = 196608;
            i13 |= i21;
            if ((i13 & 374491) == 74898) {
                if (i23 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i24 != 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                if (i14 != 0) {
                    z13 = false;
                }
                if (i16 != 0) {
                    str6 = null;
                } else {
                    str6 = str4;
                }
                if (i18 != 0) {
                    z14 = false;
                }
                if (o.J()) {
                    o.S(1416537179, i13, -1, "com.stripe.android.uicore.elements.CheckboxElementUI (CheckboxElementUI.kt:28)");
                }
                if (z13) {
                    i22 = i.f59326l;
                } else {
                    i22 = i.f59323i;
                }
                strC = e4.i.c(i22, lVarV, 0);
                f11 = 4;
                d dVarK14 = t.k(dVar3, BitmapDescriptorFactory.HUE_RED, h.g(f11), 1, null);
                lVarV.H(-1271039659);
                if ((i13 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zN = z15 | lVarV.n(strC);
                objI = lVarV.I();
                if (zN) {
                    objI = new a(str5, strC);
                    lVarV.B(objI);
                } else {
                    objI = new a(str5, strC);
                    lVarV.B(objI);
                }
                lVarV.T();
                d dVarH14 = x.h(androidx.compose.foundation.selection.c.b(g4.o.d(dVarK14, false, (wn0.l) objI, 1, null), z13, z14, g4.i.h(g4.i.INSTANCE.b()), onValueChange), BitmapDescriptorFactory.HUE_RED, 1, null);
                companion = c.INSTANCE;
                c.InterfaceC1212c interfaceC1212cI14 = companion.i();
                lVarV.H(693286680);
                i0 i0VarB14 = e0.b(v1.b.f117444a.f(), interfaceC1212cI14, lVarV, 48);
                lVarV.H(-1323940314);
                iA = j.a(lVarV, 0);
                p020r2.x xVarC14 = lVarV.c();
                g.Companion companion15 = g.INSTANCE;
                aVarA = companion15.a();
                q<y2<g>, p020r2.l, Integer, h0> qVarA14 = a0.a(dVarH14);
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.u()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d dVar18 = dVar3;
                d4.b(lVarA, i0VarB14, companion15.c());
                d4.b(lVarA, xVarC14, companion15.e());
                pVarB = companion15.b();
                if (lVarA.u()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA14.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                h0Var = v1.h0.f117504a;
                boolean z11114 = z13;
                boolean z11115 = z14;
                l90.a.a(z11114, null, null, z11115, lVarV, ((i13 >> 6) & 14) | 48 | ((i13 >> 3) & 7168), 4);
                lVarV.H(2045524722);
                if (str6 != null) {
                    f0.a(str6, h0Var.b(t.m(d.INSTANCE, h.g(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), companion.i()), lVarV, (i13 >> 9) & 14, 0);
                }
                lVarV.T();
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                if (o.J()) {
                    o.R();
                }
                str7 = str5;
                str8 = str6;
                z16 = z11114;
                z17 = z11115;
                dVar4 = dVar18;
            } else {
                if (i23 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i24 != 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                if (i14 != 0) {
                    z13 = false;
                }
                if (i16 != 0) {
                    str6 = null;
                } else {
                    str6 = str4;
                }
                if (i18 != 0) {
                    z14 = false;
                }
                if (o.J()) {
                    o.S(1416537179, i13, -1, "com.stripe.android.uicore.elements.CheckboxElementUI (CheckboxElementUI.kt:28)");
                }
                if (z13) {
                    i22 = i.f59326l;
                } else {
                    i22 = i.f59323i;
                }
                strC = e4.i.c(i22, lVarV, 0);
                f11 = 4;
                d dVarK15 = t.k(dVar3, BitmapDescriptorFactory.HUE_RED, h.g(f11), 1, null);
                lVarV.H(-1271039659);
                if ((i13 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zN = z15 | lVarV.n(strC);
                objI = lVarV.I();
                if (zN) {
                    objI = new a(str5, strC);
                    lVarV.B(objI);
                } else {
                    objI = new a(str5, strC);
                    lVarV.B(objI);
                }
                lVarV.T();
                d dVarH15 = x.h(androidx.compose.foundation.selection.c.b(g4.o.d(dVarK15, false, (wn0.l) objI, 1, null), z13, z14, g4.i.h(g4.i.INSTANCE.b()), onValueChange), BitmapDescriptorFactory.HUE_RED, 1, null);
                companion = c.INSTANCE;
                c.InterfaceC1212c interfaceC1212cI15 = companion.i();
                lVarV.H(693286680);
                i0 i0VarB15 = e0.b(v1.b.f117444a.f(), interfaceC1212cI15, lVarV, 48);
                lVarV.H(-1323940314);
                iA = j.a(lVarV, 0);
                p020r2.x xVarC15 = lVarV.c();
                g.Companion companion16 = g.INSTANCE;
                aVarA = companion16.a();
                q<y2<g>, p020r2.l, Integer, h0> qVarA15 = a0.a(dVarH15);
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.u()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d dVar19 = dVar3;
                d4.b(lVarA, i0VarB15, companion16.c());
                d4.b(lVarA, xVarC15, companion16.e());
                pVarB = companion16.b();
                if (lVarA.u()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA15.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                h0Var = v1.h0.f117504a;
                boolean z11116 = z13;
                boolean z11117 = z14;
                l90.a.a(z11116, null, null, z11117, lVarV, ((i13 >> 6) & 14) | 48 | ((i13 >> 3) & 7168), 4);
                lVarV.H(2045524722);
                if (str6 != null) {
                    f0.a(str6, h0Var.b(t.m(d.INSTANCE, h.g(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), companion.i()), lVarV, (i13 >> 9) & 14, 0);
                }
                lVarV.T();
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                if (o.J()) {
                    o.R();
                }
                str7 = str5;
                str8 = str6;
                z16 = z11116;
                z17 = z11117;
                dVar4 = dVar19;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(dVar4, str7, z16, str8, z17, onValueChange, i11, i12));
            }
        }
        i13 |= 48;
        str3 = str;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & 896) == 0) {
                z13 = z11;
                if (lVarV.p(z13)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 7168) == 0) {
                    str4 = str2;
                    if (lVarV.n(str4)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 16;
                if (i18 != 0) {
                    i13 |= 24576;
                    z14 = z12;
                } else {
                    z14 = z12;
                    if ((i11 & 57344) == 0) {
                        if (lVarV.p(z14)) {
                            i19 = 16384;
                        } else {
                            i19 = PKIFailureInfo.certRevoked;
                        }
                        i13 |= i19;
                    }
                }
                if ((i12 & 32) != 0) {
                    if ((i11 & 458752) == 0) {
                        if (lVarV.K(onValueChange)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                    }
                    if ((i13 & 374491) == 74898) {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i24 != 0) {
                            str5 = "";
                        } else {
                            str5 = str3;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        }
                        if (i16 != 0) {
                            str6 = null;
                        } else {
                            str6 = str4;
                        }
                        if (i18 != 0) {
                            z14 = false;
                        }
                        if (o.J()) {
                            o.S(1416537179, i13, -1, "com.stripe.android.uicore.elements.CheckboxElementUI (CheckboxElementUI.kt:28)");
                        }
                        if (z13) {
                            i22 = i.f59326l;
                        } else {
                            i22 = i.f59323i;
                        }
                        strC = e4.i.c(i22, lVarV, 0);
                        f11 = 4;
                        d dVarK16 = t.k(dVar3, BitmapDescriptorFactory.HUE_RED, h.g(f11), 1, null);
                        lVarV.H(-1271039659);
                        if ((i13 & 112) == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zN = z15 | lVarV.n(strC);
                        objI = lVarV.I();
                        if (zN) {
                            objI = new a(str5, strC);
                            lVarV.B(objI);
                        } else {
                            objI = new a(str5, strC);
                            lVarV.B(objI);
                        }
                        lVarV.T();
                        d dVarH16 = x.h(androidx.compose.foundation.selection.c.b(g4.o.d(dVarK16, false, (wn0.l) objI, 1, null), z13, z14, g4.i.h(g4.i.INSTANCE.b()), onValueChange), BitmapDescriptorFactory.HUE_RED, 1, null);
                        companion = c.INSTANCE;
                        c.InterfaceC1212c interfaceC1212cI16 = companion.i();
                        lVarV.H(693286680);
                        i0 i0VarB16 = e0.b(v1.b.f117444a.f(), interfaceC1212cI16, lVarV, 48);
                        lVarV.H(-1323940314);
                        iA = j.a(lVarV, 0);
                        p020r2.x xVarC16 = lVarV.c();
                        g.Companion companion17 = g.INSTANCE;
                        aVarA = companion17.a();
                        q<y2<g>, p020r2.l, Integer, h0> qVarA16 = a0.a(dVarH16);
                        if (lVarV.w() == null) {
                            j.c();
                        }
                        lVarV.h();
                        if (lVarV.u()) {
                            lVarV.z(aVarA);
                        } else {
                            lVarV.d();
                        }
                        lVarA = d4.a(lVarV);
                        d dVar110 = dVar3;
                        d4.b(lVarA, i0VarB16, companion17.c());
                        d4.b(lVarA, xVarC16, companion17.e());
                        pVarB = companion17.b();
                        if (lVarA.u()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        qVarA16.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                        lVarV.H(2058660585);
                        h0Var = v1.h0.f117504a;
                        boolean z11118 = z13;
                        boolean z11119 = z14;
                        l90.a.a(z11118, null, null, z11119, lVarV, ((i13 >> 6) & 14) | 48 | ((i13 >> 3) & 7168), 4);
                        lVarV.H(2045524722);
                        if (str6 != null) {
                            f0.a(str6, h0Var.b(t.m(d.INSTANCE, h.g(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), companion.i()), lVarV, (i13 >> 9) & 14, 0);
                        }
                        lVarV.T();
                        lVarV.T();
                        lVarV.g();
                        lVarV.T();
                        lVarV.T();
                        if (o.J()) {
                            o.R();
                        }
                        str7 = str5;
                        str8 = str6;
                        z16 = z11118;
                        z17 = z11119;
                        dVar4 = dVar110;
                    } else {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i24 != 0) {
                            str5 = "";
                        } else {
                            str5 = str3;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        }
                        if (i16 != 0) {
                            str6 = null;
                        } else {
                            str6 = str4;
                        }
                        if (i18 != 0) {
                            z14 = false;
                        }
                        if (o.J()) {
                            o.S(1416537179, i13, -1, "com.stripe.android.uicore.elements.CheckboxElementUI (CheckboxElementUI.kt:28)");
                        }
                        if (z13) {
                            i22 = i.f59326l;
                        } else {
                            i22 = i.f59323i;
                        }
                        strC = e4.i.c(i22, lVarV, 0);
                        f11 = 4;
                        d dVarK17 = t.k(dVar3, BitmapDescriptorFactory.HUE_RED, h.g(f11), 1, null);
                        lVarV.H(-1271039659);
                        if ((i13 & 112) == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zN = z15 | lVarV.n(strC);
                        objI = lVarV.I();
                        if (zN) {
                            objI = new a(str5, strC);
                            lVarV.B(objI);
                        } else {
                            objI = new a(str5, strC);
                            lVarV.B(objI);
                        }
                        lVarV.T();
                        d dVarH17 = x.h(androidx.compose.foundation.selection.c.b(g4.o.d(dVarK17, false, (wn0.l) objI, 1, null), z13, z14, g4.i.h(g4.i.INSTANCE.b()), onValueChange), BitmapDescriptorFactory.HUE_RED, 1, null);
                        companion = c.INSTANCE;
                        c.InterfaceC1212c interfaceC1212cI17 = companion.i();
                        lVarV.H(693286680);
                        i0 i0VarB17 = e0.b(v1.b.f117444a.f(), interfaceC1212cI17, lVarV, 48);
                        lVarV.H(-1323940314);
                        iA = j.a(lVarV, 0);
                        p020r2.x xVarC17 = lVarV.c();
                        g.Companion companion18 = g.INSTANCE;
                        aVarA = companion18.a();
                        q<y2<g>, p020r2.l, Integer, h0> qVarA17 = a0.a(dVarH17);
                        if (lVarV.w() == null) {
                            j.c();
                        }
                        lVarV.h();
                        if (lVarV.u()) {
                            lVarV.z(aVarA);
                        } else {
                            lVarV.d();
                        }
                        lVarA = d4.a(lVarV);
                        d dVar111 = dVar3;
                        d4.b(lVarA, i0VarB17, companion18.c());
                        d4.b(lVarA, xVarC17, companion18.e());
                        pVarB = companion18.b();
                        if (lVarA.u()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        qVarA17.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                        lVarV.H(2058660585);
                        h0Var = v1.h0.f117504a;
                        boolean z111110 = z13;
                        boolean z111111 = z14;
                        l90.a.a(z111110, null, null, z111111, lVarV, ((i13 >> 6) & 14) | 48 | ((i13 >> 3) & 7168), 4);
                        lVarV.H(2045524722);
                        if (str6 != null) {
                            f0.a(str6, h0Var.b(t.m(d.INSTANCE, h.g(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), companion.i()), lVarV, (i13 >> 9) & 14, 0);
                        }
                        lVarV.T();
                        lVarV.T();
                        lVarV.g();
                        lVarV.T();
                        lVarV.T();
                        if (o.J()) {
                            o.R();
                        }
                        str7 = str5;
                        str8 = str6;
                        z16 = z111110;
                        z17 = z111111;
                        dVar4 = dVar111;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(dVar4, str7, z16, str8, z17, onValueChange, i11, i12));
                    }
                }
                i21 = 196608;
                i13 |= i21;
                if ((i13 & 374491) == 74898) {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i24 != 0) {
                        str5 = "";
                    } else {
                        str5 = str3;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    }
                    if (i16 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (i18 != 0) {
                        z14 = false;
                    }
                    if (o.J()) {
                        o.S(1416537179, i13, -1, "com.stripe.android.uicore.elements.CheckboxElementUI (CheckboxElementUI.kt:28)");
                    }
                    if (z13) {
                        i22 = i.f59326l;
                    } else {
                        i22 = i.f59323i;
                    }
                    strC = e4.i.c(i22, lVarV, 0);
                    f11 = 4;
                    d dVarK18 = t.k(dVar3, BitmapDescriptorFactory.HUE_RED, h.g(f11), 1, null);
                    lVarV.H(-1271039659);
                    if ((i13 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zN = z15 | lVarV.n(strC);
                    objI = lVarV.I();
                    if (zN) {
                        objI = new a(str5, strC);
                        lVarV.B(objI);
                    } else {
                        objI = new a(str5, strC);
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    d dVarH18 = x.h(androidx.compose.foundation.selection.c.b(g4.o.d(dVarK18, false, (wn0.l) objI, 1, null), z13, z14, g4.i.h(g4.i.INSTANCE.b()), onValueChange), BitmapDescriptorFactory.HUE_RED, 1, null);
                    companion = c.INSTANCE;
                    c.InterfaceC1212c interfaceC1212cI18 = companion.i();
                    lVarV.H(693286680);
                    i0 i0VarB18 = e0.b(v1.b.f117444a.f(), interfaceC1212cI18, lVarV, 48);
                    lVarV.H(-1323940314);
                    iA = j.a(lVarV, 0);
                    p020r2.x xVarC18 = lVarV.c();
                    g.Companion companion19 = g.INSTANCE;
                    aVarA = companion19.a();
                    q<y2<g>, p020r2.l, Integer, h0> qVarA18 = a0.a(dVarH18);
                    if (lVarV.w() == null) {
                        j.c();
                    }
                    lVarV.h();
                    if (lVarV.u()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d dVar112 = dVar3;
                    d4.b(lVarA, i0VarB18, companion19.c());
                    d4.b(lVarA, xVarC18, companion19.e());
                    pVarB = companion19.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    qVarA18.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                    lVarV.H(2058660585);
                    h0Var = v1.h0.f117504a;
                    boolean z111112 = z13;
                    boolean z111113 = z14;
                    l90.a.a(z111112, null, null, z111113, lVarV, ((i13 >> 6) & 14) | 48 | ((i13 >> 3) & 7168), 4);
                    lVarV.H(2045524722);
                    if (str6 != null) {
                        f0.a(str6, h0Var.b(t.m(d.INSTANCE, h.g(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), companion.i()), lVarV, (i13 >> 9) & 14, 0);
                    }
                    lVarV.T();
                    lVarV.T();
                    lVarV.g();
                    lVarV.T();
                    lVarV.T();
                    if (o.J()) {
                        o.R();
                    }
                    str7 = str5;
                    str8 = str6;
                    z16 = z111112;
                    z17 = z111113;
                    dVar4 = dVar112;
                } else {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i24 != 0) {
                        str5 = "";
                    } else {
                        str5 = str3;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    }
                    if (i16 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (i18 != 0) {
                        z14 = false;
                    }
                    if (o.J()) {
                        o.S(1416537179, i13, -1, "com.stripe.android.uicore.elements.CheckboxElementUI (CheckboxElementUI.kt:28)");
                    }
                    if (z13) {
                        i22 = i.f59326l;
                    } else {
                        i22 = i.f59323i;
                    }
                    strC = e4.i.c(i22, lVarV, 0);
                    f11 = 4;
                    d dVarK19 = t.k(dVar3, BitmapDescriptorFactory.HUE_RED, h.g(f11), 1, null);
                    lVarV.H(-1271039659);
                    if ((i13 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zN = z15 | lVarV.n(strC);
                    objI = lVarV.I();
                    if (zN) {
                        objI = new a(str5, strC);
                        lVarV.B(objI);
                    } else {
                        objI = new a(str5, strC);
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    d dVarH19 = x.h(androidx.compose.foundation.selection.c.b(g4.o.d(dVarK19, false, (wn0.l) objI, 1, null), z13, z14, g4.i.h(g4.i.INSTANCE.b()), onValueChange), BitmapDescriptorFactory.HUE_RED, 1, null);
                    companion = c.INSTANCE;
                    c.InterfaceC1212c interfaceC1212cI19 = companion.i();
                    lVarV.H(693286680);
                    i0 i0VarB19 = e0.b(v1.b.f117444a.f(), interfaceC1212cI19, lVarV, 48);
                    lVarV.H(-1323940314);
                    iA = j.a(lVarV, 0);
                    p020r2.x xVarC19 = lVarV.c();
                    g.Companion companion110 = g.INSTANCE;
                    aVarA = companion110.a();
                    q<y2<g>, p020r2.l, Integer, h0> qVarA19 = a0.a(dVarH19);
                    if (lVarV.w() == null) {
                        j.c();
                    }
                    lVarV.h();
                    if (lVarV.u()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d dVar113 = dVar3;
                    d4.b(lVarA, i0VarB19, companion110.c());
                    d4.b(lVarA, xVarC19, companion110.e());
                    pVarB = companion110.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    qVarA19.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                    lVarV.H(2058660585);
                    h0Var = v1.h0.f117504a;
                    boolean z111114 = z13;
                    boolean z111115 = z14;
                    l90.a.a(z111114, null, null, z111115, lVarV, ((i13 >> 6) & 14) | 48 | ((i13 >> 3) & 7168), 4);
                    lVarV.H(2045524722);
                    if (str6 != null) {
                        f0.a(str6, h0Var.b(t.m(d.INSTANCE, h.g(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), companion.i()), lVarV, (i13 >> 9) & 14, 0);
                    }
                    lVarV.T();
                    lVarV.T();
                    lVarV.g();
                    lVarV.T();
                    lVarV.T();
                    if (o.J()) {
                        o.R();
                    }
                    str7 = str5;
                    str8 = str6;
                    z16 = z111114;
                    z17 = z111115;
                    dVar4 = dVar113;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(dVar4, str7, z16, str8, z17, onValueChange, i11, i12));
                }
            }
            i13 |= 3072;
            str4 = str2;
            i18 = i12 & 16;
            if (i18 != 0) {
                i13 |= 24576;
                z14 = z12;
            } else {
                z14 = z12;
                if ((i11 & 57344) == 0) {
                    if (lVarV.p(z14)) {
                        i19 = 16384;
                    } else {
                        i19 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i19;
                }
            }
            if ((i12 & 32) != 0) {
                if ((i11 & 458752) == 0) {
                    if (lVarV.K(onValueChange)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                }
                if ((i13 & 374491) == 74898) {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i24 != 0) {
                        str5 = "";
                    } else {
                        str5 = str3;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    }
                    if (i16 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (i18 != 0) {
                        z14 = false;
                    }
                    if (o.J()) {
                        o.S(1416537179, i13, -1, "com.stripe.android.uicore.elements.CheckboxElementUI (CheckboxElementUI.kt:28)");
                    }
                    if (z13) {
                        i22 = i.f59326l;
                    } else {
                        i22 = i.f59323i;
                    }
                    strC = e4.i.c(i22, lVarV, 0);
                    f11 = 4;
                    d dVarK110 = t.k(dVar3, BitmapDescriptorFactory.HUE_RED, h.g(f11), 1, null);
                    lVarV.H(-1271039659);
                    if ((i13 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zN = z15 | lVarV.n(strC);
                    objI = lVarV.I();
                    if (zN) {
                        objI = new a(str5, strC);
                        lVarV.B(objI);
                    } else {
                        objI = new a(str5, strC);
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    d dVarH110 = x.h(androidx.compose.foundation.selection.c.b(g4.o.d(dVarK110, false, (wn0.l) objI, 1, null), z13, z14, g4.i.h(g4.i.INSTANCE.b()), onValueChange), BitmapDescriptorFactory.HUE_RED, 1, null);
                    companion = c.INSTANCE;
                    c.InterfaceC1212c interfaceC1212cI110 = companion.i();
                    lVarV.H(693286680);
                    i0 i0VarB110 = e0.b(v1.b.f117444a.f(), interfaceC1212cI110, lVarV, 48);
                    lVarV.H(-1323940314);
                    iA = j.a(lVarV, 0);
                    p020r2.x xVarC110 = lVarV.c();
                    g.Companion companion111 = g.INSTANCE;
                    aVarA = companion111.a();
                    q<y2<g>, p020r2.l, Integer, h0> qVarA110 = a0.a(dVarH110);
                    if (lVarV.w() == null) {
                        j.c();
                    }
                    lVarV.h();
                    if (lVarV.u()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d dVar114 = dVar3;
                    d4.b(lVarA, i0VarB110, companion111.c());
                    d4.b(lVarA, xVarC110, companion111.e());
                    pVarB = companion111.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    qVarA110.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                    lVarV.H(2058660585);
                    h0Var = v1.h0.f117504a;
                    boolean z111116 = z13;
                    boolean z111117 = z14;
                    l90.a.a(z111116, null, null, z111117, lVarV, ((i13 >> 6) & 14) | 48 | ((i13 >> 3) & 7168), 4);
                    lVarV.H(2045524722);
                    if (str6 != null) {
                        f0.a(str6, h0Var.b(t.m(d.INSTANCE, h.g(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), companion.i()), lVarV, (i13 >> 9) & 14, 0);
                    }
                    lVarV.T();
                    lVarV.T();
                    lVarV.g();
                    lVarV.T();
                    lVarV.T();
                    if (o.J()) {
                        o.R();
                    }
                    str7 = str5;
                    str8 = str6;
                    z16 = z111116;
                    z17 = z111117;
                    dVar4 = dVar114;
                } else {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i24 != 0) {
                        str5 = "";
                    } else {
                        str5 = str3;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    }
                    if (i16 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (i18 != 0) {
                        z14 = false;
                    }
                    if (o.J()) {
                        o.S(1416537179, i13, -1, "com.stripe.android.uicore.elements.CheckboxElementUI (CheckboxElementUI.kt:28)");
                    }
                    if (z13) {
                        i22 = i.f59326l;
                    } else {
                        i22 = i.f59323i;
                    }
                    strC = e4.i.c(i22, lVarV, 0);
                    f11 = 4;
                    d dVarK111 = t.k(dVar3, BitmapDescriptorFactory.HUE_RED, h.g(f11), 1, null);
                    lVarV.H(-1271039659);
                    if ((i13 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zN = z15 | lVarV.n(strC);
                    objI = lVarV.I();
                    if (zN) {
                        objI = new a(str5, strC);
                        lVarV.B(objI);
                    } else {
                        objI = new a(str5, strC);
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    d dVarH111 = x.h(androidx.compose.foundation.selection.c.b(g4.o.d(dVarK111, false, (wn0.l) objI, 1, null), z13, z14, g4.i.h(g4.i.INSTANCE.b()), onValueChange), BitmapDescriptorFactory.HUE_RED, 1, null);
                    companion = c.INSTANCE;
                    c.InterfaceC1212c interfaceC1212cI111 = companion.i();
                    lVarV.H(693286680);
                    i0 i0VarB111 = e0.b(v1.b.f117444a.f(), interfaceC1212cI111, lVarV, 48);
                    lVarV.H(-1323940314);
                    iA = j.a(lVarV, 0);
                    p020r2.x xVarC111 = lVarV.c();
                    g.Companion companion112 = g.INSTANCE;
                    aVarA = companion112.a();
                    q<y2<g>, p020r2.l, Integer, h0> qVarA111 = a0.a(dVarH111);
                    if (lVarV.w() == null) {
                        j.c();
                    }
                    lVarV.h();
                    if (lVarV.u()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d dVar115 = dVar3;
                    d4.b(lVarA, i0VarB111, companion112.c());
                    d4.b(lVarA, xVarC111, companion112.e());
                    pVarB = companion112.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    qVarA111.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                    lVarV.H(2058660585);
                    h0Var = v1.h0.f117504a;
                    boolean z111118 = z13;
                    boolean z111119 = z14;
                    l90.a.a(z111118, null, null, z111119, lVarV, ((i13 >> 6) & 14) | 48 | ((i13 >> 3) & 7168), 4);
                    lVarV.H(2045524722);
                    if (str6 != null) {
                        f0.a(str6, h0Var.b(t.m(d.INSTANCE, h.g(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), companion.i()), lVarV, (i13 >> 9) & 14, 0);
                    }
                    lVarV.T();
                    lVarV.T();
                    lVarV.g();
                    lVarV.T();
                    lVarV.T();
                    if (o.J()) {
                        o.R();
                    }
                    str7 = str5;
                    str8 = str6;
                    z16 = z111118;
                    z17 = z111119;
                    dVar4 = dVar115;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(dVar4, str7, z16, str8, z17, onValueChange, i11, i12));
                }
            }
            i21 = 196608;
            i13 |= i21;
            if ((i13 & 374491) == 74898) {
                if (i23 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i24 != 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                if (i14 != 0) {
                    z13 = false;
                }
                if (i16 != 0) {
                    str6 = null;
                } else {
                    str6 = str4;
                }
                if (i18 != 0) {
                    z14 = false;
                }
                if (o.J()) {
                    o.S(1416537179, i13, -1, "com.stripe.android.uicore.elements.CheckboxElementUI (CheckboxElementUI.kt:28)");
                }
                if (z13) {
                    i22 = i.f59326l;
                } else {
                    i22 = i.f59323i;
                }
                strC = e4.i.c(i22, lVarV, 0);
                f11 = 4;
                d dVarK112 = t.k(dVar3, BitmapDescriptorFactory.HUE_RED, h.g(f11), 1, null);
                lVarV.H(-1271039659);
                if ((i13 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zN = z15 | lVarV.n(strC);
                objI = lVarV.I();
                if (zN) {
                    objI = new a(str5, strC);
                    lVarV.B(objI);
                } else {
                    objI = new a(str5, strC);
                    lVarV.B(objI);
                }
                lVarV.T();
                d dVarH112 = x.h(androidx.compose.foundation.selection.c.b(g4.o.d(dVarK112, false, (wn0.l) objI, 1, null), z13, z14, g4.i.h(g4.i.INSTANCE.b()), onValueChange), BitmapDescriptorFactory.HUE_RED, 1, null);
                companion = c.INSTANCE;
                c.InterfaceC1212c interfaceC1212cI112 = companion.i();
                lVarV.H(693286680);
                i0 i0VarB112 = e0.b(v1.b.f117444a.f(), interfaceC1212cI112, lVarV, 48);
                lVarV.H(-1323940314);
                iA = j.a(lVarV, 0);
                p020r2.x xVarC112 = lVarV.c();
                g.Companion companion113 = g.INSTANCE;
                aVarA = companion113.a();
                q<y2<g>, p020r2.l, Integer, h0> qVarA112 = a0.a(dVarH112);
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.u()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d dVar116 = dVar3;
                d4.b(lVarA, i0VarB112, companion113.c());
                d4.b(lVarA, xVarC112, companion113.e());
                pVarB = companion113.b();
                if (lVarA.u()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA112.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                h0Var = v1.h0.f117504a;
                boolean z1111110 = z13;
                boolean z1111111 = z14;
                l90.a.a(z1111110, null, null, z1111111, lVarV, ((i13 >> 6) & 14) | 48 | ((i13 >> 3) & 7168), 4);
                lVarV.H(2045524722);
                if (str6 != null) {
                    f0.a(str6, h0Var.b(t.m(d.INSTANCE, h.g(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), companion.i()), lVarV, (i13 >> 9) & 14, 0);
                }
                lVarV.T();
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                if (o.J()) {
                    o.R();
                }
                str7 = str5;
                str8 = str6;
                z16 = z1111110;
                z17 = z1111111;
                dVar4 = dVar116;
            } else {
                if (i23 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i24 != 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                if (i14 != 0) {
                    z13 = false;
                }
                if (i16 != 0) {
                    str6 = null;
                } else {
                    str6 = str4;
                }
                if (i18 != 0) {
                    z14 = false;
                }
                if (o.J()) {
                    o.S(1416537179, i13, -1, "com.stripe.android.uicore.elements.CheckboxElementUI (CheckboxElementUI.kt:28)");
                }
                if (z13) {
                    i22 = i.f59326l;
                } else {
                    i22 = i.f59323i;
                }
                strC = e4.i.c(i22, lVarV, 0);
                f11 = 4;
                d dVarK113 = t.k(dVar3, BitmapDescriptorFactory.HUE_RED, h.g(f11), 1, null);
                lVarV.H(-1271039659);
                if ((i13 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zN = z15 | lVarV.n(strC);
                objI = lVarV.I();
                if (zN) {
                    objI = new a(str5, strC);
                    lVarV.B(objI);
                } else {
                    objI = new a(str5, strC);
                    lVarV.B(objI);
                }
                lVarV.T();
                d dVarH113 = x.h(androidx.compose.foundation.selection.c.b(g4.o.d(dVarK113, false, (wn0.l) objI, 1, null), z13, z14, g4.i.h(g4.i.INSTANCE.b()), onValueChange), BitmapDescriptorFactory.HUE_RED, 1, null);
                companion = c.INSTANCE;
                c.InterfaceC1212c interfaceC1212cI113 = companion.i();
                lVarV.H(693286680);
                i0 i0VarB113 = e0.b(v1.b.f117444a.f(), interfaceC1212cI113, lVarV, 48);
                lVarV.H(-1323940314);
                iA = j.a(lVarV, 0);
                p020r2.x xVarC113 = lVarV.c();
                g.Companion companion114 = g.INSTANCE;
                aVarA = companion114.a();
                q<y2<g>, p020r2.l, Integer, h0> qVarA113 = a0.a(dVarH113);
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.u()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d dVar117 = dVar3;
                d4.b(lVarA, i0VarB113, companion114.c());
                d4.b(lVarA, xVarC113, companion114.e());
                pVarB = companion114.b();
                if (lVarA.u()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA113.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                h0Var = v1.h0.f117504a;
                boolean z1111112 = z13;
                boolean z1111113 = z14;
                l90.a.a(z1111112, null, null, z1111113, lVarV, ((i13 >> 6) & 14) | 48 | ((i13 >> 3) & 7168), 4);
                lVarV.H(2045524722);
                if (str6 != null) {
                    f0.a(str6, h0Var.b(t.m(d.INSTANCE, h.g(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), companion.i()), lVarV, (i13 >> 9) & 14, 0);
                }
                lVarV.T();
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                if (o.J()) {
                    o.R();
                }
                str7 = str5;
                str8 = str6;
                z16 = z1111112;
                z17 = z1111113;
                dVar4 = dVar117;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(dVar4, str7, z16, str8, z17, onValueChange, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        z13 = z11;
        i16 = i12 & 8;
        if (i16 != 0) {
            if ((i11 & 7168) == 0) {
                str4 = str2;
                if (lVarV.n(str4)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i13 |= i17;
            }
            i18 = i12 & 16;
            if (i18 != 0) {
                i13 |= 24576;
                z14 = z12;
            } else {
                z14 = z12;
                if ((i11 & 57344) == 0) {
                    if (lVarV.p(z14)) {
                        i19 = 16384;
                    } else {
                        i19 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i19;
                }
            }
            if ((i12 & 32) != 0) {
                if ((i11 & 458752) == 0) {
                    if (lVarV.K(onValueChange)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                }
                if ((i13 & 374491) == 74898) {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i24 != 0) {
                        str5 = "";
                    } else {
                        str5 = str3;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    }
                    if (i16 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (i18 != 0) {
                        z14 = false;
                    }
                    if (o.J()) {
                        o.S(1416537179, i13, -1, "com.stripe.android.uicore.elements.CheckboxElementUI (CheckboxElementUI.kt:28)");
                    }
                    if (z13) {
                        i22 = i.f59326l;
                    } else {
                        i22 = i.f59323i;
                    }
                    strC = e4.i.c(i22, lVarV, 0);
                    f11 = 4;
                    d dVarK114 = t.k(dVar3, BitmapDescriptorFactory.HUE_RED, h.g(f11), 1, null);
                    lVarV.H(-1271039659);
                    if ((i13 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zN = z15 | lVarV.n(strC);
                    objI = lVarV.I();
                    if (zN) {
                        objI = new a(str5, strC);
                        lVarV.B(objI);
                    } else {
                        objI = new a(str5, strC);
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    d dVarH114 = x.h(androidx.compose.foundation.selection.c.b(g4.o.d(dVarK114, false, (wn0.l) objI, 1, null), z13, z14, g4.i.h(g4.i.INSTANCE.b()), onValueChange), BitmapDescriptorFactory.HUE_RED, 1, null);
                    companion = c.INSTANCE;
                    c.InterfaceC1212c interfaceC1212cI114 = companion.i();
                    lVarV.H(693286680);
                    i0 i0VarB114 = e0.b(v1.b.f117444a.f(), interfaceC1212cI114, lVarV, 48);
                    lVarV.H(-1323940314);
                    iA = j.a(lVarV, 0);
                    p020r2.x xVarC114 = lVarV.c();
                    g.Companion companion115 = g.INSTANCE;
                    aVarA = companion115.a();
                    q<y2<g>, p020r2.l, Integer, h0> qVarA114 = a0.a(dVarH114);
                    if (lVarV.w() == null) {
                        j.c();
                    }
                    lVarV.h();
                    if (lVarV.u()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d dVar118 = dVar3;
                    d4.b(lVarA, i0VarB114, companion115.c());
                    d4.b(lVarA, xVarC114, companion115.e());
                    pVarB = companion115.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    qVarA114.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                    lVarV.H(2058660585);
                    h0Var = v1.h0.f117504a;
                    boolean z1111114 = z13;
                    boolean z1111115 = z14;
                    l90.a.a(z1111114, null, null, z1111115, lVarV, ((i13 >> 6) & 14) | 48 | ((i13 >> 3) & 7168), 4);
                    lVarV.H(2045524722);
                    if (str6 != null) {
                        f0.a(str6, h0Var.b(t.m(d.INSTANCE, h.g(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), companion.i()), lVarV, (i13 >> 9) & 14, 0);
                    }
                    lVarV.T();
                    lVarV.T();
                    lVarV.g();
                    lVarV.T();
                    lVarV.T();
                    if (o.J()) {
                        o.R();
                    }
                    str7 = str5;
                    str8 = str6;
                    z16 = z1111114;
                    z17 = z1111115;
                    dVar4 = dVar118;
                } else {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i24 != 0) {
                        str5 = "";
                    } else {
                        str5 = str3;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    }
                    if (i16 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (i18 != 0) {
                        z14 = false;
                    }
                    if (o.J()) {
                        o.S(1416537179, i13, -1, "com.stripe.android.uicore.elements.CheckboxElementUI (CheckboxElementUI.kt:28)");
                    }
                    if (z13) {
                        i22 = i.f59326l;
                    } else {
                        i22 = i.f59323i;
                    }
                    strC = e4.i.c(i22, lVarV, 0);
                    f11 = 4;
                    d dVarK115 = t.k(dVar3, BitmapDescriptorFactory.HUE_RED, h.g(f11), 1, null);
                    lVarV.H(-1271039659);
                    if ((i13 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zN = z15 | lVarV.n(strC);
                    objI = lVarV.I();
                    if (zN) {
                        objI = new a(str5, strC);
                        lVarV.B(objI);
                    } else {
                        objI = new a(str5, strC);
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    d dVarH115 = x.h(androidx.compose.foundation.selection.c.b(g4.o.d(dVarK115, false, (wn0.l) objI, 1, null), z13, z14, g4.i.h(g4.i.INSTANCE.b()), onValueChange), BitmapDescriptorFactory.HUE_RED, 1, null);
                    companion = c.INSTANCE;
                    c.InterfaceC1212c interfaceC1212cI115 = companion.i();
                    lVarV.H(693286680);
                    i0 i0VarB115 = e0.b(v1.b.f117444a.f(), interfaceC1212cI115, lVarV, 48);
                    lVarV.H(-1323940314);
                    iA = j.a(lVarV, 0);
                    p020r2.x xVarC115 = lVarV.c();
                    g.Companion companion116 = g.INSTANCE;
                    aVarA = companion116.a();
                    q<y2<g>, p020r2.l, Integer, h0> qVarA115 = a0.a(dVarH115);
                    if (lVarV.w() == null) {
                        j.c();
                    }
                    lVarV.h();
                    if (lVarV.u()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d dVar119 = dVar3;
                    d4.b(lVarA, i0VarB115, companion116.c());
                    d4.b(lVarA, xVarC115, companion116.e());
                    pVarB = companion116.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    qVarA115.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                    lVarV.H(2058660585);
                    h0Var = v1.h0.f117504a;
                    boolean z1111116 = z13;
                    boolean z1111117 = z14;
                    l90.a.a(z1111116, null, null, z1111117, lVarV, ((i13 >> 6) & 14) | 48 | ((i13 >> 3) & 7168), 4);
                    lVarV.H(2045524722);
                    if (str6 != null) {
                        f0.a(str6, h0Var.b(t.m(d.INSTANCE, h.g(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), companion.i()), lVarV, (i13 >> 9) & 14, 0);
                    }
                    lVarV.T();
                    lVarV.T();
                    lVarV.g();
                    lVarV.T();
                    lVarV.T();
                    if (o.J()) {
                        o.R();
                    }
                    str7 = str5;
                    str8 = str6;
                    z16 = z1111116;
                    z17 = z1111117;
                    dVar4 = dVar119;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(dVar4, str7, z16, str8, z17, onValueChange, i11, i12));
                }
            }
            i21 = 196608;
            i13 |= i21;
            if ((i13 & 374491) == 74898) {
                if (i23 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i24 != 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                if (i14 != 0) {
                    z13 = false;
                }
                if (i16 != 0) {
                    str6 = null;
                } else {
                    str6 = str4;
                }
                if (i18 != 0) {
                    z14 = false;
                }
                if (o.J()) {
                    o.S(1416537179, i13, -1, "com.stripe.android.uicore.elements.CheckboxElementUI (CheckboxElementUI.kt:28)");
                }
                if (z13) {
                    i22 = i.f59326l;
                } else {
                    i22 = i.f59323i;
                }
                strC = e4.i.c(i22, lVarV, 0);
                f11 = 4;
                d dVarK116 = t.k(dVar3, BitmapDescriptorFactory.HUE_RED, h.g(f11), 1, null);
                lVarV.H(-1271039659);
                if ((i13 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zN = z15 | lVarV.n(strC);
                objI = lVarV.I();
                if (zN) {
                    objI = new a(str5, strC);
                    lVarV.B(objI);
                } else {
                    objI = new a(str5, strC);
                    lVarV.B(objI);
                }
                lVarV.T();
                d dVarH116 = x.h(androidx.compose.foundation.selection.c.b(g4.o.d(dVarK116, false, (wn0.l) objI, 1, null), z13, z14, g4.i.h(g4.i.INSTANCE.b()), onValueChange), BitmapDescriptorFactory.HUE_RED, 1, null);
                companion = c.INSTANCE;
                c.InterfaceC1212c interfaceC1212cI116 = companion.i();
                lVarV.H(693286680);
                i0 i0VarB116 = e0.b(v1.b.f117444a.f(), interfaceC1212cI116, lVarV, 48);
                lVarV.H(-1323940314);
                iA = j.a(lVarV, 0);
                p020r2.x xVarC116 = lVarV.c();
                g.Companion companion117 = g.INSTANCE;
                aVarA = companion117.a();
                q<y2<g>, p020r2.l, Integer, h0> qVarA116 = a0.a(dVarH116);
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.u()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d dVar1110 = dVar3;
                d4.b(lVarA, i0VarB116, companion117.c());
                d4.b(lVarA, xVarC116, companion117.e());
                pVarB = companion117.b();
                if (lVarA.u()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA116.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                h0Var = v1.h0.f117504a;
                boolean z1111118 = z13;
                boolean z1111119 = z14;
                l90.a.a(z1111118, null, null, z1111119, lVarV, ((i13 >> 6) & 14) | 48 | ((i13 >> 3) & 7168), 4);
                lVarV.H(2045524722);
                if (str6 != null) {
                    f0.a(str6, h0Var.b(t.m(d.INSTANCE, h.g(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), companion.i()), lVarV, (i13 >> 9) & 14, 0);
                }
                lVarV.T();
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                if (o.J()) {
                    o.R();
                }
                str7 = str5;
                str8 = str6;
                z16 = z1111118;
                z17 = z1111119;
                dVar4 = dVar1110;
            } else {
                if (i23 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i24 != 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                if (i14 != 0) {
                    z13 = false;
                }
                if (i16 != 0) {
                    str6 = null;
                } else {
                    str6 = str4;
                }
                if (i18 != 0) {
                    z14 = false;
                }
                if (o.J()) {
                    o.S(1416537179, i13, -1, "com.stripe.android.uicore.elements.CheckboxElementUI (CheckboxElementUI.kt:28)");
                }
                if (z13) {
                    i22 = i.f59326l;
                } else {
                    i22 = i.f59323i;
                }
                strC = e4.i.c(i22, lVarV, 0);
                f11 = 4;
                d dVarK117 = t.k(dVar3, BitmapDescriptorFactory.HUE_RED, h.g(f11), 1, null);
                lVarV.H(-1271039659);
                if ((i13 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zN = z15 | lVarV.n(strC);
                objI = lVarV.I();
                if (zN) {
                    objI = new a(str5, strC);
                    lVarV.B(objI);
                } else {
                    objI = new a(str5, strC);
                    lVarV.B(objI);
                }
                lVarV.T();
                d dVarH117 = x.h(androidx.compose.foundation.selection.c.b(g4.o.d(dVarK117, false, (wn0.l) objI, 1, null), z13, z14, g4.i.h(g4.i.INSTANCE.b()), onValueChange), BitmapDescriptorFactory.HUE_RED, 1, null);
                companion = c.INSTANCE;
                c.InterfaceC1212c interfaceC1212cI117 = companion.i();
                lVarV.H(693286680);
                i0 i0VarB117 = e0.b(v1.b.f117444a.f(), interfaceC1212cI117, lVarV, 48);
                lVarV.H(-1323940314);
                iA = j.a(lVarV, 0);
                p020r2.x xVarC117 = lVarV.c();
                g.Companion companion118 = g.INSTANCE;
                aVarA = companion118.a();
                q<y2<g>, p020r2.l, Integer, h0> qVarA117 = a0.a(dVarH117);
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.u()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d dVar1111 = dVar3;
                d4.b(lVarA, i0VarB117, companion118.c());
                d4.b(lVarA, xVarC117, companion118.e());
                pVarB = companion118.b();
                if (lVarA.u()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA117.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                h0Var = v1.h0.f117504a;
                boolean z11111110 = z13;
                boolean z11111111 = z14;
                l90.a.a(z11111110, null, null, z11111111, lVarV, ((i13 >> 6) & 14) | 48 | ((i13 >> 3) & 7168), 4);
                lVarV.H(2045524722);
                if (str6 != null) {
                    f0.a(str6, h0Var.b(t.m(d.INSTANCE, h.g(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), companion.i()), lVarV, (i13 >> 9) & 14, 0);
                }
                lVarV.T();
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                if (o.J()) {
                    o.R();
                }
                str7 = str5;
                str8 = str6;
                z16 = z11111110;
                z17 = z11111111;
                dVar4 = dVar1111;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(dVar4, str7, z16, str8, z17, onValueChange, i11, i12));
            }
        }
        i13 |= 3072;
        str4 = str2;
        i18 = i12 & 16;
        if (i18 != 0) {
            i13 |= 24576;
            z14 = z12;
        } else {
            z14 = z12;
            if ((i11 & 57344) == 0) {
                if (lVarV.p(z14)) {
                    i19 = 16384;
                } else {
                    i19 = PKIFailureInfo.certRevoked;
                }
                i13 |= i19;
            }
        }
        if ((i12 & 32) != 0) {
            if ((i11 & 458752) == 0) {
                if (lVarV.K(onValueChange)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
            }
            if ((i13 & 374491) == 74898) {
                if (i23 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i24 != 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                if (i14 != 0) {
                    z13 = false;
                }
                if (i16 != 0) {
                    str6 = null;
                } else {
                    str6 = str4;
                }
                if (i18 != 0) {
                    z14 = false;
                }
                if (o.J()) {
                    o.S(1416537179, i13, -1, "com.stripe.android.uicore.elements.CheckboxElementUI (CheckboxElementUI.kt:28)");
                }
                if (z13) {
                    i22 = i.f59326l;
                } else {
                    i22 = i.f59323i;
                }
                strC = e4.i.c(i22, lVarV, 0);
                f11 = 4;
                d dVarK118 = t.k(dVar3, BitmapDescriptorFactory.HUE_RED, h.g(f11), 1, null);
                lVarV.H(-1271039659);
                if ((i13 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zN = z15 | lVarV.n(strC);
                objI = lVarV.I();
                if (zN) {
                    objI = new a(str5, strC);
                    lVarV.B(objI);
                } else {
                    objI = new a(str5, strC);
                    lVarV.B(objI);
                }
                lVarV.T();
                d dVarH118 = x.h(androidx.compose.foundation.selection.c.b(g4.o.d(dVarK118, false, (wn0.l) objI, 1, null), z13, z14, g4.i.h(g4.i.INSTANCE.b()), onValueChange), BitmapDescriptorFactory.HUE_RED, 1, null);
                companion = c.INSTANCE;
                c.InterfaceC1212c interfaceC1212cI118 = companion.i();
                lVarV.H(693286680);
                i0 i0VarB118 = e0.b(v1.b.f117444a.f(), interfaceC1212cI118, lVarV, 48);
                lVarV.H(-1323940314);
                iA = j.a(lVarV, 0);
                p020r2.x xVarC118 = lVarV.c();
                g.Companion companion119 = g.INSTANCE;
                aVarA = companion119.a();
                q<y2<g>, p020r2.l, Integer, h0> qVarA118 = a0.a(dVarH118);
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.u()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d dVar1112 = dVar3;
                d4.b(lVarA, i0VarB118, companion119.c());
                d4.b(lVarA, xVarC118, companion119.e());
                pVarB = companion119.b();
                if (lVarA.u()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA118.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                h0Var = v1.h0.f117504a;
                boolean z11111112 = z13;
                boolean z11111113 = z14;
                l90.a.a(z11111112, null, null, z11111113, lVarV, ((i13 >> 6) & 14) | 48 | ((i13 >> 3) & 7168), 4);
                lVarV.H(2045524722);
                if (str6 != null) {
                    f0.a(str6, h0Var.b(t.m(d.INSTANCE, h.g(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), companion.i()), lVarV, (i13 >> 9) & 14, 0);
                }
                lVarV.T();
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                if (o.J()) {
                    o.R();
                }
                str7 = str5;
                str8 = str6;
                z16 = z11111112;
                z17 = z11111113;
                dVar4 = dVar1112;
            } else {
                if (i23 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i24 != 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                if (i14 != 0) {
                    z13 = false;
                }
                if (i16 != 0) {
                    str6 = null;
                } else {
                    str6 = str4;
                }
                if (i18 != 0) {
                    z14 = false;
                }
                if (o.J()) {
                    o.S(1416537179, i13, -1, "com.stripe.android.uicore.elements.CheckboxElementUI (CheckboxElementUI.kt:28)");
                }
                if (z13) {
                    i22 = i.f59326l;
                } else {
                    i22 = i.f59323i;
                }
                strC = e4.i.c(i22, lVarV, 0);
                f11 = 4;
                d dVarK119 = t.k(dVar3, BitmapDescriptorFactory.HUE_RED, h.g(f11), 1, null);
                lVarV.H(-1271039659);
                if ((i13 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zN = z15 | lVarV.n(strC);
                objI = lVarV.I();
                if (zN) {
                    objI = new a(str5, strC);
                    lVarV.B(objI);
                } else {
                    objI = new a(str5, strC);
                    lVarV.B(objI);
                }
                lVarV.T();
                d dVarH119 = x.h(androidx.compose.foundation.selection.c.b(g4.o.d(dVarK119, false, (wn0.l) objI, 1, null), z13, z14, g4.i.h(g4.i.INSTANCE.b()), onValueChange), BitmapDescriptorFactory.HUE_RED, 1, null);
                companion = c.INSTANCE;
                c.InterfaceC1212c interfaceC1212cI119 = companion.i();
                lVarV.H(693286680);
                i0 i0VarB119 = e0.b(v1.b.f117444a.f(), interfaceC1212cI119, lVarV, 48);
                lVarV.H(-1323940314);
                iA = j.a(lVarV, 0);
                p020r2.x xVarC119 = lVarV.c();
                g.Companion companion1110 = g.INSTANCE;
                aVarA = companion1110.a();
                q<y2<g>, p020r2.l, Integer, h0> qVarA119 = a0.a(dVarH119);
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.u()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d dVar1113 = dVar3;
                d4.b(lVarA, i0VarB119, companion1110.c());
                d4.b(lVarA, xVarC119, companion1110.e());
                pVarB = companion1110.b();
                if (lVarA.u()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA119.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                h0Var = v1.h0.f117504a;
                boolean z11111114 = z13;
                boolean z11111115 = z14;
                l90.a.a(z11111114, null, null, z11111115, lVarV, ((i13 >> 6) & 14) | 48 | ((i13 >> 3) & 7168), 4);
                lVarV.H(2045524722);
                if (str6 != null) {
                    f0.a(str6, h0Var.b(t.m(d.INSTANCE, h.g(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), companion.i()), lVarV, (i13 >> 9) & 14, 0);
                }
                lVarV.T();
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                if (o.J()) {
                    o.R();
                }
                str7 = str5;
                str8 = str6;
                z16 = z11111114;
                z17 = z11111115;
                dVar4 = dVar1113;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(dVar4, str7, z16, str8, z17, onValueChange, i11, i12));
            }
        }
        i21 = 196608;
        i13 |= i21;
        if ((i13 & 374491) == 74898) {
            if (i23 != 0) {
                dVar3 = d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i24 != 0) {
                str5 = "";
            } else {
                str5 = str3;
            }
            if (i14 != 0) {
                z13 = false;
            }
            if (i16 != 0) {
                str6 = null;
            } else {
                str6 = str4;
            }
            if (i18 != 0) {
                z14 = false;
            }
            if (o.J()) {
                o.S(1416537179, i13, -1, "com.stripe.android.uicore.elements.CheckboxElementUI (CheckboxElementUI.kt:28)");
            }
            if (z13) {
                i22 = i.f59326l;
            } else {
                i22 = i.f59323i;
            }
            strC = e4.i.c(i22, lVarV, 0);
            f11 = 4;
            d dVarK1110 = t.k(dVar3, BitmapDescriptorFactory.HUE_RED, h.g(f11), 1, null);
            lVarV.H(-1271039659);
            if ((i13 & 112) == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            zN = z15 | lVarV.n(strC);
            objI = lVarV.I();
            if (zN) {
                objI = new a(str5, strC);
                lVarV.B(objI);
            } else {
                objI = new a(str5, strC);
                lVarV.B(objI);
            }
            lVarV.T();
            d dVarH1110 = x.h(androidx.compose.foundation.selection.c.b(g4.o.d(dVarK1110, false, (wn0.l) objI, 1, null), z13, z14, g4.i.h(g4.i.INSTANCE.b()), onValueChange), BitmapDescriptorFactory.HUE_RED, 1, null);
            companion = c.INSTANCE;
            c.InterfaceC1212c interfaceC1212cI1110 = companion.i();
            lVarV.H(693286680);
            i0 i0VarB1110 = e0.b(v1.b.f117444a.f(), interfaceC1212cI1110, lVarV, 48);
            lVarV.H(-1323940314);
            iA = j.a(lVarV, 0);
            p020r2.x xVarC1110 = lVarV.c();
            g.Companion companion1111 = g.INSTANCE;
            aVarA = companion1111.a();
            q<y2<g>, p020r2.l, Integer, h0> qVarA1110 = a0.a(dVarH1110);
            if (lVarV.w() == null) {
                j.c();
            }
            lVarV.h();
            if (lVarV.u()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            lVarA = d4.a(lVarV);
            d dVar1114 = dVar3;
            d4.b(lVarA, i0VarB1110, companion1111.c());
            d4.b(lVarA, xVarC1110, companion1111.e());
            pVarB = companion1111.b();
            if (lVarA.u()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA1110.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            h0Var = v1.h0.f117504a;
            boolean z11111116 = z13;
            boolean z11111117 = z14;
            l90.a.a(z11111116, null, null, z11111117, lVarV, ((i13 >> 6) & 14) | 48 | ((i13 >> 3) & 7168), 4);
            lVarV.H(2045524722);
            if (str6 != null) {
                f0.a(str6, h0Var.b(t.m(d.INSTANCE, h.g(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), companion.i()), lVarV, (i13 >> 9) & 14, 0);
            }
            lVarV.T();
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            if (o.J()) {
                o.R();
            }
            str7 = str5;
            str8 = str6;
            z16 = z11111116;
            z17 = z11111117;
            dVar4 = dVar1114;
        } else {
            if (i23 != 0) {
                dVar3 = d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i24 != 0) {
                str5 = "";
            } else {
                str5 = str3;
            }
            if (i14 != 0) {
                z13 = false;
            }
            if (i16 != 0) {
                str6 = null;
            } else {
                str6 = str4;
            }
            if (i18 != 0) {
                z14 = false;
            }
            if (o.J()) {
                o.S(1416537179, i13, -1, "com.stripe.android.uicore.elements.CheckboxElementUI (CheckboxElementUI.kt:28)");
            }
            if (z13) {
                i22 = i.f59326l;
            } else {
                i22 = i.f59323i;
            }
            strC = e4.i.c(i22, lVarV, 0);
            f11 = 4;
            d dVarK1111 = t.k(dVar3, BitmapDescriptorFactory.HUE_RED, h.g(f11), 1, null);
            lVarV.H(-1271039659);
            if ((i13 & 112) == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            zN = z15 | lVarV.n(strC);
            objI = lVarV.I();
            if (zN) {
                objI = new a(str5, strC);
                lVarV.B(objI);
            } else {
                objI = new a(str5, strC);
                lVarV.B(objI);
            }
            lVarV.T();
            d dVarH1111 = x.h(androidx.compose.foundation.selection.c.b(g4.o.d(dVarK1111, false, (wn0.l) objI, 1, null), z13, z14, g4.i.h(g4.i.INSTANCE.b()), onValueChange), BitmapDescriptorFactory.HUE_RED, 1, null);
            companion = c.INSTANCE;
            c.InterfaceC1212c interfaceC1212cI1111 = companion.i();
            lVarV.H(693286680);
            i0 i0VarB1111 = e0.b(v1.b.f117444a.f(), interfaceC1212cI1111, lVarV, 48);
            lVarV.H(-1323940314);
            iA = j.a(lVarV, 0);
            p020r2.x xVarC1111 = lVarV.c();
            g.Companion companion1112 = g.INSTANCE;
            aVarA = companion1112.a();
            q<y2<g>, p020r2.l, Integer, h0> qVarA1111 = a0.a(dVarH1111);
            if (lVarV.w() == null) {
                j.c();
            }
            lVarV.h();
            if (lVarV.u()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            lVarA = d4.a(lVarV);
            d dVar1115 = dVar3;
            d4.b(lVarA, i0VarB1111, companion1112.c());
            d4.b(lVarA, xVarC1111, companion1112.e());
            pVarB = companion1112.b();
            if (lVarA.u()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA1111.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            h0Var = v1.h0.f117504a;
            boolean z11111118 = z13;
            boolean z11111119 = z14;
            l90.a.a(z11111118, null, null, z11111119, lVarV, ((i13 >> 6) & 14) | 48 | ((i13 >> 3) & 7168), 4);
            lVarV.H(2045524722);
            if (str6 != null) {
                f0.a(str6, h0Var.b(t.m(d.INSTANCE, h.g(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), companion.i()), lVarV, (i13 >> 9) & 14, 0);
            }
            lVarV.T();
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            if (o.J()) {
                o.R();
            }
            str7 = str5;
            str8 = str6;
            z16 = z11111118;
            z17 = z11111119;
            dVar4 = dVar1115;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(dVar4, str7, z16, str8, z17, onValueChange, i11, i12));
        }
    }
}
