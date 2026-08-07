package com.fourthline.orca.internal;

import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class I1 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4097z1 f26177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f26179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f26180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f26181e;

    public I1(C4097z1 c4097z1, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f26177a = c4097z1;
        this.f26178b = provider;
        this.f26179c = provider2;
        this.f26180d = provider3;
        this.f26181e = provider4;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3283g2 get() {
        return a(this.f26177a, (wn0.a) this.f26178b.get(), (W0) this.f26179c.get(), (InterfaceC3839t2) this.f26180d.get(), (CoroutineScope) this.f26181e.get());
    }

    public static I1 a(C4097z1 c4097z1, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new I1(c4097z1, provider, provider2, provider3, provider4);
    }

    public static C3283g2 a(C4097z1 c4097z1, wn0.a aVar, W0 w11, InterfaceC3839t2 interfaceC3839t2, CoroutineScope coroutineScope) {
        return (C3283g2) qj0.h.d(c4097z1.a(aVar, w11, interfaceC3839t2, coroutineScope));
    }
}
