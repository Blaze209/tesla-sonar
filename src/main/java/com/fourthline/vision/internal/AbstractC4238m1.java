package com.fourthline.vision.internal;

import com.fourthline.vision.document.DocumentScannerCallback;

/* JADX INFO: renamed from: com.fourthline.vision.internal.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4238m1 implements qj0.e {
    public static DocumentScannerCallback a(C4170d1 c4170d1) {
        return (DocumentScannerCallback) qj0.h.d(c4170d1.provideDocumentScannerCallback$fourthline_vision_release());
    }

    @Override // javax.inject.Provider
    public abstract /* synthetic */ Object get();
}
