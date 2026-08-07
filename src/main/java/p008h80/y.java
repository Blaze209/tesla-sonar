package p008h80;

import androidx.compose.foundation.layout.i;
import androidx.compose.foundation.layout.x;
import androidx.compose.ui.platform.s2;
import b4.g;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f90.n;
import jn0.h0;
import k3.q1;
import o90.f;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
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
import p020r2.y2;
import q1.b0;
import wn0.p;
import wn0.q;
import z3.a0;
import z3.i0;
import z3.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aC\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a1\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"", "iconRes", "", "iconUrl", "Lo90/f;", "imageLoader", "", "iconRequiresTinting", "Landroidx/compose/ui/d;", "modifier", "Ld3/c;", "contentAlignment", "Ljn0/h0;", "a", "(ILjava/lang/String;Lo90/f;ZLandroidx/compose/ui/d;Ld3/c;Lr2/l;II)V", "Lk3/q1;", "colorFilter", "alignment", "b", "(ILk3/q1;Ld3/c;Landroidx/compose/ui/d;Lr2/l;I)V", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class y {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/e;", "Ljn0/h0;", "a", "(Lv1/e;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements q<v1.e, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f71690c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super l, ? super Integer, h0> pVar) {
            super(3);
            this.f71690c = pVar;
        }

        public final void a(v1.e StripeImage, l lVar, int i11) {
            s.k(StripeImage, "$this$StripeImage");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-1956875215, i11, -1, "com.stripe.android.paymentsheet.ui.PaymentMethodIcon.<anonymous>.<anonymous> (PaymentMethodIcon.kt:62)");
            }
            this.f71690c.invoke(lVar, 6);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(v1.e eVar, l lVar, Integer num) {
            a(eVar, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/e;", "Ljn0/h0;", "a", "(Lv1/e;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements q<v1.e, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f71691c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p<? super l, ? super Integer, h0> pVar) {
            super(3);
            this.f71691c = pVar;
        }

        public final void a(v1.e StripeImage, l lVar, int i11) {
            s.k(StripeImage, "$this$StripeImage");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-155295931, i11, -1, "com.stripe.android.paymentsheet.ui.PaymentMethodIcon.<anonymous>.<anonymous> (PaymentMethodIcon.kt:61)");
            }
            this.f71691c.invoke(lVar, 6);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(v1.e eVar, l lVar, Integer num) {
            a(eVar, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f71692c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f71693d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f71694e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f71695f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f71696g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ d3.c f71697h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f71698i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f71699j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11, String str, f fVar, boolean z11, androidx.compose.ui.d dVar, d3.c cVar, int i12, int i13) {
            super(2);
            this.f71692c = i11;
            this.f71693d = str;
            this.f71694e = fVar;
            this.f71695f = z11;
            this.f71696g = dVar;
            this.f71697h = cVar;
            this.f71698i = i12;
            this.f71699j = i13;
        }

        public final void a(l lVar, int i11) {
            y.a(this.f71692c, this.f71693d, this.f71694e, this.f71695f, this.f71696g, this.f71697h, lVar, k2.a(this.f71698i | 1), this.f71699j);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f71700c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ q1 f71701d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ d3.c f71702e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f71703f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i11, q1 q1Var, d3.c cVar, androidx.compose.ui.d dVar) {
            super(2);
            this.f71700c = i11;
            this.f71701d = q1Var;
            this.f71702e = cVar;
            this.f71703f = dVar;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-1193756126, i11, -1, "com.stripe.android.paymentsheet.ui.PaymentMethodIcon.<anonymous> (PaymentMethodIcon.kt:43)");
            }
            y.b(this.f71700c, this.f71701d, this.f71702e, this.f71703f, lVar, 3072);
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

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class e extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f71704c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ q1 f71705d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ d3.c f71706e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f71707f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f71708g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i11, q1 q1Var, d3.c cVar, androidx.compose.ui.d dVar, int i12) {
            super(2);
            this.f71704c = i11;
            this.f71705d = q1Var;
            this.f71706e = cVar;
            this.f71707f = dVar;
            this.f71708g = i12;
        }

        public final void a(l lVar, int i11) {
            y.b(this.f71704c, this.f71705d, this.f71706e, this.f71707f, lVar, k2.a(this.f71708g | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:103:0x0219  */
    /* JADX WARN: Code duplicated, block: B:106:0x023b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0245  */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:82:0x0100  */
    /* JADX WARN: Code duplicated, block: B:84:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x010a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0118  */
    /* JADX WARN: Code duplicated, block: B:90:0x0166  */
    /* JADX WARN: Code duplicated, block: B:93:0x0172  */
    /* JADX WARN: Code duplicated, block: B:94:0x0176  */
    /* JADX WARN: Code duplicated, block: B:97:0x0195  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a3  */
    public static final void a(int i11, String str, f imageLoader, boolean z11, androidx.compose.ui.d modifier, d3.c cVar, l lVar, int i12, int i13) {
        int i14;
        d3.c cVar2;
        d3.c cVarO;
        long onComponent;
        boolean z12;
        Object objI;
        androidx.compose.ui.d dVarF;
        z2.a aVarB;
        int iA;
        wn0.a<g> aVarA;
        l lVarA;
        p<g, Integer, h0> pVarB;
        d3.c cVar3;
        w2 w2VarX;
        s.k(imageLoader, "imageLoader");
        s.k(modifier, "modifier");
        l lVarV = lVar.v(36976951);
        if ((i13 & 1) != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            i14 = (lVarV.r(i11) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i12 & 112) == 0) {
            i14 |= lVarV.n(str) ? 32 : 16;
        }
        if ((i13 & 4) != 0) {
            i14 |= KyberEngine.KyberPolyBytes;
        } else if ((i12 & 896) == 0) {
            i14 |= lVarV.n(imageLoader) ? 256 : 128;
        }
        if ((i13 & 8) != 0) {
            i14 |= 3072;
        } else if ((i12 & 7168) == 0) {
            i14 |= lVarV.p(z11) ? 2048 : 1024;
        }
        if ((i13 & 16) != 0) {
            i14 |= 24576;
        } else if ((57344 & i12) == 0) {
            i14 |= lVarV.n(modifier) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i15 = i13 & 32;
        if (i15 == 0) {
            if ((458752 & i12) == 0) {
                cVar2 = cVar;
                i14 |= lVarV.n(cVar2) ? 131072 : 65536;
            }
            if ((374491 & i14) == 74898 || !lVarV.b()) {
                if (i15 != 0) {
                    cVarO = d3.c.INSTANCE.o();
                } else {
                    cVarO = cVar2;
                }
                if (o.J()) {
                    o.S(36976951, i14, -1, "com.stripe.android.paymentsheet.ui.PaymentMethodIcon (PaymentMethodIcon.kt:32)");
                }
                onComponent = n.n(j1.f74525a, lVarV, j1.f74526b).getOnComponent();
                lVarV.H(-1907727872);
                if ((i14 & 7168) == 2048) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objI = lVarV.I();
                if (z12 || objI == l.INSTANCE.a()) {
                    if (z11) {
                        objI = q1.Companion.b(q1.INSTANCE, onComponent, 0, 2, null);
                    } else {
                        objI = null;
                    }
                    lVarV.B(objI);
                }
                lVarV.T();
                dVarF = x.f(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
                aVarB = z2.c.b(lVarV, -1193756126, true, new d(i11, (q1) objI, cVarO, dVarF));
                lVarV.H(733328855);
                i0 i0VarJ = androidx.compose.foundation.layout.g.j(cVarO, false, lVarV, (((i14 >> 12) & 126) >> 3) & 14);
                lVarV.H(-1323940314);
                iA = j.a(lVarV, 0);
                p020r2.x xVarC = lVarV.c();
                g.Companion companion = g.INSTANCE;
                aVarA = companion.a();
                q<y2<g>, l, Integer, h0> qVarA = a0.a(modifier);
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
                d4.b(lVarA, i0VarJ, companion.c());
                d4.b(lVarA, xVarC, companion.e());
                pVarB = companion.b();
                if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                i iVar = i.f4585a;
                if (str != null) {
                    lVarV.H(-1027122638);
                    k kVarE = k.INSTANCE.e();
                    z2.a aVarB2 = z2.c.b(lVarV, -1956875215, true, new a(aVarB));
                    z2.a aVarB3 = z2.c.b(lVarV, -155295931, true, new b(aVarB));
                    int i16 = i14 >> 3;
                    int i17 = (i16 & 112) | (i16 & 14) | 905997696 | (f.f96995g << 3) | ((i14 << 6) & 29360128);
                    d3.c cVar4 = cVarO;
                    com.stripe.android.uicore.image.a.a(str, imageLoader, null, dVarF, kVarE, null, null, cVar4, true, aVarB2, aVarB3, lVarV, i17, 6, 96);
                    cVarO = cVar4;
                    lVarV.T();
                } else {
                    lVarV.H(-1026676207);
                    aVarB.invoke(lVarV, 6);
                    lVarV.T();
                }
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                if (o.J()) {
                    o.R();
                }
                cVar3 = cVarO;
            } else {
                lVarV.j();
                cVar3 = cVar2;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new c(i11, str, imageLoader, z11, modifier, cVar3, i12, i13));
            }
        }
        i14 |= 196608;
        cVar2 = cVar;
        if ((374491 & i14) == 74898) {
            if (i15 != 0) {
                cVarO = d3.c.INSTANCE.o();
            } else {
                cVarO = cVar2;
            }
            if (o.J()) {
                o.S(36976951, i14, -1, "com.stripe.android.paymentsheet.ui.PaymentMethodIcon (PaymentMethodIcon.kt:32)");
            }
            onComponent = n.n(j1.f74525a, lVarV, j1.f74526b).getOnComponent();
            lVarV.H(-1907727872);
            if ((i14 & 7168) == 2048) {
                z12 = true;
            } else {
                z12 = false;
            }
            objI = lVarV.I();
            if (z12) {
                if (z11) {
                    objI = q1.Companion.b(q1.INSTANCE, onComponent, 0, 2, null);
                } else {
                    objI = null;
                }
                lVarV.B(objI);
            } else {
                if (z11) {
                    objI = q1.Companion.b(q1.INSTANCE, onComponent, 0, 2, null);
                } else {
                    objI = null;
                }
                lVarV.B(objI);
            }
            lVarV.T();
            dVarF = x.f(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            aVarB = z2.c.b(lVarV, -1193756126, true, new d(i11, (q1) objI, cVarO, dVarF));
            lVarV.H(733328855);
            i0 i0VarJ2 = androidx.compose.foundation.layout.g.j(cVarO, false, lVarV, (((i14 >> 12) & 126) >> 3) & 14);
            lVarV.H(-1323940314);
            iA = j.a(lVarV, 0);
            p020r2.x xVarC2 = lVarV.c();
            g.Companion companion2 = g.INSTANCE;
            aVarA = companion2.a();
            q<y2<g>, l, Integer, h0> qVarA2 = a0.a(modifier);
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
            d4.b(lVarA, i0VarJ2, companion2.c());
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
            i iVar2 = i.f4585a;
            if (str != null) {
                lVarV.H(-1027122638);
                k kVarE2 = k.INSTANCE.e();
                z2.a aVarB4 = z2.c.b(lVarV, -1956875215, true, new a(aVarB));
                z2.a aVarB5 = z2.c.b(lVarV, -155295931, true, new b(aVarB));
                int i18 = i14 >> 3;
                int i19 = (i18 & 112) | (i18 & 14) | 905997696 | (f.f96995g << 3) | ((i14 << 6) & 29360128);
                d3.c cVar5 = cVarO;
                com.stripe.android.uicore.image.a.a(str, imageLoader, null, dVarF, kVarE2, null, null, cVar5, true, aVarB4, aVarB5, lVarV, i19, 6, 96);
                cVarO = cVar5;
                lVarV.T();
            } else {
                lVarV.H(-1026676207);
                aVarB.invoke(lVarV, 6);
                lVarV.T();
            }
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            if (o.J()) {
                o.R();
            }
            cVar3 = cVarO;
        } else {
            if (i15 != 0) {
                cVarO = d3.c.INSTANCE.o();
            } else {
                cVarO = cVar2;
            }
            if (o.J()) {
                o.S(36976951, i14, -1, "com.stripe.android.paymentsheet.ui.PaymentMethodIcon (PaymentMethodIcon.kt:32)");
            }
            onComponent = n.n(j1.f74525a, lVarV, j1.f74526b).getOnComponent();
            lVarV.H(-1907727872);
            if ((i14 & 7168) == 2048) {
                z12 = true;
            } else {
                z12 = false;
            }
            objI = lVarV.I();
            if (z12) {
                if (z11) {
                    objI = q1.Companion.b(q1.INSTANCE, onComponent, 0, 2, null);
                } else {
                    objI = null;
                }
                lVarV.B(objI);
            } else {
                if (z11) {
                    objI = q1.Companion.b(q1.INSTANCE, onComponent, 0, 2, null);
                } else {
                    objI = null;
                }
                lVarV.B(objI);
            }
            lVarV.T();
            dVarF = x.f(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null);
            aVarB = z2.c.b(lVarV, -1193756126, true, new d(i11, (q1) objI, cVarO, dVarF));
            lVarV.H(733328855);
            i0 i0VarJ3 = androidx.compose.foundation.layout.g.j(cVarO, false, lVarV, (((i14 >> 12) & 126) >> 3) & 14);
            lVarV.H(-1323940314);
            iA = j.a(lVarV, 0);
            p020r2.x xVarC3 = lVarV.c();
            g.Companion companion3 = g.INSTANCE;
            aVarA = companion3.a();
            q<y2<g>, l, Integer, h0> qVarA3 = a0.a(modifier);
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
            d4.b(lVarA, i0VarJ3, companion3.c());
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
            i iVar3 = i.f4585a;
            if (str != null) {
                lVarV.H(-1027122638);
                k kVarE3 = k.INSTANCE.e();
                z2.a aVarB6 = z2.c.b(lVarV, -1956875215, true, new a(aVarB));
                z2.a aVarB7 = z2.c.b(lVarV, -155295931, true, new b(aVarB));
                int i110 = i14 >> 3;
                int i111 = (i110 & 112) | (i110 & 14) | 905997696 | (f.f96995g << 3) | ((i14 << 6) & 29360128);
                d3.c cVar6 = cVarO;
                com.stripe.android.uicore.image.a.a(str, imageLoader, null, dVarF, kVarE3, null, null, cVar6, true, aVarB6, aVarB7, lVarV, i111, 6, 96);
                cVarO = cVar6;
                lVarV.T();
            } else {
                lVarV.H(-1026676207);
                aVarB.invoke(lVarV, 6);
                lVarV.T();
            }
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            if (o.J()) {
                o.R();
            }
            cVar3 = cVarO;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new c(i11, str, imageLoader, z11, modifier, cVar3, i12, i13));
        }
    }

    public static final void b(int i11, q1 q1Var, d3.c alignment, androidx.compose.ui.d modifier, l lVar, int i12) {
        int i13;
        s.k(alignment, "alignment");
        s.k(modifier, "modifier");
        l lVarV = lVar.v(-808382466);
        if ((i12 & 14) == 0) {
            i13 = (lVarV.r(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= lVarV.n(q1Var) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= lVarV.n(alignment) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= lVarV.n(modifier) ? 2048 : 1024;
        }
        if ((i13 & 5851) == 1170 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(-808382466, i13, -1, "com.stripe.android.paymentsheet.ui.PaymentMethodIconFromResource (PaymentMethodIcon.kt:79)");
            }
            if (i11 != 0) {
                b0.a(e4.e.c(i11, lVarV, i13 & 14), null, s2.a(modifier, "PaymentMethodIconFomRes"), alignment, null, BitmapDescriptorFactory.HUE_RED, q1Var, lVarV, ((i13 << 3) & 7168) | 56 | ((i13 << 15) & 3670016), 48);
            }
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new e(i11, q1Var, alignment, modifier, i12));
        }
    }
}
