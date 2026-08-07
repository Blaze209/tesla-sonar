package p006gy;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.z0;
import androidx.compose.ui.viewinterop.f;
import com.google.android.gms.wallet.button.ButtonOptions;
import com.google.android.gms.wallet.button.PayButton;
import jn0.h0;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.o;
import p020r2.w2;
import w4.h;
import wn0.l;
import wn0.p;

/* JADX INFO: renamed from: gy.c, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a]\u0010\u000f\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lkotlin/Function0;", "Ljn0/h0;", "onClick", "", "allowedPaymentMethods", "Landroidx/compose/ui/d;", "modifier", "Lgy/a;", "theme", "Lgy/b;", "type", "Lw4/h;", "radius", "", "enabled", "a", "(Lwn0/a;Ljava/lang/String;Landroidx/compose/ui/d;Lgy/a;Lgy/b;FZLr2/l;II)V", "compose-pay-button_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Function0 {

    /* JADX INFO: renamed from: gy.c$a */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends u implements l<Context, PayButton> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p006gy.a f70020c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p006gy.b f70021d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f70022e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f70023f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p006gy.a aVar, p006gy.b bVar, int i11, String str) {
            super(1);
            this.f70020c = aVar;
            this.f70021d = bVar;
            this.f70022e = i11;
            this.f70023f = str;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayButton invoke(Context context) {
            s.k(context, "context");
            PayButton payButton = new PayButton(context);
            p006gy.a aVar = this.f70020c;
            p006gy.b bVar = this.f70021d;
            int i11 = this.f70022e;
            payButton.initialize(ButtonOptions.newBuilder().setButtonTheme(aVar.getValue()).setButtonType(bVar.getValue()).setCornerRadius(i11).setAllowedPaymentMethods(this.f70023f).build());
            return payButton;
        }
    }

    /* JADX INFO: renamed from: gy.c$b */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends u implements l<PayButton, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f70024c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f70025d;

        /* JADX INFO: renamed from: gy.c$b$a */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        static final class a implements View.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ wn0.a<h0> f70026a;

            a(wn0.a<h0> aVar) {
                this.f70026a = aVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f70026a.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z11, wn0.a<h0> aVar) {
            super(1);
            this.f70024c = z11;
            this.f70025d = aVar;
        }

        public final void a(PayButton button) {
            s.k(button, "button");
            boolean z11 = this.f70024c;
            wn0.a<h0> aVar = this.f70025d;
            button.setAlpha(z11 ? 1.0f : 0.5f);
            button.setEnabled(z11);
            if (z11) {
                button.setOnClickListener(new a(aVar));
            } else {
                button.setOnClickListener(null);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(PayButton payButton) {
            a(payButton);
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: gy.c$c */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f70027c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f70028d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f70029e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p006gy.a f70030f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p006gy.b f70031g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f70032h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f70033i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f70034j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f70035k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(wn0.a<h0> aVar, String str, d dVar, p006gy.a aVar2, p006gy.b bVar, float f11, boolean z11, int i11, int i12) {
            super(2);
            this.f70027c = aVar;
            this.f70028d = str;
            this.f70029e = dVar;
            this.f70030f = aVar2;
            this.f70031g = bVar;
            this.f70032h = f11;
            this.f70033i = z11;
            this.f70034j = i11;
            this.f70035k = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            Function0.a(this.f70027c, this.f70028d, this.f70029e, this.f70030f, this.f70031g, this.f70032h, this.f70033i, lVar, k2.a(this.f70034j | 1), this.f70035k);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0142 A[LOOP:0: B:99:0x0140->B:100:0x0142, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:103:0x0152  */
    /* JADX WARN: Code duplicated, block: B:105:0x015a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0180  */
    /* JADX WARN: Code duplicated, block: B:110:0x0188  */
    /* JADX WARN: Code duplicated, block: B:113:0x01af  */
    /* JADX WARN: Code duplicated, block: B:116:0x01ba A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:117:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:91:0x0103  */
    /* JADX WARN: Code duplicated, block: B:93:0x010d  */
    /* JADX WARN: Code duplicated, block: B:94:0x010f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0117  */
    public static final void a(wn0.a<h0> onClick, String allowedPaymentMethods, d dVar, p006gy.a aVar, p006gy.b bVar, float f11, boolean z11, p020r2.l lVar, int i11, int i12) {
        int i13;
        d dVar2;
        int i14;
        p006gy.a aVar2;
        int i15;
        int i16;
        p006gy.b bVar2;
        int i17;
        int i18;
        float fG;
        int i19;
        int i21;
        int i22;
        boolean z12;
        int iO1;
        Object[] objArr;
        int i23;
        boolean zN;
        Object objI;
        boolean zN2;
        Object objI2;
        p006gy.a aVar3;
        p006gy.b bVar3;
        float f12;
        w2 w2VarX;
        s.k(onClick, "onClick");
        s.k(allowedPaymentMethods, "allowedPaymentMethods");
        p020r2.l lVarV = lVar.v(-101155437);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (lVarV.K(onClick) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= lVarV.n(allowedPaymentMethods) ? 32 : 16;
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
                    aVar2 = aVar;
                    if (lVarV.n(aVar2)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 16;
                if (i16 != 0) {
                    if ((57344 & i11) == 0) {
                        bVar2 = bVar;
                        if (lVarV.n(bVar2)) {
                            i17 = 16384;
                        } else {
                            i17 = PKIFailureInfo.certRevoked;
                        }
                        i13 |= i17;
                    }
                    i18 = i12 & 32;
                    if (i18 != 0) {
                        if ((458752 & i11) == 0) {
                            fG = f11;
                            if (lVarV.q(fG)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i13 |= i19;
                        }
                        i21 = i12 & 64;
                        if (i21 != 0) {
                            i13 |= 1572864;
                        } else if ((i11 & 3670016) == 0) {
                            if (lVarV.p(z11)) {
                                i22 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i22 = PKIFailureInfo.signerNotTrusted;
                            }
                            i13 |= i22;
                        }
                        if ((i13 & 2995931) == 599186 || !lVarV.b()) {
                            if (i24 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i14 != 0) {
                                aVar2 = p006gy.a.Dark;
                            }
                            if (i16 != 0) {
                                bVar2 = p006gy.b.Buy;
                            }
                            if (i18 != 0) {
                                fG = h.g(100);
                            }
                            if (i21 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if (o.J()) {
                                o.S(-101155437, i13, -1, "com.google.pay.button.PayButton (PayButton.kt:49)");
                            }
                            iO1 = (int) ((w4.d) lVarV.U(z0.g())).O1(fG);
                            objArr = new Object[]{aVar2, bVar2, Integer.valueOf(iO1), allowedPaymentMethods};
                            lVarV.H(-568225417);
                            zN = false;
                            for (i23 = 0; i23 < 4; i23++) {
                                zN |= lVarV.n(objArr[i23]);
                            }
                            objI = lVarV.I();
                            if (zN || objI == p020r2.l.INSTANCE.a()) {
                                objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                                lVarV.B(objI);
                            }
                            lVarV.T();
                            l lVar2 = (l) objI;
                            Boolean boolValueOf = Boolean.valueOf(z12);
                            lVarV.H(511388516);
                            zN2 = lVarV.n(boolValueOf) | lVarV.n(onClick);
                            objI2 = lVarV.I();
                            if (zN2 || objI2 == p020r2.l.INSTANCE.a()) {
                                objI2 = new b(z12, onClick);
                                lVarV.B(objI2);
                            }
                            lVarV.T();
                            f.a(lVar2, dVar2, (l) objI2, lVarV, (i13 >> 3) & 112, 0);
                            if (o.J()) {
                                o.R();
                            }
                        } else {
                            lVarV.j();
                            z12 = z11;
                        }
                        aVar3 = aVar2;
                        bVar3 = bVar2;
                        f12 = fG;
                        w2VarX = lVarV.x();
                        if (w2VarX == null) {
                            return;
                        }
                        w2VarX.a(new c(onClick, allowedPaymentMethods, dVar2, aVar3, bVar3, f12, z12, i11, i12));
                    }
                    i13 |= 196608;
                    fG = f11;
                    i21 = i12 & 64;
                    if (i21 != 0) {
                        i13 |= 1572864;
                    } else if ((i11 & 3670016) == 0) {
                        if (lVarV.p(z11)) {
                            i22 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i22 = PKIFailureInfo.signerNotTrusted;
                        }
                        i13 |= i22;
                    }
                    if ((i13 & 2995931) == 599186) {
                        if (i24 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i14 != 0) {
                            aVar2 = p006gy.a.Dark;
                        }
                        if (i16 != 0) {
                            bVar2 = p006gy.b.Buy;
                        }
                        if (i18 != 0) {
                            fG = h.g(100);
                        }
                        if (i21 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (o.J()) {
                            o.S(-101155437, i13, -1, "com.google.pay.button.PayButton (PayButton.kt:49)");
                        }
                        iO1 = (int) ((w4.d) lVarV.U(z0.g())).O1(fG);
                        objArr = new Object[]{aVar2, bVar2, Integer.valueOf(iO1), allowedPaymentMethods};
                        lVarV.H(-568225417);
                        zN = false;
                        while (i23 < 4) {
                            zN |= lVarV.n(objArr[i23]);
                        }
                        objI = lVarV.I();
                        if (zN) {
                            objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                            lVarV.B(objI);
                        } else {
                            objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                            lVarV.B(objI);
                        }
                        lVarV.T();
                        l lVar3 = (l) objI;
                        Boolean boolValueOf2 = Boolean.valueOf(z12);
                        lVarV.H(511388516);
                        zN2 = lVarV.n(boolValueOf2) | lVarV.n(onClick);
                        objI2 = lVarV.I();
                        if (zN2) {
                            objI2 = new b(z12, onClick);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new b(z12, onClick);
                            lVarV.B(objI2);
                        }
                        lVarV.T();
                        f.a(lVar3, dVar2, (l) objI2, lVarV, (i13 >> 3) & 112, 0);
                        if (o.J()) {
                            o.R();
                        }
                    } else {
                        if (i24 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i14 != 0) {
                            aVar2 = p006gy.a.Dark;
                        }
                        if (i16 != 0) {
                            bVar2 = p006gy.b.Buy;
                        }
                        if (i18 != 0) {
                            fG = h.g(100);
                        }
                        if (i21 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (o.J()) {
                            o.S(-101155437, i13, -1, "com.google.pay.button.PayButton (PayButton.kt:49)");
                        }
                        iO1 = (int) ((w4.d) lVarV.U(z0.g())).O1(fG);
                        objArr = new Object[]{aVar2, bVar2, Integer.valueOf(iO1), allowedPaymentMethods};
                        lVarV.H(-568225417);
                        zN = false;
                        while (i23 < 4) {
                            zN |= lVarV.n(objArr[i23]);
                        }
                        objI = lVarV.I();
                        if (zN) {
                            objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                            lVarV.B(objI);
                        } else {
                            objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                            lVarV.B(objI);
                        }
                        lVarV.T();
                        l lVar4 = (l) objI;
                        Boolean boolValueOf3 = Boolean.valueOf(z12);
                        lVarV.H(511388516);
                        zN2 = lVarV.n(boolValueOf3) | lVarV.n(onClick);
                        objI2 = lVarV.I();
                        if (zN2) {
                            objI2 = new b(z12, onClick);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new b(z12, onClick);
                            lVarV.B(objI2);
                        }
                        lVarV.T();
                        f.a(lVar4, dVar2, (l) objI2, lVarV, (i13 >> 3) & 112, 0);
                        if (o.J()) {
                            o.R();
                        }
                    }
                    aVar3 = aVar2;
                    bVar3 = bVar2;
                    f12 = fG;
                    w2VarX = lVarV.x();
                    if (w2VarX == null) {
                        return;
                    }
                    w2VarX.a(new c(onClick, allowedPaymentMethods, dVar2, aVar3, bVar3, f12, z12, i11, i12));
                }
                i13 |= 24576;
                bVar2 = bVar;
                i18 = i12 & 32;
                if (i18 != 0) {
                    if ((458752 & i11) == 0) {
                        fG = f11;
                        if (lVarV.q(fG)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                    i21 = i12 & 64;
                    if (i21 != 0) {
                        i13 |= 1572864;
                    } else if ((i11 & 3670016) == 0) {
                        if (lVarV.p(z11)) {
                            i22 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i22 = PKIFailureInfo.signerNotTrusted;
                        }
                        i13 |= i22;
                    }
                    if ((i13 & 2995931) == 599186) {
                        if (i24 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i14 != 0) {
                            aVar2 = p006gy.a.Dark;
                        }
                        if (i16 != 0) {
                            bVar2 = p006gy.b.Buy;
                        }
                        if (i18 != 0) {
                            fG = h.g(100);
                        }
                        if (i21 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (o.J()) {
                            o.S(-101155437, i13, -1, "com.google.pay.button.PayButton (PayButton.kt:49)");
                        }
                        iO1 = (int) ((w4.d) lVarV.U(z0.g())).O1(fG);
                        objArr = new Object[]{aVar2, bVar2, Integer.valueOf(iO1), allowedPaymentMethods};
                        lVarV.H(-568225417);
                        zN = false;
                        while (i23 < 4) {
                            zN |= lVarV.n(objArr[i23]);
                        }
                        objI = lVarV.I();
                        if (zN) {
                            objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                            lVarV.B(objI);
                        } else {
                            objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                            lVarV.B(objI);
                        }
                        lVarV.T();
                        l lVar5 = (l) objI;
                        Boolean boolValueOf4 = Boolean.valueOf(z12);
                        lVarV.H(511388516);
                        zN2 = lVarV.n(boolValueOf4) | lVarV.n(onClick);
                        objI2 = lVarV.I();
                        if (zN2) {
                            objI2 = new b(z12, onClick);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new b(z12, onClick);
                            lVarV.B(objI2);
                        }
                        lVarV.T();
                        f.a(lVar5, dVar2, (l) objI2, lVarV, (i13 >> 3) & 112, 0);
                        if (o.J()) {
                            o.R();
                        }
                    } else {
                        if (i24 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i14 != 0) {
                            aVar2 = p006gy.a.Dark;
                        }
                        if (i16 != 0) {
                            bVar2 = p006gy.b.Buy;
                        }
                        if (i18 != 0) {
                            fG = h.g(100);
                        }
                        if (i21 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (o.J()) {
                            o.S(-101155437, i13, -1, "com.google.pay.button.PayButton (PayButton.kt:49)");
                        }
                        iO1 = (int) ((w4.d) lVarV.U(z0.g())).O1(fG);
                        objArr = new Object[]{aVar2, bVar2, Integer.valueOf(iO1), allowedPaymentMethods};
                        lVarV.H(-568225417);
                        zN = false;
                        while (i23 < 4) {
                            zN |= lVarV.n(objArr[i23]);
                        }
                        objI = lVarV.I();
                        if (zN) {
                            objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                            lVarV.B(objI);
                        } else {
                            objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                            lVarV.B(objI);
                        }
                        lVarV.T();
                        l lVar6 = (l) objI;
                        Boolean boolValueOf5 = Boolean.valueOf(z12);
                        lVarV.H(511388516);
                        zN2 = lVarV.n(boolValueOf5) | lVarV.n(onClick);
                        objI2 = lVarV.I();
                        if (zN2) {
                            objI2 = new b(z12, onClick);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new b(z12, onClick);
                            lVarV.B(objI2);
                        }
                        lVarV.T();
                        f.a(lVar6, dVar2, (l) objI2, lVarV, (i13 >> 3) & 112, 0);
                        if (o.J()) {
                            o.R();
                        }
                    }
                    aVar3 = aVar2;
                    bVar3 = bVar2;
                    f12 = fG;
                    w2VarX = lVarV.x();
                    if (w2VarX == null) {
                        return;
                    }
                    w2VarX.a(new c(onClick, allowedPaymentMethods, dVar2, aVar3, bVar3, f12, z12, i11, i12));
                }
                i13 |= 196608;
                fG = f11;
                i21 = i12 & 64;
                if (i21 != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (lVarV.p(z11)) {
                        i22 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i22 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i22;
                }
                if ((i13 & 2995931) == 599186) {
                    if (i24 != 0) {
                        dVar2 = d.INSTANCE;
                    }
                    if (i14 != 0) {
                        aVar2 = p006gy.a.Dark;
                    }
                    if (i16 != 0) {
                        bVar2 = p006gy.b.Buy;
                    }
                    if (i18 != 0) {
                        fG = h.g(100);
                    }
                    if (i21 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (o.J()) {
                        o.S(-101155437, i13, -1, "com.google.pay.button.PayButton (PayButton.kt:49)");
                    }
                    iO1 = (int) ((w4.d) lVarV.U(z0.g())).O1(fG);
                    objArr = new Object[]{aVar2, bVar2, Integer.valueOf(iO1), allowedPaymentMethods};
                    lVarV.H(-568225417);
                    zN = false;
                    while (i23 < 4) {
                        zN |= lVarV.n(objArr[i23]);
                    }
                    objI = lVarV.I();
                    if (zN) {
                        objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                        lVarV.B(objI);
                    } else {
                        objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    l lVar7 = (l) objI;
                    Boolean boolValueOf6 = Boolean.valueOf(z12);
                    lVarV.H(511388516);
                    zN2 = lVarV.n(boolValueOf6) | lVarV.n(onClick);
                    objI2 = lVarV.I();
                    if (zN2) {
                        objI2 = new b(z12, onClick);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new b(z12, onClick);
                        lVarV.B(objI2);
                    }
                    lVarV.T();
                    f.a(lVar7, dVar2, (l) objI2, lVarV, (i13 >> 3) & 112, 0);
                    if (o.J()) {
                        o.R();
                    }
                } else {
                    if (i24 != 0) {
                        dVar2 = d.INSTANCE;
                    }
                    if (i14 != 0) {
                        aVar2 = p006gy.a.Dark;
                    }
                    if (i16 != 0) {
                        bVar2 = p006gy.b.Buy;
                    }
                    if (i18 != 0) {
                        fG = h.g(100);
                    }
                    if (i21 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (o.J()) {
                        o.S(-101155437, i13, -1, "com.google.pay.button.PayButton (PayButton.kt:49)");
                    }
                    iO1 = (int) ((w4.d) lVarV.U(z0.g())).O1(fG);
                    objArr = new Object[]{aVar2, bVar2, Integer.valueOf(iO1), allowedPaymentMethods};
                    lVarV.H(-568225417);
                    zN = false;
                    while (i23 < 4) {
                        zN |= lVarV.n(objArr[i23]);
                    }
                    objI = lVarV.I();
                    if (zN) {
                        objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                        lVarV.B(objI);
                    } else {
                        objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    l lVar8 = (l) objI;
                    Boolean boolValueOf7 = Boolean.valueOf(z12);
                    lVarV.H(511388516);
                    zN2 = lVarV.n(boolValueOf7) | lVarV.n(onClick);
                    objI2 = lVarV.I();
                    if (zN2) {
                        objI2 = new b(z12, onClick);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new b(z12, onClick);
                        lVarV.B(objI2);
                    }
                    lVarV.T();
                    f.a(lVar8, dVar2, (l) objI2, lVarV, (i13 >> 3) & 112, 0);
                    if (o.J()) {
                        o.R();
                    }
                }
                aVar3 = aVar2;
                bVar3 = bVar2;
                f12 = fG;
                w2VarX = lVarV.x();
                if (w2VarX == null) {
                    return;
                }
                w2VarX.a(new c(onClick, allowedPaymentMethods, dVar2, aVar3, bVar3, f12, z12, i11, i12));
            }
            i13 |= 3072;
            aVar2 = aVar;
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((57344 & i11) == 0) {
                    bVar2 = bVar;
                    if (lVarV.n(bVar2)) {
                        i17 = 16384;
                    } else {
                        i17 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 32;
                if (i18 != 0) {
                    if ((458752 & i11) == 0) {
                        fG = f11;
                        if (lVarV.q(fG)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                    i21 = i12 & 64;
                    if (i21 != 0) {
                        i13 |= 1572864;
                    } else if ((i11 & 3670016) == 0) {
                        if (lVarV.p(z11)) {
                            i22 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i22 = PKIFailureInfo.signerNotTrusted;
                        }
                        i13 |= i22;
                    }
                    if ((i13 & 2995931) == 599186) {
                        if (i24 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i14 != 0) {
                            aVar2 = p006gy.a.Dark;
                        }
                        if (i16 != 0) {
                            bVar2 = p006gy.b.Buy;
                        }
                        if (i18 != 0) {
                            fG = h.g(100);
                        }
                        if (i21 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (o.J()) {
                            o.S(-101155437, i13, -1, "com.google.pay.button.PayButton (PayButton.kt:49)");
                        }
                        iO1 = (int) ((w4.d) lVarV.U(z0.g())).O1(fG);
                        objArr = new Object[]{aVar2, bVar2, Integer.valueOf(iO1), allowedPaymentMethods};
                        lVarV.H(-568225417);
                        zN = false;
                        while (i23 < 4) {
                            zN |= lVarV.n(objArr[i23]);
                        }
                        objI = lVarV.I();
                        if (zN) {
                            objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                            lVarV.B(objI);
                        } else {
                            objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                            lVarV.B(objI);
                        }
                        lVarV.T();
                        l lVar9 = (l) objI;
                        Boolean boolValueOf8 = Boolean.valueOf(z12);
                        lVarV.H(511388516);
                        zN2 = lVarV.n(boolValueOf8) | lVarV.n(onClick);
                        objI2 = lVarV.I();
                        if (zN2) {
                            objI2 = new b(z12, onClick);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new b(z12, onClick);
                            lVarV.B(objI2);
                        }
                        lVarV.T();
                        f.a(lVar9, dVar2, (l) objI2, lVarV, (i13 >> 3) & 112, 0);
                        if (o.J()) {
                            o.R();
                        }
                    } else {
                        if (i24 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i14 != 0) {
                            aVar2 = p006gy.a.Dark;
                        }
                        if (i16 != 0) {
                            bVar2 = p006gy.b.Buy;
                        }
                        if (i18 != 0) {
                            fG = h.g(100);
                        }
                        if (i21 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (o.J()) {
                            o.S(-101155437, i13, -1, "com.google.pay.button.PayButton (PayButton.kt:49)");
                        }
                        iO1 = (int) ((w4.d) lVarV.U(z0.g())).O1(fG);
                        objArr = new Object[]{aVar2, bVar2, Integer.valueOf(iO1), allowedPaymentMethods};
                        lVarV.H(-568225417);
                        zN = false;
                        while (i23 < 4) {
                            zN |= lVarV.n(objArr[i23]);
                        }
                        objI = lVarV.I();
                        if (zN) {
                            objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                            lVarV.B(objI);
                        } else {
                            objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                            lVarV.B(objI);
                        }
                        lVarV.T();
                        l lVar10 = (l) objI;
                        Boolean boolValueOf9 = Boolean.valueOf(z12);
                        lVarV.H(511388516);
                        zN2 = lVarV.n(boolValueOf9) | lVarV.n(onClick);
                        objI2 = lVarV.I();
                        if (zN2) {
                            objI2 = new b(z12, onClick);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new b(z12, onClick);
                            lVarV.B(objI2);
                        }
                        lVarV.T();
                        f.a(lVar10, dVar2, (l) objI2, lVarV, (i13 >> 3) & 112, 0);
                        if (o.J()) {
                            o.R();
                        }
                    }
                    aVar3 = aVar2;
                    bVar3 = bVar2;
                    f12 = fG;
                    w2VarX = lVarV.x();
                    if (w2VarX == null) {
                        return;
                    }
                    w2VarX.a(new c(onClick, allowedPaymentMethods, dVar2, aVar3, bVar3, f12, z12, i11, i12));
                }
                i13 |= 196608;
                fG = f11;
                i21 = i12 & 64;
                if (i21 != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (lVarV.p(z11)) {
                        i22 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i22 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i22;
                }
                if ((i13 & 2995931) == 599186) {
                    if (i24 != 0) {
                        dVar2 = d.INSTANCE;
                    }
                    if (i14 != 0) {
                        aVar2 = p006gy.a.Dark;
                    }
                    if (i16 != 0) {
                        bVar2 = p006gy.b.Buy;
                    }
                    if (i18 != 0) {
                        fG = h.g(100);
                    }
                    if (i21 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (o.J()) {
                        o.S(-101155437, i13, -1, "com.google.pay.button.PayButton (PayButton.kt:49)");
                    }
                    iO1 = (int) ((w4.d) lVarV.U(z0.g())).O1(fG);
                    objArr = new Object[]{aVar2, bVar2, Integer.valueOf(iO1), allowedPaymentMethods};
                    lVarV.H(-568225417);
                    zN = false;
                    while (i23 < 4) {
                        zN |= lVarV.n(objArr[i23]);
                    }
                    objI = lVarV.I();
                    if (zN) {
                        objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                        lVarV.B(objI);
                    } else {
                        objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    l lVar11 = (l) objI;
                    Boolean boolValueOf10 = Boolean.valueOf(z12);
                    lVarV.H(511388516);
                    zN2 = lVarV.n(boolValueOf10) | lVarV.n(onClick);
                    objI2 = lVarV.I();
                    if (zN2) {
                        objI2 = new b(z12, onClick);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new b(z12, onClick);
                        lVarV.B(objI2);
                    }
                    lVarV.T();
                    f.a(lVar11, dVar2, (l) objI2, lVarV, (i13 >> 3) & 112, 0);
                    if (o.J()) {
                        o.R();
                    }
                } else {
                    if (i24 != 0) {
                        dVar2 = d.INSTANCE;
                    }
                    if (i14 != 0) {
                        aVar2 = p006gy.a.Dark;
                    }
                    if (i16 != 0) {
                        bVar2 = p006gy.b.Buy;
                    }
                    if (i18 != 0) {
                        fG = h.g(100);
                    }
                    if (i21 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (o.J()) {
                        o.S(-101155437, i13, -1, "com.google.pay.button.PayButton (PayButton.kt:49)");
                    }
                    iO1 = (int) ((w4.d) lVarV.U(z0.g())).O1(fG);
                    objArr = new Object[]{aVar2, bVar2, Integer.valueOf(iO1), allowedPaymentMethods};
                    lVarV.H(-568225417);
                    zN = false;
                    while (i23 < 4) {
                        zN |= lVarV.n(objArr[i23]);
                    }
                    objI = lVarV.I();
                    if (zN) {
                        objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                        lVarV.B(objI);
                    } else {
                        objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    l lVar12 = (l) objI;
                    Boolean boolValueOf11 = Boolean.valueOf(z12);
                    lVarV.H(511388516);
                    zN2 = lVarV.n(boolValueOf11) | lVarV.n(onClick);
                    objI2 = lVarV.I();
                    if (zN2) {
                        objI2 = new b(z12, onClick);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new b(z12, onClick);
                        lVarV.B(objI2);
                    }
                    lVarV.T();
                    f.a(lVar12, dVar2, (l) objI2, lVarV, (i13 >> 3) & 112, 0);
                    if (o.J()) {
                        o.R();
                    }
                }
                aVar3 = aVar2;
                bVar3 = bVar2;
                f12 = fG;
                w2VarX = lVarV.x();
                if (w2VarX == null) {
                    return;
                }
                w2VarX.a(new c(onClick, allowedPaymentMethods, dVar2, aVar3, bVar3, f12, z12, i11, i12));
            }
            i13 |= 24576;
            bVar2 = bVar;
            i18 = i12 & 32;
            if (i18 != 0) {
                if ((458752 & i11) == 0) {
                    fG = f11;
                    if (lVarV.q(fG)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                i21 = i12 & 64;
                if (i21 != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (lVarV.p(z11)) {
                        i22 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i22 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i22;
                }
                if ((i13 & 2995931) == 599186) {
                    if (i24 != 0) {
                        dVar2 = d.INSTANCE;
                    }
                    if (i14 != 0) {
                        aVar2 = p006gy.a.Dark;
                    }
                    if (i16 != 0) {
                        bVar2 = p006gy.b.Buy;
                    }
                    if (i18 != 0) {
                        fG = h.g(100);
                    }
                    if (i21 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (o.J()) {
                        o.S(-101155437, i13, -1, "com.google.pay.button.PayButton (PayButton.kt:49)");
                    }
                    iO1 = (int) ((w4.d) lVarV.U(z0.g())).O1(fG);
                    objArr = new Object[]{aVar2, bVar2, Integer.valueOf(iO1), allowedPaymentMethods};
                    lVarV.H(-568225417);
                    zN = false;
                    while (i23 < 4) {
                        zN |= lVarV.n(objArr[i23]);
                    }
                    objI = lVarV.I();
                    if (zN) {
                        objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                        lVarV.B(objI);
                    } else {
                        objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    l lVar13 = (l) objI;
                    Boolean boolValueOf12 = Boolean.valueOf(z12);
                    lVarV.H(511388516);
                    zN2 = lVarV.n(boolValueOf12) | lVarV.n(onClick);
                    objI2 = lVarV.I();
                    if (zN2) {
                        objI2 = new b(z12, onClick);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new b(z12, onClick);
                        lVarV.B(objI2);
                    }
                    lVarV.T();
                    f.a(lVar13, dVar2, (l) objI2, lVarV, (i13 >> 3) & 112, 0);
                    if (o.J()) {
                        o.R();
                    }
                } else {
                    if (i24 != 0) {
                        dVar2 = d.INSTANCE;
                    }
                    if (i14 != 0) {
                        aVar2 = p006gy.a.Dark;
                    }
                    if (i16 != 0) {
                        bVar2 = p006gy.b.Buy;
                    }
                    if (i18 != 0) {
                        fG = h.g(100);
                    }
                    if (i21 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (o.J()) {
                        o.S(-101155437, i13, -1, "com.google.pay.button.PayButton (PayButton.kt:49)");
                    }
                    iO1 = (int) ((w4.d) lVarV.U(z0.g())).O1(fG);
                    objArr = new Object[]{aVar2, bVar2, Integer.valueOf(iO1), allowedPaymentMethods};
                    lVarV.H(-568225417);
                    zN = false;
                    while (i23 < 4) {
                        zN |= lVarV.n(objArr[i23]);
                    }
                    objI = lVarV.I();
                    if (zN) {
                        objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                        lVarV.B(objI);
                    } else {
                        objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    l lVar14 = (l) objI;
                    Boolean boolValueOf13 = Boolean.valueOf(z12);
                    lVarV.H(511388516);
                    zN2 = lVarV.n(boolValueOf13) | lVarV.n(onClick);
                    objI2 = lVarV.I();
                    if (zN2) {
                        objI2 = new b(z12, onClick);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new b(z12, onClick);
                        lVarV.B(objI2);
                    }
                    lVarV.T();
                    f.a(lVar14, dVar2, (l) objI2, lVarV, (i13 >> 3) & 112, 0);
                    if (o.J()) {
                        o.R();
                    }
                }
                aVar3 = aVar2;
                bVar3 = bVar2;
                f12 = fG;
                w2VarX = lVarV.x();
                if (w2VarX == null) {
                    return;
                }
                w2VarX.a(new c(onClick, allowedPaymentMethods, dVar2, aVar3, bVar3, f12, z12, i11, i12));
            }
            i13 |= 196608;
            fG = f11;
            i21 = i12 & 64;
            if (i21 != 0) {
                i13 |= 1572864;
            } else if ((i11 & 3670016) == 0) {
                if (lVarV.p(z11)) {
                    i22 = PKIFailureInfo.badCertTemplate;
                } else {
                    i22 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i22;
            }
            if ((i13 & 2995931) == 599186) {
                if (i24 != 0) {
                    dVar2 = d.INSTANCE;
                }
                if (i14 != 0) {
                    aVar2 = p006gy.a.Dark;
                }
                if (i16 != 0) {
                    bVar2 = p006gy.b.Buy;
                }
                if (i18 != 0) {
                    fG = h.g(100);
                }
                if (i21 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (o.J()) {
                    o.S(-101155437, i13, -1, "com.google.pay.button.PayButton (PayButton.kt:49)");
                }
                iO1 = (int) ((w4.d) lVarV.U(z0.g())).O1(fG);
                objArr = new Object[]{aVar2, bVar2, Integer.valueOf(iO1), allowedPaymentMethods};
                lVarV.H(-568225417);
                zN = false;
                while (i23 < 4) {
                    zN |= lVarV.n(objArr[i23]);
                }
                objI = lVarV.I();
                if (zN) {
                    objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                    lVarV.B(objI);
                } else {
                    objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                    lVarV.B(objI);
                }
                lVarV.T();
                l lVar15 = (l) objI;
                Boolean boolValueOf14 = Boolean.valueOf(z12);
                lVarV.H(511388516);
                zN2 = lVarV.n(boolValueOf14) | lVarV.n(onClick);
                objI2 = lVarV.I();
                if (zN2) {
                    objI2 = new b(z12, onClick);
                    lVarV.B(objI2);
                } else {
                    objI2 = new b(z12, onClick);
                    lVarV.B(objI2);
                }
                lVarV.T();
                f.a(lVar15, dVar2, (l) objI2, lVarV, (i13 >> 3) & 112, 0);
                if (o.J()) {
                    o.R();
                }
            } else {
                if (i24 != 0) {
                    dVar2 = d.INSTANCE;
                }
                if (i14 != 0) {
                    aVar2 = p006gy.a.Dark;
                }
                if (i16 != 0) {
                    bVar2 = p006gy.b.Buy;
                }
                if (i18 != 0) {
                    fG = h.g(100);
                }
                if (i21 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (o.J()) {
                    o.S(-101155437, i13, -1, "com.google.pay.button.PayButton (PayButton.kt:49)");
                }
                iO1 = (int) ((w4.d) lVarV.U(z0.g())).O1(fG);
                objArr = new Object[]{aVar2, bVar2, Integer.valueOf(iO1), allowedPaymentMethods};
                lVarV.H(-568225417);
                zN = false;
                while (i23 < 4) {
                    zN |= lVarV.n(objArr[i23]);
                }
                objI = lVarV.I();
                if (zN) {
                    objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                    lVarV.B(objI);
                } else {
                    objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                    lVarV.B(objI);
                }
                lVarV.T();
                l lVar16 = (l) objI;
                Boolean boolValueOf15 = Boolean.valueOf(z12);
                lVarV.H(511388516);
                zN2 = lVarV.n(boolValueOf15) | lVarV.n(onClick);
                objI2 = lVarV.I();
                if (zN2) {
                    objI2 = new b(z12, onClick);
                    lVarV.B(objI2);
                } else {
                    objI2 = new b(z12, onClick);
                    lVarV.B(objI2);
                }
                lVarV.T();
                f.a(lVar16, dVar2, (l) objI2, lVarV, (i13 >> 3) & 112, 0);
                if (o.J()) {
                    o.R();
                }
            }
            aVar3 = aVar2;
            bVar3 = bVar2;
            f12 = fG;
            w2VarX = lVarV.x();
            if (w2VarX == null) {
                return;
            }
            w2VarX.a(new c(onClick, allowedPaymentMethods, dVar2, aVar3, bVar3, f12, z12, i11, i12));
        }
        i13 |= KyberEngine.KyberPolyBytes;
        dVar2 = dVar;
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & 7168) == 0) {
                aVar2 = aVar;
                if (lVarV.n(aVar2)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((57344 & i11) == 0) {
                    bVar2 = bVar;
                    if (lVarV.n(bVar2)) {
                        i17 = 16384;
                    } else {
                        i17 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 32;
                if (i18 != 0) {
                    if ((458752 & i11) == 0) {
                        fG = f11;
                        if (lVarV.q(fG)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                    i21 = i12 & 64;
                    if (i21 != 0) {
                        i13 |= 1572864;
                    } else if ((i11 & 3670016) == 0) {
                        if (lVarV.p(z11)) {
                            i22 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i22 = PKIFailureInfo.signerNotTrusted;
                        }
                        i13 |= i22;
                    }
                    if ((i13 & 2995931) == 599186) {
                        if (i24 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i14 != 0) {
                            aVar2 = p006gy.a.Dark;
                        }
                        if (i16 != 0) {
                            bVar2 = p006gy.b.Buy;
                        }
                        if (i18 != 0) {
                            fG = h.g(100);
                        }
                        if (i21 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (o.J()) {
                            o.S(-101155437, i13, -1, "com.google.pay.button.PayButton (PayButton.kt:49)");
                        }
                        iO1 = (int) ((w4.d) lVarV.U(z0.g())).O1(fG);
                        objArr = new Object[]{aVar2, bVar2, Integer.valueOf(iO1), allowedPaymentMethods};
                        lVarV.H(-568225417);
                        zN = false;
                        while (i23 < 4) {
                            zN |= lVarV.n(objArr[i23]);
                        }
                        objI = lVarV.I();
                        if (zN) {
                            objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                            lVarV.B(objI);
                        } else {
                            objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                            lVarV.B(objI);
                        }
                        lVarV.T();
                        l lVar17 = (l) objI;
                        Boolean boolValueOf16 = Boolean.valueOf(z12);
                        lVarV.H(511388516);
                        zN2 = lVarV.n(boolValueOf16) | lVarV.n(onClick);
                        objI2 = lVarV.I();
                        if (zN2) {
                            objI2 = new b(z12, onClick);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new b(z12, onClick);
                            lVarV.B(objI2);
                        }
                        lVarV.T();
                        f.a(lVar17, dVar2, (l) objI2, lVarV, (i13 >> 3) & 112, 0);
                        if (o.J()) {
                            o.R();
                        }
                    } else {
                        if (i24 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i14 != 0) {
                            aVar2 = p006gy.a.Dark;
                        }
                        if (i16 != 0) {
                            bVar2 = p006gy.b.Buy;
                        }
                        if (i18 != 0) {
                            fG = h.g(100);
                        }
                        if (i21 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (o.J()) {
                            o.S(-101155437, i13, -1, "com.google.pay.button.PayButton (PayButton.kt:49)");
                        }
                        iO1 = (int) ((w4.d) lVarV.U(z0.g())).O1(fG);
                        objArr = new Object[]{aVar2, bVar2, Integer.valueOf(iO1), allowedPaymentMethods};
                        lVarV.H(-568225417);
                        zN = false;
                        while (i23 < 4) {
                            zN |= lVarV.n(objArr[i23]);
                        }
                        objI = lVarV.I();
                        if (zN) {
                            objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                            lVarV.B(objI);
                        } else {
                            objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                            lVarV.B(objI);
                        }
                        lVarV.T();
                        l lVar18 = (l) objI;
                        Boolean boolValueOf17 = Boolean.valueOf(z12);
                        lVarV.H(511388516);
                        zN2 = lVarV.n(boolValueOf17) | lVarV.n(onClick);
                        objI2 = lVarV.I();
                        if (zN2) {
                            objI2 = new b(z12, onClick);
                            lVarV.B(objI2);
                        } else {
                            objI2 = new b(z12, onClick);
                            lVarV.B(objI2);
                        }
                        lVarV.T();
                        f.a(lVar18, dVar2, (l) objI2, lVarV, (i13 >> 3) & 112, 0);
                        if (o.J()) {
                            o.R();
                        }
                    }
                    aVar3 = aVar2;
                    bVar3 = bVar2;
                    f12 = fG;
                    w2VarX = lVarV.x();
                    if (w2VarX == null) {
                        return;
                    }
                    w2VarX.a(new c(onClick, allowedPaymentMethods, dVar2, aVar3, bVar3, f12, z12, i11, i12));
                }
                i13 |= 196608;
                fG = f11;
                i21 = i12 & 64;
                if (i21 != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (lVarV.p(z11)) {
                        i22 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i22 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i22;
                }
                if ((i13 & 2995931) == 599186) {
                    if (i24 != 0) {
                        dVar2 = d.INSTANCE;
                    }
                    if (i14 != 0) {
                        aVar2 = p006gy.a.Dark;
                    }
                    if (i16 != 0) {
                        bVar2 = p006gy.b.Buy;
                    }
                    if (i18 != 0) {
                        fG = h.g(100);
                    }
                    if (i21 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (o.J()) {
                        o.S(-101155437, i13, -1, "com.google.pay.button.PayButton (PayButton.kt:49)");
                    }
                    iO1 = (int) ((w4.d) lVarV.U(z0.g())).O1(fG);
                    objArr = new Object[]{aVar2, bVar2, Integer.valueOf(iO1), allowedPaymentMethods};
                    lVarV.H(-568225417);
                    zN = false;
                    while (i23 < 4) {
                        zN |= lVarV.n(objArr[i23]);
                    }
                    objI = lVarV.I();
                    if (zN) {
                        objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                        lVarV.B(objI);
                    } else {
                        objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    l lVar19 = (l) objI;
                    Boolean boolValueOf18 = Boolean.valueOf(z12);
                    lVarV.H(511388516);
                    zN2 = lVarV.n(boolValueOf18) | lVarV.n(onClick);
                    objI2 = lVarV.I();
                    if (zN2) {
                        objI2 = new b(z12, onClick);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new b(z12, onClick);
                        lVarV.B(objI2);
                    }
                    lVarV.T();
                    f.a(lVar19, dVar2, (l) objI2, lVarV, (i13 >> 3) & 112, 0);
                    if (o.J()) {
                        o.R();
                    }
                } else {
                    if (i24 != 0) {
                        dVar2 = d.INSTANCE;
                    }
                    if (i14 != 0) {
                        aVar2 = p006gy.a.Dark;
                    }
                    if (i16 != 0) {
                        bVar2 = p006gy.b.Buy;
                    }
                    if (i18 != 0) {
                        fG = h.g(100);
                    }
                    if (i21 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (o.J()) {
                        o.S(-101155437, i13, -1, "com.google.pay.button.PayButton (PayButton.kt:49)");
                    }
                    iO1 = (int) ((w4.d) lVarV.U(z0.g())).O1(fG);
                    objArr = new Object[]{aVar2, bVar2, Integer.valueOf(iO1), allowedPaymentMethods};
                    lVarV.H(-568225417);
                    zN = false;
                    while (i23 < 4) {
                        zN |= lVarV.n(objArr[i23]);
                    }
                    objI = lVarV.I();
                    if (zN) {
                        objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                        lVarV.B(objI);
                    } else {
                        objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    l lVar110 = (l) objI;
                    Boolean boolValueOf19 = Boolean.valueOf(z12);
                    lVarV.H(511388516);
                    zN2 = lVarV.n(boolValueOf19) | lVarV.n(onClick);
                    objI2 = lVarV.I();
                    if (zN2) {
                        objI2 = new b(z12, onClick);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new b(z12, onClick);
                        lVarV.B(objI2);
                    }
                    lVarV.T();
                    f.a(lVar110, dVar2, (l) objI2, lVarV, (i13 >> 3) & 112, 0);
                    if (o.J()) {
                        o.R();
                    }
                }
                aVar3 = aVar2;
                bVar3 = bVar2;
                f12 = fG;
                w2VarX = lVarV.x();
                if (w2VarX == null) {
                    return;
                }
                w2VarX.a(new c(onClick, allowedPaymentMethods, dVar2, aVar3, bVar3, f12, z12, i11, i12));
            }
            i13 |= 24576;
            bVar2 = bVar;
            i18 = i12 & 32;
            if (i18 != 0) {
                if ((458752 & i11) == 0) {
                    fG = f11;
                    if (lVarV.q(fG)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                i21 = i12 & 64;
                if (i21 != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (lVarV.p(z11)) {
                        i22 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i22 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i22;
                }
                if ((i13 & 2995931) == 599186) {
                    if (i24 != 0) {
                        dVar2 = d.INSTANCE;
                    }
                    if (i14 != 0) {
                        aVar2 = p006gy.a.Dark;
                    }
                    if (i16 != 0) {
                        bVar2 = p006gy.b.Buy;
                    }
                    if (i18 != 0) {
                        fG = h.g(100);
                    }
                    if (i21 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (o.J()) {
                        o.S(-101155437, i13, -1, "com.google.pay.button.PayButton (PayButton.kt:49)");
                    }
                    iO1 = (int) ((w4.d) lVarV.U(z0.g())).O1(fG);
                    objArr = new Object[]{aVar2, bVar2, Integer.valueOf(iO1), allowedPaymentMethods};
                    lVarV.H(-568225417);
                    zN = false;
                    while (i23 < 4) {
                        zN |= lVarV.n(objArr[i23]);
                    }
                    objI = lVarV.I();
                    if (zN) {
                        objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                        lVarV.B(objI);
                    } else {
                        objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    l lVar111 = (l) objI;
                    Boolean boolValueOf110 = Boolean.valueOf(z12);
                    lVarV.H(511388516);
                    zN2 = lVarV.n(boolValueOf110) | lVarV.n(onClick);
                    objI2 = lVarV.I();
                    if (zN2) {
                        objI2 = new b(z12, onClick);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new b(z12, onClick);
                        lVarV.B(objI2);
                    }
                    lVarV.T();
                    f.a(lVar111, dVar2, (l) objI2, lVarV, (i13 >> 3) & 112, 0);
                    if (o.J()) {
                        o.R();
                    }
                } else {
                    if (i24 != 0) {
                        dVar2 = d.INSTANCE;
                    }
                    if (i14 != 0) {
                        aVar2 = p006gy.a.Dark;
                    }
                    if (i16 != 0) {
                        bVar2 = p006gy.b.Buy;
                    }
                    if (i18 != 0) {
                        fG = h.g(100);
                    }
                    if (i21 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (o.J()) {
                        o.S(-101155437, i13, -1, "com.google.pay.button.PayButton (PayButton.kt:49)");
                    }
                    iO1 = (int) ((w4.d) lVarV.U(z0.g())).O1(fG);
                    objArr = new Object[]{aVar2, bVar2, Integer.valueOf(iO1), allowedPaymentMethods};
                    lVarV.H(-568225417);
                    zN = false;
                    while (i23 < 4) {
                        zN |= lVarV.n(objArr[i23]);
                    }
                    objI = lVarV.I();
                    if (zN) {
                        objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                        lVarV.B(objI);
                    } else {
                        objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    l lVar112 = (l) objI;
                    Boolean boolValueOf111 = Boolean.valueOf(z12);
                    lVarV.H(511388516);
                    zN2 = lVarV.n(boolValueOf111) | lVarV.n(onClick);
                    objI2 = lVarV.I();
                    if (zN2) {
                        objI2 = new b(z12, onClick);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new b(z12, onClick);
                        lVarV.B(objI2);
                    }
                    lVarV.T();
                    f.a(lVar112, dVar2, (l) objI2, lVarV, (i13 >> 3) & 112, 0);
                    if (o.J()) {
                        o.R();
                    }
                }
                aVar3 = aVar2;
                bVar3 = bVar2;
                f12 = fG;
                w2VarX = lVarV.x();
                if (w2VarX == null) {
                    return;
                }
                w2VarX.a(new c(onClick, allowedPaymentMethods, dVar2, aVar3, bVar3, f12, z12, i11, i12));
            }
            i13 |= 196608;
            fG = f11;
            i21 = i12 & 64;
            if (i21 != 0) {
                i13 |= 1572864;
            } else if ((i11 & 3670016) == 0) {
                if (lVarV.p(z11)) {
                    i22 = PKIFailureInfo.badCertTemplate;
                } else {
                    i22 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i22;
            }
            if ((i13 & 2995931) == 599186) {
                if (i24 != 0) {
                    dVar2 = d.INSTANCE;
                }
                if (i14 != 0) {
                    aVar2 = p006gy.a.Dark;
                }
                if (i16 != 0) {
                    bVar2 = p006gy.b.Buy;
                }
                if (i18 != 0) {
                    fG = h.g(100);
                }
                if (i21 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (o.J()) {
                    o.S(-101155437, i13, -1, "com.google.pay.button.PayButton (PayButton.kt:49)");
                }
                iO1 = (int) ((w4.d) lVarV.U(z0.g())).O1(fG);
                objArr = new Object[]{aVar2, bVar2, Integer.valueOf(iO1), allowedPaymentMethods};
                lVarV.H(-568225417);
                zN = false;
                while (i23 < 4) {
                    zN |= lVarV.n(objArr[i23]);
                }
                objI = lVarV.I();
                if (zN) {
                    objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                    lVarV.B(objI);
                } else {
                    objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                    lVarV.B(objI);
                }
                lVarV.T();
                l lVar113 = (l) objI;
                Boolean boolValueOf112 = Boolean.valueOf(z12);
                lVarV.H(511388516);
                zN2 = lVarV.n(boolValueOf112) | lVarV.n(onClick);
                objI2 = lVarV.I();
                if (zN2) {
                    objI2 = new b(z12, onClick);
                    lVarV.B(objI2);
                } else {
                    objI2 = new b(z12, onClick);
                    lVarV.B(objI2);
                }
                lVarV.T();
                f.a(lVar113, dVar2, (l) objI2, lVarV, (i13 >> 3) & 112, 0);
                if (o.J()) {
                    o.R();
                }
            } else {
                if (i24 != 0) {
                    dVar2 = d.INSTANCE;
                }
                if (i14 != 0) {
                    aVar2 = p006gy.a.Dark;
                }
                if (i16 != 0) {
                    bVar2 = p006gy.b.Buy;
                }
                if (i18 != 0) {
                    fG = h.g(100);
                }
                if (i21 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (o.J()) {
                    o.S(-101155437, i13, -1, "com.google.pay.button.PayButton (PayButton.kt:49)");
                }
                iO1 = (int) ((w4.d) lVarV.U(z0.g())).O1(fG);
                objArr = new Object[]{aVar2, bVar2, Integer.valueOf(iO1), allowedPaymentMethods};
                lVarV.H(-568225417);
                zN = false;
                while (i23 < 4) {
                    zN |= lVarV.n(objArr[i23]);
                }
                objI = lVarV.I();
                if (zN) {
                    objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                    lVarV.B(objI);
                } else {
                    objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                    lVarV.B(objI);
                }
                lVarV.T();
                l lVar114 = (l) objI;
                Boolean boolValueOf113 = Boolean.valueOf(z12);
                lVarV.H(511388516);
                zN2 = lVarV.n(boolValueOf113) | lVarV.n(onClick);
                objI2 = lVarV.I();
                if (zN2) {
                    objI2 = new b(z12, onClick);
                    lVarV.B(objI2);
                } else {
                    objI2 = new b(z12, onClick);
                    lVarV.B(objI2);
                }
                lVarV.T();
                f.a(lVar114, dVar2, (l) objI2, lVarV, (i13 >> 3) & 112, 0);
                if (o.J()) {
                    o.R();
                }
            }
            aVar3 = aVar2;
            bVar3 = bVar2;
            f12 = fG;
            w2VarX = lVarV.x();
            if (w2VarX == null) {
                return;
            }
            w2VarX.a(new c(onClick, allowedPaymentMethods, dVar2, aVar3, bVar3, f12, z12, i11, i12));
        }
        i13 |= 3072;
        aVar2 = aVar;
        i16 = i12 & 16;
        if (i16 != 0) {
            if ((57344 & i11) == 0) {
                bVar2 = bVar;
                if (lVarV.n(bVar2)) {
                    i17 = 16384;
                } else {
                    i17 = PKIFailureInfo.certRevoked;
                }
                i13 |= i17;
            }
            i18 = i12 & 32;
            if (i18 != 0) {
                if ((458752 & i11) == 0) {
                    fG = f11;
                    if (lVarV.q(fG)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                i21 = i12 & 64;
                if (i21 != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (lVarV.p(z11)) {
                        i22 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i22 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i22;
                }
                if ((i13 & 2995931) == 599186) {
                    if (i24 != 0) {
                        dVar2 = d.INSTANCE;
                    }
                    if (i14 != 0) {
                        aVar2 = p006gy.a.Dark;
                    }
                    if (i16 != 0) {
                        bVar2 = p006gy.b.Buy;
                    }
                    if (i18 != 0) {
                        fG = h.g(100);
                    }
                    if (i21 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (o.J()) {
                        o.S(-101155437, i13, -1, "com.google.pay.button.PayButton (PayButton.kt:49)");
                    }
                    iO1 = (int) ((w4.d) lVarV.U(z0.g())).O1(fG);
                    objArr = new Object[]{aVar2, bVar2, Integer.valueOf(iO1), allowedPaymentMethods};
                    lVarV.H(-568225417);
                    zN = false;
                    while (i23 < 4) {
                        zN |= lVarV.n(objArr[i23]);
                    }
                    objI = lVarV.I();
                    if (zN) {
                        objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                        lVarV.B(objI);
                    } else {
                        objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    l lVar115 = (l) objI;
                    Boolean boolValueOf114 = Boolean.valueOf(z12);
                    lVarV.H(511388516);
                    zN2 = lVarV.n(boolValueOf114) | lVarV.n(onClick);
                    objI2 = lVarV.I();
                    if (zN2) {
                        objI2 = new b(z12, onClick);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new b(z12, onClick);
                        lVarV.B(objI2);
                    }
                    lVarV.T();
                    f.a(lVar115, dVar2, (l) objI2, lVarV, (i13 >> 3) & 112, 0);
                    if (o.J()) {
                        o.R();
                    }
                } else {
                    if (i24 != 0) {
                        dVar2 = d.INSTANCE;
                    }
                    if (i14 != 0) {
                        aVar2 = p006gy.a.Dark;
                    }
                    if (i16 != 0) {
                        bVar2 = p006gy.b.Buy;
                    }
                    if (i18 != 0) {
                        fG = h.g(100);
                    }
                    if (i21 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (o.J()) {
                        o.S(-101155437, i13, -1, "com.google.pay.button.PayButton (PayButton.kt:49)");
                    }
                    iO1 = (int) ((w4.d) lVarV.U(z0.g())).O1(fG);
                    objArr = new Object[]{aVar2, bVar2, Integer.valueOf(iO1), allowedPaymentMethods};
                    lVarV.H(-568225417);
                    zN = false;
                    while (i23 < 4) {
                        zN |= lVarV.n(objArr[i23]);
                    }
                    objI = lVarV.I();
                    if (zN) {
                        objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                        lVarV.B(objI);
                    } else {
                        objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                        lVarV.B(objI);
                    }
                    lVarV.T();
                    l lVar116 = (l) objI;
                    Boolean boolValueOf115 = Boolean.valueOf(z12);
                    lVarV.H(511388516);
                    zN2 = lVarV.n(boolValueOf115) | lVarV.n(onClick);
                    objI2 = lVarV.I();
                    if (zN2) {
                        objI2 = new b(z12, onClick);
                        lVarV.B(objI2);
                    } else {
                        objI2 = new b(z12, onClick);
                        lVarV.B(objI2);
                    }
                    lVarV.T();
                    f.a(lVar116, dVar2, (l) objI2, lVarV, (i13 >> 3) & 112, 0);
                    if (o.J()) {
                        o.R();
                    }
                }
                aVar3 = aVar2;
                bVar3 = bVar2;
                f12 = fG;
                w2VarX = lVarV.x();
                if (w2VarX == null) {
                    return;
                }
                w2VarX.a(new c(onClick, allowedPaymentMethods, dVar2, aVar3, bVar3, f12, z12, i11, i12));
            }
            i13 |= 196608;
            fG = f11;
            i21 = i12 & 64;
            if (i21 != 0) {
                i13 |= 1572864;
            } else if ((i11 & 3670016) == 0) {
                if (lVarV.p(z11)) {
                    i22 = PKIFailureInfo.badCertTemplate;
                } else {
                    i22 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i22;
            }
            if ((i13 & 2995931) == 599186) {
                if (i24 != 0) {
                    dVar2 = d.INSTANCE;
                }
                if (i14 != 0) {
                    aVar2 = p006gy.a.Dark;
                }
                if (i16 != 0) {
                    bVar2 = p006gy.b.Buy;
                }
                if (i18 != 0) {
                    fG = h.g(100);
                }
                if (i21 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (o.J()) {
                    o.S(-101155437, i13, -1, "com.google.pay.button.PayButton (PayButton.kt:49)");
                }
                iO1 = (int) ((w4.d) lVarV.U(z0.g())).O1(fG);
                objArr = new Object[]{aVar2, bVar2, Integer.valueOf(iO1), allowedPaymentMethods};
                lVarV.H(-568225417);
                zN = false;
                while (i23 < 4) {
                    zN |= lVarV.n(objArr[i23]);
                }
                objI = lVarV.I();
                if (zN) {
                    objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                    lVarV.B(objI);
                } else {
                    objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                    lVarV.B(objI);
                }
                lVarV.T();
                l lVar117 = (l) objI;
                Boolean boolValueOf116 = Boolean.valueOf(z12);
                lVarV.H(511388516);
                zN2 = lVarV.n(boolValueOf116) | lVarV.n(onClick);
                objI2 = lVarV.I();
                if (zN2) {
                    objI2 = new b(z12, onClick);
                    lVarV.B(objI2);
                } else {
                    objI2 = new b(z12, onClick);
                    lVarV.B(objI2);
                }
                lVarV.T();
                f.a(lVar117, dVar2, (l) objI2, lVarV, (i13 >> 3) & 112, 0);
                if (o.J()) {
                    o.R();
                }
            } else {
                if (i24 != 0) {
                    dVar2 = d.INSTANCE;
                }
                if (i14 != 0) {
                    aVar2 = p006gy.a.Dark;
                }
                if (i16 != 0) {
                    bVar2 = p006gy.b.Buy;
                }
                if (i18 != 0) {
                    fG = h.g(100);
                }
                if (i21 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (o.J()) {
                    o.S(-101155437, i13, -1, "com.google.pay.button.PayButton (PayButton.kt:49)");
                }
                iO1 = (int) ((w4.d) lVarV.U(z0.g())).O1(fG);
                objArr = new Object[]{aVar2, bVar2, Integer.valueOf(iO1), allowedPaymentMethods};
                lVarV.H(-568225417);
                zN = false;
                while (i23 < 4) {
                    zN |= lVarV.n(objArr[i23]);
                }
                objI = lVarV.I();
                if (zN) {
                    objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                    lVarV.B(objI);
                } else {
                    objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                    lVarV.B(objI);
                }
                lVarV.T();
                l lVar118 = (l) objI;
                Boolean boolValueOf117 = Boolean.valueOf(z12);
                lVarV.H(511388516);
                zN2 = lVarV.n(boolValueOf117) | lVarV.n(onClick);
                objI2 = lVarV.I();
                if (zN2) {
                    objI2 = new b(z12, onClick);
                    lVarV.B(objI2);
                } else {
                    objI2 = new b(z12, onClick);
                    lVarV.B(objI2);
                }
                lVarV.T();
                f.a(lVar118, dVar2, (l) objI2, lVarV, (i13 >> 3) & 112, 0);
                if (o.J()) {
                    o.R();
                }
            }
            aVar3 = aVar2;
            bVar3 = bVar2;
            f12 = fG;
            w2VarX = lVarV.x();
            if (w2VarX == null) {
                return;
            }
            w2VarX.a(new c(onClick, allowedPaymentMethods, dVar2, aVar3, bVar3, f12, z12, i11, i12));
        }
        i13 |= 24576;
        bVar2 = bVar;
        i18 = i12 & 32;
        if (i18 != 0) {
            if ((458752 & i11) == 0) {
                fG = f11;
                if (lVarV.q(fG)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i13 |= i19;
            }
            i21 = i12 & 64;
            if (i21 != 0) {
                i13 |= 1572864;
            } else if ((i11 & 3670016) == 0) {
                if (lVarV.p(z11)) {
                    i22 = PKIFailureInfo.badCertTemplate;
                } else {
                    i22 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i22;
            }
            if ((i13 & 2995931) == 599186) {
                if (i24 != 0) {
                    dVar2 = d.INSTANCE;
                }
                if (i14 != 0) {
                    aVar2 = p006gy.a.Dark;
                }
                if (i16 != 0) {
                    bVar2 = p006gy.b.Buy;
                }
                if (i18 != 0) {
                    fG = h.g(100);
                }
                if (i21 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (o.J()) {
                    o.S(-101155437, i13, -1, "com.google.pay.button.PayButton (PayButton.kt:49)");
                }
                iO1 = (int) ((w4.d) lVarV.U(z0.g())).O1(fG);
                objArr = new Object[]{aVar2, bVar2, Integer.valueOf(iO1), allowedPaymentMethods};
                lVarV.H(-568225417);
                zN = false;
                while (i23 < 4) {
                    zN |= lVarV.n(objArr[i23]);
                }
                objI = lVarV.I();
                if (zN) {
                    objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                    lVarV.B(objI);
                } else {
                    objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                    lVarV.B(objI);
                }
                lVarV.T();
                l lVar119 = (l) objI;
                Boolean boolValueOf118 = Boolean.valueOf(z12);
                lVarV.H(511388516);
                zN2 = lVarV.n(boolValueOf118) | lVarV.n(onClick);
                objI2 = lVarV.I();
                if (zN2) {
                    objI2 = new b(z12, onClick);
                    lVarV.B(objI2);
                } else {
                    objI2 = new b(z12, onClick);
                    lVarV.B(objI2);
                }
                lVarV.T();
                f.a(lVar119, dVar2, (l) objI2, lVarV, (i13 >> 3) & 112, 0);
                if (o.J()) {
                    o.R();
                }
            } else {
                if (i24 != 0) {
                    dVar2 = d.INSTANCE;
                }
                if (i14 != 0) {
                    aVar2 = p006gy.a.Dark;
                }
                if (i16 != 0) {
                    bVar2 = p006gy.b.Buy;
                }
                if (i18 != 0) {
                    fG = h.g(100);
                }
                if (i21 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (o.J()) {
                    o.S(-101155437, i13, -1, "com.google.pay.button.PayButton (PayButton.kt:49)");
                }
                iO1 = (int) ((w4.d) lVarV.U(z0.g())).O1(fG);
                objArr = new Object[]{aVar2, bVar2, Integer.valueOf(iO1), allowedPaymentMethods};
                lVarV.H(-568225417);
                zN = false;
                while (i23 < 4) {
                    zN |= lVarV.n(objArr[i23]);
                }
                objI = lVarV.I();
                if (zN) {
                    objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                    lVarV.B(objI);
                } else {
                    objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                    lVarV.B(objI);
                }
                lVarV.T();
                l lVar1110 = (l) objI;
                Boolean boolValueOf119 = Boolean.valueOf(z12);
                lVarV.H(511388516);
                zN2 = lVarV.n(boolValueOf119) | lVarV.n(onClick);
                objI2 = lVarV.I();
                if (zN2) {
                    objI2 = new b(z12, onClick);
                    lVarV.B(objI2);
                } else {
                    objI2 = new b(z12, onClick);
                    lVarV.B(objI2);
                }
                lVarV.T();
                f.a(lVar1110, dVar2, (l) objI2, lVarV, (i13 >> 3) & 112, 0);
                if (o.J()) {
                    o.R();
                }
            }
            aVar3 = aVar2;
            bVar3 = bVar2;
            f12 = fG;
            w2VarX = lVarV.x();
            if (w2VarX == null) {
                return;
            }
            w2VarX.a(new c(onClick, allowedPaymentMethods, dVar2, aVar3, bVar3, f12, z12, i11, i12));
        }
        i13 |= 196608;
        fG = f11;
        i21 = i12 & 64;
        if (i21 != 0) {
            i13 |= 1572864;
        } else if ((i11 & 3670016) == 0) {
            if (lVarV.p(z11)) {
                i22 = PKIFailureInfo.badCertTemplate;
            } else {
                i22 = PKIFailureInfo.signerNotTrusted;
            }
            i13 |= i22;
        }
        if ((i13 & 2995931) == 599186) {
            if (i24 != 0) {
                dVar2 = d.INSTANCE;
            }
            if (i14 != 0) {
                aVar2 = p006gy.a.Dark;
            }
            if (i16 != 0) {
                bVar2 = p006gy.b.Buy;
            }
            if (i18 != 0) {
                fG = h.g(100);
            }
            if (i21 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (o.J()) {
                o.S(-101155437, i13, -1, "com.google.pay.button.PayButton (PayButton.kt:49)");
            }
            iO1 = (int) ((w4.d) lVarV.U(z0.g())).O1(fG);
            objArr = new Object[]{aVar2, bVar2, Integer.valueOf(iO1), allowedPaymentMethods};
            lVarV.H(-568225417);
            zN = false;
            while (i23 < 4) {
                zN |= lVarV.n(objArr[i23]);
            }
            objI = lVarV.I();
            if (zN) {
                objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                lVarV.B(objI);
            } else {
                objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                lVarV.B(objI);
            }
            lVarV.T();
            l lVar1111 = (l) objI;
            Boolean boolValueOf1110 = Boolean.valueOf(z12);
            lVarV.H(511388516);
            zN2 = lVarV.n(boolValueOf1110) | lVarV.n(onClick);
            objI2 = lVarV.I();
            if (zN2) {
                objI2 = new b(z12, onClick);
                lVarV.B(objI2);
            } else {
                objI2 = new b(z12, onClick);
                lVarV.B(objI2);
            }
            lVarV.T();
            f.a(lVar1111, dVar2, (l) objI2, lVarV, (i13 >> 3) & 112, 0);
            if (o.J()) {
                o.R();
            }
        } else {
            if (i24 != 0) {
                dVar2 = d.INSTANCE;
            }
            if (i14 != 0) {
                aVar2 = p006gy.a.Dark;
            }
            if (i16 != 0) {
                bVar2 = p006gy.b.Buy;
            }
            if (i18 != 0) {
                fG = h.g(100);
            }
            if (i21 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (o.J()) {
                o.S(-101155437, i13, -1, "com.google.pay.button.PayButton (PayButton.kt:49)");
            }
            iO1 = (int) ((w4.d) lVarV.U(z0.g())).O1(fG);
            objArr = new Object[]{aVar2, bVar2, Integer.valueOf(iO1), allowedPaymentMethods};
            lVarV.H(-568225417);
            zN = false;
            while (i23 < 4) {
                zN |= lVarV.n(objArr[i23]);
            }
            objI = lVarV.I();
            if (zN) {
                objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                lVarV.B(objI);
            } else {
                objI = new a(aVar2, bVar2, iO1, allowedPaymentMethods);
                lVarV.B(objI);
            }
            lVarV.T();
            l lVar1112 = (l) objI;
            Boolean boolValueOf1111 = Boolean.valueOf(z12);
            lVarV.H(511388516);
            zN2 = lVarV.n(boolValueOf1111) | lVarV.n(onClick);
            objI2 = lVarV.I();
            if (zN2) {
                objI2 = new b(z12, onClick);
                lVarV.B(objI2);
            } else {
                objI2 = new b(z12, onClick);
                lVarV.B(objI2);
            }
            lVarV.T();
            f.a(lVar1112, dVar2, (l) objI2, lVarV, (i13 >> 3) & 112, 0);
            if (o.J()) {
                o.R();
            }
        }
        aVar3 = aVar2;
        bVar3 = bVar2;
        f12 = fG;
        w2VarX = lVarV.x();
        if (w2VarX == null) {
            return;
        }
        w2VarX.a(new c(onClick, allowedPaymentMethods, dVar2, aVar3, bVar3, f12, z12, i11, i12));
    }
}
