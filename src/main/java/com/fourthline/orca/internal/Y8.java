package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class Y8 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K8 f29844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f29845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f29846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f29847d;

    public Y8(K8 k11, Provider provider, Provider provider2, Provider provider3) {
        this.f29844a = k11;
        this.f29845b = provider;
        this.f29846c = provider2;
        this.f29847d = provider3;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3896ua get() {
        return a(this.f29844a, (C4061y8) this.f29845b.get(), (C3853ta) this.f29846c.get(), (C3553ma) this.f29847d.get());
    }

    public static Y8 a(K8 k11, Provider provider, Provider provider2, Provider provider3) {
        return new Y8(k11, provider, provider2, provider3);
    }

    public static C3896ua a(K8 k11, C4061y8 c4061y8, C3853ta c3853ta, C3553ma c3553ma) {
        return (C3896ua) qj0.h.d(k11.a(c4061y8, c3853ta, c3553ma));
    }
}
