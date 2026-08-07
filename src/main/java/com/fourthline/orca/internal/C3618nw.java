package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.nw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3618nw implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3489kw f34002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f34003b;

    public C3618nw(C3489kw c3489kw, Provider provider) {
        this.f34002a = c3489kw;
        this.f34003b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3617nv get() {
        return a(this.f34002a, (Vu) this.f34003b.get());
    }

    public static C3618nw a(C3489kw c3489kw, Provider provider) {
        return new C3618nw(c3489kw, provider);
    }

    public static InterfaceC3617nv a(C3489kw c3489kw, Vu vu2) {
        return (InterfaceC3617nv) qj0.h.d(c3489kw.a(vu2));
    }
}
