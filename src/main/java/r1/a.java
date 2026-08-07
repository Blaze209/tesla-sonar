package r1;

import jn0.h0;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.d4;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import p020r2.x;
import wn0.p;
import z3.i0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a[\u0010\r\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001aC\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lr1/i;", "state", "Lkotlin/Function0;", "Ljn0/h0;", "onDismiss", "Lkotlin/Function1;", "Lr1/g;", "contextMenuBuilderBlock", "Landroidx/compose/ui/d;", "modifier", "", "enabled", "content", "b", "(Lr1/i;Lwn0/a;Lwn0/l;Landroidx/compose/ui/d;ZLwn0/p;Lr2/l;II)V", "a", "(Lr1/i;Lwn0/a;Landroidx/compose/ui/d;Lwn0/l;Lr2/l;II)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: r1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C2259a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ContextMenuState f106335c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f106336d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f106337e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.l<g, h0> f106338f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f106339g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f106340h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2259a(ContextMenuState contextMenuState, wn0.a<h0> aVar, androidx.compose.ui.d dVar, wn0.l<? super g, h0> lVar, int i11, int i12) {
            super(2);
            this.f106335c = contextMenuState;
            this.f106336d = aVar;
            this.f106337e = dVar;
            this.f106338f = lVar;
            this.f106339g = i11;
            this.f106340h = i12;
        }

        public final void a(l lVar, int i11) {
            a.a(this.f106335c, this.f106336d, this.f106337e, this.f106338f, lVar, k2.a(this.f106339g | 1), this.f106340h);
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
        final /* synthetic */ ContextMenuState f106341c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f106342d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f106343e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.l<g, h0> f106344f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f106345g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f106346h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ContextMenuState contextMenuState, wn0.a<h0> aVar, androidx.compose.ui.d dVar, wn0.l<? super g, h0> lVar, int i11, int i12) {
            super(2);
            this.f106341c = contextMenuState;
            this.f106342d = aVar;
            this.f106343e = dVar;
            this.f106344f = lVar;
            this.f106345g = i11;
            this.f106346h = i12;
        }

        public final void a(l lVar, int i11) {
            a.a(this.f106341c, this.f106342d, this.f106343e, this.f106344f, lVar, k2.a(this.f106345g | 1), this.f106346h);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ContextMenuState f106347c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f106348d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.l<g, h0> f106349e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f106350f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f106351g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f106352h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f106353i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f106354j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ContextMenuState contextMenuState, wn0.a<h0> aVar, wn0.l<? super g, h0> lVar, androidx.compose.ui.d dVar, boolean z11, p<? super l, ? super Integer, h0> pVar, int i11, int i12) {
            super(2);
            this.f106347c = contextMenuState;
            this.f106348d = aVar;
            this.f106349e = lVar;
            this.f106350f = dVar;
            this.f106351g = z11;
            this.f106352h = pVar;
            this.f106353i = i11;
            this.f106354j = i12;
        }

        public final void a(l lVar, int i11) {
            a.b(this.f106347c, this.f106348d, this.f106349e, this.f106350f, this.f106351g, this.f106352h, lVar, k2.a(this.f106353i | 1), this.f106354j);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(ContextMenuState contextMenuState, wn0.a<h0> aVar, androidx.compose.ui.d dVar, wn0.l<? super g, h0> lVar, l lVar2, int i11, int i12) {
        int i13;
        androidx.compose.ui.d dVar2;
        l lVar3;
        l lVarV = lVar2.v(645832757);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.n(contextMenuState) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= lVarV.K(aVar) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i13 |= lVarV.n(dVar) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= lVarV.K(lVar) ? 2048 : 1024;
        }
        if ((i13 & 1171) == 1170 && lVarV.b()) {
            lVarV.j();
            dVar2 = dVar;
            lVar3 = lVarV;
        } else {
            if (i14 != 0) {
                dVar = androidx.compose.ui.d.INSTANCE;
            }
            dVar2 = dVar;
            if (o.J()) {
                o.S(645832757, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenu (ContextMenuArea.android.kt:63)");
            }
            ContextMenuState.a aVarA = contextMenuState.a();
            if (!(aVarA instanceof ContextMenuState.a.Open)) {
                if (o.J()) {
                    o.R();
                }
                w2 w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new C2259a(contextMenuState, aVar, dVar2, lVar, i11, i12));
                    return;
                }
                return;
            }
            boolean zN = lVarV.n(aVarA);
            Object objI = lVarV.I();
            if (zN || objI == l.INSTANCE.a()) {
                objI = new e(w4.o.d(((ContextMenuState.a.Open) aVarA).getOffset()), null);
                lVarV.B(objI);
            }
            lVar3 = lVarV;
            k.d((e) objI, aVar, dVar2, lVar, lVar3, i13 & 8176, 0);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX2 = lVar3.x();
        if (w2VarX2 != null) {
            w2VarX2.a(new b(contextMenuState, aVar, dVar2, lVar, i11, i12));
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0185  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:50:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x0084  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:60:0x009a  */
    /* JADX WARN: Code duplicated, block: B:62:0x009e  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:83:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:87:0x0100  */
    /* JADX WARN: Code duplicated, block: B:90:0x010c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0110  */
    /* JADX WARN: Code duplicated, block: B:94:0x012f  */
    /* JADX WARN: Code duplicated, block: B:96:0x013d  */
    /* JADX WARN: Code duplicated, block: B:99:0x017a  */
    public static final void b(ContextMenuState contextMenuState, wn0.a<h0> aVar, wn0.l<? super g, h0> lVar, androidx.compose.ui.d dVar, boolean z11, p<? super l, ? super Integer, h0> pVar, l lVar2, int i11, int i12) {
        int i13;
        wn0.a<h0> aVar2;
        wn0.l<? super g, h0> lVar3;
        int i14;
        int i15;
        androidx.compose.ui.d dVar2;
        int i16;
        int i17;
        boolean z12;
        int i18;
        int i19;
        androidx.compose.ui.d dVarC;
        int iA;
        wn0.a<b4.g> aVarA;
        l lVarA;
        p<b4.g, Integer, h0> pVarB;
        boolean z13;
        w2 w2VarX;
        l lVarV = lVar2.v(-84584070);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.n(contextMenuState) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) == 0) {
            if ((i11 & 48) == 0) {
                aVar2 = aVar;
                i13 |= lVarV.K(aVar2) ? 32 : 16;
            }
            if ((i12 & 4) != 0) {
                if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                    lVar3 = lVar;
                    if (lVarV.K(lVar3)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i13 |= i14;
                }
                i15 = i12 & 8;
                if (i15 != 0) {
                    if ((i11 & 3072) == 0) {
                        dVar2 = dVar;
                        if (lVarV.n(dVar2)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i13 |= i16;
                    }
                    i17 = i12 & 16;
                    if (i17 != 0) {
                        if ((i11 & 24576) == 0) {
                            z12 = z11;
                            if (lVarV.p(z12)) {
                                i18 = 16384;
                            } else {
                                i18 = PKIFailureInfo.certRevoked;
                            }
                            i13 |= i18;
                        }
                        if ((i12 & 32) != 0) {
                            i13 |= 196608;
                        } else if ((i11 & 196608) == 0) {
                            if (lVarV.K(pVar)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i13 |= i19;
                        }
                        if ((74899 & i13) == 74898 || !lVarV.b()) {
                            if (i15 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i17 != 0) {
                                z12 = true;
                            }
                            if (o.J()) {
                                o.S(-84584070, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)");
                            }
                            if (z12) {
                                dVarC = r1.c.c(dVar2, contextMenuState);
                            } else {
                                dVarC = dVar2;
                            }
                            i0 i0VarH = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), true);
                            iA = p020r2.j.a(lVarV, 0);
                            x xVarC = lVarV.c();
                            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, dVarC);
                            b4.g.Companion companion = b4.g.INSTANCE;
                            aVarA = companion.a();
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
                            d4.b(lVarA, i0VarH, companion.c());
                            d4.b(lVarA, xVarC, companion.e());
                            pVarB = companion.b();
                            if (lVarA.u() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                                lVarA.B(Integer.valueOf(iA));
                                lVarA.f(Integer.valueOf(iA), pVarB);
                            }
                            d4.b(lVarA, dVarE, companion.d());
                            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
                            pVar.invoke(lVarV, Integer.valueOf((i13 >> 15) & 14));
                            a(contextMenuState, aVar2, null, lVar3, lVarV, (i13 & 126) | ((i13 << 3) & 7168), 4);
                            lVarV.g();
                            if (o.J()) {
                                o.R();
                            }
                        } else {
                            lVarV.j();
                        }
                        z13 = z12;
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new c(contextMenuState, aVar, lVar, dVar2, z13, pVar, i11, i12));
                        }
                    }
                    i13 |= 24576;
                    z12 = z11;
                    if ((i12 & 32) != 0) {
                        i13 |= 196608;
                    } else if ((i11 & 196608) == 0) {
                        if (lVarV.K(pVar)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                    if ((74899 & i13) == 74898) {
                        if (i15 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if (o.J()) {
                            o.S(-84584070, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)");
                        }
                        if (z12) {
                            dVarC = r1.c.c(dVar2, contextMenuState);
                        } else {
                            dVarC = dVar2;
                        }
                        i0 i0VarH2 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), true);
                        iA = p020r2.j.a(lVarV, 0);
                        x xVarC2 = lVarV.c();
                        androidx.compose.ui.d dVarE2 = androidx.compose.ui.c.e(lVarV, dVarC);
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
                        d4.b(lVarA, i0VarH2, companion2.c());
                        d4.b(lVarA, xVarC2, companion2.e());
                        pVarB = companion2.b();
                        if (lVarA.u()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        d4.b(lVarA, dVarE2, companion2.d());
                        androidx.compose.foundation.layout.i iVar2 = androidx.compose.foundation.layout.i.f4585a;
                        pVar.invoke(lVarV, Integer.valueOf((i13 >> 15) & 14));
                        a(contextMenuState, aVar2, null, lVar3, lVarV, (i13 & 126) | ((i13 << 3) & 7168), 4);
                        lVarV.g();
                        if (o.J()) {
                            o.R();
                        }
                    } else {
                        if (i15 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if (o.J()) {
                            o.S(-84584070, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)");
                        }
                        if (z12) {
                            dVarC = r1.c.c(dVar2, contextMenuState);
                        } else {
                            dVarC = dVar2;
                        }
                        i0 i0VarH3 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), true);
                        iA = p020r2.j.a(lVarV, 0);
                        x xVarC3 = lVarV.c();
                        androidx.compose.ui.d dVarE3 = androidx.compose.ui.c.e(lVarV, dVarC);
                        b4.g.Companion companion3 = b4.g.INSTANCE;
                        aVarA = companion3.a();
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
                        d4.b(lVarA, i0VarH3, companion3.c());
                        d4.b(lVarA, xVarC3, companion3.e());
                        pVarB = companion3.b();
                        if (lVarA.u()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        d4.b(lVarA, dVarE3, companion3.d());
                        androidx.compose.foundation.layout.i iVar3 = androidx.compose.foundation.layout.i.f4585a;
                        pVar.invoke(lVarV, Integer.valueOf((i13 >> 15) & 14));
                        a(contextMenuState, aVar2, null, lVar3, lVarV, (i13 & 126) | ((i13 << 3) & 7168), 4);
                        lVarV.g();
                        if (o.J()) {
                            o.R();
                        }
                    }
                    z13 = z12;
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new c(contextMenuState, aVar, lVar, dVar2, z13, pVar, i11, i12));
                    }
                }
                i13 |= 3072;
                dVar2 = dVar;
                i17 = i12 & 16;
                if (i17 != 0) {
                    if ((i11 & 24576) == 0) {
                        z12 = z11;
                        if (lVarV.p(z12)) {
                            i18 = 16384;
                        } else {
                            i18 = PKIFailureInfo.certRevoked;
                        }
                        i13 |= i18;
                    }
                    if ((i12 & 32) != 0) {
                        i13 |= 196608;
                    } else if ((i11 & 196608) == 0) {
                        if (lVarV.K(pVar)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                    if ((74899 & i13) == 74898) {
                        if (i15 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if (o.J()) {
                            o.S(-84584070, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)");
                        }
                        if (z12) {
                            dVarC = r1.c.c(dVar2, contextMenuState);
                        } else {
                            dVarC = dVar2;
                        }
                        i0 i0VarH4 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), true);
                        iA = p020r2.j.a(lVarV, 0);
                        x xVarC4 = lVarV.c();
                        androidx.compose.ui.d dVarE4 = androidx.compose.ui.c.e(lVarV, dVarC);
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
                        d4.b(lVarA, i0VarH4, companion4.c());
                        d4.b(lVarA, xVarC4, companion4.e());
                        pVarB = companion4.b();
                        if (lVarA.u()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        d4.b(lVarA, dVarE4, companion4.d());
                        androidx.compose.foundation.layout.i iVar4 = androidx.compose.foundation.layout.i.f4585a;
                        pVar.invoke(lVarV, Integer.valueOf((i13 >> 15) & 14));
                        a(contextMenuState, aVar2, null, lVar3, lVarV, (i13 & 126) | ((i13 << 3) & 7168), 4);
                        lVarV.g();
                        if (o.J()) {
                            o.R();
                        }
                    } else {
                        if (i15 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if (o.J()) {
                            o.S(-84584070, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)");
                        }
                        if (z12) {
                            dVarC = r1.c.c(dVar2, contextMenuState);
                        } else {
                            dVarC = dVar2;
                        }
                        i0 i0VarH5 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), true);
                        iA = p020r2.j.a(lVarV, 0);
                        x xVarC5 = lVarV.c();
                        androidx.compose.ui.d dVarE5 = androidx.compose.ui.c.e(lVarV, dVarC);
                        b4.g.Companion companion5 = b4.g.INSTANCE;
                        aVarA = companion5.a();
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
                        d4.b(lVarA, i0VarH5, companion5.c());
                        d4.b(lVarA, xVarC5, companion5.e());
                        pVarB = companion5.b();
                        if (lVarA.u()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        d4.b(lVarA, dVarE5, companion5.d());
                        androidx.compose.foundation.layout.i iVar5 = androidx.compose.foundation.layout.i.f4585a;
                        pVar.invoke(lVarV, Integer.valueOf((i13 >> 15) & 14));
                        a(contextMenuState, aVar2, null, lVar3, lVarV, (i13 & 126) | ((i13 << 3) & 7168), 4);
                        lVarV.g();
                        if (o.J()) {
                            o.R();
                        }
                    }
                    z13 = z12;
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new c(contextMenuState, aVar, lVar, dVar2, z13, pVar, i11, i12));
                    }
                }
                i13 |= 24576;
                z12 = z11;
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    if (lVarV.K(pVar)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                if ((74899 & i13) == 74898) {
                    if (i15 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if (o.J()) {
                        o.S(-84584070, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)");
                    }
                    if (z12) {
                        dVarC = r1.c.c(dVar2, contextMenuState);
                    } else {
                        dVarC = dVar2;
                    }
                    i0 i0VarH6 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), true);
                    iA = p020r2.j.a(lVarV, 0);
                    x xVarC6 = lVarV.c();
                    androidx.compose.ui.d dVarE6 = androidx.compose.ui.c.e(lVarV, dVarC);
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
                    d4.b(lVarA, i0VarH6, companion6.c());
                    d4.b(lVarA, xVarC6, companion6.e());
                    pVarB = companion6.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    d4.b(lVarA, dVarE6, companion6.d());
                    androidx.compose.foundation.layout.i iVar6 = androidx.compose.foundation.layout.i.f4585a;
                    pVar.invoke(lVarV, Integer.valueOf((i13 >> 15) & 14));
                    a(contextMenuState, aVar2, null, lVar3, lVarV, (i13 & 126) | ((i13 << 3) & 7168), 4);
                    lVarV.g();
                    if (o.J()) {
                        o.R();
                    }
                } else {
                    if (i15 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if (o.J()) {
                        o.S(-84584070, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)");
                    }
                    if (z12) {
                        dVarC = r1.c.c(dVar2, contextMenuState);
                    } else {
                        dVarC = dVar2;
                    }
                    i0 i0VarH7 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), true);
                    iA = p020r2.j.a(lVarV, 0);
                    x xVarC7 = lVarV.c();
                    androidx.compose.ui.d dVarE7 = androidx.compose.ui.c.e(lVarV, dVarC);
                    b4.g.Companion companion7 = b4.g.INSTANCE;
                    aVarA = companion7.a();
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
                    d4.b(lVarA, i0VarH7, companion7.c());
                    d4.b(lVarA, xVarC7, companion7.e());
                    pVarB = companion7.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    d4.b(lVarA, dVarE7, companion7.d());
                    androidx.compose.foundation.layout.i iVar7 = androidx.compose.foundation.layout.i.f4585a;
                    pVar.invoke(lVarV, Integer.valueOf((i13 >> 15) & 14));
                    a(contextMenuState, aVar2, null, lVar3, lVarV, (i13 & 126) | ((i13 << 3) & 7168), 4);
                    lVarV.g();
                    if (o.J()) {
                        o.R();
                    }
                }
                z13 = z12;
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new c(contextMenuState, aVar, lVar, dVar2, z13, pVar, i11, i12));
                }
            }
            i13 |= KyberEngine.KyberPolyBytes;
            lVar3 = lVar;
            i15 = i12 & 8;
            if (i15 != 0) {
                if ((i11 & 3072) == 0) {
                    dVar2 = dVar;
                    if (lVarV.n(dVar2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i13 |= i16;
                }
                i17 = i12 & 16;
                if (i17 != 0) {
                    if ((i11 & 24576) == 0) {
                        z12 = z11;
                        if (lVarV.p(z12)) {
                            i18 = 16384;
                        } else {
                            i18 = PKIFailureInfo.certRevoked;
                        }
                        i13 |= i18;
                    }
                    if ((i12 & 32) != 0) {
                        i13 |= 196608;
                    } else if ((i11 & 196608) == 0) {
                        if (lVarV.K(pVar)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                    if ((74899 & i13) == 74898) {
                        if (i15 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if (o.J()) {
                            o.S(-84584070, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)");
                        }
                        if (z12) {
                            dVarC = r1.c.c(dVar2, contextMenuState);
                        } else {
                            dVarC = dVar2;
                        }
                        i0 i0VarH8 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), true);
                        iA = p020r2.j.a(lVarV, 0);
                        x xVarC8 = lVarV.c();
                        androidx.compose.ui.d dVarE8 = androidx.compose.ui.c.e(lVarV, dVarC);
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
                        d4.b(lVarA, i0VarH8, companion8.c());
                        d4.b(lVarA, xVarC8, companion8.e());
                        pVarB = companion8.b();
                        if (lVarA.u()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        d4.b(lVarA, dVarE8, companion8.d());
                        androidx.compose.foundation.layout.i iVar8 = androidx.compose.foundation.layout.i.f4585a;
                        pVar.invoke(lVarV, Integer.valueOf((i13 >> 15) & 14));
                        a(contextMenuState, aVar2, null, lVar3, lVarV, (i13 & 126) | ((i13 << 3) & 7168), 4);
                        lVarV.g();
                        if (o.J()) {
                            o.R();
                        }
                    } else {
                        if (i15 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if (o.J()) {
                            o.S(-84584070, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)");
                        }
                        if (z12) {
                            dVarC = r1.c.c(dVar2, contextMenuState);
                        } else {
                            dVarC = dVar2;
                        }
                        i0 i0VarH9 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), true);
                        iA = p020r2.j.a(lVarV, 0);
                        x xVarC9 = lVarV.c();
                        androidx.compose.ui.d dVarE9 = androidx.compose.ui.c.e(lVarV, dVarC);
                        b4.g.Companion companion9 = b4.g.INSTANCE;
                        aVarA = companion9.a();
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
                        d4.b(lVarA, i0VarH9, companion9.c());
                        d4.b(lVarA, xVarC9, companion9.e());
                        pVarB = companion9.b();
                        if (lVarA.u()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        d4.b(lVarA, dVarE9, companion9.d());
                        androidx.compose.foundation.layout.i iVar9 = androidx.compose.foundation.layout.i.f4585a;
                        pVar.invoke(lVarV, Integer.valueOf((i13 >> 15) & 14));
                        a(contextMenuState, aVar2, null, lVar3, lVarV, (i13 & 126) | ((i13 << 3) & 7168), 4);
                        lVarV.g();
                        if (o.J()) {
                            o.R();
                        }
                    }
                    z13 = z12;
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new c(contextMenuState, aVar, lVar, dVar2, z13, pVar, i11, i12));
                    }
                }
                i13 |= 24576;
                z12 = z11;
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    if (lVarV.K(pVar)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                if ((74899 & i13) == 74898) {
                    if (i15 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if (o.J()) {
                        o.S(-84584070, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)");
                    }
                    if (z12) {
                        dVarC = r1.c.c(dVar2, contextMenuState);
                    } else {
                        dVarC = dVar2;
                    }
                    i0 i0VarH10 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), true);
                    iA = p020r2.j.a(lVarV, 0);
                    x xVarC10 = lVarV.c();
                    androidx.compose.ui.d dVarE10 = androidx.compose.ui.c.e(lVarV, dVarC);
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
                    d4.b(lVarA, i0VarH10, companion10.c());
                    d4.b(lVarA, xVarC10, companion10.e());
                    pVarB = companion10.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    d4.b(lVarA, dVarE10, companion10.d());
                    androidx.compose.foundation.layout.i iVar10 = androidx.compose.foundation.layout.i.f4585a;
                    pVar.invoke(lVarV, Integer.valueOf((i13 >> 15) & 14));
                    a(contextMenuState, aVar2, null, lVar3, lVarV, (i13 & 126) | ((i13 << 3) & 7168), 4);
                    lVarV.g();
                    if (o.J()) {
                        o.R();
                    }
                } else {
                    if (i15 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if (o.J()) {
                        o.S(-84584070, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)");
                    }
                    if (z12) {
                        dVarC = r1.c.c(dVar2, contextMenuState);
                    } else {
                        dVarC = dVar2;
                    }
                    i0 i0VarH11 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), true);
                    iA = p020r2.j.a(lVarV, 0);
                    x xVarC11 = lVarV.c();
                    androidx.compose.ui.d dVarE11 = androidx.compose.ui.c.e(lVarV, dVarC);
                    b4.g.Companion companion11 = b4.g.INSTANCE;
                    aVarA = companion11.a();
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
                    d4.b(lVarA, i0VarH11, companion11.c());
                    d4.b(lVarA, xVarC11, companion11.e());
                    pVarB = companion11.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    d4.b(lVarA, dVarE11, companion11.d());
                    androidx.compose.foundation.layout.i iVar11 = androidx.compose.foundation.layout.i.f4585a;
                    pVar.invoke(lVarV, Integer.valueOf((i13 >> 15) & 14));
                    a(contextMenuState, aVar2, null, lVar3, lVarV, (i13 & 126) | ((i13 << 3) & 7168), 4);
                    lVarV.g();
                    if (o.J()) {
                        o.R();
                    }
                }
                z13 = z12;
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new c(contextMenuState, aVar, lVar, dVar2, z13, pVar, i11, i12));
                }
            }
            i13 |= 3072;
            dVar2 = dVar;
            i17 = i12 & 16;
            if (i17 != 0) {
                if ((i11 & 24576) == 0) {
                    z12 = z11;
                    if (lVarV.p(z12)) {
                        i18 = 16384;
                    } else {
                        i18 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i18;
                }
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    if (lVarV.K(pVar)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                if ((74899 & i13) == 74898) {
                    if (i15 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if (o.J()) {
                        o.S(-84584070, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)");
                    }
                    if (z12) {
                        dVarC = r1.c.c(dVar2, contextMenuState);
                    } else {
                        dVarC = dVar2;
                    }
                    i0 i0VarH12 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), true);
                    iA = p020r2.j.a(lVarV, 0);
                    x xVarC12 = lVarV.c();
                    androidx.compose.ui.d dVarE12 = androidx.compose.ui.c.e(lVarV, dVarC);
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
                    d4.b(lVarA, i0VarH12, companion12.c());
                    d4.b(lVarA, xVarC12, companion12.e());
                    pVarB = companion12.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    d4.b(lVarA, dVarE12, companion12.d());
                    androidx.compose.foundation.layout.i iVar12 = androidx.compose.foundation.layout.i.f4585a;
                    pVar.invoke(lVarV, Integer.valueOf((i13 >> 15) & 14));
                    a(contextMenuState, aVar2, null, lVar3, lVarV, (i13 & 126) | ((i13 << 3) & 7168), 4);
                    lVarV.g();
                    if (o.J()) {
                        o.R();
                    }
                } else {
                    if (i15 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if (o.J()) {
                        o.S(-84584070, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)");
                    }
                    if (z12) {
                        dVarC = r1.c.c(dVar2, contextMenuState);
                    } else {
                        dVarC = dVar2;
                    }
                    i0 i0VarH13 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), true);
                    iA = p020r2.j.a(lVarV, 0);
                    x xVarC13 = lVarV.c();
                    androidx.compose.ui.d dVarE13 = androidx.compose.ui.c.e(lVarV, dVarC);
                    b4.g.Companion companion13 = b4.g.INSTANCE;
                    aVarA = companion13.a();
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
                    d4.b(lVarA, i0VarH13, companion13.c());
                    d4.b(lVarA, xVarC13, companion13.e());
                    pVarB = companion13.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    d4.b(lVarA, dVarE13, companion13.d());
                    androidx.compose.foundation.layout.i iVar13 = androidx.compose.foundation.layout.i.f4585a;
                    pVar.invoke(lVarV, Integer.valueOf((i13 >> 15) & 14));
                    a(contextMenuState, aVar2, null, lVar3, lVarV, (i13 & 126) | ((i13 << 3) & 7168), 4);
                    lVarV.g();
                    if (o.J()) {
                        o.R();
                    }
                }
                z13 = z12;
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new c(contextMenuState, aVar, lVar, dVar2, z13, pVar, i11, i12));
                }
            }
            i13 |= 24576;
            z12 = z11;
            if ((i12 & 32) != 0) {
                i13 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (lVarV.K(pVar)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i13 |= i19;
            }
            if ((74899 & i13) == 74898) {
                if (i15 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i17 != 0) {
                    z12 = true;
                }
                if (o.J()) {
                    o.S(-84584070, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)");
                }
                if (z12) {
                    dVarC = r1.c.c(dVar2, contextMenuState);
                } else {
                    dVarC = dVar2;
                }
                i0 i0VarH14 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), true);
                iA = p020r2.j.a(lVarV, 0);
                x xVarC14 = lVarV.c();
                androidx.compose.ui.d dVarE14 = androidx.compose.ui.c.e(lVarV, dVarC);
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
                d4.b(lVarA, i0VarH14, companion14.c());
                d4.b(lVarA, xVarC14, companion14.e());
                pVarB = companion14.b();
                if (lVarA.u()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                d4.b(lVarA, dVarE14, companion14.d());
                androidx.compose.foundation.layout.i iVar14 = androidx.compose.foundation.layout.i.f4585a;
                pVar.invoke(lVarV, Integer.valueOf((i13 >> 15) & 14));
                a(contextMenuState, aVar2, null, lVar3, lVarV, (i13 & 126) | ((i13 << 3) & 7168), 4);
                lVarV.g();
                if (o.J()) {
                    o.R();
                }
            } else {
                if (i15 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i17 != 0) {
                    z12 = true;
                }
                if (o.J()) {
                    o.S(-84584070, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)");
                }
                if (z12) {
                    dVarC = r1.c.c(dVar2, contextMenuState);
                } else {
                    dVarC = dVar2;
                }
                i0 i0VarH15 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), true);
                iA = p020r2.j.a(lVarV, 0);
                x xVarC15 = lVarV.c();
                androidx.compose.ui.d dVarE15 = androidx.compose.ui.c.e(lVarV, dVarC);
                b4.g.Companion companion15 = b4.g.INSTANCE;
                aVarA = companion15.a();
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
                d4.b(lVarA, i0VarH15, companion15.c());
                d4.b(lVarA, xVarC15, companion15.e());
                pVarB = companion15.b();
                if (lVarA.u()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                d4.b(lVarA, dVarE15, companion15.d());
                androidx.compose.foundation.layout.i iVar15 = androidx.compose.foundation.layout.i.f4585a;
                pVar.invoke(lVarV, Integer.valueOf((i13 >> 15) & 14));
                a(contextMenuState, aVar2, null, lVar3, lVarV, (i13 & 126) | ((i13 << 3) & 7168), 4);
                lVarV.g();
                if (o.J()) {
                    o.R();
                }
            }
            z13 = z12;
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new c(contextMenuState, aVar, lVar, dVar2, z13, pVar, i11, i12));
            }
        }
        i13 |= 48;
        aVar2 = aVar;
        if ((i12 & 4) != 0) {
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                lVar3 = lVar;
                if (lVarV.K(lVar3)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i13 |= i14;
            }
            i15 = i12 & 8;
            if (i15 != 0) {
                if ((i11 & 3072) == 0) {
                    dVar2 = dVar;
                    if (lVarV.n(dVar2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i13 |= i16;
                }
                i17 = i12 & 16;
                if (i17 != 0) {
                    if ((i11 & 24576) == 0) {
                        z12 = z11;
                        if (lVarV.p(z12)) {
                            i18 = 16384;
                        } else {
                            i18 = PKIFailureInfo.certRevoked;
                        }
                        i13 |= i18;
                    }
                    if ((i12 & 32) != 0) {
                        i13 |= 196608;
                    } else if ((i11 & 196608) == 0) {
                        if (lVarV.K(pVar)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                    if ((74899 & i13) == 74898) {
                        if (i15 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if (o.J()) {
                            o.S(-84584070, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)");
                        }
                        if (z12) {
                            dVarC = r1.c.c(dVar2, contextMenuState);
                        } else {
                            dVarC = dVar2;
                        }
                        i0 i0VarH16 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), true);
                        iA = p020r2.j.a(lVarV, 0);
                        x xVarC16 = lVarV.c();
                        androidx.compose.ui.d dVarE16 = androidx.compose.ui.c.e(lVarV, dVarC);
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
                        d4.b(lVarA, i0VarH16, companion16.c());
                        d4.b(lVarA, xVarC16, companion16.e());
                        pVarB = companion16.b();
                        if (lVarA.u()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        d4.b(lVarA, dVarE16, companion16.d());
                        androidx.compose.foundation.layout.i iVar16 = androidx.compose.foundation.layout.i.f4585a;
                        pVar.invoke(lVarV, Integer.valueOf((i13 >> 15) & 14));
                        a(contextMenuState, aVar2, null, lVar3, lVarV, (i13 & 126) | ((i13 << 3) & 7168), 4);
                        lVarV.g();
                        if (o.J()) {
                            o.R();
                        }
                    } else {
                        if (i15 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i17 != 0) {
                            z12 = true;
                        }
                        if (o.J()) {
                            o.S(-84584070, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)");
                        }
                        if (z12) {
                            dVarC = r1.c.c(dVar2, contextMenuState);
                        } else {
                            dVarC = dVar2;
                        }
                        i0 i0VarH17 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), true);
                        iA = p020r2.j.a(lVarV, 0);
                        x xVarC17 = lVarV.c();
                        androidx.compose.ui.d dVarE17 = androidx.compose.ui.c.e(lVarV, dVarC);
                        b4.g.Companion companion17 = b4.g.INSTANCE;
                        aVarA = companion17.a();
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
                        d4.b(lVarA, i0VarH17, companion17.c());
                        d4.b(lVarA, xVarC17, companion17.e());
                        pVarB = companion17.b();
                        if (lVarA.u()) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        } else {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        d4.b(lVarA, dVarE17, companion17.d());
                        androidx.compose.foundation.layout.i iVar17 = androidx.compose.foundation.layout.i.f4585a;
                        pVar.invoke(lVarV, Integer.valueOf((i13 >> 15) & 14));
                        a(contextMenuState, aVar2, null, lVar3, lVarV, (i13 & 126) | ((i13 << 3) & 7168), 4);
                        lVarV.g();
                        if (o.J()) {
                            o.R();
                        }
                    }
                    z13 = z12;
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new c(contextMenuState, aVar, lVar, dVar2, z13, pVar, i11, i12));
                    }
                }
                i13 |= 24576;
                z12 = z11;
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    if (lVarV.K(pVar)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                if ((74899 & i13) == 74898) {
                    if (i15 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if (o.J()) {
                        o.S(-84584070, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)");
                    }
                    if (z12) {
                        dVarC = r1.c.c(dVar2, contextMenuState);
                    } else {
                        dVarC = dVar2;
                    }
                    i0 i0VarH18 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), true);
                    iA = p020r2.j.a(lVarV, 0);
                    x xVarC18 = lVarV.c();
                    androidx.compose.ui.d dVarE18 = androidx.compose.ui.c.e(lVarV, dVarC);
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
                    d4.b(lVarA, i0VarH18, companion18.c());
                    d4.b(lVarA, xVarC18, companion18.e());
                    pVarB = companion18.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    d4.b(lVarA, dVarE18, companion18.d());
                    androidx.compose.foundation.layout.i iVar18 = androidx.compose.foundation.layout.i.f4585a;
                    pVar.invoke(lVarV, Integer.valueOf((i13 >> 15) & 14));
                    a(contextMenuState, aVar2, null, lVar3, lVarV, (i13 & 126) | ((i13 << 3) & 7168), 4);
                    lVarV.g();
                    if (o.J()) {
                        o.R();
                    }
                } else {
                    if (i15 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if (o.J()) {
                        o.S(-84584070, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)");
                    }
                    if (z12) {
                        dVarC = r1.c.c(dVar2, contextMenuState);
                    } else {
                        dVarC = dVar2;
                    }
                    i0 i0VarH19 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), true);
                    iA = p020r2.j.a(lVarV, 0);
                    x xVarC19 = lVarV.c();
                    androidx.compose.ui.d dVarE19 = androidx.compose.ui.c.e(lVarV, dVarC);
                    b4.g.Companion companion19 = b4.g.INSTANCE;
                    aVarA = companion19.a();
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
                    d4.b(lVarA, i0VarH19, companion19.c());
                    d4.b(lVarA, xVarC19, companion19.e());
                    pVarB = companion19.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    d4.b(lVarA, dVarE19, companion19.d());
                    androidx.compose.foundation.layout.i iVar19 = androidx.compose.foundation.layout.i.f4585a;
                    pVar.invoke(lVarV, Integer.valueOf((i13 >> 15) & 14));
                    a(contextMenuState, aVar2, null, lVar3, lVarV, (i13 & 126) | ((i13 << 3) & 7168), 4);
                    lVarV.g();
                    if (o.J()) {
                        o.R();
                    }
                }
                z13 = z12;
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new c(contextMenuState, aVar, lVar, dVar2, z13, pVar, i11, i12));
                }
            }
            i13 |= 3072;
            dVar2 = dVar;
            i17 = i12 & 16;
            if (i17 != 0) {
                if ((i11 & 24576) == 0) {
                    z12 = z11;
                    if (lVarV.p(z12)) {
                        i18 = 16384;
                    } else {
                        i18 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i18;
                }
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    if (lVarV.K(pVar)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                if ((74899 & i13) == 74898) {
                    if (i15 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if (o.J()) {
                        o.S(-84584070, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)");
                    }
                    if (z12) {
                        dVarC = r1.c.c(dVar2, contextMenuState);
                    } else {
                        dVarC = dVar2;
                    }
                    i0 i0VarH110 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), true);
                    iA = p020r2.j.a(lVarV, 0);
                    x xVarC110 = lVarV.c();
                    androidx.compose.ui.d dVarE110 = androidx.compose.ui.c.e(lVarV, dVarC);
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
                    d4.b(lVarA, i0VarH110, companion110.c());
                    d4.b(lVarA, xVarC110, companion110.e());
                    pVarB = companion110.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    d4.b(lVarA, dVarE110, companion110.d());
                    androidx.compose.foundation.layout.i iVar110 = androidx.compose.foundation.layout.i.f4585a;
                    pVar.invoke(lVarV, Integer.valueOf((i13 >> 15) & 14));
                    a(contextMenuState, aVar2, null, lVar3, lVarV, (i13 & 126) | ((i13 << 3) & 7168), 4);
                    lVarV.g();
                    if (o.J()) {
                        o.R();
                    }
                } else {
                    if (i15 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if (o.J()) {
                        o.S(-84584070, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)");
                    }
                    if (z12) {
                        dVarC = r1.c.c(dVar2, contextMenuState);
                    } else {
                        dVarC = dVar2;
                    }
                    i0 i0VarH111 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), true);
                    iA = p020r2.j.a(lVarV, 0);
                    x xVarC111 = lVarV.c();
                    androidx.compose.ui.d dVarE111 = androidx.compose.ui.c.e(lVarV, dVarC);
                    b4.g.Companion companion111 = b4.g.INSTANCE;
                    aVarA = companion111.a();
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
                    d4.b(lVarA, i0VarH111, companion111.c());
                    d4.b(lVarA, xVarC111, companion111.e());
                    pVarB = companion111.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    d4.b(lVarA, dVarE111, companion111.d());
                    androidx.compose.foundation.layout.i iVar111 = androidx.compose.foundation.layout.i.f4585a;
                    pVar.invoke(lVarV, Integer.valueOf((i13 >> 15) & 14));
                    a(contextMenuState, aVar2, null, lVar3, lVarV, (i13 & 126) | ((i13 << 3) & 7168), 4);
                    lVarV.g();
                    if (o.J()) {
                        o.R();
                    }
                }
                z13 = z12;
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new c(contextMenuState, aVar, lVar, dVar2, z13, pVar, i11, i12));
                }
            }
            i13 |= 24576;
            z12 = z11;
            if ((i12 & 32) != 0) {
                i13 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (lVarV.K(pVar)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i13 |= i19;
            }
            if ((74899 & i13) == 74898) {
                if (i15 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i17 != 0) {
                    z12 = true;
                }
                if (o.J()) {
                    o.S(-84584070, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)");
                }
                if (z12) {
                    dVarC = r1.c.c(dVar2, contextMenuState);
                } else {
                    dVarC = dVar2;
                }
                i0 i0VarH112 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), true);
                iA = p020r2.j.a(lVarV, 0);
                x xVarC112 = lVarV.c();
                androidx.compose.ui.d dVarE112 = androidx.compose.ui.c.e(lVarV, dVarC);
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
                d4.b(lVarA, i0VarH112, companion112.c());
                d4.b(lVarA, xVarC112, companion112.e());
                pVarB = companion112.b();
                if (lVarA.u()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                d4.b(lVarA, dVarE112, companion112.d());
                androidx.compose.foundation.layout.i iVar112 = androidx.compose.foundation.layout.i.f4585a;
                pVar.invoke(lVarV, Integer.valueOf((i13 >> 15) & 14));
                a(contextMenuState, aVar2, null, lVar3, lVarV, (i13 & 126) | ((i13 << 3) & 7168), 4);
                lVarV.g();
                if (o.J()) {
                    o.R();
                }
            } else {
                if (i15 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i17 != 0) {
                    z12 = true;
                }
                if (o.J()) {
                    o.S(-84584070, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)");
                }
                if (z12) {
                    dVarC = r1.c.c(dVar2, contextMenuState);
                } else {
                    dVarC = dVar2;
                }
                i0 i0VarH113 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), true);
                iA = p020r2.j.a(lVarV, 0);
                x xVarC113 = lVarV.c();
                androidx.compose.ui.d dVarE113 = androidx.compose.ui.c.e(lVarV, dVarC);
                b4.g.Companion companion113 = b4.g.INSTANCE;
                aVarA = companion113.a();
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
                d4.b(lVarA, i0VarH113, companion113.c());
                d4.b(lVarA, xVarC113, companion113.e());
                pVarB = companion113.b();
                if (lVarA.u()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                d4.b(lVarA, dVarE113, companion113.d());
                androidx.compose.foundation.layout.i iVar113 = androidx.compose.foundation.layout.i.f4585a;
                pVar.invoke(lVarV, Integer.valueOf((i13 >> 15) & 14));
                a(contextMenuState, aVar2, null, lVar3, lVarV, (i13 & 126) | ((i13 << 3) & 7168), 4);
                lVarV.g();
                if (o.J()) {
                    o.R();
                }
            }
            z13 = z12;
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new c(contextMenuState, aVar, lVar, dVar2, z13, pVar, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        lVar3 = lVar;
        i15 = i12 & 8;
        if (i15 != 0) {
            if ((i11 & 3072) == 0) {
                dVar2 = dVar;
                if (lVarV.n(dVar2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i13 |= i16;
            }
            i17 = i12 & 16;
            if (i17 != 0) {
                if ((i11 & 24576) == 0) {
                    z12 = z11;
                    if (lVarV.p(z12)) {
                        i18 = 16384;
                    } else {
                        i18 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i18;
                }
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    if (lVarV.K(pVar)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                if ((74899 & i13) == 74898) {
                    if (i15 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if (o.J()) {
                        o.S(-84584070, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)");
                    }
                    if (z12) {
                        dVarC = r1.c.c(dVar2, contextMenuState);
                    } else {
                        dVarC = dVar2;
                    }
                    i0 i0VarH114 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), true);
                    iA = p020r2.j.a(lVarV, 0);
                    x xVarC114 = lVarV.c();
                    androidx.compose.ui.d dVarE114 = androidx.compose.ui.c.e(lVarV, dVarC);
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
                    d4.b(lVarA, i0VarH114, companion114.c());
                    d4.b(lVarA, xVarC114, companion114.e());
                    pVarB = companion114.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    d4.b(lVarA, dVarE114, companion114.d());
                    androidx.compose.foundation.layout.i iVar114 = androidx.compose.foundation.layout.i.f4585a;
                    pVar.invoke(lVarV, Integer.valueOf((i13 >> 15) & 14));
                    a(contextMenuState, aVar2, null, lVar3, lVarV, (i13 & 126) | ((i13 << 3) & 7168), 4);
                    lVarV.g();
                    if (o.J()) {
                        o.R();
                    }
                } else {
                    if (i15 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i17 != 0) {
                        z12 = true;
                    }
                    if (o.J()) {
                        o.S(-84584070, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)");
                    }
                    if (z12) {
                        dVarC = r1.c.c(dVar2, contextMenuState);
                    } else {
                        dVarC = dVar2;
                    }
                    i0 i0VarH115 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), true);
                    iA = p020r2.j.a(lVarV, 0);
                    x xVarC115 = lVarV.c();
                    androidx.compose.ui.d dVarE115 = androidx.compose.ui.c.e(lVarV, dVarC);
                    b4.g.Companion companion115 = b4.g.INSTANCE;
                    aVarA = companion115.a();
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
                    d4.b(lVarA, i0VarH115, companion115.c());
                    d4.b(lVarA, xVarC115, companion115.e());
                    pVarB = companion115.b();
                    if (lVarA.u()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    d4.b(lVarA, dVarE115, companion115.d());
                    androidx.compose.foundation.layout.i iVar115 = androidx.compose.foundation.layout.i.f4585a;
                    pVar.invoke(lVarV, Integer.valueOf((i13 >> 15) & 14));
                    a(contextMenuState, aVar2, null, lVar3, lVarV, (i13 & 126) | ((i13 << 3) & 7168), 4);
                    lVarV.g();
                    if (o.J()) {
                        o.R();
                    }
                }
                z13 = z12;
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new c(contextMenuState, aVar, lVar, dVar2, z13, pVar, i11, i12));
                }
            }
            i13 |= 24576;
            z12 = z11;
            if ((i12 & 32) != 0) {
                i13 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (lVarV.K(pVar)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i13 |= i19;
            }
            if ((74899 & i13) == 74898) {
                if (i15 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i17 != 0) {
                    z12 = true;
                }
                if (o.J()) {
                    o.S(-84584070, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)");
                }
                if (z12) {
                    dVarC = r1.c.c(dVar2, contextMenuState);
                } else {
                    dVarC = dVar2;
                }
                i0 i0VarH116 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), true);
                iA = p020r2.j.a(lVarV, 0);
                x xVarC116 = lVarV.c();
                androidx.compose.ui.d dVarE116 = androidx.compose.ui.c.e(lVarV, dVarC);
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
                d4.b(lVarA, i0VarH116, companion116.c());
                d4.b(lVarA, xVarC116, companion116.e());
                pVarB = companion116.b();
                if (lVarA.u()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                d4.b(lVarA, dVarE116, companion116.d());
                androidx.compose.foundation.layout.i iVar116 = androidx.compose.foundation.layout.i.f4585a;
                pVar.invoke(lVarV, Integer.valueOf((i13 >> 15) & 14));
                a(contextMenuState, aVar2, null, lVar3, lVarV, (i13 & 126) | ((i13 << 3) & 7168), 4);
                lVarV.g();
                if (o.J()) {
                    o.R();
                }
            } else {
                if (i15 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i17 != 0) {
                    z12 = true;
                }
                if (o.J()) {
                    o.S(-84584070, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)");
                }
                if (z12) {
                    dVarC = r1.c.c(dVar2, contextMenuState);
                } else {
                    dVarC = dVar2;
                }
                i0 i0VarH117 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), true);
                iA = p020r2.j.a(lVarV, 0);
                x xVarC117 = lVarV.c();
                androidx.compose.ui.d dVarE117 = androidx.compose.ui.c.e(lVarV, dVarC);
                b4.g.Companion companion117 = b4.g.INSTANCE;
                aVarA = companion117.a();
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
                d4.b(lVarA, i0VarH117, companion117.c());
                d4.b(lVarA, xVarC117, companion117.e());
                pVarB = companion117.b();
                if (lVarA.u()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                d4.b(lVarA, dVarE117, companion117.d());
                androidx.compose.foundation.layout.i iVar117 = androidx.compose.foundation.layout.i.f4585a;
                pVar.invoke(lVarV, Integer.valueOf((i13 >> 15) & 14));
                a(contextMenuState, aVar2, null, lVar3, lVarV, (i13 & 126) | ((i13 << 3) & 7168), 4);
                lVarV.g();
                if (o.J()) {
                    o.R();
                }
            }
            z13 = z12;
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new c(contextMenuState, aVar, lVar, dVar2, z13, pVar, i11, i12));
            }
        }
        i13 |= 3072;
        dVar2 = dVar;
        i17 = i12 & 16;
        if (i17 != 0) {
            if ((i11 & 24576) == 0) {
                z12 = z11;
                if (lVarV.p(z12)) {
                    i18 = 16384;
                } else {
                    i18 = PKIFailureInfo.certRevoked;
                }
                i13 |= i18;
            }
            if ((i12 & 32) != 0) {
                i13 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (lVarV.K(pVar)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i13 |= i19;
            }
            if ((74899 & i13) == 74898) {
                if (i15 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i17 != 0) {
                    z12 = true;
                }
                if (o.J()) {
                    o.S(-84584070, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)");
                }
                if (z12) {
                    dVarC = r1.c.c(dVar2, contextMenuState);
                } else {
                    dVarC = dVar2;
                }
                i0 i0VarH118 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), true);
                iA = p020r2.j.a(lVarV, 0);
                x xVarC118 = lVarV.c();
                androidx.compose.ui.d dVarE118 = androidx.compose.ui.c.e(lVarV, dVarC);
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
                d4.b(lVarA, i0VarH118, companion118.c());
                d4.b(lVarA, xVarC118, companion118.e());
                pVarB = companion118.b();
                if (lVarA.u()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                d4.b(lVarA, dVarE118, companion118.d());
                androidx.compose.foundation.layout.i iVar118 = androidx.compose.foundation.layout.i.f4585a;
                pVar.invoke(lVarV, Integer.valueOf((i13 >> 15) & 14));
                a(contextMenuState, aVar2, null, lVar3, lVarV, (i13 & 126) | ((i13 << 3) & 7168), 4);
                lVarV.g();
                if (o.J()) {
                    o.R();
                }
            } else {
                if (i15 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i17 != 0) {
                    z12 = true;
                }
                if (o.J()) {
                    o.S(-84584070, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)");
                }
                if (z12) {
                    dVarC = r1.c.c(dVar2, contextMenuState);
                } else {
                    dVarC = dVar2;
                }
                i0 i0VarH119 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), true);
                iA = p020r2.j.a(lVarV, 0);
                x xVarC119 = lVarV.c();
                androidx.compose.ui.d dVarE119 = androidx.compose.ui.c.e(lVarV, dVarC);
                b4.g.Companion companion119 = b4.g.INSTANCE;
                aVarA = companion119.a();
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
                d4.b(lVarA, i0VarH119, companion119.c());
                d4.b(lVarA, xVarC119, companion119.e());
                pVarB = companion119.b();
                if (lVarA.u()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                d4.b(lVarA, dVarE119, companion119.d());
                androidx.compose.foundation.layout.i iVar119 = androidx.compose.foundation.layout.i.f4585a;
                pVar.invoke(lVarV, Integer.valueOf((i13 >> 15) & 14));
                a(contextMenuState, aVar2, null, lVar3, lVarV, (i13 & 126) | ((i13 << 3) & 7168), 4);
                lVarV.g();
                if (o.J()) {
                    o.R();
                }
            }
            z13 = z12;
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new c(contextMenuState, aVar, lVar, dVar2, z13, pVar, i11, i12));
            }
        }
        i13 |= 24576;
        z12 = z11;
        if ((i12 & 32) != 0) {
            i13 |= 196608;
        } else if ((i11 & 196608) == 0) {
            if (lVarV.K(pVar)) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i13 |= i19;
        }
        if ((74899 & i13) == 74898) {
            if (i15 != 0) {
                dVar2 = androidx.compose.ui.d.INSTANCE;
            }
            if (i17 != 0) {
                z12 = true;
            }
            if (o.J()) {
                o.S(-84584070, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)");
            }
            if (z12) {
                dVarC = r1.c.c(dVar2, contextMenuState);
            } else {
                dVarC = dVar2;
            }
            i0 i0VarH1110 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), true);
            iA = p020r2.j.a(lVarV, 0);
            x xVarC1110 = lVarV.c();
            androidx.compose.ui.d dVarE1110 = androidx.compose.ui.c.e(lVarV, dVarC);
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
            d4.b(lVarA, i0VarH1110, companion1110.c());
            d4.b(lVarA, xVarC1110, companion1110.e());
            pVarB = companion1110.b();
            if (lVarA.u()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE1110, companion1110.d());
            androidx.compose.foundation.layout.i iVar1110 = androidx.compose.foundation.layout.i.f4585a;
            pVar.invoke(lVarV, Integer.valueOf((i13 >> 15) & 14));
            a(contextMenuState, aVar2, null, lVar3, lVarV, (i13 & 126) | ((i13 << 3) & 7168), 4);
            lVarV.g();
            if (o.J()) {
                o.R();
            }
        } else {
            if (i15 != 0) {
                dVar2 = androidx.compose.ui.d.INSTANCE;
            }
            if (i17 != 0) {
                z12 = true;
            }
            if (o.J()) {
                o.S(-84584070, i13, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:44)");
            }
            if (z12) {
                dVarC = r1.c.c(dVar2, contextMenuState);
            } else {
                dVarC = dVar2;
            }
            i0 i0VarH1111 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), true);
            iA = p020r2.j.a(lVarV, 0);
            x xVarC1111 = lVarV.c();
            androidx.compose.ui.d dVarE1111 = androidx.compose.ui.c.e(lVarV, dVarC);
            b4.g.Companion companion1111 = b4.g.INSTANCE;
            aVarA = companion1111.a();
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
            d4.b(lVarA, i0VarH1111, companion1111.c());
            d4.b(lVarA, xVarC1111, companion1111.e());
            pVarB = companion1111.b();
            if (lVarA.u()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE1111, companion1111.d());
            androidx.compose.foundation.layout.i iVar1111 = androidx.compose.foundation.layout.i.f4585a;
            pVar.invoke(lVarV, Integer.valueOf((i13 >> 15) & 14));
            a(contextMenuState, aVar2, null, lVar3, lVarV, (i13 & 126) | ((i13 << 3) & 7168), 4);
            lVarV.g();
            if (o.J()) {
                o.R();
            }
        }
        z13 = z12;
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new c(contextMenuState, aVar, lVar, dVar2, z13, pVar, i11, i12));
        }
    }
}
