package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.DocumentType;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class Zl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Tl f30088a;

    public Zl(Tl flowConfig) {
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        this.f30088a = flowConfig;
    }

    public final ND a(Ul flowCoordinator) {
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        return flowCoordinator;
    }

    public final C3085bb a() {
        FlowStrategyConfig flowStrategyConfigD = this.f30088a.d();
        boolean zH = this.f30088a.h();
        DocumentImageCaptureConfig documentImageCaptureConfigE = this.f30088a.e();
        DocumentVideoCaptureConfig documentVideoCaptureConfigJ = this.f30088a.j();
        return new C3085bb(flowStrategyConfigD, zH, this.f30088a.c(), documentImageCaptureConfigE, documentVideoCaptureConfigJ, this.f30088a.b(), this.f30088a.f(), this.f30088a.g(), this.f30088a.i());
    }

    public final Q3 b(C4104z8 bundle) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        return new R3(bundle);
    }

    public final C3523ln b(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new C3523ln(tracker);
    }

    public final C4125zn b() {
        return new C4125zn();
    }

    public final C4081ym a(C4038xm stateProvider, Q3 resultRepository, C3737qm analytics, Ul flowCoordinator, CoroutineScope coroutineScope, C3085bb documentScannerFlowConfig) {
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(resultRepository, "resultRepository");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        p013kotlin.jvm.internal.s.k(documentScannerFlowConfig, "documentScannerFlowConfig");
        return new C4081ym(new C3520lk(stateProvider), stateProvider, resultRepository, flowCoordinator, new C3878tz(new Sl.a(documentScannerFlowConfig)), analytics, coroutineScope);
    }

    public final C4038xm a(O3 repository, C3438jo tracker, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new C4038xm(repository, imageServiceLocator, new Kh(tracker), imageServiceLocator.a(EnumC3689ph.f34536d));
    }

    public final C3737qm a(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new C3737qm(tracker);
    }

    public final O3 a(C4104z8 bundle) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        return new P3(bundle);
    }

    public final C4039xn a(Uj lottieServiceLocator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new C4039xn(lottieServiceLocator.a(Tj.NfcIntro), imageServiceLocator);
    }

    public final C4082yn a(C4039xn stateProvider, final InterfaceC3909un repository, C3523ln analytics, Ul flowCoordinator, CoroutineScope coroutineScope, C4087ys popupHandlerBuilder, InterfaceC3732qh imageServiceLocator, Uj lottieServiceLocator, C3085bb documentScannerFlowConfig) {
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        p013kotlin.jvm.internal.s.k(documentScannerFlowConfig, "documentScannerFlowConfig");
        C2874Gc c2874Gc = new C2874Gc(coroutineScope);
        return new C4082yn(new C3520lk(stateProvider), c2874Gc, stateProvider, popupHandlerBuilder.a(new Sn(c2874Gc, lottieServiceLocator), new C3823sn(imageServiceLocator, analytics, new wn0.a() { // from class: com.fourthline.orca.internal.rx0
            @Override // wn0.a
            public final Object invoke() {
                return Boolean.valueOf(Zl.a(repository));
            }
        })), repository, new C3878tz(new Im.b(documentScannerFlowConfig)), analytics, flowCoordinator, coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(InterfaceC3909un interfaceC3909un) {
        return interfaceC3909un.d() == DocumentType.PASSPORT;
    }

    public final InterfaceC3909un a(C4104z8 bundle, Context context) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(context, "context");
        return new C3953vn(bundle, context);
    }

    public final Pn a(final Ln nfcScannerVideos, ND viewNavigator, final Gn repository, InterfaceC2931Re nfcErrorHandler, C4125zn analytics, C4087ys popupHandlerBuilder, CoroutineScope coroutineScope, Uj lottieServiceLocator, InterfaceC3732qh imageServiceLocator, C3085bb documentScannerFlowConfig) {
        p013kotlin.jvm.internal.s.k(nfcScannerVideos, "nfcScannerVideos");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(nfcErrorHandler, "nfcErrorHandler");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(documentScannerFlowConfig, "documentScannerFlowConfig");
        Kn kn2 = new Kn(new wn0.a() { // from class: com.fourthline.orca.internal.sx0
            @Override // wn0.a
            public final Object invoke() {
                return Zl.a(nfcScannerVideos, repository);
            }
        }, lottieServiceLocator.a(Tj.LoadingSpinner), imageServiceLocator);
        return new Pn(new C3520lk(kn2), new C2874Gc(coroutineScope), kn2, viewNavigator, new C3878tz(new Im.b(documentScannerFlowConfig)), repository, nfcErrorHandler, popupHandlerBuilder.a(new Dm(imageServiceLocator), new Tn(imageServiceLocator)), analytics, coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final En.e.a a(Ln ln2, Gn gn2) {
        return (En.e.a) ln2.invoke(gn2.d());
    }

    public final Gn a(C4104z8 bundle, Kp personBundle, Cm nfcCapabilityResultToBundleMapper) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(personBundle, "personBundle");
        p013kotlin.jvm.internal.s.k(nfcCapabilityResultToBundleMapper, "nfcCapabilityResultToBundleMapper");
        return new Hn(bundle, personBundle, nfcCapabilityResultToBundleMapper, new N3());
    }

    public final Ul a(InterfaceC3863tk navigationChannel) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        return new Ul(navigationChannel);
    }
}
