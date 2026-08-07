package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.DocumentType;
import java.util.Arrays;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Qm {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f27514b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Km f27515a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public Qm(Km flowConfig) {
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        this.f27515a = flowConfig;
    }

    public final ND a(Lm flowCoordinator) {
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        return flowCoordinator;
    }

    public final Jm a(InterfaceC3051ak mainRepository) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        return new Jm(AbstractC3094bk.a(mainRepository));
    }

    public final ED b(Jm flowActionProvider, Vf dataWorkManager, C3395in uploadDataRequestsBuilder, C3437jn whatsNextWorker) {
        p013kotlin.jvm.internal.s.k(flowActionProvider, "flowActionProvider");
        p013kotlin.jvm.internal.s.k(dataWorkManager, "dataWorkManager");
        p013kotlin.jvm.internal.s.k(uploadDataRequestsBuilder, "uploadDataRequestsBuilder");
        p013kotlin.jvm.internal.s.k(whatsNextWorker, "whatsNextWorker");
        return new C4084yp(flowActionProvider, uploadDataRequestsBuilder, dataWorkManager, whatsNextWorker);
    }

    public final C3437jn a(wn0.a skipPersonFlowUseCase, InterfaceC3645og delegate) {
        p013kotlin.jvm.internal.s.k(skipPersonFlowUseCase, "skipPersonFlowUseCase");
        p013kotlin.jvm.internal.s.k(delegate, "delegate");
        return new C3437jn(delegate, skipPersonFlowUseCase, this.f27515a.getMinimumAge());
    }

    public final C3395in a(wn0.a workflowIdProvider, C4104z8 documentFlowDataBundle, Kp personBundle, XA tinBundle, C3208eD skipNationalityUseCase, C3208eD skipPersonDetailsUseCase, C3208eD tinBundleIsValidUseCase) {
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(documentFlowDataBundle, "documentFlowDataBundle");
        p013kotlin.jvm.internal.s.k(personBundle, "personBundle");
        p013kotlin.jvm.internal.s.k(tinBundle, "tinBundle");
        p013kotlin.jvm.internal.s.k(skipNationalityUseCase, "skipNationalityUseCase");
        p013kotlin.jvm.internal.s.k(skipPersonDetailsUseCase, "skipPersonDetailsUseCase");
        p013kotlin.jvm.internal.s.k(tinBundleIsValidUseCase, "tinBundleIsValidUseCase");
        return new C3395in(workflowIdProvider, documentFlowDataBundle, personBundle, tinBundle, skipNationalityUseCase, skipPersonDetailsUseCase, tinBundleIsValidUseCase);
    }

    public final C4039xn a(Uj lottieServiceLocator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new C4039xn(lottieServiceLocator.a(Tj.NfcIntro), imageServiceLocator);
    }

    public final InterfaceC4044xs a(InterfaceC3051ak mainRepository, final C4104z8 documentFlowDataBundle, C2874Gc effectHandler, C4087ys popupHandlerBuilder, InterfaceC3997wo orcaDestroyer, InterfaceC3863tk navigationChannel, Uj lottieServiceLocator, InterfaceC3732qh imageServiceLocator, C3523ln analytics) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        p013kotlin.jvm.internal.s.k(documentFlowDataBundle, "documentFlowDataBundle");
        p013kotlin.jvm.internal.s.k(effectHandler, "effectHandler");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(orcaDestroyer, "orcaDestroyer");
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        Cs[] csArr = (Cs[]) p013kotlin.collections.v.Q0(p013kotlin.collections.v.Q0(AbstractC3412j4.a(navigationChannel, orcaDestroyer, mainRepository, imageServiceLocator), new Sn(effectHandler, lottieServiceLocator)), new C3823sn(imageServiceLocator, analytics, new wn0.a() { // from class: com.fourthline.orca.internal.om0
            @Override // wn0.a
            public final Object invoke() {
                return Boolean.valueOf(Qm.a(documentFlowDataBundle));
            }
        })).toArray(new Cs[0]);
        return popupHandlerBuilder.a((Cs[]) Arrays.copyOf(csArr, csArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(C4104z8 c4104z8) {
        return B8.b(c4104z8).c() == DocumentType.PASSPORT;
    }

    public final C2874Gc a(CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        return new C2874Gc(coroutineScope);
    }

    public final C4082yn a(C4039xn stateProvider, InterfaceC3909un repository, C2874Gc effectHandler, C3523ln analytics, Lm flowCoordinator, C4084yp viewCompletionHandler, InterfaceC4044xs popupHandler, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(effectHandler, "effectHandler");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        return new C4082yn(new C3520lk(stateProvider), effectHandler, stateProvider, popupHandler, repository, viewCompletionHandler, analytics, flowCoordinator, coroutineScope);
    }

    public final C4084yp a(Jm flowActionProvider, Vf dataWorkManager, C3395in uploadDataRequestsBuilder, C3437jn whatsNextWorker) {
        p013kotlin.jvm.internal.s.k(flowActionProvider, "flowActionProvider");
        p013kotlin.jvm.internal.s.k(dataWorkManager, "dataWorkManager");
        p013kotlin.jvm.internal.s.k(uploadDataRequestsBuilder, "uploadDataRequestsBuilder");
        p013kotlin.jvm.internal.s.k(whatsNextWorker, "whatsNextWorker");
        return new C4084yp(flowActionProvider, uploadDataRequestsBuilder, dataWorkManager, whatsNextWorker);
    }

    public final C3523ln a(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new C3523ln(tracker);
    }

    public final InterfaceC3909un a(C4104z8 bundle, Context context) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(context, "context");
        return new C3953vn(bundle, context);
    }

    public final Pn a(final Ln nfcScannerVideos, ND viewNavigator, final Gn repository, InterfaceC2931Re nfcErrorHandler, ED viewCompletionHandler, C4125zn analytics, C4087ys popupHandlerBuilder, CoroutineScope coroutineScope, Uj lottieServiceLocator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(nfcScannerVideos, "nfcScannerVideos");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(nfcErrorHandler, "nfcErrorHandler");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        Kn kn2 = new Kn(new wn0.a() { // from class: com.fourthline.orca.internal.pm0
            @Override // wn0.a
            public final Object invoke() {
                return Qm.a(nfcScannerVideos, repository);
            }
        }, lottieServiceLocator.a(Tj.LoadingSpinner), imageServiceLocator);
        return new Pn(new C3520lk(kn2), new C2874Gc(coroutineScope), kn2, viewNavigator, viewCompletionHandler, repository, nfcErrorHandler, popupHandlerBuilder.a(new Dm(imageServiceLocator), new Tn(imageServiceLocator)), analytics, coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final En.e.a a(Ln ln2, Gn gn2) {
        return (En.e.a) ln2.invoke(gn2.d());
    }

    public final C4125zn a() {
        return new C4125zn();
    }

    public final Gn a(C4104z8 bundle, Kp personBundle, Cm nfcCapabilityResultToBundleMapper) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(personBundle, "personBundle");
        p013kotlin.jvm.internal.s.k(nfcCapabilityResultToBundleMapper, "nfcCapabilityResultToBundleMapper");
        return new Hn(bundle, personBundle, nfcCapabilityResultToBundleMapper, new Gw());
    }

    public final Lm a(InterfaceC3863tk navigationChannel) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        return new Lm(navigationChannel);
    }
}
