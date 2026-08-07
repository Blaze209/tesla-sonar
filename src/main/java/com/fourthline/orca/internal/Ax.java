package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class Ax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4006wx f25035a;

    public Ax(C4006wx flowConfig) {
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        this.f25035a = flowConfig;
    }

    public final C3963vx a(InterfaceC3051ak mainRepository) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        return new C3963vx(AbstractC3094bk.a(mainRepository));
    }

    public final Hx a(C4135zx selfieFlowDataBundle, E6 deviceDataBundle, boolean z11) {
        p013kotlin.jvm.internal.s.k(selfieFlowDataBundle, "selfieFlowDataBundle");
        p013kotlin.jvm.internal.s.k(deviceDataBundle, "deviceDataBundle");
        return new Ix(selfieFlowDataBundle, deviceDataBundle, z11, this.f25035a.f(), this.f25035a.d(), this.f25035a.getCameraX().getEnabled(), this.f25035a.getOrg.webrtc.MediaStreamTrack.VIDEO_TRACK_KIND java.lang.String().getBitrate(), this.f25035a.getRandomnessConfig());
    }

    public final Mx a(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new Mx(tracker);
    }

    public final Sx a(Uj lottieServiceLocator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new Sx(0, 0, lottieServiceLocator, imageServiceLocator, 3, null);
    }

    public final Tx a(final C4092yx flowCoordinator, Mx analytics, Sx stateProvider, C4087ys popupHandlerBuilder, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new Tx(new C3520lk(stateProvider), flowCoordinator, popupHandlerBuilder.a(new C3348hi(new wn0.l() { // from class: com.fourthline.orca.internal.m00
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Ax.a(flowCoordinator, (Ds.c) obj);
            }
        }, imageServiceLocator)), analytics);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(C4092yx c4092yx, Ds.c it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        c4092yx.a(Nx.a.f27101a);
        return jn0.h0.f84049a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Qx a(InterfaceC3863tk navigationChannel, final Fp permissionChecker, C4087ys popupHandlerBuilder, Uj lottieServiceLocator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(permissionChecker, "permissionChecker");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new Qx(navigationChannel, new wn0.a() { // from class: com.fourthline.orca.internal.n00
            @Override // wn0.a
            public final Object invoke() {
                return Boolean.valueOf(Ax.a(permissionChecker));
            }
        }, popupHandlerBuilder.a(new L3(lottieServiceLocator), new T3(null, imageServiceLocator, 1, 0 == true ? 1 : 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(Fp fp2) {
        return !fp2.a();
    }
}
