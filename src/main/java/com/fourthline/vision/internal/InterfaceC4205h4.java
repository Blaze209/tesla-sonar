package com.fourthline.vision.internal;

import com.fourthline.core.internal.Try;

/* JADX INFO: renamed from: com.fourthline.vision.internal.h4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC4205h4 {
    boolean getScannerLevelCallbacksAllowed();

    void onMoveToNextStep();

    void onResetCurrentStep(Object obj);

    void onScannerResult(Try<? extends C4275r4> r11);

    void onStart();

    void onStepResult(Try<? extends K5> r11);

    void onStepUpdate(Object obj);

    void onStepsSizeUpdate(int i11);

    void onTakeSnapshot();

    void reset();
}
