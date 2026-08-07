package com.fourthline.vision.internal;

import android.hardware.camera2.CameraManager;
import android.view.Display;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class B implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4319y f37629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f37630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f37631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f37632d;

    public B(C4319y c4319y, Provider provider, Provider provider2, Provider provider3) {
        this.f37629a = c4319y;
        this.f37630b = provider;
        this.f37631c = provider2;
        this.f37632d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4312x get() {
        return a(this.f37629a, (CameraManager) this.f37630b.get(), (Display) this.f37631c.get(), (C4213i4) this.f37632d.get());
    }

    public static B a(C4319y c4319y, Provider provider, Provider provider2, Provider provider3) {
        return new B(c4319y, provider, provider2, provider3);
    }

    public static C4312x a(C4319y c4319y, CameraManager cameraManager, Display display, C4213i4 c4213i4) {
        return (C4312x) qj0.h.d(c4319y.provideCameraInfoProvider(cameraManager, display, c4213i4));
    }
}
