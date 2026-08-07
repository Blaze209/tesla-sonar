package com.fourthline.orca.internal;

import com.fourthline.vision.document.ocr.OcrCountryAndTypeValidator;
import java.util.List;
import javax.inject.Provider;
import p013kotlin.KotlinNothingValueException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.vz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3965vz {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List b(List list) {
        return list;
    }

    public final C3889u9 a(W6 documentAnalysisBundle) {
        p013kotlin.jvm.internal.s.k(documentAnalysisBundle, "documentAnalysisBundle");
        return new C3889u9(documentAnalysisBundle);
    }

    public final InterfaceC3921uz a(InterfaceC3212eb documentScannerRepository, Provider localHandlerProvider, Provider analysisHandlerProvider, Provider backgroundUploadProvider) {
        p013kotlin.jvm.internal.s.k(documentScannerRepository, "documentScannerRepository");
        p013kotlin.jvm.internal.s.k(localHandlerProvider, "localHandlerProvider");
        p013kotlin.jvm.internal.s.k(analysisHandlerProvider, "analysisHandlerProvider");
        p013kotlin.jvm.internal.s.k(backgroundUploadProvider, "backgroundUploadProvider");
        if (documentScannerRepository.r()) {
            Object obj = analysisHandlerProvider.get();
            p013kotlin.jvm.internal.s.h(obj);
            return (InterfaceC3921uz) obj;
        }
        if (documentScannerRepository.k()) {
            Object obj2 = backgroundUploadProvider.get();
            p013kotlin.jvm.internal.s.h(obj2);
            return (InterfaceC3921uz) obj2;
        }
        Object obj3 = localHandlerProvider.get();
        p013kotlin.jvm.internal.s.h(obj3);
        return (InterfaceC3921uz) obj3;
    }

    public final InterfaceC3921uz a(ou.m customStepConfirmationHandler) {
        p013kotlin.jvm.internal.s.k(customStepConfirmationHandler, "customStepConfirmationHandler");
        if (customStepConfirmationHandler.c()) {
            return new C4093yy(p013kotlin.collections.v.e(customStepConfirmationHandler.b()));
        }
        return new C3477kk();
    }

    public final InterfaceC3921uz a(DocumentAnalysisConfig analysisConfig, C3889u9 documentIdentifierRepository, InterfaceC3837t0 analyzeImageWorker, InterfaceC3408j0 analysisStepRepository, C3930v7 validator, InterfaceC4044xs popupHandler, ou.m customStepConfirmationHandler, C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(analysisConfig, "analysisConfig");
        p013kotlin.jvm.internal.s.k(documentIdentifierRepository, "documentIdentifierRepository");
        p013kotlin.jvm.internal.s.k(analyzeImageWorker, "analyzeImageWorker");
        p013kotlin.jvm.internal.s.k(analysisStepRepository, "analysisStepRepository");
        p013kotlin.jvm.internal.s.k(validator, "validator");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(customStepConfirmationHandler, "customStepConfirmationHandler");
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new C4093yy(p013kotlin.collections.v.r(new C3324h0(documentIdentifierRepository, analyzeImageWorker, analysisStepRepository, validator, popupHandler, new C2974Vb(tracker)), customStepConfirmationHandler.c() ? (InterfaceC3921uz) customStepConfirmationHandler.b() : null));
    }

    public final C3930v7 a(final List supportedCountries) {
        p013kotlin.jvm.internal.s.k(supportedCountries, "supportedCountries");
        return new C3930v7(new M7(new OcrCountryAndTypeValidator(new wn0.a() { // from class: com.fourthline.orca.internal.mg1
            @Override // wn0.a
            public final Object invoke() {
                return C3965vz.b(supportedCountries);
            }
        })), new C2933Sb());
    }

    public final InterfaceC3408j0 a(InterfaceC3212eb documentScannerRepository, DocumentAnalysisConfig documentAnalysisConfig) {
        p013kotlin.jvm.internal.s.k(documentScannerRepository, "documentScannerRepository");
        p013kotlin.jvm.internal.s.k(documentAnalysisConfig, "documentAnalysisConfig");
        return new C3451k0(documentAnalysisConfig.getImageUploadTimeoutMs(), documentScannerRepository.c(), documentScannerRepository.m());
    }

    public final InterfaceC3921uz a(C3889u9 documentIdentifierRepository, WC uploadDocumentImageWorker) {
        p013kotlin.jvm.internal.s.k(documentIdentifierRepository, "documentIdentifierRepository");
        p013kotlin.jvm.internal.s.k(uploadDocumentImageWorker, "uploadDocumentImageWorker");
        return new C4093yy(p013kotlin.collections.v.e(new C3990wh(documentIdentifierRepository, uploadDocumentImageWorker)));
    }

    public final WC a(wn0.a workflowIdProvider, W6 documentAnalysisBundle, ou.m dataWorkManager, InterfaceC3212eb repository, Gl networkService) {
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(documentAnalysisBundle, "documentAnalysisBundle");
        p013kotlin.jvm.internal.s.k(dataWorkManager, "dataWorkManager");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        if (X6.b(documentAnalysisBundle)) {
            if (dataWorkManager.c() && (documentAnalysisBundle instanceof C4104z8)) {
                C4104z8 c4104z8 = (C4104z8) documentAnalysisBundle;
                Object objB = dataWorkManager.b();
                p013kotlin.jvm.internal.s.j(objB, "get(...)");
                return new Kl(workflowIdProvider, c4104z8, (InterfaceC3500l6) objB, repository.p());
            }
            AbstractC3989wg.a("Product is not correctly configured for Document Analysis endpoint.");
            throw new KotlinNothingValueException();
        }
        return new C3220ej(workflowIdProvider, networkService, repository.p());
    }
}
