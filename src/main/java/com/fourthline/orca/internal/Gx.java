package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Gx implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ax f26027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f26029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f26030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f26031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f26032f;

    public Gx(Ax ax2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f26027a = ax2;
        this.f26028b = provider;
        this.f26029c = provider2;
        this.f26030d = provider3;
        this.f26031e = provider4;
        this.f26032f = provider5;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Tx get() {
        return a(this.f26027a, (C4092yx) this.f26028b.get(), (Mx) this.f26029c.get(), (Sx) this.f26030d.get(), (C4087ys) this.f26031e.get(), (InterfaceC3732qh) this.f26032f.get());
    }

    public static Gx a(Ax ax2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new Gx(ax2, provider, provider2, provider3, provider4, provider5);
    }

    public static Tx a(Ax ax2, C4092yx c4092yx, Mx mx2, Sx sx2, C4087ys c4087ys, InterfaceC3732qh interfaceC3732qh) {
        return (Tx) qj0.h.d(ax2.a(c4092yx, mx2, sx2, c4087ys, interfaceC3732qh));
    }
}
