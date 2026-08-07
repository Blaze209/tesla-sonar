package com.fourthline.vision.internal;

import com.fourthline.core.internal.Try;
import com.fourthline.vision.MotionData;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public interface E3 {
    Object cancel(Continuation<? super jn0.h0> continuation);

    void start();

    Object stop(Continuation<? super Try<MotionData>> continuation);
}
