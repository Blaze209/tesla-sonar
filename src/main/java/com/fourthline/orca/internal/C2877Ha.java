package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Ha, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2877Ha {
    public final C2932Sa a(C3438jo tracker, InterfaceC3212eb documentScannerRepository) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        p013kotlin.jvm.internal.s.k(documentScannerRepository, "documentScannerRepository");
        return new C2932Sa(tracker, documentScannerRepository);
    }

    public final InterfaceC3216ef a(InterfaceC3216ef permissionErrorPopupStateBuilder, InterfaceC3216ef postProcessingErrorPopupStateBuilder, InterfaceC3216ef scannerErrorPopupStateBuilder) {
        p013kotlin.jvm.internal.s.k(permissionErrorPopupStateBuilder, "permissionErrorPopupStateBuilder");
        p013kotlin.jvm.internal.s.k(postProcessingErrorPopupStateBuilder, "postProcessingErrorPopupStateBuilder");
        p013kotlin.jvm.internal.s.k(scannerErrorPopupStateBuilder, "scannerErrorPopupStateBuilder");
        return new C3631o8(permissionErrorPopupStateBuilder, postProcessingErrorPopupStateBuilder, scannerErrorPopupStateBuilder);
    }

    public final InterfaceC3131cf a(InterfaceC3131cf permissionErrorPopupClicksHandler, InterfaceC3131cf postProcessingErrorPopupClicksHandler, InterfaceC3131cf scannerErrorPopupClicksHandler) {
        p013kotlin.jvm.internal.s.k(permissionErrorPopupClicksHandler, "permissionErrorPopupClicksHandler");
        p013kotlin.jvm.internal.s.k(postProcessingErrorPopupClicksHandler, "postProcessingErrorPopupClicksHandler");
        p013kotlin.jvm.internal.s.k(scannerErrorPopupClicksHandler, "scannerErrorPopupClicksHandler");
        return new C3588n8(permissionErrorPopupClicksHandler, postProcessingErrorPopupClicksHandler, scannerErrorPopupClicksHandler);
    }

    public final InterfaceC2931Re a(InterfaceC3131cf errorPopupClicksHandler, Bs errorPopupPresenter, InterfaceC3216ef errorPopupStateBuilder, C3046af analytics, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(errorPopupClicksHandler, "errorPopupClicksHandler");
        p013kotlin.jvm.internal.s.k(errorPopupPresenter, "errorPopupPresenter");
        p013kotlin.jvm.internal.s.k(errorPopupStateBuilder, "errorPopupStateBuilder");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        return AbstractC2936Se.a(errorPopupPresenter, errorPopupStateBuilder, errorPopupClicksHandler, analytics, coroutineScope);
    }

    public final C3425jb a(InterfaceC3212eb repository, InterfaceC3554mb documentScannerStepGraphicsProvider, InterfaceC3511lb textProvider, Uj lottieServiceLocator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(documentScannerStepGraphicsProvider, "documentScannerStepGraphicsProvider");
        p013kotlin.jvm.internal.s.k(textProvider, "textProvider");
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new C3425jb(repository, documentScannerStepGraphicsProvider, textProvider, lottieServiceLocator, imageServiceLocator, repository.o());
    }

    public final C3640ob a(InterfaceC3212eb repository, InterfaceC3298gb resultRepository, ND viewNavigator, ED viewCompletionHandler, C3425jb stateProvider, InterfaceC3921uz stepConfirmationHandler, ou.m customVideoRecordingHandler, ou.m featurePilotHandler, InterfaceC2931Re documentErrorHandler, C2932Sa analytics, InterfaceC3732qh imageServiceLocator, Uj lottieServiceLocator, C4087ys popupHandlerBuilder, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(resultRepository, "resultRepository");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(stepConfirmationHandler, "stepConfirmationHandler");
        p013kotlin.jvm.internal.s.k(customVideoRecordingHandler, "customVideoRecordingHandler");
        p013kotlin.jvm.internal.s.k(featurePilotHandler, "featurePilotHandler");
        p013kotlin.jvm.internal.s.k(documentErrorHandler, "documentErrorHandler");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        C2874Gc c2874Gc = new C2874Gc(coroutineScope);
        C3520lk c3520lk = new C3520lk(stateProvider);
        Object objE = customVideoRecordingHandler.e(new C3933vA());
        p013kotlin.jvm.internal.s.j(objE, "or(...)");
        InterfaceC4066yD interfaceC4066yD = (InterfaceC4066yD) objE;
        InterfaceC4044xs interfaceC4044xsA = popupHandlerBuilder.a(new C3767ra(analytics, imageServiceLocator, lottieServiceLocator));
        Object objE2 = featurePilotHandler.e(new C4102z6());
        p013kotlin.jvm.internal.s.j(objE2, "or(...)");
        return new C3640ob(c3520lk, c2874Gc, repository, resultRepository, stateProvider, stepConfirmationHandler, interfaceC4066yD, viewCompletionHandler, documentErrorHandler, viewNavigator, analytics, interfaceC4044xsA, (InterfaceC3019Za) objE2, coroutineScope);
    }

    public final Fs a() {
        return new Fs();
    }
}
