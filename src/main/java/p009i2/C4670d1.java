package p009i2;

import androidx.compose.ui.d;
import b4.g;
import d3.c;
import ezvcard.property.Gender;
import g4.i;
import jn0.h0;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.d4;
import p020r2.h2;
import p020r2.j;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w;
import p020r2.w2;
import p020r2.x;
import w4.h;
import wn0.p;
import z3.i0;

/* JADX INFO: renamed from: i2.d1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\n\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\r¨\u0006\u000f"}, d2 = {"Lkotlin/Function0;", "Ljn0/h0;", "onClick", "Landroidx/compose/ui/d;", "modifier", "", "enabled", "Lu1/l;", "interactionSource", "content", "a", "(Lwn0/a;Landroidx/compose/ui/d;ZLu1/l;Lwn0/p;Lr2/l;II)V", "Lw4/h;", Gender.FEMALE, "RippleRadius", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class C4670d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f74285a = h.g(24);

    /* JADX INFO: renamed from: i2.d1$a */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f74286c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f74287d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f74288e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ u1.l f74289f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f74290g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f74291h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f74292i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(wn0.a<h0> aVar, d dVar, boolean z11, u1.l lVar, p<? super l, ? super Integer, h0> pVar, int i11, int i12) {
            super(2);
            this.f74286c = aVar;
            this.f74287d = dVar;
            this.f74288e = z11;
            this.f74289f = lVar;
            this.f74290g = pVar;
            this.f74291h = i11;
            this.f74292i = i12;
        }

        public final void a(l lVar, int i11) {
            C4670d1.a(this.f74286c, this.f74287d, this.f74288e, this.f74289f, this.f74290g, lVar, k2.a(this.f74291h | 1), this.f74292i);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:76:0x0111  */
    /* JADX WARN: Code duplicated, block: B:79:0x011d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0121  */
    /* JADX WARN: Code duplicated, block: B:83:0x0140  */
    /* JADX WARN: Code duplicated, block: B:85:0x014e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0167  */
    /* JADX WARN: Code duplicated, block: B:90:0x017f  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public static final void a(wn0.a<h0> aVar, d dVar, boolean z11, u1.l lVar, p<? super l, ? super Integer, h0> pVar, l lVar2, int i11, int i12) {
        wn0.a<h0> aVar2;
        int i13;
        d dVar2;
        int i14;
        boolean z12;
        int i15;
        int i16;
        u1.l lVar3;
        int i17;
        int i18;
        d dVar3;
        boolean z13;
        u1.l lVar4;
        int iA;
        wn0.a<g> aVarA;
        l lVarA;
        p<g, Integer, h0> pVarB;
        float fB;
        d dVar4;
        u1.l lVar5;
        boolean z14;
        w2 w2VarX;
        l lVarV = lVar2.v(-111063634);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
            aVar2 = aVar;
        } else if ((i11 & 6) == 0) {
            aVar2 = aVar;
            i13 = (lVarV.K(aVar2) ? 4 : 2) | i11;
        } else {
            aVar2 = aVar;
            i13 = i11;
        }
        int i19 = i12 & 2;
        if (i19 == 0) {
            if ((i11 & 48) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                    z12 = z11;
                    if (lVarV.p(z12)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 8;
                if (i16 != 0) {
                    if ((i11 & 3072) == 0) {
                        lVar3 = lVar;
                        if (lVarV.n(lVar3)) {
                            i17 = 2048;
                        } else {
                            i17 = 1024;
                        }
                        i13 |= i17;
                    }
                    if ((i12 & 16) != 0) {
                        i13 |= 24576;
                    } else if ((i11 & 24576) == 0) {
                        if (lVarV.K(pVar)) {
                            i18 = 16384;
                        } else {
                            i18 = PKIFailureInfo.certRevoked;
                        }
                        i13 |= i18;
                    }
                    if ((i13 & 9363) == 9362 || !lVarV.b()) {
                        if (i19 != 0) {
                            dVar3 = d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (o.J()) {
                            o.S(-111063634, i13, -1, "androidx.compose.material.IconButton (IconButton.kt:62)");
                        }
                        u1.l lVar6 = lVar4;
                        d dVarB = androidx.compose.foundation.d.b(g1.c(dVar3), lVar6, androidx.compose.material.d.g(false, f74285a, 0L, lVarV, 54, 4), z13, null, i.h(i.INSTANCE.a()), aVar2, 8, null);
                        i0 i0VarH = androidx.compose.foundation.layout.g.h(c.INSTANCE.e(), false);
                        iA = j.a(lVarV, 0);
                        x xVarC = lVarV.c();
                        d dVarE = androidx.compose.ui.c.e(lVarV, dVarB);
                        g.Companion companion = g.INSTANCE;
                        aVarA = companion.a();
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
                        d4.b(lVarA, i0VarH, companion.c());
                        d4.b(lVarA, xVarC, companion.e());
                        pVarB = companion.b();
                        if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        d4.b(lVarA, dVarE, companion.d());
                        androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
                        if (z13) {
                            lVarV.o(1885392311);
                            fB = ((Number) lVarV.U(y.a())).floatValue();
                        } else {
                            lVarV.o(1885393144);
                            fB = x.f75438a.b(lVarV, 6);
                        }
                        lVarV.l();
                        w.a(y.a().d(Float.valueOf(fB)), pVar, lVarV, h2.f106566i | ((i13 >> 9) & 112));
                        lVarV.g();
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar3;
                        lVar5 = lVar6;
                        z14 = z13;
                    } else {
                        lVarV.j();
                        dVar4 = dVar2;
                        z14 = z12;
                        lVar5 = lVar3;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new a(aVar, dVar4, z14, lVar5, pVar, i11, i12));
                    }
                }
                i13 |= 3072;
                lVar3 = lVar;
                if ((i12 & 16) != 0) {
                    i13 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    if (lVarV.K(pVar)) {
                        i18 = 16384;
                    } else {
                        i18 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i18;
                }
                if ((i13 & 9363) == 9362) {
                    if (i19 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if (o.J()) {
                        o.S(-111063634, i13, -1, "androidx.compose.material.IconButton (IconButton.kt:62)");
                    }
                    u1.l lVar7 = lVar4;
                    d dVarB2 = androidx.compose.foundation.d.b(g1.c(dVar3), lVar7, androidx.compose.material.d.g(false, f74285a, 0L, lVarV, 54, 4), z13, null, i.h(i.INSTANCE.a()), aVar2, 8, null);
                    i0 i0VarH2 = androidx.compose.foundation.layout.g.h(c.INSTANCE.e(), false);
                    iA = j.a(lVarV, 0);
                    x xVarC2 = lVarV.c();
                    d dVarE2 = androidx.compose.ui.c.e(lVarV, dVarB2);
                    g.Companion companion2 = g.INSTANCE;
                    aVarA = companion2.a();
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
                    d4.b(lVarA, i0VarH2, companion2.c());
                    d4.b(lVarA, xVarC2, companion2.e());
                    pVarB = companion2.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    d4.b(lVarA, dVarE2, companion2.d());
                    androidx.compose.foundation.layout.i iVar2 = androidx.compose.foundation.layout.i.f4585a;
                    if (z13) {
                        lVarV.o(1885392311);
                        fB = ((Number) lVarV.U(y.a())).floatValue();
                    } else {
                        lVarV.o(1885393144);
                        fB = x.f75438a.b(lVarV, 6);
                    }
                    lVarV.l();
                    w.a(y.a().d(Float.valueOf(fB)), pVar, lVarV, h2.f106566i | ((i13 >> 9) & 112));
                    lVarV.g();
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar3;
                    lVar5 = lVar7;
                    z14 = z13;
                } else {
                    if (i19 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if (o.J()) {
                        o.S(-111063634, i13, -1, "androidx.compose.material.IconButton (IconButton.kt:62)");
                    }
                    u1.l lVar8 = lVar4;
                    d dVarB3 = androidx.compose.foundation.d.b(g1.c(dVar3), lVar8, androidx.compose.material.d.g(false, f74285a, 0L, lVarV, 54, 4), z13, null, i.h(i.INSTANCE.a()), aVar2, 8, null);
                    i0 i0VarH3 = androidx.compose.foundation.layout.g.h(c.INSTANCE.e(), false);
                    iA = j.a(lVarV, 0);
                    x xVarC3 = lVarV.c();
                    d dVarE3 = androidx.compose.ui.c.e(lVarV, dVarB3);
                    g.Companion companion3 = g.INSTANCE;
                    aVarA = companion3.a();
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
                    d4.b(lVarA, i0VarH3, companion3.c());
                    d4.b(lVarA, xVarC3, companion3.e());
                    pVarB = companion3.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    d4.b(lVarA, dVarE3, companion3.d());
                    androidx.compose.foundation.layout.i iVar3 = androidx.compose.foundation.layout.i.f4585a;
                    if (z13) {
                        lVarV.o(1885392311);
                        fB = ((Number) lVarV.U(y.a())).floatValue();
                    } else {
                        lVarV.o(1885393144);
                        fB = x.f75438a.b(lVarV, 6);
                    }
                    lVarV.l();
                    w.a(y.a().d(Float.valueOf(fB)), pVar, lVarV, h2.f106566i | ((i13 >> 9) & 112));
                    lVarV.g();
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar3;
                    lVar5 = lVar8;
                    z14 = z13;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new a(aVar, dVar4, z14, lVar5, pVar, i11, i12));
                }
            }
            i13 |= KyberEngine.KyberPolyBytes;
            z12 = z11;
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 3072) == 0) {
                    lVar3 = lVar;
                    if (lVarV.n(lVar3)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                if ((i12 & 16) != 0) {
                    i13 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    if (lVarV.K(pVar)) {
                        i18 = 16384;
                    } else {
                        i18 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i18;
                }
                if ((i13 & 9363) == 9362) {
                    if (i19 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if (o.J()) {
                        o.S(-111063634, i13, -1, "androidx.compose.material.IconButton (IconButton.kt:62)");
                    }
                    u1.l lVar9 = lVar4;
                    d dVarB4 = androidx.compose.foundation.d.b(g1.c(dVar3), lVar9, androidx.compose.material.d.g(false, f74285a, 0L, lVarV, 54, 4), z13, null, i.h(i.INSTANCE.a()), aVar2, 8, null);
                    i0 i0VarH4 = androidx.compose.foundation.layout.g.h(c.INSTANCE.e(), false);
                    iA = j.a(lVarV, 0);
                    x xVarC4 = lVarV.c();
                    d dVarE4 = androidx.compose.ui.c.e(lVarV, dVarB4);
                    g.Companion companion4 = g.INSTANCE;
                    aVarA = companion4.a();
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
                    d4.b(lVarA, i0VarH4, companion4.c());
                    d4.b(lVarA, xVarC4, companion4.e());
                    pVarB = companion4.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    d4.b(lVarA, dVarE4, companion4.d());
                    androidx.compose.foundation.layout.i iVar4 = androidx.compose.foundation.layout.i.f4585a;
                    if (z13) {
                        lVarV.o(1885392311);
                        fB = ((Number) lVarV.U(y.a())).floatValue();
                    } else {
                        lVarV.o(1885393144);
                        fB = x.f75438a.b(lVarV, 6);
                    }
                    lVarV.l();
                    w.a(y.a().d(Float.valueOf(fB)), pVar, lVarV, h2.f106566i | ((i13 >> 9) & 112));
                    lVarV.g();
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar3;
                    lVar5 = lVar9;
                    z14 = z13;
                } else {
                    if (i19 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if (o.J()) {
                        o.S(-111063634, i13, -1, "androidx.compose.material.IconButton (IconButton.kt:62)");
                    }
                    u1.l lVar10 = lVar4;
                    d dVarB5 = androidx.compose.foundation.d.b(g1.c(dVar3), lVar10, androidx.compose.material.d.g(false, f74285a, 0L, lVarV, 54, 4), z13, null, i.h(i.INSTANCE.a()), aVar2, 8, null);
                    i0 i0VarH5 = androidx.compose.foundation.layout.g.h(c.INSTANCE.e(), false);
                    iA = j.a(lVarV, 0);
                    x xVarC5 = lVarV.c();
                    d dVarE5 = androidx.compose.ui.c.e(lVarV, dVarB5);
                    g.Companion companion5 = g.INSTANCE;
                    aVarA = companion5.a();
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
                    d4.b(lVarA, i0VarH5, companion5.c());
                    d4.b(lVarA, xVarC5, companion5.e());
                    pVarB = companion5.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    d4.b(lVarA, dVarE5, companion5.d());
                    androidx.compose.foundation.layout.i iVar5 = androidx.compose.foundation.layout.i.f4585a;
                    if (z13) {
                        lVarV.o(1885392311);
                        fB = ((Number) lVarV.U(y.a())).floatValue();
                    } else {
                        lVarV.o(1885393144);
                        fB = x.f75438a.b(lVarV, 6);
                    }
                    lVarV.l();
                    w.a(y.a().d(Float.valueOf(fB)), pVar, lVarV, h2.f106566i | ((i13 >> 9) & 112));
                    lVarV.g();
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar3;
                    lVar5 = lVar10;
                    z14 = z13;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new a(aVar, dVar4, z14, lVar5, pVar, i11, i12));
                }
            }
            i13 |= 3072;
            lVar3 = lVar;
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                if (lVarV.K(pVar)) {
                    i18 = 16384;
                } else {
                    i18 = PKIFailureInfo.certRevoked;
                }
                i13 |= i18;
            }
            if ((i13 & 9363) == 9362) {
                if (i19 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i16 != 0) {
                    lVar4 = null;
                } else {
                    lVar4 = lVar3;
                }
                if (o.J()) {
                    o.S(-111063634, i13, -1, "androidx.compose.material.IconButton (IconButton.kt:62)");
                }
                u1.l lVar11 = lVar4;
                d dVarB6 = androidx.compose.foundation.d.b(g1.c(dVar3), lVar11, androidx.compose.material.d.g(false, f74285a, 0L, lVarV, 54, 4), z13, null, i.h(i.INSTANCE.a()), aVar2, 8, null);
                i0 i0VarH6 = androidx.compose.foundation.layout.g.h(c.INSTANCE.e(), false);
                iA = j.a(lVarV, 0);
                x xVarC6 = lVarV.c();
                d dVarE6 = androidx.compose.ui.c.e(lVarV, dVarB6);
                g.Companion companion6 = g.INSTANCE;
                aVarA = companion6.a();
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
                d4.b(lVarA, i0VarH6, companion6.c());
                d4.b(lVarA, xVarC6, companion6.e());
                pVarB = companion6.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                d4.b(lVarA, dVarE6, companion6.d());
                androidx.compose.foundation.layout.i iVar6 = androidx.compose.foundation.layout.i.f4585a;
                if (z13) {
                    lVarV.o(1885392311);
                    fB = ((Number) lVarV.U(y.a())).floatValue();
                } else {
                    lVarV.o(1885393144);
                    fB = x.f75438a.b(lVarV, 6);
                }
                lVarV.l();
                w.a(y.a().d(Float.valueOf(fB)), pVar, lVarV, h2.f106566i | ((i13 >> 9) & 112));
                lVarV.g();
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar3;
                lVar5 = lVar11;
                z14 = z13;
            } else {
                if (i19 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i16 != 0) {
                    lVar4 = null;
                } else {
                    lVar4 = lVar3;
                }
                if (o.J()) {
                    o.S(-111063634, i13, -1, "androidx.compose.material.IconButton (IconButton.kt:62)");
                }
                u1.l lVar12 = lVar4;
                d dVarB7 = androidx.compose.foundation.d.b(g1.c(dVar3), lVar12, androidx.compose.material.d.g(false, f74285a, 0L, lVarV, 54, 4), z13, null, i.h(i.INSTANCE.a()), aVar2, 8, null);
                i0 i0VarH7 = androidx.compose.foundation.layout.g.h(c.INSTANCE.e(), false);
                iA = j.a(lVarV, 0);
                x xVarC7 = lVarV.c();
                d dVarE7 = androidx.compose.ui.c.e(lVarV, dVarB7);
                g.Companion companion7 = g.INSTANCE;
                aVarA = companion7.a();
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
                d4.b(lVarA, i0VarH7, companion7.c());
                d4.b(lVarA, xVarC7, companion7.e());
                pVarB = companion7.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                d4.b(lVarA, dVarE7, companion7.d());
                androidx.compose.foundation.layout.i iVar7 = androidx.compose.foundation.layout.i.f4585a;
                if (z13) {
                    lVarV.o(1885392311);
                    fB = ((Number) lVarV.U(y.a())).floatValue();
                } else {
                    lVarV.o(1885393144);
                    fB = x.f75438a.b(lVarV, 6);
                }
                lVarV.l();
                w.a(y.a().d(Float.valueOf(fB)), pVar, lVarV, h2.f106566i | ((i13 >> 9) & 112));
                lVarV.g();
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar3;
                lVar5 = lVar12;
                z14 = z13;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new a(aVar, dVar4, z14, lVar5, pVar, i11, i12));
            }
        }
        i13 |= 48;
        dVar2 = dVar;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                z12 = z11;
                if (lVarV.p(z12)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 3072) == 0) {
                    lVar3 = lVar;
                    if (lVarV.n(lVar3)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                if ((i12 & 16) != 0) {
                    i13 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    if (lVarV.K(pVar)) {
                        i18 = 16384;
                    } else {
                        i18 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i18;
                }
                if ((i13 & 9363) == 9362) {
                    if (i19 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if (o.J()) {
                        o.S(-111063634, i13, -1, "androidx.compose.material.IconButton (IconButton.kt:62)");
                    }
                    u1.l lVar13 = lVar4;
                    d dVarB8 = androidx.compose.foundation.d.b(g1.c(dVar3), lVar13, androidx.compose.material.d.g(false, f74285a, 0L, lVarV, 54, 4), z13, null, i.h(i.INSTANCE.a()), aVar2, 8, null);
                    i0 i0VarH8 = androidx.compose.foundation.layout.g.h(c.INSTANCE.e(), false);
                    iA = j.a(lVarV, 0);
                    x xVarC8 = lVarV.c();
                    d dVarE8 = androidx.compose.ui.c.e(lVarV, dVarB8);
                    g.Companion companion8 = g.INSTANCE;
                    aVarA = companion8.a();
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
                    d4.b(lVarA, i0VarH8, companion8.c());
                    d4.b(lVarA, xVarC8, companion8.e());
                    pVarB = companion8.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    d4.b(lVarA, dVarE8, companion8.d());
                    androidx.compose.foundation.layout.i iVar8 = androidx.compose.foundation.layout.i.f4585a;
                    if (z13) {
                        lVarV.o(1885392311);
                        fB = ((Number) lVarV.U(y.a())).floatValue();
                    } else {
                        lVarV.o(1885393144);
                        fB = x.f75438a.b(lVarV, 6);
                    }
                    lVarV.l();
                    w.a(y.a().d(Float.valueOf(fB)), pVar, lVarV, h2.f106566i | ((i13 >> 9) & 112));
                    lVarV.g();
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar3;
                    lVar5 = lVar13;
                    z14 = z13;
                } else {
                    if (i19 != 0) {
                        dVar3 = d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if (o.J()) {
                        o.S(-111063634, i13, -1, "androidx.compose.material.IconButton (IconButton.kt:62)");
                    }
                    u1.l lVar14 = lVar4;
                    d dVarB9 = androidx.compose.foundation.d.b(g1.c(dVar3), lVar14, androidx.compose.material.d.g(false, f74285a, 0L, lVarV, 54, 4), z13, null, i.h(i.INSTANCE.a()), aVar2, 8, null);
                    i0 i0VarH9 = androidx.compose.foundation.layout.g.h(c.INSTANCE.e(), false);
                    iA = j.a(lVarV, 0);
                    x xVarC9 = lVarV.c();
                    d dVarE9 = androidx.compose.ui.c.e(lVarV, dVarB9);
                    g.Companion companion9 = g.INSTANCE;
                    aVarA = companion9.a();
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
                    d4.b(lVarA, i0VarH9, companion9.c());
                    d4.b(lVarA, xVarC9, companion9.e());
                    pVarB = companion9.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    d4.b(lVarA, dVarE9, companion9.d());
                    androidx.compose.foundation.layout.i iVar9 = androidx.compose.foundation.layout.i.f4585a;
                    if (z13) {
                        lVarV.o(1885392311);
                        fB = ((Number) lVarV.U(y.a())).floatValue();
                    } else {
                        lVarV.o(1885393144);
                        fB = x.f75438a.b(lVarV, 6);
                    }
                    lVarV.l();
                    w.a(y.a().d(Float.valueOf(fB)), pVar, lVarV, h2.f106566i | ((i13 >> 9) & 112));
                    lVarV.g();
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar3;
                    lVar5 = lVar14;
                    z14 = z13;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new a(aVar, dVar4, z14, lVar5, pVar, i11, i12));
                }
            }
            i13 |= 3072;
            lVar3 = lVar;
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                if (lVarV.K(pVar)) {
                    i18 = 16384;
                } else {
                    i18 = PKIFailureInfo.certRevoked;
                }
                i13 |= i18;
            }
            if ((i13 & 9363) == 9362) {
                if (i19 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i16 != 0) {
                    lVar4 = null;
                } else {
                    lVar4 = lVar3;
                }
                if (o.J()) {
                    o.S(-111063634, i13, -1, "androidx.compose.material.IconButton (IconButton.kt:62)");
                }
                u1.l lVar15 = lVar4;
                d dVarB10 = androidx.compose.foundation.d.b(g1.c(dVar3), lVar15, androidx.compose.material.d.g(false, f74285a, 0L, lVarV, 54, 4), z13, null, i.h(i.INSTANCE.a()), aVar2, 8, null);
                i0 i0VarH10 = androidx.compose.foundation.layout.g.h(c.INSTANCE.e(), false);
                iA = j.a(lVarV, 0);
                x xVarC10 = lVarV.c();
                d dVarE10 = androidx.compose.ui.c.e(lVarV, dVarB10);
                g.Companion companion10 = g.INSTANCE;
                aVarA = companion10.a();
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
                d4.b(lVarA, i0VarH10, companion10.c());
                d4.b(lVarA, xVarC10, companion10.e());
                pVarB = companion10.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                d4.b(lVarA, dVarE10, companion10.d());
                androidx.compose.foundation.layout.i iVar10 = androidx.compose.foundation.layout.i.f4585a;
                if (z13) {
                    lVarV.o(1885392311);
                    fB = ((Number) lVarV.U(y.a())).floatValue();
                } else {
                    lVarV.o(1885393144);
                    fB = x.f75438a.b(lVarV, 6);
                }
                lVarV.l();
                w.a(y.a().d(Float.valueOf(fB)), pVar, lVarV, h2.f106566i | ((i13 >> 9) & 112));
                lVarV.g();
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar3;
                lVar5 = lVar15;
                z14 = z13;
            } else {
                if (i19 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i16 != 0) {
                    lVar4 = null;
                } else {
                    lVar4 = lVar3;
                }
                if (o.J()) {
                    o.S(-111063634, i13, -1, "androidx.compose.material.IconButton (IconButton.kt:62)");
                }
                u1.l lVar16 = lVar4;
                d dVarB11 = androidx.compose.foundation.d.b(g1.c(dVar3), lVar16, androidx.compose.material.d.g(false, f74285a, 0L, lVarV, 54, 4), z13, null, i.h(i.INSTANCE.a()), aVar2, 8, null);
                i0 i0VarH11 = androidx.compose.foundation.layout.g.h(c.INSTANCE.e(), false);
                iA = j.a(lVarV, 0);
                x xVarC11 = lVarV.c();
                d dVarE11 = androidx.compose.ui.c.e(lVarV, dVarB11);
                g.Companion companion11 = g.INSTANCE;
                aVarA = companion11.a();
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
                d4.b(lVarA, i0VarH11, companion11.c());
                d4.b(lVarA, xVarC11, companion11.e());
                pVarB = companion11.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                d4.b(lVarA, dVarE11, companion11.d());
                androidx.compose.foundation.layout.i iVar11 = androidx.compose.foundation.layout.i.f4585a;
                if (z13) {
                    lVarV.o(1885392311);
                    fB = ((Number) lVarV.U(y.a())).floatValue();
                } else {
                    lVarV.o(1885393144);
                    fB = x.f75438a.b(lVarV, 6);
                }
                lVarV.l();
                w.a(y.a().d(Float.valueOf(fB)), pVar, lVarV, h2.f106566i | ((i13 >> 9) & 112));
                lVarV.g();
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar3;
                lVar5 = lVar16;
                z14 = z13;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new a(aVar, dVar4, z14, lVar5, pVar, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        z12 = z11;
        i16 = i12 & 8;
        if (i16 != 0) {
            if ((i11 & 3072) == 0) {
                lVar3 = lVar;
                if (lVarV.n(lVar3)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i13 |= i17;
            }
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                if (lVarV.K(pVar)) {
                    i18 = 16384;
                } else {
                    i18 = PKIFailureInfo.certRevoked;
                }
                i13 |= i18;
            }
            if ((i13 & 9363) == 9362) {
                if (i19 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i16 != 0) {
                    lVar4 = null;
                } else {
                    lVar4 = lVar3;
                }
                if (o.J()) {
                    o.S(-111063634, i13, -1, "androidx.compose.material.IconButton (IconButton.kt:62)");
                }
                u1.l lVar17 = lVar4;
                d dVarB12 = androidx.compose.foundation.d.b(g1.c(dVar3), lVar17, androidx.compose.material.d.g(false, f74285a, 0L, lVarV, 54, 4), z13, null, i.h(i.INSTANCE.a()), aVar2, 8, null);
                i0 i0VarH12 = androidx.compose.foundation.layout.g.h(c.INSTANCE.e(), false);
                iA = j.a(lVarV, 0);
                x xVarC12 = lVarV.c();
                d dVarE12 = androidx.compose.ui.c.e(lVarV, dVarB12);
                g.Companion companion12 = g.INSTANCE;
                aVarA = companion12.a();
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
                d4.b(lVarA, i0VarH12, companion12.c());
                d4.b(lVarA, xVarC12, companion12.e());
                pVarB = companion12.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                d4.b(lVarA, dVarE12, companion12.d());
                androidx.compose.foundation.layout.i iVar12 = androidx.compose.foundation.layout.i.f4585a;
                if (z13) {
                    lVarV.o(1885392311);
                    fB = ((Number) lVarV.U(y.a())).floatValue();
                } else {
                    lVarV.o(1885393144);
                    fB = x.f75438a.b(lVarV, 6);
                }
                lVarV.l();
                w.a(y.a().d(Float.valueOf(fB)), pVar, lVarV, h2.f106566i | ((i13 >> 9) & 112));
                lVarV.g();
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar3;
                lVar5 = lVar17;
                z14 = z13;
            } else {
                if (i19 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i16 != 0) {
                    lVar4 = null;
                } else {
                    lVar4 = lVar3;
                }
                if (o.J()) {
                    o.S(-111063634, i13, -1, "androidx.compose.material.IconButton (IconButton.kt:62)");
                }
                u1.l lVar18 = lVar4;
                d dVarB13 = androidx.compose.foundation.d.b(g1.c(dVar3), lVar18, androidx.compose.material.d.g(false, f74285a, 0L, lVarV, 54, 4), z13, null, i.h(i.INSTANCE.a()), aVar2, 8, null);
                i0 i0VarH13 = androidx.compose.foundation.layout.g.h(c.INSTANCE.e(), false);
                iA = j.a(lVarV, 0);
                x xVarC13 = lVarV.c();
                d dVarE13 = androidx.compose.ui.c.e(lVarV, dVarB13);
                g.Companion companion13 = g.INSTANCE;
                aVarA = companion13.a();
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
                d4.b(lVarA, i0VarH13, companion13.c());
                d4.b(lVarA, xVarC13, companion13.e());
                pVarB = companion13.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                d4.b(lVarA, dVarE13, companion13.d());
                androidx.compose.foundation.layout.i iVar13 = androidx.compose.foundation.layout.i.f4585a;
                if (z13) {
                    lVarV.o(1885392311);
                    fB = ((Number) lVarV.U(y.a())).floatValue();
                } else {
                    lVarV.o(1885393144);
                    fB = x.f75438a.b(lVarV, 6);
                }
                lVarV.l();
                w.a(y.a().d(Float.valueOf(fB)), pVar, lVarV, h2.f106566i | ((i13 >> 9) & 112));
                lVarV.g();
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar3;
                lVar5 = lVar18;
                z14 = z13;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new a(aVar, dVar4, z14, lVar5, pVar, i11, i12));
            }
        }
        i13 |= 3072;
        lVar3 = lVar;
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            if (lVarV.K(pVar)) {
                i18 = 16384;
            } else {
                i18 = PKIFailureInfo.certRevoked;
            }
            i13 |= i18;
        }
        if ((i13 & 9363) == 9362) {
            if (i19 != 0) {
                dVar3 = d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i14 != 0) {
                z13 = true;
            } else {
                z13 = z12;
            }
            if (i16 != 0) {
                lVar4 = null;
            } else {
                lVar4 = lVar3;
            }
            if (o.J()) {
                o.S(-111063634, i13, -1, "androidx.compose.material.IconButton (IconButton.kt:62)");
            }
            u1.l lVar19 = lVar4;
            d dVarB14 = androidx.compose.foundation.d.b(g1.c(dVar3), lVar19, androidx.compose.material.d.g(false, f74285a, 0L, lVarV, 54, 4), z13, null, i.h(i.INSTANCE.a()), aVar2, 8, null);
            i0 i0VarH14 = androidx.compose.foundation.layout.g.h(c.INSTANCE.e(), false);
            iA = j.a(lVarV, 0);
            x xVarC14 = lVarV.c();
            d dVarE14 = androidx.compose.ui.c.e(lVarV, dVarB14);
            g.Companion companion14 = g.INSTANCE;
            aVarA = companion14.a();
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
            d4.b(lVarA, i0VarH14, companion14.c());
            d4.b(lVarA, xVarC14, companion14.e());
            pVarB = companion14.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE14, companion14.d());
            androidx.compose.foundation.layout.i iVar14 = androidx.compose.foundation.layout.i.f4585a;
            if (z13) {
                lVarV.o(1885392311);
                fB = ((Number) lVarV.U(y.a())).floatValue();
            } else {
                lVarV.o(1885393144);
                fB = x.f75438a.b(lVarV, 6);
            }
            lVarV.l();
            w.a(y.a().d(Float.valueOf(fB)), pVar, lVarV, h2.f106566i | ((i13 >> 9) & 112));
            lVarV.g();
            if (o.J()) {
                o.R();
            }
            dVar4 = dVar3;
            lVar5 = lVar19;
            z14 = z13;
        } else {
            if (i19 != 0) {
                dVar3 = d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i14 != 0) {
                z13 = true;
            } else {
                z13 = z12;
            }
            if (i16 != 0) {
                lVar4 = null;
            } else {
                lVar4 = lVar3;
            }
            if (o.J()) {
                o.S(-111063634, i13, -1, "androidx.compose.material.IconButton (IconButton.kt:62)");
            }
            u1.l lVar110 = lVar4;
            d dVarB15 = androidx.compose.foundation.d.b(g1.c(dVar3), lVar110, androidx.compose.material.d.g(false, f74285a, 0L, lVarV, 54, 4), z13, null, i.h(i.INSTANCE.a()), aVar2, 8, null);
            i0 i0VarH15 = androidx.compose.foundation.layout.g.h(c.INSTANCE.e(), false);
            iA = j.a(lVarV, 0);
            x xVarC15 = lVarV.c();
            d dVarE15 = androidx.compose.ui.c.e(lVarV, dVarB15);
            g.Companion companion15 = g.INSTANCE;
            aVarA = companion15.a();
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
            d4.b(lVarA, i0VarH15, companion15.c());
            d4.b(lVarA, xVarC15, companion15.e());
            pVarB = companion15.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE15, companion15.d());
            androidx.compose.foundation.layout.i iVar15 = androidx.compose.foundation.layout.i.f4585a;
            if (z13) {
                lVarV.o(1885392311);
                fB = ((Number) lVarV.U(y.a())).floatValue();
            } else {
                lVarV.o(1885393144);
                fB = x.f75438a.b(lVarV, 6);
            }
            lVarV.l();
            w.a(y.a().d(Float.valueOf(fB)), pVar, lVarV, h2.f106566i | ((i13 >> 9) & 112));
            lVarV.g();
            if (o.J()) {
                o.R();
            }
            dVar4 = dVar3;
            lVar5 = lVar110;
            z14 = z13;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(aVar, dVar4, z14, lVar5, pVar, i11, i12));
        }
    }
}
