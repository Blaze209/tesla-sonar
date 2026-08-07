package com.fourthline.orca.internal;

import com.fourthline.networking.NetworkEnvironment;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.sd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3813sd implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3599nd f35293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f35294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f35295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f35296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f35297e;

    public C3813sd(C3599nd c3599nd, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f35293a = c3599nd;
        this.f35294b = provider;
        this.f35295c = provider2;
        this.f35296d = provider3;
        this.f35297e = provider4;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC2891Je get() {
        return a(this.f35293a, (InterfaceC3051ak) this.f35294b.get(), (C3257fd) this.f35295c.get(), (NetworkEnvironment) this.f35296d.get(), (Gl) this.f35297e.get());
    }

    public static C3813sd a(C3599nd c3599nd, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new C3813sd(c3599nd, provider, provider2, provider3, provider4);
    }

    public static InterfaceC2891Je a(C3599nd c3599nd, InterfaceC3051ak interfaceC3051ak, C3257fd c3257fd, NetworkEnvironment networkEnvironment, Gl gl2) {
        return (InterfaceC2891Je) qj0.h.d(c3599nd.a(interfaceC3051ak, c3257fd, networkEnvironment, gl2));
    }
}
