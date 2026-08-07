package com.fourthline.vision.internal;

import com.fourthline.vision.document.DocumentScannerConfig;

/* JADX INFO: renamed from: com.fourthline.vision.internal.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4186f1 implements qj0.e {
    public static InterfaceC4159b6 a(C4170d1 c4170d1, InterfaceC4248n4 interfaceC4248n4, InterfaceC4248n4 interfaceC4248n5, DocumentScannerConfig documentScannerConfig) {
        return (InterfaceC4159b6) qj0.h.d(c4170d1.provideDocumentAnalytics(interfaceC4248n4, interfaceC4248n5, documentScannerConfig));
    }

    @Override // javax.inject.Provider
    public abstract /* synthetic */ Object get();
}
