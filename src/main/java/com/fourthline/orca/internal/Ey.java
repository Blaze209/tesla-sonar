package com.fourthline.orca.internal;

import com.fourthline.core.CountryNetworkModelKt;
import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.DocumentScannerResult;
import com.fourthline.vision.document.DocumentScannerStep;
import com.fourthline.vision.document.DocumentScannerStepResult;
import com.fourthline.vision.document.DocumentValidationError;
import com.fourthline.vision.document.internal.domain.step.VisionDynamicStepsEvaluator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class Ey implements InterfaceC3019Za, VisionDynamicStepsEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DocumentScannerConfig f25679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4104z8 f25680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f25681c;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.PASSPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Ey(DocumentScannerConfig scannerConfig, C4104z8 dataBundle) {
        p013kotlin.jvm.internal.s.k(scannerConfig, "scannerConfig");
        p013kotlin.jvm.internal.s.k(dataBundle, "dataBundle");
        this.f25679a = scannerConfig;
        this.f25680b = dataBundle;
        this.f25681c = true;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3019Za
    public DocumentValidationError a(DocumentScannerStepResult documentScannerStepResult) {
        return InterfaceC3019Za.a.a(this, documentScannerStepResult);
    }

    public boolean b() {
        return this.f25681c;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3019Za
    public void a(C3640ob c3640ob, InterfaceC3921uz.b result, DocumentScannerStep currentStep) {
        DocumentRecognitionValue documentRecognitionValueB;
        p013kotlin.jvm.internal.s.k(c3640ob, "<this>");
        p013kotlin.jvm.internal.s.k(result, "result");
        p013kotlin.jvm.internal.s.k(currentStep, "currentStep");
        if (currentStep.getIndex() != 0 || (documentRecognitionValueB = result.b()) == null) {
            return;
        }
        this.f25680b.c(documentRecognitionValueB.getIssuingCountry());
        C4104z8 c4104z8 = this.f25680b;
        String documentType = documentRecognitionValueB.getDocumentType();
        c4104z8.a(documentType != null ? CountryNetworkModelKt.toDocumentType(documentType, documentRecognitionValueB.getIssuingCountry()) : null);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3019Za
    public Gz a(C3640ob c3640ob, DocumentScannerStepResult result, G5 g11, DocumentScannerStep currentStep) {
        p013kotlin.jvm.internal.s.k(c3640ob, "<this>");
        p013kotlin.jvm.internal.s.k(result, "result");
        p013kotlin.jvm.internal.s.k(currentStep, "currentStep");
        C4104z8 c4104z8 = this.f25680b;
        DocumentType documentTypeM = c4104z8.m();
        if (documentTypeM == null) {
            documentTypeM = c3640ob.g();
        }
        String strL = c4104z8.l();
        if (strL == null) {
            strL = g11 != null ? g11.c() : null;
        }
        return new Gz(documentTypeM, strL, currentStep, result);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3019Za
    public C2973Va a(DocumentScannerResult documentScannerResult) {
        p013kotlin.jvm.internal.s.k(documentScannerResult, "<this>");
        DocumentType documentTypeM = this.f25680b.m();
        if (documentTypeM == null) {
            documentTypeM = documentScannerResult.getDocumentType();
        }
        return new C2973Va(DocumentScannerResult.copy$default(documentScannerResult, null, null, documentTypeM, null, null, 27, null));
    }

    @Override // com.fourthline.vision.document.internal.domain.step.VisionDynamicStepsEvaluator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean isScannerCompleted(DocumentScannerStep currentStep) {
        p013kotlin.jvm.internal.s.k(currentStep, "currentStep");
        if (!b()) {
            return false;
        }
        DocumentType documentTypeM = this.f25680b.m();
        if ((documentTypeM == null ? -1 : a.$EnumSwitchMapping$0[documentTypeM.ordinal()]) != 1) {
            return false;
        }
        if (this.f25679a.getIncludeAngledSteps()) {
            if (currentStep.getIndex() != 1) {
                return false;
            }
        } else if (currentStep.getIndex() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3019Za
    public Set a() {
        return p013kotlin.collections.d1.i(DocumentValidationError.MRZ_NOT_VALID, DocumentValidationError.MRZ_NOT_DETECTED, DocumentValidationError.PHOTO_DETECTED, DocumentValidationError.PHOTO_NOT_DETECTED, DocumentValidationError.ISSUING_COUNTRY_NOT_SUPPORTED, DocumentValidationError.DOCUMENT_TYPE_INVALID, DocumentValidationError.DOCUMENT_TYPE_NOT_SUPPORTED);
    }
}
