package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.wu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4003wu implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f36598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f36599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f36600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f36601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f36602e;

    public C4003wu(C3146cu c3146cu, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f36598a = c3146cu;
        this.f36599b = provider;
        this.f36600c = provider2;
        this.f36601d = provider3;
        this.f36602e = provider4;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3991wi get() {
        return a(this.f36598a, (C3092bi) this.f36599b.get(), (C3061au) this.f36600c.get(), (Yu) this.f36601d.get(), (C3991wi.c) this.f36602e.get());
    }

    public static C4003wu a(C3146cu c3146cu, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new C4003wu(c3146cu, provider, provider2, provider3, provider4);
    }

    public static C3991wi a(C3146cu c3146cu, C3092bi c3092bi, C3061au c3061au, Yu yu2, C3991wi.c cVar) {
        return (C3991wi) qj0.h.d(c3146cu.a(c3092bi, c3061au, yu2, cVar));
    }
}
