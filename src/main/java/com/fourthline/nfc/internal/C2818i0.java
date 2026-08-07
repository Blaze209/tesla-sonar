package com.fourthline.nfc.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.nfc.internal.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2818i0 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2802a0 f24654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f24655b;

    public C2818i0(C2802a0 c2802a0, Provider provider) {
        this.f24654a = c2802a0;
        this.f24655b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public v0 get() {
        return a(this.f24654a, (K) this.f24655b.get());
    }

    public static C2818i0 a(C2802a0 c2802a0, Provider provider) {
        return new C2818i0(c2802a0, provider);
    }

    public static v0 a(C2802a0 c2802a0, K k11) {
        return (v0) qj0.h.d(c2802a0.a(k11));
    }
}
