package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.vr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3957vr implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3357hr f36283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f36284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f36285c;

    public C3957vr(C3357hr c3357hr, Provider provider, Provider provider2) {
        this.f36283a = c3357hr;
        this.f36284b = provider;
        this.f36285c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3228er get() {
        return a(this.f36283a, (wn0.a) this.f36284b.get(), (C4104z8) this.f36285c.get());
    }

    public static C3957vr a(C3357hr c3357hr, Provider provider, Provider provider2) {
        return new C3957vr(c3357hr, provider, provider2);
    }

    public static C3228er a(C3357hr c3357hr, wn0.a aVar, C4104z8 c4104z8) {
        return (C3228er) qj0.h.d(c3357hr.a(aVar, c4104z8));
    }
}
