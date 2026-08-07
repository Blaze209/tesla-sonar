package com.fourthline.orca.internal;

import java.util.Arrays;

/* JADX INFO: renamed from: com.fourthline.orca.internal.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3795s1 {
    public final InterfaceC4044xs a(InterfaceC3051ak mainRepository, C4087ys popupHandlerBuilder, C4054y1 viewNavigator, InterfaceC3997wo orcaDestroyer, InterfaceC3863tk navigationChannel, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(orcaDestroyer, "orcaDestroyer");
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        Cs[] csArr = (Cs[]) p013kotlin.collections.v.P0(AbstractC3412j4.a(navigationChannel, orcaDestroyer, mainRepository, imageServiceLocator), p013kotlin.collections.v.p(new P2(viewNavigator, imageServiceLocator), new R2(viewNavigator, imageServiceLocator), new Q2(viewNavigator, imageServiceLocator), new C3667p1(viewNavigator, imageServiceLocator), new C3752r1(viewNavigator, imageServiceLocator), new C3710q1(viewNavigator, imageServiceLocator), new C3410j2(viewNavigator))).toArray(new Cs[0]);
        return popupHandlerBuilder.a((Cs[]) Arrays.copyOf(csArr, csArr.length));
    }
}
