package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.SelfieScannerConfig;

/* JADX INFO: loaded from: classes4.dex */
public abstract class G4 implements qj0.e {
    public static M2 a(C4324y4 c4324y4, SelfieScannerConfig selfieScannerConfig, C4313x0 c4313x0, InterfaceC4287t2 interfaceC4287t2, InterfaceC4164c3 interfaceC4164c3) {
        return (M2) qj0.h.d(c4324y4.provideImageToFaceDetectionInteractor(selfieScannerConfig, c4313x0, interfaceC4287t2, interfaceC4164c3));
    }

    @Override // javax.inject.Provider
    public abstract /* synthetic */ Object get();
}
