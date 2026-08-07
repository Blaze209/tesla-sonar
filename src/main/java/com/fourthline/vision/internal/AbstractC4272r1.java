package com.fourthline.vision.internal;

import com.fourthline.vision.document.DocumentScannerConfig;

/* JADX INFO: renamed from: com.fourthline.vision.internal.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4272r1 implements qj0.e {
    public static C4218j2 a(C4170d1 c4170d1, DocumentScannerConfig documentScannerConfig) {
        return (C4218j2) qj0.h.d(c4170d1.provideDocumentTypeValidator$fourthline_vision_release(documentScannerConfig));
    }

    @Override // javax.inject.Provider
    public abstract /* synthetic */ Object get();
}
