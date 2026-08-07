package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.internal.devicedata.MotionDataCollector;

/* JADX INFO: loaded from: classes4.dex */
public abstract class K4 implements qj0.e {
    public static E3 a(C4324y4 c4324y4, MotionDataCollector motionDataCollector, TimestampProvider timestampProvider, F3 f11, C4213i4 c4213i4) {
        return (E3) qj0.h.d(c4324y4.provideMotionDataManager(motionDataCollector, timestampProvider, f11, c4213i4));
    }

    @Override // javax.inject.Provider
    public abstract /* synthetic */ Object get();
}
