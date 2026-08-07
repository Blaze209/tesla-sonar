package com.fourthline.orca.internal;

import java.util.List;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.aq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3057aq implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sp f30464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f30465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f30466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f30467d;

    public C3057aq(Sp sp2, Provider provider, Provider provider2, Provider provider3) {
        this.f30464a = sp2;
        this.f30465b = provider;
        this.f30466c = provider2;
        this.f30467d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4085yq get() {
        return a(this.f30464a, (List) this.f30465b.get(), (InterfaceC4117zf) this.f30466c.get(), (KD) this.f30467d.get());
    }

    public static C3057aq a(Sp sp2, Provider provider, Provider provider2, Provider provider3) {
        return new C3057aq(sp2, provider, provider2, provider3);
    }

    public static C4085yq a(Sp sp2, List list, InterfaceC4117zf interfaceC4117zf, KD kd2) {
        return (C4085yq) qj0.h.d(sp2.a(list, interfaceC4117zf, kd2));
    }
}
