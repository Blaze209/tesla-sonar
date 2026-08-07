package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Sc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2934Sc implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2909Nc f27773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27774b;

    public C2934Sc(C2909Nc c2909Nc, Provider provider) {
        this.f27773a = c2909Nc;
        this.f27774b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3737qm get() {
        return a(this.f27773a, (C3438jo) this.f27774b.get());
    }

    public static C2934Sc a(C2909Nc c2909Nc, Provider provider) {
        return new C2934Sc(c2909Nc, provider);
    }

    public static C3737qm a(C2909Nc c2909Nc, C3438jo c3438jo) {
        return (C3737qm) qj0.h.d(c2909Nc.a(c3438jo));
    }
}
