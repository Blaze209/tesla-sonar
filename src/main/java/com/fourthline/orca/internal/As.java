package com.fourthline.orca.internal;

import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class As implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4130zs f25025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f25027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f25028d;

    public As(C4130zs c4130zs, Provider provider, Provider provider2, Provider provider3) {
        this.f25025a = c4130zs;
        this.f25026b = provider;
        this.f25027c = provider2;
        this.f25028d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4087ys get() {
        return a(this.f25025a, (Bs) this.f25026b.get(), (C3785rs) this.f25027c.get(), (CoroutineScope) this.f25028d.get());
    }

    public static As a(C4130zs c4130zs, Provider provider, Provider provider2, Provider provider3) {
        return new As(c4130zs, provider, provider2, provider3);
    }

    public static C4087ys a(C4130zs c4130zs, Bs bs2, C3785rs c3785rs, CoroutineScope coroutineScope) {
        return (C4087ys) qj0.h.d(c4130zs.a(bs2, c3785rs, coroutineScope));
    }
}
