package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.uj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3905uj implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3691pj f35921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f35922b;

    public C3905uj(C3691pj c3691pj, Provider provider) {
        this.f35921a = c3691pj;
        this.f35922b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Gj get() {
        return a(this.f35921a, (C3438jo) this.f35922b.get());
    }

    public static C3905uj a(C3691pj c3691pj, Provider provider) {
        return new C3905uj(c3691pj, provider);
    }

    public static Gj a(C3691pj c3691pj, C3438jo c3438jo) {
        return (Gj) qj0.h.d(c3691pj.a(c3438jo));
    }
}
