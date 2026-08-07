package com.fourthline.vision.internal;

import android.hardware.SensorManager;
import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: com.fourthline.vision.internal.x5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4318x5 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4297u5 f39093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f39094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f39095c;

    public C4318x5(C4297u5 c4297u5, Provider provider, Provider provider2) {
        this.f39093a = c4297u5;
        this.f39094b = provider;
        this.f39095c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public H2 get() {
        return a(this.f39093a, (CoroutineContext) this.f39094b.get(), (SensorManager) this.f39095c.get());
    }

    public static C4318x5 a(C4297u5 c4297u5, Provider provider, Provider provider2) {
        return new C4318x5(c4297u5, provider, provider2);
    }

    public static H2 a(C4297u5 c4297u5, CoroutineContext coroutineContext, SensorManager sensorManager) {
        return (H2) qj0.h.d(c4297u5.provideGyroscopeFlow(coroutineContext, sensorManager));
    }
}
