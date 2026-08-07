package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.nu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3616nu implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f33996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f33997b;

    public C3616nu(C3146cu c3146cu, Provider provider) {
        this.f33996a = c3146cu;
        this.f33997b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3316gt get() {
        return a(this.f33996a, (C3438jo) this.f33997b.get());
    }

    public static C3616nu a(C3146cu c3146cu, Provider provider) {
        return new C3616nu(c3146cu, provider);
    }

    public static C3316gt a(C3146cu c3146cu, C3438jo c3438jo) {
        return (C3316gt) qj0.h.d(c3146cu.b(c3438jo));
    }
}
