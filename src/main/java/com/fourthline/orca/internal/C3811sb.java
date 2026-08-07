package com.fourthline.orca.internal;

import com.fourthline.core.CountryNetworkModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.fourthline.orca.internal.sb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3811sb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DocumentFlowConfig f35286a;

    public C3811sb(DocumentFlowConfig flowConfig) {
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        this.f35286a = flowConfig;
    }

    public final C3991wi a(C3092bi analytics, List countries, C4104z8 dataBundle, C3768rb flowCoordinator, InterfaceC3947vi stateProvider) {
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(countries, "countries");
        p013kotlin.jvm.internal.s.k(dataBundle, "dataBundle");
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        return new C3991wi(analytics, new C3520lk(stateProvider), stateProvider, flowCoordinator, C4062y9.f36941a, null, new C4019x9(countries, this.f35286a, dataBundle), 32, null);
    }

    public final C3010Xb b(C3392ik analyticsContext, C3438jo analyticsTracker) {
        p013kotlin.jvm.internal.s.k(analyticsContext, "analyticsContext");
        p013kotlin.jvm.internal.s.k(analyticsTracker, "analyticsTracker");
        return new C3010Xb(analyticsContext, analyticsTracker);
    }

    public final List c() {
        return this.f35286a.getSupportedDocuments();
    }

    public final InterfaceC4071yc b(C4104z8 bundle) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        return new C4028xc(bundle);
    }

    public final C3727qc b(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new C3727qc(tracker);
    }

    public final InterfaceC4124zm b() {
        return new InterfaceC4124zm() { // from class: com.fourthline.orca.internal.hc1
            @Override // com.fourthline.orca.internal.InterfaceC4124zm
            public final boolean a(G5 g11) {
                return C3811sb.a(this.f32279a, g11);
            }
        };
    }

    public final C3092bi a(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new C3092bi("document", tracker);
    }

    public final InterfaceC3947vi a(ou.m customStateProvider, Uj lottieServiceLocator) {
        p013kotlin.jvm.internal.s.k(customStateProvider, "customStateProvider");
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        Object objE = customStateProvider.e(new C4105z9(lottieServiceLocator.a(Tj.DocumentIntro)));
        p013kotlin.jvm.internal.s.j(objE, "or(...)");
        return (InterfaceC3947vi) objE;
    }

    public final Q5 a(List supportedCountries, EA inputValidator) {
        p013kotlin.jvm.internal.s.k(supportedCountries, "supportedCountries");
        p013kotlin.jvm.internal.s.k(inputValidator, "inputValidator");
        return new R5(supportedCountries, inputValidator);
    }

    public final W7 a(S7 repository, R0 stateProviderDelegate, Q5 countryValidator, D5 countriesFilter, InterfaceC3988wf filterCountriesUseCase, L7 analytics, CoroutineScope coroutineScope, Bs errorPopupPresenter, C3046af errorPopupAnalytics, C3768rb flowCoordinator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(stateProviderDelegate, "stateProviderDelegate");
        p013kotlin.jvm.internal.s.k(countryValidator, "countryValidator");
        p013kotlin.jvm.internal.s.k(countriesFilter, "countriesFilter");
        p013kotlin.jvm.internal.s.k(filterCountriesUseCase, "filterCountriesUseCase");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        p013kotlin.jvm.internal.s.k(errorPopupPresenter, "errorPopupPresenter");
        p013kotlin.jvm.internal.s.k(errorPopupAnalytics, "errorPopupAnalytics");
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        V7 v11 = new V7(stateProviderDelegate, imageServiceLocator);
        C3520lk c3520lk = new C3520lk(v11);
        Q7 q11 = new Q7(countryValidator);
        C2874Gc c2874Gc = new C2874Gc(coroutineScope);
        return new W7(c3520lk, c2874Gc, flowCoordinator, analytics, repository, new S0(c3520lk, v11, repository, new P7(repository, q11, analytics), c2874Gc, q11, countriesFilter, filterCountriesUseCase, countryValidator, AbstractC2936Se.a(errorPopupPresenter, new O7(imageServiceLocator), new N7(c3520lk, v11, c2874Gc, flowCoordinator), errorPopupAnalytics, coroutineScope), W7.f29452g.a()));
    }

    public final R0 a(KD stringExtractor, InterfaceC3732qh imageServiceLocator, C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(stringExtractor, "stringExtractor");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new R0(stringExtractor, imageServiceLocator, new Kh(tracker));
    }

    public final S7 a(C4104z8 bundle, List countries) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(countries, "countries");
        return new T7(bundle, countries);
    }

    public final L7 a(C3392ik analyticsContext, C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(analyticsContext, "analyticsContext");
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new L7(analyticsContext, tracker);
    }

    public final C3512lc a(final InterfaceC3299gc repository, C3768rb flowCoordinator, ED viewCompletionHandler, C3469kc stateProvider, C3010Xb analytics, C4087ys popupHandlerBuilder, CoroutineScope coroutineScope, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new C3512lc(new C3520lk(stateProvider), flowCoordinator, viewCompletionHandler, repository, stateProvider, analytics, popupHandlerBuilder.a(new C3213ec(new wn0.a() { // from class: com.fourthline.orca.internal.ic1
            @Override // wn0.a
            public final Object invoke() {
                return C3811sb.a(repository);
            }
        }, flowCoordinator, analytics, imageServiceLocator)), coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List a(InterfaceC3299gc interfaceC3299gc) {
        return AbstractC3385ic.a(interfaceC3299gc);
    }

    public final ED a(InterfaceC4071yc documentVersionRepository, C2938Tb whatsNextWorker) {
        p013kotlin.jvm.internal.s.k(documentVersionRepository, "documentVersionRepository");
        p013kotlin.jvm.internal.s.k(whatsNextWorker, "whatsNextWorker");
        return new C4084yp(new C3256fc(documentVersionRepository), new Wz(), new Vz(), whatsNextWorker);
    }

    public final C2938Tb a(wn0.a nfcSupportedUseCase, final InterfaceC4124zm nfcCanFlowUseCase, final C4104z8 documentFlowDataBundle) {
        p013kotlin.jvm.internal.s.k(nfcSupportedUseCase, "nfcSupportedUseCase");
        p013kotlin.jvm.internal.s.k(nfcCanFlowUseCase, "nfcCanFlowUseCase");
        p013kotlin.jvm.internal.s.k(documentFlowDataBundle, "documentFlowDataBundle");
        return new C2938Tb(nfcSupportedUseCase, new wn0.a() { // from class: com.fourthline.orca.internal.ec1
            @Override // wn0.a
            public final Object invoke() {
                return Boolean.valueOf(C3811sb.a(nfcCanFlowUseCase, documentFlowDataBundle));
            }
        }, this.f35286a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(InterfaceC4124zm interfaceC4124zm, C4104z8 c4104z8) {
        return interfaceC4124zm.a(c4104z8.h());
    }

    public final InterfaceC3299gc a(C4104z8 bundle) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        return new C3342hc(bundle, this.f35286a.getSupportedDocuments());
    }

    public final C3469kc a(InterfaceC3084ba documentOptionsComparator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(documentOptionsComparator, "documentOptionsComparator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new C3469kc(documentOptionsComparator, imageServiceLocator);
    }

    public final InterfaceC3084ba a() {
        return new C3126ca();
    }

    public final C2850Cc a(C3768rb flowCoordinator, ED viewCompletionHandler, InterfaceC4071yc repository, C3727qc analytics, C3902ug dateFormatter, InterfaceC3732qh imageServiceLocator, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(dateFormatter, "dateFormatter");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        C2844Bc c2844Bc = new C2844Bc(repository, dateFormatter, imageServiceLocator);
        return new C2850Cc(new C3520lk(c2844Bc), flowCoordinator, viewCompletionHandler, c2844Bc, repository, analytics, coroutineScope);
    }

    public final ED a(C2938Tb whatsNextWorker) {
        p013kotlin.jvm.internal.s.k(whatsNextWorker, "whatsNextWorker");
        return new C4084yp(new C3941vc(), new Wz(), new Vz(), whatsNextWorker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(Fp fp2) {
        return !fp2.a();
    }

    public final C3768rb a(InterfaceC3863tk navigationChannel, final Fp permissionChecker, C4087ys popupHandlerBuilder, C3392ik analyticsContext, Uj lottieServiceLocator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(permissionChecker, "permissionChecker");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(analyticsContext, "analyticsContext");
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new C3768rb(navigationChannel, new wn0.a() { // from class: com.fourthline.orca.internal.gc1
            @Override // wn0.a
            public final Object invoke() {
                return Boolean.valueOf(C3811sb.a(permissionChecker));
            }
        }, popupHandlerBuilder.a(new L3(lottieServiceLocator), new T3(null, imageServiceLocator, 1, null)), this.f35286a.getSkipIntro(), analyticsContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(C3811sb c3811sb, G5 g11) {
        String strC;
        if (c3811sb.f35286a.getNfc().getEnabled()) {
            if ((g11 == null || (strC = g11.c()) == null) ? false : strC.equals("ESP")) {
                return true;
            }
        }
        return false;
    }

    public final P5 a(final List supportedCountries) {
        p013kotlin.jvm.internal.s.k(supportedCountries, "supportedCountries");
        return new P5() { // from class: com.fourthline.orca.internal.fc1
            @Override // com.fourthline.orca.internal.P5
            public final boolean a(G5 g11) {
                return C3811sb.a(supportedCountries, g11);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(List list, G5 country) {
        p013kotlin.jvm.internal.s.k(country, "country");
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (p013kotlin.jvm.internal.s.f(((CountryNetworkModel) it.next()).getIssuingCountry(), country.c())) {
                return true;
            }
        }
        return false;
    }
}
