package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class C8 {
    public final Pi a(C4061y8 scannerCoordinator) {
        p013kotlin.jvm.internal.s.k(scannerCoordinator, "scannerCoordinator");
        return new Pi(scannerCoordinator);
    }

    public final Oi c(C4061y8 flowCoordinator) {
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        return new Oi(flowCoordinator);
    }

    public final C3211ea a(InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new C3211ea(imageServiceLocator);
    }

    public final Ni b(C4061y8 flowCoordinator) {
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        return new Ni(flowCoordinator);
    }

    public final C3297ga a(final C3085bb flowConfig, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new C3297ga(true, new wn0.a() { // from class: com.fourthline.orca.internal.h10
            @Override // wn0.a
            public final Object invoke() {
                return Integer.valueOf(C8.a(flowConfig));
            }
        }, imageServiceLocator);
    }

    public final C3014Ya b(InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new C3014Ya(false, imageServiceLocator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(C3085bb c3085bb) {
        return c3085bb.f();
    }

    public final InterfaceC4044xs a(C4087ys popupHandlerBuilder, Uj lottieServiceLocator) {
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        return popupHandlerBuilder.a(new L3(lottieServiceLocator));
    }
}
