package com.fourthline.orca.internal;

import com.fourthline.core.internal.TimestampProvider;
import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.i7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3374i7 implements qj0.e {
    public static InterfaceC3974w7 a(Z6 z11, TimestampProvider timestampProvider, List list, InterfaceC3212eb interfaceC3212eb) {
        return (InterfaceC3974w7) qj0.h.d(z11.a(timestampProvider, list, interfaceC3212eb));
    }

    @Override // javax.inject.Provider
    public abstract /* synthetic */ Object get();
}
