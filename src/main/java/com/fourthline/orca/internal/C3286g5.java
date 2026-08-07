package com.fourthline.orca.internal;

import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.g5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3286g5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3200e5 f31939a;

    /* JADX WARN: Multi-variable type inference failed */
    public C3286g5() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(G5 it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return true;
    }

    public C3286g5(C3200e5 c3200e5) {
        this.f31939a = c3200e5;
    }

    public final C3158d5 a(InterfaceC3051ak mainRepository) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        return new C3158d5(AbstractC3094bk.a(mainRepository));
    }

    public final H4 a(C3714q5 repository, InterfaceC3732qh imageServiceLocator, C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new H4(repository, imageServiceLocator, new Kh(tracker));
    }

    public /* synthetic */ C3286g5(C3200e5 c3200e5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : c3200e5);
    }

    public final C3030a5 a(H4 stateProvider, C3714q5 repository, InterfaceC3988wf filterCountriesUseCase, C3243f5 flowCoordinator, ED viewCompletionHandler, J4 analytics, InterfaceC4044xs popupHandler, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(filterCountriesUseCase, "filterCountriesUseCase");
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        return new C3030a5(new C3520lk(stateProvider), stateProvider, new C2874Gc(coroutineScope), repository, filterCountriesUseCase, flowCoordinator, viewCompletionHandler, analytics, popupHandler, coroutineScope);
    }

    public final ED a(wn0.a workflowIdProvider, F4 dataBundle, C3158d5 flowActionProvider, Vf dataWorkManager, InterfaceC3645og whatsNextWorker) {
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(dataBundle, "dataBundle");
        p013kotlin.jvm.internal.s.k(flowActionProvider, "flowActionProvider");
        p013kotlin.jvm.internal.s.k(dataWorkManager, "dataWorkManager");
        p013kotlin.jvm.internal.s.k(whatsNextWorker, "whatsNextWorker");
        return new C4084yp(flowActionProvider, new C3799s5(workflowIdProvider, dataBundle), dataWorkManager, whatsNextWorker);
    }

    public final C3714q5 a(F4 contactBundle, InterfaceC3029a4 cellularManager, List countries) {
        p013kotlin.jvm.internal.s.k(contactBundle, "contactBundle");
        p013kotlin.jvm.internal.s.k(cellularManager, "cellularManager");
        p013kotlin.jvm.internal.s.k(countries, "countries");
        return new C3714q5(contactBundle, cellularManager, countries);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C3243f5 a(InterfaceC3863tk navigationChannel, C4087ys popupHandlerBuilder, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new C3243f5(navigationChannel, popupHandlerBuilder.a(new T3(null, imageServiceLocator, 1, 0 == true ? 1 : 0)));
    }

    public final J4 a(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new J4(tracker);
    }

    public final P5 a() {
        return new P5() { // from class: com.fourthline.orca.internal.b21
            @Override // com.fourthline.orca.internal.P5
            public final boolean a(G5 g11) {
                return C3286g5.a(g11);
            }
        };
    }
}
