package com.fourthline.vision.internal;

import android.hardware.camera2.CameraManager;
import android.view.Display;

/* JADX INFO: loaded from: classes4.dex */
public final class O0 implements InterfaceC4305w {
    @Override // com.fourthline.vision.internal.InterfaceC4305w
    public P0 provideCameraInfoProvider(CameraManager cameraManager, Display display, C4213i4 scannerConfig) {
        p013kotlin.jvm.internal.s.k(cameraManager, "cameraManager");
        p013kotlin.jvm.internal.s.k(display, "display");
        p013kotlin.jvm.internal.s.k(scannerConfig, "scannerConfig");
        return new P0(cameraManager, scannerConfig.getCameraDirection(), display);
    }
}
