package p023w50;

import a2.RoundedCornerShape;
import a2.g;
import androidx.compose.foundation.layout.x;
import androidx.compose.ui.d;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import kotlin.KeyboardOptions;
import kotlin.z;
import o4.z0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p007h2.m0;
import p009i2.t1;
import p009i2.u0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.h2;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w;
import p020r2.w2;
import p026y50.i;
import w4.h;
import wn0.p;
import z2.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a·\u0001\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000fH\u0001¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"", "value", "", "enabled", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function1;", "Ljn0/h0;", "onValueChange", "readOnly", "isError", "Lb2/a0;", "keyboardOptions", "Lb2/z;", "keyboardActions", "Lkotlin/Function0;", "placeholder", "Lo4/z0;", "visualTransformation", "trailingIcon", "leadingIcon", AnnotatedPrivateKey.LABEL, "a", "(Ljava/lang/String;ZLandroidx/compose/ui/d;Lwn0/l;ZZLb2/a0;Lb2/z;Lwn0/p;Lo4/z0;Lwn0/p;Lwn0/p;Lwn0/p;Lr2/l;III)V", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class m {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f120949c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f120950d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ RoundedCornerShape f120951e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f120952f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ wn0.l<String, h0> f120953g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f120954h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f120955i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f120956j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f120957k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f120958l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f120959m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f120960n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ z0 f120961o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ KeyboardOptions f120962p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ z f120963q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(d dVar, float f11, RoundedCornerShape roundedCornerShape, String str, wn0.l<? super String, h0> lVar, boolean z11, boolean z12, p<? super l, ? super Integer, h0> pVar, p<? super l, ? super Integer, h0> pVar2, p<? super l, ? super Integer, h0> pVar3, p<? super l, ? super Integer, h0> pVar4, boolean z13, z0 z0Var, KeyboardOptions keyboardOptions, z zVar) {
            super(2);
            this.f120949c = dVar;
            this.f120950d = f11;
            this.f120951e = roundedCornerShape;
            this.f120952f = str;
            this.f120953g = lVar;
            this.f120954h = z11;
            this.f120955i = z12;
            this.f120956j = pVar;
            this.f120957k = pVar2;
            this.f120958l = pVar3;
            this.f120959m = pVar4;
            this.f120960n = z13;
            this.f120961o = z0Var;
            this.f120962p = keyboardOptions;
            this.f120963q = zVar;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(452267478, i11, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsOutlinedTextField.<anonymous> (TextField.kt:47)");
            }
            d dVarB = h3.l.b(h3.a.a(x.h(this.f120949c, BitmapDescriptorFactory.HUE_RED, 1, null), this.f120950d), h.g(1), this.f120951e, false, 0L, 0L, 28, null);
            u0 u0Var = u0.f75268a;
            p026y50.d dVar = p026y50.d.f125064a;
            long backgroundSurface = dVar.a(lVar, 6).getBackgroundSurface();
            long borderBrand = dVar.a(lVar, 6).getBorderBrand();
            long border = dVar.a(lVar, 6).getBorder();
            long textDisabled = dVar.a(lVar, 6).getTextDisabled();
            long textSubdued = dVar.a(lVar, 6).getTextSubdued();
            long textCritical = dVar.a(lVar, 6).getTextCritical();
            long textSubdued2 = dVar.a(lVar, 6).getTextSubdued();
            t1.a(this.f120952f, this.f120953g, dVarB, this.f120954h, this.f120955i, null, this.f120956j, this.f120957k, this.f120958l, this.f120959m, this.f120960n, this.f120961o, this.f120962p, this.f120963q, false, 1, 0, null, this.f120951e, u0Var.a(0L, 0L, backgroundSurface, dVar.a(lVar, 6).getTextDefault(), dVar.a(lVar, 6).getTextCritical(), borderBrand, border, textDisabled, textCritical, 0L, 0L, 0L, dVar.a(lVar, 6).getIconDefault(), dVar.a(lVar, 6).getIconDefault(), 0L, dVar.a(lVar, 6).getTextCritical(), textSubdued2, textSubdued, 0L, dVar.a(lVar, 6).getTextCritical(), 0L, 0L, lVar, 0, 0, u0.f75269b << 6, 3427843), lVar, 0, 196608, 213024);
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
    static final class b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f120964c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f120965d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f120966e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.l<String, h0> f120967f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f120968g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f120969h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ KeyboardOptions f120970i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ z f120971j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f120972k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ z0 f120973l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f120974m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f120975n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f120976o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f120977p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f120978q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f120979r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(String str, boolean z11, d dVar, wn0.l<? super String, h0> lVar, boolean z12, boolean z13, KeyboardOptions keyboardOptions, z zVar, p<? super l, ? super Integer, h0> pVar, z0 z0Var, p<? super l, ? super Integer, h0> pVar2, p<? super l, ? super Integer, h0> pVar3, p<? super l, ? super Integer, h0> pVar4, int i11, int i12, int i13) {
            super(2);
            this.f120964c = str;
            this.f120965d = z11;
            this.f120966e = dVar;
            this.f120967f = lVar;
            this.f120968g = z12;
            this.f120969h = z13;
            this.f120970i = keyboardOptions;
            this.f120971j = zVar;
            this.f120972k = pVar;
            this.f120973l = z0Var;
            this.f120974m = pVar2;
            this.f120975n = pVar3;
            this.f120976o = pVar4;
            this.f120977p = i11;
            this.f120978q = i12;
            this.f120979r = i13;
        }

        public final void a(l lVar, int i11) {
            m.a(this.f120964c, this.f120965d, this.f120966e, this.f120967f, this.f120968g, this.f120969h, this.f120970i, this.f120971j, this.f120972k, this.f120973l, this.f120974m, this.f120975n, this.f120976o, lVar, k2.a(this.f120977p | 1), k2.a(this.f120978q), this.f120979r);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0136  */
    /* JADX WARN: Code duplicated, block: B:103:0x0140  */
    /* JADX WARN: Code duplicated, block: B:104:0x0143  */
    /* JADX WARN: Code duplicated, block: B:108:0x014b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0152  */
    /* JADX WARN: Code duplicated, block: B:111:0x0156  */
    /* JADX WARN: Code duplicated, block: B:113:0x0160  */
    /* JADX WARN: Code duplicated, block: B:114:0x0163  */
    /* JADX WARN: Code duplicated, block: B:116:0x0168  */
    /* JADX WARN: Code duplicated, block: B:119:0x0172  */
    /* JADX WARN: Code duplicated, block: B:121:0x0179  */
    /* JADX WARN: Code duplicated, block: B:123:0x017d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0187  */
    /* JADX WARN: Code duplicated, block: B:126:0x018a  */
    /* JADX WARN: Code duplicated, block: B:128:0x018f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0198  */
    /* JADX WARN: Code duplicated, block: B:132:0x019b  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:150:0x01e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:152:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:154:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:156:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:158:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:160:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:163:0x0205  */
    /* JADX WARN: Code duplicated, block: B:164:0x0207  */
    /* JADX WARN: Code duplicated, block: B:166:0x020b  */
    /* JADX WARN: Code duplicated, block: B:167:0x0212  */
    /* JADX WARN: Code duplicated, block: B:169:0x0216  */
    /* JADX WARN: Code duplicated, block: B:170:0x0218  */
    /* JADX WARN: Code duplicated, block: B:172:0x021c  */
    /* JADX WARN: Code duplicated, block: B:173:0x021f  */
    /* JADX WARN: Code duplicated, block: B:176:0x0224  */
    /* JADX WARN: Code duplicated, block: B:179:0x022c  */
    /* JADX WARN: Code duplicated, block: B:180:0x0237  */
    /* JADX WARN: Code duplicated, block: B:182:0x023b  */
    /* JADX WARN: Code duplicated, block: B:184:0x024e  */
    /* JADX WARN: Code duplicated, block: B:187:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:191:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00db  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:86:0x0103  */
    /* JADX WARN: Code duplicated, block: B:88:0x010c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0112  */
    /* JADX WARN: Code duplicated, block: B:92:0x011c  */
    /* JADX WARN: Code duplicated, block: B:93:0x011f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0127  */
    /* JADX WARN: Code duplicated, block: B:99:0x0130  */
    public static final void a(String value, boolean z11, d dVar, wn0.l<? super String, h0> onValueChange, boolean z12, boolean z13, KeyboardOptions keyboardOptions, z zVar, p<? super l, ? super Integer, h0> pVar, z0 z0Var, p<? super l, ? super Integer, h0> pVar2, p<? super l, ? super Integer, h0> pVar3, p<? super l, ? super Integer, h0> pVar4, l lVar, int i11, int i12, int i13) {
        int i14;
        d dVar2;
        int i15;
        int i16;
        boolean z14;
        int i17;
        int i18;
        boolean z15;
        int i19;
        int i21;
        KeyboardOptions keyboardOptionsA;
        int i22;
        int i23;
        z zVarA;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        d dVar3;
        p<? super l, ? super Integer, h0> pVar5;
        z0 z0VarC;
        p<? super l, ? super Integer, h0> pVar6;
        p<? super l, ? super Integer, h0> pVar7;
        float fB;
        l lVar2;
        d dVar4;
        boolean z16;
        boolean z17;
        p<? super l, ? super Integer, h0> pVar8;
        z0 z0Var2;
        p<? super l, ? super Integer, h0> pVar9;
        z zVar2;
        KeyboardOptions keyboardOptions2;
        w2 w2VarX;
        s.k(value, "value");
        s.k(onValueChange, "onValueChange");
        l lVarV = lVar.v(-1831757546);
        if ((i13 & 1) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i14 = (lVarV.n(value) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i11 & 112) == 0) {
            i14 |= lVarV.p(z11) ? 32 : 16;
        }
        int i41 = i13 & 4;
        if (i41 == 0) {
            if ((i11 & 896) == 0) {
                dVar2 = dVar;
                i14 |= lVarV.n(dVar2) ? 256 : 128;
            }
            if ((i13 & 8) != 0) {
                i14 |= 3072;
            } else if ((i11 & 7168) == 0) {
                if (lVarV.K(onValueChange)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i14 |= i15;
            }
            i16 = i13 & 16;
            if (i16 != 0) {
                i14 |= 24576;
                z14 = z12;
            } else {
                z14 = z12;
                if ((i11 & 57344) == 0) {
                    if (lVarV.p(z14)) {
                        i17 = 16384;
                    } else {
                        i17 = PKIFailureInfo.certRevoked;
                    }
                    i14 |= i17;
                }
            }
            i18 = i13 & 32;
            if (i18 != 0) {
                i14 |= 196608;
                z15 = z13;
            } else {
                z15 = z13;
                if ((i11 & 458752) == 0) {
                    if (lVarV.p(z15)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i14 |= i19;
                }
            }
            i21 = i13 & 64;
            if (i21 != 0) {
                i14 |= 1572864;
                keyboardOptionsA = keyboardOptions;
            } else {
                keyboardOptionsA = keyboardOptions;
                if ((i11 & 3670016) == 0) {
                    if (lVarV.n(keyboardOptionsA)) {
                        i22 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i22 = PKIFailureInfo.signerNotTrusted;
                    }
                    i14 |= i22;
                }
            }
            i23 = i13 & 128;
            if (i23 != 0) {
                i14 |= 12582912;
                zVarA = zVar;
            } else {
                zVarA = zVar;
                if ((i11 & 29360128) == 0) {
                    if (lVarV.n(zVarA)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i14 |= i24;
                }
            }
            i25 = i13 & 256;
            if (i25 != 0) {
                if ((i11 & 234881024) == 0) {
                    if (lVarV.K(pVar)) {
                        i26 = 67108864;
                    } else {
                        i26 = 33554432;
                    }
                    i14 |= i26;
                }
                i27 = i13 & 512;
                if (i27 != 0) {
                    if ((i11 & 1879048192) == 0) {
                        if (lVarV.n(z0Var)) {
                            i28 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i28 = 268435456;
                        }
                        i14 |= i28;
                    }
                    i29 = i13 & 1024;
                    if (i29 != 0) {
                        i31 = i12 | 6;
                    } else if ((i12 & 14) == 0) {
                        if (lVarV.K(pVar2)) {
                            i32 = 4;
                        } else {
                            i32 = 2;
                        }
                        i31 = i12 | i32;
                    } else {
                        i31 = i12;
                    }
                    i33 = i13 & 2048;
                    if (i33 != 0) {
                        i31 |= 48;
                    } else if ((i12 & 112) != 0) {
                        if (lVarV.K(pVar3)) {
                            i34 = 32;
                        } else {
                            i34 = 16;
                        }
                        i31 |= i34;
                    }
                    i35 = i31;
                    i36 = i13 & 4096;
                    if (i36 != 0) {
                        i38 = i35 | KyberEngine.KyberPolyBytes;
                    } else {
                        i37 = i35;
                        if ((i12 & 896) != 0) {
                            if (lVarV.K(pVar4)) {
                                i39 = 256;
                            } else {
                                i39 = 128;
                            }
                            i37 |= i39;
                        }
                        i38 = i37;
                    }
                    if ((i14 & 1533916891) != 306783378 && (i38 & 731) == 146 && lVarV.b()) {
                        lVarV.j();
                        z0Var2 = z0Var;
                        pVar6 = pVar2;
                        zVar2 = zVarA;
                        lVar2 = lVarV;
                        dVar4 = dVar2;
                        z16 = z14;
                        z17 = z15;
                        pVar5 = pVar;
                        pVar8 = pVar3;
                        pVar9 = pVar4;
                    } else {
                        if (i41 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i16 != 0) {
                            z14 = false;
                        }
                        if (i18 != 0) {
                            z15 = false;
                        }
                        if (i21 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        }
                        if (i23 != 0) {
                            zVarA = z.INSTANCE.a();
                        }
                        z zVar3 = zVarA;
                        if (i25 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i27 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i29 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i33 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        p<? super l, ? super Integer, h0> pVar10 = i36 == 0 ? pVar4 : null;
                        if (o.J()) {
                            o.S(-1831757546, i14, i38, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsOutlinedTextField (TextField.kt:40)");
                        }
                        if (z11) {
                            lVarV.H(-556370954);
                            fB = p009i2.x.f75438a.c(lVarV, p009i2.x.f75439b);
                        } else {
                            lVarV.H(-556370214);
                            fB = p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b);
                        }
                        lVarV.T();
                        float f11 = fB;
                        RoundedCornerShape roundedCornerShapeC = g.c(h.g(12));
                        h2[] h2VarArr = {m0.b().d(i.l(lVarV, 0))};
                        p<? super l, ? super Integer, h0> pVar11 = pVar10;
                        boolean z18 = z14;
                        boolean z19 = z15;
                        d dVar5 = dVar3;
                        z0 z0Var3 = z0VarC;
                        p<? super l, ? super Integer, h0> pVar12 = pVar7;
                        lVar2 = lVarV;
                        w.b(h2VarArr, c.b(lVar2, 452267478, true, new a(dVar5, f11, roundedCornerShapeC, value, onValueChange, z11, z18, pVar11, pVar5, pVar12, pVar6, z19, z0Var3, keyboardOptionsA, zVar3)), lVar2, 56);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar5;
                        z16 = z18;
                        z17 = z19;
                        pVar8 = pVar12;
                        z0Var2 = z0Var3;
                        pVar9 = pVar11;
                        zVar2 = zVar3;
                    }
                    keyboardOptions2 = keyboardOptionsA;
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(value, z11, dVar4, onValueChange, z16, z17, keyboardOptions2, zVar2, pVar5, z0Var2, pVar6, pVar8, pVar9, i11, i12, i13));
                    }
                }
                i14 |= 805306368;
                i29 = i13 & 1024;
                if (i29 != 0) {
                    i31 = i12 | 6;
                } else if ((i12 & 14) == 0) {
                    if (lVarV.K(pVar2)) {
                        i32 = 4;
                    } else {
                        i32 = 2;
                    }
                    i31 = i12 | i32;
                } else {
                    i31 = i12;
                }
                i33 = i13 & 2048;
                if (i33 != 0) {
                    i31 |= 48;
                } else if ((i12 & 112) != 0) {
                    if (lVarV.K(pVar3)) {
                        i34 = 32;
                    } else {
                        i34 = 16;
                    }
                    i31 |= i34;
                }
                i35 = i31;
                i36 = i13 & 4096;
                if (i36 != 0) {
                    i38 = i35 | KyberEngine.KyberPolyBytes;
                } else {
                    i37 = i35;
                    if ((i12 & 896) != 0) {
                        if (lVarV.K(pVar4)) {
                            i39 = 256;
                        } else {
                            i39 = 128;
                        }
                        i37 |= i39;
                    }
                    i38 = i37;
                }
                if ((i14 & 1533916891) != 306783378) {
                    if (i41 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i16 != 0) {
                        z14 = false;
                    }
                    if (i18 != 0) {
                        z15 = false;
                    }
                    if (i21 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i23 != 0) {
                        zVarA = z.INSTANCE.a();
                    }
                    z zVar4 = zVarA;
                    if (i25 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i27 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i29 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i33 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i36 == 0) {
                    }
                    if (o.J()) {
                        o.S(-1831757546, i14, i38, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsOutlinedTextField (TextField.kt:40)");
                    }
                    if (z11) {
                        lVarV.H(-556370954);
                        fB = p009i2.x.f75438a.c(lVarV, p009i2.x.f75439b);
                    } else {
                        lVarV.H(-556370214);
                        fB = p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b);
                    }
                    lVarV.T();
                    float f12 = fB;
                    RoundedCornerShape roundedCornerShapeC2 = g.c(h.g(12));
                    h2[] h2VarArr2 = {m0.b().d(i.l(lVarV, 0))};
                    p<? super l, ? super Integer, h0> pVar13 = pVar10;
                    boolean z110 = z14;
                    boolean z111 = z15;
                    d dVar6 = dVar3;
                    z0 z0Var4 = z0VarC;
                    p<? super l, ? super Integer, h0> pVar14 = pVar7;
                    lVar2 = lVarV;
                    w.b(h2VarArr2, c.b(lVar2, 452267478, true, new a(dVar6, f12, roundedCornerShapeC2, value, onValueChange, z11, z110, pVar13, pVar5, pVar14, pVar6, z111, z0Var4, keyboardOptionsA, zVar4)), lVar2, 56);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar6;
                    z16 = z110;
                    z17 = z111;
                    pVar8 = pVar14;
                    z0Var2 = z0Var4;
                    pVar9 = pVar13;
                    zVar2 = zVar4;
                } else {
                    if (i41 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i16 != 0) {
                        z14 = false;
                    }
                    if (i18 != 0) {
                        z15 = false;
                    }
                    if (i21 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i23 != 0) {
                        zVarA = z.INSTANCE.a();
                    }
                    z zVar5 = zVarA;
                    if (i25 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i27 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i29 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i33 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i36 == 0) {
                    }
                    if (o.J()) {
                        o.S(-1831757546, i14, i38, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsOutlinedTextField (TextField.kt:40)");
                    }
                    if (z11) {
                        lVarV.H(-556370954);
                        fB = p009i2.x.f75438a.c(lVarV, p009i2.x.f75439b);
                    } else {
                        lVarV.H(-556370214);
                        fB = p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b);
                    }
                    lVarV.T();
                    float f13 = fB;
                    RoundedCornerShape roundedCornerShapeC3 = g.c(h.g(12));
                    h2[] h2VarArr3 = {m0.b().d(i.l(lVarV, 0))};
                    p<? super l, ? super Integer, h0> pVar15 = pVar10;
                    boolean z112 = z14;
                    boolean z113 = z15;
                    d dVar7 = dVar3;
                    z0 z0Var5 = z0VarC;
                    p<? super l, ? super Integer, h0> pVar16 = pVar7;
                    lVar2 = lVarV;
                    w.b(h2VarArr3, c.b(lVar2, 452267478, true, new a(dVar7, f13, roundedCornerShapeC3, value, onValueChange, z11, z112, pVar15, pVar5, pVar16, pVar6, z113, z0Var5, keyboardOptionsA, zVar5)), lVar2, 56);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar7;
                    z16 = z112;
                    z17 = z113;
                    pVar8 = pVar16;
                    z0Var2 = z0Var5;
                    pVar9 = pVar15;
                    zVar2 = zVar5;
                }
                keyboardOptions2 = keyboardOptionsA;
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(value, z11, dVar4, onValueChange, z16, z17, keyboardOptions2, zVar2, pVar5, z0Var2, pVar6, pVar8, pVar9, i11, i12, i13));
                }
            }
            i14 |= 100663296;
            i27 = i13 & 512;
            if (i27 != 0) {
                if ((i11 & 1879048192) == 0) {
                    if (lVarV.n(z0Var)) {
                        i28 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i28 = 268435456;
                    }
                    i14 |= i28;
                }
                i29 = i13 & 1024;
                if (i29 != 0) {
                    i31 = i12 | 6;
                } else if ((i12 & 14) == 0) {
                    if (lVarV.K(pVar2)) {
                        i32 = 4;
                    } else {
                        i32 = 2;
                    }
                    i31 = i12 | i32;
                } else {
                    i31 = i12;
                }
                i33 = i13 & 2048;
                if (i33 != 0) {
                    i31 |= 48;
                } else if ((i12 & 112) != 0) {
                    if (lVarV.K(pVar3)) {
                        i34 = 32;
                    } else {
                        i34 = 16;
                    }
                    i31 |= i34;
                }
                i35 = i31;
                i36 = i13 & 4096;
                if (i36 != 0) {
                    i38 = i35 | KyberEngine.KyberPolyBytes;
                } else {
                    i37 = i35;
                    if ((i12 & 896) != 0) {
                        if (lVarV.K(pVar4)) {
                            i39 = 256;
                        } else {
                            i39 = 128;
                        }
                        i37 |= i39;
                    }
                    i38 = i37;
                }
                if ((i14 & 1533916891) != 306783378) {
                    if (i41 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i16 != 0) {
                        z14 = false;
                    }
                    if (i18 != 0) {
                        z15 = false;
                    }
                    if (i21 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i23 != 0) {
                        zVarA = z.INSTANCE.a();
                    }
                    z zVar6 = zVarA;
                    if (i25 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i27 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i29 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i33 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i36 == 0) {
                    }
                    if (o.J()) {
                        o.S(-1831757546, i14, i38, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsOutlinedTextField (TextField.kt:40)");
                    }
                    if (z11) {
                        lVarV.H(-556370954);
                        fB = p009i2.x.f75438a.c(lVarV, p009i2.x.f75439b);
                    } else {
                        lVarV.H(-556370214);
                        fB = p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b);
                    }
                    lVarV.T();
                    float f14 = fB;
                    RoundedCornerShape roundedCornerShapeC4 = g.c(h.g(12));
                    h2[] h2VarArr4 = {m0.b().d(i.l(lVarV, 0))};
                    p<? super l, ? super Integer, h0> pVar17 = pVar10;
                    boolean z114 = z14;
                    boolean z115 = z15;
                    d dVar8 = dVar3;
                    z0 z0Var6 = z0VarC;
                    p<? super l, ? super Integer, h0> pVar18 = pVar7;
                    lVar2 = lVarV;
                    w.b(h2VarArr4, c.b(lVar2, 452267478, true, new a(dVar8, f14, roundedCornerShapeC4, value, onValueChange, z11, z114, pVar17, pVar5, pVar18, pVar6, z115, z0Var6, keyboardOptionsA, zVar6)), lVar2, 56);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar8;
                    z16 = z114;
                    z17 = z115;
                    pVar8 = pVar18;
                    z0Var2 = z0Var6;
                    pVar9 = pVar17;
                    zVar2 = zVar6;
                } else {
                    if (i41 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i16 != 0) {
                        z14 = false;
                    }
                    if (i18 != 0) {
                        z15 = false;
                    }
                    if (i21 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i23 != 0) {
                        zVarA = z.INSTANCE.a();
                    }
                    z zVar7 = zVarA;
                    if (i25 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i27 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i29 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i33 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i36 == 0) {
                    }
                    if (o.J()) {
                        o.S(-1831757546, i14, i38, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsOutlinedTextField (TextField.kt:40)");
                    }
                    if (z11) {
                        lVarV.H(-556370954);
                        fB = p009i2.x.f75438a.c(lVarV, p009i2.x.f75439b);
                    } else {
                        lVarV.H(-556370214);
                        fB = p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b);
                    }
                    lVarV.T();
                    float f15 = fB;
                    RoundedCornerShape roundedCornerShapeC5 = g.c(h.g(12));
                    h2[] h2VarArr5 = {m0.b().d(i.l(lVarV, 0))};
                    p<? super l, ? super Integer, h0> pVar19 = pVar10;
                    boolean z116 = z14;
                    boolean z117 = z15;
                    d dVar9 = dVar3;
                    z0 z0Var7 = z0VarC;
                    p<? super l, ? super Integer, h0> pVar110 = pVar7;
                    lVar2 = lVarV;
                    w.b(h2VarArr5, c.b(lVar2, 452267478, true, new a(dVar9, f15, roundedCornerShapeC5, value, onValueChange, z11, z116, pVar19, pVar5, pVar110, pVar6, z117, z0Var7, keyboardOptionsA, zVar7)), lVar2, 56);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar9;
                    z16 = z116;
                    z17 = z117;
                    pVar8 = pVar110;
                    z0Var2 = z0Var7;
                    pVar9 = pVar19;
                    zVar2 = zVar7;
                }
                keyboardOptions2 = keyboardOptionsA;
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(value, z11, dVar4, onValueChange, z16, z17, keyboardOptions2, zVar2, pVar5, z0Var2, pVar6, pVar8, pVar9, i11, i12, i13));
                }
            }
            i14 |= 805306368;
            i29 = i13 & 1024;
            if (i29 != 0) {
                i31 = i12 | 6;
            } else if ((i12 & 14) == 0) {
                if (lVarV.K(pVar2)) {
                    i32 = 4;
                } else {
                    i32 = 2;
                }
                i31 = i12 | i32;
            } else {
                i31 = i12;
            }
            i33 = i13 & 2048;
            if (i33 != 0) {
                i31 |= 48;
            } else if ((i12 & 112) != 0) {
                if (lVarV.K(pVar3)) {
                    i34 = 32;
                } else {
                    i34 = 16;
                }
                i31 |= i34;
            }
            i35 = i31;
            i36 = i13 & 4096;
            if (i36 != 0) {
                i38 = i35 | KyberEngine.KyberPolyBytes;
            } else {
                i37 = i35;
                if ((i12 & 896) != 0) {
                    if (lVarV.K(pVar4)) {
                        i39 = 256;
                    } else {
                        i39 = 128;
                    }
                    i37 |= i39;
                }
                i38 = i37;
            }
            if ((i14 & 1533916891) != 306783378) {
                if (i41 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i16 != 0) {
                    z14 = false;
                }
                if (i18 != 0) {
                    z15 = false;
                }
                if (i21 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                }
                if (i23 != 0) {
                    zVarA = z.INSTANCE.a();
                }
                z zVar8 = zVarA;
                if (i25 != 0) {
                    pVar5 = null;
                } else {
                    pVar5 = pVar;
                }
                if (i27 != 0) {
                    z0VarC = z0.INSTANCE.c();
                } else {
                    z0VarC = z0Var;
                }
                if (i29 != 0) {
                    pVar6 = null;
                } else {
                    pVar6 = pVar2;
                }
                if (i33 != 0) {
                    pVar7 = null;
                } else {
                    pVar7 = pVar3;
                }
                if (i36 == 0) {
                }
                if (o.J()) {
                    o.S(-1831757546, i14, i38, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsOutlinedTextField (TextField.kt:40)");
                }
                if (z11) {
                    lVarV.H(-556370954);
                    fB = p009i2.x.f75438a.c(lVarV, p009i2.x.f75439b);
                } else {
                    lVarV.H(-556370214);
                    fB = p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b);
                }
                lVarV.T();
                float f16 = fB;
                RoundedCornerShape roundedCornerShapeC6 = g.c(h.g(12));
                h2[] h2VarArr6 = {m0.b().d(i.l(lVarV, 0))};
                p<? super l, ? super Integer, h0> pVar111 = pVar10;
                boolean z118 = z14;
                boolean z119 = z15;
                d dVar10 = dVar3;
                z0 z0Var8 = z0VarC;
                p<? super l, ? super Integer, h0> pVar112 = pVar7;
                lVar2 = lVarV;
                w.b(h2VarArr6, c.b(lVar2, 452267478, true, new a(dVar10, f16, roundedCornerShapeC6, value, onValueChange, z11, z118, pVar111, pVar5, pVar112, pVar6, z119, z0Var8, keyboardOptionsA, zVar8)), lVar2, 56);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar10;
                z16 = z118;
                z17 = z119;
                pVar8 = pVar112;
                z0Var2 = z0Var8;
                pVar9 = pVar111;
                zVar2 = zVar8;
            } else {
                if (i41 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i16 != 0) {
                    z14 = false;
                }
                if (i18 != 0) {
                    z15 = false;
                }
                if (i21 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                }
                if (i23 != 0) {
                    zVarA = z.INSTANCE.a();
                }
                z zVar9 = zVarA;
                if (i25 != 0) {
                    pVar5 = null;
                } else {
                    pVar5 = pVar;
                }
                if (i27 != 0) {
                    z0VarC = z0.INSTANCE.c();
                } else {
                    z0VarC = z0Var;
                }
                if (i29 != 0) {
                    pVar6 = null;
                } else {
                    pVar6 = pVar2;
                }
                if (i33 != 0) {
                    pVar7 = null;
                } else {
                    pVar7 = pVar3;
                }
                if (i36 == 0) {
                }
                if (o.J()) {
                    o.S(-1831757546, i14, i38, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsOutlinedTextField (TextField.kt:40)");
                }
                if (z11) {
                    lVarV.H(-556370954);
                    fB = p009i2.x.f75438a.c(lVarV, p009i2.x.f75439b);
                } else {
                    lVarV.H(-556370214);
                    fB = p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b);
                }
                lVarV.T();
                float f17 = fB;
                RoundedCornerShape roundedCornerShapeC7 = g.c(h.g(12));
                h2[] h2VarArr7 = {m0.b().d(i.l(lVarV, 0))};
                p<? super l, ? super Integer, h0> pVar113 = pVar10;
                boolean z1110 = z14;
                boolean z1111 = z15;
                d dVar11 = dVar3;
                z0 z0Var9 = z0VarC;
                p<? super l, ? super Integer, h0> pVar114 = pVar7;
                lVar2 = lVarV;
                w.b(h2VarArr7, c.b(lVar2, 452267478, true, new a(dVar11, f17, roundedCornerShapeC7, value, onValueChange, z11, z1110, pVar113, pVar5, pVar114, pVar6, z1111, z0Var9, keyboardOptionsA, zVar9)), lVar2, 56);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar11;
                z16 = z1110;
                z17 = z1111;
                pVar8 = pVar114;
                z0Var2 = z0Var9;
                pVar9 = pVar113;
                zVar2 = zVar9;
            }
            keyboardOptions2 = keyboardOptionsA;
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new b(value, z11, dVar4, onValueChange, z16, z17, keyboardOptions2, zVar2, pVar5, z0Var2, pVar6, pVar8, pVar9, i11, i12, i13));
            }
        }
        i14 |= KyberEngine.KyberPolyBytes;
        dVar2 = dVar;
        if ((i13 & 8) != 0) {
            i14 |= 3072;
        } else if ((i11 & 7168) == 0) {
            if (lVarV.K(onValueChange)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i14 |= i15;
        }
        i16 = i13 & 16;
        if (i16 != 0) {
            i14 |= 24576;
            z14 = z12;
        } else {
            z14 = z12;
            if ((i11 & 57344) == 0) {
                if (lVarV.p(z14)) {
                    i17 = 16384;
                } else {
                    i17 = PKIFailureInfo.certRevoked;
                }
                i14 |= i17;
            }
        }
        i18 = i13 & 32;
        if (i18 != 0) {
            i14 |= 196608;
            z15 = z13;
        } else {
            z15 = z13;
            if ((i11 & 458752) == 0) {
                if (lVarV.p(z15)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i14 |= i19;
            }
        }
        i21 = i13 & 64;
        if (i21 != 0) {
            i14 |= 1572864;
            keyboardOptionsA = keyboardOptions;
        } else {
            keyboardOptionsA = keyboardOptions;
            if ((i11 & 3670016) == 0) {
                if (lVarV.n(keyboardOptionsA)) {
                    i22 = PKIFailureInfo.badCertTemplate;
                } else {
                    i22 = PKIFailureInfo.signerNotTrusted;
                }
                i14 |= i22;
            }
        }
        i23 = i13 & 128;
        if (i23 != 0) {
            i14 |= 12582912;
            zVarA = zVar;
        } else {
            zVarA = zVar;
            if ((i11 & 29360128) == 0) {
                if (lVarV.n(zVarA)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i14 |= i24;
            }
        }
        i25 = i13 & 256;
        if (i25 != 0) {
            if ((i11 & 234881024) == 0) {
                if (lVarV.K(pVar)) {
                    i26 = 67108864;
                } else {
                    i26 = 33554432;
                }
                i14 |= i26;
            }
            i27 = i13 & 512;
            if (i27 != 0) {
                if ((i11 & 1879048192) == 0) {
                    if (lVarV.n(z0Var)) {
                        i28 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i28 = 268435456;
                    }
                    i14 |= i28;
                }
                i29 = i13 & 1024;
                if (i29 != 0) {
                    i31 = i12 | 6;
                } else if ((i12 & 14) == 0) {
                    if (lVarV.K(pVar2)) {
                        i32 = 4;
                    } else {
                        i32 = 2;
                    }
                    i31 = i12 | i32;
                } else {
                    i31 = i12;
                }
                i33 = i13 & 2048;
                if (i33 != 0) {
                    i31 |= 48;
                } else if ((i12 & 112) != 0) {
                    if (lVarV.K(pVar3)) {
                        i34 = 32;
                    } else {
                        i34 = 16;
                    }
                    i31 |= i34;
                }
                i35 = i31;
                i36 = i13 & 4096;
                if (i36 != 0) {
                    i38 = i35 | KyberEngine.KyberPolyBytes;
                } else {
                    i37 = i35;
                    if ((i12 & 896) != 0) {
                        if (lVarV.K(pVar4)) {
                            i39 = 256;
                        } else {
                            i39 = 128;
                        }
                        i37 |= i39;
                    }
                    i38 = i37;
                }
                if ((i14 & 1533916891) != 306783378) {
                    if (i41 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i16 != 0) {
                        z14 = false;
                    }
                    if (i18 != 0) {
                        z15 = false;
                    }
                    if (i21 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i23 != 0) {
                        zVarA = z.INSTANCE.a();
                    }
                    z zVar10 = zVarA;
                    if (i25 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i27 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i29 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i33 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i36 == 0) {
                    }
                    if (o.J()) {
                        o.S(-1831757546, i14, i38, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsOutlinedTextField (TextField.kt:40)");
                    }
                    if (z11) {
                        lVarV.H(-556370954);
                        fB = p009i2.x.f75438a.c(lVarV, p009i2.x.f75439b);
                    } else {
                        lVarV.H(-556370214);
                        fB = p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b);
                    }
                    lVarV.T();
                    float f18 = fB;
                    RoundedCornerShape roundedCornerShapeC8 = g.c(h.g(12));
                    h2[] h2VarArr8 = {m0.b().d(i.l(lVarV, 0))};
                    p<? super l, ? super Integer, h0> pVar115 = pVar10;
                    boolean z1112 = z14;
                    boolean z1113 = z15;
                    d dVar12 = dVar3;
                    z0 z0Var10 = z0VarC;
                    p<? super l, ? super Integer, h0> pVar116 = pVar7;
                    lVar2 = lVarV;
                    w.b(h2VarArr8, c.b(lVar2, 452267478, true, new a(dVar12, f18, roundedCornerShapeC8, value, onValueChange, z11, z1112, pVar115, pVar5, pVar116, pVar6, z1113, z0Var10, keyboardOptionsA, zVar10)), lVar2, 56);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar12;
                    z16 = z1112;
                    z17 = z1113;
                    pVar8 = pVar116;
                    z0Var2 = z0Var10;
                    pVar9 = pVar115;
                    zVar2 = zVar10;
                } else {
                    if (i41 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i16 != 0) {
                        z14 = false;
                    }
                    if (i18 != 0) {
                        z15 = false;
                    }
                    if (i21 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    }
                    if (i23 != 0) {
                        zVarA = z.INSTANCE.a();
                    }
                    z zVar11 = zVarA;
                    if (i25 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i27 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i29 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i33 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i36 == 0) {
                    }
                    if (o.J()) {
                        o.S(-1831757546, i14, i38, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsOutlinedTextField (TextField.kt:40)");
                    }
                    if (z11) {
                        lVarV.H(-556370954);
                        fB = p009i2.x.f75438a.c(lVarV, p009i2.x.f75439b);
                    } else {
                        lVarV.H(-556370214);
                        fB = p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b);
                    }
                    lVarV.T();
                    float f19 = fB;
                    RoundedCornerShape roundedCornerShapeC9 = g.c(h.g(12));
                    h2[] h2VarArr9 = {m0.b().d(i.l(lVarV, 0))};
                    p<? super l, ? super Integer, h0> pVar117 = pVar10;
                    boolean z1114 = z14;
                    boolean z1115 = z15;
                    d dVar13 = dVar3;
                    z0 z0Var11 = z0VarC;
                    p<? super l, ? super Integer, h0> pVar118 = pVar7;
                    lVar2 = lVarV;
                    w.b(h2VarArr9, c.b(lVar2, 452267478, true, new a(dVar13, f19, roundedCornerShapeC9, value, onValueChange, z11, z1114, pVar117, pVar5, pVar118, pVar6, z1115, z0Var11, keyboardOptionsA, zVar11)), lVar2, 56);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar13;
                    z16 = z1114;
                    z17 = z1115;
                    pVar8 = pVar118;
                    z0Var2 = z0Var11;
                    pVar9 = pVar117;
                    zVar2 = zVar11;
                }
                keyboardOptions2 = keyboardOptionsA;
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(value, z11, dVar4, onValueChange, z16, z17, keyboardOptions2, zVar2, pVar5, z0Var2, pVar6, pVar8, pVar9, i11, i12, i13));
                }
            }
            i14 |= 805306368;
            i29 = i13 & 1024;
            if (i29 != 0) {
                i31 = i12 | 6;
            } else if ((i12 & 14) == 0) {
                if (lVarV.K(pVar2)) {
                    i32 = 4;
                } else {
                    i32 = 2;
                }
                i31 = i12 | i32;
            } else {
                i31 = i12;
            }
            i33 = i13 & 2048;
            if (i33 != 0) {
                i31 |= 48;
            } else if ((i12 & 112) != 0) {
                if (lVarV.K(pVar3)) {
                    i34 = 32;
                } else {
                    i34 = 16;
                }
                i31 |= i34;
            }
            i35 = i31;
            i36 = i13 & 4096;
            if (i36 != 0) {
                i38 = i35 | KyberEngine.KyberPolyBytes;
            } else {
                i37 = i35;
                if ((i12 & 896) != 0) {
                    if (lVarV.K(pVar4)) {
                        i39 = 256;
                    } else {
                        i39 = 128;
                    }
                    i37 |= i39;
                }
                i38 = i37;
            }
            if ((i14 & 1533916891) != 306783378) {
                if (i41 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i16 != 0) {
                    z14 = false;
                }
                if (i18 != 0) {
                    z15 = false;
                }
                if (i21 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                }
                if (i23 != 0) {
                    zVarA = z.INSTANCE.a();
                }
                z zVar12 = zVarA;
                if (i25 != 0) {
                    pVar5 = null;
                } else {
                    pVar5 = pVar;
                }
                if (i27 != 0) {
                    z0VarC = z0.INSTANCE.c();
                } else {
                    z0VarC = z0Var;
                }
                if (i29 != 0) {
                    pVar6 = null;
                } else {
                    pVar6 = pVar2;
                }
                if (i33 != 0) {
                    pVar7 = null;
                } else {
                    pVar7 = pVar3;
                }
                if (i36 == 0) {
                }
                if (o.J()) {
                    o.S(-1831757546, i14, i38, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsOutlinedTextField (TextField.kt:40)");
                }
                if (z11) {
                    lVarV.H(-556370954);
                    fB = p009i2.x.f75438a.c(lVarV, p009i2.x.f75439b);
                } else {
                    lVarV.H(-556370214);
                    fB = p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b);
                }
                lVarV.T();
                float f110 = fB;
                RoundedCornerShape roundedCornerShapeC10 = g.c(h.g(12));
                h2[] h2VarArr10 = {m0.b().d(i.l(lVarV, 0))};
                p<? super l, ? super Integer, h0> pVar119 = pVar10;
                boolean z1116 = z14;
                boolean z1117 = z15;
                d dVar14 = dVar3;
                z0 z0Var12 = z0VarC;
                p<? super l, ? super Integer, h0> pVar1110 = pVar7;
                lVar2 = lVarV;
                w.b(h2VarArr10, c.b(lVar2, 452267478, true, new a(dVar14, f110, roundedCornerShapeC10, value, onValueChange, z11, z1116, pVar119, pVar5, pVar1110, pVar6, z1117, z0Var12, keyboardOptionsA, zVar12)), lVar2, 56);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar14;
                z16 = z1116;
                z17 = z1117;
                pVar8 = pVar1110;
                z0Var2 = z0Var12;
                pVar9 = pVar119;
                zVar2 = zVar12;
            } else {
                if (i41 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i16 != 0) {
                    z14 = false;
                }
                if (i18 != 0) {
                    z15 = false;
                }
                if (i21 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                }
                if (i23 != 0) {
                    zVarA = z.INSTANCE.a();
                }
                z zVar13 = zVarA;
                if (i25 != 0) {
                    pVar5 = null;
                } else {
                    pVar5 = pVar;
                }
                if (i27 != 0) {
                    z0VarC = z0.INSTANCE.c();
                } else {
                    z0VarC = z0Var;
                }
                if (i29 != 0) {
                    pVar6 = null;
                } else {
                    pVar6 = pVar2;
                }
                if (i33 != 0) {
                    pVar7 = null;
                } else {
                    pVar7 = pVar3;
                }
                if (i36 == 0) {
                }
                if (o.J()) {
                    o.S(-1831757546, i14, i38, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsOutlinedTextField (TextField.kt:40)");
                }
                if (z11) {
                    lVarV.H(-556370954);
                    fB = p009i2.x.f75438a.c(lVarV, p009i2.x.f75439b);
                } else {
                    lVarV.H(-556370214);
                    fB = p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b);
                }
                lVarV.T();
                float f111 = fB;
                RoundedCornerShape roundedCornerShapeC11 = g.c(h.g(12));
                h2[] h2VarArr11 = {m0.b().d(i.l(lVarV, 0))};
                p<? super l, ? super Integer, h0> pVar1111 = pVar10;
                boolean z1118 = z14;
                boolean z1119 = z15;
                d dVar15 = dVar3;
                z0 z0Var13 = z0VarC;
                p<? super l, ? super Integer, h0> pVar1112 = pVar7;
                lVar2 = lVarV;
                w.b(h2VarArr11, c.b(lVar2, 452267478, true, new a(dVar15, f111, roundedCornerShapeC11, value, onValueChange, z11, z1118, pVar1111, pVar5, pVar1112, pVar6, z1119, z0Var13, keyboardOptionsA, zVar13)), lVar2, 56);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar15;
                z16 = z1118;
                z17 = z1119;
                pVar8 = pVar1112;
                z0Var2 = z0Var13;
                pVar9 = pVar1111;
                zVar2 = zVar13;
            }
            keyboardOptions2 = keyboardOptionsA;
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new b(value, z11, dVar4, onValueChange, z16, z17, keyboardOptions2, zVar2, pVar5, z0Var2, pVar6, pVar8, pVar9, i11, i12, i13));
            }
        }
        i14 |= 100663296;
        i27 = i13 & 512;
        if (i27 != 0) {
            if ((i11 & 1879048192) == 0) {
                if (lVarV.n(z0Var)) {
                    i28 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i28 = 268435456;
                }
                i14 |= i28;
            }
            i29 = i13 & 1024;
            if (i29 != 0) {
                i31 = i12 | 6;
            } else if ((i12 & 14) == 0) {
                if (lVarV.K(pVar2)) {
                    i32 = 4;
                } else {
                    i32 = 2;
                }
                i31 = i12 | i32;
            } else {
                i31 = i12;
            }
            i33 = i13 & 2048;
            if (i33 != 0) {
                i31 |= 48;
            } else if ((i12 & 112) != 0) {
                if (lVarV.K(pVar3)) {
                    i34 = 32;
                } else {
                    i34 = 16;
                }
                i31 |= i34;
            }
            i35 = i31;
            i36 = i13 & 4096;
            if (i36 != 0) {
                i38 = i35 | KyberEngine.KyberPolyBytes;
            } else {
                i37 = i35;
                if ((i12 & 896) != 0) {
                    if (lVarV.K(pVar4)) {
                        i39 = 256;
                    } else {
                        i39 = 128;
                    }
                    i37 |= i39;
                }
                i38 = i37;
            }
            if ((i14 & 1533916891) != 306783378) {
                if (i41 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i16 != 0) {
                    z14 = false;
                }
                if (i18 != 0) {
                    z15 = false;
                }
                if (i21 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                }
                if (i23 != 0) {
                    zVarA = z.INSTANCE.a();
                }
                z zVar14 = zVarA;
                if (i25 != 0) {
                    pVar5 = null;
                } else {
                    pVar5 = pVar;
                }
                if (i27 != 0) {
                    z0VarC = z0.INSTANCE.c();
                } else {
                    z0VarC = z0Var;
                }
                if (i29 != 0) {
                    pVar6 = null;
                } else {
                    pVar6 = pVar2;
                }
                if (i33 != 0) {
                    pVar7 = null;
                } else {
                    pVar7 = pVar3;
                }
                if (i36 == 0) {
                }
                if (o.J()) {
                    o.S(-1831757546, i14, i38, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsOutlinedTextField (TextField.kt:40)");
                }
                if (z11) {
                    lVarV.H(-556370954);
                    fB = p009i2.x.f75438a.c(lVarV, p009i2.x.f75439b);
                } else {
                    lVarV.H(-556370214);
                    fB = p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b);
                }
                lVarV.T();
                float f112 = fB;
                RoundedCornerShape roundedCornerShapeC12 = g.c(h.g(12));
                h2[] h2VarArr12 = {m0.b().d(i.l(lVarV, 0))};
                p<? super l, ? super Integer, h0> pVar1113 = pVar10;
                boolean z11110 = z14;
                boolean z11111 = z15;
                d dVar16 = dVar3;
                z0 z0Var14 = z0VarC;
                p<? super l, ? super Integer, h0> pVar1114 = pVar7;
                lVar2 = lVarV;
                w.b(h2VarArr12, c.b(lVar2, 452267478, true, new a(dVar16, f112, roundedCornerShapeC12, value, onValueChange, z11, z11110, pVar1113, pVar5, pVar1114, pVar6, z11111, z0Var14, keyboardOptionsA, zVar14)), lVar2, 56);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar16;
                z16 = z11110;
                z17 = z11111;
                pVar8 = pVar1114;
                z0Var2 = z0Var14;
                pVar9 = pVar1113;
                zVar2 = zVar14;
            } else {
                if (i41 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i16 != 0) {
                    z14 = false;
                }
                if (i18 != 0) {
                    z15 = false;
                }
                if (i21 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                }
                if (i23 != 0) {
                    zVarA = z.INSTANCE.a();
                }
                z zVar15 = zVarA;
                if (i25 != 0) {
                    pVar5 = null;
                } else {
                    pVar5 = pVar;
                }
                if (i27 != 0) {
                    z0VarC = z0.INSTANCE.c();
                } else {
                    z0VarC = z0Var;
                }
                if (i29 != 0) {
                    pVar6 = null;
                } else {
                    pVar6 = pVar2;
                }
                if (i33 != 0) {
                    pVar7 = null;
                } else {
                    pVar7 = pVar3;
                }
                if (i36 == 0) {
                }
                if (o.J()) {
                    o.S(-1831757546, i14, i38, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsOutlinedTextField (TextField.kt:40)");
                }
                if (z11) {
                    lVarV.H(-556370954);
                    fB = p009i2.x.f75438a.c(lVarV, p009i2.x.f75439b);
                } else {
                    lVarV.H(-556370214);
                    fB = p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b);
                }
                lVarV.T();
                float f113 = fB;
                RoundedCornerShape roundedCornerShapeC13 = g.c(h.g(12));
                h2[] h2VarArr13 = {m0.b().d(i.l(lVarV, 0))};
                p<? super l, ? super Integer, h0> pVar1115 = pVar10;
                boolean z11112 = z14;
                boolean z11113 = z15;
                d dVar17 = dVar3;
                z0 z0Var15 = z0VarC;
                p<? super l, ? super Integer, h0> pVar1116 = pVar7;
                lVar2 = lVarV;
                w.b(h2VarArr13, c.b(lVar2, 452267478, true, new a(dVar17, f113, roundedCornerShapeC13, value, onValueChange, z11, z11112, pVar1115, pVar5, pVar1116, pVar6, z11113, z0Var15, keyboardOptionsA, zVar15)), lVar2, 56);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar17;
                z16 = z11112;
                z17 = z11113;
                pVar8 = pVar1116;
                z0Var2 = z0Var15;
                pVar9 = pVar1115;
                zVar2 = zVar15;
            }
            keyboardOptions2 = keyboardOptionsA;
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new b(value, z11, dVar4, onValueChange, z16, z17, keyboardOptions2, zVar2, pVar5, z0Var2, pVar6, pVar8, pVar9, i11, i12, i13));
            }
        }
        i14 |= 805306368;
        i29 = i13 & 1024;
        if (i29 != 0) {
            i31 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            if (lVarV.K(pVar2)) {
                i32 = 4;
            } else {
                i32 = 2;
            }
            i31 = i12 | i32;
        } else {
            i31 = i12;
        }
        i33 = i13 & 2048;
        if (i33 != 0) {
            i31 |= 48;
        } else if ((i12 & 112) != 0) {
            if (lVarV.K(pVar3)) {
                i34 = 32;
            } else {
                i34 = 16;
            }
            i31 |= i34;
        }
        i35 = i31;
        i36 = i13 & 4096;
        if (i36 != 0) {
            i38 = i35 | KyberEngine.KyberPolyBytes;
        } else {
            i37 = i35;
            if ((i12 & 896) != 0) {
                if (lVarV.K(pVar4)) {
                    i39 = 256;
                } else {
                    i39 = 128;
                }
                i37 |= i39;
            }
            i38 = i37;
        }
        if ((i14 & 1533916891) != 306783378) {
            if (i41 != 0) {
                dVar3 = d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i16 != 0) {
                z14 = false;
            }
            if (i18 != 0) {
                z15 = false;
            }
            if (i21 != 0) {
                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
            }
            if (i23 != 0) {
                zVarA = z.INSTANCE.a();
            }
            z zVar16 = zVarA;
            if (i25 != 0) {
                pVar5 = null;
            } else {
                pVar5 = pVar;
            }
            if (i27 != 0) {
                z0VarC = z0.INSTANCE.c();
            } else {
                z0VarC = z0Var;
            }
            if (i29 != 0) {
                pVar6 = null;
            } else {
                pVar6 = pVar2;
            }
            if (i33 != 0) {
                pVar7 = null;
            } else {
                pVar7 = pVar3;
            }
            if (i36 == 0) {
            }
            if (o.J()) {
                o.S(-1831757546, i14, i38, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsOutlinedTextField (TextField.kt:40)");
            }
            if (z11) {
                lVarV.H(-556370954);
                fB = p009i2.x.f75438a.c(lVarV, p009i2.x.f75439b);
            } else {
                lVarV.H(-556370214);
                fB = p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b);
            }
            lVarV.T();
            float f114 = fB;
            RoundedCornerShape roundedCornerShapeC14 = g.c(h.g(12));
            h2[] h2VarArr14 = {m0.b().d(i.l(lVarV, 0))};
            p<? super l, ? super Integer, h0> pVar1117 = pVar10;
            boolean z11114 = z14;
            boolean z11115 = z15;
            d dVar18 = dVar3;
            z0 z0Var16 = z0VarC;
            p<? super l, ? super Integer, h0> pVar1118 = pVar7;
            lVar2 = lVarV;
            w.b(h2VarArr14, c.b(lVar2, 452267478, true, new a(dVar18, f114, roundedCornerShapeC14, value, onValueChange, z11, z11114, pVar1117, pVar5, pVar1118, pVar6, z11115, z0Var16, keyboardOptionsA, zVar16)), lVar2, 56);
            if (o.J()) {
                o.R();
            }
            dVar4 = dVar18;
            z16 = z11114;
            z17 = z11115;
            pVar8 = pVar1118;
            z0Var2 = z0Var16;
            pVar9 = pVar1117;
            zVar2 = zVar16;
        } else {
            if (i41 != 0) {
                dVar3 = d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i16 != 0) {
                z14 = false;
            }
            if (i18 != 0) {
                z15 = false;
            }
            if (i21 != 0) {
                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
            }
            if (i23 != 0) {
                zVarA = z.INSTANCE.a();
            }
            z zVar17 = zVarA;
            if (i25 != 0) {
                pVar5 = null;
            } else {
                pVar5 = pVar;
            }
            if (i27 != 0) {
                z0VarC = z0.INSTANCE.c();
            } else {
                z0VarC = z0Var;
            }
            if (i29 != 0) {
                pVar6 = null;
            } else {
                pVar6 = pVar2;
            }
            if (i33 != 0) {
                pVar7 = null;
            } else {
                pVar7 = pVar3;
            }
            if (i36 == 0) {
            }
            if (o.J()) {
                o.S(-1831757546, i14, i38, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsOutlinedTextField (TextField.kt:40)");
            }
            if (z11) {
                lVarV.H(-556370954);
                fB = p009i2.x.f75438a.c(lVarV, p009i2.x.f75439b);
            } else {
                lVarV.H(-556370214);
                fB = p009i2.x.f75438a.b(lVarV, p009i2.x.f75439b);
            }
            lVarV.T();
            float f115 = fB;
            RoundedCornerShape roundedCornerShapeC15 = g.c(h.g(12));
            h2[] h2VarArr15 = {m0.b().d(i.l(lVarV, 0))};
            p<? super l, ? super Integer, h0> pVar1119 = pVar10;
            boolean z11116 = z14;
            boolean z11117 = z15;
            d dVar19 = dVar3;
            z0 z0Var17 = z0VarC;
            p<? super l, ? super Integer, h0> pVar11110 = pVar7;
            lVar2 = lVarV;
            w.b(h2VarArr15, c.b(lVar2, 452267478, true, new a(dVar19, f115, roundedCornerShapeC15, value, onValueChange, z11, z11116, pVar1119, pVar5, pVar11110, pVar6, z11117, z0Var17, keyboardOptionsA, zVar17)), lVar2, 56);
            if (o.J()) {
                o.R();
            }
            dVar4 = dVar19;
            z16 = z11116;
            z17 = z11117;
            pVar8 = pVar11110;
            z0Var2 = z0Var17;
            pVar9 = pVar1119;
            zVar2 = zVar17;
        }
        keyboardOptions2 = keyboardOptionsA;
        w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new b(value, z11, dVar4, onValueChange, z16, z17, keyboardOptions2, zVar2, pVar5, z0Var2, pVar6, pVar8, pVar9, i11, i12, i13));
        }
    }
}
