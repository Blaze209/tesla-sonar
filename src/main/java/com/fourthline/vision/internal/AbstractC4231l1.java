package com.fourthline.vision.internal;

import com.fourthline.vision.document.DocumentScannerConfig;

/* JADX INFO: renamed from: com.fourthline.vision.internal.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4231l1 implements qj0.e {
    public static R1 a(C4170d1 c4170d1, DocumentScannerConfig documentScannerConfig, InterfaceC4287t2 interfaceC4287t2, InterfaceC4164c3 interfaceC4164c3) {
        return (R1) qj0.h.d(c4170d1.provideDocumentPhotoValidator$fourthline_vision_release(documentScannerConfig, interfaceC4287t2, interfaceC4164c3));
    }

    @Override // javax.inject.Provider
    public abstract /* synthetic */ Object get();
}
