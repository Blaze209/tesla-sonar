package com.fourthline.orca.internal;

import com.fourthline.vision.document.DocumentScannerResult;
import com.fourthline.vision.document.DocumentScannerStep;
import com.fourthline.vision.document.DocumentScannerStepResult;
import com.fourthline.vision.document.DocumentValidationError;
import java.util.Set;

/* JADX INFO: renamed from: com.fourthline.orca.internal.z6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4102z6 implements InterfaceC3019Za {
    @Override // com.fourthline.orca.internal.InterfaceC3019Za
    public void a(C3640ob c3640ob, InterfaceC3921uz.b result, DocumentScannerStep currentStep) {
        p013kotlin.jvm.internal.s.k(c3640ob, "<this>");
        p013kotlin.jvm.internal.s.k(result, "result");
        p013kotlin.jvm.internal.s.k(currentStep, "currentStep");
    }

    @Override // com.fourthline.orca.internal.InterfaceC3019Za
    public Set a() {
        return InterfaceC3019Za.a.a(this);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3019Za
    public DocumentValidationError a(DocumentScannerStepResult documentScannerStepResult) {
        return InterfaceC3019Za.a.a(this, documentScannerStepResult);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3019Za
    public Gz a(C3640ob c3640ob, DocumentScannerStepResult result, G5 g11, DocumentScannerStep currentStep) {
        p013kotlin.jvm.internal.s.k(c3640ob, "<this>");
        p013kotlin.jvm.internal.s.k(result, "result");
        p013kotlin.jvm.internal.s.k(currentStep, "currentStep");
        return new Gz(c3640ob.g(), g11 != null ? g11.c() : null, currentStep, result);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3019Za
    public C2973Va a(DocumentScannerResult documentScannerResult) {
        p013kotlin.jvm.internal.s.k(documentScannerResult, "<this>");
        return new C2973Va(documentScannerResult);
    }
}
