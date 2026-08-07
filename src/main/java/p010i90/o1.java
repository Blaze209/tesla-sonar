package p010i90;

import androidx.compose.foundation.layout.t;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import e4.i;
import f90.n;
import g4.v;
import g4.y;
import jn0.h0;
import k3.g4;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p009i2.j1;
import p009i2.m;
import p009i2.v2;
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
import q1.BorderStroke;
import w4.h;
import wn0.p;
import wn0.q;
import z3.a0;
import z3.i0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aa\u0010\r\u001a\u00020\n2\n\b\u0001\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0010\u001a\u00020\n2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001aR\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"", "title", "", AnalyticsAttribute.Error, "Landroidx/compose/ui/d;", "modifier", "", "isSelected", "addVerticalPadding", "Lkotlin/Function0;", "Ljn0/h0;", "contentOutsideCard", "contentInCard", "a", "(Ljava/lang/Integer;Ljava/lang/String;Landroidx/compose/ui/d;ZZLwn0/p;Lwn0/p;Lr2/l;II)V", "titleText", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Integer;Lr2/l;I)V", "Lk3/g4;", "shape", "Lk3/p1;", "backgroundColor", "Lq1/g;", "border", "content", "b", "(Landroidx/compose/ui/d;Lk3/g4;ZJLq1/g;Lwn0/p;Lr2/l;II)V", "c", "(Ljava/lang/String;Lr2/l;I)V", "stripe-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class o1 {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Integer f76793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f76794d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f76795e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f76796f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f76797g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f76798h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f76799i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f76800j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f76801k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Integer num, String str, androidx.compose.ui.d dVar, boolean z11, boolean z12, p<? super l, ? super Integer, h0> pVar, p<? super l, ? super Integer, h0> pVar2, int i11, int i12) {
            super(2);
            this.f76793c = num;
            this.f76794d = str;
            this.f76795e = dVar;
            this.f76796f = z11;
            this.f76797g = z12;
            this.f76798h = pVar;
            this.f76799i = pVar2;
            this.f76800j = i11;
            this.f76801k = i12;
        }

        public final void a(l lVar, int i11) {
            o1.a(this.f76793c, this.f76794d, this.f76795e, this.f76796f, this.f76797g, this.f76798h, this.f76799i, lVar, k2.a(this.f76800j | 1), this.f76801k);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f76802c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p<? super l, ? super Integer, h0> pVar) {
            super(2);
            this.f76802c = pVar;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-72062207, i11, -1, "com.stripe.android.uicore.elements.SectionCard.<anonymous> (SectionUI.kt:93)");
            }
            p<l, Integer, h0> pVar = this.f76802c;
            lVar.H(-483455358);
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            i0 i0VarA = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVar, 0);
            lVar.H(-1323940314);
            int iA = j.a(lVar, 0);
            x xVarC = lVar.c();
            b4.g.Companion companion2 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion2.a();
            q<y2<b4.g>, l, Integer, h0> qVarA = a0.a(companion);
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
            qVarA.invoke(y2.a(y2.b(lVar)), lVar, 0);
            lVar.H(2058660585);
            v1.j jVar = v1.j.f117505a;
            pVar.invoke(lVar, 0);
            lVar.T();
            lVar.g();
            lVar.T();
            lVar.T();
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
    static final class c extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f76803c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g4 f76804d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f76805e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f76806f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ BorderStroke f76807g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f76808h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f76809i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f76810j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(androidx.compose.ui.d dVar, g4 g4Var, boolean z11, long j11, BorderStroke borderStroke, p<? super l, ? super Integer, h0> pVar, int i11, int i12) {
            super(2);
            this.f76803c = dVar;
            this.f76804d = g4Var;
            this.f76805e = z11;
            this.f76806f = j11;
            this.f76807g = borderStroke;
            this.f76808h = pVar;
            this.f76809i = i11;
            this.f76810j = i12;
        }

        public final void a(l lVar, int i11) {
            o1.b(this.f76803c, this.f76804d, this.f76805e, this.f76806f, this.f76807g, this.f76808h, lVar, k2.a(this.f76809i | 1), this.f76810j);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements wn0.l<y, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f76811c = new d();

        d() {
            super(1);
        }

        public final void a(y semantics) {
            s.k(semantics, "$this$semantics");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(y yVar) {
            a(yVar);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class e extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f76812c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f76813d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, int i11) {
            super(2);
            this.f76812c = str;
            this.f76813d = i11;
        }

        public final void a(l lVar, int i11) {
            o1.c(this.f76812c, lVar, k2.a(this.f76813d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends u implements wn0.l<y, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f76814c = new f();

        f() {
            super(1);
        }

        public final void a(y semantics) {
            s.k(semantics, "$this$semantics");
            v.v(semantics);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(y yVar) {
            a(yVar);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class g extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Integer f76815c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f76816d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Integer num, int i11) {
            super(2);
            this.f76815c = num;
            this.f76816d = i11;
        }

        public final void a(l lVar, int i11) {
            o1.d(this.f76815c, lVar, k2.a(this.f76816d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0129  */
    /* JADX WARN: Code duplicated, block: B:104:0x0130  */
    /* JADX WARN: Code duplicated, block: B:106:0x0138 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x013a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0142  */
    /* JADX WARN: Code duplicated, block: B:113:0x0198  */
    /* JADX WARN: Code duplicated, block: B:116:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:117:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:120:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:122:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:125:0x0232  */
    /* JADX WARN: Code duplicated, block: B:128:0x0257  */
    /* JADX WARN: Code duplicated, block: B:132:0x0265  */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:92:0x0103  */
    /* JADX WARN: Code duplicated, block: B:94:0x0106  */
    /* JADX WARN: Code duplicated, block: B:97:0x0113  */
    public static final void a(Integer num, String str, androidx.compose.ui.d dVar, boolean z11, boolean z12, p<? super l, ? super Integer, h0> pVar, p<? super l, ? super Integer, h0> contentInCard, l lVar, int i11, int i12) {
        int i13;
        androidx.compose.ui.d dVar2;
        int i14;
        boolean z13;
        int i15;
        int i16;
        boolean z14;
        int i17;
        int i18;
        int i19;
        p<? super l, ? super Integer, h0> pVarA;
        int i21;
        int i22;
        androidx.compose.ui.d dVar3;
        boolean z15;
        boolean z16;
        Object objI;
        float f11;
        int iA;
        wn0.a<b4.g> aVarA;
        l lVarA;
        p<b4.g, Integer, h0> pVarB;
        int i23;
        boolean z17;
        androidx.compose.ui.d dVar4;
        p<? super l, ? super Integer, h0> pVar2;
        boolean z18;
        w2 w2VarX;
        s.k(contentInCard, "contentInCard");
        l lVarV = lVar.v(1324495350);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (lVarV.n(num) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= lVarV.n(str) ? 32 : 16;
        }
        int i24 = i12 & 4;
        if (i24 == 0) {
            if ((i11 & 896) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 256 : 128;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & 7168) == 0) {
                    z13 = z11;
                    if (lVarV.p(z13)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 16;
                if (i16 != 0) {
                    if ((i11 & 57344) == 0) {
                        z14 = z12;
                        if (lVarV.p(z14)) {
                            i17 = 16384;
                        } else {
                            i17 = PKIFailureInfo.certRevoked;
                        }
                        i13 |= i17;
                    }
                    i18 = i12 & 32;
                    if (i18 != 0) {
                        i13 |= 196608;
                        i19 = 57344;
                        pVarA = pVar;
                    } else {
                        i19 = 57344;
                        pVarA = pVar;
                        if ((i11 & 458752) == 0) {
                            if (lVarV.K(pVarA)) {
                                i21 = 131072;
                            } else {
                                i21 = 65536;
                            }
                            i13 |= i21;
                        }
                    }
                    if ((i12 & 64) != 0) {
                        if ((i11 & 3670016) == 0) {
                            if (lVarV.K(contentInCard)) {
                                i22 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i22 = PKIFailureInfo.signerNotTrusted;
                            }
                        }
                        if ((i13 & 2995931) == 599186 || !lVarV.b()) {
                            if (i24 != 0) {
                                dVar3 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                z15 = false;
                            } else {
                                z15 = z13;
                            }
                            if (i16 != 0) {
                                z14 = true;
                            }
                            if (i18 != 0) {
                                pVarA = p.f76817a.a();
                            }
                            if (o.J()) {
                                o.S(1324495350, i13, -1, "com.stripe.android.uicore.elements.Section (SectionUI.kt:36)");
                            }
                            lVarV.H(290615945);
                            z16 = (i13 & i19) == 16384;
                            objI = lVarV.I();
                            if (z16 || objI == l.INSTANCE.a()) {
                                if (z14) {
                                    f11 = 8;
                                } else {
                                    f11 = 0;
                                }
                                objI = h.d(h.g(f11));
                                lVarV.B(objI);
                            }
                            float value = ((h) objI).getValue();
                            lVarV.T();
                            androidx.compose.ui.d dVarM = t.m(dVar3, BitmapDescriptorFactory.HUE_RED, value, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                            lVarV.H(-483455358);
                            i0 i0VarA = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
                            lVarV.H(-1323940314);
                            iA = j.a(lVarV, 0);
                            x xVarC = lVarV.c();
                            b4.g.Companion companion = b4.g.INSTANCE;
                            aVarA = companion.a();
                            q<y2<b4.g>, l, Integer, h0> qVarA = a0.a(dVarM);
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
                            d4.b(lVarA, i0VarA, companion.c());
                            d4.b(lVarA, xVarC, companion.e());
                            pVarB = companion.b();
                            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                                lVarA.B(Integer.valueOf(iA));
                                lVarA.f(Integer.valueOf(iA), pVarB);
                            }
                            qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                            lVarV.H(2058660585);
                            v1.j jVar = v1.j.f117505a;
                            d(num, lVarV, i13 & 14);
                            i23 = i13 >> 3;
                            int i25 = i13;
                            b(t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, value, 7, null), null, z15, 0L, null, contentInCard, lVarV, i23 & 459648, 26);
                            lVarV.H(597012499);
                            if (str != null) {
                                c(str, lVarV, i23 & 14);
                            }
                            lVarV.T();
                            pVarA.invoke(lVarV, Integer.valueOf((i25 >> 15) & 14));
                            lVarV.T();
                            lVarV.g();
                            lVarV.T();
                            lVarV.T();
                            if (o.J()) {
                                o.R();
                            }
                            z17 = z15;
                            dVar4 = dVar3;
                        } else {
                            lVarV.j();
                            dVar4 = dVar2;
                            z17 = z13;
                        }
                        pVar2 = pVarA;
                        z18 = z14;
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new a(num, str, dVar4, z17, z18, pVar2, contentInCard, i11, i12));
                        }
                    }
                    i22 = 1572864;
                    i13 |= i22;
                    if ((i13 & 2995931) == 599186) {
                        if (i24 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z15 = false;
                        } else {
                            z15 = z13;
                        }
                        if (i16 != 0) {
                            z14 = true;
                        }
                        if (i18 != 0) {
                            pVarA = p.f76817a.a();
                        }
                        if (o.J()) {
                            o.S(1324495350, i13, -1, "com.stripe.android.uicore.elements.Section (SectionUI.kt:36)");
                        }
                        lVarV.H(290615945);
                        if ((i13 & i19) == 16384) {
                        }
                        objI = lVarV.I();
                        if (z16) {
                            if (z14) {
                                f11 = 8;
                            } else {
                                f11 = 0;
                            }
                            objI = h.d(h.g(f11));
                            lVarV.B(objI);
                        } else {
                            if (z14) {
                                f11 = 8;
                            } else {
                                f11 = 0;
                            }
                            objI = h.d(h.g(f11));
                            lVarV.B(objI);
                        }
                        float value2 = ((h) objI).getValue();
                        lVarV.T();
                        androidx.compose.ui.d dVarM2 = t.m(dVar3, BitmapDescriptorFactory.HUE_RED, value2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                        lVarV.H(-483455358);
                        i0 i0VarA2 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
                        lVarV.H(-1323940314);
                        iA = j.a(lVarV, 0);
                        x xVarC2 = lVarV.c();
                        b4.g.Companion companion2 = b4.g.INSTANCE;
                        aVarA = companion2.a();
                        q<y2<b4.g>, l, Integer, h0> qVarA2 = a0.a(dVarM2);
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
                        d4.b(lVarA, i0VarA2, companion2.c());
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
                        v1.j jVar2 = v1.j.f117505a;
                        d(num, lVarV, i13 & 14);
                        i23 = i13 >> 3;
                        int i26 = i13;
                        b(t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, value2, 7, null), null, z15, 0L, null, contentInCard, lVarV, i23 & 459648, 26);
                        lVarV.H(597012499);
                        if (str != null) {
                            c(str, lVarV, i23 & 14);
                        }
                        lVarV.T();
                        pVarA.invoke(lVarV, Integer.valueOf((i26 >> 15) & 14));
                        lVarV.T();
                        lVarV.g();
                        lVarV.T();
                        lVarV.T();
                        if (o.J()) {
                            o.R();
                        }
                        z17 = z15;
                        dVar4 = dVar3;
                    } else {
                        if (i24 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z15 = false;
                        } else {
                            z15 = z13;
                        }
                        if (i16 != 0) {
                            z14 = true;
                        }
                        if (i18 != 0) {
                            pVarA = p.f76817a.a();
                        }
                        if (o.J()) {
                            o.S(1324495350, i13, -1, "com.stripe.android.uicore.elements.Section (SectionUI.kt:36)");
                        }
                        lVarV.H(290615945);
                        if ((i13 & i19) == 16384) {
                        }
                        objI = lVarV.I();
                        if (z16) {
                            if (z14) {
                                f11 = 8;
                            } else {
                                f11 = 0;
                            }
                            objI = h.d(h.g(f11));
                            lVarV.B(objI);
                        } else {
                            if (z14) {
                                f11 = 8;
                            } else {
                                f11 = 0;
                            }
                            objI = h.d(h.g(f11));
                            lVarV.B(objI);
                        }
                        float value3 = ((h) objI).getValue();
                        lVarV.T();
                        androidx.compose.ui.d dVarM3 = t.m(dVar3, BitmapDescriptorFactory.HUE_RED, value3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                        lVarV.H(-483455358);
                        i0 i0VarA3 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
                        lVarV.H(-1323940314);
                        iA = j.a(lVarV, 0);
                        x xVarC3 = lVarV.c();
                        b4.g.Companion companion3 = b4.g.INSTANCE;
                        aVarA = companion3.a();
                        q<y2<b4.g>, l, Integer, h0> qVarA3 = a0.a(dVarM3);
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
                        d4.b(lVarA, i0VarA3, companion3.c());
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
                        v1.j jVar3 = v1.j.f117505a;
                        d(num, lVarV, i13 & 14);
                        i23 = i13 >> 3;
                        int i27 = i13;
                        b(t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, value3, 7, null), null, z15, 0L, null, contentInCard, lVarV, i23 & 459648, 26);
                        lVarV.H(597012499);
                        if (str != null) {
                            c(str, lVarV, i23 & 14);
                        }
                        lVarV.T();
                        pVarA.invoke(lVarV, Integer.valueOf((i27 >> 15) & 14));
                        lVarV.T();
                        lVarV.g();
                        lVarV.T();
                        lVarV.T();
                        if (o.J()) {
                            o.R();
                        }
                        z17 = z15;
                        dVar4 = dVar3;
                    }
                    pVar2 = pVarA;
                    z18 = z14;
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new a(num, str, dVar4, z17, z18, pVar2, contentInCard, i11, i12));
                    }
                }
                i13 |= 24576;
                z14 = z12;
                i18 = i12 & 32;
                if (i18 != 0) {
                    i13 |= 196608;
                    i19 = 57344;
                    pVarA = pVar;
                } else {
                    i19 = 57344;
                    pVarA = pVar;
                    if ((i11 & 458752) == 0) {
                        if (lVarV.K(pVarA)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                }
                if ((i12 & 64) != 0) {
                    if ((i11 & 3670016) == 0) {
                        if (lVarV.K(contentInCard)) {
                            i22 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i22 = PKIFailureInfo.signerNotTrusted;
                        }
                    }
                    if ((i13 & 2995931) == 599186) {
                        if (i24 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z15 = false;
                        } else {
                            z15 = z13;
                        }
                        if (i16 != 0) {
                            z14 = true;
                        }
                        if (i18 != 0) {
                            pVarA = p.f76817a.a();
                        }
                        if (o.J()) {
                            o.S(1324495350, i13, -1, "com.stripe.android.uicore.elements.Section (SectionUI.kt:36)");
                        }
                        lVarV.H(290615945);
                        if ((i13 & i19) == 16384) {
                        }
                        objI = lVarV.I();
                        if (z16) {
                            if (z14) {
                                f11 = 8;
                            } else {
                                f11 = 0;
                            }
                            objI = h.d(h.g(f11));
                            lVarV.B(objI);
                        } else {
                            if (z14) {
                                f11 = 8;
                            } else {
                                f11 = 0;
                            }
                            objI = h.d(h.g(f11));
                            lVarV.B(objI);
                        }
                        float value4 = ((h) objI).getValue();
                        lVarV.T();
                        androidx.compose.ui.d dVarM4 = t.m(dVar3, BitmapDescriptorFactory.HUE_RED, value4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                        lVarV.H(-483455358);
                        i0 i0VarA4 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
                        lVarV.H(-1323940314);
                        iA = j.a(lVarV, 0);
                        x xVarC4 = lVarV.c();
                        b4.g.Companion companion4 = b4.g.INSTANCE;
                        aVarA = companion4.a();
                        q<y2<b4.g>, l, Integer, h0> qVarA4 = a0.a(dVarM4);
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
                        d4.b(lVarA, i0VarA4, companion4.c());
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
                        v1.j jVar4 = v1.j.f117505a;
                        d(num, lVarV, i13 & 14);
                        i23 = i13 >> 3;
                        int i28 = i13;
                        b(t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, value4, 7, null), null, z15, 0L, null, contentInCard, lVarV, i23 & 459648, 26);
                        lVarV.H(597012499);
                        if (str != null) {
                            c(str, lVarV, i23 & 14);
                        }
                        lVarV.T();
                        pVarA.invoke(lVarV, Integer.valueOf((i28 >> 15) & 14));
                        lVarV.T();
                        lVarV.g();
                        lVarV.T();
                        lVarV.T();
                        if (o.J()) {
                            o.R();
                        }
                        z17 = z15;
                        dVar4 = dVar3;
                    } else {
                        if (i24 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z15 = false;
                        } else {
                            z15 = z13;
                        }
                        if (i16 != 0) {
                            z14 = true;
                        }
                        if (i18 != 0) {
                            pVarA = p.f76817a.a();
                        }
                        if (o.J()) {
                            o.S(1324495350, i13, -1, "com.stripe.android.uicore.elements.Section (SectionUI.kt:36)");
                        }
                        lVarV.H(290615945);
                        if ((i13 & i19) == 16384) {
                        }
                        objI = lVarV.I();
                        if (z16) {
                            if (z14) {
                                f11 = 8;
                            } else {
                                f11 = 0;
                            }
                            objI = h.d(h.g(f11));
                            lVarV.B(objI);
                        } else {
                            if (z14) {
                                f11 = 8;
                            } else {
                                f11 = 0;
                            }
                            objI = h.d(h.g(f11));
                            lVarV.B(objI);
                        }
                        float value5 = ((h) objI).getValue();
                        lVarV.T();
                        androidx.compose.ui.d dVarM5 = t.m(dVar3, BitmapDescriptorFactory.HUE_RED, value5, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                        lVarV.H(-483455358);
                        i0 i0VarA5 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
                        lVarV.H(-1323940314);
                        iA = j.a(lVarV, 0);
                        x xVarC5 = lVarV.c();
                        b4.g.Companion companion5 = b4.g.INSTANCE;
                        aVarA = companion5.a();
                        q<y2<b4.g>, l, Integer, h0> qVarA5 = a0.a(dVarM5);
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
                        d4.b(lVarA, i0VarA5, companion5.c());
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
                        v1.j jVar5 = v1.j.f117505a;
                        d(num, lVarV, i13 & 14);
                        i23 = i13 >> 3;
                        int i29 = i13;
                        b(t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, value5, 7, null), null, z15, 0L, null, contentInCard, lVarV, i23 & 459648, 26);
                        lVarV.H(597012499);
                        if (str != null) {
                            c(str, lVarV, i23 & 14);
                        }
                        lVarV.T();
                        pVarA.invoke(lVarV, Integer.valueOf((i29 >> 15) & 14));
                        lVarV.T();
                        lVarV.g();
                        lVarV.T();
                        lVarV.T();
                        if (o.J()) {
                            o.R();
                        }
                        z17 = z15;
                        dVar4 = dVar3;
                    }
                    pVar2 = pVarA;
                    z18 = z14;
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new a(num, str, dVar4, z17, z18, pVar2, contentInCard, i11, i12));
                    }
                }
                i22 = 1572864;
                i13 |= i22;
                if ((i13 & 2995931) == 599186) {
                    if (i24 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i16 != 0) {
                        z14 = true;
                    }
                    if (i18 != 0) {
                        pVarA = p.f76817a.a();
                    }
                    if (o.J()) {
                        o.S(1324495350, i13, -1, "com.stripe.android.uicore.elements.Section (SectionUI.kt:36)");
                    }
                    lVarV.H(290615945);
                    if ((i13 & i19) == 16384) {
                    }
                    objI = lVarV.I();
                    if (z16) {
                        if (z14) {
                            f11 = 8;
                        } else {
                            f11 = 0;
                        }
                        objI = h.d(h.g(f11));
                        lVarV.B(objI);
                    } else {
                        if (z14) {
                            f11 = 8;
                        } else {
                            f11 = 0;
                        }
                        objI = h.d(h.g(f11));
                        lVarV.B(objI);
                    }
                    float value6 = ((h) objI).getValue();
                    lVarV.T();
                    androidx.compose.ui.d dVarM6 = t.m(dVar3, BitmapDescriptorFactory.HUE_RED, value6, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                    lVarV.H(-483455358);
                    i0 i0VarA6 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
                    lVarV.H(-1323940314);
                    iA = j.a(lVarV, 0);
                    x xVarC6 = lVarV.c();
                    b4.g.Companion companion6 = b4.g.INSTANCE;
                    aVarA = companion6.a();
                    q<y2<b4.g>, l, Integer, h0> qVarA6 = a0.a(dVarM6);
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
                    d4.b(lVarA, i0VarA6, companion6.c());
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
                    v1.j jVar6 = v1.j.f117505a;
                    d(num, lVarV, i13 & 14);
                    i23 = i13 >> 3;
                    int i210 = i13;
                    b(t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, value6, 7, null), null, z15, 0L, null, contentInCard, lVarV, i23 & 459648, 26);
                    lVarV.H(597012499);
                    if (str != null) {
                        c(str, lVarV, i23 & 14);
                    }
                    lVarV.T();
                    pVarA.invoke(lVarV, Integer.valueOf((i210 >> 15) & 14));
                    lVarV.T();
                    lVarV.g();
                    lVarV.T();
                    lVarV.T();
                    if (o.J()) {
                        o.R();
                    }
                    z17 = z15;
                    dVar4 = dVar3;
                } else {
                    if (i24 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i16 != 0) {
                        z14 = true;
                    }
                    if (i18 != 0) {
                        pVarA = p.f76817a.a();
                    }
                    if (o.J()) {
                        o.S(1324495350, i13, -1, "com.stripe.android.uicore.elements.Section (SectionUI.kt:36)");
                    }
                    lVarV.H(290615945);
                    if ((i13 & i19) == 16384) {
                    }
                    objI = lVarV.I();
                    if (z16) {
                        if (z14) {
                            f11 = 8;
                        } else {
                            f11 = 0;
                        }
                        objI = h.d(h.g(f11));
                        lVarV.B(objI);
                    } else {
                        if (z14) {
                            f11 = 8;
                        } else {
                            f11 = 0;
                        }
                        objI = h.d(h.g(f11));
                        lVarV.B(objI);
                    }
                    float value7 = ((h) objI).getValue();
                    lVarV.T();
                    androidx.compose.ui.d dVarM7 = t.m(dVar3, BitmapDescriptorFactory.HUE_RED, value7, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                    lVarV.H(-483455358);
                    i0 i0VarA7 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
                    lVarV.H(-1323940314);
                    iA = j.a(lVarV, 0);
                    x xVarC7 = lVarV.c();
                    b4.g.Companion companion7 = b4.g.INSTANCE;
                    aVarA = companion7.a();
                    q<y2<b4.g>, l, Integer, h0> qVarA7 = a0.a(dVarM7);
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
                    d4.b(lVarA, i0VarA7, companion7.c());
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
                    v1.j jVar7 = v1.j.f117505a;
                    d(num, lVarV, i13 & 14);
                    i23 = i13 >> 3;
                    int i211 = i13;
                    b(t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, value7, 7, null), null, z15, 0L, null, contentInCard, lVarV, i23 & 459648, 26);
                    lVarV.H(597012499);
                    if (str != null) {
                        c(str, lVarV, i23 & 14);
                    }
                    lVarV.T();
                    pVarA.invoke(lVarV, Integer.valueOf((i211 >> 15) & 14));
                    lVarV.T();
                    lVarV.g();
                    lVarV.T();
                    lVarV.T();
                    if (o.J()) {
                        o.R();
                    }
                    z17 = z15;
                    dVar4 = dVar3;
                }
                pVar2 = pVarA;
                z18 = z14;
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new a(num, str, dVar4, z17, z18, pVar2, contentInCard, i11, i12));
                }
            }
            i13 |= 3072;
            z13 = z11;
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((i11 & 57344) == 0) {
                    z14 = z12;
                    if (lVarV.p(z14)) {
                        i17 = 16384;
                    } else {
                        i17 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 32;
                if (i18 != 0) {
                    i13 |= 196608;
                    i19 = 57344;
                    pVarA = pVar;
                } else {
                    i19 = 57344;
                    pVarA = pVar;
                    if ((i11 & 458752) == 0) {
                        if (lVarV.K(pVarA)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                }
                if ((i12 & 64) != 0) {
                    if ((i11 & 3670016) == 0) {
                        if (lVarV.K(contentInCard)) {
                            i22 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i22 = PKIFailureInfo.signerNotTrusted;
                        }
                    }
                    if ((i13 & 2995931) == 599186) {
                        if (i24 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z15 = false;
                        } else {
                            z15 = z13;
                        }
                        if (i16 != 0) {
                            z14 = true;
                        }
                        if (i18 != 0) {
                            pVarA = p.f76817a.a();
                        }
                        if (o.J()) {
                            o.S(1324495350, i13, -1, "com.stripe.android.uicore.elements.Section (SectionUI.kt:36)");
                        }
                        lVarV.H(290615945);
                        if ((i13 & i19) == 16384) {
                        }
                        objI = lVarV.I();
                        if (z16) {
                            if (z14) {
                                f11 = 8;
                            } else {
                                f11 = 0;
                            }
                            objI = h.d(h.g(f11));
                            lVarV.B(objI);
                        } else {
                            if (z14) {
                                f11 = 8;
                            } else {
                                f11 = 0;
                            }
                            objI = h.d(h.g(f11));
                            lVarV.B(objI);
                        }
                        float value8 = ((h) objI).getValue();
                        lVarV.T();
                        androidx.compose.ui.d dVarM8 = t.m(dVar3, BitmapDescriptorFactory.HUE_RED, value8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                        lVarV.H(-483455358);
                        i0 i0VarA8 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
                        lVarV.H(-1323940314);
                        iA = j.a(lVarV, 0);
                        x xVarC8 = lVarV.c();
                        b4.g.Companion companion8 = b4.g.INSTANCE;
                        aVarA = companion8.a();
                        q<y2<b4.g>, l, Integer, h0> qVarA8 = a0.a(dVarM8);
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
                        d4.b(lVarA, i0VarA8, companion8.c());
                        d4.b(lVarA, xVarC8, companion8.e());
                        pVarB = companion8.b();
                        if (lVarA.getInserting()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        qVarA8.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                        lVarV.H(2058660585);
                        v1.j jVar8 = v1.j.f117505a;
                        d(num, lVarV, i13 & 14);
                        i23 = i13 >> 3;
                        int i212 = i13;
                        b(t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, value8, 7, null), null, z15, 0L, null, contentInCard, lVarV, i23 & 459648, 26);
                        lVarV.H(597012499);
                        if (str != null) {
                            c(str, lVarV, i23 & 14);
                        }
                        lVarV.T();
                        pVarA.invoke(lVarV, Integer.valueOf((i212 >> 15) & 14));
                        lVarV.T();
                        lVarV.g();
                        lVarV.T();
                        lVarV.T();
                        if (o.J()) {
                            o.R();
                        }
                        z17 = z15;
                        dVar4 = dVar3;
                    } else {
                        if (i24 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z15 = false;
                        } else {
                            z15 = z13;
                        }
                        if (i16 != 0) {
                            z14 = true;
                        }
                        if (i18 != 0) {
                            pVarA = p.f76817a.a();
                        }
                        if (o.J()) {
                            o.S(1324495350, i13, -1, "com.stripe.android.uicore.elements.Section (SectionUI.kt:36)");
                        }
                        lVarV.H(290615945);
                        if ((i13 & i19) == 16384) {
                        }
                        objI = lVarV.I();
                        if (z16) {
                            if (z14) {
                                f11 = 8;
                            } else {
                                f11 = 0;
                            }
                            objI = h.d(h.g(f11));
                            lVarV.B(objI);
                        } else {
                            if (z14) {
                                f11 = 8;
                            } else {
                                f11 = 0;
                            }
                            objI = h.d(h.g(f11));
                            lVarV.B(objI);
                        }
                        float value9 = ((h) objI).getValue();
                        lVarV.T();
                        androidx.compose.ui.d dVarM9 = t.m(dVar3, BitmapDescriptorFactory.HUE_RED, value9, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                        lVarV.H(-483455358);
                        i0 i0VarA9 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
                        lVarV.H(-1323940314);
                        iA = j.a(lVarV, 0);
                        x xVarC9 = lVarV.c();
                        b4.g.Companion companion9 = b4.g.INSTANCE;
                        aVarA = companion9.a();
                        q<y2<b4.g>, l, Integer, h0> qVarA9 = a0.a(dVarM9);
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
                        d4.b(lVarA, i0VarA9, companion9.c());
                        d4.b(lVarA, xVarC9, companion9.e());
                        pVarB = companion9.b();
                        if (lVarA.getInserting()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        qVarA9.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                        lVarV.H(2058660585);
                        v1.j jVar9 = v1.j.f117505a;
                        d(num, lVarV, i13 & 14);
                        i23 = i13 >> 3;
                        int i213 = i13;
                        b(t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, value9, 7, null), null, z15, 0L, null, contentInCard, lVarV, i23 & 459648, 26);
                        lVarV.H(597012499);
                        if (str != null) {
                            c(str, lVarV, i23 & 14);
                        }
                        lVarV.T();
                        pVarA.invoke(lVarV, Integer.valueOf((i213 >> 15) & 14));
                        lVarV.T();
                        lVarV.g();
                        lVarV.T();
                        lVarV.T();
                        if (o.J()) {
                            o.R();
                        }
                        z17 = z15;
                        dVar4 = dVar3;
                    }
                    pVar2 = pVarA;
                    z18 = z14;
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new a(num, str, dVar4, z17, z18, pVar2, contentInCard, i11, i12));
                    }
                }
                i22 = 1572864;
                i13 |= i22;
                if ((i13 & 2995931) == 599186) {
                    if (i24 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i16 != 0) {
                        z14 = true;
                    }
                    if (i18 != 0) {
                        pVarA = p.f76817a.a();
                    }
                    if (o.J()) {
                        o.S(1324495350, i13, -1, "com.stripe.android.uicore.elements.Section (SectionUI.kt:36)");
                    }
                    lVarV.H(290615945);
                    if ((i13 & i19) == 16384) {
                    }
                    objI = lVarV.I();
                    if (z16) {
                        if (z14) {
                            f11 = 8;
                        } else {
                            f11 = 0;
                        }
                        objI = h.d(h.g(f11));
                        lVarV.B(objI);
                    } else {
                        if (z14) {
                            f11 = 8;
                        } else {
                            f11 = 0;
                        }
                        objI = h.d(h.g(f11));
                        lVarV.B(objI);
                    }
                    float value10 = ((h) objI).getValue();
                    lVarV.T();
                    androidx.compose.ui.d dVarM10 = t.m(dVar3, BitmapDescriptorFactory.HUE_RED, value10, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                    lVarV.H(-483455358);
                    i0 i0VarA10 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
                    lVarV.H(-1323940314);
                    iA = j.a(lVarV, 0);
                    x xVarC10 = lVarV.c();
                    b4.g.Companion companion10 = b4.g.INSTANCE;
                    aVarA = companion10.a();
                    q<y2<b4.g>, l, Integer, h0> qVarA10 = a0.a(dVarM10);
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
                    d4.b(lVarA, i0VarA10, companion10.c());
                    d4.b(lVarA, xVarC10, companion10.e());
                    pVarB = companion10.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    qVarA10.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                    lVarV.H(2058660585);
                    v1.j jVar10 = v1.j.f117505a;
                    d(num, lVarV, i13 & 14);
                    i23 = i13 >> 3;
                    int i214 = i13;
                    b(t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, value10, 7, null), null, z15, 0L, null, contentInCard, lVarV, i23 & 459648, 26);
                    lVarV.H(597012499);
                    if (str != null) {
                        c(str, lVarV, i23 & 14);
                    }
                    lVarV.T();
                    pVarA.invoke(lVarV, Integer.valueOf((i214 >> 15) & 14));
                    lVarV.T();
                    lVarV.g();
                    lVarV.T();
                    lVarV.T();
                    if (o.J()) {
                        o.R();
                    }
                    z17 = z15;
                    dVar4 = dVar3;
                } else {
                    if (i24 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i16 != 0) {
                        z14 = true;
                    }
                    if (i18 != 0) {
                        pVarA = p.f76817a.a();
                    }
                    if (o.J()) {
                        o.S(1324495350, i13, -1, "com.stripe.android.uicore.elements.Section (SectionUI.kt:36)");
                    }
                    lVarV.H(290615945);
                    if ((i13 & i19) == 16384) {
                    }
                    objI = lVarV.I();
                    if (z16) {
                        if (z14) {
                            f11 = 8;
                        } else {
                            f11 = 0;
                        }
                        objI = h.d(h.g(f11));
                        lVarV.B(objI);
                    } else {
                        if (z14) {
                            f11 = 8;
                        } else {
                            f11 = 0;
                        }
                        objI = h.d(h.g(f11));
                        lVarV.B(objI);
                    }
                    float value11 = ((h) objI).getValue();
                    lVarV.T();
                    androidx.compose.ui.d dVarM11 = t.m(dVar3, BitmapDescriptorFactory.HUE_RED, value11, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                    lVarV.H(-483455358);
                    i0 i0VarA11 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
                    lVarV.H(-1323940314);
                    iA = j.a(lVarV, 0);
                    x xVarC11 = lVarV.c();
                    b4.g.Companion companion11 = b4.g.INSTANCE;
                    aVarA = companion11.a();
                    q<y2<b4.g>, l, Integer, h0> qVarA11 = a0.a(dVarM11);
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
                    d4.b(lVarA, i0VarA11, companion11.c());
                    d4.b(lVarA, xVarC11, companion11.e());
                    pVarB = companion11.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    qVarA11.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                    lVarV.H(2058660585);
                    v1.j jVar11 = v1.j.f117505a;
                    d(num, lVarV, i13 & 14);
                    i23 = i13 >> 3;
                    int i215 = i13;
                    b(t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, value11, 7, null), null, z15, 0L, null, contentInCard, lVarV, i23 & 459648, 26);
                    lVarV.H(597012499);
                    if (str != null) {
                        c(str, lVarV, i23 & 14);
                    }
                    lVarV.T();
                    pVarA.invoke(lVarV, Integer.valueOf((i215 >> 15) & 14));
                    lVarV.T();
                    lVarV.g();
                    lVarV.T();
                    lVarV.T();
                    if (o.J()) {
                        o.R();
                    }
                    z17 = z15;
                    dVar4 = dVar3;
                }
                pVar2 = pVarA;
                z18 = z14;
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new a(num, str, dVar4, z17, z18, pVar2, contentInCard, i11, i12));
                }
            }
            i13 |= 24576;
            z14 = z12;
            i18 = i12 & 32;
            if (i18 != 0) {
                i13 |= 196608;
                i19 = 57344;
                pVarA = pVar;
            } else {
                i19 = 57344;
                pVarA = pVar;
                if ((i11 & 458752) == 0) {
                    if (lVarV.K(pVarA)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
            }
            if ((i12 & 64) != 0) {
                if ((i11 & 3670016) == 0) {
                    if (lVarV.K(contentInCard)) {
                        i22 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i22 = PKIFailureInfo.signerNotTrusted;
                    }
                }
                if ((i13 & 2995931) == 599186) {
                    if (i24 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i16 != 0) {
                        z14 = true;
                    }
                    if (i18 != 0) {
                        pVarA = p.f76817a.a();
                    }
                    if (o.J()) {
                        o.S(1324495350, i13, -1, "com.stripe.android.uicore.elements.Section (SectionUI.kt:36)");
                    }
                    lVarV.H(290615945);
                    if ((i13 & i19) == 16384) {
                    }
                    objI = lVarV.I();
                    if (z16) {
                        if (z14) {
                            f11 = 8;
                        } else {
                            f11 = 0;
                        }
                        objI = h.d(h.g(f11));
                        lVarV.B(objI);
                    } else {
                        if (z14) {
                            f11 = 8;
                        } else {
                            f11 = 0;
                        }
                        objI = h.d(h.g(f11));
                        lVarV.B(objI);
                    }
                    float value12 = ((h) objI).getValue();
                    lVarV.T();
                    androidx.compose.ui.d dVarM12 = t.m(dVar3, BitmapDescriptorFactory.HUE_RED, value12, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                    lVarV.H(-483455358);
                    i0 i0VarA12 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
                    lVarV.H(-1323940314);
                    iA = j.a(lVarV, 0);
                    x xVarC12 = lVarV.c();
                    b4.g.Companion companion12 = b4.g.INSTANCE;
                    aVarA = companion12.a();
                    q<y2<b4.g>, l, Integer, h0> qVarA12 = a0.a(dVarM12);
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
                    d4.b(lVarA, i0VarA12, companion12.c());
                    d4.b(lVarA, xVarC12, companion12.e());
                    pVarB = companion12.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    qVarA12.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                    lVarV.H(2058660585);
                    v1.j jVar12 = v1.j.f117505a;
                    d(num, lVarV, i13 & 14);
                    i23 = i13 >> 3;
                    int i216 = i13;
                    b(t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, value12, 7, null), null, z15, 0L, null, contentInCard, lVarV, i23 & 459648, 26);
                    lVarV.H(597012499);
                    if (str != null) {
                        c(str, lVarV, i23 & 14);
                    }
                    lVarV.T();
                    pVarA.invoke(lVarV, Integer.valueOf((i216 >> 15) & 14));
                    lVarV.T();
                    lVarV.g();
                    lVarV.T();
                    lVarV.T();
                    if (o.J()) {
                        o.R();
                    }
                    z17 = z15;
                    dVar4 = dVar3;
                } else {
                    if (i24 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i16 != 0) {
                        z14 = true;
                    }
                    if (i18 != 0) {
                        pVarA = p.f76817a.a();
                    }
                    if (o.J()) {
                        o.S(1324495350, i13, -1, "com.stripe.android.uicore.elements.Section (SectionUI.kt:36)");
                    }
                    lVarV.H(290615945);
                    if ((i13 & i19) == 16384) {
                    }
                    objI = lVarV.I();
                    if (z16) {
                        if (z14) {
                            f11 = 8;
                        } else {
                            f11 = 0;
                        }
                        objI = h.d(h.g(f11));
                        lVarV.B(objI);
                    } else {
                        if (z14) {
                            f11 = 8;
                        } else {
                            f11 = 0;
                        }
                        objI = h.d(h.g(f11));
                        lVarV.B(objI);
                    }
                    float value13 = ((h) objI).getValue();
                    lVarV.T();
                    androidx.compose.ui.d dVarM13 = t.m(dVar3, BitmapDescriptorFactory.HUE_RED, value13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                    lVarV.H(-483455358);
                    i0 i0VarA13 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
                    lVarV.H(-1323940314);
                    iA = j.a(lVarV, 0);
                    x xVarC13 = lVarV.c();
                    b4.g.Companion companion13 = b4.g.INSTANCE;
                    aVarA = companion13.a();
                    q<y2<b4.g>, l, Integer, h0> qVarA13 = a0.a(dVarM13);
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
                    d4.b(lVarA, i0VarA13, companion13.c());
                    d4.b(lVarA, xVarC13, companion13.e());
                    pVarB = companion13.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    qVarA13.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                    lVarV.H(2058660585);
                    v1.j jVar13 = v1.j.f117505a;
                    d(num, lVarV, i13 & 14);
                    i23 = i13 >> 3;
                    int i217 = i13;
                    b(t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, value13, 7, null), null, z15, 0L, null, contentInCard, lVarV, i23 & 459648, 26);
                    lVarV.H(597012499);
                    if (str != null) {
                        c(str, lVarV, i23 & 14);
                    }
                    lVarV.T();
                    pVarA.invoke(lVarV, Integer.valueOf((i217 >> 15) & 14));
                    lVarV.T();
                    lVarV.g();
                    lVarV.T();
                    lVarV.T();
                    if (o.J()) {
                        o.R();
                    }
                    z17 = z15;
                    dVar4 = dVar3;
                }
                pVar2 = pVarA;
                z18 = z14;
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new a(num, str, dVar4, z17, z18, pVar2, contentInCard, i11, i12));
                }
            }
            i22 = 1572864;
            i13 |= i22;
            if ((i13 & 2995931) == 599186) {
                if (i24 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z15 = false;
                } else {
                    z15 = z13;
                }
                if (i16 != 0) {
                    z14 = true;
                }
                if (i18 != 0) {
                    pVarA = p.f76817a.a();
                }
                if (o.J()) {
                    o.S(1324495350, i13, -1, "com.stripe.android.uicore.elements.Section (SectionUI.kt:36)");
                }
                lVarV.H(290615945);
                if ((i13 & i19) == 16384) {
                }
                objI = lVarV.I();
                if (z16) {
                    if (z14) {
                        f11 = 8;
                    } else {
                        f11 = 0;
                    }
                    objI = h.d(h.g(f11));
                    lVarV.B(objI);
                } else {
                    if (z14) {
                        f11 = 8;
                    } else {
                        f11 = 0;
                    }
                    objI = h.d(h.g(f11));
                    lVarV.B(objI);
                }
                float value14 = ((h) objI).getValue();
                lVarV.T();
                androidx.compose.ui.d dVarM14 = t.m(dVar3, BitmapDescriptorFactory.HUE_RED, value14, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                lVarV.H(-483455358);
                i0 i0VarA14 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
                lVarV.H(-1323940314);
                iA = j.a(lVarV, 0);
                x xVarC14 = lVarV.c();
                b4.g.Companion companion14 = b4.g.INSTANCE;
                aVarA = companion14.a();
                q<y2<b4.g>, l, Integer, h0> qVarA14 = a0.a(dVarM14);
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
                d4.b(lVarA, i0VarA14, companion14.c());
                d4.b(lVarA, xVarC14, companion14.e());
                pVarB = companion14.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA14.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                v1.j jVar14 = v1.j.f117505a;
                d(num, lVarV, i13 & 14);
                i23 = i13 >> 3;
                int i218 = i13;
                b(t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, value14, 7, null), null, z15, 0L, null, contentInCard, lVarV, i23 & 459648, 26);
                lVarV.H(597012499);
                if (str != null) {
                    c(str, lVarV, i23 & 14);
                }
                lVarV.T();
                pVarA.invoke(lVarV, Integer.valueOf((i218 >> 15) & 14));
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                if (o.J()) {
                    o.R();
                }
                z17 = z15;
                dVar4 = dVar3;
            } else {
                if (i24 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z15 = false;
                } else {
                    z15 = z13;
                }
                if (i16 != 0) {
                    z14 = true;
                }
                if (i18 != 0) {
                    pVarA = p.f76817a.a();
                }
                if (o.J()) {
                    o.S(1324495350, i13, -1, "com.stripe.android.uicore.elements.Section (SectionUI.kt:36)");
                }
                lVarV.H(290615945);
                if ((i13 & i19) == 16384) {
                }
                objI = lVarV.I();
                if (z16) {
                    if (z14) {
                        f11 = 8;
                    } else {
                        f11 = 0;
                    }
                    objI = h.d(h.g(f11));
                    lVarV.B(objI);
                } else {
                    if (z14) {
                        f11 = 8;
                    } else {
                        f11 = 0;
                    }
                    objI = h.d(h.g(f11));
                    lVarV.B(objI);
                }
                float value15 = ((h) objI).getValue();
                lVarV.T();
                androidx.compose.ui.d dVarM15 = t.m(dVar3, BitmapDescriptorFactory.HUE_RED, value15, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                lVarV.H(-483455358);
                i0 i0VarA15 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
                lVarV.H(-1323940314);
                iA = j.a(lVarV, 0);
                x xVarC15 = lVarV.c();
                b4.g.Companion companion15 = b4.g.INSTANCE;
                aVarA = companion15.a();
                q<y2<b4.g>, l, Integer, h0> qVarA15 = a0.a(dVarM15);
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
                d4.b(lVarA, i0VarA15, companion15.c());
                d4.b(lVarA, xVarC15, companion15.e());
                pVarB = companion15.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA15.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                v1.j jVar15 = v1.j.f117505a;
                d(num, lVarV, i13 & 14);
                i23 = i13 >> 3;
                int i219 = i13;
                b(t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, value15, 7, null), null, z15, 0L, null, contentInCard, lVarV, i23 & 459648, 26);
                lVarV.H(597012499);
                if (str != null) {
                    c(str, lVarV, i23 & 14);
                }
                lVarV.T();
                pVarA.invoke(lVarV, Integer.valueOf((i219 >> 15) & 14));
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                if (o.J()) {
                    o.R();
                }
                z17 = z15;
                dVar4 = dVar3;
            }
            pVar2 = pVarA;
            z18 = z14;
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new a(num, str, dVar4, z17, z18, pVar2, contentInCard, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        dVar2 = dVar;
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & 7168) == 0) {
                z13 = z11;
                if (lVarV.p(z13)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((i11 & 57344) == 0) {
                    z14 = z12;
                    if (lVarV.p(z14)) {
                        i17 = 16384;
                    } else {
                        i17 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 32;
                if (i18 != 0) {
                    i13 |= 196608;
                    i19 = 57344;
                    pVarA = pVar;
                } else {
                    i19 = 57344;
                    pVarA = pVar;
                    if ((i11 & 458752) == 0) {
                        if (lVarV.K(pVarA)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                }
                if ((i12 & 64) != 0) {
                    if ((i11 & 3670016) == 0) {
                        if (lVarV.K(contentInCard)) {
                            i22 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i22 = PKIFailureInfo.signerNotTrusted;
                        }
                    }
                    if ((i13 & 2995931) == 599186) {
                        if (i24 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z15 = false;
                        } else {
                            z15 = z13;
                        }
                        if (i16 != 0) {
                            z14 = true;
                        }
                        if (i18 != 0) {
                            pVarA = p.f76817a.a();
                        }
                        if (o.J()) {
                            o.S(1324495350, i13, -1, "com.stripe.android.uicore.elements.Section (SectionUI.kt:36)");
                        }
                        lVarV.H(290615945);
                        if ((i13 & i19) == 16384) {
                        }
                        objI = lVarV.I();
                        if (z16) {
                            if (z14) {
                                f11 = 8;
                            } else {
                                f11 = 0;
                            }
                            objI = h.d(h.g(f11));
                            lVarV.B(objI);
                        } else {
                            if (z14) {
                                f11 = 8;
                            } else {
                                f11 = 0;
                            }
                            objI = h.d(h.g(f11));
                            lVarV.B(objI);
                        }
                        float value16 = ((h) objI).getValue();
                        lVarV.T();
                        androidx.compose.ui.d dVarM16 = t.m(dVar3, BitmapDescriptorFactory.HUE_RED, value16, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                        lVarV.H(-483455358);
                        i0 i0VarA16 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
                        lVarV.H(-1323940314);
                        iA = j.a(lVarV, 0);
                        x xVarC16 = lVarV.c();
                        b4.g.Companion companion16 = b4.g.INSTANCE;
                        aVarA = companion16.a();
                        q<y2<b4.g>, l, Integer, h0> qVarA16 = a0.a(dVarM16);
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
                        d4.b(lVarA, i0VarA16, companion16.c());
                        d4.b(lVarA, xVarC16, companion16.e());
                        pVarB = companion16.b();
                        if (lVarA.getInserting()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        qVarA16.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                        lVarV.H(2058660585);
                        v1.j jVar16 = v1.j.f117505a;
                        d(num, lVarV, i13 & 14);
                        i23 = i13 >> 3;
                        int i2110 = i13;
                        b(t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, value16, 7, null), null, z15, 0L, null, contentInCard, lVarV, i23 & 459648, 26);
                        lVarV.H(597012499);
                        if (str != null) {
                            c(str, lVarV, i23 & 14);
                        }
                        lVarV.T();
                        pVarA.invoke(lVarV, Integer.valueOf((i2110 >> 15) & 14));
                        lVarV.T();
                        lVarV.g();
                        lVarV.T();
                        lVarV.T();
                        if (o.J()) {
                            o.R();
                        }
                        z17 = z15;
                        dVar4 = dVar3;
                    } else {
                        if (i24 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z15 = false;
                        } else {
                            z15 = z13;
                        }
                        if (i16 != 0) {
                            z14 = true;
                        }
                        if (i18 != 0) {
                            pVarA = p.f76817a.a();
                        }
                        if (o.J()) {
                            o.S(1324495350, i13, -1, "com.stripe.android.uicore.elements.Section (SectionUI.kt:36)");
                        }
                        lVarV.H(290615945);
                        if ((i13 & i19) == 16384) {
                        }
                        objI = lVarV.I();
                        if (z16) {
                            if (z14) {
                                f11 = 8;
                            } else {
                                f11 = 0;
                            }
                            objI = h.d(h.g(f11));
                            lVarV.B(objI);
                        } else {
                            if (z14) {
                                f11 = 8;
                            } else {
                                f11 = 0;
                            }
                            objI = h.d(h.g(f11));
                            lVarV.B(objI);
                        }
                        float value17 = ((h) objI).getValue();
                        lVarV.T();
                        androidx.compose.ui.d dVarM17 = t.m(dVar3, BitmapDescriptorFactory.HUE_RED, value17, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                        lVarV.H(-483455358);
                        i0 i0VarA17 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
                        lVarV.H(-1323940314);
                        iA = j.a(lVarV, 0);
                        x xVarC17 = lVarV.c();
                        b4.g.Companion companion17 = b4.g.INSTANCE;
                        aVarA = companion17.a();
                        q<y2<b4.g>, l, Integer, h0> qVarA17 = a0.a(dVarM17);
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
                        d4.b(lVarA, i0VarA17, companion17.c());
                        d4.b(lVarA, xVarC17, companion17.e());
                        pVarB = companion17.b();
                        if (lVarA.getInserting()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        qVarA17.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                        lVarV.H(2058660585);
                        v1.j jVar17 = v1.j.f117505a;
                        d(num, lVarV, i13 & 14);
                        i23 = i13 >> 3;
                        int i2111 = i13;
                        b(t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, value17, 7, null), null, z15, 0L, null, contentInCard, lVarV, i23 & 459648, 26);
                        lVarV.H(597012499);
                        if (str != null) {
                            c(str, lVarV, i23 & 14);
                        }
                        lVarV.T();
                        pVarA.invoke(lVarV, Integer.valueOf((i2111 >> 15) & 14));
                        lVarV.T();
                        lVarV.g();
                        lVarV.T();
                        lVarV.T();
                        if (o.J()) {
                            o.R();
                        }
                        z17 = z15;
                        dVar4 = dVar3;
                    }
                    pVar2 = pVarA;
                    z18 = z14;
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new a(num, str, dVar4, z17, z18, pVar2, contentInCard, i11, i12));
                    }
                }
                i22 = 1572864;
                i13 |= i22;
                if ((i13 & 2995931) == 599186) {
                    if (i24 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i16 != 0) {
                        z14 = true;
                    }
                    if (i18 != 0) {
                        pVarA = p.f76817a.a();
                    }
                    if (o.J()) {
                        o.S(1324495350, i13, -1, "com.stripe.android.uicore.elements.Section (SectionUI.kt:36)");
                    }
                    lVarV.H(290615945);
                    if ((i13 & i19) == 16384) {
                    }
                    objI = lVarV.I();
                    if (z16) {
                        if (z14) {
                            f11 = 8;
                        } else {
                            f11 = 0;
                        }
                        objI = h.d(h.g(f11));
                        lVarV.B(objI);
                    } else {
                        if (z14) {
                            f11 = 8;
                        } else {
                            f11 = 0;
                        }
                        objI = h.d(h.g(f11));
                        lVarV.B(objI);
                    }
                    float value18 = ((h) objI).getValue();
                    lVarV.T();
                    androidx.compose.ui.d dVarM18 = t.m(dVar3, BitmapDescriptorFactory.HUE_RED, value18, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                    lVarV.H(-483455358);
                    i0 i0VarA18 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
                    lVarV.H(-1323940314);
                    iA = j.a(lVarV, 0);
                    x xVarC18 = lVarV.c();
                    b4.g.Companion companion18 = b4.g.INSTANCE;
                    aVarA = companion18.a();
                    q<y2<b4.g>, l, Integer, h0> qVarA18 = a0.a(dVarM18);
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
                    d4.b(lVarA, i0VarA18, companion18.c());
                    d4.b(lVarA, xVarC18, companion18.e());
                    pVarB = companion18.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    qVarA18.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                    lVarV.H(2058660585);
                    v1.j jVar18 = v1.j.f117505a;
                    d(num, lVarV, i13 & 14);
                    i23 = i13 >> 3;
                    int i2112 = i13;
                    b(t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, value18, 7, null), null, z15, 0L, null, contentInCard, lVarV, i23 & 459648, 26);
                    lVarV.H(597012499);
                    if (str != null) {
                        c(str, lVarV, i23 & 14);
                    }
                    lVarV.T();
                    pVarA.invoke(lVarV, Integer.valueOf((i2112 >> 15) & 14));
                    lVarV.T();
                    lVarV.g();
                    lVarV.T();
                    lVarV.T();
                    if (o.J()) {
                        o.R();
                    }
                    z17 = z15;
                    dVar4 = dVar3;
                } else {
                    if (i24 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i16 != 0) {
                        z14 = true;
                    }
                    if (i18 != 0) {
                        pVarA = p.f76817a.a();
                    }
                    if (o.J()) {
                        o.S(1324495350, i13, -1, "com.stripe.android.uicore.elements.Section (SectionUI.kt:36)");
                    }
                    lVarV.H(290615945);
                    if ((i13 & i19) == 16384) {
                    }
                    objI = lVarV.I();
                    if (z16) {
                        if (z14) {
                            f11 = 8;
                        } else {
                            f11 = 0;
                        }
                        objI = h.d(h.g(f11));
                        lVarV.B(objI);
                    } else {
                        if (z14) {
                            f11 = 8;
                        } else {
                            f11 = 0;
                        }
                        objI = h.d(h.g(f11));
                        lVarV.B(objI);
                    }
                    float value19 = ((h) objI).getValue();
                    lVarV.T();
                    androidx.compose.ui.d dVarM19 = t.m(dVar3, BitmapDescriptorFactory.HUE_RED, value19, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                    lVarV.H(-483455358);
                    i0 i0VarA19 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
                    lVarV.H(-1323940314);
                    iA = j.a(lVarV, 0);
                    x xVarC19 = lVarV.c();
                    b4.g.Companion companion19 = b4.g.INSTANCE;
                    aVarA = companion19.a();
                    q<y2<b4.g>, l, Integer, h0> qVarA19 = a0.a(dVarM19);
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
                    d4.b(lVarA, i0VarA19, companion19.c());
                    d4.b(lVarA, xVarC19, companion19.e());
                    pVarB = companion19.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    qVarA19.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                    lVarV.H(2058660585);
                    v1.j jVar19 = v1.j.f117505a;
                    d(num, lVarV, i13 & 14);
                    i23 = i13 >> 3;
                    int i2113 = i13;
                    b(t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, value19, 7, null), null, z15, 0L, null, contentInCard, lVarV, i23 & 459648, 26);
                    lVarV.H(597012499);
                    if (str != null) {
                        c(str, lVarV, i23 & 14);
                    }
                    lVarV.T();
                    pVarA.invoke(lVarV, Integer.valueOf((i2113 >> 15) & 14));
                    lVarV.T();
                    lVarV.g();
                    lVarV.T();
                    lVarV.T();
                    if (o.J()) {
                        o.R();
                    }
                    z17 = z15;
                    dVar4 = dVar3;
                }
                pVar2 = pVarA;
                z18 = z14;
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new a(num, str, dVar4, z17, z18, pVar2, contentInCard, i11, i12));
                }
            }
            i13 |= 24576;
            z14 = z12;
            i18 = i12 & 32;
            if (i18 != 0) {
                i13 |= 196608;
                i19 = 57344;
                pVarA = pVar;
            } else {
                i19 = 57344;
                pVarA = pVar;
                if ((i11 & 458752) == 0) {
                    if (lVarV.K(pVarA)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
            }
            if ((i12 & 64) != 0) {
                if ((i11 & 3670016) == 0) {
                    if (lVarV.K(contentInCard)) {
                        i22 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i22 = PKIFailureInfo.signerNotTrusted;
                    }
                }
                if ((i13 & 2995931) == 599186) {
                    if (i24 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i16 != 0) {
                        z14 = true;
                    }
                    if (i18 != 0) {
                        pVarA = p.f76817a.a();
                    }
                    if (o.J()) {
                        o.S(1324495350, i13, -1, "com.stripe.android.uicore.elements.Section (SectionUI.kt:36)");
                    }
                    lVarV.H(290615945);
                    if ((i13 & i19) == 16384) {
                    }
                    objI = lVarV.I();
                    if (z16) {
                        if (z14) {
                            f11 = 8;
                        } else {
                            f11 = 0;
                        }
                        objI = h.d(h.g(f11));
                        lVarV.B(objI);
                    } else {
                        if (z14) {
                            f11 = 8;
                        } else {
                            f11 = 0;
                        }
                        objI = h.d(h.g(f11));
                        lVarV.B(objI);
                    }
                    float value110 = ((h) objI).getValue();
                    lVarV.T();
                    androidx.compose.ui.d dVarM110 = t.m(dVar3, BitmapDescriptorFactory.HUE_RED, value110, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                    lVarV.H(-483455358);
                    i0 i0VarA110 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
                    lVarV.H(-1323940314);
                    iA = j.a(lVarV, 0);
                    x xVarC110 = lVarV.c();
                    b4.g.Companion companion110 = b4.g.INSTANCE;
                    aVarA = companion110.a();
                    q<y2<b4.g>, l, Integer, h0> qVarA110 = a0.a(dVarM110);
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
                    d4.b(lVarA, i0VarA110, companion110.c());
                    d4.b(lVarA, xVarC110, companion110.e());
                    pVarB = companion110.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    qVarA110.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                    lVarV.H(2058660585);
                    v1.j jVar110 = v1.j.f117505a;
                    d(num, lVarV, i13 & 14);
                    i23 = i13 >> 3;
                    int i2114 = i13;
                    b(t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, value110, 7, null), null, z15, 0L, null, contentInCard, lVarV, i23 & 459648, 26);
                    lVarV.H(597012499);
                    if (str != null) {
                        c(str, lVarV, i23 & 14);
                    }
                    lVarV.T();
                    pVarA.invoke(lVarV, Integer.valueOf((i2114 >> 15) & 14));
                    lVarV.T();
                    lVarV.g();
                    lVarV.T();
                    lVarV.T();
                    if (o.J()) {
                        o.R();
                    }
                    z17 = z15;
                    dVar4 = dVar3;
                } else {
                    if (i24 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i16 != 0) {
                        z14 = true;
                    }
                    if (i18 != 0) {
                        pVarA = p.f76817a.a();
                    }
                    if (o.J()) {
                        o.S(1324495350, i13, -1, "com.stripe.android.uicore.elements.Section (SectionUI.kt:36)");
                    }
                    lVarV.H(290615945);
                    if ((i13 & i19) == 16384) {
                    }
                    objI = lVarV.I();
                    if (z16) {
                        if (z14) {
                            f11 = 8;
                        } else {
                            f11 = 0;
                        }
                        objI = h.d(h.g(f11));
                        lVarV.B(objI);
                    } else {
                        if (z14) {
                            f11 = 8;
                        } else {
                            f11 = 0;
                        }
                        objI = h.d(h.g(f11));
                        lVarV.B(objI);
                    }
                    float value111 = ((h) objI).getValue();
                    lVarV.T();
                    androidx.compose.ui.d dVarM111 = t.m(dVar3, BitmapDescriptorFactory.HUE_RED, value111, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                    lVarV.H(-483455358);
                    i0 i0VarA111 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
                    lVarV.H(-1323940314);
                    iA = j.a(lVarV, 0);
                    x xVarC111 = lVarV.c();
                    b4.g.Companion companion111 = b4.g.INSTANCE;
                    aVarA = companion111.a();
                    q<y2<b4.g>, l, Integer, h0> qVarA111 = a0.a(dVarM111);
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
                    d4.b(lVarA, i0VarA111, companion111.c());
                    d4.b(lVarA, xVarC111, companion111.e());
                    pVarB = companion111.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    qVarA111.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                    lVarV.H(2058660585);
                    v1.j jVar111 = v1.j.f117505a;
                    d(num, lVarV, i13 & 14);
                    i23 = i13 >> 3;
                    int i2115 = i13;
                    b(t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, value111, 7, null), null, z15, 0L, null, contentInCard, lVarV, i23 & 459648, 26);
                    lVarV.H(597012499);
                    if (str != null) {
                        c(str, lVarV, i23 & 14);
                    }
                    lVarV.T();
                    pVarA.invoke(lVarV, Integer.valueOf((i2115 >> 15) & 14));
                    lVarV.T();
                    lVarV.g();
                    lVarV.T();
                    lVarV.T();
                    if (o.J()) {
                        o.R();
                    }
                    z17 = z15;
                    dVar4 = dVar3;
                }
                pVar2 = pVarA;
                z18 = z14;
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new a(num, str, dVar4, z17, z18, pVar2, contentInCard, i11, i12));
                }
            }
            i22 = 1572864;
            i13 |= i22;
            if ((i13 & 2995931) == 599186) {
                if (i24 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z15 = false;
                } else {
                    z15 = z13;
                }
                if (i16 != 0) {
                    z14 = true;
                }
                if (i18 != 0) {
                    pVarA = p.f76817a.a();
                }
                if (o.J()) {
                    o.S(1324495350, i13, -1, "com.stripe.android.uicore.elements.Section (SectionUI.kt:36)");
                }
                lVarV.H(290615945);
                if ((i13 & i19) == 16384) {
                }
                objI = lVarV.I();
                if (z16) {
                    if (z14) {
                        f11 = 8;
                    } else {
                        f11 = 0;
                    }
                    objI = h.d(h.g(f11));
                    lVarV.B(objI);
                } else {
                    if (z14) {
                        f11 = 8;
                    } else {
                        f11 = 0;
                    }
                    objI = h.d(h.g(f11));
                    lVarV.B(objI);
                }
                float value112 = ((h) objI).getValue();
                lVarV.T();
                androidx.compose.ui.d dVarM112 = t.m(dVar3, BitmapDescriptorFactory.HUE_RED, value112, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                lVarV.H(-483455358);
                i0 i0VarA112 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
                lVarV.H(-1323940314);
                iA = j.a(lVarV, 0);
                x xVarC112 = lVarV.c();
                b4.g.Companion companion112 = b4.g.INSTANCE;
                aVarA = companion112.a();
                q<y2<b4.g>, l, Integer, h0> qVarA112 = a0.a(dVarM112);
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
                d4.b(lVarA, i0VarA112, companion112.c());
                d4.b(lVarA, xVarC112, companion112.e());
                pVarB = companion112.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA112.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                v1.j jVar112 = v1.j.f117505a;
                d(num, lVarV, i13 & 14);
                i23 = i13 >> 3;
                int i2116 = i13;
                b(t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, value112, 7, null), null, z15, 0L, null, contentInCard, lVarV, i23 & 459648, 26);
                lVarV.H(597012499);
                if (str != null) {
                    c(str, lVarV, i23 & 14);
                }
                lVarV.T();
                pVarA.invoke(lVarV, Integer.valueOf((i2116 >> 15) & 14));
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                if (o.J()) {
                    o.R();
                }
                z17 = z15;
                dVar4 = dVar3;
            } else {
                if (i24 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z15 = false;
                } else {
                    z15 = z13;
                }
                if (i16 != 0) {
                    z14 = true;
                }
                if (i18 != 0) {
                    pVarA = p.f76817a.a();
                }
                if (o.J()) {
                    o.S(1324495350, i13, -1, "com.stripe.android.uicore.elements.Section (SectionUI.kt:36)");
                }
                lVarV.H(290615945);
                if ((i13 & i19) == 16384) {
                }
                objI = lVarV.I();
                if (z16) {
                    if (z14) {
                        f11 = 8;
                    } else {
                        f11 = 0;
                    }
                    objI = h.d(h.g(f11));
                    lVarV.B(objI);
                } else {
                    if (z14) {
                        f11 = 8;
                    } else {
                        f11 = 0;
                    }
                    objI = h.d(h.g(f11));
                    lVarV.B(objI);
                }
                float value113 = ((h) objI).getValue();
                lVarV.T();
                androidx.compose.ui.d dVarM113 = t.m(dVar3, BitmapDescriptorFactory.HUE_RED, value113, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                lVarV.H(-483455358);
                i0 i0VarA113 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
                lVarV.H(-1323940314);
                iA = j.a(lVarV, 0);
                x xVarC113 = lVarV.c();
                b4.g.Companion companion113 = b4.g.INSTANCE;
                aVarA = companion113.a();
                q<y2<b4.g>, l, Integer, h0> qVarA113 = a0.a(dVarM113);
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
                d4.b(lVarA, i0VarA113, companion113.c());
                d4.b(lVarA, xVarC113, companion113.e());
                pVarB = companion113.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA113.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                v1.j jVar113 = v1.j.f117505a;
                d(num, lVarV, i13 & 14);
                i23 = i13 >> 3;
                int i2117 = i13;
                b(t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, value113, 7, null), null, z15, 0L, null, contentInCard, lVarV, i23 & 459648, 26);
                lVarV.H(597012499);
                if (str != null) {
                    c(str, lVarV, i23 & 14);
                }
                lVarV.T();
                pVarA.invoke(lVarV, Integer.valueOf((i2117 >> 15) & 14));
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                if (o.J()) {
                    o.R();
                }
                z17 = z15;
                dVar4 = dVar3;
            }
            pVar2 = pVarA;
            z18 = z14;
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new a(num, str, dVar4, z17, z18, pVar2, contentInCard, i11, i12));
            }
        }
        i13 |= 3072;
        z13 = z11;
        i16 = i12 & 16;
        if (i16 != 0) {
            if ((i11 & 57344) == 0) {
                z14 = z12;
                if (lVarV.p(z14)) {
                    i17 = 16384;
                } else {
                    i17 = PKIFailureInfo.certRevoked;
                }
                i13 |= i17;
            }
            i18 = i12 & 32;
            if (i18 != 0) {
                i13 |= 196608;
                i19 = 57344;
                pVarA = pVar;
            } else {
                i19 = 57344;
                pVarA = pVar;
                if ((i11 & 458752) == 0) {
                    if (lVarV.K(pVarA)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
            }
            if ((i12 & 64) != 0) {
                if ((i11 & 3670016) == 0) {
                    if (lVarV.K(contentInCard)) {
                        i22 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i22 = PKIFailureInfo.signerNotTrusted;
                    }
                }
                if ((i13 & 2995931) == 599186) {
                    if (i24 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i16 != 0) {
                        z14 = true;
                    }
                    if (i18 != 0) {
                        pVarA = p.f76817a.a();
                    }
                    if (o.J()) {
                        o.S(1324495350, i13, -1, "com.stripe.android.uicore.elements.Section (SectionUI.kt:36)");
                    }
                    lVarV.H(290615945);
                    if ((i13 & i19) == 16384) {
                    }
                    objI = lVarV.I();
                    if (z16) {
                        if (z14) {
                            f11 = 8;
                        } else {
                            f11 = 0;
                        }
                        objI = h.d(h.g(f11));
                        lVarV.B(objI);
                    } else {
                        if (z14) {
                            f11 = 8;
                        } else {
                            f11 = 0;
                        }
                        objI = h.d(h.g(f11));
                        lVarV.B(objI);
                    }
                    float value114 = ((h) objI).getValue();
                    lVarV.T();
                    androidx.compose.ui.d dVarM114 = t.m(dVar3, BitmapDescriptorFactory.HUE_RED, value114, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                    lVarV.H(-483455358);
                    i0 i0VarA114 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
                    lVarV.H(-1323940314);
                    iA = j.a(lVarV, 0);
                    x xVarC114 = lVarV.c();
                    b4.g.Companion companion114 = b4.g.INSTANCE;
                    aVarA = companion114.a();
                    q<y2<b4.g>, l, Integer, h0> qVarA114 = a0.a(dVarM114);
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
                    d4.b(lVarA, i0VarA114, companion114.c());
                    d4.b(lVarA, xVarC114, companion114.e());
                    pVarB = companion114.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    qVarA114.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                    lVarV.H(2058660585);
                    v1.j jVar114 = v1.j.f117505a;
                    d(num, lVarV, i13 & 14);
                    i23 = i13 >> 3;
                    int i2118 = i13;
                    b(t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, value114, 7, null), null, z15, 0L, null, contentInCard, lVarV, i23 & 459648, 26);
                    lVarV.H(597012499);
                    if (str != null) {
                        c(str, lVarV, i23 & 14);
                    }
                    lVarV.T();
                    pVarA.invoke(lVarV, Integer.valueOf((i2118 >> 15) & 14));
                    lVarV.T();
                    lVarV.g();
                    lVarV.T();
                    lVarV.T();
                    if (o.J()) {
                        o.R();
                    }
                    z17 = z15;
                    dVar4 = dVar3;
                } else {
                    if (i24 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i16 != 0) {
                        z14 = true;
                    }
                    if (i18 != 0) {
                        pVarA = p.f76817a.a();
                    }
                    if (o.J()) {
                        o.S(1324495350, i13, -1, "com.stripe.android.uicore.elements.Section (SectionUI.kt:36)");
                    }
                    lVarV.H(290615945);
                    if ((i13 & i19) == 16384) {
                    }
                    objI = lVarV.I();
                    if (z16) {
                        if (z14) {
                            f11 = 8;
                        } else {
                            f11 = 0;
                        }
                        objI = h.d(h.g(f11));
                        lVarV.B(objI);
                    } else {
                        if (z14) {
                            f11 = 8;
                        } else {
                            f11 = 0;
                        }
                        objI = h.d(h.g(f11));
                        lVarV.B(objI);
                    }
                    float value115 = ((h) objI).getValue();
                    lVarV.T();
                    androidx.compose.ui.d dVarM115 = t.m(dVar3, BitmapDescriptorFactory.HUE_RED, value115, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                    lVarV.H(-483455358);
                    i0 i0VarA115 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
                    lVarV.H(-1323940314);
                    iA = j.a(lVarV, 0);
                    x xVarC115 = lVarV.c();
                    b4.g.Companion companion115 = b4.g.INSTANCE;
                    aVarA = companion115.a();
                    q<y2<b4.g>, l, Integer, h0> qVarA115 = a0.a(dVarM115);
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
                    d4.b(lVarA, i0VarA115, companion115.c());
                    d4.b(lVarA, xVarC115, companion115.e());
                    pVarB = companion115.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    qVarA115.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                    lVarV.H(2058660585);
                    v1.j jVar115 = v1.j.f117505a;
                    d(num, lVarV, i13 & 14);
                    i23 = i13 >> 3;
                    int i2119 = i13;
                    b(t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, value115, 7, null), null, z15, 0L, null, contentInCard, lVarV, i23 & 459648, 26);
                    lVarV.H(597012499);
                    if (str != null) {
                        c(str, lVarV, i23 & 14);
                    }
                    lVarV.T();
                    pVarA.invoke(lVarV, Integer.valueOf((i2119 >> 15) & 14));
                    lVarV.T();
                    lVarV.g();
                    lVarV.T();
                    lVarV.T();
                    if (o.J()) {
                        o.R();
                    }
                    z17 = z15;
                    dVar4 = dVar3;
                }
                pVar2 = pVarA;
                z18 = z14;
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new a(num, str, dVar4, z17, z18, pVar2, contentInCard, i11, i12));
                }
            }
            i22 = 1572864;
            i13 |= i22;
            if ((i13 & 2995931) == 599186) {
                if (i24 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z15 = false;
                } else {
                    z15 = z13;
                }
                if (i16 != 0) {
                    z14 = true;
                }
                if (i18 != 0) {
                    pVarA = p.f76817a.a();
                }
                if (o.J()) {
                    o.S(1324495350, i13, -1, "com.stripe.android.uicore.elements.Section (SectionUI.kt:36)");
                }
                lVarV.H(290615945);
                if ((i13 & i19) == 16384) {
                }
                objI = lVarV.I();
                if (z16) {
                    if (z14) {
                        f11 = 8;
                    } else {
                        f11 = 0;
                    }
                    objI = h.d(h.g(f11));
                    lVarV.B(objI);
                } else {
                    if (z14) {
                        f11 = 8;
                    } else {
                        f11 = 0;
                    }
                    objI = h.d(h.g(f11));
                    lVarV.B(objI);
                }
                float value116 = ((h) objI).getValue();
                lVarV.T();
                androidx.compose.ui.d dVarM116 = t.m(dVar3, BitmapDescriptorFactory.HUE_RED, value116, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                lVarV.H(-483455358);
                i0 i0VarA116 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
                lVarV.H(-1323940314);
                iA = j.a(lVarV, 0);
                x xVarC116 = lVarV.c();
                b4.g.Companion companion116 = b4.g.INSTANCE;
                aVarA = companion116.a();
                q<y2<b4.g>, l, Integer, h0> qVarA116 = a0.a(dVarM116);
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
                d4.b(lVarA, i0VarA116, companion116.c());
                d4.b(lVarA, xVarC116, companion116.e());
                pVarB = companion116.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA116.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                v1.j jVar116 = v1.j.f117505a;
                d(num, lVarV, i13 & 14);
                i23 = i13 >> 3;
                int i21110 = i13;
                b(t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, value116, 7, null), null, z15, 0L, null, contentInCard, lVarV, i23 & 459648, 26);
                lVarV.H(597012499);
                if (str != null) {
                    c(str, lVarV, i23 & 14);
                }
                lVarV.T();
                pVarA.invoke(lVarV, Integer.valueOf((i21110 >> 15) & 14));
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                if (o.J()) {
                    o.R();
                }
                z17 = z15;
                dVar4 = dVar3;
            } else {
                if (i24 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z15 = false;
                } else {
                    z15 = z13;
                }
                if (i16 != 0) {
                    z14 = true;
                }
                if (i18 != 0) {
                    pVarA = p.f76817a.a();
                }
                if (o.J()) {
                    o.S(1324495350, i13, -1, "com.stripe.android.uicore.elements.Section (SectionUI.kt:36)");
                }
                lVarV.H(290615945);
                if ((i13 & i19) == 16384) {
                }
                objI = lVarV.I();
                if (z16) {
                    if (z14) {
                        f11 = 8;
                    } else {
                        f11 = 0;
                    }
                    objI = h.d(h.g(f11));
                    lVarV.B(objI);
                } else {
                    if (z14) {
                        f11 = 8;
                    } else {
                        f11 = 0;
                    }
                    objI = h.d(h.g(f11));
                    lVarV.B(objI);
                }
                float value117 = ((h) objI).getValue();
                lVarV.T();
                androidx.compose.ui.d dVarM117 = t.m(dVar3, BitmapDescriptorFactory.HUE_RED, value117, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                lVarV.H(-483455358);
                i0 i0VarA117 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
                lVarV.H(-1323940314);
                iA = j.a(lVarV, 0);
                x xVarC117 = lVarV.c();
                b4.g.Companion companion117 = b4.g.INSTANCE;
                aVarA = companion117.a();
                q<y2<b4.g>, l, Integer, h0> qVarA117 = a0.a(dVarM117);
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
                d4.b(lVarA, i0VarA117, companion117.c());
                d4.b(lVarA, xVarC117, companion117.e());
                pVarB = companion117.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA117.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                v1.j jVar117 = v1.j.f117505a;
                d(num, lVarV, i13 & 14);
                i23 = i13 >> 3;
                int i21111 = i13;
                b(t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, value117, 7, null), null, z15, 0L, null, contentInCard, lVarV, i23 & 459648, 26);
                lVarV.H(597012499);
                if (str != null) {
                    c(str, lVarV, i23 & 14);
                }
                lVarV.T();
                pVarA.invoke(lVarV, Integer.valueOf((i21111 >> 15) & 14));
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                if (o.J()) {
                    o.R();
                }
                z17 = z15;
                dVar4 = dVar3;
            }
            pVar2 = pVarA;
            z18 = z14;
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new a(num, str, dVar4, z17, z18, pVar2, contentInCard, i11, i12));
            }
        }
        i13 |= 24576;
        z14 = z12;
        i18 = i12 & 32;
        if (i18 != 0) {
            i13 |= 196608;
            i19 = 57344;
            pVarA = pVar;
        } else {
            i19 = 57344;
            pVarA = pVar;
            if ((i11 & 458752) == 0) {
                if (lVarV.K(pVarA)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            }
        }
        if ((i12 & 64) != 0) {
            if ((i11 & 3670016) == 0) {
                if (lVarV.K(contentInCard)) {
                    i22 = PKIFailureInfo.badCertTemplate;
                } else {
                    i22 = PKIFailureInfo.signerNotTrusted;
                }
            }
            if ((i13 & 2995931) == 599186) {
                if (i24 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z15 = false;
                } else {
                    z15 = z13;
                }
                if (i16 != 0) {
                    z14 = true;
                }
                if (i18 != 0) {
                    pVarA = p.f76817a.a();
                }
                if (o.J()) {
                    o.S(1324495350, i13, -1, "com.stripe.android.uicore.elements.Section (SectionUI.kt:36)");
                }
                lVarV.H(290615945);
                if ((i13 & i19) == 16384) {
                }
                objI = lVarV.I();
                if (z16) {
                    if (z14) {
                        f11 = 8;
                    } else {
                        f11 = 0;
                    }
                    objI = h.d(h.g(f11));
                    lVarV.B(objI);
                } else {
                    if (z14) {
                        f11 = 8;
                    } else {
                        f11 = 0;
                    }
                    objI = h.d(h.g(f11));
                    lVarV.B(objI);
                }
                float value118 = ((h) objI).getValue();
                lVarV.T();
                androidx.compose.ui.d dVarM118 = t.m(dVar3, BitmapDescriptorFactory.HUE_RED, value118, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                lVarV.H(-483455358);
                i0 i0VarA118 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
                lVarV.H(-1323940314);
                iA = j.a(lVarV, 0);
                x xVarC118 = lVarV.c();
                b4.g.Companion companion118 = b4.g.INSTANCE;
                aVarA = companion118.a();
                q<y2<b4.g>, l, Integer, h0> qVarA118 = a0.a(dVarM118);
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
                d4.b(lVarA, i0VarA118, companion118.c());
                d4.b(lVarA, xVarC118, companion118.e());
                pVarB = companion118.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA118.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                v1.j jVar118 = v1.j.f117505a;
                d(num, lVarV, i13 & 14);
                i23 = i13 >> 3;
                int i21112 = i13;
                b(t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, value118, 7, null), null, z15, 0L, null, contentInCard, lVarV, i23 & 459648, 26);
                lVarV.H(597012499);
                if (str != null) {
                    c(str, lVarV, i23 & 14);
                }
                lVarV.T();
                pVarA.invoke(lVarV, Integer.valueOf((i21112 >> 15) & 14));
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                if (o.J()) {
                    o.R();
                }
                z17 = z15;
                dVar4 = dVar3;
            } else {
                if (i24 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z15 = false;
                } else {
                    z15 = z13;
                }
                if (i16 != 0) {
                    z14 = true;
                }
                if (i18 != 0) {
                    pVarA = p.f76817a.a();
                }
                if (o.J()) {
                    o.S(1324495350, i13, -1, "com.stripe.android.uicore.elements.Section (SectionUI.kt:36)");
                }
                lVarV.H(290615945);
                if ((i13 & i19) == 16384) {
                }
                objI = lVarV.I();
                if (z16) {
                    if (z14) {
                        f11 = 8;
                    } else {
                        f11 = 0;
                    }
                    objI = h.d(h.g(f11));
                    lVarV.B(objI);
                } else {
                    if (z14) {
                        f11 = 8;
                    } else {
                        f11 = 0;
                    }
                    objI = h.d(h.g(f11));
                    lVarV.B(objI);
                }
                float value119 = ((h) objI).getValue();
                lVarV.T();
                androidx.compose.ui.d dVarM119 = t.m(dVar3, BitmapDescriptorFactory.HUE_RED, value119, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
                lVarV.H(-483455358);
                i0 i0VarA119 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
                lVarV.H(-1323940314);
                iA = j.a(lVarV, 0);
                x xVarC119 = lVarV.c();
                b4.g.Companion companion119 = b4.g.INSTANCE;
                aVarA = companion119.a();
                q<y2<b4.g>, l, Integer, h0> qVarA119 = a0.a(dVarM119);
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
                d4.b(lVarA, i0VarA119, companion119.c());
                d4.b(lVarA, xVarC119, companion119.e());
                pVarB = companion119.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                qVarA119.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                v1.j jVar119 = v1.j.f117505a;
                d(num, lVarV, i13 & 14);
                i23 = i13 >> 3;
                int i21113 = i13;
                b(t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, value119, 7, null), null, z15, 0L, null, contentInCard, lVarV, i23 & 459648, 26);
                lVarV.H(597012499);
                if (str != null) {
                    c(str, lVarV, i23 & 14);
                }
                lVarV.T();
                pVarA.invoke(lVarV, Integer.valueOf((i21113 >> 15) & 14));
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
                if (o.J()) {
                    o.R();
                }
                z17 = z15;
                dVar4 = dVar3;
            }
            pVar2 = pVarA;
            z18 = z14;
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new a(num, str, dVar4, z17, z18, pVar2, contentInCard, i11, i12));
            }
        }
        i22 = 1572864;
        i13 |= i22;
        if ((i13 & 2995931) == 599186) {
            if (i24 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i14 != 0) {
                z15 = false;
            } else {
                z15 = z13;
            }
            if (i16 != 0) {
                z14 = true;
            }
            if (i18 != 0) {
                pVarA = p.f76817a.a();
            }
            if (o.J()) {
                o.S(1324495350, i13, -1, "com.stripe.android.uicore.elements.Section (SectionUI.kt:36)");
            }
            lVarV.H(290615945);
            if ((i13 & i19) == 16384) {
            }
            objI = lVarV.I();
            if (z16) {
                if (z14) {
                    f11 = 8;
                } else {
                    f11 = 0;
                }
                objI = h.d(h.g(f11));
                lVarV.B(objI);
            } else {
                if (z14) {
                    f11 = 8;
                } else {
                    f11 = 0;
                }
                objI = h.d(h.g(f11));
                lVarV.B(objI);
            }
            float value1110 = ((h) objI).getValue();
            lVarV.T();
            androidx.compose.ui.d dVarM1110 = t.m(dVar3, BitmapDescriptorFactory.HUE_RED, value1110, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
            lVarV.H(-483455358);
            i0 i0VarA1110 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
            lVarV.H(-1323940314);
            iA = j.a(lVarV, 0);
            x xVarC1110 = lVarV.c();
            b4.g.Companion companion1110 = b4.g.INSTANCE;
            aVarA = companion1110.a();
            q<y2<b4.g>, l, Integer, h0> qVarA1110 = a0.a(dVarM1110);
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
            d4.b(lVarA, i0VarA1110, companion1110.c());
            d4.b(lVarA, xVarC1110, companion1110.e());
            pVarB = companion1110.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA1110.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.j jVar1110 = v1.j.f117505a;
            d(num, lVarV, i13 & 14);
            i23 = i13 >> 3;
            int i21114 = i13;
            b(t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, value1110, 7, null), null, z15, 0L, null, contentInCard, lVarV, i23 & 459648, 26);
            lVarV.H(597012499);
            if (str != null) {
                c(str, lVarV, i23 & 14);
            }
            lVarV.T();
            pVarA.invoke(lVarV, Integer.valueOf((i21114 >> 15) & 14));
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            if (o.J()) {
                o.R();
            }
            z17 = z15;
            dVar4 = dVar3;
        } else {
            if (i24 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i14 != 0) {
                z15 = false;
            } else {
                z15 = z13;
            }
            if (i16 != 0) {
                z14 = true;
            }
            if (i18 != 0) {
                pVarA = p.f76817a.a();
            }
            if (o.J()) {
                o.S(1324495350, i13, -1, "com.stripe.android.uicore.elements.Section (SectionUI.kt:36)");
            }
            lVarV.H(290615945);
            if ((i13 & i19) == 16384) {
            }
            objI = lVarV.I();
            if (z16) {
                if (z14) {
                    f11 = 8;
                } else {
                    f11 = 0;
                }
                objI = h.d(h.g(f11));
                lVarV.B(objI);
            } else {
                if (z14) {
                    f11 = 8;
                } else {
                    f11 = 0;
                }
                objI = h.d(h.g(f11));
                lVarV.B(objI);
            }
            float value1111 = ((h) objI).getValue();
            lVarV.T();
            androidx.compose.ui.d dVarM1111 = t.m(dVar3, BitmapDescriptorFactory.HUE_RED, value1111, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
            lVarV.H(-483455358);
            i0 i0VarA1111 = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVarV, 0);
            lVarV.H(-1323940314);
            iA = j.a(lVarV, 0);
            x xVarC1111 = lVarV.c();
            b4.g.Companion companion1111 = b4.g.INSTANCE;
            aVarA = companion1111.a();
            q<y2<b4.g>, l, Integer, h0> qVarA1111 = a0.a(dVarM1111);
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
            d4.b(lVarA, i0VarA1111, companion1111.c());
            d4.b(lVarA, xVarC1111, companion1111.e());
            pVarB = companion1111.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA1111.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.j jVar1111 = v1.j.f117505a;
            d(num, lVarV, i13 & 14);
            i23 = i13 >> 3;
            int i21115 = i13;
            b(t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, value1111, 7, null), null, z15, 0L, null, contentInCard, lVarV, i23 & 459648, 26);
            lVarV.H(597012499);
            if (str != null) {
                c(str, lVarV, i23 & 14);
            }
            lVarV.T();
            pVarA.invoke(lVarV, Integer.valueOf((i21115 >> 15) & 14));
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            if (o.J()) {
                o.R();
            }
            z17 = z15;
            dVar4 = dVar3;
        }
        pVar2 = pVarA;
        z18 = z14;
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(num, str, dVar4, z17, z18, pVar2, contentInCard, i11, i12));
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0136  */
    /* JADX WARN: Code duplicated, block: B:103:0x0150  */
    /* JADX WARN: Code duplicated, block: B:106:0x0164  */
    /* JADX WARN: Code duplicated, block: B:108:0x016c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0176  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:117:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00df  */
    /* JADX WARN: Code duplicated, block: B:88:0x0102 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0104  */
    /* JADX WARN: Code duplicated, block: B:90:0x0107  */
    /* JADX WARN: Code duplicated, block: B:93:0x010c  */
    /* JADX WARN: Code duplicated, block: B:94:0x011b  */
    /* JADX WARN: Code duplicated, block: B:96:0x011e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0123  */
    public static final void b(androidx.compose.ui.d dVar, g4 g4Var, boolean z11, long j11, BorderStroke borderStroke, p<? super l, ? super Integer, h0> content, l lVar, int i11, int i12) {
        androidx.compose.ui.d dVar2;
        int i13;
        g4 g4Var2;
        boolean z12;
        long component;
        BorderStroke borderStroke2;
        int i14;
        androidx.compose.ui.d dVar3;
        g4 medium;
        androidx.compose.ui.d dVar4;
        boolean z13;
        g4 g4Var3;
        long j12;
        float fG;
        l lVar2;
        boolean z14;
        androidx.compose.ui.d dVar5;
        g4 g4Var4;
        long j13;
        BorderStroke borderStroke3;
        w2 w2VarX;
        int i15;
        s.k(content, "content");
        l lVarV = lVar.v(-1810201954);
        int i16 = i12 & 1;
        if (i16 != 0) {
            i13 = i11 | 6;
            dVar2 = dVar;
        } else if ((i11 & 14) == 0) {
            dVar2 = dVar;
            i13 = (lVarV.n(dVar2) ? 4 : 2) | i11;
        } else {
            dVar2 = dVar;
            i13 = i11;
        }
        if ((i11 & 112) == 0) {
            if ((i12 & 2) == 0) {
                g4Var2 = g4Var;
                int i17 = lVarV.n(g4Var2) ? 32 : 16;
                i13 |= i17;
            } else {
                g4Var2 = g4Var;
            }
            i13 |= i17;
        } else {
            g4Var2 = g4Var;
        }
        int i18 = i12 & 4;
        if (i18 == 0) {
            if ((i11 & 896) == 0) {
                z12 = z11;
                i13 |= lVarV.p(z12) ? 256 : 128;
            }
            if ((i11 & 7168) == 0) {
                if ((i12 & 8) == 0) {
                    component = j11;
                    int i19 = lVarV.s(component) ? 2048 : 1024;
                    i13 |= i19;
                } else {
                    component = j11;
                }
                i13 |= i19;
            } else {
                component = j11;
            }
            if ((i11 & 57344) == 0) {
                if ((i12 & 16) == 0) {
                    borderStroke2 = borderStroke;
                    if (lVarV.n(borderStroke2)) {
                        i15 = 16384;
                    }
                    i13 |= i15;
                } else {
                    borderStroke2 = borderStroke;
                }
                i15 = PKIFailureInfo.certRevoked;
                i13 |= i15;
            } else {
                borderStroke2 = borderStroke;
            }
            if ((i12 & 32) != 0) {
                if ((458752 & i11) == 0) {
                    if (lVarV.K(content)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                }
                if ((374491 & i13) == 74898 || !lVarV.b()) {
                    lVarV.L();
                    if ((i11 & 1) != 0 || lVarV.k()) {
                        if (i16 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if ((i12 & 2) != 0) {
                            medium = j1.f74525a.b(lVarV, j1.f74526b).getMedium();
                            i13 &= -113;
                        } else {
                            medium = g4Var2;
                        }
                        if (i18 != 0) {
                            z12 = false;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                            component = n.n(j1.f74525a, lVarV, j1.f74526b).getComponent();
                        }
                        if ((i12 & 16) != 0) {
                            BorderStroke borderStrokeE = n.e(j1.f74525a, z12, lVarV, j1.f74526b | ((i13 >> 3) & 112));
                            i13 &= -57345;
                            boolean z15 = z12;
                            dVar4 = dVar3;
                            z13 = z15;
                            long j14 = component;
                            g4Var3 = medium;
                            j12 = j14;
                            borderStroke2 = borderStrokeE;
                        } else {
                            boolean z16 = z12;
                            dVar4 = dVar3;
                            z13 = z16;
                            long j15 = component;
                            g4Var3 = medium;
                            j12 = j15;
                        }
                    } else {
                        lVarV.j();
                        if ((i12 & 2) != 0) {
                            i13 &= -113;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                        }
                        z13 = z12;
                        dVar4 = dVar2;
                        j12 = component;
                        g4Var3 = g4Var2;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-1810201954, i13, -1, "com.stripe.android.uicore.elements.SectionCard (SectionUI.kt:84)");
                    }
                    if (z13) {
                        fG = h.g((float) 1.5d);
                    } else {
                        fG = h.g(0);
                    }
                    BorderStroke borderStroke4 = borderStroke2;
                    lVar2 = lVarV;
                    m.a(dVar4, g4Var3, j12, 0L, borderStroke4, fG, z2.c.b(lVarV, -72062207, true, new b(content)), lVar2, 1572864 | (i13 & 14) | (i13 & 112) | ((i13 >> 3) & 896) | (57344 & i13), 8);
                    if (o.J()) {
                        o.R();
                    }
                    z14 = z13;
                    dVar5 = dVar4;
                    g4Var4 = g4Var3;
                    j13 = j12;
                    borderStroke3 = borderStroke4;
                } else {
                    lVarV.j();
                    lVar2 = lVarV;
                    dVar5 = dVar2;
                    g4Var4 = g4Var2;
                    z14 = z12;
                    j13 = component;
                    borderStroke3 = borderStroke2;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new c(dVar5, g4Var4, z14, j13, borderStroke3, content, i11, i12));
                }
            }
            i14 = 196608;
            i13 |= i14;
            if ((374491 & i13) == 74898) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i16 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i12 & 2) != 0) {
                        medium = j1.f74525a.b(lVarV, j1.f74526b).getMedium();
                        i13 &= -113;
                    } else {
                        medium = g4Var2;
                    }
                    if (i18 != 0) {
                        z12 = false;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        component = n.n(j1.f74525a, lVarV, j1.f74526b).getComponent();
                    }
                    if ((i12 & 16) != 0) {
                        BorderStroke borderStrokeE2 = n.e(j1.f74525a, z12, lVarV, j1.f74526b | ((i13 >> 3) & 112));
                        i13 &= -57345;
                        boolean z17 = z12;
                        dVar4 = dVar3;
                        z13 = z17;
                        long j16 = component;
                        g4Var3 = medium;
                        j12 = j16;
                        borderStroke2 = borderStrokeE2;
                    } else {
                        boolean z18 = z12;
                        dVar4 = dVar3;
                        z13 = z18;
                        long j17 = component;
                        g4Var3 = medium;
                        j12 = j17;
                    }
                } else {
                    if (i16 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i12 & 2) != 0) {
                        medium = j1.f74525a.b(lVarV, j1.f74526b).getMedium();
                        i13 &= -113;
                    } else {
                        medium = g4Var2;
                    }
                    if (i18 != 0) {
                        z12 = false;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        component = n.n(j1.f74525a, lVarV, j1.f74526b).getComponent();
                    }
                    if ((i12 & 16) != 0) {
                        BorderStroke borderStrokeE3 = n.e(j1.f74525a, z12, lVarV, j1.f74526b | ((i13 >> 3) & 112));
                        i13 &= -57345;
                        boolean z19 = z12;
                        dVar4 = dVar3;
                        z13 = z19;
                        long j18 = component;
                        g4Var3 = medium;
                        j12 = j18;
                        borderStroke2 = borderStrokeE3;
                    } else {
                        boolean z110 = z12;
                        dVar4 = dVar3;
                        z13 = z110;
                        long j19 = component;
                        g4Var3 = medium;
                        j12 = j19;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-1810201954, i13, -1, "com.stripe.android.uicore.elements.SectionCard (SectionUI.kt:84)");
                }
                if (z13) {
                    fG = h.g((float) 1.5d);
                } else {
                    fG = h.g(0);
                }
                BorderStroke borderStroke5 = borderStroke2;
                lVar2 = lVarV;
                m.a(dVar4, g4Var3, j12, 0L, borderStroke5, fG, z2.c.b(lVarV, -72062207, true, new b(content)), lVar2, 1572864 | (i13 & 14) | (i13 & 112) | ((i13 >> 3) & 896) | (57344 & i13), 8);
                if (o.J()) {
                    o.R();
                }
                z14 = z13;
                dVar5 = dVar4;
                g4Var4 = g4Var3;
                j13 = j12;
                borderStroke3 = borderStroke5;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i16 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i12 & 2) != 0) {
                        medium = j1.f74525a.b(lVarV, j1.f74526b).getMedium();
                        i13 &= -113;
                    } else {
                        medium = g4Var2;
                    }
                    if (i18 != 0) {
                        z12 = false;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        component = n.n(j1.f74525a, lVarV, j1.f74526b).getComponent();
                    }
                    if ((i12 & 16) != 0) {
                        BorderStroke borderStrokeE4 = n.e(j1.f74525a, z12, lVarV, j1.f74526b | ((i13 >> 3) & 112));
                        i13 &= -57345;
                        boolean z111 = z12;
                        dVar4 = dVar3;
                        z13 = z111;
                        long j110 = component;
                        g4Var3 = medium;
                        j12 = j110;
                        borderStroke2 = borderStrokeE4;
                    } else {
                        boolean z112 = z12;
                        dVar4 = dVar3;
                        z13 = z112;
                        long j111 = component;
                        g4Var3 = medium;
                        j12 = j111;
                    }
                } else {
                    if (i16 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i12 & 2) != 0) {
                        medium = j1.f74525a.b(lVarV, j1.f74526b).getMedium();
                        i13 &= -113;
                    } else {
                        medium = g4Var2;
                    }
                    if (i18 != 0) {
                        z12 = false;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        component = n.n(j1.f74525a, lVarV, j1.f74526b).getComponent();
                    }
                    if ((i12 & 16) != 0) {
                        BorderStroke borderStrokeE5 = n.e(j1.f74525a, z12, lVarV, j1.f74526b | ((i13 >> 3) & 112));
                        i13 &= -57345;
                        boolean z113 = z12;
                        dVar4 = dVar3;
                        z13 = z113;
                        long j112 = component;
                        g4Var3 = medium;
                        j12 = j112;
                        borderStroke2 = borderStrokeE5;
                    } else {
                        boolean z114 = z12;
                        dVar4 = dVar3;
                        z13 = z114;
                        long j113 = component;
                        g4Var3 = medium;
                        j12 = j113;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-1810201954, i13, -1, "com.stripe.android.uicore.elements.SectionCard (SectionUI.kt:84)");
                }
                if (z13) {
                    fG = h.g((float) 1.5d);
                } else {
                    fG = h.g(0);
                }
                BorderStroke borderStroke6 = borderStroke2;
                lVar2 = lVarV;
                m.a(dVar4, g4Var3, j12, 0L, borderStroke6, fG, z2.c.b(lVarV, -72062207, true, new b(content)), lVar2, 1572864 | (i13 & 14) | (i13 & 112) | ((i13 >> 3) & 896) | (57344 & i13), 8);
                if (o.J()) {
                    o.R();
                }
                z14 = z13;
                dVar5 = dVar4;
                g4Var4 = g4Var3;
                j13 = j12;
                borderStroke3 = borderStroke6;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new c(dVar5, g4Var4, z14, j13, borderStroke3, content, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        z12 = z11;
        if ((i11 & 7168) == 0) {
            if ((i12 & 8) == 0) {
                component = j11;
                if (lVarV.s(component)) {
                }
                i13 |= i19;
            } else {
                component = j11;
            }
            i13 |= i19;
        } else {
            component = j11;
        }
        if ((i11 & 57344) == 0) {
            if ((i12 & 16) == 0) {
                borderStroke2 = borderStroke;
                if (lVarV.n(borderStroke2)) {
                    i15 = 16384;
                }
                i13 |= i15;
            } else {
                borderStroke2 = borderStroke;
            }
            i15 = PKIFailureInfo.certRevoked;
            i13 |= i15;
        } else {
            borderStroke2 = borderStroke;
        }
        if ((i12 & 32) != 0) {
            if ((458752 & i11) == 0) {
                if (lVarV.K(content)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
            }
            if ((374491 & i13) == 74898) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i16 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i12 & 2) != 0) {
                        medium = j1.f74525a.b(lVarV, j1.f74526b).getMedium();
                        i13 &= -113;
                    } else {
                        medium = g4Var2;
                    }
                    if (i18 != 0) {
                        z12 = false;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        component = n.n(j1.f74525a, lVarV, j1.f74526b).getComponent();
                    }
                    if ((i12 & 16) != 0) {
                        BorderStroke borderStrokeE6 = n.e(j1.f74525a, z12, lVarV, j1.f74526b | ((i13 >> 3) & 112));
                        i13 &= -57345;
                        boolean z115 = z12;
                        dVar4 = dVar3;
                        z13 = z115;
                        long j114 = component;
                        g4Var3 = medium;
                        j12 = j114;
                        borderStroke2 = borderStrokeE6;
                    } else {
                        boolean z116 = z12;
                        dVar4 = dVar3;
                        z13 = z116;
                        long j115 = component;
                        g4Var3 = medium;
                        j12 = j115;
                    }
                } else {
                    if (i16 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i12 & 2) != 0) {
                        medium = j1.f74525a.b(lVarV, j1.f74526b).getMedium();
                        i13 &= -113;
                    } else {
                        medium = g4Var2;
                    }
                    if (i18 != 0) {
                        z12 = false;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        component = n.n(j1.f74525a, lVarV, j1.f74526b).getComponent();
                    }
                    if ((i12 & 16) != 0) {
                        BorderStroke borderStrokeE7 = n.e(j1.f74525a, z12, lVarV, j1.f74526b | ((i13 >> 3) & 112));
                        i13 &= -57345;
                        boolean z117 = z12;
                        dVar4 = dVar3;
                        z13 = z117;
                        long j116 = component;
                        g4Var3 = medium;
                        j12 = j116;
                        borderStroke2 = borderStrokeE7;
                    } else {
                        boolean z118 = z12;
                        dVar4 = dVar3;
                        z13 = z118;
                        long j117 = component;
                        g4Var3 = medium;
                        j12 = j117;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-1810201954, i13, -1, "com.stripe.android.uicore.elements.SectionCard (SectionUI.kt:84)");
                }
                if (z13) {
                    fG = h.g((float) 1.5d);
                } else {
                    fG = h.g(0);
                }
                BorderStroke borderStroke7 = borderStroke2;
                lVar2 = lVarV;
                m.a(dVar4, g4Var3, j12, 0L, borderStroke7, fG, z2.c.b(lVarV, -72062207, true, new b(content)), lVar2, 1572864 | (i13 & 14) | (i13 & 112) | ((i13 >> 3) & 896) | (57344 & i13), 8);
                if (o.J()) {
                    o.R();
                }
                z14 = z13;
                dVar5 = dVar4;
                g4Var4 = g4Var3;
                j13 = j12;
                borderStroke3 = borderStroke7;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i16 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i12 & 2) != 0) {
                        medium = j1.f74525a.b(lVarV, j1.f74526b).getMedium();
                        i13 &= -113;
                    } else {
                        medium = g4Var2;
                    }
                    if (i18 != 0) {
                        z12 = false;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        component = n.n(j1.f74525a, lVarV, j1.f74526b).getComponent();
                    }
                    if ((i12 & 16) != 0) {
                        BorderStroke borderStrokeE8 = n.e(j1.f74525a, z12, lVarV, j1.f74526b | ((i13 >> 3) & 112));
                        i13 &= -57345;
                        boolean z119 = z12;
                        dVar4 = dVar3;
                        z13 = z119;
                        long j118 = component;
                        g4Var3 = medium;
                        j12 = j118;
                        borderStroke2 = borderStrokeE8;
                    } else {
                        boolean z1110 = z12;
                        dVar4 = dVar3;
                        z13 = z1110;
                        long j119 = component;
                        g4Var3 = medium;
                        j12 = j119;
                    }
                } else {
                    if (i16 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i12 & 2) != 0) {
                        medium = j1.f74525a.b(lVarV, j1.f74526b).getMedium();
                        i13 &= -113;
                    } else {
                        medium = g4Var2;
                    }
                    if (i18 != 0) {
                        z12 = false;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        component = n.n(j1.f74525a, lVarV, j1.f74526b).getComponent();
                    }
                    if ((i12 & 16) != 0) {
                        BorderStroke borderStrokeE9 = n.e(j1.f74525a, z12, lVarV, j1.f74526b | ((i13 >> 3) & 112));
                        i13 &= -57345;
                        boolean z1111 = z12;
                        dVar4 = dVar3;
                        z13 = z1111;
                        long j1110 = component;
                        g4Var3 = medium;
                        j12 = j1110;
                        borderStroke2 = borderStrokeE9;
                    } else {
                        boolean z1112 = z12;
                        dVar4 = dVar3;
                        z13 = z1112;
                        long j1111 = component;
                        g4Var3 = medium;
                        j12 = j1111;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-1810201954, i13, -1, "com.stripe.android.uicore.elements.SectionCard (SectionUI.kt:84)");
                }
                if (z13) {
                    fG = h.g((float) 1.5d);
                } else {
                    fG = h.g(0);
                }
                BorderStroke borderStroke8 = borderStroke2;
                lVar2 = lVarV;
                m.a(dVar4, g4Var3, j12, 0L, borderStroke8, fG, z2.c.b(lVarV, -72062207, true, new b(content)), lVar2, 1572864 | (i13 & 14) | (i13 & 112) | ((i13 >> 3) & 896) | (57344 & i13), 8);
                if (o.J()) {
                    o.R();
                }
                z14 = z13;
                dVar5 = dVar4;
                g4Var4 = g4Var3;
                j13 = j12;
                borderStroke3 = borderStroke8;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new c(dVar5, g4Var4, z14, j13, borderStroke3, content, i11, i12));
            }
        }
        i14 = 196608;
        i13 |= i14;
        if ((374491 & i13) == 74898) {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i16 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if ((i12 & 2) != 0) {
                    medium = j1.f74525a.b(lVarV, j1.f74526b).getMedium();
                    i13 &= -113;
                } else {
                    medium = g4Var2;
                }
                if (i18 != 0) {
                    z12 = false;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    component = n.n(j1.f74525a, lVarV, j1.f74526b).getComponent();
                }
                if ((i12 & 16) != 0) {
                    BorderStroke borderStrokeE10 = n.e(j1.f74525a, z12, lVarV, j1.f74526b | ((i13 >> 3) & 112));
                    i13 &= -57345;
                    boolean z1113 = z12;
                    dVar4 = dVar3;
                    z13 = z1113;
                    long j1112 = component;
                    g4Var3 = medium;
                    j12 = j1112;
                    borderStroke2 = borderStrokeE10;
                } else {
                    boolean z1114 = z12;
                    dVar4 = dVar3;
                    z13 = z1114;
                    long j1113 = component;
                    g4Var3 = medium;
                    j12 = j1113;
                }
            } else {
                if (i16 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if ((i12 & 2) != 0) {
                    medium = j1.f74525a.b(lVarV, j1.f74526b).getMedium();
                    i13 &= -113;
                } else {
                    medium = g4Var2;
                }
                if (i18 != 0) {
                    z12 = false;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    component = n.n(j1.f74525a, lVarV, j1.f74526b).getComponent();
                }
                if ((i12 & 16) != 0) {
                    BorderStroke borderStrokeE11 = n.e(j1.f74525a, z12, lVarV, j1.f74526b | ((i13 >> 3) & 112));
                    i13 &= -57345;
                    boolean z1115 = z12;
                    dVar4 = dVar3;
                    z13 = z1115;
                    long j1114 = component;
                    g4Var3 = medium;
                    j12 = j1114;
                    borderStroke2 = borderStrokeE11;
                } else {
                    boolean z1116 = z12;
                    dVar4 = dVar3;
                    z13 = z1116;
                    long j1115 = component;
                    g4Var3 = medium;
                    j12 = j1115;
                }
            }
            lVarV.C();
            if (o.J()) {
                o.S(-1810201954, i13, -1, "com.stripe.android.uicore.elements.SectionCard (SectionUI.kt:84)");
            }
            if (z13) {
                fG = h.g((float) 1.5d);
            } else {
                fG = h.g(0);
            }
            BorderStroke borderStroke9 = borderStroke2;
            lVar2 = lVarV;
            m.a(dVar4, g4Var3, j12, 0L, borderStroke9, fG, z2.c.b(lVarV, -72062207, true, new b(content)), lVar2, 1572864 | (i13 & 14) | (i13 & 112) | ((i13 >> 3) & 896) | (57344 & i13), 8);
            if (o.J()) {
                o.R();
            }
            z14 = z13;
            dVar5 = dVar4;
            g4Var4 = g4Var3;
            j13 = j12;
            borderStroke3 = borderStroke9;
        } else {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i16 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if ((i12 & 2) != 0) {
                    medium = j1.f74525a.b(lVarV, j1.f74526b).getMedium();
                    i13 &= -113;
                } else {
                    medium = g4Var2;
                }
                if (i18 != 0) {
                    z12 = false;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    component = n.n(j1.f74525a, lVarV, j1.f74526b).getComponent();
                }
                if ((i12 & 16) != 0) {
                    BorderStroke borderStrokeE12 = n.e(j1.f74525a, z12, lVarV, j1.f74526b | ((i13 >> 3) & 112));
                    i13 &= -57345;
                    boolean z1117 = z12;
                    dVar4 = dVar3;
                    z13 = z1117;
                    long j1116 = component;
                    g4Var3 = medium;
                    j12 = j1116;
                    borderStroke2 = borderStrokeE12;
                } else {
                    boolean z1118 = z12;
                    dVar4 = dVar3;
                    z13 = z1118;
                    long j1117 = component;
                    g4Var3 = medium;
                    j12 = j1117;
                }
            } else {
                if (i16 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if ((i12 & 2) != 0) {
                    medium = j1.f74525a.b(lVarV, j1.f74526b).getMedium();
                    i13 &= -113;
                } else {
                    medium = g4Var2;
                }
                if (i18 != 0) {
                    z12 = false;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    component = n.n(j1.f74525a, lVarV, j1.f74526b).getComponent();
                }
                if ((i12 & 16) != 0) {
                    BorderStroke borderStrokeE13 = n.e(j1.f74525a, z12, lVarV, j1.f74526b | ((i13 >> 3) & 112));
                    i13 &= -57345;
                    boolean z1119 = z12;
                    dVar4 = dVar3;
                    z13 = z1119;
                    long j1118 = component;
                    g4Var3 = medium;
                    j12 = j1118;
                    borderStroke2 = borderStrokeE13;
                } else {
                    boolean z11110 = z12;
                    dVar4 = dVar3;
                    z13 = z11110;
                    long j1119 = component;
                    g4Var3 = medium;
                    j12 = j1119;
                }
            }
            lVarV.C();
            if (o.J()) {
                o.S(-1810201954, i13, -1, "com.stripe.android.uicore.elements.SectionCard (SectionUI.kt:84)");
            }
            if (z13) {
                fG = h.g((float) 1.5d);
            } else {
                fG = h.g(0);
            }
            BorderStroke borderStroke10 = borderStroke2;
            lVar2 = lVarV;
            m.a(dVar4, g4Var3, j12, 0L, borderStroke10, fG, z2.c.b(lVarV, -72062207, true, new b(content)), lVar2, 1572864 | (i13 & 14) | (i13 & 112) | ((i13 >> 3) & 896) | (57344 & i13), 8);
            if (o.J()) {
                o.R();
            }
            z14 = z13;
            dVar5 = dVar4;
            g4Var4 = g4Var3;
            j13 = j12;
            borderStroke3 = borderStroke10;
        }
        w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new c(dVar5, g4Var4, z14, j13, borderStroke3, content, i11, i12));
        }
    }

    public static final void c(String error, l lVar, int i11) {
        int i12;
        l lVar2;
        s.k(error, "error");
        l lVarV = lVar.v(-985456758);
        if ((i11 & 14) == 0) {
            i12 = i11 | (lVarV.n(error) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && lVarV.b()) {
            lVarV.j();
            lVar2 = lVarV;
        } else {
            if (o.J()) {
                o.S(-985456758, i12, -1, "com.stripe.android.uicore.elements.SectionError (SectionUI.kt:104)");
            }
            j1 j1Var = j1.f74525a;
            int i13 = j1.f74526b;
            lVar2 = lVarV;
            v2.b(error, g4.o.c(androidx.compose.ui.d.INSTANCE, true, d.f76811c), j1Var.a(lVarV, i13).d(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, j1Var.c(lVarV, i13).getH6(), lVar2, i12 & 14, 0, 65528);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new e(error, i11));
        }
    }

    public static final void d(Integer num, l lVar, int i11) {
        int i12;
        l lVarV = lVar.v(1654170730);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.n(num) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(1654170730, i12, -1, "com.stripe.android.uicore.elements.SectionTitle (SectionUI.kt:59)");
            }
            if (num != null) {
                f0.a(i.c(num.intValue(), lVarV, i12 & 14), g4.o.c(t.m(androidx.compose.ui.d.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, h.g(4), 7, null), true, f.f76814c), lVarV, 0, 0);
            }
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new g(num, i11));
        }
    }
}
