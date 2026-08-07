package com.fourthline.orca.internal;

import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* JADX INFO: renamed from: com.fourthline.orca.internal.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3923v0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(p011ja.w wVar, String str, wn0.l lVar, int i11, p020r2.l lVar2, int i12) {
        a(wVar, str, lVar, lVar2, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.k b(androidx.compose.animation.d NavHost) {
        p013kotlin.jvm.internal.s.k(NavHost, "$this$NavHost");
        if (e(NavHost)) {
            return androidx.compose.animation.k.INSTANCE.a();
        }
        if (a(((p011ja.k) NavHost.getInitialState()).getDestination().getRoute())) {
            return androidx.compose.animation.d.d(NavHost, androidx.compose.animation.d.a.INSTANCE.a(), null, null, 6, null);
        }
        return a(((p011ja.k) NavHost.e()).getDestination().getRoute()) ? androidx.compose.animation.d.d(NavHost, androidx.compose.animation.d.a.INSTANCE.f(), null, null, 6, null) : androidx.compose.animation.d.d(NavHost, androidx.compose.animation.d.a.INSTANCE.c(), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.i c(androidx.compose.animation.d NavHost) {
        p013kotlin.jvm.internal.s.k(NavHost, "$this$NavHost");
        return a(((p011ja.k) NavHost.getInitialState()).getDestination().getRoute()) ? androidx.compose.animation.d.f(NavHost, androidx.compose.animation.d.a.INSTANCE.a(), null, null, 6, null) : androidx.compose.animation.d.f(NavHost, androidx.compose.animation.d.a.INSTANCE.d(), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.k d(androidx.compose.animation.d NavHost) {
        p013kotlin.jvm.internal.s.k(NavHost, "$this$NavHost");
        return a(((p011ja.k) NavHost.getInitialState()).getDestination().getRoute()) ? androidx.compose.animation.d.d(NavHost, androidx.compose.animation.d.a.INSTANCE.a(), null, null, 6, null) : androidx.compose.animation.d.d(NavHost, androidx.compose.animation.d.a.INSTANCE.d(), null, null, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean e(androidx.compose.animation.d dVar) {
        return p013kotlin.jvm.internal.s.f(((p011ja.k) dVar.getInitialState()).getDestination(), ((p011ja.k) dVar.e()).getDestination());
    }

    public static final void a(final p011ja.w navHostController, final String startDestination, final wn0.l builder, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(navHostController, "navHostController");
        p013kotlin.jvm.internal.s.k(startDestination, "startDestination");
        p013kotlin.jvm.internal.s.k(builder, "builder");
        p020r2.l lVarV = lVar.v(-1271506289);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.K(navHostController) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.n(startDestination) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= lVarV.K(builder) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-1271506289, i12, -1, "com.fourthline.orca.core.internal.navigation.AnimatedGraph (AnimatedGraph.kt:22)");
            }
            lVarV.o(2139991558);
            Object objI = lVarV.I();
            p020r2.l.Companion companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                objI = new wn0.l() { // from class: com.fourthline.orca.internal.sf1
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3923v0.a((androidx.compose.animation.d) obj);
                    }
                };
                lVarV.B(objI);
            }
            wn0.l lVar2 = (wn0.l) objI;
            lVarV.l();
            lVarV.o(2140005512);
            Object objI2 = lVarV.I();
            if (objI2 == companion.a()) {
                objI2 = new wn0.l() { // from class: com.fourthline.orca.internal.tf1
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3923v0.b((androidx.compose.animation.d) obj);
                    }
                };
                lVarV.B(objI2);
            }
            wn0.l lVar3 = (wn0.l) objI2;
            lVarV.l();
            lVarV.o(2140019491);
            Object objI3 = lVarV.I();
            if (objI3 == companion.a()) {
                objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.uf1
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3923v0.c((androidx.compose.animation.d) obj);
                    }
                };
                lVarV.B(objI3);
            }
            wn0.l lVar4 = (wn0.l) objI3;
            lVarV.l();
            lVarV.o(2140028325);
            Object objI4 = lVarV.I();
            if (objI4 == companion.a()) {
                objI4 = new wn0.l() { // from class: com.fourthline.orca.internal.vf1
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3923v0.d((androidx.compose.animation.d) obj);
                    }
                };
                lVarV.B(objI4);
            }
            lVarV.l();
            ka.m.c(navHostController, startDestination, null, null, null, lVar2, lVar3, lVar4, (wn0.l) objI4, null, builder, lVarV, (i12 & 14) | 115015680 | (i12 & 112), (i12 >> 6) & 14, 540);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.wf1
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3923v0.a(navHostController, startDestination, builder, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.i a(androidx.compose.animation.d NavHost) {
        p013kotlin.jvm.internal.s.k(NavHost, "$this$NavHost");
        if (e(NavHost)) {
            return androidx.compose.animation.i.INSTANCE.a();
        }
        if (a(((p011ja.k) NavHost.getInitialState()).getDestination().getRoute())) {
            return androidx.compose.animation.d.f(NavHost, androidx.compose.animation.d.a.INSTANCE.a(), null, null, 6, null);
        }
        return a(((p011ja.k) NavHost.e()).getDestination().getRoute()) ? androidx.compose.animation.d.f(NavHost, androidx.compose.animation.d.a.INSTANCE.f(), null, null, 6, null) : androidx.compose.animation.d.f(NavHost, androidx.compose.animation.d.a.INSTANCE.c(), null, null, 6, null);
    }

    private static final boolean a(String str) {
        return p013kotlin.jvm.internal.s.f(str, new InterfaceC3949vk.q.b(null, 1, null).a()) || p013kotlin.jvm.internal.s.f(str, new InterfaceC3949vk.v.g(null, 1, null).a()) || p013kotlin.jvm.internal.s.f(str, new InterfaceC3949vk.x.c(null, 1, null).a()) || p013kotlin.jvm.internal.s.f(str, new InterfaceC3949vk.i.e(null, 1, null).a()) || p013kotlin.jvm.internal.s.f(str, new InterfaceC3949vk.s.c(null, 1, null).a());
    }
}
