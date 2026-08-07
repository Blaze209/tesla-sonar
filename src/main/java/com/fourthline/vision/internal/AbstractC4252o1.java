package com.fourthline.vision.internal;

import com.fourthline.vision.document.DocumentScannerConfig;

/* JADX INFO: renamed from: com.fourthline.vision.internal.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4252o1 implements qj0.e {
    public static DocumentScannerConfig a(C4170d1 c4170d1) {
        return (DocumentScannerConfig) qj0.h.d(c4170d1.provideDocumentScannerConfig$fourthline_vision_release());
    }

    @Override // javax.inject.Provider
    public abstract /* synthetic */ Object get();
}
