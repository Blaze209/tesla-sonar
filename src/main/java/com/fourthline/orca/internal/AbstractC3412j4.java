package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.j4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3412j4 {
    public static final List a(InterfaceC3863tk navigationChannel, InterfaceC3997wo orcaDestroyer, InterfaceC3051ak mainRepository, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(orcaDestroyer, "orcaDestroyer");
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        if (!AbstractC3094bk.a(mainRepository)) {
            return p013kotlin.collections.v.m();
        }
        if (!(mainRepository instanceof If)) {
            throw new IllegalStateException("FL Developer error. Current product does not support ViewCompletion Error-handling.");
        }
        C3210eF c3210eF = new C3210eF();
        return p013kotlin.collections.v.p(new DD(orcaDestroyer, imageServiceLocator), new ID(navigationChannel, c3210eF, imageServiceLocator), new GD(navigationChannel, c3210eF, imageServiceLocator), new HD(navigationChannel, c3210eF, imageServiceLocator));
    }
}
