package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.SelfieScannerConfig;

/* JADX INFO: loaded from: classes4.dex */
public abstract class V4 implements qj0.e {
    public static SelfieScannerConfig a(C4324y4 c4324y4) {
        return (SelfieScannerConfig) qj0.h.d(c4324y4.provideSelfieScannerConfig());
    }

    @Override // javax.inject.Provider
    public abstract /* synthetic */ Object get();
}
