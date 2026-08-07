package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class D8 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C8 f25318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25319b;

    public D8(C8 c11, Provider provider) {
        this.f25318a = c11;
        this.f25319b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Pi get() {
        return a(this.f25318a, (C4061y8) this.f25319b.get());
    }

    public static D8 a(C8 c11, Provider provider) {
        return new D8(c11, provider);
    }

    public static Pi a(C8 c11, C4061y8 c4061y8) {
        return (Pi) qj0.h.d(c11.a(c4061y8));
    }
}
