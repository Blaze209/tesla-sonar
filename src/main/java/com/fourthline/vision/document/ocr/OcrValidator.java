package com.fourthline.vision.document.ocr;

import java.util.Set;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/fourthline/vision/document/ocr/OcrValidator;", "TYPE", "", "validate", "", "Lcom/fourthline/vision/document/ocr/OcrValidationError;", "value", "(Ljava/lang/Object;)Ljava/util/Set;", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface OcrValidator<TYPE> {
    Set<OcrValidationError> validate(TYPE value);
}
