package p009i2;

import androidx.compose.foundation.m;
import androidx.compose.foundation.o;
import androidx.compose.ui.d;
import androidx.compose.ui.graphics.f;
import androidx.compose.ui.platform.z0;
import androidx.compose.ui.window.s;
import jn0.h0;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.u;
import p019p1.u0;
import p020r2.k2;
import p020r2.l;
import p020r2.p1;
import p020r2.s3;
import p020r2.w2;
import v1.i;
import w4.h;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ad\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"", "expanded", "Lkotlin/Function0;", "Ljn0/h0;", "onDismissRequest", "Landroidx/compose/ui/d;", "modifier", "Lw4/j;", "offset", "Landroidx/compose/foundation/o;", "scrollState", "Landroidx/compose/ui/window/s;", "properties", "Lkotlin/Function1;", "Lv1/i;", "content", "a", "(ZLwn0/a;Landroidx/compose/ui/d;JLandroidx/compose/foundation/o;Landroidx/compose/ui/window/s;Lwn0/q;Lr2/l;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ u0<Boolean> f74295c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p1<f> f74296d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ o f74297e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ d f74298f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q<i, l, Integer, h0> f74299g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(u0<Boolean> u0Var, p1<f> p1Var, o oVar, d dVar, q<? super i, ? super l, ? super Integer, h0> qVar) {
            super(2);
            this.f74295c = u0Var;
            this.f74296d = p1Var;
            this.f74297e = oVar;
            this.f74298f = dVar;
            this.f74299g = qVar;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-47803778, i11, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:138)");
            }
            m1.a(this.f74295c, this.f74296d, this.f74297e, this.f74298f, this.f74299g, lVar, u0.f100644d | 48, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f74300c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f74301d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f74302e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f74303f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ o f74304g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ s f74305h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ q<i, l, Integer, h0> f74306i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f74307j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f74308k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(boolean z11, wn0.a<h0> aVar, d dVar, long j11, o oVar, s sVar, q<? super i, ? super l, ? super Integer, h0> qVar, int i11, int i12) {
            super(2);
            this.f74300c = z11;
            this.f74301d = aVar;
            this.f74302e = dVar;
            this.f74303f = j11;
            this.f74304g = oVar;
            this.f74305h = sVar;
            this.f74306i = qVar;
            this.f74307j = i11;
            this.f74308k = i12;
        }

        public final void a(l lVar, int i11) {
            e.a(this.f74300c, this.f74301d, this.f74302e, this.f74303f, this.f74304g, this.f74305h, this.f74306i, lVar, k2.a(this.f74307j | 1), this.f74308k);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lw4/p;", "parentBounds", "menuBounds", "Ljn0/h0;", "a", "(Lw4/p;Lw4/p;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements p<w4.p, w4.p, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p1<f> f74309c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p1<f> p1Var) {
            super(2);
            this.f74309c = p1Var;
        }

        public final void a(w4.p pVar, w4.p pVar2) {
            this.f74309c.setValue(f.b(m1.f(pVar, pVar2)));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(w4.p pVar, w4.p pVar2) {
            a(pVar, pVar2);
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0122  */
    /* JADX WARN: Code duplicated, block: B:103:0x012b  */
    /* JADX WARN: Code duplicated, block: B:106:0x014d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0162  */
    /* JADX WARN: Code duplicated, block: B:112:0x0181  */
    /* JADX WARN: Code duplicated, block: B:116:0x0199  */
    /* JADX WARN: Code duplicated, block: B:118:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:125:0x021a  */
    /* JADX WARN: Code duplicated, block: B:129:0x022b  */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x0069  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0090  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x009c  */
    /* JADX WARN: Code duplicated, block: B:63:0x009f  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:93:0x0101 A[PHI: r1 r6 r10 r12
      0x0101: PHI (r1v25 int) = (r1v21 int), (r1v20 int), (r1v26 int) binds: [B:102:0x0129, B:91:0x00fd, B:92:0x00ff] A[DONT_GENERATE, DONT_INLINE]
      0x0101: PHI (r6v26 androidx.compose.ui.d) = (r6v3 androidx.compose.ui.d), (r6v2 androidx.compose.ui.d), (r6v2 androidx.compose.ui.d) binds: [B:102:0x0129, B:91:0x00fd, B:92:0x00ff] A[DONT_GENERATE, DONT_INLINE]
      0x0101: PHI (r10v6 long) = (r10v3 long), (r10v2 long), (r10v2 long) binds: [B:102:0x0129, B:91:0x00fd, B:92:0x00ff] A[DONT_GENERATE, DONT_INLINE]
      0x0101: PHI (r12v9 androidx.compose.foundation.o) = (r12v7 androidx.compose.foundation.o), (r12v6 androidx.compose.foundation.o), (r12v6 androidx.compose.foundation.o) binds: [B:102:0x0129, B:91:0x00fd, B:92:0x00ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x010b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0111  */
    public static final void a(boolean z11, wn0.a<h0> aVar, d dVar, long j11, o oVar, s sVar, q<? super i, ? super l, ? super Integer, h0> qVar, l lVar, int i11, int i12) {
        boolean z12;
        int i13;
        int i14;
        d dVar2;
        int i15;
        int i16;
        long jA;
        int i17;
        o oVarA;
        int i18;
        s sVar2;
        int i19;
        q<? super i, ? super l, ? super Integer, h0> qVar2;
        int i21;
        d dVar3;
        long j12;
        o oVar2;
        s sVar3;
        Object objI;
        l.Companion companion;
        u0 u0Var;
        Object objI2;
        p1 p1Var;
        Object objI3;
        s sVar4;
        o oVar3;
        d dVar4;
        long j13;
        w2 w2VarX;
        int i22;
        l lVarV = lVar.v(-2135362555);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
            z12 = z11;
        } else {
            z12 = z11;
            if ((i11 & 6) == 0) {
                i13 = (lVarV.p(z12) ? 4 : 2) | i11;
            } else {
                i13 = i11;
            }
        }
        if ((i12 & 2) == 0) {
            if ((i11 & 48) == 0) {
                i13 |= lVarV.K(aVar) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                    dVar2 = dVar;
                    if (lVarV.n(dVar2)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 8;
                if (i16 != 0) {
                    if ((i11 & 3072) == 0) {
                        jA = j11;
                        if (lVarV.s(jA)) {
                            i17 = 2048;
                        } else {
                            i17 = 1024;
                        }
                        i13 |= i17;
                    }
                    if ((i11 & 24576) == 0) {
                        if ((i12 & 16) == 0) {
                            oVarA = oVar;
                            if (lVarV.n(oVarA)) {
                                i22 = 16384;
                            }
                            i13 |= i22;
                        } else {
                            oVarA = oVar;
                        }
                        i22 = PKIFailureInfo.certRevoked;
                        i13 |= i22;
                    } else {
                        oVarA = oVar;
                    }
                    i18 = i12 & 32;
                    if (i18 != 0) {
                        if ((196608 & i11) == 0) {
                            sVar2 = sVar;
                            if (lVarV.n(sVar2)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i13 |= i19;
                        }
                        if ((i12 & 64) != 0) {
                            if ((i11 & 1572864) == 0) {
                                qVar2 = qVar;
                                if (lVarV.K(qVar2)) {
                                    i21 = PKIFailureInfo.badCertTemplate;
                                } else {
                                    i21 = PKIFailureInfo.signerNotTrusted;
                                }
                                i13 |= i21;
                            }
                            if ((i13 & 599187) == 599186 || !lVarV.b()) {
                                lVarV.L();
                                if ((i11 & 1) != 0 || lVarV.k()) {
                                    if (i14 != 0) {
                                        dVar2 = d.INSTANCE;
                                    }
                                    if (i16 != 0) {
                                        float f11 = 0;
                                        jA = w4.i.a(h.g(f11), h.g(f11));
                                    }
                                    if ((i12 & 16) != 0) {
                                        i13 &= -57345;
                                        oVarA = m.a(0, lVarV, 0, 1);
                                    }
                                    if (i18 != 0) {
                                        dVar3 = dVar2;
                                        j12 = jA;
                                        oVar2 = oVarA;
                                        sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                                    }
                                    lVarV.C();
                                    if (p020r2.o.J()) {
                                        p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                                    }
                                    objI = lVarV.I();
                                    companion = l.INSTANCE;
                                    if (objI == companion.a()) {
                                        objI = new u0(Boolean.FALSE);
                                        lVarV.B(objI);
                                    }
                                    u0Var = (u0) objI;
                                    u0Var.h(Boolean.valueOf(z12));
                                    if (!((Boolean) u0Var.a()).booleanValue() || ((Boolean) u0Var.b()).booleanValue()) {
                                        lVarV.o(1380883942);
                                        objI2 = lVarV.I();
                                        if (objI2 == companion.a()) {
                                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                            lVarV.B(objI2);
                                        }
                                        p1Var = (p1) objI2;
                                        w4.d dVar5 = (w4.d) lVarV.U(z0.g());
                                        objI3 = lVarV.I();
                                        if (objI3 == companion.a()) {
                                            objI3 = new c(p1Var);
                                            lVarV.B(objI3);
                                        }
                                        int i23 = i13;
                                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar5, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i23 & 112) | 3072 | ((i23 >> 9) & 896), 0);
                                        lVarV.l();
                                    } else {
                                        lVarV.o(1381689260);
                                        lVarV.l();
                                    }
                                    if (p020r2.o.J()) {
                                        p020r2.o.R();
                                    }
                                    sVar4 = sVar3;
                                    oVar3 = oVar2;
                                    dVar4 = dVar3;
                                    j13 = j12;
                                } else {
                                    lVarV.j();
                                    if ((i12 & 16) != 0) {
                                        i13 &= -57345;
                                    }
                                }
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                                lVarV.C();
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                                }
                                objI = lVarV.I();
                                companion = l.INSTANCE;
                                if (objI == companion.a()) {
                                    objI = new u0(Boolean.FALSE);
                                    lVarV.B(objI);
                                }
                                u0Var = (u0) objI;
                                u0Var.h(Boolean.valueOf(z12));
                                if (((Boolean) u0Var.a()).booleanValue()) {
                                    lVarV.o(1380883942);
                                    objI2 = lVarV.I();
                                    if (objI2 == companion.a()) {
                                        objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                        lVarV.B(objI2);
                                    }
                                    p1Var = (p1) objI2;
                                    w4.d dVar6 = (w4.d) lVarV.U(z0.g());
                                    objI3 = lVarV.I();
                                    if (objI3 == companion.a()) {
                                        objI3 = new c(p1Var);
                                        lVarV.B(objI3);
                                    }
                                    int i24 = i13;
                                    androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar6, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i24 & 112) | 3072 | ((i24 >> 9) & 896), 0);
                                    lVarV.l();
                                } else {
                                    lVarV.o(1380883942);
                                    objI2 = lVarV.I();
                                    if (objI2 == companion.a()) {
                                        objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                        lVarV.B(objI2);
                                    }
                                    p1Var = (p1) objI2;
                                    w4.d dVar7 = (w4.d) lVarV.U(z0.g());
                                    objI3 = lVarV.I();
                                    if (objI3 == companion.a()) {
                                        objI3 = new c(p1Var);
                                        lVarV.B(objI3);
                                    }
                                    int i25 = i13;
                                    androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar7, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i25 & 112) | 3072 | ((i25 >> 9) & 896), 0);
                                    lVarV.l();
                                }
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                                sVar4 = sVar3;
                                oVar3 = oVar2;
                                dVar4 = dVar3;
                                j13 = j12;
                            } else {
                                lVarV.j();
                                dVar4 = dVar2;
                                j13 = jA;
                                oVar3 = oVarA;
                                sVar4 = sVar2;
                            }
                            w2VarX = lVarV.x();
                            if (w2VarX != null) {
                                w2VarX.a(new b(z12, aVar, dVar4, j13, oVar3, sVar4, qVar, i11, i12));
                            }
                        }
                        i13 |= 1572864;
                        qVar2 = qVar;
                        if ((i13 & 599187) == 599186) {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i14 != 0) {
                                    dVar2 = d.INSTANCE;
                                }
                                if (i16 != 0) {
                                    float f12 = 0;
                                    jA = w4.i.a(h.g(f12), h.g(f12));
                                }
                                if ((i12 & 16) != 0) {
                                    i13 &= -57345;
                                    oVarA = m.a(0, lVarV, 0, 1);
                                }
                                if (i18 != 0) {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                                } else {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = sVar2;
                                }
                            } else {
                                if (i14 != 0) {
                                    dVar2 = d.INSTANCE;
                                }
                                if (i16 != 0) {
                                    float f13 = 0;
                                    jA = w4.i.a(h.g(f13), h.g(f13));
                                }
                                if ((i12 & 16) != 0) {
                                    i13 &= -57345;
                                    oVarA = m.a(0, lVarV, 0, 1);
                                }
                                if (i18 != 0) {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                                } else {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = sVar2;
                                }
                            }
                            lVarV.C();
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                            }
                            objI = lVarV.I();
                            companion = l.INSTANCE;
                            if (objI == companion.a()) {
                                objI = new u0(Boolean.FALSE);
                                lVarV.B(objI);
                            }
                            u0Var = (u0) objI;
                            u0Var.h(Boolean.valueOf(z12));
                            if (((Boolean) u0Var.a()).booleanValue()) {
                                lVarV.o(1380883942);
                                objI2 = lVarV.I();
                                if (objI2 == companion.a()) {
                                    objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                    lVarV.B(objI2);
                                }
                                p1Var = (p1) objI2;
                                w4.d dVar8 = (w4.d) lVarV.U(z0.g());
                                objI3 = lVarV.I();
                                if (objI3 == companion.a()) {
                                    objI3 = new c(p1Var);
                                    lVarV.B(objI3);
                                }
                                int i26 = i13;
                                androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar8, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i26 & 112) | 3072 | ((i26 >> 9) & 896), 0);
                                lVarV.l();
                            } else {
                                lVarV.o(1380883942);
                                objI2 = lVarV.I();
                                if (objI2 == companion.a()) {
                                    objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                    lVarV.B(objI2);
                                }
                                p1Var = (p1) objI2;
                                w4.d dVar9 = (w4.d) lVarV.U(z0.g());
                                objI3 = lVarV.I();
                                if (objI3 == companion.a()) {
                                    objI3 = new c(p1Var);
                                    lVarV.B(objI3);
                                }
                                int i27 = i13;
                                androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar9, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i27 & 112) | 3072 | ((i27 >> 9) & 896), 0);
                                lVarV.l();
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                            sVar4 = sVar3;
                            oVar3 = oVar2;
                            dVar4 = dVar3;
                            j13 = j12;
                        } else {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i14 != 0) {
                                    dVar2 = d.INSTANCE;
                                }
                                if (i16 != 0) {
                                    float f14 = 0;
                                    jA = w4.i.a(h.g(f14), h.g(f14));
                                }
                                if ((i12 & 16) != 0) {
                                    i13 &= -57345;
                                    oVarA = m.a(0, lVarV, 0, 1);
                                }
                                if (i18 != 0) {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                                } else {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = sVar2;
                                }
                            } else {
                                if (i14 != 0) {
                                    dVar2 = d.INSTANCE;
                                }
                                if (i16 != 0) {
                                    float f15 = 0;
                                    jA = w4.i.a(h.g(f15), h.g(f15));
                                }
                                if ((i12 & 16) != 0) {
                                    i13 &= -57345;
                                    oVarA = m.a(0, lVarV, 0, 1);
                                }
                                if (i18 != 0) {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                                } else {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = sVar2;
                                }
                            }
                            lVarV.C();
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                            }
                            objI = lVarV.I();
                            companion = l.INSTANCE;
                            if (objI == companion.a()) {
                                objI = new u0(Boolean.FALSE);
                                lVarV.B(objI);
                            }
                            u0Var = (u0) objI;
                            u0Var.h(Boolean.valueOf(z12));
                            if (((Boolean) u0Var.a()).booleanValue()) {
                                lVarV.o(1380883942);
                                objI2 = lVarV.I();
                                if (objI2 == companion.a()) {
                                    objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                    lVarV.B(objI2);
                                }
                                p1Var = (p1) objI2;
                                w4.d dVar10 = (w4.d) lVarV.U(z0.g());
                                objI3 = lVarV.I();
                                if (objI3 == companion.a()) {
                                    objI3 = new c(p1Var);
                                    lVarV.B(objI3);
                                }
                                int i28 = i13;
                                androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar10, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i28 & 112) | 3072 | ((i28 >> 9) & 896), 0);
                                lVarV.l();
                            } else {
                                lVarV.o(1380883942);
                                objI2 = lVarV.I();
                                if (objI2 == companion.a()) {
                                    objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                    lVarV.B(objI2);
                                }
                                p1Var = (p1) objI2;
                                w4.d dVar11 = (w4.d) lVarV.U(z0.g());
                                objI3 = lVarV.I();
                                if (objI3 == companion.a()) {
                                    objI3 = new c(p1Var);
                                    lVarV.B(objI3);
                                }
                                int i29 = i13;
                                androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar11, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i29 & 112) | 3072 | ((i29 >> 9) & 896), 0);
                                lVarV.l();
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                            sVar4 = sVar3;
                            oVar3 = oVar2;
                            dVar4 = dVar3;
                            j13 = j12;
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new b(z12, aVar, dVar4, j13, oVar3, sVar4, qVar, i11, i12));
                        }
                    }
                    i13 |= 196608;
                    sVar2 = sVar;
                    if ((i12 & 64) != 0) {
                        if ((i11 & 1572864) == 0) {
                            qVar2 = qVar;
                            if (lVarV.K(qVar2)) {
                                i21 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i21 = PKIFailureInfo.signerNotTrusted;
                            }
                            i13 |= i21;
                        }
                        if ((i13 & 599187) == 599186) {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i14 != 0) {
                                    dVar2 = d.INSTANCE;
                                }
                                if (i16 != 0) {
                                    float f16 = 0;
                                    jA = w4.i.a(h.g(f16), h.g(f16));
                                }
                                if ((i12 & 16) != 0) {
                                    i13 &= -57345;
                                    oVarA = m.a(0, lVarV, 0, 1);
                                }
                                if (i18 != 0) {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                                } else {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = sVar2;
                                }
                            } else {
                                if (i14 != 0) {
                                    dVar2 = d.INSTANCE;
                                }
                                if (i16 != 0) {
                                    float f17 = 0;
                                    jA = w4.i.a(h.g(f17), h.g(f17));
                                }
                                if ((i12 & 16) != 0) {
                                    i13 &= -57345;
                                    oVarA = m.a(0, lVarV, 0, 1);
                                }
                                if (i18 != 0) {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                                } else {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = sVar2;
                                }
                            }
                            lVarV.C();
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                            }
                            objI = lVarV.I();
                            companion = l.INSTANCE;
                            if (objI == companion.a()) {
                                objI = new u0(Boolean.FALSE);
                                lVarV.B(objI);
                            }
                            u0Var = (u0) objI;
                            u0Var.h(Boolean.valueOf(z12));
                            if (((Boolean) u0Var.a()).booleanValue()) {
                                lVarV.o(1380883942);
                                objI2 = lVarV.I();
                                if (objI2 == companion.a()) {
                                    objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                    lVarV.B(objI2);
                                }
                                p1Var = (p1) objI2;
                                w4.d dVar12 = (w4.d) lVarV.U(z0.g());
                                objI3 = lVarV.I();
                                if (objI3 == companion.a()) {
                                    objI3 = new c(p1Var);
                                    lVarV.B(objI3);
                                }
                                int i210 = i13;
                                androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar12, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i210 & 112) | 3072 | ((i210 >> 9) & 896), 0);
                                lVarV.l();
                            } else {
                                lVarV.o(1380883942);
                                objI2 = lVarV.I();
                                if (objI2 == companion.a()) {
                                    objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                    lVarV.B(objI2);
                                }
                                p1Var = (p1) objI2;
                                w4.d dVar13 = (w4.d) lVarV.U(z0.g());
                                objI3 = lVarV.I();
                                if (objI3 == companion.a()) {
                                    objI3 = new c(p1Var);
                                    lVarV.B(objI3);
                                }
                                int i211 = i13;
                                androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar13, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i211 & 112) | 3072 | ((i211 >> 9) & 896), 0);
                                lVarV.l();
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                            sVar4 = sVar3;
                            oVar3 = oVar2;
                            dVar4 = dVar3;
                            j13 = j12;
                        } else {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i14 != 0) {
                                    dVar2 = d.INSTANCE;
                                }
                                if (i16 != 0) {
                                    float f18 = 0;
                                    jA = w4.i.a(h.g(f18), h.g(f18));
                                }
                                if ((i12 & 16) != 0) {
                                    i13 &= -57345;
                                    oVarA = m.a(0, lVarV, 0, 1);
                                }
                                if (i18 != 0) {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                                } else {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = sVar2;
                                }
                            } else {
                                if (i14 != 0) {
                                    dVar2 = d.INSTANCE;
                                }
                                if (i16 != 0) {
                                    float f19 = 0;
                                    jA = w4.i.a(h.g(f19), h.g(f19));
                                }
                                if ((i12 & 16) != 0) {
                                    i13 &= -57345;
                                    oVarA = m.a(0, lVarV, 0, 1);
                                }
                                if (i18 != 0) {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                                } else {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = sVar2;
                                }
                            }
                            lVarV.C();
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                            }
                            objI = lVarV.I();
                            companion = l.INSTANCE;
                            if (objI == companion.a()) {
                                objI = new u0(Boolean.FALSE);
                                lVarV.B(objI);
                            }
                            u0Var = (u0) objI;
                            u0Var.h(Boolean.valueOf(z12));
                            if (((Boolean) u0Var.a()).booleanValue()) {
                                lVarV.o(1380883942);
                                objI2 = lVarV.I();
                                if (objI2 == companion.a()) {
                                    objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                    lVarV.B(objI2);
                                }
                                p1Var = (p1) objI2;
                                w4.d dVar14 = (w4.d) lVarV.U(z0.g());
                                objI3 = lVarV.I();
                                if (objI3 == companion.a()) {
                                    objI3 = new c(p1Var);
                                    lVarV.B(objI3);
                                }
                                int i212 = i13;
                                androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar14, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i212 & 112) | 3072 | ((i212 >> 9) & 896), 0);
                                lVarV.l();
                            } else {
                                lVarV.o(1380883942);
                                objI2 = lVarV.I();
                                if (objI2 == companion.a()) {
                                    objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                    lVarV.B(objI2);
                                }
                                p1Var = (p1) objI2;
                                w4.d dVar15 = (w4.d) lVarV.U(z0.g());
                                objI3 = lVarV.I();
                                if (objI3 == companion.a()) {
                                    objI3 = new c(p1Var);
                                    lVarV.B(objI3);
                                }
                                int i213 = i13;
                                androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar15, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i213 & 112) | 3072 | ((i213 >> 9) & 896), 0);
                                lVarV.l();
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                            sVar4 = sVar3;
                            oVar3 = oVar2;
                            dVar4 = dVar3;
                            j13 = j12;
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new b(z12, aVar, dVar4, j13, oVar3, sVar4, qVar, i11, i12));
                        }
                    }
                    i13 |= 1572864;
                    qVar2 = qVar;
                    if ((i13 & 599187) == 599186) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f110 = 0;
                                jA = w4.i.a(h.g(f110), h.g(f110));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        } else {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f111 = 0;
                                jA = w4.i.a(h.g(f111), h.g(f111));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        }
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                        }
                        objI = lVarV.I();
                        companion = l.INSTANCE;
                        if (objI == companion.a()) {
                            objI = new u0(Boolean.FALSE);
                            lVarV.B(objI);
                        }
                        u0Var = (u0) objI;
                        u0Var.h(Boolean.valueOf(z12));
                        if (((Boolean) u0Var.a()).booleanValue()) {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar16 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i214 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar16, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i214 & 112) | 3072 | ((i214 >> 9) & 896), 0);
                            lVarV.l();
                        } else {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar17 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i215 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar17, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i215 & 112) | 3072 | ((i215 >> 9) & 896), 0);
                            lVarV.l();
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        sVar4 = sVar3;
                        oVar3 = oVar2;
                        dVar4 = dVar3;
                        j13 = j12;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f112 = 0;
                                jA = w4.i.a(h.g(f112), h.g(f112));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        } else {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f113 = 0;
                                jA = w4.i.a(h.g(f113), h.g(f113));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        }
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                        }
                        objI = lVarV.I();
                        companion = l.INSTANCE;
                        if (objI == companion.a()) {
                            objI = new u0(Boolean.FALSE);
                            lVarV.B(objI);
                        }
                        u0Var = (u0) objI;
                        u0Var.h(Boolean.valueOf(z12));
                        if (((Boolean) u0Var.a()).booleanValue()) {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar18 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i216 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar18, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i216 & 112) | 3072 | ((i216 >> 9) & 896), 0);
                            lVarV.l();
                        } else {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar19 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i217 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar19, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i217 & 112) | 3072 | ((i217 >> 9) & 896), 0);
                            lVarV.l();
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        sVar4 = sVar3;
                        oVar3 = oVar2;
                        dVar4 = dVar3;
                        j13 = j12;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(z12, aVar, dVar4, j13, oVar3, sVar4, qVar, i11, i12));
                    }
                }
                i13 |= 3072;
                jA = j11;
                if ((i11 & 24576) == 0) {
                    if ((i12 & 16) == 0) {
                        oVarA = oVar;
                        if (lVarV.n(oVarA)) {
                            i22 = 16384;
                        }
                        i13 |= i22;
                    } else {
                        oVarA = oVar;
                    }
                    i22 = PKIFailureInfo.certRevoked;
                    i13 |= i22;
                } else {
                    oVarA = oVar;
                }
                i18 = i12 & 32;
                if (i18 != 0) {
                    if ((196608 & i11) == 0) {
                        sVar2 = sVar;
                        if (lVarV.n(sVar2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                    if ((i12 & 64) != 0) {
                        if ((i11 & 1572864) == 0) {
                            qVar2 = qVar;
                            if (lVarV.K(qVar2)) {
                                i21 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i21 = PKIFailureInfo.signerNotTrusted;
                            }
                            i13 |= i21;
                        }
                        if ((i13 & 599187) == 599186) {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i14 != 0) {
                                    dVar2 = d.INSTANCE;
                                }
                                if (i16 != 0) {
                                    float f114 = 0;
                                    jA = w4.i.a(h.g(f114), h.g(f114));
                                }
                                if ((i12 & 16) != 0) {
                                    i13 &= -57345;
                                    oVarA = m.a(0, lVarV, 0, 1);
                                }
                                if (i18 != 0) {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                                } else {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = sVar2;
                                }
                            } else {
                                if (i14 != 0) {
                                    dVar2 = d.INSTANCE;
                                }
                                if (i16 != 0) {
                                    float f115 = 0;
                                    jA = w4.i.a(h.g(f115), h.g(f115));
                                }
                                if ((i12 & 16) != 0) {
                                    i13 &= -57345;
                                    oVarA = m.a(0, lVarV, 0, 1);
                                }
                                if (i18 != 0) {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                                } else {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = sVar2;
                                }
                            }
                            lVarV.C();
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                            }
                            objI = lVarV.I();
                            companion = l.INSTANCE;
                            if (objI == companion.a()) {
                                objI = new u0(Boolean.FALSE);
                                lVarV.B(objI);
                            }
                            u0Var = (u0) objI;
                            u0Var.h(Boolean.valueOf(z12));
                            if (((Boolean) u0Var.a()).booleanValue()) {
                                lVarV.o(1380883942);
                                objI2 = lVarV.I();
                                if (objI2 == companion.a()) {
                                    objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                    lVarV.B(objI2);
                                }
                                p1Var = (p1) objI2;
                                w4.d dVar110 = (w4.d) lVarV.U(z0.g());
                                objI3 = lVarV.I();
                                if (objI3 == companion.a()) {
                                    objI3 = new c(p1Var);
                                    lVarV.B(objI3);
                                }
                                int i218 = i13;
                                androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar110, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i218 & 112) | 3072 | ((i218 >> 9) & 896), 0);
                                lVarV.l();
                            } else {
                                lVarV.o(1380883942);
                                objI2 = lVarV.I();
                                if (objI2 == companion.a()) {
                                    objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                    lVarV.B(objI2);
                                }
                                p1Var = (p1) objI2;
                                w4.d dVar111 = (w4.d) lVarV.U(z0.g());
                                objI3 = lVarV.I();
                                if (objI3 == companion.a()) {
                                    objI3 = new c(p1Var);
                                    lVarV.B(objI3);
                                }
                                int i219 = i13;
                                androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar111, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i219 & 112) | 3072 | ((i219 >> 9) & 896), 0);
                                lVarV.l();
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                            sVar4 = sVar3;
                            oVar3 = oVar2;
                            dVar4 = dVar3;
                            j13 = j12;
                        } else {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i14 != 0) {
                                    dVar2 = d.INSTANCE;
                                }
                                if (i16 != 0) {
                                    float f116 = 0;
                                    jA = w4.i.a(h.g(f116), h.g(f116));
                                }
                                if ((i12 & 16) != 0) {
                                    i13 &= -57345;
                                    oVarA = m.a(0, lVarV, 0, 1);
                                }
                                if (i18 != 0) {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                                } else {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = sVar2;
                                }
                            } else {
                                if (i14 != 0) {
                                    dVar2 = d.INSTANCE;
                                }
                                if (i16 != 0) {
                                    float f117 = 0;
                                    jA = w4.i.a(h.g(f117), h.g(f117));
                                }
                                if ((i12 & 16) != 0) {
                                    i13 &= -57345;
                                    oVarA = m.a(0, lVarV, 0, 1);
                                }
                                if (i18 != 0) {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                                } else {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = sVar2;
                                }
                            }
                            lVarV.C();
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                            }
                            objI = lVarV.I();
                            companion = l.INSTANCE;
                            if (objI == companion.a()) {
                                objI = new u0(Boolean.FALSE);
                                lVarV.B(objI);
                            }
                            u0Var = (u0) objI;
                            u0Var.h(Boolean.valueOf(z12));
                            if (((Boolean) u0Var.a()).booleanValue()) {
                                lVarV.o(1380883942);
                                objI2 = lVarV.I();
                                if (objI2 == companion.a()) {
                                    objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                    lVarV.B(objI2);
                                }
                                p1Var = (p1) objI2;
                                w4.d dVar112 = (w4.d) lVarV.U(z0.g());
                                objI3 = lVarV.I();
                                if (objI3 == companion.a()) {
                                    objI3 = new c(p1Var);
                                    lVarV.B(objI3);
                                }
                                int i2110 = i13;
                                androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar112, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2110 & 112) | 3072 | ((i2110 >> 9) & 896), 0);
                                lVarV.l();
                            } else {
                                lVarV.o(1380883942);
                                objI2 = lVarV.I();
                                if (objI2 == companion.a()) {
                                    objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                    lVarV.B(objI2);
                                }
                                p1Var = (p1) objI2;
                                w4.d dVar113 = (w4.d) lVarV.U(z0.g());
                                objI3 = lVarV.I();
                                if (objI3 == companion.a()) {
                                    objI3 = new c(p1Var);
                                    lVarV.B(objI3);
                                }
                                int i2111 = i13;
                                androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar113, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2111 & 112) | 3072 | ((i2111 >> 9) & 896), 0);
                                lVarV.l();
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                            sVar4 = sVar3;
                            oVar3 = oVar2;
                            dVar4 = dVar3;
                            j13 = j12;
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new b(z12, aVar, dVar4, j13, oVar3, sVar4, qVar, i11, i12));
                        }
                    }
                    i13 |= 1572864;
                    qVar2 = qVar;
                    if ((i13 & 599187) == 599186) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f118 = 0;
                                jA = w4.i.a(h.g(f118), h.g(f118));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        } else {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f119 = 0;
                                jA = w4.i.a(h.g(f119), h.g(f119));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        }
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                        }
                        objI = lVarV.I();
                        companion = l.INSTANCE;
                        if (objI == companion.a()) {
                            objI = new u0(Boolean.FALSE);
                            lVarV.B(objI);
                        }
                        u0Var = (u0) objI;
                        u0Var.h(Boolean.valueOf(z12));
                        if (((Boolean) u0Var.a()).booleanValue()) {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar114 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i2112 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar114, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2112 & 112) | 3072 | ((i2112 >> 9) & 896), 0);
                            lVarV.l();
                        } else {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar115 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i2113 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar115, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2113 & 112) | 3072 | ((i2113 >> 9) & 896), 0);
                            lVarV.l();
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        sVar4 = sVar3;
                        oVar3 = oVar2;
                        dVar4 = dVar3;
                        j13 = j12;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f1110 = 0;
                                jA = w4.i.a(h.g(f1110), h.g(f1110));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        } else {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f1111 = 0;
                                jA = w4.i.a(h.g(f1111), h.g(f1111));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        }
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                        }
                        objI = lVarV.I();
                        companion = l.INSTANCE;
                        if (objI == companion.a()) {
                            objI = new u0(Boolean.FALSE);
                            lVarV.B(objI);
                        }
                        u0Var = (u0) objI;
                        u0Var.h(Boolean.valueOf(z12));
                        if (((Boolean) u0Var.a()).booleanValue()) {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar116 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i2114 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar116, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2114 & 112) | 3072 | ((i2114 >> 9) & 896), 0);
                            lVarV.l();
                        } else {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar117 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i2115 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar117, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2115 & 112) | 3072 | ((i2115 >> 9) & 896), 0);
                            lVarV.l();
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        sVar4 = sVar3;
                        oVar3 = oVar2;
                        dVar4 = dVar3;
                        j13 = j12;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(z12, aVar, dVar4, j13, oVar3, sVar4, qVar, i11, i12));
                    }
                }
                i13 |= 196608;
                sVar2 = sVar;
                if ((i12 & 64) != 0) {
                    if ((i11 & 1572864) == 0) {
                        qVar2 = qVar;
                        if (lVarV.K(qVar2)) {
                            i21 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i21 = PKIFailureInfo.signerNotTrusted;
                        }
                        i13 |= i21;
                    }
                    if ((i13 & 599187) == 599186) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f1112 = 0;
                                jA = w4.i.a(h.g(f1112), h.g(f1112));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        } else {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f1113 = 0;
                                jA = w4.i.a(h.g(f1113), h.g(f1113));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        }
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                        }
                        objI = lVarV.I();
                        companion = l.INSTANCE;
                        if (objI == companion.a()) {
                            objI = new u0(Boolean.FALSE);
                            lVarV.B(objI);
                        }
                        u0Var = (u0) objI;
                        u0Var.h(Boolean.valueOf(z12));
                        if (((Boolean) u0Var.a()).booleanValue()) {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar118 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i2116 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar118, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2116 & 112) | 3072 | ((i2116 >> 9) & 896), 0);
                            lVarV.l();
                        } else {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar119 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i2117 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar119, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2117 & 112) | 3072 | ((i2117 >> 9) & 896), 0);
                            lVarV.l();
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        sVar4 = sVar3;
                        oVar3 = oVar2;
                        dVar4 = dVar3;
                        j13 = j12;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f1114 = 0;
                                jA = w4.i.a(h.g(f1114), h.g(f1114));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        } else {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f1115 = 0;
                                jA = w4.i.a(h.g(f1115), h.g(f1115));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        }
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                        }
                        objI = lVarV.I();
                        companion = l.INSTANCE;
                        if (objI == companion.a()) {
                            objI = new u0(Boolean.FALSE);
                            lVarV.B(objI);
                        }
                        u0Var = (u0) objI;
                        u0Var.h(Boolean.valueOf(z12));
                        if (((Boolean) u0Var.a()).booleanValue()) {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar1110 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i2118 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1110, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2118 & 112) | 3072 | ((i2118 >> 9) & 896), 0);
                            lVarV.l();
                        } else {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar1111 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i2119 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1111, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2119 & 112) | 3072 | ((i2119 >> 9) & 896), 0);
                            lVarV.l();
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        sVar4 = sVar3;
                        oVar3 = oVar2;
                        dVar4 = dVar3;
                        j13 = j12;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(z12, aVar, dVar4, j13, oVar3, sVar4, qVar, i11, i12));
                    }
                }
                i13 |= 1572864;
                qVar2 = qVar;
                if ((i13 & 599187) == 599186) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f1116 = 0;
                            jA = w4.i.a(h.g(f1116), h.g(f1116));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    } else {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f1117 = 0;
                            jA = w4.i.a(h.g(f1117), h.g(f1117));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                    }
                    objI = lVarV.I();
                    companion = l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = new u0(Boolean.FALSE);
                        lVarV.B(objI);
                    }
                    u0Var = (u0) objI;
                    u0Var.h(Boolean.valueOf(z12));
                    if (((Boolean) u0Var.a()).booleanValue()) {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar1112 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i21110 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1112, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21110 & 112) | 3072 | ((i21110 >> 9) & 896), 0);
                        lVarV.l();
                    } else {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar1113 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i21111 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1113, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21111 & 112) | 3072 | ((i21111 >> 9) & 896), 0);
                        lVarV.l();
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    sVar4 = sVar3;
                    oVar3 = oVar2;
                    dVar4 = dVar3;
                    j13 = j12;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f1118 = 0;
                            jA = w4.i.a(h.g(f1118), h.g(f1118));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    } else {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f1119 = 0;
                            jA = w4.i.a(h.g(f1119), h.g(f1119));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                    }
                    objI = lVarV.I();
                    companion = l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = new u0(Boolean.FALSE);
                        lVarV.B(objI);
                    }
                    u0Var = (u0) objI;
                    u0Var.h(Boolean.valueOf(z12));
                    if (((Boolean) u0Var.a()).booleanValue()) {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar1114 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i21112 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1114, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21112 & 112) | 3072 | ((i21112 >> 9) & 896), 0);
                        lVarV.l();
                    } else {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar1115 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i21113 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1115, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21113 & 112) | 3072 | ((i21113 >> 9) & 896), 0);
                        lVarV.l();
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    sVar4 = sVar3;
                    oVar3 = oVar2;
                    dVar4 = dVar3;
                    j13 = j12;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(z12, aVar, dVar4, j13, oVar3, sVar4, qVar, i11, i12));
                }
            }
            i13 |= KyberEngine.KyberPolyBytes;
            dVar2 = dVar;
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 3072) == 0) {
                    jA = j11;
                    if (lVarV.s(jA)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                if ((i11 & 24576) == 0) {
                    if ((i12 & 16) == 0) {
                        oVarA = oVar;
                        if (lVarV.n(oVarA)) {
                            i22 = 16384;
                        }
                        i13 |= i22;
                    } else {
                        oVarA = oVar;
                    }
                    i22 = PKIFailureInfo.certRevoked;
                    i13 |= i22;
                } else {
                    oVarA = oVar;
                }
                i18 = i12 & 32;
                if (i18 != 0) {
                    if ((196608 & i11) == 0) {
                        sVar2 = sVar;
                        if (lVarV.n(sVar2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                    if ((i12 & 64) != 0) {
                        if ((i11 & 1572864) == 0) {
                            qVar2 = qVar;
                            if (lVarV.K(qVar2)) {
                                i21 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i21 = PKIFailureInfo.signerNotTrusted;
                            }
                            i13 |= i21;
                        }
                        if ((i13 & 599187) == 599186) {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i14 != 0) {
                                    dVar2 = d.INSTANCE;
                                }
                                if (i16 != 0) {
                                    float f11110 = 0;
                                    jA = w4.i.a(h.g(f11110), h.g(f11110));
                                }
                                if ((i12 & 16) != 0) {
                                    i13 &= -57345;
                                    oVarA = m.a(0, lVarV, 0, 1);
                                }
                                if (i18 != 0) {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                                } else {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = sVar2;
                                }
                            } else {
                                if (i14 != 0) {
                                    dVar2 = d.INSTANCE;
                                }
                                if (i16 != 0) {
                                    float f11111 = 0;
                                    jA = w4.i.a(h.g(f11111), h.g(f11111));
                                }
                                if ((i12 & 16) != 0) {
                                    i13 &= -57345;
                                    oVarA = m.a(0, lVarV, 0, 1);
                                }
                                if (i18 != 0) {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                                } else {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = sVar2;
                                }
                            }
                            lVarV.C();
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                            }
                            objI = lVarV.I();
                            companion = l.INSTANCE;
                            if (objI == companion.a()) {
                                objI = new u0(Boolean.FALSE);
                                lVarV.B(objI);
                            }
                            u0Var = (u0) objI;
                            u0Var.h(Boolean.valueOf(z12));
                            if (((Boolean) u0Var.a()).booleanValue()) {
                                lVarV.o(1380883942);
                                objI2 = lVarV.I();
                                if (objI2 == companion.a()) {
                                    objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                    lVarV.B(objI2);
                                }
                                p1Var = (p1) objI2;
                                w4.d dVar1116 = (w4.d) lVarV.U(z0.g());
                                objI3 = lVarV.I();
                                if (objI3 == companion.a()) {
                                    objI3 = new c(p1Var);
                                    lVarV.B(objI3);
                                }
                                int i21114 = i13;
                                androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1116, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21114 & 112) | 3072 | ((i21114 >> 9) & 896), 0);
                                lVarV.l();
                            } else {
                                lVarV.o(1380883942);
                                objI2 = lVarV.I();
                                if (objI2 == companion.a()) {
                                    objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                    lVarV.B(objI2);
                                }
                                p1Var = (p1) objI2;
                                w4.d dVar1117 = (w4.d) lVarV.U(z0.g());
                                objI3 = lVarV.I();
                                if (objI3 == companion.a()) {
                                    objI3 = new c(p1Var);
                                    lVarV.B(objI3);
                                }
                                int i21115 = i13;
                                androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1117, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21115 & 112) | 3072 | ((i21115 >> 9) & 896), 0);
                                lVarV.l();
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                            sVar4 = sVar3;
                            oVar3 = oVar2;
                            dVar4 = dVar3;
                            j13 = j12;
                        } else {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i14 != 0) {
                                    dVar2 = d.INSTANCE;
                                }
                                if (i16 != 0) {
                                    float f11112 = 0;
                                    jA = w4.i.a(h.g(f11112), h.g(f11112));
                                }
                                if ((i12 & 16) != 0) {
                                    i13 &= -57345;
                                    oVarA = m.a(0, lVarV, 0, 1);
                                }
                                if (i18 != 0) {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                                } else {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = sVar2;
                                }
                            } else {
                                if (i14 != 0) {
                                    dVar2 = d.INSTANCE;
                                }
                                if (i16 != 0) {
                                    float f11113 = 0;
                                    jA = w4.i.a(h.g(f11113), h.g(f11113));
                                }
                                if ((i12 & 16) != 0) {
                                    i13 &= -57345;
                                    oVarA = m.a(0, lVarV, 0, 1);
                                }
                                if (i18 != 0) {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                                } else {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = sVar2;
                                }
                            }
                            lVarV.C();
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                            }
                            objI = lVarV.I();
                            companion = l.INSTANCE;
                            if (objI == companion.a()) {
                                objI = new u0(Boolean.FALSE);
                                lVarV.B(objI);
                            }
                            u0Var = (u0) objI;
                            u0Var.h(Boolean.valueOf(z12));
                            if (((Boolean) u0Var.a()).booleanValue()) {
                                lVarV.o(1380883942);
                                objI2 = lVarV.I();
                                if (objI2 == companion.a()) {
                                    objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                    lVarV.B(objI2);
                                }
                                p1Var = (p1) objI2;
                                w4.d dVar1118 = (w4.d) lVarV.U(z0.g());
                                objI3 = lVarV.I();
                                if (objI3 == companion.a()) {
                                    objI3 = new c(p1Var);
                                    lVarV.B(objI3);
                                }
                                int i21116 = i13;
                                androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1118, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21116 & 112) | 3072 | ((i21116 >> 9) & 896), 0);
                                lVarV.l();
                            } else {
                                lVarV.o(1380883942);
                                objI2 = lVarV.I();
                                if (objI2 == companion.a()) {
                                    objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                    lVarV.B(objI2);
                                }
                                p1Var = (p1) objI2;
                                w4.d dVar1119 = (w4.d) lVarV.U(z0.g());
                                objI3 = lVarV.I();
                                if (objI3 == companion.a()) {
                                    objI3 = new c(p1Var);
                                    lVarV.B(objI3);
                                }
                                int i21117 = i13;
                                androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1119, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21117 & 112) | 3072 | ((i21117 >> 9) & 896), 0);
                                lVarV.l();
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                            sVar4 = sVar3;
                            oVar3 = oVar2;
                            dVar4 = dVar3;
                            j13 = j12;
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new b(z12, aVar, dVar4, j13, oVar3, sVar4, qVar, i11, i12));
                        }
                    }
                    i13 |= 1572864;
                    qVar2 = qVar;
                    if ((i13 & 599187) == 599186) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f11114 = 0;
                                jA = w4.i.a(h.g(f11114), h.g(f11114));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        } else {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f11115 = 0;
                                jA = w4.i.a(h.g(f11115), h.g(f11115));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        }
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                        }
                        objI = lVarV.I();
                        companion = l.INSTANCE;
                        if (objI == companion.a()) {
                            objI = new u0(Boolean.FALSE);
                            lVarV.B(objI);
                        }
                        u0Var = (u0) objI;
                        u0Var.h(Boolean.valueOf(z12));
                        if (((Boolean) u0Var.a()).booleanValue()) {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar11110 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i21118 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar11110, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21118 & 112) | 3072 | ((i21118 >> 9) & 896), 0);
                            lVarV.l();
                        } else {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar11111 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i21119 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar11111, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21119 & 112) | 3072 | ((i21119 >> 9) & 896), 0);
                            lVarV.l();
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        sVar4 = sVar3;
                        oVar3 = oVar2;
                        dVar4 = dVar3;
                        j13 = j12;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f11116 = 0;
                                jA = w4.i.a(h.g(f11116), h.g(f11116));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        } else {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f11117 = 0;
                                jA = w4.i.a(h.g(f11117), h.g(f11117));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        }
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                        }
                        objI = lVarV.I();
                        companion = l.INSTANCE;
                        if (objI == companion.a()) {
                            objI = new u0(Boolean.FALSE);
                            lVarV.B(objI);
                        }
                        u0Var = (u0) objI;
                        u0Var.h(Boolean.valueOf(z12));
                        if (((Boolean) u0Var.a()).booleanValue()) {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar11112 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i211110 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar11112, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i211110 & 112) | 3072 | ((i211110 >> 9) & 896), 0);
                            lVarV.l();
                        } else {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar11113 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i211111 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar11113, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i211111 & 112) | 3072 | ((i211111 >> 9) & 896), 0);
                            lVarV.l();
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        sVar4 = sVar3;
                        oVar3 = oVar2;
                        dVar4 = dVar3;
                        j13 = j12;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(z12, aVar, dVar4, j13, oVar3, sVar4, qVar, i11, i12));
                    }
                }
                i13 |= 196608;
                sVar2 = sVar;
                if ((i12 & 64) != 0) {
                    if ((i11 & 1572864) == 0) {
                        qVar2 = qVar;
                        if (lVarV.K(qVar2)) {
                            i21 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i21 = PKIFailureInfo.signerNotTrusted;
                        }
                        i13 |= i21;
                    }
                    if ((i13 & 599187) == 599186) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f11118 = 0;
                                jA = w4.i.a(h.g(f11118), h.g(f11118));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        } else {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f11119 = 0;
                                jA = w4.i.a(h.g(f11119), h.g(f11119));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        }
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                        }
                        objI = lVarV.I();
                        companion = l.INSTANCE;
                        if (objI == companion.a()) {
                            objI = new u0(Boolean.FALSE);
                            lVarV.B(objI);
                        }
                        u0Var = (u0) objI;
                        u0Var.h(Boolean.valueOf(z12));
                        if (((Boolean) u0Var.a()).booleanValue()) {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar11114 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i211112 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar11114, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i211112 & 112) | 3072 | ((i211112 >> 9) & 896), 0);
                            lVarV.l();
                        } else {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar11115 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i211113 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar11115, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i211113 & 112) | 3072 | ((i211113 >> 9) & 896), 0);
                            lVarV.l();
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        sVar4 = sVar3;
                        oVar3 = oVar2;
                        dVar4 = dVar3;
                        j13 = j12;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f111110 = 0;
                                jA = w4.i.a(h.g(f111110), h.g(f111110));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        } else {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f111111 = 0;
                                jA = w4.i.a(h.g(f111111), h.g(f111111));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        }
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                        }
                        objI = lVarV.I();
                        companion = l.INSTANCE;
                        if (objI == companion.a()) {
                            objI = new u0(Boolean.FALSE);
                            lVarV.B(objI);
                        }
                        u0Var = (u0) objI;
                        u0Var.h(Boolean.valueOf(z12));
                        if (((Boolean) u0Var.a()).booleanValue()) {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar11116 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i211114 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar11116, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i211114 & 112) | 3072 | ((i211114 >> 9) & 896), 0);
                            lVarV.l();
                        } else {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar11117 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i211115 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar11117, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i211115 & 112) | 3072 | ((i211115 >> 9) & 896), 0);
                            lVarV.l();
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        sVar4 = sVar3;
                        oVar3 = oVar2;
                        dVar4 = dVar3;
                        j13 = j12;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(z12, aVar, dVar4, j13, oVar3, sVar4, qVar, i11, i12));
                    }
                }
                i13 |= 1572864;
                qVar2 = qVar;
                if ((i13 & 599187) == 599186) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f111112 = 0;
                            jA = w4.i.a(h.g(f111112), h.g(f111112));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    } else {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f111113 = 0;
                            jA = w4.i.a(h.g(f111113), h.g(f111113));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                    }
                    objI = lVarV.I();
                    companion = l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = new u0(Boolean.FALSE);
                        lVarV.B(objI);
                    }
                    u0Var = (u0) objI;
                    u0Var.h(Boolean.valueOf(z12));
                    if (((Boolean) u0Var.a()).booleanValue()) {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar11118 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i211116 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar11118, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i211116 & 112) | 3072 | ((i211116 >> 9) & 896), 0);
                        lVarV.l();
                    } else {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar11119 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i211117 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar11119, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i211117 & 112) | 3072 | ((i211117 >> 9) & 896), 0);
                        lVarV.l();
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    sVar4 = sVar3;
                    oVar3 = oVar2;
                    dVar4 = dVar3;
                    j13 = j12;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f111114 = 0;
                            jA = w4.i.a(h.g(f111114), h.g(f111114));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    } else {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f111115 = 0;
                            jA = w4.i.a(h.g(f111115), h.g(f111115));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                    }
                    objI = lVarV.I();
                    companion = l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = new u0(Boolean.FALSE);
                        lVarV.B(objI);
                    }
                    u0Var = (u0) objI;
                    u0Var.h(Boolean.valueOf(z12));
                    if (((Boolean) u0Var.a()).booleanValue()) {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar111110 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i211118 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar111110, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i211118 & 112) | 3072 | ((i211118 >> 9) & 896), 0);
                        lVarV.l();
                    } else {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar111111 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i211119 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar111111, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i211119 & 112) | 3072 | ((i211119 >> 9) & 896), 0);
                        lVarV.l();
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    sVar4 = sVar3;
                    oVar3 = oVar2;
                    dVar4 = dVar3;
                    j13 = j12;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(z12, aVar, dVar4, j13, oVar3, sVar4, qVar, i11, i12));
                }
            }
            i13 |= 3072;
            jA = j11;
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    oVarA = oVar;
                    if (lVarV.n(oVarA)) {
                        i22 = 16384;
                    }
                    i13 |= i22;
                } else {
                    oVarA = oVar;
                }
                i22 = PKIFailureInfo.certRevoked;
                i13 |= i22;
            } else {
                oVarA = oVar;
            }
            i18 = i12 & 32;
            if (i18 != 0) {
                if ((196608 & i11) == 0) {
                    sVar2 = sVar;
                    if (lVarV.n(sVar2)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                if ((i12 & 64) != 0) {
                    if ((i11 & 1572864) == 0) {
                        qVar2 = qVar;
                        if (lVarV.K(qVar2)) {
                            i21 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i21 = PKIFailureInfo.signerNotTrusted;
                        }
                        i13 |= i21;
                    }
                    if ((i13 & 599187) == 599186) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f111116 = 0;
                                jA = w4.i.a(h.g(f111116), h.g(f111116));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        } else {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f111117 = 0;
                                jA = w4.i.a(h.g(f111117), h.g(f111117));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        }
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                        }
                        objI = lVarV.I();
                        companion = l.INSTANCE;
                        if (objI == companion.a()) {
                            objI = new u0(Boolean.FALSE);
                            lVarV.B(objI);
                        }
                        u0Var = (u0) objI;
                        u0Var.h(Boolean.valueOf(z12));
                        if (((Boolean) u0Var.a()).booleanValue()) {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar111112 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i2111110 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar111112, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2111110 & 112) | 3072 | ((i2111110 >> 9) & 896), 0);
                            lVarV.l();
                        } else {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar111113 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i2111111 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar111113, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2111111 & 112) | 3072 | ((i2111111 >> 9) & 896), 0);
                            lVarV.l();
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        sVar4 = sVar3;
                        oVar3 = oVar2;
                        dVar4 = dVar3;
                        j13 = j12;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f111118 = 0;
                                jA = w4.i.a(h.g(f111118), h.g(f111118));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        } else {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f111119 = 0;
                                jA = w4.i.a(h.g(f111119), h.g(f111119));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        }
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                        }
                        objI = lVarV.I();
                        companion = l.INSTANCE;
                        if (objI == companion.a()) {
                            objI = new u0(Boolean.FALSE);
                            lVarV.B(objI);
                        }
                        u0Var = (u0) objI;
                        u0Var.h(Boolean.valueOf(z12));
                        if (((Boolean) u0Var.a()).booleanValue()) {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar111114 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i2111112 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar111114, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2111112 & 112) | 3072 | ((i2111112 >> 9) & 896), 0);
                            lVarV.l();
                        } else {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar111115 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i2111113 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar111115, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2111113 & 112) | 3072 | ((i2111113 >> 9) & 896), 0);
                            lVarV.l();
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        sVar4 = sVar3;
                        oVar3 = oVar2;
                        dVar4 = dVar3;
                        j13 = j12;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(z12, aVar, dVar4, j13, oVar3, sVar4, qVar, i11, i12));
                    }
                }
                i13 |= 1572864;
                qVar2 = qVar;
                if ((i13 & 599187) == 599186) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f1111110 = 0;
                            jA = w4.i.a(h.g(f1111110), h.g(f1111110));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    } else {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f1111111 = 0;
                            jA = w4.i.a(h.g(f1111111), h.g(f1111111));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                    }
                    objI = lVarV.I();
                    companion = l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = new u0(Boolean.FALSE);
                        lVarV.B(objI);
                    }
                    u0Var = (u0) objI;
                    u0Var.h(Boolean.valueOf(z12));
                    if (((Boolean) u0Var.a()).booleanValue()) {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar111116 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i2111114 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar111116, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2111114 & 112) | 3072 | ((i2111114 >> 9) & 896), 0);
                        lVarV.l();
                    } else {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar111117 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i2111115 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar111117, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2111115 & 112) | 3072 | ((i2111115 >> 9) & 896), 0);
                        lVarV.l();
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    sVar4 = sVar3;
                    oVar3 = oVar2;
                    dVar4 = dVar3;
                    j13 = j12;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f1111112 = 0;
                            jA = w4.i.a(h.g(f1111112), h.g(f1111112));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    } else {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f1111113 = 0;
                            jA = w4.i.a(h.g(f1111113), h.g(f1111113));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                    }
                    objI = lVarV.I();
                    companion = l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = new u0(Boolean.FALSE);
                        lVarV.B(objI);
                    }
                    u0Var = (u0) objI;
                    u0Var.h(Boolean.valueOf(z12));
                    if (((Boolean) u0Var.a()).booleanValue()) {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar111118 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i2111116 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar111118, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2111116 & 112) | 3072 | ((i2111116 >> 9) & 896), 0);
                        lVarV.l();
                    } else {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar111119 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i2111117 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar111119, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2111117 & 112) | 3072 | ((i2111117 >> 9) & 896), 0);
                        lVarV.l();
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    sVar4 = sVar3;
                    oVar3 = oVar2;
                    dVar4 = dVar3;
                    j13 = j12;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(z12, aVar, dVar4, j13, oVar3, sVar4, qVar, i11, i12));
                }
            }
            i13 |= 196608;
            sVar2 = sVar;
            if ((i12 & 64) != 0) {
                if ((i11 & 1572864) == 0) {
                    qVar2 = qVar;
                    if (lVarV.K(qVar2)) {
                        i21 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i21 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i21;
                }
                if ((i13 & 599187) == 599186) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f1111114 = 0;
                            jA = w4.i.a(h.g(f1111114), h.g(f1111114));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    } else {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f1111115 = 0;
                            jA = w4.i.a(h.g(f1111115), h.g(f1111115));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                    }
                    objI = lVarV.I();
                    companion = l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = new u0(Boolean.FALSE);
                        lVarV.B(objI);
                    }
                    u0Var = (u0) objI;
                    u0Var.h(Boolean.valueOf(z12));
                    if (((Boolean) u0Var.a()).booleanValue()) {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar1111110 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i2111118 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1111110, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2111118 & 112) | 3072 | ((i2111118 >> 9) & 896), 0);
                        lVarV.l();
                    } else {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar1111111 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i2111119 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1111111, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2111119 & 112) | 3072 | ((i2111119 >> 9) & 896), 0);
                        lVarV.l();
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    sVar4 = sVar3;
                    oVar3 = oVar2;
                    dVar4 = dVar3;
                    j13 = j12;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f1111116 = 0;
                            jA = w4.i.a(h.g(f1111116), h.g(f1111116));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    } else {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f1111117 = 0;
                            jA = w4.i.a(h.g(f1111117), h.g(f1111117));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                    }
                    objI = lVarV.I();
                    companion = l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = new u0(Boolean.FALSE);
                        lVarV.B(objI);
                    }
                    u0Var = (u0) objI;
                    u0Var.h(Boolean.valueOf(z12));
                    if (((Boolean) u0Var.a()).booleanValue()) {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar1111112 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i21111110 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1111112, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21111110 & 112) | 3072 | ((i21111110 >> 9) & 896), 0);
                        lVarV.l();
                    } else {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar1111113 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i21111111 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1111113, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21111111 & 112) | 3072 | ((i21111111 >> 9) & 896), 0);
                        lVarV.l();
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    sVar4 = sVar3;
                    oVar3 = oVar2;
                    dVar4 = dVar3;
                    j13 = j12;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(z12, aVar, dVar4, j13, oVar3, sVar4, qVar, i11, i12));
                }
            }
            i13 |= 1572864;
            qVar2 = qVar;
            if ((i13 & 599187) == 599186) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i14 != 0) {
                        dVar2 = d.INSTANCE;
                    }
                    if (i16 != 0) {
                        float f1111118 = 0;
                        jA = w4.i.a(h.g(f1111118), h.g(f1111118));
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        oVarA = m.a(0, lVarV, 0, 1);
                    }
                    if (i18 != 0) {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                    } else {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = sVar2;
                    }
                } else {
                    if (i14 != 0) {
                        dVar2 = d.INSTANCE;
                    }
                    if (i16 != 0) {
                        float f1111119 = 0;
                        jA = w4.i.a(h.g(f1111119), h.g(f1111119));
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        oVarA = m.a(0, lVarV, 0, 1);
                    }
                    if (i18 != 0) {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                    } else {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = sVar2;
                    }
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                }
                objI = lVarV.I();
                companion = l.INSTANCE;
                if (objI == companion.a()) {
                    objI = new u0(Boolean.FALSE);
                    lVarV.B(objI);
                }
                u0Var = (u0) objI;
                u0Var.h(Boolean.valueOf(z12));
                if (((Boolean) u0Var.a()).booleanValue()) {
                    lVarV.o(1380883942);
                    objI2 = lVarV.I();
                    if (objI2 == companion.a()) {
                        objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                        lVarV.B(objI2);
                    }
                    p1Var = (p1) objI2;
                    w4.d dVar1111114 = (w4.d) lVarV.U(z0.g());
                    objI3 = lVarV.I();
                    if (objI3 == companion.a()) {
                        objI3 = new c(p1Var);
                        lVarV.B(objI3);
                    }
                    int i21111112 = i13;
                    androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1111114, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21111112 & 112) | 3072 | ((i21111112 >> 9) & 896), 0);
                    lVarV.l();
                } else {
                    lVarV.o(1380883942);
                    objI2 = lVarV.I();
                    if (objI2 == companion.a()) {
                        objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                        lVarV.B(objI2);
                    }
                    p1Var = (p1) objI2;
                    w4.d dVar1111115 = (w4.d) lVarV.U(z0.g());
                    objI3 = lVarV.I();
                    if (objI3 == companion.a()) {
                        objI3 = new c(p1Var);
                        lVarV.B(objI3);
                    }
                    int i21111113 = i13;
                    androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1111115, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21111113 & 112) | 3072 | ((i21111113 >> 9) & 896), 0);
                    lVarV.l();
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                sVar4 = sVar3;
                oVar3 = oVar2;
                dVar4 = dVar3;
                j13 = j12;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i14 != 0) {
                        dVar2 = d.INSTANCE;
                    }
                    if (i16 != 0) {
                        float f11111110 = 0;
                        jA = w4.i.a(h.g(f11111110), h.g(f11111110));
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        oVarA = m.a(0, lVarV, 0, 1);
                    }
                    if (i18 != 0) {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                    } else {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = sVar2;
                    }
                } else {
                    if (i14 != 0) {
                        dVar2 = d.INSTANCE;
                    }
                    if (i16 != 0) {
                        float f11111111 = 0;
                        jA = w4.i.a(h.g(f11111111), h.g(f11111111));
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        oVarA = m.a(0, lVarV, 0, 1);
                    }
                    if (i18 != 0) {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                    } else {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = sVar2;
                    }
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                }
                objI = lVarV.I();
                companion = l.INSTANCE;
                if (objI == companion.a()) {
                    objI = new u0(Boolean.FALSE);
                    lVarV.B(objI);
                }
                u0Var = (u0) objI;
                u0Var.h(Boolean.valueOf(z12));
                if (((Boolean) u0Var.a()).booleanValue()) {
                    lVarV.o(1380883942);
                    objI2 = lVarV.I();
                    if (objI2 == companion.a()) {
                        objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                        lVarV.B(objI2);
                    }
                    p1Var = (p1) objI2;
                    w4.d dVar1111116 = (w4.d) lVarV.U(z0.g());
                    objI3 = lVarV.I();
                    if (objI3 == companion.a()) {
                        objI3 = new c(p1Var);
                        lVarV.B(objI3);
                    }
                    int i21111114 = i13;
                    androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1111116, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21111114 & 112) | 3072 | ((i21111114 >> 9) & 896), 0);
                    lVarV.l();
                } else {
                    lVarV.o(1380883942);
                    objI2 = lVarV.I();
                    if (objI2 == companion.a()) {
                        objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                        lVarV.B(objI2);
                    }
                    p1Var = (p1) objI2;
                    w4.d dVar1111117 = (w4.d) lVarV.U(z0.g());
                    objI3 = lVarV.I();
                    if (objI3 == companion.a()) {
                        objI3 = new c(p1Var);
                        lVarV.B(objI3);
                    }
                    int i21111115 = i13;
                    androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1111117, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21111115 & 112) | 3072 | ((i21111115 >> 9) & 896), 0);
                    lVarV.l();
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                sVar4 = sVar3;
                oVar3 = oVar2;
                dVar4 = dVar3;
                j13 = j12;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(z12, aVar, dVar4, j13, oVar3, sVar4, qVar, i11, i12));
            }
        }
        i13 |= 48;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                dVar2 = dVar;
                if (lVarV.n(dVar2)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 3072) == 0) {
                    jA = j11;
                    if (lVarV.s(jA)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                if ((i11 & 24576) == 0) {
                    if ((i12 & 16) == 0) {
                        oVarA = oVar;
                        if (lVarV.n(oVarA)) {
                            i22 = 16384;
                        }
                        i13 |= i22;
                    } else {
                        oVarA = oVar;
                    }
                    i22 = PKIFailureInfo.certRevoked;
                    i13 |= i22;
                } else {
                    oVarA = oVar;
                }
                i18 = i12 & 32;
                if (i18 != 0) {
                    if ((196608 & i11) == 0) {
                        sVar2 = sVar;
                        if (lVarV.n(sVar2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                    if ((i12 & 64) != 0) {
                        if ((i11 & 1572864) == 0) {
                            qVar2 = qVar;
                            if (lVarV.K(qVar2)) {
                                i21 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i21 = PKIFailureInfo.signerNotTrusted;
                            }
                            i13 |= i21;
                        }
                        if ((i13 & 599187) == 599186) {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i14 != 0) {
                                    dVar2 = d.INSTANCE;
                                }
                                if (i16 != 0) {
                                    float f11111112 = 0;
                                    jA = w4.i.a(h.g(f11111112), h.g(f11111112));
                                }
                                if ((i12 & 16) != 0) {
                                    i13 &= -57345;
                                    oVarA = m.a(0, lVarV, 0, 1);
                                }
                                if (i18 != 0) {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                                } else {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = sVar2;
                                }
                            } else {
                                if (i14 != 0) {
                                    dVar2 = d.INSTANCE;
                                }
                                if (i16 != 0) {
                                    float f11111113 = 0;
                                    jA = w4.i.a(h.g(f11111113), h.g(f11111113));
                                }
                                if ((i12 & 16) != 0) {
                                    i13 &= -57345;
                                    oVarA = m.a(0, lVarV, 0, 1);
                                }
                                if (i18 != 0) {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                                } else {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = sVar2;
                                }
                            }
                            lVarV.C();
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                            }
                            objI = lVarV.I();
                            companion = l.INSTANCE;
                            if (objI == companion.a()) {
                                objI = new u0(Boolean.FALSE);
                                lVarV.B(objI);
                            }
                            u0Var = (u0) objI;
                            u0Var.h(Boolean.valueOf(z12));
                            if (((Boolean) u0Var.a()).booleanValue()) {
                                lVarV.o(1380883942);
                                objI2 = lVarV.I();
                                if (objI2 == companion.a()) {
                                    objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                    lVarV.B(objI2);
                                }
                                p1Var = (p1) objI2;
                                w4.d dVar1111118 = (w4.d) lVarV.U(z0.g());
                                objI3 = lVarV.I();
                                if (objI3 == companion.a()) {
                                    objI3 = new c(p1Var);
                                    lVarV.B(objI3);
                                }
                                int i21111116 = i13;
                                androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1111118, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21111116 & 112) | 3072 | ((i21111116 >> 9) & 896), 0);
                                lVarV.l();
                            } else {
                                lVarV.o(1380883942);
                                objI2 = lVarV.I();
                                if (objI2 == companion.a()) {
                                    objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                    lVarV.B(objI2);
                                }
                                p1Var = (p1) objI2;
                                w4.d dVar1111119 = (w4.d) lVarV.U(z0.g());
                                objI3 = lVarV.I();
                                if (objI3 == companion.a()) {
                                    objI3 = new c(p1Var);
                                    lVarV.B(objI3);
                                }
                                int i21111117 = i13;
                                androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1111119, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21111117 & 112) | 3072 | ((i21111117 >> 9) & 896), 0);
                                lVarV.l();
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                            sVar4 = sVar3;
                            oVar3 = oVar2;
                            dVar4 = dVar3;
                            j13 = j12;
                        } else {
                            lVarV.L();
                            if ((i11 & 1) != 0) {
                                if (i14 != 0) {
                                    dVar2 = d.INSTANCE;
                                }
                                if (i16 != 0) {
                                    float f11111114 = 0;
                                    jA = w4.i.a(h.g(f11111114), h.g(f11111114));
                                }
                                if ((i12 & 16) != 0) {
                                    i13 &= -57345;
                                    oVarA = m.a(0, lVarV, 0, 1);
                                }
                                if (i18 != 0) {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                                } else {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = sVar2;
                                }
                            } else {
                                if (i14 != 0) {
                                    dVar2 = d.INSTANCE;
                                }
                                if (i16 != 0) {
                                    float f11111115 = 0;
                                    jA = w4.i.a(h.g(f11111115), h.g(f11111115));
                                }
                                if ((i12 & 16) != 0) {
                                    i13 &= -57345;
                                    oVarA = m.a(0, lVarV, 0, 1);
                                }
                                if (i18 != 0) {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                                } else {
                                    dVar3 = dVar2;
                                    j12 = jA;
                                    oVar2 = oVarA;
                                    sVar3 = sVar2;
                                }
                            }
                            lVarV.C();
                            if (p020r2.o.J()) {
                                p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                            }
                            objI = lVarV.I();
                            companion = l.INSTANCE;
                            if (objI == companion.a()) {
                                objI = new u0(Boolean.FALSE);
                                lVarV.B(objI);
                            }
                            u0Var = (u0) objI;
                            u0Var.h(Boolean.valueOf(z12));
                            if (((Boolean) u0Var.a()).booleanValue()) {
                                lVarV.o(1380883942);
                                objI2 = lVarV.I();
                                if (objI2 == companion.a()) {
                                    objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                    lVarV.B(objI2);
                                }
                                p1Var = (p1) objI2;
                                w4.d dVar11111110 = (w4.d) lVarV.U(z0.g());
                                objI3 = lVarV.I();
                                if (objI3 == companion.a()) {
                                    objI3 = new c(p1Var);
                                    lVarV.B(objI3);
                                }
                                int i21111118 = i13;
                                androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar11111110, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21111118 & 112) | 3072 | ((i21111118 >> 9) & 896), 0);
                                lVarV.l();
                            } else {
                                lVarV.o(1380883942);
                                objI2 = lVarV.I();
                                if (objI2 == companion.a()) {
                                    objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                    lVarV.B(objI2);
                                }
                                p1Var = (p1) objI2;
                                w4.d dVar11111111 = (w4.d) lVarV.U(z0.g());
                                objI3 = lVarV.I();
                                if (objI3 == companion.a()) {
                                    objI3 = new c(p1Var);
                                    lVarV.B(objI3);
                                }
                                int i21111119 = i13;
                                androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar11111111, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21111119 & 112) | 3072 | ((i21111119 >> 9) & 896), 0);
                                lVarV.l();
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                            sVar4 = sVar3;
                            oVar3 = oVar2;
                            dVar4 = dVar3;
                            j13 = j12;
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new b(z12, aVar, dVar4, j13, oVar3, sVar4, qVar, i11, i12));
                        }
                    }
                    i13 |= 1572864;
                    qVar2 = qVar;
                    if ((i13 & 599187) == 599186) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f11111116 = 0;
                                jA = w4.i.a(h.g(f11111116), h.g(f11111116));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        } else {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f11111117 = 0;
                                jA = w4.i.a(h.g(f11111117), h.g(f11111117));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        }
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                        }
                        objI = lVarV.I();
                        companion = l.INSTANCE;
                        if (objI == companion.a()) {
                            objI = new u0(Boolean.FALSE);
                            lVarV.B(objI);
                        }
                        u0Var = (u0) objI;
                        u0Var.h(Boolean.valueOf(z12));
                        if (((Boolean) u0Var.a()).booleanValue()) {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar11111112 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i211111110 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar11111112, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i211111110 & 112) | 3072 | ((i211111110 >> 9) & 896), 0);
                            lVarV.l();
                        } else {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar11111113 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i211111111 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar11111113, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i211111111 & 112) | 3072 | ((i211111111 >> 9) & 896), 0);
                            lVarV.l();
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        sVar4 = sVar3;
                        oVar3 = oVar2;
                        dVar4 = dVar3;
                        j13 = j12;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f11111118 = 0;
                                jA = w4.i.a(h.g(f11111118), h.g(f11111118));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        } else {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f11111119 = 0;
                                jA = w4.i.a(h.g(f11111119), h.g(f11111119));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        }
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                        }
                        objI = lVarV.I();
                        companion = l.INSTANCE;
                        if (objI == companion.a()) {
                            objI = new u0(Boolean.FALSE);
                            lVarV.B(objI);
                        }
                        u0Var = (u0) objI;
                        u0Var.h(Boolean.valueOf(z12));
                        if (((Boolean) u0Var.a()).booleanValue()) {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar11111114 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i211111112 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar11111114, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i211111112 & 112) | 3072 | ((i211111112 >> 9) & 896), 0);
                            lVarV.l();
                        } else {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar11111115 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i211111113 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar11111115, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i211111113 & 112) | 3072 | ((i211111113 >> 9) & 896), 0);
                            lVarV.l();
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        sVar4 = sVar3;
                        oVar3 = oVar2;
                        dVar4 = dVar3;
                        j13 = j12;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(z12, aVar, dVar4, j13, oVar3, sVar4, qVar, i11, i12));
                    }
                }
                i13 |= 196608;
                sVar2 = sVar;
                if ((i12 & 64) != 0) {
                    if ((i11 & 1572864) == 0) {
                        qVar2 = qVar;
                        if (lVarV.K(qVar2)) {
                            i21 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i21 = PKIFailureInfo.signerNotTrusted;
                        }
                        i13 |= i21;
                    }
                    if ((i13 & 599187) == 599186) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f111111110 = 0;
                                jA = w4.i.a(h.g(f111111110), h.g(f111111110));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        } else {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f111111111 = 0;
                                jA = w4.i.a(h.g(f111111111), h.g(f111111111));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        }
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                        }
                        objI = lVarV.I();
                        companion = l.INSTANCE;
                        if (objI == companion.a()) {
                            objI = new u0(Boolean.FALSE);
                            lVarV.B(objI);
                        }
                        u0Var = (u0) objI;
                        u0Var.h(Boolean.valueOf(z12));
                        if (((Boolean) u0Var.a()).booleanValue()) {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar11111116 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i211111114 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar11111116, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i211111114 & 112) | 3072 | ((i211111114 >> 9) & 896), 0);
                            lVarV.l();
                        } else {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar11111117 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i211111115 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar11111117, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i211111115 & 112) | 3072 | ((i211111115 >> 9) & 896), 0);
                            lVarV.l();
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        sVar4 = sVar3;
                        oVar3 = oVar2;
                        dVar4 = dVar3;
                        j13 = j12;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f111111112 = 0;
                                jA = w4.i.a(h.g(f111111112), h.g(f111111112));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        } else {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f111111113 = 0;
                                jA = w4.i.a(h.g(f111111113), h.g(f111111113));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        }
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                        }
                        objI = lVarV.I();
                        companion = l.INSTANCE;
                        if (objI == companion.a()) {
                            objI = new u0(Boolean.FALSE);
                            lVarV.B(objI);
                        }
                        u0Var = (u0) objI;
                        u0Var.h(Boolean.valueOf(z12));
                        if (((Boolean) u0Var.a()).booleanValue()) {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar11111118 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i211111116 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar11111118, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i211111116 & 112) | 3072 | ((i211111116 >> 9) & 896), 0);
                            lVarV.l();
                        } else {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar11111119 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i211111117 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar11111119, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i211111117 & 112) | 3072 | ((i211111117 >> 9) & 896), 0);
                            lVarV.l();
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        sVar4 = sVar3;
                        oVar3 = oVar2;
                        dVar4 = dVar3;
                        j13 = j12;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(z12, aVar, dVar4, j13, oVar3, sVar4, qVar, i11, i12));
                    }
                }
                i13 |= 1572864;
                qVar2 = qVar;
                if ((i13 & 599187) == 599186) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f111111114 = 0;
                            jA = w4.i.a(h.g(f111111114), h.g(f111111114));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    } else {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f111111115 = 0;
                            jA = w4.i.a(h.g(f111111115), h.g(f111111115));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                    }
                    objI = lVarV.I();
                    companion = l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = new u0(Boolean.FALSE);
                        lVarV.B(objI);
                    }
                    u0Var = (u0) objI;
                    u0Var.h(Boolean.valueOf(z12));
                    if (((Boolean) u0Var.a()).booleanValue()) {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar111111110 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i211111118 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar111111110, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i211111118 & 112) | 3072 | ((i211111118 >> 9) & 896), 0);
                        lVarV.l();
                    } else {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar111111111 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i211111119 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar111111111, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i211111119 & 112) | 3072 | ((i211111119 >> 9) & 896), 0);
                        lVarV.l();
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    sVar4 = sVar3;
                    oVar3 = oVar2;
                    dVar4 = dVar3;
                    j13 = j12;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f111111116 = 0;
                            jA = w4.i.a(h.g(f111111116), h.g(f111111116));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    } else {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f111111117 = 0;
                            jA = w4.i.a(h.g(f111111117), h.g(f111111117));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                    }
                    objI = lVarV.I();
                    companion = l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = new u0(Boolean.FALSE);
                        lVarV.B(objI);
                    }
                    u0Var = (u0) objI;
                    u0Var.h(Boolean.valueOf(z12));
                    if (((Boolean) u0Var.a()).booleanValue()) {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar111111112 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i2111111110 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar111111112, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2111111110 & 112) | 3072 | ((i2111111110 >> 9) & 896), 0);
                        lVarV.l();
                    } else {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar111111113 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i2111111111 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar111111113, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2111111111 & 112) | 3072 | ((i2111111111 >> 9) & 896), 0);
                        lVarV.l();
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    sVar4 = sVar3;
                    oVar3 = oVar2;
                    dVar4 = dVar3;
                    j13 = j12;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(z12, aVar, dVar4, j13, oVar3, sVar4, qVar, i11, i12));
                }
            }
            i13 |= 3072;
            jA = j11;
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    oVarA = oVar;
                    if (lVarV.n(oVarA)) {
                        i22 = 16384;
                    }
                    i13 |= i22;
                } else {
                    oVarA = oVar;
                }
                i22 = PKIFailureInfo.certRevoked;
                i13 |= i22;
            } else {
                oVarA = oVar;
            }
            i18 = i12 & 32;
            if (i18 != 0) {
                if ((196608 & i11) == 0) {
                    sVar2 = sVar;
                    if (lVarV.n(sVar2)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                if ((i12 & 64) != 0) {
                    if ((i11 & 1572864) == 0) {
                        qVar2 = qVar;
                        if (lVarV.K(qVar2)) {
                            i21 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i21 = PKIFailureInfo.signerNotTrusted;
                        }
                        i13 |= i21;
                    }
                    if ((i13 & 599187) == 599186) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f111111118 = 0;
                                jA = w4.i.a(h.g(f111111118), h.g(f111111118));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        } else {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f111111119 = 0;
                                jA = w4.i.a(h.g(f111111119), h.g(f111111119));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        }
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                        }
                        objI = lVarV.I();
                        companion = l.INSTANCE;
                        if (objI == companion.a()) {
                            objI = new u0(Boolean.FALSE);
                            lVarV.B(objI);
                        }
                        u0Var = (u0) objI;
                        u0Var.h(Boolean.valueOf(z12));
                        if (((Boolean) u0Var.a()).booleanValue()) {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar111111114 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i2111111112 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar111111114, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2111111112 & 112) | 3072 | ((i2111111112 >> 9) & 896), 0);
                            lVarV.l();
                        } else {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar111111115 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i2111111113 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar111111115, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2111111113 & 112) | 3072 | ((i2111111113 >> 9) & 896), 0);
                            lVarV.l();
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        sVar4 = sVar3;
                        oVar3 = oVar2;
                        dVar4 = dVar3;
                        j13 = j12;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f1111111110 = 0;
                                jA = w4.i.a(h.g(f1111111110), h.g(f1111111110));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        } else {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f1111111111 = 0;
                                jA = w4.i.a(h.g(f1111111111), h.g(f1111111111));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        }
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                        }
                        objI = lVarV.I();
                        companion = l.INSTANCE;
                        if (objI == companion.a()) {
                            objI = new u0(Boolean.FALSE);
                            lVarV.B(objI);
                        }
                        u0Var = (u0) objI;
                        u0Var.h(Boolean.valueOf(z12));
                        if (((Boolean) u0Var.a()).booleanValue()) {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar111111116 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i2111111114 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar111111116, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2111111114 & 112) | 3072 | ((i2111111114 >> 9) & 896), 0);
                            lVarV.l();
                        } else {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar111111117 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i2111111115 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar111111117, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2111111115 & 112) | 3072 | ((i2111111115 >> 9) & 896), 0);
                            lVarV.l();
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        sVar4 = sVar3;
                        oVar3 = oVar2;
                        dVar4 = dVar3;
                        j13 = j12;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(z12, aVar, dVar4, j13, oVar3, sVar4, qVar, i11, i12));
                    }
                }
                i13 |= 1572864;
                qVar2 = qVar;
                if ((i13 & 599187) == 599186) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f1111111112 = 0;
                            jA = w4.i.a(h.g(f1111111112), h.g(f1111111112));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    } else {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f1111111113 = 0;
                            jA = w4.i.a(h.g(f1111111113), h.g(f1111111113));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                    }
                    objI = lVarV.I();
                    companion = l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = new u0(Boolean.FALSE);
                        lVarV.B(objI);
                    }
                    u0Var = (u0) objI;
                    u0Var.h(Boolean.valueOf(z12));
                    if (((Boolean) u0Var.a()).booleanValue()) {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar111111118 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i2111111116 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar111111118, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2111111116 & 112) | 3072 | ((i2111111116 >> 9) & 896), 0);
                        lVarV.l();
                    } else {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar111111119 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i2111111117 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar111111119, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2111111117 & 112) | 3072 | ((i2111111117 >> 9) & 896), 0);
                        lVarV.l();
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    sVar4 = sVar3;
                    oVar3 = oVar2;
                    dVar4 = dVar3;
                    j13 = j12;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f1111111114 = 0;
                            jA = w4.i.a(h.g(f1111111114), h.g(f1111111114));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    } else {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f1111111115 = 0;
                            jA = w4.i.a(h.g(f1111111115), h.g(f1111111115));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                    }
                    objI = lVarV.I();
                    companion = l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = new u0(Boolean.FALSE);
                        lVarV.B(objI);
                    }
                    u0Var = (u0) objI;
                    u0Var.h(Boolean.valueOf(z12));
                    if (((Boolean) u0Var.a()).booleanValue()) {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar1111111110 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i2111111118 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1111111110, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2111111118 & 112) | 3072 | ((i2111111118 >> 9) & 896), 0);
                        lVarV.l();
                    } else {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar1111111111 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i2111111119 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1111111111, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2111111119 & 112) | 3072 | ((i2111111119 >> 9) & 896), 0);
                        lVarV.l();
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    sVar4 = sVar3;
                    oVar3 = oVar2;
                    dVar4 = dVar3;
                    j13 = j12;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(z12, aVar, dVar4, j13, oVar3, sVar4, qVar, i11, i12));
                }
            }
            i13 |= 196608;
            sVar2 = sVar;
            if ((i12 & 64) != 0) {
                if ((i11 & 1572864) == 0) {
                    qVar2 = qVar;
                    if (lVarV.K(qVar2)) {
                        i21 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i21 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i21;
                }
                if ((i13 & 599187) == 599186) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f1111111116 = 0;
                            jA = w4.i.a(h.g(f1111111116), h.g(f1111111116));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    } else {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f1111111117 = 0;
                            jA = w4.i.a(h.g(f1111111117), h.g(f1111111117));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                    }
                    objI = lVarV.I();
                    companion = l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = new u0(Boolean.FALSE);
                        lVarV.B(objI);
                    }
                    u0Var = (u0) objI;
                    u0Var.h(Boolean.valueOf(z12));
                    if (((Boolean) u0Var.a()).booleanValue()) {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar1111111112 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i21111111110 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1111111112, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21111111110 & 112) | 3072 | ((i21111111110 >> 9) & 896), 0);
                        lVarV.l();
                    } else {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar1111111113 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i21111111111 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1111111113, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21111111111 & 112) | 3072 | ((i21111111111 >> 9) & 896), 0);
                        lVarV.l();
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    sVar4 = sVar3;
                    oVar3 = oVar2;
                    dVar4 = dVar3;
                    j13 = j12;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f1111111118 = 0;
                            jA = w4.i.a(h.g(f1111111118), h.g(f1111111118));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    } else {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f1111111119 = 0;
                            jA = w4.i.a(h.g(f1111111119), h.g(f1111111119));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                    }
                    objI = lVarV.I();
                    companion = l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = new u0(Boolean.FALSE);
                        lVarV.B(objI);
                    }
                    u0Var = (u0) objI;
                    u0Var.h(Boolean.valueOf(z12));
                    if (((Boolean) u0Var.a()).booleanValue()) {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar1111111114 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i21111111112 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1111111114, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21111111112 & 112) | 3072 | ((i21111111112 >> 9) & 896), 0);
                        lVarV.l();
                    } else {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar1111111115 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i21111111113 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1111111115, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21111111113 & 112) | 3072 | ((i21111111113 >> 9) & 896), 0);
                        lVarV.l();
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    sVar4 = sVar3;
                    oVar3 = oVar2;
                    dVar4 = dVar3;
                    j13 = j12;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(z12, aVar, dVar4, j13, oVar3, sVar4, qVar, i11, i12));
                }
            }
            i13 |= 1572864;
            qVar2 = qVar;
            if ((i13 & 599187) == 599186) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i14 != 0) {
                        dVar2 = d.INSTANCE;
                    }
                    if (i16 != 0) {
                        float f11111111110 = 0;
                        jA = w4.i.a(h.g(f11111111110), h.g(f11111111110));
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        oVarA = m.a(0, lVarV, 0, 1);
                    }
                    if (i18 != 0) {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                    } else {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = sVar2;
                    }
                } else {
                    if (i14 != 0) {
                        dVar2 = d.INSTANCE;
                    }
                    if (i16 != 0) {
                        float f11111111111 = 0;
                        jA = w4.i.a(h.g(f11111111111), h.g(f11111111111));
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        oVarA = m.a(0, lVarV, 0, 1);
                    }
                    if (i18 != 0) {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                    } else {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = sVar2;
                    }
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                }
                objI = lVarV.I();
                companion = l.INSTANCE;
                if (objI == companion.a()) {
                    objI = new u0(Boolean.FALSE);
                    lVarV.B(objI);
                }
                u0Var = (u0) objI;
                u0Var.h(Boolean.valueOf(z12));
                if (((Boolean) u0Var.a()).booleanValue()) {
                    lVarV.o(1380883942);
                    objI2 = lVarV.I();
                    if (objI2 == companion.a()) {
                        objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                        lVarV.B(objI2);
                    }
                    p1Var = (p1) objI2;
                    w4.d dVar1111111116 = (w4.d) lVarV.U(z0.g());
                    objI3 = lVarV.I();
                    if (objI3 == companion.a()) {
                        objI3 = new c(p1Var);
                        lVarV.B(objI3);
                    }
                    int i21111111114 = i13;
                    androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1111111116, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21111111114 & 112) | 3072 | ((i21111111114 >> 9) & 896), 0);
                    lVarV.l();
                } else {
                    lVarV.o(1380883942);
                    objI2 = lVarV.I();
                    if (objI2 == companion.a()) {
                        objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                        lVarV.B(objI2);
                    }
                    p1Var = (p1) objI2;
                    w4.d dVar1111111117 = (w4.d) lVarV.U(z0.g());
                    objI3 = lVarV.I();
                    if (objI3 == companion.a()) {
                        objI3 = new c(p1Var);
                        lVarV.B(objI3);
                    }
                    int i21111111115 = i13;
                    androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1111111117, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21111111115 & 112) | 3072 | ((i21111111115 >> 9) & 896), 0);
                    lVarV.l();
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                sVar4 = sVar3;
                oVar3 = oVar2;
                dVar4 = dVar3;
                j13 = j12;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i14 != 0) {
                        dVar2 = d.INSTANCE;
                    }
                    if (i16 != 0) {
                        float f11111111112 = 0;
                        jA = w4.i.a(h.g(f11111111112), h.g(f11111111112));
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        oVarA = m.a(0, lVarV, 0, 1);
                    }
                    if (i18 != 0) {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                    } else {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = sVar2;
                    }
                } else {
                    if (i14 != 0) {
                        dVar2 = d.INSTANCE;
                    }
                    if (i16 != 0) {
                        float f11111111113 = 0;
                        jA = w4.i.a(h.g(f11111111113), h.g(f11111111113));
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        oVarA = m.a(0, lVarV, 0, 1);
                    }
                    if (i18 != 0) {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                    } else {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = sVar2;
                    }
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                }
                objI = lVarV.I();
                companion = l.INSTANCE;
                if (objI == companion.a()) {
                    objI = new u0(Boolean.FALSE);
                    lVarV.B(objI);
                }
                u0Var = (u0) objI;
                u0Var.h(Boolean.valueOf(z12));
                if (((Boolean) u0Var.a()).booleanValue()) {
                    lVarV.o(1380883942);
                    objI2 = lVarV.I();
                    if (objI2 == companion.a()) {
                        objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                        lVarV.B(objI2);
                    }
                    p1Var = (p1) objI2;
                    w4.d dVar1111111118 = (w4.d) lVarV.U(z0.g());
                    objI3 = lVarV.I();
                    if (objI3 == companion.a()) {
                        objI3 = new c(p1Var);
                        lVarV.B(objI3);
                    }
                    int i21111111116 = i13;
                    androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1111111118, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21111111116 & 112) | 3072 | ((i21111111116 >> 9) & 896), 0);
                    lVarV.l();
                } else {
                    lVarV.o(1380883942);
                    objI2 = lVarV.I();
                    if (objI2 == companion.a()) {
                        objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                        lVarV.B(objI2);
                    }
                    p1Var = (p1) objI2;
                    w4.d dVar1111111119 = (w4.d) lVarV.U(z0.g());
                    objI3 = lVarV.I();
                    if (objI3 == companion.a()) {
                        objI3 = new c(p1Var);
                        lVarV.B(objI3);
                    }
                    int i21111111117 = i13;
                    androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1111111119, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21111111117 & 112) | 3072 | ((i21111111117 >> 9) & 896), 0);
                    lVarV.l();
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                sVar4 = sVar3;
                oVar3 = oVar2;
                dVar4 = dVar3;
                j13 = j12;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(z12, aVar, dVar4, j13, oVar3, sVar4, qVar, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        dVar2 = dVar;
        i16 = i12 & 8;
        if (i16 != 0) {
            if ((i11 & 3072) == 0) {
                jA = j11;
                if (lVarV.s(jA)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i13 |= i17;
            }
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    oVarA = oVar;
                    if (lVarV.n(oVarA)) {
                        i22 = 16384;
                    }
                    i13 |= i22;
                } else {
                    oVarA = oVar;
                }
                i22 = PKIFailureInfo.certRevoked;
                i13 |= i22;
            } else {
                oVarA = oVar;
            }
            i18 = i12 & 32;
            if (i18 != 0) {
                if ((196608 & i11) == 0) {
                    sVar2 = sVar;
                    if (lVarV.n(sVar2)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                if ((i12 & 64) != 0) {
                    if ((i11 & 1572864) == 0) {
                        qVar2 = qVar;
                        if (lVarV.K(qVar2)) {
                            i21 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i21 = PKIFailureInfo.signerNotTrusted;
                        }
                        i13 |= i21;
                    }
                    if ((i13 & 599187) == 599186) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f11111111114 = 0;
                                jA = w4.i.a(h.g(f11111111114), h.g(f11111111114));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        } else {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f11111111115 = 0;
                                jA = w4.i.a(h.g(f11111111115), h.g(f11111111115));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        }
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                        }
                        objI = lVarV.I();
                        companion = l.INSTANCE;
                        if (objI == companion.a()) {
                            objI = new u0(Boolean.FALSE);
                            lVarV.B(objI);
                        }
                        u0Var = (u0) objI;
                        u0Var.h(Boolean.valueOf(z12));
                        if (((Boolean) u0Var.a()).booleanValue()) {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar11111111110 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i21111111118 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar11111111110, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21111111118 & 112) | 3072 | ((i21111111118 >> 9) & 896), 0);
                            lVarV.l();
                        } else {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar11111111111 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i21111111119 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar11111111111, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21111111119 & 112) | 3072 | ((i21111111119 >> 9) & 896), 0);
                            lVarV.l();
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        sVar4 = sVar3;
                        oVar3 = oVar2;
                        dVar4 = dVar3;
                        j13 = j12;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f11111111116 = 0;
                                jA = w4.i.a(h.g(f11111111116), h.g(f11111111116));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        } else {
                            if (i14 != 0) {
                                dVar2 = d.INSTANCE;
                            }
                            if (i16 != 0) {
                                float f11111111117 = 0;
                                jA = w4.i.a(h.g(f11111111117), h.g(f11111111117));
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                oVarA = m.a(0, lVarV, 0, 1);
                            }
                            if (i18 != 0) {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                            } else {
                                dVar3 = dVar2;
                                j12 = jA;
                                oVar2 = oVarA;
                                sVar3 = sVar2;
                            }
                        }
                        lVarV.C();
                        if (p020r2.o.J()) {
                            p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                        }
                        objI = lVarV.I();
                        companion = l.INSTANCE;
                        if (objI == companion.a()) {
                            objI = new u0(Boolean.FALSE);
                            lVarV.B(objI);
                        }
                        u0Var = (u0) objI;
                        u0Var.h(Boolean.valueOf(z12));
                        if (((Boolean) u0Var.a()).booleanValue()) {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar11111111112 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i211111111110 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar11111111112, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i211111111110 & 112) | 3072 | ((i211111111110 >> 9) & 896), 0);
                            lVarV.l();
                        } else {
                            lVarV.o(1380883942);
                            objI2 = lVarV.I();
                            if (objI2 == companion.a()) {
                                objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                                lVarV.B(objI2);
                            }
                            p1Var = (p1) objI2;
                            w4.d dVar11111111113 = (w4.d) lVarV.U(z0.g());
                            objI3 = lVarV.I();
                            if (objI3 == companion.a()) {
                                objI3 = new c(p1Var);
                                lVarV.B(objI3);
                            }
                            int i211111111111 = i13;
                            androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar11111111113, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i211111111111 & 112) | 3072 | ((i211111111111 >> 9) & 896), 0);
                            lVarV.l();
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        sVar4 = sVar3;
                        oVar3 = oVar2;
                        dVar4 = dVar3;
                        j13 = j12;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(z12, aVar, dVar4, j13, oVar3, sVar4, qVar, i11, i12));
                    }
                }
                i13 |= 1572864;
                qVar2 = qVar;
                if ((i13 & 599187) == 599186) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f11111111118 = 0;
                            jA = w4.i.a(h.g(f11111111118), h.g(f11111111118));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    } else {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f11111111119 = 0;
                            jA = w4.i.a(h.g(f11111111119), h.g(f11111111119));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                    }
                    objI = lVarV.I();
                    companion = l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = new u0(Boolean.FALSE);
                        lVarV.B(objI);
                    }
                    u0Var = (u0) objI;
                    u0Var.h(Boolean.valueOf(z12));
                    if (((Boolean) u0Var.a()).booleanValue()) {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar11111111114 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i211111111112 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar11111111114, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i211111111112 & 112) | 3072 | ((i211111111112 >> 9) & 896), 0);
                        lVarV.l();
                    } else {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar11111111115 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i211111111113 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar11111111115, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i211111111113 & 112) | 3072 | ((i211111111113 >> 9) & 896), 0);
                        lVarV.l();
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    sVar4 = sVar3;
                    oVar3 = oVar2;
                    dVar4 = dVar3;
                    j13 = j12;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f111111111110 = 0;
                            jA = w4.i.a(h.g(f111111111110), h.g(f111111111110));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    } else {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f111111111111 = 0;
                            jA = w4.i.a(h.g(f111111111111), h.g(f111111111111));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                    }
                    objI = lVarV.I();
                    companion = l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = new u0(Boolean.FALSE);
                        lVarV.B(objI);
                    }
                    u0Var = (u0) objI;
                    u0Var.h(Boolean.valueOf(z12));
                    if (((Boolean) u0Var.a()).booleanValue()) {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar11111111116 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i211111111114 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar11111111116, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i211111111114 & 112) | 3072 | ((i211111111114 >> 9) & 896), 0);
                        lVarV.l();
                    } else {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar11111111117 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i211111111115 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar11111111117, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i211111111115 & 112) | 3072 | ((i211111111115 >> 9) & 896), 0);
                        lVarV.l();
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    sVar4 = sVar3;
                    oVar3 = oVar2;
                    dVar4 = dVar3;
                    j13 = j12;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(z12, aVar, dVar4, j13, oVar3, sVar4, qVar, i11, i12));
                }
            }
            i13 |= 196608;
            sVar2 = sVar;
            if ((i12 & 64) != 0) {
                if ((i11 & 1572864) == 0) {
                    qVar2 = qVar;
                    if (lVarV.K(qVar2)) {
                        i21 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i21 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i21;
                }
                if ((i13 & 599187) == 599186) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f111111111112 = 0;
                            jA = w4.i.a(h.g(f111111111112), h.g(f111111111112));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    } else {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f111111111113 = 0;
                            jA = w4.i.a(h.g(f111111111113), h.g(f111111111113));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                    }
                    objI = lVarV.I();
                    companion = l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = new u0(Boolean.FALSE);
                        lVarV.B(objI);
                    }
                    u0Var = (u0) objI;
                    u0Var.h(Boolean.valueOf(z12));
                    if (((Boolean) u0Var.a()).booleanValue()) {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar11111111118 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i211111111116 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar11111111118, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i211111111116 & 112) | 3072 | ((i211111111116 >> 9) & 896), 0);
                        lVarV.l();
                    } else {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar11111111119 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i211111111117 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar11111111119, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i211111111117 & 112) | 3072 | ((i211111111117 >> 9) & 896), 0);
                        lVarV.l();
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    sVar4 = sVar3;
                    oVar3 = oVar2;
                    dVar4 = dVar3;
                    j13 = j12;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f111111111114 = 0;
                            jA = w4.i.a(h.g(f111111111114), h.g(f111111111114));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    } else {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f111111111115 = 0;
                            jA = w4.i.a(h.g(f111111111115), h.g(f111111111115));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                    }
                    objI = lVarV.I();
                    companion = l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = new u0(Boolean.FALSE);
                        lVarV.B(objI);
                    }
                    u0Var = (u0) objI;
                    u0Var.h(Boolean.valueOf(z12));
                    if (((Boolean) u0Var.a()).booleanValue()) {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar111111111110 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i211111111118 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar111111111110, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i211111111118 & 112) | 3072 | ((i211111111118 >> 9) & 896), 0);
                        lVarV.l();
                    } else {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar111111111111 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i211111111119 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar111111111111, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i211111111119 & 112) | 3072 | ((i211111111119 >> 9) & 896), 0);
                        lVarV.l();
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    sVar4 = sVar3;
                    oVar3 = oVar2;
                    dVar4 = dVar3;
                    j13 = j12;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(z12, aVar, dVar4, j13, oVar3, sVar4, qVar, i11, i12));
                }
            }
            i13 |= 1572864;
            qVar2 = qVar;
            if ((i13 & 599187) == 599186) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i14 != 0) {
                        dVar2 = d.INSTANCE;
                    }
                    if (i16 != 0) {
                        float f111111111116 = 0;
                        jA = w4.i.a(h.g(f111111111116), h.g(f111111111116));
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        oVarA = m.a(0, lVarV, 0, 1);
                    }
                    if (i18 != 0) {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                    } else {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = sVar2;
                    }
                } else {
                    if (i14 != 0) {
                        dVar2 = d.INSTANCE;
                    }
                    if (i16 != 0) {
                        float f111111111117 = 0;
                        jA = w4.i.a(h.g(f111111111117), h.g(f111111111117));
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        oVarA = m.a(0, lVarV, 0, 1);
                    }
                    if (i18 != 0) {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                    } else {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = sVar2;
                    }
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                }
                objI = lVarV.I();
                companion = l.INSTANCE;
                if (objI == companion.a()) {
                    objI = new u0(Boolean.FALSE);
                    lVarV.B(objI);
                }
                u0Var = (u0) objI;
                u0Var.h(Boolean.valueOf(z12));
                if (((Boolean) u0Var.a()).booleanValue()) {
                    lVarV.o(1380883942);
                    objI2 = lVarV.I();
                    if (objI2 == companion.a()) {
                        objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                        lVarV.B(objI2);
                    }
                    p1Var = (p1) objI2;
                    w4.d dVar111111111112 = (w4.d) lVarV.U(z0.g());
                    objI3 = lVarV.I();
                    if (objI3 == companion.a()) {
                        objI3 = new c(p1Var);
                        lVarV.B(objI3);
                    }
                    int i2111111111110 = i13;
                    androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar111111111112, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2111111111110 & 112) | 3072 | ((i2111111111110 >> 9) & 896), 0);
                    lVarV.l();
                } else {
                    lVarV.o(1380883942);
                    objI2 = lVarV.I();
                    if (objI2 == companion.a()) {
                        objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                        lVarV.B(objI2);
                    }
                    p1Var = (p1) objI2;
                    w4.d dVar111111111113 = (w4.d) lVarV.U(z0.g());
                    objI3 = lVarV.I();
                    if (objI3 == companion.a()) {
                        objI3 = new c(p1Var);
                        lVarV.B(objI3);
                    }
                    int i2111111111111 = i13;
                    androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar111111111113, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2111111111111 & 112) | 3072 | ((i2111111111111 >> 9) & 896), 0);
                    lVarV.l();
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                sVar4 = sVar3;
                oVar3 = oVar2;
                dVar4 = dVar3;
                j13 = j12;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i14 != 0) {
                        dVar2 = d.INSTANCE;
                    }
                    if (i16 != 0) {
                        float f111111111118 = 0;
                        jA = w4.i.a(h.g(f111111111118), h.g(f111111111118));
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        oVarA = m.a(0, lVarV, 0, 1);
                    }
                    if (i18 != 0) {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                    } else {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = sVar2;
                    }
                } else {
                    if (i14 != 0) {
                        dVar2 = d.INSTANCE;
                    }
                    if (i16 != 0) {
                        float f111111111119 = 0;
                        jA = w4.i.a(h.g(f111111111119), h.g(f111111111119));
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        oVarA = m.a(0, lVarV, 0, 1);
                    }
                    if (i18 != 0) {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                    } else {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = sVar2;
                    }
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                }
                objI = lVarV.I();
                companion = l.INSTANCE;
                if (objI == companion.a()) {
                    objI = new u0(Boolean.FALSE);
                    lVarV.B(objI);
                }
                u0Var = (u0) objI;
                u0Var.h(Boolean.valueOf(z12));
                if (((Boolean) u0Var.a()).booleanValue()) {
                    lVarV.o(1380883942);
                    objI2 = lVarV.I();
                    if (objI2 == companion.a()) {
                        objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                        lVarV.B(objI2);
                    }
                    p1Var = (p1) objI2;
                    w4.d dVar111111111114 = (w4.d) lVarV.U(z0.g());
                    objI3 = lVarV.I();
                    if (objI3 == companion.a()) {
                        objI3 = new c(p1Var);
                        lVarV.B(objI3);
                    }
                    int i2111111111112 = i13;
                    androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar111111111114, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2111111111112 & 112) | 3072 | ((i2111111111112 >> 9) & 896), 0);
                    lVarV.l();
                } else {
                    lVarV.o(1380883942);
                    objI2 = lVarV.I();
                    if (objI2 == companion.a()) {
                        objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                        lVarV.B(objI2);
                    }
                    p1Var = (p1) objI2;
                    w4.d dVar111111111115 = (w4.d) lVarV.U(z0.g());
                    objI3 = lVarV.I();
                    if (objI3 == companion.a()) {
                        objI3 = new c(p1Var);
                        lVarV.B(objI3);
                    }
                    int i2111111111113 = i13;
                    androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar111111111115, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2111111111113 & 112) | 3072 | ((i2111111111113 >> 9) & 896), 0);
                    lVarV.l();
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                sVar4 = sVar3;
                oVar3 = oVar2;
                dVar4 = dVar3;
                j13 = j12;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(z12, aVar, dVar4, j13, oVar3, sVar4, qVar, i11, i12));
            }
        }
        i13 |= 3072;
        jA = j11;
        if ((i11 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                oVarA = oVar;
                if (lVarV.n(oVarA)) {
                    i22 = 16384;
                }
                i13 |= i22;
            } else {
                oVarA = oVar;
            }
            i22 = PKIFailureInfo.certRevoked;
            i13 |= i22;
        } else {
            oVarA = oVar;
        }
        i18 = i12 & 32;
        if (i18 != 0) {
            if ((196608 & i11) == 0) {
                sVar2 = sVar;
                if (lVarV.n(sVar2)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i13 |= i19;
            }
            if ((i12 & 64) != 0) {
                if ((i11 & 1572864) == 0) {
                    qVar2 = qVar;
                    if (lVarV.K(qVar2)) {
                        i21 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i21 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i21;
                }
                if ((i13 & 599187) == 599186) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f1111111111110 = 0;
                            jA = w4.i.a(h.g(f1111111111110), h.g(f1111111111110));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    } else {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f1111111111111 = 0;
                            jA = w4.i.a(h.g(f1111111111111), h.g(f1111111111111));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                    }
                    objI = lVarV.I();
                    companion = l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = new u0(Boolean.FALSE);
                        lVarV.B(objI);
                    }
                    u0Var = (u0) objI;
                    u0Var.h(Boolean.valueOf(z12));
                    if (((Boolean) u0Var.a()).booleanValue()) {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar111111111116 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i2111111111114 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar111111111116, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2111111111114 & 112) | 3072 | ((i2111111111114 >> 9) & 896), 0);
                        lVarV.l();
                    } else {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar111111111117 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i2111111111115 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar111111111117, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2111111111115 & 112) | 3072 | ((i2111111111115 >> 9) & 896), 0);
                        lVarV.l();
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    sVar4 = sVar3;
                    oVar3 = oVar2;
                    dVar4 = dVar3;
                    j13 = j12;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f1111111111112 = 0;
                            jA = w4.i.a(h.g(f1111111111112), h.g(f1111111111112));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    } else {
                        if (i14 != 0) {
                            dVar2 = d.INSTANCE;
                        }
                        if (i16 != 0) {
                            float f1111111111113 = 0;
                            jA = w4.i.a(h.g(f1111111111113), h.g(f1111111111113));
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            oVarA = m.a(0, lVarV, 0, 1);
                        }
                        if (i18 != 0) {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                        } else {
                            dVar3 = dVar2;
                            j12 = jA;
                            oVar2 = oVarA;
                            sVar3 = sVar2;
                        }
                    }
                    lVarV.C();
                    if (p020r2.o.J()) {
                        p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                    }
                    objI = lVarV.I();
                    companion = l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = new u0(Boolean.FALSE);
                        lVarV.B(objI);
                    }
                    u0Var = (u0) objI;
                    u0Var.h(Boolean.valueOf(z12));
                    if (((Boolean) u0Var.a()).booleanValue()) {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar111111111118 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i2111111111116 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar111111111118, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2111111111116 & 112) | 3072 | ((i2111111111116 >> 9) & 896), 0);
                        lVarV.l();
                    } else {
                        lVarV.o(1380883942);
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                            lVarV.B(objI2);
                        }
                        p1Var = (p1) objI2;
                        w4.d dVar111111111119 = (w4.d) lVarV.U(z0.g());
                        objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c(p1Var);
                            lVarV.B(objI3);
                        }
                        int i2111111111117 = i13;
                        androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar111111111119, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2111111111117 & 112) | 3072 | ((i2111111111117 >> 9) & 896), 0);
                        lVarV.l();
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    sVar4 = sVar3;
                    oVar3 = oVar2;
                    dVar4 = dVar3;
                    j13 = j12;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(z12, aVar, dVar4, j13, oVar3, sVar4, qVar, i11, i12));
                }
            }
            i13 |= 1572864;
            qVar2 = qVar;
            if ((i13 & 599187) == 599186) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i14 != 0) {
                        dVar2 = d.INSTANCE;
                    }
                    if (i16 != 0) {
                        float f1111111111114 = 0;
                        jA = w4.i.a(h.g(f1111111111114), h.g(f1111111111114));
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        oVarA = m.a(0, lVarV, 0, 1);
                    }
                    if (i18 != 0) {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                    } else {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = sVar2;
                    }
                } else {
                    if (i14 != 0) {
                        dVar2 = d.INSTANCE;
                    }
                    if (i16 != 0) {
                        float f1111111111115 = 0;
                        jA = w4.i.a(h.g(f1111111111115), h.g(f1111111111115));
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        oVarA = m.a(0, lVarV, 0, 1);
                    }
                    if (i18 != 0) {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                    } else {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = sVar2;
                    }
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                }
                objI = lVarV.I();
                companion = l.INSTANCE;
                if (objI == companion.a()) {
                    objI = new u0(Boolean.FALSE);
                    lVarV.B(objI);
                }
                u0Var = (u0) objI;
                u0Var.h(Boolean.valueOf(z12));
                if (((Boolean) u0Var.a()).booleanValue()) {
                    lVarV.o(1380883942);
                    objI2 = lVarV.I();
                    if (objI2 == companion.a()) {
                        objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                        lVarV.B(objI2);
                    }
                    p1Var = (p1) objI2;
                    w4.d dVar1111111111110 = (w4.d) lVarV.U(z0.g());
                    objI3 = lVarV.I();
                    if (objI3 == companion.a()) {
                        objI3 = new c(p1Var);
                        lVarV.B(objI3);
                    }
                    int i2111111111118 = i13;
                    androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1111111111110, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2111111111118 & 112) | 3072 | ((i2111111111118 >> 9) & 896), 0);
                    lVarV.l();
                } else {
                    lVarV.o(1380883942);
                    objI2 = lVarV.I();
                    if (objI2 == companion.a()) {
                        objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                        lVarV.B(objI2);
                    }
                    p1Var = (p1) objI2;
                    w4.d dVar1111111111111 = (w4.d) lVarV.U(z0.g());
                    objI3 = lVarV.I();
                    if (objI3 == companion.a()) {
                        objI3 = new c(p1Var);
                        lVarV.B(objI3);
                    }
                    int i2111111111119 = i13;
                    androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1111111111111, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i2111111111119 & 112) | 3072 | ((i2111111111119 >> 9) & 896), 0);
                    lVarV.l();
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                sVar4 = sVar3;
                oVar3 = oVar2;
                dVar4 = dVar3;
                j13 = j12;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i14 != 0) {
                        dVar2 = d.INSTANCE;
                    }
                    if (i16 != 0) {
                        float f1111111111116 = 0;
                        jA = w4.i.a(h.g(f1111111111116), h.g(f1111111111116));
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        oVarA = m.a(0, lVarV, 0, 1);
                    }
                    if (i18 != 0) {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                    } else {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = sVar2;
                    }
                } else {
                    if (i14 != 0) {
                        dVar2 = d.INSTANCE;
                    }
                    if (i16 != 0) {
                        float f1111111111117 = 0;
                        jA = w4.i.a(h.g(f1111111111117), h.g(f1111111111117));
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        oVarA = m.a(0, lVarV, 0, 1);
                    }
                    if (i18 != 0) {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                    } else {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = sVar2;
                    }
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                }
                objI = lVarV.I();
                companion = l.INSTANCE;
                if (objI == companion.a()) {
                    objI = new u0(Boolean.FALSE);
                    lVarV.B(objI);
                }
                u0Var = (u0) objI;
                u0Var.h(Boolean.valueOf(z12));
                if (((Boolean) u0Var.a()).booleanValue()) {
                    lVarV.o(1380883942);
                    objI2 = lVarV.I();
                    if (objI2 == companion.a()) {
                        objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                        lVarV.B(objI2);
                    }
                    p1Var = (p1) objI2;
                    w4.d dVar1111111111112 = (w4.d) lVarV.U(z0.g());
                    objI3 = lVarV.I();
                    if (objI3 == companion.a()) {
                        objI3 = new c(p1Var);
                        lVarV.B(objI3);
                    }
                    int i21111111111110 = i13;
                    androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1111111111112, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21111111111110 & 112) | 3072 | ((i21111111111110 >> 9) & 896), 0);
                    lVarV.l();
                } else {
                    lVarV.o(1380883942);
                    objI2 = lVarV.I();
                    if (objI2 == companion.a()) {
                        objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                        lVarV.B(objI2);
                    }
                    p1Var = (p1) objI2;
                    w4.d dVar1111111111113 = (w4.d) lVarV.U(z0.g());
                    objI3 = lVarV.I();
                    if (objI3 == companion.a()) {
                        objI3 = new c(p1Var);
                        lVarV.B(objI3);
                    }
                    int i21111111111111 = i13;
                    androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1111111111113, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21111111111111 & 112) | 3072 | ((i21111111111111 >> 9) & 896), 0);
                    lVarV.l();
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                sVar4 = sVar3;
                oVar3 = oVar2;
                dVar4 = dVar3;
                j13 = j12;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(z12, aVar, dVar4, j13, oVar3, sVar4, qVar, i11, i12));
            }
        }
        i13 |= 196608;
        sVar2 = sVar;
        if ((i12 & 64) != 0) {
            if ((i11 & 1572864) == 0) {
                qVar2 = qVar;
                if (lVarV.K(qVar2)) {
                    i21 = PKIFailureInfo.badCertTemplate;
                } else {
                    i21 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i21;
            }
            if ((i13 & 599187) == 599186) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i14 != 0) {
                        dVar2 = d.INSTANCE;
                    }
                    if (i16 != 0) {
                        float f1111111111118 = 0;
                        jA = w4.i.a(h.g(f1111111111118), h.g(f1111111111118));
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        oVarA = m.a(0, lVarV, 0, 1);
                    }
                    if (i18 != 0) {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                    } else {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = sVar2;
                    }
                } else {
                    if (i14 != 0) {
                        dVar2 = d.INSTANCE;
                    }
                    if (i16 != 0) {
                        float f1111111111119 = 0;
                        jA = w4.i.a(h.g(f1111111111119), h.g(f1111111111119));
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        oVarA = m.a(0, lVarV, 0, 1);
                    }
                    if (i18 != 0) {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                    } else {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = sVar2;
                    }
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                }
                objI = lVarV.I();
                companion = l.INSTANCE;
                if (objI == companion.a()) {
                    objI = new u0(Boolean.FALSE);
                    lVarV.B(objI);
                }
                u0Var = (u0) objI;
                u0Var.h(Boolean.valueOf(z12));
                if (((Boolean) u0Var.a()).booleanValue()) {
                    lVarV.o(1380883942);
                    objI2 = lVarV.I();
                    if (objI2 == companion.a()) {
                        objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                        lVarV.B(objI2);
                    }
                    p1Var = (p1) objI2;
                    w4.d dVar1111111111114 = (w4.d) lVarV.U(z0.g());
                    objI3 = lVarV.I();
                    if (objI3 == companion.a()) {
                        objI3 = new c(p1Var);
                        lVarV.B(objI3);
                    }
                    int i21111111111112 = i13;
                    androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1111111111114, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21111111111112 & 112) | 3072 | ((i21111111111112 >> 9) & 896), 0);
                    lVarV.l();
                } else {
                    lVarV.o(1380883942);
                    objI2 = lVarV.I();
                    if (objI2 == companion.a()) {
                        objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                        lVarV.B(objI2);
                    }
                    p1Var = (p1) objI2;
                    w4.d dVar1111111111115 = (w4.d) lVarV.U(z0.g());
                    objI3 = lVarV.I();
                    if (objI3 == companion.a()) {
                        objI3 = new c(p1Var);
                        lVarV.B(objI3);
                    }
                    int i21111111111113 = i13;
                    androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1111111111115, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21111111111113 & 112) | 3072 | ((i21111111111113 >> 9) & 896), 0);
                    lVarV.l();
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                sVar4 = sVar3;
                oVar3 = oVar2;
                dVar4 = dVar3;
                j13 = j12;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i14 != 0) {
                        dVar2 = d.INSTANCE;
                    }
                    if (i16 != 0) {
                        float f11111111111110 = 0;
                        jA = w4.i.a(h.g(f11111111111110), h.g(f11111111111110));
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        oVarA = m.a(0, lVarV, 0, 1);
                    }
                    if (i18 != 0) {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                    } else {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = sVar2;
                    }
                } else {
                    if (i14 != 0) {
                        dVar2 = d.INSTANCE;
                    }
                    if (i16 != 0) {
                        float f11111111111111 = 0;
                        jA = w4.i.a(h.g(f11111111111111), h.g(f11111111111111));
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        oVarA = m.a(0, lVarV, 0, 1);
                    }
                    if (i18 != 0) {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                    } else {
                        dVar3 = dVar2;
                        j12 = jA;
                        oVar2 = oVarA;
                        sVar3 = sVar2;
                    }
                }
                lVarV.C();
                if (p020r2.o.J()) {
                    p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
                }
                objI = lVarV.I();
                companion = l.INSTANCE;
                if (objI == companion.a()) {
                    objI = new u0(Boolean.FALSE);
                    lVarV.B(objI);
                }
                u0Var = (u0) objI;
                u0Var.h(Boolean.valueOf(z12));
                if (((Boolean) u0Var.a()).booleanValue()) {
                    lVarV.o(1380883942);
                    objI2 = lVarV.I();
                    if (objI2 == companion.a()) {
                        objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                        lVarV.B(objI2);
                    }
                    p1Var = (p1) objI2;
                    w4.d dVar1111111111116 = (w4.d) lVarV.U(z0.g());
                    objI3 = lVarV.I();
                    if (objI3 == companion.a()) {
                        objI3 = new c(p1Var);
                        lVarV.B(objI3);
                    }
                    int i21111111111114 = i13;
                    androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1111111111116, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21111111111114 & 112) | 3072 | ((i21111111111114 >> 9) & 896), 0);
                    lVarV.l();
                } else {
                    lVarV.o(1380883942);
                    objI2 = lVarV.I();
                    if (objI2 == companion.a()) {
                        objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                        lVarV.B(objI2);
                    }
                    p1Var = (p1) objI2;
                    w4.d dVar1111111111117 = (w4.d) lVarV.U(z0.g());
                    objI3 = lVarV.I();
                    if (objI3 == companion.a()) {
                        objI3 = new c(p1Var);
                        lVarV.B(objI3);
                    }
                    int i21111111111115 = i13;
                    androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1111111111117, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21111111111115 & 112) | 3072 | ((i21111111111115 >> 9) & 896), 0);
                    lVarV.l();
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                sVar4 = sVar3;
                oVar3 = oVar2;
                dVar4 = dVar3;
                j13 = j12;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(z12, aVar, dVar4, j13, oVar3, sVar4, qVar, i11, i12));
            }
        }
        i13 |= 1572864;
        qVar2 = qVar;
        if ((i13 & 599187) == 599186) {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i14 != 0) {
                    dVar2 = d.INSTANCE;
                }
                if (i16 != 0) {
                    float f11111111111112 = 0;
                    jA = w4.i.a(h.g(f11111111111112), h.g(f11111111111112));
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    oVarA = m.a(0, lVarV, 0, 1);
                }
                if (i18 != 0) {
                    dVar3 = dVar2;
                    j12 = jA;
                    oVar2 = oVarA;
                    sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                } else {
                    dVar3 = dVar2;
                    j12 = jA;
                    oVar2 = oVarA;
                    sVar3 = sVar2;
                }
            } else {
                if (i14 != 0) {
                    dVar2 = d.INSTANCE;
                }
                if (i16 != 0) {
                    float f11111111111113 = 0;
                    jA = w4.i.a(h.g(f11111111111113), h.g(f11111111111113));
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    oVarA = m.a(0, lVarV, 0, 1);
                }
                if (i18 != 0) {
                    dVar3 = dVar2;
                    j12 = jA;
                    oVar2 = oVarA;
                    sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                } else {
                    dVar3 = dVar2;
                    j12 = jA;
                    oVar2 = oVarA;
                    sVar3 = sVar2;
                }
            }
            lVarV.C();
            if (p020r2.o.J()) {
                p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
            }
            objI = lVarV.I();
            companion = l.INSTANCE;
            if (objI == companion.a()) {
                objI = new u0(Boolean.FALSE);
                lVarV.B(objI);
            }
            u0Var = (u0) objI;
            u0Var.h(Boolean.valueOf(z12));
            if (((Boolean) u0Var.a()).booleanValue()) {
                lVarV.o(1380883942);
                objI2 = lVarV.I();
                if (objI2 == companion.a()) {
                    objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                    lVarV.B(objI2);
                }
                p1Var = (p1) objI2;
                w4.d dVar1111111111118 = (w4.d) lVarV.U(z0.g());
                objI3 = lVarV.I();
                if (objI3 == companion.a()) {
                    objI3 = new c(p1Var);
                    lVarV.B(objI3);
                }
                int i21111111111116 = i13;
                androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1111111111118, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21111111111116 & 112) | 3072 | ((i21111111111116 >> 9) & 896), 0);
                lVarV.l();
            } else {
                lVarV.o(1380883942);
                objI2 = lVarV.I();
                if (objI2 == companion.a()) {
                    objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                    lVarV.B(objI2);
                }
                p1Var = (p1) objI2;
                w4.d dVar1111111111119 = (w4.d) lVarV.U(z0.g());
                objI3 = lVarV.I();
                if (objI3 == companion.a()) {
                    objI3 = new c(p1Var);
                    lVarV.B(objI3);
                }
                int i21111111111117 = i13;
                androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar1111111111119, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21111111111117 & 112) | 3072 | ((i21111111111117 >> 9) & 896), 0);
                lVarV.l();
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            sVar4 = sVar3;
            oVar3 = oVar2;
            dVar4 = dVar3;
            j13 = j12;
        } else {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i14 != 0) {
                    dVar2 = d.INSTANCE;
                }
                if (i16 != 0) {
                    float f11111111111114 = 0;
                    jA = w4.i.a(h.g(f11111111111114), h.g(f11111111111114));
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    oVarA = m.a(0, lVarV, 0, 1);
                }
                if (i18 != 0) {
                    dVar3 = dVar2;
                    j12 = jA;
                    oVar2 = oVarA;
                    sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                } else {
                    dVar3 = dVar2;
                    j12 = jA;
                    oVar2 = oVarA;
                    sVar3 = sVar2;
                }
            } else {
                if (i14 != 0) {
                    dVar2 = d.INSTANCE;
                }
                if (i16 != 0) {
                    float f11111111111115 = 0;
                    jA = w4.i.a(h.g(f11111111111115), h.g(f11111111111115));
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    oVarA = m.a(0, lVarV, 0, 1);
                }
                if (i18 != 0) {
                    dVar3 = dVar2;
                    j12 = jA;
                    oVar2 = oVarA;
                    sVar3 = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);
                } else {
                    dVar3 = dVar2;
                    j12 = jA;
                    oVar2 = oVarA;
                    sVar3 = sVar2;
                }
            }
            lVarV.C();
            if (p020r2.o.J()) {
                p020r2.o.S(-2135362555, i13, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:119)");
            }
            objI = lVarV.I();
            companion = l.INSTANCE;
            if (objI == companion.a()) {
                objI = new u0(Boolean.FALSE);
                lVarV.B(objI);
            }
            u0Var = (u0) objI;
            u0Var.h(Boolean.valueOf(z12));
            if (((Boolean) u0Var.a()).booleanValue()) {
                lVarV.o(1380883942);
                objI2 = lVarV.I();
                if (objI2 == companion.a()) {
                    objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                    lVarV.B(objI2);
                }
                p1Var = (p1) objI2;
                w4.d dVar11111111111110 = (w4.d) lVarV.U(z0.g());
                objI3 = lVarV.I();
                if (objI3 == companion.a()) {
                    objI3 = new c(p1Var);
                    lVarV.B(objI3);
                }
                int i21111111111118 = i13;
                androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar11111111111110, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21111111111118 & 112) | 3072 | ((i21111111111118 >> 9) & 896), 0);
                lVarV.l();
            } else {
                lVarV.o(1380883942);
                objI2 = lVarV.I();
                if (objI2 == companion.a()) {
                    objI2 = s3.d(f.b(f.INSTANCE.a()), null, 2, null);
                    lVarV.B(objI2);
                }
                p1Var = (p1) objI2;
                w4.d dVar11111111111111 = (w4.d) lVarV.U(z0.g());
                objI3 = lVarV.I();
                if (objI3 == companion.a()) {
                    objI3 = new c(p1Var);
                    lVarV.B(objI3);
                }
                int i21111111111119 = i13;
                androidx.compose.ui.window.c.a(new DropdownMenuPositionProvider(j12, dVar11111111111111, (p) objI3, null), aVar, sVar3, z2.c.e(-47803778, true, new a(u0Var, p1Var, oVar2, dVar3, qVar2), lVarV, 54), lVarV, (i21111111111119 & 112) | 3072 | ((i21111111111119 >> 9) & 896), 0);
                lVarV.l();
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            sVar4 = sVar3;
            oVar3 = oVar2;
            dVar4 = dVar3;
            j13 = j12;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(z12, aVar, dVar4, j13, oVar3, sVar4, qVar, i11, i12));
        }
    }
}
