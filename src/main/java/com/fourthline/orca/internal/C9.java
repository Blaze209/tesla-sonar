package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.core.VideoDuration;
import com.fourthline.vision.RecordingType;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.DocumentValidationConfig;
import com.fourthline.vision.document.MrzValidationPolicy;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class C9 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(InterfaceC3051ak interfaceC3051ak) {
        String strD;
        XE xeF = interfaceC3051ak.f();
        if (xeF == null || (strD = xeF.d()) == null) {
            throw new IllegalStateException("FL Developer error. Functionality requires missing 'WorkflowId'");
        }
        return strD;
    }

    public final wn0.a a(final InterfaceC3051ak mainRepository) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        return new wn0.a() { // from class: com.fourthline.orca.internal.i10
            @Override // wn0.a
            public final Object invoke() {
                return C9.b(mainRepository);
            }
        };
    }

    public final DocumentAnalysisConfig a(A9 mainRepository) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        return new DocumentAnalysisConfig(mainRepository.h().g(), mainRepository.h().b().getAnalysis().getMinimumAge(), mainRepository.h().b().getAnalysis().getImageUploadTimeoutMs(), mainRepository.h().b().getAnalysis().getBackendProcessingTimeoutMs());
    }

    public final List b(A9 mainRepository) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        return mainRepository.h().b().getSupportedDocuments();
    }

    public final E7 c() {
        return new E7(new Ms(), new C3720qB(MA.ITA), new Oq());
    }

    public final C3392ik b() {
        return new C3392ik("document");
    }

    public final C3424ja a(W6 dataBundle, E6 deviceDataBundle, A9 mainRepository, List countries, boolean z11) {
        PersonSettings person;
        Boolean tiltedStepsEnabled;
        p013kotlin.jvm.internal.s.k(dataBundle, "dataBundle");
        p013kotlin.jvm.internal.s.k(deviceDataBundle, "deviceDataBundle");
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        p013kotlin.jvm.internal.s.k(countries, "countries");
        C3340ha c3340haH = mainRepository.h();
        IdvSettings idv = c3340haH.e().getWorkflow().getIdv();
        Object obj = null;
        DocumentSettings document = idv != null ? idv.getDocument() : null;
        DocumentType documentTypeF = c3340haH.f();
        boolean zBooleanValue = c3340haH.j() ? (document == null || (tiltedStepsEnabled = document.getTiltedStepsEnabled()) == null) ? true : tiltedStepsEnabled.booleanValue() : false;
        MrzValidationPolicy mrzValidationPolicy = MrzValidationPolicy.NORMAL;
        List supportedDocuments = mainRepository.h().b().getSupportedDocuments();
        if (supportedDocuments.isEmpty()) {
            supportedDocuments = null;
        }
        IdvSettings idv2 = c3340haH.e().getWorkflow().getIdv();
        DocumentScannerConfig documentScannerConfig = new DocumentScannerConfig(documentTypeF, false, zBooleanValue, false, RecordingType.VIDEO_ONLY, mrzValidationPolicy, new DocumentValidationConfig((idv2 == null || (person = idv2.getPerson()) == null) ? 18 : person.getMinimumAge(), supportedDocuments), VideoDuration.DEFAULT.INSTANCE, 10L, z11, 10, null);
        boolean zG = c3340haH.g();
        boolean zH = c3340haH.h();
        double dC = c3340haH.c();
        for (Object obj2 : countries) {
            if (p013kotlin.jvm.internal.s.f(((G5) obj2).c(), c3340haH.d())) {
                obj = obj2;
                break;
            }
        }
        return new C3424ja(dataBundle, deviceDataBundle, documentScannerConfig, false, false, zG, zH, false, dC, (G5) obj, mainRepository.h().b().getCameraX().getEnabled(), mainRepository.h().b().getVideo().getBitrate(), InterfaceC3281g0.a.f31907a);
    }

    public final W6 a() {
        return new C4016x6(null, false, null, null, 15, null);
    }

    public final ED a(C3383ia flowActionProvider) {
        p013kotlin.jvm.internal.s.k(flowActionProvider, "flowActionProvider");
        Wz wz2 = new Wz();
        Vz vz2 = new Vz();
        jn0.s.Companion companion = jn0.s.INSTANCE;
        return new C4084yp(flowActionProvider, wz2, vz2, new C3835sz(jn0.s.b(new InterfaceC3645og.b(InterfaceC3645og.c.b.f34275a))));
    }

    public final C3383ia a(InterfaceC3051ak mainRepository, C3424ja productRepository) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        p013kotlin.jvm.internal.s.k(productRepository, "productRepository");
        return new C3383ia(AbstractC3094bk.a(mainRepository), productRepository);
    }
}
