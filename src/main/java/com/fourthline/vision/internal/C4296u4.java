package com.fourthline.vision.internal;

import android.hardware.camera2.CameraManager;
import android.view.Display;

/* JADX INFO: renamed from: com.fourthline.vision.internal.u4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4296u4 implements InterfaceC4305w {
    @Override // com.fourthline.vision.internal.InterfaceC4305w
    public C4312x provideCameraInfoProvider(CameraManager cameraManager, Display display, C4213i4 scannerConfig) {
        p013kotlin.jvm.internal.s.k(cameraManager, "cameraManager");
        p013kotlin.jvm.internal.s.k(display, "display");
        p013kotlin.jvm.internal.s.k(scannerConfig, "scannerConfig");
        return new C4312x(cameraManager, scannerConfig.getCameraDirection(), display);
    }
}
