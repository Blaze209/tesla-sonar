package com.fourthline.orca.internal;

import com.fourthline.core.eid.EidServiceProvider;
import com.fourthline.networking.NetworkEnvironment;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.fourthline.orca.internal.nd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3599nd {
    public final Yf a(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new Yf(tracker);
    }

    public final InterfaceC2889Jc b(C2899Lc bundle, EidServiceProvider eidServiceProvider) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(eidServiceProvider, "eidServiceProvider");
        return new Zs(bundle, eidServiceProvider);
    }

    public final InterfaceC4073ye c(C2899Lc bundle, EidServiceProvider eidServiceProvider) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(eidServiceProvider, "eidServiceProvider");
        return new C3060at(bundle, eidServiceProvider);
    }

    public final InterfaceC3346hg a(C2899Lc bundle, wn0.a workflowIdProvider, C3257fd eidFlowConfig) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(eidFlowConfig, "eidFlowConfig");
        return new C3303gg(workflowIdProvider, bundle, eidFlowConfig);
    }

    public final C3430jg a(InterfaceC3732qh imageServiceLocator, InterfaceC3346hg repository) {
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        return new C3430jg(imageServiceLocator, repository);
    }

    public final InterfaceC2891Je a(InterfaceC3051ak mainRepository, C3257fd eidFlowConfig, NetworkEnvironment networkEnvironment, Gl networkService) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        p013kotlin.jvm.internal.s.k(eidFlowConfig, "eidFlowConfig");
        p013kotlin.jvm.internal.s.k(networkEnvironment, "networkEnvironment");
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        if (mainRepository.a()) {
            return new Uz();
        }
        if (p013kotlin.jvm.internal.s.f(networkEnvironment, NetworkEnvironment.Sandbox.INSTANCE) && eidFlowConfig.getBoxCardSimulation()) {
            return new A0();
        }
        return new C3351hl(networkService);
    }

    public final InterfaceC2879Hc a(C2899Lc bundle, EidServiceProvider eidServiceProvider) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(eidServiceProvider, "eidServiceProvider");
        return new Ys(bundle, eidServiceProvider);
    }

    public final InterfaceC3022Zd a(InterfaceC2891Je eidWorkflowTokenUrlWorker, InterfaceC4073ye eidSdkConnectedWorker, InterfaceC2889Jc eidAccessRightsWorker) {
        p013kotlin.jvm.internal.s.k(eidWorkflowTokenUrlWorker, "eidWorkflowTokenUrlWorker");
        p013kotlin.jvm.internal.s.k(eidSdkConnectedWorker, "eidSdkConnectedWorker");
        p013kotlin.jvm.internal.s.k(eidAccessRightsWorker, "eidAccessRightsWorker");
        return new C4(eidWorkflowTokenUrlWorker, eidSdkConnectedWorker, eidAccessRightsWorker);
    }

    public final C3473kg a(C3343hd flowCoordinator, InterfaceC3346hg repository, Yf analytics, InterfaceC3022Zd eidReadyWorker, InterfaceC3559mg flowVariantWorker, InterfaceC2879Hc eidAcceptAccessRightsWorker, C3430jg stateProvider, InterfaceC3732qh imageServiceLocator, Uj lottieServiceLocator, C4087ys popupHandlerBuilder, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(eidReadyWorker, "eidReadyWorker");
        p013kotlin.jvm.internal.s.k(flowVariantWorker, "flowVariantWorker");
        p013kotlin.jvm.internal.s.k(eidAcceptAccessRightsWorker, "eidAcceptAccessRightsWorker");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        return new C3473kg(new C3520lk(stateProvider), flowCoordinator, stateProvider, repository, eidReadyWorker, flowVariantWorker, analytics, popupHandlerBuilder.a(new C3217eg(repository, eidAcceptAccessRightsWorker, flowCoordinator, analytics, imageServiceLocator, lottieServiceLocator, coroutineScope), new C3260fg(flowCoordinator, analytics, imageServiceLocator), new C3045ae(imageServiceLocator), new C3044ad(imageServiceLocator)), coroutineScope);
    }
}
