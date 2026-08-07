package com.fourthline.vision.internal;

/* JADX INFO: loaded from: classes4.dex */
public class o6 {
    public final H6 provideImageProducer(C4257p camera2) {
        p013kotlin.jvm.internal.s.k(camera2, "camera2");
        return new C4291u(camera2);
    }

    public final r6 provideVisionInfo(C4312x cameraInfoProvider) {
        p013kotlin.jvm.internal.s.k(cameraInfoProvider, "cameraInfoProvider");
        return new H(cameraInfoProvider);
    }
}
