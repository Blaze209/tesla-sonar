package com.fourthline.orca.internal;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.e9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3204e9 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K8 f31356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f31357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f31358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f31359d;

    public C3204e9(K8 k11, Provider provider, Provider provider2, Provider provider3) {
        this.f31356a = k11;
        this.f31357b = provider;
        this.f31358c = provider2;
        this.f31359d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public On get() {
        return a(this.f31356a, (Context) this.f31357b.get(), (X3) this.f31358c.get(), (InterfaceC3051ak) this.f31359d.get());
    }

    public static C3204e9 a(K8 k11, Provider provider, Provider provider2, Provider provider3) {
        return new C3204e9(k11, provider, provider2, provider3);
    }

    public static On a(K8 k11, Context context, X3 x11, InterfaceC3051ak interfaceC3051ak) {
        return (On) qj0.h.d(k11.a(context, x11, interfaceC3051ak));
    }
}
