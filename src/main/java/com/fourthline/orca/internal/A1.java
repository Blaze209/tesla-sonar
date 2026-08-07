package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class A1 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4097z1 f24885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f24886b;

    public A1(C4097z1 c4097z1, Provider provider) {
        this.f24885a = c4097z1;
        this.f24886b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Y0 get() {
        return a(this.f24885a, (C3438jo) this.f24886b.get());
    }

    public static A1 a(C4097z1 c4097z1, Provider provider) {
        return new A1(c4097z1, provider);
    }

    public static Y0 a(C4097z1 c4097z1, C3438jo c3438jo) {
        return (Y0) qj0.h.d(c4097z1.a(c3438jo));
    }
}
