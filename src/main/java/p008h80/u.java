package p008h80;

import androidx.compose.foundation.layout.t;
import androidx.compose.foundation.layout.x;
import androidx.compose.ui.d;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d3.c;
import f90.n;
import jn0.h0;
import o90.f;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p009i2.j1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import v1.i;
import w4.h;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001al\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Lw4/h;", "minViewWidth", "", "iconRes", "", "iconUrl", "Lo90/f;", "imageLoader", "title", "", "isSelected", "isEnabled", "iconRequiresTinting", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function0;", "Ljn0/h0;", "onItemSelectedListener", "a", "(FILjava/lang/String;Lo90/f;Ljava/lang/String;ZZZLandroidx/compose/ui/d;Lwn0/a;Lr2/l;II)V", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class u {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/i;", "Ljn0/h0;", "a", "(Lv1/i;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements q<i, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f71559c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f71560d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f71561e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f71562f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f71563g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f71564h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, String str, f fVar, boolean z11, String str2, boolean z12) {
            super(3);
            this.f71559c = i11;
            this.f71560d = str;
            this.f71561e = fVar;
            this.f71562f = z11;
            this.f71563g = str2;
            this.f71564h = z12;
        }

        public final void a(i RowButton, l lVar, int i11) {
            s.k(RowButton, "$this$RowButton");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-2139491033, i11, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab.<anonymous> (NewPaymentMethodTab.kt:48)");
            }
            c cVarH = c.INSTANCE.h();
            d.Companion companion = d.INSTANCE;
            y.a(this.f71559c, this.f71560d, this.f71561e, this.f71562f, x.x(x.i(companion, z.f71709a.b()), BitmapDescriptorFactory.HUE_RED, h.g(36), 1, null), cVarH, lVar, 221184 | (f.f96995g << 6), 0);
            r.a(null, this.f71563g, n.n(j1.f74525a, lVar, j1.f74526b).getOnComponent(), t.m(companion, BitmapDescriptorFactory.HUE_RED, h.g(6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null), this.f71564h, lVar, 3072, 1);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(i iVar, l lVar, Integer num) {
            a(iVar, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends p013kotlin.jvm.internal.u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f71565c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f71566d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f71567e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ f f71568f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f71569g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f71570h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f71571i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f71572j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ d f71573k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f71574l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f71575m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f71576n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f11, int i11, String str, f fVar, String str2, boolean z11, boolean z12, boolean z13, d dVar, wn0.a<h0> aVar, int i12, int i13) {
            super(2);
            this.f71565c = f11;
            this.f71566d = i11;
            this.f71567e = str;
            this.f71568f = fVar;
            this.f71569g = str2;
            this.f71570h = z11;
            this.f71571i = z12;
            this.f71572j = z13;
            this.f71573k = dVar;
            this.f71574l = aVar;
            this.f71575m = i12;
            this.f71576n = i13;
        }

        public final void a(l lVar, int i11) {
            u.a(this.f71565c, this.f71566d, this.f71567e, this.f71568f, this.f71569g, this.f71570h, this.f71571i, this.f71572j, this.f71573k, this.f71574l, lVar, k2.a(this.f71575m | 1), this.f71576n);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0121  */
    /* JADX WARN: Code duplicated, block: B:105:0x0126  */
    /* JADX WARN: Code duplicated, block: B:107:0x012c  */
    /* JADX WARN: Code duplicated, block: B:108:0x012f  */
    /* JADX WARN: Code duplicated, block: B:111:0x013b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0149 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x014b  */
    /* JADX WARN: Code duplicated, block: B:117:0x014e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0155  */
    /* JADX WARN: Code duplicated, block: B:123:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:127:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:38:0x0078  */
    /* JADX WARN: Code duplicated, block: B:40:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    /* JADX WARN: Code duplicated, block: B:47:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x008f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0095  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00df  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:91:0x0103  */
    /* JADX WARN: Code duplicated, block: B:93:0x010b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0111  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    public static final void a(float f11, int i11, String str, f imageLoader, String title, boolean z11, boolean z12, boolean z13, d dVar, wn0.a<h0> onItemSelectedListener, l lVar, int i12, int i13) {
        int i14;
        int i15;
        String str2;
        int i16;
        int i17;
        int i18;
        boolean z14;
        int i19;
        boolean z15;
        int i21;
        boolean z16;
        int i22;
        int i23;
        d dVar2;
        int i24;
        int i25;
        int i26;
        d dVar3;
        l lVar2;
        d dVar4;
        w2 w2VarX;
        s.k(imageLoader, "imageLoader");
        s.k(title, "title");
        s.k(onItemSelectedListener, "onItemSelectedListener");
        l lVarV = lVar.v(1778603677);
        if ((i13 & 1) != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            i14 = (lVarV.q(f11) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i13 & 2) == 0) {
            if ((i12 & 112) == 0) {
                i15 = i11;
                i14 |= lVarV.r(i15) ? 32 : 16;
            }
            if ((i13 & 4) != 0) {
                if ((i12 & 896) == 0) {
                    str2 = str;
                    if (lVarV.n(str2)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i14 |= i16;
                }
                if ((i13 & 8) != 0) {
                    i14 |= 3072;
                } else if ((i12 & 7168) == 0) {
                    if (lVarV.n(imageLoader)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i14 |= i17;
                }
                if ((i13 & 16) != 0) {
                    i14 |= 24576;
                } else if ((57344 & i12) == 0) {
                    if (lVarV.n(title)) {
                        i18 = 16384;
                    } else {
                        i18 = PKIFailureInfo.certRevoked;
                    }
                    i14 |= i18;
                }
                if ((i13 & 32) != 0) {
                    if ((458752 & i12) == 0) {
                        z14 = z11;
                        if (lVarV.p(z14)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i14 |= i19;
                    }
                    if ((i13 & 64) != 0) {
                        if ((3670016 & i12) == 0) {
                            z15 = z12;
                            if (lVarV.p(z15)) {
                                i21 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i21 = PKIFailureInfo.signerNotTrusted;
                            }
                            i14 |= i21;
                        }
                        if ((i13 & 128) != 0) {
                            if ((29360128 & i12) == 0) {
                                z16 = z13;
                                if (lVarV.p(z16)) {
                                    i22 = 8388608;
                                } else {
                                    i22 = 4194304;
                                }
                                i14 |= i22;
                            }
                            i23 = i13 & 256;
                            if (i23 != 0) {
                                i14 |= 100663296;
                                dVar2 = dVar;
                            } else {
                                dVar2 = dVar;
                                if ((i12 & 234881024) == 0) {
                                    if (lVarV.n(dVar2)) {
                                        i24 = 67108864;
                                    } else {
                                        i24 = 33554432;
                                    }
                                    i14 |= i24;
                                }
                            }
                            if ((i13 & 512) != 0) {
                                if ((1879048192 & i12) == 0) {
                                    if (lVarV.K(onItemSelectedListener)) {
                                        i25 = PKIFailureInfo.duplicateCertReq;
                                    } else {
                                        i25 = 268435456;
                                    }
                                }
                                i26 = i14;
                                if ((1533916891 & i26) == 306783378 || !lVarV.b()) {
                                    if (i23 != 0) {
                                        dVar3 = d.INSTANCE;
                                    } else {
                                        dVar3 = dVar2;
                                    }
                                    if (o.J()) {
                                        o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                                    }
                                    z zVar = z.f71709a;
                                    d dVar5 = dVar3;
                                    int i27 = i26 >> 18;
                                    lVar2 = lVarV;
                                    r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar.a(), zVar.a(), zVar.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i27 & 7168) | (i27 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                                    if (o.J()) {
                                        o.R();
                                    }
                                    dVar4 = dVar5;
                                } else {
                                    lVarV.j();
                                    lVar2 = lVarV;
                                    dVar4 = dVar2;
                                }
                                w2VarX = lVar2.x();
                                if (w2VarX != null) {
                                    w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                                }
                            }
                            i25 = 805306368;
                            i14 |= i25;
                            i26 = i14;
                            if ((1533916891 & i26) == 306783378) {
                                if (i23 != 0) {
                                    dVar3 = d.INSTANCE;
                                } else {
                                    dVar3 = dVar2;
                                }
                                if (o.J()) {
                                    o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                                }
                                z zVar2 = z.f71709a;
                                d dVar6 = dVar3;
                                int i28 = i26 >> 18;
                                lVar2 = lVarV;
                                r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar2.a(), zVar2.a(), zVar2.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i28 & 7168) | (i28 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                                if (o.J()) {
                                    o.R();
                                }
                                dVar4 = dVar6;
                            } else {
                                if (i23 != 0) {
                                    dVar3 = d.INSTANCE;
                                } else {
                                    dVar3 = dVar2;
                                }
                                if (o.J()) {
                                    o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                                }
                                z zVar3 = z.f71709a;
                                d dVar7 = dVar3;
                                int i29 = i26 >> 18;
                                lVar2 = lVarV;
                                r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar3.a(), zVar3.a(), zVar3.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i29 & 7168) | (i29 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                                if (o.J()) {
                                    o.R();
                                }
                                dVar4 = dVar7;
                            }
                            w2VarX = lVar2.x();
                            if (w2VarX != null) {
                                w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                            }
                        }
                        i14 |= 12582912;
                        z16 = z13;
                        i23 = i13 & 256;
                        if (i23 != 0) {
                            i14 |= 100663296;
                            dVar2 = dVar;
                        } else {
                            dVar2 = dVar;
                            if ((i12 & 234881024) == 0) {
                                if (lVarV.n(dVar2)) {
                                    i24 = 67108864;
                                } else {
                                    i24 = 33554432;
                                }
                                i14 |= i24;
                            }
                        }
                        if ((i13 & 512) != 0) {
                            if ((1879048192 & i12) == 0) {
                                if (lVarV.K(onItemSelectedListener)) {
                                    i25 = PKIFailureInfo.duplicateCertReq;
                                } else {
                                    i25 = 268435456;
                                }
                            }
                            i26 = i14;
                            if ((1533916891 & i26) == 306783378) {
                                if (i23 != 0) {
                                    dVar3 = d.INSTANCE;
                                } else {
                                    dVar3 = dVar2;
                                }
                                if (o.J()) {
                                    o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                                }
                                z zVar4 = z.f71709a;
                                d dVar8 = dVar3;
                                int i210 = i26 >> 18;
                                lVar2 = lVarV;
                                r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar4.a(), zVar4.a(), zVar4.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i210 & 7168) | (i210 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                                if (o.J()) {
                                    o.R();
                                }
                                dVar4 = dVar8;
                            } else {
                                if (i23 != 0) {
                                    dVar3 = d.INSTANCE;
                                } else {
                                    dVar3 = dVar2;
                                }
                                if (o.J()) {
                                    o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                                }
                                z zVar5 = z.f71709a;
                                d dVar9 = dVar3;
                                int i211 = i26 >> 18;
                                lVar2 = lVarV;
                                r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar5.a(), zVar5.a(), zVar5.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211 & 7168) | (i211 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                                if (o.J()) {
                                    o.R();
                                }
                                dVar4 = dVar9;
                            }
                            w2VarX = lVar2.x();
                            if (w2VarX != null) {
                                w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                            }
                        }
                        i25 = 805306368;
                        i14 |= i25;
                        i26 = i14;
                        if ((1533916891 & i26) == 306783378) {
                            if (i23 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (o.J()) {
                                o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                            }
                            z zVar6 = z.f71709a;
                            d dVar10 = dVar3;
                            int i212 = i26 >> 18;
                            lVar2 = lVarV;
                            r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar6.a(), zVar6.a(), zVar6.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i212 & 7168) | (i212 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                            if (o.J()) {
                                o.R();
                            }
                            dVar4 = dVar10;
                        } else {
                            if (i23 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (o.J()) {
                                o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                            }
                            z zVar7 = z.f71709a;
                            d dVar11 = dVar3;
                            int i213 = i26 >> 18;
                            lVar2 = lVarV;
                            r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar7.a(), zVar7.a(), zVar7.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i213 & 7168) | (i213 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                            if (o.J()) {
                                o.R();
                            }
                            dVar4 = dVar11;
                        }
                        w2VarX = lVar2.x();
                        if (w2VarX != null) {
                            w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                        }
                    }
                    i14 |= 1572864;
                    z15 = z12;
                    if ((i13 & 128) != 0) {
                        if ((29360128 & i12) == 0) {
                            z16 = z13;
                            if (lVarV.p(z16)) {
                                i22 = 8388608;
                            } else {
                                i22 = 4194304;
                            }
                            i14 |= i22;
                        }
                        i23 = i13 & 256;
                        if (i23 != 0) {
                            i14 |= 100663296;
                            dVar2 = dVar;
                        } else {
                            dVar2 = dVar;
                            if ((i12 & 234881024) == 0) {
                                if (lVarV.n(dVar2)) {
                                    i24 = 67108864;
                                } else {
                                    i24 = 33554432;
                                }
                                i14 |= i24;
                            }
                        }
                        if ((i13 & 512) != 0) {
                            if ((1879048192 & i12) == 0) {
                                if (lVarV.K(onItemSelectedListener)) {
                                    i25 = PKIFailureInfo.duplicateCertReq;
                                } else {
                                    i25 = 268435456;
                                }
                            }
                            i26 = i14;
                            if ((1533916891 & i26) == 306783378) {
                                if (i23 != 0) {
                                    dVar3 = d.INSTANCE;
                                } else {
                                    dVar3 = dVar2;
                                }
                                if (o.J()) {
                                    o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                                }
                                z zVar8 = z.f71709a;
                                d dVar12 = dVar3;
                                int i214 = i26 >> 18;
                                lVar2 = lVarV;
                                r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar8.a(), zVar8.a(), zVar8.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i214 & 7168) | (i214 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                                if (o.J()) {
                                    o.R();
                                }
                                dVar4 = dVar12;
                            } else {
                                if (i23 != 0) {
                                    dVar3 = d.INSTANCE;
                                } else {
                                    dVar3 = dVar2;
                                }
                                if (o.J()) {
                                    o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                                }
                                z zVar9 = z.f71709a;
                                d dVar13 = dVar3;
                                int i215 = i26 >> 18;
                                lVar2 = lVarV;
                                r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar9.a(), zVar9.a(), zVar9.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i215 & 7168) | (i215 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                                if (o.J()) {
                                    o.R();
                                }
                                dVar4 = dVar13;
                            }
                            w2VarX = lVar2.x();
                            if (w2VarX != null) {
                                w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                            }
                        }
                        i25 = 805306368;
                        i14 |= i25;
                        i26 = i14;
                        if ((1533916891 & i26) == 306783378) {
                            if (i23 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (o.J()) {
                                o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                            }
                            z zVar10 = z.f71709a;
                            d dVar14 = dVar3;
                            int i216 = i26 >> 18;
                            lVar2 = lVarV;
                            r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar10.a(), zVar10.a(), zVar10.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i216 & 7168) | (i216 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                            if (o.J()) {
                                o.R();
                            }
                            dVar4 = dVar14;
                        } else {
                            if (i23 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (o.J()) {
                                o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                            }
                            z zVar11 = z.f71709a;
                            d dVar15 = dVar3;
                            int i217 = i26 >> 18;
                            lVar2 = lVarV;
                            r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar11.a(), zVar11.a(), zVar11.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i217 & 7168) | (i217 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                            if (o.J()) {
                                o.R();
                            }
                            dVar4 = dVar15;
                        }
                        w2VarX = lVar2.x();
                        if (w2VarX != null) {
                            w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                        }
                    }
                    i14 |= 12582912;
                    z16 = z13;
                    i23 = i13 & 256;
                    if (i23 != 0) {
                        i14 |= 100663296;
                        dVar2 = dVar;
                    } else {
                        dVar2 = dVar;
                        if ((i12 & 234881024) == 0) {
                            if (lVarV.n(dVar2)) {
                                i24 = 67108864;
                            } else {
                                i24 = 33554432;
                            }
                            i14 |= i24;
                        }
                    }
                    if ((i13 & 512) != 0) {
                        if ((1879048192 & i12) == 0) {
                            if (lVarV.K(onItemSelectedListener)) {
                                i25 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i25 = 268435456;
                            }
                        }
                        i26 = i14;
                        if ((1533916891 & i26) == 306783378) {
                            if (i23 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (o.J()) {
                                o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                            }
                            z zVar12 = z.f71709a;
                            d dVar16 = dVar3;
                            int i218 = i26 >> 18;
                            lVar2 = lVarV;
                            r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar12.a(), zVar12.a(), zVar12.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i218 & 7168) | (i218 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                            if (o.J()) {
                                o.R();
                            }
                            dVar4 = dVar16;
                        } else {
                            if (i23 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (o.J()) {
                                o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                            }
                            z zVar13 = z.f71709a;
                            d dVar17 = dVar3;
                            int i219 = i26 >> 18;
                            lVar2 = lVarV;
                            r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar13.a(), zVar13.a(), zVar13.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i219 & 7168) | (i219 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                            if (o.J()) {
                                o.R();
                            }
                            dVar4 = dVar17;
                        }
                        w2VarX = lVar2.x();
                        if (w2VarX != null) {
                            w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                        }
                    }
                    i25 = 805306368;
                    i14 |= i25;
                    i26 = i14;
                    if ((1533916891 & i26) == 306783378) {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar14 = z.f71709a;
                        d dVar18 = dVar3;
                        int i2110 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar14.a(), zVar14.a(), zVar14.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2110 & 7168) | (i2110 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar18;
                    } else {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar15 = z.f71709a;
                        d dVar19 = dVar3;
                        int i2111 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar15.a(), zVar15.a(), zVar15.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2111 & 7168) | (i2111 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar19;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                    }
                }
                i14 |= 196608;
                z14 = z11;
                if ((i13 & 64) != 0) {
                    if ((3670016 & i12) == 0) {
                        z15 = z12;
                        if (lVarV.p(z15)) {
                            i21 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i21 = PKIFailureInfo.signerNotTrusted;
                        }
                        i14 |= i21;
                    }
                    if ((i13 & 128) != 0) {
                        if ((29360128 & i12) == 0) {
                            z16 = z13;
                            if (lVarV.p(z16)) {
                                i22 = 8388608;
                            } else {
                                i22 = 4194304;
                            }
                            i14 |= i22;
                        }
                        i23 = i13 & 256;
                        if (i23 != 0) {
                            i14 |= 100663296;
                            dVar2 = dVar;
                        } else {
                            dVar2 = dVar;
                            if ((i12 & 234881024) == 0) {
                                if (lVarV.n(dVar2)) {
                                    i24 = 67108864;
                                } else {
                                    i24 = 33554432;
                                }
                                i14 |= i24;
                            }
                        }
                        if ((i13 & 512) != 0) {
                            if ((1879048192 & i12) == 0) {
                                if (lVarV.K(onItemSelectedListener)) {
                                    i25 = PKIFailureInfo.duplicateCertReq;
                                } else {
                                    i25 = 268435456;
                                }
                            }
                            i26 = i14;
                            if ((1533916891 & i26) == 306783378) {
                                if (i23 != 0) {
                                    dVar3 = d.INSTANCE;
                                } else {
                                    dVar3 = dVar2;
                                }
                                if (o.J()) {
                                    o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                                }
                                z zVar16 = z.f71709a;
                                d dVar110 = dVar3;
                                int i2112 = i26 >> 18;
                                lVar2 = lVarV;
                                r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar16.a(), zVar16.a(), zVar16.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2112 & 7168) | (i2112 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                                if (o.J()) {
                                    o.R();
                                }
                                dVar4 = dVar110;
                            } else {
                                if (i23 != 0) {
                                    dVar3 = d.INSTANCE;
                                } else {
                                    dVar3 = dVar2;
                                }
                                if (o.J()) {
                                    o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                                }
                                z zVar17 = z.f71709a;
                                d dVar111 = dVar3;
                                int i2113 = i26 >> 18;
                                lVar2 = lVarV;
                                r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar17.a(), zVar17.a(), zVar17.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2113 & 7168) | (i2113 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                                if (o.J()) {
                                    o.R();
                                }
                                dVar4 = dVar111;
                            }
                            w2VarX = lVar2.x();
                            if (w2VarX != null) {
                                w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                            }
                        }
                        i25 = 805306368;
                        i14 |= i25;
                        i26 = i14;
                        if ((1533916891 & i26) == 306783378) {
                            if (i23 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (o.J()) {
                                o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                            }
                            z zVar18 = z.f71709a;
                            d dVar112 = dVar3;
                            int i2114 = i26 >> 18;
                            lVar2 = lVarV;
                            r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar18.a(), zVar18.a(), zVar18.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2114 & 7168) | (i2114 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                            if (o.J()) {
                                o.R();
                            }
                            dVar4 = dVar112;
                        } else {
                            if (i23 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (o.J()) {
                                o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                            }
                            z zVar19 = z.f71709a;
                            d dVar113 = dVar3;
                            int i2115 = i26 >> 18;
                            lVar2 = lVarV;
                            r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar19.a(), zVar19.a(), zVar19.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2115 & 7168) | (i2115 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                            if (o.J()) {
                                o.R();
                            }
                            dVar4 = dVar113;
                        }
                        w2VarX = lVar2.x();
                        if (w2VarX != null) {
                            w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                        }
                    }
                    i14 |= 12582912;
                    z16 = z13;
                    i23 = i13 & 256;
                    if (i23 != 0) {
                        i14 |= 100663296;
                        dVar2 = dVar;
                    } else {
                        dVar2 = dVar;
                        if ((i12 & 234881024) == 0) {
                            if (lVarV.n(dVar2)) {
                                i24 = 67108864;
                            } else {
                                i24 = 33554432;
                            }
                            i14 |= i24;
                        }
                    }
                    if ((i13 & 512) != 0) {
                        if ((1879048192 & i12) == 0) {
                            if (lVarV.K(onItemSelectedListener)) {
                                i25 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i25 = 268435456;
                            }
                        }
                        i26 = i14;
                        if ((1533916891 & i26) == 306783378) {
                            if (i23 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (o.J()) {
                                o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                            }
                            z zVar110 = z.f71709a;
                            d dVar114 = dVar3;
                            int i2116 = i26 >> 18;
                            lVar2 = lVarV;
                            r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar110.a(), zVar110.a(), zVar110.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2116 & 7168) | (i2116 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                            if (o.J()) {
                                o.R();
                            }
                            dVar4 = dVar114;
                        } else {
                            if (i23 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (o.J()) {
                                o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                            }
                            z zVar111 = z.f71709a;
                            d dVar115 = dVar3;
                            int i2117 = i26 >> 18;
                            lVar2 = lVarV;
                            r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar111.a(), zVar111.a(), zVar111.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2117 & 7168) | (i2117 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                            if (o.J()) {
                                o.R();
                            }
                            dVar4 = dVar115;
                        }
                        w2VarX = lVar2.x();
                        if (w2VarX != null) {
                            w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                        }
                    }
                    i25 = 805306368;
                    i14 |= i25;
                    i26 = i14;
                    if ((1533916891 & i26) == 306783378) {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar112 = z.f71709a;
                        d dVar116 = dVar3;
                        int i2118 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar112.a(), zVar112.a(), zVar112.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2118 & 7168) | (i2118 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar116;
                    } else {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar113 = z.f71709a;
                        d dVar117 = dVar3;
                        int i2119 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar113.a(), zVar113.a(), zVar113.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2119 & 7168) | (i2119 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar117;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                    }
                }
                i14 |= 1572864;
                z15 = z12;
                if ((i13 & 128) != 0) {
                    if ((29360128 & i12) == 0) {
                        z16 = z13;
                        if (lVarV.p(z16)) {
                            i22 = 8388608;
                        } else {
                            i22 = 4194304;
                        }
                        i14 |= i22;
                    }
                    i23 = i13 & 256;
                    if (i23 != 0) {
                        i14 |= 100663296;
                        dVar2 = dVar;
                    } else {
                        dVar2 = dVar;
                        if ((i12 & 234881024) == 0) {
                            if (lVarV.n(dVar2)) {
                                i24 = 67108864;
                            } else {
                                i24 = 33554432;
                            }
                            i14 |= i24;
                        }
                    }
                    if ((i13 & 512) != 0) {
                        if ((1879048192 & i12) == 0) {
                            if (lVarV.K(onItemSelectedListener)) {
                                i25 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i25 = 268435456;
                            }
                        }
                        i26 = i14;
                        if ((1533916891 & i26) == 306783378) {
                            if (i23 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (o.J()) {
                                o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                            }
                            z zVar114 = z.f71709a;
                            d dVar118 = dVar3;
                            int i21110 = i26 >> 18;
                            lVar2 = lVarV;
                            r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar114.a(), zVar114.a(), zVar114.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21110 & 7168) | (i21110 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                            if (o.J()) {
                                o.R();
                            }
                            dVar4 = dVar118;
                        } else {
                            if (i23 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (o.J()) {
                                o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                            }
                            z zVar115 = z.f71709a;
                            d dVar119 = dVar3;
                            int i21111 = i26 >> 18;
                            lVar2 = lVarV;
                            r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar115.a(), zVar115.a(), zVar115.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21111 & 7168) | (i21111 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                            if (o.J()) {
                                o.R();
                            }
                            dVar4 = dVar119;
                        }
                        w2VarX = lVar2.x();
                        if (w2VarX != null) {
                            w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                        }
                    }
                    i25 = 805306368;
                    i14 |= i25;
                    i26 = i14;
                    if ((1533916891 & i26) == 306783378) {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar116 = z.f71709a;
                        d dVar1110 = dVar3;
                        int i21112 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar116.a(), zVar116.a(), zVar116.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21112 & 7168) | (i21112 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar1110;
                    } else {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar117 = z.f71709a;
                        d dVar1111 = dVar3;
                        int i21113 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar117.a(), zVar117.a(), zVar117.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21113 & 7168) | (i21113 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar1111;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                    }
                }
                i14 |= 12582912;
                z16 = z13;
                i23 = i13 & 256;
                if (i23 != 0) {
                    i14 |= 100663296;
                    dVar2 = dVar;
                } else {
                    dVar2 = dVar;
                    if ((i12 & 234881024) == 0) {
                        if (lVarV.n(dVar2)) {
                            i24 = 67108864;
                        } else {
                            i24 = 33554432;
                        }
                        i14 |= i24;
                    }
                }
                if ((i13 & 512) != 0) {
                    if ((1879048192 & i12) == 0) {
                        if (lVarV.K(onItemSelectedListener)) {
                            i25 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i25 = 268435456;
                        }
                    }
                    i26 = i14;
                    if ((1533916891 & i26) == 306783378) {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar118 = z.f71709a;
                        d dVar1112 = dVar3;
                        int i21114 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar118.a(), zVar118.a(), zVar118.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21114 & 7168) | (i21114 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar1112;
                    } else {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar119 = z.f71709a;
                        d dVar1113 = dVar3;
                        int i21115 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar119.a(), zVar119.a(), zVar119.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21115 & 7168) | (i21115 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar1113;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                    }
                }
                i25 = 805306368;
                i14 |= i25;
                i26 = i14;
                if ((1533916891 & i26) == 306783378) {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (o.J()) {
                        o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                    }
                    z zVar1110 = z.f71709a;
                    d dVar1114 = dVar3;
                    int i21116 = i26 >> 18;
                    lVar2 = lVarV;
                    r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1110.a(), zVar1110.a(), zVar1110.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21116 & 7168) | (i21116 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar1114;
                } else {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (o.J()) {
                        o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                    }
                    z zVar1111 = z.f71709a;
                    d dVar1115 = dVar3;
                    int i21117 = i26 >> 18;
                    lVar2 = lVarV;
                    r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1111.a(), zVar1111.a(), zVar1111.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21117 & 7168) | (i21117 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar1115;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                }
            }
            i14 |= KyberEngine.KyberPolyBytes;
            str2 = str;
            if ((i13 & 8) != 0) {
                i14 |= 3072;
            } else if ((i12 & 7168) == 0) {
                if (lVarV.n(imageLoader)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i14 |= i17;
            }
            if ((i13 & 16) != 0) {
                i14 |= 24576;
            } else if ((57344 & i12) == 0) {
                if (lVarV.n(title)) {
                    i18 = 16384;
                } else {
                    i18 = PKIFailureInfo.certRevoked;
                }
                i14 |= i18;
            }
            if ((i13 & 32) != 0) {
                if ((458752 & i12) == 0) {
                    z14 = z11;
                    if (lVarV.p(z14)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i14 |= i19;
                }
                if ((i13 & 64) != 0) {
                    if ((3670016 & i12) == 0) {
                        z15 = z12;
                        if (lVarV.p(z15)) {
                            i21 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i21 = PKIFailureInfo.signerNotTrusted;
                        }
                        i14 |= i21;
                    }
                    if ((i13 & 128) != 0) {
                        if ((29360128 & i12) == 0) {
                            z16 = z13;
                            if (lVarV.p(z16)) {
                                i22 = 8388608;
                            } else {
                                i22 = 4194304;
                            }
                            i14 |= i22;
                        }
                        i23 = i13 & 256;
                        if (i23 != 0) {
                            i14 |= 100663296;
                            dVar2 = dVar;
                        } else {
                            dVar2 = dVar;
                            if ((i12 & 234881024) == 0) {
                                if (lVarV.n(dVar2)) {
                                    i24 = 67108864;
                                } else {
                                    i24 = 33554432;
                                }
                                i14 |= i24;
                            }
                        }
                        if ((i13 & 512) != 0) {
                            if ((1879048192 & i12) == 0) {
                                if (lVarV.K(onItemSelectedListener)) {
                                    i25 = PKIFailureInfo.duplicateCertReq;
                                } else {
                                    i25 = 268435456;
                                }
                            }
                            i26 = i14;
                            if ((1533916891 & i26) == 306783378) {
                                if (i23 != 0) {
                                    dVar3 = d.INSTANCE;
                                } else {
                                    dVar3 = dVar2;
                                }
                                if (o.J()) {
                                    o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                                }
                                z zVar1112 = z.f71709a;
                                d dVar1116 = dVar3;
                                int i21118 = i26 >> 18;
                                lVar2 = lVarV;
                                r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1112.a(), zVar1112.a(), zVar1112.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21118 & 7168) | (i21118 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                                if (o.J()) {
                                    o.R();
                                }
                                dVar4 = dVar1116;
                            } else {
                                if (i23 != 0) {
                                    dVar3 = d.INSTANCE;
                                } else {
                                    dVar3 = dVar2;
                                }
                                if (o.J()) {
                                    o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                                }
                                z zVar1113 = z.f71709a;
                                d dVar1117 = dVar3;
                                int i21119 = i26 >> 18;
                                lVar2 = lVarV;
                                r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1113.a(), zVar1113.a(), zVar1113.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21119 & 7168) | (i21119 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                                if (o.J()) {
                                    o.R();
                                }
                                dVar4 = dVar1117;
                            }
                            w2VarX = lVar2.x();
                            if (w2VarX != null) {
                                w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                            }
                        }
                        i25 = 805306368;
                        i14 |= i25;
                        i26 = i14;
                        if ((1533916891 & i26) == 306783378) {
                            if (i23 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (o.J()) {
                                o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                            }
                            z zVar1114 = z.f71709a;
                            d dVar1118 = dVar3;
                            int i211110 = i26 >> 18;
                            lVar2 = lVarV;
                            r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1114.a(), zVar1114.a(), zVar1114.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211110 & 7168) | (i211110 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                            if (o.J()) {
                                o.R();
                            }
                            dVar4 = dVar1118;
                        } else {
                            if (i23 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (o.J()) {
                                o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                            }
                            z zVar1115 = z.f71709a;
                            d dVar1119 = dVar3;
                            int i211111 = i26 >> 18;
                            lVar2 = lVarV;
                            r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1115.a(), zVar1115.a(), zVar1115.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211111 & 7168) | (i211111 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                            if (o.J()) {
                                o.R();
                            }
                            dVar4 = dVar1119;
                        }
                        w2VarX = lVar2.x();
                        if (w2VarX != null) {
                            w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                        }
                    }
                    i14 |= 12582912;
                    z16 = z13;
                    i23 = i13 & 256;
                    if (i23 != 0) {
                        i14 |= 100663296;
                        dVar2 = dVar;
                    } else {
                        dVar2 = dVar;
                        if ((i12 & 234881024) == 0) {
                            if (lVarV.n(dVar2)) {
                                i24 = 67108864;
                            } else {
                                i24 = 33554432;
                            }
                            i14 |= i24;
                        }
                    }
                    if ((i13 & 512) != 0) {
                        if ((1879048192 & i12) == 0) {
                            if (lVarV.K(onItemSelectedListener)) {
                                i25 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i25 = 268435456;
                            }
                        }
                        i26 = i14;
                        if ((1533916891 & i26) == 306783378) {
                            if (i23 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (o.J()) {
                                o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                            }
                            z zVar1116 = z.f71709a;
                            d dVar11110 = dVar3;
                            int i211112 = i26 >> 18;
                            lVar2 = lVarV;
                            r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1116.a(), zVar1116.a(), zVar1116.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211112 & 7168) | (i211112 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                            if (o.J()) {
                                o.R();
                            }
                            dVar4 = dVar11110;
                        } else {
                            if (i23 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (o.J()) {
                                o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                            }
                            z zVar1117 = z.f71709a;
                            d dVar11111 = dVar3;
                            int i211113 = i26 >> 18;
                            lVar2 = lVarV;
                            r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1117.a(), zVar1117.a(), zVar1117.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211113 & 7168) | (i211113 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                            if (o.J()) {
                                o.R();
                            }
                            dVar4 = dVar11111;
                        }
                        w2VarX = lVar2.x();
                        if (w2VarX != null) {
                            w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                        }
                    }
                    i25 = 805306368;
                    i14 |= i25;
                    i26 = i14;
                    if ((1533916891 & i26) == 306783378) {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar1118 = z.f71709a;
                        d dVar11112 = dVar3;
                        int i211114 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1118.a(), zVar1118.a(), zVar1118.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211114 & 7168) | (i211114 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar11112;
                    } else {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar1119 = z.f71709a;
                        d dVar11113 = dVar3;
                        int i211115 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1119.a(), zVar1119.a(), zVar1119.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211115 & 7168) | (i211115 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar11113;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                    }
                }
                i14 |= 1572864;
                z15 = z12;
                if ((i13 & 128) != 0) {
                    if ((29360128 & i12) == 0) {
                        z16 = z13;
                        if (lVarV.p(z16)) {
                            i22 = 8388608;
                        } else {
                            i22 = 4194304;
                        }
                        i14 |= i22;
                    }
                    i23 = i13 & 256;
                    if (i23 != 0) {
                        i14 |= 100663296;
                        dVar2 = dVar;
                    } else {
                        dVar2 = dVar;
                        if ((i12 & 234881024) == 0) {
                            if (lVarV.n(dVar2)) {
                                i24 = 67108864;
                            } else {
                                i24 = 33554432;
                            }
                            i14 |= i24;
                        }
                    }
                    if ((i13 & 512) != 0) {
                        if ((1879048192 & i12) == 0) {
                            if (lVarV.K(onItemSelectedListener)) {
                                i25 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i25 = 268435456;
                            }
                        }
                        i26 = i14;
                        if ((1533916891 & i26) == 306783378) {
                            if (i23 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (o.J()) {
                                o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                            }
                            z zVar11110 = z.f71709a;
                            d dVar11114 = dVar3;
                            int i211116 = i26 >> 18;
                            lVar2 = lVarV;
                            r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar11110.a(), zVar11110.a(), zVar11110.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211116 & 7168) | (i211116 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                            if (o.J()) {
                                o.R();
                            }
                            dVar4 = dVar11114;
                        } else {
                            if (i23 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (o.J()) {
                                o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                            }
                            z zVar11111 = z.f71709a;
                            d dVar11115 = dVar3;
                            int i211117 = i26 >> 18;
                            lVar2 = lVarV;
                            r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar11111.a(), zVar11111.a(), zVar11111.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211117 & 7168) | (i211117 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                            if (o.J()) {
                                o.R();
                            }
                            dVar4 = dVar11115;
                        }
                        w2VarX = lVar2.x();
                        if (w2VarX != null) {
                            w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                        }
                    }
                    i25 = 805306368;
                    i14 |= i25;
                    i26 = i14;
                    if ((1533916891 & i26) == 306783378) {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar11112 = z.f71709a;
                        d dVar11116 = dVar3;
                        int i211118 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar11112.a(), zVar11112.a(), zVar11112.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211118 & 7168) | (i211118 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar11116;
                    } else {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar11113 = z.f71709a;
                        d dVar11117 = dVar3;
                        int i211119 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar11113.a(), zVar11113.a(), zVar11113.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211119 & 7168) | (i211119 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar11117;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                    }
                }
                i14 |= 12582912;
                z16 = z13;
                i23 = i13 & 256;
                if (i23 != 0) {
                    i14 |= 100663296;
                    dVar2 = dVar;
                } else {
                    dVar2 = dVar;
                    if ((i12 & 234881024) == 0) {
                        if (lVarV.n(dVar2)) {
                            i24 = 67108864;
                        } else {
                            i24 = 33554432;
                        }
                        i14 |= i24;
                    }
                }
                if ((i13 & 512) != 0) {
                    if ((1879048192 & i12) == 0) {
                        if (lVarV.K(onItemSelectedListener)) {
                            i25 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i25 = 268435456;
                        }
                    }
                    i26 = i14;
                    if ((1533916891 & i26) == 306783378) {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar11114 = z.f71709a;
                        d dVar11118 = dVar3;
                        int i2111110 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar11114.a(), zVar11114.a(), zVar11114.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2111110 & 7168) | (i2111110 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar11118;
                    } else {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar11115 = z.f71709a;
                        d dVar11119 = dVar3;
                        int i2111111 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar11115.a(), zVar11115.a(), zVar11115.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2111111 & 7168) | (i2111111 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar11119;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                    }
                }
                i25 = 805306368;
                i14 |= i25;
                i26 = i14;
                if ((1533916891 & i26) == 306783378) {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (o.J()) {
                        o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                    }
                    z zVar11116 = z.f71709a;
                    d dVar111110 = dVar3;
                    int i2111112 = i26 >> 18;
                    lVar2 = lVarV;
                    r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar11116.a(), zVar11116.a(), zVar11116.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2111112 & 7168) | (i2111112 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar111110;
                } else {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (o.J()) {
                        o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                    }
                    z zVar11117 = z.f71709a;
                    d dVar111111 = dVar3;
                    int i2111113 = i26 >> 18;
                    lVar2 = lVarV;
                    r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar11117.a(), zVar11117.a(), zVar11117.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2111113 & 7168) | (i2111113 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar111111;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                }
            }
            i14 |= 196608;
            z14 = z11;
            if ((i13 & 64) != 0) {
                if ((3670016 & i12) == 0) {
                    z15 = z12;
                    if (lVarV.p(z15)) {
                        i21 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i21 = PKIFailureInfo.signerNotTrusted;
                    }
                    i14 |= i21;
                }
                if ((i13 & 128) != 0) {
                    if ((29360128 & i12) == 0) {
                        z16 = z13;
                        if (lVarV.p(z16)) {
                            i22 = 8388608;
                        } else {
                            i22 = 4194304;
                        }
                        i14 |= i22;
                    }
                    i23 = i13 & 256;
                    if (i23 != 0) {
                        i14 |= 100663296;
                        dVar2 = dVar;
                    } else {
                        dVar2 = dVar;
                        if ((i12 & 234881024) == 0) {
                            if (lVarV.n(dVar2)) {
                                i24 = 67108864;
                            } else {
                                i24 = 33554432;
                            }
                            i14 |= i24;
                        }
                    }
                    if ((i13 & 512) != 0) {
                        if ((1879048192 & i12) == 0) {
                            if (lVarV.K(onItemSelectedListener)) {
                                i25 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i25 = 268435456;
                            }
                        }
                        i26 = i14;
                        if ((1533916891 & i26) == 306783378) {
                            if (i23 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (o.J()) {
                                o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                            }
                            z zVar11118 = z.f71709a;
                            d dVar111112 = dVar3;
                            int i2111114 = i26 >> 18;
                            lVar2 = lVarV;
                            r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar11118.a(), zVar11118.a(), zVar11118.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2111114 & 7168) | (i2111114 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                            if (o.J()) {
                                o.R();
                            }
                            dVar4 = dVar111112;
                        } else {
                            if (i23 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (o.J()) {
                                o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                            }
                            z zVar11119 = z.f71709a;
                            d dVar111113 = dVar3;
                            int i2111115 = i26 >> 18;
                            lVar2 = lVarV;
                            r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar11119.a(), zVar11119.a(), zVar11119.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2111115 & 7168) | (i2111115 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                            if (o.J()) {
                                o.R();
                            }
                            dVar4 = dVar111113;
                        }
                        w2VarX = lVar2.x();
                        if (w2VarX != null) {
                            w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                        }
                    }
                    i25 = 805306368;
                    i14 |= i25;
                    i26 = i14;
                    if ((1533916891 & i26) == 306783378) {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar111110 = z.f71709a;
                        d dVar111114 = dVar3;
                        int i2111116 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar111110.a(), zVar111110.a(), zVar111110.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2111116 & 7168) | (i2111116 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar111114;
                    } else {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar111111 = z.f71709a;
                        d dVar111115 = dVar3;
                        int i2111117 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar111111.a(), zVar111111.a(), zVar111111.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2111117 & 7168) | (i2111117 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar111115;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                    }
                }
                i14 |= 12582912;
                z16 = z13;
                i23 = i13 & 256;
                if (i23 != 0) {
                    i14 |= 100663296;
                    dVar2 = dVar;
                } else {
                    dVar2 = dVar;
                    if ((i12 & 234881024) == 0) {
                        if (lVarV.n(dVar2)) {
                            i24 = 67108864;
                        } else {
                            i24 = 33554432;
                        }
                        i14 |= i24;
                    }
                }
                if ((i13 & 512) != 0) {
                    if ((1879048192 & i12) == 0) {
                        if (lVarV.K(onItemSelectedListener)) {
                            i25 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i25 = 268435456;
                        }
                    }
                    i26 = i14;
                    if ((1533916891 & i26) == 306783378) {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar111112 = z.f71709a;
                        d dVar111116 = dVar3;
                        int i2111118 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar111112.a(), zVar111112.a(), zVar111112.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2111118 & 7168) | (i2111118 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar111116;
                    } else {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar111113 = z.f71709a;
                        d dVar111117 = dVar3;
                        int i2111119 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar111113.a(), zVar111113.a(), zVar111113.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2111119 & 7168) | (i2111119 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar111117;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                    }
                }
                i25 = 805306368;
                i14 |= i25;
                i26 = i14;
                if ((1533916891 & i26) == 306783378) {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (o.J()) {
                        o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                    }
                    z zVar111114 = z.f71709a;
                    d dVar111118 = dVar3;
                    int i21111110 = i26 >> 18;
                    lVar2 = lVarV;
                    r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar111114.a(), zVar111114.a(), zVar111114.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21111110 & 7168) | (i21111110 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar111118;
                } else {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (o.J()) {
                        o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                    }
                    z zVar111115 = z.f71709a;
                    d dVar111119 = dVar3;
                    int i21111111 = i26 >> 18;
                    lVar2 = lVarV;
                    r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar111115.a(), zVar111115.a(), zVar111115.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21111111 & 7168) | (i21111111 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar111119;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                }
            }
            i14 |= 1572864;
            z15 = z12;
            if ((i13 & 128) != 0) {
                if ((29360128 & i12) == 0) {
                    z16 = z13;
                    if (lVarV.p(z16)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 256;
                if (i23 != 0) {
                    i14 |= 100663296;
                    dVar2 = dVar;
                } else {
                    dVar2 = dVar;
                    if ((i12 & 234881024) == 0) {
                        if (lVarV.n(dVar2)) {
                            i24 = 67108864;
                        } else {
                            i24 = 33554432;
                        }
                        i14 |= i24;
                    }
                }
                if ((i13 & 512) != 0) {
                    if ((1879048192 & i12) == 0) {
                        if (lVarV.K(onItemSelectedListener)) {
                            i25 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i25 = 268435456;
                        }
                    }
                    i26 = i14;
                    if ((1533916891 & i26) == 306783378) {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar111116 = z.f71709a;
                        d dVar1111110 = dVar3;
                        int i21111112 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar111116.a(), zVar111116.a(), zVar111116.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21111112 & 7168) | (i21111112 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar1111110;
                    } else {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar111117 = z.f71709a;
                        d dVar1111111 = dVar3;
                        int i21111113 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar111117.a(), zVar111117.a(), zVar111117.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21111113 & 7168) | (i21111113 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar1111111;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                    }
                }
                i25 = 805306368;
                i14 |= i25;
                i26 = i14;
                if ((1533916891 & i26) == 306783378) {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (o.J()) {
                        o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                    }
                    z zVar111118 = z.f71709a;
                    d dVar1111112 = dVar3;
                    int i21111114 = i26 >> 18;
                    lVar2 = lVarV;
                    r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar111118.a(), zVar111118.a(), zVar111118.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21111114 & 7168) | (i21111114 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar1111112;
                } else {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (o.J()) {
                        o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                    }
                    z zVar111119 = z.f71709a;
                    d dVar1111113 = dVar3;
                    int i21111115 = i26 >> 18;
                    lVar2 = lVarV;
                    r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar111119.a(), zVar111119.a(), zVar111119.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21111115 & 7168) | (i21111115 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar1111113;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                }
            }
            i14 |= 12582912;
            z16 = z13;
            i23 = i13 & 256;
            if (i23 != 0) {
                i14 |= 100663296;
                dVar2 = dVar;
            } else {
                dVar2 = dVar;
                if ((i12 & 234881024) == 0) {
                    if (lVarV.n(dVar2)) {
                        i24 = 67108864;
                    } else {
                        i24 = 33554432;
                    }
                    i14 |= i24;
                }
            }
            if ((i13 & 512) != 0) {
                if ((1879048192 & i12) == 0) {
                    if (lVarV.K(onItemSelectedListener)) {
                        i25 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i25 = 268435456;
                    }
                }
                i26 = i14;
                if ((1533916891 & i26) == 306783378) {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (o.J()) {
                        o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                    }
                    z zVar1111110 = z.f71709a;
                    d dVar1111114 = dVar3;
                    int i21111116 = i26 >> 18;
                    lVar2 = lVarV;
                    r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1111110.a(), zVar1111110.a(), zVar1111110.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21111116 & 7168) | (i21111116 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar1111114;
                } else {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (o.J()) {
                        o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                    }
                    z zVar1111111 = z.f71709a;
                    d dVar1111115 = dVar3;
                    int i21111117 = i26 >> 18;
                    lVar2 = lVarV;
                    r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1111111.a(), zVar1111111.a(), zVar1111111.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21111117 & 7168) | (i21111117 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar1111115;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                }
            }
            i25 = 805306368;
            i14 |= i25;
            i26 = i14;
            if ((1533916891 & i26) == 306783378) {
                if (i23 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (o.J()) {
                    o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                }
                z zVar1111112 = z.f71709a;
                d dVar1111116 = dVar3;
                int i21111118 = i26 >> 18;
                lVar2 = lVarV;
                r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1111112.a(), zVar1111112.a(), zVar1111112.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21111118 & 7168) | (i21111118 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar1111116;
            } else {
                if (i23 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (o.J()) {
                    o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                }
                z zVar1111113 = z.f71709a;
                d dVar1111117 = dVar3;
                int i21111119 = i26 >> 18;
                lVar2 = lVarV;
                r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1111113.a(), zVar1111113.a(), zVar1111113.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21111119 & 7168) | (i21111119 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar1111117;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
            }
        }
        i14 |= 48;
        i15 = i11;
        if ((i13 & 4) != 0) {
            if ((i12 & 896) == 0) {
                str2 = str;
                if (lVarV.n(str2)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i14 |= i16;
            }
            if ((i13 & 8) != 0) {
                i14 |= 3072;
            } else if ((i12 & 7168) == 0) {
                if (lVarV.n(imageLoader)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i14 |= i17;
            }
            if ((i13 & 16) != 0) {
                i14 |= 24576;
            } else if ((57344 & i12) == 0) {
                if (lVarV.n(title)) {
                    i18 = 16384;
                } else {
                    i18 = PKIFailureInfo.certRevoked;
                }
                i14 |= i18;
            }
            if ((i13 & 32) != 0) {
                if ((458752 & i12) == 0) {
                    z14 = z11;
                    if (lVarV.p(z14)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i14 |= i19;
                }
                if ((i13 & 64) != 0) {
                    if ((3670016 & i12) == 0) {
                        z15 = z12;
                        if (lVarV.p(z15)) {
                            i21 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i21 = PKIFailureInfo.signerNotTrusted;
                        }
                        i14 |= i21;
                    }
                    if ((i13 & 128) != 0) {
                        if ((29360128 & i12) == 0) {
                            z16 = z13;
                            if (lVarV.p(z16)) {
                                i22 = 8388608;
                            } else {
                                i22 = 4194304;
                            }
                            i14 |= i22;
                        }
                        i23 = i13 & 256;
                        if (i23 != 0) {
                            i14 |= 100663296;
                            dVar2 = dVar;
                        } else {
                            dVar2 = dVar;
                            if ((i12 & 234881024) == 0) {
                                if (lVarV.n(dVar2)) {
                                    i24 = 67108864;
                                } else {
                                    i24 = 33554432;
                                }
                                i14 |= i24;
                            }
                        }
                        if ((i13 & 512) != 0) {
                            if ((1879048192 & i12) == 0) {
                                if (lVarV.K(onItemSelectedListener)) {
                                    i25 = PKIFailureInfo.duplicateCertReq;
                                } else {
                                    i25 = 268435456;
                                }
                            }
                            i26 = i14;
                            if ((1533916891 & i26) == 306783378) {
                                if (i23 != 0) {
                                    dVar3 = d.INSTANCE;
                                } else {
                                    dVar3 = dVar2;
                                }
                                if (o.J()) {
                                    o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                                }
                                z zVar1111114 = z.f71709a;
                                d dVar1111118 = dVar3;
                                int i211111110 = i26 >> 18;
                                lVar2 = lVarV;
                                r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1111114.a(), zVar1111114.a(), zVar1111114.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211111110 & 7168) | (i211111110 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                                if (o.J()) {
                                    o.R();
                                }
                                dVar4 = dVar1111118;
                            } else {
                                if (i23 != 0) {
                                    dVar3 = d.INSTANCE;
                                } else {
                                    dVar3 = dVar2;
                                }
                                if (o.J()) {
                                    o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                                }
                                z zVar1111115 = z.f71709a;
                                d dVar1111119 = dVar3;
                                int i211111111 = i26 >> 18;
                                lVar2 = lVarV;
                                r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1111115.a(), zVar1111115.a(), zVar1111115.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211111111 & 7168) | (i211111111 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                                if (o.J()) {
                                    o.R();
                                }
                                dVar4 = dVar1111119;
                            }
                            w2VarX = lVar2.x();
                            if (w2VarX != null) {
                                w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                            }
                        }
                        i25 = 805306368;
                        i14 |= i25;
                        i26 = i14;
                        if ((1533916891 & i26) == 306783378) {
                            if (i23 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (o.J()) {
                                o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                            }
                            z zVar1111116 = z.f71709a;
                            d dVar11111110 = dVar3;
                            int i211111112 = i26 >> 18;
                            lVar2 = lVarV;
                            r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1111116.a(), zVar1111116.a(), zVar1111116.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211111112 & 7168) | (i211111112 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                            if (o.J()) {
                                o.R();
                            }
                            dVar4 = dVar11111110;
                        } else {
                            if (i23 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (o.J()) {
                                o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                            }
                            z zVar1111117 = z.f71709a;
                            d dVar11111111 = dVar3;
                            int i211111113 = i26 >> 18;
                            lVar2 = lVarV;
                            r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1111117.a(), zVar1111117.a(), zVar1111117.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211111113 & 7168) | (i211111113 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                            if (o.J()) {
                                o.R();
                            }
                            dVar4 = dVar11111111;
                        }
                        w2VarX = lVar2.x();
                        if (w2VarX != null) {
                            w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                        }
                    }
                    i14 |= 12582912;
                    z16 = z13;
                    i23 = i13 & 256;
                    if (i23 != 0) {
                        i14 |= 100663296;
                        dVar2 = dVar;
                    } else {
                        dVar2 = dVar;
                        if ((i12 & 234881024) == 0) {
                            if (lVarV.n(dVar2)) {
                                i24 = 67108864;
                            } else {
                                i24 = 33554432;
                            }
                            i14 |= i24;
                        }
                    }
                    if ((i13 & 512) != 0) {
                        if ((1879048192 & i12) == 0) {
                            if (lVarV.K(onItemSelectedListener)) {
                                i25 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i25 = 268435456;
                            }
                        }
                        i26 = i14;
                        if ((1533916891 & i26) == 306783378) {
                            if (i23 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (o.J()) {
                                o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                            }
                            z zVar1111118 = z.f71709a;
                            d dVar11111112 = dVar3;
                            int i211111114 = i26 >> 18;
                            lVar2 = lVarV;
                            r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1111118.a(), zVar1111118.a(), zVar1111118.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211111114 & 7168) | (i211111114 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                            if (o.J()) {
                                o.R();
                            }
                            dVar4 = dVar11111112;
                        } else {
                            if (i23 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (o.J()) {
                                o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                            }
                            z zVar1111119 = z.f71709a;
                            d dVar11111113 = dVar3;
                            int i211111115 = i26 >> 18;
                            lVar2 = lVarV;
                            r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1111119.a(), zVar1111119.a(), zVar1111119.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211111115 & 7168) | (i211111115 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                            if (o.J()) {
                                o.R();
                            }
                            dVar4 = dVar11111113;
                        }
                        w2VarX = lVar2.x();
                        if (w2VarX != null) {
                            w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                        }
                    }
                    i25 = 805306368;
                    i14 |= i25;
                    i26 = i14;
                    if ((1533916891 & i26) == 306783378) {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar11111110 = z.f71709a;
                        d dVar11111114 = dVar3;
                        int i211111116 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar11111110.a(), zVar11111110.a(), zVar11111110.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211111116 & 7168) | (i211111116 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar11111114;
                    } else {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar11111111 = z.f71709a;
                        d dVar11111115 = dVar3;
                        int i211111117 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar11111111.a(), zVar11111111.a(), zVar11111111.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211111117 & 7168) | (i211111117 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar11111115;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                    }
                }
                i14 |= 1572864;
                z15 = z12;
                if ((i13 & 128) != 0) {
                    if ((29360128 & i12) == 0) {
                        z16 = z13;
                        if (lVarV.p(z16)) {
                            i22 = 8388608;
                        } else {
                            i22 = 4194304;
                        }
                        i14 |= i22;
                    }
                    i23 = i13 & 256;
                    if (i23 != 0) {
                        i14 |= 100663296;
                        dVar2 = dVar;
                    } else {
                        dVar2 = dVar;
                        if ((i12 & 234881024) == 0) {
                            if (lVarV.n(dVar2)) {
                                i24 = 67108864;
                            } else {
                                i24 = 33554432;
                            }
                            i14 |= i24;
                        }
                    }
                    if ((i13 & 512) != 0) {
                        if ((1879048192 & i12) == 0) {
                            if (lVarV.K(onItemSelectedListener)) {
                                i25 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i25 = 268435456;
                            }
                        }
                        i26 = i14;
                        if ((1533916891 & i26) == 306783378) {
                            if (i23 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (o.J()) {
                                o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                            }
                            z zVar11111112 = z.f71709a;
                            d dVar11111116 = dVar3;
                            int i211111118 = i26 >> 18;
                            lVar2 = lVarV;
                            r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar11111112.a(), zVar11111112.a(), zVar11111112.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211111118 & 7168) | (i211111118 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                            if (o.J()) {
                                o.R();
                            }
                            dVar4 = dVar11111116;
                        } else {
                            if (i23 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (o.J()) {
                                o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                            }
                            z zVar11111113 = z.f71709a;
                            d dVar11111117 = dVar3;
                            int i211111119 = i26 >> 18;
                            lVar2 = lVarV;
                            r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar11111113.a(), zVar11111113.a(), zVar11111113.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211111119 & 7168) | (i211111119 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                            if (o.J()) {
                                o.R();
                            }
                            dVar4 = dVar11111117;
                        }
                        w2VarX = lVar2.x();
                        if (w2VarX != null) {
                            w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                        }
                    }
                    i25 = 805306368;
                    i14 |= i25;
                    i26 = i14;
                    if ((1533916891 & i26) == 306783378) {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar11111114 = z.f71709a;
                        d dVar11111118 = dVar3;
                        int i2111111110 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar11111114.a(), zVar11111114.a(), zVar11111114.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2111111110 & 7168) | (i2111111110 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar11111118;
                    } else {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar11111115 = z.f71709a;
                        d dVar11111119 = dVar3;
                        int i2111111111 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar11111115.a(), zVar11111115.a(), zVar11111115.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2111111111 & 7168) | (i2111111111 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar11111119;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                    }
                }
                i14 |= 12582912;
                z16 = z13;
                i23 = i13 & 256;
                if (i23 != 0) {
                    i14 |= 100663296;
                    dVar2 = dVar;
                } else {
                    dVar2 = dVar;
                    if ((i12 & 234881024) == 0) {
                        if (lVarV.n(dVar2)) {
                            i24 = 67108864;
                        } else {
                            i24 = 33554432;
                        }
                        i14 |= i24;
                    }
                }
                if ((i13 & 512) != 0) {
                    if ((1879048192 & i12) == 0) {
                        if (lVarV.K(onItemSelectedListener)) {
                            i25 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i25 = 268435456;
                        }
                    }
                    i26 = i14;
                    if ((1533916891 & i26) == 306783378) {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar11111116 = z.f71709a;
                        d dVar111111110 = dVar3;
                        int i2111111112 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar11111116.a(), zVar11111116.a(), zVar11111116.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2111111112 & 7168) | (i2111111112 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar111111110;
                    } else {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar11111117 = z.f71709a;
                        d dVar111111111 = dVar3;
                        int i2111111113 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar11111117.a(), zVar11111117.a(), zVar11111117.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2111111113 & 7168) | (i2111111113 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar111111111;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                    }
                }
                i25 = 805306368;
                i14 |= i25;
                i26 = i14;
                if ((1533916891 & i26) == 306783378) {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (o.J()) {
                        o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                    }
                    z zVar11111118 = z.f71709a;
                    d dVar111111112 = dVar3;
                    int i2111111114 = i26 >> 18;
                    lVar2 = lVarV;
                    r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar11111118.a(), zVar11111118.a(), zVar11111118.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2111111114 & 7168) | (i2111111114 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar111111112;
                } else {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (o.J()) {
                        o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                    }
                    z zVar11111119 = z.f71709a;
                    d dVar111111113 = dVar3;
                    int i2111111115 = i26 >> 18;
                    lVar2 = lVarV;
                    r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar11111119.a(), zVar11111119.a(), zVar11111119.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2111111115 & 7168) | (i2111111115 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar111111113;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                }
            }
            i14 |= 196608;
            z14 = z11;
            if ((i13 & 64) != 0) {
                if ((3670016 & i12) == 0) {
                    z15 = z12;
                    if (lVarV.p(z15)) {
                        i21 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i21 = PKIFailureInfo.signerNotTrusted;
                    }
                    i14 |= i21;
                }
                if ((i13 & 128) != 0) {
                    if ((29360128 & i12) == 0) {
                        z16 = z13;
                        if (lVarV.p(z16)) {
                            i22 = 8388608;
                        } else {
                            i22 = 4194304;
                        }
                        i14 |= i22;
                    }
                    i23 = i13 & 256;
                    if (i23 != 0) {
                        i14 |= 100663296;
                        dVar2 = dVar;
                    } else {
                        dVar2 = dVar;
                        if ((i12 & 234881024) == 0) {
                            if (lVarV.n(dVar2)) {
                                i24 = 67108864;
                            } else {
                                i24 = 33554432;
                            }
                            i14 |= i24;
                        }
                    }
                    if ((i13 & 512) != 0) {
                        if ((1879048192 & i12) == 0) {
                            if (lVarV.K(onItemSelectedListener)) {
                                i25 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i25 = 268435456;
                            }
                        }
                        i26 = i14;
                        if ((1533916891 & i26) == 306783378) {
                            if (i23 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (o.J()) {
                                o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                            }
                            z zVar111111110 = z.f71709a;
                            d dVar111111114 = dVar3;
                            int i2111111116 = i26 >> 18;
                            lVar2 = lVarV;
                            r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar111111110.a(), zVar111111110.a(), zVar111111110.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2111111116 & 7168) | (i2111111116 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                            if (o.J()) {
                                o.R();
                            }
                            dVar4 = dVar111111114;
                        } else {
                            if (i23 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (o.J()) {
                                o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                            }
                            z zVar111111111 = z.f71709a;
                            d dVar111111115 = dVar3;
                            int i2111111117 = i26 >> 18;
                            lVar2 = lVarV;
                            r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar111111111.a(), zVar111111111.a(), zVar111111111.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2111111117 & 7168) | (i2111111117 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                            if (o.J()) {
                                o.R();
                            }
                            dVar4 = dVar111111115;
                        }
                        w2VarX = lVar2.x();
                        if (w2VarX != null) {
                            w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                        }
                    }
                    i25 = 805306368;
                    i14 |= i25;
                    i26 = i14;
                    if ((1533916891 & i26) == 306783378) {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar111111112 = z.f71709a;
                        d dVar111111116 = dVar3;
                        int i2111111118 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar111111112.a(), zVar111111112.a(), zVar111111112.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2111111118 & 7168) | (i2111111118 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar111111116;
                    } else {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar111111113 = z.f71709a;
                        d dVar111111117 = dVar3;
                        int i2111111119 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar111111113.a(), zVar111111113.a(), zVar111111113.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2111111119 & 7168) | (i2111111119 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar111111117;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                    }
                }
                i14 |= 12582912;
                z16 = z13;
                i23 = i13 & 256;
                if (i23 != 0) {
                    i14 |= 100663296;
                    dVar2 = dVar;
                } else {
                    dVar2 = dVar;
                    if ((i12 & 234881024) == 0) {
                        if (lVarV.n(dVar2)) {
                            i24 = 67108864;
                        } else {
                            i24 = 33554432;
                        }
                        i14 |= i24;
                    }
                }
                if ((i13 & 512) != 0) {
                    if ((1879048192 & i12) == 0) {
                        if (lVarV.K(onItemSelectedListener)) {
                            i25 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i25 = 268435456;
                        }
                    }
                    i26 = i14;
                    if ((1533916891 & i26) == 306783378) {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar111111114 = z.f71709a;
                        d dVar111111118 = dVar3;
                        int i21111111110 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar111111114.a(), zVar111111114.a(), zVar111111114.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21111111110 & 7168) | (i21111111110 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar111111118;
                    } else {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar111111115 = z.f71709a;
                        d dVar111111119 = dVar3;
                        int i21111111111 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar111111115.a(), zVar111111115.a(), zVar111111115.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21111111111 & 7168) | (i21111111111 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar111111119;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                    }
                }
                i25 = 805306368;
                i14 |= i25;
                i26 = i14;
                if ((1533916891 & i26) == 306783378) {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (o.J()) {
                        o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                    }
                    z zVar111111116 = z.f71709a;
                    d dVar1111111110 = dVar3;
                    int i21111111112 = i26 >> 18;
                    lVar2 = lVarV;
                    r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar111111116.a(), zVar111111116.a(), zVar111111116.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21111111112 & 7168) | (i21111111112 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar1111111110;
                } else {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (o.J()) {
                        o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                    }
                    z zVar111111117 = z.f71709a;
                    d dVar1111111111 = dVar3;
                    int i21111111113 = i26 >> 18;
                    lVar2 = lVarV;
                    r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar111111117.a(), zVar111111117.a(), zVar111111117.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21111111113 & 7168) | (i21111111113 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar1111111111;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                }
            }
            i14 |= 1572864;
            z15 = z12;
            if ((i13 & 128) != 0) {
                if ((29360128 & i12) == 0) {
                    z16 = z13;
                    if (lVarV.p(z16)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 256;
                if (i23 != 0) {
                    i14 |= 100663296;
                    dVar2 = dVar;
                } else {
                    dVar2 = dVar;
                    if ((i12 & 234881024) == 0) {
                        if (lVarV.n(dVar2)) {
                            i24 = 67108864;
                        } else {
                            i24 = 33554432;
                        }
                        i14 |= i24;
                    }
                }
                if ((i13 & 512) != 0) {
                    if ((1879048192 & i12) == 0) {
                        if (lVarV.K(onItemSelectedListener)) {
                            i25 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i25 = 268435456;
                        }
                    }
                    i26 = i14;
                    if ((1533916891 & i26) == 306783378) {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar111111118 = z.f71709a;
                        d dVar1111111112 = dVar3;
                        int i21111111114 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar111111118.a(), zVar111111118.a(), zVar111111118.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21111111114 & 7168) | (i21111111114 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar1111111112;
                    } else {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar111111119 = z.f71709a;
                        d dVar1111111113 = dVar3;
                        int i21111111115 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar111111119.a(), zVar111111119.a(), zVar111111119.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21111111115 & 7168) | (i21111111115 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar1111111113;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                    }
                }
                i25 = 805306368;
                i14 |= i25;
                i26 = i14;
                if ((1533916891 & i26) == 306783378) {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (o.J()) {
                        o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                    }
                    z zVar1111111110 = z.f71709a;
                    d dVar1111111114 = dVar3;
                    int i21111111116 = i26 >> 18;
                    lVar2 = lVarV;
                    r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1111111110.a(), zVar1111111110.a(), zVar1111111110.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21111111116 & 7168) | (i21111111116 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar1111111114;
                } else {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (o.J()) {
                        o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                    }
                    z zVar1111111111 = z.f71709a;
                    d dVar1111111115 = dVar3;
                    int i21111111117 = i26 >> 18;
                    lVar2 = lVarV;
                    r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1111111111.a(), zVar1111111111.a(), zVar1111111111.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21111111117 & 7168) | (i21111111117 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar1111111115;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                }
            }
            i14 |= 12582912;
            z16 = z13;
            i23 = i13 & 256;
            if (i23 != 0) {
                i14 |= 100663296;
                dVar2 = dVar;
            } else {
                dVar2 = dVar;
                if ((i12 & 234881024) == 0) {
                    if (lVarV.n(dVar2)) {
                        i24 = 67108864;
                    } else {
                        i24 = 33554432;
                    }
                    i14 |= i24;
                }
            }
            if ((i13 & 512) != 0) {
                if ((1879048192 & i12) == 0) {
                    if (lVarV.K(onItemSelectedListener)) {
                        i25 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i25 = 268435456;
                    }
                }
                i26 = i14;
                if ((1533916891 & i26) == 306783378) {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (o.J()) {
                        o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                    }
                    z zVar1111111112 = z.f71709a;
                    d dVar1111111116 = dVar3;
                    int i21111111118 = i26 >> 18;
                    lVar2 = lVarV;
                    r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1111111112.a(), zVar1111111112.a(), zVar1111111112.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21111111118 & 7168) | (i21111111118 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar1111111116;
                } else {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (o.J()) {
                        o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                    }
                    z zVar1111111113 = z.f71709a;
                    d dVar1111111117 = dVar3;
                    int i21111111119 = i26 >> 18;
                    lVar2 = lVarV;
                    r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1111111113.a(), zVar1111111113.a(), zVar1111111113.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21111111119 & 7168) | (i21111111119 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar1111111117;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                }
            }
            i25 = 805306368;
            i14 |= i25;
            i26 = i14;
            if ((1533916891 & i26) == 306783378) {
                if (i23 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (o.J()) {
                    o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                }
                z zVar1111111114 = z.f71709a;
                d dVar1111111118 = dVar3;
                int i211111111110 = i26 >> 18;
                lVar2 = lVarV;
                r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1111111114.a(), zVar1111111114.a(), zVar1111111114.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211111111110 & 7168) | (i211111111110 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar1111111118;
            } else {
                if (i23 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (o.J()) {
                    o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                }
                z zVar1111111115 = z.f71709a;
                d dVar1111111119 = dVar3;
                int i211111111111 = i26 >> 18;
                lVar2 = lVarV;
                r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1111111115.a(), zVar1111111115.a(), zVar1111111115.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211111111111 & 7168) | (i211111111111 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar1111111119;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
            }
        }
        i14 |= KyberEngine.KyberPolyBytes;
        str2 = str;
        if ((i13 & 8) != 0) {
            i14 |= 3072;
        } else if ((i12 & 7168) == 0) {
            if (lVarV.n(imageLoader)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            i14 |= i17;
        }
        if ((i13 & 16) != 0) {
            i14 |= 24576;
        } else if ((57344 & i12) == 0) {
            if (lVarV.n(title)) {
                i18 = 16384;
            } else {
                i18 = PKIFailureInfo.certRevoked;
            }
            i14 |= i18;
        }
        if ((i13 & 32) != 0) {
            if ((458752 & i12) == 0) {
                z14 = z11;
                if (lVarV.p(z14)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i14 |= i19;
            }
            if ((i13 & 64) != 0) {
                if ((3670016 & i12) == 0) {
                    z15 = z12;
                    if (lVarV.p(z15)) {
                        i21 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i21 = PKIFailureInfo.signerNotTrusted;
                    }
                    i14 |= i21;
                }
                if ((i13 & 128) != 0) {
                    if ((29360128 & i12) == 0) {
                        z16 = z13;
                        if (lVarV.p(z16)) {
                            i22 = 8388608;
                        } else {
                            i22 = 4194304;
                        }
                        i14 |= i22;
                    }
                    i23 = i13 & 256;
                    if (i23 != 0) {
                        i14 |= 100663296;
                        dVar2 = dVar;
                    } else {
                        dVar2 = dVar;
                        if ((i12 & 234881024) == 0) {
                            if (lVarV.n(dVar2)) {
                                i24 = 67108864;
                            } else {
                                i24 = 33554432;
                            }
                            i14 |= i24;
                        }
                    }
                    if ((i13 & 512) != 0) {
                        if ((1879048192 & i12) == 0) {
                            if (lVarV.K(onItemSelectedListener)) {
                                i25 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i25 = 268435456;
                            }
                        }
                        i26 = i14;
                        if ((1533916891 & i26) == 306783378) {
                            if (i23 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (o.J()) {
                                o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                            }
                            z zVar1111111116 = z.f71709a;
                            d dVar11111111110 = dVar3;
                            int i211111111112 = i26 >> 18;
                            lVar2 = lVarV;
                            r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1111111116.a(), zVar1111111116.a(), zVar1111111116.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211111111112 & 7168) | (i211111111112 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                            if (o.J()) {
                                o.R();
                            }
                            dVar4 = dVar11111111110;
                        } else {
                            if (i23 != 0) {
                                dVar3 = d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (o.J()) {
                                o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                            }
                            z zVar1111111117 = z.f71709a;
                            d dVar11111111111 = dVar3;
                            int i211111111113 = i26 >> 18;
                            lVar2 = lVarV;
                            r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1111111117.a(), zVar1111111117.a(), zVar1111111117.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211111111113 & 7168) | (i211111111113 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                            if (o.J()) {
                                o.R();
                            }
                            dVar4 = dVar11111111111;
                        }
                        w2VarX = lVar2.x();
                        if (w2VarX != null) {
                            w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                        }
                    }
                    i25 = 805306368;
                    i14 |= i25;
                    i26 = i14;
                    if ((1533916891 & i26) == 306783378) {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar1111111118 = z.f71709a;
                        d dVar11111111112 = dVar3;
                        int i211111111114 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1111111118.a(), zVar1111111118.a(), zVar1111111118.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211111111114 & 7168) | (i211111111114 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar11111111112;
                    } else {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar1111111119 = z.f71709a;
                        d dVar11111111113 = dVar3;
                        int i211111111115 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1111111119.a(), zVar1111111119.a(), zVar1111111119.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211111111115 & 7168) | (i211111111115 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar11111111113;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                    }
                }
                i14 |= 12582912;
                z16 = z13;
                i23 = i13 & 256;
                if (i23 != 0) {
                    i14 |= 100663296;
                    dVar2 = dVar;
                } else {
                    dVar2 = dVar;
                    if ((i12 & 234881024) == 0) {
                        if (lVarV.n(dVar2)) {
                            i24 = 67108864;
                        } else {
                            i24 = 33554432;
                        }
                        i14 |= i24;
                    }
                }
                if ((i13 & 512) != 0) {
                    if ((1879048192 & i12) == 0) {
                        if (lVarV.K(onItemSelectedListener)) {
                            i25 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i25 = 268435456;
                        }
                    }
                    i26 = i14;
                    if ((1533916891 & i26) == 306783378) {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar11111111110 = z.f71709a;
                        d dVar11111111114 = dVar3;
                        int i211111111116 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar11111111110.a(), zVar11111111110.a(), zVar11111111110.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211111111116 & 7168) | (i211111111116 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar11111111114;
                    } else {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar11111111111 = z.f71709a;
                        d dVar11111111115 = dVar3;
                        int i211111111117 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar11111111111.a(), zVar11111111111.a(), zVar11111111111.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211111111117 & 7168) | (i211111111117 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar11111111115;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                    }
                }
                i25 = 805306368;
                i14 |= i25;
                i26 = i14;
                if ((1533916891 & i26) == 306783378) {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (o.J()) {
                        o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                    }
                    z zVar11111111112 = z.f71709a;
                    d dVar11111111116 = dVar3;
                    int i211111111118 = i26 >> 18;
                    lVar2 = lVarV;
                    r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar11111111112.a(), zVar11111111112.a(), zVar11111111112.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211111111118 & 7168) | (i211111111118 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar11111111116;
                } else {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (o.J()) {
                        o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                    }
                    z zVar11111111113 = z.f71709a;
                    d dVar11111111117 = dVar3;
                    int i211111111119 = i26 >> 18;
                    lVar2 = lVarV;
                    r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar11111111113.a(), zVar11111111113.a(), zVar11111111113.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211111111119 & 7168) | (i211111111119 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar11111111117;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                }
            }
            i14 |= 1572864;
            z15 = z12;
            if ((i13 & 128) != 0) {
                if ((29360128 & i12) == 0) {
                    z16 = z13;
                    if (lVarV.p(z16)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 256;
                if (i23 != 0) {
                    i14 |= 100663296;
                    dVar2 = dVar;
                } else {
                    dVar2 = dVar;
                    if ((i12 & 234881024) == 0) {
                        if (lVarV.n(dVar2)) {
                            i24 = 67108864;
                        } else {
                            i24 = 33554432;
                        }
                        i14 |= i24;
                    }
                }
                if ((i13 & 512) != 0) {
                    if ((1879048192 & i12) == 0) {
                        if (lVarV.K(onItemSelectedListener)) {
                            i25 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i25 = 268435456;
                        }
                    }
                    i26 = i14;
                    if ((1533916891 & i26) == 306783378) {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar11111111114 = z.f71709a;
                        d dVar11111111118 = dVar3;
                        int i2111111111110 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar11111111114.a(), zVar11111111114.a(), zVar11111111114.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2111111111110 & 7168) | (i2111111111110 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar11111111118;
                    } else {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar11111111115 = z.f71709a;
                        d dVar11111111119 = dVar3;
                        int i2111111111111 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar11111111115.a(), zVar11111111115.a(), zVar11111111115.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2111111111111 & 7168) | (i2111111111111 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar11111111119;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                    }
                }
                i25 = 805306368;
                i14 |= i25;
                i26 = i14;
                if ((1533916891 & i26) == 306783378) {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (o.J()) {
                        o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                    }
                    z zVar11111111116 = z.f71709a;
                    d dVar111111111110 = dVar3;
                    int i2111111111112 = i26 >> 18;
                    lVar2 = lVarV;
                    r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar11111111116.a(), zVar11111111116.a(), zVar11111111116.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2111111111112 & 7168) | (i2111111111112 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar111111111110;
                } else {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (o.J()) {
                        o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                    }
                    z zVar11111111117 = z.f71709a;
                    d dVar111111111111 = dVar3;
                    int i2111111111113 = i26 >> 18;
                    lVar2 = lVarV;
                    r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar11111111117.a(), zVar11111111117.a(), zVar11111111117.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2111111111113 & 7168) | (i2111111111113 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar111111111111;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                }
            }
            i14 |= 12582912;
            z16 = z13;
            i23 = i13 & 256;
            if (i23 != 0) {
                i14 |= 100663296;
                dVar2 = dVar;
            } else {
                dVar2 = dVar;
                if ((i12 & 234881024) == 0) {
                    if (lVarV.n(dVar2)) {
                        i24 = 67108864;
                    } else {
                        i24 = 33554432;
                    }
                    i14 |= i24;
                }
            }
            if ((i13 & 512) != 0) {
                if ((1879048192 & i12) == 0) {
                    if (lVarV.K(onItemSelectedListener)) {
                        i25 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i25 = 268435456;
                    }
                }
                i26 = i14;
                if ((1533916891 & i26) == 306783378) {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (o.J()) {
                        o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                    }
                    z zVar11111111118 = z.f71709a;
                    d dVar111111111112 = dVar3;
                    int i2111111111114 = i26 >> 18;
                    lVar2 = lVarV;
                    r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar11111111118.a(), zVar11111111118.a(), zVar11111111118.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2111111111114 & 7168) | (i2111111111114 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar111111111112;
                } else {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (o.J()) {
                        o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                    }
                    z zVar11111111119 = z.f71709a;
                    d dVar111111111113 = dVar3;
                    int i2111111111115 = i26 >> 18;
                    lVar2 = lVarV;
                    r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar11111111119.a(), zVar11111111119.a(), zVar11111111119.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2111111111115 & 7168) | (i2111111111115 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar111111111113;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                }
            }
            i25 = 805306368;
            i14 |= i25;
            i26 = i14;
            if ((1533916891 & i26) == 306783378) {
                if (i23 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (o.J()) {
                    o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                }
                z zVar111111111110 = z.f71709a;
                d dVar111111111114 = dVar3;
                int i2111111111116 = i26 >> 18;
                lVar2 = lVarV;
                r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar111111111110.a(), zVar111111111110.a(), zVar111111111110.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2111111111116 & 7168) | (i2111111111116 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar111111111114;
            } else {
                if (i23 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (o.J()) {
                    o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                }
                z zVar111111111111 = z.f71709a;
                d dVar111111111115 = dVar3;
                int i2111111111117 = i26 >> 18;
                lVar2 = lVarV;
                r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar111111111111.a(), zVar111111111111.a(), zVar111111111111.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2111111111117 & 7168) | (i2111111111117 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar111111111115;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
            }
        }
        i14 |= 196608;
        z14 = z11;
        if ((i13 & 64) != 0) {
            if ((3670016 & i12) == 0) {
                z15 = z12;
                if (lVarV.p(z15)) {
                    i21 = PKIFailureInfo.badCertTemplate;
                } else {
                    i21 = PKIFailureInfo.signerNotTrusted;
                }
                i14 |= i21;
            }
            if ((i13 & 128) != 0) {
                if ((29360128 & i12) == 0) {
                    z16 = z13;
                    if (lVarV.p(z16)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 256;
                if (i23 != 0) {
                    i14 |= 100663296;
                    dVar2 = dVar;
                } else {
                    dVar2 = dVar;
                    if ((i12 & 234881024) == 0) {
                        if (lVarV.n(dVar2)) {
                            i24 = 67108864;
                        } else {
                            i24 = 33554432;
                        }
                        i14 |= i24;
                    }
                }
                if ((i13 & 512) != 0) {
                    if ((1879048192 & i12) == 0) {
                        if (lVarV.K(onItemSelectedListener)) {
                            i25 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i25 = 268435456;
                        }
                    }
                    i26 = i14;
                    if ((1533916891 & i26) == 306783378) {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar111111111112 = z.f71709a;
                        d dVar111111111116 = dVar3;
                        int i2111111111118 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar111111111112.a(), zVar111111111112.a(), zVar111111111112.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2111111111118 & 7168) | (i2111111111118 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar111111111116;
                    } else {
                        if (i23 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (o.J()) {
                            o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                        }
                        z zVar111111111113 = z.f71709a;
                        d dVar111111111117 = dVar3;
                        int i2111111111119 = i26 >> 18;
                        lVar2 = lVarV;
                        r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar111111111113.a(), zVar111111111113.a(), zVar111111111113.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i2111111111119 & 7168) | (i2111111111119 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar111111111117;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                    }
                }
                i25 = 805306368;
                i14 |= i25;
                i26 = i14;
                if ((1533916891 & i26) == 306783378) {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (o.J()) {
                        o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                    }
                    z zVar111111111114 = z.f71709a;
                    d dVar111111111118 = dVar3;
                    int i21111111111110 = i26 >> 18;
                    lVar2 = lVarV;
                    r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar111111111114.a(), zVar111111111114.a(), zVar111111111114.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21111111111110 & 7168) | (i21111111111110 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar111111111118;
                } else {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (o.J()) {
                        o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                    }
                    z zVar111111111115 = z.f71709a;
                    d dVar111111111119 = dVar3;
                    int i21111111111111 = i26 >> 18;
                    lVar2 = lVarV;
                    r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar111111111115.a(), zVar111111111115.a(), zVar111111111115.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21111111111111 & 7168) | (i21111111111111 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar111111111119;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                }
            }
            i14 |= 12582912;
            z16 = z13;
            i23 = i13 & 256;
            if (i23 != 0) {
                i14 |= 100663296;
                dVar2 = dVar;
            } else {
                dVar2 = dVar;
                if ((i12 & 234881024) == 0) {
                    if (lVarV.n(dVar2)) {
                        i24 = 67108864;
                    } else {
                        i24 = 33554432;
                    }
                    i14 |= i24;
                }
            }
            if ((i13 & 512) != 0) {
                if ((1879048192 & i12) == 0) {
                    if (lVarV.K(onItemSelectedListener)) {
                        i25 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i25 = 268435456;
                    }
                }
                i26 = i14;
                if ((1533916891 & i26) == 306783378) {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (o.J()) {
                        o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                    }
                    z zVar111111111116 = z.f71709a;
                    d dVar1111111111110 = dVar3;
                    int i21111111111112 = i26 >> 18;
                    lVar2 = lVarV;
                    r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar111111111116.a(), zVar111111111116.a(), zVar111111111116.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21111111111112 & 7168) | (i21111111111112 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar1111111111110;
                } else {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (o.J()) {
                        o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                    }
                    z zVar111111111117 = z.f71709a;
                    d dVar1111111111111 = dVar3;
                    int i21111111111113 = i26 >> 18;
                    lVar2 = lVarV;
                    r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar111111111117.a(), zVar111111111117.a(), zVar111111111117.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21111111111113 & 7168) | (i21111111111113 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar1111111111111;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                }
            }
            i25 = 805306368;
            i14 |= i25;
            i26 = i14;
            if ((1533916891 & i26) == 306783378) {
                if (i23 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (o.J()) {
                    o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                }
                z zVar111111111118 = z.f71709a;
                d dVar1111111111112 = dVar3;
                int i21111111111114 = i26 >> 18;
                lVar2 = lVarV;
                r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar111111111118.a(), zVar111111111118.a(), zVar111111111118.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21111111111114 & 7168) | (i21111111111114 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar1111111111112;
            } else {
                if (i23 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (o.J()) {
                    o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                }
                z zVar111111111119 = z.f71709a;
                d dVar1111111111113 = dVar3;
                int i21111111111115 = i26 >> 18;
                lVar2 = lVarV;
                r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar111111111119.a(), zVar111111111119.a(), zVar111111111119.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21111111111115 & 7168) | (i21111111111115 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar1111111111113;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
            }
        }
        i14 |= 1572864;
        z15 = z12;
        if ((i13 & 128) != 0) {
            if ((29360128 & i12) == 0) {
                z16 = z13;
                if (lVarV.p(z16)) {
                    i22 = 8388608;
                } else {
                    i22 = 4194304;
                }
                i14 |= i22;
            }
            i23 = i13 & 256;
            if (i23 != 0) {
                i14 |= 100663296;
                dVar2 = dVar;
            } else {
                dVar2 = dVar;
                if ((i12 & 234881024) == 0) {
                    if (lVarV.n(dVar2)) {
                        i24 = 67108864;
                    } else {
                        i24 = 33554432;
                    }
                    i14 |= i24;
                }
            }
            if ((i13 & 512) != 0) {
                if ((1879048192 & i12) == 0) {
                    if (lVarV.K(onItemSelectedListener)) {
                        i25 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i25 = 268435456;
                    }
                }
                i26 = i14;
                if ((1533916891 & i26) == 306783378) {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (o.J()) {
                        o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                    }
                    z zVar1111111111110 = z.f71709a;
                    d dVar1111111111114 = dVar3;
                    int i21111111111116 = i26 >> 18;
                    lVar2 = lVarV;
                    r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1111111111110.a(), zVar1111111111110.a(), zVar1111111111110.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21111111111116 & 7168) | (i21111111111116 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar1111111111114;
                } else {
                    if (i23 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (o.J()) {
                        o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                    }
                    z zVar1111111111111 = z.f71709a;
                    d dVar1111111111115 = dVar3;
                    int i21111111111117 = i26 >> 18;
                    lVar2 = lVarV;
                    r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1111111111111.a(), zVar1111111111111.a(), zVar1111111111111.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21111111111117 & 7168) | (i21111111111117 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar1111111111115;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
                }
            }
            i25 = 805306368;
            i14 |= i25;
            i26 = i14;
            if ((1533916891 & i26) == 306783378) {
                if (i23 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (o.J()) {
                    o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                }
                z zVar1111111111112 = z.f71709a;
                d dVar1111111111116 = dVar3;
                int i21111111111118 = i26 >> 18;
                lVar2 = lVarV;
                r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1111111111112.a(), zVar1111111111112.a(), zVar1111111111112.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21111111111118 & 7168) | (i21111111111118 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar1111111111116;
            } else {
                if (i23 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (o.J()) {
                    o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                }
                z zVar1111111111113 = z.f71709a;
                d dVar1111111111117 = dVar3;
                int i21111111111119 = i26 >> 18;
                lVar2 = lVarV;
                r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1111111111113.a(), zVar1111111111113.a(), zVar1111111111113.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i21111111111119 & 7168) | (i21111111111119 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar1111111111117;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
            }
        }
        i14 |= 12582912;
        z16 = z13;
        i23 = i13 & 256;
        if (i23 != 0) {
            i14 |= 100663296;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            if ((i12 & 234881024) == 0) {
                if (lVarV.n(dVar2)) {
                    i24 = 67108864;
                } else {
                    i24 = 33554432;
                }
                i14 |= i24;
            }
        }
        if ((i13 & 512) != 0) {
            if ((1879048192 & i12) == 0) {
                if (lVarV.K(onItemSelectedListener)) {
                    i25 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i25 = 268435456;
                }
            }
            i26 = i14;
            if ((1533916891 & i26) == 306783378) {
                if (i23 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (o.J()) {
                    o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                }
                z zVar1111111111114 = z.f71709a;
                d dVar1111111111118 = dVar3;
                int i211111111111110 = i26 >> 18;
                lVar2 = lVarV;
                r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1111111111114.a(), zVar1111111111114.a(), zVar1111111111114.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211111111111110 & 7168) | (i211111111111110 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar1111111111118;
            } else {
                if (i23 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (o.J()) {
                    o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
                }
                z zVar1111111111115 = z.f71709a;
                d dVar1111111111119 = dVar3;
                int i211111111111111 = i26 >> 18;
                lVar2 = lVarV;
                r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1111111111115.a(), zVar1111111111115.a(), zVar1111111111115.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211111111111111 & 7168) | (i211111111111111 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar1111111111119;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
            }
        }
        i25 = 805306368;
        i14 |= i25;
        i26 = i14;
        if ((1533916891 & i26) == 306783378) {
            if (i23 != 0) {
                dVar3 = d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (o.J()) {
                o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
            }
            z zVar1111111111116 = z.f71709a;
            d dVar11111111111110 = dVar3;
            int i211111111111112 = i26 >> 18;
            lVar2 = lVarV;
            r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1111111111116.a(), zVar1111111111116.a(), zVar1111111111116.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211111111111112 & 7168) | (i211111111111112 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
            if (o.J()) {
                o.R();
            }
            dVar4 = dVar11111111111110;
        } else {
            if (i23 != 0) {
                dVar3 = d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (o.J()) {
                o.S(1778603677, i26, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:33)");
            }
            z zVar1111111111117 = z.f71709a;
            d dVar11111111111111 = dVar3;
            int i211111111111113 = i26 >> 18;
            lVar2 = lVarV;
            r0.a(z12, z14, false, onItemSelectedListener, t.e(zVar1111111111117.a(), zVar1111111111117.a(), zVar1111111111117.a(), BitmapDescriptorFactory.HUE_RED, 8, null), v1.b.f117444a.g(), x.x(x.i(dVar3, h.g(60)), f11, BitmapDescriptorFactory.HUE_RED, 2, null), z2.c.b(lVarV, -2139491033, true, new a(i15, str2, imageLoader, z16, title, z15)), lVar2, (i211111111111113 & 7168) | (i211111111111113 & 14) | 12779520 | ((i26 >> 12) & 112), 4);
            if (o.J()) {
                o.R();
            }
            dVar4 = dVar11111111111111;
        }
        w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new b(f11, i11, str, imageLoader, title, z11, z12, z13, dVar4, onItemSelectedListener, i12, i13));
        }
    }
}
