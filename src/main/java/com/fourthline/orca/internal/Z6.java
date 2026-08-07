package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.vision.document.ocr.OcrBirthDateValidator;
import com.fourthline.vision.document.ocr.OcrCountryAndTypeValidator;
import com.fourthline.vision.document.ocr.OcrDocumentExpirationDateValidator;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f29996a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List a(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(InterfaceC3212eb interfaceC3212eb) {
        return interfaceC3212eb.t().getValidationConfig().getMinPersonAge();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocumentType d(InterfaceC3212eb interfaceC3212eb) {
        return interfaceC3212eb.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G5 e(InterfaceC3212eb interfaceC3212eb) {
        return interfaceC3212eb.a();
    }

    public final List b(ou.m supportedCountries) {
        p013kotlin.jvm.internal.s.k(supportedCountries, "supportedCountries");
        if (!supportedCountries.c()) {
            AbstractC3989wg.a("Flow did not provide required Supported Countries.");
            throw new KotlinNothingValueException();
        }
        Object objB = supportedCountries.b();
        p013kotlin.jvm.internal.s.h(objB);
        return (List) objB;
    }

    public final DocumentAnalysisConfig a(ou.m config) {
        p013kotlin.jvm.internal.s.k(config, "config");
        if (!config.c()) {
            AbstractC3989wg.a("This solution does not support Document Analysis.");
            throw new KotlinNothingValueException();
        }
        Object objB = config.b();
        p013kotlin.jvm.internal.s.h(objB);
        return (DocumentAnalysisConfig) objB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(InterfaceC3212eb interfaceC3212eb) {
        return interfaceC3212eb.t().getValidationConfig().getMinPersonAge();
    }

    public final C4060y7 a(ND viewNavigator, C3801s7 stateProvider, InterfaceC4044xs popupHandler, CoroutineScope coroutineScope, P6 analytics, Y6 documentAnalysisManager, InterfaceC3544m7 repository) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(documentAnalysisManager, "documentAnalysisManager");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        return new C4060y7(new C3520lk(stateProvider), stateProvider, new C2874Gc(coroutineScope), popupHandler, analytics, viewNavigator, coroutineScope, documentAnalysisManager, repository);
    }

    public final P6 a(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new P6(tracker);
    }

    public final InterfaceC3544m7 a(DocumentAnalysisConfig documentAnalysisConfig, W6 documentAnalysisBundle, Kp personBundle) {
        p013kotlin.jvm.internal.s.k(documentAnalysisConfig, "documentAnalysisConfig");
        p013kotlin.jvm.internal.s.k(documentAnalysisBundle, "documentAnalysisBundle");
        p013kotlin.jvm.internal.s.k(personBundle, "personBundle");
        return new C3587n7(documentAnalysisBundle, personBundle, documentAnalysisConfig.getBackendProcessingTimeoutMs());
    }

    public final C3801s7 a(Uj lottieServiceLocator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new C3801s7(lottieServiceLocator, imageServiceLocator);
    }

    public final InterfaceC3974w7 a(TimestampProvider timestampProvider, final List supportedCountries, final InterfaceC3212eb documentScannerRepository) {
        InterfaceC3974w7 c3621nz;
        p013kotlin.jvm.internal.s.k(timestampProvider, "timestampProvider");
        p013kotlin.jvm.internal.s.k(supportedCountries, "supportedCountries");
        p013kotlin.jvm.internal.s.k(documentScannerRepository, "documentScannerRepository");
        OcrBirthDateValidator ocrBirthDateValidator = new OcrBirthDateValidator(timestampProvider, new wn0.a() { // from class: com.fourthline.orca.internal.kx0
            @Override // wn0.a
            public final Object invoke() {
                return Integer.valueOf(Z6.c(documentScannerRepository));
            }
        });
        OcrCountryAndTypeValidator ocrCountryAndTypeValidator = new OcrCountryAndTypeValidator(new wn0.a() { // from class: com.fourthline.orca.internal.lx0
            @Override // wn0.a
            public final Object invoke() {
                return Z6.a(supportedCountries);
            }
        });
        OcrDocumentExpirationDateValidator ocrDocumentExpirationDateValidator = new OcrDocumentExpirationDateValidator(timestampProvider);
        if (documentScannerRepository.c()) {
            c3621nz = new Wn();
        } else {
            c3621nz = new C3621nz(new wn0.a() { // from class: com.fourthline.orca.internal.mx0
                @Override // wn0.a
                public final Object invoke() {
                    return Z6.d(documentScannerRepository);
                }
            }, new wn0.a() { // from class: com.fourthline.orca.internal.nx0
                @Override // wn0.a
                public final Object invoke() {
                    return Z6.e(documentScannerRepository);
                }
            }, new C2933Sb());
        }
        return new N6(ocrBirthDateValidator, ocrCountryAndTypeValidator, ocrDocumentExpirationDateValidator, c3621nz);
    }

    public final Y6 a(wn0.a workflowIdProvider, final InterfaceC3212eb documentScannerRepository, Dg getDocumentAnalysisResultWorker, InterfaceC3974w7 resultValidator) {
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(documentScannerRepository, "documentScannerRepository");
        p013kotlin.jvm.internal.s.k(getDocumentAnalysisResultWorker, "getDocumentAnalysisResultWorker");
        p013kotlin.jvm.internal.s.k(resultValidator, "resultValidator");
        return new C3222el((String) workflowIdProvider.invoke(), getDocumentAnalysisResultWorker, new wn0.a() { // from class: com.fourthline.orca.internal.ix0
            @Override // wn0.a
            public final Object invoke() {
                return Z6.a(documentScannerRepository);
            }
        }, resultValidator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3936vD a(InterfaceC3212eb interfaceC3212eb) {
        DocumentType documentTypeD;
        G5 g5A = interfaceC3212eb.a();
        if (g5A == null || (documentTypeD = interfaceC3212eb.d()) == null) {
            return null;
        }
        return new C3936vD(g5A.c(), documentTypeD, null, null);
    }

    public final InterfaceC3837t0 a(InterfaceC3212eb repository, WC uploadDocumentImageWorker) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(uploadDocumentImageWorker, "uploadDocumentImageWorker");
        return new Ok(uploadDocumentImageWorker, repository.k());
    }

    public final Dg a(W6 documentAnalysisDataBundle, Gl onboardingNetworkService) {
        p013kotlin.jvm.internal.s.k(documentAnalysisDataBundle, "documentAnalysisDataBundle");
        p013kotlin.jvm.internal.s.k(onboardingNetworkService, "onboardingNetworkService");
        return new C3564ml(onboardingNetworkService, X6.b(documentAnalysisDataBundle));
    }

    public final InterfaceC4044xs a(final InterfaceC3212eb documentScannerRepository, C4087ys popupHandlerBuilder, Fs postProcessingPopupAnalytics, ND viewNavigator, InterfaceC3732qh imageServiceLocator, W6 documentAnalysisDataBundle) {
        p013kotlin.jvm.internal.s.k(documentScannerRepository, "documentScannerRepository");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(postProcessingPopupAnalytics, "postProcessingPopupAnalytics");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(documentAnalysisDataBundle, "documentAnalysisDataBundle");
        int i11 = 4;
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z11 = false;
        return popupHandlerBuilder.a(new C4120zi(postProcessingPopupAnalytics, viewNavigator, documentAnalysisDataBundle, imageServiceLocator, !(documentScannerRepository.m() instanceof InterfaceC3281g0.b)), new C4077yi(postProcessingPopupAnalytics, viewNavigator, imageServiceLocator, !(documentScannerRepository.m() instanceof InterfaceC3281g0.b)), new C3041aa(postProcessingPopupAnalytics, viewNavigator, imageServiceLocator, !(documentScannerRepository.m() instanceof InterfaceC3281g0.b)), new B9(postProcessingPopupAnalytics, viewNavigator, imageServiceLocator, !(documentScannerRepository.m() instanceof InterfaceC3281g0.b)), new C3674p8(postProcessingPopupAnalytics, viewNavigator, z11, imageServiceLocator, i11, defaultConstructorMarker), new C3563mk(postProcessingPopupAnalytics, viewNavigator, z11, imageServiceLocator, i11, defaultConstructorMarker), new C4128zq(new wn0.a() { // from class: com.fourthline.orca.internal.jx0
            @Override // wn0.a
            public final Object invoke() {
                return Integer.valueOf(Z6.b(documentScannerRepository));
            }
        }, postProcessingPopupAnalytics, viewNavigator, imageServiceLocator));
    }

    public final InterfaceC4044xs a(C4087ys popupHandlerBuilder, Fs postProcessingPopupAnalytics, InterfaceC3212eb documentScannerRepository, ND viewNavigator, InterfaceC3732qh imageServiceLocator, W6 documentAnalysisDataBundle) {
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(postProcessingPopupAnalytics, "postProcessingPopupAnalytics");
        p013kotlin.jvm.internal.s.k(documentScannerRepository, "documentScannerRepository");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(documentAnalysisDataBundle, "documentAnalysisDataBundle");
        Cs.a[] aVarArr = (Cs.a[]) p013kotlin.collections.v.r(new Z9(imageServiceLocator), new C3717q8(imageServiceLocator), new C4120zi(postProcessingPopupAnalytics, viewNavigator, documentAnalysisDataBundle, imageServiceLocator, true), new C4077yi(postProcessingPopupAnalytics, viewNavigator, imageServiceLocator, true), new C3041aa(postProcessingPopupAnalytics, viewNavigator, imageServiceLocator, true), new B9(postProcessingPopupAnalytics, viewNavigator, imageServiceLocator, true), documentScannerRepository.c() ? new Ai(postProcessingPopupAnalytics, viewNavigator, documentAnalysisDataBundle, imageServiceLocator) : null).toArray(new Cs.a[0]);
        return popupHandlerBuilder.a((Cs[]) Arrays.copyOf(aVarArr, aVarArr.length));
    }
}
