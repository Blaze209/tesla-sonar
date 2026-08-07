package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.yu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4089yu implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f37117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f37118b;

    public C4089yu(C3146cu c3146cu, Provider provider) {
        this.f37117a = c3146cu;
        this.f37118b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3147cv get() {
        return a(this.f37117a, (C3187dt) this.f37118b.get());
    }

    public static C4089yu a(C3146cu c3146cu, Provider provider) {
        return new C4089yu(c3146cu, provider);
    }

    public static InterfaceC3147cv a(C3146cu c3146cu, C3187dt c3187dt) {
        return (InterfaceC3147cv) qj0.h.d(c3146cu.b(c3187dt));
    }
}
