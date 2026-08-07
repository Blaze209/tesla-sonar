package com.fourthline.orca.internal;

import com.fourthline.core.DeviceMetadata;
import com.fourthline.core.location.LocationProvider;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.pj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3691pj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f34595b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3605nj f34596a;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.pj$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3691pj() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Lj a(Aj locationFlowRepository) {
        p013kotlin.jvm.internal.s.k(locationFlowRepository, "locationFlowRepository");
        return locationFlowRepository;
    }

    public C3691pj(C3605nj c3605nj) {
        this.f34596a = c3605nj;
    }

    public final C3562mj a(InterfaceC3051ak mainRepository) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        return new C3562mj(AbstractC3094bk.a(mainRepository));
    }

    public final Aj a(DeviceMetadata deviceMetadata) {
        p013kotlin.jvm.internal.s.k(deviceMetadata, "deviceMetadata");
        return new Aj(deviceMetadata);
    }

    public /* synthetic */ C3691pj(C3605nj c3605nj, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : c3605nj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C3648oj a(InterfaceC3863tk navigationChannel, C4087ys popupHandlerBuilder, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new C3648oj(navigationChannel, popupHandlerBuilder.a(new T3(null, imageServiceLocator, 1, 0 == true ? 1 : 0)));
    }

    public final Gj a(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new Gj(tracker);
    }

    public final Nj a(Uj lottieServiceLocator) {
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        return new Nj(lottieServiceLocator.a(Tj.LocationIntro));
    }

    public final Oj a(Nj stateProvider, C2874Gc effectHandler, C3648oj flowCoordinator, ED viewCompletionHandler, LocationProvider locationProvider, Lj locationScannerRepository, Gj analytics, InterfaceC4044xs popupHandler, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(effectHandler, "effectHandler");
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(locationProvider, "locationProvider");
        p013kotlin.jvm.internal.s.k(locationScannerRepository, "locationScannerRepository");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        return new Oj(new C3520lk(stateProvider), effectHandler, flowCoordinator, viewCompletionHandler, stateProvider, popupHandler, locationProvider, locationScannerRepository, analytics, coroutineScope);
    }

    public final C2874Gc a(CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        return new C2874Gc(coroutineScope);
    }

    public final InterfaceC4044xs a(InterfaceC3051ak mainRepository, C2874Gc effectHandler, InterfaceC3997wo orcaDestroyer, InterfaceC3863tk navigationChannel, C4087ys popupHandlerBuilder, Uj lottieServiceLocator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        p013kotlin.jvm.internal.s.k(effectHandler, "effectHandler");
        p013kotlin.jvm.internal.s.k(orcaDestroyer, "orcaDestroyer");
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        List listS = p013kotlin.collections.v.s(new Ej(lottieServiceLocator), new Gs(lottieServiceLocator), new Dj(effectHandler, imageServiceLocator), new Pj(effectHandler, imageServiceLocator));
        listS.addAll(AbstractC3412j4.a(navigationChannel, orcaDestroyer, mainRepository, imageServiceLocator));
        Cs[] csArr = (Cs[]) listS.toArray(new Cs[0]);
        return popupHandlerBuilder.a((Cs[]) Arrays.copyOf(csArr, csArr.length));
    }

    public final ED a(wn0.a workflowIdProvider, DeviceMetadata deviceMetadata, C3562mj flowActionProvider, Vf dataWorkManager, InterfaceC3645og whatsNextWorker) {
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(deviceMetadata, "deviceMetadata");
        p013kotlin.jvm.internal.s.k(flowActionProvider, "flowActionProvider");
        p013kotlin.jvm.internal.s.k(dataWorkManager, "dataWorkManager");
        p013kotlin.jvm.internal.s.k(whatsNextWorker, "whatsNextWorker");
        return new C4084yp(flowActionProvider, new Cj(workflowIdProvider, deviceMetadata), dataWorkManager, whatsNextWorker);
    }
}
