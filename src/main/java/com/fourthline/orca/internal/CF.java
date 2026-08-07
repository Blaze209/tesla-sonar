package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class CF implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4025xF f25198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25199b;

    public CF(C4025xF c4025xF, Provider provider) {
        this.f25198a = c4025xF;
        this.f25199b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wn0.a get() {
        return a(this.f25198a, (C3765rE) this.f25199b.get());
    }

    public static CF a(C4025xF c4025xF, Provider provider) {
        return new CF(c4025xF, provider);
    }

    public static wn0.a a(C4025xF c4025xF, C3765rE c3765rE) {
        return (wn0.a) qj0.h.d(c4025xF.a(c3765rE));
    }
}
