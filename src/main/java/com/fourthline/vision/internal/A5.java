package com.fourthline.vision.internal;

import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class A5 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4297u5 f37622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f37623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f37624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f37625d;

    public A5(C4297u5 c4297u5, Provider provider, Provider provider2, Provider provider3) {
        this.f37622a = c4297u5;
        this.f37623b = provider;
        this.f37624c = provider2;
        this.f37625d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public T2 get() {
        return a(this.f37622a, (CoroutineContext) this.f37623b.get(), (H2) this.f37624c.get(), (C4144a) this.f37625d.get());
    }

    public static A5 a(C4297u5 c4297u5, Provider provider, Provider provider2, Provider provider3) {
        return new A5(c4297u5, provider, provider2, provider3);
    }

    public static T2 a(C4297u5 c4297u5, CoroutineContext coroutineContext, H2 h11, C4144a c4144a) {
        return (T2) qj0.h.d(c4297u5.provideIsSteadyDataSource(coroutineContext, h11, c4144a));
    }
}
