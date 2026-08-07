package com.fourthline.vision.internal;

import android.hardware.SensorManager;
import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: com.fourthline.vision.internal.v5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4304v5 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4297u5 f39042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f39043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f39044c;

    public C4304v5(C4297u5 c4297u5, Provider provider, Provider provider2) {
        this.f39042a = c4297u5;
        this.f39043b = provider;
        this.f39044c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4144a get() {
        return a(this.f39042a, (CoroutineContext) this.f39043b.get(), (SensorManager) this.f39044c.get());
    }

    public static C4304v5 a(C4297u5 c4297u5, Provider provider, Provider provider2) {
        return new C4304v5(c4297u5, provider, provider2);
    }

    public static C4144a a(C4297u5 c4297u5, CoroutineContext coroutineContext, SensorManager sensorManager) {
        return (C4144a) qj0.h.d(c4297u5.provideAccelerometerFlow(coroutineContext, sensorManager));
    }
}
