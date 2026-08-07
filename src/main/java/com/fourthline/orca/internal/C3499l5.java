package com.fourthline.orca.internal;

import java.util.List;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.l5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3499l5 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3286g5 f33221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f33222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f33223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f33224d;

    public C3499l5(C3286g5 c3286g5, Provider provider, Provider provider2, Provider provider3) {
        this.f33221a = c3286g5;
        this.f33222b = provider;
        this.f33223c = provider2;
        this.f33224d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3714q5 get() {
        return a(this.f33221a, (F4) this.f33222b.get(), (InterfaceC3029a4) this.f33223c.get(), (List) this.f33224d.get());
    }

    public static C3499l5 a(C3286g5 c3286g5, Provider provider, Provider provider2, Provider provider3) {
        return new C3499l5(c3286g5, provider, provider2, provider3);
    }

    public static C3714q5 a(C3286g5 c3286g5, F4 f11, InterfaceC3029a4 interfaceC3029a4, List list) {
        return (C3714q5) qj0.h.d(c3286g5.a(f11, interfaceC3029a4, list));
    }
}
