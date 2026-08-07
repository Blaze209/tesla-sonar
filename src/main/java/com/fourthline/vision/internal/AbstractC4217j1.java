package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;

/* JADX INFO: renamed from: com.fourthline.vision.internal.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4217j1 implements qj0.e {
    public static C4146a1 a(C4170d1 c4170d1, TimestampProvider timestampProvider) {
        return (C4146a1) qj0.h.d(c4170d1.provideDocumentExpirationDateValidator$fourthline_vision_release(timestampProvider));
    }

    @Override // javax.inject.Provider
    public abstract /* synthetic */ Object get();
}
