package com.fourthline.orca.internal;

import com.fourthline.networking.NetworkEnvironment;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.hF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3339hF implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3253fF f32253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32254b;

    public C3339hF(C3253fF c3253fF, Provider provider) {
        this.f32253a = c3253fF;
        this.f32254b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public NetworkEnvironment get() {
        return a(this.f32253a, (InterfaceC3051ak) this.f32254b.get());
    }

    public static C3339hF a(C3253fF c3253fF, Provider provider) {
        return new C3339hF(c3253fF, provider);
    }

    public static NetworkEnvironment a(C3253fF c3253fF, InterfaceC3051ak interfaceC3051ak) {
        return (NetworkEnvironment) qj0.h.d(c3253fF.c(interfaceC3051ak));
    }
}
