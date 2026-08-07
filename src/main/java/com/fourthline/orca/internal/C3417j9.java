package com.fourthline.orca.internal;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.j9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3417j9 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K8 f32687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f32689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f32690d;

    public C3417j9(K8 k11, Provider provider, Provider provider2, Provider provider3) {
        this.f32687a = k11;
        this.f32688b = provider;
        this.f32689c = provider2;
        this.f32690d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wn0.a get() {
        return a(this.f32687a, (C4104z8) this.f32688b.get(), (Kp) this.f32689c.get(), (Context) this.f32690d.get());
    }

    public static C3417j9 a(K8 k11, Provider provider, Provider provider2, Provider provider3) {
        return new C3417j9(k11, provider, provider2, provider3);
    }

    public static wn0.a a(K8 k11, C4104z8 c4104z8, Kp kp2, Context context) {
        return (wn0.a) qj0.h.d(k11.a(c4104z8, kp2, context));
    }
}
