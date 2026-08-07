package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.SelfieScannerCallback;

/* JADX INFO: loaded from: classes4.dex */
public abstract class T4 implements qj0.e {
    public static SelfieScannerCallback a(C4324y4 c4324y4) {
        return (SelfieScannerCallback) qj0.h.d(c4324y4.provideSelfieScannerCallback());
    }

    @Override // javax.inject.Provider
    public abstract /* synthetic */ Object get();
}
