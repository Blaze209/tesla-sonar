package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3922v implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3152d f35979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f35980b;

    public C3922v(C3152d c3152d, Provider provider) {
        this.f35979a = c3152d;
        this.f35980b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3955vp get() {
        return a(this.f35979a, (InterfaceC3051ak) this.f35980b.get());
    }

    public static C3922v a(C3152d c3152d, Provider provider) {
        return new C3922v(c3152d, provider);
    }

    public static InterfaceC3955vp a(C3152d c3152d, InterfaceC3051ak interfaceC3051ak) {
        return (InterfaceC3955vp) qj0.h.d(c3152d.a(interfaceC3051ak));
    }
}
