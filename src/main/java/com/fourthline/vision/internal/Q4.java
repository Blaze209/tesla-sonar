package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.location.LocationProvider;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Q4 implements qj0.e {
    public static InterfaceC4197g4 a(C4324y4 c4324y4, InterfaceC4240m3 interfaceC4240m3, E3 e11, C4214i5 c4214i5, M5 m11, TimestampProvider timestampProvider, LocationProvider locationProvider, C4323y3 c4323y3, Q5 q11, CoroutineContext coroutineContext) {
        return (InterfaceC4197g4) qj0.h.d(c4324y4.provideScanner(interfaceC4240m3, e11, c4214i5, m11, timestampProvider, locationProvider, c4323y3, q11, coroutineContext));
    }

    @Override // javax.inject.Provider
    public abstract /* synthetic */ Object get();
}
