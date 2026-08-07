package com.fourthline.nfc.internal;

import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.location.LocationProvider;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: com.fourthline.nfc.internal.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2820j0 implements qj0.e {
    public static G0 a(C2802a0 c2802a0, I0 i11, TimestampProvider timestampProvider, v0 v0Var, LocationProvider locationProvider, InterfaceC2830u interfaceC2830u, CoroutineContext coroutineContext) {
        return (G0) qj0.h.d(c2802a0.a(i11, timestampProvider, v0Var, locationProvider, interfaceC2830u, coroutineContext));
    }

    @Override // javax.inject.Provider
    public abstract /* synthetic */ Object get();
}
