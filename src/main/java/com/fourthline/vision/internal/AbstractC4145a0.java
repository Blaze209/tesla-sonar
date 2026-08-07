package com.fourthline.vision.internal;

import android.content.Context;
import com.fourthline.core.internal.devicedata.MotionDataCollector;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: com.fourthline.vision.internal.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4145a0 implements qj0.e {
    public static MotionDataCollector a(L l11, Context context, CoroutineContext coroutineContext, C4213i4 c4213i4) {
        return (MotionDataCollector) qj0.h.d(l11.provideMotionDataCollector(context, coroutineContext, c4213i4));
    }

    @Override // javax.inject.Provider
    public abstract /* synthetic */ Object get();
}
