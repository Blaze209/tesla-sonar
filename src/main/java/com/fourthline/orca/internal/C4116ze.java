package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4116ze {
    public final TC a(Uj lottieServiceLocator) {
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        return new TC(false, lottieServiceLocator.a(Tj.NetworkSpinnerThick));
    }

    public final InterfaceC3087bd a(InterfaceC3051ak mainRepository, Gl networkService) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        if (mainRepository.a()) {
            return new Tz();
        }
        return new C3308gl(networkService);
    }

    public final ED a(C3214ed flowActionProvider, Vf dataWorkManager, InterfaceC3645og whatsNextWorker) {
        p013kotlin.jvm.internal.s.k(flowActionProvider, "flowActionProvider");
        p013kotlin.jvm.internal.s.k(dataWorkManager, "dataWorkManager");
        p013kotlin.jvm.internal.s.k(whatsNextWorker, "whatsNextWorker");
        return new C4084yp(flowActionProvider, new Wz(), dataWorkManager, whatsNextWorker);
    }

    public final C2870Fe a(TC stateProvider, C3343hd flowCoordinator, InterfaceC3087bd eidFinishWorker, wn0.a workflowIdProvider, C4087ys popupHandlerBuilder, InterfaceC3732qh imageServiceLocator, ED viewCompletionHandler, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(eidFinishWorker, "eidFinishWorker");
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        return new C2870Fe(new C3520lk(stateProvider), flowCoordinator, eidFinishWorker, workflowIdProvider, viewCompletionHandler, popupHandlerBuilder.a(new C2876Ge(flowCoordinator, imageServiceLocator), new C2886Ie(flowCoordinator, imageServiceLocator), new C2881He(flowCoordinator, imageServiceLocator)), coroutineScope);
    }
}
