package com.fourthline.orca.internal;

import java.util.List;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.hq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3356hq implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sp f32342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f32344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f32345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f32346e;

    public C3356hq(Sp sp2, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f32342a = sp2;
        this.f32343b = provider;
        this.f32344c = provider2;
        this.f32345d = provider3;
        this.f32346e = provider4;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3869tq get() {
        return a(this.f32342a, (List) this.f32343b.get(), (C4104z8) this.f32344c.get(), (Kp) this.f32345d.get(), (KD) this.f32346e.get());
    }

    public static C3356hq a(Sp sp2, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new C3356hq(sp2, provider, provider2, provider3, provider4);
    }

    public static InterfaceC3869tq a(Sp sp2, List list, C4104z8 c4104z8, Kp kp2, KD kd2) {
        return (InterfaceC3869tq) qj0.h.d(sp2.a(list, c4104z8, kp2, kd2));
    }
}
