package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Bx implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ax f25144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25145b;

    public Bx(Ax ax2, Provider provider) {
        this.f25144a = ax2;
        this.f25145b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3963vx get() {
        return a(this.f25144a, (InterfaceC3051ak) this.f25145b.get());
    }

    public static Bx a(Ax ax2, Provider provider) {
        return new Bx(ax2, provider);
    }

    public static C3963vx a(Ax ax2, InterfaceC3051ak interfaceC3051ak) {
        return (C3963vx) qj0.h.d(ax2.a(interfaceC3051ak));
    }
}
