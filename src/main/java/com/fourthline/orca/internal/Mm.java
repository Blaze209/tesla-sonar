package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class Mm {
    public final InterfaceC2931Re a(Fm errorPopupClicksHandler, Bs errorPopupPresenter, Gm errorPopupStateBuilder, C3046af analytics, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(errorPopupClicksHandler, "errorPopupClicksHandler");
        p013kotlin.jvm.internal.s.k(errorPopupPresenter, "errorPopupPresenter");
        p013kotlin.jvm.internal.s.k(errorPopupStateBuilder, "errorPopupStateBuilder");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        return AbstractC2936Se.a(errorPopupPresenter, errorPopupStateBuilder, errorPopupClicksHandler, analytics, coroutineScope);
    }

    public final Gm a(InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new Gm(EF.a(imageServiceLocator), imageServiceLocator);
    }

    public final Fm a(ND viewNavigator) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        return new Fm(viewNavigator);
    }
}
