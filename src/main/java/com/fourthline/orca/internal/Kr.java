package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Kr implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Hr f26649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26650b;

    public Kr(Hr hr2, Provider provider) {
        this.f26649a = hr2;
        this.f26650b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3341hb get() {
        return a(this.f26649a, (C4104z8) this.f26650b.get());
    }

    public static Kr a(Hr hr2, Provider provider) {
        return new Kr(hr2, provider);
    }

    public static C3341hb a(Hr hr2, C4104z8 c4104z8) {
        return (C3341hb) qj0.h.d(hr2.a(c4104z8));
    }
}
