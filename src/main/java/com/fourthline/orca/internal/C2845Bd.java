package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Bd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2845Bd implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4072yd f25090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f25091b;

    public C2845Bd(C4072yd c4072yd, Provider provider) {
        this.f25090a = c4072yd;
        this.f25091b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3947vi get() {
        return a(this.f25090a, (Uj) this.f25091b.get());
    }

    public static C2845Bd a(C4072yd c4072yd, Provider provider) {
        return new C2845Bd(c4072yd, provider);
    }

    public static InterfaceC3947vi a(C4072yd c4072yd, Uj uj2) {
        return (InterfaceC3947vi) qj0.h.d(c4072yd.a(uj2));
    }
}
