package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Ex implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ax f25673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f25675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f25676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f25677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f25678f;

    public Ex(Ax ax2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f25673a = ax2;
        this.f25674b = provider;
        this.f25675c = provider2;
        this.f25676d = provider3;
        this.f25677e = provider4;
        this.f25678f = provider5;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Qx get() {
        return a(this.f25673a, (InterfaceC3863tk) this.f25674b.get(), (Fp) this.f25675c.get(), (C4087ys) this.f25676d.get(), (Uj) this.f25677e.get(), (InterfaceC3732qh) this.f25678f.get());
    }

    public static Ex a(Ax ax2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new Ex(ax2, provider, provider2, provider3, provider4, provider5);
    }

    public static Qx a(Ax ax2, InterfaceC3863tk interfaceC3863tk, Fp fp2, C4087ys c4087ys, Uj uj2, InterfaceC3732qh interfaceC3732qh) {
        return (Qx) qj0.h.d(ax2.a(interfaceC3863tk, fp2, c4087ys, uj2, interfaceC3732qh));
    }
}
