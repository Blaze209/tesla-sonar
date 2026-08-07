package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.vision.document.DocumentScannerCallback;

/* JADX INFO: renamed from: com.fourthline.vision.internal.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4245n1 implements qj0.e {
    public static S1 a(C4170d1 c4170d1, DocumentScannerCallback documentScannerCallback, TimestampProvider timestampProvider, LocationProvider locationProvider, InterfaceC4248n4 interfaceC4248n4, InterfaceC4248n4 interfaceC4248n5, InterfaceC4159b6 interfaceC4159b6) {
        return (S1) qj0.h.d(c4170d1.provideDocumentScannerCallbackProxy(documentScannerCallback, timestampProvider, locationProvider, interfaceC4248n4, interfaceC4248n5, interfaceC4159b6));
    }

    @Override // javax.inject.Provider
    public abstract /* synthetic */ Object get();
}
