package p016o2;

import androidx.compose.ui.d;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import jn0.h0;
import k3.g4;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import w4.h;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u001aj\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012\"\u0014\u0010\u0017\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012\"\u0014\u0010\u0019\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012\"\u0014\u0010\u001b\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012\"\u0014\u0010\u001d\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0012\"\u0014\u0010\u001f\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0012\"\u0014\u0010!\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Lo2/g0;", "snackbarData", "Landroidx/compose/ui/d;", "modifier", "", "actionOnNewLine", "Lk3/g4;", "shape", "Lk3/p1;", "containerColor", "contentColor", "actionColor", "actionContentColor", "dismissActionContentColor", "Ljn0/h0;", "a", "(Lo2/g0;Landroidx/compose/ui/d;ZLk3/g4;JJJJJLr2/l;II)V", "Lw4/h;", Gender.FEMALE, "ContainerMaxWidth", "b", "HeightToFirstLine", "c", "HorizontalSpacing", DateTokenConverter.CONVERTER_KEY, "HorizontalSpacingButtonSide", "e", "SeparateButtonExtraY", "f", "SnackbarVerticalPadding", "g", "TextEndExtraSpacing", "h", "LongButtonVerticalOffset", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class k0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f95960d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f95963g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f95957a = h.g(600);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f95958b = h.g(30);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f95959c = h.g(16);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f95961e = h.g(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f95962f = h.g(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f95964h = h.g(12);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g0 f95965c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f95966d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f95967e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g4 f95968f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f95969g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f95970h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f95971i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f95972j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ long f95973k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f95974l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f95975m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g0 g0Var, d dVar, boolean z11, g4 g4Var, long j11, long j12, long j13, long j14, long j15, int i11, int i12) {
            super(2);
            this.f95965c = g0Var;
            this.f95966d = dVar;
            this.f95967e = z11;
            this.f95968f = g4Var;
            this.f95969g = j11;
            this.f95970h = j12;
            this.f95971i = j13;
            this.f95972j = j14;
            this.f95973k = j15;
            this.f95974l = i11;
            this.f95975m = i12;
        }

        public final void a(l lVar, int i11) {
            k0.a(this.f95965c, this.f95966d, this.f95967e, this.f95968f, this.f95969g, this.f95970h, this.f95971i, this.f95972j, this.f95973k, lVar, k2.a(this.f95974l | 1), this.f95975m);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    static {
        float f11 = 8;
        f95960d = h.g(f11);
        f95963g = h.g(f11);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0115  */
    /* JADX WARN: Code duplicated, block: B:111:0x015c  */
    /* JADX WARN: Code duplicated, block: B:132:0x0187 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x0189  */
    /* JADX WARN: Code duplicated, block: B:136:0x0190  */
    /* JADX WARN: Code duplicated, block: B:139:0x019b  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:145:0x01af  */
    /* JADX WARN: Code duplicated, block: B:148:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:151:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00be  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00df  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:93:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:96:0x0102 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x0109  */
    public static final void a(g0 g0Var, d dVar, boolean z11, g4 g4Var, long j11, long j12, long j13, long j14, long j15, l lVar, int i11, int i12) {
        int i13;
        d dVar2;
        boolean z12;
        int i14;
        long j16;
        long j17;
        long j18;
        int i15;
        long j19;
        int i16;
        int i17;
        int i18;
        l lVarV = lVar.v(274621471);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.n(g0Var) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i19 = i12 & 2;
        if (i19 == 0) {
            if ((i11 & 48) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 32 : 16;
            }
            if ((i12 & 4) != 0) {
                if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                    z12 = z11;
                    if (lVarV.p(z12)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i13 |= i14;
                }
                if ((i11 & 3072) != 0) {
                    i13 |= ((i12 & 8) == 0 || !lVarV.n(g4Var)) ? 1024 : 2048;
                }
                if ((i11 & 24576) == 0) {
                    if ((i12 & 16) == 0) {
                        j16 = j11;
                        if (lVarV.s(j16)) {
                            i18 = 16384;
                        }
                        i13 |= i18;
                    } else {
                        j16 = j11;
                    }
                    i18 = PKIFailureInfo.certRevoked;
                    i13 |= i18;
                } else {
                    j16 = j11;
                }
                if ((196608 & i11) == 0) {
                    if ((i12 & 32) == 0) {
                        j17 = j12;
                        int i21 = lVarV.s(j17) ? 131072 : 65536;
                        i13 |= i21;
                    } else {
                        j17 = j12;
                    }
                    i13 |= i21;
                } else {
                    j17 = j12;
                }
                if ((1572864 & i11) == 0) {
                    j18 = j13;
                    if ((i12 & 64) == 0 || !lVarV.s(j18)) {
                        i17 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i17 = PKIFailureInfo.badCertTemplate;
                    }
                    i13 |= i17;
                } else {
                    j18 = j13;
                }
                if ((12582912 & i11) == 0) {
                    if ((i12 & 128) == 0) {
                        i16 = i13;
                        j19 = j14;
                        int i22 = lVarV.s(j19) ? 8388608 : 4194304;
                        i15 = i16 | i22;
                    } else {
                        i16 = i13;
                        j19 = j14;
                    }
                    i15 = i16 | i22;
                } else {
                    i15 = i13;
                    j19 = j14;
                }
                if ((i11 & 100663296) != 0) {
                    i15 |= ((i12 & 256) == 0 || !lVarV.s(j15)) ? 33554432 : 67108864;
                }
                if ((i15 & 38347923) != 38347922 && lVarV.b()) {
                    lVarV.j();
                    w2 w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new a(g0Var, dVar2, z12, g4Var, j16, j17, j18, j19, j15, i11, i12));
                        return;
                    }
                    return;
                }
                lVarV.L();
                if ((i11 & 1) != 0 || lVarV.k()) {
                    if (i19 != 0) {
                        d.Companion companion = d.INSTANCE;
                    }
                    if ((i12 & 8) != 0) {
                        h0.f95880a.f(lVarV, 6);
                        i15 &= -7169;
                    }
                    if ((i12 & 16) != 0) {
                        h0.f95880a.c(lVarV, 6);
                        i15 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        h0.f95880a.d(lVarV, 6);
                        i15 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        h0.f95880a.a(lVarV, 6);
                        i15 &= -3670017;
                    }
                    if ((i12 & 128) != 0) {
                        h0.f95880a.b(lVarV, 6);
                        i15 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        h0.f95880a.e(lVarV, 6);
                        i15 &= -234881025;
                    }
                } else {
                    lVarV.j();
                    if ((i12 & 8) != 0) {
                        i15 &= -7169;
                    }
                    if ((i12 & 16) != 0) {
                        i15 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        i15 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        i15 &= -3670017;
                    }
                    if ((i12 & 128) != 0) {
                        i15 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i15 &= -234881025;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(274621471, i15, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:211)");
                }
                g0Var.a();
                throw null;
            }
            i13 |= KyberEngine.KyberPolyBytes;
            z12 = z11;
            if ((i11 & 3072) != 0) {
                i13 |= ((i12 & 8) == 0 || !lVarV.n(g4Var)) ? 1024 : 2048;
            }
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    j16 = j11;
                    if (lVarV.s(j16)) {
                        i18 = 16384;
                    }
                    i13 |= i18;
                } else {
                    j16 = j11;
                }
                i18 = PKIFailureInfo.certRevoked;
                i13 |= i18;
            } else {
                j16 = j11;
            }
            if ((196608 & i11) == 0) {
                if ((i12 & 32) == 0) {
                    j17 = j12;
                    if (lVarV.s(j17)) {
                    }
                    i13 |= i21;
                } else {
                    j17 = j12;
                }
                i13 |= i21;
            } else {
                j17 = j12;
            }
            if ((1572864 & i11) == 0) {
                j18 = j13;
                if ((i12 & 64) == 0) {
                    i17 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i17 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i17;
            } else {
                j18 = j13;
            }
            if ((12582912 & i11) == 0) {
                if ((i12 & 128) == 0) {
                    i16 = i13;
                    j19 = j14;
                    if (lVarV.s(j19)) {
                    }
                    i15 = i16 | i22;
                } else {
                    i16 = i13;
                    j19 = j14;
                }
                i15 = i16 | i22;
            } else {
                i15 = i13;
                j19 = j14;
            }
            if ((i11 & 100663296) != 0) {
                i15 |= ((i12 & 256) == 0 || !lVarV.s(j15)) ? 33554432 : 67108864;
            }
            if ((i15 & 38347923) != 38347922) {
            }
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i19 != 0) {
                    d.Companion companion2 = d.INSTANCE;
                }
                if ((i12 & 8) != 0) {
                    h0.f95880a.f(lVarV, 6);
                    i15 &= -7169;
                }
                if ((i12 & 16) != 0) {
                    h0.f95880a.c(lVarV, 6);
                    i15 &= -57345;
                }
                if ((i12 & 32) != 0) {
                    h0.f95880a.d(lVarV, 6);
                    i15 &= -458753;
                }
                if ((i12 & 64) != 0) {
                    h0.f95880a.a(lVarV, 6);
                    i15 &= -3670017;
                }
                if ((i12 & 128) != 0) {
                    h0.f95880a.b(lVarV, 6);
                    i15 &= -29360129;
                }
                if ((i12 & 256) != 0) {
                    h0.f95880a.e(lVarV, 6);
                    i15 &= -234881025;
                }
            } else {
                if (i19 != 0) {
                    d.Companion companion3 = d.INSTANCE;
                }
                if ((i12 & 8) != 0) {
                    h0.f95880a.f(lVarV, 6);
                    i15 &= -7169;
                }
                if ((i12 & 16) != 0) {
                    h0.f95880a.c(lVarV, 6);
                    i15 &= -57345;
                }
                if ((i12 & 32) != 0) {
                    h0.f95880a.d(lVarV, 6);
                    i15 &= -458753;
                }
                if ((i12 & 64) != 0) {
                    h0.f95880a.a(lVarV, 6);
                    i15 &= -3670017;
                }
                if ((i12 & 128) != 0) {
                    h0.f95880a.b(lVarV, 6);
                    i15 &= -29360129;
                }
                if ((i12 & 256) != 0) {
                    h0.f95880a.e(lVarV, 6);
                    i15 &= -234881025;
                }
            }
            lVarV.C();
            if (o.J()) {
                o.S(274621471, i15, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:211)");
            }
            g0Var.a();
            throw null;
        }
        i13 |= 48;
        dVar2 = dVar;
        if ((i12 & 4) != 0) {
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                z12 = z11;
                if (lVarV.p(z12)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i13 |= i14;
            }
            if ((i11 & 3072) != 0) {
                i13 |= ((i12 & 8) == 0 || !lVarV.n(g4Var)) ? 1024 : 2048;
            }
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    j16 = j11;
                    if (lVarV.s(j16)) {
                        i18 = 16384;
                    }
                    i13 |= i18;
                } else {
                    j16 = j11;
                }
                i18 = PKIFailureInfo.certRevoked;
                i13 |= i18;
            } else {
                j16 = j11;
            }
            if ((196608 & i11) == 0) {
                if ((i12 & 32) == 0) {
                    j17 = j12;
                    if (lVarV.s(j17)) {
                    }
                    i13 |= i21;
                } else {
                    j17 = j12;
                }
                i13 |= i21;
            } else {
                j17 = j12;
            }
            if ((1572864 & i11) == 0) {
                j18 = j13;
                if ((i12 & 64) == 0) {
                    i17 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i17 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i17;
            } else {
                j18 = j13;
            }
            if ((12582912 & i11) == 0) {
                if ((i12 & 128) == 0) {
                    i16 = i13;
                    j19 = j14;
                    if (lVarV.s(j19)) {
                    }
                    i15 = i16 | i22;
                } else {
                    i16 = i13;
                    j19 = j14;
                }
                i15 = i16 | i22;
            } else {
                i15 = i13;
                j19 = j14;
            }
            if ((i11 & 100663296) != 0) {
                i15 |= ((i12 & 256) == 0 || !lVarV.s(j15)) ? 33554432 : 67108864;
            }
            if ((i15 & 38347923) != 38347922) {
            }
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i19 != 0) {
                    d.Companion companion4 = d.INSTANCE;
                }
                if ((i12 & 8) != 0) {
                    h0.f95880a.f(lVarV, 6);
                    i15 &= -7169;
                }
                if ((i12 & 16) != 0) {
                    h0.f95880a.c(lVarV, 6);
                    i15 &= -57345;
                }
                if ((i12 & 32) != 0) {
                    h0.f95880a.d(lVarV, 6);
                    i15 &= -458753;
                }
                if ((i12 & 64) != 0) {
                    h0.f95880a.a(lVarV, 6);
                    i15 &= -3670017;
                }
                if ((i12 & 128) != 0) {
                    h0.f95880a.b(lVarV, 6);
                    i15 &= -29360129;
                }
                if ((i12 & 256) != 0) {
                    h0.f95880a.e(lVarV, 6);
                    i15 &= -234881025;
                }
            } else {
                if (i19 != 0) {
                    d.Companion companion5 = d.INSTANCE;
                }
                if ((i12 & 8) != 0) {
                    h0.f95880a.f(lVarV, 6);
                    i15 &= -7169;
                }
                if ((i12 & 16) != 0) {
                    h0.f95880a.c(lVarV, 6);
                    i15 &= -57345;
                }
                if ((i12 & 32) != 0) {
                    h0.f95880a.d(lVarV, 6);
                    i15 &= -458753;
                }
                if ((i12 & 64) != 0) {
                    h0.f95880a.a(lVarV, 6);
                    i15 &= -3670017;
                }
                if ((i12 & 128) != 0) {
                    h0.f95880a.b(lVarV, 6);
                    i15 &= -29360129;
                }
                if ((i12 & 256) != 0) {
                    h0.f95880a.e(lVarV, 6);
                    i15 &= -234881025;
                }
            }
            lVarV.C();
            if (o.J()) {
                o.S(274621471, i15, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:211)");
            }
            g0Var.a();
            throw null;
        }
        i13 |= KyberEngine.KyberPolyBytes;
        z12 = z11;
        if ((i11 & 3072) != 0) {
            i13 |= ((i12 & 8) == 0 || !lVarV.n(g4Var)) ? 1024 : 2048;
        }
        if ((i11 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                j16 = j11;
                if (lVarV.s(j16)) {
                    i18 = 16384;
                }
                i13 |= i18;
            } else {
                j16 = j11;
            }
            i18 = PKIFailureInfo.certRevoked;
            i13 |= i18;
        } else {
            j16 = j11;
        }
        if ((196608 & i11) == 0) {
            if ((i12 & 32) == 0) {
                j17 = j12;
                if (lVarV.s(j17)) {
                }
                i13 |= i21;
            } else {
                j17 = j12;
            }
            i13 |= i21;
        } else {
            j17 = j12;
        }
        if ((1572864 & i11) == 0) {
            j18 = j13;
            if ((i12 & 64) == 0) {
                i17 = PKIFailureInfo.signerNotTrusted;
            } else {
                i17 = PKIFailureInfo.signerNotTrusted;
            }
            i13 |= i17;
        } else {
            j18 = j13;
        }
        if ((12582912 & i11) == 0) {
            if ((i12 & 128) == 0) {
                i16 = i13;
                j19 = j14;
                if (lVarV.s(j19)) {
                }
                i15 = i16 | i22;
            } else {
                i16 = i13;
                j19 = j14;
            }
            i15 = i16 | i22;
        } else {
            i15 = i13;
            j19 = j14;
        }
        if ((i11 & 100663296) != 0) {
            i15 |= ((i12 & 256) == 0 || !lVarV.s(j15)) ? 33554432 : 67108864;
        }
        if ((i15 & 38347923) != 38347922) {
        }
        lVarV.L();
        if ((i11 & 1) != 0) {
            if (i19 != 0) {
                d.Companion companion6 = d.INSTANCE;
            }
            if ((i12 & 8) != 0) {
                h0.f95880a.f(lVarV, 6);
                i15 &= -7169;
            }
            if ((i12 & 16) != 0) {
                h0.f95880a.c(lVarV, 6);
                i15 &= -57345;
            }
            if ((i12 & 32) != 0) {
                h0.f95880a.d(lVarV, 6);
                i15 &= -458753;
            }
            if ((i12 & 64) != 0) {
                h0.f95880a.a(lVarV, 6);
                i15 &= -3670017;
            }
            if ((i12 & 128) != 0) {
                h0.f95880a.b(lVarV, 6);
                i15 &= -29360129;
            }
            if ((i12 & 256) != 0) {
                h0.f95880a.e(lVarV, 6);
                i15 &= -234881025;
            }
        } else {
            if (i19 != 0) {
                d.Companion companion7 = d.INSTANCE;
            }
            if ((i12 & 8) != 0) {
                h0.f95880a.f(lVarV, 6);
                i15 &= -7169;
            }
            if ((i12 & 16) != 0) {
                h0.f95880a.c(lVarV, 6);
                i15 &= -57345;
            }
            if ((i12 & 32) != 0) {
                h0.f95880a.d(lVarV, 6);
                i15 &= -458753;
            }
            if ((i12 & 64) != 0) {
                h0.f95880a.a(lVarV, 6);
                i15 &= -3670017;
            }
            if ((i12 & 128) != 0) {
                h0.f95880a.b(lVarV, 6);
                i15 &= -29360129;
            }
            if ((i12 & 256) != 0) {
                h0.f95880a.e(lVarV, 6);
                i15 &= -234881025;
            }
        }
        lVarV.C();
        if (o.J()) {
            o.S(274621471, i15, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:211)");
        }
        g0Var.a();
        throw null;
    }
}
