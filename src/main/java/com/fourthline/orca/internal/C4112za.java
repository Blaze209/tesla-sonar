package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.za, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4112za {
    public final InterfaceC3131cf a(ND viewNavigator, ou.m customClicksHandler) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(customClicksHandler, "customClicksHandler");
        Object objE = customClicksHandler.e(new C3169da(viewNavigator));
        p013kotlin.jvm.internal.s.j(objE, "or(...)");
        return (InterfaceC3131cf) objE;
    }

    public final InterfaceC3131cf c(ND viewNavigator, ou.m customClicksHandler) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(customClicksHandler, "customClicksHandler");
        Object objE = customClicksHandler.e(new C3009Xa(viewNavigator));
        p013kotlin.jvm.internal.s.j(objE, "or(...)");
        return (InterfaceC3131cf) objE;
    }

    public final InterfaceC3131cf b(ND viewNavigator, ou.m customClicksHandler) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(customClicksHandler, "customClicksHandler");
        Object objE = customClicksHandler.e(new C3254fa(viewNavigator));
        p013kotlin.jvm.internal.s.j(objE, "or(...)");
        return (InterfaceC3131cf) objE;
    }

    public final InterfaceC3216ef a(ou.m customStateBuilder, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(customStateBuilder, "customStateBuilder");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        Object objE = customStateBuilder.e(new C3211ea(imageServiceLocator));
        p013kotlin.jvm.internal.s.j(objE, "or(...)");
        return (InterfaceC3216ef) objE;
    }

    public final InterfaceC3216ef b(ou.m customStateBuilder, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(customStateBuilder, "customStateBuilder");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        Object objE = customStateBuilder.e(new C3014Ya(true, imageServiceLocator));
        p013kotlin.jvm.internal.s.j(objE, "or(...)");
        return (InterfaceC3216ef) objE;
    }

    public final InterfaceC3216ef a(final InterfaceC3212eb repository, ou.m customStateBuilder, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(customStateBuilder, "customStateBuilder");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        Object objE = customStateBuilder.e(new C3297ga(false, new wn0.a() { // from class: com.fourthline.orca.internal.fj1
            @Override // wn0.a
            public final Object invoke() {
                return Integer.valueOf(C4112za.a(repository));
            }
        }, imageServiceLocator));
        p013kotlin.jvm.internal.s.j(objE, "or(...)");
        return (InterfaceC3216ef) objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(InterfaceC3212eb interfaceC3212eb) {
        return interfaceC3212eb.t().getValidationConfig().getMinPersonAge();
    }

    public final InterfaceC3511lb a(ou.m customProvider) {
        p013kotlin.jvm.internal.s.k(customProvider, "customProvider");
        return (InterfaceC3511lb) customProvider.e(new A6());
    }
}
