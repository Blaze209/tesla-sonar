package com.fourthline.vision.internal;

import com.fourthline.core.internal.Try;

/* JADX INFO: loaded from: classes4.dex */
public interface M5 extends F5 {
    wn0.a<jn0.h0> getOnCompletedListener();

    I5 getStepConfig();

    wn0.l<I5, jn0.h0> getStepListener();

    wn0.l<Try<? extends K5>, jn0.h0> getStepResultListener();

    int getStepsCount();

    void moveToNext();

    void resetAll();

    void resetCurrentStep();

    void setOnCompletedListener(wn0.a<jn0.h0> aVar);

    void setStepListener(wn0.l<? super I5, jn0.h0> lVar);

    void setStepResultListener(wn0.l<? super Try<? extends K5>, jn0.h0> lVar);

    @Override // com.fourthline.vision.internal.F5
    /* synthetic */ void start();

    @Override // com.fourthline.vision.internal.F5
    /* synthetic */ void stop();
}
