package com.fourthline.vision.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.core.mrz.MrtdMrzInfo;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.core.mrz.ValidationError;
import com.fourthline.vision.document.DocumentValidationError;
import com.fourthline.vision.document.ocr.OcrCountryAndTypeValidator;
import com.fourthline.vision.document.ocr.OcrValidationError;
import java.util.List;
import java.util.Set;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class R0 implements InterfaceC4232l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OcrCountryAndTypeValidator f37907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wn0.a f37908b;

    public R0(OcrCountryAndTypeValidator ocrValidator, wn0.a<? extends DocumentType> documentTypeFactory) {
        p013kotlin.jvm.internal.s.k(ocrValidator, "ocrValidator");
        p013kotlin.jvm.internal.s.k(documentTypeFactory, "documentTypeFactory");
        this.f37907a = ocrValidator;
        this.f37908b = documentTypeFactory;
    }

    private final DocumentType getDocumentType() {
        return (DocumentType) this.f37908b.invoke();
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
        MrtdMrzInfo mrtdMrzInfo = mrz instanceof MrtdMrzInfo ? (MrtdMrzInfo) mrz : null;
        if (mrtdMrzInfo == null) {
            return p013kotlin.collections.d1.d();
        }
        return toDocumentValidationErrors(this.f37907a.validate2(new jn0.w<>(mrtdMrzInfo.getIssuingCountry(), getDocumentType(), mrtdMrzInfo.getNationality())), mrtdMrzInfo.getValidationErrors());
    }
}
