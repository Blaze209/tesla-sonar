package com.fourthline.orca.internal;

import com.fourthline.orca.qes.internal.error.QesErrorPopupClicksHandler;
import com.fourthline.orca.qes.internal.error.QesErrorPopupStateBuilder;
import com.fourthline.orca.qes.internal.error.QesOrcaErrorHandler;
import com.fourthline.orca.qes.internal.error.WorkerErrorPopupClicksHandler;
import com.fourthline.orca.qes.internal.error.WorkerErrorPopupStateBuilder;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class Et {
    public final InterfaceC2931Re a(InterfaceC2931Re workerErrorHandler, InterfaceC2931Re qesErrorHandler, InterfaceC2931Re qesAgreementsErrorHandler) {
        p013kotlin.jvm.internal.s.k(workerErrorHandler, "workerErrorHandler");
        p013kotlin.jvm.internal.s.k(qesErrorHandler, "qesErrorHandler");
        p013kotlin.jvm.internal.s.k(qesAgreementsErrorHandler, "qesAgreementsErrorHandler");
        return new QesOrcaErrorHandler(workerErrorHandler, qesErrorHandler, qesAgreementsErrorHandler);
    }

    public final C3744qt b(InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new C3744qt(imageServiceLocator);
    }

    public final QesErrorPopupStateBuilder c(InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new QesErrorPopupStateBuilder(imageServiceLocator);
    }

    public final Lv d(InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new Lv(imageServiceLocator);
    }

    public final WorkerErrorPopupStateBuilder e(InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new WorkerErrorPopupStateBuilder(imageServiceLocator);
    }

    public final InterfaceC2931Re a(WorkerErrorPopupClicksHandler workerErrorPopupClicksHandler, Bs errorPopupPresenter, WorkerErrorPopupStateBuilder workerErrorPopupStateBuilder, C3046af analytics, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(workerErrorPopupClicksHandler, "workerErrorPopupClicksHandler");
        p013kotlin.jvm.internal.s.k(errorPopupPresenter, "errorPopupPresenter");
        p013kotlin.jvm.internal.s.k(workerErrorPopupStateBuilder, "workerErrorPopupStateBuilder");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        return AbstractC2936Se.a(errorPopupPresenter, workerErrorPopupStateBuilder, workerErrorPopupClicksHandler, analytics, coroutineScope);
    }

    public final Kv b(InterfaceC3997wo orcaDestroyer) {
        p013kotlin.jvm.internal.s.k(orcaDestroyer, "orcaDestroyer");
        return new Kv(orcaDestroyer);
    }

    public final InterfaceC2931Re a(QesErrorPopupClicksHandler errorPopupClicksHandler, Bs errorPopupPresenter, QesErrorPopupStateBuilder errorPopupStateBuilder, C3046af analytics, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(errorPopupClicksHandler, "errorPopupClicksHandler");
        p013kotlin.jvm.internal.s.k(errorPopupPresenter, "errorPopupPresenter");
        p013kotlin.jvm.internal.s.k(errorPopupStateBuilder, "errorPopupStateBuilder");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        return AbstractC2936Se.a(errorPopupPresenter, errorPopupStateBuilder, errorPopupClicksHandler, analytics, coroutineScope);
    }

    public final QesErrorPopupClicksHandler a(InterfaceC3997wo orcaDestroyer) {
        p013kotlin.jvm.internal.s.k(orcaDestroyer, "orcaDestroyer");
        return new QesErrorPopupClicksHandler(orcaDestroyer);
    }

    public final WorkerErrorPopupClicksHandler a(InterfaceC3997wo orcaDestroyer, C3104bu qesFlowDataBundle) {
        p013kotlin.jvm.internal.s.k(orcaDestroyer, "orcaDestroyer");
        p013kotlin.jvm.internal.s.k(qesFlowDataBundle, "qesFlowDataBundle");
        return new WorkerErrorPopupClicksHandler(orcaDestroyer, qesFlowDataBundle);
    }

    public final InterfaceC2931Re a(C3701pt errorPopupClicksHandler, C3744qt errorPopupStateBuilder, Bs errorPopupPresenter, C3046af analytics, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(errorPopupClicksHandler, "errorPopupClicksHandler");
        p013kotlin.jvm.internal.s.k(errorPopupStateBuilder, "errorPopupStateBuilder");
        p013kotlin.jvm.internal.s.k(errorPopupPresenter, "errorPopupPresenter");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        return AbstractC2936Se.a(errorPopupPresenter, errorPopupStateBuilder, errorPopupClicksHandler, analytics, coroutineScope);
    }

    public final C3701pt a() {
        return new C3701pt();
    }

    public final InterfaceC2931Re a(Kv errorPopupClicksHandler, Lv errorPopupStateBuilder, Bs errorPopupPresenter, C3046af analytics, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(errorPopupClicksHandler, "errorPopupClicksHandler");
        p013kotlin.jvm.internal.s.k(errorPopupStateBuilder, "errorPopupStateBuilder");
        p013kotlin.jvm.internal.s.k(errorPopupPresenter, "errorPopupPresenter");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        return AbstractC2936Se.a(errorPopupPresenter, errorPopupStateBuilder, errorPopupClicksHandler, analytics, coroutineScope);
    }

    public final InterfaceC2931Re a(InterfaceC3131cf errorPopupClicksHandler, C3534ly errorPopupStateBuilder, Bs popupPresenter, C3046af analytics, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(errorPopupClicksHandler, "errorPopupClicksHandler");
        p013kotlin.jvm.internal.s.k(errorPopupStateBuilder, "errorPopupStateBuilder");
        p013kotlin.jvm.internal.s.k(popupPresenter, "popupPresenter");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        return AbstractC2936Se.a(popupPresenter, errorPopupStateBuilder, errorPopupClicksHandler, analytics, coroutineScope);
    }

    public final InterfaceC3131cf a(ND viewNavigator) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        return new Sw(viewNavigator);
    }

    public final C3534ly a(InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new C3534ly(imageServiceLocator);
    }
}
