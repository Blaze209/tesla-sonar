package com.fourthline.orca.internal;

import com.fourthline.core.internal.devicedata.AndroidDataCollectorHelper;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.fourthline.orca.internal.i6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3373i6 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y5 f32435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f32437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f32438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f32439e;

    public C3373i6(Y5 y11, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f32435a = y11;
        this.f32436b = provider;
        this.f32437c = provider2;
        this.f32438d = provider3;
        this.f32439e = provider4;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Ew get() {
        return a(this.f32435a, (AndroidDataCollectorHelper) this.f32436b.get(), (E6) this.f32437c.get(), (InterfaceC3051ak) this.f32438d.get(), (CoroutineScope) this.f32439e.get());
    }

    public static C3373i6 a(Y5 y11, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new C3373i6(y11, provider, provider2, provider3, provider4);
    }

    public static Ew a(Y5 y11, AndroidDataCollectorHelper androidDataCollectorHelper, E6 e11, InterfaceC3051ak interfaceC3051ak, CoroutineScope coroutineScope) {
        return (Ew) qj0.h.d(y11.a(androidDataCollectorHelper, e11, interfaceC3051ak, coroutineScope));
    }
}
