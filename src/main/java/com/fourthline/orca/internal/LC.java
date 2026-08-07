package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class LC {
    /* JADX WARN: Multi-variable type inference failed */
    public final KC a(InterfaceC3863tk navigationChannel, C4087ys popupHandlerBuilder, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new KC(navigationChannel, popupHandlerBuilder.a(new T3(null, imageServiceLocator, 1, 0 == true ? 1 : 0)));
    }

    public final TC a(Uj lottieServiceLocator) {
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        return new TC(false, lottieServiceLocator.a(Tj.NetworkSpinnerThick));
    }

    public final EC a() {
        return new EC();
    }

    public final UC a(TC stateProvider, InterfaceC4044xs popupHandler, EC analytics, KC flowCoordinator, RC requestsBuilder, Vf dataWorkManager, InterfaceC3645og whatsNextWorker, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(requestsBuilder, "requestsBuilder");
        p013kotlin.jvm.internal.s.k(dataWorkManager, "dataWorkManager");
        p013kotlin.jvm.internal.s.k(whatsNextWorker, "whatsNextWorker");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        return new UC(new C3520lk(stateProvider), stateProvider, popupHandler, flowCoordinator, analytics, requestsBuilder, dataWorkManager, whatsNextWorker, coroutineScope);
    }
}
