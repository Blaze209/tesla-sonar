package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Y implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O f29787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f29788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f29789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f29790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f29791e;

    public Y(O o11, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f29787a = o11;
        this.f29788b = provider;
        this.f29789c = provider2;
        this.f29790d = provider3;
        this.f29791e = provider4;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public F get() {
        return a(this.f29787a, (G) this.f29788b.get(), (Gi) this.f29789c.get(), (InterfaceC3732qh) this.f29790d.get(), (C3438jo) this.f29791e.get());
    }

    public static Y a(O o11, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new Y(o11, provider, provider2, provider3, provider4);
    }

    public static F a(O o11, G g11, Gi gi2, InterfaceC3732qh interfaceC3732qh, C3438jo c3438jo) {
        return (F) qj0.h.d(o11.a(g11, gi2, interfaceC3732qh, c3438jo));
    }
}
