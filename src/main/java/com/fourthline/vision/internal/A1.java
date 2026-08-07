package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.internal.devicedata.MotionDataCollector;

/* JADX INFO: loaded from: classes4.dex */
public abstract class A1 implements qj0.e {
    public static E3 a(C4170d1 c4170d1, MotionDataCollector motionDataCollector, TimestampProvider timestampProvider, F3 f11, C4213i4 c4213i4) {
        return (E3) qj0.h.d(c4170d1.provideMotionDataManager(motionDataCollector, timestampProvider, f11, c4213i4));
    }

    @Override // javax.inject.Provider
    public abstract /* synthetic */ Object get();
}
