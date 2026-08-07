package j80;

import androidx.compose.foundation.layout.x;
import androidx.compose.ui.platform.s2;
import jn0.h0;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p008h80.y;
import p013kotlin.Metadata;
import p020r2.k2;
import p020r2.w2;
import v1.g0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001ak\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00132\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"", "isEnabled", "isSelected", "Lj80/e;", "displayablePaymentMethod", "Lo90/f;", "imageLoader", "Landroidx/compose/ui/d;", "modifier", "Ljn0/h0;", "b", "(ZZLj80/e;Lo90/f;Landroidx/compose/ui/d;Lr2/l;II)V", "", "iconRes", "", "iconUrl", "title", "subtitle", "iconRequiresTinting", "Lkotlin/Function0;", "onClick", "a", "(ZZILjava/lang/String;Lo90/f;Ljava/lang/String;Ljava/lang/String;ZLwn0/a;Landroidx/compose/ui/d;Lr2/l;II)V", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class k {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ DisplayablePaymentMethod f82976c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(DisplayablePaymentMethod displayablePaymentMethod) {
            super(0);
            this.f82976c = displayablePaymentMethod;
        }

        public final void b() {
            this.f82976c.g().invoke();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f82977c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f82978d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ DisplayablePaymentMethod f82979e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ o90.f f82980f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f82981g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f82982h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f82983i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z11, boolean z12, DisplayablePaymentMethod displayablePaymentMethod, o90.f fVar, androidx.compose.ui.d dVar, int i11, int i12) {
            super(2);
            this.f82977c = z11;
            this.f82978d = z12;
            this.f82979e = displayablePaymentMethod;
            this.f82980f = fVar;
            this.f82981g = dVar;
            this.f82982h = i11;
            this.f82983i = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            k.b(this.f82977c, this.f82978d, this.f82979e, this.f82980f, this.f82981g, lVar, k2.a(this.f82982h | 1), this.f82983i);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/g0;", "Ljn0/h0;", "a", "(Lv1/g0;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.q<g0, p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f82984c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f82985d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ o90.f f82986e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f82987f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f82988g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11, String str, o90.f fVar, boolean z11, androidx.compose.ui.d dVar) {
            super(3);
            this.f82984c = i11;
            this.f82985d = str;
            this.f82986e = fVar;
            this.f82987f = z11;
            this.f82988g = dVar;
        }

        public final void a(g0 PaymentMethodRowButton, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(PaymentMethodRowButton, "$this$PaymentMethodRowButton");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-213494546, i11, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton.<anonymous> (NewPaymentMethodRowButton.kt:65)");
            }
            int i12 = this.f82984c;
            String str = this.f82985d;
            o90.f fVar = this.f82986e;
            boolean z11 = this.f82987f;
            androidx.compose.ui.d dVar = this.f82988g;
            r rVar = r.f83096a;
            y.a(i12, str, fVar, z11, x.v(x.i(dVar, rVar.a()), rVar.b()), d3.c.INSTANCE.e(), lVar, (o90.f.f96995g << 6) | 196608, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(g0 g0Var, p020r2.l lVar, Integer num) {
            a(g0Var, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f82989c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f82990d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f82991e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f82992f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ o90.f f82993g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f82994h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f82995i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f82996j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f82997k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f82998l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f82999m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f83000n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z11, boolean z12, int i11, String str, o90.f fVar, String str2, String str3, boolean z13, wn0.a<h0> aVar, androidx.compose.ui.d dVar, int i12, int i13) {
            super(2);
            this.f82989c = z11;
            this.f82990d = z12;
            this.f82991e = i11;
            this.f82992f = str;
            this.f82993g = fVar;
            this.f82994h = str2;
            this.f82995i = str3;
            this.f82996j = z13;
            this.f82997k = aVar;
            this.f82998l = dVar;
            this.f82999m = i12;
            this.f83000n = i13;
        }

        public final void a(p020r2.l lVar, int i11) {
            k.a(this.f82989c, this.f82990d, this.f82991e, this.f82992f, this.f82993g, this.f82994h, this.f82995i, this.f82996j, this.f82997k, this.f82998l, lVar, k2.a(this.f82999m | 1), this.f83000n);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0130  */
    /* JADX WARN: Code duplicated, block: B:105:0x013a  */
    /* JADX WARN: Code duplicated, block: B:106:0x013d  */
    /* JADX WARN: Code duplicated, block: B:110:0x014b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0157 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x0159  */
    /* JADX WARN: Code duplicated, block: B:118:0x0162  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:124:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0077  */
    /* JADX WARN: Code duplicated, block: B:38:0x007c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:42:0x0088  */
    /* JADX WARN: Code duplicated, block: B:43:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:50:0x009c  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00da  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:89:0x0109  */
    /* JADX WARN: Code duplicated, block: B:91:0x010d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0111  */
    /* JADX WARN: Code duplicated, block: B:95:0x0117  */
    /* JADX WARN: Code duplicated, block: B:96:0x011a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0121  */
    public static final void a(boolean z11, boolean z12, int i11, String str, o90.f imageLoader, String title, String str2, boolean z13, wn0.a<h0> onClick, androidx.compose.ui.d dVar, p020r2.l lVar, int i12, int i13) {
        int i14;
        boolean z14;
        String str3;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z15;
        int i19;
        int i21;
        int i22;
        androidx.compose.ui.d dVar2;
        int i23;
        androidx.compose.ui.d dVar3;
        w2 w2VarX;
        p013kotlin.jvm.internal.s.k(imageLoader, "imageLoader");
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(onClick, "onClick");
        p020r2.l lVarV = lVar.v(-2072739375);
        if ((i13 & 1) != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            i14 = (lVarV.p(z11) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
            z14 = z12;
        } else {
            z14 = z12;
            if ((i12 & 112) == 0) {
                i14 |= lVarV.p(z14) ? 32 : 16;
            }
        }
        if ((i13 & 4) == 0) {
            if ((i12 & 896) == 0) {
                i14 |= lVarV.r(i11) ? 256 : 128;
            }
            if ((i13 & 8) != 0) {
                if ((i12 & 7168) == 0) {
                    str3 = str;
                    if (lVarV.n(str3)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i14 |= i15;
                }
                if ((i13 & 16) != 0) {
                    i14 |= 24576;
                } else if ((i12 & 57344) == 0) {
                    if (lVarV.n(imageLoader)) {
                        i16 = 16384;
                    } else {
                        i16 = PKIFailureInfo.certRevoked;
                    }
                    i14 |= i16;
                }
                if ((i13 & 32) != 0) {
                    if ((i12 & 458752) == 0) {
                        if (lVarV.n(title)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                    }
                    if ((i13 & 64) != 0) {
                        if ((i12 & 3670016) == 0) {
                            if (lVarV.n(str2)) {
                                i18 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i18 = PKIFailureInfo.signerNotTrusted;
                            }
                            i14 |= i18;
                        }
                        if ((i13 & 128) != 0) {
                            if ((29360128 & i12) == 0) {
                                z15 = z13;
                                if (lVarV.p(z15)) {
                                    i19 = 8388608;
                                } else {
                                    i19 = 4194304;
                                }
                                i14 |= i19;
                            }
                            if ((i13 & 256) != 0) {
                                if ((i12 & 234881024) == 0) {
                                    if (lVarV.K(onClick)) {
                                        i21 = 67108864;
                                    } else {
                                        i21 = 33554432;
                                    }
                                }
                                i22 = i13 & 512;
                                if (i22 != 0) {
                                    if ((i12 & 1879048192) == 0) {
                                        dVar2 = dVar;
                                        if (lVarV.n(dVar2)) {
                                            i23 = PKIFailureInfo.duplicateCertReq;
                                        } else {
                                            i23 = 268435456;
                                        }
                                        i14 |= i23;
                                    }
                                    if ((i14 & 1533916891) == 306783378 || !lVarV.b()) {
                                        if (i22 != 0) {
                                            dVar2 = androidx.compose.ui.d.INSTANCE;
                                        }
                                        if (p020r2.o.J()) {
                                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                        }
                                        String str4 = str3;
                                        boolean z16 = z15;
                                        androidx.compose.ui.d dVar4 = dVar2;
                                        int i24 = i14;
                                        int i25 = i24 >> 3;
                                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str4, imageLoader, z16, dVar4)), title, str2, onClick, null, dVar4, null, lVarV, (i24 & 14) | 3072 | (i24 & 112) | (i25 & 57344) | (i25 & 458752) | ((i24 >> 6) & 3670016) | (i25 & 234881024), 644);
                                        dVar3 = dVar4;
                                        if (p020r2.o.J()) {
                                            p020r2.o.R();
                                        }
                                    } else {
                                        lVarV.j();
                                        dVar3 = dVar2;
                                    }
                                    w2VarX = lVarV.x();
                                    if (w2VarX != null) {
                                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                                    }
                                }
                                i14 |= 805306368;
                                dVar2 = dVar;
                                if ((i14 & 1533916891) == 306783378) {
                                    if (i22 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (p020r2.o.J()) {
                                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                    }
                                    String str5 = str3;
                                    boolean z17 = z15;
                                    androidx.compose.ui.d dVar5 = dVar2;
                                    int i26 = i14;
                                    int i27 = i26 >> 3;
                                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str5, imageLoader, z17, dVar5)), title, str2, onClick, null, dVar5, null, lVarV, (i26 & 14) | 3072 | (i26 & 112) | (i27 & 57344) | (i27 & 458752) | ((i26 >> 6) & 3670016) | (i27 & 234881024), 644);
                                    dVar3 = dVar5;
                                    if (p020r2.o.J()) {
                                        p020r2.o.R();
                                    }
                                } else {
                                    if (i22 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (p020r2.o.J()) {
                                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                    }
                                    String str6 = str3;
                                    boolean z18 = z15;
                                    androidx.compose.ui.d dVar6 = dVar2;
                                    int i28 = i14;
                                    int i29 = i28 >> 3;
                                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str6, imageLoader, z18, dVar6)), title, str2, onClick, null, dVar6, null, lVarV, (i28 & 14) | 3072 | (i28 & 112) | (i29 & 57344) | (i29 & 458752) | ((i28 >> 6) & 3670016) | (i29 & 234881024), 644);
                                    dVar3 = dVar6;
                                    if (p020r2.o.J()) {
                                        p020r2.o.R();
                                    }
                                }
                                w2VarX = lVarV.x();
                                if (w2VarX != null) {
                                    w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                                }
                            }
                            i21 = 100663296;
                            i14 |= i21;
                            i22 = i13 & 512;
                            if (i22 != 0) {
                                if ((i12 & 1879048192) == 0) {
                                    dVar2 = dVar;
                                    if (lVarV.n(dVar2)) {
                                        i23 = PKIFailureInfo.duplicateCertReq;
                                    } else {
                                        i23 = 268435456;
                                    }
                                    i14 |= i23;
                                }
                                if ((i14 & 1533916891) == 306783378) {
                                    if (i22 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (p020r2.o.J()) {
                                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                    }
                                    String str7 = str3;
                                    boolean z19 = z15;
                                    androidx.compose.ui.d dVar7 = dVar2;
                                    int i210 = i14;
                                    int i211 = i210 >> 3;
                                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str7, imageLoader, z19, dVar7)), title, str2, onClick, null, dVar7, null, lVarV, (i210 & 14) | 3072 | (i210 & 112) | (i211 & 57344) | (i211 & 458752) | ((i210 >> 6) & 3670016) | (i211 & 234881024), 644);
                                    dVar3 = dVar7;
                                    if (p020r2.o.J()) {
                                        p020r2.o.R();
                                    }
                                } else {
                                    if (i22 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (p020r2.o.J()) {
                                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                    }
                                    String str8 = str3;
                                    boolean z110 = z15;
                                    androidx.compose.ui.d dVar8 = dVar2;
                                    int i212 = i14;
                                    int i213 = i212 >> 3;
                                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str8, imageLoader, z110, dVar8)), title, str2, onClick, null, dVar8, null, lVarV, (i212 & 14) | 3072 | (i212 & 112) | (i213 & 57344) | (i213 & 458752) | ((i212 >> 6) & 3670016) | (i213 & 234881024), 644);
                                    dVar3 = dVar8;
                                    if (p020r2.o.J()) {
                                        p020r2.o.R();
                                    }
                                }
                                w2VarX = lVarV.x();
                                if (w2VarX != null) {
                                    w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                                }
                            }
                            i14 |= 805306368;
                            dVar2 = dVar;
                            if ((i14 & 1533916891) == 306783378) {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str9 = str3;
                                boolean z111 = z15;
                                androidx.compose.ui.d dVar9 = dVar2;
                                int i214 = i14;
                                int i215 = i214 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str9, imageLoader, z111, dVar9)), title, str2, onClick, null, dVar9, null, lVarV, (i214 & 14) | 3072 | (i214 & 112) | (i215 & 57344) | (i215 & 458752) | ((i214 >> 6) & 3670016) | (i215 & 234881024), 644);
                                dVar3 = dVar9;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            } else {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str10 = str3;
                                boolean z112 = z15;
                                androidx.compose.ui.d dVar10 = dVar2;
                                int i216 = i14;
                                int i217 = i216 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str10, imageLoader, z112, dVar10)), title, str2, onClick, null, dVar10, null, lVarV, (i216 & 14) | 3072 | (i216 & 112) | (i217 & 57344) | (i217 & 458752) | ((i216 >> 6) & 3670016) | (i217 & 234881024), 644);
                                dVar3 = dVar10;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            }
                            w2VarX = lVarV.x();
                            if (w2VarX != null) {
                                w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                            }
                        }
                        i14 |= 12582912;
                        z15 = z13;
                        if ((i13 & 256) != 0) {
                            if ((i12 & 234881024) == 0) {
                                if (lVarV.K(onClick)) {
                                    i21 = 67108864;
                                } else {
                                    i21 = 33554432;
                                }
                            }
                            i22 = i13 & 512;
                            if (i22 != 0) {
                                if ((i12 & 1879048192) == 0) {
                                    dVar2 = dVar;
                                    if (lVarV.n(dVar2)) {
                                        i23 = PKIFailureInfo.duplicateCertReq;
                                    } else {
                                        i23 = 268435456;
                                    }
                                    i14 |= i23;
                                }
                                if ((i14 & 1533916891) == 306783378) {
                                    if (i22 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (p020r2.o.J()) {
                                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                    }
                                    String str11 = str3;
                                    boolean z113 = z15;
                                    androidx.compose.ui.d dVar11 = dVar2;
                                    int i218 = i14;
                                    int i219 = i218 >> 3;
                                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11, imageLoader, z113, dVar11)), title, str2, onClick, null, dVar11, null, lVarV, (i218 & 14) | 3072 | (i218 & 112) | (i219 & 57344) | (i219 & 458752) | ((i218 >> 6) & 3670016) | (i219 & 234881024), 644);
                                    dVar3 = dVar11;
                                    if (p020r2.o.J()) {
                                        p020r2.o.R();
                                    }
                                } else {
                                    if (i22 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (p020r2.o.J()) {
                                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                    }
                                    String str12 = str3;
                                    boolean z114 = z15;
                                    androidx.compose.ui.d dVar12 = dVar2;
                                    int i2110 = i14;
                                    int i2111 = i2110 >> 3;
                                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str12, imageLoader, z114, dVar12)), title, str2, onClick, null, dVar12, null, lVarV, (i2110 & 14) | 3072 | (i2110 & 112) | (i2111 & 57344) | (i2111 & 458752) | ((i2110 >> 6) & 3670016) | (i2111 & 234881024), 644);
                                    dVar3 = dVar12;
                                    if (p020r2.o.J()) {
                                        p020r2.o.R();
                                    }
                                }
                                w2VarX = lVarV.x();
                                if (w2VarX != null) {
                                    w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                                }
                            }
                            i14 |= 805306368;
                            dVar2 = dVar;
                            if ((i14 & 1533916891) == 306783378) {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str13 = str3;
                                boolean z115 = z15;
                                androidx.compose.ui.d dVar13 = dVar2;
                                int i2112 = i14;
                                int i2113 = i2112 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str13, imageLoader, z115, dVar13)), title, str2, onClick, null, dVar13, null, lVarV, (i2112 & 14) | 3072 | (i2112 & 112) | (i2113 & 57344) | (i2113 & 458752) | ((i2112 >> 6) & 3670016) | (i2113 & 234881024), 644);
                                dVar3 = dVar13;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            } else {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str14 = str3;
                                boolean z116 = z15;
                                androidx.compose.ui.d dVar14 = dVar2;
                                int i2114 = i14;
                                int i2115 = i2114 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str14, imageLoader, z116, dVar14)), title, str2, onClick, null, dVar14, null, lVarV, (i2114 & 14) | 3072 | (i2114 & 112) | (i2115 & 57344) | (i2115 & 458752) | ((i2114 >> 6) & 3670016) | (i2115 & 234881024), 644);
                                dVar3 = dVar14;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            }
                            w2VarX = lVarV.x();
                            if (w2VarX != null) {
                                w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                            }
                        }
                        i21 = 100663296;
                        i14 |= i21;
                        i22 = i13 & 512;
                        if (i22 != 0) {
                            if ((i12 & 1879048192) == 0) {
                                dVar2 = dVar;
                                if (lVarV.n(dVar2)) {
                                    i23 = PKIFailureInfo.duplicateCertReq;
                                } else {
                                    i23 = 268435456;
                                }
                                i14 |= i23;
                            }
                            if ((i14 & 1533916891) == 306783378) {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str15 = str3;
                                boolean z117 = z15;
                                androidx.compose.ui.d dVar15 = dVar2;
                                int i2116 = i14;
                                int i2117 = i2116 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str15, imageLoader, z117, dVar15)), title, str2, onClick, null, dVar15, null, lVarV, (i2116 & 14) | 3072 | (i2116 & 112) | (i2117 & 57344) | (i2117 & 458752) | ((i2116 >> 6) & 3670016) | (i2117 & 234881024), 644);
                                dVar3 = dVar15;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            } else {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str16 = str3;
                                boolean z118 = z15;
                                androidx.compose.ui.d dVar16 = dVar2;
                                int i2118 = i14;
                                int i2119 = i2118 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str16, imageLoader, z118, dVar16)), title, str2, onClick, null, dVar16, null, lVarV, (i2118 & 14) | 3072 | (i2118 & 112) | (i2119 & 57344) | (i2119 & 458752) | ((i2118 >> 6) & 3670016) | (i2119 & 234881024), 644);
                                dVar3 = dVar16;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            }
                            w2VarX = lVarV.x();
                            if (w2VarX != null) {
                                w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                            }
                        }
                        i14 |= 805306368;
                        dVar2 = dVar;
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str17 = str3;
                            boolean z119 = z15;
                            androidx.compose.ui.d dVar17 = dVar2;
                            int i21110 = i14;
                            int i21111 = i21110 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str17, imageLoader, z119, dVar17)), title, str2, onClick, null, dVar17, null, lVarV, (i21110 & 14) | 3072 | (i21110 & 112) | (i21111 & 57344) | (i21111 & 458752) | ((i21110 >> 6) & 3670016) | (i21111 & 234881024), 644);
                            dVar3 = dVar17;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str18 = str3;
                            boolean z1110 = z15;
                            androidx.compose.ui.d dVar18 = dVar2;
                            int i21112 = i14;
                            int i21113 = i21112 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str18, imageLoader, z1110, dVar18)), title, str2, onClick, null, dVar18, null, lVarV, (i21112 & 14) | 3072 | (i21112 & 112) | (i21113 & 57344) | (i21113 & 458752) | ((i21112 >> 6) & 3670016) | (i21113 & 234881024), 644);
                            dVar3 = dVar18;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i14 |= 1572864;
                    if ((i13 & 128) != 0) {
                        if ((29360128 & i12) == 0) {
                            z15 = z13;
                            if (lVarV.p(z15)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                            i14 |= i19;
                        }
                        if ((i13 & 256) != 0) {
                            if ((i12 & 234881024) == 0) {
                                if (lVarV.K(onClick)) {
                                    i21 = 67108864;
                                } else {
                                    i21 = 33554432;
                                }
                            }
                            i22 = i13 & 512;
                            if (i22 != 0) {
                                if ((i12 & 1879048192) == 0) {
                                    dVar2 = dVar;
                                    if (lVarV.n(dVar2)) {
                                        i23 = PKIFailureInfo.duplicateCertReq;
                                    } else {
                                        i23 = 268435456;
                                    }
                                    i14 |= i23;
                                }
                                if ((i14 & 1533916891) == 306783378) {
                                    if (i22 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (p020r2.o.J()) {
                                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                    }
                                    String str19 = str3;
                                    boolean z1111 = z15;
                                    androidx.compose.ui.d dVar19 = dVar2;
                                    int i21114 = i14;
                                    int i21115 = i21114 >> 3;
                                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str19, imageLoader, z1111, dVar19)), title, str2, onClick, null, dVar19, null, lVarV, (i21114 & 14) | 3072 | (i21114 & 112) | (i21115 & 57344) | (i21115 & 458752) | ((i21114 >> 6) & 3670016) | (i21115 & 234881024), 644);
                                    dVar3 = dVar19;
                                    if (p020r2.o.J()) {
                                        p020r2.o.R();
                                    }
                                } else {
                                    if (i22 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (p020r2.o.J()) {
                                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                    }
                                    String str110 = str3;
                                    boolean z1112 = z15;
                                    androidx.compose.ui.d dVar110 = dVar2;
                                    int i21116 = i14;
                                    int i21117 = i21116 >> 3;
                                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str110, imageLoader, z1112, dVar110)), title, str2, onClick, null, dVar110, null, lVarV, (i21116 & 14) | 3072 | (i21116 & 112) | (i21117 & 57344) | (i21117 & 458752) | ((i21116 >> 6) & 3670016) | (i21117 & 234881024), 644);
                                    dVar3 = dVar110;
                                    if (p020r2.o.J()) {
                                        p020r2.o.R();
                                    }
                                }
                                w2VarX = lVarV.x();
                                if (w2VarX != null) {
                                    w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                                }
                            }
                            i14 |= 805306368;
                            dVar2 = dVar;
                            if ((i14 & 1533916891) == 306783378) {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str111 = str3;
                                boolean z1113 = z15;
                                androidx.compose.ui.d dVar111 = dVar2;
                                int i21118 = i14;
                                int i21119 = i21118 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111, imageLoader, z1113, dVar111)), title, str2, onClick, null, dVar111, null, lVarV, (i21118 & 14) | 3072 | (i21118 & 112) | (i21119 & 57344) | (i21119 & 458752) | ((i21118 >> 6) & 3670016) | (i21119 & 234881024), 644);
                                dVar3 = dVar111;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            } else {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str112 = str3;
                                boolean z1114 = z15;
                                androidx.compose.ui.d dVar112 = dVar2;
                                int i211110 = i14;
                                int i211111 = i211110 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str112, imageLoader, z1114, dVar112)), title, str2, onClick, null, dVar112, null, lVarV, (i211110 & 14) | 3072 | (i211110 & 112) | (i211111 & 57344) | (i211111 & 458752) | ((i211110 >> 6) & 3670016) | (i211111 & 234881024), 644);
                                dVar3 = dVar112;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            }
                            w2VarX = lVarV.x();
                            if (w2VarX != null) {
                                w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                            }
                        }
                        i21 = 100663296;
                        i14 |= i21;
                        i22 = i13 & 512;
                        if (i22 != 0) {
                            if ((i12 & 1879048192) == 0) {
                                dVar2 = dVar;
                                if (lVarV.n(dVar2)) {
                                    i23 = PKIFailureInfo.duplicateCertReq;
                                } else {
                                    i23 = 268435456;
                                }
                                i14 |= i23;
                            }
                            if ((i14 & 1533916891) == 306783378) {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str113 = str3;
                                boolean z1115 = z15;
                                androidx.compose.ui.d dVar113 = dVar2;
                                int i211112 = i14;
                                int i211113 = i211112 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str113, imageLoader, z1115, dVar113)), title, str2, onClick, null, dVar113, null, lVarV, (i211112 & 14) | 3072 | (i211112 & 112) | (i211113 & 57344) | (i211113 & 458752) | ((i211112 >> 6) & 3670016) | (i211113 & 234881024), 644);
                                dVar3 = dVar113;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            } else {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str114 = str3;
                                boolean z1116 = z15;
                                androidx.compose.ui.d dVar114 = dVar2;
                                int i211114 = i14;
                                int i211115 = i211114 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str114, imageLoader, z1116, dVar114)), title, str2, onClick, null, dVar114, null, lVarV, (i211114 & 14) | 3072 | (i211114 & 112) | (i211115 & 57344) | (i211115 & 458752) | ((i211114 >> 6) & 3670016) | (i211115 & 234881024), 644);
                                dVar3 = dVar114;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            }
                            w2VarX = lVarV.x();
                            if (w2VarX != null) {
                                w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                            }
                        }
                        i14 |= 805306368;
                        dVar2 = dVar;
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str115 = str3;
                            boolean z1117 = z15;
                            androidx.compose.ui.d dVar115 = dVar2;
                            int i211116 = i14;
                            int i211117 = i211116 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str115, imageLoader, z1117, dVar115)), title, str2, onClick, null, dVar115, null, lVarV, (i211116 & 14) | 3072 | (i211116 & 112) | (i211117 & 57344) | (i211117 & 458752) | ((i211116 >> 6) & 3670016) | (i211117 & 234881024), 644);
                            dVar3 = dVar115;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str116 = str3;
                            boolean z1118 = z15;
                            androidx.compose.ui.d dVar116 = dVar2;
                            int i211118 = i14;
                            int i211119 = i211118 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str116, imageLoader, z1118, dVar116)), title, str2, onClick, null, dVar116, null, lVarV, (i211118 & 14) | 3072 | (i211118 & 112) | (i211119 & 57344) | (i211119 & 458752) | ((i211118 >> 6) & 3670016) | (i211119 & 234881024), 644);
                            dVar3 = dVar116;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i14 |= 12582912;
                    z15 = z13;
                    if ((i13 & 256) != 0) {
                        if ((i12 & 234881024) == 0) {
                            if (lVarV.K(onClick)) {
                                i21 = 67108864;
                            } else {
                                i21 = 33554432;
                            }
                        }
                        i22 = i13 & 512;
                        if (i22 != 0) {
                            if ((i12 & 1879048192) == 0) {
                                dVar2 = dVar;
                                if (lVarV.n(dVar2)) {
                                    i23 = PKIFailureInfo.duplicateCertReq;
                                } else {
                                    i23 = 268435456;
                                }
                                i14 |= i23;
                            }
                            if ((i14 & 1533916891) == 306783378) {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str117 = str3;
                                boolean z1119 = z15;
                                androidx.compose.ui.d dVar117 = dVar2;
                                int i2111110 = i14;
                                int i2111111 = i2111110 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str117, imageLoader, z1119, dVar117)), title, str2, onClick, null, dVar117, null, lVarV, (i2111110 & 14) | 3072 | (i2111110 & 112) | (i2111111 & 57344) | (i2111111 & 458752) | ((i2111110 >> 6) & 3670016) | (i2111111 & 234881024), 644);
                                dVar3 = dVar117;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            } else {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str118 = str3;
                                boolean z11110 = z15;
                                androidx.compose.ui.d dVar118 = dVar2;
                                int i2111112 = i14;
                                int i2111113 = i2111112 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str118, imageLoader, z11110, dVar118)), title, str2, onClick, null, dVar118, null, lVarV, (i2111112 & 14) | 3072 | (i2111112 & 112) | (i2111113 & 57344) | (i2111113 & 458752) | ((i2111112 >> 6) & 3670016) | (i2111113 & 234881024), 644);
                                dVar3 = dVar118;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            }
                            w2VarX = lVarV.x();
                            if (w2VarX != null) {
                                w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                            }
                        }
                        i14 |= 805306368;
                        dVar2 = dVar;
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str119 = str3;
                            boolean z11111 = z15;
                            androidx.compose.ui.d dVar119 = dVar2;
                            int i2111114 = i14;
                            int i2111115 = i2111114 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str119, imageLoader, z11111, dVar119)), title, str2, onClick, null, dVar119, null, lVarV, (i2111114 & 14) | 3072 | (i2111114 & 112) | (i2111115 & 57344) | (i2111115 & 458752) | ((i2111114 >> 6) & 3670016) | (i2111115 & 234881024), 644);
                            dVar3 = dVar119;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str1110 = str3;
                            boolean z11112 = z15;
                            androidx.compose.ui.d dVar1110 = dVar2;
                            int i2111116 = i14;
                            int i2111117 = i2111116 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1110, imageLoader, z11112, dVar1110)), title, str2, onClick, null, dVar1110, null, lVarV, (i2111116 & 14) | 3072 | (i2111116 & 112) | (i2111117 & 57344) | (i2111117 & 458752) | ((i2111116 >> 6) & 3670016) | (i2111117 & 234881024), 644);
                            dVar3 = dVar1110;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i21 = 100663296;
                    i14 |= i21;
                    i22 = i13 & 512;
                    if (i22 != 0) {
                        if ((i12 & 1879048192) == 0) {
                            dVar2 = dVar;
                            if (lVarV.n(dVar2)) {
                                i23 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i23 = 268435456;
                            }
                            i14 |= i23;
                        }
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str1111 = str3;
                            boolean z11113 = z15;
                            androidx.compose.ui.d dVar1111 = dVar2;
                            int i2111118 = i14;
                            int i2111119 = i2111118 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111, imageLoader, z11113, dVar1111)), title, str2, onClick, null, dVar1111, null, lVarV, (i2111118 & 14) | 3072 | (i2111118 & 112) | (i2111119 & 57344) | (i2111119 & 458752) | ((i2111118 >> 6) & 3670016) | (i2111119 & 234881024), 644);
                            dVar3 = dVar1111;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str1112 = str3;
                            boolean z11114 = z15;
                            androidx.compose.ui.d dVar1112 = dVar2;
                            int i21111110 = i14;
                            int i21111111 = i21111110 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1112, imageLoader, z11114, dVar1112)), title, str2, onClick, null, dVar1112, null, lVarV, (i21111110 & 14) | 3072 | (i21111110 & 112) | (i21111111 & 57344) | (i21111111 & 458752) | ((i21111110 >> 6) & 3670016) | (i21111111 & 234881024), 644);
                            dVar3 = dVar1112;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i14 |= 805306368;
                    dVar2 = dVar;
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str1113 = str3;
                        boolean z11115 = z15;
                        androidx.compose.ui.d dVar1113 = dVar2;
                        int i21111112 = i14;
                        int i21111113 = i21111112 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1113, imageLoader, z11115, dVar1113)), title, str2, onClick, null, dVar1113, null, lVarV, (i21111112 & 14) | 3072 | (i21111112 & 112) | (i21111113 & 57344) | (i21111113 & 458752) | ((i21111112 >> 6) & 3670016) | (i21111113 & 234881024), 644);
                        dVar3 = dVar1113;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str1114 = str3;
                        boolean z11116 = z15;
                        androidx.compose.ui.d dVar1114 = dVar2;
                        int i21111114 = i14;
                        int i21111115 = i21111114 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1114, imageLoader, z11116, dVar1114)), title, str2, onClick, null, dVar1114, null, lVarV, (i21111114 & 14) | 3072 | (i21111114 & 112) | (i21111115 & 57344) | (i21111115 & 458752) | ((i21111114 >> 6) & 3670016) | (i21111115 & 234881024), 644);
                        dVar3 = dVar1114;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i17 = 196608;
                i14 |= i17;
                if ((i13 & 64) != 0) {
                    if ((i12 & 3670016) == 0) {
                        if (lVarV.n(str2)) {
                            i18 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i18 = PKIFailureInfo.signerNotTrusted;
                        }
                        i14 |= i18;
                    }
                    if ((i13 & 128) != 0) {
                        if ((29360128 & i12) == 0) {
                            z15 = z13;
                            if (lVarV.p(z15)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                            i14 |= i19;
                        }
                        if ((i13 & 256) != 0) {
                            if ((i12 & 234881024) == 0) {
                                if (lVarV.K(onClick)) {
                                    i21 = 67108864;
                                } else {
                                    i21 = 33554432;
                                }
                            }
                            i22 = i13 & 512;
                            if (i22 != 0) {
                                if ((i12 & 1879048192) == 0) {
                                    dVar2 = dVar;
                                    if (lVarV.n(dVar2)) {
                                        i23 = PKIFailureInfo.duplicateCertReq;
                                    } else {
                                        i23 = 268435456;
                                    }
                                    i14 |= i23;
                                }
                                if ((i14 & 1533916891) == 306783378) {
                                    if (i22 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (p020r2.o.J()) {
                                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                    }
                                    String str1115 = str3;
                                    boolean z11117 = z15;
                                    androidx.compose.ui.d dVar1115 = dVar2;
                                    int i21111116 = i14;
                                    int i21111117 = i21111116 >> 3;
                                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1115, imageLoader, z11117, dVar1115)), title, str2, onClick, null, dVar1115, null, lVarV, (i21111116 & 14) | 3072 | (i21111116 & 112) | (i21111117 & 57344) | (i21111117 & 458752) | ((i21111116 >> 6) & 3670016) | (i21111117 & 234881024), 644);
                                    dVar3 = dVar1115;
                                    if (p020r2.o.J()) {
                                        p020r2.o.R();
                                    }
                                } else {
                                    if (i22 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (p020r2.o.J()) {
                                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                    }
                                    String str1116 = str3;
                                    boolean z11118 = z15;
                                    androidx.compose.ui.d dVar1116 = dVar2;
                                    int i21111118 = i14;
                                    int i21111119 = i21111118 >> 3;
                                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1116, imageLoader, z11118, dVar1116)), title, str2, onClick, null, dVar1116, null, lVarV, (i21111118 & 14) | 3072 | (i21111118 & 112) | (i21111119 & 57344) | (i21111119 & 458752) | ((i21111118 >> 6) & 3670016) | (i21111119 & 234881024), 644);
                                    dVar3 = dVar1116;
                                    if (p020r2.o.J()) {
                                        p020r2.o.R();
                                    }
                                }
                                w2VarX = lVarV.x();
                                if (w2VarX != null) {
                                    w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                                }
                            }
                            i14 |= 805306368;
                            dVar2 = dVar;
                            if ((i14 & 1533916891) == 306783378) {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str1117 = str3;
                                boolean z11119 = z15;
                                androidx.compose.ui.d dVar1117 = dVar2;
                                int i211111110 = i14;
                                int i211111111 = i211111110 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1117, imageLoader, z11119, dVar1117)), title, str2, onClick, null, dVar1117, null, lVarV, (i211111110 & 14) | 3072 | (i211111110 & 112) | (i211111111 & 57344) | (i211111111 & 458752) | ((i211111110 >> 6) & 3670016) | (i211111111 & 234881024), 644);
                                dVar3 = dVar1117;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            } else {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str1118 = str3;
                                boolean z111110 = z15;
                                androidx.compose.ui.d dVar1118 = dVar2;
                                int i211111112 = i14;
                                int i211111113 = i211111112 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1118, imageLoader, z111110, dVar1118)), title, str2, onClick, null, dVar1118, null, lVarV, (i211111112 & 14) | 3072 | (i211111112 & 112) | (i211111113 & 57344) | (i211111113 & 458752) | ((i211111112 >> 6) & 3670016) | (i211111113 & 234881024), 644);
                                dVar3 = dVar1118;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            }
                            w2VarX = lVarV.x();
                            if (w2VarX != null) {
                                w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                            }
                        }
                        i21 = 100663296;
                        i14 |= i21;
                        i22 = i13 & 512;
                        if (i22 != 0) {
                            if ((i12 & 1879048192) == 0) {
                                dVar2 = dVar;
                                if (lVarV.n(dVar2)) {
                                    i23 = PKIFailureInfo.duplicateCertReq;
                                } else {
                                    i23 = 268435456;
                                }
                                i14 |= i23;
                            }
                            if ((i14 & 1533916891) == 306783378) {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str1119 = str3;
                                boolean z111111 = z15;
                                androidx.compose.ui.d dVar1119 = dVar2;
                                int i211111114 = i14;
                                int i211111115 = i211111114 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1119, imageLoader, z111111, dVar1119)), title, str2, onClick, null, dVar1119, null, lVarV, (i211111114 & 14) | 3072 | (i211111114 & 112) | (i211111115 & 57344) | (i211111115 & 458752) | ((i211111114 >> 6) & 3670016) | (i211111115 & 234881024), 644);
                                dVar3 = dVar1119;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            } else {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str11110 = str3;
                                boolean z111112 = z15;
                                androidx.compose.ui.d dVar11110 = dVar2;
                                int i211111116 = i14;
                                int i211111117 = i211111116 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11110, imageLoader, z111112, dVar11110)), title, str2, onClick, null, dVar11110, null, lVarV, (i211111116 & 14) | 3072 | (i211111116 & 112) | (i211111117 & 57344) | (i211111117 & 458752) | ((i211111116 >> 6) & 3670016) | (i211111117 & 234881024), 644);
                                dVar3 = dVar11110;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            }
                            w2VarX = lVarV.x();
                            if (w2VarX != null) {
                                w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                            }
                        }
                        i14 |= 805306368;
                        dVar2 = dVar;
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str11111 = str3;
                            boolean z111113 = z15;
                            androidx.compose.ui.d dVar11111 = dVar2;
                            int i211111118 = i14;
                            int i211111119 = i211111118 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111, imageLoader, z111113, dVar11111)), title, str2, onClick, null, dVar11111, null, lVarV, (i211111118 & 14) | 3072 | (i211111118 & 112) | (i211111119 & 57344) | (i211111119 & 458752) | ((i211111118 >> 6) & 3670016) | (i211111119 & 234881024), 644);
                            dVar3 = dVar11111;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str11112 = str3;
                            boolean z111114 = z15;
                            androidx.compose.ui.d dVar11112 = dVar2;
                            int i2111111110 = i14;
                            int i2111111111 = i2111111110 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11112, imageLoader, z111114, dVar11112)), title, str2, onClick, null, dVar11112, null, lVarV, (i2111111110 & 14) | 3072 | (i2111111110 & 112) | (i2111111111 & 57344) | (i2111111111 & 458752) | ((i2111111110 >> 6) & 3670016) | (i2111111111 & 234881024), 644);
                            dVar3 = dVar11112;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i14 |= 12582912;
                    z15 = z13;
                    if ((i13 & 256) != 0) {
                        if ((i12 & 234881024) == 0) {
                            if (lVarV.K(onClick)) {
                                i21 = 67108864;
                            } else {
                                i21 = 33554432;
                            }
                        }
                        i22 = i13 & 512;
                        if (i22 != 0) {
                            if ((i12 & 1879048192) == 0) {
                                dVar2 = dVar;
                                if (lVarV.n(dVar2)) {
                                    i23 = PKIFailureInfo.duplicateCertReq;
                                } else {
                                    i23 = 268435456;
                                }
                                i14 |= i23;
                            }
                            if ((i14 & 1533916891) == 306783378) {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str11113 = str3;
                                boolean z111115 = z15;
                                androidx.compose.ui.d dVar11113 = dVar2;
                                int i2111111112 = i14;
                                int i2111111113 = i2111111112 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11113, imageLoader, z111115, dVar11113)), title, str2, onClick, null, dVar11113, null, lVarV, (i2111111112 & 14) | 3072 | (i2111111112 & 112) | (i2111111113 & 57344) | (i2111111113 & 458752) | ((i2111111112 >> 6) & 3670016) | (i2111111113 & 234881024), 644);
                                dVar3 = dVar11113;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            } else {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str11114 = str3;
                                boolean z111116 = z15;
                                androidx.compose.ui.d dVar11114 = dVar2;
                                int i2111111114 = i14;
                                int i2111111115 = i2111111114 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11114, imageLoader, z111116, dVar11114)), title, str2, onClick, null, dVar11114, null, lVarV, (i2111111114 & 14) | 3072 | (i2111111114 & 112) | (i2111111115 & 57344) | (i2111111115 & 458752) | ((i2111111114 >> 6) & 3670016) | (i2111111115 & 234881024), 644);
                                dVar3 = dVar11114;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            }
                            w2VarX = lVarV.x();
                            if (w2VarX != null) {
                                w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                            }
                        }
                        i14 |= 805306368;
                        dVar2 = dVar;
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str11115 = str3;
                            boolean z111117 = z15;
                            androidx.compose.ui.d dVar11115 = dVar2;
                            int i2111111116 = i14;
                            int i2111111117 = i2111111116 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11115, imageLoader, z111117, dVar11115)), title, str2, onClick, null, dVar11115, null, lVarV, (i2111111116 & 14) | 3072 | (i2111111116 & 112) | (i2111111117 & 57344) | (i2111111117 & 458752) | ((i2111111116 >> 6) & 3670016) | (i2111111117 & 234881024), 644);
                            dVar3 = dVar11115;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str11116 = str3;
                            boolean z111118 = z15;
                            androidx.compose.ui.d dVar11116 = dVar2;
                            int i2111111118 = i14;
                            int i2111111119 = i2111111118 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11116, imageLoader, z111118, dVar11116)), title, str2, onClick, null, dVar11116, null, lVarV, (i2111111118 & 14) | 3072 | (i2111111118 & 112) | (i2111111119 & 57344) | (i2111111119 & 458752) | ((i2111111118 >> 6) & 3670016) | (i2111111119 & 234881024), 644);
                            dVar3 = dVar11116;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i21 = 100663296;
                    i14 |= i21;
                    i22 = i13 & 512;
                    if (i22 != 0) {
                        if ((i12 & 1879048192) == 0) {
                            dVar2 = dVar;
                            if (lVarV.n(dVar2)) {
                                i23 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i23 = 268435456;
                            }
                            i14 |= i23;
                        }
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str11117 = str3;
                            boolean z111119 = z15;
                            androidx.compose.ui.d dVar11117 = dVar2;
                            int i21111111110 = i14;
                            int i21111111111 = i21111111110 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11117, imageLoader, z111119, dVar11117)), title, str2, onClick, null, dVar11117, null, lVarV, (i21111111110 & 14) | 3072 | (i21111111110 & 112) | (i21111111111 & 57344) | (i21111111111 & 458752) | ((i21111111110 >> 6) & 3670016) | (i21111111111 & 234881024), 644);
                            dVar3 = dVar11117;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str11118 = str3;
                            boolean z1111110 = z15;
                            androidx.compose.ui.d dVar11118 = dVar2;
                            int i21111111112 = i14;
                            int i21111111113 = i21111111112 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11118, imageLoader, z1111110, dVar11118)), title, str2, onClick, null, dVar11118, null, lVarV, (i21111111112 & 14) | 3072 | (i21111111112 & 112) | (i21111111113 & 57344) | (i21111111113 & 458752) | ((i21111111112 >> 6) & 3670016) | (i21111111113 & 234881024), 644);
                            dVar3 = dVar11118;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i14 |= 805306368;
                    dVar2 = dVar;
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str11119 = str3;
                        boolean z1111111 = z15;
                        androidx.compose.ui.d dVar11119 = dVar2;
                        int i21111111114 = i14;
                        int i21111111115 = i21111111114 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11119, imageLoader, z1111111, dVar11119)), title, str2, onClick, null, dVar11119, null, lVarV, (i21111111114 & 14) | 3072 | (i21111111114 & 112) | (i21111111115 & 57344) | (i21111111115 & 458752) | ((i21111111114 >> 6) & 3670016) | (i21111111115 & 234881024), 644);
                        dVar3 = dVar11119;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str111110 = str3;
                        boolean z1111112 = z15;
                        androidx.compose.ui.d dVar111110 = dVar2;
                        int i21111111116 = i14;
                        int i21111111117 = i21111111116 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111110, imageLoader, z1111112, dVar111110)), title, str2, onClick, null, dVar111110, null, lVarV, (i21111111116 & 14) | 3072 | (i21111111116 & 112) | (i21111111117 & 57344) | (i21111111117 & 458752) | ((i21111111116 >> 6) & 3670016) | (i21111111117 & 234881024), 644);
                        dVar3 = dVar111110;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i14 |= 1572864;
                if ((i13 & 128) != 0) {
                    if ((29360128 & i12) == 0) {
                        z15 = z13;
                        if (lVarV.p(z15)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i14 |= i19;
                    }
                    if ((i13 & 256) != 0) {
                        if ((i12 & 234881024) == 0) {
                            if (lVarV.K(onClick)) {
                                i21 = 67108864;
                            } else {
                                i21 = 33554432;
                            }
                        }
                        i22 = i13 & 512;
                        if (i22 != 0) {
                            if ((i12 & 1879048192) == 0) {
                                dVar2 = dVar;
                                if (lVarV.n(dVar2)) {
                                    i23 = PKIFailureInfo.duplicateCertReq;
                                } else {
                                    i23 = 268435456;
                                }
                                i14 |= i23;
                            }
                            if ((i14 & 1533916891) == 306783378) {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str111111 = str3;
                                boolean z1111113 = z15;
                                androidx.compose.ui.d dVar111111 = dVar2;
                                int i21111111118 = i14;
                                int i21111111119 = i21111111118 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111, imageLoader, z1111113, dVar111111)), title, str2, onClick, null, dVar111111, null, lVarV, (i21111111118 & 14) | 3072 | (i21111111118 & 112) | (i21111111119 & 57344) | (i21111111119 & 458752) | ((i21111111118 >> 6) & 3670016) | (i21111111119 & 234881024), 644);
                                dVar3 = dVar111111;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            } else {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str111112 = str3;
                                boolean z1111114 = z15;
                                androidx.compose.ui.d dVar111112 = dVar2;
                                int i211111111110 = i14;
                                int i211111111111 = i211111111110 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111112, imageLoader, z1111114, dVar111112)), title, str2, onClick, null, dVar111112, null, lVarV, (i211111111110 & 14) | 3072 | (i211111111110 & 112) | (i211111111111 & 57344) | (i211111111111 & 458752) | ((i211111111110 >> 6) & 3670016) | (i211111111111 & 234881024), 644);
                                dVar3 = dVar111112;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            }
                            w2VarX = lVarV.x();
                            if (w2VarX != null) {
                                w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                            }
                        }
                        i14 |= 805306368;
                        dVar2 = dVar;
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str111113 = str3;
                            boolean z1111115 = z15;
                            androidx.compose.ui.d dVar111113 = dVar2;
                            int i211111111112 = i14;
                            int i211111111113 = i211111111112 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111113, imageLoader, z1111115, dVar111113)), title, str2, onClick, null, dVar111113, null, lVarV, (i211111111112 & 14) | 3072 | (i211111111112 & 112) | (i211111111113 & 57344) | (i211111111113 & 458752) | ((i211111111112 >> 6) & 3670016) | (i211111111113 & 234881024), 644);
                            dVar3 = dVar111113;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str111114 = str3;
                            boolean z1111116 = z15;
                            androidx.compose.ui.d dVar111114 = dVar2;
                            int i211111111114 = i14;
                            int i211111111115 = i211111111114 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111114, imageLoader, z1111116, dVar111114)), title, str2, onClick, null, dVar111114, null, lVarV, (i211111111114 & 14) | 3072 | (i211111111114 & 112) | (i211111111115 & 57344) | (i211111111115 & 458752) | ((i211111111114 >> 6) & 3670016) | (i211111111115 & 234881024), 644);
                            dVar3 = dVar111114;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i21 = 100663296;
                    i14 |= i21;
                    i22 = i13 & 512;
                    if (i22 != 0) {
                        if ((i12 & 1879048192) == 0) {
                            dVar2 = dVar;
                            if (lVarV.n(dVar2)) {
                                i23 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i23 = 268435456;
                            }
                            i14 |= i23;
                        }
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str111115 = str3;
                            boolean z1111117 = z15;
                            androidx.compose.ui.d dVar111115 = dVar2;
                            int i211111111116 = i14;
                            int i211111111117 = i211111111116 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111115, imageLoader, z1111117, dVar111115)), title, str2, onClick, null, dVar111115, null, lVarV, (i211111111116 & 14) | 3072 | (i211111111116 & 112) | (i211111111117 & 57344) | (i211111111117 & 458752) | ((i211111111116 >> 6) & 3670016) | (i211111111117 & 234881024), 644);
                            dVar3 = dVar111115;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str111116 = str3;
                            boolean z1111118 = z15;
                            androidx.compose.ui.d dVar111116 = dVar2;
                            int i211111111118 = i14;
                            int i211111111119 = i211111111118 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111116, imageLoader, z1111118, dVar111116)), title, str2, onClick, null, dVar111116, null, lVarV, (i211111111118 & 14) | 3072 | (i211111111118 & 112) | (i211111111119 & 57344) | (i211111111119 & 458752) | ((i211111111118 >> 6) & 3670016) | (i211111111119 & 234881024), 644);
                            dVar3 = dVar111116;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i14 |= 805306368;
                    dVar2 = dVar;
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str111117 = str3;
                        boolean z1111119 = z15;
                        androidx.compose.ui.d dVar111117 = dVar2;
                        int i2111111111110 = i14;
                        int i2111111111111 = i2111111111110 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111117, imageLoader, z1111119, dVar111117)), title, str2, onClick, null, dVar111117, null, lVarV, (i2111111111110 & 14) | 3072 | (i2111111111110 & 112) | (i2111111111111 & 57344) | (i2111111111111 & 458752) | ((i2111111111110 >> 6) & 3670016) | (i2111111111111 & 234881024), 644);
                        dVar3 = dVar111117;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str111118 = str3;
                        boolean z11111110 = z15;
                        androidx.compose.ui.d dVar111118 = dVar2;
                        int i2111111111112 = i14;
                        int i2111111111113 = i2111111111112 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111118, imageLoader, z11111110, dVar111118)), title, str2, onClick, null, dVar111118, null, lVarV, (i2111111111112 & 14) | 3072 | (i2111111111112 & 112) | (i2111111111113 & 57344) | (i2111111111113 & 458752) | ((i2111111111112 >> 6) & 3670016) | (i2111111111113 & 234881024), 644);
                        dVar3 = dVar111118;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i14 |= 12582912;
                z15 = z13;
                if ((i13 & 256) != 0) {
                    if ((i12 & 234881024) == 0) {
                        if (lVarV.K(onClick)) {
                            i21 = 67108864;
                        } else {
                            i21 = 33554432;
                        }
                    }
                    i22 = i13 & 512;
                    if (i22 != 0) {
                        if ((i12 & 1879048192) == 0) {
                            dVar2 = dVar;
                            if (lVarV.n(dVar2)) {
                                i23 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i23 = 268435456;
                            }
                            i14 |= i23;
                        }
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str111119 = str3;
                            boolean z11111111 = z15;
                            androidx.compose.ui.d dVar111119 = dVar2;
                            int i2111111111114 = i14;
                            int i2111111111115 = i2111111111114 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111119, imageLoader, z11111111, dVar111119)), title, str2, onClick, null, dVar111119, null, lVarV, (i2111111111114 & 14) | 3072 | (i2111111111114 & 112) | (i2111111111115 & 57344) | (i2111111111115 & 458752) | ((i2111111111114 >> 6) & 3670016) | (i2111111111115 & 234881024), 644);
                            dVar3 = dVar111119;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str1111110 = str3;
                            boolean z11111112 = z15;
                            androidx.compose.ui.d dVar1111110 = dVar2;
                            int i2111111111116 = i14;
                            int i2111111111117 = i2111111111116 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111110, imageLoader, z11111112, dVar1111110)), title, str2, onClick, null, dVar1111110, null, lVarV, (i2111111111116 & 14) | 3072 | (i2111111111116 & 112) | (i2111111111117 & 57344) | (i2111111111117 & 458752) | ((i2111111111116 >> 6) & 3670016) | (i2111111111117 & 234881024), 644);
                            dVar3 = dVar1111110;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i14 |= 805306368;
                    dVar2 = dVar;
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str1111111 = str3;
                        boolean z11111113 = z15;
                        androidx.compose.ui.d dVar1111111 = dVar2;
                        int i2111111111118 = i14;
                        int i2111111111119 = i2111111111118 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111, imageLoader, z11111113, dVar1111111)), title, str2, onClick, null, dVar1111111, null, lVarV, (i2111111111118 & 14) | 3072 | (i2111111111118 & 112) | (i2111111111119 & 57344) | (i2111111111119 & 458752) | ((i2111111111118 >> 6) & 3670016) | (i2111111111119 & 234881024), 644);
                        dVar3 = dVar1111111;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str1111112 = str3;
                        boolean z11111114 = z15;
                        androidx.compose.ui.d dVar1111112 = dVar2;
                        int i21111111111110 = i14;
                        int i21111111111111 = i21111111111110 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111112, imageLoader, z11111114, dVar1111112)), title, str2, onClick, null, dVar1111112, null, lVarV, (i21111111111110 & 14) | 3072 | (i21111111111110 & 112) | (i21111111111111 & 57344) | (i21111111111111 & 458752) | ((i21111111111110 >> 6) & 3670016) | (i21111111111111 & 234881024), 644);
                        dVar3 = dVar1111112;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i21 = 100663296;
                i14 |= i21;
                i22 = i13 & 512;
                if (i22 != 0) {
                    if ((i12 & 1879048192) == 0) {
                        dVar2 = dVar;
                        if (lVarV.n(dVar2)) {
                            i23 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i23 = 268435456;
                        }
                        i14 |= i23;
                    }
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str1111113 = str3;
                        boolean z11111115 = z15;
                        androidx.compose.ui.d dVar1111113 = dVar2;
                        int i21111111111112 = i14;
                        int i21111111111113 = i21111111111112 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111113, imageLoader, z11111115, dVar1111113)), title, str2, onClick, null, dVar1111113, null, lVarV, (i21111111111112 & 14) | 3072 | (i21111111111112 & 112) | (i21111111111113 & 57344) | (i21111111111113 & 458752) | ((i21111111111112 >> 6) & 3670016) | (i21111111111113 & 234881024), 644);
                        dVar3 = dVar1111113;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str1111114 = str3;
                        boolean z11111116 = z15;
                        androidx.compose.ui.d dVar1111114 = dVar2;
                        int i21111111111114 = i14;
                        int i21111111111115 = i21111111111114 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111114, imageLoader, z11111116, dVar1111114)), title, str2, onClick, null, dVar1111114, null, lVarV, (i21111111111114 & 14) | 3072 | (i21111111111114 & 112) | (i21111111111115 & 57344) | (i21111111111115 & 458752) | ((i21111111111114 >> 6) & 3670016) | (i21111111111115 & 234881024), 644);
                        dVar3 = dVar1111114;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i14 |= 805306368;
                dVar2 = dVar;
                if ((i14 & 1533916891) == 306783378) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str1111115 = str3;
                    boolean z11111117 = z15;
                    androidx.compose.ui.d dVar1111115 = dVar2;
                    int i21111111111116 = i14;
                    int i21111111111117 = i21111111111116 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111115, imageLoader, z11111117, dVar1111115)), title, str2, onClick, null, dVar1111115, null, lVarV, (i21111111111116 & 14) | 3072 | (i21111111111116 & 112) | (i21111111111117 & 57344) | (i21111111111117 & 458752) | ((i21111111111116 >> 6) & 3670016) | (i21111111111117 & 234881024), 644);
                    dVar3 = dVar1111115;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str1111116 = str3;
                    boolean z11111118 = z15;
                    androidx.compose.ui.d dVar1111116 = dVar2;
                    int i21111111111118 = i14;
                    int i21111111111119 = i21111111111118 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111116, imageLoader, z11111118, dVar1111116)), title, str2, onClick, null, dVar1111116, null, lVarV, (i21111111111118 & 14) | 3072 | (i21111111111118 & 112) | (i21111111111119 & 57344) | (i21111111111119 & 458752) | ((i21111111111118 >> 6) & 3670016) | (i21111111111119 & 234881024), 644);
                    dVar3 = dVar1111116;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                }
            }
            i14 |= 3072;
            str3 = str;
            if ((i13 & 16) != 0) {
                i14 |= 24576;
            } else if ((i12 & 57344) == 0) {
                if (lVarV.n(imageLoader)) {
                    i16 = 16384;
                } else {
                    i16 = PKIFailureInfo.certRevoked;
                }
                i14 |= i16;
            }
            if ((i13 & 32) != 0) {
                if ((i12 & 458752) == 0) {
                    if (lVarV.n(title)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                if ((i13 & 64) != 0) {
                    if ((i12 & 3670016) == 0) {
                        if (lVarV.n(str2)) {
                            i18 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i18 = PKIFailureInfo.signerNotTrusted;
                        }
                        i14 |= i18;
                    }
                    if ((i13 & 128) != 0) {
                        if ((29360128 & i12) == 0) {
                            z15 = z13;
                            if (lVarV.p(z15)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                            i14 |= i19;
                        }
                        if ((i13 & 256) != 0) {
                            if ((i12 & 234881024) == 0) {
                                if (lVarV.K(onClick)) {
                                    i21 = 67108864;
                                } else {
                                    i21 = 33554432;
                                }
                            }
                            i22 = i13 & 512;
                            if (i22 != 0) {
                                if ((i12 & 1879048192) == 0) {
                                    dVar2 = dVar;
                                    if (lVarV.n(dVar2)) {
                                        i23 = PKIFailureInfo.duplicateCertReq;
                                    } else {
                                        i23 = 268435456;
                                    }
                                    i14 |= i23;
                                }
                                if ((i14 & 1533916891) == 306783378) {
                                    if (i22 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (p020r2.o.J()) {
                                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                    }
                                    String str1111117 = str3;
                                    boolean z11111119 = z15;
                                    androidx.compose.ui.d dVar1111117 = dVar2;
                                    int i211111111111110 = i14;
                                    int i211111111111111 = i211111111111110 >> 3;
                                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111117, imageLoader, z11111119, dVar1111117)), title, str2, onClick, null, dVar1111117, null, lVarV, (i211111111111110 & 14) | 3072 | (i211111111111110 & 112) | (i211111111111111 & 57344) | (i211111111111111 & 458752) | ((i211111111111110 >> 6) & 3670016) | (i211111111111111 & 234881024), 644);
                                    dVar3 = dVar1111117;
                                    if (p020r2.o.J()) {
                                        p020r2.o.R();
                                    }
                                } else {
                                    if (i22 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (p020r2.o.J()) {
                                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                    }
                                    String str1111118 = str3;
                                    boolean z111111110 = z15;
                                    androidx.compose.ui.d dVar1111118 = dVar2;
                                    int i211111111111112 = i14;
                                    int i211111111111113 = i211111111111112 >> 3;
                                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111118, imageLoader, z111111110, dVar1111118)), title, str2, onClick, null, dVar1111118, null, lVarV, (i211111111111112 & 14) | 3072 | (i211111111111112 & 112) | (i211111111111113 & 57344) | (i211111111111113 & 458752) | ((i211111111111112 >> 6) & 3670016) | (i211111111111113 & 234881024), 644);
                                    dVar3 = dVar1111118;
                                    if (p020r2.o.J()) {
                                        p020r2.o.R();
                                    }
                                }
                                w2VarX = lVarV.x();
                                if (w2VarX != null) {
                                    w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                                }
                            }
                            i14 |= 805306368;
                            dVar2 = dVar;
                            if ((i14 & 1533916891) == 306783378) {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str1111119 = str3;
                                boolean z111111111 = z15;
                                androidx.compose.ui.d dVar1111119 = dVar2;
                                int i211111111111114 = i14;
                                int i211111111111115 = i211111111111114 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111119, imageLoader, z111111111, dVar1111119)), title, str2, onClick, null, dVar1111119, null, lVarV, (i211111111111114 & 14) | 3072 | (i211111111111114 & 112) | (i211111111111115 & 57344) | (i211111111111115 & 458752) | ((i211111111111114 >> 6) & 3670016) | (i211111111111115 & 234881024), 644);
                                dVar3 = dVar1111119;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            } else {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str11111110 = str3;
                                boolean z111111112 = z15;
                                androidx.compose.ui.d dVar11111110 = dVar2;
                                int i211111111111116 = i14;
                                int i211111111111117 = i211111111111116 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111110, imageLoader, z111111112, dVar11111110)), title, str2, onClick, null, dVar11111110, null, lVarV, (i211111111111116 & 14) | 3072 | (i211111111111116 & 112) | (i211111111111117 & 57344) | (i211111111111117 & 458752) | ((i211111111111116 >> 6) & 3670016) | (i211111111111117 & 234881024), 644);
                                dVar3 = dVar11111110;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            }
                            w2VarX = lVarV.x();
                            if (w2VarX != null) {
                                w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                            }
                        }
                        i21 = 100663296;
                        i14 |= i21;
                        i22 = i13 & 512;
                        if (i22 != 0) {
                            if ((i12 & 1879048192) == 0) {
                                dVar2 = dVar;
                                if (lVarV.n(dVar2)) {
                                    i23 = PKIFailureInfo.duplicateCertReq;
                                } else {
                                    i23 = 268435456;
                                }
                                i14 |= i23;
                            }
                            if ((i14 & 1533916891) == 306783378) {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str11111111 = str3;
                                boolean z111111113 = z15;
                                androidx.compose.ui.d dVar11111111 = dVar2;
                                int i211111111111118 = i14;
                                int i211111111111119 = i211111111111118 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111, imageLoader, z111111113, dVar11111111)), title, str2, onClick, null, dVar11111111, null, lVarV, (i211111111111118 & 14) | 3072 | (i211111111111118 & 112) | (i211111111111119 & 57344) | (i211111111111119 & 458752) | ((i211111111111118 >> 6) & 3670016) | (i211111111111119 & 234881024), 644);
                                dVar3 = dVar11111111;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            } else {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str11111112 = str3;
                                boolean z111111114 = z15;
                                androidx.compose.ui.d dVar11111112 = dVar2;
                                int i2111111111111110 = i14;
                                int i2111111111111111 = i2111111111111110 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111112, imageLoader, z111111114, dVar11111112)), title, str2, onClick, null, dVar11111112, null, lVarV, (i2111111111111110 & 14) | 3072 | (i2111111111111110 & 112) | (i2111111111111111 & 57344) | (i2111111111111111 & 458752) | ((i2111111111111110 >> 6) & 3670016) | (i2111111111111111 & 234881024), 644);
                                dVar3 = dVar11111112;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            }
                            w2VarX = lVarV.x();
                            if (w2VarX != null) {
                                w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                            }
                        }
                        i14 |= 805306368;
                        dVar2 = dVar;
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str11111113 = str3;
                            boolean z111111115 = z15;
                            androidx.compose.ui.d dVar11111113 = dVar2;
                            int i2111111111111112 = i14;
                            int i2111111111111113 = i2111111111111112 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111113, imageLoader, z111111115, dVar11111113)), title, str2, onClick, null, dVar11111113, null, lVarV, (i2111111111111112 & 14) | 3072 | (i2111111111111112 & 112) | (i2111111111111113 & 57344) | (i2111111111111113 & 458752) | ((i2111111111111112 >> 6) & 3670016) | (i2111111111111113 & 234881024), 644);
                            dVar3 = dVar11111113;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str11111114 = str3;
                            boolean z111111116 = z15;
                            androidx.compose.ui.d dVar11111114 = dVar2;
                            int i2111111111111114 = i14;
                            int i2111111111111115 = i2111111111111114 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111114, imageLoader, z111111116, dVar11111114)), title, str2, onClick, null, dVar11111114, null, lVarV, (i2111111111111114 & 14) | 3072 | (i2111111111111114 & 112) | (i2111111111111115 & 57344) | (i2111111111111115 & 458752) | ((i2111111111111114 >> 6) & 3670016) | (i2111111111111115 & 234881024), 644);
                            dVar3 = dVar11111114;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i14 |= 12582912;
                    z15 = z13;
                    if ((i13 & 256) != 0) {
                        if ((i12 & 234881024) == 0) {
                            if (lVarV.K(onClick)) {
                                i21 = 67108864;
                            } else {
                                i21 = 33554432;
                            }
                        }
                        i22 = i13 & 512;
                        if (i22 != 0) {
                            if ((i12 & 1879048192) == 0) {
                                dVar2 = dVar;
                                if (lVarV.n(dVar2)) {
                                    i23 = PKIFailureInfo.duplicateCertReq;
                                } else {
                                    i23 = 268435456;
                                }
                                i14 |= i23;
                            }
                            if ((i14 & 1533916891) == 306783378) {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str11111115 = str3;
                                boolean z111111117 = z15;
                                androidx.compose.ui.d dVar11111115 = dVar2;
                                int i2111111111111116 = i14;
                                int i2111111111111117 = i2111111111111116 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111115, imageLoader, z111111117, dVar11111115)), title, str2, onClick, null, dVar11111115, null, lVarV, (i2111111111111116 & 14) | 3072 | (i2111111111111116 & 112) | (i2111111111111117 & 57344) | (i2111111111111117 & 458752) | ((i2111111111111116 >> 6) & 3670016) | (i2111111111111117 & 234881024), 644);
                                dVar3 = dVar11111115;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            } else {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str11111116 = str3;
                                boolean z111111118 = z15;
                                androidx.compose.ui.d dVar11111116 = dVar2;
                                int i2111111111111118 = i14;
                                int i2111111111111119 = i2111111111111118 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111116, imageLoader, z111111118, dVar11111116)), title, str2, onClick, null, dVar11111116, null, lVarV, (i2111111111111118 & 14) | 3072 | (i2111111111111118 & 112) | (i2111111111111119 & 57344) | (i2111111111111119 & 458752) | ((i2111111111111118 >> 6) & 3670016) | (i2111111111111119 & 234881024), 644);
                                dVar3 = dVar11111116;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            }
                            w2VarX = lVarV.x();
                            if (w2VarX != null) {
                                w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                            }
                        }
                        i14 |= 805306368;
                        dVar2 = dVar;
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str11111117 = str3;
                            boolean z111111119 = z15;
                            androidx.compose.ui.d dVar11111117 = dVar2;
                            int i21111111111111110 = i14;
                            int i21111111111111111 = i21111111111111110 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111117, imageLoader, z111111119, dVar11111117)), title, str2, onClick, null, dVar11111117, null, lVarV, (i21111111111111110 & 14) | 3072 | (i21111111111111110 & 112) | (i21111111111111111 & 57344) | (i21111111111111111 & 458752) | ((i21111111111111110 >> 6) & 3670016) | (i21111111111111111 & 234881024), 644);
                            dVar3 = dVar11111117;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str11111118 = str3;
                            boolean z1111111110 = z15;
                            androidx.compose.ui.d dVar11111118 = dVar2;
                            int i21111111111111112 = i14;
                            int i21111111111111113 = i21111111111111112 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111118, imageLoader, z1111111110, dVar11111118)), title, str2, onClick, null, dVar11111118, null, lVarV, (i21111111111111112 & 14) | 3072 | (i21111111111111112 & 112) | (i21111111111111113 & 57344) | (i21111111111111113 & 458752) | ((i21111111111111112 >> 6) & 3670016) | (i21111111111111113 & 234881024), 644);
                            dVar3 = dVar11111118;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i21 = 100663296;
                    i14 |= i21;
                    i22 = i13 & 512;
                    if (i22 != 0) {
                        if ((i12 & 1879048192) == 0) {
                            dVar2 = dVar;
                            if (lVarV.n(dVar2)) {
                                i23 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i23 = 268435456;
                            }
                            i14 |= i23;
                        }
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str11111119 = str3;
                            boolean z1111111111 = z15;
                            androidx.compose.ui.d dVar11111119 = dVar2;
                            int i21111111111111114 = i14;
                            int i21111111111111115 = i21111111111111114 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111119, imageLoader, z1111111111, dVar11111119)), title, str2, onClick, null, dVar11111119, null, lVarV, (i21111111111111114 & 14) | 3072 | (i21111111111111114 & 112) | (i21111111111111115 & 57344) | (i21111111111111115 & 458752) | ((i21111111111111114 >> 6) & 3670016) | (i21111111111111115 & 234881024), 644);
                            dVar3 = dVar11111119;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str111111110 = str3;
                            boolean z1111111112 = z15;
                            androidx.compose.ui.d dVar111111110 = dVar2;
                            int i21111111111111116 = i14;
                            int i21111111111111117 = i21111111111111116 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111110, imageLoader, z1111111112, dVar111111110)), title, str2, onClick, null, dVar111111110, null, lVarV, (i21111111111111116 & 14) | 3072 | (i21111111111111116 & 112) | (i21111111111111117 & 57344) | (i21111111111111117 & 458752) | ((i21111111111111116 >> 6) & 3670016) | (i21111111111111117 & 234881024), 644);
                            dVar3 = dVar111111110;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i14 |= 805306368;
                    dVar2 = dVar;
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str111111111 = str3;
                        boolean z1111111113 = z15;
                        androidx.compose.ui.d dVar111111111 = dVar2;
                        int i21111111111111118 = i14;
                        int i21111111111111119 = i21111111111111118 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111, imageLoader, z1111111113, dVar111111111)), title, str2, onClick, null, dVar111111111, null, lVarV, (i21111111111111118 & 14) | 3072 | (i21111111111111118 & 112) | (i21111111111111119 & 57344) | (i21111111111111119 & 458752) | ((i21111111111111118 >> 6) & 3670016) | (i21111111111111119 & 234881024), 644);
                        dVar3 = dVar111111111;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str111111112 = str3;
                        boolean z1111111114 = z15;
                        androidx.compose.ui.d dVar111111112 = dVar2;
                        int i211111111111111110 = i14;
                        int i211111111111111111 = i211111111111111110 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111112, imageLoader, z1111111114, dVar111111112)), title, str2, onClick, null, dVar111111112, null, lVarV, (i211111111111111110 & 14) | 3072 | (i211111111111111110 & 112) | (i211111111111111111 & 57344) | (i211111111111111111 & 458752) | ((i211111111111111110 >> 6) & 3670016) | (i211111111111111111 & 234881024), 644);
                        dVar3 = dVar111111112;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i14 |= 1572864;
                if ((i13 & 128) != 0) {
                    if ((29360128 & i12) == 0) {
                        z15 = z13;
                        if (lVarV.p(z15)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i14 |= i19;
                    }
                    if ((i13 & 256) != 0) {
                        if ((i12 & 234881024) == 0) {
                            if (lVarV.K(onClick)) {
                                i21 = 67108864;
                            } else {
                                i21 = 33554432;
                            }
                        }
                        i22 = i13 & 512;
                        if (i22 != 0) {
                            if ((i12 & 1879048192) == 0) {
                                dVar2 = dVar;
                                if (lVarV.n(dVar2)) {
                                    i23 = PKIFailureInfo.duplicateCertReq;
                                } else {
                                    i23 = 268435456;
                                }
                                i14 |= i23;
                            }
                            if ((i14 & 1533916891) == 306783378) {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str111111113 = str3;
                                boolean z1111111115 = z15;
                                androidx.compose.ui.d dVar111111113 = dVar2;
                                int i211111111111111112 = i14;
                                int i211111111111111113 = i211111111111111112 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111113, imageLoader, z1111111115, dVar111111113)), title, str2, onClick, null, dVar111111113, null, lVarV, (i211111111111111112 & 14) | 3072 | (i211111111111111112 & 112) | (i211111111111111113 & 57344) | (i211111111111111113 & 458752) | ((i211111111111111112 >> 6) & 3670016) | (i211111111111111113 & 234881024), 644);
                                dVar3 = dVar111111113;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            } else {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str111111114 = str3;
                                boolean z1111111116 = z15;
                                androidx.compose.ui.d dVar111111114 = dVar2;
                                int i211111111111111114 = i14;
                                int i211111111111111115 = i211111111111111114 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111114, imageLoader, z1111111116, dVar111111114)), title, str2, onClick, null, dVar111111114, null, lVarV, (i211111111111111114 & 14) | 3072 | (i211111111111111114 & 112) | (i211111111111111115 & 57344) | (i211111111111111115 & 458752) | ((i211111111111111114 >> 6) & 3670016) | (i211111111111111115 & 234881024), 644);
                                dVar3 = dVar111111114;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            }
                            w2VarX = lVarV.x();
                            if (w2VarX != null) {
                                w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                            }
                        }
                        i14 |= 805306368;
                        dVar2 = dVar;
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str111111115 = str3;
                            boolean z1111111117 = z15;
                            androidx.compose.ui.d dVar111111115 = dVar2;
                            int i211111111111111116 = i14;
                            int i211111111111111117 = i211111111111111116 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111115, imageLoader, z1111111117, dVar111111115)), title, str2, onClick, null, dVar111111115, null, lVarV, (i211111111111111116 & 14) | 3072 | (i211111111111111116 & 112) | (i211111111111111117 & 57344) | (i211111111111111117 & 458752) | ((i211111111111111116 >> 6) & 3670016) | (i211111111111111117 & 234881024), 644);
                            dVar3 = dVar111111115;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str111111116 = str3;
                            boolean z1111111118 = z15;
                            androidx.compose.ui.d dVar111111116 = dVar2;
                            int i211111111111111118 = i14;
                            int i211111111111111119 = i211111111111111118 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111116, imageLoader, z1111111118, dVar111111116)), title, str2, onClick, null, dVar111111116, null, lVarV, (i211111111111111118 & 14) | 3072 | (i211111111111111118 & 112) | (i211111111111111119 & 57344) | (i211111111111111119 & 458752) | ((i211111111111111118 >> 6) & 3670016) | (i211111111111111119 & 234881024), 644);
                            dVar3 = dVar111111116;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i21 = 100663296;
                    i14 |= i21;
                    i22 = i13 & 512;
                    if (i22 != 0) {
                        if ((i12 & 1879048192) == 0) {
                            dVar2 = dVar;
                            if (lVarV.n(dVar2)) {
                                i23 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i23 = 268435456;
                            }
                            i14 |= i23;
                        }
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str111111117 = str3;
                            boolean z1111111119 = z15;
                            androidx.compose.ui.d dVar111111117 = dVar2;
                            int i2111111111111111110 = i14;
                            int i2111111111111111111 = i2111111111111111110 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111117, imageLoader, z1111111119, dVar111111117)), title, str2, onClick, null, dVar111111117, null, lVarV, (i2111111111111111110 & 14) | 3072 | (i2111111111111111110 & 112) | (i2111111111111111111 & 57344) | (i2111111111111111111 & 458752) | ((i2111111111111111110 >> 6) & 3670016) | (i2111111111111111111 & 234881024), 644);
                            dVar3 = dVar111111117;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str111111118 = str3;
                            boolean z11111111110 = z15;
                            androidx.compose.ui.d dVar111111118 = dVar2;
                            int i2111111111111111112 = i14;
                            int i2111111111111111113 = i2111111111111111112 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111118, imageLoader, z11111111110, dVar111111118)), title, str2, onClick, null, dVar111111118, null, lVarV, (i2111111111111111112 & 14) | 3072 | (i2111111111111111112 & 112) | (i2111111111111111113 & 57344) | (i2111111111111111113 & 458752) | ((i2111111111111111112 >> 6) & 3670016) | (i2111111111111111113 & 234881024), 644);
                            dVar3 = dVar111111118;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i14 |= 805306368;
                    dVar2 = dVar;
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str111111119 = str3;
                        boolean z11111111111 = z15;
                        androidx.compose.ui.d dVar111111119 = dVar2;
                        int i2111111111111111114 = i14;
                        int i2111111111111111115 = i2111111111111111114 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111119, imageLoader, z11111111111, dVar111111119)), title, str2, onClick, null, dVar111111119, null, lVarV, (i2111111111111111114 & 14) | 3072 | (i2111111111111111114 & 112) | (i2111111111111111115 & 57344) | (i2111111111111111115 & 458752) | ((i2111111111111111114 >> 6) & 3670016) | (i2111111111111111115 & 234881024), 644);
                        dVar3 = dVar111111119;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str1111111110 = str3;
                        boolean z11111111112 = z15;
                        androidx.compose.ui.d dVar1111111110 = dVar2;
                        int i2111111111111111116 = i14;
                        int i2111111111111111117 = i2111111111111111116 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111110, imageLoader, z11111111112, dVar1111111110)), title, str2, onClick, null, dVar1111111110, null, lVarV, (i2111111111111111116 & 14) | 3072 | (i2111111111111111116 & 112) | (i2111111111111111117 & 57344) | (i2111111111111111117 & 458752) | ((i2111111111111111116 >> 6) & 3670016) | (i2111111111111111117 & 234881024), 644);
                        dVar3 = dVar1111111110;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i14 |= 12582912;
                z15 = z13;
                if ((i13 & 256) != 0) {
                    if ((i12 & 234881024) == 0) {
                        if (lVarV.K(onClick)) {
                            i21 = 67108864;
                        } else {
                            i21 = 33554432;
                        }
                    }
                    i22 = i13 & 512;
                    if (i22 != 0) {
                        if ((i12 & 1879048192) == 0) {
                            dVar2 = dVar;
                            if (lVarV.n(dVar2)) {
                                i23 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i23 = 268435456;
                            }
                            i14 |= i23;
                        }
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str1111111111 = str3;
                            boolean z11111111113 = z15;
                            androidx.compose.ui.d dVar1111111111 = dVar2;
                            int i2111111111111111118 = i14;
                            int i2111111111111111119 = i2111111111111111118 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111, imageLoader, z11111111113, dVar1111111111)), title, str2, onClick, null, dVar1111111111, null, lVarV, (i2111111111111111118 & 14) | 3072 | (i2111111111111111118 & 112) | (i2111111111111111119 & 57344) | (i2111111111111111119 & 458752) | ((i2111111111111111118 >> 6) & 3670016) | (i2111111111111111119 & 234881024), 644);
                            dVar3 = dVar1111111111;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str1111111112 = str3;
                            boolean z11111111114 = z15;
                            androidx.compose.ui.d dVar1111111112 = dVar2;
                            int i21111111111111111110 = i14;
                            int i21111111111111111111 = i21111111111111111110 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111112, imageLoader, z11111111114, dVar1111111112)), title, str2, onClick, null, dVar1111111112, null, lVarV, (i21111111111111111110 & 14) | 3072 | (i21111111111111111110 & 112) | (i21111111111111111111 & 57344) | (i21111111111111111111 & 458752) | ((i21111111111111111110 >> 6) & 3670016) | (i21111111111111111111 & 234881024), 644);
                            dVar3 = dVar1111111112;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i14 |= 805306368;
                    dVar2 = dVar;
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str1111111113 = str3;
                        boolean z11111111115 = z15;
                        androidx.compose.ui.d dVar1111111113 = dVar2;
                        int i21111111111111111112 = i14;
                        int i21111111111111111113 = i21111111111111111112 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111113, imageLoader, z11111111115, dVar1111111113)), title, str2, onClick, null, dVar1111111113, null, lVarV, (i21111111111111111112 & 14) | 3072 | (i21111111111111111112 & 112) | (i21111111111111111113 & 57344) | (i21111111111111111113 & 458752) | ((i21111111111111111112 >> 6) & 3670016) | (i21111111111111111113 & 234881024), 644);
                        dVar3 = dVar1111111113;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str1111111114 = str3;
                        boolean z11111111116 = z15;
                        androidx.compose.ui.d dVar1111111114 = dVar2;
                        int i21111111111111111114 = i14;
                        int i21111111111111111115 = i21111111111111111114 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111114, imageLoader, z11111111116, dVar1111111114)), title, str2, onClick, null, dVar1111111114, null, lVarV, (i21111111111111111114 & 14) | 3072 | (i21111111111111111114 & 112) | (i21111111111111111115 & 57344) | (i21111111111111111115 & 458752) | ((i21111111111111111114 >> 6) & 3670016) | (i21111111111111111115 & 234881024), 644);
                        dVar3 = dVar1111111114;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i21 = 100663296;
                i14 |= i21;
                i22 = i13 & 512;
                if (i22 != 0) {
                    if ((i12 & 1879048192) == 0) {
                        dVar2 = dVar;
                        if (lVarV.n(dVar2)) {
                            i23 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i23 = 268435456;
                        }
                        i14 |= i23;
                    }
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str1111111115 = str3;
                        boolean z11111111117 = z15;
                        androidx.compose.ui.d dVar1111111115 = dVar2;
                        int i21111111111111111116 = i14;
                        int i21111111111111111117 = i21111111111111111116 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111115, imageLoader, z11111111117, dVar1111111115)), title, str2, onClick, null, dVar1111111115, null, lVarV, (i21111111111111111116 & 14) | 3072 | (i21111111111111111116 & 112) | (i21111111111111111117 & 57344) | (i21111111111111111117 & 458752) | ((i21111111111111111116 >> 6) & 3670016) | (i21111111111111111117 & 234881024), 644);
                        dVar3 = dVar1111111115;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str1111111116 = str3;
                        boolean z11111111118 = z15;
                        androidx.compose.ui.d dVar1111111116 = dVar2;
                        int i21111111111111111118 = i14;
                        int i21111111111111111119 = i21111111111111111118 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111116, imageLoader, z11111111118, dVar1111111116)), title, str2, onClick, null, dVar1111111116, null, lVarV, (i21111111111111111118 & 14) | 3072 | (i21111111111111111118 & 112) | (i21111111111111111119 & 57344) | (i21111111111111111119 & 458752) | ((i21111111111111111118 >> 6) & 3670016) | (i21111111111111111119 & 234881024), 644);
                        dVar3 = dVar1111111116;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i14 |= 805306368;
                dVar2 = dVar;
                if ((i14 & 1533916891) == 306783378) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str1111111117 = str3;
                    boolean z11111111119 = z15;
                    androidx.compose.ui.d dVar1111111117 = dVar2;
                    int i211111111111111111110 = i14;
                    int i211111111111111111111 = i211111111111111111110 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111117, imageLoader, z11111111119, dVar1111111117)), title, str2, onClick, null, dVar1111111117, null, lVarV, (i211111111111111111110 & 14) | 3072 | (i211111111111111111110 & 112) | (i211111111111111111111 & 57344) | (i211111111111111111111 & 458752) | ((i211111111111111111110 >> 6) & 3670016) | (i211111111111111111111 & 234881024), 644);
                    dVar3 = dVar1111111117;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str1111111118 = str3;
                    boolean z111111111110 = z15;
                    androidx.compose.ui.d dVar1111111118 = dVar2;
                    int i211111111111111111112 = i14;
                    int i211111111111111111113 = i211111111111111111112 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111118, imageLoader, z111111111110, dVar1111111118)), title, str2, onClick, null, dVar1111111118, null, lVarV, (i211111111111111111112 & 14) | 3072 | (i211111111111111111112 & 112) | (i211111111111111111113 & 57344) | (i211111111111111111113 & 458752) | ((i211111111111111111112 >> 6) & 3670016) | (i211111111111111111113 & 234881024), 644);
                    dVar3 = dVar1111111118;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                }
            }
            i17 = 196608;
            i14 |= i17;
            if ((i13 & 64) != 0) {
                if ((i12 & 3670016) == 0) {
                    if (lVarV.n(str2)) {
                        i18 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i18 = PKIFailureInfo.signerNotTrusted;
                    }
                    i14 |= i18;
                }
                if ((i13 & 128) != 0) {
                    if ((29360128 & i12) == 0) {
                        z15 = z13;
                        if (lVarV.p(z15)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i14 |= i19;
                    }
                    if ((i13 & 256) != 0) {
                        if ((i12 & 234881024) == 0) {
                            if (lVarV.K(onClick)) {
                                i21 = 67108864;
                            } else {
                                i21 = 33554432;
                            }
                        }
                        i22 = i13 & 512;
                        if (i22 != 0) {
                            if ((i12 & 1879048192) == 0) {
                                dVar2 = dVar;
                                if (lVarV.n(dVar2)) {
                                    i23 = PKIFailureInfo.duplicateCertReq;
                                } else {
                                    i23 = 268435456;
                                }
                                i14 |= i23;
                            }
                            if ((i14 & 1533916891) == 306783378) {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str1111111119 = str3;
                                boolean z111111111111 = z15;
                                androidx.compose.ui.d dVar1111111119 = dVar2;
                                int i211111111111111111114 = i14;
                                int i211111111111111111115 = i211111111111111111114 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111119, imageLoader, z111111111111, dVar1111111119)), title, str2, onClick, null, dVar1111111119, null, lVarV, (i211111111111111111114 & 14) | 3072 | (i211111111111111111114 & 112) | (i211111111111111111115 & 57344) | (i211111111111111111115 & 458752) | ((i211111111111111111114 >> 6) & 3670016) | (i211111111111111111115 & 234881024), 644);
                                dVar3 = dVar1111111119;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            } else {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str11111111110 = str3;
                                boolean z111111111112 = z15;
                                androidx.compose.ui.d dVar11111111110 = dVar2;
                                int i211111111111111111116 = i14;
                                int i211111111111111111117 = i211111111111111111116 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111110, imageLoader, z111111111112, dVar11111111110)), title, str2, onClick, null, dVar11111111110, null, lVarV, (i211111111111111111116 & 14) | 3072 | (i211111111111111111116 & 112) | (i211111111111111111117 & 57344) | (i211111111111111111117 & 458752) | ((i211111111111111111116 >> 6) & 3670016) | (i211111111111111111117 & 234881024), 644);
                                dVar3 = dVar11111111110;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            }
                            w2VarX = lVarV.x();
                            if (w2VarX != null) {
                                w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                            }
                        }
                        i14 |= 805306368;
                        dVar2 = dVar;
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str11111111111 = str3;
                            boolean z111111111113 = z15;
                            androidx.compose.ui.d dVar11111111111 = dVar2;
                            int i211111111111111111118 = i14;
                            int i211111111111111111119 = i211111111111111111118 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111, imageLoader, z111111111113, dVar11111111111)), title, str2, onClick, null, dVar11111111111, null, lVarV, (i211111111111111111118 & 14) | 3072 | (i211111111111111111118 & 112) | (i211111111111111111119 & 57344) | (i211111111111111111119 & 458752) | ((i211111111111111111118 >> 6) & 3670016) | (i211111111111111111119 & 234881024), 644);
                            dVar3 = dVar11111111111;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str11111111112 = str3;
                            boolean z111111111114 = z15;
                            androidx.compose.ui.d dVar11111111112 = dVar2;
                            int i2111111111111111111110 = i14;
                            int i2111111111111111111111 = i2111111111111111111110 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111112, imageLoader, z111111111114, dVar11111111112)), title, str2, onClick, null, dVar11111111112, null, lVarV, (i2111111111111111111110 & 14) | 3072 | (i2111111111111111111110 & 112) | (i2111111111111111111111 & 57344) | (i2111111111111111111111 & 458752) | ((i2111111111111111111110 >> 6) & 3670016) | (i2111111111111111111111 & 234881024), 644);
                            dVar3 = dVar11111111112;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i21 = 100663296;
                    i14 |= i21;
                    i22 = i13 & 512;
                    if (i22 != 0) {
                        if ((i12 & 1879048192) == 0) {
                            dVar2 = dVar;
                            if (lVarV.n(dVar2)) {
                                i23 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i23 = 268435456;
                            }
                            i14 |= i23;
                        }
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str11111111113 = str3;
                            boolean z111111111115 = z15;
                            androidx.compose.ui.d dVar11111111113 = dVar2;
                            int i2111111111111111111112 = i14;
                            int i2111111111111111111113 = i2111111111111111111112 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111113, imageLoader, z111111111115, dVar11111111113)), title, str2, onClick, null, dVar11111111113, null, lVarV, (i2111111111111111111112 & 14) | 3072 | (i2111111111111111111112 & 112) | (i2111111111111111111113 & 57344) | (i2111111111111111111113 & 458752) | ((i2111111111111111111112 >> 6) & 3670016) | (i2111111111111111111113 & 234881024), 644);
                            dVar3 = dVar11111111113;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str11111111114 = str3;
                            boolean z111111111116 = z15;
                            androidx.compose.ui.d dVar11111111114 = dVar2;
                            int i2111111111111111111114 = i14;
                            int i2111111111111111111115 = i2111111111111111111114 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111114, imageLoader, z111111111116, dVar11111111114)), title, str2, onClick, null, dVar11111111114, null, lVarV, (i2111111111111111111114 & 14) | 3072 | (i2111111111111111111114 & 112) | (i2111111111111111111115 & 57344) | (i2111111111111111111115 & 458752) | ((i2111111111111111111114 >> 6) & 3670016) | (i2111111111111111111115 & 234881024), 644);
                            dVar3 = dVar11111111114;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i14 |= 805306368;
                    dVar2 = dVar;
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str11111111115 = str3;
                        boolean z111111111117 = z15;
                        androidx.compose.ui.d dVar11111111115 = dVar2;
                        int i2111111111111111111116 = i14;
                        int i2111111111111111111117 = i2111111111111111111116 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111115, imageLoader, z111111111117, dVar11111111115)), title, str2, onClick, null, dVar11111111115, null, lVarV, (i2111111111111111111116 & 14) | 3072 | (i2111111111111111111116 & 112) | (i2111111111111111111117 & 57344) | (i2111111111111111111117 & 458752) | ((i2111111111111111111116 >> 6) & 3670016) | (i2111111111111111111117 & 234881024), 644);
                        dVar3 = dVar11111111115;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str11111111116 = str3;
                        boolean z111111111118 = z15;
                        androidx.compose.ui.d dVar11111111116 = dVar2;
                        int i2111111111111111111118 = i14;
                        int i2111111111111111111119 = i2111111111111111111118 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111116, imageLoader, z111111111118, dVar11111111116)), title, str2, onClick, null, dVar11111111116, null, lVarV, (i2111111111111111111118 & 14) | 3072 | (i2111111111111111111118 & 112) | (i2111111111111111111119 & 57344) | (i2111111111111111111119 & 458752) | ((i2111111111111111111118 >> 6) & 3670016) | (i2111111111111111111119 & 234881024), 644);
                        dVar3 = dVar11111111116;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i14 |= 12582912;
                z15 = z13;
                if ((i13 & 256) != 0) {
                    if ((i12 & 234881024) == 0) {
                        if (lVarV.K(onClick)) {
                            i21 = 67108864;
                        } else {
                            i21 = 33554432;
                        }
                    }
                    i22 = i13 & 512;
                    if (i22 != 0) {
                        if ((i12 & 1879048192) == 0) {
                            dVar2 = dVar;
                            if (lVarV.n(dVar2)) {
                                i23 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i23 = 268435456;
                            }
                            i14 |= i23;
                        }
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str11111111117 = str3;
                            boolean z111111111119 = z15;
                            androidx.compose.ui.d dVar11111111117 = dVar2;
                            int i21111111111111111111110 = i14;
                            int i21111111111111111111111 = i21111111111111111111110 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111117, imageLoader, z111111111119, dVar11111111117)), title, str2, onClick, null, dVar11111111117, null, lVarV, (i21111111111111111111110 & 14) | 3072 | (i21111111111111111111110 & 112) | (i21111111111111111111111 & 57344) | (i21111111111111111111111 & 458752) | ((i21111111111111111111110 >> 6) & 3670016) | (i21111111111111111111111 & 234881024), 644);
                            dVar3 = dVar11111111117;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str11111111118 = str3;
                            boolean z1111111111110 = z15;
                            androidx.compose.ui.d dVar11111111118 = dVar2;
                            int i21111111111111111111112 = i14;
                            int i21111111111111111111113 = i21111111111111111111112 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111118, imageLoader, z1111111111110, dVar11111111118)), title, str2, onClick, null, dVar11111111118, null, lVarV, (i21111111111111111111112 & 14) | 3072 | (i21111111111111111111112 & 112) | (i21111111111111111111113 & 57344) | (i21111111111111111111113 & 458752) | ((i21111111111111111111112 >> 6) & 3670016) | (i21111111111111111111113 & 234881024), 644);
                            dVar3 = dVar11111111118;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i14 |= 805306368;
                    dVar2 = dVar;
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str11111111119 = str3;
                        boolean z1111111111111 = z15;
                        androidx.compose.ui.d dVar11111111119 = dVar2;
                        int i21111111111111111111114 = i14;
                        int i21111111111111111111115 = i21111111111111111111114 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111119, imageLoader, z1111111111111, dVar11111111119)), title, str2, onClick, null, dVar11111111119, null, lVarV, (i21111111111111111111114 & 14) | 3072 | (i21111111111111111111114 & 112) | (i21111111111111111111115 & 57344) | (i21111111111111111111115 & 458752) | ((i21111111111111111111114 >> 6) & 3670016) | (i21111111111111111111115 & 234881024), 644);
                        dVar3 = dVar11111111119;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str111111111110 = str3;
                        boolean z1111111111112 = z15;
                        androidx.compose.ui.d dVar111111111110 = dVar2;
                        int i21111111111111111111116 = i14;
                        int i21111111111111111111117 = i21111111111111111111116 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111110, imageLoader, z1111111111112, dVar111111111110)), title, str2, onClick, null, dVar111111111110, null, lVarV, (i21111111111111111111116 & 14) | 3072 | (i21111111111111111111116 & 112) | (i21111111111111111111117 & 57344) | (i21111111111111111111117 & 458752) | ((i21111111111111111111116 >> 6) & 3670016) | (i21111111111111111111117 & 234881024), 644);
                        dVar3 = dVar111111111110;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i21 = 100663296;
                i14 |= i21;
                i22 = i13 & 512;
                if (i22 != 0) {
                    if ((i12 & 1879048192) == 0) {
                        dVar2 = dVar;
                        if (lVarV.n(dVar2)) {
                            i23 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i23 = 268435456;
                        }
                        i14 |= i23;
                    }
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str111111111111 = str3;
                        boolean z1111111111113 = z15;
                        androidx.compose.ui.d dVar111111111111 = dVar2;
                        int i21111111111111111111118 = i14;
                        int i21111111111111111111119 = i21111111111111111111118 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111, imageLoader, z1111111111113, dVar111111111111)), title, str2, onClick, null, dVar111111111111, null, lVarV, (i21111111111111111111118 & 14) | 3072 | (i21111111111111111111118 & 112) | (i21111111111111111111119 & 57344) | (i21111111111111111111119 & 458752) | ((i21111111111111111111118 >> 6) & 3670016) | (i21111111111111111111119 & 234881024), 644);
                        dVar3 = dVar111111111111;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str111111111112 = str3;
                        boolean z1111111111114 = z15;
                        androidx.compose.ui.d dVar111111111112 = dVar2;
                        int i211111111111111111111110 = i14;
                        int i211111111111111111111111 = i211111111111111111111110 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111112, imageLoader, z1111111111114, dVar111111111112)), title, str2, onClick, null, dVar111111111112, null, lVarV, (i211111111111111111111110 & 14) | 3072 | (i211111111111111111111110 & 112) | (i211111111111111111111111 & 57344) | (i211111111111111111111111 & 458752) | ((i211111111111111111111110 >> 6) & 3670016) | (i211111111111111111111111 & 234881024), 644);
                        dVar3 = dVar111111111112;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i14 |= 805306368;
                dVar2 = dVar;
                if ((i14 & 1533916891) == 306783378) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str111111111113 = str3;
                    boolean z1111111111115 = z15;
                    androidx.compose.ui.d dVar111111111113 = dVar2;
                    int i211111111111111111111112 = i14;
                    int i211111111111111111111113 = i211111111111111111111112 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111113, imageLoader, z1111111111115, dVar111111111113)), title, str2, onClick, null, dVar111111111113, null, lVarV, (i211111111111111111111112 & 14) | 3072 | (i211111111111111111111112 & 112) | (i211111111111111111111113 & 57344) | (i211111111111111111111113 & 458752) | ((i211111111111111111111112 >> 6) & 3670016) | (i211111111111111111111113 & 234881024), 644);
                    dVar3 = dVar111111111113;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str111111111114 = str3;
                    boolean z1111111111116 = z15;
                    androidx.compose.ui.d dVar111111111114 = dVar2;
                    int i211111111111111111111114 = i14;
                    int i211111111111111111111115 = i211111111111111111111114 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111114, imageLoader, z1111111111116, dVar111111111114)), title, str2, onClick, null, dVar111111111114, null, lVarV, (i211111111111111111111114 & 14) | 3072 | (i211111111111111111111114 & 112) | (i211111111111111111111115 & 57344) | (i211111111111111111111115 & 458752) | ((i211111111111111111111114 >> 6) & 3670016) | (i211111111111111111111115 & 234881024), 644);
                    dVar3 = dVar111111111114;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                }
            }
            i14 |= 1572864;
            if ((i13 & 128) != 0) {
                if ((29360128 & i12) == 0) {
                    z15 = z13;
                    if (lVarV.p(z15)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i14 |= i19;
                }
                if ((i13 & 256) != 0) {
                    if ((i12 & 234881024) == 0) {
                        if (lVarV.K(onClick)) {
                            i21 = 67108864;
                        } else {
                            i21 = 33554432;
                        }
                    }
                    i22 = i13 & 512;
                    if (i22 != 0) {
                        if ((i12 & 1879048192) == 0) {
                            dVar2 = dVar;
                            if (lVarV.n(dVar2)) {
                                i23 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i23 = 268435456;
                            }
                            i14 |= i23;
                        }
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str111111111115 = str3;
                            boolean z1111111111117 = z15;
                            androidx.compose.ui.d dVar111111111115 = dVar2;
                            int i211111111111111111111116 = i14;
                            int i211111111111111111111117 = i211111111111111111111116 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111115, imageLoader, z1111111111117, dVar111111111115)), title, str2, onClick, null, dVar111111111115, null, lVarV, (i211111111111111111111116 & 14) | 3072 | (i211111111111111111111116 & 112) | (i211111111111111111111117 & 57344) | (i211111111111111111111117 & 458752) | ((i211111111111111111111116 >> 6) & 3670016) | (i211111111111111111111117 & 234881024), 644);
                            dVar3 = dVar111111111115;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str111111111116 = str3;
                            boolean z1111111111118 = z15;
                            androidx.compose.ui.d dVar111111111116 = dVar2;
                            int i211111111111111111111118 = i14;
                            int i211111111111111111111119 = i211111111111111111111118 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111116, imageLoader, z1111111111118, dVar111111111116)), title, str2, onClick, null, dVar111111111116, null, lVarV, (i211111111111111111111118 & 14) | 3072 | (i211111111111111111111118 & 112) | (i211111111111111111111119 & 57344) | (i211111111111111111111119 & 458752) | ((i211111111111111111111118 >> 6) & 3670016) | (i211111111111111111111119 & 234881024), 644);
                            dVar3 = dVar111111111116;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i14 |= 805306368;
                    dVar2 = dVar;
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str111111111117 = str3;
                        boolean z1111111111119 = z15;
                        androidx.compose.ui.d dVar111111111117 = dVar2;
                        int i2111111111111111111111110 = i14;
                        int i2111111111111111111111111 = i2111111111111111111111110 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111117, imageLoader, z1111111111119, dVar111111111117)), title, str2, onClick, null, dVar111111111117, null, lVarV, (i2111111111111111111111110 & 14) | 3072 | (i2111111111111111111111110 & 112) | (i2111111111111111111111111 & 57344) | (i2111111111111111111111111 & 458752) | ((i2111111111111111111111110 >> 6) & 3670016) | (i2111111111111111111111111 & 234881024), 644);
                        dVar3 = dVar111111111117;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str111111111118 = str3;
                        boolean z11111111111110 = z15;
                        androidx.compose.ui.d dVar111111111118 = dVar2;
                        int i2111111111111111111111112 = i14;
                        int i2111111111111111111111113 = i2111111111111111111111112 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111118, imageLoader, z11111111111110, dVar111111111118)), title, str2, onClick, null, dVar111111111118, null, lVarV, (i2111111111111111111111112 & 14) | 3072 | (i2111111111111111111111112 & 112) | (i2111111111111111111111113 & 57344) | (i2111111111111111111111113 & 458752) | ((i2111111111111111111111112 >> 6) & 3670016) | (i2111111111111111111111113 & 234881024), 644);
                        dVar3 = dVar111111111118;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i21 = 100663296;
                i14 |= i21;
                i22 = i13 & 512;
                if (i22 != 0) {
                    if ((i12 & 1879048192) == 0) {
                        dVar2 = dVar;
                        if (lVarV.n(dVar2)) {
                            i23 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i23 = 268435456;
                        }
                        i14 |= i23;
                    }
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str111111111119 = str3;
                        boolean z11111111111111 = z15;
                        androidx.compose.ui.d dVar111111111119 = dVar2;
                        int i2111111111111111111111114 = i14;
                        int i2111111111111111111111115 = i2111111111111111111111114 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111119, imageLoader, z11111111111111, dVar111111111119)), title, str2, onClick, null, dVar111111111119, null, lVarV, (i2111111111111111111111114 & 14) | 3072 | (i2111111111111111111111114 & 112) | (i2111111111111111111111115 & 57344) | (i2111111111111111111111115 & 458752) | ((i2111111111111111111111114 >> 6) & 3670016) | (i2111111111111111111111115 & 234881024), 644);
                        dVar3 = dVar111111111119;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str1111111111110 = str3;
                        boolean z11111111111112 = z15;
                        androidx.compose.ui.d dVar1111111111110 = dVar2;
                        int i2111111111111111111111116 = i14;
                        int i2111111111111111111111117 = i2111111111111111111111116 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111110, imageLoader, z11111111111112, dVar1111111111110)), title, str2, onClick, null, dVar1111111111110, null, lVarV, (i2111111111111111111111116 & 14) | 3072 | (i2111111111111111111111116 & 112) | (i2111111111111111111111117 & 57344) | (i2111111111111111111111117 & 458752) | ((i2111111111111111111111116 >> 6) & 3670016) | (i2111111111111111111111117 & 234881024), 644);
                        dVar3 = dVar1111111111110;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i14 |= 805306368;
                dVar2 = dVar;
                if ((i14 & 1533916891) == 306783378) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str1111111111111 = str3;
                    boolean z11111111111113 = z15;
                    androidx.compose.ui.d dVar1111111111111 = dVar2;
                    int i2111111111111111111111118 = i14;
                    int i2111111111111111111111119 = i2111111111111111111111118 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111, imageLoader, z11111111111113, dVar1111111111111)), title, str2, onClick, null, dVar1111111111111, null, lVarV, (i2111111111111111111111118 & 14) | 3072 | (i2111111111111111111111118 & 112) | (i2111111111111111111111119 & 57344) | (i2111111111111111111111119 & 458752) | ((i2111111111111111111111118 >> 6) & 3670016) | (i2111111111111111111111119 & 234881024), 644);
                    dVar3 = dVar1111111111111;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str1111111111112 = str3;
                    boolean z11111111111114 = z15;
                    androidx.compose.ui.d dVar1111111111112 = dVar2;
                    int i21111111111111111111111110 = i14;
                    int i21111111111111111111111111 = i21111111111111111111111110 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111112, imageLoader, z11111111111114, dVar1111111111112)), title, str2, onClick, null, dVar1111111111112, null, lVarV, (i21111111111111111111111110 & 14) | 3072 | (i21111111111111111111111110 & 112) | (i21111111111111111111111111 & 57344) | (i21111111111111111111111111 & 458752) | ((i21111111111111111111111110 >> 6) & 3670016) | (i21111111111111111111111111 & 234881024), 644);
                    dVar3 = dVar1111111111112;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                }
            }
            i14 |= 12582912;
            z15 = z13;
            if ((i13 & 256) != 0) {
                if ((i12 & 234881024) == 0) {
                    if (lVarV.K(onClick)) {
                        i21 = 67108864;
                    } else {
                        i21 = 33554432;
                    }
                }
                i22 = i13 & 512;
                if (i22 != 0) {
                    if ((i12 & 1879048192) == 0) {
                        dVar2 = dVar;
                        if (lVarV.n(dVar2)) {
                            i23 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i23 = 268435456;
                        }
                        i14 |= i23;
                    }
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str1111111111113 = str3;
                        boolean z11111111111115 = z15;
                        androidx.compose.ui.d dVar1111111111113 = dVar2;
                        int i21111111111111111111111112 = i14;
                        int i21111111111111111111111113 = i21111111111111111111111112 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111113, imageLoader, z11111111111115, dVar1111111111113)), title, str2, onClick, null, dVar1111111111113, null, lVarV, (i21111111111111111111111112 & 14) | 3072 | (i21111111111111111111111112 & 112) | (i21111111111111111111111113 & 57344) | (i21111111111111111111111113 & 458752) | ((i21111111111111111111111112 >> 6) & 3670016) | (i21111111111111111111111113 & 234881024), 644);
                        dVar3 = dVar1111111111113;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str1111111111114 = str3;
                        boolean z11111111111116 = z15;
                        androidx.compose.ui.d dVar1111111111114 = dVar2;
                        int i21111111111111111111111114 = i14;
                        int i21111111111111111111111115 = i21111111111111111111111114 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111114, imageLoader, z11111111111116, dVar1111111111114)), title, str2, onClick, null, dVar1111111111114, null, lVarV, (i21111111111111111111111114 & 14) | 3072 | (i21111111111111111111111114 & 112) | (i21111111111111111111111115 & 57344) | (i21111111111111111111111115 & 458752) | ((i21111111111111111111111114 >> 6) & 3670016) | (i21111111111111111111111115 & 234881024), 644);
                        dVar3 = dVar1111111111114;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i14 |= 805306368;
                dVar2 = dVar;
                if ((i14 & 1533916891) == 306783378) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str1111111111115 = str3;
                    boolean z11111111111117 = z15;
                    androidx.compose.ui.d dVar1111111111115 = dVar2;
                    int i21111111111111111111111116 = i14;
                    int i21111111111111111111111117 = i21111111111111111111111116 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111115, imageLoader, z11111111111117, dVar1111111111115)), title, str2, onClick, null, dVar1111111111115, null, lVarV, (i21111111111111111111111116 & 14) | 3072 | (i21111111111111111111111116 & 112) | (i21111111111111111111111117 & 57344) | (i21111111111111111111111117 & 458752) | ((i21111111111111111111111116 >> 6) & 3670016) | (i21111111111111111111111117 & 234881024), 644);
                    dVar3 = dVar1111111111115;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str1111111111116 = str3;
                    boolean z11111111111118 = z15;
                    androidx.compose.ui.d dVar1111111111116 = dVar2;
                    int i21111111111111111111111118 = i14;
                    int i21111111111111111111111119 = i21111111111111111111111118 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111116, imageLoader, z11111111111118, dVar1111111111116)), title, str2, onClick, null, dVar1111111111116, null, lVarV, (i21111111111111111111111118 & 14) | 3072 | (i21111111111111111111111118 & 112) | (i21111111111111111111111119 & 57344) | (i21111111111111111111111119 & 458752) | ((i21111111111111111111111118 >> 6) & 3670016) | (i21111111111111111111111119 & 234881024), 644);
                    dVar3 = dVar1111111111116;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                }
            }
            i21 = 100663296;
            i14 |= i21;
            i22 = i13 & 512;
            if (i22 != 0) {
                if ((i12 & 1879048192) == 0) {
                    dVar2 = dVar;
                    if (lVarV.n(dVar2)) {
                        i23 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i23 = 268435456;
                    }
                    i14 |= i23;
                }
                if ((i14 & 1533916891) == 306783378) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str1111111111117 = str3;
                    boolean z11111111111119 = z15;
                    androidx.compose.ui.d dVar1111111111117 = dVar2;
                    int i211111111111111111111111110 = i14;
                    int i211111111111111111111111111 = i211111111111111111111111110 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111117, imageLoader, z11111111111119, dVar1111111111117)), title, str2, onClick, null, dVar1111111111117, null, lVarV, (i211111111111111111111111110 & 14) | 3072 | (i211111111111111111111111110 & 112) | (i211111111111111111111111111 & 57344) | (i211111111111111111111111111 & 458752) | ((i211111111111111111111111110 >> 6) & 3670016) | (i211111111111111111111111111 & 234881024), 644);
                    dVar3 = dVar1111111111117;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str1111111111118 = str3;
                    boolean z111111111111110 = z15;
                    androidx.compose.ui.d dVar1111111111118 = dVar2;
                    int i211111111111111111111111112 = i14;
                    int i211111111111111111111111113 = i211111111111111111111111112 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111118, imageLoader, z111111111111110, dVar1111111111118)), title, str2, onClick, null, dVar1111111111118, null, lVarV, (i211111111111111111111111112 & 14) | 3072 | (i211111111111111111111111112 & 112) | (i211111111111111111111111113 & 57344) | (i211111111111111111111111113 & 458752) | ((i211111111111111111111111112 >> 6) & 3670016) | (i211111111111111111111111113 & 234881024), 644);
                    dVar3 = dVar1111111111118;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                }
            }
            i14 |= 805306368;
            dVar2 = dVar;
            if ((i14 & 1533916891) == 306783378) {
                if (i22 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                }
                String str1111111111119 = str3;
                boolean z111111111111111 = z15;
                androidx.compose.ui.d dVar1111111111119 = dVar2;
                int i211111111111111111111111114 = i14;
                int i211111111111111111111111115 = i211111111111111111111111114 >> 3;
                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111119, imageLoader, z111111111111111, dVar1111111111119)), title, str2, onClick, null, dVar1111111111119, null, lVarV, (i211111111111111111111111114 & 14) | 3072 | (i211111111111111111111111114 & 112) | (i211111111111111111111111115 & 57344) | (i211111111111111111111111115 & 458752) | ((i211111111111111111111111114 >> 6) & 3670016) | (i211111111111111111111111115 & 234881024), 644);
                dVar3 = dVar1111111111119;
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            } else {
                if (i22 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                }
                String str11111111111110 = str3;
                boolean z111111111111112 = z15;
                androidx.compose.ui.d dVar11111111111110 = dVar2;
                int i211111111111111111111111116 = i14;
                int i211111111111111111111111117 = i211111111111111111111111116 >> 3;
                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111110, imageLoader, z111111111111112, dVar11111111111110)), title, str2, onClick, null, dVar11111111111110, null, lVarV, (i211111111111111111111111116 & 14) | 3072 | (i211111111111111111111111116 & 112) | (i211111111111111111111111117 & 57344) | (i211111111111111111111111117 & 458752) | ((i211111111111111111111111116 >> 6) & 3670016) | (i211111111111111111111111117 & 234881024), 644);
                dVar3 = dVar11111111111110;
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
            }
        }
        i14 |= KyberEngine.KyberPolyBytes;
        if ((i13 & 8) != 0) {
            if ((i12 & 7168) == 0) {
                str3 = str;
                if (lVarV.n(str3)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i14 |= i15;
            }
            if ((i13 & 16) != 0) {
                i14 |= 24576;
            } else if ((i12 & 57344) == 0) {
                if (lVarV.n(imageLoader)) {
                    i16 = 16384;
                } else {
                    i16 = PKIFailureInfo.certRevoked;
                }
                i14 |= i16;
            }
            if ((i13 & 32) != 0) {
                if ((i12 & 458752) == 0) {
                    if (lVarV.n(title)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                if ((i13 & 64) != 0) {
                    if ((i12 & 3670016) == 0) {
                        if (lVarV.n(str2)) {
                            i18 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i18 = PKIFailureInfo.signerNotTrusted;
                        }
                        i14 |= i18;
                    }
                    if ((i13 & 128) != 0) {
                        if ((29360128 & i12) == 0) {
                            z15 = z13;
                            if (lVarV.p(z15)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                            i14 |= i19;
                        }
                        if ((i13 & 256) != 0) {
                            if ((i12 & 234881024) == 0) {
                                if (lVarV.K(onClick)) {
                                    i21 = 67108864;
                                } else {
                                    i21 = 33554432;
                                }
                            }
                            i22 = i13 & 512;
                            if (i22 != 0) {
                                if ((i12 & 1879048192) == 0) {
                                    dVar2 = dVar;
                                    if (lVarV.n(dVar2)) {
                                        i23 = PKIFailureInfo.duplicateCertReq;
                                    } else {
                                        i23 = 268435456;
                                    }
                                    i14 |= i23;
                                }
                                if ((i14 & 1533916891) == 306783378) {
                                    if (i22 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (p020r2.o.J()) {
                                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                    }
                                    String str11111111111111 = str3;
                                    boolean z111111111111113 = z15;
                                    androidx.compose.ui.d dVar11111111111111 = dVar2;
                                    int i211111111111111111111111118 = i14;
                                    int i211111111111111111111111119 = i211111111111111111111111118 >> 3;
                                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111, imageLoader, z111111111111113, dVar11111111111111)), title, str2, onClick, null, dVar11111111111111, null, lVarV, (i211111111111111111111111118 & 14) | 3072 | (i211111111111111111111111118 & 112) | (i211111111111111111111111119 & 57344) | (i211111111111111111111111119 & 458752) | ((i211111111111111111111111118 >> 6) & 3670016) | (i211111111111111111111111119 & 234881024), 644);
                                    dVar3 = dVar11111111111111;
                                    if (p020r2.o.J()) {
                                        p020r2.o.R();
                                    }
                                } else {
                                    if (i22 != 0) {
                                        dVar2 = androidx.compose.ui.d.INSTANCE;
                                    }
                                    if (p020r2.o.J()) {
                                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                    }
                                    String str11111111111112 = str3;
                                    boolean z111111111111114 = z15;
                                    androidx.compose.ui.d dVar11111111111112 = dVar2;
                                    int i2111111111111111111111111110 = i14;
                                    int i2111111111111111111111111111 = i2111111111111111111111111110 >> 3;
                                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111112, imageLoader, z111111111111114, dVar11111111111112)), title, str2, onClick, null, dVar11111111111112, null, lVarV, (i2111111111111111111111111110 & 14) | 3072 | (i2111111111111111111111111110 & 112) | (i2111111111111111111111111111 & 57344) | (i2111111111111111111111111111 & 458752) | ((i2111111111111111111111111110 >> 6) & 3670016) | (i2111111111111111111111111111 & 234881024), 644);
                                    dVar3 = dVar11111111111112;
                                    if (p020r2.o.J()) {
                                        p020r2.o.R();
                                    }
                                }
                                w2VarX = lVarV.x();
                                if (w2VarX != null) {
                                    w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                                }
                            }
                            i14 |= 805306368;
                            dVar2 = dVar;
                            if ((i14 & 1533916891) == 306783378) {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str11111111111113 = str3;
                                boolean z111111111111115 = z15;
                                androidx.compose.ui.d dVar11111111111113 = dVar2;
                                int i2111111111111111111111111112 = i14;
                                int i2111111111111111111111111113 = i2111111111111111111111111112 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111113, imageLoader, z111111111111115, dVar11111111111113)), title, str2, onClick, null, dVar11111111111113, null, lVarV, (i2111111111111111111111111112 & 14) | 3072 | (i2111111111111111111111111112 & 112) | (i2111111111111111111111111113 & 57344) | (i2111111111111111111111111113 & 458752) | ((i2111111111111111111111111112 >> 6) & 3670016) | (i2111111111111111111111111113 & 234881024), 644);
                                dVar3 = dVar11111111111113;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            } else {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str11111111111114 = str3;
                                boolean z111111111111116 = z15;
                                androidx.compose.ui.d dVar11111111111114 = dVar2;
                                int i2111111111111111111111111114 = i14;
                                int i2111111111111111111111111115 = i2111111111111111111111111114 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111114, imageLoader, z111111111111116, dVar11111111111114)), title, str2, onClick, null, dVar11111111111114, null, lVarV, (i2111111111111111111111111114 & 14) | 3072 | (i2111111111111111111111111114 & 112) | (i2111111111111111111111111115 & 57344) | (i2111111111111111111111111115 & 458752) | ((i2111111111111111111111111114 >> 6) & 3670016) | (i2111111111111111111111111115 & 234881024), 644);
                                dVar3 = dVar11111111111114;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            }
                            w2VarX = lVarV.x();
                            if (w2VarX != null) {
                                w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                            }
                        }
                        i21 = 100663296;
                        i14 |= i21;
                        i22 = i13 & 512;
                        if (i22 != 0) {
                            if ((i12 & 1879048192) == 0) {
                                dVar2 = dVar;
                                if (lVarV.n(dVar2)) {
                                    i23 = PKIFailureInfo.duplicateCertReq;
                                } else {
                                    i23 = 268435456;
                                }
                                i14 |= i23;
                            }
                            if ((i14 & 1533916891) == 306783378) {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str11111111111115 = str3;
                                boolean z111111111111117 = z15;
                                androidx.compose.ui.d dVar11111111111115 = dVar2;
                                int i2111111111111111111111111116 = i14;
                                int i2111111111111111111111111117 = i2111111111111111111111111116 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111115, imageLoader, z111111111111117, dVar11111111111115)), title, str2, onClick, null, dVar11111111111115, null, lVarV, (i2111111111111111111111111116 & 14) | 3072 | (i2111111111111111111111111116 & 112) | (i2111111111111111111111111117 & 57344) | (i2111111111111111111111111117 & 458752) | ((i2111111111111111111111111116 >> 6) & 3670016) | (i2111111111111111111111111117 & 234881024), 644);
                                dVar3 = dVar11111111111115;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            } else {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str11111111111116 = str3;
                                boolean z111111111111118 = z15;
                                androidx.compose.ui.d dVar11111111111116 = dVar2;
                                int i2111111111111111111111111118 = i14;
                                int i2111111111111111111111111119 = i2111111111111111111111111118 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111116, imageLoader, z111111111111118, dVar11111111111116)), title, str2, onClick, null, dVar11111111111116, null, lVarV, (i2111111111111111111111111118 & 14) | 3072 | (i2111111111111111111111111118 & 112) | (i2111111111111111111111111119 & 57344) | (i2111111111111111111111111119 & 458752) | ((i2111111111111111111111111118 >> 6) & 3670016) | (i2111111111111111111111111119 & 234881024), 644);
                                dVar3 = dVar11111111111116;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            }
                            w2VarX = lVarV.x();
                            if (w2VarX != null) {
                                w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                            }
                        }
                        i14 |= 805306368;
                        dVar2 = dVar;
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str11111111111117 = str3;
                            boolean z111111111111119 = z15;
                            androidx.compose.ui.d dVar11111111111117 = dVar2;
                            int i21111111111111111111111111110 = i14;
                            int i21111111111111111111111111111 = i21111111111111111111111111110 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111117, imageLoader, z111111111111119, dVar11111111111117)), title, str2, onClick, null, dVar11111111111117, null, lVarV, (i21111111111111111111111111110 & 14) | 3072 | (i21111111111111111111111111110 & 112) | (i21111111111111111111111111111 & 57344) | (i21111111111111111111111111111 & 458752) | ((i21111111111111111111111111110 >> 6) & 3670016) | (i21111111111111111111111111111 & 234881024), 644);
                            dVar3 = dVar11111111111117;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str11111111111118 = str3;
                            boolean z1111111111111110 = z15;
                            androidx.compose.ui.d dVar11111111111118 = dVar2;
                            int i21111111111111111111111111112 = i14;
                            int i21111111111111111111111111113 = i21111111111111111111111111112 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111118, imageLoader, z1111111111111110, dVar11111111111118)), title, str2, onClick, null, dVar11111111111118, null, lVarV, (i21111111111111111111111111112 & 14) | 3072 | (i21111111111111111111111111112 & 112) | (i21111111111111111111111111113 & 57344) | (i21111111111111111111111111113 & 458752) | ((i21111111111111111111111111112 >> 6) & 3670016) | (i21111111111111111111111111113 & 234881024), 644);
                            dVar3 = dVar11111111111118;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i14 |= 12582912;
                    z15 = z13;
                    if ((i13 & 256) != 0) {
                        if ((i12 & 234881024) == 0) {
                            if (lVarV.K(onClick)) {
                                i21 = 67108864;
                            } else {
                                i21 = 33554432;
                            }
                        }
                        i22 = i13 & 512;
                        if (i22 != 0) {
                            if ((i12 & 1879048192) == 0) {
                                dVar2 = dVar;
                                if (lVarV.n(dVar2)) {
                                    i23 = PKIFailureInfo.duplicateCertReq;
                                } else {
                                    i23 = 268435456;
                                }
                                i14 |= i23;
                            }
                            if ((i14 & 1533916891) == 306783378) {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str11111111111119 = str3;
                                boolean z1111111111111111 = z15;
                                androidx.compose.ui.d dVar11111111111119 = dVar2;
                                int i21111111111111111111111111114 = i14;
                                int i21111111111111111111111111115 = i21111111111111111111111111114 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111119, imageLoader, z1111111111111111, dVar11111111111119)), title, str2, onClick, null, dVar11111111111119, null, lVarV, (i21111111111111111111111111114 & 14) | 3072 | (i21111111111111111111111111114 & 112) | (i21111111111111111111111111115 & 57344) | (i21111111111111111111111111115 & 458752) | ((i21111111111111111111111111114 >> 6) & 3670016) | (i21111111111111111111111111115 & 234881024), 644);
                                dVar3 = dVar11111111111119;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            } else {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str111111111111110 = str3;
                                boolean z1111111111111112 = z15;
                                androidx.compose.ui.d dVar111111111111110 = dVar2;
                                int i21111111111111111111111111116 = i14;
                                int i21111111111111111111111111117 = i21111111111111111111111111116 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111110, imageLoader, z1111111111111112, dVar111111111111110)), title, str2, onClick, null, dVar111111111111110, null, lVarV, (i21111111111111111111111111116 & 14) | 3072 | (i21111111111111111111111111116 & 112) | (i21111111111111111111111111117 & 57344) | (i21111111111111111111111111117 & 458752) | ((i21111111111111111111111111116 >> 6) & 3670016) | (i21111111111111111111111111117 & 234881024), 644);
                                dVar3 = dVar111111111111110;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            }
                            w2VarX = lVarV.x();
                            if (w2VarX != null) {
                                w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                            }
                        }
                        i14 |= 805306368;
                        dVar2 = dVar;
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str111111111111111 = str3;
                            boolean z1111111111111113 = z15;
                            androidx.compose.ui.d dVar111111111111111 = dVar2;
                            int i21111111111111111111111111118 = i14;
                            int i21111111111111111111111111119 = i21111111111111111111111111118 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111111, imageLoader, z1111111111111113, dVar111111111111111)), title, str2, onClick, null, dVar111111111111111, null, lVarV, (i21111111111111111111111111118 & 14) | 3072 | (i21111111111111111111111111118 & 112) | (i21111111111111111111111111119 & 57344) | (i21111111111111111111111111119 & 458752) | ((i21111111111111111111111111118 >> 6) & 3670016) | (i21111111111111111111111111119 & 234881024), 644);
                            dVar3 = dVar111111111111111;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str111111111111112 = str3;
                            boolean z1111111111111114 = z15;
                            androidx.compose.ui.d dVar111111111111112 = dVar2;
                            int i211111111111111111111111111110 = i14;
                            int i211111111111111111111111111111 = i211111111111111111111111111110 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111112, imageLoader, z1111111111111114, dVar111111111111112)), title, str2, onClick, null, dVar111111111111112, null, lVarV, (i211111111111111111111111111110 & 14) | 3072 | (i211111111111111111111111111110 & 112) | (i211111111111111111111111111111 & 57344) | (i211111111111111111111111111111 & 458752) | ((i211111111111111111111111111110 >> 6) & 3670016) | (i211111111111111111111111111111 & 234881024), 644);
                            dVar3 = dVar111111111111112;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i21 = 100663296;
                    i14 |= i21;
                    i22 = i13 & 512;
                    if (i22 != 0) {
                        if ((i12 & 1879048192) == 0) {
                            dVar2 = dVar;
                            if (lVarV.n(dVar2)) {
                                i23 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i23 = 268435456;
                            }
                            i14 |= i23;
                        }
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str111111111111113 = str3;
                            boolean z1111111111111115 = z15;
                            androidx.compose.ui.d dVar111111111111113 = dVar2;
                            int i211111111111111111111111111112 = i14;
                            int i211111111111111111111111111113 = i211111111111111111111111111112 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111113, imageLoader, z1111111111111115, dVar111111111111113)), title, str2, onClick, null, dVar111111111111113, null, lVarV, (i211111111111111111111111111112 & 14) | 3072 | (i211111111111111111111111111112 & 112) | (i211111111111111111111111111113 & 57344) | (i211111111111111111111111111113 & 458752) | ((i211111111111111111111111111112 >> 6) & 3670016) | (i211111111111111111111111111113 & 234881024), 644);
                            dVar3 = dVar111111111111113;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str111111111111114 = str3;
                            boolean z1111111111111116 = z15;
                            androidx.compose.ui.d dVar111111111111114 = dVar2;
                            int i211111111111111111111111111114 = i14;
                            int i211111111111111111111111111115 = i211111111111111111111111111114 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111114, imageLoader, z1111111111111116, dVar111111111111114)), title, str2, onClick, null, dVar111111111111114, null, lVarV, (i211111111111111111111111111114 & 14) | 3072 | (i211111111111111111111111111114 & 112) | (i211111111111111111111111111115 & 57344) | (i211111111111111111111111111115 & 458752) | ((i211111111111111111111111111114 >> 6) & 3670016) | (i211111111111111111111111111115 & 234881024), 644);
                            dVar3 = dVar111111111111114;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i14 |= 805306368;
                    dVar2 = dVar;
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str111111111111115 = str3;
                        boolean z1111111111111117 = z15;
                        androidx.compose.ui.d dVar111111111111115 = dVar2;
                        int i211111111111111111111111111116 = i14;
                        int i211111111111111111111111111117 = i211111111111111111111111111116 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111115, imageLoader, z1111111111111117, dVar111111111111115)), title, str2, onClick, null, dVar111111111111115, null, lVarV, (i211111111111111111111111111116 & 14) | 3072 | (i211111111111111111111111111116 & 112) | (i211111111111111111111111111117 & 57344) | (i211111111111111111111111111117 & 458752) | ((i211111111111111111111111111116 >> 6) & 3670016) | (i211111111111111111111111111117 & 234881024), 644);
                        dVar3 = dVar111111111111115;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str111111111111116 = str3;
                        boolean z1111111111111118 = z15;
                        androidx.compose.ui.d dVar111111111111116 = dVar2;
                        int i211111111111111111111111111118 = i14;
                        int i211111111111111111111111111119 = i211111111111111111111111111118 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111116, imageLoader, z1111111111111118, dVar111111111111116)), title, str2, onClick, null, dVar111111111111116, null, lVarV, (i211111111111111111111111111118 & 14) | 3072 | (i211111111111111111111111111118 & 112) | (i211111111111111111111111111119 & 57344) | (i211111111111111111111111111119 & 458752) | ((i211111111111111111111111111118 >> 6) & 3670016) | (i211111111111111111111111111119 & 234881024), 644);
                        dVar3 = dVar111111111111116;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i14 |= 1572864;
                if ((i13 & 128) != 0) {
                    if ((29360128 & i12) == 0) {
                        z15 = z13;
                        if (lVarV.p(z15)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i14 |= i19;
                    }
                    if ((i13 & 256) != 0) {
                        if ((i12 & 234881024) == 0) {
                            if (lVarV.K(onClick)) {
                                i21 = 67108864;
                            } else {
                                i21 = 33554432;
                            }
                        }
                        i22 = i13 & 512;
                        if (i22 != 0) {
                            if ((i12 & 1879048192) == 0) {
                                dVar2 = dVar;
                                if (lVarV.n(dVar2)) {
                                    i23 = PKIFailureInfo.duplicateCertReq;
                                } else {
                                    i23 = 268435456;
                                }
                                i14 |= i23;
                            }
                            if ((i14 & 1533916891) == 306783378) {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str111111111111117 = str3;
                                boolean z1111111111111119 = z15;
                                androidx.compose.ui.d dVar111111111111117 = dVar2;
                                int i2111111111111111111111111111110 = i14;
                                int i2111111111111111111111111111111 = i2111111111111111111111111111110 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111117, imageLoader, z1111111111111119, dVar111111111111117)), title, str2, onClick, null, dVar111111111111117, null, lVarV, (i2111111111111111111111111111110 & 14) | 3072 | (i2111111111111111111111111111110 & 112) | (i2111111111111111111111111111111 & 57344) | (i2111111111111111111111111111111 & 458752) | ((i2111111111111111111111111111110 >> 6) & 3670016) | (i2111111111111111111111111111111 & 234881024), 644);
                                dVar3 = dVar111111111111117;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            } else {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str111111111111118 = str3;
                                boolean z11111111111111110 = z15;
                                androidx.compose.ui.d dVar111111111111118 = dVar2;
                                int i2111111111111111111111111111112 = i14;
                                int i2111111111111111111111111111113 = i2111111111111111111111111111112 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111118, imageLoader, z11111111111111110, dVar111111111111118)), title, str2, onClick, null, dVar111111111111118, null, lVarV, (i2111111111111111111111111111112 & 14) | 3072 | (i2111111111111111111111111111112 & 112) | (i2111111111111111111111111111113 & 57344) | (i2111111111111111111111111111113 & 458752) | ((i2111111111111111111111111111112 >> 6) & 3670016) | (i2111111111111111111111111111113 & 234881024), 644);
                                dVar3 = dVar111111111111118;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            }
                            w2VarX = lVarV.x();
                            if (w2VarX != null) {
                                w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                            }
                        }
                        i14 |= 805306368;
                        dVar2 = dVar;
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str111111111111119 = str3;
                            boolean z11111111111111111 = z15;
                            androidx.compose.ui.d dVar111111111111119 = dVar2;
                            int i2111111111111111111111111111114 = i14;
                            int i2111111111111111111111111111115 = i2111111111111111111111111111114 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111119, imageLoader, z11111111111111111, dVar111111111111119)), title, str2, onClick, null, dVar111111111111119, null, lVarV, (i2111111111111111111111111111114 & 14) | 3072 | (i2111111111111111111111111111114 & 112) | (i2111111111111111111111111111115 & 57344) | (i2111111111111111111111111111115 & 458752) | ((i2111111111111111111111111111114 >> 6) & 3670016) | (i2111111111111111111111111111115 & 234881024), 644);
                            dVar3 = dVar111111111111119;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str1111111111111110 = str3;
                            boolean z11111111111111112 = z15;
                            androidx.compose.ui.d dVar1111111111111110 = dVar2;
                            int i2111111111111111111111111111116 = i14;
                            int i2111111111111111111111111111117 = i2111111111111111111111111111116 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111110, imageLoader, z11111111111111112, dVar1111111111111110)), title, str2, onClick, null, dVar1111111111111110, null, lVarV, (i2111111111111111111111111111116 & 14) | 3072 | (i2111111111111111111111111111116 & 112) | (i2111111111111111111111111111117 & 57344) | (i2111111111111111111111111111117 & 458752) | ((i2111111111111111111111111111116 >> 6) & 3670016) | (i2111111111111111111111111111117 & 234881024), 644);
                            dVar3 = dVar1111111111111110;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i21 = 100663296;
                    i14 |= i21;
                    i22 = i13 & 512;
                    if (i22 != 0) {
                        if ((i12 & 1879048192) == 0) {
                            dVar2 = dVar;
                            if (lVarV.n(dVar2)) {
                                i23 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i23 = 268435456;
                            }
                            i14 |= i23;
                        }
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str1111111111111111 = str3;
                            boolean z11111111111111113 = z15;
                            androidx.compose.ui.d dVar1111111111111111 = dVar2;
                            int i2111111111111111111111111111118 = i14;
                            int i2111111111111111111111111111119 = i2111111111111111111111111111118 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111111, imageLoader, z11111111111111113, dVar1111111111111111)), title, str2, onClick, null, dVar1111111111111111, null, lVarV, (i2111111111111111111111111111118 & 14) | 3072 | (i2111111111111111111111111111118 & 112) | (i2111111111111111111111111111119 & 57344) | (i2111111111111111111111111111119 & 458752) | ((i2111111111111111111111111111118 >> 6) & 3670016) | (i2111111111111111111111111111119 & 234881024), 644);
                            dVar3 = dVar1111111111111111;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str1111111111111112 = str3;
                            boolean z11111111111111114 = z15;
                            androidx.compose.ui.d dVar1111111111111112 = dVar2;
                            int i21111111111111111111111111111110 = i14;
                            int i21111111111111111111111111111111 = i21111111111111111111111111111110 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111112, imageLoader, z11111111111111114, dVar1111111111111112)), title, str2, onClick, null, dVar1111111111111112, null, lVarV, (i21111111111111111111111111111110 & 14) | 3072 | (i21111111111111111111111111111110 & 112) | (i21111111111111111111111111111111 & 57344) | (i21111111111111111111111111111111 & 458752) | ((i21111111111111111111111111111110 >> 6) & 3670016) | (i21111111111111111111111111111111 & 234881024), 644);
                            dVar3 = dVar1111111111111112;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i14 |= 805306368;
                    dVar2 = dVar;
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str1111111111111113 = str3;
                        boolean z11111111111111115 = z15;
                        androidx.compose.ui.d dVar1111111111111113 = dVar2;
                        int i21111111111111111111111111111112 = i14;
                        int i21111111111111111111111111111113 = i21111111111111111111111111111112 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111113, imageLoader, z11111111111111115, dVar1111111111111113)), title, str2, onClick, null, dVar1111111111111113, null, lVarV, (i21111111111111111111111111111112 & 14) | 3072 | (i21111111111111111111111111111112 & 112) | (i21111111111111111111111111111113 & 57344) | (i21111111111111111111111111111113 & 458752) | ((i21111111111111111111111111111112 >> 6) & 3670016) | (i21111111111111111111111111111113 & 234881024), 644);
                        dVar3 = dVar1111111111111113;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str1111111111111114 = str3;
                        boolean z11111111111111116 = z15;
                        androidx.compose.ui.d dVar1111111111111114 = dVar2;
                        int i21111111111111111111111111111114 = i14;
                        int i21111111111111111111111111111115 = i21111111111111111111111111111114 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111114, imageLoader, z11111111111111116, dVar1111111111111114)), title, str2, onClick, null, dVar1111111111111114, null, lVarV, (i21111111111111111111111111111114 & 14) | 3072 | (i21111111111111111111111111111114 & 112) | (i21111111111111111111111111111115 & 57344) | (i21111111111111111111111111111115 & 458752) | ((i21111111111111111111111111111114 >> 6) & 3670016) | (i21111111111111111111111111111115 & 234881024), 644);
                        dVar3 = dVar1111111111111114;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i14 |= 12582912;
                z15 = z13;
                if ((i13 & 256) != 0) {
                    if ((i12 & 234881024) == 0) {
                        if (lVarV.K(onClick)) {
                            i21 = 67108864;
                        } else {
                            i21 = 33554432;
                        }
                    }
                    i22 = i13 & 512;
                    if (i22 != 0) {
                        if ((i12 & 1879048192) == 0) {
                            dVar2 = dVar;
                            if (lVarV.n(dVar2)) {
                                i23 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i23 = 268435456;
                            }
                            i14 |= i23;
                        }
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str1111111111111115 = str3;
                            boolean z11111111111111117 = z15;
                            androidx.compose.ui.d dVar1111111111111115 = dVar2;
                            int i21111111111111111111111111111116 = i14;
                            int i21111111111111111111111111111117 = i21111111111111111111111111111116 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111115, imageLoader, z11111111111111117, dVar1111111111111115)), title, str2, onClick, null, dVar1111111111111115, null, lVarV, (i21111111111111111111111111111116 & 14) | 3072 | (i21111111111111111111111111111116 & 112) | (i21111111111111111111111111111117 & 57344) | (i21111111111111111111111111111117 & 458752) | ((i21111111111111111111111111111116 >> 6) & 3670016) | (i21111111111111111111111111111117 & 234881024), 644);
                            dVar3 = dVar1111111111111115;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str1111111111111116 = str3;
                            boolean z11111111111111118 = z15;
                            androidx.compose.ui.d dVar1111111111111116 = dVar2;
                            int i21111111111111111111111111111118 = i14;
                            int i21111111111111111111111111111119 = i21111111111111111111111111111118 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111116, imageLoader, z11111111111111118, dVar1111111111111116)), title, str2, onClick, null, dVar1111111111111116, null, lVarV, (i21111111111111111111111111111118 & 14) | 3072 | (i21111111111111111111111111111118 & 112) | (i21111111111111111111111111111119 & 57344) | (i21111111111111111111111111111119 & 458752) | ((i21111111111111111111111111111118 >> 6) & 3670016) | (i21111111111111111111111111111119 & 234881024), 644);
                            dVar3 = dVar1111111111111116;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i14 |= 805306368;
                    dVar2 = dVar;
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str1111111111111117 = str3;
                        boolean z11111111111111119 = z15;
                        androidx.compose.ui.d dVar1111111111111117 = dVar2;
                        int i211111111111111111111111111111110 = i14;
                        int i211111111111111111111111111111111 = i211111111111111111111111111111110 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111117, imageLoader, z11111111111111119, dVar1111111111111117)), title, str2, onClick, null, dVar1111111111111117, null, lVarV, (i211111111111111111111111111111110 & 14) | 3072 | (i211111111111111111111111111111110 & 112) | (i211111111111111111111111111111111 & 57344) | (i211111111111111111111111111111111 & 458752) | ((i211111111111111111111111111111110 >> 6) & 3670016) | (i211111111111111111111111111111111 & 234881024), 644);
                        dVar3 = dVar1111111111111117;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str1111111111111118 = str3;
                        boolean z111111111111111110 = z15;
                        androidx.compose.ui.d dVar1111111111111118 = dVar2;
                        int i211111111111111111111111111111112 = i14;
                        int i211111111111111111111111111111113 = i211111111111111111111111111111112 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111118, imageLoader, z111111111111111110, dVar1111111111111118)), title, str2, onClick, null, dVar1111111111111118, null, lVarV, (i211111111111111111111111111111112 & 14) | 3072 | (i211111111111111111111111111111112 & 112) | (i211111111111111111111111111111113 & 57344) | (i211111111111111111111111111111113 & 458752) | ((i211111111111111111111111111111112 >> 6) & 3670016) | (i211111111111111111111111111111113 & 234881024), 644);
                        dVar3 = dVar1111111111111118;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i21 = 100663296;
                i14 |= i21;
                i22 = i13 & 512;
                if (i22 != 0) {
                    if ((i12 & 1879048192) == 0) {
                        dVar2 = dVar;
                        if (lVarV.n(dVar2)) {
                            i23 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i23 = 268435456;
                        }
                        i14 |= i23;
                    }
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str1111111111111119 = str3;
                        boolean z111111111111111111 = z15;
                        androidx.compose.ui.d dVar1111111111111119 = dVar2;
                        int i211111111111111111111111111111114 = i14;
                        int i211111111111111111111111111111115 = i211111111111111111111111111111114 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111119, imageLoader, z111111111111111111, dVar1111111111111119)), title, str2, onClick, null, dVar1111111111111119, null, lVarV, (i211111111111111111111111111111114 & 14) | 3072 | (i211111111111111111111111111111114 & 112) | (i211111111111111111111111111111115 & 57344) | (i211111111111111111111111111111115 & 458752) | ((i211111111111111111111111111111114 >> 6) & 3670016) | (i211111111111111111111111111111115 & 234881024), 644);
                        dVar3 = dVar1111111111111119;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str11111111111111110 = str3;
                        boolean z111111111111111112 = z15;
                        androidx.compose.ui.d dVar11111111111111110 = dVar2;
                        int i211111111111111111111111111111116 = i14;
                        int i211111111111111111111111111111117 = i211111111111111111111111111111116 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111110, imageLoader, z111111111111111112, dVar11111111111111110)), title, str2, onClick, null, dVar11111111111111110, null, lVarV, (i211111111111111111111111111111116 & 14) | 3072 | (i211111111111111111111111111111116 & 112) | (i211111111111111111111111111111117 & 57344) | (i211111111111111111111111111111117 & 458752) | ((i211111111111111111111111111111116 >> 6) & 3670016) | (i211111111111111111111111111111117 & 234881024), 644);
                        dVar3 = dVar11111111111111110;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i14 |= 805306368;
                dVar2 = dVar;
                if ((i14 & 1533916891) == 306783378) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str11111111111111111 = str3;
                    boolean z111111111111111113 = z15;
                    androidx.compose.ui.d dVar11111111111111111 = dVar2;
                    int i211111111111111111111111111111118 = i14;
                    int i211111111111111111111111111111119 = i211111111111111111111111111111118 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111111, imageLoader, z111111111111111113, dVar11111111111111111)), title, str2, onClick, null, dVar11111111111111111, null, lVarV, (i211111111111111111111111111111118 & 14) | 3072 | (i211111111111111111111111111111118 & 112) | (i211111111111111111111111111111119 & 57344) | (i211111111111111111111111111111119 & 458752) | ((i211111111111111111111111111111118 >> 6) & 3670016) | (i211111111111111111111111111111119 & 234881024), 644);
                    dVar3 = dVar11111111111111111;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str11111111111111112 = str3;
                    boolean z111111111111111114 = z15;
                    androidx.compose.ui.d dVar11111111111111112 = dVar2;
                    int i2111111111111111111111111111111110 = i14;
                    int i2111111111111111111111111111111111 = i2111111111111111111111111111111110 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111112, imageLoader, z111111111111111114, dVar11111111111111112)), title, str2, onClick, null, dVar11111111111111112, null, lVarV, (i2111111111111111111111111111111110 & 14) | 3072 | (i2111111111111111111111111111111110 & 112) | (i2111111111111111111111111111111111 & 57344) | (i2111111111111111111111111111111111 & 458752) | ((i2111111111111111111111111111111110 >> 6) & 3670016) | (i2111111111111111111111111111111111 & 234881024), 644);
                    dVar3 = dVar11111111111111112;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                }
            }
            i17 = 196608;
            i14 |= i17;
            if ((i13 & 64) != 0) {
                if ((i12 & 3670016) == 0) {
                    if (lVarV.n(str2)) {
                        i18 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i18 = PKIFailureInfo.signerNotTrusted;
                    }
                    i14 |= i18;
                }
                if ((i13 & 128) != 0) {
                    if ((29360128 & i12) == 0) {
                        z15 = z13;
                        if (lVarV.p(z15)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i14 |= i19;
                    }
                    if ((i13 & 256) != 0) {
                        if ((i12 & 234881024) == 0) {
                            if (lVarV.K(onClick)) {
                                i21 = 67108864;
                            } else {
                                i21 = 33554432;
                            }
                        }
                        i22 = i13 & 512;
                        if (i22 != 0) {
                            if ((i12 & 1879048192) == 0) {
                                dVar2 = dVar;
                                if (lVarV.n(dVar2)) {
                                    i23 = PKIFailureInfo.duplicateCertReq;
                                } else {
                                    i23 = 268435456;
                                }
                                i14 |= i23;
                            }
                            if ((i14 & 1533916891) == 306783378) {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str11111111111111113 = str3;
                                boolean z111111111111111115 = z15;
                                androidx.compose.ui.d dVar11111111111111113 = dVar2;
                                int i2111111111111111111111111111111112 = i14;
                                int i2111111111111111111111111111111113 = i2111111111111111111111111111111112 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111113, imageLoader, z111111111111111115, dVar11111111111111113)), title, str2, onClick, null, dVar11111111111111113, null, lVarV, (i2111111111111111111111111111111112 & 14) | 3072 | (i2111111111111111111111111111111112 & 112) | (i2111111111111111111111111111111113 & 57344) | (i2111111111111111111111111111111113 & 458752) | ((i2111111111111111111111111111111112 >> 6) & 3670016) | (i2111111111111111111111111111111113 & 234881024), 644);
                                dVar3 = dVar11111111111111113;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            } else {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str11111111111111114 = str3;
                                boolean z111111111111111116 = z15;
                                androidx.compose.ui.d dVar11111111111111114 = dVar2;
                                int i2111111111111111111111111111111114 = i14;
                                int i2111111111111111111111111111111115 = i2111111111111111111111111111111114 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111114, imageLoader, z111111111111111116, dVar11111111111111114)), title, str2, onClick, null, dVar11111111111111114, null, lVarV, (i2111111111111111111111111111111114 & 14) | 3072 | (i2111111111111111111111111111111114 & 112) | (i2111111111111111111111111111111115 & 57344) | (i2111111111111111111111111111111115 & 458752) | ((i2111111111111111111111111111111114 >> 6) & 3670016) | (i2111111111111111111111111111111115 & 234881024), 644);
                                dVar3 = dVar11111111111111114;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            }
                            w2VarX = lVarV.x();
                            if (w2VarX != null) {
                                w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                            }
                        }
                        i14 |= 805306368;
                        dVar2 = dVar;
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str11111111111111115 = str3;
                            boolean z111111111111111117 = z15;
                            androidx.compose.ui.d dVar11111111111111115 = dVar2;
                            int i2111111111111111111111111111111116 = i14;
                            int i2111111111111111111111111111111117 = i2111111111111111111111111111111116 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111115, imageLoader, z111111111111111117, dVar11111111111111115)), title, str2, onClick, null, dVar11111111111111115, null, lVarV, (i2111111111111111111111111111111116 & 14) | 3072 | (i2111111111111111111111111111111116 & 112) | (i2111111111111111111111111111111117 & 57344) | (i2111111111111111111111111111111117 & 458752) | ((i2111111111111111111111111111111116 >> 6) & 3670016) | (i2111111111111111111111111111111117 & 234881024), 644);
                            dVar3 = dVar11111111111111115;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str11111111111111116 = str3;
                            boolean z111111111111111118 = z15;
                            androidx.compose.ui.d dVar11111111111111116 = dVar2;
                            int i2111111111111111111111111111111118 = i14;
                            int i2111111111111111111111111111111119 = i2111111111111111111111111111111118 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111116, imageLoader, z111111111111111118, dVar11111111111111116)), title, str2, onClick, null, dVar11111111111111116, null, lVarV, (i2111111111111111111111111111111118 & 14) | 3072 | (i2111111111111111111111111111111118 & 112) | (i2111111111111111111111111111111119 & 57344) | (i2111111111111111111111111111111119 & 458752) | ((i2111111111111111111111111111111118 >> 6) & 3670016) | (i2111111111111111111111111111111119 & 234881024), 644);
                            dVar3 = dVar11111111111111116;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i21 = 100663296;
                    i14 |= i21;
                    i22 = i13 & 512;
                    if (i22 != 0) {
                        if ((i12 & 1879048192) == 0) {
                            dVar2 = dVar;
                            if (lVarV.n(dVar2)) {
                                i23 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i23 = 268435456;
                            }
                            i14 |= i23;
                        }
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str11111111111111117 = str3;
                            boolean z111111111111111119 = z15;
                            androidx.compose.ui.d dVar11111111111111117 = dVar2;
                            int i21111111111111111111111111111111110 = i14;
                            int i21111111111111111111111111111111111 = i21111111111111111111111111111111110 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111117, imageLoader, z111111111111111119, dVar11111111111111117)), title, str2, onClick, null, dVar11111111111111117, null, lVarV, (i21111111111111111111111111111111110 & 14) | 3072 | (i21111111111111111111111111111111110 & 112) | (i21111111111111111111111111111111111 & 57344) | (i21111111111111111111111111111111111 & 458752) | ((i21111111111111111111111111111111110 >> 6) & 3670016) | (i21111111111111111111111111111111111 & 234881024), 644);
                            dVar3 = dVar11111111111111117;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str11111111111111118 = str3;
                            boolean z1111111111111111110 = z15;
                            androidx.compose.ui.d dVar11111111111111118 = dVar2;
                            int i21111111111111111111111111111111112 = i14;
                            int i21111111111111111111111111111111113 = i21111111111111111111111111111111112 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111118, imageLoader, z1111111111111111110, dVar11111111111111118)), title, str2, onClick, null, dVar11111111111111118, null, lVarV, (i21111111111111111111111111111111112 & 14) | 3072 | (i21111111111111111111111111111111112 & 112) | (i21111111111111111111111111111111113 & 57344) | (i21111111111111111111111111111111113 & 458752) | ((i21111111111111111111111111111111112 >> 6) & 3670016) | (i21111111111111111111111111111111113 & 234881024), 644);
                            dVar3 = dVar11111111111111118;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i14 |= 805306368;
                    dVar2 = dVar;
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str11111111111111119 = str3;
                        boolean z1111111111111111111 = z15;
                        androidx.compose.ui.d dVar11111111111111119 = dVar2;
                        int i21111111111111111111111111111111114 = i14;
                        int i21111111111111111111111111111111115 = i21111111111111111111111111111111114 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111119, imageLoader, z1111111111111111111, dVar11111111111111119)), title, str2, onClick, null, dVar11111111111111119, null, lVarV, (i21111111111111111111111111111111114 & 14) | 3072 | (i21111111111111111111111111111111114 & 112) | (i21111111111111111111111111111111115 & 57344) | (i21111111111111111111111111111111115 & 458752) | ((i21111111111111111111111111111111114 >> 6) & 3670016) | (i21111111111111111111111111111111115 & 234881024), 644);
                        dVar3 = dVar11111111111111119;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str111111111111111110 = str3;
                        boolean z1111111111111111112 = z15;
                        androidx.compose.ui.d dVar111111111111111110 = dVar2;
                        int i21111111111111111111111111111111116 = i14;
                        int i21111111111111111111111111111111117 = i21111111111111111111111111111111116 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111111110, imageLoader, z1111111111111111112, dVar111111111111111110)), title, str2, onClick, null, dVar111111111111111110, null, lVarV, (i21111111111111111111111111111111116 & 14) | 3072 | (i21111111111111111111111111111111116 & 112) | (i21111111111111111111111111111111117 & 57344) | (i21111111111111111111111111111111117 & 458752) | ((i21111111111111111111111111111111116 >> 6) & 3670016) | (i21111111111111111111111111111111117 & 234881024), 644);
                        dVar3 = dVar111111111111111110;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i14 |= 12582912;
                z15 = z13;
                if ((i13 & 256) != 0) {
                    if ((i12 & 234881024) == 0) {
                        if (lVarV.K(onClick)) {
                            i21 = 67108864;
                        } else {
                            i21 = 33554432;
                        }
                    }
                    i22 = i13 & 512;
                    if (i22 != 0) {
                        if ((i12 & 1879048192) == 0) {
                            dVar2 = dVar;
                            if (lVarV.n(dVar2)) {
                                i23 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i23 = 268435456;
                            }
                            i14 |= i23;
                        }
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str111111111111111111 = str3;
                            boolean z1111111111111111113 = z15;
                            androidx.compose.ui.d dVar111111111111111111 = dVar2;
                            int i21111111111111111111111111111111118 = i14;
                            int i21111111111111111111111111111111119 = i21111111111111111111111111111111118 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111111111, imageLoader, z1111111111111111113, dVar111111111111111111)), title, str2, onClick, null, dVar111111111111111111, null, lVarV, (i21111111111111111111111111111111118 & 14) | 3072 | (i21111111111111111111111111111111118 & 112) | (i21111111111111111111111111111111119 & 57344) | (i21111111111111111111111111111111119 & 458752) | ((i21111111111111111111111111111111118 >> 6) & 3670016) | (i21111111111111111111111111111111119 & 234881024), 644);
                            dVar3 = dVar111111111111111111;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str111111111111111112 = str3;
                            boolean z1111111111111111114 = z15;
                            androidx.compose.ui.d dVar111111111111111112 = dVar2;
                            int i211111111111111111111111111111111110 = i14;
                            int i211111111111111111111111111111111111 = i211111111111111111111111111111111110 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111111112, imageLoader, z1111111111111111114, dVar111111111111111112)), title, str2, onClick, null, dVar111111111111111112, null, lVarV, (i211111111111111111111111111111111110 & 14) | 3072 | (i211111111111111111111111111111111110 & 112) | (i211111111111111111111111111111111111 & 57344) | (i211111111111111111111111111111111111 & 458752) | ((i211111111111111111111111111111111110 >> 6) & 3670016) | (i211111111111111111111111111111111111 & 234881024), 644);
                            dVar3 = dVar111111111111111112;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i14 |= 805306368;
                    dVar2 = dVar;
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str111111111111111113 = str3;
                        boolean z1111111111111111115 = z15;
                        androidx.compose.ui.d dVar111111111111111113 = dVar2;
                        int i211111111111111111111111111111111112 = i14;
                        int i211111111111111111111111111111111113 = i211111111111111111111111111111111112 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111111113, imageLoader, z1111111111111111115, dVar111111111111111113)), title, str2, onClick, null, dVar111111111111111113, null, lVarV, (i211111111111111111111111111111111112 & 14) | 3072 | (i211111111111111111111111111111111112 & 112) | (i211111111111111111111111111111111113 & 57344) | (i211111111111111111111111111111111113 & 458752) | ((i211111111111111111111111111111111112 >> 6) & 3670016) | (i211111111111111111111111111111111113 & 234881024), 644);
                        dVar3 = dVar111111111111111113;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str111111111111111114 = str3;
                        boolean z1111111111111111116 = z15;
                        androidx.compose.ui.d dVar111111111111111114 = dVar2;
                        int i211111111111111111111111111111111114 = i14;
                        int i211111111111111111111111111111111115 = i211111111111111111111111111111111114 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111111114, imageLoader, z1111111111111111116, dVar111111111111111114)), title, str2, onClick, null, dVar111111111111111114, null, lVarV, (i211111111111111111111111111111111114 & 14) | 3072 | (i211111111111111111111111111111111114 & 112) | (i211111111111111111111111111111111115 & 57344) | (i211111111111111111111111111111111115 & 458752) | ((i211111111111111111111111111111111114 >> 6) & 3670016) | (i211111111111111111111111111111111115 & 234881024), 644);
                        dVar3 = dVar111111111111111114;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i21 = 100663296;
                i14 |= i21;
                i22 = i13 & 512;
                if (i22 != 0) {
                    if ((i12 & 1879048192) == 0) {
                        dVar2 = dVar;
                        if (lVarV.n(dVar2)) {
                            i23 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i23 = 268435456;
                        }
                        i14 |= i23;
                    }
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str111111111111111115 = str3;
                        boolean z1111111111111111117 = z15;
                        androidx.compose.ui.d dVar111111111111111115 = dVar2;
                        int i211111111111111111111111111111111116 = i14;
                        int i211111111111111111111111111111111117 = i211111111111111111111111111111111116 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111111115, imageLoader, z1111111111111111117, dVar111111111111111115)), title, str2, onClick, null, dVar111111111111111115, null, lVarV, (i211111111111111111111111111111111116 & 14) | 3072 | (i211111111111111111111111111111111116 & 112) | (i211111111111111111111111111111111117 & 57344) | (i211111111111111111111111111111111117 & 458752) | ((i211111111111111111111111111111111116 >> 6) & 3670016) | (i211111111111111111111111111111111117 & 234881024), 644);
                        dVar3 = dVar111111111111111115;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str111111111111111116 = str3;
                        boolean z1111111111111111118 = z15;
                        androidx.compose.ui.d dVar111111111111111116 = dVar2;
                        int i211111111111111111111111111111111118 = i14;
                        int i211111111111111111111111111111111119 = i211111111111111111111111111111111118 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111111116, imageLoader, z1111111111111111118, dVar111111111111111116)), title, str2, onClick, null, dVar111111111111111116, null, lVarV, (i211111111111111111111111111111111118 & 14) | 3072 | (i211111111111111111111111111111111118 & 112) | (i211111111111111111111111111111111119 & 57344) | (i211111111111111111111111111111111119 & 458752) | ((i211111111111111111111111111111111118 >> 6) & 3670016) | (i211111111111111111111111111111111119 & 234881024), 644);
                        dVar3 = dVar111111111111111116;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i14 |= 805306368;
                dVar2 = dVar;
                if ((i14 & 1533916891) == 306783378) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str111111111111111117 = str3;
                    boolean z1111111111111111119 = z15;
                    androidx.compose.ui.d dVar111111111111111117 = dVar2;
                    int i2111111111111111111111111111111111110 = i14;
                    int i2111111111111111111111111111111111111 = i2111111111111111111111111111111111110 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111111117, imageLoader, z1111111111111111119, dVar111111111111111117)), title, str2, onClick, null, dVar111111111111111117, null, lVarV, (i2111111111111111111111111111111111110 & 14) | 3072 | (i2111111111111111111111111111111111110 & 112) | (i2111111111111111111111111111111111111 & 57344) | (i2111111111111111111111111111111111111 & 458752) | ((i2111111111111111111111111111111111110 >> 6) & 3670016) | (i2111111111111111111111111111111111111 & 234881024), 644);
                    dVar3 = dVar111111111111111117;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str111111111111111118 = str3;
                    boolean z11111111111111111110 = z15;
                    androidx.compose.ui.d dVar111111111111111118 = dVar2;
                    int i2111111111111111111111111111111111112 = i14;
                    int i2111111111111111111111111111111111113 = i2111111111111111111111111111111111112 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111111118, imageLoader, z11111111111111111110, dVar111111111111111118)), title, str2, onClick, null, dVar111111111111111118, null, lVarV, (i2111111111111111111111111111111111112 & 14) | 3072 | (i2111111111111111111111111111111111112 & 112) | (i2111111111111111111111111111111111113 & 57344) | (i2111111111111111111111111111111111113 & 458752) | ((i2111111111111111111111111111111111112 >> 6) & 3670016) | (i2111111111111111111111111111111111113 & 234881024), 644);
                    dVar3 = dVar111111111111111118;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                }
            }
            i14 |= 1572864;
            if ((i13 & 128) != 0) {
                if ((29360128 & i12) == 0) {
                    z15 = z13;
                    if (lVarV.p(z15)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i14 |= i19;
                }
                if ((i13 & 256) != 0) {
                    if ((i12 & 234881024) == 0) {
                        if (lVarV.K(onClick)) {
                            i21 = 67108864;
                        } else {
                            i21 = 33554432;
                        }
                    }
                    i22 = i13 & 512;
                    if (i22 != 0) {
                        if ((i12 & 1879048192) == 0) {
                            dVar2 = dVar;
                            if (lVarV.n(dVar2)) {
                                i23 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i23 = 268435456;
                            }
                            i14 |= i23;
                        }
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str111111111111111119 = str3;
                            boolean z11111111111111111111 = z15;
                            androidx.compose.ui.d dVar111111111111111119 = dVar2;
                            int i2111111111111111111111111111111111114 = i14;
                            int i2111111111111111111111111111111111115 = i2111111111111111111111111111111111114 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111111119, imageLoader, z11111111111111111111, dVar111111111111111119)), title, str2, onClick, null, dVar111111111111111119, null, lVarV, (i2111111111111111111111111111111111114 & 14) | 3072 | (i2111111111111111111111111111111111114 & 112) | (i2111111111111111111111111111111111115 & 57344) | (i2111111111111111111111111111111111115 & 458752) | ((i2111111111111111111111111111111111114 >> 6) & 3670016) | (i2111111111111111111111111111111111115 & 234881024), 644);
                            dVar3 = dVar111111111111111119;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str1111111111111111110 = str3;
                            boolean z11111111111111111112 = z15;
                            androidx.compose.ui.d dVar1111111111111111110 = dVar2;
                            int i2111111111111111111111111111111111116 = i14;
                            int i2111111111111111111111111111111111117 = i2111111111111111111111111111111111116 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111111110, imageLoader, z11111111111111111112, dVar1111111111111111110)), title, str2, onClick, null, dVar1111111111111111110, null, lVarV, (i2111111111111111111111111111111111116 & 14) | 3072 | (i2111111111111111111111111111111111116 & 112) | (i2111111111111111111111111111111111117 & 57344) | (i2111111111111111111111111111111111117 & 458752) | ((i2111111111111111111111111111111111116 >> 6) & 3670016) | (i2111111111111111111111111111111111117 & 234881024), 644);
                            dVar3 = dVar1111111111111111110;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i14 |= 805306368;
                    dVar2 = dVar;
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str1111111111111111111 = str3;
                        boolean z11111111111111111113 = z15;
                        androidx.compose.ui.d dVar1111111111111111111 = dVar2;
                        int i2111111111111111111111111111111111118 = i14;
                        int i2111111111111111111111111111111111119 = i2111111111111111111111111111111111118 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111111111, imageLoader, z11111111111111111113, dVar1111111111111111111)), title, str2, onClick, null, dVar1111111111111111111, null, lVarV, (i2111111111111111111111111111111111118 & 14) | 3072 | (i2111111111111111111111111111111111118 & 112) | (i2111111111111111111111111111111111119 & 57344) | (i2111111111111111111111111111111111119 & 458752) | ((i2111111111111111111111111111111111118 >> 6) & 3670016) | (i2111111111111111111111111111111111119 & 234881024), 644);
                        dVar3 = dVar1111111111111111111;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str1111111111111111112 = str3;
                        boolean z11111111111111111114 = z15;
                        androidx.compose.ui.d dVar1111111111111111112 = dVar2;
                        int i21111111111111111111111111111111111110 = i14;
                        int i21111111111111111111111111111111111111 = i21111111111111111111111111111111111110 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111111112, imageLoader, z11111111111111111114, dVar1111111111111111112)), title, str2, onClick, null, dVar1111111111111111112, null, lVarV, (i21111111111111111111111111111111111110 & 14) | 3072 | (i21111111111111111111111111111111111110 & 112) | (i21111111111111111111111111111111111111 & 57344) | (i21111111111111111111111111111111111111 & 458752) | ((i21111111111111111111111111111111111110 >> 6) & 3670016) | (i21111111111111111111111111111111111111 & 234881024), 644);
                        dVar3 = dVar1111111111111111112;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i21 = 100663296;
                i14 |= i21;
                i22 = i13 & 512;
                if (i22 != 0) {
                    if ((i12 & 1879048192) == 0) {
                        dVar2 = dVar;
                        if (lVarV.n(dVar2)) {
                            i23 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i23 = 268435456;
                        }
                        i14 |= i23;
                    }
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str1111111111111111113 = str3;
                        boolean z11111111111111111115 = z15;
                        androidx.compose.ui.d dVar1111111111111111113 = dVar2;
                        int i21111111111111111111111111111111111112 = i14;
                        int i21111111111111111111111111111111111113 = i21111111111111111111111111111111111112 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111111113, imageLoader, z11111111111111111115, dVar1111111111111111113)), title, str2, onClick, null, dVar1111111111111111113, null, lVarV, (i21111111111111111111111111111111111112 & 14) | 3072 | (i21111111111111111111111111111111111112 & 112) | (i21111111111111111111111111111111111113 & 57344) | (i21111111111111111111111111111111111113 & 458752) | ((i21111111111111111111111111111111111112 >> 6) & 3670016) | (i21111111111111111111111111111111111113 & 234881024), 644);
                        dVar3 = dVar1111111111111111113;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str1111111111111111114 = str3;
                        boolean z11111111111111111116 = z15;
                        androidx.compose.ui.d dVar1111111111111111114 = dVar2;
                        int i21111111111111111111111111111111111114 = i14;
                        int i21111111111111111111111111111111111115 = i21111111111111111111111111111111111114 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111111114, imageLoader, z11111111111111111116, dVar1111111111111111114)), title, str2, onClick, null, dVar1111111111111111114, null, lVarV, (i21111111111111111111111111111111111114 & 14) | 3072 | (i21111111111111111111111111111111111114 & 112) | (i21111111111111111111111111111111111115 & 57344) | (i21111111111111111111111111111111111115 & 458752) | ((i21111111111111111111111111111111111114 >> 6) & 3670016) | (i21111111111111111111111111111111111115 & 234881024), 644);
                        dVar3 = dVar1111111111111111114;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i14 |= 805306368;
                dVar2 = dVar;
                if ((i14 & 1533916891) == 306783378) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str1111111111111111115 = str3;
                    boolean z11111111111111111117 = z15;
                    androidx.compose.ui.d dVar1111111111111111115 = dVar2;
                    int i21111111111111111111111111111111111116 = i14;
                    int i21111111111111111111111111111111111117 = i21111111111111111111111111111111111116 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111111115, imageLoader, z11111111111111111117, dVar1111111111111111115)), title, str2, onClick, null, dVar1111111111111111115, null, lVarV, (i21111111111111111111111111111111111116 & 14) | 3072 | (i21111111111111111111111111111111111116 & 112) | (i21111111111111111111111111111111111117 & 57344) | (i21111111111111111111111111111111111117 & 458752) | ((i21111111111111111111111111111111111116 >> 6) & 3670016) | (i21111111111111111111111111111111111117 & 234881024), 644);
                    dVar3 = dVar1111111111111111115;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str1111111111111111116 = str3;
                    boolean z11111111111111111118 = z15;
                    androidx.compose.ui.d dVar1111111111111111116 = dVar2;
                    int i21111111111111111111111111111111111118 = i14;
                    int i21111111111111111111111111111111111119 = i21111111111111111111111111111111111118 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111111116, imageLoader, z11111111111111111118, dVar1111111111111111116)), title, str2, onClick, null, dVar1111111111111111116, null, lVarV, (i21111111111111111111111111111111111118 & 14) | 3072 | (i21111111111111111111111111111111111118 & 112) | (i21111111111111111111111111111111111119 & 57344) | (i21111111111111111111111111111111111119 & 458752) | ((i21111111111111111111111111111111111118 >> 6) & 3670016) | (i21111111111111111111111111111111111119 & 234881024), 644);
                    dVar3 = dVar1111111111111111116;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                }
            }
            i14 |= 12582912;
            z15 = z13;
            if ((i13 & 256) != 0) {
                if ((i12 & 234881024) == 0) {
                    if (lVarV.K(onClick)) {
                        i21 = 67108864;
                    } else {
                        i21 = 33554432;
                    }
                }
                i22 = i13 & 512;
                if (i22 != 0) {
                    if ((i12 & 1879048192) == 0) {
                        dVar2 = dVar;
                        if (lVarV.n(dVar2)) {
                            i23 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i23 = 268435456;
                        }
                        i14 |= i23;
                    }
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str1111111111111111117 = str3;
                        boolean z11111111111111111119 = z15;
                        androidx.compose.ui.d dVar1111111111111111117 = dVar2;
                        int i211111111111111111111111111111111111110 = i14;
                        int i211111111111111111111111111111111111111 = i211111111111111111111111111111111111110 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111111117, imageLoader, z11111111111111111119, dVar1111111111111111117)), title, str2, onClick, null, dVar1111111111111111117, null, lVarV, (i211111111111111111111111111111111111110 & 14) | 3072 | (i211111111111111111111111111111111111110 & 112) | (i211111111111111111111111111111111111111 & 57344) | (i211111111111111111111111111111111111111 & 458752) | ((i211111111111111111111111111111111111110 >> 6) & 3670016) | (i211111111111111111111111111111111111111 & 234881024), 644);
                        dVar3 = dVar1111111111111111117;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str1111111111111111118 = str3;
                        boolean z111111111111111111110 = z15;
                        androidx.compose.ui.d dVar1111111111111111118 = dVar2;
                        int i211111111111111111111111111111111111112 = i14;
                        int i211111111111111111111111111111111111113 = i211111111111111111111111111111111111112 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111111118, imageLoader, z111111111111111111110, dVar1111111111111111118)), title, str2, onClick, null, dVar1111111111111111118, null, lVarV, (i211111111111111111111111111111111111112 & 14) | 3072 | (i211111111111111111111111111111111111112 & 112) | (i211111111111111111111111111111111111113 & 57344) | (i211111111111111111111111111111111111113 & 458752) | ((i211111111111111111111111111111111111112 >> 6) & 3670016) | (i211111111111111111111111111111111111113 & 234881024), 644);
                        dVar3 = dVar1111111111111111118;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i14 |= 805306368;
                dVar2 = dVar;
                if ((i14 & 1533916891) == 306783378) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str1111111111111111119 = str3;
                    boolean z111111111111111111111 = z15;
                    androidx.compose.ui.d dVar1111111111111111119 = dVar2;
                    int i211111111111111111111111111111111111114 = i14;
                    int i211111111111111111111111111111111111115 = i211111111111111111111111111111111111114 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111111119, imageLoader, z111111111111111111111, dVar1111111111111111119)), title, str2, onClick, null, dVar1111111111111111119, null, lVarV, (i211111111111111111111111111111111111114 & 14) | 3072 | (i211111111111111111111111111111111111114 & 112) | (i211111111111111111111111111111111111115 & 57344) | (i211111111111111111111111111111111111115 & 458752) | ((i211111111111111111111111111111111111114 >> 6) & 3670016) | (i211111111111111111111111111111111111115 & 234881024), 644);
                    dVar3 = dVar1111111111111111119;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str11111111111111111110 = str3;
                    boolean z111111111111111111112 = z15;
                    androidx.compose.ui.d dVar11111111111111111110 = dVar2;
                    int i211111111111111111111111111111111111116 = i14;
                    int i211111111111111111111111111111111111117 = i211111111111111111111111111111111111116 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111111110, imageLoader, z111111111111111111112, dVar11111111111111111110)), title, str2, onClick, null, dVar11111111111111111110, null, lVarV, (i211111111111111111111111111111111111116 & 14) | 3072 | (i211111111111111111111111111111111111116 & 112) | (i211111111111111111111111111111111111117 & 57344) | (i211111111111111111111111111111111111117 & 458752) | ((i211111111111111111111111111111111111116 >> 6) & 3670016) | (i211111111111111111111111111111111111117 & 234881024), 644);
                    dVar3 = dVar11111111111111111110;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                }
            }
            i21 = 100663296;
            i14 |= i21;
            i22 = i13 & 512;
            if (i22 != 0) {
                if ((i12 & 1879048192) == 0) {
                    dVar2 = dVar;
                    if (lVarV.n(dVar2)) {
                        i23 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i23 = 268435456;
                    }
                    i14 |= i23;
                }
                if ((i14 & 1533916891) == 306783378) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str11111111111111111111 = str3;
                    boolean z111111111111111111113 = z15;
                    androidx.compose.ui.d dVar11111111111111111111 = dVar2;
                    int i211111111111111111111111111111111111118 = i14;
                    int i211111111111111111111111111111111111119 = i211111111111111111111111111111111111118 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111111111, imageLoader, z111111111111111111113, dVar11111111111111111111)), title, str2, onClick, null, dVar11111111111111111111, null, lVarV, (i211111111111111111111111111111111111118 & 14) | 3072 | (i211111111111111111111111111111111111118 & 112) | (i211111111111111111111111111111111111119 & 57344) | (i211111111111111111111111111111111111119 & 458752) | ((i211111111111111111111111111111111111118 >> 6) & 3670016) | (i211111111111111111111111111111111111119 & 234881024), 644);
                    dVar3 = dVar11111111111111111111;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str11111111111111111112 = str3;
                    boolean z111111111111111111114 = z15;
                    androidx.compose.ui.d dVar11111111111111111112 = dVar2;
                    int i2111111111111111111111111111111111111110 = i14;
                    int i2111111111111111111111111111111111111111 = i2111111111111111111111111111111111111110 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111111112, imageLoader, z111111111111111111114, dVar11111111111111111112)), title, str2, onClick, null, dVar11111111111111111112, null, lVarV, (i2111111111111111111111111111111111111110 & 14) | 3072 | (i2111111111111111111111111111111111111110 & 112) | (i2111111111111111111111111111111111111111 & 57344) | (i2111111111111111111111111111111111111111 & 458752) | ((i2111111111111111111111111111111111111110 >> 6) & 3670016) | (i2111111111111111111111111111111111111111 & 234881024), 644);
                    dVar3 = dVar11111111111111111112;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                }
            }
            i14 |= 805306368;
            dVar2 = dVar;
            if ((i14 & 1533916891) == 306783378) {
                if (i22 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                }
                String str11111111111111111113 = str3;
                boolean z111111111111111111115 = z15;
                androidx.compose.ui.d dVar11111111111111111113 = dVar2;
                int i2111111111111111111111111111111111111112 = i14;
                int i2111111111111111111111111111111111111113 = i2111111111111111111111111111111111111112 >> 3;
                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111111113, imageLoader, z111111111111111111115, dVar11111111111111111113)), title, str2, onClick, null, dVar11111111111111111113, null, lVarV, (i2111111111111111111111111111111111111112 & 14) | 3072 | (i2111111111111111111111111111111111111112 & 112) | (i2111111111111111111111111111111111111113 & 57344) | (i2111111111111111111111111111111111111113 & 458752) | ((i2111111111111111111111111111111111111112 >> 6) & 3670016) | (i2111111111111111111111111111111111111113 & 234881024), 644);
                dVar3 = dVar11111111111111111113;
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            } else {
                if (i22 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                }
                String str11111111111111111114 = str3;
                boolean z111111111111111111116 = z15;
                androidx.compose.ui.d dVar11111111111111111114 = dVar2;
                int i2111111111111111111111111111111111111114 = i14;
                int i2111111111111111111111111111111111111115 = i2111111111111111111111111111111111111114 >> 3;
                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111111114, imageLoader, z111111111111111111116, dVar11111111111111111114)), title, str2, onClick, null, dVar11111111111111111114, null, lVarV, (i2111111111111111111111111111111111111114 & 14) | 3072 | (i2111111111111111111111111111111111111114 & 112) | (i2111111111111111111111111111111111111115 & 57344) | (i2111111111111111111111111111111111111115 & 458752) | ((i2111111111111111111111111111111111111114 >> 6) & 3670016) | (i2111111111111111111111111111111111111115 & 234881024), 644);
                dVar3 = dVar11111111111111111114;
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
            }
        }
        i14 |= 3072;
        str3 = str;
        if ((i13 & 16) != 0) {
            i14 |= 24576;
        } else if ((i12 & 57344) == 0) {
            if (lVarV.n(imageLoader)) {
                i16 = 16384;
            } else {
                i16 = PKIFailureInfo.certRevoked;
            }
            i14 |= i16;
        }
        if ((i13 & 32) != 0) {
            if ((i12 & 458752) == 0) {
                if (lVarV.n(title)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
            }
            if ((i13 & 64) != 0) {
                if ((i12 & 3670016) == 0) {
                    if (lVarV.n(str2)) {
                        i18 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i18 = PKIFailureInfo.signerNotTrusted;
                    }
                    i14 |= i18;
                }
                if ((i13 & 128) != 0) {
                    if ((29360128 & i12) == 0) {
                        z15 = z13;
                        if (lVarV.p(z15)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i14 |= i19;
                    }
                    if ((i13 & 256) != 0) {
                        if ((i12 & 234881024) == 0) {
                            if (lVarV.K(onClick)) {
                                i21 = 67108864;
                            } else {
                                i21 = 33554432;
                            }
                        }
                        i22 = i13 & 512;
                        if (i22 != 0) {
                            if ((i12 & 1879048192) == 0) {
                                dVar2 = dVar;
                                if (lVarV.n(dVar2)) {
                                    i23 = PKIFailureInfo.duplicateCertReq;
                                } else {
                                    i23 = 268435456;
                                }
                                i14 |= i23;
                            }
                            if ((i14 & 1533916891) == 306783378) {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str11111111111111111115 = str3;
                                boolean z111111111111111111117 = z15;
                                androidx.compose.ui.d dVar11111111111111111115 = dVar2;
                                int i2111111111111111111111111111111111111116 = i14;
                                int i2111111111111111111111111111111111111117 = i2111111111111111111111111111111111111116 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111111115, imageLoader, z111111111111111111117, dVar11111111111111111115)), title, str2, onClick, null, dVar11111111111111111115, null, lVarV, (i2111111111111111111111111111111111111116 & 14) | 3072 | (i2111111111111111111111111111111111111116 & 112) | (i2111111111111111111111111111111111111117 & 57344) | (i2111111111111111111111111111111111111117 & 458752) | ((i2111111111111111111111111111111111111116 >> 6) & 3670016) | (i2111111111111111111111111111111111111117 & 234881024), 644);
                                dVar3 = dVar11111111111111111115;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            } else {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                                }
                                String str11111111111111111116 = str3;
                                boolean z111111111111111111118 = z15;
                                androidx.compose.ui.d dVar11111111111111111116 = dVar2;
                                int i2111111111111111111111111111111111111118 = i14;
                                int i2111111111111111111111111111111111111119 = i2111111111111111111111111111111111111118 >> 3;
                                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111111116, imageLoader, z111111111111111111118, dVar11111111111111111116)), title, str2, onClick, null, dVar11111111111111111116, null, lVarV, (i2111111111111111111111111111111111111118 & 14) | 3072 | (i2111111111111111111111111111111111111118 & 112) | (i2111111111111111111111111111111111111119 & 57344) | (i2111111111111111111111111111111111111119 & 458752) | ((i2111111111111111111111111111111111111118 >> 6) & 3670016) | (i2111111111111111111111111111111111111119 & 234881024), 644);
                                dVar3 = dVar11111111111111111116;
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                            }
                            w2VarX = lVarV.x();
                            if (w2VarX != null) {
                                w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                            }
                        }
                        i14 |= 805306368;
                        dVar2 = dVar;
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str11111111111111111117 = str3;
                            boolean z111111111111111111119 = z15;
                            androidx.compose.ui.d dVar11111111111111111117 = dVar2;
                            int i21111111111111111111111111111111111111110 = i14;
                            int i21111111111111111111111111111111111111111 = i21111111111111111111111111111111111111110 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111111117, imageLoader, z111111111111111111119, dVar11111111111111111117)), title, str2, onClick, null, dVar11111111111111111117, null, lVarV, (i21111111111111111111111111111111111111110 & 14) | 3072 | (i21111111111111111111111111111111111111110 & 112) | (i21111111111111111111111111111111111111111 & 57344) | (i21111111111111111111111111111111111111111 & 458752) | ((i21111111111111111111111111111111111111110 >> 6) & 3670016) | (i21111111111111111111111111111111111111111 & 234881024), 644);
                            dVar3 = dVar11111111111111111117;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str11111111111111111118 = str3;
                            boolean z1111111111111111111110 = z15;
                            androidx.compose.ui.d dVar11111111111111111118 = dVar2;
                            int i21111111111111111111111111111111111111112 = i14;
                            int i21111111111111111111111111111111111111113 = i21111111111111111111111111111111111111112 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111111118, imageLoader, z1111111111111111111110, dVar11111111111111111118)), title, str2, onClick, null, dVar11111111111111111118, null, lVarV, (i21111111111111111111111111111111111111112 & 14) | 3072 | (i21111111111111111111111111111111111111112 & 112) | (i21111111111111111111111111111111111111113 & 57344) | (i21111111111111111111111111111111111111113 & 458752) | ((i21111111111111111111111111111111111111112 >> 6) & 3670016) | (i21111111111111111111111111111111111111113 & 234881024), 644);
                            dVar3 = dVar11111111111111111118;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i21 = 100663296;
                    i14 |= i21;
                    i22 = i13 & 512;
                    if (i22 != 0) {
                        if ((i12 & 1879048192) == 0) {
                            dVar2 = dVar;
                            if (lVarV.n(dVar2)) {
                                i23 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i23 = 268435456;
                            }
                            i14 |= i23;
                        }
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str11111111111111111119 = str3;
                            boolean z1111111111111111111111 = z15;
                            androidx.compose.ui.d dVar11111111111111111119 = dVar2;
                            int i21111111111111111111111111111111111111114 = i14;
                            int i21111111111111111111111111111111111111115 = i21111111111111111111111111111111111111114 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111111119, imageLoader, z1111111111111111111111, dVar11111111111111111119)), title, str2, onClick, null, dVar11111111111111111119, null, lVarV, (i21111111111111111111111111111111111111114 & 14) | 3072 | (i21111111111111111111111111111111111111114 & 112) | (i21111111111111111111111111111111111111115 & 57344) | (i21111111111111111111111111111111111111115 & 458752) | ((i21111111111111111111111111111111111111114 >> 6) & 3670016) | (i21111111111111111111111111111111111111115 & 234881024), 644);
                            dVar3 = dVar11111111111111111119;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str111111111111111111110 = str3;
                            boolean z1111111111111111111112 = z15;
                            androidx.compose.ui.d dVar111111111111111111110 = dVar2;
                            int i21111111111111111111111111111111111111116 = i14;
                            int i21111111111111111111111111111111111111117 = i21111111111111111111111111111111111111116 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111111111110, imageLoader, z1111111111111111111112, dVar111111111111111111110)), title, str2, onClick, null, dVar111111111111111111110, null, lVarV, (i21111111111111111111111111111111111111116 & 14) | 3072 | (i21111111111111111111111111111111111111116 & 112) | (i21111111111111111111111111111111111111117 & 57344) | (i21111111111111111111111111111111111111117 & 458752) | ((i21111111111111111111111111111111111111116 >> 6) & 3670016) | (i21111111111111111111111111111111111111117 & 234881024), 644);
                            dVar3 = dVar111111111111111111110;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i14 |= 805306368;
                    dVar2 = dVar;
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str111111111111111111111 = str3;
                        boolean z1111111111111111111113 = z15;
                        androidx.compose.ui.d dVar111111111111111111111 = dVar2;
                        int i21111111111111111111111111111111111111118 = i14;
                        int i21111111111111111111111111111111111111119 = i21111111111111111111111111111111111111118 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111111111111, imageLoader, z1111111111111111111113, dVar111111111111111111111)), title, str2, onClick, null, dVar111111111111111111111, null, lVarV, (i21111111111111111111111111111111111111118 & 14) | 3072 | (i21111111111111111111111111111111111111118 & 112) | (i21111111111111111111111111111111111111119 & 57344) | (i21111111111111111111111111111111111111119 & 458752) | ((i21111111111111111111111111111111111111118 >> 6) & 3670016) | (i21111111111111111111111111111111111111119 & 234881024), 644);
                        dVar3 = dVar111111111111111111111;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str111111111111111111112 = str3;
                        boolean z1111111111111111111114 = z15;
                        androidx.compose.ui.d dVar111111111111111111112 = dVar2;
                        int i211111111111111111111111111111111111111110 = i14;
                        int i211111111111111111111111111111111111111111 = i211111111111111111111111111111111111111110 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111111111112, imageLoader, z1111111111111111111114, dVar111111111111111111112)), title, str2, onClick, null, dVar111111111111111111112, null, lVarV, (i211111111111111111111111111111111111111110 & 14) | 3072 | (i211111111111111111111111111111111111111110 & 112) | (i211111111111111111111111111111111111111111 & 57344) | (i211111111111111111111111111111111111111111 & 458752) | ((i211111111111111111111111111111111111111110 >> 6) & 3670016) | (i211111111111111111111111111111111111111111 & 234881024), 644);
                        dVar3 = dVar111111111111111111112;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i14 |= 12582912;
                z15 = z13;
                if ((i13 & 256) != 0) {
                    if ((i12 & 234881024) == 0) {
                        if (lVarV.K(onClick)) {
                            i21 = 67108864;
                        } else {
                            i21 = 33554432;
                        }
                    }
                    i22 = i13 & 512;
                    if (i22 != 0) {
                        if ((i12 & 1879048192) == 0) {
                            dVar2 = dVar;
                            if (lVarV.n(dVar2)) {
                                i23 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i23 = 268435456;
                            }
                            i14 |= i23;
                        }
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str111111111111111111113 = str3;
                            boolean z1111111111111111111115 = z15;
                            androidx.compose.ui.d dVar111111111111111111113 = dVar2;
                            int i211111111111111111111111111111111111111112 = i14;
                            int i211111111111111111111111111111111111111113 = i211111111111111111111111111111111111111112 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111111111113, imageLoader, z1111111111111111111115, dVar111111111111111111113)), title, str2, onClick, null, dVar111111111111111111113, null, lVarV, (i211111111111111111111111111111111111111112 & 14) | 3072 | (i211111111111111111111111111111111111111112 & 112) | (i211111111111111111111111111111111111111113 & 57344) | (i211111111111111111111111111111111111111113 & 458752) | ((i211111111111111111111111111111111111111112 >> 6) & 3670016) | (i211111111111111111111111111111111111111113 & 234881024), 644);
                            dVar3 = dVar111111111111111111113;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str111111111111111111114 = str3;
                            boolean z1111111111111111111116 = z15;
                            androidx.compose.ui.d dVar111111111111111111114 = dVar2;
                            int i211111111111111111111111111111111111111114 = i14;
                            int i211111111111111111111111111111111111111115 = i211111111111111111111111111111111111111114 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111111111114, imageLoader, z1111111111111111111116, dVar111111111111111111114)), title, str2, onClick, null, dVar111111111111111111114, null, lVarV, (i211111111111111111111111111111111111111114 & 14) | 3072 | (i211111111111111111111111111111111111111114 & 112) | (i211111111111111111111111111111111111111115 & 57344) | (i211111111111111111111111111111111111111115 & 458752) | ((i211111111111111111111111111111111111111114 >> 6) & 3670016) | (i211111111111111111111111111111111111111115 & 234881024), 644);
                            dVar3 = dVar111111111111111111114;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i14 |= 805306368;
                    dVar2 = dVar;
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str111111111111111111115 = str3;
                        boolean z1111111111111111111117 = z15;
                        androidx.compose.ui.d dVar111111111111111111115 = dVar2;
                        int i211111111111111111111111111111111111111116 = i14;
                        int i211111111111111111111111111111111111111117 = i211111111111111111111111111111111111111116 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111111111115, imageLoader, z1111111111111111111117, dVar111111111111111111115)), title, str2, onClick, null, dVar111111111111111111115, null, lVarV, (i211111111111111111111111111111111111111116 & 14) | 3072 | (i211111111111111111111111111111111111111116 & 112) | (i211111111111111111111111111111111111111117 & 57344) | (i211111111111111111111111111111111111111117 & 458752) | ((i211111111111111111111111111111111111111116 >> 6) & 3670016) | (i211111111111111111111111111111111111111117 & 234881024), 644);
                        dVar3 = dVar111111111111111111115;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str111111111111111111116 = str3;
                        boolean z1111111111111111111118 = z15;
                        androidx.compose.ui.d dVar111111111111111111116 = dVar2;
                        int i211111111111111111111111111111111111111118 = i14;
                        int i211111111111111111111111111111111111111119 = i211111111111111111111111111111111111111118 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111111111116, imageLoader, z1111111111111111111118, dVar111111111111111111116)), title, str2, onClick, null, dVar111111111111111111116, null, lVarV, (i211111111111111111111111111111111111111118 & 14) | 3072 | (i211111111111111111111111111111111111111118 & 112) | (i211111111111111111111111111111111111111119 & 57344) | (i211111111111111111111111111111111111111119 & 458752) | ((i211111111111111111111111111111111111111118 >> 6) & 3670016) | (i211111111111111111111111111111111111111119 & 234881024), 644);
                        dVar3 = dVar111111111111111111116;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i21 = 100663296;
                i14 |= i21;
                i22 = i13 & 512;
                if (i22 != 0) {
                    if ((i12 & 1879048192) == 0) {
                        dVar2 = dVar;
                        if (lVarV.n(dVar2)) {
                            i23 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i23 = 268435456;
                        }
                        i14 |= i23;
                    }
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str111111111111111111117 = str3;
                        boolean z1111111111111111111119 = z15;
                        androidx.compose.ui.d dVar111111111111111111117 = dVar2;
                        int i2111111111111111111111111111111111111111110 = i14;
                        int i2111111111111111111111111111111111111111111 = i2111111111111111111111111111111111111111110 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111111111117, imageLoader, z1111111111111111111119, dVar111111111111111111117)), title, str2, onClick, null, dVar111111111111111111117, null, lVarV, (i2111111111111111111111111111111111111111110 & 14) | 3072 | (i2111111111111111111111111111111111111111110 & 112) | (i2111111111111111111111111111111111111111111 & 57344) | (i2111111111111111111111111111111111111111111 & 458752) | ((i2111111111111111111111111111111111111111110 >> 6) & 3670016) | (i2111111111111111111111111111111111111111111 & 234881024), 644);
                        dVar3 = dVar111111111111111111117;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str111111111111111111118 = str3;
                        boolean z11111111111111111111110 = z15;
                        androidx.compose.ui.d dVar111111111111111111118 = dVar2;
                        int i2111111111111111111111111111111111111111112 = i14;
                        int i2111111111111111111111111111111111111111113 = i2111111111111111111111111111111111111111112 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111111111118, imageLoader, z11111111111111111111110, dVar111111111111111111118)), title, str2, onClick, null, dVar111111111111111111118, null, lVarV, (i2111111111111111111111111111111111111111112 & 14) | 3072 | (i2111111111111111111111111111111111111111112 & 112) | (i2111111111111111111111111111111111111111113 & 57344) | (i2111111111111111111111111111111111111111113 & 458752) | ((i2111111111111111111111111111111111111111112 >> 6) & 3670016) | (i2111111111111111111111111111111111111111113 & 234881024), 644);
                        dVar3 = dVar111111111111111111118;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i14 |= 805306368;
                dVar2 = dVar;
                if ((i14 & 1533916891) == 306783378) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str111111111111111111119 = str3;
                    boolean z11111111111111111111111 = z15;
                    androidx.compose.ui.d dVar111111111111111111119 = dVar2;
                    int i2111111111111111111111111111111111111111114 = i14;
                    int i2111111111111111111111111111111111111111115 = i2111111111111111111111111111111111111111114 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111111111119, imageLoader, z11111111111111111111111, dVar111111111111111111119)), title, str2, onClick, null, dVar111111111111111111119, null, lVarV, (i2111111111111111111111111111111111111111114 & 14) | 3072 | (i2111111111111111111111111111111111111111114 & 112) | (i2111111111111111111111111111111111111111115 & 57344) | (i2111111111111111111111111111111111111111115 & 458752) | ((i2111111111111111111111111111111111111111114 >> 6) & 3670016) | (i2111111111111111111111111111111111111111115 & 234881024), 644);
                    dVar3 = dVar111111111111111111119;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str1111111111111111111110 = str3;
                    boolean z11111111111111111111112 = z15;
                    androidx.compose.ui.d dVar1111111111111111111110 = dVar2;
                    int i2111111111111111111111111111111111111111116 = i14;
                    int i2111111111111111111111111111111111111111117 = i2111111111111111111111111111111111111111116 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111111111110, imageLoader, z11111111111111111111112, dVar1111111111111111111110)), title, str2, onClick, null, dVar1111111111111111111110, null, lVarV, (i2111111111111111111111111111111111111111116 & 14) | 3072 | (i2111111111111111111111111111111111111111116 & 112) | (i2111111111111111111111111111111111111111117 & 57344) | (i2111111111111111111111111111111111111111117 & 458752) | ((i2111111111111111111111111111111111111111116 >> 6) & 3670016) | (i2111111111111111111111111111111111111111117 & 234881024), 644);
                    dVar3 = dVar1111111111111111111110;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                }
            }
            i14 |= 1572864;
            if ((i13 & 128) != 0) {
                if ((29360128 & i12) == 0) {
                    z15 = z13;
                    if (lVarV.p(z15)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i14 |= i19;
                }
                if ((i13 & 256) != 0) {
                    if ((i12 & 234881024) == 0) {
                        if (lVarV.K(onClick)) {
                            i21 = 67108864;
                        } else {
                            i21 = 33554432;
                        }
                    }
                    i22 = i13 & 512;
                    if (i22 != 0) {
                        if ((i12 & 1879048192) == 0) {
                            dVar2 = dVar;
                            if (lVarV.n(dVar2)) {
                                i23 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i23 = 268435456;
                            }
                            i14 |= i23;
                        }
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str1111111111111111111111 = str3;
                            boolean z11111111111111111111113 = z15;
                            androidx.compose.ui.d dVar1111111111111111111111 = dVar2;
                            int i2111111111111111111111111111111111111111118 = i14;
                            int i2111111111111111111111111111111111111111119 = i2111111111111111111111111111111111111111118 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111111111111, imageLoader, z11111111111111111111113, dVar1111111111111111111111)), title, str2, onClick, null, dVar1111111111111111111111, null, lVarV, (i2111111111111111111111111111111111111111118 & 14) | 3072 | (i2111111111111111111111111111111111111111118 & 112) | (i2111111111111111111111111111111111111111119 & 57344) | (i2111111111111111111111111111111111111111119 & 458752) | ((i2111111111111111111111111111111111111111118 >> 6) & 3670016) | (i2111111111111111111111111111111111111111119 & 234881024), 644);
                            dVar3 = dVar1111111111111111111111;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str1111111111111111111112 = str3;
                            boolean z11111111111111111111114 = z15;
                            androidx.compose.ui.d dVar1111111111111111111112 = dVar2;
                            int i21111111111111111111111111111111111111111110 = i14;
                            int i21111111111111111111111111111111111111111111 = i21111111111111111111111111111111111111111110 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111111111112, imageLoader, z11111111111111111111114, dVar1111111111111111111112)), title, str2, onClick, null, dVar1111111111111111111112, null, lVarV, (i21111111111111111111111111111111111111111110 & 14) | 3072 | (i21111111111111111111111111111111111111111110 & 112) | (i21111111111111111111111111111111111111111111 & 57344) | (i21111111111111111111111111111111111111111111 & 458752) | ((i21111111111111111111111111111111111111111110 >> 6) & 3670016) | (i21111111111111111111111111111111111111111111 & 234881024), 644);
                            dVar3 = dVar1111111111111111111112;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i14 |= 805306368;
                    dVar2 = dVar;
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str1111111111111111111113 = str3;
                        boolean z11111111111111111111115 = z15;
                        androidx.compose.ui.d dVar1111111111111111111113 = dVar2;
                        int i21111111111111111111111111111111111111111112 = i14;
                        int i21111111111111111111111111111111111111111113 = i21111111111111111111111111111111111111111112 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111111111113, imageLoader, z11111111111111111111115, dVar1111111111111111111113)), title, str2, onClick, null, dVar1111111111111111111113, null, lVarV, (i21111111111111111111111111111111111111111112 & 14) | 3072 | (i21111111111111111111111111111111111111111112 & 112) | (i21111111111111111111111111111111111111111113 & 57344) | (i21111111111111111111111111111111111111111113 & 458752) | ((i21111111111111111111111111111111111111111112 >> 6) & 3670016) | (i21111111111111111111111111111111111111111113 & 234881024), 644);
                        dVar3 = dVar1111111111111111111113;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str1111111111111111111114 = str3;
                        boolean z11111111111111111111116 = z15;
                        androidx.compose.ui.d dVar1111111111111111111114 = dVar2;
                        int i21111111111111111111111111111111111111111114 = i14;
                        int i21111111111111111111111111111111111111111115 = i21111111111111111111111111111111111111111114 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111111111114, imageLoader, z11111111111111111111116, dVar1111111111111111111114)), title, str2, onClick, null, dVar1111111111111111111114, null, lVarV, (i21111111111111111111111111111111111111111114 & 14) | 3072 | (i21111111111111111111111111111111111111111114 & 112) | (i21111111111111111111111111111111111111111115 & 57344) | (i21111111111111111111111111111111111111111115 & 458752) | ((i21111111111111111111111111111111111111111114 >> 6) & 3670016) | (i21111111111111111111111111111111111111111115 & 234881024), 644);
                        dVar3 = dVar1111111111111111111114;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i21 = 100663296;
                i14 |= i21;
                i22 = i13 & 512;
                if (i22 != 0) {
                    if ((i12 & 1879048192) == 0) {
                        dVar2 = dVar;
                        if (lVarV.n(dVar2)) {
                            i23 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i23 = 268435456;
                        }
                        i14 |= i23;
                    }
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str1111111111111111111115 = str3;
                        boolean z11111111111111111111117 = z15;
                        androidx.compose.ui.d dVar1111111111111111111115 = dVar2;
                        int i21111111111111111111111111111111111111111116 = i14;
                        int i21111111111111111111111111111111111111111117 = i21111111111111111111111111111111111111111116 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111111111115, imageLoader, z11111111111111111111117, dVar1111111111111111111115)), title, str2, onClick, null, dVar1111111111111111111115, null, lVarV, (i21111111111111111111111111111111111111111116 & 14) | 3072 | (i21111111111111111111111111111111111111111116 & 112) | (i21111111111111111111111111111111111111111117 & 57344) | (i21111111111111111111111111111111111111111117 & 458752) | ((i21111111111111111111111111111111111111111116 >> 6) & 3670016) | (i21111111111111111111111111111111111111111117 & 234881024), 644);
                        dVar3 = dVar1111111111111111111115;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str1111111111111111111116 = str3;
                        boolean z11111111111111111111118 = z15;
                        androidx.compose.ui.d dVar1111111111111111111116 = dVar2;
                        int i21111111111111111111111111111111111111111118 = i14;
                        int i21111111111111111111111111111111111111111119 = i21111111111111111111111111111111111111111118 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111111111116, imageLoader, z11111111111111111111118, dVar1111111111111111111116)), title, str2, onClick, null, dVar1111111111111111111116, null, lVarV, (i21111111111111111111111111111111111111111118 & 14) | 3072 | (i21111111111111111111111111111111111111111118 & 112) | (i21111111111111111111111111111111111111111119 & 57344) | (i21111111111111111111111111111111111111111119 & 458752) | ((i21111111111111111111111111111111111111111118 >> 6) & 3670016) | (i21111111111111111111111111111111111111111119 & 234881024), 644);
                        dVar3 = dVar1111111111111111111116;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i14 |= 805306368;
                dVar2 = dVar;
                if ((i14 & 1533916891) == 306783378) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str1111111111111111111117 = str3;
                    boolean z11111111111111111111119 = z15;
                    androidx.compose.ui.d dVar1111111111111111111117 = dVar2;
                    int i211111111111111111111111111111111111111111110 = i14;
                    int i211111111111111111111111111111111111111111111 = i211111111111111111111111111111111111111111110 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111111111117, imageLoader, z11111111111111111111119, dVar1111111111111111111117)), title, str2, onClick, null, dVar1111111111111111111117, null, lVarV, (i211111111111111111111111111111111111111111110 & 14) | 3072 | (i211111111111111111111111111111111111111111110 & 112) | (i211111111111111111111111111111111111111111111 & 57344) | (i211111111111111111111111111111111111111111111 & 458752) | ((i211111111111111111111111111111111111111111110 >> 6) & 3670016) | (i211111111111111111111111111111111111111111111 & 234881024), 644);
                    dVar3 = dVar1111111111111111111117;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str1111111111111111111118 = str3;
                    boolean z111111111111111111111110 = z15;
                    androidx.compose.ui.d dVar1111111111111111111118 = dVar2;
                    int i211111111111111111111111111111111111111111112 = i14;
                    int i211111111111111111111111111111111111111111113 = i211111111111111111111111111111111111111111112 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111111111118, imageLoader, z111111111111111111111110, dVar1111111111111111111118)), title, str2, onClick, null, dVar1111111111111111111118, null, lVarV, (i211111111111111111111111111111111111111111112 & 14) | 3072 | (i211111111111111111111111111111111111111111112 & 112) | (i211111111111111111111111111111111111111111113 & 57344) | (i211111111111111111111111111111111111111111113 & 458752) | ((i211111111111111111111111111111111111111111112 >> 6) & 3670016) | (i211111111111111111111111111111111111111111113 & 234881024), 644);
                    dVar3 = dVar1111111111111111111118;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                }
            }
            i14 |= 12582912;
            z15 = z13;
            if ((i13 & 256) != 0) {
                if ((i12 & 234881024) == 0) {
                    if (lVarV.K(onClick)) {
                        i21 = 67108864;
                    } else {
                        i21 = 33554432;
                    }
                }
                i22 = i13 & 512;
                if (i22 != 0) {
                    if ((i12 & 1879048192) == 0) {
                        dVar2 = dVar;
                        if (lVarV.n(dVar2)) {
                            i23 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i23 = 268435456;
                        }
                        i14 |= i23;
                    }
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str1111111111111111111119 = str3;
                        boolean z111111111111111111111111 = z15;
                        androidx.compose.ui.d dVar1111111111111111111119 = dVar2;
                        int i211111111111111111111111111111111111111111114 = i14;
                        int i211111111111111111111111111111111111111111115 = i211111111111111111111111111111111111111111114 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111111111119, imageLoader, z111111111111111111111111, dVar1111111111111111111119)), title, str2, onClick, null, dVar1111111111111111111119, null, lVarV, (i211111111111111111111111111111111111111111114 & 14) | 3072 | (i211111111111111111111111111111111111111111114 & 112) | (i211111111111111111111111111111111111111111115 & 57344) | (i211111111111111111111111111111111111111111115 & 458752) | ((i211111111111111111111111111111111111111111114 >> 6) & 3670016) | (i211111111111111111111111111111111111111111115 & 234881024), 644);
                        dVar3 = dVar1111111111111111111119;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str11111111111111111111110 = str3;
                        boolean z111111111111111111111112 = z15;
                        androidx.compose.ui.d dVar11111111111111111111110 = dVar2;
                        int i211111111111111111111111111111111111111111116 = i14;
                        int i211111111111111111111111111111111111111111117 = i211111111111111111111111111111111111111111116 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111111111110, imageLoader, z111111111111111111111112, dVar11111111111111111111110)), title, str2, onClick, null, dVar11111111111111111111110, null, lVarV, (i211111111111111111111111111111111111111111116 & 14) | 3072 | (i211111111111111111111111111111111111111111116 & 112) | (i211111111111111111111111111111111111111111117 & 57344) | (i211111111111111111111111111111111111111111117 & 458752) | ((i211111111111111111111111111111111111111111116 >> 6) & 3670016) | (i211111111111111111111111111111111111111111117 & 234881024), 644);
                        dVar3 = dVar11111111111111111111110;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i14 |= 805306368;
                dVar2 = dVar;
                if ((i14 & 1533916891) == 306783378) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str11111111111111111111111 = str3;
                    boolean z111111111111111111111113 = z15;
                    androidx.compose.ui.d dVar11111111111111111111111 = dVar2;
                    int i211111111111111111111111111111111111111111118 = i14;
                    int i211111111111111111111111111111111111111111119 = i211111111111111111111111111111111111111111118 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111111111111, imageLoader, z111111111111111111111113, dVar11111111111111111111111)), title, str2, onClick, null, dVar11111111111111111111111, null, lVarV, (i211111111111111111111111111111111111111111118 & 14) | 3072 | (i211111111111111111111111111111111111111111118 & 112) | (i211111111111111111111111111111111111111111119 & 57344) | (i211111111111111111111111111111111111111111119 & 458752) | ((i211111111111111111111111111111111111111111118 >> 6) & 3670016) | (i211111111111111111111111111111111111111111119 & 234881024), 644);
                    dVar3 = dVar11111111111111111111111;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str11111111111111111111112 = str3;
                    boolean z111111111111111111111114 = z15;
                    androidx.compose.ui.d dVar11111111111111111111112 = dVar2;
                    int i2111111111111111111111111111111111111111111110 = i14;
                    int i2111111111111111111111111111111111111111111111 = i2111111111111111111111111111111111111111111110 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111111111112, imageLoader, z111111111111111111111114, dVar11111111111111111111112)), title, str2, onClick, null, dVar11111111111111111111112, null, lVarV, (i2111111111111111111111111111111111111111111110 & 14) | 3072 | (i2111111111111111111111111111111111111111111110 & 112) | (i2111111111111111111111111111111111111111111111 & 57344) | (i2111111111111111111111111111111111111111111111 & 458752) | ((i2111111111111111111111111111111111111111111110 >> 6) & 3670016) | (i2111111111111111111111111111111111111111111111 & 234881024), 644);
                    dVar3 = dVar11111111111111111111112;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                }
            }
            i21 = 100663296;
            i14 |= i21;
            i22 = i13 & 512;
            if (i22 != 0) {
                if ((i12 & 1879048192) == 0) {
                    dVar2 = dVar;
                    if (lVarV.n(dVar2)) {
                        i23 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i23 = 268435456;
                    }
                    i14 |= i23;
                }
                if ((i14 & 1533916891) == 306783378) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str11111111111111111111113 = str3;
                    boolean z111111111111111111111115 = z15;
                    androidx.compose.ui.d dVar11111111111111111111113 = dVar2;
                    int i2111111111111111111111111111111111111111111112 = i14;
                    int i2111111111111111111111111111111111111111111113 = i2111111111111111111111111111111111111111111112 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111111111113, imageLoader, z111111111111111111111115, dVar11111111111111111111113)), title, str2, onClick, null, dVar11111111111111111111113, null, lVarV, (i2111111111111111111111111111111111111111111112 & 14) | 3072 | (i2111111111111111111111111111111111111111111112 & 112) | (i2111111111111111111111111111111111111111111113 & 57344) | (i2111111111111111111111111111111111111111111113 & 458752) | ((i2111111111111111111111111111111111111111111112 >> 6) & 3670016) | (i2111111111111111111111111111111111111111111113 & 234881024), 644);
                    dVar3 = dVar11111111111111111111113;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str11111111111111111111114 = str3;
                    boolean z111111111111111111111116 = z15;
                    androidx.compose.ui.d dVar11111111111111111111114 = dVar2;
                    int i2111111111111111111111111111111111111111111114 = i14;
                    int i2111111111111111111111111111111111111111111115 = i2111111111111111111111111111111111111111111114 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111111111114, imageLoader, z111111111111111111111116, dVar11111111111111111111114)), title, str2, onClick, null, dVar11111111111111111111114, null, lVarV, (i2111111111111111111111111111111111111111111114 & 14) | 3072 | (i2111111111111111111111111111111111111111111114 & 112) | (i2111111111111111111111111111111111111111111115 & 57344) | (i2111111111111111111111111111111111111111111115 & 458752) | ((i2111111111111111111111111111111111111111111114 >> 6) & 3670016) | (i2111111111111111111111111111111111111111111115 & 234881024), 644);
                    dVar3 = dVar11111111111111111111114;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                }
            }
            i14 |= 805306368;
            dVar2 = dVar;
            if ((i14 & 1533916891) == 306783378) {
                if (i22 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                }
                String str11111111111111111111115 = str3;
                boolean z111111111111111111111117 = z15;
                androidx.compose.ui.d dVar11111111111111111111115 = dVar2;
                int i2111111111111111111111111111111111111111111116 = i14;
                int i2111111111111111111111111111111111111111111117 = i2111111111111111111111111111111111111111111116 >> 3;
                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111111111115, imageLoader, z111111111111111111111117, dVar11111111111111111111115)), title, str2, onClick, null, dVar11111111111111111111115, null, lVarV, (i2111111111111111111111111111111111111111111116 & 14) | 3072 | (i2111111111111111111111111111111111111111111116 & 112) | (i2111111111111111111111111111111111111111111117 & 57344) | (i2111111111111111111111111111111111111111111117 & 458752) | ((i2111111111111111111111111111111111111111111116 >> 6) & 3670016) | (i2111111111111111111111111111111111111111111117 & 234881024), 644);
                dVar3 = dVar11111111111111111111115;
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            } else {
                if (i22 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                }
                String str11111111111111111111116 = str3;
                boolean z111111111111111111111118 = z15;
                androidx.compose.ui.d dVar11111111111111111111116 = dVar2;
                int i2111111111111111111111111111111111111111111118 = i14;
                int i2111111111111111111111111111111111111111111119 = i2111111111111111111111111111111111111111111118 >> 3;
                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111111111116, imageLoader, z111111111111111111111118, dVar11111111111111111111116)), title, str2, onClick, null, dVar11111111111111111111116, null, lVarV, (i2111111111111111111111111111111111111111111118 & 14) | 3072 | (i2111111111111111111111111111111111111111111118 & 112) | (i2111111111111111111111111111111111111111111119 & 57344) | (i2111111111111111111111111111111111111111111119 & 458752) | ((i2111111111111111111111111111111111111111111118 >> 6) & 3670016) | (i2111111111111111111111111111111111111111111119 & 234881024), 644);
                dVar3 = dVar11111111111111111111116;
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
            }
        }
        i17 = 196608;
        i14 |= i17;
        if ((i13 & 64) != 0) {
            if ((i12 & 3670016) == 0) {
                if (lVarV.n(str2)) {
                    i18 = PKIFailureInfo.badCertTemplate;
                } else {
                    i18 = PKIFailureInfo.signerNotTrusted;
                }
                i14 |= i18;
            }
            if ((i13 & 128) != 0) {
                if ((29360128 & i12) == 0) {
                    z15 = z13;
                    if (lVarV.p(z15)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i14 |= i19;
                }
                if ((i13 & 256) != 0) {
                    if ((i12 & 234881024) == 0) {
                        if (lVarV.K(onClick)) {
                            i21 = 67108864;
                        } else {
                            i21 = 33554432;
                        }
                    }
                    i22 = i13 & 512;
                    if (i22 != 0) {
                        if ((i12 & 1879048192) == 0) {
                            dVar2 = dVar;
                            if (lVarV.n(dVar2)) {
                                i23 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i23 = 268435456;
                            }
                            i14 |= i23;
                        }
                        if ((i14 & 1533916891) == 306783378) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str11111111111111111111117 = str3;
                            boolean z111111111111111111111119 = z15;
                            androidx.compose.ui.d dVar11111111111111111111117 = dVar2;
                            int i21111111111111111111111111111111111111111111110 = i14;
                            int i21111111111111111111111111111111111111111111111 = i21111111111111111111111111111111111111111111110 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111111111117, imageLoader, z111111111111111111111119, dVar11111111111111111111117)), title, str2, onClick, null, dVar11111111111111111111117, null, lVarV, (i21111111111111111111111111111111111111111111110 & 14) | 3072 | (i21111111111111111111111111111111111111111111110 & 112) | (i21111111111111111111111111111111111111111111111 & 57344) | (i21111111111111111111111111111111111111111111111 & 458752) | ((i21111111111111111111111111111111111111111111110 >> 6) & 3670016) | (i21111111111111111111111111111111111111111111111 & 234881024), 644);
                            dVar3 = dVar11111111111111111111117;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                            }
                            String str11111111111111111111118 = str3;
                            boolean z1111111111111111111111110 = z15;
                            androidx.compose.ui.d dVar11111111111111111111118 = dVar2;
                            int i21111111111111111111111111111111111111111111112 = i14;
                            int i21111111111111111111111111111111111111111111113 = i21111111111111111111111111111111111111111111112 >> 3;
                            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111111111118, imageLoader, z1111111111111111111111110, dVar11111111111111111111118)), title, str2, onClick, null, dVar11111111111111111111118, null, lVarV, (i21111111111111111111111111111111111111111111112 & 14) | 3072 | (i21111111111111111111111111111111111111111111112 & 112) | (i21111111111111111111111111111111111111111111113 & 57344) | (i21111111111111111111111111111111111111111111113 & 458752) | ((i21111111111111111111111111111111111111111111112 >> 6) & 3670016) | (i21111111111111111111111111111111111111111111113 & 234881024), 644);
                            dVar3 = dVar11111111111111111111118;
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                        }
                    }
                    i14 |= 805306368;
                    dVar2 = dVar;
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str11111111111111111111119 = str3;
                        boolean z1111111111111111111111111 = z15;
                        androidx.compose.ui.d dVar11111111111111111111119 = dVar2;
                        int i21111111111111111111111111111111111111111111114 = i14;
                        int i21111111111111111111111111111111111111111111115 = i21111111111111111111111111111111111111111111114 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111111111119, imageLoader, z1111111111111111111111111, dVar11111111111111111111119)), title, str2, onClick, null, dVar11111111111111111111119, null, lVarV, (i21111111111111111111111111111111111111111111114 & 14) | 3072 | (i21111111111111111111111111111111111111111111114 & 112) | (i21111111111111111111111111111111111111111111115 & 57344) | (i21111111111111111111111111111111111111111111115 & 458752) | ((i21111111111111111111111111111111111111111111114 >> 6) & 3670016) | (i21111111111111111111111111111111111111111111115 & 234881024), 644);
                        dVar3 = dVar11111111111111111111119;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str111111111111111111111110 = str3;
                        boolean z1111111111111111111111112 = z15;
                        androidx.compose.ui.d dVar111111111111111111111110 = dVar2;
                        int i21111111111111111111111111111111111111111111116 = i14;
                        int i21111111111111111111111111111111111111111111117 = i21111111111111111111111111111111111111111111116 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111111111111110, imageLoader, z1111111111111111111111112, dVar111111111111111111111110)), title, str2, onClick, null, dVar111111111111111111111110, null, lVarV, (i21111111111111111111111111111111111111111111116 & 14) | 3072 | (i21111111111111111111111111111111111111111111116 & 112) | (i21111111111111111111111111111111111111111111117 & 57344) | (i21111111111111111111111111111111111111111111117 & 458752) | ((i21111111111111111111111111111111111111111111116 >> 6) & 3670016) | (i21111111111111111111111111111111111111111111117 & 234881024), 644);
                        dVar3 = dVar111111111111111111111110;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i21 = 100663296;
                i14 |= i21;
                i22 = i13 & 512;
                if (i22 != 0) {
                    if ((i12 & 1879048192) == 0) {
                        dVar2 = dVar;
                        if (lVarV.n(dVar2)) {
                            i23 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i23 = 268435456;
                        }
                        i14 |= i23;
                    }
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str111111111111111111111111 = str3;
                        boolean z1111111111111111111111113 = z15;
                        androidx.compose.ui.d dVar111111111111111111111111 = dVar2;
                        int i21111111111111111111111111111111111111111111118 = i14;
                        int i21111111111111111111111111111111111111111111119 = i21111111111111111111111111111111111111111111118 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111111111111111, imageLoader, z1111111111111111111111113, dVar111111111111111111111111)), title, str2, onClick, null, dVar111111111111111111111111, null, lVarV, (i21111111111111111111111111111111111111111111118 & 14) | 3072 | (i21111111111111111111111111111111111111111111118 & 112) | (i21111111111111111111111111111111111111111111119 & 57344) | (i21111111111111111111111111111111111111111111119 & 458752) | ((i21111111111111111111111111111111111111111111118 >> 6) & 3670016) | (i21111111111111111111111111111111111111111111119 & 234881024), 644);
                        dVar3 = dVar111111111111111111111111;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str111111111111111111111112 = str3;
                        boolean z1111111111111111111111114 = z15;
                        androidx.compose.ui.d dVar111111111111111111111112 = dVar2;
                        int i211111111111111111111111111111111111111111111110 = i14;
                        int i211111111111111111111111111111111111111111111111 = i211111111111111111111111111111111111111111111110 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111111111111112, imageLoader, z1111111111111111111111114, dVar111111111111111111111112)), title, str2, onClick, null, dVar111111111111111111111112, null, lVarV, (i211111111111111111111111111111111111111111111110 & 14) | 3072 | (i211111111111111111111111111111111111111111111110 & 112) | (i211111111111111111111111111111111111111111111111 & 57344) | (i211111111111111111111111111111111111111111111111 & 458752) | ((i211111111111111111111111111111111111111111111110 >> 6) & 3670016) | (i211111111111111111111111111111111111111111111111 & 234881024), 644);
                        dVar3 = dVar111111111111111111111112;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i14 |= 805306368;
                dVar2 = dVar;
                if ((i14 & 1533916891) == 306783378) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str111111111111111111111113 = str3;
                    boolean z1111111111111111111111115 = z15;
                    androidx.compose.ui.d dVar111111111111111111111113 = dVar2;
                    int i211111111111111111111111111111111111111111111112 = i14;
                    int i211111111111111111111111111111111111111111111113 = i211111111111111111111111111111111111111111111112 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111111111111113, imageLoader, z1111111111111111111111115, dVar111111111111111111111113)), title, str2, onClick, null, dVar111111111111111111111113, null, lVarV, (i211111111111111111111111111111111111111111111112 & 14) | 3072 | (i211111111111111111111111111111111111111111111112 & 112) | (i211111111111111111111111111111111111111111111113 & 57344) | (i211111111111111111111111111111111111111111111113 & 458752) | ((i211111111111111111111111111111111111111111111112 >> 6) & 3670016) | (i211111111111111111111111111111111111111111111113 & 234881024), 644);
                    dVar3 = dVar111111111111111111111113;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str111111111111111111111114 = str3;
                    boolean z1111111111111111111111116 = z15;
                    androidx.compose.ui.d dVar111111111111111111111114 = dVar2;
                    int i211111111111111111111111111111111111111111111114 = i14;
                    int i211111111111111111111111111111111111111111111115 = i211111111111111111111111111111111111111111111114 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111111111111114, imageLoader, z1111111111111111111111116, dVar111111111111111111111114)), title, str2, onClick, null, dVar111111111111111111111114, null, lVarV, (i211111111111111111111111111111111111111111111114 & 14) | 3072 | (i211111111111111111111111111111111111111111111114 & 112) | (i211111111111111111111111111111111111111111111115 & 57344) | (i211111111111111111111111111111111111111111111115 & 458752) | ((i211111111111111111111111111111111111111111111114 >> 6) & 3670016) | (i211111111111111111111111111111111111111111111115 & 234881024), 644);
                    dVar3 = dVar111111111111111111111114;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                }
            }
            i14 |= 12582912;
            z15 = z13;
            if ((i13 & 256) != 0) {
                if ((i12 & 234881024) == 0) {
                    if (lVarV.K(onClick)) {
                        i21 = 67108864;
                    } else {
                        i21 = 33554432;
                    }
                }
                i22 = i13 & 512;
                if (i22 != 0) {
                    if ((i12 & 1879048192) == 0) {
                        dVar2 = dVar;
                        if (lVarV.n(dVar2)) {
                            i23 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i23 = 268435456;
                        }
                        i14 |= i23;
                    }
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str111111111111111111111115 = str3;
                        boolean z1111111111111111111111117 = z15;
                        androidx.compose.ui.d dVar111111111111111111111115 = dVar2;
                        int i211111111111111111111111111111111111111111111116 = i14;
                        int i211111111111111111111111111111111111111111111117 = i211111111111111111111111111111111111111111111116 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111111111111115, imageLoader, z1111111111111111111111117, dVar111111111111111111111115)), title, str2, onClick, null, dVar111111111111111111111115, null, lVarV, (i211111111111111111111111111111111111111111111116 & 14) | 3072 | (i211111111111111111111111111111111111111111111116 & 112) | (i211111111111111111111111111111111111111111111117 & 57344) | (i211111111111111111111111111111111111111111111117 & 458752) | ((i211111111111111111111111111111111111111111111116 >> 6) & 3670016) | (i211111111111111111111111111111111111111111111117 & 234881024), 644);
                        dVar3 = dVar111111111111111111111115;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str111111111111111111111116 = str3;
                        boolean z1111111111111111111111118 = z15;
                        androidx.compose.ui.d dVar111111111111111111111116 = dVar2;
                        int i211111111111111111111111111111111111111111111118 = i14;
                        int i211111111111111111111111111111111111111111111119 = i211111111111111111111111111111111111111111111118 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111111111111116, imageLoader, z1111111111111111111111118, dVar111111111111111111111116)), title, str2, onClick, null, dVar111111111111111111111116, null, lVarV, (i211111111111111111111111111111111111111111111118 & 14) | 3072 | (i211111111111111111111111111111111111111111111118 & 112) | (i211111111111111111111111111111111111111111111119 & 57344) | (i211111111111111111111111111111111111111111111119 & 458752) | ((i211111111111111111111111111111111111111111111118 >> 6) & 3670016) | (i211111111111111111111111111111111111111111111119 & 234881024), 644);
                        dVar3 = dVar111111111111111111111116;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i14 |= 805306368;
                dVar2 = dVar;
                if ((i14 & 1533916891) == 306783378) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str111111111111111111111117 = str3;
                    boolean z1111111111111111111111119 = z15;
                    androidx.compose.ui.d dVar111111111111111111111117 = dVar2;
                    int i2111111111111111111111111111111111111111111111110 = i14;
                    int i2111111111111111111111111111111111111111111111111 = i2111111111111111111111111111111111111111111111110 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111111111111117, imageLoader, z1111111111111111111111119, dVar111111111111111111111117)), title, str2, onClick, null, dVar111111111111111111111117, null, lVarV, (i2111111111111111111111111111111111111111111111110 & 14) | 3072 | (i2111111111111111111111111111111111111111111111110 & 112) | (i2111111111111111111111111111111111111111111111111 & 57344) | (i2111111111111111111111111111111111111111111111111 & 458752) | ((i2111111111111111111111111111111111111111111111110 >> 6) & 3670016) | (i2111111111111111111111111111111111111111111111111 & 234881024), 644);
                    dVar3 = dVar111111111111111111111117;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str111111111111111111111118 = str3;
                    boolean z11111111111111111111111110 = z15;
                    androidx.compose.ui.d dVar111111111111111111111118 = dVar2;
                    int i2111111111111111111111111111111111111111111111112 = i14;
                    int i2111111111111111111111111111111111111111111111113 = i2111111111111111111111111111111111111111111111112 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111111111111118, imageLoader, z11111111111111111111111110, dVar111111111111111111111118)), title, str2, onClick, null, dVar111111111111111111111118, null, lVarV, (i2111111111111111111111111111111111111111111111112 & 14) | 3072 | (i2111111111111111111111111111111111111111111111112 & 112) | (i2111111111111111111111111111111111111111111111113 & 57344) | (i2111111111111111111111111111111111111111111111113 & 458752) | ((i2111111111111111111111111111111111111111111111112 >> 6) & 3670016) | (i2111111111111111111111111111111111111111111111113 & 234881024), 644);
                    dVar3 = dVar111111111111111111111118;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                }
            }
            i21 = 100663296;
            i14 |= i21;
            i22 = i13 & 512;
            if (i22 != 0) {
                if ((i12 & 1879048192) == 0) {
                    dVar2 = dVar;
                    if (lVarV.n(dVar2)) {
                        i23 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i23 = 268435456;
                    }
                    i14 |= i23;
                }
                if ((i14 & 1533916891) == 306783378) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str111111111111111111111119 = str3;
                    boolean z11111111111111111111111111 = z15;
                    androidx.compose.ui.d dVar111111111111111111111119 = dVar2;
                    int i2111111111111111111111111111111111111111111111114 = i14;
                    int i2111111111111111111111111111111111111111111111115 = i2111111111111111111111111111111111111111111111114 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str111111111111111111111119, imageLoader, z11111111111111111111111111, dVar111111111111111111111119)), title, str2, onClick, null, dVar111111111111111111111119, null, lVarV, (i2111111111111111111111111111111111111111111111114 & 14) | 3072 | (i2111111111111111111111111111111111111111111111114 & 112) | (i2111111111111111111111111111111111111111111111115 & 57344) | (i2111111111111111111111111111111111111111111111115 & 458752) | ((i2111111111111111111111111111111111111111111111114 >> 6) & 3670016) | (i2111111111111111111111111111111111111111111111115 & 234881024), 644);
                    dVar3 = dVar111111111111111111111119;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str1111111111111111111111110 = str3;
                    boolean z11111111111111111111111112 = z15;
                    androidx.compose.ui.d dVar1111111111111111111111110 = dVar2;
                    int i2111111111111111111111111111111111111111111111116 = i14;
                    int i2111111111111111111111111111111111111111111111117 = i2111111111111111111111111111111111111111111111116 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111111111111110, imageLoader, z11111111111111111111111112, dVar1111111111111111111111110)), title, str2, onClick, null, dVar1111111111111111111111110, null, lVarV, (i2111111111111111111111111111111111111111111111116 & 14) | 3072 | (i2111111111111111111111111111111111111111111111116 & 112) | (i2111111111111111111111111111111111111111111111117 & 57344) | (i2111111111111111111111111111111111111111111111117 & 458752) | ((i2111111111111111111111111111111111111111111111116 >> 6) & 3670016) | (i2111111111111111111111111111111111111111111111117 & 234881024), 644);
                    dVar3 = dVar1111111111111111111111110;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                }
            }
            i14 |= 805306368;
            dVar2 = dVar;
            if ((i14 & 1533916891) == 306783378) {
                if (i22 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                }
                String str1111111111111111111111111 = str3;
                boolean z11111111111111111111111113 = z15;
                androidx.compose.ui.d dVar1111111111111111111111111 = dVar2;
                int i2111111111111111111111111111111111111111111111118 = i14;
                int i2111111111111111111111111111111111111111111111119 = i2111111111111111111111111111111111111111111111118 >> 3;
                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111111111111111, imageLoader, z11111111111111111111111113, dVar1111111111111111111111111)), title, str2, onClick, null, dVar1111111111111111111111111, null, lVarV, (i2111111111111111111111111111111111111111111111118 & 14) | 3072 | (i2111111111111111111111111111111111111111111111118 & 112) | (i2111111111111111111111111111111111111111111111119 & 57344) | (i2111111111111111111111111111111111111111111111119 & 458752) | ((i2111111111111111111111111111111111111111111111118 >> 6) & 3670016) | (i2111111111111111111111111111111111111111111111119 & 234881024), 644);
                dVar3 = dVar1111111111111111111111111;
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            } else {
                if (i22 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                }
                String str1111111111111111111111112 = str3;
                boolean z11111111111111111111111114 = z15;
                androidx.compose.ui.d dVar1111111111111111111111112 = dVar2;
                int i21111111111111111111111111111111111111111111111110 = i14;
                int i21111111111111111111111111111111111111111111111111 = i21111111111111111111111111111111111111111111111110 >> 3;
                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111111111111112, imageLoader, z11111111111111111111111114, dVar1111111111111111111111112)), title, str2, onClick, null, dVar1111111111111111111111112, null, lVarV, (i21111111111111111111111111111111111111111111111110 & 14) | 3072 | (i21111111111111111111111111111111111111111111111110 & 112) | (i21111111111111111111111111111111111111111111111111 & 57344) | (i21111111111111111111111111111111111111111111111111 & 458752) | ((i21111111111111111111111111111111111111111111111110 >> 6) & 3670016) | (i21111111111111111111111111111111111111111111111111 & 234881024), 644);
                dVar3 = dVar1111111111111111111111112;
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
            }
        }
        i14 |= 1572864;
        if ((i13 & 128) != 0) {
            if ((29360128 & i12) == 0) {
                z15 = z13;
                if (lVarV.p(z15)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i14 |= i19;
            }
            if ((i13 & 256) != 0) {
                if ((i12 & 234881024) == 0) {
                    if (lVarV.K(onClick)) {
                        i21 = 67108864;
                    } else {
                        i21 = 33554432;
                    }
                }
                i22 = i13 & 512;
                if (i22 != 0) {
                    if ((i12 & 1879048192) == 0) {
                        dVar2 = dVar;
                        if (lVarV.n(dVar2)) {
                            i23 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i23 = 268435456;
                        }
                        i14 |= i23;
                    }
                    if ((i14 & 1533916891) == 306783378) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str1111111111111111111111113 = str3;
                        boolean z11111111111111111111111115 = z15;
                        androidx.compose.ui.d dVar1111111111111111111111113 = dVar2;
                        int i21111111111111111111111111111111111111111111111112 = i14;
                        int i21111111111111111111111111111111111111111111111113 = i21111111111111111111111111111111111111111111111112 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111111111111113, imageLoader, z11111111111111111111111115, dVar1111111111111111111111113)), title, str2, onClick, null, dVar1111111111111111111111113, null, lVarV, (i21111111111111111111111111111111111111111111111112 & 14) | 3072 | (i21111111111111111111111111111111111111111111111112 & 112) | (i21111111111111111111111111111111111111111111111113 & 57344) | (i21111111111111111111111111111111111111111111111113 & 458752) | ((i21111111111111111111111111111111111111111111111112 >> 6) & 3670016) | (i21111111111111111111111111111111111111111111111113 & 234881024), 644);
                        dVar3 = dVar1111111111111111111111113;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                        }
                        String str1111111111111111111111114 = str3;
                        boolean z11111111111111111111111116 = z15;
                        androidx.compose.ui.d dVar1111111111111111111111114 = dVar2;
                        int i21111111111111111111111111111111111111111111111114 = i14;
                        int i21111111111111111111111111111111111111111111111115 = i21111111111111111111111111111111111111111111111114 >> 3;
                        m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111111111111114, imageLoader, z11111111111111111111111116, dVar1111111111111111111111114)), title, str2, onClick, null, dVar1111111111111111111111114, null, lVarV, (i21111111111111111111111111111111111111111111111114 & 14) | 3072 | (i21111111111111111111111111111111111111111111111114 & 112) | (i21111111111111111111111111111111111111111111111115 & 57344) | (i21111111111111111111111111111111111111111111111115 & 458752) | ((i21111111111111111111111111111111111111111111111114 >> 6) & 3670016) | (i21111111111111111111111111111111111111111111111115 & 234881024), 644);
                        dVar3 = dVar1111111111111111111111114;
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                    }
                }
                i14 |= 805306368;
                dVar2 = dVar;
                if ((i14 & 1533916891) == 306783378) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str1111111111111111111111115 = str3;
                    boolean z11111111111111111111111117 = z15;
                    androidx.compose.ui.d dVar1111111111111111111111115 = dVar2;
                    int i21111111111111111111111111111111111111111111111116 = i14;
                    int i21111111111111111111111111111111111111111111111117 = i21111111111111111111111111111111111111111111111116 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111111111111115, imageLoader, z11111111111111111111111117, dVar1111111111111111111111115)), title, str2, onClick, null, dVar1111111111111111111111115, null, lVarV, (i21111111111111111111111111111111111111111111111116 & 14) | 3072 | (i21111111111111111111111111111111111111111111111116 & 112) | (i21111111111111111111111111111111111111111111111117 & 57344) | (i21111111111111111111111111111111111111111111111117 & 458752) | ((i21111111111111111111111111111111111111111111111116 >> 6) & 3670016) | (i21111111111111111111111111111111111111111111111117 & 234881024), 644);
                    dVar3 = dVar1111111111111111111111115;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str1111111111111111111111116 = str3;
                    boolean z11111111111111111111111118 = z15;
                    androidx.compose.ui.d dVar1111111111111111111111116 = dVar2;
                    int i21111111111111111111111111111111111111111111111118 = i14;
                    int i21111111111111111111111111111111111111111111111119 = i21111111111111111111111111111111111111111111111118 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111111111111116, imageLoader, z11111111111111111111111118, dVar1111111111111111111111116)), title, str2, onClick, null, dVar1111111111111111111111116, null, lVarV, (i21111111111111111111111111111111111111111111111118 & 14) | 3072 | (i21111111111111111111111111111111111111111111111118 & 112) | (i21111111111111111111111111111111111111111111111119 & 57344) | (i21111111111111111111111111111111111111111111111119 & 458752) | ((i21111111111111111111111111111111111111111111111118 >> 6) & 3670016) | (i21111111111111111111111111111111111111111111111119 & 234881024), 644);
                    dVar3 = dVar1111111111111111111111116;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                }
            }
            i21 = 100663296;
            i14 |= i21;
            i22 = i13 & 512;
            if (i22 != 0) {
                if ((i12 & 1879048192) == 0) {
                    dVar2 = dVar;
                    if (lVarV.n(dVar2)) {
                        i23 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i23 = 268435456;
                    }
                    i14 |= i23;
                }
                if ((i14 & 1533916891) == 306783378) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str1111111111111111111111117 = str3;
                    boolean z11111111111111111111111119 = z15;
                    androidx.compose.ui.d dVar1111111111111111111111117 = dVar2;
                    int i211111111111111111111111111111111111111111111111110 = i14;
                    int i211111111111111111111111111111111111111111111111111 = i211111111111111111111111111111111111111111111111110 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111111111111117, imageLoader, z11111111111111111111111119, dVar1111111111111111111111117)), title, str2, onClick, null, dVar1111111111111111111111117, null, lVarV, (i211111111111111111111111111111111111111111111111110 & 14) | 3072 | (i211111111111111111111111111111111111111111111111110 & 112) | (i211111111111111111111111111111111111111111111111111 & 57344) | (i211111111111111111111111111111111111111111111111111 & 458752) | ((i211111111111111111111111111111111111111111111111110 >> 6) & 3670016) | (i211111111111111111111111111111111111111111111111111 & 234881024), 644);
                    dVar3 = dVar1111111111111111111111117;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str1111111111111111111111118 = str3;
                    boolean z111111111111111111111111110 = z15;
                    androidx.compose.ui.d dVar1111111111111111111111118 = dVar2;
                    int i211111111111111111111111111111111111111111111111112 = i14;
                    int i211111111111111111111111111111111111111111111111113 = i211111111111111111111111111111111111111111111111112 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111111111111118, imageLoader, z111111111111111111111111110, dVar1111111111111111111111118)), title, str2, onClick, null, dVar1111111111111111111111118, null, lVarV, (i211111111111111111111111111111111111111111111111112 & 14) | 3072 | (i211111111111111111111111111111111111111111111111112 & 112) | (i211111111111111111111111111111111111111111111111113 & 57344) | (i211111111111111111111111111111111111111111111111113 & 458752) | ((i211111111111111111111111111111111111111111111111112 >> 6) & 3670016) | (i211111111111111111111111111111111111111111111111113 & 234881024), 644);
                    dVar3 = dVar1111111111111111111111118;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                }
            }
            i14 |= 805306368;
            dVar2 = dVar;
            if ((i14 & 1533916891) == 306783378) {
                if (i22 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                }
                String str1111111111111111111111119 = str3;
                boolean z111111111111111111111111111 = z15;
                androidx.compose.ui.d dVar1111111111111111111111119 = dVar2;
                int i211111111111111111111111111111111111111111111111114 = i14;
                int i211111111111111111111111111111111111111111111111115 = i211111111111111111111111111111111111111111111111114 >> 3;
                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str1111111111111111111111119, imageLoader, z111111111111111111111111111, dVar1111111111111111111111119)), title, str2, onClick, null, dVar1111111111111111111111119, null, lVarV, (i211111111111111111111111111111111111111111111111114 & 14) | 3072 | (i211111111111111111111111111111111111111111111111114 & 112) | (i211111111111111111111111111111111111111111111111115 & 57344) | (i211111111111111111111111111111111111111111111111115 & 458752) | ((i211111111111111111111111111111111111111111111111114 >> 6) & 3670016) | (i211111111111111111111111111111111111111111111111115 & 234881024), 644);
                dVar3 = dVar1111111111111111111111119;
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            } else {
                if (i22 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                }
                String str11111111111111111111111110 = str3;
                boolean z111111111111111111111111112 = z15;
                androidx.compose.ui.d dVar11111111111111111111111110 = dVar2;
                int i211111111111111111111111111111111111111111111111116 = i14;
                int i211111111111111111111111111111111111111111111111117 = i211111111111111111111111111111111111111111111111116 >> 3;
                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111111111111110, imageLoader, z111111111111111111111111112, dVar11111111111111111111111110)), title, str2, onClick, null, dVar11111111111111111111111110, null, lVarV, (i211111111111111111111111111111111111111111111111116 & 14) | 3072 | (i211111111111111111111111111111111111111111111111116 & 112) | (i211111111111111111111111111111111111111111111111117 & 57344) | (i211111111111111111111111111111111111111111111111117 & 458752) | ((i211111111111111111111111111111111111111111111111116 >> 6) & 3670016) | (i211111111111111111111111111111111111111111111111117 & 234881024), 644);
                dVar3 = dVar11111111111111111111111110;
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
            }
        }
        i14 |= 12582912;
        z15 = z13;
        if ((i13 & 256) != 0) {
            if ((i12 & 234881024) == 0) {
                if (lVarV.K(onClick)) {
                    i21 = 67108864;
                } else {
                    i21 = 33554432;
                }
            }
            i22 = i13 & 512;
            if (i22 != 0) {
                if ((i12 & 1879048192) == 0) {
                    dVar2 = dVar;
                    if (lVarV.n(dVar2)) {
                        i23 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i23 = 268435456;
                    }
                    i14 |= i23;
                }
                if ((i14 & 1533916891) == 306783378) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str11111111111111111111111111 = str3;
                    boolean z111111111111111111111111113 = z15;
                    androidx.compose.ui.d dVar11111111111111111111111111 = dVar2;
                    int i211111111111111111111111111111111111111111111111118 = i14;
                    int i211111111111111111111111111111111111111111111111119 = i211111111111111111111111111111111111111111111111118 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111111111111111, imageLoader, z111111111111111111111111113, dVar11111111111111111111111111)), title, str2, onClick, null, dVar11111111111111111111111111, null, lVarV, (i211111111111111111111111111111111111111111111111118 & 14) | 3072 | (i211111111111111111111111111111111111111111111111118 & 112) | (i211111111111111111111111111111111111111111111111119 & 57344) | (i211111111111111111111111111111111111111111111111119 & 458752) | ((i211111111111111111111111111111111111111111111111118 >> 6) & 3670016) | (i211111111111111111111111111111111111111111111111119 & 234881024), 644);
                    dVar3 = dVar11111111111111111111111111;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                    }
                    String str11111111111111111111111112 = str3;
                    boolean z111111111111111111111111114 = z15;
                    androidx.compose.ui.d dVar11111111111111111111111112 = dVar2;
                    int i2111111111111111111111111111111111111111111111111110 = i14;
                    int i2111111111111111111111111111111111111111111111111111 = i2111111111111111111111111111111111111111111111111110 >> 3;
                    m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111111111111112, imageLoader, z111111111111111111111111114, dVar11111111111111111111111112)), title, str2, onClick, null, dVar11111111111111111111111112, null, lVarV, (i2111111111111111111111111111111111111111111111111110 & 14) | 3072 | (i2111111111111111111111111111111111111111111111111110 & 112) | (i2111111111111111111111111111111111111111111111111111 & 57344) | (i2111111111111111111111111111111111111111111111111111 & 458752) | ((i2111111111111111111111111111111111111111111111111110 >> 6) & 3670016) | (i2111111111111111111111111111111111111111111111111111 & 234881024), 644);
                    dVar3 = dVar11111111111111111111111112;
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
                }
            }
            i14 |= 805306368;
            dVar2 = dVar;
            if ((i14 & 1533916891) == 306783378) {
                if (i22 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                }
                String str11111111111111111111111113 = str3;
                boolean z111111111111111111111111115 = z15;
                androidx.compose.ui.d dVar11111111111111111111111113 = dVar2;
                int i2111111111111111111111111111111111111111111111111112 = i14;
                int i2111111111111111111111111111111111111111111111111113 = i2111111111111111111111111111111111111111111111111112 >> 3;
                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111111111111113, imageLoader, z111111111111111111111111115, dVar11111111111111111111111113)), title, str2, onClick, null, dVar11111111111111111111111113, null, lVarV, (i2111111111111111111111111111111111111111111111111112 & 14) | 3072 | (i2111111111111111111111111111111111111111111111111112 & 112) | (i2111111111111111111111111111111111111111111111111113 & 57344) | (i2111111111111111111111111111111111111111111111111113 & 458752) | ((i2111111111111111111111111111111111111111111111111112 >> 6) & 3670016) | (i2111111111111111111111111111111111111111111111111113 & 234881024), 644);
                dVar3 = dVar11111111111111111111111113;
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            } else {
                if (i22 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                }
                String str11111111111111111111111114 = str3;
                boolean z111111111111111111111111116 = z15;
                androidx.compose.ui.d dVar11111111111111111111111114 = dVar2;
                int i2111111111111111111111111111111111111111111111111114 = i14;
                int i2111111111111111111111111111111111111111111111111115 = i2111111111111111111111111111111111111111111111111114 >> 3;
                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111111111111114, imageLoader, z111111111111111111111111116, dVar11111111111111111111111114)), title, str2, onClick, null, dVar11111111111111111111111114, null, lVarV, (i2111111111111111111111111111111111111111111111111114 & 14) | 3072 | (i2111111111111111111111111111111111111111111111111114 & 112) | (i2111111111111111111111111111111111111111111111111115 & 57344) | (i2111111111111111111111111111111111111111111111111115 & 458752) | ((i2111111111111111111111111111111111111111111111111114 >> 6) & 3670016) | (i2111111111111111111111111111111111111111111111111115 & 234881024), 644);
                dVar3 = dVar11111111111111111111111114;
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
            }
        }
        i21 = 100663296;
        i14 |= i21;
        i22 = i13 & 512;
        if (i22 != 0) {
            if ((i12 & 1879048192) == 0) {
                dVar2 = dVar;
                if (lVarV.n(dVar2)) {
                    i23 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i23 = 268435456;
                }
                i14 |= i23;
            }
            if ((i14 & 1533916891) == 306783378) {
                if (i22 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                }
                String str11111111111111111111111115 = str3;
                boolean z111111111111111111111111117 = z15;
                androidx.compose.ui.d dVar11111111111111111111111115 = dVar2;
                int i2111111111111111111111111111111111111111111111111116 = i14;
                int i2111111111111111111111111111111111111111111111111117 = i2111111111111111111111111111111111111111111111111116 >> 3;
                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111111111111115, imageLoader, z111111111111111111111111117, dVar11111111111111111111111115)), title, str2, onClick, null, dVar11111111111111111111111115, null, lVarV, (i2111111111111111111111111111111111111111111111111116 & 14) | 3072 | (i2111111111111111111111111111111111111111111111111116 & 112) | (i2111111111111111111111111111111111111111111111111117 & 57344) | (i2111111111111111111111111111111111111111111111111117 & 458752) | ((i2111111111111111111111111111111111111111111111111116 >> 6) & 3670016) | (i2111111111111111111111111111111111111111111111111117 & 234881024), 644);
                dVar3 = dVar11111111111111111111111115;
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            } else {
                if (i22 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
                }
                String str11111111111111111111111116 = str3;
                boolean z111111111111111111111111118 = z15;
                androidx.compose.ui.d dVar11111111111111111111111116 = dVar2;
                int i2111111111111111111111111111111111111111111111111118 = i14;
                int i2111111111111111111111111111111111111111111111111119 = i2111111111111111111111111111111111111111111111111118 >> 3;
                m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111111111111116, imageLoader, z111111111111111111111111118, dVar11111111111111111111111116)), title, str2, onClick, null, dVar11111111111111111111111116, null, lVarV, (i2111111111111111111111111111111111111111111111111118 & 14) | 3072 | (i2111111111111111111111111111111111111111111111111118 & 112) | (i2111111111111111111111111111111111111111111111111119 & 57344) | (i2111111111111111111111111111111111111111111111111119 & 458752) | ((i2111111111111111111111111111111111111111111111111118 >> 6) & 3670016) | (i2111111111111111111111111111111111111111111111111119 & 234881024), 644);
                dVar3 = dVar11111111111111111111111116;
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
            }
        }
        i14 |= 805306368;
        dVar2 = dVar;
        if ((i14 & 1533916891) == 306783378) {
            if (i22 != 0) {
                dVar2 = androidx.compose.ui.d.INSTANCE;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
            }
            String str11111111111111111111111117 = str3;
            boolean z111111111111111111111111119 = z15;
            androidx.compose.ui.d dVar11111111111111111111111117 = dVar2;
            int i21111111111111111111111111111111111111111111111111110 = i14;
            int i21111111111111111111111111111111111111111111111111111 = i21111111111111111111111111111111111111111111111111110 >> 3;
            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111111111111117, imageLoader, z111111111111111111111111119, dVar11111111111111111111111117)), title, str2, onClick, null, dVar11111111111111111111111117, null, lVarV, (i21111111111111111111111111111111111111111111111111110 & 14) | 3072 | (i21111111111111111111111111111111111111111111111111110 & 112) | (i21111111111111111111111111111111111111111111111111111 & 57344) | (i21111111111111111111111111111111111111111111111111111 & 458752) | ((i21111111111111111111111111111111111111111111111111110 >> 6) & 3670016) | (i21111111111111111111111111111111111111111111111111111 & 234881024), 644);
            dVar3 = dVar11111111111111111111111117;
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        } else {
            if (i22 != 0) {
                dVar2 = androidx.compose.ui.d.INSTANCE;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-2072739375, i14, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:60)");
            }
            String str11111111111111111111111118 = str3;
            boolean z1111111111111111111111111110 = z15;
            androidx.compose.ui.d dVar11111111111111111111111118 = dVar2;
            int i21111111111111111111111111111111111111111111111111112 = i14;
            int i21111111111111111111111111111111111111111111111111113 = i21111111111111111111111111111111111111111111111111112 >> 3;
            m.a(z11, z14, false, z2.c.b(lVarV, -213494546, true, new c(i11, str11111111111111111111111118, imageLoader, z1111111111111111111111111110, dVar11111111111111111111111118)), title, str2, onClick, null, dVar11111111111111111111111118, null, lVarV, (i21111111111111111111111111111111111111111111111111112 & 14) | 3072 | (i21111111111111111111111111111111111111111111111111112 & 112) | (i21111111111111111111111111111111111111111111111111113 & 57344) | (i21111111111111111111111111111111111111111111111111113 & 458752) | ((i21111111111111111111111111111111111111111111111111112 >> 6) & 3670016) | (i21111111111111111111111111111111111111111111111111113 & 234881024), 644);
            dVar3 = dVar11111111111111111111111118;
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new d(z11, z12, i11, str, imageLoader, title, str2, z13, onClick, dVar3, i12, i13));
        }
    }

    public static final void b(boolean z11, boolean z12, DisplayablePaymentMethod displayablePaymentMethod, o90.f imageLoader, androidx.compose.ui.d dVar, p020r2.l lVar, int i11, int i12) {
        p013kotlin.jvm.internal.s.k(displayablePaymentMethod, "displayablePaymentMethod");
        p013kotlin.jvm.internal.s.k(imageLoader, "imageLoader");
        p020r2.l lVarV = lVar.v(-585829252);
        androidx.compose.ui.d dVar2 = (i12 & 16) != 0 ? androidx.compose.ui.d.INSTANCE : dVar;
        if (p020r2.o.J()) {
            p020r2.o.S(-585829252, i11, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:26)");
        }
        String lightThemeIconUrl = (!q1.m.a(lVarV, 0) || displayablePaymentMethod.getDarkThemeIconUrl() == null) ? displayablePaymentMethod.getLightThemeIconUrl() : displayablePaymentMethod.getDarkThemeIconUrl();
        int iconResource = displayablePaymentMethod.getIconResource();
        String strA = p90.a.a(displayablePaymentMethod.getDisplayName(), lVarV, 8);
        x30.c subtitle = displayablePaymentMethod.getSubtitle();
        lVarV.H(-1560062597);
        String strA2 = subtitle == null ? null : p90.a.a(subtitle, lVarV, 8);
        lVarV.T();
        a(z11, z12, iconResource, lightThemeIconUrl, imageLoader, strA, strA2, displayablePaymentMethod.getIconRequiresTinting(), new a(displayablePaymentMethod), s2.a(dVar2, "TEST_TAG_NEW_PAYMENT_METHOD_ROW_BUTTON_" + displayablePaymentMethod.getCode()), lVarV, (i11 & 126) | (o90.f.f96995g << 12) | ((i11 << 3) & 57344), 0);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(z11, z12, displayablePaymentMethod, imageLoader, dVar2, i11, i12));
        }
    }
}
