package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;

/* JADX INFO: loaded from: classes4.dex */
public abstract class M1 implements qj0.e {
    public static C4203h2 a(C4170d1 c4170d1, TimestampProvider timestampProvider, InterfaceC4234l4 interfaceC4234l4) {
        return (C4203h2) qj0.h.d(c4170d1.provideTimeoutFactory(timestampProvider, interfaceC4234l4));
    }

    @Override // javax.inject.Provider
    public abstract /* synthetic */ Object get();
}
