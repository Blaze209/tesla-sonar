package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;

/* JADX INFO: renamed from: com.fourthline.vision.internal.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4194g1 implements qj0.e {
    public static N0 a(C4170d1 c4170d1, TimestampProvider timestampProvider) {
        return (N0) qj0.h.d(c4170d1.provideDocumentBirthDateValidator$fourthline_vision_release(timestampProvider));
    }

    @Override // javax.inject.Provider
    public abstract /* synthetic */ Object get();
}
