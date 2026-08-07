package com.fourthline.orca.internal;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.r4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3755r4 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3498l4 f34971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f34972b;

    public C3755r4(C3498l4 c3498l4, Provider provider) {
        this.f34971a = c3498l4;
        this.f34972b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public KD get() {
        return a(this.f34971a, (wn0.a) this.f34972b.get());
    }

    public static C3755r4 a(C3498l4 c3498l4, Provider provider) {
        return new C3755r4(c3498l4, provider);
    }

    public static KD a(C3498l4 c3498l4, wn0.a aVar) {
        return (KD) qj0.h.d(c3498l4.b(aVar));
    }
}
