package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.id, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3386id {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3257fd f32500a;

    public C3386id(C3257fd flowConfig) {
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        this.f32500a = flowConfig;
    }

    public final C3257fd a() {
        return this.f32500a;
    }

    public final C3214ed b() {
        return new C3214ed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C3343hd a(InterfaceC3863tk navigationChannel, C4087ys popupHandlerBuilder, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new C3343hd(navigationChannel, popupHandlerBuilder.a(new T3(null, imageServiceLocator, 1, 0 == true ? 1 : 0)));
    }
}
