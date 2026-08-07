package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;

/* JADX INFO: renamed from: com.fourthline.vision.internal.a5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4150a5 implements qj0.e {
    public static O5 a(C4324y4 c4324y4, TimestampProvider timestampProvider) {
        return (O5) qj0.h.d(c4324y4.provideTimeoutConsumer$fourthline_vision_release(timestampProvider));
    }

    @Override // javax.inject.Provider
    public abstract /* synthetic */ Object get();
}
