package com.fourthline.vision.internal;

import javax.inject.Provider;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class A implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4319y f37619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f37620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f37621c;

    public A(C4319y c4319y, Provider provider, Provider provider2) {
        this.f37619a = c4319y;
        this.f37620b = provider;
        this.f37621c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4284t get() {
        return a(this.f37619a, (C4257p) this.f37620b.get(), (CoroutineContext) this.f37621c.get());
    }

    public static A a(C4319y c4319y, Provider provider, Provider provider2) {
        return new A(c4319y, provider, provider2);
    }

    public static C4284t a(C4319y c4319y, C4257p c4257p, CoroutineContext coroutineContext) {
        return (C4284t) qj0.h.d(c4319y.provideCameraFocusManager(c4257p, coroutineContext));
    }
}
