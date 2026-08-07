package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.kd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3470kd implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3386id f32962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f32964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f32965d;

    public C3470kd(C3386id c3386id, Provider provider, Provider provider2, Provider provider3) {
        this.f32962a = c3386id;
        this.f32963b = provider;
        this.f32964c = provider2;
        this.f32965d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3343hd get() {
        return a(this.f32962a, (InterfaceC3863tk) this.f32963b.get(), (C4087ys) this.f32964c.get(), (InterfaceC3732qh) this.f32965d.get());
    }

    public static C3470kd a(C3386id c3386id, Provider provider, Provider provider2, Provider provider3) {
        return new C3470kd(c3386id, provider, provider2, provider3);
    }

    public static C3343hd a(C3386id c3386id, InterfaceC3863tk interfaceC3863tk, C4087ys c4087ys, InterfaceC3732qh interfaceC3732qh) {
        return (C3343hd) qj0.h.d(c3386id.a(interfaceC3863tk, c4087ys, interfaceC3732qh));
    }
}
