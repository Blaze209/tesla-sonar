package com.fourthline.vision.internal;

import android.content.Context;
import android.hardware.SensorManager;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.vision.internal.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4169d0 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L f38208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f38209b;

    public C4169d0(L l11, Provider provider) {
        this.f38208a = l11;
        this.f38209b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public SensorManager get() {
        return a(this.f38208a, (Context) this.f38209b.get());
    }

    public static C4169d0 a(L l11, Provider provider) {
        return new C4169d0(l11, provider);
    }

    public static SensorManager a(L l11, Context context) {
        return (SensorManager) qj0.h.d(l11.provideSensorManager(context));
    }
}
