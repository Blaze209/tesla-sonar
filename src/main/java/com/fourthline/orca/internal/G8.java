package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class G8 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C8 f25913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f25915c;

    public G8(C8 c11, Provider provider, Provider provider2) {
        this.f25913a = c11;
        this.f25914b = provider;
        this.f25915c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4044xs get() {
        return a(this.f25913a, (C4087ys) this.f25914b.get(), (Uj) this.f25915c.get());
    }

    public static G8 a(C8 c11, Provider provider, Provider provider2) {
        return new G8(c11, provider, provider2);
    }

    public static InterfaceC4044xs a(C8 c11, C4087ys c4087ys, Uj uj2) {
        return (InterfaceC4044xs) qj0.h.d(c11.a(c4087ys, uj2));
    }
}
