package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.SelfieScannerConfig;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Z4 implements qj0.e {
    public static C4270q5 a(C4324y4 c4324y4, SelfieScannerConfig selfieScannerConfig, J5 j11, J5 j12, J5 j13, J5 j14) {
        return (C4270q5) qj0.h.d(c4324y4.provideStepsDataSource(selfieScannerConfig, j11, j12, j13, j14));
    }

    @Override // javax.inject.Provider
    public abstract /* synthetic */ Object get();
}
