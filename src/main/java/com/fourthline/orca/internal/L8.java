package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class L8 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K8 f26743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f26744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f26745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f26746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f26747e;

    public L8(K8 k11, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f26743a = k11;
        this.f26744b = provider;
        this.f26745c = provider2;
        this.f26746d = provider3;
        this.f26747e = provider4;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ED get() {
        return a(this.f26743a, (C3931v8) this.f26744b.get(), (C3803s9) this.f26745c.get(), (Vf) this.f26746d.get(), (C3846t9) this.f26747e.get());
    }

    public static L8 a(K8 k11, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new L8(k11, provider, provider2, provider3, provider4);
    }

    public static ED a(K8 k11, C3931v8 c3931v8, C3803s9 c3803s9, Vf vf2, C3846t9 c3846t9) {
        return (ED) qj0.h.d(k11.a(c3931v8, c3803s9, vf2, c3846t9));
    }
}
