package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Nc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2909Nc {
    public final O3 a(C2899Lc eidBundle) {
        p013kotlin.jvm.internal.s.k(eidBundle, "eidBundle");
        return new C2975Vc(eidBundle);
    }

    public final Q3 b(C2899Lc eidBundle) {
        p013kotlin.jvm.internal.s.k(eidBundle, "eidBundle");
        return new C3006Wc(eidBundle);
    }

    public final C4038xm a(O3 repository, C3438jo tracker, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new C4038xm(repository, imageServiceLocator, new Kh(tracker), imageServiceLocator.a(EnumC3689ph.f34536d));
    }

    public final C3737qm a(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new C3737qm(tracker);
    }

    public final C3011Xc a(C4038xm nfcCanStateHandler, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(nfcCanStateHandler, "nfcCanStateHandler");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new C3011Xc(nfcCanStateHandler, imageServiceLocator);
    }

    public final C3016Yc a(C3011Xc stateProvider, Q3 resultRepository, C3737qm analytics, C3343hd flowCoordinator, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(resultRepository, "resultRepository");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        return new C3016Yc(new C3520lk(stateProvider), stateProvider, resultRepository, flowCoordinator, analytics, coroutineScope);
    }
}
