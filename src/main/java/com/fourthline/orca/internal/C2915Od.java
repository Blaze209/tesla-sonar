package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Od, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2915Od implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2905Md f27162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27163b;

    public C2915Od(C2905Md c2905Md, Provider provider) {
        this.f27162a = c2905Md;
        this.f27163b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC2930Rd get() {
        return a(this.f27162a, (C2899Lc) this.f27163b.get());
    }

    public static C2915Od a(C2905Md c2905Md, Provider provider) {
        return new C2915Od(c2905Md, provider);
    }

    public static InterfaceC2930Rd a(C2905Md c2905Md, C2899Lc c2899Lc) {
        return (InterfaceC2930Rd) qj0.h.d(c2905Md.a(c2899Lc));
    }
}
