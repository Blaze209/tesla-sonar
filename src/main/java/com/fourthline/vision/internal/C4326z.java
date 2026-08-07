package com.fourthline.vision.internal;

import android.hardware.camera2.CameraManager;
import android.os.Handler;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.vision.internal.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4326z implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4319y f39149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f39150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f39151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f39152d;

    public C4326z(C4319y c4319y, Provider provider, Provider provider2, Provider provider3) {
        this.f39149a = c4319y;
        this.f39150b = provider;
        this.f39151c = provider2;
        this.f39152d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4257p get() {
        return a(this.f39149a, (CameraManager) this.f39150b.get(), (Handler) this.f39151c.get(), (C4312x) this.f39152d.get());
    }

    public static C4326z a(C4319y c4319y, Provider provider, Provider provider2, Provider provider3) {
        return new C4326z(c4319y, provider, provider2, provider3);
    }

    public static C4257p a(C4319y c4319y, CameraManager cameraManager, Handler handler, C4312x c4312x) {
        return (C4257p) qj0.h.d(c4319y.provideCamera2(cameraManager, handler, c4312x));
    }
}
