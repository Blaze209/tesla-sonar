package com.fourthline.vision.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.core.mrz.ValidationError;
import com.fourthline.vision.document.DocumentValidationError;
import com.fourthline.vision.document.ocr.OcrValidationError;
import java.util.List;
import java.util.Set;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class R1 implements InterfaceC4232l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4287t2 f37909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4164c3 f37910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f37911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f37912d;

    public R1(DocumentType type, InterfaceC4287t2 faceDetector, InterfaceC4164c3 imageConverter) {
        p013kotlin.jvm.internal.s.k(type, "type");
        p013kotlin.jvm.internal.s.k(faceDetector, "faceDetector");
        p013kotlin.jvm.internal.s.k(imageConverter, "imageConverter");
        this.f37909a = faceDetector;
        this.f37910b = imageConverter;
        List listP = p013kotlin.collections.v.p(DocumentType.PASSPORT, DocumentType.ID_CARD);
        this.f37911c = listP;
        this.f37912d = !listP.contains(type);
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
        return p013kotlin.collections.d1.d();
    }
}
