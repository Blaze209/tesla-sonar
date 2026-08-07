package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Cx implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ax f25285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f25287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f25288d;

    public Cx(Ax ax2, Provider provider, Provider provider2, Provider provider3) {
        this.f25285a = ax2;
        this.f25286b = provider;
        this.f25287c = provider2;
        this.f25288d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Hx get() {
        return a(this.f25285a, (C4135zx) this.f25286b.get(), (E6) this.f25287c.get(), ((Boolean) this.f25288d.get()).booleanValue());
    }

    public static Cx a(Ax ax2, Provider provider, Provider provider2, Provider provider3) {
        return new Cx(ax2, provider, provider2, provider3);
    }

    public static Hx a(Ax ax2, C4135zx c4135zx, E6 e11, boolean z11) {
        return (Hx) qj0.h.d(ax2.a(c4135zx, e11, z11));
    }
}
