package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.fourthline.orca.internal.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3156d3 {
    public final C3321gy a(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new C3321gy(tracker);
    }

    public final InterfaceC3791ry a(Uj lottieServiceLocator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new Si(lottieServiceLocator.a(Tj.LoadingSpinner), lottieServiceLocator.a(Tj.SelfieLivenessLeft), lottieServiceLocator.a(Tj.SelfieLivenessRight), lottieServiceLocator.a(Tj.SelfieLiveness), imageServiceLocator);
    }

    public final InterfaceC2931Re a(InterfaceC3131cf errorPopupClicksHandler, Bs errorPopupPresenter, InterfaceC3216ef errorPopupStateBuilder, C3046af analytics, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(errorPopupClicksHandler, "errorPopupClicksHandler");
        p013kotlin.jvm.internal.s.k(errorPopupPresenter, "errorPopupPresenter");
        p013kotlin.jvm.internal.s.k(errorPopupStateBuilder, "errorPopupStateBuilder");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        return AbstractC2936Se.a(errorPopupPresenter, errorPopupStateBuilder, errorPopupClicksHandler, analytics, coroutineScope);
    }

    public final C3834sy a(InterfaceC3663oy repository, ND viewNavigator, ED viewCompletionHandler, InterfaceC3791ry uiStateProvider, InterfaceC2931Re selfieErrorHandler, C3321gy analytics, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(uiStateProvider, "uiStateProvider");
        p013kotlin.jvm.internal.s.k(selfieErrorHandler, "selfieErrorHandler");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        return new C3834sy(new C3520lk(uiStateProvider), new C2874Gc(coroutineScope), uiStateProvider, true, viewNavigator, viewCompletionHandler, repository, selfieErrorHandler, new C3035aA(), analytics, coroutineScope);
    }
}
