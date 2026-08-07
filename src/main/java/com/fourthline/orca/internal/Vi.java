package com.fourthline.orca.internal;

import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class Vi implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ti f29122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f29123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f29124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f29125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f29126e;

    public Vi(Ti ti2, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f29122a = ti2;
        this.f29123b = provider;
        this.f29124c = provider2;
        this.f29125d = provider3;
        this.f29126e = provider4;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Vf get() {
        return a(this.f29122a, (InterfaceC3051ak) this.f29123b.get(), (InterfaceC3414j6) this.f29124c.get(), this.f29125d, (CoroutineScope) this.f29126e.get());
    }

    public static Vi a(Ti ti2, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new Vi(ti2, provider, provider2, provider3, provider4);
    }

    public static Vf a(Ti ti2, InterfaceC3051ak interfaceC3051ak, InterfaceC3414j6 interfaceC3414j6, Provider provider, CoroutineScope coroutineScope) {
        return (Vf) qj0.h.d(ti2.a(interfaceC3051ak, interfaceC3414j6, provider, coroutineScope));
    }
}
