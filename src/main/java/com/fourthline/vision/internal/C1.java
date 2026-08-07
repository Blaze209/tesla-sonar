package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;

/* JADX INFO: loaded from: classes4.dex */
public abstract class C1 implements qj0.e {
    public static G3 a(C4170d1 c4170d1, TimestampProvider timestampProvider) {
        return (G3) qj0.h.d(c4170d1.provideMrzCandidateInteractor(timestampProvider));
    }

    @Override // javax.inject.Provider
    public abstract /* synthetic */ Object get();
}
