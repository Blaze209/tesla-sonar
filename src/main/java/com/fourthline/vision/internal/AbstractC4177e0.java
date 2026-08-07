package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;

/* JADX INFO: renamed from: com.fourthline.vision.internal.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4177e0 implements qj0.e {
    public static TimestampProvider a(L l11) {
        return (TimestampProvider) qj0.h.d(l11.provideTimestampProvider());
    }

    @Override // javax.inject.Provider
    public abstract /* synthetic */ Object get();
}
