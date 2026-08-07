package q1;

import androidx.compose.ui.graphics.painter.BitmapPainter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.List;
import k3.i3;
import k3.q1;
import org.bouncycastle.crypto.CryptoServicesPermission;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p020r2.d4;
import p020r2.k2;
import p020r2.w2;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ab\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aU\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Lk3/i3;", "bitmap", "", "contentDescription", "Landroidx/compose/ui/d;", "modifier", "Ld3/c;", "alignment", "Lz3/k;", "contentScale", "", "alpha", "Lk3/q1;", "colorFilter", "Lk3/d3;", "filterQuality", "Ljn0/h0;", "b", "(Lk3/i3;Ljava/lang/String;Landroidx/compose/ui/d;Ld3/c;Lz3/k;FLk3/q1;ILr2/l;II)V", "Landroidx/compose/ui/graphics/painter/b;", PlaceTypes.PAINTER, "a", "(Landroidx/compose/ui/graphics/painter/b;Ljava/lang/String;Landroidx/compose/ui/d;Ld3/c;Lz3/k;FLk3/q1;Lr2/l;II)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.painter.b f104203c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f104204d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f104205e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ d3.c f104206f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ z3.k f104207g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f104208h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ q1 f104209i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f104210j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f104211k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.graphics.painter.b bVar, String str, androidx.compose.ui.d dVar, d3.c cVar, z3.k kVar, float f11, q1 q1Var, int i11, int i12) {
            super(2);
            this.f104203c = bVar;
            this.f104204d = str;
            this.f104205e = dVar;
            this.f104206f = cVar;
            this.f104207g = kVar;
            this.f104208h = f11;
            this.f104209i = q1Var;
            this.f104210j = i11;
            this.f104211k = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            b0.a(this.f104203c, this.f104204d, this.f104205e, this.f104206f, this.f104207g, this.f104208h, this.f104209i, lVar, k2.a(this.f104210j | 1), this.f104211k);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.l<g4.y, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f104212c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.f104212c = str;
        }

        public final void a(g4.y yVar) {
            g4.v.c0(yVar, this.f104212c);
            g4.v.k0(yVar, g4.i.INSTANCE.d());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(g4.y yVar) {
            a(yVar);
            return jn0.h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0129  */
    /* JADX WARN: Code duplicated, block: B:104:0x012b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0132  */
    /* JADX WARN: Code duplicated, block: B:109:0x013a  */
    /* JADX WARN: Code duplicated, block: B:111:0x014c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0185  */
    /* JADX WARN: Code duplicated, block: B:117:0x0191  */
    /* JADX WARN: Code duplicated, block: B:118:0x0195  */
    /* JADX WARN: Code duplicated, block: B:121:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:123:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:126:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x007e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x008d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:60:0x009a  */
    /* JADX WARN: Code duplicated, block: B:62:0x009d  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:94:0x0105  */
    /* JADX WARN: Code duplicated, block: B:95:0x0107  */
    /* JADX WARN: Code duplicated, block: B:98:0x010e  */
    public static final void a(androidx.compose.ui.graphics.painter.b bVar, String str, androidx.compose.ui.d dVar, d3.c cVar, z3.k kVar, float f11, q1 q1Var, p020r2.l lVar, int i11, int i12) {
        androidx.compose.ui.graphics.painter.b bVar2;
        int i13;
        androidx.compose.ui.d dVar2;
        int i14;
        d3.c cVarE;
        int i15;
        int i16;
        z3.k kVarE;
        int i17;
        int i18;
        float f12;
        int i19;
        int i21;
        q1 q1Var2;
        int i22;
        q1 q1Var3;
        androidx.compose.ui.d dVarD;
        int iA;
        wn0.a<b4.g> aVarA;
        p020r2.l lVarA;
        wn0.p<b4.g, Integer, jn0.h0> pVarB;
        d3.c cVar2;
        z3.k kVar2;
        q1 q1Var4;
        boolean z11;
        Object objI;
        androidx.compose.ui.d dVar3;
        float f13;
        w2 w2VarX;
        p020r2.l lVarV = lVar.v(1142754848);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
            bVar2 = bVar;
        } else {
            bVar2 = bVar;
            if ((i11 & 6) == 0) {
                i13 = (lVarV.K(bVar2) ? 4 : 2) | i11;
            } else {
                i13 = i11;
            }
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= lVarV.n(str) ? 32 : 16;
        }
        int i23 = i12 & 4;
        if (i23 == 0) {
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 256 : 128;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & 3072) == 0) {
                    cVarE = cVar;
                    if (lVarV.n(cVarE)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 16;
                if (i16 != 0) {
                    if ((i11 & 24576) == 0) {
                        kVarE = kVar;
                        if (lVarV.n(kVarE)) {
                            i17 = 16384;
                        } else {
                            i17 = PKIFailureInfo.certRevoked;
                        }
                        i13 |= i17;
                    }
                    i18 = i12 & 32;
                    if (i18 != 0) {
                        if ((196608 & i11) == 0) {
                            f12 = f11;
                            if (lVarV.q(f12)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i13 |= i19;
                        }
                        i21 = i12 & 64;
                        if (i21 != 0) {
                            i13 |= 1572864;
                            q1Var2 = q1Var;
                        } else {
                            q1Var2 = q1Var;
                            if ((i11 & 1572864) == 0) {
                                if (lVarV.n(q1Var2)) {
                                    i22 = PKIFailureInfo.badCertTemplate;
                                } else {
                                    i22 = PKIFailureInfo.signerNotTrusted;
                                }
                                i13 |= i22;
                            }
                        }
                        if ((i13 & 599187) == 599186 || !lVarV.b()) {
                            if (i23 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                cVarE = d3.c.INSTANCE.e();
                            }
                            if (i16 != 0) {
                                kVarE = z3.k.INSTANCE.e();
                            }
                            if (i18 != 0) {
                                f12 = 1.0f;
                            }
                            if (i21 != 0) {
                                q1Var3 = null;
                            } else {
                                q1Var3 = q1Var2;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(1142754848, i13, -1, "androidx.compose.foundation.Image (Image.kt:243)");
                            }
                            if (str != null) {
                                lVarV.o(1040258775);
                                androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
                                if ((i13 & 112) == 32) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                objI = lVarV.I();
                                if (z11 || objI == p020r2.l.INSTANCE.a()) {
                                    objI = new c(str);
                                    lVarV.B(objI);
                                }
                                dVarD = g4.o.d(companion, false, (wn0.l) objI, 1, null);
                                lVarV.l();
                            } else {
                                lVarV.o(1040398089);
                                lVarV.l();
                                dVarD = androidx.compose.ui.d.INSTANCE;
                            }
                            z3.k kVar3 = kVarE;
                            d3.c cVar3 = cVarE;
                            androidx.compose.ui.d dVarB = androidx.compose.ui.draw.d.b(h3.e.b(dVar2.g(dVarD)), bVar2, false, cVar3, kVar3, f12, q1Var3, 2, null);
                            a aVar = a.f104201a;
                            iA = p020r2.j.a(lVarV, 0);
                            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, dVarB);
                            p020r2.x xVarC = lVarV.c();
                            b4.g.Companion companion2 = b4.g.INSTANCE;
                            aVarA = companion2.a();
                            if (lVarV.w() == null) {
                                p020r2.j.c();
                            }
                            lVarV.h();
                            if (lVarV.u()) {
                                lVarV.z(aVarA);
                            } else {
                                lVarV.d();
                            }
                            lVarA = d4.a(lVarV);
                            d4.b(lVarA, aVar, companion2.c());
                            d4.b(lVarA, xVarC, companion2.e());
                            d4.b(lVarA, dVarE, companion2.d());
                            pVarB = companion2.b();
                            if (lVarA.u() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                                lVarA.B(Integer.valueOf(iA));
                                lVarA.f(Integer.valueOf(iA), pVarB);
                            }
                            lVarV.g();
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                            cVar2 = cVar3;
                            kVar2 = kVar3;
                            q1Var4 = q1Var3;
                        } else {
                            lVarV.j();
                            q1Var4 = q1Var2;
                            cVar2 = cVarE;
                            kVar2 = kVarE;
                        }
                        dVar3 = dVar2;
                        f13 = f12;
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new b(bVar, str, dVar3, cVar2, kVar2, f13, q1Var4, i11, i12));
                        }
                    }
                    i13 |= 196608;
                    f12 = f11;
                    i21 = i12 & 64;
                    if (i21 != 0) {
                        i13 |= 1572864;
                        q1Var2 = q1Var;
                    } else {
                        q1Var2 = q1Var;
                        if ((i11 & 1572864) == 0) {
                            if (lVarV.n(q1Var2)) {
                                i22 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i22 = PKIFailureInfo.signerNotTrusted;
                            }
                            i13 |= i22;
                        }
                    }
                    if ((i13 & 599187) == 599186) {
                        if (i23 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            cVarE = d3.c.INSTANCE.e();
                        }
                        if (i16 != 0) {
                            kVarE = z3.k.INSTANCE.e();
                        }
                        if (i18 != 0) {
                            f12 = 1.0f;
                        }
                        if (i21 != 0) {
                            q1Var3 = null;
                        } else {
                            q1Var3 = q1Var2;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(1142754848, i13, -1, "androidx.compose.foundation.Image (Image.kt:243)");
                        }
                        if (str != null) {
                            lVarV.o(1040258775);
                            androidx.compose.ui.d.Companion companion3 = androidx.compose.ui.d.INSTANCE;
                            if ((i13 & 112) == 32) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI = lVarV.I();
                            if (z11) {
                                objI = new c(str);
                                lVarV.B(objI);
                            } else {
                                objI = new c(str);
                                lVarV.B(objI);
                            }
                            dVarD = g4.o.d(companion3, false, (wn0.l) objI, 1, null);
                            lVarV.l();
                        } else {
                            lVarV.o(1040398089);
                            lVarV.l();
                            dVarD = androidx.compose.ui.d.INSTANCE;
                        }
                        z3.k kVar4 = kVarE;
                        d3.c cVar4 = cVarE;
                        androidx.compose.ui.d dVarB2 = androidx.compose.ui.draw.d.b(h3.e.b(dVar2.g(dVarD)), bVar2, false, cVar4, kVar4, f12, q1Var3, 2, null);
                        a aVar2 = a.f104201a;
                        iA = p020r2.j.a(lVarV, 0);
                        androidx.compose.ui.d dVarE2 = androidx.compose.ui.c.e(lVarV, dVarB2);
                        p020r2.x xVarC2 = lVarV.c();
                        b4.g.Companion companion4 = b4.g.INSTANCE;
                        aVarA = companion4.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.u()) {
                            lVarV.z(aVarA);
                        } else {
                            lVarV.d();
                        }
                        lVarA = d4.a(lVarV);
                        d4.b(lVarA, aVar2, companion4.c());
                        d4.b(lVarA, xVarC2, companion4.e());
                        d4.b(lVarA, dVarE2, companion4.d());
                        pVarB = companion4.b();
                        if (lVarA.u()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        lVarV.g();
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        cVar2 = cVar4;
                        kVar2 = kVar4;
                        q1Var4 = q1Var3;
                    } else {
                        if (i23 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            cVarE = d3.c.INSTANCE.e();
                        }
                        if (i16 != 0) {
                            kVarE = z3.k.INSTANCE.e();
                        }
                        if (i18 != 0) {
                            f12 = 1.0f;
                        }
                        if (i21 != 0) {
                            q1Var3 = null;
                        } else {
                            q1Var3 = q1Var2;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(1142754848, i13, -1, "androidx.compose.foundation.Image (Image.kt:243)");
                        }
                        if (str != null) {
                            lVarV.o(1040258775);
                            androidx.compose.ui.d.Companion companion5 = androidx.compose.ui.d.INSTANCE;
                            if ((i13 & 112) == 32) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI = lVarV.I();
                            if (z11) {
                                objI = new c(str);
                                lVarV.B(objI);
                            } else {
                                objI = new c(str);
                                lVarV.B(objI);
                            }
                            dVarD = g4.o.d(companion5, false, (wn0.l) objI, 1, null);
                            lVarV.l();
                        } else {
                            lVarV.o(1040398089);
                            lVarV.l();
                            dVarD = androidx.compose.ui.d.INSTANCE;
                        }
                        z3.k kVar5 = kVarE;
                        d3.c cVar5 = cVarE;
                        androidx.compose.ui.d dVarB3 = androidx.compose.ui.draw.d.b(h3.e.b(dVar2.g(dVarD)), bVar2, false, cVar5, kVar5, f12, q1Var3, 2, null);
                        a aVar3 = a.f104201a;
                        iA = p020r2.j.a(lVarV, 0);
                        androidx.compose.ui.d dVarE3 = androidx.compose.ui.c.e(lVarV, dVarB3);
                        p020r2.x xVarC3 = lVarV.c();
                        b4.g.Companion companion6 = b4.g.INSTANCE;
                        aVarA = companion6.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.u()) {
                            lVarV.z(aVarA);
                        } else {
                            lVarV.d();
                        }
                        lVarA = d4.a(lVarV);
                        d4.b(lVarA, aVar3, companion6.c());
                        d4.b(lVarA, xVarC3, companion6.e());
                        d4.b(lVarA, dVarE3, companion6.d());
                        pVarB = companion6.b();
                        if (lVarA.u()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        lVarV.g();
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        cVar2 = cVar5;
                        kVar2 = kVar5;
                        q1Var4 = q1Var3;
                    }
                    dVar3 = dVar2;
                    f13 = f12;
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(bVar, str, dVar3, cVar2, kVar2, f13, q1Var4, i11, i12));
                    }
                }
                i13 |= 24576;
                kVarE = kVar;
                i18 = i12 & 32;
                if (i18 != 0) {
                    if ((196608 & i11) == 0) {
                        f12 = f11;
                        if (lVarV.q(f12)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                    i21 = i12 & 64;
                    if (i21 != 0) {
                        i13 |= 1572864;
                        q1Var2 = q1Var;
                    } else {
                        q1Var2 = q1Var;
                        if ((i11 & 1572864) == 0) {
                            if (lVarV.n(q1Var2)) {
                                i22 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i22 = PKIFailureInfo.signerNotTrusted;
                            }
                            i13 |= i22;
                        }
                    }
                    if ((i13 & 599187) == 599186) {
                        if (i23 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            cVarE = d3.c.INSTANCE.e();
                        }
                        if (i16 != 0) {
                            kVarE = z3.k.INSTANCE.e();
                        }
                        if (i18 != 0) {
                            f12 = 1.0f;
                        }
                        if (i21 != 0) {
                            q1Var3 = null;
                        } else {
                            q1Var3 = q1Var2;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(1142754848, i13, -1, "androidx.compose.foundation.Image (Image.kt:243)");
                        }
                        if (str != null) {
                            lVarV.o(1040258775);
                            androidx.compose.ui.d.Companion companion7 = androidx.compose.ui.d.INSTANCE;
                            if ((i13 & 112) == 32) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI = lVarV.I();
                            if (z11) {
                                objI = new c(str);
                                lVarV.B(objI);
                            } else {
                                objI = new c(str);
                                lVarV.B(objI);
                            }
                            dVarD = g4.o.d(companion7, false, (wn0.l) objI, 1, null);
                            lVarV.l();
                        } else {
                            lVarV.o(1040398089);
                            lVarV.l();
                            dVarD = androidx.compose.ui.d.INSTANCE;
                        }
                        z3.k kVar6 = kVarE;
                        d3.c cVar6 = cVarE;
                        androidx.compose.ui.d dVarB4 = androidx.compose.ui.draw.d.b(h3.e.b(dVar2.g(dVarD)), bVar2, false, cVar6, kVar6, f12, q1Var3, 2, null);
                        a aVar4 = a.f104201a;
                        iA = p020r2.j.a(lVarV, 0);
                        androidx.compose.ui.d dVarE4 = androidx.compose.ui.c.e(lVarV, dVarB4);
                        p020r2.x xVarC4 = lVarV.c();
                        b4.g.Companion companion8 = b4.g.INSTANCE;
                        aVarA = companion8.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.u()) {
                            lVarV.z(aVarA);
                        } else {
                            lVarV.d();
                        }
                        lVarA = d4.a(lVarV);
                        d4.b(lVarA, aVar4, companion8.c());
                        d4.b(lVarA, xVarC4, companion8.e());
                        d4.b(lVarA, dVarE4, companion8.d());
                        pVarB = companion8.b();
                        if (lVarA.u()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        lVarV.g();
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        cVar2 = cVar6;
                        kVar2 = kVar6;
                        q1Var4 = q1Var3;
                    } else {
                        if (i23 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            cVarE = d3.c.INSTANCE.e();
                        }
                        if (i16 != 0) {
                            kVarE = z3.k.INSTANCE.e();
                        }
                        if (i18 != 0) {
                            f12 = 1.0f;
                        }
                        if (i21 != 0) {
                            q1Var3 = null;
                        } else {
                            q1Var3 = q1Var2;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(1142754848, i13, -1, "androidx.compose.foundation.Image (Image.kt:243)");
                        }
                        if (str != null) {
                            lVarV.o(1040258775);
                            androidx.compose.ui.d.Companion companion9 = androidx.compose.ui.d.INSTANCE;
                            if ((i13 & 112) == 32) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI = lVarV.I();
                            if (z11) {
                                objI = new c(str);
                                lVarV.B(objI);
                            } else {
                                objI = new c(str);
                                lVarV.B(objI);
                            }
                            dVarD = g4.o.d(companion9, false, (wn0.l) objI, 1, null);
                            lVarV.l();
                        } else {
                            lVarV.o(1040398089);
                            lVarV.l();
                            dVarD = androidx.compose.ui.d.INSTANCE;
                        }
                        z3.k kVar7 = kVarE;
                        d3.c cVar7 = cVarE;
                        androidx.compose.ui.d dVarB5 = androidx.compose.ui.draw.d.b(h3.e.b(dVar2.g(dVarD)), bVar2, false, cVar7, kVar7, f12, q1Var3, 2, null);
                        a aVar5 = a.f104201a;
                        iA = p020r2.j.a(lVarV, 0);
                        androidx.compose.ui.d dVarE5 = androidx.compose.ui.c.e(lVarV, dVarB5);
                        p020r2.x xVarC5 = lVarV.c();
                        b4.g.Companion companion10 = b4.g.INSTANCE;
                        aVarA = companion10.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.u()) {
                            lVarV.z(aVarA);
                        } else {
                            lVarV.d();
                        }
                        lVarA = d4.a(lVarV);
                        d4.b(lVarA, aVar5, companion10.c());
                        d4.b(lVarA, xVarC5, companion10.e());
                        d4.b(lVarA, dVarE5, companion10.d());
                        pVarB = companion10.b();
                        if (lVarA.u()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        lVarV.g();
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        cVar2 = cVar7;
                        kVar2 = kVar7;
                        q1Var4 = q1Var3;
                    }
                    dVar3 = dVar2;
                    f13 = f12;
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(bVar, str, dVar3, cVar2, kVar2, f13, q1Var4, i11, i12));
                    }
                }
                i13 |= 196608;
                f12 = f11;
                i21 = i12 & 64;
                if (i21 != 0) {
                    i13 |= 1572864;
                    q1Var2 = q1Var;
                } else {
                    q1Var2 = q1Var;
                    if ((i11 & 1572864) == 0) {
                        if (lVarV.n(q1Var2)) {
                            i22 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i22 = PKIFailureInfo.signerNotTrusted;
                        }
                        i13 |= i22;
                    }
                }
                if ((i13 & 599187) == 599186) {
                    if (i23 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        cVarE = d3.c.INSTANCE.e();
                    }
                    if (i16 != 0) {
                        kVarE = z3.k.INSTANCE.e();
                    }
                    if (i18 != 0) {
                        f12 = 1.0f;
                    }
                    if (i21 != 0) {
                        q1Var3 = null;
                    } else {
                        q1Var3 = q1Var2;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1142754848, i13, -1, "androidx.compose.foundation.Image (Image.kt:243)");
                    }
                    if (str != null) {
                        lVarV.o(1040258775);
                        androidx.compose.ui.d.Companion companion11 = androidx.compose.ui.d.INSTANCE;
                        if ((i13 & 112) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI = lVarV.I();
                        if (z11) {
                            objI = new c(str);
                            lVarV.B(objI);
                        } else {
                            objI = new c(str);
                            lVarV.B(objI);
                        }
                        dVarD = g4.o.d(companion11, false, (wn0.l) objI, 1, null);
                        lVarV.l();
                    } else {
                        lVarV.o(1040398089);
                        lVarV.l();
                        dVarD = androidx.compose.ui.d.INSTANCE;
                    }
                    z3.k kVar8 = kVarE;
                    d3.c cVar8 = cVarE;
                    androidx.compose.ui.d dVarB6 = androidx.compose.ui.draw.d.b(h3.e.b(dVar2.g(dVarD)), bVar2, false, cVar8, kVar8, f12, q1Var3, 2, null);
                    a aVar6 = a.f104201a;
                    iA = p020r2.j.a(lVarV, 0);
                    androidx.compose.ui.d dVarE6 = androidx.compose.ui.c.e(lVarV, dVarB6);
                    p020r2.x xVarC6 = lVarV.c();
                    b4.g.Companion companion12 = b4.g.INSTANCE;
                    aVarA = companion12.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.u()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d4.b(lVarA, aVar6, companion12.c());
                    d4.b(lVarA, xVarC6, companion12.e());
                    d4.b(lVarA, dVarE6, companion12.d());
                    pVarB = companion12.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    lVarV.g();
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    cVar2 = cVar8;
                    kVar2 = kVar8;
                    q1Var4 = q1Var3;
                } else {
                    if (i23 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        cVarE = d3.c.INSTANCE.e();
                    }
                    if (i16 != 0) {
                        kVarE = z3.k.INSTANCE.e();
                    }
                    if (i18 != 0) {
                        f12 = 1.0f;
                    }
                    if (i21 != 0) {
                        q1Var3 = null;
                    } else {
                        q1Var3 = q1Var2;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1142754848, i13, -1, "androidx.compose.foundation.Image (Image.kt:243)");
                    }
                    if (str != null) {
                        lVarV.o(1040258775);
                        androidx.compose.ui.d.Companion companion13 = androidx.compose.ui.d.INSTANCE;
                        if ((i13 & 112) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI = lVarV.I();
                        if (z11) {
                            objI = new c(str);
                            lVarV.B(objI);
                        } else {
                            objI = new c(str);
                            lVarV.B(objI);
                        }
                        dVarD = g4.o.d(companion13, false, (wn0.l) objI, 1, null);
                        lVarV.l();
                    } else {
                        lVarV.o(1040398089);
                        lVarV.l();
                        dVarD = androidx.compose.ui.d.INSTANCE;
                    }
                    z3.k kVar9 = kVarE;
                    d3.c cVar9 = cVarE;
                    androidx.compose.ui.d dVarB7 = androidx.compose.ui.draw.d.b(h3.e.b(dVar2.g(dVarD)), bVar2, false, cVar9, kVar9, f12, q1Var3, 2, null);
                    a aVar7 = a.f104201a;
                    iA = p020r2.j.a(lVarV, 0);
                    androidx.compose.ui.d dVarE7 = androidx.compose.ui.c.e(lVarV, dVarB7);
                    p020r2.x xVarC7 = lVarV.c();
                    b4.g.Companion companion14 = b4.g.INSTANCE;
                    aVarA = companion14.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.u()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d4.b(lVarA, aVar7, companion14.c());
                    d4.b(lVarA, xVarC7, companion14.e());
                    d4.b(lVarA, dVarE7, companion14.d());
                    pVarB = companion14.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    lVarV.g();
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    cVar2 = cVar9;
                    kVar2 = kVar9;
                    q1Var4 = q1Var3;
                }
                dVar3 = dVar2;
                f13 = f12;
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(bVar, str, dVar3, cVar2, kVar2, f13, q1Var4, i11, i12));
                }
            }
            i13 |= 3072;
            cVarE = cVar;
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((i11 & 24576) == 0) {
                    kVarE = kVar;
                    if (lVarV.n(kVarE)) {
                        i17 = 16384;
                    } else {
                        i17 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 32;
                if (i18 != 0) {
                    if ((196608 & i11) == 0) {
                        f12 = f11;
                        if (lVarV.q(f12)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                    i21 = i12 & 64;
                    if (i21 != 0) {
                        i13 |= 1572864;
                        q1Var2 = q1Var;
                    } else {
                        q1Var2 = q1Var;
                        if ((i11 & 1572864) == 0) {
                            if (lVarV.n(q1Var2)) {
                                i22 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i22 = PKIFailureInfo.signerNotTrusted;
                            }
                            i13 |= i22;
                        }
                    }
                    if ((i13 & 599187) == 599186) {
                        if (i23 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            cVarE = d3.c.INSTANCE.e();
                        }
                        if (i16 != 0) {
                            kVarE = z3.k.INSTANCE.e();
                        }
                        if (i18 != 0) {
                            f12 = 1.0f;
                        }
                        if (i21 != 0) {
                            q1Var3 = null;
                        } else {
                            q1Var3 = q1Var2;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(1142754848, i13, -1, "androidx.compose.foundation.Image (Image.kt:243)");
                        }
                        if (str != null) {
                            lVarV.o(1040258775);
                            androidx.compose.ui.d.Companion companion15 = androidx.compose.ui.d.INSTANCE;
                            if ((i13 & 112) == 32) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI = lVarV.I();
                            if (z11) {
                                objI = new c(str);
                                lVarV.B(objI);
                            } else {
                                objI = new c(str);
                                lVarV.B(objI);
                            }
                            dVarD = g4.o.d(companion15, false, (wn0.l) objI, 1, null);
                            lVarV.l();
                        } else {
                            lVarV.o(1040398089);
                            lVarV.l();
                            dVarD = androidx.compose.ui.d.INSTANCE;
                        }
                        z3.k kVar10 = kVarE;
                        d3.c cVar10 = cVarE;
                        androidx.compose.ui.d dVarB8 = androidx.compose.ui.draw.d.b(h3.e.b(dVar2.g(dVarD)), bVar2, false, cVar10, kVar10, f12, q1Var3, 2, null);
                        a aVar8 = a.f104201a;
                        iA = p020r2.j.a(lVarV, 0);
                        androidx.compose.ui.d dVarE8 = androidx.compose.ui.c.e(lVarV, dVarB8);
                        p020r2.x xVarC8 = lVarV.c();
                        b4.g.Companion companion16 = b4.g.INSTANCE;
                        aVarA = companion16.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.u()) {
                            lVarV.z(aVarA);
                        } else {
                            lVarV.d();
                        }
                        lVarA = d4.a(lVarV);
                        d4.b(lVarA, aVar8, companion16.c());
                        d4.b(lVarA, xVarC8, companion16.e());
                        d4.b(lVarA, dVarE8, companion16.d());
                        pVarB = companion16.b();
                        if (lVarA.u()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        lVarV.g();
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        cVar2 = cVar10;
                        kVar2 = kVar10;
                        q1Var4 = q1Var3;
                    } else {
                        if (i23 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            cVarE = d3.c.INSTANCE.e();
                        }
                        if (i16 != 0) {
                            kVarE = z3.k.INSTANCE.e();
                        }
                        if (i18 != 0) {
                            f12 = 1.0f;
                        }
                        if (i21 != 0) {
                            q1Var3 = null;
                        } else {
                            q1Var3 = q1Var2;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(1142754848, i13, -1, "androidx.compose.foundation.Image (Image.kt:243)");
                        }
                        if (str != null) {
                            lVarV.o(1040258775);
                            androidx.compose.ui.d.Companion companion17 = androidx.compose.ui.d.INSTANCE;
                            if ((i13 & 112) == 32) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI = lVarV.I();
                            if (z11) {
                                objI = new c(str);
                                lVarV.B(objI);
                            } else {
                                objI = new c(str);
                                lVarV.B(objI);
                            }
                            dVarD = g4.o.d(companion17, false, (wn0.l) objI, 1, null);
                            lVarV.l();
                        } else {
                            lVarV.o(1040398089);
                            lVarV.l();
                            dVarD = androidx.compose.ui.d.INSTANCE;
                        }
                        z3.k kVar11 = kVarE;
                        d3.c cVar11 = cVarE;
                        androidx.compose.ui.d dVarB9 = androidx.compose.ui.draw.d.b(h3.e.b(dVar2.g(dVarD)), bVar2, false, cVar11, kVar11, f12, q1Var3, 2, null);
                        a aVar9 = a.f104201a;
                        iA = p020r2.j.a(lVarV, 0);
                        androidx.compose.ui.d dVarE9 = androidx.compose.ui.c.e(lVarV, dVarB9);
                        p020r2.x xVarC9 = lVarV.c();
                        b4.g.Companion companion18 = b4.g.INSTANCE;
                        aVarA = companion18.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.u()) {
                            lVarV.z(aVarA);
                        } else {
                            lVarV.d();
                        }
                        lVarA = d4.a(lVarV);
                        d4.b(lVarA, aVar9, companion18.c());
                        d4.b(lVarA, xVarC9, companion18.e());
                        d4.b(lVarA, dVarE9, companion18.d());
                        pVarB = companion18.b();
                        if (lVarA.u()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        lVarV.g();
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        cVar2 = cVar11;
                        kVar2 = kVar11;
                        q1Var4 = q1Var3;
                    }
                    dVar3 = dVar2;
                    f13 = f12;
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(bVar, str, dVar3, cVar2, kVar2, f13, q1Var4, i11, i12));
                    }
                }
                i13 |= 196608;
                f12 = f11;
                i21 = i12 & 64;
                if (i21 != 0) {
                    i13 |= 1572864;
                    q1Var2 = q1Var;
                } else {
                    q1Var2 = q1Var;
                    if ((i11 & 1572864) == 0) {
                        if (lVarV.n(q1Var2)) {
                            i22 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i22 = PKIFailureInfo.signerNotTrusted;
                        }
                        i13 |= i22;
                    }
                }
                if ((i13 & 599187) == 599186) {
                    if (i23 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        cVarE = d3.c.INSTANCE.e();
                    }
                    if (i16 != 0) {
                        kVarE = z3.k.INSTANCE.e();
                    }
                    if (i18 != 0) {
                        f12 = 1.0f;
                    }
                    if (i21 != 0) {
                        q1Var3 = null;
                    } else {
                        q1Var3 = q1Var2;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1142754848, i13, -1, "androidx.compose.foundation.Image (Image.kt:243)");
                    }
                    if (str != null) {
                        lVarV.o(1040258775);
                        androidx.compose.ui.d.Companion companion19 = androidx.compose.ui.d.INSTANCE;
                        if ((i13 & 112) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI = lVarV.I();
                        if (z11) {
                            objI = new c(str);
                            lVarV.B(objI);
                        } else {
                            objI = new c(str);
                            lVarV.B(objI);
                        }
                        dVarD = g4.o.d(companion19, false, (wn0.l) objI, 1, null);
                        lVarV.l();
                    } else {
                        lVarV.o(1040398089);
                        lVarV.l();
                        dVarD = androidx.compose.ui.d.INSTANCE;
                    }
                    z3.k kVar12 = kVarE;
                    d3.c cVar12 = cVarE;
                    androidx.compose.ui.d dVarB10 = androidx.compose.ui.draw.d.b(h3.e.b(dVar2.g(dVarD)), bVar2, false, cVar12, kVar12, f12, q1Var3, 2, null);
                    a aVar10 = a.f104201a;
                    iA = p020r2.j.a(lVarV, 0);
                    androidx.compose.ui.d dVarE10 = androidx.compose.ui.c.e(lVarV, dVarB10);
                    p020r2.x xVarC10 = lVarV.c();
                    b4.g.Companion companion110 = b4.g.INSTANCE;
                    aVarA = companion110.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.u()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d4.b(lVarA, aVar10, companion110.c());
                    d4.b(lVarA, xVarC10, companion110.e());
                    d4.b(lVarA, dVarE10, companion110.d());
                    pVarB = companion110.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    lVarV.g();
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    cVar2 = cVar12;
                    kVar2 = kVar12;
                    q1Var4 = q1Var3;
                } else {
                    if (i23 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        cVarE = d3.c.INSTANCE.e();
                    }
                    if (i16 != 0) {
                        kVarE = z3.k.INSTANCE.e();
                    }
                    if (i18 != 0) {
                        f12 = 1.0f;
                    }
                    if (i21 != 0) {
                        q1Var3 = null;
                    } else {
                        q1Var3 = q1Var2;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1142754848, i13, -1, "androidx.compose.foundation.Image (Image.kt:243)");
                    }
                    if (str != null) {
                        lVarV.o(1040258775);
                        androidx.compose.ui.d.Companion companion111 = androidx.compose.ui.d.INSTANCE;
                        if ((i13 & 112) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI = lVarV.I();
                        if (z11) {
                            objI = new c(str);
                            lVarV.B(objI);
                        } else {
                            objI = new c(str);
                            lVarV.B(objI);
                        }
                        dVarD = g4.o.d(companion111, false, (wn0.l) objI, 1, null);
                        lVarV.l();
                    } else {
                        lVarV.o(1040398089);
                        lVarV.l();
                        dVarD = androidx.compose.ui.d.INSTANCE;
                    }
                    z3.k kVar13 = kVarE;
                    d3.c cVar13 = cVarE;
                    androidx.compose.ui.d dVarB11 = androidx.compose.ui.draw.d.b(h3.e.b(dVar2.g(dVarD)), bVar2, false, cVar13, kVar13, f12, q1Var3, 2, null);
                    a aVar11 = a.f104201a;
                    iA = p020r2.j.a(lVarV, 0);
                    androidx.compose.ui.d dVarE11 = androidx.compose.ui.c.e(lVarV, dVarB11);
                    p020r2.x xVarC11 = lVarV.c();
                    b4.g.Companion companion112 = b4.g.INSTANCE;
                    aVarA = companion112.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.u()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d4.b(lVarA, aVar11, companion112.c());
                    d4.b(lVarA, xVarC11, companion112.e());
                    d4.b(lVarA, dVarE11, companion112.d());
                    pVarB = companion112.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    lVarV.g();
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    cVar2 = cVar13;
                    kVar2 = kVar13;
                    q1Var4 = q1Var3;
                }
                dVar3 = dVar2;
                f13 = f12;
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(bVar, str, dVar3, cVar2, kVar2, f13, q1Var4, i11, i12));
                }
            }
            i13 |= 24576;
            kVarE = kVar;
            i18 = i12 & 32;
            if (i18 != 0) {
                if ((196608 & i11) == 0) {
                    f12 = f11;
                    if (lVarV.q(f12)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                i21 = i12 & 64;
                if (i21 != 0) {
                    i13 |= 1572864;
                    q1Var2 = q1Var;
                } else {
                    q1Var2 = q1Var;
                    if ((i11 & 1572864) == 0) {
                        if (lVarV.n(q1Var2)) {
                            i22 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i22 = PKIFailureInfo.signerNotTrusted;
                        }
                        i13 |= i22;
                    }
                }
                if ((i13 & 599187) == 599186) {
                    if (i23 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        cVarE = d3.c.INSTANCE.e();
                    }
                    if (i16 != 0) {
                        kVarE = z3.k.INSTANCE.e();
                    }
                    if (i18 != 0) {
                        f12 = 1.0f;
                    }
                    if (i21 != 0) {
                        q1Var3 = null;
                    } else {
                        q1Var3 = q1Var2;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1142754848, i13, -1, "androidx.compose.foundation.Image (Image.kt:243)");
                    }
                    if (str != null) {
                        lVarV.o(1040258775);
                        androidx.compose.ui.d.Companion companion113 = androidx.compose.ui.d.INSTANCE;
                        if ((i13 & 112) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI = lVarV.I();
                        if (z11) {
                            objI = new c(str);
                            lVarV.B(objI);
                        } else {
                            objI = new c(str);
                            lVarV.B(objI);
                        }
                        dVarD = g4.o.d(companion113, false, (wn0.l) objI, 1, null);
                        lVarV.l();
                    } else {
                        lVarV.o(1040398089);
                        lVarV.l();
                        dVarD = androidx.compose.ui.d.INSTANCE;
                    }
                    z3.k kVar14 = kVarE;
                    d3.c cVar14 = cVarE;
                    androidx.compose.ui.d dVarB12 = androidx.compose.ui.draw.d.b(h3.e.b(dVar2.g(dVarD)), bVar2, false, cVar14, kVar14, f12, q1Var3, 2, null);
                    a aVar12 = a.f104201a;
                    iA = p020r2.j.a(lVarV, 0);
                    androidx.compose.ui.d dVarE12 = androidx.compose.ui.c.e(lVarV, dVarB12);
                    p020r2.x xVarC12 = lVarV.c();
                    b4.g.Companion companion114 = b4.g.INSTANCE;
                    aVarA = companion114.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.u()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d4.b(lVarA, aVar12, companion114.c());
                    d4.b(lVarA, xVarC12, companion114.e());
                    d4.b(lVarA, dVarE12, companion114.d());
                    pVarB = companion114.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    lVarV.g();
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    cVar2 = cVar14;
                    kVar2 = kVar14;
                    q1Var4 = q1Var3;
                } else {
                    if (i23 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        cVarE = d3.c.INSTANCE.e();
                    }
                    if (i16 != 0) {
                        kVarE = z3.k.INSTANCE.e();
                    }
                    if (i18 != 0) {
                        f12 = 1.0f;
                    }
                    if (i21 != 0) {
                        q1Var3 = null;
                    } else {
                        q1Var3 = q1Var2;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1142754848, i13, -1, "androidx.compose.foundation.Image (Image.kt:243)");
                    }
                    if (str != null) {
                        lVarV.o(1040258775);
                        androidx.compose.ui.d.Companion companion115 = androidx.compose.ui.d.INSTANCE;
                        if ((i13 & 112) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI = lVarV.I();
                        if (z11) {
                            objI = new c(str);
                            lVarV.B(objI);
                        } else {
                            objI = new c(str);
                            lVarV.B(objI);
                        }
                        dVarD = g4.o.d(companion115, false, (wn0.l) objI, 1, null);
                        lVarV.l();
                    } else {
                        lVarV.o(1040398089);
                        lVarV.l();
                        dVarD = androidx.compose.ui.d.INSTANCE;
                    }
                    z3.k kVar15 = kVarE;
                    d3.c cVar15 = cVarE;
                    androidx.compose.ui.d dVarB13 = androidx.compose.ui.draw.d.b(h3.e.b(dVar2.g(dVarD)), bVar2, false, cVar15, kVar15, f12, q1Var3, 2, null);
                    a aVar13 = a.f104201a;
                    iA = p020r2.j.a(lVarV, 0);
                    androidx.compose.ui.d dVarE13 = androidx.compose.ui.c.e(lVarV, dVarB13);
                    p020r2.x xVarC13 = lVarV.c();
                    b4.g.Companion companion116 = b4.g.INSTANCE;
                    aVarA = companion116.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.u()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d4.b(lVarA, aVar13, companion116.c());
                    d4.b(lVarA, xVarC13, companion116.e());
                    d4.b(lVarA, dVarE13, companion116.d());
                    pVarB = companion116.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    lVarV.g();
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    cVar2 = cVar15;
                    kVar2 = kVar15;
                    q1Var4 = q1Var3;
                }
                dVar3 = dVar2;
                f13 = f12;
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(bVar, str, dVar3, cVar2, kVar2, f13, q1Var4, i11, i12));
                }
            }
            i13 |= 196608;
            f12 = f11;
            i21 = i12 & 64;
            if (i21 != 0) {
                i13 |= 1572864;
                q1Var2 = q1Var;
            } else {
                q1Var2 = q1Var;
                if ((i11 & 1572864) == 0) {
                    if (lVarV.n(q1Var2)) {
                        i22 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i22 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i22;
                }
            }
            if ((i13 & 599187) == 599186) {
                if (i23 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    cVarE = d3.c.INSTANCE.e();
                }
                if (i16 != 0) {
                    kVarE = z3.k.INSTANCE.e();
                }
                if (i18 != 0) {
                    f12 = 1.0f;
                }
                if (i21 != 0) {
                    q1Var3 = null;
                } else {
                    q1Var3 = q1Var2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1142754848, i13, -1, "androidx.compose.foundation.Image (Image.kt:243)");
                }
                if (str != null) {
                    lVarV.o(1040258775);
                    androidx.compose.ui.d.Companion companion117 = androidx.compose.ui.d.INSTANCE;
                    if ((i13 & 112) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new c(str);
                        lVarV.B(objI);
                    } else {
                        objI = new c(str);
                        lVarV.B(objI);
                    }
                    dVarD = g4.o.d(companion117, false, (wn0.l) objI, 1, null);
                    lVarV.l();
                } else {
                    lVarV.o(1040398089);
                    lVarV.l();
                    dVarD = androidx.compose.ui.d.INSTANCE;
                }
                z3.k kVar16 = kVarE;
                d3.c cVar16 = cVarE;
                androidx.compose.ui.d dVarB14 = androidx.compose.ui.draw.d.b(h3.e.b(dVar2.g(dVarD)), bVar2, false, cVar16, kVar16, f12, q1Var3, 2, null);
                a aVar14 = a.f104201a;
                iA = p020r2.j.a(lVarV, 0);
                androidx.compose.ui.d dVarE14 = androidx.compose.ui.c.e(lVarV, dVarB14);
                p020r2.x xVarC14 = lVarV.c();
                b4.g.Companion companion118 = b4.g.INSTANCE;
                aVarA = companion118.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.u()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d4.b(lVarA, aVar14, companion118.c());
                d4.b(lVarA, xVarC14, companion118.e());
                d4.b(lVarA, dVarE14, companion118.d());
                pVarB = companion118.b();
                if (lVarA.u()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                lVarV.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                cVar2 = cVar16;
                kVar2 = kVar16;
                q1Var4 = q1Var3;
            } else {
                if (i23 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    cVarE = d3.c.INSTANCE.e();
                }
                if (i16 != 0) {
                    kVarE = z3.k.INSTANCE.e();
                }
                if (i18 != 0) {
                    f12 = 1.0f;
                }
                if (i21 != 0) {
                    q1Var3 = null;
                } else {
                    q1Var3 = q1Var2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1142754848, i13, -1, "androidx.compose.foundation.Image (Image.kt:243)");
                }
                if (str != null) {
                    lVarV.o(1040258775);
                    androidx.compose.ui.d.Companion companion119 = androidx.compose.ui.d.INSTANCE;
                    if ((i13 & 112) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new c(str);
                        lVarV.B(objI);
                    } else {
                        objI = new c(str);
                        lVarV.B(objI);
                    }
                    dVarD = g4.o.d(companion119, false, (wn0.l) objI, 1, null);
                    lVarV.l();
                } else {
                    lVarV.o(1040398089);
                    lVarV.l();
                    dVarD = androidx.compose.ui.d.INSTANCE;
                }
                z3.k kVar17 = kVarE;
                d3.c cVar17 = cVarE;
                androidx.compose.ui.d dVarB15 = androidx.compose.ui.draw.d.b(h3.e.b(dVar2.g(dVarD)), bVar2, false, cVar17, kVar17, f12, q1Var3, 2, null);
                a aVar15 = a.f104201a;
                iA = p020r2.j.a(lVarV, 0);
                androidx.compose.ui.d dVarE15 = androidx.compose.ui.c.e(lVarV, dVarB15);
                p020r2.x xVarC15 = lVarV.c();
                b4.g.Companion companion1110 = b4.g.INSTANCE;
                aVarA = companion1110.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.u()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d4.b(lVarA, aVar15, companion1110.c());
                d4.b(lVarA, xVarC15, companion1110.e());
                d4.b(lVarA, dVarE15, companion1110.d());
                pVarB = companion1110.b();
                if (lVarA.u()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                lVarV.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                cVar2 = cVar17;
                kVar2 = kVar17;
                q1Var4 = q1Var3;
            }
            dVar3 = dVar2;
            f13 = f12;
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(bVar, str, dVar3, cVar2, kVar2, f13, q1Var4, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        dVar2 = dVar;
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & 3072) == 0) {
                cVarE = cVar;
                if (lVarV.n(cVarE)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((i11 & 24576) == 0) {
                    kVarE = kVar;
                    if (lVarV.n(kVarE)) {
                        i17 = 16384;
                    } else {
                        i17 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 32;
                if (i18 != 0) {
                    if ((196608 & i11) == 0) {
                        f12 = f11;
                        if (lVarV.q(f12)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                    i21 = i12 & 64;
                    if (i21 != 0) {
                        i13 |= 1572864;
                        q1Var2 = q1Var;
                    } else {
                        q1Var2 = q1Var;
                        if ((i11 & 1572864) == 0) {
                            if (lVarV.n(q1Var2)) {
                                i22 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i22 = PKIFailureInfo.signerNotTrusted;
                            }
                            i13 |= i22;
                        }
                    }
                    if ((i13 & 599187) == 599186) {
                        if (i23 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            cVarE = d3.c.INSTANCE.e();
                        }
                        if (i16 != 0) {
                            kVarE = z3.k.INSTANCE.e();
                        }
                        if (i18 != 0) {
                            f12 = 1.0f;
                        }
                        if (i21 != 0) {
                            q1Var3 = null;
                        } else {
                            q1Var3 = q1Var2;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(1142754848, i13, -1, "androidx.compose.foundation.Image (Image.kt:243)");
                        }
                        if (str != null) {
                            lVarV.o(1040258775);
                            androidx.compose.ui.d.Companion companion1111 = androidx.compose.ui.d.INSTANCE;
                            if ((i13 & 112) == 32) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI = lVarV.I();
                            if (z11) {
                                objI = new c(str);
                                lVarV.B(objI);
                            } else {
                                objI = new c(str);
                                lVarV.B(objI);
                            }
                            dVarD = g4.o.d(companion1111, false, (wn0.l) objI, 1, null);
                            lVarV.l();
                        } else {
                            lVarV.o(1040398089);
                            lVarV.l();
                            dVarD = androidx.compose.ui.d.INSTANCE;
                        }
                        z3.k kVar18 = kVarE;
                        d3.c cVar18 = cVarE;
                        androidx.compose.ui.d dVarB16 = androidx.compose.ui.draw.d.b(h3.e.b(dVar2.g(dVarD)), bVar2, false, cVar18, kVar18, f12, q1Var3, 2, null);
                        a aVar16 = a.f104201a;
                        iA = p020r2.j.a(lVarV, 0);
                        androidx.compose.ui.d dVarE16 = androidx.compose.ui.c.e(lVarV, dVarB16);
                        p020r2.x xVarC16 = lVarV.c();
                        b4.g.Companion companion1112 = b4.g.INSTANCE;
                        aVarA = companion1112.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.u()) {
                            lVarV.z(aVarA);
                        } else {
                            lVarV.d();
                        }
                        lVarA = d4.a(lVarV);
                        d4.b(lVarA, aVar16, companion1112.c());
                        d4.b(lVarA, xVarC16, companion1112.e());
                        d4.b(lVarA, dVarE16, companion1112.d());
                        pVarB = companion1112.b();
                        if (lVarA.u()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        lVarV.g();
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        cVar2 = cVar18;
                        kVar2 = kVar18;
                        q1Var4 = q1Var3;
                    } else {
                        if (i23 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            cVarE = d3.c.INSTANCE.e();
                        }
                        if (i16 != 0) {
                            kVarE = z3.k.INSTANCE.e();
                        }
                        if (i18 != 0) {
                            f12 = 1.0f;
                        }
                        if (i21 != 0) {
                            q1Var3 = null;
                        } else {
                            q1Var3 = q1Var2;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(1142754848, i13, -1, "androidx.compose.foundation.Image (Image.kt:243)");
                        }
                        if (str != null) {
                            lVarV.o(1040258775);
                            androidx.compose.ui.d.Companion companion1113 = androidx.compose.ui.d.INSTANCE;
                            if ((i13 & 112) == 32) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI = lVarV.I();
                            if (z11) {
                                objI = new c(str);
                                lVarV.B(objI);
                            } else {
                                objI = new c(str);
                                lVarV.B(objI);
                            }
                            dVarD = g4.o.d(companion1113, false, (wn0.l) objI, 1, null);
                            lVarV.l();
                        } else {
                            lVarV.o(1040398089);
                            lVarV.l();
                            dVarD = androidx.compose.ui.d.INSTANCE;
                        }
                        z3.k kVar19 = kVarE;
                        d3.c cVar19 = cVarE;
                        androidx.compose.ui.d dVarB17 = androidx.compose.ui.draw.d.b(h3.e.b(dVar2.g(dVarD)), bVar2, false, cVar19, kVar19, f12, q1Var3, 2, null);
                        a aVar17 = a.f104201a;
                        iA = p020r2.j.a(lVarV, 0);
                        androidx.compose.ui.d dVarE17 = androidx.compose.ui.c.e(lVarV, dVarB17);
                        p020r2.x xVarC17 = lVarV.c();
                        b4.g.Companion companion1114 = b4.g.INSTANCE;
                        aVarA = companion1114.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.u()) {
                            lVarV.z(aVarA);
                        } else {
                            lVarV.d();
                        }
                        lVarA = d4.a(lVarV);
                        d4.b(lVarA, aVar17, companion1114.c());
                        d4.b(lVarA, xVarC17, companion1114.e());
                        d4.b(lVarA, dVarE17, companion1114.d());
                        pVarB = companion1114.b();
                        if (lVarA.u()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        lVarV.g();
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        cVar2 = cVar19;
                        kVar2 = kVar19;
                        q1Var4 = q1Var3;
                    }
                    dVar3 = dVar2;
                    f13 = f12;
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(bVar, str, dVar3, cVar2, kVar2, f13, q1Var4, i11, i12));
                    }
                }
                i13 |= 196608;
                f12 = f11;
                i21 = i12 & 64;
                if (i21 != 0) {
                    i13 |= 1572864;
                    q1Var2 = q1Var;
                } else {
                    q1Var2 = q1Var;
                    if ((i11 & 1572864) == 0) {
                        if (lVarV.n(q1Var2)) {
                            i22 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i22 = PKIFailureInfo.signerNotTrusted;
                        }
                        i13 |= i22;
                    }
                }
                if ((i13 & 599187) == 599186) {
                    if (i23 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        cVarE = d3.c.INSTANCE.e();
                    }
                    if (i16 != 0) {
                        kVarE = z3.k.INSTANCE.e();
                    }
                    if (i18 != 0) {
                        f12 = 1.0f;
                    }
                    if (i21 != 0) {
                        q1Var3 = null;
                    } else {
                        q1Var3 = q1Var2;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1142754848, i13, -1, "androidx.compose.foundation.Image (Image.kt:243)");
                    }
                    if (str != null) {
                        lVarV.o(1040258775);
                        androidx.compose.ui.d.Companion companion1115 = androidx.compose.ui.d.INSTANCE;
                        if ((i13 & 112) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI = lVarV.I();
                        if (z11) {
                            objI = new c(str);
                            lVarV.B(objI);
                        } else {
                            objI = new c(str);
                            lVarV.B(objI);
                        }
                        dVarD = g4.o.d(companion1115, false, (wn0.l) objI, 1, null);
                        lVarV.l();
                    } else {
                        lVarV.o(1040398089);
                        lVarV.l();
                        dVarD = androidx.compose.ui.d.INSTANCE;
                    }
                    z3.k kVar110 = kVarE;
                    d3.c cVar110 = cVarE;
                    androidx.compose.ui.d dVarB18 = androidx.compose.ui.draw.d.b(h3.e.b(dVar2.g(dVarD)), bVar2, false, cVar110, kVar110, f12, q1Var3, 2, null);
                    a aVar18 = a.f104201a;
                    iA = p020r2.j.a(lVarV, 0);
                    androidx.compose.ui.d dVarE18 = androidx.compose.ui.c.e(lVarV, dVarB18);
                    p020r2.x xVarC18 = lVarV.c();
                    b4.g.Companion companion1116 = b4.g.INSTANCE;
                    aVarA = companion1116.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.u()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d4.b(lVarA, aVar18, companion1116.c());
                    d4.b(lVarA, xVarC18, companion1116.e());
                    d4.b(lVarA, dVarE18, companion1116.d());
                    pVarB = companion1116.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    lVarV.g();
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    cVar2 = cVar110;
                    kVar2 = kVar110;
                    q1Var4 = q1Var3;
                } else {
                    if (i23 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        cVarE = d3.c.INSTANCE.e();
                    }
                    if (i16 != 0) {
                        kVarE = z3.k.INSTANCE.e();
                    }
                    if (i18 != 0) {
                        f12 = 1.0f;
                    }
                    if (i21 != 0) {
                        q1Var3 = null;
                    } else {
                        q1Var3 = q1Var2;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1142754848, i13, -1, "androidx.compose.foundation.Image (Image.kt:243)");
                    }
                    if (str != null) {
                        lVarV.o(1040258775);
                        androidx.compose.ui.d.Companion companion1117 = androidx.compose.ui.d.INSTANCE;
                        if ((i13 & 112) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI = lVarV.I();
                        if (z11) {
                            objI = new c(str);
                            lVarV.B(objI);
                        } else {
                            objI = new c(str);
                            lVarV.B(objI);
                        }
                        dVarD = g4.o.d(companion1117, false, (wn0.l) objI, 1, null);
                        lVarV.l();
                    } else {
                        lVarV.o(1040398089);
                        lVarV.l();
                        dVarD = androidx.compose.ui.d.INSTANCE;
                    }
                    z3.k kVar111 = kVarE;
                    d3.c cVar111 = cVarE;
                    androidx.compose.ui.d dVarB19 = androidx.compose.ui.draw.d.b(h3.e.b(dVar2.g(dVarD)), bVar2, false, cVar111, kVar111, f12, q1Var3, 2, null);
                    a aVar19 = a.f104201a;
                    iA = p020r2.j.a(lVarV, 0);
                    androidx.compose.ui.d dVarE19 = androidx.compose.ui.c.e(lVarV, dVarB19);
                    p020r2.x xVarC19 = lVarV.c();
                    b4.g.Companion companion1118 = b4.g.INSTANCE;
                    aVarA = companion1118.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.u()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d4.b(lVarA, aVar19, companion1118.c());
                    d4.b(lVarA, xVarC19, companion1118.e());
                    d4.b(lVarA, dVarE19, companion1118.d());
                    pVarB = companion1118.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    lVarV.g();
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    cVar2 = cVar111;
                    kVar2 = kVar111;
                    q1Var4 = q1Var3;
                }
                dVar3 = dVar2;
                f13 = f12;
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(bVar, str, dVar3, cVar2, kVar2, f13, q1Var4, i11, i12));
                }
            }
            i13 |= 24576;
            kVarE = kVar;
            i18 = i12 & 32;
            if (i18 != 0) {
                if ((196608 & i11) == 0) {
                    f12 = f11;
                    if (lVarV.q(f12)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                i21 = i12 & 64;
                if (i21 != 0) {
                    i13 |= 1572864;
                    q1Var2 = q1Var;
                } else {
                    q1Var2 = q1Var;
                    if ((i11 & 1572864) == 0) {
                        if (lVarV.n(q1Var2)) {
                            i22 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i22 = PKIFailureInfo.signerNotTrusted;
                        }
                        i13 |= i22;
                    }
                }
                if ((i13 & 599187) == 599186) {
                    if (i23 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        cVarE = d3.c.INSTANCE.e();
                    }
                    if (i16 != 0) {
                        kVarE = z3.k.INSTANCE.e();
                    }
                    if (i18 != 0) {
                        f12 = 1.0f;
                    }
                    if (i21 != 0) {
                        q1Var3 = null;
                    } else {
                        q1Var3 = q1Var2;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1142754848, i13, -1, "androidx.compose.foundation.Image (Image.kt:243)");
                    }
                    if (str != null) {
                        lVarV.o(1040258775);
                        androidx.compose.ui.d.Companion companion1119 = androidx.compose.ui.d.INSTANCE;
                        if ((i13 & 112) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI = lVarV.I();
                        if (z11) {
                            objI = new c(str);
                            lVarV.B(objI);
                        } else {
                            objI = new c(str);
                            lVarV.B(objI);
                        }
                        dVarD = g4.o.d(companion1119, false, (wn0.l) objI, 1, null);
                        lVarV.l();
                    } else {
                        lVarV.o(1040398089);
                        lVarV.l();
                        dVarD = androidx.compose.ui.d.INSTANCE;
                    }
                    z3.k kVar112 = kVarE;
                    d3.c cVar112 = cVarE;
                    androidx.compose.ui.d dVarB110 = androidx.compose.ui.draw.d.b(h3.e.b(dVar2.g(dVarD)), bVar2, false, cVar112, kVar112, f12, q1Var3, 2, null);
                    a aVar110 = a.f104201a;
                    iA = p020r2.j.a(lVarV, 0);
                    androidx.compose.ui.d dVarE110 = androidx.compose.ui.c.e(lVarV, dVarB110);
                    p020r2.x xVarC110 = lVarV.c();
                    b4.g.Companion companion11110 = b4.g.INSTANCE;
                    aVarA = companion11110.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.u()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d4.b(lVarA, aVar110, companion11110.c());
                    d4.b(lVarA, xVarC110, companion11110.e());
                    d4.b(lVarA, dVarE110, companion11110.d());
                    pVarB = companion11110.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    lVarV.g();
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    cVar2 = cVar112;
                    kVar2 = kVar112;
                    q1Var4 = q1Var3;
                } else {
                    if (i23 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        cVarE = d3.c.INSTANCE.e();
                    }
                    if (i16 != 0) {
                        kVarE = z3.k.INSTANCE.e();
                    }
                    if (i18 != 0) {
                        f12 = 1.0f;
                    }
                    if (i21 != 0) {
                        q1Var3 = null;
                    } else {
                        q1Var3 = q1Var2;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1142754848, i13, -1, "androidx.compose.foundation.Image (Image.kt:243)");
                    }
                    if (str != null) {
                        lVarV.o(1040258775);
                        androidx.compose.ui.d.Companion companion11111 = androidx.compose.ui.d.INSTANCE;
                        if ((i13 & 112) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI = lVarV.I();
                        if (z11) {
                            objI = new c(str);
                            lVarV.B(objI);
                        } else {
                            objI = new c(str);
                            lVarV.B(objI);
                        }
                        dVarD = g4.o.d(companion11111, false, (wn0.l) objI, 1, null);
                        lVarV.l();
                    } else {
                        lVarV.o(1040398089);
                        lVarV.l();
                        dVarD = androidx.compose.ui.d.INSTANCE;
                    }
                    z3.k kVar113 = kVarE;
                    d3.c cVar113 = cVarE;
                    androidx.compose.ui.d dVarB111 = androidx.compose.ui.draw.d.b(h3.e.b(dVar2.g(dVarD)), bVar2, false, cVar113, kVar113, f12, q1Var3, 2, null);
                    a aVar111 = a.f104201a;
                    iA = p020r2.j.a(lVarV, 0);
                    androidx.compose.ui.d dVarE111 = androidx.compose.ui.c.e(lVarV, dVarB111);
                    p020r2.x xVarC111 = lVarV.c();
                    b4.g.Companion companion11112 = b4.g.INSTANCE;
                    aVarA = companion11112.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.u()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d4.b(lVarA, aVar111, companion11112.c());
                    d4.b(lVarA, xVarC111, companion11112.e());
                    d4.b(lVarA, dVarE111, companion11112.d());
                    pVarB = companion11112.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    lVarV.g();
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    cVar2 = cVar113;
                    kVar2 = kVar113;
                    q1Var4 = q1Var3;
                }
                dVar3 = dVar2;
                f13 = f12;
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(bVar, str, dVar3, cVar2, kVar2, f13, q1Var4, i11, i12));
                }
            }
            i13 |= 196608;
            f12 = f11;
            i21 = i12 & 64;
            if (i21 != 0) {
                i13 |= 1572864;
                q1Var2 = q1Var;
            } else {
                q1Var2 = q1Var;
                if ((i11 & 1572864) == 0) {
                    if (lVarV.n(q1Var2)) {
                        i22 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i22 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i22;
                }
            }
            if ((i13 & 599187) == 599186) {
                if (i23 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    cVarE = d3.c.INSTANCE.e();
                }
                if (i16 != 0) {
                    kVarE = z3.k.INSTANCE.e();
                }
                if (i18 != 0) {
                    f12 = 1.0f;
                }
                if (i21 != 0) {
                    q1Var3 = null;
                } else {
                    q1Var3 = q1Var2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1142754848, i13, -1, "androidx.compose.foundation.Image (Image.kt:243)");
                }
                if (str != null) {
                    lVarV.o(1040258775);
                    androidx.compose.ui.d.Companion companion11113 = androidx.compose.ui.d.INSTANCE;
                    if ((i13 & 112) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new c(str);
                        lVarV.B(objI);
                    } else {
                        objI = new c(str);
                        lVarV.B(objI);
                    }
                    dVarD = g4.o.d(companion11113, false, (wn0.l) objI, 1, null);
                    lVarV.l();
                } else {
                    lVarV.o(1040398089);
                    lVarV.l();
                    dVarD = androidx.compose.ui.d.INSTANCE;
                }
                z3.k kVar114 = kVarE;
                d3.c cVar114 = cVarE;
                androidx.compose.ui.d dVarB112 = androidx.compose.ui.draw.d.b(h3.e.b(dVar2.g(dVarD)), bVar2, false, cVar114, kVar114, f12, q1Var3, 2, null);
                a aVar112 = a.f104201a;
                iA = p020r2.j.a(lVarV, 0);
                androidx.compose.ui.d dVarE112 = androidx.compose.ui.c.e(lVarV, dVarB112);
                p020r2.x xVarC112 = lVarV.c();
                b4.g.Companion companion11114 = b4.g.INSTANCE;
                aVarA = companion11114.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.u()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d4.b(lVarA, aVar112, companion11114.c());
                d4.b(lVarA, xVarC112, companion11114.e());
                d4.b(lVarA, dVarE112, companion11114.d());
                pVarB = companion11114.b();
                if (lVarA.u()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                lVarV.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                cVar2 = cVar114;
                kVar2 = kVar114;
                q1Var4 = q1Var3;
            } else {
                if (i23 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    cVarE = d3.c.INSTANCE.e();
                }
                if (i16 != 0) {
                    kVarE = z3.k.INSTANCE.e();
                }
                if (i18 != 0) {
                    f12 = 1.0f;
                }
                if (i21 != 0) {
                    q1Var3 = null;
                } else {
                    q1Var3 = q1Var2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1142754848, i13, -1, "androidx.compose.foundation.Image (Image.kt:243)");
                }
                if (str != null) {
                    lVarV.o(1040258775);
                    androidx.compose.ui.d.Companion companion11115 = androidx.compose.ui.d.INSTANCE;
                    if ((i13 & 112) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new c(str);
                        lVarV.B(objI);
                    } else {
                        objI = new c(str);
                        lVarV.B(objI);
                    }
                    dVarD = g4.o.d(companion11115, false, (wn0.l) objI, 1, null);
                    lVarV.l();
                } else {
                    lVarV.o(1040398089);
                    lVarV.l();
                    dVarD = androidx.compose.ui.d.INSTANCE;
                }
                z3.k kVar115 = kVarE;
                d3.c cVar115 = cVarE;
                androidx.compose.ui.d dVarB113 = androidx.compose.ui.draw.d.b(h3.e.b(dVar2.g(dVarD)), bVar2, false, cVar115, kVar115, f12, q1Var3, 2, null);
                a aVar113 = a.f104201a;
                iA = p020r2.j.a(lVarV, 0);
                androidx.compose.ui.d dVarE113 = androidx.compose.ui.c.e(lVarV, dVarB113);
                p020r2.x xVarC113 = lVarV.c();
                b4.g.Companion companion11116 = b4.g.INSTANCE;
                aVarA = companion11116.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.u()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d4.b(lVarA, aVar113, companion11116.c());
                d4.b(lVarA, xVarC113, companion11116.e());
                d4.b(lVarA, dVarE113, companion11116.d());
                pVarB = companion11116.b();
                if (lVarA.u()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                lVarV.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                cVar2 = cVar115;
                kVar2 = kVar115;
                q1Var4 = q1Var3;
            }
            dVar3 = dVar2;
            f13 = f12;
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(bVar, str, dVar3, cVar2, kVar2, f13, q1Var4, i11, i12));
            }
        }
        i13 |= 3072;
        cVarE = cVar;
        i16 = i12 & 16;
        if (i16 != 0) {
            if ((i11 & 24576) == 0) {
                kVarE = kVar;
                if (lVarV.n(kVarE)) {
                    i17 = 16384;
                } else {
                    i17 = PKIFailureInfo.certRevoked;
                }
                i13 |= i17;
            }
            i18 = i12 & 32;
            if (i18 != 0) {
                if ((196608 & i11) == 0) {
                    f12 = f11;
                    if (lVarV.q(f12)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                i21 = i12 & 64;
                if (i21 != 0) {
                    i13 |= 1572864;
                    q1Var2 = q1Var;
                } else {
                    q1Var2 = q1Var;
                    if ((i11 & 1572864) == 0) {
                        if (lVarV.n(q1Var2)) {
                            i22 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i22 = PKIFailureInfo.signerNotTrusted;
                        }
                        i13 |= i22;
                    }
                }
                if ((i13 & 599187) == 599186) {
                    if (i23 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        cVarE = d3.c.INSTANCE.e();
                    }
                    if (i16 != 0) {
                        kVarE = z3.k.INSTANCE.e();
                    }
                    if (i18 != 0) {
                        f12 = 1.0f;
                    }
                    if (i21 != 0) {
                        q1Var3 = null;
                    } else {
                        q1Var3 = q1Var2;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1142754848, i13, -1, "androidx.compose.foundation.Image (Image.kt:243)");
                    }
                    if (str != null) {
                        lVarV.o(1040258775);
                        androidx.compose.ui.d.Companion companion11117 = androidx.compose.ui.d.INSTANCE;
                        if ((i13 & 112) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI = lVarV.I();
                        if (z11) {
                            objI = new c(str);
                            lVarV.B(objI);
                        } else {
                            objI = new c(str);
                            lVarV.B(objI);
                        }
                        dVarD = g4.o.d(companion11117, false, (wn0.l) objI, 1, null);
                        lVarV.l();
                    } else {
                        lVarV.o(1040398089);
                        lVarV.l();
                        dVarD = androidx.compose.ui.d.INSTANCE;
                    }
                    z3.k kVar116 = kVarE;
                    d3.c cVar116 = cVarE;
                    androidx.compose.ui.d dVarB114 = androidx.compose.ui.draw.d.b(h3.e.b(dVar2.g(dVarD)), bVar2, false, cVar116, kVar116, f12, q1Var3, 2, null);
                    a aVar114 = a.f104201a;
                    iA = p020r2.j.a(lVarV, 0);
                    androidx.compose.ui.d dVarE114 = androidx.compose.ui.c.e(lVarV, dVarB114);
                    p020r2.x xVarC114 = lVarV.c();
                    b4.g.Companion companion11118 = b4.g.INSTANCE;
                    aVarA = companion11118.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.u()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d4.b(lVarA, aVar114, companion11118.c());
                    d4.b(lVarA, xVarC114, companion11118.e());
                    d4.b(lVarA, dVarE114, companion11118.d());
                    pVarB = companion11118.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    lVarV.g();
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    cVar2 = cVar116;
                    kVar2 = kVar116;
                    q1Var4 = q1Var3;
                } else {
                    if (i23 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        cVarE = d3.c.INSTANCE.e();
                    }
                    if (i16 != 0) {
                        kVarE = z3.k.INSTANCE.e();
                    }
                    if (i18 != 0) {
                        f12 = 1.0f;
                    }
                    if (i21 != 0) {
                        q1Var3 = null;
                    } else {
                        q1Var3 = q1Var2;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1142754848, i13, -1, "androidx.compose.foundation.Image (Image.kt:243)");
                    }
                    if (str != null) {
                        lVarV.o(1040258775);
                        androidx.compose.ui.d.Companion companion11119 = androidx.compose.ui.d.INSTANCE;
                        if ((i13 & 112) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI = lVarV.I();
                        if (z11) {
                            objI = new c(str);
                            lVarV.B(objI);
                        } else {
                            objI = new c(str);
                            lVarV.B(objI);
                        }
                        dVarD = g4.o.d(companion11119, false, (wn0.l) objI, 1, null);
                        lVarV.l();
                    } else {
                        lVarV.o(1040398089);
                        lVarV.l();
                        dVarD = androidx.compose.ui.d.INSTANCE;
                    }
                    z3.k kVar117 = kVarE;
                    d3.c cVar117 = cVarE;
                    androidx.compose.ui.d dVarB115 = androidx.compose.ui.draw.d.b(h3.e.b(dVar2.g(dVarD)), bVar2, false, cVar117, kVar117, f12, q1Var3, 2, null);
                    a aVar115 = a.f104201a;
                    iA = p020r2.j.a(lVarV, 0);
                    androidx.compose.ui.d dVarE115 = androidx.compose.ui.c.e(lVarV, dVarB115);
                    p020r2.x xVarC115 = lVarV.c();
                    b4.g.Companion companion111110 = b4.g.INSTANCE;
                    aVarA = companion111110.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.u()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d4.b(lVarA, aVar115, companion111110.c());
                    d4.b(lVarA, xVarC115, companion111110.e());
                    d4.b(lVarA, dVarE115, companion111110.d());
                    pVarB = companion111110.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    lVarV.g();
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    cVar2 = cVar117;
                    kVar2 = kVar117;
                    q1Var4 = q1Var3;
                }
                dVar3 = dVar2;
                f13 = f12;
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(bVar, str, dVar3, cVar2, kVar2, f13, q1Var4, i11, i12));
                }
            }
            i13 |= 196608;
            f12 = f11;
            i21 = i12 & 64;
            if (i21 != 0) {
                i13 |= 1572864;
                q1Var2 = q1Var;
            } else {
                q1Var2 = q1Var;
                if ((i11 & 1572864) == 0) {
                    if (lVarV.n(q1Var2)) {
                        i22 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i22 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i22;
                }
            }
            if ((i13 & 599187) == 599186) {
                if (i23 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    cVarE = d3.c.INSTANCE.e();
                }
                if (i16 != 0) {
                    kVarE = z3.k.INSTANCE.e();
                }
                if (i18 != 0) {
                    f12 = 1.0f;
                }
                if (i21 != 0) {
                    q1Var3 = null;
                } else {
                    q1Var3 = q1Var2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1142754848, i13, -1, "androidx.compose.foundation.Image (Image.kt:243)");
                }
                if (str != null) {
                    lVarV.o(1040258775);
                    androidx.compose.ui.d.Companion companion111111 = androidx.compose.ui.d.INSTANCE;
                    if ((i13 & 112) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new c(str);
                        lVarV.B(objI);
                    } else {
                        objI = new c(str);
                        lVarV.B(objI);
                    }
                    dVarD = g4.o.d(companion111111, false, (wn0.l) objI, 1, null);
                    lVarV.l();
                } else {
                    lVarV.o(1040398089);
                    lVarV.l();
                    dVarD = androidx.compose.ui.d.INSTANCE;
                }
                z3.k kVar118 = kVarE;
                d3.c cVar118 = cVarE;
                androidx.compose.ui.d dVarB116 = androidx.compose.ui.draw.d.b(h3.e.b(dVar2.g(dVarD)), bVar2, false, cVar118, kVar118, f12, q1Var3, 2, null);
                a aVar116 = a.f104201a;
                iA = p020r2.j.a(lVarV, 0);
                androidx.compose.ui.d dVarE116 = androidx.compose.ui.c.e(lVarV, dVarB116);
                p020r2.x xVarC116 = lVarV.c();
                b4.g.Companion companion111112 = b4.g.INSTANCE;
                aVarA = companion111112.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.u()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d4.b(lVarA, aVar116, companion111112.c());
                d4.b(lVarA, xVarC116, companion111112.e());
                d4.b(lVarA, dVarE116, companion111112.d());
                pVarB = companion111112.b();
                if (lVarA.u()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                lVarV.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                cVar2 = cVar118;
                kVar2 = kVar118;
                q1Var4 = q1Var3;
            } else {
                if (i23 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    cVarE = d3.c.INSTANCE.e();
                }
                if (i16 != 0) {
                    kVarE = z3.k.INSTANCE.e();
                }
                if (i18 != 0) {
                    f12 = 1.0f;
                }
                if (i21 != 0) {
                    q1Var3 = null;
                } else {
                    q1Var3 = q1Var2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1142754848, i13, -1, "androidx.compose.foundation.Image (Image.kt:243)");
                }
                if (str != null) {
                    lVarV.o(1040258775);
                    androidx.compose.ui.d.Companion companion111113 = androidx.compose.ui.d.INSTANCE;
                    if ((i13 & 112) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new c(str);
                        lVarV.B(objI);
                    } else {
                        objI = new c(str);
                        lVarV.B(objI);
                    }
                    dVarD = g4.o.d(companion111113, false, (wn0.l) objI, 1, null);
                    lVarV.l();
                } else {
                    lVarV.o(1040398089);
                    lVarV.l();
                    dVarD = androidx.compose.ui.d.INSTANCE;
                }
                z3.k kVar119 = kVarE;
                d3.c cVar119 = cVarE;
                androidx.compose.ui.d dVarB117 = androidx.compose.ui.draw.d.b(h3.e.b(dVar2.g(dVarD)), bVar2, false, cVar119, kVar119, f12, q1Var3, 2, null);
                a aVar117 = a.f104201a;
                iA = p020r2.j.a(lVarV, 0);
                androidx.compose.ui.d dVarE117 = androidx.compose.ui.c.e(lVarV, dVarB117);
                p020r2.x xVarC117 = lVarV.c();
                b4.g.Companion companion111114 = b4.g.INSTANCE;
                aVarA = companion111114.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.u()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d4.b(lVarA, aVar117, companion111114.c());
                d4.b(lVarA, xVarC117, companion111114.e());
                d4.b(lVarA, dVarE117, companion111114.d());
                pVarB = companion111114.b();
                if (lVarA.u()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                lVarV.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                cVar2 = cVar119;
                kVar2 = kVar119;
                q1Var4 = q1Var3;
            }
            dVar3 = dVar2;
            f13 = f12;
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(bVar, str, dVar3, cVar2, kVar2, f13, q1Var4, i11, i12));
            }
        }
        i13 |= 24576;
        kVarE = kVar;
        i18 = i12 & 32;
        if (i18 != 0) {
            if ((196608 & i11) == 0) {
                f12 = f11;
                if (lVarV.q(f12)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i13 |= i19;
            }
            i21 = i12 & 64;
            if (i21 != 0) {
                i13 |= 1572864;
                q1Var2 = q1Var;
            } else {
                q1Var2 = q1Var;
                if ((i11 & 1572864) == 0) {
                    if (lVarV.n(q1Var2)) {
                        i22 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i22 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i22;
                }
            }
            if ((i13 & 599187) == 599186) {
                if (i23 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    cVarE = d3.c.INSTANCE.e();
                }
                if (i16 != 0) {
                    kVarE = z3.k.INSTANCE.e();
                }
                if (i18 != 0) {
                    f12 = 1.0f;
                }
                if (i21 != 0) {
                    q1Var3 = null;
                } else {
                    q1Var3 = q1Var2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1142754848, i13, -1, "androidx.compose.foundation.Image (Image.kt:243)");
                }
                if (str != null) {
                    lVarV.o(1040258775);
                    androidx.compose.ui.d.Companion companion111115 = androidx.compose.ui.d.INSTANCE;
                    if ((i13 & 112) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new c(str);
                        lVarV.B(objI);
                    } else {
                        objI = new c(str);
                        lVarV.B(objI);
                    }
                    dVarD = g4.o.d(companion111115, false, (wn0.l) objI, 1, null);
                    lVarV.l();
                } else {
                    lVarV.o(1040398089);
                    lVarV.l();
                    dVarD = androidx.compose.ui.d.INSTANCE;
                }
                z3.k kVar1110 = kVarE;
                d3.c cVar1110 = cVarE;
                androidx.compose.ui.d dVarB118 = androidx.compose.ui.draw.d.b(h3.e.b(dVar2.g(dVarD)), bVar2, false, cVar1110, kVar1110, f12, q1Var3, 2, null);
                a aVar118 = a.f104201a;
                iA = p020r2.j.a(lVarV, 0);
                androidx.compose.ui.d dVarE118 = androidx.compose.ui.c.e(lVarV, dVarB118);
                p020r2.x xVarC118 = lVarV.c();
                b4.g.Companion companion111116 = b4.g.INSTANCE;
                aVarA = companion111116.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.u()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d4.b(lVarA, aVar118, companion111116.c());
                d4.b(lVarA, xVarC118, companion111116.e());
                d4.b(lVarA, dVarE118, companion111116.d());
                pVarB = companion111116.b();
                if (lVarA.u()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                lVarV.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                cVar2 = cVar1110;
                kVar2 = kVar1110;
                q1Var4 = q1Var3;
            } else {
                if (i23 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    cVarE = d3.c.INSTANCE.e();
                }
                if (i16 != 0) {
                    kVarE = z3.k.INSTANCE.e();
                }
                if (i18 != 0) {
                    f12 = 1.0f;
                }
                if (i21 != 0) {
                    q1Var3 = null;
                } else {
                    q1Var3 = q1Var2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1142754848, i13, -1, "androidx.compose.foundation.Image (Image.kt:243)");
                }
                if (str != null) {
                    lVarV.o(1040258775);
                    androidx.compose.ui.d.Companion companion111117 = androidx.compose.ui.d.INSTANCE;
                    if ((i13 & 112) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI = lVarV.I();
                    if (z11) {
                        objI = new c(str);
                        lVarV.B(objI);
                    } else {
                        objI = new c(str);
                        lVarV.B(objI);
                    }
                    dVarD = g4.o.d(companion111117, false, (wn0.l) objI, 1, null);
                    lVarV.l();
                } else {
                    lVarV.o(1040398089);
                    lVarV.l();
                    dVarD = androidx.compose.ui.d.INSTANCE;
                }
                z3.k kVar1111 = kVarE;
                d3.c cVar1111 = cVarE;
                androidx.compose.ui.d dVarB119 = androidx.compose.ui.draw.d.b(h3.e.b(dVar2.g(dVarD)), bVar2, false, cVar1111, kVar1111, f12, q1Var3, 2, null);
                a aVar119 = a.f104201a;
                iA = p020r2.j.a(lVarV, 0);
                androidx.compose.ui.d dVarE119 = androidx.compose.ui.c.e(lVarV, dVarB119);
                p020r2.x xVarC119 = lVarV.c();
                b4.g.Companion companion111118 = b4.g.INSTANCE;
                aVarA = companion111118.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.u()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d4.b(lVarA, aVar119, companion111118.c());
                d4.b(lVarA, xVarC119, companion111118.e());
                d4.b(lVarA, dVarE119, companion111118.d());
                pVarB = companion111118.b();
                if (lVarA.u()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                lVarV.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                cVar2 = cVar1111;
                kVar2 = kVar1111;
                q1Var4 = q1Var3;
            }
            dVar3 = dVar2;
            f13 = f12;
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(bVar, str, dVar3, cVar2, kVar2, f13, q1Var4, i11, i12));
            }
        }
        i13 |= 196608;
        f12 = f11;
        i21 = i12 & 64;
        if (i21 != 0) {
            i13 |= 1572864;
            q1Var2 = q1Var;
        } else {
            q1Var2 = q1Var;
            if ((i11 & 1572864) == 0) {
                if (lVarV.n(q1Var2)) {
                    i22 = PKIFailureInfo.badCertTemplate;
                } else {
                    i22 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i22;
            }
        }
        if ((i13 & 599187) == 599186) {
            if (i23 != 0) {
                dVar2 = androidx.compose.ui.d.INSTANCE;
            }
            if (i14 != 0) {
                cVarE = d3.c.INSTANCE.e();
            }
            if (i16 != 0) {
                kVarE = z3.k.INSTANCE.e();
            }
            if (i18 != 0) {
                f12 = 1.0f;
            }
            if (i21 != 0) {
                q1Var3 = null;
            } else {
                q1Var3 = q1Var2;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1142754848, i13, -1, "androidx.compose.foundation.Image (Image.kt:243)");
            }
            if (str != null) {
                lVarV.o(1040258775);
                androidx.compose.ui.d.Companion companion111119 = androidx.compose.ui.d.INSTANCE;
                if ((i13 & 112) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI = lVarV.I();
                if (z11) {
                    objI = new c(str);
                    lVarV.B(objI);
                } else {
                    objI = new c(str);
                    lVarV.B(objI);
                }
                dVarD = g4.o.d(companion111119, false, (wn0.l) objI, 1, null);
                lVarV.l();
            } else {
                lVarV.o(1040398089);
                lVarV.l();
                dVarD = androidx.compose.ui.d.INSTANCE;
            }
            z3.k kVar1112 = kVarE;
            d3.c cVar1112 = cVarE;
            androidx.compose.ui.d dVarB1110 = androidx.compose.ui.draw.d.b(h3.e.b(dVar2.g(dVarD)), bVar2, false, cVar1112, kVar1112, f12, q1Var3, 2, null);
            a aVar1110 = a.f104201a;
            iA = p020r2.j.a(lVarV, 0);
            androidx.compose.ui.d dVarE1110 = androidx.compose.ui.c.e(lVarV, dVarB1110);
            p020r2.x xVarC1110 = lVarV.c();
            b4.g.Companion companion1111110 = b4.g.INSTANCE;
            aVarA = companion1111110.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.u()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            lVarA = d4.a(lVarV);
            d4.b(lVarA, aVar1110, companion1111110.c());
            d4.b(lVarA, xVarC1110, companion1111110.e());
            d4.b(lVarA, dVarE1110, companion1111110.d());
            pVarB = companion1111110.b();
            if (lVarA.u()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            lVarV.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            cVar2 = cVar1112;
            kVar2 = kVar1112;
            q1Var4 = q1Var3;
        } else {
            if (i23 != 0) {
                dVar2 = androidx.compose.ui.d.INSTANCE;
            }
            if (i14 != 0) {
                cVarE = d3.c.INSTANCE.e();
            }
            if (i16 != 0) {
                kVarE = z3.k.INSTANCE.e();
            }
            if (i18 != 0) {
                f12 = 1.0f;
            }
            if (i21 != 0) {
                q1Var3 = null;
            } else {
                q1Var3 = q1Var2;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1142754848, i13, -1, "androidx.compose.foundation.Image (Image.kt:243)");
            }
            if (str != null) {
                lVarV.o(1040258775);
                androidx.compose.ui.d.Companion companion1111111 = androidx.compose.ui.d.INSTANCE;
                if ((i13 & 112) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI = lVarV.I();
                if (z11) {
                    objI = new c(str);
                    lVarV.B(objI);
                } else {
                    objI = new c(str);
                    lVarV.B(objI);
                }
                dVarD = g4.o.d(companion1111111, false, (wn0.l) objI, 1, null);
                lVarV.l();
            } else {
                lVarV.o(1040398089);
                lVarV.l();
                dVarD = androidx.compose.ui.d.INSTANCE;
            }
            z3.k kVar1113 = kVarE;
            d3.c cVar1113 = cVarE;
            androidx.compose.ui.d dVarB1111 = androidx.compose.ui.draw.d.b(h3.e.b(dVar2.g(dVarD)), bVar2, false, cVar1113, kVar1113, f12, q1Var3, 2, null);
            a aVar1111 = a.f104201a;
            iA = p020r2.j.a(lVarV, 0);
            androidx.compose.ui.d dVarE1111 = androidx.compose.ui.c.e(lVarV, dVarB1111);
            p020r2.x xVarC1111 = lVarV.c();
            b4.g.Companion companion1111112 = b4.g.INSTANCE;
            aVarA = companion1111112.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.u()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            lVarA = d4.a(lVarV);
            d4.b(lVarA, aVar1111, companion1111112.c());
            d4.b(lVarA, xVarC1111, companion1111112.e());
            d4.b(lVarA, dVarE1111, companion1111112.d());
            pVarB = companion1111112.b();
            if (lVarA.u()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            lVarV.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            cVar2 = cVar1113;
            kVar2 = kVar1113;
            q1Var4 = q1Var3;
        }
        dVar3 = dVar2;
        f13 = f12;
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(bVar, str, dVar3, cVar2, kVar2, f13, q1Var4, i11, i12));
        }
    }

    public static final void b(i3 i3Var, String str, androidx.compose.ui.d dVar, d3.c cVar, z3.k kVar, float f11, q1 q1Var, int i11, p020r2.l lVar, int i12, int i13) {
        androidx.compose.ui.d dVar2 = (i13 & 4) != 0 ? androidx.compose.ui.d.INSTANCE : dVar;
        d3.c cVarE = (i13 & 8) != 0 ? d3.c.INSTANCE.e() : cVar;
        z3.k kVarE = (i13 & 16) != 0 ? z3.k.INSTANCE.e() : kVar;
        float f12 = (i13 & 32) != 0 ? 1.0f : f11;
        q1 q1Var2 = (i13 & 64) != 0 ? null : q1Var;
        int iB = (i13 & 128) != 0 ? m3.f.INSTANCE.b() : i11;
        if (p020r2.o.J()) {
            p020r2.o.S(-1396260732, i12, -1, "androidx.compose.foundation.Image (Image.kt:152)");
        }
        boolean zN = lVar.n(i3Var);
        Object objI = lVar.I();
        if (zN || objI == p020r2.l.INSTANCE.a()) {
            objI = androidx.compose.ui.graphics.painter.a.b(i3Var, 0L, 0L, iB, 6, null);
            lVar.B(objI);
        }
        a((BitmapPainter) objI, str, dVar2, cVarE, kVarE, f12, q1Var2, lVar, i12 & 4194288, 0);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lz3/k0;", "", "Lz3/h0;", "<anonymous parameter 0>", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Ljava/util/List;J)Lz3/j0;"}, k = 3, mv = {1, 8, 0})
    static final class a implements z3.i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f104201a = new a();

        a() {
        }

        @Override // z3.i0
        public final z3.j0 c(z3.k0 k0Var, List<? extends z3.h0> list, long j11) {
            return z3.k0.N1(k0Var, w4.b.n(j11), w4.b.m(j11), null, C2207a.f104202c, 4, null);
        }

        /* JADX INFO: renamed from: q1.b0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class C2207a extends p013kotlin.jvm.internal.u implements wn0.l<w0.a, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C2207a f104202c = new C2207a();

            C2207a() {
                super(1);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ jn0.h0 invoke(w0.a aVar) {
                a(aVar);
                return jn0.h0.f84049a;
            }

            public final void a(w0.a aVar) {
            }
        }
    }
}
