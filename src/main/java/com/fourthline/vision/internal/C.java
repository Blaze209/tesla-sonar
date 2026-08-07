package com.fourthline.vision.internal;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class C implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4319y f37641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f37642b;

    public C(C4319y c4319y, Provider provider) {
        this.f37641a = c4319y;
        this.f37642b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CameraManager get() {
        return a(this.f37641a, (Context) this.f37642b.get());
    }

    public static C a(C4319y c4319y, Provider provider) {
        return new C(c4319y, provider);
    }

    public static CameraManager a(C4319y c4319y, Context context) {
        return (CameraManager) qj0.h.d(c4319y.provideCameraManager(context));
    }
}
