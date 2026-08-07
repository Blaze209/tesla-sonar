package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;

/* JADX INFO: loaded from: classes4.dex */
public abstract class J1 implements qj0.e {
    public static C4155b2 a(C4170d1 c4170d1, TimestampProvider timestampProvider, C4179e2 c4179e2, C4323y3 c4323y3) {
        return (C4155b2) qj0.h.d(c4170d1.provideScannerTimeoutConsumer$fourthline_vision_release(timestampProvider, c4179e2, c4323y3));
    }

    @Override // javax.inject.Provider
    public abstract /* synthetic */ Object get();
}
