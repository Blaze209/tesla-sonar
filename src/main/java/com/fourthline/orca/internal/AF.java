package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class AF implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4025xF f24929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f24930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f24931c;

    public AF(C4025xF c4025xF, Provider provider, Provider provider2) {
        this.f24929a = c4025xF;
        this.f24930b = provider;
        this.f24931c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public X3 get() {
        return a(this.f24929a, (Il) this.f24930b.get(), (C3259ff) this.f24931c.get());
    }

    public static AF a(C4025xF c4025xF, Provider provider, Provider provider2) {
        return new AF(c4025xF, provider, provider2);
    }

    public static X3 a(C4025xF c4025xF, Il il2, C3259ff c3259ff) {
        return (X3) qj0.h.d(c4025xF.a(il2, c3259ff));
    }
}
