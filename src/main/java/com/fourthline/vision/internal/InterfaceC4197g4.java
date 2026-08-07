package com.fourthline.vision.internal;

/* JADX INFO: renamed from: com.fourthline.vision.internal.g4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC4197g4 extends F5 {
    InterfaceC4240m3 getMediaRecorderManager();

    InterfaceC4205h4 getScannerCallback();

    I5 getStepConfig();

    int getStepsCount();

    boolean isRunning();

    void moveToNextStep();

    void resetCurrentStep();

    void resetScanner();

    @Override // com.fourthline.vision.internal.F5
    /* synthetic */ void start();

    @Override // com.fourthline.vision.internal.F5
    /* synthetic */ void stop();

    void takeSnapshot();
}
