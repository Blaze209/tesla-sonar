package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.SelfieScannerConfig;

/* JADX INFO: renamed from: com.fourthline.vision.internal.f5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4190f5 implements qj0.e {
    public static AbstractC4212i3 a(C4324y4 c4324y4, C4323y3 c4323y3, SelfieScannerConfig selfieScannerConfig) {
        return (AbstractC4212i3) qj0.h.d(c4324y4.provideVideoIntervalDataSource(c4323y3, selfieScannerConfig));
    }

    @Override // javax.inject.Provider
    public abstract /* synthetic */ Object get();
}
