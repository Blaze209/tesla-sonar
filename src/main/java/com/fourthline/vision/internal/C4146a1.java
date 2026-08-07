package com.fourthline.vision.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.core.mrz.MrtdMrzInfo;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.core.mrz.ValidationError;
import com.fourthline.vision.document.DocumentValidationError;
import com.fourthline.vision.document.ocr.ExpirationDateData;
import com.fourthline.vision.document.ocr.OcrDocumentExpirationDateValidator;
import com.fourthline.vision.document.ocr.OcrValidationError;
import java.util.List;
import java.util.Set;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.vision.internal.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4146a1 implements InterfaceC4232l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.a f38131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final OcrDocumentExpirationDateValidator f38132b;

    public C4146a1(wn0.a<? extends DocumentType> documentTypeFactory, OcrDocumentExpirationDateValidator ocrValidator) {
        p013kotlin.jvm.internal.s.k(documentTypeFactory, "documentTypeFactory");
        p013kotlin.jvm.internal.s.k(ocrValidator, "ocrValidator");
        this.f38131a = documentTypeFactory;
        this.f38132b = ocrValidator;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4232l2
    public DocumentValidationError toDocumentValidationError(OcrValidationError ocrValidationError, List<? extends ValidationError> list) {
        return InterfaceC4232l2.a.toDocumentValidationError(this, ocrValidationError, list);
    }

    @Override // com.fourthline.vision.internal.InterfaceC4232l2
    public Set<DocumentValidationError> toDocumentValidationErrors(Set<? extends OcrValidationError> set, List<? extends ValidationError> list) {
        return InterfaceC4232l2.a.toDocumentValidationErrors(this, set, list);
    }

    @Override // com.fourthline.vision.internal.InterfaceC4232l2, com.fourthline.vision.internal.T5
    public Object validate(K5 k11, I5 i11, Continuation<? super Set<? extends DocumentValidationError>> continuation) {
        InterfaceC4163c2.b bVar = k11 instanceof InterfaceC4163c2.b ? (InterfaceC4163c2.b) k11 : null;
        MrzInfo mrz = bVar != null ? bVar.getMrz() : null;
        if (!(mrz instanceof MrtdMrzInfo)) {
            return p013kotlin.collections.d1.d();
        }
        MrtdMrzInfo mrtdMrzInfo = (MrtdMrzInfo) mrz;
        return toDocumentValidationErrors(this.f38132b.validate(new ExpirationDateData(mrtdMrzInfo.getIssuingCountry(), (DocumentType) this.f38131a.invoke(), mrtdMrzInfo.getExpirationDate())), mrtdMrzInfo.getValidationErrors());
    }
}
