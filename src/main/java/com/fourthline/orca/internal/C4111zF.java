package com.fourthline.orca.internal;

import com.fourthline.networking.NetworkEnvironment;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.zF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4111zF implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4025xF f37244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f37245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f37246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f37247d;

    public C4111zF(C4025xF c4025xF, Provider provider, Provider provider2, Provider provider3) {
        this.f37244a = c4025xF;
        this.f37245b = provider;
        this.f37246c = provider2;
        this.f37247d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3645og get() {
        return a(this.f37244a, (NetworkEnvironment) this.f37245b.get(), this.f37246c, this.f37247d);
    }

    public static C4111zF a(C4025xF c4025xF, Provider provider, Provider provider2, Provider provider3) {
        return new C4111zF(c4025xF, provider, provider2, provider3);
    }

    public static InterfaceC3645og a(C4025xF c4025xF, NetworkEnvironment networkEnvironment, Provider provider, Provider provider2) {
        return (InterfaceC3645og) qj0.h.d(c4025xF.a(networkEnvironment, provider, provider2));
    }
}
