package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4069ya implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4026xa f36974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f36975b;

    public C4069ya(C4026xa c4026xa, Provider provider) {
        this.f36974a = c4026xa;
        this.f36975b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public W6 get() {
        return a(this.f36974a, (ou.m) this.f36975b.get());
    }

    public static C4069ya a(C4026xa c4026xa, Provider provider) {
        return new C4069ya(c4026xa, provider);
    }

    public static W6 a(C4026xa c4026xa, ou.m mVar) {
        return (W6) qj0.h.d(c4026xa.a(mVar));
    }
}
