package com.fourthline.orca.internal;

import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.sdk.R;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Sp {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f27797b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Qp f27798a;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public Sp(Qp flowConfig) {
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        this.f27798a = flowConfig;
    }

    public final C3741qq a(InterfaceC3051ak mainRepository, C3208eD skipPersonDetailsUseCase) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        p013kotlin.jvm.internal.s.k(skipPersonDetailsUseCase, "skipPersonDetailsUseCase");
        return new C3741qq(AbstractC3094bk.a(mainRepository), skipPersonDetailsUseCase);
    }

    public final Bq b(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new Bq(tracker);
    }

    public final InterfaceC3606nk a(EA inputValidator) {
        p013kotlin.jvm.internal.s.k(inputValidator, "inputValidator");
        return new C3649ok(inputValidator);
    }

    public final C4085yq a(List countries, InterfaceC4117zf filterCountriesUseCase, KD stringExtractor) {
        p013kotlin.jvm.internal.s.k(countries, "countries");
        p013kotlin.jvm.internal.s.k(filterCountriesUseCase, "filterCountriesUseCase");
        p013kotlin.jvm.internal.s.k(stringExtractor, "stringExtractor");
        return new C4085yq(countries, stringExtractor, filterCountriesUseCase);
    }

    public final InterfaceC3869tq a(List countries, C4104z8 documentFlowDataBundle, Kp personBundle, KD stringExtractor) {
        p013kotlin.jvm.internal.s.k(countries, "countries");
        p013kotlin.jvm.internal.s.k(documentFlowDataBundle, "documentFlowDataBundle");
        p013kotlin.jvm.internal.s.k(personBundle, "personBundle");
        p013kotlin.jvm.internal.s.k(stringExtractor, "stringExtractor");
        return new C3912uq(documentFlowDataBundle, personBundle, stringExtractor, countries, null, 16, null);
    }

    public final Gi a(InterfaceC3869tq repository, InterfaceC3956vq resultRepository, InterfaceC3732qh imageServiceLocator, C4085yq nationalitySuggestionsProvider, InterfaceC3606nk nationalityValidator, wn0.a resourcesProvider, C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(resultRepository, "resultRepository");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(nationalitySuggestionsProvider, "nationalitySuggestionsProvider");
        p013kotlin.jvm.internal.s.k(nationalityValidator, "nationalityValidator");
        p013kotlin.jvm.internal.s.k(resourcesProvider, "resourcesProvider");
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        N9 n11 = new N9(repository, nationalityValidator);
        InterfaceC3903uh interfaceC3903uhA = imageServiceLocator.a(EnumC3689ph.M0);
        QA.a aVar = QA.f27433a;
        return new Gi("person_nationality", repository, resultRepository, nationalitySuggestionsProvider, resourcesProvider, imageServiceLocator, n11, QA.a.a(aVar, R.string.step_personal_details_label_nationality, 0, 2, null), QA.a.a(aVar, R.string.shared_placeholder_search, 0, 2, null), QA.a.b(aVar, 0, 1, null), aVar.a(R.string.shared_validation_invalid_nationality_accessibility), interfaceC3903uhA, new Kh(tracker));
    }

    public final InterfaceC3956vq a(Kp personBundle) {
        p013kotlin.jvm.internal.s.k(personBundle, "personBundle");
        return new C3999wq(personBundle);
    }

    public final InterfaceC4044xs a(InterfaceC3051ak mainRepository, Rp flowCoordinator, InterfaceC3997wo orcaDestroyer, InterfaceC3863tk navigationChannel, C4087ys popupHandlerBuilder, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(orcaDestroyer, "orcaDestroyer");
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        List listS = p013kotlin.collections.v.s(new C3826sq(flowCoordinator, imageServiceLocator), new C3783rq(flowCoordinator, imageServiceLocator));
        listS.addAll(AbstractC3412j4.a(navigationChannel, orcaDestroyer, mainRepository, imageServiceLocator));
        Cs[] csArr = (Cs[]) listS.toArray(new Cs[0]);
        return popupHandlerBuilder.a((Cs[]) Arrays.copyOf(csArr, csArr.length));
    }

    public final W9 a(InterfaceC3869tq repository, M9 analytics, CoroutineScope coroutineScope, Rp flowCoordinator, ED viewCompletionHandler, InterfaceC4044xs popupHandler, Gi nationalityViewStateManager, C3411j3 birthPlaceInputViewStateHandler, InterfaceC3956vq resultRepository) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(nationalityViewStateManager, "nationalityViewStateManager");
        p013kotlin.jvm.internal.s.k(birthPlaceInputViewStateHandler, "birthPlaceInputViewStateHandler");
        p013kotlin.jvm.internal.s.k(resultRepository, "resultRepository");
        V9 v11 = new V9(nationalityViewStateManager, birthPlaceInputViewStateHandler);
        return new W9(new C3520lk(v11), new C2874Gc(coroutineScope), v11, nationalityViewStateManager, flowCoordinator, viewCompletionHandler, repository, resultRepository, analytics, popupHandler, coroutineScope);
    }

    public final C3698pq a(wn0.a workflowIdProvider, Kp personBundle, XA tinBundle, C3208eD tinBundleIsValidUseCase) {
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(personBundle, "personBundle");
        p013kotlin.jvm.internal.s.k(tinBundle, "tinBundle");
        p013kotlin.jvm.internal.s.k(tinBundleIsValidUseCase, "tinBundleIsValidUseCase");
        return new C3698pq(workflowIdProvider, personBundle, tinBundle, tinBundleIsValidUseCase);
    }

    public final ED a(C3741qq flowActionProvider, Vf dataWorkManager, C3698pq uploadDataRequestBuilder, InterfaceC3645og whatsNextWorker) {
        p013kotlin.jvm.internal.s.k(flowActionProvider, "flowActionProvider");
        p013kotlin.jvm.internal.s.k(dataWorkManager, "dataWorkManager");
        p013kotlin.jvm.internal.s.k(uploadDataRequestBuilder, "uploadDataRequestBuilder");
        p013kotlin.jvm.internal.s.k(whatsNextWorker, "whatsNextWorker");
        return new C4084yp(flowActionProvider, uploadDataRequestBuilder, dataWorkManager, whatsNextWorker);
    }

    public final M9 a(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new M9(tracker);
    }

    public final Mp a(InterfaceC3051ak mainRepository) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        return new Mp(AbstractC3094bk.a(mainRepository));
    }

    public final Jq a(C3438jo tracker, final Gq repository, InterfaceC3732qh imageServiceLocator, C3208eD skipNationalityUseCase, Nf dateFormatter) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(skipNationalityUseCase, "skipNationalityUseCase");
        p013kotlin.jvm.internal.s.k(dateFormatter, "dateFormatter");
        return new Jq(new Kh(tracker), repository, imageServiceLocator, skipNationalityUseCase.a(false), dateFormatter, new wn0.a() { // from class: com.fourthline.orca.internal.jp0
            @Override // wn0.a
            public final Object invoke() {
                return Integer.valueOf(Sp.a(repository));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(Gq gq2) {
        return gq2.h();
    }

    public final Kq a(Rp flowCoordinator, Jq stateProvider, Gq repository, Bq analytics, TimestampProvider timestampProvider, ED viewCompletionHandler, InterfaceC4044xs popupHandler, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(timestampProvider, "timestampProvider");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        return new Kq(new C3520lk(stateProvider), new C2874Gc(coroutineScope), stateProvider, flowCoordinator, viewCompletionHandler, repository, analytics, timestampProvider, popupHandler, coroutineScope);
    }

    public final ED a(Mp flowActionProvider, Vf dataWorkManager, C3698pq uploadDataRequestBuilder, InterfaceC3645og whatsNextWorker) {
        p013kotlin.jvm.internal.s.k(flowActionProvider, "flowActionProvider");
        p013kotlin.jvm.internal.s.k(dataWorkManager, "dataWorkManager");
        p013kotlin.jvm.internal.s.k(uploadDataRequestBuilder, "uploadDataRequestBuilder");
        p013kotlin.jvm.internal.s.k(whatsNextWorker, "whatsNextWorker");
        return new C4084yp(flowActionProvider, uploadDataRequestBuilder, dataWorkManager, whatsNextWorker);
    }

    public final C3411j3 a(Kp personBundle, InterfaceC3732qh imageServiceLocator, C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(personBundle, "personBundle");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new C3411j3(new Qi(personBundle), imageServiceLocator, new Kh(tracker));
    }

    public final Rp a(InterfaceC3863tk navigationChannel, C3208eD skipNationalityUseCase, C3208eD skipPersonDetailsUseCase, C4087ys popupHandlerBuilder, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(skipNationalityUseCase, "skipNationalityUseCase");
        p013kotlin.jvm.internal.s.k(skipPersonDetailsUseCase, "skipPersonDetailsUseCase");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new Rp(navigationChannel, skipNationalityUseCase, skipPersonDetailsUseCase, popupHandlerBuilder.a(new T3(null, imageServiceLocator, 1, null)));
    }

    public final Gq a(InterfaceC3051ak mainRepository, C4104z8 bundle, Kp personBundle) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(personBundle, "personBundle");
        return new Hq(bundle, personBundle, this.f27798a.getMinimumAge());
    }

    public final P5 a(final InterfaceC3869tq nationalityRepository, final InterfaceC3606nk nationalityValidator) {
        p013kotlin.jvm.internal.s.k(nationalityRepository, "nationalityRepository");
        p013kotlin.jvm.internal.s.k(nationalityValidator, "nationalityValidator");
        return new P5() { // from class: com.fourthline.orca.internal.kp0
            @Override // com.fourthline.orca.internal.P5
            public final boolean a(G5 g11) {
                return Sp.a(nationalityValidator, nationalityRepository, g11);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(InterfaceC3606nk interfaceC3606nk, InterfaceC3869tq interfaceC3869tq, G5 country) {
        p013kotlin.jvm.internal.s.k(country, "country");
        return interfaceC3606nk.a(country, interfaceC3869tq.e());
    }
}
