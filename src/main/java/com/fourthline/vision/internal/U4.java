package com.fourthline.vision.internal;

import com.fourthline.core.location.LocationProvider;
import com.fourthline.vision.selfie.SelfieScannerCallback;

/* JADX INFO: loaded from: classes4.dex */
public abstract class U4 implements qj0.e {
    public static C4214i5 a(C4324y4 c4324y4, SelfieScannerCallback selfieScannerCallback, InterfaceC4248n4 interfaceC4248n4, InterfaceC4159b6 interfaceC4159b6, LocationProvider locationProvider) {
        return (C4214i5) qj0.h.d(c4324y4.provideSelfieScannerCallbackProxy(selfieScannerCallback, interfaceC4248n4, interfaceC4159b6, locationProvider));
    }

    @Override // javax.inject.Provider
    public abstract /* synthetic */ Object get();
}
