package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class CB implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BB f25192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25193b;

    public CB(BB bb2, Provider provider) {
        this.f25192a = bb2;
        this.f25193b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public YA get() {
        return a(this.f25192a, (InterfaceC3051ak) this.f25193b.get());
    }

    public static CB a(BB bb2, Provider provider) {
        return new CB(bb2, provider);
    }

    public static YA a(BB bb2, InterfaceC3051ak interfaceC3051ak) {
        return (YA) qj0.h.d(bb2.a(interfaceC3051ak));
    }
}
