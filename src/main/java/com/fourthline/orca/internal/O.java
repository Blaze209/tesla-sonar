package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M f27112a;

    /* JADX WARN: Multi-variable type inference failed */
    public O() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(G5 it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return true;
    }

    public O(M m11) {
        this.f27112a = m11;
    }

    public final L a(InterfaceC3051ak mainRepository) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        return new L(AbstractC3094bk.a(mainRepository));
    }

    public final G a(C4052y addressBundle, List countries) {
        p013kotlin.jvm.internal.s.k(addressBundle, "addressBundle");
        p013kotlin.jvm.internal.s.k(countries, "countries");
        return new Mi(addressBundle, countries);
    }

    public /* synthetic */ O(M m11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : m11);
    }

    public final O5 a(List countries, InterfaceC4117zf filterCountriesUseCase) {
        p013kotlin.jvm.internal.s.k(countries, "countries");
        p013kotlin.jvm.internal.s.k(filterCountriesUseCase, "filterCountriesUseCase");
        return new O5(countries, filterCountriesUseCase);
    }

    public final Gi a(G repository, InterfaceC3732qh imageServiceLocator, O5 countrySuggestionProvider, wn0.a resourcesProvider, C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(countrySuggestionProvider, "countrySuggestionProvider");
        p013kotlin.jvm.internal.s.k(resourcesProvider, "resourcesProvider");
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        P0 p11 = new P0() { // from class: com.fourthline.orca.internal.uj0
            @Override // com.fourthline.orca.internal.P0
            public final P0.a a(InterfaceC3447jx interfaceC3447jx) {
                return O.a(interfaceC3447jx);
            }
        };
        InterfaceC3903uh interfaceC3903uhA = imageServiceLocator.a(EnumC3689ph.M0);
        QA.a aVar = QA.f27433a;
        return new Gi("address_country", repository, repository, countrySuggestionProvider, resourcesProvider, imageServiceLocator, p11, QA.a.a(aVar, R.string.step_address_details_label_residence_country, 0, 2, null), QA.a.a(aVar, R.string.shared_placeholder_search, 0, 2, null), aVar.b(R.string.shared_validation_required_residence_country_accessibility), aVar.a(R.string.shared_validation_invalid_residence_country_accessibility), interfaceC3903uhA, new Kh(tracker));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final P0.a a(InterfaceC3447jx it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return P0.a.b.f27265a;
    }

    public final F a(G addressDetailsRepository, Gi residencyViewStateManager, InterfaceC3732qh imageServiceLocator, C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(addressDetailsRepository, "addressDetailsRepository");
        p013kotlin.jvm.internal.s.k(residencyViewStateManager, "residencyViewStateManager");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new F(residencyViewStateManager, addressDetailsRepository, imageServiceLocator, new Kh(tracker));
    }

    public final I a(G addressDetailsRepository, Gi residencyViewStateManager, F stateProvider, N flowCoordinator, ED viewCompletionHandler, C4095z analytics, CoroutineScope coroutineScope, InterfaceC4044xs popupHandler) {
        p013kotlin.jvm.internal.s.k(addressDetailsRepository, "addressDetailsRepository");
        p013kotlin.jvm.internal.s.k(residencyViewStateManager, "residencyViewStateManager");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        return new I(new C3520lk(stateProvider), new C2874Gc(coroutineScope), addressDetailsRepository, residencyViewStateManager, stateProvider, flowCoordinator, viewCompletionHandler, analytics, popupHandler, coroutineScope);
    }

    public final ED a(wn0.a workflowIdProvider, C4052y dataBundle, L flowActionProvider, Vf dataWorkManager, InterfaceC3645og whatsNextWorker) {
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(dataBundle, "dataBundle");
        p013kotlin.jvm.internal.s.k(flowActionProvider, "flowActionProvider");
        p013kotlin.jvm.internal.s.k(dataWorkManager, "dataWorkManager");
        p013kotlin.jvm.internal.s.k(whatsNextWorker, "whatsNextWorker");
        return new C4084yp(flowActionProvider, new C3110c0(workflowIdProvider, dataBundle), dataWorkManager, whatsNextWorker);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final N a(InterfaceC3863tk navigationChannel, C4087ys popupHandlerBuilder, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new N(navigationChannel, popupHandlerBuilder.a(new T3(null, imageServiceLocator, 1, 0 == true ? 1 : 0)));
    }

    public final C4095z a(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new C4095z(tracker);
    }

    public final P5 a() {
        return new P5() { // from class: com.fourthline.orca.internal.vj0
            @Override // com.fourthline.orca.internal.P5
            public final boolean a(G5 g11) {
                return O.a(g11);
            }
        };
    }
}
